package app.chalo.core;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import defpackage.eu0;
import defpackage.i40;
import defpackage.lu0;
import defpackage.ww0;
import defpackage.xw0;
import defpackage.yw0;
import defpackage.zv0;
import defpackage.zw0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.FunctionN;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/core/Premium_reserve_ticket_tableQueries;", "Lapp/cash/sqldelight/TransacterImpl;", "GetAllPremiumReserveTicketsForCityQuery", "GetAllPremiumReserveTicketsForCityBetweenGivenTimeQuery", "GetPremiumReserveTicketByIdQuery", "GetAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgementQuery", "GetUniqueOriginDestinationPairsQuery", "GetPremiumReserveTicketsBookedThroughPassQuery", "GetAllPremiumReserveTicketsWithPendingTripFeedbackQuery", "GetAllPremiumReserveTicketsWithSameFirstBookingIdQuery", "GetAllPremiumReserveTicketsBookedThroughPassQuery", "GetAckInfoForBookingQuery", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Premium_reserve_ticket_tableQueries extends TransacterImpl {
    public final Premium_reserve_ticket_table.Adapter b;
    public final Premium_reserve_ticket_ack_table.Adapter c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Premium_reserve_ticket_tableQueries$GetAckInfoForBookingQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAckInfoForBookingQuery<T> extends Query<T> {
        public final String b;
        public final String c;
        public final /* synthetic */ Premium_reserve_ticket_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetAckInfoForBookingQuery(Premium_reserve_ticket_tableQueries premium_reserve_ticket_tableQueries, String userId, String str, xw0 xw0Var) {
            super(xw0Var);
            Intrinsics.i(userId, "userId");
            this.d = premium_reserve_ticket_tableQueries;
            this.b = userId;
            this.c = str;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.d.f697a.P(-994927612, "SELECT premium_reserve_ticket_ack_table.bookingId, premium_reserve_ticket_ack_table.productType, premium_reserve_ticket_ack_table.productSubType, premium_reserve_ticket_ack_table.userId, premium_reserve_ticket_ack_table.ackNeededFor, premium_reserve_ticket_ack_table.hasAcknowledged, premium_reserve_ticket_ack_table.firstBookingId FROM premium_reserve_ticket_ack_table \nWHERE userId = ? \nAND bookingId = ?", function1, 2, new b(this, 11));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"premium_reserve_ticket_ack_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"premium_reserve_ticket_ack_table"}, listener);
        }

        public final String toString() {
            return "premium_reserve_ticket_table.sq:getAckInfoForBooking";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Premium_reserve_ticket_tableQueries$GetAllPremiumReserveTicketsBookedThroughPassQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllPremiumReserveTicketsBookedThroughPassQuery<T> extends Query<T> {
        public final String b;
        public final String c;
        public final String d;
        public final /* synthetic */ Premium_reserve_ticket_tableQueries e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetAllPremiumReserveTicketsBookedThroughPassQuery(Premium_reserve_ticket_tableQueries premium_reserve_ticket_tableQueries, String city, String userId, String str, ww0 ww0Var) {
            super(ww0Var);
            Intrinsics.i(city, "city");
            Intrinsics.i(userId, "userId");
            this.e = premium_reserve_ticket_tableQueries;
            this.b = city;
            this.c = userId;
            this.d = str;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.e.f697a.P(null, StringsKt.y0("\n    |SELECT premium_reserve_ticket_table.bookingId, premium_reserve_ticket_table.bookingTime, premium_reserve_ticket_table.amount, premium_reserve_ticket_table.ticketStatus, premium_reserve_ticket_table.paymentMode, premium_reserve_ticket_table.passIdUsedToPurchaseTicket, premium_reserve_ticket_table.firstBookingId, premium_reserve_ticket_table.city, premium_reserve_ticket_table.tone, premium_reserve_ticket_table.qrCode, premium_reserve_ticket_table.configurationId, premium_reserve_ticket_table.tripId, premium_reserve_ticket_table.tripStaticSlotTime, premium_reserve_ticket_table.expectedTripStartTime, premium_reserve_ticket_table.expectedTripEndTime, premium_reserve_ticket_table.routeId, premium_reserve_ticket_table.routeName, premium_reserve_ticket_table.userId, premium_reserve_ticket_table.productType, premium_reserve_ticket_table.productSubType, premium_reserve_ticket_table.fromStopDetails, premium_reserve_ticket_table.toStopDetails, premium_reserve_ticket_table.isTripFeedbackCollected, premium_reserve_ticket_table.passengerCategoryDetails, premium_reserve_ticket_table.fareNote, premium_reserve_ticket_table.punchTime, premium_reserve_ticket_table.expiryTime, premium_reserve_ticket_table.validationStartTime, premium_reserve_ticket_table.firstBooking, premium_reserve_ticket_table.prevBookingStatus, premium_reserve_ticket_table.refundInfo, premium_reserve_ticket_table.seats FROM premium_reserve_ticket_table\n    |WHERE city = ?\n    |AND userId = ?\n    |AND passIdUsedToPurchaseTicket " + (this.d == null ? "IS" : "=") + " ?\n    "), function1, 3, new b(this, 12));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.e.f697a.h1(new String[]{"premium_reserve_ticket_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.e.f697a.P0(new String[]{"premium_reserve_ticket_table"}, listener);
        }

        public final String toString() {
            return "premium_reserve_ticket_table.sq:getAllPremiumReserveTicketsBookedThroughPass";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Premium_reserve_ticket_tableQueries$GetAllPremiumReserveTicketsForCityBetweenGivenTimeQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllPremiumReserveTicketsForCityBetweenGivenTimeQuery<T> extends Query<T> {
        public final String b;
        public final String c;
        public final long d;
        public final long e;

        public GetAllPremiumReserveTicketsForCityBetweenGivenTimeQuery(String str, String str2, long j, long j2, ww0 ww0Var) {
            super(ww0Var);
            this.b = str;
            this.c = str2;
            this.d = j;
            this.e = j2;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return Premium_reserve_ticket_tableQueries.this.f697a.P(221504402, "SELECT premium_reserve_ticket_table.bookingId, premium_reserve_ticket_table.bookingTime, premium_reserve_ticket_table.amount, premium_reserve_ticket_table.ticketStatus, premium_reserve_ticket_table.paymentMode, premium_reserve_ticket_table.passIdUsedToPurchaseTicket, premium_reserve_ticket_table.firstBookingId, premium_reserve_ticket_table.city, premium_reserve_ticket_table.tone, premium_reserve_ticket_table.qrCode, premium_reserve_ticket_table.configurationId, premium_reserve_ticket_table.tripId, premium_reserve_ticket_table.tripStaticSlotTime, premium_reserve_ticket_table.expectedTripStartTime, premium_reserve_ticket_table.expectedTripEndTime, premium_reserve_ticket_table.routeId, premium_reserve_ticket_table.routeName, premium_reserve_ticket_table.userId, premium_reserve_ticket_table.productType, premium_reserve_ticket_table.productSubType, premium_reserve_ticket_table.fromStopDetails, premium_reserve_ticket_table.toStopDetails, premium_reserve_ticket_table.isTripFeedbackCollected, premium_reserve_ticket_table.passengerCategoryDetails, premium_reserve_ticket_table.fareNote, premium_reserve_ticket_table.punchTime, premium_reserve_ticket_table.expiryTime, premium_reserve_ticket_table.validationStartTime, premium_reserve_ticket_table.firstBooking, premium_reserve_ticket_table.prevBookingStatus, premium_reserve_ticket_table.refundInfo, premium_reserve_ticket_table.seats FROM premium_reserve_ticket_table\nWHERE city = ?\nAND userId = ?\nAND tripStaticSlotTime BETWEEN ? AND ?", function1, 4, new b(this, 13));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            Premium_reserve_ticket_tableQueries.this.f697a.h1(new String[]{"premium_reserve_ticket_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            Premium_reserve_ticket_tableQueries.this.f697a.P0(new String[]{"premium_reserve_ticket_table"}, listener);
        }

        public final String toString() {
            return "premium_reserve_ticket_table.sq:getAllPremiumReserveTicketsForCityBetweenGivenTime";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Premium_reserve_ticket_tableQueries$GetAllPremiumReserveTicketsForCityQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllPremiumReserveTicketsForCityQuery<T> extends Query<T> {
        public final String b;

        public GetAllPremiumReserveTicketsForCityQuery(String str, ww0 ww0Var) {
            super(ww0Var);
            this.b = str;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return Premium_reserve_ticket_tableQueries.this.f697a.P(340232880, "SELECT premium_reserve_ticket_table.bookingId, premium_reserve_ticket_table.bookingTime, premium_reserve_ticket_table.amount, premium_reserve_ticket_table.ticketStatus, premium_reserve_ticket_table.paymentMode, premium_reserve_ticket_table.passIdUsedToPurchaseTicket, premium_reserve_ticket_table.firstBookingId, premium_reserve_ticket_table.city, premium_reserve_ticket_table.tone, premium_reserve_ticket_table.qrCode, premium_reserve_ticket_table.configurationId, premium_reserve_ticket_table.tripId, premium_reserve_ticket_table.tripStaticSlotTime, premium_reserve_ticket_table.expectedTripStartTime, premium_reserve_ticket_table.expectedTripEndTime, premium_reserve_ticket_table.routeId, premium_reserve_ticket_table.routeName, premium_reserve_ticket_table.userId, premium_reserve_ticket_table.productType, premium_reserve_ticket_table.productSubType, premium_reserve_ticket_table.fromStopDetails, premium_reserve_ticket_table.toStopDetails, premium_reserve_ticket_table.isTripFeedbackCollected, premium_reserve_ticket_table.passengerCategoryDetails, premium_reserve_ticket_table.fareNote, premium_reserve_ticket_table.punchTime, premium_reserve_ticket_table.expiryTime, premium_reserve_ticket_table.validationStartTime, premium_reserve_ticket_table.firstBooking, premium_reserve_ticket_table.prevBookingStatus, premium_reserve_ticket_table.refundInfo, premium_reserve_ticket_table.seats FROM premium_reserve_ticket_table WHERE city = ?", function1, 1, new b(this, 14));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            Premium_reserve_ticket_tableQueries.this.f697a.h1(new String[]{"premium_reserve_ticket_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            Premium_reserve_ticket_tableQueries.this.f697a.P0(new String[]{"premium_reserve_ticket_table"}, listener);
        }

        public final String toString() {
            return "premium_reserve_ticket_table.sq:getAllPremiumReserveTicketsForCity";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Premium_reserve_ticket_tableQueries$GetAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgementQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgementQuery<T> extends Query<T> {
        public final long b;
        public final String c;
        public final String d;

        public GetAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgementQuery(long j, String str, String str2, ww0 ww0Var) {
            super(ww0Var);
            this.b = j;
            this.c = str;
            this.d = str2;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return Premium_reserve_ticket_tableQueries.this.f697a.P(913404883, "SELECT premium_reserve_ticket_table.bookingId, premium_reserve_ticket_table.bookingTime, premium_reserve_ticket_table.amount, premium_reserve_ticket_table.ticketStatus, premium_reserve_ticket_table.paymentMode, premium_reserve_ticket_table.passIdUsedToPurchaseTicket, premium_reserve_ticket_table.firstBookingId, premium_reserve_ticket_table.city, premium_reserve_ticket_table.tone, premium_reserve_ticket_table.qrCode, premium_reserve_ticket_table.configurationId, premium_reserve_ticket_table.tripId, premium_reserve_ticket_table.tripStaticSlotTime, premium_reserve_ticket_table.expectedTripStartTime, premium_reserve_ticket_table.expectedTripEndTime, premium_reserve_ticket_table.routeId, premium_reserve_ticket_table.routeName, premium_reserve_ticket_table.userId, premium_reserve_ticket_table.productType, premium_reserve_ticket_table.productSubType, premium_reserve_ticket_table.fromStopDetails, premium_reserve_ticket_table.toStopDetails, premium_reserve_ticket_table.isTripFeedbackCollected, premium_reserve_ticket_table.passengerCategoryDetails, premium_reserve_ticket_table.fareNote, premium_reserve_ticket_table.punchTime, premium_reserve_ticket_table.expiryTime, premium_reserve_ticket_table.validationStartTime, premium_reserve_ticket_table.firstBooking, premium_reserve_ticket_table.prevBookingStatus, premium_reserve_ticket_table.refundInfo, premium_reserve_ticket_table.seats, premium_reserve_ticket_ack_table.bookingId, premium_reserve_ticket_ack_table.productType, premium_reserve_ticket_ack_table.productSubType, premium_reserve_ticket_ack_table.userId, premium_reserve_ticket_ack_table.ackNeededFor, premium_reserve_ticket_ack_table.hasAcknowledged, premium_reserve_ticket_ack_table.firstBookingId FROM premium_reserve_ticket_table\nINNER JOIN premium_reserve_ticket_ack_table\nON premium_reserve_ticket_table.bookingId = premium_reserve_ticket_ack_table.bookingId\nWHERE premium_reserve_ticket_ack_table.hasAcknowledged = 0\nAND premium_reserve_ticket_table.tripStaticSlotTime >= ?\nAND premium_reserve_ticket_table.city = ?\nAND premium_reserve_ticket_table.userId = ?\nAND (premium_reserve_ticket_table.ticketStatus = 'SYSTEM_CANCELLED' OR premium_reserve_ticket_table.prevBookingStatus = 'SYSTEM_RESCHEDULED')\nORDER BY premium_reserve_ticket_table.tripStaticSlotTime ASC, premium_reserve_ticket_table.bookingTime DESC", function1, 3, new b(this, 15));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            Premium_reserve_ticket_tableQueries.this.f697a.h1(new String[]{"premium_reserve_ticket_table", "premium_reserve_ticket_ack_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            Premium_reserve_ticket_tableQueries.this.f697a.P0(new String[]{"premium_reserve_ticket_table", "premium_reserve_ticket_ack_table"}, listener);
        }

        public final String toString() {
            return "premium_reserve_ticket_table.sq:getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Premium_reserve_ticket_tableQueries$GetAllPremiumReserveTicketsWithPendingTripFeedbackQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllPremiumReserveTicketsWithPendingTripFeedbackQuery<T> extends Query<T> {
        public final String b;
        public final String c;
        public final long d;
        public final long e;
        public final /* synthetic */ Premium_reserve_ticket_tableQueries f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetAllPremiumReserveTicketsWithPendingTripFeedbackQuery(Premium_reserve_ticket_tableQueries premium_reserve_ticket_tableQueries, String city, String userId, long j, long j2, ww0 ww0Var) {
            super(ww0Var);
            Intrinsics.i(city, "city");
            Intrinsics.i(userId, "userId");
            this.f = premium_reserve_ticket_tableQueries;
            this.b = city;
            this.c = userId;
            this.d = j;
            this.e = j2;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.f.f697a.P(-845272009, "SELECT premium_reserve_ticket_table.bookingId, premium_reserve_ticket_table.bookingTime, premium_reserve_ticket_table.amount, premium_reserve_ticket_table.ticketStatus, premium_reserve_ticket_table.paymentMode, premium_reserve_ticket_table.passIdUsedToPurchaseTicket, premium_reserve_ticket_table.firstBookingId, premium_reserve_ticket_table.city, premium_reserve_ticket_table.tone, premium_reserve_ticket_table.qrCode, premium_reserve_ticket_table.configurationId, premium_reserve_ticket_table.tripId, premium_reserve_ticket_table.tripStaticSlotTime, premium_reserve_ticket_table.expectedTripStartTime, premium_reserve_ticket_table.expectedTripEndTime, premium_reserve_ticket_table.routeId, premium_reserve_ticket_table.routeName, premium_reserve_ticket_table.userId, premium_reserve_ticket_table.productType, premium_reserve_ticket_table.productSubType, premium_reserve_ticket_table.fromStopDetails, premium_reserve_ticket_table.toStopDetails, premium_reserve_ticket_table.isTripFeedbackCollected, premium_reserve_ticket_table.passengerCategoryDetails, premium_reserve_ticket_table.fareNote, premium_reserve_ticket_table.punchTime, premium_reserve_ticket_table.expiryTime, premium_reserve_ticket_table.validationStartTime, premium_reserve_ticket_table.firstBooking, premium_reserve_ticket_table.prevBookingStatus, premium_reserve_ticket_table.refundInfo, premium_reserve_ticket_table.seats FROM premium_reserve_ticket_table\nWHERE city = ?\nAND userId = ?\nAND (ticketStatus = 'EXPIRED' OR ticketStatus = 'USED' OR ticketStatus = 'PUNCHED')\nAND tripStaticSlotTime >= ?\nAND ? >= expiryTime\nAND isTripFeedbackCollected = 0", function1, 4, new b(this, 16));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.f.f697a.h1(new String[]{"premium_reserve_ticket_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.f.f697a.P0(new String[]{"premium_reserve_ticket_table"}, listener);
        }

        public final String toString() {
            return "premium_reserve_ticket_table.sq:getAllPremiumReserveTicketsWithPendingTripFeedback";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Premium_reserve_ticket_tableQueries$GetAllPremiumReserveTicketsWithSameFirstBookingIdQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllPremiumReserveTicketsWithSameFirstBookingIdQuery<T> extends Query<T> {
        public final String b;

        public GetAllPremiumReserveTicketsWithSameFirstBookingIdQuery(String str, ww0 ww0Var) {
            super(ww0Var);
            this.b = str;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return Premium_reserve_ticket_tableQueries.this.f697a.P(null, StringsKt.y0("\n    |SELECT premium_reserve_ticket_table.bookingId, premium_reserve_ticket_table.bookingTime, premium_reserve_ticket_table.amount, premium_reserve_ticket_table.ticketStatus, premium_reserve_ticket_table.paymentMode, premium_reserve_ticket_table.passIdUsedToPurchaseTicket, premium_reserve_ticket_table.firstBookingId, premium_reserve_ticket_table.city, premium_reserve_ticket_table.tone, premium_reserve_ticket_table.qrCode, premium_reserve_ticket_table.configurationId, premium_reserve_ticket_table.tripId, premium_reserve_ticket_table.tripStaticSlotTime, premium_reserve_ticket_table.expectedTripStartTime, premium_reserve_ticket_table.expectedTripEndTime, premium_reserve_ticket_table.routeId, premium_reserve_ticket_table.routeName, premium_reserve_ticket_table.userId, premium_reserve_ticket_table.productType, premium_reserve_ticket_table.productSubType, premium_reserve_ticket_table.fromStopDetails, premium_reserve_ticket_table.toStopDetails, premium_reserve_ticket_table.isTripFeedbackCollected, premium_reserve_ticket_table.passengerCategoryDetails, premium_reserve_ticket_table.fareNote, premium_reserve_ticket_table.punchTime, premium_reserve_ticket_table.expiryTime, premium_reserve_ticket_table.validationStartTime, premium_reserve_ticket_table.firstBooking, premium_reserve_ticket_table.prevBookingStatus, premium_reserve_ticket_table.refundInfo, premium_reserve_ticket_table.seats FROM premium_reserve_ticket_table\n    |WHERE firstBookingId " + (this.b == null ? "IS" : "=") + " ?\n    |ORDER BY bookingTime DESC\n    "), function1, 1, new b(this, 17));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            Premium_reserve_ticket_tableQueries.this.f697a.h1(new String[]{"premium_reserve_ticket_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            Premium_reserve_ticket_tableQueries.this.f697a.P0(new String[]{"premium_reserve_ticket_table"}, listener);
        }

        public final String toString() {
            return "premium_reserve_ticket_table.sq:getAllPremiumReserveTicketsWithSameFirstBookingId";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Premium_reserve_ticket_tableQueries$GetPremiumReserveTicketByIdQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetPremiumReserveTicketByIdQuery<T> extends Query<T> {
        public final String b;
        public final /* synthetic */ Premium_reserve_ticket_tableQueries c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetPremiumReserveTicketByIdQuery(Premium_reserve_ticket_tableQueries premium_reserve_ticket_tableQueries, String bookingId, xw0 xw0Var) {
            super(xw0Var);
            Intrinsics.i(bookingId, "bookingId");
            this.c = premium_reserve_ticket_tableQueries;
            this.b = bookingId;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.c.f697a.P(1990756902, "SELECT premium_reserve_ticket_table.bookingId, premium_reserve_ticket_table.bookingTime, premium_reserve_ticket_table.amount, premium_reserve_ticket_table.ticketStatus, premium_reserve_ticket_table.paymentMode, premium_reserve_ticket_table.passIdUsedToPurchaseTicket, premium_reserve_ticket_table.firstBookingId, premium_reserve_ticket_table.city, premium_reserve_ticket_table.tone, premium_reserve_ticket_table.qrCode, premium_reserve_ticket_table.configurationId, premium_reserve_ticket_table.tripId, premium_reserve_ticket_table.tripStaticSlotTime, premium_reserve_ticket_table.expectedTripStartTime, premium_reserve_ticket_table.expectedTripEndTime, premium_reserve_ticket_table.routeId, premium_reserve_ticket_table.routeName, premium_reserve_ticket_table.userId, premium_reserve_ticket_table.productType, premium_reserve_ticket_table.productSubType, premium_reserve_ticket_table.fromStopDetails, premium_reserve_ticket_table.toStopDetails, premium_reserve_ticket_table.isTripFeedbackCollected, premium_reserve_ticket_table.passengerCategoryDetails, premium_reserve_ticket_table.fareNote, premium_reserve_ticket_table.punchTime, premium_reserve_ticket_table.expiryTime, premium_reserve_ticket_table.validationStartTime, premium_reserve_ticket_table.firstBooking, premium_reserve_ticket_table.prevBookingStatus, premium_reserve_ticket_table.refundInfo, premium_reserve_ticket_table.seats FROM premium_reserve_ticket_table WHERE bookingId = ?", function1, 1, new b(this, 18));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.c.f697a.h1(new String[]{"premium_reserve_ticket_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.c.f697a.P0(new String[]{"premium_reserve_ticket_table"}, listener);
        }

        public final String toString() {
            return "premium_reserve_ticket_table.sq:getPremiumReserveTicketById";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Premium_reserve_ticket_tableQueries$GetPremiumReserveTicketsBookedThroughPassQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetPremiumReserveTicketsBookedThroughPassQuery<T> extends Query<T> {
        public final String b;
        public final String c;
        public final long d;
        public final String e;
        public final /* synthetic */ Premium_reserve_ticket_tableQueries f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetPremiumReserveTicketsBookedThroughPassQuery(Premium_reserve_ticket_tableQueries premium_reserve_ticket_tableQueries, String city, String userId, long j, String str, ww0 ww0Var) {
            super(ww0Var);
            Intrinsics.i(city, "city");
            Intrinsics.i(userId, "userId");
            this.f = premium_reserve_ticket_tableQueries;
            this.b = city;
            this.c = userId;
            this.d = j;
            this.e = str;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.f.f697a.P(null, StringsKt.y0("\n    |SELECT premium_reserve_ticket_table.bookingId, premium_reserve_ticket_table.bookingTime, premium_reserve_ticket_table.amount, premium_reserve_ticket_table.ticketStatus, premium_reserve_ticket_table.paymentMode, premium_reserve_ticket_table.passIdUsedToPurchaseTicket, premium_reserve_ticket_table.firstBookingId, premium_reserve_ticket_table.city, premium_reserve_ticket_table.tone, premium_reserve_ticket_table.qrCode, premium_reserve_ticket_table.configurationId, premium_reserve_ticket_table.tripId, premium_reserve_ticket_table.tripStaticSlotTime, premium_reserve_ticket_table.expectedTripStartTime, premium_reserve_ticket_table.expectedTripEndTime, premium_reserve_ticket_table.routeId, premium_reserve_ticket_table.routeName, premium_reserve_ticket_table.userId, premium_reserve_ticket_table.productType, premium_reserve_ticket_table.productSubType, premium_reserve_ticket_table.fromStopDetails, premium_reserve_ticket_table.toStopDetails, premium_reserve_ticket_table.isTripFeedbackCollected, premium_reserve_ticket_table.passengerCategoryDetails, premium_reserve_ticket_table.fareNote, premium_reserve_ticket_table.punchTime, premium_reserve_ticket_table.expiryTime, premium_reserve_ticket_table.validationStartTime, premium_reserve_ticket_table.firstBooking, premium_reserve_ticket_table.prevBookingStatus, premium_reserve_ticket_table.refundInfo, premium_reserve_ticket_table.seats FROM premium_reserve_ticket_table\n    |WHERE city = ?\n    |AND userId = ?\n    |AND tripStaticSlotTime >= ?\n    |AND passIdUsedToPurchaseTicket " + (this.e == null ? "IS" : "=") + " ?\n    "), function1, 4, new b(this, 19));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.f.f697a.h1(new String[]{"premium_reserve_ticket_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.f.f697a.P0(new String[]{"premium_reserve_ticket_table"}, listener);
        }

        public final String toString() {
            return "premium_reserve_ticket_table.sq:getPremiumReserveTicketsBookedThroughPass";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Premium_reserve_ticket_tableQueries$GetUniqueOriginDestinationPairsQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetUniqueOriginDestinationPairsQuery<T> extends Query<T> {
        public final String b;
        public final /* synthetic */ Premium_reserve_ticket_tableQueries c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetUniqueOriginDestinationPairsQuery(Premium_reserve_ticket_tableQueries premium_reserve_ticket_tableQueries, String city, ww0 ww0Var) {
            super(ww0Var);
            Intrinsics.i(city, "city");
            this.c = premium_reserve_ticket_tableQueries;
            this.b = city;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.c.f697a.P(-768512699, "SELECT premium_reserve_ticket_table.bookingId, premium_reserve_ticket_table.bookingTime, premium_reserve_ticket_table.amount, premium_reserve_ticket_table.ticketStatus, premium_reserve_ticket_table.paymentMode, premium_reserve_ticket_table.passIdUsedToPurchaseTicket, premium_reserve_ticket_table.firstBookingId, premium_reserve_ticket_table.city, premium_reserve_ticket_table.tone, premium_reserve_ticket_table.qrCode, premium_reserve_ticket_table.configurationId, premium_reserve_ticket_table.tripId, premium_reserve_ticket_table.tripStaticSlotTime, premium_reserve_ticket_table.expectedTripStartTime, premium_reserve_ticket_table.expectedTripEndTime, premium_reserve_ticket_table.routeId, premium_reserve_ticket_table.routeName, premium_reserve_ticket_table.userId, premium_reserve_ticket_table.productType, premium_reserve_ticket_table.productSubType, premium_reserve_ticket_table.fromStopDetails, premium_reserve_ticket_table.toStopDetails, premium_reserve_ticket_table.isTripFeedbackCollected, premium_reserve_ticket_table.passengerCategoryDetails, premium_reserve_ticket_table.fareNote, premium_reserve_ticket_table.punchTime, premium_reserve_ticket_table.expiryTime, premium_reserve_ticket_table.validationStartTime, premium_reserve_ticket_table.firstBooking, premium_reserve_ticket_table.prevBookingStatus, premium_reserve_ticket_table.refundInfo, premium_reserve_ticket_table.seats FROM premium_reserve_ticket_table\nWHERE city = ?\nGROUP BY fromStopDetails, toStopDetails\nORDER BY MAX(bookingTime) DESC", function1, 1, new b(this, 20));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.c.f697a.h1(new String[]{"premium_reserve_ticket_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.c.f697a.P0(new String[]{"premium_reserve_ticket_table"}, listener);
        }

        public final String toString() {
            return "premium_reserve_ticket_table.sq:getUniqueOriginDestinationPairs";
        }
    }

    public Premium_reserve_ticket_tableQueries(SqlDriver sqlDriver, Premium_reserve_ticket_table.Adapter adapter, Premium_reserve_ticket_ack_table.Adapter adapter2) {
        super(sqlDriver);
        this.b = adapter;
        this.c = adapter2;
    }

    public final QueryResult W(String str) {
        QueryResult queryResultA0 = this.f697a.A0(null, StringsKt.y0("\n        |DELETE FROM premium_reserve_ticket_table \n        |WHERE passIdUsedToPurchaseTicket " + (str == null ? "IS" : "=") + " ?\n        "), new eu0(str, 9));
        T(-239235089, new yw0(0));
        return queryResultA0;
    }

    public final Query X(String userId, String str, Function7 function7) {
        Intrinsics.i(userId, "userId");
        return new GetAckInfoForBookingQuery(this, userId, str, new xw0(function7, this));
    }

    public final Query Y(String city, String userId, String str, FunctionN functionN) {
        Intrinsics.i(city, "city");
        Intrinsics.i(userId, "userId");
        return new GetAllPremiumReserveTicketsBookedThroughPassQuery(this, city, userId, str, new ww0(functionN, this, 2));
    }

    public final Query Z(String str, FunctionN functionN) {
        return new GetAllPremiumReserveTicketsForCityQuery(str, new ww0(functionN, this, 6));
    }

    public final Query a0(String str, String str2, long j, long j2, FunctionN functionN) {
        return new GetAllPremiumReserveTicketsForCityBetweenGivenTimeQuery(str, str2, j, j2, new ww0(functionN, this, 0));
    }

    public final Query b0(long j, String str, String str2, FunctionN functionN) {
        return new GetAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgementQuery(j, str, str2, new ww0(functionN, this, 7));
    }

    public final Query c0(String city, String userId, long j, long j2, FunctionN functionN) {
        Intrinsics.i(city, "city");
        Intrinsics.i(userId, "userId");
        return new GetAllPremiumReserveTicketsWithPendingTripFeedbackQuery(this, city, userId, j, j2, new ww0(functionN, this, 1));
    }

    public final Query d0(String str, FunctionN functionN) {
        return new GetAllPremiumReserveTicketsWithSameFirstBookingIdQuery(str, new ww0(functionN, this, 3));
    }

    public final Query e0(String bookingId, FunctionN functionN) {
        Intrinsics.i(bookingId, "bookingId");
        return new GetPremiumReserveTicketByIdQuery(this, bookingId, new xw0(functionN, this));
    }

    public final Query f0(String city, String userId, long j, String str, FunctionN functionN) {
        Intrinsics.i(city, "city");
        Intrinsics.i(userId, "userId");
        return new GetPremiumReserveTicketsBookedThroughPassQuery(this, city, userId, j, str, new ww0(functionN, this, 4));
    }

    public final Query g0(String city, FunctionN functionN) {
        Intrinsics.i(city, "city");
        return new GetUniqueOriginDestinationPairsQuery(this, city, new ww0(functionN, this, 5));
    }

    public final QueryResult h0(Premium_reserve_ticket_table premium_reserve_ticket_table) {
        QueryResult queryResultA0 = this.f697a.A0(192438557, "INSERT OR REPLACE INTO premium_reserve_ticket_table (bookingId, bookingTime, amount, ticketStatus, paymentMode, passIdUsedToPurchaseTicket, firstBookingId, city, tone, qrCode, configurationId, tripId, tripStaticSlotTime, expectedTripStartTime, expectedTripEndTime, routeId, routeName, userId, productType, productSubType, fromStopDetails, toStopDetails, isTripFeedbackCollected, passengerCategoryDetails, fareNote, punchTime, expiryTime, validationStartTime, firstBooking, prevBookingStatus, refundInfo, seats) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new lu0(15, premium_reserve_ticket_table, this));
        T(192438557, new zv0(29));
        return queryResultA0;
    }

    public final QueryResult i0(String bookingId, String userId, boolean z) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(userId, "userId");
        QueryResult queryResultA0 = this.f697a.A0(164308329, "UPDATE premium_reserve_ticket_table\nSET isTripFeedbackCollected = ?\nWHERE bookingId = ?\nAND userId = ?", new zw0(z, bookingId, userId, 0));
        T(164308329, new yw0(1));
        return queryResultA0;
    }
}
