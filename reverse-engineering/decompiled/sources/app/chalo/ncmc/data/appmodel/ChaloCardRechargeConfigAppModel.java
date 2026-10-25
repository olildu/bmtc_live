package app.chalo.ncmc.data.appmodel;

import defpackage.cb0;
import defpackage.gf;
import defpackage.ji;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/data/appmodel/ChaloCardRechargeConfigAppModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ChaloCardRechargeConfigAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] n = {null, null, null, null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ji(15)), null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6126a;
    public final ChaloCardRechargeFareInfoAppModel b;
    public final Boolean c;
    public final Integer d;
    public final Integer e;
    public final String f;
    public final String g;
    public final ChaloCardRechargeConfigBrandingAppModel h;
    public final List i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/appmodel/ChaloCardRechargeConfigAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/appmodel/ChaloCardRechargeConfigAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ChaloCardRechargeConfigAppModel> serializer() {
            return ChaloCardRechargeConfigAppModel$$serializer.f6127a;
        }
    }

    public /* synthetic */ ChaloCardRechargeConfigAppModel(int i, String str, ChaloCardRechargeFareInfoAppModel chaloCardRechargeFareInfoAppModel, Boolean bool, Integer num, Integer num2, String str2, String str3, ChaloCardRechargeConfigBrandingAppModel chaloCardRechargeConfigBrandingAppModel, List list, String str4, String str5, String str6, String str7) {
        if (8191 != (i & 8191)) {
            PluginExceptionsKt.b(ChaloCardRechargeConfigAppModel$$serializer.f6127a.getDescriptor(), i, 8191);
            throw null;
        }
        this.f6126a = str;
        this.b = chaloCardRechargeFareInfoAppModel;
        this.c = bool;
        this.d = num;
        this.e = num2;
        this.f = str2;
        this.g = str3;
        this.h = chaloCardRechargeConfigBrandingAppModel;
        this.i = list;
        this.j = str4;
        this.k = str5;
        this.l = str6;
        this.m = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloCardRechargeConfigAppModel)) {
            return false;
        }
        ChaloCardRechargeConfigAppModel chaloCardRechargeConfigAppModel = (ChaloCardRechargeConfigAppModel) obj;
        return Intrinsics.d(this.f6126a, chaloCardRechargeConfigAppModel.f6126a) && Intrinsics.d(this.b, chaloCardRechargeConfigAppModel.b) && Intrinsics.d(this.c, chaloCardRechargeConfigAppModel.c) && Intrinsics.d(this.d, chaloCardRechargeConfigAppModel.d) && Intrinsics.d(this.e, chaloCardRechargeConfigAppModel.e) && Intrinsics.d(this.f, chaloCardRechargeConfigAppModel.f) && Intrinsics.d(this.g, chaloCardRechargeConfigAppModel.g) && Intrinsics.d(this.h, chaloCardRechargeConfigAppModel.h) && Intrinsics.d(this.i, chaloCardRechargeConfigAppModel.i) && Intrinsics.d(this.j, chaloCardRechargeConfigAppModel.j) && Intrinsics.d(this.k, chaloCardRechargeConfigAppModel.k) && Intrinsics.d(this.l, chaloCardRechargeConfigAppModel.l) && Intrinsics.d(this.m, chaloCardRechargeConfigAppModel.m);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f6126a.hashCode() * 31)) * 31;
        Boolean bool = this.c;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ChaloCardRechargeConfigBrandingAppModel chaloCardRechargeConfigBrandingAppModel = this.h;
        int iHashCode7 = (iHashCode6 + (chaloCardRechargeConfigBrandingAppModel == null ? 0 : chaloCardRechargeConfigBrandingAppModel.hashCode())) * 31;
        List list = this.i;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.j;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.k;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.l;
        int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.m;
        return iHashCode11 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChaloCardRechargeConfigAppModel(configId=");
        sb.append(this.f6126a);
        sb.append(", fareInfo=");
        sb.append(this.b);
        sb.append(", isActive=");
        sb.append(this.c);
        sb.append(", minAppVer=");
        sb.append(this.d);
        sb.append(", maxAppVer=");
        gf.w(this.e, ", city=", this.f, ", name=", sb);
        sb.append(this.g);
        sb.append(", branding=");
        sb.append(this.h);
        sb.append(", terms=");
        cb0.s(", agency=", this.j, ", productType=", sb, this.i);
        cb0.t(sb, this.k, ", productSubType=", this.l, ", rechargeDelayCopy=");
        return vo1.p(sb, this.m, ")");
    }

    public ChaloCardRechargeConfigAppModel(String str, ChaloCardRechargeFareInfoAppModel chaloCardRechargeFareInfoAppModel, Boolean bool, Integer num, Integer num2, String str2, String str3, ChaloCardRechargeConfigBrandingAppModel chaloCardRechargeConfigBrandingAppModel, List list, String str4, String str5, String str6, String str7) {
        this.f6126a = str;
        this.b = chaloCardRechargeFareInfoAppModel;
        this.c = bool;
        this.d = num;
        this.e = num2;
        this.f = str2;
        this.g = str3;
        this.h = chaloCardRechargeConfigBrandingAppModel;
        this.i = list;
        this.j = str4;
        this.k = str5;
        this.l = str6;
        this.m = str7;
    }
}
