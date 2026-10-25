package app.chalo.walletframework.wallet.data.repository.entity;

import app.chalo.walletframework.wallet.data.model.CachedWalletStatus;
import app.chalo.walletframework.wallet.data.model.WalletType;
import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/data/repository/entity/WalletEntity;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WalletEntity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11032a;
    public final String b;
    public final WalletType c;
    public final String d;
    public final CachedWalletStatus e;
    public final int f;
    public final long g;
    public final Long h;

    public WalletEntity(String userId, String walletId, WalletType type, String agency, CachedWalletStatus walletStatus, int i, long j, Long l) {
        Intrinsics.i(userId, "userId");
        Intrinsics.i(walletId, "walletId");
        Intrinsics.i(type, "type");
        Intrinsics.i(agency, "agency");
        Intrinsics.i(walletStatus, "walletStatus");
        this.f11032a = userId;
        this.b = walletId;
        this.c = type;
        this.d = agency;
        this.e = walletStatus;
        this.f = i;
        this.g = j;
        this.h = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletEntity)) {
            return false;
        }
        WalletEntity walletEntity = (WalletEntity) obj;
        return Intrinsics.d(this.f11032a, walletEntity.f11032a) && Intrinsics.d(this.b, walletEntity.b) && this.c == walletEntity.c && Intrinsics.d(this.d, walletEntity.d) && this.e == walletEntity.e && this.f == walletEntity.f && this.g == walletEntity.g && Intrinsics.d(this.h, walletEntity.h);
    }

    public final int hashCode() {
        int iHashCode = (((this.e.hashCode() + nf1.e((this.c.hashCode() + nf1.e(this.f11032a.hashCode() * 31, 31, this.b)) * 31, 31, this.d)) * 31) + this.f) * 31;
        long j = this.g;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        Long l = this.h;
        return i + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sbE = dd.e("WalletEntity(userId=", this.f11032a, ", walletId=", this.b, ", type=");
        sbE.append(this.c);
        sbE.append(", agency=");
        sbE.append(this.d);
        sbE.append(", walletStatus=");
        sbE.append(this.e);
        sbE.append(", balance=");
        sbE.append(this.f);
        sbE.append(", remainingLoadLimit=");
        sbE.append(this.g);
        sbE.append(", walletReclaimTime=");
        sbE.append(this.h);
        sbE.append(")");
        return sbE.toString();
    }
}
