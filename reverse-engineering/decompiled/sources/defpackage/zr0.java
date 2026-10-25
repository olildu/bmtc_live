package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import app.chalo.checkout.ui.screen.postpayment.CheckoutPostPaymentComponent;
import app.chalo.checkout.ui.screen.postpayment.PostPaymentViewState;
import app.chalo.checkout.ui.screen.postpayment.compose.PostPaymentMainScreenKt;
import app.chalo.core.compose.PremiumBusParentScreenKt;
import app.chalo.core.navigation.premiumbus.PremiumBusParentComponent;
import app.chalo.home.ui.PremiumBusNotificationComponent;
import app.chalo.home.ui.PremiumBusNotificationScreenKt;
import app.chalo.home.ui.PremiumBusNotificationViewState;
import app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent;
import app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsScreenKt;
import app.chalo.premiumbus.ui.bulkbookingsuccess.PassInfoUIState;
import app.chalo.premiumbus.ui.bulkbookingsuccess.PremiumBusBulkBookingConfirmationComponent;
import app.chalo.premiumbus.ui.bulkbookingsuccess.RouteDetailInfoUIState;
import app.chalo.premiumbus.ui.bulkbookingsuccess.SlotAndSeatInfoUIState;
import app.chalo.premiumbus.ui.bulkbookingsuccess.SlotDatePillUIState;
import app.chalo.premiumbus.ui.bulkbookingsuccess.TermsAndConditionsBottomSheetUIState;
import app.chalo.premiumbus.ui.bulkbookingsuccess.compose.PremiumBusBulkBookingSuccessMainScreenKt;
import app.chalo.premiumbus.ui.changestop.PremiumBusChangeStopComponent;
import app.chalo.premiumbus.ui.changestop.PremiumBusChangeStopScreenKt;
import app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsComponent;
import app.chalo.premiumbus.ui.faredetails.compose.PremiumBusFareDetailsBaseComposableKt;
import app.chalo.premiumbus.ui.faredetails.compose.PremiumBusFareDetailsBottomSheetsKt;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsBottomSheetUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsUiState;
import app.chalo.premiumbus.ui.productselection.PremiumBusProductSelectionComponent;
import app.chalo.premiumbus.ui.productselection.PremiumBusProductSelectionScreenKt;
import app.chalo.premiumbus.ui.productselection.compose.uistate.PremiumBusProductSelectionToolBarUIState;
import app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionComponent;
import app.chalo.premiumbus.ui.seatselection.compose.PremiumBusSeatSelectionComposablesKt;
import app.chalo.premiumbus.ui.seatselection.compose.PremiumBusSeatSelectionMainScreenKt;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.GenderConfirmationBottomSheetUIState;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.PassengerCountSelectionBottomSheetUIState;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.SeatSelectionDialogTypeUIState;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.SeatTypeInfoHeaderUIState;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.SeatTypeUIState;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.SingleSeatUIState;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.WomenReservedSeatsChoiceBottomSheetUIState;
import app.chalo.productbooking.pickstop.NoResultUiState;
import app.chalo.productbooking.pickstop.PickStopViewState;
import app.chalo.productbooking.pickstop.ui.PickStopScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zr0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20226a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zr0(Object obj, int i, int i2) {
        this.f20226a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20226a) {
            case 0:
                ((Integer) obj2).intValue();
                PickStopScreenKt.c((PickStopViewState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                PickStopScreenKt.a((NoResultUiState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                PostPaymentMainScreenKt.a((CheckoutPostPaymentComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                PostPaymentMainScreenKt.b((PostPaymentViewState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                PremiumBusBulkBookingSuccessMainScreenKt.c((PremiumBusBulkBookingConfirmationComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                PremiumBusBulkBookingSuccessMainScreenKt.e((SlotAndSeatInfoUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 6:
                ((Integer) obj2).intValue();
                PremiumBusBulkBookingSuccessMainScreenKt.g((SlotDatePillUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 7:
                ((Integer) obj2).intValue();
                PremiumBusBulkBookingSuccessMainScreenKt.h((TermsAndConditionsBottomSheetUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 8:
                ((Integer) obj2).intValue();
                PremiumBusBulkBookingSuccessMainScreenKt.a((PassInfoUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 9:
                ((Integer) obj2).intValue();
                PremiumBusBulkBookingSuccessMainScreenKt.d((RouteDetailInfoUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 10:
                ((Integer) obj2).intValue();
                PremiumBusChangeStopScreenKt.b((PremiumBusChangeStopComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 11:
                ((Integer) obj2).intValue();
                PremiumBusFareDetailsBaseComposableKt.a((PremiumBusFareDetailsComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 12:
                ((Integer) obj2).intValue();
                PremiumBusFareDetailsBaseComposableKt.b((PremiumBusFareDetailsUiState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 13:
                ((Integer) obj2).intValue();
                PremiumBusFareDetailsBottomSheetsKt.a((PremiumBusFareDetailsBottomSheetUiState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 14:
                ((Integer) obj2).intValue();
                PremiumBusNotificationScreenKt.a((PremiumBusNotificationComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 15:
                ((Integer) obj2).intValue();
                PremiumBusNotificationScreenKt.b((PremiumBusNotificationViewState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                PremiumBusParentScreenKt.a((PremiumBusParentComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 17:
                ((Integer) obj2).intValue();
                PremiumBusProductModificationReasonsScreenKt.g((PremiumBusProductModificationReasonsComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 18:
                ((Integer) obj2).intValue();
                PremiumBusProductSelectionScreenKt.d((PremiumBusProductSelectionComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 19:
                ((Integer) obj2).intValue();
                PremiumBusProductSelectionScreenKt.b((PremiumBusProductSelectionToolBarUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 20:
                ((Integer) obj2).intValue();
                PremiumBusSeatSelectionComposablesKt.m((WomenReservedSeatsChoiceBottomSheetUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 21:
                ((Integer) obj2).intValue();
                PremiumBusSeatSelectionComposablesKt.a((SeatSelectionDialogTypeUIState.SeatChangeDialogTypeUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 22:
                ((Integer) obj2).intValue();
                PremiumBusSeatSelectionComposablesKt.d((GenderConfirmationBottomSheetUIState.FailureUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 23:
                ((Integer) obj2).intValue();
                PremiumBusSeatSelectionComposablesKt.e((GenderConfirmationBottomSheetUIState.LoadingUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 24:
                ((Integer) obj2).intValue();
                PremiumBusSeatSelectionComposablesKt.k((SeatTypeUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 25:
                ((Integer) obj2).intValue();
                PremiumBusSeatSelectionComposablesKt.f((GenderConfirmationBottomSheetUIState.PreferenceSelectionOptionUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 26:
                ((Integer) obj2).intValue();
                PremiumBusSeatSelectionComposablesKt.h((PassengerCountSelectionBottomSheetUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 27:
                ((Integer) obj2).intValue();
                PremiumBusSeatSelectionComposablesKt.l((SingleSeatUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 28:
                ((Integer) obj2).intValue();
                PremiumBusSeatSelectionComposablesKt.j((SeatTypeInfoHeaderUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                PremiumBusSeatSelectionMainScreenKt.a((PremiumBusSeatSelectionComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
        }
        return Unit.f17538a;
    }
}
