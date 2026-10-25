package app.chalo.premiumbus.ui.changestop;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
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
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.components.image.GifUIKt;
import app.chalo.compose.resources.LottieResourceHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.premiumbus.ui.slotselection.ODPairTagsUIState;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.image.GifImageUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.dq;
import defpackage.eq0;
import defpackage.pk0;
import defpackage.r1;
import defpackage.u50;
import defpackage.wm0;
import io.github.alexzhirkevich.compottie.LottieAnimationState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusChangeStopComposablesKt {
    public static final void a(Modifier modifier, ODPairTagsUIState oDPairTagsUIState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1490929887);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(oDPairTagsUIState) : composerStartRestartGroup.changedInstance(oDPairTagsUIState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1490929887, i2, -1, "app.chalo.premiumbus.ui.changestop.ODPairTag (PremiumBusChangeStopComposables.kt:77)");
            }
            Modifier modifierC = ChaloThemeKt.c(BackgroundKt.m263backgroundbw27NRU(modifier, ChaloColorTokenKt.c(oDPairTagsUIState.b), ChaloThemeKt.d(oDPairTagsUIState.c)), oDPairTagsUIState.d);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloTextViewKt.a(null, oDPairTagsUIState.f7815a, null, null, composerStartRestartGroup, 0, 13);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new eq0(modifier, oDPairTagsUIState, i, 12));
        }
    }

    public static final void b(Modifier modifier, PbStopInfoCardUIState state, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Intrinsics.i(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(1727857490);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1727857490, i2, -1, "app.chalo.premiumbus.ui.changestop.PbStopInfoCard (PremiumBusChangeStopComposables.kt:39)");
            }
            RoundedCornerShape roundedCornerShapeD = ChaloThemeKt.d(state.f);
            modifier2 = modifier;
            ChaloRoundedCardKt.b(modifier2, roundedCornerShapeD, 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(-1928699151, true, new u50(25, roundedCornerShapeD, state), composerStartRestartGroup, 54), composerStartRestartGroup, (i2 & 14) | 24576, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            modifier2 = modifier;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new eq0(modifier2, state, i, 11));
        }
    }

    public static final void c(Modifier modifier, ChangeStopResultScreenUIState state, Function0 onAnimationComplete, Composer composer, int i) {
        Composer composer2;
        Modifier modifier2;
        Modifier modifier3;
        Composer composer3;
        int i2;
        Intrinsics.i(state, "state");
        Intrinsics.i(onAnimationComplete, "onAnimationComplete");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1758012893);
        int i3 = i | 6;
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(state) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onAnimationComplete) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1758012893, i3, -1, "app.chalo.premiumbus.ui.changestop.PremiumBusChangeStopResultScreen (PremiumBusChangeStopComposables.kt:95)");
            }
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null), ChaloTheme.b(composerStartRestartGroup, 0).h);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM784padding3ABfNKs);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(dq.a(ColumnScopeInstance.INSTANCE, companion, 1.0f, false, 2, null), 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getCenter(), companion2.getCenterHorizontally(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
            GifImageUIState gifImageUIState = state.b;
            if (gifImageUIState == null) {
                composerStartRestartGroup.startReplaceGroup(1878472954);
                composerStartRestartGroup.endReplaceGroup();
                modifier3 = null;
            } else {
                composerStartRestartGroup.startReplaceGroup(1878472955);
                LottieAnimationState lottieAnimationStateA = LottieResourceHelperKt.a(LottieResourceHelperKt.b(gifImageUIState.f10033a, composerStartRestartGroup, 0), gifImageUIState.b, composerStartRestartGroup, 0);
                Boolean boolValueOf = Boolean.valueOf(lottieAnimationStateA.h());
                Float fValueOf = Float.valueOf(lottieAnimationStateA.getProgress());
                boolean zChanged = ((i3 & 896) == 256) | composerStartRestartGroup.changed(lottieAnimationStateA);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    modifier3 = null;
                    objRememberedValue = new PremiumBusChangeStopComposablesKt$PremiumBusChangeStopResultScreen$1$1$1$1$1(lottieAnimationStateA, onAnimationComplete, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    modifier3 = null;
                }
                EffectsKt.LaunchedEffect(boolValueOf, fValueOf, (Function2) objRememberedValue, composerStartRestartGroup, 0);
                GifUIKt.a(modifier3, gifImageUIState, composerStartRestartGroup, 0, 1);
                ChaloSpacersKt.o(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            ImageUIState imageUIState = state.c;
            if (imageUIState == null) {
                composerStartRestartGroup.startReplaceGroup(1879110469);
                composerStartRestartGroup.endReplaceGroup();
                composer3 = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceGroup(1879110470);
                composer3 = composerStartRestartGroup;
                CommonImageKt.a(imageUIState, null, false, composer3, 0, 6);
                ChaloSpacersKt.o(composer3, 0);
                composer3.endReplaceGroup();
            }
            Composer composer4 = composer3;
            ChaloTextViewKt.a(null, state.f7513a, null, null, composer4, 0, 13);
            composer2 = composer4;
            TextUIState.ChaloTextUIState chaloTextUIState = state.d;
            if (chaloTextUIState == null) {
                composer2.startReplaceGroup(1879298763);
            } else {
                composer2.startReplaceGroup(1879298764);
                ChaloSpacersKt.t(composer2, 0);
                ChaloTextViewKt.a(null, chaloTextUIState, null, null, composer2, 0, 13);
                composer2 = composer2;
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, modifier3);
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer2, 0);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
            int i6 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default2);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor3);
            } else {
                composer2.useNode();
            }
            Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer2);
            pk0.v(companion3, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy3, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i6), composerM3915constructorimpl3));
            ButtonUIState buttonUIState = state.e;
            if (buttonUIState == null) {
                composer2.startReplaceGroup(-2050626886);
                composer2.endReplaceGroup();
                i2 = 0;
            } else {
                composer2.startReplaceGroup(-2050626885);
                i2 = 0;
                ChaloFilledButtonKt.a(6, 0, composer2, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, modifier3), buttonUIState);
                composer2.endReplaceGroup();
            }
            ButtonUIState buttonUIState2 = state.f;
            if (buttonUIState2 == null) {
                composer2.startReplaceGroup(-2050424146);
            } else {
                composer2.startReplaceGroup(-2050424145);
                ChaloSpacersKt.o(composer2, i2);
                ChaloFilledButtonKt.a(6, i2, composer2, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, modifier3), buttonUIState2);
            }
            composer2.endReplaceGroup();
            if (r1.k(composer2)) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new wm0(modifier2, state, onAnimationComplete, i, 14));
        }
    }
}
