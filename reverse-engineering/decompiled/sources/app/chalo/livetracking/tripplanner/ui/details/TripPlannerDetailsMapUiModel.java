package app.chalo.livetracking.tripplanner.ui.details;

import app.chalo.compose.components.chalomap.MapCameraViewState;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/details/TripPlannerDetailsMapUiModel;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TripPlannerDetailsMapUiModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4738a;
    public final boolean b;
    public final MapCameraViewState c;

    public TripPlannerDetailsMapUiModel(List mapStopsPolylineDetails, boolean z, MapCameraViewState mapCameraViewState) {
        Intrinsics.i(mapStopsPolylineDetails, "mapStopsPolylineDetails");
        this.f4738a = mapStopsPolylineDetails;
        this.b = z;
        this.c = mapCameraViewState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TripPlannerDetailsMapUiModel)) {
            return false;
        }
        TripPlannerDetailsMapUiModel tripPlannerDetailsMapUiModel = (TripPlannerDetailsMapUiModel) obj;
        return Intrinsics.d(this.f4738a, tripPlannerDetailsMapUiModel.f4738a) && this.b == tripPlannerDetailsMapUiModel.b && Intrinsics.d(this.c, tripPlannerDetailsMapUiModel.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.f4738a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "TripPlannerDetailsMapUiModel(mapStopsPolylineDetails=" + this.f4738a + ", isLocationEnabled=" + this.b + ", mapCameraViewState=" + this.c + ")";
    }
}
