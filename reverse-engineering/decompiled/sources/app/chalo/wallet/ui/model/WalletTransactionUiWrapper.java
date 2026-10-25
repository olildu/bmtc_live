package app.chalo.wallet.ui.model;

import defpackage.b3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/model/WalletTransactionUiWrapper;", "", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WalletTransactionUiWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WalletTransactionUiModel f10887a;
    public final boolean b;
    public final boolean c;

    public WalletTransactionUiWrapper(WalletTransactionUiModel walletTransactionUiModel, boolean z, int i) {
        walletTransactionUiModel = (i & 1) != 0 ? null : walletTransactionUiModel;
        z = (i & 2) != 0 ? false : z;
        boolean z2 = (i & 4) == 0;
        this.f10887a = walletTransactionUiModel;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletTransactionUiWrapper)) {
            return false;
        }
        WalletTransactionUiWrapper walletTransactionUiWrapper = (WalletTransactionUiWrapper) obj;
        return Intrinsics.d(this.f10887a, walletTransactionUiWrapper.f10887a) && this.b == walletTransactionUiWrapper.b && this.c == walletTransactionUiWrapper.c;
    }

    public final int hashCode() {
        WalletTransactionUiModel walletTransactionUiModel = this.f10887a;
        return ((((walletTransactionUiModel == null ? 0 : walletTransactionUiModel.hashCode()) * 31) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WalletTransactionUiWrapper(walletTransactionUiModel=");
        sb.append(this.f10887a);
        sb.append(", addPlotlineWidget=");
        sb.append(this.b);
        sb.append(", contactSupport=");
        return b3.g(")", sb, this.c);
    }
}
