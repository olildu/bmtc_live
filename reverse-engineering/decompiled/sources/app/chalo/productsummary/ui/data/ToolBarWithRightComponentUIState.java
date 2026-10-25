package app.chalo.productsummary.ui.data;

import app.chalo.compose.theme.UIShape;
import app.chalo.home.ui.history.uistate.chalobusticket.BusTicketStatusUiState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import defpackage.t8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/data/ToolBarWithRightComponentUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ToolBarWithRightComponentUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ToolBarWithRightComponentUISpec f8761a;
    public final ToolbarUIState b;
    public final BusTicketStatusUiState c;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public ToolBarWithRightComponentUIState(ToolbarUIState toolbarUIState, BusTicketStatusUiState busTicketStatusUiState, int i) {
        ToolBarWithRightComponentUISpec toolBarWithRightComponentUISpec = new ToolBarWithRightComponentUISpec();
        busTicketStatusUiState = (i & 4) != 0 ? null : busTicketStatusUiState;
        Intrinsics.i(toolbarUIState, "toolbarUIState");
        this.f8761a = toolBarWithRightComponentUISpec;
        this.b = toolbarUIState;
        this.c = busTicketStatusUiState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ToolBarWithRightComponentUIState)) {
            return false;
        }
        ToolBarWithRightComponentUIState toolBarWithRightComponentUIState = (ToolBarWithRightComponentUIState) obj;
        return Intrinsics.d(this.f8761a, toolBarWithRightComponentUIState.f8761a) && Intrinsics.d(this.b, toolBarWithRightComponentUIState.b) && Intrinsics.d(this.c, toolBarWithRightComponentUIState.c);
    }

    public final int hashCode() {
        int iD = t8.d(this.b, this.f8761a.hashCode() * 31, 31);
        BusTicketStatusUiState busTicketStatusUiState = this.c;
        return iD + (busTicketStatusUiState == null ? 0 : busTicketStatusUiState.hashCode());
    }

    public final String toString() {
        return "ToolBarWithRightComponentUIState(toolBarUISpec=" + this.f8761a + ", toolbarUIState=" + this.b + ", ticketStatusUiState=" + this.c + ")";
    }
}
