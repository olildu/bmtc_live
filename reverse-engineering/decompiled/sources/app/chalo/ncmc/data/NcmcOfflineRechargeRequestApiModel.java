package app.chalo.ncmc.data;

import defpackage.cb0;
import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/data/NcmcOfflineRechargeRequestApiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class NcmcOfflineRechargeRequestApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6049a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/NcmcOfflineRechargeRequestApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/NcmcOfflineRechargeRequestApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<NcmcOfflineRechargeRequestApiModel> serializer() {
            return NcmcOfflineRechargeRequestApiModel$$serializer.f6050a;
        }
    }

    public /* synthetic */ NcmcOfflineRechargeRequestApiModel(int i, int i2, String str, String str2, String str3, String str4) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.b(NcmcOfflineRechargeRequestApiModel$$serializer.f6050a.getDescriptor(), i, 31);
            throw null;
        }
        this.f6049a = i2;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NcmcOfflineRechargeRequestApiModel)) {
            return false;
        }
        NcmcOfflineRechargeRequestApiModel ncmcOfflineRechargeRequestApiModel = (NcmcOfflineRechargeRequestApiModel) obj;
        return this.f6049a == ncmcOfflineRechargeRequestApiModel.f6049a && Intrinsics.d(this.b, ncmcOfflineRechargeRequestApiModel.b) && Intrinsics.d(this.c, ncmcOfflineRechargeRequestApiModel.c) && Intrinsics.d(this.d, ncmcOfflineRechargeRequestApiModel.d) && Intrinsics.d(this.e, ncmcOfflineRechargeRequestApiModel.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + nf1.e(nf1.e(nf1.e(this.f6049a * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbP = nf1.p(this.f6049a, "NcmcOfflineRechargeRequestApiModel(amount=", ", cardNo=", this.b, ", configId=");
        cb0.t(sbP, this.c, ", kitNo=", this.d, ", userId=");
        return vo1.p(sbP, this.e, ")");
    }

    public NcmcOfflineRechargeRequestApiModel(int i, String cardNo, String configId, String kitNo, String str) {
        Intrinsics.i(cardNo, "cardNo");
        Intrinsics.i(configId, "configId");
        Intrinsics.i(kitNo, "kitNo");
        this.f6049a = i;
        this.b = cardNo;
        this.c = configId;
        this.d = kitNo;
        this.e = str;
    }
}
