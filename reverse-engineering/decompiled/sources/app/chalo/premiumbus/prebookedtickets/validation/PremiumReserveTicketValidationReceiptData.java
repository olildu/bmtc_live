package app.chalo.premiumbus.prebookedtickets.validation;

import app.chalo.data.RefundInfoAppModel;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.receipt.ProductReceiptData;
import defpackage.cb0;
import defpackage.dd;
import defpackage.n21;
import defpackage.nf1;
import defpackage.pw0;
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
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/validation/PremiumReserveTicketValidationReceiptData;", "Lapp/chalo/receipt/ProductReceiptData;", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PremiumReserveTicketValidationReceiptData implements ProductReceiptData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7487a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final Map k;
    public final String l;
    public final String m;
    public final RouteNamingSchemeType n;
    public final RefundInfoAppModel o;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/validation/PremiumReserveTicketValidationReceiptData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/prebookedtickets/validation/PremiumReserveTicketValidationReceiptData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PremiumReserveTicketValidationReceiptData> serializer() {
            return PremiumReserveTicketValidationReceiptData$$serializer.f7488a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        p = new Lazy[]{null, null, null, null, null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new pw0(8)), null, null, LazyKt.a(lazyThreadSafetyMode, new pw0(9)), null};
    }

    public /* synthetic */ PremiumReserveTicketValidationReceiptData(int i, String str, String str2, String str3, long j, long j2, String str4, String str5, String str6, String str7, String str8, Map map, String str9, String str10, RouteNamingSchemeType routeNamingSchemeType, RefundInfoAppModel refundInfoAppModel) {
        if (1023 != (i & 1023)) {
            PluginExceptionsKt.b(PremiumReserveTicketValidationReceiptData$$serializer.f7488a.getDescriptor(), i, 1023);
            throw null;
        }
        this.f7487a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = j2;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = map;
        }
        this.l = (i & 2048) == 0 ? "" : str9;
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = str10;
        }
        this.n = (i & 8192) == 0 ? RouteNamingSchemeType.DEFAULT : routeNamingSchemeType;
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = refundInfoAppModel;
        }
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getC() {
        return this.c;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getB() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumReserveTicketValidationReceiptData)) {
            return false;
        }
        PremiumReserveTicketValidationReceiptData premiumReserveTicketValidationReceiptData = (PremiumReserveTicketValidationReceiptData) obj;
        return Intrinsics.d(this.f7487a, premiumReserveTicketValidationReceiptData.f7487a) && Intrinsics.d(this.b, premiumReserveTicketValidationReceiptData.b) && Intrinsics.d(this.c, premiumReserveTicketValidationReceiptData.c) && this.d == premiumReserveTicketValidationReceiptData.d && this.e == premiumReserveTicketValidationReceiptData.e && Intrinsics.d(this.f, premiumReserveTicketValidationReceiptData.f) && Intrinsics.d(this.g, premiumReserveTicketValidationReceiptData.g) && Intrinsics.d(this.h, premiumReserveTicketValidationReceiptData.h) && Intrinsics.d(this.i, premiumReserveTicketValidationReceiptData.i) && Intrinsics.d(this.j, premiumReserveTicketValidationReceiptData.j) && Intrinsics.d(this.k, premiumReserveTicketValidationReceiptData.k) && Intrinsics.d(this.l, premiumReserveTicketValidationReceiptData.l) && Intrinsics.d(this.m, premiumReserveTicketValidationReceiptData.m) && this.n == premiumReserveTicketValidationReceiptData.n && Intrinsics.d(this.o, premiumReserveTicketValidationReceiptData.o);
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: f */
    public final /* bridge */ String getS() {
        return null;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: g */
    public final /* bridge */ String getM() {
        return null;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    public final Long getAmount() {
        return Long.valueOf(this.e);
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: h */
    public final /* bridge */ String getP() {
        return null;
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(this.f7487a.hashCode() * 31, 31, this.b), 31, this.c);
        long j = this.d;
        int i = (iE + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.e;
        int iE2 = nf1.e(nf1.e(nf1.e(nf1.e(nf1.e((i + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
        Map map = this.k;
        int iE3 = nf1.e((iE2 + (map == null ? 0 : map.hashCode())) * 31, 31, this.l);
        String str = this.m;
        int iHashCode = (this.n.hashCode() + ((iE3 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        RefundInfoAppModel refundInfoAppModel = this.o;
        return iHashCode + (refundInfoAppModel != null ? refundInfoAppModel.hashCode() : 0);
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: i */
    public final /* bridge */ String getQ() {
        return null;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    public final /* bridge */ String j() {
        return null;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: k */
    public final /* bridge */ String getR() {
        return null;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getD() {
        return this.j;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    public final /* bridge */ String m() {
        return null;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: n */
    public final /* bridge */ String getN() {
        return null;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getH() {
        return this.l;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getF3843a() {
        return this.f7487a;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: q, reason: from getter */
    public final RefundInfoAppModel getO() {
        return this.o;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    public final /* bridge */ String r() {
        return "";
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getE() {
        return this.i;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getF() {
        return this.f;
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PremiumReserveTicketValidationReceiptData(bookingId=", this.f7487a, ", productType=", this.b, ", productSubType=");
        n21.p(this.d, this.c, ", punchTime=", sbE);
        xs.r(this.e, ", amount=", ", startStop=", sbE);
        cb0.t(sbE, this.f, ", endStop=", this.g, ", routeName=");
        cb0.t(sbE, this.h, ", conductorId=", this.i, ", vehicleNo=");
        sbE.append(this.j);
        sbE.append(", passengerDetails=");
        sbE.append(this.k);
        sbE.append(", endStopId=");
        cb0.t(sbE, this.l, ", via=", this.m, ", routeNamingSchemeType=");
        sbE.append(this.n);
        sbE.append(", refundInfoAppModel=");
        sbE.append(this.o);
        sbE.append(")");
        return sbE.toString();
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getI() {
        return this.h;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: v */
    public final /* bridge */ String getO() {
        return null;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    public final /* bridge */ String w() {
        return null;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: x, reason: from getter */
    public final Map getJ() {
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

    public PremiumReserveTicketValidationReceiptData(String bookingId, String productType, String productSubType, long j, long j2, String startStop, String endStop, String routeName, String conductorId, String vehicleNo, Map map, String str, String str2, RouteNamingSchemeType routeNamingSchemeType, RefundInfoAppModel refundInfoAppModel, int i) {
        Map map2 = (i & 1024) != 0 ? null : map;
        String endStopId = (i & 2048) != 0 ? "" : str;
        RefundInfoAppModel refundInfoAppModel2 = (i & 16384) == 0 ? refundInfoAppModel : null;
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        Intrinsics.i(startStop, "startStop");
        Intrinsics.i(endStop, "endStop");
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(conductorId, "conductorId");
        Intrinsics.i(vehicleNo, "vehicleNo");
        Intrinsics.i(endStopId, "endStopId");
        Intrinsics.i(routeNamingSchemeType, "routeNamingSchemeType");
        this.f7487a = bookingId;
        this.b = productType;
        this.c = productSubType;
        this.d = j;
        this.e = j2;
        this.f = startStop;
        this.g = endStop;
        this.h = routeName;
        this.i = conductorId;
        this.j = vehicleNo;
        this.k = map2;
        this.l = endStopId;
        this.m = str2;
        this.n = routeNamingSchemeType;
        this.o = refundInfoAppModel2;
    }
}
