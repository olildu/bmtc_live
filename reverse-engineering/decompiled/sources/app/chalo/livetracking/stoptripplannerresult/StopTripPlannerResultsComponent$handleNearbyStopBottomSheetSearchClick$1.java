package app.chalo.livetracking.stoptripplannerresult;

import defpackage.mb1;
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
@DebugMetadata(c = "app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultsComponent$handleNearbyStopBottomSheetSearchClick$1", f = "StopTripPlannerResultsComponent.kt", l = {594}, m = "invokeSuspend", v = 1)
final class StopTripPlannerResultsComponent$handleNearbyStopBottomSheetSearchClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ StopTripPlannerResultsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StopTripPlannerResultsComponent$handleNearbyStopBottomSheetSearchClick$1(StopTripPlannerResultsComponent stopTripPlannerResultsComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = stopTripPlannerResultsComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StopTripPlannerResultsComponent$handleNearbyStopBottomSheetSearchClick$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((StopTripPlannerResultsComponent$handleNearbyStopBottomSheetSearchClick$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            this.this$0.E0(new mb1(21));
            StopTripPlannerResultsComponent stopTripPlannerResultsComponent = this.this$0;
            StopTripPlannerStopEditTarget stopTripPlannerStopEditTarget = ((StopTripPlannerResultsDataState) stopTripPlannerResultsComponent.f.getValue()).n;
            this.label = 1;
            if (StopTripPlannerResultsComponent.G0(stopTripPlannerResultsComponent, stopTripPlannerStopEditTarget, this) == coroutineSingletons) {
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
