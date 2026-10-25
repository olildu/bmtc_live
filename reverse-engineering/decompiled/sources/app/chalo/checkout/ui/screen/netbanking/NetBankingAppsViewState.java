package app.chalo.checkout.ui.screen.netbanking;

import app.chalo.checkout.ui.screen.payment.PaymentCardUiState;
import app.chalo.uistate.searchbar.SearchBarUiState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/netbanking/NetBankingAppsViewState;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NetBankingAppsViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetBankingAppsUiSpecs f1504a;
    public final ToolbarUIState b;
    public final SearchBarUiState c;
    public final PaymentCardUiState d;

    public NetBankingAppsViewState(ToolbarUIState toolbarUIState, SearchBarUiState searchBarUiState, PaymentCardUiState paymentCardUiState) {
        NetBankingAppsUiSpecs netBankingAppsUiSpecs = new NetBankingAppsUiSpecs();
        Intrinsics.i(searchBarUiState, "searchBarUiState");
        this.f1504a = netBankingAppsUiSpecs;
        this.b = toolbarUIState;
        this.c = searchBarUiState;
        this.d = paymentCardUiState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetBankingAppsViewState)) {
            return false;
        }
        NetBankingAppsViewState netBankingAppsViewState = (NetBankingAppsViewState) obj;
        return Intrinsics.d(this.f1504a, netBankingAppsViewState.f1504a) && Intrinsics.d(this.b, netBankingAppsViewState.b) && Intrinsics.d(this.c, netBankingAppsViewState.c) && Intrinsics.d(this.d, netBankingAppsViewState.d);
    }

    public final int hashCode() {
        int iHashCode = this.f1504a.f1500a.hashCode() * 31;
        ToolbarUIState toolbarUIState = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (toolbarUIState == null ? 0 : toolbarUIState.hashCode())) * 31)) * 31;
        PaymentCardUiState paymentCardUiState = this.d;
        return iHashCode2 + (paymentCardUiState != null ? paymentCardUiState.hashCode() : 0);
    }

    public final String toString() {
        return "NetBankingAppsViewState(netBankingAppsUiSpecs=" + this.f1504a + ", toolbarUiState=" + this.b + ", searchBarUiState=" + this.c + ", netBankingItemListUiState=" + this.d + ")";
    }
}
