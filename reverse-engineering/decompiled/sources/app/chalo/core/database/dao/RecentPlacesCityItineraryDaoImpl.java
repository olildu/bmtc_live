package app.chalo.core.database.dao;

import app.cash.sqldelight.coroutines.FlowQuery;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.chalo.core.Recent_place_tableQueries;
import app.chalo.core.database.mappers.RecentPlaceEntityMappers;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.recent.database.dao.recent.RecentPlacesCityItineraryDao;
import app.chalo.recent.database.entities.RecentPlaceEntity;
import app.chalo.recent.database.entities.RecentsSpecialEntityStatus;
import app.chalo.vault.db.ChaloCoreDatabaseKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/database/dao/RecentPlacesCityItineraryDaoImpl;", "Lapp/chalo/recent/database/dao/recent/RecentPlacesCityItineraryDao;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecentPlacesCityItineraryDaoImpl implements RecentPlacesCityItineraryDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Recent_place_tableQueries f2072a;
    public final CoroutineContextProvider b;

    public RecentPlacesCityItineraryDaoImpl(Recent_place_tableQueries query, CoroutineContextProvider coroutineContextProvider) {
        Intrinsics.i(query, "query");
        this.f2072a = query;
        this.b = coroutineContextProvider;
    }

    @Override // app.chalo.recent.database.dao.recent.RecentPlacesCityItineraryDao
    public final Object a(String str, String str2, long j, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new RecentPlacesCityItineraryDaoImpl$increaseAccessCountAndUpdateTime$2(this, j, str, str2, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.recent.database.dao.recent.RecentPlacesCityItineraryDao
    public final Object b(String str, String str2, String str3, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new RecentPlacesCityItineraryDaoImpl$updateLabel$2(this, str, str2, str3, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.recent.database.dao.recent.RecentPlacesCityItineraryDao
    public final Object c(RecentsSpecialEntityStatus recentsSpecialEntityStatus, String str, String str2, ContinuationImpl continuationImpl) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new RecentPlacesCityItineraryDaoImpl$updateSpecialStatus$2(this, recentsSpecialEntityStatus, str, str2, null), continuationImpl);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.recent.database.dao.recent.RecentPlacesCityItineraryDao
    public final FlowQuery$mapToList$$inlined$map$1 d(RecentsSpecialEntityStatus recentsSpecialEntityStatus, String cityId) {
        Intrinsics.i(recentsSpecialEntityStatus, "recentsSpecialEntityStatus");
        Intrinsics.i(cityId, "cityId");
        return FlowQuery.a(FlowQuery.c(this.f2072a.Z(recentsSpecialEntityStatus, cityId, new RecentPlacesCityItineraryDaoImpl$getRecentPlaceCityItineraryForCity$3(10, RecentPlaceEntityMappers.f2099a, RecentPlaceEntityMappers.class, "toRecentPlaceEntity", "toRecentPlaceEntity(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/location/LatLng;Lapp/chalo/recent/database/entities/RecentsSpecialEntityStatus;JJLjava/lang/String;)Lapp/chalo/recent/database/entities/RecentPlaceEntity;", 0))), this.b.b());
    }

    @Override // app.chalo.recent.database.dao.recent.RecentPlacesCityItineraryDao
    public final Object e(RecentsSpecialEntityStatus recentsSpecialEntityStatus, String str, Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.b, new RecentPlacesCityItineraryDaoImpl$getRecentPlacesForSpecialStatusCount$2(this, str, recentsSpecialEntityStatus, null), continuation);
    }

    @Override // app.chalo.recent.database.dao.recent.RecentPlacesCityItineraryDao
    public final Object f(String str, String str2, ContinuationImpl continuationImpl) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new RecentPlacesCityItineraryDaoImpl$removePlacesCityItinerary$2(this, str, str2, null), continuationImpl);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.recent.database.dao.recent.RecentPlacesCityItineraryDao
    public final Object g(int i, RecentsSpecialEntityStatus recentsSpecialEntityStatus, String str, Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.b, new RecentPlacesCityItineraryDaoImpl$getOldestRecentPlacesWithSpecialStatusForCity$2(this, str, recentsSpecialEntityStatus, i, null), continuation);
    }

    @Override // app.chalo.recent.database.dao.recent.RecentPlacesCityItineraryDao
    public final Object h(RecentPlaceEntity recentPlaceEntity, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new RecentPlacesCityItineraryDaoImpl$insertPlacesCityItinerary$2(this, recentPlaceEntity, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.recent.database.dao.recent.RecentPlacesCityItineraryDao
    public final Object i(String str, String str2, ContinuationImpl continuationImpl) {
        return ChaloCoreDatabaseKt.a(this.b, new RecentPlacesCityItineraryDaoImpl$getRecentPlaceCityItineraryForCity$2(this, str, str2, null), continuationImpl);
    }

    @Override // app.chalo.recent.database.dao.recent.RecentPlacesCityItineraryDao
    public final FlowQuery$mapToList$$inlined$map$1 j(String cityId) {
        Intrinsics.i(cityId, "cityId");
        return FlowQuery.a(FlowQuery.c(this.f2072a.W(cityId, 3, new RecentPlacesCityItineraryDaoImpl$getAllPlacesCityItineraryForCitySortedDesc$1(10, RecentPlaceEntityMappers.f2099a, RecentPlaceEntityMappers.class, "toRecentPlaceEntity", "toRecentPlaceEntity(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/location/LatLng;Lapp/chalo/recent/database/entities/RecentsSpecialEntityStatus;JJLjava/lang/String;)Lapp/chalo/recent/database/entities/RecentPlaceEntity;", 0))), this.b.b());
    }
}
