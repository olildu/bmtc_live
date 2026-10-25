package app.chalo.metro.ui.confirmbooking.uistate;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.productbooking.common.uistate.TermsAndConditionsUiState;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.dialog.TnCDialogUIState;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.snackbar.SnackbarUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import defpackage.r30;
import defpackage.t8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/confirmbooking/uistate/ConfirmBookingScreenViewState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ConfirmBookingScreenViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConfirmBookingDetailsScreenUiSpec f5475a;
    public final ToolbarUIState b;
    public final JourneyDetailsUiState c;
    public final PriceDetailsUiState d;
    public final TermsAndConditionsUiState e;
    public final TnCDialogUIState f;
    public final ButtonUIState g;
    public final SnackbarUIState h;
    public final DividerUIState i;
    public final boolean j;
    public final LoadingDialogUIState k;

    public ConfirmBookingScreenViewState(ToolbarUIState toolbarUiState, JourneyDetailsUiState journeyDetailsUiState, PriceDetailsUiState priceDetailsUiState, TermsAndConditionsUiState termsAndConditionsUiState, TnCDialogUIState tnCDialogUIState, ButtonUIState payButtonUiState, SnackbarUIState snackbarUIState, boolean z, LoadingDialogUIState loadingDialogUIState) {
        ConfirmBookingDetailsScreenUiSpec confirmBookingDetailsScreenUiSpec = new ConfirmBookingDetailsScreenUiSpec();
        DividerUIState dividerUIState = new DividerUIState(ChaloThemeHelper.a().h, ChaloColorToken.SectionDividerColor.f9849a, null, 4);
        Intrinsics.i(toolbarUiState, "toolbarUiState");
        Intrinsics.i(journeyDetailsUiState, "journeyDetailsUiState");
        Intrinsics.i(priceDetailsUiState, "priceDetailsUiState");
        Intrinsics.i(payButtonUiState, "payButtonUiState");
        this.f5475a = confirmBookingDetailsScreenUiSpec;
        this.b = toolbarUiState;
        this.c = journeyDetailsUiState;
        this.d = priceDetailsUiState;
        this.e = termsAndConditionsUiState;
        this.f = tnCDialogUIState;
        this.g = payButtonUiState;
        this.h = snackbarUIState;
        this.i = dividerUIState;
        this.j = z;
        this.k = loadingDialogUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfirmBookingScreenViewState)) {
            return false;
        }
        ConfirmBookingScreenViewState confirmBookingScreenViewState = (ConfirmBookingScreenViewState) obj;
        return Intrinsics.d(this.f5475a, confirmBookingScreenViewState.f5475a) && Intrinsics.d(this.b, confirmBookingScreenViewState.b) && Intrinsics.d(this.c, confirmBookingScreenViewState.c) && Intrinsics.d(this.d, confirmBookingScreenViewState.d) && Intrinsics.d(this.e, confirmBookingScreenViewState.e) && Intrinsics.d(this.f, confirmBookingScreenViewState.f) && Intrinsics.d(this.g, confirmBookingScreenViewState.g) && Intrinsics.d(this.h, confirmBookingScreenViewState.h) && Intrinsics.d(this.i, confirmBookingScreenViewState.i) && this.j == confirmBookingScreenViewState.j && Intrinsics.d(this.k, confirmBookingScreenViewState.k);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + t8.d(this.b, this.f5475a.hashCode() * 31, 31)) * 31)) * 31;
        TermsAndConditionsUiState termsAndConditionsUiState = this.e;
        int iHashCode2 = (iHashCode + (termsAndConditionsUiState == null ? 0 : termsAndConditionsUiState.hashCode())) * 31;
        TnCDialogUIState tnCDialogUIState = this.f;
        int iD = r30.d(this.g, (iHashCode2 + (tnCDialogUIState == null ? 0 : tnCDialogUIState.hashCode())) * 31, 31);
        SnackbarUIState snackbarUIState = this.h;
        int iHashCode3 = (iD + (snackbarUIState == null ? 0 : snackbarUIState.hashCode())) * 31;
        DividerUIState dividerUIState = this.i;
        int iHashCode4 = (((iHashCode3 + (dividerUIState == null ? 0 : dividerUIState.hashCode())) * 31) + (this.j ? 1231 : 1237)) * 31;
        LoadingDialogUIState loadingDialogUIState = this.k;
        return iHashCode4 + (loadingDialogUIState != null ? loadingDialogUIState.hashCode() : 0);
    }

    public final String toString() {
        return "ConfirmBookingScreenViewState(uiSpec=" + this.f5475a + ", toolbarUiState=" + this.b + ", journeyDetailsUiState=" + this.c + ", priceDetailsUiState=" + this.d + ", termsAndConditionsUiState=" + this.e + ", termsAndConditionsDialogueState=" + this.f + ", payButtonUiState=" + this.g + ", snackbarUIState=" + this.h + ", sectionDividerUiState=" + this.i + ", showLoadingShimmer=" + this.j + ", loadingDialogUIState=" + this.k + ")";
    }
}
