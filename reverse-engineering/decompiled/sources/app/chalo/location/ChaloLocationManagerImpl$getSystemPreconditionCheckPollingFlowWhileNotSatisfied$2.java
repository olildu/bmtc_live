package app.chalo.location;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lapp/chalo/location/LocationManagerResult$LocationPreconditionsStatus;", "systemStatus"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.location.ChaloLocationManagerImpl$getSystemPreconditionCheckPollingFlowWhileNotSatisfied$2", f = "ChaloLocationManagerImpl.kt", l = {208}, m = "invokeSuspend", v = 1)
final class ChaloLocationManagerImpl$getSystemPreconditionCheckPollingFlowWhileNotSatisfied$2 extends SuspendLambda implements Function3<FlowCollector<? super LocationManagerResult.LocationPreconditionsStatus>, LocationManagerResult.LocationPreconditionsStatus, Continuation<? super Boolean>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ChaloLocationManagerImpl$getSystemPreconditionCheckPollingFlowWhileNotSatisfied$2 chaloLocationManagerImpl$getSystemPreconditionCheckPollingFlowWhileNotSatisfied$2 = new ChaloLocationManagerImpl$getSystemPreconditionCheckPollingFlowWhileNotSatisfied$2(3, (Continuation) obj3);
        chaloLocationManagerImpl$getSystemPreconditionCheckPollingFlowWhileNotSatisfied$2.L$0 = (FlowCollector) obj;
        chaloLocationManagerImpl$getSystemPreconditionCheckPollingFlowWhileNotSatisfied$2.L$1 = (LocationManagerResult.LocationPreconditionsStatus) obj2;
        return chaloLocationManagerImpl$getSystemPreconditionCheckPollingFlowWhileNotSatisfied$2.invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        LocationManagerResult.LocationPreconditionsStatus locationPreconditionsStatus;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            LocationManagerResult.LocationPreconditionsStatus locationPreconditionsStatus2 = (LocationManagerResult.LocationPreconditionsStatus) this.L$1;
            this.L$0 = locationPreconditionsStatus2;
            this.label = 1;
            if (flowCollector.emit(locationPreconditionsStatus2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            locationPreconditionsStatus = locationPreconditionsStatus2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            locationPreconditionsStatus = (LocationManagerResult.LocationPreconditionsStatus) this.L$0;
            ResultKt.b(obj);
        }
        locationPreconditionsStatus.getClass();
        return Boolean.valueOf(!(locationPreconditionsStatus instanceof LocationManagerResult.LocationPreconditionsStatus.SystemConditionsSatisfied));
    }
}
