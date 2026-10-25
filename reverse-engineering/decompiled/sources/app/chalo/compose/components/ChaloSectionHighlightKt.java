package app.chalo.compose.components;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import defpackage.wd;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloSectionHighlightKt {
    public static final void a(BoxScope ChaloSectionHighlight, float f, Composer composer, int i) {
        int i2;
        Intrinsics.i(ChaloSectionHighlight, "$this$ChaloSectionHighlight");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1578939399);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(ChaloSectionHighlight) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1578939399, i2, -1, "app.chalo.compose.components.ChaloSectionHighlight (ChaloSectionHighlight.kt:10)");
            }
            float fC = ComposeUtils_androidKt.c(composerStartRestartGroup);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            float fMo404toPx0680j_4 = density.mo404toPx0680j_4(fC);
            float fMo404toPx0680j_5 = density.mo404toPx0680j_4(f) / 2.0f;
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierMatchParentSize = ChaloSectionHighlight.matchParentSize(companion);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            float f2 = fMo404toPx0680j_4 * 2.0f;
            ChaloBlurRadialGradientKt.a(ChaloSectionHighlight.align(modifierMatchParentSize, companion2.getCenter()), f2, 0.3f, 0.0f, fMo404toPx0680j_5, null, composerStartRestartGroup, 3456, 32);
            ChaloBlurRadialGradientKt.a(ChaloSectionHighlight.align(ChaloSectionHighlight.matchParentSize(companion), companion2.getCenter()), f2, 0.3f, f2, fMo404toPx0680j_5, null, composerStartRestartGroup, 384, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new wd(ChaloSectionHighlight, f, i, 1));
        }
    }
}
