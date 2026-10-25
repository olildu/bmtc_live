package app.chalo.productpurchase.passpurchase.ui.decompose;

import app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseBaseManager;
import app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedState;
import app.chalo.resultstatemanager.DecomposeResultStateDataCollector;
import app.chalo.resultstatemanager.ResultStateDataCollector;
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
import defpackage.ig1;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u0002*\b\b\u0002\u0010\u0004*\u00020\u0002*\b\b\u0003\u0010\u0005*\u00020\u00022\u00020\u00062\u00020\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/decompose/SuperPassScreenBaseComponent;", "ViewIntent", "", "DataState", "ViewState", "ViewSideEffect", "Lcom/arkivanov/decompose/ComponentContext;", "Lapp/chalo/resultstatemanager/ResultStateDataCollector;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SuperPassScreenBaseComponent<ViewIntent, DataState, ViewState, ViewSideEffect> implements ComponentContext, ResultStateDataCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ComponentContext f8402a;
    public final /* synthetic */ DecomposeResultStateDataCollector b;
    public final SuperPassPurchaseBaseManager c;
    public final String d = "ChaloBaseStateMviComponent";
    public final MutableStateFlow e;
    public final StateFlow f;
    public final Lazy g;
    public final SharedFlowImpl h;
    public final Lazy i;
    public final ContextScope j;

    public SuperPassScreenBaseComponent(ComponentContext componentContext, SuperPassPurchaseBaseManager superPassPurchaseBaseManager) {
        this.f8402a = componentContext;
        this.b = new DecomposeResultStateDataCollector(componentContext.getF12286a());
        this.c = superPassPurchaseBaseManager;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(m());
        this.e = mutableStateFlowA;
        this.f = FlowKt.c(mutableStateFlowA);
        this.g = LazyKt.b(new Function0() { // from class: app.chalo.productpurchase.passpurchase.ui.decompose.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SuperPassScreenBaseComponent superPassScreenBaseComponent = this.f8406a;
                MutableValue mutableValueA = MutableValueBuilderKt.a(BuildersKt.e(EmptyCoroutineContext.f17583a, new SuperPassScreenBaseComponent$initialViewState$1(superPassScreenBaseComponent, null)));
                BuildersKt.d(superPassScreenBaseComponent.j, null, null, new SuperPassScreenBaseComponent$_viewState$2$1(superPassScreenBaseComponent, mutableValueA, null), 3);
                LifecycleExtKt.a(superPassScreenBaseComponent.f8402a.getF12286a(), new ig1(superPassScreenBaseComponent, 1), null, null, new ig1(superPassScreenBaseComponent, 2), new ig1(superPassScreenBaseComponent, 3), 13);
                return mutableValueA;
            }
        });
        this.h = SharedFlowKt.b(0, 0, null, 7);
        this.i = LazyKt.b(new ig1(this, 0));
        DefaultScheduler defaultScheduler = Dispatchers.f17721a;
        this.j = CoroutineScopeWithLifecycleKt.a(this, MainDispatcherLoader.f17879a.g().plus(SupervisorKt.b()));
    }

    @Override // com.arkivanov.decompose.ComponentContextFactoryOwner
    /* JADX INFO: renamed from: A */
    public final ComponentContextFactory getE() {
        return this.f8402a.getE();
    }

    @Override // com.arkivanov.essenty.instancekeeper.InstanceKeeperOwner
    /* JADX INFO: renamed from: O */
    public final InstanceKeeper getC() {
        return this.f8402a.getC();
    }

    public abstract Object a(SuperPassPurchaseSharedState superPassPurchaseSharedState, Object obj, SuspendLambda suspendLambda);

    @Override // com.arkivanov.essenty.statekeeper.StateKeeperOwner
    /* JADX INFO: renamed from: f0 */
    public final StateKeeper getB() {
        return this.f8402a.getB();
    }

    @Override // com.arkivanov.essenty.lifecycle.LifecycleOwner
    /* JADX INFO: renamed from: getLifecycle */
    public final Lifecycle getF12286a() {
        return this.f8402a.getF12286a();
    }

    public final void i(Object obj) {
        BuildersKt.d(this.j, null, null, new SuperPassScreenBaseComponent$emitSideEffect$1(this, obj, null), 3);
    }

    @Override // com.arkivanov.essenty.backhandler.BackHandlerOwner
    /* JADX INFO: renamed from: j */
    public final BackHandler getD() {
        return this.f8402a.getD();
    }

    public abstract Object m();

    public final void n(Function0 function0) {
        BuildersKt.d(this.j, null, null, new SuperPassScreenBaseComponent$performWhenSharedViewModelInitialized$1(this, function0, null), 3);
    }

    public final void o(Object obj) {
        ChaloLog.b(this.d, "ViewIntent = " + obj);
    }

    public final void p(Function1 function1) {
        MutableStateFlow mutableStateFlow;
        Object value;
        do {
            mutableStateFlow = this.e;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.c(value, function1.invoke(value)));
    }

    @Override // app.chalo.resultstatemanager.ResultStateDataCollector
    public final Object v(Flow flow, Continuation continuation) {
        return this.b.v(flow, continuation);
    }
}
