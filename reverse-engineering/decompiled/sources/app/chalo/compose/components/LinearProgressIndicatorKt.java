package app.chalo.compose.components;

import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.components.LinearProgressIndicatorUIState;
import defpackage.df0;
import defpackage.gd0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class LinearProgressIndicatorKt {
    public static final void a(LinearProgressIndicatorUIState state, Modifier modifier, Composer composer, int i) {
        int i2;
        Intrinsics.i(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1711815401);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1711815401, i2, -1, "app.chalo.compose.components.LinearProgressIndicator (LinearProgressIndicator.kt:11)");
            }
            long jC = ChaloColorTokenKt.c(state.b);
            long jC2 = ChaloColorTokenKt.c(state.c);
            float f = state.d;
            boolean z = (i2 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new gd0(state, 6);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ProgressIndicatorKt.m2286LinearProgressIndicatorGJbTh5U((Function0) objRememberedValue, modifier, jC, jC2, 0, f, null, composerStartRestartGroup, i2 & 112, 80);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new df0(state, modifier, i, 0));
        }
    }
}
