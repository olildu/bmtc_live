package app.chalo.home.ui.home;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import app.chalo.ads.UnifiedAdHostsKt;
import app.chalo.ads.UnifiedAdSlotSpecs;
import defpackage.g2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class HomeTabUnifiedAdRenderer_androidKt {
    public static final void a(String str, Modifier modifier, Function2 function2, Function1 function1, Function0 function0, Function1 onCrashLoggingRequired, Composer composer, int i) {
        int i2;
        Intrinsics.i(onCrashLoggingRequired, "onCrashLoggingRequired");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1197674405);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onCrashLoggingRequired) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1197674405, i2, -1, "app.chalo.home.ui.home.HomeTabUnifiedAdRenderer (HomeTabUnifiedAdRenderer.android.kt:16)");
            }
            UnifiedAdHostsKt.b(UnifiedAdSlotSpecs.b, str, modifier, function2, function1, function0, onCrashLoggingRequired, composerStartRestartGroup, ((i2 << 3) & 524272) | ((i2 << 6) & 29360128));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new g2((Object) str, modifier, function2, function1, function0, onCrashLoggingRequired, i, 7));
        }
    }
}
