package app.chalo.validationsdk.blevalidation.ui.qrvalidation;

import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.text.TextUIState;
import defpackage.nf1;
import defpackage.r30;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/TicketGridItemUIState;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TicketGridItemUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TicketGridItemUISpecs f10658a;
    public final TextUIState.ChaloTextUIState b;
    public final UiEventHandler$Companion$fromLambda$1 c;

    public TicketGridItemUIState(TicketGridItemUISpecs ticketGridItemUISpecs, TextUIState.ChaloTextUIState chaloTextUIState, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        this.f10658a = ticketGridItemUISpecs;
        this.b = chaloTextUIState;
        this.c = uiEventHandler$Companion$fromLambda$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketGridItemUIState)) {
            return false;
        }
        TicketGridItemUIState ticketGridItemUIState = (TicketGridItemUIState) obj;
        return this.f10658a.equals(ticketGridItemUIState.f10658a) && this.b.equals(ticketGridItemUIState.b) && this.c.equals(ticketGridItemUIState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + r30.f(this.b, this.f10658a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TicketGridItemUIState(specs=");
        sb.append(this.f10658a);
        sb.append(", textUIState=");
        sb.append(this.b);
        sb.append(", ticketNumberClickedEventHandler=");
        return nf1.n(sb, this.c, ")");
    }
}
