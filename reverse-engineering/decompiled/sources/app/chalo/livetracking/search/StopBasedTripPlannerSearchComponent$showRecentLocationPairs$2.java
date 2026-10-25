package app.chalo.livetracking.search;

import app.chalo.recent.model.app.RecentLocationPairAppModel;
import defpackage.l11;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "recentLocationPairList", "", "Lapp/chalo/recent/model/app/RecentLocationPairAppModel;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.search.StopBasedTripPlannerSearchComponent$showRecentLocationPairs$2", f = "StopBasedTripPlannerSearchComponent.kt", l = {}, m = "invokeSuspend", v = 1)
final class StopBasedTripPlannerSearchComponent$showRecentLocationPairs$2 extends SuspendLambda implements Function2<List<? extends RecentLocationPairAppModel>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StopBasedTripPlannerSearchComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StopBasedTripPlannerSearchComponent$showRecentLocationPairs$2(StopBasedTripPlannerSearchComponent stopBasedTripPlannerSearchComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = stopBasedTripPlannerSearchComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        StopBasedTripPlannerSearchComponent$showRecentLocationPairs$2 stopBasedTripPlannerSearchComponent$showRecentLocationPairs$2 = new StopBasedTripPlannerSearchComponent$showRecentLocationPairs$2(this.this$0, continuation);
        stopBasedTripPlannerSearchComponent$showRecentLocationPairs$2.L$0 = obj;
        return stopBasedTripPlannerSearchComponent$showRecentLocationPairs$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        StopBasedTripPlannerSearchComponent$showRecentLocationPairs$2 stopBasedTripPlannerSearchComponent$showRecentLocationPairs$2 = (StopBasedTripPlannerSearchComponent$showRecentLocationPairs$2) create((List) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        stopBasedTripPlannerSearchComponent$showRecentLocationPairs$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        this.this$0.E0(new l11((List) this.L$0, 11));
        return Unit.f17538a;
    }
}
