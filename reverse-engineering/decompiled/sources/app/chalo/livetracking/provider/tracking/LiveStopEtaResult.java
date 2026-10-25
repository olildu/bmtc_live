package app.chalo.livetracking.provider.tracking;

import app.chalo.livetracking.provider.tracking.model.StopLiveEtaAppModel;
import com.inmobi.unification.sdk.InitializationStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/provider/tracking/LiveStopEtaResult;", "", InitializationStatus.SUCCESS, "Error", "Lapp/chalo/livetracking/provider/tracking/LiveStopEtaResult$Error;", "Lapp/chalo/livetracking/provider/tracking/LiveStopEtaResult$Success;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class LiveStopEtaResult {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/provider/tracking/LiveStopEtaResult$Error;", "Lapp/chalo/livetracking/provider/tracking/LiveStopEtaResult;", "ConfigNotAvailable", "RouteDetailsNotAvailable", "Lapp/chalo/livetracking/provider/tracking/LiveStopEtaResult$Error$ConfigNotAvailable;", "Lapp/chalo/livetracking/provider/tracking/LiveStopEtaResult$Error$RouteDetailsNotAvailable;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Error extends LiveStopEtaResult {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/provider/tracking/LiveStopEtaResult$Error$ConfigNotAvailable;", "Lapp/chalo/livetracking/provider/tracking/LiveStopEtaResult$Error;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ConfigNotAvailable extends Error {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final ConfigNotAvailable f4337a = new ConfigNotAvailable();
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/provider/tracking/LiveStopEtaResult$Error$RouteDetailsNotAvailable;", "Lapp/chalo/livetracking/provider/tracking/LiveStopEtaResult$Error;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class RouteDetailsNotAvailable extends Error {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final RouteDetailsNotAvailable f4338a = new RouteDetailsNotAvailable();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/provider/tracking/LiveStopEtaResult$Success;", "Lapp/chalo/livetracking/provider/tracking/LiveStopEtaResult;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success extends LiveStopEtaResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StopLiveEtaAppModel f4339a;

        public Success(StopLiveEtaAppModel data) {
            Intrinsics.i(data, "data");
            this.f4339a = data;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.d(this.f4339a, ((Success) obj).f4339a);
        }

        public final int hashCode() {
            return this.f4339a.hashCode();
        }

        public final String toString() {
            return "Success(data=" + this.f4339a + ")";
        }
    }
}
