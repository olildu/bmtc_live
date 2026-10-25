package defpackage;

import app.chalo.core.GetAllGroupsForUserAndCities;
import app.chalo.core.GetGroupInfoByID;
import app.chalo.multimodalticket.data.model.MultiModalGroupTicketStatus;
import app.chalo.multimodalticket.data.model.MultiModalGroupTicketStopDetails;
import app.chalo.productbooking.common.data.models.entity.RefundInfoEntityModel;
import java.util.List;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ik0 implements Function22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15921a;

    public final Object a(String str, String str2, String str3, String str4, Long l, Long l2, Object obj, String str5, String str6, String str7, Long l3, Object obj2, Object obj3, Object obj4, RefundInfoEntityModel refundInfoEntityModel, Object obj5, Object obj6, Long l4, Long l5, String str8, String str9, String str10) {
        switch (this.f15921a) {
            case 0:
                long jLongValue = l.longValue();
                long jLongValue2 = l2.longValue();
                MultiModalGroupTicketStatus status = (MultiModalGroupTicketStatus) obj;
                long jLongValue3 = l3.longValue();
                MultiModalGroupTicketStopDetails fromStopDetails = (MultiModalGroupTicketStopDetails) obj2;
                MultiModalGroupTicketStopDetails toStopDetails = (MultiModalGroupTicketStopDetails) obj3;
                List passengerDetails = (List) obj4;
                List sequenceInfo = (List) obj5;
                List fareDetails = (List) obj6;
                long jLongValue4 = l4.longValue();
                Intrinsics.i(status, "status");
                Intrinsics.i(fromStopDetails, "fromStopDetails");
                Intrinsics.i(toStopDetails, "toStopDetails");
                Intrinsics.i(passengerDetails, "passengerDetails");
                Intrinsics.i(sequenceInfo, "sequenceInfo");
                Intrinsics.i(fareDetails, "fareDetails");
                return new GetGroupInfoByID(str, str2, str3, str4, jLongValue, jLongValue2, status, str5, str6, str7, jLongValue3, fromStopDetails, toStopDetails, passengerDetails, refundInfoEntityModel, sequenceInfo, fareDetails, jLongValue4, l5, str8, str9, str10);
            default:
                long jLongValue5 = l.longValue();
                long jLongValue6 = l2.longValue();
                MultiModalGroupTicketStatus status2 = (MultiModalGroupTicketStatus) obj;
                long jLongValue7 = l3.longValue();
                MultiModalGroupTicketStopDetails fromStopDetails2 = (MultiModalGroupTicketStopDetails) obj2;
                MultiModalGroupTicketStopDetails toStopDetails2 = (MultiModalGroupTicketStopDetails) obj3;
                List passengerDetails2 = (List) obj4;
                List sequenceInfo2 = (List) obj5;
                List fareDetails2 = (List) obj6;
                long jLongValue8 = l4.longValue();
                Intrinsics.i(status2, "status");
                Intrinsics.i(fromStopDetails2, "fromStopDetails");
                Intrinsics.i(toStopDetails2, "toStopDetails");
                Intrinsics.i(passengerDetails2, "passengerDetails");
                Intrinsics.i(sequenceInfo2, "sequenceInfo");
                Intrinsics.i(fareDetails2, "fareDetails");
                return new GetAllGroupsForUserAndCities(str, str2, str3, str4, jLongValue5, jLongValue6, status2, str5, str6, str7, jLongValue7, fromStopDetails2, toStopDetails2, passengerDetails2, refundInfoEntityModel, sequenceInfo2, fareDetails2, jLongValue8, l5, str8, str9, str10);
        }
    }
}
