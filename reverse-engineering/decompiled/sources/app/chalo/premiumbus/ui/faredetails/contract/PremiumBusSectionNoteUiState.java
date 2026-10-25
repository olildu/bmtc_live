package app.chalo.premiumbus.ui.faredetails.contract;

import app.chalo.uistate.text.TextUIState;
import defpackage.n21;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusSectionNoteUiState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusSectionNoteUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f7632a;
    public final TextUIState.ChaloTextUIState b;
    public final PremiumBusSectionNoteUISpecs c;

    public PremiumBusSectionNoteUiState(TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2) {
        PremiumBusSectionNoteUISpecs premiumBusSectionNoteUISpecs = new PremiumBusSectionNoteUISpecs();
        this.f7632a = chaloTextUIState;
        this.b = chaloTextUIState2;
        this.c = premiumBusSectionNoteUISpecs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusSectionNoteUiState)) {
            return false;
        }
        PremiumBusSectionNoteUiState premiumBusSectionNoteUiState = (PremiumBusSectionNoteUiState) obj;
        return Intrinsics.d(this.f7632a, premiumBusSectionNoteUiState.f7632a) && Intrinsics.d(this.b, premiumBusSectionNoteUiState.b) && Intrinsics.d(this.c, premiumBusSectionNoteUiState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + r30.f(this.b, this.f7632a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sbJ = n21.j("PremiumBusSectionNoteUiState(titleTextUIState=", this.f7632a, ", descriptionTextUIState=", this.b, ", specs=");
        sbJ.append(this.c);
        sbJ.append(")");
        return sbJ.toString();
    }
}
