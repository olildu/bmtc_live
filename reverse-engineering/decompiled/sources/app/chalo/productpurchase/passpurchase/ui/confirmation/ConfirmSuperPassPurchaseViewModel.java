package app.chalo.productpurchase.passpurchase.ui.confirmation;

import androidx.browser.customtabs.CustomTabsCallback;
import androidx.compose.runtime.ComposerKt;
import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.domain.MinProfileAnalyticsHelper;
import app.chalo.domain.ProductPurchaseMinProfileDecision;
import app.chalo.domain.ProductPurchaseMinProfileDecisionHelper;
import app.chalo.domain.ResolveProductPurchaseMinProfileDecisionUseCase;
import app.chalo.features.checkout.CheckoutIntentModel;
import app.chalo.features.onetimeoffer.IUserPreferencesDataStore;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.fileupload.picker.BitmapImage;
import app.chalo.home.data.mappers.BannerStatus;
import app.chalo.home.data.model.app.response.BannerDataResponseAppModel;
import app.chalo.home.data.model.app.response.BannerUiDataAppModel;
import app.chalo.home.domain.FetchBannerUseCase;
import app.chalo.home.domain.GetPremiumPassExpiryEligibilityForPurchaseUseCase;
import app.chalo.login.userprofiling.hookorchestrator.UserProfilingHookSlot;
import app.chalo.models.BookableSuperPassConfiguration;
import app.chalo.models.BookableSuperPassConfigurationKt;
import app.chalo.models.SuperPassProductConfigurationProperties;
import app.chalo.models.ordercreation.CreateOrderResponseAppModel;
import app.chalo.models.productbooking.SuperPassPurchaseStopsInfo;
import app.chalo.network.config.ChaloJson;
import app.chalo.premiumbus.data.models.app.ApplicableRuleUxCopyAppModel;
import app.chalo.premiumbus.domains.CheckIfContinueWithBulkBookingFlowUseCase;
import app.chalo.productbooking.common.data.models.app.ProductConfigFareBreakupAppModel;
import app.chalo.productpurchase.passpurchase.data.ProofUploadDetails;
import app.chalo.productpurchase.passpurchase.domain.CreateSuperPassOrderUseCase;
import app.chalo.productpurchase.passpurchase.domain.FetchSuperPassCashPaymentInfoUseCase;
import app.chalo.productpurchase.passpurchase.domain.RefreshSelectedBookableSuperPassConfigurationUseCase;
import app.chalo.productpurchase.passpurchase.domain.SubmitSuperPassApplicationUseCase;
import app.chalo.productpurchase.passpurchase.domain.SuperPassOrderCreationError;
import app.chalo.productpurchase.passpurchase.domain.SuperPassOrderType;
import app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedContractKt;
import app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedState;
import app.chalo.productpurchase.passpurchase.ui.decompose.SuperPassScreenBaseComponent;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.EnlargeProofImage;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperProofImageUIState;
import app.chalo.productpurchase.passpurchase.utils.SuperPassCheckoutIntentModelHelperKt;
import app.chalo.productpurchase.productselection.data.models.app.AllProductConfigsResponseAppModelKt;
import app.chalo.productpurchase.productselection.data.models.app.SuperPassProductConfigFareMappingResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.app.SuperPassProductConfigSubCategoryResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.app.SuperPassProductFareInfoResponseAppModel;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.resultstatemanager.ResultStateData;
import app.chalo.resultstatemanager.ResultStateRecoveredData;
import app.chalo.resultstatemanager.checkout.CheckoutResultState;
import app.chalo.resultstatemanager.checkout.CheckoutResultStateManager;
import app.chalo.resultstatemanager.minprofileupdate.MinProfileUpdateResultStateManager;
import app.chalo.scenes.ChaloNavOptions;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.ChaloScenes;
import app.chalo.scenes.PopUpToConfig;
import app.chalo.scenes.args.CheckoutPaymentMainArgs;
import app.chalo.scenes.args.ProductSelectionArgs;
import app.chalo.scenes.args.SuperPassBasicUserPurpose;
import app.chalo.scenes.args.SuperPassPurchaseArgs;
import app.chalo.superpass.data.models.entities.SuperPassUserDetails;
import app.chalo.superpass.data.repository.SuperPassRepository;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.ChaloTextStyleHelper;
import app.chalo.uistate.text.StyledTextClickHandler$Companion$create$1;
import app.chalo.uistate.text.StyledTextDataUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.TextWithSpecialFeatureBuilder;
import app.chalo.uistate.text.TextWithSpecialFeaturesTagsUIStateKt;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.uistate.toolbar.ToolbarActionsUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import app.chalo.usecase.GetTimeInMillisAfterXTimeUseCase;
import app.chalo.userprofile.UserProfileAppModel;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.utils.FareUtils;
import app.chalo.utils.KUUID;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.arkivanov.decompose.ComponentContext;
import com.arkivanov.essenty.statekeeper.StateKeeper;
import com.google.firebase.messaging.ServiceStarter;
import defpackage.cb0;
import defpackage.hq0;
import defpackage.ps;
import defpackage.qs;
import defpackage.ti;
import defpackage.vo1;
import defpackage.wn;
import defpackage.z40;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.json.Json;
import org.apache.commons.io.IOUtils;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseViewModel;", "Lapp/chalo/productpurchase/passpurchase/ui/decompose/SuperPassScreenBaseComponent;", "Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseDataState;", "Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseUIState;", "Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseEffect;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConfirmSuperPassPurchaseViewModel extends SuperPassScreenBaseComponent<ConfirmSuperPassPurchaseIntent, ConfirmSuperPassPurchaseDataState, ConfirmSuperPassPurchaseUIState, ConfirmSuperPassPurchaseEffect> {
    public final CityProvider A;
    public final IUserPreferencesDataStore B;
    public final SubmitSuperPassApplicationUseCase C;
    public final CurrencyFeature D;
    public final GetPremiumPassExpiryEligibilityForPurchaseUseCase E;
    public final FetchBannerUseCase F;
    public final RefreshSelectedBookableSuperPassConfigurationUseCase G;
    public final ProductPurchaseMinProfileDecisionHelper H;
    public Job I;
    public Job J;
    public CreateOrderResponseAppModel K;
    public final Lazy L;
    public final SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs k;
    public final SuperPassConfirmationManager l;
    public final StringProvider m;
    public final AnalyticsContract n;
    public final BasicInfoContract o;
    public final GetTimeInMillisAfterXTimeUseCase p;
    public final ChaloNavigationManager q;
    public final TimeUtilsContract r;
    public final CreateSuperPassOrderUseCase s;
    public final SuperPassRepository t;
    public final CheckoutResultStateManager u;
    public final ResolveProductPurchaseMinProfileDecisionUseCase v;
    public final MinProfileUpdateResultStateManager w;
    public final UserProfileDetailsProvider x;
    public final FetchSuperPassCashPaymentInfoUseCase y;
    public final KotlinToastManager z;

    /* JADX INFO: renamed from: app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassPurchaseViewModel$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassPurchaseViewModel$2", f = "ConfirmSuperPassPurchaseViewModel.kt", l = {ComposerKt.providerMapsKey, ComposerKt.providerValuesKey}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ConfirmSuperPassPurchaseViewModel.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ConfirmSuperPassPurchaseViewModel confirmSuperPassPurchaseViewModel;
            ResultStateRecoveredData resultStateRecoveredData;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            Unit unit = Unit.f17538a;
            if (i == 0) {
                ResultKt.b(obj);
                ConfirmSuperPassPurchaseViewModel confirmSuperPassPurchaseViewModel2 = ConfirmSuperPassPurchaseViewModel.this;
                CheckoutResultStateManager checkoutResultStateManager = confirmSuperPassPurchaseViewModel2.u;
                StateKeeper b = confirmSuperPassPurchaseViewModel2.f8402a.getB();
                ConfirmPassPurchaseStateKeeperMeta.Companion companion = ConfirmPassPurchaseStateKeeperMeta.INSTANCE;
                ResultStateRecoveredData resultStateRecoveredDataA = checkoutResultStateManager.a("confirm_pass_purchase_sk_key", b, companion.serializer(), companion.serializer(), new ps(ConfirmSuperPassPurchaseViewModel.this, 14));
                if (resultStateRecoveredDataA != null) {
                    confirmSuperPassPurchaseViewModel = ConfirmSuperPassPurchaseViewModel.this;
                    Flow flow = resultStateRecoveredDataA.b;
                    this.L$0 = resultStateRecoveredDataA;
                    this.L$1 = confirmSuperPassPurchaseViewModel;
                    this.label = 1;
                    Object objV = confirmSuperPassPurchaseViewModel.b.v(flow, this);
                    if (objV != coroutineSingletons) {
                        resultStateRecoveredData = resultStateRecoveredDataA;
                        obj = objV;
                    }
                }
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return unit;
            }
            confirmSuperPassPurchaseViewModel = (ConfirmSuperPassPurchaseViewModel) this.L$1;
            resultStateRecoveredData = (ResultStateRecoveredData) this.L$0;
            ResultKt.b(obj);
            CreateOrderResponseAppModel createOrderResponseAppModel = ((ConfirmPassPurchaseStateKeeperMeta) resultStateRecoveredData.f9052a).b;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            ConfirmSuperPassPurchaseViewModel.r(confirmSuperPassPurchaseViewModel, (ResultStateData) obj, createOrderResponseAppModel);
            return unit == coroutineSingletons ? coroutineSingletons : unit;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseViewModel$Companion;", "", "", "CONFIRM_PASS_PURCHASE_STATE_KEEPER_KEY", "Ljava/lang/String;", "CONFIG_ID", "FM_ID", "CATEGORY_ID", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8383a;

        static {
            int[] iArr = new int[BannerStatus.values().length];
            try {
                iArr[BannerStatus.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BannerStatus.IN_PROCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BannerStatus.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BannerStatus.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f8383a = iArr;
        }
    }

    public ConfirmSuperPassPurchaseViewModel(SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs confirmSuperPassPurchaseArgs, ComponentContext componentContext, SuperPassConfirmationManager superPassConfirmationManager, StringProvider stringProvider, AnalyticsContract analyticsContract, BasicInfoContract basicInfoContract, GetTimeInMillisAfterXTimeUseCase getTimeInMillisAfterXTimeUseCase, ChaloNavigationManager chaloNavigationManager, TimeUtilsContract timeUtilsContract, CreateSuperPassOrderUseCase createSuperPassOrderUseCase, SuperPassRepository superPassRepository, CheckoutResultStateManager checkoutResultStateManager, ResolveProductPurchaseMinProfileDecisionUseCase resolveProductPurchaseMinProfileDecisionUseCase, MinProfileUpdateResultStateManager minProfileUpdateResultStateManager, UserProfileDetailsProvider userProfileDetailsProvider, CheckIfContinueWithBulkBookingFlowUseCase checkIfContinueWithBulkBookingFlowUseCase, FetchSuperPassCashPaymentInfoUseCase fetchSuperPassCashPaymentInfoUseCase, KotlinToastManager kotlinToastManager, CityProvider cityProvider, IUserPreferencesDataStore iUserPreferencesDataStore, SubmitSuperPassApplicationUseCase submitSuperPassApplicationUseCase, CurrencyFeature currencyFeature, GetPremiumPassExpiryEligibilityForPurchaseUseCase getPremiumPassExpiryEligibilityForPurchaseUseCase, FetchBannerUseCase fetchBannerUseCase, RefreshSelectedBookableSuperPassConfigurationUseCase refreshSelectedBookableSuperPassConfigurationUseCase, MinProfileAnalyticsHelper minProfileAnalyticsHelper, ProductPurchaseMinProfileDecisionHelper productPurchaseMinProfileDecisionHelper) {
        super(componentContext, superPassConfirmationManager);
        this.k = confirmSuperPassPurchaseArgs;
        this.l = superPassConfirmationManager;
        this.m = stringProvider;
        this.n = analyticsContract;
        this.o = basicInfoContract;
        this.p = getTimeInMillisAfterXTimeUseCase;
        this.q = chaloNavigationManager;
        this.r = timeUtilsContract;
        this.s = createSuperPassOrderUseCase;
        this.t = superPassRepository;
        this.u = checkoutResultStateManager;
        this.v = resolveProductPurchaseMinProfileDecisionUseCase;
        this.w = minProfileUpdateResultStateManager;
        this.x = userProfileDetailsProvider;
        this.y = fetchSuperPassCashPaymentInfoUseCase;
        this.z = kotlinToastManager;
        this.A = cityProvider;
        this.B = iUserPreferencesDataStore;
        this.C = submitSuperPassApplicationUseCase;
        this.D = currencyFeature;
        this.E = getPremiumPassExpiryEligibilityForPurchaseUseCase;
        this.F = fetchBannerUseCase;
        this.G = refreshSelectedBookableSuperPassConfigurationUseCase;
        this.H = productPurchaseMinProfileDecisionHelper;
        this.L = LazyKt.b(new Function0() { // from class: app.chalo.productpurchase.passpurchase.ui.confirmation.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new ToolbarUIState(null, null, null, null, CollectionsKt.R(new ToolbarActionsUIState(UiEventHandler.Companion.a(new ConfirmSuperPassPurchaseViewModel$toolbar$2$1(0, this.f8401a.l, SuperPassConfirmationManager.class, "reportProblem", "reportProblem()V", 0)), new ImageUIState(IconType.ICON_HELP, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().j), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), null, null, 12)), 0.0f, null, null, 239);
            }
        });
        n(new ps(this, 6));
        this.I = BuildersKt.d(this.j, null, null, new AnonymousClass2(null), 3);
    }

    public static Long D(Long l, Long l2) {
        if (l2 == null) {
            return null;
        }
        return Long.valueOf(l2.longValue() + l.longValue());
    }

    public static HashMap G(SuperPassPurchaseSharedState superPassPurchaseSharedState) {
        Map map = superPassPurchaseSharedState.p;
        HashMap map2 = new HashMap();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                map2.put((String) entry.getKey(), ((ProofUploadDetails) entry.getValue()).f8316a);
            }
        }
        return map2;
    }

    public static TextUIState.ChaloTextUIState R(SuperPassPurchaseSharedState superPassPurchaseSharedState) {
        SuperPassProductConfigurationProperties superPassProductConfigurationProperties;
        BookableSuperPassConfiguration bookableSuperPassConfiguration = superPassPurchaseSharedState.i;
        if (bookableSuperPassConfiguration != null && (superPassProductConfigurationProperties = bookableSuperPassConfiguration.b) != null) {
            String str = superPassProductConfigurationProperties.j;
            SuperPassProductConfigFareMappingResponseAppModel superPassProductConfigFareMappingResponseAppModel = bookableSuperPassConfiguration.c;
            String message = "rd config: " + str;
            Intrinsics.i(message, "message");
            if (Intrinsics.d(str, "rideBasedPass")) {
                vo1.x("rd desc: ", superPassProductConfigurationProperties.d, "message");
                String str2 = superPassProductConfigFareMappingResponseAppModel.f8642a;
                if (str2 != null && str2.length() != 0) {
                    return new TextUIState.ChaloTextUIState(superPassProductConfigFareMappingResponseAppModel.f8642a, UITextStyle.BodyMedium, ChaloColorToken.Black_70.f9767a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                }
            } else {
                Intrinsics.d(str, "magicPass");
            }
        }
        return null;
    }

    public static boolean S(SuperPassPurchaseSharedState superPassPurchaseSharedState) {
        BookableSuperPassConfiguration bookableSuperPassConfiguration = superPassPurchaseSharedState.i;
        return (bookableSuperPassConfiguration == null || Intrinsics.d(superPassPurchaseSharedState.d, "flowFreshPurchaseWithoutProofRequirement") || BookableSuperPassConfigurationKt.b(bookableSuperPassConfiguration)) ? false : true;
    }

    public static TextUIState.ChaloTextUIState T(SuperPassPurchaseSharedState superPassPurchaseSharedState) {
        SuperPassProductConfigurationProperties superPassProductConfigurationProperties;
        SuperPassProductConfigSubCategoryResponseAppModel superPassProductConfigSubCategoryResponseAppModel;
        BookableSuperPassConfiguration bookableSuperPassConfiguration = superPassPurchaseSharedState.i;
        if (bookableSuperPassConfiguration != null && (superPassProductConfigurationProperties = bookableSuperPassConfiguration.b) != null && (superPassProductConfigSubCategoryResponseAppModel = bookableSuperPassConfiguration.e) != null) {
            String str = superPassProductConfigurationProperties.j;
            if (Intrinsics.d(str, "rideBasedPass")) {
                String str2 = superPassProductConfigSubCategoryResponseAppModel.c;
                if (str2 != null && str2.length() != 0) {
                    return new TextUIState.ChaloTextUIState(superPassProductConfigSubCategoryResponseAppModel.c, UITextStyle.BodyMedium, ChaloColorToken.Black_70.f9767a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                }
            } else {
                Intrinsics.d(str, "magicPass");
            }
        }
        return null;
    }

    public static TextUIState.ChaloTextUIState Z(SuperPassPurchaseSharedState superPassPurchaseSharedState) {
        String str = superPassPurchaseSharedState.d;
        SuperPassUserDetails superPassUserDetails = superPassPurchaseSharedState.h;
        if (Intrinsics.d(str, "flowPaymentPostVerification")) {
            return null;
        }
        if (Intrinsics.d(str, "flowRenewPass")) {
            BookableSuperPassConfiguration bookableSuperPassConfiguration = superPassPurchaseSharedState.i;
            if (bookableSuperPassConfiguration == null || BookableSuperPassConfigurationKt.b(bookableSuperPassConfiguration) || StringsKt.F(superPassUserDetails.c)) {
                return null;
            }
        } else if (!Intrinsics.d(SuperPassPurchaseSharedContractKt.a(superPassPurchaseSharedState), Boolean.TRUE)) {
            return null;
        }
        return new TextUIState.ChaloTextUIState(superPassUserDetails.c, UITextStyle.DisplaySmall, ChaloColorToken.Black_87.f9768a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
    }

    public static final Object q(ConfirmSuperPassPurchaseViewModel confirmSuperPassPurchaseViewModel, SuperPassPurchaseSharedState superPassPurchaseSharedState, BookableSuperPassConfiguration bookableSuperPassConfiguration, Continuation continuation) throws Throwable {
        confirmSuperPassPurchaseViewModel.getClass();
        String str = superPassPurchaseSharedState.d;
        if (Intrinsics.d(str, "flowPaymentPostVerification")) {
            Object objB = confirmSuperPassPurchaseViewModel.B(SuperPassOrderType.POST_VERIFICATION, bookableSuperPassConfiguration, superPassPurchaseSharedState, (ContinuationImpl) continuation);
            if (objB == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objB;
            }
        } else if (Intrinsics.d(str, "flowRenewPass")) {
            Object objB2 = confirmSuperPassPurchaseViewModel.B(SuperPassOrderType.RENEW, bookableSuperPassConfiguration, superPassPurchaseSharedState, (ContinuationImpl) continuation);
            if (objB2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objB2;
            }
        } else if ((Intrinsics.d(str, "flowFreshPurchase") && bookableSuperPassConfiguration.d()) || Intrinsics.d(str, "flowReapplication")) {
            Object objU = confirmSuperPassPurchaseViewModel.U(superPassPurchaseSharedState, bookableSuperPassConfiguration, Intrinsics.d(str, "flowReapplication"), (ContinuationImpl) continuation);
            if (objU == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objU;
            }
        } else {
            Object objB3 = confirmSuperPassPurchaseViewModel.B(SuperPassOrderType.WITHOUT_VERIFICATION, bookableSuperPassConfiguration, superPassPurchaseSharedState, (ContinuationImpl) continuation);
            if (objB3 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objB3;
            }
        }
        return Unit.f17538a;
    }

    public static final void r(ConfirmSuperPassPurchaseViewModel confirmSuperPassPurchaseViewModel, ResultStateData resultStateData, CreateOrderResponseAppModel createOrderResponseAppModel) {
        Object value;
        ConfirmSuperPassPurchaseDataState it;
        Object value2;
        ConfirmSuperPassPurchaseDataState it2;
        confirmSuperPassPurchaseViewModel.K = null;
        MutableStateFlow mutableStateFlow = confirmSuperPassPurchaseViewModel.e;
        if (resultStateData instanceof ResultStateData.Cancelled) {
            return;
        }
        if (!(resultStateData instanceof ResultStateData.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        CheckoutResultState checkoutResultState = (CheckoutResultState) ((ResultStateData.Success) resultStateData).f9039a;
        if (checkoutResultState.equals(CheckoutResultState.Failed.f9054a)) {
            do {
                value2 = mutableStateFlow.getValue();
                it2 = (ConfirmSuperPassPurchaseDataState) value2;
                Intrinsics.i(it2, "it");
            } while (!mutableStateFlow.c(value2, ConfirmSuperPassPurchaseDataState.a(it2, false, false, null, null, null, null, null, null, null, null, 2043)));
        } else {
            if (!(checkoutResultState instanceof CheckoutResultState.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            CheckoutResultState.Success success = (CheckoutResultState.Success) checkoutResultState;
            String str = success.f9055a;
            if (str.equals("cash")) {
                confirmSuperPassPurchaseViewModel.K(new ConfirmSuperPassPurchaseIntent.PostCashPaymentIntent(createOrderResponseAppModel.b, ((SuperPassPurchaseSharedState) confirmSuperPassPurchaseViewModel.l.getF().getValue()).h.f9580a));
            } else if (str.equals(CustomTabsCallback.ONLINE_EXTRAS_KEY)) {
                confirmSuperPassPurchaseViewModel.K(new ConfirmSuperPassPurchaseIntent.PostOnlinePaymentIntent(success.b, success.c, createOrderResponseAppModel));
            } else {
                do {
                    value = mutableStateFlow.getValue();
                    it = (ConfirmSuperPassPurchaseDataState) value;
                    Intrinsics.i(it, "it");
                } while (!mutableStateFlow.c(value, ConfirmSuperPassPurchaseDataState.a(it, false, false, PassConfirmationDialogType.Loading.f8393a, null, null, null, null, null, null, null, 2043)));
            }
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    public static final void s(ConfirmSuperPassPurchaseViewModel confirmSuperPassPurchaseViewModel, boolean z, String str) {
        confirmSuperPassPurchaseViewModel.getClass();
        if (z) {
            confirmSuperPassPurchaseViewModel.P("mPass cash payment option selected", MapsKt.k(new Pair("referenceId", String.valueOf(str))));
        } else {
            confirmSuperPassPurchaseViewModel.P("mPass cash payment option selected", MapsKt.k(new Pair("failureReason", String.valueOf(str))));
        }
    }

    public static final void t(ConfirmSuperPassPurchaseViewModel confirmSuperPassPurchaseViewModel) {
        SuperPassProductConfigurationProperties superPassProductConfigurationProperties;
        SuperPassProductConfigurationProperties superPassProductConfigurationProperties2;
        confirmSuperPassPurchaseViewModel.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        confirmSuperPassPurchaseViewModel.u(linkedHashMap);
        confirmSuperPassPurchaseViewModel.P("mPass confirm purchase pay btn clicked", linkedHashMap);
        SuperPassPurchaseSharedState superPassPurchaseSharedState = (SuperPassPurchaseSharedState) confirmSuperPassPurchaseViewModel.l.getF().getValue();
        BookableSuperPassConfiguration bookableSuperPassConfiguration = superPassPurchaseSharedState.i;
        String str = null;
        Pair pair = new Pair("productType", String.valueOf((bookableSuperPassConfiguration == null || (superPassProductConfigurationProperties2 = bookableSuperPassConfiguration.b) == null) ? null : superPassProductConfigurationProperties2.i));
        BookableSuperPassConfiguration bookableSuperPassConfiguration2 = superPassPurchaseSharedState.i;
        if (bookableSuperPassConfiguration2 != null && (superPassProductConfigurationProperties = bookableSuperPassConfiguration2.b) != null) {
            str = superPassProductConfigurationProperties.j;
        }
        confirmSuperPassPurchaseViewModel.P("make payment clicked", MapsKt.k(pair, new Pair("productSubType", String.valueOf(str))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList y(List list) {
        ChaloColorToken chaloColorToken;
        ChaloColorToken.LightOrangeSpfDark lightOrangeSpfDark;
        IconType iconType;
        ChaloColorToken chaloColorToken2;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BannerUiDataAppModel bannerUiDataAppModel = ((BannerDataResponseAppModel) it.next()).c;
            int i = WhenMappings.f8383a[bannerUiDataAppModel.d.ordinal()];
            Object confirmSuperPassPurchaseBanner = null;
            if (i == 1 || i == 2 || i == 3) {
                IconType iconType2 = IconType.IC_ROLLOVER;
                chaloColorToken = ChaloColorToken.LightOrangeSpf.f9817a;
                lightOrangeSpfDark = ChaloColorToken.LightOrangeSpfDark.f9818a;
                iconType = iconType2;
                chaloColorToken2 = chaloColorToken;
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                IconType iconType3 = IconType.IC_ALERT_TRIANGLE;
                chaloColorToken = ChaloColorToken.RedBase.f9846a;
                iconType = iconType3;
                chaloColorToken2 = null;
                lightOrangeSpfDark = null;
            }
            String str = bannerUiDataAppModel.f2955a;
            String str2 = bannerUiDataAppModel.b;
            if (str != null) {
                ImageUIState imageUIState = new ImageUIState(iconType, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                ChaloColorToken.AlmostBlackColor almostBlackColor = ChaloColorToken.AlmostBlackColor.f9756a;
                ChaloTextStyleHelper chaloTextStyleHelper = ChaloTextStyleHelper.f10078a;
                confirmSuperPassPurchaseBanner = new ConfirmSuperPassPurchaseBanner(imageUIState, str2 == null ? ChaloTextStyleHelper.c(chaloTextStyleHelper, str, almostBlackColor, null, null, null, null, 124) : ChaloTextStyleHelper.g(chaloTextStyleHelper, str, almostBlackColor, null, null, null, null, 124), str2 != null ? ChaloTextStyleHelper.c(chaloTextStyleHelper, str2, ChaloColorToken.ShadyGray.f9851a, null, null, null, null, 124) : null, chaloColorToken, chaloColorToken2, lightOrangeSpfDark);
            }
            if (confirmSuperPassPurchaseBanner != null) {
                arrayList.add(confirmSuperPassPurchaseBanner);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00be A[LOOP:0: B:31:0x00be->B:39:?, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:34:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object B(SuperPassOrderType superPassOrderType, BookableSuperPassConfiguration bookableSuperPassConfiguration, SuperPassPurchaseSharedState superPassPurchaseSharedState, ContinuationImpl continuationImpl) throws Throwable {
        ConfirmSuperPassPurchaseViewModel$createSuperPassOrderWithMinProfileGate$1 confirmSuperPassPurchaseViewModel$createSuperPassOrderWithMinProfileGate$1;
        SuperPassOrderType superPassOrderType2;
        SuperPassPurchaseSharedState superPassPurchaseSharedState2;
        BookableSuperPassConfiguration bookableSuperPassConfiguration2;
        SuperPassOrderType superPassOrderType3;
        BookableSuperPassConfiguration bookableSuperPassConfiguration3;
        SuperPassPurchaseSharedState superPassPurchaseSharedState3;
        MutableStateFlow mutableStateFlow;
        Object value;
        ConfirmSuperPassPurchaseDataState it;
        if (continuationImpl instanceof ConfirmSuperPassPurchaseViewModel$createSuperPassOrderWithMinProfileGate$1) {
            confirmSuperPassPurchaseViewModel$createSuperPassOrderWithMinProfileGate$1 = (ConfirmSuperPassPurchaseViewModel$createSuperPassOrderWithMinProfileGate$1) continuationImpl;
            int i = confirmSuperPassPurchaseViewModel$createSuperPassOrderWithMinProfileGate$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                confirmSuperPassPurchaseViewModel$createSuperPassOrderWithMinProfileGate$1.label = i - Integer.MIN_VALUE;
            } else {
                confirmSuperPassPurchaseViewModel$createSuperPassOrderWithMinProfileGate$1 = new ConfirmSuperPassPurchaseViewModel$createSuperPassOrderWithMinProfileGate$1(this, continuationImpl);
            }
        } else {
            confirmSuperPassPurchaseViewModel$createSuperPassOrderWithMinProfileGate$1 = new ConfirmSuperPassPurchaseViewModel$createSuperPassOrderWithMinProfileGate$1(this, continuationImpl);
        }
        ConfirmSuperPassPurchaseViewModel$createSuperPassOrderWithMinProfileGate$1 confirmSuperPassPurchaseViewModel$createSuperPassOrderWithMinProfileGate$2 = confirmSuperPassPurchaseViewModel$createSuperPassOrderWithMinProfileGate$1;
        Object objA = confirmSuperPassPurchaseViewModel$createSuperPassOrderWithMinProfileGate$2.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = confirmSuperPassPurchaseViewModel$createSuperPassOrderWithMinProfileGate$2.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objA);
            Source source = Source.CONFIRM_SUPER_PASS_PURCHASE_FRAGMENT;
            String ruleId = UserProfilingHookSlot.CONFIRM_SUPER_PASS_PURCHASE_MIN_PROFILE_FLOW.getRuleId();
            superPassOrderType2 = superPassOrderType;
            confirmSuperPassPurchaseViewModel$createSuperPassOrderWithMinProfileGate$2.L$0 = superPassOrderType2;
            confirmSuperPassPurchaseViewModel$createSuperPassOrderWithMinProfileGate$2.L$1 = bookableSuperPassConfiguration;
            confirmSuperPassPurchaseViewModel$createSuperPassOrderWithMinProfileGate$2.L$2 = superPassPurchaseSharedState;
            confirmSuperPassPurchaseViewModel$createSuperPassOrderWithMinProfileGate$2.label = 1;
            objA = this.v.a(source, ruleId, confirmSuperPassPurchaseViewModel$createSuperPassOrderWithMinProfileGate$2);
            if (objA != obj) {
                superPassPurchaseSharedState2 = superPassPurchaseSharedState;
                bookableSuperPassConfiguration2 = bookableSuperPassConfiguration;
            }
            return obj;
        }
        if (i2 == 1) {
            SuperPassPurchaseSharedState superPassPurchaseSharedState4 = (SuperPassPurchaseSharedState) confirmSuperPassPurchaseViewModel$createSuperPassOrderWithMinProfileGate$2.L$2;
            BookableSuperPassConfiguration bookableSuperPassConfiguration4 = (BookableSuperPassConfiguration) confirmSuperPassPurchaseViewModel$createSuperPassOrderWithMinProfileGate$2.L$1;
            superPassOrderType2 = (SuperPassOrderType) confirmSuperPassPurchaseViewModel$createSuperPassOrderWithMinProfileGate$2.L$0;
            ResultKt.b(objA);
            superPassPurchaseSharedState2 = superPassPurchaseSharedState4;
            bookableSuperPassConfiguration2 = bookableSuperPassConfiguration4;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objA);
                return unit;
            }
            superPassPurchaseSharedState3 = (SuperPassPurchaseSharedState) confirmSuperPassPurchaseViewModel$createSuperPassOrderWithMinProfileGate$2.L$2;
            bookableSuperPassConfiguration3 = (BookableSuperPassConfiguration) confirmSuperPassPurchaseViewModel$createSuperPassOrderWithMinProfileGate$2.L$1;
            superPassOrderType3 = (SuperPassOrderType) confirmSuperPassPurchaseViewModel$createSuperPassOrderWithMinProfileGate$2.L$0;
            ResultKt.b(objA);
        }
        if (!((Boolean) objA).booleanValue()) {
            do {
                mutableStateFlow = this.e;
                value = mutableStateFlow.getValue();
                it = (ConfirmSuperPassPurchaseDataState) value;
                Intrinsics.i(it, "it");
            } while (!mutableStateFlow.c(value, ConfirmSuperPassPurchaseDataState.a(it, false, false, null, null, null, null, null, null, null, null, 2043)));
            return unit;
        }
        confirmSuperPassPurchaseViewModel$createSuperPassOrderWithMinProfileGate$2.L$0 = null;
        confirmSuperPassPurchaseViewModel$createSuperPassOrderWithMinProfileGate$2.L$1 = null;
        confirmSuperPassPurchaseViewModel$createSuperPassOrderWithMinProfileGate$2.L$2 = null;
        confirmSuperPassPurchaseViewModel$createSuperPassOrderWithMinProfileGate$2.label = 3;
        if (z(superPassOrderType3, bookableSuperPassConfiguration3, superPassPurchaseSharedState3, confirmSuperPassPurchaseViewModel$createSuperPassOrderWithMinProfileGate$2) != obj) {
            return obj;
        }
        return unit;
        Object obj2 = objA;
        SuperPassOrderType superPassOrderType4 = superPassOrderType2;
        String strA = KUUID.a();
        Source source2 = Source.CONFIRM_SUPER_PASS_PURCHASE_FRAGMENT;
        wn wnVar = new wn(13, this, strA);
        ConfirmSuperPassPurchaseViewModel$createSuperPassOrderWithMinProfileGate$canProceed$2 confirmSuperPassPurchaseViewModel$createSuperPassOrderWithMinProfileGate$canProceed$2 = new ConfirmSuperPassPurchaseViewModel$createSuperPassOrderWithMinProfileGate$canProceed$2(this, strA, null);
        confirmSuperPassPurchaseViewModel$createSuperPassOrderWithMinProfileGate$2.L$0 = superPassOrderType4;
        confirmSuperPassPurchaseViewModel$createSuperPassOrderWithMinProfileGate$2.L$1 = bookableSuperPassConfiguration2;
        confirmSuperPassPurchaseViewModel$createSuperPassOrderWithMinProfileGate$2.L$2 = superPassPurchaseSharedState2;
        confirmSuperPassPurchaseViewModel$createSuperPassOrderWithMinProfileGate$2.label = 2;
        Object objA2 = this.H.a((ProductPurchaseMinProfileDecision) obj2, source2, wnVar, confirmSuperPassPurchaseViewModel$createSuperPassOrderWithMinProfileGate$canProceed$2, confirmSuperPassPurchaseViewModel$createSuperPassOrderWithMinProfileGate$2);
        if (objA2 != obj) {
            superPassOrderType3 = superPassOrderType4;
            objA = objA2;
            bookableSuperPassConfiguration3 = bookableSuperPassConfiguration2;
            superPassPurchaseSharedState3 = superPassPurchaseSharedState2;
            if (!((Boolean) objA).booleanValue()) {
                do {
                    mutableStateFlow = this.e;
                    value = mutableStateFlow.getValue();
                    it = (ConfirmSuperPassPurchaseDataState) value;
                    Intrinsics.i(it, "it");
                } while (!mutableStateFlow.c(value, ConfirmSuperPassPurchaseDataState.a(it, false, false, null, null, null, null, null, null, null, null, 2043)));
                return unit;
            }
            confirmSuperPassPurchaseViewModel$createSuperPassOrderWithMinProfileGate$2.L$0 = null;
            confirmSuperPassPurchaseViewModel$createSuperPassOrderWithMinProfileGate$2.L$1 = null;
            confirmSuperPassPurchaseViewModel$createSuperPassOrderWithMinProfileGate$2.L$2 = null;
            confirmSuperPassPurchaseViewModel$createSuperPassOrderWithMinProfileGate$2.label = 3;
            if (z(superPassOrderType3, bookableSuperPassConfiguration3, superPassPurchaseSharedState3, confirmSuperPassPurchaseViewModel$createSuperPassOrderWithMinProfileGate$2) != obj) {
                return unit;
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    public final Object C(boolean z, SuperPassPurchaseSharedState superPassPurchaseSharedState, ContinuationImpl continuationImpl) {
        ConfirmSuperPassPurchaseViewModel$fareDetails$1 confirmSuperPassPurchaseViewModel$fareDetails$1;
        Function1 qsVar;
        SuperPassProductFareInfoResponseAppModel superPassProductFareInfoResponseAppModel;
        boolean z2;
        SuperPassProductConfigFareMappingResponseAppModel superPassProductConfigFareMappingResponseAppModel;
        ?? arrayList;
        List list;
        if (continuationImpl instanceof ConfirmSuperPassPurchaseViewModel$fareDetails$1) {
            confirmSuperPassPurchaseViewModel$fareDetails$1 = (ConfirmSuperPassPurchaseViewModel$fareDetails$1) continuationImpl;
            int i = confirmSuperPassPurchaseViewModel$fareDetails$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                confirmSuperPassPurchaseViewModel$fareDetails$1.label = i - Integer.MIN_VALUE;
            } else {
                confirmSuperPassPurchaseViewModel$fareDetails$1 = new ConfirmSuperPassPurchaseViewModel$fareDetails$1(this, continuationImpl);
            }
        } else {
            confirmSuperPassPurchaseViewModel$fareDetails$1 = new ConfirmSuperPassPurchaseViewModel$fareDetails$1(this, continuationImpl);
        }
        Object obj = confirmSuperPassPurchaseViewModel$fareDetails$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = confirmSuperPassPurchaseViewModel$fareDetails$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            BookableSuperPassConfiguration bookableSuperPassConfiguration = superPassPurchaseSharedState.i;
            SuperPassProductFareInfoResponseAppModel superPassProductFareInfoResponseAppModel2 = (bookableSuperPassConfiguration == null || (superPassProductConfigFareMappingResponseAppModel = bookableSuperPassConfiguration.c) == null) ? null : superPassProductConfigFareMappingResponseAppModel.o;
            qsVar = new qs(0);
            confirmSuperPassPurchaseViewModel$fareDetails$1.L$0 = superPassProductFareInfoResponseAppModel2;
            confirmSuperPassPurchaseViewModel$fareDetails$1.L$1 = qsVar;
            confirmSuperPassPurchaseViewModel$fareDetails$1.Z$0 = z;
            confirmSuperPassPurchaseViewModel$fareDetails$1.label = 1;
            Object objB = this.m.b(StringEnum.FARE_SPLIT, new Object[0], confirmSuperPassPurchaseViewModel$fareDetails$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            superPassProductFareInfoResponseAppModel = superPassProductFareInfoResponseAppModel2;
            obj = objB;
            z2 = z;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = confirmSuperPassPurchaseViewModel$fareDetails$1.Z$0;
            qsVar = (Function1) confirmSuperPassPurchaseViewModel$fareDetails$1.L$1;
            superPassProductFareInfoResponseAppModel = (SuperPassProductFareInfoResponseAppModel) confirmSuperPassPurchaseViewModel$fareDetails$1.L$0;
            ResultKt.b(obj);
        }
        TextUIState.ChaloTextUIState chaloTextUIState = new TextUIState.ChaloTextUIState((String) obj, UITextStyle.DisplaySmall, ChaloColorToken.Black_87.f9768a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
        ImageUIState imageUIState = z2 ? (ImageUIState) qsVar.invoke(new Float(180.0f)) : (ImageUIState) qsVar.invoke(new Float(0.0f));
        if (!z2 || superPassProductFareInfoResponseAppModel == null || (list = superPassProductFareInfoResponseAppModel.e) == null) {
            arrayList = EmptyList.f17557a;
        } else {
            List<ProductConfigFareBreakupAppModel> list2 = list;
            arrayList = new ArrayList(CollectionsKt.v(list2, 10));
            for (ProductConfigFareBreakupAppModel productConfigFareBreakupAppModel : list2) {
                String strA = productConfigFareBreakupAppModel.b;
                int length = strA.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        i3 = -1;
                        break;
                    }
                    if (Character.isDigit(strA.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                String strSubstring = strA.substring(0, i3);
                Intrinsics.h(strSubstring, "substring(...)");
                String strSubstring2 = strA.substring(i3, strA.length());
                Intrinsics.h(strSubstring2, "substring(...)");
                if (StringsKt.m(strSubstring, "₹", false)) {
                    strA = vo1.A(strSubstring, FareUtils.a(strSubstring2));
                }
                String str = productConfigFareBreakupAppModel.f8211a;
                UITextStyle uITextStyle = UITextStyle.BodyMedium;
                ChaloColorToken.Black_70 black_70 = ChaloColorToken.Black_70.f9767a;
                arrayList.add(new SuperPassFareSplitUIState(new TextUIState.ChaloTextUIState(str, uITextStyle, black_70, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(strA, uITextStyle, black_70, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184)));
            }
        }
        return new SuperPassFareDetailsUIState(chaloTextUIState, imageUIState, arrayList, UiEventHandler.Companion.a(new ps(this, 7)));
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0102, code lost:
    
        if (r14 == r1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0114, code lost:
    
        if (r14 == r1) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E(boolean r12, java.lang.Long r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassPurchaseViewModel.E(boolean, java.lang.Long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final ToolbarUIState F() {
        return (ToolbarUIState) this.L.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x024d  */
    /* JADX WARN: Code duplicated, block: B:106:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f2 A[PHI: r1 r5 r9
      0x00f2: PHI (r1v15 java.lang.Object) = (r1v13 java.lang.Object), (r1v1 java.lang.Object) binds: [B:38:0x00ee, B:18:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x00f2: PHI (r5v7 app.chalo.productpurchase.passpurchase.domain.SuperPassOrderCreationError$OrderCreationFailed) = 
      (r5v4 app.chalo.productpurchase.passpurchase.domain.SuperPassOrderCreationError$OrderCreationFailed)
      (r5v8 app.chalo.productpurchase.passpurchase.domain.SuperPassOrderCreationError$OrderCreationFailed)
     binds: [B:38:0x00ee, B:18:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x00f2: PHI (r9v5 java.lang.String) = (r9v2 java.lang.String), (r9v6 java.lang.String) binds: [B:38:0x00ee, B:18:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x0104 A[PHI: r3 r5 r9
      0x0104: PHI (r3v22 app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedState) = 
      (r3v19 app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedState)
      (r3v41 app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedState)
     binds: [B:41:0x0100, B:17:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x0104: PHI (r5v9 app.chalo.productpurchase.passpurchase.domain.SuperPassOrderCreationError$OrderCreationFailed) = 
      (r5v7 app.chalo.productpurchase.passpurchase.domain.SuperPassOrderCreationError$OrderCreationFailed)
      (r5v17 app.chalo.productpurchase.passpurchase.domain.SuperPassOrderCreationError$OrderCreationFailed)
     binds: [B:41:0x0100, B:17:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x0104: PHI (r9v7 java.lang.String) = (r9v5 java.lang.String), (r9v8 java.lang.String) binds: [B:41:0x0100, B:17:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x010a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0111  */
    /* JADX WARN: Code duplicated, block: B:50:0x0114  */
    /* JADX WARN: Code duplicated, block: B:53:0x011a  */
    /* JADX WARN: Code duplicated, block: B:58:0x0127  */
    /* JADX WARN: Code duplicated, block: B:60:0x012a  */
    /* JADX WARN: Code duplicated, block: B:61:0x0134  */
    /* JADX WARN: Code duplicated, block: B:63:0x0137  */
    /* JADX WARN: Code duplicated, block: B:78:0x018b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0202  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:91:0x0209  */
    /* JADX WARN: Code duplicated, block: B:93:0x020d A[LOOP:2: B:93:0x020d->B:109:?, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:98:0x0248  */
    public final Object H(BookableSuperPassConfiguration bookableSuperPassConfiguration, SuperPassOrderCreationError.OrderCreationFailed orderCreationFailed, Function2 function2, SuperPassPurchaseSharedState superPassPurchaseSharedState, ContinuationImpl continuationImpl) {
        ConfirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$1 confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$1;
        Function2 function3;
        String str;
        Object objA;
        BookableSuperPassConfiguration bookableSuperPassConfiguration2;
        SuperPassOrderCreationError.OrderCreationFailed orderCreationFailed2;
        ChaloUseCaseResult chaloUseCaseResult;
        Object value;
        ConfirmSuperPassPurchaseDataState it;
        String str2;
        BookableSuperPassConfiguration bookableSuperPassConfiguration3;
        SuperPassPurchaseSharedState superPassPurchaseSharedState2;
        Long l;
        String str3;
        BookableSuperPassConfiguration bookableSuperPassConfiguration4;
        String strC;
        Object l2;
        Object value2;
        ConfirmSuperPassPurchaseDataState it2;
        KotlinToastManager kotlinToastManager;
        KotlinToastManager kotlinToastManager2;
        String str4;
        SuperPassProductConfigFareMappingResponseAppModel superPassProductConfigFareMappingResponseAppModel;
        SuperPassProductFareInfoResponseAppModel superPassProductFareInfoResponseAppModel;
        String str5;
        Object objB;
        String str6;
        String str7;
        String str8;
        Object value3;
        ConfirmSuperPassPurchaseDataState it3;
        if (continuationImpl instanceof ConfirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$1) {
            confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$1 = (ConfirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$1) continuationImpl;
            int i = confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$1.label = i - Integer.MIN_VALUE;
            } else {
                confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$1 = new ConfirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$1(this, continuationImpl);
            }
        } else {
            confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$1 = new ConfirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$1(this, continuationImpl);
        }
        ConfirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$1 confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2 = confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$1;
        Object objX = confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.label;
        CurrencyFeature currencyFeature = this.D;
        MutableStateFlow mutableStateFlow = this.e;
        Unit unit = Unit.f17538a;
        StringProvider stringProvider = this.m;
        switch (i2) {
            case 0:
                ResultKt.b(objX);
                SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo = superPassPurchaseSharedState.m;
                String str9 = superPassPurchaseStopsInfo != null ? superPassPurchaseStopsInfo.b : null;
                String str10 = superPassPurchaseStopsInfo != null ? superPassPurchaseStopsInfo.d : null;
                String str11 = superPassPurchaseStopsInfo != null ? superPassPurchaseStopsInfo.e : null;
                confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.L$0 = bookableSuperPassConfiguration;
                confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.L$1 = orderCreationFailed;
                function3 = function2;
                confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.L$2 = function3;
                confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.label = 1;
                str = null;
                objA = this.G.a(bookableSuperPassConfiguration, str9, str10, str11, confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2);
                if (objA != obj) {
                    bookableSuperPassConfiguration2 = bookableSuperPassConfiguration;
                    orderCreationFailed2 = orderCreationFailed;
                    chaloUseCaseResult = (ChaloUseCaseResult) objA;
                    if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                        BookableSuperPassConfiguration bookableSuperPassConfiguration5 = (BookableSuperPassConfiguration) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                        confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.L$0 = orderCreationFailed2;
                        confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.L$1 = str;
                        confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.L$2 = str;
                        confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.label = 2;
                        objX = this.l.x(bookableSuperPassConfiguration5, confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2);
                        if (objX != obj) {
                            superPassPurchaseSharedState2 = (SuperPassPurchaseSharedState) objX;
                            confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.L$0 = orderCreationFailed2;
                            confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.L$1 = superPassPurchaseSharedState2;
                            confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.label = 3;
                            if (I(superPassPurchaseSharedState2, confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2) != obj) {
                                l = orderCreationFailed2.e;
                                str3 = orderCreationFailed2.d;
                                if (str3 == null) {
                                    str3 = orderCreationFailed2.b;
                                } else {
                                    if (StringsKt.F(str3)) {
                                        str3 = str;
                                    }
                                    if (str3 == null) {
                                        str3 = orderCreationFailed2.b;
                                    }
                                }
                                bookableSuperPassConfiguration4 = superPassPurchaseSharedState2.i;
                                if (bookableSuperPassConfiguration4 != null || (superPassProductConfigFareMappingResponseAppModel = bookableSuperPassConfiguration4.c) == null || (superPassProductFareInfoResponseAppModel = superPassProductConfigFareMappingResponseAppModel.o) == null) {
                                    strC = str;
                                } else {
                                    strC = AllProductConfigsResponseAppModelKt.c(superPassProductFareInfoResponseAppModel);
                                }
                                if (strC != null) {
                                    l2 = new Long(currencyFeature.b(strC));
                                } else {
                                    l2 = str;
                                }
                                if (l != null || l.longValue() == -1 || StringsKt.F(str3) || l2 == null || !l2.equals(l)) {
                                    do {
                                        value2 = mutableStateFlow.getValue();
                                        it2 = (ConfirmSuperPassPurchaseDataState) value2;
                                        Intrinsics.i(it2, "it");
                                    } while (!mutableStateFlow.c(value2, ConfirmSuperPassPurchaseDataState.a(it2, false, false, null, null, null, null, null, null, null, null, 2043)));
                                    kotlinToastManager = this.z;
                                    confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.L$0 = kotlinToastManager;
                                    confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.L$1 = str;
                                    confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.label = 4;
                                    objX = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2);
                                    if (objX != obj) {
                                        kotlinToastManager2 = kotlinToastManager;
                                        hq0.s(kotlinToastManager2, (String) objX);
                                        return unit;
                                    }
                                } else {
                                    confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.L$0 = l;
                                    confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.L$1 = str3;
                                    confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.label = 5;
                                    Object objB2 = stringProvider.b(StringEnum.CANCEL, new Object[0], confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2);
                                    if (objB2 != obj) {
                                        str4 = str3;
                                        objX = objB2;
                                        str5 = (String) objX;
                                        String strA = currencyFeature.a(l.longValue(), CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                                        confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.L$0 = str4;
                                        confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.L$1 = str5;
                                        confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.label = 6;
                                        objB = stringProvider.b(StringEnum.PAY_PREFIX, new Object[]{strA}, confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2);
                                        if (objB != obj) {
                                            String str12 = str4;
                                            str6 = str5;
                                            objX = objB;
                                            str7 = str12;
                                            str8 = (String) objX;
                                            do {
                                                value3 = mutableStateFlow.getValue();
                                                it3 = (ConfirmSuperPassPurchaseDataState) value3;
                                                Intrinsics.i(it3, "it");
                                            } while (!mutableStateFlow.c(value3, ConfirmSuperPassPurchaseDataState.a(it3, false, false, null, new PassConfirmationBottomSheetType.FareMappingFailed(str7, str8, str6), null, null, null, null, null, null, 2035)));
                                            return unit;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                            throw new NoWhenBranchMatchedException();
                        }
                        do {
                            value = mutableStateFlow.getValue();
                            it = (ConfirmSuperPassPurchaseDataState) value;
                            Intrinsics.i(it, "it");
                        } while (!mutableStateFlow.c(value, ConfirmSuperPassPurchaseDataState.a(it, false, false, null, null, null, null, null, null, null, null, 2043)));
                        str2 = orderCreationFailed2.b;
                        confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.L$0 = bookableSuperPassConfiguration2;
                        confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.L$1 = str;
                        confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.L$2 = str;
                        confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.label = 7;
                        if (function3.invoke(str2, confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2) != obj) {
                            bookableSuperPassConfiguration3 = bookableSuperPassConfiguration2;
                            Q(bookableSuperPassConfiguration3);
                            return unit;
                        }
                    }
                }
                return obj;
            case 1:
                Function2 function4 = (Function2) confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.L$2;
                orderCreationFailed2 = (SuperPassOrderCreationError.OrderCreationFailed) confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.L$1;
                bookableSuperPassConfiguration2 = (BookableSuperPassConfiguration) confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.L$0;
                ResultKt.b(objX);
                objA = objX;
                function3 = function4;
                str = null;
                chaloUseCaseResult = (ChaloUseCaseResult) objA;
                if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                    BookableSuperPassConfiguration bookableSuperPassConfiguration6 = (BookableSuperPassConfiguration) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                    confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.L$0 = orderCreationFailed2;
                    confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.L$1 = str;
                    confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.L$2 = str;
                    confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.label = 2;
                    objX = this.l.x(bookableSuperPassConfiguration6, confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2);
                    if (objX != obj) {
                        superPassPurchaseSharedState2 = (SuperPassPurchaseSharedState) objX;
                        confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.L$0 = orderCreationFailed2;
                        confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.L$1 = superPassPurchaseSharedState2;
                        confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.label = 3;
                        if (I(superPassPurchaseSharedState2, confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2) != obj) {
                            l = orderCreationFailed2.e;
                            str3 = orderCreationFailed2.d;
                            if (str3 == null) {
                                str3 = orderCreationFailed2.b;
                            } else {
                                if (StringsKt.F(str3)) {
                                    str3 = str;
                                }
                                if (str3 == null) {
                                    str3 = orderCreationFailed2.b;
                                }
                            }
                            bookableSuperPassConfiguration4 = superPassPurchaseSharedState2.i;
                            if (bookableSuperPassConfiguration4 != null) {
                                strC = str;
                            } else {
                                strC = str;
                            }
                            if (strC != null) {
                                l2 = new Long(currencyFeature.b(strC));
                            } else {
                                l2 = str;
                            }
                            if (l != null) {
                                do {
                                    value2 = mutableStateFlow.getValue();
                                    it2 = (ConfirmSuperPassPurchaseDataState) value2;
                                    Intrinsics.i(it2, "it");
                                } while (!mutableStateFlow.c(value2, ConfirmSuperPassPurchaseDataState.a(it2, false, false, null, null, null, null, null, null, null, null, 2043)));
                                kotlinToastManager = this.z;
                                confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.L$0 = kotlinToastManager;
                                confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.L$1 = str;
                                confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.label = 4;
                                objX = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2);
                                if (objX != obj) {
                                    kotlinToastManager2 = kotlinToastManager;
                                    hq0.s(kotlinToastManager2, (String) objX);
                                    return unit;
                                }
                            } else {
                                do {
                                    value2 = mutableStateFlow.getValue();
                                    it2 = (ConfirmSuperPassPurchaseDataState) value2;
                                    Intrinsics.i(it2, "it");
                                } while (!mutableStateFlow.c(value2, ConfirmSuperPassPurchaseDataState.a(it2, false, false, null, null, null, null, null, null, null, null, 2043)));
                                kotlinToastManager = this.z;
                                confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.L$0 = kotlinToastManager;
                                confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.L$1 = str;
                                confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.label = 4;
                                objX = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2);
                                if (objX != obj) {
                                    kotlinToastManager2 = kotlinToastManager;
                                    hq0.s(kotlinToastManager2, (String) objX);
                                    return unit;
                                }
                            }
                        }
                    }
                } else {
                    if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                        throw new NoWhenBranchMatchedException();
                    }
                    do {
                        value = mutableStateFlow.getValue();
                        it = (ConfirmSuperPassPurchaseDataState) value;
                        Intrinsics.i(it, "it");
                    } while (!mutableStateFlow.c(value, ConfirmSuperPassPurchaseDataState.a(it, false, false, null, null, null, null, null, null, null, null, 2043)));
                    str2 = orderCreationFailed2.b;
                    confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.L$0 = bookableSuperPassConfiguration2;
                    confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.L$1 = str;
                    confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.L$2 = str;
                    confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.label = 7;
                    if (function3.invoke(str2, confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2) != obj) {
                        bookableSuperPassConfiguration3 = bookableSuperPassConfiguration2;
                        Q(bookableSuperPassConfiguration3);
                        return unit;
                    }
                }
                return obj;
            case 2:
                SuperPassOrderCreationError.OrderCreationFailed orderCreationFailed3 = (SuperPassOrderCreationError.OrderCreationFailed) confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.L$0;
                ResultKt.b(objX);
                orderCreationFailed2 = orderCreationFailed3;
                str = null;
                superPassPurchaseSharedState2 = (SuperPassPurchaseSharedState) objX;
                confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.L$0 = orderCreationFailed2;
                confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.L$1 = superPassPurchaseSharedState2;
                confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.label = 3;
                if (I(superPassPurchaseSharedState2, confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2) != obj) {
                    l = orderCreationFailed2.e;
                    str3 = orderCreationFailed2.d;
                    if (str3 == null) {
                        str3 = orderCreationFailed2.b;
                    } else {
                        if (StringsKt.F(str3)) {
                            str3 = str;
                        }
                        if (str3 == null) {
                            str3 = orderCreationFailed2.b;
                        }
                    }
                    bookableSuperPassConfiguration4 = superPassPurchaseSharedState2.i;
                    if (bookableSuperPassConfiguration4 != null) {
                        strC = str;
                    } else {
                        strC = str;
                    }
                    if (strC != null) {
                        l2 = new Long(currencyFeature.b(strC));
                    } else {
                        l2 = str;
                    }
                    if (l != null) {
                        do {
                            value2 = mutableStateFlow.getValue();
                            it2 = (ConfirmSuperPassPurchaseDataState) value2;
                            Intrinsics.i(it2, "it");
                        } while (!mutableStateFlow.c(value2, ConfirmSuperPassPurchaseDataState.a(it2, false, false, null, null, null, null, null, null, null, null, 2043)));
                        kotlinToastManager = this.z;
                        confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.L$0 = kotlinToastManager;
                        confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.L$1 = str;
                        confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.label = 4;
                        objX = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2);
                        if (objX != obj) {
                            kotlinToastManager2 = kotlinToastManager;
                            hq0.s(kotlinToastManager2, (String) objX);
                            return unit;
                        }
                    } else {
                        do {
                            value2 = mutableStateFlow.getValue();
                            it2 = (ConfirmSuperPassPurchaseDataState) value2;
                            Intrinsics.i(it2, "it");
                        } while (!mutableStateFlow.c(value2, ConfirmSuperPassPurchaseDataState.a(it2, false, false, null, null, null, null, null, null, null, null, 2043)));
                        kotlinToastManager = this.z;
                        confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.L$0 = kotlinToastManager;
                        confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.L$1 = str;
                        confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.label = 4;
                        objX = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2);
                        if (objX != obj) {
                            kotlinToastManager2 = kotlinToastManager;
                            hq0.s(kotlinToastManager2, (String) objX);
                            return unit;
                        }
                    }
                }
                return obj;
            case 3:
                superPassPurchaseSharedState2 = (SuperPassPurchaseSharedState) confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.L$1;
                orderCreationFailed2 = (SuperPassOrderCreationError.OrderCreationFailed) confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.L$0;
                ResultKt.b(objX);
                str = null;
                l = orderCreationFailed2.e;
                str3 = orderCreationFailed2.d;
                if (str3 == null) {
                    str3 = orderCreationFailed2.b;
                } else {
                    if (StringsKt.F(str3)) {
                        str3 = str;
                    }
                    if (str3 == null) {
                        str3 = orderCreationFailed2.b;
                    }
                }
                bookableSuperPassConfiguration4 = superPassPurchaseSharedState2.i;
                if (bookableSuperPassConfiguration4 != null) {
                    strC = str;
                } else {
                    strC = str;
                }
                if (strC != null) {
                    l2 = new Long(currencyFeature.b(strC));
                } else {
                    l2 = str;
                }
                if (l != null) {
                    do {
                        value2 = mutableStateFlow.getValue();
                        it2 = (ConfirmSuperPassPurchaseDataState) value2;
                        Intrinsics.i(it2, "it");
                    } while (!mutableStateFlow.c(value2, ConfirmSuperPassPurchaseDataState.a(it2, false, false, null, null, null, null, null, null, null, null, 2043)));
                    kotlinToastManager = this.z;
                    confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.L$0 = kotlinToastManager;
                    confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.L$1 = str;
                    confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.label = 4;
                    objX = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2);
                    if (objX != obj) {
                        kotlinToastManager2 = kotlinToastManager;
                        hq0.s(kotlinToastManager2, (String) objX);
                        return unit;
                    }
                } else {
                    do {
                        value2 = mutableStateFlow.getValue();
                        it2 = (ConfirmSuperPassPurchaseDataState) value2;
                        Intrinsics.i(it2, "it");
                    } while (!mutableStateFlow.c(value2, ConfirmSuperPassPurchaseDataState.a(it2, false, false, null, null, null, null, null, null, null, null, 2043)));
                    kotlinToastManager = this.z;
                    confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.L$0 = kotlinToastManager;
                    confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.L$1 = str;
                    confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.label = 4;
                    objX = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2);
                    if (objX != obj) {
                        kotlinToastManager2 = kotlinToastManager;
                        hq0.s(kotlinToastManager2, (String) objX);
                        return unit;
                    }
                }
                return obj;
            case 4:
                kotlinToastManager2 = (KotlinToastManager) confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.L$0;
                ResultKt.b(objX);
                hq0.s(kotlinToastManager2, (String) objX);
                return unit;
            case 5:
                str4 = (String) confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.L$1;
                l = (Long) confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.L$0;
                ResultKt.b(objX);
                str5 = (String) objX;
                String strA2 = currencyFeature.a(l.longValue(), CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.L$0 = str4;
                confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.L$1 = str5;
                confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.label = 6;
                objB = stringProvider.b(StringEnum.PAY_PREFIX, new Object[]{strA2}, confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2);
                if (objB != obj) {
                    String str13 = str4;
                    str6 = str5;
                    objX = objB;
                    str7 = str13;
                    str8 = (String) objX;
                    do {
                        value3 = mutableStateFlow.getValue();
                        it3 = (ConfirmSuperPassPurchaseDataState) value3;
                        Intrinsics.i(it3, "it");
                    } while (!mutableStateFlow.c(value3, ConfirmSuperPassPurchaseDataState.a(it3, false, false, null, new PassConfirmationBottomSheetType.FareMappingFailed(str7, str8, str6), null, null, null, null, null, null, 2035)));
                    return unit;
                }
                return obj;
            case 6:
                String str14 = (String) confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.L$1;
                String str15 = (String) confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.L$0;
                ResultKt.b(objX);
                str7 = str15;
                str6 = str14;
                str8 = (String) objX;
                do {
                    value3 = mutableStateFlow.getValue();
                    it3 = (ConfirmSuperPassPurchaseDataState) value3;
                    Intrinsics.i(it3, "it");
                } while (!mutableStateFlow.c(value3, ConfirmSuperPassPurchaseDataState.a(it3, false, false, null, new PassConfirmationBottomSheetType.FareMappingFailed(str7, str8, str6), null, null, null, null, null, null, 2035)));
                return unit;
            case 7:
                bookableSuperPassConfiguration3 = (BookableSuperPassConfiguration) confirmSuperPassPurchaseViewModel$handlePassFareMappingFailedError$2.L$0;
                ResultKt.b(objX);
                Q(bookableSuperPassConfiguration3);
                return unit;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0088  */
    /* JADX WARN: Code duplicated, block: B:26:0x008b  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:63:0x0105  */
    /* JADX WARN: Code duplicated, block: B:67:0x011e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0136  */
    /* JADX WARN: Code duplicated, block: B:71:0x0151 A[LOOP:0: B:71:0x0151->B:76:?, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
    
        if (r2 == r4) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I(app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedState r29, kotlin.coroutines.jvm.internal.ContinuationImpl r30) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassPurchaseViewModel.I(app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedState, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object J(SuperPassPurchaseSharedState superPassPurchaseSharedState, ContinuationImpl continuationImpl) {
        ConfirmSuperPassPurchaseViewModel$offersSection$1 confirmSuperPassPurchaseViewModel$offersSection$1;
        ApplicableRuleUxCopyAppModel.PassPurchaseConfirmationScreen passPurchaseConfirmationScreen;
        if (continuationImpl instanceof ConfirmSuperPassPurchaseViewModel$offersSection$1) {
            confirmSuperPassPurchaseViewModel$offersSection$1 = (ConfirmSuperPassPurchaseViewModel$offersSection$1) continuationImpl;
            int i = confirmSuperPassPurchaseViewModel$offersSection$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                confirmSuperPassPurchaseViewModel$offersSection$1.label = i - Integer.MIN_VALUE;
            } else {
                confirmSuperPassPurchaseViewModel$offersSection$1 = new ConfirmSuperPassPurchaseViewModel$offersSection$1(this, continuationImpl);
            }
        } else {
            confirmSuperPassPurchaseViewModel$offersSection$1 = new ConfirmSuperPassPurchaseViewModel$offersSection$1(this, continuationImpl);
        }
        Object obj = confirmSuperPassPurchaseViewModel$offersSection$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = confirmSuperPassPurchaseViewModel$offersSection$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            ApplicableRuleUxCopyAppModel.PassPurchaseConfirmationScreen passPurchaseConfirmationScreenA = BookableSuperPassConfigurationKt.a(superPassPurchaseSharedState.i);
            if (passPurchaseConfirmationScreenA == null) {
                return null;
            }
            confirmSuperPassPurchaseViewModel$offersSection$1.L$0 = passPurchaseConfirmationScreenA;
            confirmSuperPassPurchaseViewModel$offersSection$1.label = 1;
            Object objB = this.m.b(StringEnum.OFFERS_AND_BENEFITS, new Object[0], confirmSuperPassPurchaseViewModel$offersSection$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            passPurchaseConfirmationScreen = passPurchaseConfirmationScreenA;
            obj = objB;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            passPurchaseConfirmationScreen = (ApplicableRuleUxCopyAppModel.PassPurchaseConfirmationScreen) confirmSuperPassPurchaseViewModel$offersSection$1.L$0;
            ResultKt.b(obj);
        }
        TextUIState.ChaloTextUIState chaloTextUIState = new TextUIState.ChaloTextUIState((String) obj, UITextStyle.DisplaySmall, ChaloColorToken.Black_87.f9768a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
        String str = passPurchaseConfirmationScreen.b;
        ChaloTextStyleHelper chaloTextStyleHelper = ChaloTextStyleHelper.f10078a;
        TextUIState.ChaloTextUIState chaloTextUIStateG = ChaloTextStyleHelper.g(chaloTextStyleHelper, str, ChaloColorToken.Black.f9759a, null, null, null, null, 124);
        String str2 = passPurchaseConfirmationScreen.c;
        String str3 = !StringsKt.F(str2) ? str2 : null;
        return new ConfirmSuperPassOffersSectionUIState(chaloTextUIState, new ConfirmSuperPassOfferCardUIState(new ImageUIState(IconType.IC_INFO_I, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new ps(this, 8)), 118), chaloTextUIStateG, str3 != null ? ChaloTextStyleHelper.c(chaloTextStyleHelper, str3, ChaloColorToken.ShadyGray.f9851a, null, null, null, null, 124) : null));
    }

    public final void K(ConfirmSuperPassPurchaseIntent intent) {
        Object value;
        ConfirmSuperPassPurchaseDataState it;
        Object value2;
        ConfirmSuperPassPurchaseDataState it2;
        Object value3;
        ConfirmSuperPassPurchaseDataState it3;
        String str;
        Object value4;
        ConfirmSuperPassPurchaseDataState it4;
        Object value5;
        ConfirmSuperPassPurchaseDataState it5;
        Object value6;
        ConfirmSuperPassPurchaseDataState it6;
        Object value7;
        ConfirmSuperPassPurchaseDataState it7;
        SuperPassProductConfigurationProperties superPassProductConfigurationProperties;
        Object value8;
        ConfirmSuperPassPurchaseDataState it8;
        List list;
        Object value9;
        ConfirmSuperPassPurchaseDataState it9;
        Intrinsics.i(intent, "intent");
        o(intent);
        boolean zEquals = intent.equals(ConfirmSuperPassPurchaseIntent.InitializationIntent.f8374a);
        ContextScope contextScope = this.j;
        List list2 = null;
        if (zEquals) {
            BuildersKt.d(contextScope, null, null, new ConfirmSuperPassPurchaseViewModel$handleInitializationIntent$1(this, null), 3);
            return;
        }
        if (intent.equals(ConfirmSuperPassPurchaseIntent.EditPassStartDateIntent.f8369a)) {
            BuildersKt.d(contextScope, null, null, new ConfirmSuperPassPurchaseViewModel$handleEditPassStartDateIntent$1(this, null), 3);
            return;
        }
        boolean zEquals2 = intent.equals(ConfirmSuperPassPurchaseIntent.EditUserNameForNoProofRequirementIntent.f8370a);
        ChaloNavigationManager chaloNavigationManager = this.q;
        if (zEquals2) {
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new SuperPassPurchaseArgs.EnterUserDetailsArgs.InternalArgs(SuperPassBasicUserPurpose.EDIT_NAME), null, null, 6));
            return;
        }
        boolean zEquals3 = intent.equals(ConfirmSuperPassPurchaseIntent.FareDetailsLayoutClickedIntent.f8371a);
        MutableStateFlow mutableStateFlow = this.e;
        if (zEquals3) {
            do {
                value9 = mutableStateFlow.getValue();
                it9 = (ConfirmSuperPassPurchaseDataState) value9;
                Intrinsics.i(it9, "it");
            } while (!mutableStateFlow.c(value9, ConfirmSuperPassPurchaseDataState.a(it9, !it9.f8364a, false, null, null, null, null, null, null, null, null, 2046)));
            return;
        }
        ConfirmSuperPassPurchaseIntent.SubmitBtnClickedIntent submitBtnClickedIntent = ConfirmSuperPassPurchaseIntent.SubmitBtnClickedIntent.f8379a;
        if (intent.equals(submitBtnClickedIntent)) {
            BuildersKt.d(contextScope, null, null, new ConfirmSuperPassPurchaseViewModel$handleSubmitBtnClickedIntent$1(this, null), 3);
            return;
        }
        if (intent instanceof ConfirmSuperPassPurchaseIntent.PostOnlinePaymentIntent) {
            BuildersKt.d(contextScope, null, null, new ConfirmSuperPassPurchaseViewModel$handlePostOnlinePaymentIntent$1(this, (ConfirmSuperPassPurchaseIntent.PostOnlinePaymentIntent) intent, null), 3);
            return;
        }
        if (intent instanceof ConfirmSuperPassPurchaseIntent.PostCashPaymentIntent) {
            BuildersKt.d(contextScope, null, null, new ConfirmSuperPassPurchaseViewModel$handlePostCashPaymentIntent$1(this, (ConfirmSuperPassPurchaseIntent.PostCashPaymentIntent) intent, null), 3);
            return;
        }
        boolean zEquals4 = intent.equals(ConfirmSuperPassPurchaseIntent.ShowTermsAndConditions.f8378a);
        SuperPassConfirmationManager superPassConfirmationManager = this.l;
        if (zEquals4) {
            BookableSuperPassConfiguration bookableSuperPassConfiguration = ((SuperPassPurchaseSharedState) superPassConfirmationManager.getF().getValue()).i;
            ApplicableRuleUxCopyAppModel.PassPurchaseConfirmationScreen passPurchaseConfirmationScreenA = BookableSuperPassConfigurationKt.a(bookableSuperPassConfiguration);
            if (passPurchaseConfirmationScreenA != null && (list = passPurchaseConfirmationScreenA.d) != null) {
                list2 = list;
            } else if (bookableSuperPassConfiguration != null && (superPassProductConfigurationProperties = bookableSuperPassConfiguration.b) != null) {
                list2 = superPassProductConfigurationProperties.l;
            }
            if (list2 != null) {
                do {
                    value8 = mutableStateFlow.getValue();
                    it8 = (ConfirmSuperPassPurchaseDataState) value8;
                    Intrinsics.i(it8, "it");
                } while (!mutableStateFlow.c(value8, ConfirmSuperPassPurchaseDataState.a(it8, false, false, null, new PassConfirmationBottomSheetType.TermsAndConditions(list2), null, null, null, null, null, null, 2039)));
                return;
            }
            return;
        }
        if (intent.equals(ConfirmSuperPassPurchaseIntent.DismissDialogIntent.f8367a)) {
            do {
                value7 = mutableStateFlow.getValue();
                it7 = (ConfirmSuperPassPurchaseDataState) value7;
                Intrinsics.i(it7, "it");
            } while (!mutableStateFlow.c(value7, ConfirmSuperPassPurchaseDataState.a(it7, false, false, null, null, null, null, null, null, null, null, 2043)));
            return;
        }
        if (intent instanceof ConfirmSuperPassPurchaseIntent.DateSelectedIntent) {
            ConfirmSuperPassPurchaseIntent.DateSelectedIntent dateSelectedIntent = (ConfirmSuperPassPurchaseIntent.DateSelectedIntent) intent;
            long j = dateSelectedIntent.f8365a;
            Job job = this.J;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
            PassValidityInfo passValidityInfo = ((ConfirmSuperPassPurchaseDataState) this.f.getValue()).j;
            Long l = passValidityInfo != null ? passValidityInfo.c : null;
            TimeUtilsContract timeUtilsContract = this.r;
            Pair pair = new Pair("revisedPassStartDate", timeUtilsContract.g(j));
            BasicInfoContract basicInfoContract = this.o;
            AnalyticsContract.DefaultImpls.a(this.n, "pass start date change CTA clicked", "CONFIRM_SUPER_PASS_PURCHASE_FRAGMENT", MapsKt.i(pair, new Pair("oldPassStartDate", timeUtilsContract.g(l != null ? l.longValue() : basicInfoContract.j())), new Pair("postponedByDays", Integer.valueOf(timeUtilsContract.s(l != null ? l.longValue() : basicInfoContract.j(), j)))), null, false, 24);
            superPassConfirmationManager.S(j);
            BuildersKt.d(contextScope, null, null, new ConfirmSuperPassPurchaseViewModel$handleDateSelectedIntent$1(this, dateSelectedIntent, null), 3);
            return;
        }
        if (intent.equals(ConfirmSuperPassPurchaseIntent.PassAlreadyAvailedBottomSheetPositiveClickedIntent.f8375a)) {
            Source source = Source.CONFIRM_SUPER_PASS_PURCHASE_FRAGMENT;
            AnalyticsContractImplKt.b(this.n, "explore available plans clicked", source, null, false, 28);
            do {
                value6 = mutableStateFlow.getValue();
                it6 = (ConfirmSuperPassPurchaseDataState) value6;
                Intrinsics.i(it6, "it");
            } while (!mutableStateFlow.c(value6, ConfirmSuperPassPurchaseDataState.a(it6, false, false, null, null, null, null, null, null, null, null, 2039)));
            ChaloNavigationManagerKt.e(chaloNavigationManager, new ProductSelectionArgs(null, null, null, source, false, null, 223), new ChaloNavOptions(new PopUpToConfig.Scene(ChaloScenes.ProductSelection, true), 3), 4);
            return;
        }
        if (intent.equals(ConfirmSuperPassPurchaseIntent.FareMappingFailedBottomSheetConfirmClickedIntent.f8373a)) {
            do {
                value5 = mutableStateFlow.getValue();
                it5 = (ConfirmSuperPassPurchaseDataState) value5;
                Intrinsics.i(it5, "it");
            } while (!mutableStateFlow.c(value5, ConfirmSuperPassPurchaseDataState.a(it5, false, false, null, null, null, null, null, null, null, null, 2039)));
            K(submitBtnClickedIntent);
            return;
        }
        if (intent.equals(ConfirmSuperPassPurchaseIntent.FareMappingFailedBottomSheetCancelClickedIntent.f8372a)) {
            do {
                value4 = mutableStateFlow.getValue();
                it4 = (ConfirmSuperPassPurchaseDataState) value4;
                Intrinsics.i(it4, "it");
            } while (!mutableStateFlow.c(value4, ConfirmSuperPassPurchaseDataState.a(it4, false, false, null, null, null, null, null, null, null, null, 2039)));
            return;
        }
        if (intent instanceof ConfirmSuperPassPurchaseIntent.ZoomProofImageIntent) {
            ProofUploadDetails proofUploadDetails = ((ConfirmSuperPassPurchaseIntent.ZoomProofImageIntent) intent).f8380a;
            do {
                value3 = mutableStateFlow.getValue();
                it3 = (ConfirmSuperPassPurchaseDataState) value3;
                Intrinsics.i(it3, "it");
                str = proofUploadDetails.f8316a;
                if (str.length() <= 0) {
                    str = null;
                }
            } while (!mutableStateFlow.c(value3, ConfirmSuperPassPurchaseDataState.a(it3, false, false, null, null, new EnlargeProofImage(str, proofUploadDetails.b), null, null, null, null, null, 2031)));
            return;
        }
        if (intent.equals(ConfirmSuperPassPurchaseIntent.DismissZoomImageIntent.f8368a)) {
            do {
                value2 = mutableStateFlow.getValue();
                it2 = (ConfirmSuperPassPurchaseDataState) value2;
                Intrinsics.i(it2, "it");
            } while (!mutableStateFlow.c(value2, ConfirmSuperPassPurchaseDataState.a(it2, false, false, null, null, null, null, null, null, null, null, 2031)));
            return;
        }
        if (!intent.equals(ConfirmSuperPassPurchaseIntent.DismissBottomSheetIntent.f8366a)) {
            throw new NoWhenBranchMatchedException();
        }
        do {
            value = mutableStateFlow.getValue();
            it = (ConfirmSuperPassPurchaseDataState) value;
            Intrinsics.i(it, "it");
        } while (!mutableStateFlow.c(value, ConfirmSuperPassPurchaseDataState.a(it, false, false, null, null, null, null, null, null, null, null, 2039)));
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0167, code lost:
    
        if (r3.invoke(r2, r5) == r6) goto L79;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L(app.chalo.models.BookableSuperPassConfiguration r30, app.chalo.productpurchase.passpurchase.domain.SuperPassOrderCreationError r31, app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedState r32, kotlin.coroutines.jvm.internal.ContinuationImpl r33) {
        /*
            Method dump skipped, instruction units count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassPurchaseViewModel.L(app.chalo.models.BookableSuperPassConfiguration, app.chalo.productpurchase.passpurchase.domain.SuperPassOrderCreationError, app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedState, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object M(BookableSuperPassConfiguration bookableSuperPassConfiguration, CreateOrderResponseAppModel createOrderResponseAppModel, ContinuationImpl continuationImpl) {
        ConfirmSuperPassPurchaseViewModel$processOrderCreationSuccess$1 confirmSuperPassPurchaseViewModel$processOrderCreationSuccess$1;
        Object objA;
        BookableSuperPassConfiguration bookableSuperPassConfiguration2;
        CreateOrderResponseAppModel createOrderResponseAppModel2;
        String str;
        String str2;
        if (continuationImpl instanceof ConfirmSuperPassPurchaseViewModel$processOrderCreationSuccess$1) {
            confirmSuperPassPurchaseViewModel$processOrderCreationSuccess$1 = (ConfirmSuperPassPurchaseViewModel$processOrderCreationSuccess$1) continuationImpl;
            int i = confirmSuperPassPurchaseViewModel$processOrderCreationSuccess$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                confirmSuperPassPurchaseViewModel$processOrderCreationSuccess$1.label = i - Integer.MIN_VALUE;
            } else {
                confirmSuperPassPurchaseViewModel$processOrderCreationSuccess$1 = new ConfirmSuperPassPurchaseViewModel$processOrderCreationSuccess$1(this, continuationImpl);
            }
        } else {
            confirmSuperPassPurchaseViewModel$processOrderCreationSuccess$1 = new ConfirmSuperPassPurchaseViewModel$processOrderCreationSuccess$1(this, continuationImpl);
        }
        Object obj = confirmSuperPassPurchaseViewModel$processOrderCreationSuccess$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = confirmSuperPassPurchaseViewModel$processOrderCreationSuccess$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(obj);
            confirmSuperPassPurchaseViewModel$processOrderCreationSuccess$1.L$0 = bookableSuperPassConfiguration;
            confirmSuperPassPurchaseViewModel$processOrderCreationSuccess$1.L$1 = createOrderResponseAppModel;
            confirmSuperPassPurchaseViewModel$processOrderCreationSuccess$1.label = 1;
            if (!Intrinsics.d(bookableSuperPassConfiguration.b.j, "rideBasedPass") || (objA = this.t.a(createOrderResponseAppModel.b, confirmSuperPassPurchaseViewModel$processOrderCreationSuccess$1)) != coroutineSingletons) {
                objA = unit;
            }
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            bookableSuperPassConfiguration2 = bookableSuperPassConfiguration;
            createOrderResponseAppModel2 = createOrderResponseAppModel;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CreateOrderResponseAppModel createOrderResponseAppModel3 = (CreateOrderResponseAppModel) confirmSuperPassPurchaseViewModel$processOrderCreationSuccess$1.L$1;
            BookableSuperPassConfiguration bookableSuperPassConfiguration3 = (BookableSuperPassConfiguration) confirmSuperPassPurchaseViewModel$processOrderCreationSuccess$1.L$0;
            ResultKt.b(obj);
            createOrderResponseAppModel2 = createOrderResponseAppModel3;
            bookableSuperPassConfiguration2 = bookableSuperPassConfiguration3;
        }
        LinkedHashMap linkedHashMapK = MapsKt.k(new Pair(PaymentConstants.ORDER_ID_CAMEL, createOrderResponseAppModel2.f), new Pair("chaloOrderId", createOrderResponseAppModel2.g));
        u(linkedHashMapK);
        P("mPass order created", linkedHashMapK);
        Job job = this.I;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        this.I = BuildersKt.d(this.j, null, null, new ConfirmSuperPassPurchaseViewModel$processOrderCreationSuccess$2(this, createOrderResponseAppModel2, null), 3);
        UserProfileAppModel userProfileAppModelF = this.x.f();
        Json json = ChaloJson.b;
        Intrinsics.i(bookableSuperPassConfiguration2, "<this>");
        CheckoutIntentModel checkoutIntentModelA = SuperPassCheckoutIntentModelHelperKt.a(createOrderResponseAppModel2, bookableSuperPassConfiguration2, AllProductConfigsResponseAppModelKt.i(bookableSuperPassConfiguration2.c) > 1, bookableSuperPassConfiguration2.b.j, "sourceSuperPassPurchaseFragment", (userProfileAppModelF == null || (str2 = userProfileAppModelF.e) == null) ? "" : str2, (userProfileAppModelF == null || (str = userProfileAppModelF.i) == null) ? "" : str, this.r, Source.CONFIRM_SUPER_PASS_PURCHASE_FRAGMENT);
        json.getClass();
        this.q.b(new ChaloNavigationRequest.Navigate(new CheckoutPaymentMainArgs(createOrderResponseAppModel2.f, json.a(CheckoutIntentModel.INSTANCE.serializer(), checkoutIntentModelA)), null, "CheckoutTag", 2));
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object N(SuperPassPurchaseSharedState superPassPurchaseSharedState, ContinuationImpl continuationImpl) {
        ConfirmSuperPassPurchaseViewModel$productDurationCategoryName$1 confirmSuperPassPurchaseViewModel$productDurationCategoryName$1;
        final BookableSuperPassConfiguration bookableSuperPassConfiguration;
        final SuperPassProductConfigFareMappingResponseAppModel superPassProductConfigFareMappingResponseAppModel;
        if (continuationImpl instanceof ConfirmSuperPassPurchaseViewModel$productDurationCategoryName$1) {
            confirmSuperPassPurchaseViewModel$productDurationCategoryName$1 = (ConfirmSuperPassPurchaseViewModel$productDurationCategoryName$1) continuationImpl;
            int i = confirmSuperPassPurchaseViewModel$productDurationCategoryName$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                confirmSuperPassPurchaseViewModel$productDurationCategoryName$1.label = i - Integer.MIN_VALUE;
            } else {
                confirmSuperPassPurchaseViewModel$productDurationCategoryName$1 = new ConfirmSuperPassPurchaseViewModel$productDurationCategoryName$1(this, continuationImpl);
            }
        } else {
            confirmSuperPassPurchaseViewModel$productDurationCategoryName$1 = new ConfirmSuperPassPurchaseViewModel$productDurationCategoryName$1(this, continuationImpl);
        }
        Object obj = confirmSuperPassPurchaseViewModel$productDurationCategoryName$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = confirmSuperPassPurchaseViewModel$productDurationCategoryName$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            BookableSuperPassConfiguration bookableSuperPassConfiguration2 = superPassPurchaseSharedState.i;
            if (bookableSuperPassConfiguration2 == null) {
                return null;
            }
            SuperPassProductConfigFareMappingResponseAppModel superPassProductConfigFareMappingResponseAppModel2 = bookableSuperPassConfiguration2.c;
            confirmSuperPassPurchaseViewModel$productDurationCategoryName$1.L$0 = bookableSuperPassConfiguration2;
            confirmSuperPassPurchaseViewModel$productDurationCategoryName$1.L$1 = superPassProductConfigFareMappingResponseAppModel2;
            confirmSuperPassPurchaseViewModel$productDurationCategoryName$1.label = 1;
            Object objB = this.m.b(StringEnum.CATEGORY, new Object[0], confirmSuperPassPurchaseViewModel$productDurationCategoryName$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            bookableSuperPassConfiguration = bookableSuperPassConfiguration2;
            superPassProductConfigFareMappingResponseAppModel = superPassProductConfigFareMappingResponseAppModel2;
            obj = objB;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            superPassProductConfigFareMappingResponseAppModel = (SuperPassProductConfigFareMappingResponseAppModel) confirmSuperPassPurchaseViewModel$productDurationCategoryName$1.L$1;
            bookableSuperPassConfiguration = (BookableSuperPassConfiguration) confirmSuperPassPurchaseViewModel$productDurationCategoryName$1.L$0;
            ResultKt.b(obj);
        }
        final String str = (String) obj;
        return TextWithSpecialFeaturesTagsUIStateKt.c(0.0f, new Function1<TextWithSpecialFeatureBuilder, Unit>() { // from class: app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassPurchaseViewModel$productDurationCategoryName$2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                ArrayList arrayList = ((TextWithSpecialFeatureBuilder) obj2).f10091a;
                SuperPassProductConfigFareMappingResponseAppModel superPassProductConfigFareMappingResponseAppModel3 = superPassProductConfigFareMappingResponseAppModel;
                Intrinsics.i(superPassProductConfigFareMappingResponseAppModel3, "<this>");
                List list = superPassProductConfigFareMappingResponseAppModel3.n;
                int i3 = AllProductConfigsResponseAppModelKt.i(superPassProductConfigFareMappingResponseAppModel3);
                String strA = vo1.A(i3 == 1 ? "1 Day" : cb0.h(i3, " Days"), ",");
                UITextStyle uITextStyle = UITextStyle.BodyMedium;
                ChaloColorToken.Black_70 black_70 = ChaloColorToken.Black_70.f9767a;
                TextWithSpecialFeatureBuilder.b(arrayList, strA, uITextStyle, black_70, null, 120);
                if (!list.isEmpty()) {
                    TextWithSpecialFeatureBuilder.d(arrayList, list);
                }
                TextWithSpecialFeatureBuilder.b(arrayList, z40.g(" ", bookableSuperPassConfiguration.d.c, " ", str), uITextStyle, black_70, null, 120);
                return Unit.f17538a;
            }
        }, 3);
    }

    public final void P(String str, LinkedHashMap linkedHashMap) {
        SuperPassProductConfigurationProperties superPassProductConfigurationProperties;
        SuperPassConfirmationManager superPassConfirmationManager = this.l;
        linkedHashMap.put("flow", String.valueOf(((SuperPassPurchaseSharedState) superPassConfirmationManager.getF().getValue()).d));
        linkedHashMap.put("isSuperPass", Boolean.TRUE);
        BookableSuperPassConfiguration bookableSuperPassConfiguration = ((SuperPassPurchaseSharedState) superPassConfirmationManager.getF().getValue()).i;
        linkedHashMap.put("productId", String.valueOf((bookableSuperPassConfiguration == null || (superPassProductConfigurationProperties = bookableSuperPassConfiguration.b) == null) ? null : superPassProductConfigurationProperties.f5600a));
        AnalyticsContractImplKt.b(this.n, str, Source.CONFIRM_SUPER_PASS_PURCHASE_FRAGMENT, linkedHashMap, false, 24);
    }

    public final void Q(BookableSuperPassConfiguration bookableSuperPassConfiguration) {
        this.q.b(new ChaloNavigationRequest.Navigate(new ProductSelectionArgs(null, bookableSuperPassConfiguration.f5569a, null, null, false, null, 221), null, null, 6));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00dc, code lost:
    
        if (r2 == r3) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01c5, code lost:
    
        if (r4 == r3) goto L60;
     */
    /* JADX WARN: Type inference failed for: r2v11, types: [app.chalo.scenes.ChaloNavOptions, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object U(app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedState r30, app.chalo.models.BookableSuperPassConfiguration r31, boolean r32, kotlin.coroutines.jvm.internal.ContinuationImpl r33) {
        /*
            Method dump skipped, instruction units count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassPurchaseViewModel.U(app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedState, app.chalo.models.BookableSuperPassConfiguration, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:50:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:53:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:54:0x0202  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14, types: [app.chalo.uistate.text.UITextAlign, app.chalo.uistate.text.UITextOverflow] */
    /* JADX WARN: Type inference failed for: r4v15 */
    public final Object V(SuperPassPurchaseSharedState superPassPurchaseSharedState, ContinuationImpl continuationImpl) {
        ConfirmSuperPassPurchaseViewModel$superPassTncSection$1 confirmSuperPassPurchaseViewModel$superPassTncSection$1;
        List list;
        StringProvider stringProvider;
        int i;
        Object obj;
        List arrayList;
        Object objB;
        List list2;
        List list3;
        SuperPassProductConfigurationProperties superPassProductConfigurationProperties;
        Object objB2;
        String str;
        List list4;
        List list5;
        List list6;
        List list7;
        List list8;
        ?? r4;
        TextUIState.StyledTextUIState styledTextUIState;
        if (continuationImpl instanceof ConfirmSuperPassPurchaseViewModel$superPassTncSection$1) {
            confirmSuperPassPurchaseViewModel$superPassTncSection$1 = (ConfirmSuperPassPurchaseViewModel$superPassTncSection$1) continuationImpl;
            int i2 = confirmSuperPassPurchaseViewModel$superPassTncSection$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                confirmSuperPassPurchaseViewModel$superPassTncSection$1.label = i2 - Integer.MIN_VALUE;
            } else {
                confirmSuperPassPurchaseViewModel$superPassTncSection$1 = new ConfirmSuperPassPurchaseViewModel$superPassTncSection$1(this, continuationImpl);
            }
        } else {
            confirmSuperPassPurchaseViewModel$superPassTncSection$1 = new ConfirmSuperPassPurchaseViewModel$superPassTncSection$1(this, continuationImpl);
        }
        Object objB3 = confirmSuperPassPurchaseViewModel$superPassTncSection$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = confirmSuperPassPurchaseViewModel$superPassTncSection$1.label;
        ChaloColorToken.Black_70 black_70 = ChaloColorToken.Black_70.f9767a;
        StringProvider stringProvider2 = this.m;
        if (i3 == 0) {
            ResultKt.b(objB3);
            BookableSuperPassConfiguration bookableSuperPassConfiguration = superPassPurchaseSharedState.i;
            if (bookableSuperPassConfiguration == null || (superPassProductConfigurationProperties = bookableSuperPassConfiguration.b) == null || (list = superPassProductConfigurationProperties.m) == null) {
                list = EmptyList.f17557a;
            }
            List list9 = list;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.v(list9, 10));
            int i4 = 0;
            for (Object obj2 : list9) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                String str2 = (String) obj2;
                String str3 = i4 == CollectionsKt.K(list) ? "" : IOUtils.LINE_SEPARATOR_UNIX;
                StringProvider stringProvider3 = stringProvider2;
                ArrayList arrayList3 = arrayList2;
                arrayList3.add(new StyledTextDataUIState(i5 + ". " + str2 + str3, black_70, null, UITextStyle.BodyMedium, null, null, null, 1012));
                list = list;
                arrayList2 = arrayList3;
                stringProvider2 = stringProvider3;
                i4 = i5;
            }
            stringProvider = stringProvider2;
            ArrayList arrayList4 = arrayList2;
            i = 0;
            obj = null;
            arrayList = new ArrayList();
            confirmSuperPassPurchaseViewModel$superPassTncSection$1.L$0 = arrayList4;
            confirmSuperPassPurchaseViewModel$superPassTncSection$1.L$1 = arrayList;
            confirmSuperPassPurchaseViewModel$superPassTncSection$1.L$2 = arrayList;
            confirmSuperPassPurchaseViewModel$superPassTncSection$1.label = 1;
            objB = stringProvider.b(StringEnum.TNC_CLICKABLE_TEXT, new Object[0], confirmSuperPassPurchaseViewModel$superPassTncSection$1);
            if (objB != coroutineSingletons) {
                list2 = arrayList;
                list3 = arrayList4;
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            List list10 = (List) confirmSuperPassPurchaseViewModel$superPassTncSection$1.L$2;
            arrayList = (List) confirmSuperPassPurchaseViewModel$superPassTncSection$1.L$1;
            list3 = (List) confirmSuperPassPurchaseViewModel$superPassTncSection$1.L$0;
            ResultKt.b(objB3);
            stringProvider = stringProvider2;
            obj = null;
            list2 = list10;
            objB = objB3;
            i = 0;
        } else if (i3 == 2) {
            String str4 = (String) confirmSuperPassPurchaseViewModel$superPassTncSection$1.L$3;
            list6 = (List) confirmSuperPassPurchaseViewModel$superPassTncSection$1.L$2;
            List list11 = (List) confirmSuperPassPurchaseViewModel$superPassTncSection$1.L$1;
            List list12 = (List) confirmSuperPassPurchaseViewModel$superPassTncSection$1.L$0;
            ResultKt.b(objB3);
            objB2 = objB3;
            str = str4;
            stringProvider = stringProvider2;
            list4 = list11;
            list5 = list12;
            i = 0;
            obj = null;
            String str5 = (String) objB2;
            String strSubstring = str5.substring(i, str5.length() - str.length());
            Intrinsics.h(strSubstring, "substring(...)");
            UITextStyle uITextStyle = UITextStyle.BodyMedium;
            List list13 = list6;
            list13.add(new StyledTextDataUIState(strSubstring, black_70, null, uITextStyle, null, null, null, 1012));
            String strSubstring2 = str5.substring(str5.length() - str.length());
            Intrinsics.h(strSubstring2, "substring(...)");
            list13.add(new StyledTextDataUIState(strSubstring2, ChaloColorToken.OrangePrimary.f9835a, null, uITextStyle, null, null, new StyledTextClickHandler$Companion$create$1("TNC", "TNC", new ps(this, 4)), ServiceStarter.ERROR_UNKNOWN));
            confirmSuperPassPurchaseViewModel$superPassTncSection$1.L$0 = list5;
            confirmSuperPassPurchaseViewModel$superPassTncSection$1.L$1 = list4;
            Object obj3 = obj;
            confirmSuperPassPurchaseViewModel$superPassTncSection$1.L$2 = obj3;
            confirmSuperPassPurchaseViewModel$superPassTncSection$1.L$3 = obj3;
            confirmSuperPassPurchaseViewModel$superPassTncSection$1.label = 3;
            objB3 = stringProvider.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], confirmSuperPassPurchaseViewModel$superPassTncSection$1);
            if (objB3 == coroutineSingletons) {
                return coroutineSingletons;
            }
            list7 = list5;
            list8 = list4;
        } else {
            if (i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list8 = (List) confirmSuperPassPurchaseViewModel$superPassTncSection$1.L$1;
            list7 = (List) confirmSuperPassPurchaseViewModel$superPassTncSection$1.L$0;
            ResultKt.b(objB3);
        }
        TextUIState.ChaloTextUIState chaloTextUIState = new TextUIState.ChaloTextUIState((String) objB3, UITextStyle.DisplaySmall, ChaloColorToken.Black_87.f9768a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
        if (list7.isEmpty()) {
            r4 = 0;
            styledTextUIState = null;
        } else {
            r4 = 0;
            styledTextUIState = new TextUIState.StyledTextUIState(list7, null, null, 30);
        }
        return new SuperPassTncSectionUIState(chaloTextUIState, styledTextUIState, new TextUIState.StyledTextUIState(list8, r4, r4, 30));
        String str6 = (String) objB;
        confirmSuperPassPurchaseViewModel$superPassTncSection$1.L$0 = list3;
        confirmSuperPassPurchaseViewModel$superPassTncSection$1.L$1 = arrayList;
        confirmSuperPassPurchaseViewModel$superPassTncSection$1.L$2 = list2;
        confirmSuperPassPurchaseViewModel$superPassTncSection$1.L$3 = str6;
        confirmSuperPassPurchaseViewModel$superPassTncSection$1.label = 2;
        objB2 = stringProvider.b(StringEnum.TNC_DETAILS_TEXT, new Object[i], confirmSuperPassPurchaseViewModel$superPassTncSection$1);
        if (objB2 != coroutineSingletons) {
            str = str6;
            list4 = arrayList;
            list5 = list3;
            list6 = list2;
            String str7 = (String) objB2;
            String strSubstring3 = str7.substring(i, str7.length() - str.length());
            Intrinsics.h(strSubstring3, "substring(...)");
            UITextStyle uITextStyle2 = UITextStyle.BodyMedium;
            List list14 = list6;
            list14.add(new StyledTextDataUIState(strSubstring3, black_70, null, uITextStyle2, null, null, null, 1012));
            String strSubstring4 = str7.substring(str7.length() - str.length());
            Intrinsics.h(strSubstring4, "substring(...)");
            list14.add(new StyledTextDataUIState(strSubstring4, ChaloColorToken.OrangePrimary.f9835a, null, uITextStyle2, null, null, new StyledTextClickHandler$Companion$create$1("TNC", "TNC", new ps(this, 4)), ServiceStarter.ERROR_UNKNOWN));
            confirmSuperPassPurchaseViewModel$superPassTncSection$1.L$0 = list5;
            confirmSuperPassPurchaseViewModel$superPassTncSection$1.L$1 = list4;
            Object obj4 = obj;
            confirmSuperPassPurchaseViewModel$superPassTncSection$1.L$2 = obj4;
            confirmSuperPassPurchaseViewModel$superPassTncSection$1.L$3 = obj4;
            confirmSuperPassPurchaseViewModel$superPassTncSection$1.label = 3;
            objB3 = stringProvider.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], confirmSuperPassPurchaseViewModel$superPassTncSection$1);
            if (objB3 == coroutineSingletons) {
                return coroutineSingletons;
            }
            list7 = list5;
            list8 = list4;
            TextUIState.ChaloTextUIState chaloTextUIState2 = new TextUIState.ChaloTextUIState((String) objB3, UITextStyle.DisplaySmall, ChaloColorToken.Black_87.f9768a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
            if (list7.isEmpty()) {
                r4 = 0;
                styledTextUIState = new TextUIState.StyledTextUIState(list7, null, null, 30);
            } else {
                r4 = 0;
                styledTextUIState = null;
            }
            return new SuperPassTncSectionUIState(chaloTextUIState2, styledTextUIState, new TextUIState.StyledTextUIState(list8, r4, r4, 30));
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object W(ContinuationImpl continuationImpl) {
        ConfirmSuperPassPurchaseViewModel$titleText$1 confirmSuperPassPurchaseViewModel$titleText$1;
        StringEnum stringEnum;
        if (continuationImpl instanceof ConfirmSuperPassPurchaseViewModel$titleText$1) {
            confirmSuperPassPurchaseViewModel$titleText$1 = (ConfirmSuperPassPurchaseViewModel$titleText$1) continuationImpl;
            int i = confirmSuperPassPurchaseViewModel$titleText$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                confirmSuperPassPurchaseViewModel$titleText$1.label = i - Integer.MIN_VALUE;
            } else {
                confirmSuperPassPurchaseViewModel$titleText$1 = new ConfirmSuperPassPurchaseViewModel$titleText$1(this, continuationImpl);
            }
        } else {
            confirmSuperPassPurchaseViewModel$titleText$1 = new ConfirmSuperPassPurchaseViewModel$titleText$1(this, continuationImpl);
        }
        Object objB = confirmSuperPassPurchaseViewModel$titleText$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = confirmSuperPassPurchaseViewModel$titleText$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            SuperPassPurchaseSharedState superPassPurchaseSharedState = (SuperPassPurchaseSharedState) this.l.getF().getValue();
            String str = superPassPurchaseSharedState.d;
            if (Intrinsics.d(str, "flowPaymentPostVerification")) {
                stringEnum = StringEnum.CONFIRMATION_FRAGMENT_TITLE_SUCCESSFUL_VERIFICATION_PAYMENT;
            } else if (Intrinsics.d(str, "flowRenewPass")) {
                stringEnum = StringEnum.CONFIRMATION_FRAGMENT_TITLE_NO_VERIFICATION_PAYMENT;
            } else {
                stringEnum = Intrinsics.d(SuperPassPurchaseSharedContractKt.a(superPassPurchaseSharedState), Boolean.TRUE) ? StringEnum.CONFIRMATION_FRAGMENT_TITLE_SUBMIT_PROOFS : StringEnum.CONFIRM_PASS_DETAILS;
            }
            confirmSuperPassPurchaseViewModel$titleText$1.label = 1;
            objB = this.m.b(stringEnum, new Object[0], confirmSuperPassPurchaseViewModel$titleText$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        return new TextUIState.ChaloTextUIState((String) objB, UITextStyle.DisplayMedium, ChaloColorToken.Black_87.f9768a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
    }

    public final ArrayList X(SuperPassPurchaseSharedState superPassPurchaseSharedState) {
        Map map;
        String str = superPassPurchaseSharedState.d;
        if (Intrinsics.d(str, "flowPaymentPostVerification") || Intrinsics.d(str, "flowRenewPass") || !Intrinsics.d(SuperPassPurchaseSharedContractKt.a(superPassPurchaseSharedState), Boolean.TRUE) || (map = superPassPurchaseSharedState.p) == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (((ProofUploadDetails) entry.getValue()).e) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Collection collectionValues = linkedHashMap.values();
        if (collectionValues == null) {
            return null;
        }
        Collection<ProofUploadDetails> collection = collectionValues;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(collection, 10));
        for (ProofUploadDetails proofUploadDetails : collection) {
            String str2 = proofUploadDetails.f8316a;
            BitmapImage bitmapImage = proofUploadDetails.b;
            UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A = UiEventHandler.Companion.a(new ti(24, this, proofUploadDetails));
            UIContentScale uIContentScale = UIContentScale.Crop;
            float f = ChaloThemeHelper.a().d;
            arrayList.add(new SuperProofImageUIState(str2, bitmapImage, uiEventHandler$Companion$fromLambda$1A, uIContentScale, new UIShape.Rectangle(f, f, f, f)));
        }
        return arrayList;
    }

    @Override // app.chalo.productpurchase.passpurchase.ui.decompose.SuperPassScreenBaseComponent
    public final Object m() {
        return new ConfirmSuperPassPurchaseDataState(false, false, null, null, null, false, null, null, null, null, null);
    }

    public final void u(LinkedHashMap linkedHashMap) {
        SuperPassConfirmationManager superPassConfirmationManager = this.l;
        BookableSuperPassConfiguration bookableSuperPassConfiguration = ((SuperPassPurchaseSharedState) superPassConfirmationManager.getF().getValue()).i;
        if (bookableSuperPassConfiguration == null) {
            return;
        }
        SuperPassProductConfigFareMappingResponseAppModel superPassProductConfigFareMappingResponseAppModel = bookableSuperPassConfiguration.c;
        SuperPassProductConfigurationProperties superPassProductConfigurationProperties = bookableSuperPassConfiguration.b;
        linkedHashMap.put("productId", superPassProductConfigurationProperties.f5600a);
        linkedHashMap.put("productType", superPassProductConfigurationProperties.i);
        linkedHashMap.put("productSubType", superPassProductConfigurationProperties.j);
        linkedHashMap.put("passengerType", bookableSuperPassConfiguration.d.f8639a);
        int i = AllProductConfigsResponseAppModelKt.i(superPassProductConfigFareMappingResponseAppModel);
        SuperPassProductFareInfoResponseAppModel superPassProductFareInfoResponseAppModel = superPassProductConfigFareMappingResponseAppModel.o;
        linkedHashMap.put("noOfDays", String.valueOf(i));
        linkedHashMap.put("passFare", Double.valueOf(superPassProductFareInfoResponseAppModel.b));
        linkedHashMap.put("payable fare", Double.valueOf(superPassProductFareInfoResponseAppModel.f8646a));
        Long l = ((SuperPassPurchaseSharedState) superPassConfirmationManager.getF().getValue()).j;
        if (l != null) {
            linkedHashMap.put("startDate", this.r.Q(l.longValue()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0093, code lost:
    
        if (r2 == r4) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a7, code lost:
    
        if (r2 == r4) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ba, code lost:
    
        if (r2 == r4) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedState r21, kotlin.coroutines.jvm.internal.ContinuationImpl r22) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassPurchaseViewModel.w(app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedState, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0da2  */
    /* JADX WARN: Code duplicated, block: B:102:0x0dd9  */
    /* JADX WARN: Code duplicated, block: B:105:0x0dec  */
    /* JADX WARN: Code duplicated, block: B:108:0x0e43  */
    /* JADX WARN: Code duplicated, block: B:110:0x0e8c  */
    /* JADX WARN: Code duplicated, block: B:112:0x0e9c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:119:0x0ed1  */
    /* JADX WARN: Code duplicated, block: B:121:0x0f89  */
    /* JADX WARN: Code duplicated, block: B:122:0x0f8c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0fc7  */
    /* JADX WARN: Code duplicated, block: B:127:0x0fe5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:134:0x1019  */
    /* JADX WARN: Code duplicated, block: B:136:0x1078  */
    /* JADX WARN: Code duplicated, block: B:137:0x107b  */
    /* JADX WARN: Code duplicated, block: B:141:0x1118  */
    /* JADX WARN: Code duplicated, block: B:144:0x1175  */
    /* JADX WARN: Code duplicated, block: B:146:0x1189  */
    /* JADX WARN: Code duplicated, block: B:155:0x11c3  */
    /* JADX WARN: Code duplicated, block: B:158:0x122b  */
    /* JADX WARN: Code duplicated, block: B:162:0x12c4  */
    /* JADX WARN: Code duplicated, block: B:164:0x1324  */
    /* JADX WARN: Code duplicated, block: B:166:0x133c  */
    /* JADX WARN: Code duplicated, block: B:175:0x137f  */
    /* JADX WARN: Code duplicated, block: B:176:0x13b6  */
    /* JADX WARN: Code duplicated, block: B:178:0x13c2  */
    /* JADX WARN: Code duplicated, block: B:188:0x143b  */
    /* JADX WARN: Code duplicated, block: B:191:0x146a  */
    /* JADX WARN: Code duplicated, block: B:192:0x1486  */
    /* JADX WARN: Code duplicated, block: B:194:0x148d  */
    /* JADX WARN: Code duplicated, block: B:196:0x1493  */
    /* JADX WARN: Code duplicated, block: B:200:0x14d0  */
    /* JADX WARN: Code duplicated, block: B:201:0x1507  */
    /* JADX WARN: Code duplicated, block: B:203:0x150c  */
    /* JADX WARN: Code duplicated, block: B:205:0x1512 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:215:0x1645  */
    /* JADX WARN: Code duplicated, block: B:219:0x1655  */
    /* JADX WARN: Code duplicated, block: B:229:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0946  */
    /* JADX WARN: Code duplicated, block: B:50:0x098e  */
    /* JADX WARN: Code duplicated, block: B:54:0x09ce  */
    /* JADX WARN: Code duplicated, block: B:57:0x0a04  */
    /* JADX WARN: Code duplicated, block: B:60:0x0a34  */
    /* JADX WARN: Code duplicated, block: B:63:0x0a3d  */
    /* JADX WARN: Code duplicated, block: B:66:0x0a6b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0aa4  */
    /* JADX WARN: Code duplicated, block: B:73:0x0b0b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0b49  */
    /* JADX WARN: Code duplicated, block: B:76:0x0b4c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0b94  */
    /* JADX WARN: Code duplicated, block: B:80:0x0ba9  */
    /* JADX WARN: Code duplicated, block: B:82:0x0c14  */
    /* JADX WARN: Code duplicated, block: B:83:0x0c17  */
    /* JADX WARN: Code duplicated, block: B:86:0x0c7f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:90:0x0cd8  */
    /* JADX WARN: Code duplicated, block: B:94:0x0d29  */
    /* JADX WARN: Code duplicated, block: B:98:0x0d81  */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    @Override // app.chalo.productpurchase.passpurchase.ui.decompose.SuperPassScreenBaseComponent
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object a(app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedState r68, app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassPurchaseDataState r69, kotlin.coroutines.jvm.internal.ContinuationImpl r70) {
        /*
            Method dump skipped, instruction units count: 5768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassPurchaseViewModel.a(app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedState, app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassPurchaseDataState, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:37:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:43:0x0126  */
    /* JADX WARN: Code duplicated, block: B:46:0x013c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0140  */
    /* JADX WARN: Code duplicated, block: B:50:0x0153 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x0154 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x0155  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object z(SuperPassOrderType superPassOrderType, BookableSuperPassConfiguration bookableSuperPassConfiguration, SuperPassPurchaseSharedState superPassPurchaseSharedState, ContinuationImpl continuationImpl) {
        ConfirmSuperPassPurchaseViewModel$createSuperPassOrder$1 confirmSuperPassPurchaseViewModel$createSuperPassOrder$1;
        SuperPassUserDetails superPassUserDetails;
        Object objC;
        SuperPassOrderType superPassOrderType2;
        CreateSuperPassOrderUseCase createSuperPassOrderUseCase;
        BookableSuperPassConfiguration bookableSuperPassConfiguration2;
        long jLongValue;
        SuperPassOrderType superPassOrderType3;
        BookableSuperPassConfiguration bookableSuperPassConfiguration3;
        List list;
        Object objB;
        BookableSuperPassConfiguration bookableSuperPassConfiguration4;
        SuperPassPurchaseSharedState superPassPurchaseSharedState2;
        ChaloUseCaseResult chaloUseCaseResult;
        MutableStateFlow mutableStateFlow;
        Object value;
        ConfirmSuperPassPurchaseDataState it;
        SuperPassOrderCreationError superPassOrderCreationError;
        CreateOrderResponseAppModel createOrderResponseAppModel;
        BookableSuperPassConfiguration bookableSuperPassConfiguration5 = bookableSuperPassConfiguration;
        SuperPassPurchaseSharedState superPassPurchaseSharedState3 = superPassPurchaseSharedState;
        if (continuationImpl instanceof ConfirmSuperPassPurchaseViewModel$createSuperPassOrder$1) {
            confirmSuperPassPurchaseViewModel$createSuperPassOrder$1 = (ConfirmSuperPassPurchaseViewModel$createSuperPassOrder$1) continuationImpl;
            int i = confirmSuperPassPurchaseViewModel$createSuperPassOrder$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                confirmSuperPassPurchaseViewModel$createSuperPassOrder$1.label = i - Integer.MIN_VALUE;
            } else {
                confirmSuperPassPurchaseViewModel$createSuperPassOrder$1 = new ConfirmSuperPassPurchaseViewModel$createSuperPassOrder$1(this, continuationImpl);
            }
        } else {
            confirmSuperPassPurchaseViewModel$createSuperPassOrder$1 = new ConfirmSuperPassPurchaseViewModel$createSuperPassOrder$1(this, continuationImpl);
        }
        ConfirmSuperPassPurchaseViewModel$createSuperPassOrder$1 confirmSuperPassPurchaseViewModel$createSuperPassOrder$2 = confirmSuperPassPurchaseViewModel$createSuperPassOrder$1;
        Object obj = confirmSuperPassPurchaseViewModel$createSuperPassOrder$2.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = confirmSuperPassPurchaseViewModel$createSuperPassOrder$2.label;
        Unit unit = Unit.f17538a;
        if (i2 != 0) {
            if (i2 == 1) {
                bookableSuperPassConfiguration5 = (BookableSuperPassConfiguration) confirmSuperPassPurchaseViewModel$createSuperPassOrder$2.L$5;
                SuperPassUserDetails superPassUserDetails2 = (SuperPassUserDetails) confirmSuperPassPurchaseViewModel$createSuperPassOrder$2.L$4;
                createSuperPassOrderUseCase = (CreateSuperPassOrderUseCase) confirmSuperPassPurchaseViewModel$createSuperPassOrder$2.L$3;
                SuperPassPurchaseSharedState superPassPurchaseSharedState4 = (SuperPassPurchaseSharedState) confirmSuperPassPurchaseViewModel$createSuperPassOrder$2.L$2;
                bookableSuperPassConfiguration2 = (BookableSuperPassConfiguration) confirmSuperPassPurchaseViewModel$createSuperPassOrder$2.L$1;
                superPassOrderType2 = (SuperPassOrderType) confirmSuperPassPurchaseViewModel$createSuperPassOrder$2.L$0;
                ResultKt.b(obj);
                superPassUserDetails = superPassUserDetails2;
                superPassPurchaseSharedState3 = superPassPurchaseSharedState4;
                objC = obj;
            } else {
                if (i2 != 2) {
                    if (i2 == 3) {
                        ResultKt.b(obj);
                        return unit;
                    }
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    return unit;
                }
                superPassPurchaseSharedState2 = (SuperPassPurchaseSharedState) confirmSuperPassPurchaseViewModel$createSuperPassOrder$2.L$1;
                bookableSuperPassConfiguration4 = (BookableSuperPassConfiguration) confirmSuperPassPurchaseViewModel$createSuperPassOrder$2.L$0;
                ResultKt.b(obj);
                objB = obj;
            }
            chaloUseCaseResult = (ChaloUseCaseResult) objB;
            do {
                mutableStateFlow = this.e;
                value = mutableStateFlow.getValue();
                it = (ConfirmSuperPassPurchaseDataState) value;
                Intrinsics.i(it, "it");
            } while (!mutableStateFlow.c(value, ConfirmSuperPassPurchaseDataState.a(it, false, false, null, null, null, null, null, null, null, null, 2043)));
            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                createOrderResponseAppModel = (CreateOrderResponseAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                this.K = createOrderResponseAppModel;
                confirmSuperPassPurchaseViewModel$createSuperPassOrder$2.L$0 = r10;
                confirmSuperPassPurchaseViewModel$createSuperPassOrder$2.L$1 = 0;
                confirmSuperPassPurchaseViewModel$createSuperPassOrder$2.label = 3;
                if (M(bookableSuperPassConfiguration4, createOrderResponseAppModel, confirmSuperPassPurchaseViewModel$createSuperPassOrder$2) == obj2) {
                    return obj2;
                }
                return unit;
            }
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            superPassOrderCreationError = (SuperPassOrderCreationError) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
            confirmSuperPassPurchaseViewModel$createSuperPassOrder$2.L$0 = r10;
            confirmSuperPassPurchaseViewModel$createSuperPassOrder$2.L$1 = r10;
            confirmSuperPassPurchaseViewModel$createSuperPassOrder$2.label = 4;
            if (L(bookableSuperPassConfiguration4, superPassOrderCreationError, superPassPurchaseSharedState2, confirmSuperPassPurchaseViewModel$createSuperPassOrder$2) == obj2) {
                return obj2;
            }
            return unit;
        }
        ResultKt.b(obj);
        this.K = null;
        superPassUserDetails = superPassPurchaseSharedState3.h;
        Long l = superPassPurchaseSharedState3.j;
        CreateSuperPassOrderUseCase createSuperPassOrderUseCase2 = this.s;
        if (l != null) {
            long jLongValue2 = l.longValue();
            createSuperPassOrderUseCase = createSuperPassOrderUseCase2;
            jLongValue = jLongValue2;
            superPassOrderType3 = superPassOrderType;
            bookableSuperPassConfiguration3 = bookableSuperPassConfiguration5;
            String str = superPassPurchaseSharedState3.g;
            long j = jLongValue;
            HashMap mapG = G(superPassPurchaseSharedState3);
            SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo = superPassPurchaseSharedState3.m;
            list = bookableSuperPassConfiguration5.c.u;
            if (list == null) {
                list = EmptyList.f17557a;
            }
            confirmSuperPassPurchaseViewModel$createSuperPassOrder$2.L$0 = bookableSuperPassConfiguration5;
            confirmSuperPassPurchaseViewModel$createSuperPassOrder$2.L$1 = superPassPurchaseSharedState3;
            confirmSuperPassPurchaseViewModel$createSuperPassOrder$2.L$2 = null;
            confirmSuperPassPurchaseViewModel$createSuperPassOrder$2.L$3 = null;
            confirmSuperPassPurchaseViewModel$createSuperPassOrder$2.L$4 = null;
            confirmSuperPassPurchaseViewModel$createSuperPassOrder$2.L$5 = null;
            confirmSuperPassPurchaseViewModel$createSuperPassOrder$2.label = 2;
            objB = createSuperPassOrderUseCase.b(superPassUserDetails, bookableSuperPassConfiguration3, j, str, mapG, superPassPurchaseStopsInfo, superPassOrderType3, list, confirmSuperPassPurchaseViewModel$createSuperPassOrder$2);
            if (objB != obj2) {
                SuperPassPurchaseSharedState superPassPurchaseSharedState5 = superPassPurchaseSharedState3;
                bookableSuperPassConfiguration4 = bookableSuperPassConfiguration5;
                superPassPurchaseSharedState2 = superPassPurchaseSharedState5;
                chaloUseCaseResult = (ChaloUseCaseResult) objB;
                do {
                    mutableStateFlow = this.e;
                    value = mutableStateFlow.getValue();
                    it = (ConfirmSuperPassPurchaseDataState) value;
                    Intrinsics.i(it, "it");
                } while (!mutableStateFlow.c(value, ConfirmSuperPassPurchaseDataState.a(it, false, false, null, null, null, null, null, null, null, null, 2043)));
                if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                    createOrderResponseAppModel = (CreateOrderResponseAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                    this.K = createOrderResponseAppModel;
                    confirmSuperPassPurchaseViewModel$createSuperPassOrder$2.L$0 = r10;
                    confirmSuperPassPurchaseViewModel$createSuperPassOrder$2.L$1 = 0;
                    confirmSuperPassPurchaseViewModel$createSuperPassOrder$2.label = 3;
                    if (M(bookableSuperPassConfiguration4, createOrderResponseAppModel, confirmSuperPassPurchaseViewModel$createSuperPassOrder$2) == obj2) {
                        return unit;
                    }
                } else {
                    if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    superPassOrderCreationError = (SuperPassOrderCreationError) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
                    confirmSuperPassPurchaseViewModel$createSuperPassOrder$2.L$0 = r10;
                    confirmSuperPassPurchaseViewModel$createSuperPassOrder$2.L$1 = r10;
                    confirmSuperPassPurchaseViewModel$createSuperPassOrder$2.label = 4;
                    if (L(bookableSuperPassConfiguration4, superPassOrderCreationError, superPassPurchaseSharedState2, confirmSuperPassPurchaseViewModel$createSuperPassOrder$2) == obj2) {
                        return unit;
                    }
                }
            }
        } else {
            confirmSuperPassPurchaseViewModel$createSuperPassOrder$2.L$0 = superPassOrderType;
            confirmSuperPassPurchaseViewModel$createSuperPassOrder$2.L$1 = bookableSuperPassConfiguration5;
            confirmSuperPassPurchaseViewModel$createSuperPassOrder$2.L$2 = superPassPurchaseSharedState3;
            confirmSuperPassPurchaseViewModel$createSuperPassOrder$2.L$3 = createSuperPassOrderUseCase2;
            confirmSuperPassPurchaseViewModel$createSuperPassOrder$2.L$4 = superPassUserDetails;
            confirmSuperPassPurchaseViewModel$createSuperPassOrder$2.L$5 = bookableSuperPassConfiguration5;
            confirmSuperPassPurchaseViewModel$createSuperPassOrder$2.label = 1;
            objC = this.o.c(confirmSuperPassPurchaseViewModel$createSuperPassOrder$2);
            if (objC != obj2) {
                superPassOrderType2 = superPassOrderType;
                createSuperPassOrderUseCase = createSuperPassOrderUseCase2;
                bookableSuperPassConfiguration2 = bookableSuperPassConfiguration5;
            }
        }
        return obj2;
        bookableSuperPassConfiguration3 = bookableSuperPassConfiguration5;
        bookableSuperPassConfiguration5 = bookableSuperPassConfiguration2;
        superPassOrderType3 = superPassOrderType2;
        jLongValue = ((Number) objC).longValue();
        String str2 = superPassPurchaseSharedState3.g;
        long j2 = jLongValue;
        HashMap mapG2 = G(superPassPurchaseSharedState3);
        SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo2 = superPassPurchaseSharedState3.m;
        list = bookableSuperPassConfiguration5.c.u;
        if (list == null) {
            list = EmptyList.f17557a;
        }
        confirmSuperPassPurchaseViewModel$createSuperPassOrder$2.L$0 = bookableSuperPassConfiguration5;
        confirmSuperPassPurchaseViewModel$createSuperPassOrder$2.L$1 = superPassPurchaseSharedState3;
        confirmSuperPassPurchaseViewModel$createSuperPassOrder$2.L$2 = null;
        confirmSuperPassPurchaseViewModel$createSuperPassOrder$2.L$3 = null;
        confirmSuperPassPurchaseViewModel$createSuperPassOrder$2.L$4 = null;
        confirmSuperPassPurchaseViewModel$createSuperPassOrder$2.L$5 = null;
        confirmSuperPassPurchaseViewModel$createSuperPassOrder$2.label = 2;
        objB = createSuperPassOrderUseCase.b(superPassUserDetails, bookableSuperPassConfiguration3, j2, str2, mapG2, superPassPurchaseStopsInfo2, superPassOrderType3, list, confirmSuperPassPurchaseViewModel$createSuperPassOrder$2);
        if (objB != obj2) {
            SuperPassPurchaseSharedState superPassPurchaseSharedState6 = superPassPurchaseSharedState3;
            bookableSuperPassConfiguration4 = bookableSuperPassConfiguration5;
            superPassPurchaseSharedState2 = superPassPurchaseSharedState6;
            chaloUseCaseResult = (ChaloUseCaseResult) objB;
            do {
                mutableStateFlow = this.e;
                value = mutableStateFlow.getValue();
                it = (ConfirmSuperPassPurchaseDataState) value;
                Intrinsics.i(it, "it");
            } while (!mutableStateFlow.c(value, ConfirmSuperPassPurchaseDataState.a(it, false, false, null, null, null, null, null, null, null, null, 2043)));
            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                createOrderResponseAppModel = (CreateOrderResponseAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                this.K = createOrderResponseAppModel;
                confirmSuperPassPurchaseViewModel$createSuperPassOrder$2.L$0 = r10;
                confirmSuperPassPurchaseViewModel$createSuperPassOrder$2.L$1 = 0;
                confirmSuperPassPurchaseViewModel$createSuperPassOrder$2.label = 3;
                if (M(bookableSuperPassConfiguration4, createOrderResponseAppModel, confirmSuperPassPurchaseViewModel$createSuperPassOrder$2) == obj2) {
                    return unit;
                }
            } else {
                if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                    throw new NoWhenBranchMatchedException();
                }
                superPassOrderCreationError = (SuperPassOrderCreationError) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
                confirmSuperPassPurchaseViewModel$createSuperPassOrder$2.L$0 = r10;
                confirmSuperPassPurchaseViewModel$createSuperPassOrder$2.L$1 = r10;
                confirmSuperPassPurchaseViewModel$createSuperPassOrder$2.label = 4;
                if (L(bookableSuperPassConfiguration4, superPassOrderCreationError, superPassPurchaseSharedState2, confirmSuperPassPurchaseViewModel$createSuperPassOrder$2) == obj2) {
                    return unit;
                }
            }
        }
        return obj2;
    }
}
