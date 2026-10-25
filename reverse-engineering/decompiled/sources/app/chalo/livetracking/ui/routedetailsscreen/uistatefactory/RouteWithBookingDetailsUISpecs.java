package app.chalo.livetracking.ui.routedetailsscreen.uistatefactory;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/RouteWithBookingDetailsUISpecs;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteWithBookingDetailsUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f4944a = new ChaloPadding(0.0f, 0.0f, ChaloThemeHelper.a().h, 0.0f, 11);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RouteWithBookingDetailsUISpecs) && Intrinsics.d(this.f4944a, ((RouteWithBookingDetailsUISpecs) obj).f4944a);
    }

    public final int hashCode() {
        return this.f4944a.hashCode();
    }

    public final String toString() {
        return "RouteWithBookingDetailsUISpecs(paddingAroundRouteName=" + this.f4944a + ")";
    }
}
