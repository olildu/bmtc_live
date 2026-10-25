package app.chalo.productpurchase.productselection.data.models.app;

import defpackage.cb0;
import defpackage.hq0;
import defpackage.r30;
import defpackage.t10;
import defpackage.xs;
import defpackage.z40;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/app/UnknownProductConfigFareMappingResponseAppModel;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UnknownProductConfigFareMappingResponseAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8650a;
    public final int b;
    public final Boolean c;
    public final String d;
    public final boolean e;
    public final long f;
    public final int g;
    public final int h;
    public final int i;
    public final String j;
    public final Boolean k;
    public final Boolean l;
    public final int m;
    public final double n;
    public final List o;
    public final String p;
    public final String q;
    public final List r;
    public final String s;
    public final int t;

    public UnknownProductConfigFareMappingResponseAppModel(String str, int i, Boolean bool, String str2, boolean z, long j, int i2, int i3, int i4, String str3, Boolean bool2, Boolean bool3, int i5, double d, List specialFeatures, String str4, String str5, List proofs, String str6, int i6) {
        Intrinsics.i(specialFeatures, "specialFeatures");
        Intrinsics.i(proofs, "proofs");
        this.f8650a = str;
        this.b = i;
        this.c = bool;
        this.d = str2;
        this.e = z;
        this.f = j;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = str3;
        this.k = bool2;
        this.l = bool3;
        this.m = i5;
        this.n = d;
        this.o = specialFeatures;
        this.p = str4;
        this.q = str5;
        this.r = proofs;
        this.s = str6;
        this.t = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnknownProductConfigFareMappingResponseAppModel)) {
            return false;
        }
        UnknownProductConfigFareMappingResponseAppModel unknownProductConfigFareMappingResponseAppModel = (UnknownProductConfigFareMappingResponseAppModel) obj;
        return Intrinsics.d(this.f8650a, unknownProductConfigFareMappingResponseAppModel.f8650a) && this.b == unknownProductConfigFareMappingResponseAppModel.b && Intrinsics.d(this.c, unknownProductConfigFareMappingResponseAppModel.c) && Intrinsics.d(this.d, unknownProductConfigFareMappingResponseAppModel.d) && this.e == unknownProductConfigFareMappingResponseAppModel.e && this.f == unknownProductConfigFareMappingResponseAppModel.f && this.g == unknownProductConfigFareMappingResponseAppModel.g && this.h == unknownProductConfigFareMappingResponseAppModel.h && this.i == unknownProductConfigFareMappingResponseAppModel.i && Intrinsics.d(this.j, unknownProductConfigFareMappingResponseAppModel.j) && Intrinsics.d(this.k, unknownProductConfigFareMappingResponseAppModel.k) && Intrinsics.d(this.l, unknownProductConfigFareMappingResponseAppModel.l) && this.m == unknownProductConfigFareMappingResponseAppModel.m && Double.compare(this.n, unknownProductConfigFareMappingResponseAppModel.n) == 0 && Intrinsics.d(this.o, unknownProductConfigFareMappingResponseAppModel.o) && Intrinsics.d(this.p, unknownProductConfigFareMappingResponseAppModel.p) && Intrinsics.d(this.q, unknownProductConfigFareMappingResponseAppModel.q) && Intrinsics.d(this.r, unknownProductConfigFareMappingResponseAppModel.r) && Intrinsics.d(this.s, unknownProductConfigFareMappingResponseAppModel.s) && this.t == unknownProductConfigFareMappingResponseAppModel.t;
    }

    public final int hashCode() {
        String str = this.f8650a;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.b) * 31;
        Boolean bool = this.c;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + (this.e ? 1231 : 1237)) * 31;
        long j = this.f;
        int i = (((((((iHashCode3 + ((int) (j ^ (j >>> 32)))) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31;
        String str3 = this.j;
        int iHashCode4 = (i + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool2 = this.k;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.l;
        int iHashCode6 = (((iHashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31) + this.m) * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.n);
        int iB = r30.b((iHashCode6 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31, 31, this.o);
        String str4 = this.p;
        int iHashCode7 = (iB + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.q;
        int iB2 = r30.b((iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.r);
        String str6 = this.s;
        return ((iB2 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.t;
    }

    public final String toString() {
        StringBuilder sbM = xs.m(this.b, "UnknownProductConfigFareMappingResponseAppModel(desc=", this.f8650a, ", fmId=", ", isActive=");
        hq0.t(this.c, ", subCatId=", this.d, ", isVisible=", sbM);
        sbM.append(this.e);
        sbM.append(", durationId=");
        sbM.append(this.f);
        z40.o(this.g, this.h, ", fare=", ", discountedFare=", sbM);
        sbM.append(", numOfTrips=");
        sbM.append(this.i);
        sbM.append(", displayName=");
        sbM.append(this.j);
        sbM.append(", isRenewable=");
        sbM.append(this.k);
        sbM.append(", verification=");
        sbM.append(this.l);
        sbM.append(", maxTripsPerDay=");
        sbM.append(this.m);
        sbM.append(", maxPricePerTrip=");
        sbM.append(this.n);
        sbM.append(", specialFeatures=");
        sbM.append(this.o);
        cb0.t(sbM, ", dInfo=", this.p, ", info=", this.q);
        sbM.append(", proofs=");
        sbM.append(this.r);
        sbM.append(", inactiveReason=");
        sbM.append(this.s);
        return t10.k(sbM, ", discountPercentage=", this.t, ")");
    }
}
