package app.chalo.juspay;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.Deferred;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lapp/chalo/juspay/JuspayControllerImpl$TerminalOutcome;", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.juspay.JuspayControllerImpl$executeAwaitingTerminal$2$1$outcome$1$2", f = "JuspayControllerImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class JuspayControllerImpl$executeAwaitingTerminal$2$1$outcome$1$2 extends SuspendLambda implements Function2<Unit, Continuation<? super JuspayControllerImpl.TerminalOutcome>, Object> {
    final /* synthetic */ Deferred<JuspayControllerImpl.TerminalOutcome> $terminal;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JuspayControllerImpl$executeAwaitingTerminal$2$1$outcome$1$2(Deferred deferred, Continuation continuation) {
        super(2, continuation);
        this.$terminal = deferred;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new JuspayControllerImpl$executeAwaitingTerminal$2$1$outcome$1$2(this.$terminal, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((JuspayControllerImpl$executeAwaitingTerminal$2$1$outcome$1$2) create((Unit) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        this.$terminal.cancel(null);
        return null;
    }
}
