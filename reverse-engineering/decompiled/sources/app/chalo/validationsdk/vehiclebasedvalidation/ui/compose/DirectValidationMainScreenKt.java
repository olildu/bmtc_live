package app.chalo.validationsdk.vehiclebasedvalidation.ui.compose;

import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import app.chalo.validationsdk.vehiclebasedvalidation.ui.QRScannerValidationComponent;
import app.chalo.validationsdk.vehiclebasedvalidation.ui.QRScannerViewState;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import defpackage.mk;
import defpackage.t1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0004²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/validationsdk/vehiclebasedvalidation/ui/QRScannerViewState;", "viewState", "", "shouldShowBottomSheet", "validationsdk_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DirectValidationMainScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(QRScannerValidationComponent qRScannerValidationComponent, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1900738286);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(qRScannerValidationComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1900738286, i2, -1, "app.chalo.validationsdk.vehiclebasedvalidation.ui.compose.DirectValidationMainScreen (DirectValidationMainScreen.kt:16)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(qRScannerValidationComponent.t0(), composerStartRestartGroup);
            SheetState sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composerStartRestartGroup, 6, 2);
            QRScannerViewState qRScannerViewState = (QRScannerViewState) mutableStateA.getValue();
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(qRScannerValidationComponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                DirectValidationMainScreenKt$DirectValidationMainScreen$1$1 directValidationMainScreenKt$DirectValidationMainScreen$1$1 = new DirectValidationMainScreenKt$DirectValidationMainScreen$1$1(1, qRScannerValidationComponent, QRScannerValidationComponent.class, "processIntent", "processIntent(Lapp/chalo/validationsdk/vehiclebasedvalidation/ui/QRScannerViewIntent;)V", 0);
                composerStartRestartGroup.updateRememberedValue(directValidationMainScreenKt$DirectValidationMainScreen$1$1);
                objRememberedValue = directValidationMainScreenKt$DirectValidationMainScreen$1$1;
            }
            DirectValidationMainScreenUIKt.b(qRScannerViewState, sheetStateRememberModalBottomSheetState, (Function1) ((KFunction) objRememberedValue), composerStartRestartGroup, 0);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new t1(mutableStateA, 11));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            State state = (State) objRememberedValue2;
            Boolean bool = (Boolean) state.getValue();
            bool.booleanValue();
            Boolean boolValueOf = Boolean.valueOf(sheetStateRememberModalBottomSheetState.isVisible());
            boolean zChanged = composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new DirectValidationMainScreenKt$DirectValidationMainScreen$2$1(sheetStateRememberModalBottomSheetState, state, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.LaunchedEffect(bool, boolValueOf, (Function2) objRememberedValue3, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new mk(qRScannerValidationComponent, i, 27));
        }
    }
}
