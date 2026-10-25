package app.chalo.core;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import defpackage.hi1;
import defpackage.i40;
import defpackage.ui1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.FunctionN;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/core/TicketQueries;", "Lapp/cash/sqldelight/TransacterImpl;", "GetCurrentTicketQuery", "GetAllTicketsQuery", "GetCitySpecificTicketCountQuery", "GetTicketFromBookingIdQuery", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TicketQueries extends TransacterImpl {
    public final Ticket.Adapter b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/TicketQueries$GetAllTicketsQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllTicketsQuery<T> extends Query<T> {
        public final String b;

        public GetAllTicketsQuery(String str, ui1 ui1Var) {
            super(ui1Var);
            this.b = str;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return TicketQueries.this.f697a.P(-891768605, "SELECT Ticket.ticketId, Ticket.mticket__mTicketId, Ticket.mticket__userId, Ticket.mticket__deviceId, Ticket.mticket__cityName, Ticket.mticket__agency, Ticket.mticket__upTripRouteStopsInfo, Ticket.mticket__upTripRouteStopsStageInfo, Ticket.mticket__passengerDetails, Ticket.mticket__bookingTime, Ticket.mticket__expirationTime, Ticket.mticket__isExpired, Ticket.mticket__upTripActivationTime, Ticket.mticket__isUpTripActivated, Ticket.mticket__upTripPunchingTime, Ticket.mticket__userProfile, Ticket.mticket__qrCode, Ticket.mticket__tone, Ticket.mticket__mTicketConfiguration, Ticket.mticket__isFreeRide, Ticket.mticket__isPaymentRequired, Ticket.mticket__recentPaymentMethod, Ticket.mticket__cardDetails, Ticket.mticket__customerId, Ticket.mticket__orderId, Ticket.mticket__status, Ticket.mticket__paymentMode, Ticket.mticket__mticketTripReceipt FROM Ticket WHERE mticket__cityName = ? ORDER BY mticket__bookingTime DESC", function1, 1, new e(this, 16));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            TicketQueries.this.f697a.h1(new String[]{"Ticket"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            TicketQueries.this.f697a.P0(new String[]{"Ticket"}, listener);
        }

        public final String toString() {
            return "Ticket.sq:getAllTickets";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/TicketQueries$GetCitySpecificTicketCountQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetCitySpecificTicketCountQuery<T> extends Query<T> {
        public final String b;
        public final /* synthetic */ TicketQueries c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetCitySpecificTicketCountQuery(TicketQueries ticketQueries, String mticket__cityName, hi1 hi1Var) {
            super(hi1Var);
            Intrinsics.i(mticket__cityName, "mticket__cityName");
            this.c = ticketQueries;
            this.b = mticket__cityName;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.c.f697a.P(-834904663, "SELECT COUNT (DISTINCT mticket__mTicketId) FROM Ticket WHERE mticket__cityName = ?", function1, 1, new e(this, 17));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.c.f697a.h1(new String[]{"Ticket"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.c.f697a.P0(new String[]{"Ticket"}, listener);
        }

        public final String toString() {
            return "Ticket.sq:getCitySpecificTicketCount";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/TicketQueries$GetCurrentTicketQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetCurrentTicketQuery<T> extends Query<T> {
        public final String b;
        public final String c;
        public final /* synthetic */ TicketQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetCurrentTicketQuery(TicketQueries ticketQueries, String mticket__mTicketId, String mticket__cityName, ui1 ui1Var) {
            super(ui1Var);
            Intrinsics.i(mticket__mTicketId, "mticket__mTicketId");
            Intrinsics.i(mticket__cityName, "mticket__cityName");
            this.d = ticketQueries;
            this.b = mticket__mTicketId;
            this.c = mticket__cityName;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.d.f697a.P(-1696790040, "SELECT Ticket.ticketId, Ticket.mticket__mTicketId, Ticket.mticket__userId, Ticket.mticket__deviceId, Ticket.mticket__cityName, Ticket.mticket__agency, Ticket.mticket__upTripRouteStopsInfo, Ticket.mticket__upTripRouteStopsStageInfo, Ticket.mticket__passengerDetails, Ticket.mticket__bookingTime, Ticket.mticket__expirationTime, Ticket.mticket__isExpired, Ticket.mticket__upTripActivationTime, Ticket.mticket__isUpTripActivated, Ticket.mticket__upTripPunchingTime, Ticket.mticket__userProfile, Ticket.mticket__qrCode, Ticket.mticket__tone, Ticket.mticket__mTicketConfiguration, Ticket.mticket__isFreeRide, Ticket.mticket__isPaymentRequired, Ticket.mticket__recentPaymentMethod, Ticket.mticket__cardDetails, Ticket.mticket__customerId, Ticket.mticket__orderId, Ticket.mticket__status, Ticket.mticket__paymentMode, Ticket.mticket__mticketTripReceipt FROM Ticket WHERE mticket__mTicketId = ? AND mticket__cityName = ?", function1, 2, new e(this, 18));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"Ticket"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"Ticket"}, listener);
        }

        public final String toString() {
            return "Ticket.sq:getCurrentTicket";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/TicketQueries$GetTicketFromBookingIdQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetTicketFromBookingIdQuery<T> extends Query<T> {
        public final String b;
        public final /* synthetic */ TicketQueries c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetTicketFromBookingIdQuery(TicketQueries ticketQueries, String mticket__mTicketId, ui1 ui1Var) {
            super(ui1Var);
            Intrinsics.i(mticket__mTicketId, "mticket__mTicketId");
            this.c = ticketQueries;
            this.b = mticket__mTicketId;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.c.f697a.P(956097761, "SELECT Ticket.ticketId, Ticket.mticket__mTicketId, Ticket.mticket__userId, Ticket.mticket__deviceId, Ticket.mticket__cityName, Ticket.mticket__agency, Ticket.mticket__upTripRouteStopsInfo, Ticket.mticket__upTripRouteStopsStageInfo, Ticket.mticket__passengerDetails, Ticket.mticket__bookingTime, Ticket.mticket__expirationTime, Ticket.mticket__isExpired, Ticket.mticket__upTripActivationTime, Ticket.mticket__isUpTripActivated, Ticket.mticket__upTripPunchingTime, Ticket.mticket__userProfile, Ticket.mticket__qrCode, Ticket.mticket__tone, Ticket.mticket__mTicketConfiguration, Ticket.mticket__isFreeRide, Ticket.mticket__isPaymentRequired, Ticket.mticket__recentPaymentMethod, Ticket.mticket__cardDetails, Ticket.mticket__customerId, Ticket.mticket__orderId, Ticket.mticket__status, Ticket.mticket__paymentMode, Ticket.mticket__mticketTripReceipt FROM Ticket WHERE mticket__mTicketId = ?", function1, 1, new e(this, 19));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.c.f697a.h1(new String[]{"Ticket"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.c.f697a.P0(new String[]{"Ticket"}, listener);
        }

        public final String toString() {
            return "Ticket.sq:getTicketFromBookingId";
        }
    }

    public TicketQueries(SqlDriver sqlDriver, Ticket.Adapter adapter) {
        super(sqlDriver);
        this.b = adapter;
    }

    public final Query W(String str, FunctionN functionN) {
        return new GetAllTicketsQuery(str, new ui1(functionN, this, 0));
    }

    public final Query X(String mticket__cityName) {
        Intrinsics.i(mticket__cityName, "mticket__cityName");
        return new GetCitySpecificTicketCountQuery(this, mticket__cityName, new hi1(9));
    }

    public final Query Y(String mticket__mTicketId, String mticket__cityName, FunctionN functionN) {
        Intrinsics.i(mticket__mTicketId, "mticket__mTicketId");
        Intrinsics.i(mticket__cityName, "mticket__cityName");
        return new GetCurrentTicketQuery(this, mticket__mTicketId, mticket__cityName, new ui1(functionN, this, 1));
    }

    public final Query Z(String mticket__mTicketId, FunctionN functionN) {
        Intrinsics.i(mticket__mTicketId, "mticket__mTicketId");
        return new GetTicketFromBookingIdQuery(this, mticket__mTicketId, new ui1(functionN, this, 2));
    }
}
