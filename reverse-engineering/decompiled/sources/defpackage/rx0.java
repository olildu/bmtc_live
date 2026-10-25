package defpackage;

import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.home.ui.history.compose.components.PurchaseProductBottomSheetContentKt;
import app.chalo.home.ui.history.compose.components.RegularBusActiveTicketViewKt;
import app.chalo.home.ui.history.uistate.ChaloWidgetCardUiState;
import app.chalo.home.ui.history.uistate.bottomsheet.MyTicketBottomSheetUiState;
import app.chalo.home.ui.history.uistate.chalobusticket.BusTicketStatusUiState;
import app.chalo.home.ui.history.uistate.regularbusticket.RegularBusTicketFooterContainerUiState;
import app.chalo.home.ui.history.uistate.regularbusticket.RegularBusTicketUiState;
import app.chalo.home.ui.profile.ProfileScreenUIKt;
import app.chalo.home.ui.regularbus.RegularBusDialogType;
import app.chalo.home.ui.regularbus.compose.RegularBusScreenUIKt;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.ReportProblemKt;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.RouteAvailabilityBannerKt;
import app.chalo.livetracking.ui.routedetailsscreen.ReportProblemCtaUIState;
import app.chalo.livetracking.ui.routedetailsscreen.ReportProblemDialogUIState;
import app.chalo.livetracking.ui.routedetailsscreen.ReportProblemTagTextUIState;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteAvailabilityBannerUIState;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteReportProblemCTAUIState;
import app.chalo.productpurchase.productselection.ui.ProductAnnouncementTextUIState;
import app.chalo.productpurchase.productselection.ui.ProductSelectionScreenKt;
import app.chalo.productpurchase.productselection.ui.ProductSelectionSectionItemUIState;
import app.chalo.productsummary.ui.compose.components.ProductStatusComponentKt;
import app.chalo.productsummary.ui.compose.components.RideStatusTagComponentKt;
import app.chalo.productsummary.ui.data.ProductSummaryStatusUiData;
import app.chalo.quickpay.ui.tripamount.QuickpayBottomSheetUIState;
import app.chalo.quickpay.ui.tripamount.QuickpayDisclaimerUIState;
import app.chalo.quickpay.ui.tripamount.QuickpayTripAmountScreenKt;
import app.chalo.ridehailing.feedback.RideFeedbackContentUIState;
import app.chalo.ridehailing.feedback.RideFeedbackHeaderUIState;
import app.chalo.ridehailing.feedback.RideUserFeedbackScreenKt;
import app.chalo.uistate.components.ChaloTicketDetailsContainerSpec;
import app.chalo.uistate.components.RegularBusPickupScheduleUiState;
import app.chalo.uistate.components.RegularBusTicketAmountDetailsUiState;
import app.chalo.uistate.components.RegularBusTicketContainerUiState;
import app.chalo.uistate.components.RegularBusTicketDetailsContainerKt;
import app.chalo.uistate.components.RegularBusTicketReferenceNumberUiState;
import app.chalo.uistate.components.RegularBusTicketTripDetailsUiState;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationScreenKt;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.SwitchToBLECalloutUIState;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.ValidationAdditionalInfoUIState;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.ValidationTripDetailsUIState;
import app.chalo.wallet.ui.promotionscardcontainer.PromotionsCardContainerKt;
import app.chalo.walletframework.wallet.domain.model.PromotionCardItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class rx0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19251a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rx0(int i, int i2, Modifier modifier, Object obj) {
        this.f19251a = i2;
        this.b = modifier;
        this.d = obj;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19251a) {
            case 0:
                ((Integer) obj2).getClass();
                ProductSelectionScreenKt.d((ProductAnnouncementTextUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ProductSelectionScreenKt.l((ProductSelectionSectionItemUIState.RecentProductItemUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ProductStatusComponentKt.a((Modifier) this.b, (ProductSummaryStatusUiData) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                ProfileScreenUIKt.k((Function1) this.d, (String) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                PromotionsCardContainerKt.b((PromotionCardItem) this.d, (Function0) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                PurchaseProductBottomSheetContentKt.b((Modifier) this.b, (MyTicketBottomSheetUiState.ProductPurchaseBottomSheetUiState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                PurchaseProductBottomSheetContentKt.a((Modifier) this.b, (ChaloWidgetCardUiState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                QRValidationScreenKt.k((ImageUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 8:
                ((Integer) obj2).intValue();
                QRValidationScreenKt.l((ValidationTripDetailsUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                QRValidationScreenKt.g((Modifier) this.b, (SwitchToBLECalloutUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 10:
                ((Integer) obj2).intValue();
                QRValidationScreenKt.j((ValidationAdditionalInfoUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 11:
                ((Integer) obj2).intValue();
                QuickpayTripAmountScreenKt.c((SheetState) this.d, (QuickpayBottomSheetUIState) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                QuickpayTripAmountScreenKt.d((QuickpayDisclaimerUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                RegularBusActiveTicketViewKt.a((Modifier) this.b, (RegularBusTicketUiState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                RegularBusActiveTicketViewKt.b((Modifier) this.b, (RegularBusTicketFooterContainerUiState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 15:
                ((Integer) obj2).intValue();
                RegularBusScreenUIKt.k((RegularBusDialogType) this.d, (Function1) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                RegularBusTicketDetailsContainerKt.b((Modifier) this.b, (RegularBusTicketContainerUiState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                RegularBusTicketDetailsContainerKt.f((Modifier) this.b, (RegularBusTicketTripDetailsUiState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                RegularBusTicketDetailsContainerKt.e((Modifier) this.b, (RegularBusTicketReferenceNumberUiState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 19:
                ((Integer) obj2).intValue();
                RegularBusTicketDetailsContainerKt.g((DividerUIState) this.d, (ChaloTicketDetailsContainerSpec) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                RegularBusTicketDetailsContainerKt.d((Modifier) this.b, (RegularBusTicketAmountDetailsUiState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                RegularBusTicketDetailsContainerKt.c((Modifier) this.b, (RegularBusPickupScheduleUiState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                ReportProblemKt.b((RouteReportProblemCTAUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                ReportProblemKt.d((ReportProblemDialogUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                ReportProblemKt.e((ReportProblemTagTextUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                ReportProblemKt.c((ReportProblemCtaUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                RideStatusTagComponentKt.a((Modifier) this.b, (BusTicketStatusUiState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                RideUserFeedbackScreenKt.f((Modifier) this.b, (RideFeedbackHeaderUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                RideUserFeedbackScreenKt.d((Modifier) this.b, (RideFeedbackContentUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                RouteAvailabilityBannerKt.a((RouteAvailabilityBannerUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ rx0(Object obj, Object obj2, int i, int i2) {
        this.f19251a = i2;
        this.d = obj;
        this.b = obj2;
        this.c = i;
    }
}
