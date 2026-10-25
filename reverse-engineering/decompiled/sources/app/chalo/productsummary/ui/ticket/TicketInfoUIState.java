package app.chalo.productsummary.ui.ticket;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.divider.DividerUIState;
import defpackage.py;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/ticket/TicketInfoUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TicketInfoUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8800a;
    public final DividerUIState b;
    public final ChaloPadding c;

    public TicketInfoUIState(List list, DividerUIState dividerUIState, int i) {
        dividerUIState = (i & 2) != 0 ? null : dividerUIState;
        ChaloPadding chaloPadding = new ChaloPadding(0.0f, ChaloThemeHelper.a().h, 1);
        this.f8800a = list;
        this.b = dividerUIState;
        this.c = chaloPadding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketInfoUIState)) {
            return false;
        }
        TicketInfoUIState ticketInfoUIState = (TicketInfoUIState) obj;
        return Intrinsics.d(this.f8800a, ticketInfoUIState.f8800a) && Intrinsics.d(this.b, ticketInfoUIState.b) && Intrinsics.d(this.c, ticketInfoUIState.c);
    }

    public final int hashCode() {
        int iHashCode = this.f8800a.hashCode() * 31;
        DividerUIState dividerUIState = this.b;
        return this.c.hashCode() + ((iHashCode + (dividerUIState == null ? 0 : dividerUIState.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TicketInfoUIState(ticketInfoContentUIState=");
        sb.append(this.f8800a);
        sb.append(", dividerUiState=");
        sb.append(this.b);
        sb.append(", dividerPadding=");
        return py.e(sb, this.c, ")");
    }
}
