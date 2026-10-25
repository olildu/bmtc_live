package app.chalo.premiumbus.ui.faredetails.contract;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.r30;
import defpackage.t10;
import defpackage.uf0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusSectionNoteUISpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusSectionNoteUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f7631a;
    public final float b;
    public final float c;
    public final ChaloColorToken d;
    public final float e;
    public final float f;

    public PremiumBusSectionNoteUISpecs() {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 2);
        float f = ChaloThemeHelper.a().i;
        float f2 = ChaloThemeHelper.a().f;
        float f3 = ChaloThemeHelper.a().i;
        float f4 = ChaloThemeHelper.a().d;
        this.f7631a = chaloPadding;
        this.b = f;
        this.c = f2;
        this.d = ChaloColorToken.ActivityBackground.f9755a;
        this.e = f3;
        this.f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusSectionNoteUISpecs)) {
            return false;
        }
        PremiumBusSectionNoteUISpecs premiumBusSectionNoteUISpecs = (PremiumBusSectionNoteUISpecs) obj;
        return Intrinsics.d(this.f7631a, premiumBusSectionNoteUISpecs.f7631a) && Dp.m7283equalsimpl0(this.b, premiumBusSectionNoteUISpecs.b) && Dp.m7283equalsimpl0(this.c, premiumBusSectionNoteUISpecs.c) && Intrinsics.d(this.d, premiumBusSectionNoteUISpecs.d) && Dp.m7283equalsimpl0(this.e, premiumBusSectionNoteUISpecs.e) && Dp.m7283equalsimpl0(this.f, premiumBusSectionNoteUISpecs.f);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.f) + uf0.a(this.e, z40.b(this.d, uf0.a(this.c, uf0.a(this.b, this.f7631a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.b);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.e);
        String strM7289toStringimpl4 = Dp.m7289toStringimpl(this.f);
        StringBuilder sbN = t10.n("PremiumBusSectionNoteUISpecs(contentPadding=", this.f7631a, ", spaceAboveSection=", strM7289toStringimpl, ", sectionDividerHeight=");
        sbN.append(strM7289toStringimpl2);
        sbN.append(", sectionDividerColor=");
        sbN.append(this.d);
        sbN.append(", spaceBelowDivider=");
        return r30.i(sbN, strM7289toStringimpl3, ", spaceBelowTitle=", strM7289toStringimpl4, ")");
    }
}
