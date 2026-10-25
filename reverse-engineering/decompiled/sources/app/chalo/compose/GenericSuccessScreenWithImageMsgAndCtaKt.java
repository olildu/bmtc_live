package app.chalo.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
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
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.components.image.GifUIKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.UiAlignmentKt;
import app.chalo.uistate.base.UiArrangementKt;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.image.GifImageUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.success.StandardSuccessScreenUIState;
import app.chalo.uistate.success.SuccessWithGifMsgAndCtaUISpecs;
import app.chalo.uistate.text.TextUIState;
import defpackage.dq;
import defpackage.ox;
import defpackage.pk0;
import defpackage.r1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class GenericSuccessScreenWithImageMsgAndCtaKt {
    public static final void a(Modifier modifier, StandardSuccessScreenUIState.SuccessWithGifMsgAndCta state, Composer composer, int i) {
        Modifier modifier2;
        int i2;
        Intrinsics.i(state, "state");
        GifImageUIState gifImageUIState = state.c;
        SuccessWithGifMsgAndCtaUISpecs successWithGifMsgAndCtaUISpecs = state.f10073a;
        Composer composerStartRestartGroup = composer.startRestartGroup(-148337364);
        int i3 = i | 6;
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(state) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            modifier2 = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-148337364, i3, -1, "app.chalo.compose.GenericSuccessScreenWithImageMsgAndCta (GenericSuccessScreenWithImageMsgAndCta.kt:33)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null);
            ChaloColorToken chaloColorToken = successWithGifMsgAndCtaUISpecs.f10074a;
            float f = successWithGifMsgAndCtaUISpecs.m;
            Modifier modifierC = ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(modifierFillMaxSize$default, ChaloColorTokenKt.c(chaloColorToken), null, 2, null), successWithGifMsgAndCtaUISpecs.b);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            Modifier modifierC2 = ChaloThemeKt.c(dq.a(ColumnScopeInstance.INSTANCE, SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), 1.0f, false, 2, null), successWithGifMsgAndCtaUISpecs.c);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(UiAlignmentKt.c(successWithGifMsgAndCtaUISpecs.d), false);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC2);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
            pk0.v(companion2, composerM3915constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (gifImageUIState != null) {
                composerStartRestartGroup.startReplaceGroup(-210670397);
                i2 = 0;
                GifUIKt.a(ZIndexModifierKt.zIndex(boxScopeInstance.align(SizeKt.m828size3ABfNKs(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 6).x), companion.getCenter()), -1.0f), gifImageUIState, composerStartRestartGroup, 0, 0);
            } else {
                i2 = 0;
                composerStartRestartGroup.startReplaceGroup(-212577734);
            }
            composerStartRestartGroup.endReplaceGroup();
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), UiAlignmentKt.a(successWithGifMsgAndCtaUISpecs.e), composerStartRestartGroup, i2);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, i2);
            int i6 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier2);
            Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
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
            pk0.v(companion2, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl3, Integer.valueOf(i6), composerM3915constructorimpl3));
            GifUIKt.a(null, state.b, composerStartRestartGroup, 0, 1);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(modifier2, successWithGifMsgAndCtaUISpecs.h), composerStartRestartGroup, 0);
            ChaloTextViewKt.a(null, state.d, null, null, composerStartRestartGroup, 0, 13);
            if (state.e == null) {
                composerStartRestartGroup.startReplaceGroup(52525780);
            } else {
                composerStartRestartGroup.startReplaceGroup(52525781);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(modifier2, successWithGifMsgAndCtaUISpecs.i), composerStartRestartGroup, 0);
                ChaloTextViewKt.a(null, state.e, null, null, composerStartRestartGroup, 0, 13);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1110079659);
            ImageUIState imageUIState = state.f;
            TextUIState.ChaloTextUIState chaloTextUIState = state.g;
            if (imageUIState != null && chaloTextUIState != null) {
                ChaloSpacersKt.s(null, 0, composerStartRestartGroup, 1);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(UiArrangementKt.a(successWithGifMsgAndCtaUISpecs.l), UiAlignmentKt.b(successWithGifMsgAndCtaUISpecs.k), composerStartRestartGroup, 0);
                long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i7 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier2);
                Function0<ComposeUiNode> constructor4 = companion2.getConstructor();
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
                pk0.v(companion2, composerM3915constructorimpl4, measurePolicyRowMeasurePolicy, composerM3915constructorimpl4, currentCompositionLocalMap4);
                Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl4, Integer.valueOf(i7), composerM3915constructorimpl4));
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                CommonImageKt.a(imageUIState, null, false, composerStartRestartGroup, 0, 6);
                composerStartRestartGroup = composerStartRestartGroup;
                ChaloSpacersKt.B(composerStartRestartGroup, 0);
                ChaloTextViewKt.a(null, chaloTextUIState, null, null, composerStartRestartGroup, 0, 13);
                composerStartRestartGroup.endNode();
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i8 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            Function0<ComposeUiNode> constructor5 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor5);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl5 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion2, composerM3915constructorimpl5, measurePolicyColumnMeasurePolicy3, composerM3915constructorimpl5, currentCompositionLocalMap5);
            Updater.m3923setimpl(composerM3915constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl5, Integer.valueOf(i8), composerM3915constructorimpl5));
            ButtonUIState buttonUIState = state.h;
            if (buttonUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-439492043);
            } else {
                composerStartRestartGroup.startReplaceGroup(-439492042);
                ChaloFilledButtonKt.a(0, 0, composerStartRestartGroup, SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), f), buttonUIState);
            }
            composerStartRestartGroup.endReplaceGroup();
            ButtonUIState buttonUIState2 = state.i;
            if (buttonUIState2 == null) {
                composerStartRestartGroup.startReplaceGroup(-439205789);
            } else {
                composerStartRestartGroup.startReplaceGroup(-439205788);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(modifier2, successWithGifMsgAndCtaUISpecs.j), composerStartRestartGroup, 0);
                ChaloFilledButtonKt.a(0, 0, composerStartRestartGroup, SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), f), buttonUIState2);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (r1.k(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ox(modifier2, state, i, 24));
        }
    }
}
