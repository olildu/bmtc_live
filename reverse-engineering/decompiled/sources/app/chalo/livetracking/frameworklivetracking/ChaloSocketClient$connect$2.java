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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.frameworklivetracking.ChaloSocketClient$connect$2", f = "ChaloSocketClient.kt", l = {TypedValues.AttributesType.TYPE_PATH_ROTATE, 114, 119}, m = "invokeSuspend", v = 1)
final class ChaloSocketClient$connect$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ChaloSocketClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloSocketClient$connect$2(ChaloSocketClient chaloSocketClient, Continuation continuation) {
        super(2, continuation);
        this.this$0 = chaloSocketClient;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChaloSocketClient$connect$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloSocketClient$connect$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v17, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v6, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v7 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r0;
        ChaloSocketClient chaloSocketClient;
        MutexImpl mutexImpl;
        Mutex mutex;
        ChaloSocketClient chaloSocketClient2;
        Exception e;
        MutableStateFlow mutableStateFlow;
        ChaloSocketResult.ConnectionStatus.Error.GenericError genericError;
        String message;
        ?? r1;
        ?? r2;
        ChaloSocketResult.ConnectionStatus.ConnectionInProgress connectionInProgress = ChaloSocketResult.ConnectionStatus.ConnectionInProgress.f4250a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r3 = this.label;
        Unit unit = Unit.f17538a;
        try {
            if (r3 == 0) {
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
            if (r3 != 1) {
                if (r3 != 2) {
                    if (r3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r0 = (Mutex) this.L$0;
                    try {
                        ResultKt.b(obj);
                        r1 = r0;
                        r2 = r1;
                        r2.e(null);
                        return unit;
                    } catch (Throwable th) {
                        th = th;
                        r0.e(null);
                        throw th;
                    }
                }
                chaloSocketClient2 = (ChaloSocketClient) this.L$1;
                mutex = (Mutex) this.L$0;
                try {
                    ResultKt.b(obj);
                    mutex = mutex;
                    chaloSocketClient2.f4176a.connect();
                    r2 = mutex;
                } catch (Exception e2) {
                    e = e2;
                    mutableStateFlow = chaloSocketClient2.i;
                    message = e.getMessage();
                    if (message == null) {
                        message = "Something went wrong";
                    }
                    genericError = new ChaloSocketResult.ConnectionStatus.Error.GenericError(message);
                    this.L$0 = mutex;
                    this.L$1 = null;
                    this.label = 3;
                    if (mutableStateFlow.emit(genericError, this) != coroutineSingletons) {
                        r1 = mutex;
                        r2 = r1;
                    }
                    mutex = mutexImpl;
                    return coroutineSingletons;
                }
                r2.e(null);
                return unit;
            }
            ChaloSocketClient chaloSocketClient3 = (ChaloSocketClient) this.L$1;
            Mutex mutex2 = (Mutex) this.L$0;
            ResultKt.b(obj);
            chaloSocketClient = chaloSocketClient3;
            mutex = mutex2;
            mutex = mutexImpl;
            StateFlow stateFlow = chaloSocketClient.j;
            MutableStateFlow mutableStateFlow2 = chaloSocketClient.i;
            if (stateFlow == null) {
                stateFlow = mutableStateFlow2;
            }
            Intrinsics.i(stateFlow, "<this>");
            if (Intrinsics.d(stateFlow.getValue(), ChaloSocketResult.ConnectionStatus.Connected.f4249a) || Intrinsics.d(stateFlow.getValue(), connectionInProgress)) {
                mutex.e(null);
                return unit;
            }
            try {
                this.L$0 = mutex;
                this.L$1 = chaloSocketClient;
                this.label = 2;
                if (mutableStateFlow2.emit(connectionInProgress, this) != coroutineSingletons) {
                    chaloSocketClient2 = chaloSocketClient;
                    mutex = mutex;
                    chaloSocketClient2.f4176a.connect();
                    r2 = mutex;
                    r2.e(null);
                    return unit;
                }
            } catch (Exception e3) {
                chaloSocketClient2 = chaloSocketClient;
                e = e3;
                mutableStateFlow = chaloSocketClient2.i;
                message = e.getMessage();
                if (message == null) {
                    message = "Something went wrong";
                }
                genericError = new ChaloSocketResult.ConnectionStatus.Error.GenericError(message);
                this.L$0 = mutex;
                this.L$1 = null;
                this.label = 3;
                if (mutableStateFlow.emit(genericError, this) != coroutineSingletons) {
                    r1 = mutex;
                    r2 = r1;
                    r2.e(null);
                    return unit;
                }
            }
            mutex = mutexImpl;
            return coroutineSingletons;
        } catch (Throwable th2) {
            th = th2;
            r0 = r3;
        }
    }
}
