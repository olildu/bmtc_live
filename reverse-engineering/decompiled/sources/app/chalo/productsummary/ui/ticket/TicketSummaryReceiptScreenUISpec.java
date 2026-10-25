package app.chalo.productsummary.ui.ticket;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.card.CardUISpec;
import defpackage.py;
import defpackage.r30;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/ticket/TicketSummaryReceiptScreenUISpec;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TicketSummaryReceiptScreenUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f8817a;
    public final ChaloPadding b;
    public final float c;
    public final CardUISpec d;

    public TicketSummaryReceiptScreenUISpec() {
        ChaloPadding chaloPadding = new ChaloPadding(0.0f, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, 0.0f, 9);
        float f = ChaloThemeHelper.a().k;
        CardUISpec cardUISpec = new CardUISpec(UIShape.e, ChaloThemeHelper.a().c, 0.0f, 4);
        this.f8817a = ChaloColorToken.White.f9870a;
        this.b = chaloPadding;
        this.c = f;
        this.d = cardUISpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketSummaryReceiptScreenUISpec)) {
            return false;
        }
        TicketSummaryReceiptScreenUISpec ticketSummaryReceiptScreenUISpec = (TicketSummaryReceiptScreenUISpec) obj;
        return Intrinsics.d(this.f8817a, ticketSummaryReceiptScreenUISpec.f8817a) && Intrinsics.d(this.b, ticketSummaryReceiptScreenUISpec.b) && Dp.m7283equalsimpl0(this.c, ticketSummaryReceiptScreenUISpec.c) && Intrinsics.d(this.d, ticketSummaryReceiptScreenUISpec.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + uf0.a(this.c, r30.c(this.b, this.f8817a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.c);
        StringBuilder sbI = py.i(this.b, this.f8817a, "TicketSummaryReceiptScreenUISpec(screenBackgroundColorToken=", ", contentPadding=", ", topSectionSpacing=");
        sbI.append(strM7289toStringimpl);
        sbI.append(", cardUISpec=");
        sbI.append(this.d);
        sbI.append(")");
        return sbI.toString();
    }
}
