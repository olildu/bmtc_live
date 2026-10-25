package app.chalo.core.database.mappers;

import app.chalo.data.RefundInfoAppModel;
import app.chalo.metro.dao.ondc.OndcMetroTicketEntity;
import app.chalo.ondc.model.app.OndcMetroTicketStatus;
import app.chalo.productbooking.common.data.models.entity.PaymentInfoEntityModel;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/database/mappers/OndcMetroTicketEntityMapper;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OndcMetroTicketEntityMapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final OndcMetroTicketEntityMapper f2093a = new OndcMetroTicketEntityMapper();

    public static OndcMetroTicketEntity a(String bookingId, String userId, long j, long j2, OndcMetroTicketStatus status, Long l, String city, String str, List list, String str2, Long l2, Map map, String str3, String str4, String str5, RefundInfoAppModel refundInfoAppModel, List list2, PaymentInfoEntityModel paymentInfoEntityModel, String str6, String str7) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(userId, "userId");
        Intrinsics.i(status, "status");
        Intrinsics.i(city, "city");
        return new OndcMetroTicketEntity(bookingId, userId, j, j2, status, l, city, str, list, str2, l2, map, str3, str4, str5, refundInfoAppModel, list2, paymentInfoEntityModel, str6, str7);
    }
}
