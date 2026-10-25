package app.chalo.livetracking.frameworklivetracking;

import app.chalo.livetracking.frameworklivetracking.data.model.ChaloSocketResponse;
import app.chalo.livetracking.frameworklivetracking.data.model.ChaloSocketResponseErrorType;
import app.chalo.livetracking.frameworklivetracking.data.model.ChaloSocketResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloSocketFeatureImpl$getChaloSocketErrorStatusFlow$$inlined$map$1 implements Flow<ChaloSocketResponse.Error> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ChaloSocketFeatureImpl$getChaloSocketErrorStatusFlow$$inlined$filterIsInstance$1 f4181a;

    /* JADX INFO: renamed from: app.chalo.livetracking.frameworklivetracking.ChaloSocketFeatureImpl$getChaloSocketErrorStatusFlow$$inlined$map$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final class AnonymousClass2<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FlowCollector f4182a;

        /* JADX INFO: renamed from: app.chalo.livetracking.frameworklivetracking.ChaloSocketFeatureImpl$getChaloSocketErrorStatusFlow$$inlined$map$1$2$1, reason: invalid class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "app.chalo.livetracking.frameworklivetracking.ChaloSocketFeatureImpl$getChaloSocketErrorStatusFlow$$inlined$map$1$2", f = "ChaloSocketFeatureImpl.kt", l = {50}, m = "emit", v = 1)
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
            this.f4182a = flowCollector;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1;
            ChaloSocketResponseErrorType connectionError;
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
                ChaloSocketResult.ConnectionStatus.Error error = (ChaloSocketResult.ConnectionStatus.Error) obj;
                Intrinsics.i(error, "<this>");
                String str = error.f4255a;
                if (error instanceof ChaloSocketResult.ConnectionStatus.Error.GenericError) {
                    connectionError = new ChaloSocketResponseErrorType.GenericError(str);
                } else {
                    if (!(error instanceof ChaloSocketResult.ConnectionStatus.Error.ConnectionError) && !(error instanceof ChaloSocketResult.ConnectionStatus.Error.ReconnectionError) && !(error instanceof ChaloSocketResult.ConnectionStatus.Error.ReconnectionFailed)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    connectionError = new ChaloSocketResponseErrorType.ConnectionError(str);
                }
                ChaloSocketResponse.Error error2 = new ChaloSocketResponse.Error(connectionError, str);
                anonymousClass1.label = 1;
                if (this.f4182a.emit(error2, anonymousClass1) == coroutineSingletons) {
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

    public ChaloSocketFeatureImpl$getChaloSocketErrorStatusFlow$$inlined$map$1(ChaloSocketFeatureImpl$getChaloSocketErrorStatusFlow$$inlined$filterIsInstance$1 chaloSocketFeatureImpl$getChaloSocketErrorStatusFlow$$inlined$filterIsInstance$1) {
        this.f4181a = chaloSocketFeatureImpl$getChaloSocketErrorStatusFlow$$inlined$filterIsInstance$1;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object objCollect = this.f4181a.collect(new AnonymousClass2(flowCollector), continuation);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
    }
}
