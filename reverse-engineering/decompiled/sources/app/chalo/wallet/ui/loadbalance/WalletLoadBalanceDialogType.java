package app.chalo.wallet.ui.loadbalance;

import app.chalo.walletframework.wallet.data.model.appmodel.WalletLoadBalanceConfigurationAppModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/wallet/ui/loadbalance/WalletLoadBalanceDialogType;", "", "TncDialog", "Lapp/chalo/wallet/ui/loadbalance/WalletLoadBalanceDialogType$TncDialog;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class WalletLoadBalanceDialogType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/loadbalance/WalletLoadBalanceDialogType$TncDialog;", "Lapp/chalo/wallet/ui/loadbalance/WalletLoadBalanceDialogType;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TncDialog extends WalletLoadBalanceDialogType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WalletLoadBalanceConfigurationAppModel f10827a;

        public TncDialog(WalletLoadBalanceConfigurationAppModel config) {
            Intrinsics.i(config, "config");
            this.f10827a = config;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TncDialog) && Intrinsics.d(this.f10827a, ((TncDialog) obj).f10827a);
        }

        public final int hashCode() {
            return this.f10827a.hashCode();
        }

        public final String toString() {
            return "TncDialog(config=" + this.f10827a + ")";
        }
    }
}
