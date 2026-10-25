package app.chalo.juspay;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "Lapp/chalo/juspay/JuspayInitiateConditions;", "cityName", "", "userId"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.juspay.JuspayControllerImpl$conditionsFlow$3", f = "JuspayControllerImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class JuspayControllerImpl$conditionsFlow$3 extends SuspendLambda implements Function3<String, String, Continuation<? super JuspayInitiateConditions>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        JuspayControllerImpl$conditionsFlow$3 juspayControllerImpl$conditionsFlow$3 = new JuspayControllerImpl$conditionsFlow$3(3, (Continuation) obj3);
        juspayControllerImpl$conditionsFlow$3.L$0 = (String) obj;
        juspayControllerImpl$conditionsFlow$3.L$1 = (String) obj2;
        return juspayControllerImpl$conditionsFlow$3.invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        return new JuspayInitiateConditions((String) this.L$0, (String) this.L$1);
    }
}
