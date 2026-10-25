package app.chalo.livetracking.tripplanner.ui.details.compose.component;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.theme.ChaloTheme;
import defpackage.ui0;
import defpackage.w8;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MetroTicketPurchaseBottomSheetContentKt {
    public static final void a(Modifier modifier, String fromStation, String toStation, int i, Function0 onBuyTicketClick, Function0 onCancelClick, Function0 onCloseClick, Composer composer, int i2) {
        int i3;
        Modifier modifier2;
        Intrinsics.i(fromStation, "fromStation");
        Intrinsics.i(toStation, "toStation");
        Intrinsics.i(onBuyTicketClick, "onBuyTicketClick");
        Intrinsics.i(onCancelClick, "onCancelClick");
        Intrinsics.i(onCloseClick, "onCloseClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1381867091);
        int i4 = i2 | 6;
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(fromStation) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(toStation) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 = i;
            i4 |= composerStartRestartGroup.changed(i3) ? 2048 : 1024;
        } else {
            i3 = i;
        }
        if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onBuyTicketClick) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onCancelClick) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onCloseClick) ? 1048576 : 524288;
        }
        if (composerStartRestartGroup.shouldExecute((599187 & i4) != 599186, i4 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1381867091, i4, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.component.MetroTicketPurchaseBottomSheetContent (MetroTicketPurchaseBottomSheetContent.kt:43)");
            }
            modifier2 = companion;
            ChaloRoundedCardKt.b(null, ChaloTheme.d(composerStartRestartGroup, 0).j, 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(1537885132, true, new ui0(modifier2, onBuyTicketClick, onCancelClick, onCloseClick, fromStation, i3, toStation), composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 13);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new w8(modifier2, fromStation, toStation, i, onBuyTicketClick, onCancelClick, onCloseClick, i2));
        }
    }
}
