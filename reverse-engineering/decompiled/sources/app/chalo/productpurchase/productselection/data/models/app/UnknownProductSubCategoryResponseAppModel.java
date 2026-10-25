package app.chalo.productpurchase.productselection.data.models.app;

import defpackage.cb0;
import defpackage.nf1;
import defpackage.t10;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/app/UnknownProductSubCategoryResponseAppModel;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UnknownProductSubCategoryResponseAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8651a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;

    public UnknownProductSubCategoryResponseAppModel(String str, String str2, String str3, String str4, boolean z, boolean z2, String str5) {
        this.f8651a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z2;
        this.g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnknownProductSubCategoryResponseAppModel)) {
            return false;
        }
        UnknownProductSubCategoryResponseAppModel unknownProductSubCategoryResponseAppModel = (UnknownProductSubCategoryResponseAppModel) obj;
        return this.f8651a == unknownProductSubCategoryResponseAppModel.f8651a && Intrinsics.d(this.b, unknownProductSubCategoryResponseAppModel.b) && Intrinsics.d(this.c, unknownProductSubCategoryResponseAppModel.c) && Intrinsics.d(this.d, unknownProductSubCategoryResponseAppModel.d) && Intrinsics.d(this.e, unknownProductSubCategoryResponseAppModel.e) && this.f == unknownProductSubCategoryResponseAppModel.f && Intrinsics.d(this.g, unknownProductSubCategoryResponseAppModel.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((nf1.e(nf1.e(nf1.e(nf1.e((this.f8651a ? 1231 : 1237) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e) + (this.f ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnknownProductSubCategoryResponseAppModel(isVisible=");
        sb.append(this.f8651a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", name=");
        cb0.t(sb, this.c, ", infoNote=", this.d, ", announcement=");
        t10.s(this.e, ", isActive=", ", inactiveReason=", sb, this.f);
        return vo1.p(sb, this.g, ")");
    }
}
