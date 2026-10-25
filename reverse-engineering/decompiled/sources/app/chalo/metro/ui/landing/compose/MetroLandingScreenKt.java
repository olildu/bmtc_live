package app.chalo.metro.ui.landing.compose;

import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import app.chalo.metro.ui.landing.MetroLandingScreenComponent;
import app.chalo.metro.ui.landing.uistate.MetroLandingScreenViewState;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import defpackage.fc0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KFunction;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/metro/ui/landing/uistate/MetroLandingScreenViewState;", "viewState", "productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MetroLandingScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(MetroLandingScreenComponent metroLandingScreenComponent, Composer composer, int i) {
        int i2;
        MetroLandingScreenComponent metroLandingScreenComponent2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1069048307);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(metroLandingScreenComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1069048307, i2, -1, "app.chalo.metro.ui.landing.compose.MetroLandingScreen (MetroLandingScreen.kt:13)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(metroLandingScreenComponent.t0(), composerStartRestartGroup);
            SheetState sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(((MetroLandingScreenViewState) mutableStateA.getValue()).f.getF5522a().b.f, null, composerStartRestartGroup, 0, 2);
            MetroLandingScreenViewState metroLandingScreenViewState = (MetroLandingScreenViewState) mutableStateA.getValue();
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(metroLandingScreenComponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                metroLandingScreenComponent2 = metroLandingScreenComponent;
                MetroLandingScreenKt$MetroLandingScreen$1$1 metroLandingScreenKt$MetroLandingScreen$1$1 = new MetroLandingScreenKt$MetroLandingScreen$1$1(1, metroLandingScreenComponent2, MetroLandingScreenComponent.class, "processIntent", "processIntent(Lapp/chalo/metro/ui/landing/MetroLandingScreenViewIntent;)V", 0);
                composerStartRestartGroup.updateRememberedValue(metroLandingScreenKt$MetroLandingScreen$1$1);
                objRememberedValue = metroLandingScreenKt$MetroLandingScreen$1$1;
            } else {
                metroLandingScreenComponent2 = metroLandingScreenComponent;
            }
            MetroLandingScreenUIKt.d(metroLandingScreenViewState, (Function1) ((KFunction) objRememberedValue), sheetStateRememberModalBottomSheetState, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            metroLandingScreenComponent2 = metroLandingScreenComponent;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fc0(metroLandingScreenComponent2, i, 16));
        }
    }
}
