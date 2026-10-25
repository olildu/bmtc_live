package app.chalo.livetracking.tripplanner.domain;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/domain/ItineraryAndEtaHolder;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ItineraryAndEtaHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ItineraryLiveInfoRequest f4697a;
    public final ItineraryEtaInfo b;

    public ItineraryAndEtaHolder(ItineraryLiveInfoRequest itineraryInfo, ItineraryEtaInfo itineraryEtaInfo) {
        Intrinsics.i(itineraryInfo, "itineraryInfo");
        this.f4697a = itineraryInfo;
        this.b = itineraryEtaInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItineraryAndEtaHolder)) {
            return false;
        }
        ItineraryAndEtaHolder itineraryAndEtaHolder = (ItineraryAndEtaHolder) obj;
        return Intrinsics.d(this.f4697a, itineraryAndEtaHolder.f4697a) && Intrinsics.d(this.b, itineraryAndEtaHolder.b);
    }

    public final int hashCode() {
        int iHashCode = this.f4697a.hashCode() * 31;
        ItineraryEtaInfo itineraryEtaInfo = this.b;
        return iHashCode + (itineraryEtaInfo == null ? 0 : itineraryEtaInfo.hashCode());
    }

    public final String toString() {
        return "ItineraryAndEtaHolder(itineraryInfo=" + this.f4697a + ", etaInfo=" + this.b + ")";
    }
}
