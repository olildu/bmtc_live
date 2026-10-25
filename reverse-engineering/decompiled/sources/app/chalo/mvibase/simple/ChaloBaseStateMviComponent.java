package app.chalo.mvibase.simple;

import app.chalo.resultstatemanager.DecomposeResultStateDataCollector;
import app.chalo.resultstatemanager.ResultStateDataCollector;
import app.chalo.utils.KAtomicInt;
import app.chalo.utils.chalologger.ChaloLog;
import com.arkivanov.decompose.ComponentContext;
import com.arkivanov.decompose.ComponentContextFactory;
import com.arkivanov.decompose.value.MutableValue;
import com.arkivanov.decompose.value.MutableValueBuilderKt;
import com.arkivanov.essenty.backhandler.BackHandler;
import com.arkivanov.essenty.instancekeeper.InstanceKeeper;
import com.arkivanov.essenty.lifecycle.Lifecycle;
import com.arkivanov.essenty.lifecycle.LifecycleExtKt;
import com.arkivanov.essenty.lifecycle.coroutines.CoroutineScopeWithLifecycleKt;
import com.arkivanov.essenty.statekeeper.StateKeeper;
import defpackage.ig;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u0002*\b\b\u0002\u0010\u0004*\u00020\u0002*\b\b\u0003\u0010\u0005*\u00020\u00022\u00020\u00062\u00020\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "ViewIntent", "", "DataState", "ViewState", "ViewSideEffect", "Lcom/arkivanov/decompose/ComponentContext;", "Lapp/chalo/resultstatemanager/ResultStateDataCollector;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ChaloBaseStateMviComponent<ViewIntent, DataState, ViewState, ViewSideEffect> implements ComponentContext, ResultStateDataCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ComponentContext f5983a;
    public final /* synthetic */ DecomposeResultStateDataCollector b;
    public final String c;
    public boolean d;
    public final MutableStateFlow e;
    public final StateFlow f;
    public final Lazy g;
    public final BufferedChannel h;
    public final Lazy i;
    public final ContextScope j;

    public ChaloBaseStateMviComponent(ComponentContext componentContext) {
        Intrinsics.i(componentContext, "componentContext");
        this.f5983a = componentContext;
        this.b = new DecomposeResultStateDataCollector(componentContext.getF12286a());
        this.c = "ChaloBaseStateMviComponent";
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(u0());
        this.e = mutableStateFlowA;
        this.f = FlowKt.c(mutableStateFlowA);
        this.g = LazyKt.b(new Function0() { // from class: app.chalo.mvibase.simple.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ChaloBaseStateMviComponent chaloBaseStateMviComponent = this.f6003a;
                MutableValue mutableValueA = MutableValueBuilderKt.a(chaloBaseStateMviComponent.v0());
                BuildersKt.d(chaloBaseStateMviComponent.j, null, null, new ChaloBaseStateMviComponent$_viewState$2$1(chaloBaseStateMviComponent, mutableValueA, null), 3);
                LifecycleExtKt.a(chaloBaseStateMviComponent.f5983a.getF12286a(), new ig(chaloBaseStateMviComponent, 1), new ig(chaloBaseStateMviComponent, 2), new ig(chaloBaseStateMviComponent, 3), new ig(chaloBaseStateMviComponent, 4), new ig(chaloBaseStateMviComponent, 5), 1);
                return mutableValueA;
            }
        });
        this.h = ChannelKt.a(-2, 6, null);
        this.i = LazyKt.b(new ig(this, 0));
        DefaultScheduler defaultScheduler = Dispatchers.f17721a;
        this.j = CoroutineScopeWithLifecycleKt.a(this, MainDispatcherLoader.f17879a.g().plus(SupervisorKt.b()));
    }

    @Override // com.arkivanov.decompose.ComponentContextFactoryOwner
    /* JADX INFO: renamed from: A */
    public final ComponentContextFactory getE() {
        return this.f5983a.getE();
    }

    public void C0(Object obj) {
        ChaloLog.b(this.c, "ViewIntent = " + obj);
    }

    public final Job D0(Function2 function2) {
        return BuildersKt.d(this.j, null, null, new ChaloBaseStateMviComponent$repeatOnStarted$1(this, function2, null), 3);
    }

    public final void E0(Function1 block) {
        MutableStateFlow mutableStateFlow;
        Object value;
        Intrinsics.i(block, "block");
        do {
            mutableStateFlow = this.e;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.c(value, block.invoke(value)));
    }

    @Override // com.arkivanov.essenty.instancekeeper.InstanceKeeperOwner
    /* JADX INFO: renamed from: O */
    public final InstanceKeeper getC() {
        return this.f5983a.getC();
    }

    @Override // com.arkivanov.essenty.statekeeper.StateKeeperOwner
    /* JADX INFO: renamed from: f0 */
    public final StateKeeper getB() {
        return this.f5983a.getB();
    }

    @Override // com.arkivanov.essenty.lifecycle.LifecycleOwner
    /* JADX INFO: renamed from: getLifecycle */
    public final Lifecycle getF12286a() {
        return this.f5983a.getF12286a();
    }

    @Override // com.arkivanov.essenty.backhandler.BackHandlerOwner
    /* JADX INFO: renamed from: j */
    public final BackHandler getD() {
        return this.f5983a.getD();
    }

    public final Object o0(final Flow flow, Function2 function2, SuspendLambda suspendLambda) {
        final KAtomicInt kAtomicInt = new KAtomicInt();
        Flow<Pair<Object, ? extends Integer>> flow2 = new Flow<Pair<Object, ? extends Integer>>() { // from class: app.chalo.mvibase.simple.ChaloBaseStateMviComponent$collectWhenViewStateActive$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.mvibase.simple.ChaloBaseStateMviComponent$collectWhenViewStateActive$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f5988a;
                public final /* synthetic */ KAtomicInt b;

                /* JADX INFO: renamed from: app.chalo.mvibase.simple.ChaloBaseStateMviComponent$collectWhenViewStateActive$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.mvibase.simple.ChaloBaseStateMviComponent$collectWhenViewStateActive$$inlined$map$1$2", f = "ChaloBaseStateMviComponent.kt", l = {50}, m = "emit", v = 1)
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

                public AnonymousClass2(FlowCollector flowCollector, KAtomicInt kAtomicInt) {
                    this.f5988a = flowCollector;
                    this.b = kAtomicInt;
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
                        Pair pair = new Pair(obj, new Integer(this.b.f10428a.incrementAndGet()));
                        anonymousClass1.label = 1;
                        if (this.f5988a.emit(pair, anonymousClass1) == coroutineSingletons) {
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
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector, kAtomicInt), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
        final StateFlow stateFlowG = ((AbstractSharedFlow) this.e).g();
        final FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(FlowKt.m(new Flow<Boolean>() { // from class: app.chalo.mvibase.simple.ChaloBaseStateMviComponent$viewStateActiveStatusFlow$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.mvibase.simple.ChaloBaseStateMviComponent$viewStateActiveStatusFlow$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f5997a;

                /* JADX INFO: renamed from: app.chalo.mvibase.simple.ChaloBaseStateMviComponent$viewStateActiveStatusFlow$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.mvibase.simple.ChaloBaseStateMviComponent$viewStateActiveStatusFlow$$inlined$map$1$2", f = "ChaloBaseStateMviComponent.kt", l = {50}, m = "emit", v = 1)
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
                    this.f5997a = flowCollector;
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
                        if (this.f5997a.emit(boolValueOf, anonymousClass1) == coroutineSingletons) {
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
        }), flow2, new ChaloBaseStateMviComponent$collectWhenViewStateActive$2(3, null));
        final Flow flowM = FlowKt.m(new Flow<Object>() { // from class: app.chalo.mvibase.simple.ChaloBaseStateMviComponent$collectWhenViewStateActive$$inlined$filterIsInstance$1

            /* JADX INFO: renamed from: app.chalo.mvibase.simple.ChaloBaseStateMviComponent$collectWhenViewStateActive$$inlined$filterIsInstance$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f5986a;

                /* JADX INFO: renamed from: app.chalo.mvibase.simple.ChaloBaseStateMviComponent$collectWhenViewStateActive$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.mvibase.simple.ChaloBaseStateMviComponent$collectWhenViewStateActive$$inlined$filterIsInstance$1$2", f = "ChaloBaseStateMviComponent.kt", l = {50}, m = "emit", v = 1)
                public final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
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
                    this.f5986a = flowCollector;
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
                        if (obj instanceof ViewStateCollectionResult.Data) {
                            anonymousClass1.label = 1;
                            if (this.f5986a.emit(obj, anonymousClass1) == coroutineSingletons) {
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
                Object objCollect = flowKt__ZipKt$combine$$inlined$unsafeFlow$1.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        });
        Object objCollect = new Flow<Object>() { // from class: app.chalo.mvibase.simple.ChaloBaseStateMviComponent$collectWhenViewStateActive$$inlined$map$2

            /* JADX INFO: renamed from: app.chalo.mvibase.simple.ChaloBaseStateMviComponent$collectWhenViewStateActive$$inlined$map$2$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f5990a;

                /* JADX INFO: renamed from: app.chalo.mvibase.simple.ChaloBaseStateMviComponent$collectWhenViewStateActive$$inlined$map$2$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.mvibase.simple.ChaloBaseStateMviComponent$collectWhenViewStateActive$$inlined$map$2$2", f = "ChaloBaseStateMviComponent.kt", l = {50}, m = "emit", v = 1)
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
                    this.f5990a = flowCollector;
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
                        Object obj3 = ((ViewStateCollectionResult.Data) obj).f6001a;
                        anonymousClass1.label = 1;
                        if (this.f5990a.emit(obj3, anonymousClass1) == coroutineSingletons) {
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
                Object objCollect2 = flowM.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect2 : Unit.f17538a;
            }
        }.collect(new ChaloBaseStateMviComponent$sam$kotlinx_coroutines_flow_FlowCollector$0(function2), suspendLambda);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
    }

    public abstract Object p0(Object obj, ContinuationImpl continuationImpl);

    public final void q0(final Function0 block) {
        Intrinsics.i(block, "block");
        final Lifecycle f12286a = this.f5983a.getF12286a();
        f12286a.b(new Lifecycle.Callbacks() { // from class: app.chalo.mvibase.simple.ChaloBaseStateMviComponent$doWhenLifecycleStarted$$inlined$doOnStart$1
            @Override // com.arkivanov.essenty.lifecycle.Lifecycle.Callbacks
            public final void onStart() {
                f12286a.a(this);
                block.invoke();
            }

            @Override // com.arkivanov.essenty.lifecycle.Lifecycle.Callbacks
            public final void onCreate() {
            }

            @Override // com.arkivanov.essenty.lifecycle.Lifecycle.Callbacks
            public final void onDestroy() {
            }

            @Override // com.arkivanov.essenty.lifecycle.Lifecycle.Callbacks
            public final void onPause() {
            }

            @Override // com.arkivanov.essenty.lifecycle.Lifecycle.Callbacks
            public final void onResume() {
            }

            @Override // com.arkivanov.essenty.lifecycle.Lifecycle.Callbacks
            public final void onStop() {
            }
        });
    }

    public final void r0(Object sideEffect) {
        Intrinsics.i(sideEffect, "sideEffect");
        BuildersKt.d(this.j, null, null, new ChaloBaseStateMviComponent$emitSideEffect$1(this, sideEffect, null), 3);
    }

    public final Flow s0() {
        return (Flow) this.i.getValue();
    }

    public final MutableValue t0() {
        return (MutableValue) this.g.getValue();
    }

    public abstract Object u0();

    @Override // app.chalo.resultstatemanager.ResultStateDataCollector
    public final Object v(Flow flow, Continuation continuation) {
        return this.b.v(flow, continuation);
    }

    public Object v0() {
        return BuildersKt.e(EmptyCoroutineContext.f17583a, new ChaloBaseStateMviComponent$initialViewState$1(this, null));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, app.chalo.mvibase.simple.ChaloBaseStateMviComponent$launchAfterViewStarted$1] */
    public final Job w0(final Function2 function2) {
        final CompletableJob completableJobA = SupervisorKt.a((Job) this.j.f17866a.get(Job.Key.f17732a));
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef.element = new Lifecycle.Callbacks(this, completableJobA, function2, objectRef) { // from class: app.chalo.mvibase.simple.ChaloBaseStateMviComponent$launchAfterViewStarted$1
            public final /* synthetic */ ChaloBaseStateMviComponent b;
            public final /* synthetic */ CompletableJob c;
            public final /* synthetic */ SuspendLambda d;
            public final /* synthetic */ Ref.ObjectRef e;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.d = (SuspendLambda) function2;
                this.e = objectRef;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [T, kotlinx.coroutines.Job] */
            /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
            @Override // com.arkivanov.essenty.lifecycle.Lifecycle.Callbacks
            public final void onStart() {
                Ref.ObjectRef objectRef3 = this.f5992a;
                if (objectRef3.element == 0) {
                    objectRef3.element = BuildersKt.d(this.b.j, this.c, null, new ChaloBaseStateMviComponent$launchAfterViewStarted$1$onStart$1(this.d, null), 2);
                }
            }

            @Override // com.arkivanov.essenty.lifecycle.Lifecycle.Callbacks
            public final void onStop() {
                ((JobSupport) this.c).cancel(null);
                Lifecycle f12286a = this.b.f5983a.getF12286a();
                T t = this.e.element;
                if (t != 0) {
                    f12286a.a((Lifecycle.Callbacks) t);
                } else {
                    Intrinsics.q("callbacks");
                    throw null;
                }
            }

            @Override // com.arkivanov.essenty.lifecycle.Lifecycle.Callbacks
            public final /* bridge */ void onCreate() {
            }

            @Override // com.arkivanov.essenty.lifecycle.Lifecycle.Callbacks
            public final /* bridge */ void onDestroy() {
            }

            @Override // com.arkivanov.essenty.lifecycle.Lifecycle.Callbacks
            public final /* bridge */ void onPause() {
            }

            @Override // com.arkivanov.essenty.lifecycle.Lifecycle.Callbacks
            public final /* bridge */ void onResume() {
            }
        };
        Lifecycle f12286a = this.f5983a.getF12286a();
        T t = objectRef.element;
        if (t != 0) {
            f12286a.b((Lifecycle.Callbacks) t);
            return completableJobA;
        }
        Intrinsics.q("callbacks");
        throw null;
    }

    public void A0() {
    }

    public void B0() {
    }

    public void x0() {
    }

    public void y0() {
    }

    public void z0() {
    }
}
