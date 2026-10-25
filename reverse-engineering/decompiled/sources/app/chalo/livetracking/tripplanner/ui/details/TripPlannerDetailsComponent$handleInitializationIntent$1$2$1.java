package app.chalo.livetracking.tripplanner.ui.details;

import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerItineraryAppResponseModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsComponent$handleInitializationIntent$1$2$1", f = "TripPlannerDetailsComponent.kt", l = {549}, m = "invokeSuspend", v = 1)
final class TripPlannerDetailsComponent$handleInitializationIntent$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TripPlannerItineraryAppResponseModel $it;
    final /* synthetic */ long $resolutionToken;
    int label;
    final /* synthetic */ TripPlannerDetailsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TripPlannerDetailsComponent$handleInitializationIntent$1$2$1(TripPlannerDetailsComponent tripPlannerDetailsComponent, TripPlannerItineraryAppResponseModel tripPlannerItineraryAppResponseModel, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = tripPlannerDetailsComponent;
        this.$it = tripPlannerItineraryAppResponseModel;
        this.$resolutionToken = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TripPlannerDetailsComponent$handleInitializationIntent$1$2$1(this.this$0, this.$it, this.$resolutionToken, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TripPlannerDetailsComponent$handleInitializationIntent$1$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            TripPlannerDetailsComponent tripPlannerDetailsComponent = this.this$0;
            TripPlannerItineraryAppResponseModel tripPlannerItineraryAppResponseModel = this.$it;
            long j = this.$resolutionToken;
            this.label = 1;
            if (TripPlannerDetailsComponent.J0(tripPlannerDetailsComponent, tripPlannerItineraryAppResponseModel, j, this) == coroutineSingletons) {
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
