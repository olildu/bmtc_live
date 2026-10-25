package app.chalo.livetracking.frameworklivetracking;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.frameworklivetracking.RealTimeSocketManagerImpl$subscribe$1", f = "RealTimeSocketManagerImpl.kt", l = {249, 250}, m = "invokeSuspend", v = 1)
final class RealTimeSocketManagerImpl$subscribe$1 extends SuspendLambda implements Function2<FlowCollector<? super Unit>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RealTimeSocketManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealTimeSocketManagerImpl$subscribe$1(RealTimeSocketManagerImpl realTimeSocketManagerImpl, Continuation continuation) {
        super(2, continuation);
        this.this$0 = realTimeSocketManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RealTimeSocketManagerImpl$subscribe$1 realTimeSocketManagerImpl$subscribe$1 = new RealTimeSocketManagerImpl$subscribe$1(this.this$0, continuation);
        realTimeSocketManagerImpl$subscribe$1.L$0 = obj;
        return realTimeSocketManagerImpl$subscribe$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RealTimeSocketManagerImpl$subscribe$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            flowCollector = (FlowCollector) this.L$0;
            RealTimeSocketManagerImpl realTimeSocketManagerImpl = this.this$0;
            this.L$0 = flowCollector;
            this.label = 1;
            Object objU = FlowKt.u(realTimeSocketManagerImpl.m, new RealTimeSocketManagerImpl$waitForSocketConfigFetchSuccess$2(2, null), this);
            if (objU != coroutineSingletons) {
                objU = unit;
            }
            if (objU != coroutineSingletons) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        flowCollector = (FlowCollector) this.L$0;
        ResultKt.b(obj);
        this.L$0 = null;
        this.label = 2;
        return flowCollector.emit(unit, this) == coroutineSingletons ? coroutineSingletons : unit;
    }
}
