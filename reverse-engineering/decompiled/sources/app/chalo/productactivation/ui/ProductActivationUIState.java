package app.chalo.productactivation.ui;

import app.chalo.data.ProductBookingBranding;
import app.chalo.productactivation.ui.uistate.UpsellRideSectionUIState;
import app.chalo.uistate.bottomsheet.BottomSheetStandardContentUiState;
import app.chalo.uistate.dialog.ConfirmationDialogUiState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/ui/ProductActivationUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductActivationUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActivationInfoUIState f8045a;
    public final ProductBookingBranding b;
    public final BottomSheetStandardContentUiState c;
    public final ConfirmationDialogUiState d;
    public final ProductActivationUISpec e;
    public final UserProfilingTicketActivationBannerUIState f;
    public final UpsellRideSectionUIState g;

    public ProductActivationUIState(ActivationInfoUIState activationInfoUIState, ProductBookingBranding productBookingBranding, BottomSheetStandardContentUiState bottomSheetStandardContentUiState, ConfirmationDialogUiState confirmationDialogUiState, UserProfilingTicketActivationBannerUIState userProfilingTicketActivationBannerUIState, UpsellRideSectionUIState upsellRideSectionUIState) {
        ProductActivationUISpec productActivationUISpec = new ProductActivationUISpec();
        this.f8045a = activationInfoUIState;
        this.b = productBookingBranding;
        this.c = bottomSheetStandardContentUiState;
        this.d = confirmationDialogUiState;
        this.e = productActivationUISpec;
        this.f = userProfilingTicketActivationBannerUIState;
        this.g = upsellRideSectionUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductActivationUIState)) {
            return false;
        }
        ProductActivationUIState productActivationUIState = (ProductActivationUIState) obj;
        return Intrinsics.d(this.f8045a, productActivationUIState.f8045a) && Intrinsics.d(this.b, productActivationUIState.b) && Intrinsics.d(this.c, productActivationUIState.c) && Intrinsics.d(this.d, productActivationUIState.d) && Intrinsics.d(this.e, productActivationUIState.e) && Intrinsics.d(this.f, productActivationUIState.f) && Intrinsics.d(this.g, productActivationUIState.g);
    }

    public final int hashCode() {
        ActivationInfoUIState activationInfoUIState = this.f8045a;
        int iHashCode = (activationInfoUIState == null ? 0 : activationInfoUIState.hashCode()) * 31;
        ProductBookingBranding productBookingBranding = this.b;
        int iHashCode2 = (iHashCode + (productBookingBranding == null ? 0 : productBookingBranding.hashCode())) * 31;
        BottomSheetStandardContentUiState bottomSheetStandardContentUiState = this.c;
        int iHashCode3 = (iHashCode2 + (bottomSheetStandardContentUiState == null ? 0 : bottomSheetStandardContentUiState.hashCode())) * 31;
        ConfirmationDialogUiState confirmationDialogUiState = this.d;
        int iHashCode4 = (this.e.hashCode() + ((iHashCode3 + (confirmationDialogUiState == null ? 0 : confirmationDialogUiState.hashCode())) * 31)) * 31;
        UserProfilingTicketActivationBannerUIState userProfilingTicketActivationBannerUIState = this.f;
        int iHashCode5 = (iHashCode4 + (userProfilingTicketActivationBannerUIState == null ? 0 : userProfilingTicketActivationBannerUIState.hashCode())) * 31;
        UpsellRideSectionUIState upsellRideSectionUIState = this.g;
        return iHashCode5 + (upsellRideSectionUIState != null ? upsellRideSectionUIState.hashCode() : 0);
    }

    public final String toString() {
        return "ProductActivationUIState(activationInfoUIState=" + this.f8045a + ", productBranding=" + this.b + ", activationConfirmationBottomSheet=" + this.c + ", rideNotAvailableDialog=" + this.d + ", specs=" + this.e + ", userProfilingTicketActivationBannerUIState=" + this.f + ", upsellRideSection=" + this.g + ")";
    }
}
