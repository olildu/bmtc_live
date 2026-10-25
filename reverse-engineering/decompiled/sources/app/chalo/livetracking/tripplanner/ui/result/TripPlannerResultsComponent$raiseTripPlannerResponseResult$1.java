package app.chalo.livetracking.tripplanner.ui.result;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent", f = "TripPlannerResultsComponent.kt", l = {1660, 1662, 1662}, m = "raiseTripPlannerResponseResult", v = 1)
final class TripPlannerResultsComponent$raiseTripPlannerResponseResult$1 extends ContinuationImpl {
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TripPlannerResultsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TripPlannerResultsComponent$raiseTripPlannerResponseResult$1(TripPlannerResultsComponent tripPlannerResultsComponent, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = tripPlannerResultsComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return TripPlannerResultsComponent.K0(this.this$0, null, null, null, false, this);
    }
}
