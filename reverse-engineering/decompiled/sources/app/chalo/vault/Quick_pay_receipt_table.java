package app.chalo.vault;

import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.vo1;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/vault/Quick_pay_receipt_table;", "", "vault_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Quick_pay_receipt_table {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10748a;
    public final String b;
    public final long c;
    public final long d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;
    public final String u;

    public Quick_pay_receipt_table(String transactionId, String orderId, long j, long j2, String vehicleNo, String conductorId, String startStop, String endStop, String routeName, String endStopId, String str, String str2, String routeNamingScheme, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        Intrinsics.i(transactionId, "transactionId");
        Intrinsics.i(orderId, "orderId");
        Intrinsics.i(vehicleNo, "vehicleNo");
        Intrinsics.i(conductorId, "conductorId");
        Intrinsics.i(startStop, "startStop");
        Intrinsics.i(endStop, "endStop");
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(endStopId, "endStopId");
        Intrinsics.i(routeNamingScheme, "routeNamingScheme");
        this.f10748a = transactionId;
        this.b = orderId;
        this.c = j;
        this.d = j2;
        this.e = vehicleNo;
        this.f = conductorId;
        this.g = startStop;
        this.h = endStop;
        this.i = routeName;
        this.j = endStopId;
        this.k = str;
        this.l = str2;
        this.m = routeNamingScheme;
        this.n = str3;
        this.o = str4;
        this.p = str5;
        this.q = str6;
        this.r = str7;
        this.s = str8;
        this.t = str9;
        this.u = str10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Quick_pay_receipt_table)) {
            return false;
        }
        Quick_pay_receipt_table quick_pay_receipt_table = (Quick_pay_receipt_table) obj;
        return Intrinsics.d(this.f10748a, quick_pay_receipt_table.f10748a) && Intrinsics.d(this.b, quick_pay_receipt_table.b) && this.c == quick_pay_receipt_table.c && this.d == quick_pay_receipt_table.d && Intrinsics.d(this.e, quick_pay_receipt_table.e) && Intrinsics.d(this.f, quick_pay_receipt_table.f) && Intrinsics.d(this.g, quick_pay_receipt_table.g) && Intrinsics.d(this.h, quick_pay_receipt_table.h) && Intrinsics.d(this.i, quick_pay_receipt_table.i) && Intrinsics.d(this.j, quick_pay_receipt_table.j) && Intrinsics.d(this.k, quick_pay_receipt_table.k) && Intrinsics.d(this.l, quick_pay_receipt_table.l) && Intrinsics.d(this.m, quick_pay_receipt_table.m) && Intrinsics.d(this.n, quick_pay_receipt_table.n) && Intrinsics.d(this.o, quick_pay_receipt_table.o) && Intrinsics.d(this.p, quick_pay_receipt_table.p) && Intrinsics.d(this.q, quick_pay_receipt_table.q) && Intrinsics.d(this.r, quick_pay_receipt_table.r) && Intrinsics.d(this.s, quick_pay_receipt_table.s) && Intrinsics.d(this.t, quick_pay_receipt_table.t) && Intrinsics.d(this.u, quick_pay_receipt_table.u);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f10748a.hashCode() * 31, 31, this.b);
        long j = this.c;
        int i = (iE + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.d;
        int iE2 = nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e((i + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
        String str = this.k;
        int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.l;
        int iE3 = nf1.e((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.m);
        String str3 = this.n;
        int iHashCode2 = (iE3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.o;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.p;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.q;
        int iHashCode5 = (iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.r;
        int iHashCode6 = (iHashCode5 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.s;
        int iHashCode7 = (iHashCode6 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.t;
        int iHashCode8 = (iHashCode7 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.u;
        return iHashCode8 + (str10 != null ? str10.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("Quick_pay_receipt_table(transactionId=", this.f10748a, ", orderId=", this.b, ", punchTime=");
        sbE.append(this.c);
        xs.r(this.d, ", amount=", ", vehicleNo=", sbE);
        cb0.t(sbE, this.e, ", conductorId=", this.f, ", startStop=");
        cb0.t(sbE, this.g, ", endStop=", this.h, ", routeName=");
        cb0.t(sbE, this.i, ", endStopId=", this.j, ", productReceiptPassengerDetails=");
        cb0.t(sbE, this.k, ", via=", this.l, ", routeNamingScheme=");
        cb0.t(sbE, this.m, ", depotName=", this.n, ", etimGeneratedTicketId=");
        cb0.t(sbE, this.o, ", scheduleNumber=", this.p, ", routeServiceType=");
        cb0.t(sbE, this.q, ", driverId=", this.r, ", waybillNo=");
        cb0.t(sbE, this.s, ", etimVersion=", this.t, ", receiptFareBreakup=");
        return vo1.p(sbE, this.u, ")");
    }
}
