package app.chalo.livetracking.stoptripplannerresult;

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
@DebugMetadata(c = "app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultsComponent$startRefreshNudgeTimer$1", f = "StopTripPlannerResultsComponent.kt", l = {796, 797}, m = "invokeSuspend", v = 1)
final class StopTripPlannerResultsComponent$startRefreshNudgeTimer$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ StopTripPlannerResultsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StopTripPlannerResultsComponent$startRefreshNudgeTimer$1(StopTripPlannerResultsComponent stopTripPlannerResultsComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = stopTripPlannerResultsComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StopTripPlannerResultsComponent$startRefreshNudgeTimer$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((StopTripPlannerResultsComponent$startRefreshNudgeTimer$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if (r6 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.b(r6)
            goto L38
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            kotlin.ResultKt.b(r6)
            goto L2b
        L1c:
            kotlin.ResultKt.b(r6)
            r5.label = r3
            r3 = 120000(0x1d4c0, double:5.9288E-319)
            java.lang.Object r6 = kotlinx.coroutines.DelayKt.b(r3, r5)
            if (r6 != r0) goto L2b
            goto L37
        L2b:
            app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultsComponent r6 = r5.this$0
            app.chalo.contract.BasicInfoContract r6 = r6.n
            r5.label = r2
            java.lang.Object r6 = r6.c(r5)
            if (r6 != r0) goto L38
        L37:
            return r0
        L38:
            java.lang.Number r6 = (java.lang.Number) r6
            long r0 = r6.longValue()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r2 = "Showing refresh nudge now at "
            r6.<init>(r2)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.String r2 = "message"
            kotlin.jvm.internal.Intrinsics.i(r6, r2)
            app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultsComponent r6 = r5.this$0
            v3 r2 = new v3
            r3 = 7
            r2.<init>(r0, r3)
            r6.E0(r2)
            kotlin.Unit r6 = kotlin.Unit.f17538a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultsComponent$startRefreshNudgeTimer$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
