package app.chalo.productsummary.ui.ticket;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.divider.DashedDividerUIState;
import defpackage.py;
import defpackage.r30;
import defpackage.uf0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/ticket/TicketSummaryReceiptCardUISpec;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TicketSummaryReceiptCardUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f8814a;
    public final ChaloPadding b;
    public final float c;
    public final DashedDividerUIState d;
    public final float e;

    public TicketSummaryReceiptCardUISpec() {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        float fM7278constructorimpl = Dp.m7278constructorimpl(ChaloThemeHelper.a().h + ChaloThemeHelper.a().d);
        DashedDividerUIState dashedDividerUIState = new DashedDividerUIState(ChaloThemeHelper.a().b, 12, ChaloColorToken.Black.f9759a);
        float f2 = ChaloThemeHelper.a().l;
        this.f8814a = ChaloColorToken.White.f9870a;
        this.b = chaloPadding;
        this.c = fM7278constructorimpl;
        this.d = dashedDividerUIState;
        this.e = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketSummaryReceiptCardUISpec)) {
            return false;
        }
        TicketSummaryReceiptCardUISpec ticketSummaryReceiptCardUISpec = (TicketSummaryReceiptCardUISpec) obj;
        return Intrinsics.d(this.f8814a, ticketSummaryReceiptCardUISpec.f8814a) && Intrinsics.d(this.b, ticketSummaryReceiptCardUISpec.b) && Dp.m7283equalsimpl0(this.c, ticketSummaryReceiptCardUISpec.c) && Intrinsics.d(this.d, ticketSummaryReceiptCardUISpec.d) && Dp.m7283equalsimpl0(this.e, ticketSummaryReceiptCardUISpec.e);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.e) + ((this.d.hashCode() + uf0.a(this.c, r30.c(this.b, this.f8814a.hashCode() * 31, 31), 31)) * 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.e);
        StringBuilder sbI = py.i(this.b, this.f8814a, "TicketSummaryReceiptCardUISpec(backgroundColorToken=", ", contentPadding=", ", sectionSpacing=");
        sbI.append(strM7289toStringimpl);
        sbI.append(", sectionDividerUIState=");
        sbI.append(this.d);
        sbI.append(", spaceBeforeVehicleMeta=");
        return vo1.p(sbI, strM7289toStringimpl2, ")");
    }
}
