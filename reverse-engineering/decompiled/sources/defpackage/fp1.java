package defpackage;

import app.chalo.resultstatemanager.ResultStateKeeperMeta;
import app.chalo.wallet.ui.loadbalance.WalletLoadBalanceEnterAmountComponent;
import app.chalo.wallet.ui.loadbalance.WalletLoadBalanceEnterAmountIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class fp1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15663a;
    public final /* synthetic */ WalletLoadBalanceEnterAmountComponent b;

    public /* synthetic */ fp1(WalletLoadBalanceEnterAmountComponent walletLoadBalanceEnterAmountComponent, int i) {
        this.f15663a = i;
        this.b = walletLoadBalanceEnterAmountComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15663a) {
            case 0:
                String str = this.b.K;
                if (str != null) {
                    return new ResultStateKeeperMeta(str);
                }
                return null;
            case 1:
                this.b.L0(WalletLoadBalanceEnterAmountIntent.DismissDialog.f10834a);
                break;
            case 2:
                this.b.L0(WalletLoadBalanceEnterAmountIntent.DismissDialog.f10834a);
                break;
            default:
                this.b.L0(WalletLoadBalanceEnterAmountIntent.NextBtnClickIntent.f10835a);
                break;
        }
        return Unit.f17538a;
    }
}
