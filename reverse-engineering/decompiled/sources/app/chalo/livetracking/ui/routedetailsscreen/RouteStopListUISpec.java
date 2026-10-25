package app.chalo.livetracking.ui.routedetailsscreen;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteStopListUISpec;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteStopListUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f4885a;
    public final ChaloPadding b;

    public RouteStopListUISpec() {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 2);
        this.f4885a = f;
        this.b = chaloPadding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteStopListUISpec)) {
            return false;
        }
        RouteStopListUISpec routeStopListUISpec = (RouteStopListUISpec) obj;
        return Dp.m7283equalsimpl0(this.f4885a, routeStopListUISpec.f4885a) && Intrinsics.d(this.b, routeStopListUISpec.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Dp.m7284hashCodeimpl(this.f4885a) * 31);
    }

    public final String toString() {
        return "RouteStopListUISpec(spaceBetweenToolbarAndContent=" + Dp.m7289toStringimpl(this.f4885a) + ", contentPadding=" + this.b + ")";
    }
}
