package app.chalo.home.nearbytrips.domain;

import app.chalo.citydata.data.model.app.SeatAvailabilityLevel;
import app.chalo.stoptripdetails.data.model.app.NearbyTripSummaryStaticData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/nearbytrips/domain/NearbyTripsDataManagerResult;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NearbyTripsDataManagerResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NearbyTripSummaryStaticData f3121a;
    public final NearbyTripsDataManagerEtaResult b;
    public final SeatAvailabilityLevel c;

    public NearbyTripsDataManagerResult(NearbyTripSummaryStaticData nearbyTripSummaryStaticData, NearbyTripsDataManagerEtaResult nearbyTripsDataManagerEtaResult, SeatAvailabilityLevel seatAvailabilityLevel) {
        this.f3121a = nearbyTripSummaryStaticData;
        this.b = nearbyTripsDataManagerEtaResult;
        this.c = seatAvailabilityLevel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyTripsDataManagerResult)) {
            return false;
        }
        NearbyTripsDataManagerResult nearbyTripsDataManagerResult = (NearbyTripsDataManagerResult) obj;
        return Intrinsics.d(this.f3121a, nearbyTripsDataManagerResult.f3121a) && Intrinsics.d(this.b, nearbyTripsDataManagerResult.b) && this.c == nearbyTripsDataManagerResult.c;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f3121a.hashCode() * 31)) * 31;
        SeatAvailabilityLevel seatAvailabilityLevel = this.c;
        return iHashCode + (seatAvailabilityLevel == null ? 0 : seatAvailabilityLevel.hashCode());
    }

    public final String toString() {
        return "NearbyTripsDataManagerResult(summary=" + this.f3121a + ", etaResult=" + this.b + ", seatAvailabilityLevel=" + this.c + ")";
    }
}
