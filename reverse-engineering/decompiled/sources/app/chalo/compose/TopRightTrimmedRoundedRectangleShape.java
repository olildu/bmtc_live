package app.chalo.compose;

import androidx.compose.ui.geometry.Rect;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/compose/TopRightTrimmedRoundedRectangleShape;", "Landroidx/compose/ui/graphics/Shape;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TopRightTrimmedRoundedRectangleShape implements Shape {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1815a;
    public final boolean b;
    public final float c;
    public final float d;

    public TopRightTrimmedRoundedRectangleShape(float f, float f2, boolean z, boolean z2) {
        this.f1815a = z;
        this.b = z2;
        this.c = f;
        this.d = f2;
    }

    @Override // androidx.compose.ui.graphics.Shape
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public final Outline mo320createOutlinePq9zytI(long j, LayoutDirection layoutDirection, Density density) {
        float f;
        float f2;
        Intrinsics.i(layoutDirection, "layoutDirection");
        Intrinsics.i(density, "density");
        float fMo404toPx0680j_4 = density.mo404toPx0680j_4(density.mo400toDpu2uoSUM(Float.intBitsToFloat((int) (j >> 32))));
        float fMo404toPx0680j_5 = density.mo404toPx0680j_4(density.mo400toDpu2uoSUM(Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax))));
        boolean z = this.f1815a;
        if (z) {
            f2 = fMo404toPx0680j_4 - this.c;
            f = this.d;
        } else {
            f = fMo404toPx0680j_5;
            f2 = fMo404toPx0680j_4;
        }
        Path Path = AndroidPath_androidKt.Path();
        Path.moveTo(0.0f, 0.0f);
        if (z) {
            Path.lineTo(f2 - 24.0f, 0.0f);
            float f3 = 2 * 24.0f;
            Path.arcTo(new Rect(f2 - f3, 0.0f, f2, f3), 270.0f, 90.0f, false);
            Path.lineTo(f2, f - 24.0f);
            Path.arcTo(new Rect(f2, f - f3, f3 + f2, f), 180.0f, -90.0f, false);
            Path.lineTo(fMo404toPx0680j_4 - 24.0f, f);
            float f4 = fMo404toPx0680j_4 - f3;
            Path.arcTo(new Rect(f4, f, fMo404toPx0680j_4, f3 + f), 270.0f, 90.0f, false);
            Path.lineTo(fMo404toPx0680j_4, fMo404toPx0680j_5 - 24.0f);
            Path.arcTo(new Rect(f4, fMo404toPx0680j_5 - f3, fMo404toPx0680j_4, fMo404toPx0680j_5), 0.0f, 90.0f, false);
        } else {
            Path.lineTo(f2, 0.0f);
            Path.lineTo(fMo404toPx0680j_4, fMo404toPx0680j_5);
        }
        if (this.b) {
            Path.lineTo(0.0f, fMo404toPx0680j_5);
        } else {
            Path.lineTo(24.0f, fMo404toPx0680j_5);
            float f5 = 2 * 24.0f;
            Path.arcTo(new Rect(0.0f, fMo404toPx0680j_5 - f5, f5, fMo404toPx0680j_5), 90.0f, 90.0f, false);
            Path.lineTo(0.0f, 0.0f);
            Path.close();
        }
        return new Outline.Generic(Path);
    }
}
