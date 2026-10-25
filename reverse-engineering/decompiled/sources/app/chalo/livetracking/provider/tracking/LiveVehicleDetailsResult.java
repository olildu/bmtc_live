package app.chalo.livetracking.provider.tracking;

import app.chalo.livetracking.provider.tracking.model.LiveVehicleGpsData;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/livetracking/provider/tracking/LiveVehicleDetailsResult;", "", "VehicleGPSData", "LiveData", "Error", "Lapp/chalo/livetracking/provider/tracking/LiveVehicleDetailsResult$Error;", "Lapp/chalo/livetracking/provider/tracking/LiveVehicleDetailsResult$LiveData;", "Lapp/chalo/livetracking/provider/tracking/LiveVehicleDetailsResult$VehicleGPSData;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class LiveVehicleDetailsResult {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/provider/tracking/LiveVehicleDetailsResult$Error;", "Lapp/chalo/livetracking/provider/tracking/LiveVehicleDetailsResult;", "RouteIdNotAvailable", "RouteDetailsNotAvailable", "Lapp/chalo/livetracking/provider/tracking/LiveVehicleDetailsResult$Error$RouteDetailsNotAvailable;", "Lapp/chalo/livetracking/provider/tracking/LiveVehicleDetailsResult$Error$RouteIdNotAvailable;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Error extends LiveVehicleDetailsResult {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/provider/tracking/LiveVehicleDetailsResult$Error$RouteDetailsNotAvailable;", "Lapp/chalo/livetracking/provider/tracking/LiveVehicleDetailsResult$Error;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class RouteDetailsNotAvailable extends Error {
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/provider/tracking/LiveVehicleDetailsResult$Error$RouteIdNotAvailable;", "Lapp/chalo/livetracking/provider/tracking/LiveVehicleDetailsResult$Error;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class RouteIdNotAvailable extends Error {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final RouteIdNotAvailable f4340a = new RouteIdNotAvailable();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/provider/tracking/LiveVehicleDetailsResult$LiveData;", "Lapp/chalo/livetracking/provider/tracking/LiveVehicleDetailsResult;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LiveData extends LiveVehicleDetailsResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f4341a;
        public final Map b;

        public LiveData(LinkedHashMap linkedHashMap, List liveData) {
            Intrinsics.i(liveData, "liveData");
            this.f4341a = liveData;
            this.b = linkedHashMap;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LiveData)) {
                return false;
            }
            LiveData liveData = (LiveData) obj;
            return Intrinsics.d(this.f4341a, liveData.f4341a) && Intrinsics.d(this.b, liveData.b);
        }

        public final int hashCode() {
            int iHashCode = this.f4341a.hashCode() * 31;
            Map map = this.b;
            return iHashCode + (map == null ? 0 : map.hashCode());
        }

        public final String toString() {
            return "LiveData(liveData=" + this.f4341a + ", busPassedFromStopMap=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/provider/tracking/LiveVehicleDetailsResult$VehicleGPSData;", "Lapp/chalo/livetracking/provider/tracking/LiveVehicleDetailsResult;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class VehicleGPSData extends LiveVehicleDetailsResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LiveVehicleGpsData f4342a;

        public VehicleGPSData(LiveVehicleGpsData liveVehicleGpsData) {
            this.f4342a = liveVehicleGpsData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VehicleGPSData) && Intrinsics.d(this.f4342a, ((VehicleGPSData) obj).f4342a);
        }

        public final int hashCode() {
            return this.f4342a.hashCode();
        }

        public final String toString() {
            return "VehicleGPSData(data=" + this.f4342a + ")";
        }
    }
}
