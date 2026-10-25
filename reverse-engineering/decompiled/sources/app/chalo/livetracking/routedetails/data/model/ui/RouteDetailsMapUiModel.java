package app.chalo.livetracking.routedetails.data.model.ui;

import app.chalo.compose.components.chalomap.MapCameraViewState;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/data/model/ui/RouteDetailsMapUiModel;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteDetailsMapUiModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4408a;
    public final boolean b;
    public final MapCameraViewState c;

    public RouteDetailsMapUiModel(List mapStopsPolylineDetails, boolean z, MapCameraViewState mapCameraViewState) {
        Intrinsics.i(mapStopsPolylineDetails, "mapStopsPolylineDetails");
        this.f4408a = mapStopsPolylineDetails;
        this.b = z;
        this.c = mapCameraViewState;
    }

    public static RouteDetailsMapUiModel a(RouteDetailsMapUiModel routeDetailsMapUiModel, List mapStopsPolylineDetails, boolean z, MapCameraViewState mapCameraViewState, int i) {
        if ((i & 1) != 0) {
            mapStopsPolylineDetails = routeDetailsMapUiModel.f4408a;
        }
        if ((i & 2) != 0) {
            z = routeDetailsMapUiModel.b;
        }
        if ((i & 4) != 0) {
            mapCameraViewState = routeDetailsMapUiModel.c;
        }
        routeDetailsMapUiModel.getClass();
        Intrinsics.i(mapStopsPolylineDetails, "mapStopsPolylineDetails");
        return new RouteDetailsMapUiModel(mapStopsPolylineDetails, z, mapCameraViewState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteDetailsMapUiModel)) {
            return false;
        }
        RouteDetailsMapUiModel routeDetailsMapUiModel = (RouteDetailsMapUiModel) obj;
        return Intrinsics.d(this.f4408a, routeDetailsMapUiModel.f4408a) && this.b == routeDetailsMapUiModel.b && Intrinsics.d(this.c, routeDetailsMapUiModel.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.f4408a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "RouteDetailsMapUiModel(mapStopsPolylineDetails=" + this.f4408a + ", isLocationEnabled=" + this.b + ", mapCameraViewState=" + this.c + ")";
    }
}
