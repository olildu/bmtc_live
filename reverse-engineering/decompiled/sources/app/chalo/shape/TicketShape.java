package app.chalo.shape;

import androidx.compose.foundation.shape.CornerSize;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.aq0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/shape/TicketShape;", "Landroidx/compose/ui/graphics/Shape;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TicketShape implements Shape {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9396a;
    public final float b;
    public final CornerSize c;

    public TicketShape(float f, float f2, float f3) {
        this.f9396a = f;
        this.b = f2;
        this.c = CornerSizeKt.m1066CornerSize0680j_4(f3);
    }

    @Override // androidx.compose.ui.graphics.Shape
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public final Outline mo320createOutlinePq9zytI(long j, LayoutDirection layoutDirection, Density density) {
        Intrinsics.i(layoutDirection, "layoutDirection");
        Intrinsics.i(density, "density");
        Rect rectM4455toRectuvyYCjk = SizeKt.m4455toRectuvyYCjk(j);
        float fMo1065toPxTmRCtEA = this.c.mo1065toPxTmRCtEA(j, density);
        RoundRect roundRectM4420RoundRectsniSvfs = RoundRectKt.m4420RoundRectsniSvfs(rectM4455toRectuvyYCjk, CornerRadius.m4319constructorimpl((((long) Float.floatToRawIntBits(fMo1065toPxTmRCtEA)) << 32) | (((long) Float.floatToRawIntBits(fMo1065toPxTmRCtEA)) & BodyPartID.bodyIdMax)));
        Path Path = AndroidPath_androidKt.Path();
        aq0.B(Path, roundRectM4420RoundRectsniSvfs, null, 2, null);
        Path.Companion companion = Path.INSTANCE;
        int iM4889getIntersectb3I0S0c = PathOperation.INSTANCE.m4889getIntersectb3I0S0c();
        int i = (int) (j >> 32);
        Float.intBitsToFloat(i);
        int i2 = (int) (j & BodyPartID.bodyIdMax);
        Float.intBitsToFloat(i2);
        float fMo404toPx0680j_4 = density.mo404toPx0680j_4(this.b);
        float fMo404toPx0680j_5 = density.mo404toPx0680j_4(this.f9396a);
        float fIntBitsToFloat = (Float.intBitsToFloat(i2) - fMo404toPx0680j_4) - (2 * fMo404toPx0680j_5);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2) - fMo404toPx0680j_4;
        System.out.println((Object) ("offsetTopY = " + fIntBitsToFloat + ", offsetBottomY = " + fIntBitsToFloat2));
        Path Path2 = AndroidPath_androidKt.Path();
        Path2.reset();
        Path2.lineTo(0.0f, 0.0f);
        Path2.lineTo(Float.intBitsToFloat(i), 0.0f);
        Path2.lineTo(Float.intBitsToFloat(i), fIntBitsToFloat);
        Path2.arcTo(new Rect(Float.intBitsToFloat(i) - fMo404toPx0680j_5, fIntBitsToFloat, Float.intBitsToFloat(i) + fMo404toPx0680j_5, fIntBitsToFloat2), -90.0f, -180.0f, false);
        Path2.lineTo(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        Path2.lineTo(0.0f, Float.intBitsToFloat(i2));
        Path2.lineTo(0.0f, fIntBitsToFloat2);
        Path2.arcTo(new Rect(0.0f - fMo404toPx0680j_5, fIntBitsToFloat, fMo404toPx0680j_5 + 0.0f, fIntBitsToFloat2), 90.0f, -180.0f, false);
        Path2.lineTo(0.0f, 0.0f);
        return new Outline.Generic(companion.m4867combinexh6zSI8(iM4889getIntersectb3I0S0c, Path, Path2));
    }
}
