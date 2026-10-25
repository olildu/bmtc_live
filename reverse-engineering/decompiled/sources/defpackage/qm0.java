package defpackage;

import app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapIntent;
import app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeIntent;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumBusReserveTicketActivationIntent;
import app.chalo.premiumbus.ui.stopdetails.PremiumBusStopDetailsIntent;
import app.chalo.productsummary.ui.pass.PassSummaryIntent;
import app.chalo.quickpay.ui.payforticket.PayForTicketIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qm0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19134a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ qm0(Function1 function1, int i) {
        this.f19134a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19134a) {
            case 0:
                this.b.invoke(NearbyStopsMapIntent.SearchStopClickedIntent.f3157a);
                break;
            case 1:
                this.b.invoke(NearbyStopsMapIntent.MapLoadedIntent.f3154a);
                break;
            case 2:
                this.b.invoke(NewPremiumBusReserveTicketActivationIntent.ShowOnMapsClickedIntent.f7387a);
                break;
            case 3:
                this.b.invoke(NewPremiumBusReserveTicketActivationIntent.DismissWomenSeatRescheduleWarningBannerIntent.f7369a);
                break;
            case 4:
                this.b.invoke(NewPremiumBusReserveTicketActivationIntent.ShowStopsBetweenPickUpAndDropIntent.f7388a);
                break;
            case 5:
                this.b.invoke(NewPremiumBusReserveTicketActivationIntent.OnImageDialogDismissed.f7380a);
                break;
            case 6:
                this.b.invoke(NewPremiumBusReserveTicketActivationIntent.MoreOptionsClickedIntent.f7377a);
                break;
            case 7:
                this.b.invoke(NewPremiumBusReserveTicketActivationIntent.VerifyTicketClickedIntent.f7395a);
                break;
            case 8:
                this.b.invoke(NewPremiumBusReserveTicketActivationIntent.RouteDetailsFetchFailedSnackBarRetryClicked.f7385a);
                break;
            case 9:
                NewPremiumBusReserveTicketActivationIntent.BookingCancelledBottomSheetDismissIntent bookingCancelledBottomSheetDismissIntent = new NewPremiumBusReserveTicketActivationIntent.BookingCancelledBottomSheetDismissIntent(true);
                Function1 function1 = this.b;
                function1.invoke(bookingCancelledBottomSheetDismissIntent);
                function1.invoke(NewPremiumBusReserveTicketActivationIntent.HideBottomSheetIntent.f7372a);
                break;
            case 10:
                NewPremiumBusReserveTicketActivationIntent.BookingCancelledBottomSheetDismissIntent bookingCancelledBottomSheetDismissIntent2 = new NewPremiumBusReserveTicketActivationIntent.BookingCancelledBottomSheetDismissIntent(false);
                Function1 function2 = this.b;
                function2.invoke(bookingCancelledBottomSheetDismissIntent2);
                function2.invoke(NewPremiumBusReserveTicketActivationIntent.HideBottomSheetIntent.f7372a);
                break;
            case 11:
                this.b.invoke(NewPremiumBusReserveTicketActivationIntent.DismissPickAndDropOffStopsListDialogIntent.f7368a);
                break;
            case 12:
                this.b.invoke(NewPremiumBusReserveTicketActivationIntent.HideBottomSheetIntent.f7372a);
                break;
            case 13:
                this.b.invoke(NewPremiumBusReserveTicketActivationIntent.HideBottomSheetIntent.f7372a);
                break;
            case 14:
                this.b.invoke(NewPremiumBusReserveTicketActivationIntent.MapInteractionIntent.AlignMap.f7374a);
                break;
            case 15:
                this.b.invoke(OfflineCardRechargeIntent.OnRechargeClicked.f6392a);
                break;
            case 16:
                this.b.invoke(OfflineCardRechargeIntent.OnAddMoneyClicked.f6391a);
                break;
            case 17:
                this.b.invoke(OfflineCardRechargeIntent.OnSnackbarDismissed.f6393a);
                break;
            case 18:
                this.b.invoke(OfflineCardRechargeIntent.OfflineRechargeSuccessfulPositiveBtnClicked.f6390a);
                break;
            case 19:
                this.b.invoke(OfflineCardRechargeIntent.OfflineRechargeSuccessfulNegativeBtnClicked.f6389a);
                break;
            case 20:
                this.b.invoke(OfflineCardRechargeIntent.TncDialogueAccepted.f6395a);
                break;
            case 21:
                this.b.invoke(OfflineCardRechargeIntent.TncDialogueCancelled.f6396a);
                break;
            case 22:
                this.b.invoke(PremiumBusStopDetailsIntent.OnBackPressed.f7944a);
                break;
            case 23:
                this.b.invoke(PremiumBusStopDetailsIntent.OnImageDialogDismissed.f7947a);
                break;
            case 24:
                this.b.invoke(PremiumBusStopDetailsIntent.OnRetryClicked.f7948a);
                break;
            case 25:
                this.b.invoke(PassSummaryIntent.OnErrorScreenActionBtnOnClick.f8773a);
                break;
            case 26:
                this.b.invoke(PassSummaryIntent.OnFullScreenImageDismissBtnClickIntent.f8774a);
                break;
            case 27:
                this.b.invoke(PassSummaryIntent.OnErrorScreenActionBtnOnClick.f8773a);
                break;
            case 28:
                this.b.invoke(PayForTicketIntent.NavigateToWalletBalanceIntent.f8889a);
                break;
            default:
                this.b.invoke(PayForTicketIntent.NavigateToQuickPayIntent.f8887a);
                break;
        }
        return Unit.f17538a;
    }
}
