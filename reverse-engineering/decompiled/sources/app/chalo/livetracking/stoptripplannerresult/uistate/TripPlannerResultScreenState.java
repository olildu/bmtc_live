package app.chalo.livetracking.stoptripplannerresult.uistate;

import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.error.StandardErrorScreenUIState;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/TripPlannerResultScreenState;", "", "Loading", "Error", "NoResults", "Results", "Lapp/chalo/livetracking/stoptripplannerresult/uistate/TripPlannerResultScreenState$Error;", "Lapp/chalo/livetracking/stoptripplannerresult/uistate/TripPlannerResultScreenState$Loading;", "Lapp/chalo/livetracking/stoptripplannerresult/uistate/TripPlannerResultScreenState$NoResults;", "Lapp/chalo/livetracking/stoptripplannerresult/uistate/TripPlannerResultScreenState$Results;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class TripPlannerResultScreenState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/TripPlannerResultScreenState$Error;", "Lapp/chalo/livetracking/stoptripplannerresult/uistate/TripPlannerResultScreenState;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Error extends TripPlannerResultScreenState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StandardErrorScreenUIState.ErrorWithMsgAndRetry f4626a;

        public Error(StandardErrorScreenUIState.ErrorWithMsgAndRetry errorWithMsgAndRetry) {
            this.f4626a = errorWithMsgAndRetry;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && Intrinsics.d(this.f4626a, ((Error) obj).f4626a);
        }

        public final int hashCode() {
            return this.f4626a.hashCode();
        }

        public final String toString() {
            return "Error(data=" + this.f4626a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/TripPlannerResultScreenState$Loading;", "Lapp/chalo/livetracking/stoptripplannerresult/uistate/TripPlannerResultScreenState;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Loading extends TripPlannerResultScreenState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StopTripPlannerResultLoadingCardUiState f4627a = new StopTripPlannerResultLoadingCardUiState();

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && Intrinsics.d(this.f4627a, ((Loading) obj).f4627a);
        }

        public final int hashCode() {
            return this.f4627a.hashCode();
        }

        public final String toString() {
            return "Loading(uiSate=" + this.f4627a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/TripPlannerResultScreenState$NoResults;", "Lapp/chalo/livetracking/stoptripplannerresult/uistate/TripPlannerResultScreenState;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NoResults extends TripPlannerResultScreenState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StandardErrorScreenUIState.ErrorWithMsgAndRetry f4628a;

        public NoResults(StandardErrorScreenUIState.ErrorWithMsgAndRetry errorWithMsgAndRetry) {
            this.f4628a = errorWithMsgAndRetry;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NoResults) && Intrinsics.d(this.f4628a, ((NoResults) obj).f4628a);
        }

        public final int hashCode() {
            return this.f4628a.hashCode();
        }

        public final String toString() {
            return "NoResults(data=" + this.f4628a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/TripPlannerResultScreenState$Results;", "Lapp/chalo/livetracking/stoptripplannerresult/uistate/TripPlannerResultScreenState;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Results extends TripPlannerResultScreenState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f4629a;
        public final DividerUIState b;
        public final NearbyStopResultsContainerUiState c;
        public final StandardErrorScreenUIState.ErrorWithMsgAndRetry d;
        public final RefreshNudgeUiState e;

        public Results(List travelItineraryList, DividerUIState dividerUIState, NearbyStopResultsContainerUiState nearbyStopResultsContainerUiState, StandardErrorScreenUIState.ErrorWithMsgAndRetry errorWithMsgAndRetry, RefreshNudgeUiState refreshNudgeUiState) {
            Intrinsics.i(travelItineraryList, "travelItineraryList");
            this.f4629a = travelItineraryList;
            this.b = dividerUIState;
            this.c = nearbyStopResultsContainerUiState;
            this.d = errorWithMsgAndRetry;
            this.e = refreshNudgeUiState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Results)) {
                return false;
            }
            Results results = (Results) obj;
            return Intrinsics.d(this.f4629a, results.f4629a) && Intrinsics.d(this.b, results.b) && Intrinsics.d(this.c, results.c) && Intrinsics.d(this.d, results.d) && Intrinsics.d(this.e, results.e);
        }

        public final int hashCode() {
            int iHashCode = this.f4629a.hashCode() * 31;
            DividerUIState dividerUIState = this.b;
            int iHashCode2 = (iHashCode + (dividerUIState == null ? 0 : dividerUIState.hashCode())) * 31;
            NearbyStopResultsContainerUiState nearbyStopResultsContainerUiState = this.c;
            int iHashCode3 = (iHashCode2 + (nearbyStopResultsContainerUiState == null ? 0 : nearbyStopResultsContainerUiState.hashCode())) * 31;
            StandardErrorScreenUIState.ErrorWithMsgAndRetry errorWithMsgAndRetry = this.d;
            int iHashCode4 = (iHashCode3 + (errorWithMsgAndRetry == null ? 0 : errorWithMsgAndRetry.hashCode())) * 31;
            RefreshNudgeUiState refreshNudgeUiState = this.e;
            return iHashCode4 + (refreshNudgeUiState != null ? refreshNudgeUiState.hashCode() : 0);
        }

        public final String toString() {
            return "Results(travelItineraryList=" + this.f4629a + ", nearbyStopResultsSectionDividerUIState=" + this.b + ", nearbyStopResultsUiState=" + this.c + ", noResultsForSearchUiState=" + this.d + ", refreshNudgeUiState=" + this.e + ")";
        }
    }
}
