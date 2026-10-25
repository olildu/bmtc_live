package app.chalo.juspay;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lapp/chalo/juspay/JuspayInitiateConditions;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.juspay.JuspayControllerImpl$conditionsFlow$4", f = "JuspayControllerImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class JuspayControllerImpl$conditionsFlow$4 extends SuspendLambda implements Function2<JuspayInitiateConditions, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        JuspayControllerImpl$conditionsFlow$4 juspayControllerImpl$conditionsFlow$4 = new JuspayControllerImpl$conditionsFlow$4(2, continuation);
        juspayControllerImpl$conditionsFlow$4.L$0 = obj;
        return juspayControllerImpl$conditionsFlow$4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        JuspayControllerImpl$conditionsFlow$4 juspayControllerImpl$conditionsFlow$4 = (JuspayControllerImpl$conditionsFlow$4) create((JuspayInitiateConditions) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        juspayControllerImpl$conditionsFlow$4.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        String message = "conditions changed: " + ((JuspayInitiateConditions) this.L$0);
        Intrinsics.i(message, "message");
        return Unit.f17538a;
    }
}
