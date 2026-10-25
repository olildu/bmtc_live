package app.chalo.premiumbus.data.models.entity;

import app.chalo.productbooking.common.data.models.entity.RefundInfoEntityModel;
import defpackage.cb0;
import defpackage.nf1;
import defpackage.t10;
import defpackage.xs;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/data/models/entity/PremiumReserveTicketReceiptEntity;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumReserveTicketReceiptEntity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7138a;
    public final long b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final Map l;
    public final RefundInfoEntityModel m;

    public PremiumReserveTicketReceiptEntity(String bookingId, long j, long j2, String vehicleNo, String conductorId, String startStopName, String endStopName, String routeName, String productType, String productSubType, String userId, Map map, RefundInfoEntityModel refundInfoEntityModel) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(vehicleNo, "vehicleNo");
        Intrinsics.i(conductorId, "conductorId");
        Intrinsics.i(startStopName, "startStopName");
        Intrinsics.i(endStopName, "endStopName");
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        Intrinsics.i(userId, "userId");
        this.f7138a = bookingId;
        this.b = j;
        this.c = j2;
        this.d = vehicleNo;
        this.e = conductorId;
        this.f = startStopName;
        this.g = endStopName;
        this.h = routeName;
        this.i = productType;
        this.j = productSubType;
        this.k = userId;
        this.l = map;
        this.m = refundInfoEntityModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumReserveTicketReceiptEntity)) {
            return false;
        }
        PremiumReserveTicketReceiptEntity premiumReserveTicketReceiptEntity = (PremiumReserveTicketReceiptEntity) obj;
        return Intrinsics.d(this.f7138a, premiumReserveTicketReceiptEntity.f7138a) && this.b == premiumReserveTicketReceiptEntity.b && this.c == premiumReserveTicketReceiptEntity.c && Intrinsics.d(this.d, premiumReserveTicketReceiptEntity.d) && Intrinsics.d(this.e, premiumReserveTicketReceiptEntity.e) && Intrinsics.d(this.f, premiumReserveTicketReceiptEntity.f) && Intrinsics.d(this.g, premiumReserveTicketReceiptEntity.g) && Intrinsics.d(this.h, premiumReserveTicketReceiptEntity.h) && Intrinsics.d(this.i, premiumReserveTicketReceiptEntity.i) && Intrinsics.d(this.j, premiumReserveTicketReceiptEntity.j) && Intrinsics.d(this.k, premiumReserveTicketReceiptEntity.k) && Intrinsics.d(this.l, premiumReserveTicketReceiptEntity.l) && Intrinsics.d(this.m, premiumReserveTicketReceiptEntity.m);
    }

    public final int hashCode() {
        int iHashCode = this.f7138a.hashCode() * 31;
        long j = this.b;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.c;
        int iE = nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e((i + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
        Map map = this.l;
        int iHashCode2 = (iE + (map == null ? 0 : map.hashCode())) * 31;
        RefundInfoEntityModel refundInfoEntityModel = this.m;
        return iHashCode2 + (refundInfoEntityModel != null ? refundInfoEntityModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = t10.m(this.b, "PremiumReserveTicketReceiptEntity(bookingId=", this.f7138a, ", punchTime=");
        xs.r(this.c, ", amount=", ", vehicleNo=", sbM);
        cb0.t(sbM, this.d, ", conductorId=", this.e, ", startStopName=");
        cb0.t(sbM, this.f, ", endStopName=", this.g, ", routeName=");
        cb0.t(sbM, this.h, ", productType=", this.i, ", productSubType=");
        cb0.t(sbM, this.j, ", userId=", this.k, ", productReceiptPassengerDetails=");
        sbM.append(this.l);
        sbM.append(", refundInfoEntity=");
        sbM.append(this.m);
        sbM.append(")");
        return sbM.toString();
    }
}
