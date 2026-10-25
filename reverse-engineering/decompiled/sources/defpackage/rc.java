package defpackage;

import androidx.compose.material3.BottomSheetScaffoldKt;
import androidx.compose.material3.HorizontalCenterOpticallyKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.internal.DraggableAnchorsConfig;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rc implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19195a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Object e;

    public /* synthetic */ rc(float f, float f2, float f3, Placeable placeable) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = placeable;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19195a) {
            case 0:
                return BottomSheetScaffoldKt.StandardBottomSheet_w7I5h1o$lambda$13$lambda$12$lambda$11((SheetState) this.e, this.b, this.c, this.d, (DraggableAnchorsConfig) obj);
            default:
                return HorizontalCenterOpticallyKt.horizontalCenterOptically_4j6BHR0$lambda$1$lambda$0(this.b, this.c, this.d, (Placeable) this.e, (Placeable.PlacementScope) obj);
        }
    }

    public /* synthetic */ rc(SheetState sheetState, float f, float f2, float f3) {
        this.e = sheetState;
        this.b = f;
        this.c = f2;
        this.d = f3;
    }
}
