package app.chalo.productactivation.ui.uistate;

import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.branding.ProductBookingBrandingUIState;
import app.chalo.uistate.multimodal.StepTicketModeBasedInfoUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/ui/uistate/StepBasedRouteDetailCardUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StepBasedRouteDetailCardUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StepBasedRouteDetailCardUISpecs f8073a;
    public final StepTicketModeBasedInfoUIState b;
    public final ProductBookingBrandingUIState.ImageResourceBrandingUIState c;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public StepBasedRouteDetailCardUIState(StepTicketModeBasedInfoUIState modeBasedInfoUIState, ProductBookingBrandingUIState.ImageResourceBrandingUIState imageResourceBrandingUIState) {
        StepBasedRouteDetailCardUISpecs stepBasedRouteDetailCardUISpecs = new StepBasedRouteDetailCardUISpecs();
        Intrinsics.i(modeBasedInfoUIState, "modeBasedInfoUIState");
        this.f8073a = stepBasedRouteDetailCardUISpecs;
        this.b = modeBasedInfoUIState;
        this.c = imageResourceBrandingUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StepBasedRouteDetailCardUIState)) {
            return false;
        }
        StepBasedRouteDetailCardUIState stepBasedRouteDetailCardUIState = (StepBasedRouteDetailCardUIState) obj;
        return Intrinsics.d(this.f8073a, stepBasedRouteDetailCardUIState.f8073a) && Intrinsics.d(this.b, stepBasedRouteDetailCardUIState.b) && Intrinsics.d(this.c, stepBasedRouteDetailCardUIState.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f8073a.hashCode() * 31)) * 31;
        ProductBookingBrandingUIState.ImageResourceBrandingUIState imageResourceBrandingUIState = this.c;
        return iHashCode + (imageResourceBrandingUIState == null ? 0 : imageResourceBrandingUIState.hashCode());
    }

    public final String toString() {
        return "StepBasedRouteDetailCardUIState(specs=" + this.f8073a + ", modeBasedInfoUIState=" + this.b + ", productBrandingUIState=" + this.c + ")";
    }
}
