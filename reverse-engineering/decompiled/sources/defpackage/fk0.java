package defpackage;

import androidx.compose.foundation.pager.PagerLazyLayoutItemProvider;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import app.chalo.checkout.ui.screen.checkout.phonepe.PhonePeCheckoutComponent;
import app.chalo.checkout.ui.screen.checkout.phonepe.compose.PhonePeCheckoutScreenKt;
import app.chalo.checkout.ui.screen.payment.PaymentMainComponent;
import app.chalo.checkout.ui.screen.payment.compose.PaymentMainScreenKt;
import app.chalo.core.compose.NetworkInspectorScreenKt;
import app.chalo.core.networkinspector.NetworkInspectorComponent;
import app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapComponent;
import app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapScreenKt;
import app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeComponent;
import app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeMainScreenKt;
import app.chalo.ncmc.ui.ncmconlinerecharge.NcmcOnlineRechargeComponent;
import app.chalo.ncmc.ui.ncmconlinerecharge.NcmcOnlineRechargeMainScreenKt;
import app.chalo.ncmc.ui.pendingrecharge.PendingRechargeComponent;
import app.chalo.ncmc.ui.pendingrecharge.PendingRechargeMainScreenKt;
import app.chalo.ncmc.ui.pendingrecharge.compose.PendingRechargeScreenKt;
import app.chalo.ncmc.ui.pendingrecharge.compose.UnsyncRechargeListForCardUiModel;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsComponent;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsScreenKt;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PremiumBusBulkBookingUpcomingRidesCardData;
import app.chalo.premiumbus.prebookedtickets.newactivation.NewPremiumBusActivationBottomSheetContentKt;
import app.chalo.premiumbus.prebookedtickets.newactivation.NewPremiumBusActivationMainScreenKt;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumBusReserveTicketActivationComponent;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusPostBookingStopSchedule;
import app.chalo.premiumbus.ui.passpurchaselanding.PBPassPurchaseLandingScreenBottomSheetTypeUIState;
import app.chalo.premiumbus.ui.passpurchaselanding.PassInfoCardUIState;
import app.chalo.premiumbus.ui.passpurchaselanding.PbPassPurchaseLandingScreenComponent;
import app.chalo.premiumbus.ui.passpurchaselanding.compose.PbPassPurchaseLandingScreenKt;
import app.chalo.premiumbus.ui.stopdetails.PBStopDetailsComponent;
import app.chalo.premiumbus.ui.stopdetails.compose.PBStopDetailsMainScreenKt;
import app.chalo.productbooking.pickroutelocation.PickRouteLocationComponent;
import app.chalo.productbooking.pickroutelocation.PickRouteLocationViewState;
import app.chalo.productbooking.pickroutelocation.ui.PickRouteLocationComposableKt;
import app.chalo.productbooking.pickstop.PickStopComponent;
import app.chalo.productbooking.pickstop.StopItemUiState;
import app.chalo.productbooking.pickstop.ui.PickStopScreenKt;
import app.chalo.productpurchase.passselection.ui.PassSelectionComponent;
import app.chalo.productpurchase.passselection.ui.PassSelectionScreenKt;
import app.chalo.productpurchase.passselection.ui.PassSelectionUIState;
import app.chalo.productsummary.ui.compose.PassSummarySuccessMainScreenKt;
import app.chalo.productsummary.ui.data.PassVerificationDocumentationUIState;
import app.chalo.productsummary.ui.pass.PassSummaryComponent;
import app.chalo.productsummary.ui.pass.PassSummaryScreenType;
import app.chalo.productsummary.ui.pass.PassSummaryViewState;
import app.chalo.productsummary.ui.pass.ProductDownloadInvoiceOptionUIState;
import app.chalo.quickpay.ui.payforticket.PayForTicketComponent;
import app.chalo.quickpay.ui.payforticket.compose.PayForTicketScreenKt;
import app.chalo.validationsdk.multiproductvalidation.ui.MultiProductChildCardUIState;
import app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class fk0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15650a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fk0(Object obj, int i, int i2) {
        this.f15650a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15650a) {
            case 0:
                ((Integer) obj2).intValue();
                MultiProductValidationScreenKt.c((MultiProductChildCardUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 1:
                ((Integer) obj2).intValue();
                NcmcOnlineRechargeMainScreenKt.a((NcmcOnlineRechargeComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 2:
                ((Integer) obj2).intValue();
                NearbyStopsMapScreenKt.e((NearbyStopsMapComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 3:
                ((Integer) obj2).intValue();
                NetworkInspectorScreenKt.e((NetworkInspectorComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 4:
                ((Integer) obj2).intValue();
                NewPremiumBusActivationBottomSheetContentKt.h((PremiumBusPostBookingStopSchedule) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 5:
                ((Integer) obj2).intValue();
                NewPremiumBusActivationMainScreenKt.a((NewPremiumBusReserveTicketActivationComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 6:
                ((Integer) obj2).intValue();
                OfflineCardRechargeMainScreenKt.a((OfflineCardRechargeComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 7:
                ((Integer) obj2).intValue();
                PBStopDetailsMainScreenKt.c((PBStopDetailsComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 8:
                int iIntValue = ((Integer) obj2).intValue();
                return PagerLazyLayoutItemProvider.Item$lambda$0((PagerLazyLayoutItemProvider) this.c, this.b, (Composer) obj, iIntValue);
            case 9:
                ((Integer) obj2).intValue();
                PassSelectionScreenKt.f((PassSelectionComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 10:
                ((Integer) obj2).intValue();
                PassSelectionScreenKt.g((PassSelectionUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 11:
                ((Integer) obj2).intValue();
                PassSummarySuccessMainScreenKt.g((PassVerificationDocumentationUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 12:
                ((Integer) obj2).intValue();
                PassSummarySuccessMainScreenKt.d((PassSummaryComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 13:
                ((Integer) obj2).intValue();
                PassSummarySuccessMainScreenKt.e((PassSummaryViewState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 14:
                ((Integer) obj2).intValue();
                PassSummarySuccessMainScreenKt.f((PassSummaryScreenType.Success) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 15:
                ((Integer) obj2).intValue();
                PassSummarySuccessMainScreenKt.a((ProductDownloadInvoiceOptionUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 16:
                ((Integer) obj2).intValue();
                PayForTicketScreenKt.d((PayForTicketComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 17:
                ((Integer) obj2).intValue();
                PaymentMainScreenKt.b((PaymentMainComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 18:
                ((Integer) obj2).intValue();
                PbBulkBookingRideDetailsScreenKt.l((PremiumBusBulkBookingUpcomingRidesCardData) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 19:
                ((Integer) obj2).intValue();
                PbBulkBookingRideDetailsScreenKt.h((PbBulkBookingRideDetailsComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 20:
                ((Integer) obj2).intValue();
                PbPassPurchaseLandingScreenKt.a((PassInfoCardUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 21:
                ((Integer) obj2).intValue();
                PbPassPurchaseLandingScreenKt.e((PbPassPurchaseLandingScreenComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 22:
                ((Integer) obj2).intValue();
                PbPassPurchaseLandingScreenKt.c((PBPassPurchaseLandingScreenBottomSheetTypeUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 23:
                ((Integer) obj2).intValue();
                PendingRechargeMainScreenKt.a((PendingRechargeComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 24:
                ((Integer) obj2).intValue();
                PendingRechargeScreenKt.d((UnsyncRechargeListForCardUiModel) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 25:
                ((Integer) obj2).intValue();
                PhonePeCheckoutScreenKt.a((PhonePeCheckoutComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 26:
                ((Integer) obj2).intValue();
                PickRouteLocationComposableKt.a((PickRouteLocationComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 27:
                ((Integer) obj2).intValue();
                PickRouteLocationComposableKt.c((PickRouteLocationViewState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 28:
                ((Integer) obj2).intValue();
                PickStopScreenKt.d((PickStopComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            default:
                ((Integer) obj2).intValue();
                PickStopScreenKt.f((StopItemUiState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
        }
    }
}
