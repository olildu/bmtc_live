package app.chalo.productsummary.ui.ticket;

import app.chalo.uistate.text.TextUIState;
import defpackage.py;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/ticket/TicketSupportUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TicketSupportUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TicketSupportUIStateSpec f8828a;
    public final TextUIState.ChaloTextUIState b;
    public final TextUIState.ChaloTextUIState c;

    public TicketSupportUIState(TextUIState.ChaloTextUIState title, TextUIState.ChaloTextUIState chaloTextUIState) {
        TicketSupportUIStateSpec ticketSupportUIStateSpec = new TicketSupportUIStateSpec();
        Intrinsics.i(title, "title");
        this.f8828a = ticketSupportUIStateSpec;
        this.b = title;
        this.c = chaloTextUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketSupportUIState)) {
            return false;
        }
        TicketSupportUIState ticketSupportUIState = (TicketSupportUIState) obj;
        return Intrinsics.d(this.f8828a, ticketSupportUIState.f8828a) && Intrinsics.d(this.b, ticketSupportUIState.b) && Intrinsics.d(this.c, ticketSupportUIState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + r30.f(this.b, this.f8828a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TicketSupportUIState(spec=");
        sb.append(this.f8828a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", actionText=");
        return py.f(sb, this.c, ")");
    }
}
