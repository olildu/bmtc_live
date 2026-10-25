package app.chalo.core;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import defpackage.i40;
import defpackage.lu0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/Premium_reserve_ticket_receipt_tableQueries;", "Lapp/cash/sqldelight/TransacterImpl;", "GetPremiumReserveTicketReceiptByIdQuery", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Premium_reserve_ticket_receipt_tableQueries extends TransacterImpl {
    public final Premium_reserve_ticket_receipt_table.Adapter b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Premium_reserve_ticket_receipt_tableQueries$GetPremiumReserveTicketReceiptByIdQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetPremiumReserveTicketReceiptByIdQuery<T> extends Query<T> {
        public final String b;
        public final /* synthetic */ Premium_reserve_ticket_receipt_tableQueries c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetPremiumReserveTicketReceiptByIdQuery(Premium_reserve_ticket_receipt_tableQueries premium_reserve_ticket_receipt_tableQueries, String bookingId, lu0 lu0Var) {
            super(lu0Var);
            Intrinsics.i(bookingId, "bookingId");
            this.c = premium_reserve_ticket_receipt_tableQueries;
            this.b = bookingId;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.c.f697a.P(2133385935, "SELECT premium_reserve_ticket_receipt_table.bookingId, premium_reserve_ticket_receipt_table.punchTime, premium_reserve_ticket_receipt_table.amount, premium_reserve_ticket_receipt_table.vehicleNo, premium_reserve_ticket_receipt_table.conductorId, premium_reserve_ticket_receipt_table.startStopName, premium_reserve_ticket_receipt_table.endStopName, premium_reserve_ticket_receipt_table.routeName, premium_reserve_ticket_receipt_table.productType, premium_reserve_ticket_receipt_table.productSubType, premium_reserve_ticket_receipt_table.userId, premium_reserve_ticket_receipt_table.productReceiptPassengerDetails, premium_reserve_ticket_receipt_table.refundInfo FROM premium_reserve_ticket_receipt_table WHERE bookingId = ?", function1, 1, new b(this, 10));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.c.f697a.h1(new String[]{"premium_reserve_ticket_receipt_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.c.f697a.P0(new String[]{"premium_reserve_ticket_receipt_table"}, listener);
        }

        public final String toString() {
            return "premium_reserve_ticket_receipt_table.sq:getPremiumReserveTicketReceiptById";
        }
    }

    public Premium_reserve_ticket_receipt_tableQueries(SqlDriver sqlDriver, Premium_reserve_ticket_receipt_table.Adapter adapter) {
        super(sqlDriver);
        this.b = adapter;
    }

    public final Query W(String bookingId, Function13 function13) {
        Intrinsics.i(bookingId, "bookingId");
        return new GetPremiumReserveTicketReceiptByIdQuery(this, bookingId, new lu0(13, function13, this));
    }
}
