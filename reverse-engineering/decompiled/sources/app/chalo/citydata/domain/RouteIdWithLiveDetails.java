package app.chalo.citydata.domain;

import app.chalo.citydata.data.model.app.RouteLiveDetailsAppModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/citydata/domain/RouteIdWithLiveDetails;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteIdWithLiveDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1764a;
    public final RouteLiveDetailsAppModel b;

    public RouteIdWithLiveDetails(String routeId, RouteLiveDetailsAppModel routeLiveDetailsAppModel) {
        Intrinsics.i(routeId, "routeId");
        this.f1764a = routeId;
        this.b = routeLiveDetailsAppModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteIdWithLiveDetails)) {
            return false;
        }
        RouteIdWithLiveDetails routeIdWithLiveDetails = (RouteIdWithLiveDetails) obj;
        return Intrinsics.d(this.f1764a, routeIdWithLiveDetails.f1764a) && Intrinsics.d(this.b, routeIdWithLiveDetails.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f1764a.hashCode() * 31);
    }

    public final String toString() {
        return "RouteIdWithLiveDetails(routeId=" + this.f1764a + ", liveDetails=" + this.b + ")";
    }
}
