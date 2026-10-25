package app.chalo.premiumbus.ui.seatselection.compose.uistate;

import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.n21;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/compose/uistate/PassengerCountSelectionBottomSheetUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PassengerCountSelectionBottomSheetUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f7776a;
    public final TextUIState.ChaloTextUIState b;
    public final ImageUIState c;
    public final ImageUIState d;
    public final ButtonUIState e;
    public final BookingInfoBannerUIState f;
    public final PassengerCountSelectionBottomSheetUISpecs g;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public PassengerCountSelectionBottomSheetUIState(TextUIState.ChaloTextUIState titleText, TextUIState.ChaloTextUIState countText, ImageUIState decrementIcon, ImageUIState incrementIcon, ButtonUIState buttonUIState, BookingInfoBannerUIState bookingInfoBannerUIState) {
        PassengerCountSelectionBottomSheetUISpecs passengerCountSelectionBottomSheetUISpecs = new PassengerCountSelectionBottomSheetUISpecs();
        Intrinsics.i(titleText, "titleText");
        Intrinsics.i(countText, "countText");
        Intrinsics.i(decrementIcon, "decrementIcon");
        Intrinsics.i(incrementIcon, "incrementIcon");
        this.f7776a = titleText;
        this.b = countText;
        this.c = decrementIcon;
        this.d = incrementIcon;
        this.e = buttonUIState;
        this.f = bookingInfoBannerUIState;
        this.g = passengerCountSelectionBottomSheetUISpecs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassengerCountSelectionBottomSheetUIState)) {
            return false;
        }
        PassengerCountSelectionBottomSheetUIState passengerCountSelectionBottomSheetUIState = (PassengerCountSelectionBottomSheetUIState) obj;
        return Intrinsics.d(this.f7776a, passengerCountSelectionBottomSheetUIState.f7776a) && Intrinsics.d(this.b, passengerCountSelectionBottomSheetUIState.b) && Intrinsics.d(this.c, passengerCountSelectionBottomSheetUIState.c) && Intrinsics.d(this.d, passengerCountSelectionBottomSheetUIState.d) && Intrinsics.d(this.e, passengerCountSelectionBottomSheetUIState.e) && Intrinsics.d(this.f, passengerCountSelectionBottomSheetUIState.f) && Intrinsics.d(this.g, passengerCountSelectionBottomSheetUIState.g);
    }

    public final int hashCode() {
        int iD = r30.d(this.e, r30.e(this.d, r30.e(this.c, r30.f(this.b, this.f7776a.hashCode() * 31, 31), 31), 31), 31);
        BookingInfoBannerUIState bookingInfoBannerUIState = this.f;
        return this.g.hashCode() + ((iD + (bookingInfoBannerUIState == null ? 0 : bookingInfoBannerUIState.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbJ = n21.j("PassengerCountSelectionBottomSheetUIState(titleText=", this.f7776a, ", countText=", this.b, ", decrementIcon=");
        sbJ.append(this.c);
        sbJ.append(", incrementIcon=");
        sbJ.append(this.d);
        sbJ.append(", selectSeatsButtonUIState=");
        sbJ.append(this.e);
        sbJ.append(", infoBannerUIState=");
        sbJ.append(this.f);
        sbJ.append(", specs=");
        sbJ.append(this.g);
        sbJ.append(")");
        return sbJ.toString();
    }
}
