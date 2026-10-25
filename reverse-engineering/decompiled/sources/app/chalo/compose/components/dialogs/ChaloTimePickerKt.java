package app.chalo.compose.components.dialogs;

import androidx.compose.material3.TimePickerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import defpackage.l9;
import defpackage.lm;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloTimePickerKt {
    public static final void a(Modifier modifier, int i, int i2, Function0 onDismissRequest, Function3 onConfirm, Function0 onCancel, Composer composer, int i3) {
        Modifier modifier2;
        Intrinsics.i(onDismissRequest, "onDismissRequest");
        Intrinsics.i(onConfirm, "onConfirm");
        Intrinsics.i(onCancel, "onCancel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2023152855);
        int i4 = i3 | 6;
        if ((i3 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(false) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onDismissRequest) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onConfirm) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onCancel) ? 1048576 : 524288;
        }
        if (composerStartRestartGroup.shouldExecute((599187 & i4) != 599186, i4 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2023152855, i4, -1, "app.chalo.compose.components.dialogs.ChaloTimePicker (ChaloTimePicker.kt:33)");
            }
            AndroidDialog_androidKt.Dialog(onDismissRequest, null, ComposableLambdaKt.rememberComposableLambda(-1759035598, true, new l9(TimePickerKt.rememberTimePickerState(i, i2, false, composerStartRestartGroup, (i4 >> 3) & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED, 0), companion, onCancel, onConfirm), composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 >> 12) & 14) | 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new lm(modifier2, i, i2, onDismissRequest, onConfirm, onCancel, i3));
        }
    }
}
