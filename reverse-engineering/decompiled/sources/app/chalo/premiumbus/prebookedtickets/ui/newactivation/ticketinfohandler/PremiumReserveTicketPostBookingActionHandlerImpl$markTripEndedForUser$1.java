package app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl", f = "PremiumReserveTicketPostBookingActionHandlerImpl.kt", l = {1045, 1050}, m = "markTripEndedForUser", v = 1)
final class PremiumReserveTicketPostBookingActionHandlerImpl$markTripEndedForUser$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PremiumReserveTicketPostBookingActionHandlerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumReserveTicketPostBookingActionHandlerImpl$markTripEndedForUser$1(PremiumReserveTicketPostBookingActionHandlerImpl premiumReserveTicketPostBookingActionHandlerImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = premiumReserveTicketPostBookingActionHandlerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return PremiumReserveTicketPostBookingActionHandlerImpl.D(this.this$0, this);
    }
}
