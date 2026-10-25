package app.chalo.features.checkout;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/features/checkout/CheckoutIntentModel;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class CheckoutIntentModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckoutPaymentData f2685a;
    public final CheckoutProductData b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/features/checkout/CheckoutIntentModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/features/checkout/CheckoutIntentModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<CheckoutIntentModel> serializer() {
            return CheckoutIntentModel$$serializer.f2686a;
        }
    }

    public /* synthetic */ CheckoutIntentModel(int i, CheckoutPaymentData checkoutPaymentData, CheckoutProductData checkoutProductData) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(CheckoutIntentModel$$serializer.f2686a.getDescriptor(), i, 3);
            throw null;
        }
        this.f2685a = checkoutPaymentData;
        this.b = checkoutProductData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutIntentModel)) {
            return false;
        }
        CheckoutIntentModel checkoutIntentModel = (CheckoutIntentModel) obj;
        return Intrinsics.d(this.f2685a, checkoutIntentModel.f2685a) && Intrinsics.d(this.b, checkoutIntentModel.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f2685a.hashCode() * 31);
    }

    public final String toString() {
        return "CheckoutIntentModel(paymentData=" + this.f2685a + ", productData=" + this.b + ")";
    }

    public CheckoutIntentModel(CheckoutPaymentData checkoutPaymentData, CheckoutProductData checkoutProductData) {
        this.f2685a = checkoutPaymentData;
        this.b = checkoutProductData;
    }
}
