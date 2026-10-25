package app.chalo.electricitybill.ui.invoice.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.ChaloZigzagPathComposableKt;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.electricitybill.ui.base.CustomerInfoUIKt;
import app.chalo.electricitybill.ui.base.TransactionInfoViewKt;
import app.chalo.electricitybill.ui.invoice.EBillPaymentInvoiceComponent;
import app.chalo.electricitybill.ui.invoice.EBillPaymentInvoiceViewState;
import app.chalo.electricitybill.ui.invoice.ElectricityBillPaymentInvoiceUISpecs;
import app.chalo.electricitybill.ui.invoice.ElectricityBillPaymentInvoiceUIState;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.divider.DividerUIStateKt;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.pk0;
import defpackage.w00;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/invoice/EBillPaymentInvoiceViewState;", RemoteConfigConstants.ResponseFieldKey.STATE, "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class EBillPaymentInvoiceScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(EBillPaymentInvoiceComponent eBillPaymentInvoiceComponent, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1639290637);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(eBillPaymentInvoiceComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1639290637, i2, -1, "app.chalo.electricitybill.ui.invoice.ui.EBillPaymentInvoiceScreen (EBillPaymentInvoiceScreen.kt:23)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(eBillPaymentInvoiceComponent.t0(), composerStartRestartGroup);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(eBillPaymentInvoiceComponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new EBillPaymentInvoiceScreenKt$EBillPaymentInvoiceScreen$1$1(eBillPaymentInvoiceComponent, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.LaunchedEffect(eBillPaymentInvoiceComponent, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, i2 & 14);
            b((EBillPaymentInvoiceViewState) mutableStateA.getValue(), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new w00(eBillPaymentInvoiceComponent, i, 10));
        }
    }

    public static final void b(EBillPaymentInvoiceViewState eBillPaymentInvoiceViewState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1708378872);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(eBillPaymentInvoiceViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1708378872, i2, -1, "app.chalo.electricitybill.ui.invoice.ui.EBillPaymentInvoiceScreenUI (EBillPaymentInvoiceScreen.kt:38)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ChaloColorTokenKt.c(eBillPaymentInvoiceViewState.f2591a.f2589a), null, 2, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloToolBarKt.b(eBillPaymentInvoiceViewState.b, null, null, composerStartRestartGroup, 0, 14);
            ElectricityBillPaymentInvoiceUIState electricityBillPaymentInvoiceUIState = eBillPaymentInvoiceViewState.c;
            if (electricityBillPaymentInvoiceUIState == null) {
                composerStartRestartGroup.startReplaceGroup(2045602471);
            } else {
                DividerUIState dividerUIState = electricityBillPaymentInvoiceUIState.e;
                ElectricityBillPaymentInvoiceUISpecs electricityBillPaymentInvoiceUISpecs = electricityBillPaymentInvoiceUIState.f2593a;
                composerStartRestartGroup.startReplaceGroup(2045602472);
                ChaloColorToken chaloColorToken = electricityBillPaymentInvoiceUISpecs.f2592a;
                ChaloPadding chaloPadding = electricityBillPaymentInvoiceUISpecs.c;
                Modifier modifierC = ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(companion, ChaloColorTokenKt.c(chaloColorToken), null, 2, null), electricityBillPaymentInvoiceUISpecs.b);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
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
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
                CustomerInfoUIKt.a(null, electricityBillPaymentInvoiceUIState.b, composerStartRestartGroup, 0);
                DividerUIStateKt.a(ChaloThemeKt.c(companion, chaloPadding), dividerUIState, composerStartRestartGroup, 0, 0);
                TransactionInfoViewKt.a(null, electricityBillPaymentInvoiceUIState.c, composerStartRestartGroup, 0);
                DividerUIStateKt.a(ChaloThemeKt.c(companion, chaloPadding), dividerUIState, composerStartRestartGroup, 0, 0);
                TransactionInfoViewKt.a(null, electricityBillPaymentInvoiceUIState.d, composerStartRestartGroup, 0);
                ChaloZigzagPathComposableKt.a(ChaloThemeKt.c(companion, electricityBillPaymentInvoiceUISpecs.d), 0L, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 0, 30);
                composerStartRestartGroup = composerStartRestartGroup;
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
            scopeUpdateScopeEndRestartGroup.updateScope(new w00(eBillPaymentInvoiceViewState, i, 11));
        }
    }
}
