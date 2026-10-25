package app.chalo.userprofile.domain;

import app.chalo.login.data.repository.LoginRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.userprofile.domain.LogoutUserUseCase$invoke$2", f = "LogoutUserUseCase.kt", l = {55}, m = "invokeSuspend", v = 1)
final class LogoutUserUseCase$invoke$2 extends SuspendLambda implements Function1<Continuation<? super Boolean>, Object> {
    int label;
    final /* synthetic */ LogoutUserUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogoutUserUseCase$invoke$2(LogoutUserUseCase logoutUserUseCase, Continuation continuation) {
        super(1, continuation);
        this.this$0 = logoutUserUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LogoutUserUseCase$invoke$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((LogoutUserUseCase$invoke$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
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
        LogoutUserUseCase logoutUserUseCase = this.this$0;
        LoginRepository loginRepository = logoutUserUseCase.d;
        String deviceId = logoutUserUseCase.g.getDeviceId();
        this.label = 1;
        Object objK = loginRepository.k(deviceId, this);
        return objK == coroutineSingletons ? coroutineSingletons : objK;
    }
}
