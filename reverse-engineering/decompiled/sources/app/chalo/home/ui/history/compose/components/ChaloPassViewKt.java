package app.chalo.home.ui.history.compose.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
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
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.TextKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.home.ui.history.uistate.pass.BusPassDetailsContainerUiState;
import app.chalo.home.ui.history.uistate.pass.BusPassSpec;
import app.chalo.home.ui.history.uistate.pass.BusPassUiState;
import app.chalo.home.ui.history.uistate.pass.ChaloBusPassDetailsContainerSpec;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.d0;
import defpackage.fj;
import defpackage.pk0;
import defpackage.r1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloPassViewKt {
    public static final void a(Modifier modifier, BusPassDetailsContainerUiState detailsContainer, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composer3;
        Intrinsics.i(modifier, "modifier");
        Intrinsics.i(detailsContainer, "detailsContainer");
        Object obj = detailsContainer.f3512a;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1239299825);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(detailsContainer) : composerStartRestartGroup.changedInstance(detailsContainer) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1239299825, i2, -1, "app.chalo.home.ui.history.compose.components.ChaloBusPassDetailsComponent (ChaloPassView.kt:109)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            ChaloBusPassDetailsContainerSpec chaloBusPassDetailsContainerSpec = (ChaloBusPassDetailsContainerSpec) obj;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(BackgroundKt.m263backgroundbw27NRU(modifier, ChaloColorTokenKt.c(chaloBusPassDetailsContainerSpec.c), ChaloThemeKt.d(chaloBusPassDetailsContainerSpec.b)), 0.0f, 1, null);
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ImageUIState imageUIState = detailsContainer.e;
            if (imageUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-1871431168);
                composerStartRestartGroup.endReplaceGroup();
                composer3 = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1871431167);
                composer3 = composerStartRestartGroup;
                CommonImageKt.a(imageUIState, boxScopeInstance.align(Modifier.INSTANCE, companion.getBottomEnd()), false, composer3, 0, 4);
                composer3.endReplaceGroup();
            }
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(ChaloThemeKt.c(Modifier.INSTANCE, chaloBusPassDetailsContainerSpec.f3515a), 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion.getStart(), composer3, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default2);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (!(composer3.getApplier() != null)) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor2);
            } else {
                composer3.useNode();
            }
            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer3);
            pk0.v(companion2, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Composer composer4 = composer3;
            ChaloTextViewKt.a(null, detailsContainer.b, null, null, composer4, 0, 13);
            ChaloSpacersKt.a(chaloBusPassDetailsContainerSpec.d, composer4, 0);
            ChaloTextViewKt.a(null, detailsContainer.c, null, null, composer4, 0, 13);
            composer2 = composer4;
            TextUIState.StyledTextUIState styledTextUIState = detailsContainer.d;
            if (styledTextUIState == null) {
                composer2.startReplaceGroup(1188449682);
            } else {
                composer2.startReplaceGroup(1188449683);
                ChaloSpacersKt.a(chaloBusPassDetailsContainerSpec.e, composer2, 0);
                TextKt.b(null, styledTextUIState, composer2, 0, 1);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new fj(modifier, detailsContainer, i, 10));
        }
    }

    public static final void b(Modifier modifier, BusPassUiState uiState, Composer composer, int i) {
        int i2;
        Intrinsics.i(uiState, "uiState");
        Object obj = uiState.f3514a;
        Composer composerStartRestartGroup = composer.startRestartGroup(518297272);
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
                ComposerKt.traceEventStart(518297272, i2, -1, "app.chalo.home.ui.history.compose.components.ChaloBusPassView (ChaloPassView.kt:51)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            BusPassSpec busPassSpec = (BusPassSpec) obj;
            ChaloRoundedCardKt.b(SizeKt.fillMaxWidth$default(ChaloThemeKt.c(modifier, busPassSpec.f3513a), 0.0f, 1, null), ChaloThemeKt.d(busPassSpec.b), 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(387530937, true, new d0(15, busPassSpec, uiState), composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fj(modifier, uiState, i, 9));
        }
    }
}
