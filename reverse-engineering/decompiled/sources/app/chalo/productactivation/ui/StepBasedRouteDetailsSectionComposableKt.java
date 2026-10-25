package app.chalo.productactivation.ui;

import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.branding.ProductBookingBrandingKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.components.multimodal.ModeTicketStepInfoComposablesKt;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.productactivation.ui.uistate.StepBasedRouteDetailCardUISpecs;
import app.chalo.productactivation.ui.uistate.StepBasedRouteDetailCardUIState;
import app.chalo.productactivation.ui.uistate.StepBasedRouteDetailUIState;
import app.chalo.productactivation.ui.uistate.StepBasedRouteDetailsSectionUISpecs;
import app.chalo.productactivation.ui.uistate.StepBasedRouteDetailsSectionUIState;
import app.chalo.productactivation.ui.uistate.StepBasedRouteDetailsToggleUIState;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.UiAlignmentKt;
import app.chalo.uistate.base.UiArrangementKt;
import app.chalo.uistate.branding.ProductBookingBrandingUIState;
import app.chalo.uistate.multimodal.StepTicketModeBasedInfoUIState;
import defpackage.a31;
import defpackage.g61;
import defpackage.i41;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class StepBasedRouteDetailsSectionComposableKt {
    public static final void a(StepBasedRouteDetailsSectionUIState state, Composer composer, int i) {
        Composer composer2;
        Intrinsics.i(state, "state");
        StepBasedRouteDetailsSectionUISpecs stepBasedRouteDetailsSectionUISpecs = state.f8077a;
        StepBasedRouteDetailsToggleUIState stepBasedRouteDetailsToggleUIState = state.b;
        Composer composerStartRestartGroup = composer.startRestartGroup(1028309015);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i : i;
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1028309015, i2, -1, "app.chalo.productactivation.ui.StepBasedRouteDetailsSectionComposable (StepBasedRouteDetailsSectionComposable.kt:26)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = 0.0f;
            Modifier modifierAnimateContentSize$default = AnimationModifierKt.animateContentSize$default(SizeKt.fillMaxWidth$default(ChaloThemeKt.c(companion, stepBasedRouteDetailsSectionUISpecs.f8076a), 0.0f, 1, null), null, null, 3, null);
            Alignment.Horizontal horizontalA = UiAlignmentKt.a(stepBasedRouteDetailsSectionUISpecs.b);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), horizontalA, composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAnimateContentSize$default);
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
            Modifier modifierC = ChaloThemeKt.c(companion, stepBasedRouteDetailsToggleUIState.f8079a.f8078a);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(state);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new g61(state, 12);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierM295clickableO2vRcR0$default = ClickableKt.m295clickableO2vRcR0$default(modifierC, null, null, false, null, null, (Function0) objRememberedValue, 28, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), UiAlignmentKt.b(stepBasedRouteDetailsSectionUISpecs.c), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM295clickableO2vRcR0$default);
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
            ChaloTextViewKt.a(null, stepBasedRouteDetailsToggleUIState.b, null, null, composerStartRestartGroup, 0, 13);
            ChaloSpacersKt.v(stepBasedRouteDetailsToggleUIState.f8079a.b, composerStartRestartGroup, 0);
            CommonImageKt.a(stepBasedRouteDetailsToggleUIState.c, null, false, composerStartRestartGroup, 0, 6);
            composer2 = composerStartRestartGroup;
            composer2.endNode();
            if (state.d) {
                composer2.startReplaceGroup(1996176060);
                StepBasedRouteDetailUIState stepBasedRouteDetailUIState = state.c;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(UiArrangementKt.a(stepBasedRouteDetailUIState.f8075a.f8074a), Alignment.INSTANCE.getStart(), composer2, 0);
                long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                int i5 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default);
                Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor3);
                } else {
                    composer2.useNode();
                }
                Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer2);
                pk0.v(companion2, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
                Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl3, Integer.valueOf(i5), composerM3915constructorimpl3));
                composer2.startReplaceGroup(-1804400049);
                for (StepBasedRouteDetailCardUIState stepBasedRouteDetailCardUIState : stepBasedRouteDetailUIState.b) {
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion3, f, 1, null);
                    StepBasedRouteDetailCardUISpecs stepBasedRouteDetailCardUISpecs = stepBasedRouteDetailCardUIState.f8073a;
                    StepTicketModeBasedInfoUIState stepTicketModeBasedInfoUIState = stepBasedRouteDetailCardUIState.b;
                    Modifier modifierC2 = ChaloThemeKt.c(BackgroundKt.m263backgroundbw27NRU(modifierFillMaxWidth$default2, ChaloColorTokenKt.c(stepBasedRouteDetailCardUISpecs.c), ChaloThemeKt.d(stepBasedRouteDetailCardUISpecs.d)), stepBasedRouteDetailCardUISpecs.f8072a);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), UiAlignmentKt.b(stepBasedRouteDetailCardUISpecs.f), composer2, 0);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i6 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierC2);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor4);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composer2);
                    pk0.v(companion4, composerM3915constructorimpl4, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl4, currentCompositionLocalMap4);
                    Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl4, Integer.valueOf(i6), composerM3915constructorimpl4));
                    Modifier modifierA = i41.a(RowScopeInstance.INSTANCE, companion3, 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i7 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, modifierA);
                    Function0<ComposeUiNode> constructor5 = companion4.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor5);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3915constructorimpl5 = Updater.m3915constructorimpl(composer2);
                    pk0.v(companion4, composerM3915constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl5, currentCompositionLocalMap5);
                    Updater.m3923setimpl(composerM3915constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl5, Integer.valueOf(i7), composerM3915constructorimpl5));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    if (stepTicketModeBasedInfoUIState instanceof StepTicketModeBasedInfoUIState.Bus) {
                        composer2.startReplaceGroup(-1050586167);
                        ModeTicketStepInfoComposablesKt.a((StepTicketModeBasedInfoUIState.Bus) stepTicketModeBasedInfoUIState, null, composer2, 0, 2);
                        composer2.endReplaceGroup();
                    } else {
                        if (!(stepTicketModeBasedInfoUIState instanceof StepTicketModeBasedInfoUIState.Metro)) {
                            throw pk0.p(composer2, -1050589469);
                        }
                        composer2.startReplaceGroup(-1050581749);
                        ModeTicketStepInfoComposablesKt.b((StepTicketModeBasedInfoUIState.Metro) stepTicketModeBasedInfoUIState, null, composer2, 0, 2);
                        composer2.endReplaceGroup();
                    }
                    composer2.endNode();
                    ProductBookingBrandingUIState.ImageResourceBrandingUIState imageResourceBrandingUIState = stepBasedRouteDetailCardUIState.c;
                    if (imageResourceBrandingUIState == null) {
                        composer2.startReplaceGroup(1462458036);
                    } else {
                        composer2.startReplaceGroup(1462458037);
                        ProductBookingBrandingKt.a(null, imageResourceBrandingUIState, composer2, 0, 1);
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    f = 0.0f;
                }
                composer2.endReplaceGroup();
                composer2.endNode();
            } else {
                composer2.startReplaceGroup(1993899637);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new a31(state, i, 27));
        }
    }
}
