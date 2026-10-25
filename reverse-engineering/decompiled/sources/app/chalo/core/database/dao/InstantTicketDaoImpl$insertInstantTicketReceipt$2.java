package app.chalo.core.database.dao;

import app.cash.sqldelight.db.QueryResult;
import app.chalo.core.Instant_ticket_receipt_table;
import app.chalo.core.Instant_ticket_receipt_tableQueries;
import app.chalo.instantticket.data.model.InstantTicketReceipt;
import defpackage.ib0;
import defpackage.t60;
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
@DebugMetadata(c = "app.chalo.core.database.dao.InstantTicketDaoImpl$insertInstantTicketReceipt$2", f = "InstantTicketDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class InstantTicketDaoImpl$insertInstantTicketReceipt$2 extends SuspendLambda implements Function1<Continuation<? super QueryResult<Long>>, Object> {
    final /* synthetic */ InstantTicketReceipt $instantTicketReceipt;
    int label;
    final /* synthetic */ InstantTicketDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstantTicketDaoImpl$insertInstantTicketReceipt$2(InstantTicketDaoImpl instantTicketDaoImpl, InstantTicketReceipt instantTicketReceipt, Continuation continuation) {
        super(1, continuation);
        this.this$0 = instantTicketDaoImpl;
        this.$instantTicketReceipt = instantTicketReceipt;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new InstantTicketDaoImpl$insertInstantTicketReceipt$2(this.this$0, this.$instantTicketReceipt, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((InstantTicketDaoImpl$insertInstantTicketReceipt$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        Instant_ticket_receipt_tableQueries instant_ticket_receipt_tableQueries = this.this$0.b;
        InstantTicketReceipt instantTicketReceipt = this.$instantTicketReceipt;
        Intrinsics.i(instantTicketReceipt, "<this>");
        Instant_ticket_receipt_table instant_ticket_receipt_table = new Instant_ticket_receipt_table(instantTicketReceipt.f3843a, instantTicketReceipt.b, instantTicketReceipt.c, instantTicketReceipt.d, instantTicketReceipt.e, instantTicketReceipt.f, instantTicketReceipt.g, instantTicketReceipt.h, instantTicketReceipt.i, instantTicketReceipt.j, instantTicketReceipt.k, instantTicketReceipt.l, instantTicketReceipt.m, instantTicketReceipt.n, instantTicketReceipt.o, instantTicketReceipt.p, instantTicketReceipt.q, instantTicketReceipt.r, instantTicketReceipt.s, instantTicketReceipt.t);
        instant_ticket_receipt_tableQueries.getClass();
        QueryResult queryResultA0 = instant_ticket_receipt_tableQueries.f697a.A0(466297283, "INSERT OR REPLACE INTO instant_ticket_receipt_table (bookingId, punchTime, amount, vehicleNo, conductorId, startStopName, endStopName, endStopId, routeName, productReceiptPassengerDetails, via, routeNamingScheme, depotName, etimGeneratedTicketId, scheduleNumber, routeServiceType, driverId, waybillNo, etimVersion, receiptFareBreakup) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new t60(10, instant_ticket_receipt_table, instant_ticket_receipt_tableQueries));
        instant_ticket_receipt_tableQueries.T(466297283, new ib0(0));
        return queryResultA0;
    }
}
