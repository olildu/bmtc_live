package app.chalo.walletframework.wallet.data.model.appmodel;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/data/model/appmodel/WalletLoadBalanceConfigListAppModel;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WalletLoadBalanceConfigListAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f11010a;
    public final List b;

    public WalletLoadBalanceConfigListAppModel(ArrayList arrayList, ArrayList arrayList2) {
        this.f11010a = arrayList;
        this.b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletLoadBalanceConfigListAppModel)) {
            return false;
        }
        WalletLoadBalanceConfigListAppModel walletLoadBalanceConfigListAppModel = (WalletLoadBalanceConfigListAppModel) obj;
        return Intrinsics.d(this.f11010a, walletLoadBalanceConfigListAppModel.f11010a) && Intrinsics.d(this.b, walletLoadBalanceConfigListAppModel.b);
    }

    public final int hashCode() {
        List list = this.f11010a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return "WalletLoadBalanceConfigListAppModel(walletConfig=" + this.f11010a + ", closedLoopDigitalWalletConfig=" + this.b + ")";
    }
}
