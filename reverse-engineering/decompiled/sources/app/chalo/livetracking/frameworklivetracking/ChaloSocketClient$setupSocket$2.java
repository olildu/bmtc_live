package app.chalo.livetracking.frameworklivetracking;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.livetracking.frameworklivetracking.chalosocket.KSocketOptions;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.frameworklivetracking.ChaloSocketClient$setupSocket$2", f = "ChaloSocketClient.kt", l = {TypedValues.AttributesType.TYPE_PATH_ROTATE, EACTags.ANSWER_TO_RESET}, m = "invokeSuspend", v = 1)
final class ChaloSocketClient$setupSocket$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ KSocketOptions $socketOptions;
    final /* synthetic */ String $socketUrl;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ ChaloSocketClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloSocketClient$setupSocket$2(ChaloSocketClient chaloSocketClient, String str, KSocketOptions kSocketOptions, Continuation continuation) {
        super(2, continuation);
        this.this$0 = chaloSocketClient;
        this.$socketUrl = str;
        this.$socketOptions = kSocketOptions;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChaloSocketClient$setupSocket$2(this.this$0, this.$socketUrl, this.$socketOptions, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloSocketClient$setupSocket$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ChaloSocketClient chaloSocketClient;
        String str;
        Mutex mutex;
        KSocketOptions kSocketOptions;
        Mutex mutex2;
        ChaloSocketClient chaloSocketClient2;
        ChaloSocketClient chaloSocketClient3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                chaloSocketClient = this.this$0;
                MutexImpl mutexImpl = chaloSocketClient.g;
                str = this.$socketUrl;
                KSocketOptions kSocketOptions2 = this.$socketOptions;
                this.L$0 = mutexImpl;
                this.L$1 = chaloSocketClient;
                this.L$2 = str;
                this.L$3 = kSocketOptions2;
                this.label = 1;
                if (mutexImpl.a(this) != coroutineSingletons) {
                    mutex = mutexImpl;
                    kSocketOptions = kSocketOptions2;
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                chaloSocketClient2 = (ChaloSocketClient) this.L$2;
                chaloSocketClient3 = (ChaloSocketClient) this.L$1;
                mutex2 = (Mutex) this.L$0;
                try {
                    ResultKt.b(obj);
                    chaloSocketClient2.j = (StateFlow) obj;
                    chaloSocketClient3.getClass();
                    chaloSocketClient3.k = FlowKt.E(FlowKt.e(new ChaloSocketClient$registerMessageCallbackAndCollectEvent$1(chaloSocketClient3, null)), chaloSocketClient3.f, SharingStarted.Companion.f17836a, 0);
                    mutex2.e(null);
                    return unit;
                } catch (Throwable th) {
                    th = th;
                    mutex2.e(null);
                    throw th;
                }
            }
            kSocketOptions = (KSocketOptions) this.L$3;
            str = (String) this.L$2;
            ChaloSocketClient chaloSocketClient4 = (ChaloSocketClient) this.L$1;
            mutex = (Mutex) this.L$0;
            ResultKt.b(obj);
            chaloSocketClient = chaloSocketClient4;
            if (chaloSocketClient.f4176a.a()) {
                mutex.e(null);
                return unit;
            }
            chaloSocketClient.f4176a.c(str, kSocketOptions);
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(FlowKt.B(FlowKt.e(new ChaloSocketClient$registerConnectionCallbacksAndCollectEvents$1(chaloSocketClient, null)), chaloSocketClient.i), new ChaloSocketClient$handlePendingMessageOnConnection$1(chaloSocketClient, null));
            ContextScope contextScope = chaloSocketClient.f;
            this.L$0 = mutex;
            this.L$1 = chaloSocketClient;
            this.L$2 = chaloSocketClient;
            this.L$3 = null;
            this.label = 2;
            Object objF = FlowKt.F(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, contextScope, this);
            if (objF != coroutineSingletons) {
                chaloSocketClient2 = chaloSocketClient;
                mutex2 = mutex;
                obj = objF;
                chaloSocketClient3 = chaloSocketClient2;
                chaloSocketClient2.j = (StateFlow) obj;
                chaloSocketClient3.getClass();
                chaloSocketClient3.k = FlowKt.E(FlowKt.e(new ChaloSocketClient$registerMessageCallbackAndCollectEvent$1(chaloSocketClient3, null)), chaloSocketClient3.f, SharingStarted.Companion.f17836a, 0);
                mutex2.e(null);
                return unit;
            }
            return coroutineSingletons;
        } catch (Throwable th2) {
            th = th2;
            mutex2 = mutex;
            mutex2.e(null);
            throw th;
        }
    }
}
