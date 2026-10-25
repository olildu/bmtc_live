package app.chalo.home.ui.regularbus.compose;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.components.PlotlineComposeWidgetKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.home.ui.regularbus.RegularBusPageDisplayItemData;
import defpackage.u50;
import defpackage.zk0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PayForTicketComposableKt {
    public static final void a(RegularBusPageDisplayItemData regularBusPageDisplayItemData, Function0 onItemClick, Composer composer, int i) {
        int i2;
        Intrinsics.i(onItemClick, "onItemClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(502159185);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(regularBusPageDisplayItemData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onItemClick) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(502159185, i2, -1, "app.chalo.home.ui.regularbus.compose.PayForTicketComposable (PayForTicketComposable.kt:30)");
            }
            ChaloRoundedCardKt.b(PaddingKt.m786paddingVpY3zN4$default(PlotlineComposeWidgetKt.a(Modifier.INSTANCE, "PL_Pay_For_Ticket"), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null), null, 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(807140400, true, new u50(20, regularBusPageDisplayItemData, onItemClick), composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zk0(regularBusPageDisplayItemData, onItemClick, i, 29));
        }
    }
}
