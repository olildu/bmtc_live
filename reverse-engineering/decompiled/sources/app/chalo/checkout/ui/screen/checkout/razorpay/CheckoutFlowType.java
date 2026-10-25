package app.chalo.checkout.ui.screen.checkout.razorpay;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/razorpay/CheckoutFlowType;", "", "Razorpay", "LazyPay", "Unknown", "Lapp/chalo/checkout/ui/screen/checkout/razorpay/CheckoutFlowType$LazyPay;", "Lapp/chalo/checkout/ui/screen/checkout/razorpay/CheckoutFlowType$Razorpay;", "Lapp/chalo/checkout/ui/screen/checkout/razorpay/CheckoutFlowType$Unknown;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CheckoutFlowType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/razorpay/CheckoutFlowType$LazyPay;", "Lapp/chalo/checkout/ui/screen/checkout/razorpay/CheckoutFlowType;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LazyPay extends CheckoutFlowType {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/razorpay/CheckoutFlowType$Razorpay;", "Lapp/chalo/checkout/ui/screen/checkout/razorpay/CheckoutFlowType;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Razorpay extends CheckoutFlowType {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Razorpay);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "Razorpay(selectedPaymentInstrumentData=null)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/razorpay/CheckoutFlowType$Unknown;", "Lapp/chalo/checkout/ui/screen/checkout/razorpay/CheckoutFlowType;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Unknown extends CheckoutFlowType {
    }
}
