package app.chalo.productbooking.pickroutelocation;

import app.chalo.uistate.dialog.ConfirmationDialogUiState;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.searchbar.SearchBarWithActionUIState;
import app.chalo.uistate.snackbar.SnackbarUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/pickroutelocation/PickRouteLocationViewState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PickRouteLocationViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PickRouteLocationUiSpecs f8287a;
    public final LoadingDialogUIState b;
    public final SearchBarWithActionUIState c;
    public final SearchScreenLayoutUiType d;
    public final SnackbarUIState e;
    public final ConfirmationDialogUiState f;

    public PickRouteLocationViewState(LoadingDialogUIState loadingDialogUIState, SearchBarWithActionUIState searchBarUiState, SearchScreenLayoutUiType searchScreenLayoutUiType, SnackbarUIState snackbarUIState, ConfirmationDialogUiState confirmationDialogUiState) {
        PickRouteLocationUiSpecs pickRouteLocationUiSpecs = new PickRouteLocationUiSpecs();
        Intrinsics.i(searchBarUiState, "searchBarUiState");
        this.f8287a = pickRouteLocationUiSpecs;
        this.b = loadingDialogUIState;
        this.c = searchBarUiState;
        this.d = searchScreenLayoutUiType;
        this.e = snackbarUIState;
        this.f = confirmationDialogUiState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PickRouteLocationViewState)) {
            return false;
        }
        PickRouteLocationViewState pickRouteLocationViewState = (PickRouteLocationViewState) obj;
        return Intrinsics.d(this.f8287a, pickRouteLocationViewState.f8287a) && Intrinsics.d(this.b, pickRouteLocationViewState.b) && Intrinsics.d(this.c, pickRouteLocationViewState.c) && Intrinsics.d(this.d, pickRouteLocationViewState.d) && Intrinsics.d(this.e, pickRouteLocationViewState.e) && Intrinsics.d(this.f, pickRouteLocationViewState.f);
    }

    public final int hashCode() {
        int iHashCode = this.f8287a.hashCode() * 31;
        LoadingDialogUIState loadingDialogUIState = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (loadingDialogUIState == null ? 0 : loadingDialogUIState.hashCode())) * 31)) * 31;
        SearchScreenLayoutUiType searchScreenLayoutUiType = this.d;
        int iHashCode3 = (iHashCode2 + (searchScreenLayoutUiType == null ? 0 : searchScreenLayoutUiType.hashCode())) * 31;
        SnackbarUIState snackbarUIState = this.e;
        int iHashCode4 = (iHashCode3 + (snackbarUIState == null ? 0 : snackbarUIState.hashCode())) * 31;
        ConfirmationDialogUiState confirmationDialogUiState = this.f;
        return iHashCode4 + (confirmationDialogUiState != null ? confirmationDialogUiState.hashCode() : 0);
    }

    public final String toString() {
        return "PickRouteLocationViewState(specs=" + this.f8287a + ", loader=" + this.b + ", searchBarUiState=" + this.c + ", layoutUiType=" + this.d + ", snackbarUIState=" + this.e + ", mobileTicketingNotAvailableDialog=" + this.f + ")";
    }
}
