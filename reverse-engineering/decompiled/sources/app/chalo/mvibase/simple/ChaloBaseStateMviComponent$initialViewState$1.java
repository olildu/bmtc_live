package app.chalo.mvibase.simple;

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
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u0003H\n"}, d2 = {"<anonymous>", "ViewState", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.mvibase.simple.ChaloBaseStateMviComponent$initialViewState$1", f = "ChaloBaseStateMviComponent.kt", l = {127}, m = "invokeSuspend", v = 1)
final class ChaloBaseStateMviComponent$initialViewState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<Object>, Object> {
    int label;
    final /* synthetic */ ChaloBaseStateMviComponent<Object, Object, Object, Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloBaseStateMviComponent$initialViewState$1(ChaloBaseStateMviComponent chaloBaseStateMviComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = chaloBaseStateMviComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChaloBaseStateMviComponent$initialViewState$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloBaseStateMviComponent$initialViewState$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
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
        ChaloBaseStateMviComponent<Object, Object, Object, Object> chaloBaseStateMviComponent = this.this$0;
        Object objU0 = chaloBaseStateMviComponent.u0();
        this.label = 1;
        Object objP0 = chaloBaseStateMviComponent.p0(objU0, this);
        return objP0 == coroutineSingletons ? coroutineSingletons : objP0;
    }
}
