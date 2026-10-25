package app.chalo.ncmc.ui.entercarddetails.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.TextWithLeftAndTrailingRightIconComponentKt;
import app.chalo.compose.components.ChaloCircularLoadingBoxKt;
import app.chalo.compose.components.ChaloLoadingDialogKt;
import app.chalo.compose.components.ChaloRoundedBottomSheetKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.GenericErrorScreenComponentKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.ncmc.ui.entercarddetails.EnterCardDetailsViewState;
import app.chalo.ncmc.ui.ncmconlinerecharge.compose.NcmcOnlineRechargeScreenKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.uistate.textwithleftandtrailingrighticon.TextWithLeftAndRightIconUIState;
import defpackage.bp;
import defpackage.d0;
import defpackage.dq;
import defpackage.fk;
import defpackage.g2;
import defpackage.ij;
import defpackage.nu;
import defpackage.p10;
import defpackage.pk0;
import defpackage.q10;
import defpackage.r10;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class EnterCardDetailsScreenKt {
    public static final void a(Modifier modifier, EnterCardDetailsViewState viewState, Function1 sendIntent, SoftwareKeyboardController softwareKeyboardController, FocusRequester enterCardFocusRequester, FocusRequester reEnterCardFocusRequester, Composer composer, int i) {
        int i2;
        Intrinsics.i(modifier, "modifier");
        Intrinsics.i(viewState, "viewState");
        Intrinsics.i(sendIntent, "sendIntent");
        Intrinsics.i(enterCardFocusRequester, "enterCardFocusRequester");
        Intrinsics.i(reEnterCardFocusRequester, "reEnterCardFocusRequester");
        Composer composerStartRestartGroup = composer.startRestartGroup(1031941558);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(viewState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(softwareKeyboardController) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(enterCardFocusRequester) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(reEnterCardFocusRequester) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1031941558, i2, -1, "app.chalo.ncmc.ui.entercarddetails.compose.CardDetailsEnterCardSection (EnterCardDetailsScreen.kt:127)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (viewState.i) {
                composerStartRestartGroup.startReplaceGroup(402787721);
                ChaloCircularLoadingBoxKt.a(null, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (viewState.j) {
                composerStartRestartGroup.startReplaceGroup(402896004);
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                boolean z = (i2 & 896) == 256;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new bp(sendIntent, 25);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                GenericErrorScreenComponentKt.a(modifierFillMaxSize$default, null, false, (Function0) objRememberedValue, composerStartRestartGroup, 6, 6);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(403161178);
                String strC = StringResourcesHelperKt.c(StringEnum.ENTER_CARD_DETAILS_TITLE, new Object[0], composerStartRestartGroup, 6);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                ChaloToolBarKt.g(ChaloToolBarKt.l(companion2, composerStartRestartGroup), strC, 0L, null, composerStartRestartGroup, 0, 12);
                composerStartRestartGroup = composerStartRestartGroup;
                c(PaddingKt.m787paddingqDBjuR0(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).k, ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).i), viewState, sendIntent, softwareKeyboardController, enterCardFocusRequester, reEnterCardFocusRequester, composerStartRestartGroup, i2 & 524272);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new r10(modifier, viewState, sendIntent, softwareKeyboardController, enterCardFocusRequester, reEnterCardFocusRequester, i, 1));
        }
    }

    public static final void b(int i, Composer composer, Modifier modifier, IconType iconType, String instruction) {
        int i2;
        Composer composer2;
        int i3;
        Intrinsics.i(iconType, "iconType");
        Intrinsics.i(instruction, "instruction");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1714861118);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(iconType.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(instruction) ? 256 : 128;
        }
        int i4 = i2;
        if (composerStartRestartGroup.shouldExecute((i4 & 147) != 146, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1714861118, i4, -1, "app.chalo.ncmc.ui.entercarddetails.compose.CardLinkingInstruction (EnterCardDetailsScreen.kt:305)");
            }
            ImageUISize imageUISize = new ImageUISize(Dp.m7276boximpl(ChaloTheme.b(composerStartRestartGroup, 0).n), Dp.m7276boximpl(ChaloTheme.b(composerStartRestartGroup, 0).n));
            float f = ChaloTheme.b(composerStartRestartGroup, 0).h;
            boolean z = ((i4 & 112) == 32) | ((i4 & 896) == 256);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composer2 = composerStartRestartGroup;
                i3 = i4;
                objRememberedValue = new TextWithLeftAndRightIconUIState(new ImageUIState(iconType, (String) null, (ChaloColorToken) null, imageUISize, (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), new TextUIState.ChaloTextUIState(instruction, UITextStyle.BodyMedium, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8188), null, f, null, 16);
                composer2.updateRememberedValue(objRememberedValue);
            } else {
                composer2 = composerStartRestartGroup;
                i3 = i4;
            }
            TextWithLeftAndTrailingRightIconComponentKt.a(modifier, (TextWithLeftAndRightIconUIState) objRememberedValue, composer2, i3 & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new q10(modifier, iconType, instruction, i, 0));
        }
    }

    public static final void c(Modifier modifier, EnterCardDetailsViewState viewState, Function1 function1, SoftwareKeyboardController softwareKeyboardController, FocusRequester enterCardFocusRequester, FocusRequester reEnterCardFocusRequester, Composer composer, int i) {
        int i2;
        Function1 sendIntent = function1;
        Intrinsics.i(modifier, "modifier");
        Intrinsics.i(viewState, "viewState");
        int i3 = viewState.b;
        Intrinsics.i(sendIntent, "sendIntent");
        Intrinsics.i(enterCardFocusRequester, "enterCardFocusRequester");
        Intrinsics.i(reEnterCardFocusRequester, "reEnterCardFocusRequester");
        Composer composerStartRestartGroup = composer.startRestartGroup(1622573903);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(viewState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(softwareKeyboardController) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(enterCardFocusRequester) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(reEnterCardFocusRequester) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1622573903, i2, -1, "app.chalo.ncmc.ui.entercarddetails.compose.EnterCardDetails (EnterCardDetailsScreen.kt:176)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new p10(5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function1 function2 = (Function1) objRememberedValue;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion4 = Modifier.INSTANCE;
            Modifier modifierA = dq.a(columnScopeInstance, SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
            String str = viewState.c;
            String strC = StringResourcesHelperKt.c(StringEnum.HINT_ENTER_CARD_NUMBER, new Object[0], composerStartRestartGroup, 6);
            EnterCardDetailsScreenKt$sam$androidx_compose_ui_text_input_VisualTransformation$0 enterCardDetailsScreenKt$sam$androidx_compose_ui_text_input_VisualTransformation$0 = new EnterCardDetailsScreenKt$sam$androidx_compose_ui_text_input_VisualTransformation$0(function2);
            Integer numValueOf = Integer.valueOf(i3);
            int i6 = i2 & 896;
            boolean z = i6 == 256;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new nu(sendIntent, 3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            int i7 = (i2 << 18) & 1879048192;
            int i8 = i2;
            NcmcOnlineRechargeScreenKt.b(modifierFillMaxWidth$default, str, null, null, strC, false, enterCardDetailsScreenKt$sam$androidx_compose_ui_text_input_VisualTransformation$0, numValueOf, enterCardFocusRequester, softwareKeyboardController, (Function1) objRememberedValue2, composerStartRestartGroup, ((i2 << 12) & 234881024) | 3462 | i7, 0, 32);
            ChaloSpacersKt.p(composerStartRestartGroup, 0);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
            String str2 = viewState.d;
            String str3 = viewState.e;
            String strC2 = StringResourcesHelperKt.c(StringEnum.HINT_RE_ENTER_CARD_NUMBER, new Object[0], composerStartRestartGroup, 6);
            boolean z2 = viewState.g;
            EnterCardDetailsScreenKt$sam$androidx_compose_ui_text_input_VisualTransformation$0 enterCardDetailsScreenKt$sam$androidx_compose_ui_text_input_VisualTransformation$1 = new EnterCardDetailsScreenKt$sam$androidx_compose_ui_text_input_VisualTransformation$0(function2);
            Integer numValueOf2 = Integer.valueOf(i3);
            boolean z3 = i6 == 256;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new nu(function1, 4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            NcmcOnlineRechargeScreenKt.b(modifierFillMaxWidth$default2, str2, str3, null, strC2, z2, enterCardDetailsScreenKt$sam$androidx_compose_ui_text_input_VisualTransformation$1, numValueOf2, reEnterCardFocusRequester, softwareKeyboardController, (Function1) objRememberedValue3, composerStartRestartGroup, ((i8 << 9) & 234881024) | 3078 | i7, 0, 0);
            ChaloSpacersKt.g(composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            String strC3 = StringResourcesHelperKt.c(StringEnum.NEXT, new Object[0], composerStartRestartGroup, 6);
            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
            boolean z4 = viewState.f;
            boolean z5 = i6 == 256;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z5 || objRememberedValue4 == companion.getEmpty()) {
                sendIntent = function1;
                objRememberedValue4 = new bp(sendIntent, 22);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                sendIntent = function1;
            }
            ChaloFilledButtonKt.g(modifierFillMaxWidth$default3, strC3, null, 0L, null, z4, 0.0f, null, 0L, (Function0) objRememberedValue4, composerStartRestartGroup, 6, 476);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new r10(modifier, viewState, sendIntent, softwareKeyboardController, enterCardFocusRequester, reEnterCardFocusRequester, i, 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(EnterCardDetailsViewState viewState, Function1 sendIntent, SoftwareKeyboardController softwareKeyboardController, FocusRequester enteredCardFocusRequester, FocusRequester reEnterCardFocusRequester, SheetState modalBottomSheetState, Composer composer, int i) {
        int i2;
        SheetState sheetState;
        Composer composer2;
        int i3;
        int i4;
        Intrinsics.i(viewState, "viewState");
        boolean z = viewState.l;
        Intrinsics.i(sendIntent, "sendIntent");
        Intrinsics.i(enteredCardFocusRequester, "enteredCardFocusRequester");
        Intrinsics.i(reEnterCardFocusRequester, "reEnterCardFocusRequester");
        Intrinsics.i(modalBottomSheetState, "modalBottomSheetState");
        Composer composerStartRestartGroup = composer.startRestartGroup(1383840776);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(softwareKeyboardController) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(enteredCardFocusRequester) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(reEnterCardFocusRequester) ? 16384 : 8192;
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i2 |= composerStartRestartGroup.changed(modalBottomSheetState) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1383840776, i2, -1, "app.chalo.ncmc.ui.entercarddetails.compose.EnterCardDetailsScreen (EnterCardDetailsScreen.kt:60)");
            }
            if (viewState.h) {
                composerStartRestartGroup.startReplaceGroup(-1390165194);
                i3 = -1393092710;
                ChaloLoadingDialogKt.b(null, false, null, composerStartRestartGroup, 0, 7);
            } else {
                i3 = -1393092710;
                composerStartRestartGroup.startReplaceGroup(-1393092710);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-1390047518);
                boolean z2 = (i2 & 112) == 32;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new bp(sendIntent, 21);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                ChaloRoundedBottomSheetKt.a(modalBottomSheetState, (Function0) objRememberedValue, false, false, false, ComposableLambdaKt.rememberComposableLambda(-1344673728, true, new d0(27, viewState, sendIntent), composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 >> 15) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
                i4 = 1;
            } else {
                i4 = 1;
                composerStartRestartGroup.startReplaceGroup(i3);
                composerStartRestartGroup.endReplaceGroup();
            }
            composer2 = composerStartRestartGroup;
            a(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, i4, null), ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null), viewState, sendIntent, softwareKeyboardController, enteredCardFocusRequester, reEnterCardFocusRequester, composer2, (i2 << 3) & 524272);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zChangedInstance = composer2.changedInstance(viewState);
            if ((i2 & 458752) != 131072) {
                i4 = 0;
            }
            int i5 = (zChangedInstance ? 1 : 0) | i4;
            Object objRememberedValue2 = composer2.rememberedValue();
            if (i5 != 0 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new EnterCardDetailsScreenKt$EnterCardDetailsScreen$3$1(viewState, modalBottomSheetState, null);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            sheetState = modalBottomSheetState;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new g2(viewState, sendIntent, softwareKeyboardController, enteredCardFocusRequester, reEnterCardFocusRequester, sheetState, i));
        }
    }

    public static final void e(Modifier modifier, String cardNumber, Function0 onPositiveButtonClick, Function0 function0, Composer composer, int i) {
        int i2;
        Composer composer2;
        Function0 onNegativeButtonClick = function0;
        Intrinsics.i(cardNumber, "cardNumber");
        Intrinsics.i(onPositiveButtonClick, "onPositiveButtonClick");
        Intrinsics.i(onNegativeButtonClick, "onNegativeButtonClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1626630848);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(cardNumber) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onPositiveButtonClick) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onNegativeButtonClick) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1626630848, i2, -1, "app.chalo.ncmc.ui.entercarddetails.compose.LinkEligibleCardBottomSheet (EnterCardDetailsScreen.kt:252)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i4 = i2;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.AUTO_CARD_LINK_TITLE, new Object[]{cardNumber}, composerStartRestartGroup, 6), null, 0L, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(TextAlign.INSTANCE.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTypographyKt.e(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 130046);
            ChaloSpacersKt.p(composerStartRestartGroup, 0);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            b(54, composerStartRestartGroup, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), IconType.IC_CARD_RECHARGE, StringResourcesHelperKt.c(StringEnum.AUTO_CARD_LINK_MESSAGE_ONE, new Object[0], composerStartRestartGroup, 6));
            ChaloSpacersKt.p(composerStartRestartGroup, 0);
            b(54, composerStartRestartGroup, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), IconType.IC_CARD_INFO, StringResourcesHelperKt.c(StringEnum.AUTO_CARD_LINK_MESSAGE_TWO, new Object[0], composerStartRestartGroup, 6));
            ChaloSpacersKt.p(composerStartRestartGroup, 0);
            String strC = StringResourcesHelperKt.c(StringEnum.YES_LINK_MY_CARD, new Object[0], composerStartRestartGroup, 6);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            boolean z = (i4 & 896) == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new fk(onPositiveButtonClick, 19);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ChaloFilledButtonKt.g(modifierFillMaxWidth$default, strC, null, 0L, null, true, 0.0f, null, 0L, (Function0) objRememberedValue, composerStartRestartGroup, 196614, 476);
            ChaloSpacersKt.o(composerStartRestartGroup, 0);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            String strC2 = StringResourcesHelperKt.c(StringEnum.NO_DONT_LINK_NOW, new Object[0], composerStartRestartGroup, 6);
            boolean z2 = (i4 & 7168) == 2048;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                onNegativeButtonClick = function0;
                objRememberedValue2 = new fk(onNegativeButtonClick, 20);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                onNegativeButtonClick = function0;
            }
            ChaloFilledButtonKt.f(strC2, false, modifierFillMaxWidth$default2, null, null, 0.0f, 0L, (Function0) objRememberedValue2, composerStartRestartGroup, 384, 122);
            composer2 = composerStartRestartGroup;
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ij(modifier, cardNumber, onPositiveButtonClick, onNegativeButtonClick, i, 1));
        }
    }
}
