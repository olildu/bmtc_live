package defpackage;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.wallet.ui.access.WalletAccessBaseScreenKt;
import app.chalo.wallet.ui.access.WalletAccessState;
import app.chalo.wallet.ui.alltransactions.compose.WalletAllTransactionsComposableKt;
import app.chalo.wallet.ui.loadbalance.WalletLoadBalanceEnterAmountViewState;
import app.chalo.wallet.ui.loadbalance.compose.WalletLoadBalanceEnterAmountComposableKt;
import app.chalo.wallet.ui.mainbalance.WalletBalanceViewState;
import app.chalo.wallet.ui.mainbalance.compose.WalletBalanceComposableKt;
import app.chalo.wallet.ui.model.WalletTransactionUiModel;
import app.chalo.wallet.ui.transactionsContent.WalletTransactionsContentKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yo1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20130a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ yo1(WalletLoadBalanceEnterAmountViewState walletLoadBalanceEnterAmountViewState, PagerState pagerState, Function1 function1, int i) {
        this.f20130a = 3;
        this.d = walletLoadBalanceEnterAmountViewState;
        this.e = pagerState;
        this.b = function1;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20130a) {
            case 0:
                ((Integer) obj2).intValue();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.c | 1);
                WalletAccessBaseScreenKt.b((WalletAccessState) this.d, this.b, (Function2) this.e, (Composer) obj, iUpdateChangedFlags);
                break;
            case 1:
                ((Integer) obj2).intValue();
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(this.c | 1);
                WalletAllTransactionsComposableKt.c((List) this.d, this.b, (Function1) this.e, (Composer) obj, iUpdateChangedFlags2);
                break;
            case 2:
                ((Integer) obj2).intValue();
                int iUpdateChangedFlags3 = RecomposeScopeImplKt.updateChangedFlags(this.c | 1);
                WalletBalanceComposableKt.e((WalletBalanceViewState) this.d, this.b, (PagerState) this.e, (Composer) obj, iUpdateChangedFlags3);
                break;
            case 3:
                ((Integer) obj2).intValue();
                int iUpdateChangedFlags4 = RecomposeScopeImplKt.updateChangedFlags(this.c | 1);
                WalletLoadBalanceEnterAmountComposableKt.a((WalletLoadBalanceEnterAmountViewState) this.d, (PagerState) this.e, this.b, (Composer) obj, iUpdateChangedFlags4);
                break;
            default:
                ((Integer) obj2).intValue();
                int iUpdateChangedFlags5 = RecomposeScopeImplKt.updateChangedFlags(this.c | 1);
                WalletTransactionsContentKt.b((WalletTransactionUiModel) this.d, this.b, (Modifier) this.e, (Composer) obj, iUpdateChangedFlags5);
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ yo1(Object obj, Function1 function1, Object obj2, int i, int i2) {
        this.f20130a = i2;
        this.d = obj;
        this.b = function1;
        this.e = obj2;
        this.c = i;
    }
}
