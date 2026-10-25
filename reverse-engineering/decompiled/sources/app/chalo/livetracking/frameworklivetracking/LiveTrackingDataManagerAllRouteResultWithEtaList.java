package app.chalo.livetracking.frameworklivetracking;

import com.inmobi.unification.sdk.InitializationStatus;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/LiveTrackingDataManagerAllRouteResultWithEtaList;", "", InitializationStatus.SUCCESS, "Error", "Lapp/chalo/livetracking/frameworklivetracking/LiveTrackingDataManagerAllRouteResultWithEtaList$Error;", "Lapp/chalo/livetracking/frameworklivetracking/LiveTrackingDataManagerAllRouteResultWithEtaList$Success;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class LiveTrackingDataManagerAllRouteResultWithEtaList {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/LiveTrackingDataManagerAllRouteResultWithEtaList$Error;", "Lapp/chalo/livetracking/frameworklivetracking/LiveTrackingDataManagerAllRouteResultWithEtaList;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Error extends LiveTrackingDataManagerAllRouteResultWithEtaList {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "Error(error=null)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/LiveTrackingDataManagerAllRouteResultWithEtaList$Success;", "Lapp/chalo/livetracking/frameworklivetracking/LiveTrackingDataManagerAllRouteResultWithEtaList;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success extends LiveTrackingDataManagerAllRouteResultWithEtaList {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinkedHashMap f4192a;

        public Success(LinkedHashMap linkedHashMap) {
            this.f4192a = linkedHashMap;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && this.f4192a.equals(((Success) obj).f4192a);
        }

        public final int hashCode() {
            return this.f4192a.hashCode();
        }

        public final String toString() {
            return "Success(result=" + this.f4192a + ")";
        }
    }
}
