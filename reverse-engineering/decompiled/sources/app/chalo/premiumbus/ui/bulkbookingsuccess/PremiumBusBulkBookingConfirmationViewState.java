package app.chalo.premiumbus.ui.bulkbookingsuccess;

import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/bulkbookingsuccess/PremiumBusBulkBookingConfirmationViewState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusBulkBookingConfirmationViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ToolbarUIState f7502a;
    public final RouteDetailInfoUIState b;
    public final List c;
    public final PassInfoUIState d;
    public final ButtonUIState e;
    public final LoadingDialogUIState f;
    public final TermsAndConditionsUIState g;
    public final TermsAndConditionsBottomSheetUIState h;

    public PremiumBusBulkBookingConfirmationViewState(ToolbarUIState toolbarUIState, RouteDetailInfoUIState routeDetailInfoUIState, List list, PassInfoUIState passInfoUIState, ButtonUIState buttonUIState, LoadingDialogUIState loadingDialogUIState, TermsAndConditionsUIState termsAndConditionsUIState, TermsAndConditionsBottomSheetUIState termsAndConditionsBottomSheetUIState) {
        Intrinsics.i(toolbarUIState, "toolbarUIState");
        this.f7502a = toolbarUIState;
        this.b = routeDetailInfoUIState;
        this.c = list;
        this.d = passInfoUIState;
        this.e = buttonUIState;
        this.f = loadingDialogUIState;
        this.g = termsAndConditionsUIState;
        this.h = termsAndConditionsBottomSheetUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusBulkBookingConfirmationViewState)) {
            return false;
        }
        PremiumBusBulkBookingConfirmationViewState premiumBusBulkBookingConfirmationViewState = (PremiumBusBulkBookingConfirmationViewState) obj;
        return Intrinsics.d(this.f7502a, premiumBusBulkBookingConfirmationViewState.f7502a) && Intrinsics.d(this.b, premiumBusBulkBookingConfirmationViewState.b) && Intrinsics.d(this.c, premiumBusBulkBookingConfirmationViewState.c) && Intrinsics.d(this.d, premiumBusBulkBookingConfirmationViewState.d) && Intrinsics.d(this.e, premiumBusBulkBookingConfirmationViewState.e) && Intrinsics.d(this.f, premiumBusBulkBookingConfirmationViewState.f) && Intrinsics.d(this.g, premiumBusBulkBookingConfirmationViewState.g) && Intrinsics.d(this.h, premiumBusBulkBookingConfirmationViewState.h);
    }

    public final int hashCode() {
        int iHashCode = this.f7502a.hashCode() * 31;
        RouteDetailInfoUIState routeDetailInfoUIState = this.b;
        int iHashCode2 = (iHashCode + (routeDetailInfoUIState == null ? 0 : routeDetailInfoUIState.hashCode())) * 31;
        List list = this.c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        PassInfoUIState passInfoUIState = this.d;
        int iHashCode4 = (iHashCode3 + (passInfoUIState == null ? 0 : passInfoUIState.hashCode())) * 31;
        ButtonUIState buttonUIState = this.e;
        int iHashCode5 = (iHashCode4 + (buttonUIState == null ? 0 : buttonUIState.hashCode())) * 31;
        LoadingDialogUIState loadingDialogUIState = this.f;
        int iHashCode6 = (iHashCode5 + (loadingDialogUIState == null ? 0 : loadingDialogUIState.hashCode())) * 31;
        TermsAndConditionsUIState termsAndConditionsUIState = this.g;
        int iHashCode7 = (iHashCode6 + (termsAndConditionsUIState == null ? 0 : termsAndConditionsUIState.hashCode())) * 31;
        TermsAndConditionsBottomSheetUIState termsAndConditionsBottomSheetUIState = this.h;
        return iHashCode7 + (termsAndConditionsBottomSheetUIState != null ? termsAndConditionsBottomSheetUIState.hashCode() : 0);
    }

    public final String toString() {
        return "PremiumBusBulkBookingConfirmationViewState(toolbarUIState=" + this.f7502a + ", routeDetailInfoUIState=" + this.b + ", slotAndSeatInfoUIStateList=" + this.c + ", passInfoUIState=" + this.d + ", bookRideButtonUIState=" + this.e + ", loadingUIState=" + this.f + ", termsAndConditionsUIState=" + this.g + ", termsAndConditionsBottomSheetUIState=" + this.h + ")";
    }
}
