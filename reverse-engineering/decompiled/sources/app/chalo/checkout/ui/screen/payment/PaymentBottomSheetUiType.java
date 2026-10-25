package app.chalo.checkout.ui.screen.payment;

import androidx.compose.ui.unit.Dp;
import androidx.media3.extractor.ts.TsExtractor;
import app.chalo.providers.lottieassetprovider.LottieType;
import app.chalo.uistate.bottomsheet.BottomSheetStandardContentUiState;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.image.GifImageUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.b3;
import defpackage.hq0;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentBottomSheetUiType;", "", "ChaloPayLowBalanceBottomsheetUiState", "ChaloWalletBlockedBottomsheetUiState", "PaymentStatusBottomSheetUiState", "InAppUpiSmsPermissionBottomSheetUiState", "Lapp/chalo/checkout/ui/screen/payment/PaymentBottomSheetUiType$ChaloPayLowBalanceBottomsheetUiState;", "Lapp/chalo/checkout/ui/screen/payment/PaymentBottomSheetUiType$ChaloWalletBlockedBottomsheetUiState;", "Lapp/chalo/checkout/ui/screen/payment/PaymentBottomSheetUiType$InAppUpiSmsPermissionBottomSheetUiState;", "Lapp/chalo/checkout/ui/screen/payment/PaymentBottomSheetUiType$PaymentStatusBottomSheetUiState;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PaymentBottomSheetUiType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentBottomSheetUiType$ChaloPayLowBalanceBottomsheetUiState;", "Lapp/chalo/checkout/ui/screen/payment/PaymentBottomSheetUiType;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ChaloPayLowBalanceBottomsheetUiState extends PaymentBottomSheetUiType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LowBalanceBottomSheetSpecs f1523a;
        public final GifImageUIState b;
        public final TextUIState.ChaloTextUIState c;
        public final TextUIState.ChaloTextUIState d;
        public final ButtonUIState e;
        public final TextUIState.StyledTextUIState f;
        public final boolean g;

        public ChaloPayLowBalanceBottomsheetUiState(TextUIState.ChaloTextUIState amountEnteredUiState, TextUIState.ChaloTextUIState walletBalanceUiState, ButtonUIState rechargeWalletBtn, TextUIState.StyledTextUIState tncUiState, boolean z) {
            LowBalanceBottomSheetSpecs lowBalanceBottomSheetSpecs = new LowBalanceBottomSheetSpecs();
            GifImageUIState gifImageUIState = new GifImageUIState(LottieType.CHALO_PAY_LOW_BALANCE, 1, new ImageUISize(Dp.m7276boximpl(Dp.m7278constructorimpl(150)), Dp.m7276boximpl(Dp.m7278constructorimpl(TsExtractor.TS_STREAM_TYPE_SPLICE_INFO))));
            Intrinsics.i(amountEnteredUiState, "amountEnteredUiState");
            Intrinsics.i(walletBalanceUiState, "walletBalanceUiState");
            Intrinsics.i(rechargeWalletBtn, "rechargeWalletBtn");
            Intrinsics.i(tncUiState, "tncUiState");
            this.f1523a = lowBalanceBottomSheetSpecs;
            this.b = gifImageUIState;
            this.c = amountEnteredUiState;
            this.d = walletBalanceUiState;
            this.e = rechargeWalletBtn;
            this.f = tncUiState;
            this.g = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChaloPayLowBalanceBottomsheetUiState)) {
                return false;
            }
            ChaloPayLowBalanceBottomsheetUiState chaloPayLowBalanceBottomsheetUiState = (ChaloPayLowBalanceBottomsheetUiState) obj;
            return Intrinsics.d(this.f1523a, chaloPayLowBalanceBottomsheetUiState.f1523a) && Intrinsics.d(this.b, chaloPayLowBalanceBottomsheetUiState.b) && Intrinsics.d(this.c, chaloPayLowBalanceBottomsheetUiState.c) && Intrinsics.d(this.d, chaloPayLowBalanceBottomsheetUiState.d) && Intrinsics.d(this.e, chaloPayLowBalanceBottomsheetUiState.e) && Intrinsics.d(this.f, chaloPayLowBalanceBottomsheetUiState.f) && this.g == chaloPayLowBalanceBottomsheetUiState.g;
        }

        public final int hashCode() {
            int iHashCode = this.f1523a.hashCode() * 31;
            GifImageUIState gifImageUIState = this.b;
            return ((this.f.hashCode() + r30.d(this.e, r30.f(this.d, r30.f(this.c, (iHashCode + (gifImageUIState == null ? 0 : gifImageUIState.hashCode())) * 31, 31), 31), 31)) * 31) + (this.g ? 1231 : 1237);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChaloPayLowBalanceBottomsheetUiState(specs=");
            sb.append(this.f1523a);
            sb.append(", gif=");
            sb.append(this.b);
            sb.append(", amountEnteredUiState=");
            r30.p(sb, this.c, ", walletBalanceUiState=", this.d, ", rechargeWalletBtn=");
            sb.append(this.e);
            sb.append(", tncUiState=");
            sb.append(this.f);
            sb.append(", shouldShowYesBankBranding=");
            return b3.g(")", sb, this.g);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentBottomSheetUiType$ChaloWalletBlockedBottomsheetUiState;", "Lapp/chalo/checkout/ui/screen/payment/PaymentBottomSheetUiType;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ChaloWalletBlockedBottomsheetUiState extends PaymentBottomSheetUiType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WalletBlockedBottomSheetSpecs f1524a;
        public final ImageUIState b;
        public final TextUIState.ChaloTextUIState c;
        public final TextUIState.ChaloTextUIState d;
        public final ButtonUIState e;

        public ChaloWalletBlockedBottomsheetUiState(ButtonUIState buttonUIState, ImageUIState image, TextUIState.ChaloTextUIState title, TextUIState.ChaloTextUIState subTitle) {
            WalletBlockedBottomSheetSpecs walletBlockedBottomSheetSpecs = new WalletBlockedBottomSheetSpecs();
            Intrinsics.i(image, "image");
            Intrinsics.i(title, "title");
            Intrinsics.i(subTitle, "subTitle");
            this.f1524a = walletBlockedBottomSheetSpecs;
            this.b = image;
            this.c = title;
            this.d = subTitle;
            this.e = buttonUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChaloWalletBlockedBottomsheetUiState)) {
                return false;
            }
            ChaloWalletBlockedBottomsheetUiState chaloWalletBlockedBottomsheetUiState = (ChaloWalletBlockedBottomsheetUiState) obj;
            return Intrinsics.d(this.f1524a, chaloWalletBlockedBottomsheetUiState.f1524a) && Intrinsics.d(this.b, chaloWalletBlockedBottomsheetUiState.b) && Intrinsics.d(this.c, chaloWalletBlockedBottomsheetUiState.c) && Intrinsics.d(this.d, chaloWalletBlockedBottomsheetUiState.d) && Intrinsics.d(this.e, chaloWalletBlockedBottomsheetUiState.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + r30.f(this.d, r30.f(this.c, r30.e(this.b, this.f1524a.hashCode() * 31, 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChaloWalletBlockedBottomsheetUiState(specs=");
            sb.append(this.f1524a);
            sb.append(", image=");
            sb.append(this.b);
            sb.append(", title=");
            r30.p(sb, this.c, ", subTitle=", this.d, ", positiveBtn=");
            return hq0.j(sb, this.e, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentBottomSheetUiType$InAppUpiSmsPermissionBottomSheetUiState;", "Lapp/chalo/checkout/ui/screen/payment/PaymentBottomSheetUiType;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InAppUpiSmsPermissionBottomSheetUiState extends PaymentBottomSheetUiType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BottomSheetStandardContentUiState f1525a;

        public InAppUpiSmsPermissionBottomSheetUiState(BottomSheetStandardContentUiState bottomSheetStandardContentUiState) {
            this.f1525a = bottomSheetStandardContentUiState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InAppUpiSmsPermissionBottomSheetUiState) && Intrinsics.d(this.f1525a, ((InAppUpiSmsPermissionBottomSheetUiState) obj).f1525a);
        }

        public final int hashCode() {
            return this.f1525a.hashCode();
        }

        public final String toString() {
            return "InAppUpiSmsPermissionBottomSheetUiState(data=" + this.f1525a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentBottomSheetUiType$PaymentStatusBottomSheetUiState;", "Lapp/chalo/checkout/ui/screen/payment/PaymentBottomSheetUiType;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaymentStatusBottomSheetUiState extends PaymentBottomSheetUiType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BottomSheetStandardContentUiState f1526a;

        public PaymentStatusBottomSheetUiState(BottomSheetStandardContentUiState bottomSheetStandardContentUiState) {
            this.f1526a = bottomSheetStandardContentUiState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PaymentStatusBottomSheetUiState) && Intrinsics.d(this.f1526a, ((PaymentStatusBottomSheetUiState) obj).f1526a);
        }

        public final int hashCode() {
            return this.f1526a.hashCode();
        }

        public final String toString() {
            return "PaymentStatusBottomSheetUiState(data=" + this.f1526a + ")";
        }
    }
}
