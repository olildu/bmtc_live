package app.chalo.compose;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.compose.ProceedButtonShineOverlayKt$ProceedButtonShineOverlay$1$1", f = "ProceedButtonShineOverlay.kt", l = {63}, m = "invokeSuspend", v = 1)
final class ProceedButtonShineOverlayKt$ProceedButtonShineOverlay$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $animationDurationMillis;
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ MutableState<Integer> $lastHandledTriggerSignal$delegate;
    final /* synthetic */ MutableState<Boolean> $showShineOverlay$delegate;
    final /* synthetic */ int $triggerSignal;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProceedButtonShineOverlayKt$ProceedButtonShineOverlay$1$1(int i, boolean z, int i2, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.$triggerSignal = i;
        this.$isEnabled = z;
        this.$animationDurationMillis = i2;
        this.$lastHandledTriggerSignal$delegate = mutableState;
        this.$showShineOverlay$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProceedButtonShineOverlayKt$ProceedButtonShineOverlay$1$1(this.$triggerSignal, this.$isEnabled, this.$animationDurationMillis, this.$lastHandledTriggerSignal$delegate, this.$showShineOverlay$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProceedButtonShineOverlayKt$ProceedButtonShineOverlay$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                int i2 = this.$triggerSignal;
                if (i2 <= 0 || i2 == this.$lastHandledTriggerSignal$delegate.getValue().intValue() || !this.$isEnabled) {
                    return unit;
                }
                this.$lastHandledTriggerSignal$delegate.setValue(Integer.valueOf(this.$triggerSignal));
                this.$showShineOverlay$delegate.setValue(Boolean.TRUE);
                long j = this.$animationDurationMillis;
                this.label = 1;
                if (DelayKt.b(j, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            this.$showShineOverlay$delegate.setValue(Boolean.FALSE);
            return unit;
        } catch (Throwable th) {
            this.$showShineOverlay$delegate.setValue(Boolean.FALSE);
            throw th;
        }
    }
}
