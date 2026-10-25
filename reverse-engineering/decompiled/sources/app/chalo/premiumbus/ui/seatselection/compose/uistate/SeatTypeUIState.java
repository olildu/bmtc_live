package app.chalo.premiumbus.ui.seatselection.compose.uistate;

import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.text.TextUIState;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/compose/uistate/SeatTypeUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SeatTypeUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f7790a;
    public final ChaloColorToken b;
    public final SeatTypeUISpecs c;

    public SeatTypeUIState(ChaloColorToken seatColor, TextUIState.ChaloTextUIState seatType) {
        SeatTypeUISpecs seatTypeUISpecs = new SeatTypeUISpecs();
        Intrinsics.i(seatType, "seatType");
        Intrinsics.i(seatColor, "seatColor");
        this.f7790a = seatType;
        this.b = seatColor;
        this.c = seatTypeUISpecs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeatTypeUIState)) {
            return false;
        }
        SeatTypeUIState seatTypeUIState = (SeatTypeUIState) obj;
        return Intrinsics.d(this.f7790a, seatTypeUIState.f7790a) && Intrinsics.d(this.b, seatTypeUIState.b) && Intrinsics.d(this.c, seatTypeUIState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + z40.b(this.b, this.f7790a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "SeatTypeUIState(seatType=" + this.f7790a + ", seatColor=" + this.b + ", specs=" + this.c + ")";
    }
}
