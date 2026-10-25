package app.chalo.location;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lapp/chalo/location/LocationManagerResult$LocationUpdateStatus;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.location.ChaloLocationManagerImpl$addLocationUpdateStaleCheckAndRetry$1", f = "ChaloLocationManagerImpl.kt", l = {164}, m = "invokeSuspend", v = 1)
final class ChaloLocationManagerImpl$addLocationUpdateStaleCheckAndRetry$1 extends SuspendLambda implements Function2<FlowCollector<? super LocationManagerResult.LocationUpdateStatus>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChaloLocationManagerImpl$addLocationUpdateStaleCheckAndRetry$1 chaloLocationManagerImpl$addLocationUpdateStaleCheckAndRetry$1 = new ChaloLocationManagerImpl$addLocationUpdateStaleCheckAndRetry$1(2, continuation);
        chaloLocationManagerImpl$addLocationUpdateStaleCheckAndRetry$1.L$0 = obj;
        return chaloLocationManagerImpl$addLocationUpdateStaleCheckAndRetry$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloLocationManagerImpl$addLocationUpdateStaleCheckAndRetry$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            this.label = 1;
            if (flowCollector.emit(LocationManagerResult.LocationUpdateStatus.Initiated.f5147a, this) == coroutineSingletons) {
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
