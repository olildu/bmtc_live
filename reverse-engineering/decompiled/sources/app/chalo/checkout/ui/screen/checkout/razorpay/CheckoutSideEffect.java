package app.chalo.checkout.ui.screen.checkout.razorpay;

import defpackage.vo1;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/razorpay/CheckoutSideEffect;", "", "RazorpayFlowInitiated", "LazyPayFlowInitiated", "PaymentCancelled", "Lapp/chalo/checkout/ui/screen/checkout/razorpay/CheckoutSideEffect$LazyPayFlowInitiated;", "Lapp/chalo/checkout/ui/screen/checkout/razorpay/CheckoutSideEffect$PaymentCancelled;", "Lapp/chalo/checkout/ui/screen/checkout/razorpay/CheckoutSideEffect$RazorpayFlowInitiated;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CheckoutSideEffect {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/razorpay/CheckoutSideEffect$LazyPayFlowInitiated;", "Lapp/chalo/checkout/ui/screen/checkout/razorpay/CheckoutSideEffect;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LazyPayFlowInitiated extends CheckoutSideEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1484a;

        public LazyPayFlowInitiated(String url) {
            Intrinsics.i(url, "url");
            this.f1484a = url;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LazyPayFlowInitiated) && Intrinsics.d(this.f1484a, ((LazyPayFlowInitiated) obj).f1484a);
        }

        public final int hashCode() {
            return this.f1484a.hashCode();
        }

        public final String toString() {
            return vo1.B("LazyPayFlowInitiated(url=", this.f1484a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/razorpay/CheckoutSideEffect$PaymentCancelled;", "Lapp/chalo/checkout/ui/screen/checkout/razorpay/CheckoutSideEffect;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PaymentCancelled extends CheckoutSideEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PaymentCancelled f1485a = new PaymentCancelled();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/razorpay/CheckoutSideEffect$RazorpayFlowInitiated;", "Lapp/chalo/checkout/ui/screen/checkout/razorpay/CheckoutSideEffect;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RazorpayFlowInitiated extends CheckoutSideEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1486a;
        public final Map b;

        public RazorpayFlowInitiated(String razorpayKey, Map razorPayData) {
            Intrinsics.i(razorpayKey, "razorpayKey");
            Intrinsics.i(razorPayData, "razorPayData");
            this.f1486a = razorpayKey;
            this.b = razorPayData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RazorpayFlowInitiated)) {
                return false;
            }
            RazorpayFlowInitiated razorpayFlowInitiated = (RazorpayFlowInitiated) obj;
            return Intrinsics.d(this.f1486a, razorpayFlowInitiated.f1486a) && Intrinsics.d(this.b, razorpayFlowInitiated.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (((this.f1486a.hashCode() * 31) + 322841383) * 31);
        }

        public final String toString() {
            return "RazorpayFlowInitiated(razorpayKey=" + this.f1486a + ", url=about:blank, razorPayData=" + this.b + ")";
        }
    }
}
