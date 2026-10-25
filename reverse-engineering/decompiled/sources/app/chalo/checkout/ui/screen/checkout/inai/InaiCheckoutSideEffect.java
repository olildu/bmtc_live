package app.chalo.checkout.ui.screen.checkout.inai;

import app.chalo.checkout.paymentprovider.inai.InaiSdkCheckout;
import defpackage.d;
import defpackage.vo1;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/inai/InaiCheckoutSideEffect;", "", "InitiatePayment", "Lapp/chalo/checkout/ui/screen/checkout/inai/InaiCheckoutSideEffect$InitiatePayment;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class InaiCheckoutSideEffect {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/inai/InaiCheckoutSideEffect$InitiatePayment;", "Lapp/chalo/checkout/ui/screen/checkout/inai/InaiCheckoutSideEffect;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitiatePayment extends InaiCheckoutSideEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InaiSdkCheckout f1473a;
        public final Map b;
        public final String c;

        public InitiatePayment(InaiSdkCheckout inaiCheckout, Map paymentsData, String paymentMethodCode) {
            Intrinsics.i(inaiCheckout, "inaiCheckout");
            Intrinsics.i(paymentsData, "paymentsData");
            Intrinsics.i(paymentMethodCode, "paymentMethodCode");
            this.f1473a = inaiCheckout;
            this.b = paymentsData;
            this.c = paymentMethodCode;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitiatePayment)) {
                return false;
            }
            InitiatePayment initiatePayment = (InitiatePayment) obj;
            return Intrinsics.d(this.f1473a, initiatePayment.f1473a) && Intrinsics.d(this.b, initiatePayment.b) && Intrinsics.d(this.c, initiatePayment.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + d.f(this.b, this.f1473a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InitiatePayment(inaiCheckout=");
            sb.append(this.f1473a);
            sb.append(", paymentsData=");
            sb.append(this.b);
            sb.append(", paymentMethodCode=");
            return vo1.p(sb, this.c, ")");
        }
    }
}
