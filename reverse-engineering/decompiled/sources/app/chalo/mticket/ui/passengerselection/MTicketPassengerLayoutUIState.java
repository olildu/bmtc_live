package app.chalo.mticket.ui.passengerselection;

import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.dd;
import defpackage.pk0;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerLayoutUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MTicketPassengerLayoutUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MTicketPassengerLayoutUISpec f5740a;
    public final TextUIState b;
    public final List c;
    public final DividerUIState d;
    public final List e;
    public final List f;
    public final TitleAndDescSpaceBetweenUIState g;

    public MTicketPassengerLayoutUIState(MTicketPassengerLayoutUISpec mTicketPassengerLayoutUISpec, TextUIState.ChaloTextUIState title, List passengerItems, DividerUIState dividerUIState, List fareBreakup, List discountBreakup, TitleAndDescSpaceBetweenUIState titleAndDescSpaceBetweenUIState) {
        Intrinsics.i(title, "title");
        Intrinsics.i(passengerItems, "passengerItems");
        Intrinsics.i(fareBreakup, "fareBreakup");
        Intrinsics.i(discountBreakup, "discountBreakup");
        this.f5740a = mTicketPassengerLayoutUISpec;
        this.b = title;
        this.c = passengerItems;
        this.d = dividerUIState;
        this.e = fareBreakup;
        this.f = discountBreakup;
        this.g = titleAndDescSpaceBetweenUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MTicketPassengerLayoutUIState)) {
            return false;
        }
        MTicketPassengerLayoutUIState mTicketPassengerLayoutUIState = (MTicketPassengerLayoutUIState) obj;
        return Intrinsics.d(this.f5740a, mTicketPassengerLayoutUIState.f5740a) && Intrinsics.d(this.b, mTicketPassengerLayoutUIState.b) && Intrinsics.d(this.c, mTicketPassengerLayoutUIState.c) && Intrinsics.d(this.d, mTicketPassengerLayoutUIState.d) && Intrinsics.d(this.e, mTicketPassengerLayoutUIState.e) && Intrinsics.d(this.f, mTicketPassengerLayoutUIState.f) && Intrinsics.d(this.g, mTicketPassengerLayoutUIState.g);
    }

    public final int hashCode() {
        int iB = r30.b(pk0.c(this.b, this.f5740a.hashCode() * 31, 31), 31, this.c);
        DividerUIState dividerUIState = this.d;
        int iB2 = r30.b(r30.b((iB + (dividerUIState == null ? 0 : dividerUIState.hashCode())) * 31, 31, this.e), 31, this.f);
        TitleAndDescSpaceBetweenUIState titleAndDescSpaceBetweenUIState = this.g;
        return iB2 + (titleAndDescSpaceBetweenUIState != null ? titleAndDescSpaceBetweenUIState.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MTicketPassengerLayoutUIState(spec=");
        sb.append(this.f5740a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", passengerItems=");
        sb.append(this.c);
        sb.append(", dividerAboveFareBreakup=");
        sb.append(this.d);
        sb.append(", fareBreakup=");
        dd.o(sb, this.e, ", discountBreakup=", this.f, ", totalAmount=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
