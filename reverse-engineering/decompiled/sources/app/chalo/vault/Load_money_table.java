package app.chalo.vault;

import defpackage.cb0;
import defpackage.nf1;
import defpackage.t10;
import defpackage.vo1;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/vault/Load_money_table;", "", "vault_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Load_money_table {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10747a;
    public final long b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public Load_money_table(long j, long j2, String orderId, String transactionId, String status, String str, String userId, String walletId) {
        Intrinsics.i(orderId, "orderId");
        Intrinsics.i(transactionId, "transactionId");
        Intrinsics.i(status, "status");
        Intrinsics.i(userId, "userId");
        Intrinsics.i(walletId, "walletId");
        this.f10747a = orderId;
        this.b = j;
        this.c = j2;
        this.d = transactionId;
        this.e = status;
        this.f = str;
        this.g = userId;
        this.h = walletId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Load_money_table)) {
            return false;
        }
        Load_money_table load_money_table = (Load_money_table) obj;
        return Intrinsics.d(this.f10747a, load_money_table.f10747a) && this.b == load_money_table.b && this.c == load_money_table.c && Intrinsics.d(this.d, load_money_table.d) && Intrinsics.d(this.e, load_money_table.e) && Intrinsics.d(this.f, load_money_table.f) && Intrinsics.d(this.g, load_money_table.g) && Intrinsics.d(this.h, load_money_table.h);
    }

    public final int hashCode() {
        int iHashCode = this.f10747a.hashCode() * 31;
        long j = this.b;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.c;
        int iE = nf1.e(nf1.e((i + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.d), 31, this.e);
        String str = this.f;
        return this.h.hashCode() + nf1.e((iE + (str == null ? 0 : str.hashCode())) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sbM = t10.m(this.b, "Load_money_table(orderId=", this.f10747a, ", amount=");
        xs.r(this.c, ", transactionTime=", ", transactionId=", sbM);
        cb0.t(sbM, this.d, ", status=", this.e, ", paymentMode=");
        cb0.t(sbM, this.f, ", userId=", this.g, ", walletId=");
        return vo1.p(sbM, this.h, ")");
    }
}
