package app.chalo.home.nearbytrips.domain;

import app.chalo.location.LatLng;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/nearbytrips/domain/NearbyTripsDataHolder;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NearbyTripsDataHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LatLng f3117a;
    public final ArrayList b;

    public NearbyTripsDataHolder(LatLng latLngRequested, ArrayList arrayList) {
        Intrinsics.i(latLngRequested, "latLngRequested");
        this.f3117a = latLngRequested;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyTripsDataHolder)) {
            return false;
        }
        NearbyTripsDataHolder nearbyTripsDataHolder = (NearbyTripsDataHolder) obj;
        return Intrinsics.d(this.f3117a, nearbyTripsDataHolder.f3117a) && this.b.equals(nearbyTripsDataHolder.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f3117a.hashCode() * 31);
    }

    public final String toString() {
        return "NearbyTripsDataHolder(latLngRequested=" + this.f3117a + ", listOfFetchedStaticResponse=" + this.b + ")";
    }
}
