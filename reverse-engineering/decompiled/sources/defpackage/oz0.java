package defpackage;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsState;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerItineraryUiModel;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationDataState;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.QrScreenBottomSheetType;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class oz0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18989a;
    public final /* synthetic */ TripPlannerItineraryUiModel b;

    public /* synthetic */ oz0(TripPlannerItineraryUiModel tripPlannerItineraryUiModel, int i) {
        this.f18989a = i;
        this.b = tripPlannerItineraryUiModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f18989a) {
            case 0:
                return QRValidationDataState.a((QRValidationDataState) obj, null, false, null, null, 0L, 0L, null, null, null, null, false, false, null, QrScreenBottomSheetType.JOURNEY_DETAILS, this.b, false, false, 40959);
            default:
                TripPlannerDetailsState state = (TripPlannerDetailsState) obj;
                Intrinsics.i(state, "state");
                TripPlannerItineraryUiModel tripPlannerItineraryUiModel = this.b;
                return TripPlannerDetailsState.a(state, tripPlannerItineraryUiModel.d, tripPlannerItineraryUiModel.b, Integer.valueOf(tripPlannerItineraryUiModel.c), null, null, null, null, null, TypedValues.PositionType.TYPE_PERCENT_HEIGHT);
        }
    }
}
