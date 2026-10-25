package defpackage;

import android.graphics.Bitmap;
import android.nfc.NfcManager;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider;
import androidx.compose.material.ripple.AndroidRippleIndicationInstance;
import androidx.compose.material.ripple.AndroidRippleNode;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.text.AnnotatedString;
import app.cash.sqldelight.ColumnAdapter;
import app.cash.sqldelight.EnumColumnAdapter;
import app.cash.sqldelight.driver.android.AndroidSqliteDriver;
import app.chalo.analytics.sender.AndroidMixpanelAnalyticsSender;
import app.chalo.android.AndroidDependencyFactory;
import app.chalo.android.ChaloApplication;
import app.chalo.appsupport.uistate.BookingHelpScreenViewState;
import app.chalo.appsupport.uistate.FaqItemUiState;
import app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent;
import app.chalo.citydata.repository.local.room.RouteEntityColumnAdapters;
import app.chalo.compose.webview.CWebChromeClient;
import app.chalo.compose.webview.CWebViewClient;
import app.chalo.core.Instant_ticket_receipt_table;
import app.chalo.core.Instant_ticket_table;
import app.chalo.core.Last_ride_info_table;
import app.chalo.core.Magic_super_pass_table;
import app.chalo.core.Metro_ticket_table;
import app.chalo.core.Multi_modal_group_ticket_table;
import app.chalo.core.Ondc_metro_ticket_table;
import app.chalo.core.Ondc_ticket_receipt_table;
import app.chalo.core.Ondc_ticket_table;
import app.chalo.core.Pending_super_pass_table;
import app.chalo.core.Premium_reserve_ticket_ack_table;
import app.chalo.core.Premium_reserve_ticket_receipt_table;
import app.chalo.core.Premium_reserve_ticket_table;
import app.chalo.core.Premium_reserve_trip_table;
import app.chalo.core.Recent_location_pair_table;
import app.chalo.core.Recent_place_table;
import app.chalo.core.Recent_route_table;
import app.chalo.core.Recent_stop_and_route_based_trip_table;
import app.chalo.core.Recent_stop_based_trip_table;
import app.chalo.core.Recent_stop_table;
import app.chalo.core.Recent_trip_table;
import app.chalo.core.Ride_based_super_pass_ride_details_table;
import app.chalo.core.Ride_based_super_pass_table;
import app.chalo.core.Ride_booking_user_feedback_table;
import app.chalo.core.Routes_table;
import app.chalo.core.Super_pass_application_table;
import app.chalo.core.Super_pass_bookings_table;
import app.chalo.core.Super_pass_trip_receipt_table;
import app.chalo.core.Ticket;
import app.chalo.core.Tito_validation_table;
import app.chalo.core.app_db;
import app.chalo.core.core.App_dbImplKt;
import app.chalo.core.database.AppDatabase;
import app.chalo.core.database.columnadapters.CommonColumnAdapters;
import app.chalo.core.database.columnadapters.RefundInfoColumnAdapter;
import app.chalo.core.database.tableadapters.InstantTicketReceiptTableAdapter;
import app.chalo.core.database.tableadapters.InstantTicketReceiptTableAdapter$receiptFareBreakupAdapter$2$1;
import app.chalo.core.database.tableadapters.InstantTicketTableAdapter;
import app.chalo.core.database.tableadapters.InstantTicketTableAdapter$instantTicketPassengerDetailsAdapter$2$1;
import app.chalo.core.database.tableadapters.LastRideInfoTableAdapter;
import app.chalo.core.database.tableadapters.LastRideInfoTableAdapter$lastRideInfoAdapter$2$1;
import app.chalo.core.database.tableadapters.MetroTicketTableAdapter;
import app.chalo.core.database.tableadapters.MetroTicketTableAdapter$stopDetailsAdapter$2$1;
import app.chalo.core.database.tableadapters.MetroTicketTableAdapter$validationInfoEntityListAdapter$2$1;
import app.chalo.core.database.tableadapters.MultiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$1;
import app.chalo.core.database.tableadapters.MultiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$2;
import app.chalo.core.database.tableadapters.MultiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$3;
import app.chalo.core.database.tableadapters.MultiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$4;
import app.chalo.core.database.tableadapters.MultiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$5;
import app.chalo.core.database.tableadapters.OndcMetroTicketTableAdapter;
import app.chalo.core.database.tableadapters.OndcMetroTicketTableAdapter$journeyOverviewAdapter$2$1;
import app.chalo.core.database.tableadapters.OndcMetroTicketTableAdapter$validationInfoEntityListAdapter$2$1;
import app.chalo.core.database.tableadapters.OndcTicketTableAdapter;
import app.chalo.core.database.tableadapters.OndcTicketTableAdapter$fareBreakupAdapter$2$1;
import app.chalo.core.database.tableadapters.OndcTicketTableAdapter$validationInfoEntityListAdapter$2$1;
import app.chalo.core.database.tableadapters.PremiumReserveTicketTableAdapter;
import app.chalo.core.database.tableadapters.PremiumReserveTicketTableAdapter$firstBookingAdapter$2$1;
import app.chalo.core.database.tableadapters.PremiumReserveTicketTableAdapter$passengerCategoryListColumnAdapter$2$1;
import app.chalo.core.database.tableadapters.PremiumReserveTicketTableAdapter$premiumStopDetailsColumnAdapter$2$1;
import app.chalo.core.database.tableadapters.PremiumReserveTicketTableAdapter$refundInfoAdapter$2$1;
import app.chalo.core.database.tableadapters.PremiumReserveTicketTableAdapter$seatInfoAdapter$2$1;
import app.chalo.core.database.tableadapters.RecentLocationPairEndpointAdapter;
import app.chalo.core.database.tableadapters.RecentLocationPairEndpointAdapter$endPointColumnAdapter$2$1;
import app.chalo.core.database.tableadapters.SuperPassRideBookingAdapter$get$1;
import app.chalo.core.database.tableadapters.SuperPassTableAdapters;
import app.chalo.core.database.tableadapters.SuperPassTableAdapters$fareBreakupListAdapter$2$1;
import app.chalo.core.database.tableadapters.SuperPassTableAdapters$passApplicationActionRequiredAdapter$2$1;
import app.chalo.core.database.tableadapters.SuperPassTableAdapters$premiumBusMetaAdapter$2$1;
import app.chalo.core.database.tableadapters.SuperPassTableAdapters$profileRejectionReasonListAdapter$2$1;
import app.chalo.core.database.tableadapters.SuperPassTableAdapters$proofRejectionReasonListAdapter$2$1;
import app.chalo.core.database.tableadapters.SuperPassTableAdapters$proofsMapAdapter$2$1;
import app.chalo.core.database.tableadapters.SuperPassTableAdapters$serviceTypeListAdapter$2$1;
import app.chalo.core.database.tableadapters.TicketTableAdapter;
import app.chalo.core.database.tableadapters.TicketTableAdapter$mTicketConfigurationAdapter$2$1;
import app.chalo.core.database.tableadapters.TicketTableAdapter$mticketTripReceiptAdapter$2$1;
import app.chalo.core.database.tableadapters.TicketTableAdapter$passengerDetailsAdapter$2$1;
import app.chalo.core.database.tableadapters.TicketTableAdapter$routeStopsInfoAdapter$2$1;
import app.chalo.core.database.tableadapters.TicketTableAdapter$userProfileAdapter$2$1;
import app.chalo.features.nfc.BasicNFCManagerAndroid;
import app.chalo.features.productsync.constants.SuperPassApplicationStatus;
import app.chalo.features.productsync.constants.SuperPassStatus;
import app.chalo.home.manager.AppRatingProcessSkeletonImpl;
import app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteCorridorUIState;
import app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoTabUIState;
import app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteSuggestionCardUiState;
import app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteSuggestionFieldUiState;
import app.chalo.home.ui.history.uistate.chalobusticket.ProductFooterContainerUiState;
import app.chalo.home.ui.history.uistate.regularbusticket.ProductBannerUiState;
import app.chalo.instantticket.data.model.InstantTicketStatus;
import app.chalo.login.phonenumberhint.AndroidPhoneNumberHintHandler;
import app.chalo.login.smsautoread.AndroidSmsAutoReader;
import app.chalo.metro.data.app.MetroTicketStatus;
import app.chalo.multimodalticket.data.model.MultiModalGroupTicketStatus;
import app.chalo.ncmc.ui.transactionhistory.CardTransactionHistoryComponent;
import app.chalo.ncmc.ui.transactionhistory.CardTransactionHistoryViewState;
import app.chalo.ondc.model.app.OndcMetroTicketStatus;
import app.chalo.ondc.model.app.OndcTicketStatus;
import app.chalo.premiumbus.data.models.app.PassTierType;
import app.chalo.premiumbus.data.models.app.PremiumBusTripStatus;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketAckType;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.recent.database.RecentCityItineraryColumnAdapters;
import app.chalo.recent.database.entities.RecentsSpecialEntityStatus;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.superpass.data.models.entities.SuperPassSubType;
import app.chalo.titoridedetail.data.app.TITOProductSubType;
import app.chalo.titoridedetail.data.app.TITOProductType;
import app.chalo.titoridedetail.data.app.TitoValidationStatus;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.bottomsheet.BottomSheetUiState;
import app.chalo.uistate.textField.BaseTextFieldUIState$ClickableTextFieldUIState$eventHandler$2$1;
import app.chalo.userprofile.Gender;
import app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponent;
import app.chalo.validationsdk.blevalidation.ui.BleValidationIntent;
import coil3.decode.BitmapFactoryDecoder;
import com.google.android.gms.auth.api.identity.Identity;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.mixpanel.android.mpmetrics.MixpanelAPI;
import io.github.alexzhirkevich.compottie.internal.animation.AnimatedGradient;
import io.github.alexzhirkevich.compottie.internal.helpers.ColorsWithStops;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class i4 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15879a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i4(Object obj, int i) {
        this.f15879a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f15879a;
        Unit unit = Unit.f17538a;
        Object obj = this.b;
        switch (i) {
            case 0:
                AndroidMixpanelAnalyticsSender androidMixpanelAnalyticsSender = (AndroidMixpanelAnalyticsSender) obj;
                return MixpanelAPI.f(androidMixpanelAnalyticsSender.f879a, androidMixpanelAnalyticsSender.b.b);
            case 1:
                return Identity.getSignInClient(((AndroidPhoneNumberHintHandler) obj).f5281a);
            case 2:
                return AndroidRippleIndicationInstance.onInvalidateRipple$lambda$0((AndroidRippleIndicationInstance) obj);
            case 3:
                return AndroidRippleNode.addRipple_12SF9DM$lambda$4$lambda$3$lambda$2((AndroidRippleNode) obj);
            case 4:
                return SmsRetriever.getClient(((AndroidSmsAutoReader) obj).f5286a);
            case 5:
                return ((TextContextMenuDataProvider) obj).data();
            case 6:
                return new ColorsWithStops(((AnimatedGradient) obj).d);
            case 7:
                AndroidSqliteDriver androidSqliteDriverA = ((AppDatabase) obj).a();
                Routes_table.Adapter adapter = new Routes_table.Adapter(CommonColumnAdapters.b(), (ColumnAdapter) RouteEntityColumnAdapters.f1780a.getValue(), (ColumnAdapter) RouteEntityColumnAdapters.b.getValue(), new EnumColumnAdapter(RouteNamingSchemeType.values()));
                Recent_route_table.Adapter adapter2 = new Recent_route_table.Adapter(CommonColumnAdapters.b(), new EnumColumnAdapter(ChaloTransitMode.values()), new EnumColumnAdapter(RecentsSpecialEntityStatus.values()), new EnumColumnAdapter(RouteNamingSchemeType.values()));
                Lazy lazy = RecentCityItineraryColumnAdapters.f8928a;
                Recent_stop_based_trip_table.Adapter adapter3 = new Recent_stop_based_trip_table.Adapter((ColumnAdapter) lazy.getValue(), (ColumnAdapter) lazy.getValue(), new EnumColumnAdapter(ChaloTransitMode.values()));
                Recent_stop_and_route_based_trip_table.Adapter adapter4 = new Recent_stop_and_route_based_trip_table.Adapter((ColumnAdapter) RecentCityItineraryColumnAdapters.c.getValue(), (ColumnAdapter) lazy.getValue(), (ColumnAdapter) lazy.getValue(), new EnumColumnAdapter(ChaloTransitMode.values()));
                Recent_place_table.Adapter adapter5 = new Recent_place_table.Adapter((ColumnAdapter) CommonColumnAdapters.b.getValue(), new EnumColumnAdapter(RecentsSpecialEntityStatus.values()));
                Recent_stop_table.Adapter adapter6 = new Recent_stop_table.Adapter((ColumnAdapter) lazy.getValue(), new EnumColumnAdapter(RecentsSpecialEntityStatus.values()));
                Lazy lazy2 = RecentCityItineraryColumnAdapters.b;
                Recent_trip_table.Adapter adapter7 = new Recent_trip_table.Adapter((ColumnAdapter) lazy2.getValue(), (ColumnAdapter) lazy2.getValue(), new EnumColumnAdapter(ChaloTransitMode.values()));
                Premium_reserve_ticket_ack_table.Adapter adapter8 = new Premium_reserve_ticket_ack_table.Adapter(new EnumColumnAdapter(PremiumReserveTicketAckType.values()));
                Premium_reserve_ticket_receipt_table.Adapter adapter9 = new Premium_reserve_ticket_receipt_table.Adapter(CommonColumnAdapters.a(), RefundInfoColumnAdapter.a());
                Premium_reserve_trip_table.Adapter adapter10 = new Premium_reserve_trip_table.Adapter(new EnumColumnAdapter(PremiumBusTripStatus.values()));
                Lazy lazy3 = PremiumReserveTicketTableAdapter.f2121a;
                EnumColumnAdapter enumColumnAdapter = new EnumColumnAdapter(PremiumReserveTicketStatus.values());
                Lazy lazy4 = PremiumReserveTicketTableAdapter.f2121a;
                Premium_reserve_ticket_table.Adapter adapter11 = new Premium_reserve_ticket_table.Adapter(enumColumnAdapter, (PremiumReserveTicketTableAdapter$premiumStopDetailsColumnAdapter$2$1) lazy4.getValue(), (PremiumReserveTicketTableAdapter$premiumStopDetailsColumnAdapter$2$1) lazy4.getValue(), (PremiumReserveTicketTableAdapter$passengerCategoryListColumnAdapter$2$1) PremiumReserveTicketTableAdapter.b.getValue(), (PremiumReserveTicketTableAdapter$firstBookingAdapter$2$1) PremiumReserveTicketTableAdapter.d.getValue(), new EnumColumnAdapter(PremiumReserveTicketStatus.values()), (PremiumReserveTicketTableAdapter$refundInfoAdapter$2$1) PremiumReserveTicketTableAdapter.c.getValue(), (PremiumReserveTicketTableAdapter$seatInfoAdapter$2$1) PremiumReserveTicketTableAdapter.e.getValue());
                Lazy lazy5 = SuperPassTableAdapters.f2123a;
                EnumColumnAdapter enumColumnAdapter2 = new EnumColumnAdapter(SuperPassSubType.values());
                EnumColumnAdapter enumColumnAdapter3 = new EnumColumnAdapter(SuperPassStatus.values());
                Lazy lazy6 = SuperPassTableAdapters.f2123a;
                SuperPassTableAdapters$serviceTypeListAdapter$2$1 superPassTableAdapters$serviceTypeListAdapter$2$1 = (SuperPassTableAdapters$serviceTypeListAdapter$2$1) lazy6.getValue();
                ColumnAdapter columnAdapterB = CommonColumnAdapters.b();
                Lazy lazy7 = SuperPassTableAdapters.b;
                SuperPassTableAdapters$proofsMapAdapter$2$1 superPassTableAdapters$proofsMapAdapter$2$1 = (SuperPassTableAdapters$proofsMapAdapter$2$1) lazy7.getValue();
                EnumColumnAdapter enumColumnAdapter4 = new EnumColumnAdapter(Gender.values());
                Lazy lazy8 = SuperPassTableAdapters.c;
                SuperPassTableAdapters$fareBreakupListAdapter$2$1 superPassTableAdapters$fareBreakupListAdapter$2$1 = (SuperPassTableAdapters$fareBreakupListAdapter$2$1) lazy8.getValue();
                ColumnAdapter columnAdapterA = RefundInfoColumnAdapter.a();
                EnumColumnAdapter enumColumnAdapter5 = new EnumColumnAdapter(PassTierType.values());
                Lazy lazy9 = SuperPassTableAdapters.g;
                Magic_super_pass_table.Adapter adapter12 = new Magic_super_pass_table.Adapter(enumColumnAdapter2, enumColumnAdapter3, superPassTableAdapters$serviceTypeListAdapter$2$1, columnAdapterB, superPassTableAdapters$proofsMapAdapter$2$1, enumColumnAdapter4, superPassTableAdapters$fareBreakupListAdapter$2$1, columnAdapterA, enumColumnAdapter5, (SuperPassTableAdapters$premiumBusMetaAdapter$2$1) lazy9.getValue());
                Lazy lazy10 = CommonColumnAdapters.d;
                Ride_based_super_pass_ride_details_table.Adapter adapter13 = new Ride_based_super_pass_ride_details_table.Adapter((ColumnAdapter) lazy10.getValue());
                Pending_super_pass_table.Adapter adapter14 = new Pending_super_pass_table.Adapter(new EnumColumnAdapter(SuperPassStatus.values()), new EnumColumnAdapter(SuperPassSubType.values()), CommonColumnAdapters.b(), (SuperPassTableAdapters$proofsMapAdapter$2$1) lazy7.getValue(), new EnumColumnAdapter(Gender.values()), (SuperPassTableAdapters$fareBreakupListAdapter$2$1) lazy8.getValue(), RefundInfoColumnAdapter.a());
                Super_pass_application_table.Adapter adapter15 = new Super_pass_application_table.Adapter(new EnumColumnAdapter(SuperPassApplicationStatus.values()), (SuperPassTableAdapters$proofsMapAdapter$2$1) lazy7.getValue(), (SuperPassTableAdapters$passApplicationActionRequiredAdapter$2$1) SuperPassTableAdapters.f.getValue(), new EnumColumnAdapter(Gender.values()), (SuperPassTableAdapters$proofRejectionReasonListAdapter$2$1) SuperPassTableAdapters.d.getValue(), (SuperPassTableAdapters$profileRejectionReasonListAdapter$2$1) SuperPassTableAdapters.e.getValue(), CommonColumnAdapters.b(), RefundInfoColumnAdapter.a());
                Ride_based_super_pass_table.Adapter adapter16 = new Ride_based_super_pass_table.Adapter(new EnumColumnAdapter(SuperPassStatus.values()), (ColumnAdapter) lazy10.getValue(), (SuperPassTableAdapters$serviceTypeListAdapter$2$1) lazy6.getValue(), CommonColumnAdapters.b(), (SuperPassTableAdapters$proofsMapAdapter$2$1) lazy7.getValue(), new EnumColumnAdapter(Gender.values()), (SuperPassTableAdapters$fareBreakupListAdapter$2$1) lazy8.getValue(), new EnumColumnAdapter(SuperPassSubType.values()), RefundInfoColumnAdapter.a(), new EnumColumnAdapter(PassTierType.values()), (SuperPassTableAdapters$premiumBusMetaAdapter$2$1) lazy9.getValue());
                Lazy lazy11 = InstantTicketReceiptTableAdapter.f2115a;
                Instant_ticket_receipt_table.Adapter adapter17 = new Instant_ticket_receipt_table.Adapter(CommonColumnAdapters.a(), new EnumColumnAdapter(RouteNamingSchemeType.values()), (InstantTicketReceiptTableAdapter$receiptFareBreakupAdapter$2$1) InstantTicketReceiptTableAdapter.f2115a.getValue());
                Lazy lazy12 = InstantTicketTableAdapter.f2116a;
                Instant_ticket_table.Adapter adapter18 = new Instant_ticket_table.Adapter(new EnumColumnAdapter(InstantTicketStatus.values()), (InstantTicketTableAdapter$instantTicketPassengerDetailsAdapter$2$1) InstantTicketTableAdapter.f2116a.getValue(), RefundInfoColumnAdapter.a());
                Tito_validation_table.Adapter adapter19 = new Tito_validation_table.Adapter(new EnumColumnAdapter(TitoValidationStatus.values()), new EnumColumnAdapter(TITOProductType.values()), new EnumColumnAdapter(TITOProductSubType.values()));
                Lazy lazy13 = OndcTicketTableAdapter.f2120a;
                ColumnAdapter columnAdapterA2 = CommonColumnAdapters.a();
                EnumColumnAdapter enumColumnAdapter6 = new EnumColumnAdapter(OndcTicketStatus.values());
                Lazy lazy14 = RefundInfoColumnAdapter.b;
                Ondc_ticket_table.Adapter adapter20 = new Ondc_ticket_table.Adapter(enumColumnAdapter6, columnAdapterA2, (ColumnAdapter) lazy14.getValue(), (OndcTicketTableAdapter$fareBreakupAdapter$2$1) OndcTicketTableAdapter.f2120a.getValue(), (OndcTicketTableAdapter$validationInfoEntityListAdapter$2$1) OndcTicketTableAdapter.b.getValue());
                Ondc_ticket_receipt_table.Adapter adapter21 = new Ondc_ticket_receipt_table.Adapter(CommonColumnAdapters.a());
                Super_pass_trip_receipt_table.Adapter adapter22 = new Super_pass_trip_receipt_table.Adapter(CommonColumnAdapters.b(), new EnumColumnAdapter(RouteNamingSchemeType.values()));
                Super_pass_bookings_table.Adapter adapter23 = new Super_pass_bookings_table.Adapter(new EnumColumnAdapter(RouteNamingSchemeType.values()), CommonColumnAdapters.b(), new SuperPassRideBookingAdapter$get$1());
                Lazy lazy15 = OndcMetroTicketTableAdapter.f2119a;
                ColumnAdapter columnAdapterA3 = CommonColumnAdapters.a();
                Ondc_metro_ticket_table.Adapter adapter24 = new Ondc_metro_ticket_table.Adapter(new EnumColumnAdapter(OndcMetroTicketStatus.values()), (OndcMetroTicketTableAdapter$validationInfoEntityListAdapter$2$1) OndcMetroTicketTableAdapter.f2119a.getValue(), columnAdapterA3, (ColumnAdapter) lazy14.getValue(), (OndcMetroTicketTableAdapter$journeyOverviewAdapter$2$1) OndcMetroTicketTableAdapter.b.getValue(), (ColumnAdapter) CommonColumnAdapters.e.getValue());
                Lazy lazy16 = MetroTicketTableAdapter.f2118a;
                ColumnAdapter columnAdapterA4 = CommonColumnAdapters.a();
                EnumColumnAdapter enumColumnAdapter7 = new EnumColumnAdapter(MetroTicketStatus.values());
                ColumnAdapter columnAdapter = (ColumnAdapter) lazy14.getValue();
                MetroTicketTableAdapter$validationInfoEntityListAdapter$2$1 metroTicketTableAdapter$validationInfoEntityListAdapter$2$1 = (MetroTicketTableAdapter$validationInfoEntityListAdapter$2$1) MetroTicketTableAdapter.f2118a.getValue();
                Lazy lazy17 = MetroTicketTableAdapter.b;
                Metro_ticket_table.Adapter adapter25 = new Metro_ticket_table.Adapter(enumColumnAdapter7, metroTicketTableAdapter$validationInfoEntityListAdapter$2$1, columnAdapterA4, (MetroTicketTableAdapter$stopDetailsAdapter$2$1) lazy17.getValue(), (MetroTicketTableAdapter$stopDetailsAdapter$2$1) lazy17.getValue(), columnAdapter);
                Multi_modal_group_ticket_table.Adapter adapter26 = new Multi_modal_group_ticket_table.Adapter(new EnumColumnAdapter(MultiModalGroupTicketStatus.values()), new MultiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$1(), new MultiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$2(), new MultiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$3(), RefundInfoColumnAdapter.a(), new MultiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$4(), new MultiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$5());
                Lazy lazy18 = RecentLocationPairEndpointAdapter.f2122a;
                Recent_location_pair_table.Adapter adapter27 = new Recent_location_pair_table.Adapter((RecentLocationPairEndpointAdapter$endPointColumnAdapter$2$1) lazy18.getValue(), (RecentLocationPairEndpointAdapter$endPointColumnAdapter$2$1) lazy18.getValue());
                Lazy lazy19 = TicketTableAdapter.f2124a;
                return App_dbImplKt.a(Reflection.a(app_db.class), androidSqliteDriverA, new Ticket.Adapter((TicketTableAdapter$routeStopsInfoAdapter$2$1) lazy19.getValue(), (TicketTableAdapter$routeStopsInfoAdapter$2$1) lazy19.getValue(), (TicketTableAdapter$passengerDetailsAdapter$2$1) TicketTableAdapter.b.getValue(), (TicketTableAdapter$userProfileAdapter$2$1) TicketTableAdapter.c.getValue(), (TicketTableAdapter$mTicketConfigurationAdapter$2$1) TicketTableAdapter.d.getValue(), (TicketTableAdapter$mticketTripReceiptAdapter$2$1) TicketTableAdapter.e.getValue()), adapter17, adapter18, new Last_ride_info_table.Adapter((LastRideInfoTableAdapter$lastRideInfoAdapter$2$1) LastRideInfoTableAdapter.f2117a.getValue()), adapter12, adapter25, adapter26, adapter24, adapter21, adapter20, adapter14, adapter8, adapter9, adapter11, adapter10, adapter27, adapter5, adapter2, adapter4, adapter3, adapter6, adapter7, adapter13, adapter16, new Ride_booking_user_feedback_table.Adapter(CommonColumnAdapters.b()), adapter, adapter15, adapter23, adapter22, adapter19);
            case 8:
                return ((AppRatingProcessSkeletonImpl) obj).f3110a.b();
            case 9:
                return ArrayIteratorKt.a((Object[]) obj);
            case 10:
                return new BaseTextFieldUIState$ClickableTextFieldUIState$eventHandler$2$1();
            case 11:
                Object systemService = ((BasicNFCManagerAndroid) obj).f2733a.getSystemService("nfc");
                Intrinsics.g(systemService, "null cannot be cast to non-null type android.nfc.NfcManager");
                return (NfcManager) systemService;
            case 12:
                return BasicTextKt.LayoutWithLinksAndInlineContent_11Od_4g$lambda$2$0((AnnotatedString) obj);
            case 13:
                return BitmapFactoryDecoder.b((BitmapFactoryDecoder) obj);
            case 14:
                ((BleValidationFragmentComponent) obj).C0(BleValidationIntent.BackClickedIntent.f10582a);
                return unit;
            case 15:
                ((BookingHelpScreenViewState) obj).e.f988a.b.g.a();
                return unit;
            case 16:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(((FaqItemUiState) obj).h), null, 2, null);
            case 17:
                ((BottomSheetUiState) obj).b.g.a();
                return unit;
            case 18:
                final CWebChromeClient cWebChromeClient = (CWebChromeClient) obj;
                return new WebChromeClient() { // from class: app.chalo.compose.webview.CWebChromeClient$webChromeClient$2$1
                    @Override // android.webkit.WebChromeClient
                    public final void onProgressChanged(WebView webView, int i2) {
                        super.onProgressChanged(webView, i2);
                        cWebChromeClient.a(i2);
                    }

                    @Override // android.webkit.WebChromeClient
                    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
                        super.onReceivedIcon(webView, bitmap);
                        cWebChromeClient.getClass();
                    }

                    @Override // android.webkit.WebChromeClient
                    public final void onReceivedTitle(WebView webView, String str) {
                        super.onReceivedTitle(webView, str);
                        cWebChromeClient.b(str);
                    }

                    @Override // android.webkit.WebChromeClient
                    public final void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
                        super.onReceivedTouchIconUrl(webView, str, z);
                        cWebChromeClient.c(str, z);
                    }
                };
            case 19:
                final CWebViewClient cWebViewClient = (CWebViewClient) obj;
                return new WebViewClient() { // from class: app.chalo.compose.webview.CWebViewClient$webViewClient$2$1
                    @Override // android.webkit.WebViewClient
                    public final void onPageFinished(WebView webView, String str) {
                        super.onPageFinished(webView, str);
                        cWebViewClient.a(str);
                    }

                    @Override // android.webkit.WebViewClient
                    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                        super.onPageStarted(webView, str, bitmap);
                        cWebViewClient.b(str);
                    }

                    @Override // android.webkit.WebViewClient
                    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                        CharSequence description;
                        super.onReceivedError(webView, webResourceRequest, webResourceError);
                        if (webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
                            return;
                        }
                        String string = null;
                        Integer numValueOf = webResourceError != null ? Integer.valueOf(webResourceError.getErrorCode()) : null;
                        if (webResourceError != null && (description = webResourceError.getDescription()) != null) {
                            string = description.toString();
                        }
                        cWebViewClient.d(numValueOf, string);
                    }

                    @Override // android.webkit.WebViewClient
                    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                        if (webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
                            return;
                        }
                        cWebViewClient.d(webResourceResponse != null ? Integer.valueOf(webResourceResponse.getStatusCode()) : null, webResourceResponse != null ? webResourceResponse.getReasonPhrase() : null);
                    }

                    @Override // android.webkit.WebViewClient
                    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                        return cWebViewClient.c(str);
                    }
                };
            case 20:
                return (CardTransactionHistoryViewState) ((CardTransactionHistoryComponent) obj).f.getValue();
            case 21:
                int i2 = ChaloApplication.e;
                return new AndroidDependencyFactory((ChaloApplication) obj);
            case 22:
                ((ChaloBusRouteCorridorUIState) obj).j.a();
                return unit;
            case 23:
                ((ChaloBusRouteSuggestionFieldUiState) obj).b.d.a();
                return unit;
            case 24:
                ((ChaloBusRouteInfoTabUIState) obj).c.a();
                return unit;
            case 25:
                ((ChaloBusRouteSuggestionCardUiState) obj).c.a();
                return unit;
            case 26:
                ((ProductFooterContainerUiState) obj).c.d.invoke();
                return unit;
            case 27:
                ((ProductBannerUiState) obj).d.d.invoke();
                return unit;
            case 28:
                ChaloNavigationManagerKt.c(((ChaloBusUserProfileSurveyComponent) obj).n);
                return unit;
            default:
                ((UiEventHandler$Companion$fromLambda$1) obj).a();
                return unit;
        }
    }
}
