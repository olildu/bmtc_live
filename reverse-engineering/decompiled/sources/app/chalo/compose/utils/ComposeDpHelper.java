package app.chalo.compose.utils;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/compose/utils/ComposeDpHelper;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ComposeDpHelper {
    public static float a(float f, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-158333080, i, -1, "app.chalo.compose.utils.ComposeDpHelper.toPixel (ComposeDpHelper.kt:21)");
        }
        float fMo404toPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo404toPx0680j_4(f);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return fMo404toPx0680j_4;
    }
}
