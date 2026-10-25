package app.chalo.livetracking.ui.routedetailsscreen;

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
@DebugMetadata(c = "app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent$fetchEtasForCurrentlySelectedStopForMap$1", f = "RouteDetailsComponent.kt", l = {1881, 1885, 1895}, m = "invokeSuspend", v = 1)
final class RouteDetailsComponent$fetchEtasForCurrentlySelectedStopForMap$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $stopId;
    Object L$0;
    int label;
    final /* synthetic */ RouteDetailsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteDetailsComponent$fetchEtasForCurrentlySelectedStopForMap$1(RouteDetailsComponent routeDetailsComponent, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = routeDetailsComponent;
        this.$stopId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RouteDetailsComponent$fetchEtasForCurrentlySelectedStopForMap$1(this.this$0, this.$stopId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RouteDetailsComponent$fetchEtasForCurrentlySelectedStopForMap$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0056  */
    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    /* JADX WARN: Code duplicated, block: B:24:0x0064  */
    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0071  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008a, code lost:
    
        if (r1.collect(r9, r8) == r0) goto L33;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.label
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L29
            if (r1 == r4) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            kotlin.ResultKt.b(r9)
            goto L8d
        L15:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1d:
            kotlin.ResultKt.b(r9)
            goto L56
        L21:
            java.lang.Object r1 = r8.L$0
            app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsIntentModel r1 = (app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsIntentModel) r1
            kotlin.ResultKt.b(r9)
            goto L3d
        L29:
            kotlin.ResultKt.b(r9)
            app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent r9 = r8.this$0
            app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsIntentModel r1 = r9.X
            app.chalo.contract.BasicInfoContract r9 = r9.l
            r8.L$0 = r1
            r8.label = r4
            java.lang.Object r9 = r9.c(r8)
            if (r9 != r0) goto L3d
            goto L8c
        L3d:
            java.lang.Number r9 = (java.lang.Number) r9
            long r6 = r9.longValue()
            boolean r9 = app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsIntentModelKt.b(r1, r6)
            if (r9 == 0) goto L56
            app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent r9 = r8.this$0
            r8.L$0 = r5
            r8.label = r3
            java.lang.Object r9 = app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent.F0(r9, r8)
            if (r9 != r0) goto L56
            goto L8c
        L56:
            app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent r9 = r8.this$0
            app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManager r1 = r9.u
            java.lang.String r3 = r8.$stopId
            app.chalo.citydata.data.model.app.RouteAppModel r4 = r9.Y
            if (r4 == 0) goto L64
            java.lang.String r4 = r4.b
            if (r4 != 0) goto L66
        L64:
            java.lang.String r4 = ""
        L66:
            app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsIntentModel r9 = r9.X
            if (r9 == 0) goto L71
            app.chalo.livetracking.routedetails.data.model.ui.TrackingAdditionalFeatures r9 = r9.h
            if (r9 == 0) goto L71
            java.util.List r9 = r9.f
            goto L72
        L71:
            r9 = r5
        L72:
            kotlinx.coroutines.flow.Flow r9 = r1.f(r3, r4, r9)
            app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent$fetchEtasForCurrentlySelectedStopForMap$1$invokeSuspend$$inlined$filterIsInstance$1 r1 = new app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent$fetchEtasForCurrentlySelectedStopForMap$1$invokeSuspend$$inlined$filterIsInstance$1
            r1.<init>()
            app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent$fetchEtasForCurrentlySelectedStopForMap$1$1 r9 = new app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent$fetchEtasForCurrentlySelectedStopForMap$1$1
            app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent r3 = r8.this$0
            r9.<init>()
            r8.L$0 = r5
            r8.label = r2
            java.lang.Object r9 = r1.collect(r9, r8)
            if (r9 != r0) goto L8d
        L8c:
            return r0
        L8d:
            kotlin.Unit r9 = kotlin.Unit.f17538a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent$fetchEtasForCurrentlySelectedStopForMap$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
