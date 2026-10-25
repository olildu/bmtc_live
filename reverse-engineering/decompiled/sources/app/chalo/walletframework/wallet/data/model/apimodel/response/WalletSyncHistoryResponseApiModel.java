package app.chalo.walletframework.wallet.data.model.apimodel.response;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/walletframework/wallet/data/model/apimodel/response/WalletSyncHistoryResponseApiModel;", "", "Companion", "$serializer", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class WalletSyncHistoryResponseApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WalletResponseApiModel f10999a;
    public final AllWalletTransactionsResponseApiModel b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/walletframework/wallet/data/model/apimodel/response/WalletSyncHistoryResponseApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/walletframework/wallet/data/model/apimodel/response/WalletSyncHistoryResponseApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<WalletSyncHistoryResponseApiModel> serializer() {
            return WalletSyncHistoryResponseApiModel$$serializer.f11000a;
        }
    }

    public /* synthetic */ WalletSyncHistoryResponseApiModel(int i, WalletResponseApiModel walletResponseApiModel, AllWalletTransactionsResponseApiModel allWalletTransactionsResponseApiModel) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(WalletSyncHistoryResponseApiModel$$serializer.f11000a.getDescriptor(), i, 3);
            throw null;
        }
        this.f10999a = walletResponseApiModel;
        this.b = allWalletTransactionsResponseApiModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletSyncHistoryResponseApiModel)) {
            return false;
        }
        WalletSyncHistoryResponseApiModel walletSyncHistoryResponseApiModel = (WalletSyncHistoryResponseApiModel) obj;
        return Intrinsics.d(this.f10999a, walletSyncHistoryResponseApiModel.f10999a) && Intrinsics.d(this.b, walletSyncHistoryResponseApiModel.b);
    }

    public final int hashCode() {
        int iHashCode = this.f10999a.hashCode() * 31;
        AllWalletTransactionsResponseApiModel allWalletTransactionsResponseApiModel = this.b;
        return iHashCode + (allWalletTransactionsResponseApiModel == null ? 0 : allWalletTransactionsResponseApiModel.hashCode());
    }

    public final String toString() {
        return "WalletSyncHistoryResponseApiModel(walletDetails=" + this.f10999a + ", allWalletTransactionsResponse=" + this.b + ")";
    }
}
