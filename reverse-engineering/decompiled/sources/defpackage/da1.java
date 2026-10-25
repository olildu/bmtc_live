package defpackage;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.internal.CodepointTransformation;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import androidx.compose.material3.AppBarMenuState;
import androidx.compose.material3.SwipeToDismissBoxKt;
import androidx.compose.material3.SwipeToDismissBoxValue;
import androidx.compose.material3.ToggleableAppBarItem;
import androidx.compose.runtime.MutableState;
import app.chalo.citydata.data.model.app.response.NearbyStopToLocationAppModel;
import app.chalo.home.domain.ChaloUserBookingType;
import app.chalo.livetracking.search.StopBasedTripPlannerSearchViewIntent;
import app.chalo.livetracking.stoptripplannerresult.StopBasedTripPlannerResultsBottomSheetType;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultIntent;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerTabType;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerItineraryAppResponseModel;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerTabType;
import app.chalo.livetracking.tripplanner.ui.details.MetroGroupLegAppModel;
import app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsBottomSheetType;
import app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsIntent;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerLegUiModel;
import app.chalo.onboarding.splash.SplashScreenComponent;
import app.chalo.premiumbus.data.models.app.PBAvailableSlotsInfoAppModel;
import app.chalo.premiumbus.data.models.app.PBAvailableSlotsTripAppModel;
import app.chalo.premiumbus.domain.ODPairWithSlotsListAppModel;
import app.chalo.premiumbus.domain.ODPairsAndRespectiveSlotsBetweenStops;
import app.chalo.premiumbus.ui.slotselection.DateAndSlotSelectedForBulkBooking;
import app.chalo.premiumbus.ui.slotselection.MultipleSlotSelectionCalendarState;
import app.chalo.premiumbus.ui.slotselection.PBODPairWithSlotSectionListUiModel;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionIntent;
import app.chalo.premiumbus.ui.slotselection.SelectedPassInfo;
import app.chalo.premiumbus.ui.slotselection.SlotsAvailableForSelection;
import app.chalo.premiumbus.ui.slotselectionlist.SlotSelectionListComponent;
import app.chalo.premiumbus.ui.slotselectionlist.SlotSelectionListViewIntent;
import app.chalo.productpurchase.passpurchase.data.ProofUploadDetails;
import app.chalo.productpurchase.passpurchase.ui.passengerselection.SuperPassPassengerSelectionIntent;
import app.chalo.productpurchase.passpurchase.ui.passengerselection.SuperPassPassengerSelectionViewModel;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewIntent;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewViewModel;
import app.chalo.productsummary.ui.ticket.TicketSummaryIntent;
import app.chalo.recent.model.app.RecentLocationPairAppModel;
import app.chalo.recent.model.app.RecentTripAppModel;
import app.chalo.scenes.ChaloNavOptions;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.PopUpToConfig;
import app.chalo.scenes.args.UserConsentScreenArgs;
import app.chalo.sos.SosScreenIntent;
import app.chalo.sos.feature.SosContact;
import app.chalo.superpass.data.models.entities.ProofRejectionReason;
import app.chalo.superpass.data.models.entities.SuperPassUserDetails;
import app.chalo.userconsent.UserConsentFlowType;
import com.thoughtnudge.sdk.ThoughtNudge;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class da1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15442a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ da1(int i, Object obj, Object obj2) {
        this.f15442a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List list;
        ODPairWithSlotsListAppModel oDPairWithSlotsListAppModel;
        PBAvailableSlotsInfoAppModel pBAvailableSlotsInfoAppModel;
        List list2;
        switch (this.f15442a) {
            case 0:
                ((SlotSelectionListComponent) this.b).G0(new SlotSelectionListViewIntent.OnSlotSelectionClickIntent((SlotsAvailableForSelection) this.c));
                return Unit.f17538a;
            case 1:
                ((Function1) this.b).invoke(new PremiumBusSlotSelectionIntent.DateAndSlotSelectedForBulkBookingRemoveClickIntent((DateAndSlotSelectedForBulkBooking) this.c));
                return Unit.f17538a;
            case 2:
                ((Function1) this.b).invoke(new PremiumBusSlotSelectionIntent.OriginDestinationStopDetailsClickedIntent(((ODPairWithSlotsListAppModel) this.c).f7215a));
                return Unit.f17538a;
            case 3:
                Function1 function1 = (Function1) this.b;
                ODPairsAndRespectiveSlotsBetweenStops oDPairsAndRespectiveSlotsBetweenStops = ((PBODPairWithSlotSectionListUiModel) this.c).c;
                function1.invoke(new PremiumBusSlotSelectionIntent.PassPurchaseNudgeCardClickedIntent((oDPairsAndRespectiveSlotsBetweenStops == null || (list = oDPairsAndRespectiveSlotsBetweenStops.f7216a) == null || (oDPairWithSlotsListAppModel = (ODPairWithSlotsListAppModel) CollectionsKt.F(list)) == null || (pBAvailableSlotsInfoAppModel = oDPairWithSlotsListAppModel.c) == null || (list2 = pBAvailableSlotsInfoAppModel.c) == null) ? null : (PBAvailableSlotsTripAppModel) CollectionsKt.H(list2)));
                return Unit.f17538a;
            case 4:
                ((Function1) this.b).invoke(new PremiumBusSlotSelectionIntent.SelectNearByViewMoreClickedForBulkBookingIntent((List) this.c));
                return Unit.f17538a;
            case 5:
                ((Function1) this.b).invoke(new PremiumBusSlotSelectionIntent.SelectNearBySlotClickedForBulkBookingIntent(((SlotsAvailableForSelection) this.c).f7902a));
                return Unit.f17538a;
            case 6:
                Function1 function2 = (Function1) this.b;
                MultipleSlotSelectionCalendarState.ErrorState errorState = (MultipleSlotSelectionCalendarState.ErrorState) ((MultipleSlotSelectionCalendarState) this.c);
                PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel = errorState.f7799a;
                SelectedPassInfo selectedPassInfo = errorState.b;
                function2.invoke(new PremiumBusSlotSelectionIntent.AggregateSlotFetchErrorBottomSheetRetryBtnClickIntent(pBAvailableSlotsTripAppModel, selectedPassInfo.f7896a, selectedPassInfo.g));
                return Unit.f17538a;
            case 7:
                ((Function1) this.b).invoke(new SosScreenIntent.RemoveContactIntent((SosContact) this.c));
                return Unit.f17538a;
            case 8:
                ((SplashScreenComponent) this.b).k.b(new ChaloNavigationRequest.Navigate(new UserConsentScreenArgs(UserConsentFlowType.FreshLogin.INSTANCE, (String) this.c), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), null, 4));
                return Unit.f17538a;
            case 9:
                ((Function1) this.b).invoke(new StopBasedTripPlannerSearchViewIntent.OnRecentTripClicked((RecentLocationPairAppModel) this.c));
                return Unit.f17538a;
            case 10:
                ((Function1) this.b).invoke(new StopBasedTripPlannerSearchViewIntent.OnNearestStopSelected((NearbyStopToLocationAppModel) this.c));
                return Unit.f17538a;
            case 11:
                ((Function1) this.b).invoke(new StopTripPlannerResultIntent.ItineraryMoreDetailsClickedIntent(((TripPlannerItineraryAppResponseModel) this.c).f4663a));
                return Unit.f17538a;
            case 12:
                ((Function1) this.b).invoke(new StopTripPlannerResultIntent.ResultTypeTabClickedIntent((StopTripPlannerTabType) this.c));
                return Unit.f17538a;
            case 13:
                ((Function1) this.b).invoke(new StopTripPlannerResultIntent.OnShowAllNearbyStopsClick(((StopBasedTripPlannerResultsBottomSheetType.NearestStops) this.c).f4526a));
                return Unit.f17538a;
            case 14:
                ((SuperPassPassengerSelectionViewModel) this.b).s(new SuperPassPassengerSelectionIntent.PassengerSelectedIntent((SuperPassUserDetails) this.c));
                return Unit.f17538a;
            case 15:
                SuperPassProofOverviewViewModel superPassProofOverviewViewModel = (SuperPassProofOverviewViewModel) this.b;
                ProofUploadDetails proofUploadDetails = (ProofUploadDetails) this.c;
                String str = proofUploadDetails.f8316a;
                if (str.length() <= 0) {
                    str = null;
                }
                superPassProofOverviewViewModel.t(new SuperPassProofOverviewIntent.EnlargeImageIntent(str, proofUploadDetails.b, false));
                return Unit.f17538a;
            case 16:
                ((SuperPassProofOverviewViewModel) this.b).t(new SuperPassProofOverviewIntent.EnlargeImageIntent(((ProofRejectionReason) this.c).c, null, true));
                return Unit.f17538a;
            case 17:
                return SwipeToDismissBoxKt.rememberSwipeToDismissBoxState$lambda$1$lambda$0((SwipeToDismissBoxValue) this.b, (Function1) this.c);
            case 18:
                return TextFieldSelectionManager_androidKt.textFieldMagnifier$lambda$0$3$0((TextFieldSelectionManager) this.b, (MutableState) this.c);
            case 19:
                return TextFieldSelectionState.detectSelectionHandleDragGestures$lambda$4((TextFieldSelectionState) this.b, (Handle) this.c);
            case 20:
                return ThoughtNudge.registerToken$lambda$5((String) this.b, (String) this.c);
            case 21:
                return ToggleableAppBarItem.MenuContent$lambda$2$lambda$1((ToggleableAppBarItem) this.b, (AppBarMenuState) this.c);
            case 22:
                return TransformedTextFieldState.outputTransformedText$lambda$0$0((TransformedTextFieldState) this.b, (OutputTransformation) this.c);
            case 23:
                return TransformedTextFieldState.codepointTransformedText$lambda$0$0((TransformedTextFieldState) this.b, (CodepointTransformation) this.c);
            case 24:
                ((Function1) this.b).invoke(new TripPlannerDetailsIntent.BuyMetroTicketClickedIntent(((TripPlannerLegUiModel.Metro) this.c).f4757a));
                return Unit.f17538a;
            case 25:
                Function1 function3 = (Function1) this.b;
                MetroGroupLegAppModel metroGroupLegAppModel = ((TripPlannerDetailsBottomSheetType.MetroTicketPurchaseBottomSheet) ((TripPlannerDetailsBottomSheetType) this.c)).f4720a;
                function3.invoke(new TripPlannerDetailsIntent.BuyMetroTicketBottomSheetClickedIntent(metroGroupLegAppModel.f4719a, metroGroupLegAppModel.b));
                return Unit.f17538a;
            case 26:
                ((Function1) this.b).invoke(((RecentTripAppModel) this.c).e);
                return Unit.f17538a;
            case 27:
                ((Function1) this.b).invoke((TripPlannerTabType) this.c);
                return Unit.f17538a;
            case 28:
                Function1 function4 = (Function1) this.b;
                ChaloUserBookingType.TicketBooking.PremiumBusBooking premiumBusBooking = (ChaloUserBookingType.TicketBooking.PremiumBusBooking) ((ChaloUserBookingType) this.c);
                function4.invoke(new TicketSummaryIntent.DownloadInvoiceBtnClickedIntent(premiumBusBooking.f2987a, premiumBusBooking.d.f7113a.j));
                return Unit.f17538a;
            default:
                Function1 function5 = (Function1) this.b;
                ChaloUserBookingType.TicketBooking.OndcMetroTicketBooking ondcMetroTicketBooking = (ChaloUserBookingType.TicketBooking.OndcMetroTicketBooking) this.c;
                if (function5 != null) {
                    function5.invoke(ondcMetroTicketBooking);
                }
                return Unit.f17538a;
        }
    }
}
