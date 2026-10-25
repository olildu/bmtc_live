package app.chalo.premiumbus.prebookedtickets.ui.newactivation.livetrackinghandler;

import app.chalo.compose.components.chalomap.MapCameraViewState;
import defpackage.dd;
import defpackage.r30;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/livetrackinghandler/PremiumBusLiveTrackingState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusLiveTrackingState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7408a;
    public final List b;
    public final PremiumBusStopMarkerUIState c;
    public final PremiumBusStopMarkerUIState d;
    public final List e;
    public final List f;
    public final MapCameraViewState g;

    public PremiumBusLiveTrackingState(List routePolylinePoints, List stopMarkerList, PremiumBusStopMarkerUIState premiumBusStopMarkerUIState, PremiumBusStopMarkerUIState premiumBusStopMarkerUIState2, List liveVehicleMarker, List trafficSignalMarkerList, MapCameraViewState mapCameraViewState) {
        Intrinsics.i(routePolylinePoints, "routePolylinePoints");
        Intrinsics.i(stopMarkerList, "stopMarkerList");
        Intrinsics.i(liveVehicleMarker, "liveVehicleMarker");
        Intrinsics.i(trafficSignalMarkerList, "trafficSignalMarkerList");
        this.f7408a = routePolylinePoints;
        this.b = stopMarkerList;
        this.c = premiumBusStopMarkerUIState;
        this.d = premiumBusStopMarkerUIState2;
        this.e = liveVehicleMarker;
        this.f = trafficSignalMarkerList;
        this.g = mapCameraViewState;
    }

    public static PremiumBusLiveTrackingState a(PremiumBusLiveTrackingState premiumBusLiveTrackingState, List list, ArrayList arrayList, List list2, List list3, MapCameraViewState mapCameraViewState, int i) {
        if ((i & 1) != 0) {
            list = premiumBusLiveTrackingState.f7408a;
        }
        List routePolylinePoints = list;
        List list4 = arrayList;
        if ((i & 2) != 0) {
            list4 = premiumBusLiveTrackingState.b;
        }
        List stopMarkerList = list4;
        PremiumBusStopMarkerUIState premiumBusStopMarkerUIState = premiumBusLiveTrackingState.c;
        PremiumBusStopMarkerUIState premiumBusStopMarkerUIState2 = premiumBusLiveTrackingState.d;
        if ((i & 16) != 0) {
            list2 = premiumBusLiveTrackingState.e;
        }
        List liveVehicleMarker = list2;
        if ((i & 32) != 0) {
            list3 = premiumBusLiveTrackingState.f;
        }
        List trafficSignalMarkerList = list3;
        if ((i & 64) != 0) {
            mapCameraViewState = premiumBusLiveTrackingState.g;
        }
        MapCameraViewState mapCameraViewState2 = mapCameraViewState;
        premiumBusLiveTrackingState.getClass();
        Intrinsics.i(routePolylinePoints, "routePolylinePoints");
        Intrinsics.i(stopMarkerList, "stopMarkerList");
        Intrinsics.i(liveVehicleMarker, "liveVehicleMarker");
        Intrinsics.i(trafficSignalMarkerList, "trafficSignalMarkerList");
        Intrinsics.i(mapCameraViewState2, "mapCameraViewState");
        return new PremiumBusLiveTrackingState(routePolylinePoints, stopMarkerList, premiumBusStopMarkerUIState, premiumBusStopMarkerUIState2, liveVehicleMarker, trafficSignalMarkerList, mapCameraViewState2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusLiveTrackingState)) {
            return false;
        }
        PremiumBusLiveTrackingState premiumBusLiveTrackingState = (PremiumBusLiveTrackingState) obj;
        return Intrinsics.d(this.f7408a, premiumBusLiveTrackingState.f7408a) && Intrinsics.d(this.b, premiumBusLiveTrackingState.b) && Intrinsics.d(this.c, premiumBusLiveTrackingState.c) && Intrinsics.d(this.d, premiumBusLiveTrackingState.d) && Intrinsics.d(this.e, premiumBusLiveTrackingState.e) && Intrinsics.d(this.f, premiumBusLiveTrackingState.f) && Intrinsics.d(this.g, premiumBusLiveTrackingState.g);
    }

    public final int hashCode() {
        int iB = r30.b(this.f7408a.hashCode() * 31, 31, this.b);
        PremiumBusStopMarkerUIState premiumBusStopMarkerUIState = this.c;
        int iHashCode = (iB + (premiumBusStopMarkerUIState == null ? 0 : premiumBusStopMarkerUIState.hashCode())) * 31;
        PremiumBusStopMarkerUIState premiumBusStopMarkerUIState2 = this.d;
        return this.g.hashCode() + r30.b(r30.b((iHashCode + (premiumBusStopMarkerUIState2 != null ? premiumBusStopMarkerUIState2.hashCode() : 0)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PremiumBusLiveTrackingState(routePolylinePoints=");
        sb.append(this.f7408a);
        sb.append(", stopMarkerList=");
        sb.append(this.b);
        sb.append(", pickupStopMarker=");
        sb.append(this.c);
        sb.append(", dropStopMarker=");
        sb.append(this.d);
        sb.append(", liveVehicleMarker=");
        dd.o(sb, this.e, ", trafficSignalMarkerList=", this.f, ", mapCameraViewState=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }

    public PremiumBusLiveTrackingState(List list, List list2, PremiumBusStopMarkerUIState premiumBusStopMarkerUIState, List list3, MapCameraViewState.InitialState.CustomPosition customPosition, int i) {
        this((i & 1) != 0 ? EmptyList.f17557a : list, (i & 2) != 0 ? EmptyList.f17557a : list2, (i & 4) != 0 ? null : premiumBusStopMarkerUIState, null, (i & 16) != 0 ? EmptyList.f17557a : list3, EmptyList.f17557a, customPosition);
    }
}
