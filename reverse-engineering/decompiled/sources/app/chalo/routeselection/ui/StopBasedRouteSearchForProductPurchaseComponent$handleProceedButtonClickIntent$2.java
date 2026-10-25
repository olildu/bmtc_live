package app.chalo.routeselection.ui;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.data.StopBasedRouteSelectionFlowType;
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
@DebugMetadata(c = "app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent$handleProceedButtonClickIntent$2", f = "StopBasedRouteSearchForProductPurchaseComponent.kt", l = {349, 353}, m = "invokeSuspend", v = 1)
final class StopBasedRouteSearchForProductPurchaseComponent$handleProceedButtonClickIntent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ StopBasedRouteSelectionFlowType $flowType;
    final /* synthetic */ StopAppModel $from;
    final /* synthetic */ StopAppModel $to;
    int label;
    final /* synthetic */ StopBasedRouteSearchForProductPurchaseComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StopBasedRouteSearchForProductPurchaseComponent$handleProceedButtonClickIntent$2(StopBasedRouteSelectionFlowType stopBasedRouteSelectionFlowType, StopBasedRouteSearchForProductPurchaseComponent stopBasedRouteSearchForProductPurchaseComponent, StopAppModel stopAppModel, StopAppModel stopAppModel2, Continuation continuation) {
        super(2, continuation);
        this.$flowType = stopBasedRouteSelectionFlowType;
        this.this$0 = stopBasedRouteSearchForProductPurchaseComponent;
        this.$from = stopAppModel;
        this.$to = stopAppModel2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StopBasedRouteSearchForProductPurchaseComponent$handleProceedButtonClickIntent$2(this.$flowType, this.this$0, this.$from, this.$to, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((StopBasedRouteSearchForProductPurchaseComponent$handleProceedButtonClickIntent$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        if (app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent.G0(r8, r1, r2, r7) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        if (r8.I0(r1, r4, r7, true) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        return r0;
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
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L15:
            kotlin.ResultKt.b(r8)
            goto L63
        L19:
            kotlin.ResultKt.b(r8)
            app.chalo.data.StopBasedRouteSelectionFlowType r8 = r7.$flowType
            boolean r1 = r8 instanceof app.chalo.data.StopBasedRouteSelectionFlowType.InstantTicket
            if (r1 == 0) goto L31
            app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent r8 = r7.this$0
            app.chalo.citydata.data.model.app.StopAppModel r1 = r7.$from
            app.chalo.citydata.data.model.app.StopAppModel r2 = r7.$to
            r7.label = r3
            java.lang.Object r8 = app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent.G0(r8, r1, r2, r7)
            if (r8 != r0) goto L63
            goto L47
        L31:
            boolean r1 = r8 instanceof app.chalo.data.StopBasedRouteSelectionFlowType.ONDC
            if (r1 == 0) goto L48
            app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent r8 = r7.this$0
            app.chalo.citydata.data.model.app.StopAppModel r1 = r7.$from
            java.lang.String r1 = r1.f1727a
            app.chalo.citydata.data.model.app.StopAppModel r4 = r7.$to
            java.lang.String r4 = r4.f1727a
            r7.label = r2
            java.lang.Object r8 = r8.I0(r1, r4, r7, r3)
            if (r8 != r0) goto L63
        L47:
            return r0
        L48:
            boolean r0 = r8 instanceof app.chalo.data.StopBasedRouteSelectionFlowType.PassPurchase
            if (r0 == 0) goto L66
            app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent r2 = r7.this$0
            app.chalo.citydata.data.model.app.StopAppModel r4 = r7.$from
            app.chalo.citydata.data.model.app.StopAppModel r5 = r7.$to
            app.chalo.data.StopBasedRouteSelectionFlowType$PassPurchase r8 = (app.chalo.data.StopBasedRouteSelectionFlowType.PassPurchase) r8
            java.lang.String r3 = r8.d
            kotlinx.coroutines.internal.ContextScope r8 = r2.j
            app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent$fetchCompleteConfigDataAndProceed$1 r1 = new app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent$fetchCompleteConfigDataAndProceed$1
            r6 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            r0 = 3
            r2 = 0
            kotlinx.coroutines.BuildersKt.d(r8, r2, r2, r1, r0)
        L63:
            kotlin.Unit r8 = kotlin.Unit.f17538a
            return r8
        L66:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent$handleProceedButtonClickIntent$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
