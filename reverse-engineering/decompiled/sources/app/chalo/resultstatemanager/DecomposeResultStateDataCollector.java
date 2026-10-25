package app.chalo.resultstatemanager;

import com.arkivanov.essenty.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/resultstatemanager/DecomposeResultStateDataCollector;", "Lapp/chalo/resultstatemanager/ResultStateDataCollector;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DecomposeResultStateDataCollector implements ResultStateDataCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lifecycle f9033a;

    public DecomposeResultStateDataCollector(Lifecycle lifecycle) {
        Intrinsics.i(lifecycle, "lifecycle");
        this.f9033a = lifecycle;
    }

    @Override // app.chalo.resultstatemanager.ResultStateDataCollector
    public final Object v(final Flow flow, Continuation continuation) {
        return FlowKt.t(new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new Flow<ResultDataInternalState.DataFlowState<Object>>() { // from class: app.chalo.resultstatemanager.DecomposeResultStateDataCollector$dataStateFlow-Rdi9GoI$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.resultstatemanager.DecomposeResultStateDataCollector$dataStateFlow-Rdi9GoI$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f9035a;

                /* JADX INFO: renamed from: app.chalo.resultstatemanager.DecomposeResultStateDataCollector$dataStateFlow-Rdi9GoI$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.resultstatemanager.DecomposeResultStateDataCollector$dataStateFlow-Rdi9GoI$$inlined$map$1$2", f = "ResultStateDataCollector.kt", l = {50}, m = "emit", v = 1)
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
                    this.f9035a = flowCollector;
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
                        ResultDataInternalState.DataFlowState.ResultReceived resultReceived = new ResultDataInternalState.DataFlowState.ResultReceived(obj);
                        anonymousClass1.label = 1;
                        if (this.f9035a.emit(resultReceived, anonymousClass1) == coroutineSingletons) {
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
            public final Object collect(FlowCollector flowCollector, Continuation continuation2) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation2);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        }, new DecomposeResultStateDataCollector$dataStateFlow$2(2, null)), new FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1(FlowKt.e(new DecomposeResultStateDataCollector$lifecycleFlow$1(this, null)), new ResultDataInternalState.LifecycleTransition(null, null), new DecomposeResultStateDataCollector$lifecycleTransitionFlow$1(3, null)), new DecomposeResultStateDataCollector$awaitResult$2(3, this, DecomposeResultStateDataCollector.class, "evaluateResultStateData", "evaluateResultStateData(Lapp/chalo/resultstatemanager/ResultDataInternalState$DataFlowState;Lapp/chalo/resultstatemanager/ResultDataInternalState$LifecycleTransition;)Lapp/chalo/resultstatemanager/ResultStateData;", 4))), continuation);
    }
}
