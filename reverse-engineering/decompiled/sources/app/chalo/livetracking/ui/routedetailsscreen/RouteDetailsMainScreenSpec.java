package app.chalo.livetracking.ui.routedetailsscreen;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteDetailsUIStateFactory$animationEventHandler$2$1;
import defpackage.pk0;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsMainScreenSpec;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteDetailsMainScreenSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f4870a;
    public final ChaloPadding b;
    public final RouteDetailsScreenAnimationEventHandler c;

    public RouteDetailsMainScreenSpec(RouteDetailsUIStateFactory$animationEventHandler$2$1 animationEventHandlers) {
        float f = ChaloThemeHelper.a().f;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        ChaloPadding chaloPadding2 = new ChaloPadding(0.0f, 0.0f, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, 3);
        Intrinsics.i(animationEventHandlers, "animationEventHandlers");
        this.f4870a = chaloPadding;
        this.b = chaloPadding2;
        this.c = animationEventHandlers;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteDetailsMainScreenSpec)) {
            return false;
        }
        RouteDetailsMainScreenSpec routeDetailsMainScreenSpec = (RouteDetailsMainScreenSpec) obj;
        return Intrinsics.d(this.f4870a, routeDetailsMainScreenSpec.f4870a) && Intrinsics.d(this.b, routeDetailsMainScreenSpec.b) && Intrinsics.d(this.c, routeDetailsMainScreenSpec.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + r30.c(this.b, this.f4870a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sbM = pk0.m("RouteDetailsMainScreenSpec(paddingAroundBackButton=", this.f4870a, ", paddingAroundShowMyLocationBtn=", this.b, ", animationEventHandlers=");
        sbM.append(this.c);
        sbM.append(")");
        return sbM.toString();
    }
}
