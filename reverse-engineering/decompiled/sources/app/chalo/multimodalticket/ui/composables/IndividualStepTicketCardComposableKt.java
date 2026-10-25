package app.chalo.multimodalticket.ui.composables;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.components.ComposeUtilsKt;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.multimodalticket.ui.IndividualStepsTicketCardUISpecs;
import app.chalo.multimodalticket.ui.IndividualStepsTicketCardUIState;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.BorderUISpecKt;
import defpackage.la0;
import defpackage.w00;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class IndividualStepTicketCardComposableKt {
    public static final void a(IndividualStepsTicketCardUIState state, Composer composer, int i) {
        int i2;
        Modifier modifierA;
        Intrinsics.i(state, "state");
        IndividualStepsTicketCardUISpecs individualStepsTicketCardUISpecs = state.f5953a;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1251448245);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1251448245, i2, -1, "app.chalo.multimodalticket.ui.composables.IndividualStepTicketCardComposable (IndividualStepTicketCardComposable.kt:23)");
            }
            Modifier modifier = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
            BorderUISpec borderUISpec = individualStepsTicketCardUISpecs.c;
            if (borderUISpec != null && (modifierA = BorderUISpecKt.a(modifier, borderUISpec)) != null) {
                modifier = modifierA;
            }
            ChaloRoundedCardKt.b(ComposeUtilsKt.b(modifierFillMaxWidth$default.then(modifier), state.h, composerStartRestartGroup, 0, 6), ChaloThemeKt.d(individualStepsTicketCardUISpecs.d), 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(-1623749142, true, new la0(state, 0), composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new w00(state, i, 27));
        }
    }
}
