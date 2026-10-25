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
@DebugMetadata(c = "app.chalo.home.ui.home.HomeScreenComponent$updatePremiumReserveTicketsList$2", f = "HomeScreenComponent.kt", l = {1194, 1197}, m = "invokeSuspend", v = 1)
final class HomeScreenComponent$updatePremiumReserveTicketsList$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $endTimestampForHomescreenCard;
    final /* synthetic */ long $todayStartTimestamp;
    int label;
    final /* synthetic */ HomeScreenComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeScreenComponent$updatePremiumReserveTicketsList$2(HomeScreenComponent homeScreenComponent, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = homeScreenComponent;
        this.$todayStartTimestamp = j;
        this.$endTimestampForHomescreenCard = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeScreenComponent$updatePremiumReserveTicketsList$2(this.this$0, this.$todayStartTimestamp, this.$endTimestampForHomescreenCard, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((HomeScreenComponent$updatePremiumReserveTicketsList$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (((kotlinx.coroutines.flow.Flow) r11).collect(r1, r10) == r0) goto L15;
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
            goto L43
        L10:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L18:
            kotlin.ResultKt.b(r11)
            goto L31
        L1c:
            kotlin.ResultKt.b(r11)
            app.chalo.home.ui.home.HomeScreenComponent r11 = r10.this$0
            app.chalo.premiumbus.prebookedtickets.domain.GetActivePremiumReserveTicketBetweenGivenTimeUseCase r4 = r11.u
            long r5 = r10.$todayStartTimestamp
            long r7 = r10.$endTimestampForHomescreenCard
            r10.label = r3
            r9 = 0
            kotlinx.coroutines.flow.Flow r11 = r4.a(r5, r7, r9)
            if (r11 != r0) goto L31
            goto L42
        L31:
            kotlinx.coroutines.flow.Flow r11 = (kotlinx.coroutines.flow.Flow) r11
            app.chalo.home.ui.home.HomeScreenComponent$updatePremiumReserveTicketsList$2$1 r1 = new app.chalo.home.ui.home.HomeScreenComponent$updatePremiumReserveTicketsList$2$1
            app.chalo.home.ui.home.HomeScreenComponent r3 = r10.this$0
            r1.<init>()
            r10.label = r2
            java.lang.Object r11 = r11.collect(r1, r10)
            if (r11 != r0) goto L43
        L42:
            return r0
        L43:
            kotlin.Unit r11 = kotlin.Unit.f17538a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.home.HomeScreenComponent$updatePremiumReserveTicketsList$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
