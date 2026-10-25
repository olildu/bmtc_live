package app.chalo.livetracking.tripplanner.ui.result.ui;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/result/ui/TripPlannerResultsAnchoredAdLayoutState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TripPlannerResultsAnchoredAdLayoutState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4796a;
    public final float b;

    public TripPlannerResultsAnchoredAdLayoutState(float f, boolean z) {
        this.f4796a = z;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TripPlannerResultsAnchoredAdLayoutState)) {
            return false;
        }
        TripPlannerResultsAnchoredAdLayoutState tripPlannerResultsAnchoredAdLayoutState = (TripPlannerResultsAnchoredAdLayoutState) obj;
        return this.f4796a == tripPlannerResultsAnchoredAdLayoutState.f4796a && Dp.m7283equalsimpl0(this.b, tripPlannerResultsAnchoredAdLayoutState.b);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.b) + ((this.f4796a ? 1231 : 1237) * 31);
    }

    public final String toString() {
        return "TripPlannerResultsAnchoredAdLayoutState(shouldRenderOverlay=" + this.f4796a + ", extraBottomContentPadding=" + Dp.m7289toStringimpl(this.b) + ")";
    }
}
