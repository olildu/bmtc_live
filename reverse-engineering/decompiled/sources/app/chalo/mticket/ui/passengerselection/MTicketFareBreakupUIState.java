package app.chalo.mticket.ui.passengerselection;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.text.TextUIState;
import defpackage.n21;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/mticket/ui/passengerselection/MTicketFareBreakupUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MTicketFareBreakupUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f5733a;
    public final TextUIState.ChaloTextUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final ChaloPadding d;

    public MTicketFareBreakupUIState(TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, TextUIState.ChaloTextUIState chaloTextUIState3) {
        ChaloPadding chaloPadding = new ChaloPadding(0.0f, ChaloThemeHelper.a().d, 0.0f, 0.0f, 13);
        this.f5733a = chaloTextUIState;
        this.b = chaloTextUIState2;
        this.c = chaloTextUIState3;
        this.d = chaloPadding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MTicketFareBreakupUIState)) {
            return false;
        }
        MTicketFareBreakupUIState mTicketFareBreakupUIState = (MTicketFareBreakupUIState) obj;
        return Intrinsics.d(this.f5733a, mTicketFareBreakupUIState.f5733a) && Intrinsics.d(this.b, mTicketFareBreakupUIState.b) && Intrinsics.d(this.c, mTicketFareBreakupUIState.c) && Intrinsics.d(this.d, mTicketFareBreakupUIState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + r30.f(this.c, r30.f(this.b, this.f5733a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbJ = n21.j("MTicketFareBreakupUIState(passengerType=", this.f5733a, ", passengerCount=", this.b, ", passengerFare=");
        sbJ.append(this.c);
        sbJ.append(", paddingAroundCount=");
        sbJ.append(this.d);
        sbJ.append(")");
        return sbJ.toString();
    }
}
