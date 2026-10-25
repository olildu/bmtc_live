package app.chalo.kyc.min.ui.minkycdetails;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiAlignment;
import defpackage.uf0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/kyc/min/ui/minkycdetails/StepCircleUISpecs;", "", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StepCircleUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UiAlignment.Vertical f4134a;
    public final UiAlignment.BiasAlignment b;
    public final float c;
    public final ChaloColorToken d;
    public final BorderUISpec e;

    public StepCircleUISpecs(ChaloColorToken chaloColorToken, int i) {
        float f = ChaloThemeHelper.a().i;
        BorderUISpec borderUISpec = (i & 16) != 0 ? new BorderUISpec(ChaloThemeHelper.a().b, ChaloColorToken.Orange2.f9830a, UIShape.Circle.p) : null;
        this.f4134a = UiAlignment.Vertical.Center.f9888a;
        this.b = UiAlignment.BiasAlignment.Center.f9878a;
        this.c = f;
        this.d = chaloColorToken;
        this.e = borderUISpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StepCircleUISpecs)) {
            return false;
        }
        StepCircleUISpecs stepCircleUISpecs = (StepCircleUISpecs) obj;
        return Intrinsics.d(this.f4134a, stepCircleUISpecs.f4134a) && Intrinsics.d(this.b, stepCircleUISpecs.b) && Dp.m7283equalsimpl0(this.c, stepCircleUISpecs.c) && Intrinsics.d(this.d, stepCircleUISpecs.d) && Intrinsics.d(this.e, stepCircleUISpecs.e);
    }

    public final int hashCode() {
        int iB = z40.b(this.d, uf0.a(this.c, (this.b.hashCode() + (this.f4134a.hashCode() * 31)) * 31, 31), 31);
        BorderUISpec borderUISpec = this.e;
        return iB + (borderUISpec == null ? 0 : borderUISpec.hashCode());
    }

    public final String toString() {
        return "StepCircleUISpecs(verticalAlignment=" + this.f4134a + ", contentAlignment=" + this.b + ", circleSize=" + Dp.m7289toStringimpl(this.c) + ", circleBackground=" + this.d + ", circleBorder=" + this.e + ")";
    }
}
