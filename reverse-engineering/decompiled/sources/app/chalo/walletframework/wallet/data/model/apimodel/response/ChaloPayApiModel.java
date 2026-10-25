package app.chalo.walletframework.wallet.data.model.apimodel.response;

import defpackage.n21;
import defpackage.nf1;
import defpackage.xs;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/walletframework/wallet/data/model/apimodel/response/ChaloPayApiModel;", "", "Companion", "$serializer", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ChaloPayApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10979a;
    public final int b;
    public final String c;
    public final long d;
    public final int e;
    public final String f;
    public final String g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/walletframework/wallet/data/model/apimodel/response/ChaloPayApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/walletframework/wallet/data/model/apimodel/response/ChaloPayApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ChaloPayApiModel> serializer() {
            return ChaloPayApiModel$$serializer.f10980a;
        }
    }

    public /* synthetic */ ChaloPayApiModel(int i, String str, int i2, String str2, long j, int i3, String str3, String str4) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.b(ChaloPayApiModel$$serializer.f10980a.getDescriptor(), i, 127);
            throw null;
        }
        this.f10979a = str;
        this.b = i2;
        this.c = str2;
        this.d = j;
        this.e = i3;
        this.f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloPayApiModel)) {
            return false;
        }
        ChaloPayApiModel chaloPayApiModel = (ChaloPayApiModel) obj;
        return Intrinsics.d(this.f10979a, chaloPayApiModel.f10979a) && this.b == chaloPayApiModel.b && Intrinsics.d(this.c, chaloPayApiModel.c) && this.d == chaloPayApiModel.d && this.e == chaloPayApiModel.e && Intrinsics.d(this.f, chaloPayApiModel.f) && Intrinsics.d(this.g, chaloPayApiModel.g);
    }

    public final int hashCode() {
        int iE = nf1.e(((this.f10979a.hashCode() * 31) + this.b) * 31, 31, this.c);
        long j = this.d;
        int i = (((iE + ((int) (j ^ (j >>> 32)))) * 31) + this.e) * 31;
        String str = this.f;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = xs.m(this.b, "ChaloPayApiModel(orderId=", this.f10979a, ", amount=", ", transactionId=");
        n21.p(this.d, this.c, ", transactionTime=", sbM);
        sbM.append(", status=");
        sbM.append(this.e);
        sbM.append(", productType=");
        sbM.append(this.f);
        return z40.h(sbM, ", productName=", this.g, ")");
    }
}
