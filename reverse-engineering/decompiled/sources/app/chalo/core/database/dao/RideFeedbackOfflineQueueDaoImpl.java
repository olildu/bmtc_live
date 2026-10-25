package app.chalo.core.database.dao;

import app.chalo.core.Ride_feedback_offline_queue_tableQueries;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.ridefeedback.data.dao.RideFeedbackOfflineQueueDao;
import app.chalo.ridefeedback.data.dao.RideFeedbackOfflineQueueEntity;
import app.chalo.vault.db.ChaloCoreDatabaseKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/database/dao/RideFeedbackOfflineQueueDaoImpl;", "Lapp/chalo/ridefeedback/data/dao/RideFeedbackOfflineQueueDao;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RideFeedbackOfflineQueueDaoImpl implements RideFeedbackOfflineQueueDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ride_feedback_offline_queue_tableQueries f2078a;
    public final CoroutineContextProvider b;

    public RideFeedbackOfflineQueueDaoImpl(Ride_feedback_offline_queue_tableQueries rideFeedbackOfflineQueueTableQueries, CoroutineContextProvider coroutineContextProvider) {
        Intrinsics.i(rideFeedbackOfflineQueueTableQueries, "rideFeedbackOfflineQueueTableQueries");
        this.f2078a = rideFeedbackOfflineQueueTableQueries;
        this.b = coroutineContextProvider;
    }

    @Override // app.chalo.ridefeedback.data.dao.RideFeedbackOfflineQueueDao
    public final Object b(RideFeedbackOfflineQueueEntity rideFeedbackOfflineQueueEntity, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new RideFeedbackOfflineQueueDaoImpl$insertOfflineFeedback$2(this, rideFeedbackOfflineQueueEntity, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.ridefeedback.data.dao.RideFeedbackOfflineQueueDao
    public final Object g(Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new RideFeedbackOfflineQueueDaoImpl$deleteAllOfflineFeedback$2(this, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.ridefeedback.data.dao.RideFeedbackOfflineQueueDao
    public final Object i(List list, String str, String str2, SuspendLambda suspendLambda) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new RideFeedbackOfflineQueueDaoImpl$deleteOfflineFeedback$2(this, list, str, str2, null), suspendLambda);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.ridefeedback.data.dao.RideFeedbackOfflineQueueDao
    public final Object j(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        return ChaloCoreDatabaseKt.a(this.b, new RideFeedbackOfflineQueueDaoImpl$getAllOfflineFeedback$2(this, str, str2, str3, null), continuationImpl);
    }
}
