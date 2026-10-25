package app.chalo.login.ui.options;

import app.chalo.constants.Source;
import app.chalo.data.PostLoginNavigationTarget;
import app.chalo.login.domain.ResolvePostLoginNavigationTargetUseCase;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.utils.KUUID;
import app.chalo.utils.PlatformFeature;
import defpackage.cy;
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
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.login.ui.options.LoginOptionsComponent$navigatePostLogin$1", f = "LoginOptionsComponent.kt", l = {742}, m = "invokeSuspend", v = 1)
final class LoginOptionsComponent$navigatePostLogin$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ LoginOptionsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginOptionsComponent$navigatePostLogin$1(LoginOptionsComponent loginOptionsComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = loginOptionsComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LoginOptionsComponent$navigatePostLogin$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LoginOptionsComponent$navigatePostLogin$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        PostLoginNavigationTarget.Home home = PostLoginNavigationTarget.Home.f2373a;
        int i2 = 1;
        if (i == 0) {
            ResultKt.b(obj);
            LoginOptionsComponent loginOptionsComponent = this.this$0;
            ResolvePostLoginNavigationTargetUseCase resolvePostLoginNavigationTargetUseCase = loginOptionsComponent.H;
            Source source = Source.LOGIN_OPTIONS_SCREEN;
            boolean z = loginOptionsComponent.k.c;
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
        this.this$0.I.a(postLoginNavigationTarget, Source.LOGIN_OPTIONS_SCREEN);
        if ((postLoginNavigationTarget instanceof PostLoginNavigationTarget.CitySelection) || postLoginNavigationTarget.equals(PostLoginNavigationTarget.OnboardingResolutionFailed.f2375a)) {
            LoginOptionsComponent loginOptionsComponent2 = this.this$0;
            loginOptionsComponent2.getClass();
            loginOptionsComponent2.q0(new vf0(loginOptionsComponent2, 2));
        } else if (postLoginNavigationTarget.equals(PostLoginNavigationTarget.MinProfileUpdate.f2374a)) {
            LoginOptionsComponent loginOptionsComponent3 = this.this$0;
            Job job = loginOptionsComponent3.P;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
            String strA = KUUID.a();
            loginOptionsComponent3.P = BuildersKt.d(loginOptionsComponent3.j, null, null, new LoginOptionsComponent$navigateToMinProfileUpdate$1(loginOptionsComponent3, strA, null), 3);
            loginOptionsComponent3.q0(new cy(29, loginOptionsComponent3, strA));
        } else if (postLoginNavigationTarget.equals(home)) {
            LoginOptionsComponent loginOptionsComponent4 = this.this$0;
            loginOptionsComponent4.getClass();
            loginOptionsComponent4.q0(new vf0(loginOptionsComponent4, 9));
        } else {
            if (!postLoginNavigationTarget.equals(PostLoginNavigationTarget.GoBack.f2372a)) {
                throw new NoWhenBranchMatchedException();
            }
            LoginOptionsComponent loginOptionsComponent5 = this.this$0;
            loginOptionsComponent5.getClass();
            loginOptionsComponent5.q0(new vf0(loginOptionsComponent5, i2));
        }
        return Unit.f17538a;
    }
}
