package app.chalo.home.ui.chalobus;

import androidx.compose.runtime.MutableIntState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.chalobus.ChaloBusSearchFieldWithSwapButtonCardKt$ChaloBusSearchFieldWithSwapButtonCard$2$1$5$1", f = "ChaloBusSearchFieldWithSwapButtonCard.kt", l = {}, m = "invokeSuspend", v = 1)
final class ChaloBusSearchFieldWithSwapButtonCardKt$ChaloBusSearchFieldWithSwapButtonCard$2$1$5$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $onProceedButtonShimmerShown;
    final /* synthetic */ MutableIntState $shimmerTriggerSignal$delegate;
    final /* synthetic */ int $tabLandingSignal;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloBusSearchFieldWithSwapButtonCardKt$ChaloBusSearchFieldWithSwapButtonCard$2$1$5$1(int i, Function0 function0, MutableIntState mutableIntState, Continuation continuation) {
        super(2, continuation);
        this.$tabLandingSignal = i;
        this.$onProceedButtonShimmerShown = function0;
        this.$shimmerTriggerSignal$delegate = mutableIntState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChaloBusSearchFieldWithSwapButtonCardKt$ChaloBusSearchFieldWithSwapButtonCard$2$1$5$1(this.$tabLandingSignal, this.$onProceedButtonShimmerShown, this.$shimmerTriggerSignal$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ChaloBusSearchFieldWithSwapButtonCardKt$ChaloBusSearchFieldWithSwapButtonCard$2$1$5$1 chaloBusSearchFieldWithSwapButtonCardKt$ChaloBusSearchFieldWithSwapButtonCard$2$1$5$1 = (ChaloBusSearchFieldWithSwapButtonCardKt$ChaloBusSearchFieldWithSwapButtonCard$2$1$5$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        chaloBusSearchFieldWithSwapButtonCardKt$ChaloBusSearchFieldWithSwapButtonCard$2$1$5$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        int i = this.$tabLandingSignal;
        if (i > 0) {
            this.$shimmerTriggerSignal$delegate.setIntValue(i);
            this.$onProceedButtonShimmerShown.invoke();
        }
        return Unit.f17538a;
    }
}
