package app.chalo.premiumbus.ui.productselection;

import app.chalo.premiumbus.data.models.productconfig.BrandingApiModel;
import defpackage.cb0;
import defpackage.eo0;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.t10;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/ui/productselection/PBProductConfigAppModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PBProductConfigAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] p = {null, null, null, null, null, null, null, null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new eo0(28)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7689a;
    public final BrandingApiModel b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final int i;
    public final String j;
    public final String k;
    public final String l;
    public final List m;
    public final String n;
    public final String o;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/ui/productselection/PBProductConfigAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/ui/productselection/PBProductConfigAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PBProductConfigAppModel> serializer() {
            return PBProductConfigAppModel$$serializer.f7690a;
        }
    }

    public /* synthetic */ PBProductConfigAppModel(int i, String str, BrandingApiModel brandingApiModel, String str2, String str3, String str4, boolean z, boolean z2, int i2, int i3, String str5, String str6, String str7, List list, String str8, String str9) {
        if (32671 != (i & 32671)) {
            PluginExceptionsKt.b(PBProductConfigAppModel$$serializer.f7690a.getDescriptor(), i, 32671);
            throw null;
        }
        this.f7689a = str;
        this.b = brandingApiModel;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        if ((i & 32) == 0) {
            this.f = false;
        } else {
            this.f = z;
        }
        if ((i & 64) == 0) {
            this.g = false;
        } else {
            this.g = z2;
        }
        this.h = i2;
        this.i = i3;
        this.j = str5;
        this.k = str6;
        this.l = str7;
        this.m = list;
        this.n = str8;
        this.o = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PBProductConfigAppModel)) {
            return false;
        }
        PBProductConfigAppModel pBProductConfigAppModel = (PBProductConfigAppModel) obj;
        return Intrinsics.d(this.f7689a, pBProductConfigAppModel.f7689a) && Intrinsics.d(this.b, pBProductConfigAppModel.b) && Intrinsics.d(this.c, pBProductConfigAppModel.c) && Intrinsics.d(this.d, pBProductConfigAppModel.d) && Intrinsics.d(this.e, pBProductConfigAppModel.e) && this.f == pBProductConfigAppModel.f && this.g == pBProductConfigAppModel.g && this.h == pBProductConfigAppModel.h && this.i == pBProductConfigAppModel.i && Intrinsics.d(this.j, pBProductConfigAppModel.j) && Intrinsics.d(this.k, pBProductConfigAppModel.k) && Intrinsics.d(this.l, pBProductConfigAppModel.l) && Intrinsics.d(this.m, pBProductConfigAppModel.m) && Intrinsics.d(this.n, pBProductConfigAppModel.n) && Intrinsics.d(this.o, pBProductConfigAppModel.o);
    }

    public final int hashCode() {
        String str = this.f7689a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BrandingApiModel brandingApiModel = this.b;
        int iE = nf1.e(nf1.e(nf1.e((((((((nf1.e(nf1.e(nf1.e((iHashCode + (brandingApiModel == null ? 0 : brandingApiModel.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e) + (this.f ? 1231 : 1237)) * 31) + (this.g ? 1231 : 1237)) * 31) + this.h) * 31) + this.i) * 31, 31, this.j), 31, this.k), 31, this.l);
        List list = this.m;
        int iHashCode2 = (iE + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.n;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.o;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PBProductConfigAppModel(agency=");
        sb.append(this.f7689a);
        sb.append(", branding=");
        sb.append(this.b);
        sb.append(", city=");
        cb0.t(sb, this.c, ", desc=", this.d, ", id=");
        t10.s(this.e, ", isActive=", ", isVisible=", sb, this.f);
        sb.append(this.g);
        sb.append(", maxAppVer=");
        sb.append(this.h);
        sb.append(", minAppVer=");
        pk0.t(this.i, ", name=", this.j, ", productSubType=", sb);
        cb0.t(sb, this.k, ", productType=", this.l, ", terms=");
        cb0.s(", label=", this.n, ", imageUrl=", sb, this.m);
        return vo1.p(sb, this.o, ")");
    }
}
