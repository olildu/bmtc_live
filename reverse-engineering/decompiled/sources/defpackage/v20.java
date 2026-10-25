package defpackage;

import androidx.compose.material3.SheetState;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class v20 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19795a;
    public final /* synthetic */ SheetState b;

    public /* synthetic */ v20(SheetState sheetState, int i) {
        this.f19795a = i;
        this.b = sheetState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19795a) {
            case 0:
                return this.b.getCurrentValue();
            case 1:
                return Boolean.valueOf(this.b.isVisible());
            default:
                return this.b.anchoredDraggableMotionSpec;
        }
    }
}
