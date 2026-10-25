package app.chalo.core.database.dao;

import app.chalo.core.Mticket_activation_store_tableQueries;
import app.chalo.models.mticketing.dao.MTicketActivationStoreDao;
import app.chalo.models.mticketing.entity.MTicketActivationInfoEntityModel;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.vault.db.ChaloCoreDatabaseKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/database/dao/MTicketActivationStoreDaoImpl;", "Lapp/chalo/models/mticketing/dao/MTicketActivationStoreDao;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MTicketActivationStoreDaoImpl implements MTicketActivationStoreDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Mticket_activation_store_tableQueries f2053a;
    public final CoroutineContextProvider b;

    public MTicketActivationStoreDaoImpl(Mticket_activation_store_tableQueries mTicketActivationStoreTableQueries, CoroutineContextProvider coroutineContextProvider) {
        Intrinsics.i(mTicketActivationStoreTableQueries, "mTicketActivationStoreTableQueries");
        this.f2053a = mTicketActivationStoreTableQueries;
        this.b = coroutineContextProvider;
    }

    @Override // app.chalo.models.mticketing.dao.MTicketActivationStoreDao
    public final Object a(String str, String str2, Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.b, new MTicketActivationStoreDaoImpl$getMTicketActivationInfo$2(this, str, str2, null), continuation);
    }

    @Override // app.chalo.models.mticketing.dao.MTicketActivationStoreDao
    public final Object b(MTicketActivationInfoEntityModel mTicketActivationInfoEntityModel, ContinuationImpl continuationImpl) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new MTicketActivationStoreDaoImpl$setMTicketActivationInfo$2(this, mTicketActivationInfoEntityModel, null), continuationImpl);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }
}
