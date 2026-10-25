package app.chalo.livetracking.provider.tracking.model;

import app.chalo.compose.components.chalomap.LiveBusDelayedState;
import app.chalo.location.LatLng;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/provider/tracking/model/LiveVehicleGpsData;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LiveVehicleGpsData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LatLng f4370a;
    public final String b;
    public final long c;
    public final LiveBusDelayedState d;

    public LiveVehicleGpsData(LatLng latLng, String vehicleNumber, long j, LiveBusDelayedState delayedState) {
        Intrinsics.i(vehicleNumber, "vehicleNumber");
        Intrinsics.i(delayedState, "delayedState");
        this.f4370a = latLng;
        this.b = vehicleNumber;
        this.c = j;
        this.d = delayedState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveVehicleGpsData)) {
            return false;
        }
        LiveVehicleGpsData liveVehicleGpsData = (LiveVehicleGpsData) obj;
        return Intrinsics.d(this.f4370a, liveVehicleGpsData.f4370a) && Intrinsics.d(this.b, liveVehicleGpsData.b) && this.c == liveVehicleGpsData.c && Intrinsics.d(this.d, liveVehicleGpsData.d);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f4370a.hashCode() * 31, 31, this.b);
        long j = this.c;
        return this.d.hashCode() + ((iE + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        return "LiveVehicleGpsData(gpsPosition=" + this.f4370a + ", vehicleNumber=" + this.b + ", lastUpdatedAt=" + this.c + ", delayedState=" + this.d + ")";
    }
}
