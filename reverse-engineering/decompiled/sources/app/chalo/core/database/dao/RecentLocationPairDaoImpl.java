package app.chalo.core.database.dao;

import app.cash.sqldelight.coroutines.FlowQuery;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.chalo.core.Recent_location_pair_tableQueries;
import app.chalo.core.database.mappers.RecentLocationPairEntityMapper;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.recent.database.dao.recent.RecentLocationPairDao;
import app.chalo.recent.database.entities.RecentLocationPairEntity;
import app.chalo.vault.db.ChaloCoreDatabaseKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/database/dao/RecentLocationPairDaoImpl;", "Lapp/chalo/recent/database/dao/recent/RecentLocationPairDao;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecentLocationPairDaoImpl implements RecentLocationPairDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Recent_location_pair_tableQueries f2071a;
    public final CoroutineContextProvider b;

    public RecentLocationPairDaoImpl(Recent_location_pair_tableQueries query, CoroutineContextProvider coroutineContextProvider) {
        Intrinsics.i(query, "query");
        this.f2071a = query;
        this.b = coroutineContextProvider;
    }

    @Override // app.chalo.recent.database.dao.recent.RecentLocationPairDao
    public final Object a(String str, String str2, long j, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new RecentLocationPairDaoImpl$increaseAccessCountAndUpdateTime$2(this, j, str, str2, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.recent.database.dao.recent.RecentLocationPairDao
    public final Object b(String str, String str2, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new RecentLocationPairDaoImpl$removeLocationPair$2(this, str, str2, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.recent.database.dao.recent.RecentLocationPairDao
    public final Object c(String str, String str2) {
        return this.f2071a.Y(str, str2, new RecentLocationPairDaoImpl$getLocationPair$2(6, RecentLocationPairEntityMapper.f2098a, RecentLocationPairEntityMapper.class, "toRecentLocationPairEntity", "toRecentLocationPairEntity(Ljava/lang/String;Ljava/lang/String;Lapp/chalo/recent/database/entities/RecentLocationPairEndpointEntity;Lapp/chalo/recent/database/entities/RecentLocationPairEndpointEntity;JJ)Lapp/chalo/recent/database/entities/RecentLocationPairEntity;", 0)).d();
    }

    @Override // app.chalo.recent.database.dao.recent.RecentLocationPairDao
    public final Integer d(String str) {
        return new Integer((int) ((Number) this.f2071a.X(str).c()).longValue());
    }

    @Override // app.chalo.recent.database.dao.recent.RecentLocationPairDao
    public final FlowQuery$mapToList$$inlined$map$1 e(int i, String cityId) {
        Intrinsics.i(cityId, "cityId");
        return FlowQuery.a(FlowQuery.c(this.f2071a.Z(cityId, i, new RecentLocationPairDaoImpl$getLocationPairsForCityNewestToOldest$1(6, RecentLocationPairEntityMapper.f2098a, RecentLocationPairEntityMapper.class, "toRecentLocationPairEntity", "toRecentLocationPairEntity(Ljava/lang/String;Ljava/lang/String;Lapp/chalo/recent/database/entities/RecentLocationPairEndpointEntity;Lapp/chalo/recent/database/entities/RecentLocationPairEndpointEntity;JJ)Lapp/chalo/recent/database/entities/RecentLocationPairEntity;", 0))), this.b.b());
    }

    @Override // app.chalo.recent.database.dao.recent.RecentLocationPairDao
    public final FlowQuery$mapToList$$inlined$map$1 f(int i, String cityId) {
        Intrinsics.i(cityId, "cityId");
        return FlowQuery.a(FlowQuery.c(this.f2071a.a0(cityId, i, new RecentLocationPairDaoImpl$getLocationPairsForCityOldestToNewest$1(6, RecentLocationPairEntityMapper.f2098a, RecentLocationPairEntityMapper.class, "toRecentLocationPairEntity", "toRecentLocationPairEntity(Ljava/lang/String;Ljava/lang/String;Lapp/chalo/recent/database/entities/RecentLocationPairEndpointEntity;Lapp/chalo/recent/database/entities/RecentLocationPairEndpointEntity;JJ)Lapp/chalo/recent/database/entities/RecentLocationPairEntity;", 0))), this.b.b());
    }

    @Override // app.chalo.recent.database.dao.recent.RecentLocationPairDao
    public final Object g(RecentLocationPairEntity recentLocationPairEntity, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new RecentLocationPairDaoImpl$insertLocationPair$2(this, recentLocationPairEntity, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.recent.database.dao.recent.RecentLocationPairDao
    public final List h() {
        return this.f2071a.W(new RecentLocationPairDaoImpl$getAllLocationPairsForCity$2(6, RecentLocationPairEntityMapper.f2098a, RecentLocationPairEntityMapper.class, "toRecentLocationPairEntity", "toRecentLocationPairEntity(Ljava/lang/String;Ljava/lang/String;Lapp/chalo/recent/database/entities/RecentLocationPairEndpointEntity;Lapp/chalo/recent/database/entities/RecentLocationPairEndpointEntity;JJ)Lapp/chalo/recent/database/entities/RecentLocationPairEntity;", 0)).b();
    }
}
