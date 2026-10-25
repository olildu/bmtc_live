package app.chalo.juspay;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lapp/chalo/juspay/JuspayControllerImpl$SdkReadiness;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.juspay.JuspayControllerImpl$awaitSdkState$2", f = "JuspayControllerImpl.kt", l = {622}, m = "invokeSuspend", v = 1)
final class JuspayControllerImpl$awaitSdkState$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super JuspayControllerImpl.SdkReadiness>, Object> {
    final /* synthetic */ JuspaySdkAdapter $adapter;
    final /* synthetic */ JuspayControllerImpl.SdkReadiness $waitFor;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ JuspayControllerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JuspayControllerImpl$awaitSdkState$2(JuspayControllerImpl juspayControllerImpl, JuspaySdkAdapter juspaySdkAdapter, JuspayControllerImpl.SdkReadiness sdkReadiness, Continuation continuation) {
        super(2, continuation);
        this.this$0 = juspayControllerImpl;
        this.$adapter = juspaySdkAdapter;
        this.$waitFor = sdkReadiness;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        JuspayControllerImpl$awaitSdkState$2 juspayControllerImpl$awaitSdkState$2 = new JuspayControllerImpl$awaitSdkState$2(this.this$0, this.$adapter, this.$waitFor, continuation);
        juspayControllerImpl$awaitSdkState$2.L$0 = obj;
        return juspayControllerImpl$awaitSdkState$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((JuspayControllerImpl$awaitSdkState$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            coroutineScope = (CoroutineScope) this.L$0;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.b(obj);
        }
        while (CoroutineScopeKt.e(coroutineScope)) {
            JuspayControllerImpl juspayControllerImpl = this.this$0;
            JuspaySdkAdapter juspaySdkAdapter = this.$adapter;
            juspayControllerImpl.getClass();
            JuspayControllerImpl.SdkReadiness sdkReadinessY = JuspayControllerImpl.y(juspaySdkAdapter);
            if (sdkReadinessY.equals(this.$waitFor)) {
                return sdkReadinessY;
            }
            this.L$0 = coroutineScope;
            this.label = 1;
            if (DelayKt.b(500L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        JuspayControllerImpl juspayControllerImpl2 = this.this$0;
        JuspaySdkAdapter juspaySdkAdapter2 = this.$adapter;
        juspayControllerImpl2.getClass();
        return JuspayControllerImpl.y(juspaySdkAdapter2);
    }
}
