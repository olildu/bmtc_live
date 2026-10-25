package app.chalo.livetracking.search;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.citydata.data.model.app.response.NearbyStopToLocationAppModel;
import app.chalo.recent.model.app.RecentLocationPairAppModel;
import app.chalo.recent.model.app.RecentPlaceAppModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lapp/chalo/livetracking/search/StopBasedTripPlannerSearchViewIntent;", "", "InitialisationIntent", "OnFromLocationClick", "OnToLocationClick", "OnSwapButtonClick", "OnRecentTripClicked", "BottomSheetCloseClickedIntent", "OnNearestStopSelected", "OnShowAllNearbyStopsClick", "OnStopSearchResult", "OnPlaceSearchResult", "RetryNearestStopFetchIntent", "Lapp/chalo/livetracking/search/StopBasedTripPlannerSearchViewIntent$BottomSheetCloseClickedIntent;", "Lapp/chalo/livetracking/search/StopBasedTripPlannerSearchViewIntent$InitialisationIntent;", "Lapp/chalo/livetracking/search/StopBasedTripPlannerSearchViewIntent$OnFromLocationClick;", "Lapp/chalo/livetracking/search/StopBasedTripPlannerSearchViewIntent$OnNearestStopSelected;", "Lapp/chalo/livetracking/search/StopBasedTripPlannerSearchViewIntent$OnPlaceSearchResult;", "Lapp/chalo/livetracking/search/StopBasedTripPlannerSearchViewIntent$OnRecentTripClicked;", "Lapp/chalo/livetracking/search/StopBasedTripPlannerSearchViewIntent$OnShowAllNearbyStopsClick;", "Lapp/chalo/livetracking/search/StopBasedTripPlannerSearchViewIntent$OnStopSearchResult;", "Lapp/chalo/livetracking/search/StopBasedTripPlannerSearchViewIntent$OnSwapButtonClick;", "Lapp/chalo/livetracking/search/StopBasedTripPlannerSearchViewIntent$OnToLocationClick;", "Lapp/chalo/livetracking/search/StopBasedTripPlannerSearchViewIntent$RetryNearestStopFetchIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class StopBasedTripPlannerSearchViewIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/search/StopBasedTripPlannerSearchViewIntent$BottomSheetCloseClickedIntent;", "Lapp/chalo/livetracking/search/StopBasedTripPlannerSearchViewIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BottomSheetCloseClickedIntent extends StopBasedTripPlannerSearchViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BottomSheetCloseClickedIntent f4491a = new BottomSheetCloseClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/search/StopBasedTripPlannerSearchViewIntent$InitialisationIntent;", "Lapp/chalo/livetracking/search/StopBasedTripPlannerSearchViewIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitialisationIntent extends StopBasedTripPlannerSearchViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StopBasedSearchScreenData f4492a;

        public InitialisationIntent(StopBasedSearchScreenData stopBasedSearchScreenData) {
            this.f4492a = stopBasedSearchScreenData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitialisationIntent) && Intrinsics.d(this.f4492a, ((InitialisationIntent) obj).f4492a);
        }

        public final int hashCode() {
            StopBasedSearchScreenData stopBasedSearchScreenData = this.f4492a;
            if (stopBasedSearchScreenData == null) {
                return 0;
            }
            return stopBasedSearchScreenData.hashCode();
        }

        public final String toString() {
            return "InitialisationIntent(screenData=" + this.f4492a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/search/StopBasedTripPlannerSearchViewIntent$OnFromLocationClick;", "Lapp/chalo/livetracking/search/StopBasedTripPlannerSearchViewIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnFromLocationClick extends StopBasedTripPlannerSearchViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnFromLocationClick f4493a = new OnFromLocationClick();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/search/StopBasedTripPlannerSearchViewIntent$OnNearestStopSelected;", "Lapp/chalo/livetracking/search/StopBasedTripPlannerSearchViewIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnNearestStopSelected extends StopBasedTripPlannerSearchViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NearbyStopToLocationAppModel f4494a;

        public OnNearestStopSelected(NearbyStopToLocationAppModel stop) {
            Intrinsics.i(stop, "stop");
            this.f4494a = stop;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnNearestStopSelected) && Intrinsics.d(this.f4494a, ((OnNearestStopSelected) obj).f4494a);
        }

        public final int hashCode() {
            return this.f4494a.hashCode();
        }

        public final String toString() {
            return "OnNearestStopSelected(stop=" + this.f4494a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/search/StopBasedTripPlannerSearchViewIntent$OnPlaceSearchResult;", "Lapp/chalo/livetracking/search/StopBasedTripPlannerSearchViewIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnPlaceSearchResult extends StopBasedTripPlannerSearchViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RecentPlaceAppModel f4495a;

        public OnPlaceSearchResult(RecentPlaceAppModel recentPlaceAppModel) {
            this.f4495a = recentPlaceAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnPlaceSearchResult) && Intrinsics.d(this.f4495a, ((OnPlaceSearchResult) obj).f4495a);
        }

        public final int hashCode() {
            return this.f4495a.hashCode();
        }

        public final String toString() {
            return "OnPlaceSearchResult(selectedPlace=" + this.f4495a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/search/StopBasedTripPlannerSearchViewIntent$OnRecentTripClicked;", "Lapp/chalo/livetracking/search/StopBasedTripPlannerSearchViewIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnRecentTripClicked extends StopBasedTripPlannerSearchViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RecentLocationPairAppModel f4496a;

        public OnRecentTripClicked(RecentLocationPairAppModel recentTrip) {
            Intrinsics.i(recentTrip, "recentTrip");
            this.f4496a = recentTrip;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnRecentTripClicked) && Intrinsics.d(this.f4496a, ((OnRecentTripClicked) obj).f4496a);
        }

        public final int hashCode() {
            return this.f4496a.hashCode();
        }

        public final String toString() {
            return "OnRecentTripClicked(recentTrip=" + this.f4496a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/search/StopBasedTripPlannerSearchViewIntent$OnShowAllNearbyStopsClick;", "Lapp/chalo/livetracking/search/StopBasedTripPlannerSearchViewIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnShowAllNearbyStopsClick extends StopBasedTripPlannerSearchViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnShowAllNearbyStopsClick f4497a = new OnShowAllNearbyStopsClick();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/search/StopBasedTripPlannerSearchViewIntent$OnStopSearchResult;", "Lapp/chalo/livetracking/search/StopBasedTripPlannerSearchViewIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnStopSearchResult extends StopBasedTripPlannerSearchViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StopAppModel f4498a;

        public OnStopSearchResult(StopAppModel stopAppModel) {
            this.f4498a = stopAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnStopSearchResult) && Intrinsics.d(this.f4498a, ((OnStopSearchResult) obj).f4498a);
        }

        public final int hashCode() {
            return this.f4498a.hashCode();
        }

        public final String toString() {
            return "OnStopSearchResult(selectedStop=" + this.f4498a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/search/StopBasedTripPlannerSearchViewIntent$OnSwapButtonClick;", "Lapp/chalo/livetracking/search/StopBasedTripPlannerSearchViewIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnSwapButtonClick extends StopBasedTripPlannerSearchViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnSwapButtonClick f4499a = new OnSwapButtonClick();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/search/StopBasedTripPlannerSearchViewIntent$OnToLocationClick;", "Lapp/chalo/livetracking/search/StopBasedTripPlannerSearchViewIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnToLocationClick extends StopBasedTripPlannerSearchViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnToLocationClick f4500a = new OnToLocationClick();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/search/StopBasedTripPlannerSearchViewIntent$RetryNearestStopFetchIntent;", "Lapp/chalo/livetracking/search/StopBasedTripPlannerSearchViewIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RetryNearestStopFetchIntent extends StopBasedTripPlannerSearchViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RecentPlaceAppModel f4501a;

        public RetryNearestStopFetchIntent(RecentPlaceAppModel currentPlace) {
            Intrinsics.i(currentPlace, "currentPlace");
            this.f4501a = currentPlace;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RetryNearestStopFetchIntent) && Intrinsics.d(this.f4501a, ((RetryNearestStopFetchIntent) obj).f4501a);
        }

        public final int hashCode() {
            return this.f4501a.hashCode();
        }

        public final String toString() {
            return "RetryNearestStopFetchIntent(currentPlace=" + this.f4501a + ")";
        }
    }
}
