package app.chalo.titoridedetail.ui.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.TextKt;
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
import app.chalo.citydata.data.model.app.SeatAvailabilityLevel;
import app.chalo.compose.components.chalomap.LiveBusDelayedState;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.livetracking.provider.tracking.model.EstimatedStopEtaUiModel;
import app.chalo.livetracking.provider.tracking.model.FixedStopEtaUiModel;
import app.chalo.livetracking.provider.tracking.model.StopLiveEtaUiModel;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.StopEtasKt;
import app.chalo.providers.stringprovider.StringEnum;
import defpackage.cg1;
import defpackage.pk0;
import defpackage.wb;
import defpackage.y4;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TitoStopInfoWindowKt {
    public static final void a(Modifier modifier, StopLiveEtaUiModel stopLiveEtaUiModel, Composer composer, int i) {
        Modifier modifier2;
        Long lValueOf;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1277647613);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(stopLiveEtaUiModel) : composerStartRestartGroup.changedInstance(stopLiveEtaUiModel) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(true) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1277647613, i2, -1, "app.chalo.titoridedetail.ui.compose.TitoStopEta (TitoStopInfoWindow.kt:61)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (!(composerStartRestartGroup.getApplier() != null)) {
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
            if (stopLiveEtaUiModel.equals(StopLiveEtaUiModel.AllBusPassedStop.f4375a)) {
                composerStartRestartGroup.startReplaceGroup(1933868499);
                modifier2 = companion;
                TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.ROUTE_DETAILS_BUS_PASSED_STOP, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).i, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 131066);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                modifier2 = companion;
                if (stopLiveEtaUiModel.equals(StopLiveEtaUiModel.EtaFetchInProgress.f4376a)) {
                    composerStartRestartGroup.startReplaceGroup(1934154350);
                    composerStartRestartGroup.startReplaceGroup(1934209809);
                    TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.FETCHING, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).f1915a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.h(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 131066);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endReplaceGroup();
                } else if (stopLiveEtaUiModel.equals(StopLiveEtaUiModel.NotAvailable.f4377a)) {
                    composerStartRestartGroup.startReplaceGroup(1934592039);
                    TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.ROUTE_DETAILS_LIVE_TRACKING_NOT_AVAILABLE, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).i, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 131066);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                } else if (stopLiveEtaUiModel instanceof StopLiveEtaUiModel.WithEtaAvailable.EstimatedEta) {
                    composerStartRestartGroup.startReplaceGroup(1934899807);
                    EstimatedStopEtaUiModel estimatedStopEtaUiModel = (EstimatedStopEtaUiModel) CollectionsKt.F(((StopLiveEtaUiModel.WithEtaAvailable.EstimatedEta) stopLiveEtaUiModel).f4380a);
                    StopEtasKt.b(estimatedStopEtaUiModel.f4366a, estimatedStopEtaUiModel.b, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (stopLiveEtaUiModel instanceof StopLiveEtaUiModel.WithEtaAvailable.FixedEta) {
                    composerStartRestartGroup.startReplaceGroup(1935248898);
                    FixedStopEtaUiModel fixedStopEtaUiModel = (FixedStopEtaUiModel) CollectionsKt.F(((StopLiveEtaUiModel.WithEtaAvailable.FixedEta) stopLiveEtaUiModel).f4381a);
                    LiveBusDelayedState liveBusDelayedState = fixedStopEtaUiModel.d;
                    if (liveBusDelayedState instanceof LiveBusDelayedState.Delayed) {
                        lValueOf = Long.valueOf(((LiveBusDelayedState.Delayed) liveBusDelayedState).f1877a);
                    } else {
                        if (!Intrinsics.d(liveBusDelayedState, LiveBusDelayedState.NotDelayed.f1878a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        lValueOf = null;
                    }
                    Long l = lValueOf;
                    int i4 = i2;
                    String str = fixedStopEtaUiModel.f4368a;
                    boolean z = fixedStopEtaUiModel.b;
                    SeatAvailabilityLevel seatAvailabilityLevel = SeatAvailabilityLevel.UNKNOWN;
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new wb(8);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    StopEtasKt.d(str, z, seatAvailabilityLevel, l, true, false, (Function0) objRememberedValue, composerStartRestartGroup, 114822192 | ((i4 << 9) & 458752), 6);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (stopLiveEtaUiModel instanceof StopLiveEtaUiModel.SpecificScheduledTime) {
                    composerStartRestartGroup.startReplaceGroup(1936215323);
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(modifier2, ChaloTheme.b(composerStartRestartGroup, 0).c), composerStartRestartGroup, 0);
                    TextKt.m2623TextNvy7gAk(((StopLiveEtaUiModel.SpecificScheduledTime) stopLiveEtaUiModel).f4378a, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.h(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 131070);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (!stopLiveEtaUiModel.equals(StopLiveEtaUiModel.Unknown.f4379a)) {
                        throw pk0.p(composerStartRestartGroup, 339477205);
                    }
                    composerStartRestartGroup.startReplaceGroup(1936487751);
                    composerStartRestartGroup.endReplaceGroup();
                }
            }
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
            scopeUpdateScopeEndRestartGroup.updateScope(new cg1(i, 11, modifier2, stopLiveEtaUiModel));
        }
    }

    public static final void b(String stopName, StopLiveEtaUiModel stopLiveEtaUiModel, boolean z, Composer composer, int i) {
        int i2;
        int i3;
        StopLiveEtaUiModel stopLiveEtaUiModel2 = stopLiveEtaUiModel;
        Intrinsics.i(stopName, "stopName");
        Composer composerStartRestartGroup = composer.startRestartGroup(-876615947);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(stopName) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(stopLiveEtaUiModel2) : composerStartRestartGroup.changedInstance(stopLiveEtaUiModel2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-876615947, i2, -1, "app.chalo.titoridedetail.ui.compose.TitoStopInfoWindow (TitoStopInfoWindow.kt:29)");
            }
            int i4 = i2;
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(SizeKt.m835widthInVpY3zN4$default(SizeKt.wrapContentWidth$default(companion, null, false, 3, null), 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).x, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).g);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM784padding3ABfNKs);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (!(composerStartRestartGroup.getApplier() != null)) {
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-1879453471);
                i3 = 0;
                TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.DROP_OFF_STOP, new Object[0], composerStartRestartGroup, 6), companion, ChaloTheme.a(composerStartRestartGroup, 0).g, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 48, 0, 131064);
                composerStartRestartGroup = composerStartRestartGroup;
            } else {
                i3 = 0;
                composerStartRestartGroup.startReplaceGroup(-1881011965);
            }
            composerStartRestartGroup.endReplaceGroup();
            Composer composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(stopName, companion, ChaloTheme.a(composerStartRestartGroup, i3).g, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.g(ChaloTheme.e(composerStartRestartGroup, i3)), composer2, (i4 & 14) | 48, 0, 131064);
            composerStartRestartGroup = composer2;
            stopLiveEtaUiModel2 = stopLiveEtaUiModel;
            a(null, stopLiveEtaUiModel2, composerStartRestartGroup, (i4 & 112) | 384);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new y4(stopName, stopLiveEtaUiModel2, z, i, 8));
        }
    }
}
