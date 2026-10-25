package app.chalo.compose.components;

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
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.components.image.GifUIKt;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.uistate.base.UiAlignmentKt;
import app.chalo.uistate.bottomsheet.BottomSheetContentUiSpecs;
import app.chalo.uistate.bottomsheet.BottomSheetStandardContentUiState;
import app.chalo.uistate.bottomsheet.DrawType;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
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
public final class BottomSheetContentWithIconTitleSubTitleKt {
    public static final void a(Modifier modifier, BottomSheetStandardContentUiState state, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        ComposeUiNode.Companion companion;
        Intrinsics.i(state, "state");
        BottomSheetContentUiSpecs bottomSheetContentUiSpecs = state.b;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1746952568);
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
                ComposerKt.traceEventStart(-1746952568, i3, -1, "app.chalo.compose.components.BottomSheetContentWithIconTitleSubTitle (BottomSheetContentWithIconTitleSubTitle.kt:21)");
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            ChaloPadding chaloPadding = bottomSheetContentUiSpecs.f9900a;
            float f = bottomSheetContentUiSpecs.h;
            Modifier modifierThen = ChaloThemeKt.c(modifierFillMaxWidth$default, chaloPadding).then(modifier4);
            Alignment.Horizontal horizontalA = UiAlignmentKt.a(bottomSheetContentUiSpecs.b);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), horizontalA, composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
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
            ImageUIState imageUIState = state.h;
            if (imageUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-1451444511);
                composerStartRestartGroup.endReplaceGroup();
                companion = companion3;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1451444510);
                companion = companion3;
                CommonImageKt.a(imageUIState, columnScopeInstance.align(companion2, Alignment.INSTANCE.getEnd()), false, composerStartRestartGroup, 0, 4);
                ChaloSpacersKt.a(bottomSheetContentUiSpecs.i, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            DrawType drawType = state.c;
            if (drawType == null) {
                composerStartRestartGroup.startReplaceGroup(-1451184173);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1451184172);
                if (drawType instanceof DrawType.Icon) {
                    composerStartRestartGroup.startReplaceGroup(389557259);
                    CommonImageKt.a(((DrawType.Icon) drawType).f9909a, null, false, composerStartRestartGroup, 0, 6);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (!(drawType instanceof DrawType.Gif)) {
                        throw pk0.p(composerStartRestartGroup, -125982345);
                    }
                    composerStartRestartGroup.startReplaceGroup(389667929);
                    GifUIKt.a(null, ((DrawType.Gif) drawType).f9908a, composerStartRestartGroup, 0, 1);
                    composerStartRestartGroup.endReplaceGroup();
                }
                gf.r(companion2, bottomSheetContentUiSpecs.d, composerStartRestartGroup, 0);
            }
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), UiAlignmentKt.a(bottomSheetContentUiSpecs.c), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
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
            ChaloTextViewKt.a(null, state.d, null, null, composerStartRestartGroup, 0, 13);
            composerStartRestartGroup = composerStartRestartGroup;
            TextUIState.ChaloTextUIState chaloTextUIState = state.e;
            if (chaloTextUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-756498388);
            } else {
                composerStartRestartGroup.startReplaceGroup(-756498387);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion2, bottomSheetContentUiSpecs.e), composerStartRestartGroup, 0);
                ChaloTextViewKt.a(null, chaloTextUIState, null, null, composerStartRestartGroup, 0, 13);
                composerStartRestartGroup = composerStartRestartGroup;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion2, bottomSheetContentUiSpecs.f), composerStartRestartGroup, 0);
            ButtonUIState buttonUIState = state.f;
            if (buttonUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-1450326217);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1450326216);
                ChaloFilledButtonKt.a(0, 0, composerStartRestartGroup, SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), f), buttonUIState);
            }
            composerStartRestartGroup.endReplaceGroup();
            ButtonUIState buttonUIState2 = state.g;
            if (buttonUIState2 == null) {
                composerStartRestartGroup.startReplaceGroup(-1450080697);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1450080696);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion2, bottomSheetContentUiSpecs.g), composerStartRestartGroup, 0);
                ChaloFilledButtonKt.a(0, 0, composerStartRestartGroup, SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), f), buttonUIState2);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new z(i, i2, 2, modifier3, state));
        }
    }
}
