package app.chalo.livetracking.frameworklivetracking;

import androidx.media3.extractor.ts.TsExtractor;
import app.chalo.livetracking.frameworklivetracking.data.model.ChaloSocketRequest;
import app.chalo.livetracking.frameworklivetracking.data.model.ChaloSocketResponse;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResponse;", "cause", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.frameworklivetracking.ChaloSocketFeatureImpl$startSubscription$3", f = "ChaloSocketFeatureImpl.kt", l = {137, TsExtractor.TS_STREAM_TYPE_DTS_UHD}, m = "invokeSuspend", v = 1)
final class ChaloSocketFeatureImpl$startSubscription$3 extends SuspendLambda implements Function3<FlowCollector<? super ChaloSocketResponse>, Throwable, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $maxRetryAllowed;
    final /* synthetic */ ChaloSocketRequest $request;
    final /* synthetic */ Function0<Long> $retrySubscribeRequestDelay;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChaloSocketFeatureImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloSocketFeatureImpl$startSubscription$3(int i, ChaloSocketFeatureImpl chaloSocketFeatureImpl, ChaloSocketRequest chaloSocketRequest, Continuation continuation, Function0 function0) {
        super(3, continuation);
        this.$request = chaloSocketRequest;
        this.this$0 = chaloSocketFeatureImpl;
        this.$retrySubscribeRequestDelay = function0;
        this.$maxRetryAllowed = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ChaloSocketRequest chaloSocketRequest = this.$request;
        ChaloSocketFeatureImpl chaloSocketFeatureImpl = this.this$0;
        Function0<Long> function0 = this.$retrySubscribeRequestDelay;
        ChaloSocketFeatureImpl$startSubscription$3 chaloSocketFeatureImpl$startSubscription$3 = new ChaloSocketFeatureImpl$startSubscription$3(this.$maxRetryAllowed, chaloSocketFeatureImpl, chaloSocketRequest, (Continuation) obj3, function0);
        chaloSocketFeatureImpl$startSubscription$3.L$0 = (Throwable) obj2;
        return chaloSocketFeatureImpl$startSubscription$3.invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007b A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i != 0) {
            if (i == 1) {
                ResultKt.b(obj);
                return unit;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        ResultKt.b(obj);
        Throwable th = (Throwable) this.L$0;
        String message = "onCompletion called with new socket: " + this.$request;
        Intrinsics.i(message, "message");
        if (th instanceof CancellationException) {
            String message2 = ((CancellationException) th).getMessage();
            ChaloSocketFeatureImpl chaloSocketFeatureImpl = this.this$0;
            ChaloSocketRequest chaloSocketRequest = this.$request;
            chaloSocketFeatureImpl.getClass();
            if (Intrinsics.d(message2, "Ack not received for request " + chaloSocketRequest)) {
                ChaloSocketFeatureImpl chaloSocketFeatureImpl2 = this.this$0;
                ChaloSocketRequest chaloSocketRequest2 = this.$request;
                this.label = 1;
                chaloSocketFeatureImpl2.h(chaloSocketRequest2, null, 1);
                if (unit == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                ChaloSocketFeatureImpl chaloSocketFeatureImpl3 = this.this$0;
                ChaloSocketRequest chaloSocketRequest3 = this.$request;
                Function0<Long> function0 = this.$retrySubscribeRequestDelay;
                int i2 = this.$maxRetryAllowed;
                this.label = 2;
                chaloSocketFeatureImpl3.h(chaloSocketRequest3, function0, i2);
                if (unit == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return unit;
    }
}
