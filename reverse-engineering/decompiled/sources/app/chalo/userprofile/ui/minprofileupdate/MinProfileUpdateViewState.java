package app.chalo.userprofile.ui.minprofileupdate;

import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.dialog.ConfirmationDialogUiState;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import defpackage.pk0;
import defpackage.r30;
import defpackage.t8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateViewState;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MinProfileUpdateViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MinProfileUpdateScreenSpecs f10410a;
    public final ToolbarUIState b;
    public final TextUIState c;
    public final TextUIState d;
    public final MinProfileUpdateStepUIState e;
    public final ButtonUIState f;
    public final ButtonUIState g;
    public final LoadingDialogUIState h;
    public final ConfirmationDialogUiState i;
    public final MinProfileUpdateDialogType.DobPicker j;

    public MinProfileUpdateViewState(ToolbarUIState toolbar, TextUIState titleText, TextUIState subtitleText, MinProfileUpdateStepUIState minProfileUpdateStepUIState, ButtonUIState buttonUIState, ButtonUIState nextButton, LoadingDialogUIState loadingDialogUIState, ConfirmationDialogUiState confirmationDialogUiState, MinProfileUpdateDialogType.DobPicker dobPicker) {
        MinProfileUpdateScreenSpecs minProfileUpdateScreenSpecs = new MinProfileUpdateScreenSpecs();
        Intrinsics.i(toolbar, "toolbar");
        Intrinsics.i(titleText, "titleText");
        Intrinsics.i(subtitleText, "subtitleText");
        Intrinsics.i(nextButton, "nextButton");
        this.f10410a = minProfileUpdateScreenSpecs;
        this.b = toolbar;
        this.c = titleText;
        this.d = subtitleText;
        this.e = minProfileUpdateStepUIState;
        this.f = buttonUIState;
        this.g = nextButton;
        this.h = loadingDialogUIState;
        this.i = confirmationDialogUiState;
        this.j = dobPicker;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MinProfileUpdateViewState)) {
            return false;
        }
        MinProfileUpdateViewState minProfileUpdateViewState = (MinProfileUpdateViewState) obj;
        return Intrinsics.d(this.f10410a, minProfileUpdateViewState.f10410a) && Intrinsics.d(this.b, minProfileUpdateViewState.b) && Intrinsics.d(this.c, minProfileUpdateViewState.c) && Intrinsics.d(this.d, minProfileUpdateViewState.d) && Intrinsics.d(this.e, minProfileUpdateViewState.e) && Intrinsics.d(this.f, minProfileUpdateViewState.f) && Intrinsics.d(this.g, minProfileUpdateViewState.g) && Intrinsics.d(this.h, minProfileUpdateViewState.h) && Intrinsics.d(this.i, minProfileUpdateViewState.i) && Intrinsics.d(this.j, minProfileUpdateViewState.j);
    }

    public final int hashCode() {
        int iC = pk0.c(this.d, pk0.c(this.c, t8.d(this.b, this.f10410a.hashCode() * 31, 31), 31), 31);
        MinProfileUpdateStepUIState minProfileUpdateStepUIState = this.e;
        int iHashCode = (iC + (minProfileUpdateStepUIState == null ? 0 : minProfileUpdateStepUIState.hashCode())) * 31;
        ButtonUIState buttonUIState = this.f;
        int iD = r30.d(this.g, (iHashCode + (buttonUIState == null ? 0 : buttonUIState.hashCode())) * 31, 31);
        LoadingDialogUIState loadingDialogUIState = this.h;
        int iHashCode2 = (iD + (loadingDialogUIState == null ? 0 : loadingDialogUIState.hashCode())) * 31;
        ConfirmationDialogUiState confirmationDialogUiState = this.i;
        int iHashCode3 = (iHashCode2 + (confirmationDialogUiState == null ? 0 : confirmationDialogUiState.hashCode())) * 31;
        MinProfileUpdateDialogType.DobPicker dobPicker = this.j;
        return iHashCode3 + (dobPicker != null ? dobPicker.hashCode() : 0);
    }

    public final String toString() {
        return "MinProfileUpdateViewState(specs=" + this.f10410a + ", toolbar=" + this.b + ", titleText=" + this.c + ", subtitleText=" + this.d + ", activeStep=" + this.e + ", skipButton=" + this.f + ", nextButton=" + this.g + ", loadingDialog=" + this.h + ", confirmationDialog=" + this.i + ", dobPickerDialog=" + this.j + ")";
    }
}
