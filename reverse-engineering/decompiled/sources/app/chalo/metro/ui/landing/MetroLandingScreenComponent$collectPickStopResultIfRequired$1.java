package app.chalo.metro.ui.landing;

import androidx.window.core.layout.WindowSizeClass;
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
@DebugMetadata(c = "app.chalo.metro.ui.landing.MetroLandingScreenComponent$collectPickStopResultIfRequired$1", f = "MetroLandingScreenComponent.kt", l = {836, 837, WindowSizeClass.WIDTH_DP_EXPANDED_LOWER_BOUND, 841}, m = "invokeSuspend", v = 1)
final class MetroLandingScreenComponent$collectPickStopResultIfRequired$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Boolean $isRouteBasedFlow;
    final /* synthetic */ String $requestId;
    int label;
    final /* synthetic */ MetroLandingScreenComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetroLandingScreenComponent$collectPickStopResultIfRequired$1(Boolean bool, MetroLandingScreenComponent metroLandingScreenComponent, String str, Continuation continuation) {
        super(2, continuation);
        this.$isRouteBasedFlow = bool;
        this.this$0 = metroLandingScreenComponent;
        this.$requestId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MetroLandingScreenComponent$collectPickStopResultIfRequired$1(this.$isRouteBasedFlow, this.this$0, this.$requestId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MetroLandingScreenComponent$collectPickStopResultIfRequired$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (app.chalo.metro.ui.landing.MetroLandingScreenComponent.I0(r1, (app.chalo.resultstatemanager.ResultStateData) r7, r6) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        if (app.chalo.metro.ui.landing.MetroLandingScreenComponent.J0(r1, (app.chalo.resultstatemanager.ResultStateData) r7, r6) == r0) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L27
            if (r1 == r5) goto L23
            if (r1 == r4) goto L1f
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            goto L1f
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            kotlin.ResultKt.b(r7)
            goto L6b
        L1f:
            kotlin.ResultKt.b(r7)
            goto L78
        L23:
            kotlin.ResultKt.b(r7)
            goto L47
        L27:
            kotlin.ResultKt.b(r7)
            java.lang.Boolean r7 = r6.$isRouteBasedFlow
            boolean r7 = r7.booleanValue()
            if (r7 != r5) goto L54
            app.chalo.metro.ui.landing.MetroLandingScreenComponent r7 = r6.this$0
            app.chalo.resultstatemanager.instantticket.RouteSearchResultStateManager r1 = r7.o
            java.lang.String r2 = r6.$requestId
            kotlinx.coroutines.flow.Flow r1 = r1.b(r2)
            r6.label = r5
            app.chalo.resultstatemanager.DecomposeResultStateDataCollector r7 = r7.b
            java.lang.Object r7 = r7.v(r1, r6)
            if (r7 != r0) goto L47
            goto L77
        L47:
            app.chalo.resultstatemanager.ResultStateData r7 = (app.chalo.resultstatemanager.ResultStateData) r7
            app.chalo.metro.ui.landing.MetroLandingScreenComponent r1 = r6.this$0
            r6.label = r4
            java.lang.Object r7 = app.chalo.metro.ui.landing.MetroLandingScreenComponent.I0(r1, r7, r6)
            if (r7 != r0) goto L78
            goto L77
        L54:
            if (r7 != 0) goto L7b
            app.chalo.metro.ui.landing.MetroLandingScreenComponent r7 = r6.this$0
            app.chalo.resultstatemanager.universalsearch.UniversalSearchResultStateManager r1 = r7.p
            java.lang.String r4 = r6.$requestId
            kotlinx.coroutines.flow.Flow r1 = r1.b(r4)
            r6.label = r3
            app.chalo.resultstatemanager.DecomposeResultStateDataCollector r7 = r7.b
            java.lang.Object r7 = r7.v(r1, r6)
            if (r7 != r0) goto L6b
            goto L77
        L6b:
            app.chalo.resultstatemanager.ResultStateData r7 = (app.chalo.resultstatemanager.ResultStateData) r7
            app.chalo.metro.ui.landing.MetroLandingScreenComponent r1 = r6.this$0
            r6.label = r2
            java.lang.Object r7 = app.chalo.metro.ui.landing.MetroLandingScreenComponent.J0(r1, r7, r6)
            if (r7 != r0) goto L78
        L77:
            return r0
        L78:
            kotlin.Unit r7 = kotlin.Unit.f17538a
            return r7
        L7b:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.metro.ui.landing.MetroLandingScreenComponent$collectPickStopResultIfRequired$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
