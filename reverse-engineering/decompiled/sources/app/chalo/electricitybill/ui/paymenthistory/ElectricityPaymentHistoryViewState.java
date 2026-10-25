package app.chalo.electricitybill.ui.paymenthistory;

import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.snackbar.SnackbarUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/paymenthistory/ElectricityPaymentHistoryViewState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ElectricityPaymentHistoryViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ToolbarUIState f2604a;
    public final LoadingDialogUIState b;
    public final ElectricityPaymentHistoryScreenUIState c;
    public final SnackbarUIState d;

    public ElectricityPaymentHistoryViewState(ToolbarUIState toolbar, LoadingDialogUIState loadingDialogUIState, ElectricityPaymentHistoryScreenUIState screenUIState, SnackbarUIState snackbarUIState) {
        Intrinsics.i(toolbar, "toolbar");
        Intrinsics.i(screenUIState, "screenUIState");
        this.f2604a = toolbar;
        this.b = loadingDialogUIState;
        this.c = screenUIState;
        this.d = snackbarUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ElectricityPaymentHistoryViewState)) {
            return false;
        }
        ElectricityPaymentHistoryViewState electricityPaymentHistoryViewState = (ElectricityPaymentHistoryViewState) obj;
        return Intrinsics.d(this.f2604a, electricityPaymentHistoryViewState.f2604a) && Intrinsics.d(this.b, electricityPaymentHistoryViewState.b) && Intrinsics.d(this.c, electricityPaymentHistoryViewState.c) && Intrinsics.d(this.d, electricityPaymentHistoryViewState.d);
    }

    public final int hashCode() {
        int iHashCode = this.f2604a.hashCode() * 31;
        LoadingDialogUIState loadingDialogUIState = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (loadingDialogUIState == null ? 0 : loadingDialogUIState.hashCode())) * 31)) * 31;
        SnackbarUIState snackbarUIState = this.d;
        return iHashCode2 + (snackbarUIState != null ? snackbarUIState.hashCode() : 0);
    }

    public final String toString() {
        return "ElectricityPaymentHistoryViewState(toolbar=" + this.f2604a + ", loader=" + this.b + ", screenUIState=" + this.c + ", snackbarUIState=" + this.d + ")";
    }
}
