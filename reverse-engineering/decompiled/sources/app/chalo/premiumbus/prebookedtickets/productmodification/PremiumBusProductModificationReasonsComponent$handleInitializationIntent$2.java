package app.chalo.premiumbus.prebookedtickets.productmodification;

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
@DebugMetadata(c = "app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent$handleInitializationIntent$2", f = "PremiumBusProductModificationReasonsComponent.kt", l = {324, 325}, m = "invokeSuspend", v = 1)
final class PremiumBusProductModificationReasonsComponent$handleInitializationIntent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PremiumBusProductModificationReasonsIntent.InitializationIntent $intent;
    Object L$0;
    int label;
    final /* synthetic */ PremiumBusProductModificationReasonsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusProductModificationReasonsComponent$handleInitializationIntent$2(PremiumBusProductModificationReasonsComponent premiumBusProductModificationReasonsComponent, PremiumBusProductModificationReasonsIntent.InitializationIntent initializationIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumBusProductModificationReasonsComponent;
        this.$intent = initializationIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumBusProductModificationReasonsComponent$handleInitializationIntent$2(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumBusProductModificationReasonsComponent$handleInitializationIntent$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent.G0(r6, r1, r5) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.b(r6)
            goto L50
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            java.lang.Object r1 = r5.L$0
            app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent r1 = (app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent) r1
            kotlin.ResultKt.b(r6)
            goto L3a
        L20:
            kotlin.ResultKt.b(r6)
            app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent r1 = r5.this$0
            app.chalo.premiumbus.domain.GetPremiumReserveTicketByIdUseCase r6 = r1.m
            app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsIntent$InitializationIntent r4 = r5.$intent
            java.lang.String r4 = r4.f7345a
            kotlinx.coroutines.flow.Flow r6 = r6.a(r4)
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r6 = kotlinx.coroutines.flow.FlowKt.v(r6, r5)
            if (r6 != r0) goto L3a
            goto L4f
        L3a:
            app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel r6 = (app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel) r6
            r1.D = r6
            app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent r6 = r5.this$0
            app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsIntent$InitializationIntent r1 = r5.$intent
            app.chalo.data.PremiumReserveTicketOptionAction r1 = r1.d
            r3 = 0
            r5.L$0 = r3
            r5.label = r2
            java.lang.Object r6 = app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent.G0(r6, r1, r5)
            if (r6 != r0) goto L50
        L4f:
            return r0
        L50:
            kotlin.Unit r6 = kotlin.Unit.f17538a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent$handleInitializationIntent$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
