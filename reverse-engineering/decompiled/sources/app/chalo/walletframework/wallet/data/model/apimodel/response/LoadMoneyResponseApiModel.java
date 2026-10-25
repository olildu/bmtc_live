package app.chalo.walletframework.wallet.data.model.apimodel.response;

import defpackage.dd;
import defpackage.nf1;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/walletframework/wallet/data/model/apimodel/response/LoadMoneyResponseApiModel;", "", "Companion", "$serializer", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class LoadMoneyResponseApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10985a;
    public final int b;
    public final long c;
    public final String d;
    public final int e;
    public final String f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/walletframework/wallet/data/model/apimodel/response/LoadMoneyResponseApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/walletframework/wallet/data/model/apimodel/response/LoadMoneyResponseApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<LoadMoneyResponseApiModel> serializer() {
            return LoadMoneyResponseApiModel$$serializer.f10986a;
        }
    }

    public /* synthetic */ LoadMoneyResponseApiModel(int i, String str, int i2, long j, String str2, int i3, String str3) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.b(LoadMoneyResponseApiModel$$serializer.f10986a.getDescriptor(), i, 63);
            throw null;
        }
        this.f10985a = str;
        this.b = i2;
        this.c = j;
        this.d = str2;
        this.e = i3;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadMoneyResponseApiModel)) {
            return false;
        }
        LoadMoneyResponseApiModel loadMoneyResponseApiModel = (LoadMoneyResponseApiModel) obj;
        return Intrinsics.d(this.f10985a, loadMoneyResponseApiModel.f10985a) && this.b == loadMoneyResponseApiModel.b && this.c == loadMoneyResponseApiModel.c && Intrinsics.d(this.d, loadMoneyResponseApiModel.d) && this.e == loadMoneyResponseApiModel.e && Intrinsics.d(this.f, loadMoneyResponseApiModel.f);
    }

    public final int hashCode() {
        int iHashCode = ((this.f10985a.hashCode() * 31) + this.b) * 31;
        long j = this.c;
        int iE = (nf1.e((iHashCode + ((int) (j ^ (j >>> 32)))) * 31, 31, this.d) + this.e) * 31;
        String str = this.f;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbM = xs.m(this.b, "LoadMoneyResponseApiModel(orderId=", this.f10985a, ", amount=", ", transactionTime=");
        dd.k(this.c, ", transactionId=", this.d, sbM);
        sbM.append(", status=");
        sbM.append(this.e);
        sbM.append(", paymentMode=");
        sbM.append(this.f);
        sbM.append(")");
        return sbM.toString();
    }
}
