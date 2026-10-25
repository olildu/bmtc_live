package app.chalo.livetracking.ui.routedetailsscreen.uistatefactory;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.divider.DividerUIState;
import defpackage.py;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/RouteStopsListUIState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteStopsListUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4940a;
    public final DividerUIState b;
    public final Integer c;
    public final RouteStopsListUISpecs d;

    public RouteStopsListUIState(List stops, Integer num, RouteStopsListUISpecs routeStopsListUISpecs) {
        DividerUIState dividerUIState = new DividerUIState(ChaloThemeHelper.a().f, ChaloColorToken.GreyColor.f9806a, null, 4);
        Intrinsics.i(stops, "stops");
        this.f4940a = stops;
        this.b = dividerUIState;
        this.c = num;
        this.d = routeStopsListUISpecs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteStopsListUIState)) {
            return false;
        }
        RouteStopsListUIState routeStopsListUIState = (RouteStopsListUIState) obj;
        return Intrinsics.d(this.f4940a, routeStopsListUIState.f4940a) && Intrinsics.d(this.b, routeStopsListUIState.b) && Intrinsics.d(this.c, routeStopsListUIState.c) && Intrinsics.d(this.d, routeStopsListUIState.d);
    }

    public final int hashCode() {
        int iC = py.c(this.b, this.f4940a.hashCode() * 31, 31);
        Integer num = this.c;
        return this.d.hashCode() + ((iC + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        return "RouteStopsListUIState(stops=" + this.f4940a + ", divider=" + this.b + ", initialScrollPos=" + this.c + ", spec=" + this.d + ")";
    }
}
