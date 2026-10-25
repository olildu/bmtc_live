package app.chalo.productactivation.ui.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.gf;
import defpackage.pk0;
import defpackage.uf0;
import defpackage.vo1;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/ui/uistate/ActivationNoticeUISpecs;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ActivationNoticeUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f8050a;
    public final ChaloColorToken b;
    public final UIShape c;
    public final float d;
    public final float e;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public ActivationNoticeUISpecs() {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        UIShape.Rectangle shape = UIShape.e;
        float f2 = ChaloThemeHelper.a().f;
        float f3 = ChaloThemeHelper.a().d;
        Intrinsics.i(shape, "shape");
        this.f8050a = chaloPadding;
        this.b = ChaloColorToken.PaleRed.f9838a;
        this.c = shape;
        this.d = f2;
        this.e = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivationNoticeUISpecs)) {
            return false;
        }
        ActivationNoticeUISpecs activationNoticeUISpecs = (ActivationNoticeUISpecs) obj;
        return Intrinsics.d(this.f8050a, activationNoticeUISpecs.f8050a) && Intrinsics.d(this.b, activationNoticeUISpecs.b) && Intrinsics.d(this.c, activationNoticeUISpecs.c) && Dp.m7283equalsimpl0(this.d, activationNoticeUISpecs.d) && Dp.m7283equalsimpl0(this.e, activationNoticeUISpecs.e);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.e) + uf0.a(this.d, pk0.b(this.c, z40.b(this.b, this.f8050a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.d);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.e);
        StringBuilder sbL = gf.l(this.f8050a, this.b, "ActivationNoticeUISpecs(contentPadding=", ", backgroundColor=", ", shape=");
        sbL.append(this.c);
        sbL.append(", iconAndTitleSpacing=");
        sbL.append(strM7289toStringimpl);
        sbL.append(", titleAndMessageSpacing=");
        return vo1.p(sbL, strM7289toStringimpl2, ")");
    }
}
