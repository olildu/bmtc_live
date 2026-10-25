package app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet;

import androidx.compose.animation.core.AnimationSpec;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/routedetails/ui/routedetailsbottomsheet/BottomSheetState;", "Lapp/chalo/livetracking/routedetails/ui/routedetailsbottomsheet/SwipeableState;", "Lapp/chalo/livetracking/routedetails/ui/routedetailsbottomsheet/BottomSheetValue;", "Companion", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BottomSheetState extends SwipeableState<BottomSheetValue> {
    public final SwipeableKt$PreUpPostDownNestedScrollConnection$1 q;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/ui/routedetailsbottomsheet/BottomSheetState$Companion;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetState(BottomSheetValue initialValue, AnimationSpec animationSpec, Function1 function1) {
        super(initialValue, animationSpec, function1);
        Intrinsics.i(initialValue, "initialValue");
        Intrinsics.i(animationSpec, "animationSpec");
        this.q = new SwipeableKt$PreUpPostDownNestedScrollConnection$1(this);
    }
}
