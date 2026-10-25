package app.chalo.productsummary.ui.ticket;

import app.chalo.productsummary.ui.data.FullScreenImageUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/ticket/TicketSummaryReceiptScreenUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TicketSummaryReceiptScreenUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TicketSummaryReceiptScreenUISpec f8818a = new TicketSummaryReceiptScreenUISpec();
    public final ToolbarUIState b;
    public final TicketSummaryReceiptCardUIState c;
    public final FullScreenImageUIState d;
    public final ImageUIState e;

    public TicketSummaryReceiptScreenUIState(ToolbarUIState toolbarUIState, TicketSummaryReceiptCardUIState ticketSummaryReceiptCardUIState, FullScreenImageUIState fullScreenImageUIState, ImageUIState imageUIState) {
        this.b = toolbarUIState;
        this.c = ticketSummaryReceiptCardUIState;
        this.d = fullScreenImageUIState;
        this.e = imageUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketSummaryReceiptScreenUIState)) {
            return false;
        }
        TicketSummaryReceiptScreenUIState ticketSummaryReceiptScreenUIState = (TicketSummaryReceiptScreenUIState) obj;
        return Intrinsics.d(this.f8818a, ticketSummaryReceiptScreenUIState.f8818a) && Intrinsics.d(this.b, ticketSummaryReceiptScreenUIState.b) && Intrinsics.d(this.c, ticketSummaryReceiptScreenUIState.c) && Intrinsics.d(this.d, ticketSummaryReceiptScreenUIState.d) && Intrinsics.d(this.e, ticketSummaryReceiptScreenUIState.e);
    }

    public final int hashCode() {
        int iHashCode = this.f8818a.hashCode() * 31;
        ToolbarUIState toolbarUIState = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (toolbarUIState == null ? 0 : toolbarUIState.hashCode())) * 31)) * 31;
        FullScreenImageUIState fullScreenImageUIState = this.d;
        int iHashCode3 = (iHashCode2 + (fullScreenImageUIState == null ? 0 : fullScreenImageUIState.hashCode())) * 31;
        ImageUIState imageUIState = this.e;
        return iHashCode3 + (imageUIState != null ? imageUIState.hashCode() : 0);
    }

    public final String toString() {
        return "TicketSummaryReceiptScreenUIState(spec=" + this.f8818a + ", toolbarUIState=" + this.b + ", receiptCardUIState=" + this.c + ", fullScreenImageUIState=" + this.d + ", brandingWatermark=" + this.e + ")";
    }
}
