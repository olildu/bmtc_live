package app.chalo.ncmc.ui.cardlinking.linking.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import app.chalo.compose.components.ChaloLoadingDialogKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.dialogs.ChaloConfirmationDialogKt;
import app.chalo.compose.components.textfields.ChaloTextFieldKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.ncmc.ui.cardlinking.linking.CardLinkingErrorType;
import app.chalo.ncmc.ui.cardlinking.linking.ChaloCardLinkViewState;
import app.chalo.ncmc.ui.landing.compose.ChaloCardComposablesKt;
import app.chalo.providers.stringprovider.StringEnum;
import defpackage.g0;
import defpackage.ii;
import defpackage.pk0;
import defpackage.s4;
import defpackage.ti;
import defpackage.xi;
import defpackage.xs;
import defpackage.yc;
import defpackage.yi;
import defpackage.zi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloCardLinkCardScreenKt {
    public static final void a(ChaloCardLinkViewState viewState, Function1 function1, SoftwareKeyboardController softwareKeyboardController, Composer composer, int i) {
        int i2;
        int i3;
        FocusManager focusManager;
        int i4;
        int i5;
        int i6;
        Function1 sendIntent = function1;
        Intrinsics.i(viewState, "viewState");
        CardLinkingErrorType cardLinkingErrorType = viewState.e;
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1537633697);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(softwareKeyboardController) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1537633697, i2, -1, "app.chalo.ncmc.ui.cardlinking.linking.compose.ChaloCardLinkCardScreen (ChaloCardLinkCardScreen.kt:47)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(PaddingKt.m784padding3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).h), ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null);
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i7 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM264backgroundbw27NRU$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i7), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloSpacersKt.m(composerStartRestartGroup, 0);
            int i8 = i2;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.CARD_LINKING_TITLE, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).g, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.e(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 131066);
            Composer composer2 = composerStartRestartGroup;
            Object objRememberedValue = composer2.rememberedValue();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objRememberedValue == companion4.getEmpty()) {
                objRememberedValue = xs.f(composer2);
            }
            FocusRequester focusRequester = (FocusRequester) objRememberedValue;
            FocusManager focusManager2 = (FocusManager) composer2.consume(CompositionLocalsKt.getLocalFocusManager());
            ChaloSpacersKt.n(composer2, 0);
            String str = viewState.f6279a;
            int i9 = viewState.i;
            int i10 = i8 & 112;
            boolean z = i10 == 32;
            Object objRememberedValue2 = composer2.rememberedValue();
            if (z || objRememberedValue2 == companion4.getEmpty()) {
                objRememberedValue2 = new g0(sendIntent, 21);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            int i11 = (i8 & 896) | 3072;
            c(str, (Function1) objRememberedValue2, softwareKeyboardController, focusRequester, i9, composer2, i11);
            if (cardLinkingErrorType == CardLinkingErrorType.INVALID_CARD_NUMBER) {
                composer2.startReplaceGroup(-846381211);
                focusManager = focusManager2;
                i4 = i10;
                i3 = -849651463;
                TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.INVALID_CARD_NUMBER, new Object[0], composer2, 6), null, ChaloTheme.a(composer2, 0).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.l(ChaloTheme.e(composer2, 0)), composer2, 0, 0, 131066);
                composer2 = composer2;
            } else {
                i3 = -849651463;
                focusManager = focusManager2;
                i4 = i10;
                composer2.startReplaceGroup(-849651463);
            }
            composer2.endReplaceGroup();
            ChaloSpacersKt.n(composer2, 0);
            String str2 = viewState.b;
            int i12 = i4;
            boolean z2 = i12 == 32;
            Object objRememberedValue3 = composer2.rememberedValue();
            if (z2 || objRememberedValue3 == companion4.getEmpty()) {
                objRememberedValue3 = new g0(sendIntent, 22);
                composer2.updateRememberedValue(objRememberedValue3);
            }
            b(str2, (Function1) objRememberedValue3, softwareKeyboardController, focusRequester, viewState.j, composer2, i11);
            if (cardLinkingErrorType == CardLinkingErrorType.INVALID_LINK_CODE) {
                composer2.startReplaceGroup(-845625183);
                Composer composer3 = composer2;
                i6 = 6;
                i5 = i12;
                TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.INVALID_ACTIVATION_CODE, new Object[0], composer2, 6), null, ChaloTheme.a(composer2, 0).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.l(ChaloTheme.e(composer2, 0)), composer3, 0, 0, 131066);
                composer2 = composer3;
            } else {
                i5 = i12;
                i6 = 6;
                composer2.startReplaceGroup(i3);
            }
            composer2.endReplaceGroup();
            ChaloSpacersKt.n(composer2, 0);
            boolean z3 = viewState.c;
            String strC = StringResourcesHelperKt.c(StringEnum.PROCEED, new Object[0], composer2, i6);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m786paddingVpY3zN4$default(companion, 0.0f, ChaloTheme.b(composer2, 0).h, 1, null), 0.0f, 1, null);
            FocusManager focusManager3 = focusManager;
            boolean zChangedInstance = composer2.changedInstance(focusManager3) | (i5 == 32);
            Object objRememberedValue4 = composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == companion4.getEmpty()) {
                objRememberedValue4 = new ti(1, focusManager3, sendIntent);
                composer2.updateRememberedValue(objRememberedValue4);
            }
            Composer composer4 = composer2;
            ChaloFilledButtonKt.g(modifierFillMaxWidth$default, strC, null, 0L, null, z3, 0.0f, null, 0L, (Function0) objRememberedValue4, composer4, 0, 476);
            composerStartRestartGroup = composer4;
            ChaloSpacersKt.n(composerStartRestartGroup, 0);
            ChaloCardComposablesKt.c(0, composerStartRestartGroup, columnScopeInstance.align(PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).k, 0.0f, 2, null), companion2.getCenterHorizontally()), viewState.h);
            composerStartRestartGroup.endNode();
            if (viewState.d) {
                composerStartRestartGroup.startReplaceGroup(-1816245323);
                ChaloLoadingDialogKt.b(StringResourcesHelperKt.c(StringEnum.PLEASE_WAIT_RUNNING_CASE_WITH_DOTS, new Object[0], composerStartRestartGroup, 6), false, null, composerStartRestartGroup, 0, 6);
                composerStartRestartGroup = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1821328765);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (viewState.f) {
                composerStartRestartGroup.startReplaceGroup(-1816087037);
                String str3 = viewState.g;
                String strC2 = StringResourcesHelperKt.c(StringEnum.OKAY, new Object[0], composerStartRestartGroup, 6);
                boolean z4 = i5 == 32;
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (z4 || objRememberedValue5 == companion4.getEmpty()) {
                    sendIntent = function1;
                    objRememberedValue5 = new ii(sendIntent, 14);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    sendIntent = function1;
                }
                Composer composer5 = composerStartRestartGroup;
                ChaloConfirmationDialogKt.b(null, str3, strC2, (Function0) objRememberedValue5, null, null, null, null, composer5, 0, 241);
                composerStartRestartGroup = composer5;
            } else {
                sendIntent = function1;
                composerStartRestartGroup.startReplaceGroup(-1821328765);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s4(i, 15, viewState, sendIntent, softwareKeyboardController));
        }
    }

    public static final void b(String str, Function1 function1, SoftwareKeyboardController softwareKeyboardController, FocusRequester focusRequester, int i, Composer composer, int i2) {
        int i3;
        Composer composer2;
        int i4;
        int i5;
        Object obj;
        int i6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1221613322);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i7 = 32;
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(softwareKeyboardController) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(focusRequester) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1221613322, i3, -1, "app.chalo.ncmc.ui.cardlinking.linking.compose.ChaloCardLinkCodeTextField (ChaloCardLinkCardScreen.kt:146)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(str, 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default);
                obj = null;
                objRememberedValue = mutableStateMutableStateOf$default;
                i6 = 0;
                i4 = 256;
                i7 = 32;
                i5 = 16384;
            } else {
                i4 = 256;
                i5 = 16384;
                obj = null;
                i6 = 0;
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            TextFieldValue textFieldValue = str.length() == 0 ? new TextFieldValue("", 0L, (TextRange) null, 6, (DefaultConstructorMarker) null) : (TextFieldValue) mutableState.getValue();
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, KeyboardType.INSTANCE.m6975getDecimalPjHm6EE(), ImeAction.INSTANCE.m6921getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 115, (DefaultConstructorMarker) null);
            int i8 = (i3 & 896) == i4 ? 1 : i6;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (i8 != 0 || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new yi(softwareKeyboardController, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            KeyboardActions keyboardActions = new KeyboardActions((Function1) objRememberedValue2, null, null, null, null, null, 62, null);
            Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(PaddingKt.m788paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, obj), 0.0f, ChaloTheme.b(composerStartRestartGroup, i6).i, 0.0f, 0.0f, 13, null), focusRequester);
            TextStyle textStyleF = ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, i6));
            int i9 = (57344 & i3) == i5 ? 1 : i6;
            if ((i3 & 112) == i7) {
                i6 = 1;
            }
            int i10 = i9 | i6;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (i10 != 0 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new yc(i, function1, mutableState, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composer2 = composerStartRestartGroup;
            ChaloTextFieldKt.a(textFieldValue, (Function1) objRememberedValue3, modifierFocusRequester, false, false, textStyleF, ComposableSingletons$ChaloCardLinkCardScreenKt.f6280a, null, null, null, false, null, keyboardOptions, keyboardActions, false, 0, null, null, null, null, composer2, 1572864, 384, 1036184);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new xi(str, function1, softwareKeyboardController, focusRequester, i, i2, 1));
        }
    }

    public static final void c(String str, Function1 function1, SoftwareKeyboardController softwareKeyboardController, FocusRequester focusRequester, int i, Composer composer, int i2) {
        int i3;
        Composer composer2;
        int i4;
        int i5;
        Object obj;
        int i6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-787114444);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i7 = 32;
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(softwareKeyboardController) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(focusRequester) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-787114444, i3, -1, "app.chalo.ncmc.ui.cardlinking.linking.compose.ChaloCardNumberTextField (ChaloCardLinkCardScreen.kt:196)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(str, 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default);
                obj = null;
                objRememberedValue = mutableStateMutableStateOf$default;
                i6 = 0;
                i4 = 256;
                i7 = 32;
                i5 = 16384;
            } else {
                i4 = 256;
                i5 = 16384;
                obj = null;
                i6 = 0;
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            TextFieldValue textFieldValue = str.length() == 0 ? new TextFieldValue("", 0L, (TextRange) null, 6, (DefaultConstructorMarker) null) : (TextFieldValue) mutableState.getValue();
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new zi(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            VisualTransformation visualTransformation = (VisualTransformation) objRememberedValue2;
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, KeyboardType.INSTANCE.m6975getDecimalPjHm6EE(), ImeAction.INSTANCE.m6921getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 115, (DefaultConstructorMarker) null);
            int i8 = (i3 & 896) == i4 ? 1 : i6;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (i8 != 0 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new yi(softwareKeyboardController, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            KeyboardActions keyboardActions = new KeyboardActions((Function1) objRememberedValue3, null, null, null, null, null, 62, null);
            Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(PaddingKt.m788paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, obj), 0.0f, ChaloTheme.b(composerStartRestartGroup, i6).i, 0.0f, 0.0f, 13, null), focusRequester);
            TextStyle textStyleF = ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, i6));
            int i9 = (57344 & i3) == i5 ? 1 : i6;
            if ((i3 & 112) == i7) {
                i6 = 1;
            }
            int i10 = i9 | i6;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (i10 != 0 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new yc(i, function1, mutableState, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composer2 = composerStartRestartGroup;
            ChaloTextFieldKt.a(textFieldValue, (Function1) objRememberedValue4, modifierFocusRequester, false, false, textStyleF, ComposableSingletons$ChaloCardLinkCardScreenKt.b, null, null, null, false, visualTransformation, keyboardOptions, keyboardActions, false, 0, null, null, null, null, composer2, 1572864, 432, 1034136);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new xi(str, function1, softwareKeyboardController, focusRequester, i, i2, 0));
        }
    }
}
