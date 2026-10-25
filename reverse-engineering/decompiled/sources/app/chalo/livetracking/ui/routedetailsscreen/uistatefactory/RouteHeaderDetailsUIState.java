package app.chalo.livetracking.ui.routedetailsscreen.uistatefactory;

import app.chalo.uistate.text.SpecialFeaturesTagListUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/RouteHeaderDetailsUIState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteHeaderDetailsUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SpecialFeaturesTagListUIState f4931a;
    public final RouteWithBookingDetailsUIState b;
    public final RouteUserDestinationStopUIState c;
    public final RouteHeaderDetailsUISpecs d;

    public RouteHeaderDetailsUIState(SpecialFeaturesTagListUIState specialFeaturesTagListUIState, RouteWithBookingDetailsUIState routeDetails, RouteUserDestinationStopUIState routeUserDestinationStopUIState, RouteHeaderDetailsUISpecs routeHeaderDetailsUISpecs) {
        Intrinsics.i(routeDetails, "routeDetails");
        this.f4931a = specialFeaturesTagListUIState;
        this.b = routeDetails;
        this.c = routeUserDestinationStopUIState;
        this.d = routeHeaderDetailsUISpecs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteHeaderDetailsUIState)) {
            return false;
        }
        RouteHeaderDetailsUIState routeHeaderDetailsUIState = (RouteHeaderDetailsUIState) obj;
        return Intrinsics.d(this.f4931a, routeHeaderDetailsUIState.f4931a) && Intrinsics.d(this.b, routeHeaderDetailsUIState.b) && Intrinsics.d(this.c, routeHeaderDetailsUIState.c) && Intrinsics.d(this.d, routeHeaderDetailsUIState.d);
    }

    public final int hashCode() {
        SpecialFeaturesTagListUIState specialFeaturesTagListUIState = this.f4931a;
        int iHashCode = (this.b.hashCode() + ((specialFeaturesTagListUIState == null ? 0 : specialFeaturesTagListUIState.hashCode()) * 31)) * 31;
        RouteUserDestinationStopUIState routeUserDestinationStopUIState = this.c;
        return this.d.hashCode() + ((iHashCode + (routeUserDestinationStopUIState != null ? routeUserDestinationStopUIState.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "RouteHeaderDetailsUIState(specialFeatures=" + this.f4931a + ", routeDetails=" + this.b + ", userDestinationStop=" + this.c + ", specs=" + this.d + ")";
    }
}
