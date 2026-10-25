package app.chalo.premiumbus.ui.faredetails.contract;

import app.chalo.uistate.text.TextUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusTotalAmountUiState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusTotalAmountUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f7637a;
    public final TextUIState.ChaloTextUIState b;

    public PremiumBusTotalAmountUiState(TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2) {
        this.f7637a = chaloTextUIState;
        this.b = chaloTextUIState2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusTotalAmountUiState)) {
            return false;
        }
        PremiumBusTotalAmountUiState premiumBusTotalAmountUiState = (PremiumBusTotalAmountUiState) obj;
        return Intrinsics.d(this.f7637a, premiumBusTotalAmountUiState.f7637a) && Intrinsics.d(this.b, premiumBusTotalAmountUiState.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7637a.hashCode() * 31);
    }

    public final String toString() {
        return "PremiumBusTotalAmountUiState(labelTextUIState=" + this.f7637a + ", amountTextUIState=" + this.b + ")";
    }
}
