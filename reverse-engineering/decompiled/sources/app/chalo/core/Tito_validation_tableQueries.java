package app.chalo.core;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import defpackage.i40;
import defpackage.sh1;
import defpackage.wj1;
import defpackage.yp1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.FunctionN;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/core/Tito_validation_tableQueries;", "Lapp/cash/sqldelight/TransacterImpl;", "GetTitoEntriesForBookingIdQuery", "GetTitoStatusForTapIdQuery", "GetTitoEntryForTapIdQuery", "GetAllTitoEntriesQuery", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Tito_validation_tableQueries extends TransacterImpl {
    public final Tito_validation_table.Adapter b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Tito_validation_tableQueries$GetAllTitoEntriesQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllTitoEntriesQuery<T> extends Query<T> {
        public final String b;
        public final /* synthetic */ Tito_validation_tableQueries c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetAllTitoEntriesQuery(Tito_validation_tableQueries tito_validation_tableQueries, String userId, wj1 wj1Var) {
            super(wj1Var);
            Intrinsics.i(userId, "userId");
            this.c = tito_validation_tableQueries;
            this.b = userId;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.c.f697a.P(-1503356049, "SELECT tito_validation_table.tapId, tito_validation_table.tapInGroupNo, tito_validation_table.activationTSInSec, tito_validation_table.tapInTimestampInMillis, tito_validation_table.conductorValidationStaticPayload, tito_validation_table.tapInRouteId, tito_validation_table.tapInStopId, tito_validation_table.tapInTripNo, tito_validation_table.tapInWaybillNo, tito_validation_table.vehicleNo, tito_validation_table.dropOffStopId, tito_validation_table.titoStatus, tito_validation_table.userId, tito_validation_table.bookingId, tito_validation_table.productType, tito_validation_table.productSubType, tito_validation_table.titoRideExpiryTimeInMillis, tito_validation_table.tapOutGroupNo, tito_validation_table.tapOutTimestampInMillis, tito_validation_table.tapOutRouteId, tito_validation_table.tapOutStopId, tito_validation_table.tapOutTripNo, tito_validation_table.tapOutWaybillNo FROM tito_validation_table WHERE userId = ?", function1, 1, new e(this, 20));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.c.f697a.h1(new String[]{"tito_validation_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.c.f697a.P0(new String[]{"tito_validation_table"}, listener);
        }

        public final String toString() {
            return "tito_validation_table.sq:getAllTitoEntries";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Tito_validation_tableQueries$GetTitoEntriesForBookingIdQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetTitoEntriesForBookingIdQuery<T> extends Query<T> {
        public final String b;
        public final /* synthetic */ Tito_validation_tableQueries c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetTitoEntriesForBookingIdQuery(Tito_validation_tableQueries tito_validation_tableQueries, String bookingId, wj1 wj1Var) {
            super(wj1Var);
            Intrinsics.i(bookingId, "bookingId");
            this.c = tito_validation_tableQueries;
            this.b = bookingId;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.c.f697a.P(-767548325, "SELECT tito_validation_table.tapId, tito_validation_table.tapInGroupNo, tito_validation_table.activationTSInSec, tito_validation_table.tapInTimestampInMillis, tito_validation_table.conductorValidationStaticPayload, tito_validation_table.tapInRouteId, tito_validation_table.tapInStopId, tito_validation_table.tapInTripNo, tito_validation_table.tapInWaybillNo, tito_validation_table.vehicleNo, tito_validation_table.dropOffStopId, tito_validation_table.titoStatus, tito_validation_table.userId, tito_validation_table.bookingId, tito_validation_table.productType, tito_validation_table.productSubType, tito_validation_table.titoRideExpiryTimeInMillis, tito_validation_table.tapOutGroupNo, tito_validation_table.tapOutTimestampInMillis, tito_validation_table.tapOutRouteId, tito_validation_table.tapOutStopId, tito_validation_table.tapOutTripNo, tito_validation_table.tapOutWaybillNo FROM tito_validation_table WHERE bookingId = ?", function1, 1, new e(this, 21));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.c.f697a.h1(new String[]{"tito_validation_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.c.f697a.P0(new String[]{"tito_validation_table"}, listener);
        }

        public final String toString() {
            return "tito_validation_table.sq:getTitoEntriesForBookingId";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Tito_validation_tableQueries$GetTitoEntryForTapIdQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetTitoEntryForTapIdQuery<T> extends Query<T> {
        public final String b;
        public final /* synthetic */ Tito_validation_tableQueries c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetTitoEntryForTapIdQuery(Tito_validation_tableQueries tito_validation_tableQueries, String tapId, wj1 wj1Var) {
            super(wj1Var);
            Intrinsics.i(tapId, "tapId");
            this.c = tito_validation_tableQueries;
            this.b = tapId;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.c.f697a.P(-1813997945, "SELECT tito_validation_table.tapId, tito_validation_table.tapInGroupNo, tito_validation_table.activationTSInSec, tito_validation_table.tapInTimestampInMillis, tito_validation_table.conductorValidationStaticPayload, tito_validation_table.tapInRouteId, tito_validation_table.tapInStopId, tito_validation_table.tapInTripNo, tito_validation_table.tapInWaybillNo, tito_validation_table.vehicleNo, tito_validation_table.dropOffStopId, tito_validation_table.titoStatus, tito_validation_table.userId, tito_validation_table.bookingId, tito_validation_table.productType, tito_validation_table.productSubType, tito_validation_table.titoRideExpiryTimeInMillis, tito_validation_table.tapOutGroupNo, tito_validation_table.tapOutTimestampInMillis, tito_validation_table.tapOutRouteId, tito_validation_table.tapOutStopId, tito_validation_table.tapOutTripNo, tito_validation_table.tapOutWaybillNo FROM tito_validation_table WHERE tapId = ?", function1, 1, new e(this, 22));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.c.f697a.h1(new String[]{"tito_validation_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.c.f697a.P0(new String[]{"tito_validation_table"}, listener);
        }

        public final String toString() {
            return "tito_validation_table.sq:getTitoEntryForTapId";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Tito_validation_tableQueries$GetTitoStatusForTapIdQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetTitoStatusForTapIdQuery<T> extends Query<T> {
        public final /* synthetic */ Tito_validation_tableQueries b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetTitoStatusForTapIdQuery(Tito_validation_tableQueries tito_validation_tableQueries, sh1 sh1Var) {
            super(sh1Var);
            Intrinsics.i(null, "tapId");
            this.b = tito_validation_tableQueries;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.b.f697a.P(-1601023033, "SELECT titoStatus FROM tito_validation_table WHERE tapId = ?", function1, 1, new yp1(this, 10));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.b.f697a.h1(new String[]{"tito_validation_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.b.f697a.P0(new String[]{"tito_validation_table"}, listener);
        }

        public final String toString() {
            return "tito_validation_table.sq:getTitoStatusForTapId";
        }
    }

    public Tito_validation_tableQueries(SqlDriver sqlDriver, Tito_validation_table.Adapter adapter) {
        super(sqlDriver);
        this.b = adapter;
    }

    public final Query W(String userId, FunctionN functionN) {
        Intrinsics.i(userId, "userId");
        return new GetAllTitoEntriesQuery(this, userId, new wj1(functionN, this, 2));
    }

    public final Query X(String bookingId, FunctionN functionN) {
        Intrinsics.i(bookingId, "bookingId");
        return new GetTitoEntriesForBookingIdQuery(this, bookingId, new wj1(functionN, this, 0));
    }

    public final Query Y(String tapId, FunctionN functionN) {
        Intrinsics.i(tapId, "tapId");
        return new GetTitoEntryForTapIdQuery(this, tapId, new wj1(functionN, this, 1));
    }

    public final Query Z() {
        Intrinsics.i(null, "tapId");
        return new GetTitoStatusForTapIdQuery(this, new sh1(this, 8));
    }
}
