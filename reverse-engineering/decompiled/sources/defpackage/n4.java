package defpackage;

import android.graphics.RectF;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.draganddrop.DragAndDropSourceNode;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.CommonContextMenuAreaKt;
import androidx.compose.foundation.text.LongPressTextDragObserverKt;
import androidx.compose.foundation.text.TextContextMenuItems;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuItem;
import androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MovableContent;
import androidx.compose.runtime.MovableContentKt;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draganddrop.DragAndDropStartTransferScope;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.AndroidParagraph;
import androidx.compose.ui.text.TextInclusionStrategy;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.datastore.preferences.core.Preferences;
import app.chalo.android.ChaloApplication;
import app.chalo.appUpdate.ui.ForceAppUpdateScreenKt;
import app.chalo.appmigrationpreconditions.AppMigrationPreconditionsScreenKt;
import app.chalo.appsupport.BookingHelpScreenKt;
import app.chalo.bookingsuccess.compose.BookingSuccessScreenKt;
import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.busesaroundyou.BusesAroundYouScreenKt;
import app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyMainScreenKt;
import app.chalo.chalobususerprofile.ui.compose.SurveyTimePickerDialogUIState;
import app.chalo.chalobususerprofile.ui.compose.TimePickerSelection;
import app.chalo.checkout.ui.screen.checkout.customurl.CustomUrlCheckoutComponent;
import app.chalo.checkout.ui.screen.checkout.customurl.CustomUrlCheckoutViewIntent;
import app.chalo.checkout.ui.screen.checkout.razorpay.CheckoutComponent;
import app.chalo.checkout.ui.screen.checkout.razorpay.CheckoutViewIntent;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.components.ChaloCircularProgressIndicatorKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.ChaloWidgetCardKt;
import app.chalo.compose.components.ComposeUtils_androidKt;
import app.chalo.compose.components.TextKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.dialogs.ChaloDatePickerKt;
import app.chalo.compose.components.dialogs.GenderSelectionDialogKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.core.compose.CheckoutParentScreenKt;
import app.chalo.core.compose.CitySelectionParentScreenKt;
import app.chalo.core.compose.NetworkInspectorScreenKt;
import app.chalo.core.compose.PremiumBusParentScreenKt;
import app.chalo.core.compose.SuperPassParentScreenKt;
import app.chalo.core.compose.ValidationParentScreenKt;
import app.chalo.core.compose.WalletParentScreenKt;
import app.chalo.core.navigation.root.RootComponent;
import app.chalo.data.GridWidgetCardData;
import app.chalo.data.GridWidgetItemData;
import app.chalo.electricitybill.ui.ebillamount.ui.EBillAmountScreenKt;
import app.chalo.electricitybill.ui.ebillfetch.ui.EBillFetchScreenKt;
import app.chalo.electricitybill.ui.ebillpayment.ui.EBillPaymentConfirmationScreenKt;
import app.chalo.electricitybill.ui.ebillpaymentsuccess.ui.EBillPaymentSuccessScreenKt;
import app.chalo.electricitybill.ui.invoice.ui.EBillPaymentInvoiceScreenKt;
import app.chalo.electricitybill.ui.paymenthistory.ui.EBillPaymentHistoryScreenKt;
import app.chalo.home.PendingRideFeedbackStickyBannerUIState;
import app.chalo.home.analytics.HomeScreenAnalyticsHelper;
import app.chalo.home.contract.HomeScreenInfoHelper;
import app.chalo.home.domain.ChaloUserBookingType;
import app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapScreenKt;
import app.chalo.home.ui.PremiumBusNotificationScreenKt;
import app.chalo.home.ui.base.HomeComponent;
import app.chalo.home.ui.base.HomeScreenMainDecomposeKt;
import app.chalo.home.ui.chalobus.ChaloBusProductItemData;
import app.chalo.home.ui.chalobus.PremiumBusTutorialScreenKt;
import app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoMainScreenKt;
import app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoViewState;
import app.chalo.home.ui.history.MyTicketsComponent;
import app.chalo.home.ui.history.MyTicketsViewIntent;
import app.chalo.home.ui.history.factory.CtaClickedType;
import app.chalo.home.ui.savedplacesandrides.SavedPlacesAndRidesScreenKt;
import app.chalo.home.ui.selectridescreen.SelectRideMainScreenKt;
import app.chalo.homescreen.data.model.app.NavigationTabAppModel;
import app.chalo.instantticket.ui.faredetails.FareDetailsCoordinatorComponent;
import app.chalo.instantticket.ui.faredetails.compose.FareDetailsBaseComposableKt;
import app.chalo.instantticket.ui.routeselection.compose.RouteSelectionComposableKt;
import app.chalo.kyc.min.ui.minkycdetails.composables.MinKycDetailsScreenKt;
import app.chalo.kyc.min.ui.minkycotp.composables.MinKycOtpScreenKt;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.routemap.RouteDetailsMainScreenKt;
import app.chalo.livetracking.search.compose.StopBasedTripPlannerSearchScreenKt;
import app.chalo.livetracking.stoptripplannerresult.compose.StopBasedTripPlannerResultScreenKt;
import app.chalo.livetracking.tripplanner.ui.details.compose.TripPlannerDetailsScreenKt;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent;
import app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerResultsScreenKt;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent;
import app.chalo.livetracking.universalsearch.ui.compose.UniversalPickerComposableKt;
import app.chalo.locationdisclaimer.ui.compose.LocationDisclaimerScreenKt;
import app.chalo.login.ui.options.LoginOptionsScreenKt;
import app.chalo.login.ui.otp.LoginOtpScreenKt;
import app.chalo.login.ui.userconsent.UserConsentScreenKt;
import app.chalo.metro.ui.confirmbooking.compose.ConfirmBookingScreenKt;
import app.chalo.metro.ui.landing.compose.MetroLandingScreenKt;
import app.chalo.metro.ui.regular.compose.StopBasedMetroLandingScreenKt;
import app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionComponent;
import app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionScreenKt;
import app.chalo.mticket.ui.tripinfo.MTicketTripInfoScreenKt;
import app.chalo.multimodalticket.groupticketsummary.ui.compose.GroupTicketSummaryScreenKt;
import app.chalo.multimodalticket.ui.composables.GroupTicketLegSelectionMainScreenKt;
import app.chalo.multimodalticket.ui.composables.GroupTicketPassengerSelectionBottomSheetComposableKt;
import app.chalo.multimodalticket.ui.uistates.FareBreakupSectionUIState;
import app.chalo.ncmc.ui.cardlinking.linking.ChaloCardLinkMainScreenKt;
import app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountMainScreenKt;
import app.chalo.ncmc.ui.cardtransactiondetail.CardTransactionDetailMainScreenKt;
import app.chalo.ncmc.ui.cardtransactiondetail.CardTransactionDetailScreenKt;
import app.chalo.ncmc.ui.cardtransactiondetail.CardTransactionDetailViewState;
import app.chalo.ncmc.ui.entercarddetails.EnterCardDetailsMainScreenKt;
import app.chalo.ncmc.ui.landing.ChaloCardInfoMainScreenKt;
import app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeMainScreenKt;
import app.chalo.ncmc.ui.ncmconlinerecharge.NcmcOnlineRechargeMainScreenKt;
import app.chalo.ncmc.ui.pendingrecharge.PendingRechargeMainScreenKt;
import app.chalo.ncmc.ui.transactionhistory.CardTransactionHistoryMainScreenKt;
import app.chalo.ncmc.ui.transactionhistory.CardTransactionTypeUiModel;
import app.chalo.network.config.ChaloJson;
import app.chalo.onboarding.citydiscontinued.ui.CityDiscontinuedScreenKt;
import app.chalo.onboarding.languageselection.ui.LanguageSelectionScreenKt;
import app.chalo.onboarding.splash.ui.SplashScreenKt;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsScreenKt;
import app.chalo.premiumbus.prebookedtickets.newactivation.NewPremiumBusActivationMainScreenKt;
import app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsScreenKt;
import app.chalo.premiumbus.ui.changestop.PremiumBusChangeStopScreenKt;
import app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsComponent;
import app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsFlowType;
import app.chalo.premiumbus.ui.faredetails.compose.PremiumBusFareDetailsBaseComposableKt;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionUiStateKt;
import app.chalo.productactivation.ui.ProductActivationScreenKt;
import app.chalo.productbooking.pickroutelocation.ui.PickRouteLocationComposableKt;
import app.chalo.productbooking.pickstop.ui.PickStopScreenKt;
import app.chalo.productpurchase.passpurchase.ui.passbookingsuccess.SuperPassBookingSuccessScreenKt;
import app.chalo.productpurchase.passpurchase.ui.verificationstatus.SuperPassVerificationStatusScreenKt;
import app.chalo.productpurchase.passselection.ui.PassSelectionScreenKt;
import app.chalo.productpurchase.productselection.data.models.app.SuperPassProductConfigCategoryResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.app.SuperPassProductConfigFareMappingResponseAppModel;
import app.chalo.productpurchase.productselection.ui.ProductSelectionScreenKt;
import app.chalo.productsummary.ui.compose.PassSummarySuccessMainScreenKt;
import app.chalo.productsummary.ui.compose.TripSummaryMainScreenKt;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.quickpay.ui.payforticket.compose.PayForTicketScreenKt;
import app.chalo.quickpay.ui.tripamount.QuickpayTripAmountScreenKt;
import app.chalo.reportproblem.ReportProblemScreenKt;
import app.chalo.ridefeedback.data.app.PendingRideFeedbackAppModel;
import app.chalo.ridefeedback.data.app.RideFeedbackBookingData;
import app.chalo.ridefeedback.data.app.RideFeedbackEntryPoint;
import app.chalo.ridehailing.feedback.RatingReaction;
import app.chalo.ridehailing.feedback.RideUserFeedbackScreenKt;
import app.chalo.routeselection.ui.compose.StopBasedRouteSearchForProductPurchaseScreenKt;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.RideUserFeedbackScreenArgs;
import app.chalo.sos.SosScreenUIKt;
import app.chalo.stoptripdetails.ui.StopTripDetailsScreenKt;
import app.chalo.titoridedetail.ui.compose.TitoRideDataScreenKt;
import app.chalo.tripreceipt.tripreceiptnew.ui.RideReceiptMainScreenKt;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.ChaloColorToken_androidKt;
import app.chalo.uistate.base.UiAlignmentKt;
import app.chalo.uistate.button.IconButtonUIState;
import app.chalo.uistate.dialog.DatePickerUIState;
import app.chalo.uistate.dialog.GenderRadioGroupUIState;
import app.chalo.uistate.dialog.GenderSelectionDialogUIState;
import app.chalo.uistate.dialog.LoadingDialogUISpec;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.userprofile.ui.compose.UserProfileFormScreenKt;
import app.chalo.userprofile.ui.minprofileupdate.compose.MinProfileUpdateScreenKt;
import app.chalo.utils.CommonHtmlParserImpl;
import app.chalo.utils.HtmlParserKt;
import app.chalo.webview.WebViewScreenKt;
import com.arkivanov.decompose.Child;
import com.mmk.kmpnotifier.notification.configuration.NotificationPlatformConfiguration;
import com.truecaller.android.sdk.TrueException;
import io.ktor.client.plugins.HttpRetryDelayContext;
import io.ktor.client.statement.HttpResponse;
import io.ktor.http.Headers;
import io.ktor.http.HttpHeaders;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.error.ClosedScopeException;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n4 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18451a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n4(Object obj, int i) {
        this.f18451a = i;
        this.b = obj;
    }

    private final Object a(Object obj, Object obj2) throws ClosedScopeException {
        Child.Created created = (Child.Created) this.b;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1990869671, iIntValue, -1, "app.chalo.core.compose.DecomposeScreens.<anonymous> (DecomposeScreens.kt:92)");
            }
            RootComponent.Child child = (RootComponent.Child) created.b;
            if (child instanceof RootComponent.Child.AppMigrationPreconditions) {
                composer.startReplaceGroup(-1965303444);
                AppMigrationPreconditionsScreenKt.c(((RootComponent.Child.AppMigrationPreconditions) child).f2198a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.BookingHelp) {
                composer.startReplaceGroup(-1965300194);
                BookingHelpScreenKt.a(((RootComponent.Child.BookingHelp) child).f2199a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.BookingSuccess) {
                composer.startReplaceGroup(-1965297267);
                BookingSuccessScreenKt.a(((RootComponent.Child.BookingSuccess) child).f2200a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.BusesAroundYou) {
                composer.startReplaceGroup(-1965293887);
                BusesAroundYouScreenKt.c(((RootComponent.Child.BusesAroundYou) child).f2201a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.CardPendingRecharge) {
                composer.startReplaceGroup(-1965290714);
                PendingRechargeMainScreenKt.a(((RootComponent.Child.CardPendingRecharge) child).f2202a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.CardTransactionDetail) {
                composer.startReplaceGroup(-1965287320);
                CardTransactionDetailMainScreenKt.a(((RootComponent.Child.CardTransactionDetail) child).f2203a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.CardTransactionHistory) {
                composer.startReplaceGroup(-1965283827);
                CardTransactionHistoryMainScreenKt.a(((RootComponent.Child.CardTransactionHistory) child).f2204a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.ChaloBusRouteInfo) {
                composer.startReplaceGroup(-1965280344);
                ChaloBusRouteInfoMainScreenKt.h(((RootComponent.Child.ChaloBusRouteInfo) child).f2205a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.ChaloCardEnterCardDetails) {
                composer.startReplaceGroup(-1965276761);
                EnterCardDetailsMainScreenKt.a(((RootComponent.Child.ChaloCardEnterCardDetails) child).f2207a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.ChaloCardLanding) {
                composer.startReplaceGroup(-1965273500);
                ChaloCardInfoMainScreenKt.a(((RootComponent.Child.ChaloCardLanding) child).f2208a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.ChaloCardLink) {
                composer.startReplaceGroup(-1965270428);
                ChaloCardLinkMainScreenKt.a(((RootComponent.Child.ChaloCardLink) child).f2209a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.ChaloCardRechargeAmount) {
                composer.startReplaceGroup(-1965267026);
                ChaloCardRechargeAmountMainScreenKt.a(((RootComponent.Child.ChaloCardRechargeAmount) child).f2210a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.ChaloBusUserProfileSurvey) {
                composer.startReplaceGroup(-1965263248);
                ChaloBusUserProfileSurveyMainScreenKt.b(((RootComponent.Child.ChaloBusUserProfileSurvey) child).f2206a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.CheckoutFlow) {
                composer.startReplaceGroup(-1965259839);
                CheckoutParentScreenKt.a(((RootComponent.Child.CheckoutFlow) child).f2211a, composer, 0);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.CityDiscontinued) {
                composer.startReplaceGroup(-1965256765);
                CityDiscontinuedScreenKt.a(((RootComponent.Child.CityDiscontinued) child).f2212a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.CitySelectionFlow) {
                composer.startReplaceGroup(-1965253562);
                CitySelectionParentScreenKt.a(((RootComponent.Child.CitySelectionFlow) child).f2213a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.ConfirmBooking) {
                composer.startReplaceGroup(-1965250367);
                ConfirmBookingScreenKt.a(((RootComponent.Child.ConfirmBooking) child).f2214a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.EBillAmount) {
                composer.startReplaceGroup(-1965247426);
                EBillAmountScreenKt.b(((RootComponent.Child.EBillAmount) child).f2215a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.EBillFetch) {
                composer.startReplaceGroup(-1965244611);
                EBillFetchScreenKt.a(((RootComponent.Child.EBillFetch) child).f2216a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.EBillPaymentConfirmation) {
                composer.startReplaceGroup(-1965241365);
                EBillPaymentConfirmationScreenKt.a(((RootComponent.Child.EBillPaymentConfirmation) child).f2217a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.EBillPaymentInvoice) {
                composer.startReplaceGroup(-1965237850);
                EBillPaymentInvoiceScreenKt.a(((RootComponent.Child.EBillPaymentInvoice) child).f2218a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.EBillPaymentSuccess) {
                composer.startReplaceGroup(-1965234490);
                EBillPaymentSuccessScreenKt.a(((RootComponent.Child.EBillPaymentSuccess) child).f2219a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.ElectricityBillPaymentHistory) {
                composer.startReplaceGroup(-1965230810);
                EBillPaymentHistoryScreenKt.b(((RootComponent.Child.ElectricityBillPaymentHistory) child).f2220a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.FareDetails) {
                composer.startReplaceGroup(-792510292);
                FareDetailsCoordinatorComponent fareDetailsCoordinatorComponent = ((RootComponent.Child.FareDetails) child).f2221a;
                FareDetailsBaseComposableKt.a(fareDetailsCoordinatorComponent.l, fareDetailsCoordinatorComponent.m, composer, 72);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.PremiumBusFareDetails) {
                composer.startReplaceGroup(-1965217616);
                PremiumBusFareDetailsComponent premiumBusFareDetailsComponent = ((RootComponent.Child.PremiumBusFareDetails) child).f2248a;
                PremiumBusFareDetailsFlowType.FreshPurchase freshPurchase = PremiumBusFareDetailsComponent.z;
                PremiumBusFareDetailsBaseComposableKt.a(premiumBusFareDetailsComponent, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.ForceAppUpdate) {
                composer.startReplaceGroup(-1965214111);
                ForceAppUpdateScreenKt.a(((RootComponent.Child.ForceAppUpdate) child).f2222a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.GroupTicketLegSelection) {
                composer.startReplaceGroup(-1965210770);
                GroupTicketLegSelectionMainScreenKt.a(((RootComponent.Child.GroupTicketLegSelection) child).f2223a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.GroupTicketSummary) {
                composer.startReplaceGroup(-1965207195);
                GroupTicketSummaryScreenKt.a(((RootComponent.Child.GroupTicketSummary) child).f2224a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.Home) {
                composer.startReplaceGroup(-1965204204);
                HomeComponent homeComponent = ((RootComponent.Child.Home) child).f2225a;
                composer.startReplaceGroup(-1168520582);
                Scope scopeB = KoinApplicationKt.b(composer);
                composer.startReplaceGroup(-1633490746);
                boolean zChanged = composer.changed((Object) null) | composer.changed(scopeB);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = scopeB.d(Reflection.a(HomeScreenAnalyticsHelper.class), null, null);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                composer.endReplaceGroup();
                HomeScreenAnalyticsHelper homeScreenAnalyticsHelper = (HomeScreenAnalyticsHelper) objRememberedValue;
                composer.startReplaceGroup(-1168520582);
                Scope scopeB2 = KoinApplicationKt.b(composer);
                composer.startReplaceGroup(-1633490746);
                boolean zChanged2 = composer.changed((Object) null) | composer.changed(scopeB2);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = scopeB2.d(Reflection.a(HomeScreenInfoHelper.class), null, null);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                composer.endReplaceGroup();
                HomeScreenMainDecomposeKt.c(homeComponent, homeScreenAnalyticsHelper, (HomeScreenInfoHelper) objRememberedValue2, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.LanguageSelection) {
                composer.startReplaceGroup(-1965196508);
                LanguageSelectionScreenKt.e(((RootComponent.Child.LanguageSelection) child).f2226a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.LocationDisclaimer) {
                composer.startReplaceGroup(-1965193239);
                LocationDisclaimerScreenKt.d(((RootComponent.Child.LocationDisclaimer) child).f2227a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.LoginOptions) {
                composer.startReplaceGroup(-1965190017);
                LoginOptionsScreenKt.e(((RootComponent.Child.LoginOptions) child).f2228a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.LoginOtp) {
                composer.startReplaceGroup(-1965187233);
                LoginOtpScreenKt.c(((RootComponent.Child.LoginOtp) child).f2229a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.MinProfileUpdate) {
                composer.startReplaceGroup(-1965184189);
                MinProfileUpdateScreenKt.f(((RootComponent.Child.MinProfileUpdate) child).f2235a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.MetroLanding) {
                composer.startReplaceGroup(-1965181153);
                MetroLandingScreenKt.a(((RootComponent.Child.MetroLanding) child).f2232a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.MinKycDetails) {
                composer.startReplaceGroup(-1965178208);
                MinKycDetailsScreenKt.a(((RootComponent.Child.MinKycDetails) child).f2233a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.MinKycOtp) {
                composer.startReplaceGroup(-1965175364);
                MinKycOtpScreenKt.a(((RootComponent.Child.MinKycOtp) child).f2234a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.MTicketPassengerSelection) {
                composer.startReplaceGroup(-1965172116);
                MTicketPassengerSelectionComponent mTicketPassengerSelectionComponent = ((RootComponent.Child.MTicketPassengerSelection) child).f2230a;
                Preferences.Key key = MTicketPassengerSelectionComponent.D;
                MTicketPassengerSelectionScreenKt.h(mTicketPassengerSelectionComponent, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.MTicketTripInfo) {
                composer.startReplaceGroup(-1965168702);
                MTicketTripInfoScreenKt.b(((RootComponent.Child.MTicketTripInfo) child).f2231a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.NCMCOnlineCardRecharge) {
                composer.startReplaceGroup(-1965165367);
                NcmcOnlineRechargeMainScreenKt.a(((RootComponent.Child.NCMCOnlineCardRecharge) child).f2236a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.NetworkInspector) {
                composer.startReplaceGroup(-1965162013);
                NetworkInspectorScreenKt.e(((RootComponent.Child.NetworkInspector) child).f2238a, composer, 0);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.NearbyStopsMap) {
                composer.startReplaceGroup(-1965158907);
                NearbyStopsMapScreenKt.e(((RootComponent.Child.NearbyStopsMap) child).f2237a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.NewPremiumBusReserveTicketActivation) {
                composer.startReplaceGroup(-1965155026);
                NewPremiumBusActivationMainScreenKt.a(((RootComponent.Child.NewPremiumBusReserveTicketActivation) child).f2239a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.OfflineCardRecharge) {
                composer.startReplaceGroup(-1965151414);
                OfflineCardRechargeMainScreenKt.a(((RootComponent.Child.OfflineCardRecharge) child).f2240a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.PassSummary) {
                composer.startReplaceGroup(-1965148190);
                PassSummarySuccessMainScreenKt.d(((RootComponent.Child.PassSummary) child).f2242a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.PassSelection) {
                composer.startReplaceGroup(-1965145152);
                PassSelectionScreenKt.f(((RootComponent.Child.PassSelection) child).f2241a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.PayForTicket) {
                composer.startReplaceGroup(-1965142205);
                PayForTicketScreenKt.d(((RootComponent.Child.PayForTicket) child).f2243a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.PbBulkBookingRideDetails) {
                composer.startReplaceGroup(-1965138769);
                PbBulkBookingRideDetailsScreenKt.h(((RootComponent.Child.PbBulkBookingRideDetails) child).f2244a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.PickStop) {
                composer.startReplaceGroup(-1965135493);
                PickStopScreenKt.d(((RootComponent.Child.PickStop) child).f2246a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.PickRouteLocation) {
                composer.startReplaceGroup(-1965132536);
                PickRouteLocationComposableKt.a(((RootComponent.Child.PickRouteLocation) child).f2245a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.PremiumBusFlow) {
                composer.startReplaceGroup(-1965129277);
                PremiumBusParentScreenKt.a(((RootComponent.Child.PremiumBusFlow) child).f2249a, composer, 0);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.PremiumBusNotification) {
                composer.startReplaceGroup(-1965125911);
                PremiumBusNotificationScreenKt.a(((RootComponent.Child.PremiumBusNotification) child).f2250a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.PremiumBusChangeStop) {
                composer.startReplaceGroup(-1965122457);
                PremiumBusChangeStopScreenKt.b(((RootComponent.Child.PremiumBusChangeStop) child).f2247a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.PremiumBusProductModificationReasons) {
                composer.startReplaceGroup(-1965118505);
                PremiumBusProductModificationReasonsScreenKt.g(((RootComponent.Child.PremiumBusProductModificationReasons) child).f2251a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.ProductActivation) {
                composer.startReplaceGroup(-1965114684);
                ProductActivationScreenKt.c(((RootComponent.Child.ProductActivation) child).f2253a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.ProductSelection) {
                composer.startReplaceGroup(-1965111485);
                ProductSelectionScreenKt.g(((RootComponent.Child.ProductSelection) child).f2254a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.QuickPay) {
                composer.startReplaceGroup(-1965108571);
                QuickpayTripAmountScreenKt.f(((RootComponent.Child.QuickPay) child).f2255a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.ReportProblem) {
                composer.startReplaceGroup(-1965105440);
                ReportProblemScreenKt.a(((RootComponent.Child.ReportProblem) child).f2256a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.RideReceipt) {
                composer.startReplaceGroup(-1965102526);
                RideReceiptMainScreenKt.a(((RootComponent.Child.RideReceipt) child).f2257a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.RouteBasedStopSearchForProductPurchase) {
                composer.startReplaceGroup(-1965098663);
                RouteSelectionComposableKt.a(((RootComponent.Child.RouteBasedStopSearchForProductPurchase) child).f2259a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.RouteDetails) {
                composer.startReplaceGroup(-1965094850);
                RouteDetailsComponent routeDetailsComponent = ((RootComponent.Child.RouteDetails) child).f2260a;
                composer.startReplaceGroup(-1168520582);
                Scope scopeB3 = KoinApplicationKt.b(composer);
                composer.startReplaceGroup(-1633490746);
                boolean zChanged3 = composer.changed((Object) null) | composer.changed(scopeB3);
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = scopeB3.d(Reflection.a(ChaloBuildConfig.class), null, null);
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                composer.endReplaceGroup();
                RouteDetailsMainScreenKt.a(routeDetailsComponent, (ChaloBuildConfig) objRememberedValue3, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.SavedPlacesAndRides) {
                composer.startReplaceGroup(-1965088758);
                SavedPlacesAndRidesScreenKt.d(((RootComponent.Child.SavedPlacesAndRides) child).f2262a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.SelectRide) {
                composer.startReplaceGroup(-1965085567);
                SelectRideMainScreenKt.b(((RootComponent.Child.SelectRide) child).f2263a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.SOS) {
                composer.startReplaceGroup(-1965082886);
                SosScreenUIKt.h(((RootComponent.Child.SOS) child).f2261a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.Splash) {
                composer.startReplaceGroup(-1965080327);
                SplashScreenKt.f(((RootComponent.Child.Splash) child).f2264a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.SuperPassBookingSuccess) {
                composer.startReplaceGroup(-1965077238);
                SuperPassBookingSuccessScreenKt.a(((RootComponent.Child.SuperPassBookingSuccess) child).f2270a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.SuperPassFlow) {
                composer.startReplaceGroup(-1965073950);
                SuperPassParentScreenKt.a(((RootComponent.Child.SuperPassFlow) child).f2271a, composer, 0);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.SuperPassVerificationStatus) {
                composer.startReplaceGroup(-1965070450);
                SuperPassVerificationStatusScreenKt.d(((RootComponent.Child.SuperPassVerificationStatus) child).f2272a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.StopBasedMetroLanding) {
                composer.startReplaceGroup(-1965066776);
                StopBasedMetroLandingScreenKt.a(((RootComponent.Child.StopBasedMetroLanding) child).f2265a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.StopBasedRouteSearchForProductPurchase) {
                composer.startReplaceGroup(-1965062741);
                StopBasedRouteSearchForProductPurchaseScreenKt.c(((RootComponent.Child.StopBasedRouteSearchForProductPurchase) child).f2266a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.StopTripDetails) {
                composer.startReplaceGroup(-1965059358);
                StopTripDetailsScreenKt.k(((RootComponent.Child.StopTripDetails) child).f2267a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.TicketSummary) {
                composer.startReplaceGroup(-1965056318);
                TripSummaryMainScreenKt.n(((RootComponent.Child.TicketSummary) child).f2273a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.TitoRideDetails) {
                composer.startReplaceGroup(-1965053214);
                TitoRideDataScreenKt.q(((RootComponent.Child.TitoRideDetails) child).f2274a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.UniversalPicker) {
                composer.startReplaceGroup(-1965050106);
                UniversalPickerComposableKt.g(((RootComponent.Child.UniversalPicker) child).f2277a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.UserConsent) {
                composer.startReplaceGroup(-1965047010);
                UserConsentScreenKt.b(((RootComponent.Child.UserConsent) child).f2278a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.UserProfileForm) {
                composer.startReplaceGroup(-1965044026);
                UserProfileFormScreenKt.c(((RootComponent.Child.UserProfileForm) child).f2279a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.ValidationFlow) {
                composer.startReplaceGroup(-1965040829);
                ValidationParentScreenKt.a(((RootComponent.Child.ValidationFlow) child).f2280a, composer, 0);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.WalletFlow) {
                composer.startReplaceGroup(-1965037857);
                WalletParentScreenKt.a(((RootComponent.Child.WalletFlow) child).f2281a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.WebView) {
                composer.startReplaceGroup(-1965035142);
                WebViewScreenKt.b(((RootComponent.Child.WebView) child).f2282a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.TripPlannerResultsScreen) {
                composer.startReplaceGroup(-1965032027);
                TripPlannerResultsComponent tripPlannerResultsComponent = ((RootComponent.Child.TripPlannerResultsScreen) child).f2276a;
                List list = TripPlannerResultsComponent.Z;
                TripPlannerResultsScreenKt.t(tripPlannerResultsComponent, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.TripPlannerDetailsScreen) {
                composer.startReplaceGroup(-1965028567);
                TripPlannerDetailsScreenKt.l(((RootComponent.Child.TripPlannerDetailsScreen) child).f2275a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.StopTripPlannerSearchScreen) {
                composer.startReplaceGroup(-1965024879);
                StopBasedTripPlannerSearchScreenKt.h(((RootComponent.Child.StopTripPlannerSearchScreen) child).f2269a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.StopTripPlannerResultsScreen) {
                composer.startReplaceGroup(-1965020911);
                StopBasedTripPlannerResultScreenKt.h(((RootComponent.Child.StopTripPlannerResultsScreen) child).f2268a, composer, 8);
                composer.endReplaceGroup();
            } else if (child instanceof RootComponent.Child.PremiumBusTutorial) {
                composer.startReplaceGroup(-1965017275);
                PremiumBusTutorialScreenKt.a(((RootComponent.Child.PremiumBusTutorial) child).f2252a, composer, 8);
                composer.endReplaceGroup();
            } else {
                if (!(child instanceof RootComponent.Child.RideUserFeedbackScreen)) {
                    throw pk0.p(composer, -1965297583);
                }
                composer.startReplaceGroup(-1965013881);
                RideUserFeedbackScreenKt.m(((RootComponent.Child.RideUserFeedbackScreen) child).f2258a, composer, 8);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:303:0x0905  */
    /* JADX WARN: Code duplicated, block: B:306:0x0921  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f4  */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        Long lValueOf;
        Headers headers;
        Long lT0;
        int i = this.f18451a;
        String strC = "";
        int i2 = 4;
        Unit unit = Unit.f17538a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(AndroidParagraph.getRangeForRect_8_6BmAI$lambda$0((TextInclusionStrategy) obj3, (RectF) obj, (RectF) obj2));
            case 1:
                return BasicTextKt.selectionIdSaver$lambda$0((SelectionRegistrar) obj3, (SaverScope) obj, ((Long) obj2).longValue());
            case 2:
                boolean z = ((SuperPassProductConfigCategoryResponseAppModel) obj3).e;
                SuperPassProductConfigFareMappingResponseAppModel superPassProductConfigFareMappingResponseAppModel = (SuperPassProductConfigFareMappingResponseAppModel) obj;
                SuperPassProductConfigFareMappingResponseAppModel superPassProductConfigFareMappingResponseAppModel2 = (SuperPassProductConfigFareMappingResponseAppModel) obj2;
                long j = superPassProductConfigFareMappingResponseAppModel.f;
                long j2 = superPassProductConfigFareMappingResponseAppModel2.f;
                Boolean bool = superPassProductConfigFareMappingResponseAppModel.c;
                if ((bool != null && !bool.booleanValue()) || !z) {
                    j += 315360000000L;
                }
                Boolean bool2 = superPassProductConfigFareMappingResponseAppModel2.c;
                if ((bool2 != null && !bool2.booleanValue()) || !z) {
                    j2 += 315360000000L;
                }
                return Integer.valueOf(Intrinsics.l(j, j2));
            case 3:
                CardTransactionDetailViewState cardTransactionDetailViewState = (CardTransactionDetailViewState) obj3;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1046306495, iIntValue, -1, "app.chalo.ncmc.ui.cardtransactiondetail.CardTransactionDetailScreen.<anonymous>.<anonymous> (CardTransactionDetailScreen.kt:46)");
                    }
                    CardTransactionTypeUiModel cardTransactionTypeUiModel = cardTransactionDetailViewState.f6315a;
                    String str2 = cardTransactionDetailViewState.i;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-797353001, 0, -1, "app.chalo.ncmc.ui.cardtransactiondetail.getToolBarTitle (CardTransactionDetailScreen.kt:289)");
                    }
                    int i3 = cardTransactionTypeUiModel != null ? CardTransactionDetailScreenKt.WhenMappings.f6313a[cardTransactionTypeUiModel.ordinal()] : -1;
                    if (i3 == 1) {
                        composer.startReplaceGroup(-1752048854);
                        strC = StringResourcesHelperKt.c(StringEnum.MONEY_ADDED, new Object[0], composer, 6);
                        composer.endReplaceGroup();
                    } else if (i3 == 2) {
                        composer.startReplaceGroup(-1752043441);
                        strC = StringResourcesHelperKt.c(StringEnum.PAID_TO_MERCHANT, new Object[0], composer, 6);
                        composer.endReplaceGroup();
                    } else if (i3 != 3) {
                        composer.startReplaceGroup(1521298919);
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(1521162490);
                        composer.endReplaceGroup();
                        if (str2 != null) {
                            str = str2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        ChaloToolBarKt.c(str, 1, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), null, composer, 432, 8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                    str = strC;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ChaloToolBarKt.c(str, 1, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), null, composer, 432, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return unit;
            case 4:
                ChaloBusRouteInfoViewState chaloBusRouteInfoViewState = (ChaloBusRouteInfoViewState) obj3;
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-200056288, iIntValue2, -1, "app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoScreen.<anonymous>.<anonymous> (ChaloBusRouteInfoMainScreen.kt:103)");
                    }
                    ChaloToolBarKt.c(chaloBusRouteInfoViewState.f3356a.b, 0, 0, null, composer2, 0, 14);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return unit;
            case 5:
                ChaloBusProductItemData chaloBusProductItemData = (ChaloBusProductItemData) obj3;
                Composer composer3 = (Composer) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (composer3.shouldExecute((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(22593616, iIntValue3, -1, "app.chalo.home.ui.chalobus.MeasureItemHeights.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChaloBusScreenUI.kt:1437)");
                    }
                    Modifier modifierHeight = IntrinsicKt.height(SizeKt.m833width3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composer3, 0).K), IntrinsicSize.Max);
                    GridWidgetCardData gridWidgetCardData = chaloBusProductItemData.f3250a;
                    String str3 = gridWidgetCardData.b;
                    long jA = ChaloColorToken_androidKt.a(Color.INSTANCE, gridWidgetCardData.d, Color.INSTANCE.m4640getTransparent0d7_KjU());
                    GridWidgetCardData gridWidgetCardData2 = chaloBusProductItemData.f3250a;
                    GridWidgetItemData gridWidgetItemData = gridWidgetCardData2.f2348a;
                    ChaloWidgetCardKt.c(modifierHeight, Color.m4595boximpl(jA), str3, gridWidgetItemData.c, gridWidgetItemData.f2349a, gridWidgetItemData.b, gridWidgetCardData2.c, false, composer3, 4096, 128);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return unit;
            case 6:
                SurveyTimePickerDialogUIState surveyTimePickerDialogUIState = (SurveyTimePickerDialogUIState) obj3;
                Composer composer4 = (Composer) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (composer4.shouldExecute((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(104221521, iIntValue4, -1, "app.chalo.chalobususerprofile.ui.compose.SurveyTimePickerDialog.<anonymous> (ChaloBusUserProfileSurveyMainScreen.kt:200)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM263backgroundbw27NRU = BackgroundKt.m263backgroundbw27NRU(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloColorTokenKt.c(ChaloColorToken.White.f9870a), ChaloTheme.d(composer4, 0).g);
                    float f = ChaloThemeHelper.a().h;
                    Modifier modifierC = ChaloThemeKt.c(modifierM263backgroundbw27NRU, new ChaloPadding(f, f, f, f));
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer4, 0);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                    int i4 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer4, modifierC);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    if (composer4.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer4);
                    pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    ChaloTextViewKt.a(null, surveyTimePickerDialogUIState.f1236a, null, null, composer4, 0, 13);
                    TimePickerSelection timePickerSelection = surveyTimePickerDialogUIState.b;
                    int i5 = timePickerSelection.f1237a;
                    int i6 = timePickerSelection.b;
                    String str4 = timePickerSelection.c;
                    boolean zChanged = composer4.changed(surveyTimePickerDialogUIState);
                    Object objRememberedValue = composer4.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new c6(surveyTimePickerDialogUIState, 7);
                        composer4.updateRememberedValue(objRememberedValue);
                    }
                    PremiumBusSlotSelectionUiStateKt.u(i5, i6, str4, 0, (Function3) objRememberedValue, composer4, 0);
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m672spacedBy0680j_4(ChaloThemeHelper.a().g), companion2.getTop(), composer4, 0);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                    int i7 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default);
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composer4.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor2);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer4);
                    pk0.v(companion3, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i7), composerM3915constructorimpl2));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    ChaloFilledButtonKt.a(0, 0, composer4, i41.a(rowScopeInstance, companion, 1.0f, false, 2, null), surveyTimePickerDialogUIState.e);
                    ChaloFilledButtonKt.a(0, 0, composer4, i41.a(rowScopeInstance, companion, 1.0f, false, 2, null), surveyTimePickerDialogUIState.d);
                    composer4.endNode();
                    composer4.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return unit;
            case 7:
                IconButtonUIState iconButtonUIState = (IconButtonUIState) obj3;
                Composer composer5 = (Composer) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (composer5.shouldExecute((iIntValue5 & 3) != 2, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1712556925, iIntValue5, -1, "app.chalo.compose.components.buttons.ImageButton.<anonymous>.<anonymous> (ChaloCircularBackButton.kt:56)");
                    }
                    CommonImageKt.a(iconButtonUIState.f9923a, null, false, composer5, 0, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return unit;
            case 8:
                DatePickerUIState datePickerUIState = (DatePickerUIState) obj3;
                Composer composer6 = (Composer) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                PaddingValues paddingValues = ChaloDatePickerKt.f1888a;
                if (composer6.shouldExecute((iIntValue6 & 3) != 2, iIntValue6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2047709242, iIntValue6, -1, "app.chalo.compose.components.dialogs.ChaloDatePicker.<anonymous> (ChaloDatePicker.kt:151)");
                    }
                    TextUIState.ChaloTextUIState chaloTextUIState = datePickerUIState.e;
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    boolean zChanged2 = composer6.changed(datePickerUIState);
                    Object objRememberedValue2 = composer6.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new fi(datePickerUIState, i2);
                        composer6.updateRememberedValue(objRememberedValue2);
                    }
                    TextKt.c(chaloTextUIState, ChaloThemeKt.c(ClickableKt.m299clickableoSLSa3U$default(companion4, false, null, null, null, (Function0) objRememberedValue2, 15, null), datePickerUIState.f.c), null, null, composer6, 0, 12);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return unit;
            case 9:
                LoadingDialogUIState loadingDialogUIState = (LoadingDialogUIState) obj3;
                Composer composer7 = (Composer) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (composer7.shouldExecute((iIntValue7 & 3) != 2, iIntValue7 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-305989925, iIntValue7, -1, "app.chalo.compose.components.ChaloLoadingDialog.<anonymous> (ChaloLoadingDialog.kt:34)");
                    }
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null);
                    LoadingDialogUISpec loadingDialogUISpec = loadingDialogUIState.c;
                    Modifier modifierC2 = ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(modifierFillMaxWidth$default2, ChaloColorTokenKt.c(loadingDialogUISpec.f10005a), null, 2, null), loadingDialogUISpec.b);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer7, 0);
                    int i8 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer7.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer7, modifierC2);
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
                    if (composer7.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer7.startReusableNode();
                    if (composer7.getInserting()) {
                        composer7.createNode(constructor3);
                    } else {
                        composer7.useNode();
                    }
                    Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer7);
                    pk0.v(companion6, composerM3915constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion6, composerM3915constructorimpl3, Integer.valueOf(i8), composerM3915constructorimpl3));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), UiAlignmentKt.b(loadingDialogUISpec.d), composer7, 0);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer7, 0);
                    int i9 = (int) ((currentCompositeKeyHashCode4 >>> 32) ^ currentCompositeKeyHashCode4);
                    CompositionLocalMap currentCompositionLocalMap4 = composer7.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer7, modifierFillMaxWidth$default3);
                    Function0<ComposeUiNode> constructor4 = companion6.getConstructor();
                    if (composer7.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer7.startReusableNode();
                    if (composer7.getInserting()) {
                        composer7.createNode(constructor4);
                    } else {
                        composer7.useNode();
                    }
                    Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composer7);
                    pk0.v(companion6, composerM3915constructorimpl4, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl4, currentCompositionLocalMap4);
                    Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion6, composerM3915constructorimpl4, Integer.valueOf(i9), composerM3915constructorimpl4));
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    ChaloCircularProgressIndicatorKt.a(null, loadingDialogUIState.b, composer7, 0, 1);
                    SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion5, loadingDialogUISpec.c), composer7, 0);
                    ChaloTextViewKt.a(null, loadingDialogUIState.f10006a, null, null, composer7, 0, 13);
                    if (r1.k(composer7)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                return unit;
            case 10:
                String str5 = (String) obj2;
                ((CheckoutComponent) obj3).I0(new CheckoutViewIntent.PaymentCompletedIntent.Failed(((Integer) obj).intValue(), str5 != null ? str5 : ""));
                return unit;
            case 11:
                return CommonContextMenuAreaKt.CommonContextMenuArea$lambda$8$0((CoroutineScope) obj3, (TextFieldSelectionState) obj, (TextContextMenuItems) obj2);
            case 12:
                String name = (String) obj;
                ((Boolean) obj2).getClass();
                Intrinsics.i(name, "name");
                vo1.x("TAG_CLOSE----->", HtmlParserKt.a(name).getIdentifier(), "message");
                ArrayDeque arrayDeque = ((CommonHtmlParserImpl) obj3).f10420a;
                if (!arrayDeque.isEmpty()) {
                    arrayDeque.removeLast();
                }
                return unit;
            case 13:
                return ComposerKt.removeCurrentGroup$lambda$0((RememberManager) obj3, ((Integer) obj).intValue(), obj2);
            case 14:
                CustomUrlCheckoutComponent customUrlCheckoutComponent = (CustomUrlCheckoutComponent) obj3;
                Integer num = (Integer) obj;
                String str6 = (String) obj2;
                int iIntValue8 = num != null ? num.intValue() : -1111;
                if (str6 == null) {
                    str6 = TrueException.TYPE_UNKNOWN_MESSAGE;
                }
                customUrlCheckoutComponent.I0(new CustomUrlCheckoutViewIntent.OnErrorWhileMakingPayment(iIntValue8, str6));
                return unit;
            case 15:
                return DatePickerKt.SwitchableDateEntryContent_KaiTk9E$lambda$21$lambda$20$lambda$19((FiniteAnimationSpec) obj3, (IntSize) obj, (IntSize) obj2);
            case 16:
                return a(obj, obj2);
            case 17:
                return DefaultTextContextMenuDropdownProvider_androidKt.DefaultTextContextMenuDropdown$lambda$0$0$0$0((TextContextMenuItem) obj3, (Composer) obj, ((Integer) obj2).intValue());
            case 18:
                return DragAndDropSourceNode.dragAndDropModifierNode$lambda$0((DragAndDropSourceNode) obj3, (DragAndDropStartTransferScope) obj, (Offset) obj2);
            case 19:
                GenderSelectionDialogUIState genderSelectionDialogUIState = (GenderSelectionDialogUIState) obj3;
                Composer composer8 = (Composer) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (composer8.shouldExecute((iIntValue9 & 3) != 2, iIntValue9 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1531276427, iIntValue9, -1, "app.chalo.compose.components.dialogs.GenderSelectionDialog.<anonymous> (GenderSelectionDialog.kt:36)");
                    }
                    Modifier.Companion companion7 = Modifier.INSTANCE;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1868406235, 0, -1, "app.chalo.compose.components.dialogs.genderDialogWidth (GenderSelectionDialog.kt:151)");
                    }
                    float fM7278constructorimpl = Dp.m7278constructorimpl((int) (((double) ComposeUtils_androidKt.c(composer8)) * 0.8d));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    Modifier modifierC3 = ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.m833width3ABfNKs(companion7, fM7278constructorimpl), ChaloColorTokenKt.c(genderSelectionDialogUIState.d), null, 2, null), genderSelectionDialogUIState.e);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer8, 0);
                    long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer8, 0);
                    int i10 = (int) ((currentCompositeKeyHashCode5 >>> 32) ^ currentCompositeKeyHashCode5);
                    CompositionLocalMap currentCompositionLocalMap5 = composer8.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer8, modifierC3);
                    ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor5 = companion8.getConstructor();
                    if (composer8.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer8.startReusableNode();
                    if (composer8.getInserting()) {
                        composer8.createNode(constructor5);
                    } else {
                        composer8.useNode();
                    }
                    Composer composerM3915constructorimpl5 = Updater.m3915constructorimpl(composer8);
                    pk0.v(companion8, composerM3915constructorimpl5, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl5, currentCompositionLocalMap5);
                    Updater.m3923setimpl(composerM3915constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion8, composerM3915constructorimpl5, Integer.valueOf(i10), composerM3915constructorimpl5));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    TextKt.c(genderSelectionDialogUIState.b, null, null, null, composer8, 0, 14);
                    ChaloSpacersKt.a(genderSelectionDialogUIState.f, composer8, 0);
                    composer8.startReplaceGroup(-792338895);
                    Iterator it = genderSelectionDialogUIState.c.iterator();
                    while (it.hasNext()) {
                        GenderSelectionDialogKt.a((GenderRadioGroupUIState) it.next(), null, composer8, 0);
                    }
                    if (b3.t(composer8)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer8.skipToGroupEnd();
                }
                return unit;
            case 20:
                FareBreakupSectionUIState fareBreakupSectionUIState = (FareBreakupSectionUIState) obj3;
                Composer composer9 = (Composer) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (composer9.shouldExecute((iIntValue10 & 3) != 2, iIntValue10 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1478712445, iIntValue10, -1, "app.chalo.multimodalticket.ui.composables.GroupTicketPassengerSelectionItemComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GroupTicketPassengerSelectionBottomSheetComposable.kt:142)");
                    }
                    GroupTicketPassengerSelectionBottomSheetComposableKt.a(fareBreakupSectionUIState, composer9, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer9.skipToGroupEnd();
                }
                return unit;
            case 21:
                HomeComponent homeComponent = (HomeComponent) obj3;
                PendingRideFeedbackAppModel prompt = (PendingRideFeedbackAppModel) obj;
                RatingReaction rating = (RatingReaction) obj2;
                Intrinsics.i(prompt, "prompt");
                Intrinsics.i(rating, "rating");
                PendingRideFeedbackStickyBannerUIState pendingRideFeedbackStickyBannerUIState = homeComponent.L0;
                RandomAccess randomAccess = pendingRideFeedbackStickyBannerUIState != null ? pendingRideFeedbackStickyBannerUIState.f2862a : null;
                if (randomAccess == null) {
                    randomAccess = EmptyList.f17557a;
                }
                Collection collectionR = (Collection) randomAccess;
                if (collectionR.isEmpty()) {
                    collectionR = CollectionsKt.R(prompt);
                }
                String str7 = prompt.f9066a;
                String str8 = prompt.l;
                String str9 = prompt.k;
                homeComponent.m1("ride feedback home banner rating clicked", MapsKt.i(new Pair("bookingId", str7), new Pair("productType", str9), new Pair("productSubType", str8), new Pair("selectedRating", Integer.valueOf(rating.getId()))), (List) collectionR);
                ChaloNavigationManager chaloNavigationManager = homeComponent.M;
                RideFeedbackBookingData rideFeedbackBookingData = new RideFeedbackBookingData(prompt.f9066a, prompt.b, prompt.c, prompt.d, prompt.e, prompt.f, prompt.g, prompt.h, prompt.j, Integer.valueOf(rating.getId()), RideFeedbackEntryPoint.HOME_SCREEN, prompt.i);
                Json json = ChaloJson.b;
                json.getClass();
                chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new RideUserFeedbackScreenArgs.Default(json.a(RideFeedbackBookingData.INSTANCE.serializer(), rideFeedbackBookingData), str9, str8, true), null, null, 6));
                return unit;
            case 22:
                NavigationTabAppModel navigationTabAppModel = (NavigationTabAppModel) obj3;
                Composer composer10 = (Composer) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (composer10.shouldExecute((iIntValue11 & 3) != 2, iIntValue11 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(207067767, iIntValue11, -1, "app.chalo.home.ui.base.AppBottomNavigation.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeScreenMainDecompose.kt:572)");
                    }
                    androidx.compose.material3.TextKt.m2623TextNvy7gAk(navigationTabAppModel.f3761a.c, null, 0L, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(TextAlign.INSTANCE.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTypographyKt.j(ChaloTheme.e(composer10, 0)), composer10, 0, 0, 130046);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer10.skipToGroupEnd();
                }
                return unit;
            case 23:
                tr trVar = (tr) obj3;
                HttpRetryDelayContext httpRetryDelayContext = (HttpRetryDelayContext) obj;
                Integer num2 = (Integer) obj2;
                num2.getClass();
                Intrinsics.i(httpRetryDelayContext, "<this>");
                HttpResponse httpResponse = httpRetryDelayContext.f16665a;
                if (httpResponse == null || (headers = httpResponse.getG()) == null) {
                    lValueOf = null;
                } else {
                    List list = HttpHeaders.f16799a;
                    String str10 = headers.get("Retry-After");
                    if (str10 == null || (lT0 = StringsKt.t0(str10)) == null) {
                        lValueOf = null;
                    } else {
                        lValueOf = Long.valueOf(lT0.longValue() * ((long) 1000));
                    }
                }
                return Long.valueOf(Math.max(((Number) trVar.invoke(httpRetryDelayContext, num2)).longValue(), lValueOf != null ? lValueOf.longValue() : 0L));
            case 24:
                ChaloApplication chaloApplication = (ChaloApplication) obj3;
                Scope single = (Scope) obj;
                ParametersHolder it2 = (ParametersHolder) obj2;
                Intrinsics.i(single, "$this$single");
                Intrinsics.i(it2, "it");
                return chaloApplication;
            case 25:
                NotificationPlatformConfiguration.Android android2 = (NotificationPlatformConfiguration.Android) obj3;
                Scope single2 = (Scope) obj;
                ParametersHolder it3 = (ParametersHolder) obj2;
                Intrinsics.i(single2, "$this$single");
                Intrinsics.i(it3, "it");
                return android2;
            case 26:
                return LongPressTextDragObserverKt.detectDragGesturesWithObserver$lambda$3((TextDragObserver) obj3, (PointerInputChange) obj, (Offset) obj2);
            case 27:
                return ModalBottomSheetKt.ModalBottomSheetContent_7___e2Q$lambda$18$lambda$17((SheetState) obj3, (IntSize) obj, (Constraints) obj2);
            case 28:
                return MovableContentKt.movableContentOf$lambda$0((MovableContent) obj3, (Composer) obj, ((Integer) obj2).intValue());
            default:
                MyTicketsComponent myTicketsComponent = (MyTicketsComponent) obj3;
                ChaloUserBookingType bookingType = (ChaloUserBookingType) obj;
                CtaClickedType ctaClickedType = (CtaClickedType) obj2;
                Intrinsics.i(bookingType, "bookingType");
                Intrinsics.i(ctaClickedType, "ctaClickedType");
                int i11 = MyTicketsComponent.WhenMappings.f[ctaClickedType.ordinal()];
                if (i11 == 1) {
                    myTicketsComponent.q1(new MyTicketsViewIntent.UseNowClickedIntent(bookingType, false));
                } else if (i11 == 2) {
                    myTicketsComponent.q1(new MyTicketsViewIntent.UseNowClickedIntent(bookingType, true));
                } else if (i11 == 3) {
                    myTicketsComponent.q1(new MyTicketsViewIntent.BookAgainClickedIntent(bookingType));
                } else if (i11 == 4) {
                    myTicketsComponent.q1(new MyTicketsViewIntent.OnDropDownMenuSummaryClickedIntent(bookingType));
                } else {
                    if (i11 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    myTicketsComponent.q1(new MyTicketsViewIntent.OnProductStatusCtaClickedIntent(bookingType));
                }
                return unit;
        }
    }
}
