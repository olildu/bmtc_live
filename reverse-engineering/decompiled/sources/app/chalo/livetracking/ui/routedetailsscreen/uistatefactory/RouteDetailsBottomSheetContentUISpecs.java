package app.chalo.livetracking.ui.routedetailsscreen.uistatefactory;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/RouteDetailsBottomSheetContentUISpecs;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteDetailsBottomSheetContentUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f4918a;

    public RouteDetailsBottomSheetContentUISpecs() {
        float f = ChaloThemeHelper.a().h;
        float f2 = ChaloThemeHelper.a().f;
        this.f4918a = new ChaloPadding(f, f2, f2, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RouteDetailsBottomSheetContentUISpecs) && Intrinsics.d(this.f4918a, ((RouteDetailsBottomSheetContentUISpecs) obj).f4918a);
    }

    public final int hashCode() {
        return this.f4918a.hashCode();
    }

    public final String toString() {
        return "RouteDetailsBottomSheetContentUISpecs(headerPadding=" + this.f4918a + ")";
    }
}
