package app.chalo.livetracking.frameworklivetracking;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.extensions.FlowExtentionsKt;
import app.chalo.livetracking.frameworklivetracking.data.model.RealTimeSocketRequest;
import app.chalo.livetracking.frameworklivetracking.data.model.StopRouteId;
import app.chalo.livetracking.frameworklivetracking.data.model.app.RealtimeSocketEtaResponseAppModel;
import app.chalo.livetracking.frameworklivetracking.data.model.app.RealtimeSocketResult;
import app.chalo.livetracking.frameworklivetracking.data.model.app.RealtimeSocketRouteStreamResponseAppModel;
import app.chalo.livetracking.frameworklivetracking.domain.FetchVehicleLiveGpsLocationUseCase;
import app.chalo.livetracking.frameworklivetracking.domain.GetSeatAvailabilityUseCase;
import app.chalo.livetracking.frameworklivetracking.domain.PollEtaForStopIdUseCase;
import app.chalo.livetracking.routedetails.domain.CheckIsTripNotStaleUseCase;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/LiveTrackingDataManagerImpl;", "Lapp/chalo/livetracking/frameworklivetracking/LiveTrackingDataManager;", "Companion", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LiveTrackingDataManagerImpl implements LiveTrackingDataManager {
    public static final String h = Source.LIVE_TRACKING_FRAMEWORK.getSourceName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FetchVehicleLiveGpsLocationUseCase f4193a;
    public final GetSeatAvailabilityUseCase b;
    public final CheckIsTripNotStaleUseCase c;
    public final AnalyticsContract d;
    public final BasicInfoContract e;
    public final PollEtaForStopIdUseCase f;
    public final RealTimeSocketManager g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/LiveTrackingDataManagerImpl$Companion;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public LiveTrackingDataManagerImpl(FetchVehicleLiveGpsLocationUseCase fetchVehicleLiveGpsLocationUseCase, GetSeatAvailabilityUseCase getSeatAvailabilityUseCase, CheckIsTripNotStaleUseCase checkIsTripNotStaleUseCase, ChaloSocketManagerProvider chaloSocketManagerProvider, AnalyticsContract analyticsContract, BasicInfoContract basicInfoContract, PollEtaForStopIdUseCase pollEtaForStopIdUseCase) {
        this.f4193a = fetchVehicleLiveGpsLocationUseCase;
        this.b = getSeatAvailabilityUseCase;
        this.c = checkIsTripNotStaleUseCase;
        this.d = analyticsContract;
        this.e = basicInfoContract;
        this.f = pollEtaForStopIdUseCase;
        this.g = chaloSocketManagerProvider.a();
    }

    public static final void g(LiveTrackingDataManagerImpl liveTrackingDataManagerImpl, RealTimeSocketRequest.Etas etas, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        if (linkedHashMap.isEmpty()) {
            liveTrackingDataManagerImpl.i(etas);
        }
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            String str = (String) entry.getKey();
            RealtimeSocketEtaResponseAppModel realtimeSocketEtaResponseAppModel = (RealtimeSocketEtaResponseAppModel) entry.getValue();
            if (realtimeSocketEtaResponseAppModel == null) {
                linkedHashMap.put(str, null);
            } else if (linkedHashMap.containsKey(str)) {
                Object obj = linkedHashMap.get(str);
                RealtimeSocketEtaResponseAppModel realtimeSocketEtaResponseAppModel2 = (RealtimeSocketEtaResponseAppModel) (obj != null ? obj : null);
                if (realtimeSocketEtaResponseAppModel2 != null && realtimeSocketEtaResponseAppModel.f > realtimeSocketEtaResponseAppModel2.f) {
                    linkedHashMap.put(str, realtimeSocketEtaResponseAppModel);
                }
            } else {
                linkedHashMap.put(str, realtimeSocketEtaResponseAppModel);
            }
        }
    }

    public static final void h(LiveTrackingDataManagerImpl liveTrackingDataManagerImpl, RealTimeSocketRequest.Route route, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        if (linkedHashMap.isEmpty()) {
            liveTrackingDataManagerImpl.i(route);
        }
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            String str = (String) entry.getKey();
            RealtimeSocketRouteStreamResponseAppModel realtimeSocketRouteStreamResponseAppModel = (RealtimeSocketRouteStreamResponseAppModel) entry.getValue();
            if (realtimeSocketRouteStreamResponseAppModel == null) {
                linkedHashMap.put(str, null);
            } else if (linkedHashMap.containsKey(str)) {
                Object obj = linkedHashMap.get(str);
                RealtimeSocketRouteStreamResponseAppModel realtimeSocketRouteStreamResponseAppModel2 = (RealtimeSocketRouteStreamResponseAppModel) (obj != null ? obj : null);
                if (realtimeSocketRouteStreamResponseAppModel2 != null && realtimeSocketRouteStreamResponseAppModel.d > realtimeSocketRouteStreamResponseAppModel2.d) {
                    linkedHashMap.put(str, realtimeSocketRouteStreamResponseAppModel);
                }
            } else {
                linkedHashMap.put(str, realtimeSocketRouteStreamResponseAppModel);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManagerImpl$getAllEtasForStop$$inlined$map$1] */
    @Override // app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManager
    public final LiveTrackingDataManagerImpl$getAllEtasForStop$$inlined$map$1 a(final List stopRouteIdList) {
        Intrinsics.i(stopRouteIdList, "stopRouteIdList");
        final LiveTrackingDataManagerImpl$getAllEtasForStop$$inlined$filterIsInstance$1 liveTrackingDataManagerImpl$getAllEtasForStop$$inlined$filterIsInstance$1 = new LiveTrackingDataManagerImpl$getAllEtasForStop$$inlined$filterIsInstance$1(this.g.a(new RealTimeSocketRequest.EtasList(stopRouteIdList)));
        return new Flow<LiveTrackingDataManagerAllRouteResultWithEtaList.Success>() { // from class: app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManagerImpl$getAllEtasForStop$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManagerImpl$getAllEtasForStop$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f4197a;
                public final /* synthetic */ List b;

                /* JADX INFO: renamed from: app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManagerImpl$getAllEtasForStop$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManagerImpl$getAllEtasForStop$$inlined$map$1$2", f = "LiveTrackingDataManagerImpl.kt", l = {50}, m = "emit", v = 1)
                public final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
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

                public AnonymousClass2(FlowCollector flowCollector, List list) {
                    this.f4197a = flowCollector;
                    this.b = list;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.b(obj2);
                        LinkedHashMap linkedHashMap = ((RealtimeSocketResult.Success.EtasList) obj).f4313a;
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            if (this.b.contains((StopRouteId) entry.getKey())) {
                                linkedHashMap2.put(entry.getKey(), entry.getValue());
                            }
                        }
                        LiveTrackingDataManagerAllRouteResultWithEtaList.Success success = new LiveTrackingDataManagerAllRouteResultWithEtaList.Success(linkedHashMap2);
                        anonymousClass1.label = 1;
                        if (this.f4197a.emit(success, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj2);
                    }
                    return Unit.f17538a;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = liveTrackingDataManagerImpl$getAllEtasForStop$$inlined$filterIsInstance$1.collect(new AnonymousClass2(flowCollector, stopRouteIdList), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    @Override // app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManager
    public final Object b(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        return str3.length() == 0 ? new LiveTrackingDataManagerStopEtaResult.Error() : this.f.a(str2, str, str3, continuationImpl);
    }

    @Override // app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManager
    public final Flow c(String routeId, final List list) {
        Intrinsics.i(routeId, "routeId");
        if (list != null && list.isEmpty()) {
            return new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(new LiveTrackingDataManagerLiveVehicleResult.Error());
        }
        final MutexImpl mutexImplA = MutexKt.a();
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final RealTimeSocketRequest.Route route = new RealTimeSocketRequest.Route(routeId);
        final LiveTrackingDataManagerImpl$getLiveVehiclesForRoute$$inlined$filterIsInstance$1 liveTrackingDataManagerImpl$getLiveVehiclesForRoute$$inlined$filterIsInstance$1 = new LiveTrackingDataManagerImpl$getLiveVehiclesForRoute$$inlined$filterIsInstance$1(this.g.a(new RealTimeSocketRequest.Route(routeId)));
        return new Flow<LiveTrackingDataManagerLiveVehicleResult.Success>() { // from class: app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManagerImpl$getLiveVehiclesForRoute$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManagerImpl$getLiveVehiclesForRoute$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f4205a;
                public final /* synthetic */ MutexImpl b;
                public final /* synthetic */ List c;
                public final /* synthetic */ LiveTrackingDataManagerImpl d;
                public final /* synthetic */ RealTimeSocketRequest.Route e;
                public final /* synthetic */ LinkedHashMap f;

                /* JADX INFO: renamed from: app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManagerImpl$getLiveVehiclesForRoute$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManagerImpl$getLiveVehiclesForRoute$$inlined$map$1$2", f = "LiveTrackingDataManagerImpl.kt", l = {EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION, 50}, m = "emit", v = 1)
                public final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    Object L$2;
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

                public AnonymousClass2(FlowCollector flowCollector, MutexImpl mutexImpl, List list, LiveTrackingDataManagerImpl liveTrackingDataManagerImpl, RealTimeSocketRequest.Route route, LinkedHashMap linkedHashMap) {
                    this.f4205a = flowCollector;
                    this.b = mutexImpl;
                    this.c = list;
                    this.d = liveTrackingDataManagerImpl;
                    this.e = route;
                    this.f = linkedHashMap;
                }

                /* JADX WARN: Code duplicated, block: B:32:0x00ae  */
                /* JADX WARN: Code duplicated, block: B:34:0x00cc  */
                /* JADX WARN: Code duplicated, block: B:38:0x00d8  */
                /* JADX WARN: Code duplicated, block: B:40:0x00e4  */
                /* JADX WARN: Code duplicated, block: B:45:0x0100  */
                /* JADX WARN: Code duplicated, block: B:57:0x00cf A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:59:0x00f5 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:61:0x00e2 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:7:0x0019  */
                /* JADX WARN: Code restructure failed: missing block: B:47:0x0113, code lost:
                
                    if (r11.emit(r0, r3) == r4) goto L48;
                 */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r23, kotlin.coroutines.Continuation r24) {
                    /*
                        Method dump skipped, instruction units count: 287
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManagerImpl$getLiveVehiclesForRoute$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = liveTrackingDataManagerImpl$getLiveVehiclesForRoute$$inlined$filterIsInstance$1.collect(new AnonymousClass2(flowCollector, mutexImplA, list, this, route, linkedHashMap), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    @Override // app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManager
    public final Flow d(String busNumber, String agencyName, Long l, Long l2) {
        Intrinsics.i(busNumber, "busNumber");
        Intrinsics.i(agencyName, "agencyName");
        Flow flowY = FlowKt.y(new LiveTrackingDataManagerImpl$getLiveGpsLocationForBus$gpsDataFlow$1(l != null ? Integer.MAX_VALUE : 1, this, busNumber, agencyName, l != null ? l.longValue() : 0L, null));
        return l2 != null ? FlowExtentionsKt.b(flowY, l2.longValue()) : flowY;
    }

    @Override // app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManager
    public final Flow e(int i, Function0 function0) {
        return FlowKt.y(new LiveTrackingDataManagerImpl$getSeatAvailabilityDetailsForVehicles$1(this, i, function0, 15000L, null));
    }

    @Override // app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManager
    public final Flow f(String stopId, String routeId, final List list) {
        Intrinsics.i(stopId, "stopId");
        Intrinsics.i(routeId, "routeId");
        if (list != null && list.isEmpty()) {
            return new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(new LiveTrackingDataManagerStopEtaResult.Error());
        }
        final MutexImpl mutexImplA = MutexKt.a();
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final RealTimeSocketRequest.Etas etas = new RealTimeSocketRequest.Etas(stopId, routeId);
        final LiveTrackingDataManagerImpl$getEtasForStop$$inlined$filterIsInstance$1 liveTrackingDataManagerImpl$getEtasForStop$$inlined$filterIsInstance$1 = new LiveTrackingDataManagerImpl$getEtasForStop$$inlined$filterIsInstance$1(this.g.a(etas));
        return new Flow<LiveTrackingDataManagerStopEtaResult.Success>() { // from class: app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManagerImpl$getEtasForStop$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManagerImpl$getEtasForStop$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f4201a;
                public final /* synthetic */ MutexImpl b;
                public final /* synthetic */ List c;
                public final /* synthetic */ LiveTrackingDataManagerImpl d;
                public final /* synthetic */ RealTimeSocketRequest.Etas e;
                public final /* synthetic */ LinkedHashMap f;

                /* JADX INFO: renamed from: app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManagerImpl$getEtasForStop$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManagerImpl$getEtasForStop$$inlined$map$1$2", f = "LiveTrackingDataManagerImpl.kt", l = {EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION, 50}, m = "emit", v = 1)
                public final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    Object L$2;
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

                public AnonymousClass2(FlowCollector flowCollector, MutexImpl mutexImpl, List list, LiveTrackingDataManagerImpl liveTrackingDataManagerImpl, RealTimeSocketRequest.Etas etas, LinkedHashMap linkedHashMap) {
                    this.f4201a = flowCollector;
                    this.b = mutexImpl;
                    this.c = list;
                    this.d = liveTrackingDataManagerImpl;
                    this.e = etas;
                    this.f = linkedHashMap;
                }

                /* JADX WARN: Code duplicated, block: B:32:0x00ae  */
                /* JADX WARN: Code duplicated, block: B:34:0x00cc  */
                /* JADX WARN: Code duplicated, block: B:38:0x00d8  */
                /* JADX WARN: Code duplicated, block: B:40:0x00e4  */
                /* JADX WARN: Code duplicated, block: B:45:0x0100  */
                /* JADX WARN: Code duplicated, block: B:57:0x00cf A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:59:0x00f5 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:61:0x00e2 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:7:0x0019  */
                /* JADX WARN: Code restructure failed: missing block: B:47:0x0113, code lost:
                
                    if (r11.emit(r0, r3) == r4) goto L48;
                 */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r23, kotlin.coroutines.Continuation r24) {
                    /*
                        Method dump skipped, instruction units count: 287
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManagerImpl$getEtasForStop$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = liveTrackingDataManagerImpl$getEtasForStop$$inlined$filterIsInstance$1.collect(new AnonymousClass2(flowCollector, mutexImplA, list, this, etas, linkedHashMap), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    public final void i(RealTimeSocketRequest realTimeSocketRequest) {
        AnalyticsContract.DefaultImpls.a(this.d, "crts response", h, MapsKt.i(new Pair("time", Long.valueOf(this.e.j())), new Pair("reference type", realTimeSocketRequest.a())), null, false, 24);
    }
}
