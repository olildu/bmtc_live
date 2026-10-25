package app.chalo.core.database.dao;

import app.cash.sqldelight.coroutines.FlowQuery;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.cash.sqldelight.coroutines.FlowQuery$mapToOneOrNull$$inlined$map$1;
import app.chalo.core.Metro_ticket_tableQueries;
import app.chalo.core.database.mappers.MetroTicketEntityMapper;
import app.chalo.metro.dao.MetroTicketDao;
import app.chalo.metro.dao.MetroTicketEntity;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.vault.db.ChaloCoreDatabaseKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/database/dao/MetroTicketDaoImpl;", "Lapp/chalo/metro/dao/MetroTicketDao;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MetroTicketDaoImpl implements MetroTicketDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Metro_ticket_tableQueries f2054a;
    public final CoroutineContextProvider b;

    public MetroTicketDaoImpl(Metro_ticket_tableQueries metroTicketTableQueries, CoroutineContextProvider coroutineContextProvider) {
        Intrinsics.i(metroTicketTableQueries, "metroTicketTableQueries");
        this.f2054a = metroTicketTableQueries;
        this.b = coroutineContextProvider;
    }

    @Override // app.chalo.metro.dao.MetroTicketDao
    public final Object a(Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new MetroTicketDaoImpl$deleteMetroTickets$2(this, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.metro.dao.MetroTicketDao
    public final Object b(String str, String str2, Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.b, new MetroTicketDaoImpl$getMetroTicket$2(this, str, str2, null), continuation);
    }

    @Override // app.chalo.metro.dao.MetroTicketDao
    public final FlowQuery$mapToOneOrNull$$inlined$map$1 c(String bookingId, String str) {
        Intrinsics.i(bookingId, "bookingId");
        return FlowQuery.b(FlowQuery.c(this.f2054a.Z(bookingId, str, new MetroTicketDaoImpl$getMetroTicketAsFlow$1(16, MetroTicketEntityMapper.f2090a, MetroTicketEntityMapper.class, "mapper", "mapper(Ljava/lang/String;Ljava/lang/String;JJLapp/chalo/metro/data/app/MetroTicketStatus;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Map;Ljava/lang/String;Lapp/chalo/metro/dao/MetroTicketStopDetailsEntity;Lapp/chalo/metro/dao/MetroTicketStopDetailsEntity;Lapp/chalo/data/RefundInfoAppModel;)Lapp/chalo/metro/dao/MetroTicketEntity;", 0))), this.b.b());
    }

    @Override // app.chalo.metro.dao.MetroTicketDao
    public final FlowQuery$mapToList$$inlined$map$1 d(String str, String str2) {
        return FlowQuery.a(FlowQuery.c(this.f2054a.X(str, str2, new MetroTicketDaoImpl$getAllMetroTicketsAsFlow$1(16, MetroTicketEntityMapper.f2090a, MetroTicketEntityMapper.class, "mapper", "mapper(Ljava/lang/String;Ljava/lang/String;JJLapp/chalo/metro/data/app/MetroTicketStatus;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Map;Ljava/lang/String;Lapp/chalo/metro/dao/MetroTicketStopDetailsEntity;Lapp/chalo/metro/dao/MetroTicketStopDetailsEntity;Lapp/chalo/data/RefundInfoAppModel;)Lapp/chalo/metro/dao/MetroTicketEntity;", 0))), this.b.b());
    }

    @Override // app.chalo.metro.dao.MetroTicketDao
    public final Object e(ArrayList arrayList, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new MetroTicketDaoImpl$clearExistingDataAndInsertMetroTickets$2(this, arrayList, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.metro.dao.MetroTicketDao
    public final Object f(MetroTicketEntity metroTicketEntity, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new MetroTicketDaoImpl$insertMetroTicket$2(this, metroTicketEntity, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.metro.dao.MetroTicketDao
    public final Object g(ArrayList arrayList, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new MetroTicketDaoImpl$updateMetroTicketBookingStatusList$2(this, arrayList, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }
}
