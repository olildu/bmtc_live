package defpackage;

import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class my {
    public static int a(Density density, long j) {
        return Math.round(density.mo403toPxR2X_6o(j));
    }

    public static int b(Density density, float f) {
        float fMo404toPx0680j_4 = density.mo404toPx0680j_4(f);
        if (Float.isInfinite(fMo404toPx0680j_4)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fMo404toPx0680j_4);
    }

    public static float c(Density density, float f) {
        return Dp.m7278constructorimpl(f / density.getDensity());
    }

    public static float d(Density density, int i) {
        return Dp.m7278constructorimpl(i / density.getDensity());
    }

    public static long e(Density density, long j) {
        return j != InlineClassHelperKt.UnspecifiedPackedFloats ? DpKt.m7300DpSizeYgX7TsA(density.mo400toDpu2uoSUM(Float.intBitsToFloat((int) (j >> 32))), density.mo400toDpu2uoSUM(Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)))) : DpSize.INSTANCE.m7385getUnspecifiedMYxV2XQ();
    }

    public static float f(Density density, long j) {
        if (!TextUnitType.m7496equalsimpl0(TextUnit.m7467getTypeUIouoOA(j), TextUnitType.INSTANCE.m7501getSpUIouoOA())) {
            androidx.compose.ui.unit.InlineClassHelperKt.throwIllegalStateException("Only Sp can convert to Px");
        }
        return density.mo404toPx0680j_4(density.mo399toDpGaN1DYA(j));
    }

    public static float g(Density density, float f) {
        return density.getDensity() * f;
    }

    public static Rect h(Density density, DpRect dpRect) {
        return new Rect(density.mo404toPx0680j_4(dpRect.m7361getLeftD9Ej5fM()), density.mo404toPx0680j_4(dpRect.m7363getTopD9Ej5fM()), density.mo404toPx0680j_4(dpRect.m7362getRightD9Ej5fM()), density.mo404toPx0680j_4(dpRect.m7360getBottomD9Ej5fM()));
    }

    public static long i(Density density, long j) {
        if (j == InlineClassHelperKt.UnspecifiedPackedFloats) {
            return Size.INSTANCE.m4442getUnspecifiedNHjbRc();
        }
        float fMo404toPx0680j_4 = density.mo404toPx0680j_4(DpSize.m7376getWidthD9Ej5fM(j));
        float fMo404toPx0680j_5 = density.mo404toPx0680j_4(DpSize.m7374getHeightD9Ej5fM(j));
        return Size.m4425constructorimpl((((long) Float.floatToRawIntBits(fMo404toPx0680j_4)) << 32) | (((long) Float.floatToRawIntBits(fMo404toPx0680j_5)) & BodyPartID.bodyIdMax));
    }

    public static long j(Density density, float f) {
        return density.mo406toSp0xMU5do(density.mo400toDpu2uoSUM(f));
    }

    public static long k(Density density, int i) {
        return density.mo406toSp0xMU5do(density.mo401toDpu2uoSUM(i));
    }
}
