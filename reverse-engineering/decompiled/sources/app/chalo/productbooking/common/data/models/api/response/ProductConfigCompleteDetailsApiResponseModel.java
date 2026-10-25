package app.chalo.productbooking.common.data.models.api.response;

import app.chalo.instantticket.config.models.FareInfo;
import app.chalo.premiumbus.data.models.productconfig.BrandingApiModel;
import defpackage.cb0;
import defpackage.dd;
import defpackage.gf;
import defpackage.nx0;
import defpackage.pk0;
import defpackage.py;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productbooking/common/data/models/api/response/ProductConfigCompleteDetailsApiResponseModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ProductConfigCompleteDetailsApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] M;
    public final Integer A;
    public final Long B;
    public final ProductConfigSubCategorySelectionApiResponseModel C;
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
    public final String f8151a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final List f;
    public final String g;
    public final BrandingApiModel h;
    public final String i;
    public final Boolean j;
    public final Integer k;
    public final Boolean l;
    public final List m;
    public final Map n;
    public final String o;
    public final List p;
    public final Boolean q;
    public final Integer r;
    public final Long s;
    public final String t;
    public final String u;
    public final Map v;
    public final Boolean w;
    public final List x;
    public final String y;
    public final Boolean z;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/common/data/models/api/response/ProductConfigCompleteDetailsApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/data/models/api/response/ProductConfigCompleteDetailsApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ProductConfigCompleteDetailsApiResponseModel> serializer() {
            return ProductConfigCompleteDetailsApiResponseModel$$serializer.f8152a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        M = new Lazy[]{null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new nx0(4)), null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new nx0(5)), LazyKt.a(lazyThreadSafetyMode, new nx0(6)), null, LazyKt.a(lazyThreadSafetyMode, new nx0(7)), null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new nx0(8)), null, LazyKt.a(lazyThreadSafetyMode, new nx0(9)), null, null, null, null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new nx0(10)), LazyKt.a(lazyThreadSafetyMode, new nx0(11)), null, LazyKt.a(lazyThreadSafetyMode, new nx0(12)), LazyKt.a(lazyThreadSafetyMode, new nx0(13))};
    }

    public /* synthetic */ ProductConfigCompleteDetailsApiResponseModel(int i, int i2, String str, String str2, String str3, String str4, String str5, List list, String str6, BrandingApiModel brandingApiModel, String str7, Boolean bool, Integer num, Boolean bool2, List list2, Map map, String str8, List list3, Boolean bool3, Integer num2, Long l, String str9, String str10, Map map2, Boolean bool4, List list4, String str11, Boolean bool5, Integer num3, Long l2, ProductConfigSubCategorySelectionApiResponseModel productConfigSubCategorySelectionApiResponseModel, String str12, String str13, String str14, String str15, List list5, List list6, FareInfo fareInfo, List list7, List list8) {
        if ((31 != (i2 & 31)) || (-1 != i)) {
            PluginExceptionsKt.a(new int[]{i, i2}, new int[]{-1, 31}, ProductConfigCompleteDetailsApiResponseModel$$serializer.f8152a.getDescriptor());
            throw null;
        }
        this.f8151a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = list;
        this.g = str6;
        this.h = brandingApiModel;
        this.i = str7;
        this.j = bool;
        this.k = num;
        this.l = bool2;
        this.m = list2;
        this.n = map;
        this.o = str8;
        this.p = list3;
        this.q = bool3;
        this.r = num2;
        this.s = l;
        this.t = str9;
        this.u = str10;
        this.v = map2;
        this.w = bool4;
        this.x = list4;
        this.y = str11;
        this.z = bool5;
        this.A = num3;
        this.B = l2;
        this.C = productConfigSubCategorySelectionApiResponseModel;
        this.D = str12;
        this.E = str13;
        this.F = str14;
        this.G = str15;
        this.H = list5;
        this.I = list6;
        this.J = fareInfo;
        this.K = list7;
        if ((i2 & 32) == 0) {
            this.L = null;
        } else {
            this.L = list8;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductConfigCompleteDetailsApiResponseModel)) {
            return false;
        }
        ProductConfigCompleteDetailsApiResponseModel productConfigCompleteDetailsApiResponseModel = (ProductConfigCompleteDetailsApiResponseModel) obj;
        return Intrinsics.d(this.f8151a, productConfigCompleteDetailsApiResponseModel.f8151a) && Intrinsics.d(this.b, productConfigCompleteDetailsApiResponseModel.b) && Intrinsics.d(this.c, productConfigCompleteDetailsApiResponseModel.c) && Intrinsics.d(this.d, productConfigCompleteDetailsApiResponseModel.d) && Intrinsics.d(this.e, productConfigCompleteDetailsApiResponseModel.e) && Intrinsics.d(this.f, productConfigCompleteDetailsApiResponseModel.f) && Intrinsics.d(this.g, productConfigCompleteDetailsApiResponseModel.g) && Intrinsics.d(this.h, productConfigCompleteDetailsApiResponseModel.h) && Intrinsics.d(this.i, productConfigCompleteDetailsApiResponseModel.i) && Intrinsics.d(this.j, productConfigCompleteDetailsApiResponseModel.j) && Intrinsics.d(this.k, productConfigCompleteDetailsApiResponseModel.k) && Intrinsics.d(this.l, productConfigCompleteDetailsApiResponseModel.l) && Intrinsics.d(this.m, productConfigCompleteDetailsApiResponseModel.m) && Intrinsics.d(this.n, productConfigCompleteDetailsApiResponseModel.n) && Intrinsics.d(this.o, productConfigCompleteDetailsApiResponseModel.o) && Intrinsics.d(this.p, productConfigCompleteDetailsApiResponseModel.p) && Intrinsics.d(this.q, productConfigCompleteDetailsApiResponseModel.q) && Intrinsics.d(this.r, productConfigCompleteDetailsApiResponseModel.r) && Intrinsics.d(this.s, productConfigCompleteDetailsApiResponseModel.s) && Intrinsics.d(this.t, productConfigCompleteDetailsApiResponseModel.t) && Intrinsics.d(this.u, productConfigCompleteDetailsApiResponseModel.u) && Intrinsics.d(this.v, productConfigCompleteDetailsApiResponseModel.v) && Intrinsics.d(this.w, productConfigCompleteDetailsApiResponseModel.w) && Intrinsics.d(this.x, productConfigCompleteDetailsApiResponseModel.x) && Intrinsics.d(this.y, productConfigCompleteDetailsApiResponseModel.y) && Intrinsics.d(this.z, productConfigCompleteDetailsApiResponseModel.z) && Intrinsics.d(this.A, productConfigCompleteDetailsApiResponseModel.A) && Intrinsics.d(this.B, productConfigCompleteDetailsApiResponseModel.B) && Intrinsics.d(this.C, productConfigCompleteDetailsApiResponseModel.C) && Intrinsics.d(this.D, productConfigCompleteDetailsApiResponseModel.D) && Intrinsics.d(this.E, productConfigCompleteDetailsApiResponseModel.E) && Intrinsics.d(this.F, productConfigCompleteDetailsApiResponseModel.F) && Intrinsics.d(this.G, productConfigCompleteDetailsApiResponseModel.G) && Intrinsics.d(this.H, productConfigCompleteDetailsApiResponseModel.H) && Intrinsics.d(this.I, productConfigCompleteDetailsApiResponseModel.I) && Intrinsics.d(this.J, productConfigCompleteDetailsApiResponseModel.J) && Intrinsics.d(this.K, productConfigCompleteDetailsApiResponseModel.K) && Intrinsics.d(this.L, productConfigCompleteDetailsApiResponseModel.L);
    }

    public final int hashCode() {
        String str = this.f8151a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List list = this.f;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str6 = this.g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        BrandingApiModel brandingApiModel = this.h;
        int iHashCode8 = (iHashCode7 + (brandingApiModel == null ? 0 : brandingApiModel.hashCode())) * 31;
        String str7 = this.i;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.j;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.k;
        int iHashCode11 = (iHashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool2 = this.l;
        int iHashCode12 = (iHashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List list2 = this.m;
        int iHashCode13 = (iHashCode12 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Map map = this.n;
        int iHashCode14 = (iHashCode13 + (map == null ? 0 : map.hashCode())) * 31;
        String str8 = this.o;
        int iHashCode15 = (iHashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
        List list3 = this.p;
        int iHashCode16 = (iHashCode15 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool3 = this.q;
        int iHashCode17 = (iHashCode16 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num2 = this.r;
        int iHashCode18 = (iHashCode17 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.s;
        int iHashCode19 = (iHashCode18 + (l == null ? 0 : l.hashCode())) * 31;
        String str9 = this.t;
        int iHashCode20 = (iHashCode19 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.u;
        int iHashCode21 = (iHashCode20 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Map map2 = this.v;
        int iHashCode22 = (iHashCode21 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Boolean bool4 = this.w;
        int iHashCode23 = (iHashCode22 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        List list4 = this.x;
        int iHashCode24 = (iHashCode23 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str11 = this.y;
        int iHashCode25 = (iHashCode24 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Boolean bool5 = this.z;
        int iHashCode26 = (iHashCode25 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num3 = this.A;
        int iHashCode27 = (iHashCode26 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l2 = this.B;
        int iHashCode28 = (iHashCode27 + (l2 == null ? 0 : l2.hashCode())) * 31;
        ProductConfigSubCategorySelectionApiResponseModel productConfigSubCategorySelectionApiResponseModel = this.C;
        int iHashCode29 = (iHashCode28 + (productConfigSubCategorySelectionApiResponseModel == null ? 0 : productConfigSubCategorySelectionApiResponseModel.hashCode())) * 31;
        String str12 = this.D;
        int iHashCode30 = (iHashCode29 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.E;
        int iHashCode31 = (iHashCode30 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.F;
        int iHashCode32 = (iHashCode31 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.G;
        int iHashCode33 = (iHashCode32 + (str15 == null ? 0 : str15.hashCode())) * 31;
        List list5 = this.H;
        int iHashCode34 = (iHashCode33 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List list6 = this.I;
        int iHashCode35 = (iHashCode34 + (list6 == null ? 0 : list6.hashCode())) * 31;
        FareInfo fareInfo = this.J;
        int iHashCode36 = (iHashCode35 + (fareInfo == null ? 0 : fareInfo.hashCode())) * 31;
        List list7 = this.K;
        int iHashCode37 = (iHashCode36 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List list8 = this.L;
        return iHashCode37 + (list8 != null ? list8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("ProductConfigCompleteDetailsApiResponseModel(id=", this.f8151a, ", city=", this.b, ", desc=");
        cb0.t(sbE, this.c, ", name=", this.d, ", label=");
        pk0.w(this.e, ", terms=", ", agency=", sbE, this.f);
        sbE.append(this.g);
        sbE.append(", brandingApiModel=");
        sbE.append(this.h);
        sbE.append(", fareType=");
        gf.v(this.j, this.i, ", isActive=", ", priority=", sbE);
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
        py.t(this.s, ", productSubType=", this.t, ", settlementType=", sbE);
        sbE.append(this.u);
        sbE.append(", validDurations=");
        sbE.append(this.v);
        sbE.append(", personalization=");
        sbE.append(this.w);
        sbE.append(", specialFeatures=");
        sbE.append(this.x);
        sbE.append(", finalBeneficiary=");
        gf.v(this.z, this.y, ", showNotification=", ", maxIssueCountTotal=", sbE);
        sbE.append(this.A);
        sbE.append(", notificationDuration=");
        sbE.append(this.B);
        sbE.append(", subCategorySelection=");
        sbE.append(this.C);
        sbE.append(", intermediateBeneficiary=");
        sbE.append(this.D);
        sbE.append(", revenueRecognitionLogin=");
        cb0.t(sbE, this.E, ", countryId=", this.F, ", currency=");
        pk0.w(this.G, ", highlightedTnc=", ", imageUrls=", sbE, this.H);
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

    public ProductConfigCompleteDetailsApiResponseModel(String str, String str2, String str3, String str4, String str5, List list, String str6, BrandingApiModel brandingApiModel, String str7, Boolean bool, Integer num, Boolean bool2, ArrayList arrayList, LinkedHashMap linkedHashMap, String str8, ArrayList arrayList2, Boolean bool3, Integer num2, Long l, String str9, String str10, LinkedHashMap linkedHashMap2, Boolean bool4, List list2, String str11, Boolean bool5, Integer num3, Long l2, ProductConfigSubCategorySelectionApiResponseModel productConfigSubCategorySelectionApiResponseModel, String str12, String str13, String str14, String str15, List list3, ArrayList arrayList3, FareInfo fareInfo, ArrayList arrayList4, ArrayList arrayList5) {
        this.f8151a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = list;
        this.g = str6;
        this.h = brandingApiModel;
        this.i = str7;
        this.j = bool;
        this.k = num;
        this.l = bool2;
        this.m = arrayList;
        this.n = linkedHashMap;
        this.o = str8;
        this.p = arrayList2;
        this.q = bool3;
        this.r = num2;
        this.s = l;
        this.t = str9;
        this.u = str10;
        this.v = linkedHashMap2;
        this.w = bool4;
        this.x = list2;
        this.y = str11;
        this.z = bool5;
        this.A = num3;
        this.B = l2;
        this.C = productConfigSubCategorySelectionApiResponseModel;
        this.D = str12;
        this.E = str13;
        this.F = str14;
        this.G = str15;
        this.H = list3;
        this.I = arrayList3;
        this.J = fareInfo;
        this.K = arrayList4;
        this.L = arrayList5;
    }
}
