package app.chalo.multimodalticket.groupticketsummary.ui.compose;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
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
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.components.ChaloSnackbarKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.TextKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.dialogs.TncDialogUIKt;
import app.chalo.compose.components.divider.DashedDividerKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.components.multimodal.FromToStopComposableKt;
import app.chalo.compose.components.multimodal.StepBasedRouteDetailsSectionComposableKt;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.multimodalticket.groupticketsummary.ui.GroupTicketSummaryComponent;
import app.chalo.multimodalticket.groupticketsummary.ui.uistate.GroupTicketJourneyOverviewUiSpec;
import app.chalo.multimodalticket.groupticketsummary.ui.uistate.GroupTicketJourneyOverviewUiState;
import app.chalo.multimodalticket.groupticketsummary.ui.uistate.GroupTicketLegFareUiState;
import app.chalo.multimodalticket.groupticketsummary.ui.uistate.GroupTicketPriceDetailsUiSpec;
import app.chalo.multimodalticket.groupticketsummary.ui.uistate.GroupTicketPriceDetailsUiState;
import app.chalo.multimodalticket.groupticketsummary.ui.uistate.GroupTicketSummaryUiSpec;
import app.chalo.multimodalticket.groupticketsummary.ui.uistate.GroupTicketSummaryViewState;
import app.chalo.multimodalticket.groupticketsummary.ui.uistate.GroupTicketsSectionUiSpec;
import app.chalo.multimodalticket.groupticketsummary.ui.uistate.GroupTicketsSectionUiState;
import app.chalo.multimodalticket.ui.FullJourneyTicketCardUIState;
import app.chalo.multimodalticket.ui.composables.FullJourneyTicketCardComposableKt;
import app.chalo.productbooking.common.compose.FareLoadingShimmerKt;
import app.chalo.productbooking.common.compose.PriceAndTermsSectionKt;
import app.chalo.productbooking.common.uistate.FareLineUiState;
import app.chalo.productbooking.common.uistate.TermsAndConditionsUiState;
import app.chalo.uistate.base.UiAlignmentKt;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.dialog.TnCDialogUIState;
import app.chalo.uistate.divider.DashedDividerUIState;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.divider.DividerUIStateKt;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.snackbar.SnackbarUIState;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import defpackage.dq;
import defpackage.i41;
import defpackage.ir;
import defpackage.ms;
import defpackage.pk0;
import defpackage.t8;
import defpackage.v60;
import defpackage.w00;
import defpackage.xx;
import defpackage.z;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/multimodalticket/groupticketsummary/ui/uistate/GroupTicketSummaryViewState;", "viewState", "productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class GroupTicketSummaryScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(GroupTicketSummaryComponent groupTicketSummaryComponent, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(40611107);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(groupTicketSummaryComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(40611107, i2, -1, "app.chalo.multimodalticket.groupticketsummary.ui.compose.GroupTicketSummaryScreen (GroupTicketSummaryScreen.kt:48)");
            }
            b((GroupTicketSummaryViewState) SubscribeAsStateKt.a(groupTicketSummaryComponent.t0(), composerStartRestartGroup).getValue(), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new w00(groupTicketSummaryComponent, i, 24));
        }
    }

    public static final void b(GroupTicketSummaryViewState viewState, Composer composer, int i) {
        int i2;
        Modifier modifier;
        int i3;
        Modifier modifier2;
        int i4;
        Object obj;
        int i5;
        Object obj2;
        Intrinsics.i(viewState, "viewState");
        ButtonUIState buttonUIState = viewState.m;
        SnackbarUIState snackbarUIState = viewState.k;
        DividerUIState dividerUIState = viewState.n;
        GroupTicketSummaryUiSpec groupTicketSummaryUiSpec = viewState.f5922a;
        Composer composerStartRestartGroup = composer.startRestartGroup(437575424);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(437575424, i2, -1, "app.chalo.multimodalticket.groupticketsummary.ui.compose.GroupTicketSummaryScreenUI (GroupTicketSummaryScreen.kt:57)");
            }
            LoadingDialogUIState loadingDialogUIState = viewState.l;
            if (loadingDialogUIState == null) {
                composerStartRestartGroup.startReplaceGroup(583828655);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                t8.m(composerStartRestartGroup, 583828656, loadingDialogUIState, composerStartRestartGroup, 0);
            }
            TnCDialogUIState tnCDialogUIState = viewState.j;
            if (tnCDialogUIState == null) {
                composerStartRestartGroup.startReplaceGroup(583926584);
            } else {
                composerStartRestartGroup.startReplaceGroup(583926585);
                TncDialogUIKt.d(tnCDialogUIState, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierC = ChaloThemeKt.c(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), groupTicketSummaryUiSpec.f5921a);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i6), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloToolBarKt.b(viewState.b, null, null, composerStartRestartGroup, 0, 14);
            DividerUIStateKt.a(null, viewState.c, composerStartRestartGroup, 0, 1);
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(dq.a(columnScopeInstance, companion, 1.0f, false, 2, null), 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i7 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i7), composerM3915constructorimpl2));
            GroupTicketJourneyOverviewUiState groupTicketJourneyOverviewUiState = viewState.d;
            if (groupTicketJourneyOverviewUiState == null) {
                composerStartRestartGroup.startReplaceGroup(1903590927);
            } else {
                composerStartRestartGroup.startReplaceGroup(1903590928);
                c(null, groupTicketJourneyOverviewUiState, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            GroupTicketsSectionUiState groupTicketsSectionUiState = viewState.e;
            if (groupTicketsSectionUiState == null) {
                composerStartRestartGroup.startReplaceGroup(1903712757);
                composerStartRestartGroup.endReplaceGroup();
                modifier = null;
            } else {
                composerStartRestartGroup.startReplaceGroup(1903712758);
                DividerUIStateKt.a(ChaloThemeKt.c(companion, groupTicketSummaryUiSpec.d), viewState.f, composerStartRestartGroup, 0, 0);
                modifier = null;
                g(null, groupTicketsSectionUiState, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (dividerUIState == null) {
                composerStartRestartGroup.startReplaceGroup(1904007102);
            } else {
                composerStartRestartGroup.startReplaceGroup(1904007103);
                DividerUIStateKt.a(modifier, dividerUIState, composerStartRestartGroup, 0, 1);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (viewState.g) {
                composerStartRestartGroup.startReplaceGroup(-908407644);
                FareLoadingShimmerKt.a(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (snackbarUIState != null) {
                composerStartRestartGroup.startReplaceGroup(-908404560);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1904273021);
                GroupTicketPriceDetailsUiState groupTicketPriceDetailsUiState = viewState.h;
                if (groupTicketPriceDetailsUiState == null) {
                    composerStartRestartGroup.startReplaceGroup(1904314498);
                    composerStartRestartGroup.endReplaceGroup();
                    i3 = 1;
                    modifier2 = null;
                } else {
                    composerStartRestartGroup.startReplaceGroup(1904314499);
                    i3 = 1;
                    modifier2 = null;
                    f(null, groupTicketPriceDetailsUiState, composerStartRestartGroup, 0, 1);
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (dividerUIState == null) {
                    composerStartRestartGroup.startReplaceGroup(1904450030);
                } else {
                    composerStartRestartGroup.startReplaceGroup(1904450031);
                    DividerUIStateKt.a(modifier2, dividerUIState, composerStartRestartGroup, 0, i3);
                }
                composerStartRestartGroup.endReplaceGroup();
                TermsAndConditionsUiState termsAndConditionsUiState = viewState.i;
                if (termsAndConditionsUiState == null) {
                    composerStartRestartGroup.startReplaceGroup(1904579982);
                } else {
                    composerStartRestartGroup.startReplaceGroup(1904579983);
                    PriceAndTermsSectionKt.b(modifier2, termsAndConditionsUiState, composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (snackbarUIState != null) {
                composerStartRestartGroup.startReplaceGroup(-1735372774);
                if (dividerUIState == null) {
                    composerStartRestartGroup.startReplaceGroup(-1735333684);
                    composerStartRestartGroup.endReplaceGroup();
                    i5 = 1;
                    obj2 = null;
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1735333683);
                    i5 = 1;
                    obj2 = null;
                    DividerUIStateKt.a(null, dividerUIState, composerStartRestartGroup, 0, 1);
                    composerStartRestartGroup.endReplaceGroup();
                }
                e(0, composerStartRestartGroup, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion, 0.0f, i5, obj2), groupTicketSummaryUiSpec.b), snackbarUIState);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (buttonUIState != null) {
                    composerStartRestartGroup.startReplaceGroup(-1734891964);
                    if (dividerUIState == null) {
                        composerStartRestartGroup.startReplaceGroup(-1734851572);
                        composerStartRestartGroup.endReplaceGroup();
                        i4 = 1;
                        obj = null;
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1734851571);
                        i4 = 1;
                        obj = null;
                        DividerUIStateKt.a(null, dividerUIState, composerStartRestartGroup, 0, 1);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    ChaloFilledButtonKt.a(0, 0, composerStartRestartGroup, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion, 0.0f, i4, obj), groupTicketSummaryUiSpec.c), buttonUIState);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1740083348);
                }
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
            scopeUpdateScopeEndRestartGroup.updateScope(new w00(viewState, i, 25));
        }
    }

    public static final void c(Modifier modifier, GroupTicketJourneyOverviewUiState state, Composer composer, int i) {
        Intrinsics.i(state, "state");
        FullJourneyTicketCardUIState fullJourneyTicketCardUIState = state.b;
        Object obj = state.f5913a;
        Composer composerStartRestartGroup = composer.startRestartGroup(27747338);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            modifier = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(27747338, i2, -1, "app.chalo.multimodalticket.groupticketsummary.ui.compose.JourneyOverviewSection (GroupTicketSummaryScreen.kt:151)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            GroupTicketJourneyOverviewUiSpec groupTicketJourneyOverviewUiSpec = (GroupTicketJourneyOverviewUiSpec) obj;
            Modifier modifierC = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), groupTicketJourneyOverviewUiSpec.f5912a);
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
            FullJourneyTicketCardComposableKt.b(modifier, fullJourneyTicketCardUIState, composerStartRestartGroup, 6);
            ChaloSpacersKt.a(groupTicketJourneyOverviewUiSpec.b, composerStartRestartGroup, 0);
            FromToStopComposableKt.a(fullJourneyTicketCardUIState.f, composerStartRestartGroup, 0);
            StepBasedRouteDetailsSectionComposableKt.a(state.c, composerStartRestartGroup, 8);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new v60(modifier, state, i, 2));
        }
    }

    public static final void d(Modifier modifier, GroupTicketLegFareUiState state, GroupTicketPriceDetailsUiSpec groupTicketPriceDetailsUiSpec, Composer composer, int i) {
        GroupTicketLegFareUiState groupTicketLegFareUiState;
        Modifier modifier2;
        Modifier modifierM295clickableO2vRcR0$default;
        Intrinsics.i(state, "state");
        UiEventHandler uiEventHandler = state.e;
        FareLineUiState fareLineUiState = state.b;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1690492488);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? composerStartRestartGroup.changed(groupTicketPriceDetailsUiSpec) : composerStartRestartGroup.changedInstance(groupTicketPriceDetailsUiSpec) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1690492488, i2, -1, "app.chalo.multimodalticket.groupticketsummary.ui.compose.LegFareRow (GroupTicketSummaryScreen.kt:259)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) ((currentCompositeKeyHashCode2 >>> 32) ^ currentCompositeKeyHashCode2);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (!(composerStartRestartGroup.getApplier() != null)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            boolean zChanged = composerStartRestartGroup.changed(uiEventHandler);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                if (uiEventHandler != null) {
                    groupTicketLegFareUiState = state;
                    modifierM295clickableO2vRcR0$default = ClickableKt.m295clickableO2vRcR0$default(companion, null, null, false, null, null, new xx(groupTicketLegFareUiState, 17), 28, null);
                } else {
                    groupTicketLegFareUiState = state;
                    modifierM295clickableO2vRcR0$default = companion;
                }
                composerStartRestartGroup.updateRememberedValue(modifierM295clickableO2vRcR0$default);
                objRememberedValue = modifierM295clickableO2vRcR0$default;
            } else {
                groupTicketLegFareUiState = state;
            }
            Alignment.Vertical verticalB = UiAlignmentKt.b(groupTicketLegFareUiState.f5915a.f5914a);
            Modifier modifierM788paddingqDBjuR0$default = PaddingKt.m788paddingqDBjuR0$default(i41.a(rowScopeInstance, (Modifier) objRememberedValue, 1.0f, false, 2, null), 0.0f, 0.0f, fareLineUiState.c.f8269a, 0.0f, 11, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), verticalB, composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM788paddingqDBjuR0$default);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (!(composerStartRestartGroup.getApplier() != null)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion3, composerM3915constructorimpl3, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i5), composerM3915constructorimpl3));
            TextKt.c(fareLineUiState.f8270a, null, null, null, composerStartRestartGroup, 0, 14);
            ImageUIState imageUIState = groupTicketLegFareUiState.c;
            if (imageUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-1179721611);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1179721610);
                ChaloSpacersKt.a(groupTicketPriceDetailsUiSpec.g, composerStartRestartGroup, 0);
                CommonImageKt.a(imageUIState, null, false, composerStartRestartGroup, 0, 6);
                composerStartRestartGroup = composerStartRestartGroup;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            TextKt.c(fareLineUiState.b, null, null, null, composerStartRestartGroup, 0, 14);
            composerStartRestartGroup.endNode();
            if (groupTicketLegFareUiState.d) {
                composerStartRestartGroup.startReplaceGroup(-906853967);
                ArrayList arrayList = groupTicketLegFareUiState.f;
                int size = arrayList.size();
                int i6 = 0;
                int i7 = 0;
                while (i6 < size) {
                    Object obj = arrayList.get(i6);
                    i6++;
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    FareLineUiState fareLineUiState2 = (FareLineUiState) obj;
                    ChaloSpacersKt.a(i7 == 0 ? groupTicketPriceDetailsUiSpec.d : groupTicketPriceDetailsUiSpec.e, composerStartRestartGroup, 0);
                    PriceAndTermsSectionKt.a(PaddingKt.m788paddingqDBjuR0$default(Modifier.INSTANCE, groupTicketPriceDetailsUiSpec.f, 0.0f, 0.0f, 0.0f, 14, null), fareLineUiState2, composerStartRestartGroup, 0, 0);
                    i7 = i8;
                }
            } else {
                composerStartRestartGroup.startReplaceGroup(-916446080);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        } else {
            groupTicketLegFareUiState = state;
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ir(i, 9, modifier2, groupTicketLegFareUiState, groupTicketPriceDetailsUiSpec));
        }
    }

    public static final void e(int i, Composer composer, Modifier modifier, SnackbarUIState snackbarUIState) {
        int i2;
        Intrinsics.i(snackbarUIState, "snackbarUIState");
        Composer composerStartRestartGroup = composer.startRestartGroup(399446997);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(snackbarUIState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(399446997, i2, -1, "app.chalo.multimodalticket.groupticketsummary.ui.compose.PriceDetailsFailedSnackBarView (GroupTicketSummaryScreen.kt:204)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getBottom(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloSnackbarKt.b(snackbarUIState, null, composerStartRestartGroup, (i2 >> 3) & 14, 2);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ms(modifier, snackbarUIState, i, 1));
        }
    }

    public static final void f(Modifier modifier, GroupTicketPriceDetailsUiState state, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Intrinsics.i(state, "state");
        List list = state.c;
        Object obj = state.f5917a;
        Composer composerStartRestartGroup = composer.startRestartGroup(-519193938);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = i | (composerStartRestartGroup.changed(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-519193938, i3, -1, "app.chalo.multimodalticket.groupticketsummary.ui.compose.PriceDetailsSection (GroupTicketSummaryScreen.kt:217)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            GroupTicketPriceDetailsUiSpec groupTicketPriceDetailsUiSpec = (GroupTicketPriceDetailsUiSpec) obj;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
            ChaloPadding chaloPadding = groupTicketPriceDetailsUiSpec.f5916a;
            float f = groupTicketPriceDetailsUiSpec.h;
            Modifier modifierC = ChaloThemeKt.c(modifierFillMaxWidth$default, chaloPadding);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.c(state.b, null, null, null, composerStartRestartGroup, 0, 14);
            ChaloSpacersKt.a(groupTicketPriceDetailsUiSpec.b, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-1384933285);
            int i6 = 0;
            for (Object obj2 : list) {
                int i7 = i6 + 1;
                if (i6 < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                d(null, (GroupTicketLegFareUiState) obj2, groupTicketPriceDetailsUiSpec, composerStartRestartGroup, 0);
                if (i6 < CollectionsKt.K(list)) {
                    composerStartRestartGroup.startReplaceGroup(1447577434);
                    ChaloSpacersKt.a(groupTicketPriceDetailsUiSpec.c, composerStartRestartGroup, 0);
                } else {
                    composerStartRestartGroup.startReplaceGroup(1439723429);
                }
                composerStartRestartGroup.endReplaceGroup();
                i6 = i7;
            }
            composerStartRestartGroup.endReplaceGroup();
            ChaloSpacersKt.a(f, composerStartRestartGroup, 0);
            DashedDividerUIState dashedDividerUIState = state.e;
            if (dashedDividerUIState == null) {
                composerStartRestartGroup.startReplaceGroup(17053885);
            } else {
                composerStartRestartGroup.startReplaceGroup(17053886);
                DashedDividerKt.a(dashedDividerUIState, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composerStartRestartGroup, 48);
            }
            composerStartRestartGroup.endReplaceGroup();
            ChaloSpacersKt.a(f, composerStartRestartGroup, 0);
            PriceAndTermsSectionKt.a(null, state.d, composerStartRestartGroup, 0, 1);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new z(i, i2, 16, modifier2, state));
        }
    }

    public static final void g(Modifier modifier, GroupTicketsSectionUiState state, Composer composer, int i) {
        Modifier modifier2;
        Intrinsics.i(state, "state");
        Object obj = state.f5924a;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1552401383);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1552401383, i2, -1, "app.chalo.multimodalticket.groupticketsummary.ui.compose.TicketsSection (GroupTicketSummaryScreen.kt:176)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            GroupTicketsSectionUiSpec groupTicketsSectionUiSpec = (GroupTicketsSectionUiSpec) obj;
            Modifier modifierC = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), groupTicketsSectionUiSpec.f5923a);
            Alignment.Vertical verticalB = UiAlignmentKt.b(groupTicketsSectionUiSpec.c);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), verticalB, composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            Modifier modifierA = i41.a(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) ((currentCompositeKeyHashCode2 >>> 32) ^ currentCompositeKeyHashCode2);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (!(composerStartRestartGroup.getApplier() != null)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion2, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.c(state.b, null, null, null, composerStartRestartGroup, 0, 14);
            ChaloSpacersKt.a(groupTicketsSectionUiSpec.d, composerStartRestartGroup, 0);
            TextKt.c(state.c, null, null, null, composerStartRestartGroup, 0, 14);
            composerStartRestartGroup.endNode();
            modifier2 = companion;
            ChaloToolBarKt.i(state.d, PaddingKt.m788paddingqDBjuR0$default(companion, groupTicketsSectionUiSpec.b, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 0, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new v60(modifier2, state, i, 1));
        }
    }
}
