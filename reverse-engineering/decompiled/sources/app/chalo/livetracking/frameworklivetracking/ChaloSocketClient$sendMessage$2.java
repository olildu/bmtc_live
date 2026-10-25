package app.chalo.livetracking.frameworklivetracking;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.livetracking.frameworklivetracking.chalosocket.KSocketData;
import app.chalo.livetracking.frameworklivetracking.chalosocket.model.SocketEvent;
import app.chalo.livetracking.frameworklivetracking.data.model.ChaloSocketResult;
import defpackage.ia;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.frameworklivetracking.ChaloSocketClient$sendMessage$2", f = "ChaloSocketClient.kt", l = {TypedValues.AttributesType.TYPE_PATH_ROTATE, 328}, m = "invokeSuspend", v = 1)
final class ChaloSocketClient$sendMessage$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Object>, Object> {
    final /* synthetic */ Function1<List<? extends Object>, Unit> $ack;
    final /* synthetic */ SocketEvent $event;
    final /* synthetic */ String[] $message;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ ChaloSocketClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloSocketClient$sendMessage$2(ChaloSocketClient chaloSocketClient, String[] strArr, SocketEvent socketEvent, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.this$0 = chaloSocketClient;
        this.$message = strArr;
        this.$event = socketEvent;
        this.$ack = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChaloSocketClient$sendMessage$2(this.this$0, this.$message, this.$event, this.$ack, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloSocketClient$sendMessage$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v5, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChaloSocketClient chaloSocketClient;
        String[] strArr;
        Mutex mutex;
        SocketEvent socketEvent;
        Function1<List<? extends Object>, Unit> function1;
        Mutex mutex2;
        Function0 function0;
        ChaloSocketClient chaloSocketClient2;
        Object obj2;
        ?? r3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        ?? r4 = 1;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                chaloSocketClient = this.this$0;
                MutexImpl mutexImpl = chaloSocketClient.g;
                strArr = this.$message;
                SocketEvent socketEvent2 = this.$event;
                Function1<List<? extends Object>, Unit> function2 = this.$ack;
                this.L$0 = mutexImpl;
                this.L$1 = strArr;
                this.L$2 = chaloSocketClient;
                this.L$3 = socketEvent2;
                this.L$4 = function2;
                this.label = 1;
                if (mutexImpl.a(this) != coroutineSingletons) {
                    mutex = mutexImpl;
                    socketEvent = socketEvent2;
                    function1 = function2;
                }
                return coroutineSingletons;
            }
            if (i == 1) {
                Function1<List<? extends Object>, Unit> function3 = (Function1) this.L$4;
                SocketEvent socketEvent3 = (SocketEvent) this.L$3;
                chaloSocketClient = (ChaloSocketClient) this.L$2;
                strArr = (String[]) this.L$1;
                Mutex mutex3 = (Mutex) this.L$0;
                ResultKt.b(obj);
                function1 = function3;
                socketEvent = socketEvent3;
                mutex = mutex3;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Mutex mutex4 = (Mutex) this.L$3;
                function0 = (Function0) this.L$2;
                chaloSocketClient2 = (ChaloSocketClient) this.L$1;
                Mutex mutex5 = (Mutex) this.L$0;
                ResultKt.b(obj);
                mutex2 = mutex4;
                r4 = mutex5;
            }
            try {
                Boolean boolValueOf = Boolean.valueOf(chaloSocketClient2.l.add(function0));
                mutex2.e(null);
                obj2 = boolValueOf;
                r3 = r4;
                return obj2;
            } finally {
                mutex2.e(null);
            }
            ChaloSocketClient chaloSocketClient3 = chaloSocketClient;
            List listH0 = ArraysKt.h0(strArr);
            ArrayList arrayList = new ArrayList(CollectionsKt.v(listH0, 10));
            Iterator it = listH0.iterator();
            while (it.hasNext()) {
                arrayList.add(new KSocketData.StringData((String) it.next()));
            }
            ia iaVar = new ia(chaloSocketClient3, socketEvent, function1, arrayList, 3);
            StateFlow stateFlow = chaloSocketClient3.j;
            if (stateFlow == null) {
                stateFlow = chaloSocketClient3.i;
            }
            if (!Intrinsics.d(stateFlow.getValue(), ChaloSocketResult.ConnectionStatus.Connected.f4249a)) {
                mutex2 = chaloSocketClient3.h;
                this.L$0 = mutex;
                this.L$1 = chaloSocketClient3;
                this.L$2 = iaVar;
                this.L$3 = mutex2;
                this.L$4 = null;
                this.label = 2;
                if (mutex2.a(this) != coroutineSingletons) {
                    function0 = iaVar;
                    chaloSocketClient2 = chaloSocketClient3;
                    r4 = mutex;
                    Boolean boolValueOf2 = Boolean.valueOf(chaloSocketClient2.l.add(function0));
                    mutex2.e(null);
                    obj2 = boolValueOf2;
                    r3 = r4;
                }
                return coroutineSingletons;
            }
            iaVar.invoke();
            obj2 = Unit.f17538a;
            r3 = mutex;
            return obj2;
        } catch (Throwable th) {
            r4.e(null);
            throw th;
        }
    }
}
