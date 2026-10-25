package app.chalo.core;

import app.chalo.citydata.data.model.app.RouteStopsInfo;
import app.chalo.models.mticketing.MTicketConfiguration;
import app.chalo.models.mticketing.MTicketTripReceipt;
import app.chalo.models.userprofile.UserProfile;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.FunctionN;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class TicketQueries$getCurrentTicket$2 implements FunctionN<Ticket> {
    @Override // kotlin.jvm.functions.FunctionN
    public final Object invoke(Object[] objArr) {
        if (objArr.length != 28) {
            throw new IllegalArgumentException("Expected 28 arguments");
        }
        String ticketId = (String) objArr[0];
        String mticket__mTicketId_ = (String) objArr[1];
        String str = (String) objArr[2];
        String str2 = (String) objArr[3];
        String mticket__cityName_ = (String) objArr[4];
        String mticket__agency = (String) objArr[5];
        RouteStopsInfo mticket__upTripRouteStopsInfo = (RouteStopsInfo) objArr[6];
        RouteStopsInfo routeStopsInfo = (RouteStopsInfo) objArr[7];
        Map mticket__passengerDetails = (Map) objArr[8];
        long jLongValue = ((Number) objArr[9]).longValue();
        long jLongValue2 = ((Number) objArr[10]).longValue();
        boolean zBooleanValue = ((Boolean) objArr[11]).booleanValue();
        long jLongValue3 = ((Number) objArr[12]).longValue();
        boolean zBooleanValue2 = ((Boolean) objArr[13]).booleanValue();
        Long l = (Long) objArr[14];
        UserProfile userProfile = (UserProfile) objArr[15];
        String str3 = (String) objArr[16];
        String str4 = (String) objArr[17];
        MTicketConfiguration mticket__mTicketConfiguration = (MTicketConfiguration) objArr[18];
        Boolean bool = (Boolean) objArr[19];
        boolean zBooleanValue3 = ((Boolean) objArr[20]).booleanValue();
        String str5 = (String) objArr[21];
        String str6 = (String) objArr[22];
        String str7 = (String) objArr[23];
        String str8 = (String) objArr[24];
        String str9 = (String) objArr[25];
        String str10 = (String) objArr[26];
        MTicketTripReceipt mTicketTripReceipt = (MTicketTripReceipt) objArr[27];
        Intrinsics.i(ticketId, "ticketId");
        Intrinsics.i(mticket__mTicketId_, "mticket__mTicketId_");
        Intrinsics.i(mticket__cityName_, "mticket__cityName_");
        Intrinsics.i(mticket__agency, "mticket__agency");
        Intrinsics.i(mticket__upTripRouteStopsInfo, "mticket__upTripRouteStopsInfo");
        Intrinsics.i(mticket__passengerDetails, "mticket__passengerDetails");
        Intrinsics.i(mticket__mTicketConfiguration, "mticket__mTicketConfiguration");
        return new Ticket(ticketId, mticket__mTicketId_, str, str2, mticket__cityName_, mticket__agency, mticket__upTripRouteStopsInfo, routeStopsInfo, mticket__passengerDetails, jLongValue, jLongValue2, zBooleanValue, jLongValue3, zBooleanValue2, l, userProfile, str3, str4, mticket__mTicketConfiguration, bool, zBooleanValue3, str5, str6, str7, str8, str9, str10, mTicketTripReceipt);
    }
}
