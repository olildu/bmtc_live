package app.chalo.login.ui.otp;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import defpackage.vo1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/ui/otp/LoginOtpEnterTextFieldUISpec;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LoginOtpEnterTextFieldUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f5343a = ChaloThemeHelper.a().d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LoginOtpEnterTextFieldUISpec) && Dp.m7283equalsimpl0(this.f5343a, ((LoginOtpEnterTextFieldUISpec) obj).f5343a);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.f5343a);
    }

    public final String toString() {
        return vo1.B("LoginOtpEnterTextFieldUISpec(spaceBetweenFields=", Dp.m7289toStringimpl(this.f5343a), ")");
    }
}
