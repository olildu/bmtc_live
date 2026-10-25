package app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
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
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.livetracking.ui.routedetailsscreen.LivePassengerIndicatorBottomSheetContentUISpec;
import app.chalo.livetracking.ui.routedetailsscreen.LivePassengerIndicatorBottomSheetContentUIState;
import app.chalo.livetracking.ui.routedetailsscreen.LiveSeatAvailabilityBottomCtaContainer;
import app.chalo.livetracking.ui.routedetailsscreen.SeatAvailabilityLevelWithInfoUIState;
import app.chalo.livetracking.ui.routedetailsscreen.SeatAvlNoticeTextUIState;
import app.chalo.uistate.button.ButtonUIState;
import defpackage.b3;
import defpackage.pk0;
import defpackage.v60;
import defpackage.wd;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class LivePassengerIndicatorBottomSheetKt {
    public static final void a(LivePassengerIndicatorBottomSheetContentUIState state, Modifier modifier, Composer composer, int i) {
        int i2;
        Intrinsics.i(state, "state");
        LivePassengerIndicatorBottomSheetContentUISpec livePassengerIndicatorBottomSheetContentUISpec = state.f4812a;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1021725775);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1021725775, i2, -1, "app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.LivePassengerIndicatorBottomSheet (LivePassengerIndicatorBottomSheet.kt:24)");
            }
            Modifier modifierC = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), livePassengerIndicatorBottomSheetContentUISpec.b);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            ChaloTextViewKt.a(null, state.b, null, null, composerStartRestartGroup, 0, 13);
            ChaloSpacersKt.a(livePassengerIndicatorBottomSheetContentUISpec.c, composerStartRestartGroup, 0);
            d(state.c, livePassengerIndicatorBottomSheetContentUISpec.d, composerStartRestartGroup, 0);
            SeatAvlNoticeTextUIState seatAvlNoticeTextUIState = state.d;
            if (seatAvlNoticeTextUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-1699099450);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1699099449);
                ChaloSpacersKt.a(livePassengerIndicatorBottomSheetContentUISpec.e, composerStartRestartGroup, 0);
                ChaloTextViewKt.a(null, seatAvlNoticeTextUIState.f4890a, null, null, composerStartRestartGroup, 0, 13);
                ChaloTextViewKt.a(null, seatAvlNoticeTextUIState.b, null, null, composerStartRestartGroup, 0, 13);
            }
            composerStartRestartGroup.endReplaceGroup();
            b(state.e, null, composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new v60(i, 16, modifier, state));
        }
    }

    public static final void b(LiveSeatAvailabilityBottomCtaContainer state, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        Intrinsics.i(state, "state");
        List list = state.f4813a;
        Composer composerStartRestartGroup = composer.startRestartGroup(729159746);
        int i2 = ((i & 6) == 0 ? (composerStartRestartGroup.changed(state) ? 4 : 2) | i : i) | 48;
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            modifier2 = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(729159746, i2, -1, "app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.LiveSeatAvailabilityBottomCta (LivePassengerIndicatorBottomSheet.kt:91)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier2);
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
            SpacerKt.Spacer(PaddingKt.m788paddingqDBjuR0$default(modifier2, 0.0f, state.b, 0.0f, 0.0f, 13, null), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-540556834);
            int i4 = 0;
            for (Object obj : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                ChaloFilledButtonKt.a(6, 0, composerStartRestartGroup, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), (ButtonUIState) obj);
                if (i4 < list.size() - 1) {
                    composerStartRestartGroup.startReplaceGroup(198208200);
                    ChaloSpacersKt.a(state.c, composerStartRestartGroup, 0);
                } else {
                    composerStartRestartGroup.startReplaceGroup(194912466);
                }
                composerStartRestartGroup.endReplaceGroup();
                i4 = i5;
            }
            if (b3.t(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new v60(i, 17, modifier2, state));
        }
    }

    public static final void c(Modifier modifier, SeatAvailabilityLevelWithInfoUIState seatAvailabilityLevelWithInfoUIState, Composer composer, int i) {
        Intrinsics.i(seatAvailabilityLevelWithInfoUIState, "seatAvailabilityLevelWithInfoUIState");
        Composer composerStartRestartGroup = composer.startRestartGroup(2085474295);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(seatAvailabilityLevelWithInfoUIState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            modifier = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2085474295, i2, -1, "app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.SeatAvailabilityLevelWithInfoText (LivePassengerIndicatorBottomSheet.kt:72)");
            }
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
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
            CommonImageKt.a(seatAvailabilityLevelWithInfoUIState.f4889a, null, false, composerStartRestartGroup, 0, 6);
            ChaloSpacersKt.a(seatAvailabilityLevelWithInfoUIState.c, composerStartRestartGroup, 0);
            ChaloTextViewKt.a(null, seatAvailabilityLevelWithInfoUIState.b, null, null, composerStartRestartGroup, 0, 13);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new v60(modifier, seatAvailabilityLevelWithInfoUIState, i, 18));
        }
    }

    public static final void d(List levels, float f, Composer composer, int i) {
        Intrinsics.i(levels, "levels");
        Composer composerStartRestartGroup = composer.startRestartGroup(793186135);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(levels) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(793186135, i2, -1, "app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.SeatAvailabilityLevelWithInfoText (LivePassengerIndicatorBottomSheet.kt:56)");
            }
            int i3 = 0;
            for (Object obj : levels) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                c(null, (SeatAvailabilityLevelWithInfoUIState) obj, composerStartRestartGroup, 0);
                if (i3 < levels.size() - 1) {
                    composerStartRestartGroup.startReplaceGroup(-880406331);
                    ChaloSpacersKt.a(f, composerStartRestartGroup, (i2 >> 3) & 14);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-882606339);
                }
                composerStartRestartGroup.endReplaceGroup();
                i3 = i4;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new wd(levels, f, i, 2));
        }
    }
}
