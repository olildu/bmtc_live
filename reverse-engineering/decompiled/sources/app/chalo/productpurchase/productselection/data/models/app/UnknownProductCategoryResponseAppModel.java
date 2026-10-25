package app.chalo.productpurchase.productselection.data.models.app;

import defpackage.dd;
import defpackage.hq0;
import defpackage.pk0;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/app/UnknownProductCategoryResponseAppModel;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UnknownProductCategoryResponseAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8648a;
    public final String b;
    public final int c;
    public final List d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final Boolean i;
    public final String j;
    public final int k;
    public final String l;
    public final int m;
    public final int n;
    public final String o;
    public final boolean p;

    public UnknownProductCategoryResponseAppModel(String id, String str, int i, List proofs, int i2, boolean z, boolean z2, String str2, Boolean bool, String str3, int i3, String str4, int i4, int i5, String str5, boolean z3) {
        Intrinsics.i(id, "id");
        Intrinsics.i(proofs, "proofs");
        this.f8648a = id;
        this.b = str;
        this.c = i;
        this.d = proofs;
        this.e = i2;
        this.f = z;
        this.g = z2;
        this.h = str2;
        this.i = bool;
        this.j = str3;
        this.k = i3;
        this.l = str4;
        this.m = i4;
        this.n = i5;
        this.o = str5;
        this.p = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnknownProductCategoryResponseAppModel)) {
            return false;
        }
        UnknownProductCategoryResponseAppModel unknownProductCategoryResponseAppModel = (UnknownProductCategoryResponseAppModel) obj;
        return Intrinsics.d(this.f8648a, unknownProductCategoryResponseAppModel.f8648a) && Intrinsics.d(this.b, unknownProductCategoryResponseAppModel.b) && this.c == unknownProductCategoryResponseAppModel.c && Intrinsics.d(this.d, unknownProductCategoryResponseAppModel.d) && this.e == unknownProductCategoryResponseAppModel.e && this.f == unknownProductCategoryResponseAppModel.f && this.g == unknownProductCategoryResponseAppModel.g && Intrinsics.d(this.h, unknownProductCategoryResponseAppModel.h) && Intrinsics.d(this.i, unknownProductCategoryResponseAppModel.i) && Intrinsics.d(this.j, unknownProductCategoryResponseAppModel.j) && this.k == unknownProductCategoryResponseAppModel.k && Intrinsics.d(this.l, unknownProductCategoryResponseAppModel.l) && this.m == unknownProductCategoryResponseAppModel.m && this.n == unknownProductCategoryResponseAppModel.n && Intrinsics.d(this.o, unknownProductCategoryResponseAppModel.o) && this.p == unknownProductCategoryResponseAppModel.p;
    }

    public final int hashCode() {
        int iHashCode = this.f8648a.hashCode() * 31;
        String str = this.b;
        int iB = (((((r30.b((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c) * 31, 31, this.d) + this.e) * 31) + (this.f ? 1231 : 1237)) * 31) + (this.g ? 1231 : 1237)) * 31;
        String str2 = this.h;
        int iHashCode2 = (iB + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.i;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.j;
        int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.k) * 31;
        String str4 = this.l;
        int iHashCode5 = (((((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.m) * 31) + this.n) * 31;
        String str5 = this.o;
        return ((iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31) + (this.p ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("UnknownProductCategoryResponseAppModel(id=", this.f8648a, ", name=", this.b, ", displayOrder=");
        sbE.append(this.c);
        sbE.append(", proofs=");
        sbE.append(this.d);
        sbE.append(", pos=");
        sbE.append(this.e);
        sbE.append(", isActive=");
        sbE.append(this.f);
        sbE.append(", isRenewable=");
        pk0.x(", documentsDesc=", this.h, ", isVerificationRequired=", sbE, this.g);
        hq0.t(this.i, ", info=", this.j, ", maxIssueCount=", sbE);
        pk0.t(this.k, ", inactiveReason=", this.l, ", maxPricePerTrip=", sbE);
        hq0.p(this.m, this.n, ", maxTripsPerDay=", ", infoNote=", sbE);
        sbE.append(this.o);
        sbE.append(", isVisible=");
        sbE.append(this.p);
        sbE.append(")");
        return sbE.toString();
    }
}
