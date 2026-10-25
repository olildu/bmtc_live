package app.chalo.metro.ui.confirmbooking.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import app.chalo.metro.ui.confirmbooking.ConfirmBookingScreenComponent;
import app.chalo.metro.ui.confirmbooking.uistate.ConfirmBookingScreenViewState;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import defpackage.mk;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/metro/ui/confirmbooking/uistate/ConfirmBookingScreenViewState;", "viewState", "productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ConfirmBookingScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(ConfirmBookingScreenComponent confirmBookingScreenComponent, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1286431248);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(confirmBookingScreenComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1286431248, i2, -1, "app.chalo.metro.ui.confirmbooking.compose.ConfirmBookingScreen (ConfirmBookingScreen.kt:10)");
            }
            ConfirmBookingScreenUIKt.a((ConfirmBookingScreenViewState) SubscribeAsStateKt.a(confirmBookingScreenComponent.t0(), composerStartRestartGroup).getValue(), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new mk(confirmBookingScreenComponent, i, 17));
        }
    }
}
