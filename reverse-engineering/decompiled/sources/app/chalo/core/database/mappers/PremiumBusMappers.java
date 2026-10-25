package app.chalo.core.database.mappers;

import app.chalo.core.Premium_reserve_ticket_ack_table;
import app.chalo.core.Premium_reserve_ticket_table;
import app.chalo.data.RefundInfoAppModel;
import app.chalo.premiumbus.data.models.app.FirstBookingAppModel;
import app.chalo.premiumbus.data.models.app.PremiumBusTripStatus;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketAckEntity;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketAckType;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketBookingProperties;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketEntity;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketFareAndPassengerProperties;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketTripProperties;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketValidationProperties;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTripEntity;
import app.chalo.premiumbus.data.models.entity.PremiumStopDetailsInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/database/mappers/PremiumBusMappers;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusMappers {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PremiumBusMappers f2096a = new PremiumBusMappers();

    public static PremiumReserveTicketAckEntity a(String bookingId, String productType, String productSubType, String userId, PremiumReserveTicketAckType ackNeededFor, boolean z, String str) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        Intrinsics.i(userId, "userId");
        Intrinsics.i(ackNeededFor, "ackNeededFor");
        return new PremiumReserveTicketAckEntity(bookingId, productType, productSubType, userId, ackNeededFor, z, str);
    }

    public static PremiumReserveTicketEntity b(String str, long j, long j2, PremiumReserveTicketStatus premiumReserveTicketStatus, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, long j3, long j4, long j5, String str10, String str11, String str12, String str13, String str14, PremiumStopDetailsInfo premiumStopDetailsInfo, PremiumStopDetailsInfo premiumStopDetailsInfo2, boolean z, List list, String str15, Long l, long j6, long j7, FirstBookingAppModel firstBookingAppModel, PremiumReserveTicketStatus premiumReserveTicketStatus2, RefundInfoAppModel refundInfoAppModel, List list2) {
        return new PremiumReserveTicketEntity(new PremiumReserveTicketBookingProperties(str, j, str8, str13, str14, str5, str12, premiumReserveTicketStatus, str2, str3, str4, firstBookingAppModel, premiumReserveTicketStatus2, refundInfoAppModel, list2), new PremiumReserveTicketTripProperties(str9, j3, j4, j5, str10, str11, premiumStopDetailsInfo, premiumStopDetailsInfo2, z), new PremiumReserveTicketValidationProperties(str6, str7, j6, j7, l), new PremiumReserveTicketFareAndPassengerProperties(j2, str15, list));
    }

    public static PremiumReserveTripEntity c(String cityId, String bookingId, String tripId, PremiumBusTripStatus tripStatus, boolean z) {
        Intrinsics.i(cityId, "cityId");
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(tripId, "tripId");
        Intrinsics.i(tripStatus, "tripStatus");
        return new PremiumReserveTripEntity(cityId, bookingId, tripId, tripStatus, z);
    }

    public static Premium_reserve_ticket_ack_table d(PremiumReserveTicketAckEntity premiumReserveTicketAckEntity) {
        Intrinsics.i(premiumReserveTicketAckEntity, "<this>");
        return new Premium_reserve_ticket_ack_table(premiumReserveTicketAckEntity.f7134a, premiumReserveTicketAckEntity.b, premiumReserveTicketAckEntity.c, premiumReserveTicketAckEntity.d, premiumReserveTicketAckEntity.e, premiumReserveTicketAckEntity.f, premiumReserveTicketAckEntity.g);
    }

    public static Premium_reserve_ticket_table e(PremiumReserveTicketEntity premiumReserveTicketEntity) {
        Intrinsics.i(premiumReserveTicketEntity, "<this>");
        PremiumReserveTicketBookingProperties premiumReserveTicketBookingProperties = premiumReserveTicketEntity.f7136a;
        String str = premiumReserveTicketBookingProperties.f7135a;
        long j = premiumReserveTicketBookingProperties.b;
        PremiumReserveTicketFareAndPassengerProperties premiumReserveTicketFareAndPassengerProperties = premiumReserveTicketEntity.d;
        long j2 = premiumReserveTicketFareAndPassengerProperties.f7137a;
        PremiumReserveTicketStatus premiumReserveTicketStatus = premiumReserveTicketBookingProperties.h;
        String str2 = premiumReserveTicketBookingProperties.i;
        String str3 = premiumReserveTicketBookingProperties.j;
        String str4 = premiumReserveTicketBookingProperties.k;
        String str5 = premiumReserveTicketBookingProperties.f;
        PremiumReserveTicketValidationProperties premiumReserveTicketValidationProperties = premiumReserveTicketEntity.c;
        String str6 = premiumReserveTicketValidationProperties.f7140a;
        String str7 = premiumReserveTicketValidationProperties.b;
        String str8 = premiumReserveTicketBookingProperties.c;
        PremiumReserveTicketTripProperties premiumReserveTicketTripProperties = premiumReserveTicketEntity.b;
        return new Premium_reserve_ticket_table(str, j, j2, premiumReserveTicketStatus, str2, str3, str4, str5, str6, str7, str8, premiumReserveTicketTripProperties.f7139a, premiumReserveTicketTripProperties.b, premiumReserveTicketTripProperties.c, premiumReserveTicketTripProperties.d, premiumReserveTicketTripProperties.e, premiumReserveTicketTripProperties.f, premiumReserveTicketBookingProperties.g, premiumReserveTicketBookingProperties.d, premiumReserveTicketBookingProperties.e, premiumReserveTicketTripProperties.g, premiumReserveTicketTripProperties.h, premiumReserveTicketTripProperties.i, premiumReserveTicketFareAndPassengerProperties.b, premiumReserveTicketFareAndPassengerProperties.c, premiumReserveTicketValidationProperties.e, premiumReserveTicketValidationProperties.c, premiumReserveTicketValidationProperties.d, premiumReserveTicketBookingProperties.l, premiumReserveTicketBookingProperties.m, premiumReserveTicketBookingProperties.n, premiumReserveTicketBookingProperties.o);
    }
}
