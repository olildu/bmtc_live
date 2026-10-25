package app.chalo.routeselection.ui;

import app.chalo.productbooking.common.data.models.app.FareDetailsData;
import app.chalo.productbooking.common.data.models.app.OriginDestinationAppModel;
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
@DebugMetadata(c = "app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent$saveRouteToStore$2", f = "StopBasedRouteSearchForProductPurchaseComponent.kt", l = {768, 772}, m = "invokeSuspend", v = 1)
final class StopBasedRouteSearchForProductPurchaseComponent$saveRouteToStore$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FareDetailsData $route;
    final /* synthetic */ String $routeId;
    final /* synthetic */ OriginDestinationAppModel $selectedRouteForApiResponse;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ StopBasedRouteSearchForProductPurchaseComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StopBasedRouteSearchForProductPurchaseComponent$saveRouteToStore$2(FareDetailsData fareDetailsData, StopBasedRouteSearchForProductPurchaseComponent stopBasedRouteSearchForProductPurchaseComponent, OriginDestinationAppModel originDestinationAppModel, String str, Continuation continuation) {
        super(2, continuation);
        this.$route = fareDetailsData;
        this.this$0 = stopBasedRouteSearchForProductPurchaseComponent;
        this.$selectedRouteForApiResponse = originDestinationAppModel;
        this.$routeId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StopBasedRouteSearchForProductPurchaseComponent$saveRouteToStore$2(this.$route, this.this$0, this.$selectedRouteForApiResponse, this.$routeId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((StopBasedRouteSearchForProductPurchaseComponent$saveRouteToStore$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b5, code lost:
    
        if (r2.f(r11, true, r27) == r1) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            r27 = this;
            r0 = r27
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L13
            kotlin.ResultKt.b(r28)
            goto Lb8
        L13:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L1b:
            java.lang.Object r2 = r0.L$5
            app.chalo.recent.model.app.RecentsSpecialStatus r2 = (app.chalo.recent.model.app.RecentsSpecialStatus) r2
            java.lang.Object r5 = r0.L$4
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = r0.L$3
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r0.L$2
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r0.L$1
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r0.L$0
            java.lang.String r9 = (java.lang.String) r9
            kotlin.ResultKt.b(r28)
            r10 = r28
        L38:
            r21 = r2
            r19 = r5
            r16 = r6
            r15 = r7
            r13 = r8
            r14 = r9
            goto L81
        L42:
            kotlin.ResultKt.b(r28)
            app.chalo.productbooking.common.data.models.app.FareDetailsData r2 = r0.$route
            app.chalo.productbooking.common.data.models.app.FareDetailsRouteData r2 = r2.f8185a
            java.lang.String r9 = r2.f8187a
            app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent r2 = r0.this$0
            app.chalo.providers.cityprovider.CityProvider r2 = r2.q
            java.lang.String r2 = app.chalo.providers.cityprovider.CityProviderKt.b(r2)
            if (r2 != 0) goto L57
            java.lang.String r2 = ""
        L57:
            r8 = r2
            app.chalo.productbooking.common.data.models.app.FareDetailsData r2 = r0.$route
            app.chalo.productbooking.common.data.models.app.ProductBookingStopDetails r5 = r2.b
            java.lang.String r7 = r5.b
            app.chalo.productbooking.common.data.models.app.ProductBookingStopDetails r2 = r2.c
            java.lang.String r6 = r2.b
            app.chalo.productbooking.common.data.models.app.OriginDestinationAppModel r2 = r0.$selectedRouteForApiResponse
            java.util.List r5 = r2.g
            app.chalo.recent.model.app.RecentsSpecialStatus r2 = app.chalo.recent.model.app.RecentsSpecialStatus.NONE
            app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent r10 = r0.this$0
            app.chalo.contract.BasicInfoContract r10 = r10.s
            r0.L$0 = r9
            r0.L$1 = r8
            r0.L$2 = r7
            r0.L$3 = r6
            r0.L$4 = r5
            r0.L$5 = r2
            r0.label = r4
            java.lang.Object r10 = r10.c(r0)
            if (r10 != r1) goto L38
            goto Lb7
        L81:
            java.lang.Number r10 = (java.lang.Number) r10
            long r22 = r10.longValue()
            app.chalo.recent.model.app.RecentRouteAppModel r11 = new app.chalo.recent.model.app.RecentRouteAppModel
            java.lang.String r12 = r0.$routeId
            r25 = 0
            r26 = 25408(0x6340, float:3.5604E-41)
            java.lang.String r17 = ""
            r18 = 0
            r20 = 0
            r24 = 0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r24, r25, r26)
            app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent r2 = r0.this$0
            app.chalo.recent.database.repository.recent.RecentRepositoryProvider r2 = r2.r
            app.chalo.recent.database.repository.recent.RouteRecentRepository r2 = r2.getF8954a()
            r5 = 0
            r0.L$0 = r5
            r0.L$1 = r5
            r0.L$2 = r5
            r0.L$3 = r5
            r0.L$4 = r5
            r0.L$5 = r5
            r0.label = r3
            java.lang.Object r2 = r2.f(r11, r4, r0)
            if (r2 != r1) goto Lb8
        Lb7:
            return r1
        Lb8:
            kotlin.Unit r1 = kotlin.Unit.f17538a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent$saveRouteToStore$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
