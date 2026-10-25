package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.UIShape;
import app.chalo.home.ui.history.uistate.chalobusticket.BusTicketStatusUiState;
import app.chalo.productsummary.ui.compose.components.RideStatusTagComponentKt;
import app.chalo.productsummary.ui.data.ToolBarWithRightComponentUIState;
import app.chalo.productsummary.ui.pass.PassSummarySuccessScreenUIState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class up0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19766a;
    public final /* synthetic */ PassSummarySuccessScreenUIState b;

    public /* synthetic */ up0(PassSummarySuccessScreenUIState passSummarySuccessScreenUIState, int i) {
        this.f19766a = i;
        this.b = passSummarySuccessScreenUIState;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f19766a;
        Unit unit = Unit.f17538a;
        PassSummarySuccessScreenUIState passSummarySuccessScreenUIState = this.b;
        char c = 1;
        switch (i) {
            case 0:
                ToolBarWithRightComponentUIState toolBarWithRightComponentUIState = passSummarySuccessScreenUIState.b;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    composer.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1470354372, iIntValue, -1, "app.chalo.productsummary.ui.compose.PassSummarySuccessMainScreen.<anonymous>.<anonymous> (PassSummarySuccessMainScreen.kt:129)");
                    }
                    if (toolBarWithRightComponentUIState == null) {
                        composer.startReplaceGroup(-1044278089);
                    } else {
                        composer.startReplaceGroup(-1044278088);
                        ChaloToolBarKt.f(toolBarWithRightComponentUIState.b, ComposableLambdaKt.rememberComposableLambda(1229639805, true, new up0(passSummarySuccessScreenUIState, c == true ? 1 : 0), composer, 54), composer, 48, 0);
                    }
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            default:
                ToolBarWithRightComponentUIState toolBarWithRightComponentUIState2 = passSummarySuccessScreenUIState.b;
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    composer2.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1229639805, iIntValue2, -1, "app.chalo.productsummary.ui.compose.PassSummarySuccessMainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PassSummarySuccessMainScreen.kt:132)");
                    }
                    BusTicketStatusUiState busTicketStatusUiState = toolBarWithRightComponentUIState2.c;
                    if (busTicketStatusUiState == null) {
                        composer2.startReplaceGroup(423462589);
                    } else {
                        composer2.startReplaceGroup(423462590);
                        Modifier modifierC = ChaloThemeKt.c(Modifier.INSTANCE, toolBarWithRightComponentUIState2.f8761a.b);
                        UIShape.Rectangle rectangle = UIShape.f1926a;
                        RideStatusTagComponentKt.a(modifierC, busTicketStatusUiState, composer2, 0);
                    }
                    composer2.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
        }
        return unit;
    }
}
