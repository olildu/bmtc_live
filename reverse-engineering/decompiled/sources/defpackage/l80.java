package defpackage;

import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.material3.HorizontalCenterOpticallyKt;
import androidx.compose.material3.ShapeWithHorizontalCenterOptically;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l80 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18289a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Shape d;

    public /* synthetic */ l80(float f, float f2, Shape shape, int i) {
        this.f18289a = i;
        this.b = f;
        this.c = f2;
        this.d = shape;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f18289a) {
            case 0:
                return HorizontalCenterOpticallyKt.horizontalCenterOptically_4j6BHR0$lambda$1(this.b, this.c, (CornerBasedShape) this.d, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
            default:
                return HorizontalCenterOpticallyKt.horizontalCenterOptically_4j6BHR0$lambda$3(this.b, this.c, (ShapeWithHorizontalCenterOptically) this.d, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
        }
    }
}
