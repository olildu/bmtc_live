package app.chalo.premiumbus.ui.faredetails.contract;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.cb0;
import defpackage.pk0;
import defpackage.py;
import defpackage.r30;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusTripSummaryUISpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusTripSummaryUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f7639a;
    public final UIShape b;
    public final ChaloPadding c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;

    public PremiumBusTripSummaryUISpecs() {
        float f = ChaloThemeHelper.a().f;
        UIShape.Rectangle rectangle = new UIShape.Rectangle(f, f, f, f);
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 2);
        float f2 = ChaloThemeHelper.a().g;
        float f3 = ChaloThemeHelper.a().e;
        float f4 = ChaloThemeHelper.a().f;
        float f5 = ChaloThemeHelper.a().h;
        float f6 = ChaloThemeHelper.a().f;
        float f7 = ChaloThemeHelper.a().h;
        float f8 = ChaloThemeHelper.a().f;
        this.f7639a = ChaloColorToken.ShimmerBackground.f9852a;
        this.b = rectangle;
        this.c = chaloPadding;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
        this.i = f7;
        this.j = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusTripSummaryUISpecs)) {
            return false;
        }
        PremiumBusTripSummaryUISpecs premiumBusTripSummaryUISpecs = (PremiumBusTripSummaryUISpecs) obj;
        return Intrinsics.d(this.f7639a, premiumBusTripSummaryUISpecs.f7639a) && Intrinsics.d(this.b, premiumBusTripSummaryUISpecs.b) && Intrinsics.d(this.c, premiumBusTripSummaryUISpecs.c) && Dp.m7283equalsimpl0(this.d, premiumBusTripSummaryUISpecs.d) && Dp.m7283equalsimpl0(this.e, premiumBusTripSummaryUISpecs.e) && Dp.m7283equalsimpl0(this.f, premiumBusTripSummaryUISpecs.f) && Dp.m7283equalsimpl0(this.g, premiumBusTripSummaryUISpecs.g) && Dp.m7283equalsimpl0(this.h, premiumBusTripSummaryUISpecs.h) && Dp.m7283equalsimpl0(this.i, premiumBusTripSummaryUISpecs.i) && Dp.m7283equalsimpl0(this.j, premiumBusTripSummaryUISpecs.j);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.j) + uf0.a(this.i, uf0.a(this.h, uf0.a(this.g, uf0.a(this.f, uf0.a(this.e, uf0.a(this.d, r30.c(this.c, pk0.b(this.b, this.f7639a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.d);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.e);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.f);
        String strM7289toStringimpl4 = Dp.m7289toStringimpl(this.g);
        String strM7289toStringimpl5 = Dp.m7289toStringimpl(this.h);
        String strM7289toStringimpl6 = Dp.m7289toStringimpl(this.i);
        String strM7289toStringimpl7 = Dp.m7289toStringimpl(this.j);
        StringBuilder sb = new StringBuilder("PremiumBusTripSummaryUISpecs(backgroundColor=");
        sb.append(this.f7639a);
        sb.append(", shape=");
        sb.append(this.b);
        sb.append(", contentPadding=");
        py.u(sb, this.c, ", spaceAboveRouteDetails=", strM7289toStringimpl, ", spaceBelowRouteDetails=");
        cb0.t(sb, strM7289toStringimpl2, ", spaceBelowStopDetails=", strM7289toStringimpl3, ", spaceBelowDepartureTime=");
        cb0.t(sb, strM7289toStringimpl4, ", stopIconCircleSize=", strM7289toStringimpl5, ", stopNamesStartPadding=");
        return r30.i(sb, strM7289toStringimpl6, ", spaceBetweenStopNames=", strM7289toStringimpl7, ")");
    }
}
