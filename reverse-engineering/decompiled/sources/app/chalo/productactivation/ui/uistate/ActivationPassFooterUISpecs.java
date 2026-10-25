package app.chalo.productactivation.ui.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.UiArrangement;
import defpackage.t10;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/ui/uistate/ActivationPassFooterUISpecs;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ActivationPassFooterUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f8054a;
    public final float b;
    public final UiArrangement.HorizontalOrVertical c;

    public ActivationPassFooterUISpecs() {
        float f = ChaloThemeHelper.a().g;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        float f2 = ChaloThemeHelper.a().g;
        UiArrangement.HorizontalOrVertical.SpacedBy spacedBy = new UiArrangement.HorizontalOrVertical.SpacedBy(ChaloThemeHelper.a().g);
        this.f8054a = chaloPadding;
        this.b = f2;
        this.c = spacedBy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivationPassFooterUISpecs)) {
            return false;
        }
        ActivationPassFooterUISpecs activationPassFooterUISpecs = (ActivationPassFooterUISpecs) obj;
        return Intrinsics.d(this.f8054a, activationPassFooterUISpecs.f8054a) && Dp.m7283equalsimpl0(this.b, activationPassFooterUISpecs.b) && Intrinsics.d(this.c, activationPassFooterUISpecs.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + uf0.a(this.b, this.f8054a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sbN = t10.n("ActivationPassFooterUISpecs(contentPadding=", this.f8054a, ", detailsContainerAndDividerSpacing=", Dp.m7289toStringimpl(this.b), ", ctaButtonsVerticalArrangement=");
        sbN.append(this.c);
        sbN.append(")");
        return sbN.toString();
    }
}
