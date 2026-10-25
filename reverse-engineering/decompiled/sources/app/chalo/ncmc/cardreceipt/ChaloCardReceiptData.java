package app.chalo.ncmc.cardreceipt;

import androidx.core.app.FrameMetricsAggregator;
import app.chalo.data.RefundInfoAppModel;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.receipt.ProductReceiptData;
import defpackage.cb0;
import defpackage.ji;
import defpackage.t10;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/cardreceipt/ChaloCardReceiptData;", "Lapp/chalo/receipt/ProductReceiptData;", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ChaloCardReceiptData implements ProductReceiptData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] l = {null, null, null, null, null, null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ji(8))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6019a;
    public final long b;
    public final Long c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final RouteNamingSchemeType k;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/cardreceipt/ChaloCardReceiptData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/cardreceipt/ChaloCardReceiptData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ChaloCardReceiptData> serializer() {
            return ChaloCardReceiptData$$serializer.f6020a;
        }
    }

    public /* synthetic */ ChaloCardReceiptData(int i, String str, long j, Long l2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, RouteNamingSchemeType routeNamingSchemeType) {
        if (511 != (i & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.b(ChaloCardReceiptData$$serializer.f6020a.getDescriptor(), i, FrameMetricsAggregator.EVERY_DURATION);
            throw null;
        }
        this.f6019a = str;
        this.b = j;
        this.c = l2;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str8;
        }
        this.k = (i & 1024) == 0 ? RouteNamingSchemeType.DEFAULT : routeNamingSchemeType;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: b */
    public final String getB() {
        return "chaloCard";
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
        if (!(obj instanceof ChaloCardReceiptData)) {
            return false;
        }
        ChaloCardReceiptData chaloCardReceiptData = (ChaloCardReceiptData) obj;
        return Intrinsics.d(this.f6019a, chaloCardReceiptData.f6019a) && this.b == chaloCardReceiptData.b && Intrinsics.d(this.c, chaloCardReceiptData.c) && Intrinsics.d(this.d, chaloCardReceiptData.d) && Intrinsics.d(this.e, chaloCardReceiptData.e) && Intrinsics.d(this.f, chaloCardReceiptData.f) && Intrinsics.d(this.g, chaloCardReceiptData.g) && Intrinsics.d(this.h, chaloCardReceiptData.h) && Intrinsics.d(this.i, chaloCardReceiptData.i) && Intrinsics.d(this.j, chaloCardReceiptData.j) && this.k == chaloCardReceiptData.k;
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
    /* JADX INFO: renamed from: getAmount, reason: from getter */
    public final Long getC() {
        return this.c;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: h */
    public final /* bridge */ String getP() {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.f6019a.hashCode() * 31;
        long j = this.b;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        Long l2 = this.c;
        int iHashCode2 = (i + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.d;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.i;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.j;
        return this.k.hashCode() + ((iHashCode8 + (str7 != null ? str7.hashCode() : 0)) * 31);
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
    /* JADX INFO: renamed from: l */
    public final String getE() {
        String str = this.f;
        return str == null ? "" : str;
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
    /* JADX INFO: renamed from: o */
    public final /* bridge */ String getM() {
        return "";
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getF6019a() {
        return this.f6019a;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: q */
    public final RefundInfoAppModel getO() {
        return null;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    public final String r() {
        String str = this.d;
        return str == null ? "" : str;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: s */
    public final String getF() {
        String str = this.e;
        return str == null ? "" : str;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: t */
    public final String getG() {
        String str = this.h;
        return str == null ? "" : str;
    }

    public final String toString() {
        StringBuilder sbM = t10.m(this.b, "ChaloCardReceiptData(transactionId=", this.f6019a, ", transactionTime=");
        sbM.append(", amount=");
        sbM.append(this.c);
        sbM.append(", paymentMode=");
        sbM.append(this.d);
        cb0.t(sbM, ", conductorId=", this.e, ", vehicleNo=", this.f);
        cb0.t(sbM, ", routeName=", this.g, ", startStopName=", this.h);
        cb0.t(sbM, ", endStopName=", this.i, ", via=", this.j);
        sbM.append(", routeNamingSchemeType=");
        sbM.append(this.k);
        sbM.append(")");
        return sbM.toString();
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: u */
    public final String getI() {
        String str = this.g;
        return str == null ? "" : str;
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
    /* JADX INFO: renamed from: x */
    public final Map getJ() {
        return null;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: y */
    public final String getH() {
        String str = this.i;
        return str == null ? "" : str;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    public final /* bridge */ List z() {
        return null;
    }

    public ChaloCardReceiptData(String transactionId, long j, Long l2, String str, String str2, String str3, String str4, String str5, String str6, RouteNamingSchemeType routeNamingSchemeType) {
        Intrinsics.i(transactionId, "transactionId");
        Intrinsics.i(routeNamingSchemeType, "routeNamingSchemeType");
        this.f6019a = transactionId;
        this.b = j;
        this.c = l2;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = null;
        this.k = routeNamingSchemeType;
    }
}
