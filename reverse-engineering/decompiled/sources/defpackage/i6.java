package defpackage;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.TopAppBarState;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i6 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15883a;
    public final /* synthetic */ TopAppBarState b;

    public /* synthetic */ i6(TopAppBarState topAppBarState, int i) {
        this.f15883a = i;
        this.b = topAppBarState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15883a) {
            case 0:
                return AppBarKt.adjustHeightOffsetLimit$lambda$38$lambda$37(this.b, (IntSize) obj);
            default:
                return AppBarKt.settleAppBar$lambda$55(this.b, (AnimationScope) obj);
        }
    }
}
