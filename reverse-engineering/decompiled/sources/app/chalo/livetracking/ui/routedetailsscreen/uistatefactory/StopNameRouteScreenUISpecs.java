package app.chalo.livetracking.ui.routedetailsscreen.uistatefactory;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/StopNameRouteScreenUISpecs;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StopNameRouteScreenUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f4956a;
    public final ChaloPadding b;

    public StopNameRouteScreenUISpecs(float f) {
        ChaloPadding chaloPadding = new ChaloPadding(0.0f, ChaloThemeHelper.a().f, ChaloThemeHelper.a().W, 0.0f, 9);
        this.f4956a = f;
        this.b = chaloPadding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StopNameRouteScreenUISpecs)) {
            return false;
        }
        StopNameRouteScreenUISpecs stopNameRouteScreenUISpecs = (StopNameRouteScreenUISpecs) obj;
        return Float.compare(this.f4956a, stopNameRouteScreenUISpecs.f4956a) == 0 && Intrinsics.d(this.b, stopNameRouteScreenUISpecs.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.floatToIntBits(this.f4956a) * 31);
    }

    public final String toString() {
        return "StopNameRouteScreenUISpecs(alpha=" + this.f4956a + ", padding=" + this.b + ")";
    }
}
