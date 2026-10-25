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

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lapp/chalo/juspay/JuspayUpiSessionState;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.juspay.JuspayControllerImpl$fetchUpiSession$attempt$1$2", f = "JuspayControllerImpl.kt", l = {384}, m = "invokeSuspend", v = 1)
final class JuspayControllerImpl$fetchUpiSession$attempt$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super JuspayUpiSessionState>, Object> {
    final /* synthetic */ JuspaySdkAdapter $adapter;
    final /* synthetic */ JuspayInitiateConditions $conditionSnapshot;
    final /* synthetic */ String $source;
    int label;
    final /* synthetic */ JuspayControllerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JuspayControllerImpl$fetchUpiSession$attempt$1$2(JuspayControllerImpl juspayControllerImpl, JuspaySdkAdapter juspaySdkAdapter, JuspayInitiateConditions juspayInitiateConditions, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = juspayControllerImpl;
        this.$adapter = juspaySdkAdapter;
        this.$conditionSnapshot = juspayInitiateConditions;
        this.$source = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new JuspayControllerImpl$fetchUpiSession$attempt$1$2(this.this$0, this.$adapter, this.$conditionSnapshot, this.$source, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((JuspayControllerImpl$fetchUpiSession$attempt$1$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        JuspayControllerImpl juspayControllerImpl = this.this$0;
        JuspaySdkAdapter juspaySdkAdapter = this.$adapter;
        JuspayInitiateConditions juspayInitiateConditions = this.$conditionSnapshot;
        String str = this.$source;
        this.label = 1;
        Object objJ = JuspayControllerImpl.j(juspayControllerImpl, juspaySdkAdapter, juspayInitiateConditions, str, this);
        return objJ == coroutineSingletons ? coroutineSingletons : objJ;
    }
}
