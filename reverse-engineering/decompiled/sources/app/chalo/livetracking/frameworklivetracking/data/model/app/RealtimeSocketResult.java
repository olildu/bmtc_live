package app.chalo.livetracking.frameworklivetracking.data.model.app;

import com.inmobi.unification.sdk.InitializationStatus;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/app/RealtimeSocketResult;", "", InitializationStatus.SUCCESS, "Error", "Lapp/chalo/livetracking/frameworklivetracking/data/model/app/RealtimeSocketResult$Error;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/app/RealtimeSocketResult$Success;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface RealtimeSocketResult {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/app/RealtimeSocketResult$Error;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/app/RealtimeSocketResult;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Error implements RealtimeSocketResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RealTimeSocketResponseErrorType f4311a;

        public Error(RealTimeSocketResponseErrorType realTimeSocketResponseErrorType) {
            this.f4311a = realTimeSocketResponseErrorType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && Intrinsics.d(this.f4311a, ((Error) obj).f4311a);
        }

        public final int hashCode() {
            return this.f4311a.hashCode();
        }

        public final String toString() {
            return "Error(errorType=" + this.f4311a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/app/RealtimeSocketResult$Success;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/app/RealtimeSocketResult;", "Etas", "Route", "EtasList", "Lapp/chalo/livetracking/frameworklivetracking/data/model/app/RealtimeSocketResult$Success$Etas;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/app/RealtimeSocketResult$Success$EtasList;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/app/RealtimeSocketResult$Success$Route;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Success extends RealtimeSocketResult {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/app/RealtimeSocketResult$Success$Etas;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/app/RealtimeSocketResult$Success;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Etas implements Success {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LinkedHashMap f4312a;
            public final ProcessRTSDataResult b;

            public Etas(LinkedHashMap linkedHashMap, ProcessRTSDataResult processRTSDataResult) {
                this.f4312a = linkedHashMap;
                this.b = processRTSDataResult;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Etas)) {
                    return false;
                }
                Etas etas = (Etas) obj;
                return this.f4312a.equals(etas.f4312a) && this.b.equals(etas.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f4312a.hashCode() * 31);
            }

            public final String toString() {
                return "Etas(etaMap=" + this.f4312a + ", processResult=" + this.b + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/app/RealtimeSocketResult$Success$EtasList;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/app/RealtimeSocketResult$Success;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class EtasList implements Success {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LinkedHashMap f4313a;
            public final ProcessRTSDataResult b;

            public EtasList(LinkedHashMap linkedHashMap, ProcessRTSDataResult processRTSDataResult) {
                this.f4313a = linkedHashMap;
                this.b = processRTSDataResult;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof EtasList)) {
                    return false;
                }
                EtasList etasList = (EtasList) obj;
                return this.f4313a.equals(etasList.f4313a) && this.b.equals(etasList.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f4313a.hashCode() * 31);
            }

            public final String toString() {
                return "EtasList(allStopRouteIdEtaMap=" + this.f4313a + ", processResult=" + this.b + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/app/RealtimeSocketResult$Success$Route;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/app/RealtimeSocketResult$Success;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Route implements Success {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LinkedHashMap f4314a;
            public final ProcessRTSDataResult b;

            public Route(LinkedHashMap linkedHashMap, ProcessRTSDataResult processRTSDataResult) {
                this.f4314a = linkedHashMap;
                this.b = processRTSDataResult;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Route)) {
                    return false;
                }
                Route route = (Route) obj;
                return this.f4314a.equals(route.f4314a) && this.b.equals(route.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f4314a.hashCode() * 31);
            }

            public final String toString() {
                return "Route(routeVehicleMap=" + this.f4314a + ", processResult=" + this.b + ")";
            }
        }
    }
}
