package app.chalo.ncmc.data;

import defpackage.cb0;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/data/NcmcOnlineCardRechargeRequestApiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class NcmcOnlineCardRechargeRequestApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6053a;
    public final String b;
    public final String c;
    public final String d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/NcmcOnlineCardRechargeRequestApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/NcmcOnlineCardRechargeRequestApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<NcmcOnlineCardRechargeRequestApiModel> serializer() {
            return NcmcOnlineCardRechargeRequestApiModel$$serializer.f6054a;
        }
    }

    public /* synthetic */ NcmcOnlineCardRechargeRequestApiModel(int i, long j, String str, String str2, String str3) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(NcmcOnlineCardRechargeRequestApiModel$$serializer.f6054a.getDescriptor(), i, 15);
            throw null;
        }
        this.f6053a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NcmcOnlineCardRechargeRequestApiModel)) {
            return false;
        }
        NcmcOnlineCardRechargeRequestApiModel ncmcOnlineCardRechargeRequestApiModel = (NcmcOnlineCardRechargeRequestApiModel) obj;
        return this.f6053a == ncmcOnlineCardRechargeRequestApiModel.f6053a && Intrinsics.d(this.b, ncmcOnlineCardRechargeRequestApiModel.b) && Intrinsics.d(this.c, ncmcOnlineCardRechargeRequestApiModel.c) && Intrinsics.d(this.d, ncmcOnlineCardRechargeRequestApiModel.d);
    }

    public final int hashCode() {
        long j = this.f6053a;
        return this.d.hashCode() + nf1.e(nf1.e(((int) (j ^ (j >>> 32))) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NcmcOnlineCardRechargeRequestApiModel(amount=");
        sb.append(this.f6053a);
        sb.append(", configId=");
        sb.append(this.b);
        cb0.t(sb, ", cardNo=", this.c, ", kitNo=", this.d);
        sb.append(")");
        return sb.toString();
    }

    public NcmcOnlineCardRechargeRequestApiModel(long j, String configId, String cardNo, String kitNo) {
        Intrinsics.i(configId, "configId");
        Intrinsics.i(cardNo, "cardNo");
        Intrinsics.i(kitNo, "kitNo");
        this.f6053a = j;
        this.b = configId;
        this.c = cardNo;
        this.d = kitNo;
    }
}
