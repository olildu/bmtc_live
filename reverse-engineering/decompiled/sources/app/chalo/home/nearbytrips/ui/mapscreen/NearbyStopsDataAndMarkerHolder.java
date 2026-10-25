package app.chalo.home.nearbytrips.ui.mapscreen;

import app.chalo.stoptripdetails.data.model.app.LocationSummaryPayloadResponseAppModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsDataAndMarkerHolder;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NearbyStopsDataAndMarkerHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocationSummaryPayloadResponseAppModel f3139a;
    public final NearbyStopsMapMarkerUIState b;

    public NearbyStopsDataAndMarkerHolder(LocationSummaryPayloadResponseAppModel data, NearbyStopsMapMarkerUIState marker) {
        Intrinsics.i(data, "data");
        Intrinsics.i(marker, "marker");
        this.f3139a = data;
        this.b = marker;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyStopsDataAndMarkerHolder)) {
            return false;
        }
        NearbyStopsDataAndMarkerHolder nearbyStopsDataAndMarkerHolder = (NearbyStopsDataAndMarkerHolder) obj;
        return Intrinsics.d(this.f3139a, nearbyStopsDataAndMarkerHolder.f3139a) && Intrinsics.d(this.b, nearbyStopsDataAndMarkerHolder.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f3139a.hashCode() * 31);
    }

    public final String toString() {
        return "NearbyStopsDataAndMarkerHolder(data=" + this.f3139a + ", marker=" + this.b + ")";
    }
}
