package app.chalo.home.ui.base;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.base.HomeComponent$processIntent$1", f = "HomeComponent.kt", l = {1459, 1464}, m = "invokeSuspend", v = 1)
final class HomeComponent$processIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ HomeComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeComponent$processIntent$1(HomeComponent homeComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = homeComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeComponent$processIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((HomeComponent$processIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        if (app.chalo.home.ui.base.HomeComponent.Q0(r5, r4) == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.b(r5)
            goto L55
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L18:
            kotlin.ResultKt.b(r5)
            goto L35
        L1c:
            kotlin.ResultKt.b(r5)
            app.chalo.home.ui.base.HomeComponent r5 = r4.this$0
            app.chalo.home.analytics.HomeScreenAnalyticsHelper r5 = r5.C
            app.chalo.constants.Source r1 = app.chalo.constants.Source.HOME_SCREEN
            r5.s(r1)
            app.chalo.home.ui.base.HomeComponent r5 = r4.this$0
            app.chalo.livetracking.tripplanner.domain.GetTripPlannerConfigForCityUseCase r5 = r5.R
            r4.label = r3
            java.lang.Object r5 = r5.c(r4)
            if (r5 != r0) goto L35
            goto L54
        L35:
            app.chalo.livetracking.tripplanner.data.models.app.TripPlannerCityConfigModel r5 = (app.chalo.livetracking.tripplanner.data.models.app.TripPlannerCityConfigModel) r5
            boolean r5 = r5.b
            if (r5 == 0) goto L4a
            app.chalo.home.ui.base.HomeComponent r5 = r4.this$0
            app.chalo.scenes.ChaloNavigationManager r5 = r5.M
            app.chalo.scenes.args.TripPlannerArgs$ResultsScreen r0 = new app.chalo.scenes.args.TripPlannerArgs$ResultsScreen
            r1 = 0
            r0.<init>(r1, r1)
            r2 = 6
            app.chalo.scenes.ChaloNavigationManagerKt.e(r5, r0, r1, r2)
            goto L55
        L4a:
            app.chalo.home.ui.base.HomeComponent r5 = r4.this$0
            r4.label = r2
            java.lang.Object r5 = app.chalo.home.ui.base.HomeComponent.Q0(r5, r4)
            if (r5 != r0) goto L55
        L54:
            return r0
        L55:
            kotlin.Unit r5 = kotlin.Unit.f17538a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.base.HomeComponent$processIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
