package app.chalo.productactivation.ui;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import app.chalo.compose.components.ChaloAlertTextKt;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.FromAndToStopDetailViewKt;
import app.chalo.compose.components.TextKt;
import app.chalo.compose.components.TextWithSpecialFeaturesTagsKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.divider.TicketPunchDividerKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.ShapedContentUIState;
import app.chalo.productactivation.ui.uistate.ActivationTicketContainerUISpecs;
import app.chalo.productactivation.ui.uistate.ActivationTicketContainerUIState;
import app.chalo.productactivation.ui.uistate.ActivationTicketFooterUISpecs;
import app.chalo.productactivation.ui.uistate.ActivationTicketFooterUIState;
import app.chalo.productactivation.ui.uistate.ActivationTicketRouteDetailsHeader;
import app.chalo.productactivation.ui.uistate.ActivationTicketRouteDetailsUISpecs;
import app.chalo.productactivation.ui.uistate.ActivationTicketRouteDetailsUIState;
import app.chalo.productactivation.ui.uistate.ActivationTicketUIState;
import app.chalo.productactivation.ui.uistate.StepBasedRouteDetailsSectionUIState;
import app.chalo.shape.TicketShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.UiArrangement;
import app.chalo.uistate.base.UiArrangementKt;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.AlertTextWithIconUiState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.TextWithSpecialFeaturesTagsUIState;
import app.chalo.validationsdk.vehiclebasedvalidation.ui.TicketCardContentSpec;
import defpackage.b0;
import defpackage.b3;
import defpackage.c0;
import defpackage.e0;
import defpackage.g0;
import defpackage.gf;
import defpackage.h0;
import defpackage.pk0;
import defpackage.r1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ActivationTicketComposablesKt {
    public static final void a(ActivationTicketContainerUIState activationTicketContainerUIState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1866327656);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(activationTicketContainerUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1866327656, i2, -1, "app.chalo.productactivation.ui.ActivationTicketDetailsContainer (ActivationTicketComposables.kt:97)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            ActivationTicketContainerUISpecs activationTicketContainerUISpecs = activationTicketContainerUIState.f8058a;
            ActivationTicketRouteDetailsUIState activationTicketRouteDetailsUIState = activationTicketContainerUIState.b;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(ChaloThemeKt.c(companion, activationTicketContainerUISpecs.f8057a), 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            if (activationTicketRouteDetailsUIState != null) {
                composerStartRestartGroup.startReplaceGroup(1659453605);
                c(activationTicketRouteDetailsUIState, null, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (activationTicketContainerUIState.c != null) {
                    composerStartRestartGroup.startReplaceGroup(1659595926);
                    ChaloTextViewKt.a(null, activationTicketContainerUIState.c, null, null, composerStartRestartGroup, 0, 13);
                } else {
                    composerStartRestartGroup.startReplaceGroup(1655199940);
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            TextUIState.ChaloTextUIState chaloTextUIState = activationTicketContainerUIState.d;
            if (chaloTextUIState == null) {
                composerStartRestartGroup.startReplaceGroup(1659723490);
            } else {
                composerStartRestartGroup.startReplaceGroup(1659723491);
                ChaloTextViewKt.a(ChaloThemeKt.c(companion, activationTicketContainerUIState.f8058a.b), chaloTextUIState, null, null, composerStartRestartGroup, 0, 12);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new e0(activationTicketContainerUIState, i, 1));
        }
    }

    public static final void b(ActivationTicketFooterUIState activationTicketFooterUIState, Function1 function1, Composer composer, int i) {
        int i2;
        ComposeUiNode.Companion companion;
        Object obj;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1455797439);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(activationTicketFooterUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1455797439, i3, -1, "app.chalo.productactivation.ui.ActivationTicketFooter (ActivationTicketComposables.kt:195)");
            }
            ActivationTicketFooterUISpecs activationTicketFooterUISpecs = activationTicketFooterUIState.f8060a;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            TicketPunchDividerKt.a(PaddingKt.m786paddingVpY3zN4$default(companion2, 0.0f, activationTicketFooterUISpecs.f8059a, 1, null), null, 0.0f, 0.0f, composerStartRestartGroup, 0, 14);
            ChaloSpacersKt.b(activationTicketFooterUISpecs.f8059a, composerStartRestartGroup, 0);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            boolean z = (i3 & 112) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new g0(function1, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierFillMaxWidth$default, (Function1) objRememberedValue);
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierOnGloballyPositioned);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            AlertTextWithIconUiState alertTextWithIconUiState = activationTicketFooterUIState.b;
            if (alertTextWithIconUiState == null) {
                composerStartRestartGroup.startReplaceGroup(1572253527);
            } else {
                composerStartRestartGroup.startReplaceGroup(1572253528);
                ChaloAlertTextKt.a(null, alertTextWithIconUiState, composerStartRestartGroup, 0);
                ChaloSpacersKt.b(ChaloThemeHelper.a().e, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            AlertTextWithIconUiState alertTextWithIconUiState2 = activationTicketFooterUIState.c;
            if (alertTextWithIconUiState2 == null) {
                composerStartRestartGroup.startReplaceGroup(1572423159);
            } else {
                composerStartRestartGroup.startReplaceGroup(1572423160);
                ChaloAlertTextKt.a(null, alertTextWithIconUiState2, composerStartRestartGroup, 0);
                ChaloSpacersKt.n(composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            TextUIState.StyledTextUIState styledTextUIState = activationTicketFooterUIState.d;
            if (styledTextUIState == null) {
                composerStartRestartGroup.startReplaceGroup(1572559683);
                composerStartRestartGroup.endReplaceGroup();
                obj = null;
                companion = companion4;
            } else {
                composerStartRestartGroup.startReplaceGroup(1572559684);
                companion = companion4;
                obj = null;
                TextKt.c(styledTextUIState, null, null, null, composerStartRestartGroup, 0, 14);
                ChaloSpacersKt.n(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, obj);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(UiArrangementKt.a(activationTicketFooterUISpecs.b), companion3.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
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
            pk0.v(companion, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
            composerStartRestartGroup.startReplaceGroup(-1513150630);
            Iterator it = activationTicketFooterUIState.e.iterator();
            while (it.hasNext()) {
                ChaloFilledButtonKt.a(6, 0, composerStartRestartGroup, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, obj), (ButtonUIState) it.next());
            }
            composerStartRestartGroup.endReplaceGroup();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new b0(activationTicketFooterUIState, function1, i, 3));
        }
    }

    public static final void c(ActivationTicketRouteDetailsUIState state, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.i(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(633017265);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            modifier = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(633017265, i2, -1, "app.chalo.productactivation.ui.ActivationTicketRouteDetails (ActivationTicketComposables.kt:126)");
            }
            ActivationTicketRouteDetailsUISpecs activationTicketRouteDetailsUISpecs = state.f8064a;
            ActivationTicketRouteDetailsHeader activationTicketRouteDetailsHeader = state.b;
            if (activationTicketRouteDetailsHeader instanceof ActivationTicketRouteDetailsHeader.SingleTicket) {
                composerStartRestartGroup.startReplaceGroup(-983770725);
                f(activationTicketRouteDetailsUISpecs, (ActivationTicketRouteDetailsHeader.SingleTicket) activationTicketRouteDetailsHeader, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(activationTicketRouteDetailsHeader instanceof ActivationTicketRouteDetailsHeader.MultipleLegsTicket)) {
                    throw pk0.p(composerStartRestartGroup, -1555759074);
                }
                composerStartRestartGroup.startReplaceGroup(-983616376);
                e(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), (ActivationTicketRouteDetailsHeader.MultipleLegsTicket) activationTicketRouteDetailsHeader, composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.startReplaceGroup(-1555746175);
            TextUIState.ChaloTextUIState chaloTextUIState = state.e;
            composer2 = composerStartRestartGroup;
            TextUIState.ChaloTextUIState chaloTextUIState2 = state.f;
            if (chaloTextUIState != null && chaloTextUIState2 != null) {
                d(ChaloThemeKt.c(modifier, activationTicketRouteDetailsUISpecs.b), state.c, state.d, chaloTextUIState, chaloTextUIState2, composer2, 0);
            }
            composer2.endReplaceGroup();
            StepBasedRouteDetailsSectionUIState stepBasedRouteDetailsSectionUIState = state.g;
            if (stepBasedRouteDetailsSectionUIState == null) {
                composer2.startReplaceGroup(-983055308);
            } else {
                composer2.startReplaceGroup(-983055307);
                StepBasedRouteDetailsSectionComposableKt.a(stepBasedRouteDetailsSectionUIState, composer2, 0);
            }
            composer2.endReplaceGroup();
            TextUIState.ChaloTextUIState chaloTextUIState3 = state.h;
            if (chaloTextUIState3 == null) {
                composer2.startReplaceGroup(-982937043);
            } else {
                composer2.startReplaceGroup(-982937042);
                ChaloSpacersKt.b(activationTicketRouteDetailsUISpecs.c, composer2, 0);
                ChaloTextViewKt.a(null, chaloTextUIState3, null, null, composer2, 0, 13);
                composer2 = composer2;
            }
            composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new b0(state, modifier, i, 4));
        }
    }

    public static final void d(Modifier modifier, ShapedContentUIState shapedContentUIState, ShapedContentUIState shapedContentUIState2, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, Composer composer, int i) {
        int i2;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        TextUIState.ChaloTextUIState chaloTextUIState4;
        Composer composerStartRestartGroup = composer.startRestartGroup(1924334517);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(shapedContentUIState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(shapedContentUIState2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            chaloTextUIState3 = chaloTextUIState;
            i2 |= composerStartRestartGroup.changed(chaloTextUIState3) ? 2048 : 1024;
        } else {
            chaloTextUIState3 = chaloTextUIState;
        }
        if ((i & 24576) == 0) {
            chaloTextUIState4 = chaloTextUIState2;
            i2 |= composerStartRestartGroup.changed(chaloTextUIState4) ? 16384 : 8192;
        } else {
            chaloTextUIState4 = chaloTextUIState2;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1924334517, i2, -1, "app.chalo.productactivation.ui.FromToStopIconComposable (ActivationTicketComposables.kt:167)");
            }
            Modifier modifierHeight = IntrinsicKt.height(modifier, IntrinsicSize.Min);
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierHeight);
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            FromAndToStopDetailViewKt.f(0.0f, shapedContentUIState, shapedContentUIState2, ChaloThemeHelper.a().b, ChaloColorTokenKt.c(ChaloColorToken.ShadyGray.f9851a), composerStartRestartGroup, i2 & 1008);
            composerStartRestartGroup = composerStartRestartGroup;
            ChaloSpacersKt.w(composerStartRestartGroup, 0);
            Arrangement.HorizontalOrVertical horizontalOrVerticalA = UiArrangementKt.a(UiArrangement.HorizontalOrVertical.Center.f9890a);
            Modifier.Companion companion3 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalA, companion.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion3);
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
            pk0.v(companion2, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.c(chaloTextUIState3, null, null, null, composerStartRestartGroup, (i2 >> 9) & 14, 14);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion3, ChaloTheme.b(composerStartRestartGroup, 0).f), composerStartRestartGroup, 0);
            TextKt.c(chaloTextUIState4, null, null, null, composerStartRestartGroup, (i2 >> 12) & 14, 14);
            if (r1.k(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h0(modifier, shapedContentUIState, shapedContentUIState2, chaloTextUIState, chaloTextUIState2, i, 0));
        }
    }

    public static final void e(Modifier modifier, ActivationTicketRouteDetailsHeader.MultipleLegsTicket state, Composer composer, int i) {
        int i2;
        Intrinsics.i(state, "state");
        ArrayList arrayList = state.f8061a;
        Composer composerStartRestartGroup = composer.startRestartGroup(-380083619);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        int i3 = 0;
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-380083619, i2, -1, "app.chalo.productactivation.ui.ModeIconsRowComposable (ActivationTicketComposables.kt:262)");
            }
            Modifier modifierHorizontalScroll$default = ScrollKt.horizontalScroll$default(modifier, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierHorizontalScroll$default);
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
            composerStartRestartGroup.startReplaceGroup(-1462540999);
            int size = arrayList.size();
            int i5 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                int i6 = i3 + 1;
                int i7 = i5 + 1;
                if (i5 < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                CommonImageKt.a((ImageUIState) obj, null, false, composerStartRestartGroup, 0, 6);
                if (CollectionsKt.K(arrayList) != i5) {
                    composerStartRestartGroup.startReplaceGroup(482691160);
                    CommonImageKt.a(state.b, ChaloThemeKt.c(Modifier.INSTANCE, state.c), false, composerStartRestartGroup, 0, 4);
                } else {
                    composerStartRestartGroup.startReplaceGroup(473278878);
                }
                composerStartRestartGroup.endReplaceGroup();
                i3 = i6;
                i5 = i7;
            }
            if (b3.t(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new b0(i, 5, modifier, state));
        }
    }

    public static final void f(ActivationTicketRouteDetailsUISpecs specs, ActivationTicketRouteDetailsHeader.SingleTicket headerUIState, Composer composer, int i) {
        int i2;
        Intrinsics.i(specs, "specs");
        Intrinsics.i(headerUIState, "headerUIState");
        Composer composerStartRestartGroup = composer.startRestartGroup(1947203803);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(specs) : composerStartRestartGroup.changedInstance(specs) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(headerUIState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1947203803, i2, -1, "app.chalo.productactivation.ui.SingleTicketRouteDetailsHeaderComposable (ActivationTicketComposables.kt:246)");
            }
            ImageUIState imageUIState = headerUIState.f8062a;
            TextWithSpecialFeaturesTagsUIState textWithSpecialFeaturesTagsUIState = headerUIState.b;
            if (textWithSpecialFeaturesTagsUIState != null) {
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i3 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                CommonImageKt.a(imageUIState, null, false, composerStartRestartGroup, 0, 6);
                TextWithSpecialFeaturesTagsKt.a(textWithSpecialFeaturesTagsUIState, ChaloThemeKt.c(companion, specs.f8063a), composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endNode();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new b0(specs, headerUIState, i, 6));
        }
    }

    public static final void g(Modifier modifier, ActivationTicketUIState activationTicketUIState, Composer composer, int i) {
        Modifier modifier2;
        Object obj = activationTicketUIState.b;
        Object obj2 = activationTicketUIState.f8065a;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1961469471);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(activationTicketUIState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            modifier2 = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1961469471, i2, -1, "app.chalo.productactivation.ui.TicketCardUi (ActivationTicketComposables.kt:54)");
            }
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = gf.b(0, null, 2, null, composerStartRestartGroup);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            boolean zChanged = composerStartRestartGroup.changed(obj2);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj2);
            } else {
                obj2 = objRememberedValue2;
            }
            boolean zChanged2 = composerStartRestartGroup.changed(obj);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue3;
            }
            TicketCardContentSpec ticketCardContentSpec = (TicketCardContentSpec) obj;
            ChaloPadding chaloPadding = ticketCardContentSpec.f10737a;
            boolean zChanged3 = composerStartRestartGroup.changed(chaloPadding.d);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = Dp.m7276boximpl(Dp.m7278constructorimpl(chaloPadding.d + ticketCardContentSpec.b));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            ChaloRoundedCardKt.b(SizeKt.fillMaxWidth$default(ChaloThemeKt.c(modifier2, chaloPadding), 0.0f, 1, null), new TicketShape(ChaloThemeHelper.a().g, Dp.m7278constructorimpl(((Dp) mutableState.getValue()).m7292unboximpl() + ((Dp) objRememberedValue4).m7292unboximpl()), ChaloThemeHelper.a().f), 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(-1393506176, true, new c0(ticketCardContentSpec, activationTicketUIState, density, mutableState, 1), composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new b0(i, 2, modifier2, activationTicketUIState));
        }
    }
}
