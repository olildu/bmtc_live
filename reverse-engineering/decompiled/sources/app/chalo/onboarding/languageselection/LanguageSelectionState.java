package app.chalo.onboarding.languageselection;

import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.snackbar.SnackbarUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/languageselection/LanguageSelectionState;", "", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LanguageSelectionState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LanguageSelectionScreenSpec f6662a;
    public final TextUIState.ChaloTextUIState b;
    public final LanguageGridUiState c;
    public final ToolbarUIState d;
    public final ImageUIState e;
    public final TextUIState.StyledTextUIState f;
    public final boolean g;
    public final ButtonUIState h;
    public final SnackbarUIState i;

    public LanguageSelectionState(TextUIState.ChaloTextUIState screenTitleTextState, LanguageGridUiState languageGridUiState, ToolbarUIState toolbarUIState, ImageUIState toolbarImageUiState, TextUIState.StyledTextUIState styledTextUIState, boolean z, ButtonUIState continueButtonUiState, SnackbarUIState snackbarUIState) {
        LanguageSelectionScreenSpec languageSelectionScreenSpec = new LanguageSelectionScreenSpec();
        Intrinsics.i(screenTitleTextState, "screenTitleTextState");
        Intrinsics.i(languageGridUiState, "languageGridUiState");
        Intrinsics.i(toolbarImageUiState, "toolbarImageUiState");
        Intrinsics.i(continueButtonUiState, "continueButtonUiState");
        this.f6662a = languageSelectionScreenSpec;
        this.b = screenTitleTextState;
        this.c = languageGridUiState;
        this.d = toolbarUIState;
        this.e = toolbarImageUiState;
        this.f = styledTextUIState;
        this.g = z;
        this.h = continueButtonUiState;
        this.i = snackbarUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LanguageSelectionState)) {
            return false;
        }
        LanguageSelectionState languageSelectionState = (LanguageSelectionState) obj;
        return Intrinsics.d(this.f6662a, languageSelectionState.f6662a) && Intrinsics.d(this.b, languageSelectionState.b) && Intrinsics.d(this.c, languageSelectionState.c) && Intrinsics.d(this.d, languageSelectionState.d) && Intrinsics.d(this.e, languageSelectionState.e) && Intrinsics.d(this.f, languageSelectionState.f) && this.g == languageSelectionState.g && Intrinsics.d(this.h, languageSelectionState.h) && Intrinsics.d(this.i, languageSelectionState.i);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + r30.f(this.b, this.f6662a.hashCode() * 31, 31)) * 31;
        ToolbarUIState toolbarUIState = this.d;
        int iE = r30.e(this.e, (iHashCode + (toolbarUIState == null ? 0 : toolbarUIState.hashCode())) * 31, 31);
        TextUIState.StyledTextUIState styledTextUIState = this.f;
        int iD = r30.d(this.h, (((iE + (styledTextUIState == null ? 0 : styledTextUIState.hashCode())) * 31) + (this.g ? 1231 : 1237)) * 31, 31);
        SnackbarUIState snackbarUIState = this.i;
        return iD + (snackbarUIState != null ? snackbarUIState.hashCode() : 0);
    }

    public final String toString() {
        return "LanguageSelectionState(screenSpec=" + this.f6662a + ", screenTitleTextState=" + this.b + ", languageGridUiState=" + this.c + ", toolbarUiState=" + this.d + ", toolbarImageUiState=" + this.e + ", tncTextUIState=" + this.f + ", showLoadingDialogue=" + this.g + ", continueButtonUiState=" + this.h + ", snackBarUIState=" + this.i + ")";
    }
}
