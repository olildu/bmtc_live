package app.chalo.core.navigation.root;

import androidx.datastore.preferences.core.Preferences;
import app.chalo.appUpdate.ForceAppUpdateComponent;
import app.chalo.appmigrationpreconditions.AppMigrationPreconditionsComponent;
import app.chalo.appsupport.BookingHelpScreenComponent;
import app.chalo.bookingsuccess.BookingSuccessComponent;
import app.chalo.busesaroundyou.BusesAroundYouComponent;
import app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent;
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
import app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsFlowType;
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
import app.chalo.scenes.ChaloScenes;
import app.chalo.scenes.args.SceneArgs;
import app.chalo.sos.SosScreenComponent;
import app.chalo.stoptripdetails.ui.StopTripDetailsComponent;
import app.chalo.titoridedetail.ui.TitoRideDetailsComponent;
import app.chalo.tripreceipt.tripreceiptnew.RideReceiptComponent;
import app.chalo.userprofile.ui.UserProfileFormComponent;
import app.chalo.userprofile.ui.minprofileupdate.MinProfileUpdateComponent;
import app.chalo.webview.WebViewScreenComponent;
import com.arkivanov.decompose.ComponentContext;
import com.arkivanov.decompose.value.Value;
import com.arkivanov.essenty.backhandler.BackHandler;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent;", "", "Child", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface RootComponent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000â\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\bU\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:U\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUV\u0082\u0001\u0081\u0001WXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u007f\u0080\u0001\u0081\u0001\u0082\u0001\u0083\u0001\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001\u008a\u0001\u008b\u0001\u008c\u0001\u008d\u0001\u008e\u0001\u008f\u0001\u0090\u0001\u0091\u0001\u0092\u0001\u0093\u0001\u0094\u0001\u0095\u0001\u0096\u0001\u0097\u0001\u0098\u0001\u0099\u0001\u009a\u0001\u009b\u0001\u009c\u0001\u009d\u0001\u009e\u0001\u009f\u0001 \u0001¡\u0001¢\u0001£\u0001¤\u0001¥\u0001¦\u0001§\u0001¨\u0001©\u0001ª\u0001«\u0001¨\u0006¬\u0001"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child;", "", "AppMigrationPreconditions", "BookingHelp", "BookingSuccess", "BusesAroundYou", "CardPendingRecharge", "CardTransactionDetail", "CardTransactionHistory", "ChaloCardEnterCardDetails", "ChaloBusRouteInfo", "ChaloCardLanding", "ChaloCardLink", "ChaloCardRechargeAmount", "ChaloBusUserProfileSurvey", "CheckoutFlow", "CityDiscontinued", "CitySelectionFlow", "ConfirmBooking", "EBillAmount", "EBillFetch", "EBillPaymentConfirmation", "EBillPaymentInvoice", "EBillPaymentSuccess", "ElectricityBillPaymentHistory", "FareDetails", "PremiumBusFareDetails", "ForceAppUpdate", "GroupTicketLegSelection", "GroupTicketSummary", "Home", "LanguageSelection", "LocationDisclaimer", "LoginOptions", "LoginOtp", "MetroLanding", "MinKycDetails", "MinKycOtp", "MinProfileUpdate", "MTicketPassengerSelection", "MTicketTripInfo", "NCMCOnlineCardRecharge", "NetworkInspector", "NearbyStopsMap", "NewPremiumBusReserveTicketActivation", "OfflineCardRecharge", "PassSelection", "PassSummary", "PayForTicket", "PbBulkBookingRideDetails", "PickStop", "PickRouteLocation", "PremiumBusFlow", "PremiumBusTutorial", "PremiumBusChangeStop", "PremiumBusNotification", "PremiumBusProductModificationReasons", "ProductActivation", "ProductSelection", "QuickPay", "ReportProblem", "RideReceipt", "RouteBasedStopSearchForProductPurchase", "RouteDetails", "SavedPlacesAndRides", "SelectRide", "SOS", "Splash", "StopBasedMetroLanding", "StopBasedRouteSearchForProductPurchase", "StopTripDetails", "SuperPassBookingSuccess", "SuperPassFlow", "SuperPassVerificationStatus", "TicketSummary", "TitoRideDetails", "UniversalPicker", "UserConsent", "UserProfileForm", "ValidationFlow", "WalletFlow", "WebView", "TripPlannerResultsScreen", "TripPlannerDetailsScreen", "StopTripPlannerSearchScreen", "StopTripPlannerResultsScreen", "RideUserFeedbackScreen", "Lapp/chalo/core/navigation/root/RootComponent$Child$AppMigrationPreconditions;", "Lapp/chalo/core/navigation/root/RootComponent$Child$BookingHelp;", "Lapp/chalo/core/navigation/root/RootComponent$Child$BookingSuccess;", "Lapp/chalo/core/navigation/root/RootComponent$Child$BusesAroundYou;", "Lapp/chalo/core/navigation/root/RootComponent$Child$CardPendingRecharge;", "Lapp/chalo/core/navigation/root/RootComponent$Child$CardTransactionDetail;", "Lapp/chalo/core/navigation/root/RootComponent$Child$CardTransactionHistory;", "Lapp/chalo/core/navigation/root/RootComponent$Child$ChaloBusRouteInfo;", "Lapp/chalo/core/navigation/root/RootComponent$Child$ChaloBusUserProfileSurvey;", "Lapp/chalo/core/navigation/root/RootComponent$Child$ChaloCardEnterCardDetails;", "Lapp/chalo/core/navigation/root/RootComponent$Child$ChaloCardLanding;", "Lapp/chalo/core/navigation/root/RootComponent$Child$ChaloCardLink;", "Lapp/chalo/core/navigation/root/RootComponent$Child$ChaloCardRechargeAmount;", "Lapp/chalo/core/navigation/root/RootComponent$Child$CheckoutFlow;", "Lapp/chalo/core/navigation/root/RootComponent$Child$CityDiscontinued;", "Lapp/chalo/core/navigation/root/RootComponent$Child$CitySelectionFlow;", "Lapp/chalo/core/navigation/root/RootComponent$Child$ConfirmBooking;", "Lapp/chalo/core/navigation/root/RootComponent$Child$EBillAmount;", "Lapp/chalo/core/navigation/root/RootComponent$Child$EBillFetch;", "Lapp/chalo/core/navigation/root/RootComponent$Child$EBillPaymentConfirmation;", "Lapp/chalo/core/navigation/root/RootComponent$Child$EBillPaymentInvoice;", "Lapp/chalo/core/navigation/root/RootComponent$Child$EBillPaymentSuccess;", "Lapp/chalo/core/navigation/root/RootComponent$Child$ElectricityBillPaymentHistory;", "Lapp/chalo/core/navigation/root/RootComponent$Child$FareDetails;", "Lapp/chalo/core/navigation/root/RootComponent$Child$ForceAppUpdate;", "Lapp/chalo/core/navigation/root/RootComponent$Child$GroupTicketLegSelection;", "Lapp/chalo/core/navigation/root/RootComponent$Child$GroupTicketSummary;", "Lapp/chalo/core/navigation/root/RootComponent$Child$Home;", "Lapp/chalo/core/navigation/root/RootComponent$Child$LanguageSelection;", "Lapp/chalo/core/navigation/root/RootComponent$Child$LocationDisclaimer;", "Lapp/chalo/core/navigation/root/RootComponent$Child$LoginOptions;", "Lapp/chalo/core/navigation/root/RootComponent$Child$LoginOtp;", "Lapp/chalo/core/navigation/root/RootComponent$Child$MTicketPassengerSelection;", "Lapp/chalo/core/navigation/root/RootComponent$Child$MTicketTripInfo;", "Lapp/chalo/core/navigation/root/RootComponent$Child$MetroLanding;", "Lapp/chalo/core/navigation/root/RootComponent$Child$MinKycDetails;", "Lapp/chalo/core/navigation/root/RootComponent$Child$MinKycOtp;", "Lapp/chalo/core/navigation/root/RootComponent$Child$MinProfileUpdate;", "Lapp/chalo/core/navigation/root/RootComponent$Child$NCMCOnlineCardRecharge;", "Lapp/chalo/core/navigation/root/RootComponent$Child$NearbyStopsMap;", "Lapp/chalo/core/navigation/root/RootComponent$Child$NetworkInspector;", "Lapp/chalo/core/navigation/root/RootComponent$Child$NewPremiumBusReserveTicketActivation;", "Lapp/chalo/core/navigation/root/RootComponent$Child$OfflineCardRecharge;", "Lapp/chalo/core/navigation/root/RootComponent$Child$PassSelection;", "Lapp/chalo/core/navigation/root/RootComponent$Child$PassSummary;", "Lapp/chalo/core/navigation/root/RootComponent$Child$PayForTicket;", "Lapp/chalo/core/navigation/root/RootComponent$Child$PbBulkBookingRideDetails;", "Lapp/chalo/core/navigation/root/RootComponent$Child$PickRouteLocation;", "Lapp/chalo/core/navigation/root/RootComponent$Child$PickStop;", "Lapp/chalo/core/navigation/root/RootComponent$Child$PremiumBusChangeStop;", "Lapp/chalo/core/navigation/root/RootComponent$Child$PremiumBusFareDetails;", "Lapp/chalo/core/navigation/root/RootComponent$Child$PremiumBusFlow;", "Lapp/chalo/core/navigation/root/RootComponent$Child$PremiumBusNotification;", "Lapp/chalo/core/navigation/root/RootComponent$Child$PremiumBusProductModificationReasons;", "Lapp/chalo/core/navigation/root/RootComponent$Child$PremiumBusTutorial;", "Lapp/chalo/core/navigation/root/RootComponent$Child$ProductActivation;", "Lapp/chalo/core/navigation/root/RootComponent$Child$ProductSelection;", "Lapp/chalo/core/navigation/root/RootComponent$Child$QuickPay;", "Lapp/chalo/core/navigation/root/RootComponent$Child$ReportProblem;", "Lapp/chalo/core/navigation/root/RootComponent$Child$RideReceipt;", "Lapp/chalo/core/navigation/root/RootComponent$Child$RideUserFeedbackScreen;", "Lapp/chalo/core/navigation/root/RootComponent$Child$RouteBasedStopSearchForProductPurchase;", "Lapp/chalo/core/navigation/root/RootComponent$Child$RouteDetails;", "Lapp/chalo/core/navigation/root/RootComponent$Child$SOS;", "Lapp/chalo/core/navigation/root/RootComponent$Child$SavedPlacesAndRides;", "Lapp/chalo/core/navigation/root/RootComponent$Child$SelectRide;", "Lapp/chalo/core/navigation/root/RootComponent$Child$Splash;", "Lapp/chalo/core/navigation/root/RootComponent$Child$StopBasedMetroLanding;", "Lapp/chalo/core/navigation/root/RootComponent$Child$StopBasedRouteSearchForProductPurchase;", "Lapp/chalo/core/navigation/root/RootComponent$Child$StopTripDetails;", "Lapp/chalo/core/navigation/root/RootComponent$Child$StopTripPlannerResultsScreen;", "Lapp/chalo/core/navigation/root/RootComponent$Child$StopTripPlannerSearchScreen;", "Lapp/chalo/core/navigation/root/RootComponent$Child$SuperPassBookingSuccess;", "Lapp/chalo/core/navigation/root/RootComponent$Child$SuperPassFlow;", "Lapp/chalo/core/navigation/root/RootComponent$Child$SuperPassVerificationStatus;", "Lapp/chalo/core/navigation/root/RootComponent$Child$TicketSummary;", "Lapp/chalo/core/navigation/root/RootComponent$Child$TitoRideDetails;", "Lapp/chalo/core/navigation/root/RootComponent$Child$TripPlannerDetailsScreen;", "Lapp/chalo/core/navigation/root/RootComponent$Child$TripPlannerResultsScreen;", "Lapp/chalo/core/navigation/root/RootComponent$Child$UniversalPicker;", "Lapp/chalo/core/navigation/root/RootComponent$Child$UserConsent;", "Lapp/chalo/core/navigation/root/RootComponent$Child$UserProfileForm;", "Lapp/chalo/core/navigation/root/RootComponent$Child$ValidationFlow;", "Lapp/chalo/core/navigation/root/RootComponent$Child$WalletFlow;", "Lapp/chalo/core/navigation/root/RootComponent$Child$WebView;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Child {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$AppMigrationPreconditions;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class AppMigrationPreconditions extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final AppMigrationPreconditionsComponent f2198a;

            public AppMigrationPreconditions(AppMigrationPreconditionsComponent appMigrationPreconditionsComponent) {
                this.f2198a = appMigrationPreconditionsComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2198a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AppMigrationPreconditions) && Intrinsics.d(this.f2198a, ((AppMigrationPreconditions) obj).f2198a);
            }

            public final int hashCode() {
                return this.f2198a.hashCode();
            }

            public final String toString() {
                return "AppMigrationPreconditions(component=" + this.f2198a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$BookingHelp;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class BookingHelp extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BookingHelpScreenComponent f2199a;

            public BookingHelp(BookingHelpScreenComponent bookingHelpScreenComponent) {
                this.f2199a = bookingHelpScreenComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2199a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BookingHelp) && Intrinsics.d(this.f2199a, ((BookingHelp) obj).f2199a);
            }

            public final int hashCode() {
                return this.f2199a.hashCode();
            }

            public final String toString() {
                return "BookingHelp(component=" + this.f2199a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$BookingSuccess;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class BookingSuccess extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BookingSuccessComponent f2200a;

            public BookingSuccess(BookingSuccessComponent bookingSuccessComponent) {
                this.f2200a = bookingSuccessComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2200a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BookingSuccess) && Intrinsics.d(this.f2200a, ((BookingSuccess) obj).f2200a);
            }

            public final int hashCode() {
                return this.f2200a.hashCode();
            }

            public final String toString() {
                return "BookingSuccess(component=" + this.f2200a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$BusesAroundYou;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class BusesAroundYou extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BusesAroundYouComponent f2201a;

            public BusesAroundYou(BusesAroundYouComponent busesAroundYouComponent) {
                this.f2201a = busesAroundYouComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2201a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BusesAroundYou) && Intrinsics.d(this.f2201a, ((BusesAroundYou) obj).f2201a);
            }

            public final int hashCode() {
                return this.f2201a.hashCode();
            }

            public final String toString() {
                return "BusesAroundYou(component=" + this.f2201a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$CardPendingRecharge;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CardPendingRecharge extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PendingRechargeComponent f2202a;

            public CardPendingRecharge(PendingRechargeComponent pendingRechargeComponent) {
                this.f2202a = pendingRechargeComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2202a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CardPendingRecharge) && Intrinsics.d(this.f2202a, ((CardPendingRecharge) obj).f2202a);
            }

            public final int hashCode() {
                return this.f2202a.hashCode();
            }

            public final String toString() {
                return "CardPendingRecharge(component=" + this.f2202a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$CardTransactionDetail;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CardTransactionDetail extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CardTransactionDetailComponent f2203a;

            public CardTransactionDetail(CardTransactionDetailComponent cardTransactionDetailComponent) {
                this.f2203a = cardTransactionDetailComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2203a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CardTransactionDetail) && Intrinsics.d(this.f2203a, ((CardTransactionDetail) obj).f2203a);
            }

            public final int hashCode() {
                return this.f2203a.hashCode();
            }

            public final String toString() {
                return "CardTransactionDetail(component=" + this.f2203a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$CardTransactionHistory;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CardTransactionHistory extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CardTransactionHistoryComponent f2204a;

            public CardTransactionHistory(CardTransactionHistoryComponent cardTransactionHistoryComponent) {
                this.f2204a = cardTransactionHistoryComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2204a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CardTransactionHistory) && Intrinsics.d(this.f2204a, ((CardTransactionHistory) obj).f2204a);
            }

            public final int hashCode() {
                return this.f2204a.hashCode();
            }

            public final String toString() {
                return "CardTransactionHistory(component=" + this.f2204a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$ChaloBusRouteInfo;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ChaloBusRouteInfo extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ChaloBusRouteInfoComponent f2205a;

            public ChaloBusRouteInfo(ChaloBusRouteInfoComponent chaloBusRouteInfoComponent) {
                this.f2205a = chaloBusRouteInfoComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2205a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChaloBusRouteInfo) && Intrinsics.d(this.f2205a, ((ChaloBusRouteInfo) obj).f2205a);
            }

            public final int hashCode() {
                return this.f2205a.hashCode();
            }

            public final String toString() {
                return "ChaloBusRouteInfo(component=" + this.f2205a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$ChaloBusUserProfileSurvey;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ChaloBusUserProfileSurvey extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ChaloBusUserProfileSurveyComponent f2206a;

            public ChaloBusUserProfileSurvey(ChaloBusUserProfileSurveyComponent chaloBusUserProfileSurveyComponent) {
                this.f2206a = chaloBusUserProfileSurveyComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2206a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChaloBusUserProfileSurvey) && Intrinsics.d(this.f2206a, ((ChaloBusUserProfileSurvey) obj).f2206a);
            }

            public final int hashCode() {
                return this.f2206a.hashCode();
            }

            public final String toString() {
                return "ChaloBusUserProfileSurvey(component=" + this.f2206a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$ChaloCardEnterCardDetails;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ChaloCardEnterCardDetails extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final EnterCardDetailsComponent f2207a;

            public ChaloCardEnterCardDetails(EnterCardDetailsComponent enterCardDetailsComponent) {
                this.f2207a = enterCardDetailsComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2207a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChaloCardEnterCardDetails) && Intrinsics.d(this.f2207a, ((ChaloCardEnterCardDetails) obj).f2207a);
            }

            public final int hashCode() {
                return this.f2207a.hashCode();
            }

            public final String toString() {
                return "ChaloCardEnterCardDetails(component=" + this.f2207a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$ChaloCardLanding;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ChaloCardLanding extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ChaloCardInfoComponent f2208a;

            public ChaloCardLanding(ChaloCardInfoComponent chaloCardInfoComponent) {
                this.f2208a = chaloCardInfoComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2208a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChaloCardLanding) && Intrinsics.d(this.f2208a, ((ChaloCardLanding) obj).f2208a);
            }

            public final int hashCode() {
                return this.f2208a.hashCode();
            }

            public final String toString() {
                return "ChaloCardLanding(component=" + this.f2208a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$ChaloCardLink;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ChaloCardLink extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ChaloCardLinkCardComponent f2209a;

            public ChaloCardLink(ChaloCardLinkCardComponent chaloCardLinkCardComponent) {
                this.f2209a = chaloCardLinkCardComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2209a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChaloCardLink) && Intrinsics.d(this.f2209a, ((ChaloCardLink) obj).f2209a);
            }

            public final int hashCode() {
                return this.f2209a.hashCode();
            }

            public final String toString() {
                return "ChaloCardLink(component=" + this.f2209a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$ChaloCardRechargeAmount;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ChaloCardRechargeAmount extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ChaloCardRechargeAmountComponent f2210a;

            public ChaloCardRechargeAmount(ChaloCardRechargeAmountComponent chaloCardRechargeAmountComponent) {
                this.f2210a = chaloCardRechargeAmountComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2210a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChaloCardRechargeAmount) && Intrinsics.d(this.f2210a, ((ChaloCardRechargeAmount) obj).f2210a);
            }

            public final int hashCode() {
                return this.f2210a.hashCode();
            }

            public final String toString() {
                return "ChaloCardRechargeAmount(component=" + this.f2210a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$CheckoutFlow;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CheckoutFlow extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CheckoutParentComponent f2211a;

            public CheckoutFlow(CheckoutParentComponent checkoutParentComponent) {
                this.f2211a = checkoutParentComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2211a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CheckoutFlow) && Intrinsics.d(this.f2211a, ((CheckoutFlow) obj).f2211a);
            }

            public final int hashCode() {
                return this.f2211a.hashCode();
            }

            public final String toString() {
                return "CheckoutFlow(component=" + this.f2211a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$CityDiscontinued;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CityDiscontinued extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CityDiscontinuedComponent f2212a;

            public CityDiscontinued(CityDiscontinuedComponent cityDiscontinuedComponent) {
                this.f2212a = cityDiscontinuedComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2212a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CityDiscontinued) && Intrinsics.d(this.f2212a, ((CityDiscontinued) obj).f2212a);
            }

            public final int hashCode() {
                return this.f2212a.hashCode();
            }

            public final String toString() {
                return "CityDiscontinued(component=" + this.f2212a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$CitySelectionFlow;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CitySelectionFlow extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CitySelectionParentComponent f2213a;

            public CitySelectionFlow(CitySelectionParentComponent citySelectionParentComponent) {
                this.f2213a = citySelectionParentComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2213a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CitySelectionFlow) && Intrinsics.d(this.f2213a, ((CitySelectionFlow) obj).f2213a);
            }

            public final int hashCode() {
                return this.f2213a.hashCode();
            }

            public final String toString() {
                return "CitySelectionFlow(component=" + this.f2213a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$ConfirmBooking;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ConfirmBooking extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ConfirmBookingScreenComponent f2214a;

            public ConfirmBooking(ConfirmBookingScreenComponent confirmBookingScreenComponent) {
                this.f2214a = confirmBookingScreenComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2214a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ConfirmBooking) && Intrinsics.d(this.f2214a, ((ConfirmBooking) obj).f2214a);
            }

            public final int hashCode() {
                return this.f2214a.hashCode();
            }

            public final String toString() {
                return "ConfirmBooking(component=" + this.f2214a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$EBillAmount;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class EBillAmount extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final EbillAmountComponent f2215a;

            public EBillAmount(EbillAmountComponent ebillAmountComponent) {
                this.f2215a = ebillAmountComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2215a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof EBillAmount) && Intrinsics.d(this.f2215a, ((EBillAmount) obj).f2215a);
            }

            public final int hashCode() {
                return this.f2215a.hashCode();
            }

            public final String toString() {
                return "EBillAmount(component=" + this.f2215a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$EBillFetch;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class EBillFetch extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final EBillFetchComponent f2216a;

            public EBillFetch(EBillFetchComponent eBillFetchComponent) {
                this.f2216a = eBillFetchComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2216a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof EBillFetch) && Intrinsics.d(this.f2216a, ((EBillFetch) obj).f2216a);
            }

            public final int hashCode() {
                return this.f2216a.hashCode();
            }

            public final String toString() {
                return "EBillFetch(component=" + this.f2216a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$EBillPaymentConfirmation;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class EBillPaymentConfirmation extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final EBillPaymentConfirmationComponent f2217a;

            public EBillPaymentConfirmation(EBillPaymentConfirmationComponent eBillPaymentConfirmationComponent) {
                this.f2217a = eBillPaymentConfirmationComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2217a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof EBillPaymentConfirmation) && Intrinsics.d(this.f2217a, ((EBillPaymentConfirmation) obj).f2217a);
            }

            public final int hashCode() {
                return this.f2217a.hashCode();
            }

            public final String toString() {
                return "EBillPaymentConfirmation(component=" + this.f2217a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$EBillPaymentInvoice;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class EBillPaymentInvoice extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final EBillPaymentInvoiceComponent f2218a;

            public EBillPaymentInvoice(EBillPaymentInvoiceComponent eBillPaymentInvoiceComponent) {
                this.f2218a = eBillPaymentInvoiceComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2218a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof EBillPaymentInvoice) && Intrinsics.d(this.f2218a, ((EBillPaymentInvoice) obj).f2218a);
            }

            public final int hashCode() {
                return this.f2218a.hashCode();
            }

            public final String toString() {
                return "EBillPaymentInvoice(component=" + this.f2218a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$EBillPaymentSuccess;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class EBillPaymentSuccess extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final EBillPaymentSuccessComponent f2219a;

            public EBillPaymentSuccess(EBillPaymentSuccessComponent eBillPaymentSuccessComponent) {
                this.f2219a = eBillPaymentSuccessComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2219a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof EBillPaymentSuccess) && Intrinsics.d(this.f2219a, ((EBillPaymentSuccess) obj).f2219a);
            }

            public final int hashCode() {
                return this.f2219a.hashCode();
            }

            public final String toString() {
                return "EBillPaymentSuccess(component=" + this.f2219a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$ElectricityBillPaymentHistory;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ElectricityBillPaymentHistory extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ElectricityBillPaymentHistoryComponent f2220a;

            public ElectricityBillPaymentHistory(ElectricityBillPaymentHistoryComponent electricityBillPaymentHistoryComponent) {
                this.f2220a = electricityBillPaymentHistoryComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2220a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ElectricityBillPaymentHistory) && Intrinsics.d(this.f2220a, ((ElectricityBillPaymentHistory) obj).f2220a);
            }

            public final int hashCode() {
                return this.f2220a.hashCode();
            }

            public final String toString() {
                return "ElectricityBillPaymentHistory(component=" + this.f2220a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$FareDetails;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class FareDetails extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final FareDetailsCoordinatorComponent f2221a;

            public FareDetails(FareDetailsCoordinatorComponent fareDetailsCoordinatorComponent) {
                this.f2221a = fareDetailsCoordinatorComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2221a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FareDetails) && Intrinsics.d(this.f2221a, ((FareDetails) obj).f2221a);
            }

            public final int hashCode() {
                return this.f2221a.hashCode();
            }

            public final String toString() {
                return "FareDetails(component=" + this.f2221a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$ForceAppUpdate;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ForceAppUpdate extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ForceAppUpdateComponent f2222a;

            public ForceAppUpdate(ForceAppUpdateComponent forceAppUpdateComponent) {
                this.f2222a = forceAppUpdateComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2222a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ForceAppUpdate) && Intrinsics.d(this.f2222a, ((ForceAppUpdate) obj).f2222a);
            }

            public final int hashCode() {
                return this.f2222a.hashCode();
            }

            public final String toString() {
                return "ForceAppUpdate(component=" + this.f2222a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$GroupTicketLegSelection;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class GroupTicketLegSelection extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final GroupTicketLegSelectionComponent f2223a;

            public GroupTicketLegSelection(GroupTicketLegSelectionComponent groupTicketLegSelectionComponent) {
                this.f2223a = groupTicketLegSelectionComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2223a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof GroupTicketLegSelection) && Intrinsics.d(this.f2223a, ((GroupTicketLegSelection) obj).f2223a);
            }

            public final int hashCode() {
                return this.f2223a.hashCode();
            }

            public final String toString() {
                return "GroupTicketLegSelection(component=" + this.f2223a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$GroupTicketSummary;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class GroupTicketSummary extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final GroupTicketSummaryComponent f2224a;

            public GroupTicketSummary(GroupTicketSummaryComponent groupTicketSummaryComponent) {
                this.f2224a = groupTicketSummaryComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2224a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof GroupTicketSummary) && Intrinsics.d(this.f2224a, ((GroupTicketSummary) obj).f2224a);
            }

            public final int hashCode() {
                return this.f2224a.hashCode();
            }

            public final String toString() {
                return "GroupTicketSummary(component=" + this.f2224a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$Home;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Home extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final HomeComponent f2225a;

            public Home(HomeComponent homeComponent) {
                this.f2225a = homeComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2225a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Home) && Intrinsics.d(this.f2225a, ((Home) obj).f2225a);
            }

            public final int hashCode() {
                return this.f2225a.hashCode();
            }

            public final String toString() {
                return "Home(component=" + this.f2225a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$LanguageSelection;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class LanguageSelection extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LanguageSelectionComponent f2226a;

            public LanguageSelection(LanguageSelectionComponent languageSelectionComponent) {
                this.f2226a = languageSelectionComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2226a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LanguageSelection) && Intrinsics.d(this.f2226a, ((LanguageSelection) obj).f2226a);
            }

            public final int hashCode() {
                return this.f2226a.hashCode();
            }

            public final String toString() {
                return "LanguageSelection(component=" + this.f2226a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$LocationDisclaimer;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class LocationDisclaimer extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LocationDisclaimerComponent f2227a;

            public LocationDisclaimer(LocationDisclaimerComponent locationDisclaimerComponent) {
                this.f2227a = locationDisclaimerComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2227a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LocationDisclaimer) && Intrinsics.d(this.f2227a, ((LocationDisclaimer) obj).f2227a);
            }

            public final int hashCode() {
                return this.f2227a.hashCode();
            }

            public final String toString() {
                return "LocationDisclaimer(component=" + this.f2227a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$LoginOptions;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class LoginOptions extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LoginOptionsComponent f2228a;

            public LoginOptions(LoginOptionsComponent loginOptionsComponent) {
                this.f2228a = loginOptionsComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2228a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LoginOptions) && Intrinsics.d(this.f2228a, ((LoginOptions) obj).f2228a);
            }

            public final int hashCode() {
                return this.f2228a.hashCode();
            }

            public final String toString() {
                return "LoginOptions(component=" + this.f2228a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$LoginOtp;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class LoginOtp extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LoginOtpEnterComponent f2229a;

            public LoginOtp(LoginOtpEnterComponent loginOtpEnterComponent) {
                this.f2229a = loginOtpEnterComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2229a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LoginOtp) && Intrinsics.d(this.f2229a, ((LoginOtp) obj).f2229a);
            }

            public final int hashCode() {
                return this.f2229a.hashCode();
            }

            public final String toString() {
                return "LoginOtp(component=" + this.f2229a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$MTicketPassengerSelection;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class MTicketPassengerSelection extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MTicketPassengerSelectionComponent f2230a;

            static {
                Preferences.Key key = MTicketPassengerSelectionComponent.D;
            }

            public MTicketPassengerSelection(MTicketPassengerSelectionComponent mTicketPassengerSelectionComponent) {
                this.f2230a = mTicketPassengerSelectionComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2230a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MTicketPassengerSelection) && Intrinsics.d(this.f2230a, ((MTicketPassengerSelection) obj).f2230a);
            }

            public final int hashCode() {
                return this.f2230a.hashCode();
            }

            public final String toString() {
                return "MTicketPassengerSelection(component=" + this.f2230a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$MTicketTripInfo;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class MTicketTripInfo extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MTicketTripInfoComponent f2231a;

            public MTicketTripInfo(MTicketTripInfoComponent mTicketTripInfoComponent) {
                this.f2231a = mTicketTripInfoComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2231a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MTicketTripInfo) && Intrinsics.d(this.f2231a, ((MTicketTripInfo) obj).f2231a);
            }

            public final int hashCode() {
                return this.f2231a.hashCode();
            }

            public final String toString() {
                return "MTicketTripInfo(component=" + this.f2231a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$MetroLanding;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class MetroLanding extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MetroLandingScreenComponent f2232a;

            public MetroLanding(MetroLandingScreenComponent metroLandingScreenComponent) {
                this.f2232a = metroLandingScreenComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2232a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MetroLanding) && Intrinsics.d(this.f2232a, ((MetroLanding) obj).f2232a);
            }

            public final int hashCode() {
                return this.f2232a.hashCode();
            }

            public final String toString() {
                return "MetroLanding(component=" + this.f2232a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$MinKycDetails;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class MinKycDetails extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MinKycDetailsComponent f2233a;

            public MinKycDetails(MinKycDetailsComponent minKycDetailsComponent) {
                this.f2233a = minKycDetailsComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2233a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MinKycDetails) && Intrinsics.d(this.f2233a, ((MinKycDetails) obj).f2233a);
            }

            public final int hashCode() {
                return this.f2233a.hashCode();
            }

            public final String toString() {
                return "MinKycDetails(component=" + this.f2233a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$MinKycOtp;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class MinKycOtp extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MinKycOtpComponent f2234a;

            public MinKycOtp(MinKycOtpComponent minKycOtpComponent) {
                this.f2234a = minKycOtpComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2234a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MinKycOtp) && Intrinsics.d(this.f2234a, ((MinKycOtp) obj).f2234a);
            }

            public final int hashCode() {
                return this.f2234a.hashCode();
            }

            public final String toString() {
                return "MinKycOtp(component=" + this.f2234a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$MinProfileUpdate;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class MinProfileUpdate extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MinProfileUpdateComponent f2235a;

            public MinProfileUpdate(MinProfileUpdateComponent minProfileUpdateComponent) {
                this.f2235a = minProfileUpdateComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2235a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MinProfileUpdate) && Intrinsics.d(this.f2235a, ((MinProfileUpdate) obj).f2235a);
            }

            public final int hashCode() {
                return this.f2235a.hashCode();
            }

            public final String toString() {
                return "MinProfileUpdate(component=" + this.f2235a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$NCMCOnlineCardRecharge;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class NCMCOnlineCardRecharge extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final NcmcOnlineRechargeComponent f2236a;

            public NCMCOnlineCardRecharge(NcmcOnlineRechargeComponent ncmcOnlineRechargeComponent) {
                this.f2236a = ncmcOnlineRechargeComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2236a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NCMCOnlineCardRecharge) && Intrinsics.d(this.f2236a, ((NCMCOnlineCardRecharge) obj).f2236a);
            }

            public final int hashCode() {
                return this.f2236a.hashCode();
            }

            public final String toString() {
                return "NCMCOnlineCardRecharge(component=" + this.f2236a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$NearbyStopsMap;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class NearbyStopsMap extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final NearbyStopsMapComponent f2237a;

            public NearbyStopsMap(NearbyStopsMapComponent nearbyStopsMapComponent) {
                this.f2237a = nearbyStopsMapComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2237a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NearbyStopsMap) && Intrinsics.d(this.f2237a, ((NearbyStopsMap) obj).f2237a);
            }

            public final int hashCode() {
                return this.f2237a.hashCode();
            }

            public final String toString() {
                return "NearbyStopsMap(component=" + this.f2237a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$NetworkInspector;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class NetworkInspector extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final NetworkInspectorComponent f2238a;

            public NetworkInspector(NetworkInspectorComponent networkInspectorComponent) {
                this.f2238a = networkInspectorComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2238a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NetworkInspector) && Intrinsics.d(this.f2238a, ((NetworkInspector) obj).f2238a);
            }

            public final int hashCode() {
                return this.f2238a.hashCode();
            }

            public final String toString() {
                return "NetworkInspector(component=" + this.f2238a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$NewPremiumBusReserveTicketActivation;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class NewPremiumBusReserveTicketActivation extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final NewPremiumBusReserveTicketActivationComponent f2239a;

            public NewPremiumBusReserveTicketActivation(NewPremiumBusReserveTicketActivationComponent newPremiumBusReserveTicketActivationComponent) {
                this.f2239a = newPremiumBusReserveTicketActivationComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2239a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NewPremiumBusReserveTicketActivation) && Intrinsics.d(this.f2239a, ((NewPremiumBusReserveTicketActivation) obj).f2239a);
            }

            public final int hashCode() {
                return this.f2239a.hashCode();
            }

            public final String toString() {
                return "NewPremiumBusReserveTicketActivation(component=" + this.f2239a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$OfflineCardRecharge;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OfflineCardRecharge extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final OfflineCardRechargeComponent f2240a;

            public OfflineCardRecharge(OfflineCardRechargeComponent offlineCardRechargeComponent) {
                this.f2240a = offlineCardRechargeComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2240a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OfflineCardRecharge) && Intrinsics.d(this.f2240a, ((OfflineCardRecharge) obj).f2240a);
            }

            public final int hashCode() {
                return this.f2240a.hashCode();
            }

            public final String toString() {
                return "OfflineCardRecharge(component=" + this.f2240a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$PassSelection;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PassSelection extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PassSelectionComponent f2241a;

            public PassSelection(PassSelectionComponent passSelectionComponent) {
                this.f2241a = passSelectionComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2241a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PassSelection) && Intrinsics.d(this.f2241a, ((PassSelection) obj).f2241a);
            }

            public final int hashCode() {
                return this.f2241a.hashCode();
            }

            public final String toString() {
                return "PassSelection(component=" + this.f2241a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$PassSummary;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PassSummary extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PassSummaryComponent f2242a;

            public PassSummary(PassSummaryComponent passSummaryComponent) {
                this.f2242a = passSummaryComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2242a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PassSummary) && Intrinsics.d(this.f2242a, ((PassSummary) obj).f2242a);
            }

            public final int hashCode() {
                return this.f2242a.hashCode();
            }

            public final String toString() {
                return "PassSummary(component=" + this.f2242a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$PayForTicket;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PayForTicket extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PayForTicketComponent f2243a;

            public PayForTicket(PayForTicketComponent payForTicketComponent) {
                this.f2243a = payForTicketComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2243a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PayForTicket) && Intrinsics.d(this.f2243a, ((PayForTicket) obj).f2243a);
            }

            public final int hashCode() {
                return this.f2243a.hashCode();
            }

            public final String toString() {
                return "PayForTicket(component=" + this.f2243a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$PbBulkBookingRideDetails;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PbBulkBookingRideDetails extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PbBulkBookingRideDetailsComponent f2244a;

            public PbBulkBookingRideDetails(PbBulkBookingRideDetailsComponent pbBulkBookingRideDetailsComponent) {
                this.f2244a = pbBulkBookingRideDetailsComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2244a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PbBulkBookingRideDetails) && Intrinsics.d(this.f2244a, ((PbBulkBookingRideDetails) obj).f2244a);
            }

            public final int hashCode() {
                return this.f2244a.hashCode();
            }

            public final String toString() {
                return "PbBulkBookingRideDetails(component=" + this.f2244a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$PickRouteLocation;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PickRouteLocation extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PickRouteLocationComponent f2245a;

            public PickRouteLocation(PickRouteLocationComponent pickRouteLocationComponent) {
                this.f2245a = pickRouteLocationComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2245a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PickRouteLocation) && Intrinsics.d(this.f2245a, ((PickRouteLocation) obj).f2245a);
            }

            public final int hashCode() {
                return this.f2245a.hashCode();
            }

            public final String toString() {
                return "PickRouteLocation(component=" + this.f2245a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$PickStop;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PickStop extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PickStopComponent f2246a;

            public PickStop(PickStopComponent pickStopComponent) {
                this.f2246a = pickStopComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2246a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PickStop) && Intrinsics.d(this.f2246a, ((PickStop) obj).f2246a);
            }

            public final int hashCode() {
                return this.f2246a.hashCode();
            }

            public final String toString() {
                return "PickStop(component=" + this.f2246a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$PremiumBusChangeStop;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PremiumBusChangeStop extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PremiumBusChangeStopComponent f2247a;

            public PremiumBusChangeStop(PremiumBusChangeStopComponent premiumBusChangeStopComponent) {
                this.f2247a = premiumBusChangeStopComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2247a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PremiumBusChangeStop) && Intrinsics.d(this.f2247a, ((PremiumBusChangeStop) obj).f2247a);
            }

            public final int hashCode() {
                return this.f2247a.hashCode();
            }

            public final String toString() {
                return "PremiumBusChangeStop(component=" + this.f2247a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$PremiumBusFareDetails;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PremiumBusFareDetails extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PremiumBusFareDetailsComponent f2248a;

            static {
                PremiumBusFareDetailsFlowType.FreshPurchase freshPurchase = PremiumBusFareDetailsComponent.z;
            }

            public PremiumBusFareDetails(PremiumBusFareDetailsComponent premiumBusFareDetailsComponent) {
                this.f2248a = premiumBusFareDetailsComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2248a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PremiumBusFareDetails) && Intrinsics.d(this.f2248a, ((PremiumBusFareDetails) obj).f2248a);
            }

            public final int hashCode() {
                return this.f2248a.hashCode();
            }

            public final String toString() {
                return "PremiumBusFareDetails(component=" + this.f2248a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$PremiumBusFlow;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PremiumBusFlow extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PremiumBusParentComponent f2249a;

            public PremiumBusFlow(PremiumBusParentComponent premiumBusParentComponent) {
                this.f2249a = premiumBusParentComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2249a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PremiumBusFlow) && Intrinsics.d(this.f2249a, ((PremiumBusFlow) obj).f2249a);
            }

            public final int hashCode() {
                return this.f2249a.hashCode();
            }

            public final String toString() {
                return "PremiumBusFlow(component=" + this.f2249a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$PremiumBusNotification;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PremiumBusNotification extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PremiumBusNotificationComponent f2250a;

            public PremiumBusNotification(PremiumBusNotificationComponent premiumBusNotificationComponent) {
                this.f2250a = premiumBusNotificationComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2250a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PremiumBusNotification) && Intrinsics.d(this.f2250a, ((PremiumBusNotification) obj).f2250a);
            }

            public final int hashCode() {
                return this.f2250a.hashCode();
            }

            public final String toString() {
                return "PremiumBusNotification(component=" + this.f2250a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$PremiumBusProductModificationReasons;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PremiumBusProductModificationReasons extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PremiumBusProductModificationReasonsComponent f2251a;

            public PremiumBusProductModificationReasons(PremiumBusProductModificationReasonsComponent premiumBusProductModificationReasonsComponent) {
                this.f2251a = premiumBusProductModificationReasonsComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2251a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PremiumBusProductModificationReasons) && Intrinsics.d(this.f2251a, ((PremiumBusProductModificationReasons) obj).f2251a);
            }

            public final int hashCode() {
                return this.f2251a.hashCode();
            }

            public final String toString() {
                return "PremiumBusProductModificationReasons(component=" + this.f2251a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$PremiumBusTutorial;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PremiumBusTutorial extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PremiumBusTutorialComponent f2252a;

            public PremiumBusTutorial(PremiumBusTutorialComponent premiumBusTutorialComponent) {
                this.f2252a = premiumBusTutorialComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2252a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PremiumBusTutorial) && Intrinsics.d(this.f2252a, ((PremiumBusTutorial) obj).f2252a);
            }

            public final int hashCode() {
                return this.f2252a.hashCode();
            }

            public final String toString() {
                return "PremiumBusTutorial(component=" + this.f2252a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$ProductActivation;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ProductActivation extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ProductActivationComponent f2253a;

            public ProductActivation(ProductActivationComponent productActivationComponent) {
                this.f2253a = productActivationComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2253a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ProductActivation) && Intrinsics.d(this.f2253a, ((ProductActivation) obj).f2253a);
            }

            public final int hashCode() {
                return this.f2253a.hashCode();
            }

            public final String toString() {
                return "ProductActivation(component=" + this.f2253a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$ProductSelection;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ProductSelection extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ProductSelectionComponent f2254a;

            public ProductSelection(ProductSelectionComponent productSelectionComponent) {
                this.f2254a = productSelectionComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2254a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ProductSelection) && Intrinsics.d(this.f2254a, ((ProductSelection) obj).f2254a);
            }

            public final int hashCode() {
                return this.f2254a.hashCode();
            }

            public final String toString() {
                return "ProductSelection(component=" + this.f2254a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$QuickPay;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class QuickPay extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final QuickpayTripAmountComponent f2255a;

            public QuickPay(QuickpayTripAmountComponent quickpayTripAmountComponent) {
                this.f2255a = quickpayTripAmountComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2255a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof QuickPay) && Intrinsics.d(this.f2255a, ((QuickPay) obj).f2255a);
            }

            public final int hashCode() {
                return this.f2255a.hashCode();
            }

            public final String toString() {
                return "QuickPay(component=" + this.f2255a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$ReportProblem;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ReportProblem extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ReportProblemComponent f2256a;

            public ReportProblem(ReportProblemComponent reportProblemComponent) {
                this.f2256a = reportProblemComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2256a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ReportProblem) && Intrinsics.d(this.f2256a, ((ReportProblem) obj).f2256a);
            }

            public final int hashCode() {
                return this.f2256a.hashCode();
            }

            public final String toString() {
                return "ReportProblem(component=" + this.f2256a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$RideReceipt;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class RideReceipt extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final RideReceiptComponent f2257a;

            public RideReceipt(RideReceiptComponent rideReceiptComponent) {
                this.f2257a = rideReceiptComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2257a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RideReceipt) && Intrinsics.d(this.f2257a, ((RideReceipt) obj).f2257a);
            }

            public final int hashCode() {
                return this.f2257a.hashCode();
            }

            public final String toString() {
                return "RideReceipt(component=" + this.f2257a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$RideUserFeedbackScreen;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class RideUserFeedbackScreen extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final RideUserFeedbackComponent f2258a;

            public RideUserFeedbackScreen(RideUserFeedbackComponent rideUserFeedbackComponent) {
                this.f2258a = rideUserFeedbackComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2258a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RideUserFeedbackScreen) && Intrinsics.d(this.f2258a, ((RideUserFeedbackScreen) obj).f2258a);
            }

            public final int hashCode() {
                return this.f2258a.hashCode();
            }

            public final String toString() {
                return "RideUserFeedbackScreen(component=" + this.f2258a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$RouteBasedStopSearchForProductPurchase;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class RouteBasedStopSearchForProductPurchase extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final RouteBasedStopSearchForProductPurchaseComponent f2259a;

            public RouteBasedStopSearchForProductPurchase(RouteBasedStopSearchForProductPurchaseComponent routeBasedStopSearchForProductPurchaseComponent) {
                this.f2259a = routeBasedStopSearchForProductPurchaseComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2259a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RouteBasedStopSearchForProductPurchase) && Intrinsics.d(this.f2259a, ((RouteBasedStopSearchForProductPurchase) obj).f2259a);
            }

            public final int hashCode() {
                return this.f2259a.hashCode();
            }

            public final String toString() {
                return "RouteBasedStopSearchForProductPurchase(component=" + this.f2259a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$RouteDetails;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class RouteDetails extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final RouteDetailsComponent f2260a;

            public RouteDetails(RouteDetailsComponent routeDetailsComponent) {
                this.f2260a = routeDetailsComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2260a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RouteDetails) && Intrinsics.d(this.f2260a, ((RouteDetails) obj).f2260a);
            }

            public final int hashCode() {
                return this.f2260a.hashCode();
            }

            public final String toString() {
                return "RouteDetails(component=" + this.f2260a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$SOS;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SOS extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SosScreenComponent f2261a;

            public SOS(SosScreenComponent sosScreenComponent) {
                this.f2261a = sosScreenComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2261a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SOS) && Intrinsics.d(this.f2261a, ((SOS) obj).f2261a);
            }

            public final int hashCode() {
                return this.f2261a.hashCode();
            }

            public final String toString() {
                return "SOS(component=" + this.f2261a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$SavedPlacesAndRides;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SavedPlacesAndRides extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SavedPlacesAndRidesComponent f2262a;

            public SavedPlacesAndRides(SavedPlacesAndRidesComponent savedPlacesAndRidesComponent) {
                this.f2262a = savedPlacesAndRidesComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2262a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SavedPlacesAndRides) && Intrinsics.d(this.f2262a, ((SavedPlacesAndRides) obj).f2262a);
            }

            public final int hashCode() {
                return this.f2262a.hashCode();
            }

            public final String toString() {
                return "SavedPlacesAndRides(component=" + this.f2262a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$SelectRide;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SelectRide extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SelectRideComponent f2263a;

            public SelectRide(SelectRideComponent selectRideComponent) {
                this.f2263a = selectRideComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2263a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SelectRide) && Intrinsics.d(this.f2263a, ((SelectRide) obj).f2263a);
            }

            public final int hashCode() {
                return this.f2263a.hashCode();
            }

            public final String toString() {
                return "SelectRide(component=" + this.f2263a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$Splash;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Splash extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SplashScreenComponent f2264a;

            public Splash(SplashScreenComponent splashScreenComponent) {
                this.f2264a = splashScreenComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2264a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Splash) && Intrinsics.d(this.f2264a, ((Splash) obj).f2264a);
            }

            public final int hashCode() {
                return this.f2264a.hashCode();
            }

            public final String toString() {
                return "Splash(component=" + this.f2264a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$StopBasedMetroLanding;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class StopBasedMetroLanding extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final StopBasedMetroLandingScreenComponent f2265a;

            public StopBasedMetroLanding(StopBasedMetroLandingScreenComponent stopBasedMetroLandingScreenComponent) {
                this.f2265a = stopBasedMetroLandingScreenComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2265a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StopBasedMetroLanding) && Intrinsics.d(this.f2265a, ((StopBasedMetroLanding) obj).f2265a);
            }

            public final int hashCode() {
                return this.f2265a.hashCode();
            }

            public final String toString() {
                return "StopBasedMetroLanding(component=" + this.f2265a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$StopBasedRouteSearchForProductPurchase;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class StopBasedRouteSearchForProductPurchase extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final StopBasedRouteSearchForProductPurchaseComponent f2266a;

            public StopBasedRouteSearchForProductPurchase(StopBasedRouteSearchForProductPurchaseComponent stopBasedRouteSearchForProductPurchaseComponent) {
                this.f2266a = stopBasedRouteSearchForProductPurchaseComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2266a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StopBasedRouteSearchForProductPurchase) && Intrinsics.d(this.f2266a, ((StopBasedRouteSearchForProductPurchase) obj).f2266a);
            }

            public final int hashCode() {
                return this.f2266a.hashCode();
            }

            public final String toString() {
                return "StopBasedRouteSearchForProductPurchase(component=" + this.f2266a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$StopTripDetails;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class StopTripDetails extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final StopTripDetailsComponent f2267a;

            public StopTripDetails(StopTripDetailsComponent stopTripDetailsComponent) {
                this.f2267a = stopTripDetailsComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2267a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StopTripDetails) && Intrinsics.d(this.f2267a, ((StopTripDetails) obj).f2267a);
            }

            public final int hashCode() {
                return this.f2267a.hashCode();
            }

            public final String toString() {
                return "StopTripDetails(component=" + this.f2267a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$StopTripPlannerResultsScreen;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class StopTripPlannerResultsScreen extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final StopTripPlannerResultsComponent f2268a;

            public StopTripPlannerResultsScreen(StopTripPlannerResultsComponent stopTripPlannerResultsComponent) {
                this.f2268a = stopTripPlannerResultsComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2268a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StopTripPlannerResultsScreen) && Intrinsics.d(this.f2268a, ((StopTripPlannerResultsScreen) obj).f2268a);
            }

            public final int hashCode() {
                return this.f2268a.hashCode();
            }

            public final String toString() {
                return "StopTripPlannerResultsScreen(component=" + this.f2268a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$StopTripPlannerSearchScreen;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class StopTripPlannerSearchScreen extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final StopBasedTripPlannerSearchComponent f2269a;

            public StopTripPlannerSearchScreen(StopBasedTripPlannerSearchComponent stopBasedTripPlannerSearchComponent) {
                this.f2269a = stopBasedTripPlannerSearchComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2269a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StopTripPlannerSearchScreen) && Intrinsics.d(this.f2269a, ((StopTripPlannerSearchScreen) obj).f2269a);
            }

            public final int hashCode() {
                return this.f2269a.hashCode();
            }

            public final String toString() {
                return "StopTripPlannerSearchScreen(component=" + this.f2269a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$SuperPassBookingSuccess;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SuperPassBookingSuccess extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SuperPassBookingSuccessComponent f2270a;

            public SuperPassBookingSuccess(SuperPassBookingSuccessComponent superPassBookingSuccessComponent) {
                this.f2270a = superPassBookingSuccessComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2270a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SuperPassBookingSuccess) && Intrinsics.d(this.f2270a, ((SuperPassBookingSuccess) obj).f2270a);
            }

            public final int hashCode() {
                return this.f2270a.hashCode();
            }

            public final String toString() {
                return "SuperPassBookingSuccess(component=" + this.f2270a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$SuperPassFlow;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SuperPassFlow extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SuperPassParentComponent f2271a;

            public SuperPassFlow(SuperPassParentComponent superPassParentComponent) {
                this.f2271a = superPassParentComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2271a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SuperPassFlow) && Intrinsics.d(this.f2271a, ((SuperPassFlow) obj).f2271a);
            }

            public final int hashCode() {
                return this.f2271a.hashCode();
            }

            public final String toString() {
                return "SuperPassFlow(component=" + this.f2271a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$SuperPassVerificationStatus;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SuperPassVerificationStatus extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SuperPassVerificationStatusComponent f2272a;

            public SuperPassVerificationStatus(SuperPassVerificationStatusComponent superPassVerificationStatusComponent) {
                this.f2272a = superPassVerificationStatusComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2272a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SuperPassVerificationStatus) && Intrinsics.d(this.f2272a, ((SuperPassVerificationStatus) obj).f2272a);
            }

            public final int hashCode() {
                return this.f2272a.hashCode();
            }

            public final String toString() {
                return "SuperPassVerificationStatus(component=" + this.f2272a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$TicketSummary;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TicketSummary extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TicketSummaryComponent f2273a;

            public TicketSummary(TicketSummaryComponent ticketSummaryComponent) {
                this.f2273a = ticketSummaryComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2273a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TicketSummary) && Intrinsics.d(this.f2273a, ((TicketSummary) obj).f2273a);
            }

            public final int hashCode() {
                return this.f2273a.hashCode();
            }

            public final String toString() {
                return "TicketSummary(component=" + this.f2273a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$TitoRideDetails;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TitoRideDetails extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TitoRideDetailsComponent f2274a;

            public TitoRideDetails(TitoRideDetailsComponent titoRideDetailsComponent) {
                this.f2274a = titoRideDetailsComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2274a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TitoRideDetails) && Intrinsics.d(this.f2274a, ((TitoRideDetails) obj).f2274a);
            }

            public final int hashCode() {
                return this.f2274a.hashCode();
            }

            public final String toString() {
                return "TitoRideDetails(component=" + this.f2274a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$TripPlannerDetailsScreen;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TripPlannerDetailsScreen extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TripPlannerDetailsComponent f2275a;

            public TripPlannerDetailsScreen(TripPlannerDetailsComponent tripPlannerDetailsComponent) {
                this.f2275a = tripPlannerDetailsComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2275a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TripPlannerDetailsScreen) && Intrinsics.d(this.f2275a, ((TripPlannerDetailsScreen) obj).f2275a);
            }

            public final int hashCode() {
                return this.f2275a.hashCode();
            }

            public final String toString() {
                return "TripPlannerDetailsScreen(component=" + this.f2275a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$TripPlannerResultsScreen;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TripPlannerResultsScreen extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TripPlannerResultsComponent f2276a;

            static {
                List list = TripPlannerResultsComponent.Z;
            }

            public TripPlannerResultsScreen(TripPlannerResultsComponent tripPlannerResultsComponent) {
                this.f2276a = tripPlannerResultsComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2276a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TripPlannerResultsScreen) && Intrinsics.d(this.f2276a, ((TripPlannerResultsScreen) obj).f2276a);
            }

            public final int hashCode() {
                return this.f2276a.hashCode();
            }

            public final String toString() {
                return "TripPlannerResultsScreen(component=" + this.f2276a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$UniversalPicker;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class UniversalPicker extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UniversalPickerComponent f2277a;

            public UniversalPicker(UniversalPickerComponent universalPickerComponent) {
                this.f2277a = universalPickerComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2277a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UniversalPicker) && Intrinsics.d(this.f2277a, ((UniversalPicker) obj).f2277a);
            }

            public final int hashCode() {
                return this.f2277a.hashCode();
            }

            public final String toString() {
                return "UniversalPicker(component=" + this.f2277a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$UserConsent;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class UserConsent extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UserConsentComponent f2278a;

            public UserConsent(UserConsentComponent userConsentComponent) {
                this.f2278a = userConsentComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2278a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UserConsent) && Intrinsics.d(this.f2278a, ((UserConsent) obj).f2278a);
            }

            public final int hashCode() {
                return this.f2278a.hashCode();
            }

            public final String toString() {
                return "UserConsent(component=" + this.f2278a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$UserProfileForm;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class UserProfileForm extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UserProfileFormComponent f2279a;

            public UserProfileForm(UserProfileFormComponent userProfileFormComponent) {
                this.f2279a = userProfileFormComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2279a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UserProfileForm) && Intrinsics.d(this.f2279a, ((UserProfileForm) obj).f2279a);
            }

            public final int hashCode() {
                return this.f2279a.hashCode();
            }

            public final String toString() {
                return "UserProfileForm(component=" + this.f2279a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$ValidationFlow;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ValidationFlow extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ValidationParentComponent f2280a;

            public ValidationFlow(ValidationParentComponent validationParentComponent) {
                this.f2280a = validationParentComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2280a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ValidationFlow) && Intrinsics.d(this.f2280a, ((ValidationFlow) obj).f2280a);
            }

            public final int hashCode() {
                return this.f2280a.hashCode();
            }

            public final String toString() {
                return "ValidationFlow(component=" + this.f2280a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$WalletFlow;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class WalletFlow extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final WalletParentComponent f2281a;

            public WalletFlow(WalletParentComponent walletParentComponent) {
                this.f2281a = walletParentComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2281a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof WalletFlow) && Intrinsics.d(this.f2281a, ((WalletFlow) obj).f2281a);
            }

            public final int hashCode() {
                return this.f2281a.hashCode();
            }

            public final String toString() {
                return "WalletFlow(component=" + this.f2281a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/root/RootComponent$Child$WebView;", "Lapp/chalo/core/navigation/root/RootComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class WebView extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final WebViewScreenComponent f2282a;

            public WebView(WebViewScreenComponent webViewScreenComponent) {
                this.f2282a = webViewScreenComponent;
            }

            @Override // app.chalo.core.navigation.root.RootComponent.Child
            public final ComponentContext a() {
                return this.f2282a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof WebView) && Intrinsics.d(this.f2282a, ((WebView) obj).f2282a);
            }

            public final int hashCode() {
                return this.f2282a.hashCode();
            }

            public final String toString() {
                return "WebView(component=" + this.f2282a + ")";
            }
        }

        public abstract ComponentContext a();
    }

    void b(SceneArgs sceneArgs, SceneArgs sceneArgs2);

    void c(SceneArgs sceneArgs);

    void d(SceneArgs sceneArgs, ChaloScenes chaloScenes, boolean z);

    void e(SceneArgs sceneArgs);

    void f(ChaloScenes chaloScenes, boolean z);

    Value g();

    void h();

    /* JADX INFO: renamed from: j */
    BackHandler getD();

    void k();

    void l(SceneArgs sceneArgs);

    void m(List list);

    void n(SceneArgs sceneArgs);
}
