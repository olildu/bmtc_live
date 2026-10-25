package app.chalo.metro.ui.confirmbooking.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
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
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.VerticalDashedLineKt;
import app.chalo.compose.components.ChaloSnackbarKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.TextKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.dialogs.TncDialogUIKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.components.text.TitleSubtitleViewKt;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.UIShape;
import app.chalo.metro.ui.confirmbooking.uistate.ConfirmBookingDetailsScreenUiSpec;
import app.chalo.metro.ui.confirmbooking.uistate.ConfirmBookingScreenViewState;
import app.chalo.metro.ui.confirmbooking.uistate.JourneyDetailsUiSpec;
import app.chalo.metro.ui.confirmbooking.uistate.JourneyDetailsUiState;
import app.chalo.metro.ui.confirmbooking.uistate.PriceDetailsUiSpec;
import app.chalo.metro.ui.confirmbooking.uistate.PriceDetailsUiState;
import app.chalo.metro.ui.confirmbooking.uistate.StopDetailUiState;
import app.chalo.metro.ui.landing.compose.components.ProductBannerKt;
import app.chalo.metro.ui.uistate.ProductBannerUIState;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionUiStateKt;
import app.chalo.productbooking.common.compose.FareLoadingShimmerKt;
import app.chalo.productbooking.common.compose.PriceAndTermsSectionKt;
import app.chalo.productbooking.common.uistate.FareLineUiState;
import app.chalo.productbooking.common.uistate.TermsAndConditionsUiState;
import app.chalo.uistate.VerticalDashedLineUIState;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.dialog.TnCDialogUIState;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.divider.DividerUIStateKt;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.snackbar.SnackbarUIState;
import app.chalo.uistate.text.TitleSubtitleUiState;
import defpackage.b3;
import defpackage.dq;
import defpackage.fp;
import defpackage.mk;
import defpackage.ms;
import defpackage.ns;
import defpackage.pk0;
import defpackage.t8;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ConfirmBookingScreenUIKt {
    public static final void a(ConfirmBookingScreenViewState viewState, Composer composer, int i) {
        int i2;
        Intrinsics.i(viewState, "viewState");
        SnackbarUIState snackbarUIState = viewState.h;
        ConfirmBookingDetailsScreenUiSpec confirmBookingDetailsScreenUiSpec = viewState.f5475a;
        DividerUIState dividerUIState = viewState.i;
        Composer composerStartRestartGroup = composer.startRestartGroup(-208982849);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-208982849, i2, -1, "app.chalo.metro.ui.confirmbooking.compose.ConfirmBookingScreenUI (ConfirmBookingScreenUI.kt:47)");
            }
            LoadingDialogUIState loadingDialogUIState = viewState.k;
            if (loadingDialogUIState == null) {
                composerStartRestartGroup.startReplaceGroup(1894638288);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                t8.m(composerStartRestartGroup, 1894638289, loadingDialogUIState, composerStartRestartGroup, 0);
            }
            TnCDialogUIState tnCDialogUIState = viewState.f;
            if (tnCDialogUIState == null) {
                composerStartRestartGroup.startReplaceGroup(1894736217);
            } else {
                composerStartRestartGroup.startReplaceGroup(1894736218);
                TncDialogUIKt.d(tnCDialogUIState, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierC = ChaloThemeKt.c(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), confirmBookingDetailsScreenUiSpec.f5474a);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
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
            ChaloToolBarKt.b(viewState.b, null, null, composerStartRestartGroup, 0, 14);
            d(viewState.c, composerStartRestartGroup, 0);
            if (dividerUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-1922551575);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1922551574);
                DividerUIStateKt.a(null, dividerUIState, composerStartRestartGroup, 0, 1);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (viewState.j) {
                composerStartRestartGroup.startReplaceGroup(769269633);
                FareLoadingShimmerKt.a(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (snackbarUIState != null) {
                composerStartRestartGroup.startReplaceGroup(-1922344432);
                b(0, composerStartRestartGroup, ChaloThemeKt.c(dq.a(columnScopeInstance, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 1.0f, false, 2, null), confirmBookingDetailsScreenUiSpec.c), snackbarUIState);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1921970851);
                Modifier modifierA = dq.a(columnScopeInstance, companion, 1.0f, false, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA);
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
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i5 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
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
                pk0.v(companion3, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy3, composerM3915constructorimpl3, currentCompositionLocalMap3);
                Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i5), composerM3915constructorimpl3));
                e(null, viewState.d, composerStartRestartGroup, 0);
                if (dividerUIState == null) {
                    composerStartRestartGroup.startReplaceGroup(-518916275);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-518916274);
                    DividerUIStateKt.a(null, dividerUIState, composerStartRestartGroup, 0, 1);
                }
                composerStartRestartGroup.endReplaceGroup();
                TermsAndConditionsUiState termsAndConditionsUiState = viewState.e;
                if (termsAndConditionsUiState == null) {
                    composerStartRestartGroup.startReplaceGroup(-518724881);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-518724880);
                    PriceAndTermsSectionKt.b(null, termsAndConditionsUiState, composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (dividerUIState == null) {
                    composerStartRestartGroup.startReplaceGroup(-1459305953);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1459305952);
                    DividerUIStateKt.a(null, dividerUIState, composerStartRestartGroup, 0, 1);
                }
                composerStartRestartGroup.endReplaceGroup();
                SpacerKt.Spacer(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(dq.a(columnScopeInstance, companion, 1.0f, false, 2, null), 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).r0, null, 2, null), composerStartRestartGroup, 0);
                composerStartRestartGroup.endNode();
                if (dividerUIState == null) {
                    composerStartRestartGroup.startReplaceGroup(-1920681159);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1920681158);
                    DividerUIStateKt.a(null, dividerUIState, composerStartRestartGroup, 0, 1);
                }
                composerStartRestartGroup.endReplaceGroup();
                ChaloFilledButtonKt.a(0, 0, composerStartRestartGroup, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), confirmBookingDetailsScreenUiSpec.b), viewState.g);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new mk(viewState, i, 18));
        }
    }

    public static final void b(int i, Composer composer, Modifier modifier, SnackbarUIState snackbarUIState) {
        int i2;
        Intrinsics.i(snackbarUIState, "snackbarUIState");
        Composer composerStartRestartGroup = composer.startRestartGroup(243827716);
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
                ComposerKt.traceEventStart(243827716, i2, -1, "app.chalo.metro.ui.confirmbooking.compose.FinalFareSnackBarView (ConfirmBookingScreenUI.kt:191)");
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
            scopeUpdateScopeEndRestartGroup.updateScope(new ms(modifier, snackbarUIState, i, 0));
        }
    }

    public static final void c(Modifier modifier, ImageUIState fromStopImageUIState, ImageUIState toStopImageUIState, VerticalDashedLineUIState verticalDashedLineUIState, Composer composer, int i) {
        int i2;
        Intrinsics.i(fromStopImageUIState, "fromStopImageUIState");
        Intrinsics.i(toStopImageUIState, "toStopImageUIState");
        Intrinsics.i(verticalDashedLineUIState, "verticalDashedLineUIState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1652615173);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(fromStopImageUIState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(toStopImageUIState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(verticalDashedLineUIState) : composerStartRestartGroup.changedInstance(verticalDashedLineUIState) ? 2048 : 1024;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1652615173, i3, -1, "app.chalo.metro.ui.confirmbooking.compose.FromToStopIconView (ConfirmBookingScreenUI.kt:208)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            CommonImageKt.a(fromStopImageUIState, null, false, composerStartRestartGroup, (i3 >> 3) & 14, 6);
            int i5 = i3 >> 6;
            VerticalDashedLineKt.a(columnScopeInstance.weight(Modifier.INSTANCE, 1.0f, true), verticalDashedLineUIState, composerStartRestartGroup, i5 & 112);
            CommonImageKt.a(toStopImageUIState, null, false, composerStartRestartGroup, i5 & 14, 6);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ns(modifier, fromStopImageUIState, toStopImageUIState, verticalDashedLineUIState, i, 0));
        }
    }

    public static final void d(JourneyDetailsUiState state, Composer composer, int i) {
        Intrinsics.i(state, "state");
        List list = state.d;
        StopDetailUiState stopDetailUiState = state.c;
        StopDetailUiState stopDetailUiState2 = state.b;
        Object obj = state.f5479a;
        Composer composerStartRestartGroup = composer.startRestartGroup(696956577);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i : i;
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(696956577, i2, -1, "app.chalo.metro.ui.confirmbooking.compose.JourneyDetailsSection (ConfirmBookingScreenUI.kt:135)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            JourneyDetailsUiSpec journeyDetailsUiSpec = (JourneyDetailsUiSpec) obj;
            Modifier.Companion companion = Modifier.INSTANCE;
            ChaloPadding chaloPadding = journeyDetailsUiSpec.f5478a;
            float f = journeyDetailsUiSpec.b;
            Modifier modifierC = ChaloThemeKt.c(companion, chaloPadding);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
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
            Modifier modifierHeight = IntrinsicKt.height(companion, IntrinsicSize.Min);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierHeight);
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
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            c(SizeKt.fillMaxHeight(companion, 0.9f), stopDetailUiState2.b, stopDetailUiState.b, state.f, composerStartRestartGroup, 6);
            ChaloSpacersKt.a(journeyDetailsUiSpec.e, composerStartRestartGroup, 0);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            pk0.v(companion3, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i5), composerM3915constructorimpl3));
            PremiumBusSlotSelectionUiStateKt.s(stopDetailUiState2.c, stopDetailUiState2.d, composerStartRestartGroup, 0);
            ChaloSpacersKt.a(journeyDetailsUiSpec.c, composerStartRestartGroup, 0);
            PremiumBusSlotSelectionUiStateKt.s(stopDetailUiState.c, stopDetailUiState.d, composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            ChaloSpacersKt.a(f, composerStartRestartGroup, 0);
            DividerUIState dividerUIState = state.e;
            if (dividerUIState == null) {
                composerStartRestartGroup.startReplaceGroup(697882363);
            } else {
                composerStartRestartGroup.startReplaceGroup(697882364);
                DividerUIStateKt.a(null, dividerUIState, composerStartRestartGroup, 0, 1);
            }
            composerStartRestartGroup.endReplaceGroup();
            ChaloSpacersKt.a(f, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-254577848);
            int i6 = 0;
            for (Object obj2 : list) {
                int i7 = i6 + 1;
                if (i6 < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                TitleSubtitleViewKt.a(null, (TitleSubtitleUiState) obj2, composerStartRestartGroup, 0, 1);
                if (i6 < CollectionsKt.K(list)) {
                    composerStartRestartGroup.startReplaceGroup(-1128151304);
                    ChaloSpacersKt.a(journeyDetailsUiSpec.d, composerStartRestartGroup, 0);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1134643231);
                }
                composerStartRestartGroup.endReplaceGroup();
                i6 = i7;
            }
            if (b3.t(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new mk(state, i, 19));
        }
    }

    public static final void e(Modifier modifier, PriceDetailsUiState state, Composer composer, int i) {
        Modifier modifier2;
        Intrinsics.i(state, "state");
        List list = state.c;
        Object obj = state.f5481a;
        Composer composerStartRestartGroup = composer.startRestartGroup(455696146);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            modifier2 = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(455696146, i2, -1, "app.chalo.metro.ui.confirmbooking.compose.PriceDetailsSection (ConfirmBookingScreenUI.kt:231)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            PriceDetailsUiSpec priceDetailsUiSpec = (PriceDetailsUiSpec) obj;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
            ChaloPadding chaloPadding = priceDetailsUiSpec.f5480a;
            float f = priceDetailsUiSpec.d;
            Modifier modifierC = ChaloThemeKt.c(modifierFillMaxWidth$default, chaloPadding);
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
            TextKt.c(state.b, null, null, null, composerStartRestartGroup, 0, 14);
            ChaloSpacersKt.a(priceDetailsUiSpec.b, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-540547383);
            int i4 = 0;
            for (Object obj2 : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                PriceAndTermsSectionKt.a(null, (FareLineUiState) obj2, composerStartRestartGroup, 0, 1);
                if (i4 < CollectionsKt.K(list)) {
                    composerStartRestartGroup.startReplaceGroup(-1000332285);
                    ChaloSpacersKt.a(priceDetailsUiSpec.c, composerStartRestartGroup, 0);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1008384814);
                }
                composerStartRestartGroup.endReplaceGroup();
                i4 = i5;
            }
            composerStartRestartGroup.endReplaceGroup();
            ChaloSpacersKt.a(f, composerStartRestartGroup, 0);
            DividerUIState dividerUIState = state.e;
            if (dividerUIState == null) {
                composerStartRestartGroup.startReplaceGroup(423219798);
            } else {
                composerStartRestartGroup.startReplaceGroup(423219799);
                DividerUIStateKt.a(null, dividerUIState, composerStartRestartGroup, 0, 1);
            }
            composerStartRestartGroup.endReplaceGroup();
            ChaloSpacersKt.a(f, composerStartRestartGroup, 0);
            PriceAndTermsSectionKt.a(null, state.d, composerStartRestartGroup, 0, 1);
            ProductBannerUIState productBannerUIState = state.f;
            if (productBannerUIState == null) {
                composerStartRestartGroup.startReplaceGroup(423415873);
            } else {
                composerStartRestartGroup.startReplaceGroup(423415874);
                ChaloSpacersKt.a(priceDetailsUiSpec.e, composerStartRestartGroup, 0);
                UIShape.Rectangle rectangle = UIShape.f1926a;
                ProductBannerKt.a(null, productBannerUIState, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new fp(modifier2, state, i, 8));
        }
    }
}
