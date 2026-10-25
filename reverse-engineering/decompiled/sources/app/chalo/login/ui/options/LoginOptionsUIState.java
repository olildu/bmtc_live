package app.chalo.login.ui.options;

import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import defpackage.r30;
import defpackage.t8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/ui/options/LoginOptionsUIState;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LoginOptionsUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoginOptionsScreenSpecs f5318a;
    public final ToolbarUIState b;
    public final ButtonUIState c;
    public final TextUIState.ChaloTextUIState d;
    public final TextUIState.ChaloTextUIState e;
    public final CountryFlagTabUIState f;
    public final LoginPhoneNumberTextFieldUIState g;
    public final LoadingDialogUIState h;
    public final LoginSupportedCountryDialogUIState i;

    public LoginOptionsUIState(ToolbarUIState toolbarUIState, ButtonUIState continueBtnUIState, TextUIState.ChaloTextUIState titleTextUIState, TextUIState.ChaloTextUIState chaloTextUIState, CountryFlagTabUIState countryFlagTabUIState, LoginPhoneNumberTextFieldUIState loginPhoneNumberTextFieldUIState, LoadingDialogUIState loadingDialogUIState, LoginSupportedCountryDialogUIState loginSupportedCountryDialogUIState) {
        LoginOptionsScreenSpecs loginOptionsScreenSpecs = new LoginOptionsScreenSpecs();
        Intrinsics.i(toolbarUIState, "toolbarUIState");
        Intrinsics.i(continueBtnUIState, "continueBtnUIState");
        Intrinsics.i(titleTextUIState, "titleTextUIState");
        this.f5318a = loginOptionsScreenSpecs;
        this.b = toolbarUIState;
        this.c = continueBtnUIState;
        this.d = titleTextUIState;
        this.e = chaloTextUIState;
        this.f = countryFlagTabUIState;
        this.g = loginPhoneNumberTextFieldUIState;
        this.h = loadingDialogUIState;
        this.i = loginSupportedCountryDialogUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginOptionsUIState)) {
            return false;
        }
        LoginOptionsUIState loginOptionsUIState = (LoginOptionsUIState) obj;
        return Intrinsics.d(this.f5318a, loginOptionsUIState.f5318a) && Intrinsics.d(this.b, loginOptionsUIState.b) && Intrinsics.d(this.c, loginOptionsUIState.c) && Intrinsics.d(this.d, loginOptionsUIState.d) && Intrinsics.d(this.e, loginOptionsUIState.e) && Intrinsics.d(this.f, loginOptionsUIState.f) && Intrinsics.d(this.g, loginOptionsUIState.g) && Intrinsics.d(this.h, loginOptionsUIState.h) && Intrinsics.d(this.i, loginOptionsUIState.i);
    }

    public final int hashCode() {
        int iF = r30.f(this.d, r30.d(this.c, t8.d(this.b, this.f5318a.hashCode() * 31, 31), 31), 31);
        TextUIState.ChaloTextUIState chaloTextUIState = this.e;
        int iHashCode = (iF + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31;
        CountryFlagTabUIState countryFlagTabUIState = this.f;
        int iHashCode2 = (iHashCode + (countryFlagTabUIState == null ? 0 : countryFlagTabUIState.hashCode())) * 31;
        LoginPhoneNumberTextFieldUIState loginPhoneNumberTextFieldUIState = this.g;
        int iHashCode3 = (iHashCode2 + (loginPhoneNumberTextFieldUIState == null ? 0 : loginPhoneNumberTextFieldUIState.hashCode())) * 31;
        LoadingDialogUIState loadingDialogUIState = this.h;
        int iHashCode4 = (iHashCode3 + (loadingDialogUIState == null ? 0 : loadingDialogUIState.hashCode())) * 31;
        LoginSupportedCountryDialogUIState loginSupportedCountryDialogUIState = this.i;
        return iHashCode4 + (loginSupportedCountryDialogUIState != null ? loginSupportedCountryDialogUIState.hashCode() : 0);
    }

    public final String toString() {
        return "LoginOptionsUIState(screenSpecs=" + this.f5318a + ", toolbarUIState=" + this.b + ", continueBtnUIState=" + this.c + ", titleTextUIState=" + this.d + ", numberEnterErrorUIState=" + this.e + ", selectedCountryTabUIState=" + this.f + ", phoneNumberTextFieldUIState=" + this.g + ", loadingDialogUIState=" + this.h + ", supportedCountryList=" + this.i + ")";
    }
}
