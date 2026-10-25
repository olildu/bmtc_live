package app.chalo.home.ui.home;

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
@DebugMetadata(c = "app.chalo.home.ui.home.HomeScreenComponent$handleChaloSearchBarClickedIntent$1", f = "HomeScreenComponent.kt", l = {755, 763, 771}, m = "invokeSuspend", v = 1)
final class HomeScreenComponent$handleChaloSearchBarClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ HomeScreenComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeScreenComponent$handleChaloSearchBarClickedIntent$1(HomeScreenComponent homeScreenComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = homeScreenComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeScreenComponent$handleChaloSearchBarClickedIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((HomeScreenComponent$handleChaloSearchBarClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0066  */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0080, code lost:
    
        if (app.chalo.home.ui.home.HomeScreenComponent.H0(r8, r7) == r0) goto L29;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r7.label
            r2 = 6
            r3 = 0
            r4 = 2
            r5 = 3
            r6 = 1
            if (r1 == 0) goto L26
            if (r1 == r6) goto L22
            if (r1 == r4) goto L1e
            if (r1 != r5) goto L16
            kotlin.ResultKt.b(r8)
            goto L83
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            kotlin.ResultKt.b(r8)
            goto L60
        L22:
            kotlin.ResultKt.b(r8)
            goto L40
        L26:
            kotlin.ResultKt.b(r8)
            app.chalo.home.ui.home.HomeScreenComponent r8 = r7.this$0
            app.chalo.domain.GetClusterConfigForCityUseCase r1 = r8.L
            app.chalo.providers.cityprovider.CityProvider r8 = r8.l
            java.lang.String r8 = r8.h()
            if (r8 != 0) goto L37
            java.lang.String r8 = ""
        L37:
            r7.label = r6
            java.lang.Object r8 = r1.a(r8, r7)
            if (r8 != r0) goto L40
            goto L82
        L40:
            app.chalo.data.ClusterConfig r8 = (app.chalo.data.ClusterConfig) r8
            boolean r8 = r8.c
            if (r8 == 0) goto L53
            app.chalo.home.ui.home.HomeScreenComponent r8 = r7.this$0
            app.chalo.scenes.ChaloNavigationManager r8 = r8.G
            app.chalo.scenes.args.TripPlannerArgs$StopFocusedSearchScreen r0 = new app.chalo.scenes.args.TripPlannerArgs$StopFocusedSearchScreen
            r0.<init>(r3)
            app.chalo.scenes.ChaloNavigationManagerKt.e(r8, r0, r3, r2)
            goto L83
        L53:
            app.chalo.home.ui.home.HomeScreenComponent r8 = r7.this$0
            app.chalo.livetracking.tripplanner.domain.GetTripPlannerConfigForCityUseCase r8 = r8.o
            r7.label = r4
            java.lang.Object r8 = r8.c(r7)
            if (r8 != r0) goto L60
            goto L82
        L60:
            app.chalo.livetracking.tripplanner.data.models.app.TripPlannerCityConfigModel r8 = (app.chalo.livetracking.tripplanner.data.models.app.TripPlannerCityConfigModel) r8
            boolean r8 = r8.b
            if (r8 == 0) goto L78
            app.chalo.home.ui.home.HomeScreenComponent r8 = r7.this$0
            app.chalo.scenes.ChaloNavigationManager r8 = r8.G
            app.chalo.scenes.ChaloNavigationRequest$Navigate r0 = new app.chalo.scenes.ChaloNavigationRequest$Navigate
            app.chalo.scenes.args.TripPlannerArgs$ResultsScreen r1 = new app.chalo.scenes.args.TripPlannerArgs$ResultsScreen
            r1.<init>(r3, r3)
            r0.<init>(r1, r3, r3, r2)
            r8.b(r0)
            goto L83
        L78:
            app.chalo.home.ui.home.HomeScreenComponent r8 = r7.this$0
            r7.label = r5
            java.lang.Object r8 = app.chalo.home.ui.home.HomeScreenComponent.H0(r8, r7)
            if (r8 != r0) goto L83
        L82:
            return r0
        L83:
            kotlin.Unit r8 = kotlin.Unit.f17538a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.home.HomeScreenComponent$handleChaloSearchBarClickedIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
