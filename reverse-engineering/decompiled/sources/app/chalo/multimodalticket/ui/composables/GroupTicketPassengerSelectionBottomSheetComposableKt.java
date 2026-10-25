package app.chalo.multimodalticket.ui.composables;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.multimodalticket.ui.uistates.FareBreakupSectionUIState;
import app.chalo.multimodalticket.ui.uistates.GroupTicketPassengerFareUIState;
import app.chalo.multimodalticket.ui.uistates.GroupTicketPassengerSelectionBottomSheetUISpecs;
import app.chalo.multimodalticket.ui.uistates.GroupTicketPassengerSelectionBottomSheetUIState;
import app.chalo.multimodalticket.ui.uistates.GroupTicketPassengerSelectionItemUISpecs;
import app.chalo.multimodalticket.ui.uistates.GroupTicketPassengerSelectionItemUIState;
import app.chalo.multimodalticket.ui.uistates.PassengerSelectionItemsContainerUISpecs;
import app.chalo.multimodalticket.ui.uistates.PassengerSelectionItemsContainerUIState;
import app.chalo.uistate.base.UiAlignmentKt;
import app.chalo.uistate.base.UiArrangementKt;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.b3;
import defpackage.c6;
import defpackage.ox;
import defpackage.pk0;
import defpackage.u50;
import defpackage.v60;
import defpackage.w00;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class GroupTicketPassengerSelectionBottomSheetComposableKt {
    public static final void a(FareBreakupSectionUIState uiState, Composer composer, int i) {
        int i2;
        Intrinsics.i(uiState, "uiState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1446704291);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(uiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1446704291, i2, -1, "app.chalo.multimodalticket.ui.composables.FareBreakupComposable (GroupTicketPassengerSelectionBottomSheetComposable.kt:155)");
            }
            ChaloRoundedCardKt.b(null, ChaloThemeKt.d(uiState.f5960a.d), 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(-1195583876, true, new c6(uiState, 28), composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 13);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new w00(uiState, i, 23));
        }
    }

    public static final void b(Modifier modifier, GroupTicketPassengerFareUIState groupTicketPassengerFareUIState, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1160465903);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(groupTicketPassengerFareUIState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            modifier = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1160465903, i2, -1, "app.chalo.multimodalticket.ui.composables.GroupTicketPassengerFareComposable (GroupTicketPassengerSelectionBottomSheetComposable.kt:198)");
            }
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), UiAlignmentKt.b(groupTicketPassengerFareUIState.f5963a.b), composerStartRestartGroup, 0);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextUIState.ChaloTextUIState chaloTextUIState = groupTicketPassengerFareUIState.b;
            if (chaloTextUIState == null) {
                composerStartRestartGroup.startReplaceGroup(1026993703);
            } else {
                composerStartRestartGroup.startReplaceGroup(1026993704);
                ChaloTextViewKt.a(null, chaloTextUIState, null, null, composerStartRestartGroup, 0, 13);
                ChaloSpacersKt.a(groupTicketPassengerFareUIState.f5963a.f5962a, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            ChaloTextViewKt.a(null, groupTicketPassengerFareUIState.c, null, null, composerStartRestartGroup, 0, 13);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ox(modifier, groupTicketPassengerFareUIState, i, 27));
        }
    }

    public static final void c(Modifier modifier, GroupTicketPassengerSelectionBottomSheetUIState groupTicketPassengerSelectionBottomSheetUIState, Composer composer, int i) {
        int i2;
        GroupTicketPassengerSelectionBottomSheetUISpecs groupTicketPassengerSelectionBottomSheetUISpecs = groupTicketPassengerSelectionBottomSheetUIState.f5965a;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1361693091);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(groupTicketPassengerSelectionBottomSheetUIState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1361693091, i2, -1, "app.chalo.multimodalticket.ui.composables.GroupTicketPassengerSelectionBottomSheetComposable (GroupTicketPassengerSelectionBottomSheetComposable.kt:41)");
            }
            Modifier modifierC = ChaloThemeKt.c(ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), groupTicketPassengerSelectionBottomSheetUISpecs.f5964a);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
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
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(UiArrangementKt.a(groupTicketPassengerSelectionBottomSheetUISpecs.d), UiAlignmentKt.b(groupTicketPassengerSelectionBottomSheetUISpecs.c), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) ((currentCompositeKeyHashCode3 >>> 32) ^ currentCompositeKeyHashCode3);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion3);
            Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion2, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl3, Integer.valueOf(i5), composerM3915constructorimpl3));
            ChaloTextViewKt.a(null, groupTicketPassengerSelectionBottomSheetUIState.b, null, null, composerStartRestartGroup, 0, 13);
            ChaloSpacersKt.b(groupTicketPassengerSelectionBottomSheetUISpecs.b, composerStartRestartGroup, 0);
            ChaloTextViewKt.a(null, groupTicketPassengerSelectionBottomSheetUIState.c, null, null, composerStartRestartGroup, 0, 13);
            composerStartRestartGroup.endNode();
            ImageUIState imageUIState = groupTicketPassengerSelectionBottomSheetUIState.d;
            if (imageUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-900872376);
            } else {
                composerStartRestartGroup.startReplaceGroup(-900872375);
                CommonImageKt.a(imageUIState, null, false, composerStartRestartGroup, 0, 6);
                composerStartRestartGroup = composerStartRestartGroup;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            e(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), groupTicketPassengerSelectionBottomSheetUIState.e, composerStartRestartGroup, 6);
            if (b3.s(6, 0, composerStartRestartGroup, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), groupTicketPassengerSelectionBottomSheetUIState.f)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ox(modifier, groupTicketPassengerSelectionBottomSheetUIState, i, 28));
        }
    }

    public static final void d(Modifier modifier, GroupTicketPassengerSelectionItemUIState groupTicketPassengerSelectionItemUIState, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1209039999);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(groupTicketPassengerSelectionItemUIState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1209039999, i2, -1, "app.chalo.multimodalticket.ui.composables.GroupTicketPassengerSelectionItemComposable (GroupTicketPassengerSelectionBottomSheetComposable.kt:99)");
            }
            GroupTicketPassengerSelectionItemUISpecs groupTicketPassengerSelectionItemUISpecs = groupTicketPassengerSelectionItemUIState.f5967a;
            modifier2 = modifier;
            ChaloRoundedCardKt.b(modifier2, ChaloThemeKt.d(groupTicketPassengerSelectionItemUISpecs.b), 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(-723015330, true, new u50(2, groupTicketPassengerSelectionItemUISpecs, groupTicketPassengerSelectionItemUIState), composerStartRestartGroup, 54), composerStartRestartGroup, (i2 & 14) | 24576, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            modifier2 = modifier;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new v60(modifier2, groupTicketPassengerSelectionItemUIState, i, 0));
        }
    }

    public static final void e(Modifier modifier, PassengerSelectionItemsContainerUIState passengerSelectionItemsContainerUIState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(28708709);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(passengerSelectionItemsContainerUIState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(28708709, i2, -1, "app.chalo.multimodalticket.ui.composables.PassengerSelectionItemsContainerComposable (GroupTicketPassengerSelectionBottomSheetComposable.kt:80)");
            }
            PassengerSelectionItemsContainerUISpecs passengerSelectionItemsContainerUISpecs = passengerSelectionItemsContainerUIState.f5969a;
            Modifier modifierC = ChaloThemeKt.c(modifier, passengerSelectionItemsContainerUISpecs.f5968a);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(UiArrangementKt.a(passengerSelectionItemsContainerUISpecs.c), UiAlignmentKt.a(passengerSelectionItemsContainerUISpecs.b), composerStartRestartGroup, 0);
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
            composerStartRestartGroup.startReplaceGroup(-1720109498);
            Iterator it = passengerSelectionItemsContainerUIState.b.iterator();
            while (it.hasNext()) {
                d(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), (GroupTicketPassengerSelectionItemUIState) it.next(), composerStartRestartGroup, 6);
            }
            if (b3.t(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ox(modifier, passengerSelectionItemsContainerUIState, i, 29));
        }
    }
}
