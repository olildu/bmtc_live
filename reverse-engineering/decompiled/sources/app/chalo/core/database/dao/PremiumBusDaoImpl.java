package app.chalo.core.database.dao;

import app.cash.sqldelight.coroutines.FlowQuery;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.cash.sqldelight.coroutines.FlowQuery$mapToOneOrNull$$inlined$map$1;
import app.chalo.core.Premium_reserve_ticket_ack_tableQueries;
import app.chalo.core.Premium_reserve_ticket_receipt_tableQueries;
import app.chalo.core.Premium_reserve_ticket_tableQueries;
import app.chalo.core.database.mappers.PremiumBusMappers;
import app.chalo.premiumbus.data.local.PremiumBusDao;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketAckType;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketEntity;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketReceiptEntity;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/database/dao/PremiumBusDaoImpl;", "Lapp/chalo/premiumbus/data/local/PremiumBusDao;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusDaoImpl implements PremiumBusDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Premium_reserve_ticket_tableQueries f2069a;
    public final Premium_reserve_ticket_receipt_tableQueries b;
    public final Premium_reserve_ticket_ack_tableQueries c;
    public final CoroutineContextProvider d;

    public PremiumBusDaoImpl(Premium_reserve_ticket_tableQueries query, Premium_reserve_ticket_receipt_tableQueries receiptQuery, Premium_reserve_ticket_ack_tableQueries ackQuery, CoroutineContextProvider coroutineContextProvider) {
        Intrinsics.i(query, "query");
        Intrinsics.i(receiptQuery, "receiptQuery");
        Intrinsics.i(ackQuery, "ackQuery");
        this.f2069a = query;
        this.b = receiptQuery;
        this.c = ackQuery;
        this.d = coroutineContextProvider;
    }

    @Override // app.chalo.premiumbus.data.local.PremiumBusDao
    public final FlowQuery$mapToList$$inlined$map$1 a(long j, String str, String str2) {
        return FlowQuery.a(FlowQuery.c(this.f2069a.b0(j, str, str2, new PremiumBusDaoImpl$getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement$1(39, PremiumBusMappers.f2096a, PremiumBusMappers.class, "toEntity", "toEntity(Ljava/lang/String;JJLapp/chalo/premiumbus/data/models/entity/PremiumReserveTicketStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/premiumbus/data/models/entity/PremiumStopDetailsInfo;Lapp/chalo/premiumbus/data/models/entity/PremiumStopDetailsInfo;ZLjava/util/List;Ljava/lang/String;Ljava/lang/Long;JJLapp/chalo/premiumbus/data/models/app/FirstBookingAppModel;Lapp/chalo/premiumbus/data/models/entity/PremiumReserveTicketStatus;Lapp/chalo/data/RefundInfoAppModel;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/premiumbus/data/models/entity/PremiumReserveTicketAckType;ZLjava/lang/String;)Lapp/chalo/premiumbus/data/models/entity/PremiumReserveTicketEntity;", 0))), this.d.b());
    }

    @Override // app.chalo.premiumbus.data.local.PremiumBusDao
    public final Object b(String str, List list, boolean z, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.d, new PremiumBusDaoImpl$updateTripFeedbackStatusForBookings$2(this, list, z, str, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.premiumbus.data.local.PremiumBusDao
    public final FlowQuery$mapToOneOrNull$$inlined$map$1 c(String bookingId) {
        Intrinsics.i(bookingId, "bookingId");
        return FlowQuery.b(FlowQuery.c(this.b.W(bookingId, new PremiumBusDaoImpl$getPremiumReserveTicketReceiptByIdAsFlow$1(13, PremiumBusMappers.f2096a, PremiumBusMappers.class, "toEntity", "toEntity(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lapp/chalo/productbooking/common/data/models/entity/RefundInfoEntityModel;)Lapp/chalo/premiumbus/data/models/entity/PremiumReserveTicketReceiptEntity;", 0))), this.d.b());
    }

    @Override // app.chalo.premiumbus.data.local.PremiumBusDao
    public final Object d(String str, ArrayList arrayList, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.d, new PremiumBusDaoImpl$clearExistingDataAndInsertPremiumReserveTicketsBookedThroughPass$2(this, str, arrayList, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.premiumbus.data.local.PremiumBusDao
    public final Object e(Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.d, new PremiumBusDaoImpl$deleteAllPremiumReserveTickets$2(this, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.premiumbus.data.local.PremiumBusDao
    public final Object f(String str, String str2, PremiumReserveTicketAckType premiumReserveTicketAckType, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.d, new PremiumBusDaoImpl$updateAcknowledgmentStatusForPremiumReserveTicket$2(this, true, premiumReserveTicketAckType, str, str2, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.premiumbus.data.local.PremiumBusDao
    public final Object g(String str, PremiumReserveTicketStatus premiumReserveTicketStatus, ContinuationImpl continuationImpl) {
        Object objA = ChaloCoreDatabaseKt.a(this.d, new PremiumBusDaoImpl$updatePremiumReserveTicketStatus$2(this, premiumReserveTicketStatus, str, null), continuationImpl);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.premiumbus.data.local.PremiumBusDao
    public final FlowQuery$mapToOneOrNull$$inlined$map$1 i(String bookingId) {
        Intrinsics.i(bookingId, "bookingId");
        return FlowQuery.b(FlowQuery.c(this.f2069a.e0(bookingId, new PremiumBusDaoImpl$getPremiumReserveTicketByIdAsFlow$1(32, PremiumBusMappers.f2096a, PremiumBusMappers.class, "toEntity", "toEntity(Ljava/lang/String;JJLapp/chalo/premiumbus/data/models/entity/PremiumReserveTicketStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/premiumbus/data/models/entity/PremiumStopDetailsInfo;Lapp/chalo/premiumbus/data/models/entity/PremiumStopDetailsInfo;ZLjava/util/List;Ljava/lang/String;Ljava/lang/Long;JJLapp/chalo/premiumbus/data/models/app/FirstBookingAppModel;Lapp/chalo/premiumbus/data/models/entity/PremiumReserveTicketStatus;Lapp/chalo/data/RefundInfoAppModel;Ljava/util/List;)Lapp/chalo/premiumbus/data/models/entity/PremiumReserveTicketEntity;", 0))), this.d.b());
    }

    @Override // app.chalo.premiumbus.data.local.PremiumBusDao
    public final Object j(String str, Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.d, new PremiumBusDaoImpl$getAllPremiumReserveTicketsWithSameFirstBookingId$2(this, str, null), continuation);
    }

    @Override // app.chalo.premiumbus.data.local.PremiumBusDao
    public final FlowQuery$mapToList$$inlined$map$1 k(String userId, String passId, String city) {
        Intrinsics.i(userId, "userId");
        Intrinsics.i(passId, "passId");
        Intrinsics.i(city, "city");
        return FlowQuery.a(FlowQuery.c(this.f2069a.Y(city, userId, passId, new PremiumBusDaoImpl$getAllPremiumReserveTicketsBookedThroughPass$1(32, PremiumBusMappers.f2096a, PremiumBusMappers.class, "toEntity", "toEntity(Ljava/lang/String;JJLapp/chalo/premiumbus/data/models/entity/PremiumReserveTicketStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/premiumbus/data/models/entity/PremiumStopDetailsInfo;Lapp/chalo/premiumbus/data/models/entity/PremiumStopDetailsInfo;ZLjava/util/List;Ljava/lang/String;Ljava/lang/Long;JJLapp/chalo/premiumbus/data/models/app/FirstBookingAppModel;Lapp/chalo/premiumbus/data/models/entity/PremiumReserveTicketStatus;Lapp/chalo/data/RefundInfoAppModel;Ljava/util/List;)Lapp/chalo/premiumbus/data/models/entity/PremiumReserveTicketEntity;", 0))), this.d.b());
    }

    @Override // app.chalo.premiumbus.data.local.PremiumBusDao
    public final Object l(List list, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.d, new PremiumBusDaoImpl$clearExistingDataAndInsertPremiumReserveTickets$2(this, list, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.premiumbus.data.local.PremiumBusDao
    public final Object m(PremiumReserveTicketEntity premiumReserveTicketEntity, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.d, new PremiumBusDaoImpl$insertPremiumReserveTicket$2(this, premiumReserveTicketEntity, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.premiumbus.data.local.PremiumBusDao
    public final Object n(String str, Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.d, new PremiumBusDaoImpl$getUniqueOriginDestinationPairs$2(this, str, null), continuation);
    }

    @Override // app.chalo.premiumbus.data.local.PremiumBusDao
    public final FlowQuery$mapToOneOrNull$$inlined$map$1 o(String userId, String str) {
        Intrinsics.i(userId, "userId");
        return FlowQuery.b(FlowQuery.c(this.f2069a.X(userId, str, new PremiumBusDaoImpl$getAckInfoForBooking$1(7, PremiumBusMappers.f2096a, PremiumBusMappers.class, "toEntity", "toEntity(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/premiumbus/data/models/entity/PremiumReserveTicketAckType;ZLjava/lang/String;)Lapp/chalo/premiumbus/data/models/entity/PremiumReserveTicketAckEntity;", 0))), this.d.b());
    }

    @Override // app.chalo.premiumbus.data.local.PremiumBusDao
    public final Object p(Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.d, new PremiumBusDaoImpl$getPremiumReserveTicketsBookedThroughPass$2(this, null, null, 0L, null, null), continuation);
    }

    @Override // app.chalo.premiumbus.data.local.PremiumBusDao
    public final Object r(String str, String str2, long j, long j2, Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.d, new PremiumBusDaoImpl$getAllPremiumReserveTicketsWithPendingTripFeedback$2(this, str2, str, j, j2, null), continuation);
    }

    @Override // app.chalo.premiumbus.data.local.PremiumBusDao
    public final Object t(PremiumReserveTicketReceiptEntity premiumReserveTicketReceiptEntity, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.d, new PremiumBusDaoImpl$insertPremiumReserveTicketReceipt$2(this, premiumReserveTicketReceiptEntity, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.premiumbus.data.local.PremiumBusDao
    public final FlowQuery$mapToList$$inlined$map$1 u(long j, long j2, String str, String str2) {
        return FlowQuery.a(FlowQuery.c(this.f2069a.a0(str, str2, j, j2, new PremiumBusDaoImpl$getAllPremiumReserveTicketsForCityBetweenGivenTime$1(32, PremiumBusMappers.f2096a, PremiumBusMappers.class, "toEntity", "toEntity(Ljava/lang/String;JJLapp/chalo/premiumbus/data/models/entity/PremiumReserveTicketStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/premiumbus/data/models/entity/PremiumStopDetailsInfo;Lapp/chalo/premiumbus/data/models/entity/PremiumStopDetailsInfo;ZLjava/util/List;Ljava/lang/String;Ljava/lang/Long;JJLapp/chalo/premiumbus/data/models/app/FirstBookingAppModel;Lapp/chalo/premiumbus/data/models/entity/PremiumReserveTicketStatus;Lapp/chalo/data/RefundInfoAppModel;Ljava/util/List;)Lapp/chalo/premiumbus/data/models/entity/PremiumReserveTicketEntity;", 0))), this.d.b());
    }

    @Override // app.chalo.premiumbus.data.local.PremiumBusDao
    public final FlowQuery$mapToList$$inlined$map$1 v(String str) {
        return FlowQuery.a(FlowQuery.c(this.f2069a.Z(str, new PremiumBusDaoImpl$getAllPremiumReserveTicketsForCity$1(32, PremiumBusMappers.f2096a, PremiumBusMappers.class, "toEntity", "toEntity(Ljava/lang/String;JJLapp/chalo/premiumbus/data/models/entity/PremiumReserveTicketStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/premiumbus/data/models/entity/PremiumStopDetailsInfo;Lapp/chalo/premiumbus/data/models/entity/PremiumStopDetailsInfo;ZLjava/util/List;Ljava/lang/String;Ljava/lang/Long;JJLapp/chalo/premiumbus/data/models/app/FirstBookingAppModel;Lapp/chalo/premiumbus/data/models/entity/PremiumReserveTicketStatus;Lapp/chalo/data/RefundInfoAppModel;Ljava/util/List;)Lapp/chalo/premiumbus/data/models/entity/PremiumReserveTicketEntity;", 0))), this.d.b());
    }
}
