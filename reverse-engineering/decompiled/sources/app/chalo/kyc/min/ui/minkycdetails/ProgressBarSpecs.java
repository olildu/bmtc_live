package app.chalo.kyc.min.ui.minkycdetails;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiAlignment;
import defpackage.dd;
import defpackage.r30;
import defpackage.uf0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/kyc/min/ui/minkycdetails/ProgressBarSpecs;", "", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProgressBarSpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f4133a;
    public final float b;
    public final UiAlignment.Vertical c;
    public final ChaloPadding d;
    public final ChaloColorToken e;
    public final UIShape f;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public ProgressBarSpecs() {
        float f = ChaloThemeHelper.a().O;
        float f2 = ChaloThemeHelper.a().d;
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().f, 0.0f, 2);
        float f3 = ChaloThemeHelper.a().Z;
        UIShape.Rectangle rectangle = new UIShape.Rectangle(f3, f3, f3, f3);
        this.f4133a = f;
        this.b = f2;
        this.c = UiAlignment.Vertical.Center.f9888a;
        this.d = chaloPadding;
        this.e = ChaloColorToken.LightGray.f9814a;
        this.f = rectangle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgressBarSpecs)) {
            return false;
        }
        ProgressBarSpecs progressBarSpecs = (ProgressBarSpecs) obj;
        return Dp.m7283equalsimpl0(this.f4133a, progressBarSpecs.f4133a) && Dp.m7283equalsimpl0(this.b, progressBarSpecs.b) && Intrinsics.d(this.c, progressBarSpecs.c) && Intrinsics.d(this.d, progressBarSpecs.d) && Intrinsics.d(this.e, progressBarSpecs.e) && Intrinsics.d(this.f, progressBarSpecs.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + z40.b(this.e, r30.c(this.d, uf0.e(this.c, uf0.a(this.b, Dp.m7284hashCodeimpl(this.f4133a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("ProgressBarSpecs(width=", Dp.m7289toStringimpl(this.f4133a), ", height=", Dp.m7289toStringimpl(this.b), ", alignment=");
        sbE.append(this.c);
        sbE.append(", horizontalPadding=");
        sbE.append(this.d);
        sbE.append(", backgroundColor=");
        sbE.append(this.e);
        sbE.append(", backgroundShape=");
        sbE.append(this.f);
        sbE.append(")");
        return sbE.toString();
    }
}
