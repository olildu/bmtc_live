package app.chalo.vault;

import defpackage.cb0;
import defpackage.d;
import defpackage.dd;
import defpackage.nf1;
import defpackage.t10;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/vault/Chalo_pay_table;", "", "vault_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Chalo_pay_table {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10744a;
    public final long b;
    public final String c;
    public final long d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public Chalo_pay_table(long j, long j2, String orderId, String transactionId, String status, String str, String str2, String walletId) {
        Intrinsics.i(orderId, "orderId");
        Intrinsics.i(transactionId, "transactionId");
        Intrinsics.i(status, "status");
        Intrinsics.i(walletId, "walletId");
        this.f10744a = orderId;
        this.b = j;
        this.c = transactionId;
        this.d = j2;
        this.e = status;
        this.f = str;
        this.g = str2;
        this.h = walletId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Chalo_pay_table)) {
            return false;
        }
        Chalo_pay_table chalo_pay_table = (Chalo_pay_table) obj;
        return Intrinsics.d(this.f10744a, chalo_pay_table.f10744a) && this.b == chalo_pay_table.b && Intrinsics.d(this.c, chalo_pay_table.c) && this.d == chalo_pay_table.d && Intrinsics.d(this.e, chalo_pay_table.e) && Intrinsics.d(this.f, chalo_pay_table.f) && Intrinsics.d(this.g, chalo_pay_table.g) && Intrinsics.d(this.h, chalo_pay_table.h);
    }

    public final int hashCode() {
        int iHashCode = this.f10744a.hashCode() * 31;
        long j = this.b;
        int iE = nf1.e((iHashCode + ((int) (j ^ (j >>> 32)))) * 31, 31, this.c);
        long j2 = this.d;
        int iE2 = nf1.e((iE + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.e);
        String str = this.f;
        int iHashCode2 = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        return this.h.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbM = t10.m(this.b, "Chalo_pay_table(orderId=", this.f10744a, ", amount=");
        d.t(sbM, ", transactionId=", this.c, ", transactionTime=");
        dd.k(this.d, ", status=", this.e, sbM);
        cb0.t(sbM, ", productType=", this.f, ", productName=", this.g);
        return z40.h(sbM, ", walletId=", this.h, ")");
    }
}
