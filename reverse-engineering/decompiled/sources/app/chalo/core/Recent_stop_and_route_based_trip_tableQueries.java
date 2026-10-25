package app.chalo.core;

import app.cash.sqldelight.BaseTransacterImpl;
import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import defpackage.a11;
import defpackage.i40;
import defpackage.z01;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lapp/chalo/core/Recent_stop_and_route_based_trip_tableQueries;", "Lapp/cash/sqldelight/TransacterImpl;", "GetStopAndRouteBasedTripCityItineraryForCityQuery", "GetAllStopAndRouteBasedTripCityItineraryForCityQuery", "GetAllStopAndRouteBasedTripCityItineraryForCityOldestToNewestQuery", "GetAllStopAndRouteBasedTripCityItineraryForCityNewestToOldestQuery", "GetRecentStopAndRouteBasedTripsFilteredByTransitModesSortedAscByAccessTimeForCityQuery", "GetRecentStopAndRouteBasedTripsFilteredByTransitModesSortedDescByAccessTimeForCityQuery", "GetRecentStopAndRouteBasedTripCountForCityQuery", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Recent_stop_and_route_based_trip_tableQueries extends TransacterImpl {
    public final Recent_stop_and_route_based_trip_table.Adapter b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_stop_and_route_based_trip_tableQueries$GetAllStopAndRouteBasedTripCityItineraryForCityNewestToOldestQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllStopAndRouteBasedTripCityItineraryForCityNewestToOldestQuery<T> extends Query<T> {
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
            return "recent_stop_and_route_based_trip_table.sq:getAllStopAndRouteBasedTripCityItineraryForCityNewestToOldest";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_stop_and_route_based_trip_tableQueries$GetAllStopAndRouteBasedTripCityItineraryForCityOldestToNewestQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllStopAndRouteBasedTripCityItineraryForCityOldestToNewestQuery<T> extends Query<T> {
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
            return "recent_stop_and_route_based_trip_table.sq:getAllStopAndRouteBasedTripCityItineraryForCityOldestToNewest";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_stop_and_route_based_trip_tableQueries$GetAllStopAndRouteBasedTripCityItineraryForCityQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllStopAndRouteBasedTripCityItineraryForCityQuery<T> extends Query<T> {
        public final String b;
        public final /* synthetic */ Recent_stop_and_route_based_trip_tableQueries c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetAllStopAndRouteBasedTripCityItineraryForCityQuery(Recent_stop_and_route_based_trip_tableQueries recent_stop_and_route_based_trip_tableQueries, String city_id, a11 a11Var) {
            super(a11Var);
            Intrinsics.i(city_id, "city_id");
            this.c = recent_stop_and_route_based_trip_tableQueries;
            this.b = city_id;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.c.f697a.P(755787241, "SELECT recent_stop_and_route_based_trip_table.id, recent_stop_and_route_based_trip_table.city_id, recent_stop_and_route_based_trip_table.route_id, recent_stop_and_route_based_trip_table.route_name, recent_stop_and_route_based_trip_table.additional_route_info, recent_stop_and_route_based_trip_table.origin_stop, recent_stop_and_route_based_trip_table.destination_stop, recent_stop_and_route_based_trip_table.transit_mode, recent_stop_and_route_based_trip_table.access_time, recent_stop_and_route_based_trip_table.access_count FROM recent_stop_and_route_based_trip_table WHERE city_id = ? ORDER BY access_time DESC", function1, 1, new c(this, 9));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.c.f697a.h1(new String[]{"recent_stop_and_route_based_trip_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.c.f697a.P0(new String[]{"recent_stop_and_route_based_trip_table"}, listener);
        }

        public final String toString() {
            return "recent_stop_and_route_based_trip_table.sq:getAllStopAndRouteBasedTripCityItineraryForCity";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_stop_and_route_based_trip_tableQueries$GetRecentStopAndRouteBasedTripCountForCityQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetRecentStopAndRouteBasedTripCountForCityQuery<T> extends Query<T> {
        public final String b;
        public final /* synthetic */ Recent_stop_and_route_based_trip_tableQueries c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetRecentStopAndRouteBasedTripCountForCityQuery(Recent_stop_and_route_based_trip_tableQueries recent_stop_and_route_based_trip_tableQueries, String city_id, z01 z01Var) {
            super(z01Var);
            Intrinsics.i(city_id, "city_id");
            this.c = recent_stop_and_route_based_trip_tableQueries;
            this.b = city_id;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.c.f697a.P(-1422692612, "SELECT COUNT(*) FROM recent_stop_and_route_based_trip_table WHERE city_id = ?", function1, 1, new c(this, 10));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.c.f697a.h1(new String[]{"recent_stop_and_route_based_trip_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.c.f697a.P0(new String[]{"recent_stop_and_route_based_trip_table"}, listener);
        }

        public final String toString() {
            return "recent_stop_and_route_based_trip_table.sq:getRecentStopAndRouteBasedTripCountForCity";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_stop_and_route_based_trip_tableQueries$GetRecentStopAndRouteBasedTripsFilteredByTransitModesSortedAscByAccessTimeForCityQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetRecentStopAndRouteBasedTripsFilteredByTransitModesSortedAscByAccessTimeForCityQuery<T> extends Query<T> {
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
            return "recent_stop_and_route_based_trip_table.sq:getRecentStopAndRouteBasedTripsFilteredByTransitModesSortedAscByAccessTimeForCity";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_stop_and_route_based_trip_tableQueries$GetRecentStopAndRouteBasedTripsFilteredByTransitModesSortedDescByAccessTimeForCityQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetRecentStopAndRouteBasedTripsFilteredByTransitModesSortedDescByAccessTimeForCityQuery<T> extends Query<T> {
        public final String b;
        public final Collection c;
        public final long d;
        public final /* synthetic */ Recent_stop_and_route_based_trip_tableQueries e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetRecentStopAndRouteBasedTripsFilteredByTransitModesSortedDescByAccessTimeForCityQuery(Recent_stop_and_route_based_trip_tableQueries recent_stop_and_route_based_trip_tableQueries, String str, Collection transit_mode, long j, a11 a11Var) {
            super(a11Var);
            Intrinsics.i(transit_mode, "transit_mode");
            this.e = recent_stop_and_route_based_trip_tableQueries;
            this.b = str;
            this.c = transit_mode;
            this.d = j;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            Collection collection = this.c;
            String strS = BaseTransacterImpl.S(collection.size());
            Recent_stop_and_route_based_trip_tableQueries recent_stop_and_route_based_trip_tableQueries = this.e;
            return recent_stop_and_route_based_trip_tableQueries.f697a.P(null, StringsKt.y0("\n          |SELECT recent_stop_and_route_based_trip_table.id, recent_stop_and_route_based_trip_table.city_id, recent_stop_and_route_based_trip_table.route_id, recent_stop_and_route_based_trip_table.route_name, recent_stop_and_route_based_trip_table.additional_route_info, recent_stop_and_route_based_trip_table.origin_stop, recent_stop_and_route_based_trip_table.destination_stop, recent_stop_and_route_based_trip_table.transit_mode, recent_stop_and_route_based_trip_table.access_time, recent_stop_and_route_based_trip_table.access_count FROM recent_stop_and_route_based_trip_table\n          |WHERE city_id = ? AND transit_mode IN " + strS + "\n          |ORDER BY access_time DESC LIMIT ?\n          "), function1, collection.size() + 2, new d(12, this, recent_stop_and_route_based_trip_tableQueries));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.e.f697a.h1(new String[]{"recent_stop_and_route_based_trip_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.e.f697a.P0(new String[]{"recent_stop_and_route_based_trip_table"}, listener);
        }

        public final String toString() {
            return "recent_stop_and_route_based_trip_table.sq:getRecentStopAndRouteBasedTripsFilteredByTransitModesSortedDescByAccessTimeForCity";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_stop_and_route_based_trip_tableQueries$GetStopAndRouteBasedTripCityItineraryForCityQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetStopAndRouteBasedTripCityItineraryForCityQuery<T> extends Query<T> {
        public final String b;
        public final String c;
        public final /* synthetic */ Recent_stop_and_route_based_trip_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetStopAndRouteBasedTripCityItineraryForCityQuery(Recent_stop_and_route_based_trip_tableQueries recent_stop_and_route_based_trip_tableQueries, String id, String city_id, a11 a11Var) {
            super(a11Var);
            Intrinsics.i(id, "id");
            Intrinsics.i(city_id, "city_id");
            this.d = recent_stop_and_route_based_trip_tableQueries;
            this.b = id;
            this.c = city_id;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.d.f697a.P(-298779994, "SELECT recent_stop_and_route_based_trip_table.id, recent_stop_and_route_based_trip_table.city_id, recent_stop_and_route_based_trip_table.route_id, recent_stop_and_route_based_trip_table.route_name, recent_stop_and_route_based_trip_table.additional_route_info, recent_stop_and_route_based_trip_table.origin_stop, recent_stop_and_route_based_trip_table.destination_stop, recent_stop_and_route_based_trip_table.transit_mode, recent_stop_and_route_based_trip_table.access_time, recent_stop_and_route_based_trip_table.access_count FROM recent_stop_and_route_based_trip_table WHERE id = ? AND city_id = ?", function1, 2, new c(this, 11));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"recent_stop_and_route_based_trip_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"recent_stop_and_route_based_trip_table"}, listener);
        }

        public final String toString() {
            return "recent_stop_and_route_based_trip_table.sq:getStopAndRouteBasedTripCityItineraryForCity";
        }
    }

    public Recent_stop_and_route_based_trip_tableQueries(SqlDriver sqlDriver, Recent_stop_and_route_based_trip_table.Adapter adapter) {
        super(sqlDriver);
        this.b = adapter;
    }

    public final Query W(String city_id, Function10 function10) {
        Intrinsics.i(city_id, "city_id");
        return new GetAllStopAndRouteBasedTripCityItineraryForCityQuery(this, city_id, new a11(function10, this, 2));
    }

    public final Query X(String city_id) {
        Intrinsics.i(city_id, "city_id");
        return new GetRecentStopAndRouteBasedTripCountForCityQuery(this, city_id, new z01(6));
    }

    public final Query Y(String str, List transit_mode, long j, Function10 function10) {
        Intrinsics.i(transit_mode, "transit_mode");
        return new GetRecentStopAndRouteBasedTripsFilteredByTransitModesSortedDescByAccessTimeForCityQuery(this, str, transit_mode, j, new a11(function10, this, 1));
    }

    public final Query Z(String id, String city_id, Function10 function10) {
        Intrinsics.i(id, "id");
        Intrinsics.i(city_id, "city_id");
        return new GetStopAndRouteBasedTripCityItineraryForCityQuery(this, id, city_id, new a11(function10, this, 0));
    }
}
