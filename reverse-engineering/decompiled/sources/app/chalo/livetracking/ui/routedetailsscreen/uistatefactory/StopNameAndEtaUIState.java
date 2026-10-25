package app.chalo.livetracking.ui.routedetailsscreen.uistatefactory;

import app.chalo.uistate.text.SpecialFeaturesTagListUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/StopNameAndEtaUIState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StopNameAndEtaUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SpecialFeaturesTagListUIState f4955a;
    public final StopNameRouteScreenUIState b;
    public final StopCardUIState c;
    public final RouteNativeAdUIState d;
    public final RouteReportProblemCTAUIState e;

    public StopNameAndEtaUIState(SpecialFeaturesTagListUIState specialFeaturesTagListUIState, StopNameRouteScreenUIState stopName, StopCardUIState stopCardUIState, RouteNativeAdUIState routeNativeAdUIState, RouteReportProblemCTAUIState routeReportProblemCTAUIState) {
        Intrinsics.i(stopName, "stopName");
        this.f4955a = specialFeaturesTagListUIState;
        this.b = stopName;
        this.c = stopCardUIState;
        this.d = routeNativeAdUIState;
        this.e = routeReportProblemCTAUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StopNameAndEtaUIState)) {
            return false;
        }
        StopNameAndEtaUIState stopNameAndEtaUIState = (StopNameAndEtaUIState) obj;
        return Intrinsics.d(this.f4955a, stopNameAndEtaUIState.f4955a) && Intrinsics.d(this.b, stopNameAndEtaUIState.b) && Intrinsics.d(this.c, stopNameAndEtaUIState.c) && Intrinsics.d(this.d, stopNameAndEtaUIState.d) && Intrinsics.d(this.e, stopNameAndEtaUIState.e);
    }

    public final int hashCode() {
        SpecialFeaturesTagListUIState specialFeaturesTagListUIState = this.f4955a;
        int iHashCode = (this.b.hashCode() + ((specialFeaturesTagListUIState == null ? 0 : specialFeaturesTagListUIState.hashCode()) * 31)) * 31;
        StopCardUIState stopCardUIState = this.c;
        int iHashCode2 = (iHashCode + (stopCardUIState == null ? 0 : stopCardUIState.hashCode())) * 31;
        RouteNativeAdUIState routeNativeAdUIState = this.d;
        int iHashCode3 = (iHashCode2 + (routeNativeAdUIState == null ? 0 : routeNativeAdUIState.hashCode())) * 31;
        RouteReportProblemCTAUIState routeReportProblemCTAUIState = this.e;
        return iHashCode3 + (routeReportProblemCTAUIState != null ? routeReportProblemCTAUIState.hashCode() : 0);
    }

    public final String toString() {
        return "StopNameAndEtaUIState(tagList=" + this.f4955a + ", stopName=" + this.b + ", stopInfo=" + this.c + ", nativeAd=" + this.d + ", reportProblemCta=" + this.e + ")";
    }
}
