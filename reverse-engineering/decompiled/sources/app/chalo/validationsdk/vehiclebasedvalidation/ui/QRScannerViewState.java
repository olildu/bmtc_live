package app.chalo.validationsdk.vehiclebasedvalidation.ui;

import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.error.StandardErrorScreenUIState;
import app.chalo.uistate.image.ImageUIState;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/vehiclebasedvalidation/ui/QRScannerViewState;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class QRScannerViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final QRScannerUISpecs f10730a;
    public final ChaloColorToken b;
    public final QRScannerToolbarUIState c;
    public final LoadingDialogUIState d;
    public final TicketCardUIState e;
    public final QrContainerUiState f;
    public final StandardErrorScreenUIState.ErrorWithMsgAndRetry g;
    public final ImageUIState h;
    public final ValidationBottomCtaContainerUiState i;

    public QRScannerViewState(QRScannerToolbarUIState toolbarUIState, LoadingDialogUIState loadingDialogUIState, TicketCardUIState ticketCardUIState, QrContainerUiState qrContainerUiState, StandardErrorScreenUIState.ErrorWithMsgAndRetry errorWithMsgAndRetry, ImageUIState imageUIState, ValidationBottomCtaContainerUiState validationBottomCtaContainerUiState) {
        QRScannerUISpecs qRScannerUISpecs = new QRScannerUISpecs();
        Intrinsics.i(toolbarUIState, "toolbarUIState");
        this.f10730a = qRScannerUISpecs;
        this.b = ChaloColorToken.White.f9870a;
        this.c = toolbarUIState;
        this.d = loadingDialogUIState;
        this.e = ticketCardUIState;
        this.f = qrContainerUiState;
        this.g = errorWithMsgAndRetry;
        this.h = imageUIState;
        this.i = validationBottomCtaContainerUiState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QRScannerViewState)) {
            return false;
        }
        QRScannerViewState qRScannerViewState = (QRScannerViewState) obj;
        return Intrinsics.d(this.f10730a, qRScannerViewState.f10730a) && Intrinsics.d(this.b, qRScannerViewState.b) && Intrinsics.d(this.c, qRScannerViewState.c) && Intrinsics.d(this.d, qRScannerViewState.d) && Intrinsics.d(this.e, qRScannerViewState.e) && Intrinsics.d(this.f, qRScannerViewState.f) && Intrinsics.d(this.g, qRScannerViewState.g) && Intrinsics.d(this.h, qRScannerViewState.h) && Intrinsics.d(this.i, qRScannerViewState.i);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + z40.b(this.b, this.f10730a.hashCode() * 31, 31)) * 31;
        LoadingDialogUIState loadingDialogUIState = this.d;
        int iHashCode2 = (iHashCode + (loadingDialogUIState == null ? 0 : loadingDialogUIState.hashCode())) * 31;
        TicketCardUIState ticketCardUIState = this.e;
        int iHashCode3 = (iHashCode2 + (ticketCardUIState == null ? 0 : ticketCardUIState.hashCode())) * 31;
        QrContainerUiState qrContainerUiState = this.f;
        int iHashCode4 = (iHashCode3 + (qrContainerUiState == null ? 0 : qrContainerUiState.hashCode())) * 31;
        StandardErrorScreenUIState.ErrorWithMsgAndRetry errorWithMsgAndRetry = this.g;
        int iHashCode5 = (iHashCode4 + (errorWithMsgAndRetry == null ? 0 : errorWithMsgAndRetry.hashCode())) * 31;
        ImageUIState imageUIState = this.h;
        return this.i.hashCode() + ((iHashCode5 + (imageUIState != null ? imageUIState.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "QRScannerViewState(spec=" + this.f10730a + ", screenBackgroundColor=" + this.b + ", toolbarUIState=" + this.c + ", loadingUIState=" + this.d + ", ticketDetails=" + this.e + ", qrContainerUiState=" + this.f + ", bottomSheetUIState=" + this.g + ", productBrandingImage=" + this.h + ", validationBottomCtaContainerUiState=" + this.i + ")";
    }
}
