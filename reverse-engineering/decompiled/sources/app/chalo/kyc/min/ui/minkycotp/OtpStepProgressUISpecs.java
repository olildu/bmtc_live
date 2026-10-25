package app.chalo.kyc.min.ui.minkycotp;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiAlignment;
import defpackage.pk0;
import defpackage.py;
import defpackage.r30;
import defpackage.uf0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/kyc/min/ui/minkycotp/OtpStepProgressUISpecs;", "", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OtpStepProgressUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UiAlignment.Vertical f4164a;
    public final ChaloPadding b;
    public final ChaloPadding c;
    public final float d;
    public final float e;
    public final UiAlignment.Vertical f;
    public final ChaloPadding g;
    public final UIShape h;
    public final ChaloColorToken i;
    public final ChaloColorToken j;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public OtpStepProgressUISpecs() {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().d, 0.0f, 2);
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().e, 0.0f, 0.0f, 0.0f, 14);
        float f = ChaloThemeHelper.a().O;
        float f2 = ChaloThemeHelper.a().d;
        ChaloPadding chaloPadding3 = new ChaloPadding(ChaloThemeHelper.a().f, 0.0f, 2);
        float f3 = ChaloThemeHelper.a().Z;
        UIShape.Rectangle rectangle = new UIShape.Rectangle(f3, f3, f3, f3);
        UiAlignment.Vertical.Center center = UiAlignment.Vertical.Center.f9888a;
        this.f4164a = center;
        this.b = chaloPadding;
        this.c = chaloPadding2;
        this.d = f;
        this.e = f2;
        this.f = center;
        this.g = chaloPadding3;
        this.h = rectangle;
        this.i = ChaloColorToken.LightGray.f9814a;
        this.j = ChaloColorToken.ProductProgressStatusBorder.f9844a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OtpStepProgressUISpecs)) {
            return false;
        }
        OtpStepProgressUISpecs otpStepProgressUISpecs = (OtpStepProgressUISpecs) obj;
        return Intrinsics.d(this.f4164a, otpStepProgressUISpecs.f4164a) && Intrinsics.d(this.b, otpStepProgressUISpecs.b) && Intrinsics.d(this.c, otpStepProgressUISpecs.c) && Dp.m7283equalsimpl0(this.d, otpStepProgressUISpecs.d) && Dp.m7283equalsimpl0(this.e, otpStepProgressUISpecs.e) && Intrinsics.d(this.f, otpStepProgressUISpecs.f) && Intrinsics.d(this.g, otpStepProgressUISpecs.g) && Intrinsics.d(this.h, otpStepProgressUISpecs.h) && Intrinsics.d(this.i, otpStepProgressUISpecs.i) && Intrinsics.d(this.j, otpStepProgressUISpecs.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + z40.b(this.i, pk0.b(this.h, r30.c(this.g, uf0.e(this.f, uf0.a(this.e, uf0.a(this.d, r30.c(this.c, r30.c(this.b, this.f4164a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.d);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.e);
        StringBuilder sb = new StringBuilder("OtpStepProgressUISpecs(rowVerticalAlignment=");
        sb.append(this.f4164a);
        sb.append(", rowPadding=");
        sb.append(this.b);
        sb.append(", nameTextPadding=");
        py.u(sb, this.c, ", progressBarWidth=", strM7289toStringimpl, ", progressBarHeight=");
        sb.append(strM7289toStringimpl2);
        sb.append(", progressBarAlignment=");
        sb.append(this.f);
        sb.append(", progressBarPadding=");
        sb.append(this.g);
        sb.append(", progressBarBackgroundShape=");
        sb.append(this.h);
        sb.append(", progressBarTrackBackgroundColor=");
        sb.append(this.i);
        sb.append(", progressBarCompletedIndicatorBackgroundColor=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }
}
