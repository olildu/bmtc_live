package defpackage;

import app.chalo.core.Post_ride_feedback_table;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ft0 implements Function14 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15674a;

    @Override // kotlin.jvm.functions.Function14
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14) {
        switch (this.f15674a) {
            case 0:
                String bookingId = (String) obj;
                String userId_ = (String) obj2;
                String cityId_ = (String) obj3;
                String tripId = (String) obj4;
                String routeId = (String) obj5;
                String fromStopName = (String) obj6;
                String toStopName = (String) obj7;
                long jLongValue = ((Long) obj8).longValue();
                long jLongValue2 = ((Long) obj9).longValue();
                String triggerType = (String) obj10;
                String productType_ = (String) obj11;
                String productSubType_ = (String) obj12;
                String fillStatus = (String) obj13;
                Intrinsics.i(bookingId, "bookingId");
                Intrinsics.i(userId_, "userId_");
                Intrinsics.i(cityId_, "cityId_");
                Intrinsics.i(tripId, "tripId");
                Intrinsics.i(routeId, "routeId");
                Intrinsics.i(fromStopName, "fromStopName");
                Intrinsics.i(toStopName, "toStopName");
                Intrinsics.i(triggerType, "triggerType");
                Intrinsics.i(productType_, "productType_");
                Intrinsics.i(productSubType_, "productSubType_");
                Intrinsics.i(fillStatus, "fillStatus");
                return new Post_ride_feedback_table(bookingId, userId_, cityId_, tripId, routeId, fromStopName, toStopName, jLongValue, jLongValue2, triggerType, productType_, productSubType_, fillStatus, (Long) obj14);
            default:
                String bookingId_ = (String) obj;
                String userId_2 = (String) obj2;
                String cityId_2 = (String) obj3;
                String tripId2 = (String) obj4;
                String routeId2 = (String) obj5;
                String fromStopName2 = (String) obj6;
                String toStopName2 = (String) obj7;
                long jLongValue3 = ((Long) obj8).longValue();
                long jLongValue4 = ((Long) obj9).longValue();
                String triggerType2 = (String) obj10;
                String productType = (String) obj11;
                String productSubType = (String) obj12;
                String fillStatus2 = (String) obj13;
                Intrinsics.i(bookingId_, "bookingId_");
                Intrinsics.i(userId_2, "userId_");
                Intrinsics.i(cityId_2, "cityId_");
                Intrinsics.i(tripId2, "tripId");
                Intrinsics.i(routeId2, "routeId");
                Intrinsics.i(fromStopName2, "fromStopName");
                Intrinsics.i(toStopName2, "toStopName");
                Intrinsics.i(triggerType2, "triggerType");
                Intrinsics.i(productType, "productType");
                Intrinsics.i(productSubType, "productSubType");
                Intrinsics.i(fillStatus2, "fillStatus");
                return new Post_ride_feedback_table(bookingId_, userId_2, cityId_2, tripId2, routeId2, fromStopName2, toStopName2, jLongValue3, jLongValue4, triggerType2, productType, productSubType, fillStatus2, (Long) obj14);
        }
    }
}
