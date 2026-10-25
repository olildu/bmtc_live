package app.chalo.walletframework.wallet.data.model.apimodel.response;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/walletframework/wallet/data/model/apimodel/response/ClosedLoopWalletRegisterResponseApiModel;", "", "Companion", "$serializer", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ClosedLoopWalletRegisterResponseApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10981a;
    public final ClosedLoopWalletResponseApiModel b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/walletframework/wallet/data/model/apimodel/response/ClosedLoopWalletRegisterResponseApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/walletframework/wallet/data/model/apimodel/response/ClosedLoopWalletRegisterResponseApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ClosedLoopWalletRegisterResponseApiModel> serializer() {
            return ClosedLoopWalletRegisterResponseApiModel$$serializer.f10982a;
        }
    }

    public /* synthetic */ ClosedLoopWalletRegisterResponseApiModel(int i, String str, ClosedLoopWalletResponseApiModel closedLoopWalletResponseApiModel) {
        if ((i & 1) == 0) {
            this.f10981a = null;
        } else {
            this.f10981a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = closedLoopWalletResponseApiModel;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClosedLoopWalletRegisterResponseApiModel)) {
            return false;
        }
        ClosedLoopWalletRegisterResponseApiModel closedLoopWalletRegisterResponseApiModel = (ClosedLoopWalletRegisterResponseApiModel) obj;
        return Intrinsics.d(this.f10981a, closedLoopWalletRegisterResponseApiModel.f10981a) && Intrinsics.d(this.b, closedLoopWalletRegisterResponseApiModel.b);
    }

    public final int hashCode() {
        String str = this.f10981a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ClosedLoopWalletResponseApiModel closedLoopWalletResponseApiModel = this.b;
        return iHashCode + (closedLoopWalletResponseApiModel != null ? closedLoopWalletResponseApiModel.hashCode() : 0);
    }

    public final String toString() {
        return "ClosedLoopWalletRegisterResponseApiModel(status=" + this.f10981a + ", closedLoopWalletDetails=" + this.b + ")";
    }
}
