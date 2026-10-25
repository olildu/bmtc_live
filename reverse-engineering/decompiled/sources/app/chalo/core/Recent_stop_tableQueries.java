package app.chalo.core;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import app.chalo.recent.database.entities.RecentsSpecialEntityStatus;
import defpackage.c11;
import defpackage.i40;
import defpackage.z01;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lapp/chalo/core/Recent_stop_tableQueries;", "Lapp/cash/sqldelight/TransacterImpl;", "GetStopCityItinerarySortedDescQuery", "GetStopCityItinerarySortedAscQuery", "GetStopCityItinerarySortedDescWithoutLimitQuery", "GetStopCityItinerarySortedAscWithoutLimitQuery", "GetOldestStopCityItineraryWithSpecialStatusQuery", "GetRecentStopEntryCountWithSpecialStatusForCityQuery", "GetRecentStopCityItineraryQuery", "GetRecentStopCountForCityQuery", "GetRecentStopCityItineraryForCityQuery", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Recent_stop_tableQueries extends TransacterImpl {
    public final Recent_stop_table.Adapter b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_stop_tableQueries$GetOldestStopCityItineraryWithSpecialStatusQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetOldestStopCityItineraryWithSpecialStatusQuery<T> extends Query<T> {
        public final String b;
        public final RecentsSpecialEntityStatus c;
        public final long d;
        public final /* synthetic */ Recent_stop_tableQueries e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetOldestStopCityItineraryWithSpecialStatusQuery(Recent_stop_tableQueries recent_stop_tableQueries, String city_id, RecentsSpecialEntityStatus recents_special_entity_status, long j, c11 c11Var) {
            super(c11Var);
            Intrinsics.i(city_id, "city_id");
            Intrinsics.i(recents_special_entity_status, "recents_special_entity_status");
            this.e = recent_stop_tableQueries;
            this.b = city_id;
            this.c = recents_special_entity_status;
            this.d = j;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            Recent_stop_tableQueries recent_stop_tableQueries = this.e;
            return recent_stop_tableQueries.f697a.P(-95358408, "SELECT recent_stop_table.stop_id, recent_stop_table.city_id, recent_stop_table.stop, recent_stop_table.recents_special_entity_status, recent_stop_table.access_time, recent_stop_table.access_count, recent_stop_table.label FROM recent_stop_table WHERE city_id = ? AND recents_special_entity_status = ? ORDER BY access_time ASC LIMIT ?", function1, 3, new d(15, this, recent_stop_tableQueries));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.e.f697a.h1(new String[]{"recent_stop_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.e.f697a.P0(new String[]{"recent_stop_table"}, listener);
        }

        public final String toString() {
            return "recent_stop_table.sq:getOldestStopCityItineraryWithSpecialStatus";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_stop_tableQueries$GetRecentStopCityItineraryForCityQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetRecentStopCityItineraryForCityQuery<T> extends Query<T> {
        public final RecentsSpecialEntityStatus b;
        public final String c;
        public final /* synthetic */ Recent_stop_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetRecentStopCityItineraryForCityQuery(Recent_stop_tableQueries recent_stop_tableQueries, RecentsSpecialEntityStatus recents_special_entity_status, String city_id, c11 c11Var) {
            super(c11Var);
            Intrinsics.i(recents_special_entity_status, "recents_special_entity_status");
            Intrinsics.i(city_id, "city_id");
            this.d = recent_stop_tableQueries;
            this.b = recents_special_entity_status;
            this.c = city_id;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            Recent_stop_tableQueries recent_stop_tableQueries = this.d;
            return recent_stop_tableQueries.f697a.P(595417411, "SELECT recent_stop_table.stop_id, recent_stop_table.city_id, recent_stop_table.stop, recent_stop_table.recents_special_entity_status, recent_stop_table.access_time, recent_stop_table.access_count, recent_stop_table.label FROM recent_stop_table WHERE recents_special_entity_status = ? AND city_id = ?", function1, 2, new d(16, recent_stop_tableQueries, this));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"recent_stop_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"recent_stop_table"}, listener);
        }

        public final String toString() {
            return "recent_stop_table.sq:getRecentStopCityItineraryForCity";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_stop_tableQueries$GetRecentStopCityItineraryQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetRecentStopCityItineraryQuery<T> extends Query<T> {
        public final String b;
        public final String c;
        public final /* synthetic */ Recent_stop_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetRecentStopCityItineraryQuery(Recent_stop_tableQueries recent_stop_tableQueries, String stop_id, String city_id, c11 c11Var) {
            super(c11Var);
            Intrinsics.i(stop_id, "stop_id");
            Intrinsics.i(city_id, "city_id");
            this.d = recent_stop_tableQueries;
            this.b = stop_id;
            this.c = city_id;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.d.f697a.P(1489346385, "SELECT recent_stop_table.stop_id, recent_stop_table.city_id, recent_stop_table.stop, recent_stop_table.recents_special_entity_status, recent_stop_table.access_time, recent_stop_table.access_count, recent_stop_table.label FROM recent_stop_table WHERE stop_id = ? AND city_id = ?", function1, 2, new c(this, 17));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"recent_stop_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"recent_stop_table"}, listener);
        }

        public final String toString() {
            return "recent_stop_table.sq:getRecentStopCityItinerary";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_stop_tableQueries$GetRecentStopCountForCityQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetRecentStopCountForCityQuery<T> extends Query<T> {
        public final String b;
        public final /* synthetic */ Recent_stop_tableQueries c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetRecentStopCountForCityQuery(Recent_stop_tableQueries recent_stop_tableQueries, String city_id, z01 z01Var) {
            super(z01Var);
            Intrinsics.i(city_id, "city_id");
            this.c = recent_stop_tableQueries;
            this.b = city_id;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.c.f697a.P(430818356, "SELECT COUNT(*) FROM recent_stop_table WHERE city_id = ?", function1, 1, new c(this, 18));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.c.f697a.h1(new String[]{"recent_stop_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.c.f697a.P0(new String[]{"recent_stop_table"}, listener);
        }

        public final String toString() {
            return "recent_stop_table.sq:getRecentStopCountForCity";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_stop_tableQueries$GetRecentStopEntryCountWithSpecialStatusForCityQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetRecentStopEntryCountWithSpecialStatusForCityQuery<T> extends Query<T> {
        public final RecentsSpecialEntityStatus b;
        public final String c;
        public final /* synthetic */ Recent_stop_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetRecentStopEntryCountWithSpecialStatusForCityQuery(Recent_stop_tableQueries recent_stop_tableQueries, RecentsSpecialEntityStatus recents_special_entity_status, String city_id, z01 z01Var) {
            super(z01Var);
            Intrinsics.i(recents_special_entity_status, "recents_special_entity_status");
            Intrinsics.i(city_id, "city_id");
            this.d = recent_stop_tableQueries;
            this.b = recents_special_entity_status;
            this.c = city_id;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            Recent_stop_tableQueries recent_stop_tableQueries = this.d;
            return recent_stop_tableQueries.f697a.P(344160571, "SELECT COUNT(*) FROM recent_stop_table WHERE recents_special_entity_status = ? AND city_id = ?", function1, 2, new d(17, recent_stop_tableQueries, this));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"recent_stop_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"recent_stop_table"}, listener);
        }

        public final String toString() {
            return "recent_stop_table.sq:getRecentStopEntryCountWithSpecialStatusForCity";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_stop_tableQueries$GetStopCityItinerarySortedAscQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetStopCityItinerarySortedAscQuery<T> extends Query<T> {
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
            return "recent_stop_table.sq:getStopCityItinerarySortedAsc";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_stop_tableQueries$GetStopCityItinerarySortedAscWithoutLimitQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetStopCityItinerarySortedAscWithoutLimitQuery<T> extends Query<T> {
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
            return "recent_stop_table.sq:getStopCityItinerarySortedAscWithoutLimit";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_stop_tableQueries$GetStopCityItinerarySortedDescQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetStopCityItinerarySortedDescQuery<T> extends Query<T> {
        public final String b;
        public final long c;
        public final /* synthetic */ Recent_stop_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetStopCityItinerarySortedDescQuery(Recent_stop_tableQueries recent_stop_tableQueries, String city_id, long j, c11 c11Var) {
            super(c11Var);
            Intrinsics.i(city_id, "city_id");
            this.d = recent_stop_tableQueries;
            this.b = city_id;
            this.c = j;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.d.f697a.P(1772204794, "SELECT recent_stop_table.stop_id, recent_stop_table.city_id, recent_stop_table.stop, recent_stop_table.recents_special_entity_status, recent_stop_table.access_time, recent_stop_table.access_count, recent_stop_table.label FROM recent_stop_table WHERE city_id = ? ORDER BY access_time DESC LIMIT ?", function1, 2, new c(this, 21));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"recent_stop_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"recent_stop_table"}, listener);
        }

        public final String toString() {
            return "recent_stop_table.sq:getStopCityItinerarySortedDesc";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_stop_tableQueries$GetStopCityItinerarySortedDescWithoutLimitQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetStopCityItinerarySortedDescWithoutLimitQuery<T> extends Query<T> {
        public final String b;
        public final /* synthetic */ Recent_stop_tableQueries c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetStopCityItinerarySortedDescWithoutLimitQuery(Recent_stop_tableQueries recent_stop_tableQueries, String city_id, c11 c11Var) {
            super(c11Var);
            Intrinsics.i(city_id, "city_id");
            this.c = recent_stop_tableQueries;
            this.b = city_id;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.c.f697a.P(-1526073363, "SELECT recent_stop_table.stop_id, recent_stop_table.city_id, recent_stop_table.stop, recent_stop_table.recents_special_entity_status, recent_stop_table.access_time, recent_stop_table.access_count, recent_stop_table.label FROM recent_stop_table WHERE city_id = ? ORDER BY access_time DESC", function1, 1, new c(this, 22));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.c.f697a.h1(new String[]{"recent_stop_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.c.f697a.P0(new String[]{"recent_stop_table"}, listener);
        }

        public final String toString() {
            return "recent_stop_table.sq:getStopCityItinerarySortedDescWithoutLimit";
        }
    }

    public Recent_stop_tableQueries(SqlDriver sqlDriver, Recent_stop_table.Adapter adapter) {
        super(sqlDriver);
        this.b = adapter;
    }

    public final Query W(String city_id, RecentsSpecialEntityStatus recents_special_entity_status, long j, Function7 function7) {
        Intrinsics.i(city_id, "city_id");
        Intrinsics.i(recents_special_entity_status, "recents_special_entity_status");
        return new GetOldestStopCityItineraryWithSpecialStatusQuery(this, city_id, recents_special_entity_status, j, new c11(function7, this, 1));
    }

    public final Query X(String stop_id, String city_id, Function7 function7) {
        Intrinsics.i(stop_id, "stop_id");
        Intrinsics.i(city_id, "city_id");
        return new GetRecentStopCityItineraryQuery(this, stop_id, city_id, new c11(function7, this, 0));
    }

    public final Query Y(RecentsSpecialEntityStatus recents_special_entity_status, String city_id, Function7 function7) {
        Intrinsics.i(recents_special_entity_status, "recents_special_entity_status");
        Intrinsics.i(city_id, "city_id");
        return new GetRecentStopCityItineraryForCityQuery(this, recents_special_entity_status, city_id, new c11(function7, this, 4));
    }

    public final Query Z(String city_id) {
        Intrinsics.i(city_id, "city_id");
        return new GetRecentStopCountForCityQuery(this, city_id, new z01(20));
    }

    public final Query a0(RecentsSpecialEntityStatus recents_special_entity_status, String city_id) {
        Intrinsics.i(recents_special_entity_status, "recents_special_entity_status");
        Intrinsics.i(city_id, "city_id");
        return new GetRecentStopEntryCountWithSpecialStatusForCityQuery(this, recents_special_entity_status, city_id, new z01(14));
    }

    public final Query b0(String city_id, long j, Function7 function7) {
        Intrinsics.i(city_id, "city_id");
        return new GetStopCityItinerarySortedDescQuery(this, city_id, j, new c11(function7, this, 2));
    }

    public final Query c0(String city_id, Function7 function7) {
        Intrinsics.i(city_id, "city_id");
        return new GetStopCityItinerarySortedDescWithoutLimitQuery(this, city_id, new c11(function7, this, 3));
    }
}
