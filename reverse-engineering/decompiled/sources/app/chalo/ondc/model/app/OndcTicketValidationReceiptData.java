package app.chalo.ondc.model.app;

import app.chalo.data.RefundInfoAppModel;
import app.chalo.receipt.ProductReceiptData;
import defpackage.cb0;
import defpackage.nf1;
import defpackage.t10;
import defpackage.xs;
import defpackage.yn0;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ondc/model/app/OndcTicketValidationReceiptData;", "Lapp/chalo/receipt/ProductReceiptData;", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class OndcTicketValidationReceiptData implements ProductReceiptData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] l = {null, null, null, null, null, null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new yn0(19))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6772a;
    public final long b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final Map k;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ondc/model/app/OndcTicketValidationReceiptData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ondc/model/app/OndcTicketValidationReceiptData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<OndcTicketValidationReceiptData> serializer() {
            return OndcTicketValidationReceiptData$$serializer.f6773a;
        }
    }

    public /* synthetic */ OndcTicketValidationReceiptData(int i, String str, long j, long j2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Map map) {
        if (2047 != (i & 2047)) {
            PluginExceptionsKt.b(OndcTicketValidationReceiptData$$serializer.f6773a.getDescriptor(), i, 2047);
            throw null;
        }
        this.f6772a = str;
        this.b = j;
        this.c = j2;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = map;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    public final String b() {
        return "instantTicket";
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OndcTicketValidationReceiptData)) {
            return false;
        }
        OndcTicketValidationReceiptData ondcTicketValidationReceiptData = (OndcTicketValidationReceiptData) obj;
        return Intrinsics.d(this.f6772a, ondcTicketValidationReceiptData.f6772a) && this.b == ondcTicketValidationReceiptData.b && this.c == ondcTicketValidationReceiptData.c && Intrinsics.d(this.d, ondcTicketValidationReceiptData.d) && Intrinsics.d(this.e, ondcTicketValidationReceiptData.e) && Intrinsics.d(this.f, ondcTicketValidationReceiptData.f) && Intrinsics.d(this.g, ondcTicketValidationReceiptData.g) && Intrinsics.d(this.h, ondcTicketValidationReceiptData.h) && Intrinsics.d(this.i, ondcTicketValidationReceiptData.i) && Intrinsics.d(this.j, ondcTicketValidationReceiptData.j) && Intrinsics.d(this.k, ondcTicketValidationReceiptData.k);
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: f */
    public final /* bridge */ String getT() {
        return null;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: g */
    public final /* bridge */ String getN() {
        return null;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    public final Long getAmount() {
        return Long.valueOf(this.c);
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: h */
    public final /* bridge */ String getQ() {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.f6772a.hashCode() * 31;
        long j = this.b;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.c;
        int iE = nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e((i + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
        Map map = this.k;
        return iE + (map == null ? 0 : map.hashCode());
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: i */
    public final /* bridge */ String getR() {
        return null;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    public final /* bridge */ String j() {
        return null;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: k */
    public final /* bridge */ String getS() {
        return null;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getD() {
        return this.d;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    public final /* bridge */ String m() {
        return null;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: n */
    public final /* bridge */ String getO() {
        return null;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: o */
    public final /* bridge */ String getJ() {
        return "";
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getF6772a() {
        return this.f6772a;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    public final RefundInfoAppModel q() {
        return null;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    public final /* bridge */ String r() {
        return "";
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getE() {
        return this.e;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getF() {
        return this.f;
    }

    public final String toString() {
        StringBuilder sbM = t10.m(this.b, "OndcTicketValidationReceiptData(bookingId=", this.f6772a, ", punchTime=");
        xs.r(this.c, ", amount=", ", vehicleNo=", sbM);
        cb0.t(sbM, this.d, ", conductorId=", this.e, ", startStopName=");
        cb0.t(sbM, this.f, ", endStopName=", this.g, ", routeName=");
        cb0.t(sbM, this.h, ", productType=", this.i, ", productSubType=");
        sbM.append(this.j);
        sbM.append(", passengerDetails=");
        sbM.append(this.k);
        sbM.append(")");
        return sbM.toString();
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getH() {
        return this.h;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: v */
    public final /* bridge */ String getP() {
        return null;
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
        return this.g;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    public final /* bridge */ List z() {
        return null;
    }

    public OndcTicketValidationReceiptData(String bookingId, long j, long j2, String vehicleNo, String conductorId, String startStopName, String endStopName, String routeName, String productType, String productSubType, Map map) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(vehicleNo, "vehicleNo");
        Intrinsics.i(conductorId, "conductorId");
        Intrinsics.i(startStopName, "startStopName");
        Intrinsics.i(endStopName, "endStopName");
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        this.f6772a = bookingId;
        this.b = j;
        this.c = j2;
        this.d = vehicleNo;
        this.e = conductorId;
        this.f = startStopName;
        this.g = endStopName;
        this.h = routeName;
        this.i = productType;
        this.j = productSubType;
        this.k = map;
    }
}
