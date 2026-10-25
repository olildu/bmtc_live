package app.chalo.livetracking.frameworklivetracking;

import app.chalo.livetracking.frameworklivetracking.data.model.ChaloSocketRequest;
import app.chalo.livetracking.frameworklivetracking.data.model.ChaloSocketResponse;
import app.chalo.livetracking.frameworklivetracking.data.model.RealTimeSocketRequest;
import app.chalo.livetracking.frameworklivetracking.data.model.StopRouteId;
import app.chalo.livetracking.frameworklivetracking.data.model.app.ChaloRtsServiceConfigAppModel;
import app.chalo.livetracking.frameworklivetracking.data.model.app.ChaloSocketConfigResponseAppModel;
import app.chalo.livetracking.frameworklivetracking.data.model.app.ProcessRTSDataResult;
import app.chalo.livetracking.frameworklivetracking.data.model.app.RealTimeSocketResponseErrorType;
import app.chalo.livetracking.frameworklivetracking.data.model.app.RealtimeSocketResult;
import app.chalo.livetracking.frameworklivetracking.data.model.app.SubscriptionRetryPolicy;
import defpackage.fr0;
import defpackage.m;
import defpackage.qv0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/app/RealtimeSocketResult;", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.frameworklivetracking.RealTimeSocketManagerImpl$subscribe$2", f = "RealTimeSocketManagerImpl.kt", l = {265}, m = "invokeSuspend", v = 1)
final class RealTimeSocketManagerImpl$subscribe$2 extends SuspendLambda implements Function2<Unit, Continuation<? super Flow<? extends RealtimeSocketResult>>, Object> {
    final /* synthetic */ RealTimeSocketRequest $realTimeSocketRequest;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ RealTimeSocketManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealTimeSocketManagerImpl$subscribe$2(RealTimeSocketRequest realTimeSocketRequest, RealTimeSocketManagerImpl realTimeSocketManagerImpl, Continuation continuation) {
        super(2, continuation);
        this.$realTimeSocketRequest = realTimeSocketRequest;
        this.this$0 = realTimeSocketManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RealTimeSocketManagerImpl$subscribe$2(this.$realTimeSocketRequest, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RealTimeSocketManagerImpl$subscribe$2) create((Unit) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x010d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        List list;
        String str;
        Object obj2;
        final Flow flowE;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            RealTimeSocketRequest realTimeSocketRequest = this.$realTimeSocketRequest;
            if (realTimeSocketRequest instanceof RealTimeSocketRequest.EtasList) {
                List<StopRouteId> listZ = CollectionsKt.z(((RealTimeSocketRequest.EtasList) realTimeSocketRequest).b);
                arrayList = new ArrayList(CollectionsKt.v(listZ, 10));
                for (StopRouteId stopRouteId : listZ) {
                    arrayList.add("etas:" + stopRouteId.f4267a + ":" + stopRouteId.b);
                }
            } else {
                if (!(realTimeSocketRequest instanceof RealTimeSocketRequest.Etas) && !(realTimeSocketRequest instanceof RealTimeSocketRequest.Route)) {
                    throw new NoWhenBranchMatchedException();
                }
                arrayList = null;
            }
            String strA = this.$realTimeSocketRequest.a();
            KAtomicInteger kAtomicInteger = this.this$0.k;
            this.L$0 = strA;
            this.L$1 = arrayList;
            this.label = 1;
            Object objA = kAtomicInteger.a(this);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            list = arrayList;
            str = strA;
            obj = objA;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) this.L$1;
            str = (String) this.L$0;
            ResultKt.b(obj);
        }
        ChaloSocketRequest chaloSocketRequest = new ChaloSocketRequest(((Number) obj).intValue(), str, list);
        ChaloSocketConfigResponseAppModel chaloSocketConfigResponseAppModel = ((ChaloConfigState) this.this$0.m.getValue()).b;
        if (chaloSocketConfigResponseAppModel == null || (obj2 = (ChaloRtsServiceConfigAppModel) chaloSocketConfigResponseAppModel.b.get(this.$realTimeSocketRequest.f4266a)) == null) {
            obj2 = ChaloRtsServiceConfigAppModel.Unknown.b;
        }
        if (obj2 instanceof ChaloRtsServiceConfigAppModel.WithPolling) {
            RealTimeSocketManagerImpl realTimeSocketManagerImpl = this.this$0;
            final Flow flowF = realTimeSocketManagerImpl.b.f(chaloSocketRequest, new fr0(24, realTimeSocketManagerImpl, (ChaloRtsServiceConfigAppModel.WithPolling) obj2));
            final RealTimeSocketManagerImpl realTimeSocketManagerImpl2 = this.this$0;
            final RealTimeSocketRequest realTimeSocketRequest2 = this.$realTimeSocketRequest;
            return new Flow<RealtimeSocketResult>() { // from class: app.chalo.livetracking.frameworklivetracking.RealTimeSocketManagerImpl$subscribe$2$invokeSuspend$$inlined$map$1

                /* JADX INFO: renamed from: app.chalo.livetracking.frameworklivetracking.RealTimeSocketManagerImpl$subscribe$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ FlowCollector f4213a;
                    public final /* synthetic */ RealTimeSocketManagerImpl b;
                    public final /* synthetic */ RealTimeSocketRequest c;

                    /* JADX INFO: renamed from: app.chalo.livetracking.frameworklivetracking.RealTimeSocketManagerImpl$subscribe$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @DebugMetadata(c = "app.chalo.livetracking.frameworklivetracking.RealTimeSocketManagerImpl$subscribe$2$invokeSuspend$$inlined$map$1$2", f = "RealTimeSocketManagerImpl.kt", l = {50}, m = "emit", v = 1)
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

                    public AnonymousClass2(FlowCollector flowCollector, RealTimeSocketManagerImpl realTimeSocketManagerImpl, RealTimeSocketRequest realTimeSocketRequest) {
                        this.f4213a = flowCollector;
                        this.b = realTimeSocketManagerImpl;
                        this.c = realTimeSocketRequest;
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
                            RealTimeSocketRequest realTimeSocketRequest = this.c;
                            ProcessRTSDataResult.No no = ProcessRTSDataResult.No.f4302a;
                            RealtimeSocketResult realtimeSocketResultC = RealTimeSocketManagerImpl.c(this.b, realTimeSocketRequest, (ChaloSocketResponse) obj, no);
                            anonymousClass1.label = 1;
                            if (this.f4213a.emit(realtimeSocketResultC, anonymousClass1) == coroutineSingletons) {
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
                    Object objCollect = flowF.collect(new AnonymousClass2(flowCollector, realTimeSocketManagerImpl2, realTimeSocketRequest2), continuation);
                    return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
                }
            };
        }
        if (!(obj2 instanceof ChaloRtsServiceConfigAppModel.WithSubscription)) {
            if (obj2.equals(ChaloRtsServiceConfigAppModel.Unknown.b)) {
                return new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(new RealtimeSocketResult.Error(RealTimeSocketResponseErrorType.InvalidRtsService.f4307a));
            }
            throw new NoWhenBranchMatchedException();
        }
        RealTimeSocketManagerImpl realTimeSocketManagerImpl3 = this.this$0;
        ChaloRtsServiceConfigAppModel.WithSubscription withSubscription = (ChaloRtsServiceConfigAppModel.WithSubscription) obj2;
        ChaloSocketFeature chaloSocketFeature = realTimeSocketManagerImpl3.b;
        SubscriptionRetryPolicy subscriptionRetryPolicy = withSubscription.d;
        if (subscriptionRetryPolicy != null) {
            Ref.LongRef longRef = new Ref.LongRef();
            longRef.element = subscriptionRetryPolicy.c;
            flowE = chaloSocketFeature.e(chaloSocketRequest, subscriptionRetryPolicy.b, new qv0(new m(27, realTimeSocketManagerImpl3, longRef, subscriptionRetryPolicy), 12));
            if (flowE == null) {
                flowE = chaloSocketFeature.e(chaloSocketRequest, 1, null);
            }
        } else {
            flowE = chaloSocketFeature.e(chaloSocketRequest, 1, null);
        }
        long j = withSubscription.b;
        FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = j != -1 ? new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(chaloSocketFeature.f(chaloSocketRequest, new fr0(25, realTimeSocketManagerImpl3, withSubscription)), new RealTimeSocketManagerImpl$handleSubscription$pollingFlow$2(RealTimeSocketManagerImpl.e(j, withSubscription.c), null)) : null;
        if (flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 != null) {
            flowE = FlowKt.m(FlowKt.B(flowE, flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1));
        }
        final RealTimeSocketManagerImpl realTimeSocketManagerImpl4 = this.this$0;
        final RealTimeSocketRequest realTimeSocketRequest3 = this.$realTimeSocketRequest;
        return new Flow<RealtimeSocketResult>() { // from class: app.chalo.livetracking.frameworklivetracking.RealTimeSocketManagerImpl$subscribe$2$invokeSuspend$$inlined$map$2

            /* JADX INFO: renamed from: app.chalo.livetracking.frameworklivetracking.RealTimeSocketManagerImpl$subscribe$2$invokeSuspend$$inlined$map$2$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f4215a;
                public final /* synthetic */ RealTimeSocketManagerImpl b;
                public final /* synthetic */ RealTimeSocketRequest c;

                /* JADX INFO: renamed from: app.chalo.livetracking.frameworklivetracking.RealTimeSocketManagerImpl$subscribe$2$invokeSuspend$$inlined$map$2$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.livetracking.frameworklivetracking.RealTimeSocketManagerImpl$subscribe$2$invokeSuspend$$inlined$map$2$2", f = "RealTimeSocketManagerImpl.kt", l = {50}, m = "emit", v = 1)
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

                public AnonymousClass2(FlowCollector flowCollector, RealTimeSocketManagerImpl realTimeSocketManagerImpl, RealTimeSocketRequest realTimeSocketRequest) {
                    this.f4215a = flowCollector;
                    this.b = realTimeSocketManagerImpl;
                    this.c = realTimeSocketRequest;
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
                        ProcessRTSDataResult.Yes yes = new ProcessRTSDataResult.Yes();
                        RealtimeSocketResult realtimeSocketResultC = RealTimeSocketManagerImpl.c(this.b, this.c, (ChaloSocketResponse) obj, yes);
                        anonymousClass1.label = 1;
                        if (this.f4215a.emit(realtimeSocketResultC, anonymousClass1) == coroutineSingletons) {
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
                Object objCollect = flowE.collect(new AnonymousClass2(flowCollector, realTimeSocketManagerImpl4, realTimeSocketRequest3), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }
}
