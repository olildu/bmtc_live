package app.chalo.premiumbus.ui.stopselection.compose;

import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionComponent;
import app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionViewState;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import defpackage.aw0;
import defpackage.bu0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionViewState;", "viewState", "productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusStopSelectionMainScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.Lazy] */
    public static final void a(PremiumBusStopSelectionComponent premiumBusStopSelectionComponent, TimeUtilsContract timeUtilsContract, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(188332759);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(premiumBusStopSelectionComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                timeUtilsContract = (TimeUtilsContract) PremiumBusStopSelectionScreenUIHelper.f7991a.getValue();
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            int i3 = i2 & (-113);
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(188332759, i3, -1, "app.chalo.premiumbus.ui.stopselection.compose.PremiumBusStopSelectionMainScreen (PremiumBusStopSelectionMainScreen.kt:22)");
            }
            SheetState sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composerStartRestartGroup, 6, 2);
            MutableState mutableStateA = SubscribeAsStateKt.a(premiumBusStopSelectionComponent.t0(), composerStartRestartGroup);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(premiumBusStopSelectionComponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new aw0(premiumBusStopSelectionComponent, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            TimeUtilsContract timeUtilsContract2 = timeUtilsContract;
            PremiumBusStopSelectionScreenKt.k(0, sheetStateRememberModalBottomSheetState, composerStartRestartGroup, (PremiumBusStopSelectionViewState) mutableStateA.getValue(), timeUtilsContract2, (Function1) objRememberedValue);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            timeUtilsContract = timeUtilsContract2;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new bu0(premiumBusStopSelectionComponent, timeUtilsContract, i, 15));
        }
    }
}
