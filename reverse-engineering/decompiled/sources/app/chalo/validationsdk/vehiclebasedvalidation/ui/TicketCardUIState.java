package app.chalo.validationsdk.vehiclebasedvalidation.ui;

import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.card.CardUISpec;
import app.chalo.uistate.components.RegularBusTicketContainerUiState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/vehiclebasedvalidation/ui/TicketCardUIState;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TicketCardUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardUISpec f10738a;
    public final TicketCardContentSpec b;
    public final RegularBusTicketContainerUiState c;
    public final RegularBusTicketCtaUiState d;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public TicketCardUIState(CardUISpec cardSpec, TicketCardContentSpec contentSpec, RegularBusTicketContainerUiState regularBusTicketContainerUiState, RegularBusTicketCtaUiState regularBusTicketCtaUiState) {
        Intrinsics.i(cardSpec, "cardSpec");
        Intrinsics.i(contentSpec, "contentSpec");
        this.f10738a = cardSpec;
        this.b = contentSpec;
        this.c = regularBusTicketContainerUiState;
        this.d = regularBusTicketCtaUiState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketCardUIState)) {
            return false;
        }
        TicketCardUIState ticketCardUIState = (TicketCardUIState) obj;
        return Intrinsics.d(this.f10738a, ticketCardUIState.f10738a) && Intrinsics.d(this.b, ticketCardUIState.b) && Intrinsics.d(this.c, ticketCardUIState.c) && Intrinsics.d(this.d, ticketCardUIState.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f10738a.hashCode() * 31)) * 31;
        RegularBusTicketContainerUiState regularBusTicketContainerUiState = this.c;
        int iHashCode2 = (iHashCode + (regularBusTicketContainerUiState == null ? 0 : regularBusTicketContainerUiState.hashCode())) * 31;
        RegularBusTicketCtaUiState regularBusTicketCtaUiState = this.d;
        return iHashCode2 + (regularBusTicketCtaUiState != null ? regularBusTicketCtaUiState.hashCode() : 0);
    }

    public final String toString() {
        return "TicketCardUIState(cardSpec=" + this.f10738a + ", contentSpec=" + this.b + ", ticketContainerUiState=" + this.c + ", ticketFooterActionCta=" + this.d + ")";
    }
}
