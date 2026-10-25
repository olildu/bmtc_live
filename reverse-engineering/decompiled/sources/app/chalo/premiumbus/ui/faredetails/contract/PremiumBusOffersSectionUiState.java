package app.chalo.premiumbus.ui.faredetails.contract;

import app.chalo.uistate.text.TextUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusOffersSectionUiState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusOffersSectionUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f7624a;
    public final PremiumBusOfferCardUiState b;
    public final PremiumBusOffersSectionUISpecs c;

    public PremiumBusOffersSectionUiState(TextUIState.ChaloTextUIState chaloTextUIState, PremiumBusOfferCardUiState card) {
        PremiumBusOffersSectionUISpecs premiumBusOffersSectionUISpecs = new PremiumBusOffersSectionUISpecs();
        Intrinsics.i(card, "card");
        this.f7624a = chaloTextUIState;
        this.b = card;
        this.c = premiumBusOffersSectionUISpecs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusOffersSectionUiState)) {
            return false;
        }
        PremiumBusOffersSectionUiState premiumBusOffersSectionUiState = (PremiumBusOffersSectionUiState) obj;
        return Intrinsics.d(this.f7624a, premiumBusOffersSectionUiState.f7624a) && Intrinsics.d(this.b, premiumBusOffersSectionUiState.b) && Intrinsics.d(this.c, premiumBusOffersSectionUiState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f7624a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PremiumBusOffersSectionUiState(titleTextUIState=" + this.f7624a + ", card=" + this.b + ", specs=" + this.c + ")";
    }
}
