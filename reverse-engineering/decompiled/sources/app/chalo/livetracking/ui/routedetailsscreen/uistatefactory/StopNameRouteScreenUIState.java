package app.chalo.livetracking.ui.routedetailsscreen.uistatefactory;

import app.chalo.uistate.text.FlowTextUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.py;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/StopNameRouteScreenUIState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StopNameRouteScreenUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlowTextUIState f4957a;
    public final StopNameRouteScreenUISpecs b;
    public final TextUIState.ChaloTextUIState c;

    public StopNameRouteScreenUIState(FlowTextUIState stopName, StopNameRouteScreenUISpecs specs, TextUIState.ChaloTextUIState chaloTextUIState) {
        Intrinsics.i(stopName, "stopName");
        Intrinsics.i(specs, "specs");
        this.f4957a = stopName;
        this.b = specs;
        this.c = chaloTextUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StopNameRouteScreenUIState)) {
            return false;
        }
        StopNameRouteScreenUIState stopNameRouteScreenUIState = (StopNameRouteScreenUIState) obj;
        return Intrinsics.d(this.f4957a, stopNameRouteScreenUIState.f4957a) && Intrinsics.d(this.b, stopNameRouteScreenUIState.b) && Intrinsics.d(this.c, stopNameRouteScreenUIState.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f4957a.hashCode() * 31)) * 31;
        TextUIState.ChaloTextUIState chaloTextUIState = this.c;
        return iHashCode + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StopNameRouteScreenUIState(stopName=");
        sb.append(this.f4957a);
        sb.append(", specs=");
        sb.append(this.b);
        sb.append(", reportProblemHook=");
        return py.f(sb, this.c, ")");
    }
}
