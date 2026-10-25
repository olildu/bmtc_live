package app.chalo.home.nearbytrips.ui.mapscreen;

import app.chalo.location.LatLng;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsDataInfo;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NearbyStopsDataInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LatLng f3140a;
    public final List b;

    public NearbyStopsDataInfo(LatLng latLng, List dataAndMarker) {
        Intrinsics.i(latLng, "latLng");
        Intrinsics.i(dataAndMarker, "dataAndMarker");
        this.f3140a = latLng;
        this.b = dataAndMarker;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyStopsDataInfo)) {
            return false;
        }
        NearbyStopsDataInfo nearbyStopsDataInfo = (NearbyStopsDataInfo) obj;
        return Intrinsics.d(this.f3140a, nearbyStopsDataInfo.f3140a) && Intrinsics.d(this.b, nearbyStopsDataInfo.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f3140a.hashCode() * 31);
    }

    public final String toString() {
        return "NearbyStopsDataInfo(latLng=" + this.f3140a + ", dataAndMarker=" + this.b + ")";
    }
}
