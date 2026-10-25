package app.chalo.login.ui.otp;

import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import defpackage.py;
import defpackage.r30;
import defpackage.t8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/ui/otp/LoginOtpEnterUIState;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LoginOtpEnterUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoginOtpScreenUISpecs f5345a;
    public final LoadingDialogUIState b;
    public final ToolbarUIState c;
    public final TextUIState.ChaloTextUIState d;
    public final LoginOtpResendTextUIState e;
    public final LoginOtpEnterTextFieldUIState f;
    public final TextUIState.ChaloTextUIState g;

    public LoginOtpEnterUIState(LoadingDialogUIState loadingDialogUIState, ToolbarUIState toolbar, TextUIState.ChaloTextUIState headingText, LoginOtpResendTextUIState loginOtpResendTextUIState, LoginOtpEnterTextFieldUIState otpEnterField, TextUIState.ChaloTextUIState chaloTextUIState) {
        LoginOtpScreenUISpecs loginOtpScreenUISpecs = new LoginOtpScreenUISpecs();
        Intrinsics.i(toolbar, "toolbar");
        Intrinsics.i(headingText, "headingText");
        Intrinsics.i(otpEnterField, "otpEnterField");
        this.f5345a = loginOtpScreenUISpecs;
        this.b = loadingDialogUIState;
        this.c = toolbar;
        this.d = headingText;
        this.e = loginOtpResendTextUIState;
        this.f = otpEnterField;
        this.g = chaloTextUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginOtpEnterUIState)) {
            return false;
        }
        LoginOtpEnterUIState loginOtpEnterUIState = (LoginOtpEnterUIState) obj;
        return Intrinsics.d(this.f5345a, loginOtpEnterUIState.f5345a) && Intrinsics.d(this.b, loginOtpEnterUIState.b) && Intrinsics.d(this.c, loginOtpEnterUIState.c) && Intrinsics.d(this.d, loginOtpEnterUIState.d) && Intrinsics.d(this.e, loginOtpEnterUIState.e) && Intrinsics.d(this.f, loginOtpEnterUIState.f) && Intrinsics.d(this.g, loginOtpEnterUIState.g);
    }

    public final int hashCode() {
        int iHashCode = this.f5345a.hashCode() * 31;
        LoadingDialogUIState loadingDialogUIState = this.b;
        int iF = r30.f(this.d, t8.d(this.c, (iHashCode + (loadingDialogUIState == null ? 0 : loadingDialogUIState.hashCode())) * 31, 31), 31);
        LoginOtpResendTextUIState loginOtpResendTextUIState = this.e;
        int iHashCode2 = (this.f.hashCode() + ((iF + (loginOtpResendTextUIState == null ? 0 : loginOtpResendTextUIState.hashCode())) * 31)) * 31;
        TextUIState.ChaloTextUIState chaloTextUIState = this.g;
        return iHashCode2 + (chaloTextUIState != null ? chaloTextUIState.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoginOtpEnterUIState(screenSpecs=");
        sb.append(this.f5345a);
        sb.append(", loadingDialog=");
        sb.append(this.b);
        sb.append(", toolbar=");
        sb.append(this.c);
        sb.append(", headingText=");
        sb.append(this.d);
        sb.append(", resendText=");
        sb.append(this.e);
        sb.append(", otpEnterField=");
        sb.append(this.f);
        sb.append(", invalidOtpErrorText=");
        return py.f(sb, this.g, ")");
    }
}
