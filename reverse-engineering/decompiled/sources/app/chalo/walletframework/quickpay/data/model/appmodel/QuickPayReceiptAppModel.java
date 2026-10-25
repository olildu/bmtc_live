package app.chalo.walletframework.quickpay.data.model.appmodel;

import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.receipt.ReceiptFareDataAppModel;
import defpackage.cb0;
import defpackage.nf1;
import defpackage.t10;
import defpackage.xs;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/quickpay/data/model/appmodel/QuickPayReceiptAppModel;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class QuickPayReceiptAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10919a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final Map k;
    public final String l;
    public final RouteNamingSchemeType m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;
    public final ReceiptFareDataAppModel u;

    public QuickPayReceiptAppModel(String transactionId, long j, long j2, long j3, long j4, String vehicleNo, String conductorId, String startStop, String endStop, String routeName, Map map, String str, RouteNamingSchemeType routeNamingSchemeType, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ReceiptFareDataAppModel receiptFareDataAppModel) {
        Intrinsics.i(transactionId, "transactionId");
        Intrinsics.i(vehicleNo, "vehicleNo");
        Intrinsics.i(conductorId, "conductorId");
        Intrinsics.i(startStop, "startStop");
        Intrinsics.i(endStop, "endStop");
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(routeNamingSchemeType, "routeNamingSchemeType");
        this.f10919a = transactionId;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = vehicleNo;
        this.g = conductorId;
        this.h = startStop;
        this.i = endStop;
        this.j = routeName;
        this.k = map;
        this.l = str;
        this.m = routeNamingSchemeType;
        this.n = str2;
        this.o = str3;
        this.p = str4;
        this.q = str5;
        this.r = str6;
        this.s = str7;
        this.t = str8;
        this.u = receiptFareDataAppModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuickPayReceiptAppModel)) {
            return false;
        }
        QuickPayReceiptAppModel quickPayReceiptAppModel = (QuickPayReceiptAppModel) obj;
        return Intrinsics.d(this.f10919a, quickPayReceiptAppModel.f10919a) && this.b == quickPayReceiptAppModel.b && this.c == quickPayReceiptAppModel.c && this.d == quickPayReceiptAppModel.d && this.e == quickPayReceiptAppModel.e && Intrinsics.d(this.f, quickPayReceiptAppModel.f) && Intrinsics.d(this.g, quickPayReceiptAppModel.g) && Intrinsics.d(this.h, quickPayReceiptAppModel.h) && Intrinsics.d(this.i, quickPayReceiptAppModel.i) && Intrinsics.d(this.j, quickPayReceiptAppModel.j) && Intrinsics.d(this.k, quickPayReceiptAppModel.k) && Intrinsics.d(this.l, quickPayReceiptAppModel.l) && this.m == quickPayReceiptAppModel.m && Intrinsics.d(this.n, quickPayReceiptAppModel.n) && Intrinsics.d(this.o, quickPayReceiptAppModel.o) && Intrinsics.d(this.p, quickPayReceiptAppModel.p) && Intrinsics.d(this.q, quickPayReceiptAppModel.q) && Intrinsics.d(this.r, quickPayReceiptAppModel.r) && Intrinsics.d(this.s, quickPayReceiptAppModel.s) && Intrinsics.d(this.t, quickPayReceiptAppModel.t) && Intrinsics.d(this.u, quickPayReceiptAppModel.u);
    }

    public final int hashCode() {
        int iHashCode = this.f10919a.hashCode() * 31;
        long j = this.b;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.c;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.d;
        int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.e;
        int iE = nf1.e(nf1.e(nf1.e(nf1.e(nf1.e((i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
        Map map = this.k;
        int iHashCode2 = (iE + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.l;
        int iHashCode3 = (this.m.hashCode() + ((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.n;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.o;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.p;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.q;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.r;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.s;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.t;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        ReceiptFareDataAppModel receiptFareDataAppModel = this.u;
        return iHashCode10 + (receiptFareDataAppModel != null ? receiptFareDataAppModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = t10.m(this.b, "QuickPayReceiptAppModel(transactionId=", this.f10919a, ", punchTime=");
        xs.r(this.c, ", activationDuration=", ", expiryTime=", sbM);
        sbM.append(this.d);
        xs.r(this.e, ", amount=", ", vehicleNo=", sbM);
        cb0.t(sbM, this.f, ", conductorId=", this.g, ", startStop=");
        cb0.t(sbM, this.h, ", endStop=", this.i, ", routeName=");
        sbM.append(this.j);
        sbM.append(", productReceiptPassengerDetails=");
        sbM.append(this.k);
        sbM.append(", via=");
        sbM.append(this.l);
        sbM.append(", routeNamingSchemeType=");
        sbM.append(this.m);
        sbM.append(", depotName=");
        cb0.t(sbM, this.n, ", etimGeneratedTicketId=", this.o, ", scheduleNumber=");
        cb0.t(sbM, this.p, ", routeServiceType=", this.q, ", driverId=");
        cb0.t(sbM, this.r, ", waybillNo=", this.s, ", etimVersion=");
        sbM.append(this.t);
        sbM.append(", ticketFareData=");
        sbM.append(this.u);
        sbM.append(")");
        return sbM.toString();
    }
}
