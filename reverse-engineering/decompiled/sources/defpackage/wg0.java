package defpackage;

import app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapIntent;
import app.chalo.home.ui.history.MyTicketsViewIntent;
import app.chalo.kyc.min.ui.minkycdetails.MinKycDetailsSideEffect;
import app.chalo.kyc.min.ui.minkycotp.MinKycOtpIntent;
import app.chalo.kyc.min.ui.minkycotp.MinKycOtpSideEffect;
import app.chalo.metro.ui.landing.MetroLandingScreenViewIntent;
import app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionIntent;
import app.chalo.mticket.ui.tripinfo.MTicketTripInfoIntent;
import app.chalo.ncmc.ui.ncmconlinerecharge.NCMCOnlineRechargeIntent;
import app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wg0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19926a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ wg0(Function1 function1, int i) {
        this.f19926a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19926a) {
            case 0:
                this.b.invoke(MTicketPassengerSelectionIntent.ToggleTripDetailsVisibility.f5754a);
                break;
            case 1:
                this.b.invoke(MTicketPassengerSelectionIntent.RetryProductFetchIntent.f5751a);
                break;
            case 2:
                this.b.invoke(MTicketTripInfoIntent.NextClickedIntent.f5768a);
                break;
            case 3:
                this.b.invoke(MTicketTripInfoIntent.FreeRideBannerClickedIntent.f5766a);
                break;
            case 4:
                this.b.invoke(MTicketTripInfoIntent.RouteOptionClickedIntent.f5772a);
                break;
            case 5:
                this.b.invoke(new MTicketTripInfoIntent.StopOptionClickedIntent(true));
                break;
            case 6:
                this.b.invoke(new MTicketTripInfoIntent.StopOptionClickedIntent(false));
                break;
            case 7:
                this.b.invoke(new MTicketTripInfoIntent.RetryFetchProductConfigurationIntent(false));
                break;
            case 8:
                this.b.invoke(MTicketTripInfoIntent.RetryFetchFreeRideValidityIntent.f5769a);
                break;
            case 9:
                this.b.invoke(MetroLandingScreenViewIntent.OnSelectLineClicked.f5503a);
                break;
            case 10:
                this.b.invoke(MetroLandingScreenViewIntent.OnFromStationClick.f5498a);
                break;
            case 11:
                this.b.invoke(MetroLandingScreenViewIntent.OnToStationClick.f5506a);
                break;
            case 12:
                this.b.invoke(MetroLandingScreenViewIntent.OnSwapButtonClick.f5505a);
                break;
            case 13:
                this.b.invoke(MetroLandingScreenViewIntent.OnSearchButtonClick.f5502a);
                break;
            case 14:
                this.b.invoke(MetroLandingScreenViewIntent.OnCloseButtonClicked.f5497a);
                break;
            case 15:
                this.b.invoke(MetroLandingScreenViewIntent.BottomSheetDismissIntent.f5495a);
                break;
            case 16:
                this.b.invoke(new MinKycDetailsSideEffect.HandleKeyboardVisibility());
                break;
            case 17:
                this.b.invoke(MinKycOtpIntent.ResendSmsClickedIntent.f4153a);
                break;
            case 18:
                this.b.invoke(new MinKycOtpSideEffect.HandleKeyboardVisibility());
                break;
            case 19:
                this.b.invoke(MinKycOtpIntent.BottomSheetDismissedIntent.f4147a);
                break;
            case 20:
                this.b.invoke(MultiProductValidationIntent.QRClickedIntent.f10697a);
                break;
            case 21:
                this.b.invoke(MultiProductValidationIntent.BackPressedIntent.f10692a);
                break;
            case 22:
                this.b.invoke(MultiProductValidationIntent.ReportProblemIntent.f10698a);
                break;
            case 23:
                this.b.invoke(MultiProductValidationIntent.ExpiryDialogGotItClickedIntent.f10694a);
                break;
            case 24:
                this.b.invoke(MyTicketsViewIntent.RequestHistoryButtonClicked.f3434a);
                break;
            case 25:
                this.b.invoke(MyTicketsViewIntent.ContactSupportDialogOkayClicked.f3417a);
                break;
            case 26:
                this.b.invoke(MyTicketsViewIntent.RequestHistoryButtonClicked.f3434a);
                break;
            case 27:
                this.b.invoke(NCMCOnlineRechargeIntent.RechargeSuccessBottomSheetDismissed.f6407a);
                break;
            case 28:
                this.b.invoke(NCMCOnlineRechargeIntent.NextBtnClickIntentOnline.f6404a);
                break;
            default:
                this.b.invoke(NearbyStopsMapIntent.GoToMyLocationClickedIntent.f3149a);
                break;
        }
        return Unit.f17538a;
    }
}
