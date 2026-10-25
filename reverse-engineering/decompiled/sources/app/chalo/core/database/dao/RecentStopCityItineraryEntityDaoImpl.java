package app.chalo.core.database.dao;

import app.cash.sqldelight.coroutines.FlowQuery;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.chalo.core.Recent_stop_tableQueries;
import app.chalo.core.database.mappers.RecentStopCityItineraryMappers;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.recent.database.dao.recent.RecentStopCityItineraryEntityDao;
import app.chalo.recent.database.entities.RecentStopEntity;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/database/dao/RecentStopCityItineraryEntityDaoImpl;", "Lapp/chalo/recent/database/dao/recent/RecentStopCityItineraryEntityDao;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecentStopCityItineraryEntityDaoImpl implements RecentStopCityItineraryEntityDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Recent_stop_tableQueries f2075a;
    public final CoroutineContextProvider b;

    public RecentStopCityItineraryEntityDaoImpl(Recent_stop_tableQueries query, CoroutineContextProvider coroutineContextProvider) {
        Intrinsics.i(query, "query");
        this.f2075a = query;
        this.b = coroutineContextProvider;
    }

    @Override // app.chalo.recent.database.dao.recent.RecentStopCityItineraryEntityDao
    public final Object a(String str, String str2, long j, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new RecentStopCityItineraryEntityDaoImpl$increaseAccessCountAndUpdateTime$2(this, j, str, str2, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.recent.database.dao.recent.RecentStopCityItineraryEntityDao
    public final Object b(String str, String str2, String str3, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new RecentStopCityItineraryEntityDaoImpl$updateLabel$2(this, str, str2, str3, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.recent.database.dao.recent.RecentStopCityItineraryEntityDao
    public final Object c(RecentsSpecialEntityStatus recentsSpecialEntityStatus, String str, String str2, ContinuationImpl continuationImpl) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new RecentStopCityItineraryEntityDaoImpl$updateSpecialStatus$2(this, recentsSpecialEntityStatus, str, str2, null), continuationImpl);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.recent.database.dao.recent.RecentStopCityItineraryEntityDao
    public final FlowQuery$mapToList$$inlined$map$1 d(RecentsSpecialEntityStatus recentsSpecialEntityStatus, String cityId) {
        Intrinsics.i(recentsSpecialEntityStatus, "recentsSpecialEntityStatus");
        Intrinsics.i(cityId, "cityId");
        return FlowQuery.a(FlowQuery.c(this.f2075a.Y(recentsSpecialEntityStatus, cityId, new RecentStopCityItineraryEntityDaoImpl$getRecentStopCityItineraryForCity$1(7, RecentStopCityItineraryMappers.f2102a, RecentStopCityItineraryMappers.class, "toRecentStopEntity", "toRecentStopEntity(Ljava/lang/String;Ljava/lang/String;Lapp/chalo/recent/database/entities/RecentStopInfoEntity;Lapp/chalo/recent/database/entities/RecentsSpecialEntityStatus;JJLjava/lang/String;)Lapp/chalo/recent/database/entities/RecentStopEntity;", 0))), this.b.b());
    }

    @Override // app.chalo.recent.database.dao.recent.RecentStopCityItineraryEntityDao
    public final FlowQuery$mapToList$$inlined$map$1 e(String cityId) {
        Intrinsics.i(cityId, "cityId");
        return FlowQuery.a(FlowQuery.c(this.f2075a.c0(cityId, new RecentStopCityItineraryEntityDaoImpl$getStopCityItinerarySortedDescWithoutLimit$1(7, RecentStopCityItineraryMappers.f2102a, RecentStopCityItineraryMappers.class, "toRecentStopEntity", "toRecentStopEntity(Ljava/lang/String;Ljava/lang/String;Lapp/chalo/recent/database/entities/RecentStopInfoEntity;Lapp/chalo/recent/database/entities/RecentsSpecialEntityStatus;JJLjava/lang/String;)Lapp/chalo/recent/database/entities/RecentStopEntity;", 0))), this.b.b());
    }

    @Override // app.chalo.recent.database.dao.recent.RecentStopCityItineraryEntityDao
    public final Object f(String str, String str2, ContinuationImpl continuationImpl) {
        return ChaloCoreDatabaseKt.a(this.b, new RecentStopCityItineraryEntityDaoImpl$getRecentStopCityItinerary$2(this, str, str2, null), continuationImpl);
    }

    @Override // app.chalo.recent.database.dao.recent.RecentStopCityItineraryEntityDao
    public final Object g(RecentStopEntity recentStopEntity, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new RecentStopCityItineraryEntityDaoImpl$insertStopCityItinerary$2(this, recentStopEntity, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.recent.database.dao.recent.RecentStopCityItineraryEntityDao
    public final FlowQuery$mapToList$$inlined$map$1 h(String cityId) {
        Intrinsics.i(cityId, "cityId");
        return FlowQuery.a(FlowQuery.c(this.f2075a.b0(cityId, 3, new RecentStopCityItineraryEntityDaoImpl$getStopCityItinerarySortedDesc$1(7, RecentStopCityItineraryMappers.f2102a, RecentStopCityItineraryMappers.class, "toRecentStopEntity", "toRecentStopEntity(Ljava/lang/String;Ljava/lang/String;Lapp/chalo/recent/database/entities/RecentStopInfoEntity;Lapp/chalo/recent/database/entities/RecentsSpecialEntityStatus;JJLjava/lang/String;)Lapp/chalo/recent/database/entities/RecentStopEntity;", 0))), this.b.b());
    }

    @Override // app.chalo.recent.database.dao.recent.RecentStopCityItineraryEntityDao
    public final Object i(int i, RecentsSpecialEntityStatus recentsSpecialEntityStatus, String str, Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.b, new RecentStopCityItineraryEntityDaoImpl$getOldestStopCityItineraryWithSpecialStatus$2(this, str, recentsSpecialEntityStatus, i, null), continuation);
    }

    @Override // app.chalo.recent.database.dao.recent.RecentStopCityItineraryEntityDao
    public final Object j(String str, String str2, ContinuationImpl continuationImpl) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new RecentStopCityItineraryEntityDaoImpl$removeStopCityItinerary$2(this, str, str2, null), continuationImpl);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.recent.database.dao.recent.RecentStopCityItineraryEntityDao
    public final Object k(RecentsSpecialEntityStatus recentsSpecialEntityStatus, String str, Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.b, new RecentStopCityItineraryEntityDaoImpl$getRecentStopEntryCountWithSpecialStatusForCity$2(this, recentsSpecialEntityStatus, str, null), continuation);
    }
}
