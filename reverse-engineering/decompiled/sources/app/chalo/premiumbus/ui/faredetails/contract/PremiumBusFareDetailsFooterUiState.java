package app.chalo.premiumbus.ui.faredetails.contract;

import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.text.TextUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsFooterUiState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusFareDetailsFooterUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ButtonUIState f7585a;
    public final TextUIState.ExpandingTextUIState b;
    public final PremiumBusTotalAmountUiState c;
    public final PremiumBusFareDetailsFooterUISpecs d;

    public PremiumBusFareDetailsFooterUiState(ButtonUIState payButtonUIState, TextUIState.ExpandingTextUIState expandingTextUIState, PremiumBusTotalAmountUiState premiumBusTotalAmountUiState) {
        PremiumBusFareDetailsFooterUISpecs premiumBusFareDetailsFooterUISpecs = new PremiumBusFareDetailsFooterUISpecs();
        Intrinsics.i(payButtonUIState, "payButtonUIState");
        this.f7585a = payButtonUIState;
        this.b = expandingTextUIState;
        this.c = premiumBusTotalAmountUiState;
        this.d = premiumBusFareDetailsFooterUISpecs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusFareDetailsFooterUiState)) {
            return false;
        }
        PremiumBusFareDetailsFooterUiState premiumBusFareDetailsFooterUiState = (PremiumBusFareDetailsFooterUiState) obj;
        return Intrinsics.d(this.f7585a, premiumBusFareDetailsFooterUiState.f7585a) && Intrinsics.d(this.b, premiumBusFareDetailsFooterUiState.b) && Intrinsics.d(this.c, premiumBusFareDetailsFooterUiState.c) && Intrinsics.d(this.d, premiumBusFareDetailsFooterUiState.d);
    }

    public final int hashCode() {
        int iHashCode = this.f7585a.hashCode() * 31;
        TextUIState.ExpandingTextUIState expandingTextUIState = this.b;
        int iHashCode2 = (iHashCode + (expandingTextUIState == null ? 0 : expandingTextUIState.hashCode())) * 31;
        PremiumBusTotalAmountUiState premiumBusTotalAmountUiState = this.c;
        return this.d.hashCode() + ((iHashCode2 + (premiumBusTotalAmountUiState != null ? premiumBusTotalAmountUiState.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PremiumBusFareDetailsFooterUiState(payButtonUIState=" + this.f7585a + ", fareNoteTextUIState=" + this.b + ", totalAmount=" + this.c + ", specs=" + this.d + ")";
    }
}
