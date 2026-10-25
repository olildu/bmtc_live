package app.chalo.livetracking.stoptripplannerresult.uistate;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.stoptripplannerresult.uistate.StopTripPlannerResultUiStateFactory", f = "StopTripPlannerResultUiStateFactory.kt", l = {703, 710, 717, 737, 742, 745, 762, 801, 817, 838, 848}, m = "getTripPlannerResultScreenState", v = 1)
final class StopTripPlannerResultUiStateFactory$getTripPlannerResultScreenState$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StopTripPlannerResultUiStateFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StopTripPlannerResultUiStateFactory$getTripPlannerResultScreenState$1(StopTripPlannerResultUiStateFactory stopTripPlannerResultUiStateFactory, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = stopTripPlannerResultUiStateFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A(null, null, this);
    }
}
