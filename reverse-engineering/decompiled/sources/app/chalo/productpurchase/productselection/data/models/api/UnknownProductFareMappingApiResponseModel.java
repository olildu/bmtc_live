package app.chalo.productpurchase.productselection.data.models.api;

import defpackage.cb0;
import defpackage.dn1;
import defpackage.gf;
import defpackage.hq0;
import defpackage.ll1;
import defpackage.pk0;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/UnknownProductFareMappingApiResponseModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class UnknownProductFareMappingApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f8621a;
    public final String b;
    public final List c;
    public final Boolean d;
    public final Boolean e;
    public final Boolean f;
    public final Long g;
    public final Integer h;
    public final Integer i;
    public final Boolean j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final Integer o;
    public final String p;
    public final Integer q;
    public final Integer r;
    public final Double s;
    public final List t;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/UnknownProductFareMappingApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productpurchase/productselection/data/models/api/UnknownProductFareMappingApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<UnknownProductFareMappingApiResponseModel> serializer() {
            return UnknownProductFareMappingApiResponseModel$$serializer.f8622a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        u = new Lazy[]{null, null, LazyKt.a(lazyThreadSafetyMode, new ll1(29)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new dn1(0))};
    }

    public /* synthetic */ UnknownProductFareMappingApiResponseModel(int i, Integer num, String str, List list, Boolean bool, Boolean bool2, Boolean bool3, Long l, Integer num2, Integer num3, Boolean bool4, String str2, String str3, String str4, String str5, Integer num4, String str6, Integer num5, Integer num6, Double d, List list2) {
        if (1048575 != (i & 1048575)) {
            PluginExceptionsKt.b(UnknownProductFareMappingApiResponseModel$$serializer.f8622a.getDescriptor(), i, 1048575);
            throw null;
        }
        this.f8621a = num;
        this.b = str;
        this.c = list;
        this.d = bool;
        this.e = bool2;
        this.f = bool3;
        this.g = l;
        this.h = num2;
        this.i = num3;
        this.j = bool4;
        this.k = str2;
        this.l = str3;
        this.m = str4;
        this.n = str5;
        this.o = num4;
        this.p = str6;
        this.q = num5;
        this.r = num6;
        this.s = d;
        this.t = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnknownProductFareMappingApiResponseModel)) {
            return false;
        }
        UnknownProductFareMappingApiResponseModel unknownProductFareMappingApiResponseModel = (UnknownProductFareMappingApiResponseModel) obj;
        return Intrinsics.d(this.f8621a, unknownProductFareMappingApiResponseModel.f8621a) && Intrinsics.d(this.b, unknownProductFareMappingApiResponseModel.b) && Intrinsics.d(this.c, unknownProductFareMappingApiResponseModel.c) && Intrinsics.d(this.d, unknownProductFareMappingApiResponseModel.d) && Intrinsics.d(this.e, unknownProductFareMappingApiResponseModel.e) && Intrinsics.d(this.f, unknownProductFareMappingApiResponseModel.f) && Intrinsics.d(this.g, unknownProductFareMappingApiResponseModel.g) && Intrinsics.d(this.h, unknownProductFareMappingApiResponseModel.h) && Intrinsics.d(this.i, unknownProductFareMappingApiResponseModel.i) && Intrinsics.d(this.j, unknownProductFareMappingApiResponseModel.j) && Intrinsics.d(this.k, unknownProductFareMappingApiResponseModel.k) && Intrinsics.d(this.l, unknownProductFareMappingApiResponseModel.l) && Intrinsics.d(this.m, unknownProductFareMappingApiResponseModel.m) && Intrinsics.d(this.n, unknownProductFareMappingApiResponseModel.n) && Intrinsics.d(this.o, unknownProductFareMappingApiResponseModel.o) && Intrinsics.d(this.p, unknownProductFareMappingApiResponseModel.p) && Intrinsics.d(this.q, unknownProductFareMappingApiResponseModel.q) && Intrinsics.d(this.r, unknownProductFareMappingApiResponseModel.r) && Intrinsics.d(this.s, unknownProductFareMappingApiResponseModel.s) && Intrinsics.d(this.t, unknownProductFareMappingApiResponseModel.t);
    }

    public final int hashCode() {
        Integer num = this.f8621a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.e;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f;
        int iHashCode6 = (iHashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Long l = this.g;
        int iHashCode7 = (iHashCode6 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num2 = this.h;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.i;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool4 = this.j;
        int iHashCode10 = (iHashCode9 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str2 = this.k;
        int iHashCode11 = (iHashCode10 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.l;
        int iHashCode12 = (iHashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.m;
        int iHashCode13 = (iHashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.n;
        int iHashCode14 = (iHashCode13 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num4 = this.o;
        int iHashCode15 = (iHashCode14 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str6 = this.p;
        int iHashCode16 = (iHashCode15 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num5 = this.q;
        int iHashCode17 = (iHashCode16 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.r;
        int iHashCode18 = (iHashCode17 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Double d = this.s;
        int iHashCode19 = (iHashCode18 + (d == null ? 0 : d.hashCode())) * 31;
        List list2 = this.t;
        return iHashCode19 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnknownProductFareMappingApiResponseModel(fmId=");
        sb.append(this.f8621a);
        sb.append(", subCatId=");
        sb.append(this.b);
        sb.append(", proofs=");
        sb.append(this.c);
        sb.append(", isRenewable=");
        sb.append(this.d);
        sb.append(", verification=");
        hq0.u(sb, this.e, ", isVisible=", this.f, ", durationId=");
        sb.append(this.g);
        sb.append(", fare=");
        sb.append(this.h);
        sb.append(", discountedFare=");
        sb.append(this.i);
        sb.append(", isActive=");
        sb.append(this.j);
        sb.append(", inactiveReason=");
        cb0.t(sb, this.k, ", discountAdditionalInfo=", this.l, ", durationInfo=");
        cb0.t(sb, this.m, ", desc=", this.n, ", discountPercentage=");
        gf.w(this.o, ", displayName=", this.p, ", numOfTrips=", sb);
        pk0.y(sb, this.q, ", maxTripsPerDay=", this.r, ", maxPricePerTrip=");
        sb.append(this.s);
        sb.append(", specialFeatures=");
        sb.append(this.t);
        sb.append(")");
        return sb.toString();
    }
}
