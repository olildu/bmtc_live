package app.chalo.userprofile.ui;

import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.textField.TextFieldWithErrorUiState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/UserProfileTextField;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserProfileTextField {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserProfileTextFieldSpecs f10373a = new UserProfileTextFieldSpecs();
    public final TextUIState.ChaloTextUIState b;
    public final TextFieldWithErrorUiState c;

    public UserProfileTextField(TextUIState.ChaloTextUIState chaloTextUIState, TextFieldWithErrorUiState textFieldWithErrorUiState) {
        this.b = chaloTextUIState;
        this.c = textFieldWithErrorUiState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserProfileTextField)) {
            return false;
        }
        UserProfileTextField userProfileTextField = (UserProfileTextField) obj;
        return Intrinsics.d(this.f10373a, userProfileTextField.f10373a) && Intrinsics.d(this.b, userProfileTextField.b) && Intrinsics.d(this.c, userProfileTextField.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + r30.f(this.b, this.f10373a.f10374a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "UserProfileTextField(specs=" + this.f10373a + ", labelTextUIState=" + this.b + ", textFieldUIState=" + this.c + ")";
    }
}
