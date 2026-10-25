package app.chalo.routeselection.ui;

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
@DebugMetadata(c = "app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent$navigateToInstantTicketFareDetailsIfPossible$1", f = "StopBasedRouteSearchForProductPurchaseComponent.kt", l = {869, 874}, m = "invokeSuspend", v = 1)
final class StopBasedRouteSearchForProductPurchaseComponent$navigateToInstantTicketFareDetailsIfPossible$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OriginDestinationAppModel $route;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StopBasedRouteSearchForProductPurchaseComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StopBasedRouteSearchForProductPurchaseComponent$navigateToInstantTicketFareDetailsIfPossible$1(StopBasedRouteSearchForProductPurchaseComponent stopBasedRouteSearchForProductPurchaseComponent, OriginDestinationAppModel originDestinationAppModel, Continuation continuation) {
        super(2, continuation);
        this.this$0 = stopBasedRouteSearchForProductPurchaseComponent;
        this.$route = originDestinationAppModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        StopBasedRouteSearchForProductPurchaseComponent$navigateToInstantTicketFareDetailsIfPossible$1 stopBasedRouteSearchForProductPurchaseComponent$navigateToInstantTicketFareDetailsIfPossible$1 = new StopBasedRouteSearchForProductPurchaseComponent$navigateToInstantTicketFareDetailsIfPossible$1(this.this$0, this.$route, continuation);
        stopBasedRouteSearchForProductPurchaseComponent$navigateToInstantTicketFareDetailsIfPossible$1.L$0 = obj;
        return stopBasedRouteSearchForProductPurchaseComponent$navigateToInstantTicketFareDetailsIfPossible$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((StopBasedRouteSearchForProductPurchaseComponent$navigateToInstantTicketFareDetailsIfPossible$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        if (app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent.F0(r1, r5, r6, r8) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        if (r9 == null) goto L20;
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
            kotlin.Unit r2 = kotlin.Unit.f17538a
            r3 = 1
            r4 = 2
            if (r1 == 0) goto L26
            if (r1 == r3) goto L1e
            if (r1 != r4) goto L16
            java.lang.Object r0 = r8.L$0
            app.chalo.providers.toast.KotlinToastManager r0 = (app.chalo.providers.toast.KotlinToastManager) r0
            kotlin.ResultKt.b(r9)
            goto L6e
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            java.lang.Object r1 = r8.L$0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.ResultKt.b(r9)
            goto L52
        L26:
            kotlin.ResultKt.b(r9)
            java.lang.Object r9 = r8.L$0
            kotlinx.coroutines.CoroutineScope r9 = (kotlinx.coroutines.CoroutineScope) r9
            app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent r1 = r8.this$0
            ab1 r5 = new ab1
            r6 = 21
            r5.<init>(r6)
            r1.E0(r5)
            app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent r1 = r8.this$0
            java.lang.String r5 = r1.F
            if (r5 == 0) goto L57
            app.chalo.productbooking.common.data.models.app.OriginDestinationAppModel r6 = r8.$route
            int r7 = r5.length()
            if (r7 <= 0) goto L54
            r8.L$0 = r9
            r8.label = r3
            java.lang.Object r9 = app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent.F0(r1, r5, r6, r8)
            if (r9 != r0) goto L52
            goto L6c
        L52:
            r9 = r2
            goto L55
        L54:
            r9 = 0
        L55:
            if (r9 != 0) goto L73
        L57:
            app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent r9 = r8.this$0
            app.chalo.providers.toast.KotlinToastManager r1 = r9.w
            app.chalo.providers.stringprovider.StringProvider r9 = r9.p
            app.chalo.providers.stringprovider.StringEnum r3 = app.chalo.providers.stringprovider.StringEnum.SOMETHING_WENT_WRONG
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r8.L$0 = r1
            r8.label = r4
            java.lang.Object r9 = r9.b(r3, r5, r8)
            if (r9 != r0) goto L6d
        L6c:
            return r0
        L6d:
            r0 = r1
        L6e:
            java.lang.String r9 = (java.lang.String) r9
            defpackage.hq0.s(r0, r9)
        L73:
            app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent r9 = r8.this$0
            ab1 r0 = new ab1
            r1 = 22
            r0.<init>(r1)
            r9.E0(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent$navigateToInstantTicketFareDetailsIfPossible$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
