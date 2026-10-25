package app.chalo.livetracking.frameworklivetracking.data.error;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/error/SeatOccupancyFetchError;", "Lapp/chalo/livetracking/frameworklivetracking/data/error/LiveTrackingRemoteErrorType;", "SeatOccupancyFactorUnavailable", "MaxDelayUnavailable", "Lapp/chalo/livetracking/frameworklivetracking/data/error/SeatOccupancyFetchError$MaxDelayUnavailable;", "Lapp/chalo/livetracking/frameworklivetracking/data/error/SeatOccupancyFetchError$SeatOccupancyFactorUnavailable;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SeatOccupancyFetchError extends LiveTrackingRemoteErrorType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/error/SeatOccupancyFetchError$MaxDelayUnavailable;", "Lapp/chalo/livetracking/frameworklivetracking/data/error/SeatOccupancyFetchError;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MaxDelayUnavailable extends SeatOccupancyFetchError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MaxDelayUnavailable f4224a = new MaxDelayUnavailable();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/error/SeatOccupancyFetchError$SeatOccupancyFactorUnavailable;", "Lapp/chalo/livetracking/frameworklivetracking/data/error/SeatOccupancyFetchError;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SeatOccupancyFactorUnavailable extends SeatOccupancyFetchError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SeatOccupancyFactorUnavailable f4225a = new SeatOccupancyFactorUnavailable();
    }
}
