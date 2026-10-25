package app.chalo.core;

import app.cash.sqldelight.ColumnAdapter;
import defpackage.cb0;
import defpackage.nf1;
import defpackage.t10;
import defpackage.xs;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/Ondc_ticket_receipt_table;", "", "Adapter", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Ondc_ticket_receipt_table {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1974a;
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
    public final String l;
    public final Map m;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/Ondc_ticket_receipt_table$Adapter;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Adapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ColumnAdapter f1975a;

        public Adapter(ColumnAdapter passengerDetailsAdapter) {
            Intrinsics.i(passengerDetailsAdapter, "passengerDetailsAdapter");
            this.f1975a = passengerDetailsAdapter;
        }
    }

    public Ondc_ticket_receipt_table(String bookingId, long j, long j2, String vehicleNo, String conductorId, String startStopName, String endStopName, String endStopId, String routeName, String productType, String productSubType, String userId, Map map) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(vehicleNo, "vehicleNo");
        Intrinsics.i(conductorId, "conductorId");
        Intrinsics.i(startStopName, "startStopName");
        Intrinsics.i(endStopName, "endStopName");
        Intrinsics.i(endStopId, "endStopId");
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        Intrinsics.i(userId, "userId");
        this.f1974a = bookingId;
        this.b = j;
        this.c = j2;
        this.d = vehicleNo;
        this.e = conductorId;
        this.f = startStopName;
        this.g = endStopName;
        this.h = endStopId;
        this.i = routeName;
        this.j = productType;
        this.k = productSubType;
        this.l = userId;
        this.m = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ondc_ticket_receipt_table)) {
            return false;
        }
        Ondc_ticket_receipt_table ondc_ticket_receipt_table = (Ondc_ticket_receipt_table) obj;
        return Intrinsics.d(this.f1974a, ondc_ticket_receipt_table.f1974a) && this.b == ondc_ticket_receipt_table.b && this.c == ondc_ticket_receipt_table.c && Intrinsics.d(this.d, ondc_ticket_receipt_table.d) && Intrinsics.d(this.e, ondc_ticket_receipt_table.e) && Intrinsics.d(this.f, ondc_ticket_receipt_table.f) && Intrinsics.d(this.g, ondc_ticket_receipt_table.g) && Intrinsics.d(this.h, ondc_ticket_receipt_table.h) && Intrinsics.d(this.i, ondc_ticket_receipt_table.i) && Intrinsics.d(this.j, ondc_ticket_receipt_table.j) && Intrinsics.d(this.k, ondc_ticket_receipt_table.k) && Intrinsics.d(this.l, ondc_ticket_receipt_table.l) && Intrinsics.d(this.m, ondc_ticket_receipt_table.m);
    }

    public final int hashCode() {
        int iHashCode = this.f1974a.hashCode() * 31;
        long j = this.b;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.c;
        int iE = nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e((i + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
        Map map = this.m;
        return iE + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder sbM = t10.m(this.b, "Ondc_ticket_receipt_table(bookingId=", this.f1974a, ", punchTime=");
        xs.r(this.c, ", amount=", ", vehicleNo=", sbM);
        cb0.t(sbM, this.d, ", conductorId=", this.e, ", startStopName=");
        cb0.t(sbM, this.f, ", endStopName=", this.g, ", endStopId=");
        cb0.t(sbM, this.h, ", routeName=", this.i, ", productType=");
        cb0.t(sbM, this.j, ", productSubType=", this.k, ", userId=");
        sbM.append(this.l);
        sbM.append(", passengerDetails=");
        sbM.append(this.m);
        sbM.append(")");
        return sbM.toString();
    }
}
