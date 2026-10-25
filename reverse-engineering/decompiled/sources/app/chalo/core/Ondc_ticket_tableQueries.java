package app.chalo.core;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import defpackage.bo0;
import defpackage.co0;
import defpackage.do0;
import defpackage.i40;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/core/Ondc_ticket_tableQueries;", "Lapp/cash/sqldelight/TransacterImpl;", "GetOndcTicketQuery", "GetOndcTicketAsFlowQuery", "GetAllOndcTicketsQuery", "GetAllOndcTicketsAsFlowQuery", "GetActiveOrPaymentProcessingOndcTicketsAsFlowQuery", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Ondc_ticket_tableQueries extends TransacterImpl {
    public final Ondc_ticket_table.Adapter b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Ondc_ticket_tableQueries$GetActiveOrPaymentProcessingOndcTicketsAsFlowQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetActiveOrPaymentProcessingOndcTicketsAsFlowQuery<T> extends Query<T> {
        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            throw null;
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            throw null;
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            throw null;
        }

        public final String toString() {
            return "ondc_ticket_table.sq:getActiveOrPaymentProcessingOndcTicketsAsFlow";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Ondc_ticket_tableQueries$GetAllOndcTicketsAsFlowQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllOndcTicketsAsFlowQuery<T> extends Query<T> {
        public final String b;
        public final String c;

        public GetAllOndcTicketsAsFlowQuery(String str, String str2, bo0 bo0Var) {
            super(bo0Var);
            this.b = str;
            this.c = str2;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return Ondc_ticket_tableQueries.this.f697a.P(761222771, "SELECT ondc_ticket_table.bookingId, ondc_ticket_table.userId, ondc_ticket_table.bookingTime, ondc_ticket_table.amount, ondc_ticket_table.status, ondc_ticket_table.punchTime, ondc_ticket_table.city, ondc_ticket_table.qrCode, ondc_ticket_table.tone, ondc_ticket_table.activationExpiryTime, ondc_ticket_table.passengerDetails, ondc_ticket_table.routeName, ondc_ticket_table.startStopName, ondc_ticket_table.endStopName, ondc_ticket_table.refundInfo, ondc_ticket_table.fareBreakup, ondc_ticket_table.validationInfoEntityList, ondc_ticket_table.ticketColorHex FROM ondc_ticket_table WHERE city = ? AND userId = ?", function1, 2, new b(this, 2));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            Ondc_ticket_tableQueries.this.f697a.h1(new String[]{"ondc_ticket_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            Ondc_ticket_tableQueries.this.f697a.P0(new String[]{"ondc_ticket_table"}, listener);
        }

        public final String toString() {
            return "ondc_ticket_table.sq:getAllOndcTicketsAsFlow";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Ondc_ticket_tableQueries$GetAllOndcTicketsQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllOndcTicketsQuery<T> extends Query<T> {
        public final String b;
        public final String c;
        public final /* synthetic */ Ondc_ticket_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetAllOndcTicketsQuery(Ondc_ticket_tableQueries ondc_ticket_tableQueries, String city, String userId, bo0 bo0Var) {
            super(bo0Var);
            Intrinsics.i(city, "city");
            Intrinsics.i(userId, "userId");
            this.d = ondc_ticket_tableQueries;
            this.b = city;
            this.c = userId;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.d.f697a.P(1648946195, "SELECT ondc_ticket_table.bookingId, ondc_ticket_table.userId, ondc_ticket_table.bookingTime, ondc_ticket_table.amount, ondc_ticket_table.status, ondc_ticket_table.punchTime, ondc_ticket_table.city, ondc_ticket_table.qrCode, ondc_ticket_table.tone, ondc_ticket_table.activationExpiryTime, ondc_ticket_table.passengerDetails, ondc_ticket_table.routeName, ondc_ticket_table.startStopName, ondc_ticket_table.endStopName, ondc_ticket_table.refundInfo, ondc_ticket_table.fareBreakup, ondc_ticket_table.validationInfoEntityList, ondc_ticket_table.ticketColorHex FROM ondc_ticket_table WHERE city = ? AND userId = ?", function1, 2, new b(this, 3));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"ondc_ticket_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"ondc_ticket_table"}, listener);
        }

        public final String toString() {
            return "ondc_ticket_table.sq:getAllOndcTickets";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Ondc_ticket_tableQueries$GetOndcTicketAsFlowQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetOndcTicketAsFlowQuery<T> extends Query<T> {
        public final String b;
        public final String c;
        public final /* synthetic */ Ondc_ticket_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetOndcTicketAsFlowQuery(Ondc_ticket_tableQueries ondc_ticket_tableQueries, String bookingId, String str, bo0 bo0Var) {
            super(bo0Var);
            Intrinsics.i(bookingId, "bookingId");
            this.d = ondc_ticket_tableQueries;
            this.b = bookingId;
            this.c = str;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.d.f697a.P(-1608904779, "SELECT ondc_ticket_table.bookingId, ondc_ticket_table.userId, ondc_ticket_table.bookingTime, ondc_ticket_table.amount, ondc_ticket_table.status, ondc_ticket_table.punchTime, ondc_ticket_table.city, ondc_ticket_table.qrCode, ondc_ticket_table.tone, ondc_ticket_table.activationExpiryTime, ondc_ticket_table.passengerDetails, ondc_ticket_table.routeName, ondc_ticket_table.startStopName, ondc_ticket_table.endStopName, ondc_ticket_table.refundInfo, ondc_ticket_table.fareBreakup, ondc_ticket_table.validationInfoEntityList, ondc_ticket_table.ticketColorHex FROM ondc_ticket_table WHERE bookingId = ? AND userId = ?", function1, 2, new b(this, 4));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"ondc_ticket_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"ondc_ticket_table"}, listener);
        }

        public final String toString() {
            return "ondc_ticket_table.sq:getOndcTicketAsFlow";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Ondc_ticket_tableQueries$GetOndcTicketQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetOndcTicketQuery<T> extends Query<T> {
        public final String b;
        public final String c;
        public final /* synthetic */ Ondc_ticket_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetOndcTicketQuery(Ondc_ticket_tableQueries ondc_ticket_tableQueries, String bookingId, String userId, bo0 bo0Var) {
            super(bo0Var);
            Intrinsics.i(bookingId, "bookingId");
            Intrinsics.i(userId, "userId");
            this.d = ondc_ticket_tableQueries;
            this.b = bookingId;
            this.c = userId;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.d.f697a.P(1087389397, "SELECT ondc_ticket_table.bookingId, ondc_ticket_table.userId, ondc_ticket_table.bookingTime, ondc_ticket_table.amount, ondc_ticket_table.status, ondc_ticket_table.punchTime, ondc_ticket_table.city, ondc_ticket_table.qrCode, ondc_ticket_table.tone, ondc_ticket_table.activationExpiryTime, ondc_ticket_table.passengerDetails, ondc_ticket_table.routeName, ondc_ticket_table.startStopName, ondc_ticket_table.endStopName, ondc_ticket_table.refundInfo, ondc_ticket_table.fareBreakup, ondc_ticket_table.validationInfoEntityList, ondc_ticket_table.ticketColorHex FROM ondc_ticket_table WHERE bookingId = ? AND userId = ?", function1, 2, new b(this, 5));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"ondc_ticket_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"ondc_ticket_table"}, listener);
        }

        public final String toString() {
            return "ondc_ticket_table.sq:getOndcTicket";
        }
    }

    public Ondc_ticket_tableQueries(SqlDriver sqlDriver, Ondc_ticket_table.Adapter adapter) {
        super(sqlDriver);
        this.b = adapter;
    }

    public final Query W(String city, String userId, Function18 function18) {
        Intrinsics.i(city, "city");
        Intrinsics.i(userId, "userId");
        return new GetAllOndcTicketsQuery(this, city, userId, new bo0(function18, this, 0));
    }

    public final Query X(String str, String str2, Function18 function18) {
        return new GetAllOndcTicketsAsFlowQuery(str, str2, new bo0(function18, this, 1));
    }

    public final Query Y(String bookingId, String userId, Function18 function18) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(userId, "userId");
        return new GetOndcTicketQuery(this, bookingId, userId, new bo0(function18, this, 3));
    }

    public final Query Z(String bookingId, String str, Function18 function18) {
        Intrinsics.i(bookingId, "bookingId");
        return new GetOndcTicketAsFlowQuery(this, bookingId, str, new bo0(function18, this, 2));
    }

    public final void a0(Ondc_ticket_table ondc_ticket_table) {
        this.f697a.A0(800175877, "INSERT OR REPLACE INTO ondc_ticket_table (bookingId, userId, bookingTime, amount, status, punchTime, city, qrCode, tone, activationExpiryTime, passengerDetails, routeName, startStopName, endStopName, refundInfo, fareBreakup, validationInfoEntityList, ticketColorHex) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new co0(ondc_ticket_table, this, 1));
        T(800175877, new do0(1));
    }
}
