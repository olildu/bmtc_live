package app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/livetracking/routedetails/ui/routedetailsbottomsheet/DrawerState;", "", "Companion", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DrawerState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SwipeableState f4451a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/ui/routedetailsbottomsheet/DrawerState$Companion;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public DrawerState(DrawerValue initialValue, Function1 function1) {
        Intrinsics.i(initialValue, "initialValue");
        this.f4451a = new SwipeableState(initialValue, DrawerKt.f4449a, function1);
    }
}
