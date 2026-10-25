package app.chalo.checkout.ui.screen.upi.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import app.chalo.checkout.ui.payment.CheckoutItemListKt;
import app.chalo.checkout.ui.screen.payment.PaymentCardUiState;
import app.chalo.checkout.ui.screen.upi.CheckoutUpiAppsComponent;
import app.chalo.checkout.ui.screen.upi.NoUpiAppsErrorUiSpecs;
import app.chalo.checkout.ui.screen.upi.NoUpiAppsErrorUiState;
import app.chalo.checkout.ui.screen.upi.UpiAppsScreenState;
import app.chalo.checkout.ui.screen.upi.UpiAppsUiSpecs;
import app.chalo.checkout.ui.screen.upi.UpiAppsViewState;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.UiAlignmentKt;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.b3;
import defpackage.cg1;
import defpackage.fl1;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/upi/UpiAppsViewState;", RemoteConfigConstants.ResponseFieldKey.STATE, "checkout_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class UpiAppScreenKt {
    public static final void a(Modifier modifier, NoUpiAppsErrorUiState noUpiAppsErrorUiState, Composer composer, int i) {
        Composer composer2;
        NoUpiAppsErrorUiSpecs noUpiAppsErrorUiSpecs = noUpiAppsErrorUiState.f1600a;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1818170075);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(noUpiAppsErrorUiState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            modifier = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1818170075, i2, -1, "app.chalo.checkout.ui.screen.upi.compose.NoUpiAppsError (UpiAppScreen.kt:66)");
            }
            Modifier modifierC = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), noUpiAppsErrorUiSpecs.f1599a);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), UiAlignmentKt.a(noUpiAppsErrorUiSpecs.b), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
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
            ImageUIState imageUIState = noUpiAppsErrorUiState.d;
            composerStartRestartGroup.startReplaceGroup(1717631865);
            Composer composer3 = composerStartRestartGroup;
            CommonImageKt.a(imageUIState, null, false, composer3, 0, 6);
            composer3.endReplaceGroup();
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(modifier, noUpiAppsErrorUiSpecs.c), composer3, 0);
            TextUIState.ChaloTextUIState chaloTextUIState = noUpiAppsErrorUiState.b;
            if (chaloTextUIState == null) {
                composer3.startReplaceGroup(1717801341);
            } else {
                composer3.startReplaceGroup(1717801342);
                ChaloTextViewKt.a(null, chaloTextUIState, null, null, composer3, 0, 13);
                composer3 = composer3;
            }
            composer3.endReplaceGroup();
            TextUIState.ChaloTextUIState chaloTextUIState2 = noUpiAppsErrorUiState.c;
            composer3.startReplaceGroup(1717883678);
            Composer composer4 = composer3;
            ChaloTextViewKt.a(null, chaloTextUIState2, null, null, composer4, 0, 13);
            composer2 = composer4;
            if (b3.t(composer2)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new cg1(i, 29, modifier, noUpiAppsErrorUiState));
        }
    }

    public static final void b(UpiAppsViewState upiAppsViewState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-854293235);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(upiAppsViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-854293235, i2, -1, "app.chalo.checkout.ui.screen.upi.compose.UpiAppScreenContent (UpiAppScreen.kt:36)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            UpiAppsUiSpecs upiAppsUiSpecs = upiAppsViewState.f1607a;
            UpiAppsScreenState upiAppsScreenState = upiAppsViewState.c;
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(modifierFillMaxSize$default, ChaloColorTokenKt.c(upiAppsUiSpecs.f1604a), null, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ToolbarUIState toolbarUIState = upiAppsViewState.b;
            if (toolbarUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-62735281);
            } else {
                composerStartRestartGroup.startReplaceGroup(-62735280);
                ChaloToolBarKt.d(toolbarUIState, null, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (upiAppsScreenState instanceof UpiAppsScreenState.UpiApps) {
                composerStartRestartGroup.startReplaceGroup(-62586666);
                PaymentCardUiState paymentCardUiState = ((UpiAppsScreenState.UpiApps) upiAppsScreenState).f1603a;
                CheckoutItemListKt.b(paymentCardUiState.f1529a, paymentCardUiState.d, paymentCardUiState.f, true, composerStartRestartGroup, 3072, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(upiAppsScreenState instanceof UpiAppsScreenState.NoUpiApps)) {
                    throw pk0.p(composerStartRestartGroup, 829262642);
                }
                composerStartRestartGroup.startReplaceGroup(-62189370);
                a(null, ((UpiAppsScreenState.NoUpiApps) upiAppsScreenState).f1602a, composerStartRestartGroup, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new fl1(upiAppsViewState, i, 13));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(CheckoutUpiAppsComponent checkoutUpiAppsComponent, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1539643544);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(checkoutUpiAppsComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1539643544, i2, -1, "app.chalo.checkout.ui.screen.upi.compose.UpiAppsScreen (UpiAppScreen.kt:27)");
            }
            b((UpiAppsViewState) SubscribeAsStateKt.a(checkoutUpiAppsComponent.t0(), composerStartRestartGroup).getValue(), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fl1(checkoutUpiAppsComponent, i, 12));
        }
    }
}
