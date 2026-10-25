package app.chalo.premiumbus.ui.seatselection.compose.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloElevation;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.cb0;
import defpackage.r30;
import defpackage.t10;
import defpackage.uf0;
import defpackage.vo1;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/compose/uistate/PremiumBusSeatSelectionUISpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusSeatSelectionUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f7780a;
    public final float b;
    public final float c;
    public final float d;
    public final ChaloColorToken e;
    public final ChaloPadding f;
    public final ChaloPadding g;
    public final ChaloColorToken h;
    public final float i;

    public PremiumBusSeatSelectionUISpecs() {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        float f2 = ChaloThemeHelper.a().n;
        ChaloElevation chaloElevation = ChaloThemeHelper.c;
        float f3 = chaloElevation.f1917a;
        float f4 = chaloElevation.c;
        float f5 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding2 = new ChaloPadding(f5, f5, f5, f5);
        ChaloPadding chaloPadding3 = new ChaloPadding(ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h);
        float f6 = ChaloThemeHelper.a().b;
        this.f7780a = chaloPadding;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = ChaloColorToken.White.f9870a;
        this.f = chaloPadding2;
        this.g = chaloPadding3;
        this.h = ChaloColorToken.SectionDividerColor.f9849a;
        this.i = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusSeatSelectionUISpecs)) {
            return false;
        }
        PremiumBusSeatSelectionUISpecs premiumBusSeatSelectionUISpecs = (PremiumBusSeatSelectionUISpecs) obj;
        return Intrinsics.d(this.f7780a, premiumBusSeatSelectionUISpecs.f7780a) && Dp.m7283equalsimpl0(this.b, premiumBusSeatSelectionUISpecs.b) && Dp.m7283equalsimpl0(this.c, premiumBusSeatSelectionUISpecs.c) && Dp.m7283equalsimpl0(this.d, premiumBusSeatSelectionUISpecs.d) && Intrinsics.d(this.e, premiumBusSeatSelectionUISpecs.e) && Intrinsics.d(this.f, premiumBusSeatSelectionUISpecs.f) && Intrinsics.d(this.g, premiumBusSeatSelectionUISpecs.g) && Intrinsics.d(this.h, premiumBusSeatSelectionUISpecs.h) && Dp.m7283equalsimpl0(this.i, premiumBusSeatSelectionUISpecs.i);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.i) + z40.b(this.h, r30.c(this.g, r30.c(this.f, z40.b(this.e, uf0.a(this.d, uf0.a(this.c, uf0.a(this.b, this.f7780a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.b);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.d);
        String strM7289toStringimpl4 = Dp.m7289toStringimpl(this.i);
        StringBuilder sbN = t10.n("PremiumBusSeatSelectionUISpecs(seatSelectionComponentContentPadding=", this.f7780a, ", selectSeatBtnHeight=", strM7289toStringimpl, ", selectSeatBtnElevation=");
        cb0.t(sbN, strM7289toStringimpl2, ", selectSeatBtnTopElevation=", strM7289toStringimpl3, ", selectSeatBtnBackgroundColor=");
        sbN.append(this.e);
        sbN.append(", selectSeatBtnPadding=");
        sbN.append(this.f);
        sbN.append(", selectSeatLayoutPadding=");
        sbN.append(this.g);
        sbN.append(", dividerColor=");
        sbN.append(this.h);
        sbN.append(", dividerHeight=");
        return vo1.p(sbN, strM7289toStringimpl4, ")");
    }
}
