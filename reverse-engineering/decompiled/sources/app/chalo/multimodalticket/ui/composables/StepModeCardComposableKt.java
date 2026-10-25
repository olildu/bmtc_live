package app.chalo.multimodalticket.ui.composables;

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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.components.ChaloCheckBoxKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.ComposeUtilsKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.components.multimodal.ModeTicketStepInfoComposablesKt;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.multimodalticket.ui.uistates.StepTicketSectionUISpecs;
import app.chalo.multimodalticket.ui.uistates.StepTicketSectionUIState;
import app.chalo.uistate.base.UiAlignmentKt;
import app.chalo.uistate.base.UiArrangementKt;
import app.chalo.uistate.checkbox.ChaloCheckBoxUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.multimodal.StepTicketModeBasedInfoUIState;
import defpackage.i41;
import defpackage.pk0;
import defpackage.sa1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class StepModeCardComposableKt {
    public static final void a(Modifier modifier, StepTicketSectionUIState state, Composer composer, int i) {
        Composer composer2;
        Modifier modifier2;
        Modifier modifier3;
        Intrinsics.i(state, "state");
        ChaloCheckBoxUIState chaloCheckBoxUIState = state.d;
        StepTicketModeBasedInfoUIState stepTicketModeBasedInfoUIState = state.c;
        StepTicketSectionUISpecs stepTicketSectionUISpecs = state.f5971a;
        Composer composerStartRestartGroup = composer.startRestartGroup(207606405);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            modifier2 = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(207606405, i2, -1, "app.chalo.multimodalticket.ui.composables.StepModeCardComposable (StepModeCardComposable.kt:23)");
            }
            Modifier modifierC = ChaloThemeKt.c(ComposeUtilsKt.b(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), state.f, composerStartRestartGroup, 0, 6), stepTicketSectionUISpecs.f5970a);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(UiArrangementKt.a(stepTicketSectionUISpecs.c), UiAlignmentKt.b(stepTicketSectionUISpecs.b), composerStartRestartGroup, 0);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            Modifier modifierA = i41.a(RowScopeInstance.INSTANCE, modifier2, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA);
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
            pk0.v(companion, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (state.b == null) {
                composerStartRestartGroup.startReplaceGroup(-1571307386);
                composerStartRestartGroup.endReplaceGroup();
                modifier3 = null;
                composer2 = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1571307385);
                composer2 = composerStartRestartGroup;
                modifier3 = null;
                ChaloTextViewKt.a(ChaloThemeKt.c(modifier2, stepTicketSectionUISpecs.d), state.b, null, null, composer2, 0, 12);
                composer2.endReplaceGroup();
            }
            if (stepTicketModeBasedInfoUIState instanceof StepTicketModeBasedInfoUIState.Bus) {
                composer2.startReplaceGroup(-2128887386);
                ModeTicketStepInfoComposablesKt.a((StepTicketModeBasedInfoUIState.Bus) stepTicketModeBasedInfoUIState, modifier3, composer2, 0, 2);
                composer2.endReplaceGroup();
            } else {
                if (!(stepTicketModeBasedInfoUIState instanceof StepTicketModeBasedInfoUIState.Metro)) {
                    throw pk0.p(composer2, -2128890134);
                }
                composer2.startReplaceGroup(-2128883576);
                ModeTicketStepInfoComposablesKt.b((StepTicketModeBasedInfoUIState.Metro) stepTicketModeBasedInfoUIState, modifier3, composer2, 0, 2);
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            if (chaloCheckBoxUIState == null) {
                composer2.startReplaceGroup(-93145096);
            } else {
                composer2.startReplaceGroup(-93145095);
                ChaloCheckBoxKt.a(chaloCheckBoxUIState, modifier3, composer2, 0);
            }
            composer2.endReplaceGroup();
            ImageUIState imageUIState = state.e;
            if (imageUIState == null) {
                composer2.startReplaceGroup(-93048314);
            } else {
                composer2.startReplaceGroup(-93048313);
                Composer composer3 = composer2;
                CommonImageKt.a(imageUIState, null, false, composer3, 0, 6);
                composer2 = composer3;
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new sa1(i, 5, modifier2, state));
        }
    }
}
