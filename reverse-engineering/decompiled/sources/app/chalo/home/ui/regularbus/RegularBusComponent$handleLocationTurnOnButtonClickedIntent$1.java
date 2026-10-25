package app.chalo.home.ui.regularbus;

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
@DebugMetadata(c = "app.chalo.home.ui.regularbus.RegularBusComponent$handleLocationTurnOnButtonClickedIntent$1", f = "RegularBusComponent.kt", l = {1136, 1138}, m = "invokeSuspend", v = 1)
final class RegularBusComponent$handleLocationTurnOnButtonClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ RegularBusViewIntent.LocationTurnOnButtonClickedIntent $intent;
    Object L$0;
    int label;
    final /* synthetic */ RegularBusComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegularBusComponent$handleLocationTurnOnButtonClickedIntent$1(RegularBusViewIntent.LocationTurnOnButtonClickedIntent locationTurnOnButtonClickedIntent, RegularBusComponent regularBusComponent, Continuation continuation) {
        super(2, continuation);
        this.$intent = locationTurnOnButtonClickedIntent;
        this.this$0 = regularBusComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RegularBusComponent$handleLocationTurnOnButtonClickedIntent$1(this.$intent, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RegularBusComponent$handleLocationTurnOnButtonClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        if (r7.collect(app.chalo.home.ui.regularbus.RegularBusComponent$handleLocationTurnOnButtonClickedIntent$1$1$1.f3620a, r6) == r0) goto L21;
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
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L25
            if (r1 == r2) goto L1c
            if (r1 != r3) goto L14
            java.lang.Object r0 = r6.L$0
            app.chalo.providers.toast.KotlinToastManager r0 = (app.chalo.providers.toast.KotlinToastManager) r0
            kotlin.ResultKt.b(r7)
            goto L7e
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            java.lang.Object r0 = r6.L$0
            app.chalo.home.ui.regularbus.RegularBusComponent r0 = (app.chalo.home.ui.regularbus.RegularBusComponent) r0
            kotlin.ResultKt.b(r7)
            goto Lb0
        L25:
            kotlin.ResultKt.b(r7)
            app.chalo.home.ui.regularbus.RegularBusViewIntent$LocationTurnOnButtonClickedIntent r7 = r6.$intent
            app.chalo.home.data.model.app.LocationTurnOnTooltipType r7 = r7.f3643a
            app.chalo.home.data.model.app.LocationTurnOnTooltipType$RequestGpsTurnOn r1 = app.chalo.home.data.model.app.LocationTurnOnTooltipType.RequestGpsTurnOn.f2945a
            boolean r1 = r7.equals(r1)
            r4 = 0
            if (r1 == 0) goto L8c
            app.chalo.home.ui.regularbus.RegularBusComponent r7 = r6.this$0
            app.chalo.home.analytics.HomeScreenAnalyticsHelper r7 = r7.F
            app.chalo.constants.Source r1 = app.chalo.constants.Source.REGULAR_BUS_SCREEN_TAB
            r7.m(r1)
            app.chalo.home.ui.regularbus.RegularBusComponent r7 = r6.this$0
            com.arkivanov.decompose.value.MutableValue r7 = r7.t0()
            java.lang.Object r7 = r7.a()
            app.chalo.home.ui.regularbus.RegularBusViewState r7 = (app.chalo.home.ui.regularbus.RegularBusViewState) r7
            app.chalo.location.SettingsResolutionException r7 = r7.n
            if (r7 == 0) goto L84
            app.chalo.home.ui.regularbus.RegularBusComponent r1 = r6.this$0
            app.chalo.permissions.gps.GpsRequestHandlerProvider r5 = r1.Q
            app.chalo.permissions.gps.GpsRequestHandler r5 = r5.c()
            if (r5 == 0) goto L69
            kotlinx.coroutines.flow.Flow r7 = r5.a(r7)
            r6.L$0 = r1
            r6.label = r2
            app.chalo.home.ui.regularbus.RegularBusComponent$handleLocationTurnOnButtonClickedIntent$1$1$1 r1 = app.chalo.home.ui.regularbus.RegularBusComponent$handleLocationTurnOnButtonClickedIntent$1$1$1.f3620a
            java.lang.Object r7 = r7.collect(r1, r6)
            if (r7 != r0) goto Lb0
            goto L7b
        L69:
            app.chalo.providers.toast.KotlinToastManager r7 = r1.O
            app.chalo.providers.stringprovider.StringProvider r1 = r1.o
            app.chalo.providers.stringprovider.StringEnum r2 = app.chalo.providers.stringprovider.StringEnum.GPS_NOT_AVAILABLE_TOAST
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r6.L$0 = r7
            r6.label = r3
            java.lang.Object r1 = r1.b(r2, r4, r6)
            if (r1 != r0) goto L7c
        L7b:
            return r0
        L7c:
            r0 = r7
            r7 = r1
        L7e:
            java.lang.String r7 = (java.lang.String) r7
            app.chalo.providers.toast.KotlinToastManagerKt.b(r0, r7)
            goto Lb0
        L84:
            app.chalo.home.ui.regularbus.RegularBusComponent r7 = r6.this$0
            app.chalo.utils.SystemHelper r7 = r7.R
            r7.i()
            goto Lb0
        L8c:
            app.chalo.home.data.model.app.LocationTurnOnTooltipType$RequestLocationPermission r0 = app.chalo.home.data.model.app.LocationTurnOnTooltipType.RequestLocationPermission.f2946a
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto La8
            app.chalo.home.ui.regularbus.RegularBusComponent r7 = r6.this$0
            app.chalo.permissions.models.AppPermission[] r0 = new app.chalo.permissions.models.AppPermission[r3]
            app.chalo.permissions.models.AppPermission r1 = app.chalo.permissions.models.AppPermission.COARSE_LOCATION
            r0[r4] = r1
            app.chalo.permissions.models.AppPermission r1 = app.chalo.permissions.models.AppPermission.FINE_LOCATION
            r0[r2] = r1
            java.util.List r0 = kotlin.collections.CollectionsKt.S(r0)
            r7.c1(r0)
            goto Lb0
        La8:
            app.chalo.home.data.model.app.LocationTurnOnTooltipType$Unknown r0 = app.chalo.home.data.model.app.LocationTurnOnTooltipType.Unknown.f2947a
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto Lb3
        Lb0:
            kotlin.Unit r7 = kotlin.Unit.f17538a
            return r7
        Lb3:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.regularbus.RegularBusComponent$handleLocationTurnOnButtonClickedIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
