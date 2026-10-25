package app.chalo.helper;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.helper.CoroutineScopeHelperImpl$coroutineScope$1", f = "CoroutineScopeHelper.kt", l = {86}, m = "invokeSuspend", v = 1)
final class CoroutineScopeHelperImpl$coroutineScope$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CoroutineScope>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ CoroutineScopeHelperImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineScopeHelperImpl$coroutineScope$1(CoroutineScopeHelperImpl coroutineScopeHelperImpl, Continuation continuation) {
        super(2, continuation);
        this.this$0 = coroutineScopeHelperImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CoroutineScopeHelperImpl$coroutineScope$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CoroutineScopeHelperImpl$coroutineScope$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Mutex mutex;
        CoroutineScopeHelperImpl coroutineScopeHelperImpl;
        ContextScope contextScope;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            CoroutineScopeHelperImpl coroutineScopeHelperImpl2 = this.this$0;
            mutex = coroutineScopeHelperImpl2.d;
            this.L$0 = mutex;
            this.L$1 = coroutineScopeHelperImpl2;
            this.label = 1;
            if (mutex.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            coroutineScopeHelperImpl = coroutineScopeHelperImpl2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScopeHelperImpl = (CoroutineScopeHelperImpl) this.L$1;
            mutex = (Mutex) this.L$0;
            ResultKt.b(obj);
        }
        try {
            if (((Number) coroutineScopeHelperImpl.b.g().getValue()).intValue() == 0) {
                return null;
            }
            ContextScope contextScope2 = coroutineScopeHelperImpl.c;
            if (contextScope2 == null || !CoroutineScopeKt.e(contextScope2)) {
                ContextScope contextScopeA = CoroutineScopeKt.a(coroutineScopeHelperImpl.f2831a.getDefault());
                coroutineScopeHelperImpl.c = contextScopeA;
                final StateFlow stateFlowG = coroutineScopeHelperImpl.b.g();
                FlowKt.A(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(FlowKt.m(new Flow<Boolean>() { // from class: app.chalo.helper.CoroutineScopeHelperImpl$monitorSubscriberCount$$inlined$map$1

                    /* JADX INFO: renamed from: app.chalo.helper.CoroutineScopeHelperImpl$monitorSubscriberCount$$inlined$map$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    public final class AnonymousClass2<T> implements FlowCollector {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ FlowCollector f2833a;

                        /* JADX INFO: renamed from: app.chalo.helper.CoroutineScopeHelperImpl$monitorSubscriberCount$$inlined$map$1$2$1, reason: invalid class name */
                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        @DebugMetadata(c = "app.chalo.helper.CoroutineScopeHelperImpl$monitorSubscriberCount$$inlined$map$1$2", f = "CoroutineScopeHelper.kt", l = {50}, m = "emit", v = 1)
                        public final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.f2833a = flowCollector;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                            Object obj2 = anonymousClass1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.b(obj2);
                                Boolean boolValueOf = Boolean.valueOf(((Number) obj).intValue() >= 1);
                                anonymousClass1.label = 1;
                                if (this.f2833a.emit(boolValueOf, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.b(obj2);
                            }
                            return Unit.f17538a;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                        Object objCollect = stateFlowG.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
                    }
                }), new CoroutineScopeHelperImpl$monitorSubscriberCount$2(coroutineScopeHelperImpl, null)), contextScopeA);
                contextScope = contextScopeA;
            } else {
                contextScope = coroutineScopeHelperImpl.c;
            }
            return contextScope;
        } finally {
            mutex.e(null);
        }
    }
}
