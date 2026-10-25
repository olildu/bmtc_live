package app.chalo.livetracking.ui.routedetailsscreen;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.pk0;
import defpackage.r30;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/SeatAvailabilityLevelWithInfoUIState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SeatAvailabilityLevelWithInfoUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageUIState f4889a;
    public final TextUIState.ChaloTextUIState b;
    public final float c;

    public SeatAvailabilityLevelWithInfoUIState(ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState) {
        float f = ChaloThemeHelper.a().f;
        this.f4889a = imageUIState;
        this.b = chaloTextUIState;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeatAvailabilityLevelWithInfoUIState)) {
            return false;
        }
        SeatAvailabilityLevelWithInfoUIState seatAvailabilityLevelWithInfoUIState = (SeatAvailabilityLevelWithInfoUIState) obj;
        return Intrinsics.d(this.f4889a, seatAvailabilityLevelWithInfoUIState.f4889a) && Intrinsics.d(this.b, seatAvailabilityLevelWithInfoUIState.b) && Dp.m7283equalsimpl0(this.c, seatAvailabilityLevelWithInfoUIState.c);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.c) + r30.f(this.b, this.f4889a.hashCode() * 31, 31);
    }

    public final String toString() {
        return vo1.p(pk0.n("SeatAvailabilityLevelWithInfoUIState(levelImage=", this.f4889a, ", infoText=", this.b, ", spaceBetween="), Dp.m7289toStringimpl(this.c), ")");
    }
}
