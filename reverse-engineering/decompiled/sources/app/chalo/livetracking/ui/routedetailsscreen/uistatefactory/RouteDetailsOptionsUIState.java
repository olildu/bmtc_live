package app.chalo.livetracking.ui.routedetailsscreen.uistatefactory;

import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.dialog.DropDownMenuUIState;
import app.chalo.uistate.image.ImageUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/RouteDetailsOptionsUIState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteDetailsOptionsUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageUIState f4920a;
    public final UiEventHandler b;
    public final DropDownMenuUIState c;

    public RouteDetailsOptionsUIState(ImageUIState dropDownIcon, UiEventHandler iconClick, DropDownMenuUIState dropDownMenuUIState) {
        Intrinsics.i(dropDownIcon, "dropDownIcon");
        Intrinsics.i(iconClick, "iconClick");
        this.f4920a = dropDownIcon;
        this.b = iconClick;
        this.c = dropDownMenuUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteDetailsOptionsUIState)) {
            return false;
        }
        RouteDetailsOptionsUIState routeDetailsOptionsUIState = (RouteDetailsOptionsUIState) obj;
        return Intrinsics.d(this.f4920a, routeDetailsOptionsUIState.f4920a) && Intrinsics.d(this.b, routeDetailsOptionsUIState.b) && Intrinsics.d(this.c, routeDetailsOptionsUIState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f4920a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "RouteDetailsOptionsUIState(dropDownIcon=" + this.f4920a + ", iconClick=" + this.b + ", dropDownMenu=" + this.c + ")";
    }
}
