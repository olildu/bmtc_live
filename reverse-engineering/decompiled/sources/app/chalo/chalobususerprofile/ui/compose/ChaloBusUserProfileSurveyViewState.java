package app.chalo.chalobususerprofile.ui.compose;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyViewState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloBusUserProfileSurveyViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f1227a;
    public final LoadingDialogUIState b;
    public final ProfileSurveyUIState c;
    public final ButtonUIState d;
    public final ButtonUIState e;
    public final ChaloPadding f;
    public final float g;
    public final ImageUIState h;
    public final SurveyTimePickerDialogUIState i;

    public ChaloBusUserProfileSurveyViewState(TextUIState.ChaloTextUIState chaloTextUIState, LoadingDialogUIState loadingDialogUIState, ProfileSurveyUIState profileSurveyUIState, ButtonUIState buttonUIState, ButtonUIState buttonUIState2, ImageUIState imageUIState, SurveyTimePickerDialogUIState surveyTimePickerDialogUIState) {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        float f2 = ChaloThemeHelper.a().h;
        this.f1227a = chaloTextUIState;
        this.b = loadingDialogUIState;
        this.c = profileSurveyUIState;
        this.d = buttonUIState;
        this.e = buttonUIState2;
        this.f = chaloPadding;
        this.g = f2;
        this.h = imageUIState;
        this.i = surveyTimePickerDialogUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloBusUserProfileSurveyViewState)) {
            return false;
        }
        ChaloBusUserProfileSurveyViewState chaloBusUserProfileSurveyViewState = (ChaloBusUserProfileSurveyViewState) obj;
        return Intrinsics.d(this.f1227a, chaloBusUserProfileSurveyViewState.f1227a) && Intrinsics.d(this.b, chaloBusUserProfileSurveyViewState.b) && Intrinsics.d(this.c, chaloBusUserProfileSurveyViewState.c) && Intrinsics.d(this.d, chaloBusUserProfileSurveyViewState.d) && Intrinsics.d(this.e, chaloBusUserProfileSurveyViewState.e) && Intrinsics.d(this.f, chaloBusUserProfileSurveyViewState.f) && Dp.m7283equalsimpl0(this.g, chaloBusUserProfileSurveyViewState.g) && Intrinsics.d(this.h, chaloBusUserProfileSurveyViewState.h) && Intrinsics.d(this.i, chaloBusUserProfileSurveyViewState.i);
    }

    public final int hashCode() {
        TextUIState.ChaloTextUIState chaloTextUIState = this.f1227a;
        int iHashCode = (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode()) * 31;
        LoadingDialogUIState loadingDialogUIState = this.b;
        int iHashCode2 = (iHashCode + (loadingDialogUIState == null ? 0 : loadingDialogUIState.hashCode())) * 31;
        ProfileSurveyUIState profileSurveyUIState = this.c;
        int iHashCode3 = (iHashCode2 + (profileSurveyUIState == null ? 0 : profileSurveyUIState.hashCode())) * 31;
        ButtonUIState buttonUIState = this.d;
        int iHashCode4 = (iHashCode3 + (buttonUIState == null ? 0 : buttonUIState.hashCode())) * 31;
        ButtonUIState buttonUIState2 = this.e;
        int iA = uf0.a(this.g, r30.c(this.f, (iHashCode4 + (buttonUIState2 == null ? 0 : buttonUIState2.hashCode())) * 31, 31), 31);
        ImageUIState imageUIState = this.h;
        int iHashCode5 = (iA + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31;
        SurveyTimePickerDialogUIState surveyTimePickerDialogUIState = this.i;
        return iHashCode5 + (surveyTimePickerDialogUIState != null ? surveyTimePickerDialogUIState.hashCode() : 0);
    }

    public final String toString() {
        return "ChaloBusUserProfileSurveyViewState(stepsIndicatorText=" + this.f1227a + ", loadingDialog=" + this.b + ", stepContent=" + this.c + ", skipButtonUIState=" + this.d + ", nextButtonUIState=" + this.e + ", outerPadding=" + this.f + ", spaceBtwBackBtnAndStepsCounter=" + Dp.m7289toStringimpl(this.g) + ", backIconUIState=" + this.h + ", timePickerDialogUIState=" + this.i + ")";
    }
}
