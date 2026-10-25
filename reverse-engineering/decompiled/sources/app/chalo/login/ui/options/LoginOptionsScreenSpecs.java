package app.chalo.login.ui.options;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.pk0;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/ui/options/LoginOptionsScreenSpecs;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LoginOptionsScreenSpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f5316a;
    public final ChaloPadding b;
    public final ChaloColorToken c;

    public LoginOptionsScreenSpecs() {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 2);
        float f = ChaloThemeHelper.a().h;
        float f2 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding2 = new ChaloPadding(f2, f, f, f2);
        this.f5316a = chaloPadding;
        this.b = chaloPadding2;
        this.c = ChaloColorToken.White.f9870a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginOptionsScreenSpecs)) {
            return false;
        }
        LoginOptionsScreenSpecs loginOptionsScreenSpecs = (LoginOptionsScreenSpecs) obj;
        return Intrinsics.d(this.f5316a, loginOptionsScreenSpecs.f5316a) && Intrinsics.d(this.b, loginOptionsScreenSpecs.b) && Intrinsics.d(this.c, loginOptionsScreenSpecs.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + r30.c(this.b, this.f5316a.hashCode() * 31, 31);
    }

    public final String toString() {
        return pk0.j(pk0.m("LoginOptionsScreenSpecs(mainContentPadding=", this.f5316a, ", continueBtnPadding=", this.b, ", containerColor="), this.c, ")");
    }
}
