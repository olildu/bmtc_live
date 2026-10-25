package app.chalo.livetracking.ui.routedetailsscreen.uistatefactory;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import defpackage.dd;
import defpackage.uf0;
import defpackage.vo1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/RouteHeaderDetailsUISpecs;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteHeaderDetailsUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f4930a;
    public final float b;
    public final float c;

    public RouteHeaderDetailsUISpecs(float f) {
        float f2 = ChaloThemeHelper.a().h;
        float f3 = ChaloThemeHelper.a().d;
        this.f4930a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteHeaderDetailsUISpecs)) {
            return false;
        }
        RouteHeaderDetailsUISpecs routeHeaderDetailsUISpecs = (RouteHeaderDetailsUISpecs) obj;
        return Dp.m7283equalsimpl0(this.f4930a, routeHeaderDetailsUISpecs.f4930a) && Dp.m7283equalsimpl0(this.b, routeHeaderDetailsUISpecs.b) && Dp.m7283equalsimpl0(this.c, routeHeaderDetailsUISpecs.c);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.c) + uf0.a(this.b, Dp.m7284hashCodeimpl(this.f4930a) * 31, 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.f4930a);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.b);
        return vo1.p(dd.e("RouteHeaderDetailsUISpecs(spaceAfterSpecialFeatures=", strM7289toStringimpl, ", spaceBeforeUserDestinationStop=", strM7289toStringimpl2, ", spaceBeforePlotlineWidget="), Dp.m7289toStringimpl(this.c), ")");
    }
}
