package app.chalo.location;

import androidx.media3.extractor.ts.PsExtractor;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\n¨\u0006\u0006"}, d2 = {"<anonymous>", "", "R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.location.ChaloLocationManagerImpl$special$$inlined$flatMapLatest$1", f = "ChaloLocationManagerImpl.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend", v = 1)
public final class ChaloLocationManagerImpl$special$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<? super LocationUpdateResult>, Boolean, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ ChaloLocationManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloLocationManagerImpl$special$$inlined$flatMapLatest$1(ChaloLocationManagerImpl chaloLocationManagerImpl, Continuation continuation) {
        super(3, continuation);
        this.this$0 = chaloLocationManagerImpl;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ChaloLocationManagerImpl$special$$inlined$flatMapLatest$1 chaloLocationManagerImpl$special$$inlined$flatMapLatest$1 = new ChaloLocationManagerImpl$special$$inlined$flatMapLatest$1(this.this$0, (Continuation) obj3);
        chaloLocationManagerImpl$special$$inlined$flatMapLatest$1.L$0 = (FlowCollector) obj;
        chaloLocationManagerImpl$special$$inlined$flatMapLatest$1.L$1 = obj2;
        return chaloLocationManagerImpl$special$$inlined$flatMapLatest$1.invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Flow flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            if (((Boolean) this.L$1).booleanValue()) {
                ChaloLocationManagerImpl chaloLocationManagerImpl = this.this$0;
                final ChannelFlowTransformLatest channelFlowTransformLatestH = FlowKt.H(chaloLocationManagerImpl.g, new ChaloLocationManagerImpl$getSystemAndLocationUpdateManagerFlow$$inlined$flatMapLatest$1(chaloLocationManagerImpl, null));
                final ChaloLocationManagerImpl chaloLocationManagerImpl2 = this.this$0;
                flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = new Flow<LocationUpdateResult>() { // from class: app.chalo.location.ChaloLocationManagerImpl$_init_$lambda$1$$inlined$map$1

                    /* JADX INFO: renamed from: app.chalo.location.ChaloLocationManagerImpl$_init_$lambda$1$$inlined$map$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    public final class AnonymousClass2<T> implements FlowCollector {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ FlowCollector f5127a;
                        public final /* synthetic */ ChaloLocationManagerImpl b;

                        /* JADX INFO: renamed from: app.chalo.location.ChaloLocationManagerImpl$_init_$lambda$1$$inlined$map$1$2$1, reason: invalid class name */
                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        @DebugMetadata(c = "app.chalo.location.ChaloLocationManagerImpl$_init_$lambda$1$$inlined$map$1$2", f = "ChaloLocationManagerImpl.kt", l = {50}, m = "emit", v = 1)
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

                        public AnonymousClass2(FlowCollector flowCollector, ChaloLocationManagerImpl chaloLocationManagerImpl) {
                            this.f5127a = flowCollector;
                            this.b = chaloLocationManagerImpl;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            LocationUpdateResult locationUpdateResultI;
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
                                LocationManagerResult locationManagerResult = (LocationManagerResult) obj;
                                boolean z = locationManagerResult instanceof LocationManagerResult.LocationPreconditionsStatus;
                                ChaloLocationManagerImpl chaloLocationManagerImpl = this.b;
                                if (z) {
                                    chaloLocationManagerImpl.getClass();
                                    locationUpdateResultI = ChaloLocationManagerImpl.h((LocationManagerResult.LocationPreconditionsStatus) locationManagerResult);
                                } else {
                                    if (!(locationManagerResult instanceof LocationManagerResult.LocationUpdateStatus)) {
                                        chaloLocationManagerImpl.getClass();
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    chaloLocationManagerImpl.getClass();
                                    locationUpdateResultI = ChaloLocationManagerImpl.i((LocationManagerResult.LocationUpdateStatus) locationManagerResult);
                                }
                                anonymousClass1.label = 1;
                                if (this.f5127a.emit(locationUpdateResultI, anonymousClass1) == coroutineSingletons) {
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
                        Object objCollect = channelFlowTransformLatestH.collect(new AnonymousClass2(flowCollector2, chaloLocationManagerImpl2), continuation);
                        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
                    }
                };
            } else {
                flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(LocationUpdateResult.Initiated.f5152a);
            }
            this.label = 1;
            if (FlowKt.r(flowCollector, flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2, this) == coroutineSingletons) {
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
