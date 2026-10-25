package app.chalo.tripreceipt.tripreceiptnew;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import defpackage.py;
import defpackage.r30;
import defpackage.t8;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/tripreceipt/tripreceiptnew/RideReceiptViewState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RideReceiptViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RideReceiptUISpec f9743a;
    public final ToolbarUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final TextUIState.ChaloTextUIState d;
    public final DividerUIState e;
    public final List f;
    public final LoadingDialogUIState g;

    public RideReceiptViewState(ToolbarUIState toolbarUIState, TextUIState.ChaloTextUIState cantFindYourTripTitle, TextUIState.ChaloTextUIState cantFindYourTripMsg, List busTicketsUiState, LoadingDialogUIState loadingDialogUIState) {
        RideReceiptUISpec rideReceiptUISpec = new RideReceiptUISpec();
        DividerUIState dividerUIState = new DividerUIState(ChaloThemeHelper.a().f, ChaloColorToken.SectionDividerColor.f9849a, null, 4);
        Intrinsics.i(cantFindYourTripTitle, "cantFindYourTripTitle");
        Intrinsics.i(cantFindYourTripMsg, "cantFindYourTripMsg");
        Intrinsics.i(busTicketsUiState, "busTicketsUiState");
        this.f9743a = rideReceiptUISpec;
        this.b = toolbarUIState;
        this.c = cantFindYourTripTitle;
        this.d = cantFindYourTripMsg;
        this.e = dividerUIState;
        this.f = busTicketsUiState;
        this.g = loadingDialogUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideReceiptViewState)) {
            return false;
        }
        RideReceiptViewState rideReceiptViewState = (RideReceiptViewState) obj;
        return Intrinsics.d(this.f9743a, rideReceiptViewState.f9743a) && Intrinsics.d(this.b, rideReceiptViewState.b) && Intrinsics.d(this.c, rideReceiptViewState.c) && Intrinsics.d(this.d, rideReceiptViewState.d) && Intrinsics.d(this.e, rideReceiptViewState.e) && Intrinsics.d(this.f, rideReceiptViewState.f) && Intrinsics.d(this.g, rideReceiptViewState.g);
    }

    public final int hashCode() {
        int iB = r30.b(py.c(this.e, r30.f(this.d, r30.f(this.c, t8.d(this.b, this.f9743a.f9742a.hashCode() * 31, 31), 31), 31), 31), 31, this.f);
        LoadingDialogUIState loadingDialogUIState = this.g;
        return iB + (loadingDialogUIState == null ? 0 : loadingDialogUIState.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RideReceiptViewState(spec=");
        sb.append(this.f9743a);
        sb.append(", toolbarUIState=");
        sb.append(this.b);
        sb.append(", cantFindYourTripTitle=");
        r30.p(sb, this.c, ", cantFindYourTripMsg=", this.d, ", componentSeparatorDividerUIState=");
        sb.append(this.e);
        sb.append(", busTicketsUiState=");
        sb.append(this.f);
        sb.append(", loadingDialogUIState=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
