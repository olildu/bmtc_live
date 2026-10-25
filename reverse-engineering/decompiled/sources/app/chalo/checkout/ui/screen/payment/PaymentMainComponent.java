package app.chalo.checkout.ui.screen.payment;

import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.extractor.ts.TsExtractor;
import app.chalo.ads.AdTargetingProvider;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.behaviour.policy.ResolveSupportPolicyUseCase;
import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.checkout.analytics.ICheckoutAnalyticsHelper;
import app.chalo.checkout.data.model.api.response.OrderStatus;
import app.chalo.checkout.data.model.api.response.PaymentStatus;
import app.chalo.checkout.data.model.app.ChaloPayPaymentResponseAppModel;
import app.chalo.checkout.data.model.app.CheckoutPaymentMethod;
import app.chalo.checkout.data.model.app.InaiInstalledUpiAppDetailApiModel;
import app.chalo.checkout.data.model.app.InstalledUpiApps;
import app.chalo.checkout.data.model.app.InstalledUpiDetailApiModel;
import app.chalo.checkout.data.model.app.InstalledUpiDetailAppModel;
import app.chalo.checkout.data.model.app.PaymentDisplayDetailsAppModel;
import app.chalo.checkout.data.model.app.PaymentInstrumentAppModel;
import app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel;
import app.chalo.checkout.data.model.app.PaymentMethodSelectionAction;
import app.chalo.checkout.data.model.app.PaymentMethodsAppModelKt;
import app.chalo.checkout.data.model.app.SelectedPaymentInstrumentData;
import app.chalo.checkout.data.model.ui.CheckoutPaymentItem;
import app.chalo.checkout.data.model.ui.CheckoutPaymentItemKt;
import app.chalo.checkout.data.model.ui.PaymentUiItem;
import app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver;
import app.chalo.checkout.data.resolver.CustomUrlPaymentStatus;
import app.chalo.checkout.data.resolver.PaymentInfoState;
import app.chalo.checkout.data.resolver.product.ICheckoutProductDataResolver;
import app.chalo.checkout.domain.ChaloPaymentFailureReason;
import app.chalo.checkout.domain.ChaloPaymentOrderCreationFailureReason;
import app.chalo.checkout.domain.CheckoutErrorType;
import app.chalo.checkout.domain.ConvertInaiUpiAppDetailToIndividualCheckoutItemUseCase;
import app.chalo.checkout.domain.CreateOrderForChaloPaymentUseCase;
import app.chalo.checkout.domain.FilterValidPaymentMethodsUseCase;
import app.chalo.checkout.domain.GetOrderStatusUseCase;
import app.chalo.checkout.domain.GetPaymentMethodsUseCase;
import app.chalo.checkout.domain.GetPaymentStatusUseCase;
import app.chalo.checkout.domain.MakeChaloWalletPaymentUseCase;
import app.chalo.checkout.domain.checkoutitem.ChaloPayCheckoutItemHelper;
import app.chalo.checkout.domain.checkoutitem.CommonCheckoutItemUseCase;
import app.chalo.checkout.domain.checkoutitem.GetChaloPayCheckoutItemUseCase;
import app.chalo.checkout.domain.checkoutitem.GetPreferredMethodsCheckoutItemHelper;
import app.chalo.checkout.domain.checkoutitem.PaymentMethodsCheckoutItemsUseCase;
import app.chalo.checkout.juspay.JusPaySdkHelper;
import app.chalo.checkout.paymentprovider.inai.InaiSdkExecuteDelegate;
import app.chalo.checkout.paymentprovider.inai.InaiSdkExecuteResult;
import app.chalo.checkout.paymentprovider.inai.InaiSdkExecuteStatus;
import app.chalo.checkout.ui.screen.upi.NoUpiAppsErrorUiSpecs;
import app.chalo.checkout.ui.screen.upi.NoUpiAppsErrorUiState;
import app.chalo.checkout.utility.InstalledUpiAppsHelperProvider;
import app.chalo.checkout.utility.UpiAppResult;
import app.chalo.checkout.utility.UpiIntentData;
import app.chalo.compose.components.CircularProgressIndicatorUIState;
import app.chalo.compose.components.CircularProgressIndicatorUIStateFactory;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.features.checkout.CheckoutIntentModel;
import app.chalo.features.checkout.CheckoutOrderData;
import app.chalo.features.checkout.CheckoutPaymentData;
import app.chalo.features.checkout.CheckoutPaymentProviderVpaConfig;
import app.chalo.features.checkout.CheckoutProductData;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.helper.UrlOpenHelper;
import app.chalo.juspay.JusPayManagementStatus;
import app.chalo.juspay.JusPayResultDataType;
import app.chalo.juspay.JusPayTransactionStatus;
import app.chalo.juspay.JusPayUpiSessionStatus;
import app.chalo.juspay.JuspayController;
import app.chalo.juspay.JuspayControllerProvider;
import app.chalo.juspay.JuspayState;
import app.chalo.juspay.JuspayUpiSessionState;
import app.chalo.location.AppPermissionRequest;
import app.chalo.metro.domain.UpdateMetroBookingUseCase;
import app.chalo.models.CheckoutPaymentProvider;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.mvibase.simple.DataFetchOperationErrorReason;
import app.chalo.mvibase.simple.OperationFailureError;
import app.chalo.mvibase.simple.UseCaseOperationError;
import app.chalo.network.config.ChaloJson;
import app.chalo.permissions.handler.PermissionHandlerProvider;
import app.chalo.permissions.models.AppPermission;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.lottieassetprovider.LottieType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastData;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.resultstatemanager.checkout.CheckoutResultState;
import app.chalo.resultstatemanager.checkout.CheckoutResultStateManager;
import app.chalo.resultstatemanager.wallet.loadmoney.WalletLoadMoneyResultStateManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.CheckoutPaymentMainArgs;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiAlignment;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.bottomsheet.BottomSheetContentUiSpecs;
import app.chalo.uistate.bottomsheet.BottomSheetEventHandler;
import app.chalo.uistate.bottomsheet.BottomSheetRequestHandler;
import app.chalo.uistate.bottomsheet.BottomSheetStandardContentUiState;
import app.chalo.uistate.bottomsheet.BottomSheetUiSpec;
import app.chalo.uistate.bottomsheet.BottomSheetUiState;
import app.chalo.uistate.bottomsheet.DrawType;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.button.ButtonUIStateFactory;
import app.chalo.uistate.dialog.ConfirmationDialogActionCtaContainerUiState;
import app.chalo.uistate.dialog.ConfirmationDialogUiState;
import app.chalo.uistate.dialog.DialogUIStateFactory;
import app.chalo.uistate.dialog.DialogueCtaUiState;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.error.StandardErrorScreenUIState;
import app.chalo.uistate.image.GifImageUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.snackbar.SnackbarUIState;
import app.chalo.uistate.snackbar.SnackbarUIStateFactory;
import app.chalo.uistate.text.StyledTextDataUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.TextWithSpecialFeatureDataUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.uistate.toolbar.ToolbarUIState;
import app.chalo.uistate.toolbar.ToolbarUiSpecs;
import app.chalo.usecase.ArePermissionsGrantedUseCase;
import app.chalo.usecase.IsNotificationPermissionGrantedUseCase;
import app.chalo.userprofile.UserProfileAppModel;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.utils.KUUID;
import app.chalo.utils.SystemHelper;
import app.chalo.walletframework.chalopay.ChaloPayManager;
import app.chalo.walletframework.chalopay.ChaloPayWalletState;
import app.chalo.walletframework.chalopay.WalletCTA;
import app.chalo.walletframework.chalopay.WalletStatusForUI;
import app.chalo.walletframework.wallet.data.model.WalletType;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import app.chalo.walletframework.wallet.data.repository.WalletRepository;
import app.chalo.walletframework.wallet.domain.resolver.WalletResolver;
import com.arkivanov.decompose.ComponentContext;
import com.arkivanov.essenty.statekeeper.StateKeeper;
import defpackage.do0;
import defpackage.fo;
import defpackage.iq0;
import defpackage.jq0;
import defpackage.kq0;
import defpackage.o3;
import defpackage.r9;
import defpackage.uf0;
import defpackage.va;
import defpackage.vo1;
import defpackage.ym0;
import defpackage.zf0;
import in.juspay.hypersdk.analytics.LogConstants;
import in.juspay.hypersdk.core.PaymentConstants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentMainComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewIntent;", "Lapp/chalo/checkout/ui/screen/payment/PaymentDataState;", "Lapp/chalo/checkout/ui/screen/payment/PaymentViewState;", "Lapp/chalo/checkout/ui/screen/payment/PaymentSideEffect;", "Companion", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PaymentMainComponent extends ChaloBaseStateMviComponent<PaymentViewIntent, PaymentDataState, PaymentViewState, PaymentSideEffect> {
    public final StringProvider A;
    public final CreateOrderForChaloPaymentUseCase B;
    public final MakeChaloWalletPaymentUseCase C;
    public final WalletRepository D;
    public final CoroutineContextProvider E;
    public final InstalledUpiAppsHelperProvider F;
    public final ChaloConfigFeature G;
    public final ChaloNavigationManager H;
    public final CheckoutResultStateManager I;
    public final WalletLoadMoneyResultStateManager J;
    public final GetChaloPayCheckoutItemUseCase K;
    public final IsNotificationPermissionGrantedUseCase L;
    public final UpdateMetroBookingUseCase M;
    public final PermissionHandlerProvider N;
    public final JusPaySdkHelper O;
    public final ArePermissionsGrantedUseCase P;
    public final ChaloBuildConfig Q;
    public final JuspayControllerProvider R;
    public final KotlinToastManager S;
    public final SystemHelper T;
    public final AdTargetingProvider U;
    public final UrlOpenHelper V;
    public final AnalyticsContract W;
    public final WalletResolver X;
    public final ResolveSupportPolicyUseCase Y;
    public JuspayController Z;
    public PaymentInfoState a0;
    public boolean b0;
    public Job c0;
    public Job d0;
    public Job e0;
    public Boolean f0;
    public long g0;
    public Job h0;
    public Job i0;
    public final Lazy j0;
    public final CheckoutPaymentMainArgs k;
    public final PaymentMainComponent$inaiSdkExecuteDelegate$1 k0;
    public final ICheckoutProductDataResolver l;
    public final CheckoutPaymentDataResolver m;
    public final GetPaymentMethodsUseCase n;
    public final PaymentMethodsCheckoutItemsUseCase o;
    public final FilterValidPaymentMethodsUseCase p;
    public final GetOrderStatusUseCase q;
    public final GetPaymentStatusUseCase r;
    public final ConvertInaiUpiAppDetailToIndividualCheckoutItemUseCase s;
    public final ICheckoutAnalyticsHelper t;
    public final CurrencyFeature u;
    public final CityProvider v;
    public final CommonCheckoutItemUseCase w;
    public final ChaloPayManager x;
    public final ChaloConfigFeature y;
    public final UserProfileDetailsProvider z;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\n¨\u0006\u0012"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentMainComponent$Companion;", "", "", "PAYMENT_STATUS_CALL_MAX_DELAY", "J", "", "PAYMENT_STATUS_RETRY_DELAY_MULTIPLIER", "I", "", "GET_INSTALLED_APPS", "Ljava/lang/String;", "PAYMENT_MODE_CASH", "PAYMENT_MODE_ONLINE", "MINIMUM_UPI_APPS_ON_MAIN_SCREEN", "CHECKOUT_STATE_KEEPER_KEY", "UPI_LINKING_FALLBACK_SESSION_UNAVAILABLE", "UPI_LINKING_FALLBACK_OPERATION_FAILURE", "UPI_LINKING_FALLBACK_SDK_ERROR", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1531a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;
        public static final /* synthetic */ int[] d;
        public static final /* synthetic */ int[] e;
        public static final /* synthetic */ int[] f;
        public static final /* synthetic */ int[] g;
        public static final /* synthetic */ int[] h;
        public static final /* synthetic */ int[] i;
        public static final /* synthetic */ int[] j;
        public static final /* synthetic */ int[] k;
        public static final /* synthetic */ int[] l;
        public static final /* synthetic */ int[] m;

        static {
            int[] iArr = new int[JusPayManagementStatus.values().length];
            try {
                iArr[JusPayManagementStatus.Success.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JusPayManagementStatus.Pending.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JusPayManagementStatus.Failure.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[JusPayManagementStatus.Unknown.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[JusPayManagementStatus.Exit.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f1531a = iArr;
            int[] iArr2 = new int[JusPayTransactionStatus.values().length];
            try {
                iArr2[JusPayTransactionStatus.Success.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[JusPayTransactionStatus.Pending.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[JusPayTransactionStatus.Failure.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[JusPayTransactionStatus.Unknown.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[JusPayTransactionStatus.BackPress.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            b = iArr2;
            int[] iArr3 = new int[JusPayUpiSessionStatus.values().length];
            try {
                iArr3[JusPayUpiSessionStatus.NoPermission.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[JusPayUpiSessionStatus.Fresh.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[JusPayUpiSessionStatus.Bound.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[JusPayUpiSessionStatus.Linked.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            c = iArr3;
            int[] iArr4 = new int[CustomUrlPaymentStatus.values().length];
            try {
                iArr4[CustomUrlPaymentStatus.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[CustomUrlPaymentStatus.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[CustomUrlPaymentStatus.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[CustomUrlPaymentStatus.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            d = iArr4;
            int[] iArr5 = new int[CheckoutPaymentProvider.values().length];
            try {
                iArr5[CheckoutPaymentProvider.RAZORPAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr5[CheckoutPaymentProvider.INAI.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr5[CheckoutPaymentProvider.PHONEPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr5[CheckoutPaymentProvider.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr5[CheckoutPaymentProvider.CHALOPAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr5[CheckoutPaymentProvider.CLDW.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr5[CheckoutPaymentProvider.YES_BANK.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr5[CheckoutPaymentProvider.CUSTOM_URL.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr5[CheckoutPaymentProvider.NO_PAYMENT.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
            e = iArr5;
            int[] iArr6 = new int[PaymentStatusCTAActionType.values().length];
            try {
                iArr6[PaymentStatusCTAActionType.NAVIGATE_TO_HOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr6[PaymentStatusCTAActionType.EXIT_CHECKOUT_ACTIVITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr6[PaymentStatusCTAActionType.STAY_ON_PAYMENT_SCREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr6[PaymentStatusCTAActionType.FETCH_CHALO_WALLET.ordinal()] = 4;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr6[PaymentStatusCTAActionType.NAVIGATE_TO_MY_TICKETS_AND_PASSES.ordinal()] = 5;
            } catch (NoSuchFieldError unused32) {
            }
            f = iArr6;
            int[] iArr7 = new int[OrderStatus.values().length];
            try {
                iArr7[OrderStatus.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr7[OrderStatus.PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr7[OrderStatus.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr7[OrderStatus.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused36) {
            }
            g = iArr7;
            int[] iArr8 = new int[PaymentMethodSelectionAction.values().length];
            try {
                iArr8[PaymentMethodSelectionAction.INITIATE_PAYMENT_VIA_PAYMENT_PROVIDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr8[PaymentMethodSelectionAction.NAVIGATE_FOR_ADDITIONAL_DETAILS.ordinal()] = 2;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr8[PaymentMethodSelectionAction.HANDLE_CASH_PAYMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused39) {
            }
            h = iArr8;
            int[] iArr9 = new int[WalletCTA.values().length];
            try {
                iArr9[WalletCTA.RECHARGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr9[WalletCTA.CONTACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr9[WalletCTA.ACTIVATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr9[WalletCTA.RECLAIM.ordinal()] = 4;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr9[WalletCTA.CONFIRM_PAYMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused44) {
            }
            i = iArr9;
            int[] iArr10 = new int[ChaloPaymentOrderCreationFailureReason.values().length];
            try {
                iArr10[ChaloPaymentOrderCreationFailureReason.UNKNOWN_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr10[ChaloPaymentOrderCreationFailureReason.INTERNAL_SERVER_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr10[ChaloPaymentOrderCreationFailureReason.CACHED_WALLET_FETCH_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr10[ChaloPaymentOrderCreationFailureReason.UNAUTHORIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr10[ChaloPaymentOrderCreationFailureReason.ORDER_NOT_FOUND.ordinal()] = 5;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr10[ChaloPaymentOrderCreationFailureReason.ORDER_EXPIRED.ordinal()] = 6;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr10[ChaloPaymentOrderCreationFailureReason.WALLET_NOT_FOUND_ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr10[ChaloPaymentOrderCreationFailureReason.INSUFFICIENT_WALLET_BALANCE.ordinal()] = 8;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr10[ChaloPaymentOrderCreationFailureReason.WALLET_RECLAIM_ERROR.ordinal()] = 9;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr10[ChaloPaymentOrderCreationFailureReason.WALLET_INACTIVE_ERROR.ordinal()] = 10;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr10[ChaloPaymentOrderCreationFailureReason.WALLET_BLOCKED_ERROR.ordinal()] = 11;
            } catch (NoSuchFieldError unused55) {
            }
            j = iArr10;
            int[] iArr11 = new int[DataFetchOperationErrorReason.values().length];
            try {
                iArr11[DataFetchOperationErrorReason.NO_INTERNET_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr11[DataFetchOperationErrorReason.SERVER_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr11[DataFetchOperationErrorReason.REQUEST_CANCELLATION_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr11[DataFetchOperationErrorReason.API_CALL_AUTHORISATION_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr11[DataFetchOperationErrorReason.UNEXPECTED_EXCEPTION_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr11[DataFetchOperationErrorReason.UNKNOWN_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr11[DataFetchOperationErrorReason.SUCCESS_RESPONSE_PARSING_ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr11[DataFetchOperationErrorReason.NO_UPDATE_IN_DATA_BASED_ON_ETAG.ordinal()] = 8;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr11[DataFetchOperationErrorReason.ERROR_RESPONSE_PARSING_ERROR.ordinal()] = 9;
            } catch (NoSuchFieldError unused64) {
            }
            k = iArr11;
            int[] iArr12 = new int[ChaloPaymentFailureReason.values().length];
            try {
                iArr12[ChaloPaymentFailureReason.UNKNOWN_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr12[ChaloPaymentFailureReason.INTERNAL_SERVER_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr12[ChaloPaymentFailureReason.CACHED_WALLET_FETCH_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr12[ChaloPaymentFailureReason.UNAUTHORIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr12[ChaloPaymentFailureReason.ORDER_NOT_FOUND.ordinal()] = 5;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr12[ChaloPaymentFailureReason.WALLET_NOT_FOUND_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr12[ChaloPaymentFailureReason.INSUFFICIENT_BALANCE_ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr12[ChaloPaymentFailureReason.RECLAIM_ERROR.ordinal()] = 8;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr12[ChaloPaymentFailureReason.WALLET_INACTIVE_ERROR.ordinal()] = 9;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr12[ChaloPaymentFailureReason.WALLET_BLOCKED_ERROR.ordinal()] = 10;
            } catch (NoSuchFieldError unused74) {
            }
            l = iArr12;
            int[] iArr13 = new int[WalletStatusForUI.values().length];
            try {
                iArr13[WalletStatusForUI.API_FETCH_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                iArr13[WalletStatusForUI.INSUFFICIENT_BALANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                iArr13[WalletStatusForUI.ACTIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                iArr13[WalletStatusForUI.INTERNET_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                iArr13[WalletStatusForUI.WALLET_BLOCKED_BACKEND_RECLAIM.ordinal()] = 5;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                iArr13[WalletStatusForUI.WALLET_BLOCKED_APP_RECLAIM.ordinal()] = 6;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                iArr13[WalletStatusForUI.WALLET_BLOCKED.ordinal()] = 7;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                iArr13[WalletStatusForUI.FULL_KYC_NEEDED.ordinal()] = 8;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                iArr13[WalletStatusForUI.WALLET_NOT_ACTIVE.ordinal()] = 9;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                iArr13[WalletStatusForUI.NOT_LOGGED_IN.ordinal()] = 10;
            } catch (NoSuchFieldError unused84) {
            }
            m = iArr13;
        }
    }

    /* JADX WARN: Type inference failed for: r9v22, types: [app.chalo.checkout.ui.screen.payment.PaymentMainComponent$inaiSdkExecuteDelegate$1] */
    public PaymentMainComponent(ComponentContext componentContext, CheckoutPaymentMainArgs checkoutPaymentMainArgs, ICheckoutProductDataResolver iCheckoutProductDataResolver, CheckoutPaymentDataResolver checkoutPaymentDataResolver, GetPaymentMethodsUseCase getPaymentMethodsUseCase, PaymentMethodsCheckoutItemsUseCase paymentMethodsCheckoutItemsUseCase, FilterValidPaymentMethodsUseCase filterValidPaymentMethodsUseCase, GetOrderStatusUseCase getOrderStatusUseCase, GetPaymentStatusUseCase getPaymentStatusUseCase, ConvertInaiUpiAppDetailToIndividualCheckoutItemUseCase convertInaiUpiAppDetailToIndividualCheckoutItemUseCase, ICheckoutAnalyticsHelper iCheckoutAnalyticsHelper, CurrencyFeature currencyFeature, CityProvider cityProvider, CommonCheckoutItemUseCase commonCheckoutItemUseCase, ChaloPayManager chaloPayManager, ChaloConfigFeature chaloConfigFeature, UserProfileDetailsProvider userProfileDetailsProvider, StringProvider stringProvider, CreateOrderForChaloPaymentUseCase createOrderForChaloPaymentUseCase, MakeChaloWalletPaymentUseCase makeChaloWalletPaymentUseCase, WalletRepository walletRepository, CoroutineContextProvider coroutineContextProvider, InstalledUpiAppsHelperProvider installedUpiAppsHelperProvider, ChaloConfigFeature chaloConfigFeature2, ChaloNavigationManager chaloNavigationManager, CheckoutResultStateManager checkoutResultStateManager, WalletLoadMoneyResultStateManager walletLoadMoneyResultStateManager, GetChaloPayCheckoutItemUseCase getChaloPayCheckoutItemUseCase, IsNotificationPermissionGrantedUseCase isNotificationPermissionGrantedUseCase, UpdateMetroBookingUseCase updateMetroBookingUseCase, PermissionHandlerProvider permissionHandlerProvider, JusPaySdkHelper jusPaySdkHelper, ArePermissionsGrantedUseCase arePermissionsGrantedUseCase, ChaloBuildConfig chaloBuildConfig, JuspayControllerProvider juspayControllerProvider, KotlinToastManager kotlinToastManager, SystemHelper systemHelper, AdTargetingProvider adTargetingProvider, UrlOpenHelper urlOpenHelper, AnalyticsContract analyticsContract, WalletResolver walletResolver, ResolveSupportPolicyUseCase resolveSupportPolicyUseCase) {
        Object objB;
        super(componentContext);
        this.k = checkoutPaymentMainArgs;
        this.l = iCheckoutProductDataResolver;
        this.m = checkoutPaymentDataResolver;
        this.n = getPaymentMethodsUseCase;
        this.o = paymentMethodsCheckoutItemsUseCase;
        this.p = filterValidPaymentMethodsUseCase;
        this.q = getOrderStatusUseCase;
        this.r = getPaymentStatusUseCase;
        this.s = convertInaiUpiAppDetailToIndividualCheckoutItemUseCase;
        this.t = iCheckoutAnalyticsHelper;
        this.u = currencyFeature;
        this.v = cityProvider;
        this.w = commonCheckoutItemUseCase;
        this.x = chaloPayManager;
        this.y = chaloConfigFeature;
        this.z = userProfileDetailsProvider;
        this.A = stringProvider;
        this.B = createOrderForChaloPaymentUseCase;
        this.C = makeChaloWalletPaymentUseCase;
        this.D = walletRepository;
        this.E = coroutineContextProvider;
        this.F = installedUpiAppsHelperProvider;
        this.G = chaloConfigFeature2;
        this.H = chaloNavigationManager;
        this.I = checkoutResultStateManager;
        this.J = walletLoadMoneyResultStateManager;
        this.K = getChaloPayCheckoutItemUseCase;
        this.L = isNotificationPermissionGrantedUseCase;
        this.M = updateMetroBookingUseCase;
        this.N = permissionHandlerProvider;
        this.O = jusPaySdkHelper;
        this.P = arePermissionsGrantedUseCase;
        this.Q = chaloBuildConfig;
        this.R = juspayControllerProvider;
        this.S = kotlinToastManager;
        this.T = systemHelper;
        this.U = adTargetingProvider;
        this.V = urlOpenHelper;
        this.W = analyticsContract;
        this.X = walletResolver;
        this.Y = resolveSupportPolicyUseCase;
        this.g0 = 1000L;
        this.j0 = LazyKt.b(new iq0(this, 25));
        this.k0 = new InaiSdkExecuteDelegate() { // from class: app.chalo.checkout.ui.screen.payment.PaymentMainComponent$inaiSdkExecuteDelegate$1

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final /* synthetic */ class WhenMappings {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f1536a;

                static {
                    int[] iArr = new int[InaiSdkExecuteStatus.values().length];
                    try {
                        iArr[InaiSdkExecuteStatus.SUCCESS.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    f1536a = iArr;
                }
            }

            @Override // app.chalo.checkout.paymentprovider.inai.InaiSdkExecuteDelegate
            public final void a(InaiSdkExecuteResult inaiSdkExecuteResult) {
                String message = "sdk execute result: " + inaiSdkExecuteResult;
                Intrinsics.i(message, "message");
                int i = WhenMappings.f1536a[inaiSdkExecuteResult.b.ordinal()];
                PaymentMainComponent paymentMainComponent = this.f1535a;
                if (i == 1) {
                    paymentMainComponent.s1(new PaymentViewIntent.InaiInstalledUpiAppsReceived(inaiSdkExecuteResult.f1411a));
                } else {
                    paymentMainComponent.s1(PaymentViewIntent.InaiFetchInstalledUpiAppFailure.f1559a);
                }
            }
        };
        installedUpiAppsHelperProvider.b();
        StateKeeper b = componentContext.getB();
        CheckoutRestoredState.Companion companion = CheckoutRestoredState.INSTANCE;
        CheckoutRestoredState checkoutRestoredState = (CheckoutRestoredState) b.a("CHECKOUT_STATE_KEEPER_KEY", companion.serializer());
        componentContext.getB().d("CHECKOUT_STATE_KEEPER_KEY", companion.serializer(), new iq0(this, 26));
        PaymentViewIntent.LoadPaymentMethodsIntent loadPaymentMethodsIntent = PaymentViewIntent.LoadPaymentMethodsIntent.f1561a;
        if (checkoutRestoredState == null) {
            ChaloJson chaloJson = ChaloJson.f6455a;
            String str = checkoutPaymentMainArgs.d;
            try {
                Json json = ChaloJson.b;
                json.getClass();
                objB = json.b(str, CheckoutIntentModel.INSTANCE.serializer());
            } catch (Exception unused) {
                objB = null;
            }
            CheckoutIntentModel checkoutIntentModel = (CheckoutIntentModel) objB;
            if (checkoutIntentModel == null) {
                q0(new iq0(this, 28));
                return;
            }
            CheckoutPaymentData checkoutPaymentData = checkoutIntentModel.f2685a;
            this.l.B(checkoutIntentModel.b);
            if (checkoutPaymentData.d.f5657a == CheckoutPaymentProvider.INAI) {
                this.m.K(checkoutPaymentData.f2691a);
            }
            s1(new PaymentViewIntent.ViewCreatedIntent(checkoutPaymentData));
            s1(loadPaymentMethodsIntent);
            p1();
            return;
        }
        CheckoutProductData checkoutProductData = checkoutRestoredState.b;
        if (checkoutProductData == null) {
            V0("Product data required to proceed");
            return;
        }
        iCheckoutProductDataResolver.B(checkoutProductData);
        PaymentInfoState paymentInfoState = checkoutRestoredState.c;
        if (paymentInfoState == null) {
            V0("Payment methods data required to proceed");
            return;
        }
        checkoutPaymentDataResolver.N(paymentInfoState);
        CheckoutPaymentData checkoutPaymentData2 = checkoutRestoredState.f1510a;
        if (checkoutPaymentData2 == null) {
            V0("Payment data required to proceed");
            return;
        }
        checkoutPaymentDataResolver.R(checkoutPaymentData2);
        if (checkoutPaymentData2.d.f5657a == CheckoutPaymentProvider.INAI) {
            checkoutPaymentDataResolver.K(checkoutPaymentData2.f2691a);
        }
        s1(new PaymentViewIntent.ViewCreatedIntent(checkoutPaymentData2));
        s1(loadPaymentMethodsIntent);
        p1();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Code duplicated, block: B:27:0x0083  */
    /* JADX WARN: Code duplicated, block: B:29:0x009c  */
    /* JADX WARN: Code duplicated, block: B:30:0x009e  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        if (r1 == r3) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object F0(app.chalo.checkout.ui.screen.payment.PaymentMainComponent r21, kotlin.coroutines.jvm.internal.ContinuationImpl r22) {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.checkout.ui.screen.payment.PaymentMainComponent.F0(app.chalo.checkout.ui.screen.payment.PaymentMainComponent, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009c  */
    /* JADX WARN: Code duplicated, block: B:27:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00de  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:44:0x0102 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x0103  */
    /* JADX WARN: Code duplicated, block: B:47:0x010d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0111  */
    /* JADX WARN: Code duplicated, block: B:52:0x0131 A[PHI: r1
      0x0131: PHI (r1v24 java.lang.Object) = (r1v12 java.lang.Object), (r1v1 java.lang.Object) binds: [B:50:0x012e, B:14:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x0143  */
    /* JADX WARN: Code duplicated, block: B:59:0x0160  */
    /* JADX WARN: Code duplicated, block: B:62:0x017f  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
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
    public static final Object G0(PaymentMainComponent paymentMainComponent, Function1 function1, ContinuationImpl continuationImpl) {
        PaymentMainComponent$getOrderStatus$1 paymentMainComponent$getOrderStatus$1;
        Function1 function2;
        ChaloUseCaseResult chaloUseCaseResult;
        int i;
        KotlinToastManager kotlinToastManager;
        Object objB;
        KotlinToastManager kotlinToastManager2;
        String str;
        Object objB2;
        String str2;
        String str3;
        LottieType lottieType;
        Object objB3;
        String str4;
        String str5;
        LottieType lottieType2;
        ICheckoutAnalyticsHelper iCheckoutAnalyticsHelper = paymentMainComponent.t;
        StringProvider stringProvider = paymentMainComponent.A;
        if (continuationImpl instanceof PaymentMainComponent$getOrderStatus$1) {
            paymentMainComponent$getOrderStatus$1 = (PaymentMainComponent$getOrderStatus$1) continuationImpl;
            int i2 = paymentMainComponent$getOrderStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMainComponent$getOrderStatus$1.label = i2 - Integer.MIN_VALUE;
            } else {
                paymentMainComponent$getOrderStatus$1 = new PaymentMainComponent$getOrderStatus$1(paymentMainComponent, continuationImpl);
            }
        } else {
            paymentMainComponent$getOrderStatus$1 = new PaymentMainComponent$getOrderStatus$1(paymentMainComponent, continuationImpl);
        }
        Object objA = paymentMainComponent$getOrderStatus$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = paymentMainComponent$getOrderStatus$1.label;
        Unit unit = Unit.f17538a;
        switch (i3) {
            case 0:
                ResultKt.b(objA);
                paymentMainComponent.E0(new do0(27));
                GetOrderStatusUseCase getOrderStatusUseCase = paymentMainComponent.q;
                String str6 = paymentMainComponent.m.getC().f2691a.b;
                paymentMainComponent$getOrderStatus$1.L$0 = function1;
                paymentMainComponent$getOrderStatus$1.label = 1;
                objA = getOrderStatusUseCase.a(str6, paymentMainComponent$getOrderStatus$1);
                if (objA != coroutineSingletons) {
                    function2 = function1;
                    chaloUseCaseResult = (ChaloUseCaseResult) objA;
                    if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                        paymentMainComponent.E0(new do0(28));
                        OrderStatus orderStatus = (OrderStatus) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                        iCheckoutAnalyticsHelper.g(orderStatus.getStatus(), null);
                        i = WhenMappings.g[orderStatus.ordinal()];
                        if (i != 1) {
                            paymentMainComponent.q0(new iq0(paymentMainComponent, 0));
                            return unit;
                        }
                        if (i == 2) {
                            paymentMainComponent$getOrderStatus$1.L$0 = null;
                            paymentMainComponent$getOrderStatus$1.label = 2;
                            if (function2.invoke(paymentMainComponent$getOrderStatus$1) == coroutineSingletons) {
                                return unit;
                            }
                        } else {
                            if (i == 3 && i != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            kotlinToastManager = paymentMainComponent.S;
                            paymentMainComponent$getOrderStatus$1.L$0 = kotlinToastManager;
                            paymentMainComponent$getOrderStatus$1.label = 3;
                            objB = stringProvider.b(StringEnum.RETRY_PAYMENT, new Object[0], paymentMainComponent$getOrderStatus$1);
                            if (objB != coroutineSingletons) {
                                kotlinToastManager2 = kotlinToastManager;
                                objA = objB;
                                kotlinToastManager2.a(new KotlinToastData((String) objA));
                                paymentMainComponent.q0(new iq0(paymentMainComponent, 1));
                                return unit;
                            }
                        }
                    } else {
                        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iCheckoutAnalyticsHelper.g(PaymentStatus.UNKNOWN.getStatus(), ((CheckoutErrorType) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).f1364a);
                        paymentMainComponent$getOrderStatus$1.L$0 = null;
                        paymentMainComponent$getOrderStatus$1.label = 4;
                        objA = stringProvider.b(StringEnum.PAYMENT_PROCESSING, new Object[0], paymentMainComponent$getOrderStatus$1);
                        if (objA != coroutineSingletons) {
                            str = (String) objA;
                            paymentMainComponent$getOrderStatus$1.L$0 = str;
                            paymentMainComponent$getOrderStatus$1.label = 5;
                            objB2 = stringProvider.b(StringEnum.PAYMENT_UNKNOWN_ERROR_COPY, new Object[0], paymentMainComponent$getOrderStatus$1);
                            if (objB2 != coroutineSingletons) {
                                str2 = str;
                                objA = objB2;
                                str3 = (String) objA;
                                lottieType = LottieType.PAYMENT_FAILED_ERROR;
                                paymentMainComponent$getOrderStatus$1.L$0 = str2;
                                paymentMainComponent$getOrderStatus$1.L$1 = str3;
                                paymentMainComponent$getOrderStatus$1.L$2 = lottieType;
                                paymentMainComponent$getOrderStatus$1.label = 6;
                                objB3 = stringProvider.b(StringEnum.OKAY, new Object[0], paymentMainComponent$getOrderStatus$1);
                                if (objB3 != coroutineSingletons) {
                                    str4 = str3;
                                    str5 = str2;
                                    objA = objB3;
                                    lottieType2 = lottieType;
                                    paymentMainComponent.E0(new ym0(new PaymentStatusAlertDetails(str5, str4, lottieType2, null, (String) objA, PaymentStatusCTAActionType.NAVIGATE_TO_HOME, null, null, 200), 13));
                                    return unit;
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                function2 = (Function1) paymentMainComponent$getOrderStatus$1.L$0;
                ResultKt.b(objA);
                chaloUseCaseResult = (ChaloUseCaseResult) objA;
                if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                    paymentMainComponent.E0(new do0(28));
                    OrderStatus orderStatus2 = (OrderStatus) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                    iCheckoutAnalyticsHelper.g(orderStatus2.getStatus(), null);
                    i = WhenMappings.g[orderStatus2.ordinal()];
                    if (i != 1) {
                        paymentMainComponent.q0(new iq0(paymentMainComponent, 0));
                        return unit;
                    }
                    if (i == 2) {
                        if (i == 3) {
                        }
                        kotlinToastManager = paymentMainComponent.S;
                        paymentMainComponent$getOrderStatus$1.L$0 = kotlinToastManager;
                        paymentMainComponent$getOrderStatus$1.label = 3;
                        objB = stringProvider.b(StringEnum.RETRY_PAYMENT, new Object[0], paymentMainComponent$getOrderStatus$1);
                        if (objB != coroutineSingletons) {
                            kotlinToastManager2 = kotlinToastManager;
                            objA = objB;
                            kotlinToastManager2.a(new KotlinToastData((String) objA));
                            paymentMainComponent.q0(new iq0(paymentMainComponent, 1));
                            return unit;
                        }
                    } else {
                        paymentMainComponent$getOrderStatus$1.L$0 = null;
                        paymentMainComponent$getOrderStatus$1.label = 2;
                        if (function2.invoke(paymentMainComponent$getOrderStatus$1) == coroutineSingletons) {
                            return unit;
                        }
                    }
                } else {
                    if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iCheckoutAnalyticsHelper.g(PaymentStatus.UNKNOWN.getStatus(), ((CheckoutErrorType) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).f1364a);
                    paymentMainComponent$getOrderStatus$1.L$0 = null;
                    paymentMainComponent$getOrderStatus$1.label = 4;
                    objA = stringProvider.b(StringEnum.PAYMENT_PROCESSING, new Object[0], paymentMainComponent$getOrderStatus$1);
                    if (objA != coroutineSingletons) {
                        str = (String) objA;
                        paymentMainComponent$getOrderStatus$1.L$0 = str;
                        paymentMainComponent$getOrderStatus$1.label = 5;
                        objB2 = stringProvider.b(StringEnum.PAYMENT_UNKNOWN_ERROR_COPY, new Object[0], paymentMainComponent$getOrderStatus$1);
                        if (objB2 != coroutineSingletons) {
                            str2 = str;
                            objA = objB2;
                            str3 = (String) objA;
                            lottieType = LottieType.PAYMENT_FAILED_ERROR;
                            paymentMainComponent$getOrderStatus$1.L$0 = str2;
                            paymentMainComponent$getOrderStatus$1.L$1 = str3;
                            paymentMainComponent$getOrderStatus$1.L$2 = lottieType;
                            paymentMainComponent$getOrderStatus$1.label = 6;
                            objB3 = stringProvider.b(StringEnum.OKAY, new Object[0], paymentMainComponent$getOrderStatus$1);
                            if (objB3 != coroutineSingletons) {
                                str4 = str3;
                                str5 = str2;
                                objA = objB3;
                                lottieType2 = lottieType;
                                paymentMainComponent.E0(new ym0(new PaymentStatusAlertDetails(str5, str4, lottieType2, null, (String) objA, PaymentStatusCTAActionType.NAVIGATE_TO_HOME, null, null, 200), 13));
                                return unit;
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 2:
                ResultKt.b(objA);
                return unit;
            case 3:
                kotlinToastManager2 = (KotlinToastManager) paymentMainComponent$getOrderStatus$1.L$0;
                ResultKt.b(objA);
                kotlinToastManager2.a(new KotlinToastData((String) objA));
                paymentMainComponent.q0(new iq0(paymentMainComponent, 1));
                return unit;
            case 4:
                ResultKt.b(objA);
                str = (String) objA;
                paymentMainComponent$getOrderStatus$1.L$0 = str;
                paymentMainComponent$getOrderStatus$1.label = 5;
                objB2 = stringProvider.b(StringEnum.PAYMENT_UNKNOWN_ERROR_COPY, new Object[0], paymentMainComponent$getOrderStatus$1);
                if (objB2 != coroutineSingletons) {
                    str2 = str;
                    objA = objB2;
                    str3 = (String) objA;
                    lottieType = LottieType.PAYMENT_FAILED_ERROR;
                    paymentMainComponent$getOrderStatus$1.L$0 = str2;
                    paymentMainComponent$getOrderStatus$1.L$1 = str3;
                    paymentMainComponent$getOrderStatus$1.L$2 = lottieType;
                    paymentMainComponent$getOrderStatus$1.label = 6;
                    objB3 = stringProvider.b(StringEnum.OKAY, new Object[0], paymentMainComponent$getOrderStatus$1);
                    if (objB3 != coroutineSingletons) {
                        str4 = str3;
                        str5 = str2;
                        objA = objB3;
                        lottieType2 = lottieType;
                        paymentMainComponent.E0(new ym0(new PaymentStatusAlertDetails(str5, str4, lottieType2, null, (String) objA, PaymentStatusCTAActionType.NAVIGATE_TO_HOME, null, null, 200), 13));
                        return unit;
                    }
                }
                return coroutineSingletons;
            case 5:
                str2 = (String) paymentMainComponent$getOrderStatus$1.L$0;
                ResultKt.b(objA);
                str3 = (String) objA;
                lottieType = LottieType.PAYMENT_FAILED_ERROR;
                paymentMainComponent$getOrderStatus$1.L$0 = str2;
                paymentMainComponent$getOrderStatus$1.L$1 = str3;
                paymentMainComponent$getOrderStatus$1.L$2 = lottieType;
                paymentMainComponent$getOrderStatus$1.label = 6;
                objB3 = stringProvider.b(StringEnum.OKAY, new Object[0], paymentMainComponent$getOrderStatus$1);
                if (objB3 != coroutineSingletons) {
                    str4 = str3;
                    str5 = str2;
                    objA = objB3;
                    lottieType2 = lottieType;
                    paymentMainComponent.E0(new ym0(new PaymentStatusAlertDetails(str5, str4, lottieType2, null, (String) objA, PaymentStatusCTAActionType.NAVIGATE_TO_HOME, null, null, 200), 13));
                    return unit;
                }
                return coroutineSingletons;
            case 6:
                LottieType lottieType3 = (LottieType) paymentMainComponent$getOrderStatus$1.L$2;
                String str7 = (String) paymentMainComponent$getOrderStatus$1.L$1;
                String str8 = (String) paymentMainComponent$getOrderStatus$1.L$0;
                ResultKt.b(objA);
                lottieType2 = lottieType3;
                str4 = str7;
                str5 = str8;
                paymentMainComponent.E0(new ym0(new PaymentStatusAlertDetails(str5, str4, lottieType2, null, (String) objA, PaymentStatusCTAActionType.NAVIGATE_TO_HOME, null, null, 200), 13));
                return unit;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object H0(PaymentMainComponent paymentMainComponent, ContinuationImpl continuationImpl) {
        PaymentMainComponent$getReclaimWebLinkUri$1 paymentMainComponent$getReclaimWebLinkUri$1;
        StringBuilder sb;
        StringBuilder sb2;
        String strA;
        UserProfileDetailsProvider userProfileDetailsProvider = paymentMainComponent.z;
        if (continuationImpl instanceof PaymentMainComponent$getReclaimWebLinkUri$1) {
            paymentMainComponent$getReclaimWebLinkUri$1 = (PaymentMainComponent$getReclaimWebLinkUri$1) continuationImpl;
            int i = paymentMainComponent$getReclaimWebLinkUri$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                paymentMainComponent$getReclaimWebLinkUri$1.label = i - Integer.MIN_VALUE;
            } else {
                paymentMainComponent$getReclaimWebLinkUri$1 = new PaymentMainComponent$getReclaimWebLinkUri$1(paymentMainComponent, continuationImpl);
            }
        } else {
            paymentMainComponent$getReclaimWebLinkUri$1 = new PaymentMainComponent$getReclaimWebLinkUri$1(paymentMainComponent, continuationImpl);
        }
        Object obj = paymentMainComponent$getReclaimWebLinkUri$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = paymentMainComponent$getReclaimWebLinkUri$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            StringBuilder sb3 = new StringBuilder();
            ChaloConfigFeature chaloConfigFeature = paymentMainComponent.G;
            paymentMainComponent$getReclaimWebLinkUri$1.L$0 = sb3;
            paymentMainComponent$getReclaimWebLinkUri$1.L$1 = sb3;
            paymentMainComponent$getReclaimWebLinkUri$1.label = 1;
            Object objA = chaloConfigFeature.a("reclaimPassesRequestUrl", paymentMainComponent$getReclaimWebLinkUri$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            sb = sb3;
            obj = objA;
            sb2 = sb;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sb2 = (StringBuilder) paymentMainComponent$getReclaimWebLinkUri$1.L$1;
            sb = (StringBuilder) paymentMainComponent$getReclaimWebLinkUri$1.L$0;
            ResultKt.b(obj);
        }
        String str = (String) obj;
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
        sb2.append(str.subSequence(i3, length + 1).toString());
        UserProfileAppModel userProfileAppModelF = userProfileDetailsProvider.f();
        if (userProfileAppModelF == null || (strA = userProfileAppModelF.a()) == null) {
            strA = "";
        }
        sb.append("?entry.1987039175=".concat(strA));
        UserProfileAppModel userProfileAppModelF2 = userProfileDetailsProvider.f();
        sb.append("&entry.58353678=" + (userProfileAppModelF2 != null ? userProfileAppModelF2.e : null));
        String string = sb.toString();
        Intrinsics.h(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0096  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:50:0x0101  */
    /* JADX WARN: Code duplicated, block: B:56:0x010d  */
    /* JADX WARN: Code duplicated, block: B:57:0x010f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0113  */
    /* JADX WARN: Code duplicated, block: B:61:0x0116  */
    /* JADX WARN: Code duplicated, block: B:67:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0107 A[EDGE_INSN: B:75:0x0107->B:54:0x0107 BREAK  A[LOOP:2: B:46:0x00ef->B:78:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v6, types: [app.chalo.checkout.ui.screen.payment.CheckoutScreenSectionUiModel] */
    /* JADX WARN: Type inference failed for: r3v7, types: [app.chalo.checkout.ui.screen.payment.CheckoutScreenSectionUiModel$ChaloPay] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public static final Serializable I0(PaymentMainComponent paymentMainComponent, ContinuationImpl continuationImpl) {
        PaymentMainComponent$getUpdatedPreferredListInCheckoutUiListIfNeeded$1 paymentMainComponent$getUpdatedPreferredListInCheckoutUiListIfNeeded$1;
        List listE0;
        List list;
        CheckoutPaymentItem.IndividualCheckoutItem individualCheckoutItem;
        CheckoutPaymentItem.IndividualCheckoutItem individualCheckoutItem2;
        ArrayList arrayList;
        Iterator it;
        CheckoutPaymentItem.IndividualCheckoutItem individualCheckoutItem3;
        Object next;
        CheckoutPaymentItem checkoutPaymentItem;
        CheckoutPaymentItem checkoutPaymentItem2;
        ArrayList arrayList2;
        CheckoutPaymentDataResolver checkoutPaymentDataResolver = paymentMainComponent.m;
        ChaloPayManager chaloPayManager = paymentMainComponent.x;
        GetChaloPayCheckoutItemUseCase getChaloPayCheckoutItemUseCase = paymentMainComponent.K;
        if (continuationImpl instanceof PaymentMainComponent$getUpdatedPreferredListInCheckoutUiListIfNeeded$1) {
            paymentMainComponent$getUpdatedPreferredListInCheckoutUiListIfNeeded$1 = (PaymentMainComponent$getUpdatedPreferredListInCheckoutUiListIfNeeded$1) continuationImpl;
            int i = paymentMainComponent$getUpdatedPreferredListInCheckoutUiListIfNeeded$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                paymentMainComponent$getUpdatedPreferredListInCheckoutUiListIfNeeded$1.label = i - Integer.MIN_VALUE;
            } else {
                paymentMainComponent$getUpdatedPreferredListInCheckoutUiListIfNeeded$1 = new PaymentMainComponent$getUpdatedPreferredListInCheckoutUiListIfNeeded$1(paymentMainComponent, continuationImpl);
            }
        } else {
            paymentMainComponent$getUpdatedPreferredListInCheckoutUiListIfNeeded$1 = new PaymentMainComponent$getUpdatedPreferredListInCheckoutUiListIfNeeded$1(paymentMainComponent, continuationImpl);
        }
        Object objA = paymentMainComponent$getUpdatedPreferredListInCheckoutUiListIfNeeded$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = paymentMainComponent$getUpdatedPreferredListInCheckoutUiListIfNeeded$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            listE0 = CollectionsKt.E0(((PaymentDataState) paymentMainComponent.f.getValue()).l);
            CheckoutPaymentMethod.ChaloPay chaloPay = CheckoutPaymentMethod.ChaloPay.INSTANCE;
            paymentMainComponent$getUpdatedPreferredListInCheckoutUiListIfNeeded$1.L$0 = listE0;
            paymentMainComponent$getUpdatedPreferredListInCheckoutUiListIfNeeded$1.label = 1;
            objA = getChaloPayCheckoutItemUseCase.a(checkoutPaymentDataResolver, chaloPayManager, chaloPay, paymentMainComponent$getUpdatedPreferredListInCheckoutUiListIfNeeded$1);
            if (objA != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            listE0 = (List) paymentMainComponent$getUpdatedPreferredListInCheckoutUiListIfNeeded$1.L$0;
            ResultKt.b(objA);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            individualCheckoutItem = (CheckoutPaymentItem.IndividualCheckoutItem) paymentMainComponent$getUpdatedPreferredListInCheckoutUiListIfNeeded$1.L$1;
            list = (List) paymentMainComponent$getUpdatedPreferredListInCheckoutUiListIfNeeded$1.L$0;
            ResultKt.b(objA);
        }
        individualCheckoutItem2 = (CheckoutPaymentItem.IndividualCheckoutItem) objA;
        List<??> list2 = list;
        arrayList = new ArrayList(CollectionsKt.v(list2, 10));
        for (?? chaloPay2 : list2) {
            if (chaloPay2 instanceof CheckoutScreenSectionUiModel.PreferredModes) {
                List<Object> list3 = ((CheckoutScreenSectionUiModel.PreferredModes) chaloPay2).h;
                arrayList2 = new ArrayList(CollectionsKt.v(list3, 10));
                for (Object obj : list3) {
                    if (obj instanceof CheckoutPaymentItem.IndividualCheckoutItem.ChaloPayItem) {
                        if (individualCheckoutItem == null) {
                            obj = (CheckoutPaymentItem.IndividualCheckoutItem) obj;
                        } else {
                            obj = individualCheckoutItem;
                        }
                    } else if (!(obj instanceof CheckoutPaymentItem.IndividualCheckoutItem.ClosedLoopPayItem)) {
                        if (individualCheckoutItem2 == null) {
                            obj = (CheckoutPaymentItem.IndividualCheckoutItem) obj;
                        } else {
                            obj = individualCheckoutItem2;
                        }
                    }
                    arrayList2.add(obj);
                }
                chaloPay2 = new CheckoutScreenSectionUiModel.PreferredModes(StringEnum.PREFERRED_PAYMENT_HEADING, arrayList2);
            } else if (chaloPay2 instanceof CheckoutScreenSectionUiModel.ChaloPay) {
                chaloPay2 = (CheckoutScreenSectionUiModel.ChaloPay) chaloPay2;
                it = chaloPay2.i.iterator();
                do {
                    individualCheckoutItem3 = null;
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    checkoutPaymentItem2 = (CheckoutPaymentItem) next;
                    if (!(checkoutPaymentItem2 instanceof CheckoutPaymentItem.IndividualCheckoutItem.ClosedLoopPayItem)) {
                        break;
                    }
                } while (!(checkoutPaymentItem2 instanceof CheckoutPaymentItem.IndividualCheckoutItem.ChaloPayItem));
                checkoutPaymentItem = (CheckoutPaymentItem) next;
                if (checkoutPaymentItem instanceof CheckoutPaymentItem.IndividualCheckoutItem.ClosedLoopPayItem) {
                    individualCheckoutItem3 = individualCheckoutItem2;
                } else if (checkoutPaymentItem instanceof CheckoutPaymentItem.IndividualCheckoutItem.ChaloPayItem) {
                    individualCheckoutItem3 = individualCheckoutItem;
                }
                if (individualCheckoutItem3 != null) {
                    chaloPay2 = new CheckoutScreenSectionUiModel.ChaloPay(StringEnum.CHALO_PAY, individualCheckoutItem3.getF1342a().f, CollectionsKt.R(individualCheckoutItem3));
                }
            }
            arrayList.add(chaloPay2);
        }
        return arrayList;
        CheckoutPaymentItem.IndividualCheckoutItem individualCheckoutItem4 = (CheckoutPaymentItem.IndividualCheckoutItem) objA;
        CheckoutPaymentMethod.ClosedLoopWallet closedLoopWallet = CheckoutPaymentMethod.ClosedLoopWallet.INSTANCE;
        paymentMainComponent$getUpdatedPreferredListInCheckoutUiListIfNeeded$1.L$0 = listE0;
        paymentMainComponent$getUpdatedPreferredListInCheckoutUiListIfNeeded$1.L$1 = individualCheckoutItem4;
        paymentMainComponent$getUpdatedPreferredListInCheckoutUiListIfNeeded$1.label = 2;
        Object objA2 = getChaloPayCheckoutItemUseCase.a(checkoutPaymentDataResolver, chaloPayManager, closedLoopWallet, paymentMainComponent$getUpdatedPreferredListInCheckoutUiListIfNeeded$1);
        if (objA2 != coroutineSingletons) {
            list = listE0;
            individualCheckoutItem = individualCheckoutItem4;
            objA = objA2;
            individualCheckoutItem2 = (CheckoutPaymentItem.IndividualCheckoutItem) objA;
            List<??> list4 = list;
            arrayList = new ArrayList(CollectionsKt.v(list4, 10));
            while (r0.hasNext()) {
                if (chaloPay2 instanceof CheckoutScreenSectionUiModel.PreferredModes) {
                    List<Object> list5 = ((CheckoutScreenSectionUiModel.PreferredModes) chaloPay2).h;
                    arrayList2 = new ArrayList(CollectionsKt.v(list5, 10));
                    while (r3.hasNext()) {
                        if (obj instanceof CheckoutPaymentItem.IndividualCheckoutItem.ChaloPayItem) {
                            if (individualCheckoutItem == null) {
                                obj = (CheckoutPaymentItem.IndividualCheckoutItem) obj;
                            } else {
                                obj = individualCheckoutItem;
                            }
                        } else if (!(obj instanceof CheckoutPaymentItem.IndividualCheckoutItem.ClosedLoopPayItem)) {
                            if (individualCheckoutItem2 == null) {
                                obj = (CheckoutPaymentItem.IndividualCheckoutItem) obj;
                            } else {
                                obj = individualCheckoutItem2;
                            }
                        }
                        arrayList2.add(obj);
                    }
                    chaloPay2 = new CheckoutScreenSectionUiModel.PreferredModes(StringEnum.PREFERRED_PAYMENT_HEADING, arrayList2);
                } else if (chaloPay2 instanceof CheckoutScreenSectionUiModel.ChaloPay) {
                    chaloPay2 = (CheckoutScreenSectionUiModel.ChaloPay) chaloPay2;
                    it = chaloPay2.i.iterator();
                    do {
                        individualCheckoutItem3 = null;
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        checkoutPaymentItem2 = (CheckoutPaymentItem) next;
                        if (!(checkoutPaymentItem2 instanceof CheckoutPaymentItem.IndividualCheckoutItem.ClosedLoopPayItem)) {
                            break;
                            break;
                        }
                    } while (!(checkoutPaymentItem2 instanceof CheckoutPaymentItem.IndividualCheckoutItem.ChaloPayItem));
                    checkoutPaymentItem = (CheckoutPaymentItem) next;
                    if (checkoutPaymentItem instanceof CheckoutPaymentItem.IndividualCheckoutItem.ClosedLoopPayItem) {
                        individualCheckoutItem3 = individualCheckoutItem2;
                    } else if (checkoutPaymentItem instanceof CheckoutPaymentItem.IndividualCheckoutItem.ChaloPayItem) {
                        individualCheckoutItem3 = individualCheckoutItem;
                    }
                    if (individualCheckoutItem3 != null) {
                        chaloPay2 = new CheckoutScreenSectionUiModel.ChaloPay(StringEnum.CHALO_PAY, individualCheckoutItem3.getF1342a().f, CollectionsKt.R(individualCheckoutItem3));
                    }
                }
                arrayList.add(chaloPay2);
            }
            return arrayList;
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0285  */
    /* JADX WARN: Code duplicated, block: B:116:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:132:0x0317  */
    /* JADX WARN: Code duplicated, block: B:135:0x032c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:136:0x032d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x0148  */
    /* JADX WARN: Code duplicated, block: B:66:0x0188  */
    /* JADX WARN: Code duplicated, block: B:76:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code duplicated, block: B:86:0x0208  */
    /* JADX WARN: Code duplicated, block: B:96:0x0247  */
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
    public static final Object J0(PaymentMainComponent paymentMainComponent, UseCaseOperationError useCaseOperationError, ContinuationImpl continuationImpl) {
        PaymentMainComponent$handleChaloPaymentOrderCreationFailure$1 paymentMainComponent$handleChaloPaymentOrderCreationFailure$1;
        String str;
        PaymentMainComponent paymentMainComponent2;
        String str2;
        String str3;
        PaymentMainComponent paymentMainComponent3;
        String str4;
        PaymentStatusCTAActionType paymentStatusCTAActionType;
        String str5;
        PaymentMainComponent paymentMainComponent4;
        String str6;
        PaymentStatusCTAActionType paymentStatusCTAActionType2;
        String str7;
        PaymentMainComponent paymentMainComponent5;
        String str8;
        PaymentStatusCTAActionType paymentStatusCTAActionType3;
        String str9;
        PaymentMainComponent paymentMainComponent6;
        String str10;
        PaymentStatusCTAActionType paymentStatusCTAActionType4;
        String str11;
        PaymentMainComponent paymentMainComponent7;
        String str12;
        PaymentStatusCTAActionType paymentStatusCTAActionType5;
        String str13;
        PaymentMainComponent paymentMainComponent8;
        String str14;
        PaymentStatusCTAActionType paymentStatusCTAActionType6;
        String str15;
        PaymentMainComponent paymentMainComponent9;
        String str16;
        StringProvider stringProvider = paymentMainComponent.A;
        if (continuationImpl instanceof PaymentMainComponent$handleChaloPaymentOrderCreationFailure$1) {
            paymentMainComponent$handleChaloPaymentOrderCreationFailure$1 = (PaymentMainComponent$handleChaloPaymentOrderCreationFailure$1) continuationImpl;
            int i = paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.label = i - Integer.MIN_VALUE;
            } else {
                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1 = new PaymentMainComponent$handleChaloPaymentOrderCreationFailure$1(paymentMainComponent, continuationImpl);
            }
        } else {
            paymentMainComponent$handleChaloPaymentOrderCreationFailure$1 = new PaymentMainComponent$handleChaloPaymentOrderCreationFailure$1(paymentMainComponent, continuationImpl);
        }
        Object objB = paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.label;
        Unit unit = Unit.f17538a;
        switch (i2) {
            case 0:
                ResultKt.b(objB);
                OperationFailureError operationFailureError = useCaseOperationError.f6000a;
                if (operationFailureError instanceof OperationFailureError.UseCaseSpecificError) {
                    switch (WhenMappings.j[((ChaloPaymentOrderCreationFailureReason) ((OperationFailureError.UseCaseSpecificError) operationFailureError).f5999a).ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0 = paymentMainComponent;
                            paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.label = 1;
                            objB = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], paymentMainComponent$handleChaloPaymentOrderCreationFailure$1);
                            if (objB != coroutineSingletons) {
                                str = (String) objB;
                                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0 = paymentMainComponent;
                                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$1 = str;
                                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.label = 2;
                                objB = stringProvider.b(StringEnum.RETRY_PAYMENT_ERROR, new Object[0], paymentMainComponent$handleChaloPaymentOrderCreationFailure$1);
                                if (objB != coroutineSingletons) {
                                    paymentMainComponent2 = paymentMainComponent;
                                    str2 = str;
                                    paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0 = null;
                                    paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$1 = null;
                                    paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.label = 3;
                                    if (paymentMainComponent2.k1(str2, (String) objB, PaymentStatusCTAActionType.STAY_ON_PAYMENT_SCREEN, paymentMainComponent$handleChaloPaymentOrderCreationFailure$1) == coroutineSingletons) {
                                        return unit;
                                    }
                                }
                            }
                            break;
                        case 6:
                            paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0 = paymentMainComponent;
                            paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.label = 4;
                            objB = stringProvider.b(StringEnum.PAYMENT_PAGE_EXPIRED, new Object[0], paymentMainComponent$handleChaloPaymentOrderCreationFailure$1);
                            if (objB != coroutineSingletons) {
                                str3 = (String) objB;
                                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0 = paymentMainComponent;
                                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$1 = str3;
                                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.label = 5;
                                objB = stringProvider.b(StringEnum.COMPLETE_PAYMENT_AGAIN, new Object[0], paymentMainComponent$handleChaloPaymentOrderCreationFailure$1);
                                if (objB != coroutineSingletons) {
                                    paymentMainComponent3 = paymentMainComponent;
                                    str4 = str3;
                                    paymentStatusCTAActionType = PaymentStatusCTAActionType.EXIT_CHECKOUT_ACTIVITY;
                                    paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0 = null;
                                    paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$1 = null;
                                    paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.label = 6;
                                    if (paymentMainComponent3.k1(str4, (String) objB, paymentStatusCTAActionType, paymentMainComponent$handleChaloPaymentOrderCreationFailure$1) == coroutineSingletons) {
                                        return unit;
                                    }
                                }
                            }
                            break;
                        case 7:
                            paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0 = paymentMainComponent;
                            paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.label = 7;
                            objB = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], paymentMainComponent$handleChaloPaymentOrderCreationFailure$1);
                            if (objB != coroutineSingletons) {
                                str5 = (String) objB;
                                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0 = paymentMainComponent;
                                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$1 = str5;
                                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.label = 8;
                                objB = stringProvider.b(StringEnum.RETRY_PAYMENT_ERROR, new Object[0], paymentMainComponent$handleChaloPaymentOrderCreationFailure$1);
                                if (objB != coroutineSingletons) {
                                    paymentMainComponent4 = paymentMainComponent;
                                    str6 = str5;
                                    paymentStatusCTAActionType2 = PaymentStatusCTAActionType.FETCH_CHALO_WALLET;
                                    paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0 = null;
                                    paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$1 = null;
                                    paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.label = 9;
                                    if (paymentMainComponent4.k1(str6, (String) objB, paymentStatusCTAActionType2, paymentMainComponent$handleChaloPaymentOrderCreationFailure$1) == coroutineSingletons) {
                                        return unit;
                                    }
                                }
                            }
                            break;
                        case 8:
                            paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0 = paymentMainComponent;
                            paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.label = 10;
                            objB = stringProvider.b(StringEnum.RECHARGE_WALLET, new Object[0], paymentMainComponent$handleChaloPaymentOrderCreationFailure$1);
                            if (objB != coroutineSingletons) {
                                str7 = (String) objB;
                                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0 = paymentMainComponent;
                                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$1 = str7;
                                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.label = 11;
                                objB = stringProvider.b(StringEnum.PAYMENT_FAILED_DUE_TO_INSUFFICIENT_BALANCE, new Object[0], paymentMainComponent$handleChaloPaymentOrderCreationFailure$1);
                                if (objB != coroutineSingletons) {
                                    paymentMainComponent5 = paymentMainComponent;
                                    str8 = str7;
                                    paymentStatusCTAActionType3 = PaymentStatusCTAActionType.FETCH_CHALO_WALLET;
                                    paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0 = null;
                                    paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$1 = null;
                                    paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.label = 12;
                                    if (paymentMainComponent5.k1(str8, (String) objB, paymentStatusCTAActionType3, paymentMainComponent$handleChaloPaymentOrderCreationFailure$1) == coroutineSingletons) {
                                        return unit;
                                    }
                                }
                            }
                            break;
                        case 9:
                            paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0 = paymentMainComponent;
                            paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.label = 13;
                            objB = stringProvider.b(StringEnum.RECLAIM_WALLET, new Object[0], paymentMainComponent$handleChaloPaymentOrderCreationFailure$1);
                            if (objB != coroutineSingletons) {
                                str9 = (String) objB;
                                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0 = paymentMainComponent;
                                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$1 = str9;
                                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.label = 14;
                                objB = stringProvider.b(StringEnum.RECLAIM_WALLET_ERROR, new Object[0], paymentMainComponent$handleChaloPaymentOrderCreationFailure$1);
                                if (objB != coroutineSingletons) {
                                    paymentMainComponent6 = paymentMainComponent;
                                    str10 = str9;
                                    paymentStatusCTAActionType4 = PaymentStatusCTAActionType.FETCH_CHALO_WALLET;
                                    paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0 = null;
                                    paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$1 = null;
                                    paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.label = 15;
                                    if (paymentMainComponent6.k1(str10, (String) objB, paymentStatusCTAActionType4, paymentMainComponent$handleChaloPaymentOrderCreationFailure$1) == coroutineSingletons) {
                                        return unit;
                                    }
                                }
                            }
                            break;
                        case 10:
                            paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0 = paymentMainComponent;
                            paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.label = 16;
                            objB = stringProvider.b(StringEnum.CHALO_WALLET_INACTIVE, new Object[0], paymentMainComponent$handleChaloPaymentOrderCreationFailure$1);
                            if (objB != coroutineSingletons) {
                                str11 = (String) objB;
                                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0 = paymentMainComponent;
                                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$1 = str11;
                                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.label = 17;
                                objB = stringProvider.b(StringEnum.CHALO_WALLET_INACTIVE_ERROR, new Object[0], paymentMainComponent$handleChaloPaymentOrderCreationFailure$1);
                                if (objB != coroutineSingletons) {
                                    paymentMainComponent7 = paymentMainComponent;
                                    str12 = str11;
                                    paymentStatusCTAActionType5 = PaymentStatusCTAActionType.FETCH_CHALO_WALLET;
                                    paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0 = null;
                                    paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$1 = null;
                                    paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.label = 18;
                                    if (paymentMainComponent7.k1(str12, (String) objB, paymentStatusCTAActionType5, paymentMainComponent$handleChaloPaymentOrderCreationFailure$1) == coroutineSingletons) {
                                        return unit;
                                    }
                                }
                            }
                            break;
                        case 11:
                            paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0 = paymentMainComponent;
                            paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.label = 19;
                            objB = stringProvider.b(StringEnum.CHALO_WALLET_BLOCKED, new Object[0], paymentMainComponent$handleChaloPaymentOrderCreationFailure$1);
                            if (objB != coroutineSingletons) {
                                str13 = (String) objB;
                                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0 = paymentMainComponent;
                                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$1 = str13;
                                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.label = 20;
                                objB = stringProvider.b(StringEnum.CHALO_WALLET_BLOCKED_ERROR, new Object[0], paymentMainComponent$handleChaloPaymentOrderCreationFailure$1);
                                if (objB != coroutineSingletons) {
                                    paymentMainComponent8 = paymentMainComponent;
                                    str14 = str13;
                                    paymentStatusCTAActionType6 = PaymentStatusCTAActionType.FETCH_CHALO_WALLET;
                                    paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0 = null;
                                    paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$1 = null;
                                    paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.label = 21;
                                    if (paymentMainComponent8.k1(str14, (String) objB, paymentStatusCTAActionType6, paymentMainComponent$handleChaloPaymentOrderCreationFailure$1) == coroutineSingletons) {
                                        return unit;
                                    }
                                }
                            }
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                } else {
                    if (!(operationFailureError instanceof OperationFailureError.DataFetchOperationFailure)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    switch (WhenMappings.k[((OperationFailureError.DataFetchOperationFailure) operationFailureError).f5998a.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                            paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0 = paymentMainComponent;
                            paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.label = 22;
                            objB = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], paymentMainComponent$handleChaloPaymentOrderCreationFailure$1);
                            if (objB != coroutineSingletons) {
                                str15 = (String) objB;
                                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0 = paymentMainComponent;
                                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$1 = str15;
                                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.label = 23;
                                objB = stringProvider.b(StringEnum.RETRY_PAYMENT_ERROR, new Object[0], paymentMainComponent$handleChaloPaymentOrderCreationFailure$1);
                                if (objB != coroutineSingletons) {
                                    paymentMainComponent9 = paymentMainComponent;
                                    str16 = str15;
                                    paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0 = null;
                                    paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$1 = null;
                                    paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.label = 24;
                                    if (paymentMainComponent9.k1(str16, (String) objB, PaymentStatusCTAActionType.STAY_ON_PAYMENT_SCREEN, paymentMainComponent$handleChaloPaymentOrderCreationFailure$1) == coroutineSingletons) {
                                        return unit;
                                    }
                                }
                            }
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
                return coroutineSingletons;
            case 1:
                paymentMainComponent = (PaymentMainComponent) paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0;
                ResultKt.b(objB);
                str = (String) objB;
                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0 = paymentMainComponent;
                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$1 = str;
                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.label = 2;
                objB = stringProvider.b(StringEnum.RETRY_PAYMENT_ERROR, new Object[0], paymentMainComponent$handleChaloPaymentOrderCreationFailure$1);
                if (objB != coroutineSingletons) {
                    paymentMainComponent2 = paymentMainComponent;
                    str2 = str;
                    paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0 = null;
                    paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$1 = null;
                    paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.label = 3;
                    if (paymentMainComponent2.k1(str2, (String) objB, PaymentStatusCTAActionType.STAY_ON_PAYMENT_SCREEN, paymentMainComponent$handleChaloPaymentOrderCreationFailure$1) == coroutineSingletons) {
                        return unit;
                    }
                }
                return coroutineSingletons;
            case 2:
                str2 = (String) paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$1;
                paymentMainComponent2 = (PaymentMainComponent) paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0;
                ResultKt.b(objB);
                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0 = null;
                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$1 = null;
                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.label = 3;
                if (paymentMainComponent2.k1(str2, (String) objB, PaymentStatusCTAActionType.STAY_ON_PAYMENT_SCREEN, paymentMainComponent$handleChaloPaymentOrderCreationFailure$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return unit;
            case 3:
                ResultKt.b(objB);
                return unit;
            case 4:
                paymentMainComponent = (PaymentMainComponent) paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0;
                ResultKt.b(objB);
                str3 = (String) objB;
                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0 = paymentMainComponent;
                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$1 = str3;
                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.label = 5;
                objB = stringProvider.b(StringEnum.COMPLETE_PAYMENT_AGAIN, new Object[0], paymentMainComponent$handleChaloPaymentOrderCreationFailure$1);
                if (objB != coroutineSingletons) {
                    paymentMainComponent3 = paymentMainComponent;
                    str4 = str3;
                    paymentStatusCTAActionType = PaymentStatusCTAActionType.EXIT_CHECKOUT_ACTIVITY;
                    paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0 = null;
                    paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$1 = null;
                    paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.label = 6;
                    if (paymentMainComponent3.k1(str4, (String) objB, paymentStatusCTAActionType, paymentMainComponent$handleChaloPaymentOrderCreationFailure$1) == coroutineSingletons) {
                        return unit;
                    }
                }
                return coroutineSingletons;
            case 5:
                str4 = (String) paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$1;
                paymentMainComponent3 = (PaymentMainComponent) paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0;
                ResultKt.b(objB);
                paymentStatusCTAActionType = PaymentStatusCTAActionType.EXIT_CHECKOUT_ACTIVITY;
                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0 = null;
                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$1 = null;
                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.label = 6;
                if (paymentMainComponent3.k1(str4, (String) objB, paymentStatusCTAActionType, paymentMainComponent$handleChaloPaymentOrderCreationFailure$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return unit;
            case 6:
                ResultKt.b(objB);
                return unit;
            case 7:
                paymentMainComponent = (PaymentMainComponent) paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0;
                ResultKt.b(objB);
                str5 = (String) objB;
                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0 = paymentMainComponent;
                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$1 = str5;
                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.label = 8;
                objB = stringProvider.b(StringEnum.RETRY_PAYMENT_ERROR, new Object[0], paymentMainComponent$handleChaloPaymentOrderCreationFailure$1);
                if (objB != coroutineSingletons) {
                    paymentMainComponent4 = paymentMainComponent;
                    str6 = str5;
                    paymentStatusCTAActionType2 = PaymentStatusCTAActionType.FETCH_CHALO_WALLET;
                    paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0 = null;
                    paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$1 = null;
                    paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.label = 9;
                    if (paymentMainComponent4.k1(str6, (String) objB, paymentStatusCTAActionType2, paymentMainComponent$handleChaloPaymentOrderCreationFailure$1) == coroutineSingletons) {
                        return unit;
                    }
                }
                return coroutineSingletons;
            case 8:
                str6 = (String) paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$1;
                paymentMainComponent4 = (PaymentMainComponent) paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0;
                ResultKt.b(objB);
                paymentStatusCTAActionType2 = PaymentStatusCTAActionType.FETCH_CHALO_WALLET;
                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0 = null;
                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$1 = null;
                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.label = 9;
                if (paymentMainComponent4.k1(str6, (String) objB, paymentStatusCTAActionType2, paymentMainComponent$handleChaloPaymentOrderCreationFailure$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return unit;
            case 9:
                ResultKt.b(objB);
                return unit;
            case 10:
                paymentMainComponent = (PaymentMainComponent) paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0;
                ResultKt.b(objB);
                str7 = (String) objB;
                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0 = paymentMainComponent;
                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$1 = str7;
                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.label = 11;
                objB = stringProvider.b(StringEnum.PAYMENT_FAILED_DUE_TO_INSUFFICIENT_BALANCE, new Object[0], paymentMainComponent$handleChaloPaymentOrderCreationFailure$1);
                if (objB != coroutineSingletons) {
                    paymentMainComponent5 = paymentMainComponent;
                    str8 = str7;
                    paymentStatusCTAActionType3 = PaymentStatusCTAActionType.FETCH_CHALO_WALLET;
                    paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0 = null;
                    paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$1 = null;
                    paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.label = 12;
                    if (paymentMainComponent5.k1(str8, (String) objB, paymentStatusCTAActionType3, paymentMainComponent$handleChaloPaymentOrderCreationFailure$1) == coroutineSingletons) {
                        return unit;
                    }
                }
                return coroutineSingletons;
            case 11:
                str8 = (String) paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$1;
                paymentMainComponent5 = (PaymentMainComponent) paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0;
                ResultKt.b(objB);
                paymentStatusCTAActionType3 = PaymentStatusCTAActionType.FETCH_CHALO_WALLET;
                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0 = null;
                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$1 = null;
                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.label = 12;
                if (paymentMainComponent5.k1(str8, (String) objB, paymentStatusCTAActionType3, paymentMainComponent$handleChaloPaymentOrderCreationFailure$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return unit;
            case 12:
                ResultKt.b(objB);
                return unit;
            case 13:
                paymentMainComponent = (PaymentMainComponent) paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0;
                ResultKt.b(objB);
                str9 = (String) objB;
                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0 = paymentMainComponent;
                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$1 = str9;
                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.label = 14;
                objB = stringProvider.b(StringEnum.RECLAIM_WALLET_ERROR, new Object[0], paymentMainComponent$handleChaloPaymentOrderCreationFailure$1);
                if (objB != coroutineSingletons) {
                    paymentMainComponent6 = paymentMainComponent;
                    str10 = str9;
                    paymentStatusCTAActionType4 = PaymentStatusCTAActionType.FETCH_CHALO_WALLET;
                    paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0 = null;
                    paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$1 = null;
                    paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.label = 15;
                    if (paymentMainComponent6.k1(str10, (String) objB, paymentStatusCTAActionType4, paymentMainComponent$handleChaloPaymentOrderCreationFailure$1) == coroutineSingletons) {
                        return unit;
                    }
                }
                return coroutineSingletons;
            case 14:
                str10 = (String) paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$1;
                paymentMainComponent6 = (PaymentMainComponent) paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0;
                ResultKt.b(objB);
                paymentStatusCTAActionType4 = PaymentStatusCTAActionType.FETCH_CHALO_WALLET;
                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0 = null;
                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$1 = null;
                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.label = 15;
                if (paymentMainComponent6.k1(str10, (String) objB, paymentStatusCTAActionType4, paymentMainComponent$handleChaloPaymentOrderCreationFailure$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return unit;
            case 15:
                ResultKt.b(objB);
                return unit;
            case 16:
                paymentMainComponent = (PaymentMainComponent) paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0;
                ResultKt.b(objB);
                str11 = (String) objB;
                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0 = paymentMainComponent;
                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$1 = str11;
                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.label = 17;
                objB = stringProvider.b(StringEnum.CHALO_WALLET_INACTIVE_ERROR, new Object[0], paymentMainComponent$handleChaloPaymentOrderCreationFailure$1);
                if (objB != coroutineSingletons) {
                    paymentMainComponent7 = paymentMainComponent;
                    str12 = str11;
                    paymentStatusCTAActionType5 = PaymentStatusCTAActionType.FETCH_CHALO_WALLET;
                    paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0 = null;
                    paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$1 = null;
                    paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.label = 18;
                    if (paymentMainComponent7.k1(str12, (String) objB, paymentStatusCTAActionType5, paymentMainComponent$handleChaloPaymentOrderCreationFailure$1) == coroutineSingletons) {
                        return unit;
                    }
                }
                return coroutineSingletons;
            case 17:
                str12 = (String) paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$1;
                paymentMainComponent7 = (PaymentMainComponent) paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0;
                ResultKt.b(objB);
                paymentStatusCTAActionType5 = PaymentStatusCTAActionType.FETCH_CHALO_WALLET;
                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0 = null;
                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$1 = null;
                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.label = 18;
                if (paymentMainComponent7.k1(str12, (String) objB, paymentStatusCTAActionType5, paymentMainComponent$handleChaloPaymentOrderCreationFailure$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return unit;
            case 18:
                ResultKt.b(objB);
                return unit;
            case 19:
                paymentMainComponent = (PaymentMainComponent) paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0;
                ResultKt.b(objB);
                str13 = (String) objB;
                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0 = paymentMainComponent;
                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$1 = str13;
                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.label = 20;
                objB = stringProvider.b(StringEnum.CHALO_WALLET_BLOCKED_ERROR, new Object[0], paymentMainComponent$handleChaloPaymentOrderCreationFailure$1);
                if (objB != coroutineSingletons) {
                    paymentMainComponent8 = paymentMainComponent;
                    str14 = str13;
                    paymentStatusCTAActionType6 = PaymentStatusCTAActionType.FETCH_CHALO_WALLET;
                    paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0 = null;
                    paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$1 = null;
                    paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.label = 21;
                    if (paymentMainComponent8.k1(str14, (String) objB, paymentStatusCTAActionType6, paymentMainComponent$handleChaloPaymentOrderCreationFailure$1) == coroutineSingletons) {
                        return unit;
                    }
                }
                return coroutineSingletons;
            case 20:
                str14 = (String) paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$1;
                paymentMainComponent8 = (PaymentMainComponent) paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0;
                ResultKt.b(objB);
                paymentStatusCTAActionType6 = PaymentStatusCTAActionType.FETCH_CHALO_WALLET;
                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0 = null;
                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$1 = null;
                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.label = 21;
                if (paymentMainComponent8.k1(str14, (String) objB, paymentStatusCTAActionType6, paymentMainComponent$handleChaloPaymentOrderCreationFailure$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return unit;
            case 21:
                ResultKt.b(objB);
                return unit;
            case 22:
                paymentMainComponent = (PaymentMainComponent) paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0;
                ResultKt.b(objB);
                str15 = (String) objB;
                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0 = paymentMainComponent;
                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$1 = str15;
                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.label = 23;
                objB = stringProvider.b(StringEnum.RETRY_PAYMENT_ERROR, new Object[0], paymentMainComponent$handleChaloPaymentOrderCreationFailure$1);
                if (objB != coroutineSingletons) {
                    paymentMainComponent9 = paymentMainComponent;
                    str16 = str15;
                    paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0 = null;
                    paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$1 = null;
                    paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.label = 24;
                    if (paymentMainComponent9.k1(str16, (String) objB, PaymentStatusCTAActionType.STAY_ON_PAYMENT_SCREEN, paymentMainComponent$handleChaloPaymentOrderCreationFailure$1) == coroutineSingletons) {
                        return unit;
                    }
                }
                return coroutineSingletons;
            case 23:
                str16 = (String) paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$1;
                paymentMainComponent9 = (PaymentMainComponent) paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0;
                ResultKt.b(objB);
                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$0 = null;
                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.L$1 = null;
                paymentMainComponent$handleChaloPaymentOrderCreationFailure$1.label = 24;
                if (paymentMainComponent9.k1(str16, (String) objB, PaymentStatusCTAActionType.STAY_ON_PAYMENT_SCREEN, paymentMainComponent$handleChaloPaymentOrderCreationFailure$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return unit;
            case 24:
                ResultKt.b(objB);
                return unit;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object K0(PaymentMainComponent paymentMainComponent, ContinuationImpl continuationImpl) {
        PaymentMainComponent$isPhoneAndSmsPermissionGranted$1 paymentMainComponent$isPhoneAndSmsPermissionGranted$1;
        paymentMainComponent.getClass();
        if (continuationImpl instanceof PaymentMainComponent$isPhoneAndSmsPermissionGranted$1) {
            paymentMainComponent$isPhoneAndSmsPermissionGranted$1 = (PaymentMainComponent$isPhoneAndSmsPermissionGranted$1) continuationImpl;
            int i = paymentMainComponent$isPhoneAndSmsPermissionGranted$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                paymentMainComponent$isPhoneAndSmsPermissionGranted$1.label = i - Integer.MIN_VALUE;
            } else {
                paymentMainComponent$isPhoneAndSmsPermissionGranted$1 = new PaymentMainComponent$isPhoneAndSmsPermissionGranted$1(paymentMainComponent, continuationImpl);
            }
        } else {
            paymentMainComponent$isPhoneAndSmsPermissionGranted$1 = new PaymentMainComponent$isPhoneAndSmsPermissionGranted$1(paymentMainComponent, continuationImpl);
        }
        Object objA = paymentMainComponent$isPhoneAndSmsPermissionGranted$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = paymentMainComponent$isPhoneAndSmsPermissionGranted$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            AppPermission.INSTANCE.getClass();
            List listA = AppPermission.Companion.a();
            ArePermissionsGrantedUseCase arePermissionsGrantedUseCase = paymentMainComponent.P;
            AppPermission[] appPermissionArr = (AppPermission[]) listA.toArray(new AppPermission[0]);
            AppPermission[] appPermissionArr2 = (AppPermission[]) Arrays.copyOf(appPermissionArr, appPermissionArr.length);
            paymentMainComponent$isPhoneAndSmsPermissionGranted$1.label = 1;
            arePermissionsGrantedUseCase.getClass();
            objA = arePermissionsGrantedUseCase.a(ArraysKt.h0(appPermissionArr2), paymentMainComponent$isPhoneAndSmsPermissionGranted$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        return Boolean.valueOf(((AppPermissionRequest) objA).b.isEmpty());
    }

    public static final void L0(PaymentMainComponent paymentMainComponent) {
        switch (WhenMappings.e[paymentMainComponent.m.getC().d.f5657a.ordinal()]) {
            case 1:
                paymentMainComponent.q0(new iq0(paymentMainComponent, 13));
                return;
            case 2:
                paymentMainComponent.q0(new iq0(paymentMainComponent, 14));
                return;
            case 3:
                paymentMainComponent.q0(new iq0(paymentMainComponent, 15));
                return;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final CoroutineSingletons M0(final PaymentMainComponent paymentMainComponent, JuspayController juspayController, ContinuationImpl continuationImpl) {
        PaymentMainComponent$observeUpiSessionState$1 paymentMainComponent$observeUpiSessionState$1;
        paymentMainComponent.getClass();
        if (continuationImpl instanceof PaymentMainComponent$observeUpiSessionState$1) {
            paymentMainComponent$observeUpiSessionState$1 = (PaymentMainComponent$observeUpiSessionState$1) continuationImpl;
            int i = paymentMainComponent$observeUpiSessionState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                paymentMainComponent$observeUpiSessionState$1.label = i - Integer.MIN_VALUE;
            } else {
                paymentMainComponent$observeUpiSessionState$1 = new PaymentMainComponent$observeUpiSessionState$1(paymentMainComponent, continuationImpl);
            }
        } else {
            paymentMainComponent$observeUpiSessionState$1 = new PaymentMainComponent$observeUpiSessionState$1(paymentMainComponent, continuationImpl);
        }
        Object obj = paymentMainComponent$observeUpiSessionState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = paymentMainComponent$observeUpiSessionState$1.label;
        if (i2 == 0) {
            final Ref.ObjectRef objectRefV = uf0.v(obj);
            StateFlow g = juspayController.getG();
            FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.checkout.ui.screen.payment.PaymentMainComponent$observeUpiSessionState$2
                /* JADX WARN: Code duplicated, block: B:52:0x0143  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    Object objV1;
                    T t = (T) ((JuspayState) obj2).b;
                    Ref.ObjectRef objectRef = objectRefV;
                    boolean zD = Intrinsics.d(t, objectRef.element);
                    Unit unit = Unit.f17538a;
                    if (!zD) {
                        objectRef.element = t;
                        PaymentMainComponent paymentMainComponent2 = paymentMainComponent;
                        paymentMainComponent2.getClass();
                        if (Intrinsics.d(t, JuspayUpiSessionState.Unknown.f4083a) || Intrinsics.d(t, JuspayUpiSessionState.Fetching.f4081a)) {
                            objV1 = unit;
                        } else if (t instanceof JuspayUpiSessionState.Available) {
                            JusPayResultDataType.UpiSessionToken upiSessionToken = ((JuspayUpiSessionState.Available) t).f4079a;
                            JusPayUpiSessionStatus jusPayUpiSessionStatus = upiSessionToken.b;
                            paymentMainComponent2.E0(new va(false, 11));
                            ICheckoutAnalyticsHelper iCheckoutAnalyticsHelper = paymentMainComponent2.t;
                            Pair pair = new Pair("pass status", jusPayUpiSessionStatus.name());
                            List list = upiSessionToken.g;
                            ICheckoutAnalyticsHelper.DefaultImpls.a(iCheckoutAnalyticsHelper, "juspay sdk upi session token received", MapsKt.i(pair, new Pair("juspayNoOfAccountsLinked", new Integer(list.size())), new Pair("juspayLinkedAccountNames", CollectionsKt.O(list, ",", null, null, new jq0(24), 30))), 12);
                            boolean z = paymentMainComponent2.b0;
                            paymentMainComponent2.b0 = false;
                            int i3 = PaymentMainComponent.WhenMappings.c[jusPayUpiSessionStatus.ordinal()];
                            if (i3 == 1 || i3 == 2 || i3 == 3) {
                                if (z) {
                                    paymentMainComponent2.E0(new jq0(11));
                                    paymentMainComponent2.r1(null);
                                } else {
                                    objV1 = paymentMainComponent2.v1(continuation);
                                    if (objV1 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    }
                                }
                                objV1 = unit;
                            } else {
                                if (i3 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (list.isEmpty() ? (objV1 = paymentMainComponent2.v1(continuation)) != CoroutineSingletons.COROUTINE_SUSPENDED : (objV1 = paymentMainComponent2.x1(list, continuation)) != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    objV1 = unit;
                                }
                            }
                            if (objV1 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                objV1 = unit;
                            }
                        } else if (t instanceof JuspayUpiSessionState.Unavailable) {
                            paymentMainComponent2.b0 = false;
                            paymentMainComponent2.E0(new va(false, 11));
                            if (PaymentMainContractKt.b(((PaymentDataState) paymentMainComponent2.f.getValue()).l) || (objV1 = paymentMainComponent2.w1("session unavailable", ((JuspayUpiSessionState.Unavailable) t).f4082a, continuation)) != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                objV1 = unit;
                            }
                        } else if (Intrinsics.d(t, JuspayUpiSessionState.Expired.f4080a)) {
                            objV1 = unit;
                        } else {
                            if (!Intrinsics.d(t, JuspayUpiSessionState.Abandoned.f4078a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            paymentMainComponent2.E0(new va(false, 11));
                            objV1 = paymentMainComponent2.v1(continuation);
                            if (objV1 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                objV1 = unit;
                            }
                        }
                        if (objV1 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                            return objV1;
                        }
                    }
                    return unit;
                }
            };
            paymentMainComponent$observeUpiSessionState$1.label = 1;
            if (g.collect(flowCollector, paymentMainComponent$observeUpiSessionState$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static final Object N0(PaymentMainComponent paymentMainComponent, String str, WalletTypeIdentifier walletTypeIdentifier, ContinuationImpl continuationImpl) {
        PaymentMainComponent$proceedWithChaloPayment$1 paymentMainComponent$proceedWithChaloPayment$1;
        WalletTypeIdentifier walletTypeIdentifier2;
        CheckoutPaymentDataResolver checkoutPaymentDataResolver = paymentMainComponent.m;
        ICheckoutAnalyticsHelper iCheckoutAnalyticsHelper = paymentMainComponent.t;
        if (continuationImpl instanceof PaymentMainComponent$proceedWithChaloPayment$1) {
            paymentMainComponent$proceedWithChaloPayment$1 = (PaymentMainComponent$proceedWithChaloPayment$1) continuationImpl;
            int i = paymentMainComponent$proceedWithChaloPayment$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                paymentMainComponent$proceedWithChaloPayment$1.label = i - Integer.MIN_VALUE;
            } else {
                paymentMainComponent$proceedWithChaloPayment$1 = new PaymentMainComponent$proceedWithChaloPayment$1(paymentMainComponent, continuationImpl);
            }
        } else {
            paymentMainComponent$proceedWithChaloPayment$1 = new PaymentMainComponent$proceedWithChaloPayment$1(paymentMainComponent, continuationImpl);
        }
        PaymentMainComponent$proceedWithChaloPayment$1 paymentMainComponent$proceedWithChaloPayment$2 = paymentMainComponent$proceedWithChaloPayment$1;
        Object objB = paymentMainComponent$proceedWithChaloPayment$2.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = paymentMainComponent$proceedWithChaloPayment$2.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objB);
            CheckoutPaymentData checkoutPaymentDataU = checkoutPaymentDataResolver.getC();
            MakeChaloWalletPaymentUseCase makeChaloWalletPaymentUseCase = paymentMainComponent.C;
            CheckoutOrderData checkoutOrderData = checkoutPaymentDataU.f2691a;
            String str2 = checkoutOrderData.b;
            int i3 = Integer.parseInt(checkoutOrderData.c);
            paymentMainComponent$proceedWithChaloPayment$2.L$0 = walletTypeIdentifier;
            paymentMainComponent$proceedWithChaloPayment$2.label = 1;
            objB = makeChaloWalletPaymentUseCase.b(str2, str, i3, walletTypeIdentifier, paymentMainComponent$proceedWithChaloPayment$2);
            if (objB != obj) {
                walletTypeIdentifier2 = walletTypeIdentifier;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
            return unit;
        }
        walletTypeIdentifier2 = (WalletTypeIdentifier) paymentMainComponent$proceedWithChaloPayment$2.L$0;
        ResultKt.b(objB);
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objB;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            paymentMainComponent.E0(new jq0(8));
            iCheckoutAnalyticsHelper.h("chaloPayPaymentSuccess", null, walletTypeIdentifier2.f10959a == WalletType.CLOSED);
            checkoutPaymentDataResolver.U(((ChaloPayPaymentResponseAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).f1275a);
            return unit;
        }
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
            throw new NoWhenBranchMatchedException();
        }
        UseCaseOperationError useCaseOperationError = (UseCaseOperationError) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
        String str3 = useCaseOperationError.c;
        if (str3 == null) {
            str3 = "";
        }
        iCheckoutAnalyticsHelper.h("chaloPayPaymentFailed", vo1.s("failureReason", str3), walletTypeIdentifier2.f10959a == WalletType.CLOSED);
        paymentMainComponent$proceedWithChaloPayment$2.L$0 = null;
        paymentMainComponent$proceedWithChaloPayment$2.label = 2;
        return paymentMainComponent.j1(useCaseOperationError, paymentMainComponent$proceedWithChaloPayment$2) == obj ? obj : unit;
    }

    public static final void O0(PaymentMainComponent paymentMainComponent, CheckoutPaymentItem.IndividualCheckoutItem.InAppUpiItem inAppUpiItem, String str) {
        ICheckoutAnalyticsHelper.DefaultImpls.a(paymentMainComponent.t, "juspay action initiated", MapsKt.i(new Pair("action", "OnBoardingAndPay"), new Pair("paymentMethodOption", inAppUpiItem.getF1342a().b), new Pair(PaymentConstants.AMOUNT, paymentMainComponent.m.getC().f2691a.c), new Pair("referenceId", String.valueOf(str))), 12);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x011e  */
    /* JADX WARN: Code duplicated, block: B:28:0x012c  */
    /* JADX WARN: Code duplicated, block: B:32:0x013f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0149  */
    /* JADX WARN: Code duplicated, block: B:38:0x015e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0163  */
    /* JADX WARN: Code duplicated, block: B:42:0x0173  */
    /* JADX WARN: Code duplicated, block: B:44:0x017a  */
    /* JADX WARN: Code duplicated, block: B:48:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:51:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:52:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:59:0x0279  */
    /* JADX WARN: Code duplicated, block: B:63:0x0299  */
    /* JADX WARN: Code duplicated, block: B:68:0x02c8 A[LOOP:1: B:67:0x02c6->B:68:0x02c8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:75:0x02b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0293 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v16, types: [app.chalo.checkout.analytics.ICheckoutAnalyticsHelper] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [int] */
    /* JADX WARN: Type inference failed for: r27v0, types: [app.chalo.checkout.ui.screen.payment.PaymentMainComponent, app.chalo.mvibase.simple.ChaloBaseStateMviComponent] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.Map, kotlin.coroutines.Continuation, kotlin.coroutines.CoroutineContext, kotlinx.coroutines.CoroutineStart] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v3 */
    public static final Object P0(PaymentMainComponent paymentMainComponent, ContinuationImpl continuationImpl) {
        PaymentMainComponent$setValidPaymentMethodsAndPreferredModes$1 paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1;
        List list;
        ArrayList arrayList;
        Object objS0;
        List list2;
        Object obj;
        List list3;
        Object objR0;
        Object obj2;
        CommonCheckoutItemUseCase commonCheckoutItemUseCase;
        Boolean bool;
        ?? BooleanValue;
        Long l;
        long jLongValue;
        long j;
        WalletStatusForUI walletStatusForUI;
        GetPreferredMethodsCheckoutItemHelper getPreferredMethodsCheckoutItemHelper;
        Object objD;
        CheckoutPaymentDataResolver checkoutPaymentDataResolver;
        List list4;
        List list5;
        CommonCheckoutItemUseCase commonCheckoutItemUseCase2;
        ?? r5;
        GetPreferredMethodsCheckoutItemHelper getPreferredMethodsCheckoutItemHelper2;
        StringProvider stringProvider;
        long j2;
        WalletStatusForUI walletStatusForUI2;
        CurrencyFeature currencyFeature;
        boolean z;
        CoroutineSingletons coroutineSingletons;
        int i;
        int i2;
        Object objC;
        PaymentMainComponent$setValidPaymentMethodsAndPreferredModes$1 paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2;
        List list6;
        ICheckoutAnalyticsHelper iCheckoutAnalyticsHelper;
        Object objB;
        List paymentMethods;
        List list7;
        ICheckoutAnalyticsHelper iCheckoutAnalyticsHelper2;
        String str;
        PaymentMethodsCheckoutItemsUseCase paymentMethodsCheckoutItemsUseCase;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int size;
        int i3;
        ?? r3;
        Object objY0;
        String d;
        ?? r11;
        StringProvider stringProvider2 = paymentMainComponent.A;
        ICheckoutAnalyticsHelper iCheckoutAnalyticsHelper3 = paymentMainComponent.t;
        CurrencyFeature currencyFeature2 = paymentMainComponent.u;
        ChaloPayManager chaloPayManager = paymentMainComponent.x;
        CheckoutPaymentDataResolver checkoutPaymentDataResolver2 = paymentMainComponent.m;
        if (continuationImpl instanceof PaymentMainComponent$setValidPaymentMethodsAndPreferredModes$1) {
            paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1 = (PaymentMainComponent$setValidPaymentMethodsAndPreferredModes$1) continuationImpl;
            int i4 = paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.label = i4 - Integer.MIN_VALUE;
            } else {
                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1 = new PaymentMainComponent$setValidPaymentMethodsAndPreferredModes$1(paymentMainComponent, continuationImpl);
            }
        } else {
            paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1 = new PaymentMainComponent$setValidPaymentMethodsAndPreferredModes$1(paymentMainComponent, continuationImpl);
        }
        Object objA = paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.label) {
            case 0:
                ResultKt.b(objA);
                FilterValidPaymentMethodsUseCase filterValidPaymentMethodsUseCase = paymentMainComponent.p;
                boolean zA0 = paymentMainComponent.l.a0();
                List list8 = checkoutPaymentDataResolver2.H().b;
                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.label = 1;
                objA = filterValidPaymentMethodsUseCase.a(list8, paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1, zA0);
                if (objA != coroutineSingletons2) {
                    list = (List) objA;
                    arrayList = new ArrayList();
                    paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$0 = list;
                    paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$1 = arrayList;
                    paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.label = 2;
                    objS0 = paymentMainComponent.S0(paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1);
                    if (objS0 != coroutineSingletons2) {
                        list2 = arrayList;
                        obj = objS0;
                        list3 = list;
                        if (((Boolean) obj).booleanValue()) {
                            list2.add(CheckoutPaymentMethod.ChaloPay.INSTANCE);
                        }
                        paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$0 = list3;
                        paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$1 = list2;
                        paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.label = 3;
                        objR0 = paymentMainComponent.R0(paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1);
                        if (objR0 != coroutineSingletons2) {
                            obj2 = objR0;
                            if (((Boolean) obj2).booleanValue()) {
                                list2.add(CheckoutPaymentMethod.ClosedLoopWallet.INSTANCE);
                            }
                            commonCheckoutItemUseCase = paymentMainComponent.w;
                            bool = ((ChaloPayWalletState) chaloPayManager.d().getValue()).c;
                            if (bool != null) {
                                BooleanValue = bool.booleanValue();
                            } else {
                                BooleanValue = 0;
                            }
                            l = ((ChaloPayWalletState) chaloPayManager.d().getValue()).f;
                            if (l != null) {
                                jLongValue = l.longValue();
                            } else {
                                jLongValue = 0;
                            }
                            j = jLongValue;
                            walletStatusForUI = ((ChaloPayWalletState) chaloPayManager.d().getValue()).g;
                            WalletRepository walletRepository = paymentMainComponent.D;
                            UserProfileDetailsProvider userProfileDetailsProvider = paymentMainComponent.z;
                            WalletTypeIdentifier walletTypeIdentifier = ((ChaloPayWalletState) chaloPayManager.d().getValue()).i;
                            paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$0 = list3;
                            paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$1 = list2;
                            paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$2 = walletStatusForUI;
                            getPreferredMethodsCheckoutItemHelper = GetPreferredMethodsCheckoutItemHelper.f1391a;
                            paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$3 = getPreferredMethodsCheckoutItemHelper;
                            paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$4 = checkoutPaymentDataResolver2;
                            paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$5 = commonCheckoutItemUseCase;
                            paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$6 = stringProvider2;
                            paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$7 = currencyFeature2;
                            paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.I$0 = BooleanValue;
                            paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.J$0 = j;
                            paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.label = 4;
                            objD = ChaloPayCheckoutItemHelper.f1384a.d(walletRepository, userProfileDetailsProvider, walletTypeIdentifier, paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1);
                            if (objD != coroutineSingletons2) {
                                checkoutPaymentDataResolver = checkoutPaymentDataResolver2;
                                list4 = list2;
                                list5 = list3;
                                commonCheckoutItemUseCase2 = commonCheckoutItemUseCase;
                                r5 = BooleanValue;
                                getPreferredMethodsCheckoutItemHelper2 = getPreferredMethodsCheckoutItemHelper;
                                stringProvider = stringProvider2;
                                j2 = j;
                                walletStatusForUI2 = walletStatusForUI;
                                currencyFeature = currencyFeature2;
                                boolean zBooleanValue = ((Boolean) objD).booleanValue();
                                if (r5 != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                ChaloPayCheckoutItemHelper.ChaloPayItemMetaData chaloPayItemMetaData = new ChaloPayCheckoutItemHelper.ChaloPayItemMetaData(walletStatusForUI2, j2, zBooleanValue, z);
                                ICheckoutAnalyticsHelper iCheckoutAnalyticsHelper4 = paymentMainComponent.t;
                                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$0 = list5;
                                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$1 = list4;
                                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$2 = null;
                                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$3 = null;
                                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$4 = null;
                                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$5 = null;
                                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$6 = null;
                                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$7 = null;
                                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.label = 5;
                                PaymentMainComponent$setValidPaymentMethodsAndPreferredModes$1 paymentMainComponent$setValidPaymentMethodsAndPreferredModes$3 = paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1;
                                coroutineSingletons = coroutineSingletons2;
                                i = 1;
                                i2 = 2;
                                objC = getPreferredMethodsCheckoutItemHelper2.c(checkoutPaymentDataResolver, commonCheckoutItemUseCase2, stringProvider, currencyFeature, chaloPayItemMetaData, iCheckoutAnalyticsHelper4, list4, paymentMainComponent$setValidPaymentMethodsAndPreferredModes$3);
                                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2 = paymentMainComponent$setValidPaymentMethodsAndPreferredModes$3;
                                if (objC == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                list6 = (List) objC;
                                Pair pair = new Pair("validPaymentMethodsCount", new Integer(list5.size()));
                                Pair pair2 = new Pair("preferredModeCount", new Integer(list6.size()));
                                Pair[] pairArr = new Pair[i2];
                                pairArr[0] = pair;
                                pairArr[i] = pair2;
                                iCheckoutAnalyticsHelper = iCheckoutAnalyticsHelper3;
                                iCheckoutAnalyticsHelper.b("valid payment methods created", MapsKt.i(pairArr));
                                StringEnum stringEnum = StringEnum.PAY_PREFIX;
                                Object[] objArr = new Object[i];
                                objArr[0] = currencyFeature2.a(Long.parseLong(checkoutPaymentDataResolver2.getC().f2691a.c), CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2.L$0 = list5;
                                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2.L$1 = list4;
                                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2.L$2 = list6;
                                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2.label = 6;
                                objB = stringProvider2.b(stringEnum, objArr, paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2);
                                if (objB == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                paymentMethods = list5;
                                list7 = list6;
                                iCheckoutAnalyticsHelper2 = iCheckoutAnalyticsHelper;
                                str = (String) objB;
                                paymentMethodsCheckoutItemsUseCase = paymentMainComponent.o;
                                paymentMethodsCheckoutItemsUseCase.getClass();
                                Intrinsics.i(paymentMethods, "paymentMethods");
                                arrayList2 = new ArrayList();
                                for (Object obj3 : paymentMethods) {
                                    d = ((PaymentMethodOptionsAppModel) obj3).getD();
                                    CheckoutPaymentMethod.ChaloPay.INSTANCE.getClass();
                                    if (!Intrinsics.d(d, "chalopay")) {
                                        arrayList2.add(obj3);
                                    }
                                }
                                arrayList3 = new ArrayList(CollectionsKt.v(arrayList2, 10));
                                size = arrayList2.size();
                                i3 = 0;
                                while (i3 < size) {
                                    Object obj4 = arrayList2.get(i3);
                                    i3++;
                                    PaymentMethodOptionsAppModel paymentMethodOptionsAppModel = (PaymentMethodOptionsAppModel) obj4;
                                    arrayList3.add(new CheckoutPaymentItem.PaymentMethodItem(paymentMethodsCheckoutItemsUseCase.f1392a.d(paymentMethodOptionsAppModel), paymentMethodOptionsAppModel));
                                }
                                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2.L$0 = list7;
                                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2.L$1 = str;
                                r3 = 0;
                                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2.L$2 = null;
                                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2.label = 7;
                                objY0 = paymentMainComponent.Y0(list7, arrayList3, list4, paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2);
                                if (objY0 == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                objA = objY0;
                                r11 = iCheckoutAnalyticsHelper2;
                                paymentMainComponent.E0(new fo(5, str, (List) objA));
                                r11.c(r3, ((PaymentInfoState) checkoutPaymentDataResolver2.getF().getValue()).f1361a.c.size(), list7.size());
                                BuildersKt.d(paymentMainComponent.j, r3, r3, new PaymentMainComponent$initiateInAppUpiFlowIfApplicable$1(paymentMainComponent, r3), 3);
                                paymentMainComponent.D0(new PaymentMainComponent$initPaymentInfoStateCollection$1(paymentMainComponent, r3));
                                return Unit.f17538a;
                            }
                        }
                    }
                }
                return coroutineSingletons2;
            case 1:
                ResultKt.b(objA);
                list = (List) objA;
                arrayList = new ArrayList();
                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$0 = list;
                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$1 = arrayList;
                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.label = 2;
                objS0 = paymentMainComponent.S0(paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1);
                if (objS0 != coroutineSingletons2) {
                    list2 = arrayList;
                    obj = objS0;
                    list3 = list;
                    if (((Boolean) obj).booleanValue()) {
                        list2.add(CheckoutPaymentMethod.ChaloPay.INSTANCE);
                    }
                    paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$0 = list3;
                    paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$1 = list2;
                    paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.label = 3;
                    objR0 = paymentMainComponent.R0(paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1);
                    if (objR0 != coroutineSingletons2) {
                        obj2 = objR0;
                        if (((Boolean) obj2).booleanValue()) {
                            list2.add(CheckoutPaymentMethod.ClosedLoopWallet.INSTANCE);
                        }
                        commonCheckoutItemUseCase = paymentMainComponent.w;
                        bool = ((ChaloPayWalletState) chaloPayManager.d().getValue()).c;
                        if (bool != null) {
                            BooleanValue = bool.booleanValue();
                        } else {
                            BooleanValue = 0;
                        }
                        l = ((ChaloPayWalletState) chaloPayManager.d().getValue()).f;
                        if (l != null) {
                            jLongValue = l.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        j = jLongValue;
                        walletStatusForUI = ((ChaloPayWalletState) chaloPayManager.d().getValue()).g;
                        WalletRepository walletRepository2 = paymentMainComponent.D;
                        UserProfileDetailsProvider userProfileDetailsProvider2 = paymentMainComponent.z;
                        WalletTypeIdentifier walletTypeIdentifier2 = ((ChaloPayWalletState) chaloPayManager.d().getValue()).i;
                        paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$0 = list3;
                        paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$1 = list2;
                        paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$2 = walletStatusForUI;
                        getPreferredMethodsCheckoutItemHelper = GetPreferredMethodsCheckoutItemHelper.f1391a;
                        paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$3 = getPreferredMethodsCheckoutItemHelper;
                        paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$4 = checkoutPaymentDataResolver2;
                        paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$5 = commonCheckoutItemUseCase;
                        paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$6 = stringProvider2;
                        paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$7 = currencyFeature2;
                        paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.I$0 = BooleanValue;
                        paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.J$0 = j;
                        paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.label = 4;
                        objD = ChaloPayCheckoutItemHelper.f1384a.d(walletRepository2, userProfileDetailsProvider2, walletTypeIdentifier2, paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1);
                        if (objD != coroutineSingletons2) {
                            checkoutPaymentDataResolver = checkoutPaymentDataResolver2;
                            list4 = list2;
                            list5 = list3;
                            commonCheckoutItemUseCase2 = commonCheckoutItemUseCase;
                            r5 = BooleanValue;
                            getPreferredMethodsCheckoutItemHelper2 = getPreferredMethodsCheckoutItemHelper;
                            stringProvider = stringProvider2;
                            j2 = j;
                            walletStatusForUI2 = walletStatusForUI;
                            currencyFeature = currencyFeature2;
                            boolean zBooleanValue2 = ((Boolean) objD).booleanValue();
                            if (r5 != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            ChaloPayCheckoutItemHelper.ChaloPayItemMetaData chaloPayItemMetaData2 = new ChaloPayCheckoutItemHelper.ChaloPayItemMetaData(walletStatusForUI2, j2, zBooleanValue2, z);
                            ICheckoutAnalyticsHelper iCheckoutAnalyticsHelper5 = paymentMainComponent.t;
                            paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$0 = list5;
                            paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$1 = list4;
                            paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$2 = null;
                            paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$3 = null;
                            paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$4 = null;
                            paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$5 = null;
                            paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$6 = null;
                            paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$7 = null;
                            paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.label = 5;
                            PaymentMainComponent$setValidPaymentMethodsAndPreferredModes$1 paymentMainComponent$setValidPaymentMethodsAndPreferredModes$4 = paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1;
                            coroutineSingletons = coroutineSingletons2;
                            i = 1;
                            i2 = 2;
                            objC = getPreferredMethodsCheckoutItemHelper2.c(checkoutPaymentDataResolver, commonCheckoutItemUseCase2, stringProvider, currencyFeature, chaloPayItemMetaData2, iCheckoutAnalyticsHelper5, list4, paymentMainComponent$setValidPaymentMethodsAndPreferredModes$4);
                            paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2 = paymentMainComponent$setValidPaymentMethodsAndPreferredModes$4;
                            if (objC == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            list6 = (List) objC;
                            Pair pair3 = new Pair("validPaymentMethodsCount", new Integer(list5.size()));
                            Pair pair4 = new Pair("preferredModeCount", new Integer(list6.size()));
                            Pair[] pairArr2 = new Pair[i2];
                            pairArr2[0] = pair3;
                            pairArr2[i] = pair4;
                            iCheckoutAnalyticsHelper = iCheckoutAnalyticsHelper3;
                            iCheckoutAnalyticsHelper.b("valid payment methods created", MapsKt.i(pairArr2));
                            StringEnum stringEnum2 = StringEnum.PAY_PREFIX;
                            Object[] objArr2 = new Object[i];
                            objArr2[0] = currencyFeature2.a(Long.parseLong(checkoutPaymentDataResolver2.getC().f2691a.c), CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                            paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2.L$0 = list5;
                            paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2.L$1 = list4;
                            paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2.L$2 = list6;
                            paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2.label = 6;
                            objB = stringProvider2.b(stringEnum2, objArr2, paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2);
                            if (objB == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            paymentMethods = list5;
                            list7 = list6;
                            iCheckoutAnalyticsHelper2 = iCheckoutAnalyticsHelper;
                            str = (String) objB;
                            paymentMethodsCheckoutItemsUseCase = paymentMainComponent.o;
                            paymentMethodsCheckoutItemsUseCase.getClass();
                            Intrinsics.i(paymentMethods, "paymentMethods");
                            arrayList2 = new ArrayList();
                            while (r5.hasNext()) {
                                d = ((PaymentMethodOptionsAppModel) obj3).getD();
                                CheckoutPaymentMethod.ChaloPay.INSTANCE.getClass();
                                if (!Intrinsics.d(d, "chalopay")) {
                                    arrayList2.add(obj3);
                                }
                            }
                            arrayList3 = new ArrayList(CollectionsKt.v(arrayList2, 10));
                            size = arrayList2.size();
                            i3 = 0;
                            while (i3 < size) {
                                Object obj5 = arrayList2.get(i3);
                                i3++;
                                PaymentMethodOptionsAppModel paymentMethodOptionsAppModel2 = (PaymentMethodOptionsAppModel) obj5;
                                arrayList3.add(new CheckoutPaymentItem.PaymentMethodItem(paymentMethodsCheckoutItemsUseCase.f1392a.d(paymentMethodOptionsAppModel2), paymentMethodOptionsAppModel2));
                            }
                            paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2.L$0 = list7;
                            paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2.L$1 = str;
                            r3 = 0;
                            paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2.L$2 = null;
                            paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2.label = 7;
                            objY0 = paymentMainComponent.Y0(list7, arrayList3, list4, paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2);
                            if (objY0 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            objA = objY0;
                            r11 = iCheckoutAnalyticsHelper2;
                            paymentMainComponent.E0(new fo(5, str, (List) objA));
                            r11.c(r3, ((PaymentInfoState) checkoutPaymentDataResolver2.getF().getValue()).f1361a.c.size(), list7.size());
                            BuildersKt.d(paymentMainComponent.j, r3, r3, new PaymentMainComponent$initiateInAppUpiFlowIfApplicable$1(paymentMainComponent, r3), 3);
                            paymentMainComponent.D0(new PaymentMainComponent$initPaymentInfoStateCollection$1(paymentMainComponent, r3));
                            return Unit.f17538a;
                        }
                    }
                }
                return coroutineSingletons2;
            case 2:
                List list9 = (List) paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$1;
                List list10 = (List) paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$0;
                ResultKt.b(objA);
                list3 = list10;
                list2 = list9;
                obj = objA;
                if (((Boolean) obj).booleanValue()) {
                    list2.add(CheckoutPaymentMethod.ChaloPay.INSTANCE);
                }
                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$0 = list3;
                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$1 = list2;
                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.label = 3;
                objR0 = paymentMainComponent.R0(paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1);
                if (objR0 != coroutineSingletons2) {
                    obj2 = objR0;
                    if (((Boolean) obj2).booleanValue()) {
                        list2.add(CheckoutPaymentMethod.ClosedLoopWallet.INSTANCE);
                    }
                    commonCheckoutItemUseCase = paymentMainComponent.w;
                    bool = ((ChaloPayWalletState) chaloPayManager.d().getValue()).c;
                    if (bool != null) {
                        BooleanValue = bool.booleanValue();
                    } else {
                        BooleanValue = 0;
                    }
                    l = ((ChaloPayWalletState) chaloPayManager.d().getValue()).f;
                    if (l != null) {
                        jLongValue = l.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    j = jLongValue;
                    walletStatusForUI = ((ChaloPayWalletState) chaloPayManager.d().getValue()).g;
                    WalletRepository walletRepository3 = paymentMainComponent.D;
                    UserProfileDetailsProvider userProfileDetailsProvider3 = paymentMainComponent.z;
                    WalletTypeIdentifier walletTypeIdentifier3 = ((ChaloPayWalletState) chaloPayManager.d().getValue()).i;
                    paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$0 = list3;
                    paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$1 = list2;
                    paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$2 = walletStatusForUI;
                    getPreferredMethodsCheckoutItemHelper = GetPreferredMethodsCheckoutItemHelper.f1391a;
                    paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$3 = getPreferredMethodsCheckoutItemHelper;
                    paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$4 = checkoutPaymentDataResolver2;
                    paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$5 = commonCheckoutItemUseCase;
                    paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$6 = stringProvider2;
                    paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$7 = currencyFeature2;
                    paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.I$0 = BooleanValue;
                    paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.J$0 = j;
                    paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.label = 4;
                    objD = ChaloPayCheckoutItemHelper.f1384a.d(walletRepository3, userProfileDetailsProvider3, walletTypeIdentifier3, paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1);
                    if (objD != coroutineSingletons2) {
                        checkoutPaymentDataResolver = checkoutPaymentDataResolver2;
                        list4 = list2;
                        list5 = list3;
                        commonCheckoutItemUseCase2 = commonCheckoutItemUseCase;
                        r5 = BooleanValue;
                        getPreferredMethodsCheckoutItemHelper2 = getPreferredMethodsCheckoutItemHelper;
                        stringProvider = stringProvider2;
                        j2 = j;
                        walletStatusForUI2 = walletStatusForUI;
                        currencyFeature = currencyFeature2;
                        boolean zBooleanValue3 = ((Boolean) objD).booleanValue();
                        if (r5 != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        ChaloPayCheckoutItemHelper.ChaloPayItemMetaData chaloPayItemMetaData3 = new ChaloPayCheckoutItemHelper.ChaloPayItemMetaData(walletStatusForUI2, j2, zBooleanValue3, z);
                        ICheckoutAnalyticsHelper iCheckoutAnalyticsHelper6 = paymentMainComponent.t;
                        paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$0 = list5;
                        paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$1 = list4;
                        paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$2 = null;
                        paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$3 = null;
                        paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$4 = null;
                        paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$5 = null;
                        paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$6 = null;
                        paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$7 = null;
                        paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.label = 5;
                        PaymentMainComponent$setValidPaymentMethodsAndPreferredModes$1 paymentMainComponent$setValidPaymentMethodsAndPreferredModes$5 = paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1;
                        coroutineSingletons = coroutineSingletons2;
                        i = 1;
                        i2 = 2;
                        objC = getPreferredMethodsCheckoutItemHelper2.c(checkoutPaymentDataResolver, commonCheckoutItemUseCase2, stringProvider, currencyFeature, chaloPayItemMetaData3, iCheckoutAnalyticsHelper6, list4, paymentMainComponent$setValidPaymentMethodsAndPreferredModes$5);
                        paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2 = paymentMainComponent$setValidPaymentMethodsAndPreferredModes$5;
                        if (objC == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        list6 = (List) objC;
                        Pair pair5 = new Pair("validPaymentMethodsCount", new Integer(list5.size()));
                        Pair pair6 = new Pair("preferredModeCount", new Integer(list6.size()));
                        Pair[] pairArr3 = new Pair[i2];
                        pairArr3[0] = pair5;
                        pairArr3[i] = pair6;
                        iCheckoutAnalyticsHelper = iCheckoutAnalyticsHelper3;
                        iCheckoutAnalyticsHelper.b("valid payment methods created", MapsKt.i(pairArr3));
                        StringEnum stringEnum3 = StringEnum.PAY_PREFIX;
                        Object[] objArr3 = new Object[i];
                        objArr3[0] = currencyFeature2.a(Long.parseLong(checkoutPaymentDataResolver2.getC().f2691a.c), CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                        paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2.L$0 = list5;
                        paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2.L$1 = list4;
                        paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2.L$2 = list6;
                        paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2.label = 6;
                        objB = stringProvider2.b(stringEnum3, objArr3, paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2);
                        if (objB == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        paymentMethods = list5;
                        list7 = list6;
                        iCheckoutAnalyticsHelper2 = iCheckoutAnalyticsHelper;
                        str = (String) objB;
                        paymentMethodsCheckoutItemsUseCase = paymentMainComponent.o;
                        paymentMethodsCheckoutItemsUseCase.getClass();
                        Intrinsics.i(paymentMethods, "paymentMethods");
                        arrayList2 = new ArrayList();
                        while (r5.hasNext()) {
                            d = ((PaymentMethodOptionsAppModel) obj3).getD();
                            CheckoutPaymentMethod.ChaloPay.INSTANCE.getClass();
                            if (!Intrinsics.d(d, "chalopay")) {
                                arrayList2.add(obj3);
                            }
                        }
                        arrayList3 = new ArrayList(CollectionsKt.v(arrayList2, 10));
                        size = arrayList2.size();
                        i3 = 0;
                        while (i3 < size) {
                            Object obj6 = arrayList2.get(i3);
                            i3++;
                            PaymentMethodOptionsAppModel paymentMethodOptionsAppModel3 = (PaymentMethodOptionsAppModel) obj6;
                            arrayList3.add(new CheckoutPaymentItem.PaymentMethodItem(paymentMethodsCheckoutItemsUseCase.f1392a.d(paymentMethodOptionsAppModel3), paymentMethodOptionsAppModel3));
                        }
                        paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2.L$0 = list7;
                        paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2.L$1 = str;
                        r3 = 0;
                        paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2.L$2 = null;
                        paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2.label = 7;
                        objY0 = paymentMainComponent.Y0(list7, arrayList3, list4, paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2);
                        if (objY0 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        objA = objY0;
                        r11 = iCheckoutAnalyticsHelper2;
                        paymentMainComponent.E0(new fo(5, str, (List) objA));
                        r11.c(r3, ((PaymentInfoState) checkoutPaymentDataResolver2.getF().getValue()).f1361a.c.size(), list7.size());
                        BuildersKt.d(paymentMainComponent.j, r3, r3, new PaymentMainComponent$initiateInAppUpiFlowIfApplicable$1(paymentMainComponent, r3), 3);
                        paymentMainComponent.D0(new PaymentMainComponent$initPaymentInfoStateCollection$1(paymentMainComponent, r3));
                        return Unit.f17538a;
                    }
                }
                return coroutineSingletons2;
            case 3:
                obj2 = objA;
                List list11 = (List) paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$1;
                List list12 = (List) paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$0;
                ResultKt.b(obj2);
                list3 = list12;
                list2 = list11;
                if (((Boolean) obj2).booleanValue()) {
                    list2.add(CheckoutPaymentMethod.ClosedLoopWallet.INSTANCE);
                }
                commonCheckoutItemUseCase = paymentMainComponent.w;
                bool = ((ChaloPayWalletState) chaloPayManager.d().getValue()).c;
                if (bool != null) {
                    BooleanValue = bool.booleanValue();
                } else {
                    BooleanValue = 0;
                }
                l = ((ChaloPayWalletState) chaloPayManager.d().getValue()).f;
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                j = jLongValue;
                walletStatusForUI = ((ChaloPayWalletState) chaloPayManager.d().getValue()).g;
                WalletRepository walletRepository4 = paymentMainComponent.D;
                UserProfileDetailsProvider userProfileDetailsProvider4 = paymentMainComponent.z;
                WalletTypeIdentifier walletTypeIdentifier4 = ((ChaloPayWalletState) chaloPayManager.d().getValue()).i;
                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$0 = list3;
                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$1 = list2;
                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$2 = walletStatusForUI;
                getPreferredMethodsCheckoutItemHelper = GetPreferredMethodsCheckoutItemHelper.f1391a;
                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$3 = getPreferredMethodsCheckoutItemHelper;
                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$4 = checkoutPaymentDataResolver2;
                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$5 = commonCheckoutItemUseCase;
                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$6 = stringProvider2;
                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$7 = currencyFeature2;
                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.I$0 = BooleanValue;
                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.J$0 = j;
                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.label = 4;
                objD = ChaloPayCheckoutItemHelper.f1384a.d(walletRepository4, userProfileDetailsProvider4, walletTypeIdentifier4, paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1);
                if (objD != coroutineSingletons2) {
                    checkoutPaymentDataResolver = checkoutPaymentDataResolver2;
                    list4 = list2;
                    list5 = list3;
                    commonCheckoutItemUseCase2 = commonCheckoutItemUseCase;
                    r5 = BooleanValue;
                    getPreferredMethodsCheckoutItemHelper2 = getPreferredMethodsCheckoutItemHelper;
                    stringProvider = stringProvider2;
                    j2 = j;
                    walletStatusForUI2 = walletStatusForUI;
                    currencyFeature = currencyFeature2;
                    boolean zBooleanValue4 = ((Boolean) objD).booleanValue();
                    if (r5 != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ChaloPayCheckoutItemHelper.ChaloPayItemMetaData chaloPayItemMetaData4 = new ChaloPayCheckoutItemHelper.ChaloPayItemMetaData(walletStatusForUI2, j2, zBooleanValue4, z);
                    ICheckoutAnalyticsHelper iCheckoutAnalyticsHelper7 = paymentMainComponent.t;
                    paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$0 = list5;
                    paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$1 = list4;
                    paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$2 = null;
                    paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$3 = null;
                    paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$4 = null;
                    paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$5 = null;
                    paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$6 = null;
                    paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$7 = null;
                    paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.label = 5;
                    PaymentMainComponent$setValidPaymentMethodsAndPreferredModes$1 paymentMainComponent$setValidPaymentMethodsAndPreferredModes$6 = paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1;
                    coroutineSingletons = coroutineSingletons2;
                    i = 1;
                    i2 = 2;
                    objC = getPreferredMethodsCheckoutItemHelper2.c(checkoutPaymentDataResolver, commonCheckoutItemUseCase2, stringProvider, currencyFeature, chaloPayItemMetaData4, iCheckoutAnalyticsHelper7, list4, paymentMainComponent$setValidPaymentMethodsAndPreferredModes$6);
                    paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2 = paymentMainComponent$setValidPaymentMethodsAndPreferredModes$6;
                    if (objC == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    list6 = (List) objC;
                    Pair pair7 = new Pair("validPaymentMethodsCount", new Integer(list5.size()));
                    Pair pair8 = new Pair("preferredModeCount", new Integer(list6.size()));
                    Pair[] pairArr4 = new Pair[i2];
                    pairArr4[0] = pair7;
                    pairArr4[i] = pair8;
                    iCheckoutAnalyticsHelper = iCheckoutAnalyticsHelper3;
                    iCheckoutAnalyticsHelper.b("valid payment methods created", MapsKt.i(pairArr4));
                    StringEnum stringEnum4 = StringEnum.PAY_PREFIX;
                    Object[] objArr4 = new Object[i];
                    objArr4[0] = currencyFeature2.a(Long.parseLong(checkoutPaymentDataResolver2.getC().f2691a.c), CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                    paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2.L$0 = list5;
                    paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2.L$1 = list4;
                    paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2.L$2 = list6;
                    paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2.label = 6;
                    objB = stringProvider2.b(stringEnum4, objArr4, paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2);
                    if (objB == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    paymentMethods = list5;
                    list7 = list6;
                    iCheckoutAnalyticsHelper2 = iCheckoutAnalyticsHelper;
                    str = (String) objB;
                    paymentMethodsCheckoutItemsUseCase = paymentMainComponent.o;
                    paymentMethodsCheckoutItemsUseCase.getClass();
                    Intrinsics.i(paymentMethods, "paymentMethods");
                    arrayList2 = new ArrayList();
                    while (r5.hasNext()) {
                        d = ((PaymentMethodOptionsAppModel) obj3).getD();
                        CheckoutPaymentMethod.ChaloPay.INSTANCE.getClass();
                        if (!Intrinsics.d(d, "chalopay")) {
                            arrayList2.add(obj3);
                        }
                    }
                    arrayList3 = new ArrayList(CollectionsKt.v(arrayList2, 10));
                    size = arrayList2.size();
                    i3 = 0;
                    while (i3 < size) {
                        Object obj7 = arrayList2.get(i3);
                        i3++;
                        PaymentMethodOptionsAppModel paymentMethodOptionsAppModel4 = (PaymentMethodOptionsAppModel) obj7;
                        arrayList3.add(new CheckoutPaymentItem.PaymentMethodItem(paymentMethodsCheckoutItemsUseCase.f1392a.d(paymentMethodOptionsAppModel4), paymentMethodOptionsAppModel4));
                    }
                    paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2.L$0 = list7;
                    paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2.L$1 = str;
                    r3 = 0;
                    paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2.L$2 = null;
                    paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2.label = 7;
                    objY0 = paymentMainComponent.Y0(list7, arrayList3, list4, paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2);
                    if (objY0 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    objA = objY0;
                    r11 = iCheckoutAnalyticsHelper2;
                    paymentMainComponent.E0(new fo(5, str, (List) objA));
                    r11.c(r3, ((PaymentInfoState) checkoutPaymentDataResolver2.getF().getValue()).f1361a.c.size(), list7.size());
                    BuildersKt.d(paymentMainComponent.j, r3, r3, new PaymentMainComponent$initiateInAppUpiFlowIfApplicable$1(paymentMainComponent, r3), 3);
                    paymentMainComponent.D0(new PaymentMainComponent$initPaymentInfoStateCollection$1(paymentMainComponent, r3));
                    return Unit.f17538a;
                }
                return coroutineSingletons2;
            case 4:
                long j3 = paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.J$0;
                int i5 = paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.I$0;
                CurrencyFeature currencyFeature3 = (CurrencyFeature) paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$7;
                StringProvider stringProvider3 = (StringProvider) paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$6;
                CommonCheckoutItemUseCase commonCheckoutItemUseCase3 = (CommonCheckoutItemUseCase) paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$5;
                CheckoutPaymentDataResolver checkoutPaymentDataResolver3 = (CheckoutPaymentDataResolver) paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$4;
                GetPreferredMethodsCheckoutItemHelper getPreferredMethodsCheckoutItemHelper3 = (GetPreferredMethodsCheckoutItemHelper) paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$3;
                WalletStatusForUI walletStatusForUI3 = (WalletStatusForUI) paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$2;
                List list13 = (List) paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$1;
                List list14 = (List) paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$0;
                ResultKt.b(objA);
                checkoutPaymentDataResolver = checkoutPaymentDataResolver3;
                commonCheckoutItemUseCase2 = commonCheckoutItemUseCase3;
                getPreferredMethodsCheckoutItemHelper2 = getPreferredMethodsCheckoutItemHelper3;
                j2 = j3;
                list4 = list13;
                stringProvider = stringProvider3;
                walletStatusForUI2 = walletStatusForUI3;
                list5 = list14;
                objD = objA;
                currencyFeature = currencyFeature3;
                r5 = i5;
                boolean zBooleanValue5 = ((Boolean) objD).booleanValue();
                if (r5 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                ChaloPayCheckoutItemHelper.ChaloPayItemMetaData chaloPayItemMetaData5 = new ChaloPayCheckoutItemHelper.ChaloPayItemMetaData(walletStatusForUI2, j2, zBooleanValue5, z);
                ICheckoutAnalyticsHelper iCheckoutAnalyticsHelper8 = paymentMainComponent.t;
                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$0 = list5;
                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$1 = list4;
                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$2 = null;
                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$3 = null;
                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$4 = null;
                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$5 = null;
                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$6 = null;
                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$7 = null;
                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.label = 5;
                PaymentMainComponent$setValidPaymentMethodsAndPreferredModes$1 paymentMainComponent$setValidPaymentMethodsAndPreferredModes$7 = paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1;
                coroutineSingletons = coroutineSingletons2;
                i = 1;
                i2 = 2;
                objC = getPreferredMethodsCheckoutItemHelper2.c(checkoutPaymentDataResolver, commonCheckoutItemUseCase2, stringProvider, currencyFeature, chaloPayItemMetaData5, iCheckoutAnalyticsHelper8, list4, paymentMainComponent$setValidPaymentMethodsAndPreferredModes$7);
                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2 = paymentMainComponent$setValidPaymentMethodsAndPreferredModes$7;
                if (objC == coroutineSingletons) {
                    return coroutineSingletons;
                }
                list6 = (List) objC;
                Pair pair9 = new Pair("validPaymentMethodsCount", new Integer(list5.size()));
                Pair pair10 = new Pair("preferredModeCount", new Integer(list6.size()));
                Pair[] pairArr5 = new Pair[i2];
                pairArr5[0] = pair9;
                pairArr5[i] = pair10;
                iCheckoutAnalyticsHelper = iCheckoutAnalyticsHelper3;
                iCheckoutAnalyticsHelper.b("valid payment methods created", MapsKt.i(pairArr5));
                StringEnum stringEnum5 = StringEnum.PAY_PREFIX;
                Object[] objArr5 = new Object[i];
                objArr5[0] = currencyFeature2.a(Long.parseLong(checkoutPaymentDataResolver2.getC().f2691a.c), CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2.L$0 = list5;
                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2.L$1 = list4;
                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2.L$2 = list6;
                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2.label = 6;
                objB = stringProvider2.b(stringEnum5, objArr5, paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
                paymentMethods = list5;
                list7 = list6;
                iCheckoutAnalyticsHelper2 = iCheckoutAnalyticsHelper;
                str = (String) objB;
                paymentMethodsCheckoutItemsUseCase = paymentMainComponent.o;
                paymentMethodsCheckoutItemsUseCase.getClass();
                Intrinsics.i(paymentMethods, "paymentMethods");
                arrayList2 = new ArrayList();
                while (r5.hasNext()) {
                    d = ((PaymentMethodOptionsAppModel) obj3).getD();
                    CheckoutPaymentMethod.ChaloPay.INSTANCE.getClass();
                    if (!Intrinsics.d(d, "chalopay")) {
                        arrayList2.add(obj3);
                    }
                }
                arrayList3 = new ArrayList(CollectionsKt.v(arrayList2, 10));
                size = arrayList2.size();
                i3 = 0;
                while (i3 < size) {
                    Object obj8 = arrayList2.get(i3);
                    i3++;
                    PaymentMethodOptionsAppModel paymentMethodOptionsAppModel5 = (PaymentMethodOptionsAppModel) obj8;
                    arrayList3.add(new CheckoutPaymentItem.PaymentMethodItem(paymentMethodsCheckoutItemsUseCase.f1392a.d(paymentMethodOptionsAppModel5), paymentMethodOptionsAppModel5));
                }
                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2.L$0 = list7;
                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2.L$1 = str;
                r3 = 0;
                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2.L$2 = null;
                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2.label = 7;
                objY0 = paymentMainComponent.Y0(list7, arrayList3, list4, paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2);
                if (objY0 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                objA = objY0;
                r11 = iCheckoutAnalyticsHelper2;
                paymentMainComponent.E0(new fo(5, str, (List) objA));
                r11.c(r3, ((PaymentInfoState) checkoutPaymentDataResolver2.getF().getValue()).f1361a.c.size(), list7.size());
                BuildersKt.d(paymentMainComponent.j, r3, r3, new PaymentMainComponent$initiateInAppUpiFlowIfApplicable$1(paymentMainComponent, r3), 3);
                paymentMainComponent.D0(new PaymentMainComponent$initPaymentInfoStateCollection$1(paymentMainComponent, r3));
                return Unit.f17538a;
            case 5:
                List list15 = (List) paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$1;
                List list16 = (List) paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$0;
                ResultKt.b(objA);
                objC = objA;
                coroutineSingletons = coroutineSingletons2;
                iCheckoutAnalyticsHelper3 = iCheckoutAnalyticsHelper3;
                list4 = list15;
                list5 = list16;
                i = 1;
                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2 = paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1;
                i2 = 2;
                list6 = (List) objC;
                Pair pair11 = new Pair("validPaymentMethodsCount", new Integer(list5.size()));
                Pair pair12 = new Pair("preferredModeCount", new Integer(list6.size()));
                Pair[] pairArr6 = new Pair[i2];
                pairArr6[0] = pair11;
                pairArr6[i] = pair12;
                iCheckoutAnalyticsHelper = iCheckoutAnalyticsHelper3;
                iCheckoutAnalyticsHelper.b("valid payment methods created", MapsKt.i(pairArr6));
                StringEnum stringEnum6 = StringEnum.PAY_PREFIX;
                Object[] objArr6 = new Object[i];
                objArr6[0] = currencyFeature2.a(Long.parseLong(checkoutPaymentDataResolver2.getC().f2691a.c), CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2.L$0 = list5;
                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2.L$1 = list4;
                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2.L$2 = list6;
                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2.label = 6;
                objB = stringProvider2.b(stringEnum6, objArr6, paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
                paymentMethods = list5;
                list7 = list6;
                iCheckoutAnalyticsHelper2 = iCheckoutAnalyticsHelper;
                str = (String) objB;
                paymentMethodsCheckoutItemsUseCase = paymentMainComponent.o;
                paymentMethodsCheckoutItemsUseCase.getClass();
                Intrinsics.i(paymentMethods, "paymentMethods");
                arrayList2 = new ArrayList();
                while (r5.hasNext()) {
                    d = ((PaymentMethodOptionsAppModel) obj3).getD();
                    CheckoutPaymentMethod.ChaloPay.INSTANCE.getClass();
                    if (!Intrinsics.d(d, "chalopay")) {
                        arrayList2.add(obj3);
                    }
                }
                arrayList3 = new ArrayList(CollectionsKt.v(arrayList2, 10));
                size = arrayList2.size();
                i3 = 0;
                while (i3 < size) {
                    Object obj9 = arrayList2.get(i3);
                    i3++;
                    PaymentMethodOptionsAppModel paymentMethodOptionsAppModel6 = (PaymentMethodOptionsAppModel) obj9;
                    arrayList3.add(new CheckoutPaymentItem.PaymentMethodItem(paymentMethodsCheckoutItemsUseCase.f1392a.d(paymentMethodOptionsAppModel6), paymentMethodOptionsAppModel6));
                }
                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2.L$0 = list7;
                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2.L$1 = str;
                r3 = 0;
                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2.L$2 = null;
                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2.label = 7;
                objY0 = paymentMainComponent.Y0(list7, arrayList3, list4, paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2);
                if (objY0 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                objA = objY0;
                r11 = iCheckoutAnalyticsHelper2;
                paymentMainComponent.E0(new fo(5, str, (List) objA));
                r11.c(r3, ((PaymentInfoState) checkoutPaymentDataResolver2.getF().getValue()).f1361a.c.size(), list7.size());
                BuildersKt.d(paymentMainComponent.j, r3, r3, new PaymentMainComponent$initiateInAppUpiFlowIfApplicable$1(paymentMainComponent, r3), 3);
                paymentMainComponent.D0(new PaymentMainComponent$initPaymentInfoStateCollection$1(paymentMainComponent, r3));
                return Unit.f17538a;
            case 6:
                List list17 = (List) paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$2;
                List list18 = (List) paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$1;
                paymentMethods = (List) paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$0;
                ResultKt.b(objA);
                iCheckoutAnalyticsHelper2 = iCheckoutAnalyticsHelper3;
                list4 = list18;
                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2 = paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1;
                list7 = list17;
                objB = objA;
                coroutineSingletons = coroutineSingletons2;
                str = (String) objB;
                paymentMethodsCheckoutItemsUseCase = paymentMainComponent.o;
                paymentMethodsCheckoutItemsUseCase.getClass();
                Intrinsics.i(paymentMethods, "paymentMethods");
                arrayList2 = new ArrayList();
                while (r5.hasNext()) {
                    d = ((PaymentMethodOptionsAppModel) obj3).getD();
                    CheckoutPaymentMethod.ChaloPay.INSTANCE.getClass();
                    if (!Intrinsics.d(d, "chalopay")) {
                        arrayList2.add(obj3);
                    }
                }
                arrayList3 = new ArrayList(CollectionsKt.v(arrayList2, 10));
                size = arrayList2.size();
                i3 = 0;
                while (i3 < size) {
                    Object obj10 = arrayList2.get(i3);
                    i3++;
                    PaymentMethodOptionsAppModel paymentMethodOptionsAppModel7 = (PaymentMethodOptionsAppModel) obj10;
                    arrayList3.add(new CheckoutPaymentItem.PaymentMethodItem(paymentMethodsCheckoutItemsUseCase.f1392a.d(paymentMethodOptionsAppModel7), paymentMethodOptionsAppModel7));
                }
                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2.L$0 = list7;
                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2.L$1 = str;
                r3 = 0;
                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2.L$2 = null;
                paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2.label = 7;
                objY0 = paymentMainComponent.Y0(list7, arrayList3, list4, paymentMainComponent$setValidPaymentMethodsAndPreferredModes$2);
                if (objY0 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                objA = objY0;
                r11 = iCheckoutAnalyticsHelper2;
                paymentMainComponent.E0(new fo(5, str, (List) objA));
                r11.c(r3, ((PaymentInfoState) checkoutPaymentDataResolver2.getF().getValue()).f1361a.c.size(), list7.size());
                BuildersKt.d(paymentMainComponent.j, r3, r3, new PaymentMainComponent$initiateInAppUpiFlowIfApplicable$1(paymentMainComponent, r3), 3);
                paymentMainComponent.D0(new PaymentMainComponent$initPaymentInfoStateCollection$1(paymentMainComponent, r3));
                return Unit.f17538a;
            case 7:
                str = (String) paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$1;
                list7 = (List) paymentMainComponent$setValidPaymentMethodsAndPreferredModes$1.L$0;
                ResultKt.b(objA);
                r11 = iCheckoutAnalyticsHelper3;
                r3 = 0;
                paymentMainComponent.E0(new fo(5, str, (List) objA));
                r11.c(r3, ((PaymentInfoState) checkoutPaymentDataResolver2.getF().getValue()).f1361a.c.size(), list7.size());
                BuildersKt.d(paymentMainComponent.j, r3, r3, new PaymentMainComponent$initiateInAppUpiFlowIfApplicable$1(paymentMainComponent, r3), 3);
                paymentMainComponent.D0(new PaymentMainComponent$initPaymentInfoStateCollection$1(paymentMainComponent, r3));
                return Unit.f17538a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static void e1(PaymentMainComponent paymentMainComponent, String str) {
        String str2 = paymentMainComponent.m.getC().f2691a.f2689a;
        paymentMainComponent.E0(new jq0(13));
        Job job = paymentMainComponent.d0;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        paymentMainComponent.d0 = paymentMainComponent.D0(new PaymentMainComponent$getPaymentStatus$2(paymentMainComponent, str2, str, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Q0(ContinuationImpl continuationImpl) {
        PaymentMainComponent$attemptPaymentFlowAfterRefreshingWallet$1 paymentMainComponent$attemptPaymentFlowAfterRefreshingWallet$1;
        if (continuationImpl instanceof PaymentMainComponent$attemptPaymentFlowAfterRefreshingWallet$1) {
            paymentMainComponent$attemptPaymentFlowAfterRefreshingWallet$1 = (PaymentMainComponent$attemptPaymentFlowAfterRefreshingWallet$1) continuationImpl;
            int i = paymentMainComponent$attemptPaymentFlowAfterRefreshingWallet$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                paymentMainComponent$attemptPaymentFlowAfterRefreshingWallet$1.label = i - Integer.MIN_VALUE;
            } else {
                paymentMainComponent$attemptPaymentFlowAfterRefreshingWallet$1 = new PaymentMainComponent$attemptPaymentFlowAfterRefreshingWallet$1(this, continuationImpl);
            }
        } else {
            paymentMainComponent$attemptPaymentFlowAfterRefreshingWallet$1 = new PaymentMainComponent$attemptPaymentFlowAfterRefreshingWallet$1(this, continuationImpl);
        }
        Object objB = paymentMainComponent$attemptPaymentFlowAfterRefreshingWallet$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = paymentMainComponent$attemptPaymentFlowAfterRefreshingWallet$1.label;
        Unit unit = Unit.f17538a;
        ChaloPayManager chaloPayManager = this.x;
        if (i2 == 0) {
            ResultKt.b(objB);
            if (!Intrinsics.d(((ChaloPayWalletState) chaloPayManager.d().getValue()).b, Boolean.TRUE)) {
                paymentMainComponent$attemptPaymentFlowAfterRefreshingWallet$1.label = 1;
                objB = this.X.b(paymentMainComponent$attemptPaymentFlowAfterRefreshingWallet$1);
                if (objB != coroutineSingletons) {
                }
            }
            Long l = ((ChaloPayWalletState) chaloPayManager.d().getValue()).f;
            if ((l != null ? l.longValue() : 0L) >= Long.parseLong(this.m.getC().f2691a.c)) {
                s1(PaymentViewIntent.ProceedWithChaloPayModeIntent.f1570a);
                return unit;
            }
            E0(new jq0(14));
            return unit;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
            return unit;
        }
        ResultKt.b(objB);
        WalletTypeIdentifier walletTypeIdentifier = (WalletTypeIdentifier) objB;
        if (walletTypeIdentifier == null) {
            l1();
            return unit;
        }
        this.f0 = Boolean.TRUE;
        paymentMainComponent$attemptPaymentFlowAfterRefreshingWallet$1.label = 2;
        return chaloPayManager.b(walletTypeIdentifier, paymentMainComponent$attemptPaymentFlowAfterRefreshingWallet$1) == coroutineSingletons ? coroutineSingletons : unit;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00be, code lost:
    
        if (r2.e(r8, r0, false, false) == r1) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R0(kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.checkout.ui.screen.payment.PaymentMainComponent.R0(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009d, code lost:
    
        if (r5.e(r8, r0, false, false) == r1) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object S0(kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof app.chalo.checkout.ui.screen.payment.PaymentMainComponent$checkIfSemiClosedIsPresentAndFetchState$1
            if (r0 == 0) goto L13
            r0 = r8
            app.chalo.checkout.ui.screen.payment.PaymentMainComponent$checkIfSemiClosedIsPresentAndFetchState$1 r0 = (app.chalo.checkout.ui.screen.payment.PaymentMainComponent$checkIfSemiClosedIsPresentAndFetchState$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.checkout.ui.screen.payment.PaymentMainComponent$checkIfSemiClosedIsPresentAndFetchState$1 r0 = new app.chalo.checkout.ui.screen.payment.PaymentMainComponent$checkIfSemiClosedIsPresentAndFetchState$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver r3 = r7.m
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            kotlin.ResultKt.b(r8)
            goto La0
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            kotlin.ResultKt.b(r8)
            goto L77
        L39:
            kotlin.ResultKt.b(r8)
            app.chalo.checkout.data.model.app.PaymentMethodsAppModel r8 = r3.H()
            java.util.List r8 = r8.c
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            boolean r2 = r8 instanceof java.util.Collection
            if (r2 == 0) goto L52
            r2 = r8
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L52
            goto La3
        L52:
            java.util.Iterator r8 = r8.iterator()
        L56:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto La3
            java.lang.Object r2 = r8.next()
            app.chalo.checkout.data.model.app.PreferredPaymentMethodsAppModel r2 = (app.chalo.checkout.data.model.app.PreferredPaymentMethodsAppModel) r2
            app.chalo.checkout.data.model.app.CheckoutPaymentMethod r2 = r2.c
            app.chalo.checkout.data.model.app.CheckoutPaymentMethod$ChaloPay r6 = app.chalo.checkout.data.model.app.CheckoutPaymentMethod.ChaloPay.INSTANCE
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r2, r6)
            if (r2 == 0) goto L56
            r0.label = r5
            app.chalo.walletframework.wallet.domain.resolver.WalletResolver r8 = r7.X
            java.lang.Object r8 = r8.b(r0)
            if (r8 != r1) goto L77
            goto L9f
        L77:
            app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier r8 = (app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier) r8
            if (r8 != 0) goto L7e
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        L7e:
            boolean r2 = r8.c
            if (r2 != 0) goto L85
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        L85:
            app.chalo.features.checkout.CheckoutPaymentData r2 = r3.getC()
            app.chalo.features.checkout.CheckoutOrderData r2 = r2.f2691a
            java.lang.String r2 = r2.c
            long r2 = java.lang.Long.parseLong(r2)
            app.chalo.walletframework.chalopay.ChaloPayManager r5 = r7.x
            r5.a(r2)
            r0.label = r4
            r2 = 0
            java.lang.Object r8 = r5.e(r8, r0, r2, r2)
            if (r8 != r1) goto La0
        L9f:
            return r1
        La0:
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            return r8
        La3:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.checkout.ui.screen.payment.PaymentMainComponent.S0(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x015c  */
    /* JADX WARN: Code duplicated, block: B:31:0x016d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0174  */
    /* JADX WARN: Code duplicated, block: B:37:0x018c  */
    /* JADX WARN: Code duplicated, block: B:41:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:44:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:48:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:51:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:52:0x027b  */
    /* JADX WARN: Code duplicated, block: B:56:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:60:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:63:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:66:0x02da  */
    /* JADX WARN: Code duplicated, block: B:69:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public final Object p0(PaymentDataState paymentDataState, ContinuationImpl continuationImpl) {
        PaymentMainComponent$convertToUiState$1 paymentMainComponent$convertToUiState$1;
        ToolbarUIState toolbarUIState;
        List list;
        PaymentDataState paymentDataState2;
        List list2;
        NoUpiAppsErrorUiState noUpiAppsErrorUiState;
        Object objB1;
        PaymentDataState paymentDataState3;
        Object objG1;
        List list3;
        ToolbarUIState toolbarUIState2;
        NoUpiAppsErrorUiState noUpiAppsErrorUiState2;
        SnackbarUIState snackbarUIState;
        Object objW0;
        PaymentDataState paymentDataState4;
        ToolbarUIState toolbarUIState3;
        SnackbarUIState snackbarUIState2;
        PaymentBottomSheetUiType paymentBottomSheetUiType;
        boolean z;
        boolean z2;
        BottomSheetUiState bottomSheetUiState;
        FullScreenErrorDetails fullScreenErrorDetails;
        StandardErrorScreenUIState newErrorWithMsgAndRetry;
        UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A;
        Object objA1;
        PaymentBottomSheetUiType paymentBottomSheetUiType2;
        List list4;
        SnackbarUIState snackbarUIState3;
        NoUpiAppsErrorUiState noUpiAppsErrorUiState3;
        UiEventHandler uiEventHandler;
        BottomSheetUiState bottomSheetUiState2;
        LoadingDialogUIState loadingDialogUIState;
        CircularProgressIndicatorUIState circularProgressIndicatorUIStateA;
        NoUpiAppsErrorUiState noUpiAppsErrorUiState4;
        LoadingDialogUIState loadingDialogUIState2;
        ToolbarUIState toolbarUIState4;
        CircularProgressIndicatorUIState circularProgressIndicatorUIState;
        ConfirmationDialogUiState confirmationDialogUiState;
        Object objF1;
        LoadingDialogUIState loadingDialogUIState3;
        ToolbarUIState toolbarUIState5;
        NoUpiAppsErrorUiState noUpiAppsErrorUiState5;
        CircularProgressIndicatorUIState circularProgressIndicatorUIState2;
        PaymentDataState paymentDataState5 = paymentDataState;
        if (continuationImpl instanceof PaymentMainComponent$convertToUiState$1) {
            paymentMainComponent$convertToUiState$1 = (PaymentMainComponent$convertToUiState$1) continuationImpl;
            int i = paymentMainComponent$convertToUiState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                paymentMainComponent$convertToUiState$1.label = i - Integer.MIN_VALUE;
            } else {
                paymentMainComponent$convertToUiState$1 = new PaymentMainComponent$convertToUiState$1(this, continuationImpl);
            }
        } else {
            paymentMainComponent$convertToUiState$1 = new PaymentMainComponent$convertToUiState$1(this, continuationImpl);
        }
        Object obj = paymentMainComponent$convertToUiState$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (paymentMainComponent$convertToUiState$1.label) {
            case 0:
                ResultKt.b(obj);
                String str = paymentDataState5.f1530a;
                ToolbarUIState toolbarUIState6 = str != null ? new ToolbarUIState(new ToolbarUiSpecs(null, new ChaloPadding(0.0f, ChaloThemeHelper.a().f, 1), 0.0f, 29), new TextUIState.ChaloTextUIState(str, UITextStyle.DisplaySmall, (ChaloColorToken) null, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8124), null, null, null, 0.0f, new DividerUIState(0.0f, null, null, 7), null, 188) : null;
                List list5 = paymentDataState5.l;
                paymentMainComponent$convertToUiState$1.L$0 = paymentDataState5;
                paymentMainComponent$convertToUiState$1.L$1 = toolbarUIState6;
                paymentMainComponent$convertToUiState$1.label = 1;
                Object objD1 = d1(list5, paymentMainComponent$convertToUiState$1);
                if (objD1 != obj2) {
                    toolbarUIState = toolbarUIState6;
                    obj = objD1;
                    list = (List) obj;
                    if (paymentDataState5.m) {
                        paymentMainComponent$convertToUiState$1.L$0 = paymentDataState5;
                        paymentMainComponent$convertToUiState$1.L$1 = toolbarUIState;
                        paymentMainComponent$convertToUiState$1.L$2 = list;
                        paymentMainComponent$convertToUiState$1.label = 2;
                        objB1 = b1(paymentMainComponent$convertToUiState$1);
                        if (objB1 != obj2) {
                            paymentDataState3 = paymentDataState5;
                            list2 = list;
                            obj = objB1;
                            noUpiAppsErrorUiState = (NoUpiAppsErrorUiState) obj;
                            paymentDataState2 = paymentDataState3;
                            boolean z3 = paymentDataState2.j;
                            paymentMainComponent$convertToUiState$1.L$0 = paymentDataState2;
                            paymentMainComponent$convertToUiState$1.L$1 = toolbarUIState;
                            paymentMainComponent$convertToUiState$1.L$2 = list2;
                            paymentMainComponent$convertToUiState$1.L$3 = noUpiAppsErrorUiState;
                            paymentMainComponent$convertToUiState$1.label = 3;
                            objG1 = g1(z3, paymentMainComponent$convertToUiState$1);
                            if (objG1 != obj2) {
                                list3 = list2;
                                toolbarUIState2 = toolbarUIState;
                                noUpiAppsErrorUiState2 = noUpiAppsErrorUiState;
                                obj = objG1;
                                snackbarUIState = (SnackbarUIState) obj;
                                PaymentBottomSheetType paymentBottomSheetType = paymentDataState2.k;
                                paymentMainComponent$convertToUiState$1.L$0 = paymentDataState2;
                                paymentMainComponent$convertToUiState$1.L$1 = toolbarUIState2;
                                paymentMainComponent$convertToUiState$1.L$2 = list3;
                                paymentMainComponent$convertToUiState$1.L$3 = noUpiAppsErrorUiState2;
                                paymentMainComponent$convertToUiState$1.L$4 = snackbarUIState;
                                paymentMainComponent$convertToUiState$1.label = 4;
                                objW0 = W0(paymentBottomSheetType, paymentMainComponent$convertToUiState$1);
                                if (objW0 != obj2) {
                                    paymentDataState4 = paymentDataState2;
                                    toolbarUIState3 = toolbarUIState2;
                                    snackbarUIState2 = snackbarUIState;
                                    obj = objW0;
                                    paymentBottomSheetUiType = (PaymentBottomSheetUiType) obj;
                                    PaymentBottomSheetType paymentBottomSheetType2 = paymentDataState4.k;
                                    z = paymentDataState4.g;
                                    if (!z || (paymentBottomSheetType2 instanceof PaymentBottomSheetType.PaymentStatusBottomSheet)) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    boolean z4 = !z2;
                                    bottomSheetUiState = new BottomSheetUiState(new BottomSheetUiSpec(UIShape.j, 14), new BottomSheetEventHandler(z4, z4, BottomSheetRequestHandler.Companion.a(new iq0(this, 21)), 3));
                                    fullScreenErrorDetails = paymentDataState4.c;
                                    if (fullScreenErrorDetails != null) {
                                        newErrorWithMsgAndRetry = new StandardErrorScreenUIState.NewErrorWithMsgAndRetry(new ImageUIState(fullScreenErrorDetails.c, (String) null, (ChaloColorToken) null, new ImageUISize(Dp.m7278constructorimpl(200)), UIContentScale.Fit, 0.0f, (UiEventHandler) null, 230), new TextUIState.ChaloTextUIState(fullScreenErrorDetails.f1513a, UITextStyle.DisplaySmall, ChaloColorToken.AlmostBlackColor.f9756a, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152), new TextUIState.ChaloTextUIState(fullScreenErrorDetails.b, UITextStyle.BodyMedium, ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), ButtonUIStateFactory.f(ButtonUIStateFactory.f9921a, new TextUIState.ChaloTextUIState(fullScreenErrorDetails.d, UITextStyle.HeadlineSmall, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new iq0(this, 16), UIShape.e, false, 0.0f, 52), null, 48);
                                    } else {
                                        newErrorWithMsgAndRetry = null;
                                    }
                                    uiEventHandler$Companion$fromLambda$1A = UiEventHandler.Companion.a(new r9(z, this, 3));
                                    boolean z5 = paymentDataState4.d;
                                    paymentMainComponent$convertToUiState$1.L$0 = paymentDataState4;
                                    paymentMainComponent$convertToUiState$1.L$1 = toolbarUIState3;
                                    paymentMainComponent$convertToUiState$1.L$2 = list3;
                                    paymentMainComponent$convertToUiState$1.L$3 = noUpiAppsErrorUiState2;
                                    paymentMainComponent$convertToUiState$1.L$4 = snackbarUIState2;
                                    paymentMainComponent$convertToUiState$1.L$5 = paymentBottomSheetUiType;
                                    paymentMainComponent$convertToUiState$1.L$6 = bottomSheetUiState;
                                    paymentMainComponent$convertToUiState$1.L$7 = newErrorWithMsgAndRetry;
                                    paymentMainComponent$convertToUiState$1.L$8 = uiEventHandler$Companion$fromLambda$1A;
                                    paymentMainComponent$convertToUiState$1.label = 5;
                                    objA1 = a1(z5, paymentMainComponent$convertToUiState$1);
                                    if (objA1 != obj2) {
                                        paymentBottomSheetUiType2 = paymentBottomSheetUiType;
                                        obj = objA1;
                                        list4 = list3;
                                        snackbarUIState3 = snackbarUIState2;
                                        noUpiAppsErrorUiState3 = noUpiAppsErrorUiState2;
                                        uiEventHandler = uiEventHandler$Companion$fromLambda$1A;
                                        bottomSheetUiState2 = bottomSheetUiState;
                                        loadingDialogUIState = (LoadingDialogUIState) obj;
                                        if (paymentDataState4.b) {
                                            circularProgressIndicatorUIStateA = CircularProgressIndicatorUIStateFactory.a();
                                        } else {
                                            circularProgressIndicatorUIStateA = null;
                                        }
                                        if (paymentDataState4.q) {
                                            paymentMainComponent$convertToUiState$1.L$0 = toolbarUIState3;
                                            paymentMainComponent$convertToUiState$1.L$1 = list4;
                                            paymentMainComponent$convertToUiState$1.L$2 = noUpiAppsErrorUiState3;
                                            paymentMainComponent$convertToUiState$1.L$3 = snackbarUIState3;
                                            paymentMainComponent$convertToUiState$1.L$4 = paymentBottomSheetUiType2;
                                            paymentMainComponent$convertToUiState$1.L$5 = bottomSheetUiState2;
                                            paymentMainComponent$convertToUiState$1.L$6 = newErrorWithMsgAndRetry;
                                            paymentMainComponent$convertToUiState$1.L$7 = uiEventHandler;
                                            paymentMainComponent$convertToUiState$1.L$8 = loadingDialogUIState;
                                            paymentMainComponent$convertToUiState$1.L$9 = circularProgressIndicatorUIStateA;
                                            paymentMainComponent$convertToUiState$1.label = 6;
                                            objF1 = f1(paymentMainComponent$convertToUiState$1);
                                            if (objF1 != obj2) {
                                                loadingDialogUIState3 = loadingDialogUIState;
                                                obj = objF1;
                                                toolbarUIState5 = toolbarUIState3;
                                                noUpiAppsErrorUiState5 = noUpiAppsErrorUiState3;
                                                circularProgressIndicatorUIState2 = circularProgressIndicatorUIStateA;
                                                circularProgressIndicatorUIState = circularProgressIndicatorUIState2;
                                                confirmationDialogUiState = (ConfirmationDialogUiState) obj;
                                                toolbarUIState4 = toolbarUIState5;
                                                loadingDialogUIState2 = loadingDialogUIState3;
                                                noUpiAppsErrorUiState4 = noUpiAppsErrorUiState5;
                                            }
                                        } else {
                                            noUpiAppsErrorUiState4 = noUpiAppsErrorUiState3;
                                            loadingDialogUIState2 = loadingDialogUIState;
                                            toolbarUIState4 = toolbarUIState3;
                                            circularProgressIndicatorUIState = circularProgressIndicatorUIStateA;
                                            confirmationDialogUiState = null;
                                        }
                                        return new PaymentViewState(toolbarUIState4, confirmationDialogUiState, list4, noUpiAppsErrorUiState4, paymentBottomSheetUiType2, bottomSheetUiState2, loadingDialogUIState2, circularProgressIndicatorUIState, snackbarUIState3, newErrorWithMsgAndRetry, uiEventHandler);
                                    }
                                }
                            }
                        }
                    } else {
                        paymentDataState2 = paymentDataState5;
                        list2 = list;
                        noUpiAppsErrorUiState = null;
                        boolean z6 = paymentDataState2.j;
                        paymentMainComponent$convertToUiState$1.L$0 = paymentDataState2;
                        paymentMainComponent$convertToUiState$1.L$1 = toolbarUIState;
                        paymentMainComponent$convertToUiState$1.L$2 = list2;
                        paymentMainComponent$convertToUiState$1.L$3 = noUpiAppsErrorUiState;
                        paymentMainComponent$convertToUiState$1.label = 3;
                        objG1 = g1(z6, paymentMainComponent$convertToUiState$1);
                        if (objG1 != obj2) {
                            list3 = list2;
                            toolbarUIState2 = toolbarUIState;
                            noUpiAppsErrorUiState2 = noUpiAppsErrorUiState;
                            obj = objG1;
                            snackbarUIState = (SnackbarUIState) obj;
                            PaymentBottomSheetType paymentBottomSheetType3 = paymentDataState2.k;
                            paymentMainComponent$convertToUiState$1.L$0 = paymentDataState2;
                            paymentMainComponent$convertToUiState$1.L$1 = toolbarUIState2;
                            paymentMainComponent$convertToUiState$1.L$2 = list3;
                            paymentMainComponent$convertToUiState$1.L$3 = noUpiAppsErrorUiState2;
                            paymentMainComponent$convertToUiState$1.L$4 = snackbarUIState;
                            paymentMainComponent$convertToUiState$1.label = 4;
                            objW0 = W0(paymentBottomSheetType3, paymentMainComponent$convertToUiState$1);
                            if (objW0 != obj2) {
                                paymentDataState4 = paymentDataState2;
                                toolbarUIState3 = toolbarUIState2;
                                snackbarUIState2 = snackbarUIState;
                                obj = objW0;
                                paymentBottomSheetUiType = (PaymentBottomSheetUiType) obj;
                                PaymentBottomSheetType paymentBottomSheetType4 = paymentDataState4.k;
                                z = paymentDataState4.g;
                                if (z) {
                                    z2 = true;
                                } else {
                                    z2 = true;
                                }
                                boolean z7 = !z2;
                                bottomSheetUiState = new BottomSheetUiState(new BottomSheetUiSpec(UIShape.j, 14), new BottomSheetEventHandler(z7, z7, BottomSheetRequestHandler.Companion.a(new iq0(this, 21)), 3));
                                fullScreenErrorDetails = paymentDataState4.c;
                                if (fullScreenErrorDetails != null) {
                                    newErrorWithMsgAndRetry = new StandardErrorScreenUIState.NewErrorWithMsgAndRetry(new ImageUIState(fullScreenErrorDetails.c, (String) null, (ChaloColorToken) null, new ImageUISize(Dp.m7278constructorimpl(200)), UIContentScale.Fit, 0.0f, (UiEventHandler) null, 230), new TextUIState.ChaloTextUIState(fullScreenErrorDetails.f1513a, UITextStyle.DisplaySmall, ChaloColorToken.AlmostBlackColor.f9756a, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152), new TextUIState.ChaloTextUIState(fullScreenErrorDetails.b, UITextStyle.BodyMedium, ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), ButtonUIStateFactory.f(ButtonUIStateFactory.f9921a, new TextUIState.ChaloTextUIState(fullScreenErrorDetails.d, UITextStyle.HeadlineSmall, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new iq0(this, 16), UIShape.e, false, 0.0f, 52), null, 48);
                                } else {
                                    newErrorWithMsgAndRetry = null;
                                }
                                uiEventHandler$Companion$fromLambda$1A = UiEventHandler.Companion.a(new r9(z, this, 3));
                                boolean z8 = paymentDataState4.d;
                                paymentMainComponent$convertToUiState$1.L$0 = paymentDataState4;
                                paymentMainComponent$convertToUiState$1.L$1 = toolbarUIState3;
                                paymentMainComponent$convertToUiState$1.L$2 = list3;
                                paymentMainComponent$convertToUiState$1.L$3 = noUpiAppsErrorUiState2;
                                paymentMainComponent$convertToUiState$1.L$4 = snackbarUIState2;
                                paymentMainComponent$convertToUiState$1.L$5 = paymentBottomSheetUiType;
                                paymentMainComponent$convertToUiState$1.L$6 = bottomSheetUiState;
                                paymentMainComponent$convertToUiState$1.L$7 = newErrorWithMsgAndRetry;
                                paymentMainComponent$convertToUiState$1.L$8 = uiEventHandler$Companion$fromLambda$1A;
                                paymentMainComponent$convertToUiState$1.label = 5;
                                objA1 = a1(z8, paymentMainComponent$convertToUiState$1);
                                if (objA1 != obj2) {
                                    paymentBottomSheetUiType2 = paymentBottomSheetUiType;
                                    obj = objA1;
                                    list4 = list3;
                                    snackbarUIState3 = snackbarUIState2;
                                    noUpiAppsErrorUiState3 = noUpiAppsErrorUiState2;
                                    uiEventHandler = uiEventHandler$Companion$fromLambda$1A;
                                    bottomSheetUiState2 = bottomSheetUiState;
                                    loadingDialogUIState = (LoadingDialogUIState) obj;
                                    if (paymentDataState4.b) {
                                        circularProgressIndicatorUIStateA = CircularProgressIndicatorUIStateFactory.a();
                                    } else {
                                        circularProgressIndicatorUIStateA = null;
                                    }
                                    if (paymentDataState4.q) {
                                        paymentMainComponent$convertToUiState$1.L$0 = toolbarUIState3;
                                        paymentMainComponent$convertToUiState$1.L$1 = list4;
                                        paymentMainComponent$convertToUiState$1.L$2 = noUpiAppsErrorUiState3;
                                        paymentMainComponent$convertToUiState$1.L$3 = snackbarUIState3;
                                        paymentMainComponent$convertToUiState$1.L$4 = paymentBottomSheetUiType2;
                                        paymentMainComponent$convertToUiState$1.L$5 = bottomSheetUiState2;
                                        paymentMainComponent$convertToUiState$1.L$6 = newErrorWithMsgAndRetry;
                                        paymentMainComponent$convertToUiState$1.L$7 = uiEventHandler;
                                        paymentMainComponent$convertToUiState$1.L$8 = loadingDialogUIState;
                                        paymentMainComponent$convertToUiState$1.L$9 = circularProgressIndicatorUIStateA;
                                        paymentMainComponent$convertToUiState$1.label = 6;
                                        objF1 = f1(paymentMainComponent$convertToUiState$1);
                                        if (objF1 != obj2) {
                                            loadingDialogUIState3 = loadingDialogUIState;
                                            obj = objF1;
                                            toolbarUIState5 = toolbarUIState3;
                                            noUpiAppsErrorUiState5 = noUpiAppsErrorUiState3;
                                            circularProgressIndicatorUIState2 = circularProgressIndicatorUIStateA;
                                            circularProgressIndicatorUIState = circularProgressIndicatorUIState2;
                                            confirmationDialogUiState = (ConfirmationDialogUiState) obj;
                                            toolbarUIState4 = toolbarUIState5;
                                            loadingDialogUIState2 = loadingDialogUIState3;
                                            noUpiAppsErrorUiState4 = noUpiAppsErrorUiState5;
                                        }
                                    } else {
                                        noUpiAppsErrorUiState4 = noUpiAppsErrorUiState3;
                                        loadingDialogUIState2 = loadingDialogUIState;
                                        toolbarUIState4 = toolbarUIState3;
                                        circularProgressIndicatorUIState = circularProgressIndicatorUIStateA;
                                        confirmationDialogUiState = null;
                                    }
                                    return new PaymentViewState(toolbarUIState4, confirmationDialogUiState, list4, noUpiAppsErrorUiState4, paymentBottomSheetUiType2, bottomSheetUiState2, loadingDialogUIState2, circularProgressIndicatorUIState, snackbarUIState3, newErrorWithMsgAndRetry, uiEventHandler);
                                }
                            }
                        }
                    }
                }
                return obj2;
            case 1:
                ToolbarUIState toolbarUIState7 = (ToolbarUIState) paymentMainComponent$convertToUiState$1.L$1;
                PaymentDataState paymentDataState6 = (PaymentDataState) paymentMainComponent$convertToUiState$1.L$0;
                ResultKt.b(obj);
                toolbarUIState = toolbarUIState7;
                paymentDataState5 = paymentDataState6;
                list = (List) obj;
                if (paymentDataState5.m) {
                    paymentMainComponent$convertToUiState$1.L$0 = paymentDataState5;
                    paymentMainComponent$convertToUiState$1.L$1 = toolbarUIState;
                    paymentMainComponent$convertToUiState$1.L$2 = list;
                    paymentMainComponent$convertToUiState$1.label = 2;
                    objB1 = b1(paymentMainComponent$convertToUiState$1);
                    if (objB1 != obj2) {
                        paymentDataState3 = paymentDataState5;
                        list2 = list;
                        obj = objB1;
                        noUpiAppsErrorUiState = (NoUpiAppsErrorUiState) obj;
                        paymentDataState2 = paymentDataState3;
                        boolean z9 = paymentDataState2.j;
                        paymentMainComponent$convertToUiState$1.L$0 = paymentDataState2;
                        paymentMainComponent$convertToUiState$1.L$1 = toolbarUIState;
                        paymentMainComponent$convertToUiState$1.L$2 = list2;
                        paymentMainComponent$convertToUiState$1.L$3 = noUpiAppsErrorUiState;
                        paymentMainComponent$convertToUiState$1.label = 3;
                        objG1 = g1(z9, paymentMainComponent$convertToUiState$1);
                        if (objG1 != obj2) {
                            list3 = list2;
                            toolbarUIState2 = toolbarUIState;
                            noUpiAppsErrorUiState2 = noUpiAppsErrorUiState;
                            obj = objG1;
                            snackbarUIState = (SnackbarUIState) obj;
                            PaymentBottomSheetType paymentBottomSheetType5 = paymentDataState2.k;
                            paymentMainComponent$convertToUiState$1.L$0 = paymentDataState2;
                            paymentMainComponent$convertToUiState$1.L$1 = toolbarUIState2;
                            paymentMainComponent$convertToUiState$1.L$2 = list3;
                            paymentMainComponent$convertToUiState$1.L$3 = noUpiAppsErrorUiState2;
                            paymentMainComponent$convertToUiState$1.L$4 = snackbarUIState;
                            paymentMainComponent$convertToUiState$1.label = 4;
                            objW0 = W0(paymentBottomSheetType5, paymentMainComponent$convertToUiState$1);
                            if (objW0 != obj2) {
                                paymentDataState4 = paymentDataState2;
                                toolbarUIState3 = toolbarUIState2;
                                snackbarUIState2 = snackbarUIState;
                                obj = objW0;
                                paymentBottomSheetUiType = (PaymentBottomSheetUiType) obj;
                                PaymentBottomSheetType paymentBottomSheetType6 = paymentDataState4.k;
                                z = paymentDataState4.g;
                                if (z) {
                                    z2 = true;
                                } else {
                                    z2 = true;
                                }
                                boolean z10 = !z2;
                                bottomSheetUiState = new BottomSheetUiState(new BottomSheetUiSpec(UIShape.j, 14), new BottomSheetEventHandler(z10, z10, BottomSheetRequestHandler.Companion.a(new iq0(this, 21)), 3));
                                fullScreenErrorDetails = paymentDataState4.c;
                                if (fullScreenErrorDetails != null) {
                                    newErrorWithMsgAndRetry = new StandardErrorScreenUIState.NewErrorWithMsgAndRetry(new ImageUIState(fullScreenErrorDetails.c, (String) null, (ChaloColorToken) null, new ImageUISize(Dp.m7278constructorimpl(200)), UIContentScale.Fit, 0.0f, (UiEventHandler) null, 230), new TextUIState.ChaloTextUIState(fullScreenErrorDetails.f1513a, UITextStyle.DisplaySmall, ChaloColorToken.AlmostBlackColor.f9756a, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152), new TextUIState.ChaloTextUIState(fullScreenErrorDetails.b, UITextStyle.BodyMedium, ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), ButtonUIStateFactory.f(ButtonUIStateFactory.f9921a, new TextUIState.ChaloTextUIState(fullScreenErrorDetails.d, UITextStyle.HeadlineSmall, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new iq0(this, 16), UIShape.e, false, 0.0f, 52), null, 48);
                                } else {
                                    newErrorWithMsgAndRetry = null;
                                }
                                uiEventHandler$Companion$fromLambda$1A = UiEventHandler.Companion.a(new r9(z, this, 3));
                                boolean z11 = paymentDataState4.d;
                                paymentMainComponent$convertToUiState$1.L$0 = paymentDataState4;
                                paymentMainComponent$convertToUiState$1.L$1 = toolbarUIState3;
                                paymentMainComponent$convertToUiState$1.L$2 = list3;
                                paymentMainComponent$convertToUiState$1.L$3 = noUpiAppsErrorUiState2;
                                paymentMainComponent$convertToUiState$1.L$4 = snackbarUIState2;
                                paymentMainComponent$convertToUiState$1.L$5 = paymentBottomSheetUiType;
                                paymentMainComponent$convertToUiState$1.L$6 = bottomSheetUiState;
                                paymentMainComponent$convertToUiState$1.L$7 = newErrorWithMsgAndRetry;
                                paymentMainComponent$convertToUiState$1.L$8 = uiEventHandler$Companion$fromLambda$1A;
                                paymentMainComponent$convertToUiState$1.label = 5;
                                objA1 = a1(z11, paymentMainComponent$convertToUiState$1);
                                if (objA1 != obj2) {
                                    paymentBottomSheetUiType2 = paymentBottomSheetUiType;
                                    obj = objA1;
                                    list4 = list3;
                                    snackbarUIState3 = snackbarUIState2;
                                    noUpiAppsErrorUiState3 = noUpiAppsErrorUiState2;
                                    uiEventHandler = uiEventHandler$Companion$fromLambda$1A;
                                    bottomSheetUiState2 = bottomSheetUiState;
                                    loadingDialogUIState = (LoadingDialogUIState) obj;
                                    if (paymentDataState4.b) {
                                        circularProgressIndicatorUIStateA = CircularProgressIndicatorUIStateFactory.a();
                                    } else {
                                        circularProgressIndicatorUIStateA = null;
                                    }
                                    if (paymentDataState4.q) {
                                        paymentMainComponent$convertToUiState$1.L$0 = toolbarUIState3;
                                        paymentMainComponent$convertToUiState$1.L$1 = list4;
                                        paymentMainComponent$convertToUiState$1.L$2 = noUpiAppsErrorUiState3;
                                        paymentMainComponent$convertToUiState$1.L$3 = snackbarUIState3;
                                        paymentMainComponent$convertToUiState$1.L$4 = paymentBottomSheetUiType2;
                                        paymentMainComponent$convertToUiState$1.L$5 = bottomSheetUiState2;
                                        paymentMainComponent$convertToUiState$1.L$6 = newErrorWithMsgAndRetry;
                                        paymentMainComponent$convertToUiState$1.L$7 = uiEventHandler;
                                        paymentMainComponent$convertToUiState$1.L$8 = loadingDialogUIState;
                                        paymentMainComponent$convertToUiState$1.L$9 = circularProgressIndicatorUIStateA;
                                        paymentMainComponent$convertToUiState$1.label = 6;
                                        objF1 = f1(paymentMainComponent$convertToUiState$1);
                                        if (objF1 != obj2) {
                                            loadingDialogUIState3 = loadingDialogUIState;
                                            obj = objF1;
                                            toolbarUIState5 = toolbarUIState3;
                                            noUpiAppsErrorUiState5 = noUpiAppsErrorUiState3;
                                            circularProgressIndicatorUIState2 = circularProgressIndicatorUIStateA;
                                            circularProgressIndicatorUIState = circularProgressIndicatorUIState2;
                                            confirmationDialogUiState = (ConfirmationDialogUiState) obj;
                                            toolbarUIState4 = toolbarUIState5;
                                            loadingDialogUIState2 = loadingDialogUIState3;
                                            noUpiAppsErrorUiState4 = noUpiAppsErrorUiState5;
                                        }
                                    } else {
                                        noUpiAppsErrorUiState4 = noUpiAppsErrorUiState3;
                                        loadingDialogUIState2 = loadingDialogUIState;
                                        toolbarUIState4 = toolbarUIState3;
                                        circularProgressIndicatorUIState = circularProgressIndicatorUIStateA;
                                        confirmationDialogUiState = null;
                                    }
                                    return new PaymentViewState(toolbarUIState4, confirmationDialogUiState, list4, noUpiAppsErrorUiState4, paymentBottomSheetUiType2, bottomSheetUiState2, loadingDialogUIState2, circularProgressIndicatorUIState, snackbarUIState3, newErrorWithMsgAndRetry, uiEventHandler);
                                }
                            }
                        }
                    }
                } else {
                    paymentDataState2 = paymentDataState5;
                    list2 = list;
                    noUpiAppsErrorUiState = null;
                    boolean z12 = paymentDataState2.j;
                    paymentMainComponent$convertToUiState$1.L$0 = paymentDataState2;
                    paymentMainComponent$convertToUiState$1.L$1 = toolbarUIState;
                    paymentMainComponent$convertToUiState$1.L$2 = list2;
                    paymentMainComponent$convertToUiState$1.L$3 = noUpiAppsErrorUiState;
                    paymentMainComponent$convertToUiState$1.label = 3;
                    objG1 = g1(z12, paymentMainComponent$convertToUiState$1);
                    if (objG1 != obj2) {
                        list3 = list2;
                        toolbarUIState2 = toolbarUIState;
                        noUpiAppsErrorUiState2 = noUpiAppsErrorUiState;
                        obj = objG1;
                        snackbarUIState = (SnackbarUIState) obj;
                        PaymentBottomSheetType paymentBottomSheetType7 = paymentDataState2.k;
                        paymentMainComponent$convertToUiState$1.L$0 = paymentDataState2;
                        paymentMainComponent$convertToUiState$1.L$1 = toolbarUIState2;
                        paymentMainComponent$convertToUiState$1.L$2 = list3;
                        paymentMainComponent$convertToUiState$1.L$3 = noUpiAppsErrorUiState2;
                        paymentMainComponent$convertToUiState$1.L$4 = snackbarUIState;
                        paymentMainComponent$convertToUiState$1.label = 4;
                        objW0 = W0(paymentBottomSheetType7, paymentMainComponent$convertToUiState$1);
                        if (objW0 != obj2) {
                            paymentDataState4 = paymentDataState2;
                            toolbarUIState3 = toolbarUIState2;
                            snackbarUIState2 = snackbarUIState;
                            obj = objW0;
                            paymentBottomSheetUiType = (PaymentBottomSheetUiType) obj;
                            PaymentBottomSheetType paymentBottomSheetType8 = paymentDataState4.k;
                            z = paymentDataState4.g;
                            if (z) {
                                z2 = true;
                            } else {
                                z2 = true;
                            }
                            boolean z13 = !z2;
                            bottomSheetUiState = new BottomSheetUiState(new BottomSheetUiSpec(UIShape.j, 14), new BottomSheetEventHandler(z13, z13, BottomSheetRequestHandler.Companion.a(new iq0(this, 21)), 3));
                            fullScreenErrorDetails = paymentDataState4.c;
                            if (fullScreenErrorDetails != null) {
                                newErrorWithMsgAndRetry = new StandardErrorScreenUIState.NewErrorWithMsgAndRetry(new ImageUIState(fullScreenErrorDetails.c, (String) null, (ChaloColorToken) null, new ImageUISize(Dp.m7278constructorimpl(200)), UIContentScale.Fit, 0.0f, (UiEventHandler) null, 230), new TextUIState.ChaloTextUIState(fullScreenErrorDetails.f1513a, UITextStyle.DisplaySmall, ChaloColorToken.AlmostBlackColor.f9756a, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152), new TextUIState.ChaloTextUIState(fullScreenErrorDetails.b, UITextStyle.BodyMedium, ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), ButtonUIStateFactory.f(ButtonUIStateFactory.f9921a, new TextUIState.ChaloTextUIState(fullScreenErrorDetails.d, UITextStyle.HeadlineSmall, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new iq0(this, 16), UIShape.e, false, 0.0f, 52), null, 48);
                            } else {
                                newErrorWithMsgAndRetry = null;
                            }
                            uiEventHandler$Companion$fromLambda$1A = UiEventHandler.Companion.a(new r9(z, this, 3));
                            boolean z14 = paymentDataState4.d;
                            paymentMainComponent$convertToUiState$1.L$0 = paymentDataState4;
                            paymentMainComponent$convertToUiState$1.L$1 = toolbarUIState3;
                            paymentMainComponent$convertToUiState$1.L$2 = list3;
                            paymentMainComponent$convertToUiState$1.L$3 = noUpiAppsErrorUiState2;
                            paymentMainComponent$convertToUiState$1.L$4 = snackbarUIState2;
                            paymentMainComponent$convertToUiState$1.L$5 = paymentBottomSheetUiType;
                            paymentMainComponent$convertToUiState$1.L$6 = bottomSheetUiState;
                            paymentMainComponent$convertToUiState$1.L$7 = newErrorWithMsgAndRetry;
                            paymentMainComponent$convertToUiState$1.L$8 = uiEventHandler$Companion$fromLambda$1A;
                            paymentMainComponent$convertToUiState$1.label = 5;
                            objA1 = a1(z14, paymentMainComponent$convertToUiState$1);
                            if (objA1 != obj2) {
                                paymentBottomSheetUiType2 = paymentBottomSheetUiType;
                                obj = objA1;
                                list4 = list3;
                                snackbarUIState3 = snackbarUIState2;
                                noUpiAppsErrorUiState3 = noUpiAppsErrorUiState2;
                                uiEventHandler = uiEventHandler$Companion$fromLambda$1A;
                                bottomSheetUiState2 = bottomSheetUiState;
                                loadingDialogUIState = (LoadingDialogUIState) obj;
                                if (paymentDataState4.b) {
                                    circularProgressIndicatorUIStateA = CircularProgressIndicatorUIStateFactory.a();
                                } else {
                                    circularProgressIndicatorUIStateA = null;
                                }
                                if (paymentDataState4.q) {
                                    paymentMainComponent$convertToUiState$1.L$0 = toolbarUIState3;
                                    paymentMainComponent$convertToUiState$1.L$1 = list4;
                                    paymentMainComponent$convertToUiState$1.L$2 = noUpiAppsErrorUiState3;
                                    paymentMainComponent$convertToUiState$1.L$3 = snackbarUIState3;
                                    paymentMainComponent$convertToUiState$1.L$4 = paymentBottomSheetUiType2;
                                    paymentMainComponent$convertToUiState$1.L$5 = bottomSheetUiState2;
                                    paymentMainComponent$convertToUiState$1.L$6 = newErrorWithMsgAndRetry;
                                    paymentMainComponent$convertToUiState$1.L$7 = uiEventHandler;
                                    paymentMainComponent$convertToUiState$1.L$8 = loadingDialogUIState;
                                    paymentMainComponent$convertToUiState$1.L$9 = circularProgressIndicatorUIStateA;
                                    paymentMainComponent$convertToUiState$1.label = 6;
                                    objF1 = f1(paymentMainComponent$convertToUiState$1);
                                    if (objF1 != obj2) {
                                        loadingDialogUIState3 = loadingDialogUIState;
                                        obj = objF1;
                                        toolbarUIState5 = toolbarUIState3;
                                        noUpiAppsErrorUiState5 = noUpiAppsErrorUiState3;
                                        circularProgressIndicatorUIState2 = circularProgressIndicatorUIStateA;
                                        circularProgressIndicatorUIState = circularProgressIndicatorUIState2;
                                        confirmationDialogUiState = (ConfirmationDialogUiState) obj;
                                        toolbarUIState4 = toolbarUIState5;
                                        loadingDialogUIState2 = loadingDialogUIState3;
                                        noUpiAppsErrorUiState4 = noUpiAppsErrorUiState5;
                                    }
                                } else {
                                    noUpiAppsErrorUiState4 = noUpiAppsErrorUiState3;
                                    loadingDialogUIState2 = loadingDialogUIState;
                                    toolbarUIState4 = toolbarUIState3;
                                    circularProgressIndicatorUIState = circularProgressIndicatorUIStateA;
                                    confirmationDialogUiState = null;
                                }
                                return new PaymentViewState(toolbarUIState4, confirmationDialogUiState, list4, noUpiAppsErrorUiState4, paymentBottomSheetUiType2, bottomSheetUiState2, loadingDialogUIState2, circularProgressIndicatorUIState, snackbarUIState3, newErrorWithMsgAndRetry, uiEventHandler);
                            }
                        }
                    }
                }
                return obj2;
            case 2:
                list2 = (List) paymentMainComponent$convertToUiState$1.L$2;
                toolbarUIState = (ToolbarUIState) paymentMainComponent$convertToUiState$1.L$1;
                paymentDataState3 = (PaymentDataState) paymentMainComponent$convertToUiState$1.L$0;
                ResultKt.b(obj);
                noUpiAppsErrorUiState = (NoUpiAppsErrorUiState) obj;
                paymentDataState2 = paymentDataState3;
                boolean z15 = paymentDataState2.j;
                paymentMainComponent$convertToUiState$1.L$0 = paymentDataState2;
                paymentMainComponent$convertToUiState$1.L$1 = toolbarUIState;
                paymentMainComponent$convertToUiState$1.L$2 = list2;
                paymentMainComponent$convertToUiState$1.L$3 = noUpiAppsErrorUiState;
                paymentMainComponent$convertToUiState$1.label = 3;
                objG1 = g1(z15, paymentMainComponent$convertToUiState$1);
                if (objG1 != obj2) {
                    list3 = list2;
                    toolbarUIState2 = toolbarUIState;
                    noUpiAppsErrorUiState2 = noUpiAppsErrorUiState;
                    obj = objG1;
                    snackbarUIState = (SnackbarUIState) obj;
                    PaymentBottomSheetType paymentBottomSheetType9 = paymentDataState2.k;
                    paymentMainComponent$convertToUiState$1.L$0 = paymentDataState2;
                    paymentMainComponent$convertToUiState$1.L$1 = toolbarUIState2;
                    paymentMainComponent$convertToUiState$1.L$2 = list3;
                    paymentMainComponent$convertToUiState$1.L$3 = noUpiAppsErrorUiState2;
                    paymentMainComponent$convertToUiState$1.L$4 = snackbarUIState;
                    paymentMainComponent$convertToUiState$1.label = 4;
                    objW0 = W0(paymentBottomSheetType9, paymentMainComponent$convertToUiState$1);
                    if (objW0 != obj2) {
                        paymentDataState4 = paymentDataState2;
                        toolbarUIState3 = toolbarUIState2;
                        snackbarUIState2 = snackbarUIState;
                        obj = objW0;
                        paymentBottomSheetUiType = (PaymentBottomSheetUiType) obj;
                        PaymentBottomSheetType paymentBottomSheetType10 = paymentDataState4.k;
                        z = paymentDataState4.g;
                        if (z) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        boolean z16 = !z2;
                        bottomSheetUiState = new BottomSheetUiState(new BottomSheetUiSpec(UIShape.j, 14), new BottomSheetEventHandler(z16, z16, BottomSheetRequestHandler.Companion.a(new iq0(this, 21)), 3));
                        fullScreenErrorDetails = paymentDataState4.c;
                        if (fullScreenErrorDetails != null) {
                            newErrorWithMsgAndRetry = new StandardErrorScreenUIState.NewErrorWithMsgAndRetry(new ImageUIState(fullScreenErrorDetails.c, (String) null, (ChaloColorToken) null, new ImageUISize(Dp.m7278constructorimpl(200)), UIContentScale.Fit, 0.0f, (UiEventHandler) null, 230), new TextUIState.ChaloTextUIState(fullScreenErrorDetails.f1513a, UITextStyle.DisplaySmall, ChaloColorToken.AlmostBlackColor.f9756a, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152), new TextUIState.ChaloTextUIState(fullScreenErrorDetails.b, UITextStyle.BodyMedium, ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), ButtonUIStateFactory.f(ButtonUIStateFactory.f9921a, new TextUIState.ChaloTextUIState(fullScreenErrorDetails.d, UITextStyle.HeadlineSmall, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new iq0(this, 16), UIShape.e, false, 0.0f, 52), null, 48);
                        } else {
                            newErrorWithMsgAndRetry = null;
                        }
                        uiEventHandler$Companion$fromLambda$1A = UiEventHandler.Companion.a(new r9(z, this, 3));
                        boolean z17 = paymentDataState4.d;
                        paymentMainComponent$convertToUiState$1.L$0 = paymentDataState4;
                        paymentMainComponent$convertToUiState$1.L$1 = toolbarUIState3;
                        paymentMainComponent$convertToUiState$1.L$2 = list3;
                        paymentMainComponent$convertToUiState$1.L$3 = noUpiAppsErrorUiState2;
                        paymentMainComponent$convertToUiState$1.L$4 = snackbarUIState2;
                        paymentMainComponent$convertToUiState$1.L$5 = paymentBottomSheetUiType;
                        paymentMainComponent$convertToUiState$1.L$6 = bottomSheetUiState;
                        paymentMainComponent$convertToUiState$1.L$7 = newErrorWithMsgAndRetry;
                        paymentMainComponent$convertToUiState$1.L$8 = uiEventHandler$Companion$fromLambda$1A;
                        paymentMainComponent$convertToUiState$1.label = 5;
                        objA1 = a1(z17, paymentMainComponent$convertToUiState$1);
                        if (objA1 != obj2) {
                            paymentBottomSheetUiType2 = paymentBottomSheetUiType;
                            obj = objA1;
                            list4 = list3;
                            snackbarUIState3 = snackbarUIState2;
                            noUpiAppsErrorUiState3 = noUpiAppsErrorUiState2;
                            uiEventHandler = uiEventHandler$Companion$fromLambda$1A;
                            bottomSheetUiState2 = bottomSheetUiState;
                            loadingDialogUIState = (LoadingDialogUIState) obj;
                            if (paymentDataState4.b) {
                                circularProgressIndicatorUIStateA = CircularProgressIndicatorUIStateFactory.a();
                            } else {
                                circularProgressIndicatorUIStateA = null;
                            }
                            if (paymentDataState4.q) {
                                paymentMainComponent$convertToUiState$1.L$0 = toolbarUIState3;
                                paymentMainComponent$convertToUiState$1.L$1 = list4;
                                paymentMainComponent$convertToUiState$1.L$2 = noUpiAppsErrorUiState3;
                                paymentMainComponent$convertToUiState$1.L$3 = snackbarUIState3;
                                paymentMainComponent$convertToUiState$1.L$4 = paymentBottomSheetUiType2;
                                paymentMainComponent$convertToUiState$1.L$5 = bottomSheetUiState2;
                                paymentMainComponent$convertToUiState$1.L$6 = newErrorWithMsgAndRetry;
                                paymentMainComponent$convertToUiState$1.L$7 = uiEventHandler;
                                paymentMainComponent$convertToUiState$1.L$8 = loadingDialogUIState;
                                paymentMainComponent$convertToUiState$1.L$9 = circularProgressIndicatorUIStateA;
                                paymentMainComponent$convertToUiState$1.label = 6;
                                objF1 = f1(paymentMainComponent$convertToUiState$1);
                                if (objF1 != obj2) {
                                    loadingDialogUIState3 = loadingDialogUIState;
                                    obj = objF1;
                                    toolbarUIState5 = toolbarUIState3;
                                    noUpiAppsErrorUiState5 = noUpiAppsErrorUiState3;
                                    circularProgressIndicatorUIState2 = circularProgressIndicatorUIStateA;
                                    circularProgressIndicatorUIState = circularProgressIndicatorUIState2;
                                    confirmationDialogUiState = (ConfirmationDialogUiState) obj;
                                    toolbarUIState4 = toolbarUIState5;
                                    loadingDialogUIState2 = loadingDialogUIState3;
                                    noUpiAppsErrorUiState4 = noUpiAppsErrorUiState5;
                                }
                            } else {
                                noUpiAppsErrorUiState4 = noUpiAppsErrorUiState3;
                                loadingDialogUIState2 = loadingDialogUIState;
                                toolbarUIState4 = toolbarUIState3;
                                circularProgressIndicatorUIState = circularProgressIndicatorUIStateA;
                                confirmationDialogUiState = null;
                            }
                            return new PaymentViewState(toolbarUIState4, confirmationDialogUiState, list4, noUpiAppsErrorUiState4, paymentBottomSheetUiType2, bottomSheetUiState2, loadingDialogUIState2, circularProgressIndicatorUIState, snackbarUIState3, newErrorWithMsgAndRetry, uiEventHandler);
                        }
                    }
                }
                return obj2;
            case 3:
                NoUpiAppsErrorUiState noUpiAppsErrorUiState6 = (NoUpiAppsErrorUiState) paymentMainComponent$convertToUiState$1.L$3;
                List list6 = (List) paymentMainComponent$convertToUiState$1.L$2;
                ToolbarUIState toolbarUIState8 = (ToolbarUIState) paymentMainComponent$convertToUiState$1.L$1;
                paymentDataState2 = (PaymentDataState) paymentMainComponent$convertToUiState$1.L$0;
                ResultKt.b(obj);
                noUpiAppsErrorUiState2 = noUpiAppsErrorUiState6;
                toolbarUIState2 = toolbarUIState8;
                list3 = list6;
                snackbarUIState = (SnackbarUIState) obj;
                PaymentBottomSheetType paymentBottomSheetType11 = paymentDataState2.k;
                paymentMainComponent$convertToUiState$1.L$0 = paymentDataState2;
                paymentMainComponent$convertToUiState$1.L$1 = toolbarUIState2;
                paymentMainComponent$convertToUiState$1.L$2 = list3;
                paymentMainComponent$convertToUiState$1.L$3 = noUpiAppsErrorUiState2;
                paymentMainComponent$convertToUiState$1.L$4 = snackbarUIState;
                paymentMainComponent$convertToUiState$1.label = 4;
                objW0 = W0(paymentBottomSheetType11, paymentMainComponent$convertToUiState$1);
                if (objW0 != obj2) {
                    paymentDataState4 = paymentDataState2;
                    toolbarUIState3 = toolbarUIState2;
                    snackbarUIState2 = snackbarUIState;
                    obj = objW0;
                    paymentBottomSheetUiType = (PaymentBottomSheetUiType) obj;
                    PaymentBottomSheetType paymentBottomSheetType12 = paymentDataState4.k;
                    z = paymentDataState4.g;
                    if (z) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    boolean z18 = !z2;
                    bottomSheetUiState = new BottomSheetUiState(new BottomSheetUiSpec(UIShape.j, 14), new BottomSheetEventHandler(z18, z18, BottomSheetRequestHandler.Companion.a(new iq0(this, 21)), 3));
                    fullScreenErrorDetails = paymentDataState4.c;
                    if (fullScreenErrorDetails != null) {
                        newErrorWithMsgAndRetry = new StandardErrorScreenUIState.NewErrorWithMsgAndRetry(new ImageUIState(fullScreenErrorDetails.c, (String) null, (ChaloColorToken) null, new ImageUISize(Dp.m7278constructorimpl(200)), UIContentScale.Fit, 0.0f, (UiEventHandler) null, 230), new TextUIState.ChaloTextUIState(fullScreenErrorDetails.f1513a, UITextStyle.DisplaySmall, ChaloColorToken.AlmostBlackColor.f9756a, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152), new TextUIState.ChaloTextUIState(fullScreenErrorDetails.b, UITextStyle.BodyMedium, ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), ButtonUIStateFactory.f(ButtonUIStateFactory.f9921a, new TextUIState.ChaloTextUIState(fullScreenErrorDetails.d, UITextStyle.HeadlineSmall, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new iq0(this, 16), UIShape.e, false, 0.0f, 52), null, 48);
                    } else {
                        newErrorWithMsgAndRetry = null;
                    }
                    uiEventHandler$Companion$fromLambda$1A = UiEventHandler.Companion.a(new r9(z, this, 3));
                    boolean z19 = paymentDataState4.d;
                    paymentMainComponent$convertToUiState$1.L$0 = paymentDataState4;
                    paymentMainComponent$convertToUiState$1.L$1 = toolbarUIState3;
                    paymentMainComponent$convertToUiState$1.L$2 = list3;
                    paymentMainComponent$convertToUiState$1.L$3 = noUpiAppsErrorUiState2;
                    paymentMainComponent$convertToUiState$1.L$4 = snackbarUIState2;
                    paymentMainComponent$convertToUiState$1.L$5 = paymentBottomSheetUiType;
                    paymentMainComponent$convertToUiState$1.L$6 = bottomSheetUiState;
                    paymentMainComponent$convertToUiState$1.L$7 = newErrorWithMsgAndRetry;
                    paymentMainComponent$convertToUiState$1.L$8 = uiEventHandler$Companion$fromLambda$1A;
                    paymentMainComponent$convertToUiState$1.label = 5;
                    objA1 = a1(z19, paymentMainComponent$convertToUiState$1);
                    if (objA1 != obj2) {
                        paymentBottomSheetUiType2 = paymentBottomSheetUiType;
                        obj = objA1;
                        list4 = list3;
                        snackbarUIState3 = snackbarUIState2;
                        noUpiAppsErrorUiState3 = noUpiAppsErrorUiState2;
                        uiEventHandler = uiEventHandler$Companion$fromLambda$1A;
                        bottomSheetUiState2 = bottomSheetUiState;
                        loadingDialogUIState = (LoadingDialogUIState) obj;
                        if (paymentDataState4.b) {
                            circularProgressIndicatorUIStateA = CircularProgressIndicatorUIStateFactory.a();
                        } else {
                            circularProgressIndicatorUIStateA = null;
                        }
                        if (paymentDataState4.q) {
                            paymentMainComponent$convertToUiState$1.L$0 = toolbarUIState3;
                            paymentMainComponent$convertToUiState$1.L$1 = list4;
                            paymentMainComponent$convertToUiState$1.L$2 = noUpiAppsErrorUiState3;
                            paymentMainComponent$convertToUiState$1.L$3 = snackbarUIState3;
                            paymentMainComponent$convertToUiState$1.L$4 = paymentBottomSheetUiType2;
                            paymentMainComponent$convertToUiState$1.L$5 = bottomSheetUiState2;
                            paymentMainComponent$convertToUiState$1.L$6 = newErrorWithMsgAndRetry;
                            paymentMainComponent$convertToUiState$1.L$7 = uiEventHandler;
                            paymentMainComponent$convertToUiState$1.L$8 = loadingDialogUIState;
                            paymentMainComponent$convertToUiState$1.L$9 = circularProgressIndicatorUIStateA;
                            paymentMainComponent$convertToUiState$1.label = 6;
                            objF1 = f1(paymentMainComponent$convertToUiState$1);
                            if (objF1 != obj2) {
                                loadingDialogUIState3 = loadingDialogUIState;
                                obj = objF1;
                                toolbarUIState5 = toolbarUIState3;
                                noUpiAppsErrorUiState5 = noUpiAppsErrorUiState3;
                                circularProgressIndicatorUIState2 = circularProgressIndicatorUIStateA;
                                circularProgressIndicatorUIState = circularProgressIndicatorUIState2;
                                confirmationDialogUiState = (ConfirmationDialogUiState) obj;
                                toolbarUIState4 = toolbarUIState5;
                                loadingDialogUIState2 = loadingDialogUIState3;
                                noUpiAppsErrorUiState4 = noUpiAppsErrorUiState5;
                            }
                        } else {
                            noUpiAppsErrorUiState4 = noUpiAppsErrorUiState3;
                            loadingDialogUIState2 = loadingDialogUIState;
                            toolbarUIState4 = toolbarUIState3;
                            circularProgressIndicatorUIState = circularProgressIndicatorUIStateA;
                            confirmationDialogUiState = null;
                        }
                        return new PaymentViewState(toolbarUIState4, confirmationDialogUiState, list4, noUpiAppsErrorUiState4, paymentBottomSheetUiType2, bottomSheetUiState2, loadingDialogUIState2, circularProgressIndicatorUIState, snackbarUIState3, newErrorWithMsgAndRetry, uiEventHandler);
                    }
                }
                return obj2;
            case 4:
                snackbarUIState2 = (SnackbarUIState) paymentMainComponent$convertToUiState$1.L$4;
                noUpiAppsErrorUiState2 = (NoUpiAppsErrorUiState) paymentMainComponent$convertToUiState$1.L$3;
                list3 = (List) paymentMainComponent$convertToUiState$1.L$2;
                toolbarUIState3 = (ToolbarUIState) paymentMainComponent$convertToUiState$1.L$1;
                PaymentDataState paymentDataState7 = (PaymentDataState) paymentMainComponent$convertToUiState$1.L$0;
                ResultKt.b(obj);
                paymentDataState4 = paymentDataState7;
                paymentBottomSheetUiType = (PaymentBottomSheetUiType) obj;
                PaymentBottomSheetType paymentBottomSheetType13 = paymentDataState4.k;
                z = paymentDataState4.g;
                if (z) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                boolean z110 = !z2;
                bottomSheetUiState = new BottomSheetUiState(new BottomSheetUiSpec(UIShape.j, 14), new BottomSheetEventHandler(z110, z110, BottomSheetRequestHandler.Companion.a(new iq0(this, 21)), 3));
                fullScreenErrorDetails = paymentDataState4.c;
                if (fullScreenErrorDetails != null) {
                    newErrorWithMsgAndRetry = new StandardErrorScreenUIState.NewErrorWithMsgAndRetry(new ImageUIState(fullScreenErrorDetails.c, (String) null, (ChaloColorToken) null, new ImageUISize(Dp.m7278constructorimpl(200)), UIContentScale.Fit, 0.0f, (UiEventHandler) null, 230), new TextUIState.ChaloTextUIState(fullScreenErrorDetails.f1513a, UITextStyle.DisplaySmall, ChaloColorToken.AlmostBlackColor.f9756a, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152), new TextUIState.ChaloTextUIState(fullScreenErrorDetails.b, UITextStyle.BodyMedium, ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), ButtonUIStateFactory.f(ButtonUIStateFactory.f9921a, new TextUIState.ChaloTextUIState(fullScreenErrorDetails.d, UITextStyle.HeadlineSmall, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new iq0(this, 16), UIShape.e, false, 0.0f, 52), null, 48);
                } else {
                    newErrorWithMsgAndRetry = null;
                }
                uiEventHandler$Companion$fromLambda$1A = UiEventHandler.Companion.a(new r9(z, this, 3));
                boolean z111 = paymentDataState4.d;
                paymentMainComponent$convertToUiState$1.L$0 = paymentDataState4;
                paymentMainComponent$convertToUiState$1.L$1 = toolbarUIState3;
                paymentMainComponent$convertToUiState$1.L$2 = list3;
                paymentMainComponent$convertToUiState$1.L$3 = noUpiAppsErrorUiState2;
                paymentMainComponent$convertToUiState$1.L$4 = snackbarUIState2;
                paymentMainComponent$convertToUiState$1.L$5 = paymentBottomSheetUiType;
                paymentMainComponent$convertToUiState$1.L$6 = bottomSheetUiState;
                paymentMainComponent$convertToUiState$1.L$7 = newErrorWithMsgAndRetry;
                paymentMainComponent$convertToUiState$1.L$8 = uiEventHandler$Companion$fromLambda$1A;
                paymentMainComponent$convertToUiState$1.label = 5;
                objA1 = a1(z111, paymentMainComponent$convertToUiState$1);
                if (objA1 != obj2) {
                    paymentBottomSheetUiType2 = paymentBottomSheetUiType;
                    obj = objA1;
                    list4 = list3;
                    snackbarUIState3 = snackbarUIState2;
                    noUpiAppsErrorUiState3 = noUpiAppsErrorUiState2;
                    uiEventHandler = uiEventHandler$Companion$fromLambda$1A;
                    bottomSheetUiState2 = bottomSheetUiState;
                    loadingDialogUIState = (LoadingDialogUIState) obj;
                    if (paymentDataState4.b) {
                        circularProgressIndicatorUIStateA = CircularProgressIndicatorUIStateFactory.a();
                    } else {
                        circularProgressIndicatorUIStateA = null;
                    }
                    if (paymentDataState4.q) {
                        paymentMainComponent$convertToUiState$1.L$0 = toolbarUIState3;
                        paymentMainComponent$convertToUiState$1.L$1 = list4;
                        paymentMainComponent$convertToUiState$1.L$2 = noUpiAppsErrorUiState3;
                        paymentMainComponent$convertToUiState$1.L$3 = snackbarUIState3;
                        paymentMainComponent$convertToUiState$1.L$4 = paymentBottomSheetUiType2;
                        paymentMainComponent$convertToUiState$1.L$5 = bottomSheetUiState2;
                        paymentMainComponent$convertToUiState$1.L$6 = newErrorWithMsgAndRetry;
                        paymentMainComponent$convertToUiState$1.L$7 = uiEventHandler;
                        paymentMainComponent$convertToUiState$1.L$8 = loadingDialogUIState;
                        paymentMainComponent$convertToUiState$1.L$9 = circularProgressIndicatorUIStateA;
                        paymentMainComponent$convertToUiState$1.label = 6;
                        objF1 = f1(paymentMainComponent$convertToUiState$1);
                        if (objF1 != obj2) {
                            loadingDialogUIState3 = loadingDialogUIState;
                            obj = objF1;
                            toolbarUIState5 = toolbarUIState3;
                            noUpiAppsErrorUiState5 = noUpiAppsErrorUiState3;
                            circularProgressIndicatorUIState2 = circularProgressIndicatorUIStateA;
                            circularProgressIndicatorUIState = circularProgressIndicatorUIState2;
                            confirmationDialogUiState = (ConfirmationDialogUiState) obj;
                            toolbarUIState4 = toolbarUIState5;
                            loadingDialogUIState2 = loadingDialogUIState3;
                            noUpiAppsErrorUiState4 = noUpiAppsErrorUiState5;
                        }
                    } else {
                        noUpiAppsErrorUiState4 = noUpiAppsErrorUiState3;
                        loadingDialogUIState2 = loadingDialogUIState;
                        toolbarUIState4 = toolbarUIState3;
                        circularProgressIndicatorUIState = circularProgressIndicatorUIStateA;
                        confirmationDialogUiState = null;
                    }
                    return new PaymentViewState(toolbarUIState4, confirmationDialogUiState, list4, noUpiAppsErrorUiState4, paymentBottomSheetUiType2, bottomSheetUiState2, loadingDialogUIState2, circularProgressIndicatorUIState, snackbarUIState3, newErrorWithMsgAndRetry, uiEventHandler);
                }
                return obj2;
            case 5:
                UiEventHandler uiEventHandler2 = (UiEventHandler) paymentMainComponent$convertToUiState$1.L$8;
                StandardErrorScreenUIState standardErrorScreenUIState = (StandardErrorScreenUIState) paymentMainComponent$convertToUiState$1.L$7;
                BottomSheetUiState bottomSheetUiState3 = (BottomSheetUiState) paymentMainComponent$convertToUiState$1.L$6;
                PaymentBottomSheetUiType paymentBottomSheetUiType3 = (PaymentBottomSheetUiType) paymentMainComponent$convertToUiState$1.L$5;
                snackbarUIState3 = (SnackbarUIState) paymentMainComponent$convertToUiState$1.L$4;
                NoUpiAppsErrorUiState noUpiAppsErrorUiState7 = (NoUpiAppsErrorUiState) paymentMainComponent$convertToUiState$1.L$3;
                list4 = (List) paymentMainComponent$convertToUiState$1.L$2;
                ToolbarUIState toolbarUIState9 = (ToolbarUIState) paymentMainComponent$convertToUiState$1.L$1;
                paymentDataState4 = (PaymentDataState) paymentMainComponent$convertToUiState$1.L$0;
                ResultKt.b(obj);
                paymentBottomSheetUiType2 = paymentBottomSheetUiType3;
                bottomSheetUiState2 = bottomSheetUiState3;
                newErrorWithMsgAndRetry = standardErrorScreenUIState;
                uiEventHandler = uiEventHandler2;
                noUpiAppsErrorUiState3 = noUpiAppsErrorUiState7;
                toolbarUIState3 = toolbarUIState9;
                loadingDialogUIState = (LoadingDialogUIState) obj;
                if (paymentDataState4.b) {
                    circularProgressIndicatorUIStateA = CircularProgressIndicatorUIStateFactory.a();
                } else {
                    circularProgressIndicatorUIStateA = null;
                }
                if (paymentDataState4.q) {
                    paymentMainComponent$convertToUiState$1.L$0 = toolbarUIState3;
                    paymentMainComponent$convertToUiState$1.L$1 = list4;
                    paymentMainComponent$convertToUiState$1.L$2 = noUpiAppsErrorUiState3;
                    paymentMainComponent$convertToUiState$1.L$3 = snackbarUIState3;
                    paymentMainComponent$convertToUiState$1.L$4 = paymentBottomSheetUiType2;
                    paymentMainComponent$convertToUiState$1.L$5 = bottomSheetUiState2;
                    paymentMainComponent$convertToUiState$1.L$6 = newErrorWithMsgAndRetry;
                    paymentMainComponent$convertToUiState$1.L$7 = uiEventHandler;
                    paymentMainComponent$convertToUiState$1.L$8 = loadingDialogUIState;
                    paymentMainComponent$convertToUiState$1.L$9 = circularProgressIndicatorUIStateA;
                    paymentMainComponent$convertToUiState$1.label = 6;
                    objF1 = f1(paymentMainComponent$convertToUiState$1);
                    if (objF1 != obj2) {
                        loadingDialogUIState3 = loadingDialogUIState;
                        obj = objF1;
                        toolbarUIState5 = toolbarUIState3;
                        noUpiAppsErrorUiState5 = noUpiAppsErrorUiState3;
                        circularProgressIndicatorUIState2 = circularProgressIndicatorUIStateA;
                        circularProgressIndicatorUIState = circularProgressIndicatorUIState2;
                        confirmationDialogUiState = (ConfirmationDialogUiState) obj;
                        toolbarUIState4 = toolbarUIState5;
                        loadingDialogUIState2 = loadingDialogUIState3;
                        noUpiAppsErrorUiState4 = noUpiAppsErrorUiState5;
                    }
                    return obj2;
                }
                noUpiAppsErrorUiState4 = noUpiAppsErrorUiState3;
                loadingDialogUIState2 = loadingDialogUIState;
                toolbarUIState4 = toolbarUIState3;
                circularProgressIndicatorUIState = circularProgressIndicatorUIStateA;
                confirmationDialogUiState = null;
                return new PaymentViewState(toolbarUIState4, confirmationDialogUiState, list4, noUpiAppsErrorUiState4, paymentBottomSheetUiType2, bottomSheetUiState2, loadingDialogUIState2, circularProgressIndicatorUIState, snackbarUIState3, newErrorWithMsgAndRetry, uiEventHandler);
            case 6:
                circularProgressIndicatorUIState2 = (CircularProgressIndicatorUIState) paymentMainComponent$convertToUiState$1.L$9;
                loadingDialogUIState3 = (LoadingDialogUIState) paymentMainComponent$convertToUiState$1.L$8;
                uiEventHandler = (UiEventHandler) paymentMainComponent$convertToUiState$1.L$7;
                newErrorWithMsgAndRetry = (StandardErrorScreenUIState) paymentMainComponent$convertToUiState$1.L$6;
                bottomSheetUiState2 = (BottomSheetUiState) paymentMainComponent$convertToUiState$1.L$5;
                paymentBottomSheetUiType2 = (PaymentBottomSheetUiType) paymentMainComponent$convertToUiState$1.L$4;
                snackbarUIState3 = (SnackbarUIState) paymentMainComponent$convertToUiState$1.L$3;
                noUpiAppsErrorUiState5 = (NoUpiAppsErrorUiState) paymentMainComponent$convertToUiState$1.L$2;
                list4 = (List) paymentMainComponent$convertToUiState$1.L$1;
                toolbarUIState5 = (ToolbarUIState) paymentMainComponent$convertToUiState$1.L$0;
                ResultKt.b(obj);
                circularProgressIndicatorUIState = circularProgressIndicatorUIState2;
                confirmationDialogUiState = (ConfirmationDialogUiState) obj;
                toolbarUIState4 = toolbarUIState5;
                loadingDialogUIState2 = loadingDialogUIState3;
                noUpiAppsErrorUiState4 = noUpiAppsErrorUiState5;
                return new PaymentViewState(toolbarUIState4, confirmationDialogUiState, list4, noUpiAppsErrorUiState4, paymentBottomSheetUiType2, bottomSheetUiState2, loadingDialogUIState2, circularProgressIndicatorUIState, snackbarUIState3, newErrorWithMsgAndRetry, uiEventHandler);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void U0() {
        String message = "dismissPaymentBottomSheet, currentBottomSheetType: " + ((PaymentDataState) this.f.getValue()).k;
        Intrinsics.i(message, "message");
        E0(new jq0(1));
    }

    public final void V0(String str) {
        ICheckoutAnalyticsHelper.DefaultImpls.a(this.t, "checkout activity finished", MapsKt.h(new Pair("reason", str)), 12);
        q0(new iq0(this, 27));
    }

    /* JADX WARN: Code duplicated, block: B:33:0x016b A[PHI: r1 r2
      0x016b: PHI (r1v8 app.chalo.uistate.text.TextUIState$ChaloTextUIState) = (r1v7 app.chalo.uistate.text.TextUIState$ChaloTextUIState), (r1v10 app.chalo.uistate.text.TextUIState$ChaloTextUIState) binds: [B:31:0x0167, B:23:0x0100] A[DONT_GENERATE, DONT_INLINE]
      0x016b: PHI (r2v14 java.lang.Object) = (r2v13 java.lang.Object), (r2v1 java.lang.Object) binds: [B:31:0x0167, B:23:0x0100] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:40:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:51:0x026e A[PHI: r1 r2 r5 r7 r9 r14
      0x026e: PHI (r1v23 app.chalo.uistate.image.ImageUIState) = (r1v20 app.chalo.uistate.image.ImageUIState), (r1v27 app.chalo.uistate.image.ImageUIState) binds: [B:49:0x026a, B:18:0x00b1] A[DONT_GENERATE, DONT_INLINE]
      0x026e: PHI (r2v23 app.chalo.providers.stringprovider.StringProvider) = (r2v21 app.chalo.providers.stringprovider.StringProvider), (r2v25 app.chalo.providers.stringprovider.StringProvider) binds: [B:49:0x026a, B:18:0x00b1] A[DONT_GENERATE, DONT_INLINE]
      0x026e: PHI (r5v18 int A[IMMUTABLE_TYPE]) = (r5v16 int), (r5v22 int) binds: [B:49:0x026a, B:18:0x00b1] A[DONT_GENERATE, DONT_INLINE]
      0x026e: PHI (r7v20 java.lang.Object) = (r7v18 java.lang.Object), (r7v23 java.lang.Object) binds: [B:49:0x026a, B:18:0x00b1] A[DONT_GENERATE, DONT_INLINE]
      0x026e: PHI (r9v5 app.chalo.uistate.base.ChaloColorToken$ShadyGray) = (r9v3 app.chalo.uistate.base.ChaloColorToken$ShadyGray), (r9v7 app.chalo.uistate.base.ChaloColorToken$ShadyGray) binds: [B:49:0x026a, B:18:0x00b1] A[DONT_GENERATE, DONT_INLINE]
      0x026e: PHI (r14v20 app.chalo.uistate.text.TextUIState$ChaloTextUIState) = 
      (r14v19 app.chalo.uistate.text.TextUIState$ChaloTextUIState)
      (r14v21 app.chalo.uistate.text.TextUIState$ChaloTextUIState)
     binds: [B:49:0x026a, B:18:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:66:0x038c A[PHI: r1 r2 r5 r6 r7 r8 r9 r14
      0x038c: PHI (r1v35 app.chalo.uistate.bottomsheet.BottomSheetContentUiSpecs) = 
      (r1v32 app.chalo.uistate.bottomsheet.BottomSheetContentUiSpecs)
      (r1v39 app.chalo.uistate.bottomsheet.BottomSheetContentUiSpecs)
     binds: [B:64:0x0389, B:14:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x038c: PHI (r2v31 app.chalo.providers.stringprovider.StringProvider) = (r2v29 app.chalo.providers.stringprovider.StringProvider), (r2v33 app.chalo.providers.stringprovider.StringProvider) binds: [B:64:0x0389, B:14:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x038c: PHI (r5v29 int A[IMMUTABLE_TYPE]) = (r5v25 int), (r5v34 int) binds: [B:64:0x0389, B:14:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x038c: PHI (r6v17 app.chalo.uistate.bottomsheet.DrawType$Icon) = (r6v15 app.chalo.uistate.bottomsheet.DrawType$Icon), (r6v19 app.chalo.uistate.bottomsheet.DrawType$Icon) binds: [B:64:0x0389, B:14:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x038c: PHI (r7v26 app.chalo.uistate.bottomsheet.BottomSheetUiState) = (r7v24 app.chalo.uistate.bottomsheet.BottomSheetUiState), (r7v29 app.chalo.uistate.bottomsheet.BottomSheetUiState) binds: [B:64:0x0389, B:14:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x038c: PHI (r8v24 java.lang.Object) = (r8v20 java.lang.Object), (r8v28 java.lang.Object) binds: [B:64:0x0389, B:14:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x038c: PHI (r9v10 app.chalo.uistate.base.ChaloColorToken$ShadyGray) = (r9v8 app.chalo.uistate.base.ChaloColorToken$ShadyGray), (r9v12 app.chalo.uistate.base.ChaloColorToken$ShadyGray) binds: [B:64:0x0389, B:14:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x038c: PHI (r14v25 app.chalo.uistate.text.TextUIState$ChaloTextUIState) = 
      (r14v24 app.chalo.uistate.text.TextUIState$ChaloTextUIState)
      (r14v26 app.chalo.uistate.text.TextUIState$ChaloTextUIState)
     binds: [B:64:0x0389, B:14:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object W0(PaymentBottomSheetType paymentBottomSheetType, ContinuationImpl continuationImpl) {
        PaymentMainComponent$getBottomSheetContentUiType$1 paymentMainComponent$getBottomSheetContentUiType$1;
        int i;
        StringProvider stringProvider;
        ChaloColorToken.ShadyGray shadyGray;
        DrawType.Icon icon;
        Object objB;
        BottomSheetUiState bottomSheetUiState;
        BottomSheetContentUiSpecs bottomSheetContentUiSpecs;
        ImageUIState imageUIState;
        Object objB2;
        TextUIState.ChaloTextUIState chaloTextUIState;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        ButtonUIState buttonUIStateF;
        Object objH1;
        TextUIState.ChaloTextUIState chaloTextUIState4;
        TextUIState.ChaloTextUIState chaloTextUIState5;
        ButtonUIState buttonUIState;
        TextUIState.ChaloTextUIState chaloTextUIState6;
        Object objB3;
        TextUIState.ChaloTextUIState chaloTextUIState7;
        ImageUIState imageUIState2;
        TextUIState.ChaloTextUIState chaloTextUIState8;
        TextUIState.ChaloTextUIState chaloTextUIState9;
        TextUIState.ChaloTextUIState chaloTextUIState10;
        Object objB4;
        TextUIState.ChaloTextUIState chaloTextUIState11;
        BottomSheetContentUiSpecs bottomSheetContentUiSpecs2;
        BottomSheetUiState bottomSheetUiState2;
        TextUIState.ChaloTextUIState chaloTextUIState12;
        TextUIState.ChaloTextUIState chaloTextUIState13;
        if (continuationImpl instanceof PaymentMainComponent$getBottomSheetContentUiType$1) {
            paymentMainComponent$getBottomSheetContentUiType$1 = (PaymentMainComponent$getBottomSheetContentUiType$1) continuationImpl;
            int i2 = paymentMainComponent$getBottomSheetContentUiType$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMainComponent$getBottomSheetContentUiType$1.label = i2 - Integer.MIN_VALUE;
            } else {
                paymentMainComponent$getBottomSheetContentUiType$1 = new PaymentMainComponent$getBottomSheetContentUiType$1(this, continuationImpl);
            }
        } else {
            paymentMainComponent$getBottomSheetContentUiType$1 = new PaymentMainComponent$getBottomSheetContentUiType$1(this, continuationImpl);
        }
        Object objB5 = paymentMainComponent$getBottomSheetContentUiType$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = paymentMainComponent$getBottomSheetContentUiType$1.label;
        int i4 = 10;
        int i5 = 9;
        StateFlow stateFlow = this.f;
        ChaloColorToken.White white = ChaloColorToken.White.f9870a;
        ButtonUIStateFactory buttonUIStateFactory = ButtonUIStateFactory.f9921a;
        ChaloColorToken.Black black = ChaloColorToken.Black.f9759a;
        ChaloColorToken.ShadyGray shadyGray2 = ChaloColorToken.ShadyGray.f9851a;
        StringProvider stringProvider2 = this.A;
        switch (i3) {
            case 0:
                ResultKt.b(objB5);
                if (Intrinsics.d(paymentBottomSheetType, PaymentBottomSheetType.ChaloPayLowBalanceBottomsheet.f1519a)) {
                    StringEnum stringEnum = StringEnum.TEXT_TICKET_PRICE;
                    Object[] objArr = {((PaymentDataState) stateFlow.getValue()).h};
                    paymentMainComponent$getBottomSheetContentUiType$1.label = 1;
                    objB5 = stringProvider2.b(stringEnum, objArr, paymentMainComponent$getBottomSheetContentUiType$1);
                    if (objB5 != obj) {
                        chaloTextUIState = new TextUIState.ChaloTextUIState((String) objB5, UITextStyle.BodyMedium, shadyGray2, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                        StringEnum stringEnum2 = StringEnum.TEXT_INSUFFICIENT_WALLET_BALANCE;
                        Object[] objArr2 = {((PaymentDataState) stateFlow.getValue()).i};
                        paymentMainComponent$getBottomSheetContentUiType$1.L$0 = chaloTextUIState;
                        paymentMainComponent$getBottomSheetContentUiType$1.label = 2;
                        objB5 = stringProvider2.b(stringEnum2, objArr2, paymentMainComponent$getBottomSheetContentUiType$1);
                        if (objB5 != obj) {
                            chaloTextUIState2 = new TextUIState.ChaloTextUIState((String) objB5, UITextStyle.DisplaySmall, black, 0, (UITextAlign) null, (UIFontWeight) null, new Integer(24), (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8056);
                            paymentMainComponent$getBottomSheetContentUiType$1.L$0 = buttonUIStateFactory;
                            paymentMainComponent$getBottomSheetContentUiType$1.L$1 = chaloTextUIState;
                            paymentMainComponent$getBottomSheetContentUiType$1.L$2 = chaloTextUIState2;
                            paymentMainComponent$getBottomSheetContentUiType$1.label = 3;
                            objB5 = stringProvider2.b(StringEnum.RECHARGE, new Object[0], paymentMainComponent$getBottomSheetContentUiType$1);
                            if (objB5 != obj) {
                                chaloTextUIState3 = chaloTextUIState2;
                                buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory, new TextUIState.ChaloTextUIState((String) objB5, UITextStyle.HeadlineSmall, white, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new iq0(this, i5), UIShape.e, false, 0.0f, 52);
                                paymentMainComponent$getBottomSheetContentUiType$1.L$0 = chaloTextUIState;
                                paymentMainComponent$getBottomSheetContentUiType$1.L$1 = chaloTextUIState3;
                                paymentMainComponent$getBottomSheetContentUiType$1.L$2 = buttonUIStateF;
                                paymentMainComponent$getBottomSheetContentUiType$1.label = 4;
                                objH1 = h1(paymentMainComponent$getBottomSheetContentUiType$1);
                                if (objH1 != obj) {
                                    chaloTextUIState4 = chaloTextUIState;
                                    chaloTextUIState5 = chaloTextUIState3;
                                    buttonUIState = buttonUIStateF;
                                    return new PaymentBottomSheetUiType.ChaloPayLowBalanceBottomsheetUiState(chaloTextUIState4, chaloTextUIState5, buttonUIState, (TextUIState.StyledTextUIState) objH1, !((PaymentDataState) stateFlow.getValue()).s);
                                }
                            }
                        }
                    }
                } else {
                    i = 0;
                    stringProvider = stringProvider2;
                    shadyGray = shadyGray2;
                    if (Intrinsics.d(paymentBottomSheetType, PaymentBottomSheetType.ChaloWalletBlockedBottomsheet.f1520a)) {
                        imageUIState = new ImageUIState(IconType.CHALO_PAY_BLOCKED, (String) null, (ChaloColorToken) null, (ImageUISize) null, UIContentScale.Fit, 0.0f, (UiEventHandler) null, 238);
                        paymentMainComponent$getBottomSheetContentUiType$1.L$0 = imageUIState;
                        paymentMainComponent$getBottomSheetContentUiType$1.label = 5;
                        objB2 = stringProvider.b(StringEnum.CHALO_PAY_BLOCKED_ERROR_TITLE, new Object[0], paymentMainComponent$getBottomSheetContentUiType$1);
                        if (objB2 != obj) {
                            chaloTextUIState6 = new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.DisplaySmall, black, 0, (UITextAlign) null, (UIFontWeight) null, new Integer(24), (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8056);
                            paymentMainComponent$getBottomSheetContentUiType$1.L$0 = imageUIState;
                            paymentMainComponent$getBottomSheetContentUiType$1.L$1 = chaloTextUIState6;
                            paymentMainComponent$getBottomSheetContentUiType$1.label = 6;
                            objB3 = stringProvider.b(StringEnum.CHALO_PAY_BLOCKED_ERROR_MESSAGE, new Object[i], paymentMainComponent$getBottomSheetContentUiType$1);
                            if (objB3 != obj) {
                                chaloTextUIState7 = new TextUIState.ChaloTextUIState((String) objB3, UITextStyle.BodyMedium, shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                                paymentMainComponent$getBottomSheetContentUiType$1.L$0 = imageUIState;
                                paymentMainComponent$getBottomSheetContentUiType$1.L$1 = chaloTextUIState6;
                                paymentMainComponent$getBottomSheetContentUiType$1.L$2 = chaloTextUIState7;
                                paymentMainComponent$getBottomSheetContentUiType$1.L$3 = buttonUIStateFactory;
                                paymentMainComponent$getBottomSheetContentUiType$1.label = 7;
                                objB5 = stringProvider.b(StringEnum.OKAY, new Object[i], paymentMainComponent$getBottomSheetContentUiType$1);
                                if (objB5 != obj) {
                                    imageUIState2 = imageUIState;
                                    chaloTextUIState8 = chaloTextUIState7;
                                    chaloTextUIState9 = chaloTextUIState6;
                                    return new PaymentBottomSheetUiType.ChaloWalletBlockedBottomsheetUiState(ButtonUIStateFactory.f(buttonUIStateFactory, new TextUIState.ChaloTextUIState((String) objB5, UITextStyle.HeadlineSmall, white, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new iq0(this, i4), null, false, 0.0f, 60), imageUIState2, chaloTextUIState9, chaloTextUIState8);
                                }
                            }
                        }
                    } else {
                        boolean zD = Intrinsics.d(paymentBottomSheetType, PaymentBottomSheetType.InAppUpiSmsPermissionBottomSheet.f1521a);
                        UiAlignment.Horizontal.Start start = UiAlignment.Horizontal.Start.f9886a;
                        if (!zD) {
                            DrawType icon2 = null;
                            if (!(paymentBottomSheetType instanceof PaymentBottomSheetType.PaymentStatusBottomSheet)) {
                                if (paymentBottomSheetType == null) {
                                    return null;
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                            BottomSheetContentUiSpecs bottomSheetContentUiSpecs3 = new BottomSheetContentUiSpecs(new ChaloPadding(0.0f, 0.0f, 3), start, 0.0f, 0.0f, 0.0f, TypedValues.PositionType.TYPE_PERCENT_X);
                            PaymentStatusAlertDetails paymentStatusAlertDetails = ((PaymentBottomSheetType.PaymentStatusBottomSheet) paymentBottomSheetType).f1522a;
                            LottieType lottieType = paymentStatusAlertDetails.c;
                            if (lottieType != null) {
                                icon2 = new DrawType.Gif(new GifImageUIState(lottieType, lottieType == LottieType.PAYMENT_PENDING ? Integer.MAX_VALUE : 1, new ImageUISize(Dp.m7276boximpl(Dp.m7278constructorimpl(150)), Dp.m7276boximpl(Dp.m7278constructorimpl(TsExtractor.TS_STREAM_TYPE_SPLICE_INFO)))));
                            } else {
                                IconType iconType = paymentStatusAlertDetails.d;
                                if (iconType != null) {
                                    icon2 = new DrawType.Icon(new ImageUIState(iconType, (String) null, (ChaloColorToken) null, new ImageUISize(Dp.m7276boximpl(Dp.m7278constructorimpl(150)), Dp.m7276boximpl(Dp.m7278constructorimpl(TsExtractor.TS_STREAM_TYPE_SPLICE_INFO))), UIContentScale.Fit, 0.0f, (UiEventHandler) null, 230));
                                }
                            }
                            return new PaymentBottomSheetUiType.PaymentStatusBottomSheetUiState(new BottomSheetStandardContentUiState(null, bottomSheetContentUiSpecs3, icon2, new TextUIState.ChaloTextUIState(paymentStatusAlertDetails.f1548a, UITextStyle.DisplayMedium, black, 0, (UITextAlign) null, UIFontWeight.Bold, new Integer(24), (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7992), new TextUIState.ChaloTextUIState(paymentStatusAlertDetails.b, UITextStyle.BodyMedium, shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), ButtonUIStateFactory.f(buttonUIStateFactory, new TextUIState.ChaloTextUIState(paymentStatusAlertDetails.e, UITextStyle.HeadlineSmall, white, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new zf0(25, this, paymentBottomSheetType), UIShape.d, false, 0.0f, 52), null, null, 193));
                        }
                        BottomSheetUiState bottomSheetUiState3 = new BottomSheetUiState(new BottomSheetEventHandler(false, false, BottomSheetRequestHandler.Companion.a(new iq0(this, 11)), 63), 1);
                        icon = new DrawType.Icon(new ImageUIState(IconType.IC_SMS_PERMISSION, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254));
                        BottomSheetContentUiSpecs bottomSheetContentUiSpecs4 = new BottomSheetContentUiSpecs(new ChaloPadding(0.0f, 0.0f, 3), start, 0.0f, 0.0f, 0.0f, TypedValues.PositionType.TYPE_PERCENT_X);
                        paymentMainComponent$getBottomSheetContentUiType$1.L$0 = bottomSheetUiState3;
                        paymentMainComponent$getBottomSheetContentUiType$1.L$1 = icon;
                        paymentMainComponent$getBottomSheetContentUiType$1.L$2 = bottomSheetContentUiSpecs4;
                        paymentMainComponent$getBottomSheetContentUiType$1.label = 8;
                        objB = stringProvider.b(StringEnum.PHONE_SMS_PERMISSION_INFO_BOTTOMSHEET_TITLE, new Object[0], paymentMainComponent$getBottomSheetContentUiType$1);
                        if (objB != obj) {
                            bottomSheetUiState = bottomSheetUiState3;
                            bottomSheetContentUiSpecs = bottomSheetContentUiSpecs4;
                            chaloTextUIState10 = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.DisplayMedium, black, 0, (UITextAlign) null, UIFontWeight.Bold, new Integer(24), (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7992);
                            paymentMainComponent$getBottomSheetContentUiType$1.L$0 = bottomSheetUiState;
                            paymentMainComponent$getBottomSheetContentUiType$1.L$1 = icon;
                            paymentMainComponent$getBottomSheetContentUiType$1.L$2 = bottomSheetContentUiSpecs;
                            paymentMainComponent$getBottomSheetContentUiType$1.L$3 = chaloTextUIState10;
                            paymentMainComponent$getBottomSheetContentUiType$1.label = 9;
                            objB4 = stringProvider.b(StringEnum.PHONE_SMS_PERMISSION_INFO_BOTTOMSHEET_SUB_TITLE, new Object[i], paymentMainComponent$getBottomSheetContentUiType$1);
                            if (objB4 != obj) {
                                chaloTextUIState11 = new TextUIState.ChaloTextUIState((String) objB4, UITextStyle.BodyMedium, shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                                paymentMainComponent$getBottomSheetContentUiType$1.L$0 = bottomSheetUiState;
                                paymentMainComponent$getBottomSheetContentUiType$1.L$1 = icon;
                                paymentMainComponent$getBottomSheetContentUiType$1.L$2 = bottomSheetContentUiSpecs;
                                paymentMainComponent$getBottomSheetContentUiType$1.L$3 = chaloTextUIState10;
                                paymentMainComponent$getBottomSheetContentUiType$1.L$4 = chaloTextUIState11;
                                paymentMainComponent$getBottomSheetContentUiType$1.L$5 = buttonUIStateFactory;
                                paymentMainComponent$getBottomSheetContentUiType$1.label = 10;
                                objB5 = stringProvider.b(StringEnum.OKAY_SMALL, new Object[i], paymentMainComponent$getBottomSheetContentUiType$1);
                                if (objB5 != obj) {
                                    bottomSheetContentUiSpecs2 = bottomSheetContentUiSpecs;
                                    bottomSheetUiState2 = bottomSheetUiState;
                                    chaloTextUIState12 = chaloTextUIState11;
                                    chaloTextUIState13 = chaloTextUIState10;
                                    return new PaymentBottomSheetUiType.InAppUpiSmsPermissionBottomSheetUiState(new BottomSheetStandardContentUiState(bottomSheetUiState2, bottomSheetContentUiSpecs2, icon, chaloTextUIState13, chaloTextUIState12, ButtonUIStateFactory.f(buttonUIStateFactory, new TextUIState.ChaloTextUIState((String) objB5, UITextStyle.HeadlineSmall, white, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new iq0(this, 12), UIShape.d, false, 0.0f, 52), null, null, 192));
                                }
                            }
                        }
                    }
                }
                return obj;
            case 1:
                ResultKt.b(objB5);
                chaloTextUIState = new TextUIState.ChaloTextUIState((String) objB5, UITextStyle.BodyMedium, shadyGray2, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                StringEnum stringEnum3 = StringEnum.TEXT_INSUFFICIENT_WALLET_BALANCE;
                Object[] objArr3 = {((PaymentDataState) stateFlow.getValue()).i};
                paymentMainComponent$getBottomSheetContentUiType$1.L$0 = chaloTextUIState;
                paymentMainComponent$getBottomSheetContentUiType$1.label = 2;
                objB5 = stringProvider2.b(stringEnum3, objArr3, paymentMainComponent$getBottomSheetContentUiType$1);
                if (objB5 != obj) {
                    chaloTextUIState2 = new TextUIState.ChaloTextUIState((String) objB5, UITextStyle.DisplaySmall, black, 0, (UITextAlign) null, (UIFontWeight) null, new Integer(24), (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8056);
                    paymentMainComponent$getBottomSheetContentUiType$1.L$0 = buttonUIStateFactory;
                    paymentMainComponent$getBottomSheetContentUiType$1.L$1 = chaloTextUIState;
                    paymentMainComponent$getBottomSheetContentUiType$1.L$2 = chaloTextUIState2;
                    paymentMainComponent$getBottomSheetContentUiType$1.label = 3;
                    objB5 = stringProvider2.b(StringEnum.RECHARGE, new Object[0], paymentMainComponent$getBottomSheetContentUiType$1);
                    if (objB5 != obj) {
                        chaloTextUIState3 = chaloTextUIState2;
                        buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory, new TextUIState.ChaloTextUIState((String) objB5, UITextStyle.HeadlineSmall, white, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new iq0(this, i5), UIShape.e, false, 0.0f, 52);
                        paymentMainComponent$getBottomSheetContentUiType$1.L$0 = chaloTextUIState;
                        paymentMainComponent$getBottomSheetContentUiType$1.L$1 = chaloTextUIState3;
                        paymentMainComponent$getBottomSheetContentUiType$1.L$2 = buttonUIStateF;
                        paymentMainComponent$getBottomSheetContentUiType$1.label = 4;
                        objH1 = h1(paymentMainComponent$getBottomSheetContentUiType$1);
                        if (objH1 != obj) {
                            chaloTextUIState4 = chaloTextUIState;
                            chaloTextUIState5 = chaloTextUIState3;
                            buttonUIState = buttonUIStateF;
                            return new PaymentBottomSheetUiType.ChaloPayLowBalanceBottomsheetUiState(chaloTextUIState4, chaloTextUIState5, buttonUIState, (TextUIState.StyledTextUIState) objH1, !((PaymentDataState) stateFlow.getValue()).s);
                        }
                    }
                }
                return obj;
            case 2:
                chaloTextUIState = (TextUIState.ChaloTextUIState) paymentMainComponent$getBottomSheetContentUiType$1.L$0;
                ResultKt.b(objB5);
                chaloTextUIState2 = new TextUIState.ChaloTextUIState((String) objB5, UITextStyle.DisplaySmall, black, 0, (UITextAlign) null, (UIFontWeight) null, new Integer(24), (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8056);
                paymentMainComponent$getBottomSheetContentUiType$1.L$0 = buttonUIStateFactory;
                paymentMainComponent$getBottomSheetContentUiType$1.L$1 = chaloTextUIState;
                paymentMainComponent$getBottomSheetContentUiType$1.L$2 = chaloTextUIState2;
                paymentMainComponent$getBottomSheetContentUiType$1.label = 3;
                objB5 = stringProvider2.b(StringEnum.RECHARGE, new Object[0], paymentMainComponent$getBottomSheetContentUiType$1);
                if (objB5 != obj) {
                    chaloTextUIState3 = chaloTextUIState2;
                    buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory, new TextUIState.ChaloTextUIState((String) objB5, UITextStyle.HeadlineSmall, white, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new iq0(this, i5), UIShape.e, false, 0.0f, 52);
                    paymentMainComponent$getBottomSheetContentUiType$1.L$0 = chaloTextUIState;
                    paymentMainComponent$getBottomSheetContentUiType$1.L$1 = chaloTextUIState3;
                    paymentMainComponent$getBottomSheetContentUiType$1.L$2 = buttonUIStateF;
                    paymentMainComponent$getBottomSheetContentUiType$1.label = 4;
                    objH1 = h1(paymentMainComponent$getBottomSheetContentUiType$1);
                    if (objH1 != obj) {
                        chaloTextUIState4 = chaloTextUIState;
                        chaloTextUIState5 = chaloTextUIState3;
                        buttonUIState = buttonUIStateF;
                        return new PaymentBottomSheetUiType.ChaloPayLowBalanceBottomsheetUiState(chaloTextUIState4, chaloTextUIState5, buttonUIState, (TextUIState.StyledTextUIState) objH1, !((PaymentDataState) stateFlow.getValue()).s);
                    }
                }
                return obj;
            case 3:
                TextUIState.ChaloTextUIState chaloTextUIState14 = (TextUIState.ChaloTextUIState) paymentMainComponent$getBottomSheetContentUiType$1.L$2;
                TextUIState.ChaloTextUIState chaloTextUIState15 = (TextUIState.ChaloTextUIState) paymentMainComponent$getBottomSheetContentUiType$1.L$1;
                buttonUIStateFactory = (ButtonUIStateFactory) paymentMainComponent$getBottomSheetContentUiType$1.L$0;
                ResultKt.b(objB5);
                chaloTextUIState3 = chaloTextUIState14;
                chaloTextUIState = chaloTextUIState15;
                buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory, new TextUIState.ChaloTextUIState((String) objB5, UITextStyle.HeadlineSmall, white, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new iq0(this, i5), UIShape.e, false, 0.0f, 52);
                paymentMainComponent$getBottomSheetContentUiType$1.L$0 = chaloTextUIState;
                paymentMainComponent$getBottomSheetContentUiType$1.L$1 = chaloTextUIState3;
                paymentMainComponent$getBottomSheetContentUiType$1.L$2 = buttonUIStateF;
                paymentMainComponent$getBottomSheetContentUiType$1.label = 4;
                objH1 = h1(paymentMainComponent$getBottomSheetContentUiType$1);
                if (objH1 != obj) {
                    chaloTextUIState4 = chaloTextUIState;
                    chaloTextUIState5 = chaloTextUIState3;
                    buttonUIState = buttonUIStateF;
                    return new PaymentBottomSheetUiType.ChaloPayLowBalanceBottomsheetUiState(chaloTextUIState4, chaloTextUIState5, buttonUIState, (TextUIState.StyledTextUIState) objH1, !((PaymentDataState) stateFlow.getValue()).s);
                }
                return obj;
            case 4:
                ButtonUIState buttonUIState2 = (ButtonUIState) paymentMainComponent$getBottomSheetContentUiType$1.L$2;
                TextUIState.ChaloTextUIState chaloTextUIState16 = (TextUIState.ChaloTextUIState) paymentMainComponent$getBottomSheetContentUiType$1.L$1;
                TextUIState.ChaloTextUIState chaloTextUIState17 = (TextUIState.ChaloTextUIState) paymentMainComponent$getBottomSheetContentUiType$1.L$0;
                ResultKt.b(objB5);
                buttonUIState = buttonUIState2;
                chaloTextUIState4 = chaloTextUIState17;
                objH1 = objB5;
                chaloTextUIState5 = chaloTextUIState16;
                return new PaymentBottomSheetUiType.ChaloPayLowBalanceBottomsheetUiState(chaloTextUIState4, chaloTextUIState5, buttonUIState, (TextUIState.StyledTextUIState) objH1, !((PaymentDataState) stateFlow.getValue()).s);
            case 5:
                imageUIState = (ImageUIState) paymentMainComponent$getBottomSheetContentUiType$1.L$0;
                ResultKt.b(objB5);
                objB2 = objB5;
                i = 0;
                stringProvider = stringProvider2;
                shadyGray = shadyGray2;
                chaloTextUIState6 = new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.DisplaySmall, black, 0, (UITextAlign) null, (UIFontWeight) null, new Integer(24), (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8056);
                paymentMainComponent$getBottomSheetContentUiType$1.L$0 = imageUIState;
                paymentMainComponent$getBottomSheetContentUiType$1.L$1 = chaloTextUIState6;
                paymentMainComponent$getBottomSheetContentUiType$1.label = 6;
                objB3 = stringProvider.b(StringEnum.CHALO_PAY_BLOCKED_ERROR_MESSAGE, new Object[i], paymentMainComponent$getBottomSheetContentUiType$1);
                if (objB3 != obj) {
                    chaloTextUIState7 = new TextUIState.ChaloTextUIState((String) objB3, UITextStyle.BodyMedium, shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                    paymentMainComponent$getBottomSheetContentUiType$1.L$0 = imageUIState;
                    paymentMainComponent$getBottomSheetContentUiType$1.L$1 = chaloTextUIState6;
                    paymentMainComponent$getBottomSheetContentUiType$1.L$2 = chaloTextUIState7;
                    paymentMainComponent$getBottomSheetContentUiType$1.L$3 = buttonUIStateFactory;
                    paymentMainComponent$getBottomSheetContentUiType$1.label = 7;
                    objB5 = stringProvider.b(StringEnum.OKAY, new Object[i], paymentMainComponent$getBottomSheetContentUiType$1);
                    if (objB5 != obj) {
                        imageUIState2 = imageUIState;
                        chaloTextUIState8 = chaloTextUIState7;
                        chaloTextUIState9 = chaloTextUIState6;
                        return new PaymentBottomSheetUiType.ChaloWalletBlockedBottomsheetUiState(ButtonUIStateFactory.f(buttonUIStateFactory, new TextUIState.ChaloTextUIState((String) objB5, UITextStyle.HeadlineSmall, white, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new iq0(this, i4), null, false, 0.0f, 60), imageUIState2, chaloTextUIState9, chaloTextUIState8);
                    }
                }
                return obj;
            case 6:
                TextUIState.ChaloTextUIState chaloTextUIState18 = (TextUIState.ChaloTextUIState) paymentMainComponent$getBottomSheetContentUiType$1.L$1;
                ImageUIState imageUIState3 = (ImageUIState) paymentMainComponent$getBottomSheetContentUiType$1.L$0;
                ResultKt.b(objB5);
                chaloTextUIState6 = chaloTextUIState18;
                imageUIState = imageUIState3;
                i = 0;
                objB3 = objB5;
                stringProvider = stringProvider2;
                shadyGray = shadyGray2;
                chaloTextUIState7 = new TextUIState.ChaloTextUIState((String) objB3, UITextStyle.BodyMedium, shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                paymentMainComponent$getBottomSheetContentUiType$1.L$0 = imageUIState;
                paymentMainComponent$getBottomSheetContentUiType$1.L$1 = chaloTextUIState6;
                paymentMainComponent$getBottomSheetContentUiType$1.L$2 = chaloTextUIState7;
                paymentMainComponent$getBottomSheetContentUiType$1.L$3 = buttonUIStateFactory;
                paymentMainComponent$getBottomSheetContentUiType$1.label = 7;
                objB5 = stringProvider.b(StringEnum.OKAY, new Object[i], paymentMainComponent$getBottomSheetContentUiType$1);
                if (objB5 != obj) {
                    imageUIState2 = imageUIState;
                    chaloTextUIState8 = chaloTextUIState7;
                    chaloTextUIState9 = chaloTextUIState6;
                    return new PaymentBottomSheetUiType.ChaloWalletBlockedBottomsheetUiState(ButtonUIStateFactory.f(buttonUIStateFactory, new TextUIState.ChaloTextUIState((String) objB5, UITextStyle.HeadlineSmall, white, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new iq0(this, i4), null, false, 0.0f, 60), imageUIState2, chaloTextUIState9, chaloTextUIState8);
                }
                return obj;
            case 7:
                buttonUIStateFactory = (ButtonUIStateFactory) paymentMainComponent$getBottomSheetContentUiType$1.L$3;
                chaloTextUIState8 = (TextUIState.ChaloTextUIState) paymentMainComponent$getBottomSheetContentUiType$1.L$2;
                chaloTextUIState9 = (TextUIState.ChaloTextUIState) paymentMainComponent$getBottomSheetContentUiType$1.L$1;
                imageUIState2 = (ImageUIState) paymentMainComponent$getBottomSheetContentUiType$1.L$0;
                ResultKt.b(objB5);
                return new PaymentBottomSheetUiType.ChaloWalletBlockedBottomsheetUiState(ButtonUIStateFactory.f(buttonUIStateFactory, new TextUIState.ChaloTextUIState((String) objB5, UITextStyle.HeadlineSmall, white, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new iq0(this, i4), null, false, 0.0f, 60), imageUIState2, chaloTextUIState9, chaloTextUIState8);
            case 8:
                bottomSheetContentUiSpecs = (BottomSheetContentUiSpecs) paymentMainComponent$getBottomSheetContentUiType$1.L$2;
                DrawType.Icon icon3 = (DrawType.Icon) paymentMainComponent$getBottomSheetContentUiType$1.L$1;
                BottomSheetUiState bottomSheetUiState4 = (BottomSheetUiState) paymentMainComponent$getBottomSheetContentUiType$1.L$0;
                ResultKt.b(objB5);
                icon = icon3;
                bottomSheetUiState = bottomSheetUiState4;
                i = 0;
                shadyGray = shadyGray2;
                objB = objB5;
                stringProvider = stringProvider2;
                chaloTextUIState10 = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.DisplayMedium, black, 0, (UITextAlign) null, UIFontWeight.Bold, new Integer(24), (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7992);
                paymentMainComponent$getBottomSheetContentUiType$1.L$0 = bottomSheetUiState;
                paymentMainComponent$getBottomSheetContentUiType$1.L$1 = icon;
                paymentMainComponent$getBottomSheetContentUiType$1.L$2 = bottomSheetContentUiSpecs;
                paymentMainComponent$getBottomSheetContentUiType$1.L$3 = chaloTextUIState10;
                paymentMainComponent$getBottomSheetContentUiType$1.label = 9;
                objB4 = stringProvider.b(StringEnum.PHONE_SMS_PERMISSION_INFO_BOTTOMSHEET_SUB_TITLE, new Object[i], paymentMainComponent$getBottomSheetContentUiType$1);
                if (objB4 != obj) {
                    chaloTextUIState11 = new TextUIState.ChaloTextUIState((String) objB4, UITextStyle.BodyMedium, shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                    paymentMainComponent$getBottomSheetContentUiType$1.L$0 = bottomSheetUiState;
                    paymentMainComponent$getBottomSheetContentUiType$1.L$1 = icon;
                    paymentMainComponent$getBottomSheetContentUiType$1.L$2 = bottomSheetContentUiSpecs;
                    paymentMainComponent$getBottomSheetContentUiType$1.L$3 = chaloTextUIState10;
                    paymentMainComponent$getBottomSheetContentUiType$1.L$4 = chaloTextUIState11;
                    paymentMainComponent$getBottomSheetContentUiType$1.L$5 = buttonUIStateFactory;
                    paymentMainComponent$getBottomSheetContentUiType$1.label = 10;
                    objB5 = stringProvider.b(StringEnum.OKAY_SMALL, new Object[i], paymentMainComponent$getBottomSheetContentUiType$1);
                    if (objB5 != obj) {
                        bottomSheetContentUiSpecs2 = bottomSheetContentUiSpecs;
                        bottomSheetUiState2 = bottomSheetUiState;
                        chaloTextUIState12 = chaloTextUIState11;
                        chaloTextUIState13 = chaloTextUIState10;
                        return new PaymentBottomSheetUiType.InAppUpiSmsPermissionBottomSheetUiState(new BottomSheetStandardContentUiState(bottomSheetUiState2, bottomSheetContentUiSpecs2, icon, chaloTextUIState13, chaloTextUIState12, ButtonUIStateFactory.f(buttonUIStateFactory, new TextUIState.ChaloTextUIState((String) objB5, UITextStyle.HeadlineSmall, white, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new iq0(this, 12), UIShape.d, false, 0.0f, 52), null, null, 192));
                    }
                }
                return obj;
            case 9:
                TextUIState.ChaloTextUIState chaloTextUIState19 = (TextUIState.ChaloTextUIState) paymentMainComponent$getBottomSheetContentUiType$1.L$3;
                BottomSheetContentUiSpecs bottomSheetContentUiSpecs5 = (BottomSheetContentUiSpecs) paymentMainComponent$getBottomSheetContentUiType$1.L$2;
                DrawType.Icon icon4 = (DrawType.Icon) paymentMainComponent$getBottomSheetContentUiType$1.L$1;
                BottomSheetUiState bottomSheetUiState5 = (BottomSheetUiState) paymentMainComponent$getBottomSheetContentUiType$1.L$0;
                ResultKt.b(objB5);
                chaloTextUIState10 = chaloTextUIState19;
                bottomSheetContentUiSpecs = bottomSheetContentUiSpecs5;
                i = 0;
                icon = icon4;
                bottomSheetUiState = bottomSheetUiState5;
                shadyGray = shadyGray2;
                objB4 = objB5;
                stringProvider = stringProvider2;
                chaloTextUIState11 = new TextUIState.ChaloTextUIState((String) objB4, UITextStyle.BodyMedium, shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                paymentMainComponent$getBottomSheetContentUiType$1.L$0 = bottomSheetUiState;
                paymentMainComponent$getBottomSheetContentUiType$1.L$1 = icon;
                paymentMainComponent$getBottomSheetContentUiType$1.L$2 = bottomSheetContentUiSpecs;
                paymentMainComponent$getBottomSheetContentUiType$1.L$3 = chaloTextUIState10;
                paymentMainComponent$getBottomSheetContentUiType$1.L$4 = chaloTextUIState11;
                paymentMainComponent$getBottomSheetContentUiType$1.L$5 = buttonUIStateFactory;
                paymentMainComponent$getBottomSheetContentUiType$1.label = 10;
                objB5 = stringProvider.b(StringEnum.OKAY_SMALL, new Object[i], paymentMainComponent$getBottomSheetContentUiType$1);
                if (objB5 != obj) {
                    bottomSheetContentUiSpecs2 = bottomSheetContentUiSpecs;
                    bottomSheetUiState2 = bottomSheetUiState;
                    chaloTextUIState12 = chaloTextUIState11;
                    chaloTextUIState13 = chaloTextUIState10;
                    return new PaymentBottomSheetUiType.InAppUpiSmsPermissionBottomSheetUiState(new BottomSheetStandardContentUiState(bottomSheetUiState2, bottomSheetContentUiSpecs2, icon, chaloTextUIState13, chaloTextUIState12, ButtonUIStateFactory.f(buttonUIStateFactory, new TextUIState.ChaloTextUIState((String) objB5, UITextStyle.HeadlineSmall, white, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new iq0(this, 12), UIShape.d, false, 0.0f, 52), null, null, 192));
                }
                return obj;
            case 10:
                buttonUIStateFactory = (ButtonUIStateFactory) paymentMainComponent$getBottomSheetContentUiType$1.L$5;
                chaloTextUIState12 = (TextUIState.ChaloTextUIState) paymentMainComponent$getBottomSheetContentUiType$1.L$4;
                chaloTextUIState13 = (TextUIState.ChaloTextUIState) paymentMainComponent$getBottomSheetContentUiType$1.L$3;
                bottomSheetContentUiSpecs2 = (BottomSheetContentUiSpecs) paymentMainComponent$getBottomSheetContentUiType$1.L$2;
                icon = (DrawType.Icon) paymentMainComponent$getBottomSheetContentUiType$1.L$1;
                bottomSheetUiState2 = (BottomSheetUiState) paymentMainComponent$getBottomSheetContentUiType$1.L$0;
                ResultKt.b(objB5);
                return new PaymentBottomSheetUiType.InAppUpiSmsPermissionBottomSheetUiState(new BottomSheetStandardContentUiState(bottomSheetUiState2, bottomSheetContentUiSpecs2, icon, chaloTextUIState13, chaloTextUIState12, ButtonUIStateFactory.f(buttonUIStateFactory, new TextUIState.ChaloTextUIState((String) objB5, UITextStyle.HeadlineSmall, white, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new iq0(this, 12), UIShape.d, false, 0.0f, 52), null, null, 192));
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0069, code lost:
    
        if (r8 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0079, code lost:
    
        if (r8 == r1) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object X0(app.chalo.walletframework.chalopay.WalletCTA r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof app.chalo.checkout.ui.screen.payment.PaymentMainComponent$getBottomsheetCTA$1
            if (r0 == 0) goto L13
            r0 = r8
            app.chalo.checkout.ui.screen.payment.PaymentMainComponent$getBottomsheetCTA$1 r0 = (app.chalo.checkout.ui.screen.payment.PaymentMainComponent$getBottomsheetCTA$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.checkout.ui.screen.payment.PaymentMainComponent$getBottomsheetCTA$1 r0 = new app.chalo.checkout.ui.screen.payment.PaymentMainComponent$getBottomsheetCTA$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r8)
            goto L7c
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            kotlin.ResultKt.b(r8)
            goto L6c
        L36:
            kotlin.ResultKt.b(r8)
            r8 = -1
            if (r7 != 0) goto L3e
            r7 = r8
            goto L46
        L3e:
            int[] r2 = app.chalo.checkout.ui.screen.payment.PaymentMainComponent.WhenMappings.i
            int r7 = r7.ordinal()
            r7 = r2[r7]
        L46:
            r2 = 0
            app.chalo.providers.stringprovider.StringProvider r5 = r6.A
            if (r7 == r8) goto L6f
            if (r7 == r4) goto L5f
            if (r7 == r3) goto L6f
            r8 = 3
            if (r7 == r8) goto L6f
            r8 = 4
            if (r7 == r8) goto L6f
            r8 = 5
            if (r7 != r8) goto L59
            goto L6f
        L59:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L5f:
            app.chalo.providers.stringprovider.StringEnum r7 = app.chalo.providers.stringprovider.StringEnum.RECHARGE_CAPS
            java.lang.Object[] r8 = new java.lang.Object[r2]
            r0.label = r4
            java.lang.Object r8 = r5.b(r7, r8, r0)
            if (r8 != r1) goto L6c
            goto L7b
        L6c:
            java.lang.String r8 = (java.lang.String) r8
            return r8
        L6f:
            app.chalo.providers.stringprovider.StringEnum r7 = app.chalo.providers.stringprovider.StringEnum.CONFIRM_PAYMENT
            java.lang.Object[] r8 = new java.lang.Object[r2]
            r0.label = r3
            java.lang.Object r8 = r5.b(r7, r8, r0)
            if (r8 != r1) goto L7c
        L7b:
            return r1
        L7c:
            java.lang.String r8 = (java.lang.String) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.checkout.ui.screen.payment.PaymentMainComponent.X0(app.chalo.walletframework.chalopay.WalletCTA, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:121:0x024b  */
    /* JADX WARN: Code duplicated, block: B:123:0x025d  */
    /* JADX WARN: Code duplicated, block: B:129:0x028e A[PHI: r2 r4 r8
      0x028e: PHI (r2v20 app.chalo.checkout.ui.screen.payment.PaymentMainComponent$getCheckoutScreenUiItemList$1) = 
      (r2v21 app.chalo.checkout.ui.screen.payment.PaymentMainComponent$getCheckoutScreenUiItemList$1)
      (r2v21 app.chalo.checkout.ui.screen.payment.PaymentMainComponent$getCheckoutScreenUiItemList$1)
      (r2v22 app.chalo.checkout.ui.screen.payment.PaymentMainComponent$getCheckoutScreenUiItemList$1)
     binds: [B:127:0x0278, B:128:0x027a, B:131:0x0298] A[DONT_GENERATE, DONT_INLINE]
      0x028e: PHI (r4v13 java.util.Iterator) = (r4v14 java.util.Iterator), (r4v14 java.util.Iterator), (r4v15 java.util.Iterator) binds: [B:127:0x0278, B:128:0x027a, B:131:0x0298] A[DONT_GENERATE, DONT_INLINE]
      0x028e: PHI (r8v11 java.util.List) = (r8v12 java.util.List), (r8v12 java.util.List), (r8v13 java.util.List) binds: [B:127:0x0278, B:128:0x027a, B:131:0x0298] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:130:0x0291  */
    /* JADX WARN: Code duplicated, block: B:132:0x029a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:129:0x028e -> B:119:0x0245). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:133:0x02b0 -> B:135:0x02b3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00ca -> B:111:0x0211). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00ce -> B:111:0x0211). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00d2 -> B:111:0x0211). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00d6 -> B:111:0x0211). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x00da -> B:111:0x0211). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00de -> B:111:0x0211). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x00e2 -> B:111:0x0211). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x00e6 -> B:111:0x0211). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x00f0 -> B:111:0x0211). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0127 -> B:69:0x012d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object Y0(java.util.List r21, java.util.ArrayList r22, java.util.List r23, kotlin.coroutines.jvm.internal.ContinuationImpl r24) {
        /*
            Method dump skipped, instruction units count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.checkout.ui.screen.payment.PaymentMainComponent.Y0(java.util.List, java.util.ArrayList, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final String Z0() {
        return this.l.s().f2683a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a1(boolean z, ContinuationImpl continuationImpl) {
        PaymentMainComponent$getLoaderUiState$1 paymentMainComponent$getLoaderUiState$1;
        DialogUIStateFactory dialogUIStateFactory;
        if (continuationImpl instanceof PaymentMainComponent$getLoaderUiState$1) {
            paymentMainComponent$getLoaderUiState$1 = (PaymentMainComponent$getLoaderUiState$1) continuationImpl;
            int i = paymentMainComponent$getLoaderUiState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                paymentMainComponent$getLoaderUiState$1.label = i - Integer.MIN_VALUE;
            } else {
                paymentMainComponent$getLoaderUiState$1 = new PaymentMainComponent$getLoaderUiState$1(this, continuationImpl);
            }
        } else {
            paymentMainComponent$getLoaderUiState$1 = new PaymentMainComponent$getLoaderUiState$1(this, continuationImpl);
        }
        Object objB = paymentMainComponent$getLoaderUiState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = paymentMainComponent$getLoaderUiState$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            if (!z) {
                return null;
            }
            DialogUIStateFactory dialogUIStateFactory2 = DialogUIStateFactory.f9989a;
            paymentMainComponent$getLoaderUiState$1.L$0 = dialogUIStateFactory2;
            paymentMainComponent$getLoaderUiState$1.label = 1;
            objB = this.A.b(StringEnum.LOADING_THREE_DOTS, new Object[0], paymentMainComponent$getLoaderUiState$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            dialogUIStateFactory = dialogUIStateFactory2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dialogUIStateFactory = (DialogUIStateFactory) paymentMainComponent$getLoaderUiState$1.L$0;
            ResultKt.b(objB);
        }
        dialogUIStateFactory.getClass();
        return DialogUIStateFactory.a((String) objB);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object b1(ContinuationImpl continuationImpl) {
        PaymentMainComponent$getNoUpiAppsErrorUiState$1 paymentMainComponent$getNoUpiAppsErrorUiState$1;
        NoUpiAppsErrorUiSpecs noUpiAppsErrorUiSpecs;
        NoUpiAppsErrorUiSpecs noUpiAppsErrorUiSpecs2;
        TextUIState.ChaloTextUIState chaloTextUIState;
        if (continuationImpl instanceof PaymentMainComponent$getNoUpiAppsErrorUiState$1) {
            paymentMainComponent$getNoUpiAppsErrorUiState$1 = (PaymentMainComponent$getNoUpiAppsErrorUiState$1) continuationImpl;
            int i = paymentMainComponent$getNoUpiAppsErrorUiState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                paymentMainComponent$getNoUpiAppsErrorUiState$1.label = i - Integer.MIN_VALUE;
            } else {
                paymentMainComponent$getNoUpiAppsErrorUiState$1 = new PaymentMainComponent$getNoUpiAppsErrorUiState$1(this, continuationImpl);
            }
        } else {
            paymentMainComponent$getNoUpiAppsErrorUiState$1 = new PaymentMainComponent$getNoUpiAppsErrorUiState$1(this, continuationImpl);
        }
        Object objB = paymentMainComponent$getNoUpiAppsErrorUiState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = paymentMainComponent$getNoUpiAppsErrorUiState$1.label;
        ChaloColorToken.Gray42 gray42 = ChaloColorToken.Gray42.f9797a;
        StringProvider stringProvider = this.A;
        if (i2 != 0) {
            if (i2 == 1) {
                noUpiAppsErrorUiSpecs = (NoUpiAppsErrorUiSpecs) paymentMainComponent$getNoUpiAppsErrorUiState$1.L$0;
                ResultKt.b(objB);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                chaloTextUIState = (TextUIState.ChaloTextUIState) paymentMainComponent$getNoUpiAppsErrorUiState$1.L$1;
                noUpiAppsErrorUiSpecs2 = (NoUpiAppsErrorUiSpecs) paymentMainComponent$getNoUpiAppsErrorUiState$1.L$0;
                ResultKt.b(objB);
            }
            return new NoUpiAppsErrorUiState(noUpiAppsErrorUiSpecs2, chaloTextUIState, new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodyLarge, gray42, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152), new ImageUIState(IconType.UPI_EMPTY, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254));
        }
        ResultKt.b(objB);
        NoUpiAppsErrorUiSpecs noUpiAppsErrorUiSpecs3 = new NoUpiAppsErrorUiSpecs();
        paymentMainComponent$getNoUpiAppsErrorUiState$1.L$0 = noUpiAppsErrorUiSpecs3;
        paymentMainComponent$getNoUpiAppsErrorUiState$1.label = 1;
        Object objB2 = stringProvider.b(StringEnum.NO_INSTALLED_UPI_APPS_TITLE, new Object[0], paymentMainComponent$getNoUpiAppsErrorUiState$1);
        if (objB2 != coroutineSingletons) {
            noUpiAppsErrorUiSpecs = noUpiAppsErrorUiSpecs3;
            objB = objB2;
        }
        return coroutineSingletons;
        TextUIState.ChaloTextUIState chaloTextUIState2 = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.HeadlineMedium, gray42, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152);
        paymentMainComponent$getNoUpiAppsErrorUiState$1.L$0 = noUpiAppsErrorUiSpecs;
        paymentMainComponent$getNoUpiAppsErrorUiState$1.L$1 = chaloTextUIState2;
        paymentMainComponent$getNoUpiAppsErrorUiState$1.label = 2;
        objB = stringProvider.b(StringEnum.NO_INSTALLED_UPI_APPS_MSG, new Object[0], paymentMainComponent$getNoUpiAppsErrorUiState$1);
        if (objB != coroutineSingletons) {
            noUpiAppsErrorUiSpecs2 = noUpiAppsErrorUiSpecs;
            chaloTextUIState = chaloTextUIState2;
            return new NoUpiAppsErrorUiState(noUpiAppsErrorUiSpecs2, chaloTextUIState, new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodyLarge, gray42, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152), new ImageUIState(IconType.UPI_EMPTY, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254));
        }
        return coroutineSingletons;
    }

    public final CheckoutScreenSectionUiModel.OneClickUPI c1(PaymentMethodOptionsAppModel.JuspayTurboUpi juspayTurboUpi, boolean z, List list, boolean z2) {
        CheckoutCtaDetail checkoutCtaDetail = z ? new CheckoutCtaDetail(StringEnum.MANAGE_UPI_ACCOUNTS, null, new iq0(this, 22)) : null;
        return new CheckoutScreenSectionUiModel.OneClickUPI(StringEnum.ONE_CLICK_UPI, juspayTurboUpi.b.d, list, z2 ? new CheckoutCtaDetail(StringEnum.ADD_NEW_UPI_METHOD, IconType.IC_ORANGE_CIRCULAR_PLUS, new iq0(this, 23)) : null, false, checkoutCtaDetail);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x067d  */
    /* JADX WARN: Code duplicated, block: B:101:0x0695  */
    /* JADX WARN: Code duplicated, block: B:103:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:106:0x06d1  */
    /* JADX WARN: Code duplicated, block: B:109:0x0702  */
    /* JADX WARN: Code duplicated, block: B:111:0x0748  */
    /* JADX WARN: Code duplicated, block: B:114:0x0768  */
    /* JADX WARN: Code duplicated, block: B:116:0x0770  */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:27:0x025c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0299  */
    /* JADX WARN: Code duplicated, block: B:32:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:34:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:35:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:38:0x030f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0351  */
    /* JADX WARN: Code duplicated, block: B:42:0x036e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0398  */
    /* JADX WARN: Code duplicated, block: B:46:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:47:0x03de  */
    /* JADX WARN: Code duplicated, block: B:50:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:51:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:54:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:55:0x041f  */
    /* JADX WARN: Code duplicated, block: B:58:0x044f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0458  */
    /* JADX WARN: Code duplicated, block: B:65:0x0467  */
    /* JADX WARN: Code duplicated, block: B:66:0x0475  */
    /* JADX WARN: Code duplicated, block: B:70:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:71:0x04be  */
    /* JADX WARN: Code duplicated, block: B:74:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:76:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:77:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x052c  */
    /* JADX WARN: Code duplicated, block: B:81:0x054d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0571  */
    /* JADX WARN: Code duplicated, block: B:87:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:91:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:94:0x0619  */
    /* JADX WARN: Code duplicated, block: B:97:0x0647  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15, types: [app.chalo.uistate.base.ChaloColorToken, app.chalo.uistate.divider.DividerOrientation] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x0702 -> B:110:0x0712). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:111:0x0748 -> B:112:0x075d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object d1(java.util.List r55, kotlin.coroutines.jvm.internal.ContinuationImpl r56) {
        /*
            Method dump skipped, instruction units count: 1929
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.checkout.ui.screen.payment.PaymentMainComponent.d1(java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object f1(ContinuationImpl continuationImpl) {
        PaymentMainComponent$getShowPermissionDialogueState$1 paymentMainComponent$getShowPermissionDialogueState$1;
        TextUIState.ChaloTextUIState chaloTextUIState;
        DialogueCtaUiState dialogueCtaUiState;
        DialogueCtaUiState dialogueCtaUiState2;
        if (continuationImpl instanceof PaymentMainComponent$getShowPermissionDialogueState$1) {
            paymentMainComponent$getShowPermissionDialogueState$1 = (PaymentMainComponent$getShowPermissionDialogueState$1) continuationImpl;
            int i = paymentMainComponent$getShowPermissionDialogueState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                paymentMainComponent$getShowPermissionDialogueState$1.label = i - Integer.MIN_VALUE;
            } else {
                paymentMainComponent$getShowPermissionDialogueState$1 = new PaymentMainComponent$getShowPermissionDialogueState$1(this, continuationImpl);
            }
        } else {
            paymentMainComponent$getShowPermissionDialogueState$1 = new PaymentMainComponent$getShowPermissionDialogueState$1(this, continuationImpl);
        }
        Object objB = paymentMainComponent$getShowPermissionDialogueState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = paymentMainComponent$getShowPermissionDialogueState$1.label;
        ChaloColorToken.OrangePrimary orangePrimary = ChaloColorToken.OrangePrimary.f9835a;
        StringProvider stringProvider = this.A;
        if (i2 == 0) {
            ResultKt.b(objB);
            paymentMainComponent$getShowPermissionDialogueState$1.label = 1;
            objB = stringProvider.b(StringEnum.PHONE_SMS_PERMISSION_PROMPT, new Object[0], paymentMainComponent$getShowPermissionDialogueState$1);
            if (objB != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ResultKt.b(objB);
        } else {
            if (i2 == 2) {
                chaloTextUIState = (TextUIState.ChaloTextUIState) paymentMainComponent$getShowPermissionDialogueState$1.L$0;
                ResultKt.b(objB);
                dialogueCtaUiState = new DialogueCtaUiState(new TextUIState.ChaloTextUIState((String) objB, UITextStyle.HeadlineMedium, orangePrimary, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), UiEventHandler.Companion.a(new iq0(this, 7)));
                paymentMainComponent$getShowPermissionDialogueState$1.L$0 = chaloTextUIState;
                paymentMainComponent$getShowPermissionDialogueState$1.L$1 = dialogueCtaUiState;
                paymentMainComponent$getShowPermissionDialogueState$1.label = 3;
                objB = stringProvider.b(StringEnum.CANCEL, new Object[0], paymentMainComponent$getShowPermissionDialogueState$1);
                if (objB != coroutineSingletons) {
                    dialogueCtaUiState2 = dialogueCtaUiState;
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dialogueCtaUiState2 = (DialogueCtaUiState) paymentMainComponent$getShowPermissionDialogueState$1.L$1;
            TextUIState.ChaloTextUIState chaloTextUIState2 = (TextUIState.ChaloTextUIState) paymentMainComponent$getShowPermissionDialogueState$1.L$0;
            ResultKt.b(objB);
            chaloTextUIState = chaloTextUIState2;
        }
        return new ConfirmationDialogUiState(null, chaloTextUIState, new ConfirmationDialogActionCtaContainerUiState(dialogueCtaUiState2, new DialogueCtaUiState(new TextUIState.ChaloTextUIState((String) objB, UITextStyle.HeadlineMedium, orangePrimary, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), UiEventHandler.Companion.a(new iq0(this, 8))), 1), null, 17);
        TextUIState.ChaloTextUIState chaloTextUIState3 = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodyMedium, ChaloColorToken.Black_87.f9768a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
        paymentMainComponent$getShowPermissionDialogueState$1.L$0 = chaloTextUIState3;
        paymentMainComponent$getShowPermissionDialogueState$1.label = 2;
        objB = stringProvider.b(StringEnum.SETTINGS, new Object[0], paymentMainComponent$getShowPermissionDialogueState$1);
        if (objB != coroutineSingletons) {
            chaloTextUIState = chaloTextUIState3;
            dialogueCtaUiState = new DialogueCtaUiState(new TextUIState.ChaloTextUIState((String) objB, UITextStyle.HeadlineMedium, orangePrimary, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), UiEventHandler.Companion.a(new iq0(this, 7)));
            paymentMainComponent$getShowPermissionDialogueState$1.L$0 = chaloTextUIState;
            paymentMainComponent$getShowPermissionDialogueState$1.L$1 = dialogueCtaUiState;
            paymentMainComponent$getShowPermissionDialogueState$1.label = 3;
            objB = stringProvider.b(StringEnum.CANCEL, new Object[0], paymentMainComponent$getShowPermissionDialogueState$1);
            if (objB != coroutineSingletons) {
                dialogueCtaUiState2 = dialogueCtaUiState;
                return new ConfirmationDialogUiState(null, chaloTextUIState, new ConfirmationDialogActionCtaContainerUiState(dialogueCtaUiState2, new DialogueCtaUiState(new TextUIState.ChaloTextUIState((String) objB, UITextStyle.HeadlineMedium, orangePrimary, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), UiEventHandler.Companion.a(new iq0(this, 8))), 1), null, 17);
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g1(boolean z, ContinuationImpl continuationImpl) {
        PaymentMainComponent$getSnackbarUIState$1 paymentMainComponent$getSnackbarUIState$1;
        SnackbarUIStateFactory snackbarUIStateFactory;
        if (continuationImpl instanceof PaymentMainComponent$getSnackbarUIState$1) {
            paymentMainComponent$getSnackbarUIState$1 = (PaymentMainComponent$getSnackbarUIState$1) continuationImpl;
            int i = paymentMainComponent$getSnackbarUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                paymentMainComponent$getSnackbarUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                paymentMainComponent$getSnackbarUIState$1 = new PaymentMainComponent$getSnackbarUIState$1(this, continuationImpl);
            }
        } else {
            paymentMainComponent$getSnackbarUIState$1 = new PaymentMainComponent$getSnackbarUIState$1(this, continuationImpl);
        }
        Object objB = paymentMainComponent$getSnackbarUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = paymentMainComponent$getSnackbarUIState$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            if (!z) {
                return null;
            }
            SnackbarUIStateFactory snackbarUIStateFactory2 = SnackbarUIStateFactory.f10071a;
            paymentMainComponent$getSnackbarUIState$1.L$0 = snackbarUIStateFactory2;
            paymentMainComponent$getSnackbarUIState$1.label = 1;
            objB = this.A.b(StringEnum.GENERIC_ERROR_MESSAGE, new Object[0], paymentMainComponent$getSnackbarUIState$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            snackbarUIStateFactory = snackbarUIStateFactory2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            snackbarUIStateFactory = (SnackbarUIStateFactory) paymentMainComponent$getSnackbarUIState$1.L$0;
            ResultKt.b(objB);
        }
        snackbarUIStateFactory.getClass();
        return SnackbarUIStateFactory.a((String) objB, null, null);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0093  */
    /* JADX WARN: Code duplicated, block: B:27:0x0097  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object h1(ContinuationImpl continuationImpl) {
        PaymentMainComponent$getTncUiState$1 paymentMainComponent$getTncUiState$1;
        String str;
        StateFlow stateFlow;
        UITextDecoration uITextDecoration;
        PaymentMainComponent$tncStyledTextClickHandler$2$1 paymentMainComponent$tncStyledTextClickHandler$2$1;
        PaymentMainComponent$tncStyledTextClickHandler$2$1 paymentMainComponent$tncStyledTextClickHandler$2$2;
        if (continuationImpl instanceof PaymentMainComponent$getTncUiState$1) {
            paymentMainComponent$getTncUiState$1 = (PaymentMainComponent$getTncUiState$1) continuationImpl;
            int i = paymentMainComponent$getTncUiState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                paymentMainComponent$getTncUiState$1.label = i - Integer.MIN_VALUE;
            } else {
                paymentMainComponent$getTncUiState$1 = new PaymentMainComponent$getTncUiState$1(this, continuationImpl);
            }
        } else {
            paymentMainComponent$getTncUiState$1 = new PaymentMainComponent$getTncUiState$1(this, continuationImpl);
        }
        Object objB = paymentMainComponent$getTncUiState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = paymentMainComponent$getTncUiState$1.label;
        StringProvider stringProvider = this.A;
        if (i2 == 0) {
            ResultKt.b(objB);
            paymentMainComponent$getTncUiState$1.label = 1;
            objB = stringProvider.b(StringEnum.TNC_PREFIX, new Object[0], paymentMainComponent$getTncUiState$1);
            if (objB != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ResultKt.b(objB);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) paymentMainComponent$getTncUiState$1.L$0;
            ResultKt.b(objB);
        }
        String str2 = (String) objB;
        String strA = vo1.A(str, " ");
        UITextStyle uITextStyle = UITextStyle.BodyMedium;
        StyledTextDataUIState styledTextDataUIState = new StyledTextDataUIState(strA, ChaloColorToken.ShadyGray.f9851a, null, uITextStyle, null, null, null, 1012);
        stateFlow = this.f;
        if (StringsKt.F(((PaymentDataState) stateFlow.getValue()).t)) {
            uITextDecoration = UITextDecoration.None;
        } else {
            uITextDecoration = UITextDecoration.Underline;
        }
        UITextDecoration uITextDecoration2 = uITextDecoration;
        paymentMainComponent$tncStyledTextClickHandler$2$1 = (PaymentMainComponent$tncStyledTextClickHandler$2$1) this.j0.getValue();
        if (StringsKt.F(((PaymentDataState) stateFlow.getValue()).t)) {
            paymentMainComponent$tncStyledTextClickHandler$2$2 = null;
        } else {
            paymentMainComponent$tncStyledTextClickHandler$2$2 = paymentMainComponent$tncStyledTextClickHandler$2$1;
        }
        return new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIState, new StyledTextDataUIState(str2, ChaloColorToken.OrangePrimary.f9835a, null, uITextStyle, uITextDecoration2, null, paymentMainComponent$tncStyledTextClickHandler$2$2, 372)), null, null, 30);
        String str3 = (String) objB;
        paymentMainComponent$getTncUiState$1.L$0 = str3;
        paymentMainComponent$getTncUiState$1.label = 2;
        Object objB2 = stringProvider.b(StringEnum.TERMS_HOME_DRAWER, new Object[0], paymentMainComponent$getTncUiState$1);
        if (objB2 != coroutineSingletons) {
            str = str3;
            objB = objB2;
            String str4 = (String) objB;
            String strA2 = vo1.A(str, " ");
            UITextStyle uITextStyle2 = UITextStyle.BodyMedium;
            StyledTextDataUIState styledTextDataUIState2 = new StyledTextDataUIState(strA2, ChaloColorToken.ShadyGray.f9851a, null, uITextStyle2, null, null, null, 1012);
            stateFlow = this.f;
            if (StringsKt.F(((PaymentDataState) stateFlow.getValue()).t)) {
                uITextDecoration = UITextDecoration.Underline;
            } else {
                uITextDecoration = UITextDecoration.None;
            }
            UITextDecoration uITextDecoration3 = uITextDecoration;
            paymentMainComponent$tncStyledTextClickHandler$2$1 = (PaymentMainComponent$tncStyledTextClickHandler$2$1) this.j0.getValue();
            if (StringsKt.F(((PaymentDataState) stateFlow.getValue()).t)) {
                paymentMainComponent$tncStyledTextClickHandler$2$2 = paymentMainComponent$tncStyledTextClickHandler$2$1;
            } else {
                paymentMainComponent$tncStyledTextClickHandler$2$2 = null;
            }
            return new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIState2, new StyledTextDataUIState(str4, ChaloColorToken.OrangePrimary.f9835a, null, uITextStyle2, uITextDecoration3, null, paymentMainComponent$tncStyledTextClickHandler$2$2, 372)), null, null, 30);
        }
        return coroutineSingletons;
    }

    public final void i1() {
        boolean zQ1 = q1();
        ChaloPayManager chaloPayManager = this.x;
        String lowerCase = String.valueOf(((ChaloPayWalletState) chaloPayManager.d().getValue()).g).toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        this.t.h("chaloPayItemClicked", MapsKt.i(new Pair("chaloPayWalletState", lowerCase), new Pair("chaloPayWalletBalance", String.valueOf(((ChaloPayWalletState) chaloPayManager.d().getValue()).f))), zQ1);
        BuildersKt.d(this.j, this.E.b(), null, new PaymentMainComponent$handleChaloPayItemSelected$1(this, zQ1, null), 2);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0265 A[PHI: r2 r9 r10
      0x0265: PHI (r2v17 app.chalo.checkout.ui.screen.payment.PaymentMainComponent) = 
      (r2v15 app.chalo.checkout.ui.screen.payment.PaymentMainComponent)
      (r2v19 app.chalo.checkout.ui.screen.payment.PaymentMainComponent)
     binds: [B:101:0x0262, B:38:0x00d5] A[DONT_GENERATE, DONT_INLINE]
      0x0265: PHI (r9v25 java.lang.String) = (r9v22 java.lang.String), (r9v28 java.lang.String) binds: [B:101:0x0262, B:38:0x00d5] A[DONT_GENERATE, DONT_INLINE]
      0x0265: PHI (r10v23 java.lang.Object) = (r10v22 java.lang.Object), (r10v1 java.lang.Object) binds: [B:101:0x0262, B:38:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:119:0x02b8 A[PHI: r2 r9 r10
      0x02b8: PHI (r2v47 app.chalo.checkout.ui.screen.payment.PaymentMainComponent) = 
      (r2v45 app.chalo.checkout.ui.screen.payment.PaymentMainComponent)
      (r2v49 app.chalo.checkout.ui.screen.payment.PaymentMainComponent)
     binds: [B:117:0x02b5, B:14:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x02b8: PHI (r9v73 java.lang.String) = (r9v70 java.lang.String), (r9v76 java.lang.String) binds: [B:117:0x02b5, B:14:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x02b8: PHI (r10v53 java.lang.Object) = (r10v52 java.lang.Object), (r10v1 java.lang.Object) binds: [B:117:0x02b5, B:14:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:121:0x02ca A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:122:0x02cb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x0136 A[PHI: r2 r9 r10
      0x0136: PHI (r2v42 app.chalo.checkout.ui.screen.payment.PaymentMainComponent) = 
      (r2v40 app.chalo.checkout.ui.screen.payment.PaymentMainComponent)
      (r2v44 app.chalo.checkout.ui.screen.payment.PaymentMainComponent)
     binds: [B:51:0x0132, B:18:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0136: PHI (r9v65 java.lang.String) = (r9v62 java.lang.String), (r9v68 java.lang.String) binds: [B:51:0x0132, B:18:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0136: PHI (r10v48 java.lang.Object) = (r10v47 java.lang.Object), (r10v1 java.lang.Object) binds: [B:51:0x0132, B:18:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0174 A[PHI: r2 r9 r10
      0x0174: PHI (r2v37 app.chalo.checkout.ui.screen.payment.PaymentMainComponent) = 
      (r2v35 app.chalo.checkout.ui.screen.payment.PaymentMainComponent)
      (r2v39 app.chalo.checkout.ui.screen.payment.PaymentMainComponent)
     binds: [B:61:0x0170, B:22:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x0174: PHI (r9v57 java.lang.String) = (r9v54 java.lang.String), (r9v60 java.lang.String) binds: [B:61:0x0170, B:22:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x0174: PHI (r10v43 java.lang.Object) = (r10v42 java.lang.Object), (r10v1 java.lang.Object) binds: [B:61:0x0170, B:22:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x01b2 A[PHI: r2 r9 r10
      0x01b2: PHI (r2v32 app.chalo.checkout.ui.screen.payment.PaymentMainComponent) = 
      (r2v30 app.chalo.checkout.ui.screen.payment.PaymentMainComponent)
      (r2v34 app.chalo.checkout.ui.screen.payment.PaymentMainComponent)
     binds: [B:71:0x01ae, B:26:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x01b2: PHI (r9v49 java.lang.String) = (r9v46 java.lang.String), (r9v52 java.lang.String) binds: [B:71:0x01ae, B:26:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x01b2: PHI (r10v38 java.lang.Object) = (r10v37 java.lang.Object), (r10v1 java.lang.Object) binds: [B:71:0x01ae, B:26:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ef A[PHI: r2 r9 r10
      0x01ef: PHI (r2v27 app.chalo.checkout.ui.screen.payment.PaymentMainComponent) = 
      (r2v25 app.chalo.checkout.ui.screen.payment.PaymentMainComponent)
      (r2v29 app.chalo.checkout.ui.screen.payment.PaymentMainComponent)
     binds: [B:81:0x01eb, B:30:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x01ef: PHI (r9v41 java.lang.String) = (r9v38 java.lang.String), (r9v44 java.lang.String) binds: [B:81:0x01eb, B:30:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x01ef: PHI (r10v33 java.lang.Object) = (r10v32 java.lang.Object), (r10v1 java.lang.Object) binds: [B:81:0x01eb, B:30:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x022b A[PHI: r2 r9 r10
      0x022b: PHI (r2v22 app.chalo.checkout.ui.screen.payment.PaymentMainComponent) = 
      (r2v20 app.chalo.checkout.ui.screen.payment.PaymentMainComponent)
      (r2v24 app.chalo.checkout.ui.screen.payment.PaymentMainComponent)
     binds: [B:91:0x0227, B:34:0x00ba] A[DONT_GENERATE, DONT_INLINE]
      0x022b: PHI (r9v33 java.lang.String) = (r9v30 java.lang.String), (r9v36 java.lang.String) binds: [B:91:0x0227, B:34:0x00ba] A[DONT_GENERATE, DONT_INLINE]
      0x022b: PHI (r10v28 java.lang.Object) = (r10v27 java.lang.Object), (r10v1 java.lang.Object) binds: [B:91:0x0227, B:34:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    public final Object j1(UseCaseOperationError useCaseOperationError, ContinuationImpl continuationImpl) {
        PaymentMainComponent$handleChaloPaymentFailure$1 paymentMainComponent$handleChaloPaymentFailure$1;
        PaymentMainComponent paymentMainComponent;
        PaymentMainComponent paymentMainComponent2;
        PaymentMainComponent paymentMainComponent3;
        PaymentMainComponent paymentMainComponent4;
        PaymentMainComponent paymentMainComponent5;
        PaymentMainComponent paymentMainComponent6;
        PaymentMainComponent paymentMainComponent7;
        String str;
        String str2;
        PaymentStatusCTAActionType paymentStatusCTAActionType;
        String str3;
        PaymentStatusCTAActionType paymentStatusCTAActionType2;
        String str4;
        PaymentStatusCTAActionType paymentStatusCTAActionType3;
        String str5;
        PaymentStatusCTAActionType paymentStatusCTAActionType4;
        String str6;
        PaymentStatusCTAActionType paymentStatusCTAActionType5;
        String str7;
        if (continuationImpl instanceof PaymentMainComponent$handleChaloPaymentFailure$1) {
            paymentMainComponent$handleChaloPaymentFailure$1 = (PaymentMainComponent$handleChaloPaymentFailure$1) continuationImpl;
            int i = paymentMainComponent$handleChaloPaymentFailure$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                paymentMainComponent$handleChaloPaymentFailure$1.label = i - Integer.MIN_VALUE;
            } else {
                paymentMainComponent$handleChaloPaymentFailure$1 = new PaymentMainComponent$handleChaloPaymentFailure$1(this, continuationImpl);
            }
        } else {
            paymentMainComponent$handleChaloPaymentFailure$1 = new PaymentMainComponent$handleChaloPaymentFailure$1(this, continuationImpl);
        }
        Object objB = paymentMainComponent$handleChaloPaymentFailure$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = paymentMainComponent$handleChaloPaymentFailure$1.label;
        Unit unit = Unit.f17538a;
        StringProvider stringProvider = this.A;
        switch (i2) {
            case 0:
                ResultKt.b(objB);
                OperationFailureError operationFailureError = useCaseOperationError.f6000a;
                if (operationFailureError instanceof OperationFailureError.UseCaseSpecificError) {
                    switch (WhenMappings.l[((ChaloPaymentFailureReason) ((OperationFailureError.UseCaseSpecificError) operationFailureError).f5999a).ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            paymentMainComponent$handleChaloPaymentFailure$1.L$0 = this;
                            paymentMainComponent$handleChaloPaymentFailure$1.label = 1;
                            objB = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], paymentMainComponent$handleChaloPaymentFailure$1);
                            if (objB != coroutineSingletons) {
                                paymentMainComponent2 = this;
                                str = (String) objB;
                                paymentMainComponent$handleChaloPaymentFailure$1.L$0 = paymentMainComponent2;
                                paymentMainComponent$handleChaloPaymentFailure$1.L$1 = str;
                                paymentMainComponent$handleChaloPaymentFailure$1.label = 2;
                                objB = stringProvider.b(StringEnum.RETRY_PAYMENT_ERROR, new Object[0], paymentMainComponent$handleChaloPaymentFailure$1);
                                if (objB != coroutineSingletons) {
                                    paymentMainComponent$handleChaloPaymentFailure$1.L$0 = null;
                                    paymentMainComponent$handleChaloPaymentFailure$1.L$1 = null;
                                    paymentMainComponent$handleChaloPaymentFailure$1.label = 3;
                                    if (paymentMainComponent2.k1(str, (String) objB, PaymentStatusCTAActionType.STAY_ON_PAYMENT_SCREEN, paymentMainComponent$handleChaloPaymentFailure$1) == coroutineSingletons) {
                                        return unit;
                                    }
                                }
                            }
                            break;
                        case 6:
                            paymentMainComponent$handleChaloPaymentFailure$1.L$0 = this;
                            paymentMainComponent$handleChaloPaymentFailure$1.label = 4;
                            objB = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], paymentMainComponent$handleChaloPaymentFailure$1);
                            if (objB != coroutineSingletons) {
                                paymentMainComponent3 = this;
                                str2 = (String) objB;
                                paymentMainComponent$handleChaloPaymentFailure$1.L$0 = paymentMainComponent3;
                                paymentMainComponent$handleChaloPaymentFailure$1.L$1 = str2;
                                paymentMainComponent$handleChaloPaymentFailure$1.label = 5;
                                objB = stringProvider.b(StringEnum.RETRY_PAYMENT_ERROR, new Object[0], paymentMainComponent$handleChaloPaymentFailure$1);
                                if (objB != coroutineSingletons) {
                                    paymentStatusCTAActionType = PaymentStatusCTAActionType.FETCH_CHALO_WALLET;
                                    paymentMainComponent$handleChaloPaymentFailure$1.L$0 = null;
                                    paymentMainComponent$handleChaloPaymentFailure$1.L$1 = null;
                                    paymentMainComponent$handleChaloPaymentFailure$1.label = 6;
                                    if (paymentMainComponent3.k1(str2, (String) objB, paymentStatusCTAActionType, paymentMainComponent$handleChaloPaymentFailure$1) == coroutineSingletons) {
                                        return unit;
                                    }
                                }
                            }
                            break;
                        case 7:
                            paymentMainComponent$handleChaloPaymentFailure$1.L$0 = this;
                            paymentMainComponent$handleChaloPaymentFailure$1.label = 7;
                            objB = stringProvider.b(StringEnum.RECHARGE_WALLET, new Object[0], paymentMainComponent$handleChaloPaymentFailure$1);
                            if (objB != coroutineSingletons) {
                                paymentMainComponent4 = this;
                                str3 = (String) objB;
                                paymentMainComponent$handleChaloPaymentFailure$1.L$0 = paymentMainComponent4;
                                paymentMainComponent$handleChaloPaymentFailure$1.L$1 = str3;
                                paymentMainComponent$handleChaloPaymentFailure$1.label = 8;
                                objB = stringProvider.b(StringEnum.PAYMENT_FAILED_DUE_TO_INSUFFICIENT_BALANCE, new Object[0], paymentMainComponent$handleChaloPaymentFailure$1);
                                if (objB != coroutineSingletons) {
                                    paymentStatusCTAActionType2 = PaymentStatusCTAActionType.FETCH_CHALO_WALLET;
                                    paymentMainComponent$handleChaloPaymentFailure$1.L$0 = null;
                                    paymentMainComponent$handleChaloPaymentFailure$1.L$1 = null;
                                    paymentMainComponent$handleChaloPaymentFailure$1.label = 9;
                                    if (paymentMainComponent4.k1(str3, (String) objB, paymentStatusCTAActionType2, paymentMainComponent$handleChaloPaymentFailure$1) == coroutineSingletons) {
                                        return unit;
                                    }
                                }
                            }
                            break;
                        case 8:
                            paymentMainComponent$handleChaloPaymentFailure$1.L$0 = this;
                            paymentMainComponent$handleChaloPaymentFailure$1.label = 10;
                            objB = stringProvider.b(StringEnum.RECLAIM_WALLET, new Object[0], paymentMainComponent$handleChaloPaymentFailure$1);
                            if (objB != coroutineSingletons) {
                                paymentMainComponent5 = this;
                                str4 = (String) objB;
                                paymentMainComponent$handleChaloPaymentFailure$1.L$0 = paymentMainComponent5;
                                paymentMainComponent$handleChaloPaymentFailure$1.L$1 = str4;
                                paymentMainComponent$handleChaloPaymentFailure$1.label = 11;
                                objB = stringProvider.b(StringEnum.RECLAIM_WALLET_ERROR, new Object[0], paymentMainComponent$handleChaloPaymentFailure$1);
                                if (objB != coroutineSingletons) {
                                    paymentStatusCTAActionType3 = PaymentStatusCTAActionType.FETCH_CHALO_WALLET;
                                    paymentMainComponent$handleChaloPaymentFailure$1.L$0 = null;
                                    paymentMainComponent$handleChaloPaymentFailure$1.L$1 = null;
                                    paymentMainComponent$handleChaloPaymentFailure$1.label = 12;
                                    if (paymentMainComponent5.k1(str4, (String) objB, paymentStatusCTAActionType3, paymentMainComponent$handleChaloPaymentFailure$1) == coroutineSingletons) {
                                        return unit;
                                    }
                                }
                            }
                            break;
                        case 9:
                            paymentMainComponent$handleChaloPaymentFailure$1.L$0 = this;
                            paymentMainComponent$handleChaloPaymentFailure$1.label = 13;
                            objB = stringProvider.b(StringEnum.CHALO_WALLET_INACTIVE, new Object[0], paymentMainComponent$handleChaloPaymentFailure$1);
                            if (objB != coroutineSingletons) {
                                paymentMainComponent6 = this;
                                str5 = (String) objB;
                                paymentMainComponent$handleChaloPaymentFailure$1.L$0 = paymentMainComponent6;
                                paymentMainComponent$handleChaloPaymentFailure$1.L$1 = str5;
                                paymentMainComponent$handleChaloPaymentFailure$1.label = 14;
                                objB = stringProvider.b(StringEnum.CHALO_WALLET_INACTIVE_ERROR, new Object[0], paymentMainComponent$handleChaloPaymentFailure$1);
                                if (objB != coroutineSingletons) {
                                    paymentStatusCTAActionType4 = PaymentStatusCTAActionType.FETCH_CHALO_WALLET;
                                    paymentMainComponent$handleChaloPaymentFailure$1.L$0 = null;
                                    paymentMainComponent$handleChaloPaymentFailure$1.L$1 = null;
                                    paymentMainComponent$handleChaloPaymentFailure$1.label = 15;
                                    if (paymentMainComponent6.k1(str5, (String) objB, paymentStatusCTAActionType4, paymentMainComponent$handleChaloPaymentFailure$1) == coroutineSingletons) {
                                        return unit;
                                    }
                                }
                            }
                            break;
                        case 10:
                            paymentMainComponent$handleChaloPaymentFailure$1.L$0 = this;
                            paymentMainComponent$handleChaloPaymentFailure$1.label = 16;
                            objB = stringProvider.b(StringEnum.CHALO_WALLET_BLOCKED, new Object[0], paymentMainComponent$handleChaloPaymentFailure$1);
                            if (objB != coroutineSingletons) {
                                paymentMainComponent7 = this;
                                str6 = (String) objB;
                                paymentMainComponent$handleChaloPaymentFailure$1.L$0 = paymentMainComponent7;
                                paymentMainComponent$handleChaloPaymentFailure$1.L$1 = str6;
                                paymentMainComponent$handleChaloPaymentFailure$1.label = 17;
                                objB = stringProvider.b(StringEnum.CHALO_WALLET_BLOCKED_ERROR, new Object[0], paymentMainComponent$handleChaloPaymentFailure$1);
                                if (objB != coroutineSingletons) {
                                    paymentStatusCTAActionType5 = PaymentStatusCTAActionType.FETCH_CHALO_WALLET;
                                    paymentMainComponent$handleChaloPaymentFailure$1.L$0 = null;
                                    paymentMainComponent$handleChaloPaymentFailure$1.L$1 = null;
                                    paymentMainComponent$handleChaloPaymentFailure$1.label = 18;
                                    if (paymentMainComponent7.k1(str6, (String) objB, paymentStatusCTAActionType5, paymentMainComponent$handleChaloPaymentFailure$1) == coroutineSingletons) {
                                        return unit;
                                    }
                                }
                            }
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                } else {
                    if (!(operationFailureError instanceof OperationFailureError.DataFetchOperationFailure)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    switch (WhenMappings.k[((OperationFailureError.DataFetchOperationFailure) operationFailureError).f5998a.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                            paymentMainComponent$handleChaloPaymentFailure$1.L$0 = this;
                            paymentMainComponent$handleChaloPaymentFailure$1.label = 19;
                            objB = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], paymentMainComponent$handleChaloPaymentFailure$1);
                            if (objB != coroutineSingletons) {
                                paymentMainComponent = this;
                                str7 = (String) objB;
                                paymentMainComponent$handleChaloPaymentFailure$1.L$0 = paymentMainComponent;
                                paymentMainComponent$handleChaloPaymentFailure$1.L$1 = str7;
                                paymentMainComponent$handleChaloPaymentFailure$1.label = 20;
                                objB = stringProvider.b(StringEnum.RETRY_PAYMENT_ERROR, new Object[0], paymentMainComponent$handleChaloPaymentFailure$1);
                                if (objB != coroutineSingletons) {
                                    paymentMainComponent$handleChaloPaymentFailure$1.L$0 = null;
                                    paymentMainComponent$handleChaloPaymentFailure$1.L$1 = null;
                                    paymentMainComponent$handleChaloPaymentFailure$1.label = 21;
                                    if (paymentMainComponent.k1(str7, (String) objB, PaymentStatusCTAActionType.STAY_ON_PAYMENT_SCREEN, paymentMainComponent$handleChaloPaymentFailure$1) == coroutineSingletons) {
                                        return unit;
                                    }
                                }
                            }
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
                return coroutineSingletons;
            case 1:
                PaymentMainComponent paymentMainComponent8 = (PaymentMainComponent) paymentMainComponent$handleChaloPaymentFailure$1.L$0;
                ResultKt.b(objB);
                paymentMainComponent2 = paymentMainComponent8;
                str = (String) objB;
                paymentMainComponent$handleChaloPaymentFailure$1.L$0 = paymentMainComponent2;
                paymentMainComponent$handleChaloPaymentFailure$1.L$1 = str;
                paymentMainComponent$handleChaloPaymentFailure$1.label = 2;
                objB = stringProvider.b(StringEnum.RETRY_PAYMENT_ERROR, new Object[0], paymentMainComponent$handleChaloPaymentFailure$1);
                if (objB != coroutineSingletons) {
                    paymentMainComponent$handleChaloPaymentFailure$1.L$0 = null;
                    paymentMainComponent$handleChaloPaymentFailure$1.L$1 = null;
                    paymentMainComponent$handleChaloPaymentFailure$1.label = 3;
                    if (paymentMainComponent2.k1(str, (String) objB, PaymentStatusCTAActionType.STAY_ON_PAYMENT_SCREEN, paymentMainComponent$handleChaloPaymentFailure$1) == coroutineSingletons) {
                        return unit;
                    }
                }
                return coroutineSingletons;
            case 2:
                str = (String) paymentMainComponent$handleChaloPaymentFailure$1.L$1;
                paymentMainComponent2 = (PaymentMainComponent) paymentMainComponent$handleChaloPaymentFailure$1.L$0;
                ResultKt.b(objB);
                paymentMainComponent$handleChaloPaymentFailure$1.L$0 = null;
                paymentMainComponent$handleChaloPaymentFailure$1.L$1 = null;
                paymentMainComponent$handleChaloPaymentFailure$1.label = 3;
                if (paymentMainComponent2.k1(str, (String) objB, PaymentStatusCTAActionType.STAY_ON_PAYMENT_SCREEN, paymentMainComponent$handleChaloPaymentFailure$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return unit;
            case 3:
                ResultKt.b(objB);
                return unit;
            case 4:
                PaymentMainComponent paymentMainComponent9 = (PaymentMainComponent) paymentMainComponent$handleChaloPaymentFailure$1.L$0;
                ResultKt.b(objB);
                paymentMainComponent3 = paymentMainComponent9;
                str2 = (String) objB;
                paymentMainComponent$handleChaloPaymentFailure$1.L$0 = paymentMainComponent3;
                paymentMainComponent$handleChaloPaymentFailure$1.L$1 = str2;
                paymentMainComponent$handleChaloPaymentFailure$1.label = 5;
                objB = stringProvider.b(StringEnum.RETRY_PAYMENT_ERROR, new Object[0], paymentMainComponent$handleChaloPaymentFailure$1);
                if (objB != coroutineSingletons) {
                    paymentStatusCTAActionType = PaymentStatusCTAActionType.FETCH_CHALO_WALLET;
                    paymentMainComponent$handleChaloPaymentFailure$1.L$0 = null;
                    paymentMainComponent$handleChaloPaymentFailure$1.L$1 = null;
                    paymentMainComponent$handleChaloPaymentFailure$1.label = 6;
                    if (paymentMainComponent3.k1(str2, (String) objB, paymentStatusCTAActionType, paymentMainComponent$handleChaloPaymentFailure$1) == coroutineSingletons) {
                        return unit;
                    }
                }
                return coroutineSingletons;
            case 5:
                str2 = (String) paymentMainComponent$handleChaloPaymentFailure$1.L$1;
                paymentMainComponent3 = (PaymentMainComponent) paymentMainComponent$handleChaloPaymentFailure$1.L$0;
                ResultKt.b(objB);
                paymentStatusCTAActionType = PaymentStatusCTAActionType.FETCH_CHALO_WALLET;
                paymentMainComponent$handleChaloPaymentFailure$1.L$0 = null;
                paymentMainComponent$handleChaloPaymentFailure$1.L$1 = null;
                paymentMainComponent$handleChaloPaymentFailure$1.label = 6;
                if (paymentMainComponent3.k1(str2, (String) objB, paymentStatusCTAActionType, paymentMainComponent$handleChaloPaymentFailure$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return unit;
            case 6:
                ResultKt.b(objB);
                return unit;
            case 7:
                PaymentMainComponent paymentMainComponent10 = (PaymentMainComponent) paymentMainComponent$handleChaloPaymentFailure$1.L$0;
                ResultKt.b(objB);
                paymentMainComponent4 = paymentMainComponent10;
                str3 = (String) objB;
                paymentMainComponent$handleChaloPaymentFailure$1.L$0 = paymentMainComponent4;
                paymentMainComponent$handleChaloPaymentFailure$1.L$1 = str3;
                paymentMainComponent$handleChaloPaymentFailure$1.label = 8;
                objB = stringProvider.b(StringEnum.PAYMENT_FAILED_DUE_TO_INSUFFICIENT_BALANCE, new Object[0], paymentMainComponent$handleChaloPaymentFailure$1);
                if (objB != coroutineSingletons) {
                    paymentStatusCTAActionType2 = PaymentStatusCTAActionType.FETCH_CHALO_WALLET;
                    paymentMainComponent$handleChaloPaymentFailure$1.L$0 = null;
                    paymentMainComponent$handleChaloPaymentFailure$1.L$1 = null;
                    paymentMainComponent$handleChaloPaymentFailure$1.label = 9;
                    if (paymentMainComponent4.k1(str3, (String) objB, paymentStatusCTAActionType2, paymentMainComponent$handleChaloPaymentFailure$1) == coroutineSingletons) {
                        return unit;
                    }
                }
                return coroutineSingletons;
            case 8:
                str3 = (String) paymentMainComponent$handleChaloPaymentFailure$1.L$1;
                paymentMainComponent4 = (PaymentMainComponent) paymentMainComponent$handleChaloPaymentFailure$1.L$0;
                ResultKt.b(objB);
                paymentStatusCTAActionType2 = PaymentStatusCTAActionType.FETCH_CHALO_WALLET;
                paymentMainComponent$handleChaloPaymentFailure$1.L$0 = null;
                paymentMainComponent$handleChaloPaymentFailure$1.L$1 = null;
                paymentMainComponent$handleChaloPaymentFailure$1.label = 9;
                if (paymentMainComponent4.k1(str3, (String) objB, paymentStatusCTAActionType2, paymentMainComponent$handleChaloPaymentFailure$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return unit;
            case 9:
                ResultKt.b(objB);
                return unit;
            case 10:
                PaymentMainComponent paymentMainComponent11 = (PaymentMainComponent) paymentMainComponent$handleChaloPaymentFailure$1.L$0;
                ResultKt.b(objB);
                paymentMainComponent5 = paymentMainComponent11;
                str4 = (String) objB;
                paymentMainComponent$handleChaloPaymentFailure$1.L$0 = paymentMainComponent5;
                paymentMainComponent$handleChaloPaymentFailure$1.L$1 = str4;
                paymentMainComponent$handleChaloPaymentFailure$1.label = 11;
                objB = stringProvider.b(StringEnum.RECLAIM_WALLET_ERROR, new Object[0], paymentMainComponent$handleChaloPaymentFailure$1);
                if (objB != coroutineSingletons) {
                    paymentStatusCTAActionType3 = PaymentStatusCTAActionType.FETCH_CHALO_WALLET;
                    paymentMainComponent$handleChaloPaymentFailure$1.L$0 = null;
                    paymentMainComponent$handleChaloPaymentFailure$1.L$1 = null;
                    paymentMainComponent$handleChaloPaymentFailure$1.label = 12;
                    if (paymentMainComponent5.k1(str4, (String) objB, paymentStatusCTAActionType3, paymentMainComponent$handleChaloPaymentFailure$1) == coroutineSingletons) {
                        return unit;
                    }
                }
                return coroutineSingletons;
            case 11:
                str4 = (String) paymentMainComponent$handleChaloPaymentFailure$1.L$1;
                paymentMainComponent5 = (PaymentMainComponent) paymentMainComponent$handleChaloPaymentFailure$1.L$0;
                ResultKt.b(objB);
                paymentStatusCTAActionType3 = PaymentStatusCTAActionType.FETCH_CHALO_WALLET;
                paymentMainComponent$handleChaloPaymentFailure$1.L$0 = null;
                paymentMainComponent$handleChaloPaymentFailure$1.L$1 = null;
                paymentMainComponent$handleChaloPaymentFailure$1.label = 12;
                if (paymentMainComponent5.k1(str4, (String) objB, paymentStatusCTAActionType3, paymentMainComponent$handleChaloPaymentFailure$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return unit;
            case 12:
                ResultKt.b(objB);
                return unit;
            case 13:
                PaymentMainComponent paymentMainComponent12 = (PaymentMainComponent) paymentMainComponent$handleChaloPaymentFailure$1.L$0;
                ResultKt.b(objB);
                paymentMainComponent6 = paymentMainComponent12;
                str5 = (String) objB;
                paymentMainComponent$handleChaloPaymentFailure$1.L$0 = paymentMainComponent6;
                paymentMainComponent$handleChaloPaymentFailure$1.L$1 = str5;
                paymentMainComponent$handleChaloPaymentFailure$1.label = 14;
                objB = stringProvider.b(StringEnum.CHALO_WALLET_INACTIVE_ERROR, new Object[0], paymentMainComponent$handleChaloPaymentFailure$1);
                if (objB != coroutineSingletons) {
                    paymentStatusCTAActionType4 = PaymentStatusCTAActionType.FETCH_CHALO_WALLET;
                    paymentMainComponent$handleChaloPaymentFailure$1.L$0 = null;
                    paymentMainComponent$handleChaloPaymentFailure$1.L$1 = null;
                    paymentMainComponent$handleChaloPaymentFailure$1.label = 15;
                    if (paymentMainComponent6.k1(str5, (String) objB, paymentStatusCTAActionType4, paymentMainComponent$handleChaloPaymentFailure$1) == coroutineSingletons) {
                        return unit;
                    }
                }
                return coroutineSingletons;
            case 14:
                str5 = (String) paymentMainComponent$handleChaloPaymentFailure$1.L$1;
                paymentMainComponent6 = (PaymentMainComponent) paymentMainComponent$handleChaloPaymentFailure$1.L$0;
                ResultKt.b(objB);
                paymentStatusCTAActionType4 = PaymentStatusCTAActionType.FETCH_CHALO_WALLET;
                paymentMainComponent$handleChaloPaymentFailure$1.L$0 = null;
                paymentMainComponent$handleChaloPaymentFailure$1.L$1 = null;
                paymentMainComponent$handleChaloPaymentFailure$1.label = 15;
                if (paymentMainComponent6.k1(str5, (String) objB, paymentStatusCTAActionType4, paymentMainComponent$handleChaloPaymentFailure$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return unit;
            case 15:
                ResultKt.b(objB);
                return unit;
            case 16:
                PaymentMainComponent paymentMainComponent13 = (PaymentMainComponent) paymentMainComponent$handleChaloPaymentFailure$1.L$0;
                ResultKt.b(objB);
                paymentMainComponent7 = paymentMainComponent13;
                str6 = (String) objB;
                paymentMainComponent$handleChaloPaymentFailure$1.L$0 = paymentMainComponent7;
                paymentMainComponent$handleChaloPaymentFailure$1.L$1 = str6;
                paymentMainComponent$handleChaloPaymentFailure$1.label = 17;
                objB = stringProvider.b(StringEnum.CHALO_WALLET_BLOCKED_ERROR, new Object[0], paymentMainComponent$handleChaloPaymentFailure$1);
                if (objB != coroutineSingletons) {
                    paymentStatusCTAActionType5 = PaymentStatusCTAActionType.FETCH_CHALO_WALLET;
                    paymentMainComponent$handleChaloPaymentFailure$1.L$0 = null;
                    paymentMainComponent$handleChaloPaymentFailure$1.L$1 = null;
                    paymentMainComponent$handleChaloPaymentFailure$1.label = 18;
                    if (paymentMainComponent7.k1(str6, (String) objB, paymentStatusCTAActionType5, paymentMainComponent$handleChaloPaymentFailure$1) == coroutineSingletons) {
                        return unit;
                    }
                }
                return coroutineSingletons;
            case 17:
                str6 = (String) paymentMainComponent$handleChaloPaymentFailure$1.L$1;
                paymentMainComponent7 = (PaymentMainComponent) paymentMainComponent$handleChaloPaymentFailure$1.L$0;
                ResultKt.b(objB);
                paymentStatusCTAActionType5 = PaymentStatusCTAActionType.FETCH_CHALO_WALLET;
                paymentMainComponent$handleChaloPaymentFailure$1.L$0 = null;
                paymentMainComponent$handleChaloPaymentFailure$1.L$1 = null;
                paymentMainComponent$handleChaloPaymentFailure$1.label = 18;
                if (paymentMainComponent7.k1(str6, (String) objB, paymentStatusCTAActionType5, paymentMainComponent$handleChaloPaymentFailure$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return unit;
            case 18:
                ResultKt.b(objB);
                return unit;
            case 19:
                PaymentMainComponent paymentMainComponent14 = (PaymentMainComponent) paymentMainComponent$handleChaloPaymentFailure$1.L$0;
                ResultKt.b(objB);
                paymentMainComponent = paymentMainComponent14;
                str7 = (String) objB;
                paymentMainComponent$handleChaloPaymentFailure$1.L$0 = paymentMainComponent;
                paymentMainComponent$handleChaloPaymentFailure$1.L$1 = str7;
                paymentMainComponent$handleChaloPaymentFailure$1.label = 20;
                objB = stringProvider.b(StringEnum.RETRY_PAYMENT_ERROR, new Object[0], paymentMainComponent$handleChaloPaymentFailure$1);
                if (objB != coroutineSingletons) {
                    paymentMainComponent$handleChaloPaymentFailure$1.L$0 = null;
                    paymentMainComponent$handleChaloPaymentFailure$1.L$1 = null;
                    paymentMainComponent$handleChaloPaymentFailure$1.label = 21;
                    if (paymentMainComponent.k1(str7, (String) objB, PaymentStatusCTAActionType.STAY_ON_PAYMENT_SCREEN, paymentMainComponent$handleChaloPaymentFailure$1) == coroutineSingletons) {
                        return unit;
                    }
                }
                return coroutineSingletons;
            case 20:
                str7 = (String) paymentMainComponent$handleChaloPaymentFailure$1.L$1;
                paymentMainComponent = (PaymentMainComponent) paymentMainComponent$handleChaloPaymentFailure$1.L$0;
                ResultKt.b(objB);
                paymentMainComponent$handleChaloPaymentFailure$1.L$0 = null;
                paymentMainComponent$handleChaloPaymentFailure$1.L$1 = null;
                paymentMainComponent$handleChaloPaymentFailure$1.label = 21;
                if (paymentMainComponent.k1(str7, (String) objB, PaymentStatusCTAActionType.STAY_ON_PAYMENT_SCREEN, paymentMainComponent$handleChaloPaymentFailure$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return unit;
            case 21:
                ResultKt.b(objB);
                return unit;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k1(String str, String str2, PaymentStatusCTAActionType paymentStatusCTAActionType, ContinuationImpl continuationImpl) {
        PaymentMainComponent$handleErrorState$1 paymentMainComponent$handleErrorState$1;
        String str3;
        String str4;
        PaymentStatusCTAActionType paymentStatusCTAActionType2;
        String str5;
        if (continuationImpl instanceof PaymentMainComponent$handleErrorState$1) {
            paymentMainComponent$handleErrorState$1 = (PaymentMainComponent$handleErrorState$1) continuationImpl;
            int i = paymentMainComponent$handleErrorState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                paymentMainComponent$handleErrorState$1.label = i - Integer.MIN_VALUE;
            } else {
                paymentMainComponent$handleErrorState$1 = new PaymentMainComponent$handleErrorState$1(this, continuationImpl);
            }
        } else {
            paymentMainComponent$handleErrorState$1 = new PaymentMainComponent$handleErrorState$1(this, continuationImpl);
        }
        Object objB = paymentMainComponent$handleErrorState$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = paymentMainComponent$handleErrorState$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            paymentMainComponent$handleErrorState$1.L$0 = str;
            paymentMainComponent$handleErrorState$1.L$1 = str2;
            paymentMainComponent$handleErrorState$1.L$2 = paymentStatusCTAActionType;
            paymentMainComponent$handleErrorState$1.label = 1;
            objB = this.A.b(StringEnum.OKAY, new Object[0], paymentMainComponent$handleErrorState$1);
            if (objB != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            paymentStatusCTAActionType = (PaymentStatusCTAActionType) paymentMainComponent$handleErrorState$1.L$2;
            str2 = (String) paymentMainComponent$handleErrorState$1.L$1;
            str = (String) paymentMainComponent$handleErrorState$1.L$0;
            ResultKt.b(objB);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str6 = (String) paymentMainComponent$handleErrorState$1.L$3;
            PaymentStatusCTAActionType paymentStatusCTAActionType3 = (PaymentStatusCTAActionType) paymentMainComponent$handleErrorState$1.L$2;
            String str7 = (String) paymentMainComponent$handleErrorState$1.L$1;
            String str8 = (String) paymentMainComponent$handleErrorState$1.L$0;
            ResultKt.b(objB);
            str5 = str6;
            paymentStatusCTAActionType2 = paymentStatusCTAActionType3;
            str4 = str7;
            str3 = str8;
        }
        E0(new o3(str3, str4, str5, paymentStatusCTAActionType2, (String) objB, 7));
        return Unit.f17538a;
        String str9 = (String) objB;
        WalletCTA walletCTA = ((ChaloPayWalletState) this.x.d().getValue()).h;
        paymentMainComponent$handleErrorState$1.L$0 = str;
        paymentMainComponent$handleErrorState$1.L$1 = str2;
        paymentMainComponent$handleErrorState$1.L$2 = paymentStatusCTAActionType;
        paymentMainComponent$handleErrorState$1.L$3 = str9;
        paymentMainComponent$handleErrorState$1.label = 2;
        Object objX0 = X0(walletCTA, paymentMainComponent$handleErrorState$1);
        if (objX0 != obj) {
            str3 = str;
            str4 = str2;
            paymentStatusCTAActionType2 = paymentStatusCTAActionType;
            str5 = str9;
            objB = objX0;
            E0(new o3(str3, str4, str5, paymentStatusCTAActionType2, (String) objB, 7));
            return Unit.f17538a;
        }
        return obj;
    }

    public final void l1() {
        E0(new jq0(9));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0073  */
    /* JADX WARN: Code duplicated, block: B:31:0x0087  */
    /* JADX WARN: Code duplicated, block: B:33:0x008f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0097  */
    /* JADX WARN: Code duplicated, block: B:45:0x00be  */
    /* JADX WARN: Code duplicated, block: B:48:0x00df  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        if (r10 == r1) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1(app.chalo.juspay.JuspayOperationFailure r9, kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.checkout.ui.screen.payment.PaymentMainComponent.m1(app.chalo.juspay.JuspayOperationFailure, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n1(Continuation continuation) {
        PaymentMainComponent$handleOperationRejected$1 paymentMainComponent$handleOperationRejected$1;
        KotlinToastManager kotlinToastManager;
        if (continuation instanceof PaymentMainComponent$handleOperationRejected$1) {
            paymentMainComponent$handleOperationRejected$1 = (PaymentMainComponent$handleOperationRejected$1) continuation;
            int i = paymentMainComponent$handleOperationRejected$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                paymentMainComponent$handleOperationRejected$1.label = i - Integer.MIN_VALUE;
            } else {
                paymentMainComponent$handleOperationRejected$1 = new PaymentMainComponent$handleOperationRejected$1(this, continuation);
            }
        } else {
            paymentMainComponent$handleOperationRejected$1 = new PaymentMainComponent$handleOperationRejected$1(this, continuation);
        }
        Object objB = paymentMainComponent$handleOperationRejected$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = paymentMainComponent$handleOperationRejected$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            KotlinToastManager kotlinToastManager2 = this.S;
            paymentMainComponent$handleOperationRejected$1.L$0 = kotlinToastManager2;
            paymentMainComponent$handleOperationRejected$1.label = 1;
            objB = this.A.b(StringEnum.PLEASE_TRY_AGAIN, new Object[0], paymentMainComponent$handleOperationRejected$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            kotlinToastManager = kotlinToastManager2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinToastManager = (KotlinToastManager) paymentMainComponent$handleOperationRejected$1.L$0;
            ResultKt.b(objB);
        }
        KotlinToastManagerKt.a(kotlinToastManager, (String) objB, ToastLength.LONG);
        return Unit.f17538a;
    }

    public final void o1(PaymentViewIntent.UpiAppSelected upiAppSelected) {
        String str;
        boolean zD;
        CheckoutPaymentDataResolver checkoutPaymentDataResolver = this.m;
        CheckoutPaymentProvider checkoutPaymentProvider = checkoutPaymentDataResolver.getC().d.f5657a;
        switch (WhenMappings.e[checkoutPaymentProvider.ordinal()]) {
            case 1:
                str = CheckoutPaymentMethod.RazorPay.Upi.INSTANCE.b;
                break;
            case 2:
                str = CheckoutPaymentMethod.Inai.Upi.INSTANCE.b;
                break;
            case 3:
                str = CheckoutPaymentMethod.PhonePe.Upi.INSTANCE.b;
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                str = "";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        String str2 = str;
        checkoutPaymentDataResolver.m0(str2);
        CheckoutPaymentItem.IndividualCheckoutItem.UPIIntentPaymentItem uPIIntentPaymentItem = upiAppSelected.f1575a;
        PaymentUiItem paymentUiItem = uPIIntentPaymentItem.b;
        switch (CheckoutPaymentItem.IndividualCheckoutItem.UPIIntentPaymentItem.WhenMappings.f1343a[checkoutPaymentProvider.ordinal()]) {
            case 1:
                zD = Intrinsics.d(uPIIntentPaymentItem.c, LogConstants.DEFAULT_CHANNEL);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                zD = false;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (!zD) {
            checkoutPaymentDataResolver.d0(paymentUiItem.b);
        }
        this.t.k(paymentUiItem.b, str2, false, false, "mainPaymentScreen", null);
        checkoutPaymentDataResolver.t(new SelectedPaymentInstrumentData.UpiData.IntentFlow(uPIIntentPaymentItem.c));
    }

    public final void p1() {
        PaymentMainComponent$initializeChaloPayObservers$1 paymentMainComponent$initializeChaloPayObservers$1 = new PaymentMainComponent$initializeChaloPayObservers$1(this, null);
        ContextScope contextScope = this.j;
        BuildersKt.d(contextScope, null, null, paymentMainComponent$initializeChaloPayObservers$1, 3);
        BuildersKt.d(contextScope, null, null, new PaymentMainComponent$initializeChaloPayObservers$2(this, null), 3);
    }

    public final boolean q1() {
        String str = ((PaymentInfoState) this.m.getF().getValue()).c;
        CheckoutPaymentMethod.ClosedLoopWallet.INSTANCE.getClass();
        return Intrinsics.d(str, "cldw");
    }

    public final void r1(String str) {
        JuspayController juspayController = this.Z;
        if (juspayController == null) {
            return;
        }
        CheckoutOrderData checkoutOrderData = this.m.getC().f2691a;
        BuildersKt.d(this.j, null, null, new PaymentMainComponent$collectJuspayOperation$1(juspayController.e(checkoutOrderData.c, str, checkoutOrderData.b, this.l.a().getType(), Z0()), this, null), 3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:202:0x0288 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:203:0x028c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [kotlin.coroutines.Continuation, kotlin.coroutines.CoroutineContext, kotlinx.coroutines.CoroutineStart] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r2v178, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v179, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v180, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26, types: [kotlin.coroutines.Continuation, kotlin.coroutines.CoroutineContext, kotlinx.coroutines.CoroutineStart] */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v32, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v36, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver] */
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
    public final void s1(PaymentViewIntent intent) {
        ?? r14;
        String str;
        String str2;
        String str3;
        ?? r3;
        Object objB;
        ?? installedApps;
        ?? arrayList;
        Object next;
        String str4;
        PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel;
        PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel2;
        PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel3;
        PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel4;
        PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel5;
        InstalledUpiApps installedUpiApps;
        List list;
        String str5;
        PaymentMethodSelectionAction paymentMethodSelectionAction;
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z = intent instanceof PaymentViewIntent.ViewCreatedIntent;
        int i = 2;
        CoroutineContextProvider coroutineContextProvider = this.E;
        ?? r5 = this.m;
        ContextScope contextScope = this.j;
        if (z) {
            r5.n(((PaymentViewIntent.ViewCreatedIntent) intent).f1576a);
            BuildersKt.d(contextScope, coroutineContextProvider.b(), null, new PaymentMainComponent$handleViewCreatedIntent$1(this, null), 2);
            return;
        }
        int i2 = 3;
        if (intent instanceof PaymentViewIntent.LoadPaymentMethodsIntent) {
            BuildersKt.d(contextScope, null, null, new PaymentMainComponent$handleLoadPaymentMethodsIntent$1(this, null), 3);
            return;
        }
        int i3 = 6;
        int i4 = 5;
        int i5 = 4;
        if (intent instanceof PaymentViewIntent.PaymentMethodSelected) {
            CheckoutPaymentItem.PaymentMethodItem paymentMethodItem = ((PaymentViewIntent.PaymentMethodSelected) intent).f1563a;
            PaymentMethodOptionsAppModel paymentMethodOptionsAppModel = paymentMethodItem.c;
            r5.m0(paymentMethodOptionsAppModel.getD());
            this.t.k(paymentMethodItem.b.b, "top_mode", true, false, "mainPaymentScreen", null);
            Intrinsics.i(paymentMethodOptionsAppModel, "<this>");
            boolean z2 = paymentMethodOptionsAppModel instanceof PaymentMethodOptionsAppModel.RazorPayPaymentMethodOption.Cash;
            if (z2 || (paymentMethodOptionsAppModel instanceof PaymentMethodOptionsAppModel.InaiPaymentMethodOption.Cash)) {
                paymentMethodSelectionAction = PaymentMethodSelectionAction.HANDLE_CASH_PAYMENT;
            } else if ((paymentMethodOptionsAppModel instanceof PaymentMethodOptionsAppModel.InaiPaymentMethodOption.Card) || (paymentMethodOptionsAppModel instanceof PaymentMethodOptionsAppModel.RazorPayPaymentMethodOption.Card) || (paymentMethodOptionsAppModel instanceof PaymentMethodOptionsAppModel.RazorPayPaymentMethodOption.NetBanking) || (paymentMethodOptionsAppModel instanceof PaymentMethodOptionsAppModel.RazorPayPaymentMethodOption.UPI) || (paymentMethodOptionsAppModel instanceof PaymentMethodOptionsAppModel.RazorPayPaymentMethodOption.Wallet) || (paymentMethodOptionsAppModel instanceof PaymentMethodOptionsAppModel.InaiPaymentMethodOption.NetBanking) || (paymentMethodOptionsAppModel instanceof PaymentMethodOptionsAppModel.InaiPaymentMethodOption.UPI) || (paymentMethodOptionsAppModel instanceof PaymentMethodOptionsAppModel.InaiPaymentMethodOption.Wallet) || (paymentMethodOptionsAppModel instanceof PaymentMethodOptionsAppModel.PhonePePaymentMethodOption.Card) || (paymentMethodOptionsAppModel instanceof PaymentMethodOptionsAppModel.PhonePePaymentMethodOption.NetBanking) || (paymentMethodOptionsAppModel instanceof PaymentMethodOptionsAppModel.PhonePePaymentMethodOption.UPI)) {
                paymentMethodSelectionAction = PaymentMethodSelectionAction.NAVIGATE_FOR_ADDITIONAL_DETAILS;
            } else if ((paymentMethodOptionsAppModel instanceof PaymentMethodOptionsAppModel.RazorPayPaymentMethodOption.LazyPay) || (paymentMethodOptionsAppModel instanceof PaymentMethodOptionsAppModel.InaiPaymentMethodOption.Generic) || (paymentMethodOptionsAppModel instanceof PaymentMethodOptionsAppModel.InaiPaymentMethodOption.LazyPay)) {
                paymentMethodSelectionAction = PaymentMethodSelectionAction.INITIATE_PAYMENT_VIA_PAYMENT_PROVIDER;
            } else {
                if (!(paymentMethodOptionsAppModel instanceof PaymentMethodOptionsAppModel.ChaloPay) && !(paymentMethodOptionsAppModel instanceof PaymentMethodOptionsAppModel.JuspayTurboUpi) && !(paymentMethodOptionsAppModel instanceof PaymentMethodOptionsAppModel.ClosedLoopWallet)) {
                    throw new NoWhenBranchMatchedException();
                }
                paymentMethodSelectionAction = null;
            }
            int i6 = paymentMethodSelectionAction == null ? -1 : WhenMappings.h[paymentMethodSelectionAction.ordinal()];
            if (i6 != -1) {
                if (i6 == 1) {
                    BuildersKt.d(contextScope, null, null, new PaymentMainComponent$handlePaymentMethodSelectedIntent$1(this, null), 3);
                    return;
                }
                if (i6 != 2) {
                    if (i6 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.I.c(new CheckoutResultState.Success("cash", null, null, null), this.k.c);
                    q0(new iq0(this, i3));
                    return;
                }
                E0(new do0(29));
                if ((paymentMethodOptionsAppModel instanceof PaymentMethodOptionsAppModel.RazorPayPaymentMethodOption.UPI) || (paymentMethodOptionsAppModel instanceof PaymentMethodOptionsAppModel.InaiPaymentMethodOption.UPI) || (paymentMethodOptionsAppModel instanceof PaymentMethodOptionsAppModel.PhonePePaymentMethodOption.UPI)) {
                    q0(new iq0(this, i));
                    return;
                }
                if ((paymentMethodOptionsAppModel instanceof PaymentMethodOptionsAppModel.RazorPayPaymentMethodOption.Wallet) || (paymentMethodOptionsAppModel instanceof PaymentMethodOptionsAppModel.InaiPaymentMethodOption.Wallet)) {
                    q0(new iq0(this, i2));
                    return;
                }
                if ((paymentMethodOptionsAppModel instanceof PaymentMethodOptionsAppModel.RazorPayPaymentMethodOption.NetBanking) || (paymentMethodOptionsAppModel instanceof PaymentMethodOptionsAppModel.InaiPaymentMethodOption.NetBanking) || (paymentMethodOptionsAppModel instanceof PaymentMethodOptionsAppModel.PhonePePaymentMethodOption.NetBanking)) {
                    q0(new iq0(this, i5));
                    return;
                }
                if ((paymentMethodOptionsAppModel instanceof PaymentMethodOptionsAppModel.RazorPayPaymentMethodOption.Card) || (paymentMethodOptionsAppModel instanceof PaymentMethodOptionsAppModel.InaiPaymentMethodOption.Card) || (paymentMethodOptionsAppModel instanceof PaymentMethodOptionsAppModel.PhonePePaymentMethodOption.Card)) {
                    q0(new iq0(this, i4));
                    return;
                }
                if (!z2 && !(paymentMethodOptionsAppModel instanceof PaymentMethodOptionsAppModel.RazorPayPaymentMethodOption.LazyPay) && !(paymentMethodOptionsAppModel instanceof PaymentMethodOptionsAppModel.InaiPaymentMethodOption.Generic) && !(paymentMethodOptionsAppModel instanceof PaymentMethodOptionsAppModel.InaiPaymentMethodOption.Cash) && !(paymentMethodOptionsAppModel instanceof PaymentMethodOptionsAppModel.InaiPaymentMethodOption.LazyPay) && !(paymentMethodOptionsAppModel instanceof PaymentMethodOptionsAppModel.ChaloPay) && !(paymentMethodOptionsAppModel instanceof PaymentMethodOptionsAppModel.JuspayTurboUpi) && !(paymentMethodOptionsAppModel instanceof PaymentMethodOptionsAppModel.ClosedLoopWallet)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            return;
        }
        String str6 = "";
        if (intent instanceof PaymentViewIntent.PreferredItemSelected) {
            CheckoutPaymentProvider provider = r5.getC().d.f5657a;
            CheckoutPaymentItem.IndividualCheckoutItem individualCheckoutItem = ((PaymentViewIntent.PreferredItemSelected) intent).f1569a;
            Intrinsics.i(provider, "provider");
            switch (CheckoutPaymentItemKt.WhenMappings.f1344a[provider.ordinal()]) {
                case 1:
                    if ((individualCheckoutItem instanceof CheckoutPaymentItem.IndividualCheckoutItem.UPIIntentPaymentItem) || (individualCheckoutItem instanceof CheckoutPaymentItem.IndividualCheckoutItem.WalletPaymentItem)) {
                        str6 = CheckoutPaymentMethod.RazorPay.Wallet.INSTANCE.b;
                    } else {
                        if (!(individualCheckoutItem instanceof CheckoutPaymentItem.IndividualCheckoutItem.NetBankingPaymentItem)) {
                            if (individualCheckoutItem instanceof CheckoutPaymentItem.IndividualCheckoutItem.ChaloPayItem) {
                                CheckoutPaymentMethod.ChaloPay.INSTANCE.getClass();
                                str5 = "chalopay";
                                r5.m0(str5);
                                r5.d0(individualCheckoutItem.getF1342a().b);
                                if ((individualCheckoutItem instanceof CheckoutPaymentItem.IndividualCheckoutItem.ChaloPayItem) && !(individualCheckoutItem instanceof CheckoutPaymentItem.IndividualCheckoutItem.ClosedLoopPayItem)) {
                                    r5.t(individualCheckoutItem.b());
                                } else {
                                    i1();
                                }
                                this.t.k(individualCheckoutItem.getF1342a().b, str5, false, true, "mainPaymentScreen", null);
                                return;
                            }
                            if (!(individualCheckoutItem instanceof CheckoutPaymentItem.IndividualCheckoutItem.InAppUpiItem.UpiAccountItem) && !(individualCheckoutItem instanceof CheckoutPaymentItem.IndividualCheckoutItem.InAppUpiItem.UserOnBoardingItem)) {
                                if (!(individualCheckoutItem instanceof CheckoutPaymentItem.IndividualCheckoutItem.ClosedLoopPayItem)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                CheckoutPaymentMethod.ClosedLoopWallet.INSTANCE.getClass();
                                str5 = "cldw";
                            }
                            r5.m0(str5);
                            r5.d0(individualCheckoutItem.getF1342a().b);
                            if (individualCheckoutItem instanceof CheckoutPaymentItem.IndividualCheckoutItem.ChaloPayItem) {
                                i1();
                            } else {
                                r5.t(individualCheckoutItem.b());
                            }
                            this.t.k(individualCheckoutItem.getF1342a().b, str5, false, true, "mainPaymentScreen", null);
                            return;
                        }
                        str6 = CheckoutPaymentMethod.RazorPay.NetBanking.INSTANCE.b;
                    }
                    str5 = str6;
                    r5.m0(str5);
                    r5.d0(individualCheckoutItem.getF1342a().b);
                    if (individualCheckoutItem instanceof CheckoutPaymentItem.IndividualCheckoutItem.ChaloPayItem) {
                        i1();
                    } else {
                        r5.t(individualCheckoutItem.b());
                    }
                    this.t.k(individualCheckoutItem.getF1342a().b, str5, false, true, "mainPaymentScreen", null);
                    return;
                case 2:
                    if (individualCheckoutItem instanceof CheckoutPaymentItem.IndividualCheckoutItem.UPIIntentPaymentItem) {
                        str6 = CheckoutPaymentMethod.Inai.Upi.INSTANCE.b;
                    } else if (individualCheckoutItem instanceof CheckoutPaymentItem.IndividualCheckoutItem.WalletPaymentItem) {
                        str6 = ((CheckoutPaymentItem.IndividualCheckoutItem.WalletPaymentItem) individualCheckoutItem).c;
                    } else {
                        if (!(individualCheckoutItem instanceof CheckoutPaymentItem.IndividualCheckoutItem.NetBankingPaymentItem)) {
                            if (individualCheckoutItem instanceof CheckoutPaymentItem.IndividualCheckoutItem.ChaloPayItem) {
                                CheckoutPaymentMethod.ChaloPay.INSTANCE.getClass();
                                str5 = "chalopay";
                                r5.m0(str5);
                                r5.d0(individualCheckoutItem.getF1342a().b);
                                if (individualCheckoutItem instanceof CheckoutPaymentItem.IndividualCheckoutItem.ChaloPayItem) {
                                    i1();
                                } else {
                                    r5.t(individualCheckoutItem.b());
                                }
                                this.t.k(individualCheckoutItem.getF1342a().b, str5, false, true, "mainPaymentScreen", null);
                                return;
                            }
                            if (!(individualCheckoutItem instanceof CheckoutPaymentItem.IndividualCheckoutItem.InAppUpiItem.UpiAccountItem) && !(individualCheckoutItem instanceof CheckoutPaymentItem.IndividualCheckoutItem.InAppUpiItem.UserOnBoardingItem)) {
                                if (!(individualCheckoutItem instanceof CheckoutPaymentItem.IndividualCheckoutItem.ClosedLoopPayItem)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                CheckoutPaymentMethod.ClosedLoopWallet.INSTANCE.getClass();
                                str5 = "cldw";
                            }
                            r5.m0(str5);
                            r5.d0(individualCheckoutItem.getF1342a().b);
                            if (individualCheckoutItem instanceof CheckoutPaymentItem.IndividualCheckoutItem.ChaloPayItem) {
                                i1();
                            } else {
                                r5.t(individualCheckoutItem.b());
                            }
                            this.t.k(individualCheckoutItem.getF1342a().b, str5, false, true, "mainPaymentScreen", null);
                            return;
                        }
                        str6 = CheckoutPaymentMethod.Inai.NetBanking.INSTANCE.b;
                    }
                    str5 = str6;
                    r5.m0(str5);
                    r5.d0(individualCheckoutItem.getF1342a().b);
                    if (individualCheckoutItem instanceof CheckoutPaymentItem.IndividualCheckoutItem.ChaloPayItem) {
                        i1();
                    } else {
                        r5.t(individualCheckoutItem.b());
                    }
                    this.t.k(individualCheckoutItem.getF1342a().b, str5, false, true, "mainPaymentScreen", null);
                    return;
                case 3:
                    if (individualCheckoutItem instanceof CheckoutPaymentItem.IndividualCheckoutItem.UPIIntentPaymentItem) {
                        str6 = CheckoutPaymentMethod.PhonePe.Upi.INSTANCE.b;
                    } else if (individualCheckoutItem instanceof CheckoutPaymentItem.IndividualCheckoutItem.NetBankingPaymentItem) {
                        str6 = CheckoutPaymentMethod.PhonePe.NetBanking.INSTANCE.b;
                    } else {
                        if (individualCheckoutItem instanceof CheckoutPaymentItem.IndividualCheckoutItem.ChaloPayItem) {
                            CheckoutPaymentMethod.ChaloPay.INSTANCE.getClass();
                            str5 = "chalopay";
                            r5.m0(str5);
                            r5.d0(individualCheckoutItem.getF1342a().b);
                            if (individualCheckoutItem instanceof CheckoutPaymentItem.IndividualCheckoutItem.ChaloPayItem) {
                                i1();
                            } else {
                                r5.t(individualCheckoutItem.b());
                            }
                            this.t.k(individualCheckoutItem.getF1342a().b, str5, false, true, "mainPaymentScreen", null);
                            return;
                        }
                        if (individualCheckoutItem instanceof CheckoutPaymentItem.IndividualCheckoutItem.ClosedLoopPayItem) {
                            CheckoutPaymentMethod.ClosedLoopWallet.INSTANCE.getClass();
                            str5 = "cldw";
                            r5.m0(str5);
                            r5.d0(individualCheckoutItem.getF1342a().b);
                            if (individualCheckoutItem instanceof CheckoutPaymentItem.IndividualCheckoutItem.ChaloPayItem) {
                                i1();
                            } else {
                                r5.t(individualCheckoutItem.b());
                            }
                            this.t.k(individualCheckoutItem.getF1342a().b, str5, false, true, "mainPaymentScreen", null);
                            return;
                        }
                        if (!(individualCheckoutItem instanceof CheckoutPaymentItem.IndividualCheckoutItem.WalletPaymentItem) && !(individualCheckoutItem instanceof CheckoutPaymentItem.IndividualCheckoutItem.InAppUpiItem.UpiAccountItem) && !(individualCheckoutItem instanceof CheckoutPaymentItem.IndividualCheckoutItem.InAppUpiItem.UserOnBoardingItem)) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    str5 = str6;
                    r5.m0(str5);
                    r5.d0(individualCheckoutItem.getF1342a().b);
                    if (individualCheckoutItem instanceof CheckoutPaymentItem.IndividualCheckoutItem.ChaloPayItem) {
                        i1();
                    } else {
                        r5.t(individualCheckoutItem.b());
                    }
                    this.t.k(individualCheckoutItem.getF1342a().b, str5, false, true, "mainPaymentScreen", null);
                    return;
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    str5 = str6;
                    r5.m0(str5);
                    r5.d0(individualCheckoutItem.getF1342a().b);
                    if (individualCheckoutItem instanceof CheckoutPaymentItem.IndividualCheckoutItem.ChaloPayItem) {
                        i1();
                    } else {
                        r5.t(individualCheckoutItem.b());
                    }
                    this.t.k(individualCheckoutItem.getF1342a().b, str5, false, true, "mainPaymentScreen", null);
                    return;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        if (intent instanceof PaymentViewIntent.SelectedPaymentInstrumentDataReceived) {
            BuildersKt.d(contextScope, null, null, new PaymentMainComponent$handleSelectedPaymentDataReceived$1(this, null), 3);
            return;
        }
        if (intent instanceof PaymentViewIntent.GetPaymentStatus) {
            e1(this, ((PaymentViewIntent.GetPaymentStatus) intent).f1553a);
            return;
        }
        boolean z3 = intent instanceof PaymentViewIntent.PaymentStatusBottomSheetPositiveButtonClicked;
        int i7 = 10;
        ICheckoutAnalyticsHelper iCheckoutAnalyticsHelper = this.t;
        if (z3) {
            E0(new jq0(i7));
            int i8 = WhenMappings.f[((PaymentViewIntent.PaymentStatusBottomSheetPositiveButtonClicked) intent).f1564a.ordinal()];
            if (i8 == 1) {
                ICheckoutAnalyticsHelper.DefaultImpls.a(iCheckoutAnalyticsHelper, "checkout navigating to home screen", MapsKt.h(new Pair("reason", "checkHistory")), 12);
                q0(new iq0(this, 17));
                return;
            }
            if (i8 == 2) {
                q0(new iq0(this, 18));
                return;
            }
            if (i8 == 3) {
                r5.U(null);
                r5.d0(null);
                return;
            } else if (i8 == 4) {
                BuildersKt.d(contextScope, coroutineContextProvider.b(), null, new PaymentMainComponent$handlePaymentStatusBottomSheetPositiveButtonClickedIntent$4(this, null), 2);
                return;
            } else {
                if (i8 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        if (intent instanceof PaymentViewIntent.InaiInstalledUpiAppsReceived) {
            String str7 = ((PaymentViewIntent.InaiInstalledUpiAppsReceived) intent).f1560a;
            try {
                Json json = ChaloJson.b;
                json.getClass();
                objB = json.b(str7, InaiInstalledUpiAppDetailApiModel.INSTANCE.serializer());
            } catch (Exception unused) {
                objB = null;
            }
            InaiInstalledUpiAppDetailApiModel inaiInstalledUpiAppDetailApiModel = (InaiInstalledUpiAppDetailApiModel) objB;
            iCheckoutAnalyticsHelper.b("inai installed apps response", MapsKt.h(new Pair("response", str7)));
            List paymentInstrumentListFromInai = PaymentMethodsAppModelKt.d(((PaymentInfoState) r5.getF().getValue()).f1361a, CheckoutPaymentProvider.INAI);
            if (inaiInstalledUpiAppDetailApiModel == null || (installedUpiApps = inaiInstalledUpiAppDetailApiModel.f1282a) == null || (list = installedUpiApps.f1284a) == null) {
                installedApps = EmptyList.f17557a;
            } else {
                List<InstalledUpiDetailApiModel> list2 = list;
                installedApps = new ArrayList(CollectionsKt.v(list2, 10));
                for (InstalledUpiDetailApiModel installedUpiDetailApiModel : list2) {
                    Intrinsics.i(installedUpiDetailApiModel, "<this>");
                    installedApps.add(new InstalledUpiDetailAppModel(installedUpiDetailApiModel.f1286a, installedUpiDetailApiModel.c, installedUpiDetailApiModel.b));
                }
            }
            this.s.getClass();
            Intrinsics.i(installedApps, "installedApps");
            Intrinsics.i(paymentInstrumentListFromInai, "paymentInstrumentListFromInai");
            try {
                Iterable<InstalledUpiDetailAppModel> iterable = (Iterable) installedApps;
                arrayList = new ArrayList(CollectionsKt.v(iterable, 10));
                for (InstalledUpiDetailAppModel installedUpiDetailAppModel : iterable) {
                    Iterator it = paymentInstrumentListFromInai.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!Intrinsics.d(((PaymentInstrumentAppModel.UPIPaymentInstrumentAppModel) next).c.f1289a, installedUpiDetailAppModel.f1288a));
                    PaymentInstrumentAppModel.UPIPaymentInstrumentAppModel uPIPaymentInstrumentAppModel = (PaymentInstrumentAppModel.UPIPaymentInstrumentAppModel) next;
                    if (uPIPaymentInstrumentAppModel == null || (paymentDisplayDetailsAppModel5 = uPIPaymentInstrumentAppModel.c) == null || (str4 = paymentDisplayDetailsAppModel5.f) == null) {
                        str4 = installedUpiDetailAppModel.b;
                    }
                    String str8 = str4;
                    arrayList.add(new PaymentInstrumentAppModel.UPIPaymentInstrumentAppModel(new PaymentDisplayDetailsAppModel(installedUpiDetailAppModel.f1288a, (uPIPaymentInstrumentAppModel == null || (paymentDisplayDetailsAppModel3 = uPIPaymentInstrumentAppModel.c) == null) ? null : paymentDisplayDetailsAppModel3.c, (uPIPaymentInstrumentAppModel == null || (paymentDisplayDetailsAppModel = uPIPaymentInstrumentAppModel.c) == null) ? null : paymentDisplayDetailsAppModel.d, (uPIPaymentInstrumentAppModel == null || (paymentDisplayDetailsAppModel2 = uPIPaymentInstrumentAppModel.c) == null) ? null : paymentDisplayDetailsAppModel2.e, str8, (uPIPaymentInstrumentAppModel == null || (paymentDisplayDetailsAppModel4 = uPIPaymentInstrumentAppModel.c) == null) ? true : paymentDisplayDetailsAppModel4.b), installedUpiDetailAppModel.c, false));
                }
            } catch (Exception unused2) {
                arrayList = EmptyList.f17557a;
            }
            r5.I(arrayList);
            BuildersKt.d(contextScope, null, null, new PaymentMainComponent$handleInaiInstalledUpiAppsReceivedIntent$1(this, null), 3);
            return;
        }
        if (intent instanceof PaymentViewIntent.InaiFetchInstalledUpiAppFailure) {
            r5.I(EmptyList.f17557a);
            BuildersKt.d(contextScope, null, null, new PaymentMainComponent$handleInaiFetchInstalledUpiAppFailureIntent$1(this, null), 3);
            return;
        }
        boolean zEquals = intent.equals(PaymentViewIntent.ProceedWithChaloPayModeIntent.f1570a);
        ChaloPayManager chaloPayManager = this.x;
        if (zEquals) {
            E0(new jq0(22));
            boolean zQ1 = q1();
            WalletCTA walletCTA = ((ChaloPayWalletState) chaloPayManager.d().getValue()).h;
            int i9 = walletCTA == null ? -1 : WhenMappings.i[walletCTA.ordinal()];
            if (i9 != -1) {
                if (i9 == 1) {
                    String strValueOf = String.valueOf(((ChaloPayWalletState) chaloPayManager.d().getValue()).g);
                    Locale locale = Locale.ROOT;
                    String lowerCase = strValueOf.toLowerCase(locale);
                    Intrinsics.h(lowerCase, "toLowerCase(...)");
                    Pair pair = new Pair("chaloPayWalletState", lowerCase);
                    Pair pair2 = new Pair("chaloPayWalletBalance", String.valueOf(((ChaloPayWalletState) chaloPayManager.d().getValue()).f));
                    String lowerCase2 = String.valueOf(((ChaloPayWalletState) chaloPayManager.d().getValue()).h).toLowerCase(locale);
                    Intrinsics.h(lowerCase2, "toLowerCase(...)");
                    iCheckoutAnalyticsHelper.h("chaloPayBottomsheetRechargeClicked", MapsKt.i(pair, pair2, new Pair("bottomsheetCTA", lowerCase2)), zQ1);
                    String strA = KUUID.a();
                    Job job = this.i0;
                    if (job != null) {
                        r3 = 0;
                        ((JobSupport) job).cancel(null);
                    } else {
                        r3 = 0;
                    }
                    this.i0 = BuildersKt.d(contextScope, r3, r3, new PaymentMainComponent$waitForWalletRechargeResult$1(this, strA, r3), 3);
                    q0(new zf0(27, this, strA));
                    return;
                }
                if (i9 != 2 && i9 != 3 && i9 != 4 && i9 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            String strValueOf2 = String.valueOf(((ChaloPayWalletState) chaloPayManager.d().getValue()).g);
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = strValueOf2.toLowerCase(locale2);
            Intrinsics.h(lowerCase3, "toLowerCase(...)");
            Pair pair3 = new Pair("chaloPayWalletState", lowerCase3);
            Pair pair4 = new Pair("chaloPayWalletBalance", String.valueOf(((ChaloPayWalletState) chaloPayManager.d().getValue()).f));
            String lowerCase4 = String.valueOf(((ChaloPayWalletState) chaloPayManager.d().getValue()).h).toLowerCase(locale2);
            Intrinsics.h(lowerCase4, "toLowerCase(...)");
            iCheckoutAnalyticsHelper.h("chaloPayBottomsheetConfirmPaymentClicked", MapsKt.i(pair3, pair4, new Pair("bottomsheetCTA", lowerCase4)), zQ1);
            Job job2 = this.e0;
            if (job2 == null || !((AbstractCoroutine) job2).isActive()) {
                this.e0 = BuildersKt.d(contextScope, coroutineContextProvider.b(), null, new PaymentMainComponent$handleCreateOrderForChaloPayment$1(this, null), 2);
                return;
            }
            return;
        }
        if (intent instanceof PaymentViewIntent.HandleChaloPayFlowAfterWebViewIntent) {
            BuildersKt.d(contextScope, coroutineContextProvider.b(), null, new PaymentMainComponent$handleChaloPayFlowAfterWebViewIntent$1(this, null), 2);
            return;
        }
        if (intent instanceof PaymentViewIntent.HandleChaloPayFlowAfterMinKYCIntent) {
            BuildersKt.d(contextScope, coroutineContextProvider.b(), null, new PaymentMainComponent$handleFlowAfterMinKYCIntent$1(this, null), 2);
            return;
        }
        if (intent instanceof PaymentViewIntent.HandleChaloPayFlowAfterRechargedIntent) {
            BuildersKt.d(contextScope, coroutineContextProvider.b(), null, new PaymentMainComponent$handleFlowAfterRechargeIntent$1(this, null), 2);
            return;
        }
        if (intent.equals(PaymentViewIntent.HandleChaloWalletBlockedOkayClickedIntent.f1555a)) {
            E0(new jq0(15));
            return;
        }
        if (intent.equals(PaymentViewIntent.ChaloPaySelectedFromWalletScreen.f1551a)) {
            r5.l0(false);
            i1();
            return;
        }
        if (intent.equals(PaymentViewIntent.ChaloPayBottomsheetTnCClicked.f1550a)) {
            boolean zQ2 = q1();
            String strValueOf3 = String.valueOf(((ChaloPayWalletState) chaloPayManager.d().getValue()).g);
            Locale locale3 = Locale.ROOT;
            String lowerCase5 = strValueOf3.toLowerCase(locale3);
            Intrinsics.h(lowerCase5, "toLowerCase(...)");
            Pair pair5 = new Pair("chaloPayWalletState", lowerCase5);
            Pair pair6 = new Pair("chaloPayWalletBalance", String.valueOf(((ChaloPayWalletState) chaloPayManager.d().getValue()).f));
            String lowerCase6 = String.valueOf(((ChaloPayWalletState) chaloPayManager.d().getValue()).h).toLowerCase(locale3);
            Intrinsics.h(lowerCase6, "toLowerCase(...)");
            iCheckoutAnalyticsHelper.h("chaloPayBottomsheetTncClicked", MapsKt.i(pair5, pair6, new Pair("bottomsheetCTA", lowerCase6)), zQ2);
            String str9 = ((PaymentDataState) this.f.getValue()).t;
            if (StringsKt.F(str9)) {
                return;
            }
            this.V.a(str9, null);
            return;
        }
        if (intent instanceof PaymentViewIntent.NativeUpiAppSelected) {
            CheckoutPaymentItem.IndividualCheckoutItem.UPIIntentPaymentItem uPIIntentPaymentItem = ((PaymentViewIntent.NativeUpiAppSelected) intent).f1562a;
            double dF = this.u.f(Long.parseLong(r5.getC().f2691a.c), CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
            CheckoutPaymentData checkoutPaymentDataU = r5.getC();
            String amount = String.valueOf(dF);
            Intrinsics.i(checkoutPaymentDataU, "<this>");
            Intrinsics.i(amount, "amount");
            CheckoutOrderData checkoutOrderData = checkoutPaymentDataU.f2691a;
            String str10 = checkoutOrderData.d;
            CheckoutPaymentProviderVpaConfig checkoutPaymentProviderVpaConfig = checkoutPaymentDataU.e;
            UpiIntentData upiIntentData = new UpiIntentData(amount, str10, (checkoutPaymentProviderVpaConfig == null || (str3 = checkoutPaymentProviderVpaConfig.b) == null) ? "" : str3, (checkoutPaymentProviderVpaConfig == null || (str2 = checkoutPaymentProviderVpaConfig.f2693a) == null) ? "" : str2, (checkoutPaymentProviderVpaConfig == null || (str = checkoutPaymentProviderVpaConfig.c) == null) ? "" : str, checkoutOrderData.f2689a, checkoutOrderData.h);
            Job job3 = this.h0;
            if (job3 != null) {
                r14 = 0;
                ((JobSupport) job3).cancel(null);
            } else {
                r14 = 0;
            }
            this.h0 = BuildersKt.d(contextScope, r14, r14, new PaymentMainComponent$handleNativeUpiAppSelectedIntent$1(this, uPIIntentPaymentItem, upiIntentData, r14), 3);
            return;
        }
        if (intent instanceof PaymentViewIntent.HandleNativeUpiAppResultIntent) {
            UpiAppResult upiAppResult = ((PaymentViewIntent.HandleNativeUpiAppResultIntent) intent).f1556a;
            ICheckoutAnalyticsHelper.DefaultImpls.a(iCheckoutAnalyticsHelper, "installed upi app result", MapsKt.i(new Pair("resultStatus", String.valueOf(upiAppResult != null ? upiAppResult.f1631a : null)), new Pair("transaction id", String.valueOf(upiAppResult != null ? upiAppResult.c : null)), new Pair("transactionReference", String.valueOf(upiAppResult != null ? upiAppResult.d : null)), new Pair("resultCode", String.valueOf(upiAppResult != null ? upiAppResult.b : null)), new Pair("isOperationCancelled", String.valueOf(upiAppResult != null ? upiAppResult.e : null)), new Pair("response", String.valueOf(upiAppResult != null ? upiAppResult.f : null))), 12);
            s1(new PaymentViewIntent.GetPaymentStatus(upiAppResult != null ? upiAppResult.c : null));
            return;
        }
        if (intent instanceof PaymentViewIntent.UpiAppSelected) {
            o1((PaymentViewIntent.UpiAppSelected) intent);
            return;
        }
        if (intent.equals(PaymentViewIntent.SeeMoreUpiAppsCtaClicked.f1572a)) {
            q0(new iq0(this, 19));
            return;
        }
        if (intent instanceof PaymentViewIntent.InAppUpiMethodSelected) {
            BuildersKt.d(contextScope, null, null, new PaymentMainComponent$handleInAppUpiMethodSelected$1(this, ((PaymentViewIntent.InAppUpiMethodSelected) intent).f1557a, null), 3);
            return;
        }
        if (intent.equals(PaymentViewIntent.AddOneClickUpiIdClicked.f1549a)) {
            E0(new jq0(11));
            r1(null);
            return;
        }
        if (intent.equals(PaymentViewIntent.PhoneAndSmsPermissionDenied.f1567a)) {
            E0(new jq0(12));
            return;
        }
        if (intent.equals(PaymentViewIntent.PhoneAndSmsPermissionGranted.f1568a)) {
            JuspayController juspayController = this.Z;
            if (juspayController == null) {
                return;
            }
            BuildersKt.d(contextScope, null, null, new PaymentMainComponent$handlePhoneAndSmsPermissionGrantedIntent$1(this, juspayController, null), 3);
            return;
        }
        if (intent.equals(PaymentViewIntent.InAppUpiSmsPermissionBottomSheetOkayClicked.f1558a)) {
            BuildersKt.d(contextScope, null, null, new PaymentMainComponent$handleInAppUpiSmsPermissionBottomSheetOkayClicked$1(this, null), 3);
            return;
        }
        if (intent.equals(PaymentViewIntent.PermissionDialogNegativeButtonClicked.f1565a)) {
            E0(new do0(26));
            return;
        }
        if (intent.equals(PaymentViewIntent.PermissionDialogPositiveButtonClicked.f1566a)) {
            E0(new jq0(25));
            this.T.b();
            return;
        }
        if (intent.equals(PaymentViewIntent.UPIManagementClicked.f1574a)) {
            ICheckoutAnalyticsHelper.DefaultImpls.a(iCheckoutAnalyticsHelper, "upi management clicked", null, 14);
            JuspayController juspayController2 = this.Z;
            if (juspayController2 == null) {
                return;
            }
            BuildersKt.d(contextScope, null, null, new PaymentMainComponent$collectJuspayOperation$1(juspayController2.d(Z0()), this, null), 3);
            return;
        }
        if (intent.equals(PaymentViewIntent.DismissPaymentBottomsheetIntent.f1552a)) {
            U0();
            return;
        }
        if (intent instanceof PaymentViewIntent.NativeAdLoaded) {
            new LinkedHashMap();
            StringsKt.F(null);
            throw null;
        }
        if (!(intent instanceof PaymentViewIntent.SeeAllUpiAppsCtaClicked)) {
            throw new NoWhenBranchMatchedException();
        }
        CheckoutPaymentItem.IndividualCheckoutItem.UPIIntentPaymentItem uPIIntentPaymentItem2 = ((PaymentViewIntent.SeeAllUpiAppsCtaClicked) intent).f1571a;
        ICheckoutAnalyticsHelper.DefaultImpls.a(iCheckoutAnalyticsHelper, "checkout see all apps clicked", null, 14);
        o1(new PaymentViewIntent.UpiAppSelected(uPIIntentPaymentItem2));
    }

    public final void t1() {
        JuspayController juspayController = this.Z;
        if (juspayController == null) {
            return;
        }
        BuildersKt.d(this.j, null, null, new PaymentMainComponent$refreshUpiAccountsIfPermitted$1(this, juspayController, null), 3);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        EmptyList emptyList = EmptyList.f17557a;
        return new PaymentDataState(null, false, null, false, null, "", false, "", "", false, null, emptyList, false, false, false, emptyList, false, MapsKt.d(), true, "");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object u1(CheckoutScreenSectionUiModel checkoutScreenSectionUiModel, ContinuationImpl continuationImpl) {
        PaymentMainComponent$sectionHeaderTags$1 paymentMainComponent$sectionHeaderTags$1;
        if (continuationImpl instanceof PaymentMainComponent$sectionHeaderTags$1) {
            paymentMainComponent$sectionHeaderTags$1 = (PaymentMainComponent$sectionHeaderTags$1) continuationImpl;
            int i = paymentMainComponent$sectionHeaderTags$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                paymentMainComponent$sectionHeaderTags$1.label = i - Integer.MIN_VALUE;
            } else {
                paymentMainComponent$sectionHeaderTags$1 = new PaymentMainComponent$sectionHeaderTags$1(this, continuationImpl);
            }
        } else {
            paymentMainComponent$sectionHeaderTags$1 = new PaymentMainComponent$sectionHeaderTags$1(this, continuationImpl);
        }
        Object objB = paymentMainComponent$sectionHeaderTags$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = paymentMainComponent$sectionHeaderTags$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            if (!(checkoutScreenSectionUiModel instanceof CheckoutScreenSectionUiModel.OneClickUPI)) {
                return EmptyList.f17557a;
            }
            paymentMainComponent$sectionHeaderTags$1.label = 1;
            objB = this.A.b(StringEnum.SUPERFAST, new Object[0], paymentMainComponent$sectionHeaderTags$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        TextUIState.ChaloTextUIState chaloTextUIState = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodySmall, ChaloColorToken.DiscountPercentTextGreen.f9792a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
        UIShape.Rectangle rectangle = UIShape.c;
        float f = ChaloThemeHelper.a().f;
        float f2 = ChaloThemeHelper.a().c;
        return CollectionsKt.R(new TextWithSpecialFeatureDataUIState.SpecialFeature(chaloTextUIState, ChaloColorToken.DiscountPercentBgGreen.f9791a, rectangle, new ChaloPadding(f2, f, f, f2)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object v1(Continuation continuation) {
        PaymentMainComponent$showUpiLinkingCard$1 paymentMainComponent$showUpiLinkingCard$1;
        Object next;
        PaymentMethodOptionsAppModel.JuspayTurboUpi juspayTurboUpi;
        if (continuation instanceof PaymentMainComponent$showUpiLinkingCard$1) {
            paymentMainComponent$showUpiLinkingCard$1 = (PaymentMainComponent$showUpiLinkingCard$1) continuation;
            int i = paymentMainComponent$showUpiLinkingCard$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                paymentMainComponent$showUpiLinkingCard$1.label = i - Integer.MIN_VALUE;
            } else {
                paymentMainComponent$showUpiLinkingCard$1 = new PaymentMainComponent$showUpiLinkingCard$1(this, continuation);
            }
        } else {
            paymentMainComponent$showUpiLinkingCard$1 = new PaymentMainComponent$showUpiLinkingCard$1(this, continuation);
        }
        Object objA = paymentMainComponent$showUpiLinkingCard$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = paymentMainComponent$showUpiLinkingCard$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objA);
            Iterator it = this.m.H().b.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((PaymentMethodOptionsAppModel) next) instanceof PaymentMethodOptionsAppModel.JuspayTurboUpi));
            PaymentMethodOptionsAppModel.JuspayTurboUpi juspayTurboUpi2 = next instanceof PaymentMethodOptionsAppModel.JuspayTurboUpi ? (PaymentMethodOptionsAppModel.JuspayTurboUpi) next : null;
            if (juspayTurboUpi2 == null) {
                return unit;
            }
            paymentMainComponent$showUpiLinkingCard$1.L$0 = juspayTurboUpi2;
            paymentMainComponent$showUpiLinkingCard$1.label = 1;
            objA = this.O.a(juspayTurboUpi2);
            if (objA == obj) {
                return obj;
            }
            juspayTurboUpi = juspayTurboUpi2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            juspayTurboUpi = (PaymentMethodOptionsAppModel.JuspayTurboUpi) paymentMainComponent$showUpiLinkingCard$1.L$0;
            ResultKt.b(objA);
        }
        E0(new kq0(c1(juspayTurboUpi, ((PaymentDataState) this.f.getValue()).o, CollectionsKt.R((CheckoutPaymentItem.IndividualCheckoutItem.InAppUpiItem.UserOnBoardingItem) objA), false), 1));
        return unit;
    }

    public final Object w1(String str, String str2, Continuation continuation) {
        Pair pair = new Pair("type", str);
        if (str2 == null) {
            str2 = "";
        }
        ICheckoutAnalyticsHelper.DefaultImpls.a(this.t, "juspay sdk upi linking card fallback", MapsKt.i(pair, new Pair("reason", str2)), 12);
        Object objV1 = v1(continuation);
        return objV1 == CoroutineSingletons.COROUTINE_SUSPENDED ? objV1 : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x1(List list, Continuation continuation) {
        PaymentMainComponent$showUserBankAccountsCard$1 paymentMainComponent$showUserBankAccountsCard$1;
        Object next;
        PaymentMethodOptionsAppModel.JuspayTurboUpi juspayTurboUpi;
        if (continuation instanceof PaymentMainComponent$showUserBankAccountsCard$1) {
            paymentMainComponent$showUserBankAccountsCard$1 = (PaymentMainComponent$showUserBankAccountsCard$1) continuation;
            int i = paymentMainComponent$showUserBankAccountsCard$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                paymentMainComponent$showUserBankAccountsCard$1.label = i - Integer.MIN_VALUE;
            } else {
                paymentMainComponent$showUserBankAccountsCard$1 = new PaymentMainComponent$showUserBankAccountsCard$1(this, continuation);
            }
        } else {
            paymentMainComponent$showUserBankAccountsCard$1 = new PaymentMainComponent$showUserBankAccountsCard$1(this, continuation);
        }
        Object objB = paymentMainComponent$showUserBankAccountsCard$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = paymentMainComponent$showUserBankAccountsCard$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objB);
            Iterator it = this.m.H().b.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((PaymentMethodOptionsAppModel) next) instanceof PaymentMethodOptionsAppModel.JuspayTurboUpi));
            PaymentMethodOptionsAppModel.JuspayTurboUpi juspayTurboUpi2 = next instanceof PaymentMethodOptionsAppModel.JuspayTurboUpi ? (PaymentMethodOptionsAppModel.JuspayTurboUpi) next : null;
            if (juspayTurboUpi2 == null) {
                return unit;
            }
            paymentMainComponent$showUserBankAccountsCard$1.L$0 = juspayTurboUpi2;
            paymentMainComponent$showUserBankAccountsCard$1.label = 1;
            objB = this.O.b(list);
            if (objB == obj) {
                return obj;
            }
            juspayTurboUpi = juspayTurboUpi2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            juspayTurboUpi = (PaymentMethodOptionsAppModel.JuspayTurboUpi) paymentMainComponent$showUserBankAccountsCard$1.L$0;
            ResultKt.b(objB);
        }
        E0(new kq0(c1(juspayTurboUpi, ((PaymentDataState) this.f.getValue()).o, (List) objB, true), 0));
        return unit;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void y0() {
        this.F.b();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:43:0x0100  */
    /* JADX WARN: Code duplicated, block: B:46:0x010b  */
    /* JADX WARN: Code duplicated, block: B:50:0x011d  */
    /* JADX WARN: Code duplicated, block: B:54:0x012e A[PHI: r1 r4 r8
      0x012e: PHI (r1v21 app.chalo.providers.stringprovider.StringProvider) = (r10v0 app.chalo.providers.stringprovider.StringProvider), (r1v22 app.chalo.providers.stringprovider.StringProvider) binds: [B:52:0x012b, B:14:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x012e: PHI (r4v19 java.lang.Object) = (r4v10 java.lang.Object), (r4v21 java.lang.Object) binds: [B:52:0x012b, B:14:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x012e: PHI (r8v2 int A[IMMUTABLE_TYPE]) = (r8v1 int), (r8v3 int) binds: [B:52:0x012b, B:14:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x0140 A[PHI: r1 r4 r5 r8
      0x0140: PHI (r1v23 app.chalo.providers.stringprovider.StringProvider) = (r1v21 app.chalo.providers.stringprovider.StringProvider), (r1v25 app.chalo.providers.stringprovider.StringProvider) binds: [B:55:0x013d, B:13:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x0140: PHI (r4v22 java.lang.String) = (r4v20 java.lang.String), (r4v24 java.lang.String) binds: [B:55:0x013d, B:13:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x0140: PHI (r5v3 java.lang.Object) = (r5v2 java.lang.Object), (r5v5 java.lang.Object) binds: [B:55:0x013d, B:13:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x0140: PHI (r8v4 int A[IMMUTABLE_TYPE]) = (r8v2 int), (r8v6 int) binds: [B:55:0x013d, B:13:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0154  */
    /* JADX WARN: Code duplicated, block: B:64:0x0167  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x011a, code lost:
    
        if (y1(r4, r2) == r3) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y1(app.chalo.checkout.data.resolver.CustomUrlPaymentStatus r18, kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.checkout.ui.screen.payment.PaymentMainComponent.y1(app.chalo.checkout.data.resolver.CustomUrlPaymentStatus, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void x0() {
    }
}
