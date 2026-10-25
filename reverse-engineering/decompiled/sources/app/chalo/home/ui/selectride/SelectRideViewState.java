package app.chalo.home.ui.selectride;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.premiumbus.ui.passpurchaselanding.SearchFieldWithSwapButtonCardUIState;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionDateAndTimePickerUIState;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import defpackage.py;
import defpackage.t8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/selectride/SelectRideViewState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SelectRideViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SelectRideViewSpecs f3701a;
    public final ToolbarUIState b;
    public final SearchFieldWithSwapButtonCardUIState c;
    public final RideSavedSuccessFailureScreenUIState d;
    public final LoadingDialogUIState e;
    public final DividerUIState f;
    public final PremiumBusSlotSelectionDateAndTimePickerUIState g;

    static {
        int i = SearchFieldWithSwapButtonCardUIState.d;
    }

    public SelectRideViewState(ToolbarUIState toolbarUIState, SearchFieldWithSwapButtonCardUIState searchFieldWithSwapButtonCardUIState, RideSavedSuccessFailureScreenUIState rideSavedSuccessFailureScreenUIState, LoadingDialogUIState loadingDialogUIState, PremiumBusSlotSelectionDateAndTimePickerUIState premiumBusSlotSelectionDateAndTimePickerUIState) {
        SelectRideViewSpecs selectRideViewSpecs = new SelectRideViewSpecs();
        DividerUIState dividerUIState = new DividerUIState(ChaloThemeHelper.a().f, ChaloColorToken.DividerColor.f9793a, null, 4);
        Intrinsics.i(toolbarUIState, "toolbarUIState");
        this.f3701a = selectRideViewSpecs;
        this.b = toolbarUIState;
        this.c = searchFieldWithSwapButtonCardUIState;
        this.d = rideSavedSuccessFailureScreenUIState;
        this.e = loadingDialogUIState;
        this.f = dividerUIState;
        this.g = premiumBusSlotSelectionDateAndTimePickerUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectRideViewState)) {
            return false;
        }
        SelectRideViewState selectRideViewState = (SelectRideViewState) obj;
        return Intrinsics.d(this.f3701a, selectRideViewState.f3701a) && Intrinsics.d(this.b, selectRideViewState.b) && Intrinsics.d(this.c, selectRideViewState.c) && Intrinsics.d(this.d, selectRideViewState.d) && Intrinsics.d(this.e, selectRideViewState.e) && Intrinsics.d(this.f, selectRideViewState.f) && Intrinsics.d(this.g, selectRideViewState.g);
    }

    public final int hashCode() {
        int iD = t8.d(this.b, this.f3701a.hashCode() * 31, 31);
        SearchFieldWithSwapButtonCardUIState searchFieldWithSwapButtonCardUIState = this.c;
        int iHashCode = (iD + (searchFieldWithSwapButtonCardUIState == null ? 0 : searchFieldWithSwapButtonCardUIState.hashCode())) * 31;
        RideSavedSuccessFailureScreenUIState rideSavedSuccessFailureScreenUIState = this.d;
        int iHashCode2 = (iHashCode + (rideSavedSuccessFailureScreenUIState == null ? 0 : rideSavedSuccessFailureScreenUIState.hashCode())) * 31;
        LoadingDialogUIState loadingDialogUIState = this.e;
        int iC = py.c(this.f, (iHashCode2 + (loadingDialogUIState == null ? 0 : loadingDialogUIState.hashCode())) * 31, 31);
        PremiumBusSlotSelectionDateAndTimePickerUIState premiumBusSlotSelectionDateAndTimePickerUIState = this.g;
        return iC + (premiumBusSlotSelectionDateAndTimePickerUIState != null ? premiumBusSlotSelectionDateAndTimePickerUIState.hashCode() : 0);
    }

    public final String toString() {
        return "SelectRideViewState(specs=" + this.f3701a + ", toolbarUIState=" + this.b + ", fromAndToStopCardUIState=" + this.c + ", successScreenFailureUIState=" + this.d + ", dialogUIState=" + this.e + ", dividerUIState=" + this.f + ", premiumBusSlotSelectionDateAndTimePickerUIState=" + this.g + ")";
    }
}
