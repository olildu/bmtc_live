package app.chalo.livetracking.ui.routedetailsscreen.uistatefactory;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/RouteScreenBusNumberUIState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteScreenBusNumberUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageUIState f4936a;
    public final TextUIState b;
    public final float c;
    public final BusEtaWithSeatAvailabilityAndBonnetUISpec d;

    public RouteScreenBusNumberUIState(ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState) {
        float f = ChaloThemeHelper.a().c;
        BusEtaWithSeatAvailabilityAndBonnetUISpec busEtaWithSeatAvailabilityAndBonnetUISpec = new BusEtaWithSeatAvailabilityAndBonnetUISpec();
        this.f4936a = imageUIState;
        this.b = chaloTextUIState;
        this.c = f;
        this.d = busEtaWithSeatAvailabilityAndBonnetUISpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteScreenBusNumberUIState)) {
            return false;
        }
        RouteScreenBusNumberUIState routeScreenBusNumberUIState = (RouteScreenBusNumberUIState) obj;
        return Intrinsics.d(this.f4936a, routeScreenBusNumberUIState.f4936a) && Intrinsics.d(this.b, routeScreenBusNumberUIState.b) && Dp.m7283equalsimpl0(this.c, routeScreenBusNumberUIState.c) && Intrinsics.d(this.d, routeScreenBusNumberUIState.d);
    }

    public final int hashCode() {
        int iHashCode = this.f4936a.hashCode() * 31;
        TextUIState textUIState = this.b;
        return this.d.hashCode() + uf0.a(this.c, (iHashCode + (textUIState == null ? 0 : textUIState.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "RouteScreenBusNumberUIState(busIcon=" + this.f4936a + ", vehicleNumber=" + this.b + ", spaceBetween=" + Dp.m7289toStringimpl(this.c) + ", spec=" + this.d + ")";
    }
}
