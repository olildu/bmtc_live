package app.chalo.checkout.ui.screen.payment;

import app.chalo.checkout.data.resolver.PaymentInfoState;
import app.chalo.features.checkout.CheckoutPaymentData;
import app.chalo.features.checkout.CheckoutProductData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/CheckoutRestoredState;", "", "Companion", "$serializer", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class CheckoutRestoredState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckoutPaymentData f1510a;
    public final CheckoutProductData b;
    public final PaymentInfoState c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/CheckoutRestoredState$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/checkout/ui/screen/payment/CheckoutRestoredState;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<CheckoutRestoredState> serializer() {
            return CheckoutRestoredState$$serializer.f1511a;
        }
    }

    public /* synthetic */ CheckoutRestoredState(int i, CheckoutPaymentData checkoutPaymentData, CheckoutProductData checkoutProductData, PaymentInfoState paymentInfoState) {
        if ((i & 1) == 0) {
            this.f1510a = null;
        } else {
            this.f1510a = checkoutPaymentData;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = checkoutProductData;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = paymentInfoState;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutRestoredState)) {
            return false;
        }
        CheckoutRestoredState checkoutRestoredState = (CheckoutRestoredState) obj;
        return Intrinsics.d(this.f1510a, checkoutRestoredState.f1510a) && Intrinsics.d(this.b, checkoutRestoredState.b) && Intrinsics.d(this.c, checkoutRestoredState.c);
    }

    public final int hashCode() {
        CheckoutPaymentData checkoutPaymentData = this.f1510a;
        int iHashCode = (checkoutPaymentData == null ? 0 : checkoutPaymentData.hashCode()) * 31;
        CheckoutProductData checkoutProductData = this.b;
        int iHashCode2 = (iHashCode + (checkoutProductData == null ? 0 : checkoutProductData.hashCode())) * 31;
        PaymentInfoState paymentInfoState = this.c;
        return iHashCode2 + (paymentInfoState != null ? paymentInfoState.hashCode() : 0);
    }

    public final String toString() {
        return "CheckoutRestoredState(checkoutPaymentData=" + this.f1510a + ", checkoutProductData=" + this.b + ", paymentInfoState=" + this.c + ")";
    }

    public CheckoutRestoredState(CheckoutPaymentData checkoutPaymentData, CheckoutProductData checkoutProductData, PaymentInfoState paymentInfoState) {
        this.f1510a = checkoutPaymentData;
        this.b = checkoutProductData;
        this.c = paymentInfoState;
    }
}
