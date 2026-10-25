package app.chalo.uistate.button;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ButtonUIStateKt {
    public static final ButtonUIState a(ButtonUIState buttonUIState, Composer composer) {
        Intrinsics.i(buttonUIState, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-356735500, 0, -1, "app.chalo.uistate.button.withFontScaleAwareHeight (ButtonUIState.kt:257)");
        }
        float fontScale = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).getFontScale();
        if (fontScale > 1.0f) {
            buttonUIState = ButtonUIState.a(buttonUIState, null, Dp.m7278constructorimpl(buttonUIState.g * fontScale), 191);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonUIState;
    }
}
