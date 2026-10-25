package app.chalo.login.ui.options;

import app.chalo.uistate.textField.BaseTextFieldUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/ui/options/LoginPhoneNumberTextFieldUIState;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LoginPhoneNumberTextFieldUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseTextFieldUIState.TextFieldUIState f5320a;
    public final LoginPhoneNumberTextFieldUISpec b;

    public LoginPhoneNumberTextFieldUIState(BaseTextFieldUIState.TextFieldUIState textFieldUIState, LoginPhoneNumberTextFieldUISpec loginPhoneNumberTextFieldUISpec) {
        this.f5320a = textFieldUIState;
        this.b = loginPhoneNumberTextFieldUISpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginPhoneNumberTextFieldUIState)) {
            return false;
        }
        LoginPhoneNumberTextFieldUIState loginPhoneNumberTextFieldUIState = (LoginPhoneNumberTextFieldUIState) obj;
        return Intrinsics.d(this.f5320a, loginPhoneNumberTextFieldUIState.f5320a) && Intrinsics.d(this.b, loginPhoneNumberTextFieldUIState.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5320a.hashCode() * 31);
    }

    public final String toString() {
        return "LoginPhoneNumberTextFieldUIState(state=" + this.f5320a + ", spec=" + this.b + ")";
    }
}
