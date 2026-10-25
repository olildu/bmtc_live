package app.chalo.productactivation.ui.uistate;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/ui/uistate/StepBasedRouteDetailsSectionUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StepBasedRouteDetailsSectionUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StepBasedRouteDetailsSectionUISpecs f8077a;
    public final StepBasedRouteDetailsToggleUIState b;
    public final StepBasedRouteDetailUIState c;
    public final boolean d;

    public StepBasedRouteDetailsSectionUIState(StepBasedRouteDetailsToggleUIState toggleComponentUIState, StepBasedRouteDetailUIState stepBasedRouteDetailUIState, boolean z) {
        StepBasedRouteDetailsSectionUISpecs stepBasedRouteDetailsSectionUISpecs = new StepBasedRouteDetailsSectionUISpecs();
        Intrinsics.i(toggleComponentUIState, "toggleComponentUIState");
        this.f8077a = stepBasedRouteDetailsSectionUISpecs;
        this.b = toggleComponentUIState;
        this.c = stepBasedRouteDetailUIState;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StepBasedRouteDetailsSectionUIState)) {
            return false;
        }
        StepBasedRouteDetailsSectionUIState stepBasedRouteDetailsSectionUIState = (StepBasedRouteDetailsSectionUIState) obj;
        return Intrinsics.d(this.f8077a, stepBasedRouteDetailsSectionUIState.f8077a) && Intrinsics.d(this.b, stepBasedRouteDetailsSectionUIState.b) && Intrinsics.d(this.c, stepBasedRouteDetailsSectionUIState.c) && this.d == stepBasedRouteDetailsSectionUIState.d;
    }

    public final int hashCode() {
        return ((this.c.hashCode() + ((this.b.hashCode() + (this.f8077a.hashCode() * 31)) * 31)) * 31) + (this.d ? 1231 : 1237);
    }

    public final String toString() {
        return "StepBasedRouteDetailsSectionUIState(specs=" + this.f8077a + ", toggleComponentUIState=" + this.b + ", stepBasedRouteDetailUIState=" + this.c + ", isExpanded=" + this.d + ")";
    }
}
