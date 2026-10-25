package app.chalo.core;

import app.cash.sqldelight.BaseTransacterImpl;
import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import defpackage.i40;
import defpackage.ib0;
import defpackage.jb0;
import defpackage.lb0;
import defpackage.qd;
import defpackage.vo1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/core/Instant_ticket_tableQueries;", "Lapp/cash/sqldelight/TransacterImpl;", "GetInstantTicketQuery", "GetInstantTicketAsFlowQuery", "GetAllInstantTicketsQuery", "GetAllInstantTicketsAsFlowQuery", "GetActiveOrPaymentProcessingInstantTicketsAsFlowQuery", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Instant_ticket_tableQueries extends TransacterImpl {
    public final Instant_ticket_table.Adapter b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Instant_ticket_tableQueries$GetActiveOrPaymentProcessingInstantTicketsAsFlowQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetActiveOrPaymentProcessingInstantTicketsAsFlowQuery<T> extends Query<T> {
        public final Collection b;
        public final String c;
        public final /* synthetic */ Instant_ticket_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetActiveOrPaymentProcessingInstantTicketsAsFlowQuery(Instant_ticket_tableQueries instant_ticket_tableQueries, Collection city, String str, jb0 jb0Var) {
            super(jb0Var);
            Intrinsics.i(city, "city");
            this.d = instant_ticket_tableQueries;
            this.b = city;
            this.c = str;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            Collection collection = this.b;
            return this.d.f697a.P(null, vo1.B("SELECT instant_ticket_table.bookingId, instant_ticket_table.userId, instant_ticket_table.productName, instant_ticket_table.bookingTime, instant_ticket_table.amount, instant_ticket_table.status, instant_ticket_table.punchTime, instant_ticket_table.city, instant_ticket_table.qrCode, instant_ticket_table.tone, instant_ticket_table.activationExpiryTime, instant_ticket_table.routeId, instant_ticket_table.routeName, instant_ticket_table.startStopId, instant_ticket_table.startStopName, instant_ticket_table.endStopId, instant_ticket_table.endStopName, instant_ticket_table.passengerDetails, instant_ticket_table.refundInfo FROM instant_ticket_table WHERE (status = 'ACTIVE' OR status = 'PAYMENT_PROCESSING') AND city IN ", BaseTransacterImpl.S(collection.size()), " AND userId = ?"), function1, collection.size() + 1, new a(this, 1));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"instant_ticket_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"instant_ticket_table"}, listener);
        }

        public final String toString() {
            return "instant_ticket_table.sq:getActiveOrPaymentProcessingInstantTicketsAsFlow";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Instant_ticket_tableQueries$GetAllInstantTicketsAsFlowQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllInstantTicketsAsFlowQuery<T> extends Query<T> {
        public final Collection b;
        public final String c;
        public final /* synthetic */ Instant_ticket_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetAllInstantTicketsAsFlowQuery(Instant_ticket_tableQueries instant_ticket_tableQueries, Collection city, String str, jb0 jb0Var) {
            super(jb0Var);
            Intrinsics.i(city, "city");
            this.d = instant_ticket_tableQueries;
            this.b = city;
            this.c = str;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            Collection collection = this.b;
            return this.d.f697a.P(null, vo1.B("SELECT instant_ticket_table.bookingId, instant_ticket_table.userId, instant_ticket_table.productName, instant_ticket_table.bookingTime, instant_ticket_table.amount, instant_ticket_table.status, instant_ticket_table.punchTime, instant_ticket_table.city, instant_ticket_table.qrCode, instant_ticket_table.tone, instant_ticket_table.activationExpiryTime, instant_ticket_table.routeId, instant_ticket_table.routeName, instant_ticket_table.startStopId, instant_ticket_table.startStopName, instant_ticket_table.endStopId, instant_ticket_table.endStopName, instant_ticket_table.passengerDetails, instant_ticket_table.refundInfo FROM instant_ticket_table WHERE city IN ", BaseTransacterImpl.S(collection.size()), " AND userId = ?"), function1, collection.size() + 1, new a(this, 2));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"instant_ticket_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"instant_ticket_table"}, listener);
        }

        public final String toString() {
            return "instant_ticket_table.sq:getAllInstantTicketsAsFlow";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Instant_ticket_tableQueries$GetAllInstantTicketsQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllInstantTicketsQuery<T> extends Query<T> {
        public final Collection b;
        public final String c;
        public final /* synthetic */ Instant_ticket_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetAllInstantTicketsQuery(Instant_ticket_tableQueries instant_ticket_tableQueries, Collection city, String userId, jb0 jb0Var) {
            super(jb0Var);
            Intrinsics.i(city, "city");
            Intrinsics.i(userId, "userId");
            this.d = instant_ticket_tableQueries;
            this.b = city;
            this.c = userId;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            Collection collection = this.b;
            return this.d.f697a.P(null, vo1.B("SELECT instant_ticket_table.bookingId, instant_ticket_table.userId, instant_ticket_table.productName, instant_ticket_table.bookingTime, instant_ticket_table.amount, instant_ticket_table.status, instant_ticket_table.punchTime, instant_ticket_table.city, instant_ticket_table.qrCode, instant_ticket_table.tone, instant_ticket_table.activationExpiryTime, instant_ticket_table.routeId, instant_ticket_table.routeName, instant_ticket_table.startStopId, instant_ticket_table.startStopName, instant_ticket_table.endStopId, instant_ticket_table.endStopName, instant_ticket_table.passengerDetails, instant_ticket_table.refundInfo FROM instant_ticket_table WHERE city IN ", BaseTransacterImpl.S(collection.size()), " AND userId = ?"), function1, collection.size() + 1, new a(this, 3));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"instant_ticket_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"instant_ticket_table"}, listener);
        }

        public final String toString() {
            return "instant_ticket_table.sq:getAllInstantTickets";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Instant_ticket_tableQueries$GetInstantTicketAsFlowQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetInstantTicketAsFlowQuery<T> extends Query<T> {
        public final String b;
        public final String c;
        public final /* synthetic */ Instant_ticket_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetInstantTicketAsFlowQuery(Instant_ticket_tableQueries instant_ticket_tableQueries, String bookingId, String str, jb0 jb0Var) {
            super(jb0Var);
            Intrinsics.i(bookingId, "bookingId");
            this.d = instant_ticket_tableQueries;
            this.b = bookingId;
            this.c = str;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.d.f697a.P(-94689347, "SELECT instant_ticket_table.bookingId, instant_ticket_table.userId, instant_ticket_table.productName, instant_ticket_table.bookingTime, instant_ticket_table.amount, instant_ticket_table.status, instant_ticket_table.punchTime, instant_ticket_table.city, instant_ticket_table.qrCode, instant_ticket_table.tone, instant_ticket_table.activationExpiryTime, instant_ticket_table.routeId, instant_ticket_table.routeName, instant_ticket_table.startStopId, instant_ticket_table.startStopName, instant_ticket_table.endStopId, instant_ticket_table.endStopName, instant_ticket_table.passengerDetails, instant_ticket_table.refundInfo FROM instant_ticket_table WHERE bookingId = ? AND userId = ?", function1, 2, new a(this, 4));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"instant_ticket_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"instant_ticket_table"}, listener);
        }

        public final String toString() {
            return "instant_ticket_table.sq:getInstantTicketAsFlow";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Instant_ticket_tableQueries$GetInstantTicketQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetInstantTicketQuery<T> extends Query<T> {
        public final String b;
        public final String c;
        public final /* synthetic */ Instant_ticket_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetInstantTicketQuery(Instant_ticket_tableQueries instant_ticket_tableQueries, String bookingId, String userId, jb0 jb0Var) {
            super(jb0Var);
            Intrinsics.i(bookingId, "bookingId");
            Intrinsics.i(userId, "userId");
            this.d = instant_ticket_tableQueries;
            this.b = bookingId;
            this.c = userId;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.d.f697a.P(1202060509, "SELECT instant_ticket_table.bookingId, instant_ticket_table.userId, instant_ticket_table.productName, instant_ticket_table.bookingTime, instant_ticket_table.amount, instant_ticket_table.status, instant_ticket_table.punchTime, instant_ticket_table.city, instant_ticket_table.qrCode, instant_ticket_table.tone, instant_ticket_table.activationExpiryTime, instant_ticket_table.routeId, instant_ticket_table.routeName, instant_ticket_table.startStopId, instant_ticket_table.startStopName, instant_ticket_table.endStopId, instant_ticket_table.endStopName, instant_ticket_table.passengerDetails, instant_ticket_table.refundInfo FROM instant_ticket_table WHERE bookingId = ? AND userId = ?", function1, 2, new a(this, 5));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"instant_ticket_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"instant_ticket_table"}, listener);
        }

        public final String toString() {
            return "instant_ticket_table.sq:getInstantTicket";
        }
    }

    public Instant_ticket_tableQueries(SqlDriver sqlDriver, Instant_ticket_table.Adapter adapter) {
        super(sqlDriver);
        this.b = adapter;
    }

    public final void W(ArrayList arrayList) {
        String strY0 = StringsKt.y0("\n        |DELETE FROM instant_ticket_table\n        |WHERE bookingId IN " + BaseTransacterImpl.S(arrayList.size()) + "\n        ");
        arrayList.size();
        this.f697a.A0(null, strY0, new qd(5, arrayList));
        T(1592753805, new ib0(1));
    }

    public final Query X(List city, String str, Function19 function19) {
        Intrinsics.i(city, "city");
        return new GetActiveOrPaymentProcessingInstantTicketsAsFlowQuery(this, city, str, new jb0(function19, this, 3));
    }

    public final Query Y(Collection city, String userId, Function19 function19) {
        Intrinsics.i(city, "city");
        Intrinsics.i(userId, "userId");
        return new GetAllInstantTicketsQuery(this, city, userId, new jb0(function19, this, 1));
    }

    public final Query Z(List city, String str, Function19 function19) {
        Intrinsics.i(city, "city");
        return new GetAllInstantTicketsAsFlowQuery(this, city, str, new jb0(function19, this, 2));
    }

    public final Query a0(String bookingId, String userId, Function19 function19) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(userId, "userId");
        return new GetInstantTicketQuery(this, bookingId, userId, new jb0(function19, this, 0));
    }

    public final Query b0(String bookingId, String str, Function19 function19) {
        Intrinsics.i(bookingId, "bookingId");
        return new GetInstantTicketAsFlowQuery(this, bookingId, str, new jb0(function19, this, 4));
    }

    public final QueryResult c0(Instant_ticket_table instant_ticket_table) {
        QueryResult queryResultA0 = this.f697a.A0(500143118, "INSERT OR REPLACE INTO instant_ticket_table (bookingId, userId, productName, bookingTime, amount, status, punchTime, city, qrCode, tone, activationExpiryTime, routeId, routeName, startStopId, startStopName, endStopId, endStopName, passengerDetails, refundInfo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new lb0(instant_ticket_table, this, 1));
        T(500143118, new ib0(6));
        return queryResultA0;
    }

    public final void d0(Instant_ticket_table instant_ticket_table) {
        this.f697a.A0(-1675432411, "INSERT OR REPLACE INTO instant_ticket_table (bookingId, userId, productName, bookingTime, amount, status, punchTime, city, qrCode, tone, activationExpiryTime, routeId, routeName, startStopId, startStopName, endStopId, endStopName, passengerDetails, refundInfo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new lb0(instant_ticket_table, this, 0));
        T(-1675432411, new ib0(5));
    }
}
