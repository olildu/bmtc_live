package app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.screentype;

import androidx.compose.foundation.lazy.LazyListState;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsViewTypeUIState;
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
@DebugMetadata(c = "app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.screentype.RouteTimeTableKt$RouteTimeTable$1$1$2$1", f = "RouteTimeTable.kt", l = {65}, m = "invokeSuspend", v = 1)
final class RouteTimeTableKt$RouteTimeTable$1$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ RouteDetailsViewTypeUIState.TimeTable $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteTimeTableKt$RouteTimeTable$1$1$2$1(RouteDetailsViewTypeUIState.TimeTable timeTable, LazyListState lazyListState, Continuation continuation) {
        super(2, continuation);
        this.$state = timeTable;
        this.$listState = lazyListState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RouteTimeTableKt$RouteTimeTable$1$1$2$1(this.$state, this.$listState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RouteTimeTableKt$RouteTimeTable$1$1$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            Integer num = this.$state.d;
            if (num != null) {
                LazyListState lazyListState = this.$listState;
                int iMax = Math.max(num.intValue(), 0);
                this.label = 1;
                if (LazyListState.scrollToItem$default(lazyListState, iMax, 0, this, 2, null) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
