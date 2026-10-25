package app.chalo.home.ui.history.uistate.regularbusticket;

import app.chalo.home.ui.history.uistate.chalobusticket.BusTicketStatusUiState;
import app.chalo.uistate.components.RegularBusTicketContainerUiState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/regularbusticket/RegularBusTicketUiState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RegularBusTicketUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RegularBusTicketSpec f3523a;
    public final TextUIState.ChaloTextUIState b;
    public final BusTicketStatusUiState c;
    public final List d;
    public final RegularBusTicketContainerUiState e;
    public final RegularBusTicketFooterContainerUiState f;

    public RegularBusTicketUiState(TextUIState.ChaloTextUIState ticketHeader, BusTicketStatusUiState busTicketStatusUiState, List list, RegularBusTicketContainerUiState ticketDetailsContainer, RegularBusTicketFooterContainerUiState regularBusTicketFooterContainerUiState, int i) {
        RegularBusTicketSpec regularBusTicketSpec = new RegularBusTicketSpec();
        busTicketStatusUiState = (i & 4) != 0 ? null : busTicketStatusUiState;
        Intrinsics.i(ticketHeader, "ticketHeader");
        Intrinsics.i(ticketDetailsContainer, "ticketDetailsContainer");
        this.f3523a = regularBusTicketSpec;
        this.b = ticketHeader;
        this.c = busTicketStatusUiState;
        this.d = list;
        this.e = ticketDetailsContainer;
        this.f = regularBusTicketFooterContainerUiState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegularBusTicketUiState)) {
            return false;
        }
        RegularBusTicketUiState regularBusTicketUiState = (RegularBusTicketUiState) obj;
        return Intrinsics.d(this.f3523a, regularBusTicketUiState.f3523a) && Intrinsics.d(this.b, regularBusTicketUiState.b) && Intrinsics.d(this.c, regularBusTicketUiState.c) && Intrinsics.d(this.d, regularBusTicketUiState.d) && Intrinsics.d(this.e, regularBusTicketUiState.e) && Intrinsics.d(this.f, regularBusTicketUiState.f);
    }

    public final int hashCode() {
        int iF = r30.f(this.b, this.f3523a.hashCode() * 31, 31);
        BusTicketStatusUiState busTicketStatusUiState = this.c;
        int iHashCode = (iF + (busTicketStatusUiState == null ? 0 : busTicketStatusUiState.hashCode())) * 31;
        List list = this.d;
        int iHashCode2 = (this.e.hashCode() + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        RegularBusTicketFooterContainerUiState regularBusTicketFooterContainerUiState = this.f;
        return iHashCode2 + (regularBusTicketFooterContainerUiState != null ? regularBusTicketFooterContainerUiState.hashCode() : 0);
    }

    public final String toString() {
        return "RegularBusTicketUiState(spec=" + this.f3523a + ", ticketHeader=" + this.b + ", ticketStatusTagUiState=" + this.c + ", ticketBannerState=" + this.d + ", ticketDetailsContainer=" + this.e + ", ticketFooterContainer=" + this.f + ")";
    }
}
