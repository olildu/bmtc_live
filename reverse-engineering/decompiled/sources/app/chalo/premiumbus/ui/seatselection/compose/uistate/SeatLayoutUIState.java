package app.chalo.premiumbus.ui.seatselection.compose.uistate;

import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/compose/uistate/SeatLayoutUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SeatLayoutUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SeatLayoutUISpecs f7786a;
    public final List b;
    public final GridIndexInfoUIState c;
    public final GridIndexInfoUIState d;

    public SeatLayoutUIState(List seatsUIState, GridIndexInfoUIState gridIndexInfoUIState, GridIndexInfoUIState gridIndexInfoUIState2) {
        SeatLayoutUISpecs seatLayoutUISpecs = new SeatLayoutUISpecs();
        Intrinsics.i(seatsUIState, "seatsUIState");
        this.f7786a = seatLayoutUISpecs;
        this.b = seatsUIState;
        this.c = gridIndexInfoUIState;
        this.d = gridIndexInfoUIState2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeatLayoutUIState)) {
            return false;
        }
        SeatLayoutUIState seatLayoutUIState = (SeatLayoutUIState) obj;
        return Intrinsics.d(this.f7786a, seatLayoutUIState.f7786a) && Intrinsics.d(this.b, seatLayoutUIState.b) && Intrinsics.d(this.c, seatLayoutUIState.c) && Intrinsics.d(this.d, seatLayoutUIState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + r30.b(this.f7786a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "SeatLayoutUIState(specs=" + this.f7786a + ", seatsUIState=" + this.b + ", gridRowIndexInfoUIState=" + this.c + ", gridColumnIndexInfoUIState=" + this.d + ")";
    }
}
