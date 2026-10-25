package app.chalo.wallet.ui.loadbalancesuccess;

import defpackage.hq0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/wallet/ui/loadbalancesuccess/WalletLoadBalanceSuccessIntent;", "", "InitialIntent", "ExitScreen", "Lapp/chalo/wallet/ui/loadbalancesuccess/WalletLoadBalanceSuccessIntent$ExitScreen;", "Lapp/chalo/wallet/ui/loadbalancesuccess/WalletLoadBalanceSuccessIntent$InitialIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class WalletLoadBalanceSuccessIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/loadbalancesuccess/WalletLoadBalanceSuccessIntent$ExitScreen;", "Lapp/chalo/wallet/ui/loadbalancesuccess/WalletLoadBalanceSuccessIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ExitScreen extends WalletLoadBalanceSuccessIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ExitScreen f10854a = new ExitScreen();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ExitScreen);
        }

        public final int hashCode() {
            return -2125698730;
        }

        public final String toString() {
            return "ExitScreen";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/loadbalancesuccess/WalletLoadBalanceSuccessIntent$InitialIntent;", "Lapp/chalo/wallet/ui/loadbalancesuccess/WalletLoadBalanceSuccessIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitialIntent extends WalletLoadBalanceSuccessIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f10855a;

        public InitialIntent(long j) {
            this.f10855a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitialIntent) && this.f10855a == ((InitialIntent) obj).f10855a;
        }

        public final int hashCode() {
            long j = this.f10855a;
            return (int) (j ^ (j >>> 32));
        }

        public final String toString() {
            return hq0.e(this.f10855a, "InitialIntent(amount=", ")");
        }
    }
}
