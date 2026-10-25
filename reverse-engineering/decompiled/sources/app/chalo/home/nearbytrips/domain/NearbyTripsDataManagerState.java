package app.chalo.home.nearbytrips.domain;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/nearbytrips/domain/NearbyTripsDataManagerState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NearbyTripsDataManagerState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NearbyTripsDataHolder f3122a;
    public final NearbyTripsFetchStatus b;

    public NearbyTripsDataManagerState(NearbyTripsDataHolder nearbyTripsDataHolder, NearbyTripsFetchStatus fetchStatus) {
        Intrinsics.i(fetchStatus, "fetchStatus");
        this.f3122a = nearbyTripsDataHolder;
        this.b = fetchStatus;
    }

    public static NearbyTripsDataManagerState a(NearbyTripsDataManagerState nearbyTripsDataManagerState, NearbyTripsFetchStatus nearbyTripsFetchStatus) {
        NearbyTripsDataHolder nearbyTripsDataHolder = nearbyTripsDataManagerState.f3122a;
        nearbyTripsDataManagerState.getClass();
        return new NearbyTripsDataManagerState(nearbyTripsDataHolder, nearbyTripsFetchStatus);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyTripsDataManagerState)) {
            return false;
        }
        NearbyTripsDataManagerState nearbyTripsDataManagerState = (NearbyTripsDataManagerState) obj;
        return Intrinsics.d(this.f3122a, nearbyTripsDataManagerState.f3122a) && Intrinsics.d(this.b, nearbyTripsDataManagerState.b);
    }

    public final int hashCode() {
        NearbyTripsDataHolder nearbyTripsDataHolder = this.f3122a;
        return this.b.hashCode() + ((nearbyTripsDataHolder == null ? 0 : nearbyTripsDataHolder.hashCode()) * 31);
    }

    public final String toString() {
        return "NearbyTripsDataManagerState(nearbyTripsDataHolder=" + this.f3122a + ", fetchStatus=" + this.b + ")";
    }
}
