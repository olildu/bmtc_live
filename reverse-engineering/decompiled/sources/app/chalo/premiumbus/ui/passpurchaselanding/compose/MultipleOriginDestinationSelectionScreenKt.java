package app.chalo.premiumbus.ui.passpurchaselanding.compose;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.OriginDestinationSideIndicatorKt;
import app.chalo.compose.components.PlotlineComposeWidgetKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.premiumbus.ui.passpurchaselanding.multipleorigindestinationselectionscreen.ModeToReachFromStopUIState;
import app.chalo.premiumbus.ui.passpurchaselanding.multipleorigindestinationselectionscreen.MultipleOriginDestinationSelectionScreenUISpec;
import app.chalo.premiumbus.ui.passpurchaselanding.multipleorigindestinationselectionscreen.MultipleOriginDestinationSelectionScreenUIState;
import app.chalo.premiumbus.ui.passpurchaselanding.multipleorigindestinationselectionscreen.OriginDestinationInfoUISpec;
import app.chalo.premiumbus.ui.passpurchaselanding.multipleorigindestinationselectionscreen.OriginDestinationInfoUIState;
import app.chalo.premiumbus.ui.passpurchaselanding.multipleorigindestinationselectionscreen.OriginDestinationSelectionCardUISpec;
import app.chalo.premiumbus.ui.passpurchaselanding.multipleorigindestinationselectionscreen.OriginDestinationSelectionCardUIState;
import app.chalo.premiumbus.ui.passpurchaselanding.multipleorigindestinationselectionscreen.OriginDestinationSelectionCtaItemUIState;
import app.chalo.premiumbus.ui.productselection.compose.uistate.PBProductCardComposableKt;
import app.chalo.premiumbus.ui.productselection.compose.uistate.ProductLabelUiState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.TitleSubtitleUiState;
import defpackage.b3;
import defpackage.gd0;
import defpackage.gf;
import defpackage.i41;
import defpackage.la0;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.ug0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MultipleOriginDestinationSelectionScreenKt {
    public static final void a(Modifier modifier, OriginDestinationInfoUIState uiState, Composer composer, int i) {
        Intrinsics.i(uiState, "uiState");
        Object obj = uiState.f7684a;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1768267584);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(uiState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            modifier = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1768267584, i2, -1, "app.chalo.premiumbus.ui.passpurchaselanding.compose.FromAndToStopNames (MultipleOriginDestinationSelectionScreen.kt:151)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            OriginDestinationInfoUISpec originDestinationInfoUISpec = (OriginDestinationInfoUISpec) obj;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ModeToReachFromStopUIState modeToReachFromStopUIState = uiState.b;
            if (modeToReachFromStopUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-886889483);
            } else {
                composerStartRestartGroup.startReplaceGroup(-886889482);
                d(null, modeToReachFromStopUIState, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            ChaloTextViewKt.a(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), uiState.c, null, null, composerStartRestartGroup, 6, 12);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(modifier, originDestinationInfoUISpec.c), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-886624805);
            composerStartRestartGroup.endReplaceGroup();
            ModeToReachFromStopUIState modeToReachFromStopUIState2 = uiState.d;
            if (modeToReachFromStopUIState2 == null) {
                composerStartRestartGroup.startReplaceGroup(-886459947);
            } else {
                composerStartRestartGroup.startReplaceGroup(-886459946);
                d(null, modeToReachFromStopUIState2, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            ChaloTextViewKt.a(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), uiState.e, null, null, composerStartRestartGroup, 6, 12);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ug0(i, 27, modifier, uiState));
        }
    }

    public static final void b(Modifier modifier, OriginDestinationSelectionCardUIState originDestinationSelectionCardUIState, Composer composer, int i) {
        Modifier modifier2;
        Object obj = originDestinationSelectionCardUIState.f7686a;
        Composer composerStartRestartGroup = composer.startRestartGroup(1335235503);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(originDestinationSelectionCardUIState) : composerStartRestartGroup.changedInstance(originDestinationSelectionCardUIState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1335235503, i2, -1, "app.chalo.premiumbus.ui.passpurchaselanding.compose.FromAndToStopUIComponent (MultipleOriginDestinationSelectionScreen.kt:119)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            OriginDestinationSelectionCardUISpec originDestinationSelectionCardUISpec = (OriginDestinationSelectionCardUISpec) obj;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ProductLabelUiState productLabelUiState = originDestinationSelectionCardUIState.b;
            if (productLabelUiState == null) {
                composerStartRestartGroup.startReplaceGroup(-10247231);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-10247230);
                PBProductCardComposableKt.a(null, productLabelUiState, composerStartRestartGroup, 0);
                gf.r(companion, originDestinationSelectionCardUISpec.b, composerStartRestartGroup, 0);
            }
            Modifier modifierHeight = IntrinsicKt.height(companion, IntrinsicSize.Min);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) ((currentCompositeKeyHashCode2 >>> 32) ^ currentCompositeKeyHashCode2);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierHeight);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (!(composerStartRestartGroup.getApplier() != null)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            OriginDestinationSideIndicatorKt.a(SizeKt.fillMaxHeight(companion, 0.8f), originDestinationSelectionCardUISpec.g, originDestinationSelectionCardUISpec.h, composerStartRestartGroup, 6, 0);
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion, originDestinationSelectionCardUISpec.c), composerStartRestartGroup, 0);
            a(null, originDestinationSelectionCardUIState.d, composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            modifier2 = companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                modifier2 = companion;
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ug0(i, 25, modifier2, originDestinationSelectionCardUIState));
        }
    }

    public static final void c(Modifier modifier, MultipleOriginDestinationSelectionScreenUIState multipleOriginDestinationSelectionScreenUIState, Composer composer, int i) {
        Modifier modifier2;
        int i2;
        TitleSubtitleUiState titleSubtitleUiState = multipleOriginDestinationSelectionScreenUIState.d;
        List list = multipleOriginDestinationSelectionScreenUIState.c;
        MultipleOriginDestinationSelectionScreenUISpec multipleOriginDestinationSelectionScreenUISpec = multipleOriginDestinationSelectionScreenUIState.f7682a;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1447888350);
        int i3 = i | 6;
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(multipleOriginDestinationSelectionScreenUIState) ? 32 : 16;
        }
        int i4 = 0;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1447888350, i3, -1, "app.chalo.premiumbus.ui.passpurchaselanding.compose.MultipleOriginDestinationSelectionScreen (MultipleOriginDestinationSelectionScreen.kt:42)");
            }
            boolean zChanged = composerStartRestartGroup.changed(multipleOriginDestinationSelectionScreenUISpec);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(multipleOriginDestinationSelectionScreenUISpec);
                objRememberedValue = multipleOriginDestinationSelectionScreenUISpec;
            }
            MultipleOriginDestinationSelectionScreenUISpec multipleOriginDestinationSelectionScreenUISpec2 = (MultipleOriginDestinationSelectionScreenUISpec) objRememberedValue;
            Modifier modifierC = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), multipleOriginDestinationSelectionScreenUISpec2.f7681a);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion4 = companion;
            ChaloTextViewKt.a(null, multipleOriginDestinationSelectionScreenUIState.b, null, null, composerStartRestartGroup, 0, 13);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion4, multipleOriginDestinationSelectionScreenUISpec2.b), composerStartRestartGroup, 0);
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
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
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i6), composerM3915constructorimpl2));
            composerStartRestartGroup.startReplaceGroup(-2113960769);
            int i7 = 0;
            for (Object obj : list) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                OriginDestinationSelectionCardUIState originDestinationSelectionCardUIState = (OriginDestinationSelectionCardUIState) obj;
                Alignment.Companion companion5 = Alignment.INSTANCE;
                Alignment.Horizontal centerHorizontally = companion5.getCenterHorizontally();
                Modifier.Companion companion6 = Modifier.INSTANCE;
                Arrangement arrangement2 = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), centerHorizontally, composerStartRestartGroup, 48);
                long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, i4);
                int i9 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion6);
                ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor3 = companion7.getConstructor();
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
                pk0.v(companion7, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy3, composerM3915constructorimpl3, currentCompositionLocalMap3);
                Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion7, composerM3915constructorimpl3, Integer.valueOf(i9), composerM3915constructorimpl3));
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion6, multipleOriginDestinationSelectionScreenUISpec.c), composerStartRestartGroup, 0);
                Modifier modifierA = PlotlineComposeWidgetKt.a(companion6, "PL_Pickup_Drop_Stop_Card_" + i7);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(originDestinationSelectionCardUIState);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new gd0(originDestinationSelectionCardUIState, 21);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Modifier modifierM299clickableoSLSa3U$default = ClickableKt.m299clickableoSLSa3U$default(modifierA, false, null, null, null, (Function0) objRememberedValue2, 15, null);
                OriginDestinationSelectionCardUISpec originDestinationSelectionCardUISpec = originDestinationSelectionCardUIState.f7686a;
                int i10 = i7;
                float f = originDestinationSelectionCardUISpec.e;
                List list2 = list;
                Modifier.Companion companion8 = companion4;
                Composer composer2 = composerStartRestartGroup;
                ChaloRoundedCardKt.b(modifierM299clickableoSLSa3U$default, ChaloThemeKt.d(originDestinationSelectionCardUISpec.f), f, 0.0f, ComposableLambdaKt.rememberComposableLambda(-2130719881, true, new la0(originDestinationSelectionCardUIState, 7), composerStartRestartGroup, 54), composer2, 24576, 8);
                composerStartRestartGroup = composer2;
                if (i10 != list2.size() - 1) {
                    composerStartRestartGroup.startReplaceGroup(654888686);
                    gf.r(companion6, multipleOriginDestinationSelectionScreenUISpec.c, composerStartRestartGroup, 0);
                } else {
                    composerStartRestartGroup.startReplaceGroup(650379116);
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (i10 == list2.size() - 1) {
                    composerStartRestartGroup.startReplaceGroup(655117714);
                    Modifier modifierC2 = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), multipleOriginDestinationSelectionScreenUISpec2.f7681a);
                    MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), companion5.getCenterHorizontally(), composerStartRestartGroup, 48);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    int i11 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC2);
                    Function0<ComposeUiNode> constructor4 = companion7.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor4);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composerStartRestartGroup);
                    pk0.v(companion7, composerM3915constructorimpl4, measurePolicyColumnMeasurePolicy4, composerM3915constructorimpl4, currentCompositionLocalMap4);
                    Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion7, composerM3915constructorimpl4, Integer.valueOf(i11), composerM3915constructorimpl4));
                    ChaloTextViewKt.a(null, titleSubtitleUiState.b, null, null, composerStartRestartGroup, 0, 13);
                    TextUIState.ChaloTextUIState chaloTextUIState = titleSubtitleUiState.c;
                    if (chaloTextUIState == null) {
                        composerStartRestartGroup.startReplaceGroup(-1470964610);
                        composerStartRestartGroup.endReplaceGroup();
                        i2 = 0;
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1470964609);
                        i2 = 0;
                        ChaloSpacersKt.a(multipleOriginDestinationSelectionScreenUISpec.b, composerStartRestartGroup, 0);
                        ChaloTextViewKt.a(null, chaloTextUIState, null, null, composerStartRestartGroup, 0, 13);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.endNode();
                } else {
                    i2 = 0;
                    composerStartRestartGroup.startReplaceGroup(650379116);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                i4 = i2;
                i7 = i8;
                companion4 = companion8;
                list = list2;
            }
            Modifier.Companion companion9 = companion4;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion9;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ug0(i, 24, modifier2, multipleOriginDestinationSelectionScreenUIState));
        }
    }

    public static final void d(Modifier modifier, ModeToReachFromStopUIState uiState, Composer composer, int i) {
        Modifier modifier2;
        Intrinsics.i(uiState, "uiState");
        Composer composerStartRestartGroup = composer.startRestartGroup(1014555184);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(uiState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1014555184, i2, -1, "app.chalo.premiumbus.ui.passpurchaselanding.compose.PBModeToReachFromAndToUI (MultipleOriginDestinationSelectionScreen.kt:183)");
            }
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
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
            TextUIState.ChaloTextUIState chaloTextUIState = uiState.c;
            if (chaloTextUIState == null) {
                composerStartRestartGroup.startReplaceGroup(1038428988);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1038428989);
                ChaloTextViewKt.a(null, chaloTextUIState, null, null, composerStartRestartGroup, 0, 13);
                nf1.t(companion, uiState.f7680a, composerStartRestartGroup, 0);
            }
            CommonImageKt.a(uiState.d, null, false, composerStartRestartGroup, 0, 6);
            composerStartRestartGroup = composerStartRestartGroup;
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion, uiState.b), composerStartRestartGroup, 0);
            ChaloTextViewKt.a(null, uiState.e, null, null, composerStartRestartGroup, 0, 13);
            composerStartRestartGroup.endNode();
            modifier2 = companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                modifier2 = companion;
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ug0(i, 28, modifier2, uiState));
        }
    }

    public static final void e(Modifier modifier, OriginDestinationSelectionCtaItemUIState uiState, Composer composer, int i) {
        int i2;
        Intrinsics.i(uiState, "uiState");
        Composer composerStartRestartGroup = composer.startRestartGroup(181291102);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(uiState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(181291102, i2, -1, "app.chalo.premiumbus.ui.passpurchaselanding.compose.PremiumStopSelectionCardCtaUI (MultipleOriginDestinationSelectionScreen.kt:203)");
            }
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextUIState.ChaloTextUIState chaloTextUIState = uiState.c;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            ChaloTextViewKt.a(PaddingKt.m786paddingVpY3zN4$default(companion2, ChaloTheme.b(composerStartRestartGroup, 0).f, 0.0f, 2, null), chaloTextUIState, null, null, composerStartRestartGroup, 0, 12);
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion2, uiState.f7687a), composerStartRestartGroup, 0);
            if (b3.s(0, 0, composerStartRestartGroup, SizeKt.m814height3ABfNKs(i41.a(rowScopeInstance, companion2, 1.0f, false, 2, null), uiState.b), uiState.d)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ug0(i, 26, modifier, uiState));
        }
    }
}
