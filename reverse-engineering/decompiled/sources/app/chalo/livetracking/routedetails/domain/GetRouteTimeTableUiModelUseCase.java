package app.chalo.livetracking.routedetails.domain;

import app.chalo.citydata.data.model.app.RouteTiming;
import app.chalo.livetracking.routedetails.data.model.ui.RouteTripTimingUiModel;
import app.chalo.livetracking.routedetails.data.model.ui.TimeTableUiModel;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.utils.timeutil.TimeUtilsContract;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/domain/GetRouteTimeTableUiModelUseCase;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetRouteTimeTableUiModelUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GetNextTimeTableSlotIndexAsPerCurrentTimeUseCase f4437a;
    public final TimeUtilsContract b;

    public GetRouteTimeTableUiModelUseCase(GetNextTimeTableSlotIndexAsPerCurrentTimeUseCase getNextTimeTableSlotIndexAsPerCurrentTimeUseCase, TimeUtilsContract timeUtilsContract) {
        this.f4437a = getNextTimeTableSlotIndexAsPerCurrentTimeUseCase;
        this.b = timeUtilsContract;
    }

    public final TimeTableUiModel a(String str, String str2, List routeTiming) {
        String str3;
        Long lValueOf;
        RouteTripTimingUiModel frequencyTimingUiModel;
        long j;
        Intrinsics.i(routeTiming, "routeTiming");
        GetNextTimeTableSlotIndexAsPerCurrentTimeUseCase getNextTimeTableSlotIndexAsPerCurrentTimeUseCase = this.f4437a;
        CityAppModel cityAppModel = (CityAppModel) getNextTimeTableSlotIndexAsPerCurrentTimeUseCase.f4433a.getE().getValue();
        if (cityAppModel == null || (str3 = cityAppModel.l) == null) {
            str3 = "Asia/Kolkata";
        }
        int iB = getNextTimeTableSlotIndexAsPerCurrentTimeUseCase.b.B(str3);
        List<RouteTiming> list = routeTiming;
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.z0();
                throw null;
            }
            RouteTiming routeTiming2 = (RouteTiming) next;
            if (routeTiming2 instanceof RouteTiming.FixedTiming) {
                if (iB < routeTiming2.f1719a) {
                    break;
                }
                i = i2;
            } else {
                if (!(routeTiming2 instanceof RouteTiming.FrequencyTiming)) {
                    throw new NoWhenBranchMatchedException();
                }
                RouteTiming.FrequencyTiming frequencyTiming = (RouteTiming.FrequencyTiming) routeTiming2;
                long j2 = iB;
                long j3 = frequencyTiming.e;
                if (j2 <= frequencyTiming.f && j3 <= j2) {
                    break;
                }
                i = i2;
            }
        }
        int i3 = i;
        RouteTiming routeTiming3 = (RouteTiming) CollectionsKt.H(routeTiming);
        TimeUtilsContract timeUtilsContract = this.b;
        String strX = routeTiming3 != null ? timeUtilsContract.x(routeTiming3.f1719a) : null;
        RouteTiming routeTiming4 = (RouteTiming) CollectionsKt.H(routeTiming);
        if (routeTiming4 != null) {
            long j4 = routeTiming4.f1719a;
            for (RouteTiming routeTiming5 : list) {
                if (routeTiming5 instanceof RouteTiming.FixedTiming) {
                    j = routeTiming5.f1719a;
                } else {
                    if (!(routeTiming5 instanceof RouteTiming.FrequencyTiming)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j = ((RouteTiming.FrequencyTiming) routeTiming5).f;
                }
                if (j > j4) {
                    j4 = j;
                }
            }
            lValueOf = Long.valueOf(j4);
        } else {
            lValueOf = null;
        }
        String strX2 = lValueOf != null ? timeUtilsContract.x(lValueOf.longValue()) : null;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
        for (RouteTiming routeTiming6 : list) {
            Intrinsics.i(routeTiming6, "<this>");
            long j5 = routeTiming6.f1719a;
            if (routeTiming6 instanceof RouteTiming.FixedTiming) {
                frequencyTimingUiModel = new RouteTripTimingUiModel.FixedTimingUiModel(timeUtilsContract.x(j5));
            } else {
                if (!(routeTiming6 instanceof RouteTiming.FrequencyTiming)) {
                    throw new NoWhenBranchMatchedException();
                }
                RouteTiming.FrequencyTiming frequencyTiming2 = (RouteTiming.FrequencyTiming) routeTiming6;
                frequencyTimingUiModel = new RouteTripTimingUiModel.FrequencyTimingUiModel(timeUtilsContract.x(j5), timeUtilsContract.x(frequencyTiming2.f), frequencyTiming2.g);
            }
            arrayList.add(frequencyTimingUiModel);
        }
        return new TimeTableUiModel(arrayList, i3, str, str2, strX, strX2);
    }
}
