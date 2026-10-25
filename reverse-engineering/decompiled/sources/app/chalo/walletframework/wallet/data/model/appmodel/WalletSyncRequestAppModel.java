package app.chalo.walletframework.wallet.data.model.appmodel;

import defpackage.nf1;
import defpackage.t10;
import defpackage.xs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/data/model/appmodel/WalletSyncRequestAppModel;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WalletSyncRequestAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11015a;
    public final String b;
    public final String c;
    public final boolean d;
    public final List e;

    public WalletSyncRequestAppModel(int i, String userId, String str, boolean z, List unSyncedQuickPayOrders) {
        Intrinsics.i(userId, "userId");
        Intrinsics.i(unSyncedQuickPayOrders, "unSyncedQuickPayOrders");
        this.f11015a = i;
        this.b = userId;
        this.c = str;
        this.d = z;
        this.e = unSyncedQuickPayOrders;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletSyncRequestAppModel)) {
            return false;
        }
        WalletSyncRequestAppModel walletSyncRequestAppModel = (WalletSyncRequestAppModel) obj;
        return this.f11015a == walletSyncRequestAppModel.f11015a && Intrinsics.d(this.b, walletSyncRequestAppModel.b) && Intrinsics.d(this.c, walletSyncRequestAppModel.c) && this.d == walletSyncRequestAppModel.d && Intrinsics.d(this.e, walletSyncRequestAppModel.e);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f11015a * 31, 31, this.b);
        String str = this.c;
        return this.e.hashCode() + ((((iE + (str == null ? 0 : str.hashCode())) * 31) + (this.d ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        StringBuilder sbP = nf1.p(this.f11015a, "WalletSyncRequestAppModel(appVersion=", ", userId=", this.b, ", walletId=");
        t10.s(this.c, ", fetchTransactions=", ", unSyncedQuickPayOrders=", sbP, this.d);
        return xs.l(sbP, this.e, ")");
    }
}
