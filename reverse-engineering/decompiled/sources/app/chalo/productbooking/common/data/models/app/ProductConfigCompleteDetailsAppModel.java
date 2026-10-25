package app.chalo.productbooking.common.data.models.app;

import app.chalo.instantticket.config.models.BrandingDetails;
import app.chalo.instantticket.config.models.FareInfo;
import defpackage.cb0;
import defpackage.d;
import defpackage.dd;
import defpackage.nf1;
import defpackage.nx0;
import defpackage.pk0;
import defpackage.r30;
import defpackage.t10;
import java.util.List;
import java.util.Map;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productbooking/common/data/models/app/ProductConfigCompleteDetailsAppModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ProductConfigCompleteDetailsAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] M;
    public final Integer A;
    public final Long B;
    public final ProductConfigSubCategorySelectionAppModel C;
    public final String D;
    public final String E;
    public final String F;
    public final String G;
    public final List H;
    public final List I;
    public final FareInfo J;
    public final List K;
    public final List L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8203a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final List f;
    public final String g;
    public final BrandingDetails h;
    public final String i;
    public final boolean j;
    public final int k;
    public final boolean l;
    public final List m;
    public final Map n;
    public final String o;
    public final List p;
    public final boolean q;
    public final int r;
    public final long s;
    public final String t;
    public final String u;
    public final Map v;
    public final Boolean w;
    public final List x;
    public final String y;
    public final boolean z;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/common/data/models/app/ProductConfigCompleteDetailsAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/data/models/app/ProductConfigCompleteDetailsAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ProductConfigCompleteDetailsAppModel> serializer() {
            return ProductConfigCompleteDetailsAppModel$$serializer.f8204a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        M = new Lazy[]{null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new nx0(14)), null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new nx0(15)), LazyKt.a(lazyThreadSafetyMode, new nx0(16)), null, LazyKt.a(lazyThreadSafetyMode, new nx0(17)), null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new nx0(18)), null, LazyKt.a(lazyThreadSafetyMode, new nx0(19)), null, null, null, null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new nx0(20)), LazyKt.a(lazyThreadSafetyMode, new nx0(21)), null, LazyKt.a(lazyThreadSafetyMode, new nx0(22)), LazyKt.a(lazyThreadSafetyMode, new nx0(23))};
    }

    public ProductConfigCompleteDetailsAppModel(int i, int i2, String str, String str2, String str3, String str4, String str5, List list, String str6, BrandingDetails brandingDetails, String str7, boolean z, int i3, boolean z2, List list2, Map map, String str8, List list3, boolean z3, int i4, long j, String str9, String str10, Map map2, Boolean bool, List list4, String str11, boolean z4, Integer num, Long l, ProductConfigSubCategorySelectionAppModel productConfigSubCategorySelectionAppModel, String str12, String str13, String str14, String str15, List list5, List list6, FareInfo fareInfo, List list7, List list8) {
        if ((31 != (i2 & 31)) || (-1 != i)) {
            PluginExceptionsKt.a(new int[]{i, i2}, new int[]{-1, 31}, ProductConfigCompleteDetailsAppModel$$serializer.f8204a.getDescriptor());
            throw null;
        }
        this.f8203a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = list;
        this.g = str6;
        this.h = brandingDetails;
        this.i = str7;
        this.j = z;
        this.k = i3;
        this.l = z2;
        this.m = list2;
        this.n = map;
        this.o = str8;
        this.p = list3;
        this.q = z3;
        this.r = i4;
        this.s = j;
        this.t = str9;
        this.u = str10;
        this.v = map2;
        this.w = bool;
        this.x = list4;
        this.y = str11;
        this.z = z4;
        this.A = num;
        this.B = l;
        this.C = productConfigSubCategorySelectionAppModel;
        this.D = str12;
        this.E = str13;
        this.F = str14;
        this.G = str15;
        this.H = list5;
        this.I = list6;
        this.J = fareInfo;
        this.K = list7;
        this.L = (i2 & 32) == 0 ? EmptyList.f17557a : list8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductConfigCompleteDetailsAppModel)) {
            return false;
        }
        ProductConfigCompleteDetailsAppModel productConfigCompleteDetailsAppModel = (ProductConfigCompleteDetailsAppModel) obj;
        return Intrinsics.d(this.f8203a, productConfigCompleteDetailsAppModel.f8203a) && Intrinsics.d(this.b, productConfigCompleteDetailsAppModel.b) && Intrinsics.d(this.c, productConfigCompleteDetailsAppModel.c) && Intrinsics.d(this.d, productConfigCompleteDetailsAppModel.d) && Intrinsics.d(this.e, productConfigCompleteDetailsAppModel.e) && Intrinsics.d(this.f, productConfigCompleteDetailsAppModel.f) && Intrinsics.d(this.g, productConfigCompleteDetailsAppModel.g) && Intrinsics.d(this.h, productConfigCompleteDetailsAppModel.h) && Intrinsics.d(this.i, productConfigCompleteDetailsAppModel.i) && this.j == productConfigCompleteDetailsAppModel.j && this.k == productConfigCompleteDetailsAppModel.k && this.l == productConfigCompleteDetailsAppModel.l && Intrinsics.d(this.m, productConfigCompleteDetailsAppModel.m) && Intrinsics.d(this.n, productConfigCompleteDetailsAppModel.n) && Intrinsics.d(this.o, productConfigCompleteDetailsAppModel.o) && Intrinsics.d(this.p, productConfigCompleteDetailsAppModel.p) && this.q == productConfigCompleteDetailsAppModel.q && this.r == productConfigCompleteDetailsAppModel.r && this.s == productConfigCompleteDetailsAppModel.s && Intrinsics.d(this.t, productConfigCompleteDetailsAppModel.t) && Intrinsics.d(this.u, productConfigCompleteDetailsAppModel.u) && Intrinsics.d(this.v, productConfigCompleteDetailsAppModel.v) && Intrinsics.d(this.w, productConfigCompleteDetailsAppModel.w) && Intrinsics.d(this.x, productConfigCompleteDetailsAppModel.x) && Intrinsics.d(this.y, productConfigCompleteDetailsAppModel.y) && this.z == productConfigCompleteDetailsAppModel.z && Intrinsics.d(this.A, productConfigCompleteDetailsAppModel.A) && Intrinsics.d(this.B, productConfigCompleteDetailsAppModel.B) && Intrinsics.d(this.C, productConfigCompleteDetailsAppModel.C) && Intrinsics.d(this.D, productConfigCompleteDetailsAppModel.D) && Intrinsics.d(this.E, productConfigCompleteDetailsAppModel.E) && Intrinsics.d(this.F, productConfigCompleteDetailsAppModel.F) && Intrinsics.d(this.G, productConfigCompleteDetailsAppModel.G) && Intrinsics.d(this.H, productConfigCompleteDetailsAppModel.H) && Intrinsics.d(this.I, productConfigCompleteDetailsAppModel.I) && Intrinsics.d(this.J, productConfigCompleteDetailsAppModel.J) && Intrinsics.d(this.K, productConfigCompleteDetailsAppModel.K) && Intrinsics.d(this.L, productConfigCompleteDetailsAppModel.L);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f8203a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iE2 = nf1.e((iE + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        int iB = r30.b((iE2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f);
        String str3 = this.g;
        int iHashCode = (this.h.hashCode() + ((iB + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.i;
        int iB2 = (((r30.b(nf1.e(d.f(this.n, r30.b((((((((iHashCode + (str4 == null ? 0 : str4.hashCode())) * 31) + (this.j ? 1231 : 1237)) * 31) + this.k) * 31) + (this.l ? 1231 : 1237)) * 31, 31, this.m), 31), 31, this.o), 31, this.p) + (this.q ? 1231 : 1237)) * 31) + this.r) * 31;
        long j = this.s;
        int iE3 = nf1.e((iB2 + ((int) (j ^ (j >>> 32)))) * 31, 31, this.t);
        String str5 = this.u;
        int iF = d.f(this.v, (iE3 + (str5 == null ? 0 : str5.hashCode())) * 31, 31);
        Boolean bool = this.w;
        int iB3 = r30.b((iF + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.x);
        String str6 = this.y;
        int iHashCode2 = (((iB3 + (str6 == null ? 0 : str6.hashCode())) * 31) + (this.z ? 1231 : 1237)) * 31;
        Integer num = this.A;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.B;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        ProductConfigSubCategorySelectionAppModel productConfigSubCategorySelectionAppModel = this.C;
        int iHashCode5 = (iHashCode4 + (productConfigSubCategorySelectionAppModel == null ? 0 : productConfigSubCategorySelectionAppModel.hashCode())) * 31;
        String str7 = this.D;
        int iHashCode6 = (iHashCode5 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.E;
        int iHashCode7 = (iHashCode6 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.F;
        int iHashCode8 = (iHashCode7 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.G;
        int iHashCode9 = (iHashCode8 + (str10 == null ? 0 : str10.hashCode())) * 31;
        List list = this.H;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.I;
        int iHashCode11 = (iHashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        FareInfo fareInfo = this.J;
        int iHashCode12 = (iHashCode11 + (fareInfo == null ? 0 : fareInfo.hashCode())) * 31;
        List list3 = this.K;
        return this.L.hashCode() + ((iHashCode12 + (list3 != null ? list3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("ProductConfigCompleteDetailsAppModel(id=", this.f8203a, ", city=", this.b, ", desc=");
        cb0.t(sbE, this.c, ", name=", this.d, ", label=");
        pk0.w(this.e, ", terms=", ", agency=", sbE, this.f);
        sbE.append(this.g);
        sbE.append(", branding=");
        sbE.append(this.h);
        sbE.append(", fareType=");
        t10.s(this.i, ", isActive=", ", priority=", sbE, this.j);
        sbE.append(this.k);
        sbE.append(", isVisible=");
        sbE.append(this.l);
        sbE.append(", categories=");
        sbE.append(this.m);
        sbE.append(", fareMapping=");
        sbE.append(this.n);
        sbE.append(", productType=");
        pk0.w(this.o, ", subCategory=", ", discontinued=", sbE, this.p);
        sbE.append(this.q);
        sbE.append(", totalPunches=");
        sbE.append(this.r);
        sbE.append(", activeDuration=");
        dd.k(this.s, ", productSubType=", this.t, sbE);
        sbE.append(", settlementType=");
        sbE.append(this.u);
        sbE.append(", validDurations=");
        sbE.append(this.v);
        sbE.append(", personalization=");
        sbE.append(this.w);
        sbE.append(", specialFeatures=");
        sbE.append(this.x);
        sbE.append(", finalBeneficiary=");
        sbE.append(this.y);
        sbE.append(", showNotification=");
        sbE.append(this.z);
        sbE.append(", maxIssueCountTotal=");
        sbE.append(this.A);
        sbE.append(", notificationDuration=");
        sbE.append(this.B);
        sbE.append(", subCategorySelection=");
        sbE.append(this.C);
        sbE.append(", intermediateBeneficiary=");
        sbE.append(this.D);
        cb0.t(sbE, ", revenueRecognitionLogin=", this.E, ", countryId=", this.F);
        sbE.append(", currency=");
        sbE.append(this.G);
        sbE.append(", highlightedTnc=");
        sbE.append(this.H);
        sbE.append(", productImages=");
        sbE.append(this.I);
        sbE.append(", fareInfo=");
        sbE.append(this.J);
        sbE.append(", serviceType=");
        sbE.append(this.K);
        sbE.append(", upsellRules=");
        sbE.append(this.L);
        sbE.append(")");
        return sbE.toString();
    }

    public ProductConfigCompleteDetailsAppModel(String id, String city, String str, String name, String str2, List terms, String str3, BrandingDetails brandingDetails, String str4, boolean z, int i, boolean z2, List categories, Map map, String productType, List subCategory, boolean z3, int i2, long j, String productSubType, String str5, Map map2, Boolean bool, List specialFeatures, String str6, boolean z4, Integer num, Long l, ProductConfigSubCategorySelectionAppModel productConfigSubCategorySelectionAppModel, String str7, String str8, String str9, String str10, List list, List list2, FareInfo fareInfo, List list3, List upsellRules) {
        Intrinsics.i(id, "id");
        Intrinsics.i(city, "city");
        Intrinsics.i(name, "name");
        Intrinsics.i(terms, "terms");
        Intrinsics.i(categories, "categories");
        Intrinsics.i(productType, "productType");
        Intrinsics.i(subCategory, "subCategory");
        Intrinsics.i(productSubType, "productSubType");
        Intrinsics.i(specialFeatures, "specialFeatures");
        Intrinsics.i(upsellRules, "upsellRules");
        this.f8203a = id;
        this.b = city;
        this.c = str;
        this.d = name;
        this.e = str2;
        this.f = terms;
        this.g = str3;
        this.h = brandingDetails;
        this.i = str4;
        this.j = z;
        this.k = i;
        this.l = z2;
        this.m = categories;
        this.n = map;
        this.o = productType;
        this.p = subCategory;
        this.q = z3;
        this.r = i2;
        this.s = j;
        this.t = productSubType;
        this.u = str5;
        this.v = map2;
        this.w = bool;
        this.x = specialFeatures;
        this.y = str6;
        this.z = z4;
        this.A = num;
        this.B = l;
        this.C = productConfigSubCategorySelectionAppModel;
        this.D = str7;
        this.E = str8;
        this.F = str9;
        this.G = str10;
        this.H = list;
        this.I = list2;
        this.J = fareInfo;
        this.K = list3;
        this.L = upsellRules;
    }
}
