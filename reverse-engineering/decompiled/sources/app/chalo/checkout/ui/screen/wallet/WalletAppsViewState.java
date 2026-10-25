package app.chalo.checkout.ui.screen.wallet;

import app.chalo.checkout.ui.screen.payment.PaymentCardUiState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/wallet/WalletAppsViewState;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WalletAppsViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WalletAppsUiSpecs f1613a = new WalletAppsUiSpecs();
    public final ToolbarUIState b;
    public final PaymentCardUiState c;

    public WalletAppsViewState(ToolbarUIState toolbarUIState, PaymentCardUiState paymentCardUiState) {
        this.b = toolbarUIState;
        this.c = paymentCardUiState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletAppsViewState)) {
            return false;
        }
        WalletAppsViewState walletAppsViewState = (WalletAppsViewState) obj;
        return Intrinsics.d(this.f1613a, walletAppsViewState.f1613a) && Intrinsics.d(this.b, walletAppsViewState.b) && Intrinsics.d(this.c, walletAppsViewState.c);
    }

    public final int hashCode() {
        int iHashCode = this.f1613a.f1610a.hashCode() * 31;
        ToolbarUIState toolbarUIState = this.b;
        int iHashCode2 = (iHashCode + (toolbarUIState == null ? 0 : toolbarUIState.hashCode())) * 31;
        PaymentCardUiState paymentCardUiState = this.c;
        return iHashCode2 + (paymentCardUiState != null ? paymentCardUiState.hashCode() : 0);
    }

    public final String toString() {
        return "WalletAppsViewState(walletAppsUiSpecs=" + this.f1613a + ", toolbarUiState=" + this.b + ", walletAppListUiState=" + this.c + ")";
    }
}
