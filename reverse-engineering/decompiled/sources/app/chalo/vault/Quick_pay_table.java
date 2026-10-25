package app.chalo.vault;

import defpackage.cb0;
import defpackage.dd;
import defpackage.n21;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/vault/Quick_pay_table;", "", "vault_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Quick_pay_table {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10749a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final Long g;
    public final long h;
    public final String i;
    public final Long j;
    public final String k;

    public Quick_pay_table(String status, String transactionId, String paymentMode, String str, String str2, long j, Long l, long j2, String orderId, Long l2, String walletId) {
        Intrinsics.i(status, "status");
        Intrinsics.i(transactionId, "transactionId");
        Intrinsics.i(paymentMode, "paymentMode");
        Intrinsics.i(orderId, "orderId");
        Intrinsics.i(walletId, "walletId");
        this.f10749a = status;
        this.b = transactionId;
        this.c = paymentMode;
        this.d = str;
        this.e = str2;
        this.f = j;
        this.g = l;
        this.h = j2;
        this.i = orderId;
        this.j = l2;
        this.k = walletId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Quick_pay_table)) {
            return false;
        }
        Quick_pay_table quick_pay_table = (Quick_pay_table) obj;
        return Intrinsics.d(this.f10749a, quick_pay_table.f10749a) && Intrinsics.d(this.b, quick_pay_table.b) && Intrinsics.d(this.c, quick_pay_table.c) && Intrinsics.d(this.d, quick_pay_table.d) && Intrinsics.d(this.e, quick_pay_table.e) && this.f == quick_pay_table.f && Intrinsics.d(this.g, quick_pay_table.g) && this.h == quick_pay_table.h && Intrinsics.d(this.i, quick_pay_table.i) && Intrinsics.d(this.j, quick_pay_table.j) && Intrinsics.d(this.k, quick_pay_table.k);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(this.f10749a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        long j = this.f;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        Long l = this.g;
        int iHashCode3 = (i + (l == null ? 0 : l.hashCode())) * 31;
        long j2 = this.h;
        int iE2 = nf1.e((iHashCode3 + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.i);
        Long l2 = this.j;
        return this.k.hashCode() + ((iE2 + (l2 != null ? l2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("Quick_pay_table(status=", this.f10749a, ", transactionId=", this.b, ", paymentMode=");
        cb0.t(sbE, this.c, ", qrCode=", this.d, ", soundTone=");
        n21.p(this.f, this.e, ", expiryTime=", sbE);
        sbE.append(", activationDuration=");
        sbE.append(this.g);
        sbE.append(", amount=");
        dd.k(this.h, ", orderId=", this.i, sbE);
        sbE.append(", punchTime=");
        sbE.append(this.j);
        sbE.append(", walletId=");
        sbE.append(this.k);
        sbE.append(")");
        return sbE.toString();
    }
}
