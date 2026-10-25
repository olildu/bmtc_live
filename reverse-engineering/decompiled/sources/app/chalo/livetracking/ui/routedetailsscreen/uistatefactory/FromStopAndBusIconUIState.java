package app.chalo.livetracking.ui.routedetailsscreen.uistatefactory;

import app.chalo.compose.theme.ShapedContentUIState;
import app.chalo.uistate.divider.DividerUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/FromStopAndBusIconUIState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FromStopAndBusIconUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DividerUIState f4911a;
    public final DividerUIState b;
    public final ShapedContentUIState c;
    public final StopsListBusIconUIState d;
    public final FromStopAndBusIconUISpecs e;
    public final boolean f;

    public FromStopAndBusIconUIState(DividerUIState dividerUIState, DividerUIState dividerUIState2, ShapedContentUIState shapedContentUIState, StopsListBusIconUIState stopsListBusIconUIState, FromStopAndBusIconUISpecs fromStopAndBusIconUISpecs, boolean z) {
        this.f4911a = dividerUIState;
        this.b = dividerUIState2;
        this.c = shapedContentUIState;
        this.d = stopsListBusIconUIState;
        this.e = fromStopAndBusIconUISpecs;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FromStopAndBusIconUIState)) {
            return false;
        }
        FromStopAndBusIconUIState fromStopAndBusIconUIState = (FromStopAndBusIconUIState) obj;
        return Intrinsics.d(this.f4911a, fromStopAndBusIconUIState.f4911a) && Intrinsics.d(this.b, fromStopAndBusIconUIState.b) && Intrinsics.d(this.c, fromStopAndBusIconUIState.c) && Intrinsics.d(this.d, fromStopAndBusIconUIState.d) && Intrinsics.d(this.e, fromStopAndBusIconUIState.e) && this.f == fromStopAndBusIconUIState.f;
    }

    public final int hashCode() {
        DividerUIState dividerUIState = this.f4911a;
        int iHashCode = (dividerUIState == null ? 0 : dividerUIState.hashCode()) * 31;
        DividerUIState dividerUIState2 = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (dividerUIState2 == null ? 0 : dividerUIState2.hashCode())) * 31)) * 31;
        StopsListBusIconUIState stopsListBusIconUIState = this.d;
        return ((this.e.hashCode() + ((iHashCode2 + (stopsListBusIconUIState != null ? stopsListBusIconUIState.hashCode() : 0)) * 31)) * 31) + (this.f ? 1231 : 1237);
    }

    public final String toString() {
        return "FromStopAndBusIconUIState(topDivider=" + this.f4911a + ", bottomDivider=" + this.b + ", bulletShape=" + this.c + ", busIcon=" + this.d + ", spec=" + this.e + ", showBusNumber=" + this.f + ")";
    }
}
