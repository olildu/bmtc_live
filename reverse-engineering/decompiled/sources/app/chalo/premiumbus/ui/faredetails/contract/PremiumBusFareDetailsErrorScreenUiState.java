package app.chalo.premiumbus.ui.faredetails.contract;

import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.text.TextUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsErrorScreenUiState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusFareDetailsErrorScreenUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f7583a;
    public final ButtonUIState b;

    public PremiumBusFareDetailsErrorScreenUiState(TextUIState.ChaloTextUIState messageTextUIState, ButtonUIState goHomeButtonUIState) {
        Intrinsics.i(messageTextUIState, "messageTextUIState");
        Intrinsics.i(goHomeButtonUIState, "goHomeButtonUIState");
        this.f7583a = messageTextUIState;
        this.b = goHomeButtonUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusFareDetailsErrorScreenUiState)) {
            return false;
        }
        PremiumBusFareDetailsErrorScreenUiState premiumBusFareDetailsErrorScreenUiState = (PremiumBusFareDetailsErrorScreenUiState) obj;
        return Intrinsics.d(this.f7583a, premiumBusFareDetailsErrorScreenUiState.f7583a) && Intrinsics.d(this.b, premiumBusFareDetailsErrorScreenUiState.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7583a.hashCode() * 31);
    }

    public final String toString() {
        return "PremiumBusFareDetailsErrorScreenUiState(messageTextUIState=" + this.f7583a + ", goHomeButtonUIState=" + this.b + ")";
    }
}
