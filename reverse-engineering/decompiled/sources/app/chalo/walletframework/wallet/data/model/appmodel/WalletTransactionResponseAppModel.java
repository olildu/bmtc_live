package app.chalo.walletframework.wallet.data.model.appmodel;

import defpackage.r30;
import defpackage.xs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/data/model/appmodel/WalletTransactionResponseAppModel;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WalletTransactionResponseAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f11017a;
    public final List b;
    public final List c;

    public WalletTransactionResponseAppModel(List quickPayList, List loadMoneyList, List chaloPayList) {
        Intrinsics.i(quickPayList, "quickPayList");
        Intrinsics.i(loadMoneyList, "loadMoneyList");
        Intrinsics.i(chaloPayList, "chaloPayList");
        this.f11017a = quickPayList;
        this.b = loadMoneyList;
        this.c = chaloPayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletTransactionResponseAppModel)) {
            return false;
        }
        WalletTransactionResponseAppModel walletTransactionResponseAppModel = (WalletTransactionResponseAppModel) obj;
        return Intrinsics.d(this.f11017a, walletTransactionResponseAppModel.f11017a) && Intrinsics.d(this.b, walletTransactionResponseAppModel.b) && Intrinsics.d(this.c, walletTransactionResponseAppModel.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + r30.b(this.f11017a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WalletTransactionResponseAppModel(quickPayList=");
        sb.append(this.f11017a);
        sb.append(", loadMoneyList=");
        sb.append(this.b);
        sb.append(", chaloPayList=");
        return xs.l(sb, this.c, ")");
    }
}
