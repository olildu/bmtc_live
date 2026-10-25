package app.chalo.models.ondc;

import defpackage.cb0;
import defpackage.nf1;
import defpackage.t10;
import defpackage.xs;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/models/ondc/OndcTicketReceiptAppModel;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OndcTicketReceiptAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5630a;
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

    public OndcTicketReceiptAppModel(String bookingId, long j, long j2, String conductorId, String vehicleNo, String routeName, String startStopName, String endStopName, String productType, String productSubType, String userId, Map map) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(conductorId, "conductorId");
        Intrinsics.i(vehicleNo, "vehicleNo");
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(startStopName, "startStopName");
        Intrinsics.i(endStopName, "endStopName");
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        Intrinsics.i(userId, "userId");
        this.f5630a = bookingId;
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OndcTicketReceiptAppModel)) {
            return false;
        }
        OndcTicketReceiptAppModel ondcTicketReceiptAppModel = (OndcTicketReceiptAppModel) obj;
        return Intrinsics.d(this.f5630a, ondcTicketReceiptAppModel.f5630a) && this.b == ondcTicketReceiptAppModel.b && this.c == ondcTicketReceiptAppModel.c && Intrinsics.d(this.d, ondcTicketReceiptAppModel.d) && Intrinsics.d(this.e, ondcTicketReceiptAppModel.e) && Intrinsics.d(this.f, ondcTicketReceiptAppModel.f) && Intrinsics.d(this.g, ondcTicketReceiptAppModel.g) && Intrinsics.d(this.h, ondcTicketReceiptAppModel.h) && Intrinsics.d(this.i, ondcTicketReceiptAppModel.i) && Intrinsics.d(this.j, ondcTicketReceiptAppModel.j) && Intrinsics.d(this.k, ondcTicketReceiptAppModel.k) && Intrinsics.d(this.l, ondcTicketReceiptAppModel.l);
    }

    public final int hashCode() {
        int iHashCode = this.f5630a.hashCode() * 31;
        long j = this.b;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.c;
        int iE = nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e((i + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
        Map map = this.l;
        return iE + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder sbM = t10.m(this.b, "OndcTicketReceiptAppModel(bookingId=", this.f5630a, ", punchTime=");
        xs.r(this.c, ", amount=", ", conductorId=", sbM);
        cb0.t(sbM, this.d, ", vehicleNo=", this.e, ", routeName=");
        cb0.t(sbM, this.f, ", startStopName=", this.g, ", endStopName=");
        cb0.t(sbM, this.h, ", productType=", this.i, ", productSubType=");
        cb0.t(sbM, this.j, ", userId=", this.k, ", passengerDetails=");
        sbM.append(this.l);
        sbM.append(")");
        return sbM.toString();
    }
}
