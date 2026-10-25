package app.chalo.login.ui.options;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.uistate.base.BorderUISpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/ui/options/LoginPhoneNumberTextFieldUISpec;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LoginPhoneNumberTextFieldUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BorderUISpec f5319a;
    public final ChaloPadding b;

    public LoginPhoneNumberTextFieldUISpec(BorderUISpec borderUISpec, ChaloPadding chaloPadding) {
        this.f5319a = borderUISpec;
        this.b = chaloPadding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginPhoneNumberTextFieldUISpec)) {
            return false;
        }
        LoginPhoneNumberTextFieldUISpec loginPhoneNumberTextFieldUISpec = (LoginPhoneNumberTextFieldUISpec) obj;
        return Intrinsics.d(this.f5319a, loginPhoneNumberTextFieldUISpec.f5319a) && Intrinsics.d(this.b, loginPhoneNumberTextFieldUISpec.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5319a.hashCode() * 31);
    }

    public final String toString() {
        return "LoginPhoneNumberTextFieldUISpec(borderSpec=" + this.f5319a + ", padding=" + this.b + ")";
    }
}
