package app.chalo.core.component;

import app.chalo.appUpdate.ForceAppUpdateComponent;
import app.chalo.appmigrationpreconditions.AppMigrationPreconditionsComponent;
import app.chalo.appsupport.BookingHelpScreenComponent;
import app.chalo.bookingsuccess.BookingSuccessComponent;
import app.chalo.busesaroundyou.BusesAroundYouComponent;
import app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent;
import app.chalo.checkout.ui.screen.card.CheckoutCardComponent;
import app.chalo.checkout.ui.screen.checkout.customurl.CustomUrlCheckoutComponent;
import app.chalo.checkout.ui.screen.checkout.inai.InaiCheckoutComponent;
import app.chalo.checkout.ui.screen.checkout.phonepe.PhonePeCheckoutComponent;
import app.chalo.checkout.ui.screen.checkout.razorpay.CheckoutComponent;
import app.chalo.checkout.ui.screen.netbanking.CheckoutNetBankingComponent;
import app.chalo.checkout.ui.screen.payment.PaymentMainComponent;
import app.chalo.checkout.ui.screen.postpayment.CheckoutPostPaymentComponent;
import app.chalo.checkout.ui.screen.upi.CheckoutUpiAppsComponent;
import app.chalo.checkout.ui.screen.wallet.CheckoutWalletAppsComponent;
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
import app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionComponent;
import app.chalo.onboarding.cityselection.ui.CitySelectionComponent;
import app.chalo.onboarding.languageselection.LanguageSelectionComponent;
import app.chalo.onboarding.splash.SplashScreenComponent;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsComponent;
import app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumBusReserveTicketActivationComponent;
import app.chalo.premiumbus.ui.bulkbookingsuccess.PremiumBusBulkBookingConfirmationComponent;
import app.chalo.premiumbus.ui.changestop.PremiumBusChangeStopComponent;
import app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsComponent;
import app.chalo.premiumbus.ui.passpurchaselanding.PbPassPurchaseLandingScreenComponent;
import app.chalo.premiumbus.ui.productselection.PremiumBusProductSelectionComponent;
import app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionComponent;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent;
import app.chalo.premiumbus.ui.slotselectionlist.SlotSelectionListComponent;
import app.chalo.premiumbus.ui.stopdetails.PBStopDetailsComponent;
import app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionComponent;
import app.chalo.productactivation.ui.ProductActivationComponent;
import app.chalo.productbooking.pickroutelocation.PickRouteLocationComponent;
import app.chalo.productbooking.pickstop.PickStopComponent;
import app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassPurchaseViewModel;
import app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsViewModel;
import app.chalo.productpurchase.passpurchase.ui.passbookingsuccess.SuperPassBookingSuccessComponent;
import app.chalo.productpurchase.passpurchase.ui.passengerselection.SuperPassPassengerSelectionViewModel;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewViewModel;
import app.chalo.productpurchase.passpurchase.ui.proofupload.SuperPassUserProofUploadViewModel;
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
import app.chalo.scenes.args.CheckoutCardArgs;
import app.chalo.scenes.args.CheckoutInaiArgs;
import app.chalo.scenes.args.CheckoutNetBankingArgs;
import app.chalo.scenes.args.CheckoutPaymentMainArgs;
import app.chalo.scenes.args.CheckoutPhonePeArgs;
import app.chalo.scenes.args.CheckoutPostPaymentArgs;
import app.chalo.scenes.args.CheckoutRazorpayArgs;
import app.chalo.scenes.args.CheckoutUpiArgs;
import app.chalo.scenes.args.CheckoutWalletArgs;
import app.chalo.scenes.args.CityDiscontinuedArgs;
import app.chalo.scenes.args.CitySelectionArgs;
import app.chalo.scenes.args.ConfirmBookingScreenArgs;
import app.chalo.scenes.args.CustomUrlCheckoutArgs;
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
import app.chalo.scenes.args.WalletAllTransactionsArgs;
import app.chalo.scenes.args.WalletBalanceArgs;
import app.chalo.scenes.args.WalletLoadBalanceSuccessArgs;
import app.chalo.scenes.args.WalletLoadMoneyArgs;
import app.chalo.scenes.args.WalletTransactionSummaryArgs;
import app.chalo.scenes.args.WebViewArgs;
import app.chalo.sos.SosScreenComponent;
import app.chalo.stoptripdetails.ui.StopTripDetailsComponent;
import app.chalo.titoridedetail.ui.TitoRideDetailsComponent;
import app.chalo.tripreceipt.tripreceiptnew.RideReceiptComponent;
import app.chalo.userprofile.ui.UserProfileFormComponent;
import app.chalo.userprofile.ui.minprofileupdate.MinProfileUpdateComponent;
import app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponent;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent;
import app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationComponent;
import app.chalo.validationsdk.vehiclebasedvalidation.ui.QRScannerValidationComponent;
import app.chalo.wallet.ui.alltransactions.WalletAllTransactionsComponent;
import app.chalo.wallet.ui.loadbalance.WalletLoadBalanceEnterAmountComponent;
import app.chalo.wallet.ui.loadbalancesuccess.WalletLoadBalanceSuccessComponent;
import app.chalo.wallet.ui.mainbalance.WalletBalanceComponent;
import app.chalo.wallet.ui.transactionsummary.WalletTransactionSummaryComponent;
import app.chalo.webview.WebViewScreenComponent;
import com.arkivanov.decompose.ComponentContext;
import defpackage.b3;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.context.GlobalContext;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/component/AppComponentFactory;", "Lorg/koin/core/component/KoinComponent;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AppComponentFactory implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AppComponentFactory f2029a = new AppComponentFactory();

    @Override // org.koin.core.component.KoinComponent
    public final Koin L() {
        return GlobalContext.f18817a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(final SceneArgs sceneArgs, final ComponentContext componentContext, final Object... additionalParams) {
        Intrinsics.i(sceneArgs, "<this>");
        Intrinsics.i(componentContext, "componentContext");
        Intrinsics.i(additionalParams, "additionalParams");
        final int i = 2;
        final int i2 = 1;
        final int i3 = 0;
        if (sceneArgs instanceof AppMigrationPreconditionsArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI0 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA = Reflection.a(AppMigrationPreconditionsComponent.class);
                scopeI0.getClass();
                return scopeI0.d(classReferenceA, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO = b3.o(this);
            ClassReference classReferenceA2 = Reflection.a(AppMigrationPreconditionsComponent.class);
            scopeO.getClass();
            return scopeO.d(classReferenceA2, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof BookingHelpArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI1 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA3 = Reflection.a(BookingHelpScreenComponent.class);
                scopeI1.getClass();
                return scopeI1.d(classReferenceA3, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO2 = b3.o(this);
            ClassReference classReferenceA4 = Reflection.a(BookingHelpScreenComponent.class);
            scopeO2.getClass();
            return scopeO2.d(classReferenceA4, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof BookingSuccessArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI2 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA5 = Reflection.a(BookingSuccessComponent.class);
                scopeI2.getClass();
                return scopeI2.d(classReferenceA5, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO3 = b3.o(this);
            ClassReference classReferenceA6 = Reflection.a(BookingSuccessComponent.class);
            scopeO3.getClass();
            return scopeO3.d(classReferenceA6, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof BusesAroundYouArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI3 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA7 = Reflection.a(BusesAroundYouComponent.class);
                scopeI3.getClass();
                return scopeI3.d(classReferenceA7, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO4 = b3.o(this);
            ClassReference classReferenceA8 = Reflection.a(BusesAroundYouComponent.class);
            scopeO4.getClass();
            return scopeO4.d(classReferenceA8, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof CardLinkingScreenArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI4 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA9 = Reflection.a(ChaloCardLinkCardComponent.class);
                scopeI4.getClass();
                return scopeI4.d(classReferenceA9, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO5 = b3.o(this);
            ClassReference classReferenceA10 = Reflection.a(ChaloCardLinkCardComponent.class);
            scopeO5.getClass();
            return scopeO5.d(classReferenceA10, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof CardPendingRechargesScreenArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI5 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA11 = Reflection.a(PendingRechargeComponent.class);
                scopeI5.getClass();
                return scopeI5.d(classReferenceA11, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO6 = b3.o(this);
            ClassReference classReferenceA12 = Reflection.a(PendingRechargeComponent.class);
            scopeO6.getClass();
            return scopeO6.d(classReferenceA12, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof CardRechargeEnterAmountArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI6 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA13 = Reflection.a(ChaloCardRechargeAmountComponent.class);
                scopeI6.getClass();
                return scopeI6.d(classReferenceA13, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO7 = b3.o(this);
            ClassReference classReferenceA14 = Reflection.a(ChaloCardRechargeAmountComponent.class);
            scopeO7.getClass();
            return scopeO7.d(classReferenceA14, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof CardTransactionDetailArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI7 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA15 = Reflection.a(CardTransactionDetailComponent.class);
                scopeI7.getClass();
                return scopeI7.d(classReferenceA15, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO8 = b3.o(this);
            ClassReference classReferenceA16 = Reflection.a(CardTransactionDetailComponent.class);
            scopeO8.getClass();
            return scopeO8.d(classReferenceA16, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof CardTransactionHistoryArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI8 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA17 = Reflection.a(CardTransactionHistoryComponent.class);
                scopeI8.getClass();
                return scopeI8.d(classReferenceA17, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO9 = b3.o(this);
            ClassReference classReferenceA18 = Reflection.a(CardTransactionHistoryComponent.class);
            scopeO9.getClass();
            return scopeO9.d(classReferenceA18, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof ChaloBusRouteInfoScreenArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI9 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA19 = Reflection.a(ChaloBusRouteInfoComponent.class);
                scopeI9.getClass();
                return scopeI9.d(classReferenceA19, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO10 = b3.o(this);
            ClassReference classReferenceA20 = Reflection.a(ChaloBusRouteInfoComponent.class);
            scopeO10.getClass();
            return scopeO10.d(classReferenceA20, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof ChaloCardLandingScreenArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI10 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA21 = Reflection.a(ChaloCardInfoComponent.class);
                scopeI10.getClass();
                return scopeI10.d(classReferenceA21, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO11 = b3.o(this);
            ClassReference classReferenceA22 = Reflection.a(ChaloCardInfoComponent.class);
            scopeO11.getClass();
            return scopeO11.d(classReferenceA22, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof ChaloBusUserProfileSurveyArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI11 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA23 = Reflection.a(ChaloBusUserProfileSurveyComponent.class);
                scopeI11.getClass();
                return scopeI11.d(classReferenceA23, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO12 = b3.o(this);
            ClassReference classReferenceA24 = Reflection.a(ChaloBusUserProfileSurveyComponent.class);
            scopeO12.getClass();
            return scopeO12.d(classReferenceA24, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof CheckoutCardArgs) {
            final int i4 = 17;
            Function0 function0 = new Function0() { // from class: r6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i4) {
                        case 0:
                            ArrayList arrayList = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList.toArray(new Object[arrayList.size()]));
                        case 1:
                            ArrayList arrayList2 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList2.toArray(new Object[arrayList2.size()]));
                        case 2:
                            ArrayList arrayList3 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList3.toArray(new Object[arrayList3.size()]));
                        case 3:
                            ArrayList arrayList4 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList4.toArray(new Object[arrayList4.size()]));
                        case 4:
                            ArrayList arrayList5 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList5.toArray(new Object[arrayList5.size()]));
                        case 5:
                            ArrayList arrayList6 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList6.toArray(new Object[arrayList6.size()]));
                        case 6:
                            ArrayList arrayList7 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList7.toArray(new Object[arrayList7.size()]));
                        case 7:
                            ArrayList arrayList8 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList8.toArray(new Object[arrayList8.size()]));
                        case 8:
                            ArrayList arrayList9 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList9.toArray(new Object[arrayList9.size()]));
                        case 9:
                            ArrayList arrayList10 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList10.toArray(new Object[arrayList10.size()]));
                        case 10:
                            ArrayList arrayList11 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList11.toArray(new Object[arrayList11.size()]));
                        case 11:
                            ArrayList arrayList12 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList12.toArray(new Object[arrayList12.size()]));
                        case 12:
                            ArrayList arrayList13 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList13.toArray(new Object[arrayList13.size()]));
                        case 13:
                            ArrayList arrayList14 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList14.toArray(new Object[arrayList14.size()]));
                        case 14:
                            ArrayList arrayList15 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList15.toArray(new Object[arrayList15.size()]));
                        case 15:
                            ArrayList arrayList16 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList16.toArray(new Object[arrayList16.size()]));
                        case 16:
                            ArrayList arrayList17 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList17.toArray(new Object[arrayList17.size()]));
                        case 17:
                            ArrayList arrayList18 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList18.toArray(new Object[arrayList18.size()]));
                        case 18:
                            ArrayList arrayList19 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList19.toArray(new Object[arrayList19.size()]));
                        case 19:
                            ArrayList arrayList20 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList20.toArray(new Object[arrayList20.size()]));
                        case 20:
                            ArrayList arrayList21 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList21.toArray(new Object[arrayList21.size()]));
                        case 21:
                            ArrayList arrayList22 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList22.toArray(new Object[arrayList22.size()]));
                        case 22:
                            ArrayList arrayList23 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList23.toArray(new Object[arrayList23.size()]));
                        case 23:
                            ArrayList arrayList24 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList24.toArray(new Object[arrayList24.size()]));
                        default:
                            ArrayList arrayList25 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList25.toArray(new Object[arrayList25.size()]));
                    }
                }
            };
            return this instanceof KoinScopeComponent ? ((KoinScopeComponent) this).getF18811a().a(Reflection.a(CheckoutCardComponent.class), null, function0) : b3.o(this).a(Reflection.a(CheckoutCardComponent.class), null, function0);
        }
        if (sceneArgs instanceof CheckoutInaiArgs) {
            final int i5 = 18;
            Function0 function1 = new Function0() { // from class: r6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i5) {
                        case 0:
                            ArrayList arrayList = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList.toArray(new Object[arrayList.size()]));
                        case 1:
                            ArrayList arrayList2 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList2.toArray(new Object[arrayList2.size()]));
                        case 2:
                            ArrayList arrayList3 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList3.toArray(new Object[arrayList3.size()]));
                        case 3:
                            ArrayList arrayList4 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList4.toArray(new Object[arrayList4.size()]));
                        case 4:
                            ArrayList arrayList5 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList5.toArray(new Object[arrayList5.size()]));
                        case 5:
                            ArrayList arrayList6 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList6.toArray(new Object[arrayList6.size()]));
                        case 6:
                            ArrayList arrayList7 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList7.toArray(new Object[arrayList7.size()]));
                        case 7:
                            ArrayList arrayList8 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList8.toArray(new Object[arrayList8.size()]));
                        case 8:
                            ArrayList arrayList9 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList9.toArray(new Object[arrayList9.size()]));
                        case 9:
                            ArrayList arrayList10 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList10.toArray(new Object[arrayList10.size()]));
                        case 10:
                            ArrayList arrayList11 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList11.toArray(new Object[arrayList11.size()]));
                        case 11:
                            ArrayList arrayList12 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList12.toArray(new Object[arrayList12.size()]));
                        case 12:
                            ArrayList arrayList13 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList13.toArray(new Object[arrayList13.size()]));
                        case 13:
                            ArrayList arrayList14 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList14.toArray(new Object[arrayList14.size()]));
                        case 14:
                            ArrayList arrayList15 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList15.toArray(new Object[arrayList15.size()]));
                        case 15:
                            ArrayList arrayList16 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList16.toArray(new Object[arrayList16.size()]));
                        case 16:
                            ArrayList arrayList17 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList17.toArray(new Object[arrayList17.size()]));
                        case 17:
                            ArrayList arrayList18 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList18.toArray(new Object[arrayList18.size()]));
                        case 18:
                            ArrayList arrayList19 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList19.toArray(new Object[arrayList19.size()]));
                        case 19:
                            ArrayList arrayList20 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList20.toArray(new Object[arrayList20.size()]));
                        case 20:
                            ArrayList arrayList21 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList21.toArray(new Object[arrayList21.size()]));
                        case 21:
                            ArrayList arrayList22 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList22.toArray(new Object[arrayList22.size()]));
                        case 22:
                            ArrayList arrayList23 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList23.toArray(new Object[arrayList23.size()]));
                        case 23:
                            ArrayList arrayList24 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList24.toArray(new Object[arrayList24.size()]));
                        default:
                            ArrayList arrayList25 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList25.toArray(new Object[arrayList25.size()]));
                    }
                }
            };
            return this instanceof KoinScopeComponent ? ((KoinScopeComponent) this).getF18811a().a(Reflection.a(InaiCheckoutComponent.class), null, function1) : b3.o(this).a(Reflection.a(InaiCheckoutComponent.class), null, function1);
        }
        if (sceneArgs instanceof CheckoutNetBankingArgs) {
            final int i6 = 19;
            Function0 function2 = new Function0() { // from class: r6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i6) {
                        case 0:
                            ArrayList arrayList = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList.toArray(new Object[arrayList.size()]));
                        case 1:
                            ArrayList arrayList2 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList2.toArray(new Object[arrayList2.size()]));
                        case 2:
                            ArrayList arrayList3 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList3.toArray(new Object[arrayList3.size()]));
                        case 3:
                            ArrayList arrayList4 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList4.toArray(new Object[arrayList4.size()]));
                        case 4:
                            ArrayList arrayList5 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList5.toArray(new Object[arrayList5.size()]));
                        case 5:
                            ArrayList arrayList6 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList6.toArray(new Object[arrayList6.size()]));
                        case 6:
                            ArrayList arrayList7 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList7.toArray(new Object[arrayList7.size()]));
                        case 7:
                            ArrayList arrayList8 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList8.toArray(new Object[arrayList8.size()]));
                        case 8:
                            ArrayList arrayList9 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList9.toArray(new Object[arrayList9.size()]));
                        case 9:
                            ArrayList arrayList10 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList10.toArray(new Object[arrayList10.size()]));
                        case 10:
                            ArrayList arrayList11 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList11.toArray(new Object[arrayList11.size()]));
                        case 11:
                            ArrayList arrayList12 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList12.toArray(new Object[arrayList12.size()]));
                        case 12:
                            ArrayList arrayList13 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList13.toArray(new Object[arrayList13.size()]));
                        case 13:
                            ArrayList arrayList14 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList14.toArray(new Object[arrayList14.size()]));
                        case 14:
                            ArrayList arrayList15 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList15.toArray(new Object[arrayList15.size()]));
                        case 15:
                            ArrayList arrayList16 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList16.toArray(new Object[arrayList16.size()]));
                        case 16:
                            ArrayList arrayList17 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList17.toArray(new Object[arrayList17.size()]));
                        case 17:
                            ArrayList arrayList18 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList18.toArray(new Object[arrayList18.size()]));
                        case 18:
                            ArrayList arrayList19 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList19.toArray(new Object[arrayList19.size()]));
                        case 19:
                            ArrayList arrayList20 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList20.toArray(new Object[arrayList20.size()]));
                        case 20:
                            ArrayList arrayList21 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList21.toArray(new Object[arrayList21.size()]));
                        case 21:
                            ArrayList arrayList22 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList22.toArray(new Object[arrayList22.size()]));
                        case 22:
                            ArrayList arrayList23 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList23.toArray(new Object[arrayList23.size()]));
                        case 23:
                            ArrayList arrayList24 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList24.toArray(new Object[arrayList24.size()]));
                        default:
                            ArrayList arrayList25 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList25.toArray(new Object[arrayList25.size()]));
                    }
                }
            };
            return this instanceof KoinScopeComponent ? ((KoinScopeComponent) this).getF18811a().a(Reflection.a(CheckoutNetBankingComponent.class), null, function2) : b3.o(this).a(Reflection.a(CheckoutNetBankingComponent.class), null, function2);
        }
        if (sceneArgs instanceof CheckoutPhonePeArgs) {
            final int i7 = 20;
            Function0 function3 = new Function0() { // from class: r6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i7) {
                        case 0:
                            ArrayList arrayList = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList.toArray(new Object[arrayList.size()]));
                        case 1:
                            ArrayList arrayList2 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList2.toArray(new Object[arrayList2.size()]));
                        case 2:
                            ArrayList arrayList3 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList3.toArray(new Object[arrayList3.size()]));
                        case 3:
                            ArrayList arrayList4 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList4.toArray(new Object[arrayList4.size()]));
                        case 4:
                            ArrayList arrayList5 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList5.toArray(new Object[arrayList5.size()]));
                        case 5:
                            ArrayList arrayList6 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList6.toArray(new Object[arrayList6.size()]));
                        case 6:
                            ArrayList arrayList7 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList7.toArray(new Object[arrayList7.size()]));
                        case 7:
                            ArrayList arrayList8 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList8.toArray(new Object[arrayList8.size()]));
                        case 8:
                            ArrayList arrayList9 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList9.toArray(new Object[arrayList9.size()]));
                        case 9:
                            ArrayList arrayList10 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList10.toArray(new Object[arrayList10.size()]));
                        case 10:
                            ArrayList arrayList11 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList11.toArray(new Object[arrayList11.size()]));
                        case 11:
                            ArrayList arrayList12 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList12.toArray(new Object[arrayList12.size()]));
                        case 12:
                            ArrayList arrayList13 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList13.toArray(new Object[arrayList13.size()]));
                        case 13:
                            ArrayList arrayList14 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList14.toArray(new Object[arrayList14.size()]));
                        case 14:
                            ArrayList arrayList15 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList15.toArray(new Object[arrayList15.size()]));
                        case 15:
                            ArrayList arrayList16 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList16.toArray(new Object[arrayList16.size()]));
                        case 16:
                            ArrayList arrayList17 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList17.toArray(new Object[arrayList17.size()]));
                        case 17:
                            ArrayList arrayList18 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList18.toArray(new Object[arrayList18.size()]));
                        case 18:
                            ArrayList arrayList19 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList19.toArray(new Object[arrayList19.size()]));
                        case 19:
                            ArrayList arrayList20 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList20.toArray(new Object[arrayList20.size()]));
                        case 20:
                            ArrayList arrayList21 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList21.toArray(new Object[arrayList21.size()]));
                        case 21:
                            ArrayList arrayList22 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList22.toArray(new Object[arrayList22.size()]));
                        case 22:
                            ArrayList arrayList23 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList23.toArray(new Object[arrayList23.size()]));
                        case 23:
                            ArrayList arrayList24 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList24.toArray(new Object[arrayList24.size()]));
                        default:
                            ArrayList arrayList25 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList25.toArray(new Object[arrayList25.size()]));
                    }
                }
            };
            return this instanceof KoinScopeComponent ? ((KoinScopeComponent) this).getF18811a().a(Reflection.a(PhonePeCheckoutComponent.class), null, function3) : b3.o(this).a(Reflection.a(PhonePeCheckoutComponent.class), null, function3);
        }
        if (sceneArgs instanceof CheckoutRazorpayArgs) {
            final int i8 = 21;
            Function0 function4 = new Function0() { // from class: r6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i8) {
                        case 0:
                            ArrayList arrayList = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList.toArray(new Object[arrayList.size()]));
                        case 1:
                            ArrayList arrayList2 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList2.toArray(new Object[arrayList2.size()]));
                        case 2:
                            ArrayList arrayList3 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList3.toArray(new Object[arrayList3.size()]));
                        case 3:
                            ArrayList arrayList4 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList4.toArray(new Object[arrayList4.size()]));
                        case 4:
                            ArrayList arrayList5 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList5.toArray(new Object[arrayList5.size()]));
                        case 5:
                            ArrayList arrayList6 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList6.toArray(new Object[arrayList6.size()]));
                        case 6:
                            ArrayList arrayList7 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList7.toArray(new Object[arrayList7.size()]));
                        case 7:
                            ArrayList arrayList8 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList8.toArray(new Object[arrayList8.size()]));
                        case 8:
                            ArrayList arrayList9 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList9.toArray(new Object[arrayList9.size()]));
                        case 9:
                            ArrayList arrayList10 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList10.toArray(new Object[arrayList10.size()]));
                        case 10:
                            ArrayList arrayList11 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList11.toArray(new Object[arrayList11.size()]));
                        case 11:
                            ArrayList arrayList12 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList12.toArray(new Object[arrayList12.size()]));
                        case 12:
                            ArrayList arrayList13 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList13.toArray(new Object[arrayList13.size()]));
                        case 13:
                            ArrayList arrayList14 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList14.toArray(new Object[arrayList14.size()]));
                        case 14:
                            ArrayList arrayList15 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList15.toArray(new Object[arrayList15.size()]));
                        case 15:
                            ArrayList arrayList16 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList16.toArray(new Object[arrayList16.size()]));
                        case 16:
                            ArrayList arrayList17 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList17.toArray(new Object[arrayList17.size()]));
                        case 17:
                            ArrayList arrayList18 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList18.toArray(new Object[arrayList18.size()]));
                        case 18:
                            ArrayList arrayList19 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList19.toArray(new Object[arrayList19.size()]));
                        case 19:
                            ArrayList arrayList20 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList20.toArray(new Object[arrayList20.size()]));
                        case 20:
                            ArrayList arrayList21 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList21.toArray(new Object[arrayList21.size()]));
                        case 21:
                            ArrayList arrayList22 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList22.toArray(new Object[arrayList22.size()]));
                        case 22:
                            ArrayList arrayList23 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList23.toArray(new Object[arrayList23.size()]));
                        case 23:
                            ArrayList arrayList24 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList24.toArray(new Object[arrayList24.size()]));
                        default:
                            ArrayList arrayList25 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList25.toArray(new Object[arrayList25.size()]));
                    }
                }
            };
            return this instanceof KoinScopeComponent ? ((KoinScopeComponent) this).getF18811a().a(Reflection.a(CheckoutComponent.class), null, function4) : b3.o(this).a(Reflection.a(CheckoutComponent.class), null, function4);
        }
        if (sceneArgs instanceof CheckoutPaymentMainArgs) {
            final int i9 = 22;
            Function0 function5 = new Function0() { // from class: r6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i9) {
                        case 0:
                            ArrayList arrayList = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList.toArray(new Object[arrayList.size()]));
                        case 1:
                            ArrayList arrayList2 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList2.toArray(new Object[arrayList2.size()]));
                        case 2:
                            ArrayList arrayList3 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList3.toArray(new Object[arrayList3.size()]));
                        case 3:
                            ArrayList arrayList4 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList4.toArray(new Object[arrayList4.size()]));
                        case 4:
                            ArrayList arrayList5 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList5.toArray(new Object[arrayList5.size()]));
                        case 5:
                            ArrayList arrayList6 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList6.toArray(new Object[arrayList6.size()]));
                        case 6:
                            ArrayList arrayList7 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList7.toArray(new Object[arrayList7.size()]));
                        case 7:
                            ArrayList arrayList8 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList8.toArray(new Object[arrayList8.size()]));
                        case 8:
                            ArrayList arrayList9 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList9.toArray(new Object[arrayList9.size()]));
                        case 9:
                            ArrayList arrayList10 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList10.toArray(new Object[arrayList10.size()]));
                        case 10:
                            ArrayList arrayList11 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList11.toArray(new Object[arrayList11.size()]));
                        case 11:
                            ArrayList arrayList12 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList12.toArray(new Object[arrayList12.size()]));
                        case 12:
                            ArrayList arrayList13 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList13.toArray(new Object[arrayList13.size()]));
                        case 13:
                            ArrayList arrayList14 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList14.toArray(new Object[arrayList14.size()]));
                        case 14:
                            ArrayList arrayList15 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList15.toArray(new Object[arrayList15.size()]));
                        case 15:
                            ArrayList arrayList16 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList16.toArray(new Object[arrayList16.size()]));
                        case 16:
                            ArrayList arrayList17 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList17.toArray(new Object[arrayList17.size()]));
                        case 17:
                            ArrayList arrayList18 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList18.toArray(new Object[arrayList18.size()]));
                        case 18:
                            ArrayList arrayList19 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList19.toArray(new Object[arrayList19.size()]));
                        case 19:
                            ArrayList arrayList20 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList20.toArray(new Object[arrayList20.size()]));
                        case 20:
                            ArrayList arrayList21 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList21.toArray(new Object[arrayList21.size()]));
                        case 21:
                            ArrayList arrayList22 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList22.toArray(new Object[arrayList22.size()]));
                        case 22:
                            ArrayList arrayList23 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList23.toArray(new Object[arrayList23.size()]));
                        case 23:
                            ArrayList arrayList24 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList24.toArray(new Object[arrayList24.size()]));
                        default:
                            ArrayList arrayList25 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList25.toArray(new Object[arrayList25.size()]));
                    }
                }
            };
            return this instanceof KoinScopeComponent ? ((KoinScopeComponent) this).getF18811a().a(Reflection.a(PaymentMainComponent.class), null, function5) : b3.o(this).a(Reflection.a(PaymentMainComponent.class), null, function5);
        }
        if (sceneArgs instanceof CheckoutPostPaymentArgs) {
            final int i10 = 23;
            Function0 function6 = new Function0() { // from class: r6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i10) {
                        case 0:
                            ArrayList arrayList = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList.toArray(new Object[arrayList.size()]));
                        case 1:
                            ArrayList arrayList2 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList2.toArray(new Object[arrayList2.size()]));
                        case 2:
                            ArrayList arrayList3 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList3.toArray(new Object[arrayList3.size()]));
                        case 3:
                            ArrayList arrayList4 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList4.toArray(new Object[arrayList4.size()]));
                        case 4:
                            ArrayList arrayList5 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList5.toArray(new Object[arrayList5.size()]));
                        case 5:
                            ArrayList arrayList6 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList6.toArray(new Object[arrayList6.size()]));
                        case 6:
                            ArrayList arrayList7 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList7.toArray(new Object[arrayList7.size()]));
                        case 7:
                            ArrayList arrayList8 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList8.toArray(new Object[arrayList8.size()]));
                        case 8:
                            ArrayList arrayList9 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList9.toArray(new Object[arrayList9.size()]));
                        case 9:
                            ArrayList arrayList10 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList10.toArray(new Object[arrayList10.size()]));
                        case 10:
                            ArrayList arrayList11 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList11.toArray(new Object[arrayList11.size()]));
                        case 11:
                            ArrayList arrayList12 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList12.toArray(new Object[arrayList12.size()]));
                        case 12:
                            ArrayList arrayList13 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList13.toArray(new Object[arrayList13.size()]));
                        case 13:
                            ArrayList arrayList14 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList14.toArray(new Object[arrayList14.size()]));
                        case 14:
                            ArrayList arrayList15 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList15.toArray(new Object[arrayList15.size()]));
                        case 15:
                            ArrayList arrayList16 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList16.toArray(new Object[arrayList16.size()]));
                        case 16:
                            ArrayList arrayList17 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList17.toArray(new Object[arrayList17.size()]));
                        case 17:
                            ArrayList arrayList18 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList18.toArray(new Object[arrayList18.size()]));
                        case 18:
                            ArrayList arrayList19 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList19.toArray(new Object[arrayList19.size()]));
                        case 19:
                            ArrayList arrayList20 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList20.toArray(new Object[arrayList20.size()]));
                        case 20:
                            ArrayList arrayList21 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList21.toArray(new Object[arrayList21.size()]));
                        case 21:
                            ArrayList arrayList22 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList22.toArray(new Object[arrayList22.size()]));
                        case 22:
                            ArrayList arrayList23 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList23.toArray(new Object[arrayList23.size()]));
                        case 23:
                            ArrayList arrayList24 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList24.toArray(new Object[arrayList24.size()]));
                        default:
                            ArrayList arrayList25 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList25.toArray(new Object[arrayList25.size()]));
                    }
                }
            };
            return this instanceof KoinScopeComponent ? ((KoinScopeComponent) this).getF18811a().a(Reflection.a(CheckoutPostPaymentComponent.class), null, function6) : b3.o(this).a(Reflection.a(CheckoutPostPaymentComponent.class), null, function6);
        }
        if (sceneArgs instanceof CheckoutUpiArgs) {
            final int i11 = 24;
            Function0 function7 = new Function0() { // from class: r6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i11) {
                        case 0:
                            ArrayList arrayList = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList.toArray(new Object[arrayList.size()]));
                        case 1:
                            ArrayList arrayList2 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList2.toArray(new Object[arrayList2.size()]));
                        case 2:
                            ArrayList arrayList3 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList3.toArray(new Object[arrayList3.size()]));
                        case 3:
                            ArrayList arrayList4 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList4.toArray(new Object[arrayList4.size()]));
                        case 4:
                            ArrayList arrayList5 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList5.toArray(new Object[arrayList5.size()]));
                        case 5:
                            ArrayList arrayList6 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList6.toArray(new Object[arrayList6.size()]));
                        case 6:
                            ArrayList arrayList7 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList7.toArray(new Object[arrayList7.size()]));
                        case 7:
                            ArrayList arrayList8 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList8.toArray(new Object[arrayList8.size()]));
                        case 8:
                            ArrayList arrayList9 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList9.toArray(new Object[arrayList9.size()]));
                        case 9:
                            ArrayList arrayList10 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList10.toArray(new Object[arrayList10.size()]));
                        case 10:
                            ArrayList arrayList11 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList11.toArray(new Object[arrayList11.size()]));
                        case 11:
                            ArrayList arrayList12 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList12.toArray(new Object[arrayList12.size()]));
                        case 12:
                            ArrayList arrayList13 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList13.toArray(new Object[arrayList13.size()]));
                        case 13:
                            ArrayList arrayList14 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList14.toArray(new Object[arrayList14.size()]));
                        case 14:
                            ArrayList arrayList15 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList15.toArray(new Object[arrayList15.size()]));
                        case 15:
                            ArrayList arrayList16 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList16.toArray(new Object[arrayList16.size()]));
                        case 16:
                            ArrayList arrayList17 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList17.toArray(new Object[arrayList17.size()]));
                        case 17:
                            ArrayList arrayList18 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList18.toArray(new Object[arrayList18.size()]));
                        case 18:
                            ArrayList arrayList19 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList19.toArray(new Object[arrayList19.size()]));
                        case 19:
                            ArrayList arrayList20 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList20.toArray(new Object[arrayList20.size()]));
                        case 20:
                            ArrayList arrayList21 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList21.toArray(new Object[arrayList21.size()]));
                        case 21:
                            ArrayList arrayList22 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList22.toArray(new Object[arrayList22.size()]));
                        case 22:
                            ArrayList arrayList23 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList23.toArray(new Object[arrayList23.size()]));
                        case 23:
                            ArrayList arrayList24 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList24.toArray(new Object[arrayList24.size()]));
                        default:
                            ArrayList arrayList25 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList25.toArray(new Object[arrayList25.size()]));
                    }
                }
            };
            return this instanceof KoinScopeComponent ? ((KoinScopeComponent) this).getF18811a().a(Reflection.a(CheckoutUpiAppsComponent.class), null, function7) : b3.o(this).a(Reflection.a(CheckoutUpiAppsComponent.class), null, function7);
        }
        if (sceneArgs instanceof CheckoutWalletArgs) {
            Function0 function8 = new Function0() { // from class: r6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i3) {
                        case 0:
                            ArrayList arrayList = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList.toArray(new Object[arrayList.size()]));
                        case 1:
                            ArrayList arrayList2 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList2.toArray(new Object[arrayList2.size()]));
                        case 2:
                            ArrayList arrayList3 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList3.toArray(new Object[arrayList3.size()]));
                        case 3:
                            ArrayList arrayList4 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList4.toArray(new Object[arrayList4.size()]));
                        case 4:
                            ArrayList arrayList5 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList5.toArray(new Object[arrayList5.size()]));
                        case 5:
                            ArrayList arrayList6 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList6.toArray(new Object[arrayList6.size()]));
                        case 6:
                            ArrayList arrayList7 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList7.toArray(new Object[arrayList7.size()]));
                        case 7:
                            ArrayList arrayList8 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList8.toArray(new Object[arrayList8.size()]));
                        case 8:
                            ArrayList arrayList9 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList9.toArray(new Object[arrayList9.size()]));
                        case 9:
                            ArrayList arrayList10 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList10.toArray(new Object[arrayList10.size()]));
                        case 10:
                            ArrayList arrayList11 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList11.toArray(new Object[arrayList11.size()]));
                        case 11:
                            ArrayList arrayList12 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList12.toArray(new Object[arrayList12.size()]));
                        case 12:
                            ArrayList arrayList13 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList13.toArray(new Object[arrayList13.size()]));
                        case 13:
                            ArrayList arrayList14 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList14.toArray(new Object[arrayList14.size()]));
                        case 14:
                            ArrayList arrayList15 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList15.toArray(new Object[arrayList15.size()]));
                        case 15:
                            ArrayList arrayList16 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList16.toArray(new Object[arrayList16.size()]));
                        case 16:
                            ArrayList arrayList17 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList17.toArray(new Object[arrayList17.size()]));
                        case 17:
                            ArrayList arrayList18 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList18.toArray(new Object[arrayList18.size()]));
                        case 18:
                            ArrayList arrayList19 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList19.toArray(new Object[arrayList19.size()]));
                        case 19:
                            ArrayList arrayList20 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList20.toArray(new Object[arrayList20.size()]));
                        case 20:
                            ArrayList arrayList21 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList21.toArray(new Object[arrayList21.size()]));
                        case 21:
                            ArrayList arrayList22 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList22.toArray(new Object[arrayList22.size()]));
                        case 22:
                            ArrayList arrayList23 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList23.toArray(new Object[arrayList23.size()]));
                        case 23:
                            ArrayList arrayList24 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList24.toArray(new Object[arrayList24.size()]));
                        default:
                            ArrayList arrayList25 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList25.toArray(new Object[arrayList25.size()]));
                    }
                }
            };
            return this instanceof KoinScopeComponent ? ((KoinScopeComponent) this).getF18811a().a(Reflection.a(CheckoutWalletAppsComponent.class), null, function8) : b3.o(this).a(Reflection.a(CheckoutWalletAppsComponent.class), null, function8);
        }
        if (sceneArgs instanceof CityDiscontinuedArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI12 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA25 = Reflection.a(CityDiscontinuedComponent.class);
                scopeI12.getClass();
                return scopeI12.d(classReferenceA25, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO13 = b3.o(this);
            ClassReference classReferenceA26 = Reflection.a(CityDiscontinuedComponent.class);
            scopeO13.getClass();
            return scopeO13.d(classReferenceA26, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof CitySelectionArgs.CityLocationSelectionArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI13 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA27 = Reflection.a(CityLocationSelectionComponent.class);
                scopeI13.getClass();
                return scopeI13.d(classReferenceA27, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO14 = b3.o(this);
            ClassReference classReferenceA28 = Reflection.a(CityLocationSelectionComponent.class);
            scopeO14.getClass();
            return scopeO14.d(classReferenceA28, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof CitySelectionArgs.OldCitySelectionArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI14 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA29 = Reflection.a(CitySelectionComponent.class);
                scopeI14.getClass();
                return scopeI14.d(classReferenceA29, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO15 = b3.o(this);
            ClassReference classReferenceA30 = Reflection.a(CitySelectionComponent.class);
            scopeO15.getClass();
            return scopeO15.d(classReferenceA30, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof ConfirmBookingScreenArgs) {
            Function0 function9 = new Function0() { // from class: r6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i2) {
                        case 0:
                            ArrayList arrayList = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList.toArray(new Object[arrayList.size()]));
                        case 1:
                            ArrayList arrayList2 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList2.toArray(new Object[arrayList2.size()]));
                        case 2:
                            ArrayList arrayList3 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList3.toArray(new Object[arrayList3.size()]));
                        case 3:
                            ArrayList arrayList4 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList4.toArray(new Object[arrayList4.size()]));
                        case 4:
                            ArrayList arrayList5 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList5.toArray(new Object[arrayList5.size()]));
                        case 5:
                            ArrayList arrayList6 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList6.toArray(new Object[arrayList6.size()]));
                        case 6:
                            ArrayList arrayList7 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList7.toArray(new Object[arrayList7.size()]));
                        case 7:
                            ArrayList arrayList8 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList8.toArray(new Object[arrayList8.size()]));
                        case 8:
                            ArrayList arrayList9 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList9.toArray(new Object[arrayList9.size()]));
                        case 9:
                            ArrayList arrayList10 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList10.toArray(new Object[arrayList10.size()]));
                        case 10:
                            ArrayList arrayList11 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList11.toArray(new Object[arrayList11.size()]));
                        case 11:
                            ArrayList arrayList12 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList12.toArray(new Object[arrayList12.size()]));
                        case 12:
                            ArrayList arrayList13 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList13.toArray(new Object[arrayList13.size()]));
                        case 13:
                            ArrayList arrayList14 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList14.toArray(new Object[arrayList14.size()]));
                        case 14:
                            ArrayList arrayList15 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList15.toArray(new Object[arrayList15.size()]));
                        case 15:
                            ArrayList arrayList16 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList16.toArray(new Object[arrayList16.size()]));
                        case 16:
                            ArrayList arrayList17 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList17.toArray(new Object[arrayList17.size()]));
                        case 17:
                            ArrayList arrayList18 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList18.toArray(new Object[arrayList18.size()]));
                        case 18:
                            ArrayList arrayList19 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList19.toArray(new Object[arrayList19.size()]));
                        case 19:
                            ArrayList arrayList20 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList20.toArray(new Object[arrayList20.size()]));
                        case 20:
                            ArrayList arrayList21 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList21.toArray(new Object[arrayList21.size()]));
                        case 21:
                            ArrayList arrayList22 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList22.toArray(new Object[arrayList22.size()]));
                        case 22:
                            ArrayList arrayList23 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList23.toArray(new Object[arrayList23.size()]));
                        case 23:
                            ArrayList arrayList24 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList24.toArray(new Object[arrayList24.size()]));
                        default:
                            ArrayList arrayList25 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList25.toArray(new Object[arrayList25.size()]));
                    }
                }
            };
            return this instanceof KoinScopeComponent ? ((KoinScopeComponent) this).getF18811a().a(Reflection.a(ConfirmBookingScreenComponent.class), null, function9) : b3.o(this).a(Reflection.a(ConfirmBookingScreenComponent.class), null, function9);
        }
        if (sceneArgs instanceof CustomUrlCheckoutArgs) {
            Function0 function10 = new Function0() { // from class: r6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i) {
                        case 0:
                            ArrayList arrayList = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList.toArray(new Object[arrayList.size()]));
                        case 1:
                            ArrayList arrayList2 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList2.toArray(new Object[arrayList2.size()]));
                        case 2:
                            ArrayList arrayList3 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList3.toArray(new Object[arrayList3.size()]));
                        case 3:
                            ArrayList arrayList4 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList4.toArray(new Object[arrayList4.size()]));
                        case 4:
                            ArrayList arrayList5 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList5.toArray(new Object[arrayList5.size()]));
                        case 5:
                            ArrayList arrayList6 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList6.toArray(new Object[arrayList6.size()]));
                        case 6:
                            ArrayList arrayList7 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList7.toArray(new Object[arrayList7.size()]));
                        case 7:
                            ArrayList arrayList8 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList8.toArray(new Object[arrayList8.size()]));
                        case 8:
                            ArrayList arrayList9 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList9.toArray(new Object[arrayList9.size()]));
                        case 9:
                            ArrayList arrayList10 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList10.toArray(new Object[arrayList10.size()]));
                        case 10:
                            ArrayList arrayList11 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList11.toArray(new Object[arrayList11.size()]));
                        case 11:
                            ArrayList arrayList12 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList12.toArray(new Object[arrayList12.size()]));
                        case 12:
                            ArrayList arrayList13 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList13.toArray(new Object[arrayList13.size()]));
                        case 13:
                            ArrayList arrayList14 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList14.toArray(new Object[arrayList14.size()]));
                        case 14:
                            ArrayList arrayList15 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList15.toArray(new Object[arrayList15.size()]));
                        case 15:
                            ArrayList arrayList16 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList16.toArray(new Object[arrayList16.size()]));
                        case 16:
                            ArrayList arrayList17 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList17.toArray(new Object[arrayList17.size()]));
                        case 17:
                            ArrayList arrayList18 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList18.toArray(new Object[arrayList18.size()]));
                        case 18:
                            ArrayList arrayList19 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList19.toArray(new Object[arrayList19.size()]));
                        case 19:
                            ArrayList arrayList20 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList20.toArray(new Object[arrayList20.size()]));
                        case 20:
                            ArrayList arrayList21 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList21.toArray(new Object[arrayList21.size()]));
                        case 21:
                            ArrayList arrayList22 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList22.toArray(new Object[arrayList22.size()]));
                        case 22:
                            ArrayList arrayList23 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList23.toArray(new Object[arrayList23.size()]));
                        case 23:
                            ArrayList arrayList24 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList24.toArray(new Object[arrayList24.size()]));
                        default:
                            ArrayList arrayList25 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList25.toArray(new Object[arrayList25.size()]));
                    }
                }
            };
            return this instanceof KoinScopeComponent ? ((KoinScopeComponent) this).getF18811a().a(Reflection.a(CustomUrlCheckoutComponent.class), null, function10) : b3.o(this).a(Reflection.a(CustomUrlCheckoutComponent.class), null, function10);
        }
        if (sceneArgs instanceof EBillAmountScreenArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI15 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA31 = Reflection.a(EbillAmountComponent.class);
                scopeI15.getClass();
                return scopeI15.d(classReferenceA31, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO16 = b3.o(this);
            ClassReference classReferenceA32 = Reflection.a(EbillAmountComponent.class);
            scopeO16.getClass();
            return scopeO16.d(classReferenceA32, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof EBillFetchScreenArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI16 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA33 = Reflection.a(EBillFetchComponent.class);
                scopeI16.getClass();
                return scopeI16.d(classReferenceA33, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO17 = b3.o(this);
            ClassReference classReferenceA34 = Reflection.a(EBillFetchComponent.class);
            scopeO17.getClass();
            return scopeO17.d(classReferenceA34, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof EBillHistoryScreenArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI17 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA35 = Reflection.a(ElectricityBillPaymentHistoryComponent.class);
                scopeI17.getClass();
                return scopeI17.d(classReferenceA35, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO18 = b3.o(this);
            ClassReference classReferenceA36 = Reflection.a(ElectricityBillPaymentHistoryComponent.class);
            scopeO18.getClass();
            return scopeO18.d(classReferenceA36, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof EBillPaymentConfirmationArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI18 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA37 = Reflection.a(EBillPaymentConfirmationComponent.class);
                scopeI18.getClass();
                return scopeI18.d(classReferenceA37, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO19 = b3.o(this);
            ClassReference classReferenceA38 = Reflection.a(EBillPaymentConfirmationComponent.class);
            scopeO19.getClass();
            return scopeO19.d(classReferenceA38, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof EBillPaymentInvoiceScreenArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI19 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA39 = Reflection.a(EBillPaymentInvoiceComponent.class);
                scopeI19.getClass();
                return scopeI19.d(classReferenceA39, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO20 = b3.o(this);
            ClassReference classReferenceA40 = Reflection.a(EBillPaymentInvoiceComponent.class);
            scopeO20.getClass();
            return scopeO20.d(classReferenceA40, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof EBillPaymentSuccessArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI20 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA41 = Reflection.a(EBillPaymentSuccessComponent.class);
                scopeI20.getClass();
                return scopeI20.d(classReferenceA41, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO21 = b3.o(this);
            ClassReference classReferenceA42 = Reflection.a(EBillPaymentSuccessComponent.class);
            scopeO21.getClass();
            return scopeO21.d(classReferenceA42, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof EnterCardDetailsArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI21 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA43 = Reflection.a(EnterCardDetailsComponent.class);
                scopeI21.getClass();
                return scopeI21.d(classReferenceA43, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO22 = b3.o(this);
            ClassReference classReferenceA44 = Reflection.a(EnterCardDetailsComponent.class);
            scopeO22.getClass();
            return scopeO22.d(classReferenceA44, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof FareDetailsArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI22 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA45 = Reflection.a(FareDetailsCoordinatorComponent.class);
                scopeI22.getClass();
                return scopeI22.d(classReferenceA45, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO23 = b3.o(this);
            ClassReference classReferenceA46 = Reflection.a(FareDetailsCoordinatorComponent.class);
            scopeO23.getClass();
            return scopeO23.d(classReferenceA46, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof PremiumBusFareDetailsArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI23 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA47 = Reflection.a(PremiumBusFareDetailsComponent.class);
                scopeI23.getClass();
                return scopeI23.d(classReferenceA47, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO24 = b3.o(this);
            ClassReference classReferenceA48 = Reflection.a(PremiumBusFareDetailsComponent.class);
            scopeO24.getClass();
            return scopeO24.d(classReferenceA48, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof ForceAppUpdateArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI24 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA49 = Reflection.a(ForceAppUpdateComponent.class);
                scopeI24.getClass();
                return scopeI24.d(classReferenceA49, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO25 = b3.o(this);
            ClassReference classReferenceA50 = Reflection.a(ForceAppUpdateComponent.class);
            scopeO25.getClass();
            return scopeO25.d(classReferenceA50, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof GroupTicketLegSelectionArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI25 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA51 = Reflection.a(GroupTicketLegSelectionComponent.class);
                scopeI25.getClass();
                return scopeI25.d(classReferenceA51, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO26 = b3.o(this);
            ClassReference classReferenceA52 = Reflection.a(GroupTicketLegSelectionComponent.class);
            scopeO26.getClass();
            return scopeO26.d(classReferenceA52, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof GroupTicketBookingSummaryArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI26 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA53 = Reflection.a(GroupTicketSummaryComponent.class);
                scopeI26.getClass();
                return scopeI26.d(classReferenceA53, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO27 = b3.o(this);
            ClassReference classReferenceA54 = Reflection.a(GroupTicketSummaryComponent.class);
            scopeO27.getClass();
            return scopeO27.d(classReferenceA54, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof HomeArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI27 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA55 = Reflection.a(HomeComponent.class);
                scopeI27.getClass();
                return scopeI27.d(classReferenceA55, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO28 = b3.o(this);
            ClassReference classReferenceA56 = Reflection.a(HomeComponent.class);
            scopeO28.getClass();
            return scopeO28.d(classReferenceA56, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof LanguageSelectionArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI28 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA57 = Reflection.a(LanguageSelectionComponent.class);
                scopeI28.getClass();
                return scopeI28.d(classReferenceA57, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO29 = b3.o(this);
            ClassReference classReferenceA58 = Reflection.a(LanguageSelectionComponent.class);
            scopeO29.getClass();
            return scopeO29.d(classReferenceA58, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof LocationDisclaimerArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI29 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA59 = Reflection.a(LocationDisclaimerComponent.class);
                scopeI29.getClass();
                return scopeI29.d(classReferenceA59, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO30 = b3.o(this);
            ClassReference classReferenceA60 = Reflection.a(LocationDisclaimerComponent.class);
            scopeO30.getClass();
            return scopeO30.d(classReferenceA60, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof LoginOptionsArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI30 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA61 = Reflection.a(LoginOptionsComponent.class);
                scopeI30.getClass();
                return scopeI30.d(classReferenceA61, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO31 = b3.o(this);
            ClassReference classReferenceA62 = Reflection.a(LoginOptionsComponent.class);
            scopeO31.getClass();
            return scopeO31.d(classReferenceA62, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof LoginOtpSceneArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI31 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA63 = Reflection.a(LoginOtpEnterComponent.class);
                scopeI31.getClass();
                return scopeI31.d(classReferenceA63, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO32 = b3.o(this);
            ClassReference classReferenceA64 = Reflection.a(LoginOtpEnterComponent.class);
            scopeO32.getClass();
            return scopeO32.d(classReferenceA64, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof MinKycDetailsArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI32 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA65 = Reflection.a(MinKycDetailsComponent.class);
                scopeI32.getClass();
                return scopeI32.d(classReferenceA65, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO33 = b3.o(this);
            ClassReference classReferenceA66 = Reflection.a(MinKycDetailsComponent.class);
            scopeO33.getClass();
            return scopeO33.d(classReferenceA66, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof MinKycOtpArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI33 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA67 = Reflection.a(MinKycOtpComponent.class);
                scopeI33.getClass();
                return scopeI33.d(classReferenceA67, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO34 = b3.o(this);
            ClassReference classReferenceA68 = Reflection.a(MinKycOtpComponent.class);
            scopeO34.getClass();
            return scopeO34.d(classReferenceA68, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof MetroLandingArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI34 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA69 = Reflection.a(MetroLandingScreenComponent.class);
                scopeI34.getClass();
                return scopeI34.d(classReferenceA69, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO35 = b3.o(this);
            ClassReference classReferenceA70 = Reflection.a(MetroLandingScreenComponent.class);
            scopeO35.getClass();
            return scopeO35.d(classReferenceA70, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof MTicketSelectionArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI35 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA71 = Reflection.a(MTicketPassengerSelectionComponent.class);
                scopeI35.getClass();
                return scopeI35.d(classReferenceA71, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO36 = b3.o(this);
            ClassReference classReferenceA72 = Reflection.a(MTicketPassengerSelectionComponent.class);
            scopeO36.getClass();
            return scopeO36.d(classReferenceA72, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof NcmcOfflineRechargeArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI36 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA73 = Reflection.a(OfflineCardRechargeComponent.class);
                scopeI36.getClass();
                return scopeI36.d(classReferenceA73, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO37 = b3.o(this);
            ClassReference classReferenceA74 = Reflection.a(OfflineCardRechargeComponent.class);
            scopeO37.getClass();
            return scopeO37.d(classReferenceA74, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof NcmcOnlineRechargeArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI37 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA75 = Reflection.a(NcmcOnlineRechargeComponent.class);
                scopeI37.getClass();
                return scopeI37.d(classReferenceA75, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO38 = b3.o(this);
            ClassReference classReferenceA76 = Reflection.a(NcmcOnlineRechargeComponent.class);
            scopeO38.getClass();
            return scopeO38.d(classReferenceA76, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof NetworkInspectorArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI38 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA77 = Reflection.a(NetworkInspectorComponent.class);
                scopeI38.getClass();
                return scopeI38.d(classReferenceA77, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO39 = b3.o(this);
            ClassReference classReferenceA78 = Reflection.a(NetworkInspectorComponent.class);
            scopeO39.getClass();
            return scopeO39.d(classReferenceA78, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof NearbyStopsMapArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI39 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA79 = Reflection.a(NearbyStopsMapComponent.class);
                scopeI39.getClass();
                return scopeI39.d(classReferenceA79, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO40 = b3.o(this);
            ClassReference classReferenceA80 = Reflection.a(NearbyStopsMapComponent.class);
            scopeO40.getClass();
            return scopeO40.d(classReferenceA80, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof PassSelectionArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI40 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA81 = Reflection.a(PassSelectionComponent.class);
                scopeI40.getClass();
                return scopeI40.d(classReferenceA81, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO41 = b3.o(this);
            ClassReference classReferenceA82 = Reflection.a(PassSelectionComponent.class);
            scopeO41.getClass();
            return scopeO41.d(classReferenceA82, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof PickRouteLocationArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI41 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA83 = Reflection.a(PickRouteLocationComponent.class);
                scopeI41.getClass();
                return scopeI41.d(classReferenceA83, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO42 = b3.o(this);
            ClassReference classReferenceA84 = Reflection.a(PickRouteLocationComponent.class);
            scopeO42.getClass();
            return scopeO42.d(classReferenceA84, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof PickStopArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI42 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA85 = Reflection.a(PickStopComponent.class);
                scopeI42.getClass();
                return scopeI42.d(classReferenceA85, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO43 = b3.o(this);
            ClassReference classReferenceA86 = Reflection.a(PickStopComponent.class);
            scopeO43.getClass();
            return scopeO43.d(classReferenceA86, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof PremiumBusActivationArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI43 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA87 = Reflection.a(NewPremiumBusReserveTicketActivationComponent.class);
                scopeI43.getClass();
                return scopeI43.d(classReferenceA87, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO44 = b3.o(this);
            ClassReference classReferenceA88 = Reflection.a(NewPremiumBusReserveTicketActivationComponent.class);
            scopeO44.getClass();
            return scopeO44.d(classReferenceA88, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof PbBulkBookingRideDetailsArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI44 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA89 = Reflection.a(PbBulkBookingRideDetailsComponent.class);
                scopeI44.getClass();
                return scopeI44.d(classReferenceA89, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO45 = b3.o(this);
            ClassReference classReferenceA90 = Reflection.a(PbBulkBookingRideDetailsComponent.class);
            scopeO45.getClass();
            return scopeO45.d(classReferenceA90, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof PremiumBusArgs.PremiumBusBulkBookingConfirmationScreenArgs) {
            final int i12 = 3;
            Function0 function11 = new Function0() { // from class: r6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i12) {
                        case 0:
                            ArrayList arrayList = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList.toArray(new Object[arrayList.size()]));
                        case 1:
                            ArrayList arrayList2 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList2.toArray(new Object[arrayList2.size()]));
                        case 2:
                            ArrayList arrayList3 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList3.toArray(new Object[arrayList3.size()]));
                        case 3:
                            ArrayList arrayList4 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList4.toArray(new Object[arrayList4.size()]));
                        case 4:
                            ArrayList arrayList5 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList5.toArray(new Object[arrayList5.size()]));
                        case 5:
                            ArrayList arrayList6 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList6.toArray(new Object[arrayList6.size()]));
                        case 6:
                            ArrayList arrayList7 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList7.toArray(new Object[arrayList7.size()]));
                        case 7:
                            ArrayList arrayList8 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList8.toArray(new Object[arrayList8.size()]));
                        case 8:
                            ArrayList arrayList9 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList9.toArray(new Object[arrayList9.size()]));
                        case 9:
                            ArrayList arrayList10 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList10.toArray(new Object[arrayList10.size()]));
                        case 10:
                            ArrayList arrayList11 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList11.toArray(new Object[arrayList11.size()]));
                        case 11:
                            ArrayList arrayList12 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList12.toArray(new Object[arrayList12.size()]));
                        case 12:
                            ArrayList arrayList13 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList13.toArray(new Object[arrayList13.size()]));
                        case 13:
                            ArrayList arrayList14 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList14.toArray(new Object[arrayList14.size()]));
                        case 14:
                            ArrayList arrayList15 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList15.toArray(new Object[arrayList15.size()]));
                        case 15:
                            ArrayList arrayList16 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList16.toArray(new Object[arrayList16.size()]));
                        case 16:
                            ArrayList arrayList17 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList17.toArray(new Object[arrayList17.size()]));
                        case 17:
                            ArrayList arrayList18 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList18.toArray(new Object[arrayList18.size()]));
                        case 18:
                            ArrayList arrayList19 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList19.toArray(new Object[arrayList19.size()]));
                        case 19:
                            ArrayList arrayList20 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList20.toArray(new Object[arrayList20.size()]));
                        case 20:
                            ArrayList arrayList21 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList21.toArray(new Object[arrayList21.size()]));
                        case 21:
                            ArrayList arrayList22 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList22.toArray(new Object[arrayList22.size()]));
                        case 22:
                            ArrayList arrayList23 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList23.toArray(new Object[arrayList23.size()]));
                        case 23:
                            ArrayList arrayList24 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList24.toArray(new Object[arrayList24.size()]));
                        default:
                            ArrayList arrayList25 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList25.toArray(new Object[arrayList25.size()]));
                    }
                }
            };
            return this instanceof KoinScopeComponent ? ((KoinScopeComponent) this).getF18811a().a(Reflection.a(PremiumBusBulkBookingConfirmationComponent.class), null, function11) : b3.o(this).a(Reflection.a(PremiumBusBulkBookingConfirmationComponent.class), null, function11);
        }
        if (sceneArgs instanceof PremiumBusChangeStopArgs) {
            final int i13 = 4;
            Function0 function12 = new Function0() { // from class: r6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i13) {
                        case 0:
                            ArrayList arrayList = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList.toArray(new Object[arrayList.size()]));
                        case 1:
                            ArrayList arrayList2 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList2.toArray(new Object[arrayList2.size()]));
                        case 2:
                            ArrayList arrayList3 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList3.toArray(new Object[arrayList3.size()]));
                        case 3:
                            ArrayList arrayList4 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList4.toArray(new Object[arrayList4.size()]));
                        case 4:
                            ArrayList arrayList5 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList5.toArray(new Object[arrayList5.size()]));
                        case 5:
                            ArrayList arrayList6 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList6.toArray(new Object[arrayList6.size()]));
                        case 6:
                            ArrayList arrayList7 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList7.toArray(new Object[arrayList7.size()]));
                        case 7:
                            ArrayList arrayList8 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList8.toArray(new Object[arrayList8.size()]));
                        case 8:
                            ArrayList arrayList9 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList9.toArray(new Object[arrayList9.size()]));
                        case 9:
                            ArrayList arrayList10 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList10.toArray(new Object[arrayList10.size()]));
                        case 10:
                            ArrayList arrayList11 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList11.toArray(new Object[arrayList11.size()]));
                        case 11:
                            ArrayList arrayList12 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList12.toArray(new Object[arrayList12.size()]));
                        case 12:
                            ArrayList arrayList13 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList13.toArray(new Object[arrayList13.size()]));
                        case 13:
                            ArrayList arrayList14 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList14.toArray(new Object[arrayList14.size()]));
                        case 14:
                            ArrayList arrayList15 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList15.toArray(new Object[arrayList15.size()]));
                        case 15:
                            ArrayList arrayList16 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList16.toArray(new Object[arrayList16.size()]));
                        case 16:
                            ArrayList arrayList17 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList17.toArray(new Object[arrayList17.size()]));
                        case 17:
                            ArrayList arrayList18 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList18.toArray(new Object[arrayList18.size()]));
                        case 18:
                            ArrayList arrayList19 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList19.toArray(new Object[arrayList19.size()]));
                        case 19:
                            ArrayList arrayList20 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList20.toArray(new Object[arrayList20.size()]));
                        case 20:
                            ArrayList arrayList21 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList21.toArray(new Object[arrayList21.size()]));
                        case 21:
                            ArrayList arrayList22 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList22.toArray(new Object[arrayList22.size()]));
                        case 22:
                            ArrayList arrayList23 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList23.toArray(new Object[arrayList23.size()]));
                        case 23:
                            ArrayList arrayList24 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList24.toArray(new Object[arrayList24.size()]));
                        default:
                            ArrayList arrayList25 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList25.toArray(new Object[arrayList25.size()]));
                    }
                }
            };
            return this instanceof KoinScopeComponent ? ((KoinScopeComponent) this).getF18811a().a(Reflection.a(PremiumBusChangeStopComponent.class), null, function12) : b3.o(this).a(Reflection.a(PremiumBusChangeStopComponent.class), null, function12);
        }
        if (sceneArgs instanceof PremiumBusArgs.PremiumBusPassLandingScreenArgs) {
            final int i14 = 5;
            Function0 function13 = new Function0() { // from class: r6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i14) {
                        case 0:
                            ArrayList arrayList = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList.toArray(new Object[arrayList.size()]));
                        case 1:
                            ArrayList arrayList2 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList2.toArray(new Object[arrayList2.size()]));
                        case 2:
                            ArrayList arrayList3 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList3.toArray(new Object[arrayList3.size()]));
                        case 3:
                            ArrayList arrayList4 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList4.toArray(new Object[arrayList4.size()]));
                        case 4:
                            ArrayList arrayList5 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList5.toArray(new Object[arrayList5.size()]));
                        case 5:
                            ArrayList arrayList6 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList6.toArray(new Object[arrayList6.size()]));
                        case 6:
                            ArrayList arrayList7 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList7.toArray(new Object[arrayList7.size()]));
                        case 7:
                            ArrayList arrayList8 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList8.toArray(new Object[arrayList8.size()]));
                        case 8:
                            ArrayList arrayList9 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList9.toArray(new Object[arrayList9.size()]));
                        case 9:
                            ArrayList arrayList10 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList10.toArray(new Object[arrayList10.size()]));
                        case 10:
                            ArrayList arrayList11 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList11.toArray(new Object[arrayList11.size()]));
                        case 11:
                            ArrayList arrayList12 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList12.toArray(new Object[arrayList12.size()]));
                        case 12:
                            ArrayList arrayList13 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList13.toArray(new Object[arrayList13.size()]));
                        case 13:
                            ArrayList arrayList14 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList14.toArray(new Object[arrayList14.size()]));
                        case 14:
                            ArrayList arrayList15 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList15.toArray(new Object[arrayList15.size()]));
                        case 15:
                            ArrayList arrayList16 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList16.toArray(new Object[arrayList16.size()]));
                        case 16:
                            ArrayList arrayList17 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList17.toArray(new Object[arrayList17.size()]));
                        case 17:
                            ArrayList arrayList18 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList18.toArray(new Object[arrayList18.size()]));
                        case 18:
                            ArrayList arrayList19 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList19.toArray(new Object[arrayList19.size()]));
                        case 19:
                            ArrayList arrayList20 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList20.toArray(new Object[arrayList20.size()]));
                        case 20:
                            ArrayList arrayList21 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList21.toArray(new Object[arrayList21.size()]));
                        case 21:
                            ArrayList arrayList22 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList22.toArray(new Object[arrayList22.size()]));
                        case 22:
                            ArrayList arrayList23 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList23.toArray(new Object[arrayList23.size()]));
                        case 23:
                            ArrayList arrayList24 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList24.toArray(new Object[arrayList24.size()]));
                        default:
                            ArrayList arrayList25 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList25.toArray(new Object[arrayList25.size()]));
                    }
                }
            };
            return this instanceof KoinScopeComponent ? ((KoinScopeComponent) this).getF18811a().a(Reflection.a(PbPassPurchaseLandingScreenComponent.class), null, function13) : b3.o(this).a(Reflection.a(PbPassPurchaseLandingScreenComponent.class), null, function13);
        }
        if (sceneArgs instanceof PremiumBusArgs.PremiumBusSeatSelectionArgs) {
            final int i15 = 6;
            Function0 function14 = new Function0() { // from class: r6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i15) {
                        case 0:
                            ArrayList arrayList = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList.toArray(new Object[arrayList.size()]));
                        case 1:
                            ArrayList arrayList2 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList2.toArray(new Object[arrayList2.size()]));
                        case 2:
                            ArrayList arrayList3 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList3.toArray(new Object[arrayList3.size()]));
                        case 3:
                            ArrayList arrayList4 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList4.toArray(new Object[arrayList4.size()]));
                        case 4:
                            ArrayList arrayList5 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList5.toArray(new Object[arrayList5.size()]));
                        case 5:
                            ArrayList arrayList6 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList6.toArray(new Object[arrayList6.size()]));
                        case 6:
                            ArrayList arrayList7 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList7.toArray(new Object[arrayList7.size()]));
                        case 7:
                            ArrayList arrayList8 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList8.toArray(new Object[arrayList8.size()]));
                        case 8:
                            ArrayList arrayList9 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList9.toArray(new Object[arrayList9.size()]));
                        case 9:
                            ArrayList arrayList10 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList10.toArray(new Object[arrayList10.size()]));
                        case 10:
                            ArrayList arrayList11 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList11.toArray(new Object[arrayList11.size()]));
                        case 11:
                            ArrayList arrayList12 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList12.toArray(new Object[arrayList12.size()]));
                        case 12:
                            ArrayList arrayList13 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList13.toArray(new Object[arrayList13.size()]));
                        case 13:
                            ArrayList arrayList14 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList14.toArray(new Object[arrayList14.size()]));
                        case 14:
                            ArrayList arrayList15 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList15.toArray(new Object[arrayList15.size()]));
                        case 15:
                            ArrayList arrayList16 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList16.toArray(new Object[arrayList16.size()]));
                        case 16:
                            ArrayList arrayList17 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList17.toArray(new Object[arrayList17.size()]));
                        case 17:
                            ArrayList arrayList18 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList18.toArray(new Object[arrayList18.size()]));
                        case 18:
                            ArrayList arrayList19 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList19.toArray(new Object[arrayList19.size()]));
                        case 19:
                            ArrayList arrayList20 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList20.toArray(new Object[arrayList20.size()]));
                        case 20:
                            ArrayList arrayList21 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList21.toArray(new Object[arrayList21.size()]));
                        case 21:
                            ArrayList arrayList22 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList22.toArray(new Object[arrayList22.size()]));
                        case 22:
                            ArrayList arrayList23 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList23.toArray(new Object[arrayList23.size()]));
                        case 23:
                            ArrayList arrayList24 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList24.toArray(new Object[arrayList24.size()]));
                        default:
                            ArrayList arrayList25 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList25.toArray(new Object[arrayList25.size()]));
                    }
                }
            };
            return this instanceof KoinScopeComponent ? ((KoinScopeComponent) this).getF18811a().a(Reflection.a(PremiumBusSeatSelectionComponent.class), null, function14) : b3.o(this).a(Reflection.a(PremiumBusSeatSelectionComponent.class), null, function14);
        }
        if (sceneArgs instanceof PremiumBusArgs.PremiumBusSlotListScreenArgs) {
            final int i16 = 7;
            Function0 function15 = new Function0() { // from class: r6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i16) {
                        case 0:
                            ArrayList arrayList = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList.toArray(new Object[arrayList.size()]));
                        case 1:
                            ArrayList arrayList2 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList2.toArray(new Object[arrayList2.size()]));
                        case 2:
                            ArrayList arrayList3 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList3.toArray(new Object[arrayList3.size()]));
                        case 3:
                            ArrayList arrayList4 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList4.toArray(new Object[arrayList4.size()]));
                        case 4:
                            ArrayList arrayList5 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList5.toArray(new Object[arrayList5.size()]));
                        case 5:
                            ArrayList arrayList6 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList6.toArray(new Object[arrayList6.size()]));
                        case 6:
                            ArrayList arrayList7 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList7.toArray(new Object[arrayList7.size()]));
                        case 7:
                            ArrayList arrayList8 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList8.toArray(new Object[arrayList8.size()]));
                        case 8:
                            ArrayList arrayList9 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList9.toArray(new Object[arrayList9.size()]));
                        case 9:
                            ArrayList arrayList10 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList10.toArray(new Object[arrayList10.size()]));
                        case 10:
                            ArrayList arrayList11 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList11.toArray(new Object[arrayList11.size()]));
                        case 11:
                            ArrayList arrayList12 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList12.toArray(new Object[arrayList12.size()]));
                        case 12:
                            ArrayList arrayList13 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList13.toArray(new Object[arrayList13.size()]));
                        case 13:
                            ArrayList arrayList14 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList14.toArray(new Object[arrayList14.size()]));
                        case 14:
                            ArrayList arrayList15 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList15.toArray(new Object[arrayList15.size()]));
                        case 15:
                            ArrayList arrayList16 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList16.toArray(new Object[arrayList16.size()]));
                        case 16:
                            ArrayList arrayList17 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList17.toArray(new Object[arrayList17.size()]));
                        case 17:
                            ArrayList arrayList18 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList18.toArray(new Object[arrayList18.size()]));
                        case 18:
                            ArrayList arrayList19 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList19.toArray(new Object[arrayList19.size()]));
                        case 19:
                            ArrayList arrayList20 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList20.toArray(new Object[arrayList20.size()]));
                        case 20:
                            ArrayList arrayList21 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList21.toArray(new Object[arrayList21.size()]));
                        case 21:
                            ArrayList arrayList22 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList22.toArray(new Object[arrayList22.size()]));
                        case 22:
                            ArrayList arrayList23 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList23.toArray(new Object[arrayList23.size()]));
                        case 23:
                            ArrayList arrayList24 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList24.toArray(new Object[arrayList24.size()]));
                        default:
                            ArrayList arrayList25 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList25.toArray(new Object[arrayList25.size()]));
                    }
                }
            };
            return this instanceof KoinScopeComponent ? ((KoinScopeComponent) this).getF18811a().a(Reflection.a(SlotSelectionListComponent.class), null, function15) : b3.o(this).a(Reflection.a(SlotSelectionListComponent.class), null, function15);
        }
        if (sceneArgs instanceof PremiumBusArgs.PremiumProductSelectionArgs) {
            final int i17 = 8;
            Function0 function16 = new Function0() { // from class: r6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i17) {
                        case 0:
                            ArrayList arrayList = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList.toArray(new Object[arrayList.size()]));
                        case 1:
                            ArrayList arrayList2 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList2.toArray(new Object[arrayList2.size()]));
                        case 2:
                            ArrayList arrayList3 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList3.toArray(new Object[arrayList3.size()]));
                        case 3:
                            ArrayList arrayList4 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList4.toArray(new Object[arrayList4.size()]));
                        case 4:
                            ArrayList arrayList5 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList5.toArray(new Object[arrayList5.size()]));
                        case 5:
                            ArrayList arrayList6 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList6.toArray(new Object[arrayList6.size()]));
                        case 6:
                            ArrayList arrayList7 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList7.toArray(new Object[arrayList7.size()]));
                        case 7:
                            ArrayList arrayList8 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList8.toArray(new Object[arrayList8.size()]));
                        case 8:
                            ArrayList arrayList9 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList9.toArray(new Object[arrayList9.size()]));
                        case 9:
                            ArrayList arrayList10 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList10.toArray(new Object[arrayList10.size()]));
                        case 10:
                            ArrayList arrayList11 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList11.toArray(new Object[arrayList11.size()]));
                        case 11:
                            ArrayList arrayList12 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList12.toArray(new Object[arrayList12.size()]));
                        case 12:
                            ArrayList arrayList13 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList13.toArray(new Object[arrayList13.size()]));
                        case 13:
                            ArrayList arrayList14 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList14.toArray(new Object[arrayList14.size()]));
                        case 14:
                            ArrayList arrayList15 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList15.toArray(new Object[arrayList15.size()]));
                        case 15:
                            ArrayList arrayList16 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList16.toArray(new Object[arrayList16.size()]));
                        case 16:
                            ArrayList arrayList17 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList17.toArray(new Object[arrayList17.size()]));
                        case 17:
                            ArrayList arrayList18 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList18.toArray(new Object[arrayList18.size()]));
                        case 18:
                            ArrayList arrayList19 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList19.toArray(new Object[arrayList19.size()]));
                        case 19:
                            ArrayList arrayList20 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList20.toArray(new Object[arrayList20.size()]));
                        case 20:
                            ArrayList arrayList21 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList21.toArray(new Object[arrayList21.size()]));
                        case 21:
                            ArrayList arrayList22 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList22.toArray(new Object[arrayList22.size()]));
                        case 22:
                            ArrayList arrayList23 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList23.toArray(new Object[arrayList23.size()]));
                        case 23:
                            ArrayList arrayList24 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList24.toArray(new Object[arrayList24.size()]));
                        default:
                            ArrayList arrayList25 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList25.toArray(new Object[arrayList25.size()]));
                    }
                }
            };
            return this instanceof KoinScopeComponent ? ((KoinScopeComponent) this).getF18811a().a(Reflection.a(PremiumBusProductSelectionComponent.class), null, function16) : b3.o(this).a(Reflection.a(PremiumBusProductSelectionComponent.class), null, function16);
        }
        if (sceneArgs instanceof PremiumBusArgs.PremiumStopDetailsArgs) {
            final int i18 = 9;
            Function0 function17 = new Function0() { // from class: r6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i18) {
                        case 0:
                            ArrayList arrayList = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList.toArray(new Object[arrayList.size()]));
                        case 1:
                            ArrayList arrayList2 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList2.toArray(new Object[arrayList2.size()]));
                        case 2:
                            ArrayList arrayList3 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList3.toArray(new Object[arrayList3.size()]));
                        case 3:
                            ArrayList arrayList4 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList4.toArray(new Object[arrayList4.size()]));
                        case 4:
                            ArrayList arrayList5 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList5.toArray(new Object[arrayList5.size()]));
                        case 5:
                            ArrayList arrayList6 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList6.toArray(new Object[arrayList6.size()]));
                        case 6:
                            ArrayList arrayList7 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList7.toArray(new Object[arrayList7.size()]));
                        case 7:
                            ArrayList arrayList8 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList8.toArray(new Object[arrayList8.size()]));
                        case 8:
                            ArrayList arrayList9 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList9.toArray(new Object[arrayList9.size()]));
                        case 9:
                            ArrayList arrayList10 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList10.toArray(new Object[arrayList10.size()]));
                        case 10:
                            ArrayList arrayList11 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList11.toArray(new Object[arrayList11.size()]));
                        case 11:
                            ArrayList arrayList12 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList12.toArray(new Object[arrayList12.size()]));
                        case 12:
                            ArrayList arrayList13 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList13.toArray(new Object[arrayList13.size()]));
                        case 13:
                            ArrayList arrayList14 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList14.toArray(new Object[arrayList14.size()]));
                        case 14:
                            ArrayList arrayList15 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList15.toArray(new Object[arrayList15.size()]));
                        case 15:
                            ArrayList arrayList16 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList16.toArray(new Object[arrayList16.size()]));
                        case 16:
                            ArrayList arrayList17 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList17.toArray(new Object[arrayList17.size()]));
                        case 17:
                            ArrayList arrayList18 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList18.toArray(new Object[arrayList18.size()]));
                        case 18:
                            ArrayList arrayList19 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList19.toArray(new Object[arrayList19.size()]));
                        case 19:
                            ArrayList arrayList20 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList20.toArray(new Object[arrayList20.size()]));
                        case 20:
                            ArrayList arrayList21 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList21.toArray(new Object[arrayList21.size()]));
                        case 21:
                            ArrayList arrayList22 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList22.toArray(new Object[arrayList22.size()]));
                        case 22:
                            ArrayList arrayList23 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList23.toArray(new Object[arrayList23.size()]));
                        case 23:
                            ArrayList arrayList24 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList24.toArray(new Object[arrayList24.size()]));
                        default:
                            ArrayList arrayList25 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList25.toArray(new Object[arrayList25.size()]));
                    }
                }
            };
            return this instanceof KoinScopeComponent ? ((KoinScopeComponent) this).getF18811a().a(Reflection.a(PBStopDetailsComponent.class), null, function17) : b3.o(this).a(Reflection.a(PBStopDetailsComponent.class), null, function17);
        }
        if (sceneArgs instanceof PremiumBusArgs.SlotSelectionArgs) {
            final int i19 = 10;
            Function0 function18 = new Function0() { // from class: r6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i19) {
                        case 0:
                            ArrayList arrayList = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList.toArray(new Object[arrayList.size()]));
                        case 1:
                            ArrayList arrayList2 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList2.toArray(new Object[arrayList2.size()]));
                        case 2:
                            ArrayList arrayList3 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList3.toArray(new Object[arrayList3.size()]));
                        case 3:
                            ArrayList arrayList4 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList4.toArray(new Object[arrayList4.size()]));
                        case 4:
                            ArrayList arrayList5 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList5.toArray(new Object[arrayList5.size()]));
                        case 5:
                            ArrayList arrayList6 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList6.toArray(new Object[arrayList6.size()]));
                        case 6:
                            ArrayList arrayList7 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList7.toArray(new Object[arrayList7.size()]));
                        case 7:
                            ArrayList arrayList8 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList8.toArray(new Object[arrayList8.size()]));
                        case 8:
                            ArrayList arrayList9 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList9.toArray(new Object[arrayList9.size()]));
                        case 9:
                            ArrayList arrayList10 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList10.toArray(new Object[arrayList10.size()]));
                        case 10:
                            ArrayList arrayList11 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList11.toArray(new Object[arrayList11.size()]));
                        case 11:
                            ArrayList arrayList12 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList12.toArray(new Object[arrayList12.size()]));
                        case 12:
                            ArrayList arrayList13 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList13.toArray(new Object[arrayList13.size()]));
                        case 13:
                            ArrayList arrayList14 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList14.toArray(new Object[arrayList14.size()]));
                        case 14:
                            ArrayList arrayList15 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList15.toArray(new Object[arrayList15.size()]));
                        case 15:
                            ArrayList arrayList16 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList16.toArray(new Object[arrayList16.size()]));
                        case 16:
                            ArrayList arrayList17 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList17.toArray(new Object[arrayList17.size()]));
                        case 17:
                            ArrayList arrayList18 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList18.toArray(new Object[arrayList18.size()]));
                        case 18:
                            ArrayList arrayList19 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList19.toArray(new Object[arrayList19.size()]));
                        case 19:
                            ArrayList arrayList20 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList20.toArray(new Object[arrayList20.size()]));
                        case 20:
                            ArrayList arrayList21 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList21.toArray(new Object[arrayList21.size()]));
                        case 21:
                            ArrayList arrayList22 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList22.toArray(new Object[arrayList22.size()]));
                        case 22:
                            ArrayList arrayList23 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList23.toArray(new Object[arrayList23.size()]));
                        case 23:
                            ArrayList arrayList24 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList24.toArray(new Object[arrayList24.size()]));
                        default:
                            ArrayList arrayList25 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList25.toArray(new Object[arrayList25.size()]));
                    }
                }
            };
            return this instanceof KoinScopeComponent ? ((KoinScopeComponent) this).getF18811a().a(Reflection.a(PremiumBusSlotSelectionComponent.class), null, function18) : b3.o(this).a(Reflection.a(PremiumBusSlotSelectionComponent.class), null, function18);
        }
        if (sceneArgs instanceof PremiumBusArgs.StopSelectionArgs) {
            final int i20 = 11;
            Function0 function19 = new Function0() { // from class: r6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i20) {
                        case 0:
                            ArrayList arrayList = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList.toArray(new Object[arrayList.size()]));
                        case 1:
                            ArrayList arrayList2 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList2.toArray(new Object[arrayList2.size()]));
                        case 2:
                            ArrayList arrayList3 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList3.toArray(new Object[arrayList3.size()]));
                        case 3:
                            ArrayList arrayList4 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList4.toArray(new Object[arrayList4.size()]));
                        case 4:
                            ArrayList arrayList5 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList5.toArray(new Object[arrayList5.size()]));
                        case 5:
                            ArrayList arrayList6 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList6.toArray(new Object[arrayList6.size()]));
                        case 6:
                            ArrayList arrayList7 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList7.toArray(new Object[arrayList7.size()]));
                        case 7:
                            ArrayList arrayList8 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList8.toArray(new Object[arrayList8.size()]));
                        case 8:
                            ArrayList arrayList9 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList9.toArray(new Object[arrayList9.size()]));
                        case 9:
                            ArrayList arrayList10 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList10.toArray(new Object[arrayList10.size()]));
                        case 10:
                            ArrayList arrayList11 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList11.toArray(new Object[arrayList11.size()]));
                        case 11:
                            ArrayList arrayList12 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList12.toArray(new Object[arrayList12.size()]));
                        case 12:
                            ArrayList arrayList13 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList13.toArray(new Object[arrayList13.size()]));
                        case 13:
                            ArrayList arrayList14 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList14.toArray(new Object[arrayList14.size()]));
                        case 14:
                            ArrayList arrayList15 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList15.toArray(new Object[arrayList15.size()]));
                        case 15:
                            ArrayList arrayList16 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList16.toArray(new Object[arrayList16.size()]));
                        case 16:
                            ArrayList arrayList17 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList17.toArray(new Object[arrayList17.size()]));
                        case 17:
                            ArrayList arrayList18 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList18.toArray(new Object[arrayList18.size()]));
                        case 18:
                            ArrayList arrayList19 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList19.toArray(new Object[arrayList19.size()]));
                        case 19:
                            ArrayList arrayList20 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList20.toArray(new Object[arrayList20.size()]));
                        case 20:
                            ArrayList arrayList21 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList21.toArray(new Object[arrayList21.size()]));
                        case 21:
                            ArrayList arrayList22 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList22.toArray(new Object[arrayList22.size()]));
                        case 22:
                            ArrayList arrayList23 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList23.toArray(new Object[arrayList23.size()]));
                        case 23:
                            ArrayList arrayList24 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList24.toArray(new Object[arrayList24.size()]));
                        default:
                            ArrayList arrayList25 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList25.toArray(new Object[arrayList25.size()]));
                    }
                }
            };
            return this instanceof KoinScopeComponent ? ((KoinScopeComponent) this).getF18811a().a(Reflection.a(PremiumBusStopSelectionComponent.class), null, function19) : b3.o(this).a(Reflection.a(PremiumBusStopSelectionComponent.class), null, function19);
        }
        if (sceneArgs instanceof PremiumBusNotificationArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI45 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA91 = Reflection.a(PremiumBusNotificationComponent.class);
                scopeI45.getClass();
                return scopeI45.d(classReferenceA91, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO46 = b3.o(this);
            ClassReference classReferenceA92 = Reflection.a(PremiumBusNotificationComponent.class);
            scopeO46.getClass();
            return scopeO46.d(classReferenceA92, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof PremiumBusTutorialScreenArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI46 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA93 = Reflection.a(PremiumBusTutorialComponent.class);
                scopeI46.getClass();
                return scopeI46.d(classReferenceA93, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO47 = b3.o(this);
            ClassReference classReferenceA94 = Reflection.a(PremiumBusTutorialComponent.class);
            scopeO47.getClass();
            return scopeO47.d(classReferenceA94, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof MinProfileUpdateArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI47 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA95 = Reflection.a(MinProfileUpdateComponent.class);
                scopeI47.getClass();
                return scopeI47.d(classReferenceA95, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO48 = b3.o(this);
            ClassReference classReferenceA96 = Reflection.a(MinProfileUpdateComponent.class);
            scopeO48.getClass();
            return scopeO48.d(classReferenceA96, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof PremiumBusProductModificationArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI48 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA97 = Reflection.a(PremiumBusProductModificationReasonsComponent.class);
                scopeI48.getClass();
                return scopeI48.d(classReferenceA97, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO49 = b3.o(this);
            ClassReference classReferenceA98 = Reflection.a(PremiumBusProductModificationReasonsComponent.class);
            scopeO49.getClass();
            return scopeO49.d(classReferenceA98, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof ProductActivationArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI49 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA99 = Reflection.a(ProductActivationComponent.class);
                scopeI49.getClass();
                return scopeI49.d(classReferenceA99, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO50 = b3.o(this);
            ClassReference classReferenceA100 = Reflection.a(ProductActivationComponent.class);
            scopeO50.getClass();
            return scopeO50.d(classReferenceA100, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof ProductSelectionArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI50 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA101 = Reflection.a(ProductSelectionComponent.class);
                scopeI50.getClass();
                return scopeI50.d(classReferenceA101, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO51 = b3.o(this);
            ClassReference classReferenceA102 = Reflection.a(ProductSelectionComponent.class);
            scopeO51.getClass();
            return scopeO51.d(classReferenceA102, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof ReportProblemArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI51 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA103 = Reflection.a(ReportProblemComponent.class);
                scopeI51.getClass();
                return scopeI51.d(classReferenceA103, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO52 = b3.o(this);
            ClassReference classReferenceA104 = Reflection.a(ReportProblemComponent.class);
            scopeO52.getClass();
            return scopeO52.d(classReferenceA104, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof RideUserFeedbackScreenArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI52 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA105 = Reflection.a(RideUserFeedbackComponent.class);
                scopeI52.getClass();
                return scopeI52.d(classReferenceA105, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO53 = b3.o(this);
            ClassReference classReferenceA106 = Reflection.a(RideUserFeedbackComponent.class);
            scopeO53.getClass();
            return scopeO53.d(classReferenceA106, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof RouteDetailsArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI53 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA107 = Reflection.a(RouteDetailsComponent.class);
                scopeI53.getClass();
                return scopeI53.d(classReferenceA107, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO54 = b3.o(this);
            ClassReference classReferenceA108 = Reflection.a(RouteDetailsComponent.class);
            scopeO54.getClass();
            return scopeO54.d(classReferenceA108, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof SavedPlacesAndRidesArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI54 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA109 = Reflection.a(SavedPlacesAndRidesComponent.class);
                scopeI54.getClass();
                return scopeI54.d(classReferenceA109, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO55 = b3.o(this);
            ClassReference classReferenceA110 = Reflection.a(SavedPlacesAndRidesComponent.class);
            scopeO55.getClass();
            return scopeO55.d(classReferenceA110, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof SelectRideArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI55 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA111 = Reflection.a(SelectRideComponent.class);
                scopeI55.getClass();
                return scopeI55.d(classReferenceA111, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO56 = b3.o(this);
            ClassReference classReferenceA112 = Reflection.a(SelectRideComponent.class);
            scopeO56.getClass();
            return scopeO56.d(classReferenceA112, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof SosArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI56 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA113 = Reflection.a(SosScreenComponent.class);
                scopeI56.getClass();
                return scopeI56.d(classReferenceA113, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO57 = b3.o(this);
            ClassReference classReferenceA114 = Reflection.a(SosScreenComponent.class);
            scopeO57.getClass();
            return scopeO57.d(classReferenceA114, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof SplashArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI57 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA115 = Reflection.a(SplashScreenComponent.class);
                scopeI57.getClass();
                return scopeI57.d(classReferenceA115, ParametersHolderKt.a(componentContext), null);
            }
            Scope scopeO58 = b3.o(this);
            ClassReference classReferenceA116 = Reflection.a(SplashScreenComponent.class);
            scopeO58.getClass();
            return scopeO58.d(classReferenceA116, ParametersHolderKt.a(componentContext), null);
        }
        if (sceneArgs instanceof StopBasedMetroLandingArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI58 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA117 = Reflection.a(StopBasedMetroLandingScreenComponent.class);
                scopeI58.getClass();
                return scopeI58.d(classReferenceA117, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO59 = b3.o(this);
            ClassReference classReferenceA118 = Reflection.a(StopBasedMetroLandingScreenComponent.class);
            scopeO59.getClass();
            return scopeO59.d(classReferenceA118, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof SuperPassBookingSuccessArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI59 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA119 = Reflection.a(SuperPassBookingSuccessComponent.class);
                scopeI59.getClass();
                return scopeI59.d(classReferenceA119, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO60 = b3.o(this);
            ClassReference classReferenceA120 = Reflection.a(SuperPassBookingSuccessComponent.class);
            scopeO60.getClass();
            return scopeO60.d(classReferenceA120, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs) {
            final int i21 = 12;
            Function0 function20 = new Function0() { // from class: r6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i21) {
                        case 0:
                            ArrayList arrayList = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList.toArray(new Object[arrayList.size()]));
                        case 1:
                            ArrayList arrayList2 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList2.toArray(new Object[arrayList2.size()]));
                        case 2:
                            ArrayList arrayList3 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList3.toArray(new Object[arrayList3.size()]));
                        case 3:
                            ArrayList arrayList4 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList4.toArray(new Object[arrayList4.size()]));
                        case 4:
                            ArrayList arrayList5 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList5.toArray(new Object[arrayList5.size()]));
                        case 5:
                            ArrayList arrayList6 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList6.toArray(new Object[arrayList6.size()]));
                        case 6:
                            ArrayList arrayList7 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList7.toArray(new Object[arrayList7.size()]));
                        case 7:
                            ArrayList arrayList8 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList8.toArray(new Object[arrayList8.size()]));
                        case 8:
                            ArrayList arrayList9 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList9.toArray(new Object[arrayList9.size()]));
                        case 9:
                            ArrayList arrayList10 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList10.toArray(new Object[arrayList10.size()]));
                        case 10:
                            ArrayList arrayList11 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList11.toArray(new Object[arrayList11.size()]));
                        case 11:
                            ArrayList arrayList12 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList12.toArray(new Object[arrayList12.size()]));
                        case 12:
                            ArrayList arrayList13 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList13.toArray(new Object[arrayList13.size()]));
                        case 13:
                            ArrayList arrayList14 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList14.toArray(new Object[arrayList14.size()]));
                        case 14:
                            ArrayList arrayList15 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList15.toArray(new Object[arrayList15.size()]));
                        case 15:
                            ArrayList arrayList16 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList16.toArray(new Object[arrayList16.size()]));
                        case 16:
                            ArrayList arrayList17 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList17.toArray(new Object[arrayList17.size()]));
                        case 17:
                            ArrayList arrayList18 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList18.toArray(new Object[arrayList18.size()]));
                        case 18:
                            ArrayList arrayList19 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList19.toArray(new Object[arrayList19.size()]));
                        case 19:
                            ArrayList arrayList20 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList20.toArray(new Object[arrayList20.size()]));
                        case 20:
                            ArrayList arrayList21 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList21.toArray(new Object[arrayList21.size()]));
                        case 21:
                            ArrayList arrayList22 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList22.toArray(new Object[arrayList22.size()]));
                        case 22:
                            ArrayList arrayList23 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList23.toArray(new Object[arrayList23.size()]));
                        case 23:
                            ArrayList arrayList24 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList24.toArray(new Object[arrayList24.size()]));
                        default:
                            ArrayList arrayList25 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList25.toArray(new Object[arrayList25.size()]));
                    }
                }
            };
            return this instanceof KoinScopeComponent ? ((KoinScopeComponent) this).getF18811a().a(Reflection.a(ConfirmSuperPassPurchaseViewModel.class), null, function20) : b3.o(this).a(Reflection.a(ConfirmSuperPassPurchaseViewModel.class), null, function20);
        }
        if (sceneArgs instanceof SuperPassPurchaseArgs.EnterUserDetailsArgs) {
            final int i22 = 13;
            Function0 function21 = new Function0() { // from class: r6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i22) {
                        case 0:
                            ArrayList arrayList = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList.toArray(new Object[arrayList.size()]));
                        case 1:
                            ArrayList arrayList2 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList2.toArray(new Object[arrayList2.size()]));
                        case 2:
                            ArrayList arrayList3 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList3.toArray(new Object[arrayList3.size()]));
                        case 3:
                            ArrayList arrayList4 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList4.toArray(new Object[arrayList4.size()]));
                        case 4:
                            ArrayList arrayList5 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList5.toArray(new Object[arrayList5.size()]));
                        case 5:
                            ArrayList arrayList6 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList6.toArray(new Object[arrayList6.size()]));
                        case 6:
                            ArrayList arrayList7 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList7.toArray(new Object[arrayList7.size()]));
                        case 7:
                            ArrayList arrayList8 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList8.toArray(new Object[arrayList8.size()]));
                        case 8:
                            ArrayList arrayList9 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList9.toArray(new Object[arrayList9.size()]));
                        case 9:
                            ArrayList arrayList10 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList10.toArray(new Object[arrayList10.size()]));
                        case 10:
                            ArrayList arrayList11 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList11.toArray(new Object[arrayList11.size()]));
                        case 11:
                            ArrayList arrayList12 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList12.toArray(new Object[arrayList12.size()]));
                        case 12:
                            ArrayList arrayList13 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList13.toArray(new Object[arrayList13.size()]));
                        case 13:
                            ArrayList arrayList14 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList14.toArray(new Object[arrayList14.size()]));
                        case 14:
                            ArrayList arrayList15 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList15.toArray(new Object[arrayList15.size()]));
                        case 15:
                            ArrayList arrayList16 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList16.toArray(new Object[arrayList16.size()]));
                        case 16:
                            ArrayList arrayList17 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList17.toArray(new Object[arrayList17.size()]));
                        case 17:
                            ArrayList arrayList18 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList18.toArray(new Object[arrayList18.size()]));
                        case 18:
                            ArrayList arrayList19 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList19.toArray(new Object[arrayList19.size()]));
                        case 19:
                            ArrayList arrayList20 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList20.toArray(new Object[arrayList20.size()]));
                        case 20:
                            ArrayList arrayList21 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList21.toArray(new Object[arrayList21.size()]));
                        case 21:
                            ArrayList arrayList22 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList22.toArray(new Object[arrayList22.size()]));
                        case 22:
                            ArrayList arrayList23 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList23.toArray(new Object[arrayList23.size()]));
                        case 23:
                            ArrayList arrayList24 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList24.toArray(new Object[arrayList24.size()]));
                        default:
                            ArrayList arrayList25 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList25.toArray(new Object[arrayList25.size()]));
                    }
                }
            };
            return this instanceof KoinScopeComponent ? ((KoinScopeComponent) this).getF18811a().a(Reflection.a(SuperPassEnterUserDetailsViewModel.class), null, function21) : b3.o(this).a(Reflection.a(SuperPassEnterUserDetailsViewModel.class), null, function21);
        }
        if (sceneArgs instanceof SuperPassPurchaseArgs.PassengerSelectionArgs) {
            final int i23 = 14;
            Function0 function22 = new Function0() { // from class: r6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i23) {
                        case 0:
                            ArrayList arrayList = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList.toArray(new Object[arrayList.size()]));
                        case 1:
                            ArrayList arrayList2 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList2.toArray(new Object[arrayList2.size()]));
                        case 2:
                            ArrayList arrayList3 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList3.toArray(new Object[arrayList3.size()]));
                        case 3:
                            ArrayList arrayList4 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList4.toArray(new Object[arrayList4.size()]));
                        case 4:
                            ArrayList arrayList5 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList5.toArray(new Object[arrayList5.size()]));
                        case 5:
                            ArrayList arrayList6 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList6.toArray(new Object[arrayList6.size()]));
                        case 6:
                            ArrayList arrayList7 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList7.toArray(new Object[arrayList7.size()]));
                        case 7:
                            ArrayList arrayList8 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList8.toArray(new Object[arrayList8.size()]));
                        case 8:
                            ArrayList arrayList9 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList9.toArray(new Object[arrayList9.size()]));
                        case 9:
                            ArrayList arrayList10 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList10.toArray(new Object[arrayList10.size()]));
                        case 10:
                            ArrayList arrayList11 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList11.toArray(new Object[arrayList11.size()]));
                        case 11:
                            ArrayList arrayList12 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList12.toArray(new Object[arrayList12.size()]));
                        case 12:
                            ArrayList arrayList13 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList13.toArray(new Object[arrayList13.size()]));
                        case 13:
                            ArrayList arrayList14 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList14.toArray(new Object[arrayList14.size()]));
                        case 14:
                            ArrayList arrayList15 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList15.toArray(new Object[arrayList15.size()]));
                        case 15:
                            ArrayList arrayList16 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList16.toArray(new Object[arrayList16.size()]));
                        case 16:
                            ArrayList arrayList17 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList17.toArray(new Object[arrayList17.size()]));
                        case 17:
                            ArrayList arrayList18 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList18.toArray(new Object[arrayList18.size()]));
                        case 18:
                            ArrayList arrayList19 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList19.toArray(new Object[arrayList19.size()]));
                        case 19:
                            ArrayList arrayList20 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList20.toArray(new Object[arrayList20.size()]));
                        case 20:
                            ArrayList arrayList21 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList21.toArray(new Object[arrayList21.size()]));
                        case 21:
                            ArrayList arrayList22 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList22.toArray(new Object[arrayList22.size()]));
                        case 22:
                            ArrayList arrayList23 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList23.toArray(new Object[arrayList23.size()]));
                        case 23:
                            ArrayList arrayList24 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList24.toArray(new Object[arrayList24.size()]));
                        default:
                            ArrayList arrayList25 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList25.toArray(new Object[arrayList25.size()]));
                    }
                }
            };
            return this instanceof KoinScopeComponent ? ((KoinScopeComponent) this).getF18811a().a(Reflection.a(SuperPassPassengerSelectionViewModel.class), null, function22) : b3.o(this).a(Reflection.a(SuperPassPassengerSelectionViewModel.class), null, function22);
        }
        if (sceneArgs instanceof SuperPassPurchaseArgs.ProofUploadInternalArgs) {
            final int i24 = 15;
            Function0 function23 = new Function0() { // from class: r6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i24) {
                        case 0:
                            ArrayList arrayList = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList.toArray(new Object[arrayList.size()]));
                        case 1:
                            ArrayList arrayList2 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList2.toArray(new Object[arrayList2.size()]));
                        case 2:
                            ArrayList arrayList3 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList3.toArray(new Object[arrayList3.size()]));
                        case 3:
                            ArrayList arrayList4 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList4.toArray(new Object[arrayList4.size()]));
                        case 4:
                            ArrayList arrayList5 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList5.toArray(new Object[arrayList5.size()]));
                        case 5:
                            ArrayList arrayList6 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList6.toArray(new Object[arrayList6.size()]));
                        case 6:
                            ArrayList arrayList7 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList7.toArray(new Object[arrayList7.size()]));
                        case 7:
                            ArrayList arrayList8 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList8.toArray(new Object[arrayList8.size()]));
                        case 8:
                            ArrayList arrayList9 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList9.toArray(new Object[arrayList9.size()]));
                        case 9:
                            ArrayList arrayList10 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList10.toArray(new Object[arrayList10.size()]));
                        case 10:
                            ArrayList arrayList11 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList11.toArray(new Object[arrayList11.size()]));
                        case 11:
                            ArrayList arrayList12 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList12.toArray(new Object[arrayList12.size()]));
                        case 12:
                            ArrayList arrayList13 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList13.toArray(new Object[arrayList13.size()]));
                        case 13:
                            ArrayList arrayList14 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList14.toArray(new Object[arrayList14.size()]));
                        case 14:
                            ArrayList arrayList15 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList15.toArray(new Object[arrayList15.size()]));
                        case 15:
                            ArrayList arrayList16 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList16.toArray(new Object[arrayList16.size()]));
                        case 16:
                            ArrayList arrayList17 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList17.toArray(new Object[arrayList17.size()]));
                        case 17:
                            ArrayList arrayList18 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList18.toArray(new Object[arrayList18.size()]));
                        case 18:
                            ArrayList arrayList19 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList19.toArray(new Object[arrayList19.size()]));
                        case 19:
                            ArrayList arrayList20 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList20.toArray(new Object[arrayList20.size()]));
                        case 20:
                            ArrayList arrayList21 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList21.toArray(new Object[arrayList21.size()]));
                        case 21:
                            ArrayList arrayList22 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList22.toArray(new Object[arrayList22.size()]));
                        case 22:
                            ArrayList arrayList23 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList23.toArray(new Object[arrayList23.size()]));
                        case 23:
                            ArrayList arrayList24 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList24.toArray(new Object[arrayList24.size()]));
                        default:
                            ArrayList arrayList25 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList25.toArray(new Object[arrayList25.size()]));
                    }
                }
            };
            return this instanceof KoinScopeComponent ? ((KoinScopeComponent) this).getF18811a().a(Reflection.a(SuperPassUserProofUploadViewModel.class), null, function23) : b3.o(this).a(Reflection.a(SuperPassUserProofUploadViewModel.class), null, function23);
        }
        if (sceneArgs instanceof SuperPassPurchaseArgs.UserProofsOverviewArgs) {
            final int i25 = 16;
            Function0 function24 = new Function0() { // from class: r6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i25) {
                        case 0:
                            ArrayList arrayList = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList.toArray(new Object[arrayList.size()]));
                        case 1:
                            ArrayList arrayList2 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList2.toArray(new Object[arrayList2.size()]));
                        case 2:
                            ArrayList arrayList3 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList3.toArray(new Object[arrayList3.size()]));
                        case 3:
                            ArrayList arrayList4 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList4.toArray(new Object[arrayList4.size()]));
                        case 4:
                            ArrayList arrayList5 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList5.toArray(new Object[arrayList5.size()]));
                        case 5:
                            ArrayList arrayList6 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList6.toArray(new Object[arrayList6.size()]));
                        case 6:
                            ArrayList arrayList7 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList7.toArray(new Object[arrayList7.size()]));
                        case 7:
                            ArrayList arrayList8 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList8.toArray(new Object[arrayList8.size()]));
                        case 8:
                            ArrayList arrayList9 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList9.toArray(new Object[arrayList9.size()]));
                        case 9:
                            ArrayList arrayList10 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList10.toArray(new Object[arrayList10.size()]));
                        case 10:
                            ArrayList arrayList11 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList11.toArray(new Object[arrayList11.size()]));
                        case 11:
                            ArrayList arrayList12 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList12.toArray(new Object[arrayList12.size()]));
                        case 12:
                            ArrayList arrayList13 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList13.toArray(new Object[arrayList13.size()]));
                        case 13:
                            ArrayList arrayList14 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList14.toArray(new Object[arrayList14.size()]));
                        case 14:
                            ArrayList arrayList15 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList15.toArray(new Object[arrayList15.size()]));
                        case 15:
                            ArrayList arrayList16 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList16.toArray(new Object[arrayList16.size()]));
                        case 16:
                            ArrayList arrayList17 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList17.toArray(new Object[arrayList17.size()]));
                        case 17:
                            ArrayList arrayList18 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList18.toArray(new Object[arrayList18.size()]));
                        case 18:
                            ArrayList arrayList19 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList19.toArray(new Object[arrayList19.size()]));
                        case 19:
                            ArrayList arrayList20 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList20.toArray(new Object[arrayList20.size()]));
                        case 20:
                            ArrayList arrayList21 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList21.toArray(new Object[arrayList21.size()]));
                        case 21:
                            ArrayList arrayList22 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList22.toArray(new Object[arrayList22.size()]));
                        case 22:
                            ArrayList arrayList23 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList23.toArray(new Object[arrayList23.size()]));
                        case 23:
                            ArrayList arrayList24 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList24.toArray(new Object[arrayList24.size()]));
                        default:
                            ArrayList arrayList25 = b3.n(3, sceneArgs, componentContext, additionalParams).f17618a;
                            return ParametersHolderKt.a(arrayList25.toArray(new Object[arrayList25.size()]));
                    }
                }
            };
            return this instanceof KoinScopeComponent ? ((KoinScopeComponent) this).getF18811a().a(Reflection.a(SuperPassProofOverviewViewModel.class), null, function24) : b3.o(this).a(Reflection.a(SuperPassProofOverviewViewModel.class), null, function24);
        }
        if (sceneArgs instanceof SuperPassVerificationStatusArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI60 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA121 = Reflection.a(SuperPassVerificationStatusComponent.class);
                scopeI60.getClass();
                return scopeI60.d(classReferenceA121, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO61 = b3.o(this);
            ClassReference classReferenceA122 = Reflection.a(SuperPassVerificationStatusComponent.class);
            scopeO61.getClass();
            return scopeO61.d(classReferenceA122, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof StopTripDetailsArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI61 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA123 = Reflection.a(StopTripDetailsComponent.class);
                scopeI61.getClass();
                return scopeI61.d(classReferenceA123, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO62 = b3.o(this);
            ClassReference classReferenceA124 = Reflection.a(StopTripDetailsComponent.class);
            scopeO62.getClass();
            return scopeO62.d(classReferenceA124, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof TicketPurchaseArgs.MTicketTripInfoArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI62 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA125 = Reflection.a(MTicketTripInfoComponent.class);
                scopeI62.getClass();
                return scopeI62.d(classReferenceA125, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO63 = b3.o(this);
            ClassReference classReferenceA126 = Reflection.a(MTicketTripInfoComponent.class);
            scopeO63.getClass();
            return scopeO63.d(classReferenceA126, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof TicketPurchaseArgs.PayForTicketArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI63 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA127 = Reflection.a(PayForTicketComponent.class);
                scopeI63.getClass();
                return scopeI63.d(classReferenceA127, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO64 = b3.o(this);
            ClassReference classReferenceA128 = Reflection.a(PayForTicketComponent.class);
            scopeO64.getClass();
            return scopeO64.d(classReferenceA128, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof TicketPurchaseArgs.QuickPayArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI64 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA129 = Reflection.a(QuickpayTripAmountComponent.class);
                scopeI64.getClass();
                return scopeI64.d(classReferenceA129, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO65 = b3.o(this);
            ClassReference classReferenceA130 = Reflection.a(QuickpayTripAmountComponent.class);
            scopeO65.getClass();
            return scopeO65.d(classReferenceA130, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof TicketPurchaseArgs.RouteSelectionArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI65 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA131 = Reflection.a(RouteBasedStopSearchForProductPurchaseComponent.class);
                scopeI65.getClass();
                return scopeI65.d(classReferenceA131, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO66 = b3.o(this);
            ClassReference classReferenceA132 = Reflection.a(RouteBasedStopSearchForProductPurchaseComponent.class);
            scopeO66.getClass();
            return scopeO66.d(classReferenceA132, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof TicketPurchaseArgs.StopSelectionArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI66 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA133 = Reflection.a(StopBasedRouteSearchForProductPurchaseComponent.class);
                scopeI66.getClass();
                return scopeI66.d(classReferenceA133, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO67 = b3.o(this);
            ClassReference classReferenceA134 = Reflection.a(StopBasedRouteSearchForProductPurchaseComponent.class);
            scopeO67.getClass();
            return scopeO67.d(classReferenceA134, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof TitoRideDetailsArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI67 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA135 = Reflection.a(TitoRideDetailsComponent.class);
                scopeI67.getClass();
                return scopeI67.d(classReferenceA135, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO68 = b3.o(this);
            ClassReference classReferenceA136 = Reflection.a(TitoRideDetailsComponent.class);
            scopeO68.getClass();
            return scopeO68.d(classReferenceA136, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof TripSummaryArgs.PassSummaryScreen) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI68 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA137 = Reflection.a(PassSummaryComponent.class);
                scopeI68.getClass();
                return scopeI68.d(classReferenceA137, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO69 = b3.o(this);
            ClassReference classReferenceA138 = Reflection.a(PassSummaryComponent.class);
            scopeO69.getClass();
            return scopeO69.d(classReferenceA138, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof TripSummaryArgs.RideReceiptScreen) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI69 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA139 = Reflection.a(RideReceiptComponent.class);
                scopeI69.getClass();
                return scopeI69.d(classReferenceA139, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO70 = b3.o(this);
            ClassReference classReferenceA140 = Reflection.a(RideReceiptComponent.class);
            scopeO70.getClass();
            return scopeO70.d(classReferenceA140, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof TripSummaryArgs.TicketSummaryScreen) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI70 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA141 = Reflection.a(TicketSummaryComponent.class);
                scopeI70.getClass();
                return scopeI70.d(classReferenceA141, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO71 = b3.o(this);
            ClassReference classReferenceA142 = Reflection.a(TicketSummaryComponent.class);
            scopeO71.getClass();
            return scopeO71.d(classReferenceA142, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof UniversalPickerArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI71 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA143 = Reflection.a(UniversalPickerComponent.class);
                scopeI71.getClass();
                return scopeI71.d(classReferenceA143, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO72 = b3.o(this);
            ClassReference classReferenceA144 = Reflection.a(UniversalPickerComponent.class);
            scopeO72.getClass();
            return scopeO72.d(classReferenceA144, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof UserConsentScreenArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI72 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA145 = Reflection.a(UserConsentComponent.class);
                scopeI72.getClass();
                return scopeI72.d(classReferenceA145, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO73 = b3.o(this);
            ClassReference classReferenceA146 = Reflection.a(UserConsentComponent.class);
            scopeO73.getClass();
            return scopeO73.d(classReferenceA146, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof UserProfileFormArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI73 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA147 = Reflection.a(UserProfileFormComponent.class);
                scopeI73.getClass();
                return scopeI73.d(classReferenceA147, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO74 = b3.o(this);
            ClassReference classReferenceA148 = Reflection.a(UserProfileFormComponent.class);
            scopeO74.getClass();
            return scopeO74.d(classReferenceA148, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof ValidationArgs.BleValidationScreenArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI74 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA149 = Reflection.a(BleValidationFragmentComponent.class);
                scopeI74.getClass();
                return scopeI74.d(classReferenceA149, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO75 = b3.o(this);
            ClassReference classReferenceA150 = Reflection.a(BleValidationFragmentComponent.class);
            scopeO75.getClass();
            return scopeO75.d(classReferenceA150, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof ValidationArgs.QrScannerValidationArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI75 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA151 = Reflection.a(QRScannerValidationComponent.class);
                scopeI75.getClass();
                return scopeI75.d(classReferenceA151, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO76 = b3.o(this);
            ClassReference classReferenceA152 = Reflection.a(QRScannerValidationComponent.class);
            scopeO76.getClass();
            return scopeO76.d(classReferenceA152, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof ValidationArgs.QrValidationScreenArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI76 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA153 = Reflection.a(QRValidationComponent.class);
                scopeI76.getClass();
                return scopeI76.d(classReferenceA153, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO77 = b3.o(this);
            ClassReference classReferenceA154 = Reflection.a(QRValidationComponent.class);
            scopeO77.getClass();
            return scopeO77.d(classReferenceA154, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof ValidationArgs.MultiProductValidation) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI77 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA155 = Reflection.a(MultiProductValidationComponent.class);
                scopeI77.getClass();
                return scopeI77.d(classReferenceA155, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO78 = b3.o(this);
            ClassReference classReferenceA156 = Reflection.a(MultiProductValidationComponent.class);
            scopeO78.getClass();
            return scopeO78.d(classReferenceA156, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof WalletAllTransactionsArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI78 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA157 = Reflection.a(WalletAllTransactionsComponent.class);
                scopeI78.getClass();
                return scopeI78.d(classReferenceA157, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO79 = b3.o(this);
            ClassReference classReferenceA158 = Reflection.a(WalletAllTransactionsComponent.class);
            scopeO79.getClass();
            return scopeO79.d(classReferenceA158, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof WalletBalanceArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI79 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA159 = Reflection.a(WalletBalanceComponent.class);
                scopeI79.getClass();
                return scopeI79.d(classReferenceA159, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO80 = b3.o(this);
            ClassReference classReferenceA160 = Reflection.a(WalletBalanceComponent.class);
            scopeO80.getClass();
            return scopeO80.d(classReferenceA160, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof WalletLoadBalanceSuccessArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI80 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA161 = Reflection.a(WalletLoadBalanceSuccessComponent.class);
                scopeI80.getClass();
                return scopeI80.d(classReferenceA161, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO81 = b3.o(this);
            ClassReference classReferenceA162 = Reflection.a(WalletLoadBalanceSuccessComponent.class);
            scopeO81.getClass();
            return scopeO81.d(classReferenceA162, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof WalletLoadMoneyArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI81 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA163 = Reflection.a(WalletLoadBalanceEnterAmountComponent.class);
                scopeI81.getClass();
                return scopeI81.d(classReferenceA163, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO82 = b3.o(this);
            ClassReference classReferenceA164 = Reflection.a(WalletLoadBalanceEnterAmountComponent.class);
            scopeO82.getClass();
            return scopeO82.d(classReferenceA164, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof WalletTransactionSummaryArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI82 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA165 = Reflection.a(WalletTransactionSummaryComponent.class);
                scopeI82.getClass();
                return scopeI82.d(classReferenceA165, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO83 = b3.o(this);
            ClassReference classReferenceA166 = Reflection.a(WalletTransactionSummaryComponent.class);
            scopeO83.getClass();
            return scopeO83.d(classReferenceA166, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof WebViewArgs) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI83 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA167 = Reflection.a(WebViewScreenComponent.class);
                scopeI83.getClass();
                return scopeI83.d(classReferenceA167, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO84 = b3.o(this);
            ClassReference classReferenceA168 = Reflection.a(WebViewScreenComponent.class);
            scopeO84.getClass();
            return scopeO84.d(classReferenceA168, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof TripPlannerArgs.ResultsScreen) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI84 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA169 = Reflection.a(TripPlannerResultsComponent.class);
                scopeI84.getClass();
                return scopeI84.d(classReferenceA169, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO85 = b3.o(this);
            ClassReference classReferenceA170 = Reflection.a(TripPlannerResultsComponent.class);
            scopeO85.getClass();
            return scopeO85.d(classReferenceA170, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof TripPlannerArgs.DetailsScreen) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI85 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA171 = Reflection.a(TripPlannerDetailsComponent.class);
                scopeI85.getClass();
                return scopeI85.d(classReferenceA171, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO86 = b3.o(this);
            ClassReference classReferenceA172 = Reflection.a(TripPlannerDetailsComponent.class);
            scopeO86.getClass();
            return scopeO86.d(classReferenceA172, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (sceneArgs instanceof TripPlannerArgs.StopFocusedSearchScreen) {
            if (this instanceof KoinScopeComponent) {
                Scope scopeI86 = ((KoinScopeComponent) this).getF18811a();
                ClassReference classReferenceA173 = Reflection.a(StopBasedTripPlannerSearchComponent.class);
                scopeI86.getClass();
                return scopeI86.d(classReferenceA173, ParametersHolderKt.a(componentContext, sceneArgs), null);
            }
            Scope scopeO87 = b3.o(this);
            ClassReference classReferenceA174 = Reflection.a(StopBasedTripPlannerSearchComponent.class);
            scopeO87.getClass();
            return scopeO87.d(classReferenceA174, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        if (!(sceneArgs instanceof TripPlannerArgs.StopFocusedResultsScreen)) {
            throw new IllegalStateException(("No component mapping for args: " + sceneArgs).toString());
        }
        if (this instanceof KoinScopeComponent) {
            Scope scopeI87 = ((KoinScopeComponent) this).getF18811a();
            ClassReference classReferenceA175 = Reflection.a(StopTripPlannerResultsComponent.class);
            scopeI87.getClass();
            return scopeI87.d(classReferenceA175, ParametersHolderKt.a(componentContext, sceneArgs), null);
        }
        Scope scopeO88 = b3.o(this);
        ClassReference classReferenceA176 = Reflection.a(StopTripPlannerResultsComponent.class);
        scopeO88.getClass();
        return scopeO88.d(classReferenceA176, ParametersHolderKt.a(componentContext, sceneArgs), null);
    }
}
