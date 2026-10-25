package app.chalo.walletframework.wallet.domain.model;

import app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/domain/model/WalletAndAllTransactions;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WalletAndAllTransactions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WalletAppModel f11093a;
    public final List b;

    public WalletAndAllTransactions(WalletAppModel wallet, List allTransactions) {
        Intrinsics.i(wallet, "wallet");
        Intrinsics.i(allTransactions, "allTransactions");
        this.f11093a = wallet;
        this.b = allTransactions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletAndAllTransactions)) {
            return false;
        }
        WalletAndAllTransactions walletAndAllTransactions = (WalletAndAllTransactions) obj;
        return Intrinsics.d(this.f11093a, walletAndAllTransactions.f11093a) && Intrinsics.d(this.b, walletAndAllTransactions.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f11093a.hashCode() * 31);
    }

    public final String toString() {
        return "WalletAndAllTransactions(wallet=" + this.f11093a + ", allTransactions=" + this.b + ")";
    }
}
