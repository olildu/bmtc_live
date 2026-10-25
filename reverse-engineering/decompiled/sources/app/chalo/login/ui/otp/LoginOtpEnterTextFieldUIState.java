package app.chalo.login.ui.otp;

import androidx.compose.ui.unit.Dp;
import app.chalo.uistate.textField.BaseTextFieldUIState;
import app.chalo.uistate.textField.TextFieldEventHandlerHelper;
import defpackage.mb1;
import defpackage.r30;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/ui/otp/LoginOtpEnterTextFieldUIState;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LoginOtpEnterTextFieldUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseTextFieldUIState.TextFieldUIState f5344a;
    public final List b;
    public final LoginOtpEnterTextFieldUISpec c;

    public LoginOtpEnterTextFieldUIState(BaseTextFieldUIState.TextFieldUIState textFieldUIState, ArrayList arrayList, int i) {
        BaseTextFieldUIState.TextFieldUIState textFieldUIState2 = (i & 1) != 0 ? new BaseTextFieldUIState.TextFieldUIState("", TextFieldEventHandlerHelper.b(1, null, new mb1(13)), null, null, null, null, false, null, 0, null, null, 0.0f, 131068) : textFieldUIState;
        List decorationIndividualFields = (i & 2) != 0 ? EmptyList.f17557a : arrayList;
        LoginOtpEnterTextFieldUISpec loginOtpEnterTextFieldUISpec = new LoginOtpEnterTextFieldUISpec();
        Intrinsics.i(decorationIndividualFields, "decorationIndividualFields");
        this.f5344a = textFieldUIState2;
        this.b = decorationIndividualFields;
        this.c = loginOtpEnterTextFieldUISpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginOtpEnterTextFieldUIState)) {
            return false;
        }
        LoginOtpEnterTextFieldUIState loginOtpEnterTextFieldUIState = (LoginOtpEnterTextFieldUIState) obj;
        return Intrinsics.d(this.f5344a, loginOtpEnterTextFieldUIState.f5344a) && Intrinsics.d(this.b, loginOtpEnterTextFieldUIState.b) && Intrinsics.d(this.c, loginOtpEnterTextFieldUIState.c);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.c.f5343a) + r30.b(this.f5344a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "LoginOtpEnterTextFieldUIState(textField=" + this.f5344a + ", decorationIndividualFields=" + this.b + ", specs=" + this.c + ")";
    }
}
