package app.chalo.ncmc.ui.pendingrecharge;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import app.chalo.ncmc.ui.pendingrecharge.compose.PendingRechargeScreenKt;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import defpackage.fk0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KFunction;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/pendingrecharge/PendingRechargeViewState;", "viewState", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PendingRechargeMainScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(PendingRechargeComponent pendingRechargeComponent, Composer composer, int i) {
        int i2;
        PendingRechargeComponent pendingRechargeComponent2;
        Composer composerStartRestartGroup = composer.startRestartGroup(896009132);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(pendingRechargeComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(896009132, i2, -1, "app.chalo.ncmc.ui.pendingrecharge.PendingRechargeMainScreen (PendingRechargeMainScreen.kt:10)");
            }
            PendingRechargeViewState pendingRechargeViewState = (PendingRechargeViewState) SubscribeAsStateKt.a(pendingRechargeComponent.t0(), composerStartRestartGroup).getValue();
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(pendingRechargeComponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                pendingRechargeComponent2 = pendingRechargeComponent;
                PendingRechargeMainScreenKt$PendingRechargeMainScreen$1$1 pendingRechargeMainScreenKt$PendingRechargeMainScreen$1$1 = new PendingRechargeMainScreenKt$PendingRechargeMainScreen$1$1(1, pendingRechargeComponent2, PendingRechargeComponent.class, "processIntent", "processIntent(Lapp/chalo/ncmc/ui/pendingrecharge/PendingRechargeViewIntent;)V", 0);
                composerStartRestartGroup.updateRememberedValue(pendingRechargeMainScreenKt$PendingRechargeMainScreen$1$1);
                objRememberedValue = pendingRechargeMainScreenKt$PendingRechargeMainScreen$1$1;
            } else {
                pendingRechargeComponent2 = pendingRechargeComponent;
            }
            PendingRechargeScreenKt.e(pendingRechargeViewState, (Function1) ((KFunction) objRememberedValue), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            pendingRechargeComponent2 = pendingRechargeComponent;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fk0(pendingRechargeComponent2, i, 23));
        }
    }
}
