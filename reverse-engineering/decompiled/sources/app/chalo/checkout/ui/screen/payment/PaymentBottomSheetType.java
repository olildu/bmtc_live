package app.chalo.checkout.ui.screen.payment;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentBottomSheetType;", "", "ChaloPayLowBalanceBottomsheet", "ChaloWalletBlockedBottomsheet", "InAppUpiSmsPermissionBottomSheet", "PaymentStatusBottomSheet", "Lapp/chalo/checkout/ui/screen/payment/PaymentBottomSheetType$ChaloPayLowBalanceBottomsheet;", "Lapp/chalo/checkout/ui/screen/payment/PaymentBottomSheetType$ChaloWalletBlockedBottomsheet;", "Lapp/chalo/checkout/ui/screen/payment/PaymentBottomSheetType$InAppUpiSmsPermissionBottomSheet;", "Lapp/chalo/checkout/ui/screen/payment/PaymentBottomSheetType$PaymentStatusBottomSheet;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PaymentBottomSheetType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentBottomSheetType$ChaloPayLowBalanceBottomsheet;", "Lapp/chalo/checkout/ui/screen/payment/PaymentBottomSheetType;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ChaloPayLowBalanceBottomsheet extends PaymentBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ChaloPayLowBalanceBottomsheet f1519a = new ChaloPayLowBalanceBottomsheet();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentBottomSheetType$ChaloWalletBlockedBottomsheet;", "Lapp/chalo/checkout/ui/screen/payment/PaymentBottomSheetType;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ChaloWalletBlockedBottomsheet extends PaymentBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ChaloWalletBlockedBottomsheet f1520a = new ChaloWalletBlockedBottomsheet();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentBottomSheetType$InAppUpiSmsPermissionBottomSheet;", "Lapp/chalo/checkout/ui/screen/payment/PaymentBottomSheetType;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InAppUpiSmsPermissionBottomSheet extends PaymentBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InAppUpiSmsPermissionBottomSheet f1521a = new InAppUpiSmsPermissionBottomSheet();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentBottomSheetType$PaymentStatusBottomSheet;", "Lapp/chalo/checkout/ui/screen/payment/PaymentBottomSheetType;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaymentStatusBottomSheet extends PaymentBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PaymentStatusAlertDetails f1522a;

        public PaymentStatusBottomSheet(PaymentStatusAlertDetails paymentStatusAlertDetails) {
            this.f1522a = paymentStatusAlertDetails;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PaymentStatusBottomSheet) && Intrinsics.d(this.f1522a, ((PaymentStatusBottomSheet) obj).f1522a);
        }

        public final int hashCode() {
            return this.f1522a.hashCode();
        }

        public final String toString() {
            return "PaymentStatusBottomSheet(data=" + this.f1522a + ")";
        }
    }
}
