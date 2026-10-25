package defpackage;

import app.chalo.home.ui.base.HomeScreenFragmentViewIntent;
import app.chalo.home.ui.history.factory.CtaClickedType;
import app.chalo.home.ui.home.HomeScreenViewIntent;
import app.chalo.instantticket.ui.faredetails.contract.FareDetailsIntent;
import app.chalo.livetracking.ui.routedetailsscreen.LiveSeatAvailabilityBottomSheetCtaType;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsIntent;
import app.chalo.livetracking.universalsearch.ui.UniversalPickerIntent;
import app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class q70 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19096a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ q70(Function1 function1, int i) {
        this.f19096a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19096a) {
            case 0:
                this.b.invoke(CtaClickedType.VIEW_SUMMARY);
                break;
            case 1:
                this.b.invoke(CtaClickedType.BANNER_CTA);
                break;
            case 2:
                this.b.invoke(CtaClickedType.BANNER_CTA);
                break;
            case 3:
                this.b.invoke(UniversalPickerIntent.ClearSearchTextFieldIntent.f5053a);
                break;
            case 4:
                this.b.invoke(HomeScreenViewIntent.ScanAndPayBackPressedIntent.f3573a);
                break;
            case 5:
                this.b.invoke(HomeScreenViewIntent.ScanAndPayBackPressedIntent.f3573a);
                break;
            case 6:
                this.b.invoke(HomeScreenFragmentViewIntent.OnRetryHomeScreenConfigFetchIntent.f3218a);
                break;
            case 7:
                this.b.invoke(HomeScreenFragmentViewIntent.LocationItemClickedIntent.f3217a);
                break;
            case 8:
                this.b.invoke(HomeScreenFragmentViewIntent.OnRetryHomeScreenConfigFetchIntent.f3218a);
                break;
            case 9:
                this.b.invoke(HomeScreenFragmentViewIntent.LocationItemClickedIntent.f3217a);
                break;
            case 10:
                this.b.invoke(HomeScreenFragmentViewIntent.DismissHomeDrawerIntent.f3212a);
                break;
            case 11:
                this.b.invoke(HomeScreenFragmentViewIntent.BackClicked.f3208a);
                break;
            case 12:
                this.b.invoke(HomeScreenFragmentViewIntent.DismissHomeDrawerIntent.f3212a);
                break;
            case 13:
                this.b.invoke(HomeScreenViewIntent.LocationTooltipCancelButtonClickedIntent.f3565a);
                break;
            case 14:
                this.b.invoke(new HomeScreenViewIntent.PermissionRationaleDialogInteraction(true));
                break;
            case 15:
                this.b.invoke(new HomeScreenViewIntent.PermissionRationaleDialogInteraction(false));
                break;
            case 16:
                this.b.invoke(new HomeScreenViewIntent.JuspayPermissionRationaleDialogInteraction(true));
                break;
            case 17:
                this.b.invoke(new HomeScreenViewIntent.JuspayPermissionRationaleDialogInteraction(false));
                break;
            case 18:
                this.b.invoke(HomeScreenViewIntent.ProfileIconClickedIntent.f3572a);
                break;
            case 19:
                this.b.invoke(HomeScreenViewIntent.LocationItemClickedIntent.f3564a);
                break;
            case 20:
                this.b.invoke(HomeScreenViewIntent.SosClickedIntent.f3574a);
                break;
            case 21:
                this.b.invoke(FareDetailsIntent.InitiateOnlinePaymentIntent.f3934a);
                break;
            case 22:
                this.b.invoke(new RouteDetailsIntent.LiveSeatAvailabilityBottomSheetCtaClicked(LiveSeatAvailabilityBottomSheetCtaType.Dismiss.f4814a));
                break;
            case 23:
                this.b.invoke(new MTicketPassengerSelectionIntent.TncActionClicked(false));
                break;
            case 24:
                this.b.invoke(MTicketPassengerSelectionIntent.DismissFareChangedDialog.f5745a);
                break;
            case 25:
                this.b.invoke(new MTicketPassengerSelectionIntent.TncActionClicked(true));
                break;
            case 26:
                this.b.invoke(MTicketPassengerSelectionIntent.PayClickedIntent.f5748a);
                break;
            case 27:
                this.b.invoke(MTicketPassengerSelectionIntent.TncClickedIntent.f5753a);
                break;
            case 28:
                this.b.invoke(MTicketPassengerSelectionIntent.RetryProductFetchIntent.f5751a);
                break;
            default:
                this.b.invoke(MTicketPassengerSelectionIntent.RetryFareFetchIntent.f5750a);
                break;
        }
        return Unit.f17538a;
    }
}
