package app.chalo.core;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import defpackage.i40;
import defpackage.qi0;
import defpackage.t60;
import defpackage.vi0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/core/Metro_ticket_tableQueries;", "Lapp/cash/sqldelight/TransacterImpl;", "GetMetroTicketQuery", "GetMetroTicketAsFlowQuery", "GetAllMetroTicketsQuery", "GetAllMetroTicketsAsFlowQuery", "GetMetroTicketsForMultipleStatusesAsFlowQuery", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Metro_ticket_tableQueries extends TransacterImpl {
    public final Metro_ticket_table.Adapter b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Metro_ticket_tableQueries$GetAllMetroTicketsAsFlowQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllMetroTicketsAsFlowQuery<T> extends Query<T> {
        public final String b;
        public final String c;

        public GetAllMetroTicketsAsFlowQuery(String str, String str2, vi0 vi0Var) {
            super(vi0Var);
            this.b = str;
            this.c = str2;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return Metro_ticket_tableQueries.this.f697a.P(865953095, "SELECT metro_ticket_table.bookingId, metro_ticket_table.userId, metro_ticket_table.bookingTime, metro_ticket_table.amount, metro_ticket_table.status, metro_ticket_table.punchTime, metro_ticket_table.city, metro_ticket_table.qrCode, metro_ticket_table.validationInfoEntityList, metro_ticket_table.tone, metro_ticket_table.activationExpiryTime, metro_ticket_table.passengerDetails, metro_ticket_table.routeName, metro_ticket_table.startStopDetails, metro_ticket_table.endStopDetails, metro_ticket_table.refundInfo FROM metro_ticket_table WHERE city = ? AND userId = ?", function1, 2, new a(this, 16));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            Metro_ticket_tableQueries.this.f697a.h1(new String[]{"metro_ticket_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            Metro_ticket_tableQueries.this.f697a.P0(new String[]{"metro_ticket_table"}, listener);
        }

        public final String toString() {
            return "metro_ticket_table.sq:getAllMetroTicketsAsFlow";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Metro_ticket_tableQueries$GetAllMetroTicketsQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllMetroTicketsQuery<T> extends Query<T> {
        public final String b;
        public final String c;
        public final /* synthetic */ Metro_ticket_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetAllMetroTicketsQuery(Metro_ticket_tableQueries metro_ticket_tableQueries, String city, String userId, vi0 vi0Var) {
            super(vi0Var);
            Intrinsics.i(city, "city");
            Intrinsics.i(userId, "userId");
            this.d = metro_ticket_tableQueries;
            this.b = city;
            this.c = userId;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.d.f697a.P(949987815, "SELECT metro_ticket_table.bookingId, metro_ticket_table.userId, metro_ticket_table.bookingTime, metro_ticket_table.amount, metro_ticket_table.status, metro_ticket_table.punchTime, metro_ticket_table.city, metro_ticket_table.qrCode, metro_ticket_table.validationInfoEntityList, metro_ticket_table.tone, metro_ticket_table.activationExpiryTime, metro_ticket_table.passengerDetails, metro_ticket_table.routeName, metro_ticket_table.startStopDetails, metro_ticket_table.endStopDetails, metro_ticket_table.refundInfo FROM metro_ticket_table WHERE city = ? AND userId = ?", function1, 2, new a(this, 17));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"metro_ticket_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"metro_ticket_table"}, listener);
        }

        public final String toString() {
            return "metro_ticket_table.sq:getAllMetroTickets";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Metro_ticket_tableQueries$GetMetroTicketAsFlowQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetMetroTicketAsFlowQuery<T> extends Query<T> {
        public final String b;
        public final String c;
        public final /* synthetic */ Metro_ticket_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetMetroTicketAsFlowQuery(Metro_ticket_tableQueries metro_ticket_tableQueries, String bookingId, String str, vi0 vi0Var) {
            super(vi0Var);
            Intrinsics.i(bookingId, "bookingId");
            this.d = metro_ticket_tableQueries;
            this.b = bookingId;
            this.c = str;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.d.f697a.P(983406205, "SELECT metro_ticket_table.bookingId, metro_ticket_table.userId, metro_ticket_table.bookingTime, metro_ticket_table.amount, metro_ticket_table.status, metro_ticket_table.punchTime, metro_ticket_table.city, metro_ticket_table.qrCode, metro_ticket_table.validationInfoEntityList, metro_ticket_table.tone, metro_ticket_table.activationExpiryTime, metro_ticket_table.passengerDetails, metro_ticket_table.routeName, metro_ticket_table.startStopDetails, metro_ticket_table.endStopDetails, metro_ticket_table.refundInfo FROM metro_ticket_table WHERE bookingId = ? AND userId = ?", function1, 2, new a(this, 18));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"metro_ticket_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"metro_ticket_table"}, listener);
        }

        public final String toString() {
            return "metro_ticket_table.sq:getMetroTicketAsFlow";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Metro_ticket_tableQueries$GetMetroTicketQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetMetroTicketQuery<T> extends Query<T> {
        public final String b;
        public final String c;
        public final /* synthetic */ Metro_ticket_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetMetroTicketQuery(Metro_ticket_tableQueries metro_ticket_tableQueries, String bookingId, String userId, vi0 vi0Var) {
            super(vi0Var);
            Intrinsics.i(bookingId, "bookingId");
            Intrinsics.i(userId, "userId");
            this.d = metro_ticket_tableQueries;
            this.b = bookingId;
            this.c = userId;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.d.f697a.P(-887981155, "SELECT metro_ticket_table.bookingId, metro_ticket_table.userId, metro_ticket_table.bookingTime, metro_ticket_table.amount, metro_ticket_table.status, metro_ticket_table.punchTime, metro_ticket_table.city, metro_ticket_table.qrCode, metro_ticket_table.validationInfoEntityList, metro_ticket_table.tone, metro_ticket_table.activationExpiryTime, metro_ticket_table.passengerDetails, metro_ticket_table.routeName, metro_ticket_table.startStopDetails, metro_ticket_table.endStopDetails, metro_ticket_table.refundInfo FROM metro_ticket_table WHERE bookingId = ? AND userId = ?", function1, 2, new a(this, 19));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"metro_ticket_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"metro_ticket_table"}, listener);
        }

        public final String toString() {
            return "metro_ticket_table.sq:getMetroTicket";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Metro_ticket_tableQueries$GetMetroTicketsForMultipleStatusesAsFlowQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetMetroTicketsForMultipleStatusesAsFlowQuery<T> extends Query<T> {
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
            return "metro_ticket_table.sq:getMetroTicketsForMultipleStatusesAsFlow";
        }
    }

    public Metro_ticket_tableQueries(SqlDriver sqlDriver, Metro_ticket_table.Adapter adapter) {
        super(sqlDriver);
        this.b = adapter;
    }

    public final Query W(String city, String userId, Function16 function16) {
        Intrinsics.i(city, "city");
        Intrinsics.i(userId, "userId");
        return new GetAllMetroTicketsQuery(this, city, userId, new vi0(function16, this, 2));
    }

    public final Query X(String str, String str2, Function16 function16) {
        return new GetAllMetroTicketsAsFlowQuery(str, str2, new vi0(function16, this, 1));
    }

    public final Query Y(String bookingId, String userId, Function16 function16) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(userId, "userId");
        return new GetMetroTicketQuery(this, bookingId, userId, new vi0(function16, this, 0));
    }

    public final Query Z(String bookingId, String str, Function16 function16) {
        Intrinsics.i(bookingId, "bookingId");
        return new GetMetroTicketAsFlowQuery(this, bookingId, str, new vi0(function16, this, 3));
    }

    public final QueryResult a0(Metro_ticket_table metro_ticket_table) {
        QueryResult queryResultA0 = this.f697a.A0(-1372314882, "INSERT OR REPLACE INTO metro_ticket_table (bookingId, userId, bookingTime, amount, status, punchTime, city, qrCode, validationInfoEntityList, tone, activationExpiryTime, passengerDetails, routeName, startStopDetails, endStopDetails, refundInfo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new t60(27, metro_ticket_table, this));
        T(-1372314882, new qi0(8));
        return queryResultA0;
    }
}
