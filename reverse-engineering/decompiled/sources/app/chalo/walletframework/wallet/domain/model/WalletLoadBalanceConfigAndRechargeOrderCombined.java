package app.chalo.walletframework.wallet.domain.model;

import app.chalo.models.ordercreation.CreateOrderResponseAppModel;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletLoadBalanceConfigurationAppModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/domain/model/WalletLoadBalanceConfigAndRechargeOrderCombined;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WalletLoadBalanceConfigAndRechargeOrderCombined {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WalletLoadBalanceConfigurationAppModel f11095a;
    public final CreateOrderResponseAppModel b;

    public WalletLoadBalanceConfigAndRechargeOrderCombined(WalletLoadBalanceConfigurationAppModel walletConfig, CreateOrderResponseAppModel rechargeOrderAppModel) {
        Intrinsics.i(walletConfig, "walletConfig");
        Intrinsics.i(rechargeOrderAppModel, "rechargeOrderAppModel");
        this.f11095a = walletConfig;
        this.b = rechargeOrderAppModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletLoadBalanceConfigAndRechargeOrderCombined)) {
            return false;
        }
        WalletLoadBalanceConfigAndRechargeOrderCombined walletLoadBalanceConfigAndRechargeOrderCombined = (WalletLoadBalanceConfigAndRechargeOrderCombined) obj;
        return Intrinsics.d(this.f11095a, walletLoadBalanceConfigAndRechargeOrderCombined.f11095a) && Intrinsics.d(this.b, walletLoadBalanceConfigAndRechargeOrderCombined.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f11095a.hashCode() * 31);
    }

    public final String toString() {
        return "WalletLoadBalanceConfigAndRechargeOrderCombined(walletConfig=" + this.f11095a + ", rechargeOrderAppModel=" + this.b + ")";
    }
}
