package app.chalo.wallet.ui.loadbalance.compose;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.theme.ChaloTheme;
import defpackage.pz0;
import defpackage.xa1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"wallet_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class WalletSuggestedDenominationsKt {
    public static final void a(int i, String amountTextInString, Function1 onDenominationClicked, Composer composer, int i2) {
        int i3;
        Intrinsics.i(amountTextInString, "amountTextInString");
        Intrinsics.i(onDenominationClicked, "onDenominationClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(973256106);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(amountTextInString) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDenominationClicked) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(973256106, i3, -1, "app.chalo.wallet.ui.loadbalance.compose.WalletSuggestedDenominationItem (WalletSuggestedDenominations.kt:20)");
            }
            ChaloRoundedCardKt.b(PaddingKt.m785paddingVpY3zN4(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 0).f, ChaloTheme.b(composerStartRestartGroup, 0).f), RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(ChaloTheme.b(composerStartRestartGroup, 0).f), ChaloTheme.b(composerStartRestartGroup, 0).d, 0.0f, ComposableLambdaKt.rememberComposableLambda(-1926399765, true, new pz0(i, amountTextInString, onDenominationClicked), composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new xa1(i, amountTextInString, onDenominationClicked, i2));
        }
    }
}
