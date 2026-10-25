package app.chalo.resultstatemanager;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lapp/chalo/resultstatemanager/ResultDataInternalState$DataFlowState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.resultstatemanager.DecomposeResultStateDataCollector$dataStateFlow$2", f = "ResultStateDataCollector.kt", l = {EACTags.CERTIFICATION_AUTHORITY_PUBLIC_KEY}, m = "invokeSuspend", v = 1)
final class DecomposeResultStateDataCollector$dataStateFlow$2 extends SuspendLambda implements Function2<FlowCollector<? super ResultDataInternalState.DataFlowState<Object>>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DecomposeResultStateDataCollector$dataStateFlow$2 decomposeResultStateDataCollector$dataStateFlow$2 = new DecomposeResultStateDataCollector$dataStateFlow$2(2, continuation);
        decomposeResultStateDataCollector$dataStateFlow$2.L$0 = obj;
        return decomposeResultStateDataCollector$dataStateFlow$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DecomposeResultStateDataCollector$dataStateFlow$2) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            ResultDataInternalState.DataFlowState.WaitingForResult waitingForResult = new ResultDataInternalState.DataFlowState.WaitingForResult();
            this.label = 1;
            if (flowCollector.emit(waitingForResult, this) == coroutineSingletons) {
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
