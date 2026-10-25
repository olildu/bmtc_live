package app.chalo.stoptripdetails.data.model.app;

import defpackage.nf1;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/stoptripdetails/data/model/app/NearbyTripLiveInfoRequest;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NearbyTripLiveInfoRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9496a;
    public final List b;

    public NearbyTripLiveInfoRequest(String stopId, List summaries) {
        Intrinsics.i(stopId, "stopId");
        Intrinsics.i(summaries, "summaries");
        this.f9496a = stopId;
        this.b = summaries;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyTripLiveInfoRequest)) {
            return false;
        }
        NearbyTripLiveInfoRequest nearbyTripLiveInfoRequest = (NearbyTripLiveInfoRequest) obj;
        return Intrinsics.d(this.f9496a, nearbyTripLiveInfoRequest.f9496a) && Intrinsics.d(this.b, nearbyTripLiveInfoRequest.b);
    }

    public final int hashCode() {
        return r30.b(this.f9496a.hashCode() * 31, 31, this.b) + ((int) (-4294967296L));
    }

    public final String toString() {
        return nf1.m("NearbyTripLiveInfoRequest(stopId=", this.f9496a, ", summaries=", ", minimumArrivalTimeInMillis=-1)", this.b);
    }
}
