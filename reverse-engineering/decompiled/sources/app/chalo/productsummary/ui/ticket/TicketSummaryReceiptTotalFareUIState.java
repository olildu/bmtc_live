package app.chalo.productsummary.ui.ticket;

import app.chalo.uistate.text.TextUIState;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/ticket/TicketSummaryReceiptTotalFareUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TicketSummaryReceiptTotalFareUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f8820a;
    public final TextUIState.ChaloTextUIState b;

    public TicketSummaryReceiptTotalFareUIState(TextUIState.ChaloTextUIState chaloTextUIState, ArrayList arrayList) {
        this.f8820a = arrayList;
        this.b = chaloTextUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketSummaryReceiptTotalFareUIState)) {
            return false;
        }
        TicketSummaryReceiptTotalFareUIState ticketSummaryReceiptTotalFareUIState = (TicketSummaryReceiptTotalFareUIState) obj;
        return this.f8820a.equals(ticketSummaryReceiptTotalFareUIState.f8820a) && this.b.equals(ticketSummaryReceiptTotalFareUIState.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8820a.hashCode() * 31);
    }

    public final String toString() {
        return "TicketSummaryReceiptTotalFareUIState(fareBreakdown=" + this.f8820a + ", totalFare=" + this.b + ")";
    }
}
