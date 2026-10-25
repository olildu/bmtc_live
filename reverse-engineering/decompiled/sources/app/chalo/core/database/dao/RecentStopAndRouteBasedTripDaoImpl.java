package app.chalo.core.database.dao;

import app.cash.sqldelight.coroutines.FlowQuery;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.chalo.core.Recent_stop_and_route_based_trip_tableQueries;
import app.chalo.core.database.mappers.RecentStopAndRouteBasedTripMappers;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.recent.database.dao.recent.RecentStopAndRouteBasedTripDao;
import app.chalo.recent.database.entities.RecentStopAndRouteBasedTripEntity;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/database/dao/RecentStopAndRouteBasedTripDaoImpl;", "Lapp/chalo/recent/database/dao/recent/RecentStopAndRouteBasedTripDao;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecentStopAndRouteBasedTripDaoImpl implements RecentStopAndRouteBasedTripDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Recent_stop_and_route_based_trip_tableQueries f2073a;
    public final CoroutineContextProvider b;

    public RecentStopAndRouteBasedTripDaoImpl(Recent_stop_and_route_based_trip_tableQueries query, CoroutineContextProvider coroutineContextProvider) {
        Intrinsics.i(query, "query");
        this.f2073a = query;
        this.b = coroutineContextProvider;
    }

    @Override // app.chalo.recent.database.dao.recent.RecentStopAndRouteBasedTripDao
    public final Object a(String str, String str2, long j, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new RecentStopAndRouteBasedTripDaoImpl$increaseAccessCountAndUpdateTime$2(this, j, str, str2, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.recent.database.dao.recent.RecentStopAndRouteBasedTripDao
    public final Object b(String str, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new RecentStopAndRouteBasedTripDaoImpl$removeOldEntriesIfMaxLimitExceeded$2(this, str, 10, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.recent.database.dao.recent.RecentStopAndRouteBasedTripDao
    public final FlowQuery$mapToList$$inlined$map$1 c(String str, List transitModes) {
        Intrinsics.i(transitModes, "transitModes");
        return FlowQuery.a(FlowQuery.c(this.f2073a.Y(str, transitModes, 5, new RecentStopAndRouteBasedTripDaoImpl$getRecentStopAndRouteBasedTripsFilteredByTransitModesSortedDescByAccessTimeForCity$1(10, RecentStopAndRouteBasedTripMappers.f2100a, RecentStopAndRouteBasedTripMappers.class, "toRecentStopAndRouteBasedTripEntity", "toRecentStopAndRouteBasedTripEntity(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/recent/database/entities/RecentAdditionalRouteInfoEntity;Lapp/chalo/recent/database/entities/RecentStopInfoEntity;Lapp/chalo/recent/database/entities/RecentStopInfoEntity;Lapp/chalo/providers/cityprovider/impl/data/models/app/ChaloTransitMode;JJ)Lapp/chalo/recent/database/entities/RecentStopAndRouteBasedTripEntity;", 0))), this.b.b());
    }

    @Override // app.chalo.recent.database.dao.recent.RecentStopAndRouteBasedTripDao
    public final Object d(Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.b, new RecentStopAndRouteBasedTripDaoImpl$getAllStopAndRouteBasedTripCityItineraryForCity$2(this, null, null), continuation);
    }

    @Override // app.chalo.recent.database.dao.recent.RecentStopAndRouteBasedTripDao
    public final Object e(String str, String str2, ContinuationImpl continuationImpl) {
        return ChaloCoreDatabaseKt.a(this.b, new RecentStopAndRouteBasedTripDaoImpl$getStopAndRouteBasedTripCityItineraryForCity$2(this, str, str2, null), continuationImpl);
    }

    @Override // app.chalo.recent.database.dao.recent.RecentStopAndRouteBasedTripDao
    public final Object f(RecentStopAndRouteBasedTripEntity recentStopAndRouteBasedTripEntity, ContinuationImpl continuationImpl) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new RecentStopAndRouteBasedTripDaoImpl$insertStopAndRouteBasedTripCityItinerary$2(this, recentStopAndRouteBasedTripEntity, null), continuationImpl);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }
}
