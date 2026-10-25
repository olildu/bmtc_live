package app.chalo.multimodalticket.groupticketsummary.ui.uistate;

import app.chalo.multimodalticket.ui.FullJourneyTicketCardUIState;
import app.chalo.uistate.multimodal.StepBasedRouteDetailsSectionUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/groupticketsummary/ui/uistate/GroupTicketJourneyOverviewUiState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GroupTicketJourneyOverviewUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GroupTicketJourneyOverviewUiSpec f5913a;
    public final FullJourneyTicketCardUIState b;
    public final StepBasedRouteDetailsSectionUIState c;

    public GroupTicketJourneyOverviewUiState(FullJourneyTicketCardUIState fullJourneyTicketCardUIState, StepBasedRouteDetailsSectionUIState stepBasedRouteDetailsSectionUIState) {
        GroupTicketJourneyOverviewUiSpec groupTicketJourneyOverviewUiSpec = new GroupTicketJourneyOverviewUiSpec();
        Intrinsics.i(fullJourneyTicketCardUIState, "fullJourneyTicketCardUIState");
        Intrinsics.i(stepBasedRouteDetailsSectionUIState, "stepBasedRouteDetailsSectionUIState");
        this.f5913a = groupTicketJourneyOverviewUiSpec;
        this.b = fullJourneyTicketCardUIState;
        this.c = stepBasedRouteDetailsSectionUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTicketJourneyOverviewUiState)) {
            return false;
        }
        GroupTicketJourneyOverviewUiState groupTicketJourneyOverviewUiState = (GroupTicketJourneyOverviewUiState) obj;
        return Intrinsics.d(this.f5913a, groupTicketJourneyOverviewUiState.f5913a) && Intrinsics.d(this.b, groupTicketJourneyOverviewUiState.b) && Intrinsics.d(this.c, groupTicketJourneyOverviewUiState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f5913a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "GroupTicketJourneyOverviewUiState(uiSpec=" + this.f5913a + ", fullJourneyTicketCardUIState=" + this.b + ", stepBasedRouteDetailsSectionUIState=" + this.c + ")";
    }
}
