package app.chalo.compose.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.style.TextAlign;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import defpackage.md;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloChipKt {
    public static final void a(Modifier modifier, boolean z, Composer composer, int i) {
        Composer composer2;
        Modifier modifier2;
        long j;
        long j2;
        Composer composerStartRestartGroup = composer.startRestartGroup(343489910);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed("Mon") ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(343489910, i2, -1, "app.chalo.compose.components.ChaloChip (ChaloChip.kt:19)");
            }
            Shape shape = ChaloTheme.d(composerStartRestartGroup, 6).c;
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-618668924);
                j = ChaloTheme.a(composerStartRestartGroup, 6).y0;
            } else {
                composerStartRestartGroup.startReplaceGroup(-618667749);
                j = ChaloTheme.a(composerStartRestartGroup, 6).t;
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM263backgroundbw27NRU = BackgroundKt.m263backgroundbw27NRU(companion, j, shape);
            float f = ChaloTheme.b(composerStartRestartGroup, 6).b;
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-618663235);
                j2 = ChaloTheme.a(composerStartRestartGroup, 6).B;
            } else {
                composerStartRestartGroup.startReplaceGroup(-618662273);
                j2 = ChaloTheme.a(composerStartRestartGroup, 6).m0;
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            modifier2 = companion;
            androidx.compose.material3.TextKt.m2623TextNvy7gAk("Mon", PaddingKt.m785paddingVpY3zN4(BorderKt.border(modifierM263backgroundbw27NRU, BorderStrokeKt.m290BorderStrokecXLIe8U(f, j2), ChaloTheme.d(composerStartRestartGroup, 6).c), ChaloTheme.b(composerStartRestartGroup, 6).h, ChaloTheme.b(composerStartRestartGroup, 6).f), 0L, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(TextAlign.INSTANCE.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTypographyKt.h(ChaloTheme.e(composerStartRestartGroup, 6)), composer2, (i2 >> 3) & 14, 0, 130044);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new md(i, z, 1, modifier2));
        }
    }
}
