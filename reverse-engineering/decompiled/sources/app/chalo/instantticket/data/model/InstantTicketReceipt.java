package app.chalo.instantticket.data.model;

import app.chalo.data.RefundInfoAppModel;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.receipt.ProductReceiptData;
import app.chalo.receipt.ProductReceiptDataKt;
import app.chalo.receipt.ReceiptFareDataApiResponseModel;
import defpackage.cb0;
import defpackage.ea0;
import defpackage.nf1;
import defpackage.t10;
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
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/instantticket/data/model/InstantTicketReceipt;", "Lapp/chalo/receipt/ProductReceiptData;", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class InstantTicketReceipt implements ProductReceiptData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3843a;
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
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/instantticket/data/model/InstantTicketReceipt$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/instantticket/data/model/InstantTicketReceipt;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<InstantTicketReceipt> serializer() {
            return InstantTicketReceipt$$serializer.f3844a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        u = new Lazy[]{null, null, null, null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new ea0(13)), null, LazyKt.a(lazyThreadSafetyMode, new ea0(14)), null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ InstantTicketReceipt(int i, String str, long j, long j2, String str2, String str3, String str4, String str5, String str6, String str7, Map map, String str8, RouteNamingSchemeType routeNamingSchemeType, String str9, String str10, String str11, String str12, String str13, String str14, String str15, ReceiptFareDataApiResponseModel receiptFareDataApiResponseModel) {
        if ((i & 1) == 0) {
            this.f3843a = "";
        } else {
            this.f3843a = str;
        }
        if ((i & 2) == 0) {
            this.b = 0L;
        } else {
            this.b = j;
        }
        if ((i & 4) == 0) {
            this.c = 0L;
        } else {
            this.c = j2;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str2;
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
            this.j = null;
        } else {
            this.j = map;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str8;
        }
        this.l = (i & 2048) == 0 ? RouteNamingSchemeType.DEFAULT : routeNamingSchemeType;
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = str9;
        }
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
        if ((i & 524288) == 0) {
            this.t = null;
        } else {
            this.t = receiptFareDataApiResponseModel;
        }
    }

    public static InstantTicketReceipt a(InstantTicketReceipt instantTicketReceipt) {
        String bookingId = instantTicketReceipt.f3843a;
        long j = instantTicketReceipt.b;
        long j2 = instantTicketReceipt.c;
        String vehicleNo = instantTicketReceipt.d;
        String conductorId = instantTicketReceipt.e;
        String startStopName = instantTicketReceipt.f;
        String endStopName = instantTicketReceipt.g;
        String endStopId = instantTicketReceipt.h;
        String routeName = instantTicketReceipt.i;
        String str = instantTicketReceipt.k;
        RouteNamingSchemeType routeNamingScheme = instantTicketReceipt.l;
        String str2 = instantTicketReceipt.m;
        String str3 = instantTicketReceipt.n;
        String str4 = instantTicketReceipt.o;
        String str5 = instantTicketReceipt.p;
        String str6 = instantTicketReceipt.q;
        String str7 = instantTicketReceipt.r;
        String str8 = instantTicketReceipt.s;
        ReceiptFareDataApiResponseModel receiptFareDataApiResponseModel = instantTicketReceipt.t;
        instantTicketReceipt.getClass();
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(vehicleNo, "vehicleNo");
        Intrinsics.i(conductorId, "conductorId");
        Intrinsics.i(startStopName, "startStopName");
        Intrinsics.i(endStopName, "endStopName");
        Intrinsics.i(endStopId, "endStopId");
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(routeNamingScheme, "routeNamingScheme");
        return new InstantTicketReceipt(bookingId, j, j2, vehicleNo, conductorId, startStopName, endStopName, endStopId, routeName, null, str, routeNamingScheme, str2, str3, str4, str5, str6, str7, str8, receiptFareDataApiResponseModel);
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: b */
    public final String getC() {
        return "instantTicket";
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getC() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstantTicketReceipt)) {
            return false;
        }
        InstantTicketReceipt instantTicketReceipt = (InstantTicketReceipt) obj;
        return Intrinsics.d(this.f3843a, instantTicketReceipt.f3843a) && this.b == instantTicketReceipt.b && this.c == instantTicketReceipt.c && Intrinsics.d(this.d, instantTicketReceipt.d) && Intrinsics.d(this.e, instantTicketReceipt.e) && Intrinsics.d(this.f, instantTicketReceipt.f) && Intrinsics.d(this.g, instantTicketReceipt.g) && Intrinsics.d(this.h, instantTicketReceipt.h) && Intrinsics.d(this.i, instantTicketReceipt.i) && Intrinsics.d(this.j, instantTicketReceipt.j) && Intrinsics.d(this.k, instantTicketReceipt.k) && this.l == instantTicketReceipt.l && Intrinsics.d(this.m, instantTicketReceipt.m) && Intrinsics.d(this.n, instantTicketReceipt.n) && Intrinsics.d(this.o, instantTicketReceipt.o) && Intrinsics.d(this.p, instantTicketReceipt.p) && Intrinsics.d(this.q, instantTicketReceipt.q) && Intrinsics.d(this.r, instantTicketReceipt.r) && Intrinsics.d(this.s, instantTicketReceipt.s) && Intrinsics.d(this.t, instantTicketReceipt.t);
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getT() {
        return this.s;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getN() {
        return this.m;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    public final Long getAmount() {
        return Long.valueOf(this.c);
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getQ() {
        return this.p;
    }

    public final int hashCode() {
        int iHashCode = this.f3843a.hashCode() * 31;
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

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getR() {
        return this.q;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    public final /* bridge */ String j() {
        return null;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getS() {
        return this.r;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getE() {
        return this.d;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    public final String m() {
        ReceiptFareDataApiResponseModel receiptFareDataApiResponseModel = this.t;
        if (receiptFareDataApiResponseModel != null) {
            return receiptFareDataApiResponseModel.f8921a;
        }
        return null;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getO() {
        return this.n;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getJ() {
        return this.h;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getF10932a() {
        return this.f3843a;
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
    public final String getF() {
        return this.e;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getG() {
        return this.f;
    }

    public final String toString() {
        StringBuilder sbM = t10.m(this.b, "InstantTicketReceipt(bookingId=", this.f3843a, ", punchTime=");
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
        cb0.t(sbM, this.r, ", etimVersion=", this.s, ", ticketFareData=");
        sbM.append(this.t);
        sbM.append(")");
        return sbM.toString();
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getI() {
        return this.i;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: v, reason: from getter */
    public final String getP() {
        return this.o;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    public final /* bridge */ String w() {
        return null;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: x, reason: from getter */
    public final Map getK() {
        return this.j;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: y, reason: from getter */
    public final String getH() {
        return this.g;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    public final List z() {
        ReceiptFareDataApiResponseModel receiptFareDataApiResponseModel = this.t;
        if (receiptFareDataApiResponseModel != null) {
            return ProductReceiptDataKt.b(receiptFareDataApiResponseModel).b;
        }
        return null;
    }

    public InstantTicketReceipt(String bookingId, long j, long j2, String vehicleNo, String conductorId, String startStopName, String endStopName, String endStopId, String routeName, Map map, String str, RouteNamingSchemeType routeNamingScheme, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ReceiptFareDataApiResponseModel receiptFareDataApiResponseModel) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(vehicleNo, "vehicleNo");
        Intrinsics.i(conductorId, "conductorId");
        Intrinsics.i(startStopName, "startStopName");
        Intrinsics.i(endStopName, "endStopName");
        Intrinsics.i(endStopId, "endStopId");
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(routeNamingScheme, "routeNamingScheme");
        this.f3843a = bookingId;
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

    public /* synthetic */ InstantTicketReceipt(String str, String str2, String str3, String str4, RouteNamingSchemeType routeNamingSchemeType, int i) {
        this(str, 0L, 0L, "", "", "", (i & 64) != 0 ? "" : str2, (i & 128) != 0 ? "" : str3, "", null, str4, routeNamingSchemeType, null, null, null, null, null, null, null, null);
    }
}
