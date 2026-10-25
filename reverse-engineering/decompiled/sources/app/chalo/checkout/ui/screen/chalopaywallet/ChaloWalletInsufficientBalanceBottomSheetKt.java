package app.chalo.checkout.ui.screen.chalopaywallet;

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
import app.chalo.checkout.ui.screen.payment.LowBalanceBottomSheetSpecs;
import app.chalo.checkout.ui.screen.payment.PaymentBottomSheetUiType;
import app.chalo.compose.YesBankFooterKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.TextKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.image.GifUIKt;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.uistate.base.UiAlignmentKt;
import app.chalo.uistate.image.GifImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.gf;
import defpackage.pk0;
import defpackage.s4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"checkout_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloWalletInsufficientBalanceBottomSheetKt {
    public static final void a(Modifier modifier, PaymentBottomSheetUiType.ChaloPayLowBalanceBottomsheetUiState state, TextUIState.StyledTextUIState tncUiState, Composer composer, int i) {
        Object obj;
        Modifier modifier2;
        Intrinsics.i(state, "state");
        LowBalanceBottomSheetSpecs lowBalanceBottomSheetSpecs = state.f1523a;
        Intrinsics.i(tncUiState, "tncUiState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-787175396);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(state) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(tncUiState) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-787175396, i2, -1, "app.chalo.checkout.ui.screen.chalopaywallet.ChaloWalletInsufficientBalanceBottomSheet (ChaloWalletInsufficientBalanceBottomSheet.kt:23)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(ChaloThemeKt.c(companion, lowBalanceBottomSheetSpecs.h), 0.0f, 1, null);
            Alignment.Horizontal horizontalA = UiAlignmentKt.a(lowBalanceBottomSheetSpecs.g);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), horizontalA, composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, lowBalanceBottomSheetSpecs.f), composerStartRestartGroup, 0);
            GifImageUIState gifImageUIState = state.b;
            if (gifImageUIState == null) {
                composerStartRestartGroup.startReplaceGroup(1006674171);
                composerStartRestartGroup.endReplaceGroup();
                modifier2 = null;
            } else {
                composerStartRestartGroup.startReplaceGroup(1006674172);
                modifier2 = null;
                GifUIKt.a(null, gifImageUIState, composerStartRestartGroup, 0, 1);
                gf.r(companion, lowBalanceBottomSheetSpecs.e, composerStartRestartGroup, 0);
            }
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, modifier2);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = i2;
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
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
            pk0.v(companion2, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
            Modifier modifier3 = modifier2;
            ChaloTextViewKt.a(null, state.d, null, null, composerStartRestartGroup, 0, 13);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, lowBalanceBottomSheetSpecs.d), composerStartRestartGroup, 0);
            ChaloTextViewKt.a(null, state.c, null, null, composerStartRestartGroup, 0, 13);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, lowBalanceBottomSheetSpecs.c), composerStartRestartGroup, 0);
            TextKt.b(modifier3, tncUiState, composerStartRestartGroup, (i4 >> 3) & 112, 1);
            composerStartRestartGroup.endNode();
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, lowBalanceBottomSheetSpecs.b), composerStartRestartGroup, 0);
            ChaloFilledButtonKt.a(0, 0, composerStartRestartGroup, SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, modifier3), lowBalanceBottomSheetSpecs.f1516a), state.e);
            if (state.g) {
                composerStartRestartGroup.startReplaceGroup(1007603893);
                YesBankFooterKt.a(composerStartRestartGroup, 0);
            } else {
                composerStartRestartGroup.startReplaceGroup(1005396476);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            obj = companion;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            obj = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s4(i, 22, obj, state, tncUiState));
        }
    }
}
