package defpackage;

import androidx.compose.material3.BottomSheetScaffoldKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.carousel.CarouselKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mc implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18386a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mc(float f, int i, Object obj) {
        this.f18386a = i;
        this.c = obj;
        this.b = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18386a) {
            case 0:
                return BottomSheetScaffoldKt.StandardBottomSheet_w7I5h1o$lambda$13$lambda$12((SheetState) this.c, this.b, (IntSize) obj, (Constraints) obj2);
            case 1:
                return CarouselKt.HorizontalUncontainedCarousel_VUP9l70$lambda$7$lambda$6((Density) this.c, this.b, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
            default:
                MutableState mutableState = (MutableState) this.c;
                Dp dp = (Dp) obj2;
                if (Dp.m7283equalsimpl0(((Dp) mutableState.getValue()).m7292unboximpl(), Dp.m7278constructorimpl(0))) {
                    mutableState.setValue(Dp.m7276boximpl(Dp.m7278constructorimpl(Math.min(dp.m7292unboximpl(), Dp.m7278constructorimpl(this.b / 4)))));
                }
                return Unit.f17538a;
        }
    }

    public /* synthetic */ mc(float f, MutableState mutableState) {
        this.f18386a = 2;
        this.b = f;
        this.c = mutableState;
    }
}
