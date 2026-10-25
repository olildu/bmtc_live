package app.chalo.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.style.TextAlign;
import app.chalo.compose.components.TextKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.text.HeaderTextUIState;
import defpackage.kb;
import defpackage.lk;
import defpackage.mk;
import defpackage.ze;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloHeaderTextComposableKt {
    public static final void a(Function0 function0, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(935702252);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(935702252, i2, -1, "app.chalo.compose.ChaloCurrentLocationComposable (ChaloHeaderTextComposable.kt:56)");
            }
            ChaloThemeKt.a(null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1948998953, true, new ze(function0, 4), composerStartRestartGroup, 54), composerStartRestartGroup, 1572864);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new kb(i, 6, function0));
        }
    }

    public static final void b(HeaderTextUIState state, Composer composer, int i) {
        int i2;
        Intrinsics.i(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(2120825235);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2120825235, i2, -1, "app.chalo.compose.ChaloHeaderTextComposable (ChaloHeaderTextComposable.kt:27)");
            }
            TextKt.c(state.f10082a, ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloColorTokenKt.c(state.b), null, 2, null), state.c), null, null, composerStartRestartGroup, 0, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new mk(state, i, 0));
        }
    }

    public static final void c(String text, Composer composer, int i, int i2) {
        int i3;
        Composer composer2;
        int i4;
        int i5;
        int iM7173getStarte0LSkKk;
        Intrinsics.i(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(-671533351);
        if ((i2 & 6) == 0) {
            i3 = i2 | (composerStartRestartGroup.changed(text) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= 16;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                i5 = i3 & (-113);
                iM7173getStarte0LSkKk = TextAlign.INSTANCE.m7173getStarte0LSkKk();
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                i5 = i3 & (-113);
                iM7173getStarte0LSkKk = i;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-671533351, i5, -1, "app.chalo.compose.ChaloHeaderTextComposable (ChaloHeaderTextComposable.kt:38)");
            }
            composer2 = composerStartRestartGroup;
            androidx.compose.material3.TextKt.m2623TextNvy7gAk(text, PaddingKt.m785paddingVpY3zN4(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 6).x, null, 2, null), ChaloTheme.b(composerStartRestartGroup, 6).h, ChaloTheme.b(composerStartRestartGroup, 6).f), ChaloTheme.a(composerStartRestartGroup, 6).i, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(iM7173getStarte0LSkKk), 0L, 0, false, 0, 0, null, ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, 6)), composer2, i5 & 14, 0, 130040);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            i4 = iM7173getStarte0LSkKk;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            i4 = i;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new lk(text, i4, i2, 0));
        }
    }
}
