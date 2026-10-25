package app.chalo.ncmc.data;

import defpackage.cb0;
import defpackage.nf1;
import defpackage.t10;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/data/NcmcOfflineRechargeConfirmRequestModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class NcmcOfflineRechargeConfirmRequestModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6045a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/NcmcOfflineRechargeConfirmRequestModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/NcmcOfflineRechargeConfirmRequestModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<NcmcOfflineRechargeConfirmRequestModel> serializer() {
            return NcmcOfflineRechargeConfirmRequestModel$$serializer.f6046a;
        }
    }

    public /* synthetic */ NcmcOfflineRechargeConfirmRequestModel(int i, long j, String str, String str2, String str3, String str4, String str5) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.b(NcmcOfflineRechargeConfirmRequestModel$$serializer.f6046a.getDescriptor(), i, 63);
            throw null;
        }
        this.f6045a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NcmcOfflineRechargeConfirmRequestModel)) {
            return false;
        }
        NcmcOfflineRechargeConfirmRequestModel ncmcOfflineRechargeConfirmRequestModel = (NcmcOfflineRechargeConfirmRequestModel) obj;
        return Intrinsics.d(this.f6045a, ncmcOfflineRechargeConfirmRequestModel.f6045a) && this.b == ncmcOfflineRechargeConfirmRequestModel.b && Intrinsics.d(this.c, ncmcOfflineRechargeConfirmRequestModel.c) && Intrinsics.d(this.d, ncmcOfflineRechargeConfirmRequestModel.d) && Intrinsics.d(this.e, ncmcOfflineRechargeConfirmRequestModel.e) && Intrinsics.d(this.f, ncmcOfflineRechargeConfirmRequestModel.f);
    }

    public final int hashCode() {
        int iHashCode = this.f6045a.hashCode() * 31;
        long j = this.b;
        return this.f.hashCode() + nf1.e(nf1.e(nf1.e((iHashCode + ((int) (j ^ (j >>> 32)))) * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbM = t10.m(this.b, "NcmcOfflineRechargeConfirmRequestModel(userId=", this.f6045a, ", amount=");
        cb0.t(sbM, ", configId=", this.c, ", cardNo=", this.d);
        cb0.t(sbM, ", kitNo=", this.e, ", orderId=", this.f);
        sbM.append(")");
        return sbM.toString();
    }

    public NcmcOfflineRechargeConfirmRequestModel(long j, String str, String configId, String cardNo, String kitNo, String orderId) {
        Intrinsics.i(configId, "configId");
        Intrinsics.i(cardNo, "cardNo");
        Intrinsics.i(kitNo, "kitNo");
        Intrinsics.i(orderId, "orderId");
        this.f6045a = str;
        this.b = j;
        this.c = configId;
        this.d = cardNo;
        this.e = kitNo;
        this.f = orderId;
    }
}
