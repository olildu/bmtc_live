package app.chalo.productbooking.common.data.models.api.response;

import app.chalo.premiumbus.data.models.productconfig.BrandingApiModel;
import defpackage.cb0;
import defpackage.dd;
import defpackage.hq0;
import defpackage.ox0;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productbooking/common/data/models/api/response/ProductConfigForUiApiResponseModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ProductConfigForUiApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8167a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Integer f;
    public final List g;
    public final String h;
    public final String i;
    public final BrandingApiModel j;
    public final Boolean k;
    public final Boolean l;
    public final String m;
    public final String n;
    public final List o;
    public final String p;
    public final String q;
    public final String r;
    public final List s;
    public final String t;
    public final List u;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/common/data/models/api/response/ProductConfigForUiApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/data/models/api/response/ProductConfigForUiApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ProductConfigForUiApiResponseModel> serializer() {
            return ProductConfigForUiApiResponseModel$$serializer.f8168a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        v = new Lazy[]{null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new ox0(6)), null, null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new ox0(7)), null, null, null, LazyKt.a(lazyThreadSafetyMode, new ox0(8)), null, LazyKt.a(lazyThreadSafetyMode, new ox0(9))};
    }

    public /* synthetic */ ProductConfigForUiApiResponseModel(int i, String str, String str2, String str3, String str4, String str5, Integer num, List list, String str6, String str7, BrandingApiModel brandingApiModel, Boolean bool, Boolean bool2, String str8, String str9, List list2, String str10, String str11, String str12, List list3, String str13, List list4) {
        if (1572863 != (i & 1572863)) {
            PluginExceptionsKt.b(ProductConfigForUiApiResponseModel$$serializer.f8168a.getDescriptor(), i, 1572863);
            throw null;
        }
        this.f8167a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = num;
        this.g = list;
        this.h = str6;
        this.i = str7;
        this.j = brandingApiModel;
        this.k = bool;
        this.l = bool2;
        this.m = str8;
        this.n = str9;
        this.o = list2;
        this.p = str10;
        this.q = str11;
        this.r = str12;
        this.s = list3;
        if ((i & 524288) == 0) {
            this.t = null;
        } else {
            this.t = str13;
        }
        this.u = list4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductConfigForUiApiResponseModel)) {
            return false;
        }
        ProductConfigForUiApiResponseModel productConfigForUiApiResponseModel = (ProductConfigForUiApiResponseModel) obj;
        return Intrinsics.d(this.f8167a, productConfigForUiApiResponseModel.f8167a) && Intrinsics.d(this.b, productConfigForUiApiResponseModel.b) && Intrinsics.d(this.c, productConfigForUiApiResponseModel.c) && Intrinsics.d(this.d, productConfigForUiApiResponseModel.d) && Intrinsics.d(this.e, productConfigForUiApiResponseModel.e) && Intrinsics.d(this.f, productConfigForUiApiResponseModel.f) && Intrinsics.d(this.g, productConfigForUiApiResponseModel.g) && Intrinsics.d(this.h, productConfigForUiApiResponseModel.h) && Intrinsics.d(this.i, productConfigForUiApiResponseModel.i) && Intrinsics.d(this.j, productConfigForUiApiResponseModel.j) && Intrinsics.d(this.k, productConfigForUiApiResponseModel.k) && Intrinsics.d(this.l, productConfigForUiApiResponseModel.l) && Intrinsics.d(this.m, productConfigForUiApiResponseModel.m) && Intrinsics.d(this.n, productConfigForUiApiResponseModel.n) && Intrinsics.d(this.o, productConfigForUiApiResponseModel.o) && Intrinsics.d(this.p, productConfigForUiApiResponseModel.p) && Intrinsics.d(this.q, productConfigForUiApiResponseModel.q) && Intrinsics.d(this.r, productConfigForUiApiResponseModel.r) && Intrinsics.d(this.s, productConfigForUiApiResponseModel.s) && Intrinsics.d(this.t, productConfigForUiApiResponseModel.t) && Intrinsics.d(this.u, productConfigForUiApiResponseModel.u);
    }

    public final int hashCode() {
        String str = this.f8167a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.f;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.g;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str6 = this.h;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.i;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        BrandingApiModel brandingApiModel = this.j;
        int iHashCode10 = (iHashCode9 + (brandingApiModel == null ? 0 : brandingApiModel.hashCode())) * 31;
        Boolean bool = this.k;
        int iHashCode11 = (iHashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.l;
        int iHashCode12 = (iHashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str8 = this.m;
        int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.n;
        int iHashCode14 = (iHashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        List list2 = this.o;
        int iHashCode15 = (iHashCode14 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str10 = this.p;
        int iHashCode16 = (iHashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.q;
        int iHashCode17 = (iHashCode16 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.r;
        int iHashCode18 = (iHashCode17 + (str12 == null ? 0 : str12.hashCode())) * 31;
        List list3 = this.s;
        int iHashCode19 = (iHashCode18 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str13 = this.t;
        int iHashCode20 = (iHashCode19 + (str13 == null ? 0 : str13.hashCode())) * 31;
        List list4 = this.u;
        return iHashCode20 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("ProductConfigForUiApiResponseModel(id=", this.f8167a, ", city=", this.b, ", desc=");
        cb0.t(sbE, this.c, ", name=", this.d, ", label=");
        xs.u(this.f, this.e, ", priority=", ", terms=", sbE);
        cb0.s(", agency=", this.h, ", productValidationType=", sbE, this.g);
        sbE.append(this.i);
        sbE.append(", branding=");
        sbE.append(this.j);
        sbE.append(", isActive=");
        hq0.u(sbE, this.k, ", isVisible=", this.l, ", productType=");
        cb0.t(sbE, this.m, ", productSubType=", this.n, ", serviceType=");
        cb0.s(", ctaTitle=", this.p, ", planHighlightTitle=", sbE, this.o);
        cb0.t(sbE, this.q, ", planHighlightCopy=", this.r, ", imageUrls=");
        cb0.s(", strikeThroughHighlight=", this.t, ", appliedRules=", sbE, this.s);
        return xs.l(sbE, this.u, ")");
    }
}
