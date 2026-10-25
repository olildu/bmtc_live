package app.chalo.wallet.ui.loadbalance;

import androidx.compose.runtime.State;
import app.chalo.constants.CurrencyRoundOffLogic;
import defpackage.dp1;
import defpackage.mn1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.wallet.ui.loadbalance.WalletLoadBalanceEnterAmountMainScreenKt$WalletLoadBalanceEnterAmountMainScreen$2$1", f = "WalletLoadBalanceEnterAmountMainScreen.kt", l = {43}, m = "invokeSuspend", v = 1)
final class WalletLoadBalanceEnterAmountMainScreenKt$WalletLoadBalanceEnterAmountMainScreen$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ WalletLoadBalanceEnterAmountComponent $component;
    final /* synthetic */ State<WalletLoadBalanceEnterAmountViewState> $state$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletLoadBalanceEnterAmountMainScreenKt$WalletLoadBalanceEnterAmountMainScreen$2$1(WalletLoadBalanceEnterAmountComponent walletLoadBalanceEnterAmountComponent, State state, Continuation continuation) {
        super(2, continuation);
        this.$component = walletLoadBalanceEnterAmountComponent;
        this.$state$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WalletLoadBalanceEnterAmountMainScreenKt$WalletLoadBalanceEnterAmountMainScreen$2$1(this.$component, this.$state$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((WalletLoadBalanceEnterAmountMainScreenKt$WalletLoadBalanceEnterAmountMainScreen$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flowS0 = this.$component.s0();
            final WalletLoadBalanceEnterAmountComponent walletLoadBalanceEnterAmountComponent = this.$component;
            final State<WalletLoadBalanceEnterAmountViewState> state = this.$state$delegate;
            FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.wallet.ui.loadbalance.WalletLoadBalanceEnterAmountMainScreenKt$WalletLoadBalanceEnterAmountMainScreen$2$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    WalletLoadBalanceEnterAmountSideEffect walletLoadBalanceEnterAmountSideEffect = (WalletLoadBalanceEnterAmountSideEffect) obj2;
                    boolean zD = Intrinsics.d(walletLoadBalanceEnterAmountSideEffect, WalletLoadBalanceEnterAmountSideEffect.ScrollBannerSideEffect.f10847a);
                    WalletLoadBalanceEnterAmountComponent walletLoadBalanceEnterAmountComponent2 = walletLoadBalanceEnterAmountComponent;
                    if (zD) {
                        int i2 = ((WalletLoadBalanceEnterAmountViewState) state.getValue()).l;
                        if (((WalletLoadBalanceEnterAmountDataState) walletLoadBalanceEnterAmountComponent2.f.getValue()).h.size() > 0) {
                            walletLoadBalanceEnterAmountComponent2.E0(new dp1(false, i2, 1));
                        }
                    } else {
                        if (!(walletLoadBalanceEnterAmountSideEffect instanceof WalletLoadBalanceEnterAmountSideEffect.SuggestedDenominationClicked)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        String strA = walletLoadBalanceEnterAmountComponent2.B.a(((WalletLoadBalanceEnterAmountSideEffect.SuggestedDenominationClicked) walletLoadBalanceEnterAmountSideEffect).f10848a, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                        walletLoadBalanceEnterAmountComponent2.E0(new mn1(strA, 4));
                        walletLoadBalanceEnterAmountComponent2.L0(new WalletLoadBalanceEnterAmountIntent.AmountEnteredIntent(strA));
                    }
                    return Unit.f17538a;
                }
            };
            this.label = 1;
            if (flowS0.collect(flowCollector, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f17538a;
    }
}
