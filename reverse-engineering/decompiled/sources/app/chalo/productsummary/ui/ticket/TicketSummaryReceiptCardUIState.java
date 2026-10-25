package app.chalo.productsummary.ui.ticket;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/ticket/TicketSummaryReceiptCardUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TicketSummaryReceiptCardUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TicketSummaryReceiptCardUISpec f8815a = new TicketSummaryReceiptCardUISpec();
    public final TicketSummaryReceiptHeaderUIState b;
    public final TicketSummaryReceiptStopsInfoUIState c;
    public final TicketSummaryReceiptTotalFareUIState d;
    public final TicketSummaryBusMetaInfoUIState e;

    public TicketSummaryReceiptCardUIState(TicketSummaryReceiptHeaderUIState ticketSummaryReceiptHeaderUIState, TicketSummaryReceiptStopsInfoUIState ticketSummaryReceiptStopsInfoUIState, TicketSummaryReceiptTotalFareUIState ticketSummaryReceiptTotalFareUIState, TicketSummaryBusMetaInfoUIState ticketSummaryBusMetaInfoUIState) {
        this.b = ticketSummaryReceiptHeaderUIState;
        this.c = ticketSummaryReceiptStopsInfoUIState;
        this.d = ticketSummaryReceiptTotalFareUIState;
        this.e = ticketSummaryBusMetaInfoUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketSummaryReceiptCardUIState)) {
            return false;
        }
        TicketSummaryReceiptCardUIState ticketSummaryReceiptCardUIState = (TicketSummaryReceiptCardUIState) obj;
        return Intrinsics.d(this.f8815a, ticketSummaryReceiptCardUIState.f8815a) && Intrinsics.d(this.b, ticketSummaryReceiptCardUIState.b) && Intrinsics.d(this.c, ticketSummaryReceiptCardUIState.c) && Intrinsics.d(this.d, ticketSummaryReceiptCardUIState.d) && Intrinsics.d(this.e, ticketSummaryReceiptCardUIState.e);
    }

    public final int hashCode() {
        int iHashCode = this.f8815a.hashCode() * 31;
        TicketSummaryReceiptHeaderUIState ticketSummaryReceiptHeaderUIState = this.b;
        int iHashCode2 = (iHashCode + (ticketSummaryReceiptHeaderUIState == null ? 0 : ticketSummaryReceiptHeaderUIState.hashCode())) * 31;
        TicketSummaryReceiptStopsInfoUIState ticketSummaryReceiptStopsInfoUIState = this.c;
        int iHashCode3 = (iHashCode2 + (ticketSummaryReceiptStopsInfoUIState == null ? 0 : ticketSummaryReceiptStopsInfoUIState.hashCode())) * 31;
        TicketSummaryReceiptTotalFareUIState ticketSummaryReceiptTotalFareUIState = this.d;
        int iHashCode4 = (iHashCode3 + (ticketSummaryReceiptTotalFareUIState == null ? 0 : ticketSummaryReceiptTotalFareUIState.hashCode())) * 31;
        TicketSummaryBusMetaInfoUIState ticketSummaryBusMetaInfoUIState = this.e;
        return iHashCode4 + (ticketSummaryBusMetaInfoUIState != null ? ticketSummaryBusMetaInfoUIState.f8801a.hashCode() : 0);
    }

    public final String toString() {
        return "TicketSummaryReceiptCardUIState(spec=" + this.f8815a + ", headerUIState=" + this.b + ", stopsInfo=" + this.c + ", totalFareUIState=" + this.d + ", vehicleMetaInfo=" + this.e + ")";
    }
}
