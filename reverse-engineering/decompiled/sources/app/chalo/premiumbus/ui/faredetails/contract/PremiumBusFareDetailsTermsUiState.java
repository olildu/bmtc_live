package app.chalo.premiumbus.ui.faredetails.contract;

import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsTermsUiState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusFareDetailsTermsUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f7612a;
    public final List b;
    public final TextUIState.StyledTextUIState c;
    public final PremiumBusTncSectionUISpecs d;

    public PremiumBusFareDetailsTermsUiState(TextUIState.ChaloTextUIState titleTextUIState, List termsList, TextUIState.StyledTextUIState styledTextUIState) {
        PremiumBusTncSectionUISpecs premiumBusTncSectionUISpecs = new PremiumBusTncSectionUISpecs();
        Intrinsics.i(titleTextUIState, "titleTextUIState");
        Intrinsics.i(termsList, "termsList");
        this.f7612a = titleTextUIState;
        this.b = termsList;
        this.c = styledTextUIState;
        this.d = premiumBusTncSectionUISpecs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusFareDetailsTermsUiState)) {
            return false;
        }
        PremiumBusFareDetailsTermsUiState premiumBusFareDetailsTermsUiState = (PremiumBusFareDetailsTermsUiState) obj;
        return Intrinsics.d(this.f7612a, premiumBusFareDetailsTermsUiState.f7612a) && Intrinsics.d(this.b, premiumBusFareDetailsTermsUiState.b) && Intrinsics.d(this.c, premiumBusFareDetailsTermsUiState.c) && Intrinsics.d(this.d, premiumBusFareDetailsTermsUiState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + r30.b(this.f7612a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "PremiumBusFareDetailsTermsUiState(titleTextUIState=" + this.f7612a + ", termsList=" + this.b + ", agreementTextUIState=" + this.c + ", specs=" + this.d + ")";
    }
}
