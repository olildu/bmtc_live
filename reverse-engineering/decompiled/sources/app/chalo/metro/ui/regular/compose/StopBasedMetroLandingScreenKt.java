package app.chalo.metro.ui.regular.compose;

import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import app.chalo.metro.ui.regular.StopBasedMetroLandingScreenComponent;
import app.chalo.metro.ui.regular.uistate.StopBasedMetroLandingScreenViewState;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import defpackage.a31;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KFunction;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/metro/ui/regular/uistate/StopBasedMetroLandingScreenViewState;", "viewState", "productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class StopBasedMetroLandingScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(StopBasedMetroLandingScreenComponent stopBasedMetroLandingScreenComponent, Composer composer, int i) {
        int i2;
        StopBasedMetroLandingScreenComponent stopBasedMetroLandingScreenComponent2;
        Composer composerStartRestartGroup = composer.startRestartGroup(758945461);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(stopBasedMetroLandingScreenComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(758945461, i2, -1, "app.chalo.metro.ui.regular.compose.StopBasedMetroLandingScreen (StopBasedMetroLandingScreen.kt:13)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(stopBasedMetroLandingScreenComponent.t0(), composerStartRestartGroup);
            SheetState sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(((StopBasedMetroLandingScreenViewState) mutableStateA.getValue()).f.getF5551a().b.f, null, composerStartRestartGroup, 0, 2);
            StopBasedMetroLandingScreenViewState stopBasedMetroLandingScreenViewState = (StopBasedMetroLandingScreenViewState) mutableStateA.getValue();
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(stopBasedMetroLandingScreenComponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                stopBasedMetroLandingScreenComponent2 = stopBasedMetroLandingScreenComponent;
                StopBasedMetroLandingScreenKt$StopBasedMetroLandingScreen$1$1 stopBasedMetroLandingScreenKt$StopBasedMetroLandingScreen$1$1 = new StopBasedMetroLandingScreenKt$StopBasedMetroLandingScreen$1$1(1, stopBasedMetroLandingScreenComponent2, StopBasedMetroLandingScreenComponent.class, "processIntent", "processIntent(Lapp/chalo/metro/ui/regular/StopBasedMetroLandingScreenViewIntent;)V", 0);
                composerStartRestartGroup.updateRememberedValue(stopBasedMetroLandingScreenKt$StopBasedMetroLandingScreen$1$1);
                objRememberedValue = stopBasedMetroLandingScreenKt$StopBasedMetroLandingScreen$1$1;
            } else {
                stopBasedMetroLandingScreenComponent2 = stopBasedMetroLandingScreenComponent;
            }
            StopBasedMetroLandingScreenUIKt.b(stopBasedMetroLandingScreenViewState, sheetStateRememberModalBottomSheetState, (Function1) ((KFunction) objRememberedValue), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            stopBasedMetroLandingScreenComponent2 = stopBasedMetroLandingScreenComponent;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new a31(stopBasedMetroLandingScreenComponent2, i, 29));
        }
    }
}
