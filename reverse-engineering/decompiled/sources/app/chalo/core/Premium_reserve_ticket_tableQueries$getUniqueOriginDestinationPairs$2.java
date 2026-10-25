package app.chalo.core;

import app.chalo.data.RefundInfoAppModel;
import app.chalo.premiumbus.data.models.app.FirstBookingAppModel;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import app.chalo.premiumbus.data.models.entity.PremiumStopDetailsInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.FunctionN;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class Premium_reserve_ticket_tableQueries$getUniqueOriginDestinationPairs$2 implements FunctionN<Premium_reserve_ticket_table> {
    @Override // kotlin.jvm.functions.FunctionN
    public final Object invoke(Object[] objArr) {
        if (objArr.length != 32) {
            throw new IllegalArgumentException("Expected 32 arguments");
        }
        String bookingId = (String) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        long jLongValue2 = ((Number) objArr[2]).longValue();
        PremiumReserveTicketStatus ticketStatus = (PremiumReserveTicketStatus) objArr[3];
        String paymentMode = (String) objArr[4];
        String str = (String) objArr[5];
        String str2 = (String) objArr[6];
        String city_ = (String) objArr[7];
        String tone = (String) objArr[8];
        String qrCode = (String) objArr[9];
        String configurationId = (String) objArr[10];
        String tripId = (String) objArr[11];
        long jLongValue3 = ((Number) objArr[12]).longValue();
        long jLongValue4 = ((Number) objArr[13]).longValue();
        long jLongValue5 = ((Number) objArr[14]).longValue();
        String routeId = (String) objArr[15];
        String routeName = (String) objArr[16];
        String userId = (String) objArr[17];
        String productType = (String) objArr[18];
        String productSubType = (String) objArr[19];
        PremiumStopDetailsInfo fromStopDetails = (PremiumStopDetailsInfo) objArr[20];
        PremiumStopDetailsInfo toStopDetails = (PremiumStopDetailsInfo) objArr[21];
        boolean zBooleanValue = ((Boolean) objArr[22]).booleanValue();
        List passengerCategoryDetails = (List) objArr[23];
        String str3 = (String) objArr[24];
        Long l = (Long) objArr[25];
        long jLongValue6 = ((Number) objArr[26]).longValue();
        long jLongValue7 = ((Number) objArr[27]).longValue();
        FirstBookingAppModel firstBookingAppModel = (FirstBookingAppModel) objArr[28];
        PremiumReserveTicketStatus premiumReserveTicketStatus = (PremiumReserveTicketStatus) objArr[29];
        RefundInfoAppModel refundInfoAppModel = (RefundInfoAppModel) objArr[30];
        List list = (List) objArr[31];
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(ticketStatus, "ticketStatus");
        Intrinsics.i(paymentMode, "paymentMode");
        Intrinsics.i(city_, "city_");
        Intrinsics.i(tone, "tone");
        Intrinsics.i(qrCode, "qrCode");
        Intrinsics.i(configurationId, "configurationId");
        Intrinsics.i(tripId, "tripId");
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(userId, "userId");
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        Intrinsics.i(fromStopDetails, "fromStopDetails");
        Intrinsics.i(toStopDetails, "toStopDetails");
        Intrinsics.i(passengerCategoryDetails, "passengerCategoryDetails");
        return new Premium_reserve_ticket_table(bookingId, jLongValue, jLongValue2, ticketStatus, paymentMode, str, str2, city_, tone, qrCode, configurationId, tripId, jLongValue3, jLongValue4, jLongValue5, routeId, routeName, userId, productType, productSubType, fromStopDetails, toStopDetails, zBooleanValue, passengerCategoryDetails, str3, l, jLongValue6, jLongValue7, firstBookingAppModel, premiumReserveTicketStatus, refundInfoAppModel, list);
    }
}
