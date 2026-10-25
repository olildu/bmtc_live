package app.chalo.resultstatemanager;

import app.chalo.utils.SystemHelper;
import com.arkivanov.essenty.statekeeper.StateKeeper;
import defpackage.eu0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.SerializationStrategy;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/resultstatemanager/ResultStateManager;", "T", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ResultStateManager<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SystemHelper f9043a;
    public final MutableStateFlow b = StateFlowKt.a(EmptyList.f17557a);

    public ResultStateManager(SystemHelper systemHelper) {
        this.f9043a = systemHelper;
    }

    public final ResultStateRecoveredData a(String str, StateKeeper stateKeeper, SerializationStrategy serializationStrategy, DeserializationStrategy deserializationStrategy, Function0 function0) {
        Intrinsics.i(stateKeeper, "stateKeeper");
        Intrinsics.i(serializationStrategy, "serializationStrategy");
        Intrinsics.i(deserializationStrategy, "deserializationStrategy");
        final ResultStateKeeperMeta resultStateKeeperMeta = (ResultStateKeeperMeta) stateKeeper.a(str, deserializationStrategy);
        if (stateKeeper.c(str)) {
            stateKeeper.b(str);
        }
        stateKeeper.d(str, serializationStrategy, function0);
        if (resultStateKeeperMeta == null) {
            return null;
        }
        final MutableStateFlow mutableStateFlow = this.b;
        final Flow flowM = FlowKt.m(new Flow<ResultStateDataHolder<Object>>() { // from class: app.chalo.resultstatemanager.ResultStateManager$recoverResultFlowFor$$inlined$mapNotNull$1

            /* JADX INFO: renamed from: app.chalo.resultstatemanager.ResultStateManager$recoverResultFlowFor$$inlined$mapNotNull$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f9047a;
                public final /* synthetic */ ResultStateKeeperMeta b;

                /* JADX INFO: renamed from: app.chalo.resultstatemanager.ResultStateManager$recoverResultFlowFor$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.resultstatemanager.ResultStateManager$recoverResultFlowFor$$inlined$mapNotNull$1$2", f = "ResultStateManager.kt", l = {70}, m = "emit", v = 1)
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

                public AnonymousClass2(FlowCollector flowCollector, ResultStateKeeperMeta resultStateKeeperMeta) {
                    this.f9047a = flowCollector;
                    this.b = resultStateKeeperMeta;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    Object obj2;
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
                    Object obj3 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.b(obj3);
                        ArrayList arrayList = new ArrayList();
                        for (T t : (List) obj) {
                            if (Intrinsics.d(((ResultStateDataHolder) t).f9040a, this.b.f9041a)) {
                                arrayList.add(t);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (it.hasNext()) {
                                long j = ((ResultStateDataHolder) next).c;
                                do {
                                    Object next2 = it.next();
                                    long j2 = ((ResultStateDataHolder) next2).c;
                                    if (j < j2) {
                                        next = next2;
                                        j = j2;
                                    }
                                } while (it.hasNext());
                            }
                            obj2 = next;
                        } else {
                            obj2 = null;
                        }
                        if (obj2 != null) {
                            anonymousClass1.label = 1;
                            if (this.f9047a.emit(obj2, anonymousClass1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj3);
                    }
                    return Unit.f17538a;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = mutableStateFlow.collect(new AnonymousClass2(flowCollector, resultStateKeeperMeta), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        });
        return new ResultStateRecoveredData(resultStateKeeperMeta, FlowKt.m(new Flow<Object>() { // from class: app.chalo.resultstatemanager.ResultStateManager$recoverResultFlowFor$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.resultstatemanager.ResultStateManager$recoverResultFlowFor$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f9045a;

                /* JADX INFO: renamed from: app.chalo.resultstatemanager.ResultStateManager$recoverResultFlowFor$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.resultstatemanager.ResultStateManager$recoverResultFlowFor$$inlined$map$1$2", f = "ResultStateManager.kt", l = {50}, m = "emit", v = 1)
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
                    this.f9045a = flowCollector;
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
                        Object obj3 = ((ResultStateDataHolder) obj).b;
                        anonymousClass1.label = 1;
                        if (this.f9045a.emit(obj3, anonymousClass1) == coroutineSingletons) {
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
                Object objCollect = flowM.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        }));
    }

    public final Flow b(final String requestId) {
        Intrinsics.i(requestId, "requestId");
        final long j = this.f9043a.j();
        final MutableStateFlow mutableStateFlow = this.b;
        final Flow flowM = FlowKt.m(new Flow<ResultStateDataHolder<Object>>() { // from class: app.chalo.resultstatemanager.ResultStateManager$resultFlowFor-4c8t_4U$$inlined$mapNotNull$1

            /* JADX INFO: renamed from: app.chalo.resultstatemanager.ResultStateManager$resultFlowFor-4c8t_4U$$inlined$mapNotNull$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f9051a;
                public final /* synthetic */ String b;
                public final /* synthetic */ long c;

                /* JADX INFO: renamed from: app.chalo.resultstatemanager.ResultStateManager$resultFlowFor-4c8t_4U$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.resultstatemanager.ResultStateManager$resultFlowFor-4c8t_4U$$inlined$mapNotNull$1$2", f = "ResultStateManager.kt", l = {53}, m = "emit", v = 1)
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

                public AnonymousClass2(FlowCollector flowCollector, String str, long j) {
                    this.f9051a = flowCollector;
                    this.b = str;
                    this.c = j;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    Object next;
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
                        Iterator<T> it = ((List) obj).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            ResultStateDataHolder resultStateDataHolder = (ResultStateDataHolder) next;
                            if (Intrinsics.d(resultStateDataHolder.f9040a, this.b) && resultStateDataHolder.c >= this.c) {
                                break;
                            }
                        }
                        if (next != null) {
                            anonymousClass1.label = 1;
                            if (this.f9051a.emit(next, anonymousClass1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
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
                Object objCollect = mutableStateFlow.collect(new AnonymousClass2(flowCollector, requestId, j), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        });
        return FlowKt.m(new Flow<Object>() { // from class: app.chalo.resultstatemanager.ResultStateManager$resultFlowFor-4c8t_4U$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.resultstatemanager.ResultStateManager$resultFlowFor-4c8t_4U$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f9049a;

                /* JADX INFO: renamed from: app.chalo.resultstatemanager.ResultStateManager$resultFlowFor-4c8t_4U$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.resultstatemanager.ResultStateManager$resultFlowFor-4c8t_4U$$inlined$map$1$2", f = "ResultStateManager.kt", l = {50}, m = "emit", v = 1)
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
                    this.f9049a = flowCollector;
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
                        Object obj3 = ((ResultStateDataHolder) obj).b;
                        anonymousClass1.label = 1;
                        if (this.f9049a.emit(obj3, anonymousClass1) == coroutineSingletons) {
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
                Object objCollect = flowM.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        });
    }

    public final void c(Object obj, String requestId) {
        MutableStateFlow mutableStateFlow;
        Object value;
        ArrayList arrayListE0;
        Intrinsics.i(requestId, "requestId");
        long j = this.f9043a.j();
        do {
            mutableStateFlow = this.b;
            value = mutableStateFlow.getValue();
            arrayListE0 = CollectionsKt.E0((List) value);
            CollectionsKt.j0(arrayListE0, new eu0(requestId, 29));
            arrayListE0.add(new ResultStateDataHolder(requestId, obj, j));
        } while (!mutableStateFlow.c(value, arrayListE0));
    }
}
