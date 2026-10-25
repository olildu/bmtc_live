package app.chalo.vault;

import defpackage.cb0;
import defpackage.dd;
import defpackage.n21;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/vault/Wallet_table;", "", "vault_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Wallet_table {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10750a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;
    public final Long h;

    public Wallet_table(String userId, String walletId, String agency, String type, String walletStatus, long j, long j2, Long l) {
        Intrinsics.i(userId, "userId");
        Intrinsics.i(walletId, "walletId");
        Intrinsics.i(agency, "agency");
        Intrinsics.i(type, "type");
        Intrinsics.i(walletStatus, "walletStatus");
        this.f10750a = userId;
        this.b = walletId;
        this.c = agency;
        this.d = type;
        this.e = walletStatus;
        this.f = j;
        this.g = j2;
        this.h = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Wallet_table)) {
            return false;
        }
        Wallet_table wallet_table = (Wallet_table) obj;
        return Intrinsics.d(this.f10750a, wallet_table.f10750a) && Intrinsics.d(this.b, wallet_table.b) && Intrinsics.d(this.c, wallet_table.c) && Intrinsics.d(this.d, wallet_table.d) && Intrinsics.d(this.e, wallet_table.e) && this.f == wallet_table.f && this.g == wallet_table.g && Intrinsics.d(this.h, wallet_table.h);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(nf1.e(nf1.e(this.f10750a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        long j = this.f;
        int i = (iE + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.g;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        Long l = this.h;
        return i2 + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sbE = dd.e("Wallet_table(userId=", this.f10750a, ", walletId=", this.b, ", agency=");
        cb0.t(sbE, this.c, ", type=", this.d, ", walletStatus=");
        n21.p(this.f, this.e, ", balance=", sbE);
        xs.r(this.g, ", remainingLoadLimit=", ", walletReclaimTime=", sbE);
        return pk0.l(sbE, this.h, ")");
    }
}
