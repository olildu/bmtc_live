package app.chalo.livetracking.provider.tracking;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lapp/chalo/livetracking/provider/tracking/VehicleGpsDataResult$Success;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.provider.tracking.RouteTrackingDataProviderImpl$getLiveVehicleDetailsFromRtsData$data$1", f = "RouteTrackingDataProviderImpl.kt", l = {176}, m = "invokeSuspend", v = 1)
final class RouteTrackingDataProviderImpl$getLiveVehicleDetailsFromRtsData$data$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super VehicleGpsDataResult.Success>, Object> {
    final /* synthetic */ String $vehicleNumber;
    int label;
    final /* synthetic */ RouteTrackingDataProviderImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteTrackingDataProviderImpl$getLiveVehicleDetailsFromRtsData$data$1(RouteTrackingDataProviderImpl routeTrackingDataProviderImpl, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = routeTrackingDataProviderImpl;
        this.$vehicleNumber = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RouteTrackingDataProviderImpl$getLiveVehicleDetailsFromRtsData$data$1(this.this$0, this.$vehicleNumber, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RouteTrackingDataProviderImpl$getLiveVehicleDetailsFromRtsData$data$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        final Flow flowF = this.this$0.f(20000L, this.$vehicleNumber);
        Flow<Object> flow = new Flow<Object>() { // from class: app.chalo.livetracking.provider.tracking.RouteTrackingDataProviderImpl$getLiveVehicleDetailsFromRtsData$data$1$invokeSuspend$$inlined$filterIsInstance$1

            /* JADX INFO: renamed from: app.chalo.livetracking.provider.tracking.RouteTrackingDataProviderImpl$getLiveVehicleDetailsFromRtsData$data$1$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f4353a;

                /* JADX INFO: renamed from: app.chalo.livetracking.provider.tracking.RouteTrackingDataProviderImpl$getLiveVehicleDetailsFromRtsData$data$1$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.livetracking.provider.tracking.RouteTrackingDataProviderImpl$getLiveVehicleDetailsFromRtsData$data$1$invokeSuspend$$inlined$filterIsInstance$1$2", f = "RouteTrackingDataProviderImpl.kt", l = {50}, m = "emit", v = 1)
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
                    this.f4353a = flowCollector;
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
                        if (obj instanceof VehicleGpsDataResult.Success) {
                            anonymousClass1.label = 1;
                            if (this.f4353a.emit(obj, anonymousClass1) == coroutineSingletons) {
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
        this.label = 1;
        Object objV = FlowKt.v(flow, this);
        return objV == coroutineSingletons ? coroutineSingletons : objV;
    }
}
