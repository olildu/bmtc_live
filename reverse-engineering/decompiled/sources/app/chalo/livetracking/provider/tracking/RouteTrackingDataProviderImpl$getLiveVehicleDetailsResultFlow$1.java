package app.chalo.livetracking.provider.tracking;

import androidx.media3.extractor.ts.TsExtractor;
import app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManager;
import app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManagerLiveVehicleResult;
import app.chalo.livetracking.frameworklivetracking.data.model.app.RealtimeSocketRouteStreamResponseAppModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lapp/chalo/livetracking/provider/tracking/LiveVehicleDetailsResult;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.provider.tracking.RouteTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1", f = "RouteTrackingDataProviderImpl.kt", l = {128}, m = "invokeSuspend", v = 1)
final class RouteTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1 extends SuspendLambda implements Function2<ProducerScope<? super LiveVehicleDetailsResult>, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<String> $filterVehicleNumber;
    final /* synthetic */ boolean $handleBusCrossedStopDetails;
    final /* synthetic */ String $routeId;
    final /* synthetic */ boolean $shouldFetchBusGpsIfLiveVehicleDataNotAvailable;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RouteTrackingDataProviderImpl this$0;

    /* JADX INFO: renamed from: app.chalo.livetracking.provider.tracking.RouteTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final class AnonymousClass2<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RouteTrackingDataProviderImpl f4354a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ Ref.ObjectRef c;
        public final /* synthetic */ ProducerScope d;
        public final /* synthetic */ String e;
        public final /* synthetic */ List f;
        public final /* synthetic */ boolean g;

        /* JADX INFO: renamed from: app.chalo.livetracking.provider.tracking.RouteTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1$2$2, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "app.chalo.livetracking.provider.tracking.RouteTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1$2$2", f = "RouteTrackingDataProviderImpl.kt", l = {TsExtractor.TS_STREAM_TYPE_DTS_HD, TsExtractor.TS_STREAM_TYPE_E_AC3}, m = "invokeSuspend", v = 1)
        final class C01192 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ ProducerScope<LiveVehicleDetailsResult> $$this$channelFlow;
            final /* synthetic */ List<String> $filterVehicleNumber;
            final /* synthetic */ boolean $handleBusCrossedStopDetails;
            final /* synthetic */ List<RealtimeSocketRouteStreamResponseAppModel> $liveVehicles;
            final /* synthetic */ String $routeId;
            final /* synthetic */ boolean $shouldFetchBusGpsIfLiveVehicleDataNotAvailable;
            Object L$0;
            int label;
            final /* synthetic */ RouteTrackingDataProviderImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01192(ProducerScope producerScope, RouteTrackingDataProviderImpl routeTrackingDataProviderImpl, String str, List list, List list2, boolean z, boolean z2, Continuation continuation) {
                super(2, continuation);
                this.$$this$channelFlow = producerScope;
                this.this$0 = routeTrackingDataProviderImpl;
                this.$routeId = str;
                this.$liveVehicles = list;
                this.$filterVehicleNumber = list2;
                this.$handleBusCrossedStopDetails = z;
                this.$shouldFetchBusGpsIfLiveVehicleDataNotAvailable = z2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C01192(this.$$this$channelFlow, this.this$0, this.$routeId, this.$liveVehicles, this.$filterVehicleNumber, this.$handleBusCrossedStopDetails, this.$shouldFetchBusGpsIfLiveVehicleDataNotAvailable, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ((C01192) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
            
                if (r1.send(r12, r11) == r0) goto L15;
             */
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
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L22
                    if (r1 == r3) goto L19
                    if (r1 != r2) goto L11
                    kotlin.ResultKt.b(r12)
                    r10 = r11
                    goto L4b
                L11:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L19:
                    java.lang.Object r1 = r11.L$0
                    kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
                    kotlin.ResultKt.b(r12)
                    r10 = r11
                    goto L3f
                L22:
                    kotlin.ResultKt.b(r12)
                    kotlinx.coroutines.channels.ProducerScope<app.chalo.livetracking.provider.tracking.LiveVehicleDetailsResult> r1 = r11.$$this$channelFlow
                    app.chalo.livetracking.provider.tracking.RouteTrackingDataProviderImpl r4 = r11.this$0
                    java.lang.String r5 = r11.$routeId
                    java.util.List<app.chalo.livetracking.frameworklivetracking.data.model.app.RealtimeSocketRouteStreamResponseAppModel> r6 = r11.$liveVehicles
                    java.util.List<java.lang.String> r7 = r11.$filterVehicleNumber
                    boolean r8 = r11.$handleBusCrossedStopDetails
                    boolean r9 = r11.$shouldFetchBusGpsIfLiveVehicleDataNotAvailable
                    r11.L$0 = r1
                    r11.label = r3
                    r10 = r11
                    java.lang.Object r12 = app.chalo.livetracking.provider.tracking.RouteTrackingDataProviderImpl.h(r4, r5, r6, r7, r8, r9, r10)
                    if (r12 != r0) goto L3f
                    goto L4a
                L3f:
                    r3 = 0
                    r10.L$0 = r3
                    r10.label = r2
                    java.lang.Object r12 = r1.send(r12, r11)
                    if (r12 != r0) goto L4b
                L4a:
                    return r0
                L4b:
                    kotlin.Unit r12 = kotlin.Unit.f17538a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.provider.tracking.RouteTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1.AnonymousClass2.C01192.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public AnonymousClass2(RouteTrackingDataProviderImpl routeTrackingDataProviderImpl, boolean z, Ref.ObjectRef objectRef, ProducerScope producerScope, String str, List list, boolean z2) {
            this.f4354a = routeTrackingDataProviderImpl;
            this.b = z;
            this.c = objectRef;
            this.d = producerScope;
            this.e = str;
            this.f = list;
            this.g = z2;
        }

        /* JADX WARN: Code duplicated, block: B:48:0x00f3  */
        /* JADX WARN: Code duplicated, block: B:52:0x0103 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:8:0x0018  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(LiveTrackingDataManagerLiveVehicleResult.Success success, Continuation continuation) {
            RouteTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1$2$emit$1 routeTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1$2$emit$1;
            Object value;
            ArrayList arrayList;
            List list;
            List list2;
            ProducerScope producerScope;
            Object objH;
            ProducerScope producerScope2;
            if (continuation instanceof RouteTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1$2$emit$1) {
                routeTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1$2$emit$1 = (RouteTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1$2$emit$1) continuation;
                int i = routeTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1$2$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    routeTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1$2$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    routeTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1$2$emit$1 = new RouteTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1$2$emit$1(this, continuation);
                }
            } else {
                routeTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1$2$emit$1 = new RouteTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1$2$emit$1(this, continuation);
            }
            RouteTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1$2$emit$1 routeTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1$2$emit$2 = routeTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1$2$emit$1;
            Object obj = routeTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1$2$emit$2.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = routeTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1$2$emit$2.label;
            Unit unit = Unit.f17538a;
            Ref.ObjectRef objectRef = this.c;
            if (i2 != 0) {
                if (i2 == 1) {
                    list2 = (List) routeTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1$2$emit$2.L$0;
                    ResultKt.b(obj);
                } else {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj);
                        return unit;
                    }
                    producerScope2 = (ProducerScope) routeTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1$2$emit$2.L$0;
                    ResultKt.b(obj);
                }
                routeTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1$2$emit$2.L$0 = null;
                routeTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1$2$emit$2.label = 3;
                if (producerScope2.send(obj, routeTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1$2$emit$2) != coroutineSingletons) {
                    return coroutineSingletons;
                }
                return unit;
            }
            ResultKt.b(obj);
            ArrayList arrayList2 = success.f4206a;
            MutableStateFlow mutableStateFlow = this.f4354a.k;
            do {
                value = mutableStateFlow.getValue();
                arrayList = new ArrayList(CollectionsKt.v(arrayList2, 10));
                int size = arrayList2.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    arrayList.add(((RealtimeSocketRouteStreamResponseAppModel) obj2).b);
                }
            } while (!mutableStateFlow.c(value, arrayList));
            if (!arrayList2.isEmpty() || !this.b) {
                Job job = (Job) objectRef.element;
                if (job != null) {
                    routeTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1$2$emit$2.L$0 = arrayList2;
                    routeTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1$2$emit$2.label = 1;
                    if (JobKt.d(job, routeTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1$2$emit$2) != coroutineSingletons) {
                        list2 = arrayList2;
                    }
                } else {
                    list = arrayList2;
                    objectRef.element = null;
                    producerScope = this.d;
                    routeTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1$2$emit$2.L$0 = producerScope;
                    routeTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1$2$emit$2.label = 2;
                    objH = RouteTrackingDataProviderImpl.h(this.f4354a, this.e, list, this.f, this.g, this.b, routeTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1$2$emit$2);
                    if (objH != coroutineSingletons) {
                        producerScope2 = producerScope;
                        obj = objH;
                        routeTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1$2$emit$2.L$0 = null;
                        routeTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1$2$emit$2.label = 3;
                        if (producerScope2.send(obj, routeTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1$2$emit$2) != coroutineSingletons) {
                        }
                    }
                }
                return coroutineSingletons;
            }
            Job job2 = (Job) objectRef.element;
            if (job2 == null || !job2.isActive()) {
                boolean z = this.b;
                ProducerScope producerScope3 = this.d;
                objectRef.element = (T) BuildersKt.d(producerScope3, null, null, new C01192(producerScope3, this.f4354a, this.e, arrayList2, this.f, this.g, z, null), 3);
                return unit;
            }
            return unit;
            list = list2;
            objectRef.element = null;
            producerScope = this.d;
            routeTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1$2$emit$2.L$0 = producerScope;
            routeTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1$2$emit$2.label = 2;
            objH = RouteTrackingDataProviderImpl.h(this.f4354a, this.e, list, this.f, this.g, this.b, routeTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1$2$emit$2);
            if (objH != coroutineSingletons) {
                producerScope2 = producerScope;
                obj = objH;
                routeTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1$2$emit$2.L$0 = null;
                routeTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1$2$emit$2.label = 3;
                if (producerScope2.send(obj, routeTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1$2$emit$2) != coroutineSingletons) {
                    return unit;
                }
            }
            return coroutineSingletons;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1(RouteTrackingDataProviderImpl routeTrackingDataProviderImpl, String str, List list, boolean z, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = routeTrackingDataProviderImpl;
        this.$routeId = str;
        this.$filterVehicleNumber = list;
        this.$shouldFetchBusGpsIfLiveVehicleDataNotAvailable = z;
        this.$handleBusCrossedStopDetails = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RouteTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1 routeTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1 = new RouteTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1(this.this$0, this.$routeId, this.$filterVehicleNumber, this.$shouldFetchBusGpsIfLiveVehicleDataNotAvailable, this.$handleBusCrossedStopDetails, continuation);
        routeTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1.L$0 = obj;
        return routeTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RouteTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            ProducerScope producerScope = (ProducerScope) this.L$0;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            LiveTrackingDataManager liveTrackingDataManager = this.this$0.c;
            String str = this.$routeId;
            List<String> list = this.$filterVehicleNumber;
            if (list.isEmpty()) {
                list = null;
            }
            final Flow flowC = liveTrackingDataManager.c(str, list);
            Flow<Object> flow = new Flow<Object>() { // from class: app.chalo.livetracking.provider.tracking.RouteTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1$invokeSuspend$$inlined$filterIsInstance$1

                /* JADX INFO: renamed from: app.chalo.livetracking.provider.tracking.RouteTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ FlowCollector f4356a;

                    /* JADX INFO: renamed from: app.chalo.livetracking.provider.tracking.RouteTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @DebugMetadata(c = "app.chalo.livetracking.provider.tracking.RouteTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1$invokeSuspend$$inlined$filterIsInstance$1$2", f = "RouteTrackingDataProviderImpl.kt", l = {50}, m = "emit", v = 1)
                    public final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        Object L$1;
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
                        this.f4356a = flowCollector;
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
                            if (obj instanceof LiveTrackingDataManagerLiveVehicleResult.Success) {
                                anonymousClass1.label = 1;
                                if (this.f4356a.emit(obj, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
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
                    Object objCollect = flowC.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
                }
            };
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$shouldFetchBusGpsIfLiveVehicleDataNotAvailable, objectRef, producerScope, this.$routeId, this.$filterVehicleNumber, this.$handleBusCrossedStopDetails);
            this.label = 1;
            if (flow.collect(anonymousClass2, this) == coroutineSingletons) {
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
