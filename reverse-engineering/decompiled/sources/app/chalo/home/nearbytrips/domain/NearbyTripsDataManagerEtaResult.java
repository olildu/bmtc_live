package app.chalo.home.nearbytrips.domain;

import app.chalo.livetracking.tripplanner.domain.ItineraryEtaInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/nearbytrips/domain/NearbyTripsDataManagerEtaResult;", "", "EtaReceived", "EtaNotReceived", "Lapp/chalo/home/nearbytrips/domain/NearbyTripsDataManagerEtaResult$EtaNotReceived;", "Lapp/chalo/home/nearbytrips/domain/NearbyTripsDataManagerEtaResult$EtaReceived;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class NearbyTripsDataManagerEtaResult {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/nearbytrips/domain/NearbyTripsDataManagerEtaResult$EtaNotReceived;", "Lapp/chalo/home/nearbytrips/domain/NearbyTripsDataManagerEtaResult;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class EtaNotReceived extends NearbyTripsDataManagerEtaResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EtaNotReceived f3119a = new EtaNotReceived();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/nearbytrips/domain/NearbyTripsDataManagerEtaResult$EtaReceived;", "Lapp/chalo/home/nearbytrips/domain/NearbyTripsDataManagerEtaResult;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EtaReceived extends NearbyTripsDataManagerEtaResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ItineraryEtaInfo f3120a;

        public EtaReceived(ItineraryEtaInfo itineraryEtaInfo) {
            this.f3120a = itineraryEtaInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EtaReceived) && Intrinsics.d(this.f3120a, ((EtaReceived) obj).f3120a);
        }

        public final int hashCode() {
            ItineraryEtaInfo itineraryEtaInfo = this.f3120a;
            if (itineraryEtaInfo == null) {
                return 0;
            }
            return itineraryEtaInfo.hashCode();
        }

        public final String toString() {
            return "EtaReceived(etaInfo=" + this.f3120a + ")";
        }
    }

    public final ItineraryEtaInfo a() {
        EtaReceived etaReceived = this instanceof EtaReceived ? (EtaReceived) this : null;
        if (etaReceived != null) {
            return etaReceived.f3120a;
        }
        return null;
    }
}
