package app.chalo.home.ui.common;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.home.domain.UpdateDebugBuildEnvironmentUseCase;
import defpackage.l9;
import defpackage.s4;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChangeEnvironmentDialogKt {
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object, kotlin.Lazy] */
    public static final void a(Function0 function0, ChaloBuildConfig chaloBuildConfig, UpdateDebugBuildEnvironmentUseCase updateDebugBuildEnvironmentUseCase, Composer composer, int i) {
        int i2;
        ChaloBuildConfig chaloBuildConfig2;
        Composer composerStartRestartGroup = composer.startRestartGroup(791538599);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                chaloBuildConfig = (ChaloBuildConfig) ChangeEnvironmentDialogHelper.f3375a.getValue();
                updateDebugBuildEnvironmentUseCase = (UpdateDebugBuildEnvironmentUseCase) ChangeEnvironmentDialogHelper.b.getValue();
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            int i3 = i2 & (-1009);
            ChaloBuildConfig chaloBuildConfig3 = chaloBuildConfig;
            UpdateDebugBuildEnvironmentUseCase updateDebugBuildEnvironmentUseCase2 = updateDebugBuildEnvironmentUseCase;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(791538599, i3, -1, "app.chalo.home.ui.common.ChangeEnvironmentDialog (ChangeEnvironmentDialog.kt:33)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.f17583a, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            AndroidDialog_androidKt.Dialog(function0, null, ComposableLambdaKt.rememberComposableLambda(805642238, true, new l9(chaloBuildConfig3, (CoroutineScope) objRememberedValue, updateDebugBuildEnvironmentUseCase2, function0, 3), composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            chaloBuildConfig2 = chaloBuildConfig3;
            updateDebugBuildEnvironmentUseCase = updateDebugBuildEnvironmentUseCase2;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            chaloBuildConfig2 = chaloBuildConfig;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s4(i, 23, function0, chaloBuildConfig2, updateDebugBuildEnvironmentUseCase));
        }
    }
}
