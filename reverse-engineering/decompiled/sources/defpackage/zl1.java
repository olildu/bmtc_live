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
import app.chalo.productsummary.ui.ticket.TicketSummarySuccessScreenUIState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zl1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20210a;
    public final /* synthetic */ TicketSummarySuccessScreenUIState b;

    public /* synthetic */ zl1(TicketSummarySuccessScreenUIState ticketSummarySuccessScreenUIState, int i) {
        this.f20210a = i;
        this.b = ticketSummarySuccessScreenUIState;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f20210a;
        Unit unit = Unit.f17538a;
        TicketSummarySuccessScreenUIState ticketSummarySuccessScreenUIState = this.b;
        int i2 = 0;
        switch (i) {
            case 0:
                ToolBarWithRightComponentUIState toolBarWithRightComponentUIState = ticketSummarySuccessScreenUIState.b;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    composer.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(423868051, iIntValue, -1, "app.chalo.productsummary.ui.compose.TicketSummarySuccessMainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TripSummaryMainScreen.kt:462)");
                    }
                    BusTicketStatusUiState busTicketStatusUiState = toolBarWithRightComponentUIState.c;
                    if (busTicketStatusUiState == null) {
                        composer.startReplaceGroup(249356519);
                    } else {
                        composer.startReplaceGroup(249356520);
                        Modifier modifierC = ChaloThemeKt.c(Modifier.INSTANCE, toolBarWithRightComponentUIState.f8761a.b);
                        UIShape.Rectangle rectangle = UIShape.f1926a;
                        RideStatusTagComponentKt.a(modifierC, busTicketStatusUiState, composer, 0);
                    }
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            default:
                ToolBarWithRightComponentUIState toolBarWithRightComponentUIState2 = ticketSummarySuccessScreenUIState.b;
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    composer2.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-703914964, iIntValue2, -1, "app.chalo.productsummary.ui.compose.TicketSummarySuccessMainScreen.<anonymous>.<anonymous> (TripSummaryMainScreen.kt:459)");
                    }
                    if (toolBarWithRightComponentUIState2 == null) {
                        composer2.startReplaceGroup(1994691407);
                    } else {
                        composer2.startReplaceGroup(1994691408);
                        ChaloToolBarKt.f(toolBarWithRightComponentUIState2.b, ComposableLambdaKt.rememberComposableLambda(423868051, true, new zl1(ticketSummarySuccessScreenUIState, i2), composer2, 54), composer2, 48, 0);
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
