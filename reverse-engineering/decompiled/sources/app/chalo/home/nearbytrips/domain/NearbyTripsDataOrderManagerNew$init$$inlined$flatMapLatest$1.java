package app.chalo.home.nearbytrips.domain;

import androidx.media3.extractor.ts.PsExtractor;
import app.chalo.livetracking.tripplanner.domain.ItineraryLiveInfoRequest;
import app.chalo.livetracking.tripplanner.domain.ItineraryLiveInfoResult;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
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
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\n¨\u0006\u0006"}, d2 = {"<anonymous>", "", "R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.nearbytrips.domain.NearbyTripsDataOrderManagerNew$init$$inlined$flatMapLatest$1", f = "NearbyTripsDataOrderManagerNew.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend", v = 1)
public final class NearbyTripsDataOrderManagerNew$init$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<? super List<? extends ItineraryLiveInfoResult>>, Set<? extends ItineraryLiveInfoRequest>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ NearbyTripsDataOrderManagerNew this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearbyTripsDataOrderManagerNew$init$$inlined$flatMapLatest$1(NearbyTripsDataOrderManagerNew nearbyTripsDataOrderManagerNew, Continuation continuation) {
        super(3, continuation);
        this.this$0 = nearbyTripsDataOrderManagerNew;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        NearbyTripsDataOrderManagerNew$init$$inlined$flatMapLatest$1 nearbyTripsDataOrderManagerNew$init$$inlined$flatMapLatest$1 = new NearbyTripsDataOrderManagerNew$init$$inlined$flatMapLatest$1(this.this$0, (Continuation) obj3);
        nearbyTripsDataOrderManagerNew$init$$inlined$flatMapLatest$1.L$0 = (FlowCollector) obj;
        nearbyTripsDataOrderManagerNew$init$$inlined$flatMapLatest$1.L$1 = obj2;
        return nearbyTripsDataOrderManagerNew$init$$inlined$flatMapLatest$1.invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            final Set set = (Set) this.L$1;
            final NearbyTripsDataOrderManagerNew nearbyTripsDataOrderManagerNew = this.this$0;
            final StateFlow stateFlow = nearbyTripsDataOrderManagerNew.f3123a.l;
            Flow<List<? extends ItineraryLiveInfoResult>> flow = new Flow<List<? extends ItineraryLiveInfoResult>>() { // from class: app.chalo.home.nearbytrips.domain.NearbyTripsDataOrderManagerNew$init$lambda$1$$inlined$map$1

                /* JADX INFO: renamed from: app.chalo.home.nearbytrips.domain.NearbyTripsDataOrderManagerNew$init$lambda$1$$inlined$map$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ FlowCollector f3128a;
                    public final /* synthetic */ NearbyTripsDataOrderManagerNew b;
                    public final /* synthetic */ Set c;

                    /* JADX INFO: renamed from: app.chalo.home.nearbytrips.domain.NearbyTripsDataOrderManagerNew$init$lambda$1$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @DebugMetadata(c = "app.chalo.home.nearbytrips.domain.NearbyTripsDataOrderManagerNew$init$lambda$1$$inlined$map$1$2", f = "NearbyTripsDataOrderManagerNew.kt", l = {50}, m = "emit", v = 1)
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

                    public AnonymousClass2(FlowCollector flowCollector, NearbyTripsDataOrderManagerNew nearbyTripsDataOrderManagerNew, Set set) {
                        this.f3128a = flowCollector;
                        this.b = nearbyTripsDataOrderManagerNew;
                        this.c = set;
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
                            List list = (List) obj;
                            Iterable<ItineraryLiveInfoResult> iterable = (Iterable) this.b.d.getValue();
                            int iG = MapsKt.g(CollectionsKt.v(iterable, 10));
                            if (iG < 16) {
                                iG = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(iG);
                            for (ItineraryLiveInfoResult itineraryLiveInfoResult : iterable) {
                                Pair pair = new Pair(itineraryLiveInfoResult.f4701a, itineraryLiveInfoResult);
                                linkedHashMap.put(pair.d(), pair.e());
                            }
                            List<ItineraryLiveInfoResult> list2 = list;
                            int iG2 = MapsKt.g(CollectionsKt.v(list2, 10));
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iG2 >= 16 ? iG2 : 16);
                            for (ItineraryLiveInfoResult itineraryLiveInfoResult2 : list2) {
                                Pair pair2 = new Pair(itineraryLiveInfoResult2.f4701a, itineraryLiveInfoResult2);
                                linkedHashMap2.put(pair2.d(), pair2.e());
                            }
                            Set<ItineraryLiveInfoRequest> set = this.c;
                            ArrayList arrayList = new ArrayList();
                            for (ItineraryLiveInfoRequest itineraryLiveInfoRequest : set) {
                                ItineraryLiveInfoResult itineraryLiveInfoResult3 = (ItineraryLiveInfoResult) linkedHashMap2.get(itineraryLiveInfoRequest);
                                if (itineraryLiveInfoResult3 == null) {
                                    itineraryLiveInfoResult3 = (ItineraryLiveInfoResult) linkedHashMap.get(itineraryLiveInfoRequest);
                                }
                                if (itineraryLiveInfoResult3 != null) {
                                    arrayList.add(itineraryLiveInfoResult3);
                                }
                            }
                            anonymousClass1.label = 1;
                            if (this.f3128a.emit(arrayList, anonymousClass1) == coroutineSingletons) {
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
                public final Object collect(FlowCollector flowCollector2, Continuation continuation) {
                    Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector2, nearbyTripsDataOrderManagerNew, set), continuation);
                    return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
                }
            };
            this.label = 1;
            if (FlowKt.r(flowCollector, flow, this) == coroutineSingletons) {
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
