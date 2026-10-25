package app.chalo.premiumbus.ui.seatselection.compose.uistate;

import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.hq0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/compose/uistate/SeatChangeSuccessScreenUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SeatChangeSuccessScreenUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SeatChangeSuccessScreenUISpecs f7784a = new SeatChangeSuccessScreenUISpecs();
    public final TextUIState.ChaloTextUIState b;
    public final ButtonUIState c;

    public SeatChangeSuccessScreenUIState(TextUIState.ChaloTextUIState chaloTextUIState, ButtonUIState buttonUIState) {
        this.b = chaloTextUIState;
        this.c = buttonUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeatChangeSuccessScreenUIState)) {
            return false;
        }
        SeatChangeSuccessScreenUIState seatChangeSuccessScreenUIState = (SeatChangeSuccessScreenUIState) obj;
        return Intrinsics.d(this.f7784a, seatChangeSuccessScreenUIState.f7784a) && Intrinsics.d(this.b, seatChangeSuccessScreenUIState.b) && Intrinsics.d(this.c, seatChangeSuccessScreenUIState.c);
    }

    public final int hashCode() {
        int iHashCode = this.f7784a.hashCode() * 31;
        TextUIState.ChaloTextUIState chaloTextUIState = this.b;
        int iHashCode2 = (iHashCode + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31;
        ButtonUIState buttonUIState = this.c;
        return iHashCode2 + (buttonUIState != null ? buttonUIState.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SeatChangeSuccessScreenUIState(specs=");
        sb.append(this.f7784a);
        sb.append(", textViewState=");
        sb.append(this.b);
        sb.append(", buttonUIState=");
        return hq0.j(sb, this.c, ")");
    }
}
