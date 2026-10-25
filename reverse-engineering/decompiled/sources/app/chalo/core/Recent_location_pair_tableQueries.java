package app.chalo.core;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import defpackage.e01;
import defpackage.i40;
import defpackage.w01;
import defpackage.yp1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/core/Recent_location_pair_tableQueries;", "Lapp/cash/sqldelight/TransacterImpl;", "GetAllLocationPairsForCityQuery", "GetLocationPairsForCityOldestToNewestQuery", "GetLocationPairsForCityNewestToOldestQuery", "GetLocationPairQuery", "GetCountForCityQuery", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Recent_location_pair_tableQueries extends TransacterImpl {
    public final Recent_location_pair_table.Adapter b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_location_pair_tableQueries$GetAllLocationPairsForCityQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllLocationPairsForCityQuery<T> extends Query<T> {
        public final /* synthetic */ Recent_location_pair_tableQueries b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetAllLocationPairsForCityQuery(Recent_location_pair_tableQueries recent_location_pair_tableQueries, w01 w01Var) {
            super(w01Var);
            Intrinsics.i(null, "city_id");
            this.b = recent_location_pair_tableQueries;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.b.f697a.P(-1391188041, "SELECT recent_location_pair_table.pair_id, recent_location_pair_table.city_id, recent_location_pair_table.from_endpoint, recent_location_pair_table.to_endpoint, recent_location_pair_table.access_time, recent_location_pair_table.access_count FROM recent_location_pair_table WHERE city_id = ? ORDER BY access_time DESC", function1, 1, new yp1(this, 9));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.b.f697a.h1(new String[]{"recent_location_pair_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.b.f697a.P0(new String[]{"recent_location_pair_table"}, listener);
        }

        public final String toString() {
            return "recent_location_pair_table.sq:getAllLocationPairsForCity";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_location_pair_tableQueries$GetCountForCityQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetCountForCityQuery<T> extends Query<T> {
        public final String b;
        public final /* synthetic */ Recent_location_pair_tableQueries c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetCountForCityQuery(Recent_location_pair_tableQueries recent_location_pair_tableQueries, String city_id, e01 e01Var) {
            super(e01Var);
            Intrinsics.i(city_id, "city_id");
            this.c = recent_location_pair_tableQueries;
            this.b = city_id;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.c.f697a.P(-950933473, "SELECT COUNT(*) FROM recent_location_pair_table WHERE city_id = ?", function1, 1, new b(this, 25));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.c.f697a.h1(new String[]{"recent_location_pair_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.c.f697a.P0(new String[]{"recent_location_pair_table"}, listener);
        }

        public final String toString() {
            return "recent_location_pair_table.sq:getCountForCity";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_location_pair_tableQueries$GetLocationPairQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetLocationPairQuery<T> extends Query<T> {
        public final String b;
        public final String c;
        public final /* synthetic */ Recent_location_pair_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetLocationPairQuery(Recent_location_pair_tableQueries recent_location_pair_tableQueries, String pair_id, String city_id, w01 w01Var) {
            super(w01Var);
            Intrinsics.i(pair_id, "pair_id");
            Intrinsics.i(city_id, "city_id");
            this.d = recent_location_pair_tableQueries;
            this.b = pair_id;
            this.c = city_id;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.d.f697a.P(-1825266039, "SELECT recent_location_pair_table.pair_id, recent_location_pair_table.city_id, recent_location_pair_table.from_endpoint, recent_location_pair_table.to_endpoint, recent_location_pair_table.access_time, recent_location_pair_table.access_count FROM recent_location_pair_table WHERE pair_id = ? AND city_id = ?", function1, 2, new b(this, 26));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"recent_location_pair_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"recent_location_pair_table"}, listener);
        }

        public final String toString() {
            return "recent_location_pair_table.sq:getLocationPair";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_location_pair_tableQueries$GetLocationPairsForCityNewestToOldestQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetLocationPairsForCityNewestToOldestQuery<T> extends Query<T> {
        public final String b;
        public final long c;
        public final /* synthetic */ Recent_location_pair_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetLocationPairsForCityNewestToOldestQuery(Recent_location_pair_tableQueries recent_location_pair_tableQueries, String city_id, long j, w01 w01Var) {
            super(w01Var);
            Intrinsics.i(city_id, "city_id");
            this.d = recent_location_pair_tableQueries;
            this.b = city_id;
            this.c = j;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.d.f697a.P(695355498, "SELECT recent_location_pair_table.pair_id, recent_location_pair_table.city_id, recent_location_pair_table.from_endpoint, recent_location_pair_table.to_endpoint, recent_location_pair_table.access_time, recent_location_pair_table.access_count FROM recent_location_pair_table WHERE city_id = ? ORDER BY access_time DESC LIMIT ?", function1, 2, new b(this, 27));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"recent_location_pair_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"recent_location_pair_table"}, listener);
        }

        public final String toString() {
            return "recent_location_pair_table.sq:getLocationPairsForCityNewestToOldest";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Recent_location_pair_tableQueries$GetLocationPairsForCityOldestToNewestQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetLocationPairsForCityOldestToNewestQuery<T> extends Query<T> {
        public final String b;
        public final long c;
        public final /* synthetic */ Recent_location_pair_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetLocationPairsForCityOldestToNewestQuery(Recent_location_pair_tableQueries recent_location_pair_tableQueries, String city_id, long j, w01 w01Var) {
            super(w01Var);
            Intrinsics.i(city_id, "city_id");
            this.d = recent_location_pair_tableQueries;
            this.b = city_id;
            this.c = j;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.d.f697a.P(-56156310, "SELECT recent_location_pair_table.pair_id, recent_location_pair_table.city_id, recent_location_pair_table.from_endpoint, recent_location_pair_table.to_endpoint, recent_location_pair_table.access_time, recent_location_pair_table.access_count FROM recent_location_pair_table WHERE city_id = ? ORDER BY access_time LIMIT ?", function1, 2, new b(this, 28));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"recent_location_pair_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"recent_location_pair_table"}, listener);
        }

        public final String toString() {
            return "recent_location_pair_table.sq:getLocationPairsForCityOldestToNewest";
        }
    }

    public Recent_location_pair_tableQueries(SqlDriver sqlDriver, Recent_location_pair_table.Adapter adapter) {
        super(sqlDriver);
        this.b = adapter;
    }

    public final Query W(Function6 function6) {
        Intrinsics.i(null, "city_id");
        return new GetAllLocationPairsForCityQuery(this, new w01(function6, this, 3));
    }

    public final Query X(String city_id) {
        Intrinsics.i(city_id, "city_id");
        return new GetCountForCityQuery(this, city_id, new e01(10));
    }

    public final Query Y(String pair_id, String city_id, Function6 function6) {
        Intrinsics.i(pair_id, "pair_id");
        Intrinsics.i(city_id, "city_id");
        return new GetLocationPairQuery(this, pair_id, city_id, new w01(function6, this, 1));
    }

    public final Query Z(String city_id, long j, Function6 function6) {
        Intrinsics.i(city_id, "city_id");
        return new GetLocationPairsForCityNewestToOldestQuery(this, city_id, j, new w01(function6, this, 0));
    }

    public final Query a0(String city_id, long j, Function6 function6) {
        Intrinsics.i(city_id, "city_id");
        return new GetLocationPairsForCityOldestToNewestQuery(this, city_id, j, new w01(function6, this, 2));
    }
}
