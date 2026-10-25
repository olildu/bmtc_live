package app.chalo.livetracking.tripplanner.ui.result;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent$handleSearchStopFieldUpdatedIntent$1", f = "TripPlannerResultsComponent.kt", l = {392, 402}, m = "invokeSuspend", v = 1)
final class TripPlannerResultsComponent$handleSearchStopFieldUpdatedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TripPlannerResultIntent.SearchStopFieldUpdatedIntent $intent;
    int label;
    final /* synthetic */ TripPlannerResultsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TripPlannerResultsComponent$handleSearchStopFieldUpdatedIntent$1(TripPlannerResultsComponent tripPlannerResultsComponent, TripPlannerResultIntent.SearchStopFieldUpdatedIntent searchStopFieldUpdatedIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = tripPlannerResultsComponent;
        this.$intent = searchStopFieldUpdatedIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TripPlannerResultsComponent$handleSearchStopFieldUpdatedIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TripPlannerResultsComponent$handleSearchStopFieldUpdatedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        if (app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent.I0(r7, r2, r8, r17) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        if (app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent.I0(r7, r2, r8, r17) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        return r1;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent$handleSearchStopFieldUpdatedIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
