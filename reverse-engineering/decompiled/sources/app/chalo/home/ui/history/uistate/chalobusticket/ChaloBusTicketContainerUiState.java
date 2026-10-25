package app.chalo.home.ui.history.uistate.chalobusticket;

import app.chalo.compose.theme.UIShape;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/chalobusticket/ChaloBusTicketContainerUiState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloBusTicketContainerUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloTicketDetailsContainerSpec f3502a;
    public final ChaloBusScheduleUiState b;
    public final ChaloBusTicketTripDetailsUiState c;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public ChaloBusTicketContainerUiState(ChaloBusScheduleUiState ticketSchedule, ChaloBusTicketTripDetailsUiState chaloBusTicketTripDetailsUiState) {
        ChaloTicketDetailsContainerSpec chaloTicketDetailsContainerSpec = new ChaloTicketDetailsContainerSpec();
        Intrinsics.i(ticketSchedule, "ticketSchedule");
        this.f3502a = chaloTicketDetailsContainerSpec;
        this.b = ticketSchedule;
        this.c = chaloBusTicketTripDetailsUiState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloBusTicketContainerUiState)) {
            return false;
        }
        ChaloBusTicketContainerUiState chaloBusTicketContainerUiState = (ChaloBusTicketContainerUiState) obj;
        return Intrinsics.d(this.f3502a, chaloBusTicketContainerUiState.f3502a) && Intrinsics.d(this.b, chaloBusTicketContainerUiState.b) && Intrinsics.d(this.c, chaloBusTicketContainerUiState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f3502a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ChaloBusTicketContainerUiState(spec=" + this.f3502a + ", ticketSchedule=" + this.b + ", ticketTripDetails=" + this.c + ")";
    }
}
