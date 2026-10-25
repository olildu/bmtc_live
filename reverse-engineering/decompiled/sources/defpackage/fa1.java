package defpackage;

import app.chalo.livetracking.search.StopBasedTripPlannerSearchViewIntent;
import app.chalo.metro.ui.regular.StopBasedMetroLandingScreenViewIntent;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionIntent;
import app.chalo.routeselection.ui.StopBasedRouteSearchIntent;
import app.chalo.sos.SosScreenIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class fa1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15624a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ fa1(Function1 function1, int i) {
        this.f15624a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15624a) {
            case 0:
                this.b.invoke(PremiumBusSlotSelectionIntent.CloseBottomSheetBtnClickIntent.f7865a);
                break;
            case 1:
                this.b.invoke(SosScreenIntent.SaveSosMessageIntent.f9414a);
                break;
            case 2:
                this.b.invoke(SosScreenIntent.ConfirmSendAlertIntent.f9409a);
                break;
            case 3:
                this.b.invoke(SosScreenIntent.DismissDialogIntent.f9410a);
                break;
            case 4:
                this.b.invoke(SosScreenIntent.BackClickedIntent.f9408a);
                break;
            case 5:
                this.b.invoke(SosScreenIntent.BackClickedIntent.f9408a);
                break;
            case 6:
                this.b.invoke(SosScreenIntent.EditMsgClickedIntent.f9411a);
                break;
            case 7:
                this.b.invoke(SosScreenIntent.AddContactsClickedIntent.f9407a);
                break;
            case 8:
                this.b.invoke(SosScreenIntent.SendAlertClickedIntent.f9415a);
                break;
            case 9:
                this.b.invoke(SosScreenIntent.DismissDialogIntent.f9410a);
                break;
            case 10:
                this.b.invoke(SosScreenIntent.DismissDialogIntent.f9410a);
                break;
            case 11:
                this.b.invoke(StopBasedMetroLandingScreenViewIntent.OnCloseButtonClicked.f5537a);
                break;
            case 12:
                this.b.invoke(StopBasedMetroLandingScreenViewIntent.OnProceedButtonClicked.f5541a);
                break;
            case 13:
                this.b.invoke(StopBasedMetroLandingScreenViewIntent.BottomSheetDismissIntent.f5535a);
                break;
            case 14:
                this.b.invoke(StopBasedMetroLandingScreenViewIntent.OnFromStationClick.f5538a);
                break;
            case 15:
                this.b.invoke(StopBasedMetroLandingScreenViewIntent.OnToStationClick.f5546a);
                break;
            case 16:
                this.b.invoke(StopBasedMetroLandingScreenViewIntent.OnSwapButtonClick.f5545a);
                break;
            case 17:
                this.b.invoke(StopBasedMetroLandingScreenViewIntent.OnSearchButtonClick.f5543a);
                break;
            case 18:
                this.b.invoke(StopBasedRouteSearchIntent.HideBottomSheetIntentBasedRoute.f9197a);
                break;
            case 19:
                this.b.invoke(StopBasedRouteSearchIntent.DismissSnackBar.f9195a);
                break;
            case 20:
                this.b.invoke(StopBasedRouteSearchIntent.FromStopBasedRouteSearchClickIntent.f9196a);
                break;
            case 21:
                this.b.invoke(StopBasedRouteSearchIntent.ToStopBasedRouteSearchClickIntent.f9202a);
                break;
            case 22:
                this.b.invoke(StopBasedRouteSearchIntent.ProceedButtonClickIntentBasedRoute.f9200a);
                break;
            case 23:
                this.b.invoke(StopBasedTripPlannerSearchViewIntent.BottomSheetCloseClickedIntent.f4491a);
                break;
            case 24:
                this.b.invoke(StopBasedTripPlannerSearchViewIntent.OnSwapButtonClick.f4499a);
                break;
            case 25:
                this.b.invoke(StopBasedTripPlannerSearchViewIntent.BottomSheetCloseClickedIntent.f4491a);
                break;
            case 26:
                this.b.invoke(StopBasedTripPlannerSearchViewIntent.BottomSheetCloseClickedIntent.f4491a);
                break;
            case 27:
                this.b.invoke(StopBasedTripPlannerSearchViewIntent.OnShowAllNearbyStopsClick.f4497a);
                break;
            case 28:
                this.b.invoke(StopBasedTripPlannerSearchViewIntent.OnFromLocationClick.f4493a);
                break;
            default:
                this.b.invoke(StopBasedTripPlannerSearchViewIntent.OnToLocationClick.f4500a);
                break;
        }
        return Unit.f17538a;
    }
}
