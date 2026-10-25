package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import app.chalo.compose.tabheader.RecentSearchesRowKt;
import app.chalo.home.ui.chalobus.PremiumBusTutorialComponent;
import app.chalo.home.ui.chalobus.PremiumBusTutorialScreenKt;
import app.chalo.home.ui.common.PremiumBusUpcomingBottomSheetLayoutKt;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.ReportProblemKt;
import app.chalo.livetracking.ui.routedetailsscreen.ReportProblemAckUIState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingCardData;
import app.chalo.premiumbus.ui.seatselection.compose.PremiumBusSeatSelectionMainScreenKt;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.SeatChangeSuccessScreenUIState;
import app.chalo.premiumbus.ui.slotselection.NearBySlotsAvailableSelectionBottomSheetUIState;
import app.chalo.premiumbus.ui.slotselection.NearBySlotsCardUIState;
import app.chalo.premiumbus.ui.slotselection.NewSlotTimeSuggestionSuccessUIState;
import app.chalo.premiumbus.ui.slotselection.OfferTagUIState;
import app.chalo.premiumbus.ui.slotselection.PremiumBusDefaultOptionUIState;
import app.chalo.premiumbus.ui.slotselection.PremiumBusPassOptionUIState;
import app.chalo.premiumbus.ui.slotselection.PremiumBusPurchaseOptionUIState;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionUiStateKt;
import app.chalo.premiumbus.ui.slotselection.ViewAllSlotsBottomSheetUIState;
import app.chalo.premiumbus.ui.slotselection.compose.PremiumBusSlotSelectionScreenKt;
import app.chalo.productactivation.ui.ProductActivationComponent;
import app.chalo.productactivation.ui.ProductActivationScreenKt;
import app.chalo.productactivation.ui.ProductActivationUIState;
import app.chalo.productactivation.ui.uistate.DiscountBannerUIState;
import app.chalo.productpurchase.productselection.ui.ProductSelectionComponent;
import app.chalo.productpurchase.productselection.ui.ProductSelectionScreenKt;
import app.chalo.productpurchase.productselection.ui.ProductSelectionUIState;
import app.chalo.quickpay.ui.tripamount.QuickpayBottomSheetUIState;
import app.chalo.quickpay.ui.tripamount.QuickpayTripAmountComponent;
import app.chalo.quickpay.ui.tripamount.QuickpayTripAmountScreenKt;
import app.chalo.reportproblem.ReportProblemComponent;
import app.chalo.reportproblem.ReportProblemScreenKt;
import app.chalo.reportproblem.ReportProblemViewState;
import app.chalo.ridehailing.feedback.RideUserFeedbackComponent;
import app.chalo.ridehailing.feedback.RideUserFeedbackScreenKt;
import app.chalo.tripreceipt.tripreceiptnew.RideReceiptComponent;
import app.chalo.tripreceipt.tripreceiptnew.RideReceiptViewState;
import app.chalo.tripreceipt.tripreceiptnew.ui.RideReceiptMainScreenKt;
import app.chalo.uistate.components.RecentlySearchedContainerUiState;
import app.chalo.uistate.dialog.ErrorBottomSheetUIState;
import app.chalo.validationsdk.blevalidation.ui.common.QRValidationBottomSheetUIState;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationScreenKt;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationUIState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yu0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20144a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yu0(Object obj, int i, int i2) {
        this.f20144a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20144a) {
            case 0:
                ((Integer) obj2).intValue();
                PremiumBusSeatSelectionMainScreenKt.c((SeatChangeSuccessScreenUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                PremiumBusSlotSelectionScreenKt.b((NearBySlotsAvailableSelectionBottomSheetUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                PremiumBusSlotSelectionScreenKt.a((NearBySlotsCardUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                PremiumBusSlotSelectionScreenKt.g((PremiumBusSlotSelectionComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                PremiumBusSlotSelectionUiStateKt.w((ViewAllSlotsBottomSheetUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                PremiumBusSlotSelectionUiStateKt.j((PremiumBusDefaultOptionUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 6:
                ((Integer) obj2).intValue();
                PremiumBusSlotSelectionUiStateKt.k((NewSlotTimeSuggestionSuccessUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 7:
                ((Integer) obj2).intValue();
                PremiumBusSlotSelectionUiStateKt.c((ErrorBottomSheetUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 8:
                ((Integer) obj2).intValue();
                PremiumBusSlotSelectionUiStateKt.g((OfferTagUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 9:
                ((Integer) obj2).intValue();
                PremiumBusSlotSelectionUiStateKt.m((PremiumBusPurchaseOptionUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 10:
                ((Integer) obj2).intValue();
                PremiumBusSlotSelectionUiStateKt.l((PremiumBusPassOptionUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 11:
                ((Integer) obj2).intValue();
                PremiumBusTutorialScreenKt.a((PremiumBusTutorialComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 12:
                ((Integer) obj2).intValue();
                PremiumBusUpcomingBottomSheetLayoutKt.c((PremiumBusBookingCardData) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 13:
                ((Integer) obj2).intValue();
                ProductActivationScreenKt.c((ProductActivationComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 14:
                ((Integer) obj2).intValue();
                ProductActivationScreenKt.b((ProductActivationUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 15:
                ((Integer) obj2).intValue();
                ProductActivationScreenKt.a((DiscountBannerUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 16:
                ((Integer) obj2).intValue();
                ProductSelectionScreenKt.g((ProductSelectionComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 17:
                ((Integer) obj2).intValue();
                ProductSelectionScreenKt.h((ProductSelectionUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 18:
                ((Integer) obj2).intValue();
                QRValidationScreenKt.d((QRValidationComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 19:
                ((Integer) obj2).intValue();
                QRValidationScreenKt.c((QRValidationUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 20:
                ((Integer) obj2).intValue();
                QRValidationScreenKt.b((QRValidationBottomSheetUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 21:
                ((Integer) obj2).intValue();
                QuickpayTripAmountScreenKt.f((QuickpayTripAmountComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 22:
                ((Integer) obj2).intValue();
                QuickpayTripAmountScreenKt.a((QuickpayBottomSheetUIState.QuickpayConfirmationBottomSheetUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 23:
                ((Integer) obj2).intValue();
                RecentSearchesRowKt.a((RecentlySearchedContainerUiState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 24:
                ((Integer) obj2).intValue();
                ReportProblemKt.a((ReportProblemAckUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 25:
                ((Integer) obj2).intValue();
                ReportProblemScreenKt.a((ReportProblemComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 26:
                ((Integer) obj2).intValue();
                ReportProblemScreenKt.b((ReportProblemViewState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 27:
                ((Integer) obj2).intValue();
                RideReceiptMainScreenKt.a((RideReceiptComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 28:
                ((Integer) obj2).intValue();
                RideReceiptMainScreenKt.b((RideReceiptViewState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                RideUserFeedbackScreenKt.m((RideUserFeedbackComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
        }
        return Unit.f17538a;
    }
}
