package app.chalo.instantticket.ui.instantticketscreen.compose;

import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import app.chalo.instantticket.ui.instantticketscreen.InstantTicketWalletAccessComponent;
import defpackage.v60;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class InstantTicketWalletAccessSideEffectSetupKt {
    public static final void a(SheetState sheetState, InstantTicketWalletAccessComponent instantTicketWalletAccessComponent, Composer composer, int i) {
        int i2;
        Intrinsics.i(instantTicketWalletAccessComponent, "instantTicketWalletAccessComponent");
        Composer composerStartRestartGroup = composer.startRestartGroup(495709071);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(sheetState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(instantTicketWalletAccessComponent) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed((Object) null) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(495709071, i2, -1, "app.chalo.instantticket.ui.instantticketscreen.compose.InstantTicketWalletAccessSideEffectSetup (InstantTicketWalletAccessSideEffectSetup.kt:17)");
            }
            Flow flow = instantTicketWalletAccessComponent.F;
            boolean zChangedInstance = ((i2 & 14) == 4) | composerStartRestartGroup.changedInstance(instantTicketWalletAccessComponent) | ((i2 & 896) == 256);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new InstantTicketWalletAccessSideEffectSetupKt$InstantTicketWalletAccessSideEffectSetup$1$1(instantTicketWalletAccessComponent, sheetState, null, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.LaunchedEffect(flow, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new v60(sheetState, instantTicketWalletAccessComponent, i, 6));
        }
    }
}
