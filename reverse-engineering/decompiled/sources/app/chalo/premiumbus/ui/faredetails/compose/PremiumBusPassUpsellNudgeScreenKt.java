package app.chalo.premiumbus.ui.faredetails.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
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
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsContent;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsScreenUISpecs;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsTermsUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsTripSummaryUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareSplitSectionUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusIncludedInPassBannerUiState;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import defpackage.dq;
import defpackage.la0;
import defpackage.pk0;
import defpackage.u6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusPassUpsellNudgeScreenKt {
    public static final void a(PremiumBusFareDetailsUiState state, PremiumBusFareDetailsContent.PassUpsellNudge content, PremiumBusFareDetailsTripSummaryUiState tripSummary, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        Unit unit;
        Intrinsics.i(state, "state");
        Intrinsics.i(content, "content");
        Intrinsics.i(tripSummary, "tripSummary");
        Composer composerStartRestartGroup = composer.startRestartGroup(837956078);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(content) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(tripSummary) ? 256 : 128;
        }
        int i4 = i2 | 3072;
        if (composerStartRestartGroup.shouldExecute((i4 & 1171) != 1170, i4 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(837956078, i4, -1, "app.chalo.premiumbus.ui.faredetails.compose.PremiumBusPassUpsellNudgeScreen (PremiumBusPassUpsellNudgeScreen.kt:29)");
            }
            PremiumBusFareDetailsScreenUISpecs premiumBusFareDetailsScreenUISpecs = state.f;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            ChaloColorToken chaloColorToken = premiumBusFareDetailsScreenUISpecs.f7606a;
            ChaloPadding chaloPadding = premiumBusFareDetailsScreenUISpecs.b;
            float f = premiumBusFareDetailsScreenUISpecs.c;
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(modifierFillMaxSize$default, ChaloColorTokenKt.c(chaloColorToken), null, 2, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM264backgroundbw27NRU$default);
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
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(dq.a(ColumnScopeInstance.INSTANCE, companion, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
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
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, f), composerStartRestartGroup, 0);
            PremiumBusIncludedInPassBannerUiState premiumBusIncludedInPassBannerUiState = content.b;
            if (premiumBusIncludedInPassBannerUiState == null) {
                composerStartRestartGroup.startReplaceGroup(-327053554);
                composerStartRestartGroup.endReplaceGroup();
                i3 = i4;
                unit = null;
                modifier3 = null;
            } else {
                composerStartRestartGroup.startReplaceGroup(-327053553);
                Modifier modifierM263backgroundbw27NRU = BackgroundKt.m263backgroundbw27NRU(ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), chaloPadding), ChaloColorTokenKt.c(premiumBusIncludedInPassBannerUiState.b), ChaloTheme.d(composerStartRestartGroup, 0).g);
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                i3 = i4;
                int i7 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM263backgroundbw27NRU);
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
                pk0.v(companion3, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy3, composerM3915constructorimpl3, currentCompositionLocalMap3);
                Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i7), composerM3915constructorimpl3));
                modifier3 = null;
                ChaloTextViewKt.a(PaddingKt.m785paddingVpY3zN4(companion, ChaloThemeHelper.a().g, ChaloThemeHelper.a().f), premiumBusIncludedInPassBannerUiState.f7619a, null, null, composerStartRestartGroup, 0, 12);
                PremiumBusFareDetailsTripSummaryCardKt.a(tripSummary, null, composerStartRestartGroup, (i3 >> 6) & 14, 2);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
                unit = Unit.f17538a;
            }
            if (unit == null) {
                composerStartRestartGroup.startReplaceGroup(1790590819);
                PremiumBusFareDetailsTripSummaryCardKt.a(tripSummary, ChaloThemeKt.c(companion, chaloPadding), composerStartRestartGroup, (i3 >> 6) & 14, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1790564438);
                composerStartRestartGroup.endReplaceGroup();
            }
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, f), composerStartRestartGroup, 0);
            PremiumBusFareDetailsCommonViewsKt.b(modifier3, ComposableLambdaKt.rememberComposableLambda(1890620478, true, new la0(content, 20), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState = content.d;
            if (premiumBusFareSplitSectionUiState == null) {
                composerStartRestartGroup.startReplaceGroup(-325715377);
            } else {
                composerStartRestartGroup.startReplaceGroup(-325715376);
                PremiumBusFreshPurchaseFareDetailsScreenKt.d(premiumBusFareSplitSectionUiState, modifier3, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            PremiumBusFareDetailsTermsUiState premiumBusFareDetailsTermsUiState = content.f;
            if (premiumBusFareDetailsTermsUiState == null) {
                composerStartRestartGroup.startReplaceGroup(-325626283);
            } else {
                composerStartRestartGroup.startReplaceGroup(-325626282);
                PremiumBusFreshPurchaseFareDetailsScreenKt.l(premiumBusFareDetailsTermsUiState, modifier3, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            PremiumBusFareDetailsCommonViewsKt.e(content.h, modifier3, composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new u6(i, 24, state, content, tripSummary, modifier2));
        }
    }
}
