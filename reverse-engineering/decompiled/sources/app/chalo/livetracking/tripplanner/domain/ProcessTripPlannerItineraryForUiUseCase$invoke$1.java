package app.chalo.livetracking.tripplanner.domain;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.tripplanner.domain.ProcessTripPlannerItineraryForUiUseCase", f = "ProcessTripPlannerItineraryForUiUseCase.kt", l = {43}, m = "invoke", v = 1)
final class ProcessTripPlannerItineraryForUiUseCase$invoke$1 extends ContinuationImpl {
    int I$0;
    long J$0;
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
    final /* synthetic */ ProcessTripPlannerItineraryForUiUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProcessTripPlannerItineraryForUiUseCase$invoke$1(ProcessTripPlannerItineraryForUiUseCase processTripPlannerItineraryForUiUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = processTripPlannerItineraryForUiUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, null, null, this);
    }
}
