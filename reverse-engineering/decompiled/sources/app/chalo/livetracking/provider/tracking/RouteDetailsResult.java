package app.chalo.livetracking.provider.tracking;

import app.chalo.citydata.data.model.app.RouteAppModel;
import com.inmobi.unification.sdk.InitializationStatus;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/livetracking/provider/tracking/RouteDetailsResult;", "", "FetchInProgress", InitializationStatus.SUCCESS, "Error", "Lapp/chalo/livetracking/provider/tracking/RouteDetailsResult$Error;", "Lapp/chalo/livetracking/provider/tracking/RouteDetailsResult$FetchInProgress;", "Lapp/chalo/livetracking/provider/tracking/RouteDetailsResult$Success;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class RouteDetailsResult {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/provider/tracking/RouteDetailsResult$Error;", "Lapp/chalo/livetracking/provider/tracking/RouteDetailsResult;", "FetchError", "RouteIdNotAvailable", "Lapp/chalo/livetracking/provider/tracking/RouteDetailsResult$Error$FetchError;", "Lapp/chalo/livetracking/provider/tracking/RouteDetailsResult$Error$RouteIdNotAvailable;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Error extends RouteDetailsResult {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/provider/tracking/RouteDetailsResult$Error$FetchError;", "Lapp/chalo/livetracking/provider/tracking/RouteDetailsResult$Error;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class FetchError extends Error {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f4343a;

            public FetchError(String errorMsg) {
                Intrinsics.i(errorMsg, "errorMsg");
                this.f4343a = errorMsg;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FetchError) && Intrinsics.d(this.f4343a, ((FetchError) obj).f4343a);
            }

            public final int hashCode() {
                return this.f4343a.hashCode();
            }

            public final String toString() {
                return vo1.B("FetchError(errorMsg=", this.f4343a, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/provider/tracking/RouteDetailsResult$Error$RouteIdNotAvailable;", "Lapp/chalo/livetracking/provider/tracking/RouteDetailsResult$Error;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class RouteIdNotAvailable extends Error {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final RouteIdNotAvailable f4344a = new RouteIdNotAvailable();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/provider/tracking/RouteDetailsResult$FetchInProgress;", "Lapp/chalo/livetracking/provider/tracking/RouteDetailsResult;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FetchInProgress extends RouteDetailsResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FetchInProgress f4345a = new FetchInProgress();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/provider/tracking/RouteDetailsResult$Success;", "Lapp/chalo/livetracking/provider/tracking/RouteDetailsResult;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success extends RouteDetailsResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RouteAppModel f4346a;
        public final boolean b;

        public Success(RouteAppModel routeAppModel, boolean z) {
            Intrinsics.i(routeAppModel, "routeAppModel");
            this.f4346a = routeAppModel;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return Intrinsics.d(this.f4346a, success.f4346a) && this.b == success.b;
        }

        public final int hashCode() {
            return (this.f4346a.hashCode() * 31) + (this.b ? 1231 : 1237);
        }

        public final String toString() {
            return "Success(routeAppModel=" + this.f4346a + ", isFromCache=" + this.b + ")";
        }
    }
}
