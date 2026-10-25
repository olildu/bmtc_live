package app.chalo.home.nearbytrips.domain;

import app.chalo.livetracking.tripplanner.domain.ItineraryLiveInfoRequest;
import app.chalo.livetracking.tripplanner.domain.ItineraryLiveInfoResult;
import app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.stoptripdetails.data.model.app.NearbyTripLiveInfoRequest;
import app.chalo.stoptripdetails.data.model.app.NearbyTripSummaryStaticData;
import app.chalo.utils.StopTripDetailsUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/nearbytrips/domain/NearbyTripsDataOrderManagerNew;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NearbyTripsDataOrderManagerNew {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TripPlannerItineraryLiveInfoManager f3123a;
    public final CoroutineContextProvider b;
    public final MutableStateFlow c = StateFlowKt.a(null);
    public final MutableStateFlow d = StateFlowKt.a(EmptyList.f17557a);

    public NearbyTripsDataOrderManagerNew(TripPlannerItineraryLiveInfoManager tripPlannerItineraryLiveInfoManager, CoroutineContextProvider coroutineContextProvider) {
        this.f3123a = tripPlannerItineraryLiveInfoManager;
        this.b = coroutineContextProvider;
    }

    public static final String a(NearbyTripsDataOrderManagerNew nearbyTripsDataOrderManagerNew, String str, String str2) {
        nearbyTripsDataOrderManagerNew.getClass();
        return str + "_" + str2 + "_-1";
    }

    public final Object b(SuspendLambda suspendLambda) {
        final FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1 flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1 = new FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1(new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(this.c), EmptyList.f17557a, new NearbyTripsDataOrderManagerNew$init$2(3, null));
        Object objCollect = FlowKt.z(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(FlowKt.H(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(FlowKt.m(new Flow<Set<? extends ItineraryLiveInfoRequest>>() { // from class: app.chalo.home.nearbytrips.domain.NearbyTripsDataOrderManagerNew$init$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.home.nearbytrips.domain.NearbyTripsDataOrderManagerNew$init$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f3125a;
                public final /* synthetic */ NearbyTripsDataOrderManagerNew b;

                /* JADX INFO: renamed from: app.chalo.home.nearbytrips.domain.NearbyTripsDataOrderManagerNew$init$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.home.nearbytrips.domain.NearbyTripsDataOrderManagerNew$init$$inlined$map$1$2", f = "NearbyTripsDataOrderManagerNew.kt", l = {50}, m = "emit", v = 1)
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

                public AnonymousClass2(FlowCollector flowCollector, NearbyTripsDataOrderManagerNew nearbyTripsDataOrderManagerNew) {
                    this.f3125a = flowCollector;
                    this.b = nearbyTripsDataOrderManagerNew;
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
                        ArrayList arrayList = new ArrayList();
                        for (NearbyTripLiveInfoRequest nearbyTripLiveInfoRequest : (List) obj) {
                            List<NearbyTripSummaryStaticData> list = nearbyTripLiveInfoRequest.b;
                            ArrayList arrayList2 = new ArrayList(CollectionsKt.v(list, 10));
                            for (NearbyTripSummaryStaticData nearbyTripSummaryStaticData : list) {
                                arrayList2.add(new ItineraryLiveInfoRequest.FirstValidVehicle(-1L, NearbyTripsDataOrderManagerNew.a(this.b, nearbyTripLiveInfoRequest.f9496a, nearbyTripSummaryStaticData.b), nearbyTripSummaryStaticData.b, nearbyTripLiveInfoRequest.f9496a));
                            }
                            arrayList.addAll(arrayList2);
                        }
                        HashSet hashSet = new HashSet();
                        ArrayList arrayList3 = new ArrayList();
                        int size = arrayList.size();
                        int i3 = 0;
                        while (i3 < size) {
                            Object obj3 = arrayList.get(i3);
                            i3++;
                            if (hashSet.add(((ItineraryLiveInfoRequest) obj3).getF4700a())) {
                                arrayList3.add(obj3);
                            }
                        }
                        Set setG0 = CollectionsKt.G0(arrayList3);
                        anonymousClass1.label = 1;
                        if (this.f3125a.emit(setG0, anonymousClass1) == coroutineSingletons) {
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
                Object objCollect2 = flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1.collect(new AnonymousClass2(flowCollector, this), continuation);
                return objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect2 : Unit.f17538a;
            }
        }), new NearbyTripsDataOrderManagerNew$init$4(this, null)), new NearbyTripsDataOrderManagerNew$init$$inlined$flatMapLatest$1(this, null)), new NearbyTripsDataOrderManagerNew$init$6(this, null)), this.b.b()).collect(NearbyTripsDataOrderManagerNew$init$7.f3126a, suspendLambda);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(final NearbyTripLiveInfoRequest nearbyTripLiveInfoRequest, ContinuationImpl continuationImpl) {
        NearbyTripsDataOrderManagerNew$invoke$1 nearbyTripsDataOrderManagerNew$invoke$1;
        if (continuationImpl instanceof NearbyTripsDataOrderManagerNew$invoke$1) {
            nearbyTripsDataOrderManagerNew$invoke$1 = (NearbyTripsDataOrderManagerNew$invoke$1) continuationImpl;
            int i = nearbyTripsDataOrderManagerNew$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                nearbyTripsDataOrderManagerNew$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                nearbyTripsDataOrderManagerNew$invoke$1 = new NearbyTripsDataOrderManagerNew$invoke$1(this, continuationImpl);
            }
        } else {
            nearbyTripsDataOrderManagerNew$invoke$1 = new NearbyTripsDataOrderManagerNew$invoke$1(this, continuationImpl);
        }
        Object obj = nearbyTripsDataOrderManagerNew$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = nearbyTripsDataOrderManagerNew$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            nearbyTripsDataOrderManagerNew$invoke$1.L$0 = nearbyTripLiveInfoRequest;
            nearbyTripsDataOrderManagerNew$invoke$1.label = 1;
            this.c.emit(new Pair(nearbyTripLiveInfoRequest, Boolean.TRUE), nearbyTripsDataOrderManagerNew$invoke$1);
            if (Unit.f17538a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nearbyTripLiveInfoRequest = (NearbyTripLiveInfoRequest) nearbyTripsDataOrderManagerNew$invoke$1.L$0;
            ResultKt.b(obj);
        }
        final MutableStateFlow mutableStateFlow = this.d;
        final Flow flowM = FlowKt.m(new Flow<List<? extends NearbyTripsDataManagerResult>>() { // from class: app.chalo.home.nearbytrips.domain.NearbyTripsDataOrderManagerNew$invoke$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.home.nearbytrips.domain.NearbyTripsDataOrderManagerNew$invoke$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f3130a;
                public final /* synthetic */ NearbyTripLiveInfoRequest b;
                public final /* synthetic */ NearbyTripsDataOrderManagerNew c;

                /* JADX INFO: renamed from: app.chalo.home.nearbytrips.domain.NearbyTripsDataOrderManagerNew$invoke$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.home.nearbytrips.domain.NearbyTripsDataOrderManagerNew$invoke$$inlined$map$1$2", f = "NearbyTripsDataOrderManagerNew.kt", l = {50}, m = "emit", v = 1)
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

                public AnonymousClass2(FlowCollector flowCollector, NearbyTripLiveInfoRequest nearbyTripLiveInfoRequest, NearbyTripsDataOrderManagerNew nearbyTripsDataOrderManagerNew) {
                    this.f3130a = flowCollector;
                    this.b = nearbyTripLiveInfoRequest;
                    this.c = nearbyTripsDataOrderManagerNew;
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
                        List<ItineraryLiveInfoResult> list = (List) obj;
                        int iG = MapsKt.g(CollectionsKt.v(list, 10));
                        if (iG < 16) {
                            iG = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iG);
                        for (ItineraryLiveInfoResult itineraryLiveInfoResult : list) {
                            Pair pair = new Pair(itineraryLiveInfoResult.f4701a.getF4700a(), itineraryLiveInfoResult);
                            linkedHashMap.put(pair.d(), pair.e());
                        }
                        NearbyTripLiveInfoRequest nearbyTripLiveInfoRequest = this.b;
                        List<NearbyTripSummaryStaticData> list2 = nearbyTripLiveInfoRequest.b;
                        ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
                        for (NearbyTripSummaryStaticData nearbyTripSummaryStaticData : list2) {
                            ItineraryLiveInfoResult itineraryLiveInfoResult2 = (ItineraryLiveInfoResult) linkedHashMap.get(NearbyTripsDataOrderManagerNew.a(this.c, nearbyTripLiveInfoRequest.f9496a, nearbyTripSummaryStaticData.b));
                            arrayList.add(new NearbyTripsDataManagerResult(nearbyTripSummaryStaticData, itineraryLiveInfoResult2 != null ? new NearbyTripsDataManagerEtaResult.EtaReceived(itineraryLiveInfoResult2.b) : NearbyTripsDataManagerEtaResult.EtaNotReceived.f3119a, itineraryLiveInfoResult2 != null ? itineraryLiveInfoResult2.c : null));
                        }
                        anonymousClass1.label = 1;
                        if (this.f3130a.emit(arrayList, anonymousClass1) == coroutineSingletons) {
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
                Object objCollect = mutableStateFlow.collect(new AnonymousClass2(flowCollector, nearbyTripLiveInfoRequest, this), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        });
        return new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(new Flow<List<? extends NearbyTripsDataManagerResult>>() { // from class: app.chalo.home.nearbytrips.domain.NearbyTripsDataOrderManagerNew$invoke$$inlined$map$2

            /* JADX INFO: renamed from: app.chalo.home.nearbytrips.domain.NearbyTripsDataOrderManagerNew$invoke$$inlined$map$2$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f3132a;

                /* JADX INFO: renamed from: app.chalo.home.nearbytrips.domain.NearbyTripsDataOrderManagerNew$invoke$$inlined$map$2$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.home.nearbytrips.domain.NearbyTripsDataOrderManagerNew$invoke$$inlined$map$2$2", f = "NearbyTripsDataOrderManagerNew.kt", l = {50}, m = "emit", v = 1)
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

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f3132a = flowCollector;
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
                        List listE = StopTripDetailsUtils.e((List) obj);
                        anonymousClass1.label = 1;
                        if (this.f3132a.emit(listE, anonymousClass1) == coroutineSingletons) {
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
                Object objCollect = flowM.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        }, new NearbyTripsDataOrderManagerNew$invoke$4(this, nearbyTripLiveInfoRequest, null));
    }
}
