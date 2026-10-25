package app.chalo.uistate.cardwithtextleftandrighticon;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.components.RippleEffectKt;
import app.chalo.compose.theme.ChaloThemeKt;
import defpackage.c6;
import defpackage.fi;
import defpackage.fj;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloCardWithTextLeftAndRightIconViewKt {
    public static final void a(Modifier modifier, CardWithTextLeftAndRightIconUiState cardWithTextLeftAndRightIconUiState, Composer composer, int i) {
        int i2;
        Intrinsics.i(cardWithTextLeftAndRightIconUiState, "cardWithTextLeftAndRightIconUiState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-689644593);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(cardWithTextLeftAndRightIconUiState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-689644593, i2, -1, "app.chalo.uistate.cardwithtextleftandrighticon.ChaloCardWithTextLeftAndRightIconView (ChaloCardWithTextLeftAndRightIconView.kt:22)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
            MutableInteractionSource mutableInteractionSourceB = RippleEffectKt.b(composerStartRestartGroup);
            IndicationNodeFactory indicationNodeFactoryA = RippleEffectKt.a(composerStartRestartGroup);
            boolean z = (i2 & 112) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new fi(cardWithTextLeftAndRightIconUiState, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierM295clickableO2vRcR0$default = ClickableKt.m295clickableO2vRcR0$default(modifierFillMaxWidth$default, mutableInteractionSourceB, indicationNodeFactoryA, false, null, null, (Function0) objRememberedValue, 28, null);
            CardWithTextLeftAndRightIconUiSpecs cardWithTextLeftAndRightIconUiSpecs = cardWithTextLeftAndRightIconUiState.f9926a;
            ChaloRoundedCardKt.b(modifierM295clickableO2vRcR0$default, ChaloThemeKt.d(cardWithTextLeftAndRightIconUiSpecs.b), cardWithTextLeftAndRightIconUiSpecs.e, 0.0f, ComposableLambdaKt.rememberComposableLambda(263591248, true, new c6(cardWithTextLeftAndRightIconUiState, 9), composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fj(modifier, cardWithTextLeftAndRightIconUiState, i, 2));
        }
    }
}
