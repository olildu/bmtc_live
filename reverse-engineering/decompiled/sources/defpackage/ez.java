package defpackage;

import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawContextKt;
import androidx.compose.ui.graphics.drawscope.EmptyCanvas;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class ez {
    public static Canvas a(DrawContext drawContext) {
        return EmptyCanvas.INSTANCE;
    }

    public static Density b(DrawContext drawContext) {
        return DrawContextKt.getDefaultDensity();
    }

    public static GraphicsLayer c(DrawContext drawContext) {
        return null;
    }

    public static LayoutDirection d(DrawContext drawContext) {
        return LayoutDirection.Ltr;
    }

    public static void e(DrawContext drawContext, Canvas canvas) {
    }

    public static void f(DrawContext drawContext, Density density) {
    }

    public static void g(DrawContext drawContext, GraphicsLayer graphicsLayer) {
    }

    public static void h(DrawContext drawContext, LayoutDirection layoutDirection) {
    }
}
