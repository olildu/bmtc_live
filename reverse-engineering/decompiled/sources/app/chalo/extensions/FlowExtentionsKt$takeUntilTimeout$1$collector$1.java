package app.chalo.extensions;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.extensions.FlowExtentionsKt$takeUntilTimeout$1$collector$1", f = "FlowExtentions.kt", l = {21}, m = "invokeSuspend", v = 1)
final class FlowExtentionsKt$takeUntilTimeout$1$collector$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ProducerScope<Object> $$this$channelFlow;
    final /* synthetic */ Flow<Object> $this_takeUntilTimeout;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtentionsKt$takeUntilTimeout$1$collector$1(Flow flow, ProducerScope producerScope, Continuation continuation) {
        super(2, continuation);
        this.$this_takeUntilTimeout = flow;
        this.$$this$channelFlow = producerScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FlowExtentionsKt$takeUntilTimeout$1$collector$1(this.$this_takeUntilTimeout, this.$$this$channelFlow, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowExtentionsKt$takeUntilTimeout$1$collector$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            Flow<Object> flow = this.$this_takeUntilTimeout;
            final ProducerScope<Object> producerScope = this.$$this$channelFlow;
            FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.extensions.FlowExtentionsKt$takeUntilTimeout$1$collector$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    Object objSend = producerScope.send(obj2, continuation);
                    return objSend == CoroutineSingletons.COROUTINE_SUSPENDED ? objSend : Unit.f17538a;
                }
            };
            this.label = 1;
            if (flow.collect(flowCollector, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        this.$$this$channelFlow.close(null);
        return Unit.f17538a;
    }
}
