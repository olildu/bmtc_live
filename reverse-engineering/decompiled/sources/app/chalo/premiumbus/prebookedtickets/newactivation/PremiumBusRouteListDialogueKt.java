package app.chalo.premiumbus.prebookedtickets.newactivation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import app.chalo.compose.components.ComposeUtils_androidKt;
import defpackage.an;
import defpackage.qu0;
import defpackage.wb;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusRouteListDialogueKt {
    public static final void a(Modifier modifier, String routeName, List stopNameList, Function0 onCloseButtonClick, Composer composer, int i) {
        int i2;
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(stopNameList, "stopNameList");
        Intrinsics.i(onCloseButtonClick, "onCloseButtonClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1172731869);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(routeName) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(stopNameList) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onCloseButtonClick) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1172731869, i2, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.PremiumBusRouteListDialogue (PremiumBusRouteListDialogue.kt:38)");
            }
            float fM7278constructorimpl = Dp.m7278constructorimpl(ComposeUtils_androidKt.b(composerStartRestartGroup) * 0.8f);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new wb(8);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            AndroidDialog_androidKt.Dialog((Function0) objRememberedValue, new DialogProperties(false, false, false, 4, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-456283980, true, new qu0(fM7278constructorimpl, modifier, stopNameList, onCloseButtonClick, routeName), composerStartRestartGroup, 54), composerStartRestartGroup, 438, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new an(modifier, routeName, stopNameList, onCloseButtonClick, i, 1));
        }
    }
}
