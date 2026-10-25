package app.chalo.livetracking.stoptripplannerresult;

import app.chalo.livetracking.search.StopBasedSearchSelectedLocation;
import app.chalo.recent.model.app.RecentLocationPairEndpointAppModel;
import app.chalo.recent.model.app.RecentsAppModelKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class StopTripPlannerResultsContractKt {
    public static final StopBasedSearchSelectedLocation a(StopTripPlannerLocationType stopTripPlannerLocationType) {
        Intrinsics.i(stopTripPlannerLocationType, "<this>");
        if (stopTripPlannerLocationType instanceof StopTripPlannerLocationType.AllNearbyStopSelected) {
            return new StopBasedSearchSelectedLocation.AllNearbyStopSelected(((StopTripPlannerLocationType.AllNearbyStopSelected) stopTripPlannerLocationType).c);
        }
        if (stopTripPlannerLocationType instanceof StopTripPlannerLocationType.NearestStopToPlaceSelected) {
            StopTripPlannerLocationType.NearestStopToPlaceSelected nearestStopToPlaceSelected = (StopTripPlannerLocationType.NearestStopToPlaceSelected) stopTripPlannerLocationType;
            return new StopBasedSearchSelectedLocation.NearestStopToPlaceSelected(nearestStopToPlaceSelected.c, nearestStopToPlaceSelected.d);
        }
        if (stopTripPlannerLocationType instanceof StopTripPlannerLocationType.Stop) {
            return new StopBasedSearchSelectedLocation.StopSelected(((StopTripPlannerLocationType.Stop) stopTripPlannerLocationType).c);
        }
        if (stopTripPlannerLocationType instanceof StopTripPlannerLocationType.None) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final StopTripPlannerLocationType b(RecentLocationPairEndpointAppModel recentLocationPairEndpointAppModel) {
        Intrinsics.i(recentLocationPairEndpointAppModel, "<this>");
        if (recentLocationPairEndpointAppModel instanceof RecentLocationPairEndpointAppModel.NearbyStopToPlace) {
            RecentLocationPairEndpointAppModel.NearbyStopToPlace nearbyStopToPlace = (RecentLocationPairEndpointAppModel.NearbyStopToPlace) recentLocationPairEndpointAppModel;
            return new StopTripPlannerLocationType.NearestStopToPlaceSelected(RecentsAppModelKt.c(nearbyStopToPlace), nearbyStopToPlace.c, null);
        }
        if (recentLocationPairEndpointAppModel instanceof RecentLocationPairEndpointAppModel.Place) {
            return new StopTripPlannerLocationType.AllNearbyStopSelected(((RecentLocationPairEndpointAppModel.Place) recentLocationPairEndpointAppModel).b);
        }
        if (recentLocationPairEndpointAppModel instanceof RecentLocationPairEndpointAppModel.Stop) {
            return new StopTripPlannerLocationType.Stop(((RecentLocationPairEndpointAppModel.Stop) recentLocationPairEndpointAppModel).b);
        }
        throw new NoWhenBranchMatchedException();
    }
}
