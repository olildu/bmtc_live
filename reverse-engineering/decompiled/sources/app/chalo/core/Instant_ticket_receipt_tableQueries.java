package app.chalo.core;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import defpackage.i40;
import defpackage.t60;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/Instant_ticket_receipt_tableQueries;", "Lapp/cash/sqldelight/TransacterImpl;", "GetInstantTicketReceiptFlowQuery", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Instant_ticket_receipt_tableQueries extends TransacterImpl {
    public final Instant_ticket_receipt_table.Adapter b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Instant_ticket_receipt_tableQueries$GetInstantTicketReceiptFlowQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetInstantTicketReceiptFlowQuery<T> extends Query<T> {
        public final String b;
        public final /* synthetic */ Instant_ticket_receipt_tableQueries c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetInstantTicketReceiptFlowQuery(Instant_ticket_receipt_tableQueries instant_ticket_receipt_tableQueries, String bookingId, t60 t60Var) {
            super(t60Var);
            Intrinsics.i(bookingId, "bookingId");
            this.c = instant_ticket_receipt_tableQueries;
            this.b = bookingId;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.c.f697a.P(1311978000, "SELECT instant_ticket_receipt_table.bookingId, instant_ticket_receipt_table.punchTime, instant_ticket_receipt_table.amount, instant_ticket_receipt_table.vehicleNo, instant_ticket_receipt_table.conductorId, instant_ticket_receipt_table.startStopName, instant_ticket_receipt_table.endStopName, instant_ticket_receipt_table.endStopId, instant_ticket_receipt_table.routeName, instant_ticket_receipt_table.productReceiptPassengerDetails, instant_ticket_receipt_table.via, instant_ticket_receipt_table.routeNamingScheme, instant_ticket_receipt_table.depotName, instant_ticket_receipt_table.etimGeneratedTicketId, instant_ticket_receipt_table.scheduleNumber, instant_ticket_receipt_table.routeServiceType, instant_ticket_receipt_table.driverId, instant_ticket_receipt_table.waybillNo, instant_ticket_receipt_table.etimVersion, instant_ticket_receipt_table.receiptFareBreakup FROM instant_ticket_receipt_table WHERE bookingId = ?", function1, 1, new a(this, 0));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.c.f697a.h1(new String[]{"instant_ticket_receipt_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.c.f697a.P0(new String[]{"instant_ticket_receipt_table"}, listener);
        }

        public final String toString() {
            return "instant_ticket_receipt_table.sq:getInstantTicketReceiptFlow";
        }
    }

    public Instant_ticket_receipt_tableQueries(SqlDriver sqlDriver, Instant_ticket_receipt_table.Adapter adapter) {
        super(sqlDriver);
        this.b = adapter;
    }

    public final Query W(String bookingId, Function20 function20) {
        Intrinsics.i(bookingId, "bookingId");
        return new GetInstantTicketReceiptFlowQuery(this, bookingId, new t60(11, function20, this));
    }
}
