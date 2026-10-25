package app.chalo.mticket.ui.passengerselection;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.text.TextUIState;
import defpackage.py;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerItemFareUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MTicketPassengerItemFareUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState f5737a;
    public final TextUIState b;
    public final TextUIState c;
    public final float d;
    public final ChaloPadding e;

    public MTicketPassengerItemFareUIState(TextUIState discountFare, TextUIState textUIState, TextUIState.ChaloTextUIState chaloTextUIState) {
        float f = ChaloThemeHelper.a().f;
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().d, 0.0f, 0.0f, 0.0f, 14);
        Intrinsics.i(discountFare, "discountFare");
        this.f5737a = discountFare;
        this.b = textUIState;
        this.c = chaloTextUIState;
        this.d = f;
        this.e = chaloPadding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MTicketPassengerItemFareUIState)) {
            return false;
        }
        MTicketPassengerItemFareUIState mTicketPassengerItemFareUIState = (MTicketPassengerItemFareUIState) obj;
        return Intrinsics.d(this.f5737a, mTicketPassengerItemFareUIState.f5737a) && Intrinsics.d(this.b, mTicketPassengerItemFareUIState.b) && Intrinsics.d(this.c, mTicketPassengerItemFareUIState.c) && Dp.m7283equalsimpl0(this.d, mTicketPassengerItemFareUIState.d) && Intrinsics.d(this.e, mTicketPassengerItemFareUIState.e);
    }

    public final int hashCode() {
        int iHashCode = this.f5737a.hashCode() * 31;
        TextUIState textUIState = this.b;
        int iHashCode2 = (iHashCode + (textUIState == null ? 0 : textUIState.hashCode())) * 31;
        TextUIState textUIState2 = this.c;
        return this.e.hashCode() + uf0.a(this.d, (iHashCode2 + (textUIState2 != null ? textUIState2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.d);
        StringBuilder sb = new StringBuilder("MTicketPassengerItemFareUIState(discountFare=");
        sb.append(this.f5737a);
        sb.append(", passengerFare=");
        sb.append(this.b);
        sb.append(", discountPercentage=");
        sb.append(this.c);
        sb.append(", spaceBetween=");
        sb.append(strM7289toStringimpl);
        sb.append(", paddingAround=");
        return py.e(sb, this.e, ")");
    }
}
