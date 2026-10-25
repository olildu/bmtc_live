package app.chalo.premiumbus.ui.productselection;

import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.r30;
import defpackage.uf0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/productselection/PBProductConfigUiModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PBProductConfigUiModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7691a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final List j;
    public final String k;
    public final List l;

    public PBProductConfigUiModel(String id, String str, String name, String str2, String str3, String str4, String str5, String productType, String productSubType, List productImages, String str6, List list) {
        Intrinsics.i(id, "id");
        Intrinsics.i(name, "name");
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        Intrinsics.i(productImages, "productImages");
        this.f7691a = id;
        this.b = str;
        this.c = name;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = productType;
        this.i = productSubType;
        this.j = productImages;
        this.k = str6;
        this.l = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PBProductConfigUiModel)) {
            return false;
        }
        PBProductConfigUiModel pBProductConfigUiModel = (PBProductConfigUiModel) obj;
        return Intrinsics.d(this.f7691a, pBProductConfigUiModel.f7691a) && Intrinsics.d(this.b, pBProductConfigUiModel.b) && Intrinsics.d(this.c, pBProductConfigUiModel.c) && Intrinsics.d(this.d, pBProductConfigUiModel.d) && Intrinsics.d(this.e, pBProductConfigUiModel.e) && Intrinsics.d(this.f, pBProductConfigUiModel.f) && Intrinsics.d(this.g, pBProductConfigUiModel.g) && Intrinsics.d(this.h, pBProductConfigUiModel.h) && Intrinsics.d(this.i, pBProductConfigUiModel.i) && Intrinsics.d(this.j, pBProductConfigUiModel.j) && Intrinsics.d(this.k, pBProductConfigUiModel.k) && Intrinsics.d(this.l, pBProductConfigUiModel.l);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(this.f7691a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int iB = r30.b(nf1.e(nf1.e((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.h), 31, this.i), 31, this.j);
        String str5 = this.k;
        int iHashCode4 = (iB + (str5 == null ? 0 : str5.hashCode())) * 31;
        List list = this.l;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PBProductConfigUiModel(id=", this.f7691a, ", desc=", this.b, ", name=");
        cb0.t(sbE, this.c, ", label=", this.d, ", ctaTitle=");
        cb0.t(sbE, this.e, ", planHighlightTitle=", this.f, ", planHighlightCopy=");
        cb0.t(sbE, this.g, ", productType=", this.h, ", productSubType=");
        pk0.w(this.i, ", productImages=", ", strikeThroughHighlight=", sbE, this.j);
        return uf0.p(this.k, ", appliedRules=", ")", sbE, this.l);
    }
}
