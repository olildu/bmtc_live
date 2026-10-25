package app.chalo.login.ui.otp;

import app.chalo.resultstatemanager.ResultStateData;
import defpackage.yf0;
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
@DebugMetadata(c = "app.chalo.login.ui.otp.LoginOtpEnterComponent$navigateToMinProfileUpdate$1", f = "LoginOtpEnterComponent.kt", l = {571}, m = "invokeSuspend", v = 1)
final class LoginOtpEnterComponent$navigateToMinProfileUpdate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $requestId;
    int label;
    final /* synthetic */ LoginOtpEnterComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginOtpEnterComponent$navigateToMinProfileUpdate$1(LoginOtpEnterComponent loginOtpEnterComponent, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = loginOtpEnterComponent;
        this.$requestId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LoginOtpEnterComponent$navigateToMinProfileUpdate$1(this.this$0, this.$requestId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LoginOtpEnterComponent$navigateToMinProfileUpdate$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            LoginOtpEnterComponent loginOtpEnterComponent = this.this$0;
            Flow flowB = loginOtpEnterComponent.w.b(this.$requestId);
            this.label = 1;
            obj = loginOtpEnterComponent.b.v(flowB, this);
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
        LoginOtpEnterComponent loginOtpEnterComponent2 = this.this$0;
        if (!(resultStateData instanceof ResultStateData.Cancelled) && !(resultStateData instanceof ResultStateData.Success)) {
            loginOtpEnterComponent2.getClass();
            throw new NoWhenBranchMatchedException();
        }
        loginOtpEnterComponent2.getClass();
        loginOtpEnterComponent2.q0(new yf0(loginOtpEnterComponent2, 1));
        return Unit.f17538a;
    }
}
