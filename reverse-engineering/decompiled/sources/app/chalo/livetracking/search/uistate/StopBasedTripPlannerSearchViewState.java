package app.chalo.livetracking.search.uistate;

import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.fromto.StopBasedMetroFromToSelectionContainerUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import defpackage.t8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/search/uistate/StopBasedTripPlannerSearchViewState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StopBasedTripPlannerSearchViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StopBasedTripPlannerSearchUISpec f4524a;
    public final ToolbarUIState b;
    public final LoadingDialogUIState c;
    public final StopBasedMetroFromToSelectionContainerUIState d;
    public final RecentSearchSectionUIState e;
    public final StopBasedTripPlannerSearchBottomSheetUiStateType f;
    public final DividerUIState g;

    public StopBasedTripPlannerSearchViewState(ToolbarUIState toolbarUIState, LoadingDialogUIState loadingDialogUIState, StopBasedMetroFromToSelectionContainerUIState stopBasedMetroFromToSelectionContainerUIState, RecentSearchSectionUIState recentSearchSectionUIState, StopBasedTripPlannerSearchBottomSheetUiStateType bottomSheetUIStateType, int i) {
        StopBasedTripPlannerSearchUISpec stopBasedTripPlannerSearchUISpec = new StopBasedTripPlannerSearchUISpec();
        loadingDialogUIState = (i & 4) != 0 ? null : loadingDialogUIState;
        DividerUIState dividerUIState = new DividerUIState(0.0f, null, null, 7);
        Intrinsics.i(toolbarUIState, "toolbarUIState");
        Intrinsics.i(bottomSheetUIStateType, "bottomSheetUIStateType");
        this.f4524a = stopBasedTripPlannerSearchUISpec;
        this.b = toolbarUIState;
        this.c = loadingDialogUIState;
        this.d = stopBasedMetroFromToSelectionContainerUIState;
        this.e = recentSearchSectionUIState;
        this.f = bottomSheetUIStateType;
        this.g = dividerUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StopBasedTripPlannerSearchViewState)) {
            return false;
        }
        StopBasedTripPlannerSearchViewState stopBasedTripPlannerSearchViewState = (StopBasedTripPlannerSearchViewState) obj;
        return Intrinsics.d(this.f4524a, stopBasedTripPlannerSearchViewState.f4524a) && Intrinsics.d(this.b, stopBasedTripPlannerSearchViewState.b) && Intrinsics.d(this.c, stopBasedTripPlannerSearchViewState.c) && Intrinsics.d(this.d, stopBasedTripPlannerSearchViewState.d) && Intrinsics.d(this.e, stopBasedTripPlannerSearchViewState.e) && Intrinsics.d(this.f, stopBasedTripPlannerSearchViewState.f) && Intrinsics.d(this.g, stopBasedTripPlannerSearchViewState.g);
    }

    public final int hashCode() {
        int iD = t8.d(this.b, this.f4524a.hashCode() * 31, 31);
        LoadingDialogUIState loadingDialogUIState = this.c;
        int iHashCode = (iD + (loadingDialogUIState == null ? 0 : loadingDialogUIState.hashCode())) * 31;
        StopBasedMetroFromToSelectionContainerUIState stopBasedMetroFromToSelectionContainerUIState = this.d;
        int iHashCode2 = (iHashCode + (stopBasedMetroFromToSelectionContainerUIState == null ? 0 : stopBasedMetroFromToSelectionContainerUIState.hashCode())) * 31;
        RecentSearchSectionUIState recentSearchSectionUIState = this.e;
        return this.g.hashCode() + ((this.f.hashCode() + ((iHashCode2 + (recentSearchSectionUIState != null ? recentSearchSectionUIState.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "StopBasedTripPlannerSearchViewState(uiSpec=" + this.f4524a + ", toolbarUIState=" + this.b + ", loadingDialogUIState=" + this.c + ", fromToSelectionContainerUIState=" + this.d + ", recentTripsUiState=" + this.e + ", bottomSheetUIStateType=" + this.f + ", toolbarDividerUiState=" + this.g + ")";
    }
}
