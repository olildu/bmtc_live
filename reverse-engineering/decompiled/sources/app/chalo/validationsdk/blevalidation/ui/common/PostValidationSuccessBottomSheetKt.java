package app.chalo.validationsdk.blevalidation.ui.common;

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
import app.chalo.compose.components.TextKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.uistate.base.UiAlignment;
import app.chalo.uistate.base.UiAlignmentKt;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.eq0;
import defpackage.gf;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"validationsdk_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PostValidationSuccessBottomSheetKt {
    public static final void a(QRValidationBottomSheetUIState.PostValidationSuccessBottomSheetUIState state, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composer3;
        Intrinsics.i(state, "state");
        PostValidationSuccessBottomSheetUISpecs postValidationSuccessBottomSheetUISpecs = state.b;
        Composer composerStartRestartGroup = composer.startRestartGroup(1157520172);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1157520172, i2, -1, "app.chalo.validationsdk.blevalidation.ui.common.PostValidationSuccessBottomSheet (PostValidationSuccessBottomSheet.kt:18)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            ChaloPadding chaloPadding = postValidationSuccessBottomSheetUISpecs.f;
            UiAlignment.Horizontal horizontal = postValidationSuccessBottomSheetUISpecs.f10627a;
            Modifier modifierThen = ChaloThemeKt.c(modifierFillMaxWidth$default, chaloPadding).then(modifier);
            Alignment.Horizontal horizontalA = UiAlignmentKt.a(horizontal);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), horizontalA, composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
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
            ImageUIState imageUIState = state.c;
            if (imageUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-302983329);
                composerStartRestartGroup.endReplaceGroup();
                composer3 = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceGroup(-302983328);
                composer3 = composerStartRestartGroup;
                CommonImageKt.a(imageUIState, null, false, composer3, 0, 6);
                gf.r(companion, postValidationSuccessBottomSheetUISpecs.b, composer3, 0);
            }
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), UiAlignmentKt.a(horizontal), composer3, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default2);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composer3.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor2);
            } else {
                composer3.useNode();
            }
            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer3);
            pk0.v(companion2, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            Composer composer4 = composer3;
            TextKt.c(state.d, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, null, composer4, 48, 12);
            composer2 = composer4;
            TextUIState textUIState = state.e;
            if (textUIState == null) {
                composer2.startReplaceGroup(387601627);
            } else {
                composer2.startReplaceGroup(387601628);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, postValidationSuccessBottomSheetUISpecs.c), composer2, 0);
                TextKt.c(textUIState, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, null, composer2, 48, 12);
                composer2 = composer2;
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, postValidationSuccessBottomSheetUISpecs.d), composer2, 0);
            ButtonUIState buttonUIState = state.f;
            if (buttonUIState == null) {
                composer2.startReplaceGroup(-302189667);
            } else {
                composer2.startReplaceGroup(-302189666);
                ChaloFilledButtonKt.a(6, 0, composer2, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), buttonUIState);
            }
            composer2.endReplaceGroup();
            ButtonUIState buttonUIState2 = state.g;
            if (buttonUIState2 == null) {
                composer2.startReplaceGroup(-301997715);
            } else {
                composer2.startReplaceGroup(-301997714);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, postValidationSuccessBottomSheetUISpecs.e), composer2, 0);
                ChaloFilledButtonKt.a(6, 0, composer2, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), buttonUIState2);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new eq0(state, modifier, i, 9));
        }
    }
}
