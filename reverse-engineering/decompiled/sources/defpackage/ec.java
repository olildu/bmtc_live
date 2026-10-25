package defpackage;

import androidx.compose.material3.BottomSheetScaffoldKt;
import androidx.compose.material3.SheetState;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ec implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15538a;
    public final /* synthetic */ SheetState b;

    public /* synthetic */ ec(SheetState sheetState, int i) {
        this.f15538a = i;
        this.b = sheetState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15538a) {
            case 0:
                return BottomSheetScaffoldKt.verticalScaleDown$lambda$18(this.b, (GraphicsLayerScope) obj);
            default:
                return BottomSheetScaffoldKt.verticalScaleUp$lambda$17(this.b, (GraphicsLayerScope) obj);
        }
    }
}
