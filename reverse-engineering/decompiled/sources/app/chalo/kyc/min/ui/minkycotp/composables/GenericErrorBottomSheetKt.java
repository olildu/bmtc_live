package app.chalo.kyc.min.ui.minkycotp.composables;

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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.TextKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.kyc.min.ui.minkycotp.GenericErrorBottomSheetUISpecs;
import app.chalo.kyc.min.ui.minkycotp.GenericErrorBottomSheetUIState;
import app.chalo.uistate.base.UiAlignmentKt;
import app.chalo.uistate.button.ButtonUIState;
import defpackage.pk0;
import defpackage.w00;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kyc_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class GenericErrorBottomSheetKt {
    public static final void a(GenericErrorBottomSheetUIState state, Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.i(state, "state");
        ButtonUIState buttonUIState = state.f;
        Composer composerStartRestartGroup = composer.startRestartGroup(-57095779);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-57095779, i2, -1, "app.chalo.kyc.min.ui.minkycotp.composables.GenericErrorBottomSheet (GenericErrorBottomSheet.kt:17)");
            }
            GenericErrorBottomSheetUISpecs genericErrorBottomSheetUISpecs = state.f4138a;
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierC = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), genericErrorBottomSheetUISpecs.f4137a);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
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
            composer2 = composerStartRestartGroup;
            CommonImageKt.a(state.c, ColumnScopeInstance.INSTANCE.align(companion, UiAlignmentKt.a(genericErrorBottomSheetUISpecs.b)), false, composer2, 0, 4);
            ChaloSpacersKt.p(composer2, 0);
            if (state.d == null) {
                composer2.startReplaceGroup(520902202);
            } else {
                composer2.startReplaceGroup(520902203);
                TextKt.c(state.d, null, null, null, composer2, 0, 14);
                composer2 = composer2;
            }
            composer2.endReplaceGroup();
            if (state.e == null) {
                composer2.startReplaceGroup(520997558);
            } else {
                composer2.startReplaceGroup(520997559);
                ChaloSpacersKt.t(composer2, 0);
                Composer composer3 = composer2;
                TextKt.c(state.e, null, null, null, composer3, 0, 14);
                composer2 = composer3;
            }
            composer2.endReplaceGroup();
            if (buttonUIState == null) {
                composer2.startReplaceGroup(521134609);
            } else {
                composer2.startReplaceGroup(521134610);
                ChaloSpacersKt.g(composer2, 0);
                ChaloFilledButtonKt.a(6, 0, composer2, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), buttonUIState);
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new w00(state, i, 21));
        }
    }
}
