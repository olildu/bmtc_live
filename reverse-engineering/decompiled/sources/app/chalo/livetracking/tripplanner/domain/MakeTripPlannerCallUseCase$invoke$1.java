package app.chalo.livetracking.tripplanner.domain;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.tripplanner.domain.MakeTripPlannerCallUseCase", f = "MakeTripPlannerCallUseCase.kt", l = {ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX, 60}, m = "invoke", v = 1)
final class MakeTripPlannerCallUseCase$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MakeTripPlannerCallUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MakeTripPlannerCallUseCase$invoke$1(MakeTripPlannerCallUseCase makeTripPlannerCallUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = makeTripPlannerCallUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, null, null, null, 0L, null, null, null, null, false, this);
    }
}
