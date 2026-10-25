package app.chalo.walletframework.quickpay.data.repository.entity;

import app.chalo.data.RefundInfoAppModel;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.receipt.ProductReceiptData;
import app.chalo.receipt.ReceiptFareDataAppModel;
import defpackage.cb0;
import defpackage.dd;
import defpackage.hz0;
import defpackage.nf1;
import defpackage.xs;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/walletframework/quickpay/data/repository/entity/QuickPayReceipt;", "Lapp/chalo/receipt/ProductReceiptData;", "Companion", "$serializer", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class QuickPayReceipt implements ProductReceiptData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10932a;
    public final String b;
    public final long c;
    public final long d;
    public final String e;
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

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/walletframework/quickpay/data/repository/entity/QuickPayReceipt$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/walletframework/quickpay/data/repository/entity/QuickPayReceipt;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<QuickPayReceipt> serializer() {
            return QuickPayReceipt$$serializer.f10933a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        v = new Lazy[]{null, null, null, null, null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new hz0(2)), null, LazyKt.a(lazyThreadSafetyMode, new hz0(3)), null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ QuickPayReceipt(int i, String str, String str2, long j, long j2, String str3, String str4, String str5, String str6, String str7, String str8, Map map, String str9, RouteNamingSchemeType routeNamingSchemeType, String str10, String str11, String str12, String str13, String str14, String str15, String str16, ReceiptFareDataAppModel receiptFareDataAppModel) {
        if ((i & 1) == 0) {
            this.f10932a = "";
        } else {
            this.f10932a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = 0L;
        } else {
            this.c = j;
        }
        if ((i & 8) == 0) {
            this.d = 0L;
        } else {
            this.d = j2;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.g = "";
        } else {
            this.g = str5;
        }
        if ((i & 128) == 0) {
            this.h = "";
        } else {
            this.h = str6;
        }
        if ((i & 256) == 0) {
            this.i = "";
        } else {
            this.i = str7;
        }
        if ((i & 512) == 0) {
            this.j = "";
        } else {
            this.j = str8;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = map;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str9;
        }
        this.m = (i & 4096) == 0 ? RouteNamingSchemeType.DEFAULT : routeNamingSchemeType;
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = str10;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = str11;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = str12;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = str13;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = str14;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = str15;
        }
        if ((524288 & i) == 0) {
            this.t = null;
        } else {
            this.t = str16;
        }
        if ((i & 1048576) == 0) {
            this.u = null;
        } else {
            this.u = receiptFareDataAppModel;
        }
    }

    public static QuickPayReceipt a(QuickPayReceipt quickPayReceipt) {
        String transactionId = quickPayReceipt.f10932a;
        String orderId = quickPayReceipt.b;
        long j = quickPayReceipt.c;
        long j2 = quickPayReceipt.d;
        String vehicleNo = quickPayReceipt.e;
        String conductorId = quickPayReceipt.f;
        String startStop = quickPayReceipt.g;
        String endStop = quickPayReceipt.h;
        String routeName = quickPayReceipt.i;
        String endStopId = quickPayReceipt.j;
        String str = quickPayReceipt.l;
        RouteNamingSchemeType routeNamingScheme = quickPayReceipt.m;
        String str2 = quickPayReceipt.n;
        String str3 = quickPayReceipt.o;
        String str4 = quickPayReceipt.p;
        String str5 = quickPayReceipt.q;
        String str6 = quickPayReceipt.r;
        String str7 = quickPayReceipt.s;
        String str8 = quickPayReceipt.t;
        ReceiptFareDataAppModel receiptFareDataAppModel = quickPayReceipt.u;
        Intrinsics.i(transactionId, "transactionId");
        Intrinsics.i(orderId, "orderId");
        Intrinsics.i(vehicleNo, "vehicleNo");
        Intrinsics.i(conductorId, "conductorId");
        Intrinsics.i(startStop, "startStop");
        Intrinsics.i(endStop, "endStop");
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(endStopId, "endStopId");
        Intrinsics.i(routeNamingScheme, "routeNamingScheme");
        return new QuickPayReceipt(transactionId, orderId, j, j2, vehicleNo, conductorId, startStop, endStop, routeName, endStopId, null, str, routeNamingScheme, str2, str3, str4, str5, str6, str7, str8, receiptFareDataAppModel);
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: b */
    public final String getC() {
        return "quickpay";
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getD() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuickPayReceipt)) {
            return false;
        }
        QuickPayReceipt quickPayReceipt = (QuickPayReceipt) obj;
        return Intrinsics.d(this.f10932a, quickPayReceipt.f10932a) && Intrinsics.d(this.b, quickPayReceipt.b) && this.c == quickPayReceipt.c && this.d == quickPayReceipt.d && Intrinsics.d(this.e, quickPayReceipt.e) && Intrinsics.d(this.f, quickPayReceipt.f) && Intrinsics.d(this.g, quickPayReceipt.g) && Intrinsics.d(this.h, quickPayReceipt.h) && Intrinsics.d(this.i, quickPayReceipt.i) && Intrinsics.d(this.j, quickPayReceipt.j) && Intrinsics.d(this.k, quickPayReceipt.k) && Intrinsics.d(this.l, quickPayReceipt.l) && this.m == quickPayReceipt.m && Intrinsics.d(this.n, quickPayReceipt.n) && Intrinsics.d(this.o, quickPayReceipt.o) && Intrinsics.d(this.p, quickPayReceipt.p) && Intrinsics.d(this.q, quickPayReceipt.q) && Intrinsics.d(this.r, quickPayReceipt.r) && Intrinsics.d(this.s, quickPayReceipt.s) && Intrinsics.d(this.t, quickPayReceipt.t) && Intrinsics.d(this.u, quickPayReceipt.u);
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getT() {
        return this.t;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getN() {
        return this.n;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    public final Long getAmount() {
        return Long.valueOf(this.d);
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getQ() {
        return this.q;
    }

    public final int hashCode() {
        int iE = nf1.e(this.f10932a.hashCode() * 31, 31, this.b);
        long j = this.c;
        int i = (iE + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.d;
        int iE2 = nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e((i + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
        Map map = this.k;
        int iHashCode = (iE2 + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.l;
        int iHashCode2 = (this.m.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.n;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.o;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.p;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.q;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.r;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.s;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.t;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        ReceiptFareDataAppModel receiptFareDataAppModel = this.u;
        return iHashCode9 + (receiptFareDataAppModel != null ? receiptFareDataAppModel.hashCode() : 0);
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getR() {
        return this.r;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    public final /* bridge */ String j() {
        return null;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getS() {
        return this.s;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getJ() {
        return this.e;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    public final String m() {
        ReceiptFareDataAppModel receiptFareDataAppModel = this.u;
        if (receiptFareDataAppModel != null) {
            return receiptFareDataAppModel.f8923a;
        }
        return null;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getO() {
        return this.o;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getL() {
        return this.j;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getF7487a() {
        return this.f10932a;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: q */
    public final RefundInfoAppModel getO() {
        return null;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    public final /* bridge */ String r() {
        return "";
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getI() {
        return this.f;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getF() {
        return this.g;
    }

    public final String toString() {
        StringBuilder sbE = dd.e("QuickPayReceipt(transactionId=", this.f10932a, ", orderId=", this.b, ", punchTime=");
        sbE.append(this.c);
        xs.r(this.d, ", amount=", ", vehicleNo=", sbE);
        cb0.t(sbE, this.e, ", conductorId=", this.f, ", startStop=");
        cb0.t(sbE, this.g, ", endStop=", this.h, ", routeName=");
        cb0.t(sbE, this.i, ", endStopId=", this.j, ", productReceiptPassengerDetails=");
        sbE.append(this.k);
        sbE.append(", via=");
        sbE.append(this.l);
        sbE.append(", routeNamingScheme=");
        sbE.append(this.m);
        sbE.append(", depotName=");
        sbE.append(this.n);
        sbE.append(", etimGeneratedTicketId=");
        cb0.t(sbE, this.o, ", scheduleNumber=", this.p, ", routeServiceType=");
        cb0.t(sbE, this.q, ", driverId=", this.r, ", waybillNo=");
        cb0.t(sbE, this.s, ", etimVersion=", this.t, ", ticketFareData=");
        sbE.append(this.u);
        sbE.append(")");
        return sbE.toString();
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getH() {
        return this.i;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: v, reason: from getter */
    public final String getP() {
        return this.p;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    public final /* bridge */ String w() {
        return null;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: x, reason: from getter */
    public final Map getK() {
        return this.k;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: y, reason: from getter */
    public final String getG() {
        return this.h;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    public final List z() {
        ReceiptFareDataAppModel receiptFareDataAppModel = this.u;
        if (receiptFareDataAppModel != null) {
            return receiptFareDataAppModel.b;
        }
        return null;
    }

    public QuickPayReceipt(String transactionId, String orderId, long j, long j2, String vehicleNo, String conductorId, String startStop, String endStop, String routeName, String endStopId, Map map, String str, RouteNamingSchemeType routeNamingScheme, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ReceiptFareDataAppModel receiptFareDataAppModel) {
        Intrinsics.i(transactionId, "transactionId");
        Intrinsics.i(orderId, "orderId");
        Intrinsics.i(vehicleNo, "vehicleNo");
        Intrinsics.i(conductorId, "conductorId");
        Intrinsics.i(startStop, "startStop");
        Intrinsics.i(endStop, "endStop");
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(endStopId, "endStopId");
        Intrinsics.i(routeNamingScheme, "routeNamingScheme");
        this.f10932a = transactionId;
        this.b = orderId;
        this.c = j;
        this.d = j2;
        this.e = vehicleNo;
        this.f = conductorId;
        this.g = startStop;
        this.h = endStop;
        this.i = routeName;
        this.j = endStopId;
        this.k = map;
        this.l = str;
        this.m = routeNamingScheme;
        this.n = str2;
        this.o = str3;
        this.p = str4;
        this.q = str5;
        this.r = str6;
        this.s = str7;
        this.t = str8;
        this.u = receiptFareDataAppModel;
    }
}
