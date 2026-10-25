package app.chalo.premiumbus.ui.productselection;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Density;
import app.chalo.compose.StandardErrorScreenKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.premiumbus.ui.productselection.PremiumBusProductSelectionScreenKt;
import app.chalo.premiumbus.ui.productselection.compose.uistate.PremiumBusProductSelectionToolBarTitleUIState;
import app.chalo.premiumbus.ui.productselection.compose.uistate.PremiumBusProductSelectionToolBarUIState;
import app.chalo.premiumbus.ui.productselection.compose.uistate.PremiumBusProductSelectionViewState;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.error.StandardErrorScreenUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.toolbar.ToolbarActionsUIState;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.dq;
import defpackage.i41;
import defpackage.kn0;
import defpackage.pk0;
import defpackage.sm;
import defpackage.t8;
import defpackage.wm0;
import defpackage.za0;
import defpackage.zr0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/productselection/compose/uistate/PremiumBusProductSelectionViewState;", RemoteConfigConstants.ResponseFieldKey.STATE, "productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusProductSelectionScreenKt {
    public static final void a(final PremiumBusProductSelectionViewState state, final PremiumBusProductSelectionComponent premiumBusProductSelectionComponent, Composer composer, final int i) {
        int i2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function2<? super Composer, ? super Integer, Unit> function2;
        Intrinsics.i(state, "state");
        StandardErrorScreenUIState.ErrorWithMsgAndRetry errorWithMsgAndRetry = state.g;
        Composer composerStartRestartGroup = composer.startRestartGroup(-452246832);
        int currentMarker = composerStartRestartGroup.getCurrentMarker();
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(premiumBusProductSelectionComponent) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-452246832, i2, -1, "app.chalo.premiumbus.ui.productselection.PremiumBusProductSelectionScreenContent (PremiumBusProductSelectionScreen.kt:52)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ChaloColorTokenKt.c(state.f7709a.e), null, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM264backgroundbw27NRU$default);
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
            composerStartRestartGroup.startReplaceGroup(699953404);
            b(state.b, composerStartRestartGroup, 0);
            if (errorWithMsgAndRetry != null) {
                composerStartRestartGroup.startReplaceGroup(700052293);
                StandardErrorScreenKt.c(errorWithMsgAndRetry, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), composerStartRestartGroup, 48, 0);
                composerStartRestartGroup.endToMarker(currentMarker);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final int i4 = 0;
                function2 = new Function2() { // from class: ou0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i5 = i4;
                        Composer composer2 = (Composer) obj;
                        ((Integer) obj2).intValue();
                        switch (i5) {
                            case 0:
                                PremiumBusProductSelectionScreenKt.a(state, premiumBusProductSelectionComponent, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                break;
                            default:
                                PremiumBusProductSelectionScreenKt.a(state, premiumBusProductSelectionComponent, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
            } else {
                composerStartRestartGroup.startReplaceGroup(697383720);
                composerStartRestartGroup.endReplaceGroup();
                LoadingDialogUIState loadingDialogUIState = state.c;
                if (loadingDialogUIState == null) {
                    composerStartRestartGroup.startReplaceGroup(700217677);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    t8.m(composerStartRestartGroup, 700217678, loadingDialogUIState, composerStartRestartGroup, 0);
                }
                c(dq.a(columnScopeInstance, companion, 1.0f, false, 2, null), state, premiumBusProductSelectionComponent, composerStartRestartGroup, (i2 << 3) & 1008);
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup.updateScope(function2);
        }
        composerStartRestartGroup.skipToGroupEnd();
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i5 = 1;
            function2 = new Function2() { // from class: ou0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = i5;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).intValue();
                    switch (i6) {
                        case 0:
                            PremiumBusProductSelectionScreenKt.a(state, premiumBusProductSelectionComponent, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                        default:
                            PremiumBusProductSelectionScreenKt.a(state, premiumBusProductSelectionComponent, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.f17538a;
                }
            };
            scopeUpdateScopeEndRestartGroup.updateScope(function2);
        }
    }

    public static final void b(PremiumBusProductSelectionToolBarUIState state, Composer composer, int i) {
        int i2;
        RowScopeInstance rowScopeInstance;
        Modifier.Companion companion;
        Modifier.Companion companion2;
        Intrinsics.i(state, "state");
        ChaloPadding chaloPadding = state.j;
        PremiumBusProductSelectionToolBarTitleUIState premiumBusProductSelectionToolBarTitleUIState = state.f7708a;
        Composer composerStartRestartGroup = composer.startRestartGroup(1802849417);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(state) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1802849417, i2, -1, "app.chalo.premiumbus.ui.productselection.PremiumBusProductSelectionToolBar (PremiumBusProductSelectionScreen.kt:136)");
            }
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion4.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion5.getConstructor();
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
            pk0.v(companion5, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierM814height3ABfNKs = SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(BackgroundKt.m264backgroundbw27NRU$default(companion3, ChaloColorTokenKt.c(state.g), null, 2, null), 0.0f, 1, null), state.i);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion4.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM814height3ABfNKs);
            Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
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
            pk0.v(companion5, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-2113345365);
            ImageUIState imageUIState = state.c;
            boolean z = (i2 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new kn0(state, 23);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, null, ComposableLambdaKt.rememberComposableLambda(2011990231, true, new sm(imageUIState, 2), composerStartRestartGroup, 54), composerStartRestartGroup, 1572864, 62);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endReplaceGroup();
            ChaloSpacersKt.w(composerStartRestartGroup, 0);
            if (premiumBusProductSelectionToolBarTitleUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-1088930801);
                composerStartRestartGroup.endReplaceGroup();
                companion = companion3;
                rowScopeInstance = rowScopeInstance2;
            } else {
                float f = premiumBusProductSelectionToolBarTitleUIState.c;
                composerStartRestartGroup.startReplaceGroup(-1088930800);
                rowScopeInstance = rowScopeInstance2;
                companion = companion3;
                Modifier modifierC = ChaloThemeKt.c(i41.a(rowScopeInstance2, companion3, 1.0f, false, 2, null), chaloPadding);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion4.getCenterVertically(), composerStartRestartGroup, 48);
                long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i5 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
                Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
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
                pk0.v(companion5, composerM3915constructorimpl3, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
                Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl3, Integer.valueOf(i5), composerM3915constructorimpl3));
                ChaloTextViewKt.a(rowScopeInstance.weight(companion, 1.0f, false), premiumBusProductSelectionToolBarTitleUIState.f7707a, null, null, composerStartRestartGroup, 0, 12);
                TextUIState.ChaloTextUIState chaloTextUIState = premiumBusProductSelectionToolBarTitleUIState.b;
                if (chaloTextUIState == null) {
                    composerStartRestartGroup.startReplaceGroup(-1941610549);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1941610548);
                    SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion, f), composerStartRestartGroup, 0);
                    CommonImageKt.a(premiumBusProductSelectionToolBarTitleUIState.d, null, false, composerStartRestartGroup, 0, 6);
                    composerStartRestartGroup = composerStartRestartGroup;
                    SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion, f), composerStartRestartGroup, 0);
                    ChaloTextViewKt.a(rowScopeInstance.weight(companion, 1.0f, false), chaloTextUIState, null, null, composerStartRestartGroup, 0, 12);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            }
            if (premiumBusProductSelectionToolBarTitleUIState != null || state.b == null) {
                composerStartRestartGroup.startReplaceGroup(-1094541025);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1087945837);
                ChaloTextViewKt.a(i41.a(rowScopeInstance, ChaloThemeKt.c(companion, chaloPadding), 1.0f, false, 2, null), state.b, null, null, composerStartRestartGroup, 0, 12);
            }
            composerStartRestartGroup.endReplaceGroup();
            ToolbarActionsUIState toolbarActionsUIState = state.e;
            if (toolbarActionsUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-1087676789);
                composerStartRestartGroup.endReplaceGroup();
                companion2 = companion;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1087676788);
                ImageUIState imageUIState2 = toolbarActionsUIState.b;
                if (imageUIState2 == null) {
                    composerStartRestartGroup.startReplaceGroup(-1452587751);
                    composerStartRestartGroup.endReplaceGroup();
                    companion2 = companion;
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1452587750);
                    boolean zChanged = composerStartRestartGroup.changed(toolbarActionsUIState);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new kn0(toolbarActionsUIState, 24);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    Composer composer2 = composerStartRestartGroup;
                    companion2 = companion;
                    IconButtonKt.IconButton((Function0) objRememberedValue2, null, false, null, null, null, ComposableLambdaKt.rememberComposableLambda(162379909, true, new sm(imageUIState2, 3), composerStartRestartGroup, 54), composer2, 1572864, 62);
                    composerStartRestartGroup = composer2;
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            ChaloSpacersKt.w(composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            SpacerKt.Spacer(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).c), ChaloColorTokenKt.c(state.h), null, 2, null), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zr0(state, i, 19));
        }
    }

    public static final void c(Modifier modifier, PremiumBusProductSelectionViewState state, PremiumBusProductSelectionComponent premiumBusProductSelectionComponent, Composer composer, int i) {
        int i2;
        Intrinsics.i(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-229408526);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(state) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(premiumBusProductSelectionComponent) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-229408526, i2, -1, "app.chalo.premiumbus.ui.productselection.PremiumBusProductsListUiState (PremiumBusProductSelectionScreen.kt:83)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateMapOf();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotStateMap snapshotStateMap = (SnapshotStateMap) objRememberedValue;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                final float f = state.f7709a.c;
                Arrangement.Vertical vertical = new Arrangement.Vertical(f) { // from class: app.chalo.compose.components.ComposeUtilsKt$spacedByWithFooter$1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final float f1843a;
                    public final /* synthetic */ float b;

                    {
                        this.b = f;
                        this.f1843a = f;
                    }

                    @Override // androidx.compose.foundation.layout.Arrangement.Vertical
                    public final void arrange(Density density, int i3, int[] sizes, int[] outPositions) {
                        Intrinsics.i(density, "<this>");
                        Intrinsics.i(sizes, "sizes");
                        Intrinsics.i(outPositions, "outPositions");
                        if (sizes.length == 0) {
                            return;
                        }
                        int iMo398roundToPx0680j_4 = density.mo398roundToPx0680j_4(this.b);
                        int length = sizes.length;
                        int i4 = 0;
                        int iMin = 0;
                        int i5 = 0;
                        while (i4 < length) {
                            int i6 = sizes[i4];
                            int i7 = i5 + 1;
                            if (i5 == sizes.length - 1) {
                                outPositions[i5] = i3 - i6;
                            } else {
                                outPositions[i5] = Math.min(iMin, i3 - i6);
                            }
                            iMin = Math.min(iMo398roundToPx0680j_4, (i3 - outPositions[i5]) - i6) + outPositions[i5] + i6;
                            i4++;
                            i5 = i7;
                        }
                    }

                    @Override // androidx.compose.foundation.layout.Arrangement.Vertical
                    /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: from getter */
                    public final float getF1843a() {
                        return this.f1843a;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(vertical);
                objRememberedValue2 = vertical;
            }
            Arrangement.Vertical vertical2 = (Arrangement.Vertical) objRememberedValue2;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(premiumBusProductSelectionComponent) | ((i2 & 112) == 32);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new za0(26, state, premiumBusProductSelectionComponent, snapshotStateMap);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            LazyDslKt.LazyColumn(modifierFillMaxSize$default, null, null, false, vertical2, null, null, false, null, (Function1) objRememberedValue3, composerStartRestartGroup, 24576, 494);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new wm0(modifier, state, premiumBusProductSelectionComponent, i, 22));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(PremiumBusProductSelectionComponent premiumBusProductSelectionComponent, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1313833754);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(premiumBusProductSelectionComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1313833754, i2, -1, "app.chalo.premiumbus.ui.productselection.PremiumBusProductsSelectionScreen (PremiumBusProductSelectionScreen.kt:42)");
            }
            a((PremiumBusProductSelectionViewState) SubscribeAsStateKt.a(premiumBusProductSelectionComponent.t0(), composerStartRestartGroup).getValue(), premiumBusProductSelectionComponent, composerStartRestartGroup, (i2 << 3) & 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zr0(premiumBusProductSelectionComponent, i, 18));
        }
    }
}
