package app.chalo.productsummary.ui.ticket;

import app.chalo.uistate.text.TextUIState;
import defpackage.n21;
import defpackage.py;
import defpackage.r30;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/ticket/TicketSummaryReceiptStopsInfoUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TicketSummaryReceiptStopsInfoUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f8819a;
    public final TextUIState.ChaloTextUIState b;
    public final TextUIState.ChaloTextUIState c;

    public TicketSummaryReceiptStopsInfoUIState(TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, TextUIState.ChaloTextUIState chaloTextUIState3) {
        this.f8819a = chaloTextUIState;
        this.b = chaloTextUIState2;
        this.c = chaloTextUIState3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketSummaryReceiptStopsInfoUIState)) {
            return false;
        }
        TicketSummaryReceiptStopsInfoUIState ticketSummaryReceiptStopsInfoUIState = (TicketSummaryReceiptStopsInfoUIState) obj;
        return this.f8819a.equals(ticketSummaryReceiptStopsInfoUIState.f8819a) && this.b.equals(ticketSummaryReceiptStopsInfoUIState.b) && this.c.equals(ticketSummaryReceiptStopsInfoUIState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + r30.f(this.b, this.f8819a.hashCode() * 31, 31);
    }

    public final String toString() {
        return py.f(n21.j("TicketSummaryReceiptStopsInfoUIState(fromStop=", this.f8819a, ", stopDivisionText=", this.b, ", toStop="), this.c, ")");
    }
}
