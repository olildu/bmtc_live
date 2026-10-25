package app.chalo.livetracking.frameworklivetracking;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.livetracking.frameworklivetracking.data.model.ChaloSocketResult;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult$ConnectionStatus;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.frameworklivetracking.ChaloSocketClient$handlePendingMessageOnConnection$1", f = "ChaloSocketClient.kt", l = {TypedValues.AttributesType.TYPE_PATH_ROTATE}, m = "invokeSuspend", v = 1)
final class ChaloSocketClient$handlePendingMessageOnConnection$1 extends SuspendLambda implements Function2<ChaloSocketResult.ConnectionStatus, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ChaloSocketClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloSocketClient$handlePendingMessageOnConnection$1(ChaloSocketClient chaloSocketClient, Continuation continuation) {
        super(2, continuation);
        this.this$0 = chaloSocketClient;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChaloSocketClient$handlePendingMessageOnConnection$1 chaloSocketClient$handlePendingMessageOnConnection$1 = new ChaloSocketClient$handlePendingMessageOnConnection$1(this.this$0, continuation);
        chaloSocketClient$handlePendingMessageOnConnection$1.L$0 = obj;
        return chaloSocketClient$handlePendingMessageOnConnection$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloSocketClient$handlePendingMessageOnConnection$1) create((ChaloSocketResult.ConnectionStatus) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Mutex mutex;
        ChaloSocketClient chaloSocketClient;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                if (Intrinsics.d((ChaloSocketResult.ConnectionStatus) this.L$0, ChaloSocketResult.ConnectionStatus.Connected.f4249a)) {
                    ChaloSocketClient chaloSocketClient2 = this.this$0;
                    mutex = chaloSocketClient2.h;
                    this.L$0 = mutex;
                    this.L$1 = chaloSocketClient2;
                    this.label = 1;
                    if (mutex.a(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    chaloSocketClient = chaloSocketClient2;
                }
                return Unit.f17538a;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chaloSocketClient = (ChaloSocketClient) this.L$1;
            mutex = (Mutex) this.L$0;
            ResultKt.b(obj);
            ArrayList arrayList = chaloSocketClient.l;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj2 = arrayList.get(i2);
                i2++;
                ((Function0) obj2).invoke();
            }
            chaloSocketClient.l.clear();
            return Unit.f17538a;
        } finally {
            mutex.e(null);
        }
    }
}
