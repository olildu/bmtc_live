package app.chalo.login.ui.otp;

import app.chalo.constants.Source;
import app.chalo.data.PostLoginNavigationTarget;
import app.chalo.login.domain.ResolvePostLoginNavigationTargetUseCase;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.utils.KUUID;
import app.chalo.utils.PlatformFeature;
import defpackage.yf0;
import defpackage.zf0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.login.ui.otp.LoginOtpEnterComponent$navigatePostLogin$1", f = "LoginOtpEnterComponent.kt", l = {529}, m = "invokeSuspend", v = 1)
final class LoginOtpEnterComponent$navigatePostLogin$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ LoginOtpEnterComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginOtpEnterComponent$navigatePostLogin$1(LoginOtpEnterComponent loginOtpEnterComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = loginOtpEnterComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LoginOtpEnterComponent$navigatePostLogin$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LoginOtpEnterComponent$navigatePostLogin$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        PostLoginNavigationTarget.Home home = PostLoginNavigationTarget.Home.f2373a;
        int i2 = 1;
        if (i == 0) {
            ResultKt.b(obj);
            LoginOtpEnterComponent loginOtpEnterComponent = this.this$0;
            ResolvePostLoginNavigationTargetUseCase resolvePostLoginNavigationTargetUseCase = loginOtpEnterComponent.B;
            Source source = Source.LOGIN_OTP_SCREEN;
            boolean z = loginOtpEnterComponent.k.f;
            this.label = 1;
            if (((CityAppModel) resolvePostLoginNavigationTargetUseCase.f5246a.getE().getValue()) == null) {
                obj = resolvePostLoginNavigationTargetUseCase.a(source, this);
            } else {
                float f = PlatformFeature.f10436a;
                obj = home;
            }
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        PostLoginNavigationTarget postLoginNavigationTarget = (PostLoginNavigationTarget) obj;
        this.this$0.C.a(postLoginNavigationTarget, Source.LOGIN_OTP_SCREEN);
        if ((postLoginNavigationTarget instanceof PostLoginNavigationTarget.CitySelection) || postLoginNavigationTarget.equals(PostLoginNavigationTarget.OnboardingResolutionFailed.f2375a)) {
            LoginOtpEnterComponent loginOtpEnterComponent2 = this.this$0;
            loginOtpEnterComponent2.getClass();
            loginOtpEnterComponent2.q0(new yf0(loginOtpEnterComponent2, i2));
        } else if (postLoginNavigationTarget.equals(PostLoginNavigationTarget.MinProfileUpdate.f2374a)) {
            LoginOtpEnterComponent loginOtpEnterComponent3 = this.this$0;
            Job job = loginOtpEnterComponent3.H;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
            String strA = KUUID.a();
            loginOtpEnterComponent3.H = BuildersKt.d(loginOtpEnterComponent3.j, null, null, new LoginOtpEnterComponent$navigateToMinProfileUpdate$1(loginOtpEnterComponent3, strA, null), 3);
            loginOtpEnterComponent3.q0(new zf0(0, loginOtpEnterComponent3, strA));
        } else if (postLoginNavigationTarget.equals(home)) {
            LoginOtpEnterComponent loginOtpEnterComponent4 = this.this$0;
            loginOtpEnterComponent4.getClass();
            loginOtpEnterComponent4.q0(new yf0(loginOtpEnterComponent4, 4));
        } else {
            if (!postLoginNavigationTarget.equals(PostLoginNavigationTarget.GoBack.f2372a)) {
                throw new NoWhenBranchMatchedException();
            }
            LoginOtpEnterComponent loginOtpEnterComponent5 = this.this$0;
            loginOtpEnterComponent5.getClass();
            loginOtpEnterComponent5.q0(new yf0(loginOtpEnterComponent5, 2));
        }
        return Unit.f17538a;
    }
}
