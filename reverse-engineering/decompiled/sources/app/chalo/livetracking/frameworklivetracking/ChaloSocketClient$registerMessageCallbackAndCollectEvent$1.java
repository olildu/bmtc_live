package app.chalo.livetracking.frameworklivetracking;

import app.chalo.livetracking.frameworklivetracking.chalosocket.model.SocketEvent;
import app.chalo.livetracking.frameworklivetracking.data.model.ChaloSocketResult;
import defpackage.f;
import defpackage.wb;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult$Data;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.frameworklivetracking.ChaloSocketClient$registerMessageCallbackAndCollectEvent$1", f = "ChaloSocketClient.kt", l = {153}, m = "invokeSuspend", v = 1)
final class ChaloSocketClient$registerMessageCallbackAndCollectEvent$1 extends SuspendLambda implements Function2<ProducerScope<? super ChaloSocketResult.Data>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChaloSocketClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloSocketClient$registerMessageCallbackAndCollectEvent$1(ChaloSocketClient chaloSocketClient, Continuation continuation) {
        super(2, continuation);
        this.this$0 = chaloSocketClient;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChaloSocketClient$registerMessageCallbackAndCollectEvent$1 chaloSocketClient$registerMessageCallbackAndCollectEvent$1 = new ChaloSocketClient$registerMessageCallbackAndCollectEvent$1(this.this$0, continuation);
        chaloSocketClient$registerMessageCallbackAndCollectEvent$1.L$0 = obj;
        return chaloSocketClient$registerMessageCallbackAndCollectEvent$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloSocketClient$registerMessageCallbackAndCollectEvent$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            ProducerScope producerScope = (ProducerScope) this.L$0;
            ChaloSocketClient chaloSocketClient = this.this$0;
            chaloSocketClient.f4176a.b(SocketEvent.Message, new f(28, producerScope, chaloSocketClient));
            this.label = 1;
            if (ProduceKt.a(producerScope, new wb(8), this) == coroutineSingletons) {
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
