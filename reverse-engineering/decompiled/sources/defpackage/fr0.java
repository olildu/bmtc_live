package defpackage;

import app.chalo.bookingsuccessproducttype.BookingSuccessProductType;
import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.constants.Source;
import app.chalo.data.PremiumBusProductOptionsAppModel;
import app.chalo.home.domain.ChaloUserBookingType;
import app.chalo.livetracking.frameworklivetracking.RealTimeSocketManagerImpl;
import app.chalo.livetracking.frameworklivetracking.data.model.app.ChaloRtsServiceConfigAppModel;
import app.chalo.livetracking.universalsearch.data.model.app.UniversalSearchRecentSearchItem;
import app.chalo.models.mticketing.MTicket;
import app.chalo.premiumbus.data.models.app.PremiumBusPassUpsellAppModel;
import app.chalo.premiumbus.data.models.app.SeatInfoAppModel;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.PremiumBusPostActivationStopDetails;
import app.chalo.premiumbus.ui.bulkbookingsuccess.PremiumBusBulkBookingConfirmationComponent;
import app.chalo.premiumbus.ui.bulkbookingsuccess.PremiumBusBulkBookingConfirmationIntent;
import app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsUiStateFactory;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsIntent;
import app.chalo.premiumbus.ui.passpurchaselanding.PbPassPurchaseLandingScreenComponent;
import app.chalo.premiumbus.ui.passpurchaselanding.PbPassPurchaseLandingScreenDataState;
import app.chalo.premiumbus.ui.passpurchaselanding.PbPassPurchaseLandingScreenIntent;
import app.chalo.premiumbus.ui.productselection.PremiumBusProductSelectionComponent;
import app.chalo.premiumbus.ui.productselection.PremiumBusProductSelectionDataState;
import app.chalo.premiumbus.ui.productselection.PremiumBusProductSelectionIntent;
import app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionDataState;
import app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionIntent;
import app.chalo.premiumbus.ui.slotselection.DateAndSlotSelectedForBulkBooking;
import app.chalo.premiumbus.ui.stopselection.PBStopSelectionScreenBottomSheetType;
import app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionComponent;
import app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionIntent;
import app.chalo.productbooking.common.data.models.app.ProductBookingStopDetails;
import app.chalo.productbooking.pickroutelocation.PickRouteLocationComponent;
import app.chalo.productbooking.pickroutelocation.PickRouteLocationIntent;
import app.chalo.productbooking.pickstop.PickStopComponent;
import app.chalo.productbooking.pickstop.PickStopIntent;
import app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel;
import app.chalo.productpurchase.productselection.ui.ProductSelectionComponent;
import app.chalo.productpurchase.productselection.ui.ProductSelectionIntent;
import app.chalo.quickpay.ui.tripamount.QuickpayTripAmountComponent;
import app.chalo.recent.model.app.RecentRouteAppModel;
import app.chalo.ridehailing.feedback.RatingReaction;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.BookingSuccessArgs;
import app.chalo.scenes.args.RouteDetailsArgs;
import app.chalo.superpass.data.models.entities.MagicSuperPass;
import app.chalo.superpass.data.models.entities.RideBasedSuperPass;
import app.chalo.userprofile.domain.AccountSettingsAction;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.PostPunchBottomSheetData;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationIntent;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.TicketGridItemUIState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class fr0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15668a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fr0(int i, Object obj, Object obj2) {
        this.f15668a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f15668a;
        Unit unit = Unit.f17538a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                PBStopSelectionScreenBottomSheetType.NewRouteSuggestion newRouteSuggestion = (PBStopSelectionScreenBottomSheetType.NewRouteSuggestion) ((PBStopSelectionScreenBottomSheetType) obj);
                ((PbPassPurchaseLandingScreenComponent) obj2).O0(new PbPassPurchaseLandingScreenIntent.NewRouteSuggestionSubmitBtnClickIntent(newRouteSuggestion.f7957a, newRouteSuggestion.b));
                return unit;
            case 1:
                PbPassPurchaseLandingScreenDataState pbPassPurchaseLandingScreenDataState = (PbPassPurchaseLandingScreenDataState) obj;
                ((PbPassPurchaseLandingScreenComponent) obj2).O0(new PbPassPurchaseLandingScreenIntent.RetryBtnClickIntent(pbPassPurchaseLandingScreenDataState.f7652a, Source.PB_PASS_PURCHASE_LANDING_SCREEN, pbPassPurchaseLandingScreenDataState.b));
                return unit;
            case 2:
                ((Function1) obj2).invoke((RatingReaction) obj);
                return unit;
            case 3:
                ((PickRouteLocationComponent) obj2).P0(new PickRouteLocationIntent.RouteSelectedIntent(((RouteAppModel) obj).b));
                return unit;
            case 4:
                ((PickRouteLocationComponent) obj2).P0(new PickRouteLocationIntent.RouteSelectedIntent(((RecentRouteAppModel) obj).e));
                return unit;
            case 5:
                ((PickStopComponent) obj2).I0(new PickStopIntent.SelectStopIntent((ProductBookingStopDetails) obj));
                return unit;
            case 6:
                ((Function1) obj2).invoke(((PremiumBusPostActivationStopDetails) obj).f7403a);
                return unit;
            case 7:
                ((PremiumBusBulkBookingConfirmationComponent) obj2).O0(new PremiumBusBulkBookingConfirmationIntent.RemoveSlotClickIntent((DateAndSlotSelectedForBulkBooking) obj));
                return unit;
            case 8:
                float f = PremiumBusFareDetailsUiStateFactory.c;
                ((Function1) obj2).invoke(new PremiumBusFareDetailsIntent.SelectPassUpsellOfferIntent(((PremiumBusPassUpsellAppModel) obj).f7102a));
                return unit;
            case 9:
                PremiumBusProductSelectionDataState premiumBusProductSelectionDataState = (PremiumBusProductSelectionDataState) obj;
                ((PremiumBusProductSelectionComponent) obj2).K0(new PremiumBusProductSelectionIntent.InitializationIntent(premiumBusProductSelectionDataState.h, premiumBusProductSelectionDataState.f));
                return unit;
            case 10:
                ((Function1) obj2).invoke(new PremiumBusSeatSelectionIntent.ToggleSeatSelectionIntent((SeatInfoAppModel) obj));
                return unit;
            case 11:
                ((PremiumBusSeatSelectionDataState) obj2).getClass();
                return unit;
            case 12:
                ((PremiumBusStopSelectionComponent) obj2).A.b(new ChaloNavigationRequest.Navigate(new RouteDetailsArgs((String) obj), null, "RouteDetailsTag", 2));
                return unit;
            case 13:
                PBStopSelectionScreenBottomSheetType.NewRouteSuggestion newRouteSuggestion2 = (PBStopSelectionScreenBottomSheetType.NewRouteSuggestion) ((PBStopSelectionScreenBottomSheetType) obj);
                ((Function1) obj2).invoke(new PremiumBusStopSelectionIntent.NewRouteSuggestionSubmitBtnClickIntent(newRouteSuggestion2.f7957a, newRouteSuggestion2.b));
                return unit;
            case 14:
                ((Function1) obj2).invoke((PremiumBusProductOptionsAppModel) obj);
                return unit;
            case 15:
                ((ProductSelectionComponent) obj2).Z0(new ProductSelectionIntent.ProductClickedIntent((ProductConfigResponseAppModel) obj));
                return unit;
            case 16:
                ((ProductSelectionComponent) obj2).Z0(new ProductSelectionIntent.RecentBookingItemClickedIntent(new ProductSelectionComponent.RecentItemsType.RecentRideBasedSuperPass((RideBasedSuperPass) obj)));
                return unit;
            case 17:
                ((ProductSelectionComponent) obj2).Z0(new ProductSelectionIntent.RecentBookingItemClickedIntent(new ProductSelectionComponent.RecentItemsType.RecentMagicSuperPass((MagicSuperPass) obj)));
                return unit;
            case 18:
                ((ProductSelectionComponent) obj2).Z0(new ProductSelectionIntent.RecentBookingItemClickedIntent(new ProductSelectionComponent.RecentItemsType.RecentMTicket((MTicket) obj)));
                return unit;
            case 19:
                Function1 function1 = (Function1) obj2;
                ChaloUserBookingType.TicketBooking.MetroTicketBooking metroTicketBooking = (ChaloUserBookingType.TicketBooking.MetroTicketBooking) obj;
                if (function1 != null) {
                    function1.invoke(metroTicketBooking);
                }
                return unit;
            case 20:
                ((Function1) obj2).invoke((AccountSettingsAction) obj);
                return unit;
            case 21:
                PostPunchBottomSheetData postPunchBottomSheetData = (PostPunchBottomSheetData) obj;
                ((QRValidationComponent) obj2).Y0(new QRValidationIntent.ValidationSuccessBottomSheetNegativeBtnClicked(postPunchBottomSheetData.f10629a, postPunchBottomSheetData.b));
                return unit;
            case 22:
                ((TicketGridItemUIState) obj2).c.a();
                ((Function0) obj).invoke();
                return unit;
            case 23:
                ChaloNavigationManagerKt.e(((QuickpayTripAmountComponent) obj2).z, new BookingSuccessArgs.ProductSuccessScreen(new BookingSuccessProductType.QuickPay((String) obj), Source.QUICK_PAY_BOTTOMSHEET_FRAGMENT), null, 6);
                return unit;
            case 24:
                ChaloRtsServiceConfigAppModel.WithPolling withPolling = (ChaloRtsServiceConfigAppModel.WithPolling) obj;
                long j = withPolling.b;
                double d = withPolling.c;
                ((RealTimeSocketManagerImpl) obj2).getClass();
                return Long.valueOf(RealTimeSocketManagerImpl.e(j, d));
            case 25:
                ChaloRtsServiceConfigAppModel.WithSubscription withSubscription = (ChaloRtsServiceConfigAppModel.WithSubscription) obj;
                long j2 = withSubscription.b;
                double d2 = withSubscription.c;
                ((RealTimeSocketManagerImpl) obj2).getClass();
                return Long.valueOf(RealTimeSocketManagerImpl.e(j2, d2));
            case 26:
                return RealWebSocket.failWebSocket$lambda$14$lambda$13((Ref.ObjectRef) obj2, (Ref.ObjectRef) obj);
            case 27:
                ((Function1) obj2).invoke((UniversalSearchRecentSearchItem.Route) obj);
                return unit;
            case 28:
                RecentRouteAppModel recentRouteAppModel = (RecentRouteAppModel) obj;
                ((Function2) obj2).invoke(recentRouteAppModel.e, recentRouteAppModel.f);
                return unit;
            default:
                ((Function1) obj2).invoke((UniversalSearchRecentSearchItem.Place) obj);
                return unit;
        }
    }
}
