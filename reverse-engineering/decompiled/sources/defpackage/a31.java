package defpackage;

import androidx.compose.material3.SegmentedButtonDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import app.chalo.home.ui.savedplacesandrides.LoadingShimmerUIState;
import app.chalo.home.ui.savedplacesandrides.RidesUIState;
import app.chalo.home.ui.savedplacesandrides.SavedPlaceUIState;
import app.chalo.home.ui.savedplacesandrides.SavedPlacesAndRidesComponent;
import app.chalo.home.ui.savedplacesandrides.SavedPlacesAndRidesScreenKt;
import app.chalo.home.ui.savedplacesandrides.SavedPlacesAndRidesViewState;
import app.chalo.home.ui.savedplacesandrides.SavedRideUIState;
import app.chalo.home.ui.savedplacesandrides.WorkAndHomeUIState;
import app.chalo.home.ui.selectride.RideSavedSuccessFailureScreenUIState;
import app.chalo.home.ui.selectridescreen.SelectRideComponent;
import app.chalo.home.ui.selectridescreen.SelectRideMainScreenKt;
import app.chalo.instantticket.ui.routeselection.RouteBasedStopSearchForProductPurchaseComponent;
import app.chalo.instantticket.ui.routeselection.compose.RouteSelectionComposableKt;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.routemap.RouteMapInfoWindowKt;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.screentype.RouteTimeTableKt;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsViewTypeUIState;
import app.chalo.livetracking.ui.routedetailsscreen.routemap.LiveVehiclesMarkerUIState;
import app.chalo.livetracking.ui.routedetailsscreen.routemap.RouteDetailsStopMarkerUIState;
import app.chalo.metro.ui.regular.StopBasedMetroLandingScreenComponent;
import app.chalo.metro.ui.regular.compose.StopBasedMetroLandingScreenKt;
import app.chalo.onboarding.splash.SplashScreenComponent;
import app.chalo.onboarding.splash.ui.SplashScreenKt;
import app.chalo.premiumbus.ui.slotselectionlist.SlotSelectionListComponent;
import app.chalo.premiumbus.ui.slotselectionlist.compose.SlotSelectionListMainScreenKt;
import app.chalo.productactivation.ui.StepBasedRouteDetailsSectionComposableKt;
import app.chalo.productactivation.ui.uistate.StepBasedRouteDetailsSectionUIState;
import app.chalo.productbooking.pickroutelocation.NoRoutesUiState;
import app.chalo.productbooking.pickroutelocation.RouteItemUiState;
import app.chalo.productbooking.pickroutelocation.ui.RouteSearchItemComposableKt;
import app.chalo.ridehailing.feedback.RideFeedbackCtaUIState;
import app.chalo.ridehailing.feedback.RideFeedbackHeaderCtaUISState;
import app.chalo.ridehailing.feedback.RideFeedbackReasonCardUIState;
import app.chalo.ridehailing.feedback.RideFeedbackSubtagCardUIState;
import app.chalo.ridehailing.feedback.RideFeedbackThankYouUIState;
import app.chalo.ridehailing.feedback.RideFeedbackUserRatingCardUIState;
import app.chalo.ridehailing.feedback.RideUserFeedbackScreenKt;
import app.chalo.sos.SendSosConfirmationDialog;
import app.chalo.sos.SosScreenComponent;
import app.chalo.sos.SosScreenUIKt;
import app.chalo.sos.SosScreenUIState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a31 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a31(Object obj, int i, int i2) {
        this.f158a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f158a) {
            case 0:
                ((Integer) obj2).intValue();
                RideUserFeedbackScreenKt.g((RideFeedbackReasonCardUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 1:
                ((Integer) obj2).intValue();
                RideUserFeedbackScreenKt.b((RideFeedbackHeaderCtaUISState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 2:
                ((Integer) obj2).intValue();
                RideUserFeedbackScreenKt.j((RideFeedbackUserRatingCardUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 3:
                ((Integer) obj2).intValue();
                RideUserFeedbackScreenKt.h((RideFeedbackSubtagCardUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 4:
                ((Integer) obj2).intValue();
                RideUserFeedbackScreenKt.i((RideFeedbackThankYouUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 5:
                ((Integer) obj2).intValue();
                RideUserFeedbackScreenKt.e((RideFeedbackCtaUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 6:
                ((Integer) obj2).intValue();
                RouteMapInfoWindowKt.a((RouteDetailsStopMarkerUIState.StopMarkerInfoWindowUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 7:
                ((Integer) obj2).intValue();
                RouteMapInfoWindowKt.b((LiveVehiclesMarkerUIState.VehicleNumberViewUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 8:
                ((Integer) obj2).intValue();
                RouteSearchItemComposableKt.d((RouteItemUiState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 9:
                ((Integer) obj2).intValue();
                RouteSearchItemComposableKt.b((NoRoutesUiState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 10:
                ((Integer) obj2).intValue();
                RouteSelectionComposableKt.a((RouteBasedStopSearchForProductPurchaseComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 11:
                ((Integer) obj2).intValue();
                RouteTimeTableKt.a((RouteDetailsViewTypeUIState.TimeTable) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 12:
                ((Integer) obj2).intValue();
                SavedPlacesAndRidesScreenKt.d((SavedPlacesAndRidesComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 13:
                ((Integer) obj2).intValue();
                SavedPlacesAndRidesScreenKt.c((SavedPlaceUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 14:
                ((Integer) obj2).intValue();
                SavedPlacesAndRidesScreenKt.a((LoadingShimmerUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 15:
                ((Integer) obj2).intValue();
                SavedPlacesAndRidesScreenKt.e((SavedPlacesAndRidesViewState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 16:
                ((Integer) obj2).intValue();
                SavedPlacesAndRidesScreenKt.h((WorkAndHomeUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 17:
                ((Integer) obj2).intValue();
                SavedPlacesAndRidesScreenKt.b((RidesUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 18:
                ((Integer) obj2).intValue();
                SavedPlacesAndRidesScreenKt.g((SavedRideUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 19:
                int iIntValue = ((Integer) obj2).intValue();
                return SegmentedButtonDefaults.ActiveIcon$lambda$1((SegmentedButtonDefaults) this.c, this.b, (Composer) obj, iIntValue);
            case 20:
                ((Integer) obj2).intValue();
                SelectRideMainScreenKt.b((SelectRideComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 21:
                ((Integer) obj2).intValue();
                SelectRideMainScreenKt.a((RideSavedSuccessFailureScreenUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 22:
                ((Integer) obj2).intValue();
                SlotSelectionListMainScreenKt.b((SlotSelectionListComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 23:
                ((Integer) obj2).intValue();
                SosScreenUIKt.h((SosScreenComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 24:
                ((Integer) obj2).intValue();
                SosScreenUIKt.a((SendSosConfirmationDialog) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 25:
                ((Integer) obj2).intValue();
                SosScreenUIKt.i((SosScreenUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 26:
                ((Integer) obj2).intValue();
                SplashScreenKt.f((SplashScreenComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 27:
                ((Integer) obj2).intValue();
                StepBasedRouteDetailsSectionComposableKt.a((StepBasedRouteDetailsSectionUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 28:
                ((Integer) obj2).intValue();
                app.chalo.compose.components.multimodal.StepBasedRouteDetailsSectionComposableKt.a((app.chalo.uistate.multimodal.StepBasedRouteDetailsSectionUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            default:
                ((Integer) obj2).intValue();
                StopBasedMetroLandingScreenKt.a((StopBasedMetroLandingScreenComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
        }
    }
}
