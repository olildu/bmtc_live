package app.chalo.productpurchase.productselection.data.models.app;

import defpackage.cb0;
import defpackage.hq0;
import defpackage.nf1;
import defpackage.r30;
import defpackage.tf1;
import defpackage.xs;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/app/SuperPassProductConfigFareMappingResponseAppModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class SuperPassProductConfigFareMappingResponseAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8642a;
    public final int b;
    public final Boolean c;
    public final String d;
    public final boolean e;
    public final long f;
    public final int g;
    public final String h;
    public final Boolean i;
    public final Boolean j;
    public final int k;
    public final double l;
    public final boolean m;
    public final List n;
    public final SuperPassProductFareInfoResponseAppModel o;
    public final String p;
    public final List q;
    public final String r;
    public final String s;
    public final List t;
    public final List u;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/app/SuperPassProductConfigFareMappingResponseAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productpurchase/productselection/data/models/app/SuperPassProductConfigFareMappingResponseAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<SuperPassProductConfigFareMappingResponseAppModel> serializer() {
            return SuperPassProductConfigFareMappingResponseAppModel$$serializer.f8643a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        v = new Lazy[]{null, null, null, null, null, null, null, null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new tf1(9)), null, null, LazyKt.a(lazyThreadSafetyMode, new tf1(10)), null, null, LazyKt.a(lazyThreadSafetyMode, new tf1(11)), LazyKt.a(lazyThreadSafetyMode, new tf1(12))};
    }

    public SuperPassProductConfigFareMappingResponseAppModel(int i, String str, int i2, Boolean bool, String str2, boolean z, long j, int i3, String str3, Boolean bool2, Boolean bool3, int i4, double d, boolean z2, List list, SuperPassProductFareInfoResponseAppModel superPassProductFareInfoResponseAppModel, String str4, List list2, String str5, String str6, List list3, List list4) {
        if (975807 != (i & 975807)) {
            PluginExceptionsKt.b(SuperPassProductConfigFareMappingResponseAppModel$$serializer.f8643a.getDescriptor(), i, 975807);
            throw null;
        }
        this.f8642a = str;
        this.b = i2;
        this.c = bool;
        this.d = str2;
        this.e = z;
        this.f = j;
        if ((i & 64) == 0) {
            this.g = -1;
        } else {
            this.g = i3;
        }
        this.h = str3;
        this.i = bool2;
        this.j = bool3;
        if ((i & 1024) == 0) {
            this.k = -1;
        } else {
            this.k = i4;
        }
        this.l = (i & 2048) == 0 ? -1.0d : d;
        this.m = (i & 4096) == 0 ? true : z2;
        this.n = list;
        this.o = superPassProductFareInfoResponseAppModel;
        this.p = str4;
        this.q = (65536 & i) == 0 ? EmptyList.f17557a : list2;
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
        if (!(obj instanceof SuperPassProductConfigFareMappingResponseAppModel)) {
            return false;
        }
        SuperPassProductConfigFareMappingResponseAppModel superPassProductConfigFareMappingResponseAppModel = (SuperPassProductConfigFareMappingResponseAppModel) obj;
        return Intrinsics.d(this.f8642a, superPassProductConfigFareMappingResponseAppModel.f8642a) && this.b == superPassProductConfigFareMappingResponseAppModel.b && Intrinsics.d(this.c, superPassProductConfigFareMappingResponseAppModel.c) && Intrinsics.d(this.d, superPassProductConfigFareMappingResponseAppModel.d) && this.e == superPassProductConfigFareMappingResponseAppModel.e && this.f == superPassProductConfigFareMappingResponseAppModel.f && this.g == superPassProductConfigFareMappingResponseAppModel.g && Intrinsics.d(this.h, superPassProductConfigFareMappingResponseAppModel.h) && Intrinsics.d(this.i, superPassProductConfigFareMappingResponseAppModel.i) && Intrinsics.d(this.j, superPassProductConfigFareMappingResponseAppModel.j) && this.k == superPassProductConfigFareMappingResponseAppModel.k && Double.compare(this.l, superPassProductConfigFareMappingResponseAppModel.l) == 0 && this.m == superPassProductConfigFareMappingResponseAppModel.m && Intrinsics.d(this.n, superPassProductConfigFareMappingResponseAppModel.n) && Intrinsics.d(this.o, superPassProductConfigFareMappingResponseAppModel.o) && Intrinsics.d(this.p, superPassProductConfigFareMappingResponseAppModel.p) && Intrinsics.d(this.q, superPassProductConfigFareMappingResponseAppModel.q) && Intrinsics.d(this.r, superPassProductConfigFareMappingResponseAppModel.r) && Intrinsics.d(this.s, superPassProductConfigFareMappingResponseAppModel.s) && Intrinsics.d(this.t, superPassProductConfigFareMappingResponseAppModel.t) && Intrinsics.d(this.u, superPassProductConfigFareMappingResponseAppModel.u);
    }

    public final int hashCode() {
        String str = this.f8642a;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.b) * 31;
        Boolean bool = this.c;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        int i = this.e ? 1231 : 1237;
        long j = this.f;
        int iE = nf1.e((((((iHashCode3 + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.g) * 31, 31, this.h);
        Boolean bool2 = this.i;
        int iHashCode4 = (iE + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.j;
        int iHashCode5 = (((iHashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31) + this.k) * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.l);
        int iHashCode6 = (this.o.hashCode() + r30.b((((iHashCode5 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31) + (this.m ? 1231 : 1237)) * 31, 31, this.n)) * 31;
        String str3 = this.p;
        int iB = r30.b((iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.q);
        String str4 = this.r;
        int iHashCode7 = (iB + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.s;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List list = this.t;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.u;
        return iHashCode9 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = xs.m(this.b, "SuperPassProductConfigFareMappingResponseAppModel(desc=", this.f8642a, ", fmId=", ", isActive=");
        hq0.t(this.c, ", subCatId=", this.d, ", isVisible=", sbM);
        sbM.append(this.e);
        sbM.append(", durationId=");
        sbM.append(this.f);
        sbM.append(", numOfTrips=");
        sbM.append(this.g);
        sbM.append(", displayName=");
        sbM.append(this.h);
        sbM.append(", isRenewable=");
        sbM.append(this.i);
        sbM.append(", verification=");
        sbM.append(this.j);
        sbM.append(", maxTripsPerDay=");
        sbM.append(this.k);
        sbM.append(", maxPricePerTrip=");
        sbM.append(this.l);
        sbM.append(", isProofRequired=");
        sbM.append(this.m);
        sbM.append(", specialFeatures=");
        sbM.append(this.n);
        sbM.append(", fareInfo=");
        sbM.append(this.o);
        sbM.append(", dInfo=");
        sbM.append(this.p);
        sbM.append(", proofs=");
        sbM.append(this.q);
        cb0.t(sbM, ", inactiveReason=", this.r, ", durationInfo=", this.s);
        sbM.append(", tags=");
        sbM.append(this.t);
        sbM.append(", applicableRules=");
        sbM.append(this.u);
        sbM.append(")");
        return sbM.toString();
    }

    public SuperPassProductConfigFareMappingResponseAppModel(String str, int i, Boolean bool, String str2, boolean z, long j, int i2, String displayName, Boolean bool2, Boolean bool3, int i3, double d, boolean z2, List specialFeatures, SuperPassProductFareInfoResponseAppModel superPassProductFareInfoResponseAppModel, String str3, List proofs, String str4, String str5, ArrayList arrayList, ArrayList arrayList2) {
        Intrinsics.i(displayName, "displayName");
        Intrinsics.i(specialFeatures, "specialFeatures");
        Intrinsics.i(proofs, "proofs");
        this.f8642a = str;
        this.b = i;
        this.c = bool;
        this.d = str2;
        this.e = z;
        this.f = j;
        this.g = i2;
        this.h = displayName;
        this.i = bool2;
        this.j = bool3;
        this.k = i3;
        this.l = d;
        this.m = z2;
        this.n = specialFeatures;
        this.o = superPassProductFareInfoResponseAppModel;
        this.p = str3;
        this.q = proofs;
        this.r = str4;
        this.s = str5;
        this.t = arrayList;
        this.u = arrayList2;
    }
}
