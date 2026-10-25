package app.chalo.livetracking.provider.tracking;

import app.chalo.livetracking.provider.tracking.model.LiveVehicleGpsData;
import com.inmobi.unification.sdk.InitializationStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/provider/tracking/VehicleGpsDataResult;", "", InitializationStatus.SUCCESS, "Error", "Lapp/chalo/livetracking/provider/tracking/VehicleGpsDataResult$Error;", "Lapp/chalo/livetracking/provider/tracking/VehicleGpsDataResult$Success;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class VehicleGpsDataResult {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/provider/tracking/VehicleGpsDataResult$Error;", "Lapp/chalo/livetracking/provider/tracking/VehicleGpsDataResult;", "ConfigNotAvailable", "RouteDetailsNotAvailable", "Lapp/chalo/livetracking/provider/tracking/VehicleGpsDataResult$Error$ConfigNotAvailable;", "Lapp/chalo/livetracking/provider/tracking/VehicleGpsDataResult$Error$RouteDetailsNotAvailable;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Error extends VehicleGpsDataResult {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/provider/tracking/VehicleGpsDataResult$Error$ConfigNotAvailable;", "Lapp/chalo/livetracking/provider/tracking/VehicleGpsDataResult$Error;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ConfigNotAvailable extends Error {
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/provider/tracking/VehicleGpsDataResult$Error$RouteDetailsNotAvailable;", "Lapp/chalo/livetracking/provider/tracking/VehicleGpsDataResult$Error;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class RouteDetailsNotAvailable extends Error {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final RouteDetailsNotAvailable f4363a = new RouteDetailsNotAvailable();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/provider/tracking/VehicleGpsDataResult$Success;", "Lapp/chalo/livetracking/provider/tracking/VehicleGpsDataResult;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success extends VehicleGpsDataResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LiveVehicleGpsData f4364a;

        public Success(LiveVehicleGpsData liveVehicleGpsData) {
            this.f4364a = liveVehicleGpsData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.d(this.f4364a, ((Success) obj).f4364a);
        }

        public final int hashCode() {
            return this.f4364a.hashCode();
        }

        public final String toString() {
            return "Success(vehicleGpsData=" + this.f4364a + ")";
        }
    }
}
