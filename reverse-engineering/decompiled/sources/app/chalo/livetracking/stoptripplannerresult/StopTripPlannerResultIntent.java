package app.chalo.livetracking.stoptripplannerresult;

import app.chalo.citydata.data.model.app.response.NearbyStopToLocationAppModel;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerItineraryAppResponseModel;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel;
import app.chalo.recent.model.app.RecentPlaceAppModel;
import defpackage.b3;
import defpackage.cb0;
import defpackage.vo1;
import defpackage.xs;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0017\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0082\u0001\u0017\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./¨\u00060"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent;", "", "InitializationIntent", "ResultTypeTabClickedIntent", "SearchStopUpdateFieldClickedIntent", "FragmentStartedIntent", "FragmentStoppedIntent", "ItineraryLegClickedIntent", "OnTrackBusClicked", "OnTrackingNotAvailableViewDetailsClicked", "LiveTrackingNotAvailableBottomSheetNegativeButtonClick", "LiveTrackingNotAvailableBottomSheetPositiveButtonClick", "ItineraryMoreDetailsClickedIntent", "OnTryAgainClick", "OnStepCountClicked", "OnSwapButtonClick", "OnBackPressed", "BottomSheetCloseClickedIntent", "OnNearestStopSelected", "OnShowAllNearbyStopsClick", "NearbyStopBottomSheetSearchClick", "RetryNearbyStopFetchIntent", "NearbyStopsResultsHeaderClickedIntent", "RefreshNudgeClickedIntent", "OnReportProblemClicked", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent$BottomSheetCloseClickedIntent;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent$FragmentStartedIntent;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent$FragmentStoppedIntent;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent$InitializationIntent;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent$ItineraryLegClickedIntent;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent$ItineraryMoreDetailsClickedIntent;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent$LiveTrackingNotAvailableBottomSheetNegativeButtonClick;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent$LiveTrackingNotAvailableBottomSheetPositiveButtonClick;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent$NearbyStopBottomSheetSearchClick;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent$NearbyStopsResultsHeaderClickedIntent;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent$OnBackPressed;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent$OnNearestStopSelected;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent$OnReportProblemClicked;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent$OnShowAllNearbyStopsClick;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent$OnStepCountClicked;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent$OnSwapButtonClick;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent$OnTrackBusClicked;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent$OnTrackingNotAvailableViewDetailsClicked;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent$OnTryAgainClick;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent$RefreshNudgeClickedIntent;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent$ResultTypeTabClickedIntent;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent$RetryNearbyStopFetchIntent;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent$SearchStopUpdateFieldClickedIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class StopTripPlannerResultIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent$BottomSheetCloseClickedIntent;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BottomSheetCloseClickedIntent extends StopTripPlannerResultIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BottomSheetCloseClickedIntent f4535a = new BottomSheetCloseClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent$FragmentStartedIntent;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FragmentStartedIntent extends StopTripPlannerResultIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FragmentStartedIntent f4536a = new FragmentStartedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent$FragmentStoppedIntent;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FragmentStoppedIntent extends StopTripPlannerResultIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FragmentStoppedIntent f4537a = new FragmentStoppedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent$InitializationIntent;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationIntent extends StopTripPlannerResultIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StopTripPlannerResultScreenData f4538a;

        public InitializationIntent(StopTripPlannerResultScreenData screenData) {
            Intrinsics.i(screenData, "screenData");
            this.f4538a = screenData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitializationIntent) && Intrinsics.d(this.f4538a, ((InitializationIntent) obj).f4538a);
        }

        public final int hashCode() {
            return this.f4538a.hashCode();
        }

        public final String toString() {
            return "InitializationIntent(screenData=" + this.f4538a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent$ItineraryLegClickedIntent;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ItineraryLegClickedIntent extends StopTripPlannerResultIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TripPlannerItineraryAppResponseModel f4539a;
        public final TripPlannerLegAppModel.Bus b;
        public final int c;
        public final Pair d;
        public final Pair e;

        public ItineraryLegClickedIntent(TripPlannerItineraryAppResponseModel itinerary, TripPlannerLegAppModel.Bus bus, int i, Pair pair, Pair pair2) {
            Intrinsics.i(itinerary, "itinerary");
            this.f4539a = itinerary;
            this.b = bus;
            this.c = i;
            this.d = pair;
            this.e = pair2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ItineraryLegClickedIntent)) {
                return false;
            }
            ItineraryLegClickedIntent itineraryLegClickedIntent = (ItineraryLegClickedIntent) obj;
            return Intrinsics.d(this.f4539a, itineraryLegClickedIntent.f4539a) && this.b.equals(itineraryLegClickedIntent.b) && this.c == itineraryLegClickedIntent.c && Intrinsics.d(this.d, itineraryLegClickedIntent.d) && Intrinsics.d(this.e, itineraryLegClickedIntent.e);
        }

        public final int hashCode() {
            int iHashCode = (((this.b.hashCode() + (this.f4539a.hashCode() * 31)) * 31) + this.c) * 31;
            Pair pair = this.d;
            int iHashCode2 = (iHashCode + (pair == null ? 0 : pair.hashCode())) * 31;
            Pair pair2 = this.e;
            return iHashCode2 + (pair2 != null ? pair2.hashCode() : 0);
        }

        public final String toString() {
            return "ItineraryLegClickedIntent(itinerary=" + this.f4539a + ", legAppModel=" + this.b + ", index=" + this.c + ", fromStopDistanceToPlacePair=" + this.d + ", toStopDistanceToPlacePair=" + this.e + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent$ItineraryMoreDetailsClickedIntent;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ItineraryMoreDetailsClickedIntent extends StopTripPlannerResultIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4540a;

        public ItineraryMoreDetailsClickedIntent(String localId) {
            Intrinsics.i(localId, "localId");
            this.f4540a = localId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ItineraryMoreDetailsClickedIntent) && Intrinsics.d(this.f4540a, ((ItineraryMoreDetailsClickedIntent) obj).f4540a);
        }

        public final int hashCode() {
            return this.f4540a.hashCode();
        }

        public final String toString() {
            return vo1.B("ItineraryMoreDetailsClickedIntent(localId=", this.f4540a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent$LiveTrackingNotAvailableBottomSheetNegativeButtonClick;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LiveTrackingNotAvailableBottomSheetNegativeButtonClick extends StopTripPlannerResultIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LiveTrackingNotAvailableBottomSheetNegativeButtonClick f4541a = new LiveTrackingNotAvailableBottomSheetNegativeButtonClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LiveTrackingNotAvailableBottomSheetNegativeButtonClick);
        }

        public final int hashCode() {
            return 1104005029;
        }

        public final String toString() {
            return "LiveTrackingNotAvailableBottomSheetNegativeButtonClick";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent$LiveTrackingNotAvailableBottomSheetPositiveButtonClick;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LiveTrackingNotAvailableBottomSheetPositiveButtonClick extends StopTripPlannerResultIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LiveTrackingNotAvailableBottomSheetPositiveButtonClick f4542a = new LiveTrackingNotAvailableBottomSheetPositiveButtonClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LiveTrackingNotAvailableBottomSheetPositiveButtonClick);
        }

        public final int hashCode() {
            return 1599780705;
        }

        public final String toString() {
            return "LiveTrackingNotAvailableBottomSheetPositiveButtonClick";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent$NearbyStopBottomSheetSearchClick;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NearbyStopBottomSheetSearchClick extends StopTripPlannerResultIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NearbyStopBottomSheetSearchClick f4543a = new NearbyStopBottomSheetSearchClick();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent$NearbyStopsResultsHeaderClickedIntent;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NearbyStopsResultsHeaderClickedIntent extends StopTripPlannerResultIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NearbyStopsResultsHeaderClickedIntent f4544a = new NearbyStopsResultsHeaderClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NearbyStopsResultsHeaderClickedIntent);
        }

        public final int hashCode() {
            return 619094067;
        }

        public final String toString() {
            return "NearbyStopsResultsHeaderClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent$OnBackPressed;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnBackPressed extends StopTripPlannerResultIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnBackPressed f4545a = new OnBackPressed();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent$OnNearestStopSelected;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnNearestStopSelected extends StopTripPlannerResultIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NearbyStopToLocationAppModel f4546a;
        public final RecentPlaceAppModel b;
        public final List c;

        public OnNearestStopSelected(NearbyStopToLocationAppModel stop, RecentPlaceAppModel place, List nearbyStopList) {
            Intrinsics.i(stop, "stop");
            Intrinsics.i(place, "place");
            Intrinsics.i(nearbyStopList, "nearbyStopList");
            this.f4546a = stop;
            this.b = place;
            this.c = nearbyStopList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnNearestStopSelected)) {
                return false;
            }
            OnNearestStopSelected onNearestStopSelected = (OnNearestStopSelected) obj;
            return Intrinsics.d(this.f4546a, onNearestStopSelected.f4546a) && Intrinsics.d(this.b, onNearestStopSelected.b) && Intrinsics.d(this.c, onNearestStopSelected.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.f4546a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnNearestStopSelected(stop=");
            sb.append(this.f4546a);
            sb.append(", place=");
            sb.append(this.b);
            sb.append(", nearbyStopList=");
            return xs.l(sb, this.c, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent$OnReportProblemClicked;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnReportProblemClicked extends StopTripPlannerResultIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnReportProblemClicked f4547a = new OnReportProblemClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnReportProblemClicked);
        }

        public final int hashCode() {
            return 1453512858;
        }

        public final String toString() {
            return "OnReportProblemClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent$OnShowAllNearbyStopsClick;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnShowAllNearbyStopsClick extends StopTripPlannerResultIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RecentPlaceAppModel f4548a;

        public OnShowAllNearbyStopsClick(RecentPlaceAppModel place) {
            Intrinsics.i(place, "place");
            this.f4548a = place;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnShowAllNearbyStopsClick) && Intrinsics.d(this.f4548a, ((OnShowAllNearbyStopsClick) obj).f4548a);
        }

        public final int hashCode() {
            return this.f4548a.hashCode();
        }

        public final String toString() {
            return "OnShowAllNearbyStopsClick(place=" + this.f4548a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent$OnStepCountClicked;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnStepCountClicked extends StopTripPlannerResultIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TripPlannerItineraryAppResponseModel f4549a;
        public final TripPlannerLegAppModel.Bus b;
        public final int c;

        public OnStepCountClicked(TripPlannerItineraryAppResponseModel itinerary, TripPlannerLegAppModel.Bus bus, int i) {
            Intrinsics.i(itinerary, "itinerary");
            this.f4549a = itinerary;
            this.b = bus;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnStepCountClicked)) {
                return false;
            }
            OnStepCountClicked onStepCountClicked = (OnStepCountClicked) obj;
            return Intrinsics.d(this.f4549a, onStepCountClicked.f4549a) && Intrinsics.d(this.b, onStepCountClicked.b) && this.c == onStepCountClicked.c;
        }

        public final int hashCode() {
            return ((this.b.hashCode() + (this.f4549a.hashCode() * 31)) * 31) + this.c;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnStepCountClicked(itinerary=");
            sb.append(this.f4549a);
            sb.append(", legAppModel=");
            sb.append(this.b);
            sb.append(", stepCount=");
            return b3.f(")", this.c, sb);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent$OnSwapButtonClick;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnSwapButtonClick extends StopTripPlannerResultIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnSwapButtonClick f4550a = new OnSwapButtonClick();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent$OnTrackBusClicked;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnTrackBusClicked extends StopTripPlannerResultIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TripPlannerItineraryAppResponseModel f4551a;
        public final TripPlannerLegAppModel.Bus b;
        public final int c;

        public OnTrackBusClicked(TripPlannerItineraryAppResponseModel itinerary, TripPlannerLegAppModel.Bus bus, int i) {
            Intrinsics.i(itinerary, "itinerary");
            this.f4551a = itinerary;
            this.b = bus;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnTrackBusClicked)) {
                return false;
            }
            OnTrackBusClicked onTrackBusClicked = (OnTrackBusClicked) obj;
            return Intrinsics.d(this.f4551a, onTrackBusClicked.f4551a) && this.b.equals(onTrackBusClicked.b) && this.c == onTrackBusClicked.c;
        }

        public final int hashCode() {
            return ((this.b.hashCode() + (this.f4551a.hashCode() * 31)) * 31) + this.c;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnTrackBusClicked(itinerary=");
            sb.append(this.f4551a);
            sb.append(", legAppModel=");
            sb.append(this.b);
            sb.append(", index=");
            return b3.f(")", this.c, sb);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent$OnTrackingNotAvailableViewDetailsClicked;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnTrackingNotAvailableViewDetailsClicked extends StopTripPlannerResultIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TripPlannerItineraryAppResponseModel f4552a;
        public final TripPlannerLegAppModel.Bus b;
        public final int c;

        public OnTrackingNotAvailableViewDetailsClicked(TripPlannerItineraryAppResponseModel itinerary, TripPlannerLegAppModel.Bus bus, int i) {
            Intrinsics.i(itinerary, "itinerary");
            this.f4552a = itinerary;
            this.b = bus;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnTrackingNotAvailableViewDetailsClicked)) {
                return false;
            }
            OnTrackingNotAvailableViewDetailsClicked onTrackingNotAvailableViewDetailsClicked = (OnTrackingNotAvailableViewDetailsClicked) obj;
            return Intrinsics.d(this.f4552a, onTrackingNotAvailableViewDetailsClicked.f4552a) && this.b.equals(onTrackingNotAvailableViewDetailsClicked.b) && this.c == onTrackingNotAvailableViewDetailsClicked.c;
        }

        public final int hashCode() {
            return ((this.b.hashCode() + (this.f4552a.hashCode() * 31)) * 31) + this.c;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnTrackingNotAvailableViewDetailsClicked(itinerary=");
            sb.append(this.f4552a);
            sb.append(", legAppModel=");
            sb.append(this.b);
            sb.append(", index=");
            return b3.f(")", this.c, sb);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent$OnTryAgainClick;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnTryAgainClick extends StopTripPlannerResultIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnTryAgainClick f4553a = new OnTryAgainClick();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent$RefreshNudgeClickedIntent;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RefreshNudgeClickedIntent extends StopTripPlannerResultIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RefreshNudgeClickedIntent f4554a = new RefreshNudgeClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RefreshNudgeClickedIntent);
        }

        public final int hashCode() {
            return 1221767396;
        }

        public final String toString() {
            return "RefreshNudgeClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent$ResultTypeTabClickedIntent;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ResultTypeTabClickedIntent extends StopTripPlannerResultIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StopTripPlannerTabType f4555a;

        public ResultTypeTabClickedIntent(StopTripPlannerTabType tab) {
            Intrinsics.i(tab, "tab");
            this.f4555a = tab;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ResultTypeTabClickedIntent) && this.f4555a == ((ResultTypeTabClickedIntent) obj).f4555a;
        }

        public final int hashCode() {
            return this.f4555a.hashCode();
        }

        public final String toString() {
            return "ResultTypeTabClickedIntent(tab=" + this.f4555a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent$RetryNearbyStopFetchIntent;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RetryNearbyStopFetchIntent extends StopTripPlannerResultIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RecentPlaceAppModel f4556a;

        public RetryNearbyStopFetchIntent(RecentPlaceAppModel place) {
            Intrinsics.i(place, "place");
            this.f4556a = place;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RetryNearbyStopFetchIntent) && Intrinsics.d(this.f4556a, ((RetryNearbyStopFetchIntent) obj).f4556a);
        }

        public final int hashCode() {
            return this.f4556a.hashCode();
        }

        public final String toString() {
            return "RetryNearbyStopFetchIntent(place=" + this.f4556a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent$SearchStopUpdateFieldClickedIntent;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SearchStopUpdateFieldClickedIntent extends StopTripPlannerResultIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f4557a;

        public SearchStopUpdateFieldClickedIntent(boolean z) {
            this.f4557a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SearchStopUpdateFieldClickedIntent) && this.f4557a == ((SearchStopUpdateFieldClickedIntent) obj).f4557a;
        }

        public final int hashCode() {
            return this.f4557a ? 1231 : 1237;
        }

        public final String toString() {
            return cb0.k("SearchStopUpdateFieldClickedIntent(forFromStop=", ")", this.f4557a);
        }
    }
}
