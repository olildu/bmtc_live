package app.chalo.livetracking.frameworklivetracking;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.livetracking.frameworklivetracking.data.model.ChaloSocketResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.frameworklivetracking.ChaloSocketClient$disconnect$2", f = "ChaloSocketClient.kt", l = {TypedValues.AttributesType.TYPE_PATH_ROTATE, 263}, m = "invokeSuspend", v = 1)
final class ChaloSocketClient$disconnect$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ChaloSocketClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloSocketClient$disconnect$2(ChaloSocketClient chaloSocketClient, Continuation continuation) {
        super(2, continuation);
        this.this$0 = chaloSocketClient;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChaloSocketClient$disconnect$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloSocketClient$disconnect$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v4, types: [kotlinx.coroutines.sync.Mutex] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChaloSocketClient chaloSocketClient;
        MutexImpl mutexImpl;
        Mutex mutex;
        ChaloSocketClient chaloSocketClient2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r1 = this.label;
        try {
            if (r1 == 0) {
                ResultKt.b(obj);
                chaloSocketClient = this.this$0;
                mutexImpl = chaloSocketClient.g;
                this.L$0 = mutexImpl;
                this.L$1 = chaloSocketClient;
                this.label = 1;
                if (mutexImpl.a(this) != coroutineSingletons) {
                }
                mutex = mutexImpl;
                return coroutineSingletons;
            }
            if (r1 == 1) {
                ChaloSocketClient chaloSocketClient3 = (ChaloSocketClient) this.L$1;
                Mutex mutex2 = (Mutex) this.L$0;
                ResultKt.b(obj);
                chaloSocketClient = chaloSocketClient3;
                mutex = mutex2;
            } else {
                if (r1 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                chaloSocketClient2 = (ChaloSocketClient) this.L$1;
                Mutex mutex3 = (Mutex) this.L$0;
                ResultKt.b(obj);
                r1 = mutex3;
            }
            chaloSocketClient2.f4176a.disconnect();
            r1.e(null);
            return Unit.f17538a;
            mutex = mutexImpl;
            MutableStateFlow mutableStateFlow = chaloSocketClient.i;
            ChaloSocketResult.ConnectionStatus.DisConnectionInProgress disConnectionInProgress = ChaloSocketResult.ConnectionStatus.DisConnectionInProgress.f4253a;
            this.L$0 = mutex;
            this.L$1 = chaloSocketClient;
            this.label = 2;
            if (mutableStateFlow.emit(disConnectionInProgress, this) != coroutineSingletons) {
                chaloSocketClient2 = chaloSocketClient;
                r1 = mutex;
                chaloSocketClient2.f4176a.disconnect();
                r1.e(null);
                return Unit.f17538a;
            }
            mutex = mutexImpl;
            return coroutineSingletons;
        } catch (Throwable th) {
            r1.e(null);
            throw th;
        }
    }
}
