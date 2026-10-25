package app.chalo.core;

import app.cash.sqldelight.BaseTransacterImpl;
import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import defpackage.f41;
import defpackage.g41;
import defpackage.i40;
import defpackage.ls;
import defpackage.r31;
import defpackage.t01;
import defpackage.xa;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/core/Routes_tableQueries;", "Lapp/cash/sqldelight/TransacterImpl;", "GetRouteQuery", "GetSimpleRouteDetailsQuery", "GetMostRecentRoutesWithIdAndVersionQuery", "GetRoutesWithIdAndVersionQuery", "GetVersionForRouteIdQuery", "GetRouteLiveDetailsAsFlowQuery", "GetAllRoutesForCityQuery", "GetSelectRoutesForCityQuery", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Routes_tableQueries extends TransacterImpl {
    public final Routes_table.Adapter b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Routes_tableQueries$GetAllRoutesForCityQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllRoutesForCityQuery<T> extends Query<T> {
        public final String b;
        public final /* synthetic */ Routes_tableQueries c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetAllRoutesForCityQuery(Routes_tableQueries routes_tableQueries, String cityId, f41 f41Var) {
            super(f41Var);
            Intrinsics.i(cityId, "cityId");
            this.c = routes_tableQueries;
            this.b = cityId;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.c.f697a.P(-1034283687, "SELECT routes_table.version, routes_table.cityId, routes_table.routeId, routes_table.routeName, routes_table.startStopName, routes_table.endStopName, routes_table.agencyName, routes_table.specialFeature, routes_table.lastAccessedTs, routes_table.createdAtTs, routes_table.routeLiveData, routes_table.detailedData, routes_table.via, routes_table.routeNamingScheme FROM routes_table WHERE cityId = ?", function1, 1, new e(this, 8));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.c.f697a.h1(new String[]{"routes_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.c.f697a.P0(new String[]{"routes_table"}, listener);
        }

        public final String toString() {
            return "routes_table.sq:getAllRoutesForCity";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Routes_tableQueries$GetMostRecentRoutesWithIdAndVersionQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetMostRecentRoutesWithIdAndVersionQuery<T> extends Query<T> {
        public final String b;
        public final /* synthetic */ Routes_tableQueries c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetMostRecentRoutesWithIdAndVersionQuery(Routes_tableQueries routes_tableQueries, String cityId, ls lsVar) {
            super(lsVar);
            Intrinsics.i(cityId, "cityId");
            this.c = routes_tableQueries;
            this.b = cityId;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.c.f697a.P(-2070661766, "SELECT version, routeId\nFROM routes_table\nWHERE cityId = ?\nORDER BY lastAccessedTs DESC", function1, 1, new e(this, 9));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.c.f697a.h1(new String[]{"routes_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.c.f697a.P0(new String[]{"routes_table"}, listener);
        }

        public final String toString() {
            return "routes_table.sq:getMostRecentRoutesWithIdAndVersion";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Routes_tableQueries$GetRouteLiveDetailsAsFlowQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetRouteLiveDetailsAsFlowQuery<T> extends Query<T> {
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
            return "routes_table.sq:getRouteLiveDetailsAsFlow";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Routes_tableQueries$GetRouteQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetRouteQuery<T> extends Query<T> {
        public final String b;
        public final String c;
        public final /* synthetic */ Routes_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetRouteQuery(Routes_tableQueries routes_tableQueries, String routeId, String cityId, f41 f41Var) {
            super(f41Var);
            Intrinsics.i(routeId, "routeId");
            Intrinsics.i(cityId, "cityId");
            this.d = routes_tableQueries;
            this.b = routeId;
            this.c = cityId;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.d.f697a.P(28719609, "SELECT routes_table.version, routes_table.cityId, routes_table.routeId, routes_table.routeName, routes_table.startStopName, routes_table.endStopName, routes_table.agencyName, routes_table.specialFeature, routes_table.lastAccessedTs, routes_table.createdAtTs, routes_table.routeLiveData, routes_table.detailedData, routes_table.via, routes_table.routeNamingScheme FROM routes_table WHERE routeId = ? AND cityId = ?", function1, 2, new e(this, 10));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"routes_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"routes_table"}, listener);
        }

        public final String toString() {
            return "routes_table.sq:getRoute";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Routes_tableQueries$GetRoutesWithIdAndVersionQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetRoutesWithIdAndVersionQuery<T> extends Query<T> {
        public final String b;
        public final /* synthetic */ Routes_tableQueries c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetRoutesWithIdAndVersionQuery(Routes_tableQueries routes_tableQueries, String cityId, ls lsVar) {
            super(lsVar);
            Intrinsics.i(cityId, "cityId");
            this.c = routes_tableQueries;
            this.b = cityId;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.c.f697a.P(-1357893604, "SELECT version, routeId\nFROM routes_table\nWHERE cityId = ?", function1, 1, new e(this, 11));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.c.f697a.h1(new String[]{"routes_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.c.f697a.P0(new String[]{"routes_table"}, listener);
        }

        public final String toString() {
            return "routes_table.sq:getRoutesWithIdAndVersion";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Routes_tableQueries$GetSelectRoutesForCityQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetSelectRoutesForCityQuery<T> extends Query<T> {
        public final String b;
        public final Collection c;
        public final /* synthetic */ Routes_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetSelectRoutesForCityQuery(Routes_tableQueries routes_tableQueries, String cityId, Collection routeId, f41 f41Var) {
            super(f41Var);
            Intrinsics.i(cityId, "cityId");
            Intrinsics.i(routeId, "routeId");
            this.d = routes_tableQueries;
            this.b = cityId;
            this.c = routeId;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            Collection collection = this.c;
            return this.d.f697a.P(null, "SELECT routes_table.version, routes_table.cityId, routes_table.routeId, routes_table.routeName, routes_table.startStopName, routes_table.endStopName, routes_table.agencyName, routes_table.specialFeature, routes_table.lastAccessedTs, routes_table.createdAtTs, routes_table.routeLiveData, routes_table.detailedData, routes_table.via, routes_table.routeNamingScheme FROM routes_table WHERE cityId = ? AND routeId IN ".concat(BaseTransacterImpl.S(collection.size())), function1, collection.size() + 1, new e(this, 12));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"routes_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"routes_table"}, listener);
        }

        public final String toString() {
            return "routes_table.sq:getSelectRoutesForCity";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Routes_tableQueries$GetSimpleRouteDetailsQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetSimpleRouteDetailsQuery<T> extends Query<T> {
        public final String b;
        public final String c;
        public final /* synthetic */ Routes_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetSimpleRouteDetailsQuery(Routes_tableQueries routes_tableQueries, String routeId, String cityId, g41 g41Var) {
            super(g41Var);
            Intrinsics.i(routeId, "routeId");
            Intrinsics.i(cityId, "cityId");
            this.d = routes_tableQueries;
            this.b = routeId;
            this.c = cityId;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.d.f697a.P(1385129179, "SELECT routeId, routeName, startStopName, endStopName, agencyName, specialFeature\nFROM routes_table\nWHERE routeId = ? AND cityId = ?", function1, 2, new e(this, 13));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"routes_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"routes_table"}, listener);
        }

        public final String toString() {
            return "routes_table.sq:getSimpleRouteDetails";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Routes_tableQueries$GetVersionForRouteIdQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetVersionForRouteIdQuery<T> extends Query<T> {
        public final String b;
        public final String c;
        public final /* synthetic */ Routes_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetVersionForRouteIdQuery(Routes_tableQueries routes_tableQueries, String routeId, String cityId, r31 r31Var) {
            super(r31Var);
            Intrinsics.i(routeId, "routeId");
            Intrinsics.i(cityId, "cityId");
            this.d = routes_tableQueries;
            this.b = routeId;
            this.c = cityId;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.d.f697a.P(-431137053, "SELECT version\nFROM routes_table\nWHERE routeId = ? AND cityId = ?", function1, 2, new e(this, 14));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"routes_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"routes_table"}, listener);
        }

        public final String toString() {
            return "routes_table.sq:getVersionForRouteId";
        }
    }

    public Routes_tableQueries(SqlDriver sqlDriver, Routes_table.Adapter adapter) {
        super(sqlDriver);
        this.b = adapter;
    }

    public final void W(long j, String cityId) {
        Intrinsics.i(cityId, "cityId");
        this.f697a.A0(-158610597, "DELETE FROM routes_table\nWHERE lastAccessedTs > 0 AND lastAccessedTs <= ? AND cityId = ?", new xa(j, cityId, 11));
        T(-158610597, new r31(22));
    }

    public final QueryResult X(long j, String cityId) {
        Intrinsics.i(cityId, "cityId");
        QueryResult queryResultA0 = this.f697a.A0(-662877250, "DELETE FROM routes_table\nWHERE lastAccessedTs == -1 AND createdAtTs <= ? AND cityId = ?", new xa(j, cityId, 10));
        T(-662877250, new r31(17));
        return queryResultA0;
    }

    public final Query Y(String cityId, Function14 function14) {
        Intrinsics.i(cityId, "cityId");
        return new GetAllRoutesForCityQuery(this, cityId, new f41(function14, this, 3));
    }

    public final Query Z(String cityId, Function2 function2) {
        Intrinsics.i(cityId, "cityId");
        return new GetMostRecentRoutesWithIdAndVersionQuery(this, cityId, new ls(5, function2));
    }

    public final Query a0(String routeId, String cityId, Function14 function14) {
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(cityId, "cityId");
        return new GetRouteQuery(this, routeId, cityId, new f41(function14, this, 1));
    }

    public final Query b0(String cityId, Function2 function2) {
        Intrinsics.i(cityId, "cityId");
        return new GetRoutesWithIdAndVersionQuery(this, cityId, new ls(4, function2));
    }

    public final Query c0(String cityId, Collection routeId, Function14 function14) {
        Intrinsics.i(cityId, "cityId");
        Intrinsics.i(routeId, "routeId");
        return new GetSelectRoutesForCityQuery(this, cityId, routeId, new f41(function14, this, 2));
    }

    public final Query d0(String routeId, String cityId, Function6 function6) {
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(cityId, "cityId");
        return new GetSimpleRouteDetailsQuery(this, routeId, cityId, new g41(0, function6, this));
    }

    public final Query e0(String routeId, String cityId) {
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(cityId, "cityId");
        return new GetVersionForRouteIdQuery(this, routeId, cityId, new r31(18));
    }

    public final void f0(Routes_table routes_table) {
        this.f697a.A0(-1311135766, "INSERT OR REPLACE INTO routes_table (version, cityId, routeId, routeName, startStopName, endStopName, agencyName, specialFeature, lastAccessedTs, createdAtTs, routeLiveData, detailedData, via, routeNamingScheme) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new t01(29, routes_table, this));
        T(-1311135766, new r31(19));
    }
}
