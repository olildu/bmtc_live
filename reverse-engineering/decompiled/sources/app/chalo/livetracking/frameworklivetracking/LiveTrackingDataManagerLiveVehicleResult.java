package app.chalo.livetracking.frameworklivetracking;

import com.inmobi.unification.sdk.InitializationStatus;
import defpackage.gf;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/LiveTrackingDataManagerLiveVehicleResult;", "", InitializationStatus.SUCCESS, "Error", "Lapp/chalo/livetracking/frameworklivetracking/LiveTrackingDataManagerLiveVehicleResult$Error;", "Lapp/chalo/livetracking/frameworklivetracking/LiveTrackingDataManagerLiveVehicleResult$Success;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class LiveTrackingDataManagerLiveVehicleResult {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/LiveTrackingDataManagerLiveVehicleResult$Error;", "Lapp/chalo/livetracking/frameworklivetracking/LiveTrackingDataManagerLiveVehicleResult;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Error extends LiveTrackingDataManagerLiveVehicleResult {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Error(error=)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/LiveTrackingDataManagerLiveVehicleResult$Success;", "Lapp/chalo/livetracking/frameworklivetracking/LiveTrackingDataManagerLiveVehicleResult;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success extends LiveTrackingDataManagerLiveVehicleResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f4206a;

        public Success(ArrayList arrayList) {
            this.f4206a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && this.f4206a.equals(((Success) obj).f4206a);
        }

        public final int hashCode() {
            return this.f4206a.hashCode();
        }

        public final String toString() {
            return gf.i("Success(vehicleList=", ")", this.f4206a);
        }
    }
}
