package app.chalo.metro.ui.regular.uistate;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.metro.ui.landing.uistate.MetroTicketBenefitsContainerUiState;
import app.chalo.uistate.components.RecentlySearchedContainerUiState;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.fromto.StopBasedMetroFromToSelectionContainerUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import defpackage.py;
import defpackage.t8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/regular/uistate/StopBasedMetroLandingScreenViewState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StopBasedMetroLandingScreenViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StopBasedMetroLandingScreenUISpec f5553a;
    public final ToolbarUIState b;
    public final LoadingDialogUIState c;
    public final StopBasedMetroFromToSelectionContainerUIState d;
    public final RecentlySearchedContainerUiState e;
    public final StopBasedMetroLandingScreenBottomSheetUiStateType f;
    public final MetroTicketBenefitsContainerUiState g;
    public final DividerUIState h;
    public final TextUIState.StyledTextUIState i;

    public StopBasedMetroLandingScreenViewState(ToolbarUIState toolbarUIState, LoadingDialogUIState loadingDialogUIState, StopBasedMetroFromToSelectionContainerUIState stopBasedMetroFromToSelectionContainerUIState, RecentlySearchedContainerUiState recentlySearchedContainerUiState, StopBasedMetroLandingScreenBottomSheetUiStateType bottomSheetUIStateType, MetroTicketBenefitsContainerUiState metroTicketBenefitsContainerUiState, TextUIState.StyledTextUIState styledTextUIState) {
        StopBasedMetroLandingScreenUISpec stopBasedMetroLandingScreenUISpec = new StopBasedMetroLandingScreenUISpec();
        DividerUIState dividerUIState = new DividerUIState(ChaloThemeHelper.a().f, null, null, 6);
        Intrinsics.i(toolbarUIState, "toolbarUIState");
        Intrinsics.i(bottomSheetUIStateType, "bottomSheetUIStateType");
        this.f5553a = stopBasedMetroLandingScreenUISpec;
        this.b = toolbarUIState;
        this.c = loadingDialogUIState;
        this.d = stopBasedMetroFromToSelectionContainerUIState;
        this.e = recentlySearchedContainerUiState;
        this.f = bottomSheetUIStateType;
        this.g = metroTicketBenefitsContainerUiState;
        this.h = dividerUIState;
        this.i = styledTextUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StopBasedMetroLandingScreenViewState)) {
            return false;
        }
        StopBasedMetroLandingScreenViewState stopBasedMetroLandingScreenViewState = (StopBasedMetroLandingScreenViewState) obj;
        return Intrinsics.d(this.f5553a, stopBasedMetroLandingScreenViewState.f5553a) && Intrinsics.d(this.b, stopBasedMetroLandingScreenViewState.b) && Intrinsics.d(this.c, stopBasedMetroLandingScreenViewState.c) && Intrinsics.d(this.d, stopBasedMetroLandingScreenViewState.d) && Intrinsics.d(this.e, stopBasedMetroLandingScreenViewState.e) && Intrinsics.d(this.f, stopBasedMetroLandingScreenViewState.f) && Intrinsics.d(this.g, stopBasedMetroLandingScreenViewState.g) && Intrinsics.d(this.h, stopBasedMetroLandingScreenViewState.h) && Intrinsics.d(this.i, stopBasedMetroLandingScreenViewState.i);
    }

    public final int hashCode() {
        int iD = t8.d(this.b, this.f5553a.hashCode() * 31, 31);
        LoadingDialogUIState loadingDialogUIState = this.c;
        int iHashCode = (iD + (loadingDialogUIState == null ? 0 : loadingDialogUIState.hashCode())) * 31;
        StopBasedMetroFromToSelectionContainerUIState stopBasedMetroFromToSelectionContainerUIState = this.d;
        int iHashCode2 = (iHashCode + (stopBasedMetroFromToSelectionContainerUIState == null ? 0 : stopBasedMetroFromToSelectionContainerUIState.hashCode())) * 31;
        RecentlySearchedContainerUiState recentlySearchedContainerUiState = this.e;
        int iHashCode3 = (this.f.hashCode() + ((iHashCode2 + (recentlySearchedContainerUiState == null ? 0 : recentlySearchedContainerUiState.hashCode())) * 31)) * 31;
        MetroTicketBenefitsContainerUiState metroTicketBenefitsContainerUiState = this.g;
        int iC = py.c(this.h, (iHashCode3 + (metroTicketBenefitsContainerUiState == null ? 0 : metroTicketBenefitsContainerUiState.hashCode())) * 31, 31);
        TextUIState.StyledTextUIState styledTextUIState = this.i;
        return iC + (styledTextUIState != null ? styledTextUIState.hashCode() : 0);
    }

    public final String toString() {
        return "StopBasedMetroLandingScreenViewState(uiSpec=" + this.f5553a + ", toolbarUIState=" + this.b + ", loadingDialogUIState=" + this.c + ", metroFromToSelectionContainerUIState=" + this.d + ", recentStopSearchedUiState=" + this.e + ", bottomSheetUIStateType=" + this.f + ", benefitsContainerUiState=" + this.g + ", sectionDivderUiState=" + this.h + ", bottomInfoTextViewState=" + this.i + ")";
    }
}
