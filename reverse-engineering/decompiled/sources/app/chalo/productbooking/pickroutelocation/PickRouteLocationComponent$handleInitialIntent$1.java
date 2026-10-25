package app.chalo.productbooking.pickroutelocation;

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
@DebugMetadata(c = "app.chalo.productbooking.pickroutelocation.PickRouteLocationComponent$handleInitialIntent$1", f = "PickRouteLocationComponent.kt", l = {114, 115}, m = "invokeSuspend", v = 1)
final class PickRouteLocationComponent$handleInitialIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PickRouteLocationIntent.InitialIntent $intent;
    int label;
    final /* synthetic */ PickRouteLocationComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PickRouteLocationComponent$handleInitialIntent$1(PickRouteLocationComponent pickRouteLocationComponent, PickRouteLocationIntent.InitialIntent initialIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = pickRouteLocationComponent;
        this.$intent = initialIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PickRouteLocationComponent$handleInitialIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PickRouteLocationComponent$handleInitialIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0069  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
    
        if (r11.collect(r1, r10) == r0) goto L22;
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
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.b(r11)
            goto L79
        L10:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L18:
            kotlin.ResultKt.b(r11)
            goto L65
        L1c:
            kotlin.ResultKt.b(r11)
            app.chalo.productbooking.pickroutelocation.PickRouteLocationComponent r11 = r10.this$0
            app.chalo.analytics.contract.AnalyticsContract r4 = r11.t
            app.chalo.scenes.args.PickRouteLocationArgs r11 = r11.k
            app.chalo.constants.Source r11 = r11.d
            if (r11 != 0) goto L2b
            app.chalo.constants.Source r11 = app.chalo.constants.Source.UNKNOWN
        L2b:
            r6 = r11
            r8 = 0
            r9 = 28
            java.lang.String r5 = "pick route screen opened"
            r7 = 0
            app.chalo.analytics.AnalyticsContractImplKt.b(r4, r5, r6, r7, r8, r9)
            app.chalo.productbooking.pickroutelocation.PickRouteLocationComponent r11 = r10.this$0
            app.chalo.productbooking.pickroutelocation.PickRouteLocationIntent$InitialIntent r1 = r10.$intent
            ym0 r4 = new ym0
            r5 = 24
            r4.<init>(r1, r5)
            r11.E0(r4)
            app.chalo.productbooking.pickroutelocation.PickRouteLocationComponent r11 = r10.this$0
            app.chalo.productbooking.pickroutelocation.PickRouteLocationSideEffect$BringFocusOnSearchField r1 = app.chalo.productbooking.pickroutelocation.PickRouteLocationSideEffect.BringFocusOnSearchField.f8285a
            r11.r0(r1)
            app.chalo.productbooking.pickroutelocation.PickRouteLocationComponent r11 = r10.this$0
            app.chalo.providers.cityprovider.CityProvider r11 = r11.q
            java.lang.String r11 = r11.h()
            if (r11 == 0) goto L79
            app.chalo.productbooking.pickroutelocation.PickRouteLocationComponent r1 = r10.this$0
            app.chalo.recent.database.repository.recent.RecentRepositoryProvider r1 = r1.o
            app.chalo.recent.database.repository.recent.RouteRecentRepository r1 = r1.getF8954a()
            r10.label = r3
            java.lang.Object r11 = r1.d(r11, r10)
            if (r11 != r0) goto L65
            goto L78
        L65:
            kotlinx.coroutines.flow.Flow r11 = (kotlinx.coroutines.flow.Flow) r11
            if (r11 == 0) goto L79
            app.chalo.productbooking.pickroutelocation.PickRouteLocationComponent$handleInitialIntent$1$3 r1 = new app.chalo.productbooking.pickroutelocation.PickRouteLocationComponent$handleInitialIntent$1$3
            app.chalo.productbooking.pickroutelocation.PickRouteLocationComponent r3 = r10.this$0
            r1.<init>()
            r10.label = r2
            java.lang.Object r11 = r11.collect(r1, r10)
            if (r11 != r0) goto L79
        L78:
            return r0
        L79:
            kotlin.Unit r11 = kotlin.Unit.f17538a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productbooking.pickroutelocation.PickRouteLocationComponent$handleInitialIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
