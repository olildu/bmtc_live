package app.chalo.livetracking.ui.routedetailsscreen.uistatefactory;

import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/RouteUserDestinationStopUIState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteUserDestinationStopUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState f4943a;
    public final TextUIState.ChaloTextUIState b;
    public final RouteUserDestinationStopUISpecs c;

    public RouteUserDestinationStopUIState(TextUIState destination, TextUIState.ChaloTextUIState chaloTextUIState) {
        RouteUserDestinationStopUISpecs routeUserDestinationStopUISpecs = new RouteUserDestinationStopUISpecs();
        Intrinsics.i(destination, "destination");
        this.f4943a = destination;
        this.b = chaloTextUIState;
        this.c = routeUserDestinationStopUISpecs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteUserDestinationStopUIState)) {
            return false;
        }
        RouteUserDestinationStopUIState routeUserDestinationStopUIState = (RouteUserDestinationStopUIState) obj;
        return Intrinsics.d(this.f4943a, routeUserDestinationStopUIState.f4943a) && Intrinsics.d(this.b, routeUserDestinationStopUIState.b) && Intrinsics.d(this.c, routeUserDestinationStopUIState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + r30.f(this.b, this.f4943a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "RouteUserDestinationStopUIState(destination=" + this.f4943a + ", changeDestination=" + this.b + ", specs=" + this.c + ")";
    }
}
