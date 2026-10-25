package defpackage;

import app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsIntent;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultIntent;
import app.chalo.productsummary.ui.ticket.TicketSummaryIntent;
import app.chalo.titoridedetail.ui.TitoRideDetailsIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class rj1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19216a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ rj1(Function1 function1, int i) {
        this.f19216a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19216a) {
            case 0:
                this.b.invoke(TitoRideDetailsIntent.FetchRouteRetryButtonClickIntent.f9711a);
                break;
            case 1:
                this.b.invoke(TripPlannerDetailsIntent.MetroTicketPurchaseBottomSheetDismissIntent.f4735a);
                break;
            case 2:
                this.b.invoke(TripPlannerDetailsIntent.CombinedBuyTicketClickedIntent.f4729a);
                break;
            case 3:
                this.b.invoke(TripPlannerDetailsIntent.MetroTicketPurchaseBottomSheetCancelClickedIntent.f4734a);
                break;
            case 4:
                this.b.invoke(TripPlannerDetailsIntent.MetroTicketPurchaseBottomSheetDismissIntent.f4735a);
                break;
            case 5:
                this.b.invoke(TripPlannerDetailsIntent.BackButtonClickedIntent.f4725a);
                break;
            case 6:
                this.b.invoke(TripPlannerDetailsIntent.OnMapLoaded.f4736a);
                break;
            case 7:
                this.b.invoke(TripPlannerResultIntent.OnBackPressedIntent.f4773a);
                break;
            case 8:
                this.b.invoke(TripPlannerResultIntent.ToolTipOkClickedIntent.f4783a);
                break;
            case 9:
                this.b.invoke(TripPlannerResultIntent.ToolTipOkClickedIntent.f4783a);
                break;
            case 10:
                this.b.invoke(TripPlannerResultIntent.HopApiFetchFailedSnackbarRetryIntent.f4769a);
                break;
            case 11:
                this.b.invoke(TripPlannerResultIntent.DismissPickerDialogIntent.f4765a);
                break;
            case 12:
                this.b.invoke(TripPlannerResultIntent.DismissPickerDialogIntent.f4765a);
                break;
            case 13:
                this.b.invoke(TripPlannerResultIntent.DismissPickerDialogIntent.f4765a);
                break;
            case 14:
                this.b.invoke(TripPlannerResultIntent.DismissPickerDialogIntent.f4765a);
                break;
            case 15:
                this.b.invoke(TripPlannerResultIntent.TimeEditFieldClickIntent.f4781a);
                break;
            case 16:
                this.b.invoke(TripPlannerResultIntent.DateEditOptionClickedIntent.f4764a);
                break;
            case 17:
                this.b.invoke(TripPlannerResultIntent.ToggleSearchStopsClickedIntent.f4782a);
                break;
            case 18:
                this.b.invoke(new TripPlannerResultIntent.ProceedClickedIntent(false));
                break;
            case 19:
                this.b.invoke(TripPlannerResultIntent.OnExploreAllRoutesClickedIntent.f4774a);
                break;
            case 20:
                this.b.invoke(TicketSummaryIntent.OnFullScreenImageDismissBtnClickIntent.f8810a);
                break;
            case 21:
                this.b.invoke(TicketSummaryIntent.OnErrorScreenActionBtnClickIntent.f8809a);
                break;
            case 22:
                this.b.invoke(TicketSummaryIntent.OnFullScreenImageDismissBtnClickIntent.f8810a);
                break;
            case 23:
                this.b.invoke(TicketSummaryIntent.OnFullScreenImageDismissBtnClickIntent.f8810a);
                break;
            case 24:
                this.b.invoke(TicketSummaryIntent.OnFullScreenImageDismissBtnClickIntent.f8810a);
                break;
            case 25:
                this.b.invoke(TicketSummaryIntent.OnFullScreenImageDismissBtnClickIntent.f8810a);
                break;
            case 26:
                this.b.invoke(TicketSummaryIntent.OnFullScreenImageDismissBtnClickIntent.f8810a);
                break;
            case 27:
                this.b.invoke(TicketSummaryIntent.OnErrorScreenActionBtnClickIntent.f8809a);
                break;
            case 28:
                this.b.invoke(TicketSummaryIntent.OnFullScreenImageDismissBtnClickIntent.f8810a);
                break;
            default:
                this.b.invoke(TicketSummaryIntent.OnErrorScreenActionBtnClickIntent.f8809a);
                break;
        }
        return Unit.f17538a;
    }
}
