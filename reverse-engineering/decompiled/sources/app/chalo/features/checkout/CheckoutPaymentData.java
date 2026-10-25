package app.chalo.features.checkout;

import app.chalo.models.ordercreation.OrderPaymentProviderInfoAppModel;
import defpackage.nf1;
import defpackage.ul;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/features/checkout/CheckoutPaymentData;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class CheckoutPaymentData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] f = {null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ul(24)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckoutOrderData f2691a;
    public final CheckoutUserDetails b;
    public final String c;
    public final OrderPaymentProviderInfoAppModel d;
    public final CheckoutPaymentProviderVpaConfig e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/features/checkout/CheckoutPaymentData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/features/checkout/CheckoutPaymentData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<CheckoutPaymentData> serializer() {
            return CheckoutPaymentData$$serializer.f2692a;
        }
    }

    public /* synthetic */ CheckoutPaymentData(int i, CheckoutOrderData checkoutOrderData, CheckoutUserDetails checkoutUserDetails, String str, OrderPaymentProviderInfoAppModel orderPaymentProviderInfoAppModel, CheckoutPaymentProviderVpaConfig checkoutPaymentProviderVpaConfig) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(CheckoutPaymentData$$serializer.f2692a.getDescriptor(), i, 15);
            throw null;
        }
        this.f2691a = checkoutOrderData;
        this.b = checkoutUserDetails;
        this.c = str;
        this.d = orderPaymentProviderInfoAppModel;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = checkoutPaymentProviderVpaConfig;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutPaymentData)) {
            return false;
        }
        CheckoutPaymentData checkoutPaymentData = (CheckoutPaymentData) obj;
        return Intrinsics.d(this.f2691a, checkoutPaymentData.f2691a) && Intrinsics.d(this.b, checkoutPaymentData.b) && Intrinsics.d(this.c, checkoutPaymentData.c) && Intrinsics.d(this.d, checkoutPaymentData.d) && Intrinsics.d(this.e, checkoutPaymentData.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + nf1.e((this.b.hashCode() + (this.f2691a.hashCode() * 31)) * 31, 31, this.c)) * 31;
        CheckoutPaymentProviderVpaConfig checkoutPaymentProviderVpaConfig = this.e;
        return iHashCode + (checkoutPaymentProviderVpaConfig == null ? 0 : checkoutPaymentProviderVpaConfig.hashCode());
    }

    public final String toString() {
        return "CheckoutPaymentData(orderData=" + this.f2691a + ", userDetails=" + this.b + ", agency=" + this.c + ", paymentProviderAppModel=" + this.d + ", paymentProviderVpaConfig=" + this.e + ")";
    }

    public CheckoutPaymentData(CheckoutOrderData checkoutOrderData, CheckoutUserDetails checkoutUserDetails, String agency, OrderPaymentProviderInfoAppModel paymentProviderAppModel, CheckoutPaymentProviderVpaConfig checkoutPaymentProviderVpaConfig) {
        Intrinsics.i(agency, "agency");
        Intrinsics.i(paymentProviderAppModel, "paymentProviderAppModel");
        this.f2691a = checkoutOrderData;
        this.b = checkoutUserDetails;
        this.c = agency;
        this.d = paymentProviderAppModel;
        this.e = checkoutPaymentProviderVpaConfig;
    }
}
