package app.chalo.home.ui.history.uistate.regularbusticket;

import app.chalo.compose.theme.UIShape;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/regularbusticket/RegularBusTicketFooterContainerUiState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RegularBusTicketFooterContainerUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloTicketFooterContainerSpec f3521a = new ChaloTicketFooterContainerSpec();
    public final RegularBusTicketCtaUiState b;
    public final RegularBusTicketCtaUiState c;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public RegularBusTicketFooterContainerUiState(RegularBusTicketCtaUiState regularBusTicketCtaUiState, RegularBusTicketCtaUiState regularBusTicketCtaUiState2) {
        this.b = regularBusTicketCtaUiState;
        this.c = regularBusTicketCtaUiState2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegularBusTicketFooterContainerUiState)) {
            return false;
        }
        RegularBusTicketFooterContainerUiState regularBusTicketFooterContainerUiState = (RegularBusTicketFooterContainerUiState) obj;
        return Intrinsics.d(this.f3521a, regularBusTicketFooterContainerUiState.f3521a) && Intrinsics.d(this.b, regularBusTicketFooterContainerUiState.b) && Intrinsics.d(this.c, regularBusTicketFooterContainerUiState.c);
    }

    public final int hashCode() {
        int iHashCode = this.f3521a.f3517a.hashCode() * 31;
        RegularBusTicketCtaUiState regularBusTicketCtaUiState = this.b;
        int iHashCode2 = (iHashCode + (regularBusTicketCtaUiState == null ? 0 : regularBusTicketCtaUiState.hashCode())) * 31;
        RegularBusTicketCtaUiState regularBusTicketCtaUiState2 = this.c;
        return iHashCode2 + (regularBusTicketCtaUiState2 != null ? regularBusTicketCtaUiState2.hashCode() : 0);
    }

    public final String toString() {
        return "RegularBusTicketFooterContainerUiState(spec=" + this.f3521a + ", ticketFooterDetailsCta=" + this.b + ", ticketFooterActionCta=" + this.c + ")";
    }
}
