package app.chalo.features.checkout;

import defpackage.ul;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/features/checkout/CheckoutAnalyticsData;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class CheckoutAnalyticsData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] c = {null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ul(19))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2683a;
    public final Map b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/features/checkout/CheckoutAnalyticsData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/features/checkout/CheckoutAnalyticsData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<CheckoutAnalyticsData> serializer() {
            return CheckoutAnalyticsData$$serializer.f2684a;
        }
    }

    public /* synthetic */ CheckoutAnalyticsData(int i, String str, Map map) {
        this.f2683a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = MapsKt.d();
        } else {
            this.b = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutAnalyticsData)) {
            return false;
        }
        CheckoutAnalyticsData checkoutAnalyticsData = (CheckoutAnalyticsData) obj;
        return Intrinsics.d(this.f2683a, checkoutAnalyticsData.f2683a) && Intrinsics.d(this.b, checkoutAnalyticsData.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f2683a.hashCode() * 31);
    }

    public final String toString() {
        return "CheckoutAnalyticsData(sourceScreen=" + this.f2683a + ", productEventProperties=" + this.b + ")";
    }

    public CheckoutAnalyticsData(String sourceScreen, Map map) {
        Intrinsics.i(sourceScreen, "sourceScreen");
        this.f2683a = sourceScreen;
        this.b = map;
    }
}
