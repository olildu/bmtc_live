package app.chalo.tripreceipt.tripreceiptnew.ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.tripreceipt.tripreceiptnew.RideReceiptComponent;
import app.chalo.tripreceipt.tripreceiptnew.RideReceiptViewState;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import defpackage.pk0;
import defpackage.t8;
import defpackage.vw0;
import defpackage.yu0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/tripreceipt/tripreceiptnew/RideReceiptViewState;", "viewState", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RideReceiptMainScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(RideReceiptComponent rideReceiptComponent, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1722608545);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(rideReceiptComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1722608545, i2, -1, "app.chalo.tripreceipt.tripreceiptnew.ui.RideReceiptMainScreen (RideReceiptMainScreen.kt:26)");
            }
            b((RideReceiptViewState) SubscribeAsStateKt.a(rideReceiptComponent.t0(), composerStartRestartGroup).getValue(), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new yu0(rideReceiptComponent, i, 27));
        }
    }

    public static final void b(RideReceiptViewState rideReceiptViewState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1971696686);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(rideReceiptViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1971696686, i2, -1, "app.chalo.tripreceipt.tripreceiptnew.ui.RideReceiptMainScreen (RideReceiptMainScreen.kt:33)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            ToolbarUIState toolbarUIState = rideReceiptViewState.b;
            LoadingDialogUIState loadingDialogUIState = rideReceiptViewState.g;
            ChaloToolBarKt.b(toolbarUIState, null, null, composerStartRestartGroup, 0, 14);
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(rideReceiptViewState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new vw0(rideReceiptViewState, 29);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            LazyDslKt.LazyColumn(modifierFillMaxSize$default2, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 6, TypedValues.PositionType.TYPE_POSITION_TYPE);
            if (loadingDialogUIState != null) {
                t8.m(composerStartRestartGroup, -202156600, loadingDialogUIState, composerStartRestartGroup, 0);
            } else {
                composerStartRestartGroup.startReplaceGroup(-204479430);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new yu0(rideReceiptViewState, i, 28));
        }
    }
}
