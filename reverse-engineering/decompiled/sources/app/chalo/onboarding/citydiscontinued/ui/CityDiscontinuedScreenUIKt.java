package app.chalo.onboarding.citydiscontinued.ui;

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
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.onboarding.citydiscontinued.CityDiscontinuedUISpecs;
import app.chalo.onboarding.citydiscontinued.CityDiscontinuedUIState;
import app.chalo.onboarding.citydiscontinued.DiscontinuedTextViewsUISpecs;
import app.chalo.onboarding.citydiscontinued.DiscontinuedTextViewsUIState;
import app.chalo.onboarding.citydiscontinued.SupportedCitiesButtonUIState;
import app.chalo.uistate.base.UiAlignmentKt;
import app.chalo.uistate.base.UiArrangementKt;
import defpackage.b3;
import defpackage.mk;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"onboarding_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CityDiscontinuedScreenUIKt {
    public static final void a(CityDiscontinuedUIState state, Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.i(state, "state");
        SupportedCitiesButtonUIState supportedCitiesButtonUIState = state.e;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1571548572);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1571548572, i2, -1, "app.chalo.onboarding.citydiscontinued.ui.CityDiscontinuedScreenUI (CityDiscontinuedScreenUI.kt:19)");
            }
            CityDiscontinuedUISpecs cityDiscontinuedUISpecs = state.f6558a;
            DiscontinuedTextViewsUIState discontinuedTextViewsUIState = state.d;
            DiscontinuedTextViewsUISpecs discontinuedTextViewsUISpecs = discontinuedTextViewsUIState.f6561a;
            ChaloToolBarKt.b(state.b, null, null, composerStartRestartGroup, 0, 14);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierC = ChaloThemeKt.c(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), cityDiscontinuedUISpecs.c);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(UiArrangementKt.a(cityDiscontinuedUISpecs.b), UiAlignmentKt.a(cityDiscontinuedUISpecs.f6557a), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
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
            CommonImageKt.a(state.c, SizeKt.wrapContentWidth$default(companion, null, false, 3, null), false, composerStartRestartGroup, 48, 4);
            Modifier modifierC2 = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), discontinuedTextViewsUISpecs.b);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), UiAlignmentKt.a(discontinuedTextViewsUISpecs.f6560a), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC2);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
            pk0.v(companion2, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            ChaloTextViewKt.a(null, discontinuedTextViewsUIState.b, null, null, composerStartRestartGroup, 0, 13);
            ChaloTextViewKt.a(ChaloThemeKt.c(companion, discontinuedTextViewsUISpecs.c), discontinuedTextViewsUIState.c, null, null, composerStartRestartGroup, 0, 12);
            ChaloTextViewKt.a(ChaloThemeKt.c(companion, discontinuedTextViewsUISpecs.d), discontinuedTextViewsUIState.d, null, null, composerStartRestartGroup, 0, 12);
            composer2 = composerStartRestartGroup;
            composer2.endNode();
            if (b3.s(0, 0, composer2, SizeKt.m833width3ABfNKs(ChaloThemeKt.c(companion, cityDiscontinuedUISpecs.d), supportedCitiesButtonUIState.f6562a), supportedCitiesButtonUIState.b)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new mk(state, i, 12));
        }
    }
}
