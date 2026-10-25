package app.chalo.wallet.ui.mainbalance;

import androidx.compose.runtime.State;
import defpackage.dp1;
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
@DebugMetadata(c = "app.chalo.wallet.ui.mainbalance.WalletBalanceMainScreenKt$WalletBalanceMainScreen$2$1", f = "WalletBalanceMainScreen.kt", l = {39}, m = "invokeSuspend", v = 1)
final class WalletBalanceMainScreenKt$WalletBalanceMainScreen$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ WalletBalanceComponent $component;
    final /* synthetic */ State<WalletBalanceViewState> $state$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletBalanceMainScreenKt$WalletBalanceMainScreen$2$1(WalletBalanceComponent walletBalanceComponent, State state, Continuation continuation) {
        super(2, continuation);
        this.$component = walletBalanceComponent;
        this.$state$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WalletBalanceMainScreenKt$WalletBalanceMainScreen$2$1(this.$component, this.$state$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((WalletBalanceMainScreenKt$WalletBalanceMainScreen$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flowS0 = this.$component.s0();
            final WalletBalanceComponent walletBalanceComponent = this.$component;
            final State<WalletBalanceViewState> state = this.$state$delegate;
            FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.wallet.ui.mainbalance.WalletBalanceMainScreenKt$WalletBalanceMainScreen$2$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    WalletBalanceSideEffect walletBalanceSideEffect = (WalletBalanceSideEffect) obj2;
                    if (Intrinsics.d(walletBalanceSideEffect, WalletBalanceSideEffect.ScrollBannerSideEffect.f10882a)) {
                        int i2 = ((WalletBalanceViewState) state.getValue()).h;
                        WalletBalanceComponent walletBalanceComponent2 = walletBalanceComponent;
                        if (((WalletBalanceDataState) walletBalanceComponent2.f.getValue()).f.size() > 0) {
                            walletBalanceComponent2.E0(new dp1(false, i2, 0));
                        }
                    } else if (!(walletBalanceSideEffect instanceof WalletBalanceSideEffect.ShowError)) {
                        throw new NoWhenBranchMatchedException();
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
