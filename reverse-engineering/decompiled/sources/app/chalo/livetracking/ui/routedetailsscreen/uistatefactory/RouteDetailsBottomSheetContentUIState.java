package app.chalo.livetracking.ui.routedetailsscreen.uistatefactory;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.divider.DividerUIState;
import defpackage.py;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/RouteDetailsBottomSheetContentUIState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteDetailsBottomSheetContentUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RouteHeaderDetailsUIState f4919a;
    public final RouteStopsListUIState b;
    public final DividerUIState c;
    public final RouteDetailsBottomSheetContentUISpecs d;

    public RouteDetailsBottomSheetContentUIState(RouteHeaderDetailsUIState header, RouteStopsListUIState stopsList) {
        DividerUIState dividerUIState = new DividerUIState(ChaloThemeHelper.a().b, ChaloColorToken.Gray85.f9798a, null, 4);
        RouteDetailsBottomSheetContentUISpecs routeDetailsBottomSheetContentUISpecs = new RouteDetailsBottomSheetContentUISpecs();
        Intrinsics.i(header, "header");
        Intrinsics.i(stopsList, "stopsList");
        this.f4919a = header;
        this.b = stopsList;
        this.c = dividerUIState;
        this.d = routeDetailsBottomSheetContentUISpecs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteDetailsBottomSheetContentUIState)) {
            return false;
        }
        RouteDetailsBottomSheetContentUIState routeDetailsBottomSheetContentUIState = (RouteDetailsBottomSheetContentUIState) obj;
        return Intrinsics.d(this.f4919a, routeDetailsBottomSheetContentUIState.f4919a) && Intrinsics.d(this.b, routeDetailsBottomSheetContentUIState.b) && Intrinsics.d(this.c, routeDetailsBottomSheetContentUIState.c) && Intrinsics.d(this.d, routeDetailsBottomSheetContentUIState.d);
    }

    public final int hashCode() {
        return this.d.f4918a.hashCode() + py.c(this.c, (this.b.hashCode() + (this.f4919a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "RouteDetailsBottomSheetContentUIState(header=" + this.f4919a + ", stopsList=" + this.b + ", dividerInBetween=" + this.c + ", specs=" + this.d + ")";
    }
}
