package app.chalo.livetracking.stoptripplannerresult.compose;

import androidx.compose.foundation.lazy.LazyListState;
import app.chalo.livetracking.stoptripplannerresult.uistate.NearbyStopResultsContainerUiState;
import app.chalo.livetracking.stoptripplannerresult.uistate.StopBasedTripPlannerUiState;
import app.chalo.livetracking.stoptripplannerresult.uistate.TripPlannerResultScreenState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.stoptripplannerresult.compose.StopBasedTripPlannerResultScreenKt$StopTripPlannerResultScreen$1$1", f = "StopBasedTripPlannerResultScreen.kt", l = {234, 235}, m = "invokeSuspend", v = 1)
final class StopBasedTripPlannerResultScreenKt$StopTripPlannerResultScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LazyListState $lazyListState;
    final /* synthetic */ StopBasedTripPlannerUiState $state;
    int I$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StopBasedTripPlannerResultScreenKt$StopTripPlannerResultScreen$1$1(StopBasedTripPlannerUiState stopBasedTripPlannerUiState, LazyListState lazyListState, Continuation continuation) {
        super(2, continuation);
        this.$state = stopBasedTripPlannerUiState;
        this.$lazyListState = lazyListState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StopBasedTripPlannerResultScreenKt$StopTripPlannerResultScreen$1$1(this.$state, this.$lazyListState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((StopBasedTripPlannerResultScreenKt$StopTripPlannerResultScreen$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        NearbyStopResultsContainerUiState nearbyStopResultsContainerUiState;
        int i;
        LazyListState lazyListState;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        Unit unit = Unit.f17538a;
        if (i2 != 0) {
            if (i2 == 1) {
                int i3 = this.I$0;
                ResultKt.b(obj);
                i = i3;
                lazyListState = this.$lazyListState;
                this.label = 2;
                if (LazyListState.animateScrollToItem$default(lazyListState, i, 0, this, 2, null) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return unit;
        }
        ResultKt.b(obj);
        TripPlannerResultScreenState tripPlannerResultScreenState = this.$state.e;
        TripPlannerResultScreenState.Results results = tripPlannerResultScreenState instanceof TripPlannerResultScreenState.Results ? (TripPlannerResultScreenState.Results) tripPlannerResultScreenState : null;
        if (results == null || (nearbyStopResultsContainerUiState = results.c) == null) {
            return unit;
        }
        int size = nearbyStopResultsContainerUiState != null ? results.f4629a.size() + 3 : -1;
        if (!nearbyStopResultsContainerUiState.d && size >= 0) {
            this.I$0 = size;
            this.label = 1;
            if (DelayKt.b(100L, this) != coroutineSingletons) {
                i = size;
                lazyListState = this.$lazyListState;
                this.label = 2;
                if (LazyListState.animateScrollToItem$default(lazyListState, i, 0, this, 2, null) == coroutineSingletons) {
                }
            }
            return coroutineSingletons;
        }
        return unit;
    }
}
