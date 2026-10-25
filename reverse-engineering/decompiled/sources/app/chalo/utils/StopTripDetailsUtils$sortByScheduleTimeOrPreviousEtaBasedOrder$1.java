package app.chalo.utils;

import app.chalo.home.nearbytrips.domain.NearbyTripsDataManagerEtaResult;
import app.chalo.home.nearbytrips.domain.NearbyTripsDataManagerResult;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lapp/chalo/home/nearbytrips/domain/NearbyTripsDataManagerResult;", "old", "new"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.utils.StopTripDetailsUtils$sortByScheduleTimeOrPreviousEtaBasedOrder$1", f = "StopTripDetailsUtils.kt", l = {}, m = "invokeSuspend", v = 1)
final class StopTripDetailsUtils$sortByScheduleTimeOrPreviousEtaBasedOrder$1 extends SuspendLambda implements Function3<List<? extends NearbyTripsDataManagerResult>, List<? extends NearbyTripsDataManagerResult>, Continuation<? super List<? extends NearbyTripsDataManagerResult>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        StopTripDetailsUtils$sortByScheduleTimeOrPreviousEtaBasedOrder$1 stopTripDetailsUtils$sortByScheduleTimeOrPreviousEtaBasedOrder$1 = new StopTripDetailsUtils$sortByScheduleTimeOrPreviousEtaBasedOrder$1(3, (Continuation) obj3);
        stopTripDetailsUtils$sortByScheduleTimeOrPreviousEtaBasedOrder$1.L$0 = (List) obj;
        stopTripDetailsUtils$sortByScheduleTimeOrPreviousEtaBasedOrder$1.L$1 = (List) obj2;
        return stopTripDetailsUtils$sortByScheduleTimeOrPreviousEtaBasedOrder$1.invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        List list = (List) this.L$0;
        List list2 = (List) this.L$1;
        if (list.isEmpty()) {
            return StopTripDetailsUtils.e(list2);
        }
        boolean zD = StopTripDetailsUtils.d(list);
        boolean zD2 = StopTripDetailsUtils.d(list2);
        if (!zD) {
            return zD2 ? StopTripDetailsUtils.e(list2) : list;
        }
        List<NearbyTripsDataManagerResult> list3 = list2;
        int iG = MapsKt.g(CollectionsKt.v(list3, 10));
        if (iG < 16) {
            iG = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iG);
        for (NearbyTripsDataManagerResult nearbyTripsDataManagerResult : list3) {
            linkedHashMap.put(nearbyTripsDataManagerResult.f3121a.f9497a, nearbyTripsDataManagerResult);
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        for (Object obj2 : list) {
            int i3 = i + 1;
            if (i < 0) {
                CollectionsKt.z0();
                throw null;
            }
            NearbyTripsDataManagerResult nearbyTripsDataManagerResult2 = (NearbyTripsDataManagerResult) obj2;
            NearbyTripsDataManagerEtaResult nearbyTripsDataManagerEtaResult = nearbyTripsDataManagerResult2.b;
            String str = nearbyTripsDataManagerResult2.f3121a.f9497a;
            if (nearbyTripsDataManagerEtaResult.a() != null) {
                NearbyTripsDataManagerResult nearbyTripsDataManagerResult3 = (NearbyTripsDataManagerResult) linkedHashMap.get(str);
                if (nearbyTripsDataManagerResult3 != null) {
                    arrayList.add(nearbyTripsDataManagerResult3);
                    i2 = i;
                }
            } else {
                NearbyTripsDataManagerResult nearbyTripsDataManagerResult4 = (NearbyTripsDataManagerResult) linkedHashMap.get(str);
                if (nearbyTripsDataManagerResult4 != null) {
                    if (nearbyTripsDataManagerResult4.b.a() == null) {
                        arrayList.add(nearbyTripsDataManagerResult4);
                        i = i2;
                    } else if (i2 < arrayList.size()) {
                        i = i2 + 1;
                        arrayList.add(i, nearbyTripsDataManagerResult4);
                    } else {
                        arrayList.add(nearbyTripsDataManagerResult4);
                    }
                    i2 = i;
                }
            }
            i = i3;
        }
        return arrayList;
    }
}
