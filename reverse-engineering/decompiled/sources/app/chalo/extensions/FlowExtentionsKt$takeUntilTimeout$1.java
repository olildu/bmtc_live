package app.chalo.extensions;

import app.chalo.exceptions.OperationTimedOutException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.extensions.FlowExtentionsKt$takeUntilTimeout$1", f = "FlowExtentions.kt", l = {26}, m = "invokeSuspend", v = 1)
final class FlowExtentionsKt$takeUntilTimeout$1 extends SuspendLambda implements Function2<ProducerScope<Object>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow<Object> $this_takeUntilTimeout;
    final /* synthetic */ long $timeoutMillis;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtentionsKt$takeUntilTimeout$1(long j, Flow flow, Continuation continuation) {
        super(2, continuation);
        this.$timeoutMillis = j;
        this.$this_takeUntilTimeout = flow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FlowExtentionsKt$takeUntilTimeout$1 flowExtentionsKt$takeUntilTimeout$1 = new FlowExtentionsKt$takeUntilTimeout$1(this.$timeoutMillis, this.$this_takeUntilTimeout, continuation);
        flowExtentionsKt$takeUntilTimeout$1.L$0 = obj;
        return flowExtentionsKt$takeUntilTimeout$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowExtentionsKt$takeUntilTimeout$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ProducerScope producerScope;
        Job job;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            producerScope = (ProducerScope) this.L$0;
            Job jobD = BuildersKt.d(producerScope, null, null, new FlowExtentionsKt$takeUntilTimeout$1$collector$1(this.$this_takeUntilTimeout, producerScope, null), 3);
            long j = this.$timeoutMillis;
            this.L$0 = producerScope;
            this.L$1 = jobD;
            this.label = 1;
            if (DelayKt.b(j, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            job = jobD;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            job = (Job) this.L$1;
            producerScope = (ProducerScope) this.L$0;
            ResultKt.b(obj);
        }
        job.cancel(ExceptionsKt.a("timedOut", new OperationTimedOutException()));
        producerScope.close(null);
        return Unit.f17538a;
    }
}
