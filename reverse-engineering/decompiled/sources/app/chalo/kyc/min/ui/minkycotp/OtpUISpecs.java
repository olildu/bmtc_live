package app.chalo.kyc.min.ui.minkycotp;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiAlignment;
import app.chalo.uistate.base.UiArrangement;
import defpackage.gf;
import defpackage.py;
import defpackage.uf0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/kyc/min/ui/minkycotp/OtpUISpecs;", "", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OtpUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f4168a;
    public final ChaloColorToken b;
    public final UiArrangement.HorizontalOrVertical c;
    public final UiAlignment.Horizontal d;
    public final UiAlignment.Horizontal e;
    public final UiAlignment.Vertical f;
    public final ChaloPadding g;

    public OtpUISpecs() {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 2);
        ChaloPadding chaloPadding2 = new ChaloPadding(0.0f, 0.0f, 3);
        this.f4168a = chaloPadding;
        this.b = ChaloColorToken.White.f9870a;
        this.c = UiArrangement.HorizontalOrVertical.Center.f9890a;
        UiAlignment.Horizontal.Start start = UiAlignment.Horizontal.Start.f9886a;
        this.d = start;
        this.e = start;
        this.f = UiAlignment.Vertical.Center.f9888a;
        this.g = chaloPadding2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OtpUISpecs)) {
            return false;
        }
        OtpUISpecs otpUISpecs = (OtpUISpecs) obj;
        return Intrinsics.d(this.f4168a, otpUISpecs.f4168a) && Intrinsics.d(this.b, otpUISpecs.b) && Intrinsics.d(this.c, otpUISpecs.c) && Intrinsics.d(this.d, otpUISpecs.d) && Intrinsics.d(this.e, otpUISpecs.e) && Intrinsics.d(this.f, otpUISpecs.f) && Intrinsics.d(this.g, otpUISpecs.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + uf0.e(this.f, uf0.d(this.e, uf0.d(this.d, (this.c.hashCode() + z40.b(this.b, this.f4168a.hashCode() * 31, 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbL = gf.l(this.f4168a, this.b, "OtpUISpecs(horizonalPadding=", ", backgroundColor=", ", verticalArrangement=");
        sbL.append(this.c);
        sbL.append(", titleTextAlignment=");
        sbL.append(this.d);
        sbL.append(", subTitleTextAlignment=");
        sbL.append(this.e);
        sbL.append(", resendOtpRowAlignment=");
        sbL.append(this.f);
        sbL.append(", resendOtpSpacerPadding=");
        return py.e(sbL, this.g, ")");
    }
}
