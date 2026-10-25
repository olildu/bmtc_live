package app.chalo.home.ui.history.compose.components;

import androidx.compose.foundation.ClickableKt;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.components.ChaloGridLayoutKt;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.home.ui.history.uistate.ChaloWidgetCardSpec;
import app.chalo.home.ui.history.uistate.ChaloWidgetCardUiState;
import app.chalo.home.ui.history.uistate.bottomsheet.MyTicketBottomSheetUiState;
import app.chalo.home.ui.history.uistate.bottomsheet.ProductPurchaseBottomSheetSpec;
import app.chalo.uistate.text.TextUIState;
import defpackage.ob;
import defpackage.pk0;
import defpackage.qv0;
import defpackage.rx0;
import defpackage.sx0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "shouldRenderSpacer", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PurchaseProductBottomSheetContentKt {
    public static final void a(Modifier modifier, ChaloWidgetCardUiState uiState, Composer composer, int i) {
        Modifier modifier2;
        Intrinsics.i(uiState, "uiState");
        Object obj = uiState.f3466a;
        Composer composerStartRestartGroup = composer.startRestartGroup(579431256);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(uiState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(579431256, i2, -1, "app.chalo.home.ui.history.compose.components.ChaloWidgetCard (PurchaseProductBottomSheetContent.kt:61)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            ChaloWidgetCardSpec chaloWidgetCardSpec = (ChaloWidgetCardSpec) obj;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(uiState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new qv0(uiState, 10);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            modifier2 = companion;
            ChaloRoundedCardKt.b(ClickableKt.m299clickableoSLSa3U$default(companion, false, null, null, null, (Function0) objRememberedValue2, 15, null), ChaloThemeKt.d(chaloWidgetCardSpec.e), 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(1770752183, true, new ob(20, modifier2, chaloWidgetCardSpec, uiState), composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new rx0(i, 6, modifier2, uiState));
        }
    }

    public static final void b(Modifier modifier, MyTicketBottomSheetUiState.ProductPurchaseBottomSheetUiState uiState, Composer composer, int i) {
        Composer composer2;
        Composer composer3;
        Intrinsics.i(uiState, "uiState");
        Object obj = uiState.c;
        Composer composerStartRestartGroup = composer.startRestartGroup(1237098435);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(uiState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            modifier = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1237098435, i2, -1, "app.chalo.home.ui.history.compose.components.PurchaseProductBottomSheetContent (PurchaseProductBottomSheetContent.kt:34)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            ProductPurchaseBottomSheetSpec productPurchaseBottomSheetSpec = (ProductPurchaseBottomSheetSpec) obj;
            Modifier modifierC = ChaloThemeKt.c(modifier, productPurchaseBottomSheetSpec.f3493a);
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
            TextUIState.ChaloTextUIState chaloTextUIState = uiState.d;
            if (chaloTextUIState == null) {
                composerStartRestartGroup.startReplaceGroup(1356561451);
                composerStartRestartGroup.endReplaceGroup();
                composer3 = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceGroup(1356561452);
                composer3 = composerStartRestartGroup;
                ChaloTextViewKt.a(null, chaloTextUIState, null, null, composer3, 0, 13);
                ChaloSpacersKt.a(productPurchaseBottomSheetSpec.b, composer3, 0);
                composer3.endReplaceGroup();
            }
            Composer composer4 = composer3;
            ChaloGridLayoutKt.a(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), uiState.e.f3468a, ComposableLambdaKt.rememberComposableLambda(-891922158, true, new sx0(uiState, 2), composer3, 54), composer4, 390, 0);
            composer2 = composer4;
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
            scopeUpdateScopeEndRestartGroup.updateScope(new rx0(i, 5, modifier, uiState));
        }
    }
}
