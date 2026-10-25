package app.chalo.compose.components;

import androidx.compose.material3.CheckboxColors;
import androidx.compose.material3.CheckboxDefaults;
import androidx.compose.material3.CheckboxKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.checkbox.ChaloCheckBoxUIState;
import app.chalo.uistate.checkbox.CheckBoxUISpecs;
import defpackage.ch;
import defpackage.fj;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloCheckBoxKt {
    public static final void a(ChaloCheckBoxUIState state, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.i(state, "state");
        CheckBoxUISpecs checkBoxUISpecs = state.f9927a;
        Composer composerStartRestartGroup = composer.startRestartGroup(999190748);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(state) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(999190748, i3, -1, "app.chalo.compose.components.ChaloCheckBox (ChaloCheckBox.kt:16)");
            }
            Modifier modifierC = ChaloThemeKt.c(companion, checkBoxUISpecs.f9928a);
            boolean z = state.b;
            modifier = companion;
            CheckboxColors checkboxColorsM1714colors5tl4gsc = CheckboxDefaults.INSTANCE.m1714colors5tl4gsc(ChaloColorTokenKt.c(checkBoxUISpecs.b), ChaloColorTokenKt.c(checkBoxUISpecs.c), ChaloColorTokenKt.c(checkBoxUISpecs.d), 0L, 0L, 0L, composerStartRestartGroup, CheckboxDefaults.$stable << 18, 56);
            boolean z2 = (i3 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ch(state, 12);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            CheckboxKt.Checkbox(z, (Function1) objRememberedValue, modifierC, false, checkboxColorsM1714colors5tl4gsc, null, composerStartRestartGroup, 0, 40);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fj(state, modifier2, false, i, 3));
        }
    }
}
