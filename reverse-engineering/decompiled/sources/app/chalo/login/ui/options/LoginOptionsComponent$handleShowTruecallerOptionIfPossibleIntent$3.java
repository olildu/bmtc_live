package app.chalo.login.ui.options;

import app.chalo.login.domain.GenerateUidForTruecallerLoginUseCase;
import app.chalo.login.truecaller.TruecallerSetupHandler;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.kf0;
import defpackage.yg;
import kotlin.Lazy;
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

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.login.ui.options.LoginOptionsComponent$handleShowTruecallerOptionIfPossibleIntent$3", f = "LoginOptionsComponent.kt", l = {331}, m = "invokeSuspend", v = 1)
final class LoginOptionsComponent$handleShowTruecallerOptionIfPossibleIntent$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ LoginOptionsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginOptionsComponent$handleShowTruecallerOptionIfPossibleIntent$3(LoginOptionsComponent loginOptionsComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = loginOptionsComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LoginOptionsComponent$handleShowTruecallerOptionIfPossibleIntent$3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LoginOptionsComponent$handleShowTruecallerOptionIfPossibleIntent$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            GenerateUidForTruecallerLoginUseCase generateUidForTruecallerLoginUseCase = this.this$0.m;
            this.label = 1;
            obj = generateUidForTruecallerLoginUseCase.a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) obj;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
            this.this$0.R0("login truecaller uid fetch failed", null);
            this.this$0.r0(LoginOptionsSideEffect.BringFocusOnPhoneNumberField.f5317a);
            this.this$0.E0(new kf0(22));
        } else {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            this.this$0.R0("truecaller bottomsheet rendered for login", null);
            Lazy lazy = this.this$0.l.f5296a;
            TruecallerSetupHandler truecallerSetupHandler = lazy != null ? (TruecallerSetupHandler) lazy.getValue() : null;
            if (truecallerSetupHandler != null) {
                truecallerSetupHandler.y((String) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a);
            }
            this.this$0.E0(new yg((ChaloUseCaseResult.Success) chaloUseCaseResult, 10));
        }
        return Unit.f17538a;
    }
}
