package app.chalo.compose.insets;

import android.content.Context;
import android.os.Build;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class NavigationBarInsetsKt {
    public static final float a(boolean z, Composer composer, int i) {
        float fM7278constructorimpl;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-809316250, i, -1, "app.chalo.compose.insets.rememberNavigationBarInset (NavigationBarInsets.kt:27)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        int bottom = WindowInsets_androidKt.getNavigationBars(WindowInsets.INSTANCE, composer, 6).getBottom(density);
        if (bottom <= 0) {
            fM7278constructorimpl = Dp.m7278constructorimpl(0);
        } else if (Build.VERSION.SDK_INT >= 35) {
            fM7278constructorimpl = z ? Dp.m7278constructorimpl(bottom / density.getDensity()) : Dp.m7278constructorimpl(0);
        } else if (z) {
            int identifier = context.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
            Integer numValueOf = Integer.valueOf(identifier);
            Integer numValueOf2 = null;
            if (identifier <= 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                numValueOf2 = Integer.valueOf(context.getResources().getDimensionPixelSize(numValueOf.intValue()));
            }
            if (numValueOf2 != null) {
                bottom = numValueOf2.intValue();
            }
            fM7278constructorimpl = Dp.m7278constructorimpl(bottom / density.getDensity());
        } else {
            fM7278constructorimpl = Dp.m7278constructorimpl(0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return fM7278constructorimpl;
    }
}
