package app.chalo.core;

import app.cash.sqldelight.BaseTransacterImpl;
import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import defpackage.ao0;
import defpackage.i40;
import defpackage.ln0;
import defpackage.qd;
import defpackage.zn0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/core/Ondc_metro_ticket_tableQueries;", "Lapp/cash/sqldelight/TransacterImpl;", "GetMetroTicketQuery", "GetMetroTicketAsFlowQuery", "GetAllMetroTicketsQuery", "GetAllMetroTicketsAsFlowQuery", "GetActiveOrPaymentProcessingMetroTicketsAsFlowQuery", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Ondc_metro_ticket_tableQueries extends TransacterImpl {
    public final Ondc_metro_ticket_table.Adapter b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Ondc_metro_ticket_tableQueries$GetActiveOrPaymentProcessingMetroTicketsAsFlowQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetActiveOrPaymentProcessingMetroTicketsAsFlowQuery<T> extends Query<T> {
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
            return "ondc_metro_ticket_table.sq:getActiveOrPaymentProcessingMetroTicketsAsFlow";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Ondc_metro_ticket_tableQueries$GetAllMetroTicketsAsFlowQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllMetroTicketsAsFlowQuery<T> extends Query<T> {
        public final String b;
        public final String c;

        public GetAllMetroTicketsAsFlowQuery(String str, String str2, ao0 ao0Var) {
            super(ao0Var);
            this.b = str;
            this.c = str2;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return Ondc_metro_ticket_tableQueries.this.f697a.P(-1813035094, "SELECT ondc_metro_ticket_table.bookingId, ondc_metro_ticket_table.userId, ondc_metro_ticket_table.bookingTime, ondc_metro_ticket_table.amount, ondc_metro_ticket_table.status, ondc_metro_ticket_table.punchTime, ondc_metro_ticket_table.city, ondc_metro_ticket_table.qrCode, ondc_metro_ticket_table.validationInfoEntityList, ondc_metro_ticket_table.tone, ondc_metro_ticket_table.activationExpiryTime, ondc_metro_ticket_table.passengerDetails, ondc_metro_ticket_table.routeName, ondc_metro_ticket_table.startStopName, ondc_metro_ticket_table.endStopName, ondc_metro_ticket_table.refundInfo, ondc_metro_ticket_table.journeyOverview, ondc_metro_ticket_table.paymentInfo, ondc_metro_ticket_table.paymentMode, ondc_metro_ticket_table.sellerBookingId FROM ondc_metro_ticket_table WHERE city = ? AND userId = ?", function1, 2, new a(this, 27));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            Ondc_metro_ticket_tableQueries.this.f697a.h1(new String[]{"ondc_metro_ticket_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            Ondc_metro_ticket_tableQueries.this.f697a.P0(new String[]{"ondc_metro_ticket_table"}, listener);
        }

        public final String toString() {
            return "ondc_metro_ticket_table.sq:getAllMetroTicketsAsFlow";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Ondc_metro_ticket_tableQueries$GetAllMetroTicketsQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllMetroTicketsQuery<T> extends Query<T> {
        public final String b;
        public final String c;
        public final /* synthetic */ Ondc_metro_ticket_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetAllMetroTicketsQuery(Ondc_metro_ticket_tableQueries ondc_metro_ticket_tableQueries, String city, String userId, ao0 ao0Var) {
            super(ao0Var);
            Intrinsics.i(city, "city");
            Intrinsics.i(userId, "userId");
            this.d = ondc_metro_ticket_tableQueries;
            this.b = city;
            this.c = userId;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.d.f697a.P(-1424502134, "SELECT ondc_metro_ticket_table.bookingId, ondc_metro_ticket_table.userId, ondc_metro_ticket_table.bookingTime, ondc_metro_ticket_table.amount, ondc_metro_ticket_table.status, ondc_metro_ticket_table.punchTime, ondc_metro_ticket_table.city, ondc_metro_ticket_table.qrCode, ondc_metro_ticket_table.validationInfoEntityList, ondc_metro_ticket_table.tone, ondc_metro_ticket_table.activationExpiryTime, ondc_metro_ticket_table.passengerDetails, ondc_metro_ticket_table.routeName, ondc_metro_ticket_table.startStopName, ondc_metro_ticket_table.endStopName, ondc_metro_ticket_table.refundInfo, ondc_metro_ticket_table.journeyOverview, ondc_metro_ticket_table.paymentInfo, ondc_metro_ticket_table.paymentMode, ondc_metro_ticket_table.sellerBookingId FROM ondc_metro_ticket_table WHERE city = ? AND userId = ?", function1, 2, new a(this, 28));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"ondc_metro_ticket_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"ondc_metro_ticket_table"}, listener);
        }

        public final String toString() {
            return "ondc_metro_ticket_table.sq:getAllMetroTickets";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Ondc_metro_ticket_tableQueries$GetMetroTicketAsFlowQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetMetroTicketAsFlowQuery<T> extends Query<T> {
        public final String b;
        public final String c;
        public final /* synthetic */ Ondc_metro_ticket_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetMetroTicketAsFlowQuery(Ondc_metro_ticket_tableQueries ondc_metro_ticket_tableQueries, String bookingId, String str, ao0 ao0Var) {
            super(ao0Var);
            Intrinsics.i(bookingId, "bookingId");
            this.d = ondc_metro_ticket_tableQueries;
            this.b = bookingId;
            this.c = str;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.d.f697a.P(-273800608, "SELECT ondc_metro_ticket_table.bookingId, ondc_metro_ticket_table.userId, ondc_metro_ticket_table.bookingTime, ondc_metro_ticket_table.amount, ondc_metro_ticket_table.status, ondc_metro_ticket_table.punchTime, ondc_metro_ticket_table.city, ondc_metro_ticket_table.qrCode, ondc_metro_ticket_table.validationInfoEntityList, ondc_metro_ticket_table.tone, ondc_metro_ticket_table.activationExpiryTime, ondc_metro_ticket_table.passengerDetails, ondc_metro_ticket_table.routeName, ondc_metro_ticket_table.startStopName, ondc_metro_ticket_table.endStopName, ondc_metro_ticket_table.refundInfo, ondc_metro_ticket_table.journeyOverview, ondc_metro_ticket_table.paymentInfo, ondc_metro_ticket_table.paymentMode, ondc_metro_ticket_table.sellerBookingId FROM ondc_metro_ticket_table WHERE bookingId = ? AND userId = ?", function1, 2, new a(this, 29));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"ondc_metro_ticket_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"ondc_metro_ticket_table"}, listener);
        }

        public final String toString() {
            return "ondc_metro_ticket_table.sq:getMetroTicketAsFlow";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Ondc_metro_ticket_tableQueries$GetMetroTicketQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetMetroTicketQuery<T> extends Query<T> {
        public final String b;
        public final String c;
        public final /* synthetic */ Ondc_metro_ticket_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetMetroTicketQuery(Ondc_metro_ticket_tableQueries ondc_metro_ticket_tableQueries, String bookingId, String userId, ao0 ao0Var) {
            super(ao0Var);
            Intrinsics.i(bookingId, "bookingId");
            Intrinsics.i(userId, "userId");
            this.d = ondc_metro_ticket_tableQueries;
            this.b = bookingId;
            this.c = userId;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.d.f697a.P(182873536, "SELECT ondc_metro_ticket_table.bookingId, ondc_metro_ticket_table.userId, ondc_metro_ticket_table.bookingTime, ondc_metro_ticket_table.amount, ondc_metro_ticket_table.status, ondc_metro_ticket_table.punchTime, ondc_metro_ticket_table.city, ondc_metro_ticket_table.qrCode, ondc_metro_ticket_table.validationInfoEntityList, ondc_metro_ticket_table.tone, ondc_metro_ticket_table.activationExpiryTime, ondc_metro_ticket_table.passengerDetails, ondc_metro_ticket_table.routeName, ondc_metro_ticket_table.startStopName, ondc_metro_ticket_table.endStopName, ondc_metro_ticket_table.refundInfo, ondc_metro_ticket_table.journeyOverview, ondc_metro_ticket_table.paymentInfo, ondc_metro_ticket_table.paymentMode, ondc_metro_ticket_table.sellerBookingId FROM ondc_metro_ticket_table WHERE bookingId = ? AND userId = ?", function1, 2, new b(this, 0));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"ondc_metro_ticket_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"ondc_metro_ticket_table"}, listener);
        }

        public final String toString() {
            return "ondc_metro_ticket_table.sq:getMetroTicket";
        }
    }

    public Ondc_metro_ticket_tableQueries(SqlDriver sqlDriver, Ondc_metro_ticket_table.Adapter adapter) {
        super(sqlDriver);
        this.b = adapter;
    }

    public final void W(ArrayList arrayList) {
        String strY0 = StringsKt.y0("\n        |DELETE FROM ondc_metro_ticket_table\n        |WHERE bookingId IN " + BaseTransacterImpl.S(arrayList.size()) + "\n        ");
        arrayList.size();
        this.f697a.A0(null, strY0, new qd(10, arrayList));
        T(1202157120, new ln0(22));
    }

    public final Query X(String city, String userId, Function20 function20) {
        Intrinsics.i(city, "city");
        Intrinsics.i(userId, "userId");
        return new GetAllMetroTicketsQuery(this, city, userId, new ao0(function20, this, 1));
    }

    public final Query Y(String str, String str2, Function20 function20) {
        return new GetAllMetroTicketsAsFlowQuery(str, str2, new ao0(function20, this, 2));
    }

    public final Query Z(String bookingId, String userId, Function20 function20) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(userId, "userId");
        return new GetMetroTicketQuery(this, bookingId, userId, new ao0(function20, this, 3));
    }

    public final Query a0(String bookingId, String str, Function20 function20) {
        Intrinsics.i(bookingId, "bookingId");
        return new GetMetroTicketAsFlowQuery(this, bookingId, str, new ao0(function20, this, 0));
    }

    public final QueryResult b0(Ondc_metro_ticket_table ondc_metro_ticket_table) {
        QueryResult queryResultA0 = this.f697a.A0(1737677307, "INSERT OR REPLACE INTO ondc_metro_ticket_table (bookingId, userId, bookingTime, amount, status, punchTime, city, qrCode, validationInfoEntityList, tone, activationExpiryTime, passengerDetails, routeName, startStopName, endStopName, refundInfo, journeyOverview, paymentInfo, paymentMode, sellerBookingId) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new zn0(ondc_metro_ticket_table, this, 1));
        T(1737677307, new ln0(26));
        return queryResultA0;
    }

    public final void c0(Ondc_metro_ticket_table ondc_metro_ticket_table) {
        this.f697a.A0(-1966578216, "INSERT OR REPLACE INTO ondc_metro_ticket_table (bookingId, userId, bookingTime, amount, status, punchTime, city, qrCode, validationInfoEntityList, tone, activationExpiryTime, passengerDetails, routeName, startStopName, endStopName, refundInfo, journeyOverview, paymentInfo, paymentMode, sellerBookingId) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new zn0(ondc_metro_ticket_table, this, 0));
        T(-1966578216, new ln0(23));
    }
}
