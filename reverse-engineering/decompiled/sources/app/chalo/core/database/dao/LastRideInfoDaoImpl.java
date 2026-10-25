package app.chalo.core.database.dao;

import app.chalo.core.Last_ride_info_tableQueries;
import app.chalo.models.LastRideInfo;
import app.chalo.models.mticketing.dao.LastRideInfoDao;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.vault.db.ChaloCoreDatabaseKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/database/dao/LastRideInfoDaoImpl;", "Lapp/chalo/models/mticketing/dao/LastRideInfoDao;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LastRideInfoDaoImpl implements LastRideInfoDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Last_ride_info_tableQueries f2052a;
    public final CoroutineContextProvider b;

    public LastRideInfoDaoImpl(Last_ride_info_tableQueries lastRideInfoTableQueries, CoroutineContextProvider coroutineContextProvider) {
        Intrinsics.i(lastRideInfoTableQueries, "lastRideInfoTableQueries");
        this.f2052a = lastRideInfoTableQueries;
        this.b = coroutineContextProvider;
    }

    @Override // app.chalo.models.mticketing.dao.LastRideInfoDao
    public final Object b(String str, LastRideInfo lastRideInfo, ContinuationImpl continuationImpl) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new LastRideInfoDaoImpl$storeLastRideInfo$2(this, lastRideInfo, str, null), continuationImpl);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.models.mticketing.dao.LastRideInfoDao
    public final Object e(String str, ContinuationImpl continuationImpl) {
        return ChaloCoreDatabaseKt.a(this.b, new LastRideInfoDaoImpl$getLastRideInfo$2(this, str, null), continuationImpl);
    }
}
