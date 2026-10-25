package app.chalo.livetracking.routedetails.data.model.ui;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SelectedStopEtaUiModelKt {
    public static final StopCtaActionType a(StopEtaUiModel stopEtaUiModel) {
        Intrinsics.i(stopEtaUiModel, "<this>");
        if (stopEtaUiModel instanceof StopEtaUiModel.WithEtaAvailable.FixedEta) {
            if (((StopEtaUiModel.WithEtaAvailable.FixedEta) stopEtaUiModel).f4419a.size() > 2) {
                return StopCtaActionType.ViewMoreBuses;
            }
        } else {
            if (stopEtaUiModel instanceof StopEtaUiModel.WithEtaAvailable.EstimatedEta) {
                ((StopEtaUiModel.WithEtaAvailable.EstimatedEta) stopEtaUiModel).f4418a.isEmpty();
                return null;
            }
            if (!(stopEtaUiModel instanceof StopEtaUiModel.WithTimeTable.TimeTableAvailable) && !(stopEtaUiModel instanceof StopEtaUiModel.WithTimeTable.TimeTableNotAvailable) && !stopEtaUiModel.equals(StopEtaUiModel.NotAvailable.f4416a) && !stopEtaUiModel.equals(StopEtaUiModel.LiveTrackingNotAvailable.f4415a) && !(stopEtaUiModel instanceof StopEtaUiModel.SpecificScheduledTime) && !stopEtaUiModel.equals(StopEtaUiModel.AllBusPassedStop.f4414a)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }
}
