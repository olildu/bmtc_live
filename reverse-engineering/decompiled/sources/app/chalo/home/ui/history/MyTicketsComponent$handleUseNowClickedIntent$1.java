package app.chalo.home.ui.history;

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
@DebugMetadata(c = "app.chalo.home.ui.history.MyTicketsComponent$handleUseNowClickedIntent$1", f = "MyTicketsComponent.kt", l = {1304, 1309}, m = "invokeSuspend", v = 1)
final class MyTicketsComponent$handleUseNowClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MyTicketsViewIntent.UseNowClickedIntent $intent;
    int label;
    final /* synthetic */ MyTicketsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyTicketsComponent$handleUseNowClickedIntent$1(MyTicketsComponent myTicketsComponent, MyTicketsViewIntent.UseNowClickedIntent useNowClickedIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = myTicketsComponent;
        this.$intent = useNowClickedIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MyTicketsComponent$handleUseNowClickedIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MyTicketsComponent$handleUseNowClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008e, code lost:
    
        if (r11 == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r10.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            kotlin.ResultKt.b(r11)
            goto L91
        L12:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1a:
            kotlin.ResultKt.b(r11)
            goto L6a
        L1e:
            kotlin.ResultKt.b(r11)
            app.chalo.home.ui.history.MyTicketsComponent r11 = r10.this$0
            app.chalo.home.analytics.HomeScreenAnalyticsHelper r11 = r11.E
            app.chalo.constants.Source r1 = app.chalo.constants.Source.MY_TICKETS_SCREEN_TAB
            app.chalo.home.ui.history.MyTicketsViewIntent$UseNowClickedIntent r5 = r10.$intent
            app.chalo.home.domain.ChaloUserBookingType r5 = r5.f3442a
            java.lang.String r6 = r5.b
            kotlin.Pair r7 = new kotlin.Pair
            java.lang.String r8 = "productType"
            r7.<init>(r8, r6)
            java.lang.String r6 = r5.c
            kotlin.Pair r8 = new kotlin.Pair
            java.lang.String r9 = "productSubType"
            r8.<init>(r9, r6)
            java.lang.String r5 = r5.f2987a
            kotlin.Pair r6 = new kotlin.Pair
            java.lang.String r9 = "bookingId"
            r6.<init>(r9, r5)
            r5 = 3
            kotlin.Pair[] r5 = new kotlin.Pair[r5]
            r5[r2] = r7
            r5[r4] = r8
            r5[r3] = r6
            java.util.Map r5 = kotlin.collections.MapsKt.i(r5)
            java.lang.String r6 = "product use now button clicked"
            r7 = 12
            app.chalo.home.analytics.HomeScreenAnalyticsHelper.DefaultImpls.a(r11, r6, r5, r1, r7)
            app.chalo.home.ui.history.MyTicketsComponent r11 = r10.this$0
            app.chalo.usecase.IsNotificationPermissionGrantedUseCase r11 = r11.I
            r10.label = r4
            java.lang.Object r11 = r11.a(r10)
            if (r11 != r0) goto L6a
            goto L90
        L6a:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L78
            app.chalo.home.ui.history.MyTicketsComponent r11 = r10.this$0
            r11.f1()
            goto La6
        L78:
            app.chalo.home.ui.history.MyTicketsComponent r11 = r10.this$0
            app.chalo.permissions.handler.PermissionHandlerProvider r11 = r11.P
            app.chalo.permissions.handler.PermissionHandler r11 = r11.c()
            if (r11 == 0) goto L9c
            app.chalo.permissions.models.AppPermission r1 = app.chalo.permissions.models.AppPermission.POST_NOTIFICATIONS
            kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest r11 = r11.c(r1)
            r10.label = r3
            java.lang.Object r11 = kotlinx.coroutines.flow.FlowKt.v(r11, r10)
            if (r11 != r0) goto L91
        L90:
            return r0
        L91:
            app.chalo.permissions.models.PermissionState r11 = (app.chalo.permissions.models.PermissionState) r11
            if (r11 == 0) goto L9c
            boolean r11 = app.chalo.permissions.models.PermissionStateKt.a(r11)
            if (r11 != r4) goto L9c
            r2 = r4
        L9c:
            app.chalo.home.ui.history.MyTicketsComponent r11 = r10.this$0
            app.chalo.home.ui.history.MyTicketsViewIntent$NotificationPermissionUpdatedIntent r0 = new app.chalo.home.ui.history.MyTicketsViewIntent$NotificationPermissionUpdatedIntent
            r0.<init>(r2)
            r11.k1(r0)
        La6:
            kotlin.Unit r11 = kotlin.Unit.f17538a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.history.MyTicketsComponent$handleUseNowClickedIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
