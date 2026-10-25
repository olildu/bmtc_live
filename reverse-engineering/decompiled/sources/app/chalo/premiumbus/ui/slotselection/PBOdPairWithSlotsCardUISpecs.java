package app.chalo.premiumbus.ui.slotselection;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.cb0;
import defpackage.pk0;
import defpackage.r30;
import defpackage.uf0;
import defpackage.vo1;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PBOdPairWithSlotsCardUISpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PBOdPairWithSlotsCardUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f7821a;
    public final ChaloPadding b;
    public final ChaloColorToken c;
    public final UIShape d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public PBOdPairWithSlotsCardUISpecs() {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().f, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, ChaloThemeHelper.a().f);
        UIShape cardShape = ChaloThemeHelper.d.g;
        float f2 = ChaloThemeHelper.a().f;
        float f3 = ChaloThemeHelper.a().h;
        float f4 = ChaloThemeHelper.a().k;
        float f5 = ChaloThemeHelper.a().h;
        float f6 = ChaloThemeHelper.a().g;
        float f7 = ChaloThemeHelper.a().e;
        float f8 = ChaloThemeHelper.a().h;
        Intrinsics.i(cardShape, "cardShape");
        this.f7821a = chaloPadding;
        this.b = chaloPadding2;
        this.c = ChaloColorToken.White.f9870a;
        this.d = cardShape;
        this.e = f2;
        this.f = f3;
        this.g = f4;
        this.h = f5;
        this.i = f6;
        this.j = f7;
        this.k = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PBOdPairWithSlotsCardUISpecs)) {
            return false;
        }
        PBOdPairWithSlotsCardUISpecs pBOdPairWithSlotsCardUISpecs = (PBOdPairWithSlotsCardUISpecs) obj;
        return Intrinsics.d(this.f7821a, pBOdPairWithSlotsCardUISpecs.f7821a) && Intrinsics.d(this.b, pBOdPairWithSlotsCardUISpecs.b) && Intrinsics.d(this.c, pBOdPairWithSlotsCardUISpecs.c) && Intrinsics.d(this.d, pBOdPairWithSlotsCardUISpecs.d) && Dp.m7283equalsimpl0(this.e, pBOdPairWithSlotsCardUISpecs.e) && Dp.m7283equalsimpl0(this.f, pBOdPairWithSlotsCardUISpecs.f) && Dp.m7283equalsimpl0(this.g, pBOdPairWithSlotsCardUISpecs.g) && Dp.m7283equalsimpl0(this.h, pBOdPairWithSlotsCardUISpecs.h) && Dp.m7283equalsimpl0(this.i, pBOdPairWithSlotsCardUISpecs.i) && Dp.m7283equalsimpl0(this.j, pBOdPairWithSlotsCardUISpecs.j) && Dp.m7283equalsimpl0(this.k, pBOdPairWithSlotsCardUISpecs.k);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.k) + uf0.a(this.j, uf0.a(this.i, uf0.a(this.h, uf0.a(this.g, uf0.a(this.f, uf0.a(this.e, pk0.b(this.d, z40.b(this.c, r30.c(this.b, this.f7821a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.e);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.f);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.g);
        String strM7289toStringimpl4 = Dp.m7289toStringimpl(this.h);
        String strM7289toStringimpl5 = Dp.m7289toStringimpl(this.i);
        String strM7289toStringimpl6 = Dp.m7289toStringimpl(this.j);
        String strM7289toStringimpl7 = Dp.m7289toStringimpl(this.k);
        StringBuilder sbM = pk0.m("PBOdPairWithSlotsCardUISpecs(cardPadding=", this.f7821a, ", cardOuterPadding=", this.b, ", cardBackgroundColor=");
        sbM.append(this.c);
        sbM.append(", cardShape=");
        sbM.append(this.d);
        sbM.append(", spaceBtwSlots=");
        cb0.t(sbM, strM7289toStringimpl, ", spaceBtwToStopInfoAndDirectionsBtn=", strM7289toStringimpl2, ", spaceBtwDirectionsBtnAndSlots=");
        cb0.t(sbM, strM7289toStringimpl3, ", spaceBtwSlotsAndViewAllTimeBtn=", strM7289toStringimpl4, ", spaceBtwFromAndToStopInfo=");
        cb0.t(sbM, strM7289toStringimpl5, ", spaceBtwIconAndSlotInfo=", strM7289toStringimpl6, ", spaceBtwTagsAndStopInfo=");
        return vo1.p(sbM, strM7289toStringimpl7, ")");
    }
}
