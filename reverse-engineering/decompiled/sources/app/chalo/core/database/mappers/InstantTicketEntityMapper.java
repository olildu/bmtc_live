package app.chalo.core.database.mappers;

import app.chalo.instantticket.data.model.InstantTicketEntity;
import app.chalo.instantticket.data.model.InstantTicketStatus;
import app.chalo.productbooking.common.data.models.entity.RefundInfoEntityModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/database/mappers/InstantTicketEntityMapper;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InstantTicketEntityMapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InstantTicketEntityMapper f2088a = new InstantTicketEntityMapper();

    public static InstantTicketEntity a(String bookingId, String userId, String productName, long j, long j2, InstantTicketStatus status, Long l, String city, String str, String str2, Long l2, String str3, String str4, String str5, String str6, String str7, String str8, List list, RefundInfoEntityModel refundInfoEntityModel) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(userId, "userId");
        Intrinsics.i(productName, "productName");
        Intrinsics.i(status, "status");
        Intrinsics.i(city, "city");
        return new InstantTicketEntity(bookingId, userId, productName, j, j2, status, l, city, str, str2, l2, str3, str4, str5, str6, str7, str8, list, refundInfoEntityModel);
    }
}
