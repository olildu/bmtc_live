package app.chalo.core.database.dao;

import app.cash.sqldelight.coroutines.FlowQuery;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.chalo.core.Recent_trip_tableQueries;
import app.chalo.core.database.mappers.RecentTripCityItineraryMappers;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.recent.database.dao.recent.RecentTripCityItineraryDao;
import app.chalo.recent.database.entities.RecentTripEntity;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/database/dao/RecentTripCityItineraryDaoImpl;", "Lapp/chalo/recent/database/dao/recent/RecentTripCityItineraryDao;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecentTripCityItineraryDaoImpl implements RecentTripCityItineraryDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Recent_trip_tableQueries f2076a;
    public final CoroutineContextProvider b;

    public RecentTripCityItineraryDaoImpl(Recent_trip_tableQueries query, CoroutineContextProvider coroutineContextProvider) {
        Intrinsics.i(query, "query");
        this.f2076a = query;
        this.b = coroutineContextProvider;
    }

    @Override // app.chalo.recent.database.dao.recent.RecentTripCityItineraryDao
    public final Object a(String str, String str2, long j, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new RecentTripCityItineraryDaoImpl$increaseAccessCountAndUpdateTimeForCity$2(this, j, str, str2, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.recent.database.dao.recent.RecentTripCityItineraryDao
    public final Object c(String str, String str2, ContinuationImpl continuationImpl) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new RecentTripCityItineraryDaoImpl$removeTripRecent$2(this, str, str2, null), continuationImpl);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.recent.database.dao.recent.RecentTripCityItineraryDao
    public final FlowQuery$mapToList$$inlined$map$1 d(int i, String cityId) {
        Intrinsics.i(cityId, "cityId");
        return FlowQuery.a(FlowQuery.c(this.f2076a.X(cityId, i, new RecentTripCityItineraryDaoImpl$getLimitedTripRecentForCityNewestToOldest$1(7, RecentTripCityItineraryMappers.f2103a, RecentTripCityItineraryMappers.class, "toRecentTripEntity", "toRecentTripEntity(Ljava/lang/String;Ljava/lang/String;Lapp/chalo/recent/database/entities/ChaloDescriptiveLocationEntityModel;Lapp/chalo/recent/database/entities/ChaloDescriptiveLocationEntityModel;Lapp/chalo/providers/cityprovider/impl/data/models/app/ChaloTransitMode;JJ)Lapp/chalo/recent/database/entities/RecentTripEntity;", 0))), this.b.b());
    }

    @Override // app.chalo.recent.database.dao.recent.RecentTripCityItineraryDao
    public final FlowQuery$mapToList$$inlined$map$1 e(int i, String cityId) {
        Intrinsics.i(cityId, "cityId");
        return FlowQuery.a(FlowQuery.c(this.f2076a.Y(cityId, i, new RecentTripCityItineraryDaoImpl$getLimitedTripRecentForCityOldestToNewest$1(7, RecentTripCityItineraryMappers.f2103a, RecentTripCityItineraryMappers.class, "toRecentTripEntity", "toRecentTripEntity(Ljava/lang/String;Ljava/lang/String;Lapp/chalo/recent/database/entities/ChaloDescriptiveLocationEntityModel;Lapp/chalo/recent/database/entities/ChaloDescriptiveLocationEntityModel;Lapp/chalo/providers/cityprovider/impl/data/models/app/ChaloTransitMode;JJ)Lapp/chalo/recent/database/entities/RecentTripEntity;", 0))), this.b.b());
    }

    @Override // app.chalo.recent.database.dao.recent.RecentTripCityItineraryDao
    public final Object f(String str, Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.b, new RecentTripCityItineraryDaoImpl$getAllTripRecentForCity$2(this, str, null), continuation);
    }

    @Override // app.chalo.recent.database.dao.recent.RecentTripCityItineraryDao
    public final FlowQuery$mapToList$$inlined$map$1 g(String cityId, List transitModes) {
        Intrinsics.i(cityId, "cityId");
        Intrinsics.i(transitModes, "transitModes");
        return FlowQuery.a(FlowQuery.c(this.f2076a.a0(cityId, transitModes, 3, new RecentTripCityItineraryDaoImpl$getRecentTripsFilteredByTransitModesSortedDescByAccessTimeForCity$1(7, RecentTripCityItineraryMappers.f2103a, RecentTripCityItineraryMappers.class, "toRecentTripEntity", "toRecentTripEntity(Ljava/lang/String;Ljava/lang/String;Lapp/chalo/recent/database/entities/ChaloDescriptiveLocationEntityModel;Lapp/chalo/recent/database/entities/ChaloDescriptiveLocationEntityModel;Lapp/chalo/providers/cityprovider/impl/data/models/app/ChaloTransitMode;JJ)Lapp/chalo/recent/database/entities/RecentTripEntity;", 0))), this.b.b());
    }

    @Override // app.chalo.recent.database.dao.recent.RecentTripCityItineraryDao
    public final Object h(String str, String str2, ContinuationImpl continuationImpl) {
        return ChaloCoreDatabaseKt.a(this.b, new RecentTripCityItineraryDaoImpl$getTripRecentForCity$2(this, str2, str, null), continuationImpl);
    }

    @Override // app.chalo.recent.database.dao.recent.RecentTripCityItineraryDao
    public final Object i(RecentTripEntity recentTripEntity, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new RecentTripCityItineraryDaoImpl$insertTripRecent$2(this, recentTripEntity, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }
}
