package app.chalo.quickpay.validation.manager;

import app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel;
import app.chalo.walletframework.quickpay.data.model.QuickPayOrderStatus;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import defpackage.cb0;
import defpackage.n21;
import defpackage.nf1;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/quickpay/validation/manager/QuickPayValidationModel;", "Lapp/chalo/validationsdk/blevalidation/data/models/ProductValidationModel;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class QuickPayValidationModel implements ProductValidationModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final QuickPayOrderStatus f8915a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final Long g;
    public final int h;
    public final String i;
    public final String j;
    public final Long k;
    public final String l;
    public final WalletTypeIdentifier m;
    public final long n;

    public QuickPayValidationModel(QuickPayOrderStatus status, String transactionId, String paymentMode, String str, String str2, long j, Long l, int i, String orderId, String productName, Long l2, String walletId, WalletTypeIdentifier walletTypeIdentifier, long j2) {
        Intrinsics.i(status, "status");
        Intrinsics.i(transactionId, "transactionId");
        Intrinsics.i(paymentMode, "paymentMode");
        Intrinsics.i(orderId, "orderId");
        Intrinsics.i(productName, "productName");
        Intrinsics.i(walletId, "walletId");
        Intrinsics.i(walletTypeIdentifier, "walletTypeIdentifier");
        this.f8915a = status;
        this.b = transactionId;
        this.c = paymentMode;
        this.d = str;
        this.e = str2;
        this.f = j;
        this.g = l;
        this.h = i;
        this.i = orderId;
        this.j = productName;
        this.k = l2;
        this.l = walletId;
        this.m = walletTypeIdentifier;
        this.n = j2;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    public final String a() {
        return "quickpay";
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    public final String b() {
        return "quickpay";
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getI() {
        return this.i;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    public final boolean d() {
        Long l = null;
        Long l2 = this.k;
        if (l2 != null && l2.longValue() > 0) {
            l = l2;
        }
        return l != null;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Long getK() {
        return this.k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuickPayValidationModel)) {
            return false;
        }
        QuickPayValidationModel quickPayValidationModel = (QuickPayValidationModel) obj;
        return this.f8915a == quickPayValidationModel.f8915a && Intrinsics.d(this.b, quickPayValidationModel.b) && Intrinsics.d(this.c, quickPayValidationModel.c) && Intrinsics.d(this.d, quickPayValidationModel.d) && Intrinsics.d(this.e, quickPayValidationModel.e) && this.f == quickPayValidationModel.f && Intrinsics.d(this.g, quickPayValidationModel.g) && this.h == quickPayValidationModel.h && Intrinsics.d(this.i, quickPayValidationModel.i) && Intrinsics.d(this.j, quickPayValidationModel.j) && Intrinsics.d(this.k, quickPayValidationModel.k) && Intrinsics.d(this.l, quickPayValidationModel.l) && Intrinsics.d(this.m, quickPayValidationModel.m) && this.n == quickPayValidationModel.n;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getE() {
        return this.e;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getD() {
        return this.d;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    /* JADX INFO: renamed from: getAmount, reason: from getter */
    public final int getH() {
        return this.h;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getF() {
        return this.f;
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(this.f8915a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        long j = this.f;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        Long l = this.g;
        int iE2 = nf1.e(nf1.e((((i + (l == null ? 0 : l.hashCode())) * 31) + this.h) * 31, 31, this.i), 31, this.j);
        Long l2 = this.k;
        int iHashCode3 = (this.m.hashCode() + nf1.e((iE2 + (l2 != null ? l2.hashCode() : 0)) * 31, 31, this.l)) * 31;
        long j2 = this.n;
        return iHashCode3 + ((int) (j2 ^ (j2 >>> 32)));
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getJ() {
        return this.j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuickPayValidationModel(status=");
        sb.append(this.f8915a);
        sb.append(", transactionId=");
        sb.append(this.b);
        sb.append(", paymentMode=");
        cb0.t(sb, this.c, ", qrCode=", this.d, ", soundStaticTone=");
        n21.p(this.f, this.e, ", expiryTime=", sb);
        sb.append(", activationDuration=");
        sb.append(this.g);
        sb.append(", amount=");
        sb.append(this.h);
        cb0.t(sb, ", orderId=", this.i, ", productName=", this.j);
        sb.append(", punchTime=");
        sb.append(this.k);
        sb.append(", walletId=");
        sb.append(this.l);
        sb.append(", walletTypeIdentifier=");
        sb.append(this.m);
        sb.append(", activationExpiryTimestamp=");
        return uf0.m(this.n, ")", sb);
    }
}
