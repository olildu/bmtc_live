package app.chalo.multimodalticket.ui;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/ui/TicketSelectionContainerUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TicketSelectionContainerUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TicketSelectionContainerUISpecs f5955a;
    public final FullJourneyTicketCardUIState b;
    public final IndividualStepsTicketCardUIState c;

    public TicketSelectionContainerUIState(FullJourneyTicketCardUIState fullJourneyTicketCardUIState, IndividualStepsTicketCardUIState individualStepsTicketCardUIState) {
        TicketSelectionContainerUISpecs ticketSelectionContainerUISpecs = new TicketSelectionContainerUISpecs();
        Intrinsics.i(fullJourneyTicketCardUIState, "fullJourneyTicketCardUIState");
        Intrinsics.i(individualStepsTicketCardUIState, "individualStepsTicketCardUIState");
        this.f5955a = ticketSelectionContainerUISpecs;
        this.b = fullJourneyTicketCardUIState;
        this.c = individualStepsTicketCardUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketSelectionContainerUIState)) {
            return false;
        }
        TicketSelectionContainerUIState ticketSelectionContainerUIState = (TicketSelectionContainerUIState) obj;
        return Intrinsics.d(this.f5955a, ticketSelectionContainerUIState.f5955a) && Intrinsics.d(this.b, ticketSelectionContainerUIState.b) && Intrinsics.d(this.c, ticketSelectionContainerUIState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f5955a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TicketSelectionContainerUIState(specs=" + this.f5955a + ", fullJourneyTicketCardUIState=" + this.b + ", individualStepsTicketCardUIState=" + this.c + ")";
    }
}
