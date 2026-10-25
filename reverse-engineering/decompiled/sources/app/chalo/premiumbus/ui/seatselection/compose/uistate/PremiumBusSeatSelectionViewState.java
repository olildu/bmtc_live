package app.chalo.premiumbus.ui.seatselection.compose.uistate;

import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.error.StandardErrorScreenUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import defpackage.t8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/compose/uistate/PremiumBusSeatSelectionViewState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusSeatSelectionViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusSeatSelectionUISpecs f7781a;
    public final ToolbarUIState b;
    public final boolean c;
    public final ButtonUIState d;
    public final TextUIState.ChaloTextUIState e;
    public final GenderPreferenceNudgeCardUIState f;
    public final BookingInfoBannerUIState g;
    public final SeatTypeInfoHeaderUIState h;
    public final SeatLayoutUIState i;
    public final PremiumBusSeatSelectionBottomSheetUIState j;
    public final StandardErrorScreenUIState.ErrorWithMsgAndRetry k;
    public final SeatChangeSuccessScreenUIState l;
    public final SeatSelectionDialogTypeUIState.SeatChangeDialogTypeUIState m;
    public final String n;

    public PremiumBusSeatSelectionViewState(ToolbarUIState toolbarUIState, boolean z, ButtonUIState buttonUIState, TextUIState.ChaloTextUIState chaloTextUIState, GenderPreferenceNudgeCardUIState genderPreferenceNudgeCardUIState, BookingInfoBannerUIState bookingInfoBannerUIState, SeatTypeInfoHeaderUIState seatTypeInfoHeaderUIState, SeatLayoutUIState seatLayoutUIState, PremiumBusSeatSelectionBottomSheetUIState premiumBusSeatSelectionBottomSheetUIState, StandardErrorScreenUIState.ErrorWithMsgAndRetry errorWithMsgAndRetry, SeatChangeSuccessScreenUIState seatChangeSuccessScreenUIState, SeatSelectionDialogTypeUIState.SeatChangeDialogTypeUIState seatChangeDialogTypeUIState, String str) {
        PremiumBusSeatSelectionUISpecs premiumBusSeatSelectionUISpecs = new PremiumBusSeatSelectionUISpecs();
        Intrinsics.i(toolbarUIState, "toolbarUIState");
        Intrinsics.i(seatTypeInfoHeaderUIState, "seatTypeInfoHeaderUIState");
        this.f7781a = premiumBusSeatSelectionUISpecs;
        this.b = toolbarUIState;
        this.c = z;
        this.d = buttonUIState;
        this.e = chaloTextUIState;
        this.f = genderPreferenceNudgeCardUIState;
        this.g = bookingInfoBannerUIState;
        this.h = seatTypeInfoHeaderUIState;
        this.i = seatLayoutUIState;
        this.j = premiumBusSeatSelectionBottomSheetUIState;
        this.k = errorWithMsgAndRetry;
        this.l = seatChangeSuccessScreenUIState;
        this.m = seatChangeDialogTypeUIState;
        this.n = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusSeatSelectionViewState)) {
            return false;
        }
        PremiumBusSeatSelectionViewState premiumBusSeatSelectionViewState = (PremiumBusSeatSelectionViewState) obj;
        return Intrinsics.d(this.f7781a, premiumBusSeatSelectionViewState.f7781a) && Intrinsics.d(this.b, premiumBusSeatSelectionViewState.b) && this.c == premiumBusSeatSelectionViewState.c && Intrinsics.d(this.d, premiumBusSeatSelectionViewState.d) && Intrinsics.d(this.e, premiumBusSeatSelectionViewState.e) && Intrinsics.d(this.f, premiumBusSeatSelectionViewState.f) && Intrinsics.d(this.g, premiumBusSeatSelectionViewState.g) && Intrinsics.d(this.h, premiumBusSeatSelectionViewState.h) && Intrinsics.d(this.i, premiumBusSeatSelectionViewState.i) && Intrinsics.d(this.j, premiumBusSeatSelectionViewState.j) && Intrinsics.d(this.k, premiumBusSeatSelectionViewState.k) && Intrinsics.d(this.l, premiumBusSeatSelectionViewState.l) && Intrinsics.d(this.m, premiumBusSeatSelectionViewState.m) && Intrinsics.d(this.n, premiumBusSeatSelectionViewState.n);
    }

    public final int hashCode() {
        int iD = (t8.d(this.b, this.f7781a.hashCode() * 31, 31) + (this.c ? 1231 : 1237)) * 31;
        ButtonUIState buttonUIState = this.d;
        int iHashCode = (iD + (buttonUIState == null ? 0 : buttonUIState.hashCode())) * 31;
        TextUIState.ChaloTextUIState chaloTextUIState = this.e;
        int iHashCode2 = (iHashCode + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31;
        GenderPreferenceNudgeCardUIState genderPreferenceNudgeCardUIState = this.f;
        int iHashCode3 = (iHashCode2 + (genderPreferenceNudgeCardUIState == null ? 0 : genderPreferenceNudgeCardUIState.hashCode())) * 31;
        BookingInfoBannerUIState bookingInfoBannerUIState = this.g;
        int iHashCode4 = (this.h.hashCode() + ((iHashCode3 + (bookingInfoBannerUIState == null ? 0 : bookingInfoBannerUIState.hashCode())) * 31)) * 31;
        SeatLayoutUIState seatLayoutUIState = this.i;
        int iHashCode5 = (iHashCode4 + (seatLayoutUIState == null ? 0 : seatLayoutUIState.hashCode())) * 31;
        PremiumBusSeatSelectionBottomSheetUIState premiumBusSeatSelectionBottomSheetUIState = this.j;
        int iHashCode6 = (iHashCode5 + (premiumBusSeatSelectionBottomSheetUIState == null ? 0 : premiumBusSeatSelectionBottomSheetUIState.hashCode())) * 31;
        StandardErrorScreenUIState.ErrorWithMsgAndRetry errorWithMsgAndRetry = this.k;
        int iHashCode7 = (iHashCode6 + (errorWithMsgAndRetry == null ? 0 : errorWithMsgAndRetry.hashCode())) * 31;
        SeatChangeSuccessScreenUIState seatChangeSuccessScreenUIState = this.l;
        int iHashCode8 = (iHashCode7 + (seatChangeSuccessScreenUIState == null ? 0 : seatChangeSuccessScreenUIState.hashCode())) * 31;
        SeatSelectionDialogTypeUIState.SeatChangeDialogTypeUIState seatChangeDialogTypeUIState = this.m;
        int iHashCode9 = (iHashCode8 + (seatChangeDialogTypeUIState == null ? 0 : seatChangeDialogTypeUIState.hashCode())) * 31;
        String str = this.n;
        return iHashCode9 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "PremiumBusSeatSelectionViewState(specs=" + this.f7781a + ", toolbarUIState=" + this.b + ", isFetching=" + this.c + ", selectSeatBtnUIState=" + this.d + ", totalSeatSelectedUIState=" + this.e + ", genderPreferenceNudgeCardUIState=" + this.f + ", bookingInfoBannerUIState=" + this.g + ", seatTypeInfoHeaderUIState=" + this.h + ", seatLayoutUIState=" + this.i + ", premiumBusSeatSelectionBottomSheetUIState=" + this.j + ", errorUIState=" + this.k + ", seatChangeSuccessScreenUIState=" + this.l + ", seatSelectionDialogTypeUIState=" + this.m + ", allSeatsAreBookedSnackBarMessage=" + this.n + ")";
    }
}
