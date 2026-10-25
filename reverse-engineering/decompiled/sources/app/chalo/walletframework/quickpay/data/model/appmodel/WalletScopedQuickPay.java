package app.chalo.walletframework.quickpay.data.model.appmodel;

import app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/quickpay/data/model/appmodel/WalletScopedQuickPay;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WalletScopedQuickPay {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final QuickPayAppModel f10920a;
    public final WalletAppModel b;

    public WalletScopedQuickPay(QuickPayAppModel quickPay, WalletAppModel walletAppModel) {
        Intrinsics.i(quickPay, "quickPay");
        this.f10920a = quickPay;
        this.b = walletAppModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletScopedQuickPay)) {
            return false;
        }
        WalletScopedQuickPay walletScopedQuickPay = (WalletScopedQuickPay) obj;
        return Intrinsics.d(this.f10920a, walletScopedQuickPay.f10920a) && Intrinsics.d(this.b, walletScopedQuickPay.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10920a.hashCode() * 31);
    }

    public final String toString() {
        return "WalletScopedQuickPay(quickPay=" + this.f10920a + ", wallet=" + this.b + ")";
    }
}
