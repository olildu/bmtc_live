package app.chalo.uistate.dialog;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import app.chalo.uistate.base.ChaloColorTokenKt;
import defpackage.cy;
import defpackage.d0;
import defpackage.na;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DropDownMenuUIStateKt {
    /* JADX WARN: Code duplicated, block: B:37:0x0076  */
    /* JADX WARN: Code duplicated, block: B:38:0x0078  */
    /* JADX WARN: Code duplicated, block: B:41:0x0081 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:43:0x0086  */
    /* JADX WARN: Code duplicated, block: B:46:0x008d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0097  */
    /* JADX WARN: Code duplicated, block: B:50:0x0099  */
    /* JADX WARN: Code duplicated, block: B:53:0x009e  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:67:0x0102  */
    /* JADX WARN: Code duplicated, block: B:69:0x0107  */
    /* JADX WARN: Code duplicated, block: B:72:0x0113  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    public static final void a(boolean z, Function0 toggleState, DropDownMenuUIState state, Modifier modifier, Composer composer, int i, int i2) {
        boolean z2;
        int i3;
        Modifier modifier2;
        boolean z3;
        Composer composer2;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Modifier modifier4;
        boolean z4;
        boolean z5;
        boolean z6;
        Object objRememberedValue;
        Dp dp;
        Modifier modifierM835widthInVpY3zN4$default;
        Intrinsics.i(toggleState, "toggleState");
        Intrinsics.i(state, "state");
        DropDownMenuUISpecs dropDownMenuUISpecs = state.c;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1647071556);
        if ((i & 6) == 0) {
            z2 = z;
            i3 = (composerStartRestartGroup.changed(z2) ? 4 : 2) | i;
        } else {
            z2 = z;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(toggleState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(state) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                if (i4 != 0) {
                    modifier4 = Modifier.INSTANCE;
                } else {
                    modifier4 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1647071556, i3, -1, "app.chalo.uistate.dialog.DropDownMenu (DropDownMenuUIState.kt:54)");
                }
                if ((i3 & 112) == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if ((i3 & 896) == 256) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = z4 | z5;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z6 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new cy(6, toggleState, state);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                dp = dropDownMenuUISpecs.c;
                if (dp != null || (modifierM835widthInVpY3zN4$default = SizeKt.m835widthInVpY3zN4$default(modifier4, dp.m7292unboximpl(), 0.0f, 2, null)) == null) {
                    modifierM835widthInVpY3zN4$default = modifier4;
                }
                Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                AndroidMenu_androidKt.m1619DropdownMenuIlH_yew(z2, function0, modifierM835widthInVpY3zN4$default, 0L, null, null, null, ChaloColorTokenKt.c(dropDownMenuUISpecs.f9994a), 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1251839841, true, new d0(26, state, toggleState), composerStartRestartGroup, 54), composer2, i3 & 14, 48, 1912);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new na(z, toggleState, state, modifier3, i, i2));
            }
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
            if (i4 != 0) {
                modifier4 = Modifier.INSTANCE;
            } else {
                modifier4 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1647071556, i3, -1, "app.chalo.uistate.dialog.DropDownMenu (DropDownMenuUIState.kt:54)");
            }
            if ((i3 & 112) == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            if ((i3 & 896) == 256) {
                z5 = true;
            } else {
                z5 = false;
            }
            z6 = z4 | z5;
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z6) {
                objRememberedValue = new cy(6, toggleState, state);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new cy(6, toggleState, state);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function1 = (Function0) objRememberedValue;
            dp = dropDownMenuUISpecs.c;
            if (dp != null) {
                modifierM835widthInVpY3zN4$default = modifier4;
            } else {
                modifierM835widthInVpY3zN4$default = modifier4;
            }
            Modifier modifier6 = modifier4;
            composer2 = composerStartRestartGroup;
            AndroidMenu_androidKt.m1619DropdownMenuIlH_yew(z2, function1, modifierM835widthInVpY3zN4$default, 0L, null, null, null, ChaloColorTokenKt.c(dropDownMenuUISpecs.f9994a), 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1251839841, true, new d0(26, state, toggleState), composerStartRestartGroup, 54), composer2, i3 & 14, 48, 1912);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier6;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new na(z, toggleState, state, modifier3, i, i2));
        }
    }
}
