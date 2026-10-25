package defpackage;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ln implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18328a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ long d;

    public /* synthetic */ ln(float f, float f2, long j, int i) {
        this.f18328a = i;
        this.b = f;
        this.c = f2;
        this.d = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f18328a;
        Unit unit = Unit.f17538a;
        float f = this.c;
        float f2 = this.b;
        switch (i) {
            case 0:
                DrawScope Canvas = (DrawScope) obj;
                Intrinsics.i(Canvas, "$this$Canvas");
                Path Path = AndroidPath_androidKt.Path();
                float f3 = 2;
                int iIntBitsToFloat = (int) (Float.intBitsToFloat((int) (Canvas.mo5073getSizeNHjbRc() >> 32)) / (Canvas.mo404toPx0680j_4(f2) * f3));
                float fMo404toPx0680j_4 = Canvas.mo404toPx0680j_4(f2);
                float fMo404toPx0680j_5 = Canvas.mo404toPx0680j_4(f);
                int i2 = iIntBitsToFloat + 1;
                for (int i3 = 0; i3 < i2; i3++) {
                    float f4 = (i3 * 2 * fMo404toPx0680j_4) + 0.0f;
                    Path.moveTo(f4, 0.0f);
                    Path.lineTo(f4 + fMo404toPx0680j_4, 0.0f + fMo404toPx0680j_5);
                    Path.lineTo((f3 * fMo404toPx0680j_4) + f4, 0.0f);
                }
                DrawScope.CC.I(Canvas, Path, this.d, 0.0f, null, null, 0, 60, null);
                break;
            case 1:
                DrawScope drawBehind = (DrawScope) obj;
                Intrinsics.i(drawBehind, "$this$drawBehind");
                float fMo404toPx0680j_6 = drawBehind.mo404toPx0680j_4(f2);
                float f5 = fMo404toPx0680j_6 * 2;
                float fMo404toPx0680j_7 = drawBehind.mo404toPx0680j_4(f) + f5;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (drawBehind.mo5073getSizeNHjbRc() & BodyPartID.bodyIdMax)) - fMo404toPx0680j_6;
                DrawScope.CC.E(drawBehind, this.d, Offset.m4357constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat)) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(0.0f)) << 32)), Offset.m4357constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.mo5073getSizeNHjbRc() >> 32)))) << 32) | (BodyPartID.bodyIdMax & ((long) Float.floatToRawIntBits(fIntBitsToFloat)))), f5, StrokeCap.INSTANCE.m4957getRoundKaPHkGw(), PathEffect.INSTANCE.dashPathEffect(new float[]{0.0f, fMo404toPx0680j_7}, 0.0f), 0.0f, null, 0, 448, null);
                break;
            default:
                DrawScope drawBehind2 = (DrawScope) obj;
                Intrinsics.i(drawBehind2, "$this$drawBehind");
                if (f2 > 0.0f) {
                    Path Path2 = AndroidPath_androidKt.Path();
                    long jM4357constructorimpl = Offset.m4357constructorimpl((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & BodyPartID.bodyIdMax));
                    int i4 = (int) (jM4357constructorimpl >> 32);
                    float fIntBitsToFloat2 = Float.intBitsToFloat(i4);
                    int i5 = (int) (jM4357constructorimpl & BodyPartID.bodyIdMax);
                    Path2.moveTo(fIntBitsToFloat2, Float.intBitsToFloat(i5));
                    Path2.lineTo(Float.intBitsToFloat(i4) - f, Float.intBitsToFloat(i5));
                    float f6 = 2.0f * f;
                    Path2.cubicTo(Float.intBitsToFloat(i4), Float.intBitsToFloat(i5) - f6, Float.intBitsToFloat(i4), Float.intBitsToFloat(i5), Float.intBitsToFloat(i4) + f6, Float.intBitsToFloat(i5) + f);
                    DrawScope.CC.I(drawBehind2, Path2, this.d, 0.0f, null, null, 0, 60, null);
                    Path2.close();
                }
                break;
        }
        return unit;
    }

    public /* synthetic */ ln(float f, long j, float f2) {
        this.f18328a = 2;
        this.b = f;
        this.d = j;
        this.c = f2;
    }
}
