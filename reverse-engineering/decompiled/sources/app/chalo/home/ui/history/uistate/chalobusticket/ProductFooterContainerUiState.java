package app.chalo.home.ui.history.uistate.chalobusticket;

import app.chalo.compose.theme.UIShape;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/chalobusticket/ProductFooterContainerUiState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductFooterContainerUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloTicketFooterContainerSpec f3511a;
    public final ChaloBusTicketCtaUiState b;
    public final ChaloBusTicketCtaUiState c;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public ProductFooterContainerUiState(ChaloBusTicketCtaUiState ticketFooterDetailsCta, ChaloBusTicketCtaUiState chaloBusTicketCtaUiState) {
        ChaloTicketFooterContainerSpec chaloTicketFooterContainerSpec = new ChaloTicketFooterContainerSpec();
        Intrinsics.i(ticketFooterDetailsCta, "ticketFooterDetailsCta");
        this.f3511a = chaloTicketFooterContainerSpec;
        this.b = ticketFooterDetailsCta;
        this.c = chaloBusTicketCtaUiState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductFooterContainerUiState)) {
            return false;
        }
        ProductFooterContainerUiState productFooterContainerUiState = (ProductFooterContainerUiState) obj;
        return Intrinsics.d(this.f3511a, productFooterContainerUiState.f3511a) && Intrinsics.d(this.b, productFooterContainerUiState.b) && Intrinsics.d(this.c, productFooterContainerUiState.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f3511a.f3510a.hashCode() * 31)) * 31;
        ChaloBusTicketCtaUiState chaloBusTicketCtaUiState = this.c;
        return iHashCode + (chaloBusTicketCtaUiState == null ? 0 : chaloBusTicketCtaUiState.hashCode());
    }

    public final String toString() {
        return "ProductFooterContainerUiState(spec=" + this.f3511a + ", ticketFooterDetailsCta=" + this.b + ", ticketFooterActionCta=" + this.c + ")";
    }
}
