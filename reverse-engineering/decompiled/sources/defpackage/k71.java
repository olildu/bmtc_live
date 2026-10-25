package defpackage;

import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.shadow.DropShadowPainter;
import androidx.compose.ui.graphics.shadow.InnerShadowPainter;
import androidx.compose.ui.graphics.shadow.Shadow;
import androidx.compose.ui.graphics.shadow.ShadowContext;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class k71 {
    public static DropShadowPainter b(ShadowContext shadowContext, Shape shape, Shadow shadow) {
        return new DropShadowPainter(shape, shadow);
    }

    public static InnerShadowPainter c(ShadowContext shadowContext, Shape shape, Shadow shadow) {
        return new InnerShadowPainter(shape, shadow);
    }

    public static void a(ShadowContext shadowContext) {
    }
}
