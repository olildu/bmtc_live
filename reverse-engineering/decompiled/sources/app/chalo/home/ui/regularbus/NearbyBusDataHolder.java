package app.chalo.home.ui.regularbus;

import app.chalo.home.helper.NearbyBusMarkerUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/regularbus/NearbyBusDataHolder;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NearbyBusDataHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3615a;
    public final NearbyBusMarkerUIState b;

    public NearbyBusDataHolder(String id, NearbyBusMarkerUIState nearbyBusMarker) {
        Intrinsics.i(id, "id");
        Intrinsics.i(nearbyBusMarker, "nearbyBusMarker");
        this.f3615a = id;
        this.b = nearbyBusMarker;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyBusDataHolder)) {
            return false;
        }
        NearbyBusDataHolder nearbyBusDataHolder = (NearbyBusDataHolder) obj;
        return Intrinsics.d(this.f3615a, nearbyBusDataHolder.f3615a) && Intrinsics.d(this.b, nearbyBusDataHolder.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f3615a.hashCode() * 31);
    }

    public final String toString() {
        return "NearbyBusDataHolder(id=" + this.f3615a + ", nearbyBusMarker=" + this.b + ")";
    }
}
