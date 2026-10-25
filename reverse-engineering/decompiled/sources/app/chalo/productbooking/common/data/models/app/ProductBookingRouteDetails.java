package app.chalo.productbooking.common.data.models.app;

import defpackage.dd;
import defpackage.mx0;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.r30;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productbooking/common/data/models/app/ProductBookingRouteDetails;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ProductBookingRouteDetails {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8194a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;
    public final boolean f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/common/data/models/app/ProductBookingRouteDetails$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/data/models/app/ProductBookingRouteDetails;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ProductBookingRouteDetails> serializer() {
            return ProductBookingRouteDetails$$serializer.f8195a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new Lazy[]{null, null, null, LazyKt.a(lazyThreadSafetyMode, new mx0(0)), LazyKt.a(lazyThreadSafetyMode, new mx0(1)), null};
    }

    public /* synthetic */ ProductBookingRouteDetails(int i, String str, String str2, String str3, List list, List list2, boolean z) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.b(ProductBookingRouteDetails$$serializer.f8195a.getDescriptor(), i, 63);
            throw null;
        }
        this.f8194a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductBookingRouteDetails)) {
            return false;
        }
        ProductBookingRouteDetails productBookingRouteDetails = (ProductBookingRouteDetails) obj;
        return Intrinsics.d(this.f8194a, productBookingRouteDetails.f8194a) && Intrinsics.d(this.b, productBookingRouteDetails.b) && Intrinsics.d(this.c, productBookingRouteDetails.c) && Intrinsics.d(this.d, productBookingRouteDetails.d) && Intrinsics.d(this.e, productBookingRouteDetails.e) && this.f == productBookingRouteDetails.f;
    }

    public final int hashCode() {
        return r30.b(r30.b(nf1.e(nf1.e(this.f8194a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e) + (this.f ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("ProductBookingRouteDetails(routeId=", this.f8194a, ", routeName=", this.b, ", agencyName=");
        pk0.w(this.c, ", specialFeatures=", ", stopList=", sbE, this.d);
        sbE.append(this.e);
        sbE.append(", isFreeRideAvailable=");
        sbE.append(this.f);
        sbE.append(")");
        return sbE.toString();
    }

    public ProductBookingRouteDetails(String routeId, String routeName, String agencyName, List specialFeatures, List stopList, boolean z) {
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(agencyName, "agencyName");
        Intrinsics.i(specialFeatures, "specialFeatures");
        Intrinsics.i(stopList, "stopList");
        this.f8194a = routeId;
        this.b = routeName;
        this.c = agencyName;
        this.d = specialFeatures;
        this.e = stopList;
        this.f = z;
    }
}
