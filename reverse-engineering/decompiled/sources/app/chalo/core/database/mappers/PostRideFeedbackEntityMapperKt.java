package app.chalo.core.database.mappers;

import app.chalo.core.Post_ride_feedback_table;
import app.chalo.ridefeedback.data.app.RideFeedbackFillStatus;
import app.chalo.ridefeedback.data.app.RideFeedbackTriggerType;
import app.chalo.ridefeedback.data.dao.PostRideFeedbackEntity;
import defpackage.z40;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PostRideFeedbackEntityMapperKt {
    public static final PostRideFeedbackEntity a(Post_ride_feedback_table post_ride_feedback_table) {
        RideFeedbackTriggerType next;
        Intrinsics.i(post_ride_feedback_table, "<this>");
        String bookingId = post_ride_feedback_table.f1980a;
        String userId = post_ride_feedback_table.b;
        String cityId = post_ride_feedback_table.c;
        String tripId = post_ride_feedback_table.d;
        String routeId = post_ride_feedback_table.e;
        String fromStopName = post_ride_feedback_table.f;
        String toStopName = post_ride_feedback_table.g;
        long j = post_ride_feedback_table.h;
        long j2 = post_ride_feedback_table.i;
        String triggerType = post_ride_feedback_table.j;
        String productType = post_ride_feedback_table.k;
        String productSubType = post_ride_feedback_table.l;
        String fillStatus = post_ride_feedback_table.m;
        Long l = post_ride_feedback_table.n;
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(userId, "userId");
        Intrinsics.i(cityId, "cityId");
        Intrinsics.i(tripId, "tripId");
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(fromStopName, "fromStopName");
        Intrinsics.i(toStopName, "toStopName");
        Intrinsics.i(triggerType, "triggerType");
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        Intrinsics.i(fillStatus, "fillStatus");
        RideFeedbackTriggerType.INSTANCE.getClass();
        Iterator<RideFeedbackTriggerType> it = RideFeedbackTriggerType.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Iterator<RideFeedbackTriggerType> it2 = it;
            if (Intrinsics.d(next.getValue(), triggerType)) {
                break;
            }
            it = it2;
        }
        RideFeedbackTriggerType rideFeedbackTriggerType = next;
        if (rideFeedbackTriggerType != null) {
            return new PostRideFeedbackEntity(bookingId, userId, cityId, tripId, routeId, fromStopName, toStopName, j, j2, rideFeedbackTriggerType, productType, productSubType, RideFeedbackFillStatus.valueOf(fillStatus), l);
        }
        throw new IllegalArgumentException(z40.g("Unknown triggerType=", triggerType, " for bookingId=", bookingId));
    }
}
