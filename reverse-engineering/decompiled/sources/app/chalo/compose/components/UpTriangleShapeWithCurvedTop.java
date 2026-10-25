package app.chalo.compose.components;

import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/compose/components/UpTriangleShapeWithCurvedTop;", "Landroidx/compose/ui/graphics/Shape;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UpTriangleShapeWithCurvedTop implements Shape {
    @Override // androidx.compose.ui.graphics.Shape
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public final Outline mo320createOutlinePq9zytI(long j, LayoutDirection layoutDirection, Density density) {
        Intrinsics.i(layoutDirection, "layoutDirection");
        Intrinsics.i(density, "density");
        Path Path = AndroidPath_androidKt.Path();
        int i = (int) (BodyPartID.bodyIdMax & j);
        Path.moveTo(0.0f, Float.intBitsToFloat(i));
        int i2 = (int) (j >> 32);
        Path.cubicTo(Float.intBitsToFloat(i2) / 2.0f, 0.0f, Float.intBitsToFloat(i2) / 2.0f, 0.0f, Float.intBitsToFloat(i2), Float.intBitsToFloat(i));
        return new Outline.Generic(Path);
    }
}
