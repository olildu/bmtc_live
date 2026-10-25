package defpackage;

import app.chalo.compose.SearchFieldSectionType;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsState;
import app.chalo.usecase.ChaloCustomDateFormat;
import app.chalo.usecase.FormatTimeInMillisToGivenFormatUseCase;
import app.chalo.utils.timeutil.TimeUtilsContract;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class rl1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19221a;
    public final /* synthetic */ TripPlannerResultsComponent b;
    public final /* synthetic */ long c;

    public /* synthetic */ rl1(TripPlannerResultsComponent tripPlannerResultsComponent, long j, int i) {
        this.f19221a = i;
        this.b = tripPlannerResultsComponent;
        this.c = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TripPlannerResultsState tripPlannerResultsState = (TripPlannerResultsState) obj;
        switch (this.f19221a) {
            case 0:
                TripPlannerResultsComponent tripPlannerResultsComponent = this.b;
                TimeUtilsContract timeUtilsContract = tripPlannerResultsComponent.p;
                long j = this.c;
                return TripPlannerResultsState.a(tripPlannerResultsState, null, null, timeUtilsContract.e(j), FormatTimeInMillisToGivenFormatUseCase.a(tripPlannerResultsComponent.t, j, ChaloCustomDateFormat.DAY_NAME_WITH_DATE_FORMAT, 12), false, SearchFieldSectionType.WITHOUT_PROCEED_BTN, false, null, null, null, null, null, null, null, false, Long.valueOf(j), false, false, false, false, 1013715);
            default:
                TripPlannerResultsComponent tripPlannerResultsComponent2 = this.b;
                TimeUtilsContract timeUtilsContract2 = tripPlannerResultsComponent2.p;
                long j2 = this.c;
                return TripPlannerResultsState.a(tripPlannerResultsState, null, null, timeUtilsContract2.e(j2), FormatTimeInMillisToGivenFormatUseCase.a(tripPlannerResultsComponent2.t, j2, ChaloCustomDateFormat.DAY_NAME_WITH_DATE_FORMAT, 12), false, SearchFieldSectionType.WITHOUT_PROCEED_BTN, false, null, null, null, null, null, null, null, false, Long.valueOf(j2), false, false, false, false, 1013715);
        }
    }
}
