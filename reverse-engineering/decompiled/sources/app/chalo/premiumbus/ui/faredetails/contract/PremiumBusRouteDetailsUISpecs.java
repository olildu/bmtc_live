package app.chalo.premiumbus.ui.faredetails.contract;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.pk0;
import defpackage.py;
import defpackage.r30;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusRouteDetailsUISpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusRouteDetailsUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f7629a;
    public final UIShape b;
    public final ChaloPadding c;
    public final float d;
    public final float e;
    public final float f;

    public PremiumBusRouteDetailsUISpecs() {
        UIShape.Circle circle = UIShape.Circle.p;
        float f = ChaloThemeHelper.a().g;
        float f2 = ChaloThemeHelper.a().d;
        ChaloPadding chaloPadding = new ChaloPadding(f2, f, f, f2);
        float f3 = ChaloThemeHelper.a().f;
        float f4 = ChaloThemeHelper.a().e;
        float f5 = ChaloThemeHelper.a().d;
        this.f7629a = ChaloColorToken.Grey8.f9802a;
        this.b = circle;
        this.c = chaloPadding;
        this.d = f3;
        this.e = f4;
        this.f = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusRouteDetailsUISpecs)) {
            return false;
        }
        PremiumBusRouteDetailsUISpecs premiumBusRouteDetailsUISpecs = (PremiumBusRouteDetailsUISpecs) obj;
        return Intrinsics.d(this.f7629a, premiumBusRouteDetailsUISpecs.f7629a) && Intrinsics.d(this.b, premiumBusRouteDetailsUISpecs.b) && Intrinsics.d(this.c, premiumBusRouteDetailsUISpecs.c) && Dp.m7283equalsimpl0(this.d, premiumBusRouteDetailsUISpecs.d) && Dp.m7283equalsimpl0(this.e, premiumBusRouteDetailsUISpecs.e) && Dp.m7283equalsimpl0(this.f, premiumBusRouteDetailsUISpecs.f);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.f) + uf0.a(this.e, uf0.a(this.d, r30.c(this.c, pk0.b(this.b, this.f7629a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.d);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.e);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.f);
        StringBuilder sb = new StringBuilder("PremiumBusRouteDetailsUISpecs(pillBackgroundColor=");
        sb.append(this.f7629a);
        sb.append(", pillShape=");
        sb.append(this.b);
        sb.append(", pillPadding=");
        py.u(sb, this.c, ", spaceBelowTags=", strM7289toStringimpl, ", routeNameStartPadding=");
        return r30.i(sb, strM7289toStringimpl2, ", routeSubtitleStartPadding=", strM7289toStringimpl3, ")");
    }
}
