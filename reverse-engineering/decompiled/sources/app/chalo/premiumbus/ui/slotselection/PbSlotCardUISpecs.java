package app.chalo.premiumbus.ui.slotselection;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.ChaloUIShape;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.cb0;
import defpackage.gf;
import defpackage.pk0;
import defpackage.r30;
import defpackage.uf0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PbSlotCardUISpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PbSlotCardUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f7834a;
    public final ChaloColorToken b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final UIShape h;
    public final BorderUIState i;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public PbSlotCardUISpecs(ChaloColorToken chaloColorToken, float f, BorderUIState borderUIState, int i) {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().h, ChaloThemeHelper.a().g, ChaloThemeHelper.a().g, ChaloThemeHelper.a().h);
        chaloColorToken = (i & 2) != 0 ? ChaloColorToken.White.f9870a : chaloColorToken;
        float f2 = ChaloThemeHelper.a().f;
        float f3 = ChaloThemeHelper.a().f;
        float f4 = ChaloThemeHelper.a().f;
        float f5 = ChaloThemeHelper.a().f;
        f = (i & 64) != 0 ? 1.0f : f;
        ChaloUIShape chaloUIShape = ChaloThemeHelper.d;
        UIShape slotCardShape = chaloUIShape.g;
        borderUIState = (i & 256) != 0 ? new BorderUIState(ChaloThemeHelper.a().c, ChaloColorToken.VeryLightGrey.f9868a, chaloUIShape.g) : borderUIState;
        Intrinsics.i(slotCardShape, "slotCardShape");
        this.f7834a = chaloPadding;
        this.b = chaloColorToken;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = f;
        this.h = slotCardShape;
        this.i = borderUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PbSlotCardUISpecs)) {
            return false;
        }
        PbSlotCardUISpecs pbSlotCardUISpecs = (PbSlotCardUISpecs) obj;
        return Intrinsics.d(this.f7834a, pbSlotCardUISpecs.f7834a) && Intrinsics.d(this.b, pbSlotCardUISpecs.b) && Dp.m7283equalsimpl0(this.c, pbSlotCardUISpecs.c) && Dp.m7283equalsimpl0(this.d, pbSlotCardUISpecs.d) && Dp.m7283equalsimpl0(this.e, pbSlotCardUISpecs.e) && Dp.m7283equalsimpl0(this.f, pbSlotCardUISpecs.f) && Float.compare(this.g, pbSlotCardUISpecs.g) == 0 && Intrinsics.d(this.h, pbSlotCardUISpecs.h) && Intrinsics.d(this.i, pbSlotCardUISpecs.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + pk0.b(this.h, r30.a(this.g, uf0.a(this.f, uf0.a(this.e, uf0.a(this.d, uf0.a(this.c, z40.b(this.b, this.f7834a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.d);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.e);
        String strM7289toStringimpl4 = Dp.m7289toStringimpl(this.f);
        StringBuilder sbL = gf.l(this.f7834a, this.b, "PbSlotCardUISpecs(contentPadding=", ", cardBackgroundColor=", ", spaceBtwRadioBtnAndText=");
        cb0.t(sbL, strM7289toStringimpl, ", spaceBtwScheduleAndDelayTime=", strM7289toStringimpl2, ", spaceBtwScheduleAndReachTime=");
        cb0.t(sbL, strM7289toStringimpl3, ", spaceBtwReachTimeAndExpressIndicator=", strM7289toStringimpl4, ", alpha=");
        sbL.append(this.g);
        sbL.append(", slotCardShape=");
        sbL.append(this.h);
        sbL.append(", selectionBorderUIState=");
        sbL.append(this.i);
        sbL.append(")");
        return sbL.toString();
    }
}
