package app.chalo.livetracking.provider.tracking;

import com.inmobi.unification.sdk.InitializationStatus;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/provider/tracking/TrackingDataProviderResult;", "", InitializationStatus.SUCCESS, "Error", "Lapp/chalo/livetracking/provider/tracking/TrackingDataProviderResult$Error;", "Lapp/chalo/livetracking/provider/tracking/TrackingDataProviderResult$Success;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class TrackingDataProviderResult {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/livetracking/provider/tracking/TrackingDataProviderResult$Error;", "Lapp/chalo/livetracking/provider/tracking/TrackingDataProviderResult;", "ConfigNotProvided", "RouteDetailsNotAvailable", "ETAFetchingNotStartedForStop", "Lapp/chalo/livetracking/provider/tracking/TrackingDataProviderResult$Error$ConfigNotProvided;", "Lapp/chalo/livetracking/provider/tracking/TrackingDataProviderResult$Error$ETAFetchingNotStartedForStop;", "Lapp/chalo/livetracking/provider/tracking/TrackingDataProviderResult$Error$RouteDetailsNotAvailable;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Error extends TrackingDataProviderResult {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/provider/tracking/TrackingDataProviderResult$Error$ConfigNotProvided;", "Lapp/chalo/livetracking/provider/tracking/TrackingDataProviderResult$Error;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ConfigNotProvided extends Error {
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/provider/tracking/TrackingDataProviderResult$Error$ETAFetchingNotStartedForStop;", "Lapp/chalo/livetracking/provider/tracking/TrackingDataProviderResult$Error;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ETAFetchingNotStartedForStop extends Error {
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/provider/tracking/TrackingDataProviderResult$Error$RouteDetailsNotAvailable;", "Lapp/chalo/livetracking/provider/tracking/TrackingDataProviderResult$Error;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class RouteDetailsNotAvailable extends Error {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/provider/tracking/TrackingDataProviderResult$Success;", "Lapp/chalo/livetracking/provider/tracking/TrackingDataProviderResult;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Success extends TrackingDataProviderResult {
    }
}
