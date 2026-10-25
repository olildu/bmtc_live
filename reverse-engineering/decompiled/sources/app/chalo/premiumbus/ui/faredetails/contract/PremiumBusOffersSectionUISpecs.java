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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusOffersSectionUISpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusOffersSectionUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f7623a;
    public final ChaloPadding b;
    public final float c;
    public final float d;
    public final float e;
    public final ChaloColorToken f;

    public PremiumBusOffersSectionUISpecs() {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        float f2 = ChaloThemeHelper.a().h;
        float f3 = ChaloThemeHelper.a().f;
        float f4 = ChaloThemeHelper.a().f;
        this.f7623a = ChaloColorToken.White.f9870a;
        this.b = chaloPadding;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = ChaloColorToken.ActivityBackground.f9755a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusOffersSectionUISpecs)) {
            return false;
        }
        PremiumBusOffersSectionUISpecs premiumBusOffersSectionUISpecs = (PremiumBusOffersSectionUISpecs) obj;
        return Intrinsics.d(this.f7623a, premiumBusOffersSectionUISpecs.f7623a) && Intrinsics.d(this.b, premiumBusOffersSectionUISpecs.b) && Dp.m7283equalsimpl0(this.c, premiumBusOffersSectionUISpecs.c) && Dp.m7283equalsimpl0(this.d, premiumBusOffersSectionUISpecs.d) && Dp.m7283equalsimpl0(this.e, premiumBusOffersSectionUISpecs.e) && Intrinsics.d(this.f, premiumBusOffersSectionUISpecs.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + uf0.a(this.e, uf0.a(this.d, uf0.a(this.c, r30.c(this.b, this.f7623a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.d);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.e);
        StringBuilder sbI = py.i(this.b, this.f7623a, "PremiumBusOffersSectionUISpecs(backgroundColor=", ", contentPadding=", ", spaceBelowTitle=");
        cb0.t(sbI, strM7289toStringimpl, ", spaceBelowSection=", strM7289toStringimpl2, ", sectionDividerHeight=");
        sbI.append(strM7289toStringimpl3);
        sbI.append(", sectionDividerColor=");
        sbI.append(this.f);
        sbI.append(")");
        return sbI.toString();
    }
}
