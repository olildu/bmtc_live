package app.chalo.extensions;

import androidx.media3.extractor.ts.TsExtractor;
import defpackage.wb;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.extensions.FlowExtentionsKt$cancelIfNoValueTill$1", f = "FlowExtentions.kt", l = {94}, m = "invokeSuspend", v = 1)
final class FlowExtentionsKt$cancelIfNoValueTill$1 extends SuspendLambda implements Function2<ProducerScope<Object>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow<Object> $this_cancelIfNoValueTill;
    final /* synthetic */ long $timeOutInMillis;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: app.chalo.extensions.FlowExtentionsKt$cancelIfNoValueTill$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.extensions.FlowExtentionsKt$cancelIfNoValueTill$1$1", f = "FlowExtentions.kt", l = {TsExtractor.TS_STREAM_TYPE_DVBSUBS}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ProducerScope<Object> $$this$channelFlow;
        final /* synthetic */ Flow<Object> $this_cancelIfNoValueTill;
        final /* synthetic */ Job $timerJob;
        int label;

        /* JADX INFO: renamed from: app.chalo.extensions.FlowExtentionsKt$cancelIfNoValueTill$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "app.chalo.extensions.FlowExtentionsKt$cancelIfNoValueTill$1$1$1", f = "FlowExtentions.kt", l = {}, m = "invokeSuspend", v = 1)
        final class C01051 extends SuspendLambda implements Function3<FlowCollector<Object>, Throwable, Continuation<? super Unit>, Object> {
            final /* synthetic */ ProducerScope<Object> $$this$channelFlow;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01051(ProducerScope producerScope, Continuation continuation) {
                super(3, continuation);
                this.$$this$channelFlow = producerScope;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                C01051 c01051 = new C01051(this.$$this$channelFlow, (Continuation) obj3);
                Unit unit = Unit.f17538a;
                c01051.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                this.$$this$channelFlow.close(null);
                return Unit.f17538a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Flow flow, ProducerScope producerScope, Job job, Continuation continuation) {
            super(2, continuation);
            this.$this_cancelIfNoValueTill = flow;
            this.$$this$channelFlow = producerScope;
            this.$timerJob = job;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$this_cancelIfNoValueTill, this.$$this$channelFlow, this.$timerJob, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 = new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(this.$this_cancelIfNoValueTill, new C01051(this.$$this$channelFlow, null));
                final Job job = this.$timerJob;
                final ProducerScope<Object> producerScope = this.$$this$channelFlow;
                FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.extensions.FlowExtentionsKt.cancelIfNoValueTill.1.1.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        job.cancel(null);
                        Object objSend = producerScope.send(obj2, continuation);
                        return objSend == CoroutineSingletons.COROUTINE_SUSPENDED ? objSend : Unit.f17538a;
                    }
                };
                this.label = 1;
                if (flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.collect(flowCollector, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtentionsKt$cancelIfNoValueTill$1(long j, Flow flow, Continuation continuation) {
        super(2, continuation);
        this.$timeOutInMillis = j;
        this.$this_cancelIfNoValueTill = flow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FlowExtentionsKt$cancelIfNoValueTill$1 flowExtentionsKt$cancelIfNoValueTill$1 = new FlowExtentionsKt$cancelIfNoValueTill$1(this.$timeOutInMillis, this.$this_cancelIfNoValueTill, continuation);
        flowExtentionsKt$cancelIfNoValueTill$1.L$0 = obj;
        return flowExtentionsKt$cancelIfNoValueTill$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowExtentionsKt$cancelIfNoValueTill$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            ProducerScope producerScope = (ProducerScope) this.L$0;
            BuildersKt.d(producerScope, null, null, new AnonymousClass1(this.$this_cancelIfNoValueTill, producerScope, BuildersKt.d(producerScope, null, null, new FlowExtentionsKt$cancelIfNoValueTill$1$timerJob$1(this.$timeOutInMillis, producerScope, null), 3), null), 3);
            this.label = 1;
            if (ProduceKt.a(producerScope, new wb(8), this) == coroutineSingletons) {
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
