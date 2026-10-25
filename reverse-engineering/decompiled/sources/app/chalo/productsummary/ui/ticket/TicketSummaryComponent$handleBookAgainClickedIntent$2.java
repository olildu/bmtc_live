package app.chalo.productsummary.ui.ticket;

import app.chalo.home.domain.ChaloUserBookingType;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import defpackage.hi1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.productsummary.ui.ticket.TicketSummaryComponent$handleBookAgainClickedIntent$2", f = "TicketSummaryComponent.kt", l = {}, m = "invokeSuspend", v = 1)
final class TicketSummaryComponent$handleBookAgainClickedIntent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ TicketSummaryComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TicketSummaryComponent$handleBookAgainClickedIntent$2(TicketSummaryComponent ticketSummaryComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ticketSummaryComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TicketSummaryComponent$handleBookAgainClickedIntent$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        TicketSummaryComponent$handleBookAgainClickedIntent$2 ticketSummaryComponent$handleBookAgainClickedIntent$2 = (TicketSummaryComponent$handleBookAgainClickedIntent$2) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        ticketSummaryComponent$handleBookAgainClickedIntent$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        ChaloUserBookingType chaloUserBookingType = ((TicketSummaryDataState) this.this$0.f.getValue()).f;
        if (!(chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.QuickPayBooking) && !(chaloUserBookingType instanceof ChaloUserBookingType.SuperPassBooking.PendingSuperPassBooking) && !(chaloUserBookingType instanceof ChaloUserBookingType.SuperPassBooking.SuperPassApplicationBooking) && !(chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.PassRideBooking) && !(chaloUserBookingType instanceof ChaloUserBookingType.SuperPassBooking.MagicSuperPassBooking) && !(chaloUserBookingType instanceof ChaloUserBookingType.SuperPassBooking.RideBasedSuperPassBooking) && !(chaloUserBookingType instanceof ChaloUserBookingType.CardBooking) && chaloUserBookingType != null) {
            if (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.PremiumBusBooking) {
                TicketSummaryComponent ticketSummaryComponent = this.this$0;
                PremiumReserveTicketAppModel premiumReserveTicketAppModel = ((ChaloUserBookingType.TicketBooking.PremiumBusBooking) chaloUserBookingType).d;
                ticketSummaryComponent.E0(new hi1(21));
                BuildersKt.d(ticketSummaryComponent.j, null, null, new TicketSummaryComponent$handlePremiumBusBookAgainClick$2(ticketSummaryComponent, premiumReserveTicketAppModel, null), 3);
            } else if (!(chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.InstantTicketBooking) && !(chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.OndcMetroTicketBooking) && !(chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.OndcTicketBooking) && !(chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.MetroTicketBooking) && !(chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.MultiModalGroupTicketBooking)) {
                if (!(chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.MobileTicketBooking)) {
                    throw new NoWhenBranchMatchedException();
                }
                TicketSummaryComponent ticketSummaryComponent2 = this.this$0;
                ticketSummaryComponent2.E0(new hi1(17));
                BuildersKt.d(ticketSummaryComponent2.j, null, null, new TicketSummaryComponent$handleMTicketBookAgain$2((ChaloUserBookingType.TicketBooking.MobileTicketBooking) chaloUserBookingType, ticketSummaryComponent2, null), 3);
            }
        }
        return Unit.f17538a;
    }
}
