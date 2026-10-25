package defpackage;

import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.StandardErrorScreenKt;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.StopCardKt;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.StopEtasKt;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.screentype.StopListViewKt;
import app.chalo.livetracking.search.compose.StopBasedTripPlannerSearchScreenKt;
import app.chalo.livetracking.search.uistate.NearestStopItemUIState;
import app.chalo.livetracking.search.uistate.StopBasedTripPlannerSearchViewState;
import app.chalo.livetracking.stoptripplannerresult.compose.StopBasedTripPlannerResultScreenKt;
import app.chalo.livetracking.stoptripplannerresult.uistate.LiveTrackingNotSupportedBottomSheet;
import app.chalo.livetracking.stoptripplannerresult.uistate.NearbyStopFetchErrorBottomSheetUIState;
import app.chalo.livetracking.stoptripplannerresult.uistate.NoNearbyStopsBottomSheetUIState;
import app.chalo.livetracking.stoptripplannerresult.uistate.RefreshNudgeUiState;
import app.chalo.livetracking.stoptripplannerresult.uistate.StopBasedTripPlannerUiState;
import app.chalo.livetracking.ui.routedetailsscreen.RouteStopSearchItemUIState;
import app.chalo.livetracking.ui.routedetailsscreen.RouteStopSearchResultUIState;
import app.chalo.livetracking.ui.routedetailsscreen.RouteStopSearchTextFieldUIState;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteEtaStatusUIState;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.SingleBusFixedEtaUIState;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.StopCardCtaUIState;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.StopCardUIState;
import app.chalo.multimodalticket.ui.composables.StepModeCardComposableKt;
import app.chalo.multimodalticket.ui.uistates.StepTicketSectionUIState;
import app.chalo.onboarding.splash.ui.SplashScreenKt;
import app.chalo.productpurchase.passpurchase.ui.SuperPassBookingSuccessDetailsUIKt;
import app.chalo.productpurchase.passpurchase.ui.SuperPassBookingSuccessDetailsUIState;
import app.chalo.productpurchase.passpurchase.ui.passengerselection.PassPassengerSelectionCardUIState;
import app.chalo.productpurchase.passpurchase.ui.passengerselection.SuperPassPassengerSelectionUIKt;
import app.chalo.productpurchase.passpurchase.ui.passengerselection.SuperPassPassengerSelectionUIState;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofItemsUIState;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewConsentUIState;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewNextBtnUIState;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewScreenKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.routeselection.ui.StopBasedRouteSearchViewState;
import app.chalo.routeselection.ui.compose.StopBasedRouteSearchForProductPurchaseScreenKt;
import app.chalo.sos.SosContactItemUIState;
import app.chalo.sos.SosScreenSectionHeader;
import app.chalo.sos.SosScreenTypeUIState;
import app.chalo.sos.SosScreenUIKt;
import app.chalo.uistate.error.StandardErrorScreenUIState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class sa1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19286a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sa1(int i, int i2, Modifier modifier, Object obj) {
        this.f19286a = i2;
        this.b = modifier;
        this.d = obj;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19286a) {
            case 0:
                ((Integer) obj2).intValue();
                SosScreenUIKt.g((SosScreenTypeUIState.EditMsgUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                SosScreenUIKt.d((SosContactItemUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                SosScreenUIKt.j((SosScreenSectionHeader) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                SplashScreenKt.e((IconType) this.d, (Function1) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                StandardErrorScreenKt.b((StandardErrorScreenUIState.ErrorWithMsgAndRetry) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                StepModeCardComposableKt.a((Modifier) this.b, (StepTicketSectionUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 6:
                ((Integer) obj2).intValue();
                StopBasedRouteSearchForProductPurchaseScreenKt.b((StopBasedRouteSearchViewState) this.d, (Function1) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                StopBasedTripPlannerResultScreenKt.a((Modifier) this.b, (LiveTrackingNotSupportedBottomSheet) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 8:
                ((Integer) obj2).intValue();
                StopBasedTripPlannerResultScreenKt.g((StopBasedTripPlannerUiState) this.d, (SheetState) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                StopBasedTripPlannerResultScreenKt.d((Modifier) this.b, (RefreshNudgeUiState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                StopBasedTripPlannerResultScreenKt.c((Modifier) this.b, (NoNearbyStopsBottomSheetUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                StopBasedTripPlannerResultScreenKt.b((Modifier) this.b, (NearbyStopFetchErrorBottomSheetUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                StopBasedTripPlannerSearchScreenKt.a((Modifier) this.b, (NearestStopItemUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 13:
                ((Integer) obj2).intValue();
                StopBasedTripPlannerSearchScreenKt.f((StopBasedTripPlannerSearchViewState) this.d, (SheetState) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                StopCardKt.c((StopCardUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                StopCardKt.d((StopCardCtaUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                StopCardKt.b((RouteEtaStatusUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                StopCardKt.a((RouteEtaStatusUIState.NoLiveBusAvailable) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                StopEtasKt.a((RouteEtaStatusUIState.NextScheduleTime) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                StopEtasKt.e((RouteEtaStatusUIState.StopWithFixedEtas) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                StopEtasKt.c((SingleBusFixedEtaUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                StopListViewKt.c((RouteStopSearchItemUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                StopListViewKt.b((RouteStopSearchTextFieldUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                StopListViewKt.d((RouteStopSearchResultUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 24:
                ((Integer) obj2).intValue();
                SuperPassBookingSuccessDetailsUIKt.c((SuperPassBookingSuccessDetailsUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 25:
                ((Integer) obj2).intValue();
                SuperPassPassengerSelectionUIKt.a((PassPassengerSelectionCardUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                SuperPassPassengerSelectionUIKt.c((SuperPassPassengerSelectionUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                SuperPassProofOverviewScreenKt.c((SuperPassProofItemsUIState.UserNameProof) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                SuperPassProofOverviewScreenKt.h((SuperPassProofOverviewNextBtnUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                SuperPassProofOverviewScreenKt.e((SuperPassProofOverviewConsentUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ sa1(Object obj, Object obj2, int i, int i2) {
        this.f19286a = i2;
        this.d = obj;
        this.b = obj2;
        this.c = i;
    }
}
