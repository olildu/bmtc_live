package app.chalo.productactivation.ui.uistate;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/ui/uistate/StepBasedRouteDetailUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StepBasedRouteDetailUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StepBasedRouteDetailUISpecs f8075a;
    public final List b;

    public StepBasedRouteDetailUIState(List stepBasedRouteDetailCardStateList) {
        StepBasedRouteDetailUISpecs stepBasedRouteDetailUISpecs = new StepBasedRouteDetailUISpecs();
        Intrinsics.i(stepBasedRouteDetailCardStateList, "stepBasedRouteDetailCardStateList");
        this.f8075a = stepBasedRouteDetailUISpecs;
        this.b = stepBasedRouteDetailCardStateList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StepBasedRouteDetailUIState)) {
            return false;
        }
        StepBasedRouteDetailUIState stepBasedRouteDetailUIState = (StepBasedRouteDetailUIState) obj;
        return Intrinsics.d(this.f8075a, stepBasedRouteDetailUIState.f8075a) && Intrinsics.d(this.b, stepBasedRouteDetailUIState.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8075a.f8074a.hashCode() * 31);
    }

    public final String toString() {
        return "StepBasedRouteDetailUIState(specs=" + this.f8075a + ", stepBasedRouteDetailCardStateList=" + this.b + ")";
    }
}
