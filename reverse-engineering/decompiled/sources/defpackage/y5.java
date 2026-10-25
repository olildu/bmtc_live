package defpackage;

import androidx.compose.foundation.lazy.LazyListItemProviderKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt;
import androidx.compose.foundation.text.selection.SelectionMagnifierKt;
import androidx.compose.material.ripple.RippleIndicationInstance;
import androidx.compose.material3.AppBarColumnKt;
import androidx.compose.material3.AppBarRowKt;
import androidx.compose.material3.DefaultModalWideNavigationRailOverride;
import androidx.compose.material3.NavigationBarKt;
import androidx.compose.material3.NavigationItemKt;
import androidx.compose.material3.NavigationRailKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.runtime.State;
import app.chalo.productsummary.ui.pass.PassSummaryViewState;
import app.chalo.productsummary.ui.ticket.TicketSummaryViewState;
import app.chalo.reportproblem.ReportProblemViewState;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.wallet.ui.loadbalance.WalletLoadBalanceEnterAmountViewState;
import app.chalo.wallet.ui.mainbalance.WalletBalanceViewState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y5 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20076a;
    public final /* synthetic */ State b;

    public /* synthetic */ y5(State state, int i) {
        this.f20076a = i;
        this.b = state;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20076a) {
            case 0:
                return AppBarColumnKt.AppBarColumn$lambda$1$lambda$0(this.b);
            case 1:
                return AppBarRowKt.AppBarRow$lambda$1$lambda$0(this.b);
            case 2:
                ((Function0) this.b.getValue()).invoke();
                return Unit.f17538a;
            case 3:
                return Boolean.valueOf(DefaultModalWideNavigationRailOverride.ModalWideNavigationRail$lambda$3$lambda$2(this.b));
            case 4:
                return Boolean.valueOf(DefaultModalWideNavigationRailOverride.ModalWideNavigationRail$lambda$6$lambda$5(this.b));
            case 5:
                return LazyGridItemProviderKt.rememberLazyGridItemProviderLambda$lambda$0$0(this.b);
            case 6:
                return LazyLayoutKt.LazyLayout$lambda$1$0$0(this.b);
            case 7:
                return LazyListItemProviderKt.rememberLazyListItemProviderLambda$lambda$0$0(this.b);
            case 8:
                return LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProviderLambda$lambda$0$0(this.b);
            case 9:
                return Float.valueOf(NavigationBarKt.NavigationBarItem$lambda$15$lambda$12$lambda$11(this.b));
            case 10:
                return Float.valueOf(NavigationBarKt.NavigationBarItem$lambda$15$lambda$14$lambda$13(this.b));
            case 11:
                return Float.valueOf(NavigationItemKt.AnimatedNavigationItem_DQd_Gtc$lambda$26$lambda$23$lambda$22(this.b));
            case 12:
                return Float.valueOf(NavigationItemKt.AnimatedNavigationItem_DQd_Gtc$lambda$26$lambda$25$lambda$24(this.b));
            case 13:
                return Float.valueOf(NavigationItemKt.NavigationItem_8Df7sds$lambda$9$lambda$8$lambda$7(this.b));
            case 14:
                return Float.valueOf(NavigationRailKt.NavigationRailItem$lambda$10$lambda$7$lambda$6(this.b));
            case 15:
                return Float.valueOf(NavigationRailKt.NavigationRailItem$lambda$10$lambda$9$lambda$8(this.b));
            case 16:
                ((PassSummaryViewState) this.b.getValue()).d.a();
                return Unit.f17538a;
            case 17:
                return Integer.valueOf(((Number) this.b.getValue()).intValue());
            case 18:
                return Integer.valueOf(((Number) this.b.getValue()).intValue());
            case 19:
                ((ReportProblemViewState) this.b.getValue()).g.a();
                return Unit.f17538a;
            case 20:
                return RippleIndicationInstance.stateLayer$lambda$0(this.b);
            case 21:
                return SelectionMagnifierKt.animatedSelectionMagnifier$lambda$0$1$0(this.b);
            case 22:
                return Boolean.valueOf(TextFieldImplKt.CommonDecorationBox$lambda$18$lambda$7$lambda$6(this.b));
            case 23:
                return Boolean.valueOf(TextFieldImplKt.CommonDecorationBox$lambda$18$lambda$10$lambda$9(this.b));
            case 24:
                State state = this.b;
                ((UiEventHandler) ((TicketSummaryViewState) state.getValue()).d.invoke(((TicketSummaryViewState) state.getValue()).b)).a();
                return Unit.f17538a;
            case 25:
                return Integer.valueOf(((WalletBalanceViewState) this.b.getValue()).i.size());
            default:
                return Integer.valueOf(((WalletLoadBalanceEnterAmountViewState) this.b.getValue()).h.size());
        }
    }
}
