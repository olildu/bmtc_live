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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsScreenUISpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusFareDetailsScreenUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f7606a;
    public final ChaloPadding b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public PremiumBusFareDetailsScreenUISpecs() {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 2);
        float f = ChaloThemeHelper.a().g;
        float f2 = ChaloThemeHelper.a().i;
        float f3 = ChaloThemeHelper.a().u;
        float f4 = ChaloThemeHelper.b().f;
        this.f7606a = ChaloColorToken.White.f9870a;
        this.b = chaloPadding;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusFareDetailsScreenUISpecs)) {
            return false;
        }
        PremiumBusFareDetailsScreenUISpecs premiumBusFareDetailsScreenUISpecs = (PremiumBusFareDetailsScreenUISpecs) obj;
        return Intrinsics.d(this.f7606a, premiumBusFareDetailsScreenUISpecs.f7606a) && Intrinsics.d(this.b, premiumBusFareDetailsScreenUISpecs.b) && Dp.m7283equalsimpl0(this.c, premiumBusFareDetailsScreenUISpecs.c) && Dp.m7283equalsimpl0(this.d, premiumBusFareDetailsScreenUISpecs.d) && Dp.m7283equalsimpl0(this.e, premiumBusFareDetailsScreenUISpecs.e) && Dp.m7283equalsimpl0(this.f, premiumBusFareDetailsScreenUISpecs.f);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.f) + uf0.a(this.e, uf0.a(this.d, uf0.a(this.c, r30.c(this.b, this.f7606a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.d);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.e);
        String strM7289toStringimpl4 = Dp.m7289toStringimpl(this.f);
        StringBuilder sbI = py.i(this.b, this.f7606a, "PremiumBusFareDetailsScreenUISpecs(backgroundColor=", ", contentPadding=", ", spaceAboveTripSummary=");
        cb0.t(sbI, strM7289toStringimpl, ", spaceAboveShimmer=", strM7289toStringimpl2, ", spaceBelowContent=");
        return r30.i(sbI, strM7289toStringimpl3, ", footerShadowHeight=", strM7289toStringimpl4, ")");
    }
}
