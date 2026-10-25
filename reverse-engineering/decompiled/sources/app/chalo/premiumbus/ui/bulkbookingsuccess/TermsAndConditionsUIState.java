package app.chalo.premiumbus.ui.bulkbookingsuccess;

import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/bulkbookingsuccess/TermsAndConditionsUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TermsAndConditionsUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TermsAndConditionsUISpecs f7510a;
    public final TextUIState.ChaloTextUIState b;
    public final List c;
    public final TextUIState.StyledTextUIState d;

    public TermsAndConditionsUIState(TextUIState.ChaloTextUIState titleUIState, List termsAndConditionsListUIState, TextUIState.StyledTextUIState styledTextUIState) {
        TermsAndConditionsUISpecs termsAndConditionsUISpecs = new TermsAndConditionsUISpecs();
        Intrinsics.i(titleUIState, "titleUIState");
        Intrinsics.i(termsAndConditionsListUIState, "termsAndConditionsListUIState");
        this.f7510a = termsAndConditionsUISpecs;
        this.b = titleUIState;
        this.c = termsAndConditionsListUIState;
        this.d = styledTextUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TermsAndConditionsUIState)) {
            return false;
        }
        TermsAndConditionsUIState termsAndConditionsUIState = (TermsAndConditionsUIState) obj;
        return Intrinsics.d(this.f7510a, termsAndConditionsUIState.f7510a) && Intrinsics.d(this.b, termsAndConditionsUIState.b) && Intrinsics.d(this.c, termsAndConditionsUIState.c) && Intrinsics.d(this.d, termsAndConditionsUIState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + r30.b(r30.f(this.b, this.f7510a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "TermsAndConditionsUIState(termsAndConditionsUISpecs=" + this.f7510a + ", titleUIState=" + this.b + ", termsAndConditionsListUIState=" + this.c + ", tncContinueTextUIState=" + this.d + ")";
    }
}
