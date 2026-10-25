package defpackage;

import androidx.compose.runtime.retain.RetainedEffectKt;
import app.chalo.home.ui.regularbus.RegularBusViewIntent;
import app.chalo.instantticket.ui.routeselection.RouteSelectionIntent;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsIntent;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteDetailsStopsListUIStateFactory;
import app.chalo.ridehailing.feedback.RideFeedbackViewIntents;
import app.chalo.routeselection.ui.StopBasedRouteSearchIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class t11 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19619a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ t11(Function1 function1, int i) {
        this.f19619a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f19619a;
        RegularBusViewIntent.SeeAllPassesClickedIntent seeAllPassesClickedIntent = RegularBusViewIntent.SeeAllPassesClickedIntent.f3658a;
        RouteDetailsIntent.OnBackPressed onBackPressed = RouteDetailsIntent.OnBackPressed.f4843a;
        Unit unit = Unit.f17538a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                function1.invoke(RegularBusViewIntent.MapClickedIntent.f3644a);
                return unit;
            case 1:
                function1.invoke(seeAllPassesClickedIntent);
                return unit;
            case 2:
                function1.invoke(seeAllPassesClickedIntent);
                return unit;
            case 3:
                function1.invoke(RegularBusViewIntent.SeatOccupancyInfoBottomSheetPositiveCtaClickedIntent.f3656a);
                return unit;
            case 4:
                function1.invoke(RegularBusViewIntent.SeatOccupancyInfoBottomSheetNegativeCtaClickedIntent.f3655a);
                return unit;
            case 5:
                function1.invoke(new RegularBusViewIntent.PermissionRationaleDialogInteraction(true));
                return unit;
            case 6:
                return RetainedEffectKt.RetainedEffect$lambda$1$0(function1);
            case 7:
                return RetainedEffectKt.RetainedEffect$lambda$0$0(function1);
            case 8:
                return RetainedEffectKt.RetainedEffect$lambda$2$0(function1);
            case 9:
                return RetainedEffectKt.RetainedEffect$lambda$3$0(function1);
            case 10:
                function1.invoke(RideFeedbackViewIntents.OnSubmitFeedbackCtaClick.f9167a);
                return unit;
            case 11:
                function1.invoke(RideFeedbackViewIntents.OnSkipUserFeedbackCtaClick.f9166a);
                return unit;
            case 12:
                function1.invoke(RideFeedbackViewIntents.OnAnimationCompletedIntent.f9160a);
                return unit;
            case 13:
                function1.invoke(RideFeedbackViewIntents.OnSeeTripDetailsCardClick.f9165a);
                return unit;
            case 14:
                function1.invoke(RideFeedbackViewIntents.OnNeedHelpClick.f9164a);
                return unit;
            case 15:
                float f = RouteDetailsStopsListUIStateFactory.c;
                function1.invoke(RouteDetailsIntent.ReportProblemButtonClicked.f4856a);
                return unit;
            case 16:
                float f2 = RouteDetailsStopsListUIStateFactory.c;
                function1.invoke(RouteDetailsIntent.OnViaStringClickedIntent.f4853a);
                return unit;
            case 17:
                float f3 = RouteDetailsStopsListUIStateFactory.c;
                function1.invoke(RouteDetailsIntent.OnDropDownIconClick.f4844a);
                return unit;
            case 18:
                float f4 = RouteDetailsStopsListUIStateFactory.c;
                function1.invoke(RouteDetailsIntent.ChangeUserDestinationClickedIntent.f4836a);
                return unit;
            case 19:
                function1.invoke(onBackPressed);
                return unit;
            case 20:
                function1.invoke(onBackPressed);
                return unit;
            case 21:
                function1.invoke(onBackPressed);
                return unit;
            case 22:
                function1.invoke(onBackPressed);
                return unit;
            case 23:
                function1.invoke(onBackPressed);
                return unit;
            case 24:
                function1.invoke(RouteDetailsIntent.OnRetryClicked.f4849a);
                return unit;
            case 25:
                function1.invoke(RouteDetailsIntent.OnMyLocationClicked.f4847a);
                return unit;
            case 26:
                function1.invoke(RouteDetailsIntent.OnViaStringDialogCloseClickIntent.f4854a);
                return unit;
            case 27:
                function1.invoke(RouteDetailsIntent.OnMapLoaded.f4846a);
                return unit;
            case 28:
                function1.invoke(StopBasedRouteSearchIntent.HideBottomSheetIntentBasedRoute.f9197a);
                return unit;
            default:
                function1.invoke(RouteSelectionIntent.SelectRouteClicked.f3966a);
                return unit;
        }
    }
}
