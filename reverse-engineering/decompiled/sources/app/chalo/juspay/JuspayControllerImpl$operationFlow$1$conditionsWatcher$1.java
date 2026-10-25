package app.chalo.juspay;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.juspay.JuspayControllerImpl$operationFlow$1$conditionsWatcher$1", f = "JuspayControllerImpl.kt", l = {541}, m = "invokeSuspend", v = 1)
final class JuspayControllerImpl$operationFlow$1$conditionsWatcher$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ProducerScope<JuspayOperationUpdate> $$this$channelFlow;
    final /* synthetic */ JuspayInitiateConditions $conditionSnapshot;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ JuspayControllerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JuspayControllerImpl$operationFlow$1$conditionsWatcher$1(JuspayControllerImpl juspayControllerImpl, JuspayInitiateConditions juspayInitiateConditions, ProducerScope producerScope, Continuation continuation) {
        super(2, continuation);
        this.this$0 = juspayControllerImpl;
        this.$conditionSnapshot = juspayInitiateConditions;
        this.$$this$channelFlow = producerScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        JuspayControllerImpl$operationFlow$1$conditionsWatcher$1 juspayControllerImpl$operationFlow$1$conditionsWatcher$1 = new JuspayControllerImpl$operationFlow$1$conditionsWatcher$1(this.this$0, this.$conditionSnapshot, this.$$this$channelFlow, continuation);
        juspayControllerImpl$operationFlow$1$conditionsWatcher$1.L$0 = obj;
        return juspayControllerImpl$operationFlow$1$conditionsWatcher$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((JuspayControllerImpl$operationFlow$1$conditionsWatcher$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            coroutineScope = (CoroutineScope) this.L$0;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.b(obj);
        }
        while (CoroutineScopeKt.e(coroutineScope)) {
            if (!this.this$0.q(this.$conditionSnapshot)) {
                this.$$this$channelFlow.mo7576trySendJP2dKIU(JuspayOperationUpdate.Abandoned.f4060a);
                this.$$this$channelFlow.close(null);
                break;
            }
            this.L$0 = coroutineScope;
            this.label = 1;
            if (DelayKt.b(1000L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return Unit.f17538a;
    }
}
