package app.chalo.ncmc.ui;

import app.chalo.constants.Source;
import app.chalo.ncmc.data.NcmcCardRechargeConfigAppModel;
import defpackage.d;
import defpackage.jk0;
import defpackage.n21;
import defpackage.nf1;
import defpackage.uf0;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/ui/NcmcOnlineRechargeArgsModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class NcmcOnlineRechargeArgsModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] g = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new jk0(12)), null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Source f6269a;
    public final NcmcCardRechargeConfigAppModel b;
    public final String c;
    public final long d;
    public final String e;
    public final long f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/ui/NcmcOnlineRechargeArgsModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/ui/NcmcOnlineRechargeArgsModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<NcmcOnlineRechargeArgsModel> serializer() {
            return NcmcOnlineRechargeArgsModel$$serializer.f6270a;
        }
    }

    public /* synthetic */ NcmcOnlineRechargeArgsModel(int i, Source source, NcmcCardRechargeConfigAppModel ncmcCardRechargeConfigAppModel, String str, long j, String str2, long j2) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.b(NcmcOnlineRechargeArgsModel$$serializer.f6270a.getDescriptor(), i, 63);
            throw null;
        }
        this.f6269a = source;
        this.b = ncmcCardRechargeConfigAppModel;
        this.c = str;
        this.d = j;
        this.e = str2;
        this.f = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NcmcOnlineRechargeArgsModel)) {
            return false;
        }
        NcmcOnlineRechargeArgsModel ncmcOnlineRechargeArgsModel = (NcmcOnlineRechargeArgsModel) obj;
        return this.f6269a == ncmcOnlineRechargeArgsModel.f6269a && Intrinsics.d(this.b, ncmcOnlineRechargeArgsModel.b) && Intrinsics.d(this.c, ncmcOnlineRechargeArgsModel.c) && this.d == ncmcOnlineRechargeArgsModel.d && Intrinsics.d(this.e, ncmcOnlineRechargeArgsModel.e) && this.f == ncmcOnlineRechargeArgsModel.f;
    }

    public final int hashCode() {
        int iE = nf1.e((this.b.hashCode() + (this.f6269a.hashCode() * 31)) * 31, 31, this.c);
        long j = this.d;
        int iE2 = nf1.e((iE + ((int) (j ^ (j >>> 32)))) * 31, 31, this.e);
        long j2 = this.f;
        return iE2 + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NcmcOnlineRechargeArgsModel(source=");
        sb.append(this.f6269a);
        sb.append(", config=");
        sb.append(this.b);
        sb.append(", cardNumber=");
        n21.p(this.d, this.c, ", onlineBalance=", sb);
        d.t(sb, ", kitNumber=", this.e, ", loadLimit=");
        return uf0.m(this.f, ")", sb);
    }

    public NcmcOnlineRechargeArgsModel(long j, long j2, Source source, NcmcCardRechargeConfigAppModel config, String str, String str2) {
        Intrinsics.i(source, "source");
        Intrinsics.i(config, "config");
        this.f6269a = source;
        this.b = config;
        this.c = str;
        this.d = j;
        this.e = str2;
        this.f = j2;
    }
}
