package defpackage;

import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import app.chalo.appUpdate.ForceAppUpdateComponent;
import app.chalo.appUpdate.ForceAppUpdateUIState;
import app.chalo.appUpdate.ui.ForceAppUpdateScreenKt;
import app.chalo.checkout.ui.screen.checkout.inai.InaiCheckoutComponent;
import app.chalo.checkout.ui.screen.checkout.inai.compose.InaiCheckoutScreenKt;
import app.chalo.compose.components.dialogs.GenderSelectionDialogKt;
import app.chalo.compose.components.multimodal.FromToStopComposableKt;
import app.chalo.electricitybill.ui.ebillfetch.EBillFetchComponent;
import app.chalo.electricitybill.ui.ebillfetch.EBillFetchViewState;
import app.chalo.electricitybill.ui.ebillfetch.ui.EBillFetchScreenKt;
import app.chalo.electricitybill.ui.ebillpayment.EBillPaymentConfirmationComponent;
import app.chalo.electricitybill.ui.ebillpayment.EBillPaymentConfirmationViewState;
import app.chalo.electricitybill.ui.ebillpayment.TotalAmountUIState;
import app.chalo.electricitybill.ui.ebillpayment.ui.EBillPaymentConfirmationScreenKt;
import app.chalo.electricitybill.ui.ebillpaymentsuccess.EBillPaymentSuccessComponent;
import app.chalo.electricitybill.ui.ebillpaymentsuccess.EBillPaymentSuccessViewState;
import app.chalo.electricitybill.ui.ebillpaymentsuccess.ui.EBillPaymentSuccessScreenKt;
import app.chalo.electricitybill.ui.invoice.EBillPaymentInvoiceComponent;
import app.chalo.electricitybill.ui.invoice.EBillPaymentInvoiceViewState;
import app.chalo.electricitybill.ui.invoice.ui.EBillPaymentInvoiceScreenKt;
import app.chalo.electricitybill.ui.paymenthistory.EBillHistoryItemUIState;
import app.chalo.electricitybill.ui.paymenthistory.ElectricityBillPaymentHistoryComponent;
import app.chalo.electricitybill.ui.paymenthistory.ElectricityPaymentHistoryScreenUIState;
import app.chalo.electricitybill.ui.paymenthistory.ElectricityPaymentHistoryViewState;
import app.chalo.electricitybill.ui.paymenthistory.ui.EBillPaymentHistoryScreenKt;
import app.chalo.kyc.min.ui.minkycotp.GenericErrorBottomSheetUIState;
import app.chalo.kyc.min.ui.minkycotp.composables.GenericErrorBottomSheetKt;
import app.chalo.livetracking.stoptripplannerresult.compose.components.ItinerarySingleLegCardKt;
import app.chalo.livetracking.stoptripplannerresult.uistate.LiveEtaInfoUiState;
import app.chalo.multimodalticket.groupticketsummary.ui.GroupTicketSummaryComponent;
import app.chalo.multimodalticket.groupticketsummary.ui.compose.GroupTicketSummaryScreenKt;
import app.chalo.multimodalticket.groupticketsummary.ui.uistate.GroupTicketSummaryViewState;
import app.chalo.multimodalticket.ui.FullJourneyTicketCardUIState;
import app.chalo.multimodalticket.ui.GroupTicketLegSelectionComponent;
import app.chalo.multimodalticket.ui.IndividualStepsTicketCardUIState;
import app.chalo.multimodalticket.ui.composables.FullJourneyTicketCardComposableKt;
import app.chalo.multimodalticket.ui.composables.GroupTicketLegSelectionMainScreenKt;
import app.chalo.multimodalticket.ui.composables.GroupTicketPassengerSelectionBottomSheetComposableKt;
import app.chalo.multimodalticket.ui.composables.IndividualStepTicketCardComposableKt;
import app.chalo.multimodalticket.ui.uistates.FareBreakupSectionUIState;
import app.chalo.ncmc.ui.entercarddetails.EnterCardDetailsComponent;
import app.chalo.ncmc.ui.entercarddetails.EnterCardDetailsMainScreenKt;
import app.chalo.productsummary.ui.compose.components.FullScreenImageSectionKt;
import app.chalo.productsummary.ui.data.FullScreenImageUIState;
import app.chalo.uistate.dialog.GenderSelectionDialogUIState;
import app.chalo.uistate.multimodal.FromAndToStopUIState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class w00 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19881a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w00(Object obj, int i, int i2) {
        this.f19881a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19881a) {
            case 0:
                ((Integer) obj2).intValue();
                EBillFetchScreenKt.a((EBillFetchComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 1:
                ((Integer) obj2).intValue();
                EBillFetchScreenKt.c((EBillFetchViewState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 2:
                ((Integer) obj2).intValue();
                EBillPaymentConfirmationScreenKt.a((EBillPaymentConfirmationComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 3:
                ((Integer) obj2).intValue();
                EBillPaymentConfirmationScreenKt.c((EBillPaymentConfirmationViewState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 4:
                ((Integer) obj2).intValue();
                EBillPaymentConfirmationScreenKt.d((TotalAmountUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 5:
                ((Integer) obj2).intValue();
                EBillPaymentHistoryScreenKt.a((EBillHistoryItemUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 6:
                ((Integer) obj2).intValue();
                EBillPaymentHistoryScreenKt.b((ElectricityBillPaymentHistoryComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 7:
                ((Integer) obj2).intValue();
                EBillPaymentHistoryScreenKt.d((ElectricityPaymentHistoryViewState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 8:
                ((Integer) obj2).intValue();
                EBillPaymentHistoryScreenKt.f((ElectricityPaymentHistoryScreenUIState.HistoryAvailable) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 9:
                ((Integer) obj2).intValue();
                EBillPaymentHistoryScreenKt.e((ElectricityPaymentHistoryScreenUIState.NoHistoryData) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 10:
                ((Integer) obj2).intValue();
                EBillPaymentInvoiceScreenKt.a((EBillPaymentInvoiceComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 11:
                ((Integer) obj2).intValue();
                EBillPaymentInvoiceScreenKt.b((EBillPaymentInvoiceViewState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 12:
                ((Integer) obj2).intValue();
                EBillPaymentSuccessScreenKt.a((EBillPaymentSuccessComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 13:
                ((Integer) obj2).intValue();
                EBillPaymentSuccessScreenKt.b((EBillPaymentSuccessViewState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 14:
                ((Integer) obj2).intValue();
                EnterCardDetailsMainScreenKt.a((EnterCardDetailsComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 15:
                ((Integer) obj2).intValue();
                ForceAppUpdateScreenKt.a((ForceAppUpdateComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 16:
                ((Integer) obj2).intValue();
                ForceAppUpdateScreenKt.b((ForceAppUpdateUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 17:
                ((Integer) obj2).intValue();
                FromToStopComposableKt.a((FromAndToStopUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 18:
                ((Integer) obj2).intValue();
                FullJourneyTicketCardComposableKt.a((FullJourneyTicketCardUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 19:
                ((Integer) obj2).intValue();
                FullScreenImageSectionKt.a((FullScreenImageUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 20:
                ((Integer) obj2).intValue();
                GenderSelectionDialogKt.b((GenderSelectionDialogUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 21:
                ((Integer) obj2).intValue();
                GenericErrorBottomSheetKt.a((GenericErrorBottomSheetUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 22:
                ((Integer) obj2).intValue();
                GroupTicketLegSelectionMainScreenKt.a((GroupTicketLegSelectionComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 23:
                ((Integer) obj2).intValue();
                GroupTicketPassengerSelectionBottomSheetComposableKt.a((FareBreakupSectionUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 24:
                ((Integer) obj2).intValue();
                GroupTicketSummaryScreenKt.a((GroupTicketSummaryComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 25:
                ((Integer) obj2).intValue();
                GroupTicketSummaryScreenKt.b((GroupTicketSummaryViewState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 26:
                ((Integer) obj2).intValue();
                InaiCheckoutScreenKt.a((InaiCheckoutComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 27:
                ((Integer) obj2).intValue();
                IndividualStepTicketCardComposableKt.a((IndividualStepsTicketCardUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 28:
                int iIntValue = ((Integer) obj2).intValue();
                return InfiniteTransition.run$lambda$2((InfiniteTransition) this.c, this.b, (Composer) obj, iIntValue);
            default:
                ((Integer) obj2).intValue();
                ItinerarySingleLegCardKt.g((LiveEtaInfoUiState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
        }
    }
}
