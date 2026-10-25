package app.chalo.login.ui.options;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.dd;
import defpackage.pk0;
import defpackage.uf0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/ui/options/LoginSupportedCountryDialogSpec;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LoginSupportedCountryDialogSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f5321a;
    public final float b;
    public final float c;
    public final ChaloColorToken d;
    public final UIShape e;
    public final ChaloPadding f;

    public LoginSupportedCountryDialogSpec() {
        float f = ChaloThemeHelper.a().i;
        float f2 = ChaloThemeHelper.a().h;
        float f3 = ChaloThemeHelper.a().h;
        UIShape.Rectangle containerShape = UIShape.d;
        float f4 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f4, f4, f4, f4);
        Intrinsics.i(containerShape, "containerShape");
        this.f5321a = f;
        this.b = f2;
        this.c = f3;
        this.d = ChaloColorToken.White.f9870a;
        this.e = containerShape;
        this.f = chaloPadding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginSupportedCountryDialogSpec)) {
            return false;
        }
        LoginSupportedCountryDialogSpec loginSupportedCountryDialogSpec = (LoginSupportedCountryDialogSpec) obj;
        return Dp.m7283equalsimpl0(this.f5321a, loginSupportedCountryDialogSpec.f5321a) && Dp.m7283equalsimpl0(this.b, loginSupportedCountryDialogSpec.b) && Dp.m7283equalsimpl0(this.c, loginSupportedCountryDialogSpec.c) && Intrinsics.d(this.d, loginSupportedCountryDialogSpec.d) && Intrinsics.d(this.e, loginSupportedCountryDialogSpec.e) && Intrinsics.d(this.f, loginSupportedCountryDialogSpec.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + pk0.b(this.e, z40.b(this.d, uf0.a(this.c, uf0.a(this.b, Dp.m7284hashCodeimpl(this.f5321a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.f5321a);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.b);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.c);
        StringBuilder sbE = dd.e("LoginSupportedCountryDialogSpec(titleAndListSpace=", strM7289toStringimpl, ", topSpacingForAllExceptFirstItem=", strM7289toStringimpl2, ", bottomSpacingForAllExceptLastItem=");
        sbE.append(strM7289toStringimpl3);
        sbE.append(", containerBackground=");
        sbE.append(this.d);
        sbE.append(", containerShape=");
        sbE.append(this.e);
        sbE.append(", containerPadding=");
        sbE.append(this.f);
        sbE.append(")");
        return sbE.toString();
    }
}
