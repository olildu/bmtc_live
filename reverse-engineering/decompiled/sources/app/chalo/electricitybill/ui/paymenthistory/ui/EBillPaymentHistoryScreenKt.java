package app.chalo.electricitybill.ui.paymenthistory.ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.components.ChaloSnackbarKt;
import app.chalo.compose.components.TextKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.electricitybill.ui.paymenthistory.EBillHistoryItemUIState;
import app.chalo.electricitybill.ui.paymenthistory.ElectricityBillPaymentHistoryComponent;
import app.chalo.electricitybill.ui.paymenthistory.ElectricityPaymentHistoryScreenUIState;
import app.chalo.electricitybill.ui.paymenthistory.ElectricityPaymentHistoryViewState;
import app.chalo.electricitybill.ui.paymenthistory.NoHistoryDataUISpecs;
import app.chalo.uistate.base.UiAlignmentKt;
import app.chalo.uistate.base.UiArrangementKt;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.snackbar.SnackbarUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.c6;
import defpackage.pk0;
import defpackage.qp;
import defpackage.t8;
import defpackage.w00;
import defpackage.x00;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/paymenthistory/ElectricityPaymentHistoryViewState;", RemoteConfigConstants.ResponseFieldKey.STATE, "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class EBillPaymentHistoryScreenKt {
    public static final void a(EBillHistoryItemUIState eBillHistoryItemUIState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-105161841);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(eBillHistoryItemUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-105161841, i2, -1, "app.chalo.electricitybill.ui.paymenthistory.ui.EBillPaymentHistoryItemUI (EBillPaymentHistoryScreen.kt:83)");
            }
            ChaloRoundedCardKt.a(eBillHistoryItemUIState.f2596a.f2595a, null, ComposableLambdaKt.rememberComposableLambda(85287742, true, new c6(eBillHistoryItemUIState, 25), composerStartRestartGroup, 54), composerStartRestartGroup, 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new w00(eBillHistoryItemUIState, i, 5));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(ElectricityBillPaymentHistoryComponent electricityBillPaymentHistoryComponent, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1977958409);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(electricityBillPaymentHistoryComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1977958409, i2, -1, "app.chalo.electricitybill.ui.paymenthistory.ui.EBillPaymentHistoryScreen (EBillPaymentHistoryScreen.kt:35)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(electricityBillPaymentHistoryComponent.t0(), composerStartRestartGroup);
            LoadingDialogUIState loadingDialogUIState = ((ElectricityPaymentHistoryViewState) mutableStateA.getValue()).b;
            if (loadingDialogUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-1592174362);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                t8.m(composerStartRestartGroup, -1592174361, loadingDialogUIState, composerStartRestartGroup, 0);
            }
            d((ElectricityPaymentHistoryViewState) mutableStateA.getValue(), composerStartRestartGroup, 0);
            c(((ElectricityPaymentHistoryViewState) mutableStateA.getValue()).d, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new w00(electricityBillPaymentHistoryComponent, i, 6));
        }
    }

    public static final void c(SnackbarUIState snackbarUIState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(395037423);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(snackbarUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(395037423, i2, -1, "app.chalo.electricitybill.ui.paymenthistory.ui.EBillPaymentHistoryScreenSnackBar (EBillPaymentHistoryScreen.kt:126)");
            }
            Alignment bottomCenter = Alignment.INSTANCE.getBottomCenter();
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(bottomCenter, false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (snackbarUIState == null) {
                composerStartRestartGroup.startReplaceGroup(303009975);
            } else {
                composerStartRestartGroup.startReplaceGroup(303009976);
                ChaloSnackbarKt.b(snackbarUIState, null, composerStartRestartGroup, 0, 2);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new x00(snackbarUIState, i, 2));
        }
    }

    public static final void d(ElectricityPaymentHistoryViewState electricityPaymentHistoryViewState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1636084715);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(electricityPaymentHistoryViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1636084715, i2, -1, "app.chalo.electricitybill.ui.paymenthistory.ui.EBillPaymentHistoryScreenUI (EBillPaymentHistoryScreen.kt:50)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ToolbarUIState toolbarUIState = electricityPaymentHistoryViewState.f2604a;
            ElectricityPaymentHistoryScreenUIState electricityPaymentHistoryScreenUIState = electricityPaymentHistoryViewState.c;
            ChaloToolBarKt.b(toolbarUIState, null, null, composerStartRestartGroup, 0, 14);
            if (electricityPaymentHistoryScreenUIState instanceof ElectricityPaymentHistoryScreenUIState.HistoryAvailable) {
                composerStartRestartGroup.startReplaceGroup(543431547);
                f((ElectricityPaymentHistoryScreenUIState.HistoryAvailable) electricityPaymentHistoryScreenUIState, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(electricityPaymentHistoryScreenUIState instanceof ElectricityPaymentHistoryScreenUIState.NoHistoryData)) {
                    throw pk0.p(composerStartRestartGroup, 1264452883);
                }
                composerStartRestartGroup.startReplaceGroup(543584222);
                e((ElectricityPaymentHistoryScreenUIState.NoHistoryData) electricityPaymentHistoryScreenUIState, composerStartRestartGroup, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new w00(electricityPaymentHistoryViewState, i, 7));
        }
    }

    public static final void e(ElectricityPaymentHistoryScreenUIState.NoHistoryData noHistoryData, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-149143886);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(noHistoryData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-149143886, i2, -1, "app.chalo.electricitybill.ui.paymenthistory.ui.NoPaymentHistoryDataUI (EBillPaymentHistoryScreen.kt:111)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            NoHistoryDataUISpecs noHistoryDataUISpecs = noHistoryData.f2603a;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(UiArrangementKt.a(noHistoryDataUISpecs.c), UiAlignmentKt.a(noHistoryDataUISpecs.b), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            CommonImageKt.a(noHistoryData.b, null, false, composerStartRestartGroup, 0, 6);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, noHistoryDataUISpecs.d), composerStartRestartGroup, 0);
            TextKt.c(noHistoryData.c, null, null, null, composerStartRestartGroup, 0, 14);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new w00(noHistoryData, i, 9));
        }
    }

    public static final void f(ElectricityPaymentHistoryScreenUIState.HistoryAvailable historyAvailable, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1771324642);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(historyAvailable) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1771324642, i2, -1, "app.chalo.electricitybill.ui.paymenthistory.ui.PaymentHistoryAvailableUI (EBillPaymentHistoryScreen.kt:67)");
            }
            Modifier modifierC = ChaloThemeKt.c(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), historyAvailable.f2602a.f2597a);
            boolean z = (i2 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new qp(historyAvailable, 21);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            LazyDslKt.LazyColumn(modifierC, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 0, TypedValues.PositionType.TYPE_POSITION_TYPE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new w00(historyAvailable, i, 8));
        }
    }
}
