package app.chalo.productbooking.common.data.models.app;

import app.chalo.productbooking.common.data.models.api.response.ProductConfigGstApiResponseModel;
import defpackage.gf;
import defpackage.hq0;
import defpackage.ox0;
import defpackage.pk0;
import defpackage.xs;
import java.util.ArrayList;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productbooking/common/data/models/app/ProductConfigFareMappingAppModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ProductConfigFareMappingAppModel {
    public static final Lazy[] B;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public final List A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductConfigGstApiResponseModel f8215a;
    public final String b;
    public final String c;
    public final Integer d;
    public final Integer e;
    public final Boolean f;
    public final String g;
    public final Boolean h;
    public final String i;
    public final Integer j;
    public final String k;
    public final Boolean l;
    public final Boolean m;
    public final String n;
    public final Integer o;
    public final String p;
    public final Integer q;
    public final Integer r;
    public final Integer s;
    public final boolean t;
    public final List u;
    public final Integer v;
    public final Integer w;
    public final ProductConfigFareInfoAppModel x;
    public final String y;
    public final List z;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/common/data/models/app/ProductConfigFareMappingAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/data/models/app/ProductConfigFareMappingAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ProductConfigFareMappingAppModel> serializer() {
            return ProductConfigFareMappingAppModel$$serializer.f8216a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        B = new Lazy[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new ox0(3)), null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new ox0(4)), LazyKt.a(lazyThreadSafetyMode, new ox0(5))};
    }

    public /* synthetic */ ProductConfigFareMappingAppModel(int i, ProductConfigGstApiResponseModel productConfigGstApiResponseModel, String str, String str2, Integer num, Integer num2, Boolean bool, String str3, Boolean bool2, String str4, Integer num3, String str5, Boolean bool3, Boolean bool4, String str6, Integer num4, String str7, Integer num5, Integer num6, Integer num7, boolean z, List list, Integer num8, Integer num9, ProductConfigFareInfoAppModel productConfigFareInfoAppModel, String str8, List list2, List list3) {
        if (134217727 != (i & 134217727)) {
            PluginExceptionsKt.b(ProductConfigFareMappingAppModel$$serializer.f8216a.getDescriptor(), i, 134217727);
            throw null;
        }
        this.f8215a = productConfigGstApiResponseModel;
        this.b = str;
        this.c = str2;
        this.d = num;
        this.e = num2;
        this.f = bool;
        this.g = str3;
        this.h = bool2;
        this.i = str4;
        this.j = num3;
        this.k = str5;
        this.l = bool3;
        this.m = bool4;
        this.n = str6;
        this.o = num4;
        this.p = str7;
        this.q = num5;
        this.r = num6;
        this.s = num7;
        this.t = z;
        this.u = list;
        this.v = num8;
        this.w = num9;
        this.x = productConfigFareInfoAppModel;
        this.y = str8;
        this.z = list2;
        this.A = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductConfigFareMappingAppModel)) {
            return false;
        }
        ProductConfigFareMappingAppModel productConfigFareMappingAppModel = (ProductConfigFareMappingAppModel) obj;
        return Intrinsics.d(this.f8215a, productConfigFareMappingAppModel.f8215a) && Intrinsics.d(this.b, productConfigFareMappingAppModel.b) && Intrinsics.d(this.c, productConfigFareMappingAppModel.c) && Intrinsics.d(this.d, productConfigFareMappingAppModel.d) && Intrinsics.d(this.e, productConfigFareMappingAppModel.e) && Intrinsics.d(this.f, productConfigFareMappingAppModel.f) && Intrinsics.d(this.g, productConfigFareMappingAppModel.g) && Intrinsics.d(this.h, productConfigFareMappingAppModel.h) && Intrinsics.d(this.i, productConfigFareMappingAppModel.i) && Intrinsics.d(this.j, productConfigFareMappingAppModel.j) && Intrinsics.d(this.k, productConfigFareMappingAppModel.k) && Intrinsics.d(this.l, productConfigFareMappingAppModel.l) && Intrinsics.d(this.m, productConfigFareMappingAppModel.m) && Intrinsics.d(this.n, productConfigFareMappingAppModel.n) && Intrinsics.d(this.o, productConfigFareMappingAppModel.o) && Intrinsics.d(this.p, productConfigFareMappingAppModel.p) && Intrinsics.d(this.q, productConfigFareMappingAppModel.q) && Intrinsics.d(this.r, productConfigFareMappingAppModel.r) && Intrinsics.d(this.s, productConfigFareMappingAppModel.s) && this.t == productConfigFareMappingAppModel.t && Intrinsics.d(this.u, productConfigFareMappingAppModel.u) && Intrinsics.d(this.v, productConfigFareMappingAppModel.v) && Intrinsics.d(this.w, productConfigFareMappingAppModel.w) && Intrinsics.d(this.x, productConfigFareMappingAppModel.x) && Intrinsics.d(this.y, productConfigFareMappingAppModel.y) && Intrinsics.d(this.z, productConfigFareMappingAppModel.z) && Intrinsics.d(this.A, productConfigFareMappingAppModel.A);
    }

    public final int hashCode() {
        ProductConfigGstApiResponseModel productConfigGstApiResponseModel = this.f8215a;
        int iHashCode = (productConfigGstApiResponseModel == null ? 0 : productConfigGstApiResponseModel.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.f;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool2 = this.h;
        int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str4 = this.i;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num3 = this.j;
        int iHashCode10 = (iHashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str5 = this.k;
        int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool3 = this.l;
        int iHashCode12 = (iHashCode11 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.m;
        int iHashCode13 = (iHashCode12 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str6 = this.n;
        int iHashCode14 = (iHashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num4 = this.o;
        int iHashCode15 = (iHashCode14 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str7 = this.p;
        int iHashCode16 = (iHashCode15 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num5 = this.q;
        int iHashCode17 = (iHashCode16 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.r;
        int iHashCode18 = (iHashCode17 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.s;
        int iHashCode19 = (((iHashCode18 + (num7 == null ? 0 : num7.hashCode())) * 31) + (this.t ? 1231 : 1237)) * 31;
        List list = this.u;
        int iHashCode20 = (iHashCode19 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num8 = this.v;
        int iHashCode21 = (iHashCode20 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.w;
        int iHashCode22 = (this.x.hashCode() + ((iHashCode21 + (num9 == null ? 0 : num9.hashCode())) * 31)) * 31;
        String str8 = this.y;
        int iHashCode23 = (iHashCode22 + (str8 == null ? 0 : str8.hashCode())) * 31;
        List list2 = this.z;
        int iHashCode24 = (iHashCode23 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.A;
        return iHashCode24 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductConfigFareMappingAppModel(gst=");
        sb.append(this.f8215a);
        sb.append(", desc=");
        sb.append(this.b);
        sb.append(", fare=");
        xs.u(this.d, this.c, ", fmId=", ", subsidy=", sb);
        sb.append(this.e);
        sb.append(", isActive=");
        sb.append(this.f);
        sb.append(", subCatId=");
        gf.v(this.h, this.g, ", isVisible=", ", durationId=", sb);
        xs.u(this.j, this.i, ", numOfTrips=", ", displayName=", sb);
        gf.v(this.l, this.k, ", isRenewable=", ", verification=", sb);
        hq0.t(this.m, ", etimProductId=", this.n, ", convenienceFee=", sb);
        gf.w(this.o, ", discountedFare=", this.p, ", maxTripsPerDay=", sb);
        pk0.y(sb, this.q, ", chaloCommission=", this.r, ", maxPricePerTrip=");
        sb.append(this.s);
        sb.append(", isProofRequired=");
        sb.append(this.t);
        sb.append(", specialFeatures=");
        sb.append(this.u);
        sb.append(", agencyCommission=");
        sb.append(this.v);
        sb.append(", discountedPercentage=");
        sb.append(this.w);
        sb.append(", fareInfo=");
        sb.append(this.x);
        sb.append(", dInfo=");
        pk0.w(this.y, ", tags=", ", appliedRules=", sb, this.z);
        return xs.l(sb, this.A, ")");
    }

    public ProductConfigFareMappingAppModel(ProductConfigGstApiResponseModel productConfigGstApiResponseModel, String str, String str2, Integer num, Integer num2, Boolean bool, String str3, Boolean bool2, String str4, Integer num3, String str5, Boolean bool3, Boolean bool4, String str6, Integer num4, String str7, Integer num5, Integer num6, Integer num7, boolean z, List list, Integer num8, Integer num9, ProductConfigFareInfoAppModel productConfigFareInfoAppModel, String str8, ArrayList arrayList, ArrayList arrayList2) {
        this.f8215a = productConfigGstApiResponseModel;
        this.b = str;
        this.c = str2;
        this.d = num;
        this.e = num2;
        this.f = bool;
        this.g = str3;
        this.h = bool2;
        this.i = str4;
        this.j = num3;
        this.k = str5;
        this.l = bool3;
        this.m = bool4;
        this.n = str6;
        this.o = num4;
        this.p = str7;
        this.q = num5;
        this.r = num6;
        this.s = num7;
        this.t = z;
        this.u = list;
        this.v = num8;
        this.w = num9;
        this.x = productConfigFareInfoAppModel;
        this.y = str8;
        this.z = arrayList;
        this.A = arrayList2;
    }
}
