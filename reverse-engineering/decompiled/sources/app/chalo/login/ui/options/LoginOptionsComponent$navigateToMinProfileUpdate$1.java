package app.chalo.login.ui.options;

import app.chalo.resultstatemanager.ResultStateData;
import defpackage.vf0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.login.ui.options.LoginOptionsComponent$navigateToMinProfileUpdate$1", f = "LoginOptionsComponent.kt", l = {784}, m = "invokeSuspend", v = 1)
final class LoginOptionsComponent$navigateToMinProfileUpdate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $requestId;
    int label;
    final /* synthetic */ LoginOptionsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginOptionsComponent$navigateToMinProfileUpdate$1(LoginOptionsComponent loginOptionsComponent, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = loginOptionsComponent;
        this.$requestId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LoginOptionsComponent$navigateToMinProfileUpdate$1(this.this$0, this.$requestId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LoginOptionsComponent$navigateToMinProfileUpdate$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            LoginOptionsComponent loginOptionsComponent = this.this$0;
            Flow flowB = loginOptionsComponent.F.b(this.$requestId);
            this.label = 1;
            obj = loginOptionsComponent.b.v(flowB, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        ResultStateData resultStateData = (ResultStateData) obj;
        LoginOptionsComponent loginOptionsComponent2 = this.this$0;
        if (!(resultStateData instanceof ResultStateData.Cancelled) && !(resultStateData instanceof ResultStateData.Success)) {
            loginOptionsComponent2.getClass();
            throw new NoWhenBranchMatchedException();
        }
        loginOptionsComponent2.getClass();
        loginOptionsComponent2.q0(new vf0(loginOptionsComponent2, 2));
        return Unit.f17538a;
    }
}
