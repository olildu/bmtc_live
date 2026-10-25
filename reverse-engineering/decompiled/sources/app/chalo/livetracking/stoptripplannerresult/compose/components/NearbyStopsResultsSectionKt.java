package app.chalo.livetracking.stoptripplannerresult.compose.components;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
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
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.RippleEffectKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.livetracking.stoptripplannerresult.compose.components.NearbyStopsResultsSectionKt;
import app.chalo.livetracking.stoptripplannerresult.uistate.NearbyStopResultsContainerHeaderUISpec;
import app.chalo.livetracking.stoptripplannerresult.uistate.NearbyStopResultsContainerHeaderUIState;
import app.chalo.livetracking.stoptripplannerresult.uistate.NearbyStopResultsContainerUiSpec;
import app.chalo.livetracking.stoptripplannerresult.uistate.NearbyStopResultsContainerUiState;
import app.chalo.uistate.base.ChaloColorTokenKt;
import defpackage.gd0;
import defpackage.pk0;
import defpackage.u50;
import defpackage.zk0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class NearbyStopsResultsSectionKt {
    public static final void a(Modifier modifier, NearbyStopResultsContainerHeaderUIState nearbyStopResultsContainerHeaderUIState, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-447867449);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(nearbyStopResultsContainerHeaderUIState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-447867449, i2, -1, "app.chalo.livetracking.stoptripplannerresult.compose.components.NearbyStopResultContainerHeader (NearbyStopsResultsSection.kt:83)");
            }
            boolean zChanged = composerStartRestartGroup.changed(nearbyStopResultsContainerHeaderUIState.f4599a);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = nearbyStopResultsContainerHeaderUIState.f4599a;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            NearbyStopResultsContainerHeaderUISpec nearbyStopResultsContainerHeaderUISpec = (NearbyStopResultsContainerHeaderUISpec) objRememberedValue;
            Modifier modifierC = ChaloThemeKt.c(BackgroundKt.m263backgroundbw27NRU(modifier, ChaloColorTokenKt.c(nearbyStopResultsContainerHeaderUISpec.d), ChaloThemeKt.d(nearbyStopResultsContainerHeaderUISpec.c)), nearbyStopResultsContainerHeaderUISpec.f4598a);
            MutableInteractionSource mutableInteractionSourceB = RippleEffectKt.b(composerStartRestartGroup);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(nearbyStopResultsContainerHeaderUIState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new gd0(nearbyStopResultsContainerHeaderUIState, 27);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierM295clickableO2vRcR0$default = ClickableKt.m295clickableO2vRcR0$default(modifierC, mutableInteractionSourceB, null, false, null, null, (Function0) objRememberedValue2, 28, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM295clickableO2vRcR0$default);
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
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            ChaloTextViewKt.a(companion2, nearbyStopResultsContainerHeaderUIState.b, null, null, composerStartRestartGroup, 6, 12);
            ChaloSpacersKt.a(nearbyStopResultsContainerHeaderUISpec.b, composerStartRestartGroup, 0);
            CommonImageKt.a(nearbyStopResultsContainerHeaderUIState.c, companion2, false, composerStartRestartGroup, 48, 4);
            composer2 = composerStartRestartGroup;
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
            scopeUpdateScopeEndRestartGroup.updateScope(new zk0(modifier, nearbyStopResultsContainerHeaderUIState, i, 8));
        }
    }

    public static final void b(final Modifier modifier, final NearbyStopResultsContainerUiState uiState, Composer composer, final int i) {
        int i2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function2<? super Composer, ? super Integer, Unit> function2;
        Intrinsics.i(uiState, "uiState");
        Object obj = uiState.f4601a;
        Composer composerStartRestartGroup = composer.startRestartGroup(1370557355);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(uiState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1370557355, i2, -1, "app.chalo.livetracking.stoptripplannerresult.compose.components.NearbyStopsResultsSection (NearbyStopsResultsSection.kt:32)");
            }
            if (uiState.c.isEmpty()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final int i3 = 0;
                function2 = new Function2() { // from class: rm0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        int i4 = i3;
                        Composer composer2 = (Composer) obj2;
                        ((Integer) obj3).getClass();
                        switch (i4) {
                            case 0:
                                NearbyStopsResultsSectionKt.b(modifier, uiState, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                break;
                            default:
                                NearbyStopsResultsSectionKt.b(modifier, uiState, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
            } else {
                boolean zChanged = composerStartRestartGroup.changed(obj);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    composerStartRestartGroup.updateRememberedValue(obj);
                } else {
                    obj = objRememberedValue;
                }
                NearbyStopResultsContainerUiSpec nearbyStopResultsContainerUiSpec = (NearbyStopResultsContainerUiSpec) obj;
                Modifier modifierC = ChaloThemeKt.c(modifier, nearbyStopResultsContainerUiSpec.f4600a);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i4 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
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
                Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                a(ChaloThemeKt.c(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), nearbyStopResultsContainerUiSpec.b), uiState.b, composerStartRestartGroup, 0);
                ChaloSpacersKt.a(nearbyStopResultsContainerUiSpec.c, composerStartRestartGroup, 0);
                AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, !uiState.d, (Modifier) null, EnterExitTransitionKt.expandVertically$default(AnimationSpecKt.tween$default(200, 0, null, 6, null), null, false, null, 14, null), EnterExitTransitionKt.shrinkVertically$default(AnimationSpecKt.tween$default(200, 0, null, 6, null), null, false, null, 14, null), (String) null, ComposableLambdaKt.rememberComposableLambda(838361209, true, new u50(12, uiState, nearbyStopResultsContainerUiSpec), composerStartRestartGroup, 54), composerStartRestartGroup, 1600518, 18);
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
            function2 = new Function2() { // from class: rm0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    int i6 = i5;
                    Composer composer2 = (Composer) obj2;
                    ((Integer) obj3).getClass();
                    switch (i6) {
                        case 0:
                            NearbyStopsResultsSectionKt.b(modifier, uiState, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                        default:
                            NearbyStopsResultsSectionKt.b(modifier, uiState, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.f17538a;
                }
            };
            scopeUpdateScopeEndRestartGroup.updateScope(function2);
        }
    }
}
