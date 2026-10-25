package app.chalo.vault;

import defpackage.cb0;
import defpackage.d;
import defpackage.dd;
import defpackage.n21;
import defpackage.nf1;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/vault/Wallet_transaction_table;", "", "vault_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Wallet_transaction_table {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10751a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final String g;
    public final long h;

    public Wallet_transaction_table(long j, long j2, String transactionId, String transactionType, String walletId, String userId, String orderId, String transactionStatus) {
        Intrinsics.i(transactionId, "transactionId");
        Intrinsics.i(transactionType, "transactionType");
        Intrinsics.i(walletId, "walletId");
        Intrinsics.i(userId, "userId");
        Intrinsics.i(orderId, "orderId");
        Intrinsics.i(transactionStatus, "transactionStatus");
        this.f10751a = transactionId;
        this.b = transactionType;
        this.c = walletId;
        this.d = userId;
        this.e = orderId;
        this.f = j;
        this.g = transactionStatus;
        this.h = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Wallet_transaction_table)) {
            return false;
        }
        Wallet_transaction_table wallet_transaction_table = (Wallet_transaction_table) obj;
        return Intrinsics.d(this.f10751a, wallet_transaction_table.f10751a) && Intrinsics.d(this.b, wallet_transaction_table.b) && Intrinsics.d(this.c, wallet_transaction_table.c) && Intrinsics.d(this.d, wallet_transaction_table.d) && Intrinsics.d(this.e, wallet_transaction_table.e) && this.f == wallet_transaction_table.f && Intrinsics.d(this.g, wallet_transaction_table.g) && this.h == wallet_transaction_table.h;
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(nf1.e(nf1.e(this.f10751a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        long j = this.f;
        int iE2 = nf1.e((iE + ((int) (j ^ (j >>> 32)))) * 31, 31, this.g);
        long j2 = this.h;
        return iE2 + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sbE = dd.e("Wallet_transaction_table(transactionId=", this.f10751a, ", transactionType=", this.b, ", walletId=");
        cb0.t(sbE, this.c, ", userId=", this.d, ", orderId=");
        n21.p(this.f, this.e, ", amount=", sbE);
        d.t(sbE, ", transactionStatus=", this.g, ", transactionTime=");
        return uf0.m(this.h, ")", sbE);
    }
}
