package app.chalo.core;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import app.chalo.recent.database.entities.RecentsSpecialEntityStatus;
import defpackage.e01;
import defpackage.i40;
import defpackage.x01;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/core/Recent_place_tableQueries;", "Lapp/cash/sqldelight/TransacterImpl;", "GetRecentPlaceCityItineraryForCityQuery", "GetAllPlacesCityItineraryForCitySortedDescQuery", "GetAllPlacesCityItineraryForCitySortedAscQuery", "GetOldestRecentPlacesWithSpecialStatusForCityQuery", "GetRecentPlacesForSpecialStatusCountQuery", "GetRecentPlaceCityItineraryWithSpecialStatusForCityQuery", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Recent_place_tableQueries extends TransacterImpl {
    public final Recent_place_table.Adapter b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_place_tableQueries$GetAllPlacesCityItineraryForCitySortedAscQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllPlacesCityItineraryForCitySortedAscQuery<T> extends Query<T> {
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
            return "recent_place_table.sq:getAllPlacesCityItineraryForCitySortedAsc";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_place_tableQueries$GetAllPlacesCityItineraryForCitySortedDescQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllPlacesCityItineraryForCitySortedDescQuery<T> extends Query<T> {
        public final String b;
        public final long c;
        public final /* synthetic */ Recent_place_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetAllPlacesCityItineraryForCitySortedDescQuery(Recent_place_tableQueries recent_place_tableQueries, String city_id, long j, x01 x01Var) {
            super(x01Var);
            Intrinsics.i(city_id, "city_id");
            this.d = recent_place_tableQueries;
            this.b = city_id;
            this.c = j;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.d.f697a.P(-408162984, "SELECT recent_place_table.place_id, recent_place_table.search_partner, recent_place_table.city_id, recent_place_table.location_description, recent_place_table.location_title, recent_place_table.lat_lng, recent_place_table.recents_special_entity_status, recent_place_table.access_time, recent_place_table.access_count, recent_place_table.label FROM recent_place_table WHERE city_id = ? ORDER BY access_time DESC LIMIT ?", function1, 2, new c(this, 0));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"recent_place_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"recent_place_table"}, listener);
        }

        public final String toString() {
            return "recent_place_table.sq:getAllPlacesCityItineraryForCitySortedDesc";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_place_tableQueries$GetOldestRecentPlacesWithSpecialStatusForCityQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetOldestRecentPlacesWithSpecialStatusForCityQuery<T> extends Query<T> {
        public final String b;
        public final RecentsSpecialEntityStatus c;
        public final long d;
        public final /* synthetic */ Recent_place_tableQueries e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetOldestRecentPlacesWithSpecialStatusForCityQuery(Recent_place_tableQueries recent_place_tableQueries, String city_id, RecentsSpecialEntityStatus recents_special_entity_status, long j, x01 x01Var) {
            super(x01Var);
            Intrinsics.i(city_id, "city_id");
            Intrinsics.i(recents_special_entity_status, "recents_special_entity_status");
            this.e = recent_place_tableQueries;
            this.b = city_id;
            this.c = recents_special_entity_status;
            this.d = j;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            Recent_place_tableQueries recent_place_tableQueries = this.e;
            return recent_place_tableQueries.f697a.P(284426764, "SELECT recent_place_table.place_id, recent_place_table.search_partner, recent_place_table.city_id, recent_place_table.location_description, recent_place_table.location_title, recent_place_table.lat_lng, recent_place_table.recents_special_entity_status, recent_place_table.access_time, recent_place_table.access_count, recent_place_table.label FROM recent_place_table WHERE city_id = ? AND recents_special_entity_status = ? ORDER BY access_time ASC LIMIT ?", function1, 3, new d(0, this, recent_place_tableQueries));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.e.f697a.h1(new String[]{"recent_place_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.e.f697a.P0(new String[]{"recent_place_table"}, listener);
        }

        public final String toString() {
            return "recent_place_table.sq:getOldestRecentPlacesWithSpecialStatusForCity";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_place_tableQueries$GetRecentPlaceCityItineraryForCityQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetRecentPlaceCityItineraryForCityQuery<T> extends Query<T> {
        public final String b;
        public final String c;
        public final /* synthetic */ Recent_place_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetRecentPlaceCityItineraryForCityQuery(Recent_place_tableQueries recent_place_tableQueries, String place_id, String city_id, x01 x01Var) {
            super(x01Var);
            Intrinsics.i(place_id, "place_id");
            Intrinsics.i(city_id, "city_id");
            this.d = recent_place_tableQueries;
            this.b = place_id;
            this.c = city_id;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.d.f697a.P(-1497975511, "SELECT recent_place_table.place_id, recent_place_table.search_partner, recent_place_table.city_id, recent_place_table.location_description, recent_place_table.location_title, recent_place_table.lat_lng, recent_place_table.recents_special_entity_status, recent_place_table.access_time, recent_place_table.access_count, recent_place_table.label FROM recent_place_table WHERE place_id = ? AND city_id = ?", function1, 2, new c(this, 1));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"recent_place_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"recent_place_table"}, listener);
        }

        public final String toString() {
            return "recent_place_table.sq:getRecentPlaceCityItineraryForCity";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_place_tableQueries$GetRecentPlaceCityItineraryWithSpecialStatusForCityQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetRecentPlaceCityItineraryWithSpecialStatusForCityQuery<T> extends Query<T> {
        public final RecentsSpecialEntityStatus b;
        public final String c;
        public final /* synthetic */ Recent_place_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetRecentPlaceCityItineraryWithSpecialStatusForCityQuery(Recent_place_tableQueries recent_place_tableQueries, RecentsSpecialEntityStatus recents_special_entity_status, String city_id, x01 x01Var) {
            super(x01Var);
            Intrinsics.i(recents_special_entity_status, "recents_special_entity_status");
            Intrinsics.i(city_id, "city_id");
            this.d = recent_place_tableQueries;
            this.b = recents_special_entity_status;
            this.c = city_id;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            Recent_place_tableQueries recent_place_tableQueries = this.d;
            return recent_place_tableQueries.f697a.P(-2118379398, "SELECT recent_place_table.place_id, recent_place_table.search_partner, recent_place_table.city_id, recent_place_table.location_description, recent_place_table.location_title, recent_place_table.lat_lng, recent_place_table.recents_special_entity_status, recent_place_table.access_time, recent_place_table.access_count, recent_place_table.label FROM recent_place_table WHERE recents_special_entity_status = ? AND city_id = ?", function1, 2, new d(recent_place_tableQueries, this));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"recent_place_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"recent_place_table"}, listener);
        }

        public final String toString() {
            return "recent_place_table.sq:getRecentPlaceCityItineraryWithSpecialStatusForCity";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_place_tableQueries$GetRecentPlacesForSpecialStatusCountQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetRecentPlacesForSpecialStatusCountQuery<T> extends Query<T> {
        public final String b;
        public final RecentsSpecialEntityStatus c;
        public final /* synthetic */ Recent_place_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetRecentPlacesForSpecialStatusCountQuery(Recent_place_tableQueries recent_place_tableQueries, String city_id, RecentsSpecialEntityStatus recents_special_entity_status, e01 e01Var) {
            super(e01Var);
            Intrinsics.i(city_id, "city_id");
            Intrinsics.i(recents_special_entity_status, "recents_special_entity_status");
            this.d = recent_place_tableQueries;
            this.b = city_id;
            this.c = recents_special_entity_status;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            Recent_place_tableQueries recent_place_tableQueries = this.d;
            return recent_place_tableQueries.f697a.P(133172655, "SELECT COUNT(*) FROM recent_place_table WHERE (city_id = ? AND recents_special_entity_status = ?)", function1, 2, new d(2, this, recent_place_tableQueries));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"recent_place_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"recent_place_table"}, listener);
        }

        public final String toString() {
            return "recent_place_table.sq:getRecentPlacesForSpecialStatusCount";
        }
    }

    public Recent_place_tableQueries(SqlDriver sqlDriver, Recent_place_table.Adapter adapter) {
        super(sqlDriver);
        this.b = adapter;
    }

    public final Query W(String city_id, long j, Function10 function10) {
        Intrinsics.i(city_id, "city_id");
        return new GetAllPlacesCityItineraryForCitySortedDescQuery(this, city_id, j, new x01(function10, this, 1));
    }

    public final Query X(String city_id, RecentsSpecialEntityStatus recents_special_entity_status, long j, Function10 function10) {
        Intrinsics.i(city_id, "city_id");
        Intrinsics.i(recents_special_entity_status, "recents_special_entity_status");
        return new GetOldestRecentPlacesWithSpecialStatusForCityQuery(this, city_id, recents_special_entity_status, j, new x01(function10, this, 3));
    }

    public final Query Y(String place_id, String city_id, Function10 function10) {
        Intrinsics.i(place_id, "place_id");
        Intrinsics.i(city_id, "city_id");
        return new GetRecentPlaceCityItineraryForCityQuery(this, place_id, city_id, new x01(function10, this, 0));
    }

    public final Query Z(RecentsSpecialEntityStatus recents_special_entity_status, String city_id, Function10 function10) {
        Intrinsics.i(recents_special_entity_status, "recents_special_entity_status");
        Intrinsics.i(city_id, "city_id");
        return new GetRecentPlaceCityItineraryWithSpecialStatusForCityQuery(this, recents_special_entity_status, city_id, new x01(function10, this, 2));
    }

    public final Query a0(RecentsSpecialEntityStatus recents_special_entity_status, String city_id) {
        Intrinsics.i(city_id, "city_id");
        Intrinsics.i(recents_special_entity_status, "recents_special_entity_status");
        return new GetRecentPlacesForSpecialStatusCountQuery(this, city_id, recents_special_entity_status, new e01(18));
    }
}
