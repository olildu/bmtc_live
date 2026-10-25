package app.chalo.home.ui.history.uistate.chalobusticket;

import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/chalobusticket/ChaloBusTicketUiState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloBusTicketUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloBusTicketSpec f3507a;
    public final TextUIState.ChaloTextUIState b;
    public final List c;
    public final BusTicketStatusUiState d;
    public final ChaloBusTicketContainerUiState e;
    public final ProductFooterContainerUiState f;

    public ChaloBusTicketUiState(TextUIState.ChaloTextUIState ticketHeader, List list, BusTicketStatusUiState busTicketStatusUiState, ChaloBusTicketContainerUiState ticketDetailsContainer, ProductFooterContainerUiState productFooterContainerUiState, int i) {
        ChaloBusTicketSpec chaloBusTicketSpec = new ChaloBusTicketSpec();
        list = (i & 4) != 0 ? null : list;
        Intrinsics.i(ticketHeader, "ticketHeader");
        Intrinsics.i(ticketDetailsContainer, "ticketDetailsContainer");
        this.f3507a = chaloBusTicketSpec;
        this.b = ticketHeader;
        this.c = list;
        this.d = busTicketStatusUiState;
        this.e = ticketDetailsContainer;
        this.f = productFooterContainerUiState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloBusTicketUiState)) {
            return false;
        }
        ChaloBusTicketUiState chaloBusTicketUiState = (ChaloBusTicketUiState) obj;
        return Intrinsics.d(this.f3507a, chaloBusTicketUiState.f3507a) && Intrinsics.d(this.b, chaloBusTicketUiState.b) && Intrinsics.d(this.c, chaloBusTicketUiState.c) && Intrinsics.d(this.d, chaloBusTicketUiState.d) && Intrinsics.d(this.e, chaloBusTicketUiState.e) && Intrinsics.d(this.f, chaloBusTicketUiState.f);
    }

    public final int hashCode() {
        int iF = r30.f(this.b, this.f3507a.hashCode() * 31, 31);
        List list = this.c;
        int iHashCode = (iF + (list == null ? 0 : list.hashCode())) * 31;
        BusTicketStatusUiState busTicketStatusUiState = this.d;
        int iHashCode2 = (this.e.hashCode() + ((iHashCode + (busTicketStatusUiState == null ? 0 : busTicketStatusUiState.hashCode())) * 31)) * 31;
        ProductFooterContainerUiState productFooterContainerUiState = this.f;
        return iHashCode2 + (productFooterContainerUiState != null ? productFooterContainerUiState.hashCode() : 0);
    }

    public final String toString() {
        return "ChaloBusTicketUiState(spec=" + this.f3507a + ", ticketHeader=" + this.b + ", ticketBannerState=" + this.c + ", ticketStatusTagUiState=" + this.d + ", ticketDetailsContainer=" + this.e + ", ticketFooterContainer=" + this.f + ")";
    }
}
