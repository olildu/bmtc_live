package app.chalo.core.database.dao;

import app.cash.sqldelight.coroutines.FlowQuery;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.chalo.core.Recent_route_tableQueries;
import app.chalo.core.database.mappers.RouteRecentCityItineraryMappers;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.recent.database.dao.recent.RouteRecentCityItineraryDao;
import app.chalo.recent.database.entities.RecentRouteEntity;
import app.chalo.recent.database.entities.RecentsSpecialEntityStatus;
import app.chalo.vault.db.ChaloCoreDatabaseKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/database/dao/RouteRecentCityItineraryDaoImpl;", "Lapp/chalo/recent/database/dao/recent/RouteRecentCityItineraryDao;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RouteRecentCityItineraryDaoImpl implements RouteRecentCityItineraryDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Recent_route_tableQueries f2080a;
    public final CoroutineContextProvider b;

    public RouteRecentCityItineraryDaoImpl(Recent_route_tableQueries recentRouteTableQueries, CoroutineContextProvider coroutineContextProvider) {
        Intrinsics.i(recentRouteTableQueries, "recentRouteTableQueries");
        this.f2080a = recentRouteTableQueries;
        this.b = coroutineContextProvider;
    }

    @Override // app.chalo.recent.database.dao.recent.RouteRecentCityItineraryDao
    public final Object a(String str, String str2, long j, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new RouteRecentCityItineraryDaoImpl$increaseAccessCountAndUpdateTimeForCity$2(this, j, str, str2, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.recent.database.dao.recent.RouteRecentCityItineraryDao
    public final Object b(Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.b, new RouteRecentCityItineraryDaoImpl$getSortedByMostRecentAccessForCity$2(this, null, null), continuation);
    }

    @Override // app.chalo.recent.database.dao.recent.RouteRecentCityItineraryDao
    public final Object c(Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.b, new RouteRecentCityItineraryDaoImpl$getRecentRouteCountForCity$2(this, null, null, null), continuation);
    }

    @Override // app.chalo.recent.database.dao.recent.RouteRecentCityItineraryDao
    public final Object d(RecentsSpecialEntityStatus recentsSpecialEntityStatus, String str, Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.b, new RouteRecentCityItineraryDaoImpl$getRecentRoutesForSpecialStatusCount$2(this, str, recentsSpecialEntityStatus, null), continuation);
    }

    @Override // app.chalo.recent.database.dao.recent.RouteRecentCityItineraryDao
    public final Object e(String str, String str2, ContinuationImpl continuationImpl) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new RouteRecentCityItineraryDaoImpl$removeRouteCityItinerary$2(this, str, str2, null), continuationImpl);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.recent.database.dao.recent.RouteRecentCityItineraryDao
    public final Object f(String str, String str2, ContinuationImpl continuationImpl) {
        return ChaloCoreDatabaseKt.a(this.b, new RouteRecentCityItineraryDaoImpl$getRouteCityItinerary$2(this, str, str2, null), continuationImpl);
    }

    @Override // app.chalo.recent.database.dao.recent.RouteRecentCityItineraryDao
    public final Object g(RecentRouteEntity recentRouteEntity, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new RouteRecentCityItineraryDaoImpl$insertRouteCityItinerary$2(this, recentRouteEntity, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.recent.database.dao.recent.RouteRecentCityItineraryDao
    public final FlowQuery$mapToList$$inlined$map$1 h(String cityId, List transitModes) {
        Intrinsics.i(cityId, "cityId");
        Intrinsics.i(transitModes, "transitModes");
        return FlowQuery.a(FlowQuery.c(this.f2080a.c0(cityId, transitModes, 3, new RouteRecentCityItineraryDaoImpl$getRecentRoutesFilteredByTransitModesSortedDescByAccessTimeForCity$1(15, RouteRecentCityItineraryMappers.f2106a, RouteRecentCityItineraryMappers.class, "toRecentRouteEntity", "toRecentRouteEntity(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;ZLapp/chalo/providers/cityprovider/impl/data/models/app/ChaloTransitMode;Lapp/chalo/recent/database/entities/RecentsSpecialEntityStatus;JJLjava/lang/String;Lapp/chalo/providers/RouteNamingSchemeType;)Lapp/chalo/recent/database/entities/RecentRouteEntity;", 0))), this.b.b());
    }

    @Override // app.chalo.recent.database.dao.recent.RouteRecentCityItineraryDao
    public final FlowQuery$mapToList$$inlined$map$1 i(String cityId) {
        Intrinsics.i(cityId, "cityId");
        return FlowQuery.a(FlowQuery.c(this.f2080a.e0(cityId, 3, new RouteRecentCityItineraryDaoImpl$getRecentRoutesSortedDescByAccessTimeForCity$1(15, RouteRecentCityItineraryMappers.f2106a, RouteRecentCityItineraryMappers.class, "toRecentRouteEntity", "toRecentRouteEntity(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;ZLapp/chalo/providers/cityprovider/impl/data/models/app/ChaloTransitMode;Lapp/chalo/recent/database/entities/RecentsSpecialEntityStatus;JJLjava/lang/String;Lapp/chalo/providers/RouteNamingSchemeType;)Lapp/chalo/recent/database/entities/RecentRouteEntity;", 0))), this.b.b());
    }

    @Override // app.chalo.recent.database.dao.recent.RouteRecentCityItineraryDao
    public final Object j(RecentsSpecialEntityStatus recentsSpecialEntityStatus, String str, Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.b, new RouteRecentCityItineraryDaoImpl$getAllRouteCityItineraryForCityWithSpecialStatus$2(this, str, recentsSpecialEntityStatus, null), continuation);
    }

    @Override // app.chalo.recent.database.dao.recent.RouteRecentCityItineraryDao
    public final Object k(int i, RecentsSpecialEntityStatus recentsSpecialEntityStatus, String str, Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.b, new RouteRecentCityItineraryDaoImpl$getOldestRecentRoutesWithSpecialStatusForCity$2(this, str, recentsSpecialEntityStatus, i, null), continuation);
    }

    @Override // app.chalo.recent.database.dao.recent.RouteRecentCityItineraryDao
    public final Object l(String str, Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.b, new RouteRecentCityItineraryDaoImpl$getAllRouteCityItineraryForCity$2(this, str, null), continuation);
    }

    @Override // app.chalo.recent.database.dao.recent.RouteRecentCityItineraryDao
    public final Object m(RecentsSpecialEntityStatus recentsSpecialEntityStatus, String str, String str2, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new RouteRecentCityItineraryDaoImpl$updateSpecialStatus$2(this, recentsSpecialEntityStatus, str, str2, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.recent.database.dao.recent.RouteRecentCityItineraryDao
    public final Object n(int i, RecentsSpecialEntityStatus recentsSpecialEntityStatus, String str, Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.b, new RouteRecentCityItineraryDaoImpl$getNewestRecentRoutesWithSpecialStatusForCity$2(this, str, recentsSpecialEntityStatus, i, null), continuation);
    }

    @Override // app.chalo.recent.database.dao.recent.RouteRecentCityItineraryDao
    public final Object o(String str, List list, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new RouteRecentCityItineraryDaoImpl$removeRoutesCityItinerary$2(this, list, str, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.recent.database.dao.recent.RouteRecentCityItineraryDao
    public final Object p(RecentsSpecialEntityStatus recentsSpecialEntityStatus, String str, String str2, Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.b, new RouteRecentCityItineraryDaoImpl$getRecentRouteCountForCityWithSpecialStatus$2(this, recentsSpecialEntityStatus, str, str2, null), continuation);
    }
}
