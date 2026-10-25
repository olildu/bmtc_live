package app.chalo.onboarding.splash.orchestrator;

import androidx.compose.runtime.ComposerImplKt;
import app.chalo.constants.Source;
import java.util.List;
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
import kotlinx.coroutines.Deferred;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.onboarding.splash.orchestrator.IosSplashOrchestrator$onInitialization$3", f = "IosSplashOrchestrator.kt", l = {121, 122, ComposerImplKt.nodeKey, WebSocketProtocol.PAYLOAD_SHORT}, m = "invokeSuspend", v = 1)
final class IosSplashOrchestrator$onInitialization$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ IosSplashOrchestrator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IosSplashOrchestrator$onInitialization$3(IosSplashOrchestrator iosSplashOrchestrator, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iosSplashOrchestrator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new IosSplashOrchestrator$onInitialization$3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((IosSplashOrchestrator$onInitialization$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.b(obj);
            } else if (i == 2) {
                ResultKt.b(obj);
                List list = (List) obj;
                Intrinsics.i(list, "<this>");
                if (list.isEmpty()) {
                    this.this$0.getClass();
                    Source.Companion companion = Source.INSTANCE;
                    this.label = 3;
                    throw null;
                }
            } else {
                if (i == 3) {
                    ResultKt.b(obj);
                    this.this$0.getClass();
                    this.label = 4;
                    throw null;
                }
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f17538a;
        }
        ResultKt.b(obj);
        Deferred deferred = this.this$0.b;
        this.label = 1;
        obj = deferred.q(this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        if (!((Boolean) obj).booleanValue()) {
            this.this$0.getClass();
            this.label = 2;
            throw null;
        }
        return Unit.f17538a;
    }
}
