package app.chalo.metro.ui.landing.uistate;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.components.RecentlySearchedContainerUiState;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import defpackage.t8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/landing/uistate/MetroLandingScreenViewState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MetroLandingScreenViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MetroLandingScreenUISpec f5524a;
    public final ToolbarUIState b;
    public final LoadingDialogUIState c;
    public final MetroFromToSelectionContainerUIState d;
    public final RecentlySearchedContainerUiState e;
    public final MetroLandingScreenBottomSheetUiStateType f;
    public final MetroTicketBenefitsContainerUiState g;
    public final DividerUIState h;

    public MetroLandingScreenViewState(ToolbarUIState toolbarUIState, LoadingDialogUIState loadingDialogUIState, MetroFromToSelectionContainerUIState metroFromToSelectionContainerUIState, RecentlySearchedContainerUiState recentlySearchedContainerUiState, MetroLandingScreenBottomSheetUiStateType bottomSheetUIStateType, MetroTicketBenefitsContainerUiState metroTicketBenefitsContainerUiState) {
        MetroLandingScreenUISpec metroLandingScreenUISpec = new MetroLandingScreenUISpec();
        DividerUIState dividerUIState = new DividerUIState(ChaloThemeHelper.a().f, null, null, 6);
        Intrinsics.i(toolbarUIState, "toolbarUIState");
        Intrinsics.i(bottomSheetUIStateType, "bottomSheetUIStateType");
        this.f5524a = metroLandingScreenUISpec;
        this.b = toolbarUIState;
        this.c = loadingDialogUIState;
        this.d = metroFromToSelectionContainerUIState;
        this.e = recentlySearchedContainerUiState;
        this.f = bottomSheetUIStateType;
        this.g = metroTicketBenefitsContainerUiState;
        this.h = dividerUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetroLandingScreenViewState)) {
            return false;
        }
        MetroLandingScreenViewState metroLandingScreenViewState = (MetroLandingScreenViewState) obj;
        return Intrinsics.d(this.f5524a, metroLandingScreenViewState.f5524a) && Intrinsics.d(this.b, metroLandingScreenViewState.b) && Intrinsics.d(this.c, metroLandingScreenViewState.c) && Intrinsics.d(this.d, metroLandingScreenViewState.d) && Intrinsics.d(this.e, metroLandingScreenViewState.e) && Intrinsics.d(this.f, metroLandingScreenViewState.f) && Intrinsics.d(this.g, metroLandingScreenViewState.g) && Intrinsics.d(this.h, metroLandingScreenViewState.h);
    }

    public final int hashCode() {
        int iD = t8.d(this.b, this.f5524a.hashCode() * 31, 31);
        LoadingDialogUIState loadingDialogUIState = this.c;
        int iHashCode = (iD + (loadingDialogUIState == null ? 0 : loadingDialogUIState.hashCode())) * 31;
        MetroFromToSelectionContainerUIState metroFromToSelectionContainerUIState = this.d;
        int iHashCode2 = (iHashCode + (metroFromToSelectionContainerUIState == null ? 0 : metroFromToSelectionContainerUIState.hashCode())) * 31;
        RecentlySearchedContainerUiState recentlySearchedContainerUiState = this.e;
        int iHashCode3 = (this.f.hashCode() + ((iHashCode2 + (recentlySearchedContainerUiState == null ? 0 : recentlySearchedContainerUiState.hashCode())) * 31)) * 31;
        MetroTicketBenefitsContainerUiState metroTicketBenefitsContainerUiState = this.g;
        return this.h.hashCode() + ((iHashCode3 + (metroTicketBenefitsContainerUiState != null ? metroTicketBenefitsContainerUiState.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "MetroLandingScreenViewState(uiSpec=" + this.f5524a + ", toolbarUIState=" + this.b + ", loadingDialogUIState=" + this.c + ", metroFromToSelectionContainerUIState=" + this.d + ", recentStopSearchedUiState=" + this.e + ", bottomSheetUIStateType=" + this.f + ", benefitsContainerUiState=" + this.g + ", sectionDivderUiState=" + this.h + ")";
    }
}
