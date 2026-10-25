package app.chalo.livetracking.ui.routedetailsscreen.uistatefactory;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/RouteUserDestinationStopUISpecs;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteUserDestinationStopUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f4942a;
    public final ChaloPadding b;

    public RouteUserDestinationStopUISpecs() {
        float f = ChaloThemeHelper.a().f;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        this.f4942a = ChaloColorToken.GreyColor.f9806a;
        this.b = chaloPadding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteUserDestinationStopUISpecs)) {
            return false;
        }
        RouteUserDestinationStopUISpecs routeUserDestinationStopUISpecs = (RouteUserDestinationStopUISpecs) obj;
        return Intrinsics.d(this.f4942a, routeUserDestinationStopUISpecs.f4942a) && Intrinsics.d(this.b, routeUserDestinationStopUISpecs.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4942a.hashCode() * 31);
    }

    public final String toString() {
        return "RouteUserDestinationStopUISpecs(background=" + this.f4942a + ", padding=" + this.b + ")";
    }
}
