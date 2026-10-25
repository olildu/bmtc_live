package app.chalo.productactivation.ui.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import defpackage.cb0;
import defpackage.pk0;
import defpackage.r30;
import defpackage.uf0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/ui/uistate/UpsellRideSectionUISpecs;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UpsellRideSectionUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f8082a;
    public final ChaloPadding b;
    public final UIShape c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public UpsellRideSectionUISpecs() {
        float f = ChaloThemeHelper.a().g;
        float f2 = ChaloThemeHelper.a().g;
        ChaloPadding chaloPadding = new ChaloPadding(f2, f, f, f2);
        float f3 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding2 = new ChaloPadding(f3, f3, f3, f3);
        UIShape.Rectangle shape = UIShape.e;
        float f4 = ChaloThemeHelper.a().g;
        float f5 = ChaloThemeHelper.a().f;
        float f6 = ChaloThemeHelper.a().g;
        float f7 = ChaloThemeHelper.a().d;
        Intrinsics.i(shape, "shape");
        this.f8082a = chaloPadding;
        this.b = chaloPadding2;
        this.c = shape;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpsellRideSectionUISpecs)) {
            return false;
        }
        UpsellRideSectionUISpecs upsellRideSectionUISpecs = (UpsellRideSectionUISpecs) obj;
        return Intrinsics.d(this.f8082a, upsellRideSectionUISpecs.f8082a) && Intrinsics.d(this.b, upsellRideSectionUISpecs.b) && Intrinsics.d(this.c, upsellRideSectionUISpecs.c) && Dp.m7283equalsimpl0(this.d, upsellRideSectionUISpecs.d) && Dp.m7283equalsimpl0(this.e, upsellRideSectionUISpecs.e) && Dp.m7283equalsimpl0(this.f, upsellRideSectionUISpecs.f) && Dp.m7283equalsimpl0(this.g, upsellRideSectionUISpecs.g);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.g) + uf0.a(this.f, uf0.a(this.e, uf0.a(this.d, pk0.b(this.c, r30.c(this.b, this.f8082a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.d);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.e);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.f);
        String strM7289toStringimpl4 = Dp.m7289toStringimpl(this.g);
        StringBuilder sbM = pk0.m("UpsellRideSectionUISpecs(outerPadding=", this.f8082a, ", contentPadding=", this.b, ", shape=");
        sbM.append(this.c);
        sbM.append(", punchRadius=");
        sbM.append(strM7289toStringimpl);
        sbM.append(", cornerRadius=");
        cb0.t(sbM, strM7289toStringimpl2, ", titleAndContentSpacing=", strM7289toStringimpl3, ", pickupLabelAndTimeSpacing=");
        return vo1.p(sbM, strM7289toStringimpl4, ")");
    }
}
