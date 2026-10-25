package app.chalo.productbooking.common.uistate;

import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/common/uistate/TermsAndConditionsUiState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TermsAndConditionsUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TermsAndConditionsUiSpec f8272a;
    public final TextUIState.ChaloTextUIState b;
    public final List c;
    public final TextUIState.StyledTextUIState d;

    public TermsAndConditionsUiState(TextUIState.ChaloTextUIState title, List terms, TextUIState.StyledTextUIState styledTextUIState) {
        TermsAndConditionsUiSpec termsAndConditionsUiSpec = new TermsAndConditionsUiSpec();
        Intrinsics.i(title, "title");
        Intrinsics.i(terms, "terms");
        this.f8272a = termsAndConditionsUiSpec;
        this.b = title;
        this.c = terms;
        this.d = styledTextUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TermsAndConditionsUiState)) {
            return false;
        }
        TermsAndConditionsUiState termsAndConditionsUiState = (TermsAndConditionsUiState) obj;
        return Intrinsics.d(this.f8272a, termsAndConditionsUiState.f8272a) && Intrinsics.d(this.b, termsAndConditionsUiState.b) && Intrinsics.d(this.c, termsAndConditionsUiState.c) && Intrinsics.d(this.d, termsAndConditionsUiState.d);
    }

    public final int hashCode() {
        int iB = r30.b(r30.f(this.b, this.f8272a.hashCode() * 31, 31), 31, this.c);
        TextUIState.StyledTextUIState styledTextUIState = this.d;
        return iB + (styledTextUIState == null ? 0 : styledTextUIState.hashCode());
    }

    public final String toString() {
        return "TermsAndConditionsUiState(uiSpec=" + this.f8272a + ", title=" + this.b + ", terms=" + this.c + ", highlightedText=" + this.d + ")";
    }
}
