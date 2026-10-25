package defpackage;

import app.chalo.ncmc.ui.pendingrecharge.PendingRechargeViewIntent;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsViewIntent;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumBusReserveTicketActivationIntent;
import app.chalo.premiumbus.ui.changestop.PremiumBusChangeStopIntent;
import app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsUiStateFactory;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsIntent;
import app.chalo.premiumbus.ui.passpurchaselanding.PbPassPurchaseLandingScreenIntent;
import app.chalo.quickpay.ui.payforticket.PayForTicketIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class fq0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15665a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ fq0(Function1 function1, int i) {
        this.f15665a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f15665a;
        PbBulkBookingRideDetailsViewIntent.DismissAlertDialogIntent dismissAlertDialogIntent = PbBulkBookingRideDetailsViewIntent.DismissAlertDialogIntent.f6919a;
        PbBulkBookingRideDetailsViewIntent.BookSingleRideClickIntent bookSingleRideClickIntent = PbBulkBookingRideDetailsViewIntent.BookSingleRideClickIntent.f6917a;
        PbBulkBookingRideDetailsViewIntent.RetryClickIntent retryClickIntent = PbBulkBookingRideDetailsViewIntent.RetryClickIntent.f6931a;
        NewPremiumBusReserveTicketActivationIntent.ShowStopsBetweenPickUpAndDropIntent showStopsBetweenPickUpAndDropIntent = NewPremiumBusReserveTicketActivationIntent.ShowStopsBetweenPickUpAndDropIntent.f7388a;
        PremiumBusFareDetailsIntent.FareValidationFailedDismissButtonClickedIntent fareValidationFailedDismissButtonClickedIntent = PremiumBusFareDetailsIntent.FareValidationFailedDismissButtonClickedIntent.f7590a;
        PbBulkBookingRideDetailsViewIntent.DismissDialogIntent dismissDialogIntent = PbBulkBookingRideDetailsViewIntent.DismissDialogIntent.f6920a;
        Unit unit = Unit.f17538a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                function1.invoke(PayForTicketIntent.NavigateToTicketBookingIntent.f8888a);
                break;
            case 1:
                function1.invoke(dismissDialogIntent);
                break;
            case 2:
                function1.invoke(dismissDialogIntent);
                break;
            case 3:
                function1.invoke(dismissAlertDialogIntent);
                break;
            case 4:
                function1.invoke(dismissAlertDialogIntent);
                break;
            case 5:
                function1.invoke(dismissDialogIntent);
                break;
            case 6:
                function1.invoke(retryClickIntent);
                break;
            case 7:
                function1.invoke(bookSingleRideClickIntent);
                break;
            case 8:
                function1.invoke(PbBulkBookingRideDetailsViewIntent.RenewPassClickIntent.f6930a);
                break;
            case 9:
                function1.invoke(bookSingleRideClickIntent);
                break;
            case 10:
                function1.invoke(PbBulkBookingRideDetailsViewIntent.OnBackToHomeScreenClickIntent.f6924a);
                break;
            case 11:
                function1.invoke(retryClickIntent);
                break;
            case 12:
                function1.invoke(dismissDialogIntent);
                break;
            case 13:
                function1.invoke(Boolean.TRUE);
                break;
            case 14:
                function1.invoke(Boolean.FALSE);
                break;
            case 15:
                function1.invoke(PbPassPurchaseLandingScreenIntent.CloseBottomSheetClickIntent.f7654a);
                break;
            case 16:
                function1.invoke(PendingRechargeViewIntent.UpdateNcmcCardClicked.f6422a);
                break;
            case 17:
                function1.invoke(showStopsBetweenPickUpAndDropIntent);
                break;
            case 18:
                function1.invoke(showStopsBetweenPickUpAndDropIntent);
                break;
            case 19:
                function1.invoke(PremiumBusChangeStopIntent.RetryLoadIntent.f7534a);
                break;
            case 20:
                function1.invoke(PremiumBusChangeStopIntent.BackPressed.f7529a);
                break;
            case 21:
                function1.invoke(PremiumBusChangeStopIntent.ConfirmStopIntent.f7530a);
                break;
            case 22:
                float f = PremiumBusFareDetailsUiStateFactory.c;
                function1.invoke(new PremiumBusFareDetailsIntent.OnPayButtonClicked());
                break;
            case 23:
                float f2 = PremiumBusFareDetailsUiStateFactory.c;
                function1.invoke(PremiumBusFareDetailsIntent.RemoveUpsellPassIntent.f7600a);
                break;
            case 24:
                float f3 = PremiumBusFareDetailsUiStateFactory.c;
                function1.invoke(PremiumBusFareDetailsIntent.BottomSheetDismissedIntent.f7586a);
                break;
            case 25:
                float f4 = PremiumBusFareDetailsUiStateFactory.c;
                function1.invoke(fareValidationFailedDismissButtonClickedIntent);
                break;
            case 26:
                float f5 = PremiumBusFareDetailsUiStateFactory.c;
                function1.invoke(PremiumBusFareDetailsIntent.FareValidationFailedBottomSheetPayButtonClickedIntent.f7589a);
                break;
            case 27:
                float f6 = PremiumBusFareDetailsUiStateFactory.c;
                function1.invoke(fareValidationFailedDismissButtonClickedIntent);
                break;
            case 28:
                float f7 = PremiumBusFareDetailsUiStateFactory.c;
                function1.invoke(PremiumBusFareDetailsIntent.OnReadMoreFareNoteIntent.f7597a);
                break;
            default:
                float f8 = PremiumBusFareDetailsUiStateFactory.c;
                function1.invoke(PremiumBusFareDetailsIntent.SwitchErrorDismissedIntent.f7604a);
                break;
        }
        return unit;
    }
}
