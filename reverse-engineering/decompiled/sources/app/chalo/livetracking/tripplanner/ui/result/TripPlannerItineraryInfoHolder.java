package app.chalo.livetracking.tripplanner.ui.result;

import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerItineraryAppResponseModel;
import app.chalo.livetracking.tripplanner.domain.ItineraryLiveInfoRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerItineraryInfoHolder;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class TripPlannerItineraryInfoHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TripPlannerItineraryAppResponseModel f4752a;
    public final TripPlannerItineraryUiModel b;
    public final ItineraryLiveInfoRequest c;

    public TripPlannerItineraryInfoHolder(TripPlannerItineraryAppResponseModel responseAppModel, TripPlannerItineraryUiModel uiModel, ItineraryLiveInfoRequest itineraryLiveInfoRequest) {
        Intrinsics.i(responseAppModel, "responseAppModel");
        Intrinsics.i(uiModel, "uiModel");
        this.f4752a = responseAppModel;
        this.b = uiModel;
        this.c = itineraryLiveInfoRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TripPlannerItineraryInfoHolder)) {
            return false;
        }
        TripPlannerItineraryInfoHolder tripPlannerItineraryInfoHolder = (TripPlannerItineraryInfoHolder) obj;
        return Intrinsics.d(this.f4752a, tripPlannerItineraryInfoHolder.f4752a) && Intrinsics.d(this.b, tripPlannerItineraryInfoHolder.b) && Intrinsics.d(this.c, tripPlannerItineraryInfoHolder.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f4752a.hashCode() * 31)) * 31;
        ItineraryLiveInfoRequest itineraryLiveInfoRequest = this.c;
        return iHashCode + (itineraryLiveInfoRequest == null ? 0 : itineraryLiveInfoRequest.hashCode());
    }

    public final String toString() {
        return "TripPlannerItineraryInfoHolder(responseAppModel=" + this.f4752a + ", uiModel=" + this.b + ", itineraryLiveInfoRequest=" + this.c + ")";
    }
}
