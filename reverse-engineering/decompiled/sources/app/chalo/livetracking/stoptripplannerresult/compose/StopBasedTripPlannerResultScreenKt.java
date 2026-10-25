package app.chalo.livetracking.stoptripplannerresult.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import app.chalo.compose.BackHandlerKt;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.StandardErrorScreenKt;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.components.noneditablesearch.NonEditableSearchFieldKt;
import app.chalo.compose.components.text.TitleSubtitleViewKt;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.UIShape;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultsComponent;
import app.chalo.livetracking.stoptripplannerresult.compose.components.ItinerarySingleLegCardKt;
import app.chalo.livetracking.stoptripplannerresult.compose.components.OriginDestinationSearchCardKt;
import app.chalo.livetracking.stoptripplannerresult.compose.components.TripPlannerTabUIKt;
import app.chalo.livetracking.stoptripplannerresult.uistate.LiveTrackingNotSupportedBottomSheet;
import app.chalo.livetracking.stoptripplannerresult.uistate.LiveTrackingNotSupportedBottomSheetCtaContainer;
import app.chalo.livetracking.stoptripplannerresult.uistate.LiveTrackingNotSupportedBottomSheetUISpec;
import app.chalo.livetracking.stoptripplannerresult.uistate.NearbyStopFetchErrorBottomSheetUISpec;
import app.chalo.livetracking.stoptripplannerresult.uistate.NearbyStopFetchErrorBottomSheetUIState;
import app.chalo.livetracking.stoptripplannerresult.uistate.NearbyStopResultsContainerUiState;
import app.chalo.livetracking.stoptripplannerresult.uistate.NoNearbyStopsBottomSheetUISpec;
import app.chalo.livetracking.stoptripplannerresult.uistate.NoNearbyStopsBottomSheetUIState;
import app.chalo.livetracking.stoptripplannerresult.uistate.RefreshNudgeUiSpec;
import app.chalo.livetracking.stoptripplannerresult.uistate.RefreshNudgeUiState;
import app.chalo.livetracking.stoptripplannerresult.uistate.StopBasedTripPlannerResultBottomSheetUiStateType;
import app.chalo.livetracking.stoptripplannerresult.uistate.StopBasedTripPlannerUiSpecs;
import app.chalo.livetracking.stoptripplannerresult.uistate.StopBasedTripPlannerUiState;
import app.chalo.livetracking.stoptripplannerresult.uistate.StopTripPlannerResultLoadingCardUiSpec;
import app.chalo.livetracking.stoptripplannerresult.uistate.StopTripPlannerResultLoadingCardUiState;
import app.chalo.livetracking.stoptripplannerresult.uistate.TabItemUiState;
import app.chalo.livetracking.stoptripplannerresult.uistate.TabsUiState;
import app.chalo.livetracking.stoptripplannerresult.uistate.TripPlannerResultScreenState;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.bottomsheet.BottomSheetUiStateKt;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.divider.DividerUIStateKt;
import app.chalo.uistate.image.ImageUIState;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.b3;
import defpackage.fb1;
import defpackage.fu0;
import defpackage.g61;
import defpackage.gb1;
import defpackage.hb1;
import defpackage.l91;
import defpackage.pk0;
import defpackage.sa1;
import defpackage.t8;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/StopBasedTripPlannerUiState;", RemoteConfigConstants.ResponseFieldKey.STATE, "livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class StopBasedTripPlannerResultScreenKt {
    public static final void a(Modifier modifier, LiveTrackingNotSupportedBottomSheet uiState, Composer composer, int i) {
        int i2;
        ComposeUiNode.Companion companion;
        Arrangement arrangement;
        Intrinsics.i(uiState, "uiState");
        Object obj = uiState.b;
        LiveTrackingNotSupportedBottomSheetCtaContainer liveTrackingNotSupportedBottomSheetCtaContainer = uiState.i;
        Composer composerStartRestartGroup = composer.startRestartGroup(734514552);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(uiState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(734514552, i2, -1, "app.chalo.livetracking.stoptripplannerresult.compose.LiveTrackingNotSupportedBottomSheetContent (StopBasedTripPlannerResultScreen.kt:576)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            LiveTrackingNotSupportedBottomSheetUISpec liveTrackingNotSupportedBottomSheetUISpec = (LiveTrackingNotSupportedBottomSheetUISpec) obj;
            ChaloPadding chaloPadding = liveTrackingNotSupportedBottomSheetUISpec.f4595a;
            float f = liveTrackingNotSupportedBottomSheetUISpec.d;
            Modifier modifierC = ChaloThemeKt.c(modifier, chaloPadding);
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement2.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
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
            ImageUIState imageUIState = uiState.d;
            if (imageUIState == null) {
                composerStartRestartGroup.startReplaceGroup(2124360761);
                composerStartRestartGroup.endReplaceGroup();
                arrangement = arrangement2;
                companion = companion3;
            } else {
                composerStartRestartGroup.startReplaceGroup(2124360762);
                Modifier modifierAlign = columnScopeInstance.align(Modifier.INSTANCE, companion2.getEnd());
                companion = companion3;
                arrangement = arrangement2;
                CommonImageKt.a(imageUIState, modifierAlign, false, composerStartRestartGroup, 0, 4);
                ChaloSpacersKt.a(liveTrackingNotSupportedBottomSheetUISpec.b, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            ChaloTextViewKt.a(null, uiState.c, null, null, composerStartRestartGroup, 0, 13);
            composerStartRestartGroup = composerStartRestartGroup;
            ChaloSpacersKt.a(f, composerStartRestartGroup, 0);
            DividerUIStateKt.a(null, uiState.h, composerStartRestartGroup, 0, 1);
            ChaloSpacersKt.a(f, composerStartRestartGroup, 0);
            Modifier.Companion companion4 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            ImageUIState imageUIState2 = uiState.e;
            if (imageUIState2 == null) {
                composerStartRestartGroup.startReplaceGroup(-2093709071);
            } else {
                composerStartRestartGroup.startReplaceGroup(-2093709070);
                CommonImageKt.a(imageUIState2, null, false, composerStartRestartGroup, 0, 6);
                ChaloSpacersKt.a(liveTrackingNotSupportedBottomSheetUISpec.c, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            TitleSubtitleViewKt.a(null, uiState.f, composerStartRestartGroup, 0, 1);
            composerStartRestartGroup.endNode();
            ChaloSpacersKt.a(liveTrackingNotSupportedBottomSheetUISpec.e, composerStartRestartGroup, 0);
            ItinerarySingleLegCardKt.b(uiState.g, composerStartRestartGroup, 0);
            ChaloSpacersKt.a(liveTrackingNotSupportedBottomSheetUISpec.f, composerStartRestartGroup, 0);
            Modifier modifierC2 = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), liveTrackingNotSupportedBottomSheetCtaContainer.f4593a.b);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.m672spacedBy0680j_4(liveTrackingNotSupportedBottomSheetCtaContainer.f4593a.f4594a), companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC2);
            Function0<ComposeUiNode> constructor3 = companion.getConstructor();
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
            pk0.v(companion, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl3, Integer.valueOf(i5), composerM3915constructorimpl3));
            ChaloFilledButtonKt.a(6, 0, composerStartRestartGroup, SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), liveTrackingNotSupportedBottomSheetCtaContainer.b);
            ChaloFilledButtonKt.a(6, 0, composerStartRestartGroup, SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), liveTrackingNotSupportedBottomSheetCtaContainer.c);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new sa1(i, 7, modifier, uiState));
        }
    }

    public static final void b(Modifier modifier, NearbyStopFetchErrorBottomSheetUIState uiState, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composer3;
        Intrinsics.i(uiState, "uiState");
        Object obj = uiState.b;
        Composer composerStartRestartGroup = composer.startRestartGroup(-627972097);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(uiState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-627972097, i2, -1, "app.chalo.livetracking.stoptripplannerresult.compose.NearestStopsErrorBottomSheetContent (StopBasedTripPlannerResultScreen.kt:484)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            NearbyStopFetchErrorBottomSheetUISpec nearbyStopFetchErrorBottomSheetUISpec = (NearbyStopFetchErrorBottomSheetUISpec) obj;
            Modifier modifierC = ChaloThemeKt.c(modifier, nearbyStopFetchErrorBottomSheetUISpec.f4596a);
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
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
            ImageUIState imageUIState = uiState.f;
            if (imageUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-1645027751);
                composerStartRestartGroup.endReplaceGroup();
                composer3 = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1645027750);
                composer3 = composerStartRestartGroup;
                CommonImageKt.a(imageUIState, columnScopeInstance.align(Modifier.INSTANCE, companion.getEnd()), false, composer3, 0, 4);
                ChaloSpacersKt.a(nearbyStopFetchErrorBottomSheetUISpec.b, composer3, 0);
                composer3.endReplaceGroup();
            }
            Modifier.Companion companion3 = Modifier.INSTANCE;
            CommonImageKt.a(uiState.c, columnScopeInstance.align(companion3, companion.getCenterHorizontally()), false, composer3, 0, 4);
            ChaloSpacersKt.a(nearbyStopFetchErrorBottomSheetUISpec.c, composer3, 0);
            Composer composer4 = composer3;
            ChaloTextViewKt.a(null, uiState.d, null, null, composer4, 0, 13);
            ChaloSpacersKt.a(nearbyStopFetchErrorBottomSheetUISpec.d, composer4, 0);
            ChaloTextViewKt.a(null, uiState.e, null, null, composer4, 0, 13);
            ChaloSpacersKt.a(nearbyStopFetchErrorBottomSheetUISpec.e, composer4, 0);
            ChaloTextViewKt.a(columnScopeInstance.align(companion3, companion.getCenterHorizontally()), uiState.g, null, null, composer4, 0, 12);
            composer2 = composer4;
            ChaloSpacersKt.a(nearbyStopFetchErrorBottomSheetUISpec.f, composer2, 0);
            NonEditableSearchFieldKt.a(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), uiState.h, composer2, 6);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new sa1(i, 11, modifier, uiState));
        }
    }

    public static final void c(Modifier modifier, NoNearbyStopsBottomSheetUIState uiState, Composer composer, int i) {
        int i2;
        Intrinsics.i(uiState, "uiState");
        Object obj = uiState.b;
        Composer composerStartRestartGroup = composer.startRestartGroup(1598821711);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(uiState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1598821711, i2, -1, "app.chalo.livetracking.stoptripplannerresult.compose.NoNearestStopsAvailableBottomSheetContent (StopBasedTripPlannerResultScreen.kt:533)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            NoNearbyStopsBottomSheetUISpec noNearbyStopsBottomSheetUISpec = (NoNearbyStopsBottomSheetUISpec) obj;
            Modifier modifierC = ChaloThemeKt.c(modifier, noNearbyStopsBottomSheetUISpec.f4602a);
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
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
            ImageUIState imageUIState = uiState.f;
            if (imageUIState == null) {
                composerStartRestartGroup.startReplaceGroup(750276957);
            } else {
                composerStartRestartGroup.startReplaceGroup(750276958);
                CommonImageKt.a(imageUIState, columnScopeInstance.align(Modifier.INSTANCE, companion.getEnd()), false, composerStartRestartGroup, 0, 4);
                ChaloSpacersKt.a(noNearbyStopsBottomSheetUISpec.b, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            CommonImageKt.a(uiState.c, columnScopeInstance.align(companion3, companion.getCenterHorizontally()), false, composerStartRestartGroup, 0, 4);
            ChaloSpacersKt.a(noNearbyStopsBottomSheetUISpec.c, composerStartRestartGroup, 0);
            ChaloTextViewKt.a(null, uiState.d, null, null, composerStartRestartGroup, 0, 13);
            ChaloSpacersKt.a(noNearbyStopsBottomSheetUISpec.d, composerStartRestartGroup, 0);
            ChaloTextViewKt.a(null, uiState.e, null, null, composerStartRestartGroup, 0, 13);
            composerStartRestartGroup = composerStartRestartGroup;
            ChaloSpacersKt.a(noNearbyStopsBottomSheetUISpec.e, composerStartRestartGroup, 0);
            NonEditableSearchFieldKt.a(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), uiState.g, composerStartRestartGroup, 6);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new sa1(i, 10, modifier, uiState));
        }
    }

    public static final void d(Modifier modifier, RefreshNudgeUiState uiState, Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.i(uiState, "uiState");
        Object obj = uiState.f4606a;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1414598930);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 16;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(uiState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1414598930, i2, -1, "app.chalo.livetracking.stoptripplannerresult.compose.RefreshNudge (StopBasedTripPlannerResultScreen.kt:457)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            RefreshNudgeUiSpec refreshNudgeUiSpec = (RefreshNudgeUiSpec) obj;
            boolean z = (i2 & 112) == 32;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new g61(uiState, i3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierC = ChaloThemeKt.c(BackgroundKt.m263backgroundbw27NRU(ClickableKt.m299clickableoSLSa3U$default(modifier, false, null, null, null, (Function0) objRememberedValue2, 15, null), ChaloColorTokenKt.c(refreshNudgeUiSpec.f4605a), ChaloThemeKt.d(refreshNudgeUiSpec.b)), refreshNudgeUiSpec.d);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            ChaloTextViewKt.a(null, uiState.b, null, null, composer2, 0, 13);
            ImageUIState imageUIState = uiState.c;
            if (imageUIState == null) {
                composer2.startReplaceGroup(1480281286);
            } else {
                composer2.startReplaceGroup(1480281287);
                ChaloSpacersKt.a(refreshNudgeUiSpec.e, composer2, 0);
                CommonImageKt.a(imageUIState, null, false, composer2, 0, 6);
                composer2 = composer2;
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new sa1(i, 9, modifier, uiState));
        }
    }

    public static final void e(Modifier modifier, StopTripPlannerResultLoadingCardUiState uiState, Composer composer, int i) {
        Intrinsics.i(uiState, "uiState");
        Object obj = uiState.f4618a;
        Composer composerStartRestartGroup = composer.startRestartGroup(-147994873);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(uiState) : composerStartRestartGroup.changedInstance(uiState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            modifier = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-147994873, i2, -1, "app.chalo.livetracking.stoptripplannerresult.compose.ResultLoadingShimmerItem (StopBasedTripPlannerResultScreen.kt:385)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            StopTripPlannerResultLoadingCardUiSpec stopTripPlannerResultLoadingCardUiSpec = (StopTripPlannerResultLoadingCardUiSpec) obj;
            ChaloRoundedCardKt.a(stopTripPlannerResultLoadingCardUiSpec.f4617a, null, ComposableLambdaKt.rememberComposableLambda(-1512755016, true, new fu0(28, modifier, stopTripPlannerResultLoadingCardUiSpec), composerStartRestartGroup, 54), composerStartRestartGroup, 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new gb1(modifier, uiState, i, 1));
        }
    }

    public static final void f(Modifier modifier, StopTripPlannerResultLoadingCardUiState uiState, Composer composer, int i) {
        Intrinsics.i(uiState, "uiState");
        StopTripPlannerResultLoadingCardUiSpec stopTripPlannerResultLoadingCardUiSpec = uiState.f4618a;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1803071335);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(uiState) : composerStartRestartGroup.changedInstance(uiState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1803071335, i2, -1, "app.chalo.livetracking.stoptripplannerresult.compose.ResultLoadingShimmerView (StopBasedTripPlannerResultScreen.kt:368)");
            }
            Modifier modifierC = ChaloThemeKt.c(modifier, stopTripPlannerResultLoadingCardUiSpec.d);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(1918923390);
            int i4 = uiState.b;
            for (int i5 = 0; i5 < i4; i5++) {
                UIShape.Rectangle rectangle = UIShape.f1926a;
                e(null, uiState, composerStartRestartGroup, i2 & 112);
                ChaloSpacersKt.a(stopTripPlannerResultLoadingCardUiSpec.b, composerStartRestartGroup, 0);
            }
            if (b3.t(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new gb1(modifier, uiState, i, 0));
        }
    }

    public static final void g(StopBasedTripPlannerUiState stopBasedTripPlannerUiState, SheetState sheetState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1416275330);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(stopBasedTripPlannerUiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(sheetState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1416275330, i2, -1, "app.chalo.livetracking.stoptripplannerresult.compose.StopBasedTripPlannerResultScreen (StopBasedTripPlannerResultScreen.kt:141)");
            }
            LoadingDialogUIState loadingDialogUIState = stopBasedTripPlannerUiState.g;
            StopBasedTripPlannerResultBottomSheetUiStateType stopBasedTripPlannerResultBottomSheetUiStateType = stopBasedTripPlannerUiState.f;
            TripPlannerResultScreenState tripPlannerResultScreenState = stopBasedTripPlannerUiState.e;
            if (loadingDialogUIState == null) {
                composerStartRestartGroup.startReplaceGroup(1500511961);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                t8.m(composerStartRestartGroup, 1500511962, loadingDialogUIState, composerStartRestartGroup, 0);
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ChaloColorTokenKt.c(stopBasedTripPlannerUiState.f4615a.f4614a), null, 2, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloToolBarKt.b(stopBasedTripPlannerUiState.b, null, null, composerStartRestartGroup, 0, 14);
            i(stopBasedTripPlannerUiState, composerStartRestartGroup, i2 & 14);
            composerStartRestartGroup.endNode();
            if (tripPlannerResultScreenState instanceof TripPlannerResultScreenState.Results) {
                composerStartRestartGroup.startReplaceGroup(2104729969);
                RefreshNudgeUiState refreshNudgeUiState = ((TripPlannerResultScreenState.Results) tripPlannerResultScreenState).e;
                if (refreshNudgeUiState == null) {
                    composerStartRestartGroup.startReplaceGroup(822119600);
                } else {
                    composerStartRestartGroup.startReplaceGroup(822119601);
                    Modifier modifierZIndex = ZIndexModifierKt.zIndex(ChaloThemeKt.c(boxScopeInstance.align(companion, companion2.getBottomCenter()), refreshNudgeUiState.f4606a.c), 1.0f);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    int i5 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierZIndex);
                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
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
                    pk0.v(companion3, composerM3915constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i5), composerM3915constructorimpl3));
                    d(companion, refreshNudgeUiState, composerStartRestartGroup, 6);
                    composerStartRestartGroup.endNode();
                }
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(814011210);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (Intrinsics.d(stopBasedTripPlannerResultBottomSheetUiStateType, StopBasedTripPlannerResultBottomSheetUiStateType.None.b)) {
                composerStartRestartGroup.startReplaceGroup(1492952612);
            } else {
                composerStartRestartGroup.startReplaceGroup(1501704594);
                BottomSheetUiStateKt.a(null, stopBasedTripPlannerResultBottomSheetUiStateType.f4613a, sheetState, ComposableLambdaKt.rememberComposableLambda(598440923, true, new hb1(stopBasedTripPlannerUiState, 5), composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 << 3) & 896) | 24576, 9);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new sa1(stopBasedTripPlannerUiState, sheetState, i, 8));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(StopTripPlannerResultsComponent stopTripPlannerResultsComponent, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(625335322);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(stopTripPlannerResultsComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(625335322, i2, -1, "app.chalo.livetracking.stoptripplannerresult.compose.StopBasedTripPlannerResultScreenMain (StopBasedTripPlannerResultScreen.kt:108)");
            }
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(stopTripPlannerResultsComponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new g61(stopTripPlannerResultsComponent, 15);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            BackHandlerKt.a(false, (Function0) objRememberedValue, 0, 0, composerStartRestartGroup, 3);
            SheetState sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composerStartRestartGroup, 6, 2);
            MutableState mutableStateA = SubscribeAsStateKt.a(stopTripPlannerResultsComponent.t0(), composerStartRestartGroup);
            g((StopBasedTripPlannerUiState) mutableStateA.getValue(), sheetStateRememberModalBottomSheetState, composerStartRestartGroup, 0);
            StopBasedTripPlannerResultBottomSheetUiStateType stopBasedTripPlannerResultBottomSheetUiStateType = ((StopBasedTripPlannerUiState) mutableStateA.getValue()).f;
            boolean zChanged = composerStartRestartGroup.changed(mutableStateA) | composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new StopBasedTripPlannerResultScreenKt$StopBasedTripPlannerResultScreenMain$2$1(sheetStateRememberModalBottomSheetState, mutableStateA, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(stopBasedTripPlannerResultBottomSheetUiStateType, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fb1(stopTripPlannerResultsComponent, i, 1));
        }
    }

    public static final void i(StopBasedTripPlannerUiState stopBasedTripPlannerUiState, Composer composer, int i) {
        int i2;
        NearbyStopResultsContainerUiState nearbyStopResultsContainerUiState;
        Composer composerStartRestartGroup = composer.startRestartGroup(366469041);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(stopBasedTripPlannerUiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            int i3 = -1;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(366469041, i2, -1, "app.chalo.livetracking.stoptripplannerresult.compose.StopTripPlannerResultScreen (StopBasedTripPlannerResultScreen.kt:220)");
            }
            TabsUiState tabsUiState = stopBasedTripPlannerUiState.c;
            StopBasedTripPlannerUiSpecs stopBasedTripPlannerUiSpecs = stopBasedTripPlannerUiState.f4615a;
            TripPlannerResultScreenState tripPlannerResultScreenState = stopBasedTripPlannerUiState.e;
            Iterator it = tabsUiState.b.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                if (((TabItemUiState) it.next()).d) {
                    i3 = i4;
                    break;
                }
                i4++;
            }
            Integer numValueOf = Integer.valueOf(i3);
            if (i3 < 0) {
                numValueOf = null;
            }
            int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateMapOf();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotStateMap snapshotStateMap = (SnapshotStateMap) objRememberedValue;
            Integer numValueOf2 = Integer.valueOf(iIntValue);
            Object lazyListState = snapshotStateMap.get(numValueOf2);
            if (lazyListState == null) {
                lazyListState = new LazyListState(0, 0, 3, null);
                snapshotStateMap.put(numValueOf2, lazyListState);
            }
            LazyListState lazyListState2 = (LazyListState) lazyListState;
            boolean z = tripPlannerResultScreenState instanceof TripPlannerResultScreenState.Results;
            Boolean boolValueOf = Boolean.valueOf(z && (nearbyStopResultsContainerUiState = ((TripPlannerResultScreenState.Results) tripPlannerResultScreenState).c) != null && nearbyStopResultsContainerUiState.d);
            int i5 = i2 & 14;
            boolean zChanged = (i5 == 4) | composerStartRestartGroup.changed(lazyListState2);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new StopBasedTripPlannerResultScreenKt$StopTripPlannerResultScreen$1$1(stopBasedTripPlannerUiState, lazyListState2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-326542497);
                float fM7278constructorimpl = Dp.m7278constructorimpl(((TripPlannerResultScreenState.Results) tripPlannerResultScreenState).e != null ? 80 : 0);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                ChaloPadding chaloPadding = stopBasedTripPlannerUiSpecs.b;
                PaddingValues paddingValuesM780PaddingValuesa9UjIt4 = PaddingKt.m780PaddingValuesa9UjIt4(chaloPadding.b, chaloPadding.f1918a, chaloPadding.c, Dp.m7278constructorimpl(chaloPadding.d + fM7278constructorimpl));
                boolean z2 = i5 == 4;
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new l91(stopBasedTripPlannerUiState, 13);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                LazyDslKt.LazyColumn(modifierFillMaxWidth$default, lazyListState2, paddingValuesM780PaddingValuesa9UjIt4, false, null, centerHorizontally, null, false, null, (Function1) objRememberedValue3, composerStartRestartGroup, 196614, 472);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-323818341);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifierC = ChaloThemeKt.c(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), stopBasedTripPlannerUiSpecs.b);
                Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                Alignment.Companion companion3 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                pk0.v(companion4, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl, Integer.valueOf(i6), composerM3915constructorimpl));
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                OriginDestinationSearchCardKt.a(ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), stopBasedTripPlannerUiSpecs.c), stopBasedTripPlannerUiState.d, composerStartRestartGroup, 0, 0);
                ChaloSpacersKt.a(stopBasedTripPlannerUiSpecs.e, composerStartRestartGroup, 0);
                TripPlannerTabUIKt.a(stopBasedTripPlannerUiState.c, composerStartRestartGroup, 0);
                if (tripPlannerResultScreenState instanceof TripPlannerResultScreenState.Error) {
                    composerStartRestartGroup.startReplaceGroup(46915033);
                    StandardErrorScreenKt.c(((TripPlannerResultScreenState.Error) tripPlannerResultScreenState).f4626a, columnScopeInstance.align(SizeKt.fillMaxWidth(SizeKt.fillMaxHeight$default(companion2, 0.0f, 1, null), 0.8f), companion3.getCenterHorizontally()), composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (tripPlannerResultScreenState instanceof TripPlannerResultScreenState.Loading) {
                    composerStartRestartGroup.startReplaceGroup(47294039);
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                    StopTripPlannerResultLoadingCardUiState stopTripPlannerResultLoadingCardUiState = ((TripPlannerResultScreenState.Loading) tripPlannerResultScreenState).f4627a;
                    UIShape.Rectangle rectangle = UIShape.f1926a;
                    f(modifierFillMaxWidth$default2, stopTripPlannerResultLoadingCardUiState, composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (tripPlannerResultScreenState instanceof TripPlannerResultScreenState.NoResults) {
                    composerStartRestartGroup.startReplaceGroup(47591515);
                    StandardErrorScreenKt.c(((TripPlannerResultScreenState.NoResults) tripPlannerResultScreenState).f4628a, columnScopeInstance.align(SizeKt.fillMaxWidth(SizeKt.fillMaxHeight$default(companion2, 0.0f, 1, null), 1.0f), companion3.getCenterHorizontally()), composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (!z) {
                        throw pk0.p(composerStartRestartGroup, 971342101);
                    }
                    composerStartRestartGroup.startReplaceGroup(47964724);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fb1(stopBasedTripPlannerUiState, i, 2));
        }
    }
}
