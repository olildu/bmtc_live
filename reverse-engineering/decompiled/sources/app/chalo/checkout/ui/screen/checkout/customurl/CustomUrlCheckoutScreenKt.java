package app.chalo.checkout.ui.screen.checkout.customurl;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.BackHandlerKt;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.webview.WebViewComponent_androidKt;
import app.chalo.uistate.dialog.ConfirmationDialogUiState;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.webview.WebViewUIState;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import defpackage.b3;
import defpackage.bp;
import defpackage.dd;
import defpackage.dq;
import defpackage.fp;
import defpackage.mk;
import defpackage.nu;
import defpackage.pk0;
import defpackage.t8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"checkout_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CustomUrlCheckoutScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(CustomUrlCheckoutComponent customUrlCheckoutComponent, Composer composer, int i) {
        int i2;
        CustomUrlCheckoutComponent customUrlCheckoutComponent2;
        Composer composerStartRestartGroup = composer.startRestartGroup(125134449);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(customUrlCheckoutComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(125134449, i2, -1, "app.chalo.checkout.ui.screen.checkout.customurl.CustomUrlCheckoutScreen (CustomUrlCheckoutScreen.kt:17)");
            }
            CustomUrlCheckoutUiState customUrlCheckoutUiState = (CustomUrlCheckoutUiState) SubscribeAsStateKt.a(customUrlCheckoutComponent.t0(), composerStartRestartGroup).getValue();
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(customUrlCheckoutComponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                customUrlCheckoutComponent2 = customUrlCheckoutComponent;
                CustomUrlCheckoutScreenKt$CustomUrlCheckoutScreen$1$1 customUrlCheckoutScreenKt$CustomUrlCheckoutScreen$1$1 = new CustomUrlCheckoutScreenKt$CustomUrlCheckoutScreen$1$1(1, customUrlCheckoutComponent2, CustomUrlCheckoutComponent.class, "processIntent", "processIntent(Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutViewIntent;)V", 0);
                composerStartRestartGroup.updateRememberedValue(customUrlCheckoutScreenKt$CustomUrlCheckoutScreen$1$1);
                objRememberedValue = customUrlCheckoutScreenKt$CustomUrlCheckoutScreen$1$1;
            } else {
                customUrlCheckoutComponent2 = customUrlCheckoutComponent;
            }
            b(customUrlCheckoutUiState, (Function1) ((KFunction) objRememberedValue), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            customUrlCheckoutComponent2 = customUrlCheckoutComponent;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new mk(customUrlCheckoutComponent2, i, 24));
        }
    }

    public static final void b(CustomUrlCheckoutUiState viewState, Function1 sendIntent, Composer composer, int i) {
        int i2;
        Intrinsics.i(viewState, "viewState");
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(1939053432);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(viewState) : composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1939053432, i2, -1, "app.chalo.checkout.ui.screen.checkout.customurl.CustomUrlCheckoutScreenUI (CustomUrlCheckoutScreen.kt:30)");
            }
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new bp(sendIntent, 18);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            BackHandlerKt.a(false, (Function0) objRememberedValue, 0, 0, composerStartRestartGroup, 3);
            LoadingDialogUIState loadingDialogUIState = viewState.b;
            if (loadingDialogUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-969078025);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                t8.m(composerStartRestartGroup, -969078024, loadingDialogUIState, composerStartRestartGroup, 0);
            }
            ConfirmationDialogUiState confirmationDialogUiState = viewState.d;
            if (confirmationDialogUiState == null) {
                composerStartRestartGroup.startReplaceGroup(-968979600);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                dd.l(composerStartRestartGroup, -968979599, confirmationDialogUiState, composerStartRestartGroup, 0);
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).Y, null, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM264backgroundbw27NRU$default);
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloToolBarKt.b(viewState.f1456a, null, null, composerStartRestartGroup, 0, 14);
            composerStartRestartGroup = composerStartRestartGroup;
            WebViewUIState webViewUIState = viewState.c;
            composerStartRestartGroup.startReplaceGroup(1525598162);
            Modifier modifierA = dq.a(columnScopeInstance, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 1.0f, false, 2, null);
            boolean z2 = i3 == 32;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new nu(sendIntent, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            WebViewComponent_androidKt.b(webViewUIState, modifierA, (Function1) objRememberedValue2, null, composerStartRestartGroup, 0, 8);
            if (b3.t(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fp(viewState, sendIntent, i, 23));
        }
    }
}
