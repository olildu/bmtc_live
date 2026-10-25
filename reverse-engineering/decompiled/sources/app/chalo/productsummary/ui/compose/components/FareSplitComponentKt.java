package app.chalo.productsummary.ui.compose.components;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
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
import app.chalo.compose.components.RowWithTwoTextKt;
import app.chalo.productsummary.ui.data.DashedLineUIState;
import app.chalo.productsummary.ui.data.FareBreakupUIState;
import app.chalo.productsummary.ui.data.PriceDetailsUIState;
import app.chalo.uistate.text.TitleSubtitleUiState;
import defpackage.ox;
import defpackage.pk0;
import defpackage.qp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FareSplitComponentKt {
    public static final void a(Modifier modifier, DashedLineUIState state, Composer composer, int i) {
        int i2;
        Intrinsics.i(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(863909112);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(state) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(863909112, i2, -1, "app.chalo.productsummary.ui.compose.components.DashedLine (FareSplitComponent.kt:51)");
            }
            boolean z = (i2 & 112) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new qp(state, 28);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            CanvasKt.Canvas(modifier, (Function1) objRememberedValue, composerStartRestartGroup, i2 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ox(modifier, state, i, 18));
        }
    }

    public static final void b(Modifier modifier, PriceDetailsUIState priceDetail, Composer composer, int i) {
        Intrinsics.i(priceDetail, "priceDetail");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1088487688);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(priceDetail) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1088487688, i2, -1, "app.chalo.productsummary.ui.compose.components.FareSplitComponent (FareSplitComponent.kt:21)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloTextViewKt.a(null, priceDetail.f8755a, null, null, composerStartRestartGroup, 0, 13);
            ChaloSpacersKt.o(composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(1557472701);
            for (FareBreakupUIState fareBreakupUIState : priceDetail.c) {
                RowWithTwoTextKt.a(fareBreakupUIState.f8751a, fareBreakupUIState.b, null, null, null, false, 0.0f, composerStartRestartGroup, 0, 124);
                ChaloSpacersKt.n(composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            DashedLineUIState dashedLineUIState = priceDetail.d;
            if (dashedLineUIState == null) {
                composerStartRestartGroup.startReplaceGroup(1037205180);
            } else {
                composerStartRestartGroup.startReplaceGroup(1037205181);
                a(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), dashedLineUIState, composerStartRestartGroup, 6);
            }
            composerStartRestartGroup.endReplaceGroup();
            TitleSubtitleUiState titleSubtitleUiState = priceDetail.b;
            if (titleSubtitleUiState == null) {
                composerStartRestartGroup.startReplaceGroup(1037368953);
            } else {
                composerStartRestartGroup.startReplaceGroup(1037368954);
                ChaloSpacersKt.n(composerStartRestartGroup, 0);
                RowWithTwoTextKt.a(titleSubtitleUiState.b, titleSubtitleUiState.c, null, null, null, false, 0.0f, composerStartRestartGroup, 0, 124);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new ox(modifier, priceDetail, i, 17));
        }
    }
}
