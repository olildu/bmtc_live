package app.chalo.premiumbus.ui.stopdetails;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import app.chalo.compose.components.RippleEffectKt;
import app.chalo.compose.components.textfields.ChaloTextFieldKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import defpackage.do0;
import defpackage.g2;
import defpackage.ll;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PBStopSelectionFieldKt {
    public static final void a(Modifier modifier, String str, TextStyle textStyle, String labelText, TextStyle textStyle2, Function0 onClick, Composer composer, int i) {
        int i2;
        Composer composer2;
        TextStyle textStyle3;
        TextStyle textStyle4;
        int i3;
        TextStyle textStyleF;
        TextStyle textStyleL;
        Intrinsics.i(labelText, "labelText");
        Intrinsics.i(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1980358114);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(labelText) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClick) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                i3 = i2 & (-58241);
                textStyleF = ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, 0));
                textStyleL = ChaloTypographyKt.l(ChaloTheme.e(composerStartRestartGroup, 0));
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                textStyleL = textStyle2;
                i3 = i2 & (-58241);
                textStyleF = textStyle;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1980358114, i3, -1, "app.chalo.premiumbus.ui.stopdetails.PBStopSelectionField (PBStopSelectionField.kt:27)");
            }
            boolean z = (i3 & 112) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                TextFieldValue textFieldValue = new TextFieldValue(str, 0L, (TextRange) null, 6, (DefaultConstructorMarker) null);
                composerStartRestartGroup.updateRememberedValue(textFieldValue);
                objRememberedValue = textFieldValue;
            }
            TextFieldValue textFieldValue2 = (TextFieldValue) objRememberedValue;
            TextStyle textStyle5 = textStyleL;
            Modifier modifierM295clickableO2vRcR0$default = ClickableKt.m295clickableO2vRcR0$default(modifier, RippleEffectKt.b(composerStartRestartGroup), RippleEffectKt.a(composerStartRestartGroup), false, null, null, onClick, 28, null);
            TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
            long j = ChaloTheme.a(composerStartRestartGroup, 0).e;
            long j2 = ChaloTheme.a(composerStartRestartGroup, 0).e;
            Color.Companion companion = Color.INSTANCE;
            long jM4640getTransparent0d7_KjU = companion.m4640getTransparent0d7_KjU();
            long jM4640getTransparent0d7_KjU2 = companion.m4640getTransparent0d7_KjU();
            TextFieldColors textFieldColorsC = ChaloTextFieldKt.c(textFieldDefaults, j, j2, ChaloTheme.a(composerStartRestartGroup, 0).g, jM4640getTransparent0d7_KjU, jM4640getTransparent0d7_KjU2, 0L, 0L, 0L, 0L, 0L, ChaloTheme.a(composerStartRestartGroup, 0).m, ChaloTheme.a(composerStartRestartGroup, 0).m, ChaloTheme.a(composerStartRestartGroup, 0).m, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 221190, 2089952);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new do0(7);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composer2 = composerStartRestartGroup;
            TextStyle textStyle6 = textStyleF;
            ChaloTextFieldKt.a(textFieldValue2, (Function1) objRememberedValue2, modifierM295clickableO2vRcR0$default, false, true, textStyle6, ComposableLambdaKt.rememberComposableLambda(-255218205, true, new ll(labelText, textStyle5, 1), composerStartRestartGroup, 54), null, null, null, false, null, null, null, false, 0, null, null, textFieldColorsC, null, composer2, 1600560, 0, 786304);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            textStyle4 = textStyle5;
            textStyle3 = textStyle6;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            textStyle3 = textStyle;
            textStyle4 = textStyle2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new g2(modifier, (Object) str, (Object) textStyle3, (Object) labelText, (Object) textStyle4, (Object) onClick, i, 9));
        }
    }
}
