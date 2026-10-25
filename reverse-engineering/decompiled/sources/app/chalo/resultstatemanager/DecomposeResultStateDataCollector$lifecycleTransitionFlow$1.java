package app.chalo.resultstatemanager;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lapp/chalo/resultstatemanager/ResultDataInternalState$LifecycleTransition;", "previousState", "isStateStarted", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.resultstatemanager.DecomposeResultStateDataCollector$lifecycleTransitionFlow$1", f = "ResultStateDataCollector.kt", l = {}, m = "invokeSuspend", v = 1)
final class DecomposeResultStateDataCollector$lifecycleTransitionFlow$1 extends SuspendLambda implements Function3<ResultDataInternalState.LifecycleTransition, Boolean, Continuation<? super ResultDataInternalState.LifecycleTransition>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        DecomposeResultStateDataCollector$lifecycleTransitionFlow$1 decomposeResultStateDataCollector$lifecycleTransitionFlow$1 = new DecomposeResultStateDataCollector$lifecycleTransitionFlow$1(3, (Continuation) obj3);
        decomposeResultStateDataCollector$lifecycleTransitionFlow$1.L$0 = (ResultDataInternalState.LifecycleTransition) obj;
        decomposeResultStateDataCollector$lifecycleTransitionFlow$1.Z$0 = zBooleanValue;
        return decomposeResultStateDataCollector$lifecycleTransitionFlow$1.invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        return new ResultDataInternalState.LifecycleTransition(((ResultDataInternalState.LifecycleTransition) this.L$0).b, Boolean.valueOf(this.Z$0));
    }
}
