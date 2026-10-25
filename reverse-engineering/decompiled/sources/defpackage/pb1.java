package defpackage;

import app.chalo.livetracking.search.StopBasedTripPlannerSearchViewIntent;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultIntent;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerTabType;
import app.chalo.stoptripdetails.ui.StopTripDetailsIntent;
import app.chalo.titoridedetail.ui.TitoRideDetailsIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class pb1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19020a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ pb1(Function1 function1, int i) {
        this.f19020a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19020a) {
            case 0:
                this.b.invoke(StopBasedTripPlannerSearchViewIntent.BottomSheetCloseClickedIntent.f4491a);
                break;
            case 1:
                this.b.invoke(StopBasedTripPlannerSearchViewIntent.BottomSheetCloseClickedIntent.f4491a);
                break;
            case 2:
                this.b.invoke(StopTripDetailsIntent.ErrorScreenRetryButtonClickIntent.f9513a);
                break;
            case 3:
                this.b.invoke(StopTripPlannerResultIntent.NearbyStopsResultsHeaderClickedIntent.f4544a);
                break;
            case 4:
                this.b.invoke(StopTripPlannerResultIntent.LiveTrackingNotAvailableBottomSheetNegativeButtonClick.f4541a);
                break;
            case 5:
                this.b.invoke(StopTripPlannerResultIntent.BottomSheetCloseClickedIntent.f4535a);
                break;
            case 6:
                this.b.invoke(Boolean.TRUE);
                break;
            case 7:
                this.b.invoke(Boolean.FALSE);
                break;
            case 8:
                this.b.invoke(new StopTripPlannerResultIntent.SearchStopUpdateFieldClickedIntent(true));
                break;
            case 9:
                this.b.invoke(new StopTripPlannerResultIntent.SearchStopUpdateFieldClickedIntent(false));
                break;
            case 10:
                this.b.invoke(StopTripPlannerResultIntent.OnSwapButtonClick.f4550a);
                break;
            case 11:
                this.b.invoke(StopTripPlannerResultIntent.BottomSheetCloseClickedIntent.f4535a);
                break;
            case 12:
                this.b.invoke(StopTripPlannerResultIntent.NearbyStopBottomSheetSearchClick.f4543a);
                break;
            case 13:
                this.b.invoke(StopTripPlannerResultIntent.BottomSheetCloseClickedIntent.f4535a);
                break;
            case 14:
                this.b.invoke(StopTripPlannerResultIntent.RefreshNudgeClickedIntent.f4554a);
                break;
            case 15:
                this.b.invoke(StopTripPlannerResultIntent.OnTryAgainClick.f4553a);
                break;
            case 16:
                this.b.invoke(new StopTripPlannerResultIntent.ResultTypeTabClickedIntent(StopTripPlannerTabType.CONNECTING));
                break;
            case 17:
                this.b.invoke(StopTripPlannerResultIntent.BottomSheetCloseClickedIntent.f4535a);
                break;
            case 18:
                this.b.invoke(StopTripPlannerResultIntent.OnBackPressed.f4545a);
                break;
            case 19:
                this.b.invoke(StopTripPlannerResultIntent.OnReportProblemClicked.f4547a);
                break;
            case 20:
                this.b.invoke(StopTripPlannerResultIntent.NearbyStopBottomSheetSearchClick.f4543a);
                break;
            case 21:
                this.b.invoke(StopTripPlannerResultIntent.BottomSheetCloseClickedIntent.f4535a);
                break;
            case 22:
                this.b.invoke(StopTripPlannerResultIntent.NearbyStopBottomSheetSearchClick.f4543a);
                break;
            case 23:
                this.b.invoke(StopTripPlannerResultIntent.BottomSheetCloseClickedIntent.f4535a);
                break;
            case 24:
                this.b.invoke(StopTripPlannerResultIntent.LiveTrackingNotAvailableBottomSheetPositiveButtonClick.f4542a);
                break;
            case 25:
                this.b.invoke(TitoRideDetailsIntent.SlideToTapOutIntent.f9716a);
                break;
            case 26:
                this.b.invoke(TitoRideDetailsIntent.BackButtonClickIntent.f9710a);
                break;
            case 27:
                this.b.invoke(TitoRideDetailsIntent.MissedTapOutIntent.f9713a);
                break;
            case 28:
                this.b.invoke(TitoRideDetailsIntent.TapOutCompleteBottomSheetExitButtonClickIntent.f9717a);
                break;
            default:
                this.b.invoke(TitoRideDetailsIntent.TapOutCompleteBottomSheetViewReceiptButtonClickIntent.f9718a);
                break;
        }
        return Unit.f17538a;
    }
}
