package app.chalo.livetracking.frameworklivetracking;

import app.chalo.livetracking.frameworklivetracking.chalosocket.model.SocketEvent;
import app.chalo.livetracking.frameworklivetracking.data.model.ChaloSocketRequest;
import app.chalo.livetracking.frameworklivetracking.data.model.ChaloSocketResponse;
import defpackage.sl;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.frameworklivetracking.ChaloSocketFeatureImpl$startSubscription$2", f = "ChaloSocketFeatureImpl.kt", l = {124}, m = "invokeSuspend", v = 1)
final class ChaloSocketFeatureImpl$startSubscription$2 extends SuspendLambda implements Function2<ProducerScope<? super ChaloSocketResponse>, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $maxRetryAllowed;
    final /* synthetic */ ChaloSocketRequest $request;
    final /* synthetic */ Function0<Long> $retrySubscribeRequestDelay;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChaloSocketFeatureImpl this$0;

    /* JADX INFO: renamed from: app.chalo.livetracking.frameworklivetracking.ChaloSocketFeatureImpl$startSubscription$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.livetracking.frameworklivetracking.ChaloSocketFeatureImpl$startSubscription$2$1", f = "ChaloSocketFeatureImpl.kt", l = {72}, m = "invokeSuspend", v = 1)
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
                FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.livetracking.frameworklivetracking.ChaloSocketFeatureImpl.startSubscription.2.1.1
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

    /* JADX INFO: renamed from: app.chalo.livetracking.frameworklivetracking.ChaloSocketFeatureImpl$startSubscription$2$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.livetracking.frameworklivetracking.ChaloSocketFeatureImpl$startSubscription$2$2", f = "ChaloSocketFeatureImpl.kt", l = {80}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ProducerScope<ChaloSocketResponse> $$this$channelFlow;
        final /* synthetic */ ChaloSocketRequest $request;
        final /* synthetic */ Ref.ObjectRef<Job> $subscriptionJob;
        int label;
        final /* synthetic */ ChaloSocketFeatureImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ChaloSocketFeatureImpl chaloSocketFeatureImpl, ChaloSocketRequest chaloSocketRequest, Ref.ObjectRef objectRef, ProducerScope producerScope, Continuation continuation) {
            super(2, continuation);
            this.this$0 = chaloSocketFeatureImpl;
            this.$request = chaloSocketRequest;
            this.$subscriptionJob = objectRef;
            this.$$this$channelFlow = producerScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, this.$request, this.$subscriptionJob, this.$$this$channelFlow, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlinx.coroutines.flow.Flow] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                ChaloSocketFeatureImpl chaloSocketFeatureImpl = this.this$0;
                ChaloSocketFeatureImpl$getResponseMessageForRequest$$inlined$map$1 chaloSocketFeatureImpl$getResponseMessageForRequest$$inlined$map$1 = new ChaloSocketFeatureImpl$getResponseMessageForRequest$$inlined$map$1(new ChaloSocketFeatureImpl$getResponseMessageForRequest$$inlined$filter$1(chaloSocketFeatureImpl.f4178a.k, this.$request));
                final Ref.ObjectRef<Job> objectRef = this.$subscriptionJob;
                final ProducerScope<ChaloSocketResponse> producerScope = this.$$this$channelFlow;
                FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.livetracking.frameworklivetracking.ChaloSocketFeatureImpl.startSubscription.2.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        ChaloSocketResponse.Success success = (ChaloSocketResponse.Success) obj2;
                        Job job = (Job) objectRef.element;
                        if (job != null) {
                            job.cancel(null);
                        }
                        Object objSend = producerScope.send(success, continuation);
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

    /* JADX INFO: renamed from: app.chalo.livetracking.frameworklivetracking.ChaloSocketFeatureImpl$startSubscription$2$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.livetracking.frameworklivetracking.ChaloSocketFeatureImpl$startSubscription$2$3", f = "ChaloSocketFeatureImpl.kt", l = {97, 103, 107}, m = "invokeSuspend", v = 1)
    final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ProducerScope<ChaloSocketResponse> $$this$channelFlow;
        final /* synthetic */ int $maxRetryAllowed;
        final /* synthetic */ ChaloSocketRequest $request;
        final /* synthetic */ Function0<Long> $retrySubscribeRequestDelay;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ ChaloSocketFeatureImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(int i, ChaloSocketFeatureImpl chaloSocketFeatureImpl, ChaloSocketRequest chaloSocketRequest, Function0 function0, ProducerScope producerScope, Continuation continuation) {
            super(2, continuation);
            this.$maxRetryAllowed = i;
            this.this$0 = chaloSocketFeatureImpl;
            this.$request = chaloSocketRequest;
            this.$retrySubscribeRequestDelay = function0;
            this.$$this$channelFlow = producerScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$maxRetryAllowed, this.this$0, this.$request, this.$retrySubscribeRequestDelay, this.$$this$channelFlow, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x00c6  */
        /* JADX WARN: Code duplicated, block: B:29:0x00cc  */
        /* JADX WARN: Code duplicated, block: B:32:0x00f9  */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00c3, code lost:
        
            if (kotlinx.coroutines.DelayKt.b(r9, r14) == r0) goto L31;
         */
        /* JADX WARN: Instruction removed from duplicated block: B:29:0x00cc, please report this as an issue */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00c3 -> B:11:0x0032). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 262
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.frameworklivetracking.ChaloSocketFeatureImpl$startSubscription$2.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloSocketFeatureImpl$startSubscription$2(int i, ChaloSocketFeatureImpl chaloSocketFeatureImpl, ChaloSocketRequest chaloSocketRequest, Continuation continuation, Function0 function0) {
        super(2, continuation);
        this.$retrySubscribeRequestDelay = function0;
        this.this$0 = chaloSocketFeatureImpl;
        this.$request = chaloSocketRequest;
        this.$maxRetryAllowed = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Function0<Long> function0 = this.$retrySubscribeRequestDelay;
        ChaloSocketFeatureImpl$startSubscription$2 chaloSocketFeatureImpl$startSubscription$2 = new ChaloSocketFeatureImpl$startSubscription$2(this.$maxRetryAllowed, this.this$0, this.$request, continuation, function0);
        chaloSocketFeatureImpl$startSubscription$2.L$0 = obj;
        return chaloSocketFeatureImpl$startSubscription$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloSocketFeatureImpl$startSubscription$2) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, kotlinx.coroutines.Job] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            ProducerScope producerScope = (ProducerScope) this.L$0;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            BuildersKt.d(producerScope, null, null, new AnonymousClass1(this.this$0, producerScope, null), 3);
            BuildersKt.d(producerScope, null, null, new AnonymousClass2(this.this$0, this.$request, objectRef, producerScope, null), 3);
            Function0<Long> function0 = this.$retrySubscribeRequestDelay;
            if (function0 != null) {
                ?? D = BuildersKt.d(producerScope, null, null, new AnonymousClass3(this.$maxRetryAllowed, this.this$0, this.$request, function0, producerScope, null), 3);
                ((JobSupport) D).w(new sl(objectRef, 0));
                objectRef.element = D;
            } else {
                ChaloSocketClient chaloSocketClient = this.this$0.f4178a;
                SocketEvent socketEvent = SocketEvent.Subscribe;
                Json.Default r12 = Json.d;
                ChaloSocketRequest chaloSocketRequest = this.$request;
                r12.getClass();
                String[] strArr = {r12.a(ChaloSocketRequest.INSTANCE.serializer(), chaloSocketRequest)};
                this.label = 1;
                if (BuildersKt.g(getContext(), new ChaloSocketClient$sendMessage$2(chaloSocketClient, strArr, socketEvent, null, null), this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
