package app.chalo.core.database.dao;

import app.cash.sqldelight.coroutines.FlowQuery;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.cash.sqldelight.coroutines.FlowQuery$mapToOneOrNull$$inlined$map$1;
import app.chalo.core.Ondc_metro_ticket_tableQueries;
import app.chalo.core.database.mappers.OndcMetroTicketEntityMapper;
import app.chalo.metro.dao.ondc.OndcMetroTicketDao;
import app.chalo.metro.dao.ondc.OndcMetroTicketEntity;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/database/dao/OndcMetroTicketDaoImpl;", "Lapp/chalo/metro/dao/ondc/OndcMetroTicketDao;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OndcMetroTicketDaoImpl implements OndcMetroTicketDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ondc_metro_ticket_tableQueries f2064a;
    public final CoroutineContextProvider b;

    public OndcMetroTicketDaoImpl(Ondc_metro_ticket_tableQueries ondcMetroTicketTableQueries, CoroutineContextProvider coroutineContextProvider) {
        Intrinsics.i(ondcMetroTicketTableQueries, "ondcMetroTicketTableQueries");
        this.f2064a = ondcMetroTicketTableQueries;
        this.b = coroutineContextProvider;
    }

    @Override // app.chalo.metro.dao.ondc.OndcMetroTicketDao
    public final Object a(Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new OndcMetroTicketDaoImpl$deleteMetroTickets$2(this, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.metro.dao.ondc.OndcMetroTicketDao
    public final Object b(String str, String str2, Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.b, new OndcMetroTicketDaoImpl$getMetroTicket$2(this, str, str2, null), continuation);
    }

    @Override // app.chalo.metro.dao.ondc.OndcMetroTicketDao
    public final FlowQuery$mapToOneOrNull$$inlined$map$1 c(String bookingId, String str) {
        Intrinsics.i(bookingId, "bookingId");
        return FlowQuery.b(FlowQuery.c(this.f2064a.a0(bookingId, str, new OndcMetroTicketDaoImpl$getMetroTicketAsFlow$1(20, OndcMetroTicketEntityMapper.f2093a, OndcMetroTicketEntityMapper.class, "mapper", "mapper(Ljava/lang/String;Ljava/lang/String;JJLapp/chalo/ondc/model/app/OndcMetroTicketStatus;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/data/RefundInfoAppModel;Ljava/util/List;Lapp/chalo/productbooking/common/data/models/entity/PaymentInfoEntityModel;Ljava/lang/String;Ljava/lang/String;)Lapp/chalo/metro/dao/ondc/OndcMetroTicketEntity;", 0))), this.b.b());
    }

    @Override // app.chalo.metro.dao.ondc.OndcMetroTicketDao
    public final FlowQuery$mapToList$$inlined$map$1 d(String str, String str2) {
        return FlowQuery.a(FlowQuery.c(this.f2064a.Y(str, str2, new OndcMetroTicketDaoImpl$getAllMetroTicketsAsFlow$1(20, OndcMetroTicketEntityMapper.f2093a, OndcMetroTicketEntityMapper.class, "mapper", "mapper(Ljava/lang/String;Ljava/lang/String;JJLapp/chalo/ondc/model/app/OndcMetroTicketStatus;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/data/RefundInfoAppModel;Ljava/util/List;Lapp/chalo/productbooking/common/data/models/entity/PaymentInfoEntityModel;Ljava/lang/String;Ljava/lang/String;)Lapp/chalo/metro/dao/ondc/OndcMetroTicketEntity;", 0))), this.b.b());
    }

    @Override // app.chalo.metro.dao.ondc.OndcMetroTicketDao
    public final Object e(OndcMetroTicketEntity ondcMetroTicketEntity, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new OndcMetroTicketDaoImpl$insertMetroTicket$2(this, ondcMetroTicketEntity, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.metro.dao.ondc.OndcMetroTicketDao
    public final Object f(ArrayList arrayList, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new OndcMetroTicketDaoImpl$deleteAllAndInsertNewTickets$2(this, arrayList, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }
}
