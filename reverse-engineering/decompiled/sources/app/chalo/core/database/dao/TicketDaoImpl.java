package app.chalo.core.database.dao;

import app.cash.sqldelight.coroutines.FlowQuery;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.chalo.core.TicketQueries;
import app.chalo.core.database.mappers.TicketTableMapper;
import app.chalo.models.mticketing.MTicket;
import app.chalo.models.mticketing.MTicketTripReceipt;
import app.chalo.models.mticketing.dao.TicketDao;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/database/dao/TicketDaoImpl;", "Lapp/chalo/models/mticketing/dao/TicketDao;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TicketDaoImpl implements TicketDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TicketQueries f2084a;
    public final CoroutineContextProvider b;

    public TicketDaoImpl(TicketQueries ticketQueries, CoroutineContextProvider coroutineContextProvider) {
        Intrinsics.i(ticketQueries, "ticketQueries");
        this.f2084a = ticketQueries;
        this.b = coroutineContextProvider;
    }

    @Override // app.chalo.models.mticketing.dao.TicketDao
    public final Object a(MTicket mTicket, ContinuationImpl continuationImpl) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new TicketDaoImpl$insertOrUpdate$2(this, mTicket, null), continuationImpl);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.models.mticketing.dao.TicketDao
    public final Object b(String str, Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.b, new TicketDaoImpl$getCitySpecificTicketCount$2(this, str, null), continuation);
    }

    @Override // app.chalo.models.mticketing.dao.TicketDao
    public final Object c(String str, ContinuationImpl continuationImpl) {
        return ChaloCoreDatabaseKt.a(this.b, new TicketDaoImpl$getTicketFromBookingId$2(this, str, null), continuationImpl);
    }

    @Override // app.chalo.models.mticketing.dao.TicketDao
    public final Object d(String str, MTicketTripReceipt mTicketTripReceipt, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new TicketDaoImpl$addTripReceiptToMTicket$2(this, mTicketTripReceipt, str, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.models.mticketing.dao.TicketDao
    public final FlowQuery$mapToList$$inlined$map$1 e(String str) {
        return FlowQuery.a(FlowQuery.c(this.f2084a.W(str, new TicketDaoImpl$getAllTickets$1(28, TicketTableMapper.f2112a, TicketTableMapper.class, "mapper", "mapper(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/citydata/data/model/app/RouteStopsInfo;Lapp/chalo/citydata/data/model/app/RouteStopsInfo;Ljava/util/Map;JJZJZLjava/lang/Long;Lapp/chalo/models/userprofile/UserProfile;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/models/mticketing/MTicketConfiguration;Ljava/lang/Boolean;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/models/mticketing/MTicketTripReceipt;)Lapp/chalo/models/mticketing/MTicket;", 0))), this.b.b());
    }

    @Override // app.chalo.models.mticketing.dao.TicketDao
    public final Object f(Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new TicketDaoImpl$deleteAllTicketData$2(this, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.models.mticketing.dao.TicketDao
    public final Object g(String str, ContinuationImpl continuationImpl) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new TicketDaoImpl$updateExpiryState$2(this, str, null), continuationImpl);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.models.mticketing.dao.TicketDao
    public final Object h(String str, String str2, ContinuationImpl continuationImpl) {
        return ChaloCoreDatabaseKt.a(this.b, new TicketDaoImpl$getCurrentTicket$2(this, str, str2, null), continuationImpl);
    }
}
