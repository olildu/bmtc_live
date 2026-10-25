package app.chalo.livetracking.stoptripplannerresult.uistate;

import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import defpackage.t8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/StopBasedTripPlannerUiState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StopBasedTripPlannerUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StopBasedTripPlannerUiSpecs f4615a;
    public final ToolbarUIState b;
    public final TabsUiState c;
    public final TripPlannerOriginDestinationSearchbarUiState d;
    public final TripPlannerResultScreenState e;
    public final StopBasedTripPlannerResultBottomSheetUiStateType f;
    public final LoadingDialogUIState g;

    public StopBasedTripPlannerUiState(ToolbarUIState toolbar, TabsUiState tabs, TripPlannerOriginDestinationSearchbarUiState originDestinationSearchbar, TripPlannerResultScreenState resultScreenState, StopBasedTripPlannerResultBottomSheetUiStateType bottomSheetUIState, LoadingDialogUIState loadingDialogUIState) {
        StopBasedTripPlannerUiSpecs stopBasedTripPlannerUiSpecs = new StopBasedTripPlannerUiSpecs();
        Intrinsics.i(toolbar, "toolbar");
        Intrinsics.i(tabs, "tabs");
        Intrinsics.i(originDestinationSearchbar, "originDestinationSearchbar");
        Intrinsics.i(resultScreenState, "resultScreenState");
        Intrinsics.i(bottomSheetUIState, "bottomSheetUIState");
        this.f4615a = stopBasedTripPlannerUiSpecs;
        this.b = toolbar;
        this.c = tabs;
        this.d = originDestinationSearchbar;
        this.e = resultScreenState;
        this.f = bottomSheetUIState;
        this.g = loadingDialogUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StopBasedTripPlannerUiState)) {
            return false;
        }
        StopBasedTripPlannerUiState stopBasedTripPlannerUiState = (StopBasedTripPlannerUiState) obj;
        return Intrinsics.d(this.f4615a, stopBasedTripPlannerUiState.f4615a) && Intrinsics.d(this.b, stopBasedTripPlannerUiState.b) && Intrinsics.d(this.c, stopBasedTripPlannerUiState.c) && Intrinsics.d(this.d, stopBasedTripPlannerUiState.d) && Intrinsics.d(this.e, stopBasedTripPlannerUiState.e) && Intrinsics.d(this.f, stopBasedTripPlannerUiState.f) && Intrinsics.d(this.g, stopBasedTripPlannerUiState.g);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + t8.d(this.b, this.f4615a.hashCode() * 31, 31)) * 31)) * 31)) * 31)) * 31;
        LoadingDialogUIState loadingDialogUIState = this.g;
        return iHashCode + (loadingDialogUIState == null ? 0 : loadingDialogUIState.hashCode());
    }

    public final String toString() {
        return "StopBasedTripPlannerUiState(specs=" + this.f4615a + ", toolbar=" + this.b + ", tabs=" + this.c + ", originDestinationSearchbar=" + this.d + ", resultScreenState=" + this.e + ", bottomSheetUIState=" + this.f + ", loadingDialogUIState=" + this.g + ")";
    }
}
