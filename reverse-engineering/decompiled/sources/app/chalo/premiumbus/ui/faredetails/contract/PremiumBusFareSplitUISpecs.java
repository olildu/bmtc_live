package app.chalo.premiumbus.ui.faredetails.contract;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.cb0;
import defpackage.py;
import defpackage.r30;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareSplitUISpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusFareSplitUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f7617a;
    public final ChaloPadding b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public PremiumBusFareSplitUISpecs() {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        float f2 = ChaloThemeHelper.a().h;
        float f3 = ChaloThemeHelper.a().h;
        float f4 = ChaloThemeHelper.a().h;
        float f5 = ChaloThemeHelper.a().f;
        this.f7617a = ChaloColorToken.White.f9870a;
        this.b = chaloPadding;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusFareSplitUISpecs)) {
            return false;
        }
        PremiumBusFareSplitUISpecs premiumBusFareSplitUISpecs = (PremiumBusFareSplitUISpecs) obj;
        return Intrinsics.d(this.f7617a, premiumBusFareSplitUISpecs.f7617a) && Intrinsics.d(this.b, premiumBusFareSplitUISpecs.b) && Dp.m7283equalsimpl0(this.c, premiumBusFareSplitUISpecs.c) && Dp.m7283equalsimpl0(this.d, premiumBusFareSplitUISpecs.d) && Dp.m7283equalsimpl0(this.e, premiumBusFareSplitUISpecs.e) && Dp.m7283equalsimpl0(this.f, premiumBusFareSplitUISpecs.f);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.f) + uf0.a(this.e, uf0.a(this.d, uf0.a(this.c, r30.c(this.b, this.f7617a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.d);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.e);
        String strM7289toStringimpl4 = Dp.m7289toStringimpl(this.f);
        StringBuilder sbI = py.i(this.b, this.f7617a, "PremiumBusFareSplitUISpecs(backgroundColor=", ", contentPadding=", ", spaceBelowTitle=");
        cb0.t(sbI, strM7289toStringimpl, ", spaceBetweenRows=", strM7289toStringimpl2, ", spaceAroundDivider=");
        return r30.i(sbI, strM7289toStringimpl3, ", spaceBetweenLabelAndAmount=", strM7289toStringimpl4, ")");
    }
}
