package app.chalo.productsummary.ui.ticket;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.card.CardUISpec;
import app.chalo.uistate.image.ImageUrlUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.cb0;
import defpackage.r30;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/ticket/TicketSummaryReceiptHeaderUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TicketSummaryReceiptHeaderUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageUrlUIState f8816a;
    public final TextUIState b;
    public final TextUIState c;
    public final TextUIState d;
    public final TextUIState e;
    public final TextUIState f;
    public final TextUIState g;
    public final CardUISpec h;
    public final float i;
    public final float j;
    public final ChaloPadding k;
    public final ChaloPadding l;

    public TicketSummaryReceiptHeaderUIState(ImageUrlUIState imageUrlUIState, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, TextUIState.ChaloTextUIState chaloTextUIState3, TextUIState.ChaloTextUIState chaloTextUIState4, TextUIState.ChaloTextUIState chaloTextUIState5, TextUIState.ChaloTextUIState chaloTextUIState6) {
        CardUISpec cardUISpec = new CardUISpec(UIShape.n, ChaloThemeHelper.a().e, 0.0f, 4);
        float f = ChaloThemeHelper.a().d;
        float f2 = ChaloThemeHelper.a().d;
        ChaloPadding chaloPadding = new ChaloPadding(0.0f, 0.0f, 0.0f, ChaloThemeHelper.a().d, 7);
        float f3 = ChaloThemeHelper.a().d;
        ChaloPadding chaloPadding2 = new ChaloPadding(f3, f3, f3, f3);
        this.f8816a = imageUrlUIState;
        this.b = chaloTextUIState;
        this.c = chaloTextUIState2;
        this.d = chaloTextUIState3;
        this.e = chaloTextUIState4;
        this.f = chaloTextUIState5;
        this.g = chaloTextUIState6;
        this.h = cardUISpec;
        this.i = f;
        this.j = f2;
        this.k = chaloPadding;
        this.l = chaloPadding2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketSummaryReceiptHeaderUIState)) {
            return false;
        }
        TicketSummaryReceiptHeaderUIState ticketSummaryReceiptHeaderUIState = (TicketSummaryReceiptHeaderUIState) obj;
        return Intrinsics.d(this.f8816a, ticketSummaryReceiptHeaderUIState.f8816a) && Intrinsics.d(this.b, ticketSummaryReceiptHeaderUIState.b) && Intrinsics.d(this.c, ticketSummaryReceiptHeaderUIState.c) && Intrinsics.d(this.d, ticketSummaryReceiptHeaderUIState.d) && Intrinsics.d(this.e, ticketSummaryReceiptHeaderUIState.e) && Intrinsics.d(this.f, ticketSummaryReceiptHeaderUIState.f) && Intrinsics.d(this.g, ticketSummaryReceiptHeaderUIState.g) && Intrinsics.d(this.h, ticketSummaryReceiptHeaderUIState.h) && Dp.m7283equalsimpl0(this.i, ticketSummaryReceiptHeaderUIState.i) && Dp.m7283equalsimpl0(this.j, ticketSummaryReceiptHeaderUIState.j) && Intrinsics.d(this.k, ticketSummaryReceiptHeaderUIState.k) && Intrinsics.d(this.l, ticketSummaryReceiptHeaderUIState.l);
    }

    public final int hashCode() {
        ImageUrlUIState imageUrlUIState = this.f8816a;
        int iHashCode = (imageUrlUIState == null ? 0 : imageUrlUIState.hashCode()) * 31;
        TextUIState textUIState = this.b;
        int iHashCode2 = (iHashCode + (textUIState == null ? 0 : textUIState.hashCode())) * 31;
        TextUIState textUIState2 = this.c;
        int iHashCode3 = (iHashCode2 + (textUIState2 == null ? 0 : textUIState2.hashCode())) * 31;
        TextUIState textUIState3 = this.d;
        int iHashCode4 = (iHashCode3 + (textUIState3 == null ? 0 : textUIState3.hashCode())) * 31;
        TextUIState textUIState4 = this.e;
        int iHashCode5 = (iHashCode4 + (textUIState4 == null ? 0 : textUIState4.hashCode())) * 31;
        TextUIState textUIState5 = this.f;
        int iHashCode6 = (iHashCode5 + (textUIState5 == null ? 0 : textUIState5.hashCode())) * 31;
        TextUIState textUIState6 = this.g;
        return this.l.hashCode() + r30.c(this.k, uf0.a(this.j, uf0.a(this.i, (this.h.hashCode() + ((iHashCode6 + (textUIState6 != null ? textUIState6.hashCode() : 0)) * 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.i);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.j);
        StringBuilder sb = new StringBuilder("TicketSummaryReceiptHeaderUIState(profileImageUrlUIState=");
        sb.append(this.f8816a);
        sb.append(", userNameUIState=");
        sb.append(this.b);
        sb.append(", depotInfo=");
        sb.append(this.c);
        sb.append(", printedTicketNumber=");
        sb.append(this.d);
        sb.append(", scheduleNumberInfo=");
        sb.append(this.e);
        sb.append(", ticketPunchDate=");
        sb.append(this.f);
        sb.append(", ticketPunchTime=");
        sb.append(this.g);
        sb.append(", profileImageCardSpec=");
        sb.append(this.h);
        sb.append(", spaceBeforeProfileImage=");
        cb0.t(sb, strM7289toStringimpl, ", spaceAfterProfileImage=", strM7289toStringimpl2, ", headerPadding=");
        sb.append(this.k);
        sb.append(", paddingAroundProfileImage=");
        sb.append(this.l);
        sb.append(")");
        return sb.toString();
    }
}
