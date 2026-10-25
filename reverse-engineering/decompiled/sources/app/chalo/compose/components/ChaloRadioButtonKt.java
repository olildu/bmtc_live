package app.chalo.compose.components;

import androidx.compose.material3.RadioButtonDefaults;
import androidx.compose.material3.RadioButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.radiobutton.RadioButtonUIState;
import defpackage.ei;
import defpackage.z;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloRadioButtonKt {
    public static final void a(Modifier modifier, RadioButtonUIState uiState, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Composer composer2;
        Modifier modifier3;
        Function0 function0;
        Intrinsics.i(uiState, "uiState");
        ChaloColorToken chaloColorToken = uiState.e;
        Composer composerStartRestartGroup = composer.startRestartGroup(1799330397);
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
            i3 |= composerStartRestartGroup.changed(uiState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1799330397, i3, -1, "app.chalo.compose.components.ChaloRadioButton (ChaloRadioButton.kt:36)");
            }
            boolean z = uiState.f10065a;
            UiEventHandler uiEventHandler = uiState.b;
            if (uiEventHandler == null) {
                composerStartRestartGroup.startReplaceGroup(-1634752308);
                composerStartRestartGroup.endReplaceGroup();
                function0 = null;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1634752307);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(uiEventHandler);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new ei(uiEventHandler, 1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                function0 = (Function0) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
            }
            composer2 = composerStartRestartGroup;
            Modifier modifier5 = modifier4;
            RadioButtonKt.RadioButton(z, function0, modifier5, true, RadioButtonDefaults.INSTANCE.m2303colorsro_MJ88(ChaloColorTokenKt.c(uiState.c), ChaloColorTokenKt.c(uiState.d), ChaloColorTokenKt.c(chaloColorToken), ChaloColorTokenKt.c(chaloColorToken), composer2, RadioButtonDefaults.$stable << 12, 0), null, composer2, (i3 << 6) & 896, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new z(i, i2, 7, modifier3, uiState));
        }
    }
}
