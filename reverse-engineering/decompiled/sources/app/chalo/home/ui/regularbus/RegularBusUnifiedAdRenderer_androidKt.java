package app.chalo.home.ui.regularbus;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import app.chalo.ads.UnifiedAdHostsKt;
import app.chalo.ads.UnifiedAdSlot;
import app.chalo.ads.UnifiedAdSlotSpecKt;
import defpackage.km;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RegularBusUnifiedAdRenderer_androidKt {
    public static final void a(String str, UnifiedAdSlot unifiedAdSlot, Modifier modifier, Function2 function2, Function1 function1, Function0 function0, Function1 onCrashLoggingRequired, Composer composer, int i) {
        int i2;
        Function0 function3;
        Composer composer2;
        Intrinsics.i(onCrashLoggingRequired, "onCrashLoggingRequired");
        Composer composerStartRestartGroup = composer.startRestartGroup(657272911);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(unifiedAdSlot == null ? -1 : unifiedAdSlot.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            function3 = function0;
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 131072 : 65536;
        } else {
            function3 = function0;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onCrashLoggingRequired) ? 1048576 : 524288;
        }
        if (composerStartRestartGroup.shouldExecute((599187 & i2) != 599186, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(657272911, i2, -1, "app.chalo.home.ui.regularbus.RegularBusUnifiedAdRenderer (RegularBusUnifiedAdRenderer.android.kt:18)");
            }
            int i3 = i2 << 3;
            composer2 = composerStartRestartGroup;
            UnifiedAdHostsKt.b(UnifiedAdSlotSpecKt.a(unifiedAdSlot), str, modifier, function2, function1, function3, onCrashLoggingRequired, composer2, (i2 & 458752) | (i3 & 112) | (i2 & 896) | (i2 & 7168) | (57344 & i2) | (i3 & 29360128));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new km(str, unifiedAdSlot, modifier, function2, function1, function0, onCrashLoggingRequired, i));
        }
    }
}
