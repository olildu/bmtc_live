package app.chalo.login.ui.userconsent;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconButtonKt;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.BackHandlerKt;
import app.chalo.compose.StandardErrorScreenKt;
import app.chalo.compose.components.ChaloCircularProgressIndicatorKt;
import app.chalo.compose.components.ChaloLoadingDialogKt;
import app.chalo.compose.components.CircularProgressIndicatorUIState;
import app.chalo.compose.components.TextKt;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.utils.CommonContext_androidKt;
import app.chalo.compose.webview.WebViewComponent_androidKt;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.error.StandardErrorScreenUIState;
import app.chalo.uistate.webview.WebViewUIState;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.b3;
import defpackage.cm1;
import defpackage.fl1;
import defpackage.h01;
import defpackage.hn1;
import defpackage.l61;
import defpackage.pk0;
import defpackage.xm0;
import defpackage.xq0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0004²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"Lapp/chalo/login/ui/userconsent/UserConsentUIState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lapp/chalo/compose/webview/KWebView;", "webViewReference", "login_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class UserConsentScreenKt {
    public static final void a(final UserConsentRequiredDialogUIState state, Composer composer, int i) {
        int i2;
        Intrinsics.i(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(1798140350);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1798140350, i2, -1, "app.chalo.login.ui.userconsent.UserConsentRequiredDialog (UserConsentScreen.kt:148)");
            }
            ChaloLoadingDialogKt.c(state.e.f5360a, ComposableLambdaKt.rememberComposableLambda(-714480088, true, new Function2() { // from class: app.chalo.login.ui.userconsent.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-714480088, iIntValue, -1, "app.chalo.login.ui.userconsent.UserConsentRequiredDialog.<anonymous> (UserConsentScreen.kt:152)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        UserConsentRequiredDialogUIState userConsentRequiredDialogUIState = state;
                        UserConsentRequiredDialogUISpec userConsentRequiredDialogUISpec = userConsentRequiredDialogUIState.e;
                        Modifier modifierC = ChaloThemeKt.c(BackgroundKt.m263backgroundbw27NRU(modifierFillMaxWidth$default, ChaloColorTokenKt.c(userConsentRequiredDialogUISpec.e), ChaloThemeKt.d(userConsentRequiredDialogUISpec.f)), userConsentRequiredDialogUISpec.b);
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getEnd(), composer2, 48);
                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierC);
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
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        UiEventHandler uiEventHandler = userConsentRequiredDialogUIState.f5361a.b;
                        boolean zChangedInstance = composer2.changedInstance(uiEventHandler);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new UserConsentScreenKt$UserConsentRequiredDialog$1$1$1$1(0, uiEventHandler, UiEventHandler.class, "onClick", "onClick()V", 0);
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        IconButtonKt.IconButton((Function0) ((KFunction) objRememberedValue), null, false, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1349712620, true, new xm0(userConsentRequiredDialogUIState, 27), composer2, 54), composer2, 1572864, 62);
                        TextKt.c(userConsentRequiredDialogUIState.b, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), userConsentRequiredDialogUISpec.c), null, null, composer2, 0, 12);
                        TextKt.c(userConsentRequiredDialogUIState.c, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, null, composer2, 48, 12);
                        if (b3.s(0, 0, composer2, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), userConsentRequiredDialogUISpec.d), userConsentRequiredDialogUIState.d)) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return Unit.f17538a;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fl1(state, i, 15));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(UserConsentComponent userConsentComponent, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1001846144);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(userConsentComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1001846144, i2, -1, "app.chalo.login.ui.userconsent.UserConsentScreen (UserConsentScreen.kt:39)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(userConsentComponent.t0(), composerStartRestartGroup);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            CommonContext_androidKt.a(composerStartRestartGroup);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(userConsentComponent);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new UserConsentScreenKt$UserConsentScreen$1$1(userConsentComponent, mutableState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(userConsentComponent, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i2 & 14);
            UserConsentUIState userConsentUIState = (UserConsentUIState) mutableStateA.getValue();
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new xq0(mutableState, 15);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            c(userConsentUIState, (Function1) objRememberedValue3, composerStartRestartGroup, 48);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(userConsentComponent);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new cm1(6, userConsentComponent, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            BackHandlerKt.a(false, (Function0) objRememberedValue4, 0, 0, composerStartRestartGroup, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fl1(userConsentComponent, i, 14));
        }
    }

    public static final void c(UserConsentUIState userConsentUIState, Function1 function1, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-920524531);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(userConsentUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-920524531, i2, -1, "app.chalo.login.ui.userconsent.UserConsentScreen (UserConsentScreen.kt:75)");
            }
            StandardErrorScreenUIState standardErrorScreenUIState = userConsentUIState.e;
            UserConsentRequiredDialogUIState userConsentRequiredDialogUIState = userConsentUIState.d;
            if (standardErrorScreenUIState != null) {
                composerStartRestartGroup.startReplaceGroup(20027300);
                StandardErrorScreenKt.c(userConsentUIState.e, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composerStartRestartGroup, 48, 0);
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
            } else {
                if (userConsentUIState.b != null) {
                    composerStartRestartGroup.startReplaceGroup(20210975);
                    composer2 = composerStartRestartGroup;
                    d(userConsentUIState.b, userConsentUIState.c, function1, userConsentUIState.f, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer2, ((i2 << 3) & 896) | 24576);
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceGroup(17200565);
                }
                composer2.endReplaceGroup();
            }
            if (userConsentUIState.f5365a == null) {
                composer2.startReplaceGroup(20573612);
            } else {
                composer2.startReplaceGroup(20573613);
                Composer composer3 = composer2;
                ChaloLoadingDialogKt.b(null, false, null, composer3, 0, 7);
                composer2 = composer3;
            }
            composer2.endReplaceGroup();
            if (userConsentRequiredDialogUIState == null) {
                composer2.startReplaceGroup(20649066);
            } else {
                composer2.startReplaceGroup(20649067);
                a(userConsentRequiredDialogUIState, composer2, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new hn1(userConsentUIState, function1, i, 1));
        }
    }

    public static final void d(WebViewUIState webViewState, CircularProgressIndicatorUIState circularProgressIndicatorUIState, Function1 onWebViewCreated, ChaloColorToken chaloColorToken, Modifier modifier, Composer composer, int i) {
        int i2;
        Intrinsics.i(webViewState, "webViewState");
        Intrinsics.i(onWebViewCreated, "onWebViewCreated");
        Composer composerStartRestartGroup = composer.startRestartGroup(-720137838);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(webViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(circularProgressIndicatorUIState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onWebViewCreated) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(chaloColorToken) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-720137838, i3, -1, "app.chalo.login.ui.userconsent.UserConsentWebView (UserConsentScreen.kt:111)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            WebViewComponent_androidKt.b(webViewState, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), onWebViewCreated, null, composerStartRestartGroup, (i3 & 14) | 48 | (i3 & 896), 8);
            if (circularProgressIndicatorUIState == null) {
                composerStartRestartGroup.startReplaceGroup(871192797);
            } else {
                composerStartRestartGroup.startReplaceGroup(871192798);
                e(chaloColorToken, circularProgressIndicatorUIState, null, composerStartRestartGroup, ((i3 >> 9) & 14) | (i3 & 112));
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
            scopeUpdateScopeEndRestartGroup.updateScope(new l61(webViewState, circularProgressIndicatorUIState, onWebViewCreated, chaloColorToken, modifier, i));
        }
    }

    public static final void e(ChaloColorToken chaloColorToken, CircularProgressIndicatorUIState webPageLoader, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Intrinsics.i(webPageLoader, "webPageLoader");
        Composer composerStartRestartGroup = composer.startRestartGroup(475420009);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(chaloColorToken) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(webPageLoader) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            modifier2 = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(475420009, i3, -1, "app.chalo.login.ui.userconsent.WebpageLoader (UserConsentScreen.kt:136)");
            }
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), ChaloColorTokenKt.c(chaloColorToken), null, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM264backgroundbw27NRU$default);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ChaloCircularProgressIndicatorKt.a(null, webPageLoader, composerStartRestartGroup, i3 & 112, 1);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h01(i, 28, chaloColorToken, webPageLoader, modifier2));
        }
    }
}
