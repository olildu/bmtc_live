package app.chalo.uistate.components;

import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/components/TicketRouteNameUiState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TicketRouteNameUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageUIState f9957a;
    public final TextUIState.ChaloTextUIState b;

    public TicketRouteNameUiState(ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState) {
        this.f9957a = imageUIState;
        this.b = chaloTextUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketRouteNameUiState)) {
            return false;
        }
        TicketRouteNameUiState ticketRouteNameUiState = (TicketRouteNameUiState) obj;
        return Intrinsics.d(this.f9957a, ticketRouteNameUiState.f9957a) && Intrinsics.d(this.b, ticketRouteNameUiState.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f9957a.hashCode() * 31);
    }

    public final String toString() {
        return "TicketRouteNameUiState(image=" + this.f9957a + ", routeName=" + this.b + ")";
    }
}
