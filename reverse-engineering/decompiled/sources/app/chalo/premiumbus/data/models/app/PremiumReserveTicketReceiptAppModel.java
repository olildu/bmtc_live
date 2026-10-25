package app.chalo.premiumbus.data.models.app;

import app.chalo.data.RefundInfoAppModel;
import defpackage.cb0;
import defpackage.nf1;
import defpackage.t10;
import defpackage.xs;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/PremiumReserveTicketReceiptAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumReserveTicketReceiptAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7116a;
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
    public final RefundInfoAppModel m;

    public PremiumReserveTicketReceiptAppModel(String bookingId, long j, long j2, String conductorId, String vehicleNo, String routeName, String startStopName, String endStopName, String productType, String productSubType, String userId, Map map, RefundInfoAppModel refundInfoAppModel) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(conductorId, "conductorId");
        Intrinsics.i(vehicleNo, "vehicleNo");
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(startStopName, "startStopName");
        Intrinsics.i(endStopName, "endStopName");
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        Intrinsics.i(userId, "userId");
        this.f7116a = bookingId;
        this.b = j;
        this.c = j2;
        this.d = conductorId;
        this.e = vehicleNo;
        this.f = routeName;
        this.g = startStopName;
        this.h = endStopName;
        this.i = productType;
        this.j = productSubType;
        this.k = userId;
        this.l = map;
        this.m = refundInfoAppModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumReserveTicketReceiptAppModel)) {
            return false;
        }
        PremiumReserveTicketReceiptAppModel premiumReserveTicketReceiptAppModel = (PremiumReserveTicketReceiptAppModel) obj;
        return Intrinsics.d(this.f7116a, premiumReserveTicketReceiptAppModel.f7116a) && this.b == premiumReserveTicketReceiptAppModel.b && this.c == premiumReserveTicketReceiptAppModel.c && Intrinsics.d(this.d, premiumReserveTicketReceiptAppModel.d) && Intrinsics.d(this.e, premiumReserveTicketReceiptAppModel.e) && Intrinsics.d(this.f, premiumReserveTicketReceiptAppModel.f) && Intrinsics.d(this.g, premiumReserveTicketReceiptAppModel.g) && Intrinsics.d(this.h, premiumReserveTicketReceiptAppModel.h) && Intrinsics.d(this.i, premiumReserveTicketReceiptAppModel.i) && Intrinsics.d(this.j, premiumReserveTicketReceiptAppModel.j) && Intrinsics.d(this.k, premiumReserveTicketReceiptAppModel.k) && Intrinsics.d(this.l, premiumReserveTicketReceiptAppModel.l) && Intrinsics.d(this.m, premiumReserveTicketReceiptAppModel.m);
    }

    public final int hashCode() {
        int iHashCode = this.f7116a.hashCode() * 31;
        long j = this.b;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.c;
        int iE = nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e((i + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
        Map map = this.l;
        int iHashCode2 = (iE + (map == null ? 0 : map.hashCode())) * 31;
        RefundInfoAppModel refundInfoAppModel = this.m;
        return iHashCode2 + (refundInfoAppModel != null ? refundInfoAppModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = t10.m(this.b, "PremiumReserveTicketReceiptAppModel(bookingId=", this.f7116a, ", punchTime=");
        xs.r(this.c, ", amount=", ", conductorId=", sbM);
        cb0.t(sbM, this.d, ", vehicleNo=", this.e, ", routeName=");
        cb0.t(sbM, this.f, ", startStopName=", this.g, ", endStopName=");
        cb0.t(sbM, this.h, ", productType=", this.i, ", productSubType=");
        cb0.t(sbM, this.j, ", userId=", this.k, ", passengerDetails=");
        sbM.append(this.l);
        sbM.append(", refundInfo=");
        sbM.append(this.m);
        sbM.append(")");
        return sbM.toString();
    }
}
