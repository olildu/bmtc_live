package app.chalo.livetracking.frameworklivetracking;

import app.chalo.livetracking.frameworklivetracking.data.model.ChaloSocketRequest;
import app.chalo.livetracking.frameworklivetracking.data.model.ChaloSocketResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.frameworklivetracking.ChaloSocketFeatureImpl$startPolling$1", f = "ChaloSocketFeatureImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class ChaloSocketFeatureImpl$startPolling$1 extends SuspendLambda implements Function2<ProducerScope<? super ChaloSocketResponse>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Long> $delayInMillis;
    final /* synthetic */ ChaloSocketRequest $request;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChaloSocketFeatureImpl this$0;

    /* JADX INFO: renamed from: app.chalo.livetracking.frameworklivetracking.ChaloSocketFeatureImpl$startPolling$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.livetracking.frameworklivetracking.ChaloSocketFeatureImpl$startPolling$1$1", f = "ChaloSocketFeatureImpl.kt", l = {184}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ProducerScope<ChaloSocketResponse> $$this$channelFlow;
        int label;
        final /* synthetic */ ChaloSocketFeatureImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ChaloSocketFeatureImpl chaloSocketFeatureImpl, ProducerScope producerScope, Continuation continuation) {
            super(2, continuation);
            this.this$0 = chaloSocketFeatureImpl;
            this.$$this$channelFlow = producerScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$$this$channelFlow, continuation);
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
                ChaloSocketClient chaloSocketClient = this.this$0.f4178a;
                StateFlow stateFlow = chaloSocketClient.j;
                if (stateFlow == null) {
                    stateFlow = chaloSocketClient.i;
                }
                ChaloSocketFeatureImpl$getChaloSocketErrorStatusFlow$$inlined$map$1 chaloSocketFeatureImpl$getChaloSocketErrorStatusFlow$$inlined$map$1 = new ChaloSocketFeatureImpl$getChaloSocketErrorStatusFlow$$inlined$map$1(new ChaloSocketFeatureImpl$getChaloSocketErrorStatusFlow$$inlined$filterIsInstance$1(stateFlow));
                final ProducerScope<ChaloSocketResponse> producerScope = this.$$this$channelFlow;
                FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.livetracking.frameworklivetracking.ChaloSocketFeatureImpl.startPolling.1.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        Object objSend = producerScope.send((ChaloSocketResponse.Error) obj2, continuation);
                        return objSend == CoroutineSingletons.COROUTINE_SUSPENDED ? objSend : Unit.f17538a;
                    }
                };
                this.label = 1;
                if (chaloSocketFeatureImpl$getChaloSocketErrorStatusFlow$$inlined$map$1.collect(flowCollector, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: app.chalo.livetracking.frameworklivetracking.ChaloSocketFeatureImpl$startPolling$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.livetracking.frameworklivetracking.ChaloSocketFeatureImpl$startPolling$1$2", f = "ChaloSocketFeatureImpl.kt", l = {191}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ProducerScope<ChaloSocketResponse> $$this$channelFlow;
        final /* synthetic */ ChaloSocketRequest $request;
        int label;
        final /* synthetic */ ChaloSocketFeatureImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ChaloSocketFeatureImpl chaloSocketFeatureImpl, ChaloSocketRequest chaloSocketRequest, ProducerScope producerScope, Continuation continuation) {
            super(2, continuation);
            this.this$0 = chaloSocketFeatureImpl;
            this.$request = chaloSocketRequest;
            this.$$this$channelFlow = producerScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, this.$request, this.$$this$channelFlow, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlinx.coroutines.flow.Flow] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                ChaloSocketFeatureImpl chaloSocketFeatureImpl = this.this$0;
                ChaloSocketFeatureImpl$getResponseMessageForRequest$$inlined$map$1 chaloSocketFeatureImpl$getResponseMessageForRequest$$inlined$map$1 = new ChaloSocketFeatureImpl$getResponseMessageForRequest$$inlined$map$1(new ChaloSocketFeatureImpl$getResponseMessageForRequest$$inlined$filter$1(chaloSocketFeatureImpl.f4178a.k, this.$request));
                final ProducerScope<ChaloSocketResponse> producerScope = this.$$this$channelFlow;
                FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.livetracking.frameworklivetracking.ChaloSocketFeatureImpl.startPolling.1.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        Object objSend = producerScope.send((ChaloSocketResponse.Success) obj2, continuation);
                        return objSend == CoroutineSingletons.COROUTINE_SUSPENDED ? objSend : Unit.f17538a;
                    }
                };
                this.label = 1;
                if (chaloSocketFeatureImpl$getResponseMessageForRequest$$inlined$map$1.collect(flowCollector, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: app.chalo.livetracking.frameworklivetracking.ChaloSocketFeatureImpl$startPolling$1$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.livetracking.frameworklivetracking.ChaloSocketFeatureImpl$startPolling$1$3", f = "ChaloSocketFeatureImpl.kt", l = {195}, m = "invokeSuspend", v = 1)
    final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Long> $delayInMillis;
        final /* synthetic */ ChaloSocketRequest $request;
        int label;
        final /* synthetic */ ChaloSocketFeatureImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ChaloSocketFeatureImpl chaloSocketFeatureImpl, ChaloSocketRequest chaloSocketRequest, Function0 function0, Continuation continuation) {
            super(2, continuation);
            this.this$0 = chaloSocketFeatureImpl;
            this.$request = chaloSocketRequest;
            this.$delayInMillis = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass3(this.this$0, this.$request, this.$delayInMillis, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                ChaloSocketFeatureImpl chaloSocketFeatureImpl = this.this$0;
                ChaloSocketRequest chaloSocketRequest = this.$request;
                Function0<Long> function0 = this.$delayInMillis;
                this.label = 1;
                if (ChaloSocketFeatureImpl.g(chaloSocketFeatureImpl, chaloSocketRequest, function0, this) == coroutineSingletons) {
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
    public ChaloSocketFeatureImpl$startPolling$1(ChaloSocketFeatureImpl chaloSocketFeatureImpl, ChaloSocketRequest chaloSocketRequest, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.this$0 = chaloSocketFeatureImpl;
        this.$request = chaloSocketRequest;
        this.$delayInMillis = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChaloSocketFeatureImpl$startPolling$1 chaloSocketFeatureImpl$startPolling$1 = new ChaloSocketFeatureImpl$startPolling$1(this.this$0, this.$request, this.$delayInMillis, continuation);
        chaloSocketFeatureImpl$startPolling$1.L$0 = obj;
        return chaloSocketFeatureImpl$startPolling$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ChaloSocketFeatureImpl$startPolling$1 chaloSocketFeatureImpl$startPolling$1 = (ChaloSocketFeatureImpl$startPolling$1) create((ProducerScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        chaloSocketFeatureImpl$startPolling$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        ProducerScope producerScope = (ProducerScope) this.L$0;
        BuildersKt.d(producerScope, null, null, new AnonymousClass1(this.this$0, producerScope, null), 3);
        BuildersKt.d(producerScope, null, null, new AnonymousClass2(this.this$0, this.$request, producerScope, null), 3);
        BuildersKt.d(producerScope, null, null, new AnonymousClass3(this.this$0, this.$request, this.$delayInMillis, null), 3);
        return Unit.f17538a;
    }
}
