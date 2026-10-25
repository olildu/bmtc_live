package app.chalo.validationsdk.vehiclebasedvalidation.ui;

import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.text.AlertTextWithIconUiState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/vehiclebasedvalidation/ui/TicketExpiryContainer;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TicketExpiryContainer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TicketExpiryContainerSpec f10739a;
    public final AlertTextWithIconUiState b;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public TicketExpiryContainer(TicketExpiryContainerSpec spec, AlertTextWithIconUiState alertTextWithIconUiState) {
        Intrinsics.i(spec, "spec");
        this.f10739a = spec;
        this.b = alertTextWithIconUiState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketExpiryContainer)) {
            return false;
        }
        TicketExpiryContainer ticketExpiryContainer = (TicketExpiryContainer) obj;
        return Intrinsics.d(this.f10739a, ticketExpiryContainer.f10739a) && Intrinsics.d(this.b, ticketExpiryContainer.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10739a.hashCode() * 31);
    }

    public final String toString() {
        return "TicketExpiryContainer(spec=" + this.f10739a + ", expiry=" + this.b + ")";
    }
}
