package app.chalo.compose.components.multimodal;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.FlowLayoutKt;
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
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.UiAlignmentKt;
import app.chalo.uistate.base.UiArrangementKt;
import app.chalo.uistate.image.ImageUIStateKt;
import app.chalo.uistate.multimodal.LineIndicatorUISpecs;
import app.chalo.uistate.multimodal.LineIndicatorUIState;
import app.chalo.uistate.multimodal.MetroLineContainerUISpecs;
import app.chalo.uistate.multimodal.MetroLineContainerUIState;
import app.chalo.uistate.multimodal.StepTicketMetroModeInfoUISpecs;
import defpackage.fc0;
import defpackage.pk0;
import defpackage.si0;
import defpackage.ug0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MetroLineContainerComposableKt {
    public static final void a(LineIndicatorUIState state, Composer composer, int i) {
        int i2;
        Intrinsics.i(state, "state");
        LineIndicatorUISpecs lineIndicatorUISpecs = state.f10042a;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1716730765);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1716730765, i2, -1, "app.chalo.compose.components.multimodal.LineIndicatorComposable (MetroLineContainerComposable.kt:60)");
            }
            BoxKt.Box(BackgroundKt.m263backgroundbw27NRU(ImageUIStateKt.a(Modifier.INSTANCE, lineIndicatorUISpecs.b), ChaloColorTokenKt.c(state.b), ChaloThemeKt.d(lineIndicatorUISpecs.f10041a)), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fc0(state, i, 18));
        }
    }

    public static final void b(StepTicketMetroModeInfoUISpecs specs, List stateList, Composer composer, int i) {
        int i2;
        Intrinsics.i(specs, "specs");
        Intrinsics.i(stateList, "stateList");
        Composer composerStartRestartGroup = composer.startRestartGroup(31024546);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(specs) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(stateList) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(31024546, i2, -1, "app.chalo.compose.components.multimodal.MetroLineContainerComposable (MetroLineContainerComposable.kt:27)");
            }
            FlowLayoutKt.FlowRow(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), UiArrangementKt.a(specs.d), UiArrangementKt.a(specs.e), UiAlignmentKt.b(specs.f), 0, 0, ComposableLambdaKt.rememberComposableLambda(-42530723, true, new si0(stateList, 0), composerStartRestartGroup, 54), composerStartRestartGroup, 1572870, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ug0(specs, stateList, i, 7));
        }
    }

    public static final void c(MetroLineContainerUIState metroLineContainerUIState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1854040570);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(metroLineContainerUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1854040570, i2, -1, "app.chalo.compose.components.multimodal.MetroLineContainerItemComposable (MetroLineContainerComposable.kt:41)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MetroLineContainerUISpecs metroLineContainerUISpecs = metroLineContainerUIState.f10044a;
            Modifier modifierC = ChaloThemeKt.c(BackgroundKt.m263backgroundbw27NRU(companion, Color.m4604copywmQWz5c$default(ChaloColorTokenKt.c(metroLineContainerUIState.b), metroLineContainerUIState.c, 0.0f, 0.0f, 0.0f, 14, null), ChaloThemeKt.d(metroLineContainerUISpecs.c)), metroLineContainerUISpecs.f10043a);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), UiAlignmentKt.b(metroLineContainerUISpecs.b), composerStartRestartGroup, 0);
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            a(metroLineContainerUIState.d, composerStartRestartGroup, 0);
            ChaloSpacersKt.v(metroLineContainerUISpecs.d, composerStartRestartGroup, 0);
            ChaloTextViewKt.a(null, metroLineContainerUIState.e, null, null, composerStartRestartGroup, 0, 13);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fc0(metroLineContainerUIState, i, 17));
        }
    }
}
