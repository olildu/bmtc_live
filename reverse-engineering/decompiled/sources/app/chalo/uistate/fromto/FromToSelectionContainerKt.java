package app.chalo.uistate.fromto;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.components.ChaloRoundedCardKt;
import defpackage.ox;
import defpackage.u50;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FromToSelectionContainerKt {
    public static final void a(Modifier modifier, StopBasedMetroFromToSelectionContainerUIState uiState, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Intrinsics.i(uiState, "uiState");
        Object obj = uiState.f10032a;
        Composer composerStartRestartGroup = composer.startRestartGroup(1174190092);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(uiState) : composerStartRestartGroup.changedInstance(uiState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1174190092, i2, -1, "app.chalo.uistate.fromto.StopBasedMetroStopSelection (FromToSelectionContainer.kt:18)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            StopBasedFromToSelectionContainerUISpec stopBasedFromToSelectionContainerUISpec = (StopBasedFromToSelectionContainerUISpec) obj;
            modifier2 = modifier;
            ChaloRoundedCardKt.a(stopBasedFromToSelectionContainerUISpec.b, modifier2, ComposableLambdaKt.rememberComposableLambda(1913663739, true, new u50(0, stopBasedFromToSelectionContainerUISpec, uiState), composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 << 3) & 112) | 384, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            modifier2 = modifier;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ox(modifier2, uiState, i, 19));
        }
    }
}
