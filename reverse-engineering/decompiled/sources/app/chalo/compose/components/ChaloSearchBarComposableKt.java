package app.chalo.compose.components;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.components.textfields.ChaloTextFieldKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import defpackage.ja;
import defpackage.kl;
import defpackage.lh;
import defpackage.ll;
import defpackage.ml;
import defpackage.ti;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloSearchBarComposableKt {
    public static final void a(Modifier modifier, TextFieldValue textFieldState, boolean z, String placeHolderString, Function1 onValueChange, Function0 onClearIconClick, Function0 onNavigationBtnClick, Composer composer, int i) {
        Modifier modifier2;
        int i2;
        Intrinsics.i(textFieldState, "textFieldState");
        Intrinsics.i(placeHolderString, "placeHolderString");
        Intrinsics.i(onValueChange, "onValueChange");
        Intrinsics.i(onClearIconClick, "onClearIconClick");
        Intrinsics.i(onNavigationBtnClick, "onNavigationBtnClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1807979933);
        if ((i & 6) == 0) {
            modifier2 = modifier;
            i2 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(textFieldState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(placeHolderString) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onValueChange) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClearIconClick) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onNavigationBtnClick) ? 1048576 : 524288;
        }
        if (composerStartRestartGroup.shouldExecute((599187 & i2) != 599186, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1807979933, i2, -1, "app.chalo.compose.components.ChaloSearchBarComposable (ChaloSearchBarComposable.kt:42)");
            }
            Modifier modifierM814height3ABfNKs = SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 6).o);
            CardDefaults cardDefaults = CardDefaults.INSTANCE;
            long j = ChaloTheme.a(composerStartRestartGroup, 6).t;
            int i3 = CardDefaults.$stable;
            CardColors cardColorsM1694cardColorsro_MJ88 = cardDefaults.m1694cardColorsro_MJ88(j, 0L, 0L, 0L, composerStartRestartGroup, i3 << 12, 14);
            CardElevation cardElevationM1695cardElevationaqJV_2Y = cardDefaults.m1695cardElevationaqJV_2Y(ChaloTheme.c(composerStartRestartGroup, 6).d, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, i3 << 18, 62);
            composerStartRestartGroup = composerStartRestartGroup;
            CardKt.Card(modifierM814height3ABfNKs, ChaloTheme.d(composerStartRestartGroup, 6).f1919a, cardColorsM1694cardColorsro_MJ88, cardElevationM1695cardElevationaqJV_2Y, null, ComposableLambdaKt.rememberComposableLambda(1488601067, true, new kl(onNavigationBtnClick, modifier2, placeHolderString, textFieldState, onValueChange, z, onClearIconClick), composerStartRestartGroup, 54), composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ja(modifier, textFieldState, z, placeHolderString, onValueChange, onClearIconClick, onNavigationBtnClick, i));
        }
    }

    public static final void b(boolean z, TextFieldValue textFieldState, Function1 onValueChange, Function0 onClearIconClick, Composer composer, int i) {
        int i2;
        Intrinsics.i(textFieldState, "textFieldState");
        Intrinsics.i(onValueChange, "onValueChange");
        Intrinsics.i(onClearIconClick, "onClearIconClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2028355660);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(textFieldState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onValueChange) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClearIconClick) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2028355660, i2, -1, "app.chalo.compose.components.SearchBarTrailingIcon (ChaloSearchBarComposable.kt:130)");
            }
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-848387775);
                ChaloCircularProgressIndicatorKt.b(SizeKt.m828size3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 6).i), ChaloTheme.b(composerStartRestartGroup, 6).c, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (textFieldState.getText().length() > 0) {
                    composerStartRestartGroup.startReplaceGroup(-848168760);
                    boolean z2 = ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new ti(onValueChange, onClearIconClick, 6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, null, ComposableSingletons$ChaloSearchBarComposableKt.f1833a, composerStartRestartGroup, 1572864, 62);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-853346194);
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new lh(z, textFieldState, onValueChange, onClearIconClick, i));
        }
    }

    public static final void c(Modifier modifier, String placeHolderString, TextStyle textStyle, TextFieldValue value, Function1 onValueChange, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, TextFieldColors textFieldColors, Function2 function2, Composer composer, int i, int i2) {
        int i3;
        TextStyle textStyle2;
        TextFieldColors textFieldColors2;
        Composer composer2;
        KeyboardActions keyboardActions2;
        TextStyle textStyle3;
        TextFieldColors textFieldColors3;
        Composer composer3;
        int i4;
        boolean z;
        TextFieldColors textFieldColorsM2603colors0hiis_0;
        TextFieldColors textFieldColors4;
        TextStyle textStyle4;
        int i5;
        KeyboardActions keyboardActions3;
        Intrinsics.i(modifier, "modifier");
        Intrinsics.i(placeHolderString, "placeHolderString");
        Intrinsics.i(value, "value");
        Intrinsics.i(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1778160934);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(placeHolderString) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                textStyle2 = textStyle;
                int i6 = composerStartRestartGroup.changed(textStyle2) ? 256 : 128;
                i3 |= i6;
            } else {
                textStyle2 = textStyle;
            }
            i3 |= i6;
        } else {
            textStyle2 = textStyle;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(value) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onValueChange) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(keyboardOptions) ? 131072 : 65536;
        }
        int i7 = i3 | 1572864;
        if ((i & 12582912) == 0) {
            if ((i2 & 128) == 0) {
                textFieldColors2 = textFieldColors;
                int i8 = composerStartRestartGroup.changed(textFieldColors2) ? 8388608 : 4194304;
                i7 |= i8;
            } else {
                textFieldColors2 = textFieldColors;
            }
            i7 |= i8;
        } else {
            textFieldColors2 = textFieldColors;
        }
        int i9 = i7 | 100663296;
        if ((805306368 & i) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(function2) ? 536870912 : 268435456;
        }
        if (composerStartRestartGroup.shouldExecute((306783379 & i9) != 306783378, i9 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 4) != 0) {
                    textStyle2 = (TextStyle) composerStartRestartGroup.consume(androidx.compose.material3.TextKt.getLocalTextStyle());
                    i9 &= -897;
                }
                int i10 = i9;
                TextStyle textStyle5 = textStyle2;
                KeyboardActions keyboardActions4 = KeyboardActions.INSTANCE.getDefault();
                if ((i2 & 128) != 0) {
                    i4 = 6;
                    z = true;
                    textFieldColorsM2603colors0hiis_0 = TextFieldDefaults.INSTANCE.m2603colors0hiis_0(0L, 0L, 0L, 0L, ChaloTheme.a(composerStartRestartGroup, 6).t, ChaloTheme.a(composerStartRestartGroup, 6).t, ChaloTheme.a(composerStartRestartGroup, 6).t, ChaloTheme.a(composerStartRestartGroup, 6).t, ChaloTheme.a(composerStartRestartGroup, 6).f1915a, 0L, null, ChaloTheme.a(composerStartRestartGroup, 6).t, ChaloTheme.a(composerStartRestartGroup, 6).t, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, 3072, 2147477007, 4095);
                    composer3 = composerStartRestartGroup;
                    i10 &= -29360129;
                } else {
                    composer3 = composerStartRestartGroup;
                    i4 = 6;
                    z = true;
                    textFieldColorsM2603colors0hiis_0 = textFieldColors2;
                }
                textFieldColors4 = textFieldColorsM2603colors0hiis_0;
                textStyle4 = textStyle5;
                i5 = i10;
                keyboardActions3 = keyboardActions4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i9 &= -897;
                }
                if ((i2 & 128) != 0) {
                    i9 &= -29360129;
                }
                int i11 = i9;
                composer3 = composerStartRestartGroup;
                textStyle4 = textStyle2;
                i5 = i11;
                keyboardActions3 = keyboardActions;
                textFieldColors4 = textFieldColors2;
                i4 = 6;
                z = true;
            }
            composer3.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1778160934, i5, -1, "app.chalo.compose.components.TextFieldWithClearButton (ChaloSearchBarComposable.kt:102)");
            }
            int i12 = i5 >> 9;
            composer2 = composer3;
            TextStyle textStyle6 = textStyle4;
            ChaloTextFieldKt.a(value, onValueChange, modifier, false, false, ChaloTypographyKt.b(ChaloTheme.e(composer3, i4)), null, ComposableLambdaKt.rememberComposableLambda(-1584708072, z, new ll(placeHolderString, textStyle4, 0), composer3, 54), null, function2, false, null, keyboardOptions, keyboardActions3, true, 0, null, null, textFieldColors4, null, composer2, (i12 & 14) | 12582912 | (i12 & 112) | ((i5 << 6) & 896) | (i5 & 234881024) | (1879048192 & i5), (i12 & 7168) | (i12 & 896) | 24576 | ((i5 << 3) & 234881024), 756824);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            keyboardActions2 = keyboardActions3;
            textFieldColors3 = textFieldColors4;
            textStyle3 = textStyle6;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            keyboardActions2 = keyboardActions;
            textStyle3 = textStyle2;
            textFieldColors3 = textFieldColors2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ml(modifier, placeHolderString, textStyle3, value, onValueChange, keyboardOptions, keyboardActions2, textFieldColors3, function2, i, i2));
        }
    }
}
