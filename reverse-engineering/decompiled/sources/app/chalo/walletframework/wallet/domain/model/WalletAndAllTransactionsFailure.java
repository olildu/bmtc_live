package app.chalo.walletframework.wallet.domain.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/domain/model/WalletAndAllTransactionsFailure;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WalletAndAllTransactionsFailure {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f11094a;

    public WalletAndAllTransactionsFailure(Throwable th) {
        this.f11094a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WalletAndAllTransactionsFailure) && Intrinsics.d(this.f11094a, ((WalletAndAllTransactionsFailure) obj).f11094a);
    }

    public final int hashCode() {
        Throwable th = this.f11094a;
        if (th == null) {
            return 0;
        }
        return th.hashCode();
    }

    public final String toString() {
        return "WalletAndAllTransactionsFailure(cause=" + this.f11094a + ")";
    }
}
