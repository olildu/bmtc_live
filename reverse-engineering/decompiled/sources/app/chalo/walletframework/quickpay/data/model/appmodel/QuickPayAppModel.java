package app.chalo.walletframework.quickpay.data.model.appmodel;

import app.chalo.walletframework.quickpay.data.model.QuickPayOrderStatus;
import defpackage.cb0;
import defpackage.n21;
import defpackage.nf1;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/quickpay/data/model/appmodel/QuickPayAppModel;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class QuickPayAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final QuickPayOrderStatus f10918a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final Long g;
    public final int h;
    public final String i;
    public final Long j;
    public final String k;

    public QuickPayAppModel(QuickPayOrderStatus status, String transactionId, String paymentMode, String str, String str2, long j, Long l, int i, String orderId, Long l2, String walletId) {
        Intrinsics.i(status, "status");
        Intrinsics.i(transactionId, "transactionId");
        Intrinsics.i(paymentMode, "paymentMode");
        Intrinsics.i(orderId, "orderId");
        Intrinsics.i(walletId, "walletId");
        this.f10918a = status;
        this.b = transactionId;
        this.c = paymentMode;
        this.d = str;
        this.e = str2;
        this.f = j;
        this.g = l;
        this.h = i;
        this.i = orderId;
        this.j = l2;
        this.k = walletId;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getG() {
        return this.g;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getF() {
        return this.f;
    }

    public final boolean c(long j) {
        return j > this.f || this.j != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuickPayAppModel)) {
            return false;
        }
        QuickPayAppModel quickPayAppModel = (QuickPayAppModel) obj;
        return this.f10918a == quickPayAppModel.f10918a && Intrinsics.d(this.b, quickPayAppModel.b) && Intrinsics.d(this.c, quickPayAppModel.c) && Intrinsics.d(this.d, quickPayAppModel.d) && Intrinsics.d(this.e, quickPayAppModel.e) && this.f == quickPayAppModel.f && Intrinsics.d(this.g, quickPayAppModel.g) && this.h == quickPayAppModel.h && Intrinsics.d(this.i, quickPayAppModel.i) && Intrinsics.d(this.j, quickPayAppModel.j) && Intrinsics.d(this.k, quickPayAppModel.k);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(this.f10918a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        long j = this.f;
        int i = (((iHashCode + iHashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        Long l = this.g;
        int iE2 = nf1.e((((i + (l == null ? 0 : l.hashCode())) * 31) + this.h) * 31, 31, this.i);
        Long l2 = this.j;
        return this.k.hashCode() + ((iE2 + (l2 != null ? l2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuickPayAppModel(status=");
        sb.append(this.f10918a);
        sb.append(", transactionId=");
        sb.append(this.b);
        sb.append(", paymentMode=");
        cb0.t(sb, this.c, ", qrCode=", this.d, ", soundStaticTone=");
        n21.p(this.f, this.e, ", expiryTime=", sb);
        sb.append(", activationDuration=");
        sb.append(this.g);
        sb.append(", amount=");
        sb.append(this.h);
        sb.append(", orderId=");
        sb.append(this.i);
        sb.append(", punchTime=");
        sb.append(this.j);
        return z40.h(sb, ", walletId=", this.k, ")");
    }
}
