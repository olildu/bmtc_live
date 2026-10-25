package defpackage;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class hz {
    public static long a(DrawTransform drawTransform) {
        float f = 2;
        return Offset.m4357constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawTransform.mo5085getSizeNHjbRc() >> 32)) / f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawTransform.mo5085getSizeNHjbRc() & BodyPartID.bodyIdMax)) / f)) & BodyPartID.bodyIdMax));
    }

    public static /* synthetic */ void c(DrawTransform drawTransform, Path path, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i2 & 2) != 0) {
            i = ClipOp.INSTANCE.m4594getIntersectrtfAjoo();
        }
        drawTransform.mo5082clipPathmtrdDE(path, i);
    }

    public static /* synthetic */ void d(DrawTransform drawTransform, float f, float f2, float f3, float f4, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
        }
        if ((i2 & 1) != 0) {
            f = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f3 = Float.intBitsToFloat((int) (drawTransform.mo5085getSizeNHjbRc() >> 32));
        }
        if ((i2 & 8) != 0) {
            f4 = Float.intBitsToFloat((int) (drawTransform.mo5085getSizeNHjbRc() & BodyPartID.bodyIdMax));
        }
        if ((i2 & 16) != 0) {
            i = ClipOp.INSTANCE.m4594getIntersectrtfAjoo();
        }
        drawTransform.mo5083clipRectN_I0leg(f, f2, f3, f4, i);
    }

    public static /* synthetic */ void e(DrawTransform drawTransform, float f, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rotate-Uv8p0NA");
        }
        if ((i & 2) != 0) {
            j = drawTransform.mo5084getCenterF1C5BW0();
        }
        drawTransform.mo5086rotateUv8p0NA(f, j);
    }

    public static /* synthetic */ void f(DrawTransform drawTransform, float f, float f2, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale-0AR0LA0");
        }
        if ((i & 4) != 0) {
            j = drawTransform.mo5084getCenterF1C5BW0();
        }
        drawTransform.mo5087scale0AR0LA0(f, f2, j);
    }

    public static /* synthetic */ void g(DrawTransform drawTransform, float f, float f2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: translate");
        }
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        drawTransform.translate(f, f2);
    }
}
