package app.chalo.kyc.min.ui.minkycotp;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.r30;
import defpackage.uf0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/kyc/min/ui/minkycotp/OtpCharUISpecs;", "", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OtpCharUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BorderUISpec f4162a;
    public final float b;
    public final ChaloPadding c;
    public final ChaloColorToken d;
    public final float e;
    public final ChaloPadding f;

    public OtpCharUISpecs(BorderUISpec borderUISpec) {
        float f = ChaloThemeHelper.a().o;
        ChaloPadding chaloPadding = new ChaloPadding(0.0f, ChaloThemeHelper.a().g, 1);
        float f2 = ChaloThemeHelper.a().c;
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().d, 0.0f, 2);
        this.f4162a = borderUISpec;
        this.b = f;
        this.c = chaloPadding;
        this.d = ChaloColorToken.OrangePrimary.f9835a;
        this.e = f2;
        this.f = chaloPadding2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OtpCharUISpecs)) {
            return false;
        }
        OtpCharUISpecs otpCharUISpecs = (OtpCharUISpecs) obj;
        return Intrinsics.d(this.f4162a, otpCharUISpecs.f4162a) && Dp.m7283equalsimpl0(this.b, otpCharUISpecs.b) && Intrinsics.d(this.c, otpCharUISpecs.c) && Intrinsics.d(this.d, otpCharUISpecs.d) && Dp.m7283equalsimpl0(this.e, otpCharUISpecs.e) && Intrinsics.d(this.f, otpCharUISpecs.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + uf0.a(this.e, z40.b(this.d, r30.c(this.c, uf0.a(this.b, this.f4162a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "OtpCharUISpecs(borderUISpec=" + this.f4162a + ", height=" + Dp.m7289toStringimpl(this.b) + ", cursorPadding=" + this.c + ", cursorDividerBackgroundColor=" + this.d + ", cursorDividerWidth=" + Dp.m7289toStringimpl(this.e) + ", otpCharSpacerPadding=" + this.f + ")";
    }
}
