package app.chalo.constants;

import com.adjust.sdk.Constants;
import defpackage.ra1;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0013\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0003\bÁ\u0001\b\u0087\u0081\u0002\u0018\u0000 Ã\u00012\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002Ã\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001j\u0003\b\u0087\u0001j\u0003\b\u0088\u0001j\u0003\b\u0089\u0001j\u0003\b\u008a\u0001j\u0003\b\u008b\u0001j\u0003\b\u008c\u0001j\u0003\b\u008d\u0001j\u0003\b\u008e\u0001j\u0003\b\u008f\u0001j\u0003\b\u0090\u0001j\u0003\b\u0091\u0001j\u0003\b\u0092\u0001j\u0003\b\u0093\u0001j\u0003\b\u0094\u0001j\u0003\b\u0095\u0001j\u0003\b\u0096\u0001j\u0003\b\u0097\u0001j\u0003\b\u0098\u0001j\u0003\b\u0099\u0001j\u0003\b\u009a\u0001j\u0003\b\u009b\u0001j\u0003\b\u009c\u0001j\u0003\b\u009d\u0001j\u0003\b\u009e\u0001j\u0003\b\u009f\u0001j\u0003\b \u0001j\u0003\b¡\u0001j\u0003\b¢\u0001j\u0003\b£\u0001j\u0003\b¤\u0001j\u0003\b¥\u0001j\u0003\b¦\u0001j\u0003\b§\u0001j\u0003\b¨\u0001j\u0003\b©\u0001j\u0003\bª\u0001j\u0003\b«\u0001j\u0003\b¬\u0001j\u0003\b\u00ad\u0001j\u0003\b®\u0001j\u0003\b¯\u0001j\u0003\b°\u0001j\u0003\b±\u0001j\u0003\b²\u0001j\u0003\b³\u0001j\u0003\b´\u0001j\u0003\bµ\u0001j\u0003\b¶\u0001j\u0003\b·\u0001j\u0003\b¸\u0001j\u0003\b¹\u0001j\u0003\bº\u0001j\u0003\b»\u0001j\u0003\b¼\u0001j\u0003\b½\u0001j\u0003\b¾\u0001j\u0003\b¿\u0001j\u0003\bÀ\u0001j\u0003\bÁ\u0001j\u0003\bÂ\u0001¨\u0006Ä\u0001"}, d2 = {"Lapp/chalo/constants/Source;", "", "sourceName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getSourceName", "()Ljava/lang/String;", "ACTIVATE_MERGE_FLOW_FRAGMENT", "ACTIVATE_MTICKET_SCREEN", "ACTIVATE_SUPER_PASS_FRAGMENT", "ADJUST", "APP_MIGRATION_PRECONDITION_SCREEN", "BOOKING_SUCCESS_SCREEN", "BLE_COMMUNICATION_FEATURE", "BLE_LOGGING_FEATURE", "BLE_VALIDATION_ACTIVITY", "BLE_VALIDATION_SCREEN", "BOOKING_HELP_SCREEN", "CARD_RECHARGE_ACTIVITY", "CHALO_BUS_ROUTE_INFO_SCREEN", "CHALO_BUS_SCREEN_TAB", "CHALO_CARD_DEEPLINK", "DEEPLINK_HELPER", "CHALO_CARD_EXPERIENCE_ENTRY_SCREEN", "CHALO_CARD_INFO_SCREEN", "CHALO_CARD_LINKING_SCREEN", "CHALO_CARD_RECHARGE_ENTER_AMOUNT_SCREEN", "CHALO_CARD_TRANSACTIONS_SCREEN", "CHALO_ENTER_CARD_DETAILS_SCREEN", "CHALO_PAY_PAGE", "CHALO_TIME_BACKGROUND_SYNC_WORKER", "CHECKOUT_ACTIVITY", "CHECKOUT_PAYMENT_ACTIVITY", "CITY_DATA_BACKGROUND_SYNC_WORKER", "CITY_DATA_SYNC_HELPER", "CITY_DATA_SYNC_WORKER", "CITY_DISCONTINUED_SCREEN", "CITY_SELECTION_FRAGMENT", "CITY_SELECTION_FRAGMENT_SPACED", "CITY_SELECTION_SCREEN", "CONFIRM_BOOKING_SCREEN", "CONFIRM_MPASS_PURCHASE_FRAGMENT", "CONFIRM_SUPER_PASS_PURCHASE_FRAGMENT", "DEEPLINK_PRODUCT", "DRAWER_PASS_TICKET_HISTORY", "DYNAMIC_CITY_DATA_FETCH_ENABLED_USECASE", "ELECTRICITY_BILL_AGENCY", "FARE_DETAILS_FETCH_USECASE", "FAVORITE_LIST_SCREEN", "FETCH_CITY_DATA_CONFIG_USE_CASE", "FETCH_GROUP_TICKET_BOOKING_FARE_DETAILS_USE_CASE", "FETCH_NEARBY_ROUTES_USECASE", "FORCE_APP_UPDATE", "GROUP_TICKET_LEG_SELECTION_SCREEN", "GROUP_TICKET_SUMMARY_SCREEN", "GET_USER_SLOT_DETAILS_FOR_CITY_DATA_SYNC_USE_CASE", "HISTORY_SCREEN", "HOME_SCREEN", "HOME_SCREEN_DRAWER", "HOME_SCREEN_HISTORY_FETCH", "HOME_SCREEN_MAIN_FRAGMENT", "HOME_SCREEN_MAP_FRAGMENT", "HOME_SCREEN_MARKER", "HOME_SCREEN_NEARBY_STOP_CARD", "HOME_SCREEN_PREMIUM_BUS_BUTTON", "HOME_SCREEN_TAB", "INSTANT_TICKET", "INSTANT_TICKET_FARE_DETAILS_FRAGMENT", "INSTANT_TICKET_FRAGMENT", "INSTANT_TICKET_SUMMARY_SCREEN", "LANGUAGE_SELECTION", "LIVE_TRACKING_FRAMEWORK", "LOCATION_DISCLAIMER_ACTIVITY", "LOGIN_OPTIONS_SCREEN", "LOGIN_OTP_SCREEN", "LOGIN_SCREEN", "MIN_PROFILE_UPDATE_SCREEN", "MULTI_PRODUCT_VALIDATION_SCREEN", "MPASS_PURCHASE_ACTIVITY", "MTICKET_BOOKING_SCREEN", "MTICKET_SELECTION_ACTIVITY", "MY_TICKETS_SCREEN_TAB", "NCMC_BALANCE_SCREEN", "NCMC_OFFLINE_BALANCE_RECHARGE_SCREEN", "NCMC_ONLINE_RECHARGE_SCREEN", "NCMC_TAP_SCREEN", "NEARBY_STOPS", "NEARBY_STOPS_CARD", "NEARBY_STOPS_MAP_FRAGMENT", "NEARBY_STOPS_TRIP_CARD_2", "NEARBY_STOP_TRIP_CARD", "NETWORK_CONNECTIVITY_EVENT", "NONE", "NOTIFICATION", "ONBOARDING_LOCATION_SHARING_SCREEN", "ONDC_FARE_DETAILS_SCREEN", "ONDC_QR_SCANNER_FRAGMENT", "PASS_SELECTION_ACTIVITY", "PASS_SUMMARY_SCREEN", "PAY_FOR_TICKET_SCREEN", "PB_BULK_BOOKING_RIDE_DETAILS_SCREEN", "PB_PASS_PURCHASE_LANDING_SCREEN", "PLOTLINE", "PREMIUM_BUS_ALL_ROUTES_SCREEN", "PREMIUM_BUS_CHANGE_STOP_SCREEN", "PREMIUM_BUS_FARE_DETAILS_SCREEN", "PREMIUM_BUS_PRE_BOOKING_DETAILS_SCREEN", "PREMIUM_BUS_PRE_BOOKING_RIDES_CONFIRMATION_SCREEN", "PREMIUM_BUS_PRE_BOOKING_SLOT_SELECTION_SCREEN", "PREMIUM_BUS_PRODUCT_SELECTION_SCREEN", "PREMIUM_BUS_SEAT_SELECTION_SCREEN", "PREMIUM_BUS_SLOT_SELECTION_SCREEN", "PREMIUM_BUS_STOP_SELECTION_SCREEN", "PREMIUM_BUS_TUTORIAL_SCREEN", "PREMIUM_FROM_STOP_SELECTION", "PREMIUM_PRODUCT_BOOKING_MODIFICATION_FRAGMENT", "PREMIUM_RESERVE_TICKET_ACTIVATION_FRAGMENT", "PREMIUM_TO_STOP_SELECTION", "PRODUCT_ACTIVATION_SCREEN", "PRODUCT_BOOKING_SRC", "PRODUCT_BOOKING_SUCCESS_FRAGMENT", "PRODUCT_BOOKING_SUMMARY_FRAGMENT", "PRODUCT_HISTORY_SYNC_USECASE", "PRODUCT_NOTIFICATION_HELPER", "PRODUCT_SELECTION_ACTIVITY", "PRODUCT_SELECTION_RECENT_PRODUCTS", "PROFILE_SCREEN", "QR_VALIDATION_FRAGMENT", "QR_VALIDATION_SCREEN", "QUICKPAY_USECASE", "QUICK_PAY_BOTTOMSHEET_FRAGMENT", "QUICK_PAY_BOTTOM_SHEET", "QUICK_PAY_SUMMARY_SCREEN", "QUICK_PAY_TRIP_AMOUNT_SCREEN", "QUICK_PAY_TRIP_AMOUNT_SCREEN_LEGACY", "REALTIME_SOCKET_MANAGER", "REGULAR_BUS_SCREEN_TAB", "RIDE_RECEIPT_SCREEN", "ROUTE_DETAILS", "ROUTE_SELECTION_FRAGMENT", "SAVED_PLACES_AND_RIDES_SCREEN", "SEARCH_TAB", "SELECT_RIDE_SCREEN", "SHOULD_USE_NEW_HS_USE_CASE", "SIMPLE_QR_VALIDATION_SCREEN", "SLOT_SELECTION_LIST_SCREEN", "SOURCE_BOOKING_SUMMARY_SUPER_PASS_ACTIVITY", "SOURCE_CARD_RECHARGE_CONFIRM_PAYMENT_FRAGMENT", "SOURCE_CONFIRM_SUPER_PASS_PURCHASE_FRAGMENT", "SOURCE_NOTIFICATION", "SOURCE_PUNCH_NOTIFICATION", "SOURCE_SUPER_PASS_SELECTION_ACTIVITY", "SOS_SCREEN", "SPLASH_SCREEN", "STATIC_QR_SCREEN", "STOP_BASED_METRO_LANDING_SCREEN", "STOP_BASED_ROUTE_SEARCH_SCREEN", "STOP_BASED_ROUTE_SELECTION_FRAGMENT", "STOP_TRIP_DETAILS_SCREEN", "SUPER_PASS_BOOKING_SUCCESS_ACTIVITY", "SUPER_PASS_BOOKING_SUCCESS_SCREEN", "SUPER_PASS_PURCHASE_SHARED_COMPONENT", "SUPER_PASS_VERIFICATION_STATUS_SCREEN", "SYNC_CITY_DATA_USECASE", "TAP_IN_DONE_FRAGMENT", "TAP_IN_SCANNER_FRAGMENT", "TAP_OUT_DONE_FRAGMENT", "TAP_OUT_SCANNER_FRAGMENT", "TICKET_SUMMARY_SCREEN", "TITO_RIDE_DETAIL_SCREEN", "TRIP_PLANNER", "TRIP_PLANNER_DETAILS", "TRIP_SCHEDULES_DIRECTION_SCREEN", "UNIVERSAL_SEARCH", "UNKNOWN", "USECASE", "USER_CONSENT", "USER_PROFILE_DETAILS", "USER_PROFILE_EDIT", "USER_PROFILE_FORM", "WALLET_ACCESS_BASE_FRAGMENT", "WALLET_ALL_TRANSACTIONS", "WALLET_LOAD_BALANCE_ENTER_AMOUNT", "WALLET_TRANSACTION_SUMMARY", "WALLET_TRANSACTION_SUMMARY_SCREEN", "WEB_VIEW_SCREEN", "YOUR_PLANS_ADAPTER", "WALLET_BALANCE_COMPONENT", "STOP_BASED_TRIP_PLANNER_SEARCH_SCREEN", "STOP_BASED_TRIP_PLANNER", "FETCH_REMOTE_SEARCH_RESULT_USE_CASE", "SURVEY_SCREEN", "RIDE_HAILING_USER_FEEDBACK_SCREEN", "POST_RIDE_FEEDBACK_SCREEN", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public enum Source {
    ACTIVATE_MERGE_FLOW_FRAGMENT("activateMergeFlowFragment"),
    ACTIVATE_MTICKET_SCREEN("activateMTicketScreen"),
    ACTIVATE_SUPER_PASS_FRAGMENT("activateSuperPassFragment"),
    ADJUST(Constants.LOGTAG),
    APP_MIGRATION_PRECONDITION_SCREEN("appMigrationPreconditionScreen"),
    BOOKING_SUCCESS_SCREEN("bookingSuccessScreen"),
    BLE_COMMUNICATION_FEATURE("bleCommunicationFeature"),
    BLE_LOGGING_FEATURE("bleLoggingFeature"),
    BLE_VALIDATION_ACTIVITY("bleValidationActivity"),
    BLE_VALIDATION_SCREEN("BLEValidationScreen"),
    BOOKING_HELP_SCREEN("bookingHelpScreen"),
    CARD_RECHARGE_ACTIVITY("cardRechargeActivity"),
    CHALO_BUS_ROUTE_INFO_SCREEN("chaloBusRouteInfoScreen"),
    CHALO_BUS_SCREEN_TAB("chaloBusScreenTab"),
    CHALO_CARD_DEEPLINK("chaloCardDeepLinkScreen"),
    DEEPLINK_HELPER("deeplinkHelper"),
    CHALO_CARD_EXPERIENCE_ENTRY_SCREEN("chaloCardExperienceEntryScreen"),
    CHALO_CARD_INFO_SCREEN("chaloCardInfoScreen"),
    CHALO_CARD_LINKING_SCREEN("chaloCardLinkingScreen"),
    CHALO_CARD_RECHARGE_ENTER_AMOUNT_SCREEN("chaloCardRechargeEnterAmountScreen"),
    CHALO_CARD_TRANSACTIONS_SCREEN("chaloCardTransactionsScreen"),
    CHALO_ENTER_CARD_DETAILS_SCREEN("sourceCardDetailsScreen"),
    CHALO_PAY_PAGE("Chalo pay page"),
    CHALO_TIME_BACKGROUND_SYNC_WORKER("chaloTimeBackgroundSyncWorker"),
    CHECKOUT_ACTIVITY("checkoutActivity"),
    CHECKOUT_PAYMENT_ACTIVITY("checkoutPaymentActivity"),
    CITY_DATA_BACKGROUND_SYNC_WORKER("cityDataBackgroundSyncWorker"),
    CITY_DATA_SYNC_HELPER("cityDataSyncHelper"),
    CITY_DATA_SYNC_WORKER("cityDataSyncWorker"),
    CITY_DISCONTINUED_SCREEN("cityDiscontinuedScreen"),
    CITY_SELECTION_FRAGMENT("citySelectionFragment"),
    CITY_SELECTION_FRAGMENT_SPACED("city selection fragment"),
    CITY_SELECTION_SCREEN("citySelectionScreen"),
    CONFIRM_BOOKING_SCREEN("confirmBookingScreen"),
    CONFIRM_MPASS_PURCHASE_FRAGMENT("confirmMPassPurchaseFragment"),
    CONFIRM_SUPER_PASS_PURCHASE_FRAGMENT("ConfirmSuperPassPurchaseFragment"),
    DEEPLINK_PRODUCT("deeplink product"),
    DRAWER_PASS_TICKET_HISTORY("drawerPassTicketHistory"),
    DYNAMIC_CITY_DATA_FETCH_ENABLED_USECASE("dynamicCityDataFetchEnabledUseCase"),
    ELECTRICITY_BILL_AGENCY("best"),
    FARE_DETAILS_FETCH_USECASE("fareDetailsFetchUseCase"),
    FAVORITE_LIST_SCREEN("favoriteListScreen"),
    FETCH_CITY_DATA_CONFIG_USE_CASE("fetchCityDataConfigUseCase"),
    FETCH_GROUP_TICKET_BOOKING_FARE_DETAILS_USE_CASE("fetchGroupTicketBookingFareDetailsUseCase"),
    FETCH_NEARBY_ROUTES_USECASE("FetchNearbyRoutesToLocationUseCase"),
    FORCE_APP_UPDATE("forceAppUpdate"),
    GROUP_TICKET_LEG_SELECTION_SCREEN("groupTicketLegSelectionScreen"),
    GROUP_TICKET_SUMMARY_SCREEN("groupTicketSummaryScreen"),
    GET_USER_SLOT_DETAILS_FOR_CITY_DATA_SYNC_USE_CASE("getUserSlotDetailsForCityDataSyncUseCase"),
    HISTORY_SCREEN("historyScreen"),
    HOME_SCREEN("homeScreen"),
    HOME_SCREEN_DRAWER("home screen drawer"),
    HOME_SCREEN_HISTORY_FETCH("homeScreenHistoryFetch"),
    HOME_SCREEN_MAIN_FRAGMENT("homeScreenMainFragment"),
    HOME_SCREEN_MAP_FRAGMENT("homeScreenMapFragment"),
    HOME_SCREEN_MARKER("homeScreenMarker"),
    HOME_SCREEN_NEARBY_STOP_CARD("Home Screen Nearby Stop Card"),
    HOME_SCREEN_PREMIUM_BUS_BUTTON("homescreenButton"),
    HOME_SCREEN_TAB("homeScreenTab"),
    INSTANT_TICKET("InstantTicket"),
    INSTANT_TICKET_FARE_DETAILS_FRAGMENT("InstantTicketFareDetailsFragment"),
    INSTANT_TICKET_FRAGMENT("InstantTicketFragment"),
    INSTANT_TICKET_SUMMARY_SCREEN("instantTicketSummaryScreen"),
    LANGUAGE_SELECTION("LanguageSelection"),
    LIVE_TRACKING_FRAMEWORK("liveTrackingFramework"),
    LOCATION_DISCLAIMER_ACTIVITY("locationDisclaimerActivity"),
    LOGIN_OPTIONS_SCREEN("loginOptionsScreen"),
    LOGIN_OTP_SCREEN("loginOtpScreen"),
    LOGIN_SCREEN("loginScreen"),
    MIN_PROFILE_UPDATE_SCREEN("minProfileUpdateScreen"),
    MULTI_PRODUCT_VALIDATION_SCREEN("multi product validation"),
    MPASS_PURCHASE_ACTIVITY("mPassPurchaseActivity"),
    MTICKET_BOOKING_SCREEN("mticket booking screen"),
    MTICKET_SELECTION_ACTIVITY("mticketSelectionActivity"),
    MY_TICKETS_SCREEN_TAB("myTicketsScreenTab"),
    NCMC_BALANCE_SCREEN("ncmcBalanceScreen"),
    NCMC_OFFLINE_BALANCE_RECHARGE_SCREEN("ncmcOfflineBalanceRechargeScreen"),
    NCMC_ONLINE_RECHARGE_SCREEN("ncmcOnlineRechargeScreen"),
    NCMC_TAP_SCREEN("ncmcTapScreen"),
    NEARBY_STOPS("nearby stops"),
    NEARBY_STOPS_CARD("Nearby Stops Card"),
    NEARBY_STOPS_MAP_FRAGMENT("nearbyStopsMapFragment"),
    NEARBY_STOPS_TRIP_CARD_2("Nearby Stops Trip Card"),
    NEARBY_STOP_TRIP_CARD("Nearby stop trip card"),
    NETWORK_CONNECTIVITY_EVENT("networkConnectivityEvent"),
    NONE(""),
    NOTIFICATION("notification"),
    ONBOARDING_LOCATION_SHARING_SCREEN("onboardingLocationSharingScreen"),
    ONDC_FARE_DETAILS_SCREEN("ondcFareDetailsScreen"),
    ONDC_QR_SCANNER_FRAGMENT("ondcQRScannerFragment"),
    PASS_SELECTION_ACTIVITY("passSelectionActivity"),
    PASS_SUMMARY_SCREEN("passSummaryScreen"),
    PAY_FOR_TICKET_SCREEN("pay for ticket screen"),
    PB_BULK_BOOKING_RIDE_DETAILS_SCREEN("PbBulkBookingRideDetailsScreen"),
    PB_PASS_PURCHASE_LANDING_SCREEN("PbPassPurchaseLandingScreen"),
    PLOTLINE("Plotline"),
    PREMIUM_BUS_ALL_ROUTES_SCREEN("premiumBusAllRoutesScreen"),
    PREMIUM_BUS_CHANGE_STOP_SCREEN("premiumBusChangeStopScreen"),
    PREMIUM_BUS_FARE_DETAILS_SCREEN("premiumBusFareDetailsScreen"),
    PREMIUM_BUS_PRE_BOOKING_DETAILS_SCREEN("premiumBusPreBookingDetailsScreen"),
    PREMIUM_BUS_PRE_BOOKING_RIDES_CONFIRMATION_SCREEN("premiumBusPreBookingRidesConfirmationScreen"),
    PREMIUM_BUS_PRE_BOOKING_SLOT_SELECTION_SCREEN("premiumBusPreBookingSlotSelectionScreen"),
    PREMIUM_BUS_PRODUCT_SELECTION_SCREEN("premiumBusProductSelectionScreen"),
    PREMIUM_BUS_SEAT_SELECTION_SCREEN("premiumBusSeatSelectionScreen"),
    PREMIUM_BUS_SLOT_SELECTION_SCREEN("premiumBusSlotSelectionScreen"),
    PREMIUM_BUS_STOP_SELECTION_SCREEN("premiumBusStopSelectionScreen"),
    PREMIUM_BUS_TUTORIAL_SCREEN("premiumBusTutorialScreen"),
    PREMIUM_FROM_STOP_SELECTION("premiumFromStopSelection"),
    PREMIUM_PRODUCT_BOOKING_MODIFICATION_FRAGMENT("PremiumProductBookingModificationFragment"),
    PREMIUM_RESERVE_TICKET_ACTIVATION_FRAGMENT("PremiumBusReserveTicketActivationFragment"),
    PREMIUM_TO_STOP_SELECTION("premiumToStopSelection"),
    PRODUCT_ACTIVATION_SCREEN("productActivationScreen"),
    PRODUCT_BOOKING_SRC("productBooking"),
    PRODUCT_BOOKING_SUCCESS_FRAGMENT("ProductBookingSuccessFragment"),
    PRODUCT_BOOKING_SUMMARY_FRAGMENT("ProductBookingSummaryFragment"),
    PRODUCT_HISTORY_SYNC_USECASE("productHistorySyncUseCase"),
    PRODUCT_NOTIFICATION_HELPER("ProductNotificationHelper"),
    PRODUCT_SELECTION_ACTIVITY("productSelectionActivity"),
    PRODUCT_SELECTION_RECENT_PRODUCTS("product_selection_recent_products"),
    PROFILE_SCREEN("profileScreen"),
    QR_VALIDATION_FRAGMENT("qr validation fragment"),
    QR_VALIDATION_SCREEN("QRValidationScreen"),
    QUICKPAY_USECASE("QuickpayUseCase"),
    QUICK_PAY_BOTTOMSHEET_FRAGMENT("QuickpayBottomSheetFragment"),
    QUICK_PAY_BOTTOM_SHEET("quickPayBottomSheet"),
    QUICK_PAY_SUMMARY_SCREEN("quickPaySummaryScreen"),
    QUICK_PAY_TRIP_AMOUNT_SCREEN("quickPayTripAmountScreen"),
    QUICK_PAY_TRIP_AMOUNT_SCREEN_LEGACY("quick pay trip amount screen"),
    REALTIME_SOCKET_MANAGER("realtimeSocketManager"),
    REGULAR_BUS_SCREEN_TAB("regularBusScreenTab"),
    RIDE_RECEIPT_SCREEN("rideReceiptScreen"),
    ROUTE_DETAILS("route details"),
    ROUTE_SELECTION_FRAGMENT("routeSelectionFragment"),
    SAVED_PLACES_AND_RIDES_SCREEN("savedPlacesAndRidesScreen"),
    SEARCH_TAB("searchTab"),
    SELECT_RIDE_SCREEN("selectRideScreen"),
    SHOULD_USE_NEW_HS_USE_CASE("ShouldUseNewHsUseCase"),
    SIMPLE_QR_VALIDATION_SCREEN("simple qr validation screen"),
    SLOT_SELECTION_LIST_SCREEN("slotSelectionListScreen"),
    SOURCE_BOOKING_SUMMARY_SUPER_PASS_ACTIVITY("sourceBookingSummarySuperPassActivity"),
    SOURCE_CARD_RECHARGE_CONFIRM_PAYMENT_FRAGMENT("sourceCardRechargeConfirmPaymentScreen"),
    SOURCE_CONFIRM_SUPER_PASS_PURCHASE_FRAGMENT("sourceSuperPassPurchaseFragment"),
    SOURCE_NOTIFICATION("sourceNotification"),
    SOURCE_PUNCH_NOTIFICATION("punch notification"),
    SOURCE_SUPER_PASS_SELECTION_ACTIVITY("sourceSuperPassSelectionActivity"),
    SOS_SCREEN("sosScreen"),
    SPLASH_SCREEN("splashScreen"),
    STATIC_QR_SCREEN("staticQrScreen"),
    STOP_BASED_METRO_LANDING_SCREEN("stopBasedMetroLandingScreen"),
    STOP_BASED_ROUTE_SEARCH_SCREEN("stopBasedRouteSearchScreen"),
    STOP_BASED_ROUTE_SELECTION_FRAGMENT("stopBasedRouteSelectionFragment"),
    STOP_TRIP_DETAILS_SCREEN("Stop Details Screen"),
    SUPER_PASS_BOOKING_SUCCESS_ACTIVITY("sourceSuperPassBookingSuccessActivity"),
    SUPER_PASS_BOOKING_SUCCESS_SCREEN("superPassBookingSuccessScreen"),
    SUPER_PASS_PURCHASE_SHARED_COMPONENT("superPassPurchaseSharedComponent"),
    SUPER_PASS_VERIFICATION_STATUS_SCREEN("superPassVerificationStatusScreen"),
    SYNC_CITY_DATA_USECASE("syncCityDataUseCase"),
    TAP_IN_DONE_FRAGMENT("tapInDoneFragment"),
    TAP_IN_SCANNER_FRAGMENT("tapInScannerFragment"),
    TAP_OUT_DONE_FRAGMENT("tapOutDoneFragment"),
    TAP_OUT_SCANNER_FRAGMENT("tapOutScannerFragment"),
    TICKET_SUMMARY_SCREEN("ticketSummaryScreen"),
    TITO_RIDE_DETAIL_SCREEN("TITORideDetailsFragment"),
    TRIP_PLANNER("tripPlanner"),
    TRIP_PLANNER_DETAILS("tripPlannerDetails"),
    TRIP_SCHEDULES_DIRECTION_SCREEN("tripSchedulesDirectionScreen"),
    UNIVERSAL_SEARCH("UNIVERSAL_SEARCH"),
    UNKNOWN("unknown"),
    USECASE("usecase"),
    USER_CONSENT("userConsentScreen"),
    USER_PROFILE_DETAILS("userProfileDetails"),
    USER_PROFILE_EDIT("userProfileEdit"),
    USER_PROFILE_FORM("userProfileForm"),
    WALLET_ACCESS_BASE_FRAGMENT("WalletAccessBaseFragment"),
    WALLET_ALL_TRANSACTIONS("walletAllTransactions"),
    WALLET_LOAD_BALANCE_ENTER_AMOUNT("walletLoadBalanceEnterAmount"),
    WALLET_TRANSACTION_SUMMARY("walletTransactionSummary"),
    WALLET_TRANSACTION_SUMMARY_SCREEN("walletTransactionSummaryScreen"),
    WEB_VIEW_SCREEN("webViewScreen"),
    YOUR_PLANS_ADAPTER("yourPlansAdapter"),
    WALLET_BALANCE_COMPONENT("WalletBalanceComponent"),
    STOP_BASED_TRIP_PLANNER_SEARCH_SCREEN("stopBasedTripPlannerSearchScreen"),
    STOP_BASED_TRIP_PLANNER("stopBased_TripPlanner"),
    FETCH_REMOTE_SEARCH_RESULT_USE_CASE("fetchRemoteSearchResultUseCase"),
    SURVEY_SCREEN("surveyScreen"),
    RIDE_HAILING_USER_FEEDBACK_SCREEN("rideHailingUserFeedbackScreen"),
    POST_RIDE_FEEDBACK_SCREEN("postRideFeedbackScreen");

    private final String sourceName;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ra1(2));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/constants/Source$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/constants/Source;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<Source> serializer() {
            return (KSerializer) Source.$cachedSerializer$delegate.getValue();
        }
    }

    Source(String str) {
        this.sourceName = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.b("app.chalo.constants.Source", values());
    }

    public static EnumEntries<Source> getEntries() {
        return $ENTRIES;
    }

    public final String getSourceName() {
        return this.sourceName;
    }
}
