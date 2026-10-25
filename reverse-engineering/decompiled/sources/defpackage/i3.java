package defpackage;

import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.material3.ModalWideNavigationRailState;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SwipeToDismissBoxState;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i3 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15877a;
    public final /* synthetic */ Density b;

    public /* synthetic */ i3(Density density, int i) {
        this.f15877a = i;
        this.b = density;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float fAnchoredDraggableFlingBehavior$lambda$0;
        switch (this.f15877a) {
            case 0:
                fAnchoredDraggableFlingBehavior$lambda$0 = AnchoredDraggableKt.anchoredDraggableFlingBehavior$lambda$0(this.b);
                break;
            case 1:
                fAnchoredDraggableFlingBehavior$lambda$0 = this.b.mo404toPx0680j_4(Dp.m7278constructorimpl(100));
                break;
            case 2:
                fAnchoredDraggableFlingBehavior$lambda$0 = ModalWideNavigationRailState.anchoredDraggableState$lambda$2(this.b);
                break;
            case 3:
                fAnchoredDraggableFlingBehavior$lambda$0 = SheetState._init_$lambda$9(this.b);
                break;
            case 4:
                fAnchoredDraggableFlingBehavior$lambda$0 = SheetState._init_$lambda$11(this.b);
                break;
            case 5:
                fAnchoredDraggableFlingBehavior$lambda$0 = SheetState.Companion.Saver$lambda$3(this.b);
                break;
            case 6:
                fAnchoredDraggableFlingBehavior$lambda$0 = SheetState.Companion.Saver$lambda$5(this.b);
                break;
            default:
                fAnchoredDraggableFlingBehavior$lambda$0 = SwipeToDismissBoxState._init_$lambda$2(this.b);
                break;
        }
        return Float.valueOf(fAnchoredDraggableFlingBehavior$lambda$0);
    }
}
