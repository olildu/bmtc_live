package app.chalo.citydata.data.model.api.response;

import app.chalo.citydata.data.model.app.RouteTiming;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.citydata.data.model.app.TimeTableStatus;
import app.chalo.location.LatLng;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"framework-city-data_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RoutesDataResponseApiModelKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1690a;

        static {
            int[] iArr = new int[RouteApiStatusType.values().length];
            try {
                iArr[RouteApiStatusType.UPDATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RouteApiStatusType.NOT_UPDATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RouteApiStatusType.DELETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RouteApiStatusType.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f1690a = iArr;
        }
    }

    public static final List a(List list) {
        RouteTiming fixedTiming;
        Integer num;
        Integer num2;
        Integer num3;
        List<RouteTimeTableApiModel> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
        for (RouteTimeTableApiModel routeTimeTableApiModel : list2) {
            Boolean bool = routeTimeTableApiModel.f1682a;
            String str = routeTimeTableApiModel.d;
            RouteTimeTableWithFrequencyApiModel routeTimeTableWithFrequencyApiModel = routeTimeTableApiModel.c;
            long jIntValue = -1;
            if (Intrinsics.d(bool, Boolean.TRUE)) {
                long jIntValue2 = (routeTimeTableWithFrequencyApiModel == null || (num3 = routeTimeTableWithFrequencyApiModel.f1686a) == null) ? -1L : num3.intValue();
                long jIntValue3 = (routeTimeTableWithFrequencyApiModel == null || (num2 = routeTimeTableWithFrequencyApiModel.b) == null) ? -1L : num2.intValue();
                if (routeTimeTableWithFrequencyApiModel != null && (num = routeTimeTableWithFrequencyApiModel.c) != null) {
                    jIntValue = num.intValue();
                }
                fixedTiming = new RouteTiming.FrequencyTiming(jIntValue2, jIntValue3, jIntValue, str == null ? "" : str);
            } else {
                Integer num4 = routeTimeTableApiModel.b;
                jIntValue = num4 != null ? num4.intValue() : -1L;
                if (str == null) {
                    str = "";
                }
                fixedTiming = new RouteTiming.FixedTiming(jIntValue, str);
            }
            arrayList.add(fixedTiming);
        }
        return CollectionsKt.v0(new RoutesDataResponseApiModelKt$getRouteTimingFromApiModel$$inlined$sortedBy$1(), arrayList);
    }

    public static final TimeTableStatus b(int i) {
        TimeTableStatus.INSTANCE.getClass();
        TimeTableStatus timeTableStatusA = TimeTableStatus.Companion.a(i);
        if (timeTableStatusA == TimeTableStatus.UNKNOWN) {
            timeTableStatusA = null;
        }
        return timeTableStatusA == null ? TimeTableStatus.Companion.a(i % 2) : timeTableStatusA;
    }

    public static final boolean c(RouteTimeTableApiModel routeTimeTableApiModel) {
        Boolean bool = routeTimeTableApiModel.f1682a;
        if (bool == null || routeTimeTableApiModel.d == null) {
            return false;
        }
        if (!Intrinsics.d(bool, Boolean.TRUE)) {
            return routeTimeTableApiModel.b != null;
        }
        RouteTimeTableWithFrequencyApiModel routeTimeTableWithFrequencyApiModel = routeTimeTableApiModel.c;
        return (routeTimeTableWithFrequencyApiModel == null || routeTimeTableWithFrequencyApiModel.f1686a == null || routeTimeTableWithFrequencyApiModel.b == null || routeTimeTableWithFrequencyApiModel.c == null) ? false : true;
    }

    public static final StopAppModel d(StopApiModel stopApiModel) {
        Intrinsics.i(stopApiModel, "<this>");
        String str = stopApiModel.f1693a;
        if (str == null) {
            str = "";
        }
        String str2 = stopApiModel.b;
        if (str2 == null) {
            str2 = "";
        }
        LatLng latLng = new LatLng(stopApiModel.c, stopApiModel.d);
        ChaloTransitMode chaloTransitModeValueOf = ChaloTransitMode.valueOf(stopApiModel.e);
        String str3 = stopApiModel.f;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = stopApiModel.g;
        return new StopAppModel(str, str2, latLng, chaloTransitModeValueOf, str3, str4 == null ? "" : str4);
    }
}
