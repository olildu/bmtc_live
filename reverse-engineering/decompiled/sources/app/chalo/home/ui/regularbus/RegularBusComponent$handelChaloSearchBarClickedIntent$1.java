package app.chalo.home.ui.regularbus;

import androidx.window.core.layout.WindowSizeClass;
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
@DebugMetadata(c = "app.chalo.home.ui.regularbus.RegularBusComponent$handelChaloSearchBarClickedIntent$1", f = "RegularBusComponent.kt", l = {839, WindowSizeClass.WIDTH_DP_EXPANDED_LOWER_BOUND, 856}, m = "invokeSuspend", v = 1)
final class RegularBusComponent$handelChaloSearchBarClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ RegularBusViewIntent.ChaloSearchBarClickedIntent $intent;
    Object L$0;
    int label;
    final /* synthetic */ RegularBusComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegularBusComponent$handelChaloSearchBarClickedIntent$1(RegularBusComponent regularBusComponent, RegularBusViewIntent.ChaloSearchBarClickedIntent chaloSearchBarClickedIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = regularBusComponent;
        this.$intent = chaloSearchBarClickedIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RegularBusComponent$handelChaloSearchBarClickedIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RegularBusComponent$handelChaloSearchBarClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x008c  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0096, code lost:
    
        if (app.chalo.home.ui.regularbus.RegularBusComponent.L0(r7, r6) == r0) goto L29;
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
            r2 = 2
            r3 = 3
            r4 = 1
            if (r1 == 0) goto L28
            if (r1 == r4) goto L24
            if (r1 == r2) goto L1c
            if (r1 != r3) goto L14
            kotlin.ResultKt.b(r7)
            goto L99
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            java.lang.Object r1 = r6.L$0
            app.chalo.livetracking.tripplanner.data.models.app.TripPlannerCityConfigModel r1 = (app.chalo.livetracking.tripplanner.data.models.app.TripPlannerCityConfigModel) r1
            kotlin.ResultKt.b(r7)
            goto L61
        L24:
            kotlin.ResultKt.b(r7)
            goto L45
        L28:
            kotlin.ResultKt.b(r7)
            app.chalo.home.ui.regularbus.RegularBusComponent r7 = r6.this$0
            app.chalo.home.analytics.HomeScreenAnalyticsHelper r7 = r7.F
            app.chalo.home.ui.regularbus.RegularBusViewIntent$ChaloSearchBarClickedIntent r1 = r6.$intent
            java.lang.String r1 = r1.f3639a
            app.chalo.constants.Source r5 = app.chalo.constants.Source.REGULAR_BUS_SCREEN_TAB
            r7.e(r5, r1)
            app.chalo.home.ui.regularbus.RegularBusComponent r7 = r6.this$0
            app.chalo.livetracking.tripplanner.domain.GetTripPlannerConfigForCityUseCase r7 = r7.B
            r6.label = r4
            java.lang.Object r7 = r7.c(r6)
            if (r7 != r0) goto L45
            goto L98
        L45:
            r1 = r7
            app.chalo.livetracking.tripplanner.data.models.app.TripPlannerCityConfigModel r1 = (app.chalo.livetracking.tripplanner.data.models.app.TripPlannerCityConfigModel) r1
            app.chalo.home.ui.regularbus.RegularBusComponent r7 = r6.this$0
            app.chalo.domain.GetClusterConfigForCityUseCase r4 = r7.U
            app.chalo.providers.cityprovider.CityProvider r7 = r7.t
            java.lang.String r7 = r7.h()
            if (r7 != 0) goto L56
            java.lang.String r7 = ""
        L56:
            r6.L$0 = r1
            r6.label = r2
            java.lang.Object r7 = r4.a(r7, r6)
            if (r7 != r0) goto L61
            goto L98
        L61:
            app.chalo.data.ClusterConfig r7 = (app.chalo.data.ClusterConfig) r7
            boolean r7 = r7.c
            r2 = 6
            r4 = 0
            if (r7 == 0) goto L76
            app.chalo.home.ui.regularbus.RegularBusComponent r7 = r6.this$0
            app.chalo.scenes.ChaloNavigationManager r7 = r7.M
            app.chalo.scenes.args.TripPlannerArgs$StopFocusedSearchScreen r0 = new app.chalo.scenes.args.TripPlannerArgs$StopFocusedSearchScreen
            r0.<init>(r4)
            app.chalo.scenes.ChaloNavigationManagerKt.e(r7, r0, r4, r2)
            goto L99
        L76:
            boolean r7 = r1.b
            if (r7 == 0) goto L8c
            app.chalo.home.ui.regularbus.RegularBusComponent r7 = r6.this$0
            app.chalo.scenes.ChaloNavigationManager r7 = r7.M
            app.chalo.scenes.ChaloNavigationRequest$Navigate r0 = new app.chalo.scenes.ChaloNavigationRequest$Navigate
            app.chalo.scenes.args.TripPlannerArgs$ResultsScreen r1 = new app.chalo.scenes.args.TripPlannerArgs$ResultsScreen
            r1.<init>(r4, r4)
            r0.<init>(r1, r4, r4, r2)
            r7.b(r0)
            goto L99
        L8c:
            app.chalo.home.ui.regularbus.RegularBusComponent r7 = r6.this$0
            r6.L$0 = r4
            r6.label = r3
            java.lang.Object r7 = app.chalo.home.ui.regularbus.RegularBusComponent.L0(r7, r6)
            if (r7 != r0) goto L99
        L98:
            return r0
        L99:
            kotlin.Unit r7 = kotlin.Unit.f17538a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.regularbus.RegularBusComponent$handelChaloSearchBarClickedIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
