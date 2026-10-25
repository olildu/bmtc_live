package app.chalo.productbooking.pickroutelocation.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.components.ChaloSearchBarComposableUIKt;
import app.chalo.compose.components.ChaloSnackbarKt;
import app.chalo.productbooking.pickroutelocation.PickRouteLocationComponent;
import app.chalo.productbooking.pickroutelocation.PickRouteLocationUiSpecs;
import app.chalo.productbooking.pickroutelocation.PickRouteLocationViewState;
import app.chalo.productbooking.pickroutelocation.SearchScreenLayoutUiType;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.UiAlignmentKt;
import app.chalo.uistate.dialog.ConfirmationDialogUiState;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.snackbar.SnackbarUIState;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import defpackage.dd;
import defpackage.eq0;
import defpackage.fk0;
import defpackage.ms;
import defpackage.pk0;
import defpackage.t8;
import defpackage.xs;
import defpackage.ym0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0004²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"Lapp/chalo/productbooking/pickroutelocation/PickRouteLocationViewState;", "viewState", "", "focusOnSearchField", "productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PickRouteLocationComposableKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(PickRouteLocationComponent pickRouteLocationComponent, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1045251917);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(pickRouteLocationComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1045251917, i2, -1, "app.chalo.productbooking.pickroutelocation.ui.PickRouteLocationComposable (PickRouteLocationComposable.kt:36)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(pickRouteLocationComponent.t0(), composerStartRestartGroup);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = xs.f(composerStartRestartGroup);
            }
            FocusRequester focusRequester = (FocusRequester) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState = (MutableState) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.f17583a, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue3;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(pickRouteLocationComponent);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new PickRouteLocationComposableKt$PickRouteLocationComposable$1$1(pickRouteLocationComponent, mutableState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            EffectsKt.LaunchedEffect(pickRouteLocationComponent, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, i2 & 14);
            Boolean bool = (Boolean) mutableState.getValue();
            bool.booleanValue();
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(coroutineScope);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new PickRouteLocationComposableKt$PickRouteLocationComposable$2$1(focusRequester, coroutineScope, mutableState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            EffectsKt.LaunchedEffect(bool, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 0);
            b((PickRouteLocationViewState) mutableStateA.getValue(), focusRequester, composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fk0(pickRouteLocationComponent, i, 26));
        }
    }

    public static final void b(PickRouteLocationViewState viewState, FocusRequester focusRequester, Composer composer, int i) {
        int i2;
        Intrinsics.i(viewState, "viewState");
        PickRouteLocationUiSpecs pickRouteLocationUiSpecs = viewState.f8287a;
        Intrinsics.i(focusRequester, "focusRequester");
        Composer composerStartRestartGroup = composer.startRestartGroup(-581485930);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(focusRequester) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-581485930, i2, -1, "app.chalo.productbooking.pickroutelocation.ui.PickRouteLocationContent (PickRouteLocationComposable.kt:70)");
            }
            LoadingDialogUIState loadingDialogUIState = viewState.b;
            if (loadingDialogUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-1444101631);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                t8.m(composerStartRestartGroup, -1444101630, loadingDialogUIState, composerStartRestartGroup, 0);
            }
            ConfirmationDialogUiState confirmationDialogUiState = viewState.f;
            if (confirmationDialogUiState == null) {
                composerStartRestartGroup.startReplaceGroup(-1444009220);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                dd.l(composerStartRestartGroup, -1444009219, confirmationDialogUiState, composerStartRestartGroup, 0);
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(BackgroundKt.m264backgroundbw27NRU$default(companion, ChaloColorTokenKt.c(pickRouteLocationUiSpecs.f8286a), null, 2, null), 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), UiAlignmentKt.a(pickRouteLocationUiSpecs.b), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
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
            Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(companion, focusRequester);
            int i5 = i2 & 14;
            boolean z = i5 == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ym0(viewState, 25);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ChaloSearchBarComposableUIKt.a(FocusChangedModifierKt.onFocusChanged(modifierFocusRequester, (Function1) objRememberedValue), viewState.c, composerStartRestartGroup, 0);
            c(viewState, composerStartRestartGroup, i5);
            composerStartRestartGroup.endNode();
            SnackbarUIState snackbarUIState = viewState.e;
            if (snackbarUIState == null) {
                composerStartRestartGroup.startReplaceGroup(512378335);
            } else {
                composerStartRestartGroup.startReplaceGroup(512378336);
                d(0, composerStartRestartGroup, ZIndexModifierKt.zIndex(boxScopeInstance.align(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), UiAlignmentKt.c(pickRouteLocationUiSpecs.c)), 10.0f), snackbarUIState);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new eq0(viewState, focusRequester, i, 6));
        }
    }

    public static final void c(PickRouteLocationViewState viewState, Composer composer, int i) {
        int i2;
        Intrinsics.i(viewState, "viewState");
        SearchScreenLayoutUiType searchScreenLayoutUiType = viewState.d;
        Composer composerStartRestartGroup = composer.startRestartGroup(-575285285);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-575285285, i2, -1, "app.chalo.productbooking.pickroutelocation.ui.PickRouteLocationLayout (PickRouteLocationComposable.kt:112)");
            }
            if (searchScreenLayoutUiType instanceof SearchScreenLayoutUiType.RemoteSearchItems) {
                composerStartRestartGroup.startReplaceGroup(-1404244048);
                RouteSearchItemComposableKt.a(((SearchScreenLayoutUiType.RemoteSearchItems) searchScreenLayoutUiType).f8292a, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (searchScreenLayoutUiType instanceof SearchScreenLayoutUiType.RecentRouteSearches) {
                composerStartRestartGroup.startReplaceGroup(-1404064155);
                SearchScreenLayoutUiType.RecentRouteSearches recentRouteSearches = (SearchScreenLayoutUiType.RecentRouteSearches) searchScreenLayoutUiType;
                RouteSearchItemComposableKt.c(recentRouteSearches.f8290a, recentRouteSearches.b, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (searchScreenLayoutUiType instanceof SearchScreenLayoutUiType.RemoteSearchEmptyResult) {
                composerStartRestartGroup.startReplaceGroup(-1403810110);
                RouteSearchItemComposableKt.b(((SearchScreenLayoutUiType.RemoteSearchEmptyResult) searchScreenLayoutUiType).f8291a, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (searchScreenLayoutUiType != null) {
                    throw pk0.p(composerStartRestartGroup, 1201625480);
                }
                composerStartRestartGroup.startReplaceGroup(-1403696123);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fk0(viewState, i, 27));
        }
    }

    public static final void d(int i, Composer composer, Modifier modifier, SnackbarUIState snackbarUIState) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1866958914);
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
                ComposerKt.traceEventStart(1866958914, i2, -1, "app.chalo.productbooking.pickroutelocation.ui.PickRouteLocationSnackBar (PickRouteLocationComposable.kt:137)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new ms(modifier, snackbarUIState, i, 3));
        }
    }
}
