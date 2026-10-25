package app.chalo.reportproblem;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.core.app.FrameMetricsAggregator;
import app.chalo.compose.BackHandlerKt;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.components.ChaloSnackbarKt;
import app.chalo.uistate.dialog.ConfirmationDialogUiState;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.snackbar.SnackbarUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import defpackage.dd;
import defpackage.pk0;
import defpackage.t8;
import defpackage.vw0;
import defpackage.x00;
import defpackage.y5;
import defpackage.yu0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/reportproblem/ReportProblemViewState;", "viewState", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ReportProblemScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(ReportProblemComponent reportProblemComponent, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-884068195);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(reportProblemComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-884068195, i2, -1, "app.chalo.reportproblem.ReportProblemScreen (ReportProblemScreen.kt:29)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(reportProblemComponent.t0(), composerStartRestartGroup);
            boolean zChanged = composerStartRestartGroup.changed(mutableStateA);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new y5(mutableStateA, 19);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            BackHandlerKt.a(false, (Function0) objRememberedValue, 0, 0, composerStartRestartGroup, 3);
            b((ReportProblemViewState) mutableStateA.getValue(), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new yu0(reportProblemComponent, i, 25));
        }
    }

    public static final void b(ReportProblemViewState reportProblemViewState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1156050315);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(reportProblemViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1156050315, i2, -1, "app.chalo.reportproblem.ReportProblemScreenContent (ReportProblemScreen.kt:44)");
            }
            LoadingDialogUIState loadingDialogUIState = reportProblemViewState.f9032a;
            if (loadingDialogUIState == null) {
                composerStartRestartGroup.startReplaceGroup(1447905026);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                t8.m(composerStartRestartGroup, 1447905027, loadingDialogUIState, composerStartRestartGroup, 0);
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            ToolbarUIState toolbarUIState = reportProblemViewState.b;
            if (toolbarUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-204101674);
            } else {
                composerStartRestartGroup.startReplaceGroup(-204101673);
                ChaloToolBarKt.b(toolbarUIState, null, null, composerStartRestartGroup, 0, 14);
            }
            composerStartRestartGroup.endReplaceGroup();
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(reportProblemViewState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new vw0(reportProblemViewState, 27);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 0, FrameMetricsAggregator.EVERY_DURATION);
            composerStartRestartGroup.endNode();
            SnackbarUIState snackbarUIState = reportProblemViewState.f;
            if (snackbarUIState == null) {
                composerStartRestartGroup.startReplaceGroup(1449012067);
            } else {
                composerStartRestartGroup.startReplaceGroup(1449012068);
                c(snackbarUIState, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            ConfirmationDialogUiState confirmationDialogUiState = reportProblemViewState.d;
            if (confirmationDialogUiState == null) {
                composerStartRestartGroup.startReplaceGroup(1449087583);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                dd.l(composerStartRestartGroup, 1449087584, confirmationDialogUiState, composerStartRestartGroup, 0);
            }
            ConfirmationDialogUiState confirmationDialogUiState2 = reportProblemViewState.e;
            if (confirmationDialogUiState2 == null) {
                composerStartRestartGroup.startReplaceGroup(1449167935);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                dd.l(composerStartRestartGroup, 1449167936, confirmationDialogUiState2, composerStartRestartGroup, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new yu0(reportProblemViewState, i, 26));
        }
    }

    public static final void c(SnackbarUIState snackbarUIState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1596388828);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(snackbarUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1596388828, i2, -1, "app.chalo.reportproblem.ReportProblemSnackBar (ReportProblemScreen.kt:80)");
            }
            Alignment bottomCenter = Alignment.INSTANCE.getBottomCenter();
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(bottomCenter, false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ChaloSnackbarKt.b(snackbarUIState, null, composerStartRestartGroup, i2 & 14, 2);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new x00(snackbarUIState, i, 4));
        }
    }
}
