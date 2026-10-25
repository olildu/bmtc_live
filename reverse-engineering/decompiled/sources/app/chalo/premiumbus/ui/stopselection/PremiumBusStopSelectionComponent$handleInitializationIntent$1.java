package app.chalo.premiumbus.ui.stopselection;

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
@DebugMetadata(c = "app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionComponent$handleInitializationIntent$1", f = "PremiumBusStopSelectionComponent.kt", l = {481, 485}, m = "invokeSuspend", v = 1)
final class PremiumBusStopSelectionComponent$handleInitializationIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PremiumBusStopSelectionIntent.InitializationIntent $intent;
    int label;
    final /* synthetic */ PremiumBusStopSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusStopSelectionComponent$handleInitializationIntent$1(PremiumBusStopSelectionComponent premiumBusStopSelectionComponent, PremiumBusStopSelectionIntent.InitializationIntent initializationIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumBusStopSelectionComponent;
        this.$intent = initializationIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumBusStopSelectionComponent$handleInitializationIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumBusStopSelectionComponent$handleInitializationIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if (app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionComponent.I0(r4, r5, r6, r7, r8, r9) == r0) goto L15;
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
            if (r1 == 0) goto L1d
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            kotlin.ResultKt.b(r11)
            r9 = r10
            goto L4f
        L11:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L19:
            kotlin.ResultKt.b(r11)
            goto L2e
        L1d:
            kotlin.ResultKt.b(r11)
            app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionComponent r11 = r10.this$0
            app.chalo.premiumbus.domain.GetRecentAndFlippedOriginDestinationPairsUseCase r11 = r11.o
            r10.label = r3
            java.lang.Object r11 = r11.a(r10)
            if (r11 != r0) goto L2e
            r9 = r10
            goto L4e
        L2e:
            java.util.List r11 = (java.util.List) r11
            r1 = 3
            java.util.List r5 = app.chalo.utils.CollectionUtilsKt.b(r1, r11)
            app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionComponent r4 = r10.this$0
            app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionIntent$InitializationIntent r11 = r10.$intent
            java.lang.String r1 = r11.f7966a
            r4.D = r1
            app.chalo.constants.Source r6 = r11.b
            r4.K = r6
            boolean r7 = r11.c
            boolean r8 = r11.d
            r10.label = r2
            r9 = r10
            java.lang.Object r11 = app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionComponent.I0(r4, r5, r6, r7, r8, r9)
            if (r11 != r0) goto L4f
        L4e:
            return r0
        L4f:
            app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionComponent r11 = r9.this$0
            r11.d = r3
            kotlin.Unit r11 = kotlin.Unit.f17538a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionComponent$handleInitializationIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
