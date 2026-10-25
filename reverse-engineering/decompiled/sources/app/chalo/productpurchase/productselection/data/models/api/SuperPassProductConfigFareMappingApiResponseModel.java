package app.chalo.productpurchase.productselection.data.models.api;

import defpackage.cb0;
import defpackage.gf;
import defpackage.hq0;
import defpackage.pk0;
import defpackage.tf1;
import defpackage.xs;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/SuperPassProductConfigFareMappingApiResponseModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class SuperPassProductConfigFareMappingApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8613a;
    public final Integer b;
    public final Boolean c;
    public final String d;
    public final Boolean e;
    public final Long f;
    public final Integer g;
    public final String h;
    public final Boolean i;
    public final Boolean j;
    public final Integer k;
    public final Double l;
    public final Boolean m;
    public final List n;
    public final SuperPassProductFareInfoApiResponseModel o;
    public final String p;
    public final List q;
    public final String r;
    public final String s;
    public final List t;
    public final List u;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/SuperPassProductConfigFareMappingApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productpurchase/productselection/data/models/api/SuperPassProductConfigFareMappingApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<SuperPassProductConfigFareMappingApiResponseModel> serializer() {
            return SuperPassProductConfigFareMappingApiResponseModel$$serializer.f8614a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        v = new Lazy[]{null, null, null, null, null, null, null, null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new tf1(5)), null, null, LazyKt.a(lazyThreadSafetyMode, new tf1(6)), null, null, LazyKt.a(lazyThreadSafetyMode, new tf1(7)), LazyKt.a(lazyThreadSafetyMode, new tf1(8))};
    }

    public /* synthetic */ SuperPassProductConfigFareMappingApiResponseModel(int i, String str, Integer num, Boolean bool, String str2, Boolean bool2, Long l, Integer num2, String str3, Boolean bool3, Boolean bool4, Integer num3, Double d, Boolean bool5, List list, SuperPassProductFareInfoApiResponseModel superPassProductFareInfoApiResponseModel, String str4, List list2, String str5, String str6, List list3, List list4) {
        if (1048575 != (i & 1048575)) {
            PluginExceptionsKt.b(SuperPassProductConfigFareMappingApiResponseModel$$serializer.f8614a.getDescriptor(), i, 1048575);
            throw null;
        }
        this.f8613a = str;
        this.b = num;
        this.c = bool;
        this.d = str2;
        this.e = bool2;
        this.f = l;
        this.g = num2;
        this.h = str3;
        this.i = bool3;
        this.j = bool4;
        this.k = num3;
        this.l = d;
        this.m = bool5;
        this.n = list;
        this.o = superPassProductFareInfoApiResponseModel;
        this.p = str4;
        this.q = list2;
        this.r = str5;
        this.s = str6;
        this.t = list3;
        if ((i & 1048576) == 0) {
            this.u = null;
        } else {
            this.u = list4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassProductConfigFareMappingApiResponseModel)) {
            return false;
        }
        SuperPassProductConfigFareMappingApiResponseModel superPassProductConfigFareMappingApiResponseModel = (SuperPassProductConfigFareMappingApiResponseModel) obj;
        return Intrinsics.d(this.f8613a, superPassProductConfigFareMappingApiResponseModel.f8613a) && Intrinsics.d(this.b, superPassProductConfigFareMappingApiResponseModel.b) && Intrinsics.d(this.c, superPassProductConfigFareMappingApiResponseModel.c) && Intrinsics.d(this.d, superPassProductConfigFareMappingApiResponseModel.d) && Intrinsics.d(this.e, superPassProductConfigFareMappingApiResponseModel.e) && Intrinsics.d(this.f, superPassProductConfigFareMappingApiResponseModel.f) && Intrinsics.d(this.g, superPassProductConfigFareMappingApiResponseModel.g) && Intrinsics.d(this.h, superPassProductConfigFareMappingApiResponseModel.h) && Intrinsics.d(this.i, superPassProductConfigFareMappingApiResponseModel.i) && Intrinsics.d(this.j, superPassProductConfigFareMappingApiResponseModel.j) && Intrinsics.d(this.k, superPassProductConfigFareMappingApiResponseModel.k) && Intrinsics.d(this.l, superPassProductConfigFareMappingApiResponseModel.l) && Intrinsics.d(this.m, superPassProductConfigFareMappingApiResponseModel.m) && Intrinsics.d(this.n, superPassProductConfigFareMappingApiResponseModel.n) && Intrinsics.d(this.o, superPassProductConfigFareMappingApiResponseModel.o) && Intrinsics.d(this.p, superPassProductConfigFareMappingApiResponseModel.p) && Intrinsics.d(this.q, superPassProductConfigFareMappingApiResponseModel.q) && Intrinsics.d(this.r, superPassProductConfigFareMappingApiResponseModel.r) && Intrinsics.d(this.s, superPassProductConfigFareMappingApiResponseModel.s) && Intrinsics.d(this.t, superPassProductConfigFareMappingApiResponseModel.t) && Intrinsics.d(this.u, superPassProductConfigFareMappingApiResponseModel.u);
    }

    public final int hashCode() {
        String str = this.f8613a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool2 = this.e;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l = this.f;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num2 = this.g;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.h;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool3 = this.i;
        int iHashCode9 = (iHashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.j;
        int iHashCode10 = (iHashCode9 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num3 = this.k;
        int iHashCode11 = (iHashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Double d = this.l;
        int iHashCode12 = (iHashCode11 + (d == null ? 0 : d.hashCode())) * 31;
        Boolean bool5 = this.m;
        int iHashCode13 = (iHashCode12 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        List list = this.n;
        int iHashCode14 = (iHashCode13 + (list == null ? 0 : list.hashCode())) * 31;
        SuperPassProductFareInfoApiResponseModel superPassProductFareInfoApiResponseModel = this.o;
        int iHashCode15 = (iHashCode14 + (superPassProductFareInfoApiResponseModel == null ? 0 : superPassProductFareInfoApiResponseModel.hashCode())) * 31;
        String str4 = this.p;
        int iHashCode16 = (iHashCode15 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list2 = this.q;
        int iHashCode17 = (iHashCode16 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str5 = this.r;
        int iHashCode18 = (iHashCode17 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.s;
        int iHashCode19 = (iHashCode18 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List list3 = this.t;
        int iHashCode20 = (iHashCode19 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.u;
        return iHashCode20 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperPassProductConfigFareMappingApiResponseModel(desc=");
        sb.append(this.f8613a);
        sb.append(", fmId=");
        sb.append(this.b);
        sb.append(", isActive=");
        hq0.t(this.c, ", subCatId=", this.d, ", isVisible=", sb);
        sb.append(this.e);
        sb.append(", durationId=");
        sb.append(this.f);
        sb.append(", numOfTrips=");
        gf.w(this.g, ", displayName=", this.h, ", isRenewable=", sb);
        hq0.u(sb, this.i, ", verification=", this.j, ", maxTripsPerDay=");
        sb.append(this.k);
        sb.append(", maxPricePerTrip=");
        sb.append(this.l);
        sb.append(", isProofRequired=");
        sb.append(this.m);
        sb.append(", specialFeatures=");
        sb.append(this.n);
        sb.append(", fareInfo=");
        sb.append(this.o);
        sb.append(", dInfo=");
        sb.append(this.p);
        sb.append(", proofs=");
        cb0.s(", inactiveReason=", this.r, ", durationInfo=", sb, this.q);
        pk0.w(this.s, ", tags=", ", appliedRules=", sb, this.t);
        return xs.l(sb, this.u, ")");
    }
}
