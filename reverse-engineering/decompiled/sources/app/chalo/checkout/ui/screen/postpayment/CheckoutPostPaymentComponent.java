package app.chalo.checkout.ui.screen.postpayment;

import androidx.browser.customtabs.CustomTabsCallback;
import androidx.compose.ui.unit.Dp;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.checkout.analytics.ICheckoutAnalyticsHelper;
import app.chalo.checkout.data.model.app.ConfigWiseEventTokens;
import app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver;
import app.chalo.checkout.data.resolver.product.ICheckoutProductDataResolver;
import app.chalo.checkout.domain.GetAdjustEventTokenRemoteConfigUseCase;
import app.chalo.checkout.domain.TriggerSuperPassBookedDynamicEvent;
import app.chalo.checkout.ui.screen.payment.PaymentStatusAlertDetails;
import app.chalo.checkout.utility.CheckoutMTicketDetailsHelper;
import app.chalo.checkout.utility.CheckoutPostPaymentSuperPassDetailsHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.contract.ProductsSyncContract;
import app.chalo.data.MiscellaneousCityWiseConfigForCity;
import app.chalo.features.adjust.AdjustManager;
import app.chalo.features.chalotime.domain.ChaloTimeRefreshManagerUseCase;
import app.chalo.features.checkout.CheckoutProductType;
import app.chalo.features.onetimeoffer.UpdateOneTimeProductOfferAvailedIfNeededUseCase;
import app.chalo.instantticket.data.InstantTicketRepository;
import app.chalo.instantticket.domain.InitiateInstantTicketFetchAndStoreUseCase;
import app.chalo.metro.domain.FetchAndStoreMetroTicketUseCase;
import app.chalo.metro.domain.FetchMetroTicketFailureReason;
import app.chalo.metro.repository.MetroRepository;
import app.chalo.multimodalticket.data.model.MultiModalGroupTicketStatus;
import app.chalo.multimodalticket.data.repository.MultiModalGroupTicketRepository;
import app.chalo.multimodalticket.domain.FetchMultiModalGroupTicketAndStoreLocallyUseCase;
import app.chalo.multimodalticket.domain.FetchMultiModalGroupTicketFailureReason;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.ondc.domain.FetchAndStoreOndcMetroTicketUseCase;
import app.chalo.ondc.domain.FetchAndStoreOndcTicketUseCase;
import app.chalo.ondc.domain.FetchOndcTicketFailureReason;
import app.chalo.ondc.repository.OndcRepository;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import app.chalo.premiumbus.domain.FetchPremiumReserveTicketAndStoreLocallyUseCase;
import app.chalo.premiumbus.domain.FetchPremiumReserveTicketFailureReason;
import app.chalo.premiumbus.domain.GetPremiumReserveTicketByIdUseCase;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.lottieassetprovider.LottieType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.resultstatemanager.checkout.CheckoutResultState;
import app.chalo.resultstatemanager.checkout.CheckoutResultStateManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.CheckoutPostPaymentArgs;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.button.ButtonUIStateFactory;
import app.chalo.uistate.dialog.DialogUIStateFactory;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.error.StandardErrorScreenUIState;
import app.chalo.uistate.image.GifImageUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.success.StandardSuccessScreenUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.usecase.ConvertAmountInSubcurrencyToCurrencyUseCase;
import app.chalo.usecase.GetMiscellaneousCityWiseFlagsConfigUseCase;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.validationsdk.blevalidation.GetValidationProcessFlowDetailsForValidationProductHelper;
import app.chalo.validationsdk.blevalidation.domain.ValidationSceneResolverUseCase;
import com.arkivanov.decompose.ComponentContext;
import defpackage.ho;
import defpackage.io;
import defpackage.on;
import defpackage.ti;
import defpackage.u;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/checkout/ui/screen/postpayment/CheckoutPostPaymentComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/checkout/ui/screen/postpayment/PostPaymentViewIntent;", "Lapp/chalo/checkout/ui/screen/postpayment/PostPaymentDataState;", "Lapp/chalo/checkout/ui/screen/postpayment/PostPaymentViewState;", "Lapp/chalo/checkout/ui/screen/postpayment/PostPaymentSideEffect;", "Companion", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CheckoutPostPaymentComponent extends ChaloBaseStateMviComponent<PostPaymentViewIntent, PostPaymentDataState, PostPaymentViewState, PostPaymentSideEffect> {
    public final CheckoutPostPaymentSuperPassDetailsHelper A;
    public final InitiateInstantTicketFetchAndStoreUseCase B;
    public final FetchPremiumReserveTicketAndStoreLocallyUseCase C;
    public final InstantTicketRepository D;
    public final GetPremiumReserveTicketByIdUseCase E;
    public final FetchAndStoreOndcTicketUseCase F;
    public final OndcRepository G;
    public final FetchAndStoreOndcMetroTicketUseCase H;
    public final MetroRepository I;
    public final FetchAndStoreMetroTicketUseCase J;
    public final GetValidationProcessFlowDetailsForValidationProductHelper K;
    public final CheckoutMTicketDetailsHelper L;
    public final FetchMultiModalGroupTicketAndStoreLocallyUseCase M;
    public final MultiModalGroupTicketRepository N;
    public int O;
    public int P;
    public long Q;
    public final CheckoutPostPaymentArgs k;
    public final GetAdjustEventTokenRemoteConfigUseCase l;
    public final AdjustManager m;
    public final ConvertAmountInSubcurrencyToCurrencyUseCase n;
    public final ICheckoutProductDataResolver o;
    public final CheckoutPaymentDataResolver p;
    public final BasicInfoContract q;
    public final ChaloTimeRefreshManagerUseCase r;
    public final StringProvider s;
    public final ICheckoutAnalyticsHelper t;
    public final TriggerSuperPassBookedDynamicEvent u;
    public final GetMiscellaneousCityWiseFlagsConfigUseCase v;
    public final UpdateOneTimeProductOfferAvailedIfNeededUseCase w;
    public final ProductsSyncContract x;
    public final CheckoutResultStateManager y;
    public final ChaloNavigationManager z;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/ui/screen/postpayment/CheckoutPostPaymentComponent$Companion;", "", "", "HISTORY_CALL_MAX_RETRY_COUNT", "I", "SINGLE_PRODUCT_MAX_RETRY_COUNT", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1580a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;
        public static final /* synthetic */ int[] d;
        public static final /* synthetic */ int[] e;
        public static final /* synthetic */ int[] f;

        static {
            int[] iArr = new int[CheckoutProductType.values().length];
            try {
                iArr[CheckoutProductType.WALLET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CheckoutProductType.CARD_RECHARGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CheckoutProductType.ELECTRICITY_BILL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CheckoutProductType.NCMC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CheckoutProductType.INSTANT_TICKET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CheckoutProductType.SUPER_PASS_RIDE_PASS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CheckoutProductType.SUPER_PASS_MAGIC_PASS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CheckoutProductType.PREMIUM_RESERVE_TICKET.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CheckoutProductType.ONDC_TICKET.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[CheckoutProductType.M_TICKET.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[CheckoutProductType.MULTI_MODAL_GROUP_TICKET.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[CheckoutProductType.ONDC_METRO_TICKET.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[CheckoutProductType.METRO_TICKET.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[CheckoutProductType.UNKNOWN.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            f1580a = iArr;
            int[] iArr2 = new int[FetchMetroTicketFailureReason.values().length];
            try {
                iArr2[FetchMetroTicketFailureReason.NO_TICKET_RECEIVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[FetchMetroTicketFailureReason.INVALID_TICKET_RECEIVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[FetchMetroTicketFailureReason.SERVER_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[FetchMetroTicketFailureReason.LOCAL_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[FetchMetroTicketFailureReason.PARSE_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[FetchMetroTicketFailureReason.UNKNOWN_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            b = iArr2;
            int[] iArr3 = new int[FetchOndcTicketFailureReason.values().length];
            try {
                iArr3[FetchOndcTicketFailureReason.NO_TICKET_RECEIVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr3[FetchOndcTicketFailureReason.INVALID_TICKET_RECEIVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[FetchOndcTicketFailureReason.SERVER_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[FetchOndcTicketFailureReason.LOCAL_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[FetchOndcTicketFailureReason.PARSE_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr3[FetchOndcTicketFailureReason.UNKNOWN_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused26) {
            }
            c = iArr3;
            int[] iArr4 = new int[FetchPremiumReserveTicketFailureReason.values().length];
            try {
                iArr4[FetchPremiumReserveTicketFailureReason.NO_TICKET_RECEIVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr4[FetchPremiumReserveTicketFailureReason.INVALID_TICKET_RECEIVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr4[FetchPremiumReserveTicketFailureReason.SERVER_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr4[FetchPremiumReserveTicketFailureReason.LOCAL_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr4[FetchPremiumReserveTicketFailureReason.PARSE_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr4[FetchPremiumReserveTicketFailureReason.UNKNOWN_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused32) {
            }
            d = iArr4;
            int[] iArr5 = new int[FetchMultiModalGroupTicketFailureReason.values().length];
            try {
                iArr5[FetchMultiModalGroupTicketFailureReason.USER_NOT_LOGGED_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr5[FetchMultiModalGroupTicketFailureReason.CITY_MISSING.ordinal()] = 2;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr5[FetchMultiModalGroupTicketFailureReason.SERVER_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr5[FetchMultiModalGroupTicketFailureReason.LOCAL_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr5[FetchMultiModalGroupTicketFailureReason.PARSE_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr5[FetchMultiModalGroupTicketFailureReason.UNKNOWN_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr5[FetchMultiModalGroupTicketFailureReason.NO_TICKET_RECEIVED.ordinal()] = 7;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr5[FetchMultiModalGroupTicketFailureReason.INVALID_TICKET_RECEIVED.ordinal()] = 8;
            } catch (NoSuchFieldError unused40) {
            }
            e = iArr5;
            int[] iArr6 = new int[MultiModalGroupTicketStatus.values().length];
            try {
                iArr6[MultiModalGroupTicketStatus.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr6[MultiModalGroupTicketStatus.PAYMENT_PROCESSING.ordinal()] = 2;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr6[MultiModalGroupTicketStatus.EXPIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr6[MultiModalGroupTicketStatus.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr6[MultiModalGroupTicketStatus.PUNCHED.ordinal()] = 5;
            } catch (NoSuchFieldError unused45) {
            }
            f = iArr6;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutPostPaymentComponent(ComponentContext componentContext, CheckoutPostPaymentArgs args, GetAdjustEventTokenRemoteConfigUseCase getAdjustEventTokenRemoteConfigUseCase, AdjustManager adjustManager, ConvertAmountInSubcurrencyToCurrencyUseCase convertAmountInSubcurrencyToCurrencyUseCase, ICheckoutProductDataResolver iCheckoutProductDataResolver, CheckoutPaymentDataResolver checkoutPaymentDataResolver, BasicInfoContract basicInfoContract, ChaloTimeRefreshManagerUseCase chaloTimeRefreshManagerUseCase, StringProvider stringProvider, ICheckoutAnalyticsHelper iCheckoutAnalyticsHelper, TriggerSuperPassBookedDynamicEvent triggerSuperPassBookedDynamicEvent, GetMiscellaneousCityWiseFlagsConfigUseCase getMiscellaneousCityWiseFlagsConfigUseCase, UpdateOneTimeProductOfferAvailedIfNeededUseCase updateOneTimeProductOfferAvailedIfNeededUseCase, ProductsSyncContract productsSyncContract, CheckoutResultStateManager checkoutResultStateManager, ChaloNavigationManager chaloNavigationManager, CheckoutPostPaymentSuperPassDetailsHelper checkoutPostPaymentSuperPassDetailsHelper, InitiateInstantTicketFetchAndStoreUseCase initiateInstantTicketFetchAndStoreUseCase, FetchPremiumReserveTicketAndStoreLocallyUseCase fetchPremiumReserveTicketAndStoreLocallyUseCase, InstantTicketRepository instantTicketRepository, GetPremiumReserveTicketByIdUseCase getPremiumReserveTicketByIdUseCase, FetchAndStoreOndcTicketUseCase fetchAndStoreOndcTicketUseCase, OndcRepository ondcRepository, FetchAndStoreOndcMetroTicketUseCase fetchAndStoreOndcMetroTicketUseCase, MetroRepository metroRepository, FetchAndStoreMetroTicketUseCase fetchAndStoreMetroTicketUseCase, GetValidationProcessFlowDetailsForValidationProductHelper getValidationProcessFlowDetailsForValidationProductHelper, ValidationSceneResolverUseCase validationSceneResolverUseCase, CheckoutMTicketDetailsHelper checkoutMTicketDetailsHelper, FetchMultiModalGroupTicketAndStoreLocallyUseCase fetchMultiModalGroupTicketAndStoreLocallyUseCase, MultiModalGroupTicketRepository multiModalGroupTicketRepository) {
        super(componentContext);
        Intrinsics.i(componentContext, "componentContext");
        Intrinsics.i(args, "args");
        this.k = args;
        this.l = getAdjustEventTokenRemoteConfigUseCase;
        this.m = adjustManager;
        this.n = convertAmountInSubcurrencyToCurrencyUseCase;
        this.o = iCheckoutProductDataResolver;
        this.p = checkoutPaymentDataResolver;
        this.q = basicInfoContract;
        this.r = chaloTimeRefreshManagerUseCase;
        this.s = stringProvider;
        this.t = iCheckoutAnalyticsHelper;
        this.u = triggerSuperPassBookedDynamicEvent;
        this.v = getMiscellaneousCityWiseFlagsConfigUseCase;
        this.w = updateOneTimeProductOfferAvailedIfNeededUseCase;
        this.x = productsSyncContract;
        this.y = checkoutResultStateManager;
        this.z = chaloNavigationManager;
        this.A = checkoutPostPaymentSuperPassDetailsHelper;
        this.B = initiateInstantTicketFetchAndStoreUseCase;
        this.C = fetchPremiumReserveTicketAndStoreLocallyUseCase;
        this.D = instantTicketRepository;
        this.E = getPremiumReserveTicketByIdUseCase;
        this.F = fetchAndStoreOndcTicketUseCase;
        this.G = ondcRepository;
        this.H = fetchAndStoreOndcMetroTicketUseCase;
        this.I = metroRepository;
        this.J = fetchAndStoreMetroTicketUseCase;
        this.K = getValidationProcessFlowDetailsForValidationProductHelper;
        this.L = checkoutMTicketDetailsHelper;
        this.M = fetchMultiModalGroupTicketAndStoreLocallyUseCase;
        this.N = multiModalGroupTicketRepository;
        this.O = 5;
        this.P = 5;
        U0(PostPaymentViewIntent.ProcessPostPayment.f1594a);
    }

    public static void G0(CheckoutPostPaymentComponent checkoutPostPaymentComponent, String str, String str2, String str3, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        checkoutPostPaymentComponent.y.c(new CheckoutResultState.Success(CustomTabsCallback.ONLINE_EXTRAS_KEY, str, str2, str3), checkoutPostPaymentComponent.k.c);
        checkoutPostPaymentComponent.q0(new io(checkoutPostPaymentComponent, 3));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
    public final Object p0(PostPaymentDataState postPaymentDataState, ContinuationImpl continuationImpl) {
        CheckoutPostPaymentComponent$convertToUiState$1 checkoutPostPaymentComponent$convertToUiState$1;
        StandardErrorScreenUIState.NewErrorWithMsgAndRetry newErrorWithMsgAndRetry;
        GifImageUIState gifImageUIState;
        ImageUIState imageUIState;
        PostPaymentDataState postPaymentDataState2 = postPaymentDataState;
        if (continuationImpl instanceof CheckoutPostPaymentComponent$convertToUiState$1) {
            checkoutPostPaymentComponent$convertToUiState$1 = (CheckoutPostPaymentComponent$convertToUiState$1) continuationImpl;
            int i = checkoutPostPaymentComponent$convertToUiState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkoutPostPaymentComponent$convertToUiState$1.label = i - Integer.MIN_VALUE;
            } else {
                checkoutPostPaymentComponent$convertToUiState$1 = new CheckoutPostPaymentComponent$convertToUiState$1(this, continuationImpl);
            }
        } else {
            checkoutPostPaymentComponent$convertToUiState$1 = new CheckoutPostPaymentComponent$convertToUiState$1(this, continuationImpl);
        }
        Object objJ0 = checkoutPostPaymentComponent$convertToUiState$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = checkoutPostPaymentComponent$convertToUiState$1.label;
        if (i2 == 0) {
            ResultKt.b(objJ0);
            boolean z = postPaymentDataState2.f1582a;
            checkoutPostPaymentComponent$convertToUiState$1.L$0 = postPaymentDataState2;
            checkoutPostPaymentComponent$convertToUiState$1.label = 1;
            objJ0 = J0(z, checkoutPostPaymentComponent$convertToUiState$1);
            if (objJ0 == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            postPaymentDataState2 = (PostPaymentDataState) checkoutPostPaymentComponent$convertToUiState$1.L$0;
            ResultKt.b(objJ0);
        }
        LoadingDialogUIState loadingDialogUIState = (LoadingDialogUIState) objJ0;
        PaymentStatusAlertDetails paymentStatusAlertDetails = postPaymentDataState2.c;
        ChaloColorToken.ShadyGray shadyGray = ChaloColorToken.ShadyGray.f9851a;
        ChaloColorToken.AlmostBlackColor almostBlackColor = ChaloColorToken.AlmostBlackColor.f9756a;
        StandardSuccessScreenUIState.SuccessWithGifMsgAndCta successWithGifMsgAndCta = null;
        if (paymentStatusAlertDetails != null) {
            String str = paymentStatusAlertDetails.f1548a;
            UITextStyle uITextStyle = UITextStyle.DisplaySmall;
            UITextAlign uITextAlign = UITextAlign.Center;
            TextUIState.ChaloTextUIState chaloTextUIState = new TextUIState.ChaloTextUIState(str, uITextStyle, almostBlackColor, 0, uITextAlign, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152);
            TextUIState.ChaloTextUIState chaloTextUIState2 = new TextUIState.ChaloTextUIState(paymentStatusAlertDetails.b, UITextStyle.BodyMedium, shadyGray, 0, uITextAlign, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152);
            IconType iconType = paymentStatusAlertDetails.d;
            if (iconType != null) {
                imageUIState = new ImageUIState(iconType, (String) null, (ChaloColorToken) null, new ImageUISize(Dp.m7278constructorimpl(200)), UIContentScale.Fit, 0.0f, (UiEventHandler) null, 230);
            } else {
                imageUIState = null;
            }
            String str2 = paymentStatusAlertDetails.e;
            UITextStyle uITextStyle2 = UITextStyle.HeadlineSmall;
            TextUIState.ChaloTextUIState chaloTextUIState3 = new TextUIState.ChaloTextUIState(str2, uITextStyle2, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
            UIShape.Rectangle rectangle = UIShape.e;
            ti tiVar = new ti(13, this, paymentStatusAlertDetails);
            ButtonUIStateFactory buttonUIStateFactory = ButtonUIStateFactory.f9921a;
            ButtonUIState buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory, chaloTextUIState3, tiVar, rectangle, false, 0.0f, 52);
            String str3 = paymentStatusAlertDetails.g;
            newErrorWithMsgAndRetry = new StandardErrorScreenUIState.NewErrorWithMsgAndRetry(imageUIState, chaloTextUIState, chaloTextUIState2, buttonUIStateF, str3 != null ? ButtonUIStateFactory.d(buttonUIStateFactory, new TextUIState.ChaloTextUIState(str3, uITextStyle2, ChaloColorToken.Black.f9759a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new io(this, 2), rectangle, false, 52) : null, 32);
        } else {
            newErrorWithMsgAndRetry = null;
        }
        PostPaymentSuccessScreenDetail postPaymentSuccessScreenDetail = postPaymentDataState2.b;
        if (postPaymentSuccessScreenDetail != null) {
            String str4 = postPaymentSuccessScreenDetail.b;
            UITextStyle uITextStyle3 = UITextStyle.DisplaySmall;
            UIFontWeight uIFontWeight = UIFontWeight.Bold;
            UITextAlign uITextAlign2 = UITextAlign.Center;
            TextUIState.ChaloTextUIState chaloTextUIState4 = new TextUIState.ChaloTextUIState(str4, uITextStyle3, almostBlackColor, 0, uITextAlign2, uIFontWeight, Integer.valueOf(postPaymentSuccessScreenDetail.f ? 24 : 18), (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7960);
            String str5 = postPaymentSuccessScreenDetail.c;
            TextUIState.ChaloTextUIState chaloTextUIState5 = str5 != null ? new TextUIState.ChaloTextUIState(str5, UITextStyle.BodyMedium, shadyGray, 0, uITextAlign2, UIFontWeight.Normal, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8088) : null;
            if (postPaymentSuccessScreenDetail.e) {
                float f = 268;
                gifImageUIState = new GifImageUIState(LottieType.PASS_SUCCESS_CONFETTI, 1, new ImageUISize(Dp.m7276boximpl(Dp.m7278constructorimpl(f)), Dp.m7276boximpl(Dp.m7278constructorimpl(f))));
            } else {
                gifImageUIState = null;
            }
            successWithGifMsgAndCta = new StandardSuccessScreenUIState.SuccessWithGifMsgAndCta(null, gifImageUIState, chaloTextUIState4, chaloTextUIState5, null, null, null, null, 99);
        }
        return new PostPaymentViewState(loadingDialogUIState, newErrorWithMsgAndRetry, successWithGifMsgAndCta);
    }

    public final double H0() {
        return this.n.a(Long.parseLong(this.p.u().f2691a.c), CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
    }

    public final String I0(CheckoutProductType checkoutProductType) {
        int[] iArr = WhenMappings.f1580a;
        String str = "x1k73l";
        String str2 = "";
        switch (iArr[checkoutProductType.ordinal()]) {
            case 1:
                str = "7ckstr";
                break;
            case 2:
                str = "5l7q6i";
                break;
            case 3:
                str = "blb8gx";
                break;
            case 4:
                str = "3ifmtz";
                break;
            case 5:
            case 10:
                break;
            case 6:
            case 7:
                str = "6yi0mf";
                break;
            case 8:
                str = "vttpnw";
                break;
            case 9:
            case 11:
            case 12:
            case 13:
            case 14:
                str = "";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        switch (iArr[checkoutProductType.ordinal()]) {
            case 1:
                str2 = "2ihcpd";
                break;
            case 2:
                str2 = "dkmya9";
                break;
            case 3:
                str2 = "dh38ae";
                break;
            case 4:
                str2 = "2m4h8m";
                break;
            case 5:
            case 10:
                str2 = "hak678";
                break;
            case 6:
            case 7:
                str2 = "7p0qwi";
                break;
            case 8:
                str2 = "sson16";
                break;
            case 9:
            case 11:
            case 12:
            case 13:
            case 14:
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (!this.q.f()) {
            str = str2;
        }
        if (str.length() > 0) {
            return str;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object J0(boolean z, ContinuationImpl continuationImpl) {
        CheckoutPostPaymentComponent$getLoadingDialogState$1 checkoutPostPaymentComponent$getLoadingDialogState$1;
        DialogUIStateFactory dialogUIStateFactory;
        if (continuationImpl instanceof CheckoutPostPaymentComponent$getLoadingDialogState$1) {
            checkoutPostPaymentComponent$getLoadingDialogState$1 = (CheckoutPostPaymentComponent$getLoadingDialogState$1) continuationImpl;
            int i = checkoutPostPaymentComponent$getLoadingDialogState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkoutPostPaymentComponent$getLoadingDialogState$1.label = i - Integer.MIN_VALUE;
            } else {
                checkoutPostPaymentComponent$getLoadingDialogState$1 = new CheckoutPostPaymentComponent$getLoadingDialogState$1(this, continuationImpl);
            }
        } else {
            checkoutPostPaymentComponent$getLoadingDialogState$1 = new CheckoutPostPaymentComponent$getLoadingDialogState$1(this, continuationImpl);
        }
        Object objB = checkoutPostPaymentComponent$getLoadingDialogState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = checkoutPostPaymentComponent$getLoadingDialogState$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            if (!z) {
                return null;
            }
            DialogUIStateFactory dialogUIStateFactory2 = DialogUIStateFactory.f9989a;
            checkoutPostPaymentComponent$getLoadingDialogState$1.L$0 = dialogUIStateFactory2;
            checkoutPostPaymentComponent$getLoadingDialogState$1.label = 1;
            objB = this.s.b(StringEnum.LOADING_THREE_DOTS, new Object[0], checkoutPostPaymentComponent$getLoadingDialogState$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            dialogUIStateFactory = dialogUIStateFactory2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dialogUIStateFactory = (DialogUIStateFactory) checkoutPostPaymentComponent$getLoadingDialogState$1.L$0;
            ResultKt.b(objB);
        }
        dialogUIStateFactory.getClass();
        return DialogUIStateFactory.a((String) objB);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009e  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ad A[PHI: r1 r17
      0x00ad: PHI (r1v12 java.lang.Object) = (r1v11 java.lang.Object), (r1v1 java.lang.Object) binds: [B:26:0x00a9, B:18:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x00ad: PHI (r17v1 char) = (r17v0 char), (r17v2 char) binds: [B:26:0x00a9, B:18:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:41:0x0100  */
    /* JADX WARN: Code duplicated, block: B:44:0x010f A[PHI: r1
      0x010f: PHI (r1v20 app.chalo.instantticket.data.model.InstantTicketEntity) = 
      (r1v13 app.chalo.instantticket.data.model.InstantTicketEntity)
      (r1v22 app.chalo.instantticket.data.model.InstantTicketEntity)
     binds: [B:42:0x010c, B:14:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x0123  */
    /* JADX WARN: Code duplicated, block: B:50:0x0134  */
    /* JADX WARN: Code duplicated, block: B:52:0x0138  */
    /* JADX WARN: Code duplicated, block: B:55:0x0144  */
    /* JADX WARN: Code duplicated, block: B:58:0x017c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c9, code lost:
    
        if (W0(r2) == r3) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K0(kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.checkout.ui.screen.postpayment.CheckoutPostPaymentComponent.K0(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0088  */
    /* JADX WARN: Code duplicated, block: B:28:0x009c A[PHI: r1
      0x009c: PHI (r1v11 java.lang.Object) = (r1v10 java.lang.Object), (r1v1 java.lang.Object) binds: [B:26:0x0098, B:18:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:44:0x0102 A[PHI: r1
      0x0102: PHI (r1v19 app.chalo.checkout.ui.screen.postpayment.PostPaymentSuccessProductType$MTicket) = 
      (r1v12 app.chalo.checkout.ui.screen.postpayment.PostPaymentSuccessProductType$MTicket)
      (r1v21 app.chalo.checkout.ui.screen.postpayment.PostPaymentSuccessProductType$MTicket)
     binds: [B:42:0x00ff, B:14:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x0116  */
    /* JADX WARN: Code duplicated, block: B:50:0x0126  */
    /* JADX WARN: Code duplicated, block: B:52:0x012a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0136  */
    /* JADX WARN: Code duplicated, block: B:58:0x016c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b8, code lost:
    
        if (W0(r2) == r3) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L0(kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.checkout.ui.screen.postpayment.CheckoutPostPaymentComponent.L0(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:40:0x0108 A[PHI: r4 r6 r7 r18
      0x0108: PHI (r4v5 java.lang.String) = (r10v0 java.lang.String), (r4v8 java.lang.String) binds: [B:38:0x0104, B:20:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x0108: PHI (r6v5 java.lang.String) = (r6v4 java.lang.String), (r6v14 java.lang.String) binds: [B:38:0x0104, B:20:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x0108: PHI (r7v4 java.lang.Object) = (r7v3 java.lang.Object), (r7v6 java.lang.Object) binds: [B:38:0x0104, B:20:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x0108: PHI (r18v3 char) = (r6v0 char), (r18v4 char) binds: [B:38:0x0104, B:20:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x010f  */
    /* JADX WARN: Code duplicated, block: B:45:0x011e A[PHI: r1
      0x011e: PHI (r1v14 java.lang.Object) = (r1v13 java.lang.Object), (r1v1 java.lang.Object) binds: [B:43:0x011a, B:19:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x0122  */
    /* JADX WARN: Code duplicated, block: B:50:0x0130 A[PHI: r1
      0x0130: PHI (r1v18 app.chalo.metro.data.app.MetroTicketAppModel) = (r1v15 app.chalo.metro.data.app.MetroTicketAppModel), (r1v20 app.chalo.metro.data.app.MetroTicketAppModel) binds: [B:48:0x012c, B:18:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x0145  */
    /* JADX WARN: Code duplicated, block: B:56:0x0156  */
    /* JADX WARN: Code duplicated, block: B:59:0x0160  */
    /* JADX WARN: Code duplicated, block: B:61:0x0164  */
    /* JADX WARN: Code duplicated, block: B:63:0x0176  */
    /* JADX WARN: Code duplicated, block: B:65:0x017c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0189  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:75:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0096, code lost:
    
        if (W0(r2) == r3) goto L73;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M0(kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.checkout.ui.screen.postpayment.CheckoutPostPaymentComponent.M0(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0102  */
    /* JADX WARN: Code duplicated, block: B:39:0x0109  */
    /* JADX WARN: Code duplicated, block: B:43:0x0125 A[PHI: r4 r6 r7 r18
      0x0125: PHI (r4v5 java.lang.String) = (r7v0 java.lang.String), (r4v8 java.lang.String) binds: [B:41:0x0121, B:23:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x0125: PHI (r6v9 java.lang.String) = (r6v7 java.lang.String), (r6v10 java.lang.String) binds: [B:41:0x0121, B:23:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x0125: PHI (r7v3 java.lang.Object) = (r7v2 java.lang.Object), (r7v9 java.lang.Object) binds: [B:41:0x0121, B:23:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x0125: PHI (r18v3 int) = (r13v0 int), (r18v4 int) binds: [B:41:0x0121, B:23:0x0090] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x012b  */
    /* JADX WARN: Code duplicated, block: B:47:0x013d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0143  */
    /* JADX WARN: Code duplicated, block: B:52:0x0151  */
    /* JADX WARN: Code duplicated, block: B:55:0x0160  */
    /* JADX WARN: Code duplicated, block: B:58:0x0198  */
    /* JADX WARN: Code duplicated, block: B:60:0x019c  */
    /* JADX WARN: Code duplicated, block: B:63:0x01af A[PHI: r4 r6 r7 r18
      0x01af: PHI (r4v11 java.lang.String) = (r4v5 java.lang.String), (r4v16 java.lang.String) binds: [B:61:0x01ab, B:19:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x01af: PHI (r6v12 java.lang.String) = (r6v9 java.lang.String), (r6v13 java.lang.String) binds: [B:61:0x01ab, B:19:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x01af: PHI (r7v10 java.lang.Object) = (r7v8 java.lang.Object), (r7v12 java.lang.Object) binds: [B:61:0x01ab, B:19:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x01af: PHI (r18v7 int) = (r18v3 int), (r18v8 int) binds: [B:61:0x01ab, B:19:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:70:0x01cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:82:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:85:0x022d  */
    /* JADX WARN: Code duplicated, block: B:88:0x023b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:89:0x023c  */
    /* JADX WARN: Code duplicated, block: B:92:0x024b  */
    /* JADX WARN: Code duplicated, block: B:96:0x0261  */
    /* JADX WARN: Code duplicated, block: B:99:0x026d  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b4, code lost:
    
        if (W0(r2) == r3) goto L95;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N0(kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            Method dump skipped, instruction units count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.checkout.ui.screen.postpayment.CheckoutPostPaymentComponent.N0(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bb A[PHI: r1 r18
      0x00bb: PHI (r1v14 java.lang.Object) = (r1v13 java.lang.Object), (r1v1 java.lang.Object) binds: [B:29:0x00b7, B:21:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x00bb: PHI (r18v1 char) = (r18v0 char), (r18v2 char) binds: [B:29:0x00b7, B:21:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:43:0x010e  */
    /* JADX WARN: Code duplicated, block: B:46:0x011e A[PHI: r1
      0x011e: PHI (r1v21 app.chalo.ondc.model.app.OndcMetroTicketAppModel) = (r1v15 app.chalo.ondc.model.app.OndcMetroTicketAppModel), (r1v23 app.chalo.ondc.model.app.OndcMetroTicketAppModel) binds: [B:44:0x011a, B:17:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x0133  */
    /* JADX WARN: Code duplicated, block: B:52:0x0143  */
    /* JADX WARN: Code duplicated, block: B:54:0x0147  */
    /* JADX WARN: Code duplicated, block: B:56:0x0159  */
    /* JADX WARN: Code duplicated, block: B:58:0x015f  */
    /* JADX WARN: Code duplicated, block: B:61:0x016c  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x01be A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:76:0x020c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d5, code lost:
    
        if (W0(r2) == r3) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O0(kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            Method dump skipped, instruction units count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.checkout.ui.screen.postpayment.CheckoutPostPaymentComponent.O0(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:28:0x00af A[PHI: r1
      0x00af: PHI (r1v12 java.lang.Object) = (r1v11 java.lang.Object), (r1v1 java.lang.Object) binds: [B:26:0x00ab, B:18:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:41:0x0102  */
    /* JADX WARN: Code duplicated, block: B:44:0x0111 A[PHI: r1 r17
      0x0111: PHI (r1v20 app.chalo.ondc.model.app.OndcTicketAppModel) = (r1v13 app.chalo.ondc.model.app.OndcTicketAppModel), (r1v22 app.chalo.ondc.model.app.OndcTicketAppModel) binds: [B:42:0x010e, B:14:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0111: PHI (r17v5 int) = (r8v0 int), (r17v6 int) binds: [B:42:0x010e, B:14:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x0125  */
    /* JADX WARN: Code duplicated, block: B:50:0x0137  */
    /* JADX WARN: Code duplicated, block: B:52:0x013b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0147  */
    /* JADX WARN: Code duplicated, block: B:58:0x0181  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cb, code lost:
    
        if (W0(r2) == r3) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P0(kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.checkout.ui.screen.postpayment.CheckoutPostPaymentComponent.P0(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:102:0x033a  */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0126  */
    /* JADX WARN: Code duplicated, block: B:38:0x0139 A[PHI: r1
      0x0139: PHI (r1v16 java.lang.Object) = (r1v15 java.lang.Object), (r1v1 java.lang.Object) binds: [B:36:0x0135, B:28:0x00fa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x013e  */
    /* JADX WARN: Code duplicated, block: B:43:0x014d A[PHI: r4
      0x014d: PHI (r4v18 app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel) = 
      (r4v16 app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel)
      (r4v20 app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel)
     binds: [B:41:0x0149, B:27:0x00f2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x015f A[PHI: r1 r4 r5
      0x015f: PHI (r1v26 java.lang.Object) = (r1v25 java.lang.Object), (r1v1 java.lang.Object) binds: [B:44:0x015b, B:26:0x00e8] A[DONT_GENERATE, DONT_INLINE]
      0x015f: PHI (r4v21 app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel) = 
      (r4v18 app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel)
      (r4v23 app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel)
     binds: [B:44:0x015b, B:26:0x00e8] A[DONT_GENERATE, DONT_INLINE]
      0x015f: PHI (r5v5 int A[IMMUTABLE_TYPE]) = (r5v4 int), (r5v7 int) binds: [B:44:0x015b, B:26:0x00e8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x0174  */
    /* JADX WARN: Code duplicated, block: B:52:0x0184  */
    /* JADX WARN: Code duplicated, block: B:54:0x018a  */
    /* JADX WARN: Code duplicated, block: B:57:0x0195  */
    /* JADX WARN: Code duplicated, block: B:58:0x0199  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a9 A[PHI: r1 r4
      0x01a9: PHI (r1v31 java.lang.Object) = (r1v19 java.lang.Object), (r1v1 java.lang.Object) binds: [B:59:0x01a5, B:22:0x00d1] A[DONT_GENERATE, DONT_INLINE]
      0x01a9: PHI (r4v25 int A[IMMUTABLE_TYPE]) = (r4v17 int), (r4v26 int) binds: [B:59:0x01a5, B:22:0x00d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:68:0x01da  */
    /* JADX WARN: Code duplicated, block: B:72:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:75:0x0247  */
    /* JADX WARN: Code duplicated, block: B:77:0x024f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0261  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x0267  */
    /* JADX WARN: Code duplicated, block: B:84:0x027a  */
    /* JADX WARN: Code duplicated, block: B:88:0x0293 A[PHI: r1 r4 r5 r6 r19 r20
      0x0293: PHI (r1v46 java.lang.Object) = (r1v45 java.lang.Object), (r1v1 java.lang.Object) binds: [B:86:0x028f, B:15:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x0293: PHI (r4v45 java.lang.String) = (r4v42 java.lang.String), (r4v48 java.lang.String) binds: [B:86:0x028f, B:15:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x0293: PHI (r5v14 int A[IMMUTABLE_TYPE]) = (r5v12 int), (r5v18 int) binds: [B:86:0x028f, B:15:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x0293: PHI (r6v19 app.chalo.utils.ChaloUseCaseResult) = (r6v17 app.chalo.utils.ChaloUseCaseResult), (r6v21 app.chalo.utils.ChaloUseCaseResult) binds: [B:86:0x028f, B:15:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x0293: PHI (r19v10 char) = (r8v0 char), (r19v11 char) binds: [B:86:0x028f, B:15:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x0293: PHI (r20v6 app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver) = 
      (r5v0 app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver)
      (r20v7 app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver)
     binds: [B:86:0x028f, B:15:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:91:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:95:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:98:0x032a  */
    public final Object Q0(ContinuationImpl continuationImpl) {
        CheckoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1 checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1;
        String str;
        ChaloUseCaseResult chaloUseCaseResult;
        int i;
        Object objB;
        ChaloUseCaseResult chaloUseCaseResult2;
        PremiumReserveTicketAppModel premiumReserveTicketAppModel;
        int i2;
        CheckoutProductType checkoutProductType;
        int i3;
        String str2;
        Object objB2;
        String str3;
        PremiumReserveTicketAppModel premiumReserveTicketAppModel2;
        String str4;
        Object objB3;
        String str5;
        String str6;
        Object objB4;
        String str7;
        String str8;
        Object objB5;
        String str9;
        String str10;
        String str11;
        String str12;
        Object objB6;
        String str13;
        String str14;
        String str15;
        Object objB7;
        String str16;
        String str17;
        ChaloUseCaseResult chaloUseCaseResult3;
        if (continuationImpl instanceof CheckoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1) {
            checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1 = (CheckoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1) continuationImpl;
            int i4 = checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label = i4 - Integer.MIN_VALUE;
            } else {
                checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1 = new CheckoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1(this, continuationImpl);
            }
        } else {
            checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1 = new CheckoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1(this, continuationImpl);
        }
        Object objA = checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label;
        char c = 1;
        ICheckoutAnalyticsHelper iCheckoutAnalyticsHelper = this.t;
        Unit unit = Unit.f17538a;
        CheckoutPaymentDataResolver checkoutPaymentDataResolver = this.p;
        StringProvider stringProvider = this.s;
        switch (i5) {
            case 0:
                ResultKt.b(objA);
                str = checkoutPaymentDataResolver.u().f2691a.h;
                checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0 = str;
                checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label = 1;
                objA = this.C.a(str, checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1);
                if (objA != obj) {
                    chaloUseCaseResult = (ChaloUseCaseResult) objA;
                    if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                        Flow flowA = this.E.a(str);
                        checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0 = null;
                        checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label = 2;
                        objA = FlowKt.v(flowA, checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1);
                        if (objA != obj) {
                            premiumReserveTicketAppModel = (PremiumReserveTicketAppModel) objA;
                            if (premiumReserveTicketAppModel != null) {
                                checkoutProductType = CheckoutProductType.PREMIUM_RESERVE_TICKET;
                                checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0 = premiumReserveTicketAppModel;
                                checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label = 3;
                                if (R0(checkoutProductType, checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1) != obj) {
                                    i3 = 0;
                                    checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0 = premiumReserveTicketAppModel;
                                    checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label = 4;
                                    objA = stringProvider.b(StringEnum.RIDE_BOOKED, new Object[0], checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1);
                                    if (objA != obj) {
                                        str2 = (String) objA;
                                        checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0 = premiumReserveTicketAppModel;
                                        checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$1 = str2;
                                        checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label = 5;
                                        objB2 = stringProvider.b(StringEnum.ENJOY_YOUR_PREMIUM_RIDE, new Object[i3], checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1);
                                        if (objB2 != obj) {
                                            str3 = str2;
                                            objA = objB2;
                                            premiumReserveTicketAppModel2 = premiumReserveTicketAppModel;
                                            E0(new u(15, premiumReserveTicketAppModel2, str3, (String) objA));
                                            return unit;
                                        }
                                    }
                                }
                            } else if (T0()) {
                                checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label = 6;
                                if (Q0(checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1) != obj) {
                                    return unit;
                                }
                            } else {
                                i2 = 0;
                                checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label = 7;
                                objA = stringProvider.b(StringEnum.PAYMENT_STATUS_UNCLEAR, new Object[0], checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1);
                                if (objA != obj) {
                                    str4 = (String) objA;
                                    checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0 = str4;
                                    checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label = 8;
                                    objB3 = stringProvider.b(StringEnum.PAYMENT_STATUS_UNCLEAR_DESC, new Object[i2], checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1);
                                    if (objB3 != obj) {
                                        str5 = str4;
                                        objA = objB3;
                                        str6 = (String) objA;
                                        checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0 = str5;
                                        checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$1 = str6;
                                        checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label = 9;
                                        objB4 = stringProvider.b(StringEnum.VIEW_MY_TICKETS_AND_PASSES, new Object[i2], checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1);
                                        if (objB4 != obj) {
                                            str7 = str6;
                                            objA = objB4;
                                            str8 = (String) objA;
                                            checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0 = str5;
                                            checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$1 = str7;
                                            checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$2 = str8;
                                            checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label = 10;
                                            objB5 = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1);
                                            if (objB5 != obj) {
                                                str9 = str5;
                                                str10 = str8;
                                                objA = objB5;
                                                E0(new ho(str9, str7, IconType.INTERNET_FAILURE, str10, (String) objA, 4));
                                                Pair pair = new Pair("reason", "ticket details not available");
                                                Pair pair2 = new Pair("transaction id", checkoutPaymentDataResolver.u().f2691a.h);
                                                Pair pair3 = new Pair("historyCallRetryCount", new Integer(5 - this.O));
                                                Pair[] pairArr = new Pair[3];
                                                pairArr[0] = pair;
                                                pairArr[c] = pair2;
                                                pairArr[2] = pair3;
                                                ICheckoutAnalyticsHelper.DefaultImpls.a(iCheckoutAnalyticsHelper, "post payment history call use case failure", MapsKt.i(pairArr), 12);
                                                return unit;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                            throw new NoWhenBranchMatchedException();
                        }
                        switch (WhenMappings.d[((FetchPremiumReserveTicketFailureReason) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).ordinal()]) {
                            case 1:
                                checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0 = null;
                                checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label = 11;
                                if (Q0(checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1) == obj) {
                                    return unit;
                                }
                                break;
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i = 0;
                                checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0 = chaloUseCaseResult;
                                checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label = 12;
                                objB = stringProvider.b(StringEnum.PAYMENT_STATUS_UNCLEAR, new Object[0], checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1);
                                if (objB != obj) {
                                    chaloUseCaseResult2 = chaloUseCaseResult;
                                    objA = objB;
                                    str11 = (String) objA;
                                    checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0 = chaloUseCaseResult2;
                                    checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$1 = str11;
                                    checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label = 13;
                                    objA = stringProvider.b(StringEnum.PAYMENT_STATUS_UNCLEAR_DESC, new Object[i], checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1);
                                    if (objA != obj) {
                                        str12 = (String) objA;
                                        checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0 = chaloUseCaseResult2;
                                        checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$1 = str11;
                                        checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$2 = str12;
                                        checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label = 14;
                                        objB6 = stringProvider.b(StringEnum.VIEW_MY_TICKETS_AND_PASSES, new Object[i], checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1);
                                        if (objB6 != obj) {
                                            String str18 = str11;
                                            str13 = str12;
                                            objA = objB6;
                                            str14 = str18;
                                            str15 = (String) objA;
                                            checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0 = chaloUseCaseResult2;
                                            checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$1 = str14;
                                            checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$2 = str13;
                                            checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$3 = str15;
                                            checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label = 15;
                                            objB7 = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1);
                                            if (objB7 != obj) {
                                                str16 = str15;
                                                objA = objB7;
                                                str17 = str14;
                                                chaloUseCaseResult3 = chaloUseCaseResult2;
                                                E0(new ho(str17, str13, IconType.INTERNET_FAILURE, str16, (String) objA, 0));
                                                Pair pair4 = new Pair("reason", ((FetchPremiumReserveTicketFailureReason) ((ChaloUseCaseResult.Failure) chaloUseCaseResult3).f10418a).name());
                                                Pair pair5 = new Pair("transaction id", checkoutPaymentDataResolver.u().f2691a.h);
                                                Pair pair6 = new Pair("historyCallRetryCount", new Integer(5 - this.O));
                                                Pair[] pairArr2 = new Pair[3];
                                                pairArr2[0] = pair4;
                                                pairArr2[c] = pair5;
                                                pairArr2[2] = pair6;
                                                ICheckoutAnalyticsHelper.DefaultImpls.a(iCheckoutAnalyticsHelper, "post payment history call use case failure", MapsKt.i(pairArr2), 12);
                                                return unit;
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    }
                }
                return obj;
            case 1:
                str = (String) checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0;
                ResultKt.b(objA);
                chaloUseCaseResult = (ChaloUseCaseResult) objA;
                if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                    Flow flowA2 = this.E.a(str);
                    checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0 = null;
                    checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label = 2;
                    objA = FlowKt.v(flowA2, checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1);
                    if (objA != obj) {
                        premiumReserveTicketAppModel = (PremiumReserveTicketAppModel) objA;
                        if (premiumReserveTicketAppModel != null) {
                            checkoutProductType = CheckoutProductType.PREMIUM_RESERVE_TICKET;
                            checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0 = premiumReserveTicketAppModel;
                            checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label = 3;
                            if (R0(checkoutProductType, checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1) != obj) {
                                i3 = 0;
                                checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0 = premiumReserveTicketAppModel;
                                checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label = 4;
                                objA = stringProvider.b(StringEnum.RIDE_BOOKED, new Object[0], checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1);
                                if (objA != obj) {
                                    str2 = (String) objA;
                                    checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0 = premiumReserveTicketAppModel;
                                    checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$1 = str2;
                                    checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label = 5;
                                    objB2 = stringProvider.b(StringEnum.ENJOY_YOUR_PREMIUM_RIDE, new Object[i3], checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1);
                                    if (objB2 != obj) {
                                        str3 = str2;
                                        objA = objB2;
                                        premiumReserveTicketAppModel2 = premiumReserveTicketAppModel;
                                        E0(new u(15, premiumReserveTicketAppModel2, str3, (String) objA));
                                        return unit;
                                    }
                                }
                            }
                        } else if (T0()) {
                            checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label = 6;
                            if (Q0(checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1) != obj) {
                                return unit;
                            }
                        } else {
                            i2 = 0;
                            checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label = 7;
                            objA = stringProvider.b(StringEnum.PAYMENT_STATUS_UNCLEAR, new Object[0], checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1);
                            if (objA != obj) {
                                str4 = (String) objA;
                                checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0 = str4;
                                checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label = 8;
                                objB3 = stringProvider.b(StringEnum.PAYMENT_STATUS_UNCLEAR_DESC, new Object[i2], checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1);
                                if (objB3 != obj) {
                                    str5 = str4;
                                    objA = objB3;
                                    str6 = (String) objA;
                                    checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0 = str5;
                                    checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$1 = str6;
                                    checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label = 9;
                                    objB4 = stringProvider.b(StringEnum.VIEW_MY_TICKETS_AND_PASSES, new Object[i2], checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1);
                                    if (objB4 != obj) {
                                        str7 = str6;
                                        objA = objB4;
                                        str8 = (String) objA;
                                        checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0 = str5;
                                        checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$1 = str7;
                                        checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$2 = str8;
                                        checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label = 10;
                                        objB5 = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1);
                                        if (objB5 != obj) {
                                            str9 = str5;
                                            str10 = str8;
                                            objA = objB5;
                                            E0(new ho(str9, str7, IconType.INTERNET_FAILURE, str10, (String) objA, 4));
                                            Pair pair7 = new Pair("reason", "ticket details not available");
                                            Pair pair8 = new Pair("transaction id", checkoutPaymentDataResolver.u().f2691a.h);
                                            Pair pair9 = new Pair("historyCallRetryCount", new Integer(5 - this.O));
                                            Pair[] pairArr3 = new Pair[3];
                                            pairArr3[0] = pair7;
                                            pairArr3[c] = pair8;
                                            pairArr3[2] = pair9;
                                            ICheckoutAnalyticsHelper.DefaultImpls.a(iCheckoutAnalyticsHelper, "post payment history call use case failure", MapsKt.i(pairArr3), 12);
                                            return unit;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                        throw new NoWhenBranchMatchedException();
                    }
                    switch (WhenMappings.d[((FetchPremiumReserveTicketFailureReason) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).ordinal()]) {
                        case 1:
                            checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0 = null;
                            checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label = 11;
                            if (Q0(checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1) == obj) {
                                return unit;
                            }
                            break;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            i = 0;
                            checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0 = chaloUseCaseResult;
                            checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label = 12;
                            objB = stringProvider.b(StringEnum.PAYMENT_STATUS_UNCLEAR, new Object[0], checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1);
                            if (objB != obj) {
                                chaloUseCaseResult2 = chaloUseCaseResult;
                                objA = objB;
                                str11 = (String) objA;
                                checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0 = chaloUseCaseResult2;
                                checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$1 = str11;
                                checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label = 13;
                                objA = stringProvider.b(StringEnum.PAYMENT_STATUS_UNCLEAR_DESC, new Object[i], checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1);
                                if (objA != obj) {
                                    str12 = (String) objA;
                                    checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0 = chaloUseCaseResult2;
                                    checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$1 = str11;
                                    checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$2 = str12;
                                    checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label = 14;
                                    objB6 = stringProvider.b(StringEnum.VIEW_MY_TICKETS_AND_PASSES, new Object[i], checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1);
                                    if (objB6 != obj) {
                                        String str19 = str11;
                                        str13 = str12;
                                        objA = objB6;
                                        str14 = str19;
                                        str15 = (String) objA;
                                        checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0 = chaloUseCaseResult2;
                                        checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$1 = str14;
                                        checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$2 = str13;
                                        checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$3 = str15;
                                        checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label = 15;
                                        objB7 = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1);
                                        if (objB7 != obj) {
                                            str16 = str15;
                                            objA = objB7;
                                            str17 = str14;
                                            chaloUseCaseResult3 = chaloUseCaseResult2;
                                            E0(new ho(str17, str13, IconType.INTERNET_FAILURE, str16, (String) objA, 0));
                                            Pair pair10 = new Pair("reason", ((FetchPremiumReserveTicketFailureReason) ((ChaloUseCaseResult.Failure) chaloUseCaseResult3).f10418a).name());
                                            Pair pair11 = new Pair("transaction id", checkoutPaymentDataResolver.u().f2691a.h);
                                            Pair pair12 = new Pair("historyCallRetryCount", new Integer(5 - this.O));
                                            Pair[] pairArr4 = new Pair[3];
                                            pairArr4[0] = pair10;
                                            pairArr4[c] = pair11;
                                            pairArr4[2] = pair12;
                                            ICheckoutAnalyticsHelper.DefaultImpls.a(iCheckoutAnalyticsHelper, "post payment history call use case failure", MapsKt.i(pairArr4), 12);
                                            return unit;
                                        }
                                    }
                                }
                            }
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
                return obj;
            case 2:
                ResultKt.b(objA);
                premiumReserveTicketAppModel = (PremiumReserveTicketAppModel) objA;
                if (premiumReserveTicketAppModel != null) {
                    checkoutProductType = CheckoutProductType.PREMIUM_RESERVE_TICKET;
                    checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0 = premiumReserveTicketAppModel;
                    checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label = 3;
                    if (R0(checkoutProductType, checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1) != obj) {
                        i3 = 0;
                        checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0 = premiumReserveTicketAppModel;
                        checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label = 4;
                        objA = stringProvider.b(StringEnum.RIDE_BOOKED, new Object[0], checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1);
                        if (objA != obj) {
                            str2 = (String) objA;
                            checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0 = premiumReserveTicketAppModel;
                            checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$1 = str2;
                            checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label = 5;
                            objB2 = stringProvider.b(StringEnum.ENJOY_YOUR_PREMIUM_RIDE, new Object[i3], checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1);
                            if (objB2 != obj) {
                                str3 = str2;
                                objA = objB2;
                                premiumReserveTicketAppModel2 = premiumReserveTicketAppModel;
                                E0(new u(15, premiumReserveTicketAppModel2, str3, (String) objA));
                                return unit;
                            }
                        }
                    }
                } else if (T0()) {
                    checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label = 6;
                    if (Q0(checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1) != obj) {
                        return unit;
                    }
                } else {
                    i2 = 0;
                    checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label = 7;
                    objA = stringProvider.b(StringEnum.PAYMENT_STATUS_UNCLEAR, new Object[0], checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1);
                    if (objA != obj) {
                        str4 = (String) objA;
                        checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0 = str4;
                        checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label = 8;
                        objB3 = stringProvider.b(StringEnum.PAYMENT_STATUS_UNCLEAR_DESC, new Object[i2], checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1);
                        if (objB3 != obj) {
                            str5 = str4;
                            objA = objB3;
                            str6 = (String) objA;
                            checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0 = str5;
                            checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$1 = str6;
                            checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label = 9;
                            objB4 = stringProvider.b(StringEnum.VIEW_MY_TICKETS_AND_PASSES, new Object[i2], checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1);
                            if (objB4 != obj) {
                                str7 = str6;
                                objA = objB4;
                                str8 = (String) objA;
                                checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0 = str5;
                                checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$1 = str7;
                                checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$2 = str8;
                                checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label = 10;
                                objB5 = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1);
                                if (objB5 != obj) {
                                    str9 = str5;
                                    str10 = str8;
                                    objA = objB5;
                                    E0(new ho(str9, str7, IconType.INTERNET_FAILURE, str10, (String) objA, 4));
                                    Pair pair13 = new Pair("reason", "ticket details not available");
                                    Pair pair14 = new Pair("transaction id", checkoutPaymentDataResolver.u().f2691a.h);
                                    Pair pair15 = new Pair("historyCallRetryCount", new Integer(5 - this.O));
                                    Pair[] pairArr5 = new Pair[3];
                                    pairArr5[0] = pair13;
                                    pairArr5[c] = pair14;
                                    pairArr5[2] = pair15;
                                    ICheckoutAnalyticsHelper.DefaultImpls.a(iCheckoutAnalyticsHelper, "post payment history call use case failure", MapsKt.i(pairArr5), 12);
                                    return unit;
                                }
                            }
                        }
                    }
                }
                return obj;
            case 3:
                premiumReserveTicketAppModel = (PremiumReserveTicketAppModel) checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0;
                ResultKt.b(objA);
                i3 = 0;
                checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0 = premiumReserveTicketAppModel;
                checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label = 4;
                objA = stringProvider.b(StringEnum.RIDE_BOOKED, new Object[0], checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1);
                if (objA != obj) {
                    str2 = (String) objA;
                    checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0 = premiumReserveTicketAppModel;
                    checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$1 = str2;
                    checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label = 5;
                    objB2 = stringProvider.b(StringEnum.ENJOY_YOUR_PREMIUM_RIDE, new Object[i3], checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1);
                    if (objB2 != obj) {
                        str3 = str2;
                        objA = objB2;
                        premiumReserveTicketAppModel2 = premiumReserveTicketAppModel;
                        E0(new u(15, premiumReserveTicketAppModel2, str3, (String) objA));
                        return unit;
                    }
                }
                return obj;
            case 4:
                premiumReserveTicketAppModel = (PremiumReserveTicketAppModel) checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0;
                ResultKt.b(objA);
                i3 = 0;
                str2 = (String) objA;
                checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0 = premiumReserveTicketAppModel;
                checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$1 = str2;
                checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label = 5;
                objB2 = stringProvider.b(StringEnum.ENJOY_YOUR_PREMIUM_RIDE, new Object[i3], checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1);
                if (objB2 != obj) {
                    str3 = str2;
                    objA = objB2;
                    premiumReserveTicketAppModel2 = premiumReserveTicketAppModel;
                    E0(new u(15, premiumReserveTicketAppModel2, str3, (String) objA));
                    return unit;
                }
                return obj;
            case 5:
                str3 = (String) checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$1;
                premiumReserveTicketAppModel2 = (PremiumReserveTicketAppModel) checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0;
                ResultKt.b(objA);
                E0(new u(15, premiumReserveTicketAppModel2, str3, (String) objA));
                return unit;
            case 6:
                ResultKt.b(objA);
                return unit;
            case 7:
                ResultKt.b(objA);
                i2 = 0;
                str4 = (String) objA;
                checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0 = str4;
                checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label = 8;
                objB3 = stringProvider.b(StringEnum.PAYMENT_STATUS_UNCLEAR_DESC, new Object[i2], checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1);
                if (objB3 != obj) {
                    str5 = str4;
                    objA = objB3;
                    str6 = (String) objA;
                    checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0 = str5;
                    checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$1 = str6;
                    checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label = 9;
                    objB4 = stringProvider.b(StringEnum.VIEW_MY_TICKETS_AND_PASSES, new Object[i2], checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1);
                    if (objB4 != obj) {
                        str7 = str6;
                        objA = objB4;
                        str8 = (String) objA;
                        checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0 = str5;
                        checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$1 = str7;
                        checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$2 = str8;
                        checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label = 10;
                        objB5 = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1);
                        if (objB5 != obj) {
                            str9 = str5;
                            str10 = str8;
                            objA = objB5;
                            E0(new ho(str9, str7, IconType.INTERNET_FAILURE, str10, (String) objA, 4));
                            Pair pair16 = new Pair("reason", "ticket details not available");
                            Pair pair17 = new Pair("transaction id", checkoutPaymentDataResolver.u().f2691a.h);
                            Pair pair18 = new Pair("historyCallRetryCount", new Integer(5 - this.O));
                            Pair[] pairArr6 = new Pair[3];
                            pairArr6[0] = pair16;
                            pairArr6[c] = pair17;
                            pairArr6[2] = pair18;
                            ICheckoutAnalyticsHelper.DefaultImpls.a(iCheckoutAnalyticsHelper, "post payment history call use case failure", MapsKt.i(pairArr6), 12);
                            return unit;
                        }
                    }
                }
                return obj;
            case 8:
                String str20 = (String) checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0;
                ResultKt.b(objA);
                str5 = str20;
                i2 = 0;
                str6 = (String) objA;
                checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0 = str5;
                checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$1 = str6;
                checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label = 9;
                objB4 = stringProvider.b(StringEnum.VIEW_MY_TICKETS_AND_PASSES, new Object[i2], checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1);
                if (objB4 != obj) {
                    str7 = str6;
                    objA = objB4;
                    str8 = (String) objA;
                    checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0 = str5;
                    checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$1 = str7;
                    checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$2 = str8;
                    checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label = 10;
                    objB5 = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1);
                    if (objB5 != obj) {
                        str9 = str5;
                        str10 = str8;
                        objA = objB5;
                        E0(new ho(str9, str7, IconType.INTERNET_FAILURE, str10, (String) objA, 4));
                        Pair pair19 = new Pair("reason", "ticket details not available");
                        Pair pair110 = new Pair("transaction id", checkoutPaymentDataResolver.u().f2691a.h);
                        Pair pair111 = new Pair("historyCallRetryCount", new Integer(5 - this.O));
                        Pair[] pairArr7 = new Pair[3];
                        pairArr7[0] = pair19;
                        pairArr7[c] = pair110;
                        pairArr7[2] = pair111;
                        ICheckoutAnalyticsHelper.DefaultImpls.a(iCheckoutAnalyticsHelper, "post payment history call use case failure", MapsKt.i(pairArr7), 12);
                        return unit;
                    }
                }
                return obj;
            case 9:
                str7 = (String) checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$1;
                str5 = (String) checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0;
                ResultKt.b(objA);
                c = 1;
                str8 = (String) objA;
                checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0 = str5;
                checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$1 = str7;
                checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$2 = str8;
                checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label = 10;
                objB5 = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1);
                if (objB5 != obj) {
                    str9 = str5;
                    str10 = str8;
                    objA = objB5;
                    E0(new ho(str9, str7, IconType.INTERNET_FAILURE, str10, (String) objA, 4));
                    Pair pair112 = new Pair("reason", "ticket details not available");
                    Pair pair113 = new Pair("transaction id", checkoutPaymentDataResolver.u().f2691a.h);
                    Pair pair114 = new Pair("historyCallRetryCount", new Integer(5 - this.O));
                    Pair[] pairArr8 = new Pair[3];
                    pairArr8[0] = pair112;
                    pairArr8[c] = pair113;
                    pairArr8[2] = pair114;
                    ICheckoutAnalyticsHelper.DefaultImpls.a(iCheckoutAnalyticsHelper, "post payment history call use case failure", MapsKt.i(pairArr8), 12);
                    return unit;
                }
                return obj;
            case 10:
                String str21 = (String) checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$2;
                str7 = (String) checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$1;
                String str22 = (String) checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0;
                ResultKt.b(objA);
                str10 = str21;
                c = 1;
                str9 = str22;
                E0(new ho(str9, str7, IconType.INTERNET_FAILURE, str10, (String) objA, 4));
                Pair pair115 = new Pair("reason", "ticket details not available");
                Pair pair116 = new Pair("transaction id", checkoutPaymentDataResolver.u().f2691a.h);
                Pair pair117 = new Pair("historyCallRetryCount", new Integer(5 - this.O));
                Pair[] pairArr9 = new Pair[3];
                pairArr9[0] = pair115;
                pairArr9[c] = pair116;
                pairArr9[2] = pair117;
                ICheckoutAnalyticsHelper.DefaultImpls.a(iCheckoutAnalyticsHelper, "post payment history call use case failure", MapsKt.i(pairArr9), 12);
                return unit;
            case 11:
                ResultKt.b(objA);
                return unit;
            case 12:
                ChaloUseCaseResult chaloUseCaseResult4 = (ChaloUseCaseResult) checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0;
                ResultKt.b(objA);
                chaloUseCaseResult2 = chaloUseCaseResult4;
                i = 0;
                str11 = (String) objA;
                checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0 = chaloUseCaseResult2;
                checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$1 = str11;
                checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label = 13;
                objA = stringProvider.b(StringEnum.PAYMENT_STATUS_UNCLEAR_DESC, new Object[i], checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1);
                if (objA != obj) {
                    str12 = (String) objA;
                    checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0 = chaloUseCaseResult2;
                    checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$1 = str11;
                    checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$2 = str12;
                    checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label = 14;
                    objB6 = stringProvider.b(StringEnum.VIEW_MY_TICKETS_AND_PASSES, new Object[i], checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1);
                    if (objB6 != obj) {
                        String str110 = str11;
                        str13 = str12;
                        objA = objB6;
                        str14 = str110;
                        str15 = (String) objA;
                        checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0 = chaloUseCaseResult2;
                        checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$1 = str14;
                        checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$2 = str13;
                        checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$3 = str15;
                        checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label = 15;
                        objB7 = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1);
                        if (objB7 != obj) {
                            str16 = str15;
                            objA = objB7;
                            str17 = str14;
                            chaloUseCaseResult3 = chaloUseCaseResult2;
                            E0(new ho(str17, str13, IconType.INTERNET_FAILURE, str16, (String) objA, 0));
                            Pair pair118 = new Pair("reason", ((FetchPremiumReserveTicketFailureReason) ((ChaloUseCaseResult.Failure) chaloUseCaseResult3).f10418a).name());
                            Pair pair119 = new Pair("transaction id", checkoutPaymentDataResolver.u().f2691a.h);
                            Pair pair120 = new Pair("historyCallRetryCount", new Integer(5 - this.O));
                            Pair[] pairArr10 = new Pair[3];
                            pairArr10[0] = pair118;
                            pairArr10[c] = pair119;
                            pairArr10[2] = pair120;
                            ICheckoutAnalyticsHelper.DefaultImpls.a(iCheckoutAnalyticsHelper, "post payment history call use case failure", MapsKt.i(pairArr10), 12);
                            return unit;
                        }
                    }
                }
                return obj;
            case 13:
                str11 = (String) checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$1;
                chaloUseCaseResult2 = (ChaloUseCaseResult) checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0;
                ResultKt.b(objA);
                checkoutPaymentDataResolver = checkoutPaymentDataResolver;
                c = 1;
                i = 0;
                str12 = (String) objA;
                checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0 = chaloUseCaseResult2;
                checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$1 = str11;
                checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$2 = str12;
                checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label = 14;
                objB6 = stringProvider.b(StringEnum.VIEW_MY_TICKETS_AND_PASSES, new Object[i], checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1);
                if (objB6 != obj) {
                    String str111 = str11;
                    str13 = str12;
                    objA = objB6;
                    str14 = str111;
                    str15 = (String) objA;
                    checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0 = chaloUseCaseResult2;
                    checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$1 = str14;
                    checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$2 = str13;
                    checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$3 = str15;
                    checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label = 15;
                    objB7 = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1);
                    if (objB7 != obj) {
                        str16 = str15;
                        objA = objB7;
                        str17 = str14;
                        chaloUseCaseResult3 = chaloUseCaseResult2;
                        E0(new ho(str17, str13, IconType.INTERNET_FAILURE, str16, (String) objA, 0));
                        Pair pair1110 = new Pair("reason", ((FetchPremiumReserveTicketFailureReason) ((ChaloUseCaseResult.Failure) chaloUseCaseResult3).f10418a).name());
                        Pair pair1111 = new Pair("transaction id", checkoutPaymentDataResolver.u().f2691a.h);
                        Pair pair121 = new Pair("historyCallRetryCount", new Integer(5 - this.O));
                        Pair[] pairArr11 = new Pair[3];
                        pairArr11[0] = pair1110;
                        pairArr11[c] = pair1111;
                        pairArr11[2] = pair121;
                        ICheckoutAnalyticsHelper.DefaultImpls.a(iCheckoutAnalyticsHelper, "post payment history call use case failure", MapsKt.i(pairArr11), 12);
                        return unit;
                    }
                }
                return obj;
            case 14:
                str13 = (String) checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$2;
                String str23 = (String) checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$1;
                ChaloUseCaseResult chaloUseCaseResult5 = (ChaloUseCaseResult) checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0;
                ResultKt.b(objA);
                checkoutPaymentDataResolver = checkoutPaymentDataResolver;
                str14 = str23;
                chaloUseCaseResult2 = chaloUseCaseResult5;
                c = 1;
                str15 = (String) objA;
                checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0 = chaloUseCaseResult2;
                checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$1 = str14;
                checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$2 = str13;
                checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$3 = str15;
                checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.label = 15;
                objB7 = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1);
                if (objB7 != obj) {
                    str16 = str15;
                    objA = objB7;
                    str17 = str14;
                    chaloUseCaseResult3 = chaloUseCaseResult2;
                    E0(new ho(str17, str13, IconType.INTERNET_FAILURE, str16, (String) objA, 0));
                    Pair pair1112 = new Pair("reason", ((FetchPremiumReserveTicketFailureReason) ((ChaloUseCaseResult.Failure) chaloUseCaseResult3).f10418a).name());
                    Pair pair1113 = new Pair("transaction id", checkoutPaymentDataResolver.u().f2691a.h);
                    Pair pair122 = new Pair("historyCallRetryCount", new Integer(5 - this.O));
                    Pair[] pairArr12 = new Pair[3];
                    pairArr12[0] = pair1112;
                    pairArr12[c] = pair1113;
                    pairArr12[2] = pair122;
                    ICheckoutAnalyticsHelper.DefaultImpls.a(iCheckoutAnalyticsHelper, "post payment history call use case failure", MapsKt.i(pairArr12), 12);
                    return unit;
                }
                return obj;
            case 15:
                String str24 = (String) checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$3;
                str13 = (String) checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$2;
                String str25 = (String) checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$1;
                chaloUseCaseResult3 = (ChaloUseCaseResult) checkoutPostPaymentComponent$handlePremiumReserveTicketsFlow$1.L$0;
                ResultKt.b(objA);
                str16 = str24;
                checkoutPaymentDataResolver = checkoutPaymentDataResolver;
                c = 1;
                str17 = str25;
                E0(new ho(str17, str13, IconType.INTERNET_FAILURE, str16, (String) objA, 0));
                Pair pair1114 = new Pair("reason", ((FetchPremiumReserveTicketFailureReason) ((ChaloUseCaseResult.Failure) chaloUseCaseResult3).f10418a).name());
                Pair pair1115 = new Pair("transaction id", checkoutPaymentDataResolver.u().f2691a.h);
                Pair pair123 = new Pair("historyCallRetryCount", new Integer(5 - this.O));
                Pair[] pairArr13 = new Pair[3];
                pairArr13[0] = pair1114;
                pairArr13[c] = pair1115;
                pairArr13[2] = pair123;
                ICheckoutAnalyticsHelper.DefaultImpls.a(iCheckoutAnalyticsHelper, "post payment history call use case failure", MapsKt.i(pairArr13), 12);
                return unit;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0094  */
    /* JADX WARN: Code duplicated, block: B:36:0x009a  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object R0(CheckoutProductType checkoutProductType, ContinuationImpl continuationImpl) {
        CheckoutPostPaymentComponent$handleProductPurchaseSuccess$1 checkoutPostPaymentComponent$handleProductPurchaseSuccess$1;
        CheckoutProductType checkoutProductType2;
        String str;
        String str2;
        String strI0;
        if (continuationImpl instanceof CheckoutPostPaymentComponent$handleProductPurchaseSuccess$1) {
            checkoutPostPaymentComponent$handleProductPurchaseSuccess$1 = (CheckoutPostPaymentComponent$handleProductPurchaseSuccess$1) continuationImpl;
            int i = checkoutPostPaymentComponent$handleProductPurchaseSuccess$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkoutPostPaymentComponent$handleProductPurchaseSuccess$1.label = i - Integer.MIN_VALUE;
            } else {
                checkoutPostPaymentComponent$handleProductPurchaseSuccess$1 = new CheckoutPostPaymentComponent$handleProductPurchaseSuccess$1(this, continuationImpl);
            }
        } else {
            checkoutPostPaymentComponent$handleProductPurchaseSuccess$1 = new CheckoutPostPaymentComponent$handleProductPurchaseSuccess$1(this, continuationImpl);
        }
        Object objA = checkoutPostPaymentComponent$handleProductPurchaseSuccess$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = checkoutPostPaymentComponent$handleProductPurchaseSuccess$1.label;
        Unit unit = Unit.f17538a;
        AdjustManager adjustManager = this.m;
        if (i2 == 0) {
            ResultKt.b(objA);
            String str3 = this.p.u().f2691a.k;
            if (str3 != null) {
                checkoutPostPaymentComponent$handleProductPurchaseSuccess$1.L$0 = checkoutProductType;
                checkoutPostPaymentComponent$handleProductPurchaseSuccess$1.L$1 = str3;
                checkoutPostPaymentComponent$handleProductPurchaseSuccess$1.label = 1;
                if (this.w.a(str3, checkoutPostPaymentComponent$handleProductPurchaseSuccess$1) != obj) {
                    checkoutProductType2 = checkoutProductType;
                    str = str3;
                }
                return obj;
            }
            String strI1 = I0(checkoutProductType);
            if (strI1 != null) {
                adjustManager.a(H0(), strI1);
                return unit;
            }
            return unit;
        }
        if (i2 == 1) {
            str = (String) checkoutPostPaymentComponent$handleProductPurchaseSuccess$1.L$1;
            checkoutProductType2 = (CheckoutProductType) checkoutPostPaymentComponent$handleProductPurchaseSuccess$1.L$0;
            ResultKt.b(objA);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objA);
                return unit;
            }
            str = (String) checkoutPostPaymentComponent$handleProductPurchaseSuccess$1.L$1;
            checkoutProductType2 = (CheckoutProductType) checkoutPostPaymentComponent$handleProductPurchaseSuccess$1.L$0;
            ResultKt.b(objA);
        }
        str2 = ((ConfigWiseEventTokens) objA).b;
        if (str2 == null) {
            strI0 = I0(checkoutProductType2);
            if (strI0 != null) {
                adjustManager.a(H0(), strI0);
            }
        } else {
            adjustManager.a(H0(), str2);
        }
        checkoutPostPaymentComponent$handleProductPurchaseSuccess$1.L$0 = null;
        checkoutPostPaymentComponent$handleProductPurchaseSuccess$1.L$1 = null;
        checkoutPostPaymentComponent$handleProductPurchaseSuccess$1.label = 3;
        if (V0(str, checkoutPostPaymentComponent$handleProductPurchaseSuccess$1) != obj) {
            return obj;
        }
        return unit;
        checkoutPostPaymentComponent$handleProductPurchaseSuccess$1.L$0 = checkoutProductType2;
        checkoutPostPaymentComponent$handleProductPurchaseSuccess$1.L$1 = str;
        checkoutPostPaymentComponent$handleProductPurchaseSuccess$1.label = 2;
        objA = this.l.a(checkoutProductType2, str, checkoutPostPaymentComponent$handleProductPurchaseSuccess$1);
        if (objA != obj) {
            str2 = ((ConfigWiseEventTokens) objA).b;
            if (str2 == null) {
                strI0 = I0(checkoutProductType2);
                if (strI0 != null) {
                    adjustManager.a(H0(), strI0);
                }
            } else {
                adjustManager.a(H0(), str2);
            }
            checkoutPostPaymentComponent$handleProductPurchaseSuccess$1.L$0 = null;
            checkoutPostPaymentComponent$handleProductPurchaseSuccess$1.L$1 = null;
            checkoutPostPaymentComponent$handleProductPurchaseSuccess$1.label = 3;
            if (V0(str, checkoutPostPaymentComponent$handleProductPurchaseSuccess$1) != obj) {
                return unit;
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0097 A[PHI: r1 r4 r8
      0x0097: PHI (r1v36 java.lang.Object) = (r1v7 java.lang.Object), (r1v1 java.lang.Object) binds: [B:82:0x02c2, B:16:0x008b] A[DONT_GENERATE, DONT_INLINE]
      0x0097: PHI (r4v48 app.chalo.utils.ChaloUseCaseResult) = (r4v4 app.chalo.utils.ChaloUseCaseResult), (r4v52 app.chalo.utils.ChaloUseCaseResult) binds: [B:82:0x02c2, B:16:0x008b] A[DONT_GENERATE, DONT_INLINE]
      0x0097: PHI (r8v11 int A[IMMUTABLE_TYPE]) = (r8v1 int), (r8v12 int) binds: [B:82:0x02c2, B:16:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x0125  */
    /* JADX WARN: Code duplicated, block: B:37:0x013c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0145  */
    /* JADX WARN: Code duplicated, block: B:42:0x014c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0159 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x015a  */
    /* JADX WARN: Code duplicated, block: B:49:0x016c A[PHI: r1 r4
      0x016c: PHI (r1v17 java.lang.Object) = (r1v14 java.lang.Object), (r1v1 java.lang.Object) binds: [B:47:0x0168, B:24:0x00ed] A[DONT_GENERATE, DONT_INLINE]
      0x016c: PHI (r4v25 int A[IMMUTABLE_TYPE]) = (r4v22 int), (r4v26 int) binds: [B:47:0x0168, B:24:0x00ed] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x0181  */
    /* JADX WARN: Code duplicated, block: B:56:0x019b  */
    /* JADX WARN: Code duplicated, block: B:60:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:63:0x0207  */
    /* JADX WARN: Code duplicated, block: B:65:0x024b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0271  */
    /* JADX WARN: Code duplicated, block: B:73:0x0285 A[PHI: r1 r4 r8
      0x0285: PHI (r1v31 java.lang.Object) = (r1v30 java.lang.Object), (r1v1 java.lang.Object) binds: [B:71:0x0281, B:19:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x0285: PHI (r4v44 app.chalo.checkout.ui.screen.postpayment.PostPaymentSuccessProductType$SuperPass) = 
      (r4v41 app.chalo.checkout.ui.screen.postpayment.PostPaymentSuccessProductType$SuperPass)
      (r4v46 app.chalo.checkout.ui.screen.postpayment.PostPaymentSuccessProductType$SuperPass)
     binds: [B:71:0x0281, B:19:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x0285: PHI (r8v9 int A[IMMUTABLE_TYPE]) = (r8v8 int), (r8v10 int) binds: [B:71:0x0281, B:19:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x029b  */
    /* JADX WARN: Code duplicated, block: B:79:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:87:0x02db A[PHI: r1 r4 r6 r8 r20 r21
      0x02db: PHI (r1v39 java.lang.Object) = (r1v38 java.lang.Object), (r1v1 java.lang.Object) binds: [B:85:0x02d8, B:15:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x02db: PHI (r4v53 java.lang.String) = (r4v50 java.lang.String), (r4v56 java.lang.String) binds: [B:85:0x02d8, B:15:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x02db: PHI (r6v21 app.chalo.utils.ChaloUseCaseResult) = (r6v20 app.chalo.utils.ChaloUseCaseResult), (r6v23 app.chalo.utils.ChaloUseCaseResult) binds: [B:85:0x02d8, B:15:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x02db: PHI (r8v13 int A[IMMUTABLE_TYPE]) = (r8v11 int), (r8v15 int) binds: [B:85:0x02d8, B:15:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x02db: PHI (r20v11 char) = (r8v0 char), (r20v12 char) binds: [B:85:0x02d8, B:15:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x02db: PHI (r21v7 app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver) = 
      (r5v0 app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver)
      (r21v8 app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver)
     binds: [B:85:0x02d8, B:15:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:94:0x0314  */
    /* JADX WARN: Code duplicated, block: B:97:0x036b  */
    public final Object S0(CheckoutProductType checkoutProductType, ContinuationImpl continuationImpl) {
        CheckoutPostPaymentComponent$handleSuperPassFlow$1 checkoutPostPaymentComponent$handleSuperPassFlow$1;
        CheckoutProductType checkoutProductType2;
        Object objB;
        ChaloUseCaseResult chaloUseCaseResult;
        int i;
        Object objA;
        CheckoutProductType checkoutProductType3;
        PostPaymentSuccessProductType.SuperPass superPass;
        Map map;
        LinkedHashMap linkedHashMap;
        CheckoutProductType checkoutProductType4;
        PostPaymentSuccessProductType.SuperPass superPass2;
        int i2;
        String str;
        Object objB2;
        String str2;
        String str3;
        Object objB3;
        String str4;
        String str5;
        Object objB4;
        String str6;
        String str7;
        int i3;
        String str8;
        Object objB5;
        String str9;
        PostPaymentSuccessProductType.SuperPass superPass3;
        ChaloUseCaseResult chaloUseCaseResult2;
        String str10;
        String str11;
        Object objB6;
        String str12;
        String str13;
        String str14;
        Object objB7;
        String str15;
        String str16;
        ChaloUseCaseResult chaloUseCaseResult3;
        if (continuationImpl instanceof CheckoutPostPaymentComponent$handleSuperPassFlow$1) {
            checkoutPostPaymentComponent$handleSuperPassFlow$1 = (CheckoutPostPaymentComponent$handleSuperPassFlow$1) continuationImpl;
            int i4 = checkoutPostPaymentComponent$handleSuperPassFlow$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                checkoutPostPaymentComponent$handleSuperPassFlow$1.label = i4 - Integer.MIN_VALUE;
            } else {
                checkoutPostPaymentComponent$handleSuperPassFlow$1 = new CheckoutPostPaymentComponent$handleSuperPassFlow$1(this, continuationImpl);
            }
        } else {
            checkoutPostPaymentComponent$handleSuperPassFlow$1 = new CheckoutPostPaymentComponent$handleSuperPassFlow$1(this, continuationImpl);
        }
        Object objB8 = checkoutPostPaymentComponent$handleSuperPassFlow$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = checkoutPostPaymentComponent$handleSuperPassFlow$1.label;
        char c = 1;
        ICheckoutAnalyticsHelper iCheckoutAnalyticsHelper = this.t;
        Unit unit = Unit.f17538a;
        CheckoutPaymentDataResolver checkoutPaymentDataResolver = this.p;
        StringProvider stringProvider = this.s;
        switch (i5) {
            case 0:
                ResultKt.b(objB8);
                checkoutProductType2 = checkoutProductType;
                checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0 = checkoutProductType2;
                checkoutPostPaymentComponent$handleSuperPassFlow$1.label = 1;
                objB = this.x.b(checkoutPostPaymentComponent$handleSuperPassFlow$1);
                if (objB != obj) {
                    chaloUseCaseResult = (ChaloUseCaseResult) objB;
                    if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                        String str17 = checkoutPaymentDataResolver.u().f2691a.h;
                        checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0 = checkoutProductType2;
                        checkoutPostPaymentComponent$handleSuperPassFlow$1.label = 2;
                        objA = this.A.a(checkoutProductType2, str17, checkoutPostPaymentComponent$handleSuperPassFlow$1);
                        if (objA != obj) {
                            checkoutProductType3 = checkoutProductType2;
                            objB8 = objA;
                            superPass = (PostPaymentSuccessProductType.SuperPass) objB8;
                            if (superPass != null) {
                                iCheckoutAnalyticsHelper.f(5 - this.O);
                                String superPassConfigId = superPass.c;
                                int i6 = superPass.d;
                                Source source = Source.CHECKOUT_PAYMENT_ACTIVITY;
                                map = this.o.s().b;
                                TriggerSuperPassBookedDynamicEvent triggerSuperPassBookedDynamicEvent = this.u;
                                triggerSuperPassBookedDynamicEvent.getClass();
                                Intrinsics.i(superPassConfigId, "superPassConfigId");
                                Intrinsics.i(source, "source");
                                String strR = StringsKt.R(StringsKt.R("pass booked {CONFIG} with {NUM_RIDES} rides", "{CONFIG}", superPassConfigId), "{NUM_RIDES}", String.valueOf(i6));
                                linkedHashMap = new LinkedHashMap();
                                if (map != null) {
                                    linkedHashMap.putAll(map);
                                }
                                AnalyticsContract.DefaultImpls.a(triggerSuperPassBookedDynamicEvent.f1383a, strR, source.getSourceName(), linkedHashMap, null, false, 24);
                                checkoutProductType4 = CheckoutProductType.SUPER_PASS_RIDE_PASS;
                                checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0 = superPass;
                                checkoutPostPaymentComponent$handleSuperPassFlow$1.label = 8;
                                if (R0(checkoutProductType4, checkoutPostPaymentComponent$handleSuperPassFlow$1) != obj) {
                                    superPass2 = superPass;
                                    i3 = 0;
                                    checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0 = superPass2;
                                    checkoutPostPaymentComponent$handleSuperPassFlow$1.label = 9;
                                    objB8 = stringProvider.b(StringEnum.PASS_BOOKED, new Object[0], checkoutPostPaymentComponent$handleSuperPassFlow$1);
                                    if (objB8 != obj) {
                                        str8 = (String) objB8;
                                        checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0 = superPass2;
                                        checkoutPostPaymentComponent$handleSuperPassFlow$1.L$1 = str8;
                                        checkoutPostPaymentComponent$handleSuperPassFlow$1.label = 10;
                                        objB5 = stringProvider.b(StringEnum.ENJOY_YOUR_PREMIUM_RIDE, new Object[i3], checkoutPostPaymentComponent$handleSuperPassFlow$1);
                                        if (objB5 != obj) {
                                            str9 = str8;
                                            objB8 = objB5;
                                            superPass3 = superPass2;
                                            E0(new u(14, superPass3, (String) objB8, str9));
                                            return unit;
                                        }
                                    }
                                }
                            } else if (T0()) {
                                checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0 = null;
                                checkoutPostPaymentComponent$handleSuperPassFlow$1.label = 3;
                                if (S0(checkoutProductType3, checkoutPostPaymentComponent$handleSuperPassFlow$1) != obj) {
                                    return unit;
                                }
                            } else {
                                i2 = 0;
                                checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0 = null;
                                checkoutPostPaymentComponent$handleSuperPassFlow$1.label = 4;
                                objB8 = stringProvider.b(StringEnum.PAYMENT_STATUS_UNCLEAR, new Object[0], checkoutPostPaymentComponent$handleSuperPassFlow$1);
                                if (objB8 != obj) {
                                    str = (String) objB8;
                                    checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0 = str;
                                    checkoutPostPaymentComponent$handleSuperPassFlow$1.label = 5;
                                    objB2 = stringProvider.b(StringEnum.PAYMENT_STATUS_UNCLEAR_DESC, new Object[i2], checkoutPostPaymentComponent$handleSuperPassFlow$1);
                                    if (objB2 != obj) {
                                        str2 = str;
                                        objB8 = objB2;
                                        str3 = (String) objB8;
                                        checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0 = str2;
                                        checkoutPostPaymentComponent$handleSuperPassFlow$1.L$1 = str3;
                                        checkoutPostPaymentComponent$handleSuperPassFlow$1.label = 6;
                                        objB3 = stringProvider.b(StringEnum.VIEW_MY_TICKETS_AND_PASSES, new Object[i2], checkoutPostPaymentComponent$handleSuperPassFlow$1);
                                        if (objB3 != obj) {
                                            str4 = str3;
                                            objB8 = objB3;
                                            str5 = (String) objB8;
                                            checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0 = str2;
                                            checkoutPostPaymentComponent$handleSuperPassFlow$1.L$1 = str4;
                                            checkoutPostPaymentComponent$handleSuperPassFlow$1.L$2 = str5;
                                            checkoutPostPaymentComponent$handleSuperPassFlow$1.label = 7;
                                            objB4 = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], checkoutPostPaymentComponent$handleSuperPassFlow$1);
                                            if (objB4 != obj) {
                                                str6 = str2;
                                                str7 = str5;
                                                objB8 = objB4;
                                                E0(new ho(str6, str4, IconType.INTERNET_FAILURE, str7, (String) objB8, 1));
                                                Pair pair = new Pair("reason", "pass details not available");
                                                Pair pair2 = new Pair("transaction id", checkoutPaymentDataResolver.u().f2691a.h);
                                                Pair pair3 = new Pair("historyCallRetryCount", new Integer(5 - this.O));
                                                Pair[] pairArr = new Pair[3];
                                                pairArr[0] = pair;
                                                pairArr[c] = pair2;
                                                pairArr[2] = pair3;
                                                ICheckoutAnalyticsHelper.DefaultImpls.a(iCheckoutAnalyticsHelper, "post payment history call use case failure", MapsKt.i(pairArr), 12);
                                                return unit;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = 0;
                        checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0 = chaloUseCaseResult;
                        checkoutPostPaymentComponent$handleSuperPassFlow$1.label = 11;
                        objB8 = stringProvider.b(StringEnum.PAYMENT_STATUS_UNCLEAR, new Object[0], checkoutPostPaymentComponent$handleSuperPassFlow$1);
                        if (objB8 != obj) {
                            chaloUseCaseResult2 = chaloUseCaseResult;
                            str10 = (String) objB8;
                            checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0 = chaloUseCaseResult2;
                            checkoutPostPaymentComponent$handleSuperPassFlow$1.L$1 = str10;
                            checkoutPostPaymentComponent$handleSuperPassFlow$1.label = 12;
                            objB8 = stringProvider.b(StringEnum.PAYMENT_STATUS_UNCLEAR_DESC, new Object[i], checkoutPostPaymentComponent$handleSuperPassFlow$1);
                            if (objB8 != obj) {
                                str11 = (String) objB8;
                                checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0 = chaloUseCaseResult2;
                                checkoutPostPaymentComponent$handleSuperPassFlow$1.L$1 = str10;
                                checkoutPostPaymentComponent$handleSuperPassFlow$1.L$2 = str11;
                                checkoutPostPaymentComponent$handleSuperPassFlow$1.label = 13;
                                objB6 = stringProvider.b(StringEnum.VIEW_MY_TICKETS_AND_PASSES, new Object[i], checkoutPostPaymentComponent$handleSuperPassFlow$1);
                                if (objB6 != obj) {
                                    String str18 = str10;
                                    str12 = str11;
                                    objB8 = objB6;
                                    str13 = str18;
                                    str14 = (String) objB8;
                                    checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0 = chaloUseCaseResult2;
                                    checkoutPostPaymentComponent$handleSuperPassFlow$1.L$1 = str13;
                                    checkoutPostPaymentComponent$handleSuperPassFlow$1.L$2 = str12;
                                    checkoutPostPaymentComponent$handleSuperPassFlow$1.L$3 = str14;
                                    checkoutPostPaymentComponent$handleSuperPassFlow$1.label = 14;
                                    objB7 = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], checkoutPostPaymentComponent$handleSuperPassFlow$1);
                                    if (objB7 != obj) {
                                        str15 = str14;
                                        objB8 = objB7;
                                        str16 = str13;
                                        chaloUseCaseResult3 = chaloUseCaseResult2;
                                        E0(new ho(str16, str12, IconType.INTERNET_FAILURE, str15, (String) objB8, 2));
                                        Pair pair4 = new Pair("reason", ((ChaloUseCaseResult.Failure) chaloUseCaseResult3).f10418a);
                                        Pair pair5 = new Pair("transaction id", checkoutPaymentDataResolver.u().f2691a.h);
                                        Pair pair6 = new Pair("historyCallRetryCount", new Integer(5 - this.O));
                                        Pair[] pairArr2 = new Pair[3];
                                        pairArr2[0] = pair4;
                                        pairArr2[c] = pair5;
                                        pairArr2[2] = pair6;
                                        ICheckoutAnalyticsHelper.DefaultImpls.a(iCheckoutAnalyticsHelper, "post payment history call use case failure", MapsKt.i(pairArr2), 12);
                                        return unit;
                                    }
                                }
                            }
                        }
                    }
                }
                return obj;
            case 1:
                CheckoutProductType checkoutProductType5 = (CheckoutProductType) checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0;
                ResultKt.b(objB8);
                objB = objB8;
                checkoutProductType2 = checkoutProductType5;
                chaloUseCaseResult = (ChaloUseCaseResult) objB;
                if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                    String str19 = checkoutPaymentDataResolver.u().f2691a.h;
                    checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0 = checkoutProductType2;
                    checkoutPostPaymentComponent$handleSuperPassFlow$1.label = 2;
                    objA = this.A.a(checkoutProductType2, str19, checkoutPostPaymentComponent$handleSuperPassFlow$1);
                    if (objA != obj) {
                        checkoutProductType3 = checkoutProductType2;
                        objB8 = objA;
                        superPass = (PostPaymentSuccessProductType.SuperPass) objB8;
                        if (superPass != null) {
                            iCheckoutAnalyticsHelper.f(5 - this.O);
                            String superPassConfigId2 = superPass.c;
                            int i7 = superPass.d;
                            Source source2 = Source.CHECKOUT_PAYMENT_ACTIVITY;
                            map = this.o.s().b;
                            TriggerSuperPassBookedDynamicEvent triggerSuperPassBookedDynamicEvent2 = this.u;
                            triggerSuperPassBookedDynamicEvent2.getClass();
                            Intrinsics.i(superPassConfigId2, "superPassConfigId");
                            Intrinsics.i(source2, "source");
                            String strR2 = StringsKt.R(StringsKt.R("pass booked {CONFIG} with {NUM_RIDES} rides", "{CONFIG}", superPassConfigId2), "{NUM_RIDES}", String.valueOf(i7));
                            linkedHashMap = new LinkedHashMap();
                            if (map != null) {
                                linkedHashMap.putAll(map);
                            }
                            AnalyticsContract.DefaultImpls.a(triggerSuperPassBookedDynamicEvent2.f1383a, strR2, source2.getSourceName(), linkedHashMap, null, false, 24);
                            checkoutProductType4 = CheckoutProductType.SUPER_PASS_RIDE_PASS;
                            checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0 = superPass;
                            checkoutPostPaymentComponent$handleSuperPassFlow$1.label = 8;
                            if (R0(checkoutProductType4, checkoutPostPaymentComponent$handleSuperPassFlow$1) != obj) {
                                superPass2 = superPass;
                                i3 = 0;
                                checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0 = superPass2;
                                checkoutPostPaymentComponent$handleSuperPassFlow$1.label = 9;
                                objB8 = stringProvider.b(StringEnum.PASS_BOOKED, new Object[0], checkoutPostPaymentComponent$handleSuperPassFlow$1);
                                if (objB8 != obj) {
                                    str8 = (String) objB8;
                                    checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0 = superPass2;
                                    checkoutPostPaymentComponent$handleSuperPassFlow$1.L$1 = str8;
                                    checkoutPostPaymentComponent$handleSuperPassFlow$1.label = 10;
                                    objB5 = stringProvider.b(StringEnum.ENJOY_YOUR_PREMIUM_RIDE, new Object[i3], checkoutPostPaymentComponent$handleSuperPassFlow$1);
                                    if (objB5 != obj) {
                                        str9 = str8;
                                        objB8 = objB5;
                                        superPass3 = superPass2;
                                        E0(new u(14, superPass3, (String) objB8, str9));
                                        return unit;
                                    }
                                }
                            }
                        } else if (T0()) {
                            checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0 = null;
                            checkoutPostPaymentComponent$handleSuperPassFlow$1.label = 3;
                            if (S0(checkoutProductType3, checkoutPostPaymentComponent$handleSuperPassFlow$1) != obj) {
                                return unit;
                            }
                        } else {
                            i2 = 0;
                            checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0 = null;
                            checkoutPostPaymentComponent$handleSuperPassFlow$1.label = 4;
                            objB8 = stringProvider.b(StringEnum.PAYMENT_STATUS_UNCLEAR, new Object[0], checkoutPostPaymentComponent$handleSuperPassFlow$1);
                            if (objB8 != obj) {
                                str = (String) objB8;
                                checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0 = str;
                                checkoutPostPaymentComponent$handleSuperPassFlow$1.label = 5;
                                objB2 = stringProvider.b(StringEnum.PAYMENT_STATUS_UNCLEAR_DESC, new Object[i2], checkoutPostPaymentComponent$handleSuperPassFlow$1);
                                if (objB2 != obj) {
                                    str2 = str;
                                    objB8 = objB2;
                                    str3 = (String) objB8;
                                    checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0 = str2;
                                    checkoutPostPaymentComponent$handleSuperPassFlow$1.L$1 = str3;
                                    checkoutPostPaymentComponent$handleSuperPassFlow$1.label = 6;
                                    objB3 = stringProvider.b(StringEnum.VIEW_MY_TICKETS_AND_PASSES, new Object[i2], checkoutPostPaymentComponent$handleSuperPassFlow$1);
                                    if (objB3 != obj) {
                                        str4 = str3;
                                        objB8 = objB3;
                                        str5 = (String) objB8;
                                        checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0 = str2;
                                        checkoutPostPaymentComponent$handleSuperPassFlow$1.L$1 = str4;
                                        checkoutPostPaymentComponent$handleSuperPassFlow$1.L$2 = str5;
                                        checkoutPostPaymentComponent$handleSuperPassFlow$1.label = 7;
                                        objB4 = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], checkoutPostPaymentComponent$handleSuperPassFlow$1);
                                        if (objB4 != obj) {
                                            str6 = str2;
                                            str7 = str5;
                                            objB8 = objB4;
                                            E0(new ho(str6, str4, IconType.INTERNET_FAILURE, str7, (String) objB8, 1));
                                            Pair pair7 = new Pair("reason", "pass details not available");
                                            Pair pair8 = new Pair("transaction id", checkoutPaymentDataResolver.u().f2691a.h);
                                            Pair pair9 = new Pair("historyCallRetryCount", new Integer(5 - this.O));
                                            Pair[] pairArr3 = new Pair[3];
                                            pairArr3[0] = pair7;
                                            pairArr3[c] = pair8;
                                            pairArr3[2] = pair9;
                                            ICheckoutAnalyticsHelper.DefaultImpls.a(iCheckoutAnalyticsHelper, "post payment history call use case failure", MapsKt.i(pairArr3), 12);
                                            return unit;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = 0;
                    checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0 = chaloUseCaseResult;
                    checkoutPostPaymentComponent$handleSuperPassFlow$1.label = 11;
                    objB8 = stringProvider.b(StringEnum.PAYMENT_STATUS_UNCLEAR, new Object[0], checkoutPostPaymentComponent$handleSuperPassFlow$1);
                    if (objB8 != obj) {
                        chaloUseCaseResult2 = chaloUseCaseResult;
                        str10 = (String) objB8;
                        checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0 = chaloUseCaseResult2;
                        checkoutPostPaymentComponent$handleSuperPassFlow$1.L$1 = str10;
                        checkoutPostPaymentComponent$handleSuperPassFlow$1.label = 12;
                        objB8 = stringProvider.b(StringEnum.PAYMENT_STATUS_UNCLEAR_DESC, new Object[i], checkoutPostPaymentComponent$handleSuperPassFlow$1);
                        if (objB8 != obj) {
                            str11 = (String) objB8;
                            checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0 = chaloUseCaseResult2;
                            checkoutPostPaymentComponent$handleSuperPassFlow$1.L$1 = str10;
                            checkoutPostPaymentComponent$handleSuperPassFlow$1.L$2 = str11;
                            checkoutPostPaymentComponent$handleSuperPassFlow$1.label = 13;
                            objB6 = stringProvider.b(StringEnum.VIEW_MY_TICKETS_AND_PASSES, new Object[i], checkoutPostPaymentComponent$handleSuperPassFlow$1);
                            if (objB6 != obj) {
                                String str110 = str10;
                                str12 = str11;
                                objB8 = objB6;
                                str13 = str110;
                                str14 = (String) objB8;
                                checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0 = chaloUseCaseResult2;
                                checkoutPostPaymentComponent$handleSuperPassFlow$1.L$1 = str13;
                                checkoutPostPaymentComponent$handleSuperPassFlow$1.L$2 = str12;
                                checkoutPostPaymentComponent$handleSuperPassFlow$1.L$3 = str14;
                                checkoutPostPaymentComponent$handleSuperPassFlow$1.label = 14;
                                objB7 = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], checkoutPostPaymentComponent$handleSuperPassFlow$1);
                                if (objB7 != obj) {
                                    str15 = str14;
                                    objB8 = objB7;
                                    str16 = str13;
                                    chaloUseCaseResult3 = chaloUseCaseResult2;
                                    E0(new ho(str16, str12, IconType.INTERNET_FAILURE, str15, (String) objB8, 2));
                                    Pair pair10 = new Pair("reason", ((ChaloUseCaseResult.Failure) chaloUseCaseResult3).f10418a);
                                    Pair pair11 = new Pair("transaction id", checkoutPaymentDataResolver.u().f2691a.h);
                                    Pair pair12 = new Pair("historyCallRetryCount", new Integer(5 - this.O));
                                    Pair[] pairArr4 = new Pair[3];
                                    pairArr4[0] = pair10;
                                    pairArr4[c] = pair11;
                                    pairArr4[2] = pair12;
                                    ICheckoutAnalyticsHelper.DefaultImpls.a(iCheckoutAnalyticsHelper, "post payment history call use case failure", MapsKt.i(pairArr4), 12);
                                    return unit;
                                }
                            }
                        }
                    }
                }
                return obj;
            case 2:
                checkoutProductType3 = (CheckoutProductType) checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0;
                ResultKt.b(objB8);
                superPass = (PostPaymentSuccessProductType.SuperPass) objB8;
                if (superPass != null) {
                    iCheckoutAnalyticsHelper.f(5 - this.O);
                    String superPassConfigId3 = superPass.c;
                    int i8 = superPass.d;
                    Source source3 = Source.CHECKOUT_PAYMENT_ACTIVITY;
                    map = this.o.s().b;
                    TriggerSuperPassBookedDynamicEvent triggerSuperPassBookedDynamicEvent3 = this.u;
                    triggerSuperPassBookedDynamicEvent3.getClass();
                    Intrinsics.i(superPassConfigId3, "superPassConfigId");
                    Intrinsics.i(source3, "source");
                    String strR3 = StringsKt.R(StringsKt.R("pass booked {CONFIG} with {NUM_RIDES} rides", "{CONFIG}", superPassConfigId3), "{NUM_RIDES}", String.valueOf(i8));
                    linkedHashMap = new LinkedHashMap();
                    if (map != null) {
                        linkedHashMap.putAll(map);
                    }
                    AnalyticsContract.DefaultImpls.a(triggerSuperPassBookedDynamicEvent3.f1383a, strR3, source3.getSourceName(), linkedHashMap, null, false, 24);
                    checkoutProductType4 = CheckoutProductType.SUPER_PASS_RIDE_PASS;
                    checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0 = superPass;
                    checkoutPostPaymentComponent$handleSuperPassFlow$1.label = 8;
                    if (R0(checkoutProductType4, checkoutPostPaymentComponent$handleSuperPassFlow$1) != obj) {
                        superPass2 = superPass;
                        i3 = 0;
                        checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0 = superPass2;
                        checkoutPostPaymentComponent$handleSuperPassFlow$1.label = 9;
                        objB8 = stringProvider.b(StringEnum.PASS_BOOKED, new Object[0], checkoutPostPaymentComponent$handleSuperPassFlow$1);
                        if (objB8 != obj) {
                            str8 = (String) objB8;
                            checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0 = superPass2;
                            checkoutPostPaymentComponent$handleSuperPassFlow$1.L$1 = str8;
                            checkoutPostPaymentComponent$handleSuperPassFlow$1.label = 10;
                            objB5 = stringProvider.b(StringEnum.ENJOY_YOUR_PREMIUM_RIDE, new Object[i3], checkoutPostPaymentComponent$handleSuperPassFlow$1);
                            if (objB5 != obj) {
                                str9 = str8;
                                objB8 = objB5;
                                superPass3 = superPass2;
                                E0(new u(14, superPass3, (String) objB8, str9));
                                return unit;
                            }
                        }
                    }
                } else if (T0()) {
                    checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0 = null;
                    checkoutPostPaymentComponent$handleSuperPassFlow$1.label = 3;
                    if (S0(checkoutProductType3, checkoutPostPaymentComponent$handleSuperPassFlow$1) != obj) {
                        return unit;
                    }
                } else {
                    i2 = 0;
                    checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0 = null;
                    checkoutPostPaymentComponent$handleSuperPassFlow$1.label = 4;
                    objB8 = stringProvider.b(StringEnum.PAYMENT_STATUS_UNCLEAR, new Object[0], checkoutPostPaymentComponent$handleSuperPassFlow$1);
                    if (objB8 != obj) {
                        str = (String) objB8;
                        checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0 = str;
                        checkoutPostPaymentComponent$handleSuperPassFlow$1.label = 5;
                        objB2 = stringProvider.b(StringEnum.PAYMENT_STATUS_UNCLEAR_DESC, new Object[i2], checkoutPostPaymentComponent$handleSuperPassFlow$1);
                        if (objB2 != obj) {
                            str2 = str;
                            objB8 = objB2;
                            str3 = (String) objB8;
                            checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0 = str2;
                            checkoutPostPaymentComponent$handleSuperPassFlow$1.L$1 = str3;
                            checkoutPostPaymentComponent$handleSuperPassFlow$1.label = 6;
                            objB3 = stringProvider.b(StringEnum.VIEW_MY_TICKETS_AND_PASSES, new Object[i2], checkoutPostPaymentComponent$handleSuperPassFlow$1);
                            if (objB3 != obj) {
                                str4 = str3;
                                objB8 = objB3;
                                str5 = (String) objB8;
                                checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0 = str2;
                                checkoutPostPaymentComponent$handleSuperPassFlow$1.L$1 = str4;
                                checkoutPostPaymentComponent$handleSuperPassFlow$1.L$2 = str5;
                                checkoutPostPaymentComponent$handleSuperPassFlow$1.label = 7;
                                objB4 = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], checkoutPostPaymentComponent$handleSuperPassFlow$1);
                                if (objB4 != obj) {
                                    str6 = str2;
                                    str7 = str5;
                                    objB8 = objB4;
                                    E0(new ho(str6, str4, IconType.INTERNET_FAILURE, str7, (String) objB8, 1));
                                    Pair pair13 = new Pair("reason", "pass details not available");
                                    Pair pair14 = new Pair("transaction id", checkoutPaymentDataResolver.u().f2691a.h);
                                    Pair pair15 = new Pair("historyCallRetryCount", new Integer(5 - this.O));
                                    Pair[] pairArr5 = new Pair[3];
                                    pairArr5[0] = pair13;
                                    pairArr5[c] = pair14;
                                    pairArr5[2] = pair15;
                                    ICheckoutAnalyticsHelper.DefaultImpls.a(iCheckoutAnalyticsHelper, "post payment history call use case failure", MapsKt.i(pairArr5), 12);
                                    return unit;
                                }
                            }
                        }
                    }
                }
                return obj;
            case 3:
                ResultKt.b(objB8);
                return unit;
            case 4:
                ResultKt.b(objB8);
                i2 = 0;
                str = (String) objB8;
                checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0 = str;
                checkoutPostPaymentComponent$handleSuperPassFlow$1.label = 5;
                objB2 = stringProvider.b(StringEnum.PAYMENT_STATUS_UNCLEAR_DESC, new Object[i2], checkoutPostPaymentComponent$handleSuperPassFlow$1);
                if (objB2 != obj) {
                    str2 = str;
                    objB8 = objB2;
                    str3 = (String) objB8;
                    checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0 = str2;
                    checkoutPostPaymentComponent$handleSuperPassFlow$1.L$1 = str3;
                    checkoutPostPaymentComponent$handleSuperPassFlow$1.label = 6;
                    objB3 = stringProvider.b(StringEnum.VIEW_MY_TICKETS_AND_PASSES, new Object[i2], checkoutPostPaymentComponent$handleSuperPassFlow$1);
                    if (objB3 != obj) {
                        str4 = str3;
                        objB8 = objB3;
                        str5 = (String) objB8;
                        checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0 = str2;
                        checkoutPostPaymentComponent$handleSuperPassFlow$1.L$1 = str4;
                        checkoutPostPaymentComponent$handleSuperPassFlow$1.L$2 = str5;
                        checkoutPostPaymentComponent$handleSuperPassFlow$1.label = 7;
                        objB4 = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], checkoutPostPaymentComponent$handleSuperPassFlow$1);
                        if (objB4 != obj) {
                            str6 = str2;
                            str7 = str5;
                            objB8 = objB4;
                            E0(new ho(str6, str4, IconType.INTERNET_FAILURE, str7, (String) objB8, 1));
                            Pair pair16 = new Pair("reason", "pass details not available");
                            Pair pair17 = new Pair("transaction id", checkoutPaymentDataResolver.u().f2691a.h);
                            Pair pair18 = new Pair("historyCallRetryCount", new Integer(5 - this.O));
                            Pair[] pairArr6 = new Pair[3];
                            pairArr6[0] = pair16;
                            pairArr6[c] = pair17;
                            pairArr6[2] = pair18;
                            ICheckoutAnalyticsHelper.DefaultImpls.a(iCheckoutAnalyticsHelper, "post payment history call use case failure", MapsKt.i(pairArr6), 12);
                            return unit;
                        }
                    }
                }
                return obj;
            case 5:
                String str20 = (String) checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0;
                ResultKt.b(objB8);
                str2 = str20;
                i2 = 0;
                str3 = (String) objB8;
                checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0 = str2;
                checkoutPostPaymentComponent$handleSuperPassFlow$1.L$1 = str3;
                checkoutPostPaymentComponent$handleSuperPassFlow$1.label = 6;
                objB3 = stringProvider.b(StringEnum.VIEW_MY_TICKETS_AND_PASSES, new Object[i2], checkoutPostPaymentComponent$handleSuperPassFlow$1);
                if (objB3 != obj) {
                    str4 = str3;
                    objB8 = objB3;
                    str5 = (String) objB8;
                    checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0 = str2;
                    checkoutPostPaymentComponent$handleSuperPassFlow$1.L$1 = str4;
                    checkoutPostPaymentComponent$handleSuperPassFlow$1.L$2 = str5;
                    checkoutPostPaymentComponent$handleSuperPassFlow$1.label = 7;
                    objB4 = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], checkoutPostPaymentComponent$handleSuperPassFlow$1);
                    if (objB4 != obj) {
                        str6 = str2;
                        str7 = str5;
                        objB8 = objB4;
                        E0(new ho(str6, str4, IconType.INTERNET_FAILURE, str7, (String) objB8, 1));
                        Pair pair19 = new Pair("reason", "pass details not available");
                        Pair pair110 = new Pair("transaction id", checkoutPaymentDataResolver.u().f2691a.h);
                        Pair pair111 = new Pair("historyCallRetryCount", new Integer(5 - this.O));
                        Pair[] pairArr7 = new Pair[3];
                        pairArr7[0] = pair19;
                        pairArr7[c] = pair110;
                        pairArr7[2] = pair111;
                        ICheckoutAnalyticsHelper.DefaultImpls.a(iCheckoutAnalyticsHelper, "post payment history call use case failure", MapsKt.i(pairArr7), 12);
                        return unit;
                    }
                }
                return obj;
            case 6:
                str4 = (String) checkoutPostPaymentComponent$handleSuperPassFlow$1.L$1;
                str2 = (String) checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0;
                ResultKt.b(objB8);
                c = 1;
                str5 = (String) objB8;
                checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0 = str2;
                checkoutPostPaymentComponent$handleSuperPassFlow$1.L$1 = str4;
                checkoutPostPaymentComponent$handleSuperPassFlow$1.L$2 = str5;
                checkoutPostPaymentComponent$handleSuperPassFlow$1.label = 7;
                objB4 = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], checkoutPostPaymentComponent$handleSuperPassFlow$1);
                if (objB4 != obj) {
                    str6 = str2;
                    str7 = str5;
                    objB8 = objB4;
                    E0(new ho(str6, str4, IconType.INTERNET_FAILURE, str7, (String) objB8, 1));
                    Pair pair112 = new Pair("reason", "pass details not available");
                    Pair pair113 = new Pair("transaction id", checkoutPaymentDataResolver.u().f2691a.h);
                    Pair pair114 = new Pair("historyCallRetryCount", new Integer(5 - this.O));
                    Pair[] pairArr8 = new Pair[3];
                    pairArr8[0] = pair112;
                    pairArr8[c] = pair113;
                    pairArr8[2] = pair114;
                    ICheckoutAnalyticsHelper.DefaultImpls.a(iCheckoutAnalyticsHelper, "post payment history call use case failure", MapsKt.i(pairArr8), 12);
                    return unit;
                }
                return obj;
            case 7:
                String str21 = (String) checkoutPostPaymentComponent$handleSuperPassFlow$1.L$2;
                str4 = (String) checkoutPostPaymentComponent$handleSuperPassFlow$1.L$1;
                String str22 = (String) checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0;
                ResultKt.b(objB8);
                str7 = str21;
                c = 1;
                str6 = str22;
                E0(new ho(str6, str4, IconType.INTERNET_FAILURE, str7, (String) objB8, 1));
                Pair pair115 = new Pair("reason", "pass details not available");
                Pair pair116 = new Pair("transaction id", checkoutPaymentDataResolver.u().f2691a.h);
                Pair pair117 = new Pair("historyCallRetryCount", new Integer(5 - this.O));
                Pair[] pairArr9 = new Pair[3];
                pairArr9[0] = pair115;
                pairArr9[c] = pair116;
                pairArr9[2] = pair117;
                ICheckoutAnalyticsHelper.DefaultImpls.a(iCheckoutAnalyticsHelper, "post payment history call use case failure", MapsKt.i(pairArr9), 12);
                return unit;
            case 8:
                superPass2 = (PostPaymentSuccessProductType.SuperPass) checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0;
                ResultKt.b(objB8);
                i3 = 0;
                checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0 = superPass2;
                checkoutPostPaymentComponent$handleSuperPassFlow$1.label = 9;
                objB8 = stringProvider.b(StringEnum.PASS_BOOKED, new Object[0], checkoutPostPaymentComponent$handleSuperPassFlow$1);
                if (objB8 != obj) {
                    str8 = (String) objB8;
                    checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0 = superPass2;
                    checkoutPostPaymentComponent$handleSuperPassFlow$1.L$1 = str8;
                    checkoutPostPaymentComponent$handleSuperPassFlow$1.label = 10;
                    objB5 = stringProvider.b(StringEnum.ENJOY_YOUR_PREMIUM_RIDE, new Object[i3], checkoutPostPaymentComponent$handleSuperPassFlow$1);
                    if (objB5 != obj) {
                        str9 = str8;
                        objB8 = objB5;
                        superPass3 = superPass2;
                        E0(new u(14, superPass3, (String) objB8, str9));
                        return unit;
                    }
                }
                return obj;
            case 9:
                superPass2 = (PostPaymentSuccessProductType.SuperPass) checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0;
                ResultKt.b(objB8);
                i3 = 0;
                str8 = (String) objB8;
                checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0 = superPass2;
                checkoutPostPaymentComponent$handleSuperPassFlow$1.L$1 = str8;
                checkoutPostPaymentComponent$handleSuperPassFlow$1.label = 10;
                objB5 = stringProvider.b(StringEnum.ENJOY_YOUR_PREMIUM_RIDE, new Object[i3], checkoutPostPaymentComponent$handleSuperPassFlow$1);
                if (objB5 != obj) {
                    str9 = str8;
                    objB8 = objB5;
                    superPass3 = superPass2;
                    E0(new u(14, superPass3, (String) objB8, str9));
                    return unit;
                }
                return obj;
            case 10:
                str9 = (String) checkoutPostPaymentComponent$handleSuperPassFlow$1.L$1;
                superPass3 = (PostPaymentSuccessProductType.SuperPass) checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0;
                ResultKt.b(objB8);
                E0(new u(14, superPass3, (String) objB8, str9));
                return unit;
            case 11:
                chaloUseCaseResult = (ChaloUseCaseResult) checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0;
                ResultKt.b(objB8);
                i = 0;
                chaloUseCaseResult2 = chaloUseCaseResult;
                str10 = (String) objB8;
                checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0 = chaloUseCaseResult2;
                checkoutPostPaymentComponent$handleSuperPassFlow$1.L$1 = str10;
                checkoutPostPaymentComponent$handleSuperPassFlow$1.label = 12;
                objB8 = stringProvider.b(StringEnum.PAYMENT_STATUS_UNCLEAR_DESC, new Object[i], checkoutPostPaymentComponent$handleSuperPassFlow$1);
                if (objB8 != obj) {
                    str11 = (String) objB8;
                    checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0 = chaloUseCaseResult2;
                    checkoutPostPaymentComponent$handleSuperPassFlow$1.L$1 = str10;
                    checkoutPostPaymentComponent$handleSuperPassFlow$1.L$2 = str11;
                    checkoutPostPaymentComponent$handleSuperPassFlow$1.label = 13;
                    objB6 = stringProvider.b(StringEnum.VIEW_MY_TICKETS_AND_PASSES, new Object[i], checkoutPostPaymentComponent$handleSuperPassFlow$1);
                    if (objB6 != obj) {
                        String str111 = str10;
                        str12 = str11;
                        objB8 = objB6;
                        str13 = str111;
                        str14 = (String) objB8;
                        checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0 = chaloUseCaseResult2;
                        checkoutPostPaymentComponent$handleSuperPassFlow$1.L$1 = str13;
                        checkoutPostPaymentComponent$handleSuperPassFlow$1.L$2 = str12;
                        checkoutPostPaymentComponent$handleSuperPassFlow$1.L$3 = str14;
                        checkoutPostPaymentComponent$handleSuperPassFlow$1.label = 14;
                        objB7 = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], checkoutPostPaymentComponent$handleSuperPassFlow$1);
                        if (objB7 != obj) {
                            str15 = str14;
                            objB8 = objB7;
                            str16 = str13;
                            chaloUseCaseResult3 = chaloUseCaseResult2;
                            E0(new ho(str16, str12, IconType.INTERNET_FAILURE, str15, (String) objB8, 2));
                            Pair pair118 = new Pair("reason", ((ChaloUseCaseResult.Failure) chaloUseCaseResult3).f10418a);
                            Pair pair119 = new Pair("transaction id", checkoutPaymentDataResolver.u().f2691a.h);
                            Pair pair120 = new Pair("historyCallRetryCount", new Integer(5 - this.O));
                            Pair[] pairArr10 = new Pair[3];
                            pairArr10[0] = pair118;
                            pairArr10[c] = pair119;
                            pairArr10[2] = pair120;
                            ICheckoutAnalyticsHelper.DefaultImpls.a(iCheckoutAnalyticsHelper, "post payment history call use case failure", MapsKt.i(pairArr10), 12);
                            return unit;
                        }
                    }
                }
                return obj;
            case 12:
                str10 = (String) checkoutPostPaymentComponent$handleSuperPassFlow$1.L$1;
                chaloUseCaseResult2 = (ChaloUseCaseResult) checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0;
                ResultKt.b(objB8);
                checkoutPaymentDataResolver = checkoutPaymentDataResolver;
                c = 1;
                i = 0;
                str11 = (String) objB8;
                checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0 = chaloUseCaseResult2;
                checkoutPostPaymentComponent$handleSuperPassFlow$1.L$1 = str10;
                checkoutPostPaymentComponent$handleSuperPassFlow$1.L$2 = str11;
                checkoutPostPaymentComponent$handleSuperPassFlow$1.label = 13;
                objB6 = stringProvider.b(StringEnum.VIEW_MY_TICKETS_AND_PASSES, new Object[i], checkoutPostPaymentComponent$handleSuperPassFlow$1);
                if (objB6 != obj) {
                    String str112 = str10;
                    str12 = str11;
                    objB8 = objB6;
                    str13 = str112;
                    str14 = (String) objB8;
                    checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0 = chaloUseCaseResult2;
                    checkoutPostPaymentComponent$handleSuperPassFlow$1.L$1 = str13;
                    checkoutPostPaymentComponent$handleSuperPassFlow$1.L$2 = str12;
                    checkoutPostPaymentComponent$handleSuperPassFlow$1.L$3 = str14;
                    checkoutPostPaymentComponent$handleSuperPassFlow$1.label = 14;
                    objB7 = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], checkoutPostPaymentComponent$handleSuperPassFlow$1);
                    if (objB7 != obj) {
                        str15 = str14;
                        objB8 = objB7;
                        str16 = str13;
                        chaloUseCaseResult3 = chaloUseCaseResult2;
                        E0(new ho(str16, str12, IconType.INTERNET_FAILURE, str15, (String) objB8, 2));
                        Pair pair1110 = new Pair("reason", ((ChaloUseCaseResult.Failure) chaloUseCaseResult3).f10418a);
                        Pair pair1111 = new Pair("transaction id", checkoutPaymentDataResolver.u().f2691a.h);
                        Pair pair121 = new Pair("historyCallRetryCount", new Integer(5 - this.O));
                        Pair[] pairArr11 = new Pair[3];
                        pairArr11[0] = pair1110;
                        pairArr11[c] = pair1111;
                        pairArr11[2] = pair121;
                        ICheckoutAnalyticsHelper.DefaultImpls.a(iCheckoutAnalyticsHelper, "post payment history call use case failure", MapsKt.i(pairArr11), 12);
                        return unit;
                    }
                }
                return obj;
            case 13:
                str12 = (String) checkoutPostPaymentComponent$handleSuperPassFlow$1.L$2;
                String str23 = (String) checkoutPostPaymentComponent$handleSuperPassFlow$1.L$1;
                ChaloUseCaseResult chaloUseCaseResult4 = (ChaloUseCaseResult) checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0;
                ResultKt.b(objB8);
                checkoutPaymentDataResolver = checkoutPaymentDataResolver;
                str13 = str23;
                chaloUseCaseResult2 = chaloUseCaseResult4;
                c = 1;
                str14 = (String) objB8;
                checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0 = chaloUseCaseResult2;
                checkoutPostPaymentComponent$handleSuperPassFlow$1.L$1 = str13;
                checkoutPostPaymentComponent$handleSuperPassFlow$1.L$2 = str12;
                checkoutPostPaymentComponent$handleSuperPassFlow$1.L$3 = str14;
                checkoutPostPaymentComponent$handleSuperPassFlow$1.label = 14;
                objB7 = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], checkoutPostPaymentComponent$handleSuperPassFlow$1);
                if (objB7 != obj) {
                    str15 = str14;
                    objB8 = objB7;
                    str16 = str13;
                    chaloUseCaseResult3 = chaloUseCaseResult2;
                    E0(new ho(str16, str12, IconType.INTERNET_FAILURE, str15, (String) objB8, 2));
                    Pair pair1112 = new Pair("reason", ((ChaloUseCaseResult.Failure) chaloUseCaseResult3).f10418a);
                    Pair pair1113 = new Pair("transaction id", checkoutPaymentDataResolver.u().f2691a.h);
                    Pair pair122 = new Pair("historyCallRetryCount", new Integer(5 - this.O));
                    Pair[] pairArr12 = new Pair[3];
                    pairArr12[0] = pair1112;
                    pairArr12[c] = pair1113;
                    pairArr12[2] = pair122;
                    ICheckoutAnalyticsHelper.DefaultImpls.a(iCheckoutAnalyticsHelper, "post payment history call use case failure", MapsKt.i(pairArr12), 12);
                    return unit;
                }
                return obj;
            case 14:
                String str24 = (String) checkoutPostPaymentComponent$handleSuperPassFlow$1.L$3;
                str12 = (String) checkoutPostPaymentComponent$handleSuperPassFlow$1.L$2;
                String str25 = (String) checkoutPostPaymentComponent$handleSuperPassFlow$1.L$1;
                chaloUseCaseResult3 = (ChaloUseCaseResult) checkoutPostPaymentComponent$handleSuperPassFlow$1.L$0;
                ResultKt.b(objB8);
                str15 = str24;
                checkoutPaymentDataResolver = checkoutPaymentDataResolver;
                c = 1;
                str16 = str25;
                E0(new ho(str16, str12, IconType.INTERNET_FAILURE, str15, (String) objB8, 2));
                Pair pair1114 = new Pair("reason", ((ChaloUseCaseResult.Failure) chaloUseCaseResult3).f10418a);
                Pair pair1115 = new Pair("transaction id", checkoutPaymentDataResolver.u().f2691a.h);
                Pair pair123 = new Pair("historyCallRetryCount", new Integer(5 - this.O));
                Pair[] pairArr13 = new Pair[3];
                pairArr13[0] = pair1114;
                pairArr13[c] = pair1115;
                pairArr13[2] = pair123;
                ICheckoutAnalyticsHelper.DefaultImpls.a(iCheckoutAnalyticsHelper, "post payment history call use case failure", MapsKt.i(pairArr13), 12);
                return unit;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final boolean T0() {
        int i = this.O;
        if (i <= 0) {
            return false;
        }
        this.O = i - 1;
        return true;
    }

    public final void U0(PostPaymentViewIntent postPaymentViewIntent) {
        C0(postPaymentViewIntent);
        boolean zEquals = postPaymentViewIntent.equals(PostPaymentViewIntent.ProcessPostPayment.f1594a);
        ContextScope contextScope = this.j;
        if (zEquals) {
            BuildersKt.d(contextScope, null, null, new CheckoutPostPaymentComponent$handleProcessPostPaymentIntent$1(this, null), 3);
            return;
        }
        if (!(postPaymentViewIntent instanceof PostPaymentViewIntent.SuccessScreenPositiveBtnClickIntent)) {
            if (postPaymentViewIntent.equals(PostPaymentViewIntent.SuccessScreenNegativeBtnClickIntent.f1595a)) {
                q0(new io(this, 1));
                return;
            }
            if (postPaymentViewIntent instanceof PostPaymentViewIntent.ErrorScreenPositiveBtnClickIntent) {
                E0(new on(15));
                q0(new ti(14, (PostPaymentViewIntent.ErrorScreenPositiveBtnClickIntent) postPaymentViewIntent, this));
                return;
            } else {
                if (!postPaymentViewIntent.equals(PostPaymentViewIntent.ErrorScreenNegativeBtnClickIntent.f1592a)) {
                    throw new NoWhenBranchMatchedException();
                }
                E0(new on(14));
                q0(new io(this, 0));
                return;
            }
        }
        PostPaymentSuccessProductType postPaymentSuccessProductType = ((PostPaymentViewIntent.SuccessScreenPositiveBtnClickIntent) postPaymentViewIntent).f1596a;
        if (postPaymentSuccessProductType instanceof PostPaymentSuccessProductType.InstantTicket) {
            BuildersKt.d(contextScope, null, null, new CheckoutPostPaymentComponent$handleSuccessScreenPositiveBtnClickIntent$1(this, postPaymentSuccessProductType, null), 3);
            return;
        }
        if (postPaymentSuccessProductType instanceof PostPaymentSuccessProductType.OndcTicket) {
            G0(this, null, null, ((PostPaymentSuccessProductType.OndcTicket) postPaymentSuccessProductType).f1587a, 6);
            return;
        }
        if (postPaymentSuccessProductType instanceof PostPaymentSuccessProductType.PremiumReserveTicket) {
            G0(this, null, null, ((PostPaymentSuccessProductType.PremiumReserveTicket) postPaymentSuccessProductType).f1589a, 6);
            return;
        }
        if (postPaymentSuccessProductType instanceof PostPaymentSuccessProductType.SuperPass) {
            PostPaymentSuccessProductType.SuperPass superPass = (PostPaymentSuccessProductType.SuperPass) postPaymentSuccessProductType;
            G0(this, superPass.f1590a, superPass.b, null, 8);
            return;
        }
        if (Intrinsics.d(postPaymentSuccessProductType, PostPaymentSuccessProductType.OtherProduct.f1588a)) {
            G0(this, null, null, null, 14);
            return;
        }
        if (postPaymentSuccessProductType instanceof PostPaymentSuccessProductType.MetroTicket) {
            G0(this, null, null, ((PostPaymentSuccessProductType.MetroTicket) postPaymentSuccessProductType).f1585a, 6);
            return;
        }
        if (postPaymentSuccessProductType != null) {
            if (postPaymentSuccessProductType instanceof PostPaymentSuccessProductType.MTicket) {
                BuildersKt.d(contextScope, null, null, new CheckoutPostPaymentComponent$handleSuccessScreenPositiveBtnClickIntent$2(this, postPaymentSuccessProductType, null), 3);
            } else {
                if (!(postPaymentSuccessProductType instanceof PostPaymentSuccessProductType.MultiModalGroupTicket)) {
                    throw new NoWhenBranchMatchedException();
                }
                BuildersKt.d(contextScope, null, null, new CheckoutPostPaymentComponent$handleSuccessScreenPositiveBtnClickIntent$3(this, postPaymentSuccessProductType, null), 3);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object V0(String str, ContinuationImpl continuationImpl) {
        CheckoutPostPaymentComponent$raisePbSubscriptionPassPurchaseAdjustEvent$1 checkoutPostPaymentComponent$raisePbSubscriptionPassPurchaseAdjustEvent$1;
        if (continuationImpl instanceof CheckoutPostPaymentComponent$raisePbSubscriptionPassPurchaseAdjustEvent$1) {
            checkoutPostPaymentComponent$raisePbSubscriptionPassPurchaseAdjustEvent$1 = (CheckoutPostPaymentComponent$raisePbSubscriptionPassPurchaseAdjustEvent$1) continuationImpl;
            int i = checkoutPostPaymentComponent$raisePbSubscriptionPassPurchaseAdjustEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkoutPostPaymentComponent$raisePbSubscriptionPassPurchaseAdjustEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                checkoutPostPaymentComponent$raisePbSubscriptionPassPurchaseAdjustEvent$1 = new CheckoutPostPaymentComponent$raisePbSubscriptionPassPurchaseAdjustEvent$1(this, continuationImpl);
            }
        } else {
            checkoutPostPaymentComponent$raisePbSubscriptionPassPurchaseAdjustEvent$1 = new CheckoutPostPaymentComponent$raisePbSubscriptionPassPurchaseAdjustEvent$1(this, continuationImpl);
        }
        Object objA = checkoutPostPaymentComponent$raisePbSubscriptionPassPurchaseAdjustEvent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = checkoutPostPaymentComponent$raisePbSubscriptionPassPurchaseAdjustEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            checkoutPostPaymentComponent$raisePbSubscriptionPassPurchaseAdjustEvent$1.L$0 = str;
            checkoutPostPaymentComponent$raisePbSubscriptionPassPurchaseAdjustEvent$1.label = 1;
            objA = this.v.a(checkoutPostPaymentComponent$raisePbSubscriptionPassPurchaseAdjustEvent$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) checkoutPostPaymentComponent$raisePbSubscriptionPassPurchaseAdjustEvent$1.L$0;
            ResultKt.b(objA);
        }
        if (((MiscellaneousCityWiseConfigForCity) objA).e.contains(str)) {
            this.m.a(H0(), this.q.f() ? "c36hsg" : "ws45zd");
        }
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009a  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object W0(ContinuationImpl continuationImpl) {
        CheckoutPostPaymentComponent$updatePaymentStatusErrorDetailsState$1 checkoutPostPaymentComponent$updatePaymentStatusErrorDetailsState$1;
        String str;
        String str2;
        Object objB;
        String str3;
        String str4;
        Object objB2;
        String str5;
        String str6;
        String str7;
        if (continuationImpl instanceof CheckoutPostPaymentComponent$updatePaymentStatusErrorDetailsState$1) {
            checkoutPostPaymentComponent$updatePaymentStatusErrorDetailsState$1 = (CheckoutPostPaymentComponent$updatePaymentStatusErrorDetailsState$1) continuationImpl;
            int i = checkoutPostPaymentComponent$updatePaymentStatusErrorDetailsState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkoutPostPaymentComponent$updatePaymentStatusErrorDetailsState$1.label = i - Integer.MIN_VALUE;
            } else {
                checkoutPostPaymentComponent$updatePaymentStatusErrorDetailsState$1 = new CheckoutPostPaymentComponent$updatePaymentStatusErrorDetailsState$1(this, continuationImpl);
            }
        } else {
            checkoutPostPaymentComponent$updatePaymentStatusErrorDetailsState$1 = new CheckoutPostPaymentComponent$updatePaymentStatusErrorDetailsState$1(this, continuationImpl);
        }
        Object objB3 = checkoutPostPaymentComponent$updatePaymentStatusErrorDetailsState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = checkoutPostPaymentComponent$updatePaymentStatusErrorDetailsState$1.label;
        StringProvider stringProvider = this.s;
        if (i2 == 0) {
            ResultKt.b(objB3);
            checkoutPostPaymentComponent$updatePaymentStatusErrorDetailsState$1.label = 1;
            objB3 = stringProvider.b(StringEnum.PAYMENT_STATUS_UNCLEAR, new Object[0], checkoutPostPaymentComponent$updatePaymentStatusErrorDetailsState$1);
            if (objB3 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ResultKt.b(objB3);
        } else {
            if (i2 == 2) {
                str = (String) checkoutPostPaymentComponent$updatePaymentStatusErrorDetailsState$1.L$0;
                ResultKt.b(objB3);
                str2 = (String) objB3;
                checkoutPostPaymentComponent$updatePaymentStatusErrorDetailsState$1.L$0 = str;
                checkoutPostPaymentComponent$updatePaymentStatusErrorDetailsState$1.L$1 = str2;
                checkoutPostPaymentComponent$updatePaymentStatusErrorDetailsState$1.label = 3;
                objB = stringProvider.b(StringEnum.VIEW_MY_TICKETS_AND_PASSES, new Object[0], checkoutPostPaymentComponent$updatePaymentStatusErrorDetailsState$1);
                if (objB != coroutineSingletons) {
                    str3 = str2;
                    objB3 = objB;
                    str4 = (String) objB3;
                    checkoutPostPaymentComponent$updatePaymentStatusErrorDetailsState$1.L$0 = str;
                    checkoutPostPaymentComponent$updatePaymentStatusErrorDetailsState$1.L$1 = str3;
                    checkoutPostPaymentComponent$updatePaymentStatusErrorDetailsState$1.L$2 = str4;
                    checkoutPostPaymentComponent$updatePaymentStatusErrorDetailsState$1.label = 4;
                    objB2 = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], checkoutPostPaymentComponent$updatePaymentStatusErrorDetailsState$1);
                    if (objB2 != coroutineSingletons) {
                        str5 = str;
                        str6 = str3;
                        str7 = str4;
                        objB3 = objB2;
                    }
                }
                return coroutineSingletons;
            }
            if (i2 == 3) {
                String str8 = (String) checkoutPostPaymentComponent$updatePaymentStatusErrorDetailsState$1.L$1;
                String str9 = (String) checkoutPostPaymentComponent$updatePaymentStatusErrorDetailsState$1.L$0;
                ResultKt.b(objB3);
                str3 = str8;
                str = str9;
                str4 = (String) objB3;
                checkoutPostPaymentComponent$updatePaymentStatusErrorDetailsState$1.L$0 = str;
                checkoutPostPaymentComponent$updatePaymentStatusErrorDetailsState$1.L$1 = str3;
                checkoutPostPaymentComponent$updatePaymentStatusErrorDetailsState$1.L$2 = str4;
                checkoutPostPaymentComponent$updatePaymentStatusErrorDetailsState$1.label = 4;
                objB2 = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], checkoutPostPaymentComponent$updatePaymentStatusErrorDetailsState$1);
                if (objB2 != coroutineSingletons) {
                    str5 = str;
                    str6 = str3;
                    str7 = str4;
                    objB3 = objB2;
                }
                return coroutineSingletons;
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str10 = (String) checkoutPostPaymentComponent$updatePaymentStatusErrorDetailsState$1.L$2;
            str6 = (String) checkoutPostPaymentComponent$updatePaymentStatusErrorDetailsState$1.L$1;
            String str11 = (String) checkoutPostPaymentComponent$updatePaymentStatusErrorDetailsState$1.L$0;
            ResultKt.b(objB3);
            str7 = str10;
            str5 = str11;
        }
        E0(new ho(str5, str6, IconType.INTERNET_FAILURE, str7, (String) objB3, 3));
        return Unit.f17538a;
        str = (String) objB3;
        checkoutPostPaymentComponent$updatePaymentStatusErrorDetailsState$1.L$0 = str;
        checkoutPostPaymentComponent$updatePaymentStatusErrorDetailsState$1.label = 2;
        objB3 = stringProvider.b(StringEnum.PAYMENT_STATUS_UNCLEAR_DESC, new Object[0], checkoutPostPaymentComponent$updatePaymentStatusErrorDetailsState$1);
        if (objB3 != coroutineSingletons) {
            str2 = (String) objB3;
            checkoutPostPaymentComponent$updatePaymentStatusErrorDetailsState$1.L$0 = str;
            checkoutPostPaymentComponent$updatePaymentStatusErrorDetailsState$1.L$1 = str2;
            checkoutPostPaymentComponent$updatePaymentStatusErrorDetailsState$1.label = 3;
            objB = stringProvider.b(StringEnum.VIEW_MY_TICKETS_AND_PASSES, new Object[0], checkoutPostPaymentComponent$updatePaymentStatusErrorDetailsState$1);
            if (objB != coroutineSingletons) {
                str3 = str2;
                objB3 = objB;
                str4 = (String) objB3;
                checkoutPostPaymentComponent$updatePaymentStatusErrorDetailsState$1.L$0 = str;
                checkoutPostPaymentComponent$updatePaymentStatusErrorDetailsState$1.L$1 = str3;
                checkoutPostPaymentComponent$updatePaymentStatusErrorDetailsState$1.L$2 = str4;
                checkoutPostPaymentComponent$updatePaymentStatusErrorDetailsState$1.label = 4;
                objB2 = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], checkoutPostPaymentComponent$updatePaymentStatusErrorDetailsState$1);
                if (objB2 != coroutineSingletons) {
                    str5 = str;
                    str6 = str3;
                    str7 = str4;
                    objB3 = objB2;
                    E0(new ho(str5, str6, IconType.INTERNET_FAILURE, str7, (String) objB3, 3));
                    return Unit.f17538a;
                }
            }
        }
        return coroutineSingletons;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new PostPaymentDataState(false, null, null);
    }
}
