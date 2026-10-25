package app.chalo.compose.components.textfields;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardActionsKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import app.chalo.compose.components.ComposeUtilsKt;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.uistate.textField.BaseTextFieldUIState;
import app.chalo.uistate.textField.TextFieldEventHandler;
import app.chalo.uistate.textField.TextFieldLabelPlaceholderUIState;
import app.chalo.uistate.textField.UIImeActionHandler;
import app.chalo.uistate.textField.UIKeyboardOption;
import defpackage.ch;
import defpackage.cm;
import defpackage.h0;
import defpackage.qp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ClickableChaloTextFieldKt {
    public static final void a(BaseTextFieldUIState.ClickableTextFieldUIState state, Modifier modifier, MutableInteractionSource mutableInteractionSource, Function2 function2, Function3 function3, Composer composer, int i) {
        int i2;
        MutableInteractionSource mutableInteractionSource2;
        Function3 function4;
        Composer composer2;
        KeyboardActions KeyboardActions;
        UIImeActionHandler uIImeActionHandler;
        Intrinsics.i(state, "state");
        UIKeyboardOption uIKeyboardOption = state.h;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1382614158);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            mutableInteractionSource2 = mutableInteractionSource;
            i2 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 256 : 128;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(null) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            function4 = function3;
            i2 |= composerStartRestartGroup.changedInstance(function4) ? 131072 : 65536;
        } else {
            function4 = function3;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1382614158, i2, -1, "app.chalo.compose.components.textfields.ClickableChaloTextField (ClickableChaloTextField.kt:24)");
            }
            TextFieldValue textFieldValue = new TextFieldValue(state.f10098a, 0L, (TextRange) null, 6, (DefaultConstructorMarker) null);
            Modifier modifierB = ComposeUtilsKt.b(SizeKt.m816heightInVpY3zN4$default(modifier, state.n, 0.0f, 2, null), state.b, composerStartRestartGroup, 0, 6);
            TextStyle textStyleF = ChaloThemeKt.f(state.c, composerStartRestartGroup, 0);
            boolean z = state.g;
            TextFieldEventHandler b = state.getB();
            Intrinsics.i(b, "<this>");
            cm cmVar = new cm(b);
            KeyboardOptions keyboardOptionsF = uIKeyboardOption != null ? ChaloTextFieldKt.f(uIKeyboardOption) : KeyboardOptions.INSTANCE.getDefault();
            if (uIKeyboardOption == null || (uIImeActionHandler = uIKeyboardOption.c) == null || (KeyboardActions = KeyboardActionsKt.KeyboardActions(new ch(uIImeActionHandler, 16))) == null) {
                KeyboardActions = KeyboardActions.INSTANCE.getDefault();
            }
            KeyboardActions keyboardActions = KeyboardActions;
            boolean z2 = state.i;
            int i3 = state.j;
            RoundedCornerShape roundedCornerShapeD = ChaloThemeKt.d(state.l);
            TextFieldColors textFieldColorsG = ChaloTextFieldKt.g(state.m, composerStartRestartGroup);
            TextFieldLabelPlaceholderUIState textFieldLabelPlaceholderUIState = state.d;
            ComposableLambda composableLambdaD = textFieldLabelPlaceholderUIState != null ? ChaloTextFieldKt.d(textFieldLabelPlaceholderUIState) : null;
            TextFieldLabelPlaceholderUIState textFieldLabelPlaceholderUIState2 = state.e;
            ComposableLambda composableLambdaE = textFieldLabelPlaceholderUIState2 != null ? ChaloTextFieldKt.e(textFieldLabelPlaceholderUIState2) : null;
            boolean z3 = (i2 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new qp(state, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            int i4 = i2 << 15;
            composer2 = composerStartRestartGroup;
            ChaloTextFieldKt.a(textFieldValue, function1, modifierB, false, false, textStyleF, composableLambdaD, composableLambdaE, null, function2, z, cmVar, keyboardOptionsF, keyboardActions, z2, i3, mutableInteractionSource2, roundedCornerShapeD, textFieldColorsG, function4, composer2, (i4 & 234881024) | 3072 | (i4 & 1879048192), (i2 << 12) & 1882718208, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h0((Object) state, modifier, (Object) mutableInteractionSource, (Object) function2, (Object) function3, i, 11));
        }
    }
}
