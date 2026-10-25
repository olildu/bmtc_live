package app.chalo.productactivation.ui.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiAlignment;
import app.chalo.uistate.base.UiArrangement;
import defpackage.pk0;
import defpackage.r30;
import defpackage.uf0;
import defpackage.vo1;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/ui/uistate/ActivationPassContainerUISpecs;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ActivationPassContainerUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f8052a;
    public final ChaloPadding b;
    public final ChaloColorToken c;
    public final UIShape d;
    public final ChaloPadding e;
    public final ChaloPadding f;
    public final UiArrangement.HorizontalOrVertical g;
    public final UiAlignment.Vertical h;
    public final float i;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public ActivationPassContainerUISpecs() {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().f, 0.0f, 2);
        UIShape.Rectangle shape = UIShape.e;
        ChaloPadding chaloPadding3 = new ChaloPadding(ChaloThemeHelper.a().i, 0.0f, 0.0f, 0.0f, 14);
        ChaloPadding chaloPadding4 = new ChaloPadding(0.0f, 0.0f, 0.0f, ChaloThemeHelper.a().f, 7);
        float f2 = ChaloThemeHelper.a().g;
        Intrinsics.i(shape, "shape");
        this.f8052a = chaloPadding;
        this.b = chaloPadding2;
        this.c = ChaloColorToken.CornSilk.f9778a;
        this.d = shape;
        this.e = chaloPadding3;
        this.f = chaloPadding4;
        this.g = UiArrangement.HorizontalOrVertical.SpaceBetween.f9892a;
        this.h = UiAlignment.Vertical.Bottom.f9887a;
        this.i = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivationPassContainerUISpecs)) {
            return false;
        }
        ActivationPassContainerUISpecs activationPassContainerUISpecs = (ActivationPassContainerUISpecs) obj;
        return Intrinsics.d(this.f8052a, activationPassContainerUISpecs.f8052a) && Intrinsics.d(this.b, activationPassContainerUISpecs.b) && Intrinsics.d(this.c, activationPassContainerUISpecs.c) && Intrinsics.d(this.d, activationPassContainerUISpecs.d) && Intrinsics.d(this.e, activationPassContainerUISpecs.e) && Intrinsics.d(this.f, activationPassContainerUISpecs.f) && Intrinsics.d(this.g, activationPassContainerUISpecs.g) && Intrinsics.d(this.h, activationPassContainerUISpecs.h) && Dp.m7283equalsimpl0(this.i, activationPassContainerUISpecs.i);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.i) + uf0.e(this.h, (this.g.hashCode() + r30.c(this.f, r30.c(this.e, pk0.b(this.d, z40.b(this.c, r30.c(this.b, this.f8052a.hashCode() * 31, 31), 31), 31), 31), 31)) * 31, 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.i);
        StringBuilder sbM = pk0.m("ActivationPassContainerUISpecs(contentPadding=", this.f8052a, ", passContainerPadding=", this.b, ", backgroundColor=");
        sbM.append(this.c);
        sbM.append(", shape=");
        sbM.append(this.d);
        sbM.append(", passInfoRowPadding=");
        r30.o(sbM, this.e, ", validTillTextPadding=", this.f, ", passInfoRowArrangement=");
        sbM.append(this.g);
        sbM.append(", passInfoRowAlignment=");
        sbM.append(this.h);
        sbM.append(", detailsContainerAndDividerSpacing=");
        return vo1.p(sbM, strM7289toStringimpl, ")");
    }
}
