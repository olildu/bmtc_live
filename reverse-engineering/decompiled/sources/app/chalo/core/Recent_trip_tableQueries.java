package app.chalo.core;

import app.cash.sqldelight.BaseTransacterImpl;
import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import defpackage.d11;
import defpackage.i40;
import defpackage.z01;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lapp/chalo/core/Recent_trip_tableQueries;", "Lapp/cash/sqldelight/TransacterImpl;", "GetAllTripRecentForCityQuery", "GetTripRecentForCityQuery", "GetLimitedTripRecentForCityOldestToNewestQuery", "GetLimitedTripRecentForCityNewestToOldestQuery", "GetRecentTripsFilteredByTransitModesSortedAscByAccessTimeForCityQuery", "GetRecentTripsFilteredByTransitModesSortedDescByAccessTimeForCityQuery", "GetRecentTripCountForCityQuery", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Recent_trip_tableQueries extends TransacterImpl {
    public final Recent_trip_table.Adapter b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_trip_tableQueries$GetAllTripRecentForCityQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllTripRecentForCityQuery<T> extends Query<T> {
        public final String b;
        public final /* synthetic */ Recent_trip_tableQueries c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetAllTripRecentForCityQuery(Recent_trip_tableQueries recent_trip_tableQueries, String city_id, d11 d11Var) {
            super(d11Var);
            Intrinsics.i(city_id, "city_id");
            this.c = recent_trip_tableQueries;
            this.b = city_id;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.c.f697a.P(-1090776894, "SELECT recent_trip_table.trip_id, recent_trip_table.city_id, recent_trip_table.from_location, recent_trip_table.to_location, recent_trip_table.transit_mode, recent_trip_table.access_time, recent_trip_table.access_count FROM recent_trip_table WHERE city_id = ? ORDER BY access_time DESC", function1, 1, new c(this, 23));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.c.f697a.h1(new String[]{"recent_trip_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.c.f697a.P0(new String[]{"recent_trip_table"}, listener);
        }

        public final String toString() {
            return "recent_trip_table.sq:getAllTripRecentForCity";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_trip_tableQueries$GetLimitedTripRecentForCityNewestToOldestQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetLimitedTripRecentForCityNewestToOldestQuery<T> extends Query<T> {
        public final String b;
        public final long c;
        public final /* synthetic */ Recent_trip_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetLimitedTripRecentForCityNewestToOldestQuery(Recent_trip_tableQueries recent_trip_tableQueries, String city_id, long j, d11 d11Var) {
            super(d11Var);
            Intrinsics.i(city_id, "city_id");
            this.d = recent_trip_tableQueries;
            this.b = city_id;
            this.c = j;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.d.f697a.P(-534189783, "SELECT recent_trip_table.trip_id, recent_trip_table.city_id, recent_trip_table.from_location, recent_trip_table.to_location, recent_trip_table.transit_mode, recent_trip_table.access_time, recent_trip_table.access_count FROM recent_trip_table WHERE city_id = ? ORDER BY access_time DESC LIMIT ?", function1, 2, new c(this, 24));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"recent_trip_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"recent_trip_table"}, listener);
        }

        public final String toString() {
            return "recent_trip_table.sq:getLimitedTripRecentForCityNewestToOldest";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_trip_tableQueries$GetLimitedTripRecentForCityOldestToNewestQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetLimitedTripRecentForCityOldestToNewestQuery<T> extends Query<T> {
        public final String b;
        public final long c;
        public final /* synthetic */ Recent_trip_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetLimitedTripRecentForCityOldestToNewestQuery(Recent_trip_tableQueries recent_trip_tableQueries, String city_id, long j, d11 d11Var) {
            super(d11Var);
            Intrinsics.i(city_id, "city_id");
            this.d = recent_trip_tableQueries;
            this.b = city_id;
            this.c = j;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.d.f697a.P(-1285701591, "SELECT recent_trip_table.trip_id, recent_trip_table.city_id, recent_trip_table.from_location, recent_trip_table.to_location, recent_trip_table.transit_mode, recent_trip_table.access_time, recent_trip_table.access_count FROM recent_trip_table WHERE city_id = ? ORDER BY access_time LIMIT ?", function1, 2, new c(this, 25));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"recent_trip_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"recent_trip_table"}, listener);
        }

        public final String toString() {
            return "recent_trip_table.sq:getLimitedTripRecentForCityOldestToNewest";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_trip_tableQueries$GetRecentTripCountForCityQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetRecentTripCountForCityQuery<T> extends Query<T> {
        public final String b;
        public final /* synthetic */ Recent_trip_tableQueries c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetRecentTripCountForCityQuery(Recent_trip_tableQueries recent_trip_tableQueries, String city_id, z01 z01Var) {
            super(z01Var);
            Intrinsics.i(city_id, "city_id");
            this.c = recent_trip_tableQueries;
            this.b = city_id;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.c.f697a.P(-1933386540, "SELECT COUNT(*) FROM recent_trip_table WHERE city_id = ?", function1, 1, new c(this, 26));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.c.f697a.h1(new String[]{"recent_trip_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.c.f697a.P0(new String[]{"recent_trip_table"}, listener);
        }

        public final String toString() {
            return "recent_trip_table.sq:getRecentTripCountForCity";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_trip_tableQueries$GetRecentTripsFilteredByTransitModesSortedAscByAccessTimeForCityQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetRecentTripsFilteredByTransitModesSortedAscByAccessTimeForCityQuery<T> extends Query<T> {
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
            return "recent_trip_table.sq:getRecentTripsFilteredByTransitModesSortedAscByAccessTimeForCity";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_trip_tableQueries$GetRecentTripsFilteredByTransitModesSortedDescByAccessTimeForCityQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetRecentTripsFilteredByTransitModesSortedDescByAccessTimeForCityQuery<T> extends Query<T> {
        public final String b;
        public final Collection c;
        public final long d;
        public final /* synthetic */ Recent_trip_tableQueries e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetRecentTripsFilteredByTransitModesSortedDescByAccessTimeForCityQuery(Recent_trip_tableQueries recent_trip_tableQueries, String city_id, Collection transit_mode, long j, d11 d11Var) {
            super(d11Var);
            Intrinsics.i(city_id, "city_id");
            Intrinsics.i(transit_mode, "transit_mode");
            this.e = recent_trip_tableQueries;
            this.b = city_id;
            this.c = transit_mode;
            this.d = j;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            Collection collection = this.c;
            String strS = BaseTransacterImpl.S(collection.size());
            Recent_trip_tableQueries recent_trip_tableQueries = this.e;
            return recent_trip_tableQueries.f697a.P(null, StringsKt.y0("\n          |SELECT recent_trip_table.trip_id, recent_trip_table.city_id, recent_trip_table.from_location, recent_trip_table.to_location, recent_trip_table.transit_mode, recent_trip_table.access_time, recent_trip_table.access_count FROM recent_trip_table\n          |WHERE city_id = ? AND transit_mode IN " + strS + "\n          |ORDER BY access_time DESC LIMIT ?\n          "), function1, collection.size() + 2, new d(19, this, recent_trip_tableQueries));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.e.f697a.h1(new String[]{"recent_trip_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.e.f697a.P0(new String[]{"recent_trip_table"}, listener);
        }

        public final String toString() {
            return "recent_trip_table.sq:getRecentTripsFilteredByTransitModesSortedDescByAccessTimeForCity";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_trip_tableQueries$GetTripRecentForCityQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetTripRecentForCityQuery<T> extends Query<T> {
        public final String b;
        public final String c;
        public final /* synthetic */ Recent_trip_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetTripRecentForCityQuery(Recent_trip_tableQueries recent_trip_tableQueries, String city_id, String trip_id, d11 d11Var) {
            super(d11Var);
            Intrinsics.i(city_id, "city_id");
            Intrinsics.i(trip_id, "trip_id");
            this.d = recent_trip_tableQueries;
            this.b = city_id;
            this.c = trip_id;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.d.f697a.P(975827877, "SELECT recent_trip_table.trip_id, recent_trip_table.city_id, recent_trip_table.from_location, recent_trip_table.to_location, recent_trip_table.transit_mode, recent_trip_table.access_time, recent_trip_table.access_count FROM recent_trip_table WHERE city_id = ? AND trip_id = ?", function1, 2, new c(this, 27));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"recent_trip_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"recent_trip_table"}, listener);
        }

        public final String toString() {
            return "recent_trip_table.sq:getTripRecentForCity";
        }
    }

    public Recent_trip_tableQueries(SqlDriver sqlDriver, Recent_trip_table.Adapter adapter) {
        super(sqlDriver);
        this.b = adapter;
    }

    public final Query W(String city_id, Function7 function7) {
        Intrinsics.i(city_id, "city_id");
        return new GetAllTripRecentForCityQuery(this, city_id, new d11(function7, this, 3));
    }

    public final Query X(String city_id, long j, Function7 function7) {
        Intrinsics.i(city_id, "city_id");
        return new GetLimitedTripRecentForCityNewestToOldestQuery(this, city_id, j, new d11(function7, this, 2));
    }

    public final Query Y(String city_id, long j, Function7 function7) {
        Intrinsics.i(city_id, "city_id");
        return new GetLimitedTripRecentForCityOldestToNewestQuery(this, city_id, j, new d11(function7, this, 1));
    }

    public final Query Z(String city_id) {
        Intrinsics.i(city_id, "city_id");
        return new GetRecentTripCountForCityQuery(this, city_id, new z01(24));
    }

    public final Query a0(String city_id, List transit_mode, long j, Function7 function7) {
        Intrinsics.i(city_id, "city_id");
        Intrinsics.i(transit_mode, "transit_mode");
        return new GetRecentTripsFilteredByTransitModesSortedDescByAccessTimeForCityQuery(this, city_id, transit_mode, j, new d11(function7, this, 4));
    }

    public final Query b0(String city_id, String trip_id, Function7 function7) {
        Intrinsics.i(city_id, "city_id");
        Intrinsics.i(trip_id, "trip_id");
        return new GetTripRecentForCityQuery(this, city_id, trip_id, new d11(function7, this, 0));
    }
}
