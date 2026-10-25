package app.chalo.core;

import app.cash.sqldelight.ColumnAdapter;
import app.cash.sqldelight.EnumColumnAdapter;
import app.chalo.core.database.tableadapters.InstantTicketReceiptTableAdapter$receiptFareBreakupAdapter$2$1;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.receipt.ReceiptFareDataApiResponseModel;
import defpackage.cb0;
import defpackage.nf1;
import defpackage.t10;
import defpackage.xs;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/Instant_ticket_receipt_table;", "", "Adapter", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Instant_ticket_receipt_table {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1958a;
    public final long b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final Map j;
    public final String k;
    public final RouteNamingSchemeType l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final ReceiptFareDataApiResponseModel t;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/Instant_ticket_receipt_table$Adapter;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Adapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ColumnAdapter f1959a;
        public final EnumColumnAdapter b;
        public final ColumnAdapter c;

        public Adapter(ColumnAdapter productReceiptPassengerDetailsAdapter, EnumColumnAdapter enumColumnAdapter, InstantTicketReceiptTableAdapter$receiptFareBreakupAdapter$2$1 receiptFareBreakupAdapter) {
            Intrinsics.i(productReceiptPassengerDetailsAdapter, "productReceiptPassengerDetailsAdapter");
            Intrinsics.i(receiptFareBreakupAdapter, "receiptFareBreakupAdapter");
            this.f1959a = productReceiptPassengerDetailsAdapter;
            this.b = enumColumnAdapter;
            this.c = receiptFareBreakupAdapter;
        }
    }

    public Instant_ticket_receipt_table(String bookingId, long j, long j2, String vehicleNo, String conductorId, String startStopName, String endStopName, String endStopId, String routeName, Map map, String str, RouteNamingSchemeType routeNamingScheme, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ReceiptFareDataApiResponseModel receiptFareDataApiResponseModel) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(vehicleNo, "vehicleNo");
        Intrinsics.i(conductorId, "conductorId");
        Intrinsics.i(startStopName, "startStopName");
        Intrinsics.i(endStopName, "endStopName");
        Intrinsics.i(endStopId, "endStopId");
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(routeNamingScheme, "routeNamingScheme");
        this.f1958a = bookingId;
        this.b = j;
        this.c = j2;
        this.d = vehicleNo;
        this.e = conductorId;
        this.f = startStopName;
        this.g = endStopName;
        this.h = endStopId;
        this.i = routeName;
        this.j = map;
        this.k = str;
        this.l = routeNamingScheme;
        this.m = str2;
        this.n = str3;
        this.o = str4;
        this.p = str5;
        this.q = str6;
        this.r = str7;
        this.s = str8;
        this.t = receiptFareDataApiResponseModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Instant_ticket_receipt_table)) {
            return false;
        }
        Instant_ticket_receipt_table instant_ticket_receipt_table = (Instant_ticket_receipt_table) obj;
        return Intrinsics.d(this.f1958a, instant_ticket_receipt_table.f1958a) && this.b == instant_ticket_receipt_table.b && this.c == instant_ticket_receipt_table.c && Intrinsics.d(this.d, instant_ticket_receipt_table.d) && Intrinsics.d(this.e, instant_ticket_receipt_table.e) && Intrinsics.d(this.f, instant_ticket_receipt_table.f) && Intrinsics.d(this.g, instant_ticket_receipt_table.g) && Intrinsics.d(this.h, instant_ticket_receipt_table.h) && Intrinsics.d(this.i, instant_ticket_receipt_table.i) && Intrinsics.d(this.j, instant_ticket_receipt_table.j) && Intrinsics.d(this.k, instant_ticket_receipt_table.k) && this.l == instant_ticket_receipt_table.l && Intrinsics.d(this.m, instant_ticket_receipt_table.m) && Intrinsics.d(this.n, instant_ticket_receipt_table.n) && Intrinsics.d(this.o, instant_ticket_receipt_table.o) && Intrinsics.d(this.p, instant_ticket_receipt_table.p) && Intrinsics.d(this.q, instant_ticket_receipt_table.q) && Intrinsics.d(this.r, instant_ticket_receipt_table.r) && Intrinsics.d(this.s, instant_ticket_receipt_table.s) && Intrinsics.d(this.t, instant_ticket_receipt_table.t);
    }

    public final int hashCode() {
        int iHashCode = this.f1958a.hashCode() * 31;
        long j = this.b;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.c;
        int iE = nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e((i + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        Map map = this.j;
        int iHashCode2 = (iE + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.k;
        int iHashCode3 = (this.l.hashCode() + ((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.m;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.n;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.o;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.p;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.q;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.r;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.s;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        ReceiptFareDataApiResponseModel receiptFareDataApiResponseModel = this.t;
        return iHashCode10 + (receiptFareDataApiResponseModel != null ? receiptFareDataApiResponseModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = t10.m(this.b, "Instant_ticket_receipt_table(bookingId=", this.f1958a, ", punchTime=");
        xs.r(this.c, ", amount=", ", vehicleNo=", sbM);
        cb0.t(sbM, this.d, ", conductorId=", this.e, ", startStopName=");
        cb0.t(sbM, this.f, ", endStopName=", this.g, ", endStopId=");
        cb0.t(sbM, this.h, ", routeName=", this.i, ", productReceiptPassengerDetails=");
        sbM.append(this.j);
        sbM.append(", via=");
        sbM.append(this.k);
        sbM.append(", routeNamingScheme=");
        sbM.append(this.l);
        sbM.append(", depotName=");
        sbM.append(this.m);
        sbM.append(", etimGeneratedTicketId=");
        cb0.t(sbM, this.n, ", scheduleNumber=", this.o, ", routeServiceType=");
        cb0.t(sbM, this.p, ", driverId=", this.q, ", waybillNo=");
        cb0.t(sbM, this.r, ", etimVersion=", this.s, ", receiptFareBreakup=");
        sbM.append(this.t);
        sbM.append(")");
        return sbM.toString();
    }
}
