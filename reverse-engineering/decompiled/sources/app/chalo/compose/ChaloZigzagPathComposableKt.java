package app.chalo.compose;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import app.chalo.compose.theme.ChaloTheme;
import defpackage.ln;
import defpackage.mn;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloZigzagPathComposableKt {
    public static final void a(Modifier modifier, long j, float f, float f2, float f3, Composer composer, int i, int i2) {
        int i3;
        long j2;
        float f4;
        float f5;
        float f6;
        long j3;
        float f7;
        float f8;
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1216166682);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= 16;
        }
        if ((i & 384) == 0) {
            i3 |= 128;
        }
        if ((i & 3072) == 0) {
            i3 |= 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    modifier = Modifier.INSTANCE;
                }
                j3 = ChaloTheme.a(composerStartRestartGroup, 6).t;
                f4 = ChaloTheme.b(composerStartRestartGroup, 6).c;
                f7 = ChaloTheme.b(composerStartRestartGroup, 6).g;
                f8 = ChaloTheme.b(composerStartRestartGroup, 6).g;
                i4 = i3 & (-65521);
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                j3 = j;
                f4 = f;
                f7 = f2;
                i4 = i3 & (-65521);
                f8 = f3;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1216166682, i4, -1, "app.chalo.compose.ChaloZigzagPathComposable (ChaloZigzagPathComposable.kt:19)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m814height3ABfNKs(modifier, f4), 0.0f, 1, null);
            boolean zChanged = composerStartRestartGroup.changed(f7) | composerStartRestartGroup.changed(f8) | composerStartRestartGroup.changed(j3);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ln(f7, f8, j3, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            CanvasKt.Canvas(modifierFillMaxWidth$default, (Function1) objRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f6 = f8;
            j2 = j3;
            f5 = f7;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            j2 = j;
            f4 = f;
            f5 = f2;
            f6 = f3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new mn(modifier, j2, f4, f5, f6, i, i2));
        }
    }
}
