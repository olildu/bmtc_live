package app.chalo.walletframework.wallet.data.model.appmodel;

import defpackage.b3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/data/model/appmodel/WalletHistorySyncResponseAppModel;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WalletHistorySyncResponseAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WalletResponseAppModel f11009a;
    public final WalletTransactionResponseAppModel b;
    public final boolean c;

    public WalletHistorySyncResponseAppModel(WalletResponseAppModel walletResponseAppModel, WalletTransactionResponseAppModel walletTransactionResponseAppModel, boolean z) {
        this.f11009a = walletResponseAppModel;
        this.b = walletTransactionResponseAppModel;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletHistorySyncResponseAppModel)) {
            return false;
        }
        WalletHistorySyncResponseAppModel walletHistorySyncResponseAppModel = (WalletHistorySyncResponseAppModel) obj;
        return Intrinsics.d(this.f11009a, walletHistorySyncResponseAppModel.f11009a) && Intrinsics.d(this.b, walletHistorySyncResponseAppModel.b) && this.c == walletHistorySyncResponseAppModel.c;
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (this.f11009a.hashCode() * 31)) * 31) + (this.c ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WalletHistorySyncResponseAppModel(walletDetails=");
        sb.append(this.f11009a);
        sb.append(", allWalletTransactions=");
        sb.append(this.b);
        sb.append(", hasTransactionsPayload=");
        return b3.g(")", sb, this.c);
    }
}
