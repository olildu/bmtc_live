package app.chalo.wallet.ui.mainbalance;

import app.chalo.extensions.FlowExtentionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.CancellableFlow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.wallet.ui.mainbalance.WalletBalanceComponent$startBannerTickerTimer$1", f = "WalletBalanceComponent.kt", l = {533}, m = "invokeSuspend", v = 1)
final class WalletBalanceComponent$startBannerTickerTimer$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ WalletBalanceComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletBalanceComponent$startBannerTickerTimer$1(WalletBalanceComponent walletBalanceComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = walletBalanceComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WalletBalanceComponent$startBannerTickerTimer$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((WalletBalanceComponent$startBannerTickerTimer$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            CancellableFlow cancellableFlowF = FlowKt.f(FlowExtentionsKt.a());
            final WalletBalanceComponent walletBalanceComponent = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.wallet.ui.mainbalance.WalletBalanceComponent$startBannerTickerTimer$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    walletBalanceComponent.N0(WalletBalanceIntent.BannerTimerIntent.f10864a);
                    return Unit.f17538a;
                }
            };
            this.label = 1;
            if (cancellableFlowF.collect(flowCollector, this) == coroutineSingletons) {
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
