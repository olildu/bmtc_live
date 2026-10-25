package app.chalo.titoridedetail.manager;

import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManagerStopEtaResult;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.titoridedetail.manager.TitoRideDataManagerImpl$startUpdatesForDropOffStop$1", f = "TitoRideDataManagerImpl.kt", l = {361}, m = "invokeSuspend", v = 1)
final class TitoRideDataManagerImpl$startUpdatesForDropOffStop$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ StopAppModel $dropOffStop;
    final /* synthetic */ RouteAppModel $routeAppModel;
    final /* synthetic */ String $vehicleNumber;
    int label;
    final /* synthetic */ TitoRideDataManagerImpl this$0;

    /* JADX INFO: renamed from: app.chalo.titoridedetail.manager.TitoRideDataManagerImpl$startUpdatesForDropOffStop$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final class AnonymousClass1<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TitoRideDataManagerImpl f9699a;
        public final /* synthetic */ String b;

        public AnonymousClass1(TitoRideDataManagerImpl titoRideDataManagerImpl, String str) {
            this.f9699a = titoRideDataManagerImpl;
            this.b = str;
        }

        /* JADX WARN: Code duplicated, block: B:37:0x00be  */
        /* JADX WARN: Code duplicated, block: B:40:0x00cb A[Catch: all -> 0x00ce, TryCatch #0 {all -> 0x00ce, blocks: (B:38:0x00c1, B:40:0x00cb, B:44:0x00d2, B:46:0x00da, B:49:0x00e0, B:51:0x00e8, B:53:0x00f0, B:56:0x00f9, B:58:0x00fd, B:62:0x011b, B:63:0x011d, B:65:0x0126, B:67:0x012d, B:59:0x010a, B:60:0x010f, B:61:0x0110), top: B:76:0x00c1 }] */
        /* JADX WARN: Code duplicated, block: B:43:0x00d1  */
        /* JADX WARN: Code duplicated, block: B:46:0x00da A[Catch: all -> 0x00ce, TryCatch #0 {all -> 0x00ce, blocks: (B:38:0x00c1, B:40:0x00cb, B:44:0x00d2, B:46:0x00da, B:49:0x00e0, B:51:0x00e8, B:53:0x00f0, B:56:0x00f9, B:58:0x00fd, B:62:0x011b, B:63:0x011d, B:65:0x0126, B:67:0x012d, B:59:0x010a, B:60:0x010f, B:61:0x0110), top: B:76:0x00c1 }] */
        /* JADX WARN: Code duplicated, block: B:61:0x0110 A[Catch: all -> 0x00ce, TryCatch #0 {all -> 0x00ce, blocks: (B:38:0x00c1, B:40:0x00cb, B:44:0x00d2, B:46:0x00da, B:49:0x00e0, B:51:0x00e8, B:53:0x00f0, B:56:0x00f9, B:58:0x00fd, B:62:0x011b, B:63:0x011d, B:65:0x0126, B:67:0x012d, B:59:0x010a, B:60:0x010f, B:61:0x0110), top: B:76:0x00c1 }] */
        /* JADX WARN: Code duplicated, block: B:65:0x0126 A[Catch: all -> 0x00ce, TryCatch #0 {all -> 0x00ce, blocks: (B:38:0x00c1, B:40:0x00cb, B:44:0x00d2, B:46:0x00da, B:49:0x00e0, B:51:0x00e8, B:53:0x00f0, B:56:0x00f9, B:58:0x00fd, B:62:0x011b, B:63:0x011d, B:65:0x0126, B:67:0x012d, B:59:0x010a, B:60:0x010f, B:61:0x0110), top: B:76:0x00c1 }] */
        /* JADX WARN: Code duplicated, block: B:66:0x012c  */
        /* JADX WARN: Code duplicated, block: B:71:0x0138  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x009b, code lost:
        
            if (r0 == r3) goto L36;
         */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManagerStopEtaResult.Success r17, kotlin.coroutines.Continuation r18) {
            /*
                Method dump skipped, instruction units count: 325
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: app.chalo.titoridedetail.manager.TitoRideDataManagerImpl$startUpdatesForDropOffStop$1.AnonymousClass1.emit(app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManagerStopEtaResult$Success, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TitoRideDataManagerImpl$startUpdatesForDropOffStop$1(TitoRideDataManagerImpl titoRideDataManagerImpl, StopAppModel stopAppModel, RouteAppModel routeAppModel, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = titoRideDataManagerImpl;
        this.$dropOffStop = stopAppModel;
        this.$routeAppModel = routeAppModel;
        this.$vehicleNumber = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TitoRideDataManagerImpl$startUpdatesForDropOffStop$1(this.this$0, this.$dropOffStop, this.$routeAppModel, this.$vehicleNumber, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TitoRideDataManagerImpl$startUpdatesForDropOffStop$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            final Flow flowF = this.this$0.b.f(this.$dropOffStop.f1727a, this.$routeAppModel.b, CollectionsKt.R(this.$vehicleNumber));
            Flow<Object> flow = new Flow<Object>() { // from class: app.chalo.titoridedetail.manager.TitoRideDataManagerImpl$startUpdatesForDropOffStop$1$invokeSuspend$$inlined$filterIsInstance$1

                /* JADX INFO: renamed from: app.chalo.titoridedetail.manager.TitoRideDataManagerImpl$startUpdatesForDropOffStop$1$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ FlowCollector f9701a;

                    /* JADX INFO: renamed from: app.chalo.titoridedetail.manager.TitoRideDataManagerImpl$startUpdatesForDropOffStop$1$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @DebugMetadata(c = "app.chalo.titoridedetail.manager.TitoRideDataManagerImpl$startUpdatesForDropOffStop$1$invokeSuspend$$inlined$filterIsInstance$1$2", f = "TitoRideDataManagerImpl.kt", l = {50}, m = "emit", v = 1)
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
                        this.f9701a = flowCollector;
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
                            if (obj instanceof LiveTrackingDataManagerStopEtaResult.Success) {
                                anonymousClass1.label = 1;
                                if (this.f9701a.emit(obj, anonymousClass1) == coroutineSingletons) {
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
                    Object objCollect = flowF.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
                }
            };
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$vehicleNumber);
            this.label = 1;
            if (flow.collect(anonymousClass1, this) == coroutineSingletons) {
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
