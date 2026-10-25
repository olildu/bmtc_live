package app.chalo.compose.components;

import androidx.compose.material3.ProgressIndicatorDefaults;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.uistate.base.ChaloColorTokenKt;
import defpackage.jj;
import defpackage.z;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloCircularProgressIndicatorKt {
    public static final void a(Modifier modifier, CircularProgressIndicatorUIState state, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        Intrinsics.i(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2134921945);
        int i4 = i2 & 1;
        if (i4 != 0) {
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
            i3 |= composerStartRestartGroup.changed(state) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2134921945, i3, -1, "app.chalo.compose.components.ChaloCircularProgressIndicator (ChaloCircularProgressIndicator.kt:33)");
            }
            ProgressIndicatorKt.m2278CircularProgressIndicator4lLiAd8(modifier4, ChaloColorTokenKt.c(state.f1827a), state.b, 0L, 0, 0.0f, composerStartRestartGroup, i3 & 14, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new z(i, i2, 5, modifier3, state));
        }
    }

    public static final void b(Modifier modifier, float f, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        float fM2274getCircularStrokeWidthD9Ej5fM;
        Modifier modifier3;
        Modifier modifier4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1795221227);
        int i4 = i2 & 1;
        if (i4 != 0) {
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
            if ((i2 & 2) == 0) {
                fM2274getCircularStrokeWidthD9Ej5fM = f;
                int i5 = composerStartRestartGroup.changed(fM2274getCircularStrokeWidthD9Ej5fM) ? 32 : 16;
                i3 |= i5;
            } else {
                fM2274getCircularStrokeWidthD9Ej5fM = f;
            }
            i3 |= i5;
        } else {
            fM2274getCircularStrokeWidthD9Ej5fM = f;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                    fM2274getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2274getCircularStrokeWidthD9Ej5fM();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                modifier4 = modifier2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1795221227, i3, -1, "app.chalo.compose.components.ChaloCircularProgressIndicator (ChaloCircularProgressIndicator.kt:45)");
            }
            ProgressIndicatorKt.m2278CircularProgressIndicator4lLiAd8(modifier4, ChaloTheme.a(composerStartRestartGroup, 6).f1915a, fM2274getCircularStrokeWidthD9Ej5fM, 0L, 0, 0.0f, composerStartRestartGroup, (i3 & 14) | ((i3 << 3) & 896), 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        float f2 = fM2274getCircularStrokeWidthD9Ej5fM;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new jj(modifier3, f2, i, i2, 0));
        }
    }
}
