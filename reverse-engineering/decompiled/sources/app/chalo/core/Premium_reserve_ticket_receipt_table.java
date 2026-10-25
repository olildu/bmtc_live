package app.chalo.core;

import app.cash.sqldelight.ColumnAdapter;
import app.chalo.productbooking.common.data.models.entity.RefundInfoEntityModel;
import defpackage.cb0;
import defpackage.nf1;
import defpackage.t10;
import defpackage.xs;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/Premium_reserve_ticket_receipt_table;", "", "Adapter", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Premium_reserve_ticket_receipt_table {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1983a;
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

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/Premium_reserve_ticket_receipt_table$Adapter;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Adapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ColumnAdapter f1984a;
        public final ColumnAdapter b;

        public Adapter(ColumnAdapter productReceiptPassengerDetailsAdapter, ColumnAdapter refundInfoAdapter) {
            Intrinsics.i(productReceiptPassengerDetailsAdapter, "productReceiptPassengerDetailsAdapter");
            Intrinsics.i(refundInfoAdapter, "refundInfoAdapter");
            this.f1984a = productReceiptPassengerDetailsAdapter;
            this.b = refundInfoAdapter;
        }
    }

    public Premium_reserve_ticket_receipt_table(String bookingId, long j, long j2, String vehicleNo, String conductorId, String startStopName, String endStopName, String routeName, String productType, String productSubType, String userId, Map map, RefundInfoEntityModel refundInfoEntityModel) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(vehicleNo, "vehicleNo");
        Intrinsics.i(conductorId, "conductorId");
        Intrinsics.i(startStopName, "startStopName");
        Intrinsics.i(endStopName, "endStopName");
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        Intrinsics.i(userId, "userId");
        this.f1983a = bookingId;
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
        if (!(obj instanceof Premium_reserve_ticket_receipt_table)) {
            return false;
        }
        Premium_reserve_ticket_receipt_table premium_reserve_ticket_receipt_table = (Premium_reserve_ticket_receipt_table) obj;
        return Intrinsics.d(this.f1983a, premium_reserve_ticket_receipt_table.f1983a) && this.b == premium_reserve_ticket_receipt_table.b && this.c == premium_reserve_ticket_receipt_table.c && Intrinsics.d(this.d, premium_reserve_ticket_receipt_table.d) && Intrinsics.d(this.e, premium_reserve_ticket_receipt_table.e) && Intrinsics.d(this.f, premium_reserve_ticket_receipt_table.f) && Intrinsics.d(this.g, premium_reserve_ticket_receipt_table.g) && Intrinsics.d(this.h, premium_reserve_ticket_receipt_table.h) && Intrinsics.d(this.i, premium_reserve_ticket_receipt_table.i) && Intrinsics.d(this.j, premium_reserve_ticket_receipt_table.j) && Intrinsics.d(this.k, premium_reserve_ticket_receipt_table.k) && Intrinsics.d(this.l, premium_reserve_ticket_receipt_table.l) && Intrinsics.d(this.m, premium_reserve_ticket_receipt_table.m);
    }

    public final int hashCode() {
        int iHashCode = this.f1983a.hashCode() * 31;
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
        StringBuilder sbM = t10.m(this.b, "Premium_reserve_ticket_receipt_table(bookingId=", this.f1983a, ", punchTime=");
        xs.r(this.c, ", amount=", ", vehicleNo=", sbM);
        cb0.t(sbM, this.d, ", conductorId=", this.e, ", startStopName=");
        cb0.t(sbM, this.f, ", endStopName=", this.g, ", routeName=");
        cb0.t(sbM, this.h, ", productType=", this.i, ", productSubType=");
        cb0.t(sbM, this.j, ", userId=", this.k, ", productReceiptPassengerDetails=");
        sbM.append(this.l);
        sbM.append(", refundInfo=");
        sbM.append(this.m);
        sbM.append(")");
        return sbM.toString();
    }
}
