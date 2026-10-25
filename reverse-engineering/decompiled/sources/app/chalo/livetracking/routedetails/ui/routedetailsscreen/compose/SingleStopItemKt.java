package app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import app.chalo.ads.NativeInlineAdKt;
import app.chalo.ads.NativeInlineAdSlot;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.CircularShapeKt;
import app.chalo.compose.components.ComposeUtilsKt;
import app.chalo.compose.components.PlotlineComposeWidgetKt;
import app.chalo.compose.components.RippleEffectKt;
import app.chalo.compose.components.SpecialFeatureTagListComposableKt;
import app.chalo.compose.components.TextKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.FromStopAndBusIconUISpecs;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.FromStopAndBusIconUIState;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteNativeAdUIState;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteReportProblemCTAUIState;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.SingleStopItemUISpec;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.SingleStopItemUIState;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.StopCardUIState;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.StopNameAndEtaUIState;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.StopNameRouteScreenUISpecs;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.StopNameRouteScreenUIState;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.StopsListBusIconUIState;
import app.chalo.uistate.base.BorderUISpecKt;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.divider.DividerUIStateKt;
import app.chalo.uistate.text.FlowTextUIState;
import app.chalo.uistate.text.SpecialFeaturesTagListUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.dq;
import defpackage.fu0;
import defpackage.g61;
import defpackage.gf;
import defpackage.im;
import defpackage.k31;
import defpackage.l91;
import defpackage.pk0;
import defpackage.zt0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "isAdVisible", "livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SingleStopItemKt {
    public static final void a(FromStopAndBusIconUIState fromStopAndBusIconUIState, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        int i3;
        boolean z;
        DividerUIState dividerUIState = fromStopAndBusIconUIState.b;
        FromStopAndBusIconUISpecs fromStopAndBusIconUISpecs = fromStopAndBusIconUIState.e;
        Composer composerStartRestartGroup = composer.startRestartGroup(1437270393);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(fromStopAndBusIconUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if (composerStartRestartGroup.shouldExecute((i4 & 19) != 18, i4 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1437270393, i4, -1, "app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.FromStopAndBusIconView (SingleStopItem.kt:81)");
            }
            Modifier modifierC = ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(companion, Color.INSTANCE.m4640getTransparent0d7_KjU(), null, 2, null), fromStopAndBusIconUISpecs.f4910a);
            int i5 = i4 & 14;
            boolean z2 = i5 == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new g61(fromStopAndBusIconUIState, 5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            boolean z3 = i5 == 4;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new l91(fromStopAndBusIconUIState, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierC2 = ComposeUtilsKt.c(modifierC, function0, (Function1) objRememberedValue2);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(fromStopAndBusIconUIState.f ? Alignment.INSTANCE.getCenterStart() : Alignment.INSTANCE.getCenter(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC2);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i6), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion3.getCenterHorizontally(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i7 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxHeight$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i7), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            DividerUIState dividerUIState2 = fromStopAndBusIconUIState.f4911a;
            if (dividerUIState2 == null) {
                composerStartRestartGroup.startReplaceGroup(1794125482);
                composerStartRestartGroup.endReplaceGroup();
                i3 = 0;
            } else {
                composerStartRestartGroup.startReplaceGroup(1794125483);
                i3 = 0;
                DividerUIStateKt.a(ZIndexModifierKt.zIndex(SizeKt.m814height3ABfNKs(companion, fromStopAndBusIconUISpecs.c), -1.0f), dividerUIState2, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            CircularShapeKt.b(fromStopAndBusIconUIState.c, null, composerStartRestartGroup, i3);
            if (dividerUIState == null) {
                composerStartRestartGroup.startReplaceGroup(1794475534);
                composerStartRestartGroup.endReplaceGroup();
                modifier2 = companion;
                z = false;
            } else {
                composerStartRestartGroup.startReplaceGroup(1794475535);
                modifier2 = companion;
                Modifier modifierA = dq.a(columnScopeInstance, modifier2, 1.0f, false, 2, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
                long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i8 = (int) ((currentCompositeKeyHashCode3 >>> 32) ^ currentCompositeKeyHashCode3);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA);
                Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
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
                pk0.v(companion2, composerM3915constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
                Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl3, Integer.valueOf(i8), composerM3915constructorimpl3));
                z = false;
                DividerUIStateKt.a(ZIndexModifierKt.zIndex(SizeKt.fillMaxHeight$default(modifier2, 0.0f, 1, null), -1.0f), dividerUIState, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (fromStopAndBusIconUIState.d != null) {
                z = true;
            }
            AnimatedVisibilityKt.AnimatedVisibility(z, boxScopeInstance.align(modifier2, companion3.getBottomCenter()), EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambdaKt.rememberComposableLambda(1813500631, true, new fu0(25, fromStopAndBusIconUIState, boxScopeInstance), composerStartRestartGroup, 54), composerStartRestartGroup, 200064, 16);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new k31(fromStopAndBusIconUIState, modifier2, i, 26));
        }
    }

    public static final void b(StopsListBusIconUIState.IconWithBusNumber state, Modifier modifier, Composer composer, int i) {
        int i2;
        Intrinsics.i(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-780529327);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-780529327, i2, -1, "app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.LiveBusIconWithNumber (SingleStopItem.kt:161)");
            }
            Modifier modifierC = ChaloThemeKt.c(BorderUISpecKt.a(BackgroundKt.m263backgroundbw27NRU(modifier, ChaloColorTokenKt.c(state.c), ChaloThemeKt.d(state.d)), state.f), state.e);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            CommonImageKt.a(state.f4958a, null, false, composerStartRestartGroup, 0, 6);
            ChaloSpacersKt.a(state.g, composerStartRestartGroup, 0);
            TextUIState textUIState = state.b;
            if (textUIState == null) {
                composerStartRestartGroup.startReplaceGroup(369879819);
            } else {
                composerStartRestartGroup.startReplaceGroup(369879820);
                TextKt.c(textUIState, null, null, null, composerStartRestartGroup, 0, 14);
                composerStartRestartGroup = composerStartRestartGroup;
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
            scopeUpdateScopeEndRestartGroup.updateScope(new k31(state, modifier, i, 27));
        }
    }

    public static final void c(SingleStopItemUIState singleStopItemUIState, Modifier modifier, Composer composer, int i) {
        int i2;
        SingleStopItemUISpec singleStopItemUISpec = singleStopItemUIState.d;
        Composer composerStartRestartGroup = composer.startRestartGroup(159062590);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(singleStopItemUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(159062590, i2, -1, "app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.SingleStopItem (SingleStopItem.kt:57)");
            }
            Modifier modifierAlpha = AlphaKt.alpha(IntrinsicKt.height(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), IntrinsicSize.Min), singleStopItemUISpec.f4950a);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlpha);
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
            a(singleStopItemUIState.b, null, composerStartRestartGroup, 0);
            d(singleStopItemUIState.f4951a, ChaloThemeKt.c(Modifier.INSTANCE, singleStopItemUISpec.b), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new k31(singleStopItemUIState, modifier, i, 23));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(StopNameAndEtaUIState state, Modifier modifier, Composer composer, int i) {
        int i2;
        float f;
        Modifier modifier2;
        int i3;
        Intrinsics.i(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-342898978);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-342898978, i2, -1, "app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.StopNameAndEta (SingleStopItem.kt:187)");
            }
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloSpacersKt.a(ChaloTheme.b(composerStartRestartGroup, 0).h, composerStartRestartGroup, 0);
            SpecialFeaturesTagListUIState specialFeaturesTagListUIState = state.f4955a;
            if (specialFeaturesTagListUIState == null) {
                composerStartRestartGroup.startReplaceGroup(523193352);
            } else {
                composerStartRestartGroup.startReplaceGroup(523193353);
                SpecialFeatureTagListComposableKt.b(specialFeaturesTagListUIState, OffsetKt.m744offsetVpY3zN4$default(PaddingKt.m786paddingVpY3zN4$default(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 0).d, 0.0f, 2, null), 0.0f, Dp.m7278constructorimpl(-ChaloTheme.b(composerStartRestartGroup, 0).d), 1, null), composerStartRestartGroup, 0, 0);
                ChaloSpacersKt.a(ChaloTheme.b(composerStartRestartGroup, 0).f, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            StopNameRouteScreenUIState stopNameRouteScreenUIState = state.b;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            e(stopNameRouteScreenUIState, SizeKt.fillMaxWidth$default(OffsetKt.m744offsetVpY3zN4$default(companion3, 0.0f, Dp.m7278constructorimpl(-ChaloTheme.b(composerStartRestartGroup, 0).c), 1, null), 0.0f, 1, null), composerStartRestartGroup, 0);
            ChaloSpacersKt.a(ChaloTheme.b(composerStartRestartGroup, 0).f, composerStartRestartGroup, 0);
            StopCardUIState stopCardUIState = state.c;
            if (stopCardUIState == null) {
                composerStartRestartGroup.startReplaceGroup(523789792);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(523789793);
                StopCardKt.c(stopCardUIState, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), composerStartRestartGroup, 48);
                gf.r(companion3, ChaloTheme.b(composerStartRestartGroup, 0).f, composerStartRestartGroup, 0);
            }
            RouteNativeAdUIState routeNativeAdUIState = state.d;
            if (routeNativeAdUIState == null) {
                composerStartRestartGroup.startReplaceGroup(524040644);
                composerStartRestartGroup.endReplaceGroup();
                f = 0.0f;
                modifier2 = null;
            } else {
                composerStartRestartGroup.startReplaceGroup(524040645);
                boolean zChanged = composerStartRestartGroup.changed(routeNativeAdUIState.f4934a);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                MutableState mutableState = (MutableState) objRememberedValue;
                boolean zChanged2 = composerStartRestartGroup.changed(mutableState);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new SingleStopItemKt$StopNameAndEta$1$3$1$1(mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                EffectsKt.LaunchedEffect(routeNativeAdUIState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
                NativeInlineAdSlot nativeInlineAdSlot = routeNativeAdUIState.b;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                Map map = routeNativeAdUIState.c;
                boolean zChanged3 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(routeNativeAdUIState);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new fu0(24, routeNativeAdUIState, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                Function3 function3 = (Function3) objRememberedValue3;
                boolean zChanged4 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(routeNativeAdUIState);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new zt0(8, routeNativeAdUIState, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                Function2 function2 = (Function2) objRememberedValue4;
                f = 0.0f;
                modifier2 = null;
                NativeInlineAdKt.b(nativeInlineAdSlot, modifierFillMaxWidth$default, map, function3, function2, composerStartRestartGroup, 48);
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    composerStartRestartGroup.startReplaceGroup(-63016898);
                    ChaloSpacersKt.a(ChaloTheme.b(composerStartRestartGroup, 0).f, composerStartRestartGroup, 0);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-71390773);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endReplaceGroup();
            }
            RouteReportProblemCTAUIState routeReportProblemCTAUIState = state.e;
            if (routeReportProblemCTAUIState == null) {
                composerStartRestartGroup.startReplaceGroup(524952571);
                composerStartRestartGroup.endReplaceGroup();
                i3 = 0;
            } else {
                composerStartRestartGroup.startReplaceGroup(524952572);
                ChaloSpacersKt.a(ChaloTheme.b(composerStartRestartGroup, 0).g, composerStartRestartGroup, 0);
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion3, f, 1, modifier2);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getEnd(), companion.getTop(), composerStartRestartGroup, 6);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
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
                pk0.v(companion2, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                i3 = 0;
                ReportProblemKt.b(routeReportProblemCTAUIState, modifier2, composerStartRestartGroup, 0);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            }
            ChaloSpacersKt.a(ChaloThemeHelper.a().h, composerStartRestartGroup, i3);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new k31(state, modifier, i, 25));
        }
    }

    public static final void e(StopNameRouteScreenUIState state, Modifier modifier, Composer composer, int i) {
        int i2;
        Intrinsics.i(state, "state");
        StopNameRouteScreenUISpecs stopNameRouteScreenUISpecs = state.b;
        FlowTextUIState flowTextUIState = state.f4957a;
        Composer composerStartRestartGroup = composer.startRestartGroup(602929187);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(602929187, i2, -1, "app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.StopNameRouteScreenView (SingleStopItem.kt:265)");
            }
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            TextKt.a(flowTextUIState, rowScopeInstance.weight(AlphaKt.alpha(PlotlineComposeWidgetKt.b(ChaloThemeKt.c(companion2, stopNameRouteScreenUISpecs.b), flowTextUIState.b), stopNameRouteScreenUISpecs.f4956a), 1.0f, false), composerStartRestartGroup, 0);
            TextUIState.ChaloTextUIState chaloTextUIState = state.c;
            if (chaloTextUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-1319076482);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1319076481);
                MutableInteractionSource mutableInteractionSourceB = RippleEffectKt.b(composerStartRestartGroup);
                IndicationNodeFactory indicationNodeFactoryA = RippleEffectKt.a(composerStartRestartGroup);
                boolean zChanged = composerStartRestartGroup.changed(chaloTextUIState);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new im(chaloTextUIState, 2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                TextKt.c(chaloTextUIState, ClickableKt.m295clickableO2vRcR0$default(companion2, mutableInteractionSourceB, indicationNodeFactoryA, false, null, null, (Function0) objRememberedValue, 28, null), null, RippleEffectKt.a(composerStartRestartGroup), composerStartRestartGroup, 0, 4);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new k31(state, modifier, i, 24));
        }
    }
}
