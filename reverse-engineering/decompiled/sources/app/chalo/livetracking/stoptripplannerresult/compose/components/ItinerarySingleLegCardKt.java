package app.chalo.livetracking.stoptripplannerresult.compose.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.TextWithLeftAndTrailingRightIconComponentKt;
import app.chalo.compose.components.ChaloAlertTextKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.FromAndToStopDetailViewKt;
import app.chalo.compose.components.RippleEffectKt;
import app.chalo.compose.components.SpecialFeatureTagListComposableKt;
import app.chalo.compose.components.TextKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.components.image.GifUIKt;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.livetracking.stoptripplannerresult.compose.components.ItinerarySingleLegCardKt;
import app.chalo.livetracking.stoptripplannerresult.uistate.BusInfoCardSpecs;
import app.chalo.livetracking.stoptripplannerresult.uistate.BusInfoCardUiState;
import app.chalo.livetracking.stoptripplannerresult.uistate.BusInfoCtaSpecs;
import app.chalo.livetracking.stoptripplannerresult.uistate.BusInfoCtaUiState;
import app.chalo.livetracking.stoptripplannerresult.uistate.BusNumberAndCtaSpecs;
import app.chalo.livetracking.stoptripplannerresult.uistate.BusNumberContainerUIState;
import app.chalo.livetracking.stoptripplannerresult.uistate.EtaAndFareInfoCardUiState;
import app.chalo.livetracking.stoptripplannerresult.uistate.EtaAndFareInfoSpecs;
import app.chalo.livetracking.stoptripplannerresult.uistate.FareAndTravelTimeInfoUiState;
import app.chalo.livetracking.stoptripplannerresult.uistate.ItineraryLegItemSpecs;
import app.chalo.livetracking.stoptripplannerresult.uistate.ItineraryLegItemUiState;
import app.chalo.livetracking.stoptripplannerresult.uistate.LegCardHeaderUiState;
import app.chalo.livetracking.stoptripplannerresult.uistate.LiveEtaInfoUiSpecs;
import app.chalo.livetracking.stoptripplannerresult.uistate.LiveEtaInfoUiState;
import app.chalo.livetracking.stoptripplannerresult.uistate.RouteDetailsUiState;
import app.chalo.livetracking.stoptripplannerresult.uistate.StopInfoUiState;
import app.chalo.uistate.base.BorderUISpecKt;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.UiAlignmentKt;
import app.chalo.uistate.image.GifImageUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.AlertTextWithIconUiState;
import app.chalo.uistate.text.SpecialFeaturesTagListUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.fc0;
import defpackage.gf;
import defpackage.ir;
import defpackage.pk0;
import defpackage.r1;
import defpackage.v60;
import defpackage.w00;
import defpackage.xx;
import defpackage.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ItinerarySingleLegCardKt {
    public static final void a(Modifier modifier, BusInfoCtaUiState busInfoCtaUiState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1058686542);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(busInfoCtaUiState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1058686542, i2, -1, "app.chalo.livetracking.stoptripplannerresult.compose.components.BusInfoCtaButton (ItinerarySingleLegCard.kt:259)");
            }
            BusInfoCtaSpecs busInfoCtaSpecs = busInfoCtaUiState.f4574a;
            boolean zChanged = composerStartRestartGroup.changed(busInfoCtaSpecs);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(busInfoCtaSpecs);
                objRememberedValue = busInfoCtaSpecs;
            }
            BusInfoCtaSpecs busInfoCtaSpecs2 = (BusInfoCtaSpecs) objRememberedValue;
            Modifier modifierA = BorderUISpecKt.a(BackgroundKt.m263backgroundbw27NRU(modifier, ChaloColorTokenKt.c(busInfoCtaSpecs2.d), ChaloThemeKt.d(busInfoCtaSpecs2.b)), busInfoCtaSpecs2.c);
            MutableInteractionSource mutableInteractionSourceB = RippleEffectKt.b(composerStartRestartGroup);
            boolean z = (i2 & 112) == 32;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new xx(busInfoCtaUiState, 26);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierC = ChaloThemeKt.c(ClickableKt.m295clickableO2vRcR0$default(modifierA, mutableInteractionSourceB, null, false, null, null, (Function0) objRememberedValue2, 28, null), busInfoCtaSpecs.f4573a);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
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
            TextWithLeftAndTrailingRightIconComponentKt.a(null, busInfoCtaUiState.b, composerStartRestartGroup, 0, 1);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new v60(modifier, busInfoCtaUiState, i, 9));
        }
    }

    public static final void b(BusInfoCardUiState state, Composer composer, int i) {
        int i2;
        Intrinsics.i(state, "state");
        SpecialFeaturesTagListUIState specialFeaturesTagListUIState = state.c;
        BusInfoCardSpecs busInfoCardSpecs = state.f4572a;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1680543495);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1680543495, i2, -1, "app.chalo.livetracking.stoptripplannerresult.compose.components.BusInfoUI (ItinerarySingleLegCard.kt:184)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            TextUIState.ChaloTextUIState chaloTextUIState = state.b;
            if (chaloTextUIState == null) {
                composerStartRestartGroup.startReplaceGroup(938467320);
            } else {
                composerStartRestartGroup.startReplaceGroup(938467321);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), UiAlignmentKt.b(busInfoCardSpecs.c), composerStartRestartGroup, 0);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
                ChaloTextViewKt.a(RowScopeInstance.INSTANCE.weight(companion, 1.0f, false), chaloTextUIState, null, null, composerStartRestartGroup, 0, 12);
                if (specialFeaturesTagListUIState.f10083a.isEmpty()) {
                    composerStartRestartGroup.startReplaceGroup(-1364591107);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1357661677);
                    SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion, busInfoCardSpecs.b), composerStartRestartGroup, 0);
                    SpecialFeatureTagListComposableKt.b(specialFeaturesTagListUIState, null, composerStartRestartGroup, 0, 2);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
            }
            composerStartRestartGroup.endReplaceGroup();
            TextUIState.ChaloTextUIState chaloTextUIState2 = state.d;
            if (chaloTextUIState2 == null) {
                composerStartRestartGroup.startReplaceGroup(939019864);
            } else {
                composerStartRestartGroup.startReplaceGroup(939019865);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, busInfoCardSpecs.f4571a), composerStartRestartGroup, 0);
                ChaloTextViewKt.a(null, chaloTextUIState2, null, null, composerStartRestartGroup, 0, 13);
            }
            composerStartRestartGroup.endReplaceGroup();
            BusNumberContainerUIState busNumberContainerUIState = state.e;
            if (busNumberContainerUIState == null) {
                composerStartRestartGroup.startReplaceGroup(939193774);
            } else {
                composerStartRestartGroup.startReplaceGroup(939193775);
                ChaloSpacersKt.a(busInfoCardSpecs.d, composerStartRestartGroup, 0);
                if (busNumberContainerUIState instanceof BusNumberContainerUIState.WithoutCta) {
                    composerStartRestartGroup.startReplaceGroup(453798185);
                    TextKt.b(null, ((BusNumberContainerUIState.WithoutCta) busNumberContainerUIState).f4577a, composerStartRestartGroup, 0, 1);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (!(busNumberContainerUIState instanceof BusNumberContainerUIState.BusNumberAndCtaUiState)) {
                        throw pk0.p(composerStartRestartGroup, 2092846588);
                    }
                    composerStartRestartGroup.startReplaceGroup(453946737);
                    c(null, (BusNumberContainerUIState.BusNumberAndCtaUiState) busNumberContainerUIState, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
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
            scopeUpdateScopeEndRestartGroup.updateScope(new fc0(state, i, 2));
        }
    }

    public static final void c(Modifier modifier, BusNumberContainerUIState.BusNumberAndCtaUiState busNumberAndCtaUiState, Composer composer, int i) {
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(994882964);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(busNumberAndCtaUiState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            modifier2 = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(994882964, i2, -1, "app.chalo.livetracking.stoptripplannerresult.compose.components.BusNumberAndCtaRow (ItinerarySingleLegCard.kt:224)");
            }
            BusNumberAndCtaSpecs busNumberAndCtaSpecs = busNumberAndCtaUiState.f4576a;
            boolean zChanged = composerStartRestartGroup.changed(busNumberAndCtaSpecs);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(busNumberAndCtaSpecs);
                objRememberedValue = busNumberAndCtaSpecs;
            }
            BusNumberAndCtaSpecs busNumberAndCtaSpecs2 = (BusNumberAndCtaSpecs) objRememberedValue;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
            RoundedCornerShape roundedCornerShapeD = ChaloThemeKt.d(busNumberAndCtaSpecs2.b);
            Brush.Companion companion = Brush.INSTANCE;
            List list = busNumberAndCtaSpecs.c;
            ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Color.m4595boximpl(ChaloColorTokenKt.c((ChaloColorToken) it.next())));
            }
            Modifier modifierBackground$default = BackgroundKt.background$default(modifierFillMaxWidth$default, Brush.Companion.m4560linearGradientmHitzGk$default(companion, arrayList, 0L, 0L, 0, 14, (Object) null), roundedCornerShapeD, 0.0f, 4, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, companion2.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBackground$default);
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier.Companion companion4 = Modifier.INSTANCE;
            Modifier modifierC = ChaloThemeKt.c(companion4, busNumberAndCtaSpecs2.f4575a);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) ((currentCompositeKeyHashCode2 >>> 32) ^ currentCompositeKeyHashCode2);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
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
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloTextViewKt.a(null, busNumberAndCtaUiState.b, null, null, composerStartRestartGroup, 0, 13);
            ChaloTextViewKt.a(null, busNumberAndCtaUiState.c, null, null, composerStartRestartGroup, 0, 13);
            composerStartRestartGroup.endNode();
            a(companion4, busNumberAndCtaUiState.d, composerStartRestartGroup, 6);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new v60(modifier2, busNumberAndCtaUiState, i, 8));
        }
    }

    public static final void d(FareAndTravelTimeInfoUiState fareAndTravelTimeInfoUiState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2007077161);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(fareAndTravelTimeInfoUiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2007077161, i2, -1, "app.chalo.livetracking.stoptripplannerresult.compose.components.FareAndTravelTimeInfoUi (ItinerarySingleLegCard.kt:174)");
            }
            Alignment.Horizontal horizontalA = UiAlignmentKt.a(fareAndTravelTimeInfoUiState.f4581a.f4580a);
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), horizontalA, composerStartRestartGroup, 0);
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
            ChaloTextViewKt.a(null, fareAndTravelTimeInfoUiState.b, null, null, composerStartRestartGroup, 0, 13);
            ChaloTextViewKt.a(null, fareAndTravelTimeInfoUiState.c, null, null, composerStartRestartGroup, 0, 13);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fc0(fareAndTravelTimeInfoUiState, i, 4));
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0095  */
    public static final void e(Modifier modifier, ItineraryLegItemUiState state, Float f, Composer composer, int i) {
        int i2;
        float fFloatValue;
        Intrinsics.i(state, "state");
        ItineraryLegItemSpecs itineraryLegItemSpecs = state.f4585a;
        Composer composerStartRestartGroup = composer.startRestartGroup(476852471);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(state) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(476852471, i2, -1, "app.chalo.livetracking.stoptripplannerresult.compose.components.ItinerarySingleLegCard (ItinerarySingleLegCard.kt:48)");
            }
            boolean z = (i2 & 896) == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                if (f == null) {
                    fFloatValue = 1.0f;
                } else {
                    Float f2 = f.floatValue() > 0.0f ? f : null;
                    if (f2 != null) {
                        fFloatValue = f2.floatValue();
                    } else {
                        fFloatValue = 1.0f;
                    }
                }
                objRememberedValue = Float.valueOf(fFloatValue);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            float fFloatValue2 = ((Number) objRememberedValue).floatValue();
            Modifier modifierC = ChaloThemeKt.c(ClipKt.clip(modifier, ChaloThemeKt.d(itineraryLegItemSpecs.b)), itineraryLegItemSpecs.f4584a);
            MutableInteractionSource mutableInteractionSourceB = RippleEffectKt.b(composerStartRestartGroup);
            boolean z2 = (i2 & 112) == 32;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new xx(state, 25);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierM295clickableO2vRcR0$default = ClickableKt.m295clickableO2vRcR0$default(modifierC, mutableInteractionSourceB, null, false, null, null, (Function0) objRememberedValue2, 28, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            LegCardHeaderUiState legCardHeaderUiState = state.b;
            if (legCardHeaderUiState == null) {
                composerStartRestartGroup.startReplaceGroup(-1015026588);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1015026587);
                f(legCardHeaderUiState, composerStartRestartGroup, 0);
                gf.r(Modifier.INSTANCE, itineraryLegItemSpecs.d, composerStartRestartGroup, 0);
            }
            RouteDetailsUiState routeDetailsUiState = state.c;
            if (routeDetailsUiState == null) {
                composerStartRestartGroup.startReplaceGroup(-1014851965);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1014851964);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                h(SizeKt.fillMaxWidth(companion2, fFloatValue2), routeDetailsUiState, composerStartRestartGroup, 0, 0);
                gf.r(companion2, itineraryLegItemSpecs.e, composerStartRestartGroup, 0);
            }
            AlertTextWithIconUiState alertTextWithIconUiState = state.d;
            if (alertTextWithIconUiState == null) {
                composerStartRestartGroup.startReplaceGroup(-1014576158);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1014576157);
                ChaloAlertTextKt.a(null, alertTextWithIconUiState, composerStartRestartGroup, 0);
                gf.r(Modifier.INSTANCE, itineraryLegItemSpecs.f, composerStartRestartGroup, 0);
            }
            i(state.e, composerStartRestartGroup, 0);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(Modifier.INSTANCE, itineraryLegItemSpecs.g), composerStartRestartGroup, 0);
            b(state.f, composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ir(i, 18, modifier, state, f));
        }
    }

    public static final void f(LegCardHeaderUiState legCardHeaderUiState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1653408783);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(legCardHeaderUiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1653408783, i2, -1, "app.chalo.livetracking.stoptripplannerresult.compose.components.LegCardHeaderUi (ItinerarySingleLegCard.kt:84)");
            }
            Alignment.Vertical verticalB = UiAlignmentKt.b(legCardHeaderUiState.f4589a.b);
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), verticalB, composerStartRestartGroup, 0);
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            CommonImageKt.a(legCardHeaderUiState.b, null, false, composerStartRestartGroup, 0, 6);
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion, legCardHeaderUiState.f4589a.f4588a), composerStartRestartGroup, 0);
            ChaloTextViewKt.a(null, legCardHeaderUiState.c, null, null, composerStartRestartGroup, 0, 13);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fc0(legCardHeaderUiState, i, 0));
        }
    }

    public static final void g(LiveEtaInfoUiState liveEtaInfoUiState, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1451319008);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(liveEtaInfoUiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1451319008, i2, -1, "app.chalo.livetracking.stoptripplannerresult.compose.components.LegLiveEtaComponent (ItinerarySingleLegCard.kt:148)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
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
            TextUIState.ChaloTextUIState chaloTextUIState = liveEtaInfoUiState.b;
            GifImageUIState gifImageUIState = liveEtaInfoUiState.d;
            LiveEtaInfoUiSpecs liveEtaInfoUiSpecs = liveEtaInfoUiState.f4591a;
            composer2 = composerStartRestartGroup;
            ChaloTextViewKt.a(null, chaloTextUIState, null, null, composer2, 0, 13);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m672spacedBy0680j_4(liveEtaInfoUiSpecs.b), UiAlignmentKt.b(liveEtaInfoUiSpecs.c), composer2, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, companion);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer2);
            pk0.v(companion2, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (gifImageUIState != null) {
                composer2.startReplaceGroup(-1973892861);
                GifUIKt.a(null, gifImageUIState, composer2, 0, 1);
                composer2.endReplaceGroup();
            } else if (liveEtaInfoUiState.e != null) {
                composer2.startReplaceGroup(-1973890214);
                CommonImageKt.a(liveEtaInfoUiState.e, null, false, composer2, 0, 6);
                composer2 = composer2;
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-1060979654);
                composer2.endReplaceGroup();
            }
            ChaloTextViewKt.a(companion, liveEtaInfoUiState.c, null, null, composer2, 6, 12);
            ImageUIState imageUIState = liveEtaInfoUiState.f;
            if (imageUIState == null) {
                composer2.startReplaceGroup(-1060812999);
            } else {
                composer2.startReplaceGroup(-1060812998);
                Composer composer3 = composer2;
                CommonImageKt.a(imageUIState, null, false, composer3, 0, 6);
                composer2 = composer3;
            }
            composer2.endReplaceGroup();
            if (r1.k(composer2)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new w00(liveEtaInfoUiState, i, 29));
        }
    }

    public static final void h(Modifier modifier, final RouteDetailsUiState state, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        Intrinsics.i(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(1770325776);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changed(modifier) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(state) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1770325776, i3, -1, "app.chalo.livetracking.stoptripplannerresult.compose.components.LegRouteDetailsUi (ItinerarySingleLegCard.kt:96)");
            }
            final int i5 = 0;
            final int i6 = 1;
            FromAndToStopDetailViewKt.b(modifier3, ComposableLambdaKt.rememberComposableLambda(411298460, true, new Function2() { // from class: gc0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i7 = i5;
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    switch (i7) {
                        case 0:
                            if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(411298460, iIntValue, -1, "app.chalo.livetracking.stoptripplannerresult.compose.components.LegRouteDetailsUi.<anonymous> (ItinerarySingleLegCard.kt:100)");
                                }
                                ItinerarySingleLegCardKt.j(state.b, composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1740184675, iIntValue, -1, "app.chalo.livetracking.stoptripplannerresult.compose.components.LegRouteDetailsUi.<anonymous> (ItinerarySingleLegCard.kt:103)");
                                }
                                ItinerarySingleLegCardKt.j(state.c, composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer2.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.f17538a;
                }
            }, composerStartRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-1740184675, true, new Function2() { // from class: gc0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i7 = i6;
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    switch (i7) {
                        case 0:
                            if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(411298460, iIntValue, -1, "app.chalo.livetracking.stoptripplannerresult.compose.components.LegRouteDetailsUi.<anonymous> (ItinerarySingleLegCard.kt:100)");
                                }
                                ItinerarySingleLegCardKt.j(state.b, composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1740184675, iIntValue, -1, "app.chalo.livetracking.stoptripplannerresult.compose.components.LegRouteDetailsUi.<anonymous> (ItinerarySingleLegCard.kt:103)");
                                }
                                ItinerarySingleLegCardKt.j(state.c, composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer2.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.f17538a;
                }
            }, composerStartRestartGroup, 54), false, null, composerStartRestartGroup, (i3 & 14) | 432, 24);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new z(i, i2, 17, modifier2, state));
        }
    }

    public static final void i(EtaAndFareInfoCardUiState etaAndFareInfoCardUiState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1815640263);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(etaAndFareInfoCardUiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1815640263, i2, -1, "app.chalo.livetracking.stoptripplannerresult.compose.components.LiveEtaAndFareInfoUi (ItinerarySingleLegCard.kt:125)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            EtaAndFareInfoSpecs etaAndFareInfoSpecs = etaAndFareInfoCardUiState.f4578a;
            Modifier modifierClip = ClipKt.clip(modifierFillMaxWidth$default, ChaloThemeKt.d(etaAndFareInfoSpecs.b));
            Brush.Companion companion = Brush.INSTANCE;
            List list = etaAndFareInfoSpecs.c.f9929a;
            ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Color.m4595boximpl(ChaloColorTokenKt.c((ChaloColorToken) it.next())));
            }
            Modifier modifierC = ChaloThemeKt.c(BackgroundKt.background$default(modifierClip, Brush.Companion.m4560linearGradientmHitzGk$default(companion, arrayList, 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null), etaAndFareInfoSpecs.f4579a);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            g(etaAndFareInfoCardUiState.b, composerStartRestartGroup, 0);
            FareAndTravelTimeInfoUiState fareAndTravelTimeInfoUiState = etaAndFareInfoCardUiState.c;
            if (fareAndTravelTimeInfoUiState == null) {
                composerStartRestartGroup.startReplaceGroup(-2096855891);
            } else {
                composerStartRestartGroup.startReplaceGroup(-2096855890);
                d(fareAndTravelTimeInfoUiState, composerStartRestartGroup, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new fc0(etaAndFareInfoCardUiState, i, 1));
        }
    }

    public static final void j(StopInfoUiState stopInfoUiState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1960681647);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(stopInfoUiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1960681647, i2, -1, "app.chalo.livetracking.stoptripplannerresult.compose.components.StopDetailsUI (ItinerarySingleLegCard.kt:111)");
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
            ChaloTextViewKt.a(null, stopInfoUiState.f4616a, null, null, composerStartRestartGroup, 0, 13);
            TextUIState.StyledTextUIState styledTextUIState = stopInfoUiState.b;
            if (styledTextUIState == null) {
                composerStartRestartGroup.startReplaceGroup(626671332);
            } else {
                composerStartRestartGroup.startReplaceGroup(626671333);
                TextKt.b(null, styledTextUIState, composerStartRestartGroup, 0, 1);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new fc0(stopInfoUiState, i, 3));
        }
    }
}
