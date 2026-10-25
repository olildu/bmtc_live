package defpackage;

import androidx.compose.material3.SearchBarKt;
import app.chalo.home.ui.savedplacesandrides.SavedPlacesAndRidesIntent;
import app.chalo.home.ui.selectridescreen.LocationSelectionType;
import app.chalo.home.ui.selectridescreen.SelectRideIntent;
import app.chalo.instantticket.ui.routeselection.RouteSelectionIntent;
import app.chalo.instantticket.ui.routeselection.RouteSelectionStopType;
import app.chalo.livetracking.routedetails.data.model.ui.StopCtaActionType;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsIntent;
import app.chalo.ncmc.ui.landing.ChaloCardInfoIntent;
import app.chalo.ncmc.ui.landing.ChaloCardOperationType;
import app.chalo.premiumbus.ui.slotselection.PremiumBusPurchaseOptionUiModel;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c41 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11253a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ c41(Function1 function1, int i) {
        this.f11253a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f11253a) {
            case 0:
                this.b.invoke(new RouteSelectionIntent.SelectStopClicked(RouteSelectionStopType.FROM));
                return Unit.f17538a;
            case 1:
                this.b.invoke(new RouteSelectionIntent.SelectStopClicked(RouteSelectionStopType.TO));
                return Unit.f17538a;
            case 2:
                this.b.invoke(RouteSelectionIntent.NextButtonClicked.f3964a);
                return Unit.f17538a;
            case 3:
                this.b.invoke(new RouteDetailsIntent.StopCtaClicked(StopCtaActionType.ViewTimeTable));
                return Unit.f17538a;
            case 4:
                this.b.invoke(RouteDetailsIntent.LiveSeatAvailabilityIndicatorInfoIconClicked.f4839a);
                return Unit.f17538a;
            case 5:
                this.b.invoke(RouteDetailsIntent.RouteBannerClickedIntent.f4862a);
                return Unit.f17538a;
            case 6:
                this.b.invoke(SavedPlacesAndRidesIntent.RetryClickedIntent.f3690a);
                return Unit.f17538a;
            case 7:
                this.b.invoke(SavedPlacesAndRidesIntent.ConfirmationDialogPositiveBtnClickIntent.f3684a);
                return Unit.f17538a;
            case 8:
                this.b.invoke(SavedPlacesAndRidesIntent.ConfirmationDialogNegativeBtnClickIntent.f3683a);
                return Unit.f17538a;
            case 9:
                this.b.invoke(SavedPlacesAndRidesIntent.ConfirmationDialogNegativeBtnClickIntent.f3683a);
                return Unit.f17538a;
            case 10:
                this.b.invoke(SavedPlacesAndRidesIntent.AddRideIntent.f3682a);
                return Unit.f17538a;
            case 11:
                return SearchBarKt.DockedSearchBar_EQC0FA8$lambda$24$lambda$23(this.b);
            case 12:
                this.b.invoke(Boolean.TRUE);
                return Unit.f17538a;
            case 13:
                this.b.invoke(Boolean.FALSE);
                return Unit.f17538a;
            case 14:
                this.b.invoke(SelectRideIntent.SuccessFailureScreenPositiveButtonClicked.f3711a);
                return Unit.f17538a;
            case 15:
                this.b.invoke(SelectRideIntent.SuccessFailureScreenNegativeButtonClicked.f3710a);
                return Unit.f17538a;
            case 16:
                this.b.invoke(SelectRideIntent.TimePickerContinueButtonClicked.f3714a);
                return Unit.f17538a;
            case 17:
                this.b.invoke(SelectRideIntent.TimePickerCancelButtonClicked.f3713a);
                return Unit.f17538a;
            case 18:
                this.b.invoke(SelectRideIntent.TimePickerCancelButtonClicked.f3713a);
                return Unit.f17538a;
            case 19:
                this.b.invoke(new SelectRideIntent.OnLocationChangeIntent(LocationSelectionType.FROM));
                return Unit.f17538a;
            case 20:
                this.b.invoke(new SelectRideIntent.OnLocationChangeIntent(LocationSelectionType.TO));
                return Unit.f17538a;
            case 21:
                this.b.invoke(SelectRideIntent.SwapOriginDestinationIntent.f3712a);
                return Unit.f17538a;
            case 22:
                this.b.invoke(ChaloCardInfoIntent.KnowMoreClicked.f6352a);
                return Unit.f17538a;
            case 23:
                this.b.invoke(new ChaloCardInfoIntent.CardOperationClicked(ChaloCardOperationType.SpecificCardOption.Recharge.f6370a));
                return Unit.f17538a;
            case 24:
                this.b.invoke(ChaloCardInfoIntent.BuyNewCardIntent.f6345a);
                return Unit.f17538a;
            case 25:
                this.b.invoke(new PremiumBusSlotSelectionIntent.PurchaseOptionClickedIntent(PremiumBusPurchaseOptionUiModel.DefaultOption.b));
                return Unit.f17538a;
            case 26:
                this.b.invoke(PremiumBusSlotSelectionIntent.DismissMultipleSlotSelectionCalendarIntent.f7868a);
                return Unit.f17538a;
            case 27:
                this.b.invoke(PremiumBusSlotSelectionIntent.DismissMultipleSlotSelectionCalendarIntent.f7868a);
                return Unit.f17538a;
            case 28:
                this.b.invoke(PremiumBusSlotSelectionIntent.MultipleSlotSelectionCalendarDismissClickIntent.f7876a);
                return Unit.f17538a;
            default:
                this.b.invoke(PremiumBusSlotSelectionIntent.LoadMoreSlotsIntent.f7873a);
                return Unit.f17538a;
        }
    }
}
