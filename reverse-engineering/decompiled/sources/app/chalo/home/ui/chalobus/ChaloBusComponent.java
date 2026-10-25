package app.chalo.home.ui.chalobus;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.data.PremiumBusNativeCityWiseConfigAppModel;
import app.chalo.datastore.LocalDataStore;
import app.chalo.features.productsync.constants.SuperPassStatus;
import app.chalo.features.reportproblem.IReportProblemFeature;
import app.chalo.helper.UrlOpenHelper;
import app.chalo.home.analytics.HomeScreenAnalyticsHelper;
import app.chalo.home.contract.HomeScreenInfoHelper;
import app.chalo.home.data.mappers.BannerStatus;
import app.chalo.home.data.model.app.response.BannerDataResponseAppModel;
import app.chalo.home.data.model.app.response.BannerMetaAppModel;
import app.chalo.home.domain.FetchBannerUseCase;
import app.chalo.home.domain.FetchPremiumPassSavingsUseCase;
import app.chalo.home.domain.GetChaloPageItemsUseCase;
import app.chalo.home.domain.GetPremiumBusUserMetadataUseCase;
import app.chalo.home.domain.PremiumBusContentConfigUseCase;
import app.chalo.home.domain.PremiumBusUserMetadata;
import app.chalo.home.ui.HomeTabScreensNavigationAndStateManager;
import app.chalo.home.ui.HomeTabScreensRetainedState;
import app.chalo.home.ui.base.HomeTabVisibilityController;
import app.chalo.home.ui.chalobus.ChaloBusViewState;
import app.chalo.home.ui.chalobus.SelectedDateAndTime;
import app.chalo.homescreen.data.model.app.BottomNavTabType;
import app.chalo.homescreen.data.model.app.TabMetaDataAppModel;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.navigation.ProductBookingNavigationManager;
import app.chalo.network.config.ChaloJson;
import app.chalo.premiumbus.PremiumBusProductPurchaseFlowType;
import app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModel;
import app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel;
import app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModelKt;
import app.chalo.premiumbus.data.models.app.PremiumBusSelectedLocationType;
import app.chalo.premiumbus.domain.GetRecentAndFlippedOriginDestinationPairsUseCase;
import app.chalo.premiumbus.domain.PricingEngineRuleExpiryCountdownController;
import app.chalo.premiumbus.domain.PricingEngineRuleExpiryTickerDelegate;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionDateAndTimePickerUIState;
import app.chalo.productbooking.common.data.models.api.response.ProductConfigCompleteDetailsApiResponseModel;
import app.chalo.productbooking.common.domain.FetchCompleteProductConfigByIdUseCase;
import app.chalo.productbooking.common.domain.FetchProductConfigsForUiUseCase;
import app.chalo.productbooking.common.domain.StoreCompleteProductConfigLocallyUseCase;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.recent.model.app.RecentPlaceAppModel;
import app.chalo.resultstatemanager.ResultStateData;
import app.chalo.resultstatemanager.universalsearch.UniversalSearchResultState;
import app.chalo.resultstatemanager.universalsearch.UniversalSearchResultStateManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.ChaloBusRouteInfoScreenArgs;
import app.chalo.scenes.args.PassLandingFlowType;
import app.chalo.scenes.args.PremiumBusArgs;
import app.chalo.scenes.args.PremiumBusNotificationArgs;
import app.chalo.scenes.args.PremiumBusProductSelectionConfig;
import app.chalo.scenes.args.PremiumBusTutorialScreenArgs;
import app.chalo.scenes.args.ProductSelectionArgs;
import app.chalo.scenes.args.SavedPlacesAndRidesArgs;
import app.chalo.superpass.data.models.entities.SuperPassSubTypeKt;
import app.chalo.superpass.data.models.entities.SuperPassTripPreferences;
import app.chalo.superpass.data.repository.SuperPassRepository;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.button.ButtonUIStateFactory;
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
import app.chalo.universalsearch.data.UniversalSearchFlowSource;
import app.chalo.universalsearch.data.UniversalSearchOption;
import app.chalo.universalsearch.data.UniversalSearchOptions;
import app.chalo.usecase.FetchCurrentLocationUseCase;
import app.chalo.usecase.FormatTimeInMillisToGivenFormatUseCase;
import app.chalo.usecase.GetPremiumBusCurrentCityConfigUseCase;
import app.chalo.usecase.HandlePremiumPassRenewFlowUseCase;
import app.chalo.usercommutepreference.data.mappers.UserCommutePreferenceApiResponseToAppModelMapperKt;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferencePlaceLocationAppModel;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceSavedRideAppModel;
import app.chalo.usercommutepreference.domain.CheckSaveRideEligibilityUseCase;
import app.chalo.usercommutepreference.domain.DeleteSavedRideUseCase;
import app.chalo.usercommutepreference.domain.FetchSavedRideForODPairUseCase;
import app.chalo.usercommutepreference.domain.SaveOrEditRideUseCase;
import app.chalo.usercommutepreference.domain.SaveRideEligibility;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.utils.KUUID;
import app.chalo.utils.SystemHelper;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.arkivanov.decompose.ComponentContext;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import defpackage.f;
import defpackage.g;
import defpackage.l4;
import defpackage.sg;
import defpackage.tg;
import defpackage.ud;
import defpackage.uf0;
import defpackage.vg;
import defpackage.vo1;
import defpackage.we;
import defpackage.wg;
import defpackage.xg;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.datetime.Clock;
import kotlinx.datetime.LocalDateTime;
import kotlinx.datetime.TimeZone;
import kotlinx.datetime.TimeZoneKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/home/ui/chalobus/ChaloBusComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewState;", "Lapp/chalo/home/ui/chalobus/ChaloBusDataState;", "Lapp/chalo/home/ui/chalobus/ChaloBusSideEffect;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloBusComponent extends ChaloBaseStateMviComponent<ChaloBusViewIntent, ChaloBusViewState, ChaloBusViewState, ChaloBusSideEffect> {
    public final KotlinToastManager A;
    public final FetchPremiumPassSavingsUseCase B;
    public final BottomNavTabType C;
    public final SuperPassRepository D;
    public final FetchBannerUseCase E;
    public final HandlePremiumPassRenewFlowUseCase F;
    public final FormatTimeInMillisToGivenFormatUseCase G;
    public final FetchProductConfigsForUiUseCase H;
    public final FetchCompleteProductConfigByIdUseCase I;
    public final StoreCompleteProductConfigLocallyUseCase J;
    public final ProductBookingNavigationManager K;
    public final LocalDataStore L;
    public final PremiumBusContentConfigUseCase M;
    public final UrlOpenHelper N;
    public final CheckSaveRideEligibilityUseCase O;
    public final FetchSavedRideForODPairUseCase P;
    public final GetPremiumBusUserMetadataUseCase Q;
    public final SaveOrEditRideUseCase R;
    public final DeleteSavedRideUseCase S;
    public final PricingEngineRuleExpiryTickerDelegate T;
    public PremiumBusNativeCityWiseConfigAppModel U;
    public boolean V;
    public Job W;
    public Job X;
    public Job Y;
    public Job Z;
    public Job a0;
    public Job b0;
    public Job c0;
    public Job d0;
    public Job e0;
    public boolean f0;
    public boolean g0;
    public int h0;
    public boolean i0;
    public boolean j0;
    public final GetChaloPageItemsUseCase k;
    public final Flow k0;
    public final GetPremiumBusCurrentCityConfigUseCase l;
    public Map l0;
    public final GetRecentAndFlippedOriginDestinationPairsUseCase m;
    public Job m0;
    public final FetchCurrentLocationUseCase n;
    public final MutableStateFlow n0;
    public final UserProfileDetailsProvider o;
    public final StateFlow o0;
    public final CityProvider p;
    public final HomeScreenInfoHelper q;
    public final HomeScreenAnalyticsHelper r;
    public final StringProvider s;
    public final ChaloNavigationManager t;
    public final HomeTabScreensNavigationAndStateManager u;
    public final UniversalSearchResultStateManager v;
    public final IReportProblemFeature w;
    public final TimeUtilsContract x;
    public final BasicInfoContract y;
    public final SystemHelper z;

    /* JADX INFO: renamed from: app.chalo.home.ui.chalobus.ChaloBusComponent$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.home.ui.chalobus.ChaloBusComponent$1", f = "ChaloBusComponent.kt", l = {234}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ChaloBusComponent.this.new AnonymousClass1(continuation);
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
                StateFlow state = ChaloBusComponent.this.u.getState();
                final ChaloBusComponent chaloBusComponent = ChaloBusComponent.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.home.ui.chalobus.ChaloBusComponent.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        Object value;
                        HomeTabScreensRetainedState homeTabScreensRetainedState = (HomeTabScreensRetainedState) obj2;
                        xg xgVar = new xg(homeTabScreensRetainedState, 0);
                        ChaloBusComponent chaloBusComponent2 = chaloBusComponent;
                        chaloBusComponent2.E0(xgVar);
                        Integer num = (Integer) homeTabScreensRetainedState.g.get(chaloBusComponent2.C);
                        int iIntValue = num != null ? num.intValue() : 0;
                        if (iIntValue != chaloBusComponent2.h0) {
                            chaloBusComponent2.h0 = iIntValue;
                            chaloBusComponent2.V = true;
                            chaloBusComponent2.i0 = true;
                            MutableStateFlow mutableStateFlow = chaloBusComponent2.n0;
                            do {
                                value = mutableStateFlow.getValue();
                            } while (!mutableStateFlow.c(value, Integer.valueOf(((Number) value).intValue() + 1)));
                            if (chaloBusComponent2.f0) {
                                chaloBusComponent2.i0 = false;
                                chaloBusComponent2.Z0(ChaloBusViewIntent.ChaloBusScreenStopIntent.f3263a);
                                chaloBusComponent2.Z0(ChaloBusViewIntent.ChaloBusScreenViewStartedIntent.f3264a);
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

    /* JADX INFO: renamed from: app.chalo.home.ui.chalobus.ChaloBusComponent$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.home.ui.chalobus.ChaloBusComponent$2", f = "ChaloBusComponent.kt", l = {249}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ChaloBusComponent.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ChaloBusComponent chaloBusComponent;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                ChaloBusComponent chaloBusComponent2 = ChaloBusComponent.this;
                GetPremiumBusCurrentCityConfigUseCase getPremiumBusCurrentCityConfigUseCase = chaloBusComponent2.l;
                this.L$0 = chaloBusComponent2;
                this.label = 1;
                Object objA = getPremiumBusCurrentCityConfigUseCase.a(this);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
                chaloBusComponent = chaloBusComponent2;
                obj = objA;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                chaloBusComponent = (ChaloBusComponent) this.L$0;
                ResultKt.b(obj);
            }
            chaloBusComponent.U = (PremiumBusNativeCityWiseConfigAppModel) obj;
            return Unit.f17538a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\u000b"}, d2 = {"Lapp/chalo/home/ui/chalobus/ChaloBusComponent$Companion;", "", "", "RECENT_OD_PAIRS_LIMIT", "I", "", "THOUSAND_THRESHOLD", "D", "LAKH_THRESHOLD", "PRODUCT_PURCHASE_NUDGE_CARD_LIMIT", "TUTORIAL_LIST_DEFAULT_SIZE", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3235a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;
        public static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[ProductPurchaseNudgeUiStatus.values().length];
            try {
                iArr[ProductPurchaseNudgeUiStatus.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductPurchaseNudgeUiStatus.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProductPurchaseNudgeUiStatus.DEFAULT_NUDGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProductPurchaseNudgeUiStatus.PRODUCT_PURCHASE_NUDGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f3235a = iArr;
            int[] iArr2 = new int[PBStopSearchSource.values().length];
            try {
                iArr2[PBStopSearchSource.FROM_STOP_SEARCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[PBStopSearchSource.FROM_STOP_SUGGESTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PBStopSearchSource.TO_STOP_SEARCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[PBStopSearchSource.TO_STOP_SUGGESTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            b = iArr2;
            int[] iArr3 = new int[BannerStatus.values().length];
            try {
                iArr3[BannerStatus.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[BannerStatus.IN_PROCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[BannerStatus.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[BannerStatus.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            c = iArr3;
            int[] iArr4 = new int[SuperPassStatus.values().length];
            try {
                iArr4[SuperPassStatus.USED.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[SuperPassStatus.UNUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[SuperPassStatus.EXPIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[SuperPassStatus.PAYMENT_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[SuperPassStatus.PAYMENT_PROCESSING.ordinal()] = 5;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[SuperPassStatus.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[SuperPassStatus.FAILED.ordinal()] = 7;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[SuperPassStatus.INACTIVE.ordinal()] = 8;
            } catch (NoSuchFieldError unused20) {
            }
            d = iArr4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloBusComponent(ComponentContext componentContext, GetChaloPageItemsUseCase getChaloPageItemsUseCase, GetPremiumBusCurrentCityConfigUseCase getPremiumBusCurrentCityConfigUseCase, GetRecentAndFlippedOriginDestinationPairsUseCase getRecentAndFlippedOriginDestinationPairsUseCase, FetchCurrentLocationUseCase fetchCurrentLocationUseCase, UserProfileDetailsProvider userProfileDetailsProvider, CityProvider cityProvider, HomeScreenInfoHelper homeScreenInfoHelper, HomeScreenAnalyticsHelper homeScreenAnalyticsHelper, StringProvider stringProvider, ChaloNavigationManager chaloNavigationManager, HomeTabScreensNavigationAndStateManager homeTabScreensNavigationAndStateManager, UniversalSearchResultStateManager universalSearchResultStateManager, IReportProblemFeature iReportProblemFeature, TimeUtilsContract timeUtilsContract, BasicInfoContract basicInfoContract, SystemHelper systemHelper, KotlinToastManager kotlinToastManager, FetchPremiumPassSavingsUseCase fetchPremiumPassSavingsUseCase, HomeTabVisibilityController homeTabVisibilityController, BottomNavTabType tabType, SuperPassRepository superPassRepository, FetchBannerUseCase fetchBannerUseCase, HandlePremiumPassRenewFlowUseCase handlePremiumPassRenewFlowUseCase, FormatTimeInMillisToGivenFormatUseCase formatTimeInMillisToGivenFormatUseCase, FetchProductConfigsForUiUseCase fetchProductConfigsForUiUseCase, FetchCompleteProductConfigByIdUseCase fetchCompleteProductConfigByIdUseCase, StoreCompleteProductConfigLocallyUseCase storeCompleteProductConfigLocallyUseCase, ProductBookingNavigationManager productBookingNavigationManager, LocalDataStore localDataStore, PremiumBusContentConfigUseCase premiumBusContentConfigUseCase, UrlOpenHelper urlOpenHelper, CheckSaveRideEligibilityUseCase checkSaveRideEligibilityUseCase, FetchSavedRideForODPairUseCase fetchSavedRideForODPairUseCase, GetPremiumBusUserMetadataUseCase getPremiumBusUserMetadataUseCase, SaveOrEditRideUseCase saveOrEditRideUseCase, DeleteSavedRideUseCase deleteSavedRideUseCase, PricingEngineRuleExpiryTickerDelegate pricingEngineRuleExpiryTickerDelegate) {
        super(componentContext);
        Intrinsics.i(componentContext, "componentContext");
        Intrinsics.i(homeTabVisibilityController, "homeTabVisibilityController");
        Intrinsics.i(tabType, "tabType");
        this.k = getChaloPageItemsUseCase;
        this.l = getPremiumBusCurrentCityConfigUseCase;
        this.m = getRecentAndFlippedOriginDestinationPairsUseCase;
        this.n = fetchCurrentLocationUseCase;
        this.o = userProfileDetailsProvider;
        this.p = cityProvider;
        this.q = homeScreenInfoHelper;
        this.r = homeScreenAnalyticsHelper;
        this.s = stringProvider;
        this.t = chaloNavigationManager;
        this.u = homeTabScreensNavigationAndStateManager;
        this.v = universalSearchResultStateManager;
        this.w = iReportProblemFeature;
        this.x = timeUtilsContract;
        this.y = basicInfoContract;
        this.z = systemHelper;
        this.A = kotlinToastManager;
        this.B = fetchPremiumPassSavingsUseCase;
        this.C = tabType;
        this.D = superPassRepository;
        this.E = fetchBannerUseCase;
        this.F = handlePremiumPassRenewFlowUseCase;
        this.G = formatTimeInMillisToGivenFormatUseCase;
        this.H = fetchProductConfigsForUiUseCase;
        this.I = fetchCompleteProductConfigByIdUseCase;
        this.J = storeCompleteProductConfigLocallyUseCase;
        this.K = productBookingNavigationManager;
        this.L = localDataStore;
        this.M = premiumBusContentConfigUseCase;
        this.N = urlOpenHelper;
        this.O = checkSaveRideEligibilityUseCase;
        this.P = fetchSavedRideForODPairUseCase;
        this.Q = getPremiumBusUserMetadataUseCase;
        this.R = saveOrEditRideUseCase;
        this.S = deleteSavedRideUseCase;
        this.T = pricingEngineRuleExpiryTickerDelegate;
        this.V = true;
        this.k0 = homeTabVisibilityController.a(tabType);
        this.l0 = MapsKt.d();
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(0);
        this.n0 = mutableStateFlowA;
        this.o0 = FlowKt.c(mutableStateFlowA);
        Job job = this.b0;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        this.b0 = BuildersKt.d(this.j, null, null, new ChaloBusComponent$observeTabVisibility$1(this, null), 3);
        BuildersKt.d(this.j, null, null, new ChaloBusComponent$observeLoginStateChanges$1(this, null), 3);
        BuildersKt.d(this.j, null, null, new AnonymousClass1(null), 3);
        BuildersKt.d(this.j, null, null, new AnonymousClass2(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object F0(ChaloBusComponent chaloBusComponent, ContinuationImpl continuationImpl) {
        ChaloBusComponent$checkIfUserHaveAnyTicketsOrPassesAndUpdateState$1 chaloBusComponent$checkIfUserHaveAnyTicketsOrPassesAndUpdateState$1;
        chaloBusComponent.getClass();
        if (continuationImpl instanceof ChaloBusComponent$checkIfUserHaveAnyTicketsOrPassesAndUpdateState$1) {
            chaloBusComponent$checkIfUserHaveAnyTicketsOrPassesAndUpdateState$1 = (ChaloBusComponent$checkIfUserHaveAnyTicketsOrPassesAndUpdateState$1) continuationImpl;
            int i = chaloBusComponent$checkIfUserHaveAnyTicketsOrPassesAndUpdateState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloBusComponent$checkIfUserHaveAnyTicketsOrPassesAndUpdateState$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloBusComponent$checkIfUserHaveAnyTicketsOrPassesAndUpdateState$1 = new ChaloBusComponent$checkIfUserHaveAnyTicketsOrPassesAndUpdateState$1(chaloBusComponent, continuationImpl);
            }
        } else {
            chaloBusComponent$checkIfUserHaveAnyTicketsOrPassesAndUpdateState$1 = new ChaloBusComponent$checkIfUserHaveAnyTicketsOrPassesAndUpdateState$1(chaloBusComponent, continuationImpl);
        }
        Object objA = chaloBusComponent$checkIfUserHaveAnyTicketsOrPassesAndUpdateState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloBusComponent$checkIfUserHaveAnyTicketsOrPassesAndUpdateState$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            GetPremiumBusUserMetadataUseCase getPremiumBusUserMetadataUseCase = chaloBusComponent.Q;
            chaloBusComponent$checkIfUserHaveAnyTicketsOrPassesAndUpdateState$1.label = 1;
            objA = getPremiumBusUserMetadataUseCase.a(chaloBusComponent$checkIfUserHaveAnyTicketsOrPassesAndUpdateState$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        chaloBusComponent.E0(new g((PremiumBusUserMetadata) objA, 29));
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:37:0x011f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0124  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public static final Object G0(ChaloBusComponent chaloBusComponent, String str, String str2, String str3, String str4, long j, ContinuationImpl continuationImpl) {
        ChaloBusComponent$checkRidePreferenceForODPair$1 chaloBusComponent$checkRidePreferenceForODPair$1;
        RidePreferenceCheckResult ridePreferenceCheckResult;
        String str5;
        String str6;
        String str7;
        String str8;
        RidePreferenceCheckResult ridePreferenceCheckResult2;
        RidePreferenceCheckResult ridePreferenceCheckResult3;
        ChaloUseCaseResult chaloUseCaseResult;
        UserCommutePreferenceSavedRideAppModel userCommutePreferenceSavedRideAppModel;
        TimeUtilsContract timeUtilsContract = chaloBusComponent.x;
        if (continuationImpl instanceof ChaloBusComponent$checkRidePreferenceForODPair$1) {
            chaloBusComponent$checkRidePreferenceForODPair$1 = (ChaloBusComponent$checkRidePreferenceForODPair$1) continuationImpl;
            int i = chaloBusComponent$checkRidePreferenceForODPair$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloBusComponent$checkRidePreferenceForODPair$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloBusComponent$checkRidePreferenceForODPair$1 = new ChaloBusComponent$checkRidePreferenceForODPair$1(chaloBusComponent, continuationImpl);
            }
        } else {
            chaloBusComponent$checkRidePreferenceForODPair$1 = new ChaloBusComponent$checkRidePreferenceForODPair$1(chaloBusComponent, continuationImpl);
        }
        ChaloBusComponent$checkRidePreferenceForODPair$1 chaloBusComponent$checkRidePreferenceForODPair$2 = chaloBusComponent$checkRidePreferenceForODPair$1;
        Object objB = chaloBusComponent$checkRidePreferenceForODPair$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloBusComponent$checkRidePreferenceForODPair$2.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            ridePreferenceCheckResult = new RidePreferenceCheckResult(RidePreferenceBannerState.Hidden.f3301a, null, null, null, null, null);
            CheckSaveRideEligibilityUseCase checkSaveRideEligibilityUseCase = chaloBusComponent.O;
            chaloBusComponent$checkRidePreferenceForODPair$2.L$0 = str;
            chaloBusComponent$checkRidePreferenceForODPair$2.L$1 = str2;
            str5 = str3;
            chaloBusComponent$checkRidePreferenceForODPair$2.L$2 = str5;
            str6 = str4;
            chaloBusComponent$checkRidePreferenceForODPair$2.L$3 = str6;
            chaloBusComponent$checkRidePreferenceForODPair$2.L$4 = ridePreferenceCheckResult;
            chaloBusComponent$checkRidePreferenceForODPair$2.label = 1;
            objB = checkSaveRideEligibilityUseCase.b(str, str2, j, chaloBusComponent$checkRidePreferenceForODPair$2);
            if (objB != coroutineSingletons) {
                str7 = str;
                str8 = str2;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            RidePreferenceCheckResult ridePreferenceCheckResult4 = (RidePreferenceCheckResult) chaloBusComponent$checkRidePreferenceForODPair$2.L$4;
            String str9 = (String) chaloBusComponent$checkRidePreferenceForODPair$2.L$3;
            String str10 = (String) chaloBusComponent$checkRidePreferenceForODPair$2.L$2;
            str8 = (String) chaloBusComponent$checkRidePreferenceForODPair$2.L$1;
            str7 = (String) chaloBusComponent$checkRidePreferenceForODPair$2.L$0;
            ResultKt.b(objB);
            ridePreferenceCheckResult = ridePreferenceCheckResult4;
            str6 = str9;
            str5 = str10;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ridePreferenceCheckResult3 = (RidePreferenceCheckResult) chaloBusComponent$checkRidePreferenceForODPair$2.L$0;
            ResultKt.b(objB);
        }
        chaloUseCaseResult = (ChaloUseCaseResult) objB;
        JobKt.e(chaloBusComponent$checkRidePreferenceForODPair$2.getContext());
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            userCommutePreferenceSavedRideAppModel = (UserCommutePreferenceSavedRideAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
            if (userCommutePreferenceSavedRideAppModel != null) {
                Pair pairF = timeUtilsContract.F(userCommutePreferenceSavedRideAppModel.d);
                int iIntValue = ((Number) pairF.getFirst()).intValue();
                int iC = timeUtilsContract.C(((Number) pairF.getSecond()).intValue());
                long jF = timeUtilsContract.f(iIntValue, iC);
                Integer num = new Integer(iIntValue);
                Integer num2 = new Integer(iC);
                Long l = new Long(jF);
                String str11 = userCommutePreferenceSavedRideAppModel.f10252a;
                ridePreferenceCheckResult2 = new RidePreferenceCheckResult(RidePreferenceBannerState.TimeAutoSet.f3303a, num, num2, l, str11, str11);
                return ridePreferenceCheckResult2;
            }
        } else if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
            throw new NoWhenBranchMatchedException();
        }
        return ridePreferenceCheckResult3;
        ChaloUseCaseResult chaloUseCaseResult2 = (ChaloUseCaseResult) objB;
        JobKt.e(chaloBusComponent$checkRidePreferenceForODPair$2.getContext());
        if (chaloUseCaseResult2 instanceof ChaloUseCaseResult.Success) {
            SaveRideEligibility saveRideEligibility = (SaveRideEligibility) ((ChaloUseCaseResult.Success) chaloUseCaseResult2).f10419a;
            if (saveRideEligibility.b) {
                FetchSavedRideForODPairUseCase fetchSavedRideForODPairUseCase = chaloBusComponent.P;
                chaloBusComponent$checkRidePreferenceForODPair$2.L$0 = ridePreferenceCheckResult;
                chaloBusComponent$checkRidePreferenceForODPair$2.L$1 = null;
                chaloBusComponent$checkRidePreferenceForODPair$2.L$2 = null;
                chaloBusComponent$checkRidePreferenceForODPair$2.L$3 = null;
                chaloBusComponent$checkRidePreferenceForODPair$2.L$4 = null;
                chaloBusComponent$checkRidePreferenceForODPair$2.label = 2;
                objB = fetchSavedRideForODPairUseCase.a(str7, str8, chaloBusComponent$checkRidePreferenceForODPair$2);
                if (objB != coroutineSingletons) {
                    ridePreferenceCheckResult3 = ridePreferenceCheckResult;
                    chaloUseCaseResult = (ChaloUseCaseResult) objB;
                    JobKt.e(chaloBusComponent$checkRidePreferenceForODPair$2.getContext());
                    if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                        userCommutePreferenceSavedRideAppModel = (UserCommutePreferenceSavedRideAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                        if (userCommutePreferenceSavedRideAppModel != null) {
                            Pair pairF2 = timeUtilsContract.F(userCommutePreferenceSavedRideAppModel.d);
                            int iIntValue2 = ((Number) pairF2.getFirst()).intValue();
                            int iC2 = timeUtilsContract.C(((Number) pairF2.getSecond()).intValue());
                            long jF2 = timeUtilsContract.f(iIntValue2, iC2);
                            Integer num3 = new Integer(iIntValue2);
                            Integer num4 = new Integer(iC2);
                            Long l2 = new Long(jF2);
                            String str12 = userCommutePreferenceSavedRideAppModel.f10252a;
                            ridePreferenceCheckResult2 = new RidePreferenceCheckResult(RidePreferenceBannerState.TimeAutoSet.f3303a, num3, num4, l2, str12, str12);
                        }
                    } else if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return ridePreferenceCheckResult3;
                }
                return coroutineSingletons;
            }
            if (saveRideEligibility.f10294a) {
                Long l3 = saveRideEligibility.c;
                long jLongValue = l3 != null ? l3.longValue() : 0L;
                ridePreferenceCheckResult2 = new RidePreferenceCheckResult(new RidePreferenceBannerState.SaveRideEligible(false, str5, str6, timeUtilsContract.l(jLongValue), jLongValue), null, null, null, null, null);
            }
            return ridePreferenceCheckResult2;
        }
        if (!(chaloUseCaseResult2 instanceof ChaloUseCaseResult.Failure)) {
            throw new NoWhenBranchMatchedException();
        }
        return ridePreferenceCheckResult;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object H0(ChaloBusComponent chaloBusComponent, String str, PBStopSearchSource pBStopSearchSource, ContinuationImpl continuationImpl) {
        ChaloBusComponent$collectUniversalSearchResult$1 chaloBusComponent$collectUniversalSearchResult$1;
        Object objB;
        Object objB2;
        chaloBusComponent.getClass();
        if (continuationImpl instanceof ChaloBusComponent$collectUniversalSearchResult$1) {
            chaloBusComponent$collectUniversalSearchResult$1 = (ChaloBusComponent$collectUniversalSearchResult$1) continuationImpl;
            int i = chaloBusComponent$collectUniversalSearchResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloBusComponent$collectUniversalSearchResult$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloBusComponent$collectUniversalSearchResult$1 = new ChaloBusComponent$collectUniversalSearchResult$1(chaloBusComponent, continuationImpl);
            }
        } else {
            chaloBusComponent$collectUniversalSearchResult$1 = new ChaloBusComponent$collectUniversalSearchResult$1(chaloBusComponent, continuationImpl);
        }
        Object objV = chaloBusComponent$collectUniversalSearchResult$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloBusComponent$collectUniversalSearchResult$1.label;
        if (i2 == 0) {
            ResultKt.b(objV);
            Flow flowB = chaloBusComponent.v.b(str);
            chaloBusComponent$collectUniversalSearchResult$1.L$0 = pBStopSearchSource;
            chaloBusComponent$collectUniversalSearchResult$1.label = 1;
            objV = chaloBusComponent.b.v(flowB, chaloBusComponent$collectUniversalSearchResult$1);
            if (objV == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pBStopSearchSource = (PBStopSearchSource) chaloBusComponent$collectUniversalSearchResult$1.L$0;
            ResultKt.b(objV);
        }
        ResultStateData resultStateData = (ResultStateData) objV;
        boolean z = resultStateData instanceof ResultStateData.Cancelled;
        Unit unit = Unit.f17538a;
        if (z) {
            return unit;
        }
        if (!(resultStateData instanceof ResultStateData.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        UniversalSearchResultState universalSearchResultState = (UniversalSearchResultState) ((ResultStateData.Success) resultStateData).f9039a;
        String str2 = universalSearchResultState.f9060a;
        String str3 = universalSearchResultState.b;
        if (str2 != null && str2.length() != 0) {
            try {
                Json json = ChaloJson.b;
                json.getClass();
                objB2 = json.b(str2, StopAppModel.INSTANCE.serializer());
            } catch (Exception unused) {
                objB2 = null;
            }
            StopAppModel stopAppModel = (StopAppModel) objB2;
            if (stopAppModel != null) {
                chaloBusComponent.Z0(new ChaloBusViewIntent.StopSelectionFieldResultIntent(PBStopPlaceSelectedAppModelKt.a(stopAppModel), pBStopSearchSource));
            }
        } else if (str3 != null && str3.length() != 0) {
            try {
                Json json2 = ChaloJson.b;
                json2.getClass();
                objB = json2.b(str3, RecentPlaceAppModel.INSTANCE.serializer());
            } catch (Exception unused2) {
                objB = null;
            }
            RecentPlaceAppModel recentPlaceAppModel = (RecentPlaceAppModel) objB;
            if (recentPlaceAppModel != null) {
                chaloBusComponent.Z0(new ChaloBusViewIntent.StopSelectionFieldResultIntent(PBStopPlaceSelectedAppModelKt.b(recentPlaceAppModel), pBStopSearchSource));
            }
        }
        Job job = chaloBusComponent.m0;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        chaloBusComponent.m0 = null;
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0164  */
    /* JADX WARN: Code duplicated, block: B:33:0x0190  */
    /* JADX WARN: Code duplicated, block: B:37:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:41:0x022f  */
    /* JADX WARN: Code duplicated, block: B:45:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
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
    public static final Object I0(ChaloBusComponent chaloBusComponent, int i, int i2, String str, ContinuationImpl continuationImpl) {
        ChaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1 chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1;
        int i3;
        String str2;
        int i4;
        TextUIState.ChaloTextUIState chaloTextUIState;
        String str3;
        ChaloTextStyleHelper chaloTextStyleHelper;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        String str4;
        TextUIState.ChaloTextUIState chaloTextUIStateF;
        Object objB;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        TextUIState.ChaloTextUIState chaloTextUIState4;
        ChaloTextStyleHelper chaloTextStyleHelper2;
        int i5;
        String str5;
        TextUIState.ChaloTextUIState chaloTextUIState5;
        TextUIState.ChaloTextUIState chaloTextUIState6;
        TextUIState.ChaloTextUIState chaloTextUIStateF2;
        UIShape.Rectangle rectangle;
        Object objB2;
        TextUIState.ChaloTextUIState chaloTextUIState7;
        int i6;
        TextUIState.ChaloTextUIState chaloTextUIState8;
        ButtonUIStateFactory buttonUIStateFactory;
        ChaloTextStyleHelper chaloTextStyleHelper3;
        TextUIState.ChaloTextUIState chaloTextUIState9;
        TextUIState.ChaloTextUIState chaloTextUIState10;
        TextUIState.ChaloTextUIState chaloTextUIState11;
        ChaloBusComponent chaloBusComponent2;
        ButtonUIState buttonUIStateF;
        Object objB3;
        CoroutineSingletons coroutineSingletons;
        ButtonUIStateFactory buttonUIStateFactory2;
        String str6;
        int i7;
        ButtonUIState buttonUIState;
        TextUIState.ChaloTextUIState chaloTextUIState12;
        TextUIState.ChaloTextUIState chaloTextUIState13;
        TextUIState.ChaloTextUIState chaloTextUIState14;
        int i8;
        ChaloColorToken.Black black;
        ButtonUIState buttonUIStateD;
        UiEventHandler uiEventHandlerA;
        IconType iconType;
        ImageUISize imageUISize;
        CoroutineSingletons coroutineSingletons2;
        Object objB4;
        IconType iconType2;
        TextUIState.ChaloTextUIState chaloTextUIState15;
        int i9;
        ImageUISize imageUISize2;
        TextUIState.ChaloTextUIState chaloTextUIState16;
        TextUIState.ChaloTextUIState chaloTextUIState17;
        String str7;
        int i10;
        StringProvider stringProvider = chaloBusComponent.s;
        if (continuationImpl instanceof ChaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1) {
            chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1 = (ChaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1) continuationImpl;
            int i11 = chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.label = i11 - Integer.MIN_VALUE;
            } else {
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1 = new ChaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1(chaloBusComponent, continuationImpl);
            }
        } else {
            chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1 = new ChaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1(chaloBusComponent, continuationImpl);
        }
        Object objB5 = chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.result;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.label;
        ButtonUIStateFactory buttonUIStateFactory3 = ButtonUIStateFactory.f9921a;
        ChaloTextStyleHelper chaloTextStyleHelper4 = ChaloTextStyleHelper.f10078a;
        switch (i12) {
            case 0:
                ResultKt.b(objB5);
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0 = str;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0 = i;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1 = i2;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.label = 1;
                objB5 = stringProvider.b(StringEnum.WHEN_DO_YOU_WANT_THIS_RIDE, new Object[0], chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1);
                if (objB5 != coroutineSingletons3) {
                    i3 = i;
                    str2 = str;
                    i4 = i2;
                    chaloTextUIState = new TextUIState.ChaloTextUIState((String) objB5, UITextStyle.DisplaySmall, (ChaloColorToken) null, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8124);
                    chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0 = str2;
                    chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$1 = chaloTextUIState;
                    chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$2 = chaloTextStyleHelper4;
                    chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0 = i3;
                    chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1 = i4;
                    chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.label = 2;
                    objB5 = stringProvider.b(StringEnum.SELECT_DATE, new Object[0], chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1);
                    if (objB5 != coroutineSingletons3) {
                        str3 = str2;
                        chaloTextStyleHelper = chaloTextStyleHelper4;
                        chaloTextUIState2 = chaloTextUIState;
                        str4 = str3;
                        chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper, (String) objB5, null, UIFontWeight.Bold, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                        chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0 = str4;
                        chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$1 = chaloTextUIState2;
                        chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$2 = chaloTextUIStateF;
                        chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$3 = chaloTextStyleHelper4;
                        chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0 = i3;
                        chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1 = i4;
                        chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.label = 3;
                        objB = stringProvider.b(StringEnum.SELECT_TIME, new Object[0], chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1);
                        if (objB != coroutineSingletons3) {
                            chaloTextUIState3 = chaloTextUIStateF;
                            chaloTextUIState4 = chaloTextUIState2;
                            chaloTextStyleHelper2 = chaloTextStyleHelper4;
                            i5 = i3;
                            str5 = str4;
                            objB5 = objB;
                            chaloTextUIState5 = chaloTextUIState3;
                            chaloTextUIState6 = chaloTextUIState4;
                            chaloTextUIStateF2 = ChaloTextStyleHelper.f(chaloTextStyleHelper2, (String) objB5, null, UIFontWeight.Bold, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                            rectangle = UIShape.e;
                            chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0 = str5;
                            chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$1 = chaloTextUIState6;
                            chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$2 = chaloTextUIState5;
                            chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$3 = chaloTextUIStateF2;
                            chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$4 = buttonUIStateFactory3;
                            chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$5 = rectangle;
                            chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$6 = chaloTextStyleHelper4;
                            chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0 = i5;
                            chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1 = i4;
                            chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.label = 4;
                            objB2 = stringProvider.b(StringEnum.CONTINUE, new Object[0], chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1);
                            if (objB2 != coroutineSingletons3) {
                                int i13 = i5;
                                chaloTextUIState7 = chaloTextUIState6;
                                objB5 = objB2;
                                i6 = i13;
                                chaloTextUIState8 = chaloTextUIState5;
                                buttonUIStateFactory = buttonUIStateFactory3;
                                chaloTextStyleHelper3 = chaloTextStyleHelper4;
                                UIShape.Rectangle rectangle2 = rectangle;
                                chaloTextUIState9 = chaloTextUIStateF2;
                                chaloTextUIState10 = chaloTextUIState8;
                                chaloTextUIState11 = chaloTextUIState7;
                                chaloBusComponent2 = chaloBusComponent;
                                buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory, ChaloTextStyleHelper.g(chaloTextStyleHelper3, (String) objB5, ChaloColorToken.White.f9870a, null, null, null, null, 124), new sg(chaloBusComponent, 0), rectangle2, false, 0.0f, 52);
                                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0 = str5;
                                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$1 = chaloTextUIState11;
                                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$2 = chaloTextUIState10;
                                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$3 = chaloTextUIState9;
                                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$4 = buttonUIStateF;
                                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$5 = buttonUIStateFactory3;
                                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$6 = chaloTextStyleHelper4;
                                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0 = i6;
                                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1 = i4;
                                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.label = 5;
                                objB3 = stringProvider.b(StringEnum.CANCEL, new Object[0], chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1);
                                coroutineSingletons = coroutineSingletons3;
                                if (objB3 == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                buttonUIStateFactory2 = buttonUIStateFactory3;
                                str6 = str5;
                                i7 = i6;
                                buttonUIState = buttonUIStateF;
                                chaloTextUIState12 = chaloTextUIState9;
                                chaloTextUIState13 = chaloTextUIState11;
                                objB5 = objB3;
                                chaloTextUIState14 = chaloTextUIState10;
                                ChaloTextStyleHelper chaloTextStyleHelper5 = chaloTextStyleHelper4;
                                i8 = i4;
                                ChaloColorToken.Black black2 = ChaloColorToken.Black.f9759a;
                                black = black2;
                                buttonUIStateD = ButtonUIStateFactory.d(buttonUIStateFactory2, ChaloTextStyleHelper.g(chaloTextStyleHelper5, (String) objB5, black2, null, null, null, null, 124), new sg(chaloBusComponent2, 1), UIShape.e, false, 52);
                                uiEventHandlerA = UiEventHandler.Companion.a(new sg(chaloBusComponent2, 2));
                                iconType = IconType.IC_RED_CROSS;
                                imageUISize = new ImageUISize(ChaloThemeHelper.a().i);
                                coroutineSingletons2 = coroutineSingletons;
                                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0 = str6;
                                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$1 = chaloTextUIState13;
                                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$2 = chaloTextUIState14;
                                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$3 = chaloTextUIState12;
                                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$4 = buttonUIState;
                                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$5 = buttonUIStateD;
                                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$6 = uiEventHandlerA;
                                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$7 = iconType;
                                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$8 = black;
                                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$9 = imageUISize;
                                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0 = i7;
                                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1 = i8;
                                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.label = 6;
                                objB4 = stringProvider.b(StringEnum.CROSS_TO_CLOSE, new Object[0], chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1);
                                if (objB4 == coroutineSingletons2) {
                                    return coroutineSingletons2;
                                }
                                iconType2 = iconType;
                                chaloTextUIState15 = chaloTextUIState13;
                                i9 = i7;
                                imageUISize2 = imageUISize;
                                chaloTextUIState16 = chaloTextUIState12;
                                chaloTextUIState17 = chaloTextUIState14;
                                str7 = str6;
                                i10 = i8;
                                objB5 = objB4;
                                return new PremiumBusSlotSelectionDateAndTimePickerUIState(i9, i10, str7, chaloTextUIState15, chaloTextUIState17, chaloTextUIState16, buttonUIState, buttonUIStateD, new ImageUIState(iconType2, (String) objB5, black, imageUISize2, (UIContentScale) null, 0.0f, uiEventHandlerA, 112), 8);
                            }
                        }
                    }
                }
                return coroutineSingletons3;
            case 1:
                i4 = chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1;
                i3 = chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0;
                str2 = (String) chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0;
                ResultKt.b(objB5);
                chaloTextUIState = new TextUIState.ChaloTextUIState((String) objB5, UITextStyle.DisplaySmall, (ChaloColorToken) null, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8124);
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0 = str2;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$1 = chaloTextUIState;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$2 = chaloTextStyleHelper4;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0 = i3;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1 = i4;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.label = 2;
                objB5 = stringProvider.b(StringEnum.SELECT_DATE, new Object[0], chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1);
                if (objB5 != coroutineSingletons3) {
                    str3 = str2;
                    chaloTextStyleHelper = chaloTextStyleHelper4;
                    chaloTextUIState2 = chaloTextUIState;
                    str4 = str3;
                    chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper, (String) objB5, null, UIFontWeight.Bold, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                    chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0 = str4;
                    chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$1 = chaloTextUIState2;
                    chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$2 = chaloTextUIStateF;
                    chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$3 = chaloTextStyleHelper4;
                    chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0 = i3;
                    chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1 = i4;
                    chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.label = 3;
                    objB = stringProvider.b(StringEnum.SELECT_TIME, new Object[0], chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1);
                    if (objB != coroutineSingletons3) {
                        chaloTextUIState3 = chaloTextUIStateF;
                        chaloTextUIState4 = chaloTextUIState2;
                        chaloTextStyleHelper2 = chaloTextStyleHelper4;
                        i5 = i3;
                        str5 = str4;
                        objB5 = objB;
                        chaloTextUIState5 = chaloTextUIState3;
                        chaloTextUIState6 = chaloTextUIState4;
                        chaloTextUIStateF2 = ChaloTextStyleHelper.f(chaloTextStyleHelper2, (String) objB5, null, UIFontWeight.Bold, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                        rectangle = UIShape.e;
                        chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0 = str5;
                        chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$1 = chaloTextUIState6;
                        chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$2 = chaloTextUIState5;
                        chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$3 = chaloTextUIStateF2;
                        chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$4 = buttonUIStateFactory3;
                        chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$5 = rectangle;
                        chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$6 = chaloTextStyleHelper4;
                        chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0 = i5;
                        chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1 = i4;
                        chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.label = 4;
                        objB2 = stringProvider.b(StringEnum.CONTINUE, new Object[0], chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1);
                        if (objB2 != coroutineSingletons3) {
                            int i14 = i5;
                            chaloTextUIState7 = chaloTextUIState6;
                            objB5 = objB2;
                            i6 = i14;
                            chaloTextUIState8 = chaloTextUIState5;
                            buttonUIStateFactory = buttonUIStateFactory3;
                            chaloTextStyleHelper3 = chaloTextStyleHelper4;
                            UIShape.Rectangle rectangle3 = rectangle;
                            chaloTextUIState9 = chaloTextUIStateF2;
                            chaloTextUIState10 = chaloTextUIState8;
                            chaloTextUIState11 = chaloTextUIState7;
                            chaloBusComponent2 = chaloBusComponent;
                            buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory, ChaloTextStyleHelper.g(chaloTextStyleHelper3, (String) objB5, ChaloColorToken.White.f9870a, null, null, null, null, 124), new sg(chaloBusComponent, 0), rectangle3, false, 0.0f, 52);
                            chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0 = str5;
                            chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$1 = chaloTextUIState11;
                            chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$2 = chaloTextUIState10;
                            chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$3 = chaloTextUIState9;
                            chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$4 = buttonUIStateF;
                            chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$5 = buttonUIStateFactory3;
                            chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$6 = chaloTextStyleHelper4;
                            chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0 = i6;
                            chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1 = i4;
                            chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.label = 5;
                            objB3 = stringProvider.b(StringEnum.CANCEL, new Object[0], chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1);
                            coroutineSingletons = coroutineSingletons3;
                            if (objB3 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            buttonUIStateFactory2 = buttonUIStateFactory3;
                            str6 = str5;
                            i7 = i6;
                            buttonUIState = buttonUIStateF;
                            chaloTextUIState12 = chaloTextUIState9;
                            chaloTextUIState13 = chaloTextUIState11;
                            objB5 = objB3;
                            chaloTextUIState14 = chaloTextUIState10;
                            ChaloTextStyleHelper chaloTextStyleHelper6 = chaloTextStyleHelper4;
                            i8 = i4;
                            ChaloColorToken.Black black3 = ChaloColorToken.Black.f9759a;
                            black = black3;
                            buttonUIStateD = ButtonUIStateFactory.d(buttonUIStateFactory2, ChaloTextStyleHelper.g(chaloTextStyleHelper6, (String) objB5, black3, null, null, null, null, 124), new sg(chaloBusComponent2, 1), UIShape.e, false, 52);
                            uiEventHandlerA = UiEventHandler.Companion.a(new sg(chaloBusComponent2, 2));
                            iconType = IconType.IC_RED_CROSS;
                            imageUISize = new ImageUISize(ChaloThemeHelper.a().i);
                            coroutineSingletons2 = coroutineSingletons;
                            chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0 = str6;
                            chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$1 = chaloTextUIState13;
                            chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$2 = chaloTextUIState14;
                            chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$3 = chaloTextUIState12;
                            chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$4 = buttonUIState;
                            chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$5 = buttonUIStateD;
                            chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$6 = uiEventHandlerA;
                            chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$7 = iconType;
                            chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$8 = black;
                            chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$9 = imageUISize;
                            chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0 = i7;
                            chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1 = i8;
                            chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.label = 6;
                            objB4 = stringProvider.b(StringEnum.CROSS_TO_CLOSE, new Object[0], chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1);
                            if (objB4 == coroutineSingletons2) {
                                return coroutineSingletons2;
                            }
                            iconType2 = iconType;
                            chaloTextUIState15 = chaloTextUIState13;
                            i9 = i7;
                            imageUISize2 = imageUISize;
                            chaloTextUIState16 = chaloTextUIState12;
                            chaloTextUIState17 = chaloTextUIState14;
                            str7 = str6;
                            i10 = i8;
                            objB5 = objB4;
                            return new PremiumBusSlotSelectionDateAndTimePickerUIState(i9, i10, str7, chaloTextUIState15, chaloTextUIState17, chaloTextUIState16, buttonUIState, buttonUIStateD, new ImageUIState(iconType2, (String) objB5, black, imageUISize2, (UIContentScale) null, 0.0f, uiEventHandlerA, 112), 8);
                        }
                    }
                }
                return coroutineSingletons3;
            case 2:
                i4 = chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1;
                i3 = chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0;
                chaloTextStyleHelper = (ChaloTextStyleHelper) chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$2;
                chaloTextUIState = (TextUIState.ChaloTextUIState) chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$1;
                str3 = (String) chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0;
                ResultKt.b(objB5);
                chaloTextUIState2 = chaloTextUIState;
                str4 = str3;
                chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper, (String) objB5, null, UIFontWeight.Bold, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0 = str4;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$1 = chaloTextUIState2;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$2 = chaloTextUIStateF;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$3 = chaloTextStyleHelper4;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0 = i3;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1 = i4;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.label = 3;
                objB = stringProvider.b(StringEnum.SELECT_TIME, new Object[0], chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1);
                if (objB != coroutineSingletons3) {
                    chaloTextUIState3 = chaloTextUIStateF;
                    chaloTextUIState4 = chaloTextUIState2;
                    chaloTextStyleHelper2 = chaloTextStyleHelper4;
                    i5 = i3;
                    str5 = str4;
                    objB5 = objB;
                    chaloTextUIState5 = chaloTextUIState3;
                    chaloTextUIState6 = chaloTextUIState4;
                    chaloTextUIStateF2 = ChaloTextStyleHelper.f(chaloTextStyleHelper2, (String) objB5, null, UIFontWeight.Bold, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                    rectangle = UIShape.e;
                    chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0 = str5;
                    chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$1 = chaloTextUIState6;
                    chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$2 = chaloTextUIState5;
                    chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$3 = chaloTextUIStateF2;
                    chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$4 = buttonUIStateFactory3;
                    chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$5 = rectangle;
                    chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$6 = chaloTextStyleHelper4;
                    chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0 = i5;
                    chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1 = i4;
                    chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.label = 4;
                    objB2 = stringProvider.b(StringEnum.CONTINUE, new Object[0], chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1);
                    if (objB2 != coroutineSingletons3) {
                        int i15 = i5;
                        chaloTextUIState7 = chaloTextUIState6;
                        objB5 = objB2;
                        i6 = i15;
                        chaloTextUIState8 = chaloTextUIState5;
                        buttonUIStateFactory = buttonUIStateFactory3;
                        chaloTextStyleHelper3 = chaloTextStyleHelper4;
                        UIShape.Rectangle rectangle4 = rectangle;
                        chaloTextUIState9 = chaloTextUIStateF2;
                        chaloTextUIState10 = chaloTextUIState8;
                        chaloTextUIState11 = chaloTextUIState7;
                        chaloBusComponent2 = chaloBusComponent;
                        buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory, ChaloTextStyleHelper.g(chaloTextStyleHelper3, (String) objB5, ChaloColorToken.White.f9870a, null, null, null, null, 124), new sg(chaloBusComponent, 0), rectangle4, false, 0.0f, 52);
                        chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0 = str5;
                        chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$1 = chaloTextUIState11;
                        chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$2 = chaloTextUIState10;
                        chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$3 = chaloTextUIState9;
                        chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$4 = buttonUIStateF;
                        chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$5 = buttonUIStateFactory3;
                        chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$6 = chaloTextStyleHelper4;
                        chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0 = i6;
                        chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1 = i4;
                        chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.label = 5;
                        objB3 = stringProvider.b(StringEnum.CANCEL, new Object[0], chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1);
                        coroutineSingletons = coroutineSingletons3;
                        if (objB3 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        buttonUIStateFactory2 = buttonUIStateFactory3;
                        str6 = str5;
                        i7 = i6;
                        buttonUIState = buttonUIStateF;
                        chaloTextUIState12 = chaloTextUIState9;
                        chaloTextUIState13 = chaloTextUIState11;
                        objB5 = objB3;
                        chaloTextUIState14 = chaloTextUIState10;
                        ChaloTextStyleHelper chaloTextStyleHelper7 = chaloTextStyleHelper4;
                        i8 = i4;
                        ChaloColorToken.Black black4 = ChaloColorToken.Black.f9759a;
                        black = black4;
                        buttonUIStateD = ButtonUIStateFactory.d(buttonUIStateFactory2, ChaloTextStyleHelper.g(chaloTextStyleHelper7, (String) objB5, black4, null, null, null, null, 124), new sg(chaloBusComponent2, 1), UIShape.e, false, 52);
                        uiEventHandlerA = UiEventHandler.Companion.a(new sg(chaloBusComponent2, 2));
                        iconType = IconType.IC_RED_CROSS;
                        imageUISize = new ImageUISize(ChaloThemeHelper.a().i);
                        coroutineSingletons2 = coroutineSingletons;
                        chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0 = str6;
                        chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$1 = chaloTextUIState13;
                        chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$2 = chaloTextUIState14;
                        chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$3 = chaloTextUIState12;
                        chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$4 = buttonUIState;
                        chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$5 = buttonUIStateD;
                        chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$6 = uiEventHandlerA;
                        chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$7 = iconType;
                        chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$8 = black;
                        chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$9 = imageUISize;
                        chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0 = i7;
                        chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1 = i8;
                        chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.label = 6;
                        objB4 = stringProvider.b(StringEnum.CROSS_TO_CLOSE, new Object[0], chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1);
                        if (objB4 == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                        iconType2 = iconType;
                        chaloTextUIState15 = chaloTextUIState13;
                        i9 = i7;
                        imageUISize2 = imageUISize;
                        chaloTextUIState16 = chaloTextUIState12;
                        chaloTextUIState17 = chaloTextUIState14;
                        str7 = str6;
                        i10 = i8;
                        objB5 = objB4;
                        return new PremiumBusSlotSelectionDateAndTimePickerUIState(i9, i10, str7, chaloTextUIState15, chaloTextUIState17, chaloTextUIState16, buttonUIState, buttonUIStateD, new ImageUIState(iconType2, (String) objB5, black, imageUISize2, (UIContentScale) null, 0.0f, uiEventHandlerA, 112), 8);
                    }
                }
                return coroutineSingletons3;
            case 3:
                i4 = chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1;
                int i16 = chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0;
                chaloTextStyleHelper2 = (ChaloTextStyleHelper) chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$3;
                TextUIState.ChaloTextUIState chaloTextUIState18 = (TextUIState.ChaloTextUIState) chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$2;
                chaloTextUIState4 = (TextUIState.ChaloTextUIState) chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$1;
                String str8 = (String) chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0;
                ResultKt.b(objB5);
                i5 = i16;
                chaloTextUIState3 = chaloTextUIState18;
                str5 = str8;
                chaloTextUIState5 = chaloTextUIState3;
                chaloTextUIState6 = chaloTextUIState4;
                chaloTextUIStateF2 = ChaloTextStyleHelper.f(chaloTextStyleHelper2, (String) objB5, null, UIFontWeight.Bold, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                rectangle = UIShape.e;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0 = str5;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$1 = chaloTextUIState6;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$2 = chaloTextUIState5;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$3 = chaloTextUIStateF2;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$4 = buttonUIStateFactory3;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$5 = rectangle;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$6 = chaloTextStyleHelper4;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0 = i5;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1 = i4;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.label = 4;
                objB2 = stringProvider.b(StringEnum.CONTINUE, new Object[0], chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1);
                if (objB2 != coroutineSingletons3) {
                    int i17 = i5;
                    chaloTextUIState7 = chaloTextUIState6;
                    objB5 = objB2;
                    i6 = i17;
                    chaloTextUIState8 = chaloTextUIState5;
                    buttonUIStateFactory = buttonUIStateFactory3;
                    chaloTextStyleHelper3 = chaloTextStyleHelper4;
                    UIShape.Rectangle rectangle5 = rectangle;
                    chaloTextUIState9 = chaloTextUIStateF2;
                    chaloTextUIState10 = chaloTextUIState8;
                    chaloTextUIState11 = chaloTextUIState7;
                    chaloBusComponent2 = chaloBusComponent;
                    buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory, ChaloTextStyleHelper.g(chaloTextStyleHelper3, (String) objB5, ChaloColorToken.White.f9870a, null, null, null, null, 124), new sg(chaloBusComponent, 0), rectangle5, false, 0.0f, 52);
                    chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0 = str5;
                    chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$1 = chaloTextUIState11;
                    chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$2 = chaloTextUIState10;
                    chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$3 = chaloTextUIState9;
                    chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$4 = buttonUIStateF;
                    chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$5 = buttonUIStateFactory3;
                    chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$6 = chaloTextStyleHelper4;
                    chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0 = i6;
                    chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1 = i4;
                    chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.label = 5;
                    objB3 = stringProvider.b(StringEnum.CANCEL, new Object[0], chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1);
                    coroutineSingletons = coroutineSingletons3;
                    if (objB3 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    buttonUIStateFactory2 = buttonUIStateFactory3;
                    str6 = str5;
                    i7 = i6;
                    buttonUIState = buttonUIStateF;
                    chaloTextUIState12 = chaloTextUIState9;
                    chaloTextUIState13 = chaloTextUIState11;
                    objB5 = objB3;
                    chaloTextUIState14 = chaloTextUIState10;
                    ChaloTextStyleHelper chaloTextStyleHelper8 = chaloTextStyleHelper4;
                    i8 = i4;
                    ChaloColorToken.Black black5 = ChaloColorToken.Black.f9759a;
                    black = black5;
                    buttonUIStateD = ButtonUIStateFactory.d(buttonUIStateFactory2, ChaloTextStyleHelper.g(chaloTextStyleHelper8, (String) objB5, black5, null, null, null, null, 124), new sg(chaloBusComponent2, 1), UIShape.e, false, 52);
                    uiEventHandlerA = UiEventHandler.Companion.a(new sg(chaloBusComponent2, 2));
                    iconType = IconType.IC_RED_CROSS;
                    imageUISize = new ImageUISize(ChaloThemeHelper.a().i);
                    coroutineSingletons2 = coroutineSingletons;
                    chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0 = str6;
                    chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$1 = chaloTextUIState13;
                    chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$2 = chaloTextUIState14;
                    chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$3 = chaloTextUIState12;
                    chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$4 = buttonUIState;
                    chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$5 = buttonUIStateD;
                    chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$6 = uiEventHandlerA;
                    chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$7 = iconType;
                    chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$8 = black;
                    chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$9 = imageUISize;
                    chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0 = i7;
                    chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1 = i8;
                    chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.label = 6;
                    objB4 = stringProvider.b(StringEnum.CROSS_TO_CLOSE, new Object[0], chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1);
                    if (objB4 == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                    iconType2 = iconType;
                    chaloTextUIState15 = chaloTextUIState13;
                    i9 = i7;
                    imageUISize2 = imageUISize;
                    chaloTextUIState16 = chaloTextUIState12;
                    chaloTextUIState17 = chaloTextUIState14;
                    str7 = str6;
                    i10 = i8;
                    objB5 = objB4;
                    return new PremiumBusSlotSelectionDateAndTimePickerUIState(i9, i10, str7, chaloTextUIState15, chaloTextUIState17, chaloTextUIState16, buttonUIState, buttonUIStateD, new ImageUIState(iconType2, (String) objB5, black, imageUISize2, (UIContentScale) null, 0.0f, uiEventHandlerA, 112), 8);
                }
                return coroutineSingletons3;
            case 4:
                i4 = chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1;
                i6 = chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0;
                chaloTextStyleHelper3 = (ChaloTextStyleHelper) chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$6;
                rectangle = (UIShape.Rectangle) chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$5;
                ButtonUIStateFactory buttonUIStateFactory4 = (ButtonUIStateFactory) chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$4;
                chaloTextUIStateF2 = (TextUIState.ChaloTextUIState) chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$3;
                chaloTextUIState8 = (TextUIState.ChaloTextUIState) chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$2;
                chaloTextUIState7 = (TextUIState.ChaloTextUIState) chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$1;
                str5 = (String) chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0;
                ResultKt.b(objB5);
                buttonUIStateFactory = buttonUIStateFactory4;
                UIShape.Rectangle rectangle6 = rectangle;
                chaloTextUIState9 = chaloTextUIStateF2;
                chaloTextUIState10 = chaloTextUIState8;
                chaloTextUIState11 = chaloTextUIState7;
                chaloBusComponent2 = chaloBusComponent;
                buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory, ChaloTextStyleHelper.g(chaloTextStyleHelper3, (String) objB5, ChaloColorToken.White.f9870a, null, null, null, null, 124), new sg(chaloBusComponent, 0), rectangle6, false, 0.0f, 52);
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0 = str5;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$1 = chaloTextUIState11;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$2 = chaloTextUIState10;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$3 = chaloTextUIState9;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$4 = buttonUIStateF;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$5 = buttonUIStateFactory3;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$6 = chaloTextStyleHelper4;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0 = i6;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1 = i4;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.label = 5;
                objB3 = stringProvider.b(StringEnum.CANCEL, new Object[0], chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1);
                coroutineSingletons = coroutineSingletons3;
                if (objB3 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                buttonUIStateFactory2 = buttonUIStateFactory3;
                str6 = str5;
                i7 = i6;
                buttonUIState = buttonUIStateF;
                chaloTextUIState12 = chaloTextUIState9;
                chaloTextUIState13 = chaloTextUIState11;
                objB5 = objB3;
                chaloTextUIState14 = chaloTextUIState10;
                ChaloTextStyleHelper chaloTextStyleHelper9 = chaloTextStyleHelper4;
                i8 = i4;
                ChaloColorToken.Black black6 = ChaloColorToken.Black.f9759a;
                black = black6;
                buttonUIStateD = ButtonUIStateFactory.d(buttonUIStateFactory2, ChaloTextStyleHelper.g(chaloTextStyleHelper9, (String) objB5, black6, null, null, null, null, 124), new sg(chaloBusComponent2, 1), UIShape.e, false, 52);
                uiEventHandlerA = UiEventHandler.Companion.a(new sg(chaloBusComponent2, 2));
                iconType = IconType.IC_RED_CROSS;
                imageUISize = new ImageUISize(ChaloThemeHelper.a().i);
                coroutineSingletons2 = coroutineSingletons;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0 = str6;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$1 = chaloTextUIState13;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$2 = chaloTextUIState14;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$3 = chaloTextUIState12;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$4 = buttonUIState;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$5 = buttonUIStateD;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$6 = uiEventHandlerA;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$7 = iconType;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$8 = black;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$9 = imageUISize;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0 = i7;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1 = i8;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.label = 6;
                objB4 = stringProvider.b(StringEnum.CROSS_TO_CLOSE, new Object[0], chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1);
                if (objB4 == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                iconType2 = iconType;
                chaloTextUIState15 = chaloTextUIState13;
                i9 = i7;
                imageUISize2 = imageUISize;
                chaloTextUIState16 = chaloTextUIState12;
                chaloTextUIState17 = chaloTextUIState14;
                str7 = str6;
                i10 = i8;
                objB5 = objB4;
                return new PremiumBusSlotSelectionDateAndTimePickerUIState(i9, i10, str7, chaloTextUIState15, chaloTextUIState17, chaloTextUIState16, buttonUIState, buttonUIStateD, new ImageUIState(iconType2, (String) objB5, black, imageUISize2, (UIContentScale) null, 0.0f, uiEventHandlerA, 112), 8);
            case 5:
                i4 = chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1;
                i7 = chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0;
                chaloTextStyleHelper4 = (ChaloTextStyleHelper) chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$6;
                ButtonUIStateFactory buttonUIStateFactory5 = (ButtonUIStateFactory) chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$5;
                ButtonUIState buttonUIState2 = (ButtonUIState) chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$4;
                chaloTextUIState12 = (TextUIState.ChaloTextUIState) chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$3;
                chaloTextUIState14 = (TextUIState.ChaloTextUIState) chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$2;
                TextUIState.ChaloTextUIState chaloTextUIState19 = (TextUIState.ChaloTextUIState) chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$1;
                str6 = (String) chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0;
                ResultKt.b(objB5);
                coroutineSingletons = coroutineSingletons3;
                chaloTextUIState13 = chaloTextUIState19;
                buttonUIStateFactory2 = buttonUIStateFactory5;
                buttonUIState = buttonUIState2;
                chaloBusComponent2 = chaloBusComponent;
                ChaloTextStyleHelper chaloTextStyleHelper10 = chaloTextStyleHelper4;
                i8 = i4;
                ChaloColorToken.Black black7 = ChaloColorToken.Black.f9759a;
                black = black7;
                buttonUIStateD = ButtonUIStateFactory.d(buttonUIStateFactory2, ChaloTextStyleHelper.g(chaloTextStyleHelper10, (String) objB5, black7, null, null, null, null, 124), new sg(chaloBusComponent2, 1), UIShape.e, false, 52);
                uiEventHandlerA = UiEventHandler.Companion.a(new sg(chaloBusComponent2, 2));
                iconType = IconType.IC_RED_CROSS;
                imageUISize = new ImageUISize(ChaloThemeHelper.a().i);
                coroutineSingletons2 = coroutineSingletons;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0 = str6;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$1 = chaloTextUIState13;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$2 = chaloTextUIState14;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$3 = chaloTextUIState12;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$4 = buttonUIState;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$5 = buttonUIStateD;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$6 = uiEventHandlerA;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$7 = iconType;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$8 = black;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$9 = imageUISize;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0 = i7;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1 = i8;
                chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.label = 6;
                objB4 = stringProvider.b(StringEnum.CROSS_TO_CLOSE, new Object[0], chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1);
                if (objB4 == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                iconType2 = iconType;
                chaloTextUIState15 = chaloTextUIState13;
                i9 = i7;
                imageUISize2 = imageUISize;
                chaloTextUIState16 = chaloTextUIState12;
                chaloTextUIState17 = chaloTextUIState14;
                str7 = str6;
                i10 = i8;
                objB5 = objB4;
                return new PremiumBusSlotSelectionDateAndTimePickerUIState(i9, i10, str7, chaloTextUIState15, chaloTextUIState17, chaloTextUIState16, buttonUIState, buttonUIStateD, new ImageUIState(iconType2, (String) objB5, black, imageUISize2, (UIContentScale) null, 0.0f, uiEventHandlerA, 112), 8);
            case 6:
                int i18 = chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$1;
                int i19 = chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.I$0;
                ImageUISize imageUISize3 = (ImageUISize) chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$9;
                black = (ChaloColorToken.Black) chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$8;
                IconType iconType3 = (IconType) chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$7;
                uiEventHandlerA = (UiEventHandler) chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$6;
                buttonUIStateD = (ButtonUIState) chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$5;
                buttonUIState = (ButtonUIState) chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$4;
                TextUIState.ChaloTextUIState chaloTextUIState20 = (TextUIState.ChaloTextUIState) chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$3;
                TextUIState.ChaloTextUIState chaloTextUIState21 = (TextUIState.ChaloTextUIState) chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$2;
                TextUIState.ChaloTextUIState chaloTextUIState22 = (TextUIState.ChaloTextUIState) chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$1;
                String str9 = (String) chaloBusComponent$createPremiumBusDateAndTimePickerBottomSheet$1.L$0;
                ResultKt.b(objB5);
                i10 = i18;
                i9 = i19;
                str7 = str9;
                iconType2 = iconType3;
                chaloTextUIState16 = chaloTextUIState20;
                chaloTextUIState17 = chaloTextUIState21;
                chaloTextUIState15 = chaloTextUIState22;
                imageUISize2 = imageUISize3;
                return new PremiumBusSlotSelectionDateAndTimePickerUIState(i9, i10, str7, chaloTextUIState15, chaloTextUIState17, chaloTextUIState16, buttonUIState, buttonUIStateD, new ImageUIState(iconType2, (String) objB5, black, imageUISize2, (UIContentScale) null, 0.0f, uiEventHandlerA, 112), 8);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x025c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x024d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x025e A[LOOP:1: B:75:0x0247->B:80:0x025e, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x031e -> B:100:0x031c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x0303 -> B:99:0x0307). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object J0(app.chalo.home.ui.chalobus.ChaloBusComponent r29, app.chalo.utils.ChaloUseCaseResult.Success r30, kotlin.coroutines.jvm.internal.ContinuationImpl r31) {
        /*
            Method dump skipped, instruction units count: 837
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.chalobus.ChaloBusComponent.J0(app.chalo.home.ui.chalobus.ChaloBusComponent, app.chalo.utils.ChaloUseCaseResult$Success, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:47:0x011e  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00aa, code lost:
    
        if (r2 == r6) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0108, code lost:
    
        if (r2 == r6) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0137, code lost:
    
        if (r2 == r6) goto L49;
     */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K0(app.chalo.home.ui.chalobus.ChaloBusComponent r16, app.chalo.superpass.data.models.entities.SuperPass r17, kotlin.coroutines.jvm.internal.ContinuationImpl r18) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.chalobus.ChaloBusComponent.K0(app.chalo.home.ui.chalobus.ChaloBusComponent, app.chalo.superpass.data.models.entities.SuperPass, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e3, code lost:
    
        if (r14.g(r8, r1) == r2) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object L0(app.chalo.home.ui.chalobus.ChaloBusComponent r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.chalobus.ChaloBusComponent.L0(app.chalo.home.ui.chalobus.ChaloBusComponent, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object M0(ChaloBusComponent chaloBusComponent, String str, ContinuationImpl continuationImpl) {
        ChaloBusComponent$hasPassSelectionReadyLocalConfig$1 chaloBusComponent$hasPassSelectionReadyLocalConfig$1;
        Object objB;
        chaloBusComponent.getClass();
        if (continuationImpl instanceof ChaloBusComponent$hasPassSelectionReadyLocalConfig$1) {
            chaloBusComponent$hasPassSelectionReadyLocalConfig$1 = (ChaloBusComponent$hasPassSelectionReadyLocalConfig$1) continuationImpl;
            int i = chaloBusComponent$hasPassSelectionReadyLocalConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloBusComponent$hasPassSelectionReadyLocalConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloBusComponent$hasPassSelectionReadyLocalConfig$1 = new ChaloBusComponent$hasPassSelectionReadyLocalConfig$1(chaloBusComponent, continuationImpl);
            }
        } else {
            chaloBusComponent$hasPassSelectionReadyLocalConfig$1 = new ChaloBusComponent$hasPassSelectionReadyLocalConfig$1(chaloBusComponent, continuationImpl);
        }
        Object objF = chaloBusComponent$hasPassSelectionReadyLocalConfig$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloBusComponent$hasPassSelectionReadyLocalConfig$1.label;
        if (i2 == 0) {
            ResultKt.b(objF);
            LocalDataStore localDataStore = chaloBusComponent.L;
            chaloBusComponent$hasPassSelectionReadyLocalConfig$1.label = 1;
            objF = localDataStore.f(str, chaloBusComponent$hasPassSelectionReadyLocalConfig$1);
            if (objF == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objF);
        }
        String str2 = (String) objF;
        if (str2 == null) {
            return Boolean.FALSE;
        }
        try {
            Json json = ChaloJson.b;
            json.getClass();
            objB = json.b(str2, ProductConfigCompleteDetailsApiResponseModel.INSTANCE.serializer());
        } catch (Exception unused) {
            objB = null;
        }
        ProductConfigCompleteDetailsApiResponseModel productConfigCompleteDetailsApiResponseModel = (ProductConfigCompleteDetailsApiResponseModel) objB;
        if (productConfigCompleteDetailsApiResponseModel == null) {
            return Boolean.FALSE;
        }
        List list = productConfigCompleteDetailsApiResponseModel.p;
        return Boolean.valueOf((list == null || list.isEmpty()) ? false : true);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public static final Object N0(ChaloBusComponent chaloBusComponent, ContinuationImpl continuationImpl) {
        ChaloBusComponent$navigateToProductSelection$1 chaloBusComponent$navigateToProductSelection$1;
        List list;
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel;
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2;
        String str;
        String str2;
        String str3;
        String str4;
        List list2;
        String strA;
        String strA2;
        chaloBusComponent.getClass();
        if (continuationImpl instanceof ChaloBusComponent$navigateToProductSelection$1) {
            chaloBusComponent$navigateToProductSelection$1 = (ChaloBusComponent$navigateToProductSelection$1) continuationImpl;
            int i = chaloBusComponent$navigateToProductSelection$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloBusComponent$navigateToProductSelection$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloBusComponent$navigateToProductSelection$1 = new ChaloBusComponent$navigateToProductSelection$1(chaloBusComponent, continuationImpl);
            }
        } else {
            chaloBusComponent$navigateToProductSelection$1 = new ChaloBusComponent$navigateToProductSelection$1(chaloBusComponent, continuationImpl);
        }
        Object obj = chaloBusComponent$navigateToProductSelection$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloBusComponent$navigateToProductSelection$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(obj);
            PBOriginDestinationAppModel pBOriginDestinationAppModel = ((ChaloBusViewState) chaloBusComponent.f.getValue()).s;
            String str5 = pBOriginDestinationAppModel != null ? pBOriginDestinationAppModel.c : null;
            String str6 = pBOriginDestinationAppModel != null ? pBOriginDestinationAppModel.d : null;
            String str7 = pBOriginDestinationAppModel != null ? pBOriginDestinationAppModel.h : null;
            String str8 = pBOriginDestinationAppModel != null ? pBOriginDestinationAppModel.i : null;
            List list3 = pBOriginDestinationAppModel != null ? pBOriginDestinationAppModel.f7091a : null;
            if (str5 == null || str5.length() == 0 || str6 == null || str6.length() == 0 || str7 == null || str7.length() == 0 || str8 == null || str8.length() == 0 || (list = list3) == null || list.isEmpty()) {
                chaloBusComponent.Y0();
                return unit;
            }
            PremiumBusSelectedLocationType premiumBusSelectedLocationType = PremiumBusSelectedLocationType.STOP;
            PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel3 = new PBStopPlaceSelectedAppModel(str5, "searchPartnerChaloStop", str6, null, null, premiumBusSelectedLocationType);
            String str9 = str7;
            PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel4 = new PBStopPlaceSelectedAppModel(str9, "searchPartnerChaloStop", str8, null, null, premiumBusSelectedLocationType);
            BasicInfoContract basicInfoContract = chaloBusComponent.y;
            chaloBusComponent$navigateToProductSelection$1.L$0 = str5;
            chaloBusComponent$navigateToProductSelection$1.L$1 = str6;
            chaloBusComponent$navigateToProductSelection$1.L$2 = str9;
            chaloBusComponent$navigateToProductSelection$1.L$3 = str8;
            chaloBusComponent$navigateToProductSelection$1.L$4 = list3;
            chaloBusComponent$navigateToProductSelection$1.L$5 = pBStopPlaceSelectedAppModel3;
            chaloBusComponent$navigateToProductSelection$1.L$6 = pBStopPlaceSelectedAppModel4;
            chaloBusComponent$navigateToProductSelection$1.label = 1;
            Object objC = basicInfoContract.c(chaloBusComponent$navigateToProductSelection$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
            pBStopPlaceSelectedAppModel = pBStopPlaceSelectedAppModel3;
            pBStopPlaceSelectedAppModel2 = pBStopPlaceSelectedAppModel4;
            str = str9;
            str2 = str8;
            str3 = str6;
            str4 = str5;
            list2 = list3;
            obj = objC;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pBStopPlaceSelectedAppModel2 = (PBStopPlaceSelectedAppModel) chaloBusComponent$navigateToProductSelection$1.L$6;
            pBStopPlaceSelectedAppModel = (PBStopPlaceSelectedAppModel) chaloBusComponent$navigateToProductSelection$1.L$5;
            List list4 = (List) chaloBusComponent$navigateToProductSelection$1.L$4;
            String str10 = (String) chaloBusComponent$navigateToProductSelection$1.L$3;
            String str11 = (String) chaloBusComponent$navigateToProductSelection$1.L$2;
            String str12 = (String) chaloBusComponent$navigateToProductSelection$1.L$1;
            String str13 = (String) chaloBusComponent$navigateToProductSelection$1.L$0;
            ResultKt.b(obj);
            str2 = str10;
            str = str11;
            str3 = str12;
            str4 = str13;
            list2 = list4;
        }
        PremiumBusProductPurchaseFlowType.FreshPurchase freshPurchase = new PremiumBusProductPurchaseFlowType.FreshPurchase(pBStopPlaceSelectedAppModel, pBStopPlaceSelectedAppModel2, ((Number) obj).longValue());
        try {
            Json json = ChaloJson.b;
            json.getClass();
            strA = json.a(PremiumBusProductPurchaseFlowType.INSTANCE.serializer(), freshPurchase);
        } catch (Exception unused) {
            strA = null;
        }
        if (strA != null) {
            PBOriginDestinationAppModel pBOriginDestinationAppModel2 = new PBOriginDestinationAppModel(list2, null, str4, str3, null, null, null, str, str2, null, null, null, 32370);
            try {
                Json json2 = ChaloJson.b;
                json2.getClass();
                strA2 = json2.a(PBOriginDestinationAppModel.INSTANCE.serializer(), pBOriginDestinationAppModel2);
            } catch (Exception unused2) {
                strA2 = null;
            }
            chaloBusComponent.t.b(new ChaloNavigationRequest.Navigate(new PremiumBusArgs.PremiumProductSelectionArgs(strA, strA2, new PremiumBusProductSelectionConfig(true, 1), (String) null, 8), null, null, 6));
        }
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x01be  */
    /* JADX WARN: Code duplicated, block: B:50:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:53:0x0201  */
    /* JADX WARN: Code duplicated, block: B:55:0x0204  */
    /* JADX WARN: Code duplicated, block: B:58:0x0219  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v7, types: [T, app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel] */
    /* JADX WARN: Type inference failed for: r15v2, types: [T, app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel] */
    /* JADX WARN: Type inference failed for: r2v5, types: [T, app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel] */
    /* JADX WARN: Type inference failed for: r2v9, types: [T, app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel] */
    public static final Object O0(final ChaloBusComponent chaloBusComponent, List list, ContinuationImpl continuationImpl) throws Exception {
        ChaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$1 chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$1;
        Ref.ObjectRef objectRefV;
        Ref.ObjectRef objectRef;
        List list2;
        PBOriginDestinationAppModel pBOriginDestinationAppModel;
        Ref.BooleanRef booleanRef;
        TimeZone timeZoneA;
        List list3;
        Ref.BooleanRef booleanRef2;
        Ref.ObjectRef objectRef2;
        List list4;
        LocalDateTime localDateTime;
        List list5;
        LocalDateTime localDateTime2;
        List list6;
        TimeZone timeZone;
        Ref.ObjectRef objectRef3;
        PBOriginDestinationAppModel pBOriginDestinationAppModel2;
        final List list7;
        final LocalDateTime localDateTime3;
        final TimeZone timeZone2;
        final List list8;
        final Ref.ObjectRef objectRef4;
        final PBOriginDestinationAppModel pBOriginDestinationAppModel3;
        final Ref.BooleanRef booleanRef3;
        final Ref.ObjectRef objectRef5;
        LinkedHashMap linkedHashMapK;
        String strG;
        chaloBusComponent.getClass();
        if (continuationImpl instanceof ChaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$1) {
            chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$1 = (ChaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$1) continuationImpl;
            int i = chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$1 = new ChaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$1(chaloBusComponent, continuationImpl);
            }
        } else {
            chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$1 = new ChaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$1(chaloBusComponent, continuationImpl);
        }
        ChaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$1 chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2 = chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$1;
        Object objS0 = chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2.label;
        if (i2 != 0) {
            if (i2 == 1) {
                localDateTime2 = (LocalDateTime) chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2.L$6;
                timeZoneA = (TimeZone) chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2.L$5;
                booleanRef = (Ref.BooleanRef) chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2.L$4;
                pBOriginDestinationAppModel = (PBOriginDestinationAppModel) chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2.L$3;
                objectRef = (Ref.ObjectRef) chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2.L$2;
                objectRefV = (Ref.ObjectRef) chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2.L$1;
                list5 = (List) chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2.L$0;
                ResultKt.b(objS0);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                List list9 = (List) chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2.L$7;
                LocalDateTime localDateTime4 = (LocalDateTime) chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2.L$6;
                TimeZone timeZone3 = (TimeZone) chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2.L$5;
                Ref.BooleanRef booleanRef4 = (Ref.BooleanRef) chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2.L$4;
                PBOriginDestinationAppModel pBOriginDestinationAppModel4 = (PBOriginDestinationAppModel) chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2.L$3;
                Ref.ObjectRef objectRef6 = (Ref.ObjectRef) chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2.L$2;
                Ref.ObjectRef objectRef7 = (Ref.ObjectRef) chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2.L$1;
                List list10 = (List) chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2.L$0;
                ResultKt.b(objS0);
                list8 = list9;
                list7 = list10;
                localDateTime3 = localDateTime4;
                objectRef4 = objectRef6;
                objectRef3 = objectRef7;
                pBOriginDestinationAppModel3 = pBOriginDestinationAppModel4;
                timeZone2 = timeZone3;
                booleanRef3 = booleanRef4;
            }
            final List list11 = (List) objS0;
            objectRef5 = objectRef3;
            chaloBusComponent.E0(new Function1() { // from class: ug
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ChaloBusViewState it = (ChaloBusViewState) obj;
                    Intrinsics.i(it, "it");
                    return ChaloBusViewState.a(it, null, false, 0, null, list7, null, (PBStopPlaceSelectedAppModel) objectRef5.element, (PBStopPlaceSelectedAppModel) objectRef4.element, booleanRef3.element, CityProviderKt.b(chaloBusComponent.p), new SelectedDateAndTime(localDateTime3, timeZone2.a()), null, null, null, list8, null, null, pBOriginDestinationAppModel3, false, list11, false, null, null, null, null, 263046383);
                }
            });
            chaloBusComponent.U0(pBOriginDestinationAppModel3);
            linkedHashMapK = MapsKt.k(new Pair("rebookCardCount", String.valueOf(list7.size())));
            strG = chaloBusComponent.q.getS();
            if (strG != null) {
                if (StringsKt.F(strG)) {
                    strG = null;
                }
                if (strG != null) {
                    linkedHashMapK.put("attribution type", strG);
                }
            }
            HomeScreenAnalyticsHelper.DefaultImpls.a(chaloBusComponent.r, "pb trip details screen shown", linkedHashMapK, Source.CHALO_BUS_SCREEN_TAB, 12);
            if (objectRef5.element == 0) {
                BuildersKt.d(chaloBusComponent.j, null, null, new ChaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$3(chaloBusComponent, null), 3);
            }
            return Unit.f17538a;
        }
        objectRefV = uf0.v(objS0);
        objectRefV.element = ((ChaloBusViewState) chaloBusComponent.t0().a()).h;
        objectRef = new Ref.ObjectRef();
        ?? r2 = ((ChaloBusViewState) chaloBusComponent.t0().a()).i;
        objectRef.element = r2;
        if (objectRefV.element == 0 && r2 == 0 && !list.isEmpty()) {
            PBOriginDestinationAppModel pBOriginDestinationAppModel5 = (PBOriginDestinationAppModel) CollectionsKt.F(list);
            List list12 = pBOriginDestinationAppModel5.f7091a;
            String str = pBOriginDestinationAppModel5.c;
            String str2 = pBOriginDestinationAppModel5.d;
            PremiumBusSelectedLocationType premiumBusSelectedLocationType = PremiumBusSelectedLocationType.STOP;
            objectRefV.element = new PBStopPlaceSelectedAppModel(str, "", str2, null, null, premiumBusSelectedLocationType);
            objectRef.element = new PBStopPlaceSelectedAppModel(pBOriginDestinationAppModel5.h, "", pBOriginDestinationAppModel5.i, null, null, premiumBusSelectedLocationType);
            list2 = list12;
        } else {
            list2 = null;
        }
        if (objectRefV.element == 0 || objectRef.element == 0 || (list6 = list2) == null || list6.isEmpty()) {
            pBOriginDestinationAppModel = null;
        } else {
            PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel = (PBStopPlaceSelectedAppModel) objectRefV.element;
            String str3 = pBStopPlaceSelectedAppModel.f7095a;
            String str4 = pBStopPlaceSelectedAppModel.c;
            PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2 = (PBStopPlaceSelectedAppModel) objectRef.element;
            pBOriginDestinationAppModel = new PBOriginDestinationAppModel(list2, null, str3, str4, null, null, null, pBStopPlaceSelectedAppModel2.f7095a, pBStopPlaceSelectedAppModel2.c, null, null, null, 32370);
        }
        booleanRef = new Ref.BooleanRef();
        TimeZone.Companion companion = TimeZone.INSTANCE;
        String strB = chaloBusComponent.x.b();
        companion.getClass();
        timeZoneA = TimeZone.Companion.a(strB);
        LocalDateTime localDateTimeC = TimeZoneKt.c(Clock.System.f17926a.a(), timeZoneA);
        list3 = ((ChaloBusViewState) chaloBusComponent.t0().a()).p;
        if (list3 == null) {
            GetPremiumBusCurrentCityConfigUseCase getPremiumBusCurrentCityConfigUseCase = chaloBusComponent.l;
            chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2.L$0 = list;
            chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2.L$1 = objectRefV;
            chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2.L$2 = objectRef;
            chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2.L$3 = pBOriginDestinationAppModel;
            chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2.L$4 = booleanRef;
            chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2.L$5 = timeZoneA;
            chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2.L$6 = localDateTimeC;
            chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2.label = 1;
            Object objA = getPremiumBusCurrentCityConfigUseCase.a(chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2);
            if (objA != coroutineSingletons) {
                list5 = list;
                localDateTime2 = localDateTimeC;
                objS0 = objA;
            }
        } else {
            booleanRef2 = booleanRef;
            objectRef2 = objectRef;
            list4 = list;
            localDateTime = localDateTimeC;
            Ref.ObjectRef objectRef8 = objectRefV;
            timeZone = timeZoneA;
            chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2.L$0 = list4;
            chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2.L$1 = objectRef8;
            chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2.L$2 = objectRef2;
            chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2.L$3 = pBOriginDestinationAppModel;
            chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2.L$4 = booleanRef2;
            chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2.L$5 = timeZone;
            chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2.L$6 = localDateTime;
            chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2.L$7 = list3;
            chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2.label = 2;
            objectRef3 = objectRef8;
            pBOriginDestinationAppModel2 = pBOriginDestinationAppModel;
            objS0 = S0(chaloBusComponent, null, null, false, pBOriginDestinationAppModel2, list4, chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2, 7);
            if (objS0 != coroutineSingletons) {
                list7 = list4;
                localDateTime3 = localDateTime;
                timeZone2 = timeZone;
                list8 = list3;
                objectRef4 = objectRef2;
                pBOriginDestinationAppModel3 = pBOriginDestinationAppModel2;
                booleanRef3 = booleanRef2;
                final List list13 = (List) objS0;
                objectRef5 = objectRef3;
                chaloBusComponent.E0(new Function1() { // from class: ug
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ChaloBusViewState it = (ChaloBusViewState) obj;
                        Intrinsics.i(it, "it");
                        return ChaloBusViewState.a(it, null, false, 0, null, list7, null, (PBStopPlaceSelectedAppModel) objectRef5.element, (PBStopPlaceSelectedAppModel) objectRef4.element, booleanRef3.element, CityProviderKt.b(chaloBusComponent.p), new SelectedDateAndTime(localDateTime3, timeZone2.a()), null, null, null, list8, null, null, pBOriginDestinationAppModel3, false, list13, false, null, null, null, null, 263046383);
                    }
                });
                chaloBusComponent.U0(pBOriginDestinationAppModel3);
                linkedHashMapK = MapsKt.k(new Pair("rebookCardCount", String.valueOf(list7.size())));
                strG = chaloBusComponent.q.getS();
                if (strG != null) {
                    if (StringsKt.F(strG)) {
                        strG = null;
                    }
                    if (strG != null) {
                        linkedHashMapK.put("attribution type", strG);
                    }
                }
                HomeScreenAnalyticsHelper.DefaultImpls.a(chaloBusComponent.r, "pb trip details screen shown", linkedHashMapK, Source.CHALO_BUS_SCREEN_TAB, 12);
                if (objectRef5.element == 0) {
                    BuildersKt.d(chaloBusComponent.j, null, null, new ChaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$3(chaloBusComponent, null), 3);
                }
                return Unit.f17538a;
            }
        }
        return coroutineSingletons;
        booleanRef2 = booleanRef;
        objectRef2 = objectRef;
        list4 = list5;
        localDateTime = localDateTime2;
        list3 = ((PremiumBusNativeCityWiseConfigAppModel) objS0).n;
        Ref.ObjectRef objectRef9 = objectRefV;
        timeZone = timeZoneA;
        chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2.L$0 = list4;
        chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2.L$1 = objectRef9;
        chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2.L$2 = objectRef2;
        chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2.L$3 = pBOriginDestinationAppModel;
        chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2.L$4 = booleanRef2;
        chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2.L$5 = timeZone;
        chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2.L$6 = localDateTime;
        chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2.L$7 = list3;
        chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2.label = 2;
        objectRef3 = objectRef9;
        pBOriginDestinationAppModel2 = pBOriginDestinationAppModel;
        objS0 = S0(chaloBusComponent, null, null, false, pBOriginDestinationAppModel2, list4, chaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2, 7);
        if (objS0 != coroutineSingletons) {
            list7 = list4;
            localDateTime3 = localDateTime;
            timeZone2 = timeZone;
            list8 = list3;
            objectRef4 = objectRef2;
            pBOriginDestinationAppModel3 = pBOriginDestinationAppModel2;
            booleanRef3 = booleanRef2;
            final List list14 = (List) objS0;
            objectRef5 = objectRef3;
            chaloBusComponent.E0(new Function1() { // from class: ug
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ChaloBusViewState it = (ChaloBusViewState) obj;
                    Intrinsics.i(it, "it");
                    return ChaloBusViewState.a(it, null, false, 0, null, list7, null, (PBStopPlaceSelectedAppModel) objectRef5.element, (PBStopPlaceSelectedAppModel) objectRef4.element, booleanRef3.element, CityProviderKt.b(chaloBusComponent.p), new SelectedDateAndTime(localDateTime3, timeZone2.a()), null, null, null, list8, null, null, pBOriginDestinationAppModel3, false, list14, false, null, null, null, null, 263046383);
                }
            });
            chaloBusComponent.U0(pBOriginDestinationAppModel3);
            linkedHashMapK = MapsKt.k(new Pair("rebookCardCount", String.valueOf(list7.size())));
            strG = chaloBusComponent.q.getS();
            if (strG != null) {
                if (StringsKt.F(strG)) {
                    strG = null;
                }
                if (strG != null) {
                    linkedHashMapK.put("attribution type", strG);
                }
            }
            HomeScreenAnalyticsHelper.DefaultImpls.a(chaloBusComponent.r, "pb trip details screen shown", linkedHashMapK, Source.CHALO_BUS_SCREEN_TAB, 12);
            if (objectRef5.element == 0) {
                BuildersKt.d(chaloBusComponent.j, null, null, new ChaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$3(chaloBusComponent, null), 3);
            }
            return Unit.f17538a;
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    /* JADX WARN: Code duplicated, block: B:32:0x0098  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c9, code lost:
    
        if (r13 == r4) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e4, code lost:
    
        if (r13 == r4) goto L44;
     */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object P0(app.chalo.home.ui.chalobus.ChaloBusComponent r11, app.chalo.home.ui.chalobus.RidePreferenceBannerState.SaveRideEligible r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.chalobus.ChaloBusComponent.P0(app.chalo.home.ui.chalobus.ChaloBusComponent, app.chalo.home.ui.chalobus.RidePreferenceBannerState$SaveRideEligible, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    public static final Object Q0(ChaloBusComponent chaloBusComponent, RidePreferenceBannerState.SaveRideEligible saveRideEligible, PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel, PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2, ContinuationImpl continuationImpl) {
        ChaloBusComponent$toggleToSaveRide$1 chaloBusComponent$toggleToSaveRide$1;
        long jF;
        KotlinToastManager kotlinToastManager;
        chaloBusComponent.getClass();
        HomeScreenAnalyticsHelper homeScreenAnalyticsHelper = chaloBusComponent.r;
        if (continuationImpl instanceof ChaloBusComponent$toggleToSaveRide$1) {
            chaloBusComponent$toggleToSaveRide$1 = (ChaloBusComponent$toggleToSaveRide$1) continuationImpl;
            int i = chaloBusComponent$toggleToSaveRide$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloBusComponent$toggleToSaveRide$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloBusComponent$toggleToSaveRide$1 = new ChaloBusComponent$toggleToSaveRide$1(chaloBusComponent, continuationImpl);
            }
        } else {
            chaloBusComponent$toggleToSaveRide$1 = new ChaloBusComponent$toggleToSaveRide$1(chaloBusComponent, continuationImpl);
        }
        ChaloBusComponent$toggleToSaveRide$1 chaloBusComponent$toggleToSaveRide$2 = chaloBusComponent$toggleToSaveRide$1;
        Object objA = chaloBusComponent$toggleToSaveRide$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloBusComponent$toggleToSaveRide$2.label;
        if (i2 != 0) {
            if (i2 == 1) {
                saveRideEligible = (RidePreferenceBannerState.SaveRideEligible) chaloBusComponent$toggleToSaveRide$2.L$0;
                ResultKt.b(objA);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlinToastManager = (KotlinToastManager) chaloBusComponent$toggleToSaveRide$2.L$0;
                ResultKt.b(objA);
            }
            KotlinToastManagerKt.a(kotlinToastManager, (String) objA, ToastLength.LONG);
            return Unit.f17538a;
        }
        ResultKt.b(objA);
        SelectedDateAndTime selectedDateAndTime = ((ChaloBusViewState) chaloBusComponent.f.getValue()).l;
        if (selectedDateAndTime != null) {
            LocalDateTime localDateTime = selectedDateAndTime.f3305a;
            jF = chaloBusComponent.x.f(localDateTime.g(), localDateTime.h());
        } else {
            jF = saveRideEligible.e;
        }
        long j = jF;
        String strH = chaloBusComponent.p.h();
        if (strH == null) {
            strH = "";
        }
        SaveOrEditRideUseCase saveOrEditRideUseCase = chaloBusComponent.R;
        UserCommutePreferencePlaceLocationAppModel userCommutePreferencePlaceLocationAppModelE = UserCommutePreferenceApiResponseToAppModelMapperKt.e(pBStopPlaceSelectedAppModel, strH);
        UserCommutePreferencePlaceLocationAppModel userCommutePreferencePlaceLocationAppModelE2 = UserCommutePreferenceApiResponseToAppModelMapperKt.e(pBStopPlaceSelectedAppModel2, strH);
        chaloBusComponent$toggleToSaveRide$2.L$0 = saveRideEligible;
        chaloBusComponent$toggleToSaveRide$2.label = 1;
        objA = saveOrEditRideUseCase.a(null, userCommutePreferencePlaceLocationAppModelE, userCommutePreferencePlaceLocationAppModelE2, j, chaloBusComponent$toggleToSaveRide$2);
        if (objA != coroutineSingletons) {
        }
        return coroutineSingletons;
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objA;
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            chaloBusComponent.E0(new wg(saveRideEligible, 0));
            String str = ((SaveOrEditRideUseCase.AddRideErrorType) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).f10293a;
            HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "ride preference save ride failure", vo1.s("errorReason", str != null ? str : ""), Source.CHALO_BUS_SCREEN_TAB, 12);
            KotlinToastManager kotlinToastManager2 = chaloBusComponent.A;
            chaloBusComponent$toggleToSaveRide$2.L$0 = kotlinToastManager2;
            chaloBusComponent$toggleToSaveRide$2.label = 2;
            objA = chaloBusComponent.s.b(StringEnum.SOMETHING_WENT_WRONG_PLEASE_TRY_AGAIN, new Object[0], chaloBusComponent$toggleToSaveRide$2);
            if (objA != coroutineSingletons) {
                kotlinToastManager = kotlinToastManager2;
                KotlinToastManagerKt.a(kotlinToastManager, (String) objA, ToastLength.LONG);
            }
            return coroutineSingletons;
        }
        chaloBusComponent.E0(new f(19, saveRideEligible, (ChaloUseCaseResult.Success) chaloUseCaseResult));
        HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "ride preference save ride success", null, Source.CHALO_BUS_SCREEN_TAB, 14);
        return Unit.f17538a;
    }

    public static Serializable S0(ChaloBusComponent chaloBusComponent, ProductPurchaseNudgeInfo productPurchaseNudgeInfo, ArrayList arrayList, boolean z, PBOriginDestinationAppModel pBOriginDestinationAppModel, List list, ContinuationImpl continuationImpl, int i) {
        if ((i & 1) != 0) {
            productPurchaseNudgeInfo = chaloBusComponent.V0();
        }
        ProductPurchaseNudgeInfo productPurchaseNudgeInfo2 = productPurchaseNudgeInfo;
        List listX0 = arrayList;
        if ((i & 2) != 0) {
            listX0 = chaloBusComponent.X0();
        }
        List list2 = listX0;
        if ((i & 4) != 0) {
            z = ((ChaloBusViewState) chaloBusComponent.f.getValue()).t;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            pBOriginDestinationAppModel = ((ChaloBusViewState) chaloBusComponent.f.getValue()).s;
        }
        PBOriginDestinationAppModel pBOriginDestinationAppModel2 = pBOriginDestinationAppModel;
        if ((i & 16) != 0) {
            list = ((ChaloBusViewState) chaloBusComponent.f.getValue()).e;
        }
        return chaloBusComponent.R0(productPurchaseNudgeInfo2, list2, z2, pBOriginDestinationAppModel2, list, continuationImpl);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable R0(ProductPurchaseNudgeInfo productPurchaseNudgeInfo, List list, boolean z, PBOriginDestinationAppModel pBOriginDestinationAppModel, List list2, ContinuationImpl continuationImpl) {
        ChaloBusComponent$buildSectionList$1 chaloBusComponent$buildSectionList$1;
        if (continuationImpl instanceof ChaloBusComponent$buildSectionList$1) {
            chaloBusComponent$buildSectionList$1 = (ChaloBusComponent$buildSectionList$1) continuationImpl;
            int i = chaloBusComponent$buildSectionList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloBusComponent$buildSectionList$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloBusComponent$buildSectionList$1 = new ChaloBusComponent$buildSectionList$1(this, continuationImpl);
            }
        } else {
            chaloBusComponent$buildSectionList$1 = new ChaloBusComponent$buildSectionList$1(this, continuationImpl);
        }
        Object objB = chaloBusComponent$buildSectionList$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloBusComponent$buildSectionList$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            chaloBusComponent$buildSectionList$1.L$0 = productPurchaseNudgeInfo;
            chaloBusComponent$buildSectionList$1.L$1 = list;
            chaloBusComponent$buildSectionList$1.L$2 = pBOriginDestinationAppModel;
            chaloBusComponent$buildSectionList$1.L$3 = list2;
            chaloBusComponent$buildSectionList$1.Z$0 = z;
            chaloBusComponent$buildSectionList$1.label = 1;
            objB = this.s.b(StringEnum.WHATS_NEW, new Object[0], chaloBusComponent$buildSectionList$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = chaloBusComponent$buildSectionList$1.Z$0;
            list2 = (List) chaloBusComponent$buildSectionList$1.L$3;
            pBOriginDestinationAppModel = (PBOriginDestinationAppModel) chaloBusComponent$buildSectionList$1.L$2;
            list = (List) chaloBusComponent$buildSectionList$1.L$1;
            productPurchaseNudgeInfo = (ProductPurchaseNudgeInfo) chaloBusComponent$buildSectionList$1.L$0;
            ResultKt.b(objB);
        }
        String str = (String) objB;
        ChaloBusLandingSectionType.BuyPassNudge buyPassNudge = productPurchaseNudgeInfo != null ? new ChaloBusLandingSectionType.BuyPassNudge(productPurchaseNudgeInfo) : null;
        ChaloBusLandingSectionType.Tutorial tutorial = list != null ? new ChaloBusLandingSectionType.Tutorial(list) : null;
        ChaloBusLandingSectionType.WhatsNewPlotline whatsNewPlotline = new ChaloBusLandingSectionType.WhatsNewPlotline(str);
        if (z) {
            boolean z2 = ((ChaloBusViewState) this.f.getValue()).v;
            List list3 = list2;
            boolean z3 = list3 == null || list3.isEmpty();
            boolean z4 = pBOriginDestinationAppModel != null && pBOriginDestinationAppModel.c.length() > 0 && pBOriginDestinationAppModel.h.length() > 0 && !pBOriginDestinationAppModel.f7091a.isEmpty();
            if (!z2 && !z3 && z4) {
                return ArraysKt.G(new ChaloBusLandingSectionType[]{buyPassNudge, whatsNewPlotline, tutorial});
            }
        }
        return ArraysKt.G(new ChaloBusLandingSectionType[]{tutorial, buyPassNudge, whatsNewPlotline});
    }

    public final void T0(PBOriginDestinationAppModel pBOriginDestinationAppModel) {
        List list;
        String str;
        String str2;
        String str3;
        this.Z = BuildersKt.d(this.j, null, null, new ChaloBusComponent$fetchProductConfigAndUpdateStateForProductPurchaseNudge$1(this, (pBOriginDestinationAppModel == null || (str3 = pBOriginDestinationAppModel.c) == null) ? "" : str3, (pBOriginDestinationAppModel == null || (str2 = pBOriginDestinationAppModel.h) == null) ? "" : str2, ((Boolean) this.o.getG().getValue()).booleanValue(), (pBOriginDestinationAppModel == null || (list = pBOriginDestinationAppModel.f7091a) == null || (str = (String) CollectionsKt.H(list)) == null) ? "" : str, pBOriginDestinationAppModel, null), 3);
    }

    public final void U0(PBOriginDestinationAppModel pBOriginDestinationAppModel) {
        Job job;
        Job job2 = this.Z;
        if (job2 != null && ((AbstractCoroutine) job2).isActive() && (job = this.Z) != null) {
            ((JobSupport) job).cancel(null);
        }
        int i = WhenMappings.f3235a[V0().b.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            T0(pBOriginDestinationAppModel);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            this.T.a(this.j, new ChaloBusComponent$syncNudgeExpiryTicker$1(1, this, ChaloBusComponent.class, "currentNudgeExpiryStates", "currentNudgeExpiryStates(J)Ljava/util/List;", 0), new ChaloBusComponent$syncNudgeExpiryTicker$2(this, null));
        }
    }

    public final ProductPurchaseNudgeInfo V0() {
        ProductPurchaseNudgeInfo productPurchaseNudgeInfo;
        List list = ((ChaloBusViewState) this.f.getValue()).u;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof ChaloBusLandingSectionType.BuyPassNudge) {
                arrayList.add(obj);
            }
        }
        ChaloBusLandingSectionType.BuyPassNudge buyPassNudge = (ChaloBusLandingSectionType.BuyPassNudge) CollectionsKt.H(arrayList);
        return (buyPassNudge == null || (productPurchaseNudgeInfo = buyPassNudge.f3245a) == null) ? new ProductPurchaseNudgeInfo(EmptyList.f17557a, ProductPurchaseNudgeUiStatus.NONE, null, null) : productPurchaseNudgeInfo;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object W0(ContinuationImpl continuationImpl) {
        ChaloBusComponent$getEvaluatedPremiumBusConfig$1 chaloBusComponent$getEvaluatedPremiumBusConfig$1;
        ChaloBusComponent chaloBusComponent;
        if (continuationImpl instanceof ChaloBusComponent$getEvaluatedPremiumBusConfig$1) {
            chaloBusComponent$getEvaluatedPremiumBusConfig$1 = (ChaloBusComponent$getEvaluatedPremiumBusConfig$1) continuationImpl;
            int i = chaloBusComponent$getEvaluatedPremiumBusConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloBusComponent$getEvaluatedPremiumBusConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloBusComponent$getEvaluatedPremiumBusConfig$1 = new ChaloBusComponent$getEvaluatedPremiumBusConfig$1(this, continuationImpl);
            }
        } else {
            chaloBusComponent$getEvaluatedPremiumBusConfig$1 = new ChaloBusComponent$getEvaluatedPremiumBusConfig$1(this, continuationImpl);
        }
        Object objA = chaloBusComponent$getEvaluatedPremiumBusConfig$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloBusComponent$getEvaluatedPremiumBusConfig$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            PremiumBusNativeCityWiseConfigAppModel premiumBusNativeCityWiseConfigAppModel = this.U;
            if (premiumBusNativeCityWiseConfigAppModel != null) {
                return premiumBusNativeCityWiseConfigAppModel;
            }
            chaloBusComponent$getEvaluatedPremiumBusConfig$1.L$0 = this;
            chaloBusComponent$getEvaluatedPremiumBusConfig$1.label = 1;
            objA = this.l.a(chaloBusComponent$getEvaluatedPremiumBusConfig$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            chaloBusComponent = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chaloBusComponent = (ChaloBusComponent) chaloBusComponent$getEvaluatedPremiumBusConfig$1.L$0;
            ResultKt.b(objA);
        }
        PremiumBusNativeCityWiseConfigAppModel premiumBusNativeCityWiseConfigAppModel2 = (PremiumBusNativeCityWiseConfigAppModel) objA;
        chaloBusComponent.U = premiumBusNativeCityWiseConfigAppModel2;
        return premiumBusNativeCityWiseConfigAppModel2;
    }

    public final List X0() {
        List list = ((ChaloBusViewState) this.f.getValue()).u;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof ChaloBusLandingSectionType.Tutorial) {
                arrayList.add(obj);
            }
        }
        ChaloBusLandingSectionType.Tutorial tutorial = (ChaloBusLandingSectionType.Tutorial) CollectionsKt.H(arrayList);
        if (tutorial != null) {
            return tutorial.f3246a;
        }
        return null;
    }

    public final void Y0() {
        this.t.b(new ChaloNavigationRequest.Navigate(new PremiumBusArgs.PremiumBusPassLandingScreenArgs(PassLandingFlowType.WithoutConfigId.INSTANCE, Source.CHALO_BUS_SCREEN_TAB, this.q.u(), 4), null, null, 6));
    }

    public final void Z0(ChaloBusViewIntent intent) {
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel;
        String strA;
        Job job;
        String strValueOf;
        String strValueOf2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Job job2;
        Job job3;
        Source source;
        String strA2;
        Job job4;
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z = intent instanceof ChaloBusViewIntent.ChaloBusScreenInitializationIntent;
        int i = 0;
        char c = 1;
        char c2 = 1;
        char c3 = 1;
        ContextScope contextScope = this.j;
        if (z) {
            ChaloBusViewIntent.ChaloBusScreenInitializationIntent chaloBusScreenInitializationIntent = (ChaloBusViewIntent.ChaloBusScreenInitializationIntent) intent;
            Job job5 = this.W;
            if (job5 != null) {
                ((JobSupport) job5).cancel(null);
            }
            this.W = BuildersKt.d(contextScope, null, null, new ChaloBusComponent$getPassSavingsInfo$1(this, null), 3);
            Job job6 = this.X;
            if (job6 != null && ((JobSupport) job6).isActive() && (job4 = this.X) != null) {
                ((JobSupport) job4).cancel(null);
            }
            this.X = w0(new ChaloBusComponent$fetchChaloBusPassesFromDbIfAvailableAndUpdateState$1(this, null));
            if (this.V) {
                this.V = false;
                BuildersKt.d(contextScope, null, null, new ChaloBusComponent$setInitialData$1(this, chaloBusScreenInitializationIntent.f3262a, null), 3);
                w0(new ChaloBusComponent$handleChaloBusScreenInitializationIntent$1(this, null));
                return;
            }
            return;
        }
        boolean zEquals = intent.equals(ChaloBusViewIntent.PBExploreAvailableRoutesClicked.f3268a);
        HomeScreenAnalyticsHelper homeScreenAnalyticsHelper = this.r;
        ChaloBusViewIntent.BottomSheetDismissIntent bottomSheetDismissIntent = ChaloBusViewIntent.BottomSheetDismissIntent.f3260a;
        ChaloNavigationManager chaloNavigationManager = this.t;
        if (zEquals) {
            Source source2 = Source.CHALO_BUS_SCREEN_TAB;
            HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "PB explore routes clicked", null, source2, 14);
            Z0(bottomSheetDismissIntent);
            ChaloNavigationManagerKt.e(chaloNavigationManager, new ChaloBusRouteInfoScreenArgs(source2), null, 6);
            return;
        }
        if (intent.equals(ChaloBusViewIntent.ProceedBtnClickIntent.f3273a)) {
            Job job7 = this.e0;
            if (job7 != null) {
                ((JobSupport) job7).cancel(null);
            }
            this.e0 = w0(new ChaloBusComponent$handleProceedBtnClickIntent$1(this, null));
            return;
        }
        if (intent instanceof ChaloBusViewIntent.StopSelectionFieldClickedIntent) {
            ChaloBusViewIntent.StopSelectionFieldClickedIntent stopSelectionFieldClickedIntent = (ChaloBusViewIntent.StopSelectionFieldClickedIntent) intent;
            if (((ChaloBusViewState) t0().a()).g) {
                return;
            }
            Job job8 = this.m0;
            if (job8 != null) {
                ((JobSupport) job8).cancel(null);
            }
            String strA3 = KUUID.a();
            PBStopSearchSource pBStopSearchSource = stopSelectionFieldClickedIntent.f3279a;
            int i2 = WhenMappings.b[pBStopSearchSource.ordinal()];
            if (i2 == 1 || i2 == 2) {
                source = Source.PREMIUM_FROM_STOP_SELECTION;
            } else {
                if (i2 != 3 && i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                source = Source.PREMIUM_TO_STOP_SELECTION;
            }
            UniversalSearchFlowSource universalSearchFlowSource = source == Source.PREMIUM_FROM_STOP_SELECTION ? UniversalSearchFlowSource.PREMIUM_FROM_STOP_SELECTION : UniversalSearchFlowSource.PREMIUM_TO_STOP_SELECTION;
            UniversalSearchOptions universalSearchOptions = new UniversalSearchOptions(ArraysKt.j0(new UniversalSearchOption[]{new UniversalSearchOption.STOPS(true, true), new UniversalSearchOption.PLACES(true, true)}));
            try {
                Json json = ChaloJson.b;
                json.getClass();
                strA2 = json.a(UniversalSearchOptions.INSTANCE.serializer(), universalSearchOptions);
            } catch (Exception unused) {
                strA2 = null;
            }
            if (strA2 == null) {
                return;
            }
            this.m0 = BuildersKt.d(contextScope, null, null, new ChaloBusComponent$navigateToUniversalSearchForResult$1(this, strA3, pBStopSearchSource, universalSearchFlowSource, strA2, null), 3);
            return;
        }
        if (intent instanceof ChaloBusViewIntent.StopSelectionFieldResultIntent) {
            ChaloBusViewIntent.StopSelectionFieldResultIntent stopSelectionFieldResultIntent = (ChaloBusViewIntent.StopSelectionFieldResultIntent) intent;
            PBStopSearchSource pBStopSearchSource2 = stopSelectionFieldResultIntent.b;
            PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2 = stopSelectionFieldResultIntent.f3280a;
            int i3 = WhenMappings.b[pBStopSearchSource2.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
                E0(new vg(pBStopSearchSource2 == PBStopSearchSource.FROM_STOP_SUGGESTION, pBStopPlaceSelectedAppModel2, i));
                return;
            }
            if (pBStopSearchSource2 == PBStopSearchSource.FROM_STOP_SEARCH) {
                E0(new tg(pBStopPlaceSelectedAppModel2, i));
                return;
            } else {
                E0(new tg(pBStopPlaceSelectedAppModel2, c3 == true ? 1 : 0));
                return;
            }
        }
        if (intent.equals(ChaloBusViewIntent.StopSwapButtonClickedIntent.f3281a)) {
            E0(new we(24));
            return;
        }
        if (intent instanceof ChaloBusViewIntent.ChaloBusPageItemClickedIntent) {
            BuildersKt.d(contextScope, null, null, new ChaloBusComponent$handleChaloBusPageItemClickedIntent$1((ChaloBusViewIntent.ChaloBusPageItemClickedIntent) intent, this, null), 3);
            return;
        }
        if (intent.equals(ChaloBusViewIntent.SeeAllPassesClickedIntent.f3278a)) {
            HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "see all passes clicked", null, Source.CHALO_BUS_SCREEN_TAB, 14);
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new ProductSelectionArgs(null, "", null, null, false, null, 248), null, null, 6));
            return;
        }
        boolean zEquals2 = intent.equals(bottomSheetDismissIntent);
        ChaloBusSideEffect.HideBottomSheet hideBottomSheet = ChaloBusSideEffect.HideBottomSheet.f3257a;
        if (zEquals2) {
            if (((ChaloBusViewState) t0().a()).d == null) {
                return;
            }
            E0(new we(20));
            HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "chalo tab bottom sheet dismissed", vo1.s("bottomSheetType", String.valueOf(((ChaloBusViewState) t0().a()).d)), Source.CHALO_BUS_SCREEN_TAB, 12);
            r0(hideBottomSheet);
            return;
        }
        boolean zEquals3 = intent.equals(ChaloBusViewIntent.ChaloBusScreenViewStartedIntent.f3264a);
        StateFlow stateFlow = this.f;
        if (zEquals3) {
            Job job9 = this.W;
            if (job9 != null) {
                ((JobSupport) job9).cancel(null);
            }
            this.W = BuildersKt.d(contextScope, null, null, new ChaloBusComponent$getPassSavingsInfo$1(this, null), 3);
            Job job10 = this.c0;
            if (job10 != null && ((AbstractCoroutine) job10).isActive() && (job3 = this.c0) != null) {
                ((JobSupport) job3).cancel(null);
            }
            this.c0 = BuildersKt.d(contextScope, null, null, new ChaloBusComponent$fetchRollOverBannerAndUpdateStateIfApplicable$1(this, null), 3);
            if (X0() == null && ((job2 = this.d0) == null || !((AbstractCoroutine) job2).isActive())) {
                this.d0 = BuildersKt.d(contextScope, null, null, new ChaloBusComponent$fetchContentConfigInfo$1(this, null), 3);
            }
            U0(((ChaloBusViewState) stateFlow.getValue()).s);
            return;
        }
        if (intent.equals(ChaloBusViewIntent.ChaloBusScreenStopIntent.f3263a)) {
            E0(new we(17));
            Job job11 = this.W;
            if (job11 != null) {
                ((JobSupport) job11).cancel(null);
            }
            this.W = null;
            Job job12 = this.c0;
            if (job12 != null) {
                ((JobSupport) job12).cancel(null);
            }
            this.c0 = null;
            Job job13 = this.X;
            if (job13 != null) {
                ((JobSupport) job13).cancel(null);
            }
            this.X = null;
            Job job14 = this.Y;
            if (job14 != null) {
                ((JobSupport) job14).cancel(null);
            }
            this.Y = null;
            PricingEngineRuleExpiryCountdownController pricingEngineRuleExpiryCountdownController = this.T.f7229a;
            Job job15 = pricingEngineRuleExpiryCountdownController.b;
            if (job15 != null) {
                ((JobSupport) job15).cancel(null);
            }
            pricingEngineRuleExpiryCountdownController.b = null;
            Job job16 = this.d0;
            if (job16 != null) {
                ((JobSupport) job16).cancel(null);
            }
            this.d0 = null;
            Job job17 = this.e0;
            if (job17 != null) {
                ((JobSupport) job17).cancel(null);
            }
            this.e0 = null;
            return;
        }
        if (intent instanceof ChaloBusViewIntent.UpdateScreenStateIntent) {
            this.u.b(((ChaloBusViewIntent.UpdateScreenStateIntent) intent).f3285a);
            return;
        }
        if (intent.equals(ChaloBusViewIntent.OnNotificationIconClicked.f3265a)) {
            homeScreenAnalyticsHelper.u(Source.CHALO_BUS_SCREEN_TAB);
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(PremiumBusNotificationArgs.INSTANCE, null, null, 6));
            return;
        }
        if (intent.equals(ChaloBusViewIntent.TimePickerContinueBtnClickedIntent.f3282a)) {
            BuildersKt.d(contextScope, null, null, new ChaloBusComponent$handleTimePickerContinueBtnClickedIntent$1(this, null), 3);
            return;
        }
        if (intent instanceof ChaloBusViewIntent.OnTimeChangeIntent) {
            ChaloBusViewIntent.OnTimeChangeIntent onTimeChangeIntent = (ChaloBusViewIntent.OnTimeChangeIntent) intent;
            String str6 = onTimeChangeIntent.c;
            int i4 = onTimeChangeIntent.f3267a;
            if (!Intrinsics.d(str6, "AM")) {
                i = i4 == 12 ? 12 : i4 + 12;
            } else if (i4 != 12) {
                i = i4;
            }
            E0(new l4(this, i, onTimeChangeIntent, c2 == true ? 1 : 0));
            return;
        }
        if (intent.equals(ChaloBusViewIntent.BackPressedOnDateAndTimePickerBottomSheet.f3259a)) {
            if (((ChaloBusViewState) t0().a()).d != null) {
                E0(new we(16));
                r0(hideBottomSheet);
                this.q.d(true);
                return;
            }
            return;
        }
        if (intent.equals(ChaloBusViewIntent.RemoveBottomSheetContentIntent.f3277a)) {
            E0(new we(22));
            return;
        }
        if (intent.equals(ChaloBusViewIntent.ProceedButtonShimmerShownIntent.f3274a)) {
            E0(new we(19));
            return;
        }
        if (intent.equals(ChaloBusViewIntent.PassSavingsBannerInfoBtnClickedIntent.f3270a)) {
            List list = ((ChaloBusViewState) t0().a()).p;
            HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "pb pass savings info btn clicked", vo1.s("faqsSize", String.valueOf(list != null ? Integer.valueOf(list.size()) : null)), Source.CHALO_BUS_SCREEN_TAB, 12);
            List list2 = list;
            if (list2 == null || list2.isEmpty()) {
                return;
            }
            E0(new ud(list, c == true ? 1 : 0));
            r0(ChaloBusSideEffect.ShowBottomSheet.f3258a);
            return;
        }
        if (intent instanceof ChaloBusViewIntent.OnRollOverBannerClickedIntent) {
            BannerDataResponseAppModel bannerDataResponseAppModel = ((ChaloBusViewIntent.OnRollOverBannerClickedIntent) intent).f3266a;
            BannerMetaAppModel bannerMetaAppModel = bannerDataResponseAppModel.b;
            Source source3 = Source.CHALO_BUS_SCREEN_TAB;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Integer num = bannerMetaAppModel.f2953a;
            SuperPassTripPreferences superPassTripPreferences = bannerMetaAppModel.f;
            String str7 = "";
            if (num == null || (strValueOf = String.valueOf(num.intValue())) == null) {
                strValueOf = "";
            }
            linkedHashMap.put("rideApplicableForRollOver", strValueOf);
            Integer num2 = bannerMetaAppModel.b;
            if (num2 == null || (strValueOf2 = String.valueOf(num2.intValue())) == null) {
                strValueOf2 = "";
            }
            linkedHashMap.put("passExpiringInDays", strValueOf2);
            linkedHashMap.put("isExpired", String.valueOf(bannerMetaAppModel.c));
            String str8 = bannerMetaAppModel.d;
            if (str8 == null) {
                str8 = "";
            }
            linkedHashMap.put("passId", str8);
            String str9 = bannerMetaAppModel.e;
            if (str9 == null) {
                str9 = "";
            }
            linkedHashMap.put("configId", str9);
            if (superPassTripPreferences == null || (str = superPassTripPreferences.f9575a) == null) {
                str = "";
            }
            linkedHashMap.put("tripPreferenceRouteId", str);
            if (superPassTripPreferences == null || (str2 = superPassTripPreferences.b) == null) {
                str2 = "";
            }
            linkedHashMap.put("tripPreferenceStartStopId", str2);
            if (superPassTripPreferences == null || (str3 = superPassTripPreferences.d) == null) {
                str3 = "";
            }
            linkedHashMap.put("tripPreferenceEndStopId", str3);
            if (superPassTripPreferences == null || (str4 = superPassTripPreferences.c) == null) {
                str4 = "";
            }
            linkedHashMap.put("tripPreferenceStartStopName", str4);
            if (superPassTripPreferences != null && (str5 = superPassTripPreferences.e) != null) {
                str7 = str5;
            }
            linkedHashMap.put("tripPreferenceEndStopName", str7);
            linkedHashMap.put("passTierType", bannerMetaAppModel.g.getTierTypeStr());
            HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "pb pass renewable banner clicked", linkedHashMap, source3, 12);
            BuildersKt.d(contextScope, null, null, new ChaloBusComponent$handleOnRollOverBannerClickedIntent$1(bannerDataResponseAppModel, this, bannerMetaAppModel, null), 3);
            return;
        }
        if (intent instanceof ChaloBusViewIntent.PassHistoryItemClickedIntent) {
            ChaloBusPassHistory chaloBusPassHistory = ((ChaloBusViewIntent.PassHistoryItemClickedIntent) intent).f3269a;
            Source source4 = Source.CHALO_BUS_SCREEN_TAB;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("passId", chaloBusPassHistory.b);
            linkedHashMap2.put("configId", chaloBusPassHistory.f3249a);
            linkedHashMap2.put("fareMappingId", String.valueOf(chaloBusPassHistory.c));
            linkedHashMap2.put("pass status", chaloBusPassHistory.e.getS());
            linkedHashMap2.put("isExpired", String.valueOf(chaloBusPassHistory.k));
            linkedHashMap2.put("productSubType", SuperPassSubTypeKt.a(chaloBusPassHistory.j).getSubType());
            HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "pb pass info on home screen clicked", linkedHashMap2, source4, 12);
            BuildersKt.d(contextScope, null, null, new ChaloBusComponent$handlePassHistoryItemClickedIntent$1(this, chaloBusPassHistory, null), 3);
            return;
        }
        if (intent instanceof ChaloBusViewIntent.ProductPurchaseNudgeInfoCardClick) {
            ChaloBusViewIntent.ProductPurchaseNudgeInfoCardClick productPurchaseNudgeInfoCardClick = (ChaloBusViewIntent.ProductPurchaseNudgeInfoCardClick) intent;
            Job job18 = this.a0;
            if (job18 != null && ((AbstractCoroutine) job18).isActive() && (job = this.a0) != null) {
                ((JobSupport) job).cancel(null);
            }
            ProductPurchaseNudgeDisplayInfo productPurchaseNudgeDisplayInfo = productPurchaseNudgeInfoCardClick.f3275a;
            HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "product purchase nudge card clicked", MapsKt.i(new Pair("productName", productPurchaseNudgeDisplayInfo.f3298a), new Pair("productId", productPurchaseNudgeDisplayInfo.b)), Source.CHALO_BUS_SCREEN_TAB, 12);
            this.a0 = BuildersKt.d(contextScope, null, null, new ChaloBusComponent$handleProductPurchaseNudgeInfoCardClick$1(this, productPurchaseNudgeInfoCardClick, null), 3);
            return;
        }
        if (intent instanceof ChaloBusViewIntent.ProductPurchaseNudgeSectionCtaClicked) {
            ChaloBusViewIntent.ProductPurchaseNudgeSectionCtaClicked productPurchaseNudgeSectionCtaClicked = (ChaloBusViewIntent.ProductPurchaseNudgeSectionCtaClicked) intent;
            HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "product purchase nudge section cta clicked", vo1.s("ctaType", productPurchaseNudgeSectionCtaClicked.f3276a.name()), Source.CHALO_BUS_SCREEN_TAB, 12);
            BuildersKt.d(contextScope, null, null, new ChaloBusComponent$handleProductPurchaseNudgeSectionCtaClicked$1(productPurchaseNudgeSectionCtaClicked, this, null), 3);
            return;
        }
        if (intent instanceof ChaloBusViewIntent.PremiumBusTutorialClickedIntent) {
            ChaloBusViewIntent.PremiumBusTutorialClickedIntent premiumBusTutorialClickedIntent = (ChaloBusViewIntent.PremiumBusTutorialClickedIntent) intent;
            HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "pb tutorial clicked", MapsKt.i(new Pair("tutorial title", premiumBusTutorialClickedIntent.f3271a), new Pair("tutorial url", premiumBusTutorialClickedIntent.b)), Source.CHALO_BUS_SCREEN_TAB, 12);
            BuildersKt.d(contextScope, null, null, new ChaloBusComponent$handlePremiumBusTutorialBannerClickedIntent$1(this, premiumBusTutorialClickedIntent, null), 3);
            return;
        }
        if (intent.equals(ChaloBusViewIntent.PremiumBusTutorialViewAllClickedIntent.f3272a)) {
            List listX0 = X0();
            HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "pb tutorial view all clicked", MapsKt.h(new Pair("tutorial size", Integer.valueOf(listX0 != null ? listX0.size() : 0))), Source.CHALO_BUS_SCREEN_TAB, 12);
            List list3 = listX0;
            if (list3 == null || list3.isEmpty()) {
                return;
            }
            try {
                Json json2 = ChaloJson.b;
                json2.getClass();
                strA = json2.a(new ArrayListSerializer(PremiumBusTutorialConfigUiModel.INSTANCE.serializer()), listX0);
            } catch (Exception unused2) {
                strA = null;
            }
            if (strA == null) {
                return;
            }
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new PremiumBusTutorialScreenArgs(strA), null, null, 6));
            return;
        }
        if (!(intent instanceof ChaloBusViewIntent.ToggleSaveRideIntent)) {
            if (!(intent instanceof ChaloBusViewIntent.UpdateSavedRideTimeIntent)) {
                throw new NoWhenBranchMatchedException();
            }
            Source source5 = Source.CHALO_BUS_SCREEN_TAB;
            HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "ride preference update time clicked", null, source5, 14);
            E0(new we(18));
            ChaloNavigationManagerKt.e(chaloNavigationManager, new SavedPlacesAndRidesArgs(source5), null, 6);
            return;
        }
        ChaloBusViewIntent.ToggleSaveRideIntent toggleSaveRideIntent = (ChaloBusViewIntent.ToggleSaveRideIntent) intent;
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel3 = ((ChaloBusViewState) stateFlow.getValue()).h;
        if (pBStopPlaceSelectedAppModel3 == null || (pBStopPlaceSelectedAppModel = ((ChaloBusViewState) stateFlow.getValue()).i) == null) {
            return;
        }
        RidePreferenceBannerState ridePreferenceBannerState = ((ChaloBusViewState) stateFlow.getValue()).w;
        if (ridePreferenceBannerState instanceof RidePreferenceBannerState.SaveRideEligible) {
            HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "ride preference save ride toggled", MapsKt.h(new Pair("ridePreferenceShouldSave", Boolean.valueOf(toggleSaveRideIntent.f3283a))), Source.CHALO_BUS_SCREEN_TAB, 12);
            E0(new we(23));
            BuildersKt.d(contextScope, null, null, new ChaloBusComponent$handleToggleSaveRideIntent$2(toggleSaveRideIntent, this, ridePreferenceBannerState, pBStopPlaceSelectedAppModel3, pBStopPlaceSelectedAppModel, null), 3);
        }
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        return (ChaloBusViewState) obj;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new ChaloBusViewState(null, false, 0, null, null, new TabMetaDataAppModel(), false, null, null, false, null, null, null, null, null, null, null, null, null, false, EmptyList.f17557a, false, RidePreferenceBannerState.Hidden.f3301a, null, null, null);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void x0() {
        Job job = this.b0;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        Job job2 = this.W;
        if (job2 != null) {
            ((JobSupport) job2).cancel(null);
        }
        Job job3 = this.c0;
        if (job3 != null) {
            ((JobSupport) job3).cancel(null);
        }
        Job job4 = this.X;
        if (job4 != null) {
            ((JobSupport) job4).cancel(null);
        }
        Job job5 = this.Y;
        if (job5 != null) {
            ((JobSupport) job5).cancel(null);
        }
        Job job6 = this.m0;
        if (job6 != null) {
            ((JobSupport) job6).cancel(null);
        }
        PricingEngineRuleExpiryCountdownController pricingEngineRuleExpiryCountdownController = this.T.f7229a;
        Job job7 = pricingEngineRuleExpiryCountdownController.b;
        if (job7 != null) {
            ((JobSupport) job7).cancel(null);
        }
        pricingEngineRuleExpiryCountdownController.b = null;
        Job job8 = this.d0;
        if (job8 != null) {
            ((JobSupport) job8).cancel(null);
        }
        Job job9 = this.e0;
        if (job9 != null) {
            ((JobSupport) job9).cancel(null);
        }
    }
}
