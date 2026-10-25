package app.chalo.productsummary.ui.domain;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.contract.BasicInfoContract;
import app.chalo.data.CardRechargePaymentStatus;
import app.chalo.data.CardRechargeStatus;
import app.chalo.data.CardRechargeSummaryData;
import app.chalo.data.RefundInfoAppModel;
import app.chalo.data.RefundStatus;
import app.chalo.features.productsync.constants.SuperPassApplicationStatus;
import app.chalo.features.productsync.constants.SuperPassStatus;
import app.chalo.instantticket.data.model.InstantTicketStatus;
import app.chalo.metro.data.app.MetroTicketStatus;
import app.chalo.models.mticketing.MTicketUtilsHelper;
import app.chalo.multimodalticket.data.model.MultiModalGroupTicketStatus;
import app.chalo.ondc.model.app.OndcMetroTicketStatus;
import app.chalo.ondc.model.app.OndcTicketStatus;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import app.chalo.productsummary.ui.data.ProductSummaryStatusUiData;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.ChaloTextStyleHelper;
import app.chalo.uistate.text.TextUIState;
import com.google.firebase.messaging.ServiceStarter;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/domain/GetProductStatusUIForSummaryScreen;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetProductStatusUIForSummaryScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringProvider f8764a;
    public final BasicInfoContract b;
    public final MTicketUtilsHelper c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8765a;
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

        static {
            int[] iArr = new int[MultiModalGroupTicketStatus.values().length];
            try {
                iArr[MultiModalGroupTicketStatus.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MultiModalGroupTicketStatus.PAYMENT_PROCESSING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MultiModalGroupTicketStatus.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MultiModalGroupTicketStatus.EXPIRED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MultiModalGroupTicketStatus.PUNCHED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f8765a = iArr;
            int[] iArr2 = new int[PremiumReserveTicketStatus.values().length];
            try {
                iArr2[PremiumReserveTicketStatus.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PremiumReserveTicketStatus.PAYMENT_PROCESSING.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[PremiumReserveTicketStatus.PAYMENT_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[PremiumReserveTicketStatus.PUNCHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[PremiumReserveTicketStatus.USED.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[PremiumReserveTicketStatus.USER_CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[PremiumReserveTicketStatus.SYSTEM_CANCELLED.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[PremiumReserveTicketStatus.USER_RESCHEDULED.ordinal()] = 8;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[PremiumReserveTicketStatus.SYSTEM_RESCHEDULED.ordinal()] = 9;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[PremiumReserveTicketStatus.EXPIRED.ordinal()] = 10;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[PremiumReserveTicketStatus.BOOKING_UNDER_PROCESS.ordinal()] = 11;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[PremiumReserveTicketStatus.BOOKING_FAILED.ordinal()] = 12;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[PremiumReserveTicketStatus.FAILED.ordinal()] = 13;
            } catch (NoSuchFieldError unused18) {
            }
            b = iArr2;
            int[] iArr3 = new int[RefundStatus.values().length];
            try {
                iArr3[RefundStatus.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[RefundStatus.NOT_ALLOWED.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[RefundStatus.REFUNDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr3[RefundStatus.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            c = iArr3;
            int[] iArr4 = new int[InstantTicketStatus.values().length];
            try {
                iArr4[InstantTicketStatus.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr4[InstantTicketStatus.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr4[InstantTicketStatus.EXPIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr4[InstantTicketStatus.CANCELLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr4[InstantTicketStatus.PAYMENT_PROCESSING.ordinal()] = 5;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr4[InstantTicketStatus.PAYMENT_FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused28) {
            }
            d = iArr4;
            int[] iArr5 = new int[OndcTicketStatus.values().length];
            try {
                iArr5[OndcTicketStatus.EXPIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr5[OndcTicketStatus.USED.ordinal()] = 2;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr5[OndcTicketStatus.PUNCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr5[OndcTicketStatus.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr5[OndcTicketStatus.ACTIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr5[OndcTicketStatus.PAYMENT_PROCESSING.ordinal()] = 6;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr5[OndcTicketStatus.PAYMENT_FAILED.ordinal()] = 7;
            } catch (NoSuchFieldError unused35) {
            }
            e = iArr5;
            int[] iArr6 = new int[OndcMetroTicketStatus.values().length];
            try {
                iArr6[OndcMetroTicketStatus.EXPIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr6[OndcMetroTicketStatus.USED.ordinal()] = 2;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr6[OndcMetroTicketStatus.PUNCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr6[OndcMetroTicketStatus.CANCELLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr6[OndcMetroTicketStatus.CANCEL_INITIATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr6[OndcMetroTicketStatus.FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr6[OndcMetroTicketStatus.ACTIVE.ordinal()] = 7;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr6[OndcMetroTicketStatus.PAYMENT_PROCESSING.ordinal()] = 8;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr6[OndcMetroTicketStatus.PAYMENT_FAILED.ordinal()] = 9;
            } catch (NoSuchFieldError unused44) {
            }
            f = iArr6;
            int[] iArr7 = new int[SuperPassStatus.values().length];
            try {
                iArr7[SuperPassStatus.PAYMENT_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr7[SuperPassStatus.PAYMENT_PROCESSING.ordinal()] = 2;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr7[SuperPassStatus.UNUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr7[SuperPassStatus.USED.ordinal()] = 4;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr7[SuperPassStatus.INACTIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr7[SuperPassStatus.EXPIRED.ordinal()] = 6;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr7[SuperPassStatus.CANCELLED.ordinal()] = 7;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr7[SuperPassStatus.FAILED.ordinal()] = 8;
            } catch (NoSuchFieldError unused52) {
            }
            g = iArr7;
            int[] iArr8 = new int[SuperPassApplicationStatus.values().length];
            try {
                iArr8[SuperPassApplicationStatus.UNVERIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr8[SuperPassApplicationStatus.VERIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr8[SuperPassApplicationStatus.REJECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr8[SuperPassApplicationStatus.PAYMENT_PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused56) {
            }
            h = iArr8;
            int[] iArr9 = new int[MetroTicketStatus.values().length];
            try {
                iArr9[MetroTicketStatus.EXPIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr9[MetroTicketStatus.USED.ordinal()] = 2;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr9[MetroTicketStatus.PUNCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr9[MetroTicketStatus.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr9[MetroTicketStatus.TAPPED_IN.ordinal()] = 5;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr9[MetroTicketStatus.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr9[MetroTicketStatus.ACTIVE.ordinal()] = 7;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr9[MetroTicketStatus.PAYMENT_PROCESSING.ordinal()] = 8;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr9[MetroTicketStatus.PAYMENT_FAILED.ordinal()] = 9;
            } catch (NoSuchFieldError unused65) {
            }
            i = iArr9;
            int[] iArr10 = new int[CardRechargeStatus.values().length];
            try {
                iArr10[CardRechargeStatus.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr10[CardRechargeStatus.PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr10[CardRechargeStatus.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused68) {
            }
            j = iArr10;
            int[] iArr11 = new int[CardRechargePaymentStatus.values().length];
            try {
                iArr11[CardRechargePaymentStatus.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr11[CardRechargePaymentStatus.INITIATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr11[CardRechargePaymentStatus.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused71) {
            }
            k = iArr11;
        }
    }

    public GetProductStatusUIForSummaryScreen(StringProvider stringProvider, BasicInfoContract basicInfoContract, MTicketUtilsHelper mTicketUtilsHelper) {
        this.f8764a = stringProvider;
        this.b = basicInfoContract;
        this.c = mTicketUtilsHelper;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0044  */
    public static ProductSummaryStatusUiData c(RefundInfoAppModel refundInfoAppModel) {
        ChaloColorToken.ShadyGray shadyGray;
        ImageUIState imageUIState;
        RefundStatus refundStatus = refundInfoAppModel.f2396a;
        int i = refundStatus == null ? -1 : WhenMappings.c[refundStatus.ordinal()];
        TextUIState.ChaloTextUIState chaloTextUIStateC = null;
        if (i == -1) {
            return null;
        }
        ChaloColorToken.ShadyGray shadyGray2 = ChaloColorToken.ShadyGray.f9851a;
        if (i == 1) {
            shadyGray = shadyGray2;
            imageUIState = new ImageUIState(IconType.IC_MONEY_STACK, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
        } else if (i == 2) {
            shadyGray = shadyGray2;
            imageUIState = new ImageUIState(IconType.IC_ALERT_TRIANGLE, (String) null, shadyGray, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 242);
        } else if (i == 3) {
            shadyGray = shadyGray2;
            imageUIState = new ImageUIState(IconType.IC_MONEY_STACK, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            imageUIState = new ImageUIState(IconType.IC_RELOAD, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
            shadyGray = shadyGray2;
        }
        String str = refundInfoAppModel.b;
        ChaloTextStyleHelper chaloTextStyleHelper = ChaloTextStyleHelper.f10078a;
        TextUIState.ChaloTextUIState chaloTextUIStateC2 = ChaloTextStyleHelper.c(chaloTextStyleHelper, str, ChaloColorToken.AlmostBlackColor.f9756a, null, null, null, null, 124);
        String str2 = refundInfoAppModel.c;
        if (str2 != null) {
            String str3 = str2.length() > 0 ? str2 : null;
            if (str3 != null) {
                chaloTextUIStateC = ChaloTextStyleHelper.c(chaloTextStyleHelper, str3, shadyGray, null, null, null, null, 124);
            }
        }
        return new ProductSummaryStatusUiData(imageUIState, ChaloColorToken.SectionDividerColor.f9849a, chaloTextUIStateC2, chaloTextUIStateC, null, null, null, 484);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(OndcMetroTicketStatus ondcMetroTicketStatus, ContinuationImpl continuationImpl) {
        GetProductStatusUIForSummaryScreen$getCancelInitiatedBannerIfEligible$1 getProductStatusUIForSummaryScreen$getCancelInitiatedBannerIfEligible$1;
        ImageUIState imageUIState;
        ChaloColorToken chaloColorToken;
        ChaloTextStyleHelper chaloTextStyleHelper;
        if (continuationImpl instanceof GetProductStatusUIForSummaryScreen$getCancelInitiatedBannerIfEligible$1) {
            getProductStatusUIForSummaryScreen$getCancelInitiatedBannerIfEligible$1 = (GetProductStatusUIForSummaryScreen$getCancelInitiatedBannerIfEligible$1) continuationImpl;
            int i = getProductStatusUIForSummaryScreen$getCancelInitiatedBannerIfEligible$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getProductStatusUIForSummaryScreen$getCancelInitiatedBannerIfEligible$1.label = i - Integer.MIN_VALUE;
            } else {
                getProductStatusUIForSummaryScreen$getCancelInitiatedBannerIfEligible$1 = new GetProductStatusUIForSummaryScreen$getCancelInitiatedBannerIfEligible$1(this, continuationImpl);
            }
        } else {
            getProductStatusUIForSummaryScreen$getCancelInitiatedBannerIfEligible$1 = new GetProductStatusUIForSummaryScreen$getCancelInitiatedBannerIfEligible$1(this, continuationImpl);
        }
        Object objB = getProductStatusUIForSummaryScreen$getCancelInitiatedBannerIfEligible$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getProductStatusUIForSummaryScreen$getCancelInitiatedBannerIfEligible$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            if (ondcMetroTicketStatus != OndcMetroTicketStatus.CANCEL_INITIATED) {
                return null;
            }
            ImageUIState imageUIState2 = new ImageUIState(IconType.IC_TIME, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
            getProductStatusUIForSummaryScreen$getCancelInitiatedBannerIfEligible$1.L$0 = imageUIState2;
            ChaloColorToken.LightGrey lightGrey = ChaloColorToken.LightGrey.f9815a;
            getProductStatusUIForSummaryScreen$getCancelInitiatedBannerIfEligible$1.L$1 = lightGrey;
            ChaloTextStyleHelper chaloTextStyleHelper2 = ChaloTextStyleHelper.f10078a;
            getProductStatusUIForSummaryScreen$getCancelInitiatedBannerIfEligible$1.L$2 = chaloTextStyleHelper2;
            getProductStatusUIForSummaryScreen$getCancelInitiatedBannerIfEligible$1.label = 1;
            objB = this.f8764a.b(StringEnum.CANCELLATION_IN_PROGRESS_MSG, new Object[0], getProductStatusUIForSummaryScreen$getCancelInitiatedBannerIfEligible$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            imageUIState = imageUIState2;
            chaloColorToken = lightGrey;
            chaloTextStyleHelper = chaloTextStyleHelper2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ChaloTextStyleHelper chaloTextStyleHelper3 = (ChaloTextStyleHelper) getProductStatusUIForSummaryScreen$getCancelInitiatedBannerIfEligible$1.L$2;
            ChaloColorToken chaloColorToken2 = (ChaloColorToken) getProductStatusUIForSummaryScreen$getCancelInitiatedBannerIfEligible$1.L$1;
            ImageUIState imageUIState3 = (ImageUIState) getProductStatusUIForSummaryScreen$getCancelInitiatedBannerIfEligible$1.L$0;
            ResultKt.b(objB);
            imageUIState = imageUIState3;
            chaloColorToken = chaloColorToken2;
            chaloTextStyleHelper = chaloTextStyleHelper3;
        }
        return new ProductSummaryStatusUiData(imageUIState, chaloColorToken, ChaloTextStyleHelper.c(chaloTextStyleHelper, (String) objB, ChaloColorToken.AlmostBlackColor.f9756a, null, null, null, null, 124), null, null, null, null, ServiceStarter.ERROR_UNKNOWN);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object b(CardRechargeSummaryData cardRechargeSummaryData, ContinuationImpl continuationImpl) {
        GetProductStatusUIForSummaryScreen$getCardRechargeStatusUiData$1 getProductStatusUIForSummaryScreen$getCardRechargeStatusUiData$1;
        ChaloColorToken chaloColorToken;
        ChaloTextStyleHelper chaloTextStyleHelper;
        ImageUIState imageUIState;
        ChaloColorToken chaloColorToken2;
        ChaloTextStyleHelper chaloTextStyleHelper2;
        ImageUIState imageUIState2;
        if (continuationImpl instanceof GetProductStatusUIForSummaryScreen$getCardRechargeStatusUiData$1) {
            getProductStatusUIForSummaryScreen$getCardRechargeStatusUiData$1 = (GetProductStatusUIForSummaryScreen$getCardRechargeStatusUiData$1) continuationImpl;
            int i = getProductStatusUIForSummaryScreen$getCardRechargeStatusUiData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getProductStatusUIForSummaryScreen$getCardRechargeStatusUiData$1.label = i - Integer.MIN_VALUE;
            } else {
                getProductStatusUIForSummaryScreen$getCardRechargeStatusUiData$1 = new GetProductStatusUIForSummaryScreen$getCardRechargeStatusUiData$1(this, continuationImpl);
            }
        } else {
            getProductStatusUIForSummaryScreen$getCardRechargeStatusUiData$1 = new GetProductStatusUIForSummaryScreen$getCardRechargeStatusUiData$1(this, continuationImpl);
        }
        Object objB = getProductStatusUIForSummaryScreen$getCardRechargeStatusUiData$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getProductStatusUIForSummaryScreen$getCardRechargeStatusUiData$1.label;
        ChaloColorToken.AlmostBlackColor almostBlackColor = ChaloColorToken.AlmostBlackColor.f9756a;
        if (i2 != 0) {
            if (i2 == 1) {
                ChaloTextStyleHelper chaloTextStyleHelper3 = (ChaloTextStyleHelper) getProductStatusUIForSummaryScreen$getCardRechargeStatusUiData$1.L$2;
                chaloColorToken = (ChaloColorToken) getProductStatusUIForSummaryScreen$getCardRechargeStatusUiData$1.L$1;
                imageUIState = (ImageUIState) getProductStatusUIForSummaryScreen$getCardRechargeStatusUiData$1.L$0;
                ResultKt.b(objB);
                chaloTextStyleHelper = chaloTextStyleHelper3;
                return CollectionsKt.R(new ProductSummaryStatusUiData(imageUIState, chaloColorToken, ChaloTextStyleHelper.c(chaloTextStyleHelper, (String) objB, almostBlackColor, null, null, null, null, 124), null, null, null, null, ServiceStarter.ERROR_UNKNOWN));
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ChaloTextStyleHelper chaloTextStyleHelper4 = (ChaloTextStyleHelper) getProductStatusUIForSummaryScreen$getCardRechargeStatusUiData$1.L$2;
            chaloColorToken2 = (ChaloColorToken) getProductStatusUIForSummaryScreen$getCardRechargeStatusUiData$1.L$1;
            imageUIState2 = (ImageUIState) getProductStatusUIForSummaryScreen$getCardRechargeStatusUiData$1.L$0;
            ResultKt.b(objB);
            chaloTextStyleHelper2 = chaloTextStyleHelper4;
            return CollectionsKt.R(new ProductSummaryStatusUiData(imageUIState2, chaloColorToken2, ChaloTextStyleHelper.c(chaloTextStyleHelper2, (String) objB, almostBlackColor, null, null, null, null, 124), null, null, null, null, ServiceStarter.ERROR_UNKNOWN));
        }
        ResultKt.b(objB);
        int i3 = WhenMappings.k[cardRechargeSummaryData.j.ordinal()];
        if (i3 != 1) {
            if (i3 == 2 || i3 == 3) {
                return EmptyList.f17557a;
            }
            throw new NoWhenBranchMatchedException();
        }
        int i4 = WhenMappings.j[cardRechargeSummaryData.k.ordinal()];
        StringProvider stringProvider = this.f8764a;
        ChaloTextStyleHelper chaloTextStyleHelper5 = ChaloTextStyleHelper.f10078a;
        if (i4 == 1) {
            ImageUIState imageUIState3 = new ImageUIState(IconType.IC_GREEN_TICK, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
            getProductStatusUIForSummaryScreen$getCardRechargeStatusUiData$1.L$0 = imageUIState3;
            ChaloColorToken.GreenBase greenBase = ChaloColorToken.GreenBase.f9800a;
            getProductStatusUIForSummaryScreen$getCardRechargeStatusUiData$1.L$1 = greenBase;
            getProductStatusUIForSummaryScreen$getCardRechargeStatusUiData$1.L$2 = chaloTextStyleHelper5;
            getProductStatusUIForSummaryScreen$getCardRechargeStatusUiData$1.label = 1;
            objB = stringProvider.b(StringEnum.RECHARGE_SUCCESS_COPY, new Object[0], getProductStatusUIForSummaryScreen$getCardRechargeStatusUiData$1);
            if (objB != coroutineSingletons) {
                chaloColorToken = greenBase;
                chaloTextStyleHelper = chaloTextStyleHelper5;
                imageUIState = imageUIState3;
                return CollectionsKt.R(new ProductSummaryStatusUiData(imageUIState, chaloColorToken, ChaloTextStyleHelper.c(chaloTextStyleHelper, (String) objB, almostBlackColor, null, null, null, null, 124), null, null, null, null, ServiceStarter.ERROR_UNKNOWN));
            }
        } else {
            if (i4 != 2) {
                if (i4 == 3) {
                    return EmptyList.f17557a;
                }
                throw new NoWhenBranchMatchedException();
            }
            ImageUIState imageUIState4 = new ImageUIState(IconType.IC_RELOAD, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254);
            getProductStatusUIForSummaryScreen$getCardRechargeStatusUiData$1.L$0 = imageUIState4;
            ChaloColorToken.LightOrangeSpf lightOrangeSpf = ChaloColorToken.LightOrangeSpf.f9817a;
            getProductStatusUIForSummaryScreen$getCardRechargeStatusUiData$1.L$1 = lightOrangeSpf;
            getProductStatusUIForSummaryScreen$getCardRechargeStatusUiData$1.L$2 = chaloTextStyleHelper5;
            getProductStatusUIForSummaryScreen$getCardRechargeStatusUiData$1.label = 2;
            objB = stringProvider.b(StringEnum.RECHARGE_PENDING_COPY, new Object[0], getProductStatusUIForSummaryScreen$getCardRechargeStatusUiData$1);
            if (objB != coroutineSingletons) {
                chaloColorToken2 = lightOrangeSpf;
                chaloTextStyleHelper2 = chaloTextStyleHelper5;
                imageUIState2 = imageUIState4;
                return CollectionsKt.R(new ProductSummaryStatusUiData(imageUIState2, chaloColorToken2, ChaloTextStyleHelper.c(chaloTextStyleHelper2, (String) objB, almostBlackColor, null, null, null, null, 124), null, null, null, null, ServiceStarter.ERROR_UNKNOWN));
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x09ea  */
    /* JADX WARN: Code duplicated, block: B:119:0x0a2c  */
    /* JADX WARN: Code duplicated, block: B:123:0x0a66  */
    /* JADX WARN: Code duplicated, block: B:126:0x0aba  */
    /* JADX WARN: Code duplicated, block: B:128:0x0ac4  */
    /* JADX WARN: Code duplicated, block: B:140:0x0afa  */
    /* JADX WARN: Code duplicated, block: B:143:0x0b38  */
    /* JADX WARN: Code duplicated, block: B:147:0x0b6c  */
    /* JADX WARN: Code duplicated, block: B:150:0x0bbd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:164:0x0c65  */
    /* JADX WARN: Code duplicated, block: B:165:0x0c69  */
    /* JADX WARN: Code duplicated, block: B:180:0x0dbe  */
    /* JADX WARN: Code duplicated, block: B:183:0x0e14  */
    /* JADX WARN: Code duplicated, block: B:185:0x0e20  */
    /* JADX WARN: Code duplicated, block: B:187:0x0e26  */
    /* JADX WARN: Code duplicated, block: B:189:0x0e29  */
    /* JADX WARN: Code duplicated, block: B:191:0x0e34  */
    /* JADX WARN: Code duplicated, block: B:193:0x0e37  */
    /* JADX WARN: Code duplicated, block: B:195:0x0e3a  */
    /* JADX WARN: Code duplicated, block: B:197:0x0e3d  */
    /* JADX WARN: Code duplicated, block: B:199:0x0e40  */
    /* JADX WARN: Code duplicated, block: B:201:0x0e7a  */
    /* JADX WARN: Code duplicated, block: B:202:0x0e91  */
    /* JADX WARN: Code duplicated, block: B:205:0x0eaa  */
    /* JADX WARN: Code duplicated, block: B:207:0x0eb0  */
    /* JADX WARN: Code duplicated, block: B:209:0x0ed9  */
    /* JADX WARN: Code duplicated, block: B:212:0x0ee1  */
    /* JADX WARN: Code duplicated, block: B:215:0x0ef6  */
    /* JADX WARN: Code duplicated, block: B:217:0x0f0c  */
    /* JADX WARN: Code duplicated, block: B:220:0x0f20  */
    /* JADX WARN: Code duplicated, block: B:222:0x0f5a  */
    /* JADX WARN: Code duplicated, block: B:223:0x0f71  */
    /* JADX WARN: Code duplicated, block: B:226:0x0f8a  */
    /* JADX WARN: Code duplicated, block: B:228:0x0fc5  */
    /* JADX WARN: Code duplicated, block: B:229:0x0fda  */
    /* JADX WARN: Code duplicated, block: B:245:0x108e  */
    /* JADX WARN: Code duplicated, block: B:260:0x11d6  */
    /* JADX WARN: Code duplicated, block: B:264:0x1234  */
    /* JADX WARN: Code duplicated, block: B:266:0x1238  */
    /* JADX WARN: Code duplicated, block: B:268:0x123b  */
    /* JADX WARN: Code duplicated, block: B:270:0x1246  */
    /* JADX WARN: Code duplicated, block: B:272:0x1249  */
    /* JADX WARN: Code duplicated, block: B:274:0x124c  */
    /* JADX WARN: Code duplicated, block: B:276:0x124f  */
    /* JADX WARN: Code duplicated, block: B:278:0x1252  */
    /* JADX WARN: Code duplicated, block: B:280:0x12a3  */
    /* JADX WARN: Code duplicated, block: B:282:0x12a9  */
    /* JADX WARN: Code duplicated, block: B:284:0x12f3  */
    /* JADX WARN: Code duplicated, block: B:286:0x1344  */
    /* JADX WARN: Code duplicated, block: B:301:0x142a  */
    /* JADX WARN: Code duplicated, block: B:315:0x157c  */
    /* JADX WARN: Code duplicated, block: B:320:0x15e3  */
    /* JADX WARN: Code duplicated, block: B:322:0x15e7  */
    /* JADX WARN: Code duplicated, block: B:324:0x15ea  */
    /* JADX WARN: Code duplicated, block: B:326:0x15f5  */
    /* JADX WARN: Code duplicated, block: B:328:0x15f8  */
    /* JADX WARN: Code duplicated, block: B:330:0x15fb  */
    /* JADX WARN: Code duplicated, block: B:332:0x15fe  */
    /* JADX WARN: Code duplicated, block: B:334:0x1601  */
    /* JADX WARN: Code duplicated, block: B:336:0x164e  */
    /* JADX WARN: Code duplicated, block: B:338:0x1654  */
    /* JADX WARN: Code duplicated, block: B:340:0x169a  */
    /* JADX WARN: Code duplicated, block: B:342:0x16eb  */
    /* JADX WARN: Code duplicated, block: B:357:0x17cf  */
    /* JADX WARN: Code duplicated, block: B:372:0x191a  */
    /* JADX WARN: Code duplicated, block: B:377:0x197c  */
    /* JADX WARN: Code duplicated, block: B:384:0x19a9  */
    /* JADX WARN: Code duplicated, block: B:386:0x19af  */
    /* JADX WARN: Code duplicated, block: B:388:0x19b2  */
    /* JADX WARN: Code duplicated, block: B:390:0x19bd  */
    /* JADX WARN: Code duplicated, block: B:392:0x19c0  */
    /* JADX WARN: Code duplicated, block: B:394:0x19c3  */
    /* JADX WARN: Code duplicated, block: B:396:0x19c6  */
    /* JADX WARN: Code duplicated, block: B:398:0x19c9  */
    /* JADX WARN: Code duplicated, block: B:400:0x1a16  */
    /* JADX WARN: Code duplicated, block: B:402:0x1a1c  */
    /* JADX WARN: Code duplicated, block: B:404:0x1a6b  */
    /* JADX WARN: Code duplicated, block: B:406:0x1abc  */
    /* JADX WARN: Code duplicated, block: B:408:0x1b0b  */
    /* JADX WARN: Code duplicated, block: B:435:0x1c52  */
    /* JADX WARN: Code duplicated, block: B:439:0x1cb9  */
    /* JADX WARN: Code duplicated, block: B:441:0x1cc6  */
    /* JADX WARN: Code duplicated, block: B:443:0x1cc9  */
    /* JADX WARN: Code duplicated, block: B:445:0x1ccc  */
    /* JADX WARN: Code duplicated, block: B:447:0x1ccf  */
    /* JADX WARN: Code duplicated, block: B:449:0x1d1c  */
    /* JADX WARN: Code duplicated, block: B:451:0x1d22  */
    /* JADX WARN: Code duplicated, block: B:453:0x1d71  */
    /* JADX WARN: Code duplicated, block: B:455:0x1dc2  */
    /* JADX WARN: Code duplicated, block: B:476:0x1f26  */
    /* JADX WARN: Code duplicated, block: B:480:0x1f89  */
    /* JADX WARN: Code duplicated, block: B:482:0x1f96  */
    /* JADX WARN: Code duplicated, block: B:484:0x1f99  */
    /* JADX WARN: Code duplicated, block: B:486:0x1f9c  */
    /* JADX WARN: Code duplicated, block: B:488:0x1f9f  */
    /* JADX WARN: Code duplicated, block: B:490:0x1ff0  */
    /* JADX WARN: Code duplicated, block: B:492:0x1ff6  */
    /* JADX WARN: Code duplicated, block: B:494:0x2040  */
    /* JADX WARN: Code duplicated, block: B:496:0x2091  */
    /* JADX WARN: Code duplicated, block: B:517:0x21ee  */
    /* JADX WARN: Code duplicated, block: B:521:0x2257  */
    /* JADX WARN: Code duplicated, block: B:523:0x2264  */
    /* JADX WARN: Code duplicated, block: B:525:0x2267  */
    /* JADX WARN: Code duplicated, block: B:527:0x226a  */
    /* JADX WARN: Code duplicated, block: B:530:0x226f  */
    /* JADX WARN: Code duplicated, block: B:532:0x2275  */
    /* JADX WARN: Code duplicated, block: B:534:0x22c4  */
    /* JADX WARN: Code duplicated, block: B:536:0x2315  */
    /* JADX WARN: Code duplicated, block: B:562:0x24aa  */
    /* JADX WARN: Code duplicated, block: B:576:0x25ba  */
    /* JADX WARN: Code duplicated, block: B:578:0x25c7  */
    /* JADX WARN: Code duplicated, block: B:580:0x25ca  */
    /* JADX WARN: Code duplicated, block: B:582:0x25cd  */
    /* JADX WARN: Code duplicated, block: B:585:0x25d2  */
    /* JADX WARN: Code duplicated, block: B:587:0x25d8  */
    /* JADX WARN: Code duplicated, block: B:589:0x2625  */
    /* JADX WARN: Code duplicated, block: B:591:0x2674  */
    /* JADX WARN: Code duplicated, block: B:606:0x2758  */
    /* JADX WARN: Code duplicated, block: B:620:0x28ba  */
    /* JADX WARN: Code duplicated, block: B:625:0x2923  */
    /* JADX WARN: Code duplicated, block: B:627:0x2927  */
    /* JADX WARN: Code duplicated, block: B:629:0x292a  */
    /* JADX WARN: Code duplicated, block: B:631:0x2935  */
    /* JADX WARN: Code duplicated, block: B:633:0x2938  */
    /* JADX WARN: Code duplicated, block: B:635:0x293b  */
    /* JADX WARN: Code duplicated, block: B:637:0x293e  */
    /* JADX WARN: Code duplicated, block: B:639:0x2941  */
    /* JADX WARN: Code duplicated, block: B:641:0x298e  */
    /* JADX WARN: Code duplicated, block: B:643:0x2994  */
    /* JADX WARN: Code duplicated, block: B:645:0x29e3  */
    /* JADX WARN: Code duplicated, block: B:647:0x2a34  */
    /* JADX WARN: Code duplicated, block: B:682:0x2bba  */
    /* JADX WARN: Code duplicated, block: B:702:0x2cb2  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x199d, code lost:
    
        if (r4 == r6) goto L701;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x1b2a, code lost:
    
        if (r4 == r6) goto L701;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(app.chalo.home.domain.ChaloUserBookingType r59, app.chalo.data.RefundInfoAppModel r60, kotlin.jvm.functions.Function1 r61, kotlin.coroutines.jvm.internal.ContinuationImpl r62) {
        /*
            Method dump skipped, instruction units count: 11820
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productsummary.ui.domain.GetProductStatusUIForSummaryScreen.d(app.chalo.home.domain.ChaloUserBookingType, app.chalo.data.RefundInfoAppModel, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
