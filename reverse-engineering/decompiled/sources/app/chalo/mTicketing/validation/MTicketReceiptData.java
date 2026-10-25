package app.chalo.mTicketing.validation;

import app.chalo.data.RefundInfoAppModel;
import app.chalo.receipt.ProductReceiptData;
import defpackage.cb0;
import defpackage.dd;
import defpackage.n21;
import defpackage.nf1;
import defpackage.sg0;
import defpackage.xs;
import defpackage.z40;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/mTicketing/validation/MTicketReceiptData;", "Lapp/chalo/receipt/ProductReceiptData;", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class MTicketReceiptData implements ProductReceiptData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] n = {null, null, null, null, null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new sg0(5)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5392a;
    public final String b;
    public final long c;
    public final long d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final Map j;
    public final String k;
    public final long l;
    public final String m;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/mTicketing/validation/MTicketReceiptData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/mTicketing/validation/MTicketReceiptData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<MTicketReceiptData> serializer() {
            return MTicketReceiptData$$serializer.f5393a;
        }
    }

    public /* synthetic */ MTicketReceiptData(int i, String str, String str2, long j, long j2, String str3, String str4, String str5, String str6, String str7, Map map, String str8, long j3, String str9) {
        if (4095 != (i & 4095)) {
            PluginExceptionsKt.b(MTicketReceiptData$$serializer.f5393a.getDescriptor(), i, 4095);
            throw null;
        }
        this.f5392a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = map;
        this.k = str8;
        this.l = j3;
        this.m = (i & 4096) == 0 ? "" : str9;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getB() {
        return this.b;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getB() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MTicketReceiptData)) {
            return false;
        }
        MTicketReceiptData mTicketReceiptData = (MTicketReceiptData) obj;
        return Intrinsics.d(this.f5392a, mTicketReceiptData.f5392a) && Intrinsics.d(this.b, mTicketReceiptData.b) && this.c == mTicketReceiptData.c && this.d == mTicketReceiptData.d && Intrinsics.d(this.e, mTicketReceiptData.e) && Intrinsics.d(this.f, mTicketReceiptData.f) && Intrinsics.d(this.g, mTicketReceiptData.g) && Intrinsics.d(this.h, mTicketReceiptData.h) && Intrinsics.d(this.i, mTicketReceiptData.i) && Intrinsics.d(this.j, mTicketReceiptData.j) && Intrinsics.d(this.k, mTicketReceiptData.k) && this.l == mTicketReceiptData.l && Intrinsics.d(this.m, mTicketReceiptData.m);
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
    /* JADX INFO: renamed from: getAmount */
    public final Long getC() {
        return Long.valueOf(this.d);
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: h */
    public final /* bridge */ String getP() {
        return null;
    }

    public final int hashCode() {
        int iE = nf1.e(this.f5392a.hashCode() * 31, 31, this.b);
        long j = this.c;
        int i = (iE + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.d;
        int iE2 = nf1.e(nf1.e(nf1.e(nf1.e(nf1.e((i + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        Map map = this.j;
        int iE3 = nf1.e((iE2 + (map == null ? 0 : map.hashCode())) * 31, 31, this.k);
        long j3 = this.l;
        return this.m.hashCode() + ((iE3 + ((int) (j3 ^ (j3 >>> 32)))) * 31);
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
    public final String getE() {
        return this.e;
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
    public final String getM() {
        return this.m;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getF6019a() {
        return this.f5392a;
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
        return this.f;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getG() {
        return this.g;
    }

    public final String toString() {
        StringBuilder sbE = dd.e("MTicketReceiptData(productId=", this.f5392a, ", productSubType=", this.b, ", punchTime=");
        sbE.append(this.c);
        xs.r(this.d, ", amount=", ", vehicleNo=", sbE);
        cb0.t(sbE, this.e, ", conductorId=", this.f, ", startStop=");
        cb0.t(sbE, this.g, ", endStop=", this.h, ", routeName=");
        sbE.append(this.i);
        sbE.append(", passengerDetails=");
        sbE.append(this.j);
        sbE.append(", productType=");
        n21.p(this.l, this.k, ", activationTimeStamp=", sbE);
        return z40.h(sbE, ", endStopId=", this.m, ")");
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getI() {
        return this.i;
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
        return this.j;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: y, reason: from getter */
    public final String getH() {
        return this.h;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    public final /* bridge */ List z() {
        return null;
    }

    public MTicketReceiptData(String productId, long j, long j2, String vehicleNo, String conductorId, String startStop, String endStop, String routeName, Map map, long j3, String endStopId) {
        Intrinsics.i(productId, "productId");
        Intrinsics.i(vehicleNo, "vehicleNo");
        Intrinsics.i(conductorId, "conductorId");
        Intrinsics.i(startStop, "startStop");
        Intrinsics.i(endStop, "endStop");
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(endStopId, "endStopId");
        this.f5392a = productId;
        this.b = "singleJourneyTicket";
        this.c = j;
        this.d = j2;
        this.e = vehicleNo;
        this.f = conductorId;
        this.g = startStop;
        this.h = endStop;
        this.i = routeName;
        this.j = map;
        this.k = "singleJourneyTicket";
        this.l = j3;
        this.m = endStopId;
    }
}
