package app.chalo.premiumbus.ui.passpurchaselanding.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.components.text.TitleSubtitleViewKt;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.premiumbus.ui.passpurchaselanding.NewRouteSuggestionUISpecs;
import app.chalo.premiumbus.ui.passpurchaselanding.NewRouteSuggestionUIState;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.divider.DividerUIStateKt;
import defpackage.b3;
import defpackage.bu0;
import defpackage.i41;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusNewRouteSuggestionScreenKt {
    public static final void a(Modifier modifier, NewRouteSuggestionUIState newRouteSuggestionUIState, Composer composer, int i) {
        Composer composer2;
        Modifier modifier2;
        DividerUIState dividerUIState = newRouteSuggestionUIState.e;
        Object obj = newRouteSuggestionUIState.f7642a;
        Composer composerStartRestartGroup = composer.startRestartGroup(1797905777);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(newRouteSuggestionUIState) : composerStartRestartGroup.changedInstance(newRouteSuggestionUIState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            modifier2 = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1797905777, i2, -1, "app.chalo.premiumbus.ui.passpurchaselanding.compose.PremiumBusNewRouteSuggestionScreen (PremiumBusNewRouteSuggestionScreen.kt:22)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            NewRouteSuggestionUISpecs newRouteSuggestionUISpecs = (NewRouteSuggestionUISpecs) obj;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
            ChaloPadding chaloPadding = newRouteSuggestionUISpecs.f7641a;
            float f = newRouteSuggestionUISpecs.c;
            Modifier modifierC = ChaloThemeKt.c(modifierFillMaxWidth$default, chaloPadding);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
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
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getTop(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) ((currentCompositeKeyHashCode2 >>> 32) ^ currentCompositeKeyHashCode2);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
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
            pk0.v(companion2, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ChaloTextViewKt.a(null, newRouteSuggestionUIState.b, null, null, composerStartRestartGroup, 0, 13);
            SpacerKt.Spacer(i41.a(rowScopeInstance, modifier2, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            CommonImageKt.a(newRouteSuggestionUIState.f, null, false, composerStartRestartGroup, 0, 6);
            composer2 = composerStartRestartGroup;
            composer2.endNode();
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(modifier2, newRouteSuggestionUISpecs.b), composer2, 0);
            TitleSubtitleViewKt.a(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), newRouteSuggestionUIState.c, composer2, 6, 0);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(modifier2, f), composer2, 0);
            DividerUIStateKt.a(null, dividerUIState, composer2, 0, 1);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(modifier2, newRouteSuggestionUISpecs.d), composer2, 0);
            TitleSubtitleViewKt.a(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), newRouteSuggestionUIState.d, composer2, 6, 0);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(modifier2, f), composer2, 0);
            DividerUIStateKt.a(null, dividerUIState, composer2, 0, 1);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(modifier2, newRouteSuggestionUISpecs.e), composer2, 0);
            ChaloFilledButtonKt.a(6, 0, composer2, SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), newRouteSuggestionUIState.g);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(modifier2, newRouteSuggestionUISpecs.f), composer2, 0);
            if (b3.s(6, 0, composer2, SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), newRouteSuggestionUIState.h)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new bu0(i, 2, modifier2, newRouteSuggestionUIState));
        }
    }
}
