package app.chalo.core.database.dao;

import app.cash.sqldelight.coroutines.FlowQuery;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.cash.sqldelight.coroutines.FlowQuery$mapToOneOrNull$$inlined$map$1;
import app.chalo.core.Instant_ticket_receipt_tableQueries;
import app.chalo.core.Instant_ticket_tableQueries;
import app.chalo.core.database.mappers.InstantTicketEntityMapper;
import app.chalo.core.database.mappers.InstantTicketReceiptMapper;
import app.chalo.instantticket.data.dao.InstantTicketDao;
import app.chalo.instantticket.data.model.InstantTicketEntity;
import app.chalo.instantticket.data.model.InstantTicketReceipt;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.vault.db.ChaloCoreDatabaseKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/database/dao/InstantTicketDaoImpl;", "Lapp/chalo/instantticket/data/dao/InstantTicketDao;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InstantTicketDaoImpl implements InstantTicketDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant_ticket_tableQueries f2051a;
    public final Instant_ticket_receipt_tableQueries b;
    public final CoroutineContextProvider c;

    public InstantTicketDaoImpl(Instant_ticket_tableQueries instantTicketTableQueries, Instant_ticket_receipt_tableQueries instantTicketReceiptTableQueries, CoroutineContextProvider coroutineContextProvider) {
        Intrinsics.i(instantTicketTableQueries, "instantTicketTableQueries");
        Intrinsics.i(instantTicketReceiptTableQueries, "instantTicketReceiptTableQueries");
        this.f2051a = instantTicketTableQueries;
        this.b = instantTicketReceiptTableQueries;
        this.c = coroutineContextProvider;
    }

    @Override // app.chalo.instantticket.data.dao.InstantTicketDao
    public final FlowQuery$mapToOneOrNull$$inlined$map$1 a(String bookingId) {
        Intrinsics.i(bookingId, "bookingId");
        return FlowQuery.b(FlowQuery.c(this.b.W(bookingId, new InstantTicketDaoImpl$getInstantTicketReceiptFlow$1(20, InstantTicketReceiptMapper.f2089a, InstantTicketReceiptMapper.class, "mapper", "mapper(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lapp/chalo/providers/RouteNamingSchemeType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/receipt/ReceiptFareDataApiResponseModel;)Lapp/chalo/instantticket/data/model/InstantTicketReceipt;", 0))), this.c.b());
    }

    @Override // app.chalo.instantticket.data.dao.InstantTicketDao
    public final Object b(InstantTicketReceipt instantTicketReceipt, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.c, new InstantTicketDaoImpl$insertInstantTicketReceipt$2(this, instantTicketReceipt, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.instantticket.data.dao.InstantTicketDao
    public final Object c(long j, String str, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.c, new InstantTicketDaoImpl$updateInstantTicketExpiryTime$2(this, j, str, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.instantticket.data.dao.InstantTicketDao
    public final Object d(InstantTicketEntity instantTicketEntity, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.c, new InstantTicketDaoImpl$insertInstantTicket$2(this, instantTicketEntity, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.instantticket.data.dao.InstantTicketDao
    public final Object e(String str, List list, Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.c, new InstantTicketDaoImpl$getAllInstantTickets$2(this, list, str, null), continuation);
    }

    @Override // app.chalo.instantticket.data.dao.InstantTicketDao
    public final Object f(Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.c, new InstantTicketDaoImpl$deleteInstantTickets$2(this, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.instantticket.data.dao.InstantTicketDao
    public final FlowQuery$mapToList$$inlined$map$1 g(String str, List cityIdList) {
        Intrinsics.i(cityIdList, "cityIdList");
        InstantTicketDaoImpl$getAllInstantTicketsAsFlow$1 instantTicketDaoImpl$getAllInstantTicketsAsFlow$1 = new InstantTicketDaoImpl$getAllInstantTicketsAsFlow$1(19, InstantTicketEntityMapper.f2088a, InstantTicketEntityMapper.class, "mapper", "mapper(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLapp/chalo/instantticket/data/model/InstantTicketStatus;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lapp/chalo/productbooking/common/data/models/entity/RefundInfoEntityModel;)Lapp/chalo/instantticket/data/model/InstantTicketEntity;", 0);
        return FlowQuery.a(FlowQuery.c(this.f2051a.Z(cityIdList, str, instantTicketDaoImpl$getAllInstantTicketsAsFlow$1)), this.c.b());
    }

    @Override // app.chalo.instantticket.data.dao.InstantTicketDao
    public final Object h(ArrayList arrayList, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.c, new InstantTicketDaoImpl$replaceInstantTickets$2(this, arrayList, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.instantticket.data.dao.InstantTicketDao
    public final FlowQuery$mapToOneOrNull$$inlined$map$1 i(String bookingId, String str) {
        Intrinsics.i(bookingId, "bookingId");
        return FlowQuery.b(FlowQuery.c(this.f2051a.b0(bookingId, str, new InstantTicketDaoImpl$getInstantTicketAsFlow$1(19, InstantTicketEntityMapper.f2088a, InstantTicketEntityMapper.class, "mapper", "mapper(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLapp/chalo/instantticket/data/model/InstantTicketStatus;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lapp/chalo/productbooking/common/data/models/entity/RefundInfoEntityModel;)Lapp/chalo/instantticket/data/model/InstantTicketEntity;", 0))), this.c.b());
    }

    @Override // app.chalo.instantticket.data.dao.InstantTicketDao
    public final FlowQuery$mapToList$$inlined$map$1 j(String str, List cityIdList) {
        Intrinsics.i(cityIdList, "cityIdList");
        InstantTicketDaoImpl$getActiveOrPaymentProcessingInstantTicketsAsFlow$1 instantTicketDaoImpl$getActiveOrPaymentProcessingInstantTicketsAsFlow$1 = new InstantTicketDaoImpl$getActiveOrPaymentProcessingInstantTicketsAsFlow$1(19, InstantTicketEntityMapper.f2088a, InstantTicketEntityMapper.class, "mapper", "mapper(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLapp/chalo/instantticket/data/model/InstantTicketStatus;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lapp/chalo/productbooking/common/data/models/entity/RefundInfoEntityModel;)Lapp/chalo/instantticket/data/model/InstantTicketEntity;", 0);
        return FlowQuery.a(FlowQuery.c(this.f2051a.X(cityIdList, str, instantTicketDaoImpl$getActiveOrPaymentProcessingInstantTicketsAsFlow$1)), this.c.b());
    }

    @Override // app.chalo.instantticket.data.dao.InstantTicketDao
    public final Object k(String str, String str2, ContinuationImpl continuationImpl) {
        return ChaloCoreDatabaseKt.a(this.c, new InstantTicketDaoImpl$getInstantTicket$2(this, str, str2, null), continuationImpl);
    }
}
