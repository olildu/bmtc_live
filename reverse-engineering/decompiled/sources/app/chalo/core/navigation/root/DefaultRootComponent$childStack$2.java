package app.chalo.core.navigation.root;

import app.chalo.appUpdate.ForceAppUpdateComponent;
import app.chalo.appmigrationpreconditions.AppMigrationPreconditionsComponent;
import app.chalo.appsupport.BookingHelpScreenComponent;
import app.chalo.bookingsuccess.BookingSuccessComponent;
import app.chalo.busesaroundyou.BusesAroundYouComponent;
import app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent;
import app.chalo.core.component.AppComponentFactory;
import app.chalo.core.navigation.checkout.CheckoutParentComponent;
import app.chalo.core.navigation.city.CitySelectionParentComponent;
import app.chalo.core.navigation.premiumbus.PremiumBusParentComponent;
import app.chalo.core.navigation.superpass.SuperPassParentComponent;
import app.chalo.core.navigation.validation.ValidationParentComponent;
import app.chalo.core.navigation.wallet.WalletParentComponent;
import app.chalo.core.networkinspector.NetworkInspectorComponent;
import app.chalo.electricitybill.ui.ebillamount.EbillAmountComponent;
import app.chalo.electricitybill.ui.ebillfetch.EBillFetchComponent;
import app.chalo.electricitybill.ui.ebillpayment.EBillPaymentConfirmationComponent;
import app.chalo.electricitybill.ui.ebillpaymentsuccess.EBillPaymentSuccessComponent;
import app.chalo.electricitybill.ui.invoice.EBillPaymentInvoiceComponent;
import app.chalo.electricitybill.ui.paymenthistory.ElectricityBillPaymentHistoryComponent;
import app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapComponent;
import app.chalo.home.ui.PremiumBusNotificationComponent;
import app.chalo.home.ui.base.HomeComponent;
import app.chalo.home.ui.chalobus.PremiumBusTutorialComponent;
import app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoComponent;
import app.chalo.home.ui.savedplacesandrides.SavedPlacesAndRidesComponent;
import app.chalo.home.ui.selectridescreen.SelectRideComponent;
import app.chalo.instantticket.ui.faredetails.FareDetailsCoordinatorComponent;
import app.chalo.instantticket.ui.routeselection.RouteBasedStopSearchForProductPurchaseComponent;
import app.chalo.kyc.min.ui.minkycdetails.MinKycDetailsComponent;
import app.chalo.kyc.min.ui.minkycotp.MinKycOtpComponent;
import app.chalo.livetracking.search.StopBasedTripPlannerSearchComponent;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultsComponent;
import app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsComponent;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent;
import app.chalo.livetracking.universalsearch.ui.UniversalPickerComponent;
import app.chalo.locationdisclaimer.LocationDisclaimerComponent;
import app.chalo.login.ui.options.LoginOptionsComponent;
import app.chalo.login.ui.otp.LoginOtpEnterComponent;
import app.chalo.login.ui.userconsent.UserConsentComponent;
import app.chalo.metro.ui.confirmbooking.ConfirmBookingScreenComponent;
import app.chalo.metro.ui.landing.MetroLandingScreenComponent;
import app.chalo.metro.ui.regular.StopBasedMetroLandingScreenComponent;
import app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionComponent;
import app.chalo.mticket.ui.tripinfo.MTicketTripInfoComponent;
import app.chalo.multimodalticket.groupticketsummary.ui.GroupTicketSummaryComponent;
import app.chalo.multimodalticket.ui.GroupTicketLegSelectionComponent;
import app.chalo.ncmc.ui.cardlinking.linking.ChaloCardLinkCardComponent;
import app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountComponent;
import app.chalo.ncmc.ui.cardtransactiondetail.CardTransactionDetailComponent;
import app.chalo.ncmc.ui.entercarddetails.EnterCardDetailsComponent;
import app.chalo.ncmc.ui.landing.ChaloCardInfoComponent;
import app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeComponent;
import app.chalo.ncmc.ui.ncmconlinerecharge.NcmcOnlineRechargeComponent;
import app.chalo.ncmc.ui.pendingrecharge.PendingRechargeComponent;
import app.chalo.ncmc.ui.transactionhistory.CardTransactionHistoryComponent;
import app.chalo.onboarding.citydiscontinued.CityDiscontinuedComponent;
import app.chalo.onboarding.languageselection.LanguageSelectionComponent;
import app.chalo.onboarding.splash.SplashScreenComponent;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsComponent;
import app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumBusReserveTicketActivationComponent;
import app.chalo.premiumbus.ui.changestop.PremiumBusChangeStopComponent;
import app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsComponent;
import app.chalo.productactivation.ui.ProductActivationComponent;
import app.chalo.productbooking.pickroutelocation.PickRouteLocationComponent;
import app.chalo.productbooking.pickstop.PickStopComponent;
import app.chalo.productpurchase.passpurchase.ui.passbookingsuccess.SuperPassBookingSuccessComponent;
import app.chalo.productpurchase.passpurchase.ui.verificationstatus.SuperPassVerificationStatusComponent;
import app.chalo.productpurchase.passselection.ui.PassSelectionComponent;
import app.chalo.productpurchase.productselection.ui.ProductSelectionComponent;
import app.chalo.productsummary.ui.pass.PassSummaryComponent;
import app.chalo.productsummary.ui.ticket.TicketSummaryComponent;
import app.chalo.quickpay.ui.payforticket.PayForTicketComponent;
import app.chalo.quickpay.ui.tripamount.QuickpayTripAmountComponent;
import app.chalo.reportproblem.ReportProblemComponent;
import app.chalo.ridehailing.feedback.RideUserFeedbackComponent;
import app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent;
import app.chalo.scenes.args.AppMigrationPreconditionsArgs;
import app.chalo.scenes.args.BookingHelpArgs;
import app.chalo.scenes.args.BookingSuccessArgs;
import app.chalo.scenes.args.BusesAroundYouArgs;
import app.chalo.scenes.args.CardLinkingScreenArgs;
import app.chalo.scenes.args.CardPendingRechargesScreenArgs;
import app.chalo.scenes.args.CardRechargeEnterAmountArgs;
import app.chalo.scenes.args.CardTransactionDetailArgs;
import app.chalo.scenes.args.CardTransactionHistoryArgs;
import app.chalo.scenes.args.ChaloBusRouteInfoScreenArgs;
import app.chalo.scenes.args.ChaloBusUserProfileSurveyArgs;
import app.chalo.scenes.args.ChaloCardLandingScreenArgs;
import app.chalo.scenes.args.CheckoutArgs;
import app.chalo.scenes.args.CityDiscontinuedArgs;
import app.chalo.scenes.args.CitySelectionArgs;
import app.chalo.scenes.args.ConfirmBookingScreenArgs;
import app.chalo.scenes.args.EBillAmountScreenArgs;
import app.chalo.scenes.args.EBillFetchScreenArgs;
import app.chalo.scenes.args.EBillHistoryScreenArgs;
import app.chalo.scenes.args.EBillPaymentConfirmationArgs;
import app.chalo.scenes.args.EBillPaymentInvoiceScreenArgs;
import app.chalo.scenes.args.EBillPaymentSuccessArgs;
import app.chalo.scenes.args.EnterCardDetailsArgs;
import app.chalo.scenes.args.FareDetailsArgs;
import app.chalo.scenes.args.ForceAppUpdateArgs;
import app.chalo.scenes.args.GroupTicketBookingSummaryArgs;
import app.chalo.scenes.args.GroupTicketLegSelectionArgs;
import app.chalo.scenes.args.HomeArgs;
import app.chalo.scenes.args.LanguageSelectionArgs;
import app.chalo.scenes.args.LocationDisclaimerArgs;
import app.chalo.scenes.args.LoginOptionsArgs;
import app.chalo.scenes.args.LoginOtpSceneArgs;
import app.chalo.scenes.args.MTicketSelectionArgs;
import app.chalo.scenes.args.MetroLandingArgs;
import app.chalo.scenes.args.MinKycDetailsArgs;
import app.chalo.scenes.args.MinKycOtpArgs;
import app.chalo.scenes.args.MinProfileUpdateArgs;
import app.chalo.scenes.args.NcmcOfflineRechargeArgs;
import app.chalo.scenes.args.NcmcOnlineRechargeArgs;
import app.chalo.scenes.args.NearbyStopsMapArgs;
import app.chalo.scenes.args.NetworkInspectorArgs;
import app.chalo.scenes.args.PassSelectionArgs;
import app.chalo.scenes.args.PbBulkBookingRideDetailsArgs;
import app.chalo.scenes.args.PickRouteLocationArgs;
import app.chalo.scenes.args.PickStopArgs;
import app.chalo.scenes.args.PremiumBusActivationArgs;
import app.chalo.scenes.args.PremiumBusArgs;
import app.chalo.scenes.args.PremiumBusChangeStopArgs;
import app.chalo.scenes.args.PremiumBusFareDetailsArgs;
import app.chalo.scenes.args.PremiumBusNotificationArgs;
import app.chalo.scenes.args.PremiumBusProductModificationArgs;
import app.chalo.scenes.args.PremiumBusTutorialScreenArgs;
import app.chalo.scenes.args.ProductActivationArgs;
import app.chalo.scenes.args.ProductSelectionArgs;
import app.chalo.scenes.args.ReportProblemArgs;
import app.chalo.scenes.args.RideUserFeedbackScreenArgs;
import app.chalo.scenes.args.RouteDetailsArgs;
import app.chalo.scenes.args.SavedPlacesAndRidesArgs;
import app.chalo.scenes.args.SceneArgs;
import app.chalo.scenes.args.SelectRideArgs;
import app.chalo.scenes.args.SosArgs;
import app.chalo.scenes.args.SplashArgs;
import app.chalo.scenes.args.StopBasedMetroLandingArgs;
import app.chalo.scenes.args.StopTripDetailsArgs;
import app.chalo.scenes.args.SuperPassBookingSuccessArgs;
import app.chalo.scenes.args.SuperPassPurchaseArgs;
import app.chalo.scenes.args.SuperPassVerificationStatusArgs;
import app.chalo.scenes.args.TicketPurchaseArgs;
import app.chalo.scenes.args.TitoRideDetailsArgs;
import app.chalo.scenes.args.TripPlannerArgs;
import app.chalo.scenes.args.TripSummaryArgs;
import app.chalo.scenes.args.UniversalPickerArgs;
import app.chalo.scenes.args.UserConsentScreenArgs;
import app.chalo.scenes.args.UserProfileFormArgs;
import app.chalo.scenes.args.ValidationArgs;
import app.chalo.scenes.args.WalletSceneArgs;
import app.chalo.scenes.args.WebViewArgs;
import app.chalo.sos.SosScreenComponent;
import app.chalo.stoptripdetails.ui.StopTripDetailsComponent;
import app.chalo.titoridedetail.ui.TitoRideDetailsComponent;
import app.chalo.tripreceipt.tripreceiptnew.RideReceiptComponent;
import app.chalo.userprofile.ui.UserProfileFormComponent;
import app.chalo.userprofile.ui.minprofileupdate.MinProfileUpdateComponent;
import app.chalo.webview.WebViewScreenComponent;
import com.arkivanov.decompose.ComponentContext;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class DefaultRootComponent$childStack$2 extends FunctionReferenceImpl implements Function2<SceneArgs, ComponentContext, RootComponent.Child> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        SceneArgs p0 = (SceneArgs) obj;
        ComponentContext p1 = (ComponentContext) obj2;
        Intrinsics.i(p0, "p0");
        Intrinsics.i(p1, "p1");
        ((DefaultRootComponent) this.receiver).getClass();
        boolean z = p0 instanceof AppMigrationPreconditionsArgs;
        AppComponentFactory appComponentFactory = AppComponentFactory.f2029a;
        if (z) {
            return new RootComponent.Child.AppMigrationPreconditions((AppMigrationPreconditionsComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof BookingHelpArgs) {
            return new RootComponent.Child.BookingHelp((BookingHelpScreenComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof BookingSuccessArgs) {
            return new RootComponent.Child.BookingSuccess((BookingSuccessComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof BusesAroundYouArgs) {
            return new RootComponent.Child.BusesAroundYou((BusesAroundYouComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof CardLinkingScreenArgs) {
            return new RootComponent.Child.ChaloCardLink((ChaloCardLinkCardComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof CardPendingRechargesScreenArgs) {
            return new RootComponent.Child.CardPendingRecharge((PendingRechargeComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof CardRechargeEnterAmountArgs) {
            return new RootComponent.Child.ChaloCardRechargeAmount((ChaloCardRechargeAmountComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof CardTransactionDetailArgs) {
            return new RootComponent.Child.CardTransactionDetail((CardTransactionDetailComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof CardTransactionHistoryArgs) {
            return new RootComponent.Child.CardTransactionHistory((CardTransactionHistoryComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof ChaloBusRouteInfoScreenArgs) {
            return new RootComponent.Child.ChaloBusRouteInfo((ChaloBusRouteInfoComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof ChaloCardLandingScreenArgs) {
            return new RootComponent.Child.ChaloCardLanding((ChaloCardInfoComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof ChaloBusUserProfileSurveyArgs) {
            return new RootComponent.Child.ChaloBusUserProfileSurvey((ChaloBusUserProfileSurveyComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof CheckoutArgs) {
            return new RootComponent.Child.CheckoutFlow(new CheckoutParentComponent((CheckoutArgs) p0, p1));
        }
        if (p0 instanceof CityDiscontinuedArgs) {
            return new RootComponent.Child.CityDiscontinued((CityDiscontinuedComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof CitySelectionArgs) {
            return new RootComponent.Child.CitySelectionFlow(new CitySelectionParentComponent((CitySelectionArgs) p0, p1));
        }
        if (p0 instanceof ConfirmBookingScreenArgs) {
            return new RootComponent.Child.ConfirmBooking((ConfirmBookingScreenComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof EBillAmountScreenArgs) {
            return new RootComponent.Child.EBillAmount((EbillAmountComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof EBillFetchScreenArgs) {
            return new RootComponent.Child.EBillFetch((EBillFetchComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof EBillHistoryScreenArgs) {
            return new RootComponent.Child.ElectricityBillPaymentHistory((ElectricityBillPaymentHistoryComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof EBillPaymentConfirmationArgs) {
            return new RootComponent.Child.EBillPaymentConfirmation((EBillPaymentConfirmationComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof EBillPaymentInvoiceScreenArgs) {
            return new RootComponent.Child.EBillPaymentInvoice((EBillPaymentInvoiceComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof EBillPaymentSuccessArgs) {
            return new RootComponent.Child.EBillPaymentSuccess((EBillPaymentSuccessComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof EnterCardDetailsArgs) {
            return new RootComponent.Child.ChaloCardEnterCardDetails((EnterCardDetailsComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof FareDetailsArgs) {
            return new RootComponent.Child.FareDetails((FareDetailsCoordinatorComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof ForceAppUpdateArgs) {
            return new RootComponent.Child.ForceAppUpdate((ForceAppUpdateComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof GroupTicketLegSelectionArgs) {
            return new RootComponent.Child.GroupTicketLegSelection((GroupTicketLegSelectionComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof GroupTicketBookingSummaryArgs) {
            return new RootComponent.Child.GroupTicketSummary((GroupTicketSummaryComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof HomeArgs) {
            return new RootComponent.Child.Home((HomeComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof LanguageSelectionArgs) {
            return new RootComponent.Child.LanguageSelection((LanguageSelectionComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof LocationDisclaimerArgs) {
            return new RootComponent.Child.LocationDisclaimer((LocationDisclaimerComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof LoginOptionsArgs) {
            return new RootComponent.Child.LoginOptions((LoginOptionsComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof LoginOtpSceneArgs) {
            return new RootComponent.Child.LoginOtp((LoginOtpEnterComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof MinKycDetailsArgs) {
            return new RootComponent.Child.MinKycDetails((MinKycDetailsComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof MinKycOtpArgs) {
            return new RootComponent.Child.MinKycOtp((MinKycOtpComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof MinProfileUpdateArgs) {
            return new RootComponent.Child.MinProfileUpdate((MinProfileUpdateComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof MetroLandingArgs) {
            return new RootComponent.Child.MetroLanding((MetroLandingScreenComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof MTicketSelectionArgs) {
            return new RootComponent.Child.MTicketPassengerSelection((MTicketPassengerSelectionComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof NcmcOfflineRechargeArgs) {
            return new RootComponent.Child.OfflineCardRecharge((OfflineCardRechargeComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof NcmcOnlineRechargeArgs) {
            return new RootComponent.Child.NCMCOnlineCardRecharge((NcmcOnlineRechargeComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof NetworkInspectorArgs) {
            return new RootComponent.Child.NetworkInspector((NetworkInspectorComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof NearbyStopsMapArgs) {
            return new RootComponent.Child.NearbyStopsMap((NearbyStopsMapComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof PassSelectionArgs) {
            return new RootComponent.Child.PassSelection((PassSelectionComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof PbBulkBookingRideDetailsArgs) {
            return new RootComponent.Child.PbBulkBookingRideDetails((PbBulkBookingRideDetailsComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof PickStopArgs) {
            return new RootComponent.Child.PickStop((PickStopComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof PickRouteLocationArgs) {
            return new RootComponent.Child.PickRouteLocation((PickRouteLocationComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof PremiumBusActivationArgs) {
            return new RootComponent.Child.NewPremiumBusReserveTicketActivation((NewPremiumBusReserveTicketActivationComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof PremiumBusArgs) {
            return new RootComponent.Child.PremiumBusFlow(new PremiumBusParentComponent((PremiumBusArgs) p0, p1));
        }
        if (p0 instanceof PremiumBusChangeStopArgs) {
            return new RootComponent.Child.PremiumBusChangeStop((PremiumBusChangeStopComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof PremiumBusTutorialScreenArgs) {
            return new RootComponent.Child.PremiumBusTutorial((PremiumBusTutorialComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof PremiumBusNotificationArgs) {
            return new RootComponent.Child.PremiumBusNotification((PremiumBusNotificationComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof PremiumBusProductModificationArgs) {
            return new RootComponent.Child.PremiumBusProductModificationReasons((PremiumBusProductModificationReasonsComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof ProductActivationArgs) {
            return new RootComponent.Child.ProductActivation((ProductActivationComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof ProductSelectionArgs) {
            return new RootComponent.Child.ProductSelection((ProductSelectionComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof ReportProblemArgs) {
            return new RootComponent.Child.ReportProblem((ReportProblemComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof RouteDetailsArgs) {
            return new RootComponent.Child.RouteDetails((RouteDetailsComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof SavedPlacesAndRidesArgs) {
            return new RootComponent.Child.SavedPlacesAndRides((SavedPlacesAndRidesComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof SelectRideArgs) {
            return new RootComponent.Child.SelectRide((SelectRideComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof SosArgs) {
            return new RootComponent.Child.SOS((SosScreenComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof SplashArgs) {
            return new RootComponent.Child.Splash((SplashScreenComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        boolean z2 = p0 instanceof StopBasedMetroLandingArgs;
        if (z2) {
            return new RootComponent.Child.StopBasedMetroLanding((StopBasedMetroLandingScreenComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (z2) {
            return new RootComponent.Child.StopBasedMetroLanding((StopBasedMetroLandingScreenComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof StopTripDetailsArgs) {
            return new RootComponent.Child.StopTripDetails((StopTripDetailsComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof SuperPassBookingSuccessArgs) {
            return new RootComponent.Child.SuperPassBookingSuccess((SuperPassBookingSuccessComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof SuperPassPurchaseArgs) {
            return new RootComponent.Child.SuperPassFlow(new SuperPassParentComponent((SuperPassPurchaseArgs) p0, p1));
        }
        if (p0 instanceof SuperPassVerificationStatusArgs) {
            return new RootComponent.Child.SuperPassVerificationStatus((SuperPassVerificationStatusComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof TicketPurchaseArgs.MTicketTripInfoArgs) {
            return new RootComponent.Child.MTicketTripInfo((MTicketTripInfoComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof TicketPurchaseArgs.PayForTicketArgs) {
            return new RootComponent.Child.PayForTicket((PayForTicketComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof TicketPurchaseArgs.QuickPayArgs) {
            return new RootComponent.Child.QuickPay((QuickpayTripAmountComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof TicketPurchaseArgs.RouteSelectionArgs) {
            return new RootComponent.Child.RouteBasedStopSearchForProductPurchase((RouteBasedStopSearchForProductPurchaseComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof TicketPurchaseArgs.StopSelectionArgs) {
            return new RootComponent.Child.StopBasedRouteSearchForProductPurchase((StopBasedRouteSearchForProductPurchaseComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        boolean z3 = p0 instanceof TitoRideDetailsArgs;
        if (z3) {
            return new RootComponent.Child.TitoRideDetails((TitoRideDetailsComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof TripSummaryArgs.PassSummaryScreen) {
            return new RootComponent.Child.PassSummary((PassSummaryComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof TripSummaryArgs.RideReceiptScreen) {
            return new RootComponent.Child.RideReceipt((RideReceiptComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof TripSummaryArgs.TicketSummaryScreen) {
            return new RootComponent.Child.TicketSummary((TicketSummaryComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof UniversalPickerArgs) {
            return new RootComponent.Child.UniversalPicker((UniversalPickerComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof UserConsentScreenArgs) {
            return new RootComponent.Child.UserConsent((UserConsentComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof UserProfileFormArgs) {
            return new RootComponent.Child.UserProfileForm((UserProfileFormComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof ValidationArgs) {
            return new RootComponent.Child.ValidationFlow(new ValidationParentComponent((ValidationArgs) p0, p1));
        }
        if (p0 instanceof WalletSceneArgs) {
            return new RootComponent.Child.WalletFlow(new WalletParentComponent((WalletSceneArgs) p0, p1));
        }
        if (p0 instanceof WebViewArgs) {
            return new RootComponent.Child.WebView((WebViewScreenComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof TripPlannerArgs.ResultsScreen) {
            return new RootComponent.Child.TripPlannerResultsScreen((TripPlannerResultsComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof TripPlannerArgs.DetailsScreen) {
            return new RootComponent.Child.TripPlannerDetailsScreen((TripPlannerDetailsComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof TripPlannerArgs.StopFocusedSearchScreen) {
            return new RootComponent.Child.StopTripPlannerSearchScreen((StopBasedTripPlannerSearchComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof TripPlannerArgs.StopFocusedResultsScreen) {
            return new RootComponent.Child.StopTripPlannerResultsScreen((StopTripPlannerResultsComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (z3) {
            throw new NotImplementedError();
        }
        if (p0 instanceof PremiumBusFareDetailsArgs) {
            return new RootComponent.Child.PremiumBusFareDetails((PremiumBusFareDetailsComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        if (p0 instanceof RideUserFeedbackScreenArgs) {
            return new RootComponent.Child.RideUserFeedbackScreen((RideUserFeedbackComponent) appComponentFactory.a(p0, p1, Arrays.copyOf(new Object[0], 0)));
        }
        throw new NoWhenBranchMatchedException();
    }
}
