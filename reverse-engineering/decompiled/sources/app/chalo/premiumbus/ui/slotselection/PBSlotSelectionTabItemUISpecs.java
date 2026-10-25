package app.chalo.premiumbus.ui.slotselection;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.dd;
import defpackage.pk0;
import defpackage.uf0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PBSlotSelectionTabItemUISpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PBSlotSelectionTabItemUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f7827a;
    public final float b;
    public final ChaloColorToken c;
    public final float d;
    public final ChaloColorToken e;
    public final float f;
    public final ChaloColorToken g;

    public PBSlotSelectionTabItemUISpecs(ChaloColorToken chaloColorToken, int i) {
        float f = ChaloThemeHelper.a().e;
        float f2 = ChaloThemeHelper.a().c;
        ChaloColorToken chaloColorToken2 = (i & 4) != 0 ? ChaloColorToken.SectionDividerColor.f9849a : ChaloColorToken.OrangePrimary.f9835a;
        float f3 = ChaloThemeHelper.a().A;
        float f4 = ChaloThemeHelper.a().c;
        int i2 = i & 64;
        ChaloColorToken.White white = ChaloColorToken.White.f9870a;
        chaloColorToken = i2 != 0 ? white : chaloColorToken;
        this.f7827a = f;
        this.b = f2;
        this.c = chaloColorToken2;
        this.d = f3;
        this.e = white;
        this.f = f4;
        this.g = chaloColorToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PBSlotSelectionTabItemUISpecs)) {
            return false;
        }
        PBSlotSelectionTabItemUISpecs pBSlotSelectionTabItemUISpecs = (PBSlotSelectionTabItemUISpecs) obj;
        return Dp.m7283equalsimpl0(this.f7827a, pBSlotSelectionTabItemUISpecs.f7827a) && Dp.m7283equalsimpl0(this.b, pBSlotSelectionTabItemUISpecs.b) && Intrinsics.d(this.c, pBSlotSelectionTabItemUISpecs.c) && Dp.m7283equalsimpl0(this.d, pBSlotSelectionTabItemUISpecs.d) && Intrinsics.d(this.e, pBSlotSelectionTabItemUISpecs.e) && Dp.m7283equalsimpl0(this.f, pBSlotSelectionTabItemUISpecs.f) && Intrinsics.d(this.g, pBSlotSelectionTabItemUISpecs.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + uf0.a(this.f, z40.b(this.e, uf0.a(this.d, z40.b(this.c, uf0.a(this.b, Dp.m7284hashCodeimpl(this.f7827a) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.f7827a);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.b);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.d);
        String strM7289toStringimpl4 = Dp.m7289toStringimpl(this.f);
        StringBuilder sbE = dd.e("PBSlotSelectionTabItemUISpecs(iconAndTextSpacing=", strM7289toStringimpl, ", bottomLineHeight=", strM7289toStringimpl2, ", bottomLineColor=");
        sbE.append(this.c);
        sbE.append(", width=");
        sbE.append(strM7289toStringimpl3);
        sbE.append(", backgroundColorToken=");
        sbE.append(this.e);
        sbE.append(", selectionIndicatorHeight=");
        sbE.append(strM7289toStringimpl4);
        sbE.append(", selectionIndicatorColor=");
        return pk0.j(sbE, this.g, ")");
    }
}
