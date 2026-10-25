package app.chalo.premiumbus.data.models.productconfig;

import defpackage.cb0;
import defpackage.hq0;
import defpackage.mx0;
import defpackage.pk0;
import defpackage.vo1;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/data/models/productconfig/ProductConfigApiModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ProductConfigApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7150a;
    public final BrandingApiModel b;
    public final List c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final Boolean i;
    public final Boolean j;
    public final Integer k;
    public final Integer l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final List r;
    public final String s;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/data/models/productconfig/ProductConfigApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/data/models/productconfig/ProductConfigApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ProductConfigApiModel> serializer() {
            return ProductConfigApiModel$$serializer.f7151a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        t = new Lazy[]{null, null, LazyKt.a(lazyThreadSafetyMode, new mx0(3)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new mx0(4)), null};
    }

    public /* synthetic */ ProductConfigApiModel(int i, String str, BrandingApiModel brandingApiModel, List list, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, Integer num, Integer num2, String str7, String str8, String str9, String str10, String str11, List list2, String str12) {
        if (524287 != (i & 524287)) {
            PluginExceptionsKt.b(ProductConfigApiModel$$serializer.f7151a.getDescriptor(), i, 524287);
            throw null;
        }
        this.f7150a = str;
        this.b = brandingApiModel;
        this.c = list;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = bool;
        this.j = bool2;
        this.k = num;
        this.l = num2;
        this.m = str7;
        this.n = str8;
        this.o = str9;
        this.p = str10;
        this.q = str11;
        this.r = list2;
        this.s = str12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductConfigApiModel)) {
            return false;
        }
        ProductConfigApiModel productConfigApiModel = (ProductConfigApiModel) obj;
        return Intrinsics.d(this.f7150a, productConfigApiModel.f7150a) && Intrinsics.d(this.b, productConfigApiModel.b) && Intrinsics.d(this.c, productConfigApiModel.c) && Intrinsics.d(this.d, productConfigApiModel.d) && Intrinsics.d(this.e, productConfigApiModel.e) && Intrinsics.d(this.f, productConfigApiModel.f) && Intrinsics.d(this.g, productConfigApiModel.g) && Intrinsics.d(this.h, productConfigApiModel.h) && Intrinsics.d(this.i, productConfigApiModel.i) && Intrinsics.d(this.j, productConfigApiModel.j) && Intrinsics.d(this.k, productConfigApiModel.k) && Intrinsics.d(this.l, productConfigApiModel.l) && Intrinsics.d(this.m, productConfigApiModel.m) && Intrinsics.d(this.n, productConfigApiModel.n) && Intrinsics.d(this.o, productConfigApiModel.o) && Intrinsics.d(this.p, productConfigApiModel.p) && Intrinsics.d(this.q, productConfigApiModel.q) && Intrinsics.d(this.r, productConfigApiModel.r) && Intrinsics.d(this.s, productConfigApiModel.s);
    }

    public final int hashCode() {
        String str = this.f7150a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BrandingApiModel brandingApiModel = this.b;
        int iHashCode2 = (iHashCode + (brandingApiModel == null ? 0 : brandingApiModel.hashCode())) * 31;
        List list = this.c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.h;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.i;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.j;
        int iHashCode10 = (iHashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.k;
        int iHashCode11 = (iHashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.l;
        int iHashCode12 = (iHashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str7 = this.m;
        int iHashCode13 = (iHashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.n;
        int iHashCode14 = (iHashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.o;
        int iHashCode15 = (iHashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.p;
        int iHashCode16 = (iHashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.q;
        int iHashCode17 = (iHashCode16 + (str11 == null ? 0 : str11.hashCode())) * 31;
        List list2 = this.r;
        int iHashCode18 = (iHashCode17 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str12 = this.s;
        return iHashCode18 + (str12 != null ? str12.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductConfigApiModel(agency=");
        sb.append(this.f7150a);
        sb.append(", branding=");
        sb.append(this.b);
        sb.append(", categories=");
        cb0.s(", city=", this.d, ", desc=", sb, this.c);
        cb0.t(sb, this.e, ", finalBeneficiary=", this.f, ", id=");
        cb0.t(sb, this.g, ", intermediateBeneficiary=", this.h, ", isActive=");
        hq0.u(sb, this.i, ", isVisible=", this.j, ", maxAppVer=");
        pk0.y(sb, this.k, ", minAppVer=", this.l, ", name=");
        cb0.t(sb, this.m, ", productSubType=", this.n, ", productType=");
        cb0.t(sb, this.o, ", revenueRecognitionLogic=", this.p, ", settlementType=");
        pk0.w(this.q, ", terms=", ", label=", sb, this.r);
        return vo1.p(sb, this.s, ")");
    }
}
