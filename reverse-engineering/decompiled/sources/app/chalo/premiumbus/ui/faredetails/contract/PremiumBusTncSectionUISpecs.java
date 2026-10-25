package app.chalo.premiumbus.ui.faredetails.contract;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.cb0;
import defpackage.r30;
import defpackage.t10;
import defpackage.uf0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusTncSectionUISpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusTncSectionUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f7636a;
    public final float b;
    public final ChaloColorToken c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public PremiumBusTncSectionUISpecs() {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 2);
        float f = ChaloThemeHelper.a().f;
        float f2 = ChaloThemeHelper.a().h;
        float f3 = ChaloThemeHelper.a().f;
        float f4 = ChaloThemeHelper.a().e;
        float f5 = ChaloThemeHelper.a().g;
        float f6 = ChaloThemeHelper.a().h;
        this.f7636a = chaloPadding;
        this.b = f;
        this.c = ChaloColorToken.ActivityBackground.f9755a;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusTncSectionUISpecs)) {
            return false;
        }
        PremiumBusTncSectionUISpecs premiumBusTncSectionUISpecs = (PremiumBusTncSectionUISpecs) obj;
        return Intrinsics.d(this.f7636a, premiumBusTncSectionUISpecs.f7636a) && Dp.m7283equalsimpl0(this.b, premiumBusTncSectionUISpecs.b) && Intrinsics.d(this.c, premiumBusTncSectionUISpecs.c) && Dp.m7283equalsimpl0(this.d, premiumBusTncSectionUISpecs.d) && Dp.m7283equalsimpl0(this.e, premiumBusTncSectionUISpecs.e) && Dp.m7283equalsimpl0(this.f, premiumBusTncSectionUISpecs.f) && Dp.m7283equalsimpl0(this.g, premiumBusTncSectionUISpecs.g) && Dp.m7283equalsimpl0(this.h, premiumBusTncSectionUISpecs.h);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.h) + uf0.a(this.g, uf0.a(this.f, uf0.a(this.e, uf0.a(this.d, z40.b(this.c, uf0.a(this.b, this.f7636a.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.b);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.d);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.e);
        String strM7289toStringimpl4 = Dp.m7289toStringimpl(this.f);
        String strM7289toStringimpl5 = Dp.m7289toStringimpl(this.g);
        String strM7289toStringimpl6 = Dp.m7289toStringimpl(this.h);
        StringBuilder sbN = t10.n("PremiumBusTncSectionUISpecs(contentPadding=", this.f7636a, ", sectionDividerHeight=", strM7289toStringimpl, ", sectionDividerColor=");
        sbN.append(this.c);
        sbN.append(", spaceAboveTitle=");
        sbN.append(strM7289toStringimpl2);
        sbN.append(", spaceBelowTitle=");
        cb0.t(sbN, strM7289toStringimpl3, ", spaceBetweenTerms=", strM7289toStringimpl4, ", spaceAboveAgreement=");
        return r30.i(sbN, strM7289toStringimpl5, ", spaceBelowSection=", strM7289toStringimpl6, ")");
    }
}
