package app.chalo.premiumbus.ui.slotselection;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloElevation;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.dd;
import defpackage.pk0;
import defpackage.r30;
import defpackage.uf0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionSpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusSlotSelectionSpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f7888a;
    public final float b;
    public final float c;
    public final ChaloColorToken d;
    public final UIShape e;
    public final ChaloPadding f;
    public final float g;
    public final ChaloColorToken h;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public PremiumBusSlotSelectionSpecs() {
        float f = ChaloThemeHelper.a().n;
        ChaloElevation chaloElevation = ChaloThemeHelper.c;
        float f2 = chaloElevation.c;
        float f3 = chaloElevation.f1917a;
        UIShape.Rectangle confirmBtnShape = UIShape.f1926a;
        float f4 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f4, f4, f4, f4);
        float f5 = ChaloThemeHelper.a().c;
        Intrinsics.i(confirmBtnShape, "confirmBtnShape");
        this.f7888a = f;
        this.b = f2;
        this.c = f3;
        this.d = ChaloColorToken.White.f9870a;
        this.e = confirmBtnShape;
        this.f = chaloPadding;
        this.g = f5;
        this.h = ChaloColorToken.SectionDividerColor.f9849a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusSlotSelectionSpecs)) {
            return false;
        }
        PremiumBusSlotSelectionSpecs premiumBusSlotSelectionSpecs = (PremiumBusSlotSelectionSpecs) obj;
        return Dp.m7283equalsimpl0(this.f7888a, premiumBusSlotSelectionSpecs.f7888a) && Dp.m7283equalsimpl0(this.b, premiumBusSlotSelectionSpecs.b) && Dp.m7283equalsimpl0(this.c, premiumBusSlotSelectionSpecs.c) && Intrinsics.d(this.d, premiumBusSlotSelectionSpecs.d) && Intrinsics.d(this.e, premiumBusSlotSelectionSpecs.e) && Intrinsics.d(this.f, premiumBusSlotSelectionSpecs.f) && Dp.m7283equalsimpl0(this.g, premiumBusSlotSelectionSpecs.g) && Intrinsics.d(this.h, premiumBusSlotSelectionSpecs.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + uf0.a(this.g, r30.c(this.f, pk0.b(this.e, z40.b(this.d, uf0.a(this.c, uf0.a(this.b, Dp.m7284hashCodeimpl(this.f7888a) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.f7888a);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.b);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl4 = Dp.m7289toStringimpl(this.g);
        StringBuilder sbE = dd.e("PremiumBusSlotSelectionSpecs(confirmBtnHeight=", strM7289toStringimpl, ", confirmBtnTopElevation=", strM7289toStringimpl2, ", confirmBtnElevation=");
        sbE.append(strM7289toStringimpl3);
        sbE.append(", confirmBtnBackgroundColor=");
        sbE.append(this.d);
        sbE.append(", confirmBtnShape=");
        sbE.append(this.e);
        sbE.append(", confirmBtnPadding=");
        sbE.append(this.f);
        sbE.append(", spacerHeight=");
        sbE.append(strM7289toStringimpl4);
        sbE.append(", spacerColor=");
        sbE.append(this.h);
        sbE.append(")");
        return sbE.toString();
    }
}
