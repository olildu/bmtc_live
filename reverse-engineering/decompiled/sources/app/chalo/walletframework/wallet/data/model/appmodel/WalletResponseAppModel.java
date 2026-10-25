package app.chalo.walletframework.wallet.data.model.appmodel;

import defpackage.dd;
import defpackage.nf1;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/data/model/appmodel/WalletResponseAppModel;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WalletResponseAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11014a;
    public final String b;
    public final WalletStatusResponse c;
    public final int d;
    public final long e;
    public final Long f;
    public final String g;

    public WalletResponseAppModel(String walletId, String userId, WalletStatusResponse status, int i, long j, Long l, String str) {
        Intrinsics.i(walletId, "walletId");
        Intrinsics.i(userId, "userId");
        Intrinsics.i(status, "status");
        this.f11014a = walletId;
        this.b = userId;
        this.c = status;
        this.d = i;
        this.e = j;
        this.f = l;
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletResponseAppModel)) {
            return false;
        }
        WalletResponseAppModel walletResponseAppModel = (WalletResponseAppModel) obj;
        return Intrinsics.d(this.f11014a, walletResponseAppModel.f11014a) && Intrinsics.d(this.b, walletResponseAppModel.b) && this.c == walletResponseAppModel.c && this.d == walletResponseAppModel.d && this.e == walletResponseAppModel.e && Intrinsics.d(this.f, walletResponseAppModel.f) && Intrinsics.d(this.g, walletResponseAppModel.g);
    }

    public final int hashCode() {
        int iHashCode = (((this.c.hashCode() + nf1.e(this.f11014a.hashCode() * 31, 31, this.b)) * 31) + this.d) * 31;
        long j = this.e;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        Long l = this.f;
        int iHashCode2 = (i + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.g;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("WalletResponseAppModel(walletId=", this.f11014a, ", userId=", this.b, ", status=");
        sbE.append(this.c);
        sbE.append(", balance=");
        sbE.append(this.d);
        sbE.append(", remainingLoadLimit=");
        sbE.append(this.e);
        sbE.append(", walletReclaimTime=");
        sbE.append(this.f);
        return z40.h(sbE, ", agency=", this.g, ")");
    }
}
