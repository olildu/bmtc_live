package defpackage;

import app.chalo.livetracking.search.StopBasedSearchSelectedLocation;
import app.chalo.livetracking.search.StopBasedTripPlannerSearchBottomSheetType;
import app.chalo.livetracking.search.StopBasedTripPlannerSearchDataState;
import app.chalo.livetracking.stoptripplannerresult.StopBasedTripPlannerResultsBottomSheetType;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerLocationType;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultsDataState;
import app.chalo.recent.model.app.RecentPlaceAppModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ib1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15899a;
    public final /* synthetic */ RecentPlaceAppModel b;

    public /* synthetic */ ib1(int i, RecentPlaceAppModel recentPlaceAppModel) {
        this.f15899a = i;
        this.b = recentPlaceAppModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15899a) {
            case 0:
                StopBasedTripPlannerSearchDataState it = (StopBasedTripPlannerSearchDataState) obj;
                Intrinsics.i(it, "it");
                return StopBasedTripPlannerSearchDataState.a(it, new StopBasedSearchSelectedLocation.AllNearbyStopSelected(this.b), null, null, null, null, false, StopBasedTripPlannerSearchBottomSheetType.None.f4487a, null, null, null, 1918);
            case 1:
                StopBasedTripPlannerSearchDataState it2 = (StopBasedTripPlannerSearchDataState) obj;
                Intrinsics.i(it2, "it");
                return StopBasedTripPlannerSearchDataState.a(it2, null, new StopBasedSearchSelectedLocation.AllNearbyStopSelected(this.b), null, null, null, false, StopBasedTripPlannerSearchBottomSheetType.None.f4487a, null, null, null, 1917);
            case 2:
                StopBasedTripPlannerSearchDataState it3 = (StopBasedTripPlannerSearchDataState) obj;
                Intrinsics.i(it3, "it");
                return StopBasedTripPlannerSearchDataState.a(it3, new StopBasedSearchSelectedLocation.AllNearbyStopSelected(this.b), null, null, null, null, false, null, null, null, null, 1982);
            case 3:
                StopBasedTripPlannerSearchDataState it4 = (StopBasedTripPlannerSearchDataState) obj;
                Intrinsics.i(it4, "it");
                return StopBasedTripPlannerSearchDataState.a(it4, null, new StopBasedSearchSelectedLocation.AllNearbyStopSelected(this.b), null, null, null, false, null, null, null, null, 1981);
            case 4:
                StopBasedTripPlannerSearchDataState it5 = (StopBasedTripPlannerSearchDataState) obj;
                Intrinsics.i(it5, "it");
                RecentPlaceAppModel recentPlaceAppModel = this.b;
                return StopBasedTripPlannerSearchDataState.a(it5, new StopBasedSearchSelectedLocation.PlaceSelected(recentPlaceAppModel), null, null, null, null, false, null, recentPlaceAppModel, null, null, 1790);
            case 5:
                StopBasedTripPlannerSearchDataState it6 = (StopBasedTripPlannerSearchDataState) obj;
                Intrinsics.i(it6, "it");
                RecentPlaceAppModel recentPlaceAppModel2 = this.b;
                return StopBasedTripPlannerSearchDataState.a(it6, null, new StopBasedSearchSelectedLocation.PlaceSelected(recentPlaceAppModel2), null, null, null, false, null, null, recentPlaceAppModel2, null, 1533);
            case 6:
                StopTripPlannerResultsDataState it7 = (StopTripPlannerResultsDataState) obj;
                Intrinsics.i(it7, "it");
                return StopTripPlannerResultsDataState.a(it7, null, null, null, null, null, null, null, null, null, null, new StopBasedTripPlannerResultsBottomSheetType.NoNearestStops(this.b), false, null, false, null, false, null, 511999);
            case 7:
                StopTripPlannerResultsDataState it8 = (StopTripPlannerResultsDataState) obj;
                Intrinsics.i(it8, "it");
                return StopTripPlannerResultsDataState.a(it8, null, null, new StopTripPlannerLocationType.AllNearbyStopSelected(this.b), null, null, null, null, null, null, null, StopBasedTripPlannerResultsBottomSheetType.None.f4528a, false, null, false, null, false, null, 487307);
            case 8:
                StopTripPlannerResultsDataState it9 = (StopTripPlannerResultsDataState) obj;
                Intrinsics.i(it9, "it");
                return StopTripPlannerResultsDataState.a(it9, null, null, null, new StopTripPlannerLocationType.AllNearbyStopSelected(this.b), null, null, null, null, null, null, StopBasedTripPlannerResultsBottomSheetType.None.f4528a, false, null, false, null, false, null, 487303);
            default:
                StopTripPlannerResultsDataState it10 = (StopTripPlannerResultsDataState) obj;
                Intrinsics.i(it10, "it");
                return StopTripPlannerResultsDataState.a(it10, null, null, null, null, null, null, null, null, null, null, new StopBasedTripPlannerResultsBottomSheetType.NearestStopFetchError(this.b), false, null, false, null, false, null, 511999);
        }
    }
}
