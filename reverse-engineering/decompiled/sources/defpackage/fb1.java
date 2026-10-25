package defpackage;

import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.material3.ToggleableAppBarItem;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import app.chalo.compose.components.dialogs.TncDialogUIKt;
import app.chalo.core.compose.SuperPassParentScreenKt;
import app.chalo.core.navigation.superpass.SuperPassParentComponent;
import app.chalo.home.ui.history.compose.components.TabHeaderUiStateViewKt;
import app.chalo.home.ui.history.uistate.tabheader.HeaderAndIconContainerUiState;
import app.chalo.home.ui.history.uistate.tabheader.ProfileAndCityContainerUiState;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.screentype.StopListViewKt;
import app.chalo.livetracking.search.StopBasedTripPlannerSearchComponent;
import app.chalo.livetracking.search.compose.StopBasedTripPlannerSearchScreenKt;
import app.chalo.livetracking.search.uistate.NearestStopsBottomSheetContainerUiState;
import app.chalo.livetracking.search.uistate.RecentLocationPairUIState;
import app.chalo.livetracking.search.uistate.RecentSearchSectionTypeUIState;
import app.chalo.livetracking.search.uistate.RecentSearchSectionUIState;
import app.chalo.livetracking.search.uistate.RecentSearchedItemUIState;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultsComponent;
import app.chalo.livetracking.stoptripplannerresult.compose.StopBasedTripPlannerResultScreenKt;
import app.chalo.livetracking.stoptripplannerresult.uistate.StopBasedTripPlannerUiState;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsViewTypeUIState;
import app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsScreenKt;
import app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsViewModel;
import app.chalo.productpurchase.passpurchase.ui.passbookingsuccess.SuperPassBookingSuccessComponent;
import app.chalo.productpurchase.passpurchase.ui.passbookingsuccess.SuperPassBookingSuccessScreenKt;
import app.chalo.productpurchase.passpurchase.ui.passbookingsuccess.SuperPassBookingSuccessUIState;
import app.chalo.productpurchase.passpurchase.ui.passengerselection.SuperPassPassengerSelectionUIKt;
import app.chalo.productpurchase.passpurchase.ui.passengerselection.SuperPassPassengerSelectionUIState;
import app.chalo.productpurchase.passpurchase.ui.passengerselection.SuperPassPassengerSelectionViewModel;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewScreenKt;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewViewModel;
import app.chalo.productpurchase.passpurchase.ui.proofupload.SuperPassUserProofUploadScreenKt;
import app.chalo.productpurchase.passpurchase.ui.proofupload.SuperPassUserProofUploadViewModel;
import app.chalo.productpurchase.passpurchase.ui.verificationstatus.SuperPassVerificationStatusComponent;
import app.chalo.productpurchase.passpurchase.ui.verificationstatus.SuperPassVerificationStatusScreenKt;
import app.chalo.productpurchase.passpurchase.ui.verificationstatus.SuperPassVerificationUIState;
import app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent;
import app.chalo.routeselection.ui.compose.StopBasedRouteSearchForProductPurchaseScreenKt;
import app.chalo.stoptripdetails.ui.StopTripDetailsComponent;
import app.chalo.stoptripdetails.ui.StopTripDetailsScreenKt;
import app.chalo.stoptripdetails.ui.StopTripDetailsViewState;
import app.chalo.titoridedetail.ui.TitoRideDetailsComponent;
import app.chalo.titoridedetail.ui.compose.TitoRideDataScreenKt;
import app.chalo.uistate.dialog.TnCDialogUIState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class fb1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15626a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fb1(Object obj, int i, int i2) {
        this.f15626a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15626a) {
            case 0:
                ((Integer) obj2).intValue();
                StopBasedRouteSearchForProductPurchaseScreenKt.c((StopBasedRouteSearchForProductPurchaseComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 1:
                ((Integer) obj2).intValue();
                StopBasedTripPlannerResultScreenKt.h((StopTripPlannerResultsComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 2:
                ((Integer) obj2).intValue();
                StopBasedTripPlannerResultScreenKt.i((StopBasedTripPlannerUiState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 3:
                ((Integer) obj2).intValue();
                StopBasedTripPlannerSearchScreenKt.b((NearestStopsBottomSheetContainerUiState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 4:
                ((Integer) obj2).intValue();
                StopBasedTripPlannerSearchScreenKt.d((RecentLocationPairUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 5:
                ((Integer) obj2).intValue();
                StopBasedTripPlannerSearchScreenKt.j((RecentSearchedItemUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 6:
                ((Integer) obj2).intValue();
                StopBasedTripPlannerSearchScreenKt.k((RecentSearchSectionUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 7:
                ((Integer) obj2).intValue();
                StopBasedTripPlannerSearchScreenKt.h((StopBasedTripPlannerSearchComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 8:
                ((Integer) obj2).intValue();
                StopBasedTripPlannerSearchScreenKt.i((RecentSearchSectionTypeUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 9:
                ((Integer) obj2).intValue();
                StopBasedTripPlannerSearchScreenKt.e((RecentSearchSectionTypeUIState.RecentSearches) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 10:
                ((Integer) obj2).intValue();
                StopBasedTripPlannerSearchScreenKt.c((RecentSearchSectionTypeUIState.NoRecentSearches) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 11:
                ((Integer) obj2).intValue();
                StopListViewKt.a((RouteDetailsViewTypeUIState.StopList) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 12:
                ((Integer) obj2).intValue();
                StopTripDetailsScreenKt.k((StopTripDetailsComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 13:
                ((Integer) obj2).intValue();
                StopTripDetailsScreenKt.h((StopTripDetailsViewState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 14:
                ((Integer) obj2).intValue();
                SuperPassBookingSuccessScreenKt.a((SuperPassBookingSuccessComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 15:
                ((Integer) obj2).intValue();
                SuperPassBookingSuccessScreenKt.b((SuperPassBookingSuccessUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 16:
                ((Integer) obj2).intValue();
                SuperPassEnterUserDetailsScreenKt.a((SuperPassEnterUserDetailsViewModel) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 17:
                ((Integer) obj2).getClass();
                SuperPassParentScreenKt.a((SuperPassParentComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 18:
                ((Integer) obj2).intValue();
                SuperPassPassengerSelectionUIKt.b((SuperPassPassengerSelectionViewModel) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 19:
                ((Integer) obj2).intValue();
                SuperPassPassengerSelectionUIKt.d((SuperPassPassengerSelectionUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 20:
                ((Integer) obj2).intValue();
                SuperPassProofOverviewScreenKt.i((SuperPassProofOverviewViewModel) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 21:
                ((Integer) obj2).intValue();
                SuperPassUserProofUploadScreenKt.b((SuperPassUserProofUploadViewModel) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 22:
                ((Integer) obj2).intValue();
                SuperPassVerificationStatusScreenKt.d((SuperPassVerificationStatusComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 23:
                ((Integer) obj2).intValue();
                SuperPassVerificationStatusScreenKt.e((SuperPassVerificationUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 24:
                ((Integer) obj2).intValue();
                TabHeaderUiStateViewKt.b((HeaderAndIconContainerUiState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 25:
                ((Integer) obj2).intValue();
                TabHeaderUiStateViewKt.c((ProfileAndCityContainerUiState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 26:
                int iIntValue = ((Integer) obj2).intValue();
                return TextLinkScope.LinksComposables$lambda$1((TextLinkScope) this.c, this.b, (Composer) obj, iIntValue);
            case 27:
                ((Integer) obj2).intValue();
                TitoRideDataScreenKt.q((TitoRideDetailsComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 28:
                ((Integer) obj2).intValue();
                TncDialogUIKt.d((TnCDialogUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return ToggleableAppBarItem.AppbarContent$lambda$0((ToggleableAppBarItem) this.c, this.b, (Composer) obj, iIntValue2);
        }
    }
}
