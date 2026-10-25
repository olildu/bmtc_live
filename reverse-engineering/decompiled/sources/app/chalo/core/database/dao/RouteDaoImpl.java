package app.chalo.core.database.dao;

import app.chalo.citydata.repository.local.room.dao.RouteDao;
import app.chalo.citydata.repository.local.room.entity.RouteEntity;
import app.chalo.citydata.repository.local.room.entity.RouteEntityLiveDataDetails;
import app.chalo.core.Routes_tableQueries;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.vault.db.ChaloCoreDatabaseKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/database/dao/RouteDaoImpl;", "Lapp/chalo/citydata/repository/local/room/dao/RouteDao;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RouteDaoImpl implements RouteDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Routes_tableQueries f2079a;
    public final CoroutineContextProvider b;

    public RouteDaoImpl(Routes_tableQueries routesTableQueries, CoroutineContextProvider coroutineContextProvider) {
        Intrinsics.i(routesTableQueries, "routesTableQueries");
        this.f2079a = routesTableQueries;
        this.b = coroutineContextProvider;
    }

    @Override // app.chalo.citydata.repository.local.room.dao.RouteDao
    public final Object a(List list, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new RouteDaoImpl$insertRoutes$2(this, list, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.citydata.repository.local.room.dao.RouteDao
    public final Object b(String str, String str2, long j, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new RouteDaoImpl$updateLastAccessedTsForRoute$2(this, j, str, str2, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.citydata.repository.local.room.dao.RouteDao
    public final Object c(RouteEntity routeEntity, ContinuationImpl continuationImpl) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new RouteDaoImpl$insertRoute$2(this, routeEntity, null), continuationImpl);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.citydata.repository.local.room.dao.RouteDao
    public final Object d(String str, Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.b, new RouteDaoImpl$getAllRoutesForCity$2(this, str, null), continuation);
    }

    @Override // app.chalo.citydata.repository.local.room.dao.RouteDao
    public final Object e(String str, String str2, ContinuationImpl continuationImpl) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new RouteDaoImpl$deleteRoute$2(this, str, str2, null), continuationImpl);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.citydata.repository.local.room.dao.RouteDao
    public final Object f(String str, List list, Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.b, new RouteDaoImpl$getSelectRoutesForCity$2(this, str, list, null), continuation);
    }

    @Override // app.chalo.citydata.repository.local.room.dao.RouteDao
    public final Object g(String str, ContinuationImpl continuationImpl) {
        return ChaloCoreDatabaseKt.a(this.b, new RouteDaoImpl$getMostRecentRoutesWithIdAndVersion$2(this, str, null), continuationImpl);
    }

    @Override // app.chalo.citydata.repository.local.room.dao.RouteDao
    public final Object h(long j, String str, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new RouteDaoImpl$deleteStaleRoutes$2(this, j, str, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.citydata.repository.local.room.dao.RouteDao
    public final Object i(String str, ContinuationImpl continuationImpl) {
        return ChaloCoreDatabaseKt.a(this.b, new RouteDaoImpl$getRoutesWithIdAndVersion$2(this, str, null), continuationImpl);
    }

    @Override // app.chalo.citydata.repository.local.room.dao.RouteDao
    public final Object j(String str, ArrayList arrayList, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new RouteDaoImpl$deleteRoutesInCity$2(this, str, arrayList, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.citydata.repository.local.room.dao.RouteDao
    public final Object k(String str, String str2, RouteEntityLiveDataDetails routeEntityLiveDataDetails, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new RouteDaoImpl$updateLiveDetailsForRoute$2(this, routeEntityLiveDataDetails, str, str2, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.citydata.repository.local.room.dao.RouteDao
    public final Object l(String str, String str2, Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.b, new RouteDaoImpl$getRoute$2(this, str, str2, null), continuation);
    }

    @Override // app.chalo.citydata.repository.local.room.dao.RouteDao
    public final Object m(String str, String str2, Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.b, new RouteDaoImpl$getVersionForRouteId$2(this, str, str2, null), continuation);
    }
}
