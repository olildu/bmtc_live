package app.chalo.premiumbus.ui.slotselectionlist;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.premiumbus.ui.slotselection.BorderUIState;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.cb0;
import defpackage.gf;
import defpackage.pk0;
import defpackage.uf0;
import defpackage.vo1;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselectionlist/SlotCardUISpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SlotCardUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f7921a;
    public final ChaloColorToken b;
    public final float c;
    public final float d;
    public final UIShape e;
    public final BorderUIState f;
    public final float g;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public SlotCardUISpecs(ChaloColorToken chaloColorToken, BorderUIState borderUIState) {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().h, ChaloThemeHelper.a().g, ChaloThemeHelper.a().g, ChaloThemeHelper.a().h);
        float f = ChaloThemeHelper.a().f;
        float f2 = ChaloThemeHelper.a().f;
        UIShape slotCardShape = ChaloThemeHelper.d.g;
        float f3 = ChaloThemeHelper.a().f;
        Intrinsics.i(slotCardShape, "slotCardShape");
        this.f7921a = chaloPadding;
        this.b = chaloColorToken;
        this.c = f;
        this.d = f2;
        this.e = slotCardShape;
        this.f = borderUIState;
        this.g = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlotCardUISpecs)) {
            return false;
        }
        SlotCardUISpecs slotCardUISpecs = (SlotCardUISpecs) obj;
        return Intrinsics.d(this.f7921a, slotCardUISpecs.f7921a) && Intrinsics.d(this.b, slotCardUISpecs.b) && Dp.m7283equalsimpl0(this.c, slotCardUISpecs.c) && Dp.m7283equalsimpl0(this.d, slotCardUISpecs.d) && Intrinsics.d(this.e, slotCardUISpecs.e) && Intrinsics.d(this.f, slotCardUISpecs.f) && Dp.m7283equalsimpl0(this.g, slotCardUISpecs.g);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.g) + ((this.f.hashCode() + pk0.b(this.e, uf0.a(this.d, uf0.a(this.c, z40.b(this.b, this.f7921a.hashCode() * 31, 31), 31), 31), 31)) * 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.d);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.g);
        StringBuilder sbL = gf.l(this.f7921a, this.b, "SlotCardUISpecs(contentPadding=", ", cardBackgroundColor=", ", spaceBtwRadioBtnAndText=");
        cb0.t(sbL, strM7289toStringimpl, ", spaceBtwTextAndExpressIndicator=", strM7289toStringimpl2, ", slotCardShape=");
        sbL.append(this.e);
        sbL.append(", selectionBorderUIState=");
        sbL.append(this.f);
        sbL.append(", spaceBtwReachTimeAndExpressIndicator=");
        return vo1.p(sbL, strM7289toStringimpl3, ")");
    }
}
