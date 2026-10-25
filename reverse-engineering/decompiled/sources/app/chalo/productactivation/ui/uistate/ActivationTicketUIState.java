package app.chalo.productactivation.ui.uistate;

import app.chalo.uistate.card.CardUISpec;
import app.chalo.validationsdk.vehiclebasedvalidation.ui.TicketCardContentSpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/ui/uistate/ActivationTicketUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ActivationTicketUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardUISpec f8065a;
    public final TicketCardContentSpec b;
    public final ActivationTicketContainerUIState c;
    public final ActivationTicketFooterUIState d;

    public ActivationTicketUIState(ActivationTicketContainerUIState ticketContainerUIState, ActivationTicketFooterUIState activationTicketFooterUIState) {
        CardUISpec cardUISpec = new CardUISpec(null, 0.0f, 0.0f, 7);
        TicketCardContentSpec ticketCardContentSpec = new TicketCardContentSpec(null, 3);
        Intrinsics.i(ticketContainerUIState, "ticketContainerUIState");
        this.f8065a = cardUISpec;
        this.b = ticketCardContentSpec;
        this.c = ticketContainerUIState;
        this.d = activationTicketFooterUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivationTicketUIState)) {
            return false;
        }
        ActivationTicketUIState activationTicketUIState = (ActivationTicketUIState) obj;
        return Intrinsics.d(this.f8065a, activationTicketUIState.f8065a) && Intrinsics.d(this.b, activationTicketUIState.b) && Intrinsics.d(this.c, activationTicketUIState.c) && Intrinsics.d(this.d, activationTicketUIState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f8065a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ActivationTicketUIState(cardSpec=" + this.f8065a + ", contentSpec=" + this.b + ", ticketContainerUIState=" + this.c + ", ticketFooterUIState=" + this.d + ")";
    }
}
