package app.chalo.walletframework.wallet.data.model.apimodel.response;

import defpackage.dd;
import defpackage.hq0;
import defpackage.nf1;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/walletframework/wallet/data/model/apimodel/response/WalletResponseApiModel;", "", "Companion", "$serializer", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class WalletResponseApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10997a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final Long f;
    public final String g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/walletframework/wallet/data/model/apimodel/response/WalletResponseApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/walletframework/wallet/data/model/apimodel/response/WalletResponseApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<WalletResponseApiModel> serializer() {
            return WalletResponseApiModel$$serializer.f10998a;
        }
    }

    public /* synthetic */ WalletResponseApiModel(int i, String str, String str2, int i2, int i3, long j, Long l, String str3) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.b(WalletResponseApiModel$$serializer.f10998a.getDescriptor(), i, 63);
            throw null;
        }
        this.f10997a = str;
        this.b = str2;
        this.c = i2;
        this.d = i3;
        this.e = j;
        this.f = l;
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletResponseApiModel)) {
            return false;
        }
        WalletResponseApiModel walletResponseApiModel = (WalletResponseApiModel) obj;
        return Intrinsics.d(this.f10997a, walletResponseApiModel.f10997a) && Intrinsics.d(this.b, walletResponseApiModel.b) && this.c == walletResponseApiModel.c && this.d == walletResponseApiModel.d && this.e == walletResponseApiModel.e && Intrinsics.d(this.f, walletResponseApiModel.f) && Intrinsics.d(this.g, walletResponseApiModel.g);
    }

    public final int hashCode() {
        int iE = (((nf1.e(this.f10997a.hashCode() * 31, 31, this.b) + this.c) * 31) + this.d) * 31;
        long j = this.e;
        int i = (iE + ((int) (j ^ (j >>> 32)))) * 31;
        Long l = this.f;
        int iHashCode = (i + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.g;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("WalletResponseApiModel(walletId=", this.f10997a, ", userId=", this.b, ", status=");
        hq0.p(this.c, this.d, ", balance=", ", remainingLoadLimit=", sbE);
        sbE.append(this.e);
        sbE.append(", walletReclaimTime=");
        sbE.append(this.f);
        return z40.h(sbE, ", agency=", this.g, ")");
    }
}
