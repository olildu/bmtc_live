package app.chalo.ncmc.data;

import app.chalo.models.CardRechargeFareInfo;
import app.chalo.models.ProductBranding;
import defpackage.cb0;
import defpackage.dd;
import defpackage.gf;
import defpackage.jk0;
import defpackage.nf1;
import defpackage.vo1;
import java.util.ArrayList;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/data/NcmcCardRechargeConfigAppModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class NcmcCardRechargeConfigAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] p = {null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new jk0(8)), null, null, null, null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6033a;
    public final String b;
    public final String c;
    public final ProductBranding d;
    public final List e;
    public final String f;
    public final CardRechargeFareInfo g;
    public final Boolean h;
    public final Boolean i;
    public final Integer j;
    public final Integer k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/NcmcCardRechargeConfigAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/NcmcCardRechargeConfigAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<NcmcCardRechargeConfigAppModel> serializer() {
            return NcmcCardRechargeConfigAppModel$$serializer.f6034a;
        }
    }

    public /* synthetic */ NcmcCardRechargeConfigAppModel(int i, String str, String str2, String str3, ProductBranding productBranding, List list, String str4, CardRechargeFareInfo cardRechargeFareInfo, Boolean bool, Boolean bool2, Integer num, Integer num2, String str5, String str6, String str7, String str8) {
        if (32767 != (i & 32767)) {
            PluginExceptionsKt.b(NcmcCardRechargeConfigAppModel$$serializer.f6034a.getDescriptor(), i, 32767);
            throw null;
        }
        this.f6033a = str;
        this.b = str2;
        this.c = str3;
        this.d = productBranding;
        this.e = list;
        this.f = str4;
        this.g = cardRechargeFareInfo;
        this.h = bool;
        this.i = bool2;
        this.j = num;
        this.k = num2;
        this.l = str5;
        this.m = str6;
        this.n = str7;
        this.o = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NcmcCardRechargeConfigAppModel)) {
            return false;
        }
        NcmcCardRechargeConfigAppModel ncmcCardRechargeConfigAppModel = (NcmcCardRechargeConfigAppModel) obj;
        return Intrinsics.d(this.f6033a, ncmcCardRechargeConfigAppModel.f6033a) && Intrinsics.d(this.b, ncmcCardRechargeConfigAppModel.b) && Intrinsics.d(this.c, ncmcCardRechargeConfigAppModel.c) && Intrinsics.d(this.d, ncmcCardRechargeConfigAppModel.d) && Intrinsics.d(this.e, ncmcCardRechargeConfigAppModel.e) && Intrinsics.d(this.f, ncmcCardRechargeConfigAppModel.f) && Intrinsics.d(this.g, ncmcCardRechargeConfigAppModel.g) && Intrinsics.d(this.h, ncmcCardRechargeConfigAppModel.h) && Intrinsics.d(this.i, ncmcCardRechargeConfigAppModel.i) && Intrinsics.d(this.j, ncmcCardRechargeConfigAppModel.j) && Intrinsics.d(this.k, ncmcCardRechargeConfigAppModel.k) && Intrinsics.d(this.l, ncmcCardRechargeConfigAppModel.l) && Intrinsics.d(this.m, ncmcCardRechargeConfigAppModel.m) && Intrinsics.d(this.n, ncmcCardRechargeConfigAppModel.n) && Intrinsics.d(this.o, ncmcCardRechargeConfigAppModel.o);
    }

    public final int hashCode() {
        int iHashCode = this.f6033a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ProductBranding productBranding = this.d;
        int iHashCode4 = (iHashCode3 + (productBranding == null ? 0 : productBranding.hashCode())) * 31;
        List list = this.e;
        int iHashCode5 = (this.g.hashCode() + nf1.e((iHashCode4 + (list == null ? 0 : list.hashCode())) * 31, 31, this.f)) * 31;
        Boolean bool = this.h;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.i;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.j;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.k;
        int iE = nf1.e(nf1.e((iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.l), 31, this.m);
        String str3 = this.n;
        return this.o.hashCode() + ((iE + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("NcmcCardRechargeConfigAppModel(id=", this.f6033a, ", city=", this.b, ", name=");
        sbE.append(this.c);
        sbE.append(", branding=");
        sbE.append(this.d);
        sbE.append(", terms=");
        cb0.s(", agency=", this.f, ", fareInfo=", sbE, this.e);
        sbE.append(this.g);
        sbE.append(", isOfflineRechargeActive=");
        sbE.append(this.h);
        sbE.append(", isActive=");
        sbE.append(this.i);
        sbE.append(", minAppVer=");
        sbE.append(this.j);
        sbE.append(", maxAppVer=");
        gf.w(this.k, ", productType=", this.l, ", productSubType=", sbE);
        cb0.t(sbE, this.m, ", intermediateBeneficiary=", this.n, ", rechargeDelayCopy=");
        return vo1.p(sbE, this.o, ")");
    }

    public NcmcCardRechargeConfigAppModel(String id, String str, String str2, ProductBranding productBranding, ArrayList arrayList, String agency, CardRechargeFareInfo cardRechargeFareInfo, Boolean bool, Boolean bool2, Integer num, Integer num2, String productType, String productSubType, String str3, String str4) {
        Intrinsics.i(id, "id");
        Intrinsics.i(agency, "agency");
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        this.f6033a = id;
        this.b = str;
        this.c = str2;
        this.d = productBranding;
        this.e = arrayList;
        this.f = agency;
        this.g = cardRechargeFareInfo;
        this.h = bool;
        this.i = bool2;
        this.j = num;
        this.k = num2;
        this.l = productType;
        this.m = productSubType;
        this.n = str3;
        this.o = str4;
    }
}
