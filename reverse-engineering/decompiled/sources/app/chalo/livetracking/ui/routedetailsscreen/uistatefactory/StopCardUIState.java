package app.chalo.livetracking.ui.routedetailsscreen.uistatefactory;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/StopCardUIState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StopCardUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RouteAvailabilityBannerUIState f4954a;
    public final RouteEtaStatusUIState b;
    public final StopCardCtaUIState c;
    public final StopCardUISpec d;

    public StopCardUIState(RouteAvailabilityBannerUIState routeAvailabilityBannerUIState, RouteEtaStatusUIState routeEtaStatusUIState, StopCardCtaUIState stopCardCtaUIState) {
        StopCardUISpec stopCardUISpec = new StopCardUISpec();
        this.f4954a = routeAvailabilityBannerUIState;
        this.b = routeEtaStatusUIState;
        this.c = stopCardCtaUIState;
        this.d = stopCardUISpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StopCardUIState)) {
            return false;
        }
        StopCardUIState stopCardUIState = (StopCardUIState) obj;
        return Intrinsics.d(this.f4954a, stopCardUIState.f4954a) && Intrinsics.d(this.b, stopCardUIState.b) && Intrinsics.d(this.c, stopCardUIState.c) && Intrinsics.d(this.d, stopCardUIState.d);
    }

    public final int hashCode() {
        RouteAvailabilityBannerUIState routeAvailabilityBannerUIState = this.f4954a;
        int iHashCode = (routeAvailabilityBannerUIState == null ? 0 : routeAvailabilityBannerUIState.hashCode()) * 31;
        RouteEtaStatusUIState routeEtaStatusUIState = this.b;
        int iHashCode2 = (iHashCode + (routeEtaStatusUIState == null ? 0 : routeEtaStatusUIState.hashCode())) * 31;
        StopCardCtaUIState stopCardCtaUIState = this.c;
        return this.d.hashCode() + ((iHashCode2 + (stopCardCtaUIState != null ? stopCardCtaUIState.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "StopCardUIState(routeBannerAvailability=" + this.f4954a + ", eta=" + this.b + ", cardCta=" + this.c + ", spec=" + this.d + ")";
    }
}
