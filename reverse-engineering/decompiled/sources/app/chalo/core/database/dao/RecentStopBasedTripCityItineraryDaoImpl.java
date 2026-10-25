package app.chalo.core.database.dao;

import app.cash.sqldelight.coroutines.FlowQuery;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.chalo.core.Recent_stop_based_trip_tableQueries;
import app.chalo.core.database.mappers.RecentStopBasedTripCityItineraryMappers;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.recent.database.dao.recent.RecentStopBasedTripCityItineraryDao;
import app.chalo.recent.database.entities.RecentStopBasedTripEntity;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/database/dao/RecentStopBasedTripCityItineraryDaoImpl;", "Lapp/chalo/recent/database/dao/recent/RecentStopBasedTripCityItineraryDao;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecentStopBasedTripCityItineraryDaoImpl implements RecentStopBasedTripCityItineraryDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Recent_stop_based_trip_tableQueries f2074a;
    public final CoroutineContextProvider b;

    public RecentStopBasedTripCityItineraryDaoImpl(Recent_stop_based_trip_tableQueries query, CoroutineContextProvider coroutineContextProvider) {
        Intrinsics.i(query, "query");
        this.f2074a = query;
        this.b = coroutineContextProvider;
    }

    @Override // app.chalo.recent.database.dao.recent.RecentStopBasedTripCityItineraryDao
    public final Object a(String str, String str2, long j, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new RecentStopBasedTripCityItineraryDaoImpl$increaseAccessCountAndUpdateTime$2(this, j, str, str2, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.recent.database.dao.recent.RecentStopBasedTripCityItineraryDao
    public final Object b(String str, String str2, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new RecentStopBasedTripCityItineraryDaoImpl$removeStopBasedTrip$2(this, str, str2, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.recent.database.dao.recent.RecentStopBasedTripCityItineraryDao
    public final FlowQuery$mapToList$$inlined$map$1 c(int i, String cityId) {
        Intrinsics.i(cityId, "cityId");
        return FlowQuery.a(FlowQuery.c(this.f2074a.Y(cityId, i, new RecentStopBasedTripCityItineraryDaoImpl$getAllStopBasedTripCityItineraryForCityOldestToNewest$1(7, RecentStopBasedTripCityItineraryMappers.f2101a, RecentStopBasedTripCityItineraryMappers.class, "toRecentStopBasedTripEntity", "toRecentStopBasedTripEntity(Ljava/lang/String;Ljava/lang/String;Lapp/chalo/recent/database/entities/RecentStopInfoEntity;Lapp/chalo/recent/database/entities/RecentStopInfoEntity;Lapp/chalo/providers/cityprovider/impl/data/models/app/ChaloTransitMode;JJ)Lapp/chalo/recent/database/entities/RecentStopBasedTripEntity;", 0))), this.b.b());
    }

    @Override // app.chalo.recent.database.dao.recent.RecentStopBasedTripCityItineraryDao
    public final Object d(RecentStopBasedTripEntity recentStopBasedTripEntity, ContinuationImpl continuationImpl) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new RecentStopBasedTripCityItineraryDaoImpl$insertStopBasedTripCityItinerary$2(this, recentStopBasedTripEntity, null), continuationImpl);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.recent.database.dao.recent.RecentStopBasedTripCityItineraryDao
    public final FlowQuery$mapToList$$inlined$map$1 e(String str, List transitModes) {
        Intrinsics.i(transitModes, "transitModes");
        return FlowQuery.a(FlowQuery.c(this.f2074a.a0(str, transitModes, 5, new RecentStopBasedTripCityItineraryDaoImpl$getRecentStopBasedTripsFilteredByTransitModesSortedDescByAccessTimeForCity$1(7, RecentStopBasedTripCityItineraryMappers.f2101a, RecentStopBasedTripCityItineraryMappers.class, "toRecentStopBasedTripEntity", "toRecentStopBasedTripEntity(Ljava/lang/String;Ljava/lang/String;Lapp/chalo/recent/database/entities/RecentStopInfoEntity;Lapp/chalo/recent/database/entities/RecentStopInfoEntity;Lapp/chalo/providers/cityprovider/impl/data/models/app/ChaloTransitMode;JJ)Lapp/chalo/recent/database/entities/RecentStopBasedTripEntity;", 0))), this.b.b());
    }

    @Override // app.chalo.recent.database.dao.recent.RecentStopBasedTripCityItineraryDao
    public final FlowQuery$mapToList$$inlined$map$1 f(int i, String cityId) {
        Intrinsics.i(cityId, "cityId");
        return FlowQuery.a(FlowQuery.c(this.f2074a.X(cityId, i, new RecentStopBasedTripCityItineraryDaoImpl$getAllStopBasedTripCityItineraryForCityNewestToOldest$1(7, RecentStopBasedTripCityItineraryMappers.f2101a, RecentStopBasedTripCityItineraryMappers.class, "toRecentStopBasedTripEntity", "toRecentStopBasedTripEntity(Ljava/lang/String;Ljava/lang/String;Lapp/chalo/recent/database/entities/RecentStopInfoEntity;Lapp/chalo/recent/database/entities/RecentStopInfoEntity;Lapp/chalo/providers/cityprovider/impl/data/models/app/ChaloTransitMode;JJ)Lapp/chalo/recent/database/entities/RecentStopBasedTripEntity;", 0))), this.b.b());
    }

    @Override // app.chalo.recent.database.dao.recent.RecentStopBasedTripCityItineraryDao
    public final Object g(String str, String str2, ContinuationImpl continuationImpl) {
        return ChaloCoreDatabaseKt.a(this.b, new RecentStopBasedTripCityItineraryDaoImpl$getStopBasedTripCityItineraryForCity$2(this, str, str2, null), continuationImpl);
    }

    @Override // app.chalo.recent.database.dao.recent.RecentStopBasedTripCityItineraryDao
    public final Object h(String str, Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.b, new RecentStopBasedTripCityItineraryDaoImpl$getAllStopBasedTripCityItineraryForCity$2(this, str, null), continuation);
    }
}
