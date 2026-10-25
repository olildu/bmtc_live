package app.chalo.kyc.min.ui.minkycotp.composables;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.TextKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.components.textfields.BaseChaloTextFieldKt;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.UIShape;
import app.chalo.compose.utils.SafeFocusRequester;
import app.chalo.compose.utils.SafeFocusRequesterKt;
import app.chalo.kyc.min.ui.minkycdetails.composables.MinKycDetailsScreenUIKt;
import app.chalo.kyc.min.ui.minkycotp.MinKycOtpUISpecs;
import app.chalo.kyc.min.ui.minkycotp.MinKycOtpUIState;
import app.chalo.kyc.min.ui.minkycotp.OtpCharUIState;
import app.chalo.kyc.min.ui.minkycotp.OtpStepProgressUISpecs;
import app.chalo.kyc.min.ui.minkycotp.OtpStepProgressUIState;
import app.chalo.kyc.min.ui.minkycotp.OtpTextFieldUISpecs;
import app.chalo.kyc.min.ui.minkycotp.OtpTextFieldUIState;
import app.chalo.kyc.min.ui.minkycotp.OtpUISpecs;
import app.chalo.kyc.min.ui.minkycotp.OtpUIState;
import app.chalo.kyc.min.ui.minkycotp.ProceedBtnUISpecs;
import app.chalo.kyc.min.ui.minkycotp.ProceedBtnUIState;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.UiAlignmentKt;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.textField.BaseTextFieldUIState;
import defpackage.b3;
import defpackage.fc0;
import defpackage.hi;
import defpackage.ir;
import defpackage.la0;
import defpackage.pk0;
import defpackage.r1;
import defpackage.t8;
import defpackage.u50;
import defpackage.ug0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "showCursor", "kyc_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MinKycOtpScreenUIKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(Modifier modifier, OtpCharUIState otpCharUIState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(466224190);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(otpCharUIState) : composerStartRestartGroup.changedInstance(otpCharUIState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(466224190, i2, -1, "app.chalo.kyc.min.ui.minkycotp.composables.BlinkingCursor (MinKycOtpScreenUI.kt:283)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new MinKycOtpScreenUIKt$BlinkingCursor$1$1(mutableState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(Unit.f17538a, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
            AnimatedVisibilityKt.AnimatedVisibility(((Boolean) mutableState.getValue()).booleanValue(), (Modifier) null, EnterExitTransitionKt.fadeIn$default(new TweenSpec(0, 0, null, 6, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(new TweenSpec(0, 0, null, 6, null), 0.0f, 2, null), (String) null, ComposableLambdaKt.rememberComposableLambda(981437542, true, new u50(5, modifier, otpCharUIState), composerStartRestartGroup, 54), composerStartRestartGroup, 200064, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ug0(i, 11, modifier, otpCharUIState));
        }
    }

    public static final void b(SafeFocusRequester safeFocusRequester, OtpTextFieldUIState otpTextFieldUIState, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1041347396);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(safeFocusRequester) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(otpTextFieldUIState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1041347396, i2, -1, "app.chalo.kyc.min.ui.minkycotp.composables.ChaloOtpEnterTextField (MinKycOtpScreenUI.kt:214)");
            }
            OtpTextFieldUISpecs otpTextFieldUISpecs = otpTextFieldUIState.f4167a;
            int i3 = i2;
            BaseTextFieldUIState.TextFieldUIState textFieldUIState = otpTextFieldUIState.b;
            Modifier.Companion companion = Modifier.INSTANCE;
            composer2 = composerStartRestartGroup;
            BaseChaloTextFieldKt.a(textFieldUIState, SafeFocusRequesterKt.a(SizeKt.m816heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, otpTextFieldUIState.b.o, 1, null), safeFocusRequester, composerStartRestartGroup, (i3 << 3) & 112), null, null, ComposableLambdaKt.rememberComposableLambda(1974630543, true, new la0(otpTextFieldUIState, 5), composerStartRestartGroup, 54), null, composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 92);
            TextUIState textUIState = otpTextFieldUIState.d;
            if (textUIState == null) {
                composer2.startReplaceGroup(233663400);
            } else {
                composer2.startReplaceGroup(233663401);
                ChaloSpacersKt.m(composer2, 0);
                TextKt.c(textUIState, SizeKt.fillMaxWidth$default(ChaloThemeKt.c(companion, otpTextFieldUISpecs.b), 0.0f, 1, null), null, null, composer2, 0, 12);
                composer2 = composer2;
            }
            composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ug0(safeFocusRequester, otpTextFieldUIState, i, 10));
        }
    }

    public static final void c(MinKycOtpUIState viewState, SafeFocusRequester safeFocusRequester, Composer composer, int i) {
        int i2;
        Intrinsics.i(viewState, "viewState");
        ProceedBtnUIState proceedBtnUIState = viewState.f;
        OtpUIState otpUIState = viewState.e;
        Intrinsics.i(safeFocusRequester, "safeFocusRequester");
        Composer composerStartRestartGroup = composer.startRestartGroup(1120399589);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(safeFocusRequester) ? 32 : 16;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1120399589, i3, -1, "app.chalo.kyc.min.ui.minkycotp.composables.MinKycOtpScreenUI (MinKycOtpScreenUI.kt:59)");
            }
            MinKycOtpUISpecs minKycOtpUISpecs = viewState.f4159a;
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ChaloColorTokenKt.c(minKycOtpUISpecs.f4158a), null, 2, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ChaloSpacersKt.m(composerStartRestartGroup, 0);
            LoadingDialogUIState loadingDialogUIState = viewState.b;
            if (loadingDialogUIState == null) {
                composerStartRestartGroup.startReplaceGroup(1322542340);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                t8.m(composerStartRestartGroup, 1322542341, loadingDialogUIState, composerStartRestartGroup, 0);
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloToolBarKt.b(viewState.c, null, null, composerStartRestartGroup, 0, 14);
            d(ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloColorTokenKt.c(otpUIState.f4169a.b), null, 2, null), otpUIState.f4169a.f4168a), otpUIState, safeFocusRequester, composerStartRestartGroup, (i3 << 3) & 896);
            composerStartRestartGroup.endNode();
            ProceedBtnUISpecs proceedBtnUISpecs = proceedBtnUIState.f4171a;
            if (b3.s(0, 0, composerStartRestartGroup, AlphaKt.alpha(SizeKt.fillMaxWidth$default(ChaloThemeKt.c(boxScopeInstance.align(companion, UiAlignmentKt.c(proceedBtnUISpecs.f4170a)), proceedBtnUISpecs.b), 0.0f, 1, null), proceedBtnUISpecs.c), proceedBtnUIState.b)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ug0(viewState, safeFocusRequester, i, 9));
        }
    }

    public static final void d(Modifier modifier, OtpUIState otpUIState, SafeFocusRequester safeFocusRequester, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(220422811);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(otpUIState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(safeFocusRequester) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(220422811, i2, -1, "app.chalo.kyc.min.ui.minkycotp.composables.MinKycOtpUI (MinKycOtpScreenUI.kt:102)");
            }
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getCenter(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
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
            OtpUISpecs otpUISpecs = otpUIState.f4169a;
            OtpStepProgressUIState otpStepProgressUIState = otpUIState.b;
            UIShape.Rectangle rectangle = UIShape.f1926a;
            e(otpStepProgressUIState, composerStartRestartGroup, 0);
            ChaloSpacersKt.g(composerStartRestartGroup, 0);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            TextKt.c(otpUIState.c, columnScopeInstance.align(companion2, UiAlignmentKt.a(otpUISpecs.d)), null, null, composerStartRestartGroup, 0, 12);
            ChaloSpacersKt.m(composerStartRestartGroup, 0);
            TextKt.c(otpUIState.d, columnScopeInstance.align(companion2, UiAlignmentKt.a(otpUISpecs.e)), null, null, composerStartRestartGroup, 0, 12);
            ChaloSpacersKt.g(composerStartRestartGroup, 0);
            b(safeFocusRequester, otpUIState.e, composerStartRestartGroup, (i2 >> 6) & 14);
            ChaloSpacersKt.o(composerStartRestartGroup, 0);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), UiAlignmentKt.b(otpUISpecs.f), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion2);
            Function0<ComposeUiNode> constructor2 = companion.getConstructor();
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
            pk0.v(companion, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextKt.c(otpUIState.f, null, null, null, composerStartRestartGroup, 0, 14);
            TextUIState.ChaloTextUIState chaloTextUIState = otpUIState.g;
            if (chaloTextUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-921004798);
            } else {
                composerStartRestartGroup.startReplaceGroup(-921004797);
                ChaloSpacersKt.B(composerStartRestartGroup, 0);
                TextKt.c(chaloTextUIState, null, null, null, composerStartRestartGroup, 0, 14);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (r1.k(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ir(i, 27, modifier, otpUIState, safeFocusRequester));
        }
    }

    public static final void e(OtpStepProgressUIState otpStepProgressUIState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1071677907);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(otpStepProgressUIState) : composerStartRestartGroup.changedInstance(otpStepProgressUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1071677907, i2, -1, "app.chalo.kyc.min.ui.minkycotp.composables.OtpStepProgressIndicator (MinKycOtpScreenUI.kt:149)");
            }
            OtpStepProgressUISpecs otpStepProgressUISpecs = otpStepProgressUIState.f4165a;
            Modifier.Companion companion = Modifier.INSTANCE;
            ChaloPadding chaloPadding = otpStepProgressUISpecs.b;
            float f = otpStepProgressUISpecs.d;
            Modifier modifierC = ChaloThemeKt.c(companion, chaloPadding);
            Alignment.Vertical verticalB = UiAlignmentKt.b(otpStepProgressUISpecs.f4164a);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), verticalB, composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (!(composerStartRestartGroup.getApplier() != null)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Arrangement.Horizontal start = arrangement.getStart();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(start, companion3.getTop(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (!(composerStartRestartGroup.getApplier() != null)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion2, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            CommonImageKt.a(otpStepProgressUIState.b, null, false, composerStartRestartGroup, 0, 6);
            ChaloSpacersKt.w(composerStartRestartGroup, 0);
            TextKt.c(otpStepProgressUIState.c, ChaloThemeKt.c(companion, otpStepProgressUISpecs.c), null, null, composerStartRestartGroup, 0, 12);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            Modifier modifierC2 = ChaloThemeKt.c(rowScopeInstance.align(SizeKt.m814height3ABfNKs(SizeKt.m833width3ABfNKs(companion, f), otpStepProgressUISpecs.e), companion3.getCenterVertically()), otpStepProgressUISpecs.g);
            UIShape.Rectangle rectangle = UIShape.f1926a;
            f(otpStepProgressUIState, modifierC2, f, composerStartRestartGroup, (i2 & 14) | 48);
            MinKycDetailsScreenUIKt.e(otpStepProgressUIState.d, composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fc0(otpStepProgressUIState, i, 23));
        }
    }

    public static final void f(OtpStepProgressUIState viewState, Modifier modifier, float f, Composer composer, int i) {
        int i2;
        Intrinsics.i(viewState, "viewState");
        Composer composerStartRestartGroup = composer.startRestartGroup(416731781);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(viewState) : composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(1.0f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(416731781, i2, -1, "app.chalo.kyc.min.ui.minkycotp.composables.StepProgressBar (MinKycOtpScreenUI.kt:189)");
            }
            OtpStepProgressUISpecs otpStepProgressUISpecs = viewState.f4165a;
            ChaloColorToken chaloColorToken = otpStepProgressUISpecs.i;
            UIShape uIShape = otpStepProgressUISpecs.h;
            Modifier modifierM263backgroundbw27NRU = BackgroundKt.m263backgroundbw27NRU(modifier, ChaloColorTokenKt.c(chaloColorToken), ChaloThemeKt.d(uIShape));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM263backgroundbw27NRU);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() != null)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            BoxKt.Box(BackgroundKt.m263backgroundbw27NRU(SizeKt.m833width3ABfNKs(SizeKt.m814height3ABfNKs(Modifier.INSTANCE, otpStepProgressUISpecs.e), Dp.m7278constructorimpl(1.0f * f)), ChaloColorTokenKt.c(otpStepProgressUISpecs.j), ChaloThemeKt.d(uIShape)), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new hi(viewState, modifier, f, i, 1));
        }
    }
}
