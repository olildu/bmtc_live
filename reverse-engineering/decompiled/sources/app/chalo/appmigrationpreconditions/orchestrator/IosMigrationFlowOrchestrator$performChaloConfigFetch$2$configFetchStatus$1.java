package app.chalo.appmigrationpreconditions.orchestrator;

import app.chalo.features.chaloconfig.ChaloConfigFetchStatus;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lapp/chalo/features/chaloconfig/ChaloConfigFetchStatus;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.appmigrationpreconditions.orchestrator.IosMigrationFlowOrchestrator$performChaloConfigFetch$2$configFetchStatus$1", f = "IosMigrationFlowOrchestrator.kt", l = {}, m = "invokeSuspend", v = 1)
final class IosMigrationFlowOrchestrator$performChaloConfigFetch$2$configFetchStatus$1 extends SuspendLambda implements Function2<ChaloConfigFetchStatus, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        IosMigrationFlowOrchestrator$performChaloConfigFetch$2$configFetchStatus$1 iosMigrationFlowOrchestrator$performChaloConfigFetch$2$configFetchStatus$1 = new IosMigrationFlowOrchestrator$performChaloConfigFetch$2$configFetchStatus$1(2, continuation);
        iosMigrationFlowOrchestrator$performChaloConfigFetch$2$configFetchStatus$1.L$0 = obj;
        return iosMigrationFlowOrchestrator$performChaloConfigFetch$2$configFetchStatus$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((IosMigrationFlowOrchestrator$performChaloConfigFetch$2$configFetchStatus$1) create((ChaloConfigFetchStatus) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        ChaloConfigFetchStatus chaloConfigFetchStatus = (ChaloConfigFetchStatus) this.L$0;
        return Boolean.valueOf(chaloConfigFetchStatus == ChaloConfigFetchStatus.FETCH_SUCCESSFUL || chaloConfigFetchStatus == ChaloConfigFetchStatus.FETCH_FAILED);
    }
}
