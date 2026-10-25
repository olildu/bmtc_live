package app.chalo.models;

import app.chalo.productbooking.common.data.models.app.ProductConfigServiceType;
import app.chalo.productbooking.common.data.models.app.ProductConfigSubCategorySelectionAppModel;
import app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.r30;
import defpackage.tf1;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/models/SuperPassProductConfigurationProperties;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class SuperPassProductConfigurationProperties {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5600a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;
    public final String i;
    public final String j;
    public final String k;
    public final List l;
    public final List m;
    public final long n;
    public final boolean o;
    public final String p;
    public final boolean q;
    public final boolean r;
    public final List s;
    public final ProductBranding t;
    public final ProductConfigSubCategorySelectionAppModel u;
    public final int v;
    public final int w;
    public final List x;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/SuperPassProductConfigurationProperties$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/SuperPassProductConfigurationProperties;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static SuperPassProductConfigurationProperties a(ProductConfigResponseAppModel.SuperPassConfigAppModel superPassConfigAppModel) {
            return new SuperPassProductConfigurationProperties(superPassConfigAppModel.j, superPassConfigAppModel.o, superPassConfigAppModel.m, superPassConfigAppModel.v, superPassConfigAppModel.w, superPassConfigAppModel.x, superPassConfigAppModel.y, superPassConfigAppModel.r, superPassConfigAppModel.k, superPassConfigAppModel.l, superPassConfigAppModel.n, superPassConfigAppModel.G, superPassConfigAppModel.H, superPassConfigAppModel.s, superPassConfigAppModel.p, superPassConfigAppModel.z, superPassConfigAppModel.q, superPassConfigAppModel.A, superPassConfigAppModel.I, new ProductBranding(superPassConfigAppModel.D.f3827a), superPassConfigAppModel.F, superPassConfigAppModel.B, superPassConfigAppModel.C, superPassConfigAppModel.K);
        }

        public final KSerializer<SuperPassProductConfigurationProperties> serializer() {
            return SuperPassProductConfigurationProperties$$serializer.f5601a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        y = new Lazy[]{null, null, null, null, null, null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new tf1(13)), LazyKt.a(lazyThreadSafetyMode, new tf1(14)), null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new tf1(15)), null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new tf1(16))};
    }

    public /* synthetic */ SuperPassProductConfigurationProperties(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2, String str8, String str9, String str10, List list, List list2, long j, boolean z, String str11, boolean z2, boolean z3, List list3, ProductBranding productBranding, ProductConfigSubCategorySelectionAppModel productConfigSubCategorySelectionAppModel, int i3, int i4, List list4) {
        if (8914695 != (i & 8914695)) {
            PluginExceptionsKt.b(SuperPassProductConfigurationProperties$$serializer.f5601a.getDescriptor(), i, 8914695);
            throw null;
        }
        this.f5600a = str;
        this.b = str2;
        this.c = str3;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str6;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str7;
        }
        if ((i & 128) == 0) {
            this.h = 0;
        } else {
            this.h = i2;
        }
        this.i = str8;
        this.j = str9;
        this.k = str10;
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = list;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = list2;
        }
        this.n = (i & 8192) == 0 ? 0L : j;
        if ((i & 16384) == 0) {
            this.o = false;
        } else {
            this.o = z;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = str11;
        }
        if ((65536 & i) == 0) {
            this.q = false;
        } else {
            this.q = z2;
        }
        if ((131072 & i) == 0) {
            this.r = false;
        } else {
            this.r = z3;
        }
        this.s = (262144 & i) == 0 ? CollectionsKt.R(ProductConfigServiceType.REGULAR) : list3;
        this.t = productBranding;
        if ((1048576 & i) == 0) {
            this.u = null;
        } else {
            this.u = productConfigSubCategorySelectionAppModel;
        }
        if ((2097152 & i) == 0) {
            this.v = -1;
        } else {
            this.v = i3;
        }
        if ((i & 4194304) == 0) {
            this.w = -1;
        } else {
            this.w = i4;
        }
        this.x = list4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getC() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassProductConfigurationProperties)) {
            return false;
        }
        SuperPassProductConfigurationProperties superPassProductConfigurationProperties = (SuperPassProductConfigurationProperties) obj;
        return Intrinsics.d(this.f5600a, superPassProductConfigurationProperties.f5600a) && Intrinsics.d(this.b, superPassProductConfigurationProperties.b) && Intrinsics.d(this.c, superPassProductConfigurationProperties.c) && Intrinsics.d(this.d, superPassProductConfigurationProperties.d) && Intrinsics.d(this.e, superPassProductConfigurationProperties.e) && Intrinsics.d(this.f, superPassProductConfigurationProperties.f) && Intrinsics.d(this.g, superPassProductConfigurationProperties.g) && this.h == superPassProductConfigurationProperties.h && Intrinsics.d(this.i, superPassProductConfigurationProperties.i) && Intrinsics.d(this.j, superPassProductConfigurationProperties.j) && Intrinsics.d(this.k, superPassProductConfigurationProperties.k) && Intrinsics.d(this.l, superPassProductConfigurationProperties.l) && Intrinsics.d(this.m, superPassProductConfigurationProperties.m) && this.n == superPassProductConfigurationProperties.n && this.o == superPassProductConfigurationProperties.o && Intrinsics.d(this.p, superPassProductConfigurationProperties.p) && this.q == superPassProductConfigurationProperties.q && this.r == superPassProductConfigurationProperties.r && Intrinsics.d(this.s, superPassProductConfigurationProperties.s) && Intrinsics.d(this.t, superPassProductConfigurationProperties.t) && Intrinsics.d(this.u, superPassProductConfigurationProperties.u) && this.v == superPassProductConfigurationProperties.v && this.w == superPassProductConfigurationProperties.w && Intrinsics.d(this.x, superPassProductConfigurationProperties.x);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(this.f5600a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int iE2 = nf1.e(nf1.e(nf1.e((((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.h) * 31, 31, this.i), 31, this.j), 31, this.k);
        List list = this.l;
        int iHashCode4 = (iE2 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.m;
        int iHashCode5 = list2 == null ? 0 : list2.hashCode();
        long j = this.n;
        int i = (((((iHashCode4 + iHashCode5) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + (this.o ? 1231 : 1237)) * 31;
        String str5 = this.p;
        int iHashCode6 = (this.t.hashCode() + r30.b((((((i + (str5 == null ? 0 : str5.hashCode())) * 31) + (this.q ? 1231 : 1237)) * 31) + (this.r ? 1231 : 1237)) * 31, 31, this.s)) * 31;
        ProductConfigSubCategorySelectionAppModel productConfigSubCategorySelectionAppModel = this.u;
        int iHashCode7 = (((((iHashCode6 + (productConfigSubCategorySelectionAppModel == null ? 0 : productConfigSubCategorySelectionAppModel.hashCode())) * 31) + this.v) * 31) + this.w) * 31;
        List list3 = this.x;
        return iHashCode7 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("SuperPassProductConfigurationProperties(productId=", this.f5600a, ", productCity=", this.b, ", productName=");
        cb0.t(sbE, this.c, ", productDesc=", this.d, ", productLogo=");
        cb0.t(sbE, this.e, ", productLabel=", this.f, ", productAdditionalInfo=");
        cb0.o(this.h, this.g, ", productPriority=", ", productType=", sbE);
        cb0.t(sbE, this.i, ", productSubType=", this.j, ", productAgency=");
        pk0.w(this.k, ", productTermsAndConditions=", ", highlightedProductTermsAndConditions=", sbE, this.l);
        sbE.append(this.m);
        sbE.append(", productActivationDuration=");
        sbE.append(this.n);
        sbE.append(", isActive=");
        sbE.append(this.o);
        sbE.append(", inactiveReason=");
        sbE.append(this.p);
        sbE.append(", isVisible=");
        sbE.append(this.q);
        sbE.append(", shouldHideSubCategorySelection=");
        sbE.append(this.r);
        sbE.append(", serviceType=");
        sbE.append(this.s);
        sbE.append(", branding=");
        sbE.append(this.t);
        sbE.append(", subCategorySelectionDetails=");
        sbE.append(this.u);
        sbE.append(", minAppVer=");
        sbE.append(this.v);
        sbE.append(", maxAppVer=");
        sbE.append(this.w);
        sbE.append(", imageUrls=");
        sbE.append(this.x);
        sbE.append(")");
        return sbE.toString();
    }

    public SuperPassProductConfigurationProperties(String productId, String productCity, String productName, String str, String str2, String str3, String str4, int i, String productType, String productSubType, String productAgency, List list, List list2, long j, boolean z, String str5, boolean z2, boolean z3, List list3, ProductBranding productBranding, ProductConfigSubCategorySelectionAppModel productConfigSubCategorySelectionAppModel, int i2, int i3, List list4) {
        Intrinsics.i(productId, "productId");
        Intrinsics.i(productCity, "productCity");
        Intrinsics.i(productName, "productName");
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        Intrinsics.i(productAgency, "productAgency");
        this.f5600a = productId;
        this.b = productCity;
        this.c = productName;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = i;
        this.i = productType;
        this.j = productSubType;
        this.k = productAgency;
        this.l = list;
        this.m = list2;
        this.n = j;
        this.o = z;
        this.p = str5;
        this.q = z2;
        this.r = z3;
        this.s = list3;
        this.t = productBranding;
        this.u = productConfigSubCategorySelectionAppModel;
        this.v = i2;
        this.w = i3;
        this.x = list4;
    }
}
