package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import app.chalo.data.PremiumBusProductOptionsAppModel;
import app.chalo.data.ProductBookingBranding;
import app.chalo.data.ProductBookingBrandingKt;
import app.chalo.home.ui.chalobus.PremiumBusTutorialScreenKt;
import app.chalo.home.ui.chalobus.PremiumBusTutorialViewState;
import app.chalo.home.ui.premiumbus.prebookedtickets.newactivation.PremiumBusStopInfoWindowKt;
import app.chalo.livetracking.provider.tracking.model.StopLiveEtaUiModel;
import app.chalo.metro.ui.landing.compose.components.ProductBannerKt;
import app.chalo.metro.ui.uistate.ProductBannerUIState;
import app.chalo.premiumbus.compose.PricingEngineRuleExpiryBannerKt;
import app.chalo.premiumbus.compose.PricingEngineRuleExpiryBannerUIState;
import app.chalo.premiumbus.prebookedtickets.newactivation.PremiumBusProductOptionActionNotAllowedBottomSheetKt;
import app.chalo.premiumbus.prebookedtickets.newactivation.PremiumBusTrackingStateKt;
import app.chalo.premiumbus.prebookedtickets.ui.activation.PremiumBusTripScheduleTagTextKt;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.livetrackinghandler.PremiumBusStopType;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusTripScheduleTag;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketTrackingState;
import app.chalo.premiumbus.ui.faredetails.compose.PremiumBusFreshPurchaseFareDetailsScreenKt;
import app.chalo.premiumbus.ui.faredetails.compose.PremiumBusThroughPassFareDetailsScreenKt;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsContent;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusPassengerDetailsSectionUiState;
import app.chalo.premiumbus.ui.passpurchaselanding.NewRouteSuggestionUIState;
import app.chalo.premiumbus.ui.passpurchaselanding.compose.PremiumBusNewRouteSuggestionScreenKt;
import app.chalo.premiumbus.ui.seatselection.compose.PremiumBusSeatSelectionComposablesKt;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.GenderConfirmationBottomSheetUIState;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.GenderPreferenceNudgeCardUIState;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.SeatLayoutUIState;
import app.chalo.premiumbus.ui.slotselection.NoRideAvailableForSelectedTimeUIState;
import app.chalo.premiumbus.ui.slotselection.PBSlotSelectionTabItemUIState;
import app.chalo.premiumbus.ui.slotselection.PassPurchaseNudgeCardUIState;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionToolBarUIState;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionUiStateKt;
import app.chalo.premiumbus.ui.slotselection.SlotSelectionFullScreenErrorUIState;
import app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionComponent;
import app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionViewState;
import app.chalo.premiumbus.ui.stopselection.compose.PremiumBusLandingScreenKt;
import app.chalo.premiumbus.ui.stopselection.compose.PremiumBusStopSelectionMainScreenKt;
import app.chalo.premiumbus.ui.stopselection.compose.PremiumBusStopSelectionScreenKt;
import app.chalo.productactivation.ui.ProductActivationScreenKt;
import app.chalo.productactivation.ui.UserProfilingTicketActivationBannerUIState;
import app.chalo.productbooking.common.compose.PriceAndTermsSectionKt;
import app.chalo.productbooking.common.uistate.TermsAndConditionsUiState;
import app.chalo.productpurchase.productselection.ui.ProductSelectionListHeader;
import app.chalo.productpurchase.productselection.ui.ProductSelectionProductsListUIState;
import app.chalo.productpurchase.productselection.ui.ProductSelectionScreenKt;
import app.chalo.productpurchase.productselection.ui.ProductSelectionSectionItemUIState;
import app.chalo.productpurchase.productselection.ui.ProductSelectionSkeletonLoadingUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.utils.timeutil.TimeUtilsContract;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class bu0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11231a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bu0(int i, int i2, Modifier modifier, Object obj) {
        this.f11231a = i2;
        this.b = modifier;
        this.d = obj;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11231a) {
            case 0:
                ((Integer) obj2).getClass();
                PremiumBusFreshPurchaseFareDetailsScreenKt.i((PremiumBusPassengerDetailsSectionUiState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                PremiumBusLandingScreenKt.c((Modifier) this.b, (ContentScale) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                PremiumBusNewRouteSuggestionScreenKt.a((Modifier) this.b, (NewRouteSuggestionUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                PremiumBusProductOptionActionNotAllowedBottomSheetKt.a((PremiumBusProductOptionsAppModel) this.d, (Function0) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                PremiumBusSeatSelectionComposablesKt.g((GenderConfirmationBottomSheetUIState.SuccessUIState) this.d, (Function0) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                PremiumBusSeatSelectionComposablesKt.b((GenderConfirmationBottomSheetUIState) this.d, (Function0) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                PremiumBusSeatSelectionComposablesKt.i((Modifier) this.b, (SeatLayoutUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                PremiumBusSeatSelectionComposablesKt.c((GenderPreferenceNudgeCardUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 8:
                ((Integer) obj2).intValue();
                PremiumBusSlotSelectionUiStateKt.p((PremiumBusSlotSelectionToolBarUIState) this.d, (Function0) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                PremiumBusSlotSelectionUiStateKt.r((Modifier) this.b, (SlotSelectionFullScreenErrorUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 10:
                ((Integer) obj2).intValue();
                PremiumBusSlotSelectionUiStateKt.s((TextUIState.ChaloTextUIState) this.d, (TextUIState.ChaloTextUIState) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                PremiumBusSlotSelectionUiStateKt.t((PBSlotSelectionTabItemUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                PremiumBusSlotSelectionUiStateKt.d((Modifier) this.b, (NoRideAvailableForSelectedTimeUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                PremiumBusSlotSelectionUiStateKt.i((Modifier) this.b, (PassPurchaseNudgeCardUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 14:
                ((Integer) obj2).intValue();
                PremiumBusStopInfoWindowKt.a((PremiumBusStopType) this.d, (StopLiveEtaUiModel) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                PremiumBusStopSelectionMainScreenKt.a((PremiumBusStopSelectionComponent) this.d, (TimeUtilsContract) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 16:
                ((Integer) obj2).intValue();
                PremiumBusStopSelectionScreenKt.j((PremiumBusStopSelectionViewState) this.d, (Function1) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                PremiumBusThroughPassFareDetailsScreenKt.a((PremiumBusFareDetailsContent.ThroughPass) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                PremiumBusTrackingStateKt.b((Modifier) this.b, (PremiumReserveTicketTrackingState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                PremiumBusTripScheduleTagTextKt.a((PremiumBusTripScheduleTag) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 20:
                ((Integer) obj2).intValue();
                PremiumBusTutorialScreenKt.b((PremiumBusTutorialViewState) this.d, (Function1) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                PriceAndTermsSectionKt.b((Modifier) this.b, (TermsAndConditionsUiState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                PricingEngineRuleExpiryBannerKt.a((PricingEngineRuleExpiryBannerUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                ProductActivationScreenKt.d((Modifier) this.b, (UserProfilingTicketActivationBannerUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                ProductBannerKt.a((Modifier) this.b, (ProductBannerUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                ProductBookingBrandingKt.a((Modifier) this.b, (ProductBookingBranding) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                ProductSelectionScreenKt.f((ProductSelectionProductsListUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                ProductSelectionScreenKt.e((ProductSelectionSkeletonLoadingUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                ProductSelectionScreenKt.a((ProductSelectionSectionItemUIState.ProductItemUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ProductSelectionScreenKt.i((ProductSelectionListHeader) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ bu0(Object obj, Object obj2, int i, int i2) {
        this.f11231a = i2;
        this.d = obj;
        this.b = obj2;
        this.c = i;
    }
}
