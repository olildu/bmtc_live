package app.chalo.livetracking.tripplanner.domain;

import app.chalo.citydata.data.model.app.SeatAvailabilityLevel;
import app.chalo.contract.BasicInfoContract;
import app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManager;
import app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStore;
import app.chalo.livetracking.frameworklivetracking.data.model.StopRouteId;
import app.chalo.livetracking.frameworklivetracking.domain.GetDelayedEtaThresholdForLiveTrackingUseCase;
import app.chalo.livetracking.frameworklivetracking.domain.GetSeatAvailabilityUseCase;
import app.chalo.livetracking.routedetails.data.model.app.response.VehicleSeatAvailabilityDetailsAppModel;
import app.chalo.livetracking.routedetails.domain.CheckIsTripNotStaleUseCase;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.cityprovider.CityProvider;
import java.util.ArrayList;
import java.util.Iterator;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/livetracking/tripplanner/domain/TripPlannerItineraryLiveInfoManager;", "", "Companion", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TripPlannerItineraryLiveInfoManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContextProvider f4713a;
    public final LiveTrackingDataManager b;
    public final BasicInfoContract c;
    public final GetSeatAvailabilityUseCase d;
    public final LiveTrackingConfigDataStore e;
    public final CityProvider f;
    public final CheckIsTripNotStaleUseCase g;
    public final GetDelayedEtaThresholdForLiveTrackingUseCase h;
    public final MutableStateFlow i = StateFlowKt.a(ItineraryRequestHolder.c);
    public final MutableStateFlow j;
    public final StateFlow k;
    public final StateFlow l;
    public final ContextScope m;
    public final ArrayList n;
    public final MutexImpl o;
    public Integer p;
    public long q;

    /* JADX INFO: renamed from: app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager$1", f = "TripPlannerItineraryLiveInfoManager.kt", l = {EACTags.DEPRECATED, EACTags.INTEGRATED_CIRCUIT_MANUFACTURER_ID}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        /* JADX INFO: renamed from: app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lapp/chalo/livetracking/tripplanner/domain/ItineraryRequestHolder;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager$1$1", f = "TripPlannerItineraryLiveInfoManager.kt", l = {78}, m = "invokeSuspend", v = 1)
        final class C01201 extends SuspendLambda implements Function2<ItineraryRequestHolder, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ TripPlannerItineraryLiveInfoManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01201(TripPlannerItineraryLiveInfoManager tripPlannerItineraryLiveInfoManager, Continuation continuation) {
                super(2, continuation);
                this.this$0 = tripPlannerItineraryLiveInfoManager;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C01201 c01201 = new C01201(this.this$0, continuation);
                c01201.L$0 = obj;
                return c01201;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ((C01201) create((ItineraryRequestHolder) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                Unit unit = Unit.f17538a;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    return unit;
                }
                ResultKt.b(obj);
                ItineraryRequestHolder itineraryRequestHolder = (ItineraryRequestHolder) this.L$0;
                TripPlannerItineraryLiveInfoManager tripPlannerItineraryLiveInfoManager = this.this$0;
                List<ItineraryLiveInfoRequest> list = itineraryRequestHolder.b;
                this.label = 1;
                tripPlannerItineraryLiveInfoManager.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (ItineraryLiveInfoRequest itineraryLiveInfoRequest : list) {
                    Pair pair = new Pair(new RouteId(itineraryLiveInfoRequest.getB()), new StopId(itineraryLiveInfoRequest.getC()));
                    List list2 = (List) linkedHashMap.get(pair);
                    ArrayList arrayListE0 = list2 != null ? CollectionsKt.E0(list2) : new ArrayList();
                    arrayListE0.add(itineraryLiveInfoRequest);
                    linkedHashMap.put(pair, arrayListE0);
                }
                Set<Pair> setKeySet = linkedHashMap.keySet();
                ArrayList arrayList = new ArrayList(CollectionsKt.v(setKeySet, 10));
                for (Pair pair2 : setKeySet) {
                    RouteId routeId = (RouteId) pair2.getFirst();
                    arrayList.add(new StopRouteId(((StopId) pair2.getSecond()).f4712a, routeId.f4711a));
                }
                Object objD = tripPlannerItineraryLiveInfoManager.d(BuildersKt.d(tripPlannerItineraryLiveInfoManager.m, tripPlannerItineraryLiveInfoManager.f4713a.a(), null, new TripPlannerItineraryLiveInfoManager$makeEtaConnectionForDistinctRouteStopCombo$job$1(tripPlannerItineraryLiveInfoManager, arrayList, linkedHashMap, null), 2), this);
                if (objD != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    objD = unit;
                }
                return objD == coroutineSingletons ? coroutineSingletons : unit;
            }
        }

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return TripPlannerItineraryLiveInfoManager.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.j(r1, r3, r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r5.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                kotlin.ResultKt.b(r6)
                goto L4f
            L10:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L18:
                java.lang.Object r1 = r5.L$0
                app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager r1 = (app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager) r1
                kotlin.ResultKt.b(r6)
                goto L32
            L20:
                kotlin.ResultKt.b(r6)
                app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager r1 = app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager.this
                app.chalo.livetracking.frameworklivetracking.domain.GetDelayedEtaThresholdForLiveTrackingUseCase r6 = r1.h
                r5.L$0 = r1
                r5.label = r3
                java.lang.Object r6 = r6.a(r5)
                if (r6 != r0) goto L32
                goto L4e
            L32:
                java.lang.Number r6 = (java.lang.Number) r6
                long r3 = r6.longValue()
                r1.q = r3
                app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager r6 = app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager.this
                kotlinx.coroutines.flow.MutableStateFlow r1 = r6.i
                app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager$1$1 r3 = new app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager$1$1
                r4 = 0
                r3.<init>(r6, r4)
                r5.L$0 = r4
                r5.label = r2
                java.lang.Object r6 = kotlinx.coroutines.flow.FlowKt.j(r1, r3, r5)
                if (r6 != r0) goto L4f
            L4e:
                return r0
            L4f:
                kotlin.Unit r6 = kotlin.Unit.f17538a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lapp/chalo/livetracking/routedetails/data/model/app/response/VehicleSeatAvailabilityDetailsAppModel;", "vehicleNumbers", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager$3", f = "TripPlannerItineraryLiveInfoManager.kt", l = {91, 95, 96, 99}, m = "invokeSuspend", v = 1)
    final class AnonymousClass3 extends SuspendLambda implements Function3<FlowCollector<? super List<? extends VehicleSeatAvailabilityDetailsAppModel>>, List<? extends String>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        Object L$2;
        int label;

        public AnonymousClass3(Continuation continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass3 anonymousClass3 = TripPlannerItineraryLiveInfoManager.this.new AnonymousClass3((Continuation) obj3);
            anonymousClass3.L$0 = (FlowCollector) obj;
            anonymousClass3.L$1 = (List) obj2;
            return anonymousClass3.invokeSuspend(Unit.f17538a);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0069  */
        /* JADX WARN: Code duplicated, block: B:20:0x0076  */
        /* JADX WARN: Code duplicated, block: B:23:0x0088  */
        /* JADX WARN: Code duplicated, block: B:26:0x0097  */
        /* JADX WARN: Code duplicated, block: B:29:0x009f  */
        /* JADX WARN: Code duplicated, block: B:32:0x00ae A[PHI: r1 r6 r7
          0x00ae: PHI (r1v3 kotlinx.coroutines.flow.FlowCollector) = 
          (r1v4 kotlinx.coroutines.flow.FlowCollector)
          (r1v4 kotlinx.coroutines.flow.FlowCollector)
          (r1v13 kotlinx.coroutines.flow.FlowCollector)
         binds: [B:28:0x009d, B:30:0x00ab, B:12:0x002c] A[DONT_GENERATE, DONT_INLINE]
          0x00ae: PHI (r6v1 app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager) = 
          (r6v2 app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager)
          (r6v2 app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager)
          (r6v8 app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager)
         binds: [B:28:0x009d, B:30:0x00ab, B:12:0x002c] A[DONT_GENERATE, DONT_INLINE]
          0x00ae: PHI (r7v0 java.util.List) = (r7v1 java.util.List), (r7v1 java.util.List), (r7v13 java.util.List) binds: [B:28:0x009d, B:30:0x00ab, B:12:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
        
            if (r12.emit(r1, r11) == r0) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00bc, code lost:
        
            if (kotlinx.coroutines.DelayKt.b(15000, r11) == r0) goto L34;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00bc -> B:9:0x0021). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r11.label
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L52
                if (r1 == r5) goto L4d
                if (r1 == r4) goto L3d
                if (r1 == r3) goto L2c
                if (r1 != r2) goto L24
                java.lang.Object r1 = r11.L$2
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                java.lang.Object r6 = r11.L$1
                app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager r6 = (app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager) r6
                java.lang.Object r7 = r11.L$0
                java.util.List r7 = (java.util.List) r7
                kotlin.ResultKt.b(r12)
            L21:
                r12 = r1
                r1 = r7
                goto L5f
            L24:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L2c:
                java.lang.Object r1 = r11.L$2
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                java.lang.Object r6 = r11.L$1
                app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager r6 = (app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager) r6
                java.lang.Object r7 = r11.L$0
                java.util.List r7 = (java.util.List) r7
                kotlin.ResultKt.b(r12)
                goto Lae
            L3d:
                java.lang.Object r1 = r11.L$2
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                java.lang.Object r6 = r11.L$1
                app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager r6 = (app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager) r6
                java.lang.Object r7 = r11.L$0
                java.util.List r7 = (java.util.List) r7
                kotlin.ResultKt.b(r12)
                goto L9b
            L4d:
                kotlin.ResultKt.b(r12)
                goto Lbf
            L52:
                kotlin.ResultKt.b(r12)
                java.lang.Object r12 = r11.L$0
                kotlinx.coroutines.flow.FlowCollector r12 = (kotlinx.coroutines.flow.FlowCollector) r12
                java.lang.Object r1 = r11.L$1
                java.util.List r1 = (java.util.List) r1
                app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager r6 = app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager.this
            L5f:
                kotlin.coroutines.CoroutineContext r7 = r11.getContext()
                boolean r7 = kotlinx.coroutines.JobKt.h(r7)
                if (r7 == 0) goto Lbf
                r7 = r1
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.List r7 = kotlin.collections.CollectionsKt.z(r7)
                boolean r8 = r7.isEmpty()
                if (r8 == 0) goto L88
                kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.f17557a
                r2 = 0
                r11.L$0 = r2
                r11.L$1 = r2
                r11.L$2 = r2
                r11.label = r5
                java.lang.Object r12 = r12.emit(r1, r11)
                if (r12 != r0) goto Lbf
                goto Lbe
            L88:
                r11.L$0 = r1
                r11.L$1 = r6
                r11.L$2 = r12
                r11.label = r4
                java.lang.Object r7 = app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager.b(r6, r7, r11)
                if (r7 != r0) goto L97
                goto Lbe
            L97:
                r10 = r1
                r1 = r12
                r12 = r7
                r7 = r10
            L9b:
                java.util.List r12 = (java.util.List) r12
                if (r12 == 0) goto Lae
                r11.L$0 = r7
                r11.L$1 = r6
                r11.L$2 = r1
                r11.label = r3
                java.lang.Object r12 = r1.emit(r12, r11)
                if (r12 != r0) goto Lae
                goto Lbe
            Lae:
                r11.L$0 = r7
                r11.L$1 = r6
                r11.L$2 = r1
                r11.label = r2
                r8 = 15000(0x3a98, double:7.411E-320)
                java.lang.Object r12 = kotlinx.coroutines.DelayKt.b(r8, r11)
                if (r12 != r0) goto L21
            Lbe:
                return r0
            Lbf:
                kotlin.Unit r12 = kotlin.Unit.f17538a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001H\n"}, d2 = {"<anonymous>", "", "Lapp/chalo/livetracking/tripplanner/domain/ItineraryLiveInfoResult;", "etaResultList", "Lapp/chalo/livetracking/tripplanner/domain/ItineraryAndEtaHolder;", "seatAvailabilityList", "Lapp/chalo/livetracking/routedetails/data/model/app/response/VehicleSeatAvailabilityDetailsAppModel;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager$4", f = "TripPlannerItineraryLiveInfoManager.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass4 extends SuspendLambda implements Function3<List<? extends ItineraryAndEtaHolder>, List<? extends VehicleSeatAvailabilityDetailsAppModel>, Continuation<? super List<? extends ItineraryLiveInfoResult>>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(3, (Continuation) obj3);
            anonymousClass4.L$0 = (List) obj;
            anonymousClass4.L$1 = (List) obj2;
            return anonymousClass4.invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            List list = (List) this.L$0;
            List<VehicleSeatAvailabilityDetailsAppModel> list2 = (List) this.L$1;
            int iG = MapsKt.g(CollectionsKt.v(list2, 10));
            if (iG < 16) {
                iG = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iG);
            for (VehicleSeatAvailabilityDetailsAppModel vehicleSeatAvailabilityDetailsAppModel : list2) {
                linkedHashMap.put(vehicleSeatAvailabilityDetailsAppModel.f4397a, vehicleSeatAvailabilityDetailsAppModel.b);
            }
            List<ItineraryAndEtaHolder> list3 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.v(list3, 10));
            for (ItineraryAndEtaHolder itineraryAndEtaHolder : list3) {
                ItineraryLiveInfoRequest itineraryLiveInfoRequest = itineraryAndEtaHolder.f4697a;
                ItineraryEtaInfo itineraryEtaInfo = itineraryAndEtaHolder.b;
                if (itineraryEtaInfo == null || (str = itineraryEtaInfo.b) == null) {
                    str = "";
                }
                arrayList.add(new ItineraryLiveInfoResult(itineraryLiveInfoRequest, itineraryEtaInfo, (SeatAvailabilityLevel) linkedHashMap.get(str)));
            }
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/livetracking/tripplanner/domain/TripPlannerItineraryLiveInfoManager$Companion;", "", "", "SEAT_AVAILABILITY_FETCH_INTERVAL_IN_MILLIS", "J", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public TripPlannerItineraryLiveInfoManager(CoroutineContextProvider coroutineContextProvider, LiveTrackingDataManager liveTrackingDataManager, BasicInfoContract basicInfoContract, GetSeatAvailabilityUseCase getSeatAvailabilityUseCase, LiveTrackingConfigDataStore liveTrackingConfigDataStore, CityProvider cityProvider, CheckIsTripNotStaleUseCase checkIsTripNotStaleUseCase, GetDelayedEtaThresholdForLiveTrackingUseCase getDelayedEtaThresholdForLiveTrackingUseCase) {
        this.f4713a = coroutineContextProvider;
        this.b = liveTrackingDataManager;
        this.c = basicInfoContract;
        this.d = getSeatAvailabilityUseCase;
        this.e = liveTrackingConfigDataStore;
        this.f = cityProvider;
        this.g = checkIsTripNotStaleUseCase;
        this.h = getDelayedEtaThresholdForLiveTrackingUseCase;
        EmptyList emptyList = EmptyList.f17557a;
        final MutableStateFlow mutableStateFlowA = StateFlowKt.a(emptyList);
        this.j = mutableStateFlowA;
        ContextScope contextScopeA = CoroutineScopeKt.a(coroutineContextProvider.b());
        this.m = contextScopeA;
        this.n = new ArrayList();
        this.o = MutexKt.a();
        this.q = 2L;
        BuildersKt.d(contextScopeA, null, null, new AnonymousClass1(null), 3);
        StateFlow stateFlowG = FlowKt.G(FlowKt.H(FlowKt.l(FlowKt.G(new Flow<List<? extends String>>() { // from class: app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager$special$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager$special$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f4718a;

                /* JADX INFO: renamed from: app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager$special$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager$special$$inlined$map$1$2", f = "TripPlannerItineraryLiveInfoManager.kt", l = {50}, m = "emit", v = 1)
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
                    this.f4718a = flowCollector;
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
                        Iterator<T> it = ((List) obj).iterator();
                        while (it.hasNext()) {
                            ItineraryEtaInfo itineraryEtaInfo = ((ItineraryAndEtaHolder) it.next()).b;
                            String str = itineraryEtaInfo != null ? itineraryEtaInfo.b : null;
                            if (str != null) {
                                arrayList.add(str);
                            }
                        }
                        anonymousClass1.label = 1;
                        if (this.f4718a.emit(arrayList, anonymousClass1) == coroutineSingletons) {
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
                Object objCollect = mutableStateFlowA.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        }, contextScopeA, SharingStarted.Companion.a(), emptyList), 500L), new AnonymousClass3(null)), contextScopeA, SharingStarted.Companion.a(), emptyList);
        this.k = stateFlowG;
        this.l = FlowKt.G(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(mutableStateFlowA, stateFlowG, new AnonymousClass4(3, null)), contextScopeA, SharingStarted.Companion.a(), emptyList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object a(TripPlannerItineraryLiveInfoManager tripPlannerItineraryLiveInfoManager, ContinuationImpl continuationImpl) {
        TripPlannerItineraryLiveInfoManager$clearAllJobs$1 tripPlannerItineraryLiveInfoManager$clearAllJobs$1;
        Mutex mutex;
        ArrayList arrayList = tripPlannerItineraryLiveInfoManager.n;
        if (continuationImpl instanceof TripPlannerItineraryLiveInfoManager$clearAllJobs$1) {
            tripPlannerItineraryLiveInfoManager$clearAllJobs$1 = (TripPlannerItineraryLiveInfoManager$clearAllJobs$1) continuationImpl;
            int i = tripPlannerItineraryLiveInfoManager$clearAllJobs$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tripPlannerItineraryLiveInfoManager$clearAllJobs$1.label = i - Integer.MIN_VALUE;
            } else {
                tripPlannerItineraryLiveInfoManager$clearAllJobs$1 = new TripPlannerItineraryLiveInfoManager$clearAllJobs$1(tripPlannerItineraryLiveInfoManager, continuationImpl);
            }
        } else {
            tripPlannerItineraryLiveInfoManager$clearAllJobs$1 = new TripPlannerItineraryLiveInfoManager$clearAllJobs$1(tripPlannerItineraryLiveInfoManager, continuationImpl);
        }
        Object obj = tripPlannerItineraryLiveInfoManager$clearAllJobs$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = tripPlannerItineraryLiveInfoManager$clearAllJobs$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            mutex = tripPlannerItineraryLiveInfoManager.o;
            tripPlannerItineraryLiveInfoManager$clearAllJobs$1.L$0 = mutex;
            tripPlannerItineraryLiveInfoManager$clearAllJobs$1.label = 1;
            if (mutex.a(tripPlannerItineraryLiveInfoManager$clearAllJobs$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutex = (Mutex) tripPlannerItineraryLiveInfoManager$clearAllJobs$1.L$0;
            ResultKt.b(obj);
        }
        try {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj2 = arrayList.get(i3);
                i3++;
                ((Job) obj2).cancel(null);
            }
            arrayList.clear();
            return Unit.f17538a;
        } finally {
            mutex.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
    
        if (r8 == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager r6, java.util.List r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6.getClass()
            boolean r0 = r8 instanceof app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager$fetchSeatAvailability$1
            if (r0 == 0) goto L16
            r0 = r8
            app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager$fetchSeatAvailability$1 r0 = (app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager$fetchSeatAvailability$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.label = r1
            goto L1b
        L16:
            app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager$fetchSeatAvailability$1 r0 = new app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager$fetchSeatAvailability$1
            r0.<init>(r6, r8)
        L1b:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            kotlin.ResultKt.b(r8)
            goto L7d
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            java.lang.Object r7 = r0.L$0
            java.util.List r7 = (java.util.List) r7
            kotlin.ResultKt.b(r8)
            goto L62
        L3e:
            kotlin.ResultKt.b(r8)
            app.chalo.providers.cityprovider.CityProvider r8 = r6.f
            java.lang.String r8 = app.chalo.providers.cityprovider.CityProviderKt.b(r8)
            if (r8 == 0) goto Lac
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r8 = r8.toLowerCase(r2)
            java.lang.String r2 = "toLowerCase(...)"
            kotlin.jvm.internal.Intrinsics.h(r8, r2)
            app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStore r2 = r6.e
            r0.L$0 = r7
            r0.label = r4
            java.lang.Object r8 = r2.e(r8, r0)
            if (r8 != r1) goto L62
            goto L7c
        L62:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto Lab
            java.lang.Integer r8 = kotlin.text.StringsKt.q0(r8)
            if (r8 == 0) goto Lab
            int r8 = r8.intValue()
            app.chalo.livetracking.frameworklivetracking.domain.GetSeatAvailabilityUseCase r6 = r6.d
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r8 = r6.a(r8, r7, r0)
            if (r8 != r1) goto L7d
        L7c:
            return r1
        L7d:
            app.chalo.utils.ChaloUseCaseResult r8 = (app.chalo.utils.ChaloUseCaseResult) r8
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "seatAvailabilityResult "
            r6.<init>(r7)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "message"
            kotlin.jvm.internal.Intrinsics.i(r6, r7)
            boolean r6 = r8 instanceof app.chalo.utils.ChaloUseCaseResult.Failure
            if (r6 == 0) goto L98
            goto Lab
        L98:
            boolean r6 = r8 instanceof app.chalo.utils.ChaloUseCaseResult.Success
            if (r6 == 0) goto La5
            app.chalo.utils.ChaloUseCaseResult$Success r8 = (app.chalo.utils.ChaloUseCaseResult.Success) r8
            java.lang.Object r6 = r8.f10419a
            app.chalo.livetracking.routedetails.data.model.app.response.SeatAvailabilityAppModel r6 = (app.chalo.livetracking.routedetails.data.model.app.response.SeatAvailabilityAppModel) r6
            java.util.ArrayList r6 = r6.f4395a
            return r6
        La5:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        Lab:
            return r5
        Lac:
            kotlin.collections.EmptyList r6 = kotlin.collections.EmptyList.f17557a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager.b(app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void c(List requests, Integer num) {
        Intrinsics.i(requests, "requests");
        BuildersKt.d(this.m, null, null, new TripPlannerItineraryLiveInfoManager$addItinerariesRequests$1(this, requests, num, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(Job job, ContinuationImpl continuationImpl) {
        TripPlannerItineraryLiveInfoManager$addJob$1 tripPlannerItineraryLiveInfoManager$addJob$1;
        Mutex mutex;
        if (continuationImpl instanceof TripPlannerItineraryLiveInfoManager$addJob$1) {
            tripPlannerItineraryLiveInfoManager$addJob$1 = (TripPlannerItineraryLiveInfoManager$addJob$1) continuationImpl;
            int i = tripPlannerItineraryLiveInfoManager$addJob$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tripPlannerItineraryLiveInfoManager$addJob$1.label = i - Integer.MIN_VALUE;
            } else {
                tripPlannerItineraryLiveInfoManager$addJob$1 = new TripPlannerItineraryLiveInfoManager$addJob$1(this, continuationImpl);
            }
        } else {
            tripPlannerItineraryLiveInfoManager$addJob$1 = new TripPlannerItineraryLiveInfoManager$addJob$1(this, continuationImpl);
        }
        Object obj = tripPlannerItineraryLiveInfoManager$addJob$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = tripPlannerItineraryLiveInfoManager$addJob$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            tripPlannerItineraryLiveInfoManager$addJob$1.L$0 = job;
            mutex = this.o;
            tripPlannerItineraryLiveInfoManager$addJob$1.L$1 = mutex;
            tripPlannerItineraryLiveInfoManager$addJob$1.label = 1;
            if (mutex.a(tripPlannerItineraryLiveInfoManager$addJob$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Mutex mutex2 = (Mutex) tripPlannerItineraryLiveInfoManager$addJob$1.L$1;
            Job job2 = (Job) tripPlannerItineraryLiveInfoManager$addJob$1.L$0;
            ResultKt.b(obj);
            mutex = mutex2;
            job = job2;
        }
        try {
            this.n.add(job);
            return Unit.f17538a;
        } finally {
            mutex.e(null);
        }
    }

    public final void e() {
        CoroutineScopeKt.b(this.m, null);
        this.n.clear();
    }
}
