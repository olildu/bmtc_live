package app.chalo.ncmc.ui;

import app.chalo.ncmc.data.NcmcCardRechargeConfigAppModel;
import defpackage.nf1;
import defpackage.py;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/ui/NcmcOfflineRechargeArgsModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class NcmcOfflineRechargeArgsModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NcmcCardRechargeConfigAppModel f6267a;
    public final String b;
    public final Long c;
    public final String d;
    public final Long e;
    public final Long f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/ui/NcmcOfflineRechargeArgsModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/ui/NcmcOfflineRechargeArgsModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<NcmcOfflineRechargeArgsModel> serializer() {
            return NcmcOfflineRechargeArgsModel$$serializer.f6268a;
        }
    }

    public /* synthetic */ NcmcOfflineRechargeArgsModel(int i, NcmcCardRechargeConfigAppModel ncmcCardRechargeConfigAppModel, String str, Long l, String str2, Long l2, Long l3) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.b(NcmcOfflineRechargeArgsModel$$serializer.f6268a.getDescriptor(), i, 63);
            throw null;
        }
        this.f6267a = ncmcCardRechargeConfigAppModel;
        this.b = str;
        this.c = l;
        this.d = str2;
        this.e = l2;
        this.f = l3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NcmcOfflineRechargeArgsModel)) {
            return false;
        }
        NcmcOfflineRechargeArgsModel ncmcOfflineRechargeArgsModel = (NcmcOfflineRechargeArgsModel) obj;
        return Intrinsics.d(this.f6267a, ncmcOfflineRechargeArgsModel.f6267a) && Intrinsics.d(this.b, ncmcOfflineRechargeArgsModel.b) && Intrinsics.d(this.c, ncmcOfflineRechargeArgsModel.c) && Intrinsics.d(this.d, ncmcOfflineRechargeArgsModel.d) && Intrinsics.d(this.e, ncmcOfflineRechargeArgsModel.e) && Intrinsics.d(this.f, ncmcOfflineRechargeArgsModel.f);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f6267a.hashCode() * 31, 31, this.b);
        Long l = this.c;
        int iE2 = nf1.e((iE + (l == null ? 0 : l.hashCode())) * 31, 31, this.d);
        Long l2 = this.e;
        int iHashCode = (iE2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f;
        return iHashCode + (l3 != null ? l3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NcmcOfflineRechargeArgsModel(config=");
        sb.append(this.f6267a);
        sb.append(", cardNumber=");
        sb.append(this.b);
        sb.append(", onlineBalance=");
        py.t(this.c, ", kitNumber=", this.d, ", minLoadLimit=", sb);
        sb.append(this.e);
        sb.append(", maxLoadLimit=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }

    public NcmcOfflineRechargeArgsModel(NcmcCardRechargeConfigAppModel config, Long l, Long l2, Long l3, String str, String str2) {
        Intrinsics.i(config, "config");
        this.f6267a = config;
        this.b = str;
        this.c = l;
        this.d = str2;
        this.e = l2;
        this.f = l3;
    }
}
