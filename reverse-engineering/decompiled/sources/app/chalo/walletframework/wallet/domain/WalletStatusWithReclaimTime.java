package app.chalo.walletframework.wallet.domain;

import app.chalo.walletframework.wallet.data.model.WalletStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/domain/WalletStatusWithReclaimTime;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WalletStatusWithReclaimTime {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WalletStatus f11077a;
    public final Long b;

    public WalletStatusWithReclaimTime(WalletStatus walletStatus, Long l) {
        Intrinsics.i(walletStatus, "walletStatus");
        this.f11077a = walletStatus;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletStatusWithReclaimTime)) {
            return false;
        }
        WalletStatusWithReclaimTime walletStatusWithReclaimTime = (WalletStatusWithReclaimTime) obj;
        return this.f11077a == walletStatusWithReclaimTime.f11077a && Intrinsics.d(this.b, walletStatusWithReclaimTime.b);
    }

    public final int hashCode() {
        int iHashCode = this.f11077a.hashCode() * 31;
        Long l = this.b;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "WalletStatusWithReclaimTime(walletStatus=" + this.f11077a + ", walletReclaimTime=" + this.b + ")";
    }
}
