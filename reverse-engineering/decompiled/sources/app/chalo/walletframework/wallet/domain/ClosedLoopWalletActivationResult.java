package app.chalo.walletframework.wallet.domain;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/domain/ClosedLoopWalletActivationResult;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ClosedLoopWalletActivationResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WalletStatusWithReclaimTime f11038a;
    public final boolean b;

    public ClosedLoopWalletActivationResult(WalletStatusWithReclaimTime walletStatusWithReclaimTime, boolean z) {
        this.f11038a = walletStatusWithReclaimTime;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClosedLoopWalletActivationResult)) {
            return false;
        }
        ClosedLoopWalletActivationResult closedLoopWalletActivationResult = (ClosedLoopWalletActivationResult) obj;
        return this.f11038a.equals(closedLoopWalletActivationResult.f11038a) && this.b == closedLoopWalletActivationResult.b;
    }

    public final int hashCode() {
        return (this.f11038a.hashCode() * 31) + (this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "ClosedLoopWalletActivationResult(walletStatusWithReclaimTime=" + this.f11038a + ", wasSyncSuccessful=" + this.b + ")";
    }
}
