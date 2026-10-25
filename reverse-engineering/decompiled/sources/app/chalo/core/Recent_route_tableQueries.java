package app.chalo.core;

import app.cash.sqldelight.BaseTransacterImpl;
import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import app.chalo.recent.database.entities.RecentsSpecialEntityStatus;
import defpackage.e01;
import defpackage.i40;
import defpackage.y01;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001:\u000f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lapp/chalo/core/Recent_route_tableQueries;", "Lapp/cash/sqldelight/TransacterImpl;", "GetAllRouteCityItineraryForCityQuery", "GetAllRouteCityItineraryForCityWithSpecialStatusQuery", "GetRouteCityItineraryQuery", "GetOldestRecentRoutesWithSpecialStatusForCityQuery", "GetNewestRecentRoutesWithSpecialStatusForCityQuery", "GetRecentRoutesForSpecialStatusCountQuery", "GetRouteCityItineraryItemCountForCityQuery", "GetRecentRoutesSortedDescByAccessTimeForCityQuery", "GetRecentRoutesSortedAscByAccessTimeForCityQuery", "GetRecentRoutesFilteredByTransitModesSortedAscByAccessTimeForCityQuery", "GetRecentRoutesFilteredByTransitModesSortedDescByAccessTimeForCityQuery", "GetSortedByMostRecentAccessForCityQuery", "GetRecentRouteCountForCityQuery", "GetRecentRouteCountForCityWithSpecialStatusQuery", "GetAllRecentRoutesWithSpecialStatusForCityQuery", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Recent_route_tableQueries extends TransacterImpl {
    public final Recent_route_table.Adapter b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_route_tableQueries$GetAllRecentRoutesWithSpecialStatusForCityQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllRecentRoutesWithSpecialStatusForCityQuery<T> extends Query<T> {
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
            return "recent_route_table.sq:getAllRecentRoutesWithSpecialStatusForCity";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_route_tableQueries$GetAllRouteCityItineraryForCityQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllRouteCityItineraryForCityQuery<T> extends Query<T> {
        public final String b;
        public final /* synthetic */ Recent_route_tableQueries c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetAllRouteCityItineraryForCityQuery(Recent_route_tableQueries recent_route_tableQueries, String city_id, y01 y01Var) {
            super(y01Var);
            Intrinsics.i(city_id, "city_id");
            this.c = recent_route_tableQueries;
            this.b = city_id;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.c.f697a.P(1389638385, "SELECT recent_route_table.route_id, recent_route_table.city_id, recent_route_table.route_name, recent_route_table.start_stop_name, recent_route_table.end_stop_name, recent_route_table.agency, recent_route_table.isAcBus, recent_route_table.special_feature_list, recent_route_table.is_free_ride_available, recent_route_table.transit_mode, recent_route_table.recents_special_entity_status, recent_route_table.access_time, recent_route_table.access_count, recent_route_table.via, recent_route_table.routeNamingScheme FROM recent_route_table WHERE city_id = ?", function1, 1, new c(this, 2));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.c.f697a.h1(new String[]{"recent_route_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.c.f697a.P0(new String[]{"recent_route_table"}, listener);
        }

        public final String toString() {
            return "recent_route_table.sq:getAllRouteCityItineraryForCity";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_route_tableQueries$GetAllRouteCityItineraryForCityWithSpecialStatusQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllRouteCityItineraryForCityWithSpecialStatusQuery<T> extends Query<T> {
        public final String b;
        public final RecentsSpecialEntityStatus c;
        public final /* synthetic */ Recent_route_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetAllRouteCityItineraryForCityWithSpecialStatusQuery(Recent_route_tableQueries recent_route_tableQueries, String city_id, RecentsSpecialEntityStatus recents_special_entity_status, y01 y01Var) {
            super(y01Var);
            Intrinsics.i(city_id, "city_id");
            Intrinsics.i(recents_special_entity_status, "recents_special_entity_status");
            this.d = recent_route_tableQueries;
            this.b = city_id;
            this.c = recents_special_entity_status;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            Recent_route_tableQueries recent_route_tableQueries = this.d;
            return recent_route_tableQueries.f697a.P(499936244, "SELECT recent_route_table.route_id, recent_route_table.city_id, recent_route_table.route_name, recent_route_table.start_stop_name, recent_route_table.end_stop_name, recent_route_table.agency, recent_route_table.isAcBus, recent_route_table.special_feature_list, recent_route_table.is_free_ride_available, recent_route_table.transit_mode, recent_route_table.recents_special_entity_status, recent_route_table.access_time, recent_route_table.access_count, recent_route_table.via, recent_route_table.routeNamingScheme FROM recent_route_table\nWHERE city_id = ? AND recents_special_entity_status = ?", function1, 2, new d(4, this, recent_route_tableQueries));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"recent_route_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"recent_route_table"}, listener);
        }

        public final String toString() {
            return "recent_route_table.sq:getAllRouteCityItineraryForCityWithSpecialStatus";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_route_tableQueries$GetNewestRecentRoutesWithSpecialStatusForCityQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetNewestRecentRoutesWithSpecialStatusForCityQuery<T> extends Query<T> {
        public final String b;
        public final RecentsSpecialEntityStatus c;
        public final long d;
        public final /* synthetic */ Recent_route_tableQueries e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetNewestRecentRoutesWithSpecialStatusForCityQuery(Recent_route_tableQueries recent_route_tableQueries, String city_id, RecentsSpecialEntityStatus recents_special_entity_status, long j, y01 y01Var) {
            super(y01Var);
            Intrinsics.i(city_id, "city_id");
            Intrinsics.i(recents_special_entity_status, "recents_special_entity_status");
            this.e = recent_route_tableQueries;
            this.b = city_id;
            this.c = recents_special_entity_status;
            this.d = j;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            Recent_route_tableQueries recent_route_tableQueries = this.e;
            return recent_route_tableQueries.f697a.P(-2081842705, "SELECT recent_route_table.route_id, recent_route_table.city_id, recent_route_table.route_name, recent_route_table.start_stop_name, recent_route_table.end_stop_name, recent_route_table.agency, recent_route_table.isAcBus, recent_route_table.special_feature_list, recent_route_table.is_free_ride_available, recent_route_table.transit_mode, recent_route_table.recents_special_entity_status, recent_route_table.access_time, recent_route_table.access_count, recent_route_table.via, recent_route_table.routeNamingScheme FROM recent_route_table\nWHERE city_id = ? AND recents_special_entity_status = ?\nORDER BY access_time DESC LIMIT ?", function1, 3, new d(5, this, recent_route_tableQueries));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.e.f697a.h1(new String[]{"recent_route_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.e.f697a.P0(new String[]{"recent_route_table"}, listener);
        }

        public final String toString() {
            return "recent_route_table.sq:getNewestRecentRoutesWithSpecialStatusForCity";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_route_tableQueries$GetOldestRecentRoutesWithSpecialStatusForCityQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetOldestRecentRoutesWithSpecialStatusForCityQuery<T> extends Query<T> {
        public final String b;
        public final RecentsSpecialEntityStatus c;
        public final long d;
        public final /* synthetic */ Recent_route_tableQueries e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetOldestRecentRoutesWithSpecialStatusForCityQuery(Recent_route_tableQueries recent_route_tableQueries, String city_id, RecentsSpecialEntityStatus recents_special_entity_status, long j, y01 y01Var) {
            super(y01Var);
            Intrinsics.i(city_id, "city_id");
            Intrinsics.i(recents_special_entity_status, "recents_special_entity_status");
            this.e = recent_route_tableQueries;
            this.b = city_id;
            this.c = recents_special_entity_status;
            this.d = j;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            Recent_route_tableQueries recent_route_tableQueries = this.e;
            return recent_route_tableQueries.f697a.P(-327738488, "SELECT recent_route_table.route_id, recent_route_table.city_id, recent_route_table.route_name, recent_route_table.start_stop_name, recent_route_table.end_stop_name, recent_route_table.agency, recent_route_table.isAcBus, recent_route_table.special_feature_list, recent_route_table.is_free_ride_available, recent_route_table.transit_mode, recent_route_table.recents_special_entity_status, recent_route_table.access_time, recent_route_table.access_count, recent_route_table.via, recent_route_table.routeNamingScheme FROM recent_route_table\nWHERE city_id = ? AND recents_special_entity_status = ?\nORDER BY access_time LIMIT ?", function1, 3, new d(6, this, recent_route_tableQueries));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.e.f697a.h1(new String[]{"recent_route_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.e.f697a.P0(new String[]{"recent_route_table"}, listener);
        }

        public final String toString() {
            return "recent_route_table.sq:getOldestRecentRoutesWithSpecialStatusForCity";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_route_tableQueries$GetRecentRouteCountForCityQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetRecentRouteCountForCityQuery<T> extends Query<T> {
        public final String b;
        public final String c;
        public final /* synthetic */ Recent_route_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetRecentRouteCountForCityQuery(Recent_route_tableQueries recent_route_tableQueries, String route_id, String city_id, e01 e01Var) {
            super(e01Var);
            Intrinsics.i(route_id, "route_id");
            Intrinsics.i(city_id, "city_id");
            this.d = recent_route_tableQueries;
            this.b = route_id;
            this.c = city_id;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.d.f697a.P(-1079096162, "SELECT COUNT(*) FROM recent_route_table WHERE route_id = ? AND city_id = ?", function1, 2, new c(this, 3));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"recent_route_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"recent_route_table"}, listener);
        }

        public final String toString() {
            return "recent_route_table.sq:getRecentRouteCountForCity";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_route_tableQueries$GetRecentRouteCountForCityWithSpecialStatusQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetRecentRouteCountForCityWithSpecialStatusQuery<T> extends Query<T> {
        public final String b;
        public final String c;
        public final RecentsSpecialEntityStatus d;
        public final /* synthetic */ Recent_route_tableQueries e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetRecentRouteCountForCityWithSpecialStatusQuery(Recent_route_tableQueries recent_route_tableQueries, String route_id, String city_id, RecentsSpecialEntityStatus recents_special_entity_status, e01 e01Var) {
            super(e01Var);
            Intrinsics.i(route_id, "route_id");
            Intrinsics.i(city_id, "city_id");
            Intrinsics.i(recents_special_entity_status, "recents_special_entity_status");
            this.e = recent_route_tableQueries;
            this.b = route_id;
            this.c = city_id;
            this.d = recents_special_entity_status;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            Recent_route_tableQueries recent_route_tableQueries = this.e;
            return recent_route_tableQueries.f697a.P(-706919961, "SELECT COUNT(*) FROM recent_route_table\nWHERE route_id = ? AND city_id = ? AND recents_special_entity_status = ?", function1, 3, new d(7, this, recent_route_tableQueries));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.e.f697a.h1(new String[]{"recent_route_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.e.f697a.P0(new String[]{"recent_route_table"}, listener);
        }

        public final String toString() {
            return "recent_route_table.sq:getRecentRouteCountForCityWithSpecialStatus";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_route_tableQueries$GetRecentRoutesFilteredByTransitModesSortedAscByAccessTimeForCityQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetRecentRoutesFilteredByTransitModesSortedAscByAccessTimeForCityQuery<T> extends Query<T> {
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
            return "recent_route_table.sq:getRecentRoutesFilteredByTransitModesSortedAscByAccessTimeForCity";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_route_tableQueries$GetRecentRoutesFilteredByTransitModesSortedDescByAccessTimeForCityQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetRecentRoutesFilteredByTransitModesSortedDescByAccessTimeForCityQuery<T> extends Query<T> {
        public final String b;
        public final Collection c;
        public final long d;
        public final /* synthetic */ Recent_route_tableQueries e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetRecentRoutesFilteredByTransitModesSortedDescByAccessTimeForCityQuery(Recent_route_tableQueries recent_route_tableQueries, String city_id, Collection transit_mode, long j, y01 y01Var) {
            super(y01Var);
            Intrinsics.i(city_id, "city_id");
            Intrinsics.i(transit_mode, "transit_mode");
            this.e = recent_route_tableQueries;
            this.b = city_id;
            this.c = transit_mode;
            this.d = j;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            Collection collection = this.c;
            String strS = BaseTransacterImpl.S(collection.size());
            Recent_route_tableQueries recent_route_tableQueries = this.e;
            return recent_route_tableQueries.f697a.P(null, StringsKt.y0("\n          |SELECT recent_route_table.route_id, recent_route_table.city_id, recent_route_table.route_name, recent_route_table.start_stop_name, recent_route_table.end_stop_name, recent_route_table.agency, recent_route_table.isAcBus, recent_route_table.special_feature_list, recent_route_table.is_free_ride_available, recent_route_table.transit_mode, recent_route_table.recents_special_entity_status, recent_route_table.access_time, recent_route_table.access_count, recent_route_table.via, recent_route_table.routeNamingScheme FROM recent_route_table\n          |WHERE city_id = ? AND transit_mode IN " + strS + "\n          |ORDER BY access_time DESC LIMIT ?\n          "), function1, collection.size() + 2, new d(9, this, recent_route_tableQueries));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.e.f697a.h1(new String[]{"recent_route_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.e.f697a.P0(new String[]{"recent_route_table"}, listener);
        }

        public final String toString() {
            return "recent_route_table.sq:getRecentRoutesFilteredByTransitModesSortedDescByAccessTimeForCity";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_route_tableQueries$GetRecentRoutesForSpecialStatusCountQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetRecentRoutesForSpecialStatusCountQuery<T> extends Query<T> {
        public final String b;
        public final RecentsSpecialEntityStatus c;
        public final /* synthetic */ Recent_route_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetRecentRoutesForSpecialStatusCountQuery(Recent_route_tableQueries recent_route_tableQueries, String city_id, RecentsSpecialEntityStatus recents_special_entity_status, e01 e01Var) {
            super(e01Var);
            Intrinsics.i(city_id, "city_id");
            Intrinsics.i(recents_special_entity_status, "recents_special_entity_status");
            this.d = recent_route_tableQueries;
            this.b = city_id;
            this.c = recents_special_entity_status;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            Recent_route_tableQueries recent_route_tableQueries = this.d;
            return recent_route_tableQueries.f697a.P(-1186554061, "SELECT COUNT(*) FROM recent_route_table WHERE (city_id = ? AND recents_special_entity_status = ?)", function1, 2, new d(10, this, recent_route_tableQueries));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"recent_route_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"recent_route_table"}, listener);
        }

        public final String toString() {
            return "recent_route_table.sq:getRecentRoutesForSpecialStatusCount";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_route_tableQueries$GetRecentRoutesSortedAscByAccessTimeForCityQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetRecentRoutesSortedAscByAccessTimeForCityQuery<T> extends Query<T> {
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
            return "recent_route_table.sq:getRecentRoutesSortedAscByAccessTimeForCity";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_route_tableQueries$GetRecentRoutesSortedDescByAccessTimeForCityQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetRecentRoutesSortedDescByAccessTimeForCityQuery<T> extends Query<T> {
        public final String b;
        public final long c;
        public final /* synthetic */ Recent_route_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetRecentRoutesSortedDescByAccessTimeForCityQuery(Recent_route_tableQueries recent_route_tableQueries, String city_id, long j, y01 y01Var) {
            super(y01Var);
            Intrinsics.i(city_id, "city_id");
            this.d = recent_route_tableQueries;
            this.b = city_id;
            this.c = j;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.d.f697a.P(-301449308, "SELECT recent_route_table.route_id, recent_route_table.city_id, recent_route_table.route_name, recent_route_table.start_stop_name, recent_route_table.end_stop_name, recent_route_table.agency, recent_route_table.isAcBus, recent_route_table.special_feature_list, recent_route_table.is_free_ride_available, recent_route_table.transit_mode, recent_route_table.recents_special_entity_status, recent_route_table.access_time, recent_route_table.access_count, recent_route_table.via, recent_route_table.routeNamingScheme FROM recent_route_table\nWHERE city_id = ?\nORDER BY access_time DESC LIMIT ?", function1, 2, new c(this, 5));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"recent_route_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"recent_route_table"}, listener);
        }

        public final String toString() {
            return "recent_route_table.sq:getRecentRoutesSortedDescByAccessTimeForCity";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_route_tableQueries$GetRouteCityItineraryItemCountForCityQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetRouteCityItineraryItemCountForCityQuery<T> extends Query<T> {
        public final String b;
        public final /* synthetic */ Recent_route_tableQueries c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetRouteCityItineraryItemCountForCityQuery(Recent_route_tableQueries recent_route_tableQueries, String city_id, e01 e01Var) {
            super(e01Var);
            Intrinsics.i(city_id, "city_id");
            this.c = recent_route_tableQueries;
            this.b = city_id;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.c.f697a.P(-2129685820, "SELECT COUNT(*) FROM recent_route_table WHERE city_id = ?", function1, 1, new c(this, 6));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.c.f697a.h1(new String[]{"recent_route_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.c.f697a.P0(new String[]{"recent_route_table"}, listener);
        }

        public final String toString() {
            return "recent_route_table.sq:getRouteCityItineraryItemCountForCity";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_route_tableQueries$GetRouteCityItineraryQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetRouteCityItineraryQuery<T> extends Query<T> {
        public final String b;
        public final String c;
        public final /* synthetic */ Recent_route_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetRouteCityItineraryQuery(Recent_route_tableQueries recent_route_tableQueries, String route_id, String city_id, y01 y01Var) {
            super(y01Var);
            Intrinsics.i(route_id, "route_id");
            Intrinsics.i(city_id, "city_id");
            this.d = recent_route_tableQueries;
            this.b = route_id;
            this.c = city_id;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.d.f697a.P(1156417068, "SELECT recent_route_table.route_id, recent_route_table.city_id, recent_route_table.route_name, recent_route_table.start_stop_name, recent_route_table.end_stop_name, recent_route_table.agency, recent_route_table.isAcBus, recent_route_table.special_feature_list, recent_route_table.is_free_ride_available, recent_route_table.transit_mode, recent_route_table.recents_special_entity_status, recent_route_table.access_time, recent_route_table.access_count, recent_route_table.via, recent_route_table.routeNamingScheme FROM recent_route_table WHERE route_id = ? AND city_id = ?", function1, 2, new c(this, 7));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"recent_route_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"recent_route_table"}, listener);
        }

        public final String toString() {
            return "recent_route_table.sq:getRouteCityItinerary";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_route_tableQueries$GetSortedByMostRecentAccessForCityQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetSortedByMostRecentAccessForCityQuery<T> extends Query<T> {
        public final String b;
        public final /* synthetic */ Recent_route_tableQueries c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetSortedByMostRecentAccessForCityQuery(Recent_route_tableQueries recent_route_tableQueries, String city_id, y01 y01Var) {
            super(y01Var);
            Intrinsics.i(city_id, "city_id");
            this.c = recent_route_tableQueries;
            this.b = city_id;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.c.f697a.P(103584297, "SELECT recent_route_table.route_id, recent_route_table.city_id, recent_route_table.route_name, recent_route_table.start_stop_name, recent_route_table.end_stop_name, recent_route_table.agency, recent_route_table.isAcBus, recent_route_table.special_feature_list, recent_route_table.is_free_ride_available, recent_route_table.transit_mode, recent_route_table.recents_special_entity_status, recent_route_table.access_time, recent_route_table.access_count, recent_route_table.via, recent_route_table.routeNamingScheme FROM recent_route_table WHERE city_id = ? ORDER BY access_time DESC", function1, 1, new c(this, 8));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.c.f697a.h1(new String[]{"recent_route_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.c.f697a.P0(new String[]{"recent_route_table"}, listener);
        }

        public final String toString() {
            return "recent_route_table.sq:getSortedByMostRecentAccessForCity";
        }
    }

    public Recent_route_tableQueries(SqlDriver sqlDriver, Recent_route_table.Adapter adapter) {
        super(sqlDriver);
        this.b = adapter;
    }

    public final Query W(String city_id, Function15 function15) {
        Intrinsics.i(city_id, "city_id");
        return new GetAllRouteCityItineraryForCityQuery(this, city_id, new y01(function15, this, 4));
    }

    public final Query X(String city_id, RecentsSpecialEntityStatus recents_special_entity_status, Function15 function15) {
        Intrinsics.i(city_id, "city_id");
        Intrinsics.i(recents_special_entity_status, "recents_special_entity_status");
        return new GetAllRouteCityItineraryForCityWithSpecialStatusQuery(this, city_id, recents_special_entity_status, new y01(function15, this, 6));
    }

    public final Query Y(String city_id, RecentsSpecialEntityStatus recents_special_entity_status, long j, Function15 function15) {
        Intrinsics.i(city_id, "city_id");
        Intrinsics.i(recents_special_entity_status, "recents_special_entity_status");
        return new GetNewestRecentRoutesWithSpecialStatusForCityQuery(this, city_id, recents_special_entity_status, j, new y01(function15, this, 5));
    }

    public final Query Z(String city_id, RecentsSpecialEntityStatus recents_special_entity_status, long j, Function15 function15) {
        Intrinsics.i(city_id, "city_id");
        Intrinsics.i(recents_special_entity_status, "recents_special_entity_status");
        return new GetOldestRecentRoutesWithSpecialStatusForCityQuery(this, city_id, recents_special_entity_status, j, new y01(function15, this, 3));
    }

    public final Query a0(String route_id, String city_id) {
        Intrinsics.i(route_id, "route_id");
        Intrinsics.i(city_id, "city_id");
        return new GetRecentRouteCountForCityQuery(this, route_id, city_id, new e01(28));
    }

    public final Query b0(String route_id, String city_id, RecentsSpecialEntityStatus recents_special_entity_status) {
        Intrinsics.i(route_id, "route_id");
        Intrinsics.i(city_id, "city_id");
        Intrinsics.i(recents_special_entity_status, "recents_special_entity_status");
        return new GetRecentRouteCountForCityWithSpecialStatusQuery(this, route_id, city_id, recents_special_entity_status, new e01(22));
    }

    public final Query c0(String city_id, List transit_mode, long j, Function15 function15) {
        Intrinsics.i(city_id, "city_id");
        Intrinsics.i(transit_mode, "transit_mode");
        return new GetRecentRoutesFilteredByTransitModesSortedDescByAccessTimeForCityQuery(this, city_id, transit_mode, j, new y01(function15, this, 2));
    }

    public final Query d0(RecentsSpecialEntityStatus recents_special_entity_status, String city_id) {
        Intrinsics.i(city_id, "city_id");
        Intrinsics.i(recents_special_entity_status, "recents_special_entity_status");
        return new GetRecentRoutesForSpecialStatusCountQuery(this, city_id, recents_special_entity_status, new e01(20));
    }

    public final Query e0(String city_id, long j, Function15 function15) {
        Intrinsics.i(city_id, "city_id");
        return new GetRecentRoutesSortedDescByAccessTimeForCityQuery(this, city_id, j, new y01(function15, this, 1));
    }

    public final Query f0(String route_id, String city_id, Function15 function15) {
        Intrinsics.i(route_id, "route_id");
        Intrinsics.i(city_id, "city_id");
        return new GetRouteCityItineraryQuery(this, route_id, city_id, new y01(function15, this, 7));
    }

    public final Query g0(String city_id) {
        Intrinsics.i(city_id, "city_id");
        return new GetRouteCityItineraryItemCountForCityQuery(this, city_id, new e01(21));
    }

    public final Query h0(String city_id, Function15 function15) {
        Intrinsics.i(city_id, "city_id");
        return new GetSortedByMostRecentAccessForCityQuery(this, city_id, new y01(function15, this, 0));
    }
}
