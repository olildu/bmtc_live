package app.chalo.notification.core;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.notification.core.GCMReceiverImpl$initialise$1", f = "GCMReceiverImpl.kt", l = {151, 155}, m = "invokeSuspend", v = 1)
final class GCMReceiverImpl$initialise$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ GCMReceiverImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GCMReceiverImpl$initialise$1(GCMReceiverImpl gCMReceiverImpl, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gCMReceiverImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GCMReceiverImpl$initialise$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((GCMReceiverImpl$initialise$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i != 0) {
            if (i == 1) {
                ResultKt.b(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
        }
        ResultKt.b(obj);
        GCMReceiverImpl$initialise$1$token$1 gCMReceiverImpl$initialise$1$token$1 = new GCMReceiverImpl$initialise$1$token$1(this.this$0, null);
        this.label = 1;
        obj = TimeoutKt.c(5000L, gCMReceiverImpl$initialise$1$token$1, this);
        if (obj != coroutineSingletons) {
        }
        String str = (String) obj;
        if (str != null) {
            MutableStateFlow mutableStateFlow = this.this$0.j;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.c(value, str));
        }
        GCMReceiverDelegate gCMReceiverDelegate = this.this$0.f6525a;
        this.label = 2;
        return unit == coroutineSingletons ? coroutineSingletons : unit;
    }
}
