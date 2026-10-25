package app.chalo.citydata.data.model.api.response;

import app.chalo.citydata.data.model.app.RouteTiming;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"framework-city-data_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RouteDetailsResponseOldApiModelKt {
    public static final List a(List list) {
        RouteTiming fixedTiming;
        Integer num;
        Integer num2;
        Integer num3;
        List<RouteTimeTableOldApiModel> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
        for (RouteTimeTableOldApiModel routeTimeTableOldApiModel : list2) {
            Boolean bool = routeTimeTableOldApiModel.f1684a;
            RouteDetailsTimeTableWithFrequencyOldApiModel routeDetailsTimeTableWithFrequencyOldApiModel = routeTimeTableOldApiModel.c;
            long jIntValue = -1;
            if (Intrinsics.d(bool, Boolean.TRUE)) {
                long jIntValue2 = (routeDetailsTimeTableWithFrequencyOldApiModel == null || (num3 = routeDetailsTimeTableWithFrequencyOldApiModel.f1674a) == null) ? -1L : num3.intValue();
                long jIntValue3 = (routeDetailsTimeTableWithFrequencyOldApiModel == null || (num2 = routeDetailsTimeTableWithFrequencyOldApiModel.b) == null) ? -1L : num2.intValue();
                if (routeDetailsTimeTableWithFrequencyOldApiModel != null && (num = routeDetailsTimeTableWithFrequencyOldApiModel.c) != null) {
                    jIntValue = num.intValue();
                }
                fixedTiming = new RouteTiming.FrequencyTiming(jIntValue2, jIntValue3, jIntValue, "");
            } else {
                Integer num4 = routeTimeTableOldApiModel.b;
                fixedTiming = new RouteTiming.FixedTiming(num4 != null ? num4.intValue() : -1L, "");
            }
            arrayList.add(fixedTiming);
        }
        return CollectionsKt.v0(new RouteDetailsResponseOldApiModelKt$getRouteTimingFromApiModel$$inlined$sortedBy$1(), arrayList);
    }
}
