package app.chalo.livetracking.ui.routedetailsscreen.uistatefactory;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/SingleBusFixedEtaUIState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SingleBusFixedEtaUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BusEtaWithSeatAvailabilityAndBonnet f4949a;
    public final RouteDetailsAlertTextUIState b;
    public final float c;
    public final SingleBusFixedEtaUISpecs d;

    public SingleBusFixedEtaUIState(BusEtaWithSeatAvailabilityAndBonnet busEtaWithSeatAvailabilityAndBonnet, RouteDetailsAlertTextUIState routeDetailsAlertTextUIState) {
        float f = ChaloThemeHelper.a().d;
        SingleBusFixedEtaUISpecs singleBusFixedEtaUISpecs = new SingleBusFixedEtaUISpecs();
        this.f4949a = busEtaWithSeatAvailabilityAndBonnet;
        this.b = routeDetailsAlertTextUIState;
        this.c = f;
        this.d = singleBusFixedEtaUISpecs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SingleBusFixedEtaUIState)) {
            return false;
        }
        SingleBusFixedEtaUIState singleBusFixedEtaUIState = (SingleBusFixedEtaUIState) obj;
        return Intrinsics.d(this.f4949a, singleBusFixedEtaUIState.f4949a) && Intrinsics.d(this.b, singleBusFixedEtaUIState.b) && Dp.m7283equalsimpl0(this.c, singleBusFixedEtaUIState.c) && Intrinsics.d(this.d, singleBusFixedEtaUIState.d);
    }

    public final int hashCode() {
        int iHashCode = this.f4949a.hashCode() * 31;
        RouteDetailsAlertTextUIState routeDetailsAlertTextUIState = this.b;
        return this.d.f4948a.hashCode() + uf0.a(this.c, (iHashCode + (routeDetailsAlertTextUIState == null ? 0 : routeDetailsAlertTextUIState.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "SingleBusFixedEtaUIState(etaAndSeatAvailability=" + this.f4949a + ", alertText=" + this.b + ", spaceBeforeAlert=" + Dp.m7289toStringimpl(this.c) + ", specs=" + this.d + ")";
    }
}
