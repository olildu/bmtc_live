package defpackage;

import androidx.compose.material3.ModalWideNavigationRailState;
import androidx.compose.material3.SwipeToDismissBoxKt;
import androidx.compose.material3.SwipeToDismissBoxState;
import androidx.compose.material3.WideNavigationRailKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wg1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19927a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wg1(SwipeToDismissBoxState swipeToDismissBoxState, boolean z, boolean z2) {
        this.d = swipeToDismissBoxState;
        this.b = z;
        this.c = z2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19927a) {
            case 0:
                return SwipeToDismissBoxKt.SwipeToDismissBox$lambda$11$lambda$10$lambda$9((SwipeToDismissBoxState) this.d, this.b, this.c, (IntSize) obj, (Constraints) obj2);
            default:
                return WideNavigationRailKt.ModalWideNavigationRailContent_pU6N4AM$lambda$23$lambda$22(this.b, this.c, (ModalWideNavigationRailState) this.d, (IntSize) obj, (Constraints) obj2);
        }
    }

    public /* synthetic */ wg1(boolean z, boolean z2, ModalWideNavigationRailState modalWideNavigationRailState) {
        this.b = z;
        this.c = z2;
        this.d = modalWideNavigationRailState;
    }
}
