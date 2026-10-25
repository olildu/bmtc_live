package app.chalo.core.database.dao;

import app.cash.sqldelight.coroutines.FlowQuery;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.cash.sqldelight.coroutines.FlowQuery$mapToOneOrNull$$inlined$map$1;
import app.chalo.core.Ondc_ticket_receipt_tableQueries;
import app.chalo.core.Ondc_ticket_tableQueries;
import app.chalo.core.database.mappers.OndcTicketEntityMapper;
import app.chalo.core.database.mappers.OndcTicketReceiptMapper;
import app.chalo.models.ondc.OndcTicketReceiptEntity;
import app.chalo.ondc.dao.OndcTicketDao;
import app.chalo.ondc.dao.OndcTicketEntity;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.vault.db.ChaloCoreDatabaseKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/database/dao/OndcTicketDaoImpl;", "Lapp/chalo/ondc/dao/OndcTicketDao;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OndcTicketDaoImpl implements OndcTicketDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ondc_ticket_tableQueries f2065a;
    public final Ondc_ticket_receipt_tableQueries b;
    public final CoroutineContextProvider c;

    public OndcTicketDaoImpl(Ondc_ticket_tableQueries ondcTicketTableQueries, Ondc_ticket_receipt_tableQueries ondcTicketReceiptTableQueries, CoroutineContextProvider coroutineContextProvider) {
        Intrinsics.i(ondcTicketTableQueries, "ondcTicketTableQueries");
        Intrinsics.i(ondcTicketReceiptTableQueries, "ondcTicketReceiptTableQueries");
        this.f2065a = ondcTicketTableQueries;
        this.b = ondcTicketReceiptTableQueries;
        this.c = coroutineContextProvider;
    }

    @Override // app.chalo.ondc.dao.OndcTicketDao
    public final FlowQuery$mapToOneOrNull$$inlined$map$1 a(String bookingId) {
        Intrinsics.i(bookingId, "bookingId");
        return FlowQuery.b(FlowQuery.c(this.b.W(bookingId, new OndcTicketDaoImpl$getOndcTicketReceiptFlow$1(13, OndcTicketReceiptMapper.f2095a, OndcTicketReceiptMapper.class, "mapper", "mapper(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lapp/chalo/models/ondc/OndcTicketReceiptEntity;", 0))), this.c.b());
    }

    @Override // app.chalo.ondc.dao.OndcTicketDao
    public final FlowQuery$mapToOneOrNull$$inlined$map$1 b(String bookingId, String str) {
        Intrinsics.i(bookingId, "bookingId");
        return FlowQuery.b(FlowQuery.c(this.f2065a.Z(bookingId, str, new OndcTicketDaoImpl$getOndcTicketAsFlow$1(18, OndcTicketEntityMapper.f2094a, OndcTicketEntityMapper.class, "mapper", "mapper(Ljava/lang/String;Ljava/lang/String;JJLapp/chalo/ondc/model/app/OndcTicketStatus;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/data/RefundInfoAppModel;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Lapp/chalo/ondc/dao/OndcTicketEntity;", 0))), this.c.b());
    }

    @Override // app.chalo.ondc.dao.OndcTicketDao
    public final Object c(OndcTicketReceiptEntity ondcTicketReceiptEntity, ContinuationImpl continuationImpl) {
        Object objA = ChaloCoreDatabaseKt.a(this.c, new OndcTicketDaoImpl$insertOndcTicketReceipt$2(this, ondcTicketReceiptEntity, null), continuationImpl);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.ondc.dao.OndcTicketDao
    public final Object d(String str, String str2, Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.c, new OndcTicketDaoImpl$getAllOndcTickets$2(this, str, str2, null), continuation);
    }

    @Override // app.chalo.ondc.dao.OndcTicketDao
    public final FlowQuery$mapToList$$inlined$map$1 e(String str, String str2) {
        return FlowQuery.a(FlowQuery.c(this.f2065a.X(str, str2, new OndcTicketDaoImpl$getAllOndcTicketsAsFlow$1(18, OndcTicketEntityMapper.f2094a, OndcTicketEntityMapper.class, "mapper", "mapper(Ljava/lang/String;Ljava/lang/String;JJLapp/chalo/ondc/model/app/OndcTicketStatus;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/data/RefundInfoAppModel;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Lapp/chalo/ondc/dao/OndcTicketEntity;", 0))), this.c.b());
    }

    @Override // app.chalo.ondc.dao.OndcTicketDao
    public final Object f(ArrayList arrayList, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.c, new OndcTicketDaoImpl$replaceOndcTickets$2(this, arrayList, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.ondc.dao.OndcTicketDao
    public final Object g(Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.c, new OndcTicketDaoImpl$deleteOndcTickets$2(this, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.ondc.dao.OndcTicketDao
    public final Object i(String str, String str2, Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.c, new OndcTicketDaoImpl$getOndcTicket$2(this, str, str2, null), continuation);
    }

    @Override // app.chalo.ondc.dao.OndcTicketDao
    public final Object j(OndcTicketEntity ondcTicketEntity, ContinuationImpl continuationImpl) {
        Object objA = ChaloCoreDatabaseKt.a(this.c, new OndcTicketDaoImpl$insertOndcTicket$2(this, ondcTicketEntity, null), continuationImpl);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }
}
