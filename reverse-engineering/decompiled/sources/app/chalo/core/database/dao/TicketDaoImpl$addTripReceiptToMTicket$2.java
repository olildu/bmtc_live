package app.chalo.core.database.dao;

import app.cash.sqldelight.db.QueryResult;
import app.chalo.core.TicketQueries;
import app.chalo.models.mticketing.MTicketTripReceipt;
import defpackage.hi1;
import defpackage.rw0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lapp/cash/sqldelight/db/QueryResult;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.core.database.dao.TicketDaoImpl$addTripReceiptToMTicket$2", f = "TicketDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class TicketDaoImpl$addTripReceiptToMTicket$2 extends SuspendLambda implements Function1<Continuation<? super QueryResult<Long>>, Object> {
    final /* synthetic */ MTicketTripReceipt $mTicketTripReceipt;
    final /* synthetic */ String $ticketId;
    int label;
    final /* synthetic */ TicketDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TicketDaoImpl$addTripReceiptToMTicket$2(TicketDaoImpl ticketDaoImpl, MTicketTripReceipt mTicketTripReceipt, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = ticketDaoImpl;
        this.$mTicketTripReceipt = mTicketTripReceipt;
        this.$ticketId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new TicketDaoImpl$addTripReceiptToMTicket$2(this.this$0, this.$mTicketTripReceipt, this.$ticketId, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((TicketDaoImpl$addTripReceiptToMTicket$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        TicketQueries ticketQueries = this.this$0.f2084a;
        MTicketTripReceipt mTicketTripReceipt = this.$mTicketTripReceipt;
        String mticket__mTicketId = this.$ticketId;
        ticketQueries.getClass();
        Intrinsics.i(mticket__mTicketId, "mticket__mTicketId");
        QueryResult queryResultA0 = ticketQueries.f697a.A0(124849715, "UPDATE Ticket SET mticket__mticketTripReceipt = ? WHERE mticket__mTicketId = ?", new rw0(29, mTicketTripReceipt, mticket__mTicketId, ticketQueries));
        ticketQueries.T(124849715, new hi1(13));
        return queryResultA0;
    }
}
