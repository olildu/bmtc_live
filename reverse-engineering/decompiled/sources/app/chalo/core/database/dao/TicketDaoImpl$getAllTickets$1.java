package app.chalo.core.database.dao;

import app.chalo.citydata.data.model.app.RouteStopsInfo;
import app.chalo.core.database.mappers.TicketTableMapper;
import app.chalo.models.mticketing.MTicket;
import app.chalo.models.mticketing.MTicketConfiguration;
import app.chalo.models.mticketing.MTicketTripReceipt;
import app.chalo.models.userprofile.UserProfile;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.FunctionN;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class TicketDaoImpl$getAllTickets$1 extends FunctionReferenceImpl implements FunctionN<MTicket> {
    @Override // kotlin.jvm.functions.FunctionN
    public final Object invoke(Object[] objArr) {
        if (objArr.length != 28) {
            throw new IllegalArgumentException("Expected 28 arguments");
        }
        String p0 = (String) objArr[0];
        String p1 = (String) objArr[1];
        String str = (String) objArr[2];
        String str2 = (String) objArr[3];
        String p4 = (String) objArr[4];
        String p5 = (String) objArr[5];
        RouteStopsInfo p6 = (RouteStopsInfo) objArr[6];
        RouteStopsInfo routeStopsInfo = (RouteStopsInfo) objArr[7];
        Map p8 = (Map) objArr[8];
        long jLongValue = ((Number) objArr[9]).longValue();
        long jLongValue2 = ((Number) objArr[10]).longValue();
        boolean zBooleanValue = ((Boolean) objArr[11]).booleanValue();
        long jLongValue3 = ((Number) objArr[12]).longValue();
        boolean zBooleanValue2 = ((Boolean) objArr[13]).booleanValue();
        Long l = (Long) objArr[14];
        UserProfile userProfile = (UserProfile) objArr[15];
        String str3 = (String) objArr[16];
        String str4 = (String) objArr[17];
        MTicketConfiguration p18 = (MTicketConfiguration) objArr[18];
        Boolean bool = (Boolean) objArr[19];
        boolean zBooleanValue3 = ((Boolean) objArr[20]).booleanValue();
        String str5 = (String) objArr[21];
        String str6 = (String) objArr[22];
        String str7 = (String) objArr[23];
        String str8 = (String) objArr[24];
        String str9 = (String) objArr[25];
        String str10 = (String) objArr[26];
        MTicketTripReceipt mTicketTripReceipt = (MTicketTripReceipt) objArr[27];
        Intrinsics.i(p0, "p0");
        Intrinsics.i(p1, "p1");
        Intrinsics.i(p4, "p4");
        Intrinsics.i(p5, "p5");
        Intrinsics.i(p6, "p6");
        Intrinsics.i(p8, "p8");
        Intrinsics.i(p18, "p18");
        ((TicketTableMapper) this.receiver).getClass();
        return TicketTableMapper.a(p0, p1, str, str2, p4, p5, p6, routeStopsInfo, p8, jLongValue, jLongValue2, zBooleanValue, jLongValue3, zBooleanValue2, l, userProfile, str3, str4, p18, bool, zBooleanValue3, str5, str6, str7, str8, str9, str10, mTicketTripReceipt);
    }
}
