package app.chalo.productbooking.common.data.models.app;

import app.chalo.instantticket.config.models.BrandingDetails;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.r30;
import defpackage.xs;
import defpackage.z40;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/common/data/models/app/ProductConfigForUiAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductConfigForUiAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8217a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final List g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final ProductValidationType k;
    public final String l;
    public final String m;
    public final List n;
    public final BrandingDetails o;
    public final String p;
    public final String q;
    public final String r;
    public final List s;
    public final String t;
    public final List u;

    public ProductConfigForUiAppModel(String id, String city, String str, String name, String str2, int i, List list, String str3, boolean z, boolean z2, ProductValidationType productValidationType, String productType, String productSubType, List list2, BrandingDetails brandingDetails, String str4, String str5, String str6, List list3, String str7, ArrayList arrayList) {
        Intrinsics.i(id, "id");
        Intrinsics.i(city, "city");
        Intrinsics.i(name, "name");
        Intrinsics.i(productValidationType, "productValidationType");
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        this.f8217a = id;
        this.b = city;
        this.c = str;
        this.d = name;
        this.e = str2;
        this.f = i;
        this.g = list;
        this.h = str3;
        this.i = z;
        this.j = z2;
        this.k = productValidationType;
        this.l = productType;
        this.m = productSubType;
        this.n = list2;
        this.o = brandingDetails;
        this.p = str4;
        this.q = str5;
        this.r = str6;
        this.s = list3;
        this.t = str7;
        this.u = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductConfigForUiAppModel)) {
            return false;
        }
        ProductConfigForUiAppModel productConfigForUiAppModel = (ProductConfigForUiAppModel) obj;
        return Intrinsics.d(this.f8217a, productConfigForUiAppModel.f8217a) && Intrinsics.d(this.b, productConfigForUiAppModel.b) && Intrinsics.d(this.c, productConfigForUiAppModel.c) && Intrinsics.d(this.d, productConfigForUiAppModel.d) && Intrinsics.d(this.e, productConfigForUiAppModel.e) && this.f == productConfigForUiAppModel.f && Intrinsics.d(this.g, productConfigForUiAppModel.g) && Intrinsics.d(this.h, productConfigForUiAppModel.h) && this.i == productConfigForUiAppModel.i && this.j == productConfigForUiAppModel.j && this.k == productConfigForUiAppModel.k && Intrinsics.d(this.l, productConfigForUiAppModel.l) && Intrinsics.d(this.m, productConfigForUiAppModel.m) && Intrinsics.d(this.n, productConfigForUiAppModel.n) && Intrinsics.d(this.o, productConfigForUiAppModel.o) && Intrinsics.d(this.p, productConfigForUiAppModel.p) && Intrinsics.d(this.q, productConfigForUiAppModel.q) && Intrinsics.d(this.r, productConfigForUiAppModel.r) && Intrinsics.d(this.s, productConfigForUiAppModel.s) && Intrinsics.d(this.t, productConfigForUiAppModel.t) && Intrinsics.d(this.u, productConfigForUiAppModel.u);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f8217a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iE2 = nf1.e((iE + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        int iHashCode = (((iE2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f) * 31;
        List list = this.g;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.h;
        int iHashCode3 = (this.o.hashCode() + r30.b(nf1.e(nf1.e((this.k.hashCode() + ((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + (this.i ? 1231 : 1237)) * 31) + (this.j ? 1231 : 1237)) * 31)) * 31, 31, this.l), 31, this.m), 31, this.n)) * 31;
        String str4 = this.p;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.q;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.r;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List list2 = this.s;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str7 = this.t;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List list3 = this.u;
        return iHashCode8 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("ProductConfigForUiAppModel(id=", this.f8217a, ", city=", this.b, ", desc=");
        cb0.t(sbE, this.c, ", name=", this.d, ", label=");
        cb0.o(this.f, this.e, ", priority=", ", terms=", sbE);
        cb0.s(", agency=", this.h, ", isActive=", sbE, this.g);
        z40.r(sbE, this.i, ", isVisible=", this.j, ", productValidationType=");
        sbE.append(this.k);
        sbE.append(", productType=");
        sbE.append(this.l);
        sbE.append(", productSubType=");
        pk0.w(this.m, ", serviceType=", ", branding=", sbE, this.n);
        sbE.append(this.o);
        sbE.append(", ctaTitle=");
        sbE.append(this.p);
        sbE.append(", planHighlightTitle=");
        cb0.t(sbE, this.q, ", planHighlightCopy=", this.r, ", productImages=");
        cb0.s(", strikeThroughHighlight=", this.t, ", appliedRules=", sbE, this.s);
        return xs.l(sbE, this.u, ")");
    }
}
