package app.chalo.mticket.ui.passengerselection;

import app.chalo.data.ProductBookingBranding;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.dialog.ConfirmationDialogUiState;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.dialog.TnCDialogUIState;
import app.chalo.uistate.error.StandardErrorScreenUIState;
import app.chalo.uistate.snackbar.SnackbarUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import defpackage.pk0;
import defpackage.t8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerSelectionUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MTicketPassengerSelectionUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MTicketPassengerSelectionUISpec f5758a;
    public final StandardErrorScreenUIState b;
    public final ToolbarUIState c;
    public final MTicketRouteDetailsUIState d;
    public final TextUIState e;
    public final ProductBookingBranding f;
    public final ButtonUIState g;
    public final SnackbarUIState h;
    public final LoadingDialogUIState i;
    public final TnCDialogUIState j;
    public final MTicketPassengerLayoutUIState k;
    public final ConfirmationDialogUiState l;

    public MTicketPassengerSelectionUIState(StandardErrorScreenUIState.ErrorWithMsgAndRetry errorWithMsgAndRetry, ToolbarUIState toolbar, MTicketRouteDetailsUIState mTicketRouteDetailsUIState, TextUIState termsText, ProductBookingBranding brandingType, ButtonUIState buttonUIState, SnackbarUIState snackbarUIState, LoadingDialogUIState loadingDialogUIState, TnCDialogUIState tnCDialogUIState, MTicketPassengerLayoutUIState mTicketPassengerLayoutUIState, ConfirmationDialogUiState confirmationDialogUiState) {
        MTicketPassengerSelectionUISpec mTicketPassengerSelectionUISpec = new MTicketPassengerSelectionUISpec();
        Intrinsics.i(toolbar, "toolbar");
        Intrinsics.i(termsText, "termsText");
        Intrinsics.i(brandingType, "brandingType");
        this.f5758a = mTicketPassengerSelectionUISpec;
        this.b = errorWithMsgAndRetry;
        this.c = toolbar;
        this.d = mTicketRouteDetailsUIState;
        this.e = termsText;
        this.f = brandingType;
        this.g = buttonUIState;
        this.h = snackbarUIState;
        this.i = loadingDialogUIState;
        this.j = tnCDialogUIState;
        this.k = mTicketPassengerLayoutUIState;
        this.l = confirmationDialogUiState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MTicketPassengerSelectionUIState)) {
            return false;
        }
        MTicketPassengerSelectionUIState mTicketPassengerSelectionUIState = (MTicketPassengerSelectionUIState) obj;
        return Intrinsics.d(this.f5758a, mTicketPassengerSelectionUIState.f5758a) && Intrinsics.d(this.b, mTicketPassengerSelectionUIState.b) && Intrinsics.d(this.c, mTicketPassengerSelectionUIState.c) && Intrinsics.d(this.d, mTicketPassengerSelectionUIState.d) && Intrinsics.d(this.e, mTicketPassengerSelectionUIState.e) && Intrinsics.d(this.f, mTicketPassengerSelectionUIState.f) && Intrinsics.d(this.g, mTicketPassengerSelectionUIState.g) && Intrinsics.d(this.h, mTicketPassengerSelectionUIState.h) && Intrinsics.d(this.i, mTicketPassengerSelectionUIState.i) && Intrinsics.d(this.j, mTicketPassengerSelectionUIState.j) && Intrinsics.d(this.k, mTicketPassengerSelectionUIState.k) && Intrinsics.d(this.l, mTicketPassengerSelectionUIState.l);
    }

    public final int hashCode() {
        int iHashCode = this.f5758a.hashCode() * 31;
        StandardErrorScreenUIState standardErrorScreenUIState = this.b;
        int iD = t8.d(this.c, (iHashCode + (standardErrorScreenUIState == null ? 0 : standardErrorScreenUIState.hashCode())) * 31, 31);
        MTicketRouteDetailsUIState mTicketRouteDetailsUIState = this.d;
        int iHashCode2 = (this.f.hashCode() + pk0.c(this.e, (iD + (mTicketRouteDetailsUIState == null ? 0 : mTicketRouteDetailsUIState.hashCode())) * 31, 31)) * 31;
        ButtonUIState buttonUIState = this.g;
        int iHashCode3 = (iHashCode2 + (buttonUIState == null ? 0 : buttonUIState.hashCode())) * 31;
        SnackbarUIState snackbarUIState = this.h;
        int iHashCode4 = (iHashCode3 + (snackbarUIState == null ? 0 : snackbarUIState.hashCode())) * 31;
        LoadingDialogUIState loadingDialogUIState = this.i;
        int iHashCode5 = (iHashCode4 + (loadingDialogUIState == null ? 0 : loadingDialogUIState.hashCode())) * 31;
        TnCDialogUIState tnCDialogUIState = this.j;
        int iHashCode6 = (iHashCode5 + (tnCDialogUIState == null ? 0 : tnCDialogUIState.hashCode())) * 31;
        MTicketPassengerLayoutUIState mTicketPassengerLayoutUIState = this.k;
        int iHashCode7 = (iHashCode6 + (mTicketPassengerLayoutUIState == null ? 0 : mTicketPassengerLayoutUIState.hashCode())) * 31;
        ConfirmationDialogUiState confirmationDialogUiState = this.l;
        return iHashCode7 + (confirmationDialogUiState != null ? confirmationDialogUiState.hashCode() : 0);
    }

    public final String toString() {
        return "MTicketPassengerSelectionUIState(spec=" + this.f5758a + ", errorScreen=" + this.b + ", toolbar=" + this.c + ", routeDetails=" + this.d + ", termsText=" + this.e + ", brandingType=" + this.f + ", payBtn=" + this.g + ", snackBar=" + this.h + ", loadingDialog=" + this.i + ", tncDialog=" + this.j + ", passengerLayout=" + this.k + ", fareChangedDialog=" + this.l + ")";
    }
}
