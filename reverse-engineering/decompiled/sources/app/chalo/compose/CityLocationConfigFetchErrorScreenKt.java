package app.chalo.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.theme.ChaloThemeKt;
import defpackage.ph;
import defpackage.zm;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/unit/Dp;", "heightInDp", "chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CityLocationConfigFetchErrorScreenKt {
    public static final void a(Modifier modifier, String str, boolean z, Function0 onClick, Function0 onLocationItemClick, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        String str2;
        boolean z2;
        Modifier modifier3;
        Intrinsics.i(onClick, "onClick");
        Intrinsics.i(onLocationItemClick, "onLocationItemClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(587825346);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            str2 = str;
            i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onLocationItemClick) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(587825346, i3, -1, "app.chalo.compose.CityLocationConfigFetchErrorScreen (CityLocationConfigFetchErrorScreen.kt:40)");
            }
            ChaloThemeKt.a(null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1017994011, true, new zm(modifier3, str2, z2, onLocationItemClick, onClick), composerStartRestartGroup, 54), composerStartRestartGroup, 1572864);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ph(modifier3, str, z, onClick, onLocationItemClick, i, i2));
        }
    }
}
