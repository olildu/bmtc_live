package app.chalo.livetracking.tripplanner.domain;

import app.chalo.citydata.data.model.app.SeatAvailabilityLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/domain/ItineraryLiveInfoResult;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ItineraryLiveInfoResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ItineraryLiveInfoRequest f4701a;
    public final ItineraryEtaInfo b;
    public final SeatAvailabilityLevel c;

    public ItineraryLiveInfoResult(ItineraryLiveInfoRequest itineraryInfo, ItineraryEtaInfo itineraryEtaInfo, SeatAvailabilityLevel seatAvailabilityLevel) {
        Intrinsics.i(itineraryInfo, "itineraryInfo");
        this.f4701a = itineraryInfo;
        this.b = itineraryEtaInfo;
        this.c = seatAvailabilityLevel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItineraryLiveInfoResult)) {
            return false;
        }
        ItineraryLiveInfoResult itineraryLiveInfoResult = (ItineraryLiveInfoResult) obj;
        return Intrinsics.d(this.f4701a, itineraryLiveInfoResult.f4701a) && Intrinsics.d(this.b, itineraryLiveInfoResult.b) && this.c == itineraryLiveInfoResult.c;
    }

    public final int hashCode() {
        int iHashCode = this.f4701a.hashCode() * 31;
        ItineraryEtaInfo itineraryEtaInfo = this.b;
        int iHashCode2 = (iHashCode + (itineraryEtaInfo == null ? 0 : itineraryEtaInfo.hashCode())) * 31;
        SeatAvailabilityLevel seatAvailabilityLevel = this.c;
        return iHashCode2 + (seatAvailabilityLevel != null ? seatAvailabilityLevel.hashCode() : 0);
    }

    public final String toString() {
        return "ItineraryLiveInfoResult(itineraryInfo=" + this.f4701a + ", validEta=" + this.b + ", seatOccupancyStatus=" + this.c + ")";
    }
}
