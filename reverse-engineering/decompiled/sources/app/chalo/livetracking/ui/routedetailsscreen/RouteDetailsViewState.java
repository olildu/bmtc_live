package app.chalo.livetracking.ui.routedetailsscreen;

import app.chalo.compose.components.CircularProgressIndicatorUIState;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteAvailabilityDialogUIState;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsViewState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteDetailsViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LivePassengerIndicatorBottomSheetContentUIState f4877a;
    public final LoadingDialogUIState b;
    public final CircularProgressIndicatorUIState c;
    public final RouteDetailsViewTypeUIState d;
    public final RouteAvailabilityDialogUIState e;
    public final ReportProblemDialogUIState f;

    public RouteDetailsViewState(LivePassengerIndicatorBottomSheetContentUIState livePassengerIndicatorBottomSheetContentUIState, LoadingDialogUIState loadingDialogUIState, CircularProgressIndicatorUIState circularProgressIndicatorUIState, RouteDetailsViewTypeUIState routeDetailsViewTypeUIState, RouteAvailabilityDialogUIState routeAvailabilityDialogUIState, ReportProblemDialogUIState reportProblemDialogUIState) {
        this.f4877a = livePassengerIndicatorBottomSheetContentUIState;
        this.b = loadingDialogUIState;
        this.c = circularProgressIndicatorUIState;
        this.d = routeDetailsViewTypeUIState;
        this.e = routeAvailabilityDialogUIState;
        this.f = reportProblemDialogUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteDetailsViewState)) {
            return false;
        }
        RouteDetailsViewState routeDetailsViewState = (RouteDetailsViewState) obj;
        return Intrinsics.d(this.f4877a, routeDetailsViewState.f4877a) && Intrinsics.d(this.b, routeDetailsViewState.b) && Intrinsics.d(this.c, routeDetailsViewState.c) && Intrinsics.d(this.d, routeDetailsViewState.d) && Intrinsics.d(this.e, routeDetailsViewState.e) && Intrinsics.d(this.f, routeDetailsViewState.f);
    }

    public final int hashCode() {
        LivePassengerIndicatorBottomSheetContentUIState livePassengerIndicatorBottomSheetContentUIState = this.f4877a;
        int iHashCode = (livePassengerIndicatorBottomSheetContentUIState == null ? 0 : livePassengerIndicatorBottomSheetContentUIState.hashCode()) * 31;
        LoadingDialogUIState loadingDialogUIState = this.b;
        int iHashCode2 = (iHashCode + (loadingDialogUIState == null ? 0 : loadingDialogUIState.hashCode())) * 31;
        CircularProgressIndicatorUIState circularProgressIndicatorUIState = this.c;
        int iHashCode3 = (iHashCode2 + (circularProgressIndicatorUIState == null ? 0 : circularProgressIndicatorUIState.hashCode())) * 31;
        RouteDetailsViewTypeUIState routeDetailsViewTypeUIState = this.d;
        int iHashCode4 = (iHashCode3 + (routeDetailsViewTypeUIState == null ? 0 : routeDetailsViewTypeUIState.hashCode())) * 31;
        RouteAvailabilityDialogUIState routeAvailabilityDialogUIState = this.e;
        int iHashCode5 = (iHashCode4 + (routeAvailabilityDialogUIState == null ? 0 : routeAvailabilityDialogUIState.hashCode())) * 31;
        ReportProblemDialogUIState reportProblemDialogUIState = this.f;
        return iHashCode5 + (reportProblemDialogUIState != null ? reportProblemDialogUIState.hashCode() : 0);
    }

    public final String toString() {
        return "RouteDetailsViewState(livePassengerIndicatorBSContentUIState=" + this.f4877a + ", loadingDialog=" + this.b + ", fullScreenLoader=" + this.c + ", screenUIState=" + this.d + ", routeAvailabilityDialog=" + this.e + ", reportProblemDialog=" + this.f + ")";
    }
}
