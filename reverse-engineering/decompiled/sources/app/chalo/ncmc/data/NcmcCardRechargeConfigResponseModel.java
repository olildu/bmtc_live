package app.chalo.ncmc.data;

import app.chalo.models.CardRechargeFareInfo;
import app.chalo.models.ProductBranding;
import defpackage.cb0;
import defpackage.dd;
import defpackage.gf;
import defpackage.jk0;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/data/NcmcCardRechargeConfigResponseModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class NcmcCardRechargeConfigResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] p = {null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new jk0(9)), null, null, null, null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6035a;
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
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/NcmcCardRechargeConfigResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/NcmcCardRechargeConfigResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<NcmcCardRechargeConfigResponseModel> serializer() {
            return NcmcCardRechargeConfigResponseModel$$serializer.f6036a;
        }
    }

    public /* synthetic */ NcmcCardRechargeConfigResponseModel(int i, String str, String str2, String str3, ProductBranding productBranding, List list, String str4, CardRechargeFareInfo cardRechargeFareInfo, Boolean bool, Boolean bool2, Integer num, Integer num2, String str5, String str6, String str7, String str8) {
        if (32767 != (i & 32767)) {
            PluginExceptionsKt.b(NcmcCardRechargeConfigResponseModel$$serializer.f6036a.getDescriptor(), i, 32767);
            throw null;
        }
        this.f6035a = str;
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
        if (!(obj instanceof NcmcCardRechargeConfigResponseModel)) {
            return false;
        }
        NcmcCardRechargeConfigResponseModel ncmcCardRechargeConfigResponseModel = (NcmcCardRechargeConfigResponseModel) obj;
        return Intrinsics.d(this.f6035a, ncmcCardRechargeConfigResponseModel.f6035a) && Intrinsics.d(this.b, ncmcCardRechargeConfigResponseModel.b) && Intrinsics.d(this.c, ncmcCardRechargeConfigResponseModel.c) && Intrinsics.d(this.d, ncmcCardRechargeConfigResponseModel.d) && Intrinsics.d(this.e, ncmcCardRechargeConfigResponseModel.e) && Intrinsics.d(this.f, ncmcCardRechargeConfigResponseModel.f) && Intrinsics.d(this.g, ncmcCardRechargeConfigResponseModel.g) && Intrinsics.d(this.h, ncmcCardRechargeConfigResponseModel.h) && Intrinsics.d(this.i, ncmcCardRechargeConfigResponseModel.i) && Intrinsics.d(this.j, ncmcCardRechargeConfigResponseModel.j) && Intrinsics.d(this.k, ncmcCardRechargeConfigResponseModel.k) && Intrinsics.d(this.l, ncmcCardRechargeConfigResponseModel.l) && Intrinsics.d(this.m, ncmcCardRechargeConfigResponseModel.m) && Intrinsics.d(this.n, ncmcCardRechargeConfigResponseModel.n) && Intrinsics.d(this.o, ncmcCardRechargeConfigResponseModel.o);
    }

    public final int hashCode() {
        String str = this.f6035a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ProductBranding productBranding = this.d;
        int iHashCode4 = (iHashCode3 + (productBranding == null ? 0 : productBranding.hashCode())) * 31;
        List list = this.e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        CardRechargeFareInfo cardRechargeFareInfo = this.g;
        int iHashCode7 = (iHashCode6 + (cardRechargeFareInfo == null ? 0 : cardRechargeFareInfo.hashCode())) * 31;
        Boolean bool = this.h;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.i;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.j;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.k;
        int iHashCode11 = (iHashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.l;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.m;
        int iHashCode13 = (iHashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.n;
        int iHashCode14 = (iHashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.o;
        return iHashCode14 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("NcmcCardRechargeConfigResponseModel(id=", this.f6035a, ", city=", this.b, ", name=");
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
}
