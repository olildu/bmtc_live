package app.chalo.compose.components;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import app.chalo.compose.components.ChaloDividerComposableKt;
import app.chalo.compose.theme.ChaloTheme;
import defpackage.qj;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloDividerComposableKt {
    public static final void a(float f, int i, long j, Composer composer, Modifier modifier) {
        Modifier modifier2;
        int i2;
        long j2;
        Composer composerStartRestartGroup = composer.startRestartGroup(721093542);
        if ((i & 6) == 0) {
            modifier2 = modifier;
            i2 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i2 = i;
        }
        if ((i & 48) == 0) {
            j2 = j;
            i2 |= composerStartRestartGroup.changed(j2) ? 32 : 16;
        } else {
            j2 = j;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(721093542, i2, -1, "app.chalo.compose.components.ChaloDividerComposable (ChaloDividerComposable.kt:30)");
            }
            DividerKt.m1949Divider9IZ8Weo(modifier2, f, j2, composerStartRestartGroup, (i2 & 14) | ((i2 >> 3) & 112) | ((i2 << 3) & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new qj(modifier, j, f, i, 0));
        }
    }

    public static final void b(Modifier modifier, long j, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long j2;
        final Modifier modifier3;
        final long j3;
        Modifier modifier4;
        int i4;
        long j4;
        Composer composerStartRestartGroup = composer.startRestartGroup(195047452);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = i | (composerStartRestartGroup.changed(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            j2 = j;
            i3 |= ((i2 & 2) == 0 && composerStartRestartGroup.changed(j2)) ? 32 : 16;
        } else {
            j2 = j;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                Modifier modifier5 = i5 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    j2 = ChaloTheme.a(composerStartRestartGroup, 6).y;
                    i3 &= -113;
                }
                modifier4 = modifier5;
                i4 = i3;
                j4 = j2;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                i4 = i3;
                j4 = j2;
                modifier4 = modifier2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(195047452, i4, -1, "app.chalo.compose.components.ChaloDividerComposable (ChaloDividerComposable.kt:15)");
            }
            a(ChaloTheme.b(composerStartRestartGroup, 6).b, i4 & 112, j4, composerStartRestartGroup, AlphaKt.alpha(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), 0.12f));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j3 = j4;
            modifier3 = modifier4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            j3 = j2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: pj
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ChaloDividerComposableKt.b(modifier3, j3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    return Unit.f17538a;
                }
            });
        }
    }
}
