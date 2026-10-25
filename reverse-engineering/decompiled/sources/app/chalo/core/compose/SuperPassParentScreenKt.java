package app.chalo.core.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import app.chalo.core.navigation.superpass.SuperPassParentComponent;
import defpackage.fb1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SuperPassParentScreenKt {
    public static final void a(SuperPassParentComponent superPassParentComponent, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1329882728);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(superPassParentComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1329882728, i2, -1, "app.chalo.core.compose.SuperPassParentScreen (SuperPassParentScreen.kt:15)");
            }
            DecomposeParentScreenKt.a(superPassParentComponent, ComposableSingletons$SuperPassParentScreenKt.f2035a, composerStartRestartGroup, (i2 & 14) | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fb1(superPassParentComponent, i, 17));
        }
    }
}
