package app.chalo.login.ui.otp;

import app.chalo.login.smsautoread.SMSStatus;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.login.ui.otp.LoginOtpEnterComponent$handleOnActiveIntent$1", f = "LoginOtpEnterComponent.kt", l = {668}, m = "invokeSuspend", v = 1)
final class LoginOtpEnterComponent$handleOnActiveIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ LoginOtpEnterComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginOtpEnterComponent$handleOnActiveIntent$1(LoginOtpEnterComponent loginOtpEnterComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = loginOtpEnterComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LoginOtpEnterComponent$handleOnActiveIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LoginOtpEnterComponent$handleOnActiveIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1B = this.this$0.t.b();
            final LoginOtpEnterComponent loginOtpEnterComponent = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.login.ui.otp.LoginOtpEnterComponent$handleOnActiveIntent$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    SMSStatus sMSStatus = (SMSStatus) obj2;
                    boolean z = sMSStatus instanceof SMSStatus.Success;
                    LoginOtpEnterComponent loginOtpEnterComponent2 = loginOtpEnterComponent;
                    if (z) {
                        loginOtpEnterComponent2.O0(new LoginOtpEnterIntent.OnOtpSMSReadSuccessfully(((SMSStatus.Success) sMSStatus).f5287a));
                    } else if (Intrinsics.d(sMSStatus, SMSStatus.Timeout.f5288a)) {
                        loginOtpEnterComponent2.t.a();
                    } else if (!Intrinsics.d(sMSStatus, SMSStatus.Unknown.f5289a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return Unit.f17538a;
                }
            };
            this.label = 1;
            if (flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1B.collect(flowCollector, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f17538a;
    }
}
