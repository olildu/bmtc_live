package app.chalo.features.checkout;

import defpackage.go;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/features/checkout/CheckoutProductData;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class CheckoutProductData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new go(20)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckoutProductType f2695a;
    public final boolean b;
    public final CheckoutAnalyticsData c;
    public final String d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/features/checkout/CheckoutProductData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/features/checkout/CheckoutProductData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<CheckoutProductData> serializer() {
            return CheckoutProductData$$serializer.f2696a;
        }
    }

    public CheckoutProductData(CheckoutProductType type, boolean z, CheckoutAnalyticsData checkoutAnalyticsData) {
        Intrinsics.i(type, "type");
        this.f2695a = type;
        this.b = z;
        this.c = checkoutAnalyticsData;
        this.d = "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutProductData)) {
            return false;
        }
        CheckoutProductData checkoutProductData = (CheckoutProductData) obj;
        return this.f2695a == checkoutProductData.f2695a && this.b == checkoutProductData.b && Intrinsics.d(this.c, checkoutProductData.c) && Intrinsics.d(this.d, checkoutProductData.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (((this.f2695a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31)) * 31);
    }

    public final String toString() {
        return "CheckoutProductData(type=" + this.f2695a + ", isCashPaymentAllowed=" + this.b + ", analyticsData=" + this.c + ", sourceScreen=" + this.d + ")";
    }

    public /* synthetic */ CheckoutProductData(int i, CheckoutProductType checkoutProductType, boolean z, CheckoutAnalyticsData checkoutAnalyticsData, String str) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(CheckoutProductData$$serializer.f2696a.getDescriptor(), i, 7);
            throw null;
        }
        this.f2695a = checkoutProductType;
        this.b = z;
        this.c = checkoutAnalyticsData;
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str;
        }
    }
}
