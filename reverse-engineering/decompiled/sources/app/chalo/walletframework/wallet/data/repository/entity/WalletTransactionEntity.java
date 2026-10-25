package app.chalo.walletframework.wallet.data.repository.entity;

import app.chalo.walletframework.wallet.data.model.WalletTransactionStatus;
import app.chalo.walletframework.wallet.data.model.WalletTransactionType;
import defpackage.cb0;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/data/repository/entity/WalletTransactionEntity;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WalletTransactionEntity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11033a;
    public final WalletTransactionType b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final WalletTransactionStatus g;
    public final long h;

    public WalletTransactionEntity(String transactionId, WalletTransactionType transactionType, String walletId, String userId, String orderId, int i, WalletTransactionStatus transactionStatus, long j) {
        Intrinsics.i(transactionId, "transactionId");
        Intrinsics.i(transactionType, "transactionType");
        Intrinsics.i(walletId, "walletId");
        Intrinsics.i(userId, "userId");
        Intrinsics.i(orderId, "orderId");
        Intrinsics.i(transactionStatus, "transactionStatus");
        this.f11033a = transactionId;
        this.b = transactionType;
        this.c = walletId;
        this.d = userId;
        this.e = orderId;
        this.f = i;
        this.g = transactionStatus;
        this.h = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletTransactionEntity)) {
            return false;
        }
        WalletTransactionEntity walletTransactionEntity = (WalletTransactionEntity) obj;
        return Intrinsics.d(this.f11033a, walletTransactionEntity.f11033a) && this.b == walletTransactionEntity.b && Intrinsics.d(this.c, walletTransactionEntity.c) && Intrinsics.d(this.d, walletTransactionEntity.d) && Intrinsics.d(this.e, walletTransactionEntity.e) && this.f == walletTransactionEntity.f && this.g == walletTransactionEntity.g && this.h == walletTransactionEntity.h;
    }

    public final int hashCode() {
        int iHashCode = (this.g.hashCode() + ((nf1.e(nf1.e(nf1.e((this.b.hashCode() + (this.f11033a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e) + this.f) * 31)) * 31;
        long j = this.h;
        return iHashCode + ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WalletTransactionEntity(transactionId=");
        sb.append(this.f11033a);
        sb.append(", transactionType=");
        sb.append(this.b);
        sb.append(", walletId=");
        cb0.t(sb, this.c, ", userId=", this.d, ", orderId=");
        cb0.o(this.f, this.e, ", amount=", ", transactionStatus=", sb);
        sb.append(this.g);
        sb.append(", transactionTime=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
