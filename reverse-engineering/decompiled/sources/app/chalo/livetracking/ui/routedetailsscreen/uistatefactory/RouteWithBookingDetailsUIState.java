package app.chalo.livetracking.ui.routedetailsscreen.uistatefactory;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/RouteWithBookingDetailsUIState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteWithBookingDetailsUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RouteNameAndSchemeDetailsUIState f4945a;
    public final RouteDetailsOptionsUIState b;
    public final RouteWithBookingDetailsUISpecs c;

    public RouteWithBookingDetailsUIState(RouteNameAndSchemeDetailsUIState routeName, RouteDetailsOptionsUIState options) {
        RouteWithBookingDetailsUISpecs routeWithBookingDetailsUISpecs = new RouteWithBookingDetailsUISpecs();
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(options, "options");
        this.f4945a = routeName;
        this.b = options;
        this.c = routeWithBookingDetailsUISpecs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteWithBookingDetailsUIState)) {
            return false;
        }
        RouteWithBookingDetailsUIState routeWithBookingDetailsUIState = (RouteWithBookingDetailsUIState) obj;
        return Intrinsics.d(this.f4945a, routeWithBookingDetailsUIState.f4945a) && Intrinsics.d(this.b, routeWithBookingDetailsUIState.b) && Intrinsics.d(this.c, routeWithBookingDetailsUIState.c);
    }

    public final int hashCode() {
        return this.c.f4944a.hashCode() + ((this.b.hashCode() + (this.f4945a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "RouteWithBookingDetailsUIState(routeName=" + this.f4945a + ", options=" + this.b + ", specs=" + this.c + ")";
    }
}
