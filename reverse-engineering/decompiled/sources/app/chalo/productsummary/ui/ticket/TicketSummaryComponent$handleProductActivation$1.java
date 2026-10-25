package app.chalo.productsummary.ui.ticket;

import app.chalo.home.domain.ChaloUserBookingType;
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
@DebugMetadata(c = "app.chalo.productsummary.ui.ticket.TicketSummaryComponent$handleProductActivation$1", f = "TicketSummaryComponent.kt", l = {619, 634, 647, 653}, m = "invokeSuspend", v = 1)
final class TicketSummaryComponent$handleProductActivation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ChaloUserBookingType $bookingType;
    Object L$0;
    int label;
    final /* synthetic */ TicketSummaryComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TicketSummaryComponent$handleProductActivation$1(TicketSummaryComponent ticketSummaryComponent, ChaloUserBookingType chaloUserBookingType, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ticketSummaryComponent;
        this.$bookingType = chaloUserBookingType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TicketSummaryComponent$handleProductActivation$1(this.this$0, this.$bookingType, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TicketSummaryComponent$handleProductActivation$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x010d, code lost:
    
        if (app.chalo.productsummary.ui.ticket.TicketSummaryComponent.K0(r12.this$0, (app.chalo.home.domain.ChaloUserBookingType.TicketBooking.PremiumBusBooking) r13, r12) == r0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0143, code lost:
    
        if (app.chalo.productsummary.ui.ticket.TicketSummaryComponent.J0(r1, r13, r12) == r0) goto L74;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productsummary.ui.ticket.TicketSummaryComponent$handleProductActivation$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
