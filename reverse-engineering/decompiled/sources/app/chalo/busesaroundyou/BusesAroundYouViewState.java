package app.chalo.busesaroundyou;

import app.chalo.uistate.button.IconButtonUIState;
import app.chalo.uistate.components.map.ChaloMapUIState;
import app.chalo.uistate.dialog.ConfirmationDialogUiState;
import app.chalo.uistate.snackbar.SnackbarUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import defpackage.t8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/busesaroundyou/BusesAroundYouViewState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BusesAroundYouViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BusesAroundYouUISpecs f1186a;
    public final ToolbarUIState b;
    public final ChaloMapUIState c;
    public final IconButtonUIState d;
    public final SnackbarUIState e;
    public final ConfirmationDialogUiState f;

    public BusesAroundYouViewState(ToolbarUIState toolBar, ChaloMapUIState map, IconButtonUIState myLocationButton, SnackbarUIState snackbarUIState, ConfirmationDialogUiState confirmationDialogUiState) {
        BusesAroundYouUISpecs busesAroundYouUISpecs = new BusesAroundYouUISpecs();
        Intrinsics.i(toolBar, "toolBar");
        Intrinsics.i(map, "map");
        Intrinsics.i(myLocationButton, "myLocationButton");
        this.f1186a = busesAroundYouUISpecs;
        this.b = toolBar;
        this.c = map;
        this.d = myLocationButton;
        this.e = snackbarUIState;
        this.f = confirmationDialogUiState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BusesAroundYouViewState)) {
            return false;
        }
        BusesAroundYouViewState busesAroundYouViewState = (BusesAroundYouViewState) obj;
        return Intrinsics.d(this.f1186a, busesAroundYouViewState.f1186a) && Intrinsics.d(this.b, busesAroundYouViewState.b) && Intrinsics.d(this.c, busesAroundYouViewState.c) && Intrinsics.d(this.d, busesAroundYouViewState.d) && Intrinsics.d(this.e, busesAroundYouViewState.e) && Intrinsics.d(this.f, busesAroundYouViewState.f);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + t8.d(this.b, this.f1186a.f1185a.hashCode() * 31, 31)) * 31)) * 31;
        SnackbarUIState snackbarUIState = this.e;
        int iHashCode2 = (iHashCode + (snackbarUIState == null ? 0 : snackbarUIState.hashCode())) * 31;
        ConfirmationDialogUiState confirmationDialogUiState = this.f;
        return iHashCode2 + (confirmationDialogUiState != null ? confirmationDialogUiState.hashCode() : 0);
    }

    public final String toString() {
        return "BusesAroundYouViewState(specs=" + this.f1186a + ", toolBar=" + this.b + ", map=" + this.c + ", myLocationButton=" + this.d + ", networkSnackBar=" + this.e + ", locationPermissionDialog=" + this.f + ")";
    }
}
