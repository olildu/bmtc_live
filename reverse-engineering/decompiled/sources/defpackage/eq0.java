package defpackage;

import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import app.chalo.checkout.ui.screen.payment.PaymentViewState;
import app.chalo.checkout.ui.screen.payment.compose.PaymentMainScreenKt;
import app.chalo.home.ui.common.PendingRideFeedbackCardKt;
import app.chalo.ncmc.ui.pendingrecharge.PendingRechargeViewState;
import app.chalo.ncmc.ui.pendingrecharge.compose.PendingRechargeScreenKt;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsDialogType;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsScreenKt;
import app.chalo.premiumbus.prebookedtickets.newactivation.PostValidationScreenKt;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumBusReserveTicketActivationState;
import app.chalo.premiumbus.ui.bulkbookingsuccess.PremiumBusBulkBookingConfirmationViewState;
import app.chalo.premiumbus.ui.bulkbookingsuccess.compose.PremiumBusBulkBookingSuccessMainScreenKt;
import app.chalo.premiumbus.ui.changestop.ChangeStopScreenContent;
import app.chalo.premiumbus.ui.changestop.PbStopInfoCardUIState;
import app.chalo.premiumbus.ui.changestop.PremiumBusChangeStopComposablesKt;
import app.chalo.premiumbus.ui.changestop.PremiumBusChangeStopScreenKt;
import app.chalo.premiumbus.ui.faredetails.compose.PremiumBusFareDetailsCommonViewsKt;
import app.chalo.premiumbus.ui.faredetails.compose.PremiumBusFareDetailsScaffoldKt;
import app.chalo.premiumbus.ui.faredetails.compose.PremiumBusFareDetailsTripSummaryCardKt;
import app.chalo.premiumbus.ui.faredetails.compose.PremiumBusFreshPurchaseFareDetailsScreenKt;
import app.chalo.premiumbus.ui.faredetails.contract.PassUpsellOfferCardUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusCouponCardUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusDiscountTagUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsContent;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsErrorScreenUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsTermsUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareSplitSectionUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusIconWithTextUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusOfferHeaderStripUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusOffersSectionUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusPassengerCounterUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusRouteDetailsUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusSectionNoteUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusSelectedSeatsUiState;
import app.chalo.premiumbus.ui.slotselection.ODPairTagsUIState;
import app.chalo.productbooking.pickroutelocation.PickRouteLocationViewState;
import app.chalo.productbooking.pickroutelocation.ui.PickRouteLocationComposableKt;
import app.chalo.productbooking.pickstop.PickStopViewState;
import app.chalo.productbooking.pickstop.ui.PickStopScreenKt;
import app.chalo.quickpay.ui.payforticket.PayForTicketViewState;
import app.chalo.quickpay.ui.payforticket.compose.PayForTicketScreenKt;
import app.chalo.ridefeedback.data.app.PendingRideFeedbackAppModel;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.validationsdk.blevalidation.ui.common.PostValidationSuccessBottomSheetKt;
import app.chalo.validationsdk.blevalidation.ui.common.QRValidationBottomSheetUIState;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class eq0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15579a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ eq0(Object obj, Object obj2, int i, int i2) {
        this.f15579a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15579a) {
            case 0:
                ((Integer) obj2).intValue();
                PayForTicketScreenKt.f((PayForTicketViewState) this.c, (Function1) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                PaymentMainScreenKt.c((PaymentViewState) this.c, (SheetState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                PbBulkBookingRideDetailsScreenKt.e((PbBulkBookingRideDetailsDialogType.PassDateChangeFailureDialog) this.c, (Function0) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                PendingRechargeScreenKt.e((PendingRechargeViewState) this.c, (Function1) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                PendingRechargeScreenKt.c((Modifier) this.c, (ArrayList) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                PendingRideFeedbackCardKt.b((PendingRideFeedbackAppModel) this.c, (Function1) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 6:
                ((Integer) obj2).intValue();
                PickRouteLocationComposableKt.b((PickRouteLocationViewState) this.c, (FocusRequester) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 7:
                ((Integer) obj2).intValue();
                PickStopScreenKt.b((PickStopViewState) this.c, (FocusRequester) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 8:
                ((Integer) obj2).intValue();
                PostValidationScreenKt.b((NewPremiumBusReserveTicketActivationState) this.c, (Function1) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                PostValidationSuccessBottomSheetKt.a((QRValidationBottomSheetUIState.PostValidationSuccessBottomSheetUIState) this.c, (Modifier) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 10:
                ((Integer) obj2).intValue();
                PremiumBusBulkBookingSuccessMainScreenKt.b((PremiumBusBulkBookingConfirmationViewState) this.c, (SheetState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                PremiumBusChangeStopComposablesKt.b((Modifier) this.c, (PbStopInfoCardUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                PremiumBusChangeStopComposablesKt.a((Modifier) this.c, (ODPairTagsUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 13:
                ((Integer) obj2).intValue();
                PremiumBusChangeStopScreenKt.a((ChangeStopScreenContent.NoStopsAvailable) this.c, (Function0) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                PremiumBusFareDetailsCommonViewsKt.b((Modifier) this.c, (Function3) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                PremiumBusFareDetailsCommonViewsKt.e((ButtonUIState) this.c, (Modifier) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                PremiumBusFareDetailsCommonViewsKt.d((PassUpsellOfferCardUiState) this.c, (Modifier) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                PremiumBusFareDetailsCommonViewsKt.c((PremiumBusOfferHeaderStripUiState) this.c, (Modifier) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                PremiumBusFareDetailsScaffoldKt.a((PremiumBusFareDetailsErrorScreenUiState) this.c, (Modifier) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                PremiumBusFareDetailsTripSummaryCardKt.b((PremiumBusIconWithTextUiState) this.c, (Modifier) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                PremiumBusFareDetailsTripSummaryCardKt.c((PremiumBusRouteDetailsUiState) this.c, (Modifier) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                PremiumBusFareDetailsTripSummaryCardKt.d((PremiumBusSelectedSeatsUiState) this.c, (Modifier) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                PremiumBusFreshPurchaseFareDetailsScreenKt.g((PremiumBusOffersSectionUiState) this.c, (Modifier) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                PremiumBusFreshPurchaseFareDetailsScreenKt.a((PremiumBusCouponCardUiState) this.c, (Modifier) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                PremiumBusFreshPurchaseFareDetailsScreenKt.b((PremiumBusDiscountTagUiState) this.c, (Modifier) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                PremiumBusFreshPurchaseFareDetailsScreenKt.h((PremiumBusPassengerCounterUiState) this.c, (Modifier) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                PremiumBusFreshPurchaseFareDetailsScreenKt.d((PremiumBusFareSplitSectionUiState) this.c, (Modifier) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                PremiumBusFreshPurchaseFareDetailsScreenKt.e((PremiumBusFareDetailsContent.FreshPurchase) this.c, (Modifier) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                PremiumBusFreshPurchaseFareDetailsScreenKt.l((PremiumBusFareDetailsTermsUiState) this.c, (Modifier) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                PremiumBusFreshPurchaseFareDetailsScreenKt.k((PremiumBusSectionNoteUiState) this.c, (Modifier) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
        }
        return Unit.f17538a;
    }
}
