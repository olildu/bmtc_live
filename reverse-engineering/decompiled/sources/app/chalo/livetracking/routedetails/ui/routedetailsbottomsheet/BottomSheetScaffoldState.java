package app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet;

import androidx.compose.material3.SnackbarHostState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/ui/routedetailsbottomsheet/BottomSheetScaffoldState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BottomSheetScaffoldState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BottomSheetState f4447a;
    public final SnackbarHostState b;

    public BottomSheetScaffoldState(DrawerState drawerState, BottomSheetState bottomSheetState, SnackbarHostState snackbarHostState) {
        Intrinsics.i(drawerState, "drawerState");
        Intrinsics.i(bottomSheetState, "bottomSheetState");
        Intrinsics.i(snackbarHostState, "snackbarHostState");
        this.f4447a = bottomSheetState;
        this.b = snackbarHostState;
    }
}
