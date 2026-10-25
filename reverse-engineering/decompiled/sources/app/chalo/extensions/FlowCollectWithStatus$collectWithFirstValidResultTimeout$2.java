package app.chalo.extensions;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u0002H\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "T", "Lapp/chalo/extensions/FlowCollectWithStatus$TimerStatus;", "result", "timerStatus"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.extensions.FlowCollectWithStatus$collectWithFirstValidResultTimeout$2", f = "FlowExtentions.kt", l = {}, m = "invokeSuspend", v = 1)
final class FlowCollectWithStatus$collectWithFirstValidResultTimeout$2 extends SuspendLambda implements Function3<Object, FlowCollectWithStatus.TimerStatus, Continuation<? super Pair<Object, ? extends FlowCollectWithStatus.TimerStatus>>, Object> {
    final /* synthetic */ Function1<Object, Boolean> $checkShouldStopTimer;
    final /* synthetic */ Ref.BooleanRef $hasReceivedValidData;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowCollectWithStatus$collectWithFirstValidResultTimeout$2(Ref.BooleanRef booleanRef, Function1 function1, Continuation continuation) {
        super(3, continuation);
        this.$hasReceivedValidData = booleanRef;
        this.$checkShouldStopTimer = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FlowCollectWithStatus$collectWithFirstValidResultTimeout$2 flowCollectWithStatus$collectWithFirstValidResultTimeout$2 = new FlowCollectWithStatus$collectWithFirstValidResultTimeout$2(this.$hasReceivedValidData, this.$checkShouldStopTimer, (Continuation) obj3);
        flowCollectWithStatus$collectWithFirstValidResultTimeout$2.L$0 = obj;
        flowCollectWithStatus$collectWithFirstValidResultTimeout$2.L$1 = (FlowCollectWithStatus.TimerStatus) obj2;
        return flowCollectWithStatus$collectWithFirstValidResultTimeout$2.invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        Object obj2 = this.L$0;
        FlowCollectWithStatus.TimerStatus timerStatus = (FlowCollectWithStatus.TimerStatus) this.L$1;
        Ref.BooleanRef booleanRef = this.$hasReceivedValidData;
        booleanRef.element = booleanRef.element || ((Boolean) this.$checkShouldStopTimer.invoke(obj2)).booleanValue();
        return new Pair(obj2, timerStatus);
    }
}
