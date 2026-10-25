package app.chalo.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
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
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.UiAlignmentKt;
import app.chalo.uistate.base.UiArrangementKt;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.error.NewErrorWithMsgAndRetryUISpecs;
import app.chalo.uistate.error.StandardErrorScreenUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.dq;
import defpackage.gf;
import defpackage.pk0;
import defpackage.z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class NewGenericErrorScreenWithMsgAndRetryKt {
    public static final void a(Modifier modifier, StandardErrorScreenUIState.NewErrorWithMsgAndRetry state, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Composer composer2;
        Modifier modifier3;
        Composer composer3;
        Intrinsics.i(state, "state");
        NewErrorWithMsgAndRetryUISpecs newErrorWithMsgAndRetryUISpecs = state.f;
        Composer composerStartRestartGroup = composer.startRestartGroup(1377514605);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = i | (composerStartRestartGroup.changed(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(state) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1377514605, i3, -1, "app.chalo.compose.NewGenericErrorScreenWithMsgAndRetry (NewGenericErrorScreenWithMsgAndRetry.kt:26)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
            ChaloColorToken chaloColorToken = newErrorWithMsgAndRetryUISpecs.b;
            float f = newErrorWithMsgAndRetryUISpecs.l;
            Modifier modifierC = ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(modifierFillMaxSize$default, ChaloColorTokenKt.c(chaloColorToken), null, 2, null), newErrorWithMsgAndRetryUISpecs.c);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            Modifier modifierC2 = ChaloThemeKt.c(dq.a(ColumnScopeInstance.INSTANCE, SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), 1.0f, false, 2, null), newErrorWithMsgAndRetryUISpecs.d);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(UiArrangementKt.a(newErrorWithMsgAndRetryUISpecs.g), UiAlignmentKt.a(newErrorWithMsgAndRetryUISpecs.f), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC2);
            Function0<ComposeUiNode> constructor2 = companion.getConstructor();
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
            pk0.v(companion, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl2, Integer.valueOf(i6), composerM3915constructorimpl2));
            ImageUIState imageUIState = state.f10024a;
            if (imageUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-1814454354);
                composerStartRestartGroup.endReplaceGroup();
                composer3 = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1814454353);
                composer3 = composerStartRestartGroup;
                CommonImageKt.a(imageUIState, null, false, composer3, 0, 6);
                gf.r(Modifier.INSTANCE, newErrorWithMsgAndRetryUISpecs.j, composer3, 0);
            }
            Composer composer4 = composer3;
            ChaloTextViewKt.a(null, state.b, null, null, composer4, 0, 13);
            composer2 = composer4;
            TextUIState.ChaloTextUIState chaloTextUIState = state.c;
            if (chaloTextUIState == null) {
                composer2.startReplaceGroup(-1814221389);
            } else {
                composer2.startReplaceGroup(-1814221388);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(Modifier.INSTANCE, newErrorWithMsgAndRetryUISpecs.f10022a), composer2, 0);
                ChaloTextViewKt.a(null, chaloTextUIState, null, null, composer2, 0, 13);
                composer2 = composer2;
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            ButtonUIState buttonUIState = state.d;
            if (buttonUIState == null) {
                composer2.startReplaceGroup(-630277466);
            } else {
                composer2.startReplaceGroup(-630277465);
                ChaloFilledButtonKt.a(0, 0, composer2, SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), f), buttonUIState);
            }
            composer2.endReplaceGroup();
            ButtonUIState buttonUIState2 = state.e;
            if (buttonUIState2 == null) {
                composer2.startReplaceGroup(-630032039);
            } else {
                composer2.startReplaceGroup(-630032038);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion2, newErrorWithMsgAndRetryUISpecs.k), composer2, 0);
                ChaloFilledButtonKt.a(0, 0, composer2, SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), f), buttonUIState2);
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new z(i, i2, 21, modifier3, state));
        }
    }
}
