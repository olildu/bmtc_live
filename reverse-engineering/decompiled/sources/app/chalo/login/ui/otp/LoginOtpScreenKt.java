package app.chalo.login.ui.otp;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.DividerKt;
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
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.TextFieldValue;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.textfields.ChaloTextFieldKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.textField.BaseTextFieldUIState;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import defpackage.fc0;
import defpackage.ir;
import defpackage.la0;
import defpackage.pk0;
import defpackage.qj;
import defpackage.t8;
import defpackage.v60;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0004²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"Lapp/chalo/login/ui/otp/LoginOtpEnterUIState;", "viewState", "", "showCursor", "login_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class LoginOtpScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final float f, int i, final long j, Composer composer, final Modifier modifier) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1326239194);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1326239194, i2, -1, "app.chalo.login.ui.otp.BlinkingCursor (LoginOtpScreen.kt:241)");
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
                objRememberedValue2 = new LoginOtpScreenKt$BlinkingCursor$1$1(mutableState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(Unit.f17538a, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
            AnimatedVisibilityKt.AnimatedVisibility(((Boolean) mutableState.getValue()).booleanValue(), (Modifier) null, EnterExitTransitionKt.fadeIn$default(new TweenSpec(0, 0, null, 6, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(new TweenSpec(0, 0, null, 6, null), 0.0f, 2, null), (String) null, ComposableLambdaKt.rememberComposableLambda(-543934210, true, new Function3() { // from class: bg0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    Intrinsics.i(AnimatedVisibility, "$this$AnimatedVisibility");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-543934210, iIntValue, -1, "app.chalo.login.ui.otp.BlinkingCursor.<anonymous> (LoginOtpScreen.kt:258)");
                    }
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifier);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer2);
                    pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
                    Modifier modifierA = dq.a(ColumnScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null);
                    long j2 = j;
                    Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(modifierA, j2, null, 2, null);
                    float f2 = f;
                    DividerKt.m1951VerticalDivider9IZ8Weo(SizeKt.m833width3ABfNKs(modifierM264backgroundbw27NRU$default, f2), f2, j2, composer2, 0, 0);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    return Unit.f17538a;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 200064, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new qj(modifier, j, f, i, 1));
        }
    }

    public static final void b(LoginOtpEnterTextFieldUIState loginOtpEnterTextFieldUIState, TextUIState.ChaloTextUIState chaloTextUIState, FocusRequester focusRequester, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2092706770);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(loginOtpEnterTextFieldUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(chaloTextUIState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(focusRequester) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2092706770, i2, -1, "app.chalo.login.ui.otp.ChaloOtpEnterTextField (LoginOtpScreen.kt:160)");
            }
            BaseTextFieldUIState.TextFieldUIState textFieldUIState = loginOtpEnterTextFieldUIState.f5344a;
            boolean zChanged = composerStartRestartGroup.changed(textFieldUIState.f10099a);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                String str = textFieldUIState.f10099a;
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(str, TextRangeKt.TextRange(str.length()), (TextRange) null, 4, (DefaultConstructorMarker) null), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            TextFieldValue textFieldValue = textFieldUIState.f10099a.length() == 0 ? new TextFieldValue("", 0L, (TextRange) null, 6, (DefaultConstructorMarker) null) : (TextFieldValue) ((MutableState) objRememberedValue).getValue();
            BaseTextFieldUIState.TextFieldUIState textFieldUIState2 = loginOtpEnterTextFieldUIState.f5344a;
            Modifier.Companion companion = Modifier.INSTANCE;
            ChaloTextFieldKt.b(textFieldUIState2, textFieldValue, FocusRequesterModifierKt.focusRequester(SizeKt.m816heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, textFieldUIState.o, 1, null), focusRequester), null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(141114272, true, new la0(loginOtpEnterTextFieldUIState, 2), composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 248);
            if (chaloTextUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-1915163415);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1915163414);
                ChaloSpacersKt.m(composerStartRestartGroup, 0);
                ChaloTextViewKt.a(SizeKt.fillMaxWidth$default(PaddingKt.m786paddingVpY3zN4$default(companion, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).d, 1, null), 0.0f, 1, null), chaloTextUIState, null, null, composerStartRestartGroup, 0, 12);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new ir(i, 24, loginOtpEnterTextFieldUIState, chaloTextUIState, focusRequester));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(LoginOtpEnterComponent loginOtpEnterComponent, Composer composer, int i) {
        int i2;
        LoginOtpEnterComponent loginOtpEnterComponent2;
        Object loginOtpScreenKt$LoginOtpMainScreen$1$1;
        Composer composerStartRestartGroup = composer.startRestartGroup(1798929336);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(loginOtpEnterComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1798929336, i2, -1, "app.chalo.login.ui.otp.LoginOtpMainScreen (LoginOtpScreen.kt:56)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = xs.f(composerStartRestartGroup);
            }
            FocusRequester focusRequester = (FocusRequester) objRememberedValue;
            FocusManager focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
            MutableState mutableStateA = SubscribeAsStateKt.a(loginOtpEnterComponent.t0(), composerStartRestartGroup);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(loginOtpEnterComponent) | composerStartRestartGroup.changedInstance(focusManager) | composerStartRestartGroup.changed(softwareKeyboardController);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                loginOtpEnterComponent2 = loginOtpEnterComponent;
                loginOtpScreenKt$LoginOtpMainScreen$1$1 = new LoginOtpScreenKt$LoginOtpMainScreen$1$1(loginOtpEnterComponent2, focusRequester, focusManager, softwareKeyboardController, null);
                composerStartRestartGroup.updateRememberedValue(loginOtpScreenKt$LoginOtpMainScreen$1$1);
            } else {
                loginOtpScreenKt$LoginOtpMainScreen$1$1 = objRememberedValue2;
                loginOtpEnterComponent2 = loginOtpEnterComponent;
            }
            EffectsKt.LaunchedEffect(loginOtpEnterComponent2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) loginOtpScreenKt$LoginOtpMainScreen$1$1, composerStartRestartGroup, i2 & 14);
            d((LoginOtpEnterUIState) mutableStateA.getValue(), focusRequester, composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            loginOtpEnterComponent2 = loginOtpEnterComponent;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fc0(loginOtpEnterComponent2, i, 12));
        }
    }

    public static final void d(LoginOtpEnterUIState viewState, FocusRequester focusRequester, Composer composer, int i) {
        int i2;
        Intrinsics.i(viewState, "viewState");
        LoginOtpScreenUISpecs loginOtpScreenUISpecs = viewState.f5345a;
        Intrinsics.i(focusRequester, "focusRequester");
        Composer composerStartRestartGroup = composer.startRestartGroup(2061138453);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(focusRequester) ? 32 : 16;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2061138453, i3, -1, "app.chalo.login.ui.otp.LoginOtpScreen (LoginOtpScreen.kt:89)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ChaloColorTokenKt.c(loginOtpScreenUISpecs.f5348a), null, 2, null);
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
            LoadingDialogUIState loadingDialogUIState = viewState.b;
            if (loadingDialogUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-1525441364);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                t8.m(composerStartRestartGroup, -1525441363, loadingDialogUIState, composerStartRestartGroup, 0);
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
            e(ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloColorTokenKt.c(loginOtpScreenUISpecs.f5348a), null, 2, null), loginOtpScreenUISpecs.b), viewState, focusRequester, composerStartRestartGroup, (i3 << 3) & 1008);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new v60(viewState, focusRequester, i, 23));
        }
    }

    public static final void e(Modifier modifier, LoginOtpEnterUIState viewState, FocusRequester focusRequester, Composer composer, int i) {
        int i2;
        Intrinsics.i(viewState, "viewState");
        LoginOtpResendTextUIState loginOtpResendTextUIState = viewState.e;
        LoginOtpScreenUISpecs loginOtpScreenUISpecs = viewState.f5345a;
        Intrinsics.i(focusRequester, "focusRequester");
        Composer composerStartRestartGroup = composer.startRestartGroup(2046119066);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(viewState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(focusRequester) ? 256 : 128;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2046119066, i3, -1, "app.chalo.login.ui.otp.LoginOtpUI (LoginOtpScreen.kt:119)");
            }
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical center = arrangement.getCenter();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, companion.getStart(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextUIState.ChaloTextUIState chaloTextUIState = viewState.d;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            ChaloTextViewKt.a(columnScopeInstance.align(companion3, companion.getStart()), chaloTextUIState, null, null, composerStartRestartGroup, 0, 12);
            ChaloSpacersKt.a(loginOtpScreenUISpecs.c, composerStartRestartGroup, 0);
            b(viewState.f, viewState.g, focusRequester, composerStartRestartGroup, i3 & 896);
            ChaloSpacersKt.a(loginOtpScreenUISpecs.d, composerStartRestartGroup, 0);
            if (loginOtpResendTextUIState == null) {
                composerStartRestartGroup.startReplaceGroup(105811280);
            } else {
                composerStartRestartGroup.startReplaceGroup(105811281);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion3);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
                pk0.v(companion2, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                ChaloTextViewKt.a(null, loginOtpResendTextUIState.f5346a, null, null, composerStartRestartGroup, 0, 13);
                TextUIState.ChaloTextUIState chaloTextUIState2 = loginOtpResendTextUIState.b;
                if (chaloTextUIState2 == null) {
                    composerStartRestartGroup.startReplaceGroup(712267286);
                } else {
                    composerStartRestartGroup.startReplaceGroup(712267287);
                    SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion3, loginOtpResendTextUIState.c), composerStartRestartGroup, 0);
                    ChaloTextViewKt.a(null, chaloTextUIState2, null, null, composerStartRestartGroup, 0, 13);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ir(i, 23, modifier, viewState, focusRequester));
        }
    }
}
