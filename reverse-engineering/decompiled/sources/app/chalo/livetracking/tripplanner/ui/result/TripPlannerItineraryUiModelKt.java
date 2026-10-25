package app.chalo.livetracking.tripplanner.ui.result;

import app.chalo.providers.iconassetprovider.IconType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TripPlannerItineraryUiModelKt {
    public static final IconType a(TripPlannerLegUiModel tripPlannerLegUiModel) {
        Intrinsics.i(tripPlannerLegUiModel, "<this>");
        if (tripPlannerLegUiModel instanceof TripPlannerLegUiModel.Auto) {
            return IconType.AUTO_TRIP_PLANNER;
        }
        if (tripPlannerLegUiModel instanceof TripPlannerLegUiModel.Bus) {
            return IconType.BUS_TRIP_PLANNER;
        }
        if (tripPlannerLegUiModel.equals(TripPlannerLegUiModel.Ferry.f4756a)) {
            return IconType.FERRY_TRIP_PLANNER;
        }
        if (tripPlannerLegUiModel instanceof TripPlannerLegUiModel.Metro) {
            return IconType.METRO_TRIP_PLANNER;
        }
        if (tripPlannerLegUiModel.equals(TripPlannerLegUiModel.MonoRail.f4758a)) {
            return IconType.MONORAIL_TRIP_PLANNER;
        }
        if (tripPlannerLegUiModel.equals(TripPlannerLegUiModel.Railway.f4759a)) {
            return IconType.TRAIN_TRIP_PLANNER;
        }
        if (tripPlannerLegUiModel instanceof TripPlannerLegUiModel.Taxi) {
            return IconType.CAB_TRIP_PLANNER;
        }
        if (tripPlannerLegUiModel instanceof TripPlannerLegUiModel.Walk) {
            return IconType.WALK_TRIP_PLANNER;
        }
        throw new NoWhenBranchMatchedException();
    }
}
