package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import app.chalo.compose.components.ChaloSearchBarComposableUIKt;
import app.chalo.uistate.searchbar.SearchBarWithActionUIState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ol implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18649a;
    public final /* synthetic */ SearchBarWithActionUIState b;

    public /* synthetic */ ol(SearchBarWithActionUIState searchBarWithActionUIState, int i) {
        this.f18649a = i;
        this.b = searchBarWithActionUIState;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f18649a;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-773346767, iIntValue, -1, "app.chalo.compose.components.ChaloSearchBarComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChaloSearchBarComposableUI.kt:51)");
                    }
                    SearchBarWithActionUIState searchBarWithActionUIState = this.b;
                    ChaloSearchBarComposableUIKt.b(searchBarWithActionUIState.d, searchBarWithActionUIState.e, searchBarWithActionUIState.f10069a.i, composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            default:
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1618135716, iIntValue, -1, "app.chalo.productbooking.pickstop.ui.PickStopSearchBarComposable.<anonymous>.<anonymous>.<anonymous> (PickStopScreen.kt:188)");
                    }
                    SearchBarWithActionUIState searchBarWithActionUIState2 = this.b;
                    ChaloSearchBarComposableUIKt.b(searchBarWithActionUIState2.d, searchBarWithActionUIState2.e, searchBarWithActionUIState2.f, composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
        }
        return Unit.f17538a;
    }
}
