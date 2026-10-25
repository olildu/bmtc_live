package app.chalo.electricitybill.ui.ebillamount.ui;

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
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.components.TextKt;
import app.chalo.compose.components.textfields.BaseChaloTextFieldKt;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.electricitybill.ui.base.CustomerInfoUIKt;
import app.chalo.electricitybill.ui.base.TransactionInfoViewKt;
import app.chalo.electricitybill.ui.ebillamount.EBillAmountViewState;
import app.chalo.electricitybill.ui.ebillamount.EbillAmountComponent;
import app.chalo.electricitybill.ui.ebillamount.EnterAmountCardUISpecs;
import app.chalo.electricitybill.ui.ebillamount.EnterAmountCardUIState;
import app.chalo.electricitybill.ui.uistate.CustomerInfoUIState;
import app.chalo.electricitybill.ui.uistate.TransactionInfoUIState;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.divider.DividerUIStateKt;
import app.chalo.uistate.text.TextUIState;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.b3;
import defpackage.mk;
import defpackage.ox;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/ebillamount/EBillAmountViewState;", RemoteConfigConstants.ResponseFieldKey.STATE, "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class EBillAmountScreenKt {
    public static final void a(Modifier modifier, EnterAmountCardUIState enterAmountCardUIState, Composer composer, int i) {
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1248516505);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(enterAmountCardUIState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            modifier2 = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1248516505, i2, -1, "app.chalo.electricitybill.ui.ebillamount.ui.BillAmountEnterCard (EBillAmountScreen.kt:62)");
            }
            EnterAmountCardUISpecs enterAmountCardUISpecs = enterAmountCardUIState.f2555a;
            Modifier modifierC = ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(modifier2, ChaloColorTokenKt.c(enterAmountCardUISpecs.f2554a), null, 2, null), enterAmountCardUISpecs.b);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
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
            TextKt.c(enterAmountCardUIState.b, null, null, null, composerStartRestartGroup, 0, 14);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(modifier2, enterAmountCardUISpecs.c), composerStartRestartGroup, 0);
            TextKt.c(enterAmountCardUIState.c, null, null, null, composerStartRestartGroup, 0, 14);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(modifier2, enterAmountCardUISpecs.d), composerStartRestartGroup, 0);
            BaseChaloTextFieldKt.a(enterAmountCardUIState.d, SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), null, null, null, null, composerStartRestartGroup, 48, 124);
            composerStartRestartGroup = composerStartRestartGroup;
            TextUIState.ChaloTextUIState chaloTextUIState = enterAmountCardUIState.e;
            if (chaloTextUIState == null) {
                composerStartRestartGroup.startReplaceGroup(1032449787);
            } else {
                composerStartRestartGroup.startReplaceGroup(1032449788);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(modifier2, enterAmountCardUISpecs.e), composerStartRestartGroup, 0);
                TextKt.c(chaloTextUIState, null, null, null, composerStartRestartGroup, 0, 14);
            }
            composerStartRestartGroup.endReplaceGroup();
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(modifier2, enterAmountCardUISpecs.f), composerStartRestartGroup, 0);
            if (b3.s(0, 0, composerStartRestartGroup, SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), enterAmountCardUISpecs.g), enterAmountCardUIState.f)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ox(modifier2, enterAmountCardUIState, i, 14));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(EbillAmountComponent ebillAmountComponent, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1613965069);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(ebillAmountComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1613965069, i2, -1, "app.chalo.electricitybill.ui.ebillamount.ui.EBillAmountScreen (EBillAmountScreen.kt:28)");
            }
            c((EBillAmountViewState) SubscribeAsStateKt.a(ebillAmountComponent.t0(), composerStartRestartGroup).getValue(), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new mk(ebillAmountComponent, i, 28));
        }
    }

    public static final void c(EBillAmountViewState viewState, Composer composer, int i) {
        int i2;
        Intrinsics.i(viewState, "viewState");
        DividerUIState dividerUIState = viewState.f;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1654983822);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1654983822, i2, -1, "app.chalo.electricitybill.ui.ebillamount.ui.EBillAmountScreenUI (EBillAmountScreen.kt:39)");
            }
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloColorTokenKt.c(viewState.f2553a.f2552a), null, 2, null);
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
            ChaloToolBarKt.b(viewState.b, null, null, composerStartRestartGroup, 0, 14);
            a(null, viewState.c, composerStartRestartGroup, 0);
            DividerUIStateKt.a(null, dividerUIState, composerStartRestartGroup, 0, 1);
            CustomerInfoUIState customerInfoUIState = viewState.d;
            if (customerInfoUIState == null) {
                composerStartRestartGroup.startReplaceGroup(640362612);
            } else {
                composerStartRestartGroup.startReplaceGroup(640362613);
                CustomerInfoUIKt.a(null, customerInfoUIState, composerStartRestartGroup, 0);
                DividerUIStateKt.a(null, dividerUIState, composerStartRestartGroup, 0, 1);
            }
            composerStartRestartGroup.endReplaceGroup();
            TransactionInfoUIState transactionInfoUIState = viewState.e;
            if (transactionInfoUIState == null) {
                composerStartRestartGroup.startReplaceGroup(640497214);
            } else {
                composerStartRestartGroup.startReplaceGroup(640497215);
                TransactionInfoViewKt.a(null, transactionInfoUIState, composerStartRestartGroup, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new mk(viewState, i, 29));
        }
    }
}
