package app.chalo.core;

import app.cash.sqldelight.BaseTransacterImpl;
import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import defpackage.b11;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lapp/chalo/core/Recent_stop_based_trip_tableQueries;", "Lapp/cash/sqldelight/TransacterImpl;", "GetStopBasedTripCityItineraryForCityQuery", "GetAllStopBasedTripCityItineraryForCityQuery", "GetAllStopBasedTripCityItineraryForCityOldestToNewestQuery", "GetAllStopBasedTripCityItineraryForCityNewestToOldestQuery", "GetRecentStopBasedTripsFilteredByTransitModesSortedAscByAccessTimeForCityQuery", "GetRecentStopBasedTripsFilteredByTransitModesSortedDescByAccessTimeForCityQuery", "GetRecentStopBasedTripCountForCityQuery", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Recent_stop_based_trip_tableQueries extends TransacterImpl {
    public final Recent_stop_based_trip_table.Adapter b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_stop_based_trip_tableQueries$GetAllStopBasedTripCityItineraryForCityNewestToOldestQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllStopBasedTripCityItineraryForCityNewestToOldestQuery<T> extends Query<T> {
        public final String b;
        public final long c;
        public final /* synthetic */ Recent_stop_based_trip_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetAllStopBasedTripCityItineraryForCityNewestToOldestQuery(Recent_stop_based_trip_tableQueries recent_stop_based_trip_tableQueries, String city_id, long j, b11 b11Var) {
            super(b11Var);
            Intrinsics.i(city_id, "city_id");
            this.d = recent_stop_based_trip_tableQueries;
            this.b = city_id;
            this.c = j;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.d.f697a.P(1439820953, "SELECT recent_stop_based_trip_table.stop_based_trip_id, recent_stop_based_trip_table.city_id, recent_stop_based_trip_table.origin_stop, recent_stop_based_trip_table.destination_stop, recent_stop_based_trip_table.transit_mode, recent_stop_based_trip_table.access_time, recent_stop_based_trip_table.access_count FROM recent_stop_based_trip_table WHERE city_id = ? ORDER BY access_time DESC LIMIT ?", function1, 2, new c(this, 12));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"recent_stop_based_trip_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"recent_stop_based_trip_table"}, listener);
        }

        public final String toString() {
            return "recent_stop_based_trip_table.sq:getAllStopBasedTripCityItineraryForCityNewestToOldest";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_stop_based_trip_tableQueries$GetAllStopBasedTripCityItineraryForCityOldestToNewestQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllStopBasedTripCityItineraryForCityOldestToNewestQuery<T> extends Query<T> {
        public final String b;
        public final long c;
        public final /* synthetic */ Recent_stop_based_trip_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetAllStopBasedTripCityItineraryForCityOldestToNewestQuery(Recent_stop_based_trip_tableQueries recent_stop_based_trip_tableQueries, String city_id, long j, b11 b11Var) {
            super(b11Var);
            Intrinsics.i(city_id, "city_id");
            this.d = recent_stop_based_trip_tableQueries;
            this.b = city_id;
            this.c = j;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.d.f697a.P(688309145, "SELECT recent_stop_based_trip_table.stop_based_trip_id, recent_stop_based_trip_table.city_id, recent_stop_based_trip_table.origin_stop, recent_stop_based_trip_table.destination_stop, recent_stop_based_trip_table.transit_mode, recent_stop_based_trip_table.access_time, recent_stop_based_trip_table.access_count FROM recent_stop_based_trip_table WHERE city_id = ? ORDER BY access_time LIMIT ?", function1, 2, new c(this, 13));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"recent_stop_based_trip_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"recent_stop_based_trip_table"}, listener);
        }

        public final String toString() {
            return "recent_stop_based_trip_table.sq:getAllStopBasedTripCityItineraryForCityOldestToNewest";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_stop_based_trip_tableQueries$GetAllStopBasedTripCityItineraryForCityQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllStopBasedTripCityItineraryForCityQuery<T> extends Query<T> {
        public final String b;
        public final /* synthetic */ Recent_stop_based_trip_tableQueries c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetAllStopBasedTripCityItineraryForCityQuery(Recent_stop_based_trip_tableQueries recent_stop_based_trip_tableQueries, String city_id, b11 b11Var) {
            super(b11Var);
            Intrinsics.i(city_id, "city_id");
            this.c = recent_stop_based_trip_tableQueries;
            this.b = city_id;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.c.f697a.P(1820192217, "SELECT recent_stop_based_trip_table.stop_based_trip_id, recent_stop_based_trip_table.city_id, recent_stop_based_trip_table.origin_stop, recent_stop_based_trip_table.destination_stop, recent_stop_based_trip_table.transit_mode, recent_stop_based_trip_table.access_time, recent_stop_based_trip_table.access_count FROM recent_stop_based_trip_table WHERE city_id = ? ORDER BY access_time DESC", function1, 1, new c(this, 14));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.c.f697a.h1(new String[]{"recent_stop_based_trip_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.c.f697a.P0(new String[]{"recent_stop_based_trip_table"}, listener);
        }

        public final String toString() {
            return "recent_stop_based_trip_table.sq:getAllStopBasedTripCityItineraryForCity";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_stop_based_trip_tableQueries$GetRecentStopBasedTripCountForCityQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetRecentStopBasedTripCountForCityQuery<T> extends Query<T> {
        public final String b;
        public final /* synthetic */ Recent_stop_based_trip_tableQueries c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetRecentStopBasedTripCountForCityQuery(Recent_stop_based_trip_tableQueries recent_stop_based_trip_tableQueries, String city_id, z01 z01Var) {
            super(z01Var);
            Intrinsics.i(city_id, "city_id");
            this.c = recent_stop_based_trip_tableQueries;
            this.b = city_id;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.c.f697a.P(-273163920, "SELECT COUNT(*) FROM recent_stop_based_trip_table WHERE city_id = ?", function1, 1, new c(this, 15));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.c.f697a.h1(new String[]{"recent_stop_based_trip_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.c.f697a.P0(new String[]{"recent_stop_based_trip_table"}, listener);
        }

        public final String toString() {
            return "recent_stop_based_trip_table.sq:getRecentStopBasedTripCountForCity";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_stop_based_trip_tableQueries$GetRecentStopBasedTripsFilteredByTransitModesSortedAscByAccessTimeForCityQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetRecentStopBasedTripsFilteredByTransitModesSortedAscByAccessTimeForCityQuery<T> extends Query<T> {
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
            return "recent_stop_based_trip_table.sq:getRecentStopBasedTripsFilteredByTransitModesSortedAscByAccessTimeForCity";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_stop_based_trip_tableQueries$GetRecentStopBasedTripsFilteredByTransitModesSortedDescByAccessTimeForCityQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetRecentStopBasedTripsFilteredByTransitModesSortedDescByAccessTimeForCityQuery<T> extends Query<T> {
        public final String b;
        public final Collection c;
        public final long d;
        public final /* synthetic */ Recent_stop_based_trip_tableQueries e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetRecentStopBasedTripsFilteredByTransitModesSortedDescByAccessTimeForCityQuery(Recent_stop_based_trip_tableQueries recent_stop_based_trip_tableQueries, String str, Collection transit_mode, long j, b11 b11Var) {
            super(b11Var);
            Intrinsics.i(transit_mode, "transit_mode");
            this.e = recent_stop_based_trip_tableQueries;
            this.b = str;
            this.c = transit_mode;
            this.d = j;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            Collection collection = this.c;
            String strS = BaseTransacterImpl.S(collection.size());
            Recent_stop_based_trip_tableQueries recent_stop_based_trip_tableQueries = this.e;
            return recent_stop_based_trip_tableQueries.f697a.P(null, StringsKt.y0("\n          |SELECT recent_stop_based_trip_table.stop_based_trip_id, recent_stop_based_trip_table.city_id, recent_stop_based_trip_table.origin_stop, recent_stop_based_trip_table.destination_stop, recent_stop_based_trip_table.transit_mode, recent_stop_based_trip_table.access_time, recent_stop_based_trip_table.access_count FROM recent_stop_based_trip_table\n          |WHERE city_id = ? AND transit_mode IN " + strS + "\n          |ORDER BY access_time DESC LIMIT ?\n          "), function1, collection.size() + 2, new d(14, this, recent_stop_based_trip_tableQueries));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.e.f697a.h1(new String[]{"recent_stop_based_trip_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.e.f697a.P0(new String[]{"recent_stop_based_trip_table"}, listener);
        }

        public final String toString() {
            return "recent_stop_based_trip_table.sq:getRecentStopBasedTripsFilteredByTransitModesSortedDescByAccessTimeForCity";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_stop_based_trip_tableQueries$GetStopBasedTripCityItineraryForCityQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetStopBasedTripCityItineraryForCityQuery<T> extends Query<T> {
        public final String b;
        public final String c;
        public final /* synthetic */ Recent_stop_based_trip_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetStopBasedTripCityItineraryForCityQuery(Recent_stop_based_trip_tableQueries recent_stop_based_trip_tableQueries, String stop_based_trip_id, String city_id, b11 b11Var) {
            super(b11Var);
            Intrinsics.i(stop_based_trip_id, "stop_based_trip_id");
            Intrinsics.i(city_id, "city_id");
            this.d = recent_stop_based_trip_tableQueries;
            this.b = stop_based_trip_id;
            this.c = city_id;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.d.f697a.P(1972407706, "SELECT recent_stop_based_trip_table.stop_based_trip_id, recent_stop_based_trip_table.city_id, recent_stop_based_trip_table.origin_stop, recent_stop_based_trip_table.destination_stop, recent_stop_based_trip_table.transit_mode, recent_stop_based_trip_table.access_time, recent_stop_based_trip_table.access_count FROM recent_stop_based_trip_table WHERE stop_based_trip_id = ? AND city_id = ?", function1, 2, new c(this, 16));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"recent_stop_based_trip_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"recent_stop_based_trip_table"}, listener);
        }

        public final String toString() {
            return "recent_stop_based_trip_table.sq:getStopBasedTripCityItineraryForCity";
        }
    }

    public Recent_stop_based_trip_tableQueries(SqlDriver sqlDriver, Recent_stop_based_trip_table.Adapter adapter) {
        super(sqlDriver);
        this.b = adapter;
    }

    public final Query W(String city_id, Function7 function7) {
        Intrinsics.i(city_id, "city_id");
        return new GetAllStopBasedTripCityItineraryForCityQuery(this, city_id, new b11(function7, this, 4));
    }

    public final Query X(String city_id, long j, Function7 function7) {
        Intrinsics.i(city_id, "city_id");
        return new GetAllStopBasedTripCityItineraryForCityNewestToOldestQuery(this, city_id, j, new b11(function7, this, 0));
    }

    public final Query Y(String city_id, long j, Function7 function7) {
        Intrinsics.i(city_id, "city_id");
        return new GetAllStopBasedTripCityItineraryForCityOldestToNewestQuery(this, city_id, j, new b11(function7, this, 2));
    }

    public final Query Z(String city_id) {
        Intrinsics.i(city_id, "city_id");
        return new GetRecentStopBasedTripCountForCityQuery(this, city_id, new z01(9));
    }

    public final Query a0(String str, List transit_mode, long j, Function7 function7) {
        Intrinsics.i(transit_mode, "transit_mode");
        return new GetRecentStopBasedTripsFilteredByTransitModesSortedDescByAccessTimeForCityQuery(this, str, transit_mode, j, new b11(function7, this, 1));
    }

    public final Query b0(String stop_based_trip_id, String city_id, Function7 function7) {
        Intrinsics.i(stop_based_trip_id, "stop_based_trip_id");
        Intrinsics.i(city_id, "city_id");
        return new GetStopBasedTripCityItineraryForCityQuery(this, stop_based_trip_id, city_id, new b11(function7, this, 3));
    }
}
