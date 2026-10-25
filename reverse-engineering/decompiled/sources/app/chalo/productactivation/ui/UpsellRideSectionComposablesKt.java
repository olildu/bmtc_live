package app.chalo.productactivation.ui;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.productactivation.ui.uistate.ActivationPassFooterUIState;
import app.chalo.productactivation.ui.uistate.UpsellRideSectionUISpecs;
import app.chalo.productactivation.ui.uistate.UpsellRideSectionUIState;
import app.chalo.shape.TicketShape;
import defpackage.gf;
import defpackage.hn1;
import defpackage.ni;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class UpsellRideSectionComposablesKt {
    public static final void a(UpsellRideSectionUIState state, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Intrinsics.i(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(1442866435);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1442866435, i3, -1, "app.chalo.productactivation.ui.UpsellRideSection (UpsellRideSectionComposables.kt:27)");
            }
            UpsellRideSectionUISpecs d = state.getD();
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = gf.b(0, null, 2, null, composerStartRestartGroup);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            ActivationPassFooterUIState c = state.getC();
            modifier2 = companion;
            ChaloRoundedCardKt.b(SizeKt.fillMaxWidth$default(ChaloThemeKt.c(companion, d.f8082a), 0.0f, 1, null), c == null ? ChaloThemeKt.d(d.c) : new TicketShape(d.d, ((Dp) mutableState.getValue()).m7292unboximpl(), d.e), 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(-1861675644, true, new ni(d, c, state, density, mutableState, 6), composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new hn1(state, modifier2, i, 0));
        }
    }
}
