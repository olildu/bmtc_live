package app.chalo.home.ui.history;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.data.BookingsRequestType;
import app.chalo.data.ChaloTextDataAppModel;
import app.chalo.data.GridWidgetDataKt;
import app.chalo.data.TextStyleAppModel;
import app.chalo.domain.DoesUserHaveProductsOnMultipleDeviceUseCase;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.features.chalotime.ChaloTimeProvider;
import app.chalo.features.foreground.ApplicationForegroundManager;
import app.chalo.features.foreground.ForegroundListener;
import app.chalo.features.reportproblem.IReportProblemFeature;
import app.chalo.home.analytics.HomeScreenAnalyticsHelper;
import app.chalo.home.contract.HomeScreenInfoHelper;
import app.chalo.home.domain.ActivateProductIfRequiredUseCase;
import app.chalo.home.domain.ActivationCheckSuccessRemarks;
import app.chalo.home.domain.AutoLinkDeviceIdUseCase;
import app.chalo.home.domain.ChaloUserBookingType;
import app.chalo.home.domain.FetchAndStoreProductConfigByIdUseCase;
import app.chalo.home.domain.FetchHistoryScreenConfigDataUseCase;
import app.chalo.home.domain.GetAllRequestedBookedProductsUseCase;
import app.chalo.home.domain.GetAllRequestedBookedProductsUseCaseKt;
import app.chalo.home.domain.GetNextStepOnPassApplicationRejectedUseCase;
import app.chalo.home.domain.GetNextStepOnPassApplicationVerifiedUseCase;
import app.chalo.home.domain.ProcessRejectedPassApplicationForNextStep;
import app.chalo.home.domain.ProcessVerifiedPassApplicationForNextStep;
import app.chalo.home.domain.ProductActivationFailureReason;
import app.chalo.home.domain.RunPreActivationChecksUseCase;
import app.chalo.home.domain.UserBookingsRequestType;
import app.chalo.home.ui.HomeTabScreensNavigationAndStateManager;
import app.chalo.home.ui.HomeTabScreensRetainedState;
import app.chalo.home.ui.base.HomeTabVisibilityController;
import app.chalo.home.ui.common.VisibleJobTracker;
import app.chalo.home.ui.history.MyTicketsDataState;
import app.chalo.home.ui.history.TicketsPageErrorImage;
import app.chalo.home.ui.history.TicketsPageInfoBottomSheetData;
import app.chalo.home.ui.history.TicketsPageInfoBottomSheetPositiveCtaType;
import app.chalo.home.ui.history.TicketsScreenBottomSheetType;
import app.chalo.home.ui.history.factory.CtaClickedType;
import app.chalo.home.ui.history.factory.MyTicketsUiStateFactory;
import app.chalo.home.ui.history.uistate.MyTicketFloatingButtonUiState;
import app.chalo.home.ui.history.uistate.MyTicketsLoginNudgeUIState;
import app.chalo.home.ui.history.uistate.ProductReclaimUiState;
import app.chalo.home.ui.history.uistate.TicketsFloatingButtonContainerUiState;
import app.chalo.homescreen.data.model.app.BottomNavTabType;
import app.chalo.homescreen.data.model.app.ItemTextDataAppModel;
import app.chalo.homescreen.data.model.app.TabMetaDataAppModel;
import app.chalo.homescreen.data.model.app.TicketsPageFeature;
import app.chalo.homescreen.data.model.app.TicketsPassesSectionWidgetAppModel;
import app.chalo.homescreen.data.model.app.TicketsTabHooksCardSectionData;
import app.chalo.instantticket.data.model.app.InstantTicketAppModel;
import app.chalo.metro.data.app.MetroTicketAppModel;
import app.chalo.metro.domain.FetchAndStoreMetroLiveBookingStatusUseCase;
import app.chalo.models.BookableSuperPassConfiguration;
import app.chalo.models.SuperPassSubTypes;
import app.chalo.models.mticketing.MTicket;
import app.chalo.models.mticketing.MTicketConfiguration;
import app.chalo.models.mticketing.MTicketUtilsHelper;
import app.chalo.models.products.SuperPassRideBookingAppModel;
import app.chalo.models.validation.BleValidationArgs;
import app.chalo.models.validation.ValidationProcessFlowDetails;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.multimodalticket.data.model.app.MultiModalGroupTicketAppModel;
import app.chalo.multimodalticket.data.model.app.MultiModalGroupTicketChildAppModel;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.network.config.ChaloJson;
import app.chalo.ondc.model.app.OndcMetroTicketAppModel;
import app.chalo.ondc.model.app.OndcTicketAppModel;
import app.chalo.permissions.handler.PermissionHandlerProvider;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketBookingPropertiesAppModel;
import app.chalo.premiumbus.domain.GetPremiumReserveTicketByIdUseCase;
import app.chalo.premiumbus.domains.CheckIfContinueWithBulkBookingFlowUseCase;
import app.chalo.premiumbus.prebookedtickets.domain.GetActivePremiumReserveTicketBetweenGivenTimeUseCase;
import app.chalo.premiumbus.prebookedtickets.domain.GetProductConfigInfoForPremiumBusProductIfActiveUseCase;
import app.chalo.productpurchase.utils.BookingHelper;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.LoginOptionsArgs;
import app.chalo.scenes.args.PbBulkBookingRideDetailsArgs;
import app.chalo.scenes.args.PostPassPurchaseSuccessFlowType;
import app.chalo.scenes.args.PremiumBusActivationArgs;
import app.chalo.scenes.args.ProductActivationArgs;
import app.chalo.scenes.args.ProductSelectionArgs;
import app.chalo.scenes.args.SceneArgs;
import app.chalo.scenes.args.SuperPassPurchaseArgs;
import app.chalo.scenes.args.TitoRideDetailsArgs;
import app.chalo.scenes.args.TripSummaryArgs;
import app.chalo.scenes.args.WebViewArgs;
import app.chalo.superpass.data.models.entities.MagicSuperPass;
import app.chalo.superpass.data.models.entities.PassApplicationActionRequired;
import app.chalo.superpass.data.models.entities.PassApplicationRejectionReasons;
import app.chalo.superpass.data.models.entities.RideBasedSuperPass;
import app.chalo.superpass.data.models.entities.RideBasedSuperPassUIProperties;
import app.chalo.superpass.data.models.entities.SuperPass;
import app.chalo.superpass.data.models.entities.SuperPassApplication;
import app.chalo.superpass.data.models.entities.SuperPassProperties;
import app.chalo.superpass.data.models.entities.SuperPassRepurchaseProperties;
import app.chalo.superpass.data.models.entities.SuperPassSubType;
import app.chalo.superpass.data.models.entities.SuperPassTransactionDetails;
import app.chalo.superpass.data.models.entities.SuperPassUserDetails;
import app.chalo.tito.domain.GetActiveTitoTripsAndUpdateRestUseCase;
import app.chalo.titoridedetail.data.app.TITOValidationAppModel;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.button.ButtonUIStateFactory;
import app.chalo.uistate.dialog.ConfirmationDialogActionCtaContainerUiState;
import app.chalo.uistate.dialog.ConfirmationDialogUiState;
import app.chalo.uistate.dialog.DialogDismissRequest;
import app.chalo.uistate.dialog.DialogUIEventHandler;
import app.chalo.uistate.dialog.DialogUIStateFactory;
import app.chalo.uistate.dialog.DialogueCtaUiState;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.error.ErrorWithMsgAndRetryUISpecs;
import app.chalo.uistate.error.StandardErrorScreenUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.ChaloTextStyleHelper;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.usecase.BookableProductConfigForRenewFailureReason;
import app.chalo.usecase.BookableProductConfigForRenewSuccessType;
import app.chalo.usecase.GetBookableProductConfigForRenewUseCase;
import app.chalo.usecase.GetTimeInMillisAfterXTimeUseCase;
import app.chalo.usecase.GetValidationProcessFlowDetailsForValidationProductUseCase;
import app.chalo.usecase.InitiateProductHistorySyncCallUseCase;
import app.chalo.usecase.IsNotificationPermissionGrantedUseCase;
import app.chalo.userprofile.UserProfileAppModel;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.utils.PlatformFeature;
import app.chalo.utils.SystemHelper;
import app.chalo.utils.timeutil.TimeUtilsContract;
import app.chalo.validationsdk.blevalidation.domain.ValidationSceneResolverUseCase;
import app.chalo.walletframework.quickpay.data.model.appmodel.QuickPayAppModel;
import app.chalo.walletframework.quickpay.data.model.appmodel.QuickPayAppModelKt;
import app.zophop.homescreen.MyTicketsViewState;
import com.arkivanov.decompose.ComponentContext;
import defpackage.ej0;
import defpackage.hq0;
import defpackage.jk0;
import defpackage.lj0;
import defpackage.n3;
import defpackage.o3;
import defpackage.qk0;
import defpackage.rk0;
import defpackage.sk0;
import defpackage.tk0;
import defpackage.vo1;
import defpackage.wi0;
import defpackage.xg;
import io.ktor.http.URLBuilder;
import io.ktor.http.URLParserException;
import io.ktor.http.URLParserKt;
import io.ktor.http.URLProtocol;
import io.ktor.http.Url;
import io.ktor.http.UrlDecodedParametersBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/home/ui/history/MyTicketsComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent;", "Lapp/chalo/home/ui/history/MyTicketsDataState;", "Lapp/zophop/homescreen/MyTicketsViewState;", "Lapp/chalo/home/ui/history/MyTicketsSideEffect;", "PendingUseNowContext", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MyTicketsComponent extends ChaloBaseStateMviComponent<MyTicketsViewIntent, MyTicketsDataState, MyTicketsViewState, MyTicketsSideEffect> {
    public final GetBookableProductConfigForRenewUseCase A;
    public final ChaloTimeProvider B;
    public final GetProductConfigInfoForPremiumBusProductIfActiveUseCase C;
    public final GetPremiumReserveTicketByIdUseCase D;
    public final HomeScreenAnalyticsHelper E;
    public final FetchHistoryScreenConfigDataUseCase F;
    public final GetActiveTitoTripsAndUpdateRestUseCase G;
    public final CoroutineContextProvider H;
    public final IsNotificationPermissionGrantedUseCase I;
    public final MyTicketsUiStateFactory J;
    public final FetchAndStoreProductConfigByIdUseCase K;
    public final GetNextStepOnPassApplicationVerifiedUseCase L;
    public final GetNextStepOnPassApplicationRejectedUseCase M;
    public final BookingHelper N;
    public final KotlinToastManager O;
    public final PermissionHandlerProvider P;
    public final ChaloNavigationManager Q;
    public final HomeTabScreensNavigationAndStateManager R;
    public final IReportProblemFeature S;
    public final SystemHelper T;
    public final ValidationSceneResolverUseCase U;
    public final FetchAndStoreMetroLiveBookingStatusUseCase V;
    public final BottomNavTabType W;
    public final MTicketUtilsHelper X;
    public final ApplicationForegroundManager Y;
    public final MutexImpl Z;
    public final ArrayList a0;
    public Job b0;
    public Job c0;
    public final MutableStateFlow d0;
    public final StateFlow e0;
    public PendingUseNowContext f0;
    public MyTicketsComponent$registerNotificationSettingsForegroundListener$listener$1 g0;
    public Job h0;
    public boolean i0;
    public final VisibleJobTracker j0;
    public final BasicInfoContract k;
    public int k0;
    public final GetAllRequestedBookedProductsUseCase l;
    public boolean l0;
    public final CityProvider m;
    public boolean m0;
    public final HomeScreenInfoHelper n;
    public boolean n0;
    public final TimeUtilsContract o;
    public final Flow o0;
    public final GetTimeInMillisAfterXTimeUseCase p;
    public final MutableStateFlow p0;
    public final GetActivePremiumReserveTicketBetweenGivenTimeUseCase q;
    public final StateFlow q0;
    public final StringProvider r;
    public final Lazy r0;
    public final AutoLinkDeviceIdUseCase s;
    public final Lazy s0;
    public final UserProfileDetailsProvider t;
    public final Lazy t0;
    public final ChaloConfigFeature u;
    public final Lazy u0;
    public final DoesUserHaveProductsOnMultipleDeviceUseCase v;
    public final Lazy v0;
    public final InitiateProductHistorySyncCallUseCase w;
    public final Lazy w0;
    public final RunPreActivationChecksUseCase x;
    public final ActivateProductIfRequiredUseCase y;
    public final GetValidationProcessFlowDetailsForValidationProductUseCase z;

    /* JADX INFO: renamed from: app.chalo.home.ui.history.MyTicketsComponent$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.home.ui.history.MyTicketsComponent$1", f = "MyTicketsComponent.kt", l = {251}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return MyTicketsComponent.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                StateFlow state = MyTicketsComponent.this.R.getState();
                final MyTicketsComponent myTicketsComponent = MyTicketsComponent.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.home.ui.history.MyTicketsComponent.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        Object value;
                        HomeTabScreensRetainedState homeTabScreensRetainedState = (HomeTabScreensRetainedState) obj2;
                        xg xgVar = new xg(homeTabScreensRetainedState, 2);
                        MyTicketsComponent myTicketsComponent2 = myTicketsComponent;
                        myTicketsComponent2.E0(xgVar);
                        Integer num = (Integer) homeTabScreensRetainedState.g.get(myTicketsComponent2.W);
                        int iIntValue = num != null ? num.intValue() : 0;
                        if (iIntValue != myTicketsComponent2.k0) {
                            myTicketsComponent2.k0 = iIntValue;
                            myTicketsComponent2.l0 = true;
                            myTicketsComponent2.m0 = true;
                            MutableStateFlow mutableStateFlow = myTicketsComponent2.p0;
                            do {
                                value = mutableStateFlow.getValue();
                            } while (!mutableStateFlow.c(value, Integer.valueOf(((Number) value).intValue() + 1)));
                            if (myTicketsComponent2.i0) {
                                myTicketsComponent2.m0 = false;
                                myTicketsComponent2.q1(MyTicketsViewIntent.TicketsScreenViewStoppedIntent.f3440a);
                                myTicketsComponent2.q1(MyTicketsViewIntent.TicketsScreenViewStartedIntent.f3439a);
                            }
                        }
                        return Unit.f17538a;
                    }
                };
                this.label = 1;
                if (state.collect(flowCollector, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lapp/chalo/home/ui/history/MyTicketsComponent$Companion;", "", "", "QUERY_PARAM_USER_NAME", "Ljava/lang/String;", "QUERY_PARAM_MOBILE_NO", "", "TICKET_PASS_HISTORY_DURATION_IN_MONTHS", "I", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/MyTicketsComponent$PendingUseNowContext;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PendingUseNowContext {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChaloUserBookingType f3393a;
        public final boolean b;

        public PendingUseNowContext(ChaloUserBookingType bookingType, boolean z) {
            Intrinsics.i(bookingType, "bookingType");
            this.f3393a = bookingType;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PendingUseNowContext)) {
                return false;
            }
            PendingUseNowContext pendingUseNowContext = (PendingUseNowContext) obj;
            return Intrinsics.d(this.f3393a, pendingUseNowContext.f3393a) && this.b == pendingUseNowContext.b;
        }

        public final int hashCode() {
            return (this.f3393a.hashCode() * 31) + (this.b ? 1231 : 1237);
        }

        public final String toString() {
            return "PendingUseNowContext(bookingType=" + this.f3393a + ", isPremiumBus=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3394a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;
        public static final /* synthetic */ int[] d;
        public static final /* synthetic */ int[] e;
        public static final /* synthetic */ int[] f;
        public static final /* synthetic */ int[] g;

        static {
            int[] iArr = new int[TicketsPageFeature.values().length];
            try {
                iArr[TicketsPageFeature.PRODUCT_PURCHASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TicketsPageFeature.REGULAR_BUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TicketsPageFeature.CHALO_BUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TicketsPageFeature.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f3394a = iArr;
            int[] iArr2 = new int[ActivationCheckSuccessRemarks.values().length];
            try {
                iArr2[ActivationCheckSuccessRemarks.PRODUCT_ACTIVATION_POSSIBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ActivationCheckSuccessRemarks.PRODUCT_ACTIVATION_NOT_REQUIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ActivationCheckSuccessRemarks.PRODUCT_ACTIVATION_ALREADY_DONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ActivationCheckSuccessRemarks.PRODUCT_TAPPED_IN.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            b = iArr2;
            int[] iArr3 = new int[TicketsPageInfoBottomSheetNegativeCtaType.values().length];
            try {
                iArr3[TicketsPageInfoBottomSheetNegativeCtaType.PRICE_CHANGED.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[TicketsPageInfoBottomSheetNegativeCtaType.DOCUMENT_VALIDITY_EXPIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[TicketsPageInfoBottomSheetNegativeCtaType.PRODUCT_USE.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            c = iArr3;
            int[] iArr4 = new int[TicketsPageInfoBottomSheetPositiveCtaType.values().length];
            try {
                iArr4[TicketsPageInfoBottomSheetPositiveCtaType.TICKET_USE.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[TicketsPageInfoBottomSheetPositiveCtaType.PASS_USE.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[TicketsPageInfoBottomSheetPositiveCtaType.PRICE_CHANGED.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[TicketsPageInfoBottomSheetPositiveCtaType.BOOKABLE_CONFIG_INACTIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[TicketsPageInfoBottomSheetPositiveCtaType.DOCUMENT_VALIDITY_EXPIRED.ordinal()] = 5;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[TicketsPageInfoBottomSheetPositiveCtaType.PRODUCT_CONFIG_UNAVAILABLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[TicketsPageInfoBottomSheetPositiveCtaType.PRODUCT_CONFIG_CATCHING.ordinal()] = 7;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[TicketsPageInfoBottomSheetPositiveCtaType.PRODUCT_CONFIG_FETCH_FAILED.ordinal()] = 8;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[TicketsPageInfoBottomSheetPositiveCtaType.PROOF_REQUIRED.ordinal()] = 9;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr4[TicketsPageInfoBottomSheetPositiveCtaType.TICKET_CONFIG_UNAVAILABLE.ordinal()] = 10;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr4[TicketsPageInfoBottomSheetPositiveCtaType.TICKET_NOT_FOUND.ordinal()] = 11;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr4[TicketsPageInfoBottomSheetPositiveCtaType.NO_MORE_RIDES_AVAILABLE.ordinal()] = 12;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr4[TicketsPageInfoBottomSheetPositiveCtaType.NO_MORE_RIDES_AVAILABLE_TODAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr4[TicketsPageInfoBottomSheetPositiveCtaType.HAILING_NOT_SUPPORTED.ordinal()] = 14;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr4[TicketsPageInfoBottomSheetPositiveCtaType.PRODUCT_IN_APP_RECLAIM.ordinal()] = 15;
            } catch (NoSuchFieldError unused26) {
            }
            d = iArr4;
            int[] iArr5 = new int[TicketsPageLayoutType.values().length];
            try {
                iArr5[TicketsPageLayoutType.NOTIFICATION_TURN_ON_EXPLAINER.ordinal()] = 1;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr5[TicketsPageLayoutType.TICKETS_PASSES_SECTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused28) {
            }
            e = iArr5;
            int[] iArr6 = new int[CtaClickedType.values().length];
            try {
                iArr6[CtaClickedType.USE_OR_TRACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr6[CtaClickedType.USE_OR_TRACK_PREMIUM_BUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr6[CtaClickedType.BOOK_AGAIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr6[CtaClickedType.VIEW_SUMMARY.ordinal()] = 4;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr6[CtaClickedType.BANNER_CTA.ordinal()] = 5;
            } catch (NoSuchFieldError unused33) {
            }
            f = iArr6;
            int[] iArr7 = new int[SuperPassSubType.values().length];
            try {
                iArr7[SuperPassSubType.MAGIC_SUPER_PASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr7[SuperPassSubType.RIDE_BASED_SUPER_PASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused35) {
            }
            g = iArr7;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyTicketsComponent(ComponentContext componentContext, BasicInfoContract basicInfoContract, GetAllRequestedBookedProductsUseCase getAllRequestedBookedProductsUseCase, CityProvider cityProvider, HomeScreenInfoHelper homeScreenInfoHelper, TimeUtilsContract timeUtilsContract, GetTimeInMillisAfterXTimeUseCase getTimeInMillisAfterXTimeUseCase, GetActivePremiumReserveTicketBetweenGivenTimeUseCase getActivePremiumReserveTicketBetweenGivenTimeUseCase, StringProvider stringProvider, AutoLinkDeviceIdUseCase autoLinkDeviceIdUseCase, UserProfileDetailsProvider userProfileDetailsProvider, ChaloConfigFeature chaloConfigFeature, DoesUserHaveProductsOnMultipleDeviceUseCase doesUserHaveProductsOnMultipleDeviceUseCase, InitiateProductHistorySyncCallUseCase initiateProductHistorySyncCallUseCase, RunPreActivationChecksUseCase runPreActivationChecksUseCase, ActivateProductIfRequiredUseCase activateProductIfRequiredUseCase, GetValidationProcessFlowDetailsForValidationProductUseCase getValidationProcessFlowDetailsForValidationProductUseCase, GetBookableProductConfigForRenewUseCase getBookableProductConfigForRenewUseCase, ChaloTimeProvider chaloTimeProvider, GetProductConfigInfoForPremiumBusProductIfActiveUseCase getProductConfigInfoForPremiumBusProductIfActiveUseCase, GetPremiumReserveTicketByIdUseCase getPremiumReserveTicketByIdUseCase, HomeScreenAnalyticsHelper homeScreenAnalyticsHelper, CheckIfContinueWithBulkBookingFlowUseCase checkIfContinueWithBulkBookingFlowUseCase, FetchHistoryScreenConfigDataUseCase fetchHistoryScreenConfigDataUseCase, GetActiveTitoTripsAndUpdateRestUseCase getActiveTitoTripsAndUpdateRestUseCase, CoroutineContextProvider coroutineContextProvider, IsNotificationPermissionGrantedUseCase isNotificationPermissionGrantedUseCase, MyTicketsUiStateFactory myTicketsUiStateFactory, FetchAndStoreProductConfigByIdUseCase fetchAndStoreProductConfigByIdUseCase, GetNextStepOnPassApplicationVerifiedUseCase getNextStepOnPassApplicationVerifiedUseCase, GetNextStepOnPassApplicationRejectedUseCase getNextStepOnPassApplicationRejectedUseCase, BookingHelper bookingHelper, KotlinToastManager kotlinToastManager, PermissionHandlerProvider permissionHandlerProvider, ChaloNavigationManager chaloNavigationManager, HomeTabScreensNavigationAndStateManager homeTabScreensNavigationAndStateManager, IReportProblemFeature iReportProblemFeature, SystemHelper systemHelper, ValidationSceneResolverUseCase validationSceneResolverUseCase, FetchAndStoreMetroLiveBookingStatusUseCase fetchAndStoreMetroLiveBookingStatusUseCase, HomeTabVisibilityController homeTabVisibilityController, BottomNavTabType tabType, MTicketUtilsHelper mTicketUtilsHelper, ApplicationForegroundManager applicationForegroundManager) {
        super(componentContext);
        Intrinsics.i(componentContext, "componentContext");
        Intrinsics.i(homeTabVisibilityController, "homeTabVisibilityController");
        Intrinsics.i(tabType, "tabType");
        this.k = basicInfoContract;
        this.l = getAllRequestedBookedProductsUseCase;
        this.m = cityProvider;
        this.n = homeScreenInfoHelper;
        this.o = timeUtilsContract;
        this.p = getTimeInMillisAfterXTimeUseCase;
        this.q = getActivePremiumReserveTicketBetweenGivenTimeUseCase;
        this.r = stringProvider;
        this.s = autoLinkDeviceIdUseCase;
        this.t = userProfileDetailsProvider;
        this.u = chaloConfigFeature;
        this.v = doesUserHaveProductsOnMultipleDeviceUseCase;
        this.w = initiateProductHistorySyncCallUseCase;
        this.x = runPreActivationChecksUseCase;
        this.y = activateProductIfRequiredUseCase;
        this.z = getValidationProcessFlowDetailsForValidationProductUseCase;
        this.A = getBookableProductConfigForRenewUseCase;
        this.B = chaloTimeProvider;
        this.C = getProductConfigInfoForPremiumBusProductIfActiveUseCase;
        this.D = getPremiumReserveTicketByIdUseCase;
        this.E = homeScreenAnalyticsHelper;
        this.F = fetchHistoryScreenConfigDataUseCase;
        this.G = getActiveTitoTripsAndUpdateRestUseCase;
        this.H = coroutineContextProvider;
        this.I = isNotificationPermissionGrantedUseCase;
        this.J = myTicketsUiStateFactory;
        this.K = fetchAndStoreProductConfigByIdUseCase;
        this.L = getNextStepOnPassApplicationVerifiedUseCase;
        this.M = getNextStepOnPassApplicationRejectedUseCase;
        this.N = bookingHelper;
        this.O = kotlinToastManager;
        this.P = permissionHandlerProvider;
        this.Q = chaloNavigationManager;
        this.R = homeTabScreensNavigationAndStateManager;
        this.S = iReportProblemFeature;
        this.T = systemHelper;
        this.U = validationSceneResolverUseCase;
        this.V = fetchAndStoreMetroLiveBookingStatusUseCase;
        this.W = tabType;
        this.X = mTicketUtilsHelper;
        this.Y = applicationForegroundManager;
        this.Z = MutexKt.a();
        this.a0 = new ArrayList();
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(TicketsPassesTabType.ACTIVE);
        this.d0 = mutableStateFlowA;
        this.e0 = FlowKt.c(mutableStateFlowA);
        this.j0 = new VisibleJobTracker();
        this.l0 = true;
        this.o0 = homeTabVisibilityController.a(tabType);
        MutableStateFlow mutableStateFlowA2 = StateFlowKt.a(0);
        this.p0 = mutableStateFlowA2;
        this.q0 = FlowKt.c(mutableStateFlowA2);
        Job job = this.h0;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        this.h0 = BuildersKt.d(this.j, null, null, new MyTicketsComponent$observeTabVisibility$1(this, null), 3);
        BuildersKt.d(this.j, null, null, new AnonymousClass1(null), 3);
        this.r0 = LazyKt.b(new qk0(this, 12));
        this.s0 = LazyKt.b(new qk0(this, 13));
        this.t0 = LazyKt.b(new qk0(this, 14));
        this.u0 = LazyKt.b(new qk0(this, 15));
        this.v0 = LazyKt.b(new jk0(2));
        this.w0 = LazyKt.b(new jk0(3));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
    
        if (r11 == r2) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object F0(app.chalo.home.ui.history.MyTicketsComponent r9, app.chalo.superpass.data.models.entities.SuperPassApplication r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.history.MyTicketsComponent.F0(app.chalo.home.ui.history.MyTicketsComponent, app.chalo.superpass.data.models.entities.SuperPassApplication, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object G0(MyTicketsComponent myTicketsComponent, SuperPassApplication superPassApplication, ContinuationImpl continuationImpl) {
        MyTicketsComponent$checkAndLaunchReApplicationFlow$1 myTicketsComponent$checkAndLaunchReApplicationFlow$1;
        myTicketsComponent.getClass();
        if (continuationImpl instanceof MyTicketsComponent$checkAndLaunchReApplicationFlow$1) {
            myTicketsComponent$checkAndLaunchReApplicationFlow$1 = (MyTicketsComponent$checkAndLaunchReApplicationFlow$1) continuationImpl;
            int i = myTicketsComponent$checkAndLaunchReApplicationFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                myTicketsComponent$checkAndLaunchReApplicationFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                myTicketsComponent$checkAndLaunchReApplicationFlow$1 = new MyTicketsComponent$checkAndLaunchReApplicationFlow$1(myTicketsComponent, continuationImpl);
            }
        } else {
            myTicketsComponent$checkAndLaunchReApplicationFlow$1 = new MyTicketsComponent$checkAndLaunchReApplicationFlow$1(myTicketsComponent, continuationImpl);
        }
        Object objA = myTicketsComponent$checkAndLaunchReApplicationFlow$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = myTicketsComponent$checkAndLaunchReApplicationFlow$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            GetNextStepOnPassApplicationRejectedUseCase getNextStepOnPassApplicationRejectedUseCase = myTicketsComponent.M;
            myTicketsComponent$checkAndLaunchReApplicationFlow$1.L$0 = superPassApplication;
            myTicketsComponent$checkAndLaunchReApplicationFlow$1.label = 1;
            objA = getNextStepOnPassApplicationRejectedUseCase.a(superPassApplication, myTicketsComponent$checkAndLaunchReApplicationFlow$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            superPassApplication = (SuperPassApplication) myTicketsComponent$checkAndLaunchReApplicationFlow$1.L$0;
            ResultKt.b(objA);
        }
        ProcessRejectedPassApplicationForNextStep processRejectedPassApplicationForNextStep = (ProcessRejectedPassApplicationForNextStep) objA;
        if (Intrinsics.d(processRejectedPassApplicationForNextStep, ProcessRejectedPassApplicationForNextStep.ProductDisabled.f3065a)) {
            myTicketsComponent.t1();
            myTicketsComponent.E0(new lj0(27));
        } else {
            if (!(processRejectedPassApplicationForNextStep instanceof ProcessRejectedPassApplicationForNextStep.ProceedForReapplication)) {
                throw new NoWhenBranchMatchedException();
            }
            ChaloNavigationManager chaloNavigationManager = myTicketsComponent.Q;
            Source source = Source.MY_TICKETS_SCREEN_TAB;
            Json json = ChaloJson.b;
            BookableSuperPassConfiguration bookableSuperPassConfiguration = ((ProcessRejectedPassApplicationForNextStep.ProceedForReapplication) processRejectedPassApplicationForNextStep).f3064a;
            json.getClass();
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new SuperPassPurchaseArgs.UserProofsOverviewArgs.Reapplication(source, json.a(BookableSuperPassConfiguration.INSTANCE.serializer(), bookableSuperPassConfiguration), json.a(SuperPassUserDetails.INSTANCE.serializer(), superPassApplication.j), json.a(BuiltinSerializersKt.c(PassApplicationActionRequired.INSTANCE.serializer()), superPassApplication.o), json.a(BuiltinSerializersKt.c(PassApplicationRejectionReasons.INSTANCE.serializer()), superPassApplication.n), superPassApplication.h), null, null, 6));
        }
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object H0(MyTicketsComponent myTicketsComponent, SuperPassApplication superPassApplication, ContinuationImpl continuationImpl) {
        MyTicketsComponent$checkAndLaunchVerificationFlow$1 myTicketsComponent$checkAndLaunchVerificationFlow$1;
        myTicketsComponent.getClass();
        if (continuationImpl instanceof MyTicketsComponent$checkAndLaunchVerificationFlow$1) {
            myTicketsComponent$checkAndLaunchVerificationFlow$1 = (MyTicketsComponent$checkAndLaunchVerificationFlow$1) continuationImpl;
            int i = myTicketsComponent$checkAndLaunchVerificationFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                myTicketsComponent$checkAndLaunchVerificationFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                myTicketsComponent$checkAndLaunchVerificationFlow$1 = new MyTicketsComponent$checkAndLaunchVerificationFlow$1(myTicketsComponent, continuationImpl);
            }
        } else {
            myTicketsComponent$checkAndLaunchVerificationFlow$1 = new MyTicketsComponent$checkAndLaunchVerificationFlow$1(myTicketsComponent, continuationImpl);
        }
        Object objA = myTicketsComponent$checkAndLaunchVerificationFlow$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = myTicketsComponent$checkAndLaunchVerificationFlow$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            GetNextStepOnPassApplicationVerifiedUseCase getNextStepOnPassApplicationVerifiedUseCase = myTicketsComponent.L;
            myTicketsComponent$checkAndLaunchVerificationFlow$1.L$0 = superPassApplication;
            myTicketsComponent$checkAndLaunchVerificationFlow$1.label = 1;
            objA = getNextStepOnPassApplicationVerifiedUseCase.a(superPassApplication, myTicketsComponent$checkAndLaunchVerificationFlow$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            superPassApplication = (SuperPassApplication) myTicketsComponent$checkAndLaunchVerificationFlow$1.L$0;
            ResultKt.b(objA);
        }
        ProcessVerifiedPassApplicationForNextStep processVerifiedPassApplicationForNextStep = (ProcessVerifiedPassApplicationForNextStep) objA;
        if (Intrinsics.d(processVerifiedPassApplicationForNextStep, ProcessVerifiedPassApplicationForNextStep.ProductDisabled.f3067a)) {
            myTicketsComponent.t1();
            myTicketsComponent.E0(new lj0(28));
        } else if (Intrinsics.d(processVerifiedPassApplicationForNextStep, ProcessVerifiedPassApplicationForNextStep.ProductValidityExpired.f3068a)) {
            myTicketsComponent.t1();
            myTicketsComponent.E0(new lj0(29));
        } else {
            if (!(processVerifiedPassApplicationForNextStep instanceof ProcessVerifiedPassApplicationForNextStep.ProceedForPayment)) {
                throw new NoWhenBranchMatchedException();
            }
            ChaloNavigationManager chaloNavigationManager = myTicketsComponent.Q;
            Source source = Source.MY_TICKETS_SCREEN_TAB;
            Json json = ChaloJson.b;
            BookableSuperPassConfiguration bookableSuperPassConfiguration = ((ProcessVerifiedPassApplicationForNextStep.ProceedForPayment) processVerifiedPassApplicationForNextStep).f3066a;
            json.getClass();
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.PaymentPostVerification(source, json.a(BookableSuperPassConfiguration.INSTANCE.serializer(), bookableSuperPassConfiguration), json.a(SuperPassUserDetails.INSTANCE.serializer(), superPassApplication.j), superPassApplication.i, superPassApplication.h, PostPassPurchaseSuccessFlowType.ACTIVATION), null, null, 6));
        }
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object I0(MyTicketsComponent myTicketsComponent, ContinuationImpl continuationImpl) {
        MyTicketsComponent$floatingButtonContainerUiState$1 myTicketsComponent$floatingButtonContainerUiState$1;
        myTicketsComponent.getClass();
        if (continuationImpl instanceof MyTicketsComponent$floatingButtonContainerUiState$1) {
            myTicketsComponent$floatingButtonContainerUiState$1 = (MyTicketsComponent$floatingButtonContainerUiState$1) continuationImpl;
            int i = myTicketsComponent$floatingButtonContainerUiState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                myTicketsComponent$floatingButtonContainerUiState$1.label = i - Integer.MIN_VALUE;
            } else {
                myTicketsComponent$floatingButtonContainerUiState$1 = new MyTicketsComponent$floatingButtonContainerUiState$1(myTicketsComponent, continuationImpl);
            }
        } else {
            myTicketsComponent$floatingButtonContainerUiState$1 = new MyTicketsComponent$floatingButtonContainerUiState$1(myTicketsComponent, continuationImpl);
        }
        Object objB = myTicketsComponent$floatingButtonContainerUiState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = myTicketsComponent$floatingButtonContainerUiState$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            myTicketsComponent$floatingButtonContainerUiState$1.label = 1;
            objB = myTicketsComponent.r.b(StringEnum.BUY_TICKET_PASS, new Object[0], myTicketsComponent$floatingButtonContainerUiState$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        return new TicketsFloatingButtonContainerUiState(new MyTicketFloatingButtonUiState(new TextUIState.ChaloTextUIState((String) objB, UITextStyle.TitleLarge, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), UiEventHandler.Companion.a(new qk0(myTicketsComponent, 9))));
    }

    public static final Map J0(MyTicketsComponent myTicketsComponent, List list) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        myTicketsComponent.getClass();
        List list2 = list;
        boolean z = list2 instanceof Collection;
        if (z && list2.isEmpty()) {
            i = 0;
        } else {
            Iterator it = list2.iterator();
            i = 0;
            while (it.hasNext()) {
                if ((((ChaloUserBookingType) it.next()) instanceof ChaloUserBookingType.SuperPassBooking.RideBasedSuperPassBooking) && (i = i + 1) < 0) {
                    CollectionsKt.y0();
                    throw null;
                }
            }
        }
        Pair pair = new Pair("ride based pass booking count", String.valueOf(i));
        if (z && list2.isEmpty()) {
            i2 = 0;
        } else {
            Iterator it2 = list2.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                if ((((ChaloUserBookingType) it2.next()) instanceof ChaloUserBookingType.SuperPassBooking.MagicSuperPassBooking) && (i2 = i2 + 1) < 0) {
                    CollectionsKt.y0();
                    throw null;
                }
            }
        }
        Pair pair2 = new Pair("magic pass booking count", String.valueOf(i2));
        if (z && list2.isEmpty()) {
            i3 = 0;
        } else {
            Iterator it3 = list2.iterator();
            i3 = 0;
            while (it3.hasNext()) {
                if ((((ChaloUserBookingType) it3.next()) instanceof ChaloUserBookingType.SuperPassBooking.SuperPassApplicationBooking) && (i3 = i3 + 1) < 0) {
                    CollectionsKt.y0();
                    throw null;
                }
            }
        }
        Pair pair3 = new Pair("super pass application booking count", String.valueOf(i3));
        if (z && list2.isEmpty()) {
            i4 = 0;
        } else {
            Iterator it4 = list2.iterator();
            i4 = 0;
            while (it4.hasNext()) {
                if ((((ChaloUserBookingType) it4.next()) instanceof ChaloUserBookingType.SuperPassBooking.PendingSuperPassBooking) && (i4 = i4 + 1) < 0) {
                    CollectionsKt.y0();
                    throw null;
                }
            }
        }
        Pair pair4 = new Pair("pending super pass application booking count", String.valueOf(i4));
        if (z && list2.isEmpty()) {
            i5 = 0;
        } else {
            Iterator it5 = list2.iterator();
            i5 = 0;
            while (it5.hasNext()) {
                if ((((ChaloUserBookingType) it5.next()) instanceof ChaloUserBookingType.TicketBooking.QuickPayBooking) && (i5 = i5 + 1) < 0) {
                    CollectionsKt.y0();
                    throw null;
                }
            }
        }
        Pair pair5 = new Pair("quick pay booking count", String.valueOf(i5));
        if (z && list2.isEmpty()) {
            i6 = 0;
        } else {
            Iterator it6 = list2.iterator();
            i6 = 0;
            while (it6.hasNext()) {
                if ((((ChaloUserBookingType) it6.next()) instanceof ChaloUserBookingType.TicketBooking.MobileTicketBooking) && (i6 = i6 + 1) < 0) {
                    CollectionsKt.y0();
                    throw null;
                }
            }
        }
        Pair pair6 = new Pair("mobile ticket booking count", String.valueOf(i6));
        if (z && list2.isEmpty()) {
            i7 = 0;
        } else {
            Iterator it7 = list2.iterator();
            i7 = 0;
            while (it7.hasNext()) {
                if ((((ChaloUserBookingType) it7.next()) instanceof ChaloUserBookingType.TicketBooking.InstantTicketBooking) && (i7 = i7 + 1) < 0) {
                    CollectionsKt.y0();
                    throw null;
                }
            }
        }
        Pair pair7 = new Pair("instant ticket booking count", String.valueOf(i7));
        if (z && list2.isEmpty()) {
            i8 = 0;
        } else {
            Iterator it8 = list2.iterator();
            i8 = 0;
            while (it8.hasNext()) {
                if ((((ChaloUserBookingType) it8.next()) instanceof ChaloUserBookingType.TicketBooking.PremiumBusBooking) && (i8 = i8 + 1) < 0) {
                    CollectionsKt.y0();
                    throw null;
                }
            }
        }
        return MapsKt.i(pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair("premium bus booking count", String.valueOf(i8)));
    }

    public static final DividerUIState K0(MyTicketsComponent myTicketsComponent) {
        return (DividerUIState) myTicketsComponent.w0.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object L0(MyTicketsComponent myTicketsComponent, ContinuationImpl continuationImpl) {
        MyTicketsComponent$getReclaimWebLinkUri$1 myTicketsComponent$getReclaimWebLinkUri$1;
        String strA;
        UserProfileDetailsProvider userProfileDetailsProvider = myTicketsComponent.t;
        if (continuationImpl instanceof MyTicketsComponent$getReclaimWebLinkUri$1) {
            myTicketsComponent$getReclaimWebLinkUri$1 = (MyTicketsComponent$getReclaimWebLinkUri$1) continuationImpl;
            int i = myTicketsComponent$getReclaimWebLinkUri$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                myTicketsComponent$getReclaimWebLinkUri$1.label = i - Integer.MIN_VALUE;
            } else {
                myTicketsComponent$getReclaimWebLinkUri$1 = new MyTicketsComponent$getReclaimWebLinkUri$1(myTicketsComponent, continuationImpl);
            }
        } else {
            myTicketsComponent$getReclaimWebLinkUri$1 = new MyTicketsComponent$getReclaimWebLinkUri$1(myTicketsComponent, continuationImpl);
        }
        Object objA = myTicketsComponent$getReclaimWebLinkUri$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = myTicketsComponent$getReclaimWebLinkUri$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            ChaloConfigFeature chaloConfigFeature = myTicketsComponent.u;
            myTicketsComponent$getReclaimWebLinkUri$1.label = 1;
            objA = chaloConfigFeature.a("reclaimPassesRequestUrl", myTicketsComponent$getReclaimWebLinkUri$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        String str = (String) objA;
        int length = str.length() - 1;
        int i3 = 0;
        boolean z = false;
        while (i3 <= length) {
            boolean z2 = Intrinsics.k(str.charAt(!z ? i3 : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i3++;
            } else {
                z = true;
            }
        }
        String string = str.subSequence(i3, length + 1).toString();
        URLBuilder uRLBuilder = new URLBuilder();
        URLParserKt.b(uRLBuilder, string);
        UrlDecodedParametersBuilder urlDecodedParametersBuilder = uRLBuilder.j;
        UserProfileAppModel userProfileAppModelF = userProfileDetailsProvider.f();
        if (userProfileAppModelF == null || (strA = userProfileAppModelF.a()) == null) {
            strA = "";
        }
        urlDecodedParametersBuilder.e("entry.1987039175", strA);
        UrlDecodedParametersBuilder urlDecodedParametersBuilder2 = uRLBuilder.j;
        String strM = userProfileDetailsProvider.m();
        urlDecodedParametersBuilder2.e("entry.58353678", strM != null ? strM : "");
        return uRLBuilder.c();
    }

    public static final long M0(MyTicketsComponent myTicketsComponent, ChaloUserBookingType chaloUserBookingType) {
        Long lValueOf;
        myTicketsComponent.getClass();
        if (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.InstantTicketBooking) {
            InstantTicketAppModel instantTicketAppModel = ((ChaloUserBookingType.TicketBooking.InstantTicketBooking) chaloUserBookingType).d;
            Long l = instantTicketAppModel.k;
            if (l != null) {
                long jLongValue = l.longValue();
                lValueOf = jLongValue > 0 ? Long.valueOf(jLongValue) : null;
                if (lValueOf != null) {
                    return lValueOf.longValue();
                }
            }
            return instantTicketAppModel.d;
        }
        if (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.PremiumBusBooking) {
            return ((ChaloUserBookingType.TicketBooking.PremiumBusBooking) chaloUserBookingType).d.b.b;
        }
        if (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.QuickPayBooking) {
            return QuickPayAppModelKt.a(((ChaloUserBookingType.TicketBooking.QuickPayBooking) chaloUserBookingType).d);
        }
        if (chaloUserBookingType instanceof ChaloUserBookingType.SuperPassBooking.MagicSuperPassBooking) {
            MagicSuperPass magicSuperPass = ((ChaloUserBookingType.SuperPassBooking.MagicSuperPassBooking) chaloUserBookingType).d;
            long j = magicSuperPass.b.c;
            lValueOf = j > 0 ? Long.valueOf(j) : null;
            return lValueOf != null ? lValueOf.longValue() : magicSuperPass.c.e;
        }
        if (chaloUserBookingType instanceof ChaloUserBookingType.SuperPassBooking.PendingSuperPassBooking) {
            return ((ChaloUserBookingType.SuperPassBooking.PendingSuperPassBooking) chaloUserBookingType).d.b.e;
        }
        if (chaloUserBookingType instanceof ChaloUserBookingType.SuperPassBooking.RideBasedSuperPassBooking) {
            RideBasedSuperPass rideBasedSuperPass = ((ChaloUserBookingType.SuperPassBooking.RideBasedSuperPassBooking) chaloUserBookingType).d;
            boolean zL = rideBasedSuperPass.l();
            RideBasedSuperPassUIProperties rideBasedSuperPassUIProperties = rideBasedSuperPass.h;
            return (zL && rideBasedSuperPass.o() == 0) ? rideBasedSuperPassUIProperties.e + 2592000000L : rideBasedSuperPassUIProperties.e;
        }
        if (chaloUserBookingType instanceof ChaloUserBookingType.SuperPassBooking.SuperPassApplicationBooking) {
            return ((ChaloUserBookingType.SuperPassBooking.SuperPassApplicationBooking) chaloUserBookingType).d.h;
        }
        if (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.OndcTicketBooking) {
            OndcTicketAppModel ondcTicketAppModel = ((ChaloUserBookingType.TicketBooking.OndcTicketBooking) chaloUserBookingType).d;
            long j2 = ondcTicketAppModel.j;
            lValueOf = j2 > 0 ? Long.valueOf(j2) : null;
            return lValueOf != null ? lValueOf.longValue() : ondcTicketAppModel.c;
        }
        if (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.OndcMetroTicketBooking) {
            OndcMetroTicketAppModel ondcMetroTicketAppModel = ((ChaloUserBookingType.TicketBooking.OndcMetroTicketBooking) chaloUserBookingType).d;
            long j3 = ondcMetroTicketAppModel.k;
            lValueOf = j3 > 0 ? Long.valueOf(j3) : null;
            return lValueOf != null ? lValueOf.longValue() : ondcMetroTicketAppModel.c;
        }
        if (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.PassRideBooking) {
            SuperPassRideBookingAppModel superPassRideBookingAppModel = ((ChaloUserBookingType.TicketBooking.PassRideBooking) chaloUserBookingType).d;
            long j4 = superPassRideBookingAppModel.d;
            lValueOf = j4 > 0 ? Long.valueOf(j4) : null;
            if (lValueOf != null) {
                return lValueOf.longValue();
            }
            long j5 = superPassRideBookingAppModel.c * ((long) 1000);
            long j6 = superPassRideBookingAppModel.d;
            return j5 < j6 ? j6 : j5;
        }
        if (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.MetroTicketBooking) {
            MetroTicketAppModel metroTicketAppModel = ((ChaloUserBookingType.TicketBooking.MetroTicketBooking) chaloUserBookingType).d;
            long j7 = metroTicketAppModel.k;
            lValueOf = j7 > 0 ? Long.valueOf(j7) : null;
            return lValueOf != null ? lValueOf.longValue() : metroTicketAppModel.c;
        }
        if (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.MultiModalGroupTicketBooking) {
            MultiModalGroupTicketAppModel multiModalGroupTicketAppModel = ((ChaloUserBookingType.TicketBooking.MultiModalGroupTicketBooking) chaloUserBookingType).d;
            long j8 = multiModalGroupTicketAppModel.k;
            lValueOf = j8 > 0 ? Long.valueOf(j8) : null;
            return lValueOf != null ? lValueOf.longValue() : multiModalGroupTicketAppModel.e;
        }
        if ((chaloUserBookingType instanceof ChaloUserBookingType.CardBooking.CardRechargeBooking) || (chaloUserBookingType instanceof ChaloUserBookingType.CardBooking.CardTransactionReceiptBooking)) {
            return Long.MAX_VALUE;
        }
        if (!(chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.MobileTicketBooking)) {
            throw new NoWhenBranchMatchedException();
        }
        MTicket mTicket = ((ChaloUserBookingType.TicketBooking.MobileTicketBooking) chaloUserBookingType).d;
        long j9 = mTicket.j;
        lValueOf = j9 > 0 ? Long.valueOf(j9) : null;
        return lValueOf != null ? lValueOf.longValue() : mTicket.i;
    }

    public static final long N0(MyTicketsComponent myTicketsComponent, ChaloUserBookingType chaloUserBookingType) {
        myTicketsComponent.getClass();
        if (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.InstantTicketBooking) {
            return ((ChaloUserBookingType.TicketBooking.InstantTicketBooking) chaloUserBookingType).d.d;
        }
        if (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.PremiumBusBooking) {
            return ((ChaloUserBookingType.TicketBooking.PremiumBusBooking) chaloUserBookingType).d.f7113a.b;
        }
        if (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.QuickPayBooking) {
            return QuickPayAppModelKt.a(((ChaloUserBookingType.TicketBooking.QuickPayBooking) chaloUserBookingType).d);
        }
        if (chaloUserBookingType instanceof ChaloUserBookingType.SuperPassBooking.MagicSuperPassBooking) {
            return ((ChaloUserBookingType.SuperPassBooking.MagicSuperPassBooking) chaloUserBookingType).d.c.e;
        }
        if (chaloUserBookingType instanceof ChaloUserBookingType.SuperPassBooking.PendingSuperPassBooking) {
            return ((ChaloUserBookingType.SuperPassBooking.PendingSuperPassBooking) chaloUserBookingType).d.b.e;
        }
        if (chaloUserBookingType instanceof ChaloUserBookingType.SuperPassBooking.RideBasedSuperPassBooking) {
            return ((ChaloUserBookingType.SuperPassBooking.RideBasedSuperPassBooking) chaloUserBookingType).d.h.e;
        }
        if (chaloUserBookingType instanceof ChaloUserBookingType.SuperPassBooking.SuperPassApplicationBooking) {
            return ((ChaloUserBookingType.SuperPassBooking.SuperPassApplicationBooking) chaloUserBookingType).d.h;
        }
        if (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.OndcTicketBooking) {
            return ((ChaloUserBookingType.TicketBooking.OndcTicketBooking) chaloUserBookingType).d.c;
        }
        if (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.OndcMetroTicketBooking) {
            return ((ChaloUserBookingType.TicketBooking.OndcMetroTicketBooking) chaloUserBookingType).d.c;
        }
        if (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.PassRideBooking) {
            SuperPassRideBookingAppModel superPassRideBookingAppModel = ((ChaloUserBookingType.TicketBooking.PassRideBooking) chaloUserBookingType).d;
            long j = superPassRideBookingAppModel.d;
            return j > 0 ? j : superPassRideBookingAppModel.c * ((long) 1000);
        }
        if (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.MetroTicketBooking) {
            return ((ChaloUserBookingType.TicketBooking.MetroTicketBooking) chaloUserBookingType).d.c;
        }
        if (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.MultiModalGroupTicketBooking) {
            return ((ChaloUserBookingType.TicketBooking.MultiModalGroupTicketBooking) chaloUserBookingType).d.e;
        }
        if ((chaloUserBookingType instanceof ChaloUserBookingType.CardBooking.CardRechargeBooking) || (chaloUserBookingType instanceof ChaloUserBookingType.CardBooking.CardTransactionReceiptBooking)) {
            return Long.MAX_VALUE;
        }
        if (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.MobileTicketBooking) {
            return ((ChaloUserBookingType.TicketBooking.MobileTicketBooking) chaloUserBookingType).d.i;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Function0 O0(MyTicketsComponent myTicketsComponent) {
        return (Function0) myTicketsComponent.u0.getValue();
    }

    public static final Function0 P0(MyTicketsComponent myTicketsComponent) {
        return (Function0) myTicketsComponent.t0.getValue();
    }

    public static final DividerUIState Q0(MyTicketsComponent myTicketsComponent) {
        return (DividerUIState) myTicketsComponent.v0.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object S0(MyTicketsComponent myTicketsComponent, ContinuationImpl continuationImpl) {
        MyTicketsComponent$getUserPropertiesMap$1 myTicketsComponent$getUserPropertiesMap$1;
        Map map;
        Map map2;
        String str;
        UserProfileDetailsProvider userProfileDetailsProvider = myTicketsComponent.t;
        if (continuationImpl instanceof MyTicketsComponent$getUserPropertiesMap$1) {
            myTicketsComponent$getUserPropertiesMap$1 = (MyTicketsComponent$getUserPropertiesMap$1) continuationImpl;
            int i = myTicketsComponent$getUserPropertiesMap$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                myTicketsComponent$getUserPropertiesMap$1.label = i - Integer.MIN_VALUE;
            } else {
                myTicketsComponent$getUserPropertiesMap$1 = new MyTicketsComponent$getUserPropertiesMap$1(myTicketsComponent, continuationImpl);
            }
        } else {
            myTicketsComponent$getUserPropertiesMap$1 = new MyTicketsComponent$getUserPropertiesMap$1(myTicketsComponent, continuationImpl);
        }
        Object obj = myTicketsComponent$getUserPropertiesMap$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = myTicketsComponent$getUserPropertiesMap$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            HashMap map3 = new HashMap();
            map3.put("userPropertyIsUserLoggedId", "true");
            DoesUserHaveProductsOnMultipleDeviceUseCase doesUserHaveProductsOnMultipleDeviceUseCase = myTicketsComponent.v;
            String strB = CityProviderKt.b(myTicketsComponent.m);
            if (strB == null) {
                strB = "";
            }
            myTicketsComponent$getUserPropertiesMap$1.L$0 = map3;
            myTicketsComponent$getUserPropertiesMap$1.L$1 = map3;
            myTicketsComponent$getUserPropertiesMap$1.L$2 = "userPropertyPassesOnMultipleDevices";
            myTicketsComponent$getUserPropertiesMap$1.label = 1;
            Object objA = doesUserHaveProductsOnMultipleDeviceUseCase.a(strB, myTicketsComponent$getUserPropertiesMap$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            map = map3;
            map2 = map;
            obj = objA;
            str = "userPropertyPassesOnMultipleDevices";
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) myTicketsComponent$getUserPropertiesMap$1.L$2;
            map2 = (Map) myTicketsComponent$getUserPropertiesMap$1.L$1;
            map = (Map) myTicketsComponent$getUserPropertiesMap$1.L$0;
            ResultKt.b(obj);
        }
        map2.put(str, String.valueOf(((Boolean) obj).booleanValue()));
        UserProfileAppModel userProfileAppModelF = userProfileDetailsProvider.f();
        String strN = userProfileAppModelF != null ? userProfileAppModelF.f10305a : null;
        UserProfileAppModel userProfileAppModelF2 = userProfileDetailsProvider.f();
        String str2 = userProfileAppModelF2 != null ? userProfileAppModelF2.b : null;
        if (strN != null) {
            if (str2 != null) {
                strN = vo1.n(strN, " ", str2);
            }
            map.put("userPropertyUserName", strN);
        } else if (str2 != null) {
            map.put("userPropertyUserName", str2);
        }
        String strM = userProfileDetailsProvider.m();
        if (strM != null) {
            map.put("userPropertyUserID", strM);
        }
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00b0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object T0(MyTicketsComponent myTicketsComponent, ChaloUserBookingType chaloUserBookingType, ContinuationImpl continuationImpl) {
        MyTicketsComponent$handleProductActivation$1 myTicketsComponent$handleProductActivation$1;
        myTicketsComponent.getClass();
        if (continuationImpl instanceof MyTicketsComponent$handleProductActivation$1) {
            myTicketsComponent$handleProductActivation$1 = (MyTicketsComponent$handleProductActivation$1) continuationImpl;
            int i = myTicketsComponent$handleProductActivation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                myTicketsComponent$handleProductActivation$1.label = i - Integer.MIN_VALUE;
            } else {
                myTicketsComponent$handleProductActivation$1 = new MyTicketsComponent$handleProductActivation$1(myTicketsComponent, continuationImpl);
            }
        } else {
            myTicketsComponent$handleProductActivation$1 = new MyTicketsComponent$handleProductActivation$1(myTicketsComponent, continuationImpl);
        }
        Object objD = myTicketsComponent$handleProductActivation$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = myTicketsComponent$handleProductActivation$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objD);
            ActivateProductIfRequiredUseCase activateProductIfRequiredUseCase = myTicketsComponent.y;
            myTicketsComponent$handleProductActivation$1.L$0 = chaloUserBookingType;
            myTicketsComponent$handleProductActivation$1.label = 1;
            objD = activateProductIfRequiredUseCase.d(chaloUserBookingType, myTicketsComponent$handleProductActivation$1);
            if (objD != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ResultKt.b(objD);
                return unit;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objD);
            return unit;
        }
        chaloUserBookingType = (ChaloUserBookingType) myTicketsComponent$handleProductActivation$1.L$0;
        ResultKt.b(objD);
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objD;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
            ProductActivationFailureReason productActivationFailureReason = (ProductActivationFailureReason) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
            myTicketsComponent$handleProductActivation$1.L$0 = null;
            myTicketsComponent$handleProductActivation$1.label = 2;
            if (myTicketsComponent.l1(productActivationFailureReason, chaloUserBookingType, myTicketsComponent$handleProductActivation$1) == obj) {
                return obj;
            }
            return unit;
        }
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        if ((chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.InstantTicketBooking) || (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.MobileTicketBooking) || (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.QuickPayBooking) || (chaloUserBookingType instanceof ChaloUserBookingType.SuperPassBooking.MagicSuperPassBooking) || (chaloUserBookingType instanceof ChaloUserBookingType.SuperPassBooking.RideBasedSuperPassBooking) || (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.OndcMetroTicketBooking) || (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.OndcTicketBooking) || (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.MetroTicketBooking)) {
            myTicketsComponent.w0(new MyTicketsComponent$handleProductActivation$2(myTicketsComponent, chaloUserBookingType, null));
            return unit;
        }
        if (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.MultiModalGroupTicketBooking) {
            myTicketsComponent.w0(new MyTicketsComponent$handleProductActivation$3(myTicketsComponent, chaloUserBookingType, null));
            return unit;
        }
        if (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.PremiumBusBooking) {
            myTicketsComponent$handleProductActivation$1.L$0 = null;
            myTicketsComponent$handleProductActivation$1.label = 3;
            if (myTicketsComponent.A1((ChaloUserBookingType.TicketBooking.PremiumBusBooking) chaloUserBookingType, myTicketsComponent$handleProductActivation$1) == obj) {
                return obj;
            }
        } else if (!(chaloUserBookingType instanceof ChaloUserBookingType.SuperPassBooking.PendingSuperPassBooking) && !(chaloUserBookingType instanceof ChaloUserBookingType.SuperPassBooking.SuperPassApplicationBooking) && !(chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.PassRideBooking) && !(chaloUserBookingType instanceof ChaloUserBookingType.CardBooking.CardRechargeBooking) && !(chaloUserBookingType instanceof ChaloUserBookingType.CardBooking.CardTransactionReceiptBooking)) {
            throw new NoWhenBranchMatchedException();
        }
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object U0(MyTicketsComponent myTicketsComponent, ChaloUserBookingType chaloUserBookingType, ContinuationImpl continuationImpl) {
        MyTicketsComponent$handleTappedInFlow$1 myTicketsComponent$handleTappedInFlow$1;
        Object next;
        KotlinToastManager kotlinToastManager;
        myTicketsComponent.getClass();
        if (continuationImpl instanceof MyTicketsComponent$handleTappedInFlow$1) {
            myTicketsComponent$handleTappedInFlow$1 = (MyTicketsComponent$handleTappedInFlow$1) continuationImpl;
            int i = myTicketsComponent$handleTappedInFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                myTicketsComponent$handleTappedInFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                myTicketsComponent$handleTappedInFlow$1 = new MyTicketsComponent$handleTappedInFlow$1(myTicketsComponent, continuationImpl);
            }
        } else {
            myTicketsComponent$handleTappedInFlow$1 = new MyTicketsComponent$handleTappedInFlow$1(myTicketsComponent, continuationImpl);
        }
        Object objA = myTicketsComponent$handleTappedInFlow$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = myTicketsComponent$handleTappedInFlow$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            GetActiveTitoTripsAndUpdateRestUseCase getActiveTitoTripsAndUpdateRestUseCase = myTicketsComponent.G;
            myTicketsComponent$handleTappedInFlow$1.L$0 = chaloUserBookingType;
            myTicketsComponent$handleTappedInFlow$1.label = 1;
            objA = getActiveTitoTripsAndUpdateRestUseCase.a(myTicketsComponent$handleTappedInFlow$1);
            if (objA != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            chaloUserBookingType = (ChaloUserBookingType) myTicketsComponent$handleTappedInFlow$1.L$0;
            ResultKt.b(objA);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinToastManager = (KotlinToastManager) myTicketsComponent$handleTappedInFlow$1.L$0;
            ResultKt.b(objA);
        }
        hq0.s(kotlinToastManager, (String) objA);
        return Unit.f17538a;
        Iterator it = ((Iterable) objA).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(((TITOValidationAppModel) next).c.f9668a, chaloUserBookingType.f2987a));
        TITOValidationAppModel tITOValidationAppModel = (TITOValidationAppModel) next;
        if (tITOValidationAppModel == null) {
            KotlinToastManager kotlinToastManager2 = myTicketsComponent.O;
            myTicketsComponent$handleTappedInFlow$1.L$0 = kotlinToastManager2;
            myTicketsComponent$handleTappedInFlow$1.label = 2;
            objA = myTicketsComponent.r.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], myTicketsComponent$handleTappedInFlow$1);
            if (objA != coroutineSingletons) {
                kotlinToastManager = kotlinToastManager2;
                hq0.s(kotlinToastManager, (String) objA);
            }
            return coroutineSingletons;
        }
        myTicketsComponent.Q.b(new ChaloNavigationRequest.Navigate(new TitoRideDetailsArgs(Source.MY_TICKETS_SCREEN_TAB, tITOValidationAppModel.f9672a.f9673a), null, null, 6));
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object V0(MyTicketsComponent myTicketsComponent, ContinuationImpl continuationImpl) {
        MyTicketsComponent$loadingDialogUIState$1 myTicketsComponent$loadingDialogUIState$1;
        DialogUIStateFactory dialogUIStateFactory;
        myTicketsComponent.getClass();
        if (continuationImpl instanceof MyTicketsComponent$loadingDialogUIState$1) {
            myTicketsComponent$loadingDialogUIState$1 = (MyTicketsComponent$loadingDialogUIState$1) continuationImpl;
            int i = myTicketsComponent$loadingDialogUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                myTicketsComponent$loadingDialogUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                myTicketsComponent$loadingDialogUIState$1 = new MyTicketsComponent$loadingDialogUIState$1(myTicketsComponent, continuationImpl);
            }
        } else {
            myTicketsComponent$loadingDialogUIState$1 = new MyTicketsComponent$loadingDialogUIState$1(myTicketsComponent, continuationImpl);
        }
        Object objB = myTicketsComponent$loadingDialogUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = myTicketsComponent$loadingDialogUIState$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            DialogUIStateFactory dialogUIStateFactory2 = DialogUIStateFactory.f9989a;
            myTicketsComponent$loadingDialogUIState$1.L$0 = dialogUIStateFactory2;
            myTicketsComponent$loadingDialogUIState$1.label = 1;
            objB = myTicketsComponent.r.b(StringEnum.LOADING, new Object[0], myTicketsComponent$loadingDialogUIState$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            dialogUIStateFactory = dialogUIStateFactory2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dialogUIStateFactory = (DialogUIStateFactory) myTicketsComponent$loadingDialogUIState$1.L$0;
            ResultKt.b(objB);
        }
        dialogUIStateFactory.getClass();
        return DialogUIStateFactory.a((String) objB);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object W0(MyTicketsComponent myTicketsComponent, ContinuationImpl continuationImpl) {
        MyTicketsComponent$loginNudgeUIState$1 myTicketsComponent$loginNudgeUIState$1;
        ImageUIState imageUIState;
        ImageUIState imageUIState2;
        TextUIState textUIState;
        ButtonUIStateFactory buttonUIStateFactory;
        StringProvider stringProvider = myTicketsComponent.r;
        if (continuationImpl instanceof MyTicketsComponent$loginNudgeUIState$1) {
            myTicketsComponent$loginNudgeUIState$1 = (MyTicketsComponent$loginNudgeUIState$1) continuationImpl;
            int i = myTicketsComponent$loginNudgeUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                myTicketsComponent$loginNudgeUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                myTicketsComponent$loginNudgeUIState$1 = new MyTicketsComponent$loginNudgeUIState$1(myTicketsComponent, continuationImpl);
            }
        } else {
            myTicketsComponent$loginNudgeUIState$1 = new MyTicketsComponent$loginNudgeUIState$1(myTicketsComponent, continuationImpl);
        }
        Object objB = myTicketsComponent$loginNudgeUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = myTicketsComponent$loginNudgeUIState$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            ImageUIState imageUIState3 = new ImageUIState(IconType.IC_LOGIN_NUDGE, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254);
            myTicketsComponent$loginNudgeUIState$1.L$0 = imageUIState3;
            myTicketsComponent$loginNudgeUIState$1.label = 1;
            objB = stringProvider.b(StringEnum.LOGIN_TO_SEE_HISTORY, new Object[0], myTicketsComponent$loginNudgeUIState$1);
            if (objB != coroutineSingletons) {
                imageUIState = imageUIState3;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            imageUIState = (ImageUIState) myTicketsComponent$loginNudgeUIState$1.L$0;
            ResultKt.b(objB);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            buttonUIStateFactory = (ButtonUIStateFactory) myTicketsComponent$loginNudgeUIState$1.L$2;
            TextUIState textUIState2 = (TextUIState) myTicketsComponent$loginNudgeUIState$1.L$1;
            ImageUIState imageUIState4 = (ImageUIState) myTicketsComponent$loginNudgeUIState$1.L$0;
            ResultKt.b(objB);
            imageUIState2 = imageUIState4;
            textUIState = textUIState2;
        }
        return new MyTicketsLoginNudgeUIState(imageUIState2, textUIState, ButtonUIStateFactory.g(buttonUIStateFactory, (String) objB, new qk0(myTicketsComponent, 10), null, null, false, 0.0f, 60));
        TextUIState.ChaloTextUIState chaloTextUIState = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodySmall, (ChaloColorToken) null, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8156);
        myTicketsComponent$loginNudgeUIState$1.L$0 = imageUIState;
        myTicketsComponent$loginNudgeUIState$1.L$1 = chaloTextUIState;
        ButtonUIStateFactory buttonUIStateFactory2 = ButtonUIStateFactory.f9921a;
        myTicketsComponent$loginNudgeUIState$1.L$2 = buttonUIStateFactory2;
        myTicketsComponent$loginNudgeUIState$1.label = 2;
        objB = stringProvider.b(StringEnum.LOG_IN, new Object[0], myTicketsComponent$loginNudgeUIState$1);
        if (objB != coroutineSingletons) {
            imageUIState2 = imageUIState;
            textUIState = chaloTextUIState;
            buttonUIStateFactory = buttonUIStateFactory2;
            return new MyTicketsLoginNudgeUIState(imageUIState2, textUIState, ButtonUIStateFactory.g(buttonUIStateFactory, (String) objB, new qk0(myTicketsComponent, 10), null, null, false, 0.0f, 60));
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x011d  */
    /* JADX WARN: Code duplicated, block: B:35:0x014c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object X0(MyTicketsComponent myTicketsComponent, ContinuationImpl continuationImpl) {
        MyTicketsComponent$notificationTurnOnExplainerUiState$1 myTicketsComponent$notificationTurnOnExplainerUiState$1;
        ImageUIState imageUIState;
        ImageUIState imageUIState2;
        TextUIState.ChaloTextUIState chaloTextUIState;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        ButtonUIStateFactory buttonUIStateFactory;
        ButtonUIState buttonUIStateG;
        Object objB;
        TextUIState.ChaloTextUIState chaloTextUIState4;
        ButtonUIStateFactory buttonUIStateFactory2;
        TextUIState.ChaloTextUIState chaloTextUIState5;
        ImageUIState imageUIState3;
        ButtonUIState buttonUIState;
        StringProvider stringProvider = myTicketsComponent.r;
        if (continuationImpl instanceof MyTicketsComponent$notificationTurnOnExplainerUiState$1) {
            myTicketsComponent$notificationTurnOnExplainerUiState$1 = (MyTicketsComponent$notificationTurnOnExplainerUiState$1) continuationImpl;
            int i = myTicketsComponent$notificationTurnOnExplainerUiState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                myTicketsComponent$notificationTurnOnExplainerUiState$1.label = i - Integer.MIN_VALUE;
            } else {
                myTicketsComponent$notificationTurnOnExplainerUiState$1 = new MyTicketsComponent$notificationTurnOnExplainerUiState$1(myTicketsComponent, continuationImpl);
            }
        } else {
            myTicketsComponent$notificationTurnOnExplainerUiState$1 = new MyTicketsComponent$notificationTurnOnExplainerUiState$1(myTicketsComponent, continuationImpl);
        }
        Object objB2 = myTicketsComponent$notificationTurnOnExplainerUiState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = myTicketsComponent$notificationTurnOnExplainerUiState$1.label;
        ButtonUIStateFactory buttonUIStateFactory3 = ButtonUIStateFactory.f9921a;
        if (i2 == 0) {
            ResultKt.b(objB2);
            ImageUIState imageUIState4 = new ImageUIState(IconType.IC_NOTIFICATION_TURN_ON, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254);
            myTicketsComponent$notificationTurnOnExplainerUiState$1.L$0 = imageUIState4;
            myTicketsComponent$notificationTurnOnExplainerUiState$1.label = 1;
            objB2 = stringProvider.b(StringEnum.NOTIFICATION_TURN_ON_TITLE, new Object[0], myTicketsComponent$notificationTurnOnExplainerUiState$1);
            if (objB2 != coroutineSingletons) {
                imageUIState = imageUIState4;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            imageUIState = (ImageUIState) myTicketsComponent$notificationTurnOnExplainerUiState$1.L$0;
            ResultKt.b(objB2);
        } else {
            if (i2 == 2) {
                chaloTextUIState = (TextUIState.ChaloTextUIState) myTicketsComponent$notificationTurnOnExplainerUiState$1.L$1;
                imageUIState2 = (ImageUIState) myTicketsComponent$notificationTurnOnExplainerUiState$1.L$0;
                ResultKt.b(objB2);
                chaloTextUIState2 = new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodySmall, ChaloColorToken.ShadyGray.f9851a, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152);
                myTicketsComponent$notificationTurnOnExplainerUiState$1.L$0 = imageUIState2;
                myTicketsComponent$notificationTurnOnExplainerUiState$1.L$1 = chaloTextUIState;
                myTicketsComponent$notificationTurnOnExplainerUiState$1.L$2 = chaloTextUIState2;
                myTicketsComponent$notificationTurnOnExplainerUiState$1.L$3 = buttonUIStateFactory3;
                myTicketsComponent$notificationTurnOnExplainerUiState$1.label = 3;
                objB2 = stringProvider.b(StringEnum.ENABLE_NOTIFICATION, new Object[0], myTicketsComponent$notificationTurnOnExplainerUiState$1);
                if (objB2 != coroutineSingletons) {
                    chaloTextUIState3 = chaloTextUIState2;
                    buttonUIStateFactory = buttonUIStateFactory3;
                    buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory, (String) objB2, new qk0(myTicketsComponent, 3), null, null, false, 0.0f, 60);
                    myTicketsComponent$notificationTurnOnExplainerUiState$1.L$0 = imageUIState2;
                    myTicketsComponent$notificationTurnOnExplainerUiState$1.L$1 = chaloTextUIState;
                    myTicketsComponent$notificationTurnOnExplainerUiState$1.L$2 = chaloTextUIState3;
                    myTicketsComponent$notificationTurnOnExplainerUiState$1.L$3 = buttonUIStateG;
                    myTicketsComponent$notificationTurnOnExplainerUiState$1.L$4 = buttonUIStateFactory3;
                    myTicketsComponent$notificationTurnOnExplainerUiState$1.label = 4;
                    objB = stringProvider.b(StringEnum.SKIP, new Object[0], myTicketsComponent$notificationTurnOnExplainerUiState$1);
                    if (objB != coroutineSingletons) {
                        chaloTextUIState4 = chaloTextUIState;
                        buttonUIStateFactory2 = buttonUIStateFactory3;
                        chaloTextUIState5 = chaloTextUIState3;
                        imageUIState3 = imageUIState2;
                        buttonUIState = buttonUIStateG;
                        objB2 = objB;
                    }
                }
                return coroutineSingletons;
            }
            if (i2 == 3) {
                ButtonUIStateFactory buttonUIStateFactory4 = (ButtonUIStateFactory) myTicketsComponent$notificationTurnOnExplainerUiState$1.L$3;
                chaloTextUIState3 = (TextUIState.ChaloTextUIState) myTicketsComponent$notificationTurnOnExplainerUiState$1.L$2;
                TextUIState.ChaloTextUIState chaloTextUIState6 = (TextUIState.ChaloTextUIState) myTicketsComponent$notificationTurnOnExplainerUiState$1.L$1;
                ImageUIState imageUIState5 = (ImageUIState) myTicketsComponent$notificationTurnOnExplainerUiState$1.L$0;
                ResultKt.b(objB2);
                buttonUIStateFactory = buttonUIStateFactory4;
                chaloTextUIState = chaloTextUIState6;
                imageUIState2 = imageUIState5;
                buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory, (String) objB2, new qk0(myTicketsComponent, 3), null, null, false, 0.0f, 60);
                myTicketsComponent$notificationTurnOnExplainerUiState$1.L$0 = imageUIState2;
                myTicketsComponent$notificationTurnOnExplainerUiState$1.L$1 = chaloTextUIState;
                myTicketsComponent$notificationTurnOnExplainerUiState$1.L$2 = chaloTextUIState3;
                myTicketsComponent$notificationTurnOnExplainerUiState$1.L$3 = buttonUIStateG;
                myTicketsComponent$notificationTurnOnExplainerUiState$1.L$4 = buttonUIStateFactory3;
                myTicketsComponent$notificationTurnOnExplainerUiState$1.label = 4;
                objB = stringProvider.b(StringEnum.SKIP, new Object[0], myTicketsComponent$notificationTurnOnExplainerUiState$1);
                if (objB != coroutineSingletons) {
                    chaloTextUIState4 = chaloTextUIState;
                    buttonUIStateFactory2 = buttonUIStateFactory3;
                    chaloTextUIState5 = chaloTextUIState3;
                    imageUIState3 = imageUIState2;
                    buttonUIState = buttonUIStateG;
                    objB2 = objB;
                }
                return coroutineSingletons;
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ButtonUIStateFactory buttonUIStateFactory5 = (ButtonUIStateFactory) myTicketsComponent$notificationTurnOnExplainerUiState$1.L$4;
            ButtonUIState buttonUIState2 = (ButtonUIState) myTicketsComponent$notificationTurnOnExplainerUiState$1.L$3;
            TextUIState.ChaloTextUIState chaloTextUIState7 = (TextUIState.ChaloTextUIState) myTicketsComponent$notificationTurnOnExplainerUiState$1.L$2;
            TextUIState.ChaloTextUIState chaloTextUIState8 = (TextUIState.ChaloTextUIState) myTicketsComponent$notificationTurnOnExplainerUiState$1.L$1;
            imageUIState3 = (ImageUIState) myTicketsComponent$notificationTurnOnExplainerUiState$1.L$0;
            ResultKt.b(objB2);
            chaloTextUIState5 = chaloTextUIState7;
            chaloTextUIState4 = chaloTextUIState8;
            buttonUIStateFactory2 = buttonUIStateFactory5;
            buttonUIState = buttonUIState2;
        }
        return new StandardErrorScreenUIState.ErrorWithMsgAndRetry(imageUIState3, chaloTextUIState4, chaloTextUIState5, buttonUIState, ButtonUIStateFactory.b(buttonUIStateFactory2, (String) objB2, new qk0(myTicketsComponent, 4), null, false, 60), new ErrorWithMsgAndRetryUISpecs(null, ChaloThemeHelper.a().q, ChaloThemeHelper.a().d, ChaloThemeHelper.a().k, 113));
        TextUIState.ChaloTextUIState chaloTextUIState9 = new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.DisplaySmall, (ChaloColorToken) null, 0, UITextAlign.Center, UIFontWeight.Bold, new Integer(24), (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7964);
        myTicketsComponent$notificationTurnOnExplainerUiState$1.L$0 = imageUIState;
        myTicketsComponent$notificationTurnOnExplainerUiState$1.L$1 = chaloTextUIState9;
        myTicketsComponent$notificationTurnOnExplainerUiState$1.label = 2;
        objB2 = stringProvider.b(StringEnum.NOTIFICATION_TURN_ON_DESC, new Object[0], myTicketsComponent$notificationTurnOnExplainerUiState$1);
        if (objB2 != coroutineSingletons) {
            imageUIState2 = imageUIState;
            chaloTextUIState = chaloTextUIState9;
            chaloTextUIState2 = new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodySmall, ChaloColorToken.ShadyGray.f9851a, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152);
            myTicketsComponent$notificationTurnOnExplainerUiState$1.L$0 = imageUIState2;
            myTicketsComponent$notificationTurnOnExplainerUiState$1.L$1 = chaloTextUIState;
            myTicketsComponent$notificationTurnOnExplainerUiState$1.L$2 = chaloTextUIState2;
            myTicketsComponent$notificationTurnOnExplainerUiState$1.L$3 = buttonUIStateFactory3;
            myTicketsComponent$notificationTurnOnExplainerUiState$1.label = 3;
            objB2 = stringProvider.b(StringEnum.ENABLE_NOTIFICATION, new Object[0], myTicketsComponent$notificationTurnOnExplainerUiState$1);
            if (objB2 != coroutineSingletons) {
                chaloTextUIState3 = chaloTextUIState2;
                buttonUIStateFactory = buttonUIStateFactory3;
                buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory, (String) objB2, new qk0(myTicketsComponent, 3), null, null, false, 0.0f, 60);
                myTicketsComponent$notificationTurnOnExplainerUiState$1.L$0 = imageUIState2;
                myTicketsComponent$notificationTurnOnExplainerUiState$1.L$1 = chaloTextUIState;
                myTicketsComponent$notificationTurnOnExplainerUiState$1.L$2 = chaloTextUIState3;
                myTicketsComponent$notificationTurnOnExplainerUiState$1.L$3 = buttonUIStateG;
                myTicketsComponent$notificationTurnOnExplainerUiState$1.L$4 = buttonUIStateFactory3;
                myTicketsComponent$notificationTurnOnExplainerUiState$1.label = 4;
                objB = stringProvider.b(StringEnum.SKIP, new Object[0], myTicketsComponent$notificationTurnOnExplainerUiState$1);
                if (objB != coroutineSingletons) {
                    chaloTextUIState4 = chaloTextUIState;
                    buttonUIStateFactory2 = buttonUIStateFactory3;
                    chaloTextUIState5 = chaloTextUIState3;
                    imageUIState3 = imageUIState2;
                    buttonUIState = buttonUIStateG;
                    objB2 = objB;
                    return new StandardErrorScreenUIState.ErrorWithMsgAndRetry(imageUIState3, chaloTextUIState4, chaloTextUIState5, buttonUIState, ButtonUIStateFactory.b(buttonUIStateFactory2, (String) objB2, new qk0(myTicketsComponent, 4), null, false, 60), new ErrorWithMsgAndRetryUISpecs(null, ChaloThemeHelper.a().q, ChaloThemeHelper.a().d, ChaloThemeHelper.a().k, 113));
                }
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object Y0(MyTicketsComponent myTicketsComponent, ContinuationImpl continuationImpl) {
        MyTicketsComponent$productDisabledConfirmationDialogState$1 myTicketsComponent$productDisabledConfirmationDialogState$1;
        ChaloTextStyleHelper chaloTextStyleHelper;
        TextUIState.ChaloTextUIState chaloTextUIState;
        ChaloTextStyleHelper chaloTextStyleHelper2;
        TextUIState.ChaloTextUIState chaloTextUIStateB;
        Object objB;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        ChaloTextStyleHelper chaloTextStyleHelper3;
        StringProvider stringProvider = myTicketsComponent.r;
        if (continuationImpl instanceof MyTicketsComponent$productDisabledConfirmationDialogState$1) {
            myTicketsComponent$productDisabledConfirmationDialogState$1 = (MyTicketsComponent$productDisabledConfirmationDialogState$1) continuationImpl;
            int i = myTicketsComponent$productDisabledConfirmationDialogState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                myTicketsComponent$productDisabledConfirmationDialogState$1.label = i - Integer.MIN_VALUE;
            } else {
                myTicketsComponent$productDisabledConfirmationDialogState$1 = new MyTicketsComponent$productDisabledConfirmationDialogState$1(myTicketsComponent, continuationImpl);
            }
        } else {
            myTicketsComponent$productDisabledConfirmationDialogState$1 = new MyTicketsComponent$productDisabledConfirmationDialogState$1(myTicketsComponent, continuationImpl);
        }
        Object objB2 = myTicketsComponent$productDisabledConfirmationDialogState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = myTicketsComponent$productDisabledConfirmationDialogState$1.label;
        ChaloColorToken.Black_87 black_87 = ChaloColorToken.Black_87.f9768a;
        ChaloTextStyleHelper chaloTextStyleHelper4 = ChaloTextStyleHelper.f10078a;
        if (i2 == 0) {
            ResultKt.b(objB2);
            myTicketsComponent$productDisabledConfirmationDialogState$1.L$0 = chaloTextStyleHelper4;
            myTicketsComponent$productDisabledConfirmationDialogState$1.label = 1;
            objB2 = stringProvider.b(StringEnum.BOOKABLE_CONFIG_INACTIVE_TITLE, new Object[0], myTicketsComponent$productDisabledConfirmationDialogState$1);
            if (objB2 != coroutineSingletons) {
                chaloTextStyleHelper = chaloTextStyleHelper4;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ChaloTextStyleHelper chaloTextStyleHelper5 = (ChaloTextStyleHelper) myTicketsComponent$productDisabledConfirmationDialogState$1.L$0;
            ResultKt.b(objB2);
            chaloTextStyleHelper = chaloTextStyleHelper5;
        } else {
            if (i2 == 2) {
                ChaloTextStyleHelper chaloTextStyleHelper6 = (ChaloTextStyleHelper) myTicketsComponent$productDisabledConfirmationDialogState$1.L$1;
                TextUIState.ChaloTextUIState chaloTextUIState4 = (TextUIState.ChaloTextUIState) myTicketsComponent$productDisabledConfirmationDialogState$1.L$0;
                ResultKt.b(objB2);
                chaloTextStyleHelper2 = chaloTextStyleHelper6;
                chaloTextUIState = chaloTextUIState4;
                chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper2, (String) objB2, black_87, 0, null, null, null, null, 124);
                myTicketsComponent$productDisabledConfirmationDialogState$1.L$0 = chaloTextUIState;
                myTicketsComponent$productDisabledConfirmationDialogState$1.L$1 = chaloTextUIStateB;
                myTicketsComponent$productDisabledConfirmationDialogState$1.L$2 = chaloTextStyleHelper4;
                myTicketsComponent$productDisabledConfirmationDialogState$1.label = 3;
                objB = stringProvider.b(StringEnum.OKAY, new Object[0], myTicketsComponent$productDisabledConfirmationDialogState$1);
                if (objB != coroutineSingletons) {
                    chaloTextUIState2 = chaloTextUIState;
                    chaloTextUIState3 = chaloTextUIStateB;
                    chaloTextStyleHelper3 = chaloTextStyleHelper4;
                    objB2 = objB;
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ChaloTextStyleHelper chaloTextStyleHelper7 = (ChaloTextStyleHelper) myTicketsComponent$productDisabledConfirmationDialogState$1.L$2;
            TextUIState.ChaloTextUIState chaloTextUIState5 = (TextUIState.ChaloTextUIState) myTicketsComponent$productDisabledConfirmationDialogState$1.L$1;
            chaloTextUIState2 = (TextUIState.ChaloTextUIState) myTicketsComponent$productDisabledConfirmationDialogState$1.L$0;
            ResultKt.b(objB2);
            chaloTextUIState3 = chaloTextUIState5;
            chaloTextStyleHelper3 = chaloTextStyleHelper7;
        }
        return new ConfirmationDialogUiState(chaloTextUIState2, chaloTextUIState3, new ConfirmationDialogActionCtaContainerUiState(new DialogueCtaUiState(ChaloTextStyleHelper.f(chaloTextStyleHelper3, (String) objB2, ChaloColorToken.OrangePrimary.f9835a, null, null, 124), UiEventHandler.Companion.a(new qk0(myTicketsComponent, 1))), null, 5), DialogUIEventHandler.a(DialogUIEventHandler.d, DialogDismissRequest.Companion.a(new qk0(myTicketsComponent, 2))), 1);
        TextUIState.ChaloTextUIState chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper, (String) objB2, black_87, null, null, 124);
        myTicketsComponent$productDisabledConfirmationDialogState$1.L$0 = chaloTextUIStateF;
        myTicketsComponent$productDisabledConfirmationDialogState$1.L$1 = chaloTextStyleHelper4;
        myTicketsComponent$productDisabledConfirmationDialogState$1.label = 2;
        Object objB3 = stringProvider.b(StringEnum.PRODUCT_NOT_AVAILABLE_FOR_PURCHASE_TRY_LATER, new Object[0], myTicketsComponent$productDisabledConfirmationDialogState$1);
        if (objB3 != coroutineSingletons) {
            chaloTextUIState = chaloTextUIStateF;
            objB2 = objB3;
            chaloTextStyleHelper2 = chaloTextStyleHelper4;
            chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper2, (String) objB2, black_87, 0, null, null, null, null, 124);
            myTicketsComponent$productDisabledConfirmationDialogState$1.L$0 = chaloTextUIState;
            myTicketsComponent$productDisabledConfirmationDialogState$1.L$1 = chaloTextUIStateB;
            myTicketsComponent$productDisabledConfirmationDialogState$1.L$2 = chaloTextStyleHelper4;
            myTicketsComponent$productDisabledConfirmationDialogState$1.label = 3;
            objB = stringProvider.b(StringEnum.OKAY, new Object[0], myTicketsComponent$productDisabledConfirmationDialogState$1);
            if (objB != coroutineSingletons) {
                chaloTextUIState2 = chaloTextUIState;
                chaloTextUIState3 = chaloTextUIStateB;
                chaloTextStyleHelper3 = chaloTextStyleHelper4;
                objB2 = objB;
                return new ConfirmationDialogUiState(chaloTextUIState2, chaloTextUIState3, new ConfirmationDialogActionCtaContainerUiState(new DialogueCtaUiState(ChaloTextStyleHelper.f(chaloTextStyleHelper3, (String) objB2, ChaloColorToken.OrangePrimary.f9835a, null, null, 124), UiEventHandler.Companion.a(new qk0(myTicketsComponent, 1))), null, 5), DialogUIEventHandler.a(DialogUIEventHandler.d, DialogDismissRequest.Companion.a(new qk0(myTicketsComponent, 2))), 1);
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object Z0(MyTicketsComponent myTicketsComponent, ContinuationImpl continuationImpl) {
        MyTicketsComponent$productReclaimUiState$1 myTicketsComponent$productReclaimUiState$1;
        TextUIState.ChaloTextUIState chaloTextUIState;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        ButtonUIStateFactory buttonUIStateFactory;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        ButtonUIStateFactory buttonUIStateFactory2;
        StringProvider stringProvider = myTicketsComponent.r;
        if (continuationImpl instanceof MyTicketsComponent$productReclaimUiState$1) {
            myTicketsComponent$productReclaimUiState$1 = (MyTicketsComponent$productReclaimUiState$1) continuationImpl;
            int i = myTicketsComponent$productReclaimUiState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                myTicketsComponent$productReclaimUiState$1.label = i - Integer.MIN_VALUE;
            } else {
                myTicketsComponent$productReclaimUiState$1 = new MyTicketsComponent$productReclaimUiState$1(myTicketsComponent, continuationImpl);
            }
        } else {
            myTicketsComponent$productReclaimUiState$1 = new MyTicketsComponent$productReclaimUiState$1(myTicketsComponent, continuationImpl);
        }
        Object objB = myTicketsComponent$productReclaimUiState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = myTicketsComponent$productReclaimUiState$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            myTicketsComponent$productReclaimUiState$1.label = 1;
            objB = stringProvider.b(StringEnum.PRODUCTS_UNAVAILABLE, new Object[0], myTicketsComponent$productReclaimUiState$1);
            if (objB != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ResultKt.b(objB);
        } else {
            if (i2 == 2) {
                chaloTextUIState = (TextUIState.ChaloTextUIState) myTicketsComponent$productReclaimUiState$1.L$0;
                ResultKt.b(objB);
                chaloTextUIState2 = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodySmall, ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                myTicketsComponent$productReclaimUiState$1.L$0 = chaloTextUIState;
                myTicketsComponent$productReclaimUiState$1.L$1 = chaloTextUIState2;
                buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                myTicketsComponent$productReclaimUiState$1.L$2 = buttonUIStateFactory;
                myTicketsComponent$productReclaimUiState$1.label = 3;
                objB = stringProvider.b(StringEnum.RECLAIM, new Object[0], myTicketsComponent$productReclaimUiState$1);
                if (objB != coroutineSingletons) {
                    chaloTextUIState3 = chaloTextUIState;
                    buttonUIStateFactory2 = buttonUIStateFactory;
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            buttonUIStateFactory2 = (ButtonUIStateFactory) myTicketsComponent$productReclaimUiState$1.L$2;
            TextUIState.ChaloTextUIState chaloTextUIState4 = (TextUIState.ChaloTextUIState) myTicketsComponent$productReclaimUiState$1.L$1;
            TextUIState.ChaloTextUIState chaloTextUIState5 = (TextUIState.ChaloTextUIState) myTicketsComponent$productReclaimUiState$1.L$0;
            ResultKt.b(objB);
            chaloTextUIState3 = chaloTextUIState5;
            chaloTextUIState2 = chaloTextUIState4;
        }
        return new ProductReclaimUiState(ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB, UITextStyle.HeadlineSmall, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new qk0(myTicketsComponent, 11), null, false, 0.0f, 60), chaloTextUIState3, chaloTextUIState2);
        TextUIState.ChaloTextUIState chaloTextUIState6 = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.DisplaySmall, ChaloColorToken.Black.f9759a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
        myTicketsComponent$productReclaimUiState$1.L$0 = chaloTextUIState6;
        myTicketsComponent$productReclaimUiState$1.label = 2;
        objB = stringProvider.b(StringEnum.PRODUCTS_UNAVAILABLE_DESC, new Object[0], myTicketsComponent$productReclaimUiState$1);
        if (objB != coroutineSingletons) {
            chaloTextUIState = chaloTextUIState6;
            chaloTextUIState2 = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodySmall, ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
            myTicketsComponent$productReclaimUiState$1.L$0 = chaloTextUIState;
            myTicketsComponent$productReclaimUiState$1.L$1 = chaloTextUIState2;
            buttonUIStateFactory = ButtonUIStateFactory.f9921a;
            myTicketsComponent$productReclaimUiState$1.L$2 = buttonUIStateFactory;
            myTicketsComponent$productReclaimUiState$1.label = 3;
            objB = stringProvider.b(StringEnum.RECLAIM, new Object[0], myTicketsComponent$productReclaimUiState$1);
            if (objB != coroutineSingletons) {
                chaloTextUIState3 = chaloTextUIState;
                buttonUIStateFactory2 = buttonUIStateFactory;
                return new ProductReclaimUiState(ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB, UITextStyle.HeadlineSmall, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new qk0(myTicketsComponent, 11), null, false, 0.0f, 60), chaloTextUIState3, chaloTextUIState2);
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object a1(MyTicketsComponent myTicketsComponent, ContinuationImpl continuationImpl) {
        MyTicketsComponent$productValidityExpiredConfirmationDialogState$1 myTicketsComponent$productValidityExpiredConfirmationDialogState$1;
        ChaloTextStyleHelper chaloTextStyleHelper;
        TextUIState.ChaloTextUIState chaloTextUIState;
        ChaloTextStyleHelper chaloTextStyleHelper2;
        TextUIState.ChaloTextUIState chaloTextUIStateB;
        Object objB;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        ChaloTextStyleHelper chaloTextStyleHelper3;
        StringProvider stringProvider = myTicketsComponent.r;
        if (continuationImpl instanceof MyTicketsComponent$productValidityExpiredConfirmationDialogState$1) {
            myTicketsComponent$productValidityExpiredConfirmationDialogState$1 = (MyTicketsComponent$productValidityExpiredConfirmationDialogState$1) continuationImpl;
            int i = myTicketsComponent$productValidityExpiredConfirmationDialogState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                myTicketsComponent$productValidityExpiredConfirmationDialogState$1.label = i - Integer.MIN_VALUE;
            } else {
                myTicketsComponent$productValidityExpiredConfirmationDialogState$1 = new MyTicketsComponent$productValidityExpiredConfirmationDialogState$1(myTicketsComponent, continuationImpl);
            }
        } else {
            myTicketsComponent$productValidityExpiredConfirmationDialogState$1 = new MyTicketsComponent$productValidityExpiredConfirmationDialogState$1(myTicketsComponent, continuationImpl);
        }
        Object objB2 = myTicketsComponent$productValidityExpiredConfirmationDialogState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = myTicketsComponent$productValidityExpiredConfirmationDialogState$1.label;
        ChaloColorToken.Black_87 black_87 = ChaloColorToken.Black_87.f9768a;
        ChaloTextStyleHelper chaloTextStyleHelper4 = ChaloTextStyleHelper.f10078a;
        if (i2 == 0) {
            ResultKt.b(objB2);
            myTicketsComponent$productValidityExpiredConfirmationDialogState$1.L$0 = chaloTextStyleHelper4;
            myTicketsComponent$productValidityExpiredConfirmationDialogState$1.label = 1;
            objB2 = stringProvider.b(StringEnum.VALIDITY_EXPIRED_TITLE_RECENT_PRODUCTS, new Object[0], myTicketsComponent$productValidityExpiredConfirmationDialogState$1);
            if (objB2 != coroutineSingletons) {
                chaloTextStyleHelper = chaloTextStyleHelper4;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ChaloTextStyleHelper chaloTextStyleHelper5 = (ChaloTextStyleHelper) myTicketsComponent$productValidityExpiredConfirmationDialogState$1.L$0;
            ResultKt.b(objB2);
            chaloTextStyleHelper = chaloTextStyleHelper5;
        } else {
            if (i2 == 2) {
                ChaloTextStyleHelper chaloTextStyleHelper6 = (ChaloTextStyleHelper) myTicketsComponent$productValidityExpiredConfirmationDialogState$1.L$1;
                TextUIState.ChaloTextUIState chaloTextUIState4 = (TextUIState.ChaloTextUIState) myTicketsComponent$productValidityExpiredConfirmationDialogState$1.L$0;
                ResultKt.b(objB2);
                chaloTextStyleHelper2 = chaloTextStyleHelper6;
                chaloTextUIState = chaloTextUIState4;
                chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper2, (String) objB2, black_87, 0, null, null, null, null, 124);
                myTicketsComponent$productValidityExpiredConfirmationDialogState$1.L$0 = chaloTextUIState;
                myTicketsComponent$productValidityExpiredConfirmationDialogState$1.L$1 = chaloTextUIStateB;
                myTicketsComponent$productValidityExpiredConfirmationDialogState$1.L$2 = chaloTextStyleHelper4;
                myTicketsComponent$productValidityExpiredConfirmationDialogState$1.label = 3;
                objB = stringProvider.b(StringEnum.OKAY, new Object[0], myTicketsComponent$productValidityExpiredConfirmationDialogState$1);
                if (objB != coroutineSingletons) {
                    chaloTextUIState2 = chaloTextUIState;
                    chaloTextUIState3 = chaloTextUIStateB;
                    chaloTextStyleHelper3 = chaloTextStyleHelper4;
                    objB2 = objB;
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ChaloTextStyleHelper chaloTextStyleHelper7 = (ChaloTextStyleHelper) myTicketsComponent$productValidityExpiredConfirmationDialogState$1.L$2;
            TextUIState.ChaloTextUIState chaloTextUIState5 = (TextUIState.ChaloTextUIState) myTicketsComponent$productValidityExpiredConfirmationDialogState$1.L$1;
            chaloTextUIState2 = (TextUIState.ChaloTextUIState) myTicketsComponent$productValidityExpiredConfirmationDialogState$1.L$0;
            ResultKt.b(objB2);
            chaloTextUIState3 = chaloTextUIState5;
            chaloTextStyleHelper3 = chaloTextStyleHelper7;
        }
        return new ConfirmationDialogUiState(chaloTextUIState2, chaloTextUIState3, new ConfirmationDialogActionCtaContainerUiState(new DialogueCtaUiState(ChaloTextStyleHelper.f(chaloTextStyleHelper3, (String) objB2, ChaloColorToken.OrangePrimary.f9835a, null, null, 124), UiEventHandler.Companion.a(new qk0(myTicketsComponent, 7))), null, 5), DialogUIEventHandler.a(DialogUIEventHandler.d, DialogDismissRequest.Companion.a(new qk0(myTicketsComponent, 8))), 1);
        TextUIState.ChaloTextUIState chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper, (String) objB2, black_87, null, null, 124);
        myTicketsComponent$productValidityExpiredConfirmationDialogState$1.L$0 = chaloTextUIStateF;
        myTicketsComponent$productValidityExpiredConfirmationDialogState$1.L$1 = chaloTextStyleHelper4;
        myTicketsComponent$productValidityExpiredConfirmationDialogState$1.label = 2;
        Object objB3 = stringProvider.b(StringEnum.VALIDITY_EXPIRED_DESC_RECENT_PRODUCTS, new Object[0], myTicketsComponent$productValidityExpiredConfirmationDialogState$1);
        if (objB3 != coroutineSingletons) {
            chaloTextUIState = chaloTextUIStateF;
            objB2 = objB3;
            chaloTextStyleHelper2 = chaloTextStyleHelper4;
            chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper2, (String) objB2, black_87, 0, null, null, null, null, 124);
            myTicketsComponent$productValidityExpiredConfirmationDialogState$1.L$0 = chaloTextUIState;
            myTicketsComponent$productValidityExpiredConfirmationDialogState$1.L$1 = chaloTextUIStateB;
            myTicketsComponent$productValidityExpiredConfirmationDialogState$1.L$2 = chaloTextStyleHelper4;
            myTicketsComponent$productValidityExpiredConfirmationDialogState$1.label = 3;
            objB = stringProvider.b(StringEnum.OKAY, new Object[0], myTicketsComponent$productValidityExpiredConfirmationDialogState$1);
            if (objB != coroutineSingletons) {
                chaloTextUIState2 = chaloTextUIState;
                chaloTextUIState3 = chaloTextUIStateB;
                chaloTextStyleHelper3 = chaloTextStyleHelper4;
                objB2 = objB;
                return new ConfirmationDialogUiState(chaloTextUIState2, chaloTextUIState3, new ConfirmationDialogActionCtaContainerUiState(new DialogueCtaUiState(ChaloTextStyleHelper.f(chaloTextStyleHelper3, (String) objB2, ChaloColorToken.OrangePrimary.f9835a, null, null, 124), UiEventHandler.Companion.a(new qk0(myTicketsComponent, 7))), null, 5), DialogUIEventHandler.a(DialogUIEventHandler.d, DialogDismissRequest.Companion.a(new qk0(myTicketsComponent, 8))), 1);
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object b1(MyTicketsComponent myTicketsComponent, ContinuationImpl continuationImpl) {
        MyTicketsComponent$reclaimProductConfirmationDialogState$1 myTicketsComponent$reclaimProductConfirmationDialogState$1;
        ChaloTextStyleHelper chaloTextStyleHelper;
        TextUIState.ChaloTextUIState chaloTextUIState;
        ChaloTextStyleHelper chaloTextStyleHelper2;
        DialogueCtaUiState dialogueCtaUiState;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        DialogueCtaUiState dialogueCtaUiState2;
        StringProvider stringProvider = myTicketsComponent.r;
        if (continuationImpl instanceof MyTicketsComponent$reclaimProductConfirmationDialogState$1) {
            myTicketsComponent$reclaimProductConfirmationDialogState$1 = (MyTicketsComponent$reclaimProductConfirmationDialogState$1) continuationImpl;
            int i = myTicketsComponent$reclaimProductConfirmationDialogState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                myTicketsComponent$reclaimProductConfirmationDialogState$1.label = i - Integer.MIN_VALUE;
            } else {
                myTicketsComponent$reclaimProductConfirmationDialogState$1 = new MyTicketsComponent$reclaimProductConfirmationDialogState$1(myTicketsComponent, continuationImpl);
            }
        } else {
            myTicketsComponent$reclaimProductConfirmationDialogState$1 = new MyTicketsComponent$reclaimProductConfirmationDialogState$1(myTicketsComponent, continuationImpl);
        }
        Object objB = myTicketsComponent$reclaimProductConfirmationDialogState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = myTicketsComponent$reclaimProductConfirmationDialogState$1.label;
        ChaloColorToken.OrangePrimary orangePrimary = ChaloColorToken.OrangePrimary.f9835a;
        ChaloTextStyleHelper chaloTextStyleHelper3 = ChaloTextStyleHelper.f10078a;
        if (i2 == 0) {
            ResultKt.b(objB);
            myTicketsComponent$reclaimProductConfirmationDialogState$1.L$0 = chaloTextStyleHelper3;
            myTicketsComponent$reclaimProductConfirmationDialogState$1.label = 1;
            objB = stringProvider.b(StringEnum.DIALOG_MESSAGE_CONFIRM_RECLAIM_PASS, new Object[0], myTicketsComponent$reclaimProductConfirmationDialogState$1);
            if (objB != coroutineSingletons) {
                chaloTextStyleHelper = chaloTextStyleHelper3;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ChaloTextStyleHelper chaloTextStyleHelper4 = (ChaloTextStyleHelper) myTicketsComponent$reclaimProductConfirmationDialogState$1.L$0;
            ResultKt.b(objB);
            chaloTextStyleHelper = chaloTextStyleHelper4;
        } else {
            if (i2 == 2) {
                ChaloTextStyleHelper chaloTextStyleHelper5 = (ChaloTextStyleHelper) myTicketsComponent$reclaimProductConfirmationDialogState$1.L$1;
                TextUIState.ChaloTextUIState chaloTextUIState3 = (TextUIState.ChaloTextUIState) myTicketsComponent$reclaimProductConfirmationDialogState$1.L$0;
                ResultKt.b(objB);
                chaloTextStyleHelper2 = chaloTextStyleHelper5;
                chaloTextUIState = chaloTextUIState3;
                dialogueCtaUiState = new DialogueCtaUiState(ChaloTextStyleHelper.f(chaloTextStyleHelper2, (String) objB, orangePrimary, null, null, 124), UiEventHandler.Companion.a(new qk0(myTicketsComponent, 5)));
                myTicketsComponent$reclaimProductConfirmationDialogState$1.L$0 = chaloTextUIState;
                myTicketsComponent$reclaimProductConfirmationDialogState$1.L$1 = dialogueCtaUiState;
                myTicketsComponent$reclaimProductConfirmationDialogState$1.L$2 = chaloTextStyleHelper3;
                myTicketsComponent$reclaimProductConfirmationDialogState$1.label = 3;
                objB = stringProvider.b(StringEnum.NO_CAPS, new Object[0], myTicketsComponent$reclaimProductConfirmationDialogState$1);
                if (objB != coroutineSingletons) {
                    chaloTextUIState2 = chaloTextUIState;
                    dialogueCtaUiState2 = dialogueCtaUiState;
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chaloTextStyleHelper3 = (ChaloTextStyleHelper) myTicketsComponent$reclaimProductConfirmationDialogState$1.L$2;
            dialogueCtaUiState2 = (DialogueCtaUiState) myTicketsComponent$reclaimProductConfirmationDialogState$1.L$1;
            TextUIState.ChaloTextUIState chaloTextUIState4 = (TextUIState.ChaloTextUIState) myTicketsComponent$reclaimProductConfirmationDialogState$1.L$0;
            ResultKt.b(objB);
            chaloTextUIState2 = chaloTextUIState4;
        }
        return new ConfirmationDialogUiState(null, chaloTextUIState2, new ConfirmationDialogActionCtaContainerUiState(dialogueCtaUiState2, new DialogueCtaUiState(ChaloTextStyleHelper.f(chaloTextStyleHelper3, (String) objB, orangePrimary, null, null, 124), UiEventHandler.Companion.a(new qk0(myTicketsComponent, 6))), 1), null, 19);
        TextUIState.ChaloTextUIState chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper, (String) objB, ChaloColorToken.Black_87.f9768a, 0, null, null, null, null, 124);
        myTicketsComponent$reclaimProductConfirmationDialogState$1.L$0 = chaloTextUIStateB;
        myTicketsComponent$reclaimProductConfirmationDialogState$1.L$1 = chaloTextStyleHelper3;
        myTicketsComponent$reclaimProductConfirmationDialogState$1.label = 2;
        Object objB2 = stringProvider.b(StringEnum.YES, new Object[0], myTicketsComponent$reclaimProductConfirmationDialogState$1);
        if (objB2 != coroutineSingletons) {
            chaloTextUIState = chaloTextUIStateB;
            objB = objB2;
            chaloTextStyleHelper2 = chaloTextStyleHelper3;
            dialogueCtaUiState = new DialogueCtaUiState(ChaloTextStyleHelper.f(chaloTextStyleHelper2, (String) objB, orangePrimary, null, null, 124), UiEventHandler.Companion.a(new qk0(myTicketsComponent, 5)));
            myTicketsComponent$reclaimProductConfirmationDialogState$1.L$0 = chaloTextUIState;
            myTicketsComponent$reclaimProductConfirmationDialogState$1.L$1 = dialogueCtaUiState;
            myTicketsComponent$reclaimProductConfirmationDialogState$1.L$2 = chaloTextStyleHelper3;
            myTicketsComponent$reclaimProductConfirmationDialogState$1.label = 3;
            objB = stringProvider.b(StringEnum.NO_CAPS, new Object[0], myTicketsComponent$reclaimProductConfirmationDialogState$1);
            if (objB != coroutineSingletons) {
                chaloTextUIState2 = chaloTextUIState;
                dialogueCtaUiState2 = dialogueCtaUiState;
                return new ConfirmationDialogUiState(null, chaloTextUIState2, new ConfirmationDialogActionCtaContainerUiState(dialogueCtaUiState2, new DialogueCtaUiState(ChaloTextStyleHelper.f(chaloTextStyleHelper3, (String) objB, orangePrimary, null, null, 124), UiEventHandler.Companion.a(new qk0(myTicketsComponent, 6))), 1), null, 19);
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object c1(MyTicketsComponent myTicketsComponent, ChaloUserBookingType chaloUserBookingType, ContinuationImpl continuationImpl) {
        MyTicketsComponent$startBleValidation$1 myTicketsComponent$startBleValidation$1;
        ValidationProduct validationProductD;
        ChaloNavigationManager chaloNavigationManager;
        myTicketsComponent.getClass();
        if (continuationImpl instanceof MyTicketsComponent$startBleValidation$1) {
            myTicketsComponent$startBleValidation$1 = (MyTicketsComponent$startBleValidation$1) continuationImpl;
            int i = myTicketsComponent$startBleValidation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                myTicketsComponent$startBleValidation$1.label = i - Integer.MIN_VALUE;
            } else {
                myTicketsComponent$startBleValidation$1 = new MyTicketsComponent$startBleValidation$1(myTicketsComponent, continuationImpl);
            }
        } else {
            myTicketsComponent$startBleValidation$1 = new MyTicketsComponent$startBleValidation$1(myTicketsComponent, continuationImpl);
        }
        Object objA = myTicketsComponent$startBleValidation$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = myTicketsComponent$startBleValidation$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                validationProductD = (ValidationProduct) myTicketsComponent$startBleValidation$1.L$0;
                ResultKt.b(objA);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                chaloNavigationManager = (ChaloNavigationManager) myTicketsComponent$startBleValidation$1.L$0;
                ResultKt.b(objA);
            }
            ChaloNavigationManagerKt.e(chaloNavigationManager, (SceneArgs) objA, null, 2);
            return Unit.f17538a;
        }
        ResultKt.b(objA);
        validationProductD = GetAllRequestedBookedProductsUseCaseKt.d(chaloUserBookingType);
        if (validationProductD != null) {
            GetValidationProcessFlowDetailsForValidationProductUseCase getValidationProcessFlowDetailsForValidationProductUseCase = myTicketsComponent.z;
            myTicketsComponent$startBleValidation$1.L$0 = validationProductD;
            myTicketsComponent$startBleValidation$1.label = 1;
            objA = getValidationProcessFlowDetailsForValidationProductUseCase.a(validationProductD, myTicketsComponent$startBleValidation$1);
            if (objA != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        return Unit.f17538a;
        ChaloNavigationManager chaloNavigationManager2 = myTicketsComponent.Q;
        ValidationSceneResolverUseCase validationSceneResolverUseCase = myTicketsComponent.U;
        BleValidationArgs bleValidationArgs = new BleValidationArgs(Source.MY_TICKETS_SCREEN_TAB, (ValidationProcessFlowDetails) objA, validationProductD);
        myTicketsComponent$startBleValidation$1.L$0 = chaloNavigationManager2;
        myTicketsComponent$startBleValidation$1.label = 2;
        validationSceneResolverUseCase.getClass();
        float f = PlatformFeature.f10436a;
        objA = validationSceneResolverUseCase.a(bleValidationArgs, myTicketsComponent$startBleValidation$1);
        if (objA != coroutineSingletons) {
            chaloNavigationManager = chaloNavigationManager2;
            ChaloNavigationManagerKt.e(chaloNavigationManager, (SceneArgs) objA, null, 2);
            return Unit.f17538a;
        }
        return coroutineSingletons;
    }

    public static Set g1(boolean z) {
        Set<Object> setA = UserBookingsRequestType.Companion.a();
        ArrayList arrayList = new ArrayList();
        for (Object premiumBusTicketType : setA) {
            if (!(premiumBusTicketType instanceof UserBookingsRequestType.QuickPayType) && !(premiumBusTicketType instanceof UserBookingsRequestType.InstantTicketType) && !(premiumBusTicketType instanceof UserBookingsRequestType.MobileTicketType) && !(premiumBusTicketType instanceof UserBookingsRequestType.SuperPassType) && !(premiumBusTicketType instanceof UserBookingsRequestType.OndcTicketType) && !(premiumBusTicketType instanceof UserBookingsRequestType.OndcMetroTicketType) && !(premiumBusTicketType instanceof UserBookingsRequestType.MetroTicket) && !(premiumBusTicketType instanceof UserBookingsRequestType.SuperPassRideType)) {
                if (premiumBusTicketType instanceof UserBookingsRequestType.PremiumBusTicketType) {
                    premiumBusTicketType = new UserBookingsRequestType.PremiumBusTicketType(z);
                } else if (!Intrinsics.d(premiumBusTicketType, UserBookingsRequestType.MultiModalGroupTicketType.f3096a)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            if (premiumBusTicketType != null) {
                arrayList.add(premiumBusTicketType);
            }
        }
        return CollectionsKt.G0(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object A1(ChaloUserBookingType.TicketBooking.PremiumBusBooking premiumBusBooking, ContinuationImpl continuationImpl) {
        MyTicketsComponent$startPremiumBusActivationFlow$1 myTicketsComponent$startPremiumBusActivationFlow$1;
        PremiumReserveTicketAppModel premiumReserveTicketAppModel;
        Object objC;
        if (continuationImpl instanceof MyTicketsComponent$startPremiumBusActivationFlow$1) {
            myTicketsComponent$startPremiumBusActivationFlow$1 = (MyTicketsComponent$startPremiumBusActivationFlow$1) continuationImpl;
            int i = myTicketsComponent$startPremiumBusActivationFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                myTicketsComponent$startPremiumBusActivationFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                myTicketsComponent$startPremiumBusActivationFlow$1 = new MyTicketsComponent$startPremiumBusActivationFlow$1(this, continuationImpl);
            }
        } else {
            myTicketsComponent$startPremiumBusActivationFlow$1 = new MyTicketsComponent$startPremiumBusActivationFlow$1(this, continuationImpl);
        }
        Object obj = myTicketsComponent$startPremiumBusActivationFlow$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = myTicketsComponent$startPremiumBusActivationFlow$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            premiumReserveTicketAppModel = premiumBusBooking.d;
            myTicketsComponent$startPremiumBusActivationFlow$1.L$0 = premiumBusBooking;
            myTicketsComponent$startPremiumBusActivationFlow$1.L$1 = premiumReserveTicketAppModel;
            myTicketsComponent$startPremiumBusActivationFlow$1.L$2 = premiumReserveTicketAppModel;
            myTicketsComponent$startPremiumBusActivationFlow$1.label = 1;
            objC = this.k.c(myTicketsComponent$startPremiumBusActivationFlow$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            PremiumReserveTicketAppModel premiumReserveTicketAppModel2 = (PremiumReserveTicketAppModel) myTicketsComponent$startPremiumBusActivationFlow$1.L$2;
            ChaloUserBookingType.TicketBooking.PremiumBusBooking premiumBusBooking2 = (ChaloUserBookingType.TicketBooking.PremiumBusBooking) myTicketsComponent$startPremiumBusActivationFlow$1.L$0;
            ResultKt.b(obj);
            premiumReserveTicketAppModel = premiumReserveTicketAppModel2;
            premiumBusBooking = premiumBusBooking2;
            objC = obj;
        }
        if (premiumBusBooking.d.b(((Number) objC).longValue())) {
            PremiumReserveTicketBookingPropertiesAppModel premiumReserveTicketBookingPropertiesAppModel = premiumReserveTicketAppModel.f7113a;
            this.Q.b(new ChaloNavigationRequest.Navigate(new PremiumBusActivationArgs(Source.MY_TICKETS_SCREEN_TAB, premiumReserveTicketBookingPropertiesAppModel.f7114a, premiumReserveTicketBookingPropertiesAppModel.d, premiumReserveTicketBookingPropertiesAppModel.e, false), null, null, 6));
        }
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x041b  */
    /* JADX WARN: Code duplicated, block: B:105:0x043e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0446  */
    /* JADX WARN: Code duplicated, block: B:110:0x045a  */
    /* JADX WARN: Code duplicated, block: B:114:0x0478  */
    /* JADX WARN: Code duplicated, block: B:118:0x049b  */
    /* JADX WARN: Code duplicated, block: B:121:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:123:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:125:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:127:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:128:0x0533  */
    /* JADX WARN: Code duplicated, block: B:130:0x0537  */
    /* JADX WARN: Code duplicated, block: B:131:0x0587  */
    /* JADX WARN: Code duplicated, block: B:133:0x058b  */
    /* JADX WARN: Code duplicated, block: B:136:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:140:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:144:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:146:0x0603  */
    /* JADX WARN: Code duplicated, block: B:148:0x0607  */
    /* JADX WARN: Code duplicated, block: B:151:0x061c  */
    /* JADX WARN: Code duplicated, block: B:155:0x063c  */
    /* JADX WARN: Code duplicated, block: B:159:0x0661  */
    /* JADX WARN: Code duplicated, block: B:163:0x067d  */
    /* JADX WARN: Code duplicated, block: B:165:0x0683  */
    /* JADX WARN: Code duplicated, block: B:41:0x022f  */
    /* JADX WARN: Code duplicated, block: B:43:0x023a  */
    /* JADX WARN: Code duplicated, block: B:45:0x024a  */
    /* JADX WARN: Code duplicated, block: B:48:0x025d  */
    /* JADX WARN: Code duplicated, block: B:50:0x026b A[PHI: r1 r2 r5
      0x026b: PHI (r1v17 app.chalo.superpass.data.models.entities.SuperPass) = (r1v1 app.chalo.superpass.data.models.entities.SuperPass), (r1v19 app.chalo.superpass.data.models.entities.SuperPass) binds: [B:44:0x0248, B:49:0x0263] A[DONT_GENERATE, DONT_INLINE]
      0x026b: PHI (r2v16 app.chalo.home.domain.ChaloUserBookingType) = (r2v3 app.chalo.home.domain.ChaloUserBookingType), (r2v20 app.chalo.home.domain.ChaloUserBookingType) binds: [B:44:0x0248, B:49:0x0263] A[DONT_GENERATE, DONT_INLINE]
      0x026b: PHI (r5v55 java.lang.String) = (r5v48 java.lang.String), (r5v57 java.lang.String) binds: [B:44:0x0248, B:49:0x0263] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x0280  */
    /* JADX WARN: Code duplicated, block: B:57:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:61:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:64:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:68:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:72:0x031a  */
    /* JADX WARN: Code duplicated, block: B:75:0x033e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0346  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x035a  */
    /* JADX WARN: Code duplicated, block: B:84:0x0378  */
    /* JADX WARN: Code duplicated, block: B:88:0x039b  */
    /* JADX WARN: Code duplicated, block: B:90:0x03be  */
    /* JADX WARN: Code duplicated, block: B:92:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:95:0x03da  */
    /* JADX WARN: Code duplicated, block: B:99:0x03f8  */
    public final Object d1(SuperPass superPass, ChaloUserBookingType.SuperPassBooking superPassBooking, ContinuationImpl continuationImpl) {
        MyTicketsComponent$checkAndLaunchConfirmationFlow$1 myTicketsComponent$checkAndLaunchConfirmationFlow$1;
        ChaloUserBookingType chaloUserBookingType;
        Object objA;
        ChaloUseCaseResult chaloUseCaseResult;
        BookableProductConfigForRenewSuccessType bookableProductConfigForRenewSuccessType;
        boolean z;
        ChaloNavigationManager chaloNavigationManager;
        Object objB;
        SuperPass superPass2;
        BookableProductConfigForRenewSuccessType bookableProductConfigForRenewSuccessType2;
        ChaloUserBookingType chaloUserBookingType2;
        Object objB2;
        SuperPass superPass3;
        BookableProductConfigForRenewSuccessType bookableProductConfigForRenewSuccessType3;
        ChaloUserBookingType chaloUserBookingType3;
        Object obj;
        BookableProductConfigForRenewFailureReason bookableProductConfigForRenewFailureReason;
        Object objB3;
        SuperPass superPass4;
        ChaloUserBookingType chaloUserBookingType4;
        Object objB4;
        SuperPass superPass5;
        ChaloUserBookingType chaloUserBookingType5;
        Object objB5;
        SuperPass superPass6;
        ChaloUserBookingType chaloUserBookingType6;
        Object objB6;
        SuperPass superPass7;
        ChaloUserBookingType chaloUserBookingType7;
        String str;
        Object objB7;
        SuperPass superPass8;
        ChaloUserBookingType chaloUserBookingType8;
        Object objB8;
        ChaloUserBookingType chaloUserBookingType9;
        String str2;
        Object objB9;
        SuperPass superPass9;
        String str3;
        String str4;
        ChaloUserBookingType chaloUserBookingType10;
        TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet ticketsPageInfoBottomSheet;
        String str5;
        Object objB10;
        ChaloUserBookingType chaloUserBookingType11;
        String str6;
        String str7;
        Object objB11;
        String str8;
        String str9;
        SuperPass superPass10;
        ChaloUserBookingType chaloUserBookingType12;
        TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet ticketsPageInfoBottomSheet2;
        String str10;
        Object objB12;
        ChaloUserBookingType chaloUserBookingType13;
        String str11;
        String str12;
        Object objB13;
        String str13;
        String str14;
        SuperPass superPass11;
        ChaloUserBookingType chaloUserBookingType14;
        String str15;
        Object objB14;
        ChaloUserBookingType chaloUserBookingType15;
        String str16;
        String str17;
        Object objB15;
        String str18;
        String str19;
        SuperPass superPass12;
        ChaloUserBookingType chaloUserBookingType16;
        String str20;
        Object objB16;
        ChaloUserBookingType chaloUserBookingType17;
        String str21;
        String str22;
        Object objB17;
        String str23;
        String str24;
        SuperPass superPass13;
        ChaloUserBookingType chaloUserBookingType18;
        String str25;
        Object objB18;
        BookableProductConfigForRenewSuccessType bookableProductConfigForRenewSuccessType4;
        String str26;
        ChaloUserBookingType chaloUserBookingType19;
        String str27;
        Object objB19;
        final String str28;
        final String str29;
        final SuperPass superPass14;
        final ChaloUserBookingType chaloUserBookingType20;
        String str30;
        Object objB20;
        BookableProductConfigForRenewSuccessType bookableProductConfigForRenewSuccessType5;
        String str31;
        ChaloUserBookingType chaloUserBookingType21;
        String str32;
        Object objB21;
        final String str33;
        final String str34;
        final SuperPass superPass15;
        final ChaloUserBookingType chaloUserBookingType22;
        SuperPass superPass16 = superPass;
        if (continuationImpl instanceof MyTicketsComponent$checkAndLaunchConfirmationFlow$1) {
            myTicketsComponent$checkAndLaunchConfirmationFlow$1 = (MyTicketsComponent$checkAndLaunchConfirmationFlow$1) continuationImpl;
            int i = myTicketsComponent$checkAndLaunchConfirmationFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                myTicketsComponent$checkAndLaunchConfirmationFlow$1 = new MyTicketsComponent$checkAndLaunchConfirmationFlow$1(this, continuationImpl);
            }
        } else {
            myTicketsComponent$checkAndLaunchConfirmationFlow$1 = new MyTicketsComponent$checkAndLaunchConfirmationFlow$1(this, continuationImpl);
        }
        Object obj2 = myTicketsComponent$checkAndLaunchConfirmationFlow$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = myTicketsComponent$checkAndLaunchConfirmationFlow$1.label;
        HomeScreenInfoHelper homeScreenInfoHelper = this.n;
        StringProvider stringProvider = this.r;
        switch (i2) {
            case 0:
                ResultKt.b(obj2);
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass16;
                chaloUserBookingType = superPassBooking;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 1;
                objA = this.A.a(superPass16, myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                if (objA != coroutineSingletons) {
                    chaloUseCaseResult = (ChaloUseCaseResult) objA;
                    if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bookableProductConfigForRenewSuccessType = (BookableProductConfigForRenewSuccessType) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                        z = bookableProductConfigForRenewSuccessType instanceof BookableProductConfigForRenewSuccessType.BookingWithoutProofRequirement;
                        chaloNavigationManager = this.Q;
                        if (z) {
                            E0(new sk0(18));
                            Source source = Source.MY_TICKETS_SCREEN_TAB;
                            Json json = ChaloJson.b;
                            BookableSuperPassConfiguration bookableSuperPassConfiguration = ((BookableProductConfigForRenewSuccessType.BookingWithoutProofRequirement) bookableProductConfigForRenewSuccessType).f10149a;
                            json.getClass();
                            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.Renew(source, json.a(BookableSuperPassConfiguration.INSTANCE.serializer(), bookableSuperPassConfiguration), json.a(SuperPassUserDetails.INSTANCE.serializer(), superPass16.getC().c), superPass16.f9560a.f9566a, superPass16.d.d, PostPassPurchaseSuccessFlowType.ACTIVATION), null, null, 6));
                        } else if (bookableProductConfigForRenewSuccessType instanceof BookableProductConfigForRenewSuccessType.CanDirectlyGoToPurchaseConfirmation) {
                            E0(new sk0(19));
                            Source source2 = Source.MY_TICKETS_SCREEN_TAB;
                            Json json2 = ChaloJson.b;
                            BookableSuperPassConfiguration bookableSuperPassConfiguration2 = ((BookableProductConfigForRenewSuccessType.CanDirectlyGoToPurchaseConfirmation) bookableProductConfigForRenewSuccessType).f10150a;
                            json2.getClass();
                            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.Renew(source2, json2.a(BookableSuperPassConfiguration.INSTANCE.serializer(), bookableSuperPassConfiguration2), json2.a(SuperPassUserDetails.INSTANCE.serializer(), superPass16.getC().c), superPass16.f9560a.f9566a, superPass16.d.d, PostPassPurchaseSuccessFlowType.ACTIVATION), null, null, 6));
                        } else if (bookableProductConfigForRenewSuccessType instanceof BookableProductConfigForRenewSuccessType.PriceChanged) {
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass16;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = bookableProductConfigForRenewSuccessType;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 17;
                            objB2 = stringProvider.b(StringEnum.PRICE_CHANGED_TITLE, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                            if (objB2 != coroutineSingletons) {
                                superPass3 = superPass16;
                                bookableProductConfigForRenewSuccessType3 = bookableProductConfigForRenewSuccessType;
                                chaloUserBookingType3 = chaloUserBookingType;
                                obj2 = objB2;
                                str25 = (String) obj2;
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass3;
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType3;
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = bookableProductConfigForRenewSuccessType3;
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$3 = str25;
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 18;
                                objB18 = stringProvider.b(StringEnum.PRICE_CHANGED_MSG, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                                if (objB18 != coroutineSingletons) {
                                    ChaloUserBookingType chaloUserBookingType23 = chaloUserBookingType3;
                                    bookableProductConfigForRenewSuccessType4 = bookableProductConfigForRenewSuccessType3;
                                    str26 = str25;
                                    obj2 = objB18;
                                    chaloUserBookingType19 = chaloUserBookingType23;
                                    str27 = (String) obj2;
                                    u1(str26, str27, superPass3);
                                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass3;
                                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType19;
                                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = bookableProductConfigForRenewSuccessType4;
                                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$3 = str26;
                                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$4 = str27;
                                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 19;
                                    objB19 = stringProvider.b(StringEnum.OKAY, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                                    if (objB19 != coroutineSingletons) {
                                        str28 = str26;
                                        str29 = str27;
                                        obj2 = objB19;
                                        superPass14 = superPass3;
                                        chaloUserBookingType20 = chaloUserBookingType19;
                                        final BookableProductConfigForRenewSuccessType bookableProductConfigForRenewSuccessType6 = bookableProductConfigForRenewSuccessType4;
                                        final String str35 = (String) obj2;
                                        final int i3 = 0;
                                        E0(new Function1() { // from class: uk0
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj3) {
                                                MyTicketsDataState it = (MyTicketsDataState) obj3;
                                                switch (i3) {
                                                    case 0:
                                                        Intrinsics.i(it, "it");
                                                        return MyTicketsDataState.a(it, null, null, null, false, false, null, null, new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str28, str29, str35, null), ((BookableProductConfigForRenewSuccessType.PriceChanged) bookableProductConfigForRenewSuccessType6).f10151a, superPass14, chaloUserBookingType20, TicketsPageInfoBottomSheetPositiveCtaType.PRICE_CHANGED, null, 32), null, false, null, false, null, false, false, null, false, null, null, null, false, 33521151);
                                                    default:
                                                        Intrinsics.i(it, "it");
                                                        return MyTicketsDataState.a(it, null, null, null, false, false, null, null, new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str28, str29, str35, null), ((BookableProductConfigForRenewSuccessType.ProofRequirementChanged) bookableProductConfigForRenewSuccessType6).f10152a, superPass14, chaloUserBookingType20, TicketsPageInfoBottomSheetPositiveCtaType.PROOF_REQUIRED, null, 32), null, false, null, false, null, false, false, null, false, null, null, null, false, 33521151);
                                                }
                                            }
                                        });
                                        homeScreenInfoHelper.d(false);
                                    }
                                }
                            }
                        } else {
                            if (bookableProductConfigForRenewSuccessType instanceof BookableProductConfigForRenewSuccessType.ProofRequirementChanged) {
                                throw new NoWhenBranchMatchedException();
                            }
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass16;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = bookableProductConfigForRenewSuccessType;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 20;
                            objB = stringProvider.b(StringEnum.PROOF_REQUIREMENT_CHANGED_TITLE, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                            if (objB != coroutineSingletons) {
                                superPass2 = superPass16;
                                bookableProductConfigForRenewSuccessType2 = bookableProductConfigForRenewSuccessType;
                                chaloUserBookingType2 = chaloUserBookingType;
                                obj2 = objB;
                                str30 = (String) obj2;
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass2;
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType2;
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = bookableProductConfigForRenewSuccessType2;
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$3 = str30;
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 21;
                                objB20 = stringProvider.b(StringEnum.PROOF_REQUIREMENT_CHANGED_MSG, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                                if (objB20 != coroutineSingletons) {
                                    ChaloUserBookingType chaloUserBookingType24 = chaloUserBookingType2;
                                    bookableProductConfigForRenewSuccessType5 = bookableProductConfigForRenewSuccessType2;
                                    str31 = str30;
                                    obj2 = objB20;
                                    chaloUserBookingType21 = chaloUserBookingType24;
                                    str32 = (String) obj2;
                                    u1(str31, str32, superPass2);
                                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass2;
                                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType21;
                                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = bookableProductConfigForRenewSuccessType5;
                                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$3 = str31;
                                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$4 = str32;
                                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 22;
                                    objB21 = stringProvider.b(StringEnum.OKAY, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                                    if (objB21 != coroutineSingletons) {
                                        str33 = str31;
                                        str34 = str32;
                                        obj2 = objB21;
                                        superPass15 = superPass2;
                                        chaloUserBookingType22 = chaloUserBookingType21;
                                        final BookableProductConfigForRenewSuccessType bookableProductConfigForRenewSuccessType7 = bookableProductConfigForRenewSuccessType5;
                                        final String str36 = (String) obj2;
                                        final int i4 = 1;
                                        E0(new Function1() { // from class: uk0
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj3) {
                                                MyTicketsDataState it = (MyTicketsDataState) obj3;
                                                switch (i4) {
                                                    case 0:
                                                        Intrinsics.i(it, "it");
                                                        return MyTicketsDataState.a(it, null, null, null, false, false, null, null, new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str33, str34, str36, null), ((BookableProductConfigForRenewSuccessType.PriceChanged) bookableProductConfigForRenewSuccessType7).f10151a, superPass15, chaloUserBookingType22, TicketsPageInfoBottomSheetPositiveCtaType.PRICE_CHANGED, null, 32), null, false, null, false, null, false, false, null, false, null, null, null, false, 33521151);
                                                    default:
                                                        Intrinsics.i(it, "it");
                                                        return MyTicketsDataState.a(it, null, null, null, false, false, null, null, new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str33, str34, str36, null), ((BookableProductConfigForRenewSuccessType.ProofRequirementChanged) bookableProductConfigForRenewSuccessType7).f10152a, superPass15, chaloUserBookingType22, TicketsPageInfoBottomSheetPositiveCtaType.PROOF_REQUIRED, null, 32), null, false, null, false, null, false, false, null, false, null, null, null, false, 33521151);
                                                }
                                            }
                                        });
                                        homeScreenInfoHelper.d(false);
                                    }
                                }
                            }
                        }
                        return Unit.f17538a;
                    }
                    obj = ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
                    bookableProductConfigForRenewFailureReason = (BookableProductConfigForRenewFailureReason) obj;
                    if (bookableProductConfigForRenewFailureReason instanceof BookableProductConfigForRenewFailureReason.BookableConfigNotActive) {
                        Intrinsics.g(obj, "null cannot be cast to non-null type app.chalo.usecase.BookableProductConfigForRenewFailureReason.BookableConfigNotActive");
                        str = ((BookableProductConfigForRenewFailureReason.BookableConfigNotActive) obj).f10144a;
                        if (str.length() == 0) {
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass16;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 2;
                            objB7 = stringProvider.b(StringEnum.PRODUCT_NOT_AVAILABLE_FOR_PURCHASE_TRY_LATER, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                            if (objB7 != coroutineSingletons) {
                                superPass8 = superPass16;
                                chaloUserBookingType8 = chaloUserBookingType;
                                obj2 = objB7;
                                String str37 = (String) obj2;
                                chaloUserBookingType = chaloUserBookingType8;
                                superPass16 = superPass8;
                                str = str37;
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass16;
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType;
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = str;
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 3;
                                objB8 = stringProvider.b(StringEnum.BOOKABLE_CONFIG_INACTIVE_TITLE, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                                if (objB8 != coroutineSingletons) {
                                    chaloUserBookingType9 = chaloUserBookingType;
                                    obj2 = objB8;
                                    str2 = (String) obj2;
                                    u1(str2, str, superPass16);
                                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass16;
                                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType9;
                                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = str;
                                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$3 = str2;
                                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 4;
                                    objB9 = stringProvider.b(StringEnum.OKAY, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                                    if (objB9 != coroutineSingletons) {
                                        superPass9 = superPass16;
                                        str3 = str2;
                                        obj2 = objB9;
                                        str4 = str;
                                        chaloUserBookingType10 = chaloUserBookingType9;
                                        ticketsPageInfoBottomSheet = new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str3, str4, (String) obj2, null), null, superPass9, chaloUserBookingType10, TicketsPageInfoBottomSheetPositiveCtaType.BOOKABLE_CONFIG_INACTIVE, null, 34);
                                        E0(new tk0(ticketsPageInfoBottomSheet, 1));
                                        homeScreenInfoHelper.d(false);
                                        return Unit.f17538a;
                                    }
                                }
                            }
                        } else {
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass16;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = str;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 3;
                            objB8 = stringProvider.b(StringEnum.BOOKABLE_CONFIG_INACTIVE_TITLE, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                            if (objB8 != coroutineSingletons) {
                                chaloUserBookingType9 = chaloUserBookingType;
                                obj2 = objB8;
                                str2 = (String) obj2;
                                u1(str2, str, superPass16);
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass16;
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType9;
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = str;
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$3 = str2;
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 4;
                                objB9 = stringProvider.b(StringEnum.OKAY, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                                if (objB9 != coroutineSingletons) {
                                    superPass9 = superPass16;
                                    str3 = str2;
                                    obj2 = objB9;
                                    str4 = str;
                                    chaloUserBookingType10 = chaloUserBookingType9;
                                    ticketsPageInfoBottomSheet = new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str3, str4, (String) obj2, null), null, superPass9, chaloUserBookingType10, TicketsPageInfoBottomSheetPositiveCtaType.BOOKABLE_CONFIG_INACTIVE, null, 34);
                                    E0(new tk0(ticketsPageInfoBottomSheet, 1));
                                    homeScreenInfoHelper.d(false);
                                    return Unit.f17538a;
                                }
                            }
                        }
                    } else if (Intrinsics.d(bookableProductConfigForRenewFailureReason, BookableProductConfigForRenewFailureReason.BookableConfigNotAvailable.f10145a)) {
                        myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass16;
                        myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType;
                        myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 5;
                        objB6 = stringProvider.b(StringEnum.PRODUCT_CONFIG_UNAVAILABLE_TITLE, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                        if (objB6 != coroutineSingletons) {
                            superPass7 = superPass16;
                            chaloUserBookingType7 = chaloUserBookingType;
                            obj2 = objB6;
                            str5 = (String) obj2;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass7;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType7;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = str5;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 6;
                            objB10 = stringProvider.b(StringEnum.PRODUCT_NOT_AVAILABLE_FOR_PURCHASE_TRY_LATER, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                            if (objB10 != coroutineSingletons) {
                                chaloUserBookingType11 = chaloUserBookingType7;
                                str6 = str5;
                                obj2 = objB10;
                                str7 = (String) obj2;
                                u1(str6, str7, superPass7);
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass7;
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType11;
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = str6;
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$3 = str7;
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 7;
                                objB11 = stringProvider.b(StringEnum.OKAY, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                                if (objB11 != coroutineSingletons) {
                                    str8 = str6;
                                    str9 = str7;
                                    obj2 = objB11;
                                    superPass10 = superPass7;
                                    chaloUserBookingType12 = chaloUserBookingType11;
                                    ticketsPageInfoBottomSheet2 = new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str8, str9, (String) obj2, null), null, superPass10, chaloUserBookingType12, TicketsPageInfoBottomSheetPositiveCtaType.PRODUCT_CONFIG_UNAVAILABLE, null, 34);
                                    ticketsPageInfoBottomSheet = ticketsPageInfoBottomSheet2;
                                    E0(new tk0(ticketsPageInfoBottomSheet, 1));
                                    homeScreenInfoHelper.d(false);
                                    return Unit.f17538a;
                                }
                            }
                        }
                    } else if (Intrinsics.d(bookableProductConfigForRenewFailureReason, BookableProductConfigForRenewFailureReason.ProductBookingConfigCachingFailed.f10146a)) {
                        myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass16;
                        myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType;
                        myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 8;
                        objB5 = stringProvider.b(StringEnum.PRODUCT_CONFIG_FETCH_FAILED_TITLE, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                        if (objB5 != coroutineSingletons) {
                            superPass6 = superPass16;
                            chaloUserBookingType6 = chaloUserBookingType;
                            obj2 = objB5;
                            str10 = (String) obj2;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass6;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType6;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = str10;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 9;
                            objB12 = stringProvider.b(StringEnum.PRODUCT_CONFIG_FETCH_FAILED_MSG, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                            if (objB12 != coroutineSingletons) {
                                chaloUserBookingType13 = chaloUserBookingType6;
                                str11 = str10;
                                obj2 = objB12;
                                str12 = (String) obj2;
                                u1(str11, str12, superPass6);
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass6;
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType13;
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = str11;
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$3 = str12;
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 10;
                                objB13 = stringProvider.b(StringEnum.OKAY, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                                if (objB13 != coroutineSingletons) {
                                    str13 = str11;
                                    str14 = str12;
                                    obj2 = objB13;
                                    superPass11 = superPass6;
                                    chaloUserBookingType14 = chaloUserBookingType13;
                                    ticketsPageInfoBottomSheet2 = new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str13, str14, (String) obj2, null), null, superPass11, chaloUserBookingType14, TicketsPageInfoBottomSheetPositiveCtaType.PRODUCT_CONFIG_CATCHING, null, 34);
                                    ticketsPageInfoBottomSheet = ticketsPageInfoBottomSheet2;
                                    E0(new tk0(ticketsPageInfoBottomSheet, 1));
                                    homeScreenInfoHelper.d(false);
                                    return Unit.f17538a;
                                }
                            }
                        }
                    } else if (Intrinsics.d(bookableProductConfigForRenewFailureReason, BookableProductConfigForRenewFailureReason.ProductBookingConfigFetchFailed.f10147a)) {
                        myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass16;
                        myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType;
                        myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 11;
                        objB4 = stringProvider.b(StringEnum.PRODUCT_CONFIG_FETCH_FAILED_TITLE, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                        if (objB4 != coroutineSingletons) {
                            superPass5 = superPass16;
                            chaloUserBookingType5 = chaloUserBookingType;
                            obj2 = objB4;
                            str15 = (String) obj2;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass5;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType5;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = str15;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 12;
                            objB14 = stringProvider.b(StringEnum.PRODUCT_CONFIG_FETCH_FAILED_MSG, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                            if (objB14 != coroutineSingletons) {
                                chaloUserBookingType15 = chaloUserBookingType5;
                                str16 = str15;
                                obj2 = objB14;
                                str17 = (String) obj2;
                                u1(str16, str17, superPass5);
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass5;
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType15;
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = str16;
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$3 = str17;
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 13;
                                objB15 = stringProvider.b(StringEnum.OKAY, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                                if (objB15 != coroutineSingletons) {
                                    str18 = str16;
                                    str19 = str17;
                                    obj2 = objB15;
                                    superPass12 = superPass5;
                                    chaloUserBookingType16 = chaloUserBookingType15;
                                    ticketsPageInfoBottomSheet2 = new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str18, str19, (String) obj2, null), null, superPass12, chaloUserBookingType16, TicketsPageInfoBottomSheetPositiveCtaType.PRODUCT_CONFIG_FETCH_FAILED, null, 34);
                                    ticketsPageInfoBottomSheet = ticketsPageInfoBottomSheet2;
                                    E0(new tk0(ticketsPageInfoBottomSheet, 1));
                                    homeScreenInfoHelper.d(false);
                                    return Unit.f17538a;
                                }
                            }
                        }
                    } else {
                        if (Intrinsics.d(bookableProductConfigForRenewFailureReason, BookableProductConfigForRenewFailureReason.ProductBookingConfigNotAvailable.f10148a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass16;
                        myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType;
                        myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 14;
                        objB3 = stringProvider.b(StringEnum.PRODUCT_CONFIG_UNAVAILABLE_TITLE, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                        if (objB3 != coroutineSingletons) {
                            superPass4 = superPass16;
                            chaloUserBookingType4 = chaloUserBookingType;
                            obj2 = objB3;
                            str20 = (String) obj2;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass4;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType4;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = str20;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 15;
                            objB16 = stringProvider.b(StringEnum.PRODUCT_NOT_AVAILABLE_FOR_PURCHASE_TRY_LATER, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                            if (objB16 != coroutineSingletons) {
                                chaloUserBookingType17 = chaloUserBookingType4;
                                str21 = str20;
                                obj2 = objB16;
                                str22 = (String) obj2;
                                u1(str21, str22, superPass4);
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass4;
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType17;
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = str21;
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$3 = str22;
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 16;
                                objB17 = stringProvider.b(StringEnum.OKAY, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                                if (objB17 != coroutineSingletons) {
                                    str23 = str21;
                                    str24 = str22;
                                    obj2 = objB17;
                                    superPass13 = superPass4;
                                    chaloUserBookingType18 = chaloUserBookingType17;
                                    ticketsPageInfoBottomSheet2 = new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str23, str24, (String) obj2, null), null, superPass13, chaloUserBookingType18, TicketsPageInfoBottomSheetPositiveCtaType.PRODUCT_CONFIG_UNAVAILABLE, null, 34);
                                    ticketsPageInfoBottomSheet = ticketsPageInfoBottomSheet2;
                                    E0(new tk0(ticketsPageInfoBottomSheet, 1));
                                    homeScreenInfoHelper.d(false);
                                    return Unit.f17538a;
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                ChaloUserBookingType chaloUserBookingType25 = (ChaloUserBookingType) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1;
                SuperPass superPass17 = (SuperPass) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0;
                ResultKt.b(obj2);
                chaloUserBookingType = chaloUserBookingType25;
                superPass16 = superPass17;
                objA = obj2;
                chaloUseCaseResult = (ChaloUseCaseResult) objA;
                if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                    if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bookableProductConfigForRenewSuccessType = (BookableProductConfigForRenewSuccessType) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                    z = bookableProductConfigForRenewSuccessType instanceof BookableProductConfigForRenewSuccessType.BookingWithoutProofRequirement;
                    chaloNavigationManager = this.Q;
                    if (z) {
                        E0(new sk0(18));
                        Source source3 = Source.MY_TICKETS_SCREEN_TAB;
                        Json json3 = ChaloJson.b;
                        BookableSuperPassConfiguration bookableSuperPassConfiguration3 = ((BookableProductConfigForRenewSuccessType.BookingWithoutProofRequirement) bookableProductConfigForRenewSuccessType).f10149a;
                        json3.getClass();
                        chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.Renew(source3, json3.a(BookableSuperPassConfiguration.INSTANCE.serializer(), bookableSuperPassConfiguration3), json3.a(SuperPassUserDetails.INSTANCE.serializer(), superPass16.getC().c), superPass16.f9560a.f9566a, superPass16.d.d, PostPassPurchaseSuccessFlowType.ACTIVATION), null, null, 6));
                    } else if (bookableProductConfigForRenewSuccessType instanceof BookableProductConfigForRenewSuccessType.CanDirectlyGoToPurchaseConfirmation) {
                        E0(new sk0(19));
                        Source source4 = Source.MY_TICKETS_SCREEN_TAB;
                        Json json4 = ChaloJson.b;
                        BookableSuperPassConfiguration bookableSuperPassConfiguration4 = ((BookableProductConfigForRenewSuccessType.CanDirectlyGoToPurchaseConfirmation) bookableProductConfigForRenewSuccessType).f10150a;
                        json4.getClass();
                        chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.Renew(source4, json4.a(BookableSuperPassConfiguration.INSTANCE.serializer(), bookableSuperPassConfiguration4), json4.a(SuperPassUserDetails.INSTANCE.serializer(), superPass16.getC().c), superPass16.f9560a.f9566a, superPass16.d.d, PostPassPurchaseSuccessFlowType.ACTIVATION), null, null, 6));
                    } else if (bookableProductConfigForRenewSuccessType instanceof BookableProductConfigForRenewSuccessType.PriceChanged) {
                        myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass16;
                        myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType;
                        myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = bookableProductConfigForRenewSuccessType;
                        myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 17;
                        objB2 = stringProvider.b(StringEnum.PRICE_CHANGED_TITLE, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                        if (objB2 != coroutineSingletons) {
                            superPass3 = superPass16;
                            bookableProductConfigForRenewSuccessType3 = bookableProductConfigForRenewSuccessType;
                            chaloUserBookingType3 = chaloUserBookingType;
                            obj2 = objB2;
                            str25 = (String) obj2;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass3;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType3;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = bookableProductConfigForRenewSuccessType3;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$3 = str25;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 18;
                            objB18 = stringProvider.b(StringEnum.PRICE_CHANGED_MSG, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                            if (objB18 != coroutineSingletons) {
                                ChaloUserBookingType chaloUserBookingType26 = chaloUserBookingType3;
                                bookableProductConfigForRenewSuccessType4 = bookableProductConfigForRenewSuccessType3;
                                str26 = str25;
                                obj2 = objB18;
                                chaloUserBookingType19 = chaloUserBookingType26;
                                str27 = (String) obj2;
                                u1(str26, str27, superPass3);
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass3;
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType19;
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = bookableProductConfigForRenewSuccessType4;
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$3 = str26;
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$4 = str27;
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 19;
                                objB19 = stringProvider.b(StringEnum.OKAY, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                                if (objB19 != coroutineSingletons) {
                                    str28 = str26;
                                    str29 = str27;
                                    obj2 = objB19;
                                    superPass14 = superPass3;
                                    chaloUserBookingType20 = chaloUserBookingType19;
                                    final BookableProductConfigForRenewSuccessType bookableProductConfigForRenewSuccessType8 = bookableProductConfigForRenewSuccessType4;
                                    final String str38 = (String) obj2;
                                    final int i5 = 0;
                                    E0(new Function1() { // from class: uk0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj3) {
                                            MyTicketsDataState it = (MyTicketsDataState) obj3;
                                            switch (i5) {
                                                case 0:
                                                    Intrinsics.i(it, "it");
                                                    return MyTicketsDataState.a(it, null, null, null, false, false, null, null, new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str28, str29, str38, null), ((BookableProductConfigForRenewSuccessType.PriceChanged) bookableProductConfigForRenewSuccessType8).f10151a, superPass14, chaloUserBookingType20, TicketsPageInfoBottomSheetPositiveCtaType.PRICE_CHANGED, null, 32), null, false, null, false, null, false, false, null, false, null, null, null, false, 33521151);
                                                default:
                                                    Intrinsics.i(it, "it");
                                                    return MyTicketsDataState.a(it, null, null, null, false, false, null, null, new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str28, str29, str38, null), ((BookableProductConfigForRenewSuccessType.ProofRequirementChanged) bookableProductConfigForRenewSuccessType8).f10152a, superPass14, chaloUserBookingType20, TicketsPageInfoBottomSheetPositiveCtaType.PROOF_REQUIRED, null, 32), null, false, null, false, null, false, false, null, false, null, null, null, false, 33521151);
                                            }
                                        }
                                    });
                                    homeScreenInfoHelper.d(false);
                                }
                            }
                        }
                    } else {
                        if (bookableProductConfigForRenewSuccessType instanceof BookableProductConfigForRenewSuccessType.ProofRequirementChanged) {
                            throw new NoWhenBranchMatchedException();
                        }
                        myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass16;
                        myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType;
                        myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = bookableProductConfigForRenewSuccessType;
                        myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 20;
                        objB = stringProvider.b(StringEnum.PROOF_REQUIREMENT_CHANGED_TITLE, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                        if (objB != coroutineSingletons) {
                            superPass2 = superPass16;
                            bookableProductConfigForRenewSuccessType2 = bookableProductConfigForRenewSuccessType;
                            chaloUserBookingType2 = chaloUserBookingType;
                            obj2 = objB;
                            str30 = (String) obj2;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass2;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType2;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = bookableProductConfigForRenewSuccessType2;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$3 = str30;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 21;
                            objB20 = stringProvider.b(StringEnum.PROOF_REQUIREMENT_CHANGED_MSG, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                            if (objB20 != coroutineSingletons) {
                                ChaloUserBookingType chaloUserBookingType27 = chaloUserBookingType2;
                                bookableProductConfigForRenewSuccessType5 = bookableProductConfigForRenewSuccessType2;
                                str31 = str30;
                                obj2 = objB20;
                                chaloUserBookingType21 = chaloUserBookingType27;
                                str32 = (String) obj2;
                                u1(str31, str32, superPass2);
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass2;
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType21;
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = bookableProductConfigForRenewSuccessType5;
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$3 = str31;
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$4 = str32;
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 22;
                                objB21 = stringProvider.b(StringEnum.OKAY, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                                if (objB21 != coroutineSingletons) {
                                    str33 = str31;
                                    str34 = str32;
                                    obj2 = objB21;
                                    superPass15 = superPass2;
                                    chaloUserBookingType22 = chaloUserBookingType21;
                                    final BookableProductConfigForRenewSuccessType bookableProductConfigForRenewSuccessType9 = bookableProductConfigForRenewSuccessType5;
                                    final String str39 = (String) obj2;
                                    final int i6 = 1;
                                    E0(new Function1() { // from class: uk0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj3) {
                                            MyTicketsDataState it = (MyTicketsDataState) obj3;
                                            switch (i6) {
                                                case 0:
                                                    Intrinsics.i(it, "it");
                                                    return MyTicketsDataState.a(it, null, null, null, false, false, null, null, new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str33, str34, str39, null), ((BookableProductConfigForRenewSuccessType.PriceChanged) bookableProductConfigForRenewSuccessType9).f10151a, superPass15, chaloUserBookingType22, TicketsPageInfoBottomSheetPositiveCtaType.PRICE_CHANGED, null, 32), null, false, null, false, null, false, false, null, false, null, null, null, false, 33521151);
                                                default:
                                                    Intrinsics.i(it, "it");
                                                    return MyTicketsDataState.a(it, null, null, null, false, false, null, null, new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str33, str34, str39, null), ((BookableProductConfigForRenewSuccessType.ProofRequirementChanged) bookableProductConfigForRenewSuccessType9).f10152a, superPass15, chaloUserBookingType22, TicketsPageInfoBottomSheetPositiveCtaType.PROOF_REQUIRED, null, 32), null, false, null, false, null, false, false, null, false, null, null, null, false, 33521151);
                                            }
                                        }
                                    });
                                    homeScreenInfoHelper.d(false);
                                }
                            }
                        }
                    }
                    return Unit.f17538a;
                }
                obj = ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
                bookableProductConfigForRenewFailureReason = (BookableProductConfigForRenewFailureReason) obj;
                if (bookableProductConfigForRenewFailureReason instanceof BookableProductConfigForRenewFailureReason.BookableConfigNotActive) {
                    Intrinsics.g(obj, "null cannot be cast to non-null type app.chalo.usecase.BookableProductConfigForRenewFailureReason.BookableConfigNotActive");
                    str = ((BookableProductConfigForRenewFailureReason.BookableConfigNotActive) obj).f10144a;
                    if (str.length() == 0) {
                        myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass16;
                        myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType;
                        myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 2;
                        objB7 = stringProvider.b(StringEnum.PRODUCT_NOT_AVAILABLE_FOR_PURCHASE_TRY_LATER, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                        if (objB7 != coroutineSingletons) {
                            superPass8 = superPass16;
                            chaloUserBookingType8 = chaloUserBookingType;
                            obj2 = objB7;
                            String str310 = (String) obj2;
                            chaloUserBookingType = chaloUserBookingType8;
                            superPass16 = superPass8;
                            str = str310;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass16;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = str;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 3;
                            objB8 = stringProvider.b(StringEnum.BOOKABLE_CONFIG_INACTIVE_TITLE, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                            if (objB8 != coroutineSingletons) {
                                chaloUserBookingType9 = chaloUserBookingType;
                                obj2 = objB8;
                                str2 = (String) obj2;
                                u1(str2, str, superPass16);
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass16;
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType9;
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = str;
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$3 = str2;
                                myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 4;
                                objB9 = stringProvider.b(StringEnum.OKAY, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                                if (objB9 != coroutineSingletons) {
                                    superPass9 = superPass16;
                                    str3 = str2;
                                    obj2 = objB9;
                                    str4 = str;
                                    chaloUserBookingType10 = chaloUserBookingType9;
                                    ticketsPageInfoBottomSheet = new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str3, str4, (String) obj2, null), null, superPass9, chaloUserBookingType10, TicketsPageInfoBottomSheetPositiveCtaType.BOOKABLE_CONFIG_INACTIVE, null, 34);
                                    E0(new tk0(ticketsPageInfoBottomSheet, 1));
                                    homeScreenInfoHelper.d(false);
                                    return Unit.f17538a;
                                }
                            }
                        }
                    } else {
                        myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass16;
                        myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType;
                        myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = str;
                        myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 3;
                        objB8 = stringProvider.b(StringEnum.BOOKABLE_CONFIG_INACTIVE_TITLE, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                        if (objB8 != coroutineSingletons) {
                            chaloUserBookingType9 = chaloUserBookingType;
                            obj2 = objB8;
                            str2 = (String) obj2;
                            u1(str2, str, superPass16);
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass16;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType9;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = str;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$3 = str2;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 4;
                            objB9 = stringProvider.b(StringEnum.OKAY, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                            if (objB9 != coroutineSingletons) {
                                superPass9 = superPass16;
                                str3 = str2;
                                obj2 = objB9;
                                str4 = str;
                                chaloUserBookingType10 = chaloUserBookingType9;
                                ticketsPageInfoBottomSheet = new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str3, str4, (String) obj2, null), null, superPass9, chaloUserBookingType10, TicketsPageInfoBottomSheetPositiveCtaType.BOOKABLE_CONFIG_INACTIVE, null, 34);
                                E0(new tk0(ticketsPageInfoBottomSheet, 1));
                                homeScreenInfoHelper.d(false);
                                return Unit.f17538a;
                            }
                        }
                    }
                } else if (Intrinsics.d(bookableProductConfigForRenewFailureReason, BookableProductConfigForRenewFailureReason.BookableConfigNotAvailable.f10145a)) {
                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass16;
                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType;
                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 5;
                    objB6 = stringProvider.b(StringEnum.PRODUCT_CONFIG_UNAVAILABLE_TITLE, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                    if (objB6 != coroutineSingletons) {
                        superPass7 = superPass16;
                        chaloUserBookingType7 = chaloUserBookingType;
                        obj2 = objB6;
                        str5 = (String) obj2;
                        myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass7;
                        myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType7;
                        myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = str5;
                        myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 6;
                        objB10 = stringProvider.b(StringEnum.PRODUCT_NOT_AVAILABLE_FOR_PURCHASE_TRY_LATER, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                        if (objB10 != coroutineSingletons) {
                            chaloUserBookingType11 = chaloUserBookingType7;
                            str6 = str5;
                            obj2 = objB10;
                            str7 = (String) obj2;
                            u1(str6, str7, superPass7);
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass7;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType11;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = str6;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$3 = str7;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 7;
                            objB11 = stringProvider.b(StringEnum.OKAY, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                            if (objB11 != coroutineSingletons) {
                                str8 = str6;
                                str9 = str7;
                                obj2 = objB11;
                                superPass10 = superPass7;
                                chaloUserBookingType12 = chaloUserBookingType11;
                                ticketsPageInfoBottomSheet2 = new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str8, str9, (String) obj2, null), null, superPass10, chaloUserBookingType12, TicketsPageInfoBottomSheetPositiveCtaType.PRODUCT_CONFIG_UNAVAILABLE, null, 34);
                                ticketsPageInfoBottomSheet = ticketsPageInfoBottomSheet2;
                                E0(new tk0(ticketsPageInfoBottomSheet, 1));
                                homeScreenInfoHelper.d(false);
                                return Unit.f17538a;
                            }
                        }
                    }
                } else if (Intrinsics.d(bookableProductConfigForRenewFailureReason, BookableProductConfigForRenewFailureReason.ProductBookingConfigCachingFailed.f10146a)) {
                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass16;
                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType;
                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 8;
                    objB5 = stringProvider.b(StringEnum.PRODUCT_CONFIG_FETCH_FAILED_TITLE, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                    if (objB5 != coroutineSingletons) {
                        superPass6 = superPass16;
                        chaloUserBookingType6 = chaloUserBookingType;
                        obj2 = objB5;
                        str10 = (String) obj2;
                        myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass6;
                        myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType6;
                        myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = str10;
                        myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 9;
                        objB12 = stringProvider.b(StringEnum.PRODUCT_CONFIG_FETCH_FAILED_MSG, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                        if (objB12 != coroutineSingletons) {
                            chaloUserBookingType13 = chaloUserBookingType6;
                            str11 = str10;
                            obj2 = objB12;
                            str12 = (String) obj2;
                            u1(str11, str12, superPass6);
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass6;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType13;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = str11;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$3 = str12;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 10;
                            objB13 = stringProvider.b(StringEnum.OKAY, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                            if (objB13 != coroutineSingletons) {
                                str13 = str11;
                                str14 = str12;
                                obj2 = objB13;
                                superPass11 = superPass6;
                                chaloUserBookingType14 = chaloUserBookingType13;
                                ticketsPageInfoBottomSheet2 = new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str13, str14, (String) obj2, null), null, superPass11, chaloUserBookingType14, TicketsPageInfoBottomSheetPositiveCtaType.PRODUCT_CONFIG_CATCHING, null, 34);
                                ticketsPageInfoBottomSheet = ticketsPageInfoBottomSheet2;
                                E0(new tk0(ticketsPageInfoBottomSheet, 1));
                                homeScreenInfoHelper.d(false);
                                return Unit.f17538a;
                            }
                        }
                    }
                } else if (Intrinsics.d(bookableProductConfigForRenewFailureReason, BookableProductConfigForRenewFailureReason.ProductBookingConfigFetchFailed.f10147a)) {
                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass16;
                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType;
                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 11;
                    objB4 = stringProvider.b(StringEnum.PRODUCT_CONFIG_FETCH_FAILED_TITLE, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                    if (objB4 != coroutineSingletons) {
                        superPass5 = superPass16;
                        chaloUserBookingType5 = chaloUserBookingType;
                        obj2 = objB4;
                        str15 = (String) obj2;
                        myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass5;
                        myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType5;
                        myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = str15;
                        myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 12;
                        objB14 = stringProvider.b(StringEnum.PRODUCT_CONFIG_FETCH_FAILED_MSG, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                        if (objB14 != coroutineSingletons) {
                            chaloUserBookingType15 = chaloUserBookingType5;
                            str16 = str15;
                            obj2 = objB14;
                            str17 = (String) obj2;
                            u1(str16, str17, superPass5);
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass5;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType15;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = str16;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$3 = str17;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 13;
                            objB15 = stringProvider.b(StringEnum.OKAY, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                            if (objB15 != coroutineSingletons) {
                                str18 = str16;
                                str19 = str17;
                                obj2 = objB15;
                                superPass12 = superPass5;
                                chaloUserBookingType16 = chaloUserBookingType15;
                                ticketsPageInfoBottomSheet2 = new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str18, str19, (String) obj2, null), null, superPass12, chaloUserBookingType16, TicketsPageInfoBottomSheetPositiveCtaType.PRODUCT_CONFIG_FETCH_FAILED, null, 34);
                                ticketsPageInfoBottomSheet = ticketsPageInfoBottomSheet2;
                                E0(new tk0(ticketsPageInfoBottomSheet, 1));
                                homeScreenInfoHelper.d(false);
                                return Unit.f17538a;
                            }
                        }
                    }
                } else {
                    if (Intrinsics.d(bookableProductConfigForRenewFailureReason, BookableProductConfigForRenewFailureReason.ProductBookingConfigNotAvailable.f10148a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass16;
                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType;
                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 14;
                    objB3 = stringProvider.b(StringEnum.PRODUCT_CONFIG_UNAVAILABLE_TITLE, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                    if (objB3 != coroutineSingletons) {
                        superPass4 = superPass16;
                        chaloUserBookingType4 = chaloUserBookingType;
                        obj2 = objB3;
                        str20 = (String) obj2;
                        myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass4;
                        myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType4;
                        myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = str20;
                        myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 15;
                        objB16 = stringProvider.b(StringEnum.PRODUCT_NOT_AVAILABLE_FOR_PURCHASE_TRY_LATER, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                        if (objB16 != coroutineSingletons) {
                            chaloUserBookingType17 = chaloUserBookingType4;
                            str21 = str20;
                            obj2 = objB16;
                            str22 = (String) obj2;
                            u1(str21, str22, superPass4);
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass4;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType17;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = str21;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$3 = str22;
                            myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 16;
                            objB17 = stringProvider.b(StringEnum.OKAY, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                            if (objB17 != coroutineSingletons) {
                                str23 = str21;
                                str24 = str22;
                                obj2 = objB17;
                                superPass13 = superPass4;
                                chaloUserBookingType18 = chaloUserBookingType17;
                                ticketsPageInfoBottomSheet2 = new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str23, str24, (String) obj2, null), null, superPass13, chaloUserBookingType18, TicketsPageInfoBottomSheetPositiveCtaType.PRODUCT_CONFIG_UNAVAILABLE, null, 34);
                                ticketsPageInfoBottomSheet = ticketsPageInfoBottomSheet2;
                                E0(new tk0(ticketsPageInfoBottomSheet, 1));
                                homeScreenInfoHelper.d(false);
                                return Unit.f17538a;
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 2:
                chaloUserBookingType8 = (ChaloUserBookingType) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1;
                superPass8 = (SuperPass) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0;
                ResultKt.b(obj2);
                String str311 = (String) obj2;
                chaloUserBookingType = chaloUserBookingType8;
                superPass16 = superPass8;
                str = str311;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass16;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = str;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 3;
                objB8 = stringProvider.b(StringEnum.BOOKABLE_CONFIG_INACTIVE_TITLE, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                if (objB8 != coroutineSingletons) {
                    chaloUserBookingType9 = chaloUserBookingType;
                    obj2 = objB8;
                    str2 = (String) obj2;
                    u1(str2, str, superPass16);
                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass16;
                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType9;
                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = str;
                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$3 = str2;
                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 4;
                    objB9 = stringProvider.b(StringEnum.OKAY, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                    if (objB9 != coroutineSingletons) {
                        superPass9 = superPass16;
                        str3 = str2;
                        obj2 = objB9;
                        str4 = str;
                        chaloUserBookingType10 = chaloUserBookingType9;
                        ticketsPageInfoBottomSheet = new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str3, str4, (String) obj2, null), null, superPass9, chaloUserBookingType10, TicketsPageInfoBottomSheetPositiveCtaType.BOOKABLE_CONFIG_INACTIVE, null, 34);
                        E0(new tk0(ticketsPageInfoBottomSheet, 1));
                        homeScreenInfoHelper.d(false);
                        return Unit.f17538a;
                    }
                }
                return coroutineSingletons;
            case 3:
                String str40 = (String) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2;
                ChaloUserBookingType chaloUserBookingType28 = (ChaloUserBookingType) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1;
                SuperPass superPass18 = (SuperPass) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0;
                ResultKt.b(obj2);
                str = str40;
                superPass16 = superPass18;
                chaloUserBookingType9 = chaloUserBookingType28;
                str2 = (String) obj2;
                u1(str2, str, superPass16);
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass16;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType9;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = str;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$3 = str2;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 4;
                objB9 = stringProvider.b(StringEnum.OKAY, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                if (objB9 != coroutineSingletons) {
                    superPass9 = superPass16;
                    str3 = str2;
                    obj2 = objB9;
                    str4 = str;
                    chaloUserBookingType10 = chaloUserBookingType9;
                    ticketsPageInfoBottomSheet = new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str3, str4, (String) obj2, null), null, superPass9, chaloUserBookingType10, TicketsPageInfoBottomSheetPositiveCtaType.BOOKABLE_CONFIG_INACTIVE, null, 34);
                    E0(new tk0(ticketsPageInfoBottomSheet, 1));
                    homeScreenInfoHelper.d(false);
                    return Unit.f17538a;
                }
                return coroutineSingletons;
            case 4:
                String str41 = (String) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$3;
                String str42 = (String) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2;
                ChaloUserBookingType chaloUserBookingType29 = (ChaloUserBookingType) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1;
                SuperPass superPass19 = (SuperPass) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0;
                ResultKt.b(obj2);
                str3 = str41;
                superPass9 = superPass19;
                str4 = str42;
                chaloUserBookingType10 = chaloUserBookingType29;
                ticketsPageInfoBottomSheet = new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str3, str4, (String) obj2, null), null, superPass9, chaloUserBookingType10, TicketsPageInfoBottomSheetPositiveCtaType.BOOKABLE_CONFIG_INACTIVE, null, 34);
                E0(new tk0(ticketsPageInfoBottomSheet, 1));
                homeScreenInfoHelper.d(false);
                return Unit.f17538a;
            case 5:
                chaloUserBookingType7 = (ChaloUserBookingType) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1;
                superPass7 = (SuperPass) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0;
                ResultKt.b(obj2);
                str5 = (String) obj2;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass7;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType7;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = str5;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 6;
                objB10 = stringProvider.b(StringEnum.PRODUCT_NOT_AVAILABLE_FOR_PURCHASE_TRY_LATER, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                if (objB10 != coroutineSingletons) {
                    chaloUserBookingType11 = chaloUserBookingType7;
                    str6 = str5;
                    obj2 = objB10;
                    str7 = (String) obj2;
                    u1(str6, str7, superPass7);
                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass7;
                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType11;
                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = str6;
                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$3 = str7;
                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 7;
                    objB11 = stringProvider.b(StringEnum.OKAY, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                    if (objB11 != coroutineSingletons) {
                        str8 = str6;
                        str9 = str7;
                        obj2 = objB11;
                        superPass10 = superPass7;
                        chaloUserBookingType12 = chaloUserBookingType11;
                        ticketsPageInfoBottomSheet2 = new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str8, str9, (String) obj2, null), null, superPass10, chaloUserBookingType12, TicketsPageInfoBottomSheetPositiveCtaType.PRODUCT_CONFIG_UNAVAILABLE, null, 34);
                        ticketsPageInfoBottomSheet = ticketsPageInfoBottomSheet2;
                        E0(new tk0(ticketsPageInfoBottomSheet, 1));
                        homeScreenInfoHelper.d(false);
                        return Unit.f17538a;
                    }
                }
                return coroutineSingletons;
            case 6:
                str6 = (String) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2;
                ChaloUserBookingType chaloUserBookingType30 = (ChaloUserBookingType) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1;
                SuperPass superPass20 = (SuperPass) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0;
                ResultKt.b(obj2);
                chaloUserBookingType11 = chaloUserBookingType30;
                superPass7 = superPass20;
                str7 = (String) obj2;
                u1(str6, str7, superPass7);
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass7;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType11;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = str6;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$3 = str7;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 7;
                objB11 = stringProvider.b(StringEnum.OKAY, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                if (objB11 != coroutineSingletons) {
                    str8 = str6;
                    str9 = str7;
                    obj2 = objB11;
                    superPass10 = superPass7;
                    chaloUserBookingType12 = chaloUserBookingType11;
                    ticketsPageInfoBottomSheet2 = new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str8, str9, (String) obj2, null), null, superPass10, chaloUserBookingType12, TicketsPageInfoBottomSheetPositiveCtaType.PRODUCT_CONFIG_UNAVAILABLE, null, 34);
                    ticketsPageInfoBottomSheet = ticketsPageInfoBottomSheet2;
                    E0(new tk0(ticketsPageInfoBottomSheet, 1));
                    homeScreenInfoHelper.d(false);
                    return Unit.f17538a;
                }
                return coroutineSingletons;
            case 7:
                String str43 = (String) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$3;
                String str44 = (String) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2;
                ChaloUserBookingType chaloUserBookingType31 = (ChaloUserBookingType) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1;
                SuperPass superPass21 = (SuperPass) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0;
                ResultKt.b(obj2);
                str9 = str43;
                superPass10 = superPass21;
                str8 = str44;
                chaloUserBookingType12 = chaloUserBookingType31;
                ticketsPageInfoBottomSheet2 = new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str8, str9, (String) obj2, null), null, superPass10, chaloUserBookingType12, TicketsPageInfoBottomSheetPositiveCtaType.PRODUCT_CONFIG_UNAVAILABLE, null, 34);
                ticketsPageInfoBottomSheet = ticketsPageInfoBottomSheet2;
                E0(new tk0(ticketsPageInfoBottomSheet, 1));
                homeScreenInfoHelper.d(false);
                return Unit.f17538a;
            case 8:
                chaloUserBookingType6 = (ChaloUserBookingType) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1;
                superPass6 = (SuperPass) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0;
                ResultKt.b(obj2);
                str10 = (String) obj2;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass6;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType6;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = str10;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 9;
                objB12 = stringProvider.b(StringEnum.PRODUCT_CONFIG_FETCH_FAILED_MSG, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                if (objB12 != coroutineSingletons) {
                    chaloUserBookingType13 = chaloUserBookingType6;
                    str11 = str10;
                    obj2 = objB12;
                    str12 = (String) obj2;
                    u1(str11, str12, superPass6);
                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass6;
                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType13;
                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = str11;
                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$3 = str12;
                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 10;
                    objB13 = stringProvider.b(StringEnum.OKAY, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                    if (objB13 != coroutineSingletons) {
                        str13 = str11;
                        str14 = str12;
                        obj2 = objB13;
                        superPass11 = superPass6;
                        chaloUserBookingType14 = chaloUserBookingType13;
                        ticketsPageInfoBottomSheet2 = new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str13, str14, (String) obj2, null), null, superPass11, chaloUserBookingType14, TicketsPageInfoBottomSheetPositiveCtaType.PRODUCT_CONFIG_CATCHING, null, 34);
                        ticketsPageInfoBottomSheet = ticketsPageInfoBottomSheet2;
                        E0(new tk0(ticketsPageInfoBottomSheet, 1));
                        homeScreenInfoHelper.d(false);
                        return Unit.f17538a;
                    }
                }
                return coroutineSingletons;
            case 9:
                str11 = (String) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2;
                ChaloUserBookingType chaloUserBookingType32 = (ChaloUserBookingType) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1;
                SuperPass superPass22 = (SuperPass) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0;
                ResultKt.b(obj2);
                chaloUserBookingType13 = chaloUserBookingType32;
                superPass6 = superPass22;
                str12 = (String) obj2;
                u1(str11, str12, superPass6);
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass6;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType13;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = str11;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$3 = str12;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 10;
                objB13 = stringProvider.b(StringEnum.OKAY, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                if (objB13 != coroutineSingletons) {
                    str13 = str11;
                    str14 = str12;
                    obj2 = objB13;
                    superPass11 = superPass6;
                    chaloUserBookingType14 = chaloUserBookingType13;
                    ticketsPageInfoBottomSheet2 = new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str13, str14, (String) obj2, null), null, superPass11, chaloUserBookingType14, TicketsPageInfoBottomSheetPositiveCtaType.PRODUCT_CONFIG_CATCHING, null, 34);
                    ticketsPageInfoBottomSheet = ticketsPageInfoBottomSheet2;
                    E0(new tk0(ticketsPageInfoBottomSheet, 1));
                    homeScreenInfoHelper.d(false);
                    return Unit.f17538a;
                }
                return coroutineSingletons;
            case 10:
                String str45 = (String) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$3;
                String str46 = (String) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2;
                ChaloUserBookingType chaloUserBookingType33 = (ChaloUserBookingType) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1;
                SuperPass superPass23 = (SuperPass) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0;
                ResultKt.b(obj2);
                str14 = str45;
                superPass11 = superPass23;
                str13 = str46;
                chaloUserBookingType14 = chaloUserBookingType33;
                ticketsPageInfoBottomSheet2 = new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str13, str14, (String) obj2, null), null, superPass11, chaloUserBookingType14, TicketsPageInfoBottomSheetPositiveCtaType.PRODUCT_CONFIG_CATCHING, null, 34);
                ticketsPageInfoBottomSheet = ticketsPageInfoBottomSheet2;
                E0(new tk0(ticketsPageInfoBottomSheet, 1));
                homeScreenInfoHelper.d(false);
                return Unit.f17538a;
            case 11:
                chaloUserBookingType5 = (ChaloUserBookingType) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1;
                superPass5 = (SuperPass) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0;
                ResultKt.b(obj2);
                str15 = (String) obj2;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass5;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType5;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = str15;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 12;
                objB14 = stringProvider.b(StringEnum.PRODUCT_CONFIG_FETCH_FAILED_MSG, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                if (objB14 != coroutineSingletons) {
                    chaloUserBookingType15 = chaloUserBookingType5;
                    str16 = str15;
                    obj2 = objB14;
                    str17 = (String) obj2;
                    u1(str16, str17, superPass5);
                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass5;
                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType15;
                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = str16;
                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$3 = str17;
                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 13;
                    objB15 = stringProvider.b(StringEnum.OKAY, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                    if (objB15 != coroutineSingletons) {
                        str18 = str16;
                        str19 = str17;
                        obj2 = objB15;
                        superPass12 = superPass5;
                        chaloUserBookingType16 = chaloUserBookingType15;
                        ticketsPageInfoBottomSheet2 = new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str18, str19, (String) obj2, null), null, superPass12, chaloUserBookingType16, TicketsPageInfoBottomSheetPositiveCtaType.PRODUCT_CONFIG_FETCH_FAILED, null, 34);
                        ticketsPageInfoBottomSheet = ticketsPageInfoBottomSheet2;
                        E0(new tk0(ticketsPageInfoBottomSheet, 1));
                        homeScreenInfoHelper.d(false);
                        return Unit.f17538a;
                    }
                }
                return coroutineSingletons;
            case 12:
                str16 = (String) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2;
                ChaloUserBookingType chaloUserBookingType34 = (ChaloUserBookingType) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1;
                SuperPass superPass24 = (SuperPass) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0;
                ResultKt.b(obj2);
                chaloUserBookingType15 = chaloUserBookingType34;
                superPass5 = superPass24;
                str17 = (String) obj2;
                u1(str16, str17, superPass5);
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass5;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType15;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = str16;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$3 = str17;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 13;
                objB15 = stringProvider.b(StringEnum.OKAY, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                if (objB15 != coroutineSingletons) {
                    str18 = str16;
                    str19 = str17;
                    obj2 = objB15;
                    superPass12 = superPass5;
                    chaloUserBookingType16 = chaloUserBookingType15;
                    ticketsPageInfoBottomSheet2 = new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str18, str19, (String) obj2, null), null, superPass12, chaloUserBookingType16, TicketsPageInfoBottomSheetPositiveCtaType.PRODUCT_CONFIG_FETCH_FAILED, null, 34);
                    ticketsPageInfoBottomSheet = ticketsPageInfoBottomSheet2;
                    E0(new tk0(ticketsPageInfoBottomSheet, 1));
                    homeScreenInfoHelper.d(false);
                    return Unit.f17538a;
                }
                return coroutineSingletons;
            case 13:
                String str47 = (String) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$3;
                String str48 = (String) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2;
                ChaloUserBookingType chaloUserBookingType35 = (ChaloUserBookingType) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1;
                SuperPass superPass25 = (SuperPass) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0;
                ResultKt.b(obj2);
                str19 = str47;
                superPass12 = superPass25;
                str18 = str48;
                chaloUserBookingType16 = chaloUserBookingType35;
                ticketsPageInfoBottomSheet2 = new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str18, str19, (String) obj2, null), null, superPass12, chaloUserBookingType16, TicketsPageInfoBottomSheetPositiveCtaType.PRODUCT_CONFIG_FETCH_FAILED, null, 34);
                ticketsPageInfoBottomSheet = ticketsPageInfoBottomSheet2;
                E0(new tk0(ticketsPageInfoBottomSheet, 1));
                homeScreenInfoHelper.d(false);
                return Unit.f17538a;
            case 14:
                chaloUserBookingType4 = (ChaloUserBookingType) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1;
                superPass4 = (SuperPass) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0;
                ResultKt.b(obj2);
                str20 = (String) obj2;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass4;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType4;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = str20;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 15;
                objB16 = stringProvider.b(StringEnum.PRODUCT_NOT_AVAILABLE_FOR_PURCHASE_TRY_LATER, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                if (objB16 != coroutineSingletons) {
                    chaloUserBookingType17 = chaloUserBookingType4;
                    str21 = str20;
                    obj2 = objB16;
                    str22 = (String) obj2;
                    u1(str21, str22, superPass4);
                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass4;
                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType17;
                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = str21;
                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$3 = str22;
                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 16;
                    objB17 = stringProvider.b(StringEnum.OKAY, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                    if (objB17 != coroutineSingletons) {
                        str23 = str21;
                        str24 = str22;
                        obj2 = objB17;
                        superPass13 = superPass4;
                        chaloUserBookingType18 = chaloUserBookingType17;
                        ticketsPageInfoBottomSheet2 = new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str23, str24, (String) obj2, null), null, superPass13, chaloUserBookingType18, TicketsPageInfoBottomSheetPositiveCtaType.PRODUCT_CONFIG_UNAVAILABLE, null, 34);
                        ticketsPageInfoBottomSheet = ticketsPageInfoBottomSheet2;
                        E0(new tk0(ticketsPageInfoBottomSheet, 1));
                        homeScreenInfoHelper.d(false);
                        return Unit.f17538a;
                    }
                }
                return coroutineSingletons;
            case 15:
                str21 = (String) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2;
                ChaloUserBookingType chaloUserBookingType36 = (ChaloUserBookingType) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1;
                SuperPass superPass26 = (SuperPass) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0;
                ResultKt.b(obj2);
                chaloUserBookingType17 = chaloUserBookingType36;
                superPass4 = superPass26;
                str22 = (String) obj2;
                u1(str21, str22, superPass4);
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass4;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType17;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = str21;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$3 = str22;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 16;
                objB17 = stringProvider.b(StringEnum.OKAY, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                if (objB17 != coroutineSingletons) {
                    str23 = str21;
                    str24 = str22;
                    obj2 = objB17;
                    superPass13 = superPass4;
                    chaloUserBookingType18 = chaloUserBookingType17;
                    ticketsPageInfoBottomSheet2 = new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str23, str24, (String) obj2, null), null, superPass13, chaloUserBookingType18, TicketsPageInfoBottomSheetPositiveCtaType.PRODUCT_CONFIG_UNAVAILABLE, null, 34);
                    ticketsPageInfoBottomSheet = ticketsPageInfoBottomSheet2;
                    E0(new tk0(ticketsPageInfoBottomSheet, 1));
                    homeScreenInfoHelper.d(false);
                    return Unit.f17538a;
                }
                return coroutineSingletons;
            case 16:
                String str49 = (String) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$3;
                String str50 = (String) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2;
                ChaloUserBookingType chaloUserBookingType37 = (ChaloUserBookingType) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1;
                SuperPass superPass27 = (SuperPass) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0;
                ResultKt.b(obj2);
                str24 = str49;
                superPass13 = superPass27;
                str23 = str50;
                chaloUserBookingType18 = chaloUserBookingType37;
                ticketsPageInfoBottomSheet2 = new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str23, str24, (String) obj2, null), null, superPass13, chaloUserBookingType18, TicketsPageInfoBottomSheetPositiveCtaType.PRODUCT_CONFIG_UNAVAILABLE, null, 34);
                ticketsPageInfoBottomSheet = ticketsPageInfoBottomSheet2;
                E0(new tk0(ticketsPageInfoBottomSheet, 1));
                homeScreenInfoHelper.d(false);
                return Unit.f17538a;
            case 17:
                bookableProductConfigForRenewSuccessType3 = (BookableProductConfigForRenewSuccessType) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2;
                chaloUserBookingType3 = (ChaloUserBookingType) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1;
                superPass3 = (SuperPass) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0;
                ResultKt.b(obj2);
                str25 = (String) obj2;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass3;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType3;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = bookableProductConfigForRenewSuccessType3;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$3 = str25;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 18;
                objB18 = stringProvider.b(StringEnum.PRICE_CHANGED_MSG, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                if (objB18 != coroutineSingletons) {
                    ChaloUserBookingType chaloUserBookingType210 = chaloUserBookingType3;
                    bookableProductConfigForRenewSuccessType4 = bookableProductConfigForRenewSuccessType3;
                    str26 = str25;
                    obj2 = objB18;
                    chaloUserBookingType19 = chaloUserBookingType210;
                    str27 = (String) obj2;
                    u1(str26, str27, superPass3);
                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass3;
                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType19;
                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = bookableProductConfigForRenewSuccessType4;
                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$3 = str26;
                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$4 = str27;
                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 19;
                    objB19 = stringProvider.b(StringEnum.OKAY, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                    if (objB19 != coroutineSingletons) {
                        str28 = str26;
                        str29 = str27;
                        obj2 = objB19;
                        superPass14 = superPass3;
                        chaloUserBookingType20 = chaloUserBookingType19;
                        final BookableProductConfigForRenewSuccessType bookableProductConfigForRenewSuccessType10 = bookableProductConfigForRenewSuccessType4;
                        final String str312 = (String) obj2;
                        final int i7 = 0;
                        E0(new Function1() { // from class: uk0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                MyTicketsDataState it = (MyTicketsDataState) obj3;
                                switch (i7) {
                                    case 0:
                                        Intrinsics.i(it, "it");
                                        return MyTicketsDataState.a(it, null, null, null, false, false, null, null, new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str28, str29, str312, null), ((BookableProductConfigForRenewSuccessType.PriceChanged) bookableProductConfigForRenewSuccessType10).f10151a, superPass14, chaloUserBookingType20, TicketsPageInfoBottomSheetPositiveCtaType.PRICE_CHANGED, null, 32), null, false, null, false, null, false, false, null, false, null, null, null, false, 33521151);
                                    default:
                                        Intrinsics.i(it, "it");
                                        return MyTicketsDataState.a(it, null, null, null, false, false, null, null, new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str28, str29, str312, null), ((BookableProductConfigForRenewSuccessType.ProofRequirementChanged) bookableProductConfigForRenewSuccessType10).f10152a, superPass14, chaloUserBookingType20, TicketsPageInfoBottomSheetPositiveCtaType.PROOF_REQUIRED, null, 32), null, false, null, false, null, false, false, null, false, null, null, null, false, 33521151);
                                }
                            }
                        });
                        homeScreenInfoHelper.d(false);
                        return Unit.f17538a;
                    }
                }
                return coroutineSingletons;
            case 18:
                str26 = (String) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$3;
                bookableProductConfigForRenewSuccessType4 = (BookableProductConfigForRenewSuccessType) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2;
                ChaloUserBookingType chaloUserBookingType38 = (ChaloUserBookingType) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1;
                SuperPass superPass28 = (SuperPass) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0;
                ResultKt.b(obj2);
                chaloUserBookingType19 = chaloUserBookingType38;
                superPass3 = superPass28;
                str27 = (String) obj2;
                u1(str26, str27, superPass3);
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass3;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType19;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = bookableProductConfigForRenewSuccessType4;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$3 = str26;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$4 = str27;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 19;
                objB19 = stringProvider.b(StringEnum.OKAY, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                if (objB19 != coroutineSingletons) {
                    str28 = str26;
                    str29 = str27;
                    obj2 = objB19;
                    superPass14 = superPass3;
                    chaloUserBookingType20 = chaloUserBookingType19;
                    final BookableProductConfigForRenewSuccessType bookableProductConfigForRenewSuccessType11 = bookableProductConfigForRenewSuccessType4;
                    final String str313 = (String) obj2;
                    final int i8 = 0;
                    E0(new Function1() { // from class: uk0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            MyTicketsDataState it = (MyTicketsDataState) obj3;
                            switch (i8) {
                                case 0:
                                    Intrinsics.i(it, "it");
                                    return MyTicketsDataState.a(it, null, null, null, false, false, null, null, new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str28, str29, str313, null), ((BookableProductConfigForRenewSuccessType.PriceChanged) bookableProductConfigForRenewSuccessType11).f10151a, superPass14, chaloUserBookingType20, TicketsPageInfoBottomSheetPositiveCtaType.PRICE_CHANGED, null, 32), null, false, null, false, null, false, false, null, false, null, null, null, false, 33521151);
                                default:
                                    Intrinsics.i(it, "it");
                                    return MyTicketsDataState.a(it, null, null, null, false, false, null, null, new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str28, str29, str313, null), ((BookableProductConfigForRenewSuccessType.ProofRequirementChanged) bookableProductConfigForRenewSuccessType11).f10152a, superPass14, chaloUserBookingType20, TicketsPageInfoBottomSheetPositiveCtaType.PROOF_REQUIRED, null, 32), null, false, null, false, null, false, false, null, false, null, null, null, false, 33521151);
                            }
                        }
                    });
                    homeScreenInfoHelper.d(false);
                    return Unit.f17538a;
                }
                return coroutineSingletons;
            case 19:
                String str51 = (String) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$4;
                String str52 = (String) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$3;
                bookableProductConfigForRenewSuccessType4 = (BookableProductConfigForRenewSuccessType) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2;
                ChaloUserBookingType chaloUserBookingType39 = (ChaloUserBookingType) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1;
                SuperPass superPass29 = (SuperPass) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0;
                ResultKt.b(obj2);
                str29 = str51;
                superPass14 = superPass29;
                str28 = str52;
                chaloUserBookingType20 = chaloUserBookingType39;
                final BookableProductConfigForRenewSuccessType bookableProductConfigForRenewSuccessType12 = bookableProductConfigForRenewSuccessType4;
                final String str314 = (String) obj2;
                final int i9 = 0;
                E0(new Function1() { // from class: uk0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        MyTicketsDataState it = (MyTicketsDataState) obj3;
                        switch (i9) {
                            case 0:
                                Intrinsics.i(it, "it");
                                return MyTicketsDataState.a(it, null, null, null, false, false, null, null, new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str28, str29, str314, null), ((BookableProductConfigForRenewSuccessType.PriceChanged) bookableProductConfigForRenewSuccessType12).f10151a, superPass14, chaloUserBookingType20, TicketsPageInfoBottomSheetPositiveCtaType.PRICE_CHANGED, null, 32), null, false, null, false, null, false, false, null, false, null, null, null, false, 33521151);
                            default:
                                Intrinsics.i(it, "it");
                                return MyTicketsDataState.a(it, null, null, null, false, false, null, null, new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str28, str29, str314, null), ((BookableProductConfigForRenewSuccessType.ProofRequirementChanged) bookableProductConfigForRenewSuccessType12).f10152a, superPass14, chaloUserBookingType20, TicketsPageInfoBottomSheetPositiveCtaType.PROOF_REQUIRED, null, 32), null, false, null, false, null, false, false, null, false, null, null, null, false, 33521151);
                        }
                    }
                });
                homeScreenInfoHelper.d(false);
                return Unit.f17538a;
            case 20:
                bookableProductConfigForRenewSuccessType2 = (BookableProductConfigForRenewSuccessType) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2;
                chaloUserBookingType2 = (ChaloUserBookingType) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1;
                superPass2 = (SuperPass) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0;
                ResultKt.b(obj2);
                str30 = (String) obj2;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass2;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType2;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = bookableProductConfigForRenewSuccessType2;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$3 = str30;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 21;
                objB20 = stringProvider.b(StringEnum.PROOF_REQUIREMENT_CHANGED_MSG, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                if (objB20 != coroutineSingletons) {
                    ChaloUserBookingType chaloUserBookingType211 = chaloUserBookingType2;
                    bookableProductConfigForRenewSuccessType5 = bookableProductConfigForRenewSuccessType2;
                    str31 = str30;
                    obj2 = objB20;
                    chaloUserBookingType21 = chaloUserBookingType211;
                    str32 = (String) obj2;
                    u1(str31, str32, superPass2);
                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass2;
                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType21;
                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = bookableProductConfigForRenewSuccessType5;
                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$3 = str31;
                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$4 = str32;
                    myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 22;
                    objB21 = stringProvider.b(StringEnum.OKAY, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                    if (objB21 != coroutineSingletons) {
                        str33 = str31;
                        str34 = str32;
                        obj2 = objB21;
                        superPass15 = superPass2;
                        chaloUserBookingType22 = chaloUserBookingType21;
                        final BookableProductConfigForRenewSuccessType bookableProductConfigForRenewSuccessType13 = bookableProductConfigForRenewSuccessType5;
                        final String str315 = (String) obj2;
                        final int i10 = 1;
                        E0(new Function1() { // from class: uk0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                MyTicketsDataState it = (MyTicketsDataState) obj3;
                                switch (i10) {
                                    case 0:
                                        Intrinsics.i(it, "it");
                                        return MyTicketsDataState.a(it, null, null, null, false, false, null, null, new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str33, str34, str315, null), ((BookableProductConfigForRenewSuccessType.PriceChanged) bookableProductConfigForRenewSuccessType13).f10151a, superPass15, chaloUserBookingType22, TicketsPageInfoBottomSheetPositiveCtaType.PRICE_CHANGED, null, 32), null, false, null, false, null, false, false, null, false, null, null, null, false, 33521151);
                                    default:
                                        Intrinsics.i(it, "it");
                                        return MyTicketsDataState.a(it, null, null, null, false, false, null, null, new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str33, str34, str315, null), ((BookableProductConfigForRenewSuccessType.ProofRequirementChanged) bookableProductConfigForRenewSuccessType13).f10152a, superPass15, chaloUserBookingType22, TicketsPageInfoBottomSheetPositiveCtaType.PROOF_REQUIRED, null, 32), null, false, null, false, null, false, false, null, false, null, null, null, false, 33521151);
                                }
                            }
                        });
                        homeScreenInfoHelper.d(false);
                        return Unit.f17538a;
                    }
                }
                return coroutineSingletons;
            case 21:
                str31 = (String) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$3;
                bookableProductConfigForRenewSuccessType5 = (BookableProductConfigForRenewSuccessType) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2;
                ChaloUserBookingType chaloUserBookingType40 = (ChaloUserBookingType) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1;
                SuperPass superPass30 = (SuperPass) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0;
                ResultKt.b(obj2);
                chaloUserBookingType21 = chaloUserBookingType40;
                superPass2 = superPass30;
                str32 = (String) obj2;
                u1(str31, str32, superPass2);
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0 = superPass2;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1 = chaloUserBookingType21;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2 = bookableProductConfigForRenewSuccessType5;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$3 = str31;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$4 = str32;
                myTicketsComponent$checkAndLaunchConfirmationFlow$1.label = 22;
                objB21 = stringProvider.b(StringEnum.OKAY, new Object[0], myTicketsComponent$checkAndLaunchConfirmationFlow$1);
                if (objB21 != coroutineSingletons) {
                    str33 = str31;
                    str34 = str32;
                    obj2 = objB21;
                    superPass15 = superPass2;
                    chaloUserBookingType22 = chaloUserBookingType21;
                    final BookableProductConfigForRenewSuccessType bookableProductConfigForRenewSuccessType14 = bookableProductConfigForRenewSuccessType5;
                    final String str316 = (String) obj2;
                    final int i11 = 1;
                    E0(new Function1() { // from class: uk0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            MyTicketsDataState it = (MyTicketsDataState) obj3;
                            switch (i11) {
                                case 0:
                                    Intrinsics.i(it, "it");
                                    return MyTicketsDataState.a(it, null, null, null, false, false, null, null, new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str33, str34, str316, null), ((BookableProductConfigForRenewSuccessType.PriceChanged) bookableProductConfigForRenewSuccessType14).f10151a, superPass15, chaloUserBookingType22, TicketsPageInfoBottomSheetPositiveCtaType.PRICE_CHANGED, null, 32), null, false, null, false, null, false, false, null, false, null, null, null, false, 33521151);
                                default:
                                    Intrinsics.i(it, "it");
                                    return MyTicketsDataState.a(it, null, null, null, false, false, null, null, new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str33, str34, str316, null), ((BookableProductConfigForRenewSuccessType.ProofRequirementChanged) bookableProductConfigForRenewSuccessType14).f10152a, superPass15, chaloUserBookingType22, TicketsPageInfoBottomSheetPositiveCtaType.PROOF_REQUIRED, null, 32), null, false, null, false, null, false, false, null, false, null, null, null, false, 33521151);
                            }
                        }
                    });
                    homeScreenInfoHelper.d(false);
                    return Unit.f17538a;
                }
                return coroutineSingletons;
            case 22:
                String str53 = (String) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$4;
                String str54 = (String) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$3;
                bookableProductConfigForRenewSuccessType5 = (BookableProductConfigForRenewSuccessType) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$2;
                ChaloUserBookingType chaloUserBookingType41 = (ChaloUserBookingType) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$1;
                SuperPass superPass31 = (SuperPass) myTicketsComponent$checkAndLaunchConfirmationFlow$1.L$0;
                ResultKt.b(obj2);
                str34 = str53;
                superPass15 = superPass31;
                str33 = str54;
                chaloUserBookingType22 = chaloUserBookingType41;
                final BookableProductConfigForRenewSuccessType bookableProductConfigForRenewSuccessType15 = bookableProductConfigForRenewSuccessType5;
                final String str317 = (String) obj2;
                final int i12 = 1;
                E0(new Function1() { // from class: uk0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        MyTicketsDataState it = (MyTicketsDataState) obj3;
                        switch (i12) {
                            case 0:
                                Intrinsics.i(it, "it");
                                return MyTicketsDataState.a(it, null, null, null, false, false, null, null, new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str33, str34, str317, null), ((BookableProductConfigForRenewSuccessType.PriceChanged) bookableProductConfigForRenewSuccessType15).f10151a, superPass15, chaloUserBookingType22, TicketsPageInfoBottomSheetPositiveCtaType.PRICE_CHANGED, null, 32), null, false, null, false, null, false, false, null, false, null, null, null, false, 33521151);
                            default:
                                Intrinsics.i(it, "it");
                                return MyTicketsDataState.a(it, null, null, null, false, false, null, null, new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str33, str34, str317, null), ((BookableProductConfigForRenewSuccessType.ProofRequirementChanged) bookableProductConfigForRenewSuccessType15).f10152a, superPass15, chaloUserBookingType22, TicketsPageInfoBottomSheetPositiveCtaType.PROOF_REQUIRED, null, 32), null, false, null, false, null, false, false, null, false, null, null, null, false, 33521151);
                        }
                    }
                });
                homeScreenInfoHelper.d(false);
                return Unit.f17538a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final Object e1(boolean z, ChaloUserBookingType.SuperPassBooking superPassBooking, SuperPassSubTypes superPassSubTypes, String str, int i, Continuation continuation) {
        Unit unit = Unit.f17538a;
        if (z) {
            this.Q.b(new ChaloNavigationRequest.Navigate(new PbBulkBookingRideDetailsArgs(i, superPassSubTypes, superPassBooking.f2987a, str), null, null, 6));
            return unit;
        }
        Object objZ1 = z1(superPassBooking, (ContinuationImpl) continuation);
        return objZ1 == CoroutineSingletons.COROUTINE_SUSPENDED ? objZ1 : unit;
    }

    public final void f1() {
        PendingUseNowContext pendingUseNowContext = this.f0;
        if (pendingUseNowContext == null) {
            return;
        }
        this.f0 = null;
        x1();
        w0(new MyTicketsComponent$continuePendingUseNow$1(this, pendingUseNowContext, null));
    }

    public final LinkedHashMap h1(SuperPass superPass) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("isSuperPass", Boolean.TRUE);
        linkedHashMap.put("passId", superPass.f9560a.f9566a);
        SuperPassProperties superPassProperties = superPass.f9560a;
        linkedHashMap.put("productType", superPassProperties.b);
        linkedHashMap.put("productSubType", superPassProperties.c.toString());
        SuperPassRepurchaseProperties superPassRepurchaseProperties = superPass.d;
        linkedHashMap.put("categoryId", superPassRepurchaseProperties.b);
        linkedHashMap.put("fareMappingId", Integer.valueOf(superPassRepurchaseProperties.c));
        linkedHashMap.put("productId", superPassRepurchaseProperties.f9569a);
        linkedHashMap.put("productName", superPass.getC().g);
        linkedHashMap.put("pass status", superPass.getB().f9582a.toString());
        linkedHashMap.put("verificationFlag", Boolean.valueOf(superPassRepurchaseProperties.e));
        long j = superPassRepurchaseProperties.d;
        TimeUtilsContract timeUtilsContract = this.o;
        linkedHashMap.put("verificationExpiryTime", timeUtilsContract.Q(j));
        linkedHashMap.put("expiry time", timeUtilsContract.Q(superPass.getB().c));
        SuperPassTransactionDetails superPassTransactionDetails = superPass.e;
        linkedHashMap.put("paymentMode", superPassTransactionDetails.b);
        linkedHashMap.put("transaction id", superPassTransactionDetails.f9573a);
        linkedHashMap.put("startDate", timeUtilsContract.Q(superPass.getB().b));
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x021b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0237  */
    /* JADX WARN: Code duplicated, block: B:108:0x0255  */
    /* JADX WARN: Code duplicated, block: B:72:0x0176  */
    /* JADX WARN: Code duplicated, block: B:76:0x0195  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c9  */
    public final Object i1(ChaloUserBookingType chaloUserBookingType, ContinuationImpl continuationImpl) {
        MyTicketsComponent$handleActivationFlow$1 myTicketsComponent$handleActivationFlow$1;
        String str;
        Object objB;
        ChaloUserBookingType chaloUserBookingType2;
        String str2;
        String str3;
        Object objB2;
        String str4;
        String str5;
        String str6;
        Object objB3;
        String str7;
        String str8;
        ChaloUserBookingType chaloUserBookingType3;
        String str9;
        StringEnum stringEnum;
        Object[] objArr;
        Object objA;
        StringEnum stringEnum2;
        ChaloUserBookingType chaloUserBookingType4;
        Object[] objArr2;
        StringProvider stringProvider;
        int i;
        ChaloUserBookingType chaloUserBookingType5;
        String str10;
        Object objB4;
        String str11;
        String str12;
        Object objB5;
        ChaloUserBookingType chaloUserBookingType6;
        String str13;
        String str14;
        ChaloUserBookingType chaloUserBookingType7 = chaloUserBookingType;
        if (continuationImpl instanceof MyTicketsComponent$handleActivationFlow$1) {
            myTicketsComponent$handleActivationFlow$1 = (MyTicketsComponent$handleActivationFlow$1) continuationImpl;
            int i2 = myTicketsComponent$handleActivationFlow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                myTicketsComponent$handleActivationFlow$1.label = i2 - Integer.MIN_VALUE;
            } else {
                myTicketsComponent$handleActivationFlow$1 = new MyTicketsComponent$handleActivationFlow$1(this, continuationImpl);
            }
        } else {
            myTicketsComponent$handleActivationFlow$1 = new MyTicketsComponent$handleActivationFlow$1(this, continuationImpl);
        }
        Object objB6 = myTicketsComponent$handleActivationFlow$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = myTicketsComponent$handleActivationFlow$1.label;
        HomeScreenInfoHelper homeScreenInfoHelper = this.n;
        Unit unit = Unit.f17538a;
        StringProvider stringProvider2 = this.r;
        switch (i3) {
            case 0:
                ResultKt.b(objB6);
                if ((chaloUserBookingType7 instanceof ChaloUserBookingType.SuperPassBooking.MagicSuperPassBooking) || (chaloUserBookingType7 instanceof ChaloUserBookingType.SuperPassBooking.RideBasedSuperPassBooking)) {
                    myTicketsComponent$handleActivationFlow$1.L$0 = chaloUserBookingType7;
                    myTicketsComponent$handleActivationFlow$1.label = 1;
                    objB6 = stringProvider2.b(StringEnum.PASS_USE_TITLE, new Object[0], myTicketsComponent$handleActivationFlow$1);
                    if (objB6 != obj) {
                        str = (String) objB6;
                        myTicketsComponent$handleActivationFlow$1.L$0 = chaloUserBookingType7;
                        myTicketsComponent$handleActivationFlow$1.L$1 = str;
                        myTicketsComponent$handleActivationFlow$1.label = 2;
                        objB = stringProvider2.b(StringEnum.PASS_USE_MSG, new Object[0], myTicketsComponent$handleActivationFlow$1);
                        if (objB != obj) {
                            chaloUserBookingType2 = chaloUserBookingType7;
                            str2 = str;
                            objB6 = objB;
                            str3 = (String) objB6;
                            myTicketsComponent$handleActivationFlow$1.L$0 = chaloUserBookingType2;
                            myTicketsComponent$handleActivationFlow$1.L$1 = str2;
                            myTicketsComponent$handleActivationFlow$1.L$2 = str3;
                            myTicketsComponent$handleActivationFlow$1.label = 3;
                            objB2 = stringProvider2.b(StringEnum.START_NOW, new Object[0], myTicketsComponent$handleActivationFlow$1);
                            if (objB2 != obj) {
                                str4 = str2;
                                str5 = str3;
                                objB6 = objB2;
                                str6 = (String) objB6;
                                myTicketsComponent$handleActivationFlow$1.L$0 = chaloUserBookingType2;
                                myTicketsComponent$handleActivationFlow$1.L$1 = str4;
                                myTicketsComponent$handleActivationFlow$1.L$2 = str5;
                                myTicketsComponent$handleActivationFlow$1.L$3 = str6;
                                myTicketsComponent$handleActivationFlow$1.label = 4;
                                objB3 = stringProvider2.b(StringEnum.CANCEL, new Object[0], myTicketsComponent$handleActivationFlow$1);
                                if (objB3 != obj) {
                                    str7 = str5;
                                    str8 = str6;
                                    objB6 = objB3;
                                    chaloUserBookingType3 = chaloUserBookingType2;
                                    str9 = str4;
                                    E0(new o3(str9, str7, str8, (String) objB6, chaloUserBookingType3, 4));
                                    homeScreenInfoHelper.d(false);
                                    return unit;
                                }
                            }
                        }
                    }
                } else if (chaloUserBookingType7 instanceof ChaloUserBookingType.TicketBooking.PremiumBusBooking) {
                    myTicketsComponent$handleActivationFlow$1.label = 5;
                    if (A1((ChaloUserBookingType.TicketBooking.PremiumBusBooking) chaloUserBookingType7, myTicketsComponent$handleActivationFlow$1) != obj) {
                        return unit;
                    }
                } else {
                    if ((chaloUserBookingType7 instanceof ChaloUserBookingType.TicketBooking.QuickPayBooking) || (chaloUserBookingType7 instanceof ChaloUserBookingType.TicketBooking.InstantTicketBooking)) {
                        w0(new MyTicketsComponent$handleActivationFlow$3(this, chaloUserBookingType7, null));
                        return unit;
                    }
                    if ((chaloUserBookingType7 instanceof ChaloUserBookingType.SuperPassBooking.PendingSuperPassBooking) || (chaloUserBookingType7 instanceof ChaloUserBookingType.SuperPassBooking.SuperPassApplicationBooking) || (chaloUserBookingType7 instanceof ChaloUserBookingType.TicketBooking.PassRideBooking)) {
                        return unit;
                    }
                    if (chaloUserBookingType7 instanceof ChaloUserBookingType.TicketBooking.OndcTicketBooking) {
                        w0(new MyTicketsComponent$handleActivationFlow$4(this, chaloUserBookingType7, null));
                        return unit;
                    }
                    if ((chaloUserBookingType7 instanceof ChaloUserBookingType.TicketBooking.OndcMetroTicketBooking) || (chaloUserBookingType7 instanceof ChaloUserBookingType.TicketBooking.MetroTicketBooking)) {
                        w0(new MyTicketsComponent$handleActivationFlow$5(this, chaloUserBookingType7, null));
                        return unit;
                    }
                    if (chaloUserBookingType7 instanceof ChaloUserBookingType.TicketBooking.MultiModalGroupTicketBooking) {
                        w0(new MyTicketsComponent$handleActivationFlow$6(this, chaloUserBookingType7, null));
                        return unit;
                    }
                    if ((chaloUserBookingType7 instanceof ChaloUserBookingType.CardBooking.CardRechargeBooking) || (chaloUserBookingType7 instanceof ChaloUserBookingType.CardBooking.CardTransactionReceiptBooking)) {
                        return unit;
                    }
                    if (!(chaloUserBookingType7 instanceof ChaloUserBookingType.TicketBooking.MobileTicketBooking)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    MTicketConfiguration mTicketConfiguration = ((ChaloUserBookingType.TicketBooking.MobileTicketBooking) chaloUserBookingType7).d.r;
                    myTicketsComponent$handleActivationFlow$1.L$0 = chaloUserBookingType7;
                    myTicketsComponent$handleActivationFlow$1.label = 6;
                    objB6 = this.X.c(mTicketConfiguration, myTicketsComponent$handleActivationFlow$1);
                    if (objB6 != obj) {
                        long jLongValue = ((Number) objB6).longValue();
                        stringEnum = StringEnum.DIALOG_MESSAGE_CONFIRM_MTICKET_ACTIVATION;
                        objArr = new Object[1];
                        myTicketsComponent$handleActivationFlow$1.L$0 = chaloUserBookingType7;
                        myTicketsComponent$handleActivationFlow$1.L$1 = objArr;
                        myTicketsComponent$handleActivationFlow$1.L$2 = stringProvider2;
                        myTicketsComponent$handleActivationFlow$1.L$3 = stringEnum;
                        myTicketsComponent$handleActivationFlow$1.L$4 = objArr;
                        myTicketsComponent$handleActivationFlow$1.I$0 = 0;
                        myTicketsComponent$handleActivationFlow$1.label = 7;
                        objA = this.o.a(jLongValue, myTicketsComponent$handleActivationFlow$1);
                        if (objA != obj) {
                            stringEnum2 = stringEnum;
                            objB6 = objA;
                            chaloUserBookingType4 = chaloUserBookingType7;
                            objArr2 = objArr;
                            stringProvider = stringProvider2;
                            i = 0;
                            objArr[i] = objB6;
                            myTicketsComponent$handleActivationFlow$1.L$0 = chaloUserBookingType4;
                            myTicketsComponent$handleActivationFlow$1.L$1 = null;
                            myTicketsComponent$handleActivationFlow$1.L$2 = null;
                            myTicketsComponent$handleActivationFlow$1.L$3 = null;
                            myTicketsComponent$handleActivationFlow$1.L$4 = null;
                            myTicketsComponent$handleActivationFlow$1.label = 8;
                            objB6 = stringProvider.b(stringEnum2, objArr2, myTicketsComponent$handleActivationFlow$1);
                            if (objB6 != obj) {
                                chaloUserBookingType5 = chaloUserBookingType4;
                                str10 = (String) objB6;
                                myTicketsComponent$handleActivationFlow$1.L$0 = chaloUserBookingType5;
                                myTicketsComponent$handleActivationFlow$1.L$1 = str10;
                                myTicketsComponent$handleActivationFlow$1.label = 9;
                                objB4 = stringProvider2.b(StringEnum.START_NOW_SMALL, new Object[0], myTicketsComponent$handleActivationFlow$1);
                                if (objB4 != obj) {
                                    str11 = str10;
                                    objB6 = objB4;
                                    str12 = (String) objB6;
                                    myTicketsComponent$handleActivationFlow$1.L$0 = chaloUserBookingType5;
                                    myTicketsComponent$handleActivationFlow$1.L$1 = str11;
                                    myTicketsComponent$handleActivationFlow$1.L$2 = str12;
                                    myTicketsComponent$handleActivationFlow$1.label = 10;
                                    objB5 = stringProvider2.b(StringEnum.NO_SMALL, new Object[0], myTicketsComponent$handleActivationFlow$1);
                                    if (objB5 != obj) {
                                        chaloUserBookingType6 = chaloUserBookingType5;
                                        str13 = str12;
                                        objB6 = objB5;
                                        str14 = str11;
                                        E0(new n3(str14, str13, (String) objB6, chaloUserBookingType6, 15));
                                        homeScreenInfoHelper.d(false);
                                        return unit;
                                    }
                                }
                            }
                        }
                    }
                }
                return obj;
            case 1:
                chaloUserBookingType7 = (ChaloUserBookingType) myTicketsComponent$handleActivationFlow$1.L$0;
                ResultKt.b(objB6);
                str = (String) objB6;
                myTicketsComponent$handleActivationFlow$1.L$0 = chaloUserBookingType7;
                myTicketsComponent$handleActivationFlow$1.L$1 = str;
                myTicketsComponent$handleActivationFlow$1.label = 2;
                objB = stringProvider2.b(StringEnum.PASS_USE_MSG, new Object[0], myTicketsComponent$handleActivationFlow$1);
                if (objB != obj) {
                    chaloUserBookingType2 = chaloUserBookingType7;
                    str2 = str;
                    objB6 = objB;
                    str3 = (String) objB6;
                    myTicketsComponent$handleActivationFlow$1.L$0 = chaloUserBookingType2;
                    myTicketsComponent$handleActivationFlow$1.L$1 = str2;
                    myTicketsComponent$handleActivationFlow$1.L$2 = str3;
                    myTicketsComponent$handleActivationFlow$1.label = 3;
                    objB2 = stringProvider2.b(StringEnum.START_NOW, new Object[0], myTicketsComponent$handleActivationFlow$1);
                    if (objB2 != obj) {
                        str4 = str2;
                        str5 = str3;
                        objB6 = objB2;
                        str6 = (String) objB6;
                        myTicketsComponent$handleActivationFlow$1.L$0 = chaloUserBookingType2;
                        myTicketsComponent$handleActivationFlow$1.L$1 = str4;
                        myTicketsComponent$handleActivationFlow$1.L$2 = str5;
                        myTicketsComponent$handleActivationFlow$1.L$3 = str6;
                        myTicketsComponent$handleActivationFlow$1.label = 4;
                        objB3 = stringProvider2.b(StringEnum.CANCEL, new Object[0], myTicketsComponent$handleActivationFlow$1);
                        if (objB3 != obj) {
                            str7 = str5;
                            str8 = str6;
                            objB6 = objB3;
                            chaloUserBookingType3 = chaloUserBookingType2;
                            str9 = str4;
                            E0(new o3(str9, str7, str8, (String) objB6, chaloUserBookingType3, 4));
                            homeScreenInfoHelper.d(false);
                            return unit;
                        }
                    }
                }
                return obj;
            case 2:
                str2 = (String) myTicketsComponent$handleActivationFlow$1.L$1;
                chaloUserBookingType2 = (ChaloUserBookingType) myTicketsComponent$handleActivationFlow$1.L$0;
                ResultKt.b(objB6);
                str3 = (String) objB6;
                myTicketsComponent$handleActivationFlow$1.L$0 = chaloUserBookingType2;
                myTicketsComponent$handleActivationFlow$1.L$1 = str2;
                myTicketsComponent$handleActivationFlow$1.L$2 = str3;
                myTicketsComponent$handleActivationFlow$1.label = 3;
                objB2 = stringProvider2.b(StringEnum.START_NOW, new Object[0], myTicketsComponent$handleActivationFlow$1);
                if (objB2 != obj) {
                    str4 = str2;
                    str5 = str3;
                    objB6 = objB2;
                    str6 = (String) objB6;
                    myTicketsComponent$handleActivationFlow$1.L$0 = chaloUserBookingType2;
                    myTicketsComponent$handleActivationFlow$1.L$1 = str4;
                    myTicketsComponent$handleActivationFlow$1.L$2 = str5;
                    myTicketsComponent$handleActivationFlow$1.L$3 = str6;
                    myTicketsComponent$handleActivationFlow$1.label = 4;
                    objB3 = stringProvider2.b(StringEnum.CANCEL, new Object[0], myTicketsComponent$handleActivationFlow$1);
                    if (objB3 != obj) {
                        str7 = str5;
                        str8 = str6;
                        objB6 = objB3;
                        chaloUserBookingType3 = chaloUserBookingType2;
                        str9 = str4;
                        E0(new o3(str9, str7, str8, (String) objB6, chaloUserBookingType3, 4));
                        homeScreenInfoHelper.d(false);
                        return unit;
                    }
                }
                return obj;
            case 3:
                str5 = (String) myTicketsComponent$handleActivationFlow$1.L$2;
                String str15 = (String) myTicketsComponent$handleActivationFlow$1.L$1;
                ChaloUserBookingType chaloUserBookingType8 = (ChaloUserBookingType) myTicketsComponent$handleActivationFlow$1.L$0;
                ResultKt.b(objB6);
                str4 = str15;
                chaloUserBookingType2 = chaloUserBookingType8;
                str6 = (String) objB6;
                myTicketsComponent$handleActivationFlow$1.L$0 = chaloUserBookingType2;
                myTicketsComponent$handleActivationFlow$1.L$1 = str4;
                myTicketsComponent$handleActivationFlow$1.L$2 = str5;
                myTicketsComponent$handleActivationFlow$1.L$3 = str6;
                myTicketsComponent$handleActivationFlow$1.label = 4;
                objB3 = stringProvider2.b(StringEnum.CANCEL, new Object[0], myTicketsComponent$handleActivationFlow$1);
                if (objB3 != obj) {
                    str7 = str5;
                    str8 = str6;
                    objB6 = objB3;
                    chaloUserBookingType3 = chaloUserBookingType2;
                    str9 = str4;
                    E0(new o3(str9, str7, str8, (String) objB6, chaloUserBookingType3, 4));
                    homeScreenInfoHelper.d(false);
                    return unit;
                }
                return obj;
            case 4:
                String str16 = (String) myTicketsComponent$handleActivationFlow$1.L$3;
                String str17 = (String) myTicketsComponent$handleActivationFlow$1.L$2;
                String str18 = (String) myTicketsComponent$handleActivationFlow$1.L$1;
                ChaloUserBookingType chaloUserBookingType9 = (ChaloUserBookingType) myTicketsComponent$handleActivationFlow$1.L$0;
                ResultKt.b(objB6);
                str8 = str16;
                chaloUserBookingType3 = chaloUserBookingType9;
                str7 = str17;
                str9 = str18;
                E0(new o3(str9, str7, str8, (String) objB6, chaloUserBookingType3, 4));
                homeScreenInfoHelper.d(false);
                return unit;
            case 5:
                ResultKt.b(objB6);
                return unit;
            case 6:
                chaloUserBookingType7 = (ChaloUserBookingType) myTicketsComponent$handleActivationFlow$1.L$0;
                ResultKt.b(objB6);
                long jLongValue2 = ((Number) objB6).longValue();
                stringEnum = StringEnum.DIALOG_MESSAGE_CONFIRM_MTICKET_ACTIVATION;
                objArr = new Object[1];
                myTicketsComponent$handleActivationFlow$1.L$0 = chaloUserBookingType7;
                myTicketsComponent$handleActivationFlow$1.L$1 = objArr;
                myTicketsComponent$handleActivationFlow$1.L$2 = stringProvider2;
                myTicketsComponent$handleActivationFlow$1.L$3 = stringEnum;
                myTicketsComponent$handleActivationFlow$1.L$4 = objArr;
                myTicketsComponent$handleActivationFlow$1.I$0 = 0;
                myTicketsComponent$handleActivationFlow$1.label = 7;
                objA = this.o.a(jLongValue2, myTicketsComponent$handleActivationFlow$1);
                if (objA != obj) {
                    stringEnum2 = stringEnum;
                    objB6 = objA;
                    chaloUserBookingType4 = chaloUserBookingType7;
                    objArr2 = objArr;
                    stringProvider = stringProvider2;
                    i = 0;
                    objArr[i] = objB6;
                    myTicketsComponent$handleActivationFlow$1.L$0 = chaloUserBookingType4;
                    myTicketsComponent$handleActivationFlow$1.L$1 = null;
                    myTicketsComponent$handleActivationFlow$1.L$2 = null;
                    myTicketsComponent$handleActivationFlow$1.L$3 = null;
                    myTicketsComponent$handleActivationFlow$1.L$4 = null;
                    myTicketsComponent$handleActivationFlow$1.label = 8;
                    objB6 = stringProvider.b(stringEnum2, objArr2, myTicketsComponent$handleActivationFlow$1);
                    if (objB6 != obj) {
                        chaloUserBookingType5 = chaloUserBookingType4;
                        str10 = (String) objB6;
                        myTicketsComponent$handleActivationFlow$1.L$0 = chaloUserBookingType5;
                        myTicketsComponent$handleActivationFlow$1.L$1 = str10;
                        myTicketsComponent$handleActivationFlow$1.label = 9;
                        objB4 = stringProvider2.b(StringEnum.START_NOW_SMALL, new Object[0], myTicketsComponent$handleActivationFlow$1);
                        if (objB4 != obj) {
                            str11 = str10;
                            objB6 = objB4;
                            str12 = (String) objB6;
                            myTicketsComponent$handleActivationFlow$1.L$0 = chaloUserBookingType5;
                            myTicketsComponent$handleActivationFlow$1.L$1 = str11;
                            myTicketsComponent$handleActivationFlow$1.L$2 = str12;
                            myTicketsComponent$handleActivationFlow$1.label = 10;
                            objB5 = stringProvider2.b(StringEnum.NO_SMALL, new Object[0], myTicketsComponent$handleActivationFlow$1);
                            if (objB5 != obj) {
                                chaloUserBookingType6 = chaloUserBookingType5;
                                str13 = str12;
                                objB6 = objB5;
                                str14 = str11;
                                E0(new n3(str14, str13, (String) objB6, chaloUserBookingType6, 15));
                                homeScreenInfoHelper.d(false);
                                return unit;
                            }
                        }
                    }
                }
                return obj;
            case 7:
                i = myTicketsComponent$handleActivationFlow$1.I$0;
                objArr = (Object[]) myTicketsComponent$handleActivationFlow$1.L$4;
                stringEnum2 = (StringEnum) myTicketsComponent$handleActivationFlow$1.L$3;
                stringProvider = (StringProvider) myTicketsComponent$handleActivationFlow$1.L$2;
                objArr2 = (Object[]) myTicketsComponent$handleActivationFlow$1.L$1;
                chaloUserBookingType4 = (ChaloUserBookingType) myTicketsComponent$handleActivationFlow$1.L$0;
                ResultKt.b(objB6);
                objArr[i] = objB6;
                myTicketsComponent$handleActivationFlow$1.L$0 = chaloUserBookingType4;
                myTicketsComponent$handleActivationFlow$1.L$1 = null;
                myTicketsComponent$handleActivationFlow$1.L$2 = null;
                myTicketsComponent$handleActivationFlow$1.L$3 = null;
                myTicketsComponent$handleActivationFlow$1.L$4 = null;
                myTicketsComponent$handleActivationFlow$1.label = 8;
                objB6 = stringProvider.b(stringEnum2, objArr2, myTicketsComponent$handleActivationFlow$1);
                if (objB6 != obj) {
                    chaloUserBookingType5 = chaloUserBookingType4;
                    str10 = (String) objB6;
                    myTicketsComponent$handleActivationFlow$1.L$0 = chaloUserBookingType5;
                    myTicketsComponent$handleActivationFlow$1.L$1 = str10;
                    myTicketsComponent$handleActivationFlow$1.label = 9;
                    objB4 = stringProvider2.b(StringEnum.START_NOW_SMALL, new Object[0], myTicketsComponent$handleActivationFlow$1);
                    if (objB4 != obj) {
                        str11 = str10;
                        objB6 = objB4;
                        str12 = (String) objB6;
                        myTicketsComponent$handleActivationFlow$1.L$0 = chaloUserBookingType5;
                        myTicketsComponent$handleActivationFlow$1.L$1 = str11;
                        myTicketsComponent$handleActivationFlow$1.L$2 = str12;
                        myTicketsComponent$handleActivationFlow$1.label = 10;
                        objB5 = stringProvider2.b(StringEnum.NO_SMALL, new Object[0], myTicketsComponent$handleActivationFlow$1);
                        if (objB5 != obj) {
                            chaloUserBookingType6 = chaloUserBookingType5;
                            str13 = str12;
                            objB6 = objB5;
                            str14 = str11;
                            E0(new n3(str14, str13, (String) objB6, chaloUserBookingType6, 15));
                            homeScreenInfoHelper.d(false);
                            return unit;
                        }
                    }
                }
                return obj;
            case 8:
                chaloUserBookingType5 = (ChaloUserBookingType) myTicketsComponent$handleActivationFlow$1.L$0;
                ResultKt.b(objB6);
                str10 = (String) objB6;
                myTicketsComponent$handleActivationFlow$1.L$0 = chaloUserBookingType5;
                myTicketsComponent$handleActivationFlow$1.L$1 = str10;
                myTicketsComponent$handleActivationFlow$1.label = 9;
                objB4 = stringProvider2.b(StringEnum.START_NOW_SMALL, new Object[0], myTicketsComponent$handleActivationFlow$1);
                if (objB4 != obj) {
                    str11 = str10;
                    objB6 = objB4;
                    str12 = (String) objB6;
                    myTicketsComponent$handleActivationFlow$1.L$0 = chaloUserBookingType5;
                    myTicketsComponent$handleActivationFlow$1.L$1 = str11;
                    myTicketsComponent$handleActivationFlow$1.L$2 = str12;
                    myTicketsComponent$handleActivationFlow$1.label = 10;
                    objB5 = stringProvider2.b(StringEnum.NO_SMALL, new Object[0], myTicketsComponent$handleActivationFlow$1);
                    if (objB5 != obj) {
                        chaloUserBookingType6 = chaloUserBookingType5;
                        str13 = str12;
                        objB6 = objB5;
                        str14 = str11;
                        E0(new n3(str14, str13, (String) objB6, chaloUserBookingType6, 15));
                        homeScreenInfoHelper.d(false);
                        return unit;
                    }
                }
                return obj;
            case 9:
                String str19 = (String) myTicketsComponent$handleActivationFlow$1.L$1;
                ChaloUserBookingType chaloUserBookingType10 = (ChaloUserBookingType) myTicketsComponent$handleActivationFlow$1.L$0;
                ResultKt.b(objB6);
                str11 = str19;
                chaloUserBookingType5 = chaloUserBookingType10;
                str12 = (String) objB6;
                myTicketsComponent$handleActivationFlow$1.L$0 = chaloUserBookingType5;
                myTicketsComponent$handleActivationFlow$1.L$1 = str11;
                myTicketsComponent$handleActivationFlow$1.L$2 = str12;
                myTicketsComponent$handleActivationFlow$1.label = 10;
                objB5 = stringProvider2.b(StringEnum.NO_SMALL, new Object[0], myTicketsComponent$handleActivationFlow$1);
                if (objB5 != obj) {
                    chaloUserBookingType6 = chaloUserBookingType5;
                    str13 = str12;
                    objB6 = objB5;
                    str14 = str11;
                    E0(new n3(str14, str13, (String) objB6, chaloUserBookingType6, 15));
                    homeScreenInfoHelper.d(false);
                    return unit;
                }
                return obj;
            case 10:
                String str20 = (String) myTicketsComponent$handleActivationFlow$1.L$2;
                String str21 = (String) myTicketsComponent$handleActivationFlow$1.L$1;
                ChaloUserBookingType chaloUserBookingType11 = (ChaloUserBookingType) myTicketsComponent$handleActivationFlow$1.L$0;
                ResultKt.b(objB6);
                str13 = str20;
                chaloUserBookingType6 = chaloUserBookingType11;
                str14 = str21;
                E0(new n3(str14, str13, (String) objB6, chaloUserBookingType6, 15));
                homeScreenInfoHelper.d(false);
                return unit;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void j1() {
        HomeScreenAnalyticsHelper.DefaultImpls.a(this.E, "notification permission explainer skipped", null, Source.MY_TICKETS_SCREEN_TAB, 14);
        this.n.d(true);
        E0(new sk0(13));
        f1();
    }

    public final void k1(MyTicketsViewIntent.NotificationPermissionUpdatedIntent notificationPermissionUpdatedIntent) {
        boolean z = notificationPermissionUpdatedIntent.f3426a;
        HomeScreenAnalyticsHelper homeScreenAnalyticsHelper = this.E;
        HomeScreenInfoHelper homeScreenInfoHelper = this.n;
        if (z) {
            HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "notification permission granted", null, Source.MY_TICKETS_SCREEN_TAB, 14);
            homeScreenInfoHelper.d(true);
            E0(new sk0(1));
            f1();
            return;
        }
        Source source = Source.MY_TICKETS_SCREEN_TAB;
        HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "notification permission denied", null, source, 14);
        HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "notification permission explainer rendered", null, source, 14);
        homeScreenInfoHelper.d(false);
        E0(new sk0(0));
    }

    /* JADX WARN: Code duplicated, block: B:110:0x02ca A[PHI: r1 r2 r3
      0x02ca: PHI (r1v38 app.chalo.home.domain.ChaloUserBookingType) = (r1v35 app.chalo.home.domain.ChaloUserBookingType), (r1v41 app.chalo.home.domain.ChaloUserBookingType) binds: [B:108:0x02c6, B:26:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x02ca: PHI (r2v26 java.lang.String) = (r2v24 java.lang.String), (r2v29 java.lang.String) binds: [B:108:0x02c6, B:26:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x02ca: PHI (r3v27 java.lang.Object) = (r3v25 java.lang.Object), (r3v1 java.lang.Object) binds: [B:108:0x02c6, B:26:0x00ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:113:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:124:0x034a  */
    /* JADX WARN: Code duplicated, block: B:135:0x039c  */
    /* JADX WARN: Code duplicated, block: B:139:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:150:0x0411  */
    /* JADX WARN: Code duplicated, block: B:154:0x0431  */
    /* JADX WARN: Code duplicated, block: B:165:0x0487  */
    /* JADX WARN: Code duplicated, block: B:170:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0258 A[PHI: r1 r2 r3
      0x0258: PHI (r1v29 app.chalo.home.domain.ChaloUserBookingType) = (r1v26 app.chalo.home.domain.ChaloUserBookingType), (r1v32 app.chalo.home.domain.ChaloUserBookingType) binds: [B:93:0x0254, B:30:0x011c] A[DONT_GENERATE, DONT_INLINE]
      0x0258: PHI (r2v16 java.lang.String) = (r2v14 java.lang.String), (r2v19 java.lang.String) binds: [B:93:0x0254, B:30:0x011c] A[DONT_GENERATE, DONT_INLINE]
      0x0258: PHI (r3v19 java.lang.Object) = (r3v17 java.lang.Object), (r3v1 java.lang.Object) binds: [B:93:0x0254, B:30:0x011c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:98:0x0273  */
    public final Object l1(ProductActivationFailureReason productActivationFailureReason, ChaloUserBookingType chaloUserBookingType, ContinuationImpl continuationImpl) {
        MyTicketsComponent$handleProductActivationFailure$1 myTicketsComponent$handleProductActivationFailure$1;
        TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet ticketsPageInfoBottomSheet;
        int i;
        ChaloUserBookingType chaloUserBookingType2;
        int i2;
        ChaloUserBookingType chaloUserBookingType3;
        int i3;
        ChaloUserBookingType chaloUserBookingType4;
        ChaloUserBookingType chaloUserBookingType5;
        int i4;
        Object obj;
        ChaloUserBookingType chaloUserBookingType6;
        int i5;
        Object obj2;
        ChaloUserBookingType chaloUserBookingType7;
        String str;
        String str2;
        Object objB;
        ChaloUserBookingType chaloUserBookingType8;
        String str3;
        TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet ticketsPageInfoBottomSheet2;
        String str4;
        String str5;
        Object objB2;
        ChaloUserBookingType chaloUserBookingType9;
        String str6;
        String str7;
        ChaloUserBookingType chaloUserBookingType10;
        String str8;
        String str9;
        String str10;
        Object objB3;
        String str11;
        String str12;
        Object objB4;
        ChaloUserBookingType chaloUserBookingType11;
        String str13;
        String str14;
        Object objB5;
        String str15;
        String str16;
        Object objB6;
        ChaloUserBookingType chaloUserBookingType12;
        String str17;
        String str18;
        ChaloUserBookingType chaloUserBookingType13;
        String str19;
        if (continuationImpl instanceof MyTicketsComponent$handleProductActivationFailure$1) {
            myTicketsComponent$handleProductActivationFailure$1 = (MyTicketsComponent$handleProductActivationFailure$1) continuationImpl;
            int i6 = myTicketsComponent$handleProductActivationFailure$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                myTicketsComponent$handleProductActivationFailure$1.label = i6 - Integer.MIN_VALUE;
            } else {
                myTicketsComponent$handleProductActivationFailure$1 = new MyTicketsComponent$handleProductActivationFailure$1(this, continuationImpl);
            }
        } else {
            myTicketsComponent$handleProductActivationFailure$1 = new MyTicketsComponent$handleProductActivationFailure$1(this, continuationImpl);
        }
        Object objB7 = myTicketsComponent$handleProductActivationFailure$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = myTicketsComponent$handleProductActivationFailure$1.label;
        String str20 = "";
        Unit unit = Unit.f17538a;
        StringProvider stringProvider = this.r;
        switch (i7) {
            case 0:
                ResultKt.b(objB7);
                ProductActivationFailureReason.HailingNotSupportedByProduct hailingNotSupportedByProduct = ProductActivationFailureReason.HailingNotSupportedByProduct.f3069a;
                boolean zD = Intrinsics.d(productActivationFailureReason, hailingNotSupportedByProduct);
                ticketsPageInfoBottomSheet = null;
                ProductActivationFailureReason.SingleJourneyTktProductConfigurationNotFound singleJourneyTktProductConfigurationNotFound = ProductActivationFailureReason.SingleJourneyTktProductConfigurationNotFound.f3075a;
                ProductActivationFailureReason.SingleJourneyTktNotFoundInRepository singleJourneyTktNotFoundInRepository = ProductActivationFailureReason.SingleJourneyTktNotFoundInRepository.f3074a;
                ProductActivationFailureReason.PassActivationPrerequisiteTimeChecksFailed passActivationPrerequisiteTimeChecksFailed = ProductActivationFailureReason.PassActivationPrerequisiteTimeChecksFailed.f3072a;
                ProductActivationFailureReason.NoMoreRidesAvailableToday noMoreRidesAvailableToday = ProductActivationFailureReason.NoMoreRidesAvailableToday.f3071a;
                ProductActivationFailureReason.NoMoreRidesAvailable noMoreRidesAvailable = ProductActivationFailureReason.NoMoreRidesAvailable.f3070a;
                if (zD) {
                    if (!(chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.InstantTicketBooking) && !(chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.MobileTicketBooking) && !(chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.PremiumBusBooking) && !(chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.QuickPayBooking) && !(chaloUserBookingType instanceof ChaloUserBookingType.SuperPassBooking.SuperPassApplicationBooking) && !(chaloUserBookingType instanceof ChaloUserBookingType.SuperPassBooking.PendingSuperPassBooking) && !(chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.OndcTicketBooking) && !(chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.OndcMetroTicketBooking) && !(chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.MetroTicketBooking) && !(chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.MultiModalGroupTicketBooking) && !(chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.PassRideBooking) && !(chaloUserBookingType instanceof ChaloUserBookingType.CardBooking.CardRechargeBooking) && !(chaloUserBookingType instanceof ChaloUserBookingType.CardBooking.CardTransactionReceiptBooking)) {
                        boolean z = chaloUserBookingType instanceof ChaloUserBookingType.SuperPassBooking.MagicSuperPassBooking;
                        ChaloNavigationManager chaloNavigationManager = this.Q;
                        if (z) {
                            SuperPassProperties superPassProperties = ((ChaloUserBookingType.SuperPassBooking.MagicSuperPassBooking) chaloUserBookingType).d.f9560a;
                            String str21 = superPassProperties.f9566a;
                            String str22 = superPassProperties.b;
                            SuperPassSubType.Companion companion = SuperPassSubType.INSTANCE;
                            SuperPassSubType superPassSubType = superPassProperties.c;
                            companion.getClass();
                            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new ProductActivationArgs(str21, str22, SuperPassSubType.Companion.b(superPassSubType), Source.MY_TICKETS_SCREEN_TAB, null, null, null, 944), null, null, 6));
                            return unit;
                        }
                        if (!(chaloUserBookingType instanceof ChaloUserBookingType.SuperPassBooking.RideBasedSuperPassBooking)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        SuperPassProperties superPassProperties2 = ((ChaloUserBookingType.SuperPassBooking.RideBasedSuperPassBooking) chaloUserBookingType).d.f9560a;
                        String str23 = superPassProperties2.f9566a;
                        String str24 = superPassProperties2.b;
                        SuperPassSubType.Companion companion2 = SuperPassSubType.INSTANCE;
                        SuperPassSubType superPassSubType2 = superPassProperties2.c;
                        companion2.getClass();
                        chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new ProductActivationArgs(str23, str24, SuperPassSubType.Companion.b(superPassSubType2), Source.MY_TICKETS_SCREEN_TAB, null, null, null, 944), null, null, 6));
                        return unit;
                    }
                } else if (!Intrinsics.d(productActivationFailureReason, noMoreRidesAvailable) && !Intrinsics.d(productActivationFailureReason, noMoreRidesAvailableToday) && !Intrinsics.d(productActivationFailureReason, passActivationPrerequisiteTimeChecksFailed) && !(productActivationFailureReason instanceof ProductActivationFailureReason.ProductInAppReclaim) && !Intrinsics.d(productActivationFailureReason, singleJourneyTktNotFoundInRepository) && !Intrinsics.d(productActivationFailureReason, singleJourneyTktProductConfigurationNotFound)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (Intrinsics.d(productActivationFailureReason, noMoreRidesAvailable)) {
                    i5 = 0;
                    myTicketsComponent$handleProductActivationFailure$1.L$0 = chaloUserBookingType;
                    myTicketsComponent$handleProductActivationFailure$1.label = 1;
                    Object objB8 = stringProvider.b(StringEnum.NO_MORE_RIDES_AVAILABLE_TITLE, new Object[0], myTicketsComponent$handleProductActivationFailure$1);
                    if (objB8 != coroutineSingletons) {
                        obj2 = objB8;
                        chaloUserBookingType7 = chaloUserBookingType;
                        str = (String) obj2;
                        myTicketsComponent$handleProductActivationFailure$1.L$0 = chaloUserBookingType7;
                        myTicketsComponent$handleProductActivationFailure$1.L$1 = str;
                        myTicketsComponent$handleProductActivationFailure$1.label = 2;
                        objB7 = stringProvider.b(StringEnum.NO_MORE_RIDES_AVAILABLE_MSG, new Object[i5], myTicketsComponent$handleProductActivationFailure$1);
                        if (objB7 != coroutineSingletons) {
                            str2 = (String) objB7;
                            s1(str, str2, chaloUserBookingType7);
                            myTicketsComponent$handleProductActivationFailure$1.L$0 = chaloUserBookingType7;
                            myTicketsComponent$handleProductActivationFailure$1.L$1 = str;
                            myTicketsComponent$handleProductActivationFailure$1.L$2 = str2;
                            myTicketsComponent$handleProductActivationFailure$1.label = 3;
                            objB = stringProvider.b(StringEnum.OKAY, new Object[0], myTicketsComponent$handleProductActivationFailure$1);
                            if (objB != coroutineSingletons) {
                                chaloUserBookingType8 = chaloUserBookingType7;
                                str3 = str2;
                                objB7 = objB;
                                ticketsPageInfoBottomSheet2 = new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str, str3, (String) objB7, null), null, null, chaloUserBookingType8, TicketsPageInfoBottomSheetPositiveCtaType.NO_MORE_RIDES_AVAILABLE, null, 38);
                                ticketsPageInfoBottomSheet = ticketsPageInfoBottomSheet2;
                                if (ticketsPageInfoBottomSheet != null) {
                                    E0(new tk0(ticketsPageInfoBottomSheet, 0));
                                    this.n.d(false);
                                }
                                return unit;
                            }
                        }
                    }
                } else if (Intrinsics.d(productActivationFailureReason, noMoreRidesAvailableToday)) {
                    i4 = 0;
                    myTicketsComponent$handleProductActivationFailure$1.L$0 = chaloUserBookingType;
                    myTicketsComponent$handleProductActivationFailure$1.label = 4;
                    Object objB9 = stringProvider.b(StringEnum.NO_MORE_RIDES_AVAILABLE_TODAY_TITLE, new Object[0], myTicketsComponent$handleProductActivationFailure$1);
                    if (objB9 != coroutineSingletons) {
                        obj = objB9;
                        chaloUserBookingType6 = chaloUserBookingType;
                        str4 = (String) obj;
                        myTicketsComponent$handleProductActivationFailure$1.L$0 = chaloUserBookingType6;
                        myTicketsComponent$handleProductActivationFailure$1.L$1 = str4;
                        myTicketsComponent$handleProductActivationFailure$1.label = 5;
                        objB7 = stringProvider.b(StringEnum.NO_MORE_RIDES_AVAILABLE_TODAY_MSG, new Object[i4], myTicketsComponent$handleProductActivationFailure$1);
                        if (objB7 != coroutineSingletons) {
                            str5 = (String) objB7;
                            s1(str4, str5, chaloUserBookingType6);
                            myTicketsComponent$handleProductActivationFailure$1.L$0 = chaloUserBookingType6;
                            myTicketsComponent$handleProductActivationFailure$1.L$1 = str4;
                            myTicketsComponent$handleProductActivationFailure$1.L$2 = str5;
                            myTicketsComponent$handleProductActivationFailure$1.label = 6;
                            objB2 = stringProvider.b(StringEnum.OKAY, new Object[0], myTicketsComponent$handleProductActivationFailure$1);
                            if (objB2 != coroutineSingletons) {
                                chaloUserBookingType9 = chaloUserBookingType6;
                                str6 = str5;
                                objB7 = objB2;
                                ticketsPageInfoBottomSheet2 = new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str4, str6, (String) objB7, null), null, null, chaloUserBookingType9, TicketsPageInfoBottomSheetPositiveCtaType.NO_MORE_RIDES_AVAILABLE_TODAY, null, 38);
                                ticketsPageInfoBottomSheet = ticketsPageInfoBottomSheet2;
                                if (ticketsPageInfoBottomSheet != null) {
                                    E0(new tk0(ticketsPageInfoBottomSheet, 0));
                                    this.n.d(false);
                                }
                                return unit;
                            }
                        }
                    }
                } else if (productActivationFailureReason instanceof ProductActivationFailureReason.ProductInAppReclaim) {
                    StringEnum stringEnum = StringEnum.PRODUCT_IN_APP_RECLAIM_MSG;
                    Object[] objArr = {this.o.j(((ProductActivationFailureReason.ProductInAppReclaim) productActivationFailureReason).f3073a)};
                    myTicketsComponent$handleProductActivationFailure$1.L$0 = chaloUserBookingType;
                    myTicketsComponent$handleProductActivationFailure$1.L$1 = "";
                    myTicketsComponent$handleProductActivationFailure$1.label = 7;
                    objB7 = stringProvider.b(stringEnum, objArr, myTicketsComponent$handleProductActivationFailure$1);
                    if (objB7 != coroutineSingletons) {
                        chaloUserBookingType5 = chaloUserBookingType;
                        str7 = (String) objB7;
                        s1(str20, str7, chaloUserBookingType5);
                        myTicketsComponent$handleProductActivationFailure$1.L$0 = chaloUserBookingType5;
                        myTicketsComponent$handleProductActivationFailure$1.L$1 = str20;
                        myTicketsComponent$handleProductActivationFailure$1.L$2 = str7;
                        myTicketsComponent$handleProductActivationFailure$1.label = 8;
                        objB7 = stringProvider.b(StringEnum.OKAY, new Object[0], myTicketsComponent$handleProductActivationFailure$1);
                        if (objB7 != coroutineSingletons) {
                            chaloUserBookingType10 = chaloUserBookingType5;
                            str8 = str7;
                            str9 = str20;
                            ticketsPageInfoBottomSheet2 = new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.APP_RECLAIM, str9, str8, (String) objB7, null), null, null, chaloUserBookingType10, TicketsPageInfoBottomSheetPositiveCtaType.PRODUCT_IN_APP_RECLAIM, null, 38);
                            ticketsPageInfoBottomSheet = ticketsPageInfoBottomSheet2;
                            if (ticketsPageInfoBottomSheet != null) {
                                E0(new tk0(ticketsPageInfoBottomSheet, 0));
                                this.n.d(false);
                            }
                            return unit;
                        }
                    }
                } else if (Intrinsics.d(productActivationFailureReason, singleJourneyTktNotFoundInRepository)) {
                    i3 = 0;
                    myTicketsComponent$handleProductActivationFailure$1.L$0 = chaloUserBookingType;
                    myTicketsComponent$handleProductActivationFailure$1.label = 9;
                    objB7 = stringProvider.b(StringEnum.PRODUCT_CONFIG_FETCH_FAILED_TITLE, new Object[0], myTicketsComponent$handleProductActivationFailure$1);
                    if (objB7 != coroutineSingletons) {
                        chaloUserBookingType4 = chaloUserBookingType;
                        str10 = (String) objB7;
                        myTicketsComponent$handleProductActivationFailure$1.L$0 = chaloUserBookingType4;
                        myTicketsComponent$handleProductActivationFailure$1.L$1 = str10;
                        myTicketsComponent$handleProductActivationFailure$1.label = 10;
                        objB3 = stringProvider.b(StringEnum.PRODUCT_CONFIG_FETCH_FAILED_MSG, new Object[i3], myTicketsComponent$handleProductActivationFailure$1);
                        if (objB3 != coroutineSingletons) {
                            objB7 = objB3;
                            str11 = str10;
                            str12 = (String) objB7;
                            s1(str11, str12, chaloUserBookingType4);
                            myTicketsComponent$handleProductActivationFailure$1.L$0 = chaloUserBookingType4;
                            myTicketsComponent$handleProductActivationFailure$1.L$1 = str11;
                            myTicketsComponent$handleProductActivationFailure$1.L$2 = str12;
                            myTicketsComponent$handleProductActivationFailure$1.label = 11;
                            objB4 = stringProvider.b(StringEnum.OKAY, new Object[0], myTicketsComponent$handleProductActivationFailure$1);
                            if (objB4 != coroutineSingletons) {
                                chaloUserBookingType11 = chaloUserBookingType4;
                                str13 = str12;
                                objB7 = objB4;
                                ticketsPageInfoBottomSheet2 = new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str11, str13, (String) objB7, null), null, null, chaloUserBookingType11, TicketsPageInfoBottomSheetPositiveCtaType.TICKET_NOT_FOUND, null, 38);
                                ticketsPageInfoBottomSheet = ticketsPageInfoBottomSheet2;
                                if (ticketsPageInfoBottomSheet != null) {
                                    E0(new tk0(ticketsPageInfoBottomSheet, 0));
                                    this.n.d(false);
                                }
                                return unit;
                            }
                        }
                    }
                } else {
                    if (!Intrinsics.d(productActivationFailureReason, singleJourneyTktProductConfigurationNotFound)) {
                        if (Intrinsics.d(productActivationFailureReason, hailingNotSupportedByProduct)) {
                            i = 0;
                            myTicketsComponent$handleProductActivationFailure$1.L$0 = chaloUserBookingType;
                            myTicketsComponent$handleProductActivationFailure$1.label = 15;
                            objB7 = stringProvider.b(StringEnum.HAILING_NOT_SUPPORTED_TITLE, new Object[0], myTicketsComponent$handleProductActivationFailure$1);
                            if (objB7 != coroutineSingletons) {
                                chaloUserBookingType2 = chaloUserBookingType;
                                str18 = (String) objB7;
                                s1(str18, "", chaloUserBookingType2);
                                myTicketsComponent$handleProductActivationFailure$1.L$0 = chaloUserBookingType2;
                                myTicketsComponent$handleProductActivationFailure$1.L$1 = str18;
                                myTicketsComponent$handleProductActivationFailure$1.label = 16;
                                objB7 = stringProvider.b(StringEnum.OKAY, new Object[i], myTicketsComponent$handleProductActivationFailure$1);
                                if (objB7 != coroutineSingletons) {
                                    chaloUserBookingType13 = chaloUserBookingType2;
                                    str19 = str18;
                                    ticketsPageInfoBottomSheet = new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str19, "", (String) objB7, null), null, null, chaloUserBookingType13, TicketsPageInfoBottomSheetPositiveCtaType.HAILING_NOT_SUPPORTED, null, 38);
                                }
                            }
                        } else if (!Intrinsics.d(productActivationFailureReason, passActivationPrerequisiteTimeChecksFailed)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (ticketsPageInfoBottomSheet != null) {
                            E0(new tk0(ticketsPageInfoBottomSheet, 0));
                            this.n.d(false);
                        }
                        return unit;
                    }
                    i2 = 0;
                    myTicketsComponent$handleProductActivationFailure$1.L$0 = chaloUserBookingType;
                    myTicketsComponent$handleProductActivationFailure$1.label = 12;
                    objB7 = stringProvider.b(StringEnum.PRODUCT_CONFIG_UNAVAILABLE_TITLE, new Object[0], myTicketsComponent$handleProductActivationFailure$1);
                    if (objB7 != coroutineSingletons) {
                        chaloUserBookingType3 = chaloUserBookingType;
                        str14 = (String) objB7;
                        myTicketsComponent$handleProductActivationFailure$1.L$0 = chaloUserBookingType3;
                        myTicketsComponent$handleProductActivationFailure$1.L$1 = str14;
                        myTicketsComponent$handleProductActivationFailure$1.label = 13;
                        objB5 = stringProvider.b(StringEnum.PRODUCT_NOT_AVAILABLE_FOR_PURCHASE_TRY_LATER, new Object[i2], myTicketsComponent$handleProductActivationFailure$1);
                        if (objB5 != coroutineSingletons) {
                            objB7 = objB5;
                            str15 = str14;
                            str16 = (String) objB7;
                            s1(str15, str16, chaloUserBookingType3);
                            myTicketsComponent$handleProductActivationFailure$1.L$0 = chaloUserBookingType3;
                            myTicketsComponent$handleProductActivationFailure$1.L$1 = str15;
                            myTicketsComponent$handleProductActivationFailure$1.L$2 = str16;
                            myTicketsComponent$handleProductActivationFailure$1.label = 14;
                            objB6 = stringProvider.b(StringEnum.OKAY, new Object[0], myTicketsComponent$handleProductActivationFailure$1);
                            if (objB6 != coroutineSingletons) {
                                chaloUserBookingType12 = chaloUserBookingType3;
                                str17 = str16;
                                objB7 = objB6;
                                ticketsPageInfoBottomSheet2 = new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str15, str17, (String) objB7, null), null, null, chaloUserBookingType12, TicketsPageInfoBottomSheetPositiveCtaType.TICKET_CONFIG_UNAVAILABLE, null, 38);
                                ticketsPageInfoBottomSheet = ticketsPageInfoBottomSheet2;
                                if (ticketsPageInfoBottomSheet != null) {
                                    E0(new tk0(ticketsPageInfoBottomSheet, 0));
                                    this.n.d(false);
                                }
                                return unit;
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                chaloUserBookingType7 = (ChaloUserBookingType) myTicketsComponent$handleProductActivationFailure$1.L$0;
                ResultKt.b(objB7);
                obj2 = objB7;
                i5 = 0;
                str = (String) obj2;
                myTicketsComponent$handleProductActivationFailure$1.L$0 = chaloUserBookingType7;
                myTicketsComponent$handleProductActivationFailure$1.L$1 = str;
                myTicketsComponent$handleProductActivationFailure$1.label = 2;
                objB7 = stringProvider.b(StringEnum.NO_MORE_RIDES_AVAILABLE_MSG, new Object[i5], myTicketsComponent$handleProductActivationFailure$1);
                if (objB7 != coroutineSingletons) {
                    str2 = (String) objB7;
                    s1(str, str2, chaloUserBookingType7);
                    myTicketsComponent$handleProductActivationFailure$1.L$0 = chaloUserBookingType7;
                    myTicketsComponent$handleProductActivationFailure$1.L$1 = str;
                    myTicketsComponent$handleProductActivationFailure$1.L$2 = str2;
                    myTicketsComponent$handleProductActivationFailure$1.label = 3;
                    objB = stringProvider.b(StringEnum.OKAY, new Object[0], myTicketsComponent$handleProductActivationFailure$1);
                    if (objB != coroutineSingletons) {
                        chaloUserBookingType8 = chaloUserBookingType7;
                        str3 = str2;
                        objB7 = objB;
                        ticketsPageInfoBottomSheet2 = new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str, str3, (String) objB7, null), null, null, chaloUserBookingType8, TicketsPageInfoBottomSheetPositiveCtaType.NO_MORE_RIDES_AVAILABLE, null, 38);
                        ticketsPageInfoBottomSheet = ticketsPageInfoBottomSheet2;
                        if (ticketsPageInfoBottomSheet != null) {
                            E0(new tk0(ticketsPageInfoBottomSheet, 0));
                            this.n.d(false);
                        }
                        return unit;
                    }
                }
                return coroutineSingletons;
            case 2:
                String str25 = (String) myTicketsComponent$handleProductActivationFailure$1.L$1;
                ChaloUserBookingType chaloUserBookingType14 = (ChaloUserBookingType) myTicketsComponent$handleProductActivationFailure$1.L$0;
                ResultKt.b(objB7);
                str = str25;
                chaloUserBookingType7 = chaloUserBookingType14;
                str2 = (String) objB7;
                s1(str, str2, chaloUserBookingType7);
                myTicketsComponent$handleProductActivationFailure$1.L$0 = chaloUserBookingType7;
                myTicketsComponent$handleProductActivationFailure$1.L$1 = str;
                myTicketsComponent$handleProductActivationFailure$1.L$2 = str2;
                myTicketsComponent$handleProductActivationFailure$1.label = 3;
                objB = stringProvider.b(StringEnum.OKAY, new Object[0], myTicketsComponent$handleProductActivationFailure$1);
                if (objB != coroutineSingletons) {
                    chaloUserBookingType8 = chaloUserBookingType7;
                    str3 = str2;
                    objB7 = objB;
                    ticketsPageInfoBottomSheet2 = new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str, str3, (String) objB7, null), null, null, chaloUserBookingType8, TicketsPageInfoBottomSheetPositiveCtaType.NO_MORE_RIDES_AVAILABLE, null, 38);
                    ticketsPageInfoBottomSheet = ticketsPageInfoBottomSheet2;
                    if (ticketsPageInfoBottomSheet != null) {
                        E0(new tk0(ticketsPageInfoBottomSheet, 0));
                        this.n.d(false);
                    }
                    return unit;
                }
                return coroutineSingletons;
            case 3:
                String str26 = (String) myTicketsComponent$handleProductActivationFailure$1.L$2;
                str = (String) myTicketsComponent$handleProductActivationFailure$1.L$1;
                ChaloUserBookingType chaloUserBookingType15 = (ChaloUserBookingType) myTicketsComponent$handleProductActivationFailure$1.L$0;
                ResultKt.b(objB7);
                str3 = str26;
                chaloUserBookingType8 = chaloUserBookingType15;
                ticketsPageInfoBottomSheet2 = new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str, str3, (String) objB7, null), null, null, chaloUserBookingType8, TicketsPageInfoBottomSheetPositiveCtaType.NO_MORE_RIDES_AVAILABLE, null, 38);
                ticketsPageInfoBottomSheet = ticketsPageInfoBottomSheet2;
                if (ticketsPageInfoBottomSheet != null) {
                    E0(new tk0(ticketsPageInfoBottomSheet, 0));
                    this.n.d(false);
                }
                return unit;
            case 4:
                chaloUserBookingType6 = (ChaloUserBookingType) myTicketsComponent$handleProductActivationFailure$1.L$0;
                ResultKt.b(objB7);
                obj = objB7;
                i4 = 0;
                str4 = (String) obj;
                myTicketsComponent$handleProductActivationFailure$1.L$0 = chaloUserBookingType6;
                myTicketsComponent$handleProductActivationFailure$1.L$1 = str4;
                myTicketsComponent$handleProductActivationFailure$1.label = 5;
                objB7 = stringProvider.b(StringEnum.NO_MORE_RIDES_AVAILABLE_TODAY_MSG, new Object[i4], myTicketsComponent$handleProductActivationFailure$1);
                if (objB7 != coroutineSingletons) {
                    str5 = (String) objB7;
                    s1(str4, str5, chaloUserBookingType6);
                    myTicketsComponent$handleProductActivationFailure$1.L$0 = chaloUserBookingType6;
                    myTicketsComponent$handleProductActivationFailure$1.L$1 = str4;
                    myTicketsComponent$handleProductActivationFailure$1.L$2 = str5;
                    myTicketsComponent$handleProductActivationFailure$1.label = 6;
                    objB2 = stringProvider.b(StringEnum.OKAY, new Object[0], myTicketsComponent$handleProductActivationFailure$1);
                    if (objB2 != coroutineSingletons) {
                        chaloUserBookingType9 = chaloUserBookingType6;
                        str6 = str5;
                        objB7 = objB2;
                        ticketsPageInfoBottomSheet2 = new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str4, str6, (String) objB7, null), null, null, chaloUserBookingType9, TicketsPageInfoBottomSheetPositiveCtaType.NO_MORE_RIDES_AVAILABLE_TODAY, null, 38);
                        ticketsPageInfoBottomSheet = ticketsPageInfoBottomSheet2;
                        if (ticketsPageInfoBottomSheet != null) {
                            E0(new tk0(ticketsPageInfoBottomSheet, 0));
                            this.n.d(false);
                        }
                        return unit;
                    }
                }
                return coroutineSingletons;
            case 5:
                String str27 = (String) myTicketsComponent$handleProductActivationFailure$1.L$1;
                ChaloUserBookingType chaloUserBookingType16 = (ChaloUserBookingType) myTicketsComponent$handleProductActivationFailure$1.L$0;
                ResultKt.b(objB7);
                str4 = str27;
                chaloUserBookingType6 = chaloUserBookingType16;
                str5 = (String) objB7;
                s1(str4, str5, chaloUserBookingType6);
                myTicketsComponent$handleProductActivationFailure$1.L$0 = chaloUserBookingType6;
                myTicketsComponent$handleProductActivationFailure$1.L$1 = str4;
                myTicketsComponent$handleProductActivationFailure$1.L$2 = str5;
                myTicketsComponent$handleProductActivationFailure$1.label = 6;
                objB2 = stringProvider.b(StringEnum.OKAY, new Object[0], myTicketsComponent$handleProductActivationFailure$1);
                if (objB2 != coroutineSingletons) {
                    chaloUserBookingType9 = chaloUserBookingType6;
                    str6 = str5;
                    objB7 = objB2;
                    ticketsPageInfoBottomSheet2 = new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str4, str6, (String) objB7, null), null, null, chaloUserBookingType9, TicketsPageInfoBottomSheetPositiveCtaType.NO_MORE_RIDES_AVAILABLE_TODAY, null, 38);
                    ticketsPageInfoBottomSheet = ticketsPageInfoBottomSheet2;
                    if (ticketsPageInfoBottomSheet != null) {
                        E0(new tk0(ticketsPageInfoBottomSheet, 0));
                        this.n.d(false);
                    }
                    return unit;
                }
                return coroutineSingletons;
            case 6:
                String str28 = (String) myTicketsComponent$handleProductActivationFailure$1.L$2;
                str4 = (String) myTicketsComponent$handleProductActivationFailure$1.L$1;
                ChaloUserBookingType chaloUserBookingType17 = (ChaloUserBookingType) myTicketsComponent$handleProductActivationFailure$1.L$0;
                ResultKt.b(objB7);
                str6 = str28;
                chaloUserBookingType9 = chaloUserBookingType17;
                ticketsPageInfoBottomSheet2 = new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str4, str6, (String) objB7, null), null, null, chaloUserBookingType9, TicketsPageInfoBottomSheetPositiveCtaType.NO_MORE_RIDES_AVAILABLE_TODAY, null, 38);
                ticketsPageInfoBottomSheet = ticketsPageInfoBottomSheet2;
                if (ticketsPageInfoBottomSheet != null) {
                    E0(new tk0(ticketsPageInfoBottomSheet, 0));
                    this.n.d(false);
                }
                return unit;
            case 7:
                str20 = (String) myTicketsComponent$handleProductActivationFailure$1.L$1;
                chaloUserBookingType5 = (ChaloUserBookingType) myTicketsComponent$handleProductActivationFailure$1.L$0;
                ResultKt.b(objB7);
                str7 = (String) objB7;
                s1(str20, str7, chaloUserBookingType5);
                myTicketsComponent$handleProductActivationFailure$1.L$0 = chaloUserBookingType5;
                myTicketsComponent$handleProductActivationFailure$1.L$1 = str20;
                myTicketsComponent$handleProductActivationFailure$1.L$2 = str7;
                myTicketsComponent$handleProductActivationFailure$1.label = 8;
                objB7 = stringProvider.b(StringEnum.OKAY, new Object[0], myTicketsComponent$handleProductActivationFailure$1);
                if (objB7 != coroutineSingletons) {
                    chaloUserBookingType10 = chaloUserBookingType5;
                    str8 = str7;
                    str9 = str20;
                    ticketsPageInfoBottomSheet2 = new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.APP_RECLAIM, str9, str8, (String) objB7, null), null, null, chaloUserBookingType10, TicketsPageInfoBottomSheetPositiveCtaType.PRODUCT_IN_APP_RECLAIM, null, 38);
                    ticketsPageInfoBottomSheet = ticketsPageInfoBottomSheet2;
                    if (ticketsPageInfoBottomSheet != null) {
                        E0(new tk0(ticketsPageInfoBottomSheet, 0));
                        this.n.d(false);
                    }
                    return unit;
                }
                return coroutineSingletons;
            case 8:
                String str29 = (String) myTicketsComponent$handleProductActivationFailure$1.L$2;
                String str30 = (String) myTicketsComponent$handleProductActivationFailure$1.L$1;
                ChaloUserBookingType chaloUserBookingType18 = (ChaloUserBookingType) myTicketsComponent$handleProductActivationFailure$1.L$0;
                ResultKt.b(objB7);
                str8 = str29;
                str9 = str30;
                chaloUserBookingType10 = chaloUserBookingType18;
                ticketsPageInfoBottomSheet2 = new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.APP_RECLAIM, str9, str8, (String) objB7, null), null, null, chaloUserBookingType10, TicketsPageInfoBottomSheetPositiveCtaType.PRODUCT_IN_APP_RECLAIM, null, 38);
                ticketsPageInfoBottomSheet = ticketsPageInfoBottomSheet2;
                if (ticketsPageInfoBottomSheet != null) {
                    E0(new tk0(ticketsPageInfoBottomSheet, 0));
                    this.n.d(false);
                }
                return unit;
            case 9:
                chaloUserBookingType4 = (ChaloUserBookingType) myTicketsComponent$handleProductActivationFailure$1.L$0;
                ResultKt.b(objB7);
                i3 = 0;
                str10 = (String) objB7;
                myTicketsComponent$handleProductActivationFailure$1.L$0 = chaloUserBookingType4;
                myTicketsComponent$handleProductActivationFailure$1.L$1 = str10;
                myTicketsComponent$handleProductActivationFailure$1.label = 10;
                objB3 = stringProvider.b(StringEnum.PRODUCT_CONFIG_FETCH_FAILED_MSG, new Object[i3], myTicketsComponent$handleProductActivationFailure$1);
                if (objB3 != coroutineSingletons) {
                    objB7 = objB3;
                    str11 = str10;
                    str12 = (String) objB7;
                    s1(str11, str12, chaloUserBookingType4);
                    myTicketsComponent$handleProductActivationFailure$1.L$0 = chaloUserBookingType4;
                    myTicketsComponent$handleProductActivationFailure$1.L$1 = str11;
                    myTicketsComponent$handleProductActivationFailure$1.L$2 = str12;
                    myTicketsComponent$handleProductActivationFailure$1.label = 11;
                    objB4 = stringProvider.b(StringEnum.OKAY, new Object[0], myTicketsComponent$handleProductActivationFailure$1);
                    if (objB4 != coroutineSingletons) {
                        chaloUserBookingType11 = chaloUserBookingType4;
                        str13 = str12;
                        objB7 = objB4;
                        ticketsPageInfoBottomSheet2 = new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str11, str13, (String) objB7, null), null, null, chaloUserBookingType11, TicketsPageInfoBottomSheetPositiveCtaType.TICKET_NOT_FOUND, null, 38);
                        ticketsPageInfoBottomSheet = ticketsPageInfoBottomSheet2;
                        if (ticketsPageInfoBottomSheet != null) {
                            E0(new tk0(ticketsPageInfoBottomSheet, 0));
                            this.n.d(false);
                        }
                        return unit;
                    }
                }
                return coroutineSingletons;
            case 10:
                String str31 = (String) myTicketsComponent$handleProductActivationFailure$1.L$1;
                ChaloUserBookingType chaloUserBookingType19 = (ChaloUserBookingType) myTicketsComponent$handleProductActivationFailure$1.L$0;
                ResultKt.b(objB7);
                str11 = str31;
                chaloUserBookingType4 = chaloUserBookingType19;
                str12 = (String) objB7;
                s1(str11, str12, chaloUserBookingType4);
                myTicketsComponent$handleProductActivationFailure$1.L$0 = chaloUserBookingType4;
                myTicketsComponent$handleProductActivationFailure$1.L$1 = str11;
                myTicketsComponent$handleProductActivationFailure$1.L$2 = str12;
                myTicketsComponent$handleProductActivationFailure$1.label = 11;
                objB4 = stringProvider.b(StringEnum.OKAY, new Object[0], myTicketsComponent$handleProductActivationFailure$1);
                if (objB4 != coroutineSingletons) {
                    chaloUserBookingType11 = chaloUserBookingType4;
                    str13 = str12;
                    objB7 = objB4;
                    ticketsPageInfoBottomSheet2 = new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str11, str13, (String) objB7, null), null, null, chaloUserBookingType11, TicketsPageInfoBottomSheetPositiveCtaType.TICKET_NOT_FOUND, null, 38);
                    ticketsPageInfoBottomSheet = ticketsPageInfoBottomSheet2;
                    if (ticketsPageInfoBottomSheet != null) {
                        E0(new tk0(ticketsPageInfoBottomSheet, 0));
                        this.n.d(false);
                    }
                    return unit;
                }
                return coroutineSingletons;
            case 11:
                String str32 = (String) myTicketsComponent$handleProductActivationFailure$1.L$2;
                str11 = (String) myTicketsComponent$handleProductActivationFailure$1.L$1;
                ChaloUserBookingType chaloUserBookingType20 = (ChaloUserBookingType) myTicketsComponent$handleProductActivationFailure$1.L$0;
                ResultKt.b(objB7);
                str13 = str32;
                chaloUserBookingType11 = chaloUserBookingType20;
                ticketsPageInfoBottomSheet2 = new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str11, str13, (String) objB7, null), null, null, chaloUserBookingType11, TicketsPageInfoBottomSheetPositiveCtaType.TICKET_NOT_FOUND, null, 38);
                ticketsPageInfoBottomSheet = ticketsPageInfoBottomSheet2;
                if (ticketsPageInfoBottomSheet != null) {
                    E0(new tk0(ticketsPageInfoBottomSheet, 0));
                    this.n.d(false);
                }
                return unit;
            case 12:
                chaloUserBookingType3 = (ChaloUserBookingType) myTicketsComponent$handleProductActivationFailure$1.L$0;
                ResultKt.b(objB7);
                i2 = 0;
                str14 = (String) objB7;
                myTicketsComponent$handleProductActivationFailure$1.L$0 = chaloUserBookingType3;
                myTicketsComponent$handleProductActivationFailure$1.L$1 = str14;
                myTicketsComponent$handleProductActivationFailure$1.label = 13;
                objB5 = stringProvider.b(StringEnum.PRODUCT_NOT_AVAILABLE_FOR_PURCHASE_TRY_LATER, new Object[i2], myTicketsComponent$handleProductActivationFailure$1);
                if (objB5 != coroutineSingletons) {
                    objB7 = objB5;
                    str15 = str14;
                    str16 = (String) objB7;
                    s1(str15, str16, chaloUserBookingType3);
                    myTicketsComponent$handleProductActivationFailure$1.L$0 = chaloUserBookingType3;
                    myTicketsComponent$handleProductActivationFailure$1.L$1 = str15;
                    myTicketsComponent$handleProductActivationFailure$1.L$2 = str16;
                    myTicketsComponent$handleProductActivationFailure$1.label = 14;
                    objB6 = stringProvider.b(StringEnum.OKAY, new Object[0], myTicketsComponent$handleProductActivationFailure$1);
                    if (objB6 != coroutineSingletons) {
                        chaloUserBookingType12 = chaloUserBookingType3;
                        str17 = str16;
                        objB7 = objB6;
                        ticketsPageInfoBottomSheet2 = new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str15, str17, (String) objB7, null), null, null, chaloUserBookingType12, TicketsPageInfoBottomSheetPositiveCtaType.TICKET_CONFIG_UNAVAILABLE, null, 38);
                        ticketsPageInfoBottomSheet = ticketsPageInfoBottomSheet2;
                        if (ticketsPageInfoBottomSheet != null) {
                            E0(new tk0(ticketsPageInfoBottomSheet, 0));
                            this.n.d(false);
                        }
                        return unit;
                    }
                }
                return coroutineSingletons;
            case 13:
                String str33 = (String) myTicketsComponent$handleProductActivationFailure$1.L$1;
                ChaloUserBookingType chaloUserBookingType21 = (ChaloUserBookingType) myTicketsComponent$handleProductActivationFailure$1.L$0;
                ResultKt.b(objB7);
                str15 = str33;
                chaloUserBookingType3 = chaloUserBookingType21;
                str16 = (String) objB7;
                s1(str15, str16, chaloUserBookingType3);
                myTicketsComponent$handleProductActivationFailure$1.L$0 = chaloUserBookingType3;
                myTicketsComponent$handleProductActivationFailure$1.L$1 = str15;
                myTicketsComponent$handleProductActivationFailure$1.L$2 = str16;
                myTicketsComponent$handleProductActivationFailure$1.label = 14;
                objB6 = stringProvider.b(StringEnum.OKAY, new Object[0], myTicketsComponent$handleProductActivationFailure$1);
                if (objB6 != coroutineSingletons) {
                    chaloUserBookingType12 = chaloUserBookingType3;
                    str17 = str16;
                    objB7 = objB6;
                    ticketsPageInfoBottomSheet2 = new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str15, str17, (String) objB7, null), null, null, chaloUserBookingType12, TicketsPageInfoBottomSheetPositiveCtaType.TICKET_CONFIG_UNAVAILABLE, null, 38);
                    ticketsPageInfoBottomSheet = ticketsPageInfoBottomSheet2;
                    if (ticketsPageInfoBottomSheet != null) {
                        E0(new tk0(ticketsPageInfoBottomSheet, 0));
                        this.n.d(false);
                    }
                    return unit;
                }
                return coroutineSingletons;
            case 14:
                String str34 = (String) myTicketsComponent$handleProductActivationFailure$1.L$2;
                str15 = (String) myTicketsComponent$handleProductActivationFailure$1.L$1;
                ChaloUserBookingType chaloUserBookingType22 = (ChaloUserBookingType) myTicketsComponent$handleProductActivationFailure$1.L$0;
                ResultKt.b(objB7);
                str17 = str34;
                chaloUserBookingType12 = chaloUserBookingType22;
                ticketsPageInfoBottomSheet2 = new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str15, str17, (String) objB7, null), null, null, chaloUserBookingType12, TicketsPageInfoBottomSheetPositiveCtaType.TICKET_CONFIG_UNAVAILABLE, null, 38);
                ticketsPageInfoBottomSheet = ticketsPageInfoBottomSheet2;
                if (ticketsPageInfoBottomSheet != null) {
                    E0(new tk0(ticketsPageInfoBottomSheet, 0));
                    this.n.d(false);
                }
                return unit;
            case 15:
                chaloUserBookingType2 = (ChaloUserBookingType) myTicketsComponent$handleProductActivationFailure$1.L$0;
                ResultKt.b(objB7);
                i = 0;
                str18 = (String) objB7;
                s1(str18, "", chaloUserBookingType2);
                myTicketsComponent$handleProductActivationFailure$1.L$0 = chaloUserBookingType2;
                myTicketsComponent$handleProductActivationFailure$1.L$1 = str18;
                myTicketsComponent$handleProductActivationFailure$1.label = 16;
                objB7 = stringProvider.b(StringEnum.OKAY, new Object[i], myTicketsComponent$handleProductActivationFailure$1);
                if (objB7 != coroutineSingletons) {
                    chaloUserBookingType13 = chaloUserBookingType2;
                    str19 = str18;
                    ticketsPageInfoBottomSheet = new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str19, "", (String) objB7, null), null, null, chaloUserBookingType13, TicketsPageInfoBottomSheetPositiveCtaType.HAILING_NOT_SUPPORTED, null, 38);
                    if (ticketsPageInfoBottomSheet != null) {
                        E0(new tk0(ticketsPageInfoBottomSheet, 0));
                        this.n.d(false);
                    }
                    return unit;
                }
                return coroutineSingletons;
            case 16:
                String str35 = (String) myTicketsComponent$handleProductActivationFailure$1.L$1;
                ChaloUserBookingType chaloUserBookingType23 = (ChaloUserBookingType) myTicketsComponent$handleProductActivationFailure$1.L$0;
                ResultKt.b(objB7);
                str19 = str35;
                chaloUserBookingType13 = chaloUserBookingType23;
                ticketsPageInfoBottomSheet = new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, str19, "", (String) objB7, null), null, null, chaloUserBookingType13, TicketsPageInfoBottomSheetPositiveCtaType.HAILING_NOT_SUPPORTED, null, 38);
                if (ticketsPageInfoBottomSheet != null) {
                    E0(new tk0(ticketsPageInfoBottomSheet, 0));
                    this.n.d(false);
                }
                return unit;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0088 A[PHI: r1 r2 r3
      0x0088: PHI (r1v13 app.chalo.home.domain.ChaloUserBookingType$SuperPassBooking) = 
      (r1v9 app.chalo.home.domain.ChaloUserBookingType$SuperPassBooking)
      (r1v17 app.chalo.home.domain.ChaloUserBookingType$SuperPassBooking)
     binds: [B:44:0x0178, B:18:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x0088: PHI (r2v13 app.chalo.superpass.data.models.entities.SuperPass) = (r2v10 app.chalo.superpass.data.models.entities.SuperPass), (r2v16 app.chalo.superpass.data.models.entities.SuperPass) binds: [B:44:0x0178, B:18:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x0088: PHI (r3v21 java.lang.Object) = (r3v20 java.lang.Object), (r3v1 java.lang.Object) binds: [B:44:0x0178, B:18:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x015f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0169  */
    /* JADX WARN: Code duplicated, block: B:49:0x0193 A[PHI: r1 r2 r3 r6
      0x0193: PHI (r1v18 java.lang.String) = (r1v15 java.lang.String), (r1v20 java.lang.String) binds: [B:47:0x0190, B:17:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x0193: PHI (r2v17 app.chalo.home.domain.ChaloUserBookingType$SuperPassBooking) = 
      (r2v14 app.chalo.home.domain.ChaloUserBookingType$SuperPassBooking)
      (r2v20 app.chalo.home.domain.ChaloUserBookingType$SuperPassBooking)
     binds: [B:47:0x0190, B:17:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x0193: PHI (r3v24 java.lang.Object) = (r3v23 java.lang.Object), (r3v1 java.lang.Object) binds: [B:47:0x0190, B:17:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x0193: PHI (r6v9 app.chalo.superpass.data.models.entities.SuperPass) = (r6v8 app.chalo.superpass.data.models.entities.SuperPass), (r6v14 app.chalo.superpass.data.models.entities.SuperPass) binds: [B:47:0x0190, B:17:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:56:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:59:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:62:0x01f3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object m1(SuperPass superPass, boolean z, ChaloUserBookingType.SuperPassBooking superPassBooking, ContinuationImpl continuationImpl) {
        MyTicketsComponent$handleRenewPassClicked$1 myTicketsComponent$handleRenewPassClicked$1;
        SuperPassRepurchaseProperties superPassRepurchaseProperties;
        SuperPass superPass2;
        int i;
        ChaloUserBookingType.SuperPassBooking superPassBooking2;
        SuperPass superPass3;
        SuperPass superPass4;
        ChaloUserBookingType.SuperPassBooking superPassBooking3;
        String str;
        String str2;
        Object objB;
        ChaloUserBookingType.SuperPassBooking superPassBooking4;
        String str3;
        String str4;
        Object objB2;
        String str5;
        String str6;
        ChaloUserBookingType.SuperPassBooking superPassBooking5;
        ChaloUserBookingType.SuperPassBooking superPassBooking6 = superPassBooking;
        if (continuationImpl instanceof MyTicketsComponent$handleRenewPassClicked$1) {
            myTicketsComponent$handleRenewPassClicked$1 = (MyTicketsComponent$handleRenewPassClicked$1) continuationImpl;
            int i2 = myTicketsComponent$handleRenewPassClicked$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                myTicketsComponent$handleRenewPassClicked$1.label = i2 - Integer.MIN_VALUE;
            } else {
                myTicketsComponent$handleRenewPassClicked$1 = new MyTicketsComponent$handleRenewPassClicked$1(this, continuationImpl);
            }
        } else {
            myTicketsComponent$handleRenewPassClicked$1 = new MyTicketsComponent$handleRenewPassClicked$1(this, continuationImpl);
        }
        Object objA = myTicketsComponent$handleRenewPassClicked$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = myTicketsComponent$handleRenewPassClicked$1.label;
        StringProvider stringProvider = this.r;
        Unit unit = Unit.f17538a;
        switch (i3) {
            case 0:
                ResultKt.b(objA);
                E0(new lj0(23));
                LinkedHashMap linkedHashMapH1 = h1(superPass);
                superPassRepurchaseProperties = superPass.d;
                LinkedHashMap linkedHashMapU = MapsKt.u(linkedHashMapH1);
                linkedHashMapU.put("isRenewFromProductStatusCard", Boolean.valueOf(z));
                Source source = Source.MY_TICKETS_SCREEN_TAB;
                HomeScreenAnalyticsHelper homeScreenAnalyticsHelper = this.E;
                HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "renew btn clicked", linkedHashMapU, source, 12);
                if (!superPassRepurchaseProperties.f) {
                    HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "product selection activity launched", h1(superPass), source, 12);
                    E0(new lj0(26));
                    this.Q.b(new ChaloNavigationRequest.Navigate(new ProductSelectionArgs(null, superPassRepurchaseProperties.f9569a, null, source, true, null, 157), null, null, 6));
                    return unit;
                }
                if (superPassRepurchaseProperties.e) {
                    int i4 = superPass.getC().f9578a;
                    myTicketsComponent$handleRenewPassClicked$1.L$0 = superPass;
                    myTicketsComponent$handleRenewPassClicked$1.L$1 = superPassBooking6;
                    myTicketsComponent$handleRenewPassClicked$1.L$2 = superPassRepurchaseProperties;
                    myTicketsComponent$handleRenewPassClicked$1.I$0 = i4;
                    myTicketsComponent$handleRenewPassClicked$1.label = 2;
                    Object objC = this.k.c(myTicketsComponent$handleRenewPassClicked$1);
                    if (objC != obj) {
                        superPass2 = superPass;
                        i = i4;
                        objA = objC;
                        long jLongValue = ((Number) objA).longValue();
                        myTicketsComponent$handleRenewPassClicked$1.L$0 = superPass2;
                        myTicketsComponent$handleRenewPassClicked$1.L$1 = superPassBooking6;
                        myTicketsComponent$handleRenewPassClicked$1.L$2 = null;
                        myTicketsComponent$handleRenewPassClicked$1.label = 3;
                        objA = superPassRepurchaseProperties.a(i, jLongValue);
                        if (objA != obj) {
                            superPassBooking2 = superPassBooking6;
                            superPass3 = superPass2;
                            if (((Boolean) objA).booleanValue()) {
                                myTicketsComponent$handleRenewPassClicked$1.L$0 = superPass3;
                                myTicketsComponent$handleRenewPassClicked$1.L$1 = superPassBooking2;
                                myTicketsComponent$handleRenewPassClicked$1.label = 4;
                                objA = stringProvider.b(StringEnum.DOCUMENT_VALIDITY_EXPIRED_TITLE, new Object[0], myTicketsComponent$handleRenewPassClicked$1);
                                if (objA != obj) {
                                    superPass4 = superPass3;
                                    superPassBooking3 = superPassBooking2;
                                    str = (String) objA;
                                    myTicketsComponent$handleRenewPassClicked$1.L$0 = superPass4;
                                    myTicketsComponent$handleRenewPassClicked$1.L$1 = superPassBooking3;
                                    myTicketsComponent$handleRenewPassClicked$1.L$2 = str;
                                    myTicketsComponent$handleRenewPassClicked$1.label = 5;
                                    objA = stringProvider.b(StringEnum.DOCUMENT_VALIDITY_EXPIRED_MSG, new Object[0], myTicketsComponent$handleRenewPassClicked$1);
                                    if (objA != obj) {
                                        str2 = (String) objA;
                                        u1(str, str2, superPass4);
                                        myTicketsComponent$handleRenewPassClicked$1.L$0 = superPassBooking3;
                                        myTicketsComponent$handleRenewPassClicked$1.L$1 = str;
                                        myTicketsComponent$handleRenewPassClicked$1.L$2 = str2;
                                        myTicketsComponent$handleRenewPassClicked$1.label = 6;
                                        objB = stringProvider.b(StringEnum.BUY_NEW_PASS, new Object[0], myTicketsComponent$handleRenewPassClicked$1);
                                        if (objB != obj) {
                                            superPassBooking4 = superPassBooking3;
                                            str3 = str2;
                                            objA = objB;
                                            str4 = (String) objA;
                                            myTicketsComponent$handleRenewPassClicked$1.L$0 = superPassBooking4;
                                            myTicketsComponent$handleRenewPassClicked$1.L$1 = str;
                                            myTicketsComponent$handleRenewPassClicked$1.L$2 = str3;
                                            myTicketsComponent$handleRenewPassClicked$1.L$3 = str4;
                                            myTicketsComponent$handleRenewPassClicked$1.label = 7;
                                            objB2 = stringProvider.b(StringEnum.CANCEL, new Object[0], myTicketsComponent$handleRenewPassClicked$1);
                                            if (objB2 != obj) {
                                                str5 = str;
                                                str6 = str4;
                                                objA = objB2;
                                                superPassBooking5 = superPassBooking4;
                                                E0(new o3(str5, str3, str6, (String) objA, superPassBooking5, 5));
                                                this.n.d(false);
                                                return unit;
                                            }
                                        }
                                    }
                                }
                            } else {
                                myTicketsComponent$handleRenewPassClicked$1.L$0 = null;
                                myTicketsComponent$handleRenewPassClicked$1.L$1 = null;
                                myTicketsComponent$handleRenewPassClicked$1.label = 8;
                                if (d1(superPass3, superPassBooking2, myTicketsComponent$handleRenewPassClicked$1) != obj) {
                                    return unit;
                                }
                            }
                        }
                    }
                } else {
                    myTicketsComponent$handleRenewPassClicked$1.label = 1;
                    if (d1(superPass, superPassBooking6, myTicketsComponent$handleRenewPassClicked$1) != obj) {
                        return unit;
                    }
                }
                return obj;
            case 1:
                ResultKt.b(objA);
                return unit;
            case 2:
                i = myTicketsComponent$handleRenewPassClicked$1.I$0;
                SuperPassRepurchaseProperties superPassRepurchaseProperties2 = (SuperPassRepurchaseProperties) myTicketsComponent$handleRenewPassClicked$1.L$2;
                ChaloUserBookingType.SuperPassBooking superPassBooking7 = (ChaloUserBookingType.SuperPassBooking) myTicketsComponent$handleRenewPassClicked$1.L$1;
                superPass2 = (SuperPass) myTicketsComponent$handleRenewPassClicked$1.L$0;
                ResultKt.b(objA);
                superPassRepurchaseProperties = superPassRepurchaseProperties2;
                superPassBooking6 = superPassBooking7;
                long jLongValue2 = ((Number) objA).longValue();
                myTicketsComponent$handleRenewPassClicked$1.L$0 = superPass2;
                myTicketsComponent$handleRenewPassClicked$1.L$1 = superPassBooking6;
                myTicketsComponent$handleRenewPassClicked$1.L$2 = null;
                myTicketsComponent$handleRenewPassClicked$1.label = 3;
                objA = superPassRepurchaseProperties.a(i, jLongValue2);
                if (objA != obj) {
                    superPassBooking2 = superPassBooking6;
                    superPass3 = superPass2;
                    if (((Boolean) objA).booleanValue()) {
                        myTicketsComponent$handleRenewPassClicked$1.L$0 = superPass3;
                        myTicketsComponent$handleRenewPassClicked$1.L$1 = superPassBooking2;
                        myTicketsComponent$handleRenewPassClicked$1.label = 4;
                        objA = stringProvider.b(StringEnum.DOCUMENT_VALIDITY_EXPIRED_TITLE, new Object[0], myTicketsComponent$handleRenewPassClicked$1);
                        if (objA != obj) {
                            superPass4 = superPass3;
                            superPassBooking3 = superPassBooking2;
                            str = (String) objA;
                            myTicketsComponent$handleRenewPassClicked$1.L$0 = superPass4;
                            myTicketsComponent$handleRenewPassClicked$1.L$1 = superPassBooking3;
                            myTicketsComponent$handleRenewPassClicked$1.L$2 = str;
                            myTicketsComponent$handleRenewPassClicked$1.label = 5;
                            objA = stringProvider.b(StringEnum.DOCUMENT_VALIDITY_EXPIRED_MSG, new Object[0], myTicketsComponent$handleRenewPassClicked$1);
                            if (objA != obj) {
                                str2 = (String) objA;
                                u1(str, str2, superPass4);
                                myTicketsComponent$handleRenewPassClicked$1.L$0 = superPassBooking3;
                                myTicketsComponent$handleRenewPassClicked$1.L$1 = str;
                                myTicketsComponent$handleRenewPassClicked$1.L$2 = str2;
                                myTicketsComponent$handleRenewPassClicked$1.label = 6;
                                objB = stringProvider.b(StringEnum.BUY_NEW_PASS, new Object[0], myTicketsComponent$handleRenewPassClicked$1);
                                if (objB != obj) {
                                    superPassBooking4 = superPassBooking3;
                                    str3 = str2;
                                    objA = objB;
                                    str4 = (String) objA;
                                    myTicketsComponent$handleRenewPassClicked$1.L$0 = superPassBooking4;
                                    myTicketsComponent$handleRenewPassClicked$1.L$1 = str;
                                    myTicketsComponent$handleRenewPassClicked$1.L$2 = str3;
                                    myTicketsComponent$handleRenewPassClicked$1.L$3 = str4;
                                    myTicketsComponent$handleRenewPassClicked$1.label = 7;
                                    objB2 = stringProvider.b(StringEnum.CANCEL, new Object[0], myTicketsComponent$handleRenewPassClicked$1);
                                    if (objB2 != obj) {
                                        str5 = str;
                                        str6 = str4;
                                        objA = objB2;
                                        superPassBooking5 = superPassBooking4;
                                        E0(new o3(str5, str3, str6, (String) objA, superPassBooking5, 5));
                                        this.n.d(false);
                                        return unit;
                                    }
                                }
                            }
                        }
                    } else {
                        myTicketsComponent$handleRenewPassClicked$1.L$0 = null;
                        myTicketsComponent$handleRenewPassClicked$1.L$1 = null;
                        myTicketsComponent$handleRenewPassClicked$1.label = 8;
                        if (d1(superPass3, superPassBooking2, myTicketsComponent$handleRenewPassClicked$1) != obj) {
                            return unit;
                        }
                    }
                }
                return obj;
            case 3:
                superPassBooking2 = (ChaloUserBookingType.SuperPassBooking) myTicketsComponent$handleRenewPassClicked$1.L$1;
                superPass3 = (SuperPass) myTicketsComponent$handleRenewPassClicked$1.L$0;
                ResultKt.b(objA);
                if (((Boolean) objA).booleanValue()) {
                    myTicketsComponent$handleRenewPassClicked$1.L$0 = superPass3;
                    myTicketsComponent$handleRenewPassClicked$1.L$1 = superPassBooking2;
                    myTicketsComponent$handleRenewPassClicked$1.label = 4;
                    objA = stringProvider.b(StringEnum.DOCUMENT_VALIDITY_EXPIRED_TITLE, new Object[0], myTicketsComponent$handleRenewPassClicked$1);
                    if (objA != obj) {
                        superPass4 = superPass3;
                        superPassBooking3 = superPassBooking2;
                        str = (String) objA;
                        myTicketsComponent$handleRenewPassClicked$1.L$0 = superPass4;
                        myTicketsComponent$handleRenewPassClicked$1.L$1 = superPassBooking3;
                        myTicketsComponent$handleRenewPassClicked$1.L$2 = str;
                        myTicketsComponent$handleRenewPassClicked$1.label = 5;
                        objA = stringProvider.b(StringEnum.DOCUMENT_VALIDITY_EXPIRED_MSG, new Object[0], myTicketsComponent$handleRenewPassClicked$1);
                        if (objA != obj) {
                            str2 = (String) objA;
                            u1(str, str2, superPass4);
                            myTicketsComponent$handleRenewPassClicked$1.L$0 = superPassBooking3;
                            myTicketsComponent$handleRenewPassClicked$1.L$1 = str;
                            myTicketsComponent$handleRenewPassClicked$1.L$2 = str2;
                            myTicketsComponent$handleRenewPassClicked$1.label = 6;
                            objB = stringProvider.b(StringEnum.BUY_NEW_PASS, new Object[0], myTicketsComponent$handleRenewPassClicked$1);
                            if (objB != obj) {
                                superPassBooking4 = superPassBooking3;
                                str3 = str2;
                                objA = objB;
                                str4 = (String) objA;
                                myTicketsComponent$handleRenewPassClicked$1.L$0 = superPassBooking4;
                                myTicketsComponent$handleRenewPassClicked$1.L$1 = str;
                                myTicketsComponent$handleRenewPassClicked$1.L$2 = str3;
                                myTicketsComponent$handleRenewPassClicked$1.L$3 = str4;
                                myTicketsComponent$handleRenewPassClicked$1.label = 7;
                                objB2 = stringProvider.b(StringEnum.CANCEL, new Object[0], myTicketsComponent$handleRenewPassClicked$1);
                                if (objB2 != obj) {
                                    str5 = str;
                                    str6 = str4;
                                    objA = objB2;
                                    superPassBooking5 = superPassBooking4;
                                    E0(new o3(str5, str3, str6, (String) objA, superPassBooking5, 5));
                                    this.n.d(false);
                                    return unit;
                                }
                            }
                        }
                    }
                } else {
                    myTicketsComponent$handleRenewPassClicked$1.L$0 = null;
                    myTicketsComponent$handleRenewPassClicked$1.L$1 = null;
                    myTicketsComponent$handleRenewPassClicked$1.label = 8;
                    if (d1(superPass3, superPassBooking2, myTicketsComponent$handleRenewPassClicked$1) != obj) {
                        return unit;
                    }
                }
                return obj;
            case 4:
                superPassBooking2 = (ChaloUserBookingType.SuperPassBooking) myTicketsComponent$handleRenewPassClicked$1.L$1;
                superPass3 = (SuperPass) myTicketsComponent$handleRenewPassClicked$1.L$0;
                ResultKt.b(objA);
                superPass4 = superPass3;
                superPassBooking3 = superPassBooking2;
                str = (String) objA;
                myTicketsComponent$handleRenewPassClicked$1.L$0 = superPass4;
                myTicketsComponent$handleRenewPassClicked$1.L$1 = superPassBooking3;
                myTicketsComponent$handleRenewPassClicked$1.L$2 = str;
                myTicketsComponent$handleRenewPassClicked$1.label = 5;
                objA = stringProvider.b(StringEnum.DOCUMENT_VALIDITY_EXPIRED_MSG, new Object[0], myTicketsComponent$handleRenewPassClicked$1);
                if (objA != obj) {
                    str2 = (String) objA;
                    u1(str, str2, superPass4);
                    myTicketsComponent$handleRenewPassClicked$1.L$0 = superPassBooking3;
                    myTicketsComponent$handleRenewPassClicked$1.L$1 = str;
                    myTicketsComponent$handleRenewPassClicked$1.L$2 = str2;
                    myTicketsComponent$handleRenewPassClicked$1.label = 6;
                    objB = stringProvider.b(StringEnum.BUY_NEW_PASS, new Object[0], myTicketsComponent$handleRenewPassClicked$1);
                    if (objB != obj) {
                        superPassBooking4 = superPassBooking3;
                        str3 = str2;
                        objA = objB;
                        str4 = (String) objA;
                        myTicketsComponent$handleRenewPassClicked$1.L$0 = superPassBooking4;
                        myTicketsComponent$handleRenewPassClicked$1.L$1 = str;
                        myTicketsComponent$handleRenewPassClicked$1.L$2 = str3;
                        myTicketsComponent$handleRenewPassClicked$1.L$3 = str4;
                        myTicketsComponent$handleRenewPassClicked$1.label = 7;
                        objB2 = stringProvider.b(StringEnum.CANCEL, new Object[0], myTicketsComponent$handleRenewPassClicked$1);
                        if (objB2 != obj) {
                            str5 = str;
                            str6 = str4;
                            objA = objB2;
                            superPassBooking5 = superPassBooking4;
                            E0(new o3(str5, str3, str6, (String) objA, superPassBooking5, 5));
                            this.n.d(false);
                            return unit;
                        }
                    }
                }
                return obj;
            case 5:
                str = (String) myTicketsComponent$handleRenewPassClicked$1.L$2;
                superPassBooking3 = (ChaloUserBookingType.SuperPassBooking) myTicketsComponent$handleRenewPassClicked$1.L$1;
                superPass4 = (SuperPass) myTicketsComponent$handleRenewPassClicked$1.L$0;
                ResultKt.b(objA);
                str2 = (String) objA;
                u1(str, str2, superPass4);
                myTicketsComponent$handleRenewPassClicked$1.L$0 = superPassBooking3;
                myTicketsComponent$handleRenewPassClicked$1.L$1 = str;
                myTicketsComponent$handleRenewPassClicked$1.L$2 = str2;
                myTicketsComponent$handleRenewPassClicked$1.label = 6;
                objB = stringProvider.b(StringEnum.BUY_NEW_PASS, new Object[0], myTicketsComponent$handleRenewPassClicked$1);
                if (objB != obj) {
                    superPassBooking4 = superPassBooking3;
                    str3 = str2;
                    objA = objB;
                    str4 = (String) objA;
                    myTicketsComponent$handleRenewPassClicked$1.L$0 = superPassBooking4;
                    myTicketsComponent$handleRenewPassClicked$1.L$1 = str;
                    myTicketsComponent$handleRenewPassClicked$1.L$2 = str3;
                    myTicketsComponent$handleRenewPassClicked$1.L$3 = str4;
                    myTicketsComponent$handleRenewPassClicked$1.label = 7;
                    objB2 = stringProvider.b(StringEnum.CANCEL, new Object[0], myTicketsComponent$handleRenewPassClicked$1);
                    if (objB2 != obj) {
                        str5 = str;
                        str6 = str4;
                        objA = objB2;
                        superPassBooking5 = superPassBooking4;
                        E0(new o3(str5, str3, str6, (String) objA, superPassBooking5, 5));
                        this.n.d(false);
                        return unit;
                    }
                }
                return obj;
            case 6:
                String str7 = (String) myTicketsComponent$handleRenewPassClicked$1.L$2;
                String str8 = (String) myTicketsComponent$handleRenewPassClicked$1.L$1;
                superPassBooking4 = (ChaloUserBookingType.SuperPassBooking) myTicketsComponent$handleRenewPassClicked$1.L$0;
                ResultKt.b(objA);
                str3 = str7;
                str = str8;
                str4 = (String) objA;
                myTicketsComponent$handleRenewPassClicked$1.L$0 = superPassBooking4;
                myTicketsComponent$handleRenewPassClicked$1.L$1 = str;
                myTicketsComponent$handleRenewPassClicked$1.L$2 = str3;
                myTicketsComponent$handleRenewPassClicked$1.L$3 = str4;
                myTicketsComponent$handleRenewPassClicked$1.label = 7;
                objB2 = stringProvider.b(StringEnum.CANCEL, new Object[0], myTicketsComponent$handleRenewPassClicked$1);
                if (objB2 != obj) {
                    str5 = str;
                    str6 = str4;
                    objA = objB2;
                    superPassBooking5 = superPassBooking4;
                    E0(new o3(str5, str3, str6, (String) objA, superPassBooking5, 5));
                    this.n.d(false);
                    return unit;
                }
                return obj;
            case 7:
                String str9 = (String) myTicketsComponent$handleRenewPassClicked$1.L$3;
                str3 = (String) myTicketsComponent$handleRenewPassClicked$1.L$2;
                String str10 = (String) myTicketsComponent$handleRenewPassClicked$1.L$1;
                ChaloUserBookingType.SuperPassBooking superPassBooking8 = (ChaloUserBookingType.SuperPassBooking) myTicketsComponent$handleRenewPassClicked$1.L$0;
                ResultKt.b(objA);
                str6 = str9;
                superPassBooking5 = superPassBooking8;
                str5 = str10;
                E0(new o3(str5, str3, str6, (String) objA, superPassBooking5, 5));
                this.n.d(false);
                return unit;
            case 8:
                ResultKt.b(objA);
                return unit;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void n1() {
        this.n.d(true);
        E0(new sk0(5));
    }

    public final void o1(BookingsRequestType bookingsRequestType) {
        boolean z = bookingsRequestType instanceof BookingsRequestType.MagicPassType;
        ChaloNavigationManager chaloNavigationManager = this.Q;
        if (z || (bookingsRequestType instanceof BookingsRequestType.ApplicationPassType) || (bookingsRequestType instanceof BookingsRequestType.PendingSuperPassType) || (bookingsRequestType instanceof BookingsRequestType.RideBasedPassType)) {
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new TripSummaryArgs.PassSummaryScreen(Source.HOME_SCREEN, bookingsRequestType), null, null, 6));
            return;
        }
        if ((bookingsRequestType instanceof BookingsRequestType.MobileTicketType) || (bookingsRequestType instanceof BookingsRequestType.InstantTicketType) || (bookingsRequestType instanceof BookingsRequestType.OndcTicketType) || (bookingsRequestType instanceof BookingsRequestType.OndcMetroTicketType) || (bookingsRequestType instanceof BookingsRequestType.MetroTicketType) || (bookingsRequestType instanceof BookingsRequestType.MultiModalGroupTicketType) || (bookingsRequestType instanceof BookingsRequestType.PremiumBusTicketType) || (bookingsRequestType instanceof BookingsRequestType.QuickPayType) || (bookingsRequestType instanceof BookingsRequestType.SuperPassRideType)) {
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new TripSummaryArgs.TicketSummaryScreen(Source.HOME_SCREEN, bookingsRequestType), null, null, 6));
        } else if (!(bookingsRequestType instanceof BookingsRequestType.CardRechargeType) && !(bookingsRequestType instanceof BookingsRequestType.CardTransactionReceiptType)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        return BuildersKt.g(this.H.getDefault(), new MyTicketsComponent$convertToUiState$2((MyTicketsDataState) obj, this, null), continuationImpl);
    }

    public final void p1(String str, SuperPassSubType superPassSubType) {
        int i = WhenMappings.g[superPassSubType.ordinal()];
        if (i == 1) {
            o1(new BookingsRequestType.MagicPassType(str));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            o1(new BookingsRequestType.RideBasedPassType(str));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v30, types: [app.chalo.features.foreground.ForegroundListener, app.chalo.home.ui.history.MyTicketsComponent$registerNotificationSettingsForegroundListener$listener$1] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void q1(MyTicketsViewIntent intent) {
        String str;
        String str2;
        String str3;
        Url urlB;
        BookingsRequestType ondcMetroTicketType;
        MutableStateFlow mutableStateFlow;
        Object value;
        Intrinsics.i(intent, "intent");
        C0(intent);
        String message = "INTENT = " + intent;
        Intrinsics.i(message, "message");
        int i = 6;
        if (intent instanceof MyTicketsViewIntent.MyTicketsPageInitializationIntent) {
            MyTicketsViewIntent.MyTicketsPageInitializationIntent myTicketsPageInitializationIntent = (MyTicketsViewIntent.MyTicketsPageInitializationIntent) intent;
            if (this.l0) {
                this.l0 = false;
                TicketsPassesSectionWidgetAppModel ticketsPassesSectionWidgetAppModel = myTicketsPageInitializationIntent.f3423a.f3816a;
                E0(new ej0(i, myTicketsPageInitializationIntent, ticketsPassesSectionWidgetAppModel instanceof TicketsPassesSectionWidgetAppModel.TicketsTabHooksSectionWidgetAppModel ? (TicketsPassesSectionWidgetAppModel.TicketsTabHooksSectionWidgetAppModel) ticketsPassesSectionWidgetAppModel : null));
                return;
            }
            return;
        }
        boolean zEquals = intent.equals(MyTicketsViewIntent.TicketsScreenViewStartedIntent.f3439a);
        VisibleJobTracker visibleJobTracker = this.j0;
        if (zEquals) {
            w0(new MyTicketsComponent$syncHistoryCallIfRequired$1(this, null));
            visibleJobTracker.b(w0(new MyTicketsComponent$renderTicketsPage$1(this, null)));
            w0(new MyTicketsComponent$updatePremiumReserveTicketsList$1(this, null));
            return;
        }
        boolean z = intent instanceof MyTicketsViewIntent.QuickFilterTabClickedIntent;
        int i2 = 7;
        HomeScreenAnalyticsHelper homeScreenAnalyticsHelper = this.E;
        if (z) {
            MyTicketsViewIntent.QuickFilterTabClickedIntent quickFilterTabClickedIntent = (MyTicketsViewIntent.QuickFilterTabClickedIntent) intent;
            TicketsPassesTabType ticketsPassesTabType = quickFilterTabClickedIntent.f3430a;
            HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, ticketsPassesTabType == TicketsPassesTabType.ACTIVE ? "active tickets tab selected" : "expired tickets tab selected", null, Source.MY_TICKETS_SCREEN_TAB, 14);
            E0(new ej0(i2, quickFilterTabClickedIntent, this));
            do {
                mutableStateFlow = this.d0;
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.c(value, ticketsPassesTabType));
            return;
        }
        boolean z2 = intent instanceof MyTicketsViewIntent.TicketsPageItemClickedIntent;
        int i3 = 12;
        int i4 = 3;
        String str4 = "";
        HomeTabScreensNavigationAndStateManager homeTabScreensNavigationAndStateManager = this.R;
        if (z2) {
            MyTicketsViewIntent.TicketsPageItemClickedIntent ticketsPageItemClickedIntent = (MyTicketsViewIntent.TicketsPageItemClickedIntent) intent;
            TicketsPageFeature ticketsPageFeature = ticketsPageItemClickedIntent.b;
            String str5 = ticketsPageItemClickedIntent.d;
            TicketsTabHooksCardSectionData ticketsTabHooksCardSectionData = ticketsPageItemClickedIntent.f3438a;
            int i5 = WhenMappings.f3394a[ticketsPageFeature.ordinal()];
            if (i5 == 1) {
                Source source = Source.MY_TICKETS_SCREEN_TAB;
                String str6 = ticketsPageItemClickedIntent.c;
                HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "tickets page card item clicked", vo1.s("title", str6 != null ? str6 : ""), source, 12);
                homeTabScreensNavigationAndStateManager.c(BottomNavTabType.REGULAR_BUS, true);
            } else if (i5 == 2) {
                if (ticketsTabHooksCardSectionData != null) {
                    w1(ticketsTabHooksCardSectionData, str5 != null ? str5 : "");
                }
                homeTabScreensNavigationAndStateManager.c(BottomNavTabType.REGULAR_BUS, true);
            } else if (i5 == 3) {
                if (ticketsTabHooksCardSectionData != null) {
                    w1(ticketsTabHooksCardSectionData, str5 != null ? str5 : "");
                }
                homeTabScreensNavigationAndStateManager.c(BottomNavTabType.CHALO_BUS, true);
            } else if (i5 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            n1();
            return;
        }
        boolean zEquals2 = intent.equals(MyTicketsViewIntent.ProductPurchaseClickedIntent.f3429a);
        HomeScreenInfoHelper homeScreenInfoHelper = this.n;
        StateFlow stateFlow = this.f;
        if (zEquals2) {
            Source source2 = Source.MY_TICKETS_SCREEN_TAB;
            HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "buy ticket passes button clicked", null, source2, 14);
            if (((MyTicketsDataState) stateFlow.getValue()).j == null) {
                homeTabScreensNavigationAndStateManager.c(BottomNavTabType.REGULAR_BUS, true);
                return;
            }
            HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "product purchase bottomsheet opened", null, source2, 14);
            E0(new sk0(10));
            homeScreenInfoHelper.d(false);
            return;
        }
        if (intent.equals(MyTicketsViewIntent.BottomSheetDismissIntent.f3416a)) {
            E0(new sk0(i4));
            homeScreenInfoHelper.d(true);
            return;
        }
        boolean zEquals3 = intent.equals(MyTicketsViewIntent.TicketsScreenViewStoppedIntent.f3440a);
        ContextScope contextScope = this.j;
        if (zEquals3) {
            visibleJobTracker.a();
            BuildersKt.d(contextScope, this.H.b(), null, new MyTicketsComponent$handleTicketsScreenViewStoppedIntent$1(this, null), 2);
            return;
        }
        if (intent.equals(MyTicketsViewIntent.ReclaimButtonClickedIntent.f3431a)) {
            HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "reclaim card button clicked", null, Source.MY_TICKETS_SCREEN_TAB, 14);
            E0(new sk0(16));
            return;
        }
        if (intent instanceof MyTicketsViewIntent.OnDropDownMenuSummaryClickedIntent) {
            ChaloUserBookingType chaloUserBookingType = ((MyTicketsViewIntent.OnDropDownMenuSummaryClickedIntent) intent).f3427a;
            HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "product menu view summary clicked", MapsKt.i(new Pair("productType", chaloUserBookingType.b), new Pair("productSubType", chaloUserBookingType.c), new Pair("bookingId", chaloUserBookingType.f2987a)), Source.MY_TICKETS_SCREEN_TAB, 12);
            if (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.InstantTicketBooking) {
                o1(new BookingsRequestType.InstantTicketType(((ChaloUserBookingType.TicketBooking.InstantTicketBooking) chaloUserBookingType).d.f3881a));
                return;
            }
            if (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.QuickPayBooking) {
                QuickPayAppModel quickPayAppModel = ((ChaloUserBookingType.TicketBooking.QuickPayBooking) chaloUserBookingType).d;
                o1(new BookingsRequestType.QuickPayType(quickPayAppModel.i, quickPayAppModel.b));
                return;
            }
            if (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.PremiumBusBooking) {
                o1(new BookingsRequestType.PremiumBusTicketType(((ChaloUserBookingType.TicketBooking.PremiumBusBooking) chaloUserBookingType).d.f7113a.f7114a));
                return;
            }
            if (chaloUserBookingType instanceof ChaloUserBookingType.SuperPassBooking.MagicSuperPassBooking) {
                SuperPassProperties superPassProperties = ((ChaloUserBookingType.SuperPassBooking.MagicSuperPassBooking) chaloUserBookingType).d.f9560a;
                p1(superPassProperties.f9566a, superPassProperties.c);
                return;
            }
            if (chaloUserBookingType instanceof ChaloUserBookingType.SuperPassBooking.RideBasedSuperPassBooking) {
                SuperPassProperties superPassProperties2 = ((ChaloUserBookingType.SuperPassBooking.RideBasedSuperPassBooking) chaloUserBookingType).d.f9560a;
                p1(superPassProperties2.f9566a, superPassProperties2.c);
                return;
            }
            if ((chaloUserBookingType instanceof ChaloUserBookingType.SuperPassBooking.PendingSuperPassBooking) || (chaloUserBookingType instanceof ChaloUserBookingType.SuperPassBooking.SuperPassApplicationBooking)) {
                return;
            }
            if (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.PassRideBooking) {
                SuperPassRideBookingAppModel superPassRideBookingAppModel = ((ChaloUserBookingType.TicketBooking.PassRideBooking) chaloUserBookingType).d;
                o1(new BookingsRequestType.SuperPassRideType(superPassRideBookingAppModel.f5681a, superPassRideBookingAppModel.c, superPassRideBookingAppModel.d));
                return;
            }
            if (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.OndcTicketBooking) {
                o1(new BookingsRequestType.OndcTicketType(((ChaloUserBookingType.TicketBooking.OndcTicketBooking) chaloUserBookingType).d.f6771a));
                return;
            }
            if (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.OndcMetroTicketBooking) {
                o1(new BookingsRequestType.OndcMetroTicketType(((ChaloUserBookingType.TicketBooking.OndcMetroTicketBooking) chaloUserBookingType).d.f6769a));
                return;
            }
            if (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.MetroTicketBooking) {
                o1(new BookingsRequestType.MetroTicketType(((ChaloUserBookingType.TicketBooking.MetroTicketBooking) chaloUserBookingType).d.f5431a));
                return;
            }
            if (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.MultiModalGroupTicketBooking) {
                MultiModalGroupTicketAppModel multiModalGroupTicketAppModel = ((ChaloUserBookingType.TicketBooking.MultiModalGroupTicketBooking) chaloUserBookingType).d;
                if (multiModalGroupTicketAppModel.r.isEmpty()) {
                    o1(new BookingsRequestType.MultiModalGroupTicketType(multiModalGroupTicketAppModel.f5874a));
                    return;
                } else {
                    E0(new wi0(multiModalGroupTicketAppModel, 18));
                    homeScreenInfoHelper.d(false);
                    return;
                }
            }
            if ((chaloUserBookingType instanceof ChaloUserBookingType.CardBooking.CardRechargeBooking) || (chaloUserBookingType instanceof ChaloUserBookingType.CardBooking.CardTransactionReceiptBooking)) {
                return;
            }
            if (!(chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.MobileTicketBooking)) {
                throw new NoWhenBranchMatchedException();
            }
            o1(new BookingsRequestType.MobileTicketType(((ChaloUserBookingType.TicketBooking.MobileTicketBooking) chaloUserBookingType).d.f5615a));
            return;
        }
        if (intent instanceof MyTicketsViewIntent.MultiModalChildTicketSelectedIntent) {
            n1();
            MultiModalGroupTicketChildAppModel multiModalGroupTicketChildAppModel = ((MyTicketsViewIntent.MultiModalChildTicketSelectedIntent) intent).f3422a;
            if (multiModalGroupTicketChildAppModel instanceof MultiModalGroupTicketChildAppModel.InstantTicketChild) {
                ondcMetroTicketType = new BookingsRequestType.InstantTicketType(((MultiModalGroupTicketChildAppModel.InstantTicketChild) multiModalGroupTicketChildAppModel).b.f3881a);
            } else {
                if (!(multiModalGroupTicketChildAppModel instanceof MultiModalGroupTicketChildAppModel.OndcMetroTicketChild)) {
                    throw new NoWhenBranchMatchedException();
                }
                ondcMetroTicketType = new BookingsRequestType.OndcMetroTicketType(((MultiModalGroupTicketChildAppModel.OndcMetroTicketChild) multiModalGroupTicketChildAppModel).b.f6769a);
            }
            o1(ondcMetroTicketType);
            return;
        }
        if (intent instanceof MyTicketsViewIntent.UseNowClickedIntent) {
            MyTicketsViewIntent.UseNowClickedIntent useNowClickedIntent = (MyTicketsViewIntent.UseNowClickedIntent) intent;
            if (this.f0 != null) {
                return;
            }
            this.f0 = new PendingUseNowContext(useNowClickedIntent.f3442a, useNowClickedIntent.b);
            BuildersKt.d(contextScope, null, null, new MyTicketsComponent$handleUseNowClickedIntent$1(this, useNowClickedIntent, null), 3);
            return;
        }
        if (intent instanceof MyTicketsViewIntent.BookAgainClickedIntent) {
            w0(new MyTicketsComponent$handleBookAgainClickedIntent$1((MyTicketsViewIntent.BookAgainClickedIntent) intent, this, null));
            return;
        }
        if (intent.equals(MyTicketsViewIntent.ReclaimDialogNegativeCtaClickedIntent.f3432a)) {
            HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "reclaim dialog negative button clicked", null, Source.MY_TICKETS_SCREEN_TAB, 14);
            E0(new sk0(6));
            return;
        }
        if (intent.equals(MyTicketsViewIntent.ReclaimDialogPositiveCtaClickedIntent.f3433a)) {
            HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "reclaim dialog positive button clicked", null, Source.MY_TICKETS_SCREEN_TAB, 14);
            E0(new sk0(i3));
            w0(new MyTicketsComponent$handleReclaimDialogPositiveCtaClickedIntent$2(this, null));
            return;
        }
        boolean zEquals4 = intent.equals(MyTicketsViewIntent.TabHeaderIconClickedIntent.f3437a);
        ChaloNavigationManager chaloNavigationManager = this.Q;
        if (zEquals4) {
            String str7 = ((MyTicketsDataState) stateFlow.getValue()).f3413a.n;
            String string = str7 != null ? StringsKt.u0(str7).toString() : null;
            if (string != null && string.length() != 0) {
                try {
                    URLBuilder uRLBuilder = new URLBuilder();
                    URLParserKt.b(uRLBuilder, string);
                    if (uRLBuilder.f16808a.length() <= 0) {
                        uRLBuilder = null;
                    }
                    urlB = uRLBuilder != null ? uRLBuilder.b() : null;
                } catch (URLParserException unused) {
                }
                if (urlB != null) {
                    URLProtocol protocolOrNull = urlB.getProtocolOrNull();
                    if (StringsKt.x(protocolOrNull != null ? protocolOrNull.getName() : null, URLProtocol.b.getName(), true) && urlB.getHost().length() > 0) {
                        HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "my tickets screen faq clicked", null, Source.MY_TICKETS_SCREEN_TAB, 14);
                        String str8 = ((MyTicketsDataState) stateFlow.getValue()).f3413a.o;
                        chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new WebViewArgs(string, str8 != null ? str8 : "", false, false), null, null, 6));
                        return;
                    }
                }
            }
            w0(new MyTicketsComponent$handleReportProblemClickedIntent$1(this, null));
            HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "report problem clicked v2", MapsKt.i(new Pair("type", "otherTicketingProblemsV2"), new Pair("problemSource", "activatePassScreen")), Source.MY_TICKETS_SCREEN_TAB, 12);
            return;
        }
        if (intent instanceof MyTicketsViewIntent.OnProductStatusCtaClickedIntent) {
            MyTicketsViewIntent.OnProductStatusCtaClickedIntent onProductStatusCtaClickedIntent = (MyTicketsViewIntent.OnProductStatusCtaClickedIntent) intent;
            Source source3 = Source.MY_TICKETS_SCREEN_TAB;
            ChaloUserBookingType chaloUserBookingType2 = onProductStatusCtaClickedIntent.f3428a;
            HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "product status button clicked", MapsKt.i(new Pair("productType", chaloUserBookingType2.b), new Pair("productSubType", chaloUserBookingType2.c), new Pair("bookingId", chaloUserBookingType2.f2987a)), source3, 12);
            w0(new MyTicketsComponent$handleOnProductStatusCtaClickedIntent$1(onProductStatusCtaClickedIntent, this, null));
            return;
        }
        if (intent instanceof MyTicketsViewIntent.InfoBottomSheetPositiveCtaClickedIntent) {
            MyTicketsViewIntent.InfoBottomSheetPositiveCtaClickedIntent infoBottomSheetPositiveCtaClickedIntent = (MyTicketsViewIntent.InfoBottomSheetPositiveCtaClickedIntent) intent;
            TicketsPageInfoBottomSheetPositiveCtaType ticketsPageInfoBottomSheetPositiveCtaType = infoBottomSheetPositiveCtaClickedIntent.f3420a;
            BookableSuperPassConfiguration bookableSuperPassConfiguration = infoBottomSheetPositiveCtaClickedIntent.c;
            SuperPass superPass = infoBottomSheetPositiveCtaClickedIntent.b;
            ChaloUserBookingType chaloUserBookingType3 = infoBottomSheetPositiveCtaClickedIntent.d;
            switch (WhenMappings.d[ticketsPageInfoBottomSheetPositiveCtaType.ordinal()]) {
                case 1:
                case 2:
                    HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "product activation bottomsheet positive cta clicked", MapsKt.i(new Pair("productType", chaloUserBookingType3.b), new Pair("productSubType", chaloUserBookingType3.c), new Pair("bookingId", chaloUserBookingType3.f2987a)), Source.MY_TICKETS_SCREEN_TAB, 12);
                    w0(new MyTicketsComponent$handleInfoBottomSheetPositiveCtaClickedIntent$1(this, infoBottomSheetPositiveCtaClickedIntent, null));
                    break;
                case 3:
                    v1(chaloUserBookingType3);
                    if (bookableSuperPassConfiguration != null && superPass != null) {
                        Source source4 = Source.MY_TICKETS_SCREEN_TAB;
                        Json json = ChaloJson.b;
                        json.getClass();
                        chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.Renew(source4, json.a(BookableSuperPassConfiguration.INSTANCE.serializer(), bookableSuperPassConfiguration), json.a(SuperPassUserDetails.INSTANCE.serializer(), superPass.getC().c), superPass.f9560a.f9566a, superPass.d.d, PostPassPurchaseSuccessFlowType.ACTIVATION), null, null, 6));
                    }
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    v1(chaloUserBookingType3);
                    if (superPass != null) {
                        chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new ProductSelectionArgs(null, superPass.f9560a.f9566a, null, Source.MY_TICKETS_SCREEN_TAB, superPass.l(), null, 157), null, null, 6));
                    }
                    break;
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "product activation failed bottomsheet positive cta clicked", MapsKt.i(new Pair("productType", chaloUserBookingType3.b), new Pair("productSubType", chaloUserBookingType3.c), new Pair("bookingId", chaloUserBookingType3.f2987a)), Source.MY_TICKETS_SCREEN_TAB, 12);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            n1();
            return;
        }
        if (intent instanceof MyTicketsViewIntent.InfoBottomSheetNegativeCtaClickedIntent) {
            MyTicketsViewIntent.InfoBottomSheetNegativeCtaClickedIntent infoBottomSheetNegativeCtaClickedIntent = (MyTicketsViewIntent.InfoBottomSheetNegativeCtaClickedIntent) intent;
            int i6 = WhenMappings.c[infoBottomSheetNegativeCtaClickedIntent.f3419a.ordinal()];
            if (i6 != 1 && i6 != 2 && i6 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Source source5 = Source.MY_TICKETS_SCREEN_TAB;
            ChaloUserBookingType chaloUserBookingType4 = infoBottomSheetNegativeCtaClickedIntent.d;
            if (chaloUserBookingType4 == null || (str = chaloUserBookingType4.b) == null) {
                str = "";
            }
            Pair pair = new Pair("productType", str);
            if (chaloUserBookingType4 == null || (str2 = chaloUserBookingType4.c) == null) {
                str2 = "";
            }
            Pair pair2 = new Pair("productSubType", str2);
            if (chaloUserBookingType4 != null && (str3 = chaloUserBookingType4.f2987a) != null) {
                str4 = str3;
            }
            HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "renew error bottomsheet negative cta clicked", MapsKt.i(pair, pair2, new Pair("bookingId", str4)), source5, 12);
            n1();
            return;
        }
        if (intent.equals(MyTicketsViewIntent.DismissAlertDialogIntent.f3418a)) {
            E0(new sk0(8));
            return;
        }
        if (intent instanceof MyTicketsViewIntent.NotificationPermissionUpdatedIntent) {
            k1((MyTicketsViewIntent.NotificationPermissionUpdatedIntent) intent);
            return;
        }
        if (intent.equals(MyTicketsViewIntent.NavigateToNotificationSettingsIntent.f3424a)) {
            HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "notification permission explainer enable clicked", null, Source.MY_TICKETS_SCREEN_TAB, 14);
            E0(new sk0(11));
            if (this.f0 != null) {
                x1();
                ?? r1 = new ForegroundListener() { // from class: app.chalo.home.ui.history.MyTicketsComponent$registerNotificationSettingsForegroundListener$listener$1
                    @Override // app.chalo.features.foreground.ForegroundListener
                    public final void b() {
                        MyTicketsComponent myTicketsComponent = this.f3401a;
                        if (myTicketsComponent.g0 != this) {
                            return;
                        }
                        myTicketsComponent.x1();
                        BuildersKt.d(myTicketsComponent.j, null, null, new MyTicketsComponent$registerNotificationSettingsForegroundListener$listener$1$onBecameForeground$1(myTicketsComponent, null), 3);
                    }

                    @Override // app.chalo.features.foreground.ForegroundListener
                    public final void a() {
                    }
                };
                this.g0 = r1;
                this.Y.a(r1);
            }
            this.T.f();
            return;
        }
        if (intent.equals(MyTicketsViewIntent.NotificationExplainerSkippedIntent.f3425a)) {
            j1();
            return;
        }
        if (intent.equals(MyTicketsViewIntent.BackPressedOnNotificationExplainerScreen.f3414a)) {
            int i7 = WhenMappings.e[((MyTicketsDataState) stateFlow.getValue()).t.ordinal()];
            if (i7 == 1) {
                j1();
                return;
            } else {
                if (i7 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (((MyTicketsDataState) stateFlow.getValue()).i != null) {
                    E0(new sk0(15));
                    return;
                }
                return;
            }
        }
        if (intent.equals(MyTicketsViewIntent.SeeMorePassesClickedIntent.f3435a)) {
            E0(new sk0(14));
            return;
        }
        if (intent.equals(MyTicketsViewIntent.SeeMoreTicketsClickedIntent.f3436a)) {
            E0(new sk0(9));
            return;
        }
        if (intent instanceof MyTicketsViewIntent.UpdatedRetainedStateIntent) {
            homeTabScreensNavigationAndStateManager.b(((MyTicketsViewIntent.UpdatedRetainedStateIntent) intent).f3441a);
            return;
        }
        if (intent.equals(MyTicketsViewIntent.LogInClickedIntent.f3421a)) {
            if (((Boolean) this.t.getG().getValue()).booleanValue()) {
                return;
            }
            ChaloNavigationManagerKt.e(chaloNavigationManager, new LoginOptionsArgs(Source.MY_TICKETS_SCREEN_TAB, false), null, 6);
        } else if (intent.equals(MyTicketsViewIntent.RequestHistoryButtonClicked.f3434a)) {
            HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "tickets page request history clicked", null, Source.MY_TICKETS_SCREEN_TAB, 14);
            E0(new sk0(4));
        } else {
            if (!intent.equals(MyTicketsViewIntent.ContactSupportDialogOkayClicked.f3417a)) {
                throw new NoWhenBranchMatchedException();
            }
            E0(new sk0(7));
        }
    }

    public final void r1(TicketsPassesSectionWidgetAppModel ticketsPassesSectionWidgetAppModel) {
        String strO;
        TextStyleAppModel textStyleAppModel;
        List list;
        if (ticketsPassesSectionWidgetAppModel != null) {
            boolean z = ticketsPassesSectionWidgetAppModel instanceof TicketsPassesSectionWidgetAppModel.PurchaseProductCardWidgetAppModel;
            HomeScreenAnalyticsHelper homeScreenAnalyticsHelper = this.E;
            if (z) {
                HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "tickets page card item rendered", vo1.s("title", ((TicketsPassesSectionWidgetAppModel.PurchaseProductCardWidgetAppModel) ticketsPassesSectionWidgetAppModel).d.f3784a), Source.MY_TICKETS_SCREEN_TAB, 12);
                return;
            }
            if (!(ticketsPassesSectionWidgetAppModel instanceof TicketsPassesSectionWidgetAppModel.TicketsTabHooksSectionWidgetAppModel)) {
                throw new NoWhenBranchMatchedException();
            }
            int i = 0;
            for (Object obj : CollectionsKt.v0(new MyTicketsComponent$raiseTicketsPageProductPurchaseHookRendered$$inlined$sortedBy$1(), ((TicketsPassesSectionWidgetAppModel.TicketsTabHooksSectionWidgetAppModel) ticketsPassesSectionWidgetAppModel).d.f3820a)) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                TicketsTabHooksCardSectionData ticketsTabHooksCardSectionData = (TicketsTabHooksCardSectionData) obj;
                ItemTextDataAppModel itemTextDataAppModel = ticketsTabHooksCardSectionData.d;
                ChaloTextDataAppModel chaloTextDataAppModel = itemTextDataAppModel.c;
                String str = "";
                if (chaloTextDataAppModel == null || (textStyleAppModel = chaloTextDataAppModel.f) == null || (list = textStyleAppModel.d) == null || (strO = CollectionsKt.O(list, " ", null, null, new sk0(17), 30)) == null) {
                    strO = "";
                }
                Source source = Source.MY_TICKETS_SCREEN_TAB;
                Pair pair = new Pair("type", ticketsTabHooksCardSectionData.e.getFeatureType());
                Pair pair2 = new Pair("position", String.valueOf(i));
                Pair pair3 = new Pair("title", strO);
                List list2 = itemTextDataAppModel.f3757a;
                Pair pair4 = new Pair("desc list", list2 != null ? GridWidgetDataKt.a(list2) : EmptyList.f17557a);
                List list3 = itemTextDataAppModel.b;
                Pair pair5 = new Pair("tag list", list3 != null ? GridWidgetDataKt.a(list3) : EmptyList.f17557a);
                String str2 = ticketsTabHooksCardSectionData.b;
                if (str2 != null) {
                    str = str2;
                }
                HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "tickets page hook rendered", MapsKt.i(pair, pair2, pair3, pair4, pair5, new Pair("image url", str)), source, 12);
                i = i2;
            }
        }
    }

    public final void s1(String str, String str2, ChaloUserBookingType chaloUserBookingType) {
        HomeScreenAnalyticsHelper.DefaultImpls.a(this.E, "product activation failed bottomsheet shown", MapsKt.i(new Pair("productType", chaloUserBookingType.b), new Pair("productSubType", chaloUserBookingType.c), new Pair("bookingId", chaloUserBookingType.f2987a), new Pair("bottomsheet title", str), new Pair("bottomsheet reason", str2)), Source.MY_TICKETS_SCREEN_TAB, 12);
    }

    public final void t1() {
        Source source = Source.MY_TICKETS_SCREEN_TAB;
        HomeScreenAnalyticsHelper.DefaultImpls.a(this.E, "renew disabled product error dialog rendered", vo1.s("renew disabled product source", source.getSourceName()), source, 12);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        TabMetaDataAppModel tabMetaDataAppModel = new TabMetaDataAppModel();
        TicketsPassesTabType ticketsPassesTabType = TicketsPassesTabType.ACTIVE;
        return new MyTicketsDataState(tabMetaDataAppModel, CollectionsKt.S(ticketsPassesTabType, TicketsPassesTabType.EXPIRED), null, null, false, false, ticketsPassesTabType, null, null, null, false, new LinkedHashMap(), false, null, false, true, null, false, "", TicketsPageLayoutType.TICKETS_PASSES_SECTION, new TabUiMetaData(), new TabUiMetaData(), null, false);
    }

    public final void u1(String str, String str2, SuperPass superPass) {
        LinkedHashMap linkedHashMapU = MapsKt.u(h1(superPass));
        linkedHashMapU.put("bottomsheet title", str);
        linkedHashMapU.put("bottomsheet reason", str2);
        HomeScreenAnalyticsHelper.DefaultImpls.a(this.E, "renew error bottomsheet shown", linkedHashMapU, Source.MY_TICKETS_SCREEN_TAB, 12);
    }

    public final void v1(ChaloUserBookingType chaloUserBookingType) {
        HomeScreenAnalyticsHelper.DefaultImpls.a(this.E, "renew error bottomsheet positive cta clicked", MapsKt.i(new Pair("productType", chaloUserBookingType.b), new Pair("productSubType", chaloUserBookingType.c), new Pair("bookingId", chaloUserBookingType.f2987a)), Source.MY_TICKETS_SCREEN_TAB, 12);
    }

    public final void w1(TicketsTabHooksCardSectionData ticketsTabHooksCardSectionData, String str) {
        String strO;
        TextStyleAppModel textStyleAppModel;
        List list;
        ItemTextDataAppModel itemTextDataAppModel = ticketsTabHooksCardSectionData.d;
        ChaloTextDataAppModel chaloTextDataAppModel = itemTextDataAppModel.c;
        int i = 2;
        if (chaloTextDataAppModel == null || (textStyleAppModel = chaloTextDataAppModel.f) == null || (list = textStyleAppModel.d) == null || (strO = CollectionsKt.O(list, " ", null, null, new sk0(i), 30)) == null) {
            strO = "";
        }
        Source source = Source.MY_TICKETS_SCREEN_TAB;
        Pair pair = new Pair("type", ticketsTabHooksCardSectionData.e.getFeatureType());
        Pair pair2 = new Pair("position", str);
        Pair pair3 = new Pair("title", strO);
        List list2 = itemTextDataAppModel.f3757a;
        Pair pair4 = new Pair("desc list", list2 != null ? GridWidgetDataKt.a(list2) : EmptyList.f17557a);
        List list3 = itemTextDataAppModel.b;
        Pair pair5 = new Pair("tag list", list3 != null ? GridWidgetDataKt.a(list3) : EmptyList.f17557a);
        String str2 = ticketsTabHooksCardSectionData.b;
        HomeScreenAnalyticsHelper.DefaultImpls.a(this.E, "tickets page hook clicked", MapsKt.i(pair, pair2, pair3, pair4, pair5, new Pair("image url", str2 != null ? str2 : "")), source, 12);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void x0() {
        this.f0 = null;
        x1();
        Job job = this.h0;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        this.j0.a();
    }

    public final void x1() {
        MyTicketsComponent$registerNotificationSettingsForegroundListener$listener$1 myTicketsComponent$registerNotificationSettingsForegroundListener$listener$1 = this.g0;
        if (myTicketsComponent$registerNotificationSettingsForegroundListener$listener$1 != null) {
            this.Y.b(myTicketsComponent$registerNotificationSettingsForegroundListener$listener$1);
        }
        this.g0 = null;
    }

    public final void y1() {
        Job job = this.b0;
        if (job == null || !((JobSupport) job).isActive()) {
            Job jobW0 = w0(new MyTicketsComponent$renderTicketsAndPassesScreenWithTabs$job$1(this, null));
            this.b0 = jobW0;
            this.j0.b(jobW0);
            ((JobSupport) jobW0).w(new rk0(this, 1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00a8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object z1(ChaloUserBookingType chaloUserBookingType, ContinuationImpl continuationImpl) {
        MyTicketsComponent$runPreActivationCheckAndProceed$1 myTicketsComponent$runPreActivationCheckAndProceed$1;
        if (continuationImpl instanceof MyTicketsComponent$runPreActivationCheckAndProceed$1) {
            myTicketsComponent$runPreActivationCheckAndProceed$1 = (MyTicketsComponent$runPreActivationCheckAndProceed$1) continuationImpl;
            int i = myTicketsComponent$runPreActivationCheckAndProceed$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                myTicketsComponent$runPreActivationCheckAndProceed$1.label = i - Integer.MIN_VALUE;
            } else {
                myTicketsComponent$runPreActivationCheckAndProceed$1 = new MyTicketsComponent$runPreActivationCheckAndProceed$1(this, continuationImpl);
            }
        } else {
            myTicketsComponent$runPreActivationCheckAndProceed$1 = new MyTicketsComponent$runPreActivationCheckAndProceed$1(this, continuationImpl);
        }
        Object objC = myTicketsComponent$runPreActivationCheckAndProceed$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = myTicketsComponent$runPreActivationCheckAndProceed$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objC);
            myTicketsComponent$runPreActivationCheckAndProceed$1.L$0 = chaloUserBookingType;
            myTicketsComponent$runPreActivationCheckAndProceed$1.label = 1;
            objC = this.x.c(chaloUserBookingType, myTicketsComponent$runPreActivationCheckAndProceed$1);
            if (objC != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ResultKt.b(objC);
                return unit;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
            return unit;
        }
        chaloUserBookingType = (ChaloUserBookingType) myTicketsComponent$runPreActivationCheckAndProceed$1.L$0;
        ResultKt.b(objC);
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objC;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
            ProductActivationFailureReason productActivationFailureReason = (ProductActivationFailureReason) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
            myTicketsComponent$runPreActivationCheckAndProceed$1.L$0 = null;
            myTicketsComponent$runPreActivationCheckAndProceed$1.label = 2;
            if (l1(productActivationFailureReason, chaloUserBookingType, myTicketsComponent$runPreActivationCheckAndProceed$1) == obj) {
                return obj;
            }
            return unit;
        }
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        int i3 = WhenMappings.b[((ActivationCheckSuccessRemarks) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).ordinal()];
        if (i3 == 1) {
            myTicketsComponent$runPreActivationCheckAndProceed$1.L$0 = null;
            myTicketsComponent$runPreActivationCheckAndProceed$1.label = 3;
            if (i1(chaloUserBookingType, myTicketsComponent$runPreActivationCheckAndProceed$1) == obj) {
                return obj;
            }
            return unit;
        }
        if (i3 == 2 || i3 == 3) {
            w0(new MyTicketsComponent$runPreActivationCheckAndProceed$2(this, chaloUserBookingType, null));
            return unit;
        }
        if (i3 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        w0(new MyTicketsComponent$runPreActivationCheckAndProceed$3(this, chaloUserBookingType, null));
        return unit;
    }
}
