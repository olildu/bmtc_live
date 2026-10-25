package app.chalo.mticket.ui.passengerselection;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.pk0;
import defpackage.py;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerItemUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MTicketPassengerItemUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MTicketPassengerItemCounterUIState f5738a;
    public final TextUIState b;
    public final MTicketPassengerItemFareUIState c;
    public final DividerUIState d;
    public final ChaloPadding e;
    public final ChaloPadding f;

    public MTicketPassengerItemUIState(MTicketPassengerItemCounterUIState counter, TextUIState.ChaloTextUIState passengerName, MTicketPassengerItemFareUIState mTicketPassengerItemFareUIState) {
        DividerUIState dividerUIState = new DividerUIState(ChaloThemeHelper.a().b, ChaloColorToken.TextFieldIndicator.f9859a, null, 4);
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().d, 0.0f, 0.0f, 0.0f, 14);
        Intrinsics.i(counter, "counter");
        Intrinsics.i(passengerName, "passengerName");
        this.f5738a = counter;
        this.b = passengerName;
        this.c = mTicketPassengerItemFareUIState;
        this.d = dividerUIState;
        this.e = chaloPadding;
        this.f = chaloPadding2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MTicketPassengerItemUIState)) {
            return false;
        }
        MTicketPassengerItemUIState mTicketPassengerItemUIState = (MTicketPassengerItemUIState) obj;
        return Intrinsics.d(this.f5738a, mTicketPassengerItemUIState.f5738a) && Intrinsics.d(this.b, mTicketPassengerItemUIState.b) && Intrinsics.d(this.c, mTicketPassengerItemUIState.c) && Intrinsics.d(this.d, mTicketPassengerItemUIState.d) && Intrinsics.d(this.e, mTicketPassengerItemUIState.e) && Intrinsics.d(this.f, mTicketPassengerItemUIState.f);
    }

    public final int hashCode() {
        int iC = pk0.c(this.b, this.f5738a.hashCode() * 31, 961);
        MTicketPassengerItemFareUIState mTicketPassengerItemFareUIState = this.c;
        return this.f.hashCode() + r30.c(this.e, py.c(this.d, (iC + (mTicketPassengerItemFareUIState == null ? 0 : mTicketPassengerItemFareUIState.hashCode())) * 31, 31), 31);
    }

    public final String toString() {
        return "MTicketPassengerItemUIState(counter=" + this.f5738a + ", passengerName=" + this.b + ", passengerDesc=null, fare=" + this.c + ", divider=" + this.d + ", paddingAround=" + this.e + ", paddingAroundDesc=" + this.f + ")";
    }
}
