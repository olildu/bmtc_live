package app.chalo.livetracking.tripplanner.ui.details;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsComponent", f = "TripPlannerDetailsComponent.kt", l = {964, 971, 974, 982}, m = "updateStateForTripPlannerResult", v = 1)
final class TripPlannerDetailsComponent$updateStateForTripPlannerResult$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TripPlannerDetailsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TripPlannerDetailsComponent$updateStateForTripPlannerResult$1(TripPlannerDetailsComponent tripPlannerDetailsComponent, Continuation continuation) {
        super(continuation);
        this.this$0 = tripPlannerDetailsComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.X0(null, this);
    }
}
