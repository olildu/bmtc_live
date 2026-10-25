package app.chalo.premiumbus.ui.seatselection.compose.uistate;

import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.n21;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/compose/uistate/WomenReservedSeatsChoiceBottomSheetUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WomenReservedSeatsChoiceBottomSheetUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f7792a;
    public final TextUIState.ChaloTextUIState b;
    public final ButtonUIState c;
    public final ButtonUIState d;

    public WomenReservedSeatsChoiceBottomSheetUIState(TextUIState.ChaloTextUIState titleText, TextUIState.ChaloTextUIState subtitleText, ButtonUIState autoAssignButtonUIState, ButtonUIState buttonUIState) {
        Intrinsics.i(titleText, "titleText");
        Intrinsics.i(subtitleText, "subtitleText");
        Intrinsics.i(autoAssignButtonUIState, "autoAssignButtonUIState");
        this.f7792a = titleText;
        this.b = subtitleText;
        this.c = autoAssignButtonUIState;
        this.d = buttonUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WomenReservedSeatsChoiceBottomSheetUIState)) {
            return false;
        }
        WomenReservedSeatsChoiceBottomSheetUIState womenReservedSeatsChoiceBottomSheetUIState = (WomenReservedSeatsChoiceBottomSheetUIState) obj;
        return Intrinsics.d(this.f7792a, womenReservedSeatsChoiceBottomSheetUIState.f7792a) && Intrinsics.d(this.b, womenReservedSeatsChoiceBottomSheetUIState.b) && Intrinsics.d(this.c, womenReservedSeatsChoiceBottomSheetUIState.c) && Intrinsics.d(this.d, womenReservedSeatsChoiceBottomSheetUIState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + r30.d(this.c, r30.f(this.b, this.f7792a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbJ = n21.j("WomenReservedSeatsChoiceBottomSheetUIState(titleText=", this.f7792a, ", subtitleText=", this.b, ", autoAssignButtonUIState=");
        sbJ.append(this.c);
        sbJ.append(", pickMySeatButtonUIState=");
        sbJ.append(this.d);
        sbJ.append(")");
        return sbJ.toString();
    }
}
