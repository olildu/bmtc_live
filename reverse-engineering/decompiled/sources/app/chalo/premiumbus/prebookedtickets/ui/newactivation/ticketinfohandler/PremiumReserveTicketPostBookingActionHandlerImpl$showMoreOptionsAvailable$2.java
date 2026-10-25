package app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler;

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
@DebugMetadata(c = "app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$showMoreOptionsAvailable$2", f = "PremiumReserveTicketPostBookingActionHandlerImpl.kt", l = {534, 556}, m = "invokeSuspend", v = 1)
final class PremiumReserveTicketPostBookingActionHandlerImpl$showMoreOptionsAvailable$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $bookingId;
    final /* synthetic */ String $productSubType;
    final /* synthetic */ String $productType;
    int label;
    final /* synthetic */ PremiumReserveTicketPostBookingActionHandlerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumReserveTicketPostBookingActionHandlerImpl$showMoreOptionsAvailable$2(PremiumReserveTicketPostBookingActionHandlerImpl premiumReserveTicketPostBookingActionHandlerImpl, String str, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumReserveTicketPostBookingActionHandlerImpl;
        this.$bookingId = str;
        this.$productType = str2;
        this.$productSubType = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumReserveTicketPostBookingActionHandlerImpl$showMoreOptionsAvailable$2(this.this$0, this.$bookingId, this.$productType, this.$productSubType, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumReserveTicketPostBookingActionHandlerImpl$showMoreOptionsAvailable$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
    
        if (r8 == r0) goto L24;
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
            app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionEffect$DialogTypeUpdated r2 = app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionEffect.DialogTypeUpdated.f7431a
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L13
            kotlin.ResultKt.b(r8)
            goto L8d
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            kotlin.ResultKt.b(r8)
            goto L35
        L1f:
            kotlin.ResultKt.b(r8)
            app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl r8 = r7.this$0
            app.chalo.premiumbus.prebookedtickets.domain.FetchPremiumBusTicketsUpdateOptionsUseCase r8 = r8.i
            java.lang.String r1 = r7.$bookingId
            java.lang.String r5 = r7.$productType
            java.lang.String r6 = r7.$productSubType
            r7.label = r4
            java.lang.Object r8 = r8.a(r1, r5, r6, r7)
            if (r8 != r0) goto L35
            goto L8c
        L35:
            app.chalo.utils.ChaloUseCaseResult r8 = (app.chalo.utils.ChaloUseCaseResult) r8
            boolean r1 = r8 instanceof app.chalo.utils.ChaloUseCaseResult.Success
            if (r1 == 0) goto L63
            app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl r0 = r7.this$0
            kotlinx.coroutines.flow.MutableStateFlow r0 = r0.H
            kotlinx.coroutines.flow.StateFlow r0 = kotlinx.coroutines.flow.FlowKt.c(r0)
            java.lang.Object r0 = r0.getValue()
            app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionState r0 = (app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionState) r0
            app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusPostBookingBottomSheetType r0 = r0.o
            boolean r0 = r0 instanceof app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusPostBookingBottomSheetType.FetchingTicketUpdateOptions
            if (r0 == 0) goto L9f
            app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl r0 = r7.this$0
            yg r1 = new yg
            app.chalo.utils.ChaloUseCaseResult$Success r8 = (app.chalo.utils.ChaloUseCaseResult.Success) r8
            r3 = 18
            r1.<init>(r8, r3)
            r0.f0(r1)
            app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl r8 = r7.this$0
            r8.J(r2)
            goto L9f
        L63:
            boolean r8 = r8 instanceof app.chalo.utils.ChaloUseCaseResult.Failure
            if (r8 == 0) goto La2
            app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl r8 = r7.this$0
            kotlinx.coroutines.flow.MutableStateFlow r8 = r8.H
            kotlinx.coroutines.flow.StateFlow r8 = kotlinx.coroutines.flow.FlowKt.c(r8)
            java.lang.Object r8 = r8.getValue()
            app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionState r8 = (app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionState) r8
            app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusPostBookingBottomSheetType r8 = r8.o
            boolean r8 = r8 instanceof app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusPostBookingBottomSheetType.FetchingTicketUpdateOptions
            if (r8 == 0) goto L9f
            app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl r8 = r7.this$0
            app.chalo.providers.stringprovider.StringProvider r8 = r8.c
            app.chalo.providers.stringprovider.StringEnum r1 = app.chalo.providers.stringprovider.StringEnum.SOMETHING_WENT_WRONG
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r7.label = r3
            java.lang.Object r8 = r8.b(r1, r4, r7)
            if (r8 != r0) goto L8d
        L8c:
            return r0
        L8d:
            java.lang.String r8 = (java.lang.String) r8
            app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl r0 = r7.this$0
            eu0 r1 = new eu0
            r3 = 7
            r1.<init>(r8, r3)
            r0.f0(r1)
            app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl r8 = r7.this$0
            r8.J(r2)
        L9f:
            kotlin.Unit r8 = kotlin.Unit.f17538a
            return r8
        La2:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$showMoreOptionsAvailable$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
