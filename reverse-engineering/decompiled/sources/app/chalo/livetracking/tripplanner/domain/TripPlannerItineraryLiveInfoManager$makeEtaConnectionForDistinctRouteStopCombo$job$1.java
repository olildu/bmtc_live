package app.chalo.livetracking.tripplanner.domain;

import app.chalo.contract.BasicInfoContract;
import app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManagerImpl$getAllEtasForStop$$inlined$map$1;
import app.chalo.livetracking.frameworklivetracking.data.model.StopRouteId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager$makeEtaConnectionForDistinctRouteStopCombo$job$1", f = "TripPlannerItineraryLiveInfoManager.kt", l = {163}, m = "invokeSuspend", v = 1)
final class TripPlannerItineraryLiveInfoManager$makeEtaConnectionForDistinctRouteStopCombo$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Map<Pair<RouteId, StopId>, List<ItineraryLiveInfoRequest>> $distinctRouteStopRequestMap;
    final /* synthetic */ List<StopRouteId> $stopRouteIdList;
    int label;
    final /* synthetic */ TripPlannerItineraryLiveInfoManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TripPlannerItineraryLiveInfoManager$makeEtaConnectionForDistinctRouteStopCombo$job$1(TripPlannerItineraryLiveInfoManager tripPlannerItineraryLiveInfoManager, List list, Map map, Continuation continuation) {
        super(2, continuation);
        this.this$0 = tripPlannerItineraryLiveInfoManager;
        this.$stopRouteIdList = list;
        this.$distinctRouteStopRequestMap = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TripPlannerItineraryLiveInfoManager$makeEtaConnectionForDistinctRouteStopCombo$job$1(this.this$0, this.$stopRouteIdList, this.$distinctRouteStopRequestMap, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TripPlannerItineraryLiveInfoManager$makeEtaConnectionForDistinctRouteStopCombo$job$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            final TripPlannerItineraryLiveInfoManager tripPlannerItineraryLiveInfoManager = this.this$0;
            final LiveTrackingDataManagerImpl$getAllEtasForStop$$inlined$map$1 liveTrackingDataManagerImpl$getAllEtasForStop$$inlined$map$1A = tripPlannerItineraryLiveInfoManager.b.a(this.$stopRouteIdList);
            Flow<Map<StopRouteId, List<? extends ItineraryEtaInfo>>> flow = new Flow<Map<StopRouteId, List<? extends ItineraryEtaInfo>>>() { // from class: app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager$getEtaListMapForRouteStopCombo$$inlined$mapNotNull$1

                /* JADX INFO: renamed from: app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager$getEtaListMapForRouteStopCombo$$inlined$mapNotNull$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ FlowCollector f4715a;
                    public final /* synthetic */ TripPlannerItineraryLiveInfoManager b;

                    /* JADX INFO: renamed from: app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager$getEtaListMapForRouteStopCombo$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @DebugMetadata(c = "app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager$getEtaListMapForRouteStopCombo$$inlined$mapNotNull$1$2", f = "TripPlannerItineraryLiveInfoManager.kt", l = {73, 96}, m = "emit", v = 1)
                    public final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        Object L$1;
                        Object L$2;
                        Object L$3;
                        Object L$4;
                        Object L$5;
                        Object L$6;
                        Object L$7;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector, TripPlannerItineraryLiveInfoManager tripPlannerItineraryLiveInfoManager) {
                        this.f4715a = flowCollector;
                        this.b = tripPlannerItineraryLiveInfoManager;
                    }

                    /* JADX WARN: Code duplicated, block: B:34:0x00f8  */
                    /* JADX WARN: Code duplicated, block: B:37:0x011b  */
                    /* JADX WARN: Code duplicated, block: B:40:0x0144  */
                    /* JADX WARN: Code duplicated, block: B:42:0x0150  */
                    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00da -> B:32:0x00f2). Please report as a decompilation issue!!! */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x011b -> B:38:0x0121). Please report as a decompilation issue!!! */
                    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final java.lang.Object emit(java.lang.Object r32, kotlin.coroutines.Continuation r33) {
                        /*
                            Method dump skipped, instruction units count: 425
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager$getEtaListMapForRouteStopCombo$$inlined$mapNotNull$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                    Object objCollect = liveTrackingDataManagerImpl$getAllEtasForStop$$inlined$map$1A.collect(new AnonymousClass2(flowCollector, tripPlannerItineraryLiveInfoManager), continuation);
                    return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
                }
            };
            final TripPlannerItineraryLiveInfoManager tripPlannerItineraryLiveInfoManager2 = this.this$0;
            final Map<Pair<RouteId, StopId>, List<ItineraryLiveInfoRequest>> map = this.$distinctRouteStopRequestMap;
            FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager$makeEtaConnectionForDistinctRouteStopCombo$job$1.1

                /* JADX INFO: renamed from: app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager$makeEtaConnectionForDistinctRouteStopCombo$job$1$1$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager$makeEtaConnectionForDistinctRouteStopCombo$job$1$1$1", f = "TripPlannerItineraryLiveInfoManager.kt", l = {165}, m = "invokeSuspend", v = 1)
                final class C01211 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ Map<Pair<RouteId, StopId>, List<ItineraryLiveInfoRequest>> $distinctRouteStopRequestMap;
                    final /* synthetic */ Map<StopRouteId, List<ItineraryEtaInfo>> $etaListMap;
                    int label;
                    final /* synthetic */ TripPlannerItineraryLiveInfoManager this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C01211(TripPlannerItineraryLiveInfoManager tripPlannerItineraryLiveInfoManager, Map map, Map map2, Continuation continuation) {
                        super(2, continuation);
                        this.this$0 = tripPlannerItineraryLiveInfoManager;
                        this.$distinctRouteStopRequestMap = map;
                        this.$etaListMap = map2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        return new C01211(this.this$0, this.$distinctRouteStopRequestMap, this.$etaListMap, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ((C01211) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
                    }

                    /* JADX WARN: Code duplicated, block: B:66:0x014d A[PHI: r19
                      0x014d: PHI (r19v2 long) = (r19v1 long), (r19v5 long) binds: [B:69:0x0155, B:52:0x0113] A[DONT_GENERATE, DONT_INLINE]] */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object objC;
                        Object value;
                        LinkedHashMap linkedHashMapU;
                        ArrayList arrayList;
                        long j;
                        Object obj2;
                        ItineraryEtaInfo itineraryEtaInfo;
                        T next;
                        Object obj3;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.b(obj);
                            BasicInfoContract basicInfoContract = this.this$0.c;
                            this.label = 1;
                            objC = basicInfoContract.c(this);
                            if (objC == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.b(obj);
                            objC = obj;
                        }
                        long jLongValue = ((Number) objC).longValue();
                        Map<Pair<RouteId, StopId>, List<ItineraryLiveInfoRequest>> map = this.$distinctRouteStopRequestMap;
                        Map<StopRouteId, List<ItineraryEtaInfo>> map2 = this.$etaListMap;
                        TripPlannerItineraryLiveInfoManager tripPlannerItineraryLiveInfoManager = this.this$0;
                        for (Map.Entry<Pair<RouteId, StopId>, List<ItineraryLiveInfoRequest>> entry : map.entrySet()) {
                            Pair<RouteId, StopId> key = entry.getKey();
                            List<ItineraryLiveInfoRequest> value2 = entry.getValue();
                            List<ItineraryEtaInfo> list = map2.get(new StopRouteId(((StopId) key.e()).f4712a, ((RouteId) key.d()).f4711a));
                            List<ItineraryLiveInfoRequest> list2 = value2;
                            ArrayList arrayList2 = new ArrayList(CollectionsKt.v(list2, 10));
                            for (ItineraryLiveInfoRequest itineraryLiveInfoRequest : list2) {
                                if (list != null) {
                                    arrayList = new ArrayList();
                                    for (T t : list) {
                                        ItineraryEtaInfo itineraryEtaInfo2 = (ItineraryEtaInfo) t;
                                        tripPlannerItineraryLiveInfoManager.getClass();
                                        if (itineraryLiveInfoRequest instanceof ItineraryLiveInfoRequest.FirstValidVehicle) {
                                            ItineraryLiveInfoRequest itineraryLiveInfoRequest2 = itineraryLiveInfoRequest;
                                            if (itineraryEtaInfo2.f4698a == -1 || itineraryEtaInfo2.a() < jLongValue) {
                                                itineraryLiveInfoRequest = itineraryLiveInfoRequest2;
                                            } else {
                                                itineraryLiveInfoRequest = itineraryLiveInfoRequest2;
                                            }
                                        } else if (!(itineraryLiveInfoRequest instanceof ItineraryLiveInfoRequest.SpecificVehicle)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        arrayList.add(t);
                                    }
                                } else {
                                    arrayList = null;
                                }
                                if (itineraryLiveInfoRequest instanceof ItineraryLiveInfoRequest.FirstValidVehicle) {
                                    if (arrayList != null) {
                                        int size = arrayList.size();
                                        int i2 = 0;
                                        while (true) {
                                            if (i2 >= size) {
                                                j = jLongValue;
                                                obj3 = null;
                                                break;
                                            }
                                            obj3 = arrayList.get(i2);
                                            i2++;
                                            tripPlannerItineraryLiveInfoManager.getClass();
                                            j = jLongValue;
                                            if (((ItineraryEtaInfo) obj3).a() >= ((ItineraryLiveInfoRequest.FirstValidVehicle) itineraryLiveInfoRequest).d) {
                                                break;
                                            }
                                            jLongValue = j;
                                        }
                                        ItineraryEtaInfo itineraryEtaInfo3 = (ItineraryEtaInfo) obj3;
                                        if (itineraryEtaInfo3 != null) {
                                            itineraryEtaInfo = itineraryEtaInfo3;
                                        }
                                    } else {
                                        j = jLongValue;
                                    }
                                    if (arrayList != null) {
                                        Iterator<T> it = arrayList.iterator();
                                        if (it.hasNext()) {
                                            next = it.next();
                                            if (it.hasNext()) {
                                                long jA = ((ItineraryEtaInfo) next).a();
                                                do {
                                                    T next2 = it.next();
                                                    long jA2 = ((ItineraryEtaInfo) next2).a();
                                                    if (jA < jA2) {
                                                        next = next2;
                                                        jA = jA2;
                                                    }
                                                } while (it.hasNext());
                                            }
                                        } else {
                                            next = (T) null;
                                        }
                                        itineraryEtaInfo = next;
                                    } else {
                                        itineraryEtaInfo = null;
                                    }
                                } else {
                                    j = jLongValue;
                                    if (!(itineraryLiveInfoRequest instanceof ItineraryLiveInfoRequest.SpecificVehicle)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    if (arrayList != null) {
                                        int size2 = arrayList.size();
                                        int i3 = 0;
                                        while (true) {
                                            if (i3 >= size2) {
                                                obj2 = null;
                                                break;
                                            }
                                            Object obj4 = arrayList.get(i3);
                                            i3++;
                                            if (Intrinsics.d(((ItineraryEtaInfo) obj4).b, ((ItineraryLiveInfoRequest.SpecificVehicle) itineraryLiveInfoRequest).d)) {
                                                obj2 = obj4;
                                                break;
                                            }
                                        }
                                        itineraryEtaInfo = (ItineraryEtaInfo) obj2;
                                    } else {
                                        itineraryEtaInfo = null;
                                    }
                                }
                                arrayList2.add(new ItineraryAndEtaHolder(itineraryLiveInfoRequest, itineraryEtaInfo));
                                jLongValue = j;
                            }
                            long j2 = jLongValue;
                            MutableStateFlow mutableStateFlow = tripPlannerItineraryLiveInfoManager.j;
                            do {
                                value = mutableStateFlow.getValue();
                                List list3 = (List) value;
                                int iG = MapsKt.g(CollectionsKt.v(list3, 10));
                                if (iG < 16) {
                                    iG = 16;
                                }
                                LinkedHashMap linkedHashMap = new LinkedHashMap(iG);
                                for (T t2 : list3) {
                                    linkedHashMap.put(((ItineraryAndEtaHolder) t2).f4697a, t2);
                                }
                                linkedHashMapU = MapsKt.u(linkedHashMap);
                                int size3 = arrayList2.size();
                                int i4 = 0;
                                while (i4 < size3) {
                                    Object obj5 = arrayList2.get(i4);
                                    i4++;
                                    ItineraryAndEtaHolder itineraryAndEtaHolder = (ItineraryAndEtaHolder) obj5;
                                    linkedHashMapU.put(itineraryAndEtaHolder.f4697a, itineraryAndEtaHolder);
                                }
                            } while (!mutableStateFlow.c(value, CollectionsKt.D0(linkedHashMapU.values())));
                            jLongValue = j2;
                        }
                        return Unit.f17538a;
                    }
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) throws Throwable {
                    TripPlannerItineraryLiveInfoManager tripPlannerItineraryLiveInfoManager3 = tripPlannerItineraryLiveInfoManager2;
                    Object objG = BuildersKt.g(tripPlannerItineraryLiveInfoManager3.f4713a.getDefault(), new C01211(tripPlannerItineraryLiveInfoManager3, map, (Map) obj2, null), continuation);
                    return objG == CoroutineSingletons.COROUTINE_SUSPENDED ? objG : Unit.f17538a;
                }
            };
            this.label = 1;
            if (flow.collect(flowCollector, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f17538a;
    }
}
