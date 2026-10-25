package app.chalo.premiumbus.ui.faredetails.contract;

import app.chalo.uistate.dialog.ConfirmationDialogUiState;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsUiState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusFareDetailsUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ToolbarUIState f7614a;
    public final PremiumBusFareDetailsTripSummaryUiState b;
    public final PremiumBusFareDetailsContent c;
    public final LoadingDialogUIState d;
    public final ConfirmationDialogUiState e;
    public final PremiumBusFareDetailsScreenUISpecs f;

    public PremiumBusFareDetailsUiState(ToolbarUIState toolbarUIState, PremiumBusFareDetailsTripSummaryUiState premiumBusFareDetailsTripSummaryUiState, PremiumBusFareDetailsContent content, LoadingDialogUIState loadingDialogUIState, ConfirmationDialogUiState confirmationDialogUiState) {
        PremiumBusFareDetailsScreenUISpecs premiumBusFareDetailsScreenUISpecs = new PremiumBusFareDetailsScreenUISpecs();
        Intrinsics.i(toolbarUIState, "toolbarUIState");
        Intrinsics.i(content, "content");
        this.f7614a = toolbarUIState;
        this.b = premiumBusFareDetailsTripSummaryUiState;
        this.c = content;
        this.d = loadingDialogUIState;
        this.e = confirmationDialogUiState;
        this.f = premiumBusFareDetailsScreenUISpecs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusFareDetailsUiState)) {
            return false;
        }
        PremiumBusFareDetailsUiState premiumBusFareDetailsUiState = (PremiumBusFareDetailsUiState) obj;
        return Intrinsics.d(this.f7614a, premiumBusFareDetailsUiState.f7614a) && Intrinsics.d(this.b, premiumBusFareDetailsUiState.b) && Intrinsics.d(this.c, premiumBusFareDetailsUiState.c) && Intrinsics.d(this.d, premiumBusFareDetailsUiState.d) && Intrinsics.d(this.e, premiumBusFareDetailsUiState.e) && Intrinsics.d(this.f, premiumBusFareDetailsUiState.f);
    }

    public final int hashCode() {
        int iHashCode = this.f7614a.hashCode() * 31;
        PremiumBusFareDetailsTripSummaryUiState premiumBusFareDetailsTripSummaryUiState = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (premiumBusFareDetailsTripSummaryUiState == null ? 0 : premiumBusFareDetailsTripSummaryUiState.hashCode())) * 31)) * 31;
        LoadingDialogUIState loadingDialogUIState = this.d;
        int iHashCode3 = (iHashCode2 + (loadingDialogUIState == null ? 0 : loadingDialogUIState.hashCode())) * 31;
        ConfirmationDialogUiState confirmationDialogUiState = this.e;
        return this.f.hashCode() + ((iHashCode3 + (confirmationDialogUiState != null ? confirmationDialogUiState.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PremiumBusFareDetailsUiState(toolbarUIState=" + this.f7614a + ", tripSummary=" + this.b + ", content=" + this.c + ", switchLoadingDialogUIState=" + this.d + ", switchErrorDialogUIState=" + this.e + ", specs=" + this.f + ")";
    }
}
