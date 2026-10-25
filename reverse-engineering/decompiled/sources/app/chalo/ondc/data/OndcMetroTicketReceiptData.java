package app.chalo.ondc.data;

import app.chalo.data.RefundInfoAppModel;
import app.chalo.ondc.model.app.OndcMetroTicketAppModel;
import app.chalo.ondc.model.app.PaymentInfoAppModel;
import app.chalo.receipt.ProductReceiptData;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ondc/data/OndcMetroTicketReceiptData;", "Lapp/chalo/receipt/ProductReceiptData;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OndcMetroTicketReceiptData implements ProductReceiptData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OndcMetroTicketAppModel f6698a;

    public OndcMetroTicketReceiptData(OndcMetroTicketAppModel ondcMetroTicketAppModel) {
        this.f6698a = ondcMetroTicketAppModel;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    public final String b() {
        return "ondcMetroTicket";
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: e */
    public final long getB() {
        Long l = this.f6698a.f;
        if (l != null) {
            return l.longValue();
        }
        return -1L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OndcMetroTicketReceiptData) && Intrinsics.d(this.f6698a, ((OndcMetroTicketReceiptData) obj).f6698a);
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
        return Long.valueOf(this.f6698a.d);
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: h */
    public final /* bridge */ String getQ() {
        return null;
    }

    public final int hashCode() {
        return this.f6698a.hashCode();
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: i */
    public final /* bridge */ String getR() {
        return null;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    public final String j() {
        return this.f6698a.t;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: k */
    public final /* bridge */ String getS() {
        return null;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: l */
    public final String getD() {
        return "";
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
    /* JADX INFO: renamed from: p */
    public final String getF6772a() {
        return this.f6698a.f6769a;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    public final RefundInfoAppModel q() {
        return this.f6698a.p;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    public final String r() {
        String str = this.f6698a.s;
        return str == null ? "" : str;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: s */
    public final String getE() {
        return "";
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: t */
    public final String getF() {
        String str = this.f6698a.n;
        return str == null ? "" : str;
    }

    public final String toString() {
        return "OndcMetroTicketReceiptData(ticket=" + this.f6698a + ")";
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: u */
    public final String getH() {
        String str = this.f6698a.m;
        return str == null ? "" : str;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: v */
    public final /* bridge */ String getP() {
        return null;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    public final String w() {
        PaymentInfoAppModel paymentInfoAppModel = this.f6698a.r;
        if (paymentInfoAppModel != null) {
            return paymentInfoAppModel.f6774a;
        }
        return null;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: x */
    public final Map getK() {
        return this.f6698a.l;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    /* JADX INFO: renamed from: y */
    public final String getG() {
        String str = this.f6698a.o;
        return str == null ? "" : str;
    }

    @Override // app.chalo.receipt.ProductReceiptData
    public final /* bridge */ List z() {
        return null;
    }
}
