package app.chalo.livetracking.stoptripplannerresult;

import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerItineraryAppResponseModel;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel;
import app.chalo.recent.model.app.RecentPlaceAppModel;
import defpackage.b3;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/StopBasedTripPlannerResultsBottomSheetType;", "", "NearestStops", "NoNearestStops", "NearestStopFetchError", "TrackingNotAvailableForLeg", "None", "Lapp/chalo/livetracking/stoptripplannerresult/StopBasedTripPlannerResultsBottomSheetType$NearestStopFetchError;", "Lapp/chalo/livetracking/stoptripplannerresult/StopBasedTripPlannerResultsBottomSheetType$NearestStops;", "Lapp/chalo/livetracking/stoptripplannerresult/StopBasedTripPlannerResultsBottomSheetType$NoNearestStops;", "Lapp/chalo/livetracking/stoptripplannerresult/StopBasedTripPlannerResultsBottomSheetType$None;", "Lapp/chalo/livetracking/stoptripplannerresult/StopBasedTripPlannerResultsBottomSheetType$TrackingNotAvailableForLeg;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class StopBasedTripPlannerResultsBottomSheetType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/StopBasedTripPlannerResultsBottomSheetType$NearestStopFetchError;", "Lapp/chalo/livetracking/stoptripplannerresult/StopBasedTripPlannerResultsBottomSheetType;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NearestStopFetchError extends StopBasedTripPlannerResultsBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RecentPlaceAppModel f4525a;

        public NearestStopFetchError(RecentPlaceAppModel place) {
            Intrinsics.i(place, "place");
            this.f4525a = place;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NearestStopFetchError) && Intrinsics.d(this.f4525a, ((NearestStopFetchError) obj).f4525a);
        }

        public final int hashCode() {
            return this.f4525a.hashCode();
        }

        public final String toString() {
            return "NearestStopFetchError(place=" + this.f4525a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/StopBasedTripPlannerResultsBottomSheetType$NearestStops;", "Lapp/chalo/livetracking/stoptripplannerresult/StopBasedTripPlannerResultsBottomSheetType;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NearestStops extends StopBasedTripPlannerResultsBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RecentPlaceAppModel f4526a;
        public final List b;

        public NearestStops(RecentPlaceAppModel place, List stopList) {
            Intrinsics.i(place, "place");
            Intrinsics.i(stopList, "stopList");
            this.f4526a = place;
            this.b = stopList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NearestStops)) {
                return false;
            }
            NearestStops nearestStops = (NearestStops) obj;
            return Intrinsics.d(this.f4526a, nearestStops.f4526a) && Intrinsics.d(this.b, nearestStops.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f4526a.hashCode() * 31);
        }

        public final String toString() {
            return "NearestStops(place=" + this.f4526a + ", stopList=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/StopBasedTripPlannerResultsBottomSheetType$NoNearestStops;", "Lapp/chalo/livetracking/stoptripplannerresult/StopBasedTripPlannerResultsBottomSheetType;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NoNearestStops extends StopBasedTripPlannerResultsBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RecentPlaceAppModel f4527a;

        public NoNearestStops(RecentPlaceAppModel place) {
            Intrinsics.i(place, "place");
            this.f4527a = place;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NoNearestStops) && Intrinsics.d(this.f4527a, ((NoNearestStops) obj).f4527a);
        }

        public final int hashCode() {
            return this.f4527a.hashCode();
        }

        public final String toString() {
            return "NoNearestStops(place=" + this.f4527a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/StopBasedTripPlannerResultsBottomSheetType$None;", "Lapp/chalo/livetracking/stoptripplannerresult/StopBasedTripPlannerResultsBottomSheetType;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class None extends StopBasedTripPlannerResultsBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final None f4528a = new None();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/StopBasedTripPlannerResultsBottomSheetType$TrackingNotAvailableForLeg;", "Lapp/chalo/livetracking/stoptripplannerresult/StopBasedTripPlannerResultsBottomSheetType;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TrackingNotAvailableForLeg extends StopBasedTripPlannerResultsBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TripPlannerItineraryAppResponseModel f4529a;
        public final TripPlannerLegAppModel.Bus b;
        public final int c;

        public TrackingNotAvailableForLeg(TripPlannerItineraryAppResponseModel itinerary, TripPlannerLegAppModel.Bus bus, int i) {
            Intrinsics.i(itinerary, "itinerary");
            this.f4529a = itinerary;
            this.b = bus;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TrackingNotAvailableForLeg)) {
                return false;
            }
            TrackingNotAvailableForLeg trackingNotAvailableForLeg = (TrackingNotAvailableForLeg) obj;
            return Intrinsics.d(this.f4529a, trackingNotAvailableForLeg.f4529a) && Intrinsics.d(this.b, trackingNotAvailableForLeg.b) && this.c == trackingNotAvailableForLeg.c;
        }

        public final int hashCode() {
            return ((this.b.hashCode() + (this.f4529a.hashCode() * 31)) * 31) + this.c;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TrackingNotAvailableForLeg(itinerary=");
            sb.append(this.f4529a);
            sb.append(", leg=");
            sb.append(this.b);
            sb.append(", index=");
            return b3.f(")", this.c, sb);
        }
    }
}
