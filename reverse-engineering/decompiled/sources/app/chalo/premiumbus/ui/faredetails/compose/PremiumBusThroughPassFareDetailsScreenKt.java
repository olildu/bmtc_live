package app.chalo.premiumbus.ui.faredetails.compose;

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
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.components.ChaloDividerComposableKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsContent;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusThroughPassUISpecs;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusTotalBookingsUiState;
import app.chalo.uistate.base.ChaloColorTokenKt;
import defpackage.au0;
import defpackage.b3;
import defpackage.bu0;
import defpackage.la0;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusThroughPassFareDetailsScreenKt {
    public static final void a(PremiumBusFareDetailsContent.ThroughPass throughPass, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-975152497);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(throughPass) : composerStartRestartGroup.changedInstance(throughPass) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            modifier2 = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-975152497, i3, -1, "app.chalo.premiumbus.ui.faredetails.compose.PremiumBusThroughPassFareDetailsContent (PremiumBusThroughPassFareDetailsScreen.kt:39)");
            }
            PremiumBusThroughPassUISpecs premiumBusThroughPassUISpecs = throughPass.f;
            PremiumBusTotalBookingsUiState premiumBusTotalBookingsUiState = throughPass.f7577a;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloSpacersKt.o(composerStartRestartGroup, 0);
            ChaloDividerComposableKt.a(premiumBusThroughPassUISpecs.f7635a.f10017a, 6, ChaloColorTokenKt.c(premiumBusThroughPassUISpecs.f7635a.b), composerStartRestartGroup, SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null));
            ChaloSpacersKt.o(composerStartRestartGroup, 0);
            Modifier modifierC = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), premiumBusThroughPassUISpecs.c);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion.getTop(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
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
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ChaloTextViewKt.a(null, premiumBusTotalBookingsUiState.f7638a, null, null, composerStartRestartGroup, 0, 13);
            ChaloTextViewKt.a(null, premiumBusTotalBookingsUiState.b, null, null, composerStartRestartGroup, 0, 13);
            composerStartRestartGroup.endNode();
            if (b3.s(0, 0, composerStartRestartGroup, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), premiumBusThroughPassUISpecs.d), throughPass.b)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new bu0(throughPass, modifier2, i, 17));
        }
    }

    public static final void b(PremiumBusFareDetailsUiState state, PremiumBusFareDetailsContent content, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Intrinsics.i(state, "state");
        Intrinsics.i(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1668315584);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(content) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1668315584, i3, -1, "app.chalo.premiumbus.ui.faredetails.compose.PremiumBusThroughPassFareDetailsScreen (PremiumBusThroughPassFareDetailsScreen.kt:23)");
            }
            PremiumBusFareDetailsScaffoldKt.b(state, companion, Arrangement.INSTANCE.getSpaceBetween(), null, ComposableLambdaKt.rememberComposableLambda(-2145492510, true, new la0(content, 25), composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | 24960 | ((i3 >> 3) & 112), 8);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new au0(state, content, modifier2, i, 1));
        }
    }
}
