package app.chalo.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import app.chalo.compose.components.dialogs.ChaloConfirmationDialogKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.providers.stringprovider.StringEnum;
import defpackage.wm0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PermissionsRationaleDialogKt {
    public static final void a(String text, Function0 settingsClicked, Function0 cancelClicked, Composer composer, int i) {
        int i2;
        Intrinsics.i(text, "text");
        Intrinsics.i(settingsClicked, "settingsClicked");
        Intrinsics.i(cancelClicked, "cancelClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(265601167);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(settingsClicked) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(cancelClicked) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(265601167, i2, -1, "app.chalo.compose.PermissionsRationaleDialog (PermissionsRationaleDialog.kt:12)");
            }
            ChaloConfirmationDialogKt.b(null, text, StringResourcesHelperKt.c(StringEnum.SETTINGS, new Object[0], composerStartRestartGroup, 6), settingsClicked, StringResourcesHelperKt.c(StringEnum.CANCEL, new Object[0], composerStartRestartGroup, 6), cancelClicked, null, cancelClicked, composerStartRestartGroup, ((i2 << 3) & 112) | ((i2 << 6) & 7168) | ((i2 << 9) & 458752) | ((i2 << 15) & 29360128), 65);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new wm0(i, 12, text, settingsClicked, cancelClicked));
        }
    }
}
