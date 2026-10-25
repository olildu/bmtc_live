package app.chalo.livetracking.routedetails.domain;

import app.chalo.citydata.data.model.app.RouteTiming;
import app.chalo.citydata.data.model.app.TimeTableStatus;
import app.chalo.livetracking.routedetails.data.model.ui.StopEtaUiModel;
import app.chalo.stoptripdetails.domain.GetTimeTableDisclaimerTextUseCase;
import app.chalo.utils.timeutil.TimeUtilsContract;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/domain/GetEtaUiModelForStopFromTimeTable;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetEtaUiModelForStopFromTimeTable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GetTimeTableDisclaimerTextUseCase f4430a;
    public final TimeUtilsContract b;

    public GetEtaUiModelForStopFromTimeTable(GetTimeTableDisclaimerTextUseCase getTimeTableDisclaimerTextUseCase, TimeUtilsContract timeUtilsContract) {
        this.f4430a = getTimeTableDisclaimerTextUseCase;
        this.b = timeUtilsContract;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(TimeTableStatus timeTableStatus, int i, List list, boolean z, ContinuationImpl continuationImpl) {
        GetEtaUiModelForStopFromTimeTable$invoke$1 getEtaUiModelForStopFromTimeTable$invoke$1;
        NextScheduledBusText nextScheduledBusText;
        if (continuationImpl instanceof GetEtaUiModelForStopFromTimeTable$invoke$1) {
            getEtaUiModelForStopFromTimeTable$invoke$1 = (GetEtaUiModelForStopFromTimeTable$invoke$1) continuationImpl;
            int i2 = getEtaUiModelForStopFromTimeTable$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getEtaUiModelForStopFromTimeTable$invoke$1.label = i2 - Integer.MIN_VALUE;
            } else {
                getEtaUiModelForStopFromTimeTable$invoke$1 = new GetEtaUiModelForStopFromTimeTable$invoke$1(this, continuationImpl);
            }
        } else {
            getEtaUiModelForStopFromTimeTable$invoke$1 = new GetEtaUiModelForStopFromTimeTable$invoke$1(this, continuationImpl);
        }
        Object objA = getEtaUiModelForStopFromTimeTable$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = getEtaUiModelForStopFromTimeTable$invoke$1.label;
        if (i3 == 0) {
            ResultKt.b(objA);
            if (timeTableStatus != TimeTableStatus.INVALID) {
                TimeUtilsContract timeUtilsContract = this.b;
                int iB = timeUtilsContract.B(timeUtilsContract.b());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    RouteTiming routeTiming = (RouteTiming) it.next();
                    if (!(routeTiming instanceof RouteTiming.FixedTiming)) {
                        if (!(routeTiming instanceof RouteTiming.FrequencyTiming)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        RouteTiming.FrequencyTiming frequencyTiming = (RouteTiming.FrequencyTiming) routeTiming;
                        long j = iB;
                        long j2 = frequencyTiming.e;
                        if (j > frequencyTiming.f || j2 > j) {
                            long j3 = routeTiming.f1719a;
                            if (j3 > j && z) {
                                nextScheduledBusText = new NextScheduledBusText(timeUtilsContract.x(j3), false);
                            }
                        } else {
                            nextScheduledBusText = new NextScheduledBusText(String.valueOf(frequencyTiming.g), true);
                        }
                        return new StopEtaUiModel.WithTimeTable.TimeTableAvailable(nextScheduledBusText.f4444a, nextScheduledBusText.b);
                    }
                    long j4 = routeTiming.f1719a;
                    if (j4 > iB && z) {
                        nextScheduledBusText = new NextScheduledBusText(timeUtilsContract.x(j4), false);
                        return new StopEtaUiModel.WithTimeTable.TimeTableAvailable(nextScheduledBusText.f4444a, nextScheduledBusText.b);
                    }
                }
                nextScheduledBusText = new NextScheduledBusText("", false);
                return new StopEtaUiModel.WithTimeTable.TimeTableAvailable(nextScheduledBusText.f4444a, nextScheduledBusText.b);
            }
            getEtaUiModelForStopFromTimeTable$invoke$1.label = 1;
            objA = this.f4430a.a(timeTableStatus, i, getEtaUiModelForStopFromTimeTable$invoke$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        return new StopEtaUiModel.WithTimeTable.TimeTableNotAvailable((String) objA);
    }
}
