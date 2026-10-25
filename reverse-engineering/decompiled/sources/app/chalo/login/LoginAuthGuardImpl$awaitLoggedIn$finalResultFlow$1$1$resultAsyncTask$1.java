package app.chalo.login;

import app.chalo.resultstatemanager.ResultStateData;
import app.chalo.resultstatemanager.ResultStateDataCollector;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lapp/chalo/resultstatemanager/ResultStateData;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.login.LoginAuthGuardImpl$awaitLoggedIn$finalResultFlow$1$1$resultAsyncTask$1", f = "LoginAuthGuardImpl.kt", l = {60}, m = "invokeSuspend", v = 1)
final class LoginAuthGuardImpl$awaitLoggedIn$finalResultFlow$1$1$resultAsyncTask$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResultStateData<Unit>>, Object> {
    final /* synthetic */ Flow<Unit> $resultDataFlow;
    final /* synthetic */ ResultStateDataCollector $resultStateCollector;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginAuthGuardImpl$awaitLoggedIn$finalResultFlow$1$1$resultAsyncTask$1(ResultStateDataCollector resultStateDataCollector, Flow flow, Continuation continuation) {
        super(2, continuation);
        this.$resultStateCollector = resultStateDataCollector;
        this.$resultDataFlow = flow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LoginAuthGuardImpl$awaitLoggedIn$finalResultFlow$1$1$resultAsyncTask$1(this.$resultStateCollector, this.$resultDataFlow, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LoginAuthGuardImpl$awaitLoggedIn$finalResultFlow$1$1$resultAsyncTask$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            ResultStateDataCollector resultStateDataCollector = this.$resultStateCollector;
            Flow<Unit> flow = this.$resultDataFlow;
            this.label = 1;
            obj = resultStateDataCollector.v(flow, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return (ResultStateData) obj;
    }
}
