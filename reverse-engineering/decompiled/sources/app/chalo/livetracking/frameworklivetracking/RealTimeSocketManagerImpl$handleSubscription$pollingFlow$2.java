package app.chalo.livetracking.frameworklivetracking;

import app.chalo.livetracking.frameworklivetracking.data.model.ChaloSocketResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.frameworklivetracking.RealTimeSocketManagerImpl$handleSubscription$pollingFlow$2", f = "RealTimeSocketManagerImpl.kt", l = {351}, m = "invokeSuspend", v = 1)
final class RealTimeSocketManagerImpl$handleSubscription$pollingFlow$2 extends SuspendLambda implements Function2<FlowCollector<? super ChaloSocketResponse>, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $initialPollingDelay;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealTimeSocketManagerImpl$handleSubscription$pollingFlow$2(long j, Continuation continuation) {
        super(2, continuation);
        this.$initialPollingDelay = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RealTimeSocketManagerImpl$handleSubscription$pollingFlow$2(this.$initialPollingDelay, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RealTimeSocketManagerImpl$handleSubscription$pollingFlow$2) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            long j = this.$initialPollingDelay;
            this.label = 1;
            if (DelayKt.b(j, this) == coroutineSingletons) {
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
