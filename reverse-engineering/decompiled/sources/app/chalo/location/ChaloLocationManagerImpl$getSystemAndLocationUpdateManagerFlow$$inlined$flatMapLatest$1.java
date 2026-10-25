package app.chalo.location;

import androidx.media3.extractor.ts.PsExtractor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\n¨\u0006\u0006"}, d2 = {"<anonymous>", "", "R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.location.ChaloLocationManagerImpl$getSystemAndLocationUpdateManagerFlow$$inlined$flatMapLatest$1", f = "ChaloLocationManagerImpl.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend", v = 1)
public final class ChaloLocationManagerImpl$getSystemAndLocationUpdateManagerFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<? super LocationManagerResult>, Unit, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ ChaloLocationManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloLocationManagerImpl$getSystemAndLocationUpdateManagerFlow$$inlined$flatMapLatest$1(ChaloLocationManagerImpl chaloLocationManagerImpl, Continuation continuation) {
        super(3, continuation);
        this.this$0 = chaloLocationManagerImpl;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ChaloLocationManagerImpl$getSystemAndLocationUpdateManagerFlow$$inlined$flatMapLatest$1 chaloLocationManagerImpl$getSystemAndLocationUpdateManagerFlow$$inlined$flatMapLatest$1 = new ChaloLocationManagerImpl$getSystemAndLocationUpdateManagerFlow$$inlined$flatMapLatest$1(this.this$0, (Continuation) obj3);
        chaloLocationManagerImpl$getSystemAndLocationUpdateManagerFlow$$inlined$flatMapLatest$1.L$0 = (FlowCollector) obj;
        chaloLocationManagerImpl$getSystemAndLocationUpdateManagerFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return chaloLocationManagerImpl$getSystemAndLocationUpdateManagerFlow$$inlined$flatMapLatest$1.invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            ChaloLocationManagerImpl chaloLocationManagerImpl = this.this$0;
            chaloLocationManagerImpl.getClass();
            ChannelFlowTransformLatest channelFlowTransformLatestH = FlowKt.H(FlowKt.I(FlowKt.y(new ChaloLocationManagerImpl$getSystemPreconditionCheckPollingFlowWhileNotSatisfied$1(chaloLocationManagerImpl, null)), new ChaloLocationManagerImpl$getSystemPreconditionCheckPollingFlowWhileNotSatisfied$2(3, null)), new ChaloLocationManagerImpl$getSystemAndLocationUpdateManagerFlow$lambda$0$$inlined$flatMapLatest$1(this.this$0, null));
            this.label = 1;
            if (FlowKt.r(flowCollector, channelFlowTransformLatestH, this) == coroutineSingletons) {
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
