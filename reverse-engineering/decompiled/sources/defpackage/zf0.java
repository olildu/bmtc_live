package defpackage;

import androidx.compose.material3.DrawerState;
import androidx.compose.material3.DrawerValue;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NextFrameEndCallbackQueue;
import app.chalo.checkout.data.model.ui.CheckoutPaymentItem;
import app.chalo.checkout.ui.screen.payment.PaymentBottomSheetType;
import app.chalo.checkout.ui.screen.payment.PaymentMainComponent;
import app.chalo.checkout.ui.screen.payment.PaymentViewIntent;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.constants.Source;
import app.chalo.core.networkinspector.NetworkInspectorComponent;
import app.chalo.core.networkinspector.NetworkInspectorIntent;
import app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapComponent;
import app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapIntent;
import app.chalo.home.ui.history.MyTicketsViewIntent;
import app.chalo.home.ui.history.TicketsPassesTabType;
import app.chalo.homescreen.data.model.app.PurchaseProductCardAppModel;
import app.chalo.homescreen.data.model.app.TicketsPageFeature;
import app.chalo.kyc.min.ui.minkycotp.KycErrorBottomSheetData;
import app.chalo.kyc.min.ui.minkycotp.MinKycOtpIntent;
import app.chalo.kyc.min.ui.minkycotp.MinKycOtpSideEffect;
import app.chalo.location.LatLng;
import app.chalo.login.ui.otp.LoginOtpEnterComponent;
import app.chalo.metro.ui.landing.MetroLandingScreenComponent;
import app.chalo.metro.ui.landing.MetroLandingScreenDataState;
import app.chalo.metro.ui.landing.MetroLandingScreenRestoredState;
import app.chalo.metro.ui.landing.MetroLandingScreenViewIntent;
import app.chalo.metro.ui.landing.MetroLineListItemState;
import app.chalo.metro.ui.landing.PickStopRequestType;
import app.chalo.models.BookableSuperPassConfiguration;
import app.chalo.multimodalticket.data.model.app.MultiModalGroupTicketChildAppModel;
import app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeComponent;
import app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeIntent;
import app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeViewState;
import app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineRechargeScreenType;
import app.chalo.network.logging.NetworkCallInfo;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsDialogType;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsTabType;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingVehicleInfoState;
import app.chalo.productpurchase.passselection.ui.PassSelectionComponent;
import app.chalo.productpurchase.passselection.ui.PassSelectionIntent;
import app.chalo.productpurchase.productselection.data.models.app.SuperPassProductConfigSubCategoryResponseAppModel;
import app.chalo.productsummary.ui.pass.PassSummaryIntent;
import app.chalo.productsummary.ui.pass.PassSummaryScreenType;
import app.chalo.recent.model.app.RecentStopAndRouteBasedAppModel;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.MinProfileUpdateArgs;
import app.chalo.scenes.args.SceneArgs;
import app.chalo.scenes.args.WalletLoadMoneyArgs;
import app.chalo.stoptripdetails.data.model.app.LocationSummaryPayloadResponseAppModel;
import app.chalo.userprofile.Gender;
import app.chalo.userprofile.ui.minprofileupdate.MinProfileUpdateComponent;
import app.chalo.userprofile.ui.minprofileupdate.MinProfileUpdateIntent;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.datetime.LocalDateTime;
import kotlinx.datetime.internal.format.parser.NumberSpanParserOperation;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.internal.ObjectSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zf0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20194a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zf0(int i, Object obj, Object obj2) {
        this.f20194a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20194a) {
            case 0:
                ((LoginOtpEnterComponent) this.b).s.b(new ChaloNavigationRequest.Navigate(new MinProfileUpdateArgs((String) this.c, true, Source.LOGIN_OTP_SCREEN), null, null, 6));
                return Unit.f17538a;
            case 1:
                ((MetroLandingScreenComponent) this.b).u.b(new ChaloNavigationRequest.Navigate((SceneArgs) this.c, null, null, 6));
                return Unit.f17538a;
            case 2:
                MetroLandingScreenComponent metroLandingScreenComponent = (MetroLandingScreenComponent) this.b;
                MetroLandingScreenRestoredState metroLandingScreenRestoredState = (MetroLandingScreenRestoredState) this.c;
                MetroLandingScreenDataState metroLandingScreenDataState = (MetroLandingScreenDataState) metroLandingScreenComponent.f.getValue();
                Intrinsics.i(metroLandingScreenDataState, "<this>");
                String str = metroLandingScreenDataState.b;
                String str2 = metroLandingScreenDataState.c;
                PickStopRequestType pickStopRequestType = metroLandingScreenDataState.e;
                Map map = metroLandingScreenDataState.f;
                List list = metroLandingScreenDataState.g;
                MetroLineListItemState metroLineListItemState = metroLandingScreenDataState.j;
                StopAppModel stopAppModel = metroLandingScreenDataState.k;
                StopAppModel stopAppModel2 = metroLandingScreenDataState.l;
                new MetroLandingScreenRestoredState(str, str2, metroLandingScreenDataState.d, null, pickStopRequestType, map, list, metroLineListItemState, stopAppModel, stopAppModel2);
                Boolean bool = ((MetroLandingScreenDataState) metroLandingScreenComponent.f.getValue()).d;
                if (bool == null) {
                    bool = metroLandingScreenRestoredState != null ? metroLandingScreenRestoredState.c : null;
                }
                return new MetroLandingScreenRestoredState(str, str2, bool, metroLandingScreenComponent.z, pickStopRequestType, map, list, metroLineListItemState, stopAppModel, stopAppModel2);
            case 3:
                ((Function1) this.b).invoke(new MetroLandingScreenViewIntent.OnRecentStationPairClicked((RecentStopAndRouteBasedAppModel) this.c));
                return Unit.f17538a;
            case 4:
                Function1 function1 = (Function1) this.b;
                Function1 function2 = (Function1) this.c;
                function1.invoke(MinKycOtpSideEffect.ClearFocus.f4157a);
                function2.invoke(MinKycOtpIntent.ProceedBtnClickedIntent.f4152a);
                return Unit.f17538a;
            case 5:
                ((Function1) this.b).invoke(new MinKycOtpIntent.PositiveCtaClickedIntent(((KycErrorBottomSheetData) this.c).d));
                return Unit.f17538a;
            case 6:
                ((MinProfileUpdateComponent) this.b).W0(new MinProfileUpdateIntent.GenderSelected((Gender) this.c));
                return Unit.f17538a;
            case 7:
                ((wi0) this.b).invoke((LocalDateTime) this.c);
                return Unit.f17538a;
            case 8:
                ((Function1) this.b).invoke(new MyTicketsViewIntent.QuickFilterTabClickedIntent((TicketsPassesTabType) this.c));
                return Unit.f17538a;
            case 9:
                ((Function1) this.b).invoke(new MyTicketsViewIntent.MultiModalChildTicketSelectedIntent((MultiModalGroupTicketChildAppModel) this.c));
                return Unit.f17538a;
            case 10:
                ((Function1) this.b).invoke(new MyTicketsViewIntent.TicketsPageItemClickedIntent(null, TicketsPageFeature.PRODUCT_PURCHASE, ((PurchaseProductCardAppModel) this.c).f3784a, null, 9));
                return Unit.f17538a;
            case 11:
                return Float.valueOf(NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$24$lambda$16$lambda$15(0.0f, (DrawerState) this.b, (MutableFloatState) this.c));
            case 12:
                return NavigationDrawerKt.rememberDrawerState$lambda$3$lambda$2((DrawerValue) this.b, (Function1) this.c);
            case 13:
                ((NearbyStopsMapComponent) this.b).L0(new NearbyStopsMapIntent.StopMarkerClicked(((LocationSummaryPayloadResponseAppModel) this.c).e));
                return Boolean.TRUE;
            case 14:
                ((NetworkInspectorComponent) this.b).F0(new NetworkInspectorIntent.CopyCurlClicked((NetworkCallInfo) this.c));
                return Unit.f17538a;
            case 15:
                ((Function1) this.b).invoke(((PremiumBusBookingVehicleInfoState) this.c).f7415a);
                return Unit.f17538a;
            case 16:
                return NextFrameEndCallbackQueue.onNewAwaiters$lambda$0((NextFrameEndCallbackQueue) this.b, (Function0) this.c);
            case 17:
                return "Only found " + ((Ref.IntRef) this.b).element + " digits in a row, but need to parse " + ((NumberSpanParserOperation) this.c).b();
            case 18:
                return SerialDescriptorsKt.e((String) this.c, StructureKind.OBJECT.f18120a, new SerialDescriptor[0], new ym0((ObjectSerializer) this.b, 2));
            case 19:
                OfflineCardRechargeComponent offlineCardRechargeComponent = (OfflineCardRechargeComponent) this.b;
                if (((OfflineCardRechargeViewState) ((MutableState) this.c).getValue()).f6399a == OfflineRechargeScreenType.SUCCESS) {
                    offlineCardRechargeComponent.I0(OfflineCardRechargeIntent.NavigateToHome.f6388a);
                }
                return Unit.f17538a;
            case 20:
                ((Function1) this.b).invoke((LatLng) this.c);
                return Unit.f17538a;
            case 21:
                ((PassSelectionComponent) this.b).N0(new PassSelectionIntent.PassFareMappingSelectedIntent((BookableSuperPassConfiguration) this.c));
                return Unit.f17538a;
            case 22:
                ((PassSelectionComponent) this.b).N0(new PassSelectionIntent.FAQClickedIntent((String) this.c));
                return Unit.f17538a;
            case 23:
                ((PassSelectionComponent) this.b).N0(new PassSelectionIntent.SubCategorySelectedIntent(((SuperPassProductConfigSubCategoryResponseAppModel) this.c).f8644a));
                return Unit.f17538a;
            case 24:
                ((Function1) this.b).invoke(new PassSummaryIntent.OnBackPressedIntent((PassSummaryScreenType) this.c));
                return Unit.f17538a;
            case 25:
                ((PaymentMainComponent) this.b).s1(new PaymentViewIntent.PaymentStatusBottomSheetPositiveButtonClicked(((PaymentBottomSheetType.PaymentStatusBottomSheet) ((PaymentBottomSheetType) this.c)).f1522a.f));
                return Unit.f17538a;
            case 26:
                ((PaymentMainComponent) this.b).s1(new PaymentViewIntent.SeeAllUpiAppsCtaClicked((CheckoutPaymentItem.IndividualCheckoutItem.UPIIntentPaymentItem) this.c));
                return Unit.f17538a;
            case 27:
                ((PaymentMainComponent) this.b).H.b(new ChaloNavigationRequest.Navigate(new WalletLoadMoneyArgs((String) this.c, false, true), null, null, 6));
                return Unit.f17538a;
            case 28:
                ((Function1) this.b).invoke(Long.valueOf(((PbBulkBookingRideDetailsDialogType.PassDateChangeConfirmationDialog) this.c).c));
                return Unit.f17538a;
            default:
                ((Function1) this.b).invoke((PbBulkBookingRideDetailsTabType) this.c);
                return Unit.f17538a;
        }
    }

    public /* synthetic */ zf0(String str, ObjectSerializer objectSerializer) {
        this.f20194a = 18;
        this.c = str;
        this.b = objectSerializer;
    }
}
