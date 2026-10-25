package defpackage;

import androidx.compose.material3.carousel.KeylineList;
import androidx.compose.material3.carousel.KeylineListScope;
import androidx.compose.material3.carousel.StrategyKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bm implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11210a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bm(float f, MutableState mutableState, int i) {
        this.f11210a = i;
        this.b = f;
        this.c = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f11210a) {
            case 0:
                List list = (List) this.c;
                DrawScope Canvas = (DrawScope) obj;
                Intrinsics.i(Canvas, "$this$Canvas");
                float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo5073getSizeNHjbRc() & BodyPartID.bodyIdMax)) / 2;
                DrawScope.CC.D(Canvas, Brush.Companion.m4558horizontalGradient8A3gB4$default(Brush.INSTANCE, list, 0.0f, Float.intBitsToFloat((int) (Canvas.mo5073getSizeNHjbRc() >> 32)), 0, 8, (Object) null), Offset.m4357constructorimpl((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & BodyPartID.bodyIdMax)), Offset.m4357constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo5073getSizeNHjbRc() >> 32)))) << 32) | (BodyPartID.bodyIdMax & ((long) Float.floatToRawIntBits(fIntBitsToFloat)))), this.b, 0, null, 0.0f, null, 0, 496, null);
                return Unit.f17538a;
            case 1:
                MutableFloatState mutableFloatState = (MutableFloatState) this.c;
                LayoutCoordinates it = (LayoutCoordinates) obj;
                Intrinsics.i(it, "it");
                mutableFloatState.setFloatValue(Dp.m7277compareTo0680j_4(Dp.m7278constructorimpl(Float.intBitsToFloat((int) (LayoutCoordinatesKt.positionInRoot(it) & BodyPartID.bodyIdMax))), Dp.m7278constructorimpl(this.b / ((float) 2))) < 0 ? 1.0f : 0.0f);
                return Unit.f17538a;
            case 2:
                ((MutableState) this.c).setValue(Dp.m7276boximpl(((Dp) ComparisonsKt.d((Dp) obj, Dp.m7276boximpl(this.b))).m7292unboximpl()));
                return Unit.f17538a;
            default:
                return StrategyKt.createShiftedKeylineListForContentPadding$lambda$2((KeylineList) this.c, this.b, (KeylineListScope) obj);
        }
    }

    public /* synthetic */ bm(List list, float f, int i) {
        this.f11210a = i;
        this.c = list;
        this.b = f;
    }
}
