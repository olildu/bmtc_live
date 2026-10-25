package app.chalo.checkout.ui.screen.payment;

import app.chalo.checkout.paymentprovider.inai.InaiSdkCheckout;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentSideEffect;", "", "InaiFetchInstalledUpiAppsSideEffect", "Lapp/chalo/checkout/ui/screen/payment/PaymentSideEffect$InaiFetchInstalledUpiAppsSideEffect;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PaymentSideEffect {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentSideEffect$InaiFetchInstalledUpiAppsSideEffect;", "Lapp/chalo/checkout/ui/screen/payment/PaymentSideEffect;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InaiFetchInstalledUpiAppsSideEffect extends PaymentSideEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InaiSdkCheckout f1547a;
        public final LinkedHashMap b;

        public InaiFetchInstalledUpiAppsSideEffect(InaiSdkCheckout inaiCheckout, LinkedHashMap linkedHashMap) {
            Intrinsics.i(inaiCheckout, "inaiCheckout");
            this.f1547a = inaiCheckout;
            this.b = linkedHashMap;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InaiFetchInstalledUpiAppsSideEffect)) {
                return false;
            }
            InaiFetchInstalledUpiAppsSideEffect inaiFetchInstalledUpiAppsSideEffect = (InaiFetchInstalledUpiAppsSideEffect) obj;
            return Intrinsics.d(this.f1547a, inaiFetchInstalledUpiAppsSideEffect.f1547a) && this.b.equals(inaiFetchInstalledUpiAppsSideEffect.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f1547a.hashCode() * 31);
        }

        public final String toString() {
            return "InaiFetchInstalledUpiAppsSideEffect(inaiCheckout=" + this.f1547a + ", payload=" + this.b + ")";
        }
    }
}
