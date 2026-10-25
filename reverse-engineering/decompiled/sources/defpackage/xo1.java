package defpackage;

import app.chalo.wallet.ui.access.WalletAccessIntent;
import app.chalo.wallet.ui.alltransactions.WalletAllTransactionsIntent;
import app.chalo.wallet.ui.loadbalance.WalletLoadBalanceEnterAmountIntent;
import app.chalo.wallet.ui.mainbalance.WalletBalanceIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xo1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20040a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ xo1(Function1 function1, int i) {
        this.f20040a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20040a) {
            case 0:
                this.b.invoke(WalletAccessIntent.RetryRefreshWalletClicked.f10799a);
                break;
            case 1:
                this.b.invoke(WalletAccessIntent.FinishFlowLaterClicked.f10792a);
                break;
            case 2:
                this.b.invoke(WalletAccessIntent.FullKYCKnowMoreClicked.f10793a);
                break;
            case 3:
                this.b.invoke(WalletAccessIntent.FinishFlowLaterClicked.f10792a);
                break;
            case 4:
                this.b.invoke(WalletAccessIntent.FinishFlowLaterClicked.f10792a);
                break;
            case 5:
                this.b.invoke(WalletAccessIntent.FinishFlowLaterClicked.f10792a);
                break;
            case 6:
                this.b.invoke(WalletAccessIntent.TransferChaloPayClicked.f10800a);
                break;
            case 7:
                this.b.invoke(WalletAccessIntent.FinishFlowLaterClicked.f10792a);
                break;
            case 8:
                this.b.invoke(WalletAccessIntent.FinishFlowLaterClicked.f10792a);
                break;
            case 9:
                this.b.invoke(WalletAccessIntent.LoginRetryClicked.f10797a);
                break;
            case 10:
                this.b.invoke(WalletAccessIntent.RetryRefreshWalletClicked.f10799a);
                break;
            case 11:
                this.b.invoke(WalletAccessIntent.FinishFlowLaterClicked.f10792a);
                break;
            case 12:
                this.b.invoke(WalletAccessIntent.LoadMoneyClicked.f10795a);
                break;
            case 13:
                this.b.invoke(WalletAllTransactionsIntent.RequestHistoryButtonClicked.f10820a);
                break;
            case 14:
                this.b.invoke(WalletAllTransactionsIntent.RequestHistoryButtonClicked.f10820a);
                break;
            case 15:
                this.b.invoke(WalletBalanceIntent.AddMoneyClicked.f10862a);
                break;
            case 16:
                this.b.invoke(WalletBalanceIntent.AddMoneyClicked.f10862a);
                break;
            case 17:
                this.b.invoke(WalletBalanceIntent.SeeAllTransactionsClicked.f10869a);
                break;
            default:
                this.b.invoke(WalletLoadBalanceEnterAmountIntent.NextBtnClickIntent.f10835a);
                break;
        }
        return Unit.f17538a;
    }
}
