package app.chalo.livetracking.ui.routedetailsscreen.uistatefactory;

import androidx.compose.ui.unit.Dp;
import app.chalo.uistate.text.TextUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/RouteNameAndSchemeDetailsUIState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteNameAndSchemeDetailsUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f4933a;
    public final TextUIState b;
    public final RouteNameAndSchemeDetailsUISpecs c;

    public RouteNameAndSchemeDetailsUIState(TextUIState.ChaloTextUIState chaloTextUIState, TextUIState textUIState, RouteNameAndSchemeDetailsUISpecs routeNameAndSchemeDetailsUISpecs) {
        this.f4933a = chaloTextUIState;
        this.b = textUIState;
        this.c = routeNameAndSchemeDetailsUISpecs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteNameAndSchemeDetailsUIState)) {
            return false;
        }
        RouteNameAndSchemeDetailsUIState routeNameAndSchemeDetailsUIState = (RouteNameAndSchemeDetailsUIState) obj;
        return this.f4933a.equals(routeNameAndSchemeDetailsUIState.f4933a) && Intrinsics.d(this.b, routeNameAndSchemeDetailsUIState.b) && this.c.equals(routeNameAndSchemeDetailsUIState.c);
    }

    public final int hashCode() {
        int iHashCode = this.f4933a.hashCode() * 31;
        TextUIState textUIState = this.b;
        return Dp.m7284hashCodeimpl(this.c.f4932a) + ((iHashCode + (textUIState == null ? 0 : textUIState.hashCode())) * 31);
    }

    public final String toString() {
        return "RouteNameAndSchemeDetailsUIState(routeName=" + this.f4933a + ", routeNamingScheme=" + this.b + ", specs=" + this.c + ")";
    }
}
