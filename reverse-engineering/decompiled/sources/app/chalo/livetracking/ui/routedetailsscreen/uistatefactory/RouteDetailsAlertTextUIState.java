package app.chalo.livetracking.ui.routedetailsscreen.uistatefactory;

import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/RouteDetailsAlertTextUIState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteDetailsAlertTextUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageUIState f4917a;
    public final TextUIState.ChaloTextUIState b;

    public RouteDetailsAlertTextUIState(ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState) {
        this.f4917a = imageUIState;
        this.b = chaloTextUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteDetailsAlertTextUIState)) {
            return false;
        }
        RouteDetailsAlertTextUIState routeDetailsAlertTextUIState = (RouteDetailsAlertTextUIState) obj;
        return this.f4917a.equals(routeDetailsAlertTextUIState.f4917a) && this.b.equals(routeDetailsAlertTextUIState.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4917a.hashCode() * 31);
    }

    public final String toString() {
        return "RouteDetailsAlertTextUIState(img=" + this.f4917a + ", text=" + this.b + ")";
    }
}
