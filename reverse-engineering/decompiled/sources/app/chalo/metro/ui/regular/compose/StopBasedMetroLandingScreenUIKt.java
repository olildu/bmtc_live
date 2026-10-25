package app.chalo.metro.ui.regular.compose;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
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
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.components.ChaloGradientBackgroundKt;
import app.chalo.compose.components.ChaloRoundedBottomSheetKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.TextKt;
import app.chalo.compose.tabheader.RecentSearchesRowKt;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.metro.ui.landing.compose.MetroLandingScreenUIKt;
import app.chalo.metro.ui.landing.uistate.MetroTicketBenefitsContainerUiState;
import app.chalo.metro.ui.regular.uistate.StopBasedMetroLandingScreenBottomSheetUiStateType;
import app.chalo.metro.ui.regular.uistate.StopBasedMetroLandingScreenUISpec;
import app.chalo.metro.ui.regular.uistate.StopBasedMetroLandingScreenViewState;
import app.chalo.uistate.bottomsheet.BottomSheetRequestHandler;
import app.chalo.uistate.bottomsheet.BottomSheetUiState;
import app.chalo.uistate.components.RecentlySearchedContainerUiState;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.divider.DividerUIStateKt;
import app.chalo.uistate.fromto.FromToSelectionContainerKt;
import app.chalo.uistate.fromto.StopBasedMetroFromToSelectionContainerUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.gf;
import defpackage.h01;
import defpackage.p11;
import defpackage.pk0;
import defpackage.sx0;
import defpackage.t8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/unit/Dp;", "heightInDp", "productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class StopBasedMetroLandingScreenUIKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(Modifier modifier, StopBasedMetroLandingScreenViewState viewState, Function1 sendIntent, Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.i(viewState, "viewState");
        StopBasedMetroFromToSelectionContainerUIState stopBasedMetroFromToSelectionContainerUIState = viewState.d;
        Object obj = viewState.f5553a;
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(1872634491);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(modifier) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(viewState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1872634491, i2, -1, "app.chalo.metro.ui.regular.compose.StopBasedMetroLandingScreenContent (StopBasedMetroLandingScreenUI.kt:96)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            StopBasedMetroLandingScreenUISpec stopBasedMetroLandingScreenUISpec = (StopBasedMetroLandingScreenUISpec) obj;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = gf.b(0, null, 2, null, composerStartRestartGroup);
            }
            MutableState mutableState = (MutableState) objRememberedValue2;
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
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
            Modifier.Companion companion4 = Modifier.INSTANCE;
            boolean zChanged2 = composerStartRestartGroup.changed(density);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new p11(density, mutableState, 7);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(companion4, (Function1) objRememberedValue3);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierOnGloballyPositioned);
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
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            ChaloGradientBackgroundKt.a(BoxScopeInstance.INSTANCE, stopBasedMetroLandingScreenUISpec.b, ((Dp) mutableState.getValue()).m7292unboximpl(), null, composerStartRestartGroup, 6, 4);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            ChaloToolBarKt.b(viewState.b, null, null, composerStartRestartGroup, 0, 14);
            composer2 = composerStartRestartGroup;
            ChaloSpacersKt.a(stopBasedMetroLandingScreenUISpec.e, composer2, 0);
            if (stopBasedMetroFromToSelectionContainerUIState == null) {
                composer2.startReplaceGroup(1934373824);
            } else {
                composer2.startReplaceGroup(1934373825);
                FromToSelectionContainerKt.a(ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), stopBasedMetroLandingScreenUISpec.f), stopBasedMetroFromToSelectionContainerUIState, composer2, 0);
            }
            composer2.endReplaceGroup();
            RecentlySearchedContainerUiState recentlySearchedContainerUiState = viewState.e;
            if (recentlySearchedContainerUiState == null) {
                composer2.startReplaceGroup(1934822797);
            } else {
                composer2.startReplaceGroup(1934822798);
                RecentSearchesRowKt.a(recentlySearchedContainerUiState, composer2, 0);
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            composer2.endNode();
            DividerUIStateKt.a(null, viewState.h, composer2, 0, 1);
            MetroTicketBenefitsContainerUiState metroTicketBenefitsContainerUiState = viewState.g;
            if (metroTicketBenefitsContainerUiState == null) {
                composer2.startReplaceGroup(-1898299697);
            } else {
                composer2.startReplaceGroup(-1898299696);
                MetroLandingScreenUIKt.a(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), metroTicketBenefitsContainerUiState, composer2, 6);
            }
            composer2.endReplaceGroup();
            TextUIState.StyledTextUIState styledTextUIState = viewState.i;
            if (styledTextUIState == null) {
                composer2.startReplaceGroup(-1898108892);
            } else {
                composer2.startReplaceGroup(-1898108891);
                Modifier modifierC = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), stopBasedMetroLandingScreenUISpec.h);
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getCenterHorizontally(), composer2, 48);
                long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                int i6 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierC);
                Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
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
                pk0.v(companion3, composerM3915constructorimpl4, measurePolicyColumnMeasurePolicy3, composerM3915constructorimpl4, currentCompositionLocalMap4);
                Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl4, Integer.valueOf(i6), composerM3915constructorimpl4));
                TextKt.b(null, styledTextUIState, composer2, 0, 1);
                composer2.endNode();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new h01(modifier, viewState, sendIntent, i, 17));
        }
    }

    public static final void b(StopBasedMetroLandingScreenViewState viewState, SheetState modalBottomSheetState, Function1 sendIntent, Composer composer, int i) {
        int i2;
        Continuation continuation;
        Intrinsics.i(viewState, "viewState");
        StopBasedMetroLandingScreenBottomSheetUiStateType stopBasedMetroLandingScreenBottomSheetUiStateType = viewState.f;
        Intrinsics.i(modalBottomSheetState, "modalBottomSheetState");
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1800088809);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modalBottomSheetState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 256 : 128;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1800088809, i3, -1, "app.chalo.metro.ui.regular.compose.StopBasedMetroLandingScreenUI (StopBasedMetroLandingScreenUI.kt:42)");
            }
            LoadingDialogUIState loadingDialogUIState = viewState.c;
            if (loadingDialogUIState == null) {
                composerStartRestartGroup.startReplaceGroup(516179392);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                t8.m(composerStartRestartGroup, 516179393, loadingDialogUIState, composerStartRestartGroup, 0);
            }
            BottomSheetUiState f5551a = stopBasedMetroLandingScreenBottomSheetUiStateType.getF5551a();
            a(ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), viewState, sendIntent, composerStartRestartGroup, ((i3 << 3) & 112) | (i3 & 896));
            if (stopBasedMetroLandingScreenBottomSheetUiStateType.equals(StopBasedMetroLandingScreenBottomSheetUiStateType.None.b)) {
                continuation = null;
                composerStartRestartGroup.startReplaceGroup(514172267);
            } else {
                composerStartRestartGroup.startReplaceGroup(516641696);
                BottomSheetRequestHandler bottomSheetRequestHandler = f5551a.b.g;
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(bottomSheetRequestHandler);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new StopBasedMetroLandingScreenUIKt$StopBasedMetroLandingScreenUI$2$1(0, bottomSheetRequestHandler, BottomSheetRequestHandler.class, "onDismissRequest", "onDismissRequest()V", 0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                continuation = null;
                ChaloRoundedBottomSheetKt.a(modalBottomSheetState, (Function0) ((KFunction) objRememberedValue), false, false, false, ComposableLambdaKt.rememberComposableLambda(1583877208, true, new sx0(viewState, 15), composerStartRestartGroup, 54), composerStartRestartGroup, 196608 | ((i3 >> 3) & 14), 28);
            }
            composerStartRestartGroup.endReplaceGroup();
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(viewState) | ((i3 & 112) == 32);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new StopBasedMetroLandingScreenUIKt$StopBasedMetroLandingScreenUI$4$1(viewState, modalBottomSheetState, continuation);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(stopBasedMetroLandingScreenBottomSheetUiStateType, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h01(i, 16, viewState, modalBottomSheetState, sendIntent));
        }
    }
}
